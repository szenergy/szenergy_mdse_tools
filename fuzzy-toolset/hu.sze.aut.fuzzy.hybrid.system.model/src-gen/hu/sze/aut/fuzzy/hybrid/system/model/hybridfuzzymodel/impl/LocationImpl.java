/**
 */
package hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl;

import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.ActionDefinition;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.ContinuousEventRuleset;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.HybridfuzzymodelPackage;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Location;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.LocationImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.LocationImpl#getContinuouseventruleset <em>Continuouseventruleset</em>}</li>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.LocationImpl#getCyclicaction <em>Cyclicaction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationImpl extends MinimalEObjectImpl.Container implements Location {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContinuouseventruleset() <em>Continuouseventruleset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuouseventruleset()
	 * @generated
	 * @ordered
	 */
	protected ContinuousEventRuleset continuouseventruleset;

	/**
	 * The cached value of the '{@link #getCyclicaction() <em>Cyclicaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCyclicaction()
	 * @generated
	 * @ordered
	 */
	protected ActionDefinition cyclicaction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HybridfuzzymodelPackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridfuzzymodelPackage.LOCATION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousEventRuleset getContinuouseventruleset() {
		if (continuouseventruleset != null && continuouseventruleset.eIsProxy()) {
			InternalEObject oldContinuouseventruleset = (InternalEObject) continuouseventruleset;
			continuouseventruleset = (ContinuousEventRuleset) eResolveProxy(oldContinuouseventruleset);
			if (continuouseventruleset != oldContinuouseventruleset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							HybridfuzzymodelPackage.LOCATION__CONTINUOUSEVENTRULESET, oldContinuouseventruleset,
							continuouseventruleset));
			}
		}
		return continuouseventruleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousEventRuleset basicGetContinuouseventruleset() {
		return continuouseventruleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContinuouseventruleset(ContinuousEventRuleset newContinuouseventruleset) {
		ContinuousEventRuleset oldContinuouseventruleset = continuouseventruleset;
		continuouseventruleset = newContinuouseventruleset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					HybridfuzzymodelPackage.LOCATION__CONTINUOUSEVENTRULESET, oldContinuouseventruleset,
					continuouseventruleset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionDefinition getCyclicaction() {
		if (cyclicaction != null && cyclicaction.eIsProxy()) {
			InternalEObject oldCyclicaction = (InternalEObject) cyclicaction;
			cyclicaction = (ActionDefinition) eResolveProxy(oldCyclicaction);
			if (cyclicaction != oldCyclicaction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							HybridfuzzymodelPackage.LOCATION__CYCLICACTION, oldCyclicaction, cyclicaction));
			}
		}
		return cyclicaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionDefinition basicGetCyclicaction() {
		return cyclicaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCyclicaction(ActionDefinition newCyclicaction) {
		ActionDefinition oldCyclicaction = cyclicaction;
		cyclicaction = newCyclicaction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridfuzzymodelPackage.LOCATION__CYCLICACTION,
					oldCyclicaction, cyclicaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HybridfuzzymodelPackage.LOCATION__NAME:
			return getName();
		case HybridfuzzymodelPackage.LOCATION__CONTINUOUSEVENTRULESET:
			if (resolve)
				return getContinuouseventruleset();
			return basicGetContinuouseventruleset();
		case HybridfuzzymodelPackage.LOCATION__CYCLICACTION:
			if (resolve)
				return getCyclicaction();
			return basicGetCyclicaction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HybridfuzzymodelPackage.LOCATION__NAME:
			setName((String) newValue);
			return;
		case HybridfuzzymodelPackage.LOCATION__CONTINUOUSEVENTRULESET:
			setContinuouseventruleset((ContinuousEventRuleset) newValue);
			return;
		case HybridfuzzymodelPackage.LOCATION__CYCLICACTION:
			setCyclicaction((ActionDefinition) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case HybridfuzzymodelPackage.LOCATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case HybridfuzzymodelPackage.LOCATION__CONTINUOUSEVENTRULESET:
			setContinuouseventruleset((ContinuousEventRuleset) null);
			return;
		case HybridfuzzymodelPackage.LOCATION__CYCLICACTION:
			setCyclicaction((ActionDefinition) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case HybridfuzzymodelPackage.LOCATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case HybridfuzzymodelPackage.LOCATION__CONTINUOUSEVENTRULESET:
			return continuouseventruleset != null;
		case HybridfuzzymodelPackage.LOCATION__CYCLICACTION:
			return cyclicaction != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LocationImpl
