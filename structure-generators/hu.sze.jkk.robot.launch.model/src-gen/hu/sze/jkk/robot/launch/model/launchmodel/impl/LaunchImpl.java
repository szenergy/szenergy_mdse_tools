/**
 */
package hu.sze.jkk.robot.launch.model.launchmodel.impl;

import hu.sze.jkk.robot.launch.model.launchmodel.Argument;
import hu.sze.jkk.robot.launch.model.launchmodel.Launch;
import hu.sze.jkk.robot.launch.model.launchmodel.LaunchmodelPackage;
import hu.sze.jkk.robot.launch.model.launchmodel.Node;

import hu.sze.jkk.robot.launch.model.launchmodel.Parameter;
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
 * An implementation of the model object '<em><b>Launch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.robot.launch.model.launchmodel.impl.LaunchImpl#getNode <em>Node</em>}</li>
 *   <li>{@link hu.sze.jkk.robot.launch.model.launchmodel.impl.LaunchImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.sze.jkk.robot.launch.model.launchmodel.impl.LaunchImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link hu.sze.jkk.robot.launch.model.launchmodel.impl.LaunchImpl#getLaunchparameters <em>Launchparameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LaunchImpl extends MinimalEObjectImpl.Container implements Launch {
	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> node;

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
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> argument;

	/**
	 * The cached value of the '{@link #getLaunchparameters() <em>Launchparameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchparameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> launchparameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaunchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaunchmodelPackage.Literals.LAUNCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNode() {
		if (node == null) {
			node = new EObjectContainmentEList<Node>(Node.class, this, LaunchmodelPackage.LAUNCH__NODE);
		}
		return node;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LaunchmodelPackage.LAUNCH__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getArgument() {
		if (argument == null) {
			argument = new EObjectContainmentEList<Argument>(Argument.class, this, LaunchmodelPackage.LAUNCH__ARGUMENT);
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getLaunchparameters() {
		if (launchparameters == null) {
			launchparameters = new EObjectContainmentEList<Parameter>(Parameter.class, this,
					LaunchmodelPackage.LAUNCH__LAUNCHPARAMETERS);
		}
		return launchparameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LaunchmodelPackage.LAUNCH__NODE:
			return ((InternalEList<?>) getNode()).basicRemove(otherEnd, msgs);
		case LaunchmodelPackage.LAUNCH__ARGUMENT:
			return ((InternalEList<?>) getArgument()).basicRemove(otherEnd, msgs);
		case LaunchmodelPackage.LAUNCH__LAUNCHPARAMETERS:
			return ((InternalEList<?>) getLaunchparameters()).basicRemove(otherEnd, msgs);
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
		case LaunchmodelPackage.LAUNCH__NODE:
			return getNode();
		case LaunchmodelPackage.LAUNCH__NAME:
			return getName();
		case LaunchmodelPackage.LAUNCH__ARGUMENT:
			return getArgument();
		case LaunchmodelPackage.LAUNCH__LAUNCHPARAMETERS:
			return getLaunchparameters();
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
		case LaunchmodelPackage.LAUNCH__NODE:
			getNode().clear();
			getNode().addAll((Collection<? extends Node>) newValue);
			return;
		case LaunchmodelPackage.LAUNCH__NAME:
			setName((String) newValue);
			return;
		case LaunchmodelPackage.LAUNCH__ARGUMENT:
			getArgument().clear();
			getArgument().addAll((Collection<? extends Argument>) newValue);
			return;
		case LaunchmodelPackage.LAUNCH__LAUNCHPARAMETERS:
			getLaunchparameters().clear();
			getLaunchparameters().addAll((Collection<? extends Parameter>) newValue);
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
		case LaunchmodelPackage.LAUNCH__NODE:
			getNode().clear();
			return;
		case LaunchmodelPackage.LAUNCH__NAME:
			setName(NAME_EDEFAULT);
			return;
		case LaunchmodelPackage.LAUNCH__ARGUMENT:
			getArgument().clear();
			return;
		case LaunchmodelPackage.LAUNCH__LAUNCHPARAMETERS:
			getLaunchparameters().clear();
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
		case LaunchmodelPackage.LAUNCH__NODE:
			return node != null && !node.isEmpty();
		case LaunchmodelPackage.LAUNCH__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case LaunchmodelPackage.LAUNCH__ARGUMENT:
			return argument != null && !argument.isEmpty();
		case LaunchmodelPackage.LAUNCH__LAUNCHPARAMETERS:
			return launchparameters != null && !launchparameters.isEmpty();
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

} //LaunchImpl
