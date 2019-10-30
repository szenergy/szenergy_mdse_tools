package hu.sze.jkk.vehicle.config.generator.batch.transformation

import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformation
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformationStatements
import hu.sze.jkk.vehicle.dse.validation.BasicConstraints
import robotdescriptionpackage.RobotdescriptionpackagePackage
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.emf.ecore.resource.Resource
import org.w3c.dom.Document
import robotdescriptionpackage.Robot
import hu.sze.jkk.vehicle.config.vehicleconfig.VehicleconfigPackage
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations
import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory
import hu.sze.jkk.vehicle.dse.validation.SensorNodeElements.Match
import hu.sze.jkk.vehicle.dse.validation.SensorNodeElements.Matcher
import hu.sze.jkk.vehicle.dse.validation.SensorNodeElements
import robotdescriptionpackage.Joint
import robotdescriptionpackage.Link
import robotdescriptionpackage.Sphere

import hu.sze.jkk.vehicle.config.vehicleconfig.LIDAR
import hu.sze.jkk.vehicle.config.vehicleconfig.Sensor
import robotdescriptionpackage.Lidar
import hu.sze.jkk.vehicle.config.vehicleconfig.Laser
import hu.sze.jkk.vehicle.config.vehicleconfig.ImuSensor
import hu.sze.jkk.vehicle.config.vehicleconfig.GNSS
import hu.sze.jkk.vehicle.config.vehicleconfig.Camera
import robotdescriptionpackage.CameraType

class InvalidSensorModel extends Exception{
	
}

class SensorConfigToSensor {
	extension BatchTransformation transformation
    extension BatchTransformationStatements statements
    extension BatchTransformationRuleFactory = new BatchTransformationRuleFactory
    extension IModelManipulations manipulation
        
    val extension BasicConstraints basicConstraint = BasicConstraints.instance
    
    val extension VehicleconfigPackage vehicleconfigPackage = VehicleconfigPackage.eINSTANCE
    val extension RobotdescriptionpackagePackage kintreePackage =  RobotdescriptionpackagePackage.eINSTANCE
        
    protected Resource resource
    protected Document doc 
    
    // Documents
    protected DocumentBuilder doc_builder = DocumentBuilderFactory.newInstance().newDocumentBuilder
    
    
    val ViatraQueryEngine engine;
    
    var Robot robot
    
    def sensorKinematics(Link root_link, Sensor abstract_sensor, robotdescriptionpackage.Sensor sensor){
    	val Link sensor_link = robotdescriptionpackageFactory.createLink
		sensor_link.name = "link_"+abstract_sensor.name
		sensor_link.visual += robotdescriptionpackageFactory.createVisual
		sensor_link.visual.get(0).name = "viz_"+sensor_link.name
		val Sphere sphere = robotdescriptionpackageFactory.createSphere
		sphere.radius = 0.1f
		sensor_link.visual.get(0).geometry = sphere
		sensor_link.mass = abstract_sensor.mass
		sensor_link.collision += robotdescriptionpackageFactory.createCollision
		sensor_link.collision.get(0).name = "coll_"+sensor_link.name
		sensor_link.collision.get(0).parent_visual = sensor_link.visual.get(0)
		val Joint sensor_jnt = robotdescriptionpackageFactory.createJoint
		sensor_jnt.name = "jnt_" + abstract_sensor.name
		sensor_jnt.parent = root_link
		sensor_jnt.child = sensor_link
		sensor_jnt.axis = robotdescriptionpackageFactory.createAxis
		sensor_jnt.axis.z = 1.0
		sensor_jnt.origin = robotdescriptionpackageFactory.createOrigin
		sensor_jnt.origin.xyz = robotdescriptionpackageFactory.createVec3
		if (abstract_sensor.displacement!==null){
			sensor_jnt.origin.xyz.x = abstract_sensor.displacement.x
			sensor_jnt.origin.xyz.y = abstract_sensor.displacement.y
			sensor_jnt.origin.xyz.z = abstract_sensor.displacement.z			
		}else{
			sensor_jnt.origin.xyz.x = 0.0
			sensor_jnt.origin.xyz.y = 0.0
			sensor_jnt.origin.xyz.z = 0.0
		}		
		robot.joint.add(sensor_jnt)
		robot.link.add(sensor_link)
		/// Append link to sensor
		sensor.link = sensor_link
		robot.sensor.add(sensor)
    }
    /// Select the proper sensor class
    val BatchTransformationRule<Match,Matcher> sensorElementsRule = createRule
    	.precondition(SensorNodeElements.Matcher.querySpecification)
    	.action[
    		val Link root_link = robot.link.get(0)
    		/// Select laser
    		if (it.s instanceof Laser){
    			System.out.println('''Adding LaserScan: «it.s»''');
    			val robotdescriptionpackage.Laser las = 
    				robotdescriptionpackageFactory.createLaser()
    			val Laser abstractl = it.s as Laser
    			/// Setup laser defintiion in URDF	
    			las.angle_max = abstractl.angleparameters.max_angle
    			las.angle_min = abstractl.angleparameters.min_angle
    			las.range_min = abstractl.distancesettings.min_distance
    			las.range_max = abstractl.distancesettings.max_distance
    			las.samples = abstractl.angleparameters.samples
    			las.resolution_distance = abstractl.distancesettings.resolution
    			las.resolution = abstractl.angleparameters.resolution as int    	
    			las.name = "laser"		
    			
    			las.update_rate = abstractl.update_rate as int
    			/// Setup static kinematic structure
    			sensorKinematics(root_link, abstractl, las)
    			
    		}
    		/// Select IMU defintion
    		else if (it.s instanceof ImuSensor){
    			System.out.println('''Adding IMU: «it.s»''');
    			val robotdescriptionpackage.IMU imu = robotdescriptionpackageFactory.createIMU
    			val ImuSensor abstractimu = it.s as ImuSensor
    			
    			imu.name = abstractimu.name
    			imu.update_rate = abstractimu.update_rate as int
    			/// Setup static kinematic structure
    			sensorKinematics(root_link, abstractimu, imu)
    		}
    		/// LIDAR definition
    		else if (it.s instanceof LIDAR){
    			System.out.println('''Adding LIDAR: «it.s»''');
    			val abstractlidar = it.s as LIDAR
    			val Lidar lidar = robotdescriptionpackageFactory.createLidar
    			
    			lidar.name = abstractlidar.name    			
    			if (abstractlidar.horizontal_angle_param !== null) {
    				lidar.horizontal_angle_limit = robotdescriptionpackageFactory.createAngleLimit
    				lidar.horizontal_angle_limit.resolution = abstractlidar.horizontal_angle_param.resolution
	    			lidar.horizontal_angle_limit.sample = abstractlidar.horizontal_angle_param.samples
	    			lidar.horizontal_angle_limit.max_angle = abstractlidar.horizontal_angle_param.max_angle*Math.PI/180.0
	    			lidar.horizontal_angle_limit.min_angle = abstractlidar.horizontal_angle_param.min_angle*Math.PI/180.0
    			}
    			else {
    				throw new InvalidSensorModel
    			}
    			if (abstractlidar.vertical_angle_param !== null){
    				lidar.vertical_angle_limit = robotdescriptionpackageFactory.createAngleLimit
	    			lidar.vertical_angle_limit.resolution = abstractlidar.vertical_angle_param.resolution
	    			lidar.vertical_angle_limit.sample = abstractlidar.vertical_angle_param.samples
	    			lidar.vertical_angle_limit.max_angle = abstractlidar.vertical_angle_param.max_angle*Math.PI/180.0
	    			lidar.vertical_angle_limit.min_angle = abstractlidar.vertical_angle_param.min_angle*Math.PI/180.0    				
    			}
    			else
    			{
    				throw new InvalidSensorModel
    			}
    			
    			lidar.rangeprop = robotdescriptionpackageFactory.createRangeProp
    			lidar.rangeprop.measMax = abstractlidar.max_range
    			lidar.rangeprop.measMin = abstractlidar.min_range
    			lidar.rangeprop.resolution = abstractlidar.resolution
    			lidar.update_rate = abstractlidar.update_rate as int
    			/// Setup static kinematic structure
    			sensorKinematics(root_link, abstractlidar, lidar)
    		}
    		/// GNSS configuration
    		else if (it.s instanceof GNSS){
    			val abstractgnss = it.s as GNSS;
    			val robotdescriptionpackage.GNSS gnss = robotdescriptionpackageFactory.createGNSS
    			/// Setup basic parameters
    			gnss.name = abstractgnss.name
    			gnss.update_rate = abstractgnss.update_rate as int
    			/// Setup geolocation parameters
    			gnss.geolocation = robotdescriptionpackageFactory.createGeoLocation
    			gnss.geolocation.longitude = abstractgnss.geolocation.longitude
    			gnss.geolocation.latitude = abstractgnss.geolocation.latitude
    			gnss.geolocation.height = abstractgnss.geolocation.height
    			/// Setup kinematic link
    			sensorKinematics(root_link, abstractgnss, gnss)
    		}
    		/// Camera configuration
    		else if (it.s instanceof Camera){
    			val abstractcamera = it.s as Camera
    			val robotdescriptionpackage.Camera camera = robotdescriptionpackageFactory.createCamera
    			/// Setup basic stuff
    			camera.name = abstractcamera.name
    			camera.update_rate = abstractcamera.update_rate as int
    			switch (abstractcamera.type)
    			{
    				case RGB: {
    					System.out.println('''Adding RGB camera: «it.s»''');
    					camera.type = CameraType::RGB
    				}
    				case DEPTH: {
    					camera.type = CameraType::DEPTH
    				}
    				case STEREO: {
    					System.out.println('''Adding stereo camera: «it.s»''');
    					camera.type = CameraType::STEREO
    				}
    			}
    			/// Camera parameter setup
    			camera.cameraparameters = robotdescriptionpackageFactory.createCameraParameters
    			camera.cameraparameters.clip_near        = abstractcamera.cameraparameters.clip_near
    			camera.cameraparameters.clip_far         = abstractcamera.cameraparameters.clip_far
    			camera.cameraparameters.height           = abstractcamera.cameraparameters.height
    			camera.cameraparameters.width            = abstractcamera.cameraparameters.width
    			camera.cameraparameters.horizontal_fov   = abstractcamera.cameraparameters.horizontal_fov*Math.PI/180.0
    			/// Setup kinematics
    			sensorKinematics(root_link, abstractcamera, camera)
    		}
    	].build
    	
    new(Robot robot, ViatraQueryEngine engine){
    	this.resource = resource
    	this.engine = engine
    	this.robot = robot
    	transformation = BatchTransformation.forEngine(engine).build
    	statements = transformation.transformationStatements
        manipulation = new SimpleModelManipulations(engine)
        
        this.resource = robot.eResource
        doc = doc_builder.newDocument
        prepare(engine)
        
    }
    
    def execute() {
    	System.out.println("Executing Sensor mapping transformation rules");
		sensorElementsRule.fireAllCurrent
		SensorNodeElements
    }
}
