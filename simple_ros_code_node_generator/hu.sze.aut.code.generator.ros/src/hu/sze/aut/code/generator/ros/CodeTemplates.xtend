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
		// State-machine node element
		#include <rei_common/gen_node_elements/interface_simple_ros_node.hpp>
		
		#include <memory>
		
		«IF node.namespace!==null»
		namespace «node.namespace» {
		«ENDIF»
		
		struct State«node.name.toFirstUpper.replace('_', '')»
		{
			// Flags
			const bool debug;
			// ROS input messages
			«FOR port: inputPorts»
			«getMsgNamespace(topicMappings.get(port.topic).rosmsg)» msg_«port.id.toFirstLower»; ///< «port.id» store to «getMsgNamespace(topicMappings.get(port.topic).rosmsg)»
			«ENDFOR»
			/// ROS output messages
			«FOR port: outputPorts»
			«getMsgNamespace(topicMappings.get(port.topic).rosmsg)» msg_«port.id.toFirstLower»; ///< «port.id» store to «getMsgNamespace(topicMappings.get(port.topic).rosmsg)»
			«ENDFOR»
			
			State«node.name.toFirstUpper.replace('_', '')»(const bool debug): debug(debug) {}
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
		class «classNameInterfaceRos(node)»: public rei::Interface_SimpleRosNode
		{
		private:
		protected:
			/// ROS utils
			std::shared_ptr<ros::NodeHandle> private_nh;
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
			std::shared_ptr<rei::SyncStateMachine> sync_state_machine;
			std::shared_ptr<rei::PortStateMonitorRos> port_state_monitor;
			std::shared_ptr<rei::RosCommunicationGraphNotifier> notifier;
			std::shared_ptr<rei::RosSyncStateGuard> sync_guard;
			std::mutex sm_mutex;
			«ENDFOR»
			// Set ALL STATES CB
			virtual void setSyncStateMachineCallbacks() = 0;
		public:
			«classNameInterfaceRos(node)»(std::shared_ptr<ros::NodeHandle> private_nh, std::shared_ptr<ros::NodeHandle> nh): private_nh(private_nh), nh(nh) {}
			
			virtual ~«classNameInterfaceRos(node)»() = 0;
			
			/*
			 * Override steps to initialize
			 *     STEPS:
			 *           1. Initialize descendant specific functionalities before middleware functionalities (initPre())
			 *           2. Initialize timeout state machine (initTimeoutStateMachine())
			 *           3. Assign guard related to timeout functions (assigSyncGuards())
			 *           4. Initialize middleware functionalities
			 *           5. Initialize descendant node-specific functionalities
			 */
			/*
			 * @brief: Initialize node pre
			 * @returns: Initialization successful
			 */
			virtual bool initPre() = 0;
			/*
			 * @brief: Initialize timeout statemachine
			 */
			virtual bool initTimeoutStateMachine() override;
			/*
			 * @brief: Assign sync guards
			 */
			virtual bool assignSyncGuards() = 0;
			
			/*
			 * @brief: initialize middleware
			 * @param debug: defines whether the debug information should be provided or not.
			 */
			virtual bool initMiddleware(const bool debug) override;
			
			/*
			 * @brief: post initialize
			 */
			virtual bool initPost() = 0;
			
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
		#include <«node.rospackage»/gen_«headerFileName(node)»>
		
		«IF node.namespace!==null»
		namespace «node.namespace» {
		«ENDIF»
		
		«classNameInterfaceRos(node)»::~«classNameInterfaceRos(node)»() {}
		
		bool «classNameInterfaceRos(node)»::initTimeoutStateMachine()
		{
			// Initialize state machines 
			notifier = std::make_shared<rei::RosCommunicationGraphNotifier>("«node.name.toLowerCase»/sync_state/", nh);
			notifier->initialize();
			port_state_monitor= std::make_shared<rei::PortStateMonitorRos>();
			sync_guard = std::make_shared<rei::RosSyncStateGuard>();
			sync_guard->setMonitor(port_state_monitor);
			sync_state_machine = std::make_shared<rei::SyncStateMachine>(notifier, sync_guard);
			// Sync state machine initialization
			«FOR state: node.continousstate»
			sync_sm_«state.name.toLowerCase» = std::make_shared<rei::RosSyncStateMachine>(nh,
				sync_state_machine, port_state_monitor, notifier, 
				"«node.name»/«state.name.toLowerCase»");
			if (sync_sm_«state.name.toLowerCase»!=nullptr)
			{
				if (!sync_sm_«state.name.toLowerCase»->initialize())
				{
					return false;
				}
				«FOR portstate: state.synchronizeWith»
				sync_sm_«state.name.toLowerCase»->addTopicGuard("/«portstate.topic.topic_name»", «1.0/(portstate.estimated_freq as double)»+«portstate.sample_tolerance»);
				ROS_INFO("Synchronize with topic: «portstate.topic.topic_name», with estimated freq «portstate.estimated_freq» Hz");
				«ENDFOR»
			}
			else
			{
				return false;
			}
			«ENDFOR»
			return true;
		}
		
		bool «classNameInterfaceRos(node)»::initMiddleware(const bool debug)
		{
			/// Initialize internal pubsub state
			pubsubstate = std::unique_ptr<State«node.name.toFirstUpper.replace('_', '')»>(new State«node.name.toFirstUpper.replace('_', '')»(debug));
			if (pubsubstate==nullptr)
			{
				return false;
			}
			/// Initialize ROS publishers
			«FOR port: outputPorts»
			«IF port.debug»
			if (pubsubstate->debug) «port.id.toFirstLower» = nh->advertise<«getMsgNamespace(topicMappings.get(port.topic).rosmsg)»>("/debug/«node.name.toLowerCase»/«port.topic.topic_name»", 10);
			«ELSE»
			«port.id.toFirstLower» = nh->advertise<«getMsgNamespace(topicMappings.get(port.topic).rosmsg)»>("«port.topic.topic_name»", 10);
			«ENDIF»
			«ENDFOR»
			/// Initialize ROS subscribers
			«FOR port: inputPorts»
			«IF port.debug»
			if (pubsubstate->debug) «port.id.toFirstLower» = nh->subscribe("/debug/«node.name.toLowerCase»/«port.topic.topic_name»", 10, &«classNameInterfaceRos(node)»::cb«port.id.toFirstUpper», this);
			«ELSE»
			«port.id.toFirstLower» = nh->subscribe("«port.topic.topic_name»", 10, &«classNameInterfaceRos(node)»::cb«port.id.toFirstUpper», this);
			«ENDIF»
			«ENDFOR»
			return true;
		}
		
		
		
		«FOR port: inputPorts»
		void «classNameInterfaceRos(node)»::cb«port.id.toFirstUpper»(const «getMsgNamespace(topicMappings.get(port.topic).rosmsg)»::ConstPtr& msg)
		{
			pubsubstate->msg_«port.id.toFirstLower» = *msg;
			«IF port.synchronizesState!==null»
			// Synchronize with state machine: sync_sm_«port.synchronizesState.name»
			sm_mutex.lock();
			«IF port.sync_time_stamp»
			sync_sm_«port.synchronizesState.name»->stepMessageTopic("/«port.topic.topic_name»", msg->header);
			«ELSE»
			sync_sm_«port.synchronizesState.name»->stepMessageTopic("/«port.topic.topic_name»", ros::Time::now());
			«ENDIF»
			sm_mutex.unlock();
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