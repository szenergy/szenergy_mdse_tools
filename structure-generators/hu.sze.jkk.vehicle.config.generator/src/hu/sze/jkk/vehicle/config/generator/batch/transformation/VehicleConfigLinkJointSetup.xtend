package hu.sze.jkk.vehicle.config.generator.batch.transformation

import hu.sze.jkk.vehicle.config.vehicleconfig.SteeringParameters
import robotdescriptionpackage.Joint
import robotdescriptionpackage.RobotdescriptionpackageFactory
import robotdescriptionpackage.JOINT_TYPE
import robotdescriptionpackage.Link
import robotdescriptionpackage.Cylinder

class VehicleConfigLinkJointSetup {
	def static void setupSteerJointPlanarDeg(SteeringParameters steer, Joint steer_joint, double sgn){
    	steer_joint.axis = RobotdescriptionpackageFactory.eINSTANCE.createAxis
    	steer_joint.axis.x = 0.0;
    	steer_joint.axis.y = 0.0;
    	steer_joint.axis.z = 1.0;
    	steer_joint.type = JOINT_TYPE::REVOLUTE;
    	steer_joint.axis.limit = RobotdescriptionpackageFactory.eINSTANCE.createLimit
    	if (sgn> 0.0){
    		steer_joint.axis.limit.limit_max = sgn*steer.outer_angle*Math.PI/180.0;
    		steer_joint.axis.limit.limit_min = -sgn*steer.inner_angle*Math.PI/180.0;    		
    	}else{
    		steer_joint.axis.limit.limit_max = sgn*steer.inner_angle*Math.PI/180.0;
    		steer_joint.axis.limit.limit_min = sgn*steer.outer_angle*Math.PI/180.0;
    	}
    	// TODO: some calculation of angle velocity
    	steer_joint.axis.limit.velocity = 0.2f;
    	steer_joint.axis.limit.effort = 8000.0f;
    }

    def static void setupSteerLink(Link steer_link){
    	steer_link.visual += RobotdescriptionpackageFactory.eINSTANCE.createVisual
    	val Cylinder c = RobotdescriptionpackageFactory.eINSTANCE.createCylinder
    	c.length = 0.05
    	c.radius = 0.1
    	steer_link.visual.get(0).geometry = c
    	steer_link.collision += RobotdescriptionpackageFactory.eINSTANCE.createCollision
    	steer_link.collision.get(0).parent_visual = steer_link.visual.get(0) 

    }

    def static void setupCylindricalLink(Link link){
    	link.visual += RobotdescriptionpackageFactory.eINSTANCE.createVisual
    	val Cylinder c = RobotdescriptionpackageFactory.eINSTANCE.createCylinder
    	c.length = 0.05
    	c.radius = 0.1
    	link.visual.get(0).geometry = c
    	link.collision += RobotdescriptionpackageFactory.eINSTANCE.createCollision
    	link.collision.get(0).parent_visual = link.visual.get(0)
    }
}