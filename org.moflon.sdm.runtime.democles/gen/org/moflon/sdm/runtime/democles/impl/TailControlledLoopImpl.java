/**
 */
package org.moflon.sdm.runtime.democles.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.DemoclesPackage;
import org.moflon.sdm.runtime.democles.Scope;
import org.moflon.sdm.runtime.democles.TailControlledLoop;
import org.moflon.sdm.runtime.democles.Visitor;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tail Controlled Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TailControlledLoopImpl extends LoopImpl implements TailControlledLoop
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected TailControlledLoopImpl()
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
      return DemoclesPackage.Literals.TAIL_CONTROLLED_LOOP;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void accept(Visitor visitor)
   {// 
      Object[] result1_black = TailControlledLoopImpl.pattern_TailControlledLoop_0_1_LookupLoopBodyScope_blackBF(this);
      if (result1_black != null)
      {
         Scope loopBodyScope = (Scope) result1_black[1];
         // 
         TailControlledLoopImpl.pattern_TailControlledLoop_0_2_TraverseLoopBodyScope_expressionBB(loopBodyScope, visitor);

      } else
      {
      }
      // 
      TailControlledLoopImpl.pattern_TailControlledLoop_0_3_VisitTailControlledLoop_expressionBB(visitor, this);
      // 
      Object[] result4_black = TailControlledLoopImpl.pattern_TailControlledLoop_0_4_LookupNextNode_blackBF(this);
      if (result4_black != null)
      {
         CFNode nextNode = (CFNode) result4_black[1];
         // 
         TailControlledLoopImpl.pattern_TailControlledLoop_0_5_TraverseNextNode_expressionBB(nextNode, visitor);

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
   @Override
   public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
   {
      switch (operationID)
      {
      case DemoclesPackage.TAIL_CONTROLLED_LOOP___ACCEPT__VISITOR:
         accept((Visitor) arguments.get(0));
         return null;
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_TailControlledLoop_0_1_LookupLoopBodyScope_blackBF(TailControlledLoop _this)
   {
      for (Scope loopBodyScope : _this.getScopes())
      {
         return new Object[] { _this, loopBodyScope };
      }
      return null;
   }

   public static final void pattern_TailControlledLoop_0_2_TraverseLoopBodyScope_expressionBB(Scope loopBodyScope, Visitor visitor)
   {
      loopBodyScope.accept(visitor);

   }

   public static final void pattern_TailControlledLoop_0_3_VisitTailControlledLoop_expressionBB(Visitor visitor, TailControlledLoop _this)
   {
      visitor.visitTailControlledLoop(_this);

   }

   public static final Object[] pattern_TailControlledLoop_0_4_LookupNextNode_blackBF(TailControlledLoop _this)
   {
      CFNode nextNode = _this.getNext();
      if (nextNode != null)
      {
         if (!nextNode.equals(_this))
         {
            return new Object[] { _this, nextNode };
         }
      }

      return null;
   }

   public static final void pattern_TailControlledLoop_0_5_TraverseNextNode_expressionBB(CFNode nextNode, Visitor visitor)
   {
      nextNode.accept(visitor);

   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //TailControlledLoopImpl
