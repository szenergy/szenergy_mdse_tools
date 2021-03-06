/*
 * generated by Xtext 2.21.0
 */
package hu.sze.aut.fuzzy.hybrid.system.parser.antlr;

import com.google.inject.Inject;
import hu.sze.aut.fuzzy.hybrid.system.parser.antlr.internal.InternalFuzzyDslParser;
import hu.sze.aut.fuzzy.hybrid.system.services.FuzzyDslGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class FuzzyDslParser extends AbstractAntlrParser {

	@Inject
	private FuzzyDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalFuzzyDslParser createParser(XtextTokenStream stream) {
		return new InternalFuzzyDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "HybridSystem";
	}

	public FuzzyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FuzzyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
