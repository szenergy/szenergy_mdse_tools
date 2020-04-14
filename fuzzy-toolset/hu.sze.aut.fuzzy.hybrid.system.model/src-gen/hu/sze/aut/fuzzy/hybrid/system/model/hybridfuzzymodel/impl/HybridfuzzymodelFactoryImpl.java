/**
 */
package hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl;

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
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.HybridfuzzymodelFactory;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.HybridfuzzymodelPackage;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Lambda;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.LessExpression;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Location;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.MembershipFunction;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Rule;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.RuleSet;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Transition;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Trapezoid;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Variable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HybridfuzzymodelFactoryImpl extends EFactoryImpl implements HybridfuzzymodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HybridfuzzymodelFactory init() {
		try {
			HybridfuzzymodelFactory theHybridfuzzymodelFactory = (HybridfuzzymodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(HybridfuzzymodelPackage.eNS_URI);
			if (theHybridfuzzymodelFactory != null) {
				return theHybridfuzzymodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HybridfuzzymodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HybridfuzzymodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case HybridfuzzymodelPackage.SYSTEM:
			return createSystem();
		case HybridfuzzymodelPackage.LOCATION:
			return createLocation();
		case HybridfuzzymodelPackage.TRANSITION:
			return createTransition();
		case HybridfuzzymodelPackage.VARIABLE:
			return createVariable();
		case HybridfuzzymodelPackage.FUZZY_RULE:
			return createFuzzyRule();
		case HybridfuzzymodelPackage.RULE_SET:
			return createRuleSet();
		case HybridfuzzymodelPackage.RULE:
			return createRule();
		case HybridfuzzymodelPackage.CRISP_GUARD:
			return createCrispGuard();
		case HybridfuzzymodelPackage.ACTION_DEFINITION:
			return createActionDefinition();
		case HybridfuzzymodelPackage.DISCRETE_EVENT:
			return createDiscreteEvent();
		case HybridfuzzymodelPackage.DISCRETE_EVENT_RULESET:
			return createDiscreteEventRuleset();
		case HybridfuzzymodelPackage.CONTINUOUS_EVENT_RULESET:
			return createContinuousEventRuleset();
		case HybridfuzzymodelPackage.FUZZY_SET:
			return createFuzzySet();
		case HybridfuzzymodelPackage.MEMBERSHIP_FUNCTION:
			return createMembershipFunction();
		case HybridfuzzymodelPackage.LAMBDA:
			return createLambda();
		case HybridfuzzymodelPackage.TRAPEZOID:
			return createTrapezoid();
		case HybridfuzzymodelPackage.ALPHA:
			return createAlpha();
		case HybridfuzzymodelPackage.CLOCK:
			return createClock();
		case HybridfuzzymodelPackage.LESS_EXPRESSION:
			return createLessExpression();
		case HybridfuzzymodelPackage.GREATER_EXPRESSION:
			return createGreaterExpression();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuzzyRule createFuzzyRule() {
		FuzzyRuleImpl fuzzyRule = new FuzzyRuleImpl();
		return fuzzyRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleSet createRuleSet() {
		RuleSetImpl ruleSet = new RuleSetImpl();
		return ruleSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrispGuard createCrispGuard() {
		CrispGuardImpl crispGuard = new CrispGuardImpl();
		return crispGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionDefinition createActionDefinition() {
		ActionDefinitionImpl actionDefinition = new ActionDefinitionImpl();
		return actionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteEvent createDiscreteEvent() {
		DiscreteEventImpl discreteEvent = new DiscreteEventImpl();
		return discreteEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteEventRuleset createDiscreteEventRuleset() {
		DiscreteEventRulesetImpl discreteEventRuleset = new DiscreteEventRulesetImpl();
		return discreteEventRuleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousEventRuleset createContinuousEventRuleset() {
		ContinuousEventRulesetImpl continuousEventRuleset = new ContinuousEventRulesetImpl();
		return continuousEventRuleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuzzySet createFuzzySet() {
		FuzzySetImpl fuzzySet = new FuzzySetImpl();
		return fuzzySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MembershipFunction createMembershipFunction() {
		MembershipFunctionImpl membershipFunction = new MembershipFunctionImpl();
		return membershipFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lambda createLambda() {
		LambdaImpl lambda = new LambdaImpl();
		return lambda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trapezoid createTrapezoid() {
		TrapezoidImpl trapezoid = new TrapezoidImpl();
		return trapezoid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alpha createAlpha() {
		AlphaImpl alpha = new AlphaImpl();
		return alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock createClock() {
		ClockImpl clock = new ClockImpl();
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessExpression createLessExpression() {
		LessExpressionImpl lessExpression = new LessExpressionImpl();
		return lessExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterExpression createGreaterExpression() {
		GreaterExpressionImpl greaterExpression = new GreaterExpressionImpl();
		return greaterExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HybridfuzzymodelPackage getHybridfuzzymodelPackage() {
		return (HybridfuzzymodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HybridfuzzymodelPackage getPackage() {
		return HybridfuzzymodelPackage.eINSTANCE;
	}

} //HybridfuzzymodelFactoryImpl
