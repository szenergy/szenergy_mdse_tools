package hu.sze.kinematics.description.generator

import org.w3c.dom.Element
import org.w3c.dom.Document
import robotdescriptionpackage.Laser
import robotdescriptionpackage.IMU
import robotdescriptionpackage.Lidar
import robotdescriptionpackage.GNSS
import robotdescriptionpackage.Camera

class GenerateUrdfSensor {
	val static double GAUSSIAN_NOISE = 0.008 
	
	def static Element generateLaserElement(Document doc, Laser l) {
		val Element laser_element = doc.createElement("gazebo");
		laser_element.setAttribute("reference", l.getLink().getName());
		
		val Element sensor_element = doc.createElement("sensor");
		sensor_element.setAttribute("name", l.getName());
		laser_element.appendChild(sensor_element);
		val Element update_rate_element = doc.createElement("update_rate");
		update_rate_element.appendChild(doc.createTextNode(Integer.toString(l.getUpdate_rate())));
		sensor_element.appendChild(update_rate_element);
		val Element ray_element = doc.createElement("ray");
		val Element scan_element = doc.createElement("scan");
		val Element horizontal_element = doc.createElement("horizontal");
		val Element sample_element = doc.createElement("samples");
		sample_element.appendChild(doc.createTextNode(Integer.toString(l.getSamples())));
		horizontal_element.appendChild(sample_element);
		val Element resolution_element = doc.createElement("resolution");
		resolution_element.appendChild(doc.createTextNode(Integer.toString(l.getResolution())));
		horizontal_element.appendChild(resolution_element);
		val Element anglemin_element = doc.createElement("min_angle");
		anglemin_element.appendChild(doc.createTextNode(Float.toString((l.getAngle_min()*Math.PI/180.0f)as float)));
		horizontal_element.appendChild(anglemin_element);
		val Element anglemax_element = doc.createElement("max_angle");
		anglemax_element.appendChild(doc.createTextNode(Float.toString((l.getAngle_max()*Math.PI/180.0f) as float)));
		horizontal_element.appendChild(anglemax_element);
		scan_element.appendChild(horizontal_element);
		ray_element.appendChild(scan_element);
		
		val Element range_element = doc.createElement("range");
		val Element min_range_element = doc.createElement("min");
		min_range_element.appendChild(doc.createTextNode(Double.toString(l.getRange_min())));
		range_element.appendChild(min_range_element);
		val Element max_range_element = doc.createElement("max");
		max_range_element.appendChild(doc.createTextNode(Double.toString(l.getRange_max())));
		range_element.appendChild(max_range_element);
		val Element resolution_range_element = doc.createElement("resolution");
		resolution_range_element.appendChild(doc.createTextNode(Double.toString(l.getResolution_distance())));
		range_element.appendChild(resolution_range_element);
		ray_element.appendChild(range_element);
				
		scan_element.appendChild(horizontal_element);
		sensor_element.appendChild(ray_element);
		sensor_element.setAttribute("type", "ray");
		
		val Element plugin_element = doc.createElement("plugin");
		plugin_element.setAttribute("name", "laser_"+l.getName());
		plugin_element.setAttribute("filename", "libgazebo_ros_laser.so");
		val Element topicname_element = doc.createElement("topicName");
		// TODO: recreate topic names
		//topicname_element.appendChild(doc.createTextNode(l.getTopic().getName()));
		topicname_element.appendChild(doc.createTextNode('''/«l.name»/scan'''));
		plugin_element.appendChild(topicname_element);
		val Element framename_element = doc.createElement("frameName");
		framename_element.appendChild(doc.createTextNode(l.getLink().getName()));
		plugin_element.appendChild(framename_element);
		sensor_element.appendChild(plugin_element);
		
		return laser_element;
	}
	
	def static Element generateIMUElement(Document doc, IMU imu){
		System.out.println("Generating IMU");
		val Element imu_root_element = doc.createElement("gazebo");
		imu_root_element.setAttribute("reference", imu.getLink().getName());
		
		val Element sensor_element = doc.createElement("sensor");
		sensor_element.setAttribute("name", imu.getName());
		/// Set type
		sensor_element.setAttribute("type", "imu");
		
		val Element update_rate_element = doc.createElement("update_rate");
		update_rate_element.appendChild(doc.createTextNode(Integer.toString(imu.getUpdate_rate())));
		sensor_element.appendChild(update_rate_element);
		/// Plugin setup
		val Element plugin_element = doc.createElement("plugin");
		plugin_element.setAttribute("name", "imu_"+imu.getName()+"_plugin");
		plugin_element.setAttribute("filename", "libgazebo_ros_imu_sensor.so");
		val Element topicname_element = doc.createElement("topicName");
		plugin_element.appendChild(topicname_element)
		// TODO: recreate topic names
		topicname_element.appendChild(doc.createTextNode("/imu"));
		/// TF frame setup
		val Element framename_element = doc.createElement("frameName");
		framename_element.appendChild(doc.createTextNode(imu.getLink().getName()));
		/// Body name for sensor
		val Element bodyNameElement = doc.createElement("bodyName");
		bodyNameElement.appendChild(doc.createTextNode(imu.getLink().getName()));
		plugin_element.appendChild(bodyNameElement)
		/// Update rate Hz
		val Element updateRateElement = doc.createElement("updateRateHZ");
		updateRateElement.appendChild(doc.createTextNode(imu.update_rate.toString));
		plugin_element.appendChild(updateRateElement)
		/// Tree wrapup
		plugin_element.appendChild(framename_element);
		sensor_element.appendChild(plugin_element);
		imu_root_element.appendChild(sensor_element)
		return imu_root_element;
	}
	
	
	def static generateLidarElement(Document doc, Lidar lidar) {
		System.out.println("Generating LIDAR element");
		val Element lidar_root_element = doc.createElement("gazebo");
		lidar_root_element.setAttribute("reference", lidar.getLink().getName());
		
		val Element sensor_element = doc.createElement("sensor");
		sensor_element.setAttribute("name", lidar.getName());
		sensor_element.setAttribute("type", "gpu_ray");
		
		val Element update_rate_element = doc.createElement("update_rate");
		update_rate_element.appendChild(doc.createTextNode(Integer.toString(lidar.getUpdate_rate())));
		sensor_element.appendChild(update_rate_element);
		lidar_root_element.appendChild(sensor_element)
		/// Ray setup: general Gazebo markup
		val Element ray_element = doc.createElement("ray");
		sensor_element.appendChild(ray_element);
		/// Scan element setup
		val Element scan_element = doc.createElement("scan");
		ray_element.appendChild(scan_element);
		/// Horizontal range setup generation
		val Element horizontal_range_element = doc.createElement("horizontal");
		scan_element.appendChild(horizontal_range_element);
		val Element horzSamplesElement = doc.createElement("samples");
		horzSamplesElement.appendChild(doc.createTextNode(lidar.horizontal_angle_limit.sample.toString));
		horizontal_range_element.appendChild(horzSamplesElement)
		val Element horzResolutionElement = doc.createElement("resolution");
		horzResolutionElement.appendChild(doc.createTextNode(lidar.horizontal_angle_limit.resolution.toString));
		horizontal_range_element.appendChild(horzResolutionElement)
		val Element minangleHorzElement = doc.createElement("min_angle");
		minangleHorzElement.appendChild(doc.createTextNode(lidar.horizontal_angle_limit.min_angle.toString));
		horizontal_range_element.appendChild(minangleHorzElement)
		val Element maxangleHorzElement = doc.createElement("max_angle");
		maxangleHorzElement.appendChild(doc.createTextNode(lidar.horizontal_angle_limit.max_angle.toString));
		horizontal_range_element.appendChild(maxangleHorzElement)
		/// Vertical range element generation
		val Element vertical_range_element = doc.createElement("vertical");
		scan_element.appendChild(vertical_range_element);
		val Element vertSamplesElement = doc.createElement("samples");
		vertSamplesElement.appendChild(doc.createTextNode(lidar.vertical_angle_limit.sample.toString));
		vertical_range_element.appendChild(vertSamplesElement)
		val Element vertResolutionElement = doc.createElement("resolution");
		vertResolutionElement.appendChild(doc.createTextNode(lidar.vertical_angle_limit.resolution.toString));
		vertical_range_element.appendChild(vertResolutionElement)
		val Element minangleVertElement = doc.createElement("min_angle");
		minangleVertElement.appendChild(doc.createTextNode(lidar.vertical_angle_limit.min_angle.toString));
		vertical_range_element.appendChild(minangleVertElement)
		val Element maxangleVertElement = doc.createElement("max_angle");
		maxangleVertElement.appendChild(doc.createTextNode(lidar.vertical_angle_limit.max_angle.toString));
		vertical_range_element.appendChild(maxangleVertElement)
		/// Range element setup
		val Element range_element = doc.createElement("range");
		val Element minRangeElement = doc.createElement("min");
		minRangeElement.appendChild(doc.createTextNode(lidar.rangeprop.measMin.toString));
		range_element.appendChild(minRangeElement)
		val Element maxRangeElement = doc.createElement("max");
		maxRangeElement.appendChild(doc.createTextNode(lidar.rangeprop.measMax.toString));
		range_element.appendChild(maxRangeElement)
		val Element rangeResolutionElement = doc.createElement("resolution");
		rangeResolutionElement.appendChild(doc.createTextNode(lidar.rangeprop.resolution.toString));
		range_element.appendChild(rangeResolutionElement)
		/// Range node setup
		ray_element.appendChild(range_element);
		/// Generate Velodyne plugin description
		val Element plugin_element = doc.createElement("plugin");
		plugin_element.setAttribute("name", "velodyne_"+lidar.getName());
		plugin_element.setAttribute("filename", "libgazebo_ros_velodyne_gpu_laser.so");
		val Element topicname_element = doc.createElement("topicName");
		// TODO: recreate topic names
		topicname_element.appendChild(doc.createTextNode('''/«lidar.name.toLowerCase»/points_raw'''));
		plugin_element.appendChild(topicname_element);
		val Element framename_element = doc.createElement("frameName");
		framename_element.appendChild(doc.createTextNode(lidar.getLink().getName()));
		/// Velodyne plugin setup
		plugin_element.appendChild(framename_element);
		sensor_element.appendChild(plugin_element);
		val Element minrange_element = doc.createElement("min_range");
		minrange_element.appendChild(doc.createTextNode(lidar.rangeprop.measMin.toString));
		plugin_element.appendChild(minrange_element)
		val Element maxrange_element = doc.createElement("max_range");
		maxrange_element.appendChild(doc.createTextNode(lidar.rangeprop.measMax.toString));
		plugin_element.appendChild(maxrange_element)
		val Element gaussiannoise_element = doc.createElement("gaussianNoise");
		gaussiannoise_element.appendChild(doc.createTextNode(GAUSSIAN_NOISE.toString));
		plugin_element.appendChild(gaussiannoise_element)
		
		return lidar_root_element;
	}
	
	def static generateGnssElement(Document doc, GNSS gnss) {
		// TODO: finish it
		System.out.println('''Generating GNSS element: «gnss.name» «gnss»''');
		val Element gnss_root_element = doc.createElement("gazebo");
		//gnss_root_element.setAttribute("reference", gnss.getLink().getName());
		
		val Element plugin_element = doc.createElement("plugin");
		plugin_element.setAttribute("name", gnss.getName());
		plugin_element.setAttribute("filename", "libhector_gazebo_ros_gps.so");
		// Plugin setup
		val Element updaterate_element = doc.createElement("updateRate");
		updaterate_element.appendChild(doc.createTextNode(gnss.update_rate.toString));
		plugin_element.appendChild(updaterate_element)
		val Element bodyNameElementlement = doc.createElement("bodyName");
		bodyNameElementlement.appendChild(doc.createTextNode(gnss.link.name));
		plugin_element.appendChild(bodyNameElementlement)
		val Element frame_element = doc.createElement("frameId");
		frame_element.appendChild(doc.createTextNode(gnss.link.name));
		plugin_element.appendChild(frame_element)
		/// GPS Fix
		val Element topicNameElementlement = doc.createElement("topicName");
		topicNameElementlement.appendChild(doc.createTextNode("/gps/fix"));
		plugin_element.appendChild(topicNameElementlement)
		/// GPS fix velocity
		val Element topicVelocityNameElementlement = doc.createElement("velocityTopicName");
		topicVelocityNameElementlement.appendChild(doc.createTextNode("/gps/fix_velocity"));
		plugin_element.appendChild(topicVelocityNameElementlement)
		/// Reference coodinates
		val Element referenceLatitudeElement = doc.createElement("referenceLatitude");
		System.out.println('''«gnss.geolocation.latitude» «gnss.geolocation.longitude» «gnss.geolocation.height»''')
		referenceLatitudeElement.appendChild(doc.createTextNode(Double.toString(gnss.geolocation.latitude)));
		plugin_element.appendChild(referenceLatitudeElement)
		val Element referenceLongitudeElement = doc.createElement("referenceLongitude");
		referenceLongitudeElement.appendChild(doc.createTextNode(Double.toString(gnss.geolocation.longitude)));
		plugin_element.appendChild(referenceLongitudeElement)
		val Element referenceAltitudeElement = doc.createElement("referenceAltitude");
		referenceAltitudeElement.appendChild(doc.createTextNode(Double.toString(gnss.geolocation.height)));
		plugin_element.appendChild(referenceAltitudeElement)
		/// Set heading to 90 degs
		val Element referenceHeadingElement = doc.createElement("referenceHeading");
		referenceHeadingElement.appendChild(doc.createTextNode(Double.toString(90)));
		plugin_element.appendChild(referenceHeadingElement)
		/// Wrap up
		gnss_root_element.appendChild(plugin_element)
		return gnss_root_element;
	}
	
	def static generateCameraSubElement(Document doc, Camera camera, String name){
		generateCameraSubElement(doc, camera, name, 0.0);
	}
	
	def static generateCameraSubElement(Document doc, Camera camera, String name, double offset){
		val Element camera_root_element = doc.createElement("camera");
		camera_root_element.setAttribute("name", name)
		/// Shift basewidth
		val poseElement = doc.createElement("pose")
		poseElement.appendChild(doc.createTextNode('''«offset» 0 0 0 0 0'''))
		camera_root_element.appendChild(poseElement)
		/// Camera parameters
		val hfovElement = doc.createElement("horizontal_fov")
        hfovElement.appendChild(doc.createTextNode(Double.toString(camera.cameraparameters.horizontal_fov)))
        camera_root_element.appendChild(hfovElement)
        /// Image setup
        val imageElement = doc.createElement("image")
        val widthElement = doc.createElement("width")
        widthElement.appendChild(doc.createTextNode(Integer.toString(camera.cameraparameters.width)))
        imageElement.appendChild(widthElement)
        val heightElement = doc.createElement("height")
        heightElement.appendChild(doc.createTextNode(Integer.toString(camera.cameraparameters.height)))
        imageElement.appendChild(heightElement)
        val formatElement = doc.createElement("format")
        formatElement.appendChild(doc.createTextNode("R8G8B8"))
        imageElement.appendChild(formatElement)
        camera_root_element.appendChild(imageElement)
        /// Clip setup
        val clipElement = doc.createElement("clip")
        val nearElement = doc.createElement("near")
        nearElement.appendChild(doc.createTextNode(Double.toString(camera.cameraparameters.clip_near)))
        clipElement.appendChild(nearElement)
        val farElement = doc.createElement("far")
        farElement.appendChild(doc.createTextNode(Double.toString(camera.cameraparameters.clip_far)))
        clipElement.appendChild(farElement)
        camera_root_element.appendChild(clipElement)
		/// Wrap up
		return camera_root_element
	}
	
	def static generateCameraElement(Document doc, Camera camera) {
		System.out.println("Generating Camera");
		val Element camera_root_element = doc.createElement("gazebo");
		camera_root_element.setAttribute("reference", camera.getLink().getName());
		/// Set name
		val Element sensor_element = doc.createElement("sensor");
		sensor_element.setAttribute("name", camera.getName());
		/// Setup update rate
		val Element update_rate_element = doc.createElement("update_rate");
        update_rate_element.appendChild(doc.createTextNode(Integer.toString(camera.getUpdate_rate())));
        sensor_element.appendChild(update_rate_element);
        /// Plugin setup
        val Element plugin_element = doc.createElement("plugin");
        plugin_element.setAttribute("name", "camera_"+camera.getName()+"_plugin");
        /// Set name of camera
        val Element camera_name_element = doc.createElement("cameraName");
        camera_name_element.appendChild(doc.createTextNode(camera.name));
        plugin_element.appendChild(camera_name_element)
		/// Set type
		switch (camera.type){
			case RGB: {
				sensor_element.setAttribute("type", "camera");
				plugin_element.setAttribute("filename", "libgazebo_ros_camera.so");
                val Element topicname_element = doc.createElement("imageTopicName");
                topicname_element.appendChild(doc.createTextNode('''/«camera.name»/image_raw'''));
                plugin_element.appendChild(topicname_element)
				sensor_element.appendChild(generateCameraSubElement(doc, camera, camera.name+"_main"))
			}
			case STEREO: {
				/// Set plugin to multi-camera
				sensor_element.setAttribute("type", "multicamera");
				plugin_element.setAttribute("filename", "libgazebo_ros_multicamera.so");
                val Element topicname_element = doc.createElement("imageTopicName");
                topicname_element.appendChild(doc.createTextNode('''image_raw'''));
                plugin_element.appendChild(topicname_element)
                // Add left and right cameras
                sensor_element.appendChild(generateCameraSubElement(doc, camera, camera.name+"_right", -0.07))
                sensor_element.appendChild(generateCameraSubElement(doc, camera, camera.name+"_left", 0.07))
			}
			case DEPTH: {
				
			}
		}
		/// TF frame setup
		val Element framename_element = doc.createElement("frameName");
		framename_element.appendChild(doc.createTextNode(camera.getLink().getName()));
		/// Body name for sensor
		/// Update rate Hz
		/// Tree wrapup
		plugin_element.appendChild(framename_element);
		sensor_element.appendChild(plugin_element);
		camera_root_element.appendChild(sensor_element)
		return camera_root_element;
	}
}
