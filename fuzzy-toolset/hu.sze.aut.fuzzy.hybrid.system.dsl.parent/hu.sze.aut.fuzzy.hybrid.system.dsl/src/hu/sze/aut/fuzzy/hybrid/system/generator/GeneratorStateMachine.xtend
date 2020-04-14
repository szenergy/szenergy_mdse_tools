package hu.sze.aut.fuzzy.hybrid.system.generator

import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.DiscreteEventRuleset

class GeneratorStateMachine {
	def static LocationNamespace(hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System sys)'''Locations«sys.name»'''
	
	def static templateStateMachine(hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System sys)'''
	#include <functional>
	#include <thread>
	
	enum class «LocationNamespace(sys)» { «FOR s: sys.location SEPARATOR ','» «s.name»«ENDFOR» };
	
	class «sys.name.toFirstUpper»HybridSystem
	{
	private:
		«LocationNamespace(sys)» state;
		«FOR a: sys.actiondefinition»
		std::function cb«a.name.toFirstUpper»; ///< Location
		«ENDFOR»
		// Variables
		«FOR v: sys.variable»
		double «v.name»;
		«ENDFOR»
	protected:
	public:
		«sys.name.toFirstUpper»HybridSystem(): state(Locations«sys.name»::«sys.startlocation.name»)
		{
		}
		
		/*
		 * Variable setters
		 */
		«FOR v: sys.variable»
		void set«v.name.toFirstUpper»(double v)
		{
			«v.name» = v;
		}
		«ENDFOR»
		
		/* 
		 * Setup function callbacks
		 */
		«FOR a: sys.actiondefinition»
		void set«a.name»(std::function<void>& cb)
		{
			cb«a.name.toFirstUpper» = cb;
		}
		«ENDFOR»
		
		«FOR rset: sys.ruleset.filter[it instanceof DiscreteEventRuleset]»
		/* 
		 * Setup reaction event functions for defined discrete events
		 */
		«FOR ev: (rset as DiscreteEventRuleset).discreteevent»
		void react«ev.name»()
		{
			switch(state)
			{
				«FOR t: ev.transition»
				case «LocationNamespace(sys)»::«t.source.name»:
				{
					// ACT TRANSITION: «t.actiondefinition.name.toFirstUpper»
					cb«t.actiondefinition.name.toFirstUpper»();
					// TRANSIT TO STATE
					state = «LocationNamespace(sys)»::«t.target.name»;
					break;
				}
			«ENDFOR»
			}
		}
		«ENDFOR»
		«ENDFOR»
	};
	
	void stepMachine()
	{
		«IF sys.location.filter[it.cyclicaction!==null].size>0»
		switch(state)
		{
		«FOR loc: sys.location.filter[it.cyclicaction!==null]»
		case «LocationNamespace(sys)»::«loc.name»: {
			cb«loc.cyclicaction»();
			break;
		}
		«ENDFOR»
		}
		«ENDIF»
	}
	
	'''
}