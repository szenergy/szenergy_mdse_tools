/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Node;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.OutputPort;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.NodeImpl#getOutputport <em>Outputport</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.NodeImpl#getInputport <em>Inputport</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.NodeImpl#getContinousstate <em>Continousstate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node {
	/**
	 * The cached value of the '{@link #getOutputport() <em>Outputport</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputport()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPort> outputport;

	/**
	 * The cached value of the '{@link #getInputport() <em>Inputport</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputport()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPort> inputport;

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
	 * The cached value of the '{@link #getContinousstate() <em>Continousstate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinousstate()
	 * @generated
	 * @ordered
	 */
	protected EList<ContinousState> continousstate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatepubsubmodelPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPort> getOutputport() {
		if (outputport == null) {
			outputport = new EObjectContainmentWithInverseEList<OutputPort>(OutputPort.class, this,
					StatepubsubmodelPackage.NODE__OUTPUTPORT, StatepubsubmodelPackage.OUTPUT_PORT__NODE);
		}
		return outputport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPort> getInputport() {
		if (inputport == null) {
			inputport = new EObjectContainmentWithInverseEList<InputPort>(InputPort.class, this,
					StatepubsubmodelPackage.NODE__INPUTPORT, StatepubsubmodelPackage.INPUT_PORT__NODE);
		}
		return inputport;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContinousState> getContinousstate() {
		if (continousstate == null) {
			continousstate = new EObjectContainmentEList<ContinousState>(ContinousState.class, this,
					StatepubsubmodelPackage.NODE__CONTINOUSSTATE);
		}
		return continousstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatepubsubmodelPackage.NODE__OUTPUTPORT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutputport()).basicAdd(otherEnd, msgs);
		case StatepubsubmodelPackage.NODE__INPUTPORT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInputport()).basicAdd(otherEnd, msgs);
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
		case StatepubsubmodelPackage.NODE__OUTPUTPORT:
			return ((InternalEList<?>) getOutputport()).basicRemove(otherEnd, msgs);
		case StatepubsubmodelPackage.NODE__INPUTPORT:
			return ((InternalEList<?>) getInputport()).basicRemove(otherEnd, msgs);
		case StatepubsubmodelPackage.NODE__CONTINOUSSTATE:
			return ((InternalEList<?>) getContinousstate()).basicRemove(otherEnd, msgs);
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
		case StatepubsubmodelPackage.NODE__OUTPUTPORT:
			return getOutputport();
		case StatepubsubmodelPackage.NODE__INPUTPORT:
			return getInputport();
		case StatepubsubmodelPackage.NODE__NAME:
			return getName();
		case StatepubsubmodelPackage.NODE__CONTINOUSSTATE:
			return getContinousstate();
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
		case StatepubsubmodelPackage.NODE__OUTPUTPORT:
			getOutputport().clear();
			getOutputport().addAll((Collection<? extends OutputPort>) newValue);
			return;
		case StatepubsubmodelPackage.NODE__INPUTPORT:
			getInputport().clear();
			getInputport().addAll((Collection<? extends InputPort>) newValue);
			return;
		case StatepubsubmodelPackage.NODE__NAME:
			setName((String) newValue);
			return;
		case StatepubsubmodelPackage.NODE__CONTINOUSSTATE:
			getContinousstate().clear();
			getContinousstate().addAll((Collection<? extends ContinousState>) newValue);
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
		case StatepubsubmodelPackage.NODE__OUTPUTPORT:
			getOutputport().clear();
			return;
		case StatepubsubmodelPackage.NODE__INPUTPORT:
			getInputport().clear();
			return;
		case StatepubsubmodelPackage.NODE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StatepubsubmodelPackage.NODE__CONTINOUSSTATE:
			getContinousstate().clear();
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
		case StatepubsubmodelPackage.NODE__OUTPUTPORT:
			return outputport != null && !outputport.isEmpty();
		case StatepubsubmodelPackage.NODE__INPUTPORT:
			return inputport != null && !inputport.isEmpty();
		case StatepubsubmodelPackage.NODE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case StatepubsubmodelPackage.NODE__CONTINOUSSTATE:
			return continousstate != null && !continousstate.isEmpty();
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

} //NodeImpl
