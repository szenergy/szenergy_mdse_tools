/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatepubsubmodelFactoryImpl extends EFactoryImpl implements StatepubsubmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatepubsubmodelFactory init() {
		try {
			StatepubsubmodelFactory theStatepubsubmodelFactory = (StatepubsubmodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(StatepubsubmodelPackage.eNS_URI);
			if (theStatepubsubmodelFactory != null) {
				return theStatepubsubmodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatepubsubmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatepubsubmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case StatepubsubmodelPackage.MIDDLEWARE_NETWORK:
			return createMiddlewareNetwork();
		case StatepubsubmodelPackage.INPUT_PORT:
			return createInputPort();
		case StatepubsubmodelPackage.OUTPUT_PORT:
			return createOutputPort();
		case StatepubsubmodelPackage.NODE:
			return createNode();
		case StatepubsubmodelPackage.TOPIC_MESSAGE:
			return createTopicMessage();
		case StatepubsubmodelPackage.TOPIC:
			return createTopic();
		case StatepubsubmodelPackage.CONTINOUS_STATE:
			return createContinousState();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiddlewareNetwork createMiddlewareNetwork() {
		MiddlewareNetworkImpl middlewareNetwork = new MiddlewareNetworkImpl();
		return middlewareNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort createInputPort() {
		InputPortImpl inputPort = new InputPortImpl();
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort createOutputPort() {
		OutputPortImpl outputPort = new OutputPortImpl();
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopicMessage createTopicMessage() {
		TopicMessageImpl topicMessage = new TopicMessageImpl();
		return topicMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topic createTopic() {
		TopicImpl topic = new TopicImpl();
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinousState createContinousState() {
		ContinousStateImpl continousState = new ContinousStateImpl();
		return continousState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatepubsubmodelPackage getStatepubsubmodelPackage() {
		return (StatepubsubmodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatepubsubmodelPackage getPackage() {
		return StatepubsubmodelPackage.eINSTANCE;
	}

} //StatepubsubmodelFactoryImpl
