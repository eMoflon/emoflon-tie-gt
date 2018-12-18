/**
 */
package org.moflon.sdm.compiler.democles.validation.scope.impl;

import SDMLanguage.patterns.StoryPattern;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.gervarro.democles.common.Adornment;

import org.gervarro.democles.specification.emf.Constraint;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.PatternInvocationConstraint;

import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;

import org.moflon.sdm.compiler.democles.validation.scope.BlackPatternBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.PatternMatcher;
import org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.ScopePackage;
import org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator;

import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.RegularPatternInvocation;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Black Pattern Builder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BlackPatternBuilderImpl extends CompoundPatternInvocationBuilderImpl implements BlackPatternBuilder
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected BlackPatternBuilderImpl()
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
      return ScopePackage.Literals.BLACK_PATTERN_BUILDER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void analyzeDependencies(PatternInvocationBuilder invocationBuilder, StoryPattern storyPattern, Pattern pattern)
   {

      Object[] result1_black = BlackPatternBuilderImpl.pattern_BlackPatternBuilder_0_1_Init_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      // 
      BlackPatternBuilderImpl.pattern_BlackPatternBuilder_0_2_AnalyzeDependenciesInSuperclass_expressionBBBB(this, invocationBuilder, storyPattern, pattern);
      // 
      Object[] result3_black = BlackPatternBuilderImpl.pattern_BlackPatternBuilder_0_3_LookupNacPatternBuilder_blackBF(this);
      if (result3_black != null)
      {
         NacPatternBuilder nacPatternBuilder = (NacPatternBuilder) result3_black[1];
         // 
         BlackPatternBuilderImpl.pattern_BlackPatternBuilder_0_4_AnalyzeDependenciesInNacPatternBuilder_expressionBBBB(nacPatternBuilder, this, storyPattern,
               pattern);

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
   public void analyzeDependenciesInSuperclass(PatternInvocationBuilder invocationBuilder, StoryPattern storyPattern, Pattern pattern)
   {
      // [user code injected with eMoflon]

      super.analyzeDependencies(invocationBuilder, storyPattern, pattern);

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void buildPatternContent(RegularPatternInvocation invocation, StoryPattern storyPattern)
   {

      Object[] result1_black = BlackPatternBuilderImpl.pattern_BlackPatternBuilder_2_1_Init_blackFFFBB(this, invocation);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[invocation] = " + invocation + ".");
      }
      PatternBody body = (PatternBody) result1_black[0];
      CFNode node = (CFNode) result1_black[1];
      Pattern pattern = (Pattern) result1_black[2];
      // 
      BlackPatternBuilderImpl.pattern_BlackPatternBuilder_2_2_BuildBlackPatternContent_expressionBBB(this, invocation, storyPattern);
      // 
      if (BlackPatternBuilderImpl.pattern_BlackPatternBuilder_2_3_CheckForErrors_expressionFB(this))
      {
         return;
      } else
      {
         // 
         Object[] result5_black = BlackPatternBuilderImpl.pattern_BlackPatternBuilder_2_5_LookupNacPatternBuilder_blackBF(this);
         if (result5_black != null)
         {
            NacPatternBuilder nacPatternBuilder = (NacPatternBuilder) result5_black[1];
            BlackPatternBuilderImpl.pattern_BlackPatternBuilder_2_5_LookupNacPatternBuilder_greenB(nacPatternBuilder);

            // 
            BlackPatternBuilderImpl.pattern_BlackPatternBuilder_2_6_BuildNacPatternInterface_expressionBBB(nacPatternBuilder, node, storyPattern);
            // 
            BlackPatternBuilderImpl.pattern_BlackPatternBuilder_2_7_BuildNacPatternContent_expressionBBB(nacPatternBuilder, invocation, storyPattern);
            // 
            BlackPatternBuilderImpl.pattern_BlackPatternBuilder_2_8_BuildAndEmbedSimpleNacPatterns_expressionBBB(nacPatternBuilder, storyPattern, pattern);
            // 
            if (BlackPatternBuilderImpl.pattern_BlackPatternBuilder_2_9_HasErrors_expressionFB(this))
            {
               return;
            } else
            {
               // 
               Object[] result11_bindingAndBlack = BlackPatternBuilderImpl.pattern_BlackPatternBuilder_2_11_LookupPatternMatcher_bindingAndBlackFBFF(this);
               if (result11_bindingAndBlack != null)
               {
                  PatternMatcher patternMatcher = (PatternMatcher) result11_bindingAndBlack[0];
                  //nothing ScopeValidator scopeValidator = (ScopeValidator) result11_bindingAndBlack[2];
                  ValidationReport report = (ValidationReport) result11_bindingAndBlack[3];
                  // ForEach 
                  for (Object[] result12_black : BlackPatternBuilderImpl.pattern_BlackPatternBuilder_2_12_ForAllNacPatterns_blackFBF(body))
                  {
                     Pattern nacPattern = (Pattern) result12_black[0];
                     //nothing PatternInvocationConstraint nacPatternInvocation = (PatternInvocationConstraint) result12_black[2];

                     Object[] result13_bindingAndBlack = BlackPatternBuilderImpl
                           .pattern_BlackPatternBuilder_2_13_GenerateSearchPlanForNacPattern_bindingAndBlackFBBB(patternMatcher, nacPattern, nacPatternBuilder);
                     if (result13_bindingAndBlack == null)
                     {
                        throw new RuntimeException("Pattern matching failed." + " Variables: " + "[patternMatcher] = " + patternMatcher + ", "
                              + "[nacPattern] = " + nacPattern + ", " + "[nacPatternBuilder] = " + nacPatternBuilder + ".");
                     }
                     ValidationReport searchPlanResult = (ValidationReport) result13_bindingAndBlack[0];
                     // 
                     BlackPatternBuilderImpl.pattern_BlackPatternBuilder_2_14_HandlePatternMatcherReport_expressionBBB(this, invocation, searchPlanResult);
                     // 
                     BlackPatternBuilderImpl.pattern_BlackPatternBuilder_2_15_MergeSearchPlanGenerationResult_expressionBB(report, searchPlanResult);

                  }
                  return;
               } else
               {
                  return;
               }

            }

         } else
         {
            return;
         }

      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void buildPatternContentInSuperclass(RegularPatternInvocation invocation, StoryPattern storyPattern)
   {
      // [user code injected with eMoflon]

      super.buildPatternContent(invocation, storyPattern);

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
      case ScopePackage.BLACK_PATTERN_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN:
         analyzeDependencies((PatternInvocationBuilder) arguments.get(0), (StoryPattern) arguments.get(1), (Pattern) arguments.get(2));
         return null;
      case ScopePackage.BLACK_PATTERN_BUILDER___ANALYZE_DEPENDENCIES_IN_SUPERCLASS__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN:
         analyzeDependenciesInSuperclass((PatternInvocationBuilder) arguments.get(0), (StoryPattern) arguments.get(1), (Pattern) arguments.get(2));
         return null;
      case ScopePackage.BLACK_PATTERN_BUILDER___BUILD_PATTERN_CONTENT__REGULARPATTERNINVOCATION_STORYPATTERN:
         buildPatternContent((RegularPatternInvocation) arguments.get(0), (StoryPattern) arguments.get(1));
         return null;
      case ScopePackage.BLACK_PATTERN_BUILDER___BUILD_PATTERN_CONTENT_IN_SUPERCLASS__REGULARPATTERNINVOCATION_STORYPATTERN:
         buildPatternContentInSuperclass((RegularPatternInvocation) arguments.get(0), (StoryPattern) arguments.get(1));
         return null;
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_BlackPatternBuilder_0_1_Init_blackB(BlackPatternBuilder _this)
   {
      return new Object[] { _this };
   }

   public static final void pattern_BlackPatternBuilder_0_2_AnalyzeDependenciesInSuperclass_expressionBBBB(BlackPatternBuilder _this,
         PatternInvocationBuilder invocationBuilder, StoryPattern storyPattern, Pattern pattern)
   {
      _this.analyzeDependenciesInSuperclass(invocationBuilder, storyPattern, pattern);

   }

   public static final Object[] pattern_BlackPatternBuilder_0_3_LookupNacPatternBuilder_blackBF(BlackPatternBuilder _this)
   {
      for (RegularPatternInvocationBuilder tmpNacPatternBuilder : _this.getChildBuilders())
      {
         if (tmpNacPatternBuilder instanceof NacPatternBuilder)
         {
            NacPatternBuilder nacPatternBuilder = (NacPatternBuilder) tmpNacPatternBuilder;
            return new Object[] { _this, nacPatternBuilder };
         }
      }
      return null;
   }

   public static final void pattern_BlackPatternBuilder_0_4_AnalyzeDependenciesInNacPatternBuilder_expressionBBBB(NacPatternBuilder nacPatternBuilder,
         BlackPatternBuilder _this, StoryPattern storyPattern, Pattern pattern)
   {
      nacPatternBuilder.analyzeDependencies(_this, storyPattern, pattern);

   }

   public static final Object[] pattern_BlackPatternBuilder_2_1_Init_blackFFFBB(BlackPatternBuilder _this, RegularPatternInvocation invocation)
   {
      Pattern pattern = invocation.getPattern();
      if (pattern != null)
      {
         CFNode node = invocation.getCfNode();
         if (node != null)
         {
            for (PatternBody body : pattern.getBodies())
            {
               return new Object[] { body, node, pattern, _this, invocation };
            }
         }

      }

      return null;
   }

   public static final void pattern_BlackPatternBuilder_2_2_BuildBlackPatternContent_expressionBBB(BlackPatternBuilder _this,
         RegularPatternInvocation invocation, StoryPattern storyPattern)
   {
      _this.buildPatternContentInSuperclass(invocation, storyPattern);

   }

   public static final boolean pattern_BlackPatternBuilder_2_3_CheckForErrors_expressionFB(BlackPatternBuilder _this)
   {
      boolean _localVariable_0 = _this.hasErrors();
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final Object[] pattern_BlackPatternBuilder_2_5_LookupNacPatternBuilder_blackBF(BlackPatternBuilder _this)
   {
      for (RegularPatternInvocationBuilder tmpNacPatternBuilder : _this.getChildBuilders())
      {
         if (tmpNacPatternBuilder instanceof NacPatternBuilder)
         {
            NacPatternBuilder nacPatternBuilder = (NacPatternBuilder) tmpNacPatternBuilder;
            return new Object[] { _this, nacPatternBuilder };
         }
      }
      return null;
   }

   public static final Object[] pattern_BlackPatternBuilder_2_5_LookupNacPatternBuilder_greenB(NacPatternBuilder nacPatternBuilder)
   {
      int nacPatternBuilder_nacPatternCounter_prime = Integer.valueOf(0);
      nacPatternBuilder.setNacPatternCounter(Integer.valueOf(nacPatternBuilder_nacPatternCounter_prime));
      return new Object[] { nacPatternBuilder };
   }

   public static final void pattern_BlackPatternBuilder_2_6_BuildNacPatternInterface_expressionBBB(NacPatternBuilder nacPatternBuilder, CFNode node,
         StoryPattern storyPattern)
   {
      nacPatternBuilder.buildPatternInterface(node, storyPattern);

   }

   public static final void pattern_BlackPatternBuilder_2_7_BuildNacPatternContent_expressionBBB(NacPatternBuilder nacPatternBuilder,
         RegularPatternInvocation invocation, StoryPattern storyPattern)
   {
      nacPatternBuilder.buildPatternContent(invocation, storyPattern);

   }

   public static final void pattern_BlackPatternBuilder_2_8_BuildAndEmbedSimpleNacPatterns_expressionBBB(NacPatternBuilder nacPatternBuilder,
         StoryPattern storyPattern, Pattern pattern)
   {
      nacPatternBuilder.handleSimpleNacPattern(storyPattern, pattern);

   }

   public static final boolean pattern_BlackPatternBuilder_2_9_HasErrors_expressionFB(BlackPatternBuilder _this)
   {
      boolean _localVariable_0 = _this.hasErrors();
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final Object[] pattern_BlackPatternBuilder_2_11_LookupPatternMatcher_bindingFB(BlackPatternBuilder _this)
   {
      ScopeValidator _localVariable_1 = _this.lookupScopeValidator();
      ScopeValidator scopeValidator = _localVariable_1;
      if (scopeValidator != null)
      {
         return new Object[] { scopeValidator, _this };
      }
      return null;
   }

   public static final Object[] pattern_BlackPatternBuilder_2_11_LookupPatternMatcher_blackFBBF(BlackPatternBuilder _this, ScopeValidator scopeValidator)
   {
      PatternMatcher patternMatcher = _this.getPatternMatcher();
      if (patternMatcher != null)
      {
         ValidationReport report = scopeValidator.getValidationReport();
         if (report != null)
         {
            return new Object[] { patternMatcher, _this, scopeValidator, report };
         }

      }

      return null;
   }

   public static final Object[] pattern_BlackPatternBuilder_2_11_LookupPatternMatcher_bindingAndBlackFBFF(BlackPatternBuilder _this)
   {
      Object[] result_pattern_BlackPatternBuilder_2_11_LookupPatternMatcher_binding = pattern_BlackPatternBuilder_2_11_LookupPatternMatcher_bindingFB(_this);
      if (result_pattern_BlackPatternBuilder_2_11_LookupPatternMatcher_binding != null)
      {
         ScopeValidator scopeValidator = (ScopeValidator) result_pattern_BlackPatternBuilder_2_11_LookupPatternMatcher_binding[0];

         Object[] result_pattern_BlackPatternBuilder_2_11_LookupPatternMatcher_black = pattern_BlackPatternBuilder_2_11_LookupPatternMatcher_blackFBBF(_this,
               scopeValidator);
         if (result_pattern_BlackPatternBuilder_2_11_LookupPatternMatcher_black != null)
         {
            PatternMatcher patternMatcher = (PatternMatcher) result_pattern_BlackPatternBuilder_2_11_LookupPatternMatcher_black[0];
            ValidationReport report = (ValidationReport) result_pattern_BlackPatternBuilder_2_11_LookupPatternMatcher_black[3];

            return new Object[] { patternMatcher, _this, scopeValidator, report };
         }
      }
      return null;
   }

   public static final Iterable<Object[]> pattern_BlackPatternBuilder_2_12_ForAllNacPatterns_blackFBF(PatternBody body)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (Constraint tmpNacPatternInvocation : body.getConstraints())
      {
         if (tmpNacPatternInvocation instanceof PatternInvocationConstraint)
         {
            PatternInvocationConstraint nacPatternInvocation = (PatternInvocationConstraint) tmpNacPatternInvocation;
            Pattern nacPattern = nacPatternInvocation.getInvokedPattern();
            if (nacPattern != null)
            {
               boolean nacPatternInvocation_positive = nacPatternInvocation.isPositive();
               if (Boolean.valueOf(nacPatternInvocation_positive).equals(Boolean.valueOf(false)))
               {
                  _result.add(new Object[] { nacPattern, body, nacPatternInvocation });
               }

            }

         }
      }
      return _result;
   }

   public static final Object[] pattern_BlackPatternBuilder_2_13_GenerateSearchPlanForNacPattern_bindingFBBB(PatternMatcher patternMatcher, Pattern nacPattern,
         NacPatternBuilder nacPatternBuilder)
   {
      Adornment _localVariable_1 = nacPatternBuilder.createAllBoundAdornment(nacPattern);
      ValidationReport _localVariable_0 = patternMatcher.generateSearchPlan(nacPattern, _localVariable_1, Boolean.valueOf(false));
      ValidationReport searchPlanResult = _localVariable_0;
      if (searchPlanResult != null)
      {
         return new Object[] { searchPlanResult, patternMatcher, nacPattern, nacPatternBuilder };
      }
      return null;
   }

   public static final Object[] pattern_BlackPatternBuilder_2_13_GenerateSearchPlanForNacPattern_blackB(ValidationReport searchPlanResult)
   {
      return new Object[] { searchPlanResult };
   }

   public static final Object[] pattern_BlackPatternBuilder_2_13_GenerateSearchPlanForNacPattern_bindingAndBlackFBBB(PatternMatcher patternMatcher,
         Pattern nacPattern, NacPatternBuilder nacPatternBuilder)
   {
      Object[] result_pattern_BlackPatternBuilder_2_13_GenerateSearchPlanForNacPattern_binding = pattern_BlackPatternBuilder_2_13_GenerateSearchPlanForNacPattern_bindingFBBB(
            patternMatcher, nacPattern, nacPatternBuilder);
      if (result_pattern_BlackPatternBuilder_2_13_GenerateSearchPlanForNacPattern_binding != null)
      {
         ValidationReport searchPlanResult = (ValidationReport) result_pattern_BlackPatternBuilder_2_13_GenerateSearchPlanForNacPattern_binding[0];

         Object[] result_pattern_BlackPatternBuilder_2_13_GenerateSearchPlanForNacPattern_black = pattern_BlackPatternBuilder_2_13_GenerateSearchPlanForNacPattern_blackB(
               searchPlanResult);
         if (result_pattern_BlackPatternBuilder_2_13_GenerateSearchPlanForNacPattern_black != null)
         {

            return new Object[] { searchPlanResult, patternMatcher, nacPattern, nacPatternBuilder };
         }
      }
      return null;
   }

   public static final void pattern_BlackPatternBuilder_2_14_HandlePatternMatcherReport_expressionBBB(BlackPatternBuilder _this,
         RegularPatternInvocation invocation, ValidationReport searchPlanResult)
   {
      _this.handlePatternMatcherReport(invocation, searchPlanResult);

   }

   public static final void pattern_BlackPatternBuilder_2_15_MergeSearchPlanGenerationResult_expressionBB(ValidationReport report,
         ValidationReport searchPlanResult)
   {
      report.merge(searchPlanResult);

   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //BlackPatternBuilderImpl
