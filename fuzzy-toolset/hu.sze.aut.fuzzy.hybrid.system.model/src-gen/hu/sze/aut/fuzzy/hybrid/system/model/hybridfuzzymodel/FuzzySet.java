/**
 */
package hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuzzy Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.FuzzySet#getName <em>Name</em>}</li>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.FuzzySet#getMembershipfunction <em>Membershipfunction</em>}</li>
 * </ul>
 *
 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.HybridfuzzymodelPackage#getFuzzySet()
 * @model
 * @generated
 */
public interface FuzzySet extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.HybridfuzzymodelPackage#getFuzzySet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.FuzzySet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Membershipfunction</b></em>' containment reference list.
	 * The list contents are of type {@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.MembershipFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Membershipfunction</em>' containment reference list.
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.HybridfuzzymodelPackage#getFuzzySet_Membershipfunction()
	 * @model containment="true"
	 * @generated
	 */
	EList<MembershipFunction> getMembershipfunction();

} // FuzzySet
