/**
 */
package hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Variable#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.HybridfuzzymodelPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.HybridfuzzymodelPackage#getVariable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Variable
