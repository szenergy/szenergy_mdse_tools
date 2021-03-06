/*
 * generated by Xtext 2.21.0
 */
package hu.sze.aut.fuzzy.hybrid.system.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import hu.sze.aut.fuzzy.hybrid.system.FuzzyDslRuntimeModule;
import hu.sze.aut.fuzzy.hybrid.system.FuzzyDslStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class FuzzyDslIdeSetup extends FuzzyDslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new FuzzyDslRuntimeModule(), new FuzzyDslIdeModule()));
	}
	
}
