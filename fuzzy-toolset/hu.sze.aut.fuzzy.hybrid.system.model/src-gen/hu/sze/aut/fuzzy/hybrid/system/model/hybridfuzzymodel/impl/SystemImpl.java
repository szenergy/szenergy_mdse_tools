/**
 */
package hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl;

import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.ActionDefinition;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.FuzzySet;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.HybridfuzzymodelPackage;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Location;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.RuleSet;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Transition;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.SystemImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.SystemImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.SystemImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.SystemImpl#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.SystemImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.SystemImpl#getActiondefinition <em>Actiondefinition</em>}</li>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.SystemImpl#getErrorlocation <em>Errorlocation</em>}</li>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.SystemImpl#getStartlocation <em>Startlocation</em>}</li>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.SystemImpl#getFuzzyset <em>Fuzzyset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container
		implements hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.System {
	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transition;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> location;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variable;

	/**
	 * The cached value of the '{@link #getRuleset() <em>Ruleset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleset()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleSet> ruleset;

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
	 * The default value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected static final double RATE_EDEFAULT = 10.0;

	/**
	 * The cached value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected double rate = RATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActiondefinition() <em>Actiondefinition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiondefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionDefinition> actiondefinition;

	/**
	 * The cached value of the '{@link #getErrorlocation() <em>Errorlocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorlocation()
	 * @generated
	 * @ordered
	 */
	protected Location errorlocation;

	/**
	 * The cached value of the '{@link #getStartlocation() <em>Startlocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartlocation()
	 * @generated
	 * @ordered
	 */
	protected Location startlocation;

	/**
	 * The cached value of the '{@link #getFuzzyset() <em>Fuzzyset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuzzyset()
	 * @generated
	 * @ordered
	 */
	protected EList<FuzzySet> fuzzyset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HybridfuzzymodelPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentEList<Transition>(Transition.class, this,
					HybridfuzzymodelPackage.SYSTEM__TRANSITION);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocation() {
		if (location == null) {
			location = new EObjectContainmentEList<Location>(Location.class, this,
					HybridfuzzymodelPackage.SYSTEM__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentEList<Variable>(Variable.class, this,
					HybridfuzzymodelPackage.SYSTEM__VARIABLE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuleSet> getRuleset() {
		if (ruleset == null) {
			ruleset = new EObjectContainmentEList<RuleSet>(RuleSet.class, this,
					HybridfuzzymodelPackage.SYSTEM__RULESET);
		}
		return ruleset;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HybridfuzzymodelPackage.SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRate() {
		return rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRate(double newRate) {
		double oldRate = rate;
		rate = newRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridfuzzymodelPackage.SYSTEM__RATE, oldRate, rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionDefinition> getActiondefinition() {
		if (actiondefinition == null) {
			actiondefinition = new EObjectContainmentEList<ActionDefinition>(ActionDefinition.class, this,
					HybridfuzzymodelPackage.SYSTEM__ACTIONDEFINITION);
		}
		return actiondefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getErrorlocation() {
		if (errorlocation != null && errorlocation.eIsProxy()) {
			InternalEObject oldErrorlocation = (InternalEObject) errorlocation;
			errorlocation = (Location) eResolveProxy(oldErrorlocation);
			if (errorlocation != oldErrorlocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							HybridfuzzymodelPackage.SYSTEM__ERRORLOCATION, oldErrorlocation, errorlocation));
			}
		}
		return errorlocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetErrorlocation() {
		return errorlocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorlocation(Location newErrorlocation) {
		Location oldErrorlocation = errorlocation;
		errorlocation = newErrorlocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridfuzzymodelPackage.SYSTEM__ERRORLOCATION,
					oldErrorlocation, errorlocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getStartlocation() {
		if (startlocation != null && startlocation.eIsProxy()) {
			InternalEObject oldStartlocation = (InternalEObject) startlocation;
			startlocation = (Location) eResolveProxy(oldStartlocation);
			if (startlocation != oldStartlocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							HybridfuzzymodelPackage.SYSTEM__STARTLOCATION, oldStartlocation, startlocation));
			}
		}
		return startlocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetStartlocation() {
		return startlocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartlocation(Location newStartlocation) {
		Location oldStartlocation = startlocation;
		startlocation = newStartlocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridfuzzymodelPackage.SYSTEM__STARTLOCATION,
					oldStartlocation, startlocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FuzzySet> getFuzzyset() {
		if (fuzzyset == null) {
			fuzzyset = new EObjectContainmentEList<FuzzySet>(FuzzySet.class, this,
					HybridfuzzymodelPackage.SYSTEM__FUZZYSET);
		}
		return fuzzyset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HybridfuzzymodelPackage.SYSTEM__TRANSITION:
			return ((InternalEList<?>) getTransition()).basicRemove(otherEnd, msgs);
		case HybridfuzzymodelPackage.SYSTEM__LOCATION:
			return ((InternalEList<?>) getLocation()).basicRemove(otherEnd, msgs);
		case HybridfuzzymodelPackage.SYSTEM__VARIABLE:
			return ((InternalEList<?>) getVariable()).basicRemove(otherEnd, msgs);
		case HybridfuzzymodelPackage.SYSTEM__RULESET:
			return ((InternalEList<?>) getRuleset()).basicRemove(otherEnd, msgs);
		case HybridfuzzymodelPackage.SYSTEM__ACTIONDEFINITION:
			return ((InternalEList<?>) getActiondefinition()).basicRemove(otherEnd, msgs);
		case HybridfuzzymodelPackage.SYSTEM__FUZZYSET:
			return ((InternalEList<?>) getFuzzyset()).basicRemove(otherEnd, msgs);
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
		case HybridfuzzymodelPackage.SYSTEM__TRANSITION:
			return getTransition();
		case HybridfuzzymodelPackage.SYSTEM__LOCATION:
			return getLocation();
		case HybridfuzzymodelPackage.SYSTEM__VARIABLE:
			return getVariable();
		case HybridfuzzymodelPackage.SYSTEM__RULESET:
			return getRuleset();
		case HybridfuzzymodelPackage.SYSTEM__NAME:
			return getName();
		case HybridfuzzymodelPackage.SYSTEM__RATE:
			return getRate();
		case HybridfuzzymodelPackage.SYSTEM__ACTIONDEFINITION:
			return getActiondefinition();
		case HybridfuzzymodelPackage.SYSTEM__ERRORLOCATION:
			if (resolve)
				return getErrorlocation();
			return basicGetErrorlocation();
		case HybridfuzzymodelPackage.SYSTEM__STARTLOCATION:
			if (resolve)
				return getStartlocation();
			return basicGetStartlocation();
		case HybridfuzzymodelPackage.SYSTEM__FUZZYSET:
			return getFuzzyset();
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
		case HybridfuzzymodelPackage.SYSTEM__TRANSITION:
			getTransition().clear();
			getTransition().addAll((Collection<? extends Transition>) newValue);
			return;
		case HybridfuzzymodelPackage.SYSTEM__LOCATION:
			getLocation().clear();
			getLocation().addAll((Collection<? extends Location>) newValue);
			return;
		case HybridfuzzymodelPackage.SYSTEM__VARIABLE:
			getVariable().clear();
			getVariable().addAll((Collection<? extends Variable>) newValue);
			return;
		case HybridfuzzymodelPackage.SYSTEM__RULESET:
			getRuleset().clear();
			getRuleset().addAll((Collection<? extends RuleSet>) newValue);
			return;
		case HybridfuzzymodelPackage.SYSTEM__NAME:
			setName((String) newValue);
			return;
		case HybridfuzzymodelPackage.SYSTEM__RATE:
			setRate((Double) newValue);
			return;
		case HybridfuzzymodelPackage.SYSTEM__ACTIONDEFINITION:
			getActiondefinition().clear();
			getActiondefinition().addAll((Collection<? extends ActionDefinition>) newValue);
			return;
		case HybridfuzzymodelPackage.SYSTEM__ERRORLOCATION:
			setErrorlocation((Location) newValue);
			return;
		case HybridfuzzymodelPackage.SYSTEM__STARTLOCATION:
			setStartlocation((Location) newValue);
			return;
		case HybridfuzzymodelPackage.SYSTEM__FUZZYSET:
			getFuzzyset().clear();
			getFuzzyset().addAll((Collection<? extends FuzzySet>) newValue);
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
		case HybridfuzzymodelPackage.SYSTEM__TRANSITION:
			getTransition().clear();
			return;
		case HybridfuzzymodelPackage.SYSTEM__LOCATION:
			getLocation().clear();
			return;
		case HybridfuzzymodelPackage.SYSTEM__VARIABLE:
			getVariable().clear();
			return;
		case HybridfuzzymodelPackage.SYSTEM__RULESET:
			getRuleset().clear();
			return;
		case HybridfuzzymodelPackage.SYSTEM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case HybridfuzzymodelPackage.SYSTEM__RATE:
			setRate(RATE_EDEFAULT);
			return;
		case HybridfuzzymodelPackage.SYSTEM__ACTIONDEFINITION:
			getActiondefinition().clear();
			return;
		case HybridfuzzymodelPackage.SYSTEM__ERRORLOCATION:
			setErrorlocation((Location) null);
			return;
		case HybridfuzzymodelPackage.SYSTEM__STARTLOCATION:
			setStartlocation((Location) null);
			return;
		case HybridfuzzymodelPackage.SYSTEM__FUZZYSET:
			getFuzzyset().clear();
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
		case HybridfuzzymodelPackage.SYSTEM__TRANSITION:
			return transition != null && !transition.isEmpty();
		case HybridfuzzymodelPackage.SYSTEM__LOCATION:
			return location != null && !location.isEmpty();
		case HybridfuzzymodelPackage.SYSTEM__VARIABLE:
			return variable != null && !variable.isEmpty();
		case HybridfuzzymodelPackage.SYSTEM__RULESET:
			return ruleset != null && !ruleset.isEmpty();
		case HybridfuzzymodelPackage.SYSTEM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case HybridfuzzymodelPackage.SYSTEM__RATE:
			return rate != RATE_EDEFAULT;
		case HybridfuzzymodelPackage.SYSTEM__ACTIONDEFINITION:
			return actiondefinition != null && !actiondefinition.isEmpty();
		case HybridfuzzymodelPackage.SYSTEM__ERRORLOCATION:
			return errorlocation != null;
		case HybridfuzzymodelPackage.SYSTEM__STARTLOCATION:
			return startlocation != null;
		case HybridfuzzymodelPackage.SYSTEM__FUZZYSET:
			return fuzzyset != null && !fuzzyset.isEmpty();
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
		result.append(", rate: ");
		result.append(rate);
		result.append(')');
		return result.toString();
	}

} //SystemImpl
