/**
 */
package hu.sze.jkk.diffrobot.model.diffrobot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotFactory
 * @model kind="package"
 * @generated
 */
public interface DiffrobotPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "diffrobot";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jkk.sze.hu/diffrobot";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "diffrobot";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiffrobotPackage eINSTANCE = hu.sze.jkk.diffrobot.model.diffrobot.impl.DiffrobotPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.RobotImpl <em>Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.RobotImpl
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DiffrobotPackageImpl#getRobot()
	 * @generated
	 */
	int ROBOT = 0;

	/**
	 * The feature id for the '<em><b>Wheelaxis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__WHEELAXIS = 0;

	/**
	 * The feature id for the '<em><b>Kinematicparameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__KINEMATICPARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Wheelparemeters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__WHEELPAREMETERS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__NAME = 3;

	/**
	 * The feature id for the '<em><b>Hull</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__HULL = 4;

	/**
	 * The feature id for the '<em><b>Dynamicparameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__DYNAMICPARAMETERS = 5;

	/**
	 * The feature id for the '<em><b>Rootaxis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__ROOTAXIS = 6;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__SENSOR = 7;

	/**
	 * The number of structural features of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.WheelAxisImpl <em>Wheel Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.WheelAxisImpl
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DiffrobotPackageImpl#getWheelAxis()
	 * @generated
	 */
	int WHEEL_AXIS = 1;

	/**
	 * The feature id for the '<em><b>Wheels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL_AXIS__WHEELS = 0;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL_AXIS__AXIS = 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL_AXIS__LENGTH = 2;

	/**
	 * The feature id for the '<em><b>Wheelparemeters</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL_AXIS__WHEELPAREMETERS = 3;

	/**
	 * The feature id for the '<em><b>Axislocation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL_AXIS__AXISLOCATION = 4;

	/**
	 * The number of structural features of the '<em>Wheel Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL_AXIS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Wheel Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL_AXIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.KinematicParametersImpl <em>Kinematic Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.KinematicParametersImpl
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DiffrobotPackageImpl#getKinematicParameters()
	 * @generated
	 */
	int KINEMATIC_PARAMETERS = 2;

	/**
	 * The number of structural features of the '<em>Kinematic Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINEMATIC_PARAMETERS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Kinematic Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINEMATIC_PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.WheelParemetersImpl <em>Wheel Paremeters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.WheelParemetersImpl
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DiffrobotPackageImpl#getWheelParemeters()
	 * @generated
	 */
	int WHEEL_PAREMETERS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL_PAREMETERS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL_PAREMETERS__RADIUS = 1;

	/**
	 * The feature id for the '<em><b>Mass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL_PAREMETERS__MASS = 2;

	/**
	 * The number of structural features of the '<em>Wheel Paremeters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL_PAREMETERS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Wheel Paremeters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEEL_PAREMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.HullComponentImpl <em>Hull Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.HullComponentImpl
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DiffrobotPackageImpl#getHullComponent()
	 * @generated
	 */
	int HULL_COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Mass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HULL_COMPONENT__MASS = 0;

	/**
	 * The feature id for the '<em><b>Mesh</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HULL_COMPONENT__MESH = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HULL_COMPONENT__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HULL_COMPONENT__DEPTH = 3;

	/**
	 * The number of structural features of the '<em>Hull Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HULL_COMPONENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Hull Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HULL_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.MeshImpl <em>Mesh</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.MeshImpl
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DiffrobotPackageImpl#getMesh()
	 * @generated
	 */
	int MESH = 5;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH__PATH = 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH__PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH__NAME = 2;

	/**
	 * The number of structural features of the '<em>Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.DynamicParametersImpl <em>Dynamic Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DynamicParametersImpl
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DiffrobotPackageImpl#getDynamicParameters()
	 * @generated
	 */
	int DYNAMIC_PARAMETERS = 6;

	/**
	 * The number of structural features of the '<em>Dynamic Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PARAMETERS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Dynamic Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.AxisLocationImpl <em>Axis Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.AxisLocationImpl
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DiffrobotPackageImpl#getAxisLocation()
	 * @generated
	 */
	int AXIS_LOCATION = 7;

	/**
	 * The feature id for the '<em><b>Wheelaxis</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_LOCATION__WHEELAXIS = 0;

	/**
	 * The feature id for the '<em><b>Displacement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_LOCATION__DISPLACEMENT = 1;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_LOCATION__ROTATION = 2;

	/**
	 * The number of structural features of the '<em>Axis Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_LOCATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Axis Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.DisplacementImpl <em>Displacement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DisplacementImpl
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DiffrobotPackageImpl#getDisplacement()
	 * @generated
	 */
	int DISPLACEMENT = 8;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLACEMENT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLACEMENT__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLACEMENT__Z = 2;

	/**
	 * The number of structural features of the '<em>Displacement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLACEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Displacement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLACEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.RotationImpl <em>Rotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.RotationImpl
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DiffrobotPackageImpl#getRotation()
	 * @generated
	 */
	int ROTATION = 9;

	/**
	 * The feature id for the '<em><b>Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__ROLL = 0;

	/**
	 * The feature id for the '<em><b>Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__PITCH = 1;

	/**
	 * The feature id for the '<em><b>Yaw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION__YAW = 2;

	/**
	 * The number of structural features of the '<em>Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.SensorImpl
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DiffrobotPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 10;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.CameraImpl <em>Camera</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.CameraImpl
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DiffrobotPackageImpl#getCamera()
	 * @generated
	 */
	int CAMERA = 11;

	/**
	 * The number of structural features of the '<em>Camera</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Camera</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.diffrobot.model.diffrobot.AxisOrientation <em>Axis Orientation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.AxisOrientation
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DiffrobotPackageImpl#getAxisOrientation()
	 * @generated
	 */
	int AXIS_ORIENTATION = 12;

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.diffrobot.model.diffrobot.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.Robot
	 * @generated
	 */
	EClass getRobot();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.diffrobot.model.diffrobot.Robot#getWheelaxis <em>Wheelaxis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wheelaxis</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.Robot#getWheelaxis()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Wheelaxis();

	/**
	 * Returns the meta object for the containment reference '{@link hu.sze.jkk.diffrobot.model.diffrobot.Robot#getKinematicparameters <em>Kinematicparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kinematicparameters</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.Robot#getKinematicparameters()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Kinematicparameters();

	/**
	 * Returns the meta object for the containment reference '{@link hu.sze.jkk.diffrobot.model.diffrobot.Robot#getWheelparemeters <em>Wheelparemeters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wheelparemeters</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.Robot#getWheelparemeters()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Wheelparemeters();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.diffrobot.model.diffrobot.Robot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.Robot#getName()
	 * @see #getRobot()
	 * @generated
	 */
	EAttribute getRobot_Name();

	/**
	 * Returns the meta object for the containment reference '{@link hu.sze.jkk.diffrobot.model.diffrobot.Robot#getHull <em>Hull</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hull</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.Robot#getHull()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Hull();

	/**
	 * Returns the meta object for the containment reference '{@link hu.sze.jkk.diffrobot.model.diffrobot.Robot#getDynamicparameters <em>Dynamicparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dynamicparameters</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.Robot#getDynamicparameters()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Dynamicparameters();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.jkk.diffrobot.model.diffrobot.Robot#getRootaxis <em>Rootaxis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rootaxis</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.Robot#getRootaxis()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Rootaxis();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.diffrobot.model.diffrobot.Robot#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensor</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.Robot#getSensor()
	 * @see #getRobot()
	 * @generated
	 */
	EReference getRobot_Sensor();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis <em>Wheel Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wheel Axis</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis
	 * @generated
	 */
	EClass getWheelAxis();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis#getWheels <em>Wheels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wheels</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis#getWheels()
	 * @see #getWheelAxis()
	 * @generated
	 */
	EAttribute getWheelAxis_Wheels();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis#getAxis()
	 * @see #getWheelAxis()
	 * @generated
	 */
	EAttribute getWheelAxis_Axis();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis#getLength()
	 * @see #getWheelAxis()
	 * @generated
	 */
	EAttribute getWheelAxis_Length();

	/**
	 * Returns the meta object for the reference '{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis#getWheelparemeters <em>Wheelparemeters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wheelparemeters</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis#getWheelparemeters()
	 * @see #getWheelAxis()
	 * @generated
	 */
	EReference getWheelAxis_Wheelparemeters();

	/**
	 * Returns the meta object for the containment reference '{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis#getAxislocation <em>Axislocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Axislocation</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis#getAxislocation()
	 * @see #getWheelAxis()
	 * @generated
	 */
	EReference getWheelAxis_Axislocation();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.diffrobot.model.diffrobot.KinematicParameters <em>Kinematic Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kinematic Parameters</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.KinematicParameters
	 * @generated
	 */
	EClass getKinematicParameters();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelParemeters <em>Wheel Paremeters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wheel Paremeters</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.WheelParemeters
	 * @generated
	 */
	EClass getWheelParemeters();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelParemeters#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.WheelParemeters#getName()
	 * @see #getWheelParemeters()
	 * @generated
	 */
	EAttribute getWheelParemeters_Name();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelParemeters#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.WheelParemeters#getRadius()
	 * @see #getWheelParemeters()
	 * @generated
	 */
	EAttribute getWheelParemeters_Radius();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelParemeters#getMass <em>Mass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mass</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.WheelParemeters#getMass()
	 * @see #getWheelParemeters()
	 * @generated
	 */
	EAttribute getWheelParemeters_Mass();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.diffrobot.model.diffrobot.HullComponent <em>Hull Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hull Component</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.HullComponent
	 * @generated
	 */
	EClass getHullComponent();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.diffrobot.model.diffrobot.HullComponent#getMass <em>Mass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mass</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.HullComponent#getMass()
	 * @see #getHullComponent()
	 * @generated
	 */
	EAttribute getHullComponent_Mass();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.diffrobot.model.diffrobot.HullComponent#getMesh <em>Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mesh</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.HullComponent#getMesh()
	 * @see #getHullComponent()
	 * @generated
	 */
	EReference getHullComponent_Mesh();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.diffrobot.model.diffrobot.HullComponent#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.HullComponent#getWidth()
	 * @see #getHullComponent()
	 * @generated
	 */
	EAttribute getHullComponent_Width();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.diffrobot.model.diffrobot.HullComponent#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.HullComponent#getDepth()
	 * @see #getHullComponent()
	 * @generated
	 */
	EAttribute getHullComponent_Depth();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.diffrobot.model.diffrobot.Mesh <em>Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mesh</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.Mesh
	 * @generated
	 */
	EClass getMesh();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.diffrobot.model.diffrobot.Mesh#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.Mesh#getPath()
	 * @see #getMesh()
	 * @generated
	 */
	EAttribute getMesh_Path();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.diffrobot.model.diffrobot.Mesh#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.Mesh#getPackage()
	 * @see #getMesh()
	 * @generated
	 */
	EAttribute getMesh_Package();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.diffrobot.model.diffrobot.Mesh#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.Mesh#getName()
	 * @see #getMesh()
	 * @generated
	 */
	EAttribute getMesh_Name();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.diffrobot.model.diffrobot.DynamicParameters <em>Dynamic Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Parameters</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DynamicParameters
	 * @generated
	 */
	EClass getDynamicParameters();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.diffrobot.model.diffrobot.AxisLocation <em>Axis Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axis Location</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.AxisLocation
	 * @generated
	 */
	EClass getAxisLocation();

	/**
	 * Returns the meta object for the container reference '{@link hu.sze.jkk.diffrobot.model.diffrobot.AxisLocation#getWheelaxis <em>Wheelaxis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Wheelaxis</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.AxisLocation#getWheelaxis()
	 * @see #getAxisLocation()
	 * @generated
	 */
	EReference getAxisLocation_Wheelaxis();

	/**
	 * Returns the meta object for the containment reference '{@link hu.sze.jkk.diffrobot.model.diffrobot.AxisLocation#getDisplacement <em>Displacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Displacement</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.AxisLocation#getDisplacement()
	 * @see #getAxisLocation()
	 * @generated
	 */
	EReference getAxisLocation_Displacement();

	/**
	 * Returns the meta object for the containment reference '{@link hu.sze.jkk.diffrobot.model.diffrobot.AxisLocation#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rotation</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.AxisLocation#getRotation()
	 * @see #getAxisLocation()
	 * @generated
	 */
	EReference getAxisLocation_Rotation();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.diffrobot.model.diffrobot.Displacement <em>Displacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Displacement</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.Displacement
	 * @generated
	 */
	EClass getDisplacement();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.diffrobot.model.diffrobot.Displacement#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.Displacement#getX()
	 * @see #getDisplacement()
	 * @generated
	 */
	EAttribute getDisplacement_X();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.diffrobot.model.diffrobot.Displacement#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.Displacement#getY()
	 * @see #getDisplacement()
	 * @generated
	 */
	EAttribute getDisplacement_Y();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.diffrobot.model.diffrobot.Displacement#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.Displacement#getZ()
	 * @see #getDisplacement()
	 * @generated
	 */
	EAttribute getDisplacement_Z();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.diffrobot.model.diffrobot.Rotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotation</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.Rotation
	 * @generated
	 */
	EClass getRotation();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.diffrobot.model.diffrobot.Rotation#getRoll <em>Roll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roll</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.Rotation#getRoll()
	 * @see #getRotation()
	 * @generated
	 */
	EAttribute getRotation_Roll();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.diffrobot.model.diffrobot.Rotation#getPitch <em>Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pitch</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.Rotation#getPitch()
	 * @see #getRotation()
	 * @generated
	 */
	EAttribute getRotation_Pitch();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.diffrobot.model.diffrobot.Rotation#getYaw <em>Yaw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yaw</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.Rotation#getYaw()
	 * @see #getRotation()
	 * @generated
	 */
	EAttribute getRotation_Yaw();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.diffrobot.model.diffrobot.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.diffrobot.model.diffrobot.Camera <em>Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.Camera
	 * @generated
	 */
	EClass getCamera();

	/**
	 * Returns the meta object for enum '{@link hu.sze.jkk.diffrobot.model.diffrobot.AxisOrientation <em>Axis Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Axis Orientation</em>'.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.AxisOrientation
	 * @generated
	 */
	EEnum getAxisOrientation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DiffrobotFactory getDiffrobotFactory();

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
		 * The meta object literal for the '{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.RobotImpl <em>Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.RobotImpl
		 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DiffrobotPackageImpl#getRobot()
		 * @generated
		 */
		EClass ROBOT = eINSTANCE.getRobot();

		/**
		 * The meta object literal for the '<em><b>Wheelaxis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__WHEELAXIS = eINSTANCE.getRobot_Wheelaxis();

		/**
		 * The meta object literal for the '<em><b>Kinematicparameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__KINEMATICPARAMETERS = eINSTANCE.getRobot_Kinematicparameters();

		/**
		 * The meta object literal for the '<em><b>Wheelparemeters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__WHEELPAREMETERS = eINSTANCE.getRobot_Wheelparemeters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT__NAME = eINSTANCE.getRobot_Name();

		/**
		 * The meta object literal for the '<em><b>Hull</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__HULL = eINSTANCE.getRobot_Hull();

		/**
		 * The meta object literal for the '<em><b>Dynamicparameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__DYNAMICPARAMETERS = eINSTANCE.getRobot_Dynamicparameters();

		/**
		 * The meta object literal for the '<em><b>Rootaxis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__ROOTAXIS = eINSTANCE.getRobot_Rootaxis();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__SENSOR = eINSTANCE.getRobot_Sensor();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.WheelAxisImpl <em>Wheel Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.WheelAxisImpl
		 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DiffrobotPackageImpl#getWheelAxis()
		 * @generated
		 */
		EClass WHEEL_AXIS = eINSTANCE.getWheelAxis();

		/**
		 * The meta object literal for the '<em><b>Wheels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEEL_AXIS__WHEELS = eINSTANCE.getWheelAxis_Wheels();

		/**
		 * The meta object literal for the '<em><b>Axis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEEL_AXIS__AXIS = eINSTANCE.getWheelAxis_Axis();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEEL_AXIS__LENGTH = eINSTANCE.getWheelAxis_Length();

		/**
		 * The meta object literal for the '<em><b>Wheelparemeters</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHEEL_AXIS__WHEELPAREMETERS = eINSTANCE.getWheelAxis_Wheelparemeters();

		/**
		 * The meta object literal for the '<em><b>Axislocation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHEEL_AXIS__AXISLOCATION = eINSTANCE.getWheelAxis_Axislocation();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.KinematicParametersImpl <em>Kinematic Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.KinematicParametersImpl
		 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DiffrobotPackageImpl#getKinematicParameters()
		 * @generated
		 */
		EClass KINEMATIC_PARAMETERS = eINSTANCE.getKinematicParameters();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.WheelParemetersImpl <em>Wheel Paremeters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.WheelParemetersImpl
		 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DiffrobotPackageImpl#getWheelParemeters()
		 * @generated
		 */
		EClass WHEEL_PAREMETERS = eINSTANCE.getWheelParemeters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEEL_PAREMETERS__NAME = eINSTANCE.getWheelParemeters_Name();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEEL_PAREMETERS__RADIUS = eINSTANCE.getWheelParemeters_Radius();

		/**
		 * The meta object literal for the '<em><b>Mass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEEL_PAREMETERS__MASS = eINSTANCE.getWheelParemeters_Mass();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.HullComponentImpl <em>Hull Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.HullComponentImpl
		 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DiffrobotPackageImpl#getHullComponent()
		 * @generated
		 */
		EClass HULL_COMPONENT = eINSTANCE.getHullComponent();

		/**
		 * The meta object literal for the '<em><b>Mass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HULL_COMPONENT__MASS = eINSTANCE.getHullComponent_Mass();

		/**
		 * The meta object literal for the '<em><b>Mesh</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HULL_COMPONENT__MESH = eINSTANCE.getHullComponent_Mesh();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HULL_COMPONENT__WIDTH = eINSTANCE.getHullComponent_Width();

		/**
		 * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HULL_COMPONENT__DEPTH = eINSTANCE.getHullComponent_Depth();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.MeshImpl <em>Mesh</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.MeshImpl
		 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DiffrobotPackageImpl#getMesh()
		 * @generated
		 */
		EClass MESH = eINSTANCE.getMesh();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH__PATH = eINSTANCE.getMesh_Path();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH__PACKAGE = eINSTANCE.getMesh_Package();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH__NAME = eINSTANCE.getMesh_Name();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.DynamicParametersImpl <em>Dynamic Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DynamicParametersImpl
		 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DiffrobotPackageImpl#getDynamicParameters()
		 * @generated
		 */
		EClass DYNAMIC_PARAMETERS = eINSTANCE.getDynamicParameters();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.AxisLocationImpl <em>Axis Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.AxisLocationImpl
		 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DiffrobotPackageImpl#getAxisLocation()
		 * @generated
		 */
		EClass AXIS_LOCATION = eINSTANCE.getAxisLocation();

		/**
		 * The meta object literal for the '<em><b>Wheelaxis</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS_LOCATION__WHEELAXIS = eINSTANCE.getAxisLocation_Wheelaxis();

		/**
		 * The meta object literal for the '<em><b>Displacement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS_LOCATION__DISPLACEMENT = eINSTANCE.getAxisLocation_Displacement();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS_LOCATION__ROTATION = eINSTANCE.getAxisLocation_Rotation();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.DisplacementImpl <em>Displacement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DisplacementImpl
		 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DiffrobotPackageImpl#getDisplacement()
		 * @generated
		 */
		EClass DISPLACEMENT = eINSTANCE.getDisplacement();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLACEMENT__X = eINSTANCE.getDisplacement_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLACEMENT__Y = eINSTANCE.getDisplacement_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLACEMENT__Z = eINSTANCE.getDisplacement_Z();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.RotationImpl <em>Rotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.RotationImpl
		 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DiffrobotPackageImpl#getRotation()
		 * @generated
		 */
		EClass ROTATION = eINSTANCE.getRotation();

		/**
		 * The meta object literal for the '<em><b>Roll</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATION__ROLL = eINSTANCE.getRotation_Roll();

		/**
		 * The meta object literal for the '<em><b>Pitch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATION__PITCH = eINSTANCE.getRotation_Pitch();

		/**
		 * The meta object literal for the '<em><b>Yaw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATION__YAW = eINSTANCE.getRotation_Yaw();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.SensorImpl
		 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DiffrobotPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.diffrobot.model.diffrobot.impl.CameraImpl <em>Camera</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.CameraImpl
		 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DiffrobotPackageImpl#getCamera()
		 * @generated
		 */
		EClass CAMERA = eINSTANCE.getCamera();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.diffrobot.model.diffrobot.AxisOrientation <em>Axis Orientation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.diffrobot.model.diffrobot.AxisOrientation
		 * @see hu.sze.jkk.diffrobot.model.diffrobot.impl.DiffrobotPackageImpl#getAxisOrientation()
		 * @generated
		 */
		EEnum AXIS_ORIENTATION = eINSTANCE.getAxisOrientation();

	}

} //DiffrobotPackage
