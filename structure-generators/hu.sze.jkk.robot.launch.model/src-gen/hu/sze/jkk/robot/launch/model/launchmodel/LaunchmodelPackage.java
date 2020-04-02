/**
 */
package hu.sze.jkk.robot.launch.model.launchmodel;

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
 * @see hu.sze.jkk.robot.launch.model.launchmodel.LaunchmodelFactory
 * @model kind="package"
 * @generated
 */
public interface LaunchmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "launchmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jkk.sze.hu/launchmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "launchmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LaunchmodelPackage eINSTANCE = hu.sze.jkk.robot.launch.model.launchmodel.impl.LaunchmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.sze.jkk.robot.launch.model.launchmodel.impl.LaunchImpl <em>Launch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.impl.LaunchImpl
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.impl.LaunchmodelPackageImpl#getLaunch()
	 * @generated
	 */
	int LAUNCH = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH__NODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH__NAME = 1;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH__ARGUMENT = 2;

	/**
	 * The feature id for the '<em><b>Launchparameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH__LAUNCHPARAMETERS = 3;

	/**
	 * The number of structural features of the '<em>Launch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Launch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.robot.launch.model.launchmodel.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.impl.NodeImpl
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.impl.LaunchmodelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Rospkg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ROSPKG = 3;

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
	 * The meta object id for the '{@link hu.sze.jkk.robot.launch.model.launchmodel.impl.StaticTransformImpl <em>Static Transform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.impl.StaticTransformImpl
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.impl.LaunchmodelPackageImpl#getStaticTransform()
	 * @generated
	 */
	int STATIC_TRANSFORM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TRANSFORM__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TRANSFORM__TYPE = NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TRANSFORM__PARAMETER = NODE__PARAMETER;

	/**
	 * The feature id for the '<em><b>Rospkg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TRANSFORM__ROSPKG = NODE__ROSPKG;

	/**
	 * The feature id for the '<em><b>Vec3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TRANSFORM__VEC3 = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rpy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TRANSFORM__RPY = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Link from</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TRANSFORM__LINK_FROM = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Link to</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TRANSFORM__LINK_TO = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Static Transform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TRANSFORM_FEATURE_COUNT = NODE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Static Transform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_TRANSFORM_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.robot.launch.model.launchmodel.impl.Vec3Impl <em>Vec3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.impl.Vec3Impl
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.impl.LaunchmodelPackageImpl#getVec3()
	 * @generated
	 */
	int VEC3 = 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEC3__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEC3__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEC3__Z = 2;

	/**
	 * The number of structural features of the '<em>Vec3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEC3_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Vec3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEC3_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.robot.launch.model.launchmodel.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.impl.ParameterImpl
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.impl.LaunchmodelPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.sze.jkk.robot.launch.model.launchmodel.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.impl.ArgumentImpl
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.impl.LaunchmodelPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.robot.launch.model.launchmodel.Launch <em>Launch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Launch</em>'.
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.Launch
	 * @generated
	 */
	EClass getLaunch();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.robot.launch.model.launchmodel.Launch#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.Launch#getNode()
	 * @see #getLaunch()
	 * @generated
	 */
	EReference getLaunch_Node();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.robot.launch.model.launchmodel.Launch#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.Launch#getName()
	 * @see #getLaunch()
	 * @generated
	 */
	EAttribute getLaunch_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.robot.launch.model.launchmodel.Launch#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument</em>'.
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.Launch#getArgument()
	 * @see #getLaunch()
	 * @generated
	 */
	EReference getLaunch_Argument();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.robot.launch.model.launchmodel.Launch#getLaunchparameters <em>Launchparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Launchparameters</em>'.
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.Launch#getLaunchparameters()
	 * @see #getLaunch()
	 * @generated
	 */
	EReference getLaunch_Launchparameters();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.robot.launch.model.launchmodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.robot.launch.model.launchmodel.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.robot.launch.model.launchmodel.Node#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.Node#getType()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.sze.jkk.robot.launch.model.launchmodel.Node#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.Node#getParameter()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.robot.launch.model.launchmodel.Node#getRospkg <em>Rospkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rospkg</em>'.
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.Node#getRospkg()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Rospkg();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.robot.launch.model.launchmodel.StaticTransform <em>Static Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Transform</em>'.
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.StaticTransform
	 * @generated
	 */
	EClass getStaticTransform();

	/**
	 * Returns the meta object for the containment reference '{@link hu.sze.jkk.robot.launch.model.launchmodel.StaticTransform#getVec3 <em>Vec3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vec3</em>'.
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.StaticTransform#getVec3()
	 * @see #getStaticTransform()
	 * @generated
	 */
	EReference getStaticTransform_Vec3();

	/**
	 * Returns the meta object for the containment reference '{@link hu.sze.jkk.robot.launch.model.launchmodel.StaticTransform#getRpy <em>Rpy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rpy</em>'.
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.StaticTransform#getRpy()
	 * @see #getStaticTransform()
	 * @generated
	 */
	EReference getStaticTransform_Rpy();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.robot.launch.model.launchmodel.StaticTransform#getLink_from <em>Link from</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link from</em>'.
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.StaticTransform#getLink_from()
	 * @see #getStaticTransform()
	 * @generated
	 */
	EAttribute getStaticTransform_Link_from();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.robot.launch.model.launchmodel.StaticTransform#getLink_to <em>Link to</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link to</em>'.
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.StaticTransform#getLink_to()
	 * @see #getStaticTransform()
	 * @generated
	 */
	EAttribute getStaticTransform_Link_to();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.robot.launch.model.launchmodel.Vec3 <em>Vec3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vec3</em>'.
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.Vec3
	 * @generated
	 */
	EClass getVec3();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.robot.launch.model.launchmodel.Vec3#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.Vec3#getX()
	 * @see #getVec3()
	 * @generated
	 */
	EAttribute getVec3_X();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.robot.launch.model.launchmodel.Vec3#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.Vec3#getY()
	 * @see #getVec3()
	 * @generated
	 */
	EAttribute getVec3_Y();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.robot.launch.model.launchmodel.Vec3#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.Vec3#getZ()
	 * @see #getVec3()
	 * @generated
	 */
	EAttribute getVec3_Z();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.robot.launch.model.launchmodel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.robot.launch.model.launchmodel.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.robot.launch.model.launchmodel.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for class '{@link hu.sze.jkk.robot.launch.model.launchmodel.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.robot.launch.model.launchmodel.Argument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.Argument#getName()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Name();

	/**
	 * Returns the meta object for the attribute '{@link hu.sze.jkk.robot.launch.model.launchmodel.Argument#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.Argument#getValue()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LaunchmodelFactory getLaunchmodelFactory();

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
		 * The meta object literal for the '{@link hu.sze.jkk.robot.launch.model.launchmodel.impl.LaunchImpl <em>Launch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.robot.launch.model.launchmodel.impl.LaunchImpl
		 * @see hu.sze.jkk.robot.launch.model.launchmodel.impl.LaunchmodelPackageImpl#getLaunch()
		 * @generated
		 */
		EClass LAUNCH = eINSTANCE.getLaunch();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAUNCH__NODE = eINSTANCE.getLaunch_Node();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAUNCH__NAME = eINSTANCE.getLaunch_Name();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAUNCH__ARGUMENT = eINSTANCE.getLaunch_Argument();

		/**
		 * The meta object literal for the '<em><b>Launchparameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAUNCH__LAUNCHPARAMETERS = eINSTANCE.getLaunch_Launchparameters();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.robot.launch.model.launchmodel.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.robot.launch.model.launchmodel.impl.NodeImpl
		 * @see hu.sze.jkk.robot.launch.model.launchmodel.impl.LaunchmodelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__TYPE = eINSTANCE.getNode_Type();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PARAMETER = eINSTANCE.getNode_Parameter();

		/**
		 * The meta object literal for the '<em><b>Rospkg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__ROSPKG = eINSTANCE.getNode_Rospkg();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.robot.launch.model.launchmodel.impl.StaticTransformImpl <em>Static Transform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.robot.launch.model.launchmodel.impl.StaticTransformImpl
		 * @see hu.sze.jkk.robot.launch.model.launchmodel.impl.LaunchmodelPackageImpl#getStaticTransform()
		 * @generated
		 */
		EClass STATIC_TRANSFORM = eINSTANCE.getStaticTransform();

		/**
		 * The meta object literal for the '<em><b>Vec3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_TRANSFORM__VEC3 = eINSTANCE.getStaticTransform_Vec3();

		/**
		 * The meta object literal for the '<em><b>Rpy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_TRANSFORM__RPY = eINSTANCE.getStaticTransform_Rpy();

		/**
		 * The meta object literal for the '<em><b>Link from</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_TRANSFORM__LINK_FROM = eINSTANCE.getStaticTransform_Link_from();

		/**
		 * The meta object literal for the '<em><b>Link to</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_TRANSFORM__LINK_TO = eINSTANCE.getStaticTransform_Link_to();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.robot.launch.model.launchmodel.impl.Vec3Impl <em>Vec3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.robot.launch.model.launchmodel.impl.Vec3Impl
		 * @see hu.sze.jkk.robot.launch.model.launchmodel.impl.LaunchmodelPackageImpl#getVec3()
		 * @generated
		 */
		EClass VEC3 = eINSTANCE.getVec3();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEC3__X = eINSTANCE.getVec3_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEC3__Y = eINSTANCE.getVec3_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEC3__Z = eINSTANCE.getVec3_Z();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.robot.launch.model.launchmodel.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.robot.launch.model.launchmodel.impl.ParameterImpl
		 * @see hu.sze.jkk.robot.launch.model.launchmodel.impl.LaunchmodelPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '{@link hu.sze.jkk.robot.launch.model.launchmodel.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.sze.jkk.robot.launch.model.launchmodel.impl.ArgumentImpl
		 * @see hu.sze.jkk.robot.launch.model.launchmodel.impl.LaunchmodelPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__NAME = eINSTANCE.getArgument_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__VALUE = eINSTANCE.getArgument_Value();

	}

} //LaunchmodelPackage
