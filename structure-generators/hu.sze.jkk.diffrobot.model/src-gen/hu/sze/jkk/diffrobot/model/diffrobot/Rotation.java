/**
 */
package hu.sze.jkk.diffrobot.model.diffrobot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.Rotation#getRoll <em>Roll</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.Rotation#getPitch <em>Pitch</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.Rotation#getYaw <em>Yaw</em>}</li>
 * </ul>
 *
 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getRotation()
 * @model
 * @generated
 */
public interface Rotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roll</em>' attribute.
	 * @see #setRoll(double)
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getRotation_Roll()
	 * @model
	 * @generated
	 */
	double getRoll();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.diffrobot.model.diffrobot.Rotation#getRoll <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll</em>' attribute.
	 * @see #getRoll()
	 * @generated
	 */
	void setRoll(double value);

	/**
	 * Returns the value of the '<em><b>Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pitch</em>' attribute.
	 * @see #setPitch(double)
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getRotation_Pitch()
	 * @model
	 * @generated
	 */
	double getPitch();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.diffrobot.model.diffrobot.Rotation#getPitch <em>Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pitch</em>' attribute.
	 * @see #getPitch()
	 * @generated
	 */
	void setPitch(double value);

	/**
	 * Returns the value of the '<em><b>Yaw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yaw</em>' attribute.
	 * @see #setYaw(double)
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getRotation_Yaw()
	 * @model
	 * @generated
	 */
	double getYaw();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.diffrobot.model.diffrobot.Rotation#getYaw <em>Yaw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yaw</em>' attribute.
	 * @see #getYaw()
	 * @generated
	 */
	void setYaw(double value);

} // Rotation
