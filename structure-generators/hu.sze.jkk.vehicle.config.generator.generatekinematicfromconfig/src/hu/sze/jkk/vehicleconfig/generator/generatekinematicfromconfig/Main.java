package hu.sze.jkk.vehicleconfig.generator.generatekinematicfromconfig;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import hu.sze.jkk.vehicle.config.generator.generators.GenerateXMLConfiguration;
import hu.sze.jkk.vehicle.config.generator.generators.KinematicTreeGenerator;
import hu.sze.jkk.vehicle.config.vehicleconfig.KinematicParameters;
import hu.sze.jkk.vehicle.config.vehicleconfig.Vehicle;
import hu.sze.jkk.vehicle.config.vehicleconfig.VehicleconfigPackage;
import robotdescriptionpackage.Robot;
import robotdescriptionpackage.RobotdescriptionpackageFactory;
import robotdescriptionpackage.RobotdescriptionpackagePackage;

public class Main {

	public static void main(String[] args) {
		ResourceSet resset = new ResourceSetImpl();
		resset.getResourceFactoryRegistry().getExtensionToFactoryMap()
			.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resset.getPackageRegistry().put(VehicleconfigPackage.eNS_URI, 
				VehicleconfigPackage.eINSTANCE);
		resset.getPackageRegistry().put(RobotdescriptionpackagePackage.eNS_URI, 
				RobotdescriptionpackagePackage.eINSTANCE);
		File file = new File(args[0]);
		URI uri = URI.createFileURI(file.getAbsolutePath());
		Resource resource = resset.getResource(uri, true);
		Vehicle vehicle = (Vehicle)(resource.getContents().get(0));
		Robot robot = RobotdescriptionpackageFactory.eINSTANCE.createRobot();
		KinematicParameters kin_param = vehicle.getKinematicparameters();
		KinematicTreeGenerator kintree_gen = new KinematicTreeGenerator();
		try {
			kintree_gen.setResourceSet(resset);
			
			kintree_gen.generateKinematicTreeToFile(resource, args[1]);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
