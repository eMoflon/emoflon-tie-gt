/**
 */
package org.moflon.sdm.runtime.democles.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.ContinueStatement;
import org.moflon.sdm.runtime.democles.DemoclesPackage;
import org.moflon.sdm.runtime.democles.RepetitionNode;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repetition Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.runtime.democles.impl.RepetitionNodeImpl#getLastNodes <em>Last Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RepetitionNodeImpl extends CompoundNodeImpl implements RepetitionNode
{
   /**
    * The cached value of the '{@link #getLastNodes() <em>Last Nodes</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getLastNodes()
    * @generated
    * @ordered
    */
   protected EList<CFNode> lastNodes;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected RepetitionNodeImpl()
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
      return DemoclesPackage.Literals.REPETITION_NODE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<CFNode> getLastNodes()
   {
      if (lastNodes == null)
      {
         lastNodes = new EObjectWithInverseResolvingEList<CFNode>(CFNode.class, this, DemoclesPackage.REPETITION_NODE__LAST_NODES,
               DemoclesPackage.CF_NODE__HEADER);
      }
      return lastNodes;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean hasShortcuts()
   {// 
      Object[] result1_black = RepetitionNodeImpl.pattern_RepetitionNode_0_1_HasContinueStatementAsAShortcut_blackBF(this);
      if (result1_black != null)
      {
         //nothing ContinueStatement continueStatement = (ContinueStatement) result1_black[1];
         return RepetitionNodeImpl.pattern_RepetitionNode_0_2_expressionF();
      } else
      {
         return RepetitionNodeImpl.pattern_RepetitionNode_0_3_expressionF();
      }

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
      case DemoclesPackage.REPETITION_NODE__LAST_NODES:
         return ((InternalEList<InternalEObject>) (InternalEList<?>) getLastNodes()).basicAdd(otherEnd, msgs);
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
      case DemoclesPackage.REPETITION_NODE__LAST_NODES:
         return ((InternalEList<?>) getLastNodes()).basicRemove(otherEnd, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case DemoclesPackage.REPETITION_NODE__LAST_NODES:
         return getLastNodes();
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
      case DemoclesPackage.REPETITION_NODE__LAST_NODES:
         getLastNodes().clear();
         getLastNodes().addAll((Collection<? extends CFNode>) newValue);
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
      case DemoclesPackage.REPETITION_NODE__LAST_NODES:
         getLastNodes().clear();
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
      case DemoclesPackage.REPETITION_NODE__LAST_NODES:
         return lastNodes != null && !lastNodes.isEmpty();
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
      case DemoclesPackage.REPETITION_NODE___HAS_SHORTCUTS:
         return hasShortcuts();
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_RepetitionNode_0_1_HasContinueStatementAsAShortcut_blackBF(RepetitionNode _this)
   {
      for (CFNode tmpContinueStatement : _this.getLastNodes())
      {
         if (tmpContinueStatement instanceof ContinueStatement)
         {
            ContinueStatement continueStatement = (ContinueStatement) tmpContinueStatement;
            return new Object[] { _this, continueStatement };
         }
      }
      return null;
   }

   public static final boolean pattern_RepetitionNode_0_2_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final boolean pattern_RepetitionNode_0_3_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //RepetitionNodeImpl
