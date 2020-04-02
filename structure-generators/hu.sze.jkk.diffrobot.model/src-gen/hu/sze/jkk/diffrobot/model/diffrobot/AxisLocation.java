/**
 */
package hu.sze.jkk.diffrobot.model.diffrobot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axis Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.AxisLocation#getWheelaxis <em>Wheelaxis</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.AxisLocation#getDisplacement <em>Displacement</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.AxisLocation#getRotation <em>Rotation</em>}</li>
 * </ul>
 *
 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getAxisLocation()
 * @model
 * @generated
 */
public interface AxisLocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Wheelaxis</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis#getAxislocation <em>Axislocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wheelaxis</em>' container reference.
	 * @see #setWheelaxis(WheelAxis)
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getAxisLocation_Wheelaxis()
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis#getAxislocation
	 * @model opposite="axislocation" transient="false"
	 * @generated
	 */
	WheelAxis getWheelaxis();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.diffrobot.model.diffrobot.AxisLocation#getWheelaxis <em>Wheelaxis</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wheelaxis</em>' container reference.
	 * @see #getWheelaxis()
	 * @generated
	 */
	void setWheelaxis(WheelAxis value);

	/**
	 * Returns the value of the '<em><b>Displacement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displacement</em>' containment reference.
	 * @see #setDisplacement(Displacement)
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getAxisLocation_Displacement()
	 * @model containment="true"
	 * @generated
	 */
	Displacement getDisplacement();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.diffrobot.model.diffrobot.AxisLocation#getDisplacement <em>Displacement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displacement</em>' containment reference.
	 * @see #getDisplacement()
	 * @generated
	 */
	void setDisplacement(Displacement value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' containment reference.
	 * @see #setRotation(Rotation)
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getAxisLocation_Rotation()
	 * @model containment="true"
	 * @generated
	 */
	Rotation getRotation();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.diffrobot.model.diffrobot.AxisLocation#getRotation <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' containment reference.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(Rotation value);

} // AxisLocation
