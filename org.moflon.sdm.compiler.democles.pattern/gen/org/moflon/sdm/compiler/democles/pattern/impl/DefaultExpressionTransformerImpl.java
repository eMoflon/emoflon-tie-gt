/**
 */
package org.moflon.sdm.compiler.democles.pattern.impl;

import SDMLanguage.calls.ParameterBinding;

import SDMLanguage.calls.callExpressions.MethodCallExpression;
import SDMLanguage.calls.callExpressions.ParameterExpression;

import SDMLanguage.expressions.Expression;
import SDMLanguage.expressions.LiteralExpression;

import SDMLanguage.patterns.ObjectVariable;

import SDMLanguage.patterns.patternExpressions.AttributeValueExpression;
import SDMLanguage.patterns.patternExpressions.ObjectVariableExpression;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gervarro.democles.specification.emf.Constant;
import org.gervarro.democles.specification.emf.Constraint;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.ConstraintVariable;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.Variable;

import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Operation;

import org.moflon.sdm.compiler.democles.pattern.DefaultExpressionTransformer;
import org.moflon.sdm.compiler.democles.pattern.Errors;
import org.moflon.sdm.compiler.democles.pattern.ExpressionTransformer;
import org.moflon.sdm.compiler.democles.pattern.PatternPackage;
import org.moflon.sdm.compiler.democles.pattern.PatternVariableHandler;

import org.moflon.sdm.compiler.democles.validation.result.ErrorMessage;
import org.moflon.sdm.compiler.democles.validation.result.ResultFactory;
import org.moflon.sdm.compiler.democles.validation.result.Severity;
import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Expression Transformer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.pattern.impl.DefaultExpressionTransformerImpl#getCalleeETypeNameCounter <em>Callee EType Name Counter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefaultExpressionTransformerImpl extends ExpressionTransformerImpl implements DefaultExpressionTransformer
{
   /**
    * The default value of the '{@link #getCalleeETypeNameCounter() <em>Callee EType Name Counter</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getCalleeETypeNameCounter()
    * @generated
    * @ordered
    */
   protected static final int CALLEE_ETYPE_NAME_COUNTER_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getCalleeETypeNameCounter() <em>Callee EType Name Counter</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getCalleeETypeNameCounter()
    * @generated
    * @ordered
    */
   protected int calleeETypeNameCounter = CALLEE_ETYPE_NAME_COUNTER_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected DefaultExpressionTransformerImpl()
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
      return PatternPackage.Literals.DEFAULT_EXPRESSION_TRANSFORMER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getCalleeETypeNameCounter()
   {
      return calleeETypeNameCounter;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setCalleeETypeNameCounter(int newCalleeETypeNameCounter)
   {
      int oldCalleeETypeNameCounter = calleeETypeNameCounter;
      calleeETypeNameCounter = newCalleeETypeNameCounter;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.DEFAULT_EXPRESSION_TRANSFORMER__CALLEE_ETYPE_NAME_COUNTER,
               oldCalleeETypeNameCounter, calleeETypeNameCounter));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String createLocalVariableNameAndIncrementCounter()
   {
      // [user code injected with eMoflon]

      return "_localVariable_" + calleeETypeNameCounter++;

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ConstraintVariable transformExpression(ValidationReport report, PatternVariableHandler patternVariableHandler, Expression expression, Pattern pattern,
         EClassifier expectedType)
   {// 
      Object[] result1_bindingAndBlack = DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_1_1_IsLiteralExpression_bindingAndBlackFBB(this,
            expression);
      if (result1_bindingAndBlack != null)
      {
         LiteralExpression literalExpression = (LiteralExpression) result1_bindingAndBlack[0];
         // 
         Object[] result2_black = DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_1_2_LookupDelegate_blackBF(this);
         if (result2_black != null)
         {
            ExpressionTransformer delegate = (ExpressionTransformer) result2_black[1];
            // 
            Object[] result3_bindingAndBlack = DefaultExpressionTransformerImpl
                  .pattern_DefaultExpressionTransformer_1_3_CreateLiteralConstant_bindingAndBlackFBBBBBB(delegate, report, patternVariableHandler,
                        literalExpression, pattern, expectedType);
            if (result3_bindingAndBlack != null)
            {
               Constant literalConstant = (Constant) result3_bindingAndBlack[0];
               return DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_1_4_expressionFB(literalConstant);
            } else
            {

               Object[] result5_black = DefaultExpressionTransformerImpl
                     .pattern_DefaultExpressionTransformer_1_5_ReportUnhandledDelegatedExpression_blackBB(expression, report);
               if (result5_black == null)
               {
                  throw new RuntimeException(
                        "Pattern matching failed." + " Variables: " + "[expression] = " + expression + ", " + "[report] = " + report + ".");
               }
               DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_1_5_ReportUnhandledDelegatedExpression_greenBFBB(expression, report, this);
               //nothing ErrorMessage unhandledDelegatedExpression = (ErrorMessage) result5_green[1];

               return DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_1_6_expressionF();
            }

         } else
         {

            Object[] result7_black = DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_1_7_HandleMissingDelegate_blackBB(report,
                  expression);
            if (result7_black == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[report] = " + report + ", " + "[expression] = " + expression + ".");
            }
            DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_1_7_HandleMissingDelegate_greenBBFB(report, expression, this);
            //nothing ErrorMessage missingDelegateError = (ErrorMessage) result7_green[2];

            return DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_1_8_expressionF();
         }

      } else
      {
         // 
         Object[] result9_bindingAndBlack = DefaultExpressionTransformerImpl
               .pattern_DefaultExpressionTransformer_1_9_IsAttributeValueExpression_bindingAndBlackFFFFB(expression);
         if (result9_bindingAndBlack != null)
         {
            AttributeValueExpression attributeValueExpression = (AttributeValueExpression) result9_bindingAndBlack[0];
            ObjectVariable attributeOwner = (ObjectVariable) result9_bindingAndBlack[1];
            EAttribute eAttribute = (EAttribute) result9_bindingAndBlack[2];
            EDataType attributeType = (EDataType) result9_bindingAndBlack[3];
            // 
            DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_1_10_CheckAttributeTypeCompatibility_expressionBBBBB(this, report,
                  attributeValueExpression, expectedType, attributeType);

            Object[] result11_bindingAndBlack = DefaultExpressionTransformerImpl
                  .pattern_DefaultExpressionTransformer_1_11_LinkOwnerAndAttribute_bindingAndBlackFBBBB(patternVariableHandler, attributeOwner, eAttribute,
                        pattern);
            if (result11_bindingAndBlack == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[patternVariableHandler] = " + patternVariableHandler + ", "
                     + "[attributeOwner] = " + attributeOwner + ", " + "[eAttribute] = " + eAttribute + ", " + "[pattern] = " + pattern + ".");
            }
            Variable attributeVariable = (Variable) result11_bindingAndBlack[0];
            return DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_1_12_expressionFB(attributeVariable);
         } else
         {
            // 
            Object[] result13_bindingAndBlack = DefaultExpressionTransformerImpl
                  .pattern_DefaultExpressionTransformer_1_13_IsObjectVariableExpression_bindingAndBlackFFFB(expression);
            if (result13_bindingAndBlack != null)
            {
               ObjectVariable objectVariable = (ObjectVariable) result13_bindingAndBlack[0];
               ObjectVariableExpression objectVariableExpression = (ObjectVariableExpression) result13_bindingAndBlack[1];
               EClassifier eClassifier = (EClassifier) result13_bindingAndBlack[2];
               // 
               DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_1_14_CheckObjectVariableTypeCompatibility_expressionBBBBB(this, report,
                     objectVariableExpression, expectedType, eClassifier);

               Object[] result15_bindingAndBlack = DefaultExpressionTransformerImpl
                     .pattern_DefaultExpressionTransformer_1_15_LookupObjectVariable_bindingAndBlackFBBBB(patternVariableHandler, pattern, objectVariable,
                           eClassifier);
               if (result15_bindingAndBlack == null)
               {
                  throw new RuntimeException("Pattern matching failed." + " Variables: " + "[patternVariableHandler] = " + patternVariableHandler + ", "
                        + "[pattern] = " + pattern + ", " + "[objectVariable] = " + objectVariable + ", " + "[eClassifier] = " + eClassifier + ".");
               }
               Variable knownVariable = (Variable) result15_bindingAndBlack[0];
               return DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_1_16_expressionFB(knownVariable);
            } else
            {
               // 
               Object[] result17_bindingAndBlack = DefaultExpressionTransformerImpl
                     .pattern_DefaultExpressionTransformer_1_17_IsMethodCallExpression_bindingAndBlackFFB(expression);
               if (result17_bindingAndBlack != null)
               {
                  EOperation eOperation = (EOperation) result17_bindingAndBlack[0];
                  MethodCallExpression methodCallExpression = (MethodCallExpression) result17_bindingAndBlack[1];

                  Object[] result18_black = DefaultExpressionTransformerImpl
                        .pattern_DefaultExpressionTransformer_1_18_CreateMethodCallConstraint_blackBBF(pattern, eOperation);
                  if (result18_black == null)
                  {
                     throw new RuntimeException(
                           "Pattern matching failed." + " Variables: " + "[pattern] = " + pattern + ", " + "[eOperation] = " + eOperation + ".");
                  }
                  PatternBody methodCallPatternBody = (PatternBody) result18_black[2];
                  Object[] result18_green = DefaultExpressionTransformerImpl
                        .pattern_DefaultExpressionTransformer_1_18_CreateMethodCallConstraint_greenFBB(eOperation, methodCallPatternBody);
                  Operation methodCallConstraint = (Operation) result18_green[0];

                  // 
                  Object[] result19_black = DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_1_19_HasReturnValue_blackFB(eOperation);
                  if (result19_black != null)
                  {
                     EClassifier returnType = (EClassifier) result19_black[0];

                     Object[] result20_black = DefaultExpressionTransformerImpl
                           .pattern_DefaultExpressionTransformer_1_20_HandleReturnVariable_blackBBB(methodCallPatternBody, methodCallConstraint, returnType);
                     if (result20_black == null)
                     {
                        throw new RuntimeException("Pattern matching failed." + " Variables: " + "[methodCallPatternBody] = " + methodCallPatternBody + ", "
                              + "[methodCallConstraint] = " + methodCallConstraint + ", " + "[returnType] = " + returnType + ".");
                     }
                     Object[] result20_green = DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_1_20_HandleReturnVariable_greenFBBFBB(
                           methodCallPatternBody, methodCallConstraint, returnType, this);
                     //nothing ConstraintParameter returnVariableParameter = (ConstraintParameter) result20_green[0];
                     EMFVariable returnVariable = (EMFVariable) result20_green[3];

                     // 
                     DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_1_21_CheckMethodReturnTypeCompatibility_expressionBBBBB(this, report,
                           methodCallExpression, expectedType, returnType);
                     // 
                     DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_1_22_TransformMethodInvocationWithReturnValue_expressionBBBBBB(this,
                           report, patternVariableHandler, methodCallExpression, pattern, methodCallConstraint);
                     return DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_1_23_expressionFB(returnVariable);
                  } else
                  {
                     // 
                     DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_1_24_CheckEmptyReturnTypeCompatibility_expressionBBBB(this, report,
                           methodCallExpression, expectedType);
                     // 
                     DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_1_25_TransformMethodInvocationWithoutReturnValue_expressionBBBBBB(
                           this, report, patternVariableHandler, methodCallExpression, pattern, methodCallConstraint);
                     return DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_1_26_expressionF();
                  }

               } else
               {
                  // 
                  Object[] result27_bindingAndBlack = DefaultExpressionTransformerImpl
                        .pattern_DefaultExpressionTransformer_1_27_IsParameterExpression_bindingAndBlackFFFB(expression);
                  if (result27_bindingAndBlack != null)
                  {
                     ParameterExpression parameterExpression = (ParameterExpression) result27_bindingAndBlack[0];
                     EClassifier parameterType = (EClassifier) result27_bindingAndBlack[1];
                     EParameter eParameter = (EParameter) result27_bindingAndBlack[2];
                     // 
                     DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_1_28_CheckParameterTypeCompatibility_expressionBBBBB(this, report,
                           parameterExpression, expectedType, parameterType);

                     Object[] result29_bindingAndBlack = DefaultExpressionTransformerImpl
                           .pattern_DefaultExpressionTransformer_1_29_LookupParameterVariable_bindingAndBlackFBBBB(patternVariableHandler, pattern, eParameter,
                                 parameterType);
                     if (result29_bindingAndBlack == null)
                     {
                        throw new RuntimeException("Pattern matching failed." + " Variables: " + "[patternVariableHandler] = " + patternVariableHandler + ", "
                              + "[pattern] = " + pattern + ", " + "[eParameter] = " + eParameter + ", " + "[parameterType] = " + parameterType + ".");
                     }
                     Variable parameterVariable = (Variable) result29_bindingAndBlack[0];
                     return DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_1_30_expressionFB(parameterVariable);
                  } else
                  {

                     Object[] result31_black = DefaultExpressionTransformerImpl
                           .pattern_DefaultExpressionTransformer_1_31_ReportUnhandledExpression_blackBB(report, expression);
                     if (result31_black == null)
                     {
                        throw new RuntimeException(
                              "Pattern matching failed." + " Variables: " + "[report] = " + report + ", " + "[expression] = " + expression + ".");
                     }
                     DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_1_31_ReportUnhandledExpression_greenFBBB(report, expression, this);
                     //nothing ErrorMessage unhandledExpressionType = (ErrorMessage) result31_green[0];

                     return DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_1_32_expressionF();
                  }

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
   public void transformMethodInvocation(ValidationReport report, PatternVariableHandler patternVariableHandler, MethodCallExpression methodCallExpression,
         Pattern pattern, Constraint constraint)
   {

      Object[] result1_black = DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_2_1_LookupMethodInvocationTarget_blackFBFBF(this,
            methodCallExpression);
      if (result1_black == null)
      {
         throw new RuntimeException(
               "Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[methodCallExpression] = " + methodCallExpression + ".");
      }
      EClass ownerType = (EClass) result1_black[0];
      Expression methodOwnerExpression = (Expression) result1_black[2];
      EOperation eOperation = (EOperation) result1_black[4];

      Object[] result2_bindingAndBlack = DefaultExpressionTransformerImpl
            .pattern_DefaultExpressionTransformer_2_2_HandleMethodOwnerVariable_bindingAndBlackBFBBBBBB(constraint, this, report, patternVariableHandler,
                  methodOwnerExpression, pattern, ownerType);
      if (result2_bindingAndBlack == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[constraint] = " + constraint + ", " + "[this] = " + this + ", "
               + "[report] = " + report + ", " + "[patternVariableHandler] = " + patternVariableHandler + ", " + "[methodOwnerExpression] = "
               + methodOwnerExpression + ", " + "[pattern] = " + pattern + ", " + "[ownerType] = " + ownerType + ".");
      }
      Variable methodOwnerVariable = (Variable) result2_bindingAndBlack[1];
      DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_2_2_HandleMethodOwnerVariable_greenBBF(constraint, methodOwnerVariable);
      //nothing ConstraintParameter methodOwnerParameter = (ConstraintParameter) result2_green[2];

      // ForEach 
      for (Object[] result3_black : DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_2_3_ForEachParameter_blackBFF(eOperation))
      {
         EParameter eParameter = (EParameter) result3_black[1];
         EClassifier parameterType = (EClassifier) result3_black[2];
         // 
         Object[] result4_black = DefaultExpressionTransformerImpl
               .pattern_DefaultExpressionTransformer_2_4_LookupCorrespondingParameterBinding_blackBFBF(methodCallExpression, eParameter);
         if (result4_black != null)
         {
            //nothing ParameterBinding parameterBinding = (ParameterBinding) result4_black[1];
            Expression parameterValueExpression = (Expression) result4_black[3];
            // 
            Object[] result5_bindingAndBlack = DefaultExpressionTransformerImpl
                  .pattern_DefaultExpressionTransformer_2_5_HandleCallParameter_bindingAndBlackBFBBBBBB(constraint, this, report, patternVariableHandler,
                        parameterValueExpression, pattern, parameterType);
            if (result5_bindingAndBlack != null)
            {
               ConstraintVariable parameterValue = (ConstraintVariable) result5_bindingAndBlack[1];
               DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_2_5_HandleCallParameter_greenBFB(constraint, parameterValue);
               //nothing ConstraintParameter parameter = (ConstraintParameter) result5_green[1];

            } else
            {
            }

         } else
         {

            Object[] result6_black = DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_2_6_ReportMissingParameterBinding_blackBB(report,
                  methodCallExpression);
            if (result6_black == null)
            {
               throw new RuntimeException(
                     "Pattern matching failed." + " Variables: " + "[report] = " + report + ", " + "[methodCallExpression] = " + methodCallExpression + ".");
            }
            DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_2_6_ReportMissingParameterBinding_greenBBFB(report, methodCallExpression,
                  this);
            //nothing ErrorMessage missingParameterBindingError = (ErrorMessage) result6_green[2];

         }

      }
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void checkTypeCompatibility(ValidationReport report, Expression expression, EClassifier expectedType, EClassifier producedType)
   {// 
      Object[] result1_bindingAndBlack = DefaultExpressionTransformerImpl
            .pattern_DefaultExpressionTransformer_3_1_IsDataTypeExpected_bindingAndBlackFB(expectedType);
      if (result1_bindingAndBlack != null)
      {
         EDataType expectedDataType = (EDataType) result1_bindingAndBlack[0];
         // 
         Object[] result2_black = DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_3_2_IsJavaObjectExpected_blackBF(expectedDataType);
         if (result2_black != null)
         {
            //nothing EPackage ecorePackage = (EPackage) result2_black[1];
            return;
         } else
         {

            Object[] result4_black = DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_3_4_LookupThisObject_blackB(this);
            if (result4_black == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
            }
            // 
            if (DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_3_5_AreEqual_expressionFBBB(this, expectedType, producedType))
            {
               return;
            } else
            {

               Object[] result7_black = DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_3_7_ReportIncompatibleTypes_blackBB(report,
                     expression);
               if (result7_black == null)
               {
                  throw new RuntimeException(
                        "Pattern matching failed." + " Variables: " + "[report] = " + report + ", " + "[expression] = " + expression + ".");
               }
               DefaultExpressionTransformerImpl.pattern_DefaultExpressionTransformer_3_7_ReportIncompatibleTypes_greenBBFB(report, expression, this);
               //nothing ErrorMessage incompatibleType = (ErrorMessage) result7_green[2];

               return;
            }

         }

      } else
      {
         return;
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean areEqual(EClassifier left, EClassifier right)
   {
      // [user code injected with eMoflon]

      return left == right;

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
      case PatternPackage.DEFAULT_EXPRESSION_TRANSFORMER__CALLEE_ETYPE_NAME_COUNTER:
         return getCalleeETypeNameCounter();
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
      case PatternPackage.DEFAULT_EXPRESSION_TRANSFORMER__CALLEE_ETYPE_NAME_COUNTER:
         setCalleeETypeNameCounter((Integer) newValue);
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
      case PatternPackage.DEFAULT_EXPRESSION_TRANSFORMER__CALLEE_ETYPE_NAME_COUNTER:
         setCalleeETypeNameCounter(CALLEE_ETYPE_NAME_COUNTER_EDEFAULT);
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
      case PatternPackage.DEFAULT_EXPRESSION_TRANSFORMER__CALLEE_ETYPE_NAME_COUNTER:
         return calleeETypeNameCounter != CALLEE_ETYPE_NAME_COUNTER_EDEFAULT;
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
      case PatternPackage.DEFAULT_EXPRESSION_TRANSFORMER___CREATE_LOCAL_VARIABLE_NAME_AND_INCREMENT_COUNTER:
         return createLocalVariableNameAndIncrementCounter();
      case PatternPackage.DEFAULT_EXPRESSION_TRANSFORMER___TRANSFORM_EXPRESSION__VALIDATIONREPORT_PATTERNVARIABLEHANDLER_EXPRESSION_PATTERN_ECLASSIFIER:
         return transformExpression((ValidationReport) arguments.get(0), (PatternVariableHandler) arguments.get(1), (Expression) arguments.get(2),
               (Pattern) arguments.get(3), (EClassifier) arguments.get(4));
      case PatternPackage.DEFAULT_EXPRESSION_TRANSFORMER___TRANSFORM_METHOD_INVOCATION__VALIDATIONREPORT_PATTERNVARIABLEHANDLER_METHODCALLEXPRESSION_PATTERN_CONSTRAINT:
         transformMethodInvocation((ValidationReport) arguments.get(0), (PatternVariableHandler) arguments.get(1), (MethodCallExpression) arguments.get(2),
               (Pattern) arguments.get(3), (Constraint) arguments.get(4));
         return null;
      case PatternPackage.DEFAULT_EXPRESSION_TRANSFORMER___CHECK_TYPE_COMPATIBILITY__VALIDATIONREPORT_EXPRESSION_ECLASSIFIER_ECLASSIFIER:
         checkTypeCompatibility((ValidationReport) arguments.get(0), (Expression) arguments.get(1), (EClassifier) arguments.get(2),
               (EClassifier) arguments.get(3));
         return null;
      case PatternPackage.DEFAULT_EXPRESSION_TRANSFORMER___ARE_EQUAL__ECLASSIFIER_ECLASSIFIER:
         return areEqual((EClassifier) arguments.get(0), (EClassifier) arguments.get(1));
      }
      return super.eInvoke(operationID, arguments);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString()
   {
      if (eIsProxy())
         return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (calleeETypeNameCounter: ");
      result.append(calleeETypeNameCounter);
      result.append(')');
      return result.toString();
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_1_IsLiteralExpression_bindingFB(Expression expression)
   {
      Expression tmpLiteralExpression = expression;
      if (tmpLiteralExpression instanceof LiteralExpression)
      {
         LiteralExpression literalExpression = (LiteralExpression) tmpLiteralExpression;
         return new Object[] { literalExpression, expression };
      }
      return null;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_1_IsLiteralExpression_blackBB(LiteralExpression literalExpression,
         DefaultExpressionTransformer _this)
   {
      return new Object[] { literalExpression, _this };
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_1_IsLiteralExpression_bindingAndBlackFBB(DefaultExpressionTransformer _this,
         Expression expression)
   {
      Object[] result_pattern_DefaultExpressionTransformer_1_1_IsLiteralExpression_binding = pattern_DefaultExpressionTransformer_1_1_IsLiteralExpression_bindingFB(
            expression);
      if (result_pattern_DefaultExpressionTransformer_1_1_IsLiteralExpression_binding != null)
      {
         LiteralExpression literalExpression = (LiteralExpression) result_pattern_DefaultExpressionTransformer_1_1_IsLiteralExpression_binding[0];

         Object[] result_pattern_DefaultExpressionTransformer_1_1_IsLiteralExpression_black = pattern_DefaultExpressionTransformer_1_1_IsLiteralExpression_blackBB(
               literalExpression, _this);
         if (result_pattern_DefaultExpressionTransformer_1_1_IsLiteralExpression_black != null)
         {

            return new Object[] { literalExpression, _this, expression };
         }
      }
      return null;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_2_LookupDelegate_blackBF(DefaultExpressionTransformer _this)
   {
      ExpressionTransformer delegate = _this.getDelegate();
      if (delegate != null)
      {
         if (!delegate.equals(_this))
         {
            return new Object[] { _this, delegate };
         }
      }

      return null;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_3_CreateLiteralConstant_bindingFBBBBBB(ExpressionTransformer delegate,
         ValidationReport report, PatternVariableHandler patternVariableHandler, LiteralExpression literalExpression, Pattern pattern, EClassifier expectedType)
   {
      ConstraintVariable _localVariable_0 = delegate.transformExpression(report, patternVariableHandler, literalExpression, pattern, expectedType);
      ConstraintVariable tmpLiteralConstant = _localVariable_0;
      if (tmpLiteralConstant instanceof Constant)
      {
         Constant literalConstant = (Constant) tmpLiteralConstant;
         return new Object[] { literalConstant, delegate, report, patternVariableHandler, literalExpression, pattern, expectedType };
      }
      return null;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_3_CreateLiteralConstant_blackB(Constant literalConstant)
   {
      return new Object[] { literalConstant };
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_3_CreateLiteralConstant_bindingAndBlackFBBBBBB(ExpressionTransformer delegate,
         ValidationReport report, PatternVariableHandler patternVariableHandler, LiteralExpression literalExpression, Pattern pattern, EClassifier expectedType)
   {
      Object[] result_pattern_DefaultExpressionTransformer_1_3_CreateLiteralConstant_binding = pattern_DefaultExpressionTransformer_1_3_CreateLiteralConstant_bindingFBBBBBB(
            delegate, report, patternVariableHandler, literalExpression, pattern, expectedType);
      if (result_pattern_DefaultExpressionTransformer_1_3_CreateLiteralConstant_binding != null)
      {
         Constant literalConstant = (Constant) result_pattern_DefaultExpressionTransformer_1_3_CreateLiteralConstant_binding[0];

         Object[] result_pattern_DefaultExpressionTransformer_1_3_CreateLiteralConstant_black = pattern_DefaultExpressionTransformer_1_3_CreateLiteralConstant_blackB(
               literalConstant);
         if (result_pattern_DefaultExpressionTransformer_1_3_CreateLiteralConstant_black != null)
         {

            return new Object[] { literalConstant, delegate, report, patternVariableHandler, literalExpression, pattern, expectedType };
         }
      }
      return null;
   }

   public static final ConstraintVariable pattern_DefaultExpressionTransformer_1_4_expressionFB(Constant literalConstant)
   {
      ConstraintVariable _result = literalConstant;
      return _result;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_5_ReportUnhandledDelegatedExpression_blackBB(Expression expression,
         ValidationReport report)
   {
      return new Object[] { expression, report };
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_5_ReportUnhandledDelegatedExpression_greenBFBB(Expression expression,
         ValidationReport report, DefaultExpressionTransformer _this)
   {
      ErrorMessage unhandledDelegatedExpression = ResultFactory.eINSTANCE.createErrorMessage();
      Severity unhandledDelegatedExpression_severity_prime = Severity.ERROR;
      String _localVariable_0 = _this.lookupErrorMessage(Errors.UNHANDLED_EXPRESSION);
      unhandledDelegatedExpression.getLocation().add(expression);
      report.getErrorMessages().add(unhandledDelegatedExpression);
      unhandledDelegatedExpression.setSeverity(unhandledDelegatedExpression_severity_prime);
      String unhandledDelegatedExpression_id_prime = _localVariable_0;
      unhandledDelegatedExpression.setId(unhandledDelegatedExpression_id_prime);
      return new Object[] { expression, unhandledDelegatedExpression, report, _this };
   }

   public static final ConstraintVariable pattern_DefaultExpressionTransformer_1_6_expressionF()
   {
      ConstraintVariable _result = null;
      return _result;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_7_HandleMissingDelegate_blackBB(ValidationReport report, Expression expression)
   {
      return new Object[] { report, expression };
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_7_HandleMissingDelegate_greenBBFB(ValidationReport report, Expression expression,
         DefaultExpressionTransformer _this)
   {
      ErrorMessage missingDelegateError = ResultFactory.eINSTANCE.createErrorMessage();
      Severity missingDelegateError_severity_prime = Severity.ERROR;
      String _localVariable_0 = _this.lookupErrorMessage(Errors.MISSING_DELEGATE);
      report.getErrorMessages().add(missingDelegateError);
      missingDelegateError.getLocation().add(expression);
      missingDelegateError.setSeverity(missingDelegateError_severity_prime);
      String missingDelegateError_id_prime = _localVariable_0;
      missingDelegateError.setId(missingDelegateError_id_prime);
      return new Object[] { report, expression, missingDelegateError, _this };
   }

   public static final ConstraintVariable pattern_DefaultExpressionTransformer_1_8_expressionF()
   {
      ConstraintVariable _result = null;
      return _result;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_9_IsAttributeValueExpression_bindingFB(Expression expression)
   {
      Expression tmpAttributeValueExpression = expression;
      if (tmpAttributeValueExpression instanceof AttributeValueExpression)
      {
         AttributeValueExpression attributeValueExpression = (AttributeValueExpression) tmpAttributeValueExpression;
         return new Object[] { attributeValueExpression, expression };
      }
      return null;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_9_IsAttributeValueExpression_blackBFFF(AttributeValueExpression attributeValueExpression)
   {
      EAttribute eAttribute = attributeValueExpression.getAttribute();
      if (eAttribute != null)
      {
         ObjectVariable attributeOwner = attributeValueExpression.getObject();
         if (attributeOwner != null)
         {
            EClassifier tmpAttributeType = eAttribute.getEType();
            if (tmpAttributeType instanceof EDataType)
            {
               EDataType attributeType = (EDataType) tmpAttributeType;
               return new Object[] { attributeValueExpression, attributeOwner, eAttribute, attributeType };
            }

         }

      }

      return null;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_9_IsAttributeValueExpression_bindingAndBlackFFFFB(Expression expression)
   {
      Object[] result_pattern_DefaultExpressionTransformer_1_9_IsAttributeValueExpression_binding = pattern_DefaultExpressionTransformer_1_9_IsAttributeValueExpression_bindingFB(
            expression);
      if (result_pattern_DefaultExpressionTransformer_1_9_IsAttributeValueExpression_binding != null)
      {
         AttributeValueExpression attributeValueExpression = (AttributeValueExpression) result_pattern_DefaultExpressionTransformer_1_9_IsAttributeValueExpression_binding[0];

         Object[] result_pattern_DefaultExpressionTransformer_1_9_IsAttributeValueExpression_black = pattern_DefaultExpressionTransformer_1_9_IsAttributeValueExpression_blackBFFF(
               attributeValueExpression);
         if (result_pattern_DefaultExpressionTransformer_1_9_IsAttributeValueExpression_black != null)
         {
            ObjectVariable attributeOwner = (ObjectVariable) result_pattern_DefaultExpressionTransformer_1_9_IsAttributeValueExpression_black[1];
            EAttribute eAttribute = (EAttribute) result_pattern_DefaultExpressionTransformer_1_9_IsAttributeValueExpression_black[2];
            EDataType attributeType = (EDataType) result_pattern_DefaultExpressionTransformer_1_9_IsAttributeValueExpression_black[3];

            return new Object[] { attributeValueExpression, attributeOwner, eAttribute, attributeType, expression };
         }
      }
      return null;
   }

   public static final void pattern_DefaultExpressionTransformer_1_10_CheckAttributeTypeCompatibility_expressionBBBBB(DefaultExpressionTransformer _this,
         ValidationReport report, AttributeValueExpression attributeValueExpression, EClassifier expectedType, EDataType attributeType)
   {
      _this.checkTypeCompatibility(report, attributeValueExpression, expectedType, attributeType);

   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_11_LinkOwnerAndAttribute_bindingFBBBB(PatternVariableHandler patternVariableHandler,
         ObjectVariable attributeOwner, EAttribute eAttribute, Pattern pattern)
   {
      Variable _localVariable_0 = patternVariableHandler.getAttributeVariable(attributeOwner, eAttribute, pattern);
      Variable attributeVariable = _localVariable_0;
      if (attributeVariable != null)
      {
         return new Object[] { attributeVariable, patternVariableHandler, attributeOwner, eAttribute, pattern };
      }
      return null;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_11_LinkOwnerAndAttribute_blackB(Variable attributeVariable)
   {
      return new Object[] { attributeVariable };
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_11_LinkOwnerAndAttribute_bindingAndBlackFBBBB(
         PatternVariableHandler patternVariableHandler, ObjectVariable attributeOwner, EAttribute eAttribute, Pattern pattern)
   {
      Object[] result_pattern_DefaultExpressionTransformer_1_11_LinkOwnerAndAttribute_binding = pattern_DefaultExpressionTransformer_1_11_LinkOwnerAndAttribute_bindingFBBBB(
            patternVariableHandler, attributeOwner, eAttribute, pattern);
      if (result_pattern_DefaultExpressionTransformer_1_11_LinkOwnerAndAttribute_binding != null)
      {
         Variable attributeVariable = (Variable) result_pattern_DefaultExpressionTransformer_1_11_LinkOwnerAndAttribute_binding[0];

         Object[] result_pattern_DefaultExpressionTransformer_1_11_LinkOwnerAndAttribute_black = pattern_DefaultExpressionTransformer_1_11_LinkOwnerAndAttribute_blackB(
               attributeVariable);
         if (result_pattern_DefaultExpressionTransformer_1_11_LinkOwnerAndAttribute_black != null)
         {

            return new Object[] { attributeVariable, patternVariableHandler, attributeOwner, eAttribute, pattern };
         }
      }
      return null;
   }

   public static final ConstraintVariable pattern_DefaultExpressionTransformer_1_12_expressionFB(Variable attributeVariable)
   {
      ConstraintVariable _result = attributeVariable;
      return _result;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_13_IsObjectVariableExpression_bindingFB(Expression expression)
   {
      Expression tmpObjectVariableExpression = expression;
      if (tmpObjectVariableExpression instanceof ObjectVariableExpression)
      {
         ObjectVariableExpression objectVariableExpression = (ObjectVariableExpression) tmpObjectVariableExpression;
         return new Object[] { objectVariableExpression, expression };
      }
      return null;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_13_IsObjectVariableExpression_blackFBF(ObjectVariableExpression objectVariableExpression)
   {
      ObjectVariable objectVariable = objectVariableExpression.getObject();
      if (objectVariable != null)
      {
         EClassifier eClassifier = objectVariable.getType();
         if (eClassifier != null)
         {
            return new Object[] { objectVariable, objectVariableExpression, eClassifier };
         }

      }

      return null;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_13_IsObjectVariableExpression_bindingAndBlackFFFB(Expression expression)
   {
      Object[] result_pattern_DefaultExpressionTransformer_1_13_IsObjectVariableExpression_binding = pattern_DefaultExpressionTransformer_1_13_IsObjectVariableExpression_bindingFB(
            expression);
      if (result_pattern_DefaultExpressionTransformer_1_13_IsObjectVariableExpression_binding != null)
      {
         ObjectVariableExpression objectVariableExpression = (ObjectVariableExpression) result_pattern_DefaultExpressionTransformer_1_13_IsObjectVariableExpression_binding[0];

         Object[] result_pattern_DefaultExpressionTransformer_1_13_IsObjectVariableExpression_black = pattern_DefaultExpressionTransformer_1_13_IsObjectVariableExpression_blackFBF(
               objectVariableExpression);
         if (result_pattern_DefaultExpressionTransformer_1_13_IsObjectVariableExpression_black != null)
         {
            ObjectVariable objectVariable = (ObjectVariable) result_pattern_DefaultExpressionTransformer_1_13_IsObjectVariableExpression_black[0];
            EClassifier eClassifier = (EClassifier) result_pattern_DefaultExpressionTransformer_1_13_IsObjectVariableExpression_black[2];

            return new Object[] { objectVariable, objectVariableExpression, eClassifier, expression };
         }
      }
      return null;
   }

   public static final void pattern_DefaultExpressionTransformer_1_14_CheckObjectVariableTypeCompatibility_expressionBBBBB(DefaultExpressionTransformer _this,
         ValidationReport report, ObjectVariableExpression objectVariableExpression, EClassifier expectedType, EClassifier eClassifier)
   {
      _this.checkTypeCompatibility(report, objectVariableExpression, expectedType, eClassifier);

   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_15_LookupObjectVariable_bindingFBBBB(PatternVariableHandler patternVariableHandler,
         Pattern pattern, ObjectVariable objectVariable, EClassifier eClassifier)
   {
      String objectVariable_name = objectVariable.getName();
      Variable _localVariable_0 = patternVariableHandler.lookupVariableInPattern(pattern, objectVariable_name, eClassifier);
      Variable knownVariable = _localVariable_0;
      if (knownVariable != null)
      {
         return new Object[] { knownVariable, patternVariableHandler, pattern, objectVariable, eClassifier };
      }

      return null;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_15_LookupObjectVariable_blackB(Variable knownVariable)
   {
      return new Object[] { knownVariable };
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_15_LookupObjectVariable_bindingAndBlackFBBBB(
         PatternVariableHandler patternVariableHandler, Pattern pattern, ObjectVariable objectVariable, EClassifier eClassifier)
   {
      Object[] result_pattern_DefaultExpressionTransformer_1_15_LookupObjectVariable_binding = pattern_DefaultExpressionTransformer_1_15_LookupObjectVariable_bindingFBBBB(
            patternVariableHandler, pattern, objectVariable, eClassifier);
      if (result_pattern_DefaultExpressionTransformer_1_15_LookupObjectVariable_binding != null)
      {
         Variable knownVariable = (Variable) result_pattern_DefaultExpressionTransformer_1_15_LookupObjectVariable_binding[0];

         Object[] result_pattern_DefaultExpressionTransformer_1_15_LookupObjectVariable_black = pattern_DefaultExpressionTransformer_1_15_LookupObjectVariable_blackB(
               knownVariable);
         if (result_pattern_DefaultExpressionTransformer_1_15_LookupObjectVariable_black != null)
         {

            return new Object[] { knownVariable, patternVariableHandler, pattern, objectVariable, eClassifier };
         }
      }
      return null;
   }

   public static final ConstraintVariable pattern_DefaultExpressionTransformer_1_16_expressionFB(Variable knownVariable)
   {
      ConstraintVariable _result = knownVariable;
      return _result;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_17_IsMethodCallExpression_bindingFB(Expression expression)
   {
      Expression tmpMethodCallExpression = expression;
      if (tmpMethodCallExpression instanceof MethodCallExpression)
      {
         MethodCallExpression methodCallExpression = (MethodCallExpression) tmpMethodCallExpression;
         return new Object[] { methodCallExpression, expression };
      }
      return null;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_17_IsMethodCallExpression_blackFB(MethodCallExpression methodCallExpression)
   {
      EOperation eOperation = methodCallExpression.getCallee();
      if (eOperation != null)
      {
         return new Object[] { eOperation, methodCallExpression };
      }

      return null;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_17_IsMethodCallExpression_bindingAndBlackFFB(Expression expression)
   {
      Object[] result_pattern_DefaultExpressionTransformer_1_17_IsMethodCallExpression_binding = pattern_DefaultExpressionTransformer_1_17_IsMethodCallExpression_bindingFB(
            expression);
      if (result_pattern_DefaultExpressionTransformer_1_17_IsMethodCallExpression_binding != null)
      {
         MethodCallExpression methodCallExpression = (MethodCallExpression) result_pattern_DefaultExpressionTransformer_1_17_IsMethodCallExpression_binding[0];

         Object[] result_pattern_DefaultExpressionTransformer_1_17_IsMethodCallExpression_black = pattern_DefaultExpressionTransformer_1_17_IsMethodCallExpression_blackFB(
               methodCallExpression);
         if (result_pattern_DefaultExpressionTransformer_1_17_IsMethodCallExpression_black != null)
         {
            EOperation eOperation = (EOperation) result_pattern_DefaultExpressionTransformer_1_17_IsMethodCallExpression_black[0];

            return new Object[] { eOperation, methodCallExpression, expression };
         }
      }
      return null;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_18_CreateMethodCallConstraint_blackBBF(Pattern pattern, EOperation eOperation)
   {
      for (PatternBody methodCallPatternBody : pattern.getBodies())
      {
         return new Object[] { pattern, eOperation, methodCallPatternBody };
      }
      return null;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_18_CreateMethodCallConstraint_greenFBB(EOperation eOperation,
         PatternBody methodCallPatternBody)
   {
      Operation methodCallConstraint = EMFTypeFactory.eINSTANCE.createOperation();
      methodCallConstraint.setEModelElement(eOperation);
      methodCallPatternBody.getConstraints().add(methodCallConstraint);
      return new Object[] { methodCallConstraint, eOperation, methodCallPatternBody };
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_19_HasReturnValue_blackFB(EOperation eOperation)
   {
      EClassifier returnType = eOperation.getEType();
      if (returnType != null)
      {
         return new Object[] { returnType, eOperation };
      }

      return null;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_20_HandleReturnVariable_blackBBB(PatternBody methodCallPatternBody,
         Operation methodCallConstraint, EClassifier returnType)
   {
      return new Object[] { methodCallPatternBody, methodCallConstraint, returnType };
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_20_HandleReturnVariable_greenFBBFBB(PatternBody methodCallPatternBody,
         Operation methodCallConstraint, EClassifier returnType, DefaultExpressionTransformer _this)
   {
      ConstraintParameter returnVariableParameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
      EMFVariable returnVariable = EMFTypeFactory.eINSTANCE.createEMFVariable();
      String _localVariable_0 = _this.createLocalVariableNameAndIncrementCounter();
      methodCallConstraint.getParameters().add(returnVariableParameter);
      returnVariableParameter.setReference(returnVariable);
      methodCallPatternBody.getLocalVariables().add(returnVariable);
      returnVariable.setEClassifier(returnType);
      String returnVariable_name_prime = _localVariable_0;
      returnVariable.setName(returnVariable_name_prime);
      return new Object[] { returnVariableParameter, methodCallPatternBody, methodCallConstraint, returnVariable, returnType, _this };
   }

   public static final void pattern_DefaultExpressionTransformer_1_21_CheckMethodReturnTypeCompatibility_expressionBBBBB(DefaultExpressionTransformer _this,
         ValidationReport report, MethodCallExpression methodCallExpression, EClassifier expectedType, EClassifier returnType)
   {
      _this.checkTypeCompatibility(report, methodCallExpression, expectedType, returnType);

   }

   public static final void pattern_DefaultExpressionTransformer_1_22_TransformMethodInvocationWithReturnValue_expressionBBBBBB(
         DefaultExpressionTransformer _this, ValidationReport report, PatternVariableHandler patternVariableHandler, MethodCallExpression methodCallExpression,
         Pattern pattern, Operation methodCallConstraint)
   {
      _this.transformMethodInvocation(report, patternVariableHandler, methodCallExpression, pattern, methodCallConstraint);

   }

   public static final ConstraintVariable pattern_DefaultExpressionTransformer_1_23_expressionFB(EMFVariable returnVariable)
   {
      ConstraintVariable _result = returnVariable;
      return _result;
   }

   public static final void pattern_DefaultExpressionTransformer_1_24_CheckEmptyReturnTypeCompatibility_expressionBBBB(DefaultExpressionTransformer _this,
         ValidationReport report, MethodCallExpression methodCallExpression, EClassifier expectedType)
   {
      _this.checkTypeCompatibility(report, methodCallExpression, expectedType, null);

   }

   public static final void pattern_DefaultExpressionTransformer_1_25_TransformMethodInvocationWithoutReturnValue_expressionBBBBBB(
         DefaultExpressionTransformer _this, ValidationReport report, PatternVariableHandler patternVariableHandler, MethodCallExpression methodCallExpression,
         Pattern pattern, Operation methodCallConstraint)
   {
      _this.transformMethodInvocation(report, patternVariableHandler, methodCallExpression, pattern, methodCallConstraint);

   }

   public static final ConstraintVariable pattern_DefaultExpressionTransformer_1_26_expressionF()
   {
      ConstraintVariable _result = null;
      return _result;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_27_IsParameterExpression_bindingFB(Expression expression)
   {
      Expression tmpParameterExpression = expression;
      if (tmpParameterExpression instanceof ParameterExpression)
      {
         ParameterExpression parameterExpression = (ParameterExpression) tmpParameterExpression;
         return new Object[] { parameterExpression, expression };
      }
      return null;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_27_IsParameterExpression_blackBFF(ParameterExpression parameterExpression)
   {
      EParameter eParameter = parameterExpression.getParameter();
      if (eParameter != null)
      {
         EClassifier parameterType = eParameter.getEType();
         if (parameterType != null)
         {
            return new Object[] { parameterExpression, parameterType, eParameter };
         }

      }

      return null;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_27_IsParameterExpression_bindingAndBlackFFFB(Expression expression)
   {
      Object[] result_pattern_DefaultExpressionTransformer_1_27_IsParameterExpression_binding = pattern_DefaultExpressionTransformer_1_27_IsParameterExpression_bindingFB(
            expression);
      if (result_pattern_DefaultExpressionTransformer_1_27_IsParameterExpression_binding != null)
      {
         ParameterExpression parameterExpression = (ParameterExpression) result_pattern_DefaultExpressionTransformer_1_27_IsParameterExpression_binding[0];

         Object[] result_pattern_DefaultExpressionTransformer_1_27_IsParameterExpression_black = pattern_DefaultExpressionTransformer_1_27_IsParameterExpression_blackBFF(
               parameterExpression);
         if (result_pattern_DefaultExpressionTransformer_1_27_IsParameterExpression_black != null)
         {
            EClassifier parameterType = (EClassifier) result_pattern_DefaultExpressionTransformer_1_27_IsParameterExpression_black[1];
            EParameter eParameter = (EParameter) result_pattern_DefaultExpressionTransformer_1_27_IsParameterExpression_black[2];

            return new Object[] { parameterExpression, parameterType, eParameter, expression };
         }
      }
      return null;
   }

   public static final void pattern_DefaultExpressionTransformer_1_28_CheckParameterTypeCompatibility_expressionBBBBB(DefaultExpressionTransformer _this,
         ValidationReport report, ParameterExpression parameterExpression, EClassifier expectedType, EClassifier parameterType)
   {
      _this.checkTypeCompatibility(report, parameterExpression, expectedType, parameterType);

   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_29_LookupParameterVariable_bindingFBBBB(PatternVariableHandler patternVariableHandler,
         Pattern pattern, EParameter eParameter, EClassifier parameterType)
   {
      String eParameter_name = eParameter.getName();
      Variable _localVariable_0 = patternVariableHandler.lookupVariableInPattern(pattern, eParameter_name, parameterType);
      Variable parameterVariable = _localVariable_0;
      if (parameterVariable != null)
      {
         return new Object[] { parameterVariable, patternVariableHandler, pattern, eParameter, parameterType };
      }

      return null;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_29_LookupParameterVariable_blackB(Variable parameterVariable)
   {
      return new Object[] { parameterVariable };
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_29_LookupParameterVariable_bindingAndBlackFBBBB(
         PatternVariableHandler patternVariableHandler, Pattern pattern, EParameter eParameter, EClassifier parameterType)
   {
      Object[] result_pattern_DefaultExpressionTransformer_1_29_LookupParameterVariable_binding = pattern_DefaultExpressionTransformer_1_29_LookupParameterVariable_bindingFBBBB(
            patternVariableHandler, pattern, eParameter, parameterType);
      if (result_pattern_DefaultExpressionTransformer_1_29_LookupParameterVariable_binding != null)
      {
         Variable parameterVariable = (Variable) result_pattern_DefaultExpressionTransformer_1_29_LookupParameterVariable_binding[0];

         Object[] result_pattern_DefaultExpressionTransformer_1_29_LookupParameterVariable_black = pattern_DefaultExpressionTransformer_1_29_LookupParameterVariable_blackB(
               parameterVariable);
         if (result_pattern_DefaultExpressionTransformer_1_29_LookupParameterVariable_black != null)
         {

            return new Object[] { parameterVariable, patternVariableHandler, pattern, eParameter, parameterType };
         }
      }
      return null;
   }

   public static final ConstraintVariable pattern_DefaultExpressionTransformer_1_30_expressionFB(Variable parameterVariable)
   {
      ConstraintVariable _result = parameterVariable;
      return _result;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_31_ReportUnhandledExpression_blackBB(ValidationReport report, Expression expression)
   {
      return new Object[] { report, expression };
   }

   public static final Object[] pattern_DefaultExpressionTransformer_1_31_ReportUnhandledExpression_greenFBBB(ValidationReport report, Expression expression,
         DefaultExpressionTransformer _this)
   {
      ErrorMessage unhandledExpressionType = ResultFactory.eINSTANCE.createErrorMessage();
      String _localVariable_0 = _this.lookupErrorMessage(Errors.UNHANDLED_EXPRESSION);
      Severity unhandledExpressionType_severity_prime = Severity.ERROR;
      unhandledExpressionType.getLocation().add(expression);
      report.getErrorMessages().add(unhandledExpressionType);
      String unhandledExpressionType_id_prime = _localVariable_0;
      unhandledExpressionType.setSeverity(unhandledExpressionType_severity_prime);
      unhandledExpressionType.setId(unhandledExpressionType_id_prime);
      return new Object[] { unhandledExpressionType, report, expression, _this };
   }

   public static final ConstraintVariable pattern_DefaultExpressionTransformer_1_32_expressionF()
   {
      ConstraintVariable _result = null;
      return _result;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_2_1_LookupMethodInvocationTarget_blackFBFBF(DefaultExpressionTransformer _this,
         MethodCallExpression methodCallExpression)
   {
      EOperation eOperation = methodCallExpression.getCallee();
      if (eOperation != null)
      {
         Expression methodOwnerExpression = methodCallExpression.getTarget();
         if (methodOwnerExpression != null)
         {
            if (!methodCallExpression.equals(methodOwnerExpression))
            {
               EClass ownerType = eOperation.getEContainingClass();
               if (ownerType != null)
               {
                  return new Object[] { ownerType, _this, methodOwnerExpression, methodCallExpression, eOperation };
               }

            }
         }

      }

      return null;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_2_2_HandleMethodOwnerVariable_bindingFBBBBBB(DefaultExpressionTransformer _this,
         ValidationReport report, PatternVariableHandler patternVariableHandler, Expression methodOwnerExpression, Pattern pattern, EClass ownerType)
   {
      ConstraintVariable _localVariable_0 = _this.transformExpression(report, patternVariableHandler, methodOwnerExpression, pattern, ownerType);
      ConstraintVariable tmpMethodOwnerVariable = _localVariable_0;
      if (tmpMethodOwnerVariable instanceof Variable)
      {
         Variable methodOwnerVariable = (Variable) tmpMethodOwnerVariable;
         return new Object[] { methodOwnerVariable, _this, report, patternVariableHandler, methodOwnerExpression, pattern, ownerType };
      }
      return null;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_2_2_HandleMethodOwnerVariable_blackBB(Constraint constraint, Variable methodOwnerVariable)
   {
      return new Object[] { constraint, methodOwnerVariable };
   }

   public static final Object[] pattern_DefaultExpressionTransformer_2_2_HandleMethodOwnerVariable_bindingAndBlackBFBBBBBB(Constraint constraint,
         DefaultExpressionTransformer _this, ValidationReport report, PatternVariableHandler patternVariableHandler, Expression methodOwnerExpression,
         Pattern pattern, EClass ownerType)
   {
      Object[] result_pattern_DefaultExpressionTransformer_2_2_HandleMethodOwnerVariable_binding = pattern_DefaultExpressionTransformer_2_2_HandleMethodOwnerVariable_bindingFBBBBBB(
            _this, report, patternVariableHandler, methodOwnerExpression, pattern, ownerType);
      if (result_pattern_DefaultExpressionTransformer_2_2_HandleMethodOwnerVariable_binding != null)
      {
         Variable methodOwnerVariable = (Variable) result_pattern_DefaultExpressionTransformer_2_2_HandleMethodOwnerVariable_binding[0];

         Object[] result_pattern_DefaultExpressionTransformer_2_2_HandleMethodOwnerVariable_black = pattern_DefaultExpressionTransformer_2_2_HandleMethodOwnerVariable_blackBB(
               constraint, methodOwnerVariable);
         if (result_pattern_DefaultExpressionTransformer_2_2_HandleMethodOwnerVariable_black != null)
         {

            return new Object[] { constraint, methodOwnerVariable, _this, report, patternVariableHandler, methodOwnerExpression, pattern, ownerType };
         }
      }
      return null;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_2_2_HandleMethodOwnerVariable_greenBBF(Constraint constraint, Variable methodOwnerVariable)
   {
      ConstraintParameter methodOwnerParameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
      constraint.getParameters().add(methodOwnerParameter);
      methodOwnerParameter.setReference(methodOwnerVariable);
      return new Object[] { constraint, methodOwnerVariable, methodOwnerParameter };
   }

   public static final Iterable<Object[]> pattern_DefaultExpressionTransformer_2_3_ForEachParameter_blackBFF(EOperation eOperation)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (EParameter eParameter : eOperation.getEParameters())
      {
         EClassifier parameterType = eParameter.getEType();
         if (parameterType != null)
         {
            _result.add(new Object[] { eOperation, eParameter, parameterType });
         }

      }
      return _result;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_2_4_LookupCorrespondingParameterBinding_blackBFBF(
         MethodCallExpression methodCallExpression, EParameter eParameter)
   {
      for (ParameterBinding parameterBinding : methodCallExpression.getOwnedParameterBindings())
      {
         if (eParameter.equals(parameterBinding.getParameter()))
         {
            Expression parameterValueExpression = parameterBinding.getValueExpression();
            if (parameterValueExpression != null)
            {
               if (!methodCallExpression.equals(parameterValueExpression))
               {
                  return new Object[] { methodCallExpression, parameterBinding, eParameter, parameterValueExpression };
               }
            }

         }
      }
      return null;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_2_5_HandleCallParameter_bindingFBBBBBB(DefaultExpressionTransformer _this,
         ValidationReport report, PatternVariableHandler patternVariableHandler, Expression parameterValueExpression, Pattern pattern,
         EClassifier parameterType)
   {
      ConstraintVariable _localVariable_0 = _this.transformExpression(report, patternVariableHandler, parameterValueExpression, pattern, parameterType);
      ConstraintVariable parameterValue = _localVariable_0;
      if (parameterValue != null)
      {
         return new Object[] { parameterValue, _this, report, patternVariableHandler, parameterValueExpression, pattern, parameterType };
      }
      return null;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_2_5_HandleCallParameter_blackBB(Constraint constraint, ConstraintVariable parameterValue)
   {
      return new Object[] { constraint, parameterValue };
   }

   public static final Object[] pattern_DefaultExpressionTransformer_2_5_HandleCallParameter_bindingAndBlackBFBBBBBB(Constraint constraint,
         DefaultExpressionTransformer _this, ValidationReport report, PatternVariableHandler patternVariableHandler, Expression parameterValueExpression,
         Pattern pattern, EClassifier parameterType)
   {
      Object[] result_pattern_DefaultExpressionTransformer_2_5_HandleCallParameter_binding = pattern_DefaultExpressionTransformer_2_5_HandleCallParameter_bindingFBBBBBB(
            _this, report, patternVariableHandler, parameterValueExpression, pattern, parameterType);
      if (result_pattern_DefaultExpressionTransformer_2_5_HandleCallParameter_binding != null)
      {
         ConstraintVariable parameterValue = (ConstraintVariable) result_pattern_DefaultExpressionTransformer_2_5_HandleCallParameter_binding[0];

         Object[] result_pattern_DefaultExpressionTransformer_2_5_HandleCallParameter_black = pattern_DefaultExpressionTransformer_2_5_HandleCallParameter_blackBB(
               constraint, parameterValue);
         if (result_pattern_DefaultExpressionTransformer_2_5_HandleCallParameter_black != null)
         {

            return new Object[] { constraint, parameterValue, _this, report, patternVariableHandler, parameterValueExpression, pattern, parameterType };
         }
      }
      return null;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_2_5_HandleCallParameter_greenBFB(Constraint constraint, ConstraintVariable parameterValue)
   {
      ConstraintParameter parameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
      constraint.getParameters().add(parameter);
      parameter.setReference(parameterValue);
      return new Object[] { constraint, parameter, parameterValue };
   }

   public static final Object[] pattern_DefaultExpressionTransformer_2_6_ReportMissingParameterBinding_blackBB(ValidationReport report,
         MethodCallExpression methodCallExpression)
   {
      return new Object[] { report, methodCallExpression };
   }

   public static final Object[] pattern_DefaultExpressionTransformer_2_6_ReportMissingParameterBinding_greenBBFB(ValidationReport report,
         MethodCallExpression methodCallExpression, DefaultExpressionTransformer _this)
   {
      ErrorMessage missingParameterBindingError = ResultFactory.eINSTANCE.createErrorMessage();
      Severity missingParameterBindingError_severity_prime = Severity.ERROR;
      String _localVariable_0 = _this.lookupErrorMessage(Errors.MISSING_PARAMETER_BINDING);
      report.getErrorMessages().add(missingParameterBindingError);
      missingParameterBindingError.getLocation().add(methodCallExpression);
      missingParameterBindingError.setSeverity(missingParameterBindingError_severity_prime);
      String missingParameterBindingError_id_prime = _localVariable_0;
      missingParameterBindingError.setId(missingParameterBindingError_id_prime);
      return new Object[] { report, methodCallExpression, missingParameterBindingError, _this };
   }

   public static final Object[] pattern_DefaultExpressionTransformer_3_1_IsDataTypeExpected_bindingFB(EClassifier expectedType)
   {
      EClassifier tmpExpectedDataType = expectedType;
      if (tmpExpectedDataType instanceof EDataType)
      {
         EDataType expectedDataType = (EDataType) tmpExpectedDataType;
         return new Object[] { expectedDataType, expectedType };
      }
      return null;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_3_1_IsDataTypeExpected_blackB(EDataType expectedDataType)
   {
      return new Object[] { expectedDataType };
   }

   public static final Object[] pattern_DefaultExpressionTransformer_3_1_IsDataTypeExpected_bindingAndBlackFB(EClassifier expectedType)
   {
      Object[] result_pattern_DefaultExpressionTransformer_3_1_IsDataTypeExpected_binding = pattern_DefaultExpressionTransformer_3_1_IsDataTypeExpected_bindingFB(
            expectedType);
      if (result_pattern_DefaultExpressionTransformer_3_1_IsDataTypeExpected_binding != null)
      {
         EDataType expectedDataType = (EDataType) result_pattern_DefaultExpressionTransformer_3_1_IsDataTypeExpected_binding[0];

         Object[] result_pattern_DefaultExpressionTransformer_3_1_IsDataTypeExpected_black = pattern_DefaultExpressionTransformer_3_1_IsDataTypeExpected_blackB(
               expectedDataType);
         if (result_pattern_DefaultExpressionTransformer_3_1_IsDataTypeExpected_black != null)
         {

            return new Object[] { expectedDataType, expectedType };
         }
      }
      return null;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_3_2_IsJavaObjectExpected_blackBF(EDataType expectedDataType)
   {
      EPackage ecorePackage = expectedDataType.getEPackage();
      if (ecorePackage != null)
      {
         String expectedDataType_name = expectedDataType.getName();
         if (expectedDataType_name.equals("EJavaObject"))
         {
            String ecorePackage_name = ecorePackage.getName();
            if (ecorePackage_name.equals("ecore"))
            {
               String ecorePackage_nsPrefix = ecorePackage.getNsPrefix();
               if (ecorePackage_nsPrefix.equals("ecore"))
               {
                  String ecorePackage_nsURI = ecorePackage.getNsURI();
                  if (ecorePackage_nsURI.equals("http://www.eclipse.org/emf/2002/Ecore"))
                  {
                     return new Object[] { expectedDataType, ecorePackage };
                  }

               }

            }

         }

      }

      return null;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_3_4_LookupThisObject_blackB(DefaultExpressionTransformer _this)
   {
      return new Object[] { _this };
   }

   public static final boolean pattern_DefaultExpressionTransformer_3_5_AreEqual_expressionFBBB(DefaultExpressionTransformer _this, EClassifier expectedType,
         EClassifier producedType)
   {
      boolean _localVariable_0 = _this.areEqual(expectedType, producedType);
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final Object[] pattern_DefaultExpressionTransformer_3_7_ReportIncompatibleTypes_blackBB(ValidationReport report, Expression expression)
   {
      return new Object[] { report, expression };
   }

   public static final Object[] pattern_DefaultExpressionTransformer_3_7_ReportIncompatibleTypes_greenBBFB(ValidationReport report, Expression expression,
         DefaultExpressionTransformer _this)
   {
      ErrorMessage incompatibleType = ResultFactory.eINSTANCE.createErrorMessage();
      Severity incompatibleType_severity_prime = Severity.WARNING;
      String _localVariable_0 = _this.lookupErrorMessage(Errors.INCOMPATIBLE_TYPE);
      report.getErrorMessages().add(incompatibleType);
      incompatibleType.getLocation().add(expression);
      incompatibleType.setSeverity(incompatibleType_severity_prime);
      String incompatibleType_id_prime = _localVariable_0;
      incompatibleType.setId(incompatibleType_id_prime);
      return new Object[] { report, expression, incompatibleType, _this };
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //DefaultExpressionTransformerImpl
