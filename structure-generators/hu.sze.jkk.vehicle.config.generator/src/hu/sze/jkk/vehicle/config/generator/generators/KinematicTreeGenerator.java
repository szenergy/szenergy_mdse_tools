package hu.sze.jkk.vehicle.config.generator.generators;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.w3c.dom.Document;

import hu.sze.jkk.vehicle.config.vehicleconfig.Vehicle;
import hu.sze.jkk.vehicle.config.generator.batch.transformation.SensorConfigToSensor;
import hu.sze.jkk.vehicle.config.generator.batch.transformation.VehicleConfigToKinematicTree;
import hu.sze.kinematics.description.generator.GenerateUrdf;
import robotdescriptionpackage.Robot;
import robotdescriptionpackage.RobotdescriptionpackageFactory;

public class KinematicTreeGenerator {
	private ResourceSet resset;
	
	public void setResourceSet(ResourceSet resset) {
		this.resset = resset;
	}
	
	public void generateKinematicTreeToFile(Resource resource, String filename) throws FileNotFoundException{
		AdvancedViatraQueryEngine engine;
	    VehicleConfigToKinematicTree transformation_vehicle_kinematic;
		Vehicle vehicle = (Vehicle)(resource.getContents().get(0));
		Robot robot = RobotdescriptionpackageFactory.eINSTANCE.createRobot();
		
		engine = AdvancedViatraQueryEngine
				.createUnmanagedEngine(new EMFScope(resset));
		robot.setName(vehicle.getName());
		transformation_vehicle_kinematic = new VehicleConfigToKinematicTree(robot, engine);
		transformation_vehicle_kinematic.execute();
		
		SensorConfigToSensor transformation_sensor = 
				new SensorConfigToSensor(robot, engine);
		transformation_sensor.execute();
		
		Document doc = transformation_vehicle_kinematic.getDocument();
		GenerateUrdf gen_urdf = new GenerateUrdf(doc);	        	
	    gen_urdf.generateURDF(doc, robot);
		
	    /*
	    transformation.writeDocumentToText(new PrintStream(
	    		new File("C:\\Users\\kyberszittya\\jkk_git\\szenergy-modeling-sysml\\hu.sze.jkk.vehicle.config.example\\tf\\"+vehicle.getName()+".urdf")));
	    */
	    transformation_vehicle_kinematic.writeDocumentToText(new PrintStream(new File(filename)));
	    engine.dispose();
	}
}
