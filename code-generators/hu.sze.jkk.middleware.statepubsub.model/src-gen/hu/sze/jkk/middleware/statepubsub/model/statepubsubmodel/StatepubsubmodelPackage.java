/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelFactory
 * @model kind="package"
 * @generated
 */
public interface StatepubsubmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "statepubsubmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jkk.sze.hu/statepubsubmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "statepubsubmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatepubsubmodelPackage eINSTANCE = hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.MiddlewareNetworkImpl <em>Middleware Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.MiddlewareNetworkImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getMiddlewareNetwork()
	 * @generated
	 */
	int MIDDLEWARE_NETWORK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE_NETWORK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE_NETWORK__NODE = 1;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE_NETWORK__TOPIC = 2;

	/**
	 * The feature id for the '<em><b>Topicmessage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE_NETWORK__TOPICMESSAGE = 3;

	/**
	 * The number of structural features of the '<em>Middleware Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE_NETWORK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Middleware Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE_NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.PortImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ID = 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InputPortImpl <em>Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InputPortImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getInputPort()
	 * @generated
	 */
	int INPUT_PORT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__ID = PORT__ID;

	/**
	 * The feature id for the '<em><b>Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__NODE = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Continous State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__CONTINOUS_STATE = PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__TOPIC = PORT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.OutputPortImpl <em>Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.OutputPortImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getOutputPort()
	 * @generated
	 */
	int OUTPUT_PORT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__ID = PORT__ID;

	/**
	 * The feature id for the '<em><b>Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__NODE = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Continous State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__CONTINOUS_STATE = PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__TOPIC = PORT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.NodeImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 4;

	/**
	 * The feature id for the '<em><b>Outputport</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUTPUTPORT = 0;

	/**
	 * The feature id for the '<em><b>Inputport</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INPUTPORT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Continousstate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CONTINOUSSTATE = 3;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TopicMessageImpl <em>Topic Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TopicMessageImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getTopicMessage()
	 * @generated
	 */
	int TOPIC_MESSAGE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_MESSAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_MESSAGE__PREFIX = 1;

	/**
	 * The number of structural features of the '<em>Topic Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_MESSAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Topic Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TopicImpl <em>Topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TopicImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getTopic()
	 * @generated
	 */
	int TOPIC = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Port To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__PORT_TO = 1;

	/**
	 * The feature id for the '<em><b>Port From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__PORT_FROM = 2;

	/**
	 * The feature id for the '<em><b>Topic name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__TOPIC_NAME = 3;

	/**
	 * The number of structural features of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ContinousStateImpl <em>Continous State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ContinousStateImpl
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getContinousState()
	 * @generated
	 */
	int CONTINOUS_STATE = 7;

	/**
	 * The feature id for the '<em><b>Produces To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_STATE__PRODUCES_TO = 0;

	/**
	 * The feature id for the '<em><b>Receives From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_STATE__RECEIVES_FROM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_STATE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Continous State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_STATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Continous State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINOUS_STATE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.MiddlewareNetwork <em>Middleware Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Middleware Network</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.MiddlewareNetwork
	 * @generated
	 */
	EClass getMiddlewareNetwork();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.MiddlewareNetwork#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.MiddlewareNetwork#getName()
	 * @see #getMiddlewareNetwork()
	 * @generated
	 */
	EAttribute getMiddlewareNetwork_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.MiddlewareNetwork#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.MiddlewareNetwork#getNode()
	 * @see #getMiddlewareNetwork()
	 * @generated
	 */
	EReference getMiddlewareNetwork_Node();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.MiddlewareNetwork#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Topic</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.MiddlewareNetwork#getTopic()
	 * @see #getMiddlewareNetwork()
	 * @generated
	 */
	EReference getMiddlewareNetwork_Topic();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.MiddlewareNetwork#getTopicmessage <em>Topicmessage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Topicmessage</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.MiddlewareNetwork#getTopicmessage()
	 * @see #getMiddlewareNetwork()
	 * @generated
	 */
	EReference getMiddlewareNetwork_Topicmessage();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Port</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort
	 * @generated
	 */
	EClass getInputPort();

	/**
	 * Returns the meta object for the container reference '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Node</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort#getNode()
	 * @see #getInputPort()
	 * @generated
	 */
	EReference getInputPort_Node();

	/**
	 * Returns the meta object for the reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort#getContinousState <em>Continous State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Continous State</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort#getContinousState()
	 * @see #getInputPort()
	 * @generated
	 */
	EReference getInputPort_ContinousState();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topic</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort#getTopic()
	 * @see #getInputPort()
	 * @generated
	 */
	EReference getInputPort_Topic();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Port</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.OutputPort
	 * @generated
	 */
	EClass getOutputPort();

	/**
	 * Returns the meta object for the container reference '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.OutputPort#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Node</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.OutputPort#getNode()
	 * @see #getOutputPort()
	 * @generated
	 */
	EReference getOutputPort_Node();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.OutputPort#getContinousState <em>Continous State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Continous State</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.OutputPort#getContinousState()
	 * @see #getOutputPort()
	 * @generated
	 */
	EReference getOutputPort_ContinousState();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.OutputPort#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topic</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.OutputPort#getTopic()
	 * @see #getOutputPort()
	 * @generated
	 */
	EReference getOutputPort_Topic();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Port#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Port#getId()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Id();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Node#getOutputport <em>Outputport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputport</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Node#getOutputport()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Outputport();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Node#getInputport <em>Inputport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputport</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Node#getInputport()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Inputport();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Node#getContinousstate <em>Continousstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Continousstate</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Node#getContinousstate()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Continousstate();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.TopicMessage <em>Topic Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic Message</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.TopicMessage
	 * @generated
	 */
	EClass getTopicMessage();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.TopicMessage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.TopicMessage#getName()
	 * @see #getTopicMessage()
	 * @generated
	 */
	EAttribute getTopicMessage_Name();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.TopicMessage#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.TopicMessage#getPrefix()
	 * @see #getTopicMessage()
	 * @generated
	 */
	EAttribute getTopicMessage_Prefix();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Topic
	 * @generated
	 */
	EClass getTopic();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Topic#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Topic#getType()
	 * @see #getTopic()
	 * @generated
	 */
	EReference getTopic_Type();

	/**
	 * Returns the meta object for the reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Topic#getPortTo <em>Port To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port To</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Topic#getPortTo()
	 * @see #getTopic()
	 * @generated
	 */
	EReference getTopic_PortTo();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Topic#getPortFrom <em>Port From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port From</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Topic#getPortFrom()
	 * @see #getTopic()
	 * @generated
	 */
	EReference getTopic_PortFrom();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Topic#getTopic_name <em>Topic name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic name</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Topic#getTopic_name()
	 * @see #getTopic()
	 * @generated
	 */
	EAttribute getTopic_Topic_name();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState <em>Continous State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continous State</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState
	 * @generated
	 */
	EClass getContinousState();

	/**
	 * Returns the meta object for the reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState#getProducesTo <em>Produces To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Produces To</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState#getProducesTo()
	 * @see #getContinousState()
	 * @generated
	 */
	EReference getContinousState_ProducesTo();

	/**
	 * Returns the meta object for the reference list '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState#getReceivesFrom <em>Receives From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receives From</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState#getReceivesFrom()
	 * @see #getContinousState()
	 * @generated
	 */
	EReference getContinousState_ReceivesFrom();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState#getName()
	 * @see #getContinousState()
	 * @generated
	 */
	EAttribute getContinousState_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatepubsubmodelFactory getStatepubsubmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.MiddlewareNetworkImpl <em>Middleware Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.MiddlewareNetworkImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getMiddlewareNetwork()
		 * @generated
		 */
		EClass MIDDLEWARE_NETWORK = eINSTANCE.getMiddlewareNetwork();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIDDLEWARE_NETWORK__NAME = eINSTANCE.getMiddlewareNetwork_Name();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIDDLEWARE_NETWORK__NODE = eINSTANCE.getMiddlewareNetwork_Node();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIDDLEWARE_NETWORK__TOPIC = eINSTANCE.getMiddlewareNetwork_Topic();

		/**
		 * The meta object literal for the '<em><b>Topicmessage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIDDLEWARE_NETWORK__TOPICMESSAGE = eINSTANCE.getMiddlewareNetwork_Topicmessage();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InputPortImpl <em>Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.InputPortImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getInputPort()
		 * @generated
		 */
		EClass INPUT_PORT = eINSTANCE.getInputPort();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PORT__NODE = eINSTANCE.getInputPort_Node();

		/**
		 * The meta object literal for the '<em><b>Continous State</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PORT__CONTINOUS_STATE = eINSTANCE.getInputPort_ContinousState();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PORT__TOPIC = eINSTANCE.getInputPort_Topic();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.OutputPortImpl <em>Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.OutputPortImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getOutputPort()
		 * @generated
		 */
		EClass OUTPUT_PORT = eINSTANCE.getOutputPort();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PORT__NODE = eINSTANCE.getOutputPort_Node();

		/**
		 * The meta object literal for the '<em><b>Continous State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PORT__CONTINOUS_STATE = eINSTANCE.getOutputPort_ContinousState();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PORT__TOPIC = eINSTANCE.getOutputPort_Topic();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.PortImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__ID = eINSTANCE.getPort_Id();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.NodeImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Outputport</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OUTPUTPORT = eINSTANCE.getNode_Outputport();

		/**
		 * The meta object literal for the '<em><b>Inputport</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__INPUTPORT = eINSTANCE.getNode_Inputport();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Continousstate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CONTINOUSSTATE = eINSTANCE.getNode_Continousstate();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TopicMessageImpl <em>Topic Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TopicMessageImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getTopicMessage()
		 * @generated
		 */
		EClass TOPIC_MESSAGE = eINSTANCE.getTopicMessage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC_MESSAGE__NAME = eINSTANCE.getTopicMessage_Name();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC_MESSAGE__PREFIX = eINSTANCE.getTopicMessage_Prefix();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TopicImpl <em>Topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.TopicImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getTopic()
		 * @generated
		 */
		EClass TOPIC = eINSTANCE.getTopic();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC__TYPE = eINSTANCE.getTopic_Type();

		/**
		 * The meta object literal for the '<em><b>Port To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC__PORT_TO = eINSTANCE.getTopic_PortTo();

		/**
		 * The meta object literal for the '<em><b>Port From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC__PORT_FROM = eINSTANCE.getTopic_PortFrom();

		/**
		 * The meta object literal for the '<em><b>Topic name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__TOPIC_NAME = eINSTANCE.getTopic_Topic_name();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ContinousStateImpl <em>Continous State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.ContinousStateImpl
		 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelPackageImpl#getContinousState()
		 * @generated
		 */
		EClass CONTINOUS_STATE = eINSTANCE.getContinousState();

		/**
		 * The meta object literal for the '<em><b>Produces To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTINOUS_STATE__PRODUCES_TO = eINSTANCE.getContinousState_ProducesTo();

		/**
		 * The meta object literal for the '<em><b>Receives From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTINOUS_STATE__RECEIVES_FROM = eINSTANCE.getContinousState_ReceivesFrom();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTINOUS_STATE__NAME = eINSTANCE.getContinousState_Name();

	}

} //StatepubsubmodelPackage
