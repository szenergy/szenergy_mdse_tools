/**
 */
package hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Event Ruleset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.DiscreteEventRuleset#getDiscreteevent <em>Discreteevent</em>}</li>
 * </ul>
 *
 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.HybridfuzzymodelPackage#getDiscreteEventRuleset()
 * @model
 * @generated
 */
public interface DiscreteEventRuleset extends RuleSet {
	/**
	 * Returns the value of the '<em><b>Discreteevent</b></em>' containment reference list.
	 * The list contents are of type {@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.DiscreteEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discreteevent</em>' containment reference list.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.HybridfuzzymodelPackage#getDiscreteEventRuleset_Discreteevent()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiscreteEvent> getDiscreteevent();

} // DiscreteEventRuleset
