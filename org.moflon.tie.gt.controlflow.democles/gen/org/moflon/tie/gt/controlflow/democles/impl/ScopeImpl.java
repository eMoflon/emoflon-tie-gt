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
import org.moflon.tie.gt.controlflow.democles.CFNode;
import org.moflon.tie.gt.controlflow.democles.CFVariable;
import org.moflon.tie.gt.controlflow.democles.CompoundNode;
import org.moflon.tie.gt.controlflow.democles.DemoclesPackage;
import org.moflon.tie.gt.controlflow.democles.Scope;
import org.moflon.tie.gt.controlflow.democles.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.tie.gt.controlflow.democles.impl.ScopeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.moflon.tie.gt.controlflow.democles.impl.ScopeImpl#getNextScope <em>Next Scope</em>}</li>
 *   <li>{@link org.moflon.tie.gt.controlflow.democles.impl.ScopeImpl#getPreviousScope <em>Previous Scope</em>}</li>
 *   <li>{@link org.moflon.tie.gt.controlflow.democles.impl.ScopeImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link org.moflon.tie.gt.controlflow.democles.impl.ScopeImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScopeImpl extends EObjectImpl implements Scope
{
   /**
    * The cached value of the '{@link #getNextScope() <em>Next Scope</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getNextScope()
    * @generated
    * @ordered
    */
   protected Scope nextScope;

   /**
    * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getContents()
    * @generated
    * @ordered
    */
   protected EList<CFNode> contents;

   /**
    * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getVariables()
    * @generated
    * @ordered
    */
   protected EList<CFVariable> variables;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ScopeImpl()
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
      return DemoclesPackage.Literals.SCOPE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CompoundNode getParent()
   {
      if (eContainerFeatureID() != DemoclesPackage.SCOPE__PARENT)
         return null;
      return (CompoundNode) eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetParent(CompoundNode newParent, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newParent, DemoclesPackage.SCOPE__PARENT, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setParent(CompoundNode newParent)
   {
      if (newParent != eInternalContainer() || (eContainerFeatureID() != DemoclesPackage.SCOPE__PARENT && newParent != null))
      {
         if (EcoreUtil.isAncestor(this, newParent))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newParent != null)
            msgs = ((InternalEObject) newParent).eInverseAdd(this, DemoclesPackage.COMPOUND_NODE__SCOPES, CompoundNode.class, msgs);
         msgs = basicSetParent(newParent, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DemoclesPackage.SCOPE__PARENT, newParent, newParent));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Scope getNextScope()
   {
      return nextScope;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetNextScope(Scope newNextScope, NotificationChain msgs)
   {
      Scope oldNextScope = nextScope;
      nextScope = newNextScope;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemoclesPackage.SCOPE__NEXT_SCOPE, oldNextScope, newNextScope);
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
   public void setNextScope(Scope newNextScope)
   {
      if (newNextScope != nextScope)
      {
         NotificationChain msgs = null;
         if (nextScope != null)
            msgs = ((InternalEObject) nextScope).eInverseRemove(this, DemoclesPackage.SCOPE__PREVIOUS_SCOPE, Scope.class, msgs);
         if (newNextScope != null)
            msgs = ((InternalEObject) newNextScope).eInverseAdd(this, DemoclesPackage.SCOPE__PREVIOUS_SCOPE, Scope.class, msgs);
         msgs = basicSetNextScope(newNextScope, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DemoclesPackage.SCOPE__NEXT_SCOPE, newNextScope, newNextScope));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Scope getPreviousScope()
   {
      if (eContainerFeatureID() != DemoclesPackage.SCOPE__PREVIOUS_SCOPE)
         return null;
      return (Scope) eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetPreviousScope(Scope newPreviousScope, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newPreviousScope, DemoclesPackage.SCOPE__PREVIOUS_SCOPE, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setPreviousScope(Scope newPreviousScope)
   {
      if (newPreviousScope != eInternalContainer() || (eContainerFeatureID() != DemoclesPackage.SCOPE__PREVIOUS_SCOPE && newPreviousScope != null))
      {
         if (EcoreUtil.isAncestor(this, newPreviousScope))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newPreviousScope != null)
            msgs = ((InternalEObject) newPreviousScope).eInverseAdd(this, DemoclesPackage.SCOPE__NEXT_SCOPE, Scope.class, msgs);
         msgs = basicSetPreviousScope(newPreviousScope, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DemoclesPackage.SCOPE__PREVIOUS_SCOPE, newPreviousScope, newPreviousScope));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<CFNode> getContents()
   {
      if (contents == null)
      {
         contents = new EObjectContainmentWithInverseEList<CFNode>(CFNode.class, this, DemoclesPackage.SCOPE__CONTENTS, DemoclesPackage.CF_NODE__SCOPE);
      }
      return contents;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<CFVariable> getVariables()
   {
      if (variables == null)
      {
         variables = new EObjectContainmentWithInverseEList<CFVariable>(CFVariable.class, this, DemoclesPackage.SCOPE__VARIABLES,
               DemoclesPackage.CF_VARIABLE__SCOPE);
      }
      return variables;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void accept(Visitor visitor)
   {

      Object[] result1_black = ScopeImpl.pattern_Scope_0_1_LookupThisObject_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      // 
      ScopeImpl.pattern_Scope_0_2_VisitScope_expressionBB(visitor, this);
      // 
      Object[] result3_black = ScopeImpl.pattern_Scope_0_3_LookupFirstNode_blackBF(this);
      if (result3_black != null)
      {
         CFNode node = (CFNode) result3_black[1];
         // 
         ScopeImpl.pattern_Scope_0_4_TraverseScopeContent_expressionBB(node, visitor);

      } else
      {
      }
      return;
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
      case DemoclesPackage.SCOPE__PARENT:
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         return basicSetParent((CompoundNode) otherEnd, msgs);
      case DemoclesPackage.SCOPE__NEXT_SCOPE:
         if (nextScope != null)
            msgs = ((InternalEObject) nextScope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DemoclesPackage.SCOPE__NEXT_SCOPE, null, msgs);
         return basicSetNextScope((Scope) otherEnd, msgs);
      case DemoclesPackage.SCOPE__PREVIOUS_SCOPE:
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         return basicSetPreviousScope((Scope) otherEnd, msgs);
      case DemoclesPackage.SCOPE__CONTENTS:
         return ((InternalEList<InternalEObject>) (InternalEList<?>) getContents()).basicAdd(otherEnd, msgs);
      case DemoclesPackage.SCOPE__VARIABLES:
         return ((InternalEList<InternalEObject>) (InternalEList<?>) getVariables()).basicAdd(otherEnd, msgs);
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
      case DemoclesPackage.SCOPE__PARENT:
         return basicSetParent(null, msgs);
      case DemoclesPackage.SCOPE__NEXT_SCOPE:
         return basicSetNextScope(null, msgs);
      case DemoclesPackage.SCOPE__PREVIOUS_SCOPE:
         return basicSetPreviousScope(null, msgs);
      case DemoclesPackage.SCOPE__CONTENTS:
         return ((InternalEList<?>) getContents()).basicRemove(otherEnd, msgs);
      case DemoclesPackage.SCOPE__VARIABLES:
         return ((InternalEList<?>) getVariables()).basicRemove(otherEnd, msgs);
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
      case DemoclesPackage.SCOPE__PARENT:
         return eInternalContainer().eInverseRemove(this, DemoclesPackage.COMPOUND_NODE__SCOPES, CompoundNode.class, msgs);
      case DemoclesPackage.SCOPE__PREVIOUS_SCOPE:
         return eInternalContainer().eInverseRemove(this, DemoclesPackage.SCOPE__NEXT_SCOPE, Scope.class, msgs);
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
      case DemoclesPackage.SCOPE__PARENT:
         return getParent();
      case DemoclesPackage.SCOPE__NEXT_SCOPE:
         return getNextScope();
      case DemoclesPackage.SCOPE__PREVIOUS_SCOPE:
         return getPreviousScope();
      case DemoclesPackage.SCOPE__CONTENTS:
         return getContents();
      case DemoclesPackage.SCOPE__VARIABLES:
         return getVariables();
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
      case DemoclesPackage.SCOPE__PARENT:
         setParent((CompoundNode) newValue);
         return;
      case DemoclesPackage.SCOPE__NEXT_SCOPE:
         setNextScope((Scope) newValue);
         return;
      case DemoclesPackage.SCOPE__PREVIOUS_SCOPE:
         setPreviousScope((Scope) newValue);
         return;
      case DemoclesPackage.SCOPE__CONTENTS:
         getContents().clear();
         getContents().addAll((Collection<? extends CFNode>) newValue);
         return;
      case DemoclesPackage.SCOPE__VARIABLES:
         getVariables().clear();
         getVariables().addAll((Collection<? extends CFVariable>) newValue);
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
      case DemoclesPackage.SCOPE__PARENT:
         setParent((CompoundNode) null);
         return;
      case DemoclesPackage.SCOPE__NEXT_SCOPE:
         setNextScope((Scope) null);
         return;
      case DemoclesPackage.SCOPE__PREVIOUS_SCOPE:
         setPreviousScope((Scope) null);
         return;
      case DemoclesPackage.SCOPE__CONTENTS:
         getContents().clear();
         return;
      case DemoclesPackage.SCOPE__VARIABLES:
         getVariables().clear();
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
      case DemoclesPackage.SCOPE__PARENT:
         return getParent() != null;
      case DemoclesPackage.SCOPE__NEXT_SCOPE:
         return nextScope != null;
      case DemoclesPackage.SCOPE__PREVIOUS_SCOPE:
         return getPreviousScope() != null;
      case DemoclesPackage.SCOPE__CONTENTS:
         return contents != null && !contents.isEmpty();
      case DemoclesPackage.SCOPE__VARIABLES:
         return variables != null && !variables.isEmpty();
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
      case DemoclesPackage.SCOPE___ACCEPT__VISITOR:
         accept((Visitor) arguments.get(0));
         return null;
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_Scope_0_1_LookupThisObject_blackB(Scope _this)
   {
      return new Object[] { _this };
   }

   public static final void pattern_Scope_0_2_VisitScope_expressionBB(Visitor visitor, Scope _this)
   {
      visitor.visitScope(_this);

   }

   public static final Object[] pattern_Scope_0_3_LookupFirstNode_black_nac_0B(CFNode node)
   {
      CFNode previousNode = node.getPrev();
      if (previousNode != null)
      {
         if (!node.equals(previousNode))
         {
            return new Object[] { node };
         }
      }

      return null;
   }

   public static final Object[] pattern_Scope_0_3_LookupFirstNode_blackBF(Scope _this)
   {
      for (CFNode node : _this.getContents())
      {
         if (pattern_Scope_0_3_LookupFirstNode_black_nac_0B(node) == null)
         {
            return new Object[] { _this, node };
         }
      }
      return null;
   }

   public static final void pattern_Scope_0_4_TraverseScopeContent_expressionBB(CFNode node, Visitor visitor)
   {
      node.accept(visitor);

   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //ScopeImpl
