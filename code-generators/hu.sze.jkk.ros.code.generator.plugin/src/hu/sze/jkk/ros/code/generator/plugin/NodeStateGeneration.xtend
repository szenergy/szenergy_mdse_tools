package hu.sze.jkk.ros.code.generator.plugin

import java.util.Collection
import hu.sze.jkk.ros.code.generator.pim.model.roscodegenerator.ROSMsg
import hu.sze.jkk.ros.code.generator.pim.model.roscodegenerator.ROSNode
import hu.sze.jkk.ros.code.generator.pim.model.roscodegenerator.TopicReceive
import hu.sze.jkk.ros.code.generator.pim.model.roscodegenerator.MIMOState
import hu.sze.jkk.ros.code.generator.pim.model.roscodegenerator.TopicUpdate

class NodeStateGeneration extends NamingConvention {
	static def generateAbstractStateHeader(ROSNode node, Collection<ROSMsg> msgs)'''
		#ifndef «node.name.toUpperCase»_ABSTRACT_STATE_GEN_HPP
		#define «node.name.toUpperCase»_ABSTRACT_STATE_GEN_HPP
		/// Generated: Standard headers
		#include <memory>
		///
		/// Generated: Abstract nodes from library
		#include <szenergy_node_architecture/node_abstract_classes.h>
		
		///
		/// Generated: ROS msgs
		«FOR ROSMsg msg: msgs»
			#include <«msg.prefix»/«msg.name».h>
		«ENDFOR»
		«FOR MIMOState state: node.state»
			class «rosStateStructName(state)»Abstract: public szenergy::AbstractNodeState
			{
			private:
			protected:
			  «FOR TopicReceive receive: state.input»
			  	«receive.rostopic.rosmsg.prefix»::«receive.rostopic.rosmsg.name» «rosReceiveNameStateField(receive)»;
			  	«FOR i: 0..<state.order_past»
			  		«receive.rostopic.rosmsg.prefix»::«receive.rostopic.rosmsg.name» «rosReceiveNameStateField(receive)»_tm«i+1»;
			  	«ENDFOR»
			  «ENDFOR»
			  «FOR TopicUpdate update: state.output»
			  	«update.producesTo.rosmsg.prefix»::«update.producesTo.rosmsg.name» «update.producesTo.topic_name»_msg;
			  	«FOR i: 0..<state.order_past»
			  		«update.producesTo.rosmsg.prefix»::«update.producesTo.rosmsg.name» «update.producesTo.topic_name»_msg_tm«i+1»;
			  	«ENDFOR»
			  «ENDFOR»
			  friend class «rosAbstractNodeClassName(node)»;
			  «FOR TopicUpdate update: state.output»
			  virtual void transform_«update.producesTo.topic_name»() = 0;
			  «ENDFOR»
			public:
			  virtual void handlingDanger() = 0;
			  virtual void transformFunc()
			  {
			  	
			  	 «FOR TopicUpdate update: state.output»
			  	 	«IF update.frequency == 0.0»
			  	 		transform_«update.producesTo.topic_name»();
			  	 	«ENDIF»
			  	«ENDFOR»
			  	«IF state.order_past > 0 || state.order_future > 0»
			  		updatePastStates();
			  	«ENDIF»
			  }
			  
			  virtual void updatePastStates()
			  {
			  	/// Overwrite past states
			  	«FOR TopicReceive sub: state.input»
			  		«FOR i: 0..<state.order_past»
			  			«sub.rostopic.topic_name»_msg_tm«i+1» = «sub.rostopic.topic_name»_msg;
			  		«ENDFOR»
			  	«ENDFOR»
			  	}
			};
		«ENDFOR»
		#endif
	'''
	
	def static generateStateImplementationSkeleton(ROSNode node)'''
		#include "teb_local_planner_state.abs.hpp"
		
		«FOR MIMOState state: node.state»
			class «rosStateStructName(state)»: public «rosStateStructName(state)»Abstract
			{
			private:
			  friend class «rosImplementationClassName(node)»;
			protected:
			  «FOR TopicUpdate update: state.output»
			  	virtual void transform_«update.producesTo.topic_name»();
			  «ENDFOR»
			public:
			  virtual void handlingDanger();
			};
		«ENDFOR»
	'''
}
