/**
 */
package SDMLanguage.activities.impl;

import SDMLanguage.activities.ActivitiesPackage;
import SDMLanguage.activities.Activity;
import SDMLanguage.activities.ActivityEdge;
import SDMLanguage.activities.ActivityNode;

import SDMLanguage.impl.CommentableElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SDMLanguage.activities.impl.ActivityImpl#getOwnedActivityEdge <em>Owned Activity Edge</em>}</li>
 *   <li>{@link SDMLanguage.activities.impl.ActivityImpl#getOwnedActivityNode <em>Owned Activity Node</em>}</li>
 *   <li>{@link SDMLanguage.activities.impl.ActivityImpl#getOwningOperation <em>Owning Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends CommentableElementImpl implements Activity {
	/**
	 * The cached value of the '{@link #getOwnedActivityEdge() <em>Owned Activity Edge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedActivityEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> ownedActivityEdge;

	/**
	 * The cached value of the '{@link #getOwnedActivityNode() <em>Owned Activity Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedActivityNode()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> ownedActivityNode;

	/**
	 * The cached value of the '{@link #getOwningOperation() <em>Owning Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningOperation()
	 * @generated
	 * @ordered
	 */
	protected EOperation owningOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitiesPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getOwnedActivityEdge() {
		if (ownedActivityEdge == null) {
			ownedActivityEdge = new EObjectContainmentWithInverseEList<ActivityEdge>(ActivityEdge.class, this,
					ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGE, ActivitiesPackage.ACTIVITY_EDGE__OWNING_ACTIVITY);
		}
		return ownedActivityEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getOwnedActivityNode() {
		if (ownedActivityNode == null) {
			ownedActivityNode = new EObjectContainmentWithInverseEList<ActivityNode>(ActivityNode.class, this,
					ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODE, ActivitiesPackage.ACTIVITY_NODE__OWNING_ACTIVITY);
		}
		return ownedActivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOwningOperation() {
		if (owningOperation != null && owningOperation.eIsProxy()) {
			InternalEObject oldOwningOperation = (InternalEObject) owningOperation;
			owningOperation = (EOperation) eResolveProxy(oldOwningOperation);
			if (owningOperation != oldOwningOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ActivitiesPackage.ACTIVITY__OWNING_OPERATION, oldOwningOperation, owningOperation));
			}
		}
		return owningOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation basicGetOwningOperation() {
		return owningOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningOperation(EOperation newOwningOperation) {
		EOperation oldOwningOperation = owningOperation;
		owningOperation = newOwningOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY__OWNING_OPERATION,
					oldOwningOperation, owningOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedActivityEdge()).basicAdd(otherEnd,
					msgs);
		case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedActivityNode()).basicAdd(otherEnd,
					msgs);
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
		case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGE:
			return ((InternalEList<?>) getOwnedActivityEdge()).basicRemove(otherEnd, msgs);
		case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODE:
			return ((InternalEList<?>) getOwnedActivityNode()).basicRemove(otherEnd, msgs);
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
		case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGE:
			return getOwnedActivityEdge();
		case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODE:
			return getOwnedActivityNode();
		case ActivitiesPackage.ACTIVITY__OWNING_OPERATION:
			if (resolve)
				return getOwningOperation();
			return basicGetOwningOperation();
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
		case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGE:
			getOwnedActivityEdge().clear();
			getOwnedActivityEdge().addAll((Collection<? extends ActivityEdge>) newValue);
			return;
		case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODE:
			getOwnedActivityNode().clear();
			getOwnedActivityNode().addAll((Collection<? extends ActivityNode>) newValue);
			return;
		case ActivitiesPackage.ACTIVITY__OWNING_OPERATION:
			setOwningOperation((EOperation) newValue);
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
		case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGE:
			getOwnedActivityEdge().clear();
			return;
		case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODE:
			getOwnedActivityNode().clear();
			return;
		case ActivitiesPackage.ACTIVITY__OWNING_OPERATION:
			setOwningOperation((EOperation) null);
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
		case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGE:
			return ownedActivityEdge != null && !ownedActivityEdge.isEmpty();
		case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODE:
			return ownedActivityNode != null && !ownedActivityNode.isEmpty();
		case ActivitiesPackage.ACTIVITY__OWNING_OPERATION:
			return owningOperation != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ActivityImpl
