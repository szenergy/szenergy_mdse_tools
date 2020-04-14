/**
 */
package hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl;

import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.CrispGuard;
import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.HybridfuzzymodelPackage;

import hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.RelationExpression;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crisp Guard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.sze.aut.fuzzy.hybrid.system.model.hybridfuzzymodel.impl.CrispGuardImpl#getRelationexpression <em>Relationexpression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrispGuardImpl extends RuleImpl implements CrispGuard {
	/**
	 * The cached value of the '{@link #getRelationexpression() <em>Relationexpression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationexpression()
	 * @generated
	 * @ordered
	 */
	protected RelationExpression relationexpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrispGuardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HybridfuzzymodelPackage.Literals.CRISP_GUARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationExpression getRelationexpression() {
		return relationexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationexpression(RelationExpression newRelationexpression,
			NotificationChain msgs) {
		RelationExpression oldRelationexpression = relationexpression;
		relationexpression = newRelationexpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HybridfuzzymodelPackage.CRISP_GUARD__RELATIONEXPRESSION, oldRelationexpression,
					newRelationexpression);
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
	public void setRelationexpression(RelationExpression newRelationexpression) {
		if (newRelationexpression != relationexpression) {
			NotificationChain msgs = null;
			if (relationexpression != null)
				msgs = ((InternalEObject) relationexpression).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - HybridfuzzymodelPackage.CRISP_GUARD__RELATIONEXPRESSION, null, msgs);
			if (newRelationexpression != null)
				msgs = ((InternalEObject) newRelationexpression).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - HybridfuzzymodelPackage.CRISP_GUARD__RELATIONEXPRESSION, null, msgs);
			msgs = basicSetRelationexpression(newRelationexpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					HybridfuzzymodelPackage.CRISP_GUARD__RELATIONEXPRESSION, newRelationexpression,
					newRelationexpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HybridfuzzymodelPackage.CRISP_GUARD__RELATIONEXPRESSION:
			return basicSetRelationexpression(null, msgs);
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
		case HybridfuzzymodelPackage.CRISP_GUARD__RELATIONEXPRESSION:
			return getRelationexpression();
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
		case HybridfuzzymodelPackage.CRISP_GUARD__RELATIONEXPRESSION:
			setRelationexpression((RelationExpression) newValue);
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
		case HybridfuzzymodelPackage.CRISP_GUARD__RELATIONEXPRESSION:
			setRelationexpression((RelationExpression) null);
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
		case HybridfuzzymodelPackage.CRISP_GUARD__RELATIONEXPRESSION:
			return relationexpression != null;
		}
		return super.eIsSet(featureID);
	}

} //CrispGuardImpl
