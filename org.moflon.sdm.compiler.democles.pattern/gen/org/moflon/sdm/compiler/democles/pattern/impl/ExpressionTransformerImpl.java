/**
 */
package org.moflon.sdm.compiler.democles.pattern.impl;

import SDMLanguage.expressions.Expression;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.ConstraintVariable;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.Variable;

import org.gervarro.democles.specification.emf.constraint.relational.Equal;
import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintFactory;

import org.moflon.sdm.compiler.democles.pattern.Errors;
import org.moflon.sdm.compiler.democles.pattern.ExpressionTransformer;
import org.moflon.sdm.compiler.democles.pattern.PatternPackage;
import org.moflon.sdm.compiler.democles.pattern.PatternVariableHandler;

import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Transformer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.pattern.impl.ExpressionTransformerImpl#getDelegate <em>Delegate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ExpressionTransformerImpl extends EObjectImpl implements ExpressionTransformer
{
   /**
    * The cached value of the '{@link #getDelegate() <em>Delegate</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getDelegate()
    * @generated
    * @ordered
    */
   protected ExpressionTransformer delegate;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ExpressionTransformerImpl()
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
      return PatternPackage.Literals.EXPRESSION_TRANSFORMER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ExpressionTransformer getDelegate()
   {
      if (delegate != null && delegate.eIsProxy())
      {
         InternalEObject oldDelegate = (InternalEObject) delegate;
         delegate = (ExpressionTransformer) eResolveProxy(oldDelegate);
         if (delegate != oldDelegate)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternPackage.EXPRESSION_TRANSFORMER__DELEGATE, oldDelegate, delegate));
         }
      }
      return delegate;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ExpressionTransformer basicGetDelegate()
   {
      return delegate;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setDelegate(ExpressionTransformer newDelegate)
   {
      ExpressionTransformer oldDelegate = delegate;
      delegate = newDelegate;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.EXPRESSION_TRANSFORMER__DELEGATE, oldDelegate, delegate));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String lookupErrorMessage(Errors errorID)
   {
      // [user code injected with eMoflon]

      if (Errors.MISSING_DELEGATE == errorID)
      {
         return "Missing delegate expression transformer";
      } else if (Errors.UNHANDLED_EXPRESSION == errorID)
      {
         return "Unable to handle expression";
      } else if (Errors.MISSING_PARAMETER_BINDING == errorID)
      {
         return "Missing parameter binding";
      } else if (Errors.INCOMPATIBLE_TYPE == errorID)
      {
         return "Incompatible type in expression";
      }
      return "Unknown error";

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void transformAndAssignExpression(ValidationReport report, PatternVariableHandler patternVariableHandler, Expression expression, Pattern pattern,
         Variable variable, EClassifier expectedType)
   {

      Object[] result1_black = ExpressionTransformerImpl.pattern_ExpressionTransformer_1_1_LookupThisObject_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      // 
      Object[] result2_bindingAndBlack = ExpressionTransformerImpl.pattern_ExpressionTransformer_1_2_TransformExpression_bindingAndBlackFBBBBBB(this, report,
            patternVariableHandler, expression, pattern, expectedType);
      if (result2_bindingAndBlack != null)
      {
         ConstraintVariable expressionResult = (ConstraintVariable) result2_bindingAndBlack[0];

         Object[] result3_black = ExpressionTransformerImpl.pattern_ExpressionTransformer_1_3_CreateAssignmentConstraint_blackFB(pattern);
         if (result3_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[pattern] = " + pattern + ".");
         }
         PatternBody body = (PatternBody) result3_black[0];
         Object[] result3_green = ExpressionTransformerImpl.pattern_ExpressionTransformer_1_3_CreateAssignmentConstraint_greenBF(body);
         Equal constraint = (Equal) result3_green[1];

         Object[] result4_black = ExpressionTransformerImpl.pattern_ExpressionTransformer_1_4_AddFirstParameter_blackBB(constraint, variable);
         if (result4_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[constraint] = " + constraint + ", " + "[variable] = " + variable + ".");
         }
         ExpressionTransformerImpl.pattern_ExpressionTransformer_1_4_AddFirstParameter_greenFBB(constraint, variable);
         //nothing ConstraintParameter firstParameter = (ConstraintParameter) result4_green[0];

         Object[] result5_black = ExpressionTransformerImpl.pattern_ExpressionTransformer_1_5_AddSecondParameter_blackBB(expressionResult, constraint);
         if (result5_black == null)
         {
            throw new RuntimeException(
                  "Pattern matching failed." + " Variables: " + "[expressionResult] = " + expressionResult + ", " + "[constraint] = " + constraint + ".");
         }
         ExpressionTransformerImpl.pattern_ExpressionTransformer_1_5_AddSecondParameter_greenBFB(expressionResult, constraint);
         //nothing ConstraintParameter secondParameter = (ConstraintParameter) result5_green[1];

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
   public ConstraintVariable transformExpression(ValidationReport report, PatternVariableHandler patternVariableHandler, Expression expression, Pattern pattern,
         EClassifier expectedType)
   {
      // [user code injected with eMoflon]

      // TODO: implement this method here but do not remove the injection marker 
      throw new UnsupportedOperationException();
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
      case PatternPackage.EXPRESSION_TRANSFORMER__DELEGATE:
         if (resolve)
            return getDelegate();
         return basicGetDelegate();
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
      case PatternPackage.EXPRESSION_TRANSFORMER__DELEGATE:
         setDelegate((ExpressionTransformer) newValue);
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
      case PatternPackage.EXPRESSION_TRANSFORMER__DELEGATE:
         setDelegate((ExpressionTransformer) null);
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
      case PatternPackage.EXPRESSION_TRANSFORMER__DELEGATE:
         return delegate != null;
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
      case PatternPackage.EXPRESSION_TRANSFORMER___LOOKUP_ERROR_MESSAGE__ERRORS:
         return lookupErrorMessage((Errors) arguments.get(0));
      case PatternPackage.EXPRESSION_TRANSFORMER___TRANSFORM_AND_ASSIGN_EXPRESSION__VALIDATIONREPORT_PATTERNVARIABLEHANDLER_EXPRESSION_PATTERN_VARIABLE_ECLASSIFIER:
         transformAndAssignExpression((ValidationReport) arguments.get(0), (PatternVariableHandler) arguments.get(1), (Expression) arguments.get(2),
               (Pattern) arguments.get(3), (Variable) arguments.get(4), (EClassifier) arguments.get(5));
         return null;
      case PatternPackage.EXPRESSION_TRANSFORMER___TRANSFORM_EXPRESSION__VALIDATIONREPORT_PATTERNVARIABLEHANDLER_EXPRESSION_PATTERN_ECLASSIFIER:
         return transformExpression((ValidationReport) arguments.get(0), (PatternVariableHandler) arguments.get(1), (Expression) arguments.get(2),
               (Pattern) arguments.get(3), (EClassifier) arguments.get(4));
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_ExpressionTransformer_1_1_LookupThisObject_blackB(ExpressionTransformer _this)
   {
      return new Object[] { _this };
   }

   public static final Object[] pattern_ExpressionTransformer_1_2_TransformExpression_bindingFBBBBBB(ExpressionTransformer _this, ValidationReport report,
         PatternVariableHandler patternVariableHandler, Expression expression, Pattern pattern, EClassifier expectedType)
   {
      ConstraintVariable _localVariable_0 = _this.transformExpression(report, patternVariableHandler, expression, pattern, expectedType);
      ConstraintVariable expressionResult = _localVariable_0;
      if (expressionResult != null)
      {
         return new Object[] { expressionResult, _this, report, patternVariableHandler, expression, pattern, expectedType };
      }
      return null;
   }

   public static final Object[] pattern_ExpressionTransformer_1_2_TransformExpression_blackB(ConstraintVariable expressionResult)
   {
      return new Object[] { expressionResult };
   }

   public static final Object[] pattern_ExpressionTransformer_1_2_TransformExpression_bindingAndBlackFBBBBBB(ExpressionTransformer _this,
         ValidationReport report, PatternVariableHandler patternVariableHandler, Expression expression, Pattern pattern, EClassifier expectedType)
   {
      Object[] result_pattern_ExpressionTransformer_1_2_TransformExpression_binding = pattern_ExpressionTransformer_1_2_TransformExpression_bindingFBBBBBB(
            _this, report, patternVariableHandler, expression, pattern, expectedType);
      if (result_pattern_ExpressionTransformer_1_2_TransformExpression_binding != null)
      {
         ConstraintVariable expressionResult = (ConstraintVariable) result_pattern_ExpressionTransformer_1_2_TransformExpression_binding[0];

         Object[] result_pattern_ExpressionTransformer_1_2_TransformExpression_black = pattern_ExpressionTransformer_1_2_TransformExpression_blackB(
               expressionResult);
         if (result_pattern_ExpressionTransformer_1_2_TransformExpression_black != null)
         {

            return new Object[] { expressionResult, _this, report, patternVariableHandler, expression, pattern, expectedType };
         }
      }
      return null;
   }

   public static final Object[] pattern_ExpressionTransformer_1_3_CreateAssignmentConstraint_blackFB(Pattern pattern)
   {
      for (PatternBody body : pattern.getBodies())
      {
         return new Object[] { body, pattern };
      }
      return null;
   }

   public static final Object[] pattern_ExpressionTransformer_1_3_CreateAssignmentConstraint_greenBF(PatternBody body)
   {
      Equal constraint = RelationalConstraintFactory.eINSTANCE.createEqual();
      body.getConstraints().add(constraint);
      return new Object[] { body, constraint };
   }

   public static final Object[] pattern_ExpressionTransformer_1_4_AddFirstParameter_blackBB(Equal constraint, Variable variable)
   {
      return new Object[] { constraint, variable };
   }

   public static final Object[] pattern_ExpressionTransformer_1_4_AddFirstParameter_greenFBB(Equal constraint, Variable variable)
   {
      ConstraintParameter firstParameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
      firstParameter.setReference(variable);
      constraint.getParameters().add(firstParameter);
      return new Object[] { firstParameter, constraint, variable };
   }

   public static final Object[] pattern_ExpressionTransformer_1_5_AddSecondParameter_blackBB(ConstraintVariable expressionResult, Equal constraint)
   {
      return new Object[] { expressionResult, constraint };
   }

   public static final Object[] pattern_ExpressionTransformer_1_5_AddSecondParameter_greenBFB(ConstraintVariable expressionResult, Equal constraint)
   {
      ConstraintParameter secondParameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
      secondParameter.setReference(expressionResult);
      constraint.getParameters().add(secondParameter);
      return new Object[] { expressionResult, secondParameter, constraint };
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //ExpressionTransformerImpl
