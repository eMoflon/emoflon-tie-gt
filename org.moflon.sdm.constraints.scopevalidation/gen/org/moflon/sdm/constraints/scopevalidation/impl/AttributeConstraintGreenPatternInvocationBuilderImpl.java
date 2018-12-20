/**
 */
package org.moflon.sdm.constraints.scopevalidation.impl;

import SDMLanguage.patterns.BindingOperator;
import SDMLanguage.patterns.ObjectVariable;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.moflon.sdm.compiler.democles.validation.result.ErrorMessage;
import org.moflon.sdm.compiler.democles.validation.result.ResultFactory;
import org.moflon.sdm.compiler.democles.validation.result.Severity;
import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;

import org.moflon.sdm.compiler.democles.validation.scope.Errors;
import org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator;

import org.moflon.sdm.constraints.scopevalidation.AttributeConstraintGreenPatternInvocationBuilder;
import org.moflon.sdm.constraints.scopevalidation.ScopevalidationPackage;

import org.moflon.sdm.runtime.democles.Action;
import org.moflon.sdm.runtime.democles.CFVariable;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Constraint Green Pattern Invocation Builder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AttributeConstraintGreenPatternInvocationBuilderImpl extends AttributeConstraintBlackPatternInvocationBuilderImpl
      implements AttributeConstraintGreenPatternInvocationBuilder
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected AttributeConstraintGreenPatternInvocationBuilderImpl()
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
      return ScopevalidationPackage.Literals.ATTRIBUTE_CONSTRAINT_GREEN_PATTERN_INVOCATION_BUILDER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void validateVariable(Action action, CFVariable variable, ObjectVariable objectVariable)
   {// 
      Object[] result1_black = AttributeConstraintGreenPatternInvocationBuilderImpl
            .pattern_AttributeConstraintGreenPatternInvocationBuilder_0_1_IsVariableFree_blackBB(action, variable);
      if (result1_black != null)
      {
         // 
         Object[] result2_black = AttributeConstraintGreenPatternInvocationBuilderImpl
               .pattern_AttributeConstraintGreenPatternInvocationBuilder_0_2_IsGreenVariable_blackB(objectVariable);
         if (result2_black != null)
         {
            return;
         } else
         {

            Object[] result4_bindingAndBlack = AttributeConstraintGreenPatternInvocationBuilderImpl
                  .pattern_AttributeConstraintGreenPatternInvocationBuilder_0_4_ReportErrorByNonGreenFreeVariables_bindingAndBlackBFFB(this, objectVariable);
            if (result4_bindingAndBlack == null)
            {
               throw new RuntimeException(
                     "Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[objectVariable] = " + objectVariable + ".");
            }
            ScopeValidator scopeValidator = (ScopeValidator) result4_bindingAndBlack[1];
            ValidationReport report = (ValidationReport) result4_bindingAndBlack[2];
            AttributeConstraintGreenPatternInvocationBuilderImpl
                  .pattern_AttributeConstraintGreenPatternInvocationBuilder_0_4_ReportErrorByNonGreenFreeVariables_greenBBFB(report, objectVariable,
                        scopeValidator);
            //nothing ErrorMessage errorGreenNotFree = (ErrorMessage) result4_green[2];

            return;
         }

      } else
      {
         // 
         Object[] result6_black = AttributeConstraintGreenPatternInvocationBuilderImpl
               .pattern_AttributeConstraintGreenPatternInvocationBuilder_0_6_IsBlackVariable_blackB(objectVariable);
         if (result6_black != null)
         {
            return;
         } else
         {
            // 
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
   public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
   {
      switch (operationID)
      {
      case ScopevalidationPackage.ATTRIBUTE_CONSTRAINT_GREEN_PATTERN_INVOCATION_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE:
         validateVariable((Action) arguments.get(0), (CFVariable) arguments.get(1), (ObjectVariable) arguments.get(2));
         return null;
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_AttributeConstraintGreenPatternInvocationBuilder_0_1_IsVariableFree_blackBB(Action action, CFVariable variable)
   {
      if (action.equals(variable.getConstructor()))
      {
         return new Object[] { action, variable };
      }
      return null;
   }

   public static final Object[] pattern_AttributeConstraintGreenPatternInvocationBuilder_0_2_IsGreenVariable_blackB(ObjectVariable objectVariable)
   {
      BindingOperator objectVariable_bindingOperator = objectVariable.getBindingOperator();
      if (objectVariable_bindingOperator.equals(BindingOperator.CREATE))
      {
         return new Object[] { objectVariable };
      }

      return null;
   }

   public static final Object[] pattern_AttributeConstraintGreenPatternInvocationBuilder_0_4_ReportErrorByNonGreenFreeVariables_bindingFB(
         AttributeConstraintGreenPatternInvocationBuilder _this)
   {
      ScopeValidator _localVariable_0 = _this.lookupScopeValidator();
      ScopeValidator scopeValidator = _localVariable_0;
      if (scopeValidator != null)
      {
         return new Object[] { scopeValidator, _this };
      }
      return null;
   }

   public static final Object[] pattern_AttributeConstraintGreenPatternInvocationBuilder_0_4_ReportErrorByNonGreenFreeVariables_blackBBFB(
         AttributeConstraintGreenPatternInvocationBuilder _this, ScopeValidator scopeValidator, ObjectVariable objectVariable)
   {
      ValidationReport report = scopeValidator.getValidationReport();
      if (report != null)
      {
         return new Object[] { _this, scopeValidator, report, objectVariable };
      }

      return null;
   }

   public static final Object[] pattern_AttributeConstraintGreenPatternInvocationBuilder_0_4_ReportErrorByNonGreenFreeVariables_bindingAndBlackBFFB(
         AttributeConstraintGreenPatternInvocationBuilder _this, ObjectVariable objectVariable)
   {
      Object[] result_pattern_AttributeConstraintGreenPatternInvocationBuilder_0_4_ReportErrorByNonGreenFreeVariables_binding = pattern_AttributeConstraintGreenPatternInvocationBuilder_0_4_ReportErrorByNonGreenFreeVariables_bindingFB(
            _this);
      if (result_pattern_AttributeConstraintGreenPatternInvocationBuilder_0_4_ReportErrorByNonGreenFreeVariables_binding != null)
      {
         ScopeValidator scopeValidator = (ScopeValidator) result_pattern_AttributeConstraintGreenPatternInvocationBuilder_0_4_ReportErrorByNonGreenFreeVariables_binding[0];

         Object[] result_pattern_AttributeConstraintGreenPatternInvocationBuilder_0_4_ReportErrorByNonGreenFreeVariables_black = pattern_AttributeConstraintGreenPatternInvocationBuilder_0_4_ReportErrorByNonGreenFreeVariables_blackBBFB(
               _this, scopeValidator, objectVariable);
         if (result_pattern_AttributeConstraintGreenPatternInvocationBuilder_0_4_ReportErrorByNonGreenFreeVariables_black != null)
         {
            ValidationReport report = (ValidationReport) result_pattern_AttributeConstraintGreenPatternInvocationBuilder_0_4_ReportErrorByNonGreenFreeVariables_black[2];

            return new Object[] { _this, scopeValidator, report, objectVariable };
         }
      }
      return null;
   }

   public static final Object[] pattern_AttributeConstraintGreenPatternInvocationBuilder_0_4_ReportErrorByNonGreenFreeVariables_greenBBFB(
         ValidationReport report, ObjectVariable objectVariable, ScopeValidator scopeValidator)
   {
      ErrorMessage errorGreenNotFree = ResultFactory.eINSTANCE.createErrorMessage();
      Severity errorGreenNotFree_severity_prime = Severity.ERROR;
      String _localVariable_0 = scopeValidator.lookupErrorMessage(Errors.GREEN_VAR_IS_NOT_NEW);
      errorGreenNotFree.getLocation().add(objectVariable);
      report.getErrorMessages().add(errorGreenNotFree);
      errorGreenNotFree.setSeverity(errorGreenNotFree_severity_prime);
      String errorGreenNotFree_id_prime = _localVariable_0;
      errorGreenNotFree.setId(errorGreenNotFree_id_prime);
      return new Object[] { report, objectVariable, errorGreenNotFree, scopeValidator };
   }

   public static final Object[] pattern_AttributeConstraintGreenPatternInvocationBuilder_0_6_IsBlackVariable_blackB(ObjectVariable objectVariable)
   {
      BindingOperator objectVariable_bindingOperator = objectVariable.getBindingOperator();
      if (objectVariable_bindingOperator.equals(BindingOperator.CHECK_ONLY))
      {
         return new Object[] { objectVariable };
      }

      return null;
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //AttributeConstraintGreenPatternInvocationBuilderImpl
