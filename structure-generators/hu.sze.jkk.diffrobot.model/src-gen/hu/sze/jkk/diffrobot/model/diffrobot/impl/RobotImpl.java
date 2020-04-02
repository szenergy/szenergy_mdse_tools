/**
 */
package hu.sze.jkk.diffrobot.model.diffrobot.impl;

import hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage;
import hu.sze.jkk.diffrobot.model.diffrobot.DynamicParameters;
import hu.sze.jkk.diffrobot.model.diffrobot.HullComponent;
import hu.sze.jkk.diffrobot.model.diffrobot.KinematicParameters;
import hu.sze.jkk.diffrobot.model.diffrobot.Robot;
import hu.sze.jkk.diffrobot.model.diffrobot.Sensor;
import hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis;
import hu.sze.jkk.diffrobot.model.diffrobot.WheelParameters;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.RobotImpl#getWheelaxis <em>Wheelaxis</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.RobotImpl#getKinematicparameters <em>Kinematicparameters</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.RobotImpl#getWheelparameters <em>Wheelparameters</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.RobotImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.RobotImpl#getHull <em>Hull</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.RobotImpl#getDynamicparameters <em>Dynamicparameters</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.RobotImpl#getRootaxis <em>Rootaxis</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.RobotImpl#getSensor <em>Sensor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotImpl extends MinimalEObjectImpl.Container implements Robot {
	/**
	 * The cached value of the '{@link #getWheelaxis() <em>Wheelaxis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWheelaxis()
	 * @generated
	 * @ordered
	 */
	protected EList<WheelAxis> wheelaxis;

	/**
	 * The cached value of the '{@link #getKinematicparameters() <em>Kinematicparameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKinematicparameters()
	 * @generated
	 * @ordered
	 */
	protected KinematicParameters kinematicparameters;

	/**
	 * The cached value of the '{@link #getWheelparameters() <em>Wheelparameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWheelparameters()
	 * @generated
	 * @ordered
	 */
	protected EList<WheelParameters> wheelparameters;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHull() <em>Hull</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHull()
	 * @generated
	 * @ordered
	 */
	protected HullComponent hull;

	/**
	 * The cached value of the '{@link #getDynamicparameters() <em>Dynamicparameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicparameters()
	 * @generated
	 * @ordered
	 */
	protected DynamicParameters dynamicparameters;

	/**
	 * The cached value of the '{@link #getRootaxis() <em>Rootaxis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootaxis()
	 * @generated
	 * @ordered
	 */
	protected WheelAxis rootaxis;

	/**
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> sensor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiffrobotPackage.Literals.ROBOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WheelAxis> getWheelaxis() {
		if (wheelaxis == null) {
			wheelaxis = new EObjectContainmentEList<WheelAxis>(WheelAxis.class, this,
					DiffrobotPackage.ROBOT__WHEELAXIS);
		}
		return wheelaxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KinematicParameters getKinematicparameters() {
		return kinematicparameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKinematicparameters(KinematicParameters newKinematicparameters,
			NotificationChain msgs) {
		KinematicParameters oldKinematicparameters = kinematicparameters;
		kinematicparameters = newKinematicparameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DiffrobotPackage.ROBOT__KINEMATICPARAMETERS, oldKinematicparameters, newKinematicparameters);
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
	public void setKinematicparameters(KinematicParameters newKinematicparameters) {
		if (newKinematicparameters != kinematicparameters) {
			NotificationChain msgs = null;
			if (kinematicparameters != null)
				msgs = ((InternalEObject) kinematicparameters).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DiffrobotPackage.ROBOT__KINEMATICPARAMETERS, null, msgs);
			if (newKinematicparameters != null)
				msgs = ((InternalEObject) newKinematicparameters).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DiffrobotPackage.ROBOT__KINEMATICPARAMETERS, null, msgs);
			msgs = basicSetKinematicparameters(newKinematicparameters, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffrobotPackage.ROBOT__KINEMATICPARAMETERS,
					newKinematicparameters, newKinematicparameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WheelParameters> getWheelparameters() {
		if (wheelparameters == null) {
			wheelparameters = new EObjectContainmentEList<WheelParameters>(WheelParameters.class, this,
					DiffrobotPackage.ROBOT__WHEELPARAMETERS);
		}
		return wheelparameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffrobotPackage.ROBOT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HullComponent getHull() {
		return hull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHull(HullComponent newHull, NotificationChain msgs) {
		HullComponent oldHull = hull;
		hull = newHull;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiffrobotPackage.ROBOT__HULL,
					oldHull, newHull);
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
	public void setHull(HullComponent newHull) {
		if (newHull != hull) {
			NotificationChain msgs = null;
			if (hull != null)
				msgs = ((InternalEObject) hull).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DiffrobotPackage.ROBOT__HULL, null, msgs);
			if (newHull != null)
				msgs = ((InternalEObject) newHull).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DiffrobotPackage.ROBOT__HULL, null, msgs);
			msgs = basicSetHull(newHull, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffrobotPackage.ROBOT__HULL, newHull, newHull));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicParameters getDynamicparameters() {
		return dynamicparameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDynamicparameters(DynamicParameters newDynamicparameters, NotificationChain msgs) {
		DynamicParameters oldDynamicparameters = dynamicparameters;
		dynamicparameters = newDynamicparameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DiffrobotPackage.ROBOT__DYNAMICPARAMETERS, oldDynamicparameters, newDynamicparameters);
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
	public void setDynamicparameters(DynamicParameters newDynamicparameters) {
		if (newDynamicparameters != dynamicparameters) {
			NotificationChain msgs = null;
			if (dynamicparameters != null)
				msgs = ((InternalEObject) dynamicparameters).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DiffrobotPackage.ROBOT__DYNAMICPARAMETERS, null, msgs);
			if (newDynamicparameters != null)
				msgs = ((InternalEObject) newDynamicparameters).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DiffrobotPackage.ROBOT__DYNAMICPARAMETERS, null, msgs);
			msgs = basicSetDynamicparameters(newDynamicparameters, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffrobotPackage.ROBOT__DYNAMICPARAMETERS,
					newDynamicparameters, newDynamicparameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WheelAxis getRootaxis() {
		if (rootaxis != null && rootaxis.eIsProxy()) {
			InternalEObject oldRootaxis = (InternalEObject) rootaxis;
			rootaxis = (WheelAxis) eResolveProxy(oldRootaxis);
			if (rootaxis != oldRootaxis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiffrobotPackage.ROBOT__ROOTAXIS,
							oldRootaxis, rootaxis));
			}
		}
		return rootaxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WheelAxis basicGetRootaxis() {
		return rootaxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootaxis(WheelAxis newRootaxis) {
		WheelAxis oldRootaxis = rootaxis;
		rootaxis = newRootaxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffrobotPackage.ROBOT__ROOTAXIS, oldRootaxis,
					rootaxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensor> getSensor() {
		if (sensor == null) {
			sensor = new EObjectContainmentEList<Sensor>(Sensor.class, this, DiffrobotPackage.ROBOT__SENSOR);
		}
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DiffrobotPackage.ROBOT__WHEELAXIS:
			return ((InternalEList<?>) getWheelaxis()).basicRemove(otherEnd, msgs);
		case DiffrobotPackage.ROBOT__KINEMATICPARAMETERS:
			return basicSetKinematicparameters(null, msgs);
		case DiffrobotPackage.ROBOT__WHEELPARAMETERS:
			return ((InternalEList<?>) getWheelparameters()).basicRemove(otherEnd, msgs);
		case DiffrobotPackage.ROBOT__HULL:
			return basicSetHull(null, msgs);
		case DiffrobotPackage.ROBOT__DYNAMICPARAMETERS:
			return basicSetDynamicparameters(null, msgs);
		case DiffrobotPackage.ROBOT__SENSOR:
			return ((InternalEList<?>) getSensor()).basicRemove(otherEnd, msgs);
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
		case DiffrobotPackage.ROBOT__WHEELAXIS:
			return getWheelaxis();
		case DiffrobotPackage.ROBOT__KINEMATICPARAMETERS:
			return getKinematicparameters();
		case DiffrobotPackage.ROBOT__WHEELPARAMETERS:
			return getWheelparameters();
		case DiffrobotPackage.ROBOT__NAME:
			return getName();
		case DiffrobotPackage.ROBOT__HULL:
			return getHull();
		case DiffrobotPackage.ROBOT__DYNAMICPARAMETERS:
			return getDynamicparameters();
		case DiffrobotPackage.ROBOT__ROOTAXIS:
			if (resolve)
				return getRootaxis();
			return basicGetRootaxis();
		case DiffrobotPackage.ROBOT__SENSOR:
			return getSensor();
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
		case DiffrobotPackage.ROBOT__WHEELAXIS:
			getWheelaxis().clear();
			getWheelaxis().addAll((Collection<? extends WheelAxis>) newValue);
			return;
		case DiffrobotPackage.ROBOT__KINEMATICPARAMETERS:
			setKinematicparameters((KinematicParameters) newValue);
			return;
		case DiffrobotPackage.ROBOT__WHEELPARAMETERS:
			getWheelparameters().clear();
			getWheelparameters().addAll((Collection<? extends WheelParameters>) newValue);
			return;
		case DiffrobotPackage.ROBOT__NAME:
			setName((String) newValue);
			return;
		case DiffrobotPackage.ROBOT__HULL:
			setHull((HullComponent) newValue);
			return;
		case DiffrobotPackage.ROBOT__DYNAMICPARAMETERS:
			setDynamicparameters((DynamicParameters) newValue);
			return;
		case DiffrobotPackage.ROBOT__ROOTAXIS:
			setRootaxis((WheelAxis) newValue);
			return;
		case DiffrobotPackage.ROBOT__SENSOR:
			getSensor().clear();
			getSensor().addAll((Collection<? extends Sensor>) newValue);
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
		case DiffrobotPackage.ROBOT__WHEELAXIS:
			getWheelaxis().clear();
			return;
		case DiffrobotPackage.ROBOT__KINEMATICPARAMETERS:
			setKinematicparameters((KinematicParameters) null);
			return;
		case DiffrobotPackage.ROBOT__WHEELPARAMETERS:
			getWheelparameters().clear();
			return;
		case DiffrobotPackage.ROBOT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DiffrobotPackage.ROBOT__HULL:
			setHull((HullComponent) null);
			return;
		case DiffrobotPackage.ROBOT__DYNAMICPARAMETERS:
			setDynamicparameters((DynamicParameters) null);
			return;
		case DiffrobotPackage.ROBOT__ROOTAXIS:
			setRootaxis((WheelAxis) null);
			return;
		case DiffrobotPackage.ROBOT__SENSOR:
			getSensor().clear();
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
		case DiffrobotPackage.ROBOT__WHEELAXIS:
			return wheelaxis != null && !wheelaxis.isEmpty();
		case DiffrobotPackage.ROBOT__KINEMATICPARAMETERS:
			return kinematicparameters != null;
		case DiffrobotPackage.ROBOT__WHEELPARAMETERS:
			return wheelparameters != null && !wheelparameters.isEmpty();
		case DiffrobotPackage.ROBOT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DiffrobotPackage.ROBOT__HULL:
			return hull != null;
		case DiffrobotPackage.ROBOT__DYNAMICPARAMETERS:
			return dynamicparameters != null;
		case DiffrobotPackage.ROBOT__ROOTAXIS:
			return rootaxis != null;
		case DiffrobotPackage.ROBOT__SENSOR:
			return sensor != null && !sensor.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RobotImpl
