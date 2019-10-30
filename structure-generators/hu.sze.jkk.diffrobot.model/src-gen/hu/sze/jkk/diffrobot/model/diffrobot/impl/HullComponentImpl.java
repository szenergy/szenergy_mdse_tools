/**
 */
package hu.sze.jkk.diffrobot.model.diffrobot.impl;

import hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage;
import hu.sze.jkk.diffrobot.model.diffrobot.HullComponent;
import hu.sze.jkk.diffrobot.model.diffrobot.Mesh;

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
 * An implementation of the model object '<em><b>Hull Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.HullComponentImpl#getMass <em>Mass</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.HullComponentImpl#getMesh <em>Mesh</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.HullComponentImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.HullComponentImpl#getDepth <em>Depth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HullComponentImpl extends MinimalEObjectImpl.Container implements HullComponent {
	/**
	 * The default value of the '{@link #getMass() <em>Mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass()
	 * @generated
	 * @ordered
	 */
	protected static final double MASS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMass() <em>Mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass()
	 * @generated
	 * @ordered
	 */
	protected double mass = MASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMesh() <em>Mesh</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesh()
	 * @generated
	 * @ordered
	 */
	protected EList<Mesh> mesh;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected double width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected static final double DEPTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected double depth = DEPTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HullComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiffrobotPackage.Literals.HULL_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMass() {
		return mass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMass(double newMass) {
		double oldMass = mass;
		mass = newMass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffrobotPackage.HULL_COMPONENT__MASS, oldMass,
					mass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mesh> getMesh() {
		if (mesh == null) {
			mesh = new EObjectContainmentEList<Mesh>(Mesh.class, this, DiffrobotPackage.HULL_COMPONENT__MESH);
		}
		return mesh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(double newWidth) {
		double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffrobotPackage.HULL_COMPONENT__WIDTH, oldWidth,
					width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDepth() {
		return depth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepth(double newDepth) {
		double oldDepth = depth;
		depth = newDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffrobotPackage.HULL_COMPONENT__DEPTH, oldDepth,
					depth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DiffrobotPackage.HULL_COMPONENT__MESH:
			return ((InternalEList<?>) getMesh()).basicRemove(otherEnd, msgs);
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
		case DiffrobotPackage.HULL_COMPONENT__MASS:
			return getMass();
		case DiffrobotPackage.HULL_COMPONENT__MESH:
			return getMesh();
		case DiffrobotPackage.HULL_COMPONENT__WIDTH:
			return getWidth();
		case DiffrobotPackage.HULL_COMPONENT__DEPTH:
			return getDepth();
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
		case DiffrobotPackage.HULL_COMPONENT__MASS:
			setMass((Double) newValue);
			return;
		case DiffrobotPackage.HULL_COMPONENT__MESH:
			getMesh().clear();
			getMesh().addAll((Collection<? extends Mesh>) newValue);
			return;
		case DiffrobotPackage.HULL_COMPONENT__WIDTH:
			setWidth((Double) newValue);
			return;
		case DiffrobotPackage.HULL_COMPONENT__DEPTH:
			setDepth((Double) newValue);
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
		case DiffrobotPackage.HULL_COMPONENT__MASS:
			setMass(MASS_EDEFAULT);
			return;
		case DiffrobotPackage.HULL_COMPONENT__MESH:
			getMesh().clear();
			return;
		case DiffrobotPackage.HULL_COMPONENT__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case DiffrobotPackage.HULL_COMPONENT__DEPTH:
			setDepth(DEPTH_EDEFAULT);
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
		case DiffrobotPackage.HULL_COMPONENT__MASS:
			return mass != MASS_EDEFAULT;
		case DiffrobotPackage.HULL_COMPONENT__MESH:
			return mesh != null && !mesh.isEmpty();
		case DiffrobotPackage.HULL_COMPONENT__WIDTH:
			return width != WIDTH_EDEFAULT;
		case DiffrobotPackage.HULL_COMPONENT__DEPTH:
			return depth != DEPTH_EDEFAULT;
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
		result.append(" (mass: ");
		result.append(mass);
		result.append(", width: ");
		result.append(width);
		result.append(", depth: ");
		result.append(depth);
		result.append(')');
		return result.toString();
	}

} //HullComponentImpl
