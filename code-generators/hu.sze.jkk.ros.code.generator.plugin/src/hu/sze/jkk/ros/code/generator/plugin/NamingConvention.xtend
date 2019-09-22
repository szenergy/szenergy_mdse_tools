package hu.sze.jkk.ros.code.generator.plugin

import hu.sze.jkk.ros.code.generator.pim.model.roscodegenerator.ROSNode
import hu.sze.jkk.ros.code.generator.pim.model.roscodegenerator.ROSTopic
import hu.sze.jkk.ros.code.generator.pim.model.roscodegenerator.TopicReceive
import hu.sze.jkk.ros.code.generator.pim.model.roscodegenerator.TopicUpdate
import hu.sze.jkk.ros.code.generator.pim.model.roscodegenerator.MIMOState

class NamingConvention {
	/// Topic variable convention	
	def static rosTopicName(ROSTopic rostopic)'''«rostopic.topic_name.toLowerCase.replaceAll("[^A-Za-z_]","")»'''
	def static rosNodeName(ROSNode node)'''«node.name.toFirstUpper.replaceAll("[^A-Za-z]","")»'''
	/// Derived naming
	def static rosSubscriberName(TopicReceive sub)'''sub_«rosTopicName(sub.rostopic)»'''
	def static rosPublisherName(TopicUpdate pub)'''pub_«rosTopicName(pub.producesTo)»'''
	def static rosCallbackName(TopicReceive sub)'''cb«rosTopicName(sub.rostopic)»'''
	def static rosAbstractNodeClassName(ROSNode node)'''«rosNodeName(node)»Abstract'''
	def static rosImplementationClassName(ROSNode node)'''«rosNodeName(node)»Impl'''
	def static rosStateStructName(MIMOState state)'''«state.name.toFirstUpper.replaceAll("[^A-Za-z]","")»State'''
	def static rosPublisherStateMachineName(TopicUpdate pub)'''«rosPublisherName(pub)»_port_sm'''
	def static rosSubscriberStateMachineName(TopicReceive sub)'''«rosSubscriberName(sub)»_port_sm'''
	def static rosReceiveNameStateField(TopicReceive receive)'''«rosTopicName(receive.rostopic)»_msg'''
	def static rosCallbackWorkerFunctionname(TopicReceive sub)'''func«rosTopicName(sub.rostopic)»'''
	/// State machine related
	def static eventNaming(String id)'''event«id.replaceAll("[^A-Za-z]","").toFirstUpper»'''
}
