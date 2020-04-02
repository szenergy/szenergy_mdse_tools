package hu.sze.jkk.ros.code.generator.plugin

import java.util.Collection
import java.util.List
import java.util.ArrayList
import hu.sze.jkk.ros.code.generator.pim.model.roscodegenerator.TopicUpdate
import hu.sze.jkk.ros.code.generator.pim.model.roscodegenerator.MIMOState
import hu.sze.jkk.ros.code.generator.pim.model.roscodegenerator.TopicReceive
import hu.sze.jkk.ros.code.generator.pim.model.roscodegenerator.TriggerType
import hu.sze.jkk.ros.code.generator.pim.model.roscodegenerator.ROSNode
import hu.sze.jkk.ros.code.generator.pim.model.roscodegenerator.ROSMsg
import hu.sze.jkk.ros.code.generator.pim.model.roscodegenerator.ROSPackage

class RosNodeGeneration extends NamingConvention {
	private val static String hierarch_sm_name = "node_state_machine"
	
	def static getTriggeredPublishersOfState(MIMOState state){
		val List<TopicUpdate> topicupdate = new ArrayList();
		state.output.filter[it.frequency == 0.0].forEach[topicupdate.add(it)]
		return topicupdate;
	}
	
	def static getAllEvents(Collection<TopicReceive> receives){
		return receives.filter[it.triggertype==TriggerType::EVENT]
	}
	
	def static patternAbstractNodeHeader(ROSNode node,
		Collection<TopicReceive> receives, /// Incoming topics
		 Collection<TopicUpdate> updates, /// Outgoing topics
		Collection<ROSMsg> msgs
	)'''
		#ifndef «node.name.toUpperCase»_GEN_HPP
		#define «node.name.toUpperCase»_GEN_HPP
		
		
		///
		/// Generated: Standard headers
		#include <memory>
		
		///
		/// Genereated: ROS specific headers
		#include <ros/ros.h>
		
		///
		/// Generated: Abstract nodes from library
		#include <szenergy_node_architecture/node_abstract_classes.h>
		
		///
		/// Generated: ROS msgs
		«FOR ROSMsg msg: msgs»
			#include <«msg.prefix»/«msg.name».h>
		«ENDFOR»
		
		#include "«node.name»_state.impl.hpp"
		
		///
		/// Generated: class header	for state
		class «rosAbstractNodeClassName(node)»: public szenergy::AbstractStateNode 
		{
		private:
		  ///
		protected:
		  /// State
		  «FOR MIMOState state: node.state»
		  	std::unique_ptr<«rosStateStructName(state)»> «state.name»;
		  «ENDFOR»
		  /// Topic publishers
		  «FOR TopicUpdate pub: updates»
		  	std::shared_ptr<szenergy::PortStateMachine> «rosPublisherStateMachineName(pub)»;
		  	ros::Publisher «rosPublisherName(pub)»;
		  «ENDFOR»
		  /// Topic subscribers
		  «FOR TopicReceive sub: receives»
		  	std::shared_ptr<szenergy::PortStateMachine> «rosSubscriberStateMachineName(sub)»;
		  	ros::Subscriber «rosSubscriberName(sub)»;
		  «ENDFOR»
		public:
		  «rosAbstractNodeClassName(node)»(std::shared_ptr<ros::NodeHandle> nh, std::shared_ptr<ros::NodeHandle> private_nh): 
		    szenergy::AbstractStateNode(nh, private_nh)
		    «FOR TopicUpdate pub: updates BEFORE ',' SEPARATOR ','»
		    «rosPublisherStateMachineName(pub)»(new szenergy::PortStateMachine(«hierarch_sm_name»))
		    «ENDFOR»
		    «FOR TopicReceive sub: receives BEFORE ',' SEPARATOR ','»
		  	«rosSubscriberStateMachineName(sub)»(new szenergy::PortStateMachine(«hierarch_sm_name»))
		    «ENDFOR»
		  {
		    «FOR TopicUpdate pub: updates»
		    	pub_port_state_machines.push_back(«rosPublisherStateMachineName(pub)»);
		    «ENDFOR»
		    «FOR TopicReceive sub: receives»
		    	sub_port_state_machines.push_back(«rosSubscriberStateMachineName(sub)»);
		    «ENDFOR»
		  }
		  /// Utility functions
		  bool init();
		  /// Topic subscriber callbacks
		  «FOR TopicReceive sub: receives»
		  	/// Callback «sub.rostopic.rosmsg.name.toFirstUpper»
		  	void «rosCallbackName(sub)»(const «sub.rostopic.rosmsg.prefix»::«sub.rostopic.rosmsg.name»::ConstPtr &msg);
		  «ENDFOR»
		  /// Events
		  «FOR sub: getAllEvents(receives)»
		  virtual void «eventNaming(sub.id)»() = 0;
		  «ENDFOR»
		};
		
		#endif
	'''
	
	def static patternNodeImplementation(ROSPackage p,
		ROSNode node,
		Collection<TopicReceive> receives, /// Incoming topics
		 Collection<TopicUpdate> updates, /// Outgoing topics
		Collection<ROSMsg> msgs
	)'''
		
		///
		/// Generated: package include files
		#include <«p.name»/«node.name».abs.hpp>
		
		///
		/// Generated: ROS msgs
		«FOR ROSMsg msg: msgs»
			#include <«msg.prefix»/«msg.name».h>
		«ENDFOR»
		
		///
		/// Generated: class implementation	
		
		bool «rosAbstractNodeClassName(node)»::init()
		{
		  /// Initialize state
		  «FOR MIMOState state: node.state»
		  	«state.name»->setSyncParentStateMachine(node_state_machine);
		  	«FOR TopicReceive receiver: state.input»
		  		«IF receiver.triggertype==TriggerType::TRANSFORM»
		  			«state.name»->addSyncPortStateMachine(«rosSubscriberStateMachineName(receiver)»);
		  		«ENDIF»
		  	«ENDFOR»
		  «ENDFOR»
		  /// Initialize ros related stuff
		  /// Initialize publishers
		  «FOR TopicUpdate pub: updates»
		  	«rosPublisherName(pub)» = nh->advertise<«pub.producesTo.rosmsg.prefix»::«pub.producesTo.rosmsg.name»>("«pub.producesTo.topic_name»", 10);
		  «ENDFOR»
		  /// Initialize subscribers
		  «FOR TopicReceive sub: receives»
		  	/// Callback «sub.rostopic.rosmsg.name.toFirstUpper» initialization
		  	«rosSubscriberName(sub)» = nh->subscribe("«sub.rostopic.topic_name»", 10, &«rosAbstractNodeClassName(node)»::«rosCallbackName(sub)», this);
		  «ENDFOR»
		  if (!«hierarch_sm_name»->transitRunning())
		  {
		  	return false;
		  }
		  ROS_INFO("«node.name» initialized");
		  if (!setAllSubPortStateMachineRunning())
		  {
		  	return false;
		  }
		  return true;
		}
		
		  /// Topic subscriber callbacks
		«FOR TopicReceive sub: receives»
			/// Callback «sub.rostopic.rosmsg.name.toFirstUpper»
			void «rosAbstractNodeClassName(node)»::«rosCallbackName(sub)»(const «sub.rostopic.rosmsg.prefix»::«sub.rostopic.rosmsg.name»::ConstPtr &msg)
			{
			  if (processingAllowedOnPort(«rosSubscriberStateMachineName(sub)»))
			  {
			  	/// Updating all states
			  	«FOR MIMOState state: sub.mimostate»
			  		«state.name»->«rosTopicName(sub.rostopic)»_msg = *msg;
			  	«ENDFOR»
			  	if («rosSubscriberStateMachineName(sub)»->isWaiting())
			  	{
			  		«rosSubscriberStateMachineName(sub)»->transitRunning();
			  		ROS_INFO("Received first message on topic [«sub.rostopic.topic_name»], port is running");
			  	}
			  	if («rosSubscriberStateMachineName(sub)»->isRunning())
			  	{
			  	  /// Triggering hybrid-state transformations
			  	   «FOR MIMOState state: sub.triggerstates»
			  	   	«IF sub.triggertype==TriggerType::DANGER»
			  	   		«state.name»->transitDanger();
			  	   	«ENDIF»
			  	   	«IF getTriggeredPublishersOfState(state).size > 0 && sub.triggertype==TriggerType::TRANSFORM»
			  	   		«state.name»->transform();
			  	   		if («state.name»->synchronized())
			  	   		{
			  	   		  «FOR TopicUpdate update: getTriggeredPublishersOfState(state)»
			  	   		  	«rosPublisherName(update)».publish(«state.name»->«update.producesTo.topic_name»_msg);
			  	   		  «ENDFOR»
			  	   		}
			  	   	«ELSEIF sub.triggertype==TriggerType::EVENT»
			  	   		«eventNaming(sub.id)»();
			  	   	«ENDIF»
			  	«ENDFOR»
			  	}
			  }
			}
		«ENDFOR»
		
	'''
	
	def static patternClassImplementationSkeleton(ROSNode node, Collection<TopicReceive> receives)'''
		#ifndef «node.name.toUpperCase»_IMPL_HPP
		#define «node.name.toUpperCase»_IMPL_HPP
		
		#include "«node.name».abs.hpp"
		
		
		
		///
		/// Generated class skeleton feel free to extend it
		///
		class «rosImplementationClassName(node)» : public «rosAbstractNodeClassName(node)»
		{
		private:	  
		protected:
		public:
		  «rosImplementationClassName(node)»(std::shared_ptr<ros::NodeHandle> nh, std::shared_ptr<ros::NodeHandle> private_nh):
		  «rosAbstractNodeClassName(node)»(nh, private_nh)
		  {
		    «FOR MIMOState state: node.state»
		    	«state.name» = std::unique_ptr<«rosStateStructName(state)»>(new «rosStateStructName(state)»());
		    «ENDFOR»
		  }
		};
		#endif
	'''
	
}
