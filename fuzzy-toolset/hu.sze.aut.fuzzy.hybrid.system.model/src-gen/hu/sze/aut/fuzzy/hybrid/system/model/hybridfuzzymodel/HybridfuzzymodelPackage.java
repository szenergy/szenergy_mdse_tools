/**
 */
package hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.HybridfuzzymodelFactory
 * @model kind="package"
 * @generated
 */
public interface HybridfuzzymodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hybridfuzzymodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://aut.sze.hu/hybridfuzzymodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hybridfuzzymodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HybridfuzzymodelPackage eINSTANCE = hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.SystemImpl
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Ruleset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__RULESET = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 4;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__RATE = 5;

	/**
	 * The feature id for the '<em><b>Actiondefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ACTIONDEFINITION = 6;

	/**
	 * The feature id for the '<em><b>Errorlocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ERRORLOCATION = 7;

	/**
	 * The feature id for the '<em><b>Startlocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__STARTLOCATION = 8;

	/**
	 * The feature id for the '<em><b>Fuzzyset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__FUZZYSET = 9;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.LocationImpl
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Continuouseventruleset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CONTINUOUSEVENTRULESET = 1;

	/**
	 * The feature id for the '<em><b>Cyclicaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CYCLICACTION = 2;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.TransitionImpl
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Invariant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INVARIANT = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 3;

	/**
	 * The feature id for the '<em><b>Actiondefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ACTIONDEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRIGGER = 5;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.VariableImpl
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.RuleImpl
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.FuzzyRuleImpl <em>Fuzzy Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.FuzzyRuleImpl
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getFuzzyRule()
	 * @generated
	 */
	int FUZZY_RULE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_RULE__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_RULE__ANTECEDENT = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_RULE__VARIABLE = RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fuzzy Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Fuzzy Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_RULE_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.RuleSetImpl <em>Rule Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.RuleSetImpl
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getRuleSet()
	 * @generated
	 */
	int RULE_SET = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET__NAME = 0;

	/**
	 * The number of structural features of the '<em>Rule Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Rule Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.CrispGuardImpl <em>Crisp Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.CrispGuardImpl
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getCrispGuard()
	 * @generated
	 */
	int CRISP_GUARD = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRISP_GUARD__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Relationexpression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRISP_GUARD__RELATIONEXPRESSION = RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Crisp Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRISP_GUARD_FEATURE_COUNT = RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Crisp Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRISP_GUARD_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.ActionDefinitionImpl <em>Action Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.ActionDefinitionImpl
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getActionDefinition()
	 * @generated
	 */
	int ACTION_DEFINITION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEFINITION__TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Reset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEFINITION__RESET = 2;

	/**
	 * The number of structural features of the '<em>Action Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEFINITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Action Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.DiscreteEventImpl <em>Discrete Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.DiscreteEventImpl
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getDiscreteEvent()
	 * @generated
	 */
	int DISCRETE_EVENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_EVENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_EVENT__TRANSITION = 1;

	/**
	 * The number of structural features of the '<em>Discrete Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_EVENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Discrete Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.DiscreteEventRulesetImpl <em>Discrete Event Ruleset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.DiscreteEventRulesetImpl
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getDiscreteEventRuleset()
	 * @generated
	 */
	int DISCRETE_EVENT_RULESET = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_EVENT_RULESET__NAME = RULE_SET__NAME;

	/**
	 * The feature id for the '<em><b>Discreteevent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_EVENT_RULESET__DISCRETEEVENT = RULE_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Discrete Event Ruleset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_EVENT_RULESET_FEATURE_COUNT = RULE_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Discrete Event Ruleset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_EVENT_RULESET_OPERATION_COUNT = RULE_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.ContinuousEventRulesetImpl <em>Continuous Event Ruleset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.ContinuousEventRulesetImpl
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getContinuousEventRuleset()
	 * @generated
	 */
	int CONTINUOUS_EVENT_RULESET = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_EVENT_RULESET__NAME = RULE_SET__NAME;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_EVENT_RULESET__RULE = RULE_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Continuous Event Ruleset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_EVENT_RULESET_FEATURE_COUNT = RULE_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Continuous Event Ruleset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_EVENT_RULESET_OPERATION_COUNT = RULE_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.FuzzySetImpl <em>Fuzzy Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.FuzzySetImpl
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getFuzzySet()
	 * @generated
	 */
	int FUZZY_SET = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_SET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Membershipfunction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_SET__MEMBERSHIPFUNCTION = 1;

	/**
	 * The number of structural features of the '<em>Fuzzy Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_SET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Fuzzy Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.MembershipFunctionImpl <em>Membership Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.MembershipFunctionImpl
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getMembershipFunction()
	 * @generated
	 */
	int MEMBERSHIP_FUNCTION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_FUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_FUNCTION__VARIABLE = 1;

	/**
	 * The number of structural features of the '<em>Membership Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_FUNCTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Membership Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.LambdaImpl <em>Lambda</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.LambdaImpl
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getLambda()
	 * @generated
	 */
	int LAMBDA = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA__NAME = MEMBERSHIP_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA__VARIABLE = MEMBERSHIP_FUNCTION__VARIABLE;

	/**
	 * The feature id for the '<em><b>A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA__A = MEMBERSHIP_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA__B = MEMBERSHIP_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA__U = MEMBERSHIP_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Lambda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_FEATURE_COUNT = MEMBERSHIP_FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Lambda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_OPERATION_COUNT = MEMBERSHIP_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.TrapezoidImpl <em>Trapezoid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.TrapezoidImpl
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getTrapezoid()
	 * @generated
	 */
	int TRAPEZOID = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAPEZOID__NAME = MEMBERSHIP_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAPEZOID__VARIABLE = MEMBERSHIP_FUNCTION__VARIABLE;

	/**
	 * The feature id for the '<em><b>A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAPEZOID__A = MEMBERSHIP_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAPEZOID__B = MEMBERSHIP_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trapezoid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAPEZOID_FEATURE_COUNT = MEMBERSHIP_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trapezoid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAPEZOID_OPERATION_COUNT = MEMBERSHIP_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.AlphaImpl <em>Alpha</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.AlphaImpl
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getAlpha()
	 * @generated
	 */
	int ALPHA = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA__NAME = MEMBERSHIP_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA__VARIABLE = MEMBERSHIP_FUNCTION__VARIABLE;

	/**
	 * The feature id for the '<em><b>A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA__A = MEMBERSHIP_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA__B = MEMBERSHIP_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_FEATURE_COUNT = MEMBERSHIP_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Alpha</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_OPERATION_COUNT = MEMBERSHIP_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.ClockImpl <em>Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.ClockImpl
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getClock()
	 * @generated
	 */
	int CLOCK = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__NAME = VARIABLE__NAME;

	/**
	 * The number of structural features of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.RelationExpressionImpl <em>Relation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.RelationExpressionImpl
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getRelationExpression()
	 * @generated
	 */
	int RELATION_EXPRESSION = 18;

	/**
	 * The feature id for the '<em><b>C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_EXPRESSION__C = 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_EXPRESSION__VARIABLE = 1;

	/**
	 * The number of structural features of the '<em>Relation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Relation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.LessExpressionImpl <em>Less Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.LessExpressionImpl
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getLessExpression()
	 * @generated
	 */
	int LESS_EXPRESSION = 19;

	/**
	 * The feature id for the '<em><b>C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EXPRESSION__C = RELATION_EXPRESSION__C;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EXPRESSION__VARIABLE = RELATION_EXPRESSION__VARIABLE;

	/**
	 * The number of structural features of the '<em>Less Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EXPRESSION_FEATURE_COUNT = RELATION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Less Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EXPRESSION_OPERATION_COUNT = RELATION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.GreaterExpressionImpl <em>Greater Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.GreaterExpressionImpl
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getGreaterExpression()
	 * @generated
	 */
	int GREATER_EXPRESSION = 20;

	/**
	 * The feature id for the '<em><b>C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EXPRESSION__C = RELATION_EXPRESSION__C;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EXPRESSION__VARIABLE = RELATION_EXPRESSION__VARIABLE;

	/**
	 * The number of structural features of the '<em>Greater Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EXPRESSION_FEATURE_COUNT = RELATION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Greater Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EXPRESSION_OPERATION_COUNT = RELATION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System#getTransition()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Transition();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System#getLocation()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System#getVariable()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Variable();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System#getRuleset <em>Ruleset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ruleset</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System#getRuleset()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Ruleset();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System#getRate()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Rate();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System#getActiondefinition <em>Actiondefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actiondefinition</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System#getActiondefinition()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Actiondefinition();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System#getErrorlocation <em>Errorlocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Errorlocation</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System#getErrorlocation()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Errorlocation();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System#getStartlocation <em>Startlocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Startlocation</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System#getStartlocation()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Startlocation();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System#getFuzzyset <em>Fuzzyset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuzzyset</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System#getFuzzyset()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Fuzzyset();

	/**
	 * Returns the meta object for class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Location#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Location#getName()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Name();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Location#getContinuouseventruleset <em>Continuouseventruleset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Continuouseventruleset</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Location#getContinuouseventruleset()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Continuouseventruleset();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Location#getCyclicaction <em>Cyclicaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cyclicaction</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Location#getCyclicaction()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Cyclicaction();

	/**
	 * Returns the meta object for class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Transition#getInvariant <em>Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invariant</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Transition#getInvariant()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Invariant();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Transition#getActiondefinition <em>Actiondefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actiondefinition</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Transition#getActiondefinition()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Actiondefinition();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Transition#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trigger</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Transition#getTrigger()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Trigger();

	/**
	 * Returns the meta object for class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.FuzzyRule <em>Fuzzy Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuzzy Rule</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.FuzzyRule
	 * @generated
	 */
	EClass getFuzzyRule();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.FuzzyRule#getAntecedent <em>Antecedent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Antecedent</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.FuzzyRule#getAntecedent()
	 * @see #getFuzzyRule()
	 * @generated
	 */
	EReference getFuzzyRule_Antecedent();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.FuzzyRule#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.FuzzyRule#getVariable()
	 * @see #getFuzzyRule()
	 * @generated
	 */
	EReference getFuzzyRule_Variable();

	/**
	 * Returns the meta object for class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.RuleSet <em>Rule Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Set</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.RuleSet
	 * @generated
	 */
	EClass getRuleSet();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.RuleSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.RuleSet#getName()
	 * @see #getRuleSet()
	 * @generated
	 */
	EAttribute getRuleSet_Name();

	/**
	 * Returns the meta object for class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.CrispGuard <em>Crisp Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crisp Guard</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.CrispGuard
	 * @generated
	 */
	EClass getCrispGuard();

	/**
	 * Returns the meta object for the containment reference '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.CrispGuard#getRelationexpression <em>Relationexpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationexpression</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.CrispGuard#getRelationexpression()
	 * @see #getCrispGuard()
	 * @generated
	 */
	EReference getCrispGuard_Relationexpression();

	/**
	 * Returns the meta object for class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.ActionDefinition <em>Action Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Definition</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.ActionDefinition
	 * @generated
	 */
	EClass getActionDefinition();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.ActionDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.ActionDefinition#getName()
	 * @see #getActionDefinition()
	 * @generated
	 */
	EAttribute getActionDefinition_Name();

	/**
	 * Returns the meta object for the reference list '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.ActionDefinition#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transition</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.ActionDefinition#getTransition()
	 * @see #getActionDefinition()
	 * @generated
	 */
	EReference getActionDefinition_Transition();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.ActionDefinition#getReset <em>Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reset</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.ActionDefinition#getReset()
	 * @see #getActionDefinition()
	 * @generated
	 */
	EReference getActionDefinition_Reset();

	/**
	 * Returns the meta object for class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.DiscreteEvent <em>Discrete Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Event</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.DiscreteEvent
	 * @generated
	 */
	EClass getDiscreteEvent();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.DiscreteEvent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.DiscreteEvent#getName()
	 * @see #getDiscreteEvent()
	 * @generated
	 */
	EAttribute getDiscreteEvent_Name();

	/**
	 * Returns the meta object for the reference list '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.DiscreteEvent#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transition</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.DiscreteEvent#getTransition()
	 * @see #getDiscreteEvent()
	 * @generated
	 */
	EReference getDiscreteEvent_Transition();

	/**
	 * Returns the meta object for class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.DiscreteEventRuleset <em>Discrete Event Ruleset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Event Ruleset</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.DiscreteEventRuleset
	 * @generated
	 */
	EClass getDiscreteEventRuleset();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.DiscreteEventRuleset#getDiscreteevent <em>Discreteevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Discreteevent</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.DiscreteEventRuleset#getDiscreteevent()
	 * @see #getDiscreteEventRuleset()
	 * @generated
	 */
	EReference getDiscreteEventRuleset_Discreteevent();

	/**
	 * Returns the meta object for class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.ContinuousEventRuleset <em>Continuous Event Ruleset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continuous Event Ruleset</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.ContinuousEventRuleset
	 * @generated
	 */
	EClass getContinuousEventRuleset();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.ContinuousEventRuleset#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.ContinuousEventRuleset#getRule()
	 * @see #getContinuousEventRuleset()
	 * @generated
	 */
	EReference getContinuousEventRuleset_Rule();

	/**
	 * Returns the meta object for class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.FuzzySet <em>Fuzzy Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuzzy Set</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.FuzzySet
	 * @generated
	 */
	EClass getFuzzySet();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.FuzzySet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.FuzzySet#getName()
	 * @see #getFuzzySet()
	 * @generated
	 */
	EAttribute getFuzzySet_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.FuzzySet#getMembershipfunction <em>Membershipfunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Membershipfunction</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.FuzzySet#getMembershipfunction()
	 * @see #getFuzzySet()
	 * @generated
	 */
	EReference getFuzzySet_Membershipfunction();

	/**
	 * Returns the meta object for class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.MembershipFunction <em>Membership Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Membership Function</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.MembershipFunction
	 * @generated
	 */
	EClass getMembershipFunction();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.MembershipFunction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.MembershipFunction#getName()
	 * @see #getMembershipFunction()
	 * @generated
	 */
	EAttribute getMembershipFunction_Name();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.MembershipFunction#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.MembershipFunction#getVariable()
	 * @see #getMembershipFunction()
	 * @generated
	 */
	EReference getMembershipFunction_Variable();

	/**
	 * Returns the meta object for class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Lambda <em>Lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lambda</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Lambda
	 * @generated
	 */
	EClass getLambda();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Lambda#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Lambda#getA()
	 * @see #getLambda()
	 * @generated
	 */
	EAttribute getLambda_A();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Lambda#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Lambda#getB()
	 * @see #getLambda()
	 * @generated
	 */
	EAttribute getLambda_B();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Lambda#getU <em>U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>U</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Lambda#getU()
	 * @see #getLambda()
	 * @generated
	 */
	EAttribute getLambda_U();

	/**
	 * Returns the meta object for class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Trapezoid <em>Trapezoid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trapezoid</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Trapezoid
	 * @generated
	 */
	EClass getTrapezoid();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Trapezoid#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Trapezoid#getA()
	 * @see #getTrapezoid()
	 * @generated
	 */
	EAttribute getTrapezoid_A();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Trapezoid#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Trapezoid#getB()
	 * @see #getTrapezoid()
	 * @generated
	 */
	EAttribute getTrapezoid_B();

	/**
	 * Returns the meta object for class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Alpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alpha</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Alpha
	 * @generated
	 */
	EClass getAlpha();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Alpha#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Alpha#getA()
	 * @see #getAlpha()
	 * @generated
	 */
	EAttribute getAlpha_A();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Alpha#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Alpha#getB()
	 * @see #getAlpha()
	 * @generated
	 */
	EAttribute getAlpha_B();

	/**
	 * Returns the meta object for class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Clock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Clock
	 * @generated
	 */
	EClass getClock();

	/**
	 * Returns the meta object for class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.RelationExpression <em>Relation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Expression</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.RelationExpression
	 * @generated
	 */
	EClass getRelationExpression();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.RelationExpression#getC <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>C</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.RelationExpression#getC()
	 * @see #getRelationExpression()
	 * @generated
	 */
	EAttribute getRelationExpression_C();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.RelationExpression#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.RelationExpression#getVariable()
	 * @see #getRelationExpression()
	 * @generated
	 */
	EReference getRelationExpression_Variable();

	/**
	 * Returns the meta object for class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.LessExpression <em>Less Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Expression</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.LessExpression
	 * @generated
	 */
	EClass getLessExpression();

	/**
	 * Returns the meta object for class '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.GreaterExpression <em>Greater Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Expression</em>'.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.GreaterExpression
	 * @generated
	 */
	EClass getGreaterExpression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HybridfuzzymodelFactory getHybridfuzzymodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.SystemImpl
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__TRANSITION = eINSTANCE.getSystem_Transition();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__LOCATION = eINSTANCE.getSystem_Location();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__VARIABLE = eINSTANCE.getSystem_Variable();

		/**
		 * The meta object literal for the '<em><b>Ruleset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__RULESET = eINSTANCE.getSystem_Ruleset();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__RATE = eINSTANCE.getSystem_Rate();

		/**
		 * The meta object literal for the '<em><b>Actiondefinition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ACTIONDEFINITION = eINSTANCE.getSystem_Actiondefinition();

		/**
		 * The meta object literal for the '<em><b>Errorlocation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ERRORLOCATION = eINSTANCE.getSystem_Errorlocation();

		/**
		 * The meta object literal for the '<em><b>Startlocation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__STARTLOCATION = eINSTANCE.getSystem_Startlocation();

		/**
		 * The meta object literal for the '<em><b>Fuzzyset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__FUZZYSET = eINSTANCE.getSystem_Fuzzyset();

		/**
		 * The meta object literal for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.LocationImpl
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__NAME = eINSTANCE.getLocation_Name();

		/**
		 * The meta object literal for the '<em><b>Continuouseventruleset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__CONTINUOUSEVENTRULESET = eINSTANCE.getLocation_Continuouseventruleset();

		/**
		 * The meta object literal for the '<em><b>Cyclicaction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__CYCLICACTION = eINSTANCE.getLocation_Cyclicaction();

		/**
		 * The meta object literal for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.TransitionImpl
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Invariant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__INVARIANT = eINSTANCE.getTransition_Invariant();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '<em><b>Actiondefinition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__ACTIONDEFINITION = eINSTANCE.getTransition_Actiondefinition();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRIGGER = eINSTANCE.getTransition_Trigger();

		/**
		 * The meta object literal for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.VariableImpl
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.FuzzyRuleImpl <em>Fuzzy Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.FuzzyRuleImpl
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getFuzzyRule()
		 * @generated
		 */
		EClass FUZZY_RULE = eINSTANCE.getFuzzyRule();

		/**
		 * The meta object literal for the '<em><b>Antecedent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUZZY_RULE__ANTECEDENT = eINSTANCE.getFuzzyRule_Antecedent();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUZZY_RULE__VARIABLE = eINSTANCE.getFuzzyRule_Variable();

		/**
		 * The meta object literal for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.RuleSetImpl <em>Rule Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.RuleSetImpl
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getRuleSet()
		 * @generated
		 */
		EClass RULE_SET = eINSTANCE.getRuleSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_SET__NAME = eINSTANCE.getRuleSet_Name();

		/**
		 * The meta object literal for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.RuleImpl
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.CrispGuardImpl <em>Crisp Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.CrispGuardImpl
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getCrispGuard()
		 * @generated
		 */
		EClass CRISP_GUARD = eINSTANCE.getCrispGuard();

		/**
		 * The meta object literal for the '<em><b>Relationexpression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRISP_GUARD__RELATIONEXPRESSION = eINSTANCE.getCrispGuard_Relationexpression();

		/**
		 * The meta object literal for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.ActionDefinitionImpl <em>Action Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.ActionDefinitionImpl
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getActionDefinition()
		 * @generated
		 */
		EClass ACTION_DEFINITION = eINSTANCE.getActionDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_DEFINITION__NAME = eINSTANCE.getActionDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_DEFINITION__TRANSITION = eINSTANCE.getActionDefinition_Transition();

		/**
		 * The meta object literal for the '<em><b>Reset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_DEFINITION__RESET = eINSTANCE.getActionDefinition_Reset();

		/**
		 * The meta object literal for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.DiscreteEventImpl <em>Discrete Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.DiscreteEventImpl
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getDiscreteEvent()
		 * @generated
		 */
		EClass DISCRETE_EVENT = eINSTANCE.getDiscreteEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_EVENT__NAME = eINSTANCE.getDiscreteEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_EVENT__TRANSITION = eINSTANCE.getDiscreteEvent_Transition();

		/**
		 * The meta object literal for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.DiscreteEventRulesetImpl <em>Discrete Event Ruleset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.DiscreteEventRulesetImpl
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getDiscreteEventRuleset()
		 * @generated
		 */
		EClass DISCRETE_EVENT_RULESET = eINSTANCE.getDiscreteEventRuleset();

		/**
		 * The meta object literal for the '<em><b>Discreteevent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCRETE_EVENT_RULESET__DISCRETEEVENT = eINSTANCE.getDiscreteEventRuleset_Discreteevent();

		/**
		 * The meta object literal for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.ContinuousEventRulesetImpl <em>Continuous Event Ruleset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.ContinuousEventRulesetImpl
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getContinuousEventRuleset()
		 * @generated
		 */
		EClass CONTINUOUS_EVENT_RULESET = eINSTANCE.getContinuousEventRuleset();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTINUOUS_EVENT_RULESET__RULE = eINSTANCE.getContinuousEventRuleset_Rule();

		/**
		 * The meta object literal for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.FuzzySetImpl <em>Fuzzy Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.FuzzySetImpl
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getFuzzySet()
		 * @generated
		 */
		EClass FUZZY_SET = eINSTANCE.getFuzzySet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUZZY_SET__NAME = eINSTANCE.getFuzzySet_Name();

		/**
		 * The meta object literal for the '<em><b>Membershipfunction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUZZY_SET__MEMBERSHIPFUNCTION = eINSTANCE.getFuzzySet_Membershipfunction();

		/**
		 * The meta object literal for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.MembershipFunctionImpl <em>Membership Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.MembershipFunctionImpl
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getMembershipFunction()
		 * @generated
		 */
		EClass MEMBERSHIP_FUNCTION = eINSTANCE.getMembershipFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBERSHIP_FUNCTION__NAME = eINSTANCE.getMembershipFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBERSHIP_FUNCTION__VARIABLE = eINSTANCE.getMembershipFunction_Variable();

		/**
		 * The meta object literal for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.LambdaImpl <em>Lambda</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.LambdaImpl
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getLambda()
		 * @generated
		 */
		EClass LAMBDA = eINSTANCE.getLambda();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAMBDA__A = eINSTANCE.getLambda_A();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAMBDA__B = eINSTANCE.getLambda_B();

		/**
		 * The meta object literal for the '<em><b>U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAMBDA__U = eINSTANCE.getLambda_U();

		/**
		 * The meta object literal for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.TrapezoidImpl <em>Trapezoid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.TrapezoidImpl
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getTrapezoid()
		 * @generated
		 */
		EClass TRAPEZOID = eINSTANCE.getTrapezoid();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAPEZOID__A = eINSTANCE.getTrapezoid_A();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAPEZOID__B = eINSTANCE.getTrapezoid_B();

		/**
		 * The meta object literal for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.AlphaImpl <em>Alpha</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.AlphaImpl
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getAlpha()
		 * @generated
		 */
		EClass ALPHA = eINSTANCE.getAlpha();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALPHA__A = eINSTANCE.getAlpha_A();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALPHA__B = eINSTANCE.getAlpha_B();

		/**
		 * The meta object literal for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.ClockImpl <em>Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.ClockImpl
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getClock()
		 * @generated
		 */
		EClass CLOCK = eINSTANCE.getClock();

		/**
		 * The meta object literal for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.RelationExpressionImpl <em>Relation Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.RelationExpressionImpl
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getRelationExpression()
		 * @generated
		 */
		EClass RELATION_EXPRESSION = eINSTANCE.getRelationExpression();

		/**
		 * The meta object literal for the '<em><b>C</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_EXPRESSION__C = eINSTANCE.getRelationExpression_C();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_EXPRESSION__VARIABLE = eINSTANCE.getRelationExpression_Variable();

		/**
		 * The meta object literal for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.LessExpressionImpl <em>Less Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.LessExpressionImpl
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getLessExpression()
		 * @generated
		 */
		EClass LESS_EXPRESSION = eINSTANCE.getLessExpression();

		/**
		 * The meta object literal for the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.GreaterExpressionImpl <em>Greater Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.GreaterExpressionImpl
		 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.HybridfuzzymodelPackageImpl#getGreaterExpression()
		 * @generated
		 */
		EClass GREATER_EXPRESSION = eINSTANCE.getGreaterExpression();

	}

} //HybridfuzzymodelPackage
