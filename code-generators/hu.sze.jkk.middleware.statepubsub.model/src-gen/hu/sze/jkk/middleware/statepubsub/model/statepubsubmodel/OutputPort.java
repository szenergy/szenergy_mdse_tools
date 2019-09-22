/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.OutputPort#getNode <em>Node</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.OutputPort#getContinousState <em>Continous State</em>}</li>
 *   <li>{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.OutputPort#getTopic <em>Topic</em>}</li>
 * </ul>
 *
 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getOutputPort()
 * @model
 * @generated
 */
public interface OutputPort extends Port {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Node#getOutputport <em>Outputport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' container reference.
	 * @see #setNode(Node)
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getOutputPort_Node()
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Node#getOutputport
	 * @model opposite="outputport" required="true" transient="false"
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.OutputPort#getNode <em>Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' container reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);

	/**
	 * Returns the value of the '<em><b>Continous State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState#getProducesTo <em>Produces To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continous State</em>' reference.
	 * @see #setContinousState(ContinousState)
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getOutputPort_ContinousState()
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.ContinousState#getProducesTo
	 * @model opposite="producesTo"
	 * @generated
	 */
	ContinousState getContinousState();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.OutputPort#getContinousState <em>Continous State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continous State</em>' reference.
	 * @see #getContinousState()
	 * @generated
	 */
	void setContinousState(ContinousState value);

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Topic#getPortFrom <em>Port From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' reference.
	 * @see #setTopic(Topic)
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage#getOutputPort_Topic()
	 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Topic#getPortFrom
	 * @model opposite="portFrom"
	 * @generated
	 */
	Topic getTopic();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.OutputPort#getTopic <em>Topic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' reference.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(Topic value);

} // OutputPort
