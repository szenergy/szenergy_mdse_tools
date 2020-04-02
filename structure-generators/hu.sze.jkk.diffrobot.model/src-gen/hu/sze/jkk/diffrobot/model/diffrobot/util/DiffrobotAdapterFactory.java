/**
 */
package hu.sze.jkk.diffrobot.model.diffrobot.util;

import hu.sze.jkk.diffrobot.model.diffrobot.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage
 * @generated
 */
public class DiffrobotAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DiffrobotPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffrobotAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DiffrobotPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffrobotSwitch<Adapter> modelSwitch = new DiffrobotSwitch<Adapter>() {
		@Override
		public Adapter caseRobot(Robot object) {
			return createRobotAdapter();
		}

		@Override
		public Adapter caseWheelAxis(WheelAxis object) {
			return createWheelAxisAdapter();
		}

		@Override
		public Adapter caseKinematicParameters(KinematicParameters object) {
			return createKinematicParametersAdapter();
		}

		@Override
		public Adapter caseWheelParameters(WheelParameters object) {
			return createWheelParametersAdapter();
		}

		@Override
		public Adapter caseHullComponent(HullComponent object) {
			return createHullComponentAdapter();
		}

		@Override
		public Adapter caseMesh(Mesh object) {
			return createMeshAdapter();
		}

		@Override
		public Adapter caseDynamicParameters(DynamicParameters object) {
			return createDynamicParametersAdapter();
		}

		@Override
		public Adapter caseAxisLocation(AxisLocation object) {
			return createAxisLocationAdapter();
		}

		@Override
		public Adapter caseDisplacement(Displacement object) {
			return createDisplacementAdapter();
		}

		@Override
		public Adapter caseRotation(Rotation object) {
			return createRotationAdapter();
		}

		@Override
		public Adapter caseSensor(Sensor object) {
			return createSensorAdapter();
		}

		@Override
		public Adapter caseCamera(Camera object) {
			return createCameraAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.diffrobot.model.diffrobot.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.Robot
	 * @generated
	 */
	public Adapter createRobotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis <em>Wheel Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis
	 * @generated
	 */
	public Adapter createWheelAxisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.diffrobot.model.diffrobot.KinematicParameters <em>Kinematic Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.KinematicParameters
	 * @generated
	 */
	public Adapter createKinematicParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelParameters <em>Wheel Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.WheelParameters
	 * @generated
	 */
	public Adapter createWheelParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.diffrobot.model.diffrobot.HullComponent <em>Hull Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.HullComponent
	 * @generated
	 */
	public Adapter createHullComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.diffrobot.model.diffrobot.Mesh <em>Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.Mesh
	 * @generated
	 */
	public Adapter createMeshAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.diffrobot.model.diffrobot.DynamicParameters <em>Dynamic Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DynamicParameters
	 * @generated
	 */
	public Adapter createDynamicParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.diffrobot.model.diffrobot.AxisLocation <em>Axis Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.AxisLocation
	 * @generated
	 */
	public Adapter createAxisLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.diffrobot.model.diffrobot.Displacement <em>Displacement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.Displacement
	 * @generated
	 */
	public Adapter createDisplacementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.diffrobot.model.diffrobot.Rotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.Rotation
	 * @generated
	 */
	public Adapter createRotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.diffrobot.model.diffrobot.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.sze.jkk.diffrobot.model.diffrobot.Camera <em>Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.Camera
	 * @generated
	 */
	public Adapter createCameraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DiffrobotAdapterFactory
