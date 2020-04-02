/**
 */
package hu.sze.jkk.robot.launch.model.launchmodel.impl;

import hu.sze.jkk.robot.launch.model.launchmodel.*;

import org.eclipse.emf.ecore.EClass;
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
public class LaunchmodelFactoryImpl extends EFactoryImpl implements LaunchmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LaunchmodelFactory init() {
		try {
			LaunchmodelFactory theLaunchmodelFactory = (LaunchmodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(LaunchmodelPackage.eNS_URI);
			if (theLaunchmodelFactory != null) {
				return theLaunchmodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LaunchmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaunchmodelFactoryImpl() {
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
		case LaunchmodelPackage.LAUNCH:
			return createLaunch();
		case LaunchmodelPackage.NODE:
			return createNode();
		case LaunchmodelPackage.STATIC_TRANSFORM:
			return createStaticTransform();
		case LaunchmodelPackage.VEC3:
			return createVec3();
		case LaunchmodelPackage.PARAMETER:
			return createParameter();
		case LaunchmodelPackage.ARGUMENT:
			return createArgument();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Launch createLaunch() {
		LaunchImpl launch = new LaunchImpl();
		return launch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticTransform createStaticTransform() {
		StaticTransformImpl staticTransform = new StaticTransformImpl();
		return staticTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vec3 createVec3() {
		Vec3Impl vec3 = new Vec3Impl();
		return vec3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument createArgument() {
		ArgumentImpl argument = new ArgumentImpl();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaunchmodelPackage getLaunchmodelPackage() {
		return (LaunchmodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LaunchmodelPackage getPackage() {
		return LaunchmodelPackage.eINSTANCE;
	}

} //LaunchmodelFactoryImpl
