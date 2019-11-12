/**
 */
package hu.sze.jkk.diffrobot.model.diffrobot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wheel Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelParameters#getName <em>Name</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelParameters#getRadius <em>Radius</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelParameters#getMass <em>Mass</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelParameters#getMesh <em>Mesh</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelParameters#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getWheelParameters()
 * @model
 * @generated
 */
public interface WheelParameters extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getWheelParameters_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelParameters#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getWheelParameters_Radius()
	 * @model
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelParameters#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

	/**
	 * Returns the value of the '<em><b>Mass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass</em>' attribute.
	 * @see #setMass(double)
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getWheelParameters_Mass()
	 * @model
	 * @generated
	 */
	double getMass();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelParameters#getMass <em>Mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass</em>' attribute.
	 * @see #getMass()
	 * @generated
	 */
	void setMass(double value);

	/**
	 * Returns the value of the '<em><b>Mesh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesh</em>' containment reference.
	 * @see #setMesh(Mesh)
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getWheelParameters_Mesh()
	 * @model containment="true"
	 * @generated
	 */
	Mesh getMesh();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelParameters#getMesh <em>Mesh</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesh</em>' containment reference.
	 * @see #getMesh()
	 * @generated
	 */
	void setMesh(Mesh value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getWheelParameters_Width()
	 * @model
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.diffrobot.model.diffrobot.WheelParameters#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

} // WheelParameters
