/**
 */
package org.moflon.sdm.compiler.democles.pattern.impl;

import SDMLanguage.expressions.Expression;

import SDMLanguage.patterns.BindingOperator;
import SDMLanguage.patterns.LinkVariable;
import SDMLanguage.patterns.ObjectVariable;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gervarro.democles.specification.emf.Pattern;

import org.moflon.sdm.compiler.democles.pattern.PatternPackage;
import org.moflon.sdm.compiler.democles.pattern.RedPatternTransformer;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Red Pattern Transformer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RedPatternTransformerImpl extends PatternTransformerImpl implements RedPatternTransformer
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected RedPatternTransformerImpl()
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
      return PatternPackage.Literals.RED_PATTERN_TRANSFORMER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isLinkToAdd(LinkVariable linkVariable, Pattern pattern)
   {// 
      Object[] result1_black = RedPatternTransformerImpl.pattern_RedPatternTransformer_0_1_IsLinkRed_blackB(linkVariable);
      if (result1_black != null)
      {
         return RedPatternTransformerImpl.pattern_RedPatternTransformer_0_2_expressionF();
      } else
      {
         return RedPatternTransformerImpl.pattern_RedPatternTransformer_0_3_expressionF();
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isVariableToAdd(ObjectVariable objectVariable)
   {// 
      Object[] result1_black = RedPatternTransformerImpl.pattern_RedPatternTransformer_1_1_HasBindingExpression_blackFB(objectVariable);
      if (result1_black != null)
      {
         //nothing Expression binding = (Expression) result1_black[0];
         return RedPatternTransformerImpl.pattern_RedPatternTransformer_1_2_expressionF();
      } else
      {
         // 
         Object[] result3_black = RedPatternTransformerImpl.pattern_RedPatternTransformer_1_3_isVariableRed_blackB(objectVariable);
         if (result3_black != null)
         {
            return RedPatternTransformerImpl.pattern_RedPatternTransformer_1_4_expressionF();
         } else
         {
            // 
            Object[] result5_black = RedPatternTransformerImpl.pattern_RedPatternTransformer_1_5_HasIncomingRedLink_blackBF(objectVariable);
            if (result5_black != null)
            {
               //nothing LinkVariable incomingLink = (LinkVariable) result5_black[1];
               return RedPatternTransformerImpl.pattern_RedPatternTransformer_1_6_expressionF();
            } else
            {
               // 
               Object[] result7_black = RedPatternTransformerImpl.pattern_RedPatternTransformer_1_7_HasOutgoingRedLink_blackBF(objectVariable);
               if (result7_black != null)
               {
                  //nothing LinkVariable outgoingLink = (LinkVariable) result7_black[1];
                  return RedPatternTransformerImpl.pattern_RedPatternTransformer_1_8_expressionF();
               } else
               {
                  return RedPatternTransformerImpl.pattern_RedPatternTransformer_1_9_expressionF();
               }

            }

         }

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
      case PatternPackage.RED_PATTERN_TRANSFORMER___IS_LINK_TO_ADD__LINKVARIABLE_PATTERN:
         return isLinkToAdd((LinkVariable) arguments.get(0), (Pattern) arguments.get(1));
      case PatternPackage.RED_PATTERN_TRANSFORMER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE:
         return isVariableToAdd((ObjectVariable) arguments.get(0));
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_RedPatternTransformer_0_1_IsLinkRed_blackB(LinkVariable linkVariable)
   {
      BindingOperator linkVariable_bindingOperator = linkVariable.getBindingOperator();
      if (linkVariable_bindingOperator.equals(BindingOperator.DESTROY))
      {
         return new Object[] { linkVariable };
      }

      return null;
   }

   public static final boolean pattern_RedPatternTransformer_0_2_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final boolean pattern_RedPatternTransformer_0_3_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final Object[] pattern_RedPatternTransformer_1_1_HasBindingExpression_blackFB(ObjectVariable objectVariable)
   {
      Expression binding = objectVariable.getBindingExpression();
      if (binding != null)
      {
         return new Object[] { binding, objectVariable };
      }

      return null;
   }

   public static final boolean pattern_RedPatternTransformer_1_2_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final Object[] pattern_RedPatternTransformer_1_3_isVariableRed_blackB(ObjectVariable objectVariable)
   {
      BindingOperator objectVariable_bindingOperator = objectVariable.getBindingOperator();
      if (objectVariable_bindingOperator.equals(BindingOperator.DESTROY))
      {
         return new Object[] { objectVariable };
      }

      return null;
   }

   public static final boolean pattern_RedPatternTransformer_1_4_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final Object[] pattern_RedPatternTransformer_1_5_HasIncomingRedLink_blackBF(ObjectVariable objectVariable)
   {
      for (LinkVariable incomingLink : objectVariable.getIncomingLink())
      {
         BindingOperator incomingLink_bindingOperator = incomingLink.getBindingOperator();
         if (incomingLink_bindingOperator.equals(BindingOperator.DESTROY))
         {
            return new Object[] { objectVariable, incomingLink };
         }

      }
      return null;
   }

   public static final boolean pattern_RedPatternTransformer_1_6_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final Object[] pattern_RedPatternTransformer_1_7_HasOutgoingRedLink_blackBF(ObjectVariable objectVariable)
   {
      for (LinkVariable outgoingLink : objectVariable.getOutgoingLink())
      {
         BindingOperator outgoingLink_bindingOperator = outgoingLink.getBindingOperator();
         if (outgoingLink_bindingOperator.equals(BindingOperator.DESTROY))
         {
            return new Object[] { objectVariable, outgoingLink };
         }

      }
      return null;
   }

   public static final boolean pattern_RedPatternTransformer_1_8_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final boolean pattern_RedPatternTransformer_1_9_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //RedPatternTransformerImpl
