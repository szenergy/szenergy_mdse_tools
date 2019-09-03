/**
 */
package hu.sze.jkk.diffrobot.model.diffrobot;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage
 * @generated
 */
public interface DiffrobotFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiffrobotFactory eINSTANCE = hu.sze.jkk.diffrobot.model.diffrobot.impl.DiffrobotFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robot</em>'.
	 * @generated
	 */
	Robot createRobot();

	/**
	 * Returns a new object of class '<em>Wheel Axis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wheel Axis</em>'.
	 * @generated
	 */
	WheelAxis createWheelAxis();

	/**
	 * Returns a new object of class '<em>Kinematic Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kinematic Parameters</em>'.
	 * @generated
	 */
	KinematicParameters createKinematicParameters();

	/**
	 * Returns a new object of class '<em>Wheel Paremeters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wheel Paremeters</em>'.
	 * @generated
	 */
	WheelParemeters createWheelParemeters();

	/**
	 * Returns a new object of class '<em>Hull Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hull Component</em>'.
	 * @generated
	 */
	HullComponent createHullComponent();

	/**
	 * Returns a new object of class '<em>Mesh</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mesh</em>'.
	 * @generated
	 */
	Mesh createMesh();

	/**
	 * Returns a new object of class '<em>Dynamic Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic Parameters</em>'.
	 * @generated
	 */
	DynamicParameters createDynamicParameters();

	/**
	 * Returns a new object of class '<em>Axis Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Axis Location</em>'.
	 * @generated
	 */
	AxisLocation createAxisLocation();

	/**
	 * Returns a new object of class '<em>Displacement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Displacement</em>'.
	 * @generated
	 */
	Displacement createDisplacement();

	/**
	 * Returns a new object of class '<em>Rotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rotation</em>'.
	 * @generated
	 */
	Rotation createRotation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DiffrobotPackage getDiffrobotPackage();

} //DiffrobotFactory
