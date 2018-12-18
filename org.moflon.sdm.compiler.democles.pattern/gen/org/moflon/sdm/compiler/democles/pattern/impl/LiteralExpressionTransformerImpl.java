/**
 */
package org.moflon.sdm.compiler.democles.pattern.impl;

import SDMLanguage.expressions.Expression;
import SDMLanguage.expressions.LiteralExpression;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gervarro.democles.specification.emf.Constant;
import org.gervarro.democles.specification.emf.ConstraintVariable;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;

import org.moflon.sdm.compiler.democles.pattern.LiteralExpressionTransformer;
import org.moflon.sdm.compiler.democles.pattern.PatternPackage;
import org.moflon.sdm.compiler.democles.pattern.PatternVariableHandler;

import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;

import org.moflon.sdm.democles.literalexpressionsolver.ConstantTransformer;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Expression Transformer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.pattern.impl.LiteralExpressionTransformerImpl#getConstantTransformer <em>Constant Transformer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiteralExpressionTransformerImpl extends ExpressionTransformerImpl implements LiteralExpressionTransformer
{
   /**
    * The cached value of the '{@link #getConstantTransformer() <em>Constant Transformer</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getConstantTransformer()
    * @generated
    * @ordered
    */
   protected ConstantTransformer constantTransformer;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected LiteralExpressionTransformerImpl()
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
      return PatternPackage.Literals.LITERAL_EXPRESSION_TRANSFORMER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ConstantTransformer getConstantTransformer()
   {
      if (constantTransformer != null && constantTransformer.eIsProxy())
      {
         InternalEObject oldConstantTransformer = (InternalEObject) constantTransformer;
         constantTransformer = (ConstantTransformer) eResolveProxy(oldConstantTransformer);
         if (constantTransformer != oldConstantTransformer)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.LITERAL_EXPRESSION_TRANSFORMER__CONSTANT_TRANSFORMER,
                     oldConstantTransformer, constantTransformer));
         }
      }
      return constantTransformer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ConstantTransformer basicGetConstantTransformer()
   {
      return constantTransformer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setConstantTransformer(ConstantTransformer newConstantTransformer)
   {
      ConstantTransformer oldConstantTransformer = constantTransformer;
      constantTransformer = newConstantTransformer;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.LITERAL_EXPRESSION_TRANSFORMER__CONSTANT_TRANSFORMER, oldConstantTransformer,
               constantTransformer));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ConstraintVariable transformExpression(ValidationReport report, PatternVariableHandler patternVariableHandler, Expression expression, Pattern pattern,
         EClassifier expectedType)
   {// 
      Object[] result1_bindingAndBlack = LiteralExpressionTransformerImpl.pattern_LiteralExpressionTransformer_0_1_Init_bindingAndBlackBFFB(this, expression);
      if (result1_bindingAndBlack != null)
      {
         ConstantTransformer constantConverter = (ConstantTransformer) result1_bindingAndBlack[1];
         LiteralExpression literalExpression = (LiteralExpression) result1_bindingAndBlack[2];
         // 
         Object[] result2_bindingAndBlack = LiteralExpressionTransformerImpl
               .pattern_LiteralExpressionTransformer_0_2_CreateConstant_bindingAndBlackFBBB(constantConverter, literalExpression, expectedType);
         if (result2_bindingAndBlack != null)
         {
            Constant constant = (Constant) result2_bindingAndBlack[0];
            // 
            Object[] result3_black = LiteralExpressionTransformerImpl.pattern_LiteralExpressionTransformer_0_3_AddConstant_blackBFB(constant, pattern);
            if (result3_black != null)
            {
               PatternBody patternBody = (PatternBody) result3_black[1];
               LiteralExpressionTransformerImpl.pattern_LiteralExpressionTransformer_0_3_AddConstant_greenBB(constant, patternBody);

               return LiteralExpressionTransformerImpl.pattern_LiteralExpressionTransformer_0_4_expressionFB(constant);
            } else
            {
            }

         } else
         {
         }

      } else
      {
      }
      return LiteralExpressionTransformerImpl.pattern_LiteralExpressionTransformer_0_5_expressionF();
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
      case PatternPackage.LITERAL_EXPRESSION_TRANSFORMER__CONSTANT_TRANSFORMER:
         if (resolve)
            return getConstantTransformer();
         return basicGetConstantTransformer();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
      case PatternPackage.LITERAL_EXPRESSION_TRANSFORMER__CONSTANT_TRANSFORMER:
         setConstantTransformer((ConstantTransformer) newValue);
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
      case PatternPackage.LITERAL_EXPRESSION_TRANSFORMER__CONSTANT_TRANSFORMER:
         setConstantTransformer((ConstantTransformer) null);
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
      case PatternPackage.LITERAL_EXPRESSION_TRANSFORMER__CONSTANT_TRANSFORMER:
         return constantTransformer != null;
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
      case PatternPackage.LITERAL_EXPRESSION_TRANSFORMER___TRANSFORM_EXPRESSION__VALIDATIONREPORT_PATTERNVARIABLEHANDLER_EXPRESSION_PATTERN_ECLASSIFIER:
         return transformExpression((ValidationReport) arguments.get(0), (PatternVariableHandler) arguments.get(1), (Expression) arguments.get(2),
               (Pattern) arguments.get(3), (EClassifier) arguments.get(4));
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_LiteralExpressionTransformer_0_1_Init_bindingFB(Expression expression)
   {
      Expression tmpLiteralExpression = expression;
      if (tmpLiteralExpression instanceof LiteralExpression)
      {
         LiteralExpression literalExpression = (LiteralExpression) tmpLiteralExpression;
         return new Object[] { literalExpression, expression };
      }
      return null;
   }

   public static final Object[] pattern_LiteralExpressionTransformer_0_1_Init_blackBFB(LiteralExpressionTransformer _this, LiteralExpression literalExpression)
   {
      ConstantTransformer constantConverter = _this.getConstantTransformer();
      if (constantConverter != null)
      {
         return new Object[] { _this, constantConverter, literalExpression };
      }

      return null;
   }

   public static final Object[] pattern_LiteralExpressionTransformer_0_1_Init_bindingAndBlackBFFB(LiteralExpressionTransformer _this, Expression expression)
   {
      Object[] result_pattern_LiteralExpressionTransformer_0_1_Init_binding = pattern_LiteralExpressionTransformer_0_1_Init_bindingFB(expression);
      if (result_pattern_LiteralExpressionTransformer_0_1_Init_binding != null)
      {
         LiteralExpression literalExpression = (LiteralExpression) result_pattern_LiteralExpressionTransformer_0_1_Init_binding[0];

         Object[] result_pattern_LiteralExpressionTransformer_0_1_Init_black = pattern_LiteralExpressionTransformer_0_1_Init_blackBFB(_this, literalExpression);
         if (result_pattern_LiteralExpressionTransformer_0_1_Init_black != null)
         {
            ConstantTransformer constantConverter = (ConstantTransformer) result_pattern_LiteralExpressionTransformer_0_1_Init_black[1];

            return new Object[] { _this, constantConverter, literalExpression, expression };
         }
      }
      return null;
   }

   public static final Object[] pattern_LiteralExpressionTransformer_0_2_CreateConstant_bindingFBBB(ConstantTransformer constantConverter,
         LiteralExpression literalExpression, EClassifier expectedType)
   {
      Constant _localVariable_0 = constantConverter.transformLiteralExpression(literalExpression, expectedType);
      Constant constant = _localVariable_0;
      if (constant != null)
      {
         return new Object[] { constant, constantConverter, literalExpression, expectedType };
      }
      return null;
   }

   public static final Object[] pattern_LiteralExpressionTransformer_0_2_CreateConstant_blackB(Constant constant)
   {
      return new Object[] { constant };
   }

   public static final Object[] pattern_LiteralExpressionTransformer_0_2_CreateConstant_bindingAndBlackFBBB(ConstantTransformer constantConverter,
         LiteralExpression literalExpression, EClassifier expectedType)
   {
      Object[] result_pattern_LiteralExpressionTransformer_0_2_CreateConstant_binding = pattern_LiteralExpressionTransformer_0_2_CreateConstant_bindingFBBB(
            constantConverter, literalExpression, expectedType);
      if (result_pattern_LiteralExpressionTransformer_0_2_CreateConstant_binding != null)
      {
         Constant constant = (Constant) result_pattern_LiteralExpressionTransformer_0_2_CreateConstant_binding[0];

         Object[] result_pattern_LiteralExpressionTransformer_0_2_CreateConstant_black = pattern_LiteralExpressionTransformer_0_2_CreateConstant_blackB(
               constant);
         if (result_pattern_LiteralExpressionTransformer_0_2_CreateConstant_black != null)
         {

            return new Object[] { constant, constantConverter, literalExpression, expectedType };
         }
      }
      return null;
   }

   public static final Object[] pattern_LiteralExpressionTransformer_0_3_AddConstant_blackBFB(Constant constant, Pattern pattern)
   {
      for (PatternBody patternBody : pattern.getBodies())
      {
         return new Object[] { constant, patternBody, pattern };
      }
      return null;
   }

   public static final Object[] pattern_LiteralExpressionTransformer_0_3_AddConstant_greenBB(Constant constant, PatternBody patternBody)
   {
      patternBody.getConstants().add(constant);
      return new Object[] { constant, patternBody };
   }

   public static final ConstraintVariable pattern_LiteralExpressionTransformer_0_4_expressionFB(Constant constant)
   {
      ConstraintVariable _result = constant;
      return _result;
   }

   public static final ConstraintVariable pattern_LiteralExpressionTransformer_0_5_expressionF()
   {
      ConstraintVariable _result = null;
      return _result;
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //LiteralExpressionTransformerImpl
