/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.OutputPort;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Topic;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.TopicMessage;

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
 * An implementation of the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TopicImpl#getType <em>Type</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TopicImpl#getPortTo <em>Port To</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TopicImpl#getPortFrom <em>Port From</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TopicImpl#getTopic_name <em>Topic name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopicImpl extends MinimalEObjectImpl.Container implements Topic {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TopicMessage type;

	/**
	 * The cached value of the '{@link #getPortTo() <em>Port To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortTo()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPort> portTo;

	/**
	 * The cached value of the '{@link #getPortFrom() <em>Port From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortFrom()
	 * @generated
	 * @ordered
	 */
	protected OutputPort portFrom;

	/**
	 * The default value of the '{@link #getTopic_name() <em>Topic name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic_name()
	 * @generated
	 * @ordered
	 */
	protected static final String TOPIC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopic_name() <em>Topic name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic_name()
	 * @generated
	 * @ordered
	 */
	protected String topic_name = TOPIC_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatepubsubmodelPackage.Literals.TOPIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopicMessage getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (TopicMessage) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatepubsubmodelPackage.TOPIC__TYPE,
							oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopicMessage basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TopicMessage newType) {
		TopicMessage oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.TOPIC__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPort> getPortTo() {
		if (portTo == null) {
			portTo = new EObjectWithInverseResolvingEList<InputPort>(InputPort.class, this,
					StatepubsubmodelPackage.TOPIC__PORT_TO, StatepubsubmodelPackage.INPUT_PORT__TOPIC);
		}
		return portTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort getPortFrom() {
		if (portFrom != null && portFrom.eIsProxy()) {
			InternalEObject oldPortFrom = (InternalEObject) portFrom;
			portFrom = (OutputPort) eResolveProxy(oldPortFrom);
			if (portFrom != oldPortFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatepubsubmodelPackage.TOPIC__PORT_FROM,
							oldPortFrom, portFrom));
			}
		}
		return portFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort basicGetPortFrom() {
		return portFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortFrom(OutputPort newPortFrom, NotificationChain msgs) {
		OutputPort oldPortFrom = portFrom;
		portFrom = newPortFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StatepubsubmodelPackage.TOPIC__PORT_FROM, oldPortFrom, newPortFrom);
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
	public void setPortFrom(OutputPort newPortFrom) {
		if (newPortFrom != portFrom) {
			NotificationChain msgs = null;
			if (portFrom != null)
				msgs = ((InternalEObject) portFrom).eInverseRemove(this, StatepubsubmodelPackage.OUTPUT_PORT__TOPIC,
						OutputPort.class, msgs);
			if (newPortFrom != null)
				msgs = ((InternalEObject) newPortFrom).eInverseAdd(this, StatepubsubmodelPackage.OUTPUT_PORT__TOPIC,
						OutputPort.class, msgs);
			msgs = basicSetPortFrom(newPortFrom, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.TOPIC__PORT_FROM, newPortFrom,
					newPortFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTopic_name() {
		return topic_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopic_name(String newTopic_name) {
		String oldTopic_name = topic_name;
		topic_name = newTopic_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.TOPIC__TOPIC_NAME,
					oldTopic_name, topic_name));
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
		case StatepubsubmodelPackage.TOPIC__PORT_TO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPortTo()).basicAdd(otherEnd, msgs);
		case StatepubsubmodelPackage.TOPIC__PORT_FROM:
			if (portFrom != null)
				msgs = ((InternalEObject) portFrom).eInverseRemove(this, StatepubsubmodelPackage.OUTPUT_PORT__TOPIC,
						OutputPort.class, msgs);
			return basicSetPortFrom((OutputPort) otherEnd, msgs);
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
		case StatepubsubmodelPackage.TOPIC__PORT_TO:
			return ((InternalEList<?>) getPortTo()).basicRemove(otherEnd, msgs);
		case StatepubsubmodelPackage.TOPIC__PORT_FROM:
			return basicSetPortFrom(null, msgs);
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
		case StatepubsubmodelPackage.TOPIC__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case StatepubsubmodelPackage.TOPIC__PORT_TO:
			return getPortTo();
		case StatepubsubmodelPackage.TOPIC__PORT_FROM:
			if (resolve)
				return getPortFrom();
			return basicGetPortFrom();
		case StatepubsubmodelPackage.TOPIC__TOPIC_NAME:
			return getTopic_name();
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
		case StatepubsubmodelPackage.TOPIC__TYPE:
			setType((TopicMessage) newValue);
			return;
		case StatepubsubmodelPackage.TOPIC__PORT_TO:
			getPortTo().clear();
			getPortTo().addAll((Collection<? extends InputPort>) newValue);
			return;
		case StatepubsubmodelPackage.TOPIC__PORT_FROM:
			setPortFrom((OutputPort) newValue);
			return;
		case StatepubsubmodelPackage.TOPIC__TOPIC_NAME:
			setTopic_name((String) newValue);
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
		case StatepubsubmodelPackage.TOPIC__TYPE:
			setType((TopicMessage) null);
			return;
		case StatepubsubmodelPackage.TOPIC__PORT_TO:
			getPortTo().clear();
			return;
		case StatepubsubmodelPackage.TOPIC__PORT_FROM:
			setPortFrom((OutputPort) null);
			return;
		case StatepubsubmodelPackage.TOPIC__TOPIC_NAME:
			setTopic_name(TOPIC_NAME_EDEFAULT);
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
		case StatepubsubmodelPackage.TOPIC__TYPE:
			return type != null;
		case StatepubsubmodelPackage.TOPIC__PORT_TO:
			return portTo != null && !portTo.isEmpty();
		case StatepubsubmodelPackage.TOPIC__PORT_FROM:
			return portFrom != null;
		case StatepubsubmodelPackage.TOPIC__TOPIC_NAME:
			return TOPIC_NAME_EDEFAULT == null ? topic_name != null : !TOPIC_NAME_EDEFAULT.equals(topic_name);
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
		result.append(" (topic_name: ");
		result.append(topic_name);
		result.append(')');
		return result.toString();
	}

} //TopicImpl
