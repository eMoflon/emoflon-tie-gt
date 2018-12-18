/**
 */
package org.moflon.sdm.compiler.democles.validation.scope.impl;

import SDMLanguage.calls.ParameterBinding;

import SDMLanguage.calls.callExpressions.MethodCallExpression;
import SDMLanguage.calls.callExpressions.ParameterExpression;

import SDMLanguage.expressions.Expression;

import SDMLanguage.patterns.ObjectVariable;

import SDMLanguage.patterns.patternExpressions.AttributeValueExpression;
import SDMLanguage.patterns.patternExpressions.ObjectVariableExpression;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.Variable;

import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;

import org.moflon.sdm.compiler.democles.pattern.ExpressionTransformer;

import org.moflon.sdm.compiler.democles.validation.scope.ExpressionExplorer;
import org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.ScopePackage;

import org.moflon.sdm.runtime.democles.VariableReference;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Explorer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.impl.ExpressionExplorerImpl#getExpressionTransformer <em>Expression Transformer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionExplorerImpl extends EObjectImpl implements ExpressionExplorer
{
   /**
    * The cached value of the '{@link #getExpressionTransformer() <em>Expression Transformer</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getExpressionTransformer()
    * @generated
    * @ordered
    */
   protected ExpressionTransformer expressionTransformer;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ExpressionExplorerImpl()
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
      return ScopePackage.Literals.EXPRESSION_EXPLORER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ExpressionTransformer getExpressionTransformer()
   {
      if (expressionTransformer != null && expressionTransformer.eIsProxy())
      {
         InternalEObject oldExpressionTransformer = (InternalEObject) expressionTransformer;
         expressionTransformer = (ExpressionTransformer) eResolveProxy(oldExpressionTransformer);
         if (expressionTransformer != oldExpressionTransformer)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScopePackage.EXPRESSION_EXPLORER__EXPRESSION_TRANSFORMER, oldExpressionTransformer,
                     expressionTransformer));
         }
      }
      return expressionTransformer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ExpressionTransformer basicGetExpressionTransformer()
   {
      return expressionTransformer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setExpressionTransformer(ExpressionTransformer newExpressionTransformer)
   {
      ExpressionTransformer oldExpressionTransformer = expressionTransformer;
      expressionTransformer = newExpressionTransformer;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ScopePackage.EXPRESSION_EXPLORER__EXPRESSION_TRANSFORMER, oldExpressionTransformer,
               expressionTransformer));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void exploreExpression(PatternInvocationBuilder patternInvocationBuilder, Pattern pattern, Expression expression)
   {

      Object[] result1_black = ExpressionExplorerImpl.pattern_ExpressionExplorer_0_1_Init_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      // 
      Object[] result2_bindingAndBlack = ExpressionExplorerImpl.pattern_ExpressionExplorer_0_2_AttributeValueExpressionFound_bindingAndBlackFFFB(expression);
      if (result2_bindingAndBlack != null)
      {
         ObjectVariable attributeOwner = (ObjectVariable) result2_bindingAndBlack[0];
         EClassifier attributeOwnerType = (EClassifier) result2_bindingAndBlack[1];
         //nothing AttributeValueExpression attributeValueExpression = (AttributeValueExpression) result2_bindingAndBlack[2];
         // 
         ExpressionExplorerImpl.pattern_ExpressionExplorer_0_3_HandleSymbolicParameter1_expressionBBBBB(this, patternInvocationBuilder, pattern, attributeOwner,
               attributeOwnerType);
         return;
      } else
      {
         // 
         Object[] result5_bindingAndBlack = ExpressionExplorerImpl.pattern_ExpressionExplorer_0_5_ObjectVariableExpressionFound_bindingAndBlackFFFB(expression);
         if (result5_bindingAndBlack != null)
         {
            EClassifier objectVariableType = (EClassifier) result5_bindingAndBlack[0];
            //nothing ObjectVariableExpression objectVariableExpression = (ObjectVariableExpression) result5_bindingAndBlack[1];
            ObjectVariable objectVariable = (ObjectVariable) result5_bindingAndBlack[2];
            // 
            ExpressionExplorerImpl.pattern_ExpressionExplorer_0_6_HandleSymbolicParameter2_expressionBBBBB(this, patternInvocationBuilder, pattern,
                  objectVariable, objectVariableType);
            return;
         } else
         {
            // 
            Object[] result8_bindingAndBlack = ExpressionExplorerImpl.pattern_ExpressionExplorer_0_8_MethodCallExpressionFound_bindingAndBlackFFB(expression);
            if (result8_bindingAndBlack != null)
            {
               Expression methodOwnerExpression = (Expression) result8_bindingAndBlack[0];
               MethodCallExpression methodCallExpression = (MethodCallExpression) result8_bindingAndBlack[1];
               // 
               ExpressionExplorerImpl.pattern_ExpressionExplorer_0_9_ExploreMethodOwnerExpression_expressionBBBB(this, patternInvocationBuilder, pattern,
                     methodOwnerExpression);
               // ForEach 
               for (Object[] result10_black : ExpressionExplorerImpl.pattern_ExpressionExplorer_0_10_ForAllParameters_blackFBF(methodCallExpression))
               {
                  //nothing ParameterBinding parameterBinding = (ParameterBinding) result10_black[0];
                  Expression parameterValueExpression = (Expression) result10_black[2];
                  // 
                  ExpressionExplorerImpl.pattern_ExpressionExplorer_0_11_ExploreParameterValueExpression_expressionBBBB(this, patternInvocationBuilder, pattern,
                        parameterValueExpression);

               }
               return;
            } else
            {
               // 
               Object[] result13_bindingAndBlack = ExpressionExplorerImpl
                     .pattern_ExpressionExplorer_0_13_ParameterExpressionFound_bindingAndBlackFFFB(expression);
               if (result13_bindingAndBlack != null)
               {
                  //nothing ParameterExpression parameterExpression = (ParameterExpression) result13_bindingAndBlack[0];
                  EParameter eParameter = (EParameter) result13_bindingAndBlack[1];
                  EClassifier parameterType = (EClassifier) result13_bindingAndBlack[2];
                  // 
                  ExpressionExplorerImpl.pattern_ExpressionExplorer_0_14_HandleSymbolicParameter3_expressionBBBBB(this, patternInvocationBuilder, pattern,
                        eParameter, parameterType);
                  return;
               } else
               {
                  return;
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
   public void handleSymbolicParameter(PatternInvocationBuilder patternInvocationBuilder, Pattern pattern, String variableName, EClassifier variableType)
   {// 
      Object[] result1_black = ExpressionExplorerImpl.pattern_ExpressionExplorer_1_1_SymbolicParameterExists_blackBFB(pattern, variableName);
      if (result1_black != null)
      {
         //nothing Variable variable = (Variable) result1_black[1];
         return;
      } else
      {

         Object[] result3_black = ExpressionExplorerImpl.pattern_ExpressionExplorer_1_3_CreateSymbolicParameter_blackBB(pattern, variableType);
         if (result3_black == null)
         {
            throw new RuntimeException(
                  "Pattern matching failed." + " Variables: " + "[pattern] = " + pattern + ", " + "[variableType] = " + variableType + ".");
         }
         Object[] result3_green = ExpressionExplorerImpl.pattern_ExpressionExplorer_1_3_CreateSymbolicParameter_greenBBFB(pattern, variableType, variableName);
         EMFVariable newVariable = (EMFVariable) result3_green[2];

         // 
         ExpressionExplorerImpl.pattern_ExpressionExplorer_1_4_HandleVariableReference_expressionFBBB(patternInvocationBuilder, newVariable, variableType);
         return;
      }

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
      case ScopePackage.EXPRESSION_EXPLORER__EXPRESSION_TRANSFORMER:
         if (resolve)
            return getExpressionTransformer();
         return basicGetExpressionTransformer();
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
      case ScopePackage.EXPRESSION_EXPLORER__EXPRESSION_TRANSFORMER:
         setExpressionTransformer((ExpressionTransformer) newValue);
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
      case ScopePackage.EXPRESSION_EXPLORER__EXPRESSION_TRANSFORMER:
         setExpressionTransformer((ExpressionTransformer) null);
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
      case ScopePackage.EXPRESSION_EXPLORER__EXPRESSION_TRANSFORMER:
         return expressionTransformer != null;
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
      case ScopePackage.EXPRESSION_EXPLORER___EXPLORE_EXPRESSION__PATTERNINVOCATIONBUILDER_PATTERN_EXPRESSION:
         exploreExpression((PatternInvocationBuilder) arguments.get(0), (Pattern) arguments.get(1), (Expression) arguments.get(2));
         return null;
      case ScopePackage.EXPRESSION_EXPLORER___HANDLE_SYMBOLIC_PARAMETER__PATTERNINVOCATIONBUILDER_PATTERN_STRING_ECLASSIFIER:
         handleSymbolicParameter((PatternInvocationBuilder) arguments.get(0), (Pattern) arguments.get(1), (String) arguments.get(2),
               (EClassifier) arguments.get(3));
         return null;
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_ExpressionExplorer_0_1_Init_blackB(ExpressionExplorer _this)
   {
      return new Object[] { _this };
   }

   public static final Object[] pattern_ExpressionExplorer_0_2_AttributeValueExpressionFound_bindingFB(Expression expression)
   {
      Expression tmpAttributeValueExpression = expression;
      if (tmpAttributeValueExpression instanceof AttributeValueExpression)
      {
         AttributeValueExpression attributeValueExpression = (AttributeValueExpression) tmpAttributeValueExpression;
         return new Object[] { attributeValueExpression, expression };
      }
      return null;
   }

   public static final Object[] pattern_ExpressionExplorer_0_2_AttributeValueExpressionFound_blackFFB(AttributeValueExpression attributeValueExpression)
   {
      ObjectVariable attributeOwner = attributeValueExpression.getObject();
      if (attributeOwner != null)
      {
         EClassifier attributeOwnerType = attributeOwner.getType();
         if (attributeOwnerType != null)
         {
            return new Object[] { attributeOwner, attributeOwnerType, attributeValueExpression };
         }

      }

      return null;
   }

   public static final Object[] pattern_ExpressionExplorer_0_2_AttributeValueExpressionFound_bindingAndBlackFFFB(Expression expression)
   {
      Object[] result_pattern_ExpressionExplorer_0_2_AttributeValueExpressionFound_binding = pattern_ExpressionExplorer_0_2_AttributeValueExpressionFound_bindingFB(
            expression);
      if (result_pattern_ExpressionExplorer_0_2_AttributeValueExpressionFound_binding != null)
      {
         AttributeValueExpression attributeValueExpression = (AttributeValueExpression) result_pattern_ExpressionExplorer_0_2_AttributeValueExpressionFound_binding[0];

         Object[] result_pattern_ExpressionExplorer_0_2_AttributeValueExpressionFound_black = pattern_ExpressionExplorer_0_2_AttributeValueExpressionFound_blackFFB(
               attributeValueExpression);
         if (result_pattern_ExpressionExplorer_0_2_AttributeValueExpressionFound_black != null)
         {
            ObjectVariable attributeOwner = (ObjectVariable) result_pattern_ExpressionExplorer_0_2_AttributeValueExpressionFound_black[0];
            EClassifier attributeOwnerType = (EClassifier) result_pattern_ExpressionExplorer_0_2_AttributeValueExpressionFound_black[1];

            return new Object[] { attributeOwner, attributeOwnerType, attributeValueExpression, expression };
         }
      }
      return null;
   }

   public static final void pattern_ExpressionExplorer_0_3_HandleSymbolicParameter1_expressionBBBBB(ExpressionExplorer _this,
         PatternInvocationBuilder patternInvocationBuilder, Pattern pattern, ObjectVariable attributeOwner, EClassifier attributeOwnerType)
   {
      String attributeOwner_name = attributeOwner.getName();
      _this.handleSymbolicParameter(patternInvocationBuilder, pattern, attributeOwner_name, attributeOwnerType);

   }

   public static final Object[] pattern_ExpressionExplorer_0_5_ObjectVariableExpressionFound_bindingFB(Expression expression)
   {
      Expression tmpObjectVariableExpression = expression;
      if (tmpObjectVariableExpression instanceof ObjectVariableExpression)
      {
         ObjectVariableExpression objectVariableExpression = (ObjectVariableExpression) tmpObjectVariableExpression;
         return new Object[] { objectVariableExpression, expression };
      }
      return null;
   }

   public static final Object[] pattern_ExpressionExplorer_0_5_ObjectVariableExpressionFound_blackFBF(ObjectVariableExpression objectVariableExpression)
   {
      ObjectVariable objectVariable = objectVariableExpression.getObject();
      if (objectVariable != null)
      {
         EClassifier objectVariableType = objectVariable.getType();
         if (objectVariableType != null)
         {
            return new Object[] { objectVariableType, objectVariableExpression, objectVariable };
         }

      }

      return null;
   }

   public static final Object[] pattern_ExpressionExplorer_0_5_ObjectVariableExpressionFound_bindingAndBlackFFFB(Expression expression)
   {
      Object[] result_pattern_ExpressionExplorer_0_5_ObjectVariableExpressionFound_binding = pattern_ExpressionExplorer_0_5_ObjectVariableExpressionFound_bindingFB(
            expression);
      if (result_pattern_ExpressionExplorer_0_5_ObjectVariableExpressionFound_binding != null)
      {
         ObjectVariableExpression objectVariableExpression = (ObjectVariableExpression) result_pattern_ExpressionExplorer_0_5_ObjectVariableExpressionFound_binding[0];

         Object[] result_pattern_ExpressionExplorer_0_5_ObjectVariableExpressionFound_black = pattern_ExpressionExplorer_0_5_ObjectVariableExpressionFound_blackFBF(
               objectVariableExpression);
         if (result_pattern_ExpressionExplorer_0_5_ObjectVariableExpressionFound_black != null)
         {
            EClassifier objectVariableType = (EClassifier) result_pattern_ExpressionExplorer_0_5_ObjectVariableExpressionFound_black[0];
            ObjectVariable objectVariable = (ObjectVariable) result_pattern_ExpressionExplorer_0_5_ObjectVariableExpressionFound_black[2];

            return new Object[] { objectVariableType, objectVariableExpression, objectVariable, expression };
         }
      }
      return null;
   }

   public static final void pattern_ExpressionExplorer_0_6_HandleSymbolicParameter2_expressionBBBBB(ExpressionExplorer _this,
         PatternInvocationBuilder patternInvocationBuilder, Pattern pattern, ObjectVariable objectVariable, EClassifier objectVariableType)
   {
      String objectVariable_name = objectVariable.getName();
      _this.handleSymbolicParameter(patternInvocationBuilder, pattern, objectVariable_name, objectVariableType);

   }

   public static final Object[] pattern_ExpressionExplorer_0_8_MethodCallExpressionFound_bindingFB(Expression expression)
   {
      Expression tmpMethodCallExpression = expression;
      if (tmpMethodCallExpression instanceof MethodCallExpression)
      {
         MethodCallExpression methodCallExpression = (MethodCallExpression) tmpMethodCallExpression;
         return new Object[] { methodCallExpression, expression };
      }
      return null;
   }

   public static final Object[] pattern_ExpressionExplorer_0_8_MethodCallExpressionFound_blackFB(MethodCallExpression methodCallExpression)
   {
      Expression methodOwnerExpression = methodCallExpression.getTarget();
      if (methodOwnerExpression != null)
      {
         if (!methodCallExpression.equals(methodOwnerExpression))
         {
            return new Object[] { methodOwnerExpression, methodCallExpression };
         }
      }

      return null;
   }

   public static final Object[] pattern_ExpressionExplorer_0_8_MethodCallExpressionFound_bindingAndBlackFFB(Expression expression)
   {
      Object[] result_pattern_ExpressionExplorer_0_8_MethodCallExpressionFound_binding = pattern_ExpressionExplorer_0_8_MethodCallExpressionFound_bindingFB(
            expression);
      if (result_pattern_ExpressionExplorer_0_8_MethodCallExpressionFound_binding != null)
      {
         MethodCallExpression methodCallExpression = (MethodCallExpression) result_pattern_ExpressionExplorer_0_8_MethodCallExpressionFound_binding[0];

         Object[] result_pattern_ExpressionExplorer_0_8_MethodCallExpressionFound_black = pattern_ExpressionExplorer_0_8_MethodCallExpressionFound_blackFB(
               methodCallExpression);
         if (result_pattern_ExpressionExplorer_0_8_MethodCallExpressionFound_black != null)
         {
            Expression methodOwnerExpression = (Expression) result_pattern_ExpressionExplorer_0_8_MethodCallExpressionFound_black[0];

            return new Object[] { methodOwnerExpression, methodCallExpression, expression };
         }
      }
      return null;
   }

   public static final void pattern_ExpressionExplorer_0_9_ExploreMethodOwnerExpression_expressionBBBB(ExpressionExplorer _this,
         PatternInvocationBuilder patternInvocationBuilder, Pattern pattern, Expression methodOwnerExpression)
   {
      _this.exploreExpression(patternInvocationBuilder, pattern, methodOwnerExpression);

   }

   public static final Iterable<Object[]> pattern_ExpressionExplorer_0_10_ForAllParameters_blackFBF(MethodCallExpression methodCallExpression)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (ParameterBinding parameterBinding : methodCallExpression.getOwnedParameterBindings())
      {
         Expression parameterValueExpression = parameterBinding.getValueExpression();
         if (parameterValueExpression != null)
         {
            if (!methodCallExpression.equals(parameterValueExpression))
            {
               _result.add(new Object[] { parameterBinding, methodCallExpression, parameterValueExpression });
            }
         }

      }
      return _result;
   }

   public static final void pattern_ExpressionExplorer_0_11_ExploreParameterValueExpression_expressionBBBB(ExpressionExplorer _this,
         PatternInvocationBuilder patternInvocationBuilder, Pattern pattern, Expression parameterValueExpression)
   {
      _this.exploreExpression(patternInvocationBuilder, pattern, parameterValueExpression);

   }

   public static final Object[] pattern_ExpressionExplorer_0_13_ParameterExpressionFound_bindingFB(Expression expression)
   {
      Expression tmpParameterExpression = expression;
      if (tmpParameterExpression instanceof ParameterExpression)
      {
         ParameterExpression parameterExpression = (ParameterExpression) tmpParameterExpression;
         return new Object[] { parameterExpression, expression };
      }
      return null;
   }

   public static final Object[] pattern_ExpressionExplorer_0_13_ParameterExpressionFound_blackBFF(ParameterExpression parameterExpression)
   {
      EParameter eParameter = parameterExpression.getParameter();
      if (eParameter != null)
      {
         EClassifier parameterType = eParameter.getEType();
         if (parameterType != null)
         {
            return new Object[] { parameterExpression, eParameter, parameterType };
         }

      }

      return null;
   }

   public static final Object[] pattern_ExpressionExplorer_0_13_ParameterExpressionFound_bindingAndBlackFFFB(Expression expression)
   {
      Object[] result_pattern_ExpressionExplorer_0_13_ParameterExpressionFound_binding = pattern_ExpressionExplorer_0_13_ParameterExpressionFound_bindingFB(
            expression);
      if (result_pattern_ExpressionExplorer_0_13_ParameterExpressionFound_binding != null)
      {
         ParameterExpression parameterExpression = (ParameterExpression) result_pattern_ExpressionExplorer_0_13_ParameterExpressionFound_binding[0];

         Object[] result_pattern_ExpressionExplorer_0_13_ParameterExpressionFound_black = pattern_ExpressionExplorer_0_13_ParameterExpressionFound_blackBFF(
               parameterExpression);
         if (result_pattern_ExpressionExplorer_0_13_ParameterExpressionFound_black != null)
         {
            EParameter eParameter = (EParameter) result_pattern_ExpressionExplorer_0_13_ParameterExpressionFound_black[1];
            EClassifier parameterType = (EClassifier) result_pattern_ExpressionExplorer_0_13_ParameterExpressionFound_black[2];

            return new Object[] { parameterExpression, eParameter, parameterType, expression };
         }
      }
      return null;
   }

   public static final void pattern_ExpressionExplorer_0_14_HandleSymbolicParameter3_expressionBBBBB(ExpressionExplorer _this,
         PatternInvocationBuilder patternInvocationBuilder, Pattern pattern, EParameter eParameter, EClassifier parameterType)
   {
      String eParameter_name = eParameter.getName();
      _this.handleSymbolicParameter(patternInvocationBuilder, pattern, eParameter_name, parameterType);

   }

   public static final Object[] pattern_ExpressionExplorer_1_1_SymbolicParameterExists_blackBFB(Pattern pattern, String variableName)
   {
      for (Variable variable : pattern.getSymbolicParameters())
      {
         String variable_name = variable.getName();
         if (variable_name.equals(variableName))
         {
            return new Object[] { pattern, variable, variableName };
         }

      }
      return null;
   }

   public static final Object[] pattern_ExpressionExplorer_1_3_CreateSymbolicParameter_blackBB(Pattern pattern, EClassifier variableType)
   {
      return new Object[] { pattern, variableType };
   }

   public static final Object[] pattern_ExpressionExplorer_1_3_CreateSymbolicParameter_greenBBFB(Pattern pattern, EClassifier variableType, String variableName)
   {
      EMFVariable newVariable = EMFTypeFactory.eINSTANCE.createEMFVariable();
      String newVariable_name_prime = variableName;
      pattern.getSymbolicParameters().add(newVariable);
      newVariable.setEClassifier(variableType);
      newVariable.setName(newVariable_name_prime);
      return new Object[] { pattern, variableType, newVariable, variableName };
   }

   public static final VariableReference pattern_ExpressionExplorer_1_4_HandleVariableReference_expressionFBBB(
         PatternInvocationBuilder patternInvocationBuilder, EMFVariable newVariable, EClassifier variableType)
   {
      VariableReference _localVariable_0 = patternInvocationBuilder.handleVariableReference(newVariable, variableType);
      VariableReference _result = _localVariable_0;
      return _result;
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //ExpressionExplorerImpl
