/**
 */
package hu.sze.jkk.robot.launch.model.launchmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Launch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.jkk.robot.launch.model.launchmodel.Launch#getNode <em>Node</em>}</li>
 *   <li>{@link hu.sze.jkk.robot.launch.model.launchmodel.Launch#getName <em>Name</em>}</li>
 *   <li>{@link hu.sze.jkk.robot.launch.model.launchmodel.Launch#getArgument <em>Argument</em>}</li>
 *   <li>{@link hu.sze.jkk.robot.launch.model.launchmodel.Launch#getLaunchparameters <em>Launchparameters</em>}</li>
 * </ul>
 *
 * @see hu.sze.jkk.robot.launch.model.launchmodel.LaunchmodelPackage#getLaunch()
 * @model
 * @generated
 */
public interface Launch extends EObject {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link hu.sze.jkk.robot.launch.model.launchmodel.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.LaunchmodelPackage#getLaunch_Node()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNode();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.LaunchmodelPackage#getLaunch_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.sze.jkk.robot.launch.model.launchmodel.Launch#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link hu.sze.jkk.robot.launch.model.launchmodel.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.LaunchmodelPackage#getLaunch_Argument()
	 * @model containment="true"
	 * @generated
	 */
	EList<Argument> getArgument();

	/**
	 * Returns the value of the '<em><b>Launchparameters</b></em>' containment reference list.
	 * The list contents are of type {@link hu.sze.jkk.robot.launch.model.launchmodel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Launchparameters</em>' containment reference list.
	 * @see hu.sze.jkk.robot.launch.model.launchmodel.LaunchmodelPackage#getLaunch_Launchparameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getLaunchparameters();

} // Launch
