/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort;
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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Continous State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ContinousStateImpl#getProducesTo <em>Produces To</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ContinousStateImpl#getReceivesFrom <em>Receives From</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ContinousStateImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContinousStateImpl extends MinimalEObjectImpl.Container implements ContinousState {
	/**
	 * The cached value of the '{@link #getProducesTo() <em>Produces To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPort> producesTo;

	/**
	 * The cached value of the '{@link #getReceivesFrom() <em>Receives From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivesFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPort> receivesFrom;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinousStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatepubsubmodelPackage.Literals.CONTINOUS_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPort> getProducesTo() {
		if (producesTo == null) {
			producesTo = new EObjectWithInverseResolvingEList<OutputPort>(OutputPort.class, this,
					StatepubsubmodelPackage.CONTINOUS_STATE__PRODUCES_TO,
					StatepubsubmodelPackage.OUTPUT_PORT__CONTINOUS_STATE);
		}
		return producesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPort> getReceivesFrom() {
		if (receivesFrom == null) {
			receivesFrom = new EObjectWithInverseResolvingEList.ManyInverse<InputPort>(InputPort.class, this,
					StatepubsubmodelPackage.CONTINOUS_STATE__RECEIVES_FROM,
					StatepubsubmodelPackage.INPUT_PORT__CONTINOUS_STATE);
		}
		return receivesFrom;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.CONTINOUS_STATE__NAME,
					oldName, name));
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
		case StatepubsubmodelPackage.CONTINOUS_STATE__PRODUCES_TO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getProducesTo()).basicAdd(otherEnd, msgs);
		case StatepubsubmodelPackage.CONTINOUS_STATE__RECEIVES_FROM:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReceivesFrom()).basicAdd(otherEnd, msgs);
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
		case StatepubsubmodelPackage.CONTINOUS_STATE__PRODUCES_TO:
			return ((InternalEList<?>) getProducesTo()).basicRemove(otherEnd, msgs);
		case StatepubsubmodelPackage.CONTINOUS_STATE__RECEIVES_FROM:
			return ((InternalEList<?>) getReceivesFrom()).basicRemove(otherEnd, msgs);
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
		case StatepubsubmodelPackage.CONTINOUS_STATE__PRODUCES_TO:
			return getProducesTo();
		case StatepubsubmodelPackage.CONTINOUS_STATE__RECEIVES_FROM:
			return getReceivesFrom();
		case StatepubsubmodelPackage.CONTINOUS_STATE__NAME:
			return getName();
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
		case StatepubsubmodelPackage.CONTINOUS_STATE__PRODUCES_TO:
			getProducesTo().clear();
			getProducesTo().addAll((Collection<? extends OutputPort>) newValue);
			return;
		case StatepubsubmodelPackage.CONTINOUS_STATE__RECEIVES_FROM:
			getReceivesFrom().clear();
			getReceivesFrom().addAll((Collection<? extends InputPort>) newValue);
			return;
		case StatepubsubmodelPackage.CONTINOUS_STATE__NAME:
			setName((String) newValue);
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
		case StatepubsubmodelPackage.CONTINOUS_STATE__PRODUCES_TO:
			getProducesTo().clear();
			return;
		case StatepubsubmodelPackage.CONTINOUS_STATE__RECEIVES_FROM:
			getReceivesFrom().clear();
			return;
		case StatepubsubmodelPackage.CONTINOUS_STATE__NAME:
			setName(NAME_EDEFAULT);
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
		case StatepubsubmodelPackage.CONTINOUS_STATE__PRODUCES_TO:
			return producesTo != null && !producesTo.isEmpty();
		case StatepubsubmodelPackage.CONTINOUS_STATE__RECEIVES_FROM:
			return receivesFrom != null && !receivesFrom.isEmpty();
		case StatepubsubmodelPackage.CONTINOUS_STATE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //ContinousStateImpl
