/**
 */
package hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crisp Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.CrispGuard#getRelationexpression <em>Relationexpression</em>}</li>
 * </ul>
 *
 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.HybridfuzzymodelPackage#getCrispGuard()
 * @model
 * @generated
 */
public interface CrispGuard extends Rule {

	/**
	 * Returns the value of the '<em><b>Relationexpression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationexpression</em>' containment reference.
	 * @see #setRelationexpression(RelationExpression)
	 * @see hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.HybridfuzzymodelPackage#getCrispGuard_Relationexpression()
	 * @model containment="true"
	 * @generated
	 */
	RelationExpression getRelationexpression();

	/**
	 * Sets the value of the '{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.CrispGuard#getRelationexpression <em>Relationexpression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationexpression</em>' containment reference.
	 * @see #getRelationexpression()
	 * @generated
	 */
	void setRelationexpression(RelationExpression value);
} // CrispGuard
