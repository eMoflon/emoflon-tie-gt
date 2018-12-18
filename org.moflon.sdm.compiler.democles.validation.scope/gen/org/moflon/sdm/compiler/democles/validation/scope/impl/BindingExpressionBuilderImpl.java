/**
 */
package org.moflon.sdm.compiler.democles.validation.scope.impl;

import SDMLanguage.expressions.Expression;

import SDMLanguage.patterns.ObjectVariable;
import SDMLanguage.patterns.StoryPattern;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gervarro.democles.specification.emf.Pattern;

import org.moflon.sdm.compiler.democles.validation.result.ErrorMessage;
import org.moflon.sdm.compiler.democles.validation.result.ResultFactory;
import org.moflon.sdm.compiler.democles.validation.result.Severity;
import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;

import org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.BindingExpressionBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.Errors;
import org.moflon.sdm.compiler.democles.validation.scope.ExpressionExplorer;
import org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.ScopePackage;
import org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator;

import org.moflon.sdm.runtime.democles.Action;
import org.moflon.sdm.runtime.democles.BindingPatternInvocation;
import org.moflon.sdm.runtime.democles.CFVariable;
import org.moflon.sdm.runtime.democles.CompoundNode;
import org.moflon.sdm.runtime.democles.DemoclesFactory;
import org.moflon.sdm.runtime.democles.Scope;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Expression Builder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BindingExpressionBuilderImpl extends RegularPatternInvocationBuilderImpl implements BindingExpressionBuilder
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected BindingExpressionBuilderImpl()
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
      return ScopePackage.Literals.BINDING_EXPRESSION_BUILDER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void analyzeDependencies(PatternInvocationBuilder patternInvocationBuilder, StoryPattern storyPattern, Pattern pattern)
   {

      Object[] result1_black = BindingExpressionBuilderImpl.pattern_BindingExpressionBuilder_0_1_LookupExpressionExplorer_blackFB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      ExpressionExplorer expressionExplorer = (ExpressionExplorer) result1_black[0];
      // ForEach 
      for (Object[] result2_black : BindingExpressionBuilderImpl.pattern_BindingExpressionBuilder_0_2_ForAllObjectVariables_blackFB(storyPattern))
      {
         ObjectVariable objectVariable = (ObjectVariable) result2_black[0];
         // 
         Object[] result3_black = BindingExpressionBuilderImpl.pattern_BindingExpressionBuilder_0_3_IsRelevantObjectVariable_blackFB(objectVariable);
         if (result3_black != null)
         {
            Expression bindingExpression = (Expression) result3_black[0];
            // 
            BindingExpressionBuilderImpl.pattern_BindingExpressionBuilder_0_4_HandleBindingExpression_expressionBBBB(expressionExplorer,
                  patternInvocationBuilder, pattern, bindingExpression);

         } else
         {
         }

      }
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BindingPatternInvocation createAction()
   {

      Object[] result1_green = BindingExpressionBuilderImpl.pattern_BindingExpressionBuilder_1_1_CreateBindingPatternInvocation_greenF();
      if (result1_green == null)
      {
         throw new RuntimeException("Pattern matching failed.");
      }
      BindingPatternInvocation newInvocation = (BindingPatternInvocation) result1_green[0];
      return BindingExpressionBuilderImpl.pattern_BindingExpressionBuilder_1_2_expressionFB(newInvocation);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void validateVariable(Action action, CFVariable variable, ObjectVariable objectVariable)
   {

      Object[] result1_black = BindingExpressionBuilderImpl.pattern_BindingExpressionBuilder_2_1_Init_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }

      Object[] result2_bindingAndBlack = BindingExpressionBuilderImpl.pattern_BindingExpressionBuilder_2_2_LookupValidationReport_bindingAndBlackFFB(this);
      if (result2_bindingAndBlack == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      ValidationReport report = (ValidationReport) result2_bindingAndBlack[0];
      ScopeValidator scopeValidator = (ScopeValidator) result2_bindingAndBlack[1];
      // 
      Object[] result3_black = BindingExpressionBuilderImpl.pattern_BindingExpressionBuilder_2_3_IsVariableFree_blackBB(variable, action);
      if (result3_black != null)
      {
         return;
      } else
      {
         // 
         Object[] result5_black = BindingExpressionBuilderImpl.pattern_BindingExpressionBuilder_2_5_IsVariableInRootScope_blackBF(variable);
         if (result5_black != null)
         {
            //nothing Scope rootScope = (Scope) result5_black[1];
            // 
            Object[] result6_black = BindingExpressionBuilderImpl.pattern_BindingExpressionBuilder_2_6_HasConstructorAction_blackFB(variable);
            if (result6_black != null)
            {
               //nothing Action constructor = (Action) result6_black[0];
            } else
            {

               Object[] result7_black = BindingExpressionBuilderImpl.pattern_BindingExpressionBuilder_2_7_ReportReassignedMethodParameterError_blackBB(report,
                     objectVariable);
               if (result7_black == null)
               {
                  throw new RuntimeException(
                        "Pattern matching failed." + " Variables: " + "[report] = " + report + ", " + "[objectVariable] = " + objectVariable + ".");
               }
               BindingExpressionBuilderImpl.pattern_BindingExpressionBuilder_2_7_ReportReassignedMethodParameterError_greenFBBB(report, objectVariable,
                     scopeValidator);
               //nothing ErrorMessage reassignedMethodParameterError = (ErrorMessage) result7_green[0];

               return;
            }

         } else
         {
         }
         // 
         Object[] result9_black = BindingExpressionBuilderImpl.pattern_BindingExpressionBuilder_2_9_ReassignVariable_blackBB(variable, action);
         if (result9_black != null)
         {
            BindingExpressionBuilderImpl.pattern_BindingExpressionBuilder_2_9_ReassignVariable_greenBB(variable, action);

            return;
         } else
         {

            Object[] result11_black = BindingExpressionBuilderImpl.pattern_BindingExpressionBuilder_2_11_HandleBoundVariableAsError_blackBB(report,
                  objectVariable);
            if (result11_black == null)
            {
               throw new RuntimeException(
                     "Pattern matching failed." + " Variables: " + "[report] = " + report + ", " + "[objectVariable] = " + objectVariable + ".");
            }
            BindingExpressionBuilderImpl.pattern_BindingExpressionBuilder_2_11_HandleBoundVariableAsError_greenBFBB(report, objectVariable, scopeValidator);
            //nothing ErrorMessage errorVarNotFree = (ErrorMessage) result11_green[1];

            return;
         }

      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public int eDerivedOperationID(int baseOperationID, Class<?> baseClass)
   {
      if (baseClass == ActionBuilder.class)
      {
         switch (baseOperationID)
         {
         case ScopePackage.ACTION_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE:
            return ScopePackage.BINDING_EXPRESSION_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE;
         default:
            return super.eDerivedOperationID(baseOperationID, baseClass);
         }
      }
      if (baseClass == PatternInvocationBuilder.class)
      {
         switch (baseOperationID)
         {
         case ScopePackage.PATTERN_INVOCATION_BUILDER___CREATE_ACTION:
            return ScopePackage.BINDING_EXPRESSION_BUILDER___CREATE_ACTION;
         default:
            return super.eDerivedOperationID(baseOperationID, baseClass);
         }
      }
      if (baseClass == RegularPatternInvocationBuilder.class)
      {
         switch (baseOperationID)
         {
         case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN:
            return ScopePackage.BINDING_EXPRESSION_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN;
         case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER___CREATE_ACTION:
            return ScopePackage.BINDING_EXPRESSION_BUILDER___CREATE_ACTION;
         default:
            return super.eDerivedOperationID(baseOperationID, baseClass);
         }
      }
      return super.eDerivedOperationID(baseOperationID, baseClass);
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
      case ScopePackage.BINDING_EXPRESSION_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN:
         analyzeDependencies((PatternInvocationBuilder) arguments.get(0), (StoryPattern) arguments.get(1), (Pattern) arguments.get(2));
         return null;
      case ScopePackage.BINDING_EXPRESSION_BUILDER___CREATE_ACTION:
         return createAction();
      case ScopePackage.BINDING_EXPRESSION_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE:
         validateVariable((Action) arguments.get(0), (CFVariable) arguments.get(1), (ObjectVariable) arguments.get(2));
         return null;
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_BindingExpressionBuilder_0_1_LookupExpressionExplorer_blackFB(BindingExpressionBuilder _this)
   {
      ExpressionExplorer expressionExplorer = _this.getExpressionExplorer();
      if (expressionExplorer != null)
      {
         return new Object[] { expressionExplorer, _this };
      }

      return null;
   }

   public static final Iterable<Object[]> pattern_BindingExpressionBuilder_0_2_ForAllObjectVariables_blackFB(StoryPattern storyPattern)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (ObjectVariable objectVariable : storyPattern.getObjectVariable())
      {
         _result.add(new Object[] { objectVariable, storyPattern });
      }
      return _result;
   }

   public static final Object[] pattern_BindingExpressionBuilder_0_3_IsRelevantObjectVariable_blackFB(ObjectVariable objectVariable)
   {
      Expression bindingExpression = objectVariable.getBindingExpression();
      if (bindingExpression != null)
      {
         return new Object[] { bindingExpression, objectVariable };
      }

      return null;
   }

   public static final void pattern_BindingExpressionBuilder_0_4_HandleBindingExpression_expressionBBBB(ExpressionExplorer expressionExplorer,
         PatternInvocationBuilder patternInvocationBuilder, Pattern pattern, Expression bindingExpression)
   {
      expressionExplorer.exploreExpression(patternInvocationBuilder, pattern, bindingExpression);

   }

   public static final Object[] pattern_BindingExpressionBuilder_1_1_CreateBindingPatternInvocation_greenF()
   {
      BindingPatternInvocation newInvocation = DemoclesFactory.eINSTANCE.createBindingPatternInvocation();
      return new Object[] { newInvocation };
   }

   public static final BindingPatternInvocation pattern_BindingExpressionBuilder_1_2_expressionFB(BindingPatternInvocation newInvocation)
   {
      BindingPatternInvocation _result = newInvocation;
      return _result;
   }

   public static final Object[] pattern_BindingExpressionBuilder_2_1_Init_blackB(BindingExpressionBuilder _this)
   {
      return new Object[] { _this };
   }

   public static final Object[] pattern_BindingExpressionBuilder_2_2_LookupValidationReport_bindingFB(BindingExpressionBuilder _this)
   {
      ScopeValidator _localVariable_0 = _this.lookupScopeValidator();
      ScopeValidator scopeValidator = _localVariable_0;
      if (scopeValidator != null)
      {
         return new Object[] { scopeValidator, _this };
      }
      return null;
   }

   public static final Object[] pattern_BindingExpressionBuilder_2_2_LookupValidationReport_blackFB(ScopeValidator scopeValidator)
   {
      ValidationReport report = scopeValidator.getValidationReport();
      if (report != null)
      {
         return new Object[] { report, scopeValidator };
      }

      return null;
   }

   public static final Object[] pattern_BindingExpressionBuilder_2_2_LookupValidationReport_bindingAndBlackFFB(BindingExpressionBuilder _this)
   {
      Object[] result_pattern_BindingExpressionBuilder_2_2_LookupValidationReport_binding = pattern_BindingExpressionBuilder_2_2_LookupValidationReport_bindingFB(
            _this);
      if (result_pattern_BindingExpressionBuilder_2_2_LookupValidationReport_binding != null)
      {
         ScopeValidator scopeValidator = (ScopeValidator) result_pattern_BindingExpressionBuilder_2_2_LookupValidationReport_binding[0];

         Object[] result_pattern_BindingExpressionBuilder_2_2_LookupValidationReport_black = pattern_BindingExpressionBuilder_2_2_LookupValidationReport_blackFB(
               scopeValidator);
         if (result_pattern_BindingExpressionBuilder_2_2_LookupValidationReport_black != null)
         {
            ValidationReport report = (ValidationReport) result_pattern_BindingExpressionBuilder_2_2_LookupValidationReport_black[0];

            return new Object[] { report, scopeValidator, _this };
         }
      }
      return null;
   }

   public static final Object[] pattern_BindingExpressionBuilder_2_3_IsVariableFree_blackBB(CFVariable variable, Action action)
   {
      if (action.equals(variable.getConstructor()))
      {
         return new Object[] { variable, action };
      }
      return null;
   }

   public static final Object[] pattern_BindingExpressionBuilder_2_5_IsVariableInRootScope_black_nac_0B(Scope rootScope)
   {
      CompoundNode compoundNode = rootScope.getParent();
      if (compoundNode != null)
      {
         return new Object[] { rootScope };
      }

      return null;
   }

   public static final Object[] pattern_BindingExpressionBuilder_2_5_IsVariableInRootScope_blackBF(CFVariable variable)
   {
      Scope rootScope = variable.getScope();
      if (rootScope != null)
      {
         if (pattern_BindingExpressionBuilder_2_5_IsVariableInRootScope_black_nac_0B(rootScope) == null)
         {
            return new Object[] { variable, rootScope };
         }
      }

      return null;
   }

   public static final Object[] pattern_BindingExpressionBuilder_2_6_HasConstructorAction_blackFB(CFVariable variable)
   {
      Action constructor = variable.getConstructor();
      if (constructor != null)
      {
         return new Object[] { constructor, variable };
      }

      return null;
   }

   public static final Object[] pattern_BindingExpressionBuilder_2_7_ReportReassignedMethodParameterError_blackBB(ValidationReport report,
         ObjectVariable objectVariable)
   {
      return new Object[] { report, objectVariable };
   }

   public static final Object[] pattern_BindingExpressionBuilder_2_7_ReportReassignedMethodParameterError_greenFBBB(ValidationReport report,
         ObjectVariable objectVariable, ScopeValidator scopeValidator)
   {
      ErrorMessage reassignedMethodParameterError = ResultFactory.eINSTANCE.createErrorMessage();
      Severity reassignedMethodParameterError_severity_prime = Severity.ERROR;
      String _localVariable_0 = scopeValidator.lookupErrorMessage(Errors.REASSIGNED_METHOD_PARAMETER);
      reassignedMethodParameterError.getLocation().add(objectVariable);
      report.getErrorMessages().add(reassignedMethodParameterError);
      reassignedMethodParameterError.setSeverity(reassignedMethodParameterError_severity_prime);
      String reassignedMethodParameterError_id_prime = _localVariable_0;
      reassignedMethodParameterError.setId(reassignedMethodParameterError_id_prime);
      return new Object[] { reassignedMethodParameterError, report, objectVariable, scopeValidator };
   }

   public static final Object[] pattern_BindingExpressionBuilder_2_9_ReassignVariable_blackBB(CFVariable variable, Action action)
   {
      return new Object[] { variable, action };
   }

   public static final Object[] pattern_BindingExpressionBuilder_2_9_ReassignVariable_greenBB(CFVariable variable, Action action)
   {
      variable.getReassignments().add(action);
      return new Object[] { variable, action };
   }

   public static final Object[] pattern_BindingExpressionBuilder_2_11_HandleBoundVariableAsError_blackBB(ValidationReport report, ObjectVariable objectVariable)
   {
      return new Object[] { report, objectVariable };
   }

   public static final Object[] pattern_BindingExpressionBuilder_2_11_HandleBoundVariableAsError_greenBFBB(ValidationReport report,
         ObjectVariable objectVariable, ScopeValidator scopeValidator)
   {
      ErrorMessage errorVarNotFree = ResultFactory.eINSTANCE.createErrorMessage();
      Severity errorVarNotFree_severity_prime = Severity.ERROR;
      String _localVariable_0 = scopeValidator.lookupErrorMessage(Errors.BINDING_VAR_NOT_FREE);
      errorVarNotFree.getLocation().add(objectVariable);
      report.getErrorMessages().add(errorVarNotFree);
      errorVarNotFree.setSeverity(errorVarNotFree_severity_prime);
      String errorVarNotFree_id_prime = _localVariable_0;
      errorVarNotFree.setId(errorVarNotFree_id_prime);
      return new Object[] { report, errorVarNotFree, objectVariable, scopeValidator };
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //BindingExpressionBuilderImpl
