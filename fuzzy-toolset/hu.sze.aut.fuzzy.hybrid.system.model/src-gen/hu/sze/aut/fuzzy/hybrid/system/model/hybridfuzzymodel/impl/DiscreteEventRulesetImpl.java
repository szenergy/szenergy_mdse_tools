/**
 */
package hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl;

import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.DiscreteEvent;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.DiscreteEventRuleset;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.HybridfuzzymodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Event Ruleset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.DiscreteEventRulesetImpl#getDiscreteevent <em>Discreteevent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscreteEventRulesetImpl extends RuleSetImpl implements DiscreteEventRuleset {
	/**
	 * The cached value of the '{@link #getDiscreteevent() <em>Discreteevent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscreteevent()
	 * @generated
	 * @ordered
	 */
	protected EList<DiscreteEvent> discreteevent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscreteEventRulesetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HybridfuzzymodelPackage.Literals.DISCRETE_EVENT_RULESET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiscreteEvent> getDiscreteevent() {
		if (discreteevent == null) {
			discreteevent = new EObjectContainmentEList<DiscreteEvent>(DiscreteEvent.class, this,
					HybridfuzzymodelPackage.DISCRETE_EVENT_RULESET__DISCRETEEVENT);
		}
		return discreteevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HybridfuzzymodelPackage.DISCRETE_EVENT_RULESET__DISCRETEEVENT:
			return ((InternalEList<?>) getDiscreteevent()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HybridfuzzymodelPackage.DISCRETE_EVENT_RULESET__DISCRETEEVENT:
			return getDiscreteevent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HybridfuzzymodelPackage.DISCRETE_EVENT_RULESET__DISCRETEEVENT:
			getDiscreteevent().clear();
			getDiscreteevent().addAll((Collection<? extends DiscreteEvent>) newValue);
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
		case HybridfuzzymodelPackage.DISCRETE_EVENT_RULESET__DISCRETEEVENT:
			getDiscreteevent().clear();
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
		case HybridfuzzymodelPackage.DISCRETE_EVENT_RULESET__DISCRETEEVENT:
			return discreteevent != null && !discreteevent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiscreteEventRulesetImpl
