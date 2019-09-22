/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Middleware Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.MiddlewareNetwork#getName <em>Name</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.MiddlewareNetwork#getNode <em>Node</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.MiddlewareNetwork#getTopic <em>Topic</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.MiddlewareNetwork#getTopicmessage <em>Topicmessage</em>}</li>
 * </ul>
 *
 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getMiddlewareNetwork()
 * @model
 * @generated
 */
public interface MiddlewareNetwork extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getMiddlewareNetwork_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.MiddlewareNetwork#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getMiddlewareNetwork_Node()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNode();

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' containment reference list.
	 * The list contents are of type {@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Topic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' containment reference list.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getMiddlewareNetwork_Topic()
	 * @model containment="true"
	 * @generated
	 */
	EList<Topic> getTopic();

	/**
	 * Returns the value of the '<em><b>Topicmessage</b></em>' containment reference list.
	 * The list contents are of type {@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.TopicMessage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topicmessage</em>' containment reference list.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getMiddlewareNetwork_Topicmessage()
	 * @model containment="true"
	 * @generated
	 */
	EList<TopicMessage> getTopicmessage();

} // MiddlewareNetwork
