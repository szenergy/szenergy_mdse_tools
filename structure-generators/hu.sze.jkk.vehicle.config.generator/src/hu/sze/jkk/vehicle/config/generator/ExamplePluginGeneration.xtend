package hu.sze.jkk.vehicle.config.generator

import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import hu.sze.jkk.vehicle.config.vehicleconfig.VehicleconfigPackage
import java.io.File
import org.eclipse.emf.common.util.URI
import hu.sze.jkk.vehicle.config.vehicleconfig.Vehicle
import hu.sze.jkk.vehicle.config.generator.generators.GenerateGazeboPlugin
import java.io.PrintStream

class ExamplePluginGeneration {
	def static void main(String[] args) {
		val ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(VehicleconfigPackage.eNS_URI, VehicleconfigPackage.eINSTANCE);
		val File file = new File(args.get(0));
		val uri = URI.createFileURI(file.getAbsolutePath())
		val Resource resource = resourceSet.getResource(uri, true);
		val vehicle = resource.allContents.filter[it instanceof Vehicle].toList.get(0) as Vehicle;
		val File plugin_source = new File(args.get(1));
		val PrintStream pw = new PrintStream(plugin_source)
		pw.println(GenerateGazeboPlugin.generateGazeboPlugin(vehicle))
	}
}