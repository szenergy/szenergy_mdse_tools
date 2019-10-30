/**
 */
package hu.sze.jkk.diffrobot.model.diffrobot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.Robot#getWheelaxis <em>Wheelaxis</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.Robot#getKinematicparameters <em>Kinematicparameters</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.Robot#getWheelparemeters <em>Wheelparemeters</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.Robot#getName <em>Name</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.Robot#getHull <em>Hull</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.Robot#getDynamicparameters <em>Dynamicparameters</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.Robot#getRootaxis <em>Rootaxis</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.Robot#getSensor <em>Sensor</em>}</li>
 * </ul>
 *
 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getRobot()
 * @model
 * @generated
 */
public interface Robot extends EObject {
	/**
	 * Returns the value of the '<em><b>Wheelaxis</b></em>' containment reference list.
	 * The list contents are of type {@link hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wheelaxis</em>' containment reference list.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getRobot_Wheelaxis()
	 * @model containment="true"
	 * @generated
	 */
	EList<WheelAxis> getWheelaxis();

	/**
	 * Returns the value of the '<em><b>Kinematicparameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kinematicparameters</em>' containment reference.
	 * @see #setKinematicparameters(KinematicParameters)
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getRobot_Kinematicparameters()
	 * @model containment="true"
	 * @generated
	 */
	KinematicParameters getKinematicparameters();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.diffrobot.model.diffrobot.Robot#getKinematicparameters <em>Kinematicparameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kinematicparameters</em>' containment reference.
	 * @see #getKinematicparameters()
	 * @generated
	 */
	void setKinematicparameters(KinematicParameters value);

	/**
	 * Returns the value of the '<em><b>Wheelparemeters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wheelparemeters</em>' containment reference.
	 * @see #setWheelparemeters(WheelParemeters)
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getRobot_Wheelparemeters()
	 * @model containment="true"
	 * @generated
	 */
	WheelParemeters getWheelparemeters();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.diffrobot.model.diffrobot.Robot#getWheelparemeters <em>Wheelparemeters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wheelparemeters</em>' containment reference.
	 * @see #getWheelparemeters()
	 * @generated
	 */
	void setWheelparemeters(WheelParemeters value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getRobot_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.diffrobot.model.diffrobot.Robot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Hull</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hull</em>' containment reference.
	 * @see #setHull(HullComponent)
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getRobot_Hull()
	 * @model containment="true"
	 * @generated
	 */
	HullComponent getHull();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.diffrobot.model.diffrobot.Robot#getHull <em>Hull</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hull</em>' containment reference.
	 * @see #getHull()
	 * @generated
	 */
	void setHull(HullComponent value);

	/**
	 * Returns the value of the '<em><b>Dynamicparameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamicparameters</em>' containment reference.
	 * @see #setDynamicparameters(DynamicParameters)
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getRobot_Dynamicparameters()
	 * @model containment="true"
	 * @generated
	 */
	DynamicParameters getDynamicparameters();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.diffrobot.model.diffrobot.Robot#getDynamicparameters <em>Dynamicparameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamicparameters</em>' containment reference.
	 * @see #getDynamicparameters()
	 * @generated
	 */
	void setDynamicparameters(DynamicParameters value);

	/**
	 * Returns the value of the '<em><b>Rootaxis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rootaxis</em>' reference.
	 * @see #setRootaxis(WheelAxis)
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getRobot_Rootaxis()
	 * @model
	 * @generated
	 */
	WheelAxis getRootaxis();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.diffrobot.model.diffrobot.Robot#getRootaxis <em>Rootaxis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rootaxis</em>' reference.
	 * @see #getRootaxis()
	 * @generated
	 */
	void setRootaxis(WheelAxis value);

	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' containment reference list.
	 * The list contents are of type {@link hu.sze.jkk.diffrobot.model.diffrobot.Sensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' containment reference list.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getRobot_Sensor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sensor> getSensor();

} // Robot
