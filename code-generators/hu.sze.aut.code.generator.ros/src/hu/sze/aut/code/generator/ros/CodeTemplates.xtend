package hu.sze.aut.code.generator.ros

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Node
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Topic
import java.util.Map
import java.util.List
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.OutputPort
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort
import java.util.HashSet
import java.util.Set
import hu.sze.aut.ros.network.model.rosnetworkmodel.RosMsg

class RosCodeTemplates {
	def static classNameInterfaceRos(Node node)'''InterfaceRos_«node.name.toFirstUpper.replace('_','')»'''
	def static headerFileName(Node node)'''interfaceros_«node.name.toLowerCase».h'''
	def static convertMsgDefToCppNamespace(String type){
		return type.replace('/', "::")
	}
	
	def static getMsgInclude(RosMsg msg)'''#include <«msg.package.name»/«msg.name».h>'''
	def static getMsgNamespace(RosMsg msg)'''«msg.package.name»::«msg.name»'''
	
	def static getMsgTypes(List<InputPort> inputPorts, List<OutputPort> outputPorts,
		Map<Topic, hu.sze.aut.ros.network.model.rosnetworkmodel.Topic> topicMappings
	){
		val Set<RosMsg> msg_types = new HashSet;
		for (port: inputPorts){
			msg_types.add(topicMappings.get(port.topic).rosmsg)
		}
		for (port: outputPorts){
			msg_types.add(topicMappings.get(port.topic).rosmsg)
		}
		return msg_types
	}
	
	def static generateRosInterfaceHeader(Node node,
		List<InputPort> inputPorts, List<OutputPort> outputPorts,
		Map<Topic, hu.sze.aut.ros.network.model.rosnetworkmodel.Topic> topicMappings)'''
		#ifndef «node.name.toUpperCase»_HEADER_HPP
		#define «node.name.toUpperCase»_HEADER_HPP
		
		#include <ros/ros.h>
		/// ROS msgs
		«FOR m: getMsgTypes(inputPorts, outputPorts, topicMappings)»
		«getMsgInclude(m)»		
		«ENDFOR»
		«IF node.continousstate.size > 0»
		#include <rei_statemachine_library/ros/ros_sync_state_machine.hpp>
		«ENDIF»
		
		#include <memory>
		
		«IF node.namespace!==null»
		namespace «node.namespace» {
		«ENDIF»
		
		struct State«node.name.toFirstUpper.replace('_', '')»
		{
			«FOR port: inputPorts»
			«getMsgNamespace(topicMappings.get(port.topic).rosmsg)» msg_«port.id.toFirstLower»; ///< «port.id» store to «getMsgNamespace(topicMappings.get(port.topic).rosmsg)»
			«ENDFOR»
			/// ROS Publishers
			«FOR port: outputPorts»
			«getMsgNamespace(topicMappings.get(port.topic).rosmsg)» msg_«port.id.toFirstLower»; ///< «port.id» store to «getMsgNamespace(topicMappings.get(port.topic).rosmsg)»
			«ENDFOR»
		};
		
		/**
		 *
		 «FOR port: inputPorts»
		 * @attribute «port.id»: subscribes to topic «port.topic.topic_name» 
		 «ENDFOR»
		 «FOR port: outputPorts»
		 * @attribute «port.id»: publishes to topic «port.topic.topic_name»
		 «ENDFOR»
		 */
		class «classNameInterfaceRos(node)»
		{
		private:
		protected:
			/// ROS utils
			std::shared_ptr<ros::NodeHandle> nh;
			/// ROS Subscribers
			«FOR port: inputPorts»
			ros::Subscriber «port.id.toFirstLower»; ///< «port.id» subscriber to «getMsgNamespace(topicMappings.get(port.topic).rosmsg)»
			«ENDFOR»
			/// ROS Publishers
			«FOR port: outputPorts»
			ros::Publisher «port.id.toFirstLower»; ///< «port.id» publisher to «getMsgNamespace(topicMappings.get(port.topic).rosmsg)»
			«ENDFOR»
			std::unique_ptr<State«node.name.toFirstUpper.replace('_', '')»> pubsubstate;
			// State machines
			«FOR state: node.continousstate»
			std::shared_ptr<rei::RosSyncStateMachine> sync_sm_«state.name.toLowerCase»;
			«ENDFOR»
		public:
			«classNameInterfaceRos(node)»(std::shared_ptr<ros::NodeHandle> nh): nh(nh){}
			
			virtual ~«classNameInterfaceRos(node)»() = 0;
			/*
			 * @brief: Initializes ROS middleware connection (pub/sub) interfaces
			 * @returns: Initialization successful
			 */
			bool init();
			/*
			 * @brief: descendant specific initialization 
			 */
			virtual bool initNode() = 0;
			
			«FOR port: inputPorts»
			/**
			 * Callback method for «port.topic.topic_name»
			 */
			void cb«port.id.toFirstUpper»(const «getMsgNamespace(topicMappings.get(port.topic).rosmsg)»::ConstPtr& msg); ///< «port.id» subscriber to «getMsgNamespace(topicMappings.get(port.topic).rosmsg)»
			«IF port.sync_function_name!==null»
			virtual void execute«port.sync_function_name.toFirstUpper»() = 0;
			«ENDIF»
			«ENDFOR»
			
			«FOR port: outputPorts»
			/**
			 * Publish method to publish message to «port.topic.topic_name»
			 */
			void publish«port.topic.topic_name.toFirstUpper»();
			«ENDFOR»
		};
		
		«IF node.namespace!==null»
		}
		«ENDIF»
		
		#endif
		'''
		
	def static generateInterfaceRosSource(Node node,
		List<InputPort> inputPorts, List<OutputPort> outputPorts,
		Map<Topic, hu.sze.aut.ros.network.model.rosnetworkmodel.Topic> topicMappings)'''
		#include "gen_«headerFileName(node)»"
		
		«IF node.namespace!==null»
		namespace «node.namespace» {
		«ENDIF»
		
		«classNameInterfaceRos(node)»::~«classNameInterfaceRos(node)»() {}
		
		bool «classNameInterfaceRos(node)»::init()
		{
			// Initialize state machines 
			«FOR state: node.continousstate»
			sync_sm_«state.name.toLowerCase» = std::shared_ptr<rei::RosSyncStateMachine>(new rei::RosSyncStateMachine(nh, "«node.name»/«state.name.toLowerCase»"));
			if (sync_sm_«state.name.toLowerCase»!=nullptr){
				if (!sync_sm_«state.name.toLowerCase»->initialize())
				{
					return false;
				}
				«FOR portstate: state.synchronizeWith»
				sync_sm_«state.name.toLowerCase»->addTopicGuard("/«portstate.topic.topic_name»", «1.0/(portstate.estimated_freq as double)»);
				«ENDFOR»
			}
			else
			{
				return false;
			}
			«ENDFOR»
			/// Initialize internal pubsub state
			pubsubstate = std::unique_ptr<State«node.name.toFirstUpper.replace('_', '')»>(new State«node.name.toFirstUpper.replace('_', '')»());
			/// Initialize ROS publishers
			«FOR port: outputPorts»
			«port.id.toFirstLower» = nh->advertise<«getMsgNamespace(topicMappings.get(port.topic).rosmsg)»>("«port.topic.topic_name»", 10);
			«ENDFOR»
			/// Initialize ROS subscribers
			«FOR port: inputPorts»
			«port.id.toFirstLower» = nh->subscribe("«port.topic.topic_name»", 10, &«classNameInterfaceRos(node)»::cb«port.id.toFirstUpper», this);
			«ENDFOR»
			if (!initNode())
			{
				return false;
			}
			return true;
		}
		
		«FOR port: inputPorts»
		void «classNameInterfaceRos(node)»::cb«port.id.toFirstUpper»(const «getMsgNamespace(topicMappings.get(port.topic).rosmsg)»::ConstPtr& msg)
		{
			pubsubstate->msg_«port.id.toFirstLower» = *msg;
			«IF port.synchronizesState!==null»
			// Synchronize with state machine: sync_sm_«port.synchronizesState.name»
			sync_sm_«port.synchronizesState.name»->stepMessageTopic("/«port.topic.topic_name»", msg->header);
			«IF port.sync_function_name!==null»
			if (sync_sm_«port.synchronizesState.name»->isReady()){
				execute«port.sync_function_name.toFirstUpper»();
			}
			«ENDIF»
			«ELSE»
			«IF port.sync_function_name!==null»
			execute«port.sync_function_name.toFirstUpper»();
			«ENDIF»
			«ENDIF»
			
		}
		«ENDFOR»
		
		«FOR port: outputPorts»
		void «classNameInterfaceRos(node)»::publish«port.topic.topic_name.toFirstUpper»()
		{
			«port.id».publish(pubsubstate->msg_«port.id»);
		}
		«ENDFOR»
		
		«IF node.namespace!==null»
		}
		«ENDIF»
		'''
}