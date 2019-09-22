/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.MiddlewareNetwork;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Node;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.OutputPort;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Port;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelFactory;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Topic;
import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.TopicMessage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatepubsubmodelPackageImpl extends EPackageImpl implements StatepubsubmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass middlewareNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topicMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continousStateEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatepubsubmodelPackageImpl() {
		super(eNS_URI, StatepubsubmodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link StatepubsubmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatepubsubmodelPackage init() {
		if (isInited)
			return (StatepubsubmodelPackage) EPackage.Registry.INSTANCE.getEPackage(StatepubsubmodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStatepubsubmodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StatepubsubmodelPackageImpl theStatepubsubmodelPackage = registeredStatepubsubmodelPackage instanceof StatepubsubmodelPackageImpl
				? (StatepubsubmodelPackageImpl) registeredStatepubsubmodelPackage
				: new StatepubsubmodelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theStatepubsubmodelPackage.createPackageContents();

		// Initialize created meta-data
		theStatepubsubmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatepubsubmodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatepubsubmodelPackage.eNS_URI, theStatepubsubmodelPackage);
		return theStatepubsubmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMiddlewareNetwork() {
		return middlewareNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMiddlewareNetwork_Name() {
		return (EAttribute) middlewareNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiddlewareNetwork_Node() {
		return (EReference) middlewareNetworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiddlewareNetwork_Topic() {
		return (EReference) middlewareNetworkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiddlewareNetwork_Topicmessage() {
		return (EReference) middlewareNetworkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPort() {
		return inputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPort_Node() {
		return (EReference) inputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPort_ContinousState() {
		return (EReference) inputPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPort_Topic() {
		return (EReference) inputPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputPort() {
		return outputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPort_Node() {
		return (EReference) outputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPort_ContinousState() {
		return (EReference) outputPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPort_Topic() {
		return (EReference) outputPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Id() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Outputport() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Inputport() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Name() {
		return (EAttribute) nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Continousstate() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopicMessage() {
		return topicMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopicMessage_Name() {
		return (EAttribute) topicMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopicMessage_Prefix() {
		return (EAttribute) topicMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopic() {
		return topicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopic_Type() {
		return (EReference) topicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopic_PortTo() {
		return (EReference) topicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopic_PortFrom() {
		return (EReference) topicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopic_Topic_name() {
		return (EAttribute) topicEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinousState() {
		return continousStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContinousState_ProducesTo() {
		return (EReference) continousStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContinousState_ReceivesFrom() {
		return (EReference) continousStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContinousState_Name() {
		return (EAttribute) continousStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatepubsubmodelFactory getStatepubsubmodelFactory() {
		return (StatepubsubmodelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		middlewareNetworkEClass = createEClass(MIDDLEWARE_NETWORK);
		createEAttribute(middlewareNetworkEClass, MIDDLEWARE_NETWORK__NAME);
		createEReference(middlewareNetworkEClass, MIDDLEWARE_NETWORK__NODE);
		createEReference(middlewareNetworkEClass, MIDDLEWARE_NETWORK__TOPIC);
		createEReference(middlewareNetworkEClass, MIDDLEWARE_NETWORK__TOPICMESSAGE);

		inputPortEClass = createEClass(INPUT_PORT);
		createEReference(inputPortEClass, INPUT_PORT__NODE);
		createEReference(inputPortEClass, INPUT_PORT__CONTINOUS_STATE);
		createEReference(inputPortEClass, INPUT_PORT__TOPIC);

		outputPortEClass = createEClass(OUTPUT_PORT);
		createEReference(outputPortEClass, OUTPUT_PORT__NODE);
		createEReference(outputPortEClass, OUTPUT_PORT__CONTINOUS_STATE);
		createEReference(outputPortEClass, OUTPUT_PORT__TOPIC);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__ID);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__OUTPUTPORT);
		createEReference(nodeEClass, NODE__INPUTPORT);
		createEAttribute(nodeEClass, NODE__NAME);
		createEReference(nodeEClass, NODE__CONTINOUSSTATE);

		topicMessageEClass = createEClass(TOPIC_MESSAGE);
		createEAttribute(topicMessageEClass, TOPIC_MESSAGE__NAME);
		createEAttribute(topicMessageEClass, TOPIC_MESSAGE__PREFIX);

		topicEClass = createEClass(TOPIC);
		createEReference(topicEClass, TOPIC__TYPE);
		createEReference(topicEClass, TOPIC__PORT_TO);
		createEReference(topicEClass, TOPIC__PORT_FROM);
		createEAttribute(topicEClass, TOPIC__TOPIC_NAME);

		continousStateEClass = createEClass(CONTINOUS_STATE);
		createEReference(continousStateEClass, CONTINOUS_STATE__PRODUCES_TO);
		createEReference(continousStateEClass, CONTINOUS_STATE__RECEIVES_FROM);
		createEAttribute(continousStateEClass, CONTINOUS_STATE__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		inputPortEClass.getESuperTypes().add(this.getPort());
		outputPortEClass.getESuperTypes().add(this.getPort());

		// Initialize classes, features, and operations; add parameters
		initEClass(middlewareNetworkEClass, MiddlewareNetwork.class, "MiddlewareNetwork", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMiddlewareNetwork_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				MiddlewareNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMiddlewareNetwork_Node(), this.getNode(), null, "node", null, 0, -1, MiddlewareNetwork.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiddlewareNetwork_Topic(), this.getTopic(), null, "topic", null, 0, -1,
				MiddlewareNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiddlewareNetwork_Topicmessage(), this.getTopicMessage(), null, "topicmessage", null, 0, -1,
				MiddlewareNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputPortEClass, InputPort.class, "InputPort", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputPort_Node(), this.getNode(), this.getNode_Inputport(), "node", null, 1, 1,
				InputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputPort_ContinousState(), this.getContinousState(), this.getContinousState_ReceivesFrom(),
				"continousState", null, 0, -1, InputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputPort_Topic(), this.getTopic(), this.getTopic_PortTo(), "topic", null, 0, 1,
				InputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputPortEClass, OutputPort.class, "OutputPort", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputPort_Node(), this.getNode(), this.getNode_Outputport(), "node", null, 1, 1,
				OutputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputPort_ContinousState(), this.getContinousState(), this.getContinousState_ProducesTo(),
				"continousState", null, 0, 1, OutputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputPort_Topic(), this.getTopic(), this.getTopic_PortFrom(), "topic", null, 0, 1,
				OutputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Id(), ecorePackage.getEString(), "id", null, 0, 1, Port.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_Outputport(), this.getOutputPort(), this.getOutputPort_Node(), "outputport", null, 0, -1,
				Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Inputport(), this.getInputPort(), this.getInputPort_Node(), "inputport", null, 0, -1,
				Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Continousstate(), this.getContinousState(), null, "continousstate", null, 0, -1,
				Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topicMessageEClass, TopicMessage.class, "TopicMessage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTopicMessage_Name(), ecorePackage.getEString(), "name", null, 0, 1, TopicMessage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTopicMessage_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, TopicMessage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topicEClass, Topic.class, "Topic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTopic_Type(), this.getTopicMessage(), null, "type", null, 0, 1, Topic.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTopic_PortTo(), this.getInputPort(), this.getInputPort_Topic(), "portTo", null, 0, -1,
				Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopic_PortFrom(), this.getOutputPort(), this.getOutputPort_Topic(), "portFrom", null, 0, 1,
				Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTopic_Topic_name(), ecorePackage.getEString(), "topic_name", null, 0, 1, Topic.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(continousStateEClass, ContinousState.class, "ContinousState", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContinousState_ProducesTo(), this.getOutputPort(), this.getOutputPort_ContinousState(),
				"producesTo", null, 0, -1, ContinousState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContinousState_ReceivesFrom(), this.getInputPort(), this.getInputPort_ContinousState(),
				"receivesFrom", null, 0, -1, ContinousState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContinousState_Name(), ecorePackage.getEString(), "name", null, 0, 1, ContinousState.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //StatepubsubmodelPackageImpl
