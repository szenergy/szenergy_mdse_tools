/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Node;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Topic;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InputPortImpl#getNode <em>Node</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InputPortImpl#getContinousState <em>Continous State</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InputPortImpl#getTopic <em>Topic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputPortImpl extends PortImpl implements InputPort {
	/**
	 * The cached value of the '{@link #getContinousState() <em>Continous State</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinousState()
	 * @generated
	 * @ordered
	 */
	protected EList<ContinousState> continousState;

	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected Topic topic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatepubsubmodelPackage.Literals.INPUT_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNode() {
		if (eContainerFeatureID() != StatepubsubmodelPackage.INPUT_PORT__NODE)
			return null;
		return (Node) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNode(Node newNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newNode, StatepubsubmodelPackage.INPUT_PORT__NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(Node newNode) {
		if (newNode != eInternalContainer()
				|| (eContainerFeatureID() != StatepubsubmodelPackage.INPUT_PORT__NODE && newNode != null)) {
			if (EcoreUtil.isAncestor(this, newNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNode != null)
				msgs = ((InternalEObject) newNode).eInverseAdd(this, StatepubsubmodelPackage.NODE__INPUTPORT,
						Node.class, msgs);
			msgs = basicSetNode(newNode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.INPUT_PORT__NODE, newNode,
					newNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContinousState> getContinousState() {
		if (continousState == null) {
			continousState = new EObjectWithInverseResolvingEList.ManyInverse<ContinousState>(ContinousState.class,
					this, StatepubsubmodelPackage.INPUT_PORT__CONTINOUS_STATE,
					StatepubsubmodelPackage.CONTINOUS_STATE__RECEIVES_FROM);
		}
		return continousState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topic getTopic() {
		if (topic != null && topic.eIsProxy()) {
			InternalEObject oldTopic = (InternalEObject) topic;
			topic = (Topic) eResolveProxy(oldTopic);
			if (topic != oldTopic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatepubsubmodelPackage.INPUT_PORT__TOPIC,
							oldTopic, topic));
			}
		}
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topic basicGetTopic() {
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopic(Topic newTopic, NotificationChain msgs) {
		Topic oldTopic = topic;
		topic = newTopic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StatepubsubmodelPackage.INPUT_PORT__TOPIC, oldTopic, newTopic);
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
	public void setTopic(Topic newTopic) {
		if (newTopic != topic) {
			NotificationChain msgs = null;
			if (topic != null)
				msgs = ((InternalEObject) topic).eInverseRemove(this, StatepubsubmodelPackage.TOPIC__PORT_TO,
						Topic.class, msgs);
			if (newTopic != null)
				msgs = ((InternalEObject) newTopic).eInverseAdd(this, StatepubsubmodelPackage.TOPIC__PORT_TO,
						Topic.class, msgs);
			msgs = basicSetTopic(newTopic, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.INPUT_PORT__TOPIC, newTopic,
					newTopic));
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
		case StatepubsubmodelPackage.INPUT_PORT__NODE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetNode((Node) otherEnd, msgs);
		case StatepubsubmodelPackage.INPUT_PORT__CONTINOUS_STATE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getContinousState()).basicAdd(otherEnd, msgs);
		case StatepubsubmodelPackage.INPUT_PORT__TOPIC:
			if (topic != null)
				msgs = ((InternalEObject) topic).eInverseRemove(this, StatepubsubmodelPackage.TOPIC__PORT_TO,
						Topic.class, msgs);
			return basicSetTopic((Topic) otherEnd, msgs);
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
		case StatepubsubmodelPackage.INPUT_PORT__NODE:
			return basicSetNode(null, msgs);
		case StatepubsubmodelPackage.INPUT_PORT__CONTINOUS_STATE:
			return ((InternalEList<?>) getContinousState()).basicRemove(otherEnd, msgs);
		case StatepubsubmodelPackage.INPUT_PORT__TOPIC:
			return basicSetTopic(null, msgs);
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
		case StatepubsubmodelPackage.INPUT_PORT__NODE:
			return eInternalContainer().eInverseRemove(this, StatepubsubmodelPackage.NODE__INPUTPORT, Node.class, msgs);
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
		case StatepubsubmodelPackage.INPUT_PORT__NODE:
			return getNode();
		case StatepubsubmodelPackage.INPUT_PORT__CONTINOUS_STATE:
			return getContinousState();
		case StatepubsubmodelPackage.INPUT_PORT__TOPIC:
			if (resolve)
				return getTopic();
			return basicGetTopic();
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
		case StatepubsubmodelPackage.INPUT_PORT__NODE:
			setNode((Node) newValue);
			return;
		case StatepubsubmodelPackage.INPUT_PORT__CONTINOUS_STATE:
			getContinousState().clear();
			getContinousState().addAll((Collection<? extends ContinousState>) newValue);
			return;
		case StatepubsubmodelPackage.INPUT_PORT__TOPIC:
			setTopic((Topic) newValue);
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
		case StatepubsubmodelPackage.INPUT_PORT__NODE:
			setNode((Node) null);
			return;
		case StatepubsubmodelPackage.INPUT_PORT__CONTINOUS_STATE:
			getContinousState().clear();
			return;
		case StatepubsubmodelPackage.INPUT_PORT__TOPIC:
			setTopic((Topic) null);
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
		case StatepubsubmodelPackage.INPUT_PORT__NODE:
			return getNode() != null;
		case StatepubsubmodelPackage.INPUT_PORT__CONTINOUS_STATE:
			return continousState != null && !continousState.isEmpty();
		case StatepubsubmodelPackage.INPUT_PORT__TOPIC:
			return topic != null;
		}
		return super.eIsSet(featureID);
	}

} //InputPortImpl
