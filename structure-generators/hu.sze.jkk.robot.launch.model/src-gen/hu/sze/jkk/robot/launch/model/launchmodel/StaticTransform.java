/**
 */
package hu.sze.jkk.robot.launch.model.launchmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Transform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.robot.launch.model.launchmodel.StaticTransform#getVec3 <em>Vec3</em>}</li>
 *   <li>{@link hu.sze.jkk.robot.launch.model.launchmodel.StaticTransform#getRpy <em>Rpy</em>}</li>
 *   <li>{@link hu.sze.jkk.robot.launch.model.launchmodel.StaticTransform#getLink_from <em>Link from</em>}</li>
 *   <li>{@link hu.sze.jkk.robot.launch.model.launchmodel.StaticTransform#getLink_to <em>Link to</em>}</li>
 * </ul>
 *
 * @see hu.sze.jkk.robot.launch.model.launchmodel.LaunchmodelPackage#getStaticTransform()
 * @model
 * @generated
 */
public interface StaticTransform extends Node {
	/**
	 * Returns the value of the '<em><b>Vec3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vec3</em>' containment reference.
	 * @see #setVec3(Vec3)
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.LaunchmodelPackage#getStaticTransform_Vec3()
	 * @model containment="true"
	 * @generated
	 */
	Vec3 getVec3();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.robot.launch.model.launchmodel.StaticTransform#getVec3 <em>Vec3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vec3</em>' containment reference.
	 * @see #getVec3()
	 * @generated
	 */
	void setVec3(Vec3 value);

	/**
	 * Returns the value of the '<em><b>Rpy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpy</em>' containment reference.
	 * @see #setRpy(Vec3)
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.LaunchmodelPackage#getStaticTransform_Rpy()
	 * @model containment="true"
	 * @generated
	 */
	Vec3 getRpy();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.robot.launch.model.launchmodel.StaticTransform#getRpy <em>Rpy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rpy</em>' containment reference.
	 * @see #getRpy()
	 * @generated
	 */
	void setRpy(Vec3 value);

	/**
	 * Returns the value of the '<em><b>Link from</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link from</em>' attribute.
	 * @see #setLink_from(String)
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.LaunchmodelPackage#getStaticTransform_Link_from()
	 * @model
	 * @generated
	 */
	String getLink_from();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.robot.launch.model.launchmodel.StaticTransform#getLink_from <em>Link from</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link from</em>' attribute.
	 * @see #getLink_from()
	 * @generated
	 */
	void setLink_from(String value);

	/**
	 * Returns the value of the '<em><b>Link to</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link to</em>' attribute.
	 * @see #setLink_to(String)
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.LaunchmodelPackage#getStaticTransform_Link_to()
	 * @model
	 * @generated
	 */
	String getLink_to();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.robot.launch.model.launchmodel.StaticTransform#getLink_to <em>Link to</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link to</em>' attribute.
	 * @see #getLink_to()
	 * @generated
	 */
	void setLink_to(String value);

} // StaticTransform
