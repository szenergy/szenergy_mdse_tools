/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Node;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.OutputPort;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Topic;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.OutputPortImpl#getNode <em>Node</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.OutputPortImpl#getContinousState <em>Continous State</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.OutputPortImpl#getTopic <em>Topic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputPortImpl extends PortImpl implements OutputPort {
	/**
	 * The cached value of the '{@link #getContinousState() <em>Continous State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinousState()
	 * @generated
	 * @ordered
	 */
	protected ContinousState continousState;

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
	protected OutputPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatepubsubmodelPackage.Literals.OUTPUT_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNode() {
		if (eContainerFeatureID() != StatepubsubmodelPackage.OUTPUT_PORT__NODE)
			return null;
		return (Node) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNode(Node newNode, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newNode, StatepubsubmodelPackage.OUTPUT_PORT__NODE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(Node newNode) {
		if (newNode != eInternalContainer()
				|| (eContainerFeatureID() != StatepubsubmodelPackage.OUTPUT_PORT__NODE && newNode != null)) {
			if (EcoreUtil.isAncestor(this, newNode))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNode != null)
				msgs = ((InternalEObject) newNode).eInverseAdd(this, StatepubsubmodelPackage.NODE__OUTPUTPORT,
						Node.class, msgs);
			msgs = basicSetNode(newNode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.OUTPUT_PORT__NODE, newNode,
					newNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinousState getContinousState() {
		if (continousState != null && continousState.eIsProxy()) {
			InternalEObject oldContinousState = (InternalEObject) continousState;
			continousState = (ContinousState) eResolveProxy(oldContinousState);
			if (continousState != oldContinousState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StatepubsubmodelPackage.OUTPUT_PORT__CONTINOUS_STATE, oldContinousState, continousState));
			}
		}
		return continousState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinousState basicGetContinousState() {
		return continousState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContinousState(ContinousState newContinousState, NotificationChain msgs) {
		ContinousState oldContinousState = continousState;
		continousState = newContinousState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StatepubsubmodelPackage.OUTPUT_PORT__CONTINOUS_STATE, oldContinousState, newContinousState);
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
	public void setContinousState(ContinousState newContinousState) {
		if (newContinousState != continousState) {
			NotificationChain msgs = null;
			if (continousState != null)
				msgs = ((InternalEObject) continousState).eInverseRemove(this,
						StatepubsubmodelPackage.CONTINOUS_STATE__PRODUCES_TO, ContinousState.class, msgs);
			if (newContinousState != null)
				msgs = ((InternalEObject) newContinousState).eInverseAdd(this,
						StatepubsubmodelPackage.CONTINOUS_STATE__PRODUCES_TO, ContinousState.class, msgs);
			msgs = basicSetContinousState(newContinousState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.OUTPUT_PORT__CONTINOUS_STATE,
					newContinousState, newContinousState));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StatepubsubmodelPackage.OUTPUT_PORT__TOPIC, oldTopic, topic));
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
					StatepubsubmodelPackage.OUTPUT_PORT__TOPIC, oldTopic, newTopic);
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
				msgs = ((InternalEObject) topic).eInverseRemove(this, StatepubsubmodelPackage.TOPIC__PORT_FROM,
						Topic.class, msgs);
			if (newTopic != null)
				msgs = ((InternalEObject) newTopic).eInverseAdd(this, StatepubsubmodelPackage.TOPIC__PORT_FROM,
						Topic.class, msgs);
			msgs = basicSetTopic(newTopic, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatepubsubmodelPackage.OUTPUT_PORT__TOPIC, newTopic,
					newTopic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatepubsubmodelPackage.OUTPUT_PORT__NODE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetNode((Node) otherEnd, msgs);
		case StatepubsubmodelPackage.OUTPUT_PORT__CONTINOUS_STATE:
			if (continousState != null)
				msgs = ((InternalEObject) continousState).eInverseRemove(this,
						StatepubsubmodelPackage.CONTINOUS_STATE__PRODUCES_TO, ContinousState.class, msgs);
			return basicSetContinousState((ContinousState) otherEnd, msgs);
		case StatepubsubmodelPackage.OUTPUT_PORT__TOPIC:
			if (topic != null)
				msgs = ((InternalEObject) topic).eInverseRemove(this, StatepubsubmodelPackage.TOPIC__PORT_FROM,
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
		case StatepubsubmodelPackage.OUTPUT_PORT__NODE:
			return basicSetNode(null, msgs);
		case StatepubsubmodelPackage.OUTPUT_PORT__CONTINOUS_STATE:
			return basicSetContinousState(null, msgs);
		case StatepubsubmodelPackage.OUTPUT_PORT__TOPIC:
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
		case StatepubsubmodelPackage.OUTPUT_PORT__NODE:
			return eInternalContainer().eInverseRemove(this, StatepubsubmodelPackage.NODE__OUTPUTPORT, Node.class,
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
		case StatepubsubmodelPackage.OUTPUT_PORT__NODE:
			return getNode();
		case StatepubsubmodelPackage.OUTPUT_PORT__CONTINOUS_STATE:
			if (resolve)
				return getContinousState();
			return basicGetContinousState();
		case StatepubsubmodelPackage.OUTPUT_PORT__TOPIC:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StatepubsubmodelPackage.OUTPUT_PORT__NODE:
			setNode((Node) newValue);
			return;
		case StatepubsubmodelPackage.OUTPUT_PORT__CONTINOUS_STATE:
			setContinousState((ContinousState) newValue);
			return;
		case StatepubsubmodelPackage.OUTPUT_PORT__TOPIC:
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
		case StatepubsubmodelPackage.OUTPUT_PORT__NODE:
			setNode((Node) null);
			return;
		case StatepubsubmodelPackage.OUTPUT_PORT__CONTINOUS_STATE:
			setContinousState((ContinousState) null);
			return;
		case StatepubsubmodelPackage.OUTPUT_PORT__TOPIC:
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
		case StatepubsubmodelPackage.OUTPUT_PORT__NODE:
			return getNode() != null;
		case StatepubsubmodelPackage.OUTPUT_PORT__CONTINOUS_STATE:
			return continousState != null;
		case StatepubsubmodelPackage.OUTPUT_PORT__TOPIC:
			return topic != null;
		}
		return super.eIsSet(featureID);
	}

} //OutputPortImpl
