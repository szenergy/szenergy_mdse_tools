package hu.sze.kinematics.description.generator.common

import robotdescriptionpackage.RobotdescriptionpackageFactory

class InertiaCalculations {
	def static cylinderInertia(double radius, double length, double mass)
	{
		val double ixx = (3*radius*radius+length*length)/12.0f;
		
		val double iz = (radius*radius)/2.0f;
		
		
		val inertia = RobotdescriptionpackageFactory.eINSTANCE.createInertia
		inertia.ixx = mass * ixx
		inertia.iyy = mass * ixx
		inertia.izz = mass * iz
		return inertia
	}
	
	def static boxInertia(double width, double depth, double height, double mass)
	{
		val double ih = (depth*depth+width*width)/12.0f;
		val double iw = (height*height+depth*depth)/12.0f;
		val double id = (height*height+width*width)/12.0f;
		val inertia = RobotdescriptionpackageFactory.eINSTANCE.createInertia		
		inertia.ixx = mass * id
		inertia.iyy = mass * iw
		inertia.izz = mass * ih
		return inertia
	}
}