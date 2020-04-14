/*
 * generated by Xtext 2.21.0
 */
package hu.sze.aut.fuzzy.hybrid.system.formatting2

import com.google.inject.Inject
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.FuzzySet
import hu.sze.aut.fuzzy.hybrid.system.services.FuzzyDslGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class FuzzyDslFormatter extends AbstractFormatter2 {
	
	@Inject extension FuzzyDslGrammarAccess

	def dispatch void format(hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System system, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (location : system.location) {
			location.format
		}
		for (fuzzySet : system.fuzzyset) {
			fuzzySet.format
		}
		for (ruleSet : system.ruleset) {
			ruleSet.format
		}
		for (actionDefinition : system.actiondefinition) {
			actionDefinition.format
		}
		for (variable : system.variable) {
			variable.format
		}
		for (transition : system.transition) {
			transition.format
		}
	}

	def dispatch void format(FuzzySet fuzzySet, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (membershipFunction : fuzzySet.membershipfunction) {
			membershipFunction.format
		}
	}
	
	// TODO: implement for DiscreteEventRuleset, ContinuousEventRuleset
}
