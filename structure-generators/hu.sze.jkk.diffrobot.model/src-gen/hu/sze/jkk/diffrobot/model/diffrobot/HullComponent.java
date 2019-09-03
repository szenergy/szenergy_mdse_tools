/**
 */
package hu.sze.jkk.diffrobot.model.diffrobot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hull Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.HullComponent#getMass <em>Mass</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.HullComponent#getMesh <em>Mesh</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.HullComponent#getWidth <em>Width</em>}</li>
 *   <li>{@link hu.sze.jkk.diffrobot.model.diffrobot.HullComponent#getDepth <em>Depth</em>}</li>
 * </ul>
 *
 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getHullComponent()
 * @model
 * @generated
 */
public interface HullComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Mass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass</em>' attribute.
	 * @see #setMass(double)
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getHullComponent_Mass()
	 * @model
	 * @generated
	 */
	double getMass();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.diffrobot.model.diffrobot.HullComponent#getMass <em>Mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass</em>' attribute.
	 * @see #getMass()
	 * @generated
	 */
	void setMass(double value);

	/**
	 * Returns the value of the '<em><b>Mesh</b></em>' containment reference list.
	 * The list contents are of type {@link hu.sze.jkk.diffrobot.model.diffrobot.Mesh}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesh</em>' containment reference list.
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getHullComponent_Mesh()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mesh> getMesh();

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getHullComponent_Width()
	 * @model
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.diffrobot.model.diffrobot.HullComponent#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #setDepth(double)
	 * @see hu.sze.jkk.diffrobot.model.diffrobot.DiffrobotPackage#getHullComponent_Depth()
	 * @model
	 * @generated
	 */
	double getDepth();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.diffrobot.model.diffrobot.HullComponent#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' attribute.
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(double value);

} // HullComponent
