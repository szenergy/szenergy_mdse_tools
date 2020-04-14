/**
 */
package hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl;

import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.ActionDefinition;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.DiscreteEvent;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.HybridfuzzymodelPackage;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Location;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Rule;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.Transition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.TransitionImpl#getInvariant <em>Invariant</em>}</li>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.TransitionImpl#getActiondefinition <em>Actiondefinition</em>}</li>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.TransitionImpl#getTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The cached value of the '{@link #getInvariant() <em>Invariant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariant()
	 * @generated
	 * @ordered
	 */
	protected Rule invariant;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Location target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Location source;

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
	 * The cached value of the '{@link #getActiondefinition() <em>Actiondefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiondefinition()
	 * @generated
	 * @ordered
	 */
	protected ActionDefinition actiondefinition;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected DiscreteEvent trigger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HybridfuzzymodelPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getInvariant() {
		if (invariant != null && invariant.eIsProxy()) {
			InternalEObject oldInvariant = (InternalEObject) invariant;
			invariant = (Rule) eResolveProxy(oldInvariant);
			if (invariant != oldInvariant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							HybridfuzzymodelPackage.TRANSITION__INVARIANT, oldInvariant, invariant));
			}
		}
		return invariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule basicGetInvariant() {
		return invariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvariant(Rule newInvariant) {
		Rule oldInvariant = invariant;
		invariant = newInvariant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridfuzzymodelPackage.TRANSITION__INVARIANT,
					oldInvariant, invariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (Location) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							HybridfuzzymodelPackage.TRANSITION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Location newTarget) {
		Location oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridfuzzymodelPackage.TRANSITION__TARGET, oldTarget,
					target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (Location) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							HybridfuzzymodelPackage.TRANSITION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Location newSource) {
		Location oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridfuzzymodelPackage.TRANSITION__SOURCE, oldSource,
					source));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HybridfuzzymodelPackage.TRANSITION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionDefinition getActiondefinition() {
		if (actiondefinition != null && actiondefinition.eIsProxy()) {
			InternalEObject oldActiondefinition = (InternalEObject) actiondefinition;
			actiondefinition = (ActionDefinition) eResolveProxy(oldActiondefinition);
			if (actiondefinition != oldActiondefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							HybridfuzzymodelPackage.TRANSITION__ACTIONDEFINITION, oldActiondefinition,
							actiondefinition));
			}
		}
		return actiondefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionDefinition basicGetActiondefinition() {
		return actiondefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActiondefinition(ActionDefinition newActiondefinition, NotificationChain msgs) {
		ActionDefinition oldActiondefinition = actiondefinition;
		actiondefinition = newActiondefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HybridfuzzymodelPackage.TRANSITION__ACTIONDEFINITION, oldActiondefinition, newActiondefinition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiondefinition(ActionDefinition newActiondefinition) {
		if (newActiondefinition != actiondefinition) {
			NotificationChain msgs = null;
			if (actiondefinition != null)
				msgs = ((InternalEObject) actiondefinition).eInverseRemove(this,
						HybridfuzzymodelPackage.ACTION_DEFINITION__TRANSITION, ActionDefinition.class, msgs);
			if (newActiondefinition != null)
				msgs = ((InternalEObject) newActiondefinition).eInverseAdd(this,
						HybridfuzzymodelPackage.ACTION_DEFINITION__TRANSITION, ActionDefinition.class, msgs);
			msgs = basicSetActiondefinition(newActiondefinition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridfuzzymodelPackage.TRANSITION__ACTIONDEFINITION,
					newActiondefinition, newActiondefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteEvent getTrigger() {
		if (trigger != null && trigger.eIsProxy()) {
			InternalEObject oldTrigger = (InternalEObject) trigger;
			trigger = (DiscreteEvent) eResolveProxy(oldTrigger);
			if (trigger != oldTrigger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							HybridfuzzymodelPackage.TRANSITION__TRIGGER, oldTrigger, trigger));
			}
		}
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteEvent basicGetTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrigger(DiscreteEvent newTrigger, NotificationChain msgs) {
		DiscreteEvent oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HybridfuzzymodelPackage.TRANSITION__TRIGGER, oldTrigger, newTrigger);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(DiscreteEvent newTrigger) {
		if (newTrigger != trigger) {
			NotificationChain msgs = null;
			if (trigger != null)
				msgs = ((InternalEObject) trigger).eInverseRemove(this,
						HybridfuzzymodelPackage.DISCRETE_EVENT__TRANSITION, DiscreteEvent.class, msgs);
			if (newTrigger != null)
				msgs = ((InternalEObject) newTrigger).eInverseAdd(this,
						HybridfuzzymodelPackage.DISCRETE_EVENT__TRANSITION, DiscreteEvent.class, msgs);
			msgs = basicSetTrigger(newTrigger, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridfuzzymodelPackage.TRANSITION__TRIGGER,
					newTrigger, newTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HybridfuzzymodelPackage.TRANSITION__ACTIONDEFINITION:
			if (actiondefinition != null)
				msgs = ((InternalEObject) actiondefinition).eInverseRemove(this,
						HybridfuzzymodelPackage.ACTION_DEFINITION__TRANSITION, ActionDefinition.class, msgs);
			return basicSetActiondefinition((ActionDefinition) otherEnd, msgs);
		case HybridfuzzymodelPackage.TRANSITION__TRIGGER:
			if (trigger != null)
				msgs = ((InternalEObject) trigger).eInverseRemove(this,
						HybridfuzzymodelPackage.DISCRETE_EVENT__TRANSITION, DiscreteEvent.class, msgs);
			return basicSetTrigger((DiscreteEvent) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HybridfuzzymodelPackage.TRANSITION__ACTIONDEFINITION:
			return basicSetActiondefinition(null, msgs);
		case HybridfuzzymodelPackage.TRANSITION__TRIGGER:
			return basicSetTrigger(null, msgs);
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
		case HybridfuzzymodelPackage.TRANSITION__INVARIANT:
			if (resolve)
				return getInvariant();
			return basicGetInvariant();
		case HybridfuzzymodelPackage.TRANSITION__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case HybridfuzzymodelPackage.TRANSITION__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case HybridfuzzymodelPackage.TRANSITION__NAME:
			return getName();
		case HybridfuzzymodelPackage.TRANSITION__ACTIONDEFINITION:
			if (resolve)
				return getActiondefinition();
			return basicGetActiondefinition();
		case HybridfuzzymodelPackage.TRANSITION__TRIGGER:
			if (resolve)
				return getTrigger();
			return basicGetTrigger();
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
		case HybridfuzzymodelPackage.TRANSITION__INVARIANT:
			setInvariant((Rule) newValue);
			return;
		case HybridfuzzymodelPackage.TRANSITION__TARGET:
			setTarget((Location) newValue);
			return;
		case HybridfuzzymodelPackage.TRANSITION__SOURCE:
			setSource((Location) newValue);
			return;
		case HybridfuzzymodelPackage.TRANSITION__NAME:
			setName((String) newValue);
			return;
		case HybridfuzzymodelPackage.TRANSITION__ACTIONDEFINITION:
			setActiondefinition((ActionDefinition) newValue);
			return;
		case HybridfuzzymodelPackage.TRANSITION__TRIGGER:
			setTrigger((DiscreteEvent) newValue);
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
		case HybridfuzzymodelPackage.TRANSITION__INVARIANT:
			setInvariant((Rule) null);
			return;
		case HybridfuzzymodelPackage.TRANSITION__TARGET:
			setTarget((Location) null);
			return;
		case HybridfuzzymodelPackage.TRANSITION__SOURCE:
			setSource((Location) null);
			return;
		case HybridfuzzymodelPackage.TRANSITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case HybridfuzzymodelPackage.TRANSITION__ACTIONDEFINITION:
			setActiondefinition((ActionDefinition) null);
			return;
		case HybridfuzzymodelPackage.TRANSITION__TRIGGER:
			setTrigger((DiscreteEvent) null);
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
		case HybridfuzzymodelPackage.TRANSITION__INVARIANT:
			return invariant != null;
		case HybridfuzzymodelPackage.TRANSITION__TARGET:
			return target != null;
		case HybridfuzzymodelPackage.TRANSITION__SOURCE:
			return source != null;
		case HybridfuzzymodelPackage.TRANSITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case HybridfuzzymodelPackage.TRANSITION__ACTIONDEFINITION:
			return actiondefinition != null;
		case HybridfuzzymodelPackage.TRANSITION__TRIGGER:
			return trigger != null;
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

} //TransitionImpl
