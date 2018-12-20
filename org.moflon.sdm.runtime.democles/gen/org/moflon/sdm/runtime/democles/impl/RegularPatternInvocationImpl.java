/**
 */
package org.moflon.sdm.runtime.democles.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.DemoclesPackage;
import org.moflon.sdm.runtime.democles.ForEach;
import org.moflon.sdm.runtime.democles.RegularPatternInvocation;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regular Pattern Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RegularPatternInvocationImpl extends PatternInvocationImpl implements RegularPatternInvocation
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected RegularPatternInvocationImpl()
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
      return DemoclesPackage.Literals.REGULAR_PATTERN_INVOCATION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isMultipleMatch()
   {// 
      Object[] result1_black = RegularPatternInvocationImpl.pattern_RegularPatternInvocation_0_1_IsContainedInForEachNode_blackFB(this);
      if (result1_black != null)
      {
         //nothing ForEach forEach = (ForEach) result1_black[0];
         return RegularPatternInvocationImpl.pattern_RegularPatternInvocation_0_2_expressionF();
      } else
      {
         return RegularPatternInvocationImpl.pattern_RegularPatternInvocation_0_3_expressionF();
      }

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
      case DemoclesPackage.REGULAR_PATTERN_INVOCATION___IS_MULTIPLE_MATCH:
         return isMultipleMatch();
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_RegularPatternInvocation_0_1_IsContainedInForEachNode_blackFB(RegularPatternInvocation _this)
   {
      CFNode tmpForEach = _this.getCfNode();
      if (tmpForEach instanceof ForEach)
      {
         ForEach forEach = (ForEach) tmpForEach;
         if (_this.equals(forEach.getMainAction()))
         {
            return new Object[] { forEach, _this };
         }
      }

      return null;
   }

   public static final boolean pattern_RegularPatternInvocation_0_2_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final boolean pattern_RegularPatternInvocation_0_3_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //RegularPatternInvocationImpl
