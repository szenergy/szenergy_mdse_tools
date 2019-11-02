package hu.sze.aut.diffrobot.transformation

import hu.sze.jkk.diffrobot.model.diffrobot.Robot
import robotdescriptionpackage.RobotdescriptionpackageFactory
import hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis
import robotdescriptionpackage.Joint

class GenerateDiffRobotKinematic {
	
	def static translateLink(Joint joint, double x, double y, double z){
		joint.origin = RobotdescriptionpackageFactory.eINSTANCE.createOrigin
		joint.origin.xyz = RobotdescriptionpackageFactory.eINSTANCE.createVec3
		joint.origin.xyz.x = x
		joint.origin.xyz.y = y
		joint.origin.xyz.z = z
	}
	
	def static constructRobotKinematicTree(Robot robot){
		val robotdescriptionpackage.Robot robot_kinematics = RobotdescriptionpackageFactory.eINSTANCE.createRobot
		val base_link = RobotdescriptionpackageFactory.eINSTANCE.createLink
		base_link.name = "base_link"
		base_link.mass = 10.0			// TODO: not explicitly set mass
		 
		robot_kinematics.link.add(base_link)
		// Set joint connecting axes
		for (WheelAxis axis: robot.wheelaxis){
			val joint = RobotdescriptionpackageFactory.eINSTANCE.createJoint
			joint.name = '''jnt'''
			val axis_root = RobotdescriptionpackageFactory.eINSTANCE.createLink
			joint.parent = base_link
			joint.child = axis_root
			
			switch (axis.wheels){
				case 1: {
					val joint_wheel = RobotdescriptionpackageFactory.eINSTANCE.createJoint
					val wheel_link = RobotdescriptionpackageFactory.eINSTANCE.createLink
					joint_wheel.parent = axis_root					
					joint.child = wheel_link
					robot_kinematics.joint.add(joint_wheel)					
				}
				case 2: {
					// Right wheel
					val joint_wheel_right = RobotdescriptionpackageFactory.eINSTANCE.createJoint					
					val wheel_link_right = RobotdescriptionpackageFactory.eINSTANCE.createLink
					joint_wheel_right.parent = axis_root
					joint_wheel_right.child = wheel_link_right					
					robot_kinematics.joint.add(joint_wheel_right)
					robot_kinematics.link.add(wheel_link_right)
					// Left wheel
					val joint_wheel_left = RobotdescriptionpackageFactory.eINSTANCE.createJoint
					val wheel_link_left = RobotdescriptionpackageFactory.eINSTANCE.createLink
					joint_wheel_left.parent = axis_root
					joint_wheel_left.child = wheel_link_left
					robot_kinematics.joint.add(joint_wheel_left)
					robot_kinematics.link.add(wheel_link_left)					
				}
			}
			
			// Add links and joints to the robot kinematic description
			robot_kinematics.joint.add(joint)
			robot_kinematics.link.add(axis_root)
		}
		
	}
}