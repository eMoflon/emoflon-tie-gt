/**
 */
package org.moflon.sdm.compiler.democles.validation.scope.impl;

import SDMLanguage.patterns.ObjectVariable;
import SDMLanguage.patterns.StoryPattern;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gervarro.democles.specification.emf.Pattern;

import org.moflon.sdm.compiler.democles.validation.result.ErrorMessage;
import org.moflon.sdm.compiler.democles.validation.result.ResultFactory;
import org.moflon.sdm.compiler.democles.validation.result.Severity;
import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;

import org.moflon.sdm.compiler.democles.validation.scope.Errors;
import org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.RedPatternBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.ScopePackage;
import org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator;

import org.moflon.sdm.runtime.democles.Action;
import org.moflon.sdm.runtime.democles.CFVariable;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Red Pattern Builder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RedPatternBuilderImpl extends RegularPatternInvocationBuilderImpl implements RedPatternBuilder
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected RedPatternBuilderImpl()
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
      return ScopePackage.Literals.RED_PATTERN_BUILDER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void validateVariable(Action action, CFVariable variable, ObjectVariable objectVariable)
   {// 
      Object[] result1_black = RedPatternBuilderImpl.pattern_RedPatternBuilder_0_1_IsVariableFree_blackBB(action, variable);
      if (result1_black != null)
      {

         Object[] result2_bindingAndBlack = RedPatternBuilderImpl.pattern_RedPatternBuilder_0_2_ReportFreeVariablesAsError_bindingAndBlackFBBF(objectVariable,
               this);
         if (result2_bindingAndBlack == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[objectVariable] = " + objectVariable + ", " + "[this] = " + this + ".");
         }
         ScopeValidator scopeValidator = (ScopeValidator) result2_bindingAndBlack[0];
         ValidationReport report = (ValidationReport) result2_bindingAndBlack[3];
         RedPatternBuilderImpl.pattern_RedPatternBuilder_0_2_ReportFreeVariablesAsError_greenBBFB(objectVariable, report, scopeValidator);
         //nothing ErrorMessage errorVarNotBound = (ErrorMessage) result2_green[2];

         return;
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
   public void analyzeDependencies(PatternInvocationBuilder patternInvocationBuilder, StoryPattern storyPattern, Pattern pattern)
   {// 
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
      case ScopePackage.RED_PATTERN_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE:
         validateVariable((Action) arguments.get(0), (CFVariable) arguments.get(1), (ObjectVariable) arguments.get(2));
         return null;
      case ScopePackage.RED_PATTERN_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN:
         analyzeDependencies((PatternInvocationBuilder) arguments.get(0), (StoryPattern) arguments.get(1), (Pattern) arguments.get(2));
         return null;
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_RedPatternBuilder_0_1_IsVariableFree_blackBB(Action action, CFVariable variable)
   {
      if (action.equals(variable.getConstructor()))
      {
         return new Object[] { action, variable };
      }
      return null;
   }

   public static final Object[] pattern_RedPatternBuilder_0_2_ReportFreeVariablesAsError_bindingFB(RedPatternBuilder _this)
   {
      ScopeValidator _localVariable_0 = _this.lookupScopeValidator();
      ScopeValidator scopeValidator = _localVariable_0;
      if (scopeValidator != null)
      {
         return new Object[] { scopeValidator, _this };
      }
      return null;
   }

   public static final Object[] pattern_RedPatternBuilder_0_2_ReportFreeVariablesAsError_blackBBBF(ScopeValidator scopeValidator, ObjectVariable objectVariable,
         RedPatternBuilder _this)
   {
      ValidationReport report = scopeValidator.getValidationReport();
      if (report != null)
      {
         return new Object[] { scopeValidator, objectVariable, _this, report };
      }

      return null;
   }

   public static final Object[] pattern_RedPatternBuilder_0_2_ReportFreeVariablesAsError_bindingAndBlackFBBF(ObjectVariable objectVariable,
         RedPatternBuilder _this)
   {
      Object[] result_pattern_RedPatternBuilder_0_2_ReportFreeVariablesAsError_binding = pattern_RedPatternBuilder_0_2_ReportFreeVariablesAsError_bindingFB(
            _this);
      if (result_pattern_RedPatternBuilder_0_2_ReportFreeVariablesAsError_binding != null)
      {
         ScopeValidator scopeValidator = (ScopeValidator) result_pattern_RedPatternBuilder_0_2_ReportFreeVariablesAsError_binding[0];

         Object[] result_pattern_RedPatternBuilder_0_2_ReportFreeVariablesAsError_black = pattern_RedPatternBuilder_0_2_ReportFreeVariablesAsError_blackBBBF(
               scopeValidator, objectVariable, _this);
         if (result_pattern_RedPatternBuilder_0_2_ReportFreeVariablesAsError_black != null)
         {
            ValidationReport report = (ValidationReport) result_pattern_RedPatternBuilder_0_2_ReportFreeVariablesAsError_black[3];

            return new Object[] { scopeValidator, objectVariable, _this, report };
         }
      }
      return null;
   }

   public static final Object[] pattern_RedPatternBuilder_0_2_ReportFreeVariablesAsError_greenBBFB(ObjectVariable objectVariable, ValidationReport report,
         ScopeValidator scopeValidator)
   {
      ErrorMessage errorVarNotBound = ResultFactory.eINSTANCE.createErrorMessage();
      Severity errorVarNotBound_severity_prime = Severity.ERROR;
      String _localVariable_0 = scopeValidator.lookupErrorMessage(Errors.FREE_VAR_IS_RED);
      report.getErrorMessages().add(errorVarNotBound);
      errorVarNotBound.getLocation().add(objectVariable);
      errorVarNotBound.setSeverity(errorVarNotBound_severity_prime);
      String errorVarNotBound_id_prime = _localVariable_0;
      errorVarNotBound.setId(errorVarNotBound_id_prime);
      return new Object[] { objectVariable, report, errorVarNotBound, scopeValidator };
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //RedPatternBuilderImpl
