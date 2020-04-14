/*
 * generated by Xtext 2.21.0
 */
package hu.sze.aut.fuzzy.hybrid.system.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class FuzzyDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
		val sys = resource.allContents.filter[it instanceof hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System].head as hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System
		fsa.generateFile('''«sys.name».hpp''', GeneratorStateMachine.templateStateMachine(sys))
	}
}
