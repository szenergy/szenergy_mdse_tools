/**
 */
package hu.sze.jkk.diffrobot.model.diffrobot.impl;

import hu.sze.jkk.diffrobot.model.diffrobot.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiffrobotFactoryImpl extends EFactoryImpl implements DiffrobotFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DiffrobotFactory init() {
		try {
			DiffrobotFactory theDiffrobotFactory = (DiffrobotFactory) EPackage.Registry.INSTANCE
					.getEFactory(DiffrobotPackage.eNS_URI);
			if (theDiffrobotFactory != null) {
				return theDiffrobotFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DiffrobotFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffrobotFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case DiffrobotPackage.ROBOT:
			return createRobot();
		case DiffrobotPackage.WHEEL_AXIS:
			return createWheelAxis();
		case DiffrobotPackage.KINEMATIC_PARAMETERS:
			return createKinematicParameters();
		case DiffrobotPackage.WHEEL_PARAMETERS:
			return createWheelParameters();
		case DiffrobotPackage.HULL_COMPONENT:
			return createHullComponent();
		case DiffrobotPackage.MESH:
			return createMesh();
		case DiffrobotPackage.DYNAMIC_PARAMETERS:
			return createDynamicParameters();
		case DiffrobotPackage.AXIS_LOCATION:
			return createAxisLocation();
		case DiffrobotPackage.DISPLACEMENT:
			return createDisplacement();
		case DiffrobotPackage.ROTATION:
			return createRotation();
		case DiffrobotPackage.CAMERA:
			return createCamera();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case DiffrobotPackage.AXIS_ORIENTATION:
			return createAxisOrientationFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case DiffrobotPackage.AXIS_ORIENTATION:
			return convertAxisOrientationToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robot createRobot() {
		RobotImpl robot = new RobotImpl();
		return robot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WheelAxis createWheelAxis() {
		WheelAxisImpl wheelAxis = new WheelAxisImpl();
		return wheelAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KinematicParameters createKinematicParameters() {
		KinematicParametersImpl kinematicParameters = new KinematicParametersImpl();
		return kinematicParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WheelParameters createWheelParameters() {
		WheelParametersImpl wheelParameters = new WheelParametersImpl();
		return wheelParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HullComponent createHullComponent() {
		HullComponentImpl hullComponent = new HullComponentImpl();
		return hullComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mesh createMesh() {
		MeshImpl mesh = new MeshImpl();
		return mesh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicParameters createDynamicParameters() {
		DynamicParametersImpl dynamicParameters = new DynamicParametersImpl();
		return dynamicParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisLocation createAxisLocation() {
		AxisLocationImpl axisLocation = new AxisLocationImpl();
		return axisLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Displacement createDisplacement() {
		DisplacementImpl displacement = new DisplacementImpl();
		return displacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rotation createRotation() {
		RotationImpl rotation = new RotationImpl();
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Camera createCamera() {
		CameraImpl camera = new CameraImpl();
		return camera;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisOrientation createAxisOrientationFromString(EDataType eDataType, String initialValue) {
		AxisOrientation result = AxisOrientation.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAxisOrientationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffrobotPackage getDiffrobotPackage() {
		return (DiffrobotPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DiffrobotPackage getPackage() {
		return DiffrobotPackage.eINSTANCE;
	}

} //DiffrobotFactoryImpl
