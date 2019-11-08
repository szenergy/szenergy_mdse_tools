package hu.sze.aut.diffrobot.transformation

import hu.sze.jkk.diffrobot.model.diffrobot.Robot
import robotdescriptionpackage.RobotdescriptionpackageFactory
import hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis
import robotdescriptionpackage.Joint
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.resource.Resource
import robotdescriptionpackage.RobotdescriptionpackagePackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import hu.sze.kinematics.description.generator.GenerateUrdf
import javax.xml.parsers.DocumentBuilderFactory
import org.w3c.dom.Document
import java.io.File
import hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage
import robotdescriptionpackage.Link
import hu.sze.jkk.diffrobot.model.diffrobot.HullComponent
import hu.sze.jkk.diffrobot.model.diffrobot.Mesh
import hu.sze.jkk.diffrobot.model.diffrobot.WheelParameters

public class GenerateDiffRobotKinematic {
	val ResourceSet resourceset = new ResourceSetImpl()
	var Resource _resource_robot_output
	
	private static double WHEEL_AXIS_RADIUS = 0.05;
	
	new(){
		resourceset.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resourceset.getPackageRegistry().put(RobotdescriptionpackagePackage.eNS_URI, RobotdescriptionpackagePackage.eINSTANCE);
		_resource_robot_output = resourceset.createResource(URI.createURI("ws://new_robot.xmi"));
	}
	
	def static translateJoint(Joint joint, double x, double y, double z){
		joint.origin = RobotdescriptionpackageFactory.eINSTANCE.createOrigin
		joint.origin.xyz = RobotdescriptionpackageFactory.eINSTANCE.createVec3
		joint.origin.xyz.x = x
		joint.origin.xyz.y = y
		joint.origin.xyz.z = z
	}
	
	def static constructUniWheelAxis(robotdescriptionpackage.Robot robot_kinematics, 
		WheelAxis axis, Link axis_root){
		val joint_wheel = RobotdescriptionpackageFactory.eINSTANCE.createJoint
		joint_wheel.name = '''joint_axis_«axis.name»_uni_root'''
		joint_wheel.axis = RobotdescriptionpackageFactory.eINSTANCE.createAxis
		joint_wheel.axis.x = 1.0;
		joint_wheel.axis.y = 0.0;
		joint_wheel.axis.z = 0.0;
		val wheel_link = RobotdescriptionpackageFactory.eINSTANCE.createLink
		wheel_link.name = '''link_wheel_«axis.name»_1'''
		translateJoint(joint_wheel, 
			axis.length/2.0, 0, 0
		)
		joint_wheel.parent = axis_root
		joint_wheel.child = wheel_link
		robot_kinematics.link.add(wheel_link)	
		robot_kinematics.joint.add(joint_wheel)	
	}
	
	def static constructLinkAxisGeometry(WheelAxis axis, Link link)
	{
		val viz_link = RobotdescriptionpackageFactory.eINSTANCE.createVisual
		link.visual.add(viz_link)
		val cyl = RobotdescriptionpackageFactory.eINSTANCE.createCylinder
		cyl.length = axis.length
		cyl.radius = WHEEL_AXIS_RADIUS
		viz_link.geometry = cyl
		val coll_link = RobotdescriptionpackageFactory.eINSTANCE.createCollision
		coll_link.parent_visual = viz_link
		link.collision.add(coll_link)
	}
	
	def static constructHullGeometry(HullComponent hull, Link base_link)
	{
		val viz_link = RobotdescriptionpackageFactory.eINSTANCE.createVisual
		base_link.visual.add(viz_link)
		if (hull.mesh !== null)
		{
			val mesh = RobotdescriptionpackageFactory.eINSTANCE.createMesh
			mesh.filename = '''pacakge://«hull.mesh.package»/«hull.mesh.path»'''
			viz_link.geometry = mesh
		}
		else
		{
			val box = RobotdescriptionpackageFactory.eINSTANCE.createBox
			box.width = hull.width
			box.depth = hull.depth			
			//box.height = hull.height
			box.height = 0.2
			viz_link.geometry = box
			val coll_link = RobotdescriptionpackageFactory.eINSTANCE.createCollision
			coll_link.parent_visual = viz_link
			base_link.collision.add(coll_link)
		}
	}
	
	def static constructWheelGeometry(Link wheel_link, WheelParameters wheel_param){
		val viz_link = RobotdescriptionpackageFactory.eINSTANCE.createVisual
		wheel_link.visual.add(viz_link)
		val coll_link = RobotdescriptionpackageFactory.eINSTANCE.createCollision
		wheel_link.collision.add(coll_link)
		if (wheel_param.mesh!==null)
		{
			val mesh = RobotdescriptionpackageFactory.eINSTANCE.createMesh
			mesh.filename = '''pacakge://«wheel_param.mesh.package»/«wheel_param.mesh.path»'''			
			viz_link.geometry = mesh 
		}
		else
		{
			val cyl = RobotdescriptionpackageFactory.eINSTANCE.createCylinder
			cyl.radius = wheel_param.radius
			cyl.length = wheel_param.width
			viz_link.geometry = cyl
			coll_link.parent_visual = viz_link
		}
		
	}
			
	def static constructTwoWheelAxis(robotdescriptionpackage.Robot robot_kinematics, 
		WheelAxis axis, Link axis_root,
		WheelParameters wheelparameters
	){
		// Right wheel
		val joint_wheel_right = RobotdescriptionpackageFactory.eINSTANCE.createJoint
		joint_wheel_right.axis = RobotdescriptionpackageFactory.eINSTANCE.createAxis
		joint_wheel_right.axis.x = 1.0;
		joint_wheel_right.axis.y = 0.0;
		joint_wheel_right.axis.z = 0.0;
		translateJoint(joint_wheel_right, 
			-axis.length/2.0, 0, 0
		)
		joint_wheel_right.name = '''joint_axis_«axis.name»_right'''					
		val wheel_link_right = RobotdescriptionpackageFactory.eINSTANCE.createLink
		wheel_link_right.name = '''link_wheel_«axis.name»_right'''
		joint_wheel_right.parent = axis_root
		joint_wheel_right.child = wheel_link_right
		wheel_link_right.mass = wheelparameters.mass
		constructWheelGeometry(wheel_link_right, wheelparameters)
		robot_kinematics.joint.add(joint_wheel_right)
		robot_kinematics.link.add(wheel_link_right)
		// Left wheel
		val joint_wheel_left = RobotdescriptionpackageFactory.eINSTANCE.createJoint
		joint_wheel_left.axis = RobotdescriptionpackageFactory.eINSTANCE.createAxis
		joint_wheel_left.axis.x = 1.0;
		joint_wheel_left.axis.y = 0.0;
		joint_wheel_left.axis.z = 0.0;
		translateJoint(joint_wheel_left, 
			axis.length/2.0, 0, 0
		)
		joint_wheel_left.name = '''joint_axis_«axis.name»_left'''
		val wheel_link_left = RobotdescriptionpackageFactory.eINSTANCE.createLink
		wheel_link_left.name = '''link_wheel_«axis.name»_left'''
		joint_wheel_left.parent = axis_root
		joint_wheel_left.child = wheel_link_left
		robot_kinematics.joint.add(joint_wheel_left)
		robot_kinematics.link.add(wheel_link_left)
		wheel_link_left.mass = wheelparameters.mass
		constructWheelGeometry(wheel_link_left, wheelparameters)
	}
	
	def static setupWheelAxisLink(WheelAxis axis){
		val axis_root = RobotdescriptionpackageFactory.eINSTANCE.createLink
		axis_root.name = '''link_axis_root_«axis.name.toLowerCase»'''
		axis_root.mass = 2.0
		return axis_root	
	}
	
	def static setupWheelAxisJoint(WheelAxis axis, Link axis_root, Link base_link){
		val joint = RobotdescriptionpackageFactory.eINSTANCE.createJoint
		joint.name = '''jnt_axis_«axis.name.toLowerCase»'''
		joint.axis = RobotdescriptionpackageFactory.eINSTANCE.createAxis
		joint.axis.x = 1.0;
		joint.axis.y = 0.0;
		joint.axis.z = 0.0;
		joint.child = axis_root
		joint.parent = base_link
		translateJoint(joint, 
			axis.axislocation.displacement.x, 
			axis.axislocation.displacement.y,
			axis.axislocation.displacement.z
		)
		return joint
	}
	
	def static constructRobotKinematicTree(Robot robot){
		val robotdescriptionpackage.Robot robot_kinematics = RobotdescriptionpackageFactory.eINSTANCE.createRobot
		val base_link = RobotdescriptionpackageFactory.eINSTANCE.createLink
		base_link.name = "base_link"
		base_link.mass = robot.hull.mass
		robot_kinematics.link.add(base_link)
		// Base link has the hull components, so initialize it
		constructHullGeometry(robot.hull, base_link)		
		// Set joint connecting axes
		for (WheelAxis axis: robot.wheelaxis){
			val axis_root = setupWheelAxisLink(axis)
			val joint = setupWheelAxisJoint(axis, axis_root, base_link)
			switch (axis.wheels){
				case 1: {
					constructUniWheelAxis(robot_kinematics, axis, axis_root)			
				}
				case 2: {
					constructTwoWheelAxis(robot_kinematics, axis, axis_root, axis.wheelparameters)
									
				}
			}
			constructLinkAxisGeometry(axis, axis_root)
			// Add links and joints to the robot kinematic description
			robot_kinematics.joint.add(joint)
			robot_kinematics.link.add(axis_root)
		}
		return robot_kinematics
		
	}
	
	def generateKinematicDescription(Document doc, Robot robot){
		val robot_kinematic = constructRobotKinematicTree(robot);
		
		val GenerateUrdf gen_urdf = new GenerateUrdf(doc);
		gen_urdf.generateURDF(doc, robot_kinematic)
	}
	
	def static loadDiffRobotDescription(String path){
		val ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(DiffrobotPackage.eNS_URI, DiffrobotPackage.eINSTANCE);
		val File file = new File(path);
		val URI uri = URI.createFileURI(file.getAbsolutePath());
		val Resource resource = resourceSet.getResource(uri, true);
		val Robot robot = resource.allContents.filter[it instanceof Robot].head as Robot
		
		return robot
	}
}