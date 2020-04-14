/**
 */
package hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuzzy Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.FuzzyRule#getAntecedent <em>Antecedent</em>}</li>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.FuzzyRule#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.HybridfuzzymodelPackage#getFuzzyRule()
 * @model
 * @generated
 */
public interface FuzzyRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Antecedent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antecedent</em>' reference.
	 * @see #setAntecedent(MembershipFunction)
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.HybridfuzzymodelPackage#getFuzzyRule_Antecedent()
	 * @model
	 * @generated
	 */
	MembershipFunction getAntecedent();

	/**
	 * Sets the value of the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.FuzzyRule#getAntecedent <em>Antecedent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent</em>' reference.
	 * @see #getAntecedent()
	 * @generated
	 */
	void setAntecedent(MembershipFunction value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.HybridfuzzymodelPackage#getFuzzyRule_Variable()
	 * @model
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.FuzzyRule#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

} // FuzzyRule
