/**
 */
package org.moflon.sdm.compiler.democles.validation.scope.impl;

import SDMLanguage.expressions.Expression;

import SDMLanguage.patterns.AttributeAssignment;
import SDMLanguage.patterns.BindingOperator;
import SDMLanguage.patterns.BindingState;
import SDMLanguage.patterns.ObjectVariable;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;

import org.moflon.sdm.compiler.democles.validation.result.ErrorMessage;
import org.moflon.sdm.compiler.democles.validation.result.ResultFactory;
import org.moflon.sdm.compiler.democles.validation.result.Severity;
import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;

import org.moflon.sdm.compiler.democles.validation.scope.Errors;
import org.moflon.sdm.compiler.democles.validation.scope.GreenPatternBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.ScopePackage;
import org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator;

import org.moflon.sdm.runtime.democles.Action;
import org.moflon.sdm.runtime.democles.CFVariable;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Green Pattern Builder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GreenPatternBuilderImpl extends RegularPatternInvocationBuilderImpl implements GreenPatternBuilder
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected GreenPatternBuilderImpl()
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
      return ScopePackage.Literals.GREEN_PATTERN_BUILDER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void validateVariable(Action action, CFVariable variable, ObjectVariable objectVariable)
   {

      Object[] result1_black = GreenPatternBuilderImpl.pattern_GreenPatternBuilder_0_1_Init_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }

      Object[] result2_bindingAndBlack = GreenPatternBuilderImpl.pattern_GreenPatternBuilder_0_2_LookupScopeValidator_bindingAndBlackFB(this);
      if (result2_bindingAndBlack == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      ScopeValidator scopeValidator = (ScopeValidator) result2_bindingAndBlack[0];
      // 
      Object[] result3_black = GreenPatternBuilderImpl.pattern_GreenPatternBuilder_0_3_MultipleAttributeAssignment_blackFBFF(objectVariable);
      if (result3_black != null)
      {
         //nothing AttributeAssignment assignment2 = (AttributeAssignment) result3_black[0];
         //nothing EAttribute attribute = (EAttribute) result3_black[2];
         //nothing AttributeAssignment assignment1 = (AttributeAssignment) result3_black[3];

         Object[] result4_black = GreenPatternBuilderImpl.pattern_GreenPatternBuilder_0_4_ReportMultipleAttributeAssignment_blackFBB(scopeValidator,
               objectVariable);
         if (result4_black == null)
         {
            throw new RuntimeException(
                  "Pattern matching failed." + " Variables: " + "[scopeValidator] = " + scopeValidator + ", " + "[objectVariable] = " + objectVariable + ".");
         }
         ValidationReport report2 = (ValidationReport) result4_black[0];
         GreenPatternBuilderImpl.pattern_GreenPatternBuilder_0_4_ReportMultipleAttributeAssignment_greenBBFB(report2, objectVariable, scopeValidator);
         //nothing ErrorMessage errorMultipleAttributeAssignment = (ErrorMessage) result4_green[2];

      } else
      {
      }
      // 
      Object[] result5_black = GreenPatternBuilderImpl.pattern_GreenPatternBuilder_0_5_IsVariableFree_blackBB(variable, action);
      if (result5_black != null)
      {
         // 
         Object[] result6_black = GreenPatternBuilderImpl.pattern_GreenPatternBuilder_0_6_IsGreenVariable_blackB(objectVariable);
         if (result6_black != null)
         {
            // 
            Object[] result7_black = GreenPatternBuilderImpl.pattern_GreenPatternBuilder_0_7_GreenVariableWithBinding_blackBF(objectVariable);
            if (result7_black != null)
            {
               //nothing Expression binding = (Expression) result7_black[1];

               Object[] result8_black = GreenPatternBuilderImpl.pattern_GreenPatternBuilder_0_8_ReportGreenVariableWithBinding_blackFBB(objectVariable,
                     scopeValidator);
               if (result8_black == null)
               {
                  throw new RuntimeException("Pattern matching failed." + " Variables: " + "[objectVariable] = " + objectVariable + ", " + "[scopeValidator] = "
                        + scopeValidator + ".");
               }
               ValidationReport report4 = (ValidationReport) result8_black[0];
               GreenPatternBuilderImpl.pattern_GreenPatternBuilder_0_8_ReportGreenVariableWithBinding_greenBBFB(report4, objectVariable, scopeValidator);
               //nothing ErrorMessage greenVariableWithBindingError = (ErrorMessage) result8_green[2];

            } else
            {
            }
            // 
            Object[] result9_black = GreenPatternBuilderImpl.pattern_GreenPatternBuilder_0_9_IsFreeGreenVariableMarkedAsBound_blackB(objectVariable);
            if (result9_black != null)
            {

               Object[] result10_black = GreenPatternBuilderImpl.pattern_GreenPatternBuilder_0_10_ReportFreeGreenVariableMarkedAsBound_blackFBB(objectVariable,
                     scopeValidator);
               if (result10_black == null)
               {
                  throw new RuntimeException("Pattern matching failed." + " Variables: " + "[objectVariable] = " + objectVariable + ", " + "[scopeValidator] = "
                        + scopeValidator + ".");
               }
               ValidationReport report3 = (ValidationReport) result10_black[0];
               GreenPatternBuilderImpl.pattern_GreenPatternBuilder_0_10_ReportFreeGreenVariableMarkedAsBound_greenBFBB(report3, objectVariable, scopeValidator);
               //nothing ErrorMessage freeGreenVariableMarkedAsBoundError = (ErrorMessage) result10_green[1];

            } else
            {
            }
            return;
         } else
         {

            Object[] result12_black = GreenPatternBuilderImpl.pattern_GreenPatternBuilder_0_12_ReportErrorByNonGreenFreeVariables_blackFBB(objectVariable,
                  scopeValidator);
            if (result12_black == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[objectVariable] = " + objectVariable + ", " + "[scopeValidator] = "
                     + scopeValidator + ".");
            }
            ValidationReport report = (ValidationReport) result12_black[0];
            GreenPatternBuilderImpl.pattern_GreenPatternBuilder_0_12_ReportErrorByNonGreenFreeVariables_greenBBFB(report, objectVariable, scopeValidator);
            //nothing ErrorMessage errorGreenNotFree = (ErrorMessage) result12_green[2];

            return;
         }

      } else
      {
         // 
         Object[] result14_black = GreenPatternBuilderImpl.pattern_GreenPatternBuilder_0_14_IsBlackVariable_blackB(objectVariable);
         if (result14_black != null)
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
      case ScopePackage.GREEN_PATTERN_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE:
         validateVariable((Action) arguments.get(0), (CFVariable) arguments.get(1), (ObjectVariable) arguments.get(2));
         return null;
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_GreenPatternBuilder_0_1_Init_blackB(GreenPatternBuilder _this)
   {
      return new Object[] { _this };
   }

   public static final Object[] pattern_GreenPatternBuilder_0_2_LookupScopeValidator_bindingFB(GreenPatternBuilder _this)
   {
      ScopeValidator _localVariable_0 = _this.lookupScopeValidator();
      ScopeValidator scopeValidator = _localVariable_0;
      if (scopeValidator != null)
      {
         return new Object[] { scopeValidator, _this };
      }
      return null;
   }

   public static final Object[] pattern_GreenPatternBuilder_0_2_LookupScopeValidator_blackB(ScopeValidator scopeValidator)
   {
      return new Object[] { scopeValidator };
   }

   public static final Object[] pattern_GreenPatternBuilder_0_2_LookupScopeValidator_bindingAndBlackFB(GreenPatternBuilder _this)
   {
      Object[] result_pattern_GreenPatternBuilder_0_2_LookupScopeValidator_binding = pattern_GreenPatternBuilder_0_2_LookupScopeValidator_bindingFB(_this);
      if (result_pattern_GreenPatternBuilder_0_2_LookupScopeValidator_binding != null)
      {
         ScopeValidator scopeValidator = (ScopeValidator) result_pattern_GreenPatternBuilder_0_2_LookupScopeValidator_binding[0];

         Object[] result_pattern_GreenPatternBuilder_0_2_LookupScopeValidator_black = pattern_GreenPatternBuilder_0_2_LookupScopeValidator_blackB(
               scopeValidator);
         if (result_pattern_GreenPatternBuilder_0_2_LookupScopeValidator_black != null)
         {

            return new Object[] { scopeValidator, _this };
         }
      }
      return null;
   }

   public static final Object[] pattern_GreenPatternBuilder_0_3_MultipleAttributeAssignment_blackFBFF(ObjectVariable objectVariable)
   {
      for (AttributeAssignment assignment1 : objectVariable.getAttributeAssignment())
      {
         EAttribute attribute = assignment1.getAttribute();
         if (attribute != null)
         {
            for (AttributeAssignment assignment2 : objectVariable.getAttributeAssignment())
            {
               if (!assignment1.equals(assignment2))
               {
                  if (attribute.equals(assignment2.getAttribute()))
                  {
                     return new Object[] { assignment2, objectVariable, attribute, assignment1 };
                  }
               }
            }
         }

      }
      return null;
   }

   public static final Object[] pattern_GreenPatternBuilder_0_4_ReportMultipleAttributeAssignment_blackFBB(ScopeValidator scopeValidator,
         ObjectVariable objectVariable)
   {
      ValidationReport report2 = scopeValidator.getValidationReport();
      if (report2 != null)
      {
         return new Object[] { report2, scopeValidator, objectVariable };
      }

      return null;
   }

   public static final Object[] pattern_GreenPatternBuilder_0_4_ReportMultipleAttributeAssignment_greenBBFB(ValidationReport report2,
         ObjectVariable objectVariable, ScopeValidator scopeValidator)
   {
      ErrorMessage errorMultipleAttributeAssignment = ResultFactory.eINSTANCE.createErrorMessage();
      Severity errorMultipleAttributeAssignment_severity_prime = Severity.ERROR;
      String _localVariable_0 = scopeValidator.lookupErrorMessage(Errors.MULTIPLE_ATTRIBUTE_ASSIGNMENT);
      report2.getErrorMessages().add(errorMultipleAttributeAssignment);
      errorMultipleAttributeAssignment.getLocation().add(objectVariable);
      errorMultipleAttributeAssignment.setSeverity(errorMultipleAttributeAssignment_severity_prime);
      String errorMultipleAttributeAssignment_id_prime = _localVariable_0;
      errorMultipleAttributeAssignment.setId(errorMultipleAttributeAssignment_id_prime);
      return new Object[] { report2, objectVariable, errorMultipleAttributeAssignment, scopeValidator };
   }

   public static final Object[] pattern_GreenPatternBuilder_0_5_IsVariableFree_blackBB(CFVariable variable, Action action)
   {
      if (action.equals(variable.getConstructor()))
      {
         return new Object[] { variable, action };
      }
      return null;
   }

   public static final Object[] pattern_GreenPatternBuilder_0_6_IsGreenVariable_blackB(ObjectVariable objectVariable)
   {
      BindingOperator objectVariable_bindingOperator = objectVariable.getBindingOperator();
      if (objectVariable_bindingOperator.equals(BindingOperator.CREATE))
      {
         return new Object[] { objectVariable };
      }

      return null;
   }

   public static final Object[] pattern_GreenPatternBuilder_0_7_GreenVariableWithBinding_blackBF(ObjectVariable objectVariable)
   {
      Expression binding = objectVariable.getBindingExpression();
      if (binding != null)
      {
         return new Object[] { objectVariable, binding };
      }

      return null;
   }

   public static final Object[] pattern_GreenPatternBuilder_0_8_ReportGreenVariableWithBinding_blackFBB(ObjectVariable objectVariable,
         ScopeValidator scopeValidator)
   {
      ValidationReport report4 = scopeValidator.getValidationReport();
      if (report4 != null)
      {
         return new Object[] { report4, objectVariable, scopeValidator };
      }

      return null;
   }

   public static final Object[] pattern_GreenPatternBuilder_0_8_ReportGreenVariableWithBinding_greenBBFB(ValidationReport report4,
         ObjectVariable objectVariable, ScopeValidator scopeValidator)
   {
      ErrorMessage greenVariableWithBindingError = ResultFactory.eINSTANCE.createErrorMessage();
      Severity greenVariableWithBindingError_severity_prime = Severity.ERROR;
      String _localVariable_0 = scopeValidator.lookupErrorMessage(Errors.GREEN_VARIABLE_WITH_BINDING);
      report4.getErrorMessages().add(greenVariableWithBindingError);
      greenVariableWithBindingError.getLocation().add(objectVariable);
      greenVariableWithBindingError.setSeverity(greenVariableWithBindingError_severity_prime);
      String greenVariableWithBindingError_id_prime = _localVariable_0;
      greenVariableWithBindingError.setId(greenVariableWithBindingError_id_prime);
      return new Object[] { report4, objectVariable, greenVariableWithBindingError, scopeValidator };
   }

   public static final Object[] pattern_GreenPatternBuilder_0_9_IsFreeGreenVariableMarkedAsBound_blackB(ObjectVariable objectVariable)
   {
      BindingState objectVariable_bindingState = objectVariable.getBindingState();
      if (objectVariable_bindingState.equals(BindingState.BOUND))
      {
         return new Object[] { objectVariable };
      }

      return null;
   }

   public static final Object[] pattern_GreenPatternBuilder_0_10_ReportFreeGreenVariableMarkedAsBound_blackFBB(ObjectVariable objectVariable,
         ScopeValidator scopeValidator)
   {
      ValidationReport report3 = scopeValidator.getValidationReport();
      if (report3 != null)
      {
         return new Object[] { report3, objectVariable, scopeValidator };
      }

      return null;
   }

   public static final Object[] pattern_GreenPatternBuilder_0_10_ReportFreeGreenVariableMarkedAsBound_greenBFBB(ValidationReport report3,
         ObjectVariable objectVariable, ScopeValidator scopeValidator)
   {
      ErrorMessage freeGreenVariableMarkedAsBoundError = ResultFactory.eINSTANCE.createErrorMessage();
      Severity freeGreenVariableMarkedAsBoundError_severity_prime = Severity.ERROR;
      String _localVariable_0 = scopeValidator.lookupErrorMessage(Errors.FREE_GREEN_VARIABLE_MARKED_AS_BOUND);
      report3.getErrorMessages().add(freeGreenVariableMarkedAsBoundError);
      freeGreenVariableMarkedAsBoundError.getLocation().add(objectVariable);
      freeGreenVariableMarkedAsBoundError.setSeverity(freeGreenVariableMarkedAsBoundError_severity_prime);
      String freeGreenVariableMarkedAsBoundError_id_prime = _localVariable_0;
      freeGreenVariableMarkedAsBoundError.setId(freeGreenVariableMarkedAsBoundError_id_prime);
      return new Object[] { report3, freeGreenVariableMarkedAsBoundError, objectVariable, scopeValidator };
   }

   public static final Object[] pattern_GreenPatternBuilder_0_12_ReportErrorByNonGreenFreeVariables_blackFBB(ObjectVariable objectVariable,
         ScopeValidator scopeValidator)
   {
      ValidationReport report = scopeValidator.getValidationReport();
      if (report != null)
      {
         return new Object[] { report, objectVariable, scopeValidator };
      }

      return null;
   }

   public static final Object[] pattern_GreenPatternBuilder_0_12_ReportErrorByNonGreenFreeVariables_greenBBFB(ValidationReport report,
         ObjectVariable objectVariable, ScopeValidator scopeValidator)
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

   public static final Object[] pattern_GreenPatternBuilder_0_14_IsBlackVariable_blackB(ObjectVariable objectVariable)
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
} //GreenPatternBuilderImpl
