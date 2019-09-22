/**
 */
package hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.StatepubsubmodelPackage
 * @generated
 */
public interface StatepubsubmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatepubsubmodelFactory eINSTANCE = hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.impl.StatepubsubmodelFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Middleware Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Middleware Network</em>'.
	 * @generated
	 */
	MiddlewareNetwork createMiddlewareNetwork();

	/**
	 * Returns a new object of class '<em>Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Port</em>'.
	 * @generated
	 */
	InputPort createInputPort();

	/**
	 * Returns a new object of class '<em>Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Port</em>'.
	 * @generated
	 */
	OutputPort createOutputPort();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Topic Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topic Message</em>'.
	 * @generated
	 */
	TopicMessage createTopicMessage();

	/**
	 * Returns a new object of class '<em>Topic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topic</em>'.
	 * @generated
	 */
	Topic createTopic();

	/**
	 * Returns a new object of class '<em>Continous State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continous State</em>'.
	 * @generated
	 */
	ContinousState createContinousState();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StatepubsubmodelPackage getStatepubsubmodelPackage();

} //StatepubsubmodelFactory
