package hu.sze.kinematics.description.generator.control

import org.w3c.dom.Element
import robotdescriptionpackage.Robot
import org.w3c.dom.Document

class GenerateRosControlGazebo {
	def static Element generateRosControl(Document doc, Robot robot){
		val Element element_ros_control = doc.createElement("gazebo")
		val Element element_ros_plugin = doc.createElement("plugin")
		element_ros_control.appendChild(element_ros_plugin)
		element_ros_plugin.setAttribute("filename", "libgazebo_ros_control.so")
		element_ros_plugin.setAttribute("name", robot.name+"_ros_control")
		val Element element_ros_namespace = doc.createElement("robotNamespace")
		element_ros_namespace.textContent = robot.name
		element_ros_plugin.appendChild(element_ros_namespace)
		val Element element_ros_hw = doc.createElement("robotSimType")
		element_ros_hw.textContent = "gazebo_ros_control/DefaultRobotHWSim"
		element_ros_plugin.appendChild(element_ros_hw)
		return element_ros_control
	}
	
	
}