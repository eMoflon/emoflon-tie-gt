/**
 */
package org.moflon.sdm.runtime.democles.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.DemoclesPackage;
import org.moflon.sdm.runtime.democles.ForEach;
import org.moflon.sdm.runtime.democles.Scope;
import org.moflon.sdm.runtime.democles.Visitor;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Each</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ForEachImpl extends RepetitionNodeImpl implements ForEach
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ForEachImpl()
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
      return DemoclesPackage.Literals.FOR_EACH;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void accept(Visitor visitor)
   {

      Object[] result1_black = ForEachImpl.pattern_ForEach_0_1_LookupThisObject_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      // 
      ForEachImpl.pattern_ForEach_0_2_VisitForEachNode_expressionBB(visitor, this);
      // 
      Object[] result3_black = ForEachImpl.pattern_ForEach_0_3_LookupForEachScope_blackFB(this);
      if (result3_black != null)
      {
         Scope forEachScope = (Scope) result3_black[0];
         // 
         ForEachImpl.pattern_ForEach_0_4_TraverseForEachScope_expressionBB(forEachScope, visitor);

      } else
      {
      }
      // 
      Object[] result5_black = ForEachImpl.pattern_ForEach_0_5_LookupNextNode_blackBF(this);
      if (result5_black != null)
      {
         CFNode nextNode = (CFNode) result5_black[1];
         // 
         ForEachImpl.pattern_ForEach_0_6_TraverseNextNode_expressionBB(nextNode, visitor);

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
      case DemoclesPackage.FOR_EACH___ACCEPT__VISITOR:
         accept((Visitor) arguments.get(0));
         return null;
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_ForEach_0_1_LookupThisObject_blackB(ForEach _this)
   {
      return new Object[] { _this };
   }

   public static final void pattern_ForEach_0_2_VisitForEachNode_expressionBB(Visitor visitor, ForEach _this)
   {
      visitor.visitForEach(_this);

   }

   public static final Object[] pattern_ForEach_0_3_LookupForEachScope_blackFB(ForEach _this)
   {
      for (Scope forEachScope : _this.getScopes())
      {
         return new Object[] { forEachScope, _this };
      }
      return null;
   }

   public static final void pattern_ForEach_0_4_TraverseForEachScope_expressionBB(Scope forEachScope, Visitor visitor)
   {
      forEachScope.accept(visitor);

   }

   public static final Object[] pattern_ForEach_0_5_LookupNextNode_blackBF(ForEach _this)
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

   public static final void pattern_ForEach_0_6_TraverseNextNode_expressionBB(CFNode nextNode, Visitor visitor)
   {
      nextNode.accept(visitor);

   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //ForEachImpl
