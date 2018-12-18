/**
 */
package SDMLanguage.activities.impl;

import SDMLanguage.activities.ActivitiesPackage;
import SDMLanguage.activities.Activity;
import SDMLanguage.activities.ActivityEdge;
import SDMLanguage.activities.ActivityNode;
import SDMLanguage.activities.EdgeGuard;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SDMLanguage.activities.impl.ActivityEdgeImpl#getOwningActivity <em>Owning Activity</em>}</li>
 *   <li>{@link SDMLanguage.activities.impl.ActivityEdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link SDMLanguage.activities.impl.ActivityEdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link SDMLanguage.activities.impl.ActivityEdgeImpl#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityEdgeImpl extends EObjectImpl implements ActivityEdge {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode target;

	/**
	 * The default value of the '{@link #getGuard() <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected static final EdgeGuard GUARD_EDEFAULT = EdgeGuard.NONE;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected EdgeGuard guard = GUARD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitiesPackage.Literals.ACTIVITY_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getOwningActivity() {
		if (eContainerFeatureID() != ActivitiesPackage.ACTIVITY_EDGE__OWNING_ACTIVITY)
			return null;
		return (Activity) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningActivity(Activity newOwningActivity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOwningActivity, ActivitiesPackage.ACTIVITY_EDGE__OWNING_ACTIVITY,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningActivity(Activity newOwningActivity) {
		if (newOwningActivity != eInternalContainer()
				|| (eContainerFeatureID() != ActivitiesPackage.ACTIVITY_EDGE__OWNING_ACTIVITY
						&& newOwningActivity != null)) {
			if (EcoreUtil.isAncestor(this, newOwningActivity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningActivity != null)
				msgs = ((InternalEObject) newOwningActivity).eInverseAdd(this,
						ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGE, Activity.class, msgs);
			msgs = basicSetOwningActivity(newOwningActivity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY_EDGE__OWNING_ACTIVITY,
					newOwningActivity, newOwningActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (ActivityNode) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitiesPackage.ACTIVITY_EDGE__SOURCE,
							oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(ActivityNode newSource, NotificationChain msgs) {
		ActivityNode oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ActivitiesPackage.ACTIVITY_EDGE__SOURCE, oldSource, newSource);
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
	public void setSource(ActivityNode newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this, ActivitiesPackage.ACTIVITY_NODE__OUTGOING,
						ActivityNode.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this, ActivitiesPackage.ACTIVITY_NODE__OUTGOING,
						ActivityNode.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY_EDGE__SOURCE, newSource,
					newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (ActivityNode) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitiesPackage.ACTIVITY_EDGE__TARGET,
							oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(ActivityNode newTarget, NotificationChain msgs) {
		ActivityNode oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ActivitiesPackage.ACTIVITY_EDGE__TARGET, oldTarget, newTarget);
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
	public void setTarget(ActivityNode newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this, ActivitiesPackage.ACTIVITY_NODE__INCOMING,
						ActivityNode.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this, ActivitiesPackage.ACTIVITY_NODE__INCOMING,
						ActivityNode.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY_EDGE__TARGET, newTarget,
					newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeGuard getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(EdgeGuard newGuard) {
		EdgeGuard oldGuard = guard;
		guard = newGuard == null ? GUARD_EDEFAULT : newGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY_EDGE__GUARD, oldGuard,
					guard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ActivitiesPackage.ACTIVITY_EDGE__OWNING_ACTIVITY:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetOwningActivity((Activity) otherEnd, msgs);
		case ActivitiesPackage.ACTIVITY_EDGE__SOURCE:
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this, ActivitiesPackage.ACTIVITY_NODE__OUTGOING,
						ActivityNode.class, msgs);
			return basicSetSource((ActivityNode) otherEnd, msgs);
		case ActivitiesPackage.ACTIVITY_EDGE__TARGET:
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this, ActivitiesPackage.ACTIVITY_NODE__INCOMING,
						ActivityNode.class, msgs);
			return basicSetTarget((ActivityNode) otherEnd, msgs);
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
		case ActivitiesPackage.ACTIVITY_EDGE__OWNING_ACTIVITY:
			return basicSetOwningActivity(null, msgs);
		case ActivitiesPackage.ACTIVITY_EDGE__SOURCE:
			return basicSetSource(null, msgs);
		case ActivitiesPackage.ACTIVITY_EDGE__TARGET:
			return basicSetTarget(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case ActivitiesPackage.ACTIVITY_EDGE__OWNING_ACTIVITY:
			return eInternalContainer().eInverseRemove(this, ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGE,
					Activity.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ActivitiesPackage.ACTIVITY_EDGE__OWNING_ACTIVITY:
			return getOwningActivity();
		case ActivitiesPackage.ACTIVITY_EDGE__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case ActivitiesPackage.ACTIVITY_EDGE__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case ActivitiesPackage.ACTIVITY_EDGE__GUARD:
			return getGuard();
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
		case ActivitiesPackage.ACTIVITY_EDGE__OWNING_ACTIVITY:
			setOwningActivity((Activity) newValue);
			return;
		case ActivitiesPackage.ACTIVITY_EDGE__SOURCE:
			setSource((ActivityNode) newValue);
			return;
		case ActivitiesPackage.ACTIVITY_EDGE__TARGET:
			setTarget((ActivityNode) newValue);
			return;
		case ActivitiesPackage.ACTIVITY_EDGE__GUARD:
			setGuard((EdgeGuard) newValue);
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
		case ActivitiesPackage.ACTIVITY_EDGE__OWNING_ACTIVITY:
			setOwningActivity((Activity) null);
			return;
		case ActivitiesPackage.ACTIVITY_EDGE__SOURCE:
			setSource((ActivityNode) null);
			return;
		case ActivitiesPackage.ACTIVITY_EDGE__TARGET:
			setTarget((ActivityNode) null);
			return;
		case ActivitiesPackage.ACTIVITY_EDGE__GUARD:
			setGuard(GUARD_EDEFAULT);
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
		case ActivitiesPackage.ACTIVITY_EDGE__OWNING_ACTIVITY:
			return getOwningActivity() != null;
		case ActivitiesPackage.ACTIVITY_EDGE__SOURCE:
			return source != null;
		case ActivitiesPackage.ACTIVITY_EDGE__TARGET:
			return target != null;
		case ActivitiesPackage.ACTIVITY_EDGE__GUARD:
			return guard != GUARD_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (guard: ");
		result.append(guard);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ActivityEdgeImpl
