package hu.sze.jkk.ros.code.generator.plugin

import java.util.Collection
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.emf.EMFScope
import java.io.File
import java.io.PrintStream
import hu.sze.jkk.ros.code.generator.patterns.MessagesFromTopics
import hu.sze.jkk.ros.code.generator.patterns.IncomingTopic
import hu.sze.jkk.ros.code.generator.patterns.OutgoingTopic
import java.util.ArrayList
import java.nio.file.Paths
import java.nio.file.Path
import java.nio.file.Files
import hu.sze.jkk.ros.code.generator.pim.model.roscodegenerator.ROSPackage
import hu.sze.jkk.ros.code.generator.pim.model.roscodegenerator.ROSNode
import hu.sze.jkk.ros.code.generator.pim.model.roscodegenerator.ROSMsg
import hu.sze.jkk.ros.code.generator.pim.model.roscodegenerator.TopicReceive
import hu.sze.jkk.ros.code.generator.pim.model.roscodegenerator.TopicUpdate

class GenerateNodeModule extends NamingConvention {
	
	
	def static patternNodePartialImplementation()'''
	'''
	
	def static patternNodeMain(ROSPackage p, ROSNode n)'''
		#include <ros/ros.h>
		
		/// Abstract headers
		«FOR ROSNode rs: p.rosnode»
			#include <«p.name»/«rs.name».abs.hpp>
		«ENDFOR»
		/// Implementation headers
		«FOR ROSNode rs: p.rosnode»
			#include <«p.name»/«rs.name».impl.hpp>
		«ENDFOR»
		
		
		int main(int argc, char* argv[])
		{
		  ros::init(argc, argv, "«n.name»");
		  std::shared_ptr<ros::NodeHandle> nh(new ros::NodeHandle);
		  std::shared_ptr<ros::NodeHandle> private_nh(new ros::NodeHandle("~"));
		  «rosImplementationClassName(n)» node(nh, private_nh);
		  if (!node.init())
		  {
		  	return -1;
		  }
		  «IF n.threads > 1»
		  	ros::AsnySpinner spinner(«n.threads»);
		  	spinner.start();
		  	ros::waitForShutdown();
		  «ELSE»
		  	ros::spin();
		  «ENDIF»
		  return 0;
		}
	'''
	
	def static void generateSourceCode(Resource resource, ROSPackage ros_package, String path){
		val ViatraQueryEngine engine = ViatraQueryEngine.on(new EMFScope(resource));
		System.out.println("Loaded from path");
		/// Generate all nodes per package
		val String package_path = path + "/src/" + ros_package.name 
		
		/// Write to file
		ros_package.rosnode.forEach[
			val ROSNode node = it as ROSNode 
			val File main_file = new File(package_path + "/src/" + node.name.toLowerCase + "_main" + ".cpp")
			val PrintStream ps_main = new PrintStream(main_file)
			ps_main.println(GenerateNodeModule::patternNodeMain(ros_package, node));
			
		]
		/// Generate all node skeletons
		resource.allContents.filter[it instanceof ROSNode].forEach[ ^n |
			val ROSNode node = ^n as ROSNode
			
			val MessagesFromTopics.Matcher msgs_matcher = MessagesFromTopics.Matcher.on(engine);
			val Collection<ROSMsg> msgs = new ArrayList()		
			msgs_matcher.getAllMatches(node, null).forEach[msgs.add(it.m)]
			/// Get all incoming topics
			val IncomingTopic.Matcher matcher_topics_incoming = IncomingTopic.Matcher.on(engine);
			val Collection<TopicReceive> incoming_topics = new ArrayList()
			matcher_topics_incoming.getAllMatches(node, null, null).forEach[incoming_topics.add(it.product)]
			/// Get all outgoing topics
			val OutgoingTopic.Matcher matcher_topics_outgoing = OutgoingTopic.Matcher.on(engine);
			val Collection<TopicUpdate> outgoing_topics = new ArrayList()
			matcher_topics_outgoing.getAllMatches(node, null, null).forEach[outgoing_topics.add(it.product)]
			/// Define a directory as per ROS definition
			val include_dir = package_path + "/include/" + ros_package.name + "/"
			/// Write abstract headers
			val File inc_file = new File(include_dir + node.name + ".abs.hpp")
			val PrintStream ps_abs = new PrintStream(inc_file)
			ps_abs.println(RosNodeGeneration::patternAbstractNodeHeader(node, incoming_topics, outgoing_topics, msgs))
			System.out.println('''Generated abstract header: «include_dir + node.name + ".abs.hpp"»''');
			val File inc_file_abs_state = new File(include_dir + node.name + "_state.abs.hpp")
			val PrintStream ps_abs_state = new PrintStream(inc_file_abs_state)
			ps_abs_state.println(NodeStateGeneration::generateAbstractStateHeader(node, msgs));
			System.out.println('''Generated abstract state header: «include_dir + node.name + "_state.abs.hpp"»''')
			/// Write abstract node functions
			val File abs_impl_file = new File(package_path + "/src/" + node.name.toLowerCase + ".gen" + ".cpp")
			val PrintStream abs_impl_ps = new PrintStream(abs_impl_file)			
			abs_impl_ps.println(
				RosNodeGeneration::patternNodeImplementation(
					ros_package, node, incoming_topics, outgoing_topics, msgs
				)
			)
			System.out.println('''Generated abstract implementation: «package_path + "/src/" + node.name.toLowerCase + ".gen" + ".cpp"»''');
			
			/// Write implementation headers
			generateImplementationHeaders(node, incoming_topics, include_dir)
		]
	}
	
	def static void generateImplementationHeaders(ROSNode node, Collection<TopicReceive> receives, String include_dir){
		/// Implemented header files
		val impl_header = include_dir + node.name + ".impl.hpp"
		val Path path_impl_inc = Paths.get(impl_header);

		if (Files.exists(path_impl_inc)) {
		  // Class Implementation header exists
		}
		
		if (Files.notExists(path_impl_inc)) {
		  // Class Implementation header does not exist
		  val File inc_impl_file = new File(impl_header)
		  val PrintStream ps_abs = new PrintStream(inc_impl_file)			
		  ps_abs.println(RosNodeGeneration::patternClassImplementationSkeleton(node, receives))
		  System.out.println('''Generated implementation header: «impl_header»''');
		}
	}
}
