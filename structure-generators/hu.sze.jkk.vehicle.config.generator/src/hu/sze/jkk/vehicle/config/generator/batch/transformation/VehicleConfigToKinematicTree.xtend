package hu.sze.jkk.vehicle.config.generator.batch.transformation

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformation
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformationStatements
import org.eclipse.emf.ecore.resource.Resource
import hu.sze.jkk.vehicle.dse.validation.ValidKinematicParameters
import robotdescriptionpackage.RobotdescriptionpackagePackage
import hu.sze.jkk.vehicle.config.vehicleconfig.VehicleconfigPackage
import robotdescriptionpackage.Robot
import hu.sze.jkk.vehicle.dse.validation.BasicConstraints

import hu.sze.jkk.vehicle.dse.validation.ValidKinematicParameters.Match
import hu.sze.jkk.vehicle.dse.validation.ValidKinematicParameters.Matcher
import robotdescriptionpackage.Vec3
import robotdescriptionpackage.Link
import robotdescriptionpackage.Axis
import robotdescriptionpackage.Joint
import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory
import org.w3c.dom.Document
import hu.sze.jkk.vehicle.config.vehicleconfig.KinematicParameters
import org.eclipse.emf.ecore.util.EcoreUtil
import javax.xml.transform.Transformer
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.TransformerFactory
import javax.xml.transform.OutputKeys
import javax.xml.transform.stream.StreamResult
import robotdescriptionpackage.JOINT_TYPE
import java.io.PrintStream
import robotdescriptionpackage.Origin
import hu.sze.jkk.vehicle.config.vehicleconfig.WheelParameters
import hu.sze.jkk.vehicle.config.vehicleconfig.SteeringParameters
import robotdescriptionpackage.Cylinder
import hu.sze.jkk.vehicle.config.vehicleconfig.GeometrySettings
import hu.sze.kinematics.description.generator.common.InertiaCalculations
import hu.sze.jkk.vehicle.config.vehicleconfig.DynamicParameters
import hu.sze.jkk.vehicle.config.vehicleconfig.Vehicle
import hu.sze.jkk.vehicle.config.vehicleconfig.VehicleControl
import hu.sze.jkk.vehicle.config.vehicleconfig.WheelDynamics
import hu.sze.jkk.vehicle.config.vehicleconfig.VehicleControlPlugin

class VehicleConfigToKinematicTree {
	
    /* Transformation-related extensions */
    extension BatchTransformation transformation
    extension BatchTransformationStatements statements
    // Our validation queries
    val extension BasicConstraints basicConstraint = BasicConstraints.instance
    /* Transformation rule-related extensions */
    extension BatchTransformationRuleFactory = new BatchTransformationRuleFactory
    extension IModelManipulations manipulation
    
    val ViatraQueryEngine engine;
    
    val extension VehicleconfigPackage vehicleconfigPackage = VehicleconfigPackage.eINSTANCE
    val extension RobotdescriptionpackagePackage kintreePackage =  RobotdescriptionpackagePackage.eINSTANCE
    
    
    
    
    // Documents
    protected DocumentBuilder doc_builder = DocumentBuilderFactory.newInstance().newDocumentBuilder
    
    protected Resource resource
    protected Document doc
    
    var Robot robot
    
    /**
     * @brief Creates kinematic description (e.g. URDF) based on the vehicle description
     * @param wheelmotor	the wheel link, the wheel attached to
     * @param wheellink		the axle link, the wheel attached to
     * @param wheeljoint	the connecting joint
     * @param wheelparam	wheel parameters
     * @param wheeldyn		wheel dynamical parameters
     * @param geomsettings	the geoemtry settings of the wheel
     * @param axisdir		the direction of the axis as a scalar value
     */
    def void setupWheel(Link wheelmotor, 
    	Link wheellink, Joint wheeljoint,    	
    	WheelParameters wheelparam, WheelDynamics wheeldyn, GeometrySettings geomsettings,
    	double axisdir
    ){
    	/// Setup joint, motor link is the child, axle link is the parent
    	wheeljoint.parent = wheelmotor
    	wheeljoint.child = wheellink
    	wheeljoint.axis = robotdescriptionpackageFactory.createAxis
    	wheeljoint.axis.x = 0.0f
    	wheeljoint.axis.y = 1.0f
    	wheeljoint.axis.z = 0.0f
    	wheeljoint.type = JOINT_TYPE::CONTINUOUS /// Joint is continuous of type
    	/// Visual setup
    	wheellink.visual += robotdescriptionpackageFactory.createVisual
    	wheellink.collision += robotdescriptionpackageFactory.createCollision
    	wheellink.collision.get(0).name = "coll_"+wheellink.name
    	wheellink.visual.get(0).name = "viz_"+wheellink.name
    	wheellink.mass = wheeldyn.wheel_mass
    	/// Decide whether generate mockup geometry or set geometry file
    	if (geomsettings.wheelgeometry===null)
    	{
    		// There is no description for mesh, so create a cylinder model for it
    		// based on wheel parameters
	    	val c = robotdescriptionpackageFactory.createCylinder
	    	c.length = wheelparam.wheel_width
	    	c.radius = wheelparam.wheel_radius
	    	wheellink.visual.get(0).geometry = c
	    	wheellink.collision.get(0).parent_visual = wheellink.visual.get(0)
    	}
    	else
    	{
    		// Set mesh from file
    		val visual_mesh = robotdescriptionpackageFactory.createMesh
    		visual_mesh.filename = geomsettings.wheelgeometry.package + geomsettings.wheelgeometry.meshpath
    		wheellink.visual.get(0).geometry = visual_mesh
    		val collision_mesh = robotdescriptionpackageFactory.createMesh
    		collision_mesh.filename = geomsettings.wheelgeometry.package + geomsettings.wheelgeometry.collisionmesh
    		wheellink.collision.get(0).geometry = collision_mesh
    		/// Explicitly setup inertia
    		wheellink.inertial = robotdescriptionpackageFactory.createInertial
		    wheellink.inertial.mass = wheeldyn.wheel_mass  /// Setup mass from wheel dynamic parameters
		    wheellink.inertial.inertia = 
		    	InertiaCalculations.cylinderInertia(wheelparam.wheel_radius, 
		    		wheelparam.wheel_width, wheeldyn.wheel_mass /// Model inertia with a solid cylinder
		    	)
	    	wheellink.inertial.origin = robotdescriptionpackageFactory.createOrigin
	    	wheellink.inertial.origin.xyz = robotdescriptionpackageFactory.createVec3
	    	wheellink.inertial.origin.rpy = robotdescriptionpackageFactory.createEulerRotation
	    	if (geomsettings.wheelgeometry.rotation!==null)
		    {
		    	System.out.println('''Setting explicit geometry settings for wheel link: «wheellink.name»''');
		    	val orig_viz = robotdescriptionpackageFactory.createOrigin
		    	val orig_coll = robotdescriptionpackageFactory.createOrigin
		    	orig_viz.xyz = robotdescriptionpackageFactory.createVec3
		    	orig_coll.xyz = robotdescriptionpackageFactory.createVec3
		    	orig_viz.rpy = robotdescriptionpackageFactory.createEulerRotation
		    	orig_coll.rpy = robotdescriptionpackageFactory.createEulerRotation
		    	// TODO: other rotations as well
		    	orig_viz.rpy.yaw = (geomsettings.wheelgeometry.rotation.yaw * axisdir)
		    	orig_coll.rpy.yaw = (geomsettings.wheelgeometry.rotation.yaw * axisdir)
		    	wheellink.visual.get(0).origin = orig_viz
		    	wheellink.collision.get(0).origin = orig_coll
		    }
    	}
    	// Setup friction
    	// TODO: set from editor
    	wheellink.friction_mu = 0.7;
    }
    
    def void setupWheelMotorLinkGeometry(Link wheel_motor) {
    	// Geometry links
    	wheel_motor.visual += robotdescriptionpackageFactory.createVisual
    	wheel_motor.visual.get(0).name = "viz_"+wheel_motor.name
    	val c = robotdescriptionpackageFactory.createCylinder
    	c.length = 0.1
    	c.radius = 0.05
    	wheel_motor.visual.get(0).geometry = c
    	wheel_motor.collision += robotdescriptionpackageFactory.createCollision
    	wheel_motor.collision.get(0).name = "coll_"+wheel_motor.name
    	wheel_motor.collision.get(0).parent_visual = wheel_motor.visual.get(0)    	
    }
    
    def void planeRotation(Link axle){
    	if (axle.visual.get(0).origin===null)
    	{
    		val Origin or = robotdescriptionpackageFactory.createOrigin
	    	or.xyz = robotdescriptionpackageFactory.createVec3
	    	or.rpy = robotdescriptionpackageFactory.createEulerRotation
	    	or.rpy.roll = 90.0f
	    	axle.visual.get(0).origin = or
	    	// Inertia setup rotation
	    	if (axle.inertial!==null)
	    	{
	    		System.out.println("Rotating inertia");
	    		axle.inertial.origin.rpy.roll = 90.0f;
	    	}
	    	
    	}
    	else
    	{
    		axle.visual.get(0).origin.rpy.roll = axle.visual.get(0).origin.rpy.roll + 90.0f
    	}
    }
    
    def void setupAxleGeometry(Link axle, double axle_length){
    	// Geometry axis
    	axle.visual += robotdescriptionpackageFactory.createVisual    	 
    	axle.visual.get(0).name = "viz_"+axle.name
    	val c = robotdescriptionpackageFactory.createCylinder    	
    	
    	c.length = axle_length    	    	
    	c.radius = 0.05
    	axle.visual.get(0).geometry = c
    	axle.collision += robotdescriptionpackageFactory.createCollision
    	axle.collision.get(0).name = "coll_"+axle.name
    	axle.collision.get(0).parent_visual = axle.visual.get(0)
    }
    
    def void setupWheelAxle(
    	Joint jnt_left_wheel, Joint jnt_right_wheel, 
    	Link axle_link, 
    	Link front_left_wheel_link, Vec3 front_left_pos,
    	Link front_right_wheel_link, Vec3 front_right_pos,
    	Axis wheel_axis,
    	double track_length
    ){
    	setupAxleGeometry(axle_link, track_length)
    	
    	// Front joint axle
    	// Front wheel left joint
    	jnt_left_wheel.parent  = axle_link
    	jnt_left_wheel.child   = front_left_wheel_link
    	val origin_front_left_wheel  = robotdescriptionpackageFactory.createOrigin
    	origin_front_left_wheel.xyz  = EcoreUtil.copy(front_left_pos)
    	jnt_left_wheel.origin  = origin_front_left_wheel
    	jnt_left_wheel.axis    = EcoreUtil.copy(wheel_axis)
    	// Right wheel
    	jnt_right_wheel.parent = axle_link
    	jnt_right_wheel.child  = front_right_wheel_link
    	val origin_front_right_wheel = robotdescriptionpackageFactory.createOrigin
    	origin_front_right_wheel.xyz = EcoreUtil.copy(front_right_pos)
    	jnt_right_wheel.origin = origin_front_right_wheel
    	jnt_right_wheel.axis   = EcoreUtil.copy(wheel_axis)
    	setupWheelMotorLinkGeometry(front_right_wheel_link)
    	setupWheelMotorLinkGeometry(front_left_wheel_link)
    }
    
    def void setupShell(Link root, GeometrySettings geom_settings, KinematicParameters kin_param, DynamicParameters dyn_param) {
    	val hull_viz = robotdescriptionpackageFactory.createVisual
    	val m = robotdescriptionpackageFactory.createMesh
    	val shell_geom = geom_settings.shell
    	m.filename = "package://"+shell_geom.package+shell_geom.meshpath
    	hull_viz.geometry = m
    	root.visual.add(hull_viz)    	
    	 
    	
    	val hull_coll = robotdescriptionpackageFactory.createCollision
    	
    	val cm = robotdescriptionpackageFactory.createMesh
    	
    	cm.filename = "package://"+geom_settings.shell.package+geom_settings.shell.collisionmesh
    	hull_coll.geometry = cm
    	root.collision.add(hull_coll)
    	planeRotation(root)
    	/// Setup inertia approximation based on kinematic parameters
    	root.inertial = robotdescriptionpackageFactory.createInertial
    	root.inertial.mass = dyn_param.inertialparameters.mass
    	root.inertial.inertia = InertiaCalculations.boxInertia(
    		kin_param.boundingbox.width,
    		kin_param.boundingbox.depth,
    		kin_param.boundingbox.height, /// Setup box inertia based on bounding box
    		dyn_param.inertialparameters.mass
    	)
    	// Genereate origin of inertia according to reference point
    	root.inertial.origin = robotdescriptionpackageFactory.createOrigin
    	root.inertial.origin.xyz = robotdescriptionpackageFactory.createVec3
    	root.inertial.origin.rpy = robotdescriptionpackageFactory.createEulerRotation    	
    	switch(kin_param.reference_point){
    		case REAR_AXLE:{
    			root.inertial.origin.xyz.x = dyn_param.inertialparameters.cog_ratio * kin_param.wheelbase
    			root.inertial.origin.xyz.z = kin_param.boundingbox.height/2.0
    		}
			case COG: {
			}
    	}
    	root.mass = root.inertial.mass
    	/// Set mesh origin
    	if (shell_geom.displacement!==null)
    	{
    		/// Initialize as per ECore
    		hull_viz.origin = robotdescriptionpackageFactory.createOrigin
    		hull_viz.origin.xyz = robotdescriptionpackageFactory.createVec3
    		hull_viz.origin.rpy = robotdescriptionpackageFactory.createEulerRotation
    		hull_coll.origin = robotdescriptionpackageFactory.createOrigin
    		hull_coll.origin.xyz = robotdescriptionpackageFactory.createVec3
    		hull_coll.origin.rpy = robotdescriptionpackageFactory.createEulerRotation
    		/// Viz origin
    		hull_viz.origin.xyz.x = shell_geom.displacement.x
    		hull_viz.origin.xyz.y = shell_geom.displacement.y
    		hull_viz.origin.xyz.z = shell_geom.displacement.z
    		/// Collision mesh origin
    		hull_coll.origin.xyz.x = shell_geom.displacement.x
    		hull_coll.origin.xyz.y = shell_geom.displacement.y
    		hull_coll.origin.xyz.z = shell_geom.displacement.z
    		
    	}
    	System.out.println('''Vehicle inertial parameters: «root.inertial.mass», «root.inertial.inertia.ixx» «root.inertial.inertia.iyy» «root.inertial.inertia.izz»''')
    }
    
    def void setupRobot(Vehicle vehicle, KinematicParameters kinematic_param, GeometrySettings geom_settings, DynamicParameters dyn_param){
    	switch (kinematic_param.reference_point){
    		case COG:{
    			setupVehicleKinematicStructure(kinematic_param, geom_settings, dyn_param, kinematic_param.wheelbase/2.0, kinematic_param.wheelbase/2.0)
    		}
    		case REAR_AXLE: {
    			setupVehicleKinematicStructure(kinematic_param, geom_settings, dyn_param, kinematic_param.wheelbase, 0.0)
    		}
    	}
    	/*
    	vehicle.nodeconfiguration?.computationnode?.forEach[
    		if (it instanceof VehicleControl)
    		{
				val control_plugin = robotdescriptionpackageFactory.createPlugin
	    		control_plugin.name = it.nodename
	    		control_plugin.library = "lib"+it.nodename
	    		robot.plugin.add(control_plugin)
    		}    		
    	]
    	* */
    	vehicle.simulationconfiguration?.simulationcontrolplugin?.forEach[
    		val control_plugin = robotdescriptionpackageFactory.createPlugin
    		control_plugin.name = it.name
    		control_plugin.library = "lib"+it.type
    		if (it instanceof VehicleControlPlugin)
    		{
    			val VehicleControlPlugin plugin = it as VehicleControlPlugin
    			val param_steer_p_gain = robotdescriptionpackageFactory.createPluginParam
    			param_steer_p_gain.varname = "start_steer_p_gain"
    			param_steer_p_gain.text = plugin.steerpid.p.toString
    			control_plugin.pluginparam.add(param_steer_p_gain)
    			val param_steer_i_gain = robotdescriptionpackageFactory.createPluginParam
    			param_steer_i_gain.varname = "start_steer_i_gain"
    			param_steer_i_gain.text = plugin.steerpid.i.toString
    			control_plugin.pluginparam.add(param_steer_i_gain)
    			val param_steer_d_gain = robotdescriptionpackageFactory.createPluginParam
    			param_steer_d_gain.varname = "start_steer_d_gain"
    			param_steer_d_gain.text = plugin.steerpid.d.toString
    			control_plugin.pluginparam.add(param_steer_d_gain)
    			val param_velocity_p_gain = robotdescriptionpackageFactory.createPluginParam
    			param_velocity_p_gain.varname = "start_velocity_p_gain"
    			param_velocity_p_gain.text = plugin.velocitypid.p.toString
    			control_plugin.pluginparam.add(param_velocity_p_gain)
    			val param_velocity_i_gain = robotdescriptionpackageFactory.createPluginParam
    			param_velocity_i_gain.varname = "start_velocity_i_gain"
    			param_velocity_i_gain.text = plugin.velocitypid.i.toString
    			control_plugin.pluginparam.add(param_velocity_i_gain)
    			val param_velocity_d_gain = robotdescriptionpackageFactory.createPluginParam
    			param_velocity_d_gain.varname = "start_velocity_d_gain"
    			param_velocity_d_gain.text = plugin.velocitypid.d.toString
				control_plugin.pluginparam.add(param_velocity_d_gain)
	    		
	    		robot.plugin.add(control_plugin)
    		}
    		System.out.println('''Adding control plugin: «it.name» «it.type»''')
    	]    	
	}
	
	/**
	 * @brief Generate vehicle kinematic structure from vehicle description (e.g. execute transformation)
	 * 
	 * @param kinematicparam	kinematic parameters of the vehicle
	 * @param geomsettings		geometry settings of the vehicle
	 * @param dynparam			dynamic parameters of the vehicle
	 * @param frontwheelbase	Front section of the wheelbase
	 * @param rearwheelbase		Rear section of the wheelbase
	 */
	def void setupVehicleKinematicStructure(KinematicParameters kinematicparam, GeometrySettings geomsettings, DynamicParameters dynparam, double frontwheelbase, double rearwheelbase){
    	// Front axle position
		val Vec3 front_pos = robotdescriptionpackageFactory.createVec3
		front_pos.x = frontwheelbase as float
		front_pos.y = 0.0f
		front_pos.z = 0.0f
		// Front left wheel position
		val Vec3 front_left_wheel_pos = robotdescriptionpackageFactory.createVec3
		front_left_wheel_pos.x = 0.0f
		front_left_wheel_pos.y = -(kinematicparam.front_track/2.0f) as float
		front_left_wheel_pos.z = 0.0f
		// Front left wheel position
		val Vec3 front_right_wheel_pos = robotdescriptionpackageFactory.createVec3
		front_right_wheel_pos.x = 0.0f
		front_right_wheel_pos.y = (kinematicparam.front_track/2.0f) as float
		front_right_wheel_pos.z = 0.0f
		// Rear axle position
		val Vec3 rear_pos = robotdescriptionpackageFactory.createVec3
		rear_pos.x = (-rearwheelbase) as float
		rear_pos.y = 0.0f
		rear_pos.z = 0.0f
		// Rear left wheel position
		val Vec3 rear_left_wheel_pos = robotdescriptionpackageFactory.createVec3
		rear_left_wheel_pos.x = 0.0f
		rear_left_wheel_pos.y = -(kinematicparam.rear_track/2.0f) as float
		rear_left_wheel_pos.z = 0.0f
		// Rear left wheel position
		val Vec3 rear_right_wheel_pos = robotdescriptionpackageFactory.createVec3
		front_right_wheel_pos.x = 0.0f
		rear_right_wheel_pos.y = (kinematicparam.rear_track/2.0f) as float
		rear_right_wheel_pos.z = 0.0f 
		
    	robot.link.clear
    	robot.joint.clear
    	val root = robotdescriptionpackageFactory.createLink
    	root.name = "base_link"
    	setupAxleGeometry(root, kinematicparam.wheelbase)
    	root.visual.get(0).origin = robotdescriptionpackageFactory.createOrigin
    	root.visual.get(0).origin.xyz = robotdescriptionpackageFactory.createVec3
    	root.visual.get(0).origin.xyz.x = (((frontwheelbase - rearwheelbase)/2.0) as float)  
    	root.visual.get(0).origin.rpy = robotdescriptionpackageFactory.createEulerRotation
    	root.visual.get(0).origin.rpy.yaw = 90.0f
    	/// Create shell    	
    	setupShell(root, geomsettings, kinematicparam, dynparam)
    	
    	val link_rear = robotdescriptionpackageFactory.createLink
    	link_rear.name = "rear_axle_link"
    	link_rear.mass = 10
    	val link_front = robotdescriptionpackageFactory.createLink
    	link_front.name = "front_axle_link"
    	link_front.mass = 10
    	// Front steer links
    	val link_front_steer_right_wheel = robotdescriptionpackageFactory.createLink
    	link_front_steer_right_wheel.name = "front_steer_right_wheel_link"
    	link_front_steer_right_wheel.mass = 2
    	val link_front_steer_left_wheel = robotdescriptionpackageFactory.createLink
    	link_front_steer_left_wheel.name = "front_steer_left_wheel_link"
    	link_front_steer_left_wheel.mass = 2
    	// Rear wheel links
    	val link_rear_right_wheel = robotdescriptionpackageFactory.createLink
    	link_rear_right_wheel.name = "rear_right_wheel_link"
    	link_rear_right_wheel.mass = 2
    	val link_rear_left_wheel = robotdescriptionpackageFactory.createLink
    	link_rear_left_wheel.name = "rear_left_wheel_link"
    	link_rear_left_wheel.mass = 2
    	
    	
    	val axle_axis = robotdescriptionpackageFactory.createAxis
    	axle_axis.x = 1.0f
    	axle_axis.y = 0.0f
    	axle_axis.z = 0.0f
    	
    	// Front axle joint rear
    	val jnt_root_front = robotdescriptionpackageFactory.createJoint
    	jnt_root_front.name = "axle_front"
    	jnt_root_front.parent = root
    	jnt_root_front.child = link_front
    	val origin_front_axle = robotdescriptionpackageFactory.createOrigin
    	origin_front_axle.xyz = front_pos
    	jnt_root_front.origin = origin_front_axle
    	jnt_root_front.axis = EcoreUtil.copy(axle_axis)
    	
    	
    	val jnt_root_rear = robotdescriptionpackageFactory.createJoint
    	jnt_root_rear.name = "axle_rear"
    	jnt_root_rear.parent = root
    	jnt_root_rear.child = link_rear
    	val origin_rear_axle = robotdescriptionpackageFactory.createOrigin
    	origin_rear_axle.xyz = rear_pos 
    	jnt_root_rear.origin = origin_rear_axle
    	jnt_root_rear.axis = EcoreUtil.copy(axle_axis)
    	
    	
    	val jnt_front_left_wheel = robotdescriptionpackageFactory.createJoint
    	jnt_front_left_wheel.name = "axle_front_left"
    	val jnt_front_right_wheel = robotdescriptionpackageFactory.createJoint
    	jnt_front_right_wheel.name = "axle_front_right"
    	
    	val wheel_axis = robotdescriptionpackageFactory.createAxis
    	wheel_axis.x = 0.0f
    	wheel_axis.y = 1.0f
    	wheel_axis.z = 0.0f
    	
    	val jnt_rear_left_wheel = robotdescriptionpackageFactory.createJoint
    	jnt_rear_left_wheel.name = "axle_rear_left"
    	val jnt_rear_right_wheel = robotdescriptionpackageFactory.createJoint
    	jnt_rear_right_wheel.name = "axle_rear_right"
    	
    	
    	setupWheelAxle(jnt_front_left_wheel, jnt_front_right_wheel, 
    		link_front, 
    		link_front_steer_left_wheel, front_left_wheel_pos,
    		link_front_steer_right_wheel, front_right_wheel_pos,
    		wheel_axis,
    		kinematicparam.front_track
    	)
    	// Steer setup
    	val Joint jnt_front_left_steer = robotdescriptionpackageFactory.createJoint
    	jnt_front_left_steer.name = "jnt_front_left_steer"
    	val Joint jnt_front_right_steer = robotdescriptionpackageFactory.createJoint
    	jnt_front_right_steer.name = "jnt_front_right_steer"
    	
    	val link_front_right_wheel = robotdescriptionpackageFactory.createLink
    	link_front_right_wheel.name = "front_right_wheel_link"
    	link_front_right_wheel.mass = 2
    	VehicleConfigLinkJointSetup::setupCylindricalLink(link_front_right_wheel)
    	
    	val link_front_left_wheel = robotdescriptionpackageFactory.createLink
    	link_front_left_wheel.name = "front_left_wheel_link"
    	link_front_left_wheel.mass = 2
    	VehicleConfigLinkJointSetup::setupCylindricalLink(link_front_left_wheel)
    	
    	jnt_front_left_steer.parent = link_front_steer_left_wheel
    	jnt_front_left_steer.child = link_front_left_wheel
    	jnt_front_right_steer.parent = link_front_steer_right_wheel
    	jnt_front_right_steer.child = link_front_right_wheel
    	
    	VehicleConfigLinkJointSetup::setupSteerJointPlanarDeg(kinematicparam.steeringparameters,
    		jnt_front_left_steer, 1.0
    	)
    	VehicleConfigLinkJointSetup::setupSteerJointPlanarDeg(kinematicparam.steeringparameters,
    		jnt_front_right_steer, 1.0
    	)
    	planeRotation(link_front)
    	// Wheel axis    	    		
    	setupWheelAxle(jnt_rear_left_wheel, jnt_rear_right_wheel, 
    		link_rear, 
    		link_rear_left_wheel, rear_left_wheel_pos,
    		link_rear_right_wheel, rear_right_wheel_pos,
    		wheel_axis,
    		kinematicparam.rear_track
    	)
    	planeRotation(link_rear)
    	// Generate driven joints
    	val link_front_left_wheel_drive = robotdescriptionpackageFactory.createLink
    	link_front_left_wheel_drive.name = "front_left_wheel_link_drive"
    	val link_front_right_wheel_drive = robotdescriptionpackageFactory.createLink
    	link_front_right_wheel_drive.name = "front_right_wheel_link_drive"
    	val link_rear_left_wheel_drive = robotdescriptionpackageFactory.createLink
    	link_rear_left_wheel_drive.name = "rear_left_wheel_link_drive"
    	val link_rear_right_wheel_drive = robotdescriptionpackageFactory.createLink
    	link_rear_right_wheel_drive.name = "rear_right_wheel_link_drive"
    	// Generate wheel joints
    	val jnt_front_left_wheel_drive = robotdescriptionpackageFactory.createJoint
    	jnt_front_left_wheel_drive.name = "joint_wheel_front_left"
    	val jnt_front_right_wheel_drive = robotdescriptionpackageFactory.createJoint
    	jnt_front_right_wheel_drive.name = "joint_wheel_front_right"
    	val jnt_rear_left_wheel_drive = robotdescriptionpackageFactory.createJoint
    	jnt_rear_left_wheel_drive.name = "joint_wheel_rear_left"
    	val jnt_rear_right_wheel_drive = robotdescriptionpackageFactory.createJoint
    	jnt_rear_right_wheel_drive.name = "joint_wheel_rear_right"
    	val wheel_param = kinematicparam.wheelparameters    	
    	/// Setup wheels based on wheel kinematics and dynamics
    	setupWheel(link_front_left_wheel,  link_front_left_wheel_drive,  
    		jnt_front_left_wheel_drive,
    		wheel_param, dynparam.wheeldynamics, geomsettings, -1.0 
    	)
    	setupWheel(link_front_right_wheel, link_front_right_wheel_drive, 
    		jnt_front_right_wheel_drive,
    		wheel_param, dynparam.wheeldynamics, geomsettings, 1.0
    	)
    	setupWheel(link_rear_left_wheel,  link_rear_left_wheel_drive,  
    		jnt_rear_left_wheel_drive,
    		wheel_param, dynparam.wheeldynamics, geomsettings, -1.0
    	)
    	setupWheel(link_rear_right_wheel, link_rear_right_wheel_drive, 
    		jnt_rear_right_wheel_drive,
    		wheel_param, dynparam.wheeldynamics, geomsettings, 1.0
    	)
    	planeRotation(link_front_left_wheel)
    	planeRotation(link_front_right_wheel)
    	planeRotation(link_rear_left_wheel)
    	planeRotation(link_rear_right_wheel)
    	planeRotation(link_front_left_wheel_drive)
    	planeRotation(link_front_right_wheel_drive)
    	planeRotation(link_rear_left_wheel_drive)
    	planeRotation(link_rear_right_wheel_drive)
    	// Links
    	robot.link.add(root)
    	robot.link.add(link_rear)
    	robot.link.add(link_front)
    	robot.link.add(link_front_left_wheel)
    	robot.link.add(link_front_right_wheel)
    	robot.link.add(link_rear_left_wheel)
    	robot.link.add(link_rear_right_wheel)
    	// Steer
    	robot.link.add(link_front_steer_left_wheel)
    	robot.link.add(link_front_steer_right_wheel)
    	// Wheels
    	robot.link.add(link_front_left_wheel_drive)
    	robot.link.add(link_front_right_wheel_drive)
    	robot.link.add(link_rear_left_wheel_drive)
    	robot.link.add(link_rear_right_wheel_drive)
    	// Joints
    	robot.joint.add(jnt_root_front)
    	robot.joint.add(jnt_root_rear)
    	robot.joint.add(jnt_front_left_wheel)
    	robot.joint.add(jnt_front_right_wheel)
    	robot.joint.add(jnt_rear_left_wheel)
    	robot.joint.add(jnt_rear_right_wheel)
    	// Steer
    	robot.joint.add(jnt_front_left_steer)
    	robot.joint.add(jnt_front_right_steer)
    	// Wheels
    	robot.joint.add(jnt_front_left_wheel_drive)
    	robot.joint.add(jnt_front_right_wheel_drive)
    	robot.joint.add(jnt_rear_left_wheel_drive)
    	robot.joint.add(jnt_rear_right_wheel_drive)    	
    	System.out.println("Kinematic structure successfully setup")
    	
    }
    
    def void writeDocumentToText(PrintStream pw){
    	val TransformerFactory transformerFactory = TransformerFactory
		            .newInstance();
	    val Transformer transformer = transformerFactory.newTransformer();
	    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	    transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
	    val DOMSource source = new DOMSource(doc);
	    transformer.transform(source, new StreamResult(pw));
    }
    
    val BatchTransformationRule<Match,Matcher> kinematicRule = createRule(ValidKinematicParameters.instance)
    	.action[
    		val vehicle = it.v
        	val kinematic_param = it.kinparam
        	val geom_settings = it.v.geometrysettings
        	val dyn_param = it.v.dynamicparameters
        	
        	if (robot!==null && doc !== null){
        		setupRobot(vehicle, kinematic_param, geom_settings, dyn_param)
        		
        	}
        ].build

    new(Robot robot, ViatraQueryEngine engine) {
        //this.resource = resource
        this.engine = engine
        this.robot = robot
        transformation = BatchTransformation.forEngine(engine).build
        statements = transformation.transformationStatements
        manipulation = new SimpleModelManipulations(engine)
        
        this.resource = robot.eResource
        doc = doc_builder.newDocument
        prepare(engine)
        // Create EMF scope and EMF IncQuery engine based on the resource
        createTransformation
    }
    
    def Document getDocument(){
    	return doc;
    }

    def execute() {
    	System.out.println("Executing Config-Kineto transformation rules");
		kinematicRule.fireOne
		ValidKinematicParameters
    }

    private def createTransformation() {
        
    }
}
