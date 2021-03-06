/**
 */
package hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discrete Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.DiscreteEvent#getName <em>Name</em>}</li>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.DiscreteEvent#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.HybridfuzzymodelPackage#getDiscreteEvent()
 * @model
 * @generated
 */
public interface DiscreteEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.HybridfuzzymodelPackage#getDiscreteEvent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.DiscreteEvent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference list.
	 * The list contents are of type {@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Transition}.
	 * It is bidirectional and its opposite is '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Transition#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference list.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.HybridfuzzymodelPackage#getDiscreteEvent_Transition()
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Transition#getTrigger
	 * @model opposite="trigger"
	 * @generated
	 */
	EList<Transition> getTransition();

} // DiscreteEvent
