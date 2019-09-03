package hu.sze.jkk.vehicle.config.generator.generators;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import hu.sze.jkk.vehicle.config.generator.batch.transformation.SensorToStaticTransformation;
import hu.sze.jkk.vehicle.config.vehicleconfig.Vehicle;
import hu.sze.jkk.vehicle.config.vehicleconfig.VehicleconfigPackage;

public class GenerateStaticTfFromVehicleConfig {

	public static void main(String[] args) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(VehicleconfigPackage.eNS_URI, VehicleconfigPackage.eINSTANCE);		 
		final File file = new File("/home/kyberszittya/jkk_git/src/szenergy-modeling-sysml/structure-generators/hu.sze.jkk.vehicle.config.example/configs/NissanLeaf.xmi");
		
		final URI uri = URI.createFileURI(file.getAbsolutePath());
		Resource resource = resourceSet.getResource(uri, true);
		SensorToStaticTransformation sensor_transform = new SensorToStaticTransformation(resource);
		sensor_transform.execute();
		final Vehicle vehicle = (Vehicle)resource.getContents().get(0);
		GenerateRosTfLaunch roslaunch = new GenerateRosTfLaunch();
		roslaunch.createXMLDocument(sensor_transform.getLaunch());
		
		//final File plugin_source = new File(args[1]);
		final PrintStream pw = new PrintStream(System.out);
		roslaunch.writeDocumentToText(pw);
		/*
		try {
			final PrintStream pw = new PrintStream(System.out);
			pw.println();
		}catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
		*/
	}

}
