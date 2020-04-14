/**
 */
package hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.util;

import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.ActionDefinition;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Alpha;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Clock;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.ContinuousEventRuleset;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.CrispGuard;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.DiscreteEvent;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.DiscreteEventRuleset;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.FuzzyRule;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.FuzzySet;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.GreaterExpression;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.HybridfuzzymodelPackage;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Lambda;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.LessExpression;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Location;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.MembershipFunction;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.RelationExpression;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Rule;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.RuleSet;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Transition;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Trapezoid;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Variable;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.HybridfuzzymodelPackage
 * @generated
 */
public class HybridfuzzymodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HybridfuzzymodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HybridfuzzymodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HybridfuzzymodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HybridfuzzymodelSwitch<Adapter> modelSwitch = new HybridfuzzymodelSwitch<Adapter>() {
		@Override
		public Adapter caseSystem(hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System object) {
			return createSystemAdapter();
		}

		@Override
		public Adapter caseLocation(Location object) {
			return createLocationAdapter();
		}

		@Override
		public Adapter caseTransition(Transition object) {
			return createTransitionAdapter();
		}

		@Override
		public Adapter caseVariable(Variable object) {
			return createVariableAdapter();
		}

		@Override
		public Adapter caseFuzzyRule(FuzzyRule object) {
			return createFuzzyRuleAdapter();
		}

		@Override
		public Adapter caseRuleSet(RuleSet object) {
			return createRuleSetAdapter();
		}

		@Override
		public Adapter caseRule(Rule object) {
			return createRuleAdapter();
		}

		@Override
		public Adapter caseCrispGuard(CrispGuard object) {
			return createCrispGuardAdapter();
		}

		@Override
		public Adapter caseActionDefinition(ActionDefinition object) {
			return createActionDefinitionAdapter();
		}

		@Override
		public Adapter caseDiscreteEvent(DiscreteEvent object) {
			return createDiscreteEventAdapter();
		}

		@Override
		public Adapter caseDiscreteEventRuleset(DiscreteEventRuleset object) {
			return createDiscreteEventRulesetAdapter();
		}

		@Override
		public Adapter caseContinuousEventRuleset(ContinuousEventRuleset object) {
			return createContinuousEventRulesetAdapter();
		}

		@Override
		public Adapter caseFuzzySet(FuzzySet object) {
			return createFuzzySetAdapter();
		}

		@Override
		public Adapter caseMembershipFunction(MembershipFunction object) {
			return createMembershipFunctionAdapter();
		}

		@Override
		public Adapter caseLambda(Lambda object) {
			return createLambdaAdapter();
		}

		@Override
		public Adapter caseTrapezoid(Trapezoid object) {
			return createTrapezoidAdapter();
		}

		@Override
		public Adapter caseAlpha(Alpha object) {
			return createAlphaAdapter();
		}

		@Override
		public Adapter caseClock(Clock object) {
			return createClockAdapter();
		}

		@Override
		public Adapter caseRelationExpression(RelationExpression object) {
			return createRelationExpressionAdapter();
		}

		@Override
		public Adapter caseLessExpression(LessExpression object) {
			return createLessExpressionAdapter();
		}

		@Override
		public Adapter caseGreaterExpression(GreaterExpression object) {
			return createGreaterExpressionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.FuzzyRule <em>Fuzzy Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.FuzzyRule
	 * @generated
	 */
	public Adapter createFuzzyRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.RuleSet <em>Rule Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.RuleSet
	 * @generated
	 */
	public Adapter createRuleSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.CrispGuard <em>Crisp Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.CrispGuard
	 * @generated
	 */
	public Adapter createCrispGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.ActionDefinition <em>Action Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.ActionDefinition
	 * @generated
	 */
	public Adapter createActionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.DiscreteEvent <em>Discrete Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.DiscreteEvent
	 * @generated
	 */
	public Adapter createDiscreteEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.DiscreteEventRuleset <em>Discrete Event Ruleset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.DiscreteEventRuleset
	 * @generated
	 */
	public Adapter createDiscreteEventRulesetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.ContinuousEventRuleset <em>Continuous Event Ruleset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.ContinuousEventRuleset
	 * @generated
	 */
	public Adapter createContinuousEventRulesetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.FuzzySet <em>Fuzzy Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.FuzzySet
	 * @generated
	 */
	public Adapter createFuzzySetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.MembershipFunction <em>Membership Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.MembershipFunction
	 * @generated
	 */
	public Adapter createMembershipFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Lambda <em>Lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Lambda
	 * @generated
	 */
	public Adapter createLambdaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Trapezoid <em>Trapezoid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Trapezoid
	 * @generated
	 */
	public Adapter createTrapezoidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Alpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Alpha
	 * @generated
	 */
	public Adapter createAlphaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Clock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Clock
	 * @generated
	 */
	public Adapter createClockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.RelationExpression <em>Relation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.RelationExpression
	 * @generated
	 */
	public Adapter createRelationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.LessExpression <em>Less Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.LessExpression
	 * @generated
	 */
	public Adapter createLessExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.GreaterExpression <em>Greater Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.GreaterExpression
	 * @generated
	 */
	public Adapter createGreaterExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //HybridfuzzymodelAdapterFactory
