/*
 * generated by Xtext 2.18.0.M3
 */
package hu.sze.aut.diffrobot.dse.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import hu.sze.jkk.diffrobot.model.diffrobot.Robot
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage
import org.eclipse.emf.ecore.resource.ResourceSet
import java.io.ByteArrayOutputStream
import org.eclipse.emf.ecore.util.EcoreUtil
import java.io.ByteArrayInputStream
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DiffRobotDslGenerator extends AbstractGenerator {
	
	val ResourceSet resourceset = new ResourceSetImpl()
	var Resource _resource_robot_output
	
	new(){
		resourceset.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resourceset.getPackageRegistry().put(DiffrobotPackage.eNS_URI, DiffrobotPackage.eINSTANCE);
		
	}

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val Robot robot = resource.allContents.filter[it instanceof Robot].head as Robot
		//val Resource output_resource = Resource.
		val Resource output_resource = resourceset.createResource(resource.URI)
		
		output_resource.contents.add(EcoreUtil.copy(robot))
		val	bin = new ByteArrayOutputStream()
		output_resource.save(bin ,null)
		//fsa.generateFile
		fsa.generateFile("./"+robot.name+".xmi", new ByteArrayInputStream(bin.toByteArray))
		
	}
}
