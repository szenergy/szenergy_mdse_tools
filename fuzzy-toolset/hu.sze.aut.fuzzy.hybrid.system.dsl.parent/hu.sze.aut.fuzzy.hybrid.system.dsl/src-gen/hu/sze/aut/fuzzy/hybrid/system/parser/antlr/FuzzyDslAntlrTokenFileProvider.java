/*
 * generated by Xtext 2.21.0
 */
package hu.sze.aut.fuzzy.hybrid.system.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class FuzzyDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("hu/sze/aut/fuzzy/hybrid/system/parser/antlr/internal/InternalFuzzyDsl.tokens");
	}
}