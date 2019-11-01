/**
 */
package hu.sze.jkk.robot.launch.model.launchmodel.impl;

import hu.sze.jkk.robot.launch.model.launchmodel.LaunchmodelPackage;
import hu.sze.jkk.robot.launch.model.launchmodel.StaticTransform;
import hu.sze.jkk.robot.launch.model.launchmodel.Vec3;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Transform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.robot.launch.model.launchmodel.impl.StaticTransformImpl#getVec3 <em>Vec3</em>}</li>
 *   <li>{@link hu.sze.jkk.robot.launch.model.launchmodel.impl.StaticTransformImpl#getRpy <em>Rpy</em>}</li>
 *   <li>{@link hu.sze.jkk.robot.launch.model.launchmodel.impl.StaticTransformImpl#getLink_from <em>Link from</em>}</li>
 *   <li>{@link hu.sze.jkk.robot.launch.model.launchmodel.impl.StaticTransformImpl#getLink_to <em>Link to</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaticTransformImpl extends NodeImpl implements StaticTransform {
	/**
	 * The cached value of the '{@link #getVec3() <em>Vec3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVec3()
	 * @generated
	 * @ordered
	 */
	protected Vec3 vec3;

	/**
	 * The cached value of the '{@link #getRpy() <em>Rpy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpy()
	 * @generated
	 * @ordered
	 */
	protected Vec3 rpy;

	/**
	 * The default value of the '{@link #getLink_from() <em>Link from</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink_from()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLink_from() <em>Link from</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink_from()
	 * @generated
	 * @ordered
	 */
	protected String link_from = LINK_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getLink_to() <em>Link to</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink_to()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLink_to() <em>Link to</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink_to()
	 * @generated
	 * @ordered
	 */
	protected String link_to = LINK_TO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticTransformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaunchmodelPackage.Literals.STATIC_TRANSFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vec3 getVec3() {
		return vec3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVec3(Vec3 newVec3, NotificationChain msgs) {
		Vec3 oldVec3 = vec3;
		vec3 = newVec3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					LaunchmodelPackage.STATIC_TRANSFORM__VEC3, oldVec3, newVec3);
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
	public void setVec3(Vec3 newVec3) {
		if (newVec3 != vec3) {
			NotificationChain msgs = null;
			if (vec3 != null)
				msgs = ((InternalEObject) vec3).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - LaunchmodelPackage.STATIC_TRANSFORM__VEC3, null, msgs);
			if (newVec3 != null)
				msgs = ((InternalEObject) newVec3).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - LaunchmodelPackage.STATIC_TRANSFORM__VEC3, null, msgs);
			msgs = basicSetVec3(newVec3, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaunchmodelPackage.STATIC_TRANSFORM__VEC3, newVec3,
					newVec3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vec3 getRpy() {
		return rpy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRpy(Vec3 newRpy, NotificationChain msgs) {
		Vec3 oldRpy = rpy;
		rpy = newRpy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					LaunchmodelPackage.STATIC_TRANSFORM__RPY, oldRpy, newRpy);
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
	public void setRpy(Vec3 newRpy) {
		if (newRpy != rpy) {
			NotificationChain msgs = null;
			if (rpy != null)
				msgs = ((InternalEObject) rpy).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - LaunchmodelPackage.STATIC_TRANSFORM__RPY, null, msgs);
			if (newRpy != null)
				msgs = ((InternalEObject) newRpy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - LaunchmodelPackage.STATIC_TRANSFORM__RPY, null, msgs);
			msgs = basicSetRpy(newRpy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaunchmodelPackage.STATIC_TRANSFORM__RPY, newRpy,
					newRpy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLink_from() {
		return link_from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink_from(String newLink_from) {
		String oldLink_from = link_from;
		link_from = newLink_from;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaunchmodelPackage.STATIC_TRANSFORM__LINK_FROM,
					oldLink_from, link_from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLink_to() {
		return link_to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink_to(String newLink_to) {
		String oldLink_to = link_to;
		link_to = newLink_to;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaunchmodelPackage.STATIC_TRANSFORM__LINK_TO,
					oldLink_to, link_to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LaunchmodelPackage.STATIC_TRANSFORM__VEC3:
			return basicSetVec3(null, msgs);
		case LaunchmodelPackage.STATIC_TRANSFORM__RPY:
			return basicSetRpy(null, msgs);
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
		case LaunchmodelPackage.STATIC_TRANSFORM__VEC3:
			return getVec3();
		case LaunchmodelPackage.STATIC_TRANSFORM__RPY:
			return getRpy();
		case LaunchmodelPackage.STATIC_TRANSFORM__LINK_FROM:
			return getLink_from();
		case LaunchmodelPackage.STATIC_TRANSFORM__LINK_TO:
			return getLink_to();
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
		case LaunchmodelPackage.STATIC_TRANSFORM__VEC3:
			setVec3((Vec3) newValue);
			return;
		case LaunchmodelPackage.STATIC_TRANSFORM__RPY:
			setRpy((Vec3) newValue);
			return;
		case LaunchmodelPackage.STATIC_TRANSFORM__LINK_FROM:
			setLink_from((String) newValue);
			return;
		case LaunchmodelPackage.STATIC_TRANSFORM__LINK_TO:
			setLink_to((String) newValue);
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
		case LaunchmodelPackage.STATIC_TRANSFORM__VEC3:
			setVec3((Vec3) null);
			return;
		case LaunchmodelPackage.STATIC_TRANSFORM__RPY:
			setRpy((Vec3) null);
			return;
		case LaunchmodelPackage.STATIC_TRANSFORM__LINK_FROM:
			setLink_from(LINK_FROM_EDEFAULT);
			return;
		case LaunchmodelPackage.STATIC_TRANSFORM__LINK_TO:
			setLink_to(LINK_TO_EDEFAULT);
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
		case LaunchmodelPackage.STATIC_TRANSFORM__VEC3:
			return vec3 != null;
		case LaunchmodelPackage.STATIC_TRANSFORM__RPY:
			return rpy != null;
		case LaunchmodelPackage.STATIC_TRANSFORM__LINK_FROM:
			return LINK_FROM_EDEFAULT == null ? link_from != null : !LINK_FROM_EDEFAULT.equals(link_from);
		case LaunchmodelPackage.STATIC_TRANSFORM__LINK_TO:
			return LINK_TO_EDEFAULT == null ? link_to != null : !LINK_TO_EDEFAULT.equals(link_to);
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
		result.append(" (link_from: ");
		result.append(link_from);
		result.append(", link_to: ");
		result.append(link_to);
		result.append(')');
		return result.toString();
	}

} //StaticTransformImpl
