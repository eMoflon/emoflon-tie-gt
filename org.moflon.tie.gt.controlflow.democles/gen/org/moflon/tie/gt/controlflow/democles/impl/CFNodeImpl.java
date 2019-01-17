/**
 */
package org.moflon.tie.gt.controlflow.democles.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.moflon.tie.gt.controlflow.democles.Action;
import org.moflon.tie.gt.controlflow.democles.CFNode;
import org.moflon.tie.gt.controlflow.democles.DemoclesPackage;
import org.moflon.tie.gt.controlflow.democles.RepetitionNode;
import org.moflon.tie.gt.controlflow.democles.Scope;
import org.moflon.tie.gt.controlflow.democles.Visitor;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>CF
 * Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.moflon.tie.gt.controlflow.democles.impl.CFNodeImpl#getScope
 * <em>Scope</em>}</li>
 * <li>{@link org.moflon.tie.gt.controlflow.democles.impl.CFNodeImpl#getMainAction
 * <em>Main Action</em>}</li>
 * <li>{@link org.moflon.tie.gt.controlflow.democles.impl.CFNodeImpl#getActions
 * <em>Actions</em>}</li>
 * <li>{@link org.moflon.tie.gt.controlflow.democles.impl.CFNodeImpl#getNext
 * <em>Next</em>}</li>
 * <li>{@link org.moflon.tie.gt.controlflow.democles.impl.CFNodeImpl#getPrev
 * <em>Prev</em>}</li>
 * <li>{@link org.moflon.tie.gt.controlflow.democles.impl.CFNodeImpl#getHeader
 * <em>Header</em>}</li>
 * <li>{@link org.moflon.tie.gt.controlflow.democles.impl.CFNodeImpl#getId
 * <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CFNodeImpl extends EObjectImpl implements CFNode {
	/**
	 * The cached value of the '{@link #getMainAction() <em>Main Action</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMainAction()
	 * @generated
	 * @ordered
	 */
	protected Action mainAction;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected CFNode next;

	/**
	 * The cached value of the '{@link #getPrev() <em>Prev</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPrev()
	 * @generated
	 * @ordered
	 */
	protected CFNode prev;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected RepetitionNode header;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CFNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DemoclesPackage.Literals.CF_NODE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Scope getScope() {
		if (eContainerFeatureID() != DemoclesPackage.CF_NODE__SCOPE)
			return null;
		return (Scope) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetScope(final Scope newScope, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newScope, DemoclesPackage.CF_NODE__SCOPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setScope(final Scope newScope) {
		if (newScope != eInternalContainer()
				|| (eContainerFeatureID() != DemoclesPackage.CF_NODE__SCOPE && newScope != null)) {
			if (EcoreUtil.isAncestor(this, newScope))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScope != null)
				msgs = ((InternalEObject) newScope).eInverseAdd(this, DemoclesPackage.SCOPE__CONTENTS, Scope.class,
						msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemoclesPackage.CF_NODE__SCOPE, newScope, newScope));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Action getMainAction() {
		if (mainAction != null && mainAction.eIsProxy()) {
			final InternalEObject oldMainAction = (InternalEObject) mainAction;
			mainAction = (Action) eResolveProxy(oldMainAction);
			if (mainAction != oldMainAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DemoclesPackage.CF_NODE__MAIN_ACTION,
							oldMainAction, mainAction));
			}
		}
		return mainAction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Action basicGetMainAction() {
		return mainAction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMainAction(final Action newMainAction) {
		final Action oldMainAction = mainAction;
		mainAction = newMainAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemoclesPackage.CF_NODE__MAIN_ACTION, oldMainAction,
					mainAction));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentWithInverseEList<Action>(Action.class, this,
					DemoclesPackage.CF_NODE__ACTIONS, DemoclesPackage.ACTION__CF_NODE);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CFNode getNext() {
		if (next != null && next.eIsProxy()) {
			final InternalEObject oldNext = (InternalEObject) next;
			next = (CFNode) eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DemoclesPackage.CF_NODE__NEXT, oldNext,
							next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CFNode basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetNext(final CFNode newNext, NotificationChain msgs) {
		final CFNode oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DemoclesPackage.CF_NODE__NEXT, oldNext, newNext);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNext(final CFNode newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject) next).eInverseRemove(this, DemoclesPackage.CF_NODE__PREV, CFNode.class, msgs);
			if (newNext != null)
				msgs = ((InternalEObject) newNext).eInverseAdd(this, DemoclesPackage.CF_NODE__PREV, CFNode.class, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemoclesPackage.CF_NODE__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CFNode getPrev() {
		if (prev != null && prev.eIsProxy()) {
			final InternalEObject oldPrev = (InternalEObject) prev;
			prev = (CFNode) eResolveProxy(oldPrev);
			if (prev != oldPrev) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DemoclesPackage.CF_NODE__PREV, oldPrev,
							prev));
			}
		}
		return prev;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CFNode basicGetPrev() {
		return prev;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetPrev(final CFNode newPrev, NotificationChain msgs) {
		final CFNode oldPrev = prev;
		prev = newPrev;
		if (eNotificationRequired()) {
			final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DemoclesPackage.CF_NODE__PREV, oldPrev, newPrev);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPrev(final CFNode newPrev) {
		if (newPrev != prev) {
			NotificationChain msgs = null;
			if (prev != null)
				msgs = ((InternalEObject) prev).eInverseRemove(this, DemoclesPackage.CF_NODE__NEXT, CFNode.class, msgs);
			if (newPrev != null)
				msgs = ((InternalEObject) newPrev).eInverseAdd(this, DemoclesPackage.CF_NODE__NEXT, CFNode.class, msgs);
			msgs = basicSetPrev(newPrev, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemoclesPackage.CF_NODE__PREV, newPrev, newPrev));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RepetitionNode getHeader() {
		if (header != null && header.eIsProxy()) {
			final InternalEObject oldHeader = (InternalEObject) header;
			header = (RepetitionNode) eResolveProxy(oldHeader);
			if (header != oldHeader) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DemoclesPackage.CF_NODE__HEADER,
							oldHeader, header));
			}
		}
		return header;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RepetitionNode basicGetHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetHeader(final RepetitionNode newHeader, NotificationChain msgs) {
		final RepetitionNode oldHeader = header;
		header = newHeader;
		if (eNotificationRequired()) {
			final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DemoclesPackage.CF_NODE__HEADER, oldHeader, newHeader);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setHeader(final RepetitionNode newHeader) {
		if (newHeader != header) {
			NotificationChain msgs = null;
			if (header != null)
				msgs = ((InternalEObject) header).eInverseRemove(this, DemoclesPackage.REPETITION_NODE__LAST_NODES,
						RepetitionNode.class, msgs);
			if (newHeader != null)
				msgs = ((InternalEObject) newHeader).eInverseAdd(this, DemoclesPackage.REPETITION_NODE__LAST_NODES,
						RepetitionNode.class, msgs);
			msgs = basicSetHeader(newHeader, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemoclesPackage.CF_NODE__HEADER, newHeader,
					newHeader));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(final int newId) {
		final int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemoclesPackage.CF_NODE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void accept(final Visitor visitor) {

		final Object[] result1_black = CFNodeImpl.pattern_CFNode_0_1_LookupThisObject_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		//
		CFNodeImpl.pattern_CFNode_0_2_VisitNode_expressionBB(visitor, this);
		//
		final Object[] result3_black = CFNodeImpl.pattern_CFNode_0_3_LookupNextNode_blackBF(this);
		if (result3_black != null) {
			final CFNode next = (CFNode) result3_black[1];
			//
			CFNodeImpl.pattern_CFNode_0_4_TraverseNextNode_expressionBB(next, visitor);

		} else {
		}
		return;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Scope getRelevantScope() {

		final Object[] result1_black = CFNodeImpl.pattern_CFNode_1_1_LookupParentScope_blackFB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		final Scope parent = (Scope) result1_black[0];
		return CFNodeImpl.pattern_CFNode_1_2_expressionFB(parent);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DemoclesPackage.CF_NODE__SCOPE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetScope((Scope) otherEnd, msgs);
		case DemoclesPackage.CF_NODE__ACTIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getActions()).basicAdd(otherEnd, msgs);
		case DemoclesPackage.CF_NODE__NEXT:
			if (next != null)
				msgs = ((InternalEObject) next).eInverseRemove(this, DemoclesPackage.CF_NODE__PREV, CFNode.class, msgs);
			return basicSetNext((CFNode) otherEnd, msgs);
		case DemoclesPackage.CF_NODE__PREV:
			if (prev != null)
				msgs = ((InternalEObject) prev).eInverseRemove(this, DemoclesPackage.CF_NODE__NEXT, CFNode.class, msgs);
			return basicSetPrev((CFNode) otherEnd, msgs);
		case DemoclesPackage.CF_NODE__HEADER:
			if (header != null)
				msgs = ((InternalEObject) header).eInverseRemove(this, DemoclesPackage.REPETITION_NODE__LAST_NODES,
						RepetitionNode.class, msgs);
			return basicSetHeader((RepetitionNode) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
			final NotificationChain msgs) {
		switch (featureID) {
		case DemoclesPackage.CF_NODE__SCOPE:
			return basicSetScope(null, msgs);
		case DemoclesPackage.CF_NODE__ACTIONS:
			return ((InternalEList<?>) getActions()).basicRemove(otherEnd, msgs);
		case DemoclesPackage.CF_NODE__NEXT:
			return basicSetNext(null, msgs);
		case DemoclesPackage.CF_NODE__PREV:
			return basicSetPrev(null, msgs);
		case DemoclesPackage.CF_NODE__HEADER:
			return basicSetHeader(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(final NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case DemoclesPackage.CF_NODE__SCOPE:
			return eInternalContainer().eInverseRemove(this, DemoclesPackage.SCOPE__CONTENTS, Scope.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
		case DemoclesPackage.CF_NODE__SCOPE:
			return getScope();
		case DemoclesPackage.CF_NODE__MAIN_ACTION:
			if (resolve)
				return getMainAction();
			return basicGetMainAction();
		case DemoclesPackage.CF_NODE__ACTIONS:
			return getActions();
		case DemoclesPackage.CF_NODE__NEXT:
			if (resolve)
				return getNext();
			return basicGetNext();
		case DemoclesPackage.CF_NODE__PREV:
			if (resolve)
				return getPrev();
			return basicGetPrev();
		case DemoclesPackage.CF_NODE__HEADER:
			if (resolve)
				return getHeader();
			return basicGetHeader();
		case DemoclesPackage.CF_NODE__ID:
			return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
		case DemoclesPackage.CF_NODE__SCOPE:
			setScope((Scope) newValue);
			return;
		case DemoclesPackage.CF_NODE__MAIN_ACTION:
			setMainAction((Action) newValue);
			return;
		case DemoclesPackage.CF_NODE__ACTIONS:
			getActions().clear();
			getActions().addAll((Collection<? extends Action>) newValue);
			return;
		case DemoclesPackage.CF_NODE__NEXT:
			setNext((CFNode) newValue);
			return;
		case DemoclesPackage.CF_NODE__PREV:
			setPrev((CFNode) newValue);
			return;
		case DemoclesPackage.CF_NODE__HEADER:
			setHeader((RepetitionNode) newValue);
			return;
		case DemoclesPackage.CF_NODE__ID:
			setId((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(final int featureID) {
		switch (featureID) {
		case DemoclesPackage.CF_NODE__SCOPE:
			setScope((Scope) null);
			return;
		case DemoclesPackage.CF_NODE__MAIN_ACTION:
			setMainAction((Action) null);
			return;
		case DemoclesPackage.CF_NODE__ACTIONS:
			getActions().clear();
			return;
		case DemoclesPackage.CF_NODE__NEXT:
			setNext((CFNode) null);
			return;
		case DemoclesPackage.CF_NODE__PREV:
			setPrev((CFNode) null);
			return;
		case DemoclesPackage.CF_NODE__HEADER:
			setHeader((RepetitionNode) null);
			return;
		case DemoclesPackage.CF_NODE__ID:
			setId(ID_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(final int featureID) {
		switch (featureID) {
		case DemoclesPackage.CF_NODE__SCOPE:
			return getScope() != null;
		case DemoclesPackage.CF_NODE__MAIN_ACTION:
			return mainAction != null;
		case DemoclesPackage.CF_NODE__ACTIONS:
			return actions != null && !actions.isEmpty();
		case DemoclesPackage.CF_NODE__NEXT:
			return next != null;
		case DemoclesPackage.CF_NODE__PREV:
			return prev != null;
		case DemoclesPackage.CF_NODE__HEADER:
			return header != null;
		case DemoclesPackage.CF_NODE__ID:
			return id != ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case DemoclesPackage.CF_NODE___ACCEPT__VISITOR:
			accept((Visitor) arguments.get(0));
			return null;
		case DemoclesPackage.CF_NODE___GET_RELEVANT_SCOPE:
			return getRelevantScope();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		final StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

	public static final Object[] pattern_CFNode_0_1_LookupThisObject_blackB(final CFNode _this) {
		return new Object[] { _this };
	}

	public static final void pattern_CFNode_0_2_VisitNode_expressionBB(final Visitor visitor, final CFNode _this) {
		visitor.visitNode(_this);

	}

	public static final Object[] pattern_CFNode_0_3_LookupNextNode_blackBF(final CFNode _this) {
		final CFNode next = _this.getNext();
		if (next != null) {
			if (!next.equals(_this)) {
				return new Object[] { _this, next };
			}
		}

		return null;
	}

	public static final void pattern_CFNode_0_4_TraverseNextNode_expressionBB(final CFNode next,
			final Visitor visitor) {
		next.accept(visitor);

	}

	public static final Object[] pattern_CFNode_1_1_LookupParentScope_blackFB(final CFNode _this) {
		final Scope parent = _this.getScope();
		if (parent != null) {
			return new Object[] { parent, _this };
		}

		return null;
	}

	public static final Scope pattern_CFNode_1_2_expressionFB(final Scope parent) {
		final Scope _result = parent;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // CFNodeImpl
