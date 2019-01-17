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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.moflon.tie.gt.controlflow.democles.Action;
import org.moflon.tie.gt.controlflow.democles.CFNode;
import org.moflon.tie.gt.controlflow.democles.CFVariable;
import org.moflon.tie.gt.controlflow.democles.DemoclesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.tie.gt.controlflow.democles.impl.ActionImpl#getReassignedVariables <em>Reassigned Variables</em>}</li>
 *   <li>{@link org.moflon.tie.gt.controlflow.democles.impl.ActionImpl#getCfNode <em>Cf Node</em>}</li>
 *   <li>{@link org.moflon.tie.gt.controlflow.democles.impl.ActionImpl#getConstructedVariables <em>Constructed Variables</em>}</li>
 *   <li>{@link org.moflon.tie.gt.controlflow.democles.impl.ActionImpl#getNext <em>Next</em>}</li>
 *   <li>{@link org.moflon.tie.gt.controlflow.democles.impl.ActionImpl#getPrev <em>Prev</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends EObjectImpl implements Action
{
   /**
    * The cached value of the '{@link #getReassignedVariables() <em>Reassigned Variables</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getReassignedVariables()
    * @generated
    * @ordered
    */
   protected EList<CFVariable> reassignedVariables;

   /**
    * The cached value of the '{@link #getConstructedVariables() <em>Constructed Variables</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getConstructedVariables()
    * @generated
    * @ordered
    */
   protected EList<CFVariable> constructedVariables;

   /**
    * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getNext()
    * @generated
    * @ordered
    */
   protected Action next;

   /**
    * The cached value of the '{@link #getPrev() <em>Prev</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getPrev()
    * @generated
    * @ordered
    */
   protected Action prev;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ActionImpl()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass()
   {
      return DemoclesPackage.Literals.ACTION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<CFVariable> getReassignedVariables()
   {
      if (reassignedVariables == null)
      {
         reassignedVariables = new EObjectWithInverseResolvingEList.ManyInverse<CFVariable>(CFVariable.class, this,
               DemoclesPackage.ACTION__REASSIGNED_VARIABLES, DemoclesPackage.CF_VARIABLE__REASSIGNMENTS);
      }
      return reassignedVariables;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CFNode getCfNode()
   {
      if (eContainerFeatureID() != DemoclesPackage.ACTION__CF_NODE)
         return null;
      return (CFNode) eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetCfNode(CFNode newCfNode, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newCfNode, DemoclesPackage.ACTION__CF_NODE, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setCfNode(CFNode newCfNode)
   {
      if (newCfNode != eInternalContainer() || (eContainerFeatureID() != DemoclesPackage.ACTION__CF_NODE && newCfNode != null))
      {
         if (EcoreUtil.isAncestor(this, newCfNode))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newCfNode != null)
            msgs = ((InternalEObject) newCfNode).eInverseAdd(this, DemoclesPackage.CF_NODE__ACTIONS, CFNode.class, msgs);
         msgs = basicSetCfNode(newCfNode, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DemoclesPackage.ACTION__CF_NODE, newCfNode, newCfNode));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<CFVariable> getConstructedVariables()
   {
      if (constructedVariables == null)
      {
         constructedVariables = new EObjectWithInverseResolvingEList<CFVariable>(CFVariable.class, this, DemoclesPackage.ACTION__CONSTRUCTED_VARIABLES,
               DemoclesPackage.CF_VARIABLE__CONSTRUCTOR);
      }
      return constructedVariables;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Action getNext()
   {
      if (next != null && next.eIsProxy())
      {
         InternalEObject oldNext = (InternalEObject) next;
         next = (Action) eResolveProxy(oldNext);
         if (next != oldNext)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, DemoclesPackage.ACTION__NEXT, oldNext, next));
         }
      }
      return next;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Action basicGetNext()
   {
      return next;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetNext(Action newNext, NotificationChain msgs)
   {
      Action oldNext = next;
      next = newNext;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemoclesPackage.ACTION__NEXT, oldNext, newNext);
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
   public void setNext(Action newNext)
   {
      if (newNext != next)
      {
         NotificationChain msgs = null;
         if (next != null)
            msgs = ((InternalEObject) next).eInverseRemove(this, DemoclesPackage.ACTION__PREV, Action.class, msgs);
         if (newNext != null)
            msgs = ((InternalEObject) newNext).eInverseAdd(this, DemoclesPackage.ACTION__PREV, Action.class, msgs);
         msgs = basicSetNext(newNext, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DemoclesPackage.ACTION__NEXT, newNext, newNext));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Action getPrev()
   {
      if (prev != null && prev.eIsProxy())
      {
         InternalEObject oldPrev = (InternalEObject) prev;
         prev = (Action) eResolveProxy(oldPrev);
         if (prev != oldPrev)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, DemoclesPackage.ACTION__PREV, oldPrev, prev));
         }
      }
      return prev;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Action basicGetPrev()
   {
      return prev;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetPrev(Action newPrev, NotificationChain msgs)
   {
      Action oldPrev = prev;
      prev = newPrev;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemoclesPackage.ACTION__PREV, oldPrev, newPrev);
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
   public void setPrev(Action newPrev)
   {
      if (newPrev != prev)
      {
         NotificationChain msgs = null;
         if (prev != null)
            msgs = ((InternalEObject) prev).eInverseRemove(this, DemoclesPackage.ACTION__NEXT, Action.class, msgs);
         if (newPrev != null)
            msgs = ((InternalEObject) newPrev).eInverseAdd(this, DemoclesPackage.ACTION__NEXT, Action.class, msgs);
         msgs = basicSetPrev(newPrev, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DemoclesPackage.ACTION__PREV, newPrev, newPrev));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean hasReferencedFreeParameters()
   {// 
      return ActionImpl.pattern_Action_0_2_expressionF();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
      case DemoclesPackage.ACTION__REASSIGNED_VARIABLES:
         return ((InternalEList<InternalEObject>) (InternalEList<?>) getReassignedVariables()).basicAdd(otherEnd, msgs);
      case DemoclesPackage.ACTION__CF_NODE:
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         return basicSetCfNode((CFNode) otherEnd, msgs);
      case DemoclesPackage.ACTION__CONSTRUCTED_VARIABLES:
         return ((InternalEList<InternalEObject>) (InternalEList<?>) getConstructedVariables()).basicAdd(otherEnd, msgs);
      case DemoclesPackage.ACTION__NEXT:
         if (next != null)
            msgs = ((InternalEObject) next).eInverseRemove(this, DemoclesPackage.ACTION__PREV, Action.class, msgs);
         return basicSetNext((Action) otherEnd, msgs);
      case DemoclesPackage.ACTION__PREV:
         if (prev != null)
            msgs = ((InternalEObject) prev).eInverseRemove(this, DemoclesPackage.ACTION__NEXT, Action.class, msgs);
         return basicSetPrev((Action) otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
      case DemoclesPackage.ACTION__REASSIGNED_VARIABLES:
         return ((InternalEList<?>) getReassignedVariables()).basicRemove(otherEnd, msgs);
      case DemoclesPackage.ACTION__CF_NODE:
         return basicSetCfNode(null, msgs);
      case DemoclesPackage.ACTION__CONSTRUCTED_VARIABLES:
         return ((InternalEList<?>) getConstructedVariables()).basicRemove(otherEnd, msgs);
      case DemoclesPackage.ACTION__NEXT:
         return basicSetNext(null, msgs);
      case DemoclesPackage.ACTION__PREV:
         return basicSetPrev(null, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
   {
      switch (eContainerFeatureID())
      {
      case DemoclesPackage.ACTION__CF_NODE:
         return eInternalContainer().eInverseRemove(this, DemoclesPackage.CF_NODE__ACTIONS, CFNode.class, msgs);
      }
      return super.eBasicRemoveFromContainerFeature(msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
      case DemoclesPackage.ACTION__REASSIGNED_VARIABLES:
         return getReassignedVariables();
      case DemoclesPackage.ACTION__CF_NODE:
         return getCfNode();
      case DemoclesPackage.ACTION__CONSTRUCTED_VARIABLES:
         return getConstructedVariables();
      case DemoclesPackage.ACTION__NEXT:
         if (resolve)
            return getNext();
         return basicGetNext();
      case DemoclesPackage.ACTION__PREV:
         if (resolve)
            return getPrev();
         return basicGetPrev();
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
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
      case DemoclesPackage.ACTION__REASSIGNED_VARIABLES:
         getReassignedVariables().clear();
         getReassignedVariables().addAll((Collection<? extends CFVariable>) newValue);
         return;
      case DemoclesPackage.ACTION__CF_NODE:
         setCfNode((CFNode) newValue);
         return;
      case DemoclesPackage.ACTION__CONSTRUCTED_VARIABLES:
         getConstructedVariables().clear();
         getConstructedVariables().addAll((Collection<? extends CFVariable>) newValue);
         return;
      case DemoclesPackage.ACTION__NEXT:
         setNext((Action) newValue);
         return;
      case DemoclesPackage.ACTION__PREV:
         setPrev((Action) newValue);
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
   public void eUnset(int featureID)
   {
      switch (featureID)
      {
      case DemoclesPackage.ACTION__REASSIGNED_VARIABLES:
         getReassignedVariables().clear();
         return;
      case DemoclesPackage.ACTION__CF_NODE:
         setCfNode((CFNode) null);
         return;
      case DemoclesPackage.ACTION__CONSTRUCTED_VARIABLES:
         getConstructedVariables().clear();
         return;
      case DemoclesPackage.ACTION__NEXT:
         setNext((Action) null);
         return;
      case DemoclesPackage.ACTION__PREV:
         setPrev((Action) null);
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
   public boolean eIsSet(int featureID)
   {
      switch (featureID)
      {
      case DemoclesPackage.ACTION__REASSIGNED_VARIABLES:
         return reassignedVariables != null && !reassignedVariables.isEmpty();
      case DemoclesPackage.ACTION__CF_NODE:
         return getCfNode() != null;
      case DemoclesPackage.ACTION__CONSTRUCTED_VARIABLES:
         return constructedVariables != null && !constructedVariables.isEmpty();
      case DemoclesPackage.ACTION__NEXT:
         return next != null;
      case DemoclesPackage.ACTION__PREV:
         return prev != null;
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
   {
      switch (operationID)
      {
      case DemoclesPackage.ACTION___HAS_REFERENCED_FREE_PARAMETERS:
         return hasReferencedFreeParameters();
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final boolean pattern_Action_0_2_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   // <-- [user code injected with eMoflon]

   @Override
   public String toString()
   {
      return "ActionImpl [reassignedVariables=" + reassignedVariables + ", constructedVariables=" + constructedVariables;
      //+ ", next=" + n + ", prev=" + p + "]";
   }

   // [user code injected with eMoflon] -->
} //ActionImpl
