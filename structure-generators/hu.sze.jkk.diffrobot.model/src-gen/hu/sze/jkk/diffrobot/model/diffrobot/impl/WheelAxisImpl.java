/**
 */
package hu.sze.jkk.diffrobot.model.diffrobot.impl;

import hu.sze.jkk.diffrobot.model.diffrobot.AxisLocation;
import hu.sze.jkk.diffrobot.model.diffrobot.AxisOrientation;
import hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage;
import hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis;
import hu.sze.jkk.diffrobot.model.diffrobot.WheelParemeters;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wheel Axis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.WheelAxisImpl#getWheels <em>Wheels</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.WheelAxisImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.WheelAxisImpl#getLength <em>Length</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.WheelAxisImpl#getWheelparemeters <em>Wheelparemeters</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.WheelAxisImpl#getAxislocation <em>Axislocation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WheelAxisImpl extends MinimalEObjectImpl.Container implements WheelAxis {
	/**
	 * The default value of the '{@link #getWheels() <em>Wheels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWheels()
	 * @generated
	 * @ordered
	 */
	protected static final int WHEELS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWheels() <em>Wheels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWheels()
	 * @generated
	 * @ordered
	 */
	protected int wheels = WHEELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAxis() <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected static final AxisOrientation AXIS_EDEFAULT = AxisOrientation.HORIZONTAL;

	/**
	 * The cached value of the '{@link #getAxis() <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected AxisOrientation axis = AXIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final double LENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected double length = LENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWheelparemeters() <em>Wheelparemeters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWheelparemeters()
	 * @generated
	 * @ordered
	 */
	protected WheelParemeters wheelparemeters;

	/**
	 * The cached value of the '{@link #getAxislocation() <em>Axislocation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxislocation()
	 * @generated
	 * @ordered
	 */
	protected AxisLocation axislocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WheelAxisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiffrobotPackage.Literals.WHEEL_AXIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWheels() {
		return wheels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWheels(int newWheels) {
		int oldWheels = wheels;
		wheels = newWheels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffrobotPackage.WHEEL_AXIS__WHEELS, oldWheels,
					wheels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisOrientation getAxis() {
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis(AxisOrientation newAxis) {
		AxisOrientation oldAxis = axis;
		axis = newAxis == null ? AXIS_EDEFAULT : newAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffrobotPackage.WHEEL_AXIS__AXIS, oldAxis, axis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(double newLength) {
		double oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffrobotPackage.WHEEL_AXIS__LENGTH, oldLength,
					length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WheelParemeters getWheelparemeters() {
		if (wheelparemeters != null && wheelparemeters.eIsProxy()) {
			InternalEObject oldWheelparemeters = (InternalEObject) wheelparemeters;
			wheelparemeters = (WheelParemeters) eResolveProxy(oldWheelparemeters);
			if (wheelparemeters != oldWheelparemeters) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DiffrobotPackage.WHEEL_AXIS__WHEELPAREMETERS, oldWheelparemeters, wheelparemeters));
			}
		}
		return wheelparemeters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WheelParemeters basicGetWheelparemeters() {
		return wheelparemeters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWheelparemeters(WheelParemeters newWheelparemeters) {
		WheelParemeters oldWheelparemeters = wheelparemeters;
		wheelparemeters = newWheelparemeters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffrobotPackage.WHEEL_AXIS__WHEELPAREMETERS,
					oldWheelparemeters, wheelparemeters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisLocation getAxislocation() {
		return axislocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxislocation(AxisLocation newAxislocation, NotificationChain msgs) {
		AxisLocation oldAxislocation = axislocation;
		axislocation = newAxislocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DiffrobotPackage.WHEEL_AXIS__AXISLOCATION, oldAxislocation, newAxislocation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxislocation(AxisLocation newAxislocation) {
		if (newAxislocation != axislocation) {
			NotificationChain msgs = null;
			if (axislocation != null)
				msgs = ((InternalEObject) axislocation).eInverseRemove(this, DiffrobotPackage.AXIS_LOCATION__WHEELAXIS,
						AxisLocation.class, msgs);
			if (newAxislocation != null)
				msgs = ((InternalEObject) newAxislocation).eInverseAdd(this, DiffrobotPackage.AXIS_LOCATION__WHEELAXIS,
						AxisLocation.class, msgs);
			msgs = basicSetAxislocation(newAxislocation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffrobotPackage.WHEEL_AXIS__AXISLOCATION,
					newAxislocation, newAxislocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DiffrobotPackage.WHEEL_AXIS__AXISLOCATION:
			if (axislocation != null)
				msgs = ((InternalEObject) axislocation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DiffrobotPackage.WHEEL_AXIS__AXISLOCATION, null, msgs);
			return basicSetAxislocation((AxisLocation) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DiffrobotPackage.WHEEL_AXIS__AXISLOCATION:
			return basicSetAxislocation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DiffrobotPackage.WHEEL_AXIS__WHEELS:
			return getWheels();
		case DiffrobotPackage.WHEEL_AXIS__AXIS:
			return getAxis();
		case DiffrobotPackage.WHEEL_AXIS__LENGTH:
			return getLength();
		case DiffrobotPackage.WHEEL_AXIS__WHEELPAREMETERS:
			if (resolve)
				return getWheelparemeters();
			return basicGetWheelparemeters();
		case DiffrobotPackage.WHEEL_AXIS__AXISLOCATION:
			return getAxislocation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DiffrobotPackage.WHEEL_AXIS__WHEELS:
			setWheels((Integer) newValue);
			return;
		case DiffrobotPackage.WHEEL_AXIS__AXIS:
			setAxis((AxisOrientation) newValue);
			return;
		case DiffrobotPackage.WHEEL_AXIS__LENGTH:
			setLength((Double) newValue);
			return;
		case DiffrobotPackage.WHEEL_AXIS__WHEELPAREMETERS:
			setWheelparemeters((WheelParemeters) newValue);
			return;
		case DiffrobotPackage.WHEEL_AXIS__AXISLOCATION:
			setAxislocation((AxisLocation) newValue);
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
		case DiffrobotPackage.WHEEL_AXIS__WHEELS:
			setWheels(WHEELS_EDEFAULT);
			return;
		case DiffrobotPackage.WHEEL_AXIS__AXIS:
			setAxis(AXIS_EDEFAULT);
			return;
		case DiffrobotPackage.WHEEL_AXIS__LENGTH:
			setLength(LENGTH_EDEFAULT);
			return;
		case DiffrobotPackage.WHEEL_AXIS__WHEELPAREMETERS:
			setWheelparemeters((WheelParemeters) null);
			return;
		case DiffrobotPackage.WHEEL_AXIS__AXISLOCATION:
			setAxislocation((AxisLocation) null);
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
		case DiffrobotPackage.WHEEL_AXIS__WHEELS:
			return wheels != WHEELS_EDEFAULT;
		case DiffrobotPackage.WHEEL_AXIS__AXIS:
			return axis != AXIS_EDEFAULT;
		case DiffrobotPackage.WHEEL_AXIS__LENGTH:
			return length != LENGTH_EDEFAULT;
		case DiffrobotPackage.WHEEL_AXIS__WHEELPAREMETERS:
			return wheelparemeters != null;
		case DiffrobotPackage.WHEEL_AXIS__AXISLOCATION:
			return axislocation != null;
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
		result.append(" (wheels: ");
		result.append(wheels);
		result.append(", axis: ");
		result.append(axis);
		result.append(", length: ");
		result.append(length);
		result.append(')');
		return result.toString();
	}

} //WheelAxisImpl
