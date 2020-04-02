package hu.sze.jkk.ros.code.generator.plugin

import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import java.io.File
import org.eclipse.emf.common.util.URI
import hu.sze.jkk.ros.code.generator.pim.model.roscodegenerator.RoscodegeneratorPackage
import hu.sze.jkk.ros.code.generator.pim.model.roscodegenerator.ROSPackage

class Program {
	def static void main(String[] args) {
		val ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(RoscodegeneratorPackage.eNS_URI, RoscodegeneratorPackage.eINSTANCE);
		val File file = new File("../hu.sze.jkk.ros.code.generator.pim.examples/examples/purepursuit.xmi");
		val URI uri = URI.createFileURI(file.getAbsolutePath());
		val Resource resource = resourceSet.getResource(uri, true);
		resource.allContents.filter[it instanceof ROSPackage].forEach[
			val ros_package = it as ROSPackage
			GenerateNodeModule::generateSourceCode(resource, ros_package, args.get(0)) 
		]
		
	}
}
