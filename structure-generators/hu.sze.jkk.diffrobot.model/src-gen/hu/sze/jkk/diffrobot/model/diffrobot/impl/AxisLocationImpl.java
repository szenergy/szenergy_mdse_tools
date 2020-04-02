/**
 */
package hu.sze.jkk.diffrobot.model.diffrobot.impl;

import hu.sze.jkk.diffrobot.model.diffrobot.AxisLocation;
import hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage;
import hu.sze.jkk.diffrobot.model.diffrobot.Displacement;
import hu.sze.jkk.diffrobot.model.diffrobot.Rotation;
import hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axis Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.AxisLocationImpl#getWheelaxis <em>Wheelaxis</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.AxisLocationImpl#getDisplacement <em>Displacement</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.AxisLocationImpl#getRotation <em>Rotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AxisLocationImpl extends MinimalEObjectImpl.Container implements AxisLocation {
	/**
	 * The cached value of the '{@link #getDisplacement() <em>Displacement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacement()
	 * @generated
	 * @ordered
	 */
	protected Displacement displacement;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected Rotation rotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxisLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiffrobotPackage.Literals.AXIS_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WheelAxis getWheelaxis() {
		if (eContainerFeatureID() != DiffrobotPackage.AXIS_LOCATION__WHEELAXIS)
			return null;
		return (WheelAxis) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWheelaxis(WheelAxis newWheelaxis, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newWheelaxis, DiffrobotPackage.AXIS_LOCATION__WHEELAXIS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWheelaxis(WheelAxis newWheelaxis) {
		if (newWheelaxis != eInternalContainer()
				|| (eContainerFeatureID() != DiffrobotPackage.AXIS_LOCATION__WHEELAXIS && newWheelaxis != null)) {
			if (EcoreUtil.isAncestor(this, newWheelaxis))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newWheelaxis != null)
				msgs = ((InternalEObject) newWheelaxis).eInverseAdd(this, DiffrobotPackage.WHEEL_AXIS__AXISLOCATION,
						WheelAxis.class, msgs);
			msgs = basicSetWheelaxis(newWheelaxis, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffrobotPackage.AXIS_LOCATION__WHEELAXIS,
					newWheelaxis, newWheelaxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Displacement getDisplacement() {
		return displacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplacement(Displacement newDisplacement, NotificationChain msgs) {
		Displacement oldDisplacement = displacement;
		displacement = newDisplacement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DiffrobotPackage.AXIS_LOCATION__DISPLACEMENT, oldDisplacement, newDisplacement);
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
	public void setDisplacement(Displacement newDisplacement) {
		if (newDisplacement != displacement) {
			NotificationChain msgs = null;
			if (displacement != null)
				msgs = ((InternalEObject) displacement).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DiffrobotPackage.AXIS_LOCATION__DISPLACEMENT, null, msgs);
			if (newDisplacement != null)
				msgs = ((InternalEObject) newDisplacement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DiffrobotPackage.AXIS_LOCATION__DISPLACEMENT, null, msgs);
			msgs = basicSetDisplacement(newDisplacement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffrobotPackage.AXIS_LOCATION__DISPLACEMENT,
					newDisplacement, newDisplacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rotation getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotation(Rotation newRotation, NotificationChain msgs) {
		Rotation oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DiffrobotPackage.AXIS_LOCATION__ROTATION, oldRotation, newRotation);
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
	public void setRotation(Rotation newRotation) {
		if (newRotation != rotation) {
			NotificationChain msgs = null;
			if (rotation != null)
				msgs = ((InternalEObject) rotation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DiffrobotPackage.AXIS_LOCATION__ROTATION, null, msgs);
			if (newRotation != null)
				msgs = ((InternalEObject) newRotation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DiffrobotPackage.AXIS_LOCATION__ROTATION, null, msgs);
			msgs = basicSetRotation(newRotation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffrobotPackage.AXIS_LOCATION__ROTATION, newRotation,
					newRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DiffrobotPackage.AXIS_LOCATION__WHEELAXIS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetWheelaxis((WheelAxis) otherEnd, msgs);
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
		case DiffrobotPackage.AXIS_LOCATION__WHEELAXIS:
			return basicSetWheelaxis(null, msgs);
		case DiffrobotPackage.AXIS_LOCATION__DISPLACEMENT:
			return basicSetDisplacement(null, msgs);
		case DiffrobotPackage.AXIS_LOCATION__ROTATION:
			return basicSetRotation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case DiffrobotPackage.AXIS_LOCATION__WHEELAXIS:
			return eInternalContainer().eInverseRemove(this, DiffrobotPackage.WHEEL_AXIS__AXISLOCATION, WheelAxis.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DiffrobotPackage.AXIS_LOCATION__WHEELAXIS:
			return getWheelaxis();
		case DiffrobotPackage.AXIS_LOCATION__DISPLACEMENT:
			return getDisplacement();
		case DiffrobotPackage.AXIS_LOCATION__ROTATION:
			return getRotation();
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
		case DiffrobotPackage.AXIS_LOCATION__WHEELAXIS:
			setWheelaxis((WheelAxis) newValue);
			return;
		case DiffrobotPackage.AXIS_LOCATION__DISPLACEMENT:
			setDisplacement((Displacement) newValue);
			return;
		case DiffrobotPackage.AXIS_LOCATION__ROTATION:
			setRotation((Rotation) newValue);
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
		case DiffrobotPackage.AXIS_LOCATION__WHEELAXIS:
			setWheelaxis((WheelAxis) null);
			return;
		case DiffrobotPackage.AXIS_LOCATION__DISPLACEMENT:
			setDisplacement((Displacement) null);
			return;
		case DiffrobotPackage.AXIS_LOCATION__ROTATION:
			setRotation((Rotation) null);
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
		case DiffrobotPackage.AXIS_LOCATION__WHEELAXIS:
			return getWheelaxis() != null;
		case DiffrobotPackage.AXIS_LOCATION__DISPLACEMENT:
			return displacement != null;
		case DiffrobotPackage.AXIS_LOCATION__ROTATION:
			return rotation != null;
		}
		return super.eIsSet(featureID);
	}

} //AxisLocationImpl
