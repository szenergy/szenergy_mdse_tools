package hu.sze.jkk.vehicle.config.generator.generategazeboplugin;


import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import hu.sze.jkk.vehicle.config.vehicleconfig.VehicleconfigPackage;
import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import hu.sze.jkk.vehicle.config.vehicleconfig.Vehicle;
import hu.sze.jkk.vehicle.config.generator.generators.GenerateGazeboPlugin;
import java.io.PrintStream;

public class Main {

	public static void main(String[] args) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(VehicleconfigPackage.eNS_URI, VehicleconfigPackage.eINSTANCE);
		final File file = new File(args[0]);
		final URI uri = URI.createFileURI(file.getAbsolutePath());
		Resource resource = resourceSet.getResource(uri, true);
		final Vehicle vehicle = (Vehicle)resource.getContents().get(0);
		final File plugin_source = new File(args[1]);
		try {
			final PrintStream pw = new PrintStream(plugin_source);
			pw.println(GenerateGazeboPlugin.generateGazeboPlugin(vehicle));
		}catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
	}

}
