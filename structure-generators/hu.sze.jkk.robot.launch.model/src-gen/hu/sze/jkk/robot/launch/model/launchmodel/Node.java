/**
 */
package hu.sze.jkk.robot.launch.model.launchmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.robot.launch.model.launchmodel.Node#getName <em>Name</em>}</li>
 *   <li>{@link hu.sze.jkk.robot.launch.model.launchmodel.Node#getType <em>Type</em>}</li>
 *   <li>{@link hu.sze.jkk.robot.launch.model.launchmodel.Node#getParameter <em>Parameter</em>}</li>
 *   <li>{@link hu.sze.jkk.robot.launch.model.launchmodel.Node#getRospkg <em>Rospkg</em>}</li>
 * </ul>
 *
 * @see hu.sze.jkk.robot.launch.model.launchmodel.LaunchmodelPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.LaunchmodelPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.robot.launch.model.launchmodel.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.LaunchmodelPackage#getNode_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.robot.launch.model.launchmodel.Node#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link hu.sze.jkk.robot.launch.model.launchmodel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.LaunchmodelPackage#getNode_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Rospkg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rospkg</em>' attribute.
	 * @see #setRospkg(String)
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.LaunchmodelPackage#getNode_Rospkg()
	 * @model
	 * @generated
	 */
	String getRospkg();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.robot.launch.model.launchmodel.Node#getRospkg <em>Rospkg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rospkg</em>' attribute.
	 * @see #getRospkg()
	 * @generated
	 */
	void setRospkg(String value);

} // Node
