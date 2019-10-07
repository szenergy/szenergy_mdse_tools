/**
 */
package hu.sze.jkk.diffrobot.model.diffrobot.impl;

import hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage;
import hu.sze.jkk.diffrobot.model.diffrobot.Rotation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.RotationImpl#getRoll <em>Roll</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.RotationImpl#getPitch <em>Pitch</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.RotationImpl#getYaw <em>Yaw</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotationImpl extends MinimalEObjectImpl.Container implements Rotation {
	/**
	 * The default value of the '{@link #getRoll() <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoll()
	 * @generated
	 * @ordered
	 */
	protected static final double ROLL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRoll() <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoll()
	 * @generated
	 * @ordered
	 */
	protected double roll = ROLL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPitch() <em>Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPitch()
	 * @generated
	 * @ordered
	 */
	protected static final double PITCH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPitch() <em>Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPitch()
	 * @generated
	 * @ordered
	 */
	protected double pitch = PITCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getYaw() <em>Yaw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYaw()
	 * @generated
	 * @ordered
	 */
	protected static final double YAW_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYaw() <em>Yaw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYaw()
	 * @generated
	 * @ordered
	 */
	protected double yaw = YAW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiffrobotPackage.Literals.ROTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRoll() {
		return roll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoll(double newRoll) {
		double oldRoll = roll;
		roll = newRoll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffrobotPackage.ROTATION__ROLL, oldRoll, roll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPitch() {
		return pitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPitch(double newPitch) {
		double oldPitch = pitch;
		pitch = newPitch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffrobotPackage.ROTATION__PITCH, oldPitch, pitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYaw() {
		return yaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYaw(double newYaw) {
		double oldYaw = yaw;
		yaw = newYaw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffrobotPackage.ROTATION__YAW, oldYaw, yaw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DiffrobotPackage.ROTATION__ROLL:
			return getRoll();
		case DiffrobotPackage.ROTATION__PITCH:
			return getPitch();
		case DiffrobotPackage.ROTATION__YAW:
			return getYaw();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DiffrobotPackage.ROTATION__ROLL:
			setRoll((Double) newValue);
			return;
		case DiffrobotPackage.ROTATION__PITCH:
			setPitch((Double) newValue);
			return;
		case DiffrobotPackage.ROTATION__YAW:
			setYaw((Double) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DiffrobotPackage.ROTATION__ROLL:
			setRoll(ROLL_EDEFAULT);
			return;
		case DiffrobotPackage.ROTATION__PITCH:
			setPitch(PITCH_EDEFAULT);
			return;
		case DiffrobotPackage.ROTATION__YAW:
			setYaw(YAW_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DiffrobotPackage.ROTATION__ROLL:
			return roll != ROLL_EDEFAULT;
		case DiffrobotPackage.ROTATION__PITCH:
			return pitch != PITCH_EDEFAULT;
		case DiffrobotPackage.ROTATION__YAW:
			return yaw != YAW_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (roll: ");
		result.append(roll);
		result.append(", pitch: ");
		result.append(pitch);
		result.append(", yaw: ");
		result.append(yaw);
		result.append(')');
		return result.toString();
	}

} //RotationImpl
