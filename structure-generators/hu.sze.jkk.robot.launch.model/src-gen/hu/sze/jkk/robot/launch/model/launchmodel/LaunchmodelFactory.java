/**
 */
package hu.sze.jkk.robot.launch.model.launchmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.sze.jkk.robot.launch.model.launchmodel.LaunchmodelPackage
 * @generated
 */
public interface LaunchmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LaunchmodelFactory eINSTANCE = hu.sze.jkk.robot.launch.model.launchmodel.impl.LaunchmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Launch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Launch</em>'.
	 * @generated
	 */
	Launch createLaunch();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Static Transform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Transform</em>'.
	 * @generated
	 */
	StaticTransform createStaticTransform();

	/**
	 * Returns a new object of class '<em>Vec3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vec3</em>'.
	 * @generated
	 */
	Vec3 createVec3();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LaunchmodelPackage getLaunchmodelPackage();

} //LaunchmodelFactory
