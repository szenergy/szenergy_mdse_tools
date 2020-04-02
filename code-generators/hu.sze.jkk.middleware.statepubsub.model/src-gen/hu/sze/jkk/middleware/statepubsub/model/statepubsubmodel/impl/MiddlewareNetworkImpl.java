/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.MiddlewareNetwork;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Node;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Middleware Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.MiddlewareNetworkImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.MiddlewareNetworkImpl#getNode <em>Node</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.MiddlewareNetworkImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.MiddlewareNetworkImpl#getTopicmessage <em>Topicmessage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MiddlewareNetworkImpl extends MinimalEObjectImpl.Container implements MiddlewareNetwork {
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
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> node;

	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected EList<Topic> topic;

	/**
	 * The cached value of the '{@link #getTopicmessage() <em>Topicmessage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicmessage()
	 * @generated
	 * @ordered
	 */
	protected EList<TopicMessage> topicmessage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiddlewareNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatepubsubmodelPackage.Literals.MIDDLEWARE_NETWORK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.MIDDLEWARE_NETWORK__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNode() {
		if (node == null) {
			node = new EObjectContainmentEList<Node>(Node.class, this,
					StatepubsubmodelPackage.MIDDLEWARE_NETWORK__NODE);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Topic> getTopic() {
		if (topic == null) {
			topic = new EObjectContainmentEList<Topic>(Topic.class, this,
					StatepubsubmodelPackage.MIDDLEWARE_NETWORK__TOPIC);
		}
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TopicMessage> getTopicmessage() {
		if (topicmessage == null) {
			topicmessage = new EObjectContainmentEList<TopicMessage>(TopicMessage.class, this,
					StatepubsubmodelPackage.MIDDLEWARE_NETWORK__TOPICMESSAGE);
		}
		return topicmessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatepubsubmodelPackage.MIDDLEWARE_NETWORK__NODE:
			return ((InternalEList<?>) getNode()).basicRemove(otherEnd, msgs);
		case StatepubsubmodelPackage.MIDDLEWARE_NETWORK__TOPIC:
			return ((InternalEList<?>) getTopic()).basicRemove(otherEnd, msgs);
		case StatepubsubmodelPackage.MIDDLEWARE_NETWORK__TOPICMESSAGE:
			return ((InternalEList<?>) getTopicmessage()).basicRemove(otherEnd, msgs);
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
		case StatepubsubmodelPackage.MIDDLEWARE_NETWORK__NAME:
			return getName();
		case StatepubsubmodelPackage.MIDDLEWARE_NETWORK__NODE:
			return getNode();
		case StatepubsubmodelPackage.MIDDLEWARE_NETWORK__TOPIC:
			return getTopic();
		case StatepubsubmodelPackage.MIDDLEWARE_NETWORK__TOPICMESSAGE:
			return getTopicmessage();
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
		case StatepubsubmodelPackage.MIDDLEWARE_NETWORK__NAME:
			setName((String) newValue);
			return;
		case StatepubsubmodelPackage.MIDDLEWARE_NETWORK__NODE:
			getNode().clear();
			getNode().addAll((Collection<? extends Node>) newValue);
			return;
		case StatepubsubmodelPackage.MIDDLEWARE_NETWORK__TOPIC:
			getTopic().clear();
			getTopic().addAll((Collection<? extends Topic>) newValue);
			return;
		case StatepubsubmodelPackage.MIDDLEWARE_NETWORK__TOPICMESSAGE:
			getTopicmessage().clear();
			getTopicmessage().addAll((Collection<? extends TopicMessage>) newValue);
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
		case StatepubsubmodelPackage.MIDDLEWARE_NETWORK__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StatepubsubmodelPackage.MIDDLEWARE_NETWORK__NODE:
			getNode().clear();
			return;
		case StatepubsubmodelPackage.MIDDLEWARE_NETWORK__TOPIC:
			getTopic().clear();
			return;
		case StatepubsubmodelPackage.MIDDLEWARE_NETWORK__TOPICMESSAGE:
			getTopicmessage().clear();
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
		case StatepubsubmodelPackage.MIDDLEWARE_NETWORK__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case StatepubsubmodelPackage.MIDDLEWARE_NETWORK__NODE:
			return node != null && !node.isEmpty();
		case StatepubsubmodelPackage.MIDDLEWARE_NETWORK__TOPIC:
			return topic != null && !topic.isEmpty();
		case StatepubsubmodelPackage.MIDDLEWARE_NETWORK__TOPICMESSAGE:
			return topicmessage != null && !topicmessage.isEmpty();
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

} //MiddlewareNetworkImpl
