/**
 */
package hu.sze.jkk.diffrobot.model.diffrobot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wheel Axis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis#getWheels <em>Wheels</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis#getAxis <em>Axis</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis#getLength <em>Length</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis#getWheelparameters <em>Wheelparameters</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis#getAxislocation <em>Axislocation</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getWheelAxis()
 * @model
 * @generated
 */
public interface WheelAxis extends EObject {
	/**
	 * Returns the value of the '<em><b>Wheels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wheels</em>' attribute.
	 * @see #setWheels(int)
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getWheelAxis_Wheels()
	 * @model
	 * @generated
	 */
	int getWheels();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis#getWheels <em>Wheels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wheels</em>' attribute.
	 * @see #getWheels()
	 * @generated
	 */
	void setWheels(int value);

	/**
	 * Returns the value of the '<em><b>Axis</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.sze.jkk.diffrobot.model.diffrobot.AxisOrientation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' attribute.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.AxisOrientation
	 * @see #setAxis(AxisOrientation)
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getWheelAxis_Axis()
	 * @model
	 * @generated
	 */
	AxisOrientation getAxis();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis#getAxis <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' attribute.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.AxisOrientation
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(AxisOrientation value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(double)
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getWheelAxis_Length()
	 * @model
	 * @generated
	 */
	double getLength();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(double value);

	/**
	 * Returns the value of the '<em><b>Wheelparameters</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wheelparameters</em>' reference.
	 * @see #setWheelparameters(WheelParameters)
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getWheelAxis_Wheelparameters()
	 * @model
	 * @generated
	 */
	WheelParameters getWheelparameters();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis#getWheelparameters <em>Wheelparameters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wheelparameters</em>' reference.
	 * @see #getWheelparameters()
	 * @generated
	 */
	void setWheelparameters(WheelParameters value);

	/**
	 * Returns the value of the '<em><b>Axislocation</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link hu.sze.jkk.diffrobot.model.diffrobot.AxisLocation#getWheelaxis <em>Wheelaxis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axislocation</em>' containment reference.
	 * @see #setAxislocation(AxisLocation)
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getWheelAxis_Axislocation()
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.AxisLocation#getWheelaxis
	 * @model opposite="wheelaxis" containment="true"
	 * @generated
	 */
	AxisLocation getAxislocation();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis#getAxislocation <em>Axislocation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axislocation</em>' containment reference.
	 * @see #getAxislocation()
	 * @generated
	 */
	void setAxislocation(AxisLocation value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getWheelAxis_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // WheelAxis
