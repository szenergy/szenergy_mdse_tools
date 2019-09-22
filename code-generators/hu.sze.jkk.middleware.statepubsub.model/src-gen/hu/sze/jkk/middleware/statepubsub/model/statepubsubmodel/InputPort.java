/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort#getNode <em>Node</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort#getContinousState <em>Continous State</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort#getTopic <em>Topic</em>}</li>
 * </ul>
 *
 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getInputPort()
 * @model
 * @generated
 */
public interface InputPort extends Port {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Node#getInputport <em>Inputport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' container reference.
	 * @see #setNode(Node)
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getInputPort_Node()
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Node#getInputport
	 * @model opposite="inputport" required="true" transient="false"
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort#getNode <em>Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' container reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);

	/**
	 * Returns the value of the '<em><b>Continous State</b></em>' reference list.
	 * The list contents are of type {@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState}.
	 * It is bidirectional and its opposite is '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState#getReceivesFrom <em>Receives From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continous State</em>' reference list.
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getInputPort_ContinousState()
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState#getReceivesFrom
	 * @model opposite="receivesFrom"
	 * @generated
	 */
	EList<ContinousState> getContinousState();

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Topic#getPortTo <em>Port To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' reference.
	 * @see #setTopic(Topic)
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getInputPort_Topic()
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Topic#getPortTo
	 * @model opposite="portTo"
	 * @generated
	 */
	Topic getTopic();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.InputPort#getTopic <em>Topic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' reference.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(Topic value);

} // InputPort
