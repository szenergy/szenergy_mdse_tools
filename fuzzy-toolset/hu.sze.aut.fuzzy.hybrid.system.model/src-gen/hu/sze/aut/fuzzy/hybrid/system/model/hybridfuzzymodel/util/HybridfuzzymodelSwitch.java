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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.HybridfuzzymodelPackage
 * @generated
 */
public class HybridfuzzymodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HybridfuzzymodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HybridfuzzymodelSwitch() {
		if (modelPackage == null) {
			modelPackage = HybridfuzzymodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case HybridfuzzymodelPackage.SYSTEM: {
			hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System system = (hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System) theEObject;
			T result = caseSystem(system);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HybridfuzzymodelPackage.LOCATION: {
			Location location = (Location) theEObject;
			T result = caseLocation(location);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HybridfuzzymodelPackage.TRANSITION: {
			Transition transition = (Transition) theEObject;
			T result = caseTransition(transition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HybridfuzzymodelPackage.VARIABLE: {
			Variable variable = (Variable) theEObject;
			T result = caseVariable(variable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HybridfuzzymodelPackage.FUZZY_RULE: {
			FuzzyRule fuzzyRule = (FuzzyRule) theEObject;
			T result = caseFuzzyRule(fuzzyRule);
			if (result == null)
				result = caseRule(fuzzyRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HybridfuzzymodelPackage.RULE_SET: {
			RuleSet ruleSet = (RuleSet) theEObject;
			T result = caseRuleSet(ruleSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HybridfuzzymodelPackage.RULE: {
			Rule rule = (Rule) theEObject;
			T result = caseRule(rule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HybridfuzzymodelPackage.CRISP_GUARD: {
			CrispGuard crispGuard = (CrispGuard) theEObject;
			T result = caseCrispGuard(crispGuard);
			if (result == null)
				result = caseRule(crispGuard);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HybridfuzzymodelPackage.ACTION_DEFINITION: {
			ActionDefinition actionDefinition = (ActionDefinition) theEObject;
			T result = caseActionDefinition(actionDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HybridfuzzymodelPackage.DISCRETE_EVENT: {
			DiscreteEvent discreteEvent = (DiscreteEvent) theEObject;
			T result = caseDiscreteEvent(discreteEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HybridfuzzymodelPackage.DISCRETE_EVENT_RULESET: {
			DiscreteEventRuleset discreteEventRuleset = (DiscreteEventRuleset) theEObject;
			T result = caseDiscreteEventRuleset(discreteEventRuleset);
			if (result == null)
				result = caseRuleSet(discreteEventRuleset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HybridfuzzymodelPackage.CONTINUOUS_EVENT_RULESET: {
			ContinuousEventRuleset continuousEventRuleset = (ContinuousEventRuleset) theEObject;
			T result = caseContinuousEventRuleset(continuousEventRuleset);
			if (result == null)
				result = caseRuleSet(continuousEventRuleset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HybridfuzzymodelPackage.FUZZY_SET: {
			FuzzySet fuzzySet = (FuzzySet) theEObject;
			T result = caseFuzzySet(fuzzySet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HybridfuzzymodelPackage.MEMBERSHIP_FUNCTION: {
			MembershipFunction membershipFunction = (MembershipFunction) theEObject;
			T result = caseMembershipFunction(membershipFunction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HybridfuzzymodelPackage.LAMBDA: {
			Lambda lambda = (Lambda) theEObject;
			T result = caseLambda(lambda);
			if (result == null)
				result = caseMembershipFunction(lambda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HybridfuzzymodelPackage.TRAPEZOID: {
			Trapezoid trapezoid = (Trapezoid) theEObject;
			T result = caseTrapezoid(trapezoid);
			if (result == null)
				result = caseMembershipFunction(trapezoid);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HybridfuzzymodelPackage.ALPHA: {
			Alpha alpha = (Alpha) theEObject;
			T result = caseAlpha(alpha);
			if (result == null)
				result = caseMembershipFunction(alpha);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HybridfuzzymodelPackage.CLOCK: {
			Clock clock = (Clock) theEObject;
			T result = caseClock(clock);
			if (result == null)
				result = caseVariable(clock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HybridfuzzymodelPackage.RELATION_EXPRESSION: {
			RelationExpression relationExpression = (RelationExpression) theEObject;
			T result = caseRelationExpression(relationExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HybridfuzzymodelPackage.LESS_EXPRESSION: {
			LessExpression lessExpression = (LessExpression) theEObject;
			T result = caseLessExpression(lessExpression);
			if (result == null)
				result = caseRelationExpression(lessExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HybridfuzzymodelPackage.GREATER_EXPRESSION: {
			GreaterExpression greaterExpression = (GreaterExpression) theEObject;
			T result = caseGreaterExpression(greaterExpression);
			if (result == null)
				result = caseRelationExpression(greaterExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuzzy Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuzzy Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuzzyRule(FuzzyRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleSet(RuleSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crisp Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crisp Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrispGuard(CrispGuard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionDefinition(ActionDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteEvent(DiscreteEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Event Ruleset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Event Ruleset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteEventRuleset(DiscreteEventRuleset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuous Event Ruleset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuous Event Ruleset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuousEventRuleset(ContinuousEventRuleset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuzzy Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuzzy Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuzzySet(FuzzySet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Membership Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Membership Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMembershipFunction(MembershipFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lambda</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lambda</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLambda(Lambda object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trapezoid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trapezoid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrapezoid(Trapezoid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alpha</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alpha</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlpha(Alpha object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClock(Clock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationExpression(RelationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessExpression(LessExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterExpression(GreaterExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //HybridfuzzymodelSwitch
