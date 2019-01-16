/**
 */
package org.moflon.tie.gt.controlflow.democles.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.moflon.tie.gt.controlflow.democles.CFNode;
import org.moflon.tie.gt.controlflow.democles.DemoclesPackage;
import org.moflon.tie.gt.controlflow.democles.HeadControlledLoop;
import org.moflon.tie.gt.controlflow.democles.Scope;
import org.moflon.tie.gt.controlflow.democles.Visitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Head Controlled Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HeadControlledLoopImpl extends LoopImpl implements HeadControlledLoop
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected HeadControlledLoopImpl()
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
      return DemoclesPackage.Literals.HEAD_CONTROLLED_LOOP;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void accept(Visitor visitor)
   {

      Object[] result1_black = HeadControlledLoopImpl.pattern_HeadControlledLoop_0_1_LookupThisObject_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      // 
      HeadControlledLoopImpl.pattern_HeadControlledLoop_0_2_VisitHeadControlledLoop_expressionBB(visitor, this);
      // 
      Object[] result3_black = HeadControlledLoopImpl.pattern_HeadControlledLoop_0_3_LookupLoopBodyScope_blackBF(this);
      if (result3_black != null)
      {
         Scope loopBodyScope = (Scope) result3_black[1];
         // 
         HeadControlledLoopImpl.pattern_HeadControlledLoop_0_4_TraverseLoopBodyScope_expressionBB(loopBodyScope, visitor);

      } else
      {
      }
      // 
      Object[] result5_black = HeadControlledLoopImpl.pattern_HeadControlledLoop_0_5_LookupNextNode_blackFB(this);
      if (result5_black != null)
      {
         CFNode nextNode = (CFNode) result5_black[0];
         // 
         HeadControlledLoopImpl.pattern_HeadControlledLoop_0_6_TraverseNextNode_expressionBB(nextNode, visitor);

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
      case DemoclesPackage.HEAD_CONTROLLED_LOOP___ACCEPT__VISITOR:
         accept((Visitor) arguments.get(0));
         return null;
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_HeadControlledLoop_0_1_LookupThisObject_blackB(HeadControlledLoop _this)
   {
      return new Object[] { _this };
   }

   public static final void pattern_HeadControlledLoop_0_2_VisitHeadControlledLoop_expressionBB(Visitor visitor, HeadControlledLoop _this)
   {
      visitor.visitHeadControlledLoop(_this);

   }

   public static final Object[] pattern_HeadControlledLoop_0_3_LookupLoopBodyScope_blackBF(HeadControlledLoop _this)
   {
      for (Scope loopBodyScope : _this.getScopes())
      {
         return new Object[] { _this, loopBodyScope };
      }
      return null;
   }

   public static final void pattern_HeadControlledLoop_0_4_TraverseLoopBodyScope_expressionBB(Scope loopBodyScope, Visitor visitor)
   {
      loopBodyScope.accept(visitor);

   }

   public static final Object[] pattern_HeadControlledLoop_0_5_LookupNextNode_blackFB(HeadControlledLoop _this)
   {
      CFNode nextNode = _this.getNext();
      if (nextNode != null)
      {
         if (!nextNode.equals(_this))
         {
            return new Object[] { nextNode, _this };
         }
      }

      return null;
   }

   public static final void pattern_HeadControlledLoop_0_6_TraverseNextNode_expressionBB(CFNode nextNode, Visitor visitor)
   {
      nextNode.accept(visitor);

   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //HeadControlledLoopImpl
