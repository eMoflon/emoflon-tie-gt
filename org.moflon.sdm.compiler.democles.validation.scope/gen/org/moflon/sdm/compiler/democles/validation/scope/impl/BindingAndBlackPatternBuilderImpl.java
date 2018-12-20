/**
 */
package org.moflon.sdm.compiler.democles.validation.scope.impl;

import SDMLanguage.activities.ActivityNode;
import SDMLanguage.activities.StoryNode;

import SDMLanguage.expressions.Expression;

import SDMLanguage.patterns.BindingOperator;
import SDMLanguage.patterns.ObjectVariable;
import SDMLanguage.patterns.StoryPattern;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.PatternInvocationConstraint;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.Variable;

import org.moflon.sdm.compiler.democles.pattern.PatternTransformer;

import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;

import org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.BlackPatternBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.PatternMatcher;
import org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.ScopePackage;
import org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator;

import org.moflon.sdm.runtime.democles.Action;
import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.CFVariable;
import org.moflon.sdm.runtime.democles.RegularPatternInvocation;
// <-- [user defined imports]
import java.util.List;
import org.gervarro.democles.common.Adornment;
import org.moflon.sdm.runtime.democles.VariableReference;
import org.moflon.sdm.compiler.democles.validation.scope.impl.PatternMatcherImpl;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding And Black Pattern Builder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.impl.BindingAndBlackPatternBuilderImpl#getBlackPatternBuilder <em>Black Pattern Builder</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingAndBlackPatternBuilderImpl extends CompoundPatternInvocationBuilderImpl implements BindingAndBlackPatternBuilder
{
   /**
    * The cached value of the '{@link #getBlackPatternBuilder() <em>Black Pattern Builder</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getBlackPatternBuilder()
    * @generated
    * @ordered
    */
   protected BlackPatternBuilder blackPatternBuilder;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected BindingAndBlackPatternBuilderImpl()
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
      return ScopePackage.Literals.BINDING_AND_BLACK_PATTERN_BUILDER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BlackPatternBuilder getBlackPatternBuilder()
   {
      if (blackPatternBuilder != null && blackPatternBuilder.eIsProxy())
      {
         InternalEObject oldBlackPatternBuilder = (InternalEObject) blackPatternBuilder;
         blackPatternBuilder = (BlackPatternBuilder) eResolveProxy(oldBlackPatternBuilder);
         if (blackPatternBuilder != oldBlackPatternBuilder)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScopePackage.BINDING_AND_BLACK_PATTERN_BUILDER__BLACK_PATTERN_BUILDER,
                     oldBlackPatternBuilder, blackPatternBuilder));
         }
      }
      return blackPatternBuilder;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BlackPatternBuilder basicGetBlackPatternBuilder()
   {
      return blackPatternBuilder;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setBlackPatternBuilder(BlackPatternBuilder newBlackPatternBuilder)
   {
      BlackPatternBuilder oldBlackPatternBuilder = blackPatternBuilder;
      blackPatternBuilder = newBlackPatternBuilder;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ScopePackage.BINDING_AND_BLACK_PATTERN_BUILDER__BLACK_PATTERN_BUILDER, oldBlackPatternBuilder,
               blackPatternBuilder));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void analyzeDependencies(PatternInvocationBuilder patternInvocationBuilder, StoryPattern storyPattern, Pattern pattern)
   {// ForEach 
      for (Object[] result1_black : BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_0_1_LookupChildBuilders_blackBF(this))
      {
         RegularPatternInvocationBuilder childBuilder = (RegularPatternInvocationBuilder) result1_black[1];
         // 
         BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_0_2_DelegateToChildBuilder_expressionBBBB(childBuilder, this, storyPattern,
               pattern);

      }
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void buildAction(CFNode node)
   {// 
      Object[] result1_black = BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_1_1_LookupStoryPattern_blackBFF(node);
      if (result1_black != null)
      {
         StoryPattern storyPattern = (StoryPattern) result1_black[1];
         //nothing StoryNode storyNode = (StoryNode) result1_black[2];

         Object[] result2_black = BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_1_2_LookupBlackPatternBuilder_blackBF(this);
         if (result2_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
         }
         BlackPatternBuilder blackPatternBuilder = (BlackPatternBuilder) result2_black[1];
         // 
         Object[] result3_black = BindingAndBlackPatternBuilderImpl
               .pattern_BindingAndBlackPatternBuilder_1_3_HasBindingExpressionInBlackVariable_blackBFF(storyPattern);
         if (result3_black != null)
         {
            //nothing ObjectVariable blackVariable = (ObjectVariable) result3_black[1];
            //nothing Expression blackBindingExpression = (Expression) result3_black[2];
         } else
         {
            // 
            Object[] result4_black = BindingAndBlackPatternBuilderImpl
                  .pattern_BindingAndBlackPatternBuilder_1_4_HasBindingExpressionInRedVariable_blackBFF(storyPattern);
            if (result4_black != null)
            {
               //nothing ObjectVariable redVariable = (ObjectVariable) result4_black[1];
               //nothing Expression redBindingExpression = (Expression) result4_black[2];
            } else
            {
               // 
               BindingAndBlackPatternBuilderImpl
                     .pattern_BindingAndBlackPatternBuilder_1_5_BuildBlackPatternWithoutBindingExpression_expressionBB(blackPatternBuilder, node);
               return;
            }

         }
         // 
         BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_1_7_InvokeBuildActionInSuperclass_expressionBB(this, node);
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
   public void buildActionInSuperClass(CFNode node)
   {
      // [user code injected with eMoflon]

      super.buildAction(node);

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void buildPatternContent(RegularPatternInvocation invocation, StoryPattern storyPattern)
   {
      // [user code injected with eMoflon]

      assert invocation.getParameters().size() == invocation.getPattern().getSymbolicParameters().size();
      List<VariableReference> parameters = invocation.getParameters();
      int[] bindings = new int[parameters.size()];
      for (int i = 0; i < parameters.size(); i++)
      {
         bindings[i] = parameters.get(i).isFree() ? Adornment.FREE : Adornment.BOUND;
      }
      Adornment adornment = PatternMatcherImpl.getBodyAdornment(invocation.getPattern(), new Adornment(bindings));
      for (RegularPatternInvocationBuilder childBuilder : getChildBuilders())
      {
         adornment = processChildPattern(childBuilder, invocation, storyPattern, adornment);
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Adornment calculateNextAdornment(Pattern pattern, Adornment adornment, PatternInvocationConstraint patternInvocationConstraint)
   {
      // [user code injected with eMoflon]

      return PatternMatcherImpl.getNextAdornment(pattern, adornment, patternInvocationConstraint);

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Adornment calculatePatternInvocationAdornment(Pattern pattern, Adornment adornment, PatternInvocationConstraint patternInvocationConstraint)
   {
      // [user code injected with eMoflon]

      return PatternMatcherImpl.getOperationAdornment(pattern, adornment, patternInvocationConstraint);

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void constructEmbeddedPattern(RegularPatternInvocationBuilder patternBuilder, StoryPattern storyPattern, Pattern pattern)
   {

      Object[] result1_bindingAndBlack = BindingAndBlackPatternBuilderImpl
            .pattern_BindingAndBlackPatternBuilder_6_1_LookupValidationReport_bindingAndBlackFBF(this);
      if (result1_bindingAndBlack == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      ValidationReport report = (ValidationReport) result1_bindingAndBlack[0];
      //nothing ScopeValidator scopeValidator = (ScopeValidator) result1_bindingAndBlack[2];

      Object[] result2_black = BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_6_2_LookupPatternTransformer_blackFB(patternBuilder);
      if (result2_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[patternBuilder] = " + patternBuilder + ".");
      }
      PatternTransformer patternTransformer = (PatternTransformer) result2_black[0];
      // ForEach 
      for (Object[] result3_black : BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_6_3_ForAllObjectVariables_blackFB(storyPattern))
      {
         ObjectVariable objectVariable = (ObjectVariable) result3_black[0];
         // 
         if (BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_6_4_IsRelevantVariable_expressionFBB(patternBuilder, objectVariable))
         {

            Object[] result5_black = BindingAndBlackPatternBuilderImpl
                  .pattern_BindingAndBlackPatternBuilder_6_5_LookupObjectVariableType_blackFB(objectVariable);
            if (result5_black == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[objectVariable] = " + objectVariable + ".");
            }
            EClassifier type = (EClassifier) result5_black[0];
            // 
            BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_6_6_CreatePatternVariable_expressionFBBBB(patternTransformer, pattern,
                  objectVariable, type);

         } else
         {
         }

      }
      // 
      BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_6_7_AnalyzeDependencies_expressionBBB(patternBuilder, storyPattern, pattern);

      Object[] result8_bindingAndBlack = BindingAndBlackPatternBuilderImpl
            .pattern_BindingAndBlackPatternBuilder_6_8_BuildPatternContent_bindingAndBlackFBBB(patternTransformer, storyPattern, pattern);
      if (result8_bindingAndBlack == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[patternTransformer] = " + patternTransformer + ", " + "[storyPattern] = "
               + storyPattern + ", " + "[pattern] = " + pattern + ".");
      }
      ValidationReport patternTransformationResult = (ValidationReport) result8_bindingAndBlack[0];
      // 
      BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_6_9_MergePatternTransformationResult_expressionBB(report,
            patternTransformationResult);
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isVariableToAdd(ObjectVariable objectVariable)
   {

      Object[] result1_black = BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_7_1_LookupBlackPatternBuilder_blackFB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      BlackPatternBuilder blackPatternBuilder = (BlackPatternBuilder) result1_black[0];
      // 
      if (BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_7_2_DelegateToBlackPatternBuilder_expressionFBB(blackPatternBuilder,
            objectVariable))
      {
         return BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_7_3_expressionF();
      } else
      {
         return BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_7_4_expressionF();
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Adornment processChildPattern(RegularPatternInvocationBuilder childPatternBuilder, RegularPatternInvocation invocation, StoryPattern storyPattern,
         Adornment adornment)
   {

      Object[] result1_black = BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_8_1_LookupPatternBody_blackBFFBF(this, invocation);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[invocation] = " + invocation + ".");
      }
      CFNode node = (CFNode) result1_black[1];
      PatternBody patternBody = (PatternBody) result1_black[2];
      Pattern pattern = (Pattern) result1_black[4];

      Object[] result2_green = BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_8_2_CreateChildPattern_greenFFBB(childPatternBuilder,
            node);
      if (result2_green == null)
      {
         throw new RuntimeException(
               "Pattern matching failed." + " Variables: " + "[childPatternBuilder] = " + childPatternBuilder + ", " + "[node] = " + node + ".");
      }
      Pattern childPattern = (Pattern) result2_green[0];
      //nothing PatternBody childPatternBody = (PatternBody) result2_green[1];
      // 
      BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_8_3_AttachChildPatternToResource_expressionBBB(this, node, childPattern);
      // 
      BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_8_4_BuildChildPattern_expressionBBBB(this, childPatternBuilder, storyPattern,
            childPattern);

      Object[] result5_black = BindingAndBlackPatternBuilderImpl
            .pattern_BindingAndBlackPatternBuilder_8_5_CreateChildPatternInvocationConstraint_blackBB(patternBody, childPattern);
      if (result5_black == null)
      {
         throw new RuntimeException(
               "Pattern matching failed." + " Variables: " + "[patternBody] = " + patternBody + ", " + "[childPattern] = " + childPattern + ".");
      }
      Object[] result5_green = BindingAndBlackPatternBuilderImpl
            .pattern_BindingAndBlackPatternBuilder_8_5_CreateChildPatternInvocationConstraint_greenBBF(patternBody, childPattern);
      PatternInvocationConstraint childPatternInvocationConstraint = (PatternInvocationConstraint) result5_green[2];

      // ForEach 
      for (Object[] result6_black : BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_8_6_ForAllChildParameters_blackBF(childPattern))
      {
         Variable childParameter = (Variable) result6_black[1];

         Object[] result7_black = BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_8_7_CreateConstraintParameter_blackBBFB(pattern,
               childPatternInvocationConstraint, childParameter);
         if (result7_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[pattern] = " + pattern + ", " + "[childPatternInvocationConstraint] = "
                  + childPatternInvocationConstraint + ", " + "[childParameter] = " + childParameter + ".");
         }
         Variable symbolicVariable = (Variable) result7_black[2];
         BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_8_7_CreateConstraintParameter_greenFBBB(childPatternInvocationConstraint,
               symbolicVariable, childParameter);
         //nothing ConstraintParameter constraintParameter = (ConstraintParameter) result7_green[0];

      }

      Object[] result8_black = BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_8_8_LookupPatternMatcher_blackFB(childPatternBuilder);
      if (result8_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[childPatternBuilder] = " + childPatternBuilder + ".");
      }
      PatternMatcher patternMatcher = (PatternMatcher) result8_black[0];
      // 
      if (BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_8_9_HasErrors_expressionFB(this))
      {
         return BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_8_10_expressionFBBBB(this, pattern, adornment,
               childPatternInvocationConstraint);
      } else
      {

         Object[] result11_bindingAndBlack = BindingAndBlackPatternBuilderImpl
               .pattern_BindingAndBlackPatternBuilder_8_11_GenerateSearchPlan_bindingAndBlackFBBBBBBB(patternMatcher, childPattern, this, pattern, adornment,
                     childPatternInvocationConstraint, invocation);
         if (result11_bindingAndBlack == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[patternMatcher] = " + patternMatcher + ", " + "[childPattern] = "
                  + childPattern + ", " + "[this] = " + this + ", " + "[pattern] = " + pattern + ", " + "[adornment] = " + adornment + ", "
                  + "[childPatternInvocationConstraint] = " + childPatternInvocationConstraint + ", " + "[invocation] = " + invocation + ".");
         }
         ValidationReport patternMatchingReport = (ValidationReport) result11_bindingAndBlack[0];
         // 
         BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_8_12_HandlePatternMatcherReport_expressionBBB(this, invocation,
               patternMatchingReport);

         Object[] result13_bindingAndBlack = BindingAndBlackPatternBuilderImpl
               .pattern_BindingAndBlackPatternBuilder_8_13_LookupValidationReport_bindingAndBlackFFB(this);
         if (result13_bindingAndBlack == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
         }
         ValidationReport report = (ValidationReport) result13_bindingAndBlack[0];
         //nothing ScopeValidator scopeValidator = (ScopeValidator) result13_bindingAndBlack[1];
         // 
         BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_8_14_MergePatternMatchingReport_expressionBB(report, patternMatchingReport);
         return BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_8_15_expressionFBBBB(this, pattern, adornment,
               childPatternInvocationConstraint);
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void validateVariable(Action action, CFVariable variable, ObjectVariable objectVariable)
   {// ForEach 
      for (Object[] result1_black : BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_9_1_ForAllChildBuilders_blackFB(this))
      {
         RegularPatternInvocationBuilder childBuilder = (RegularPatternInvocationBuilder) result1_black[0];
         // 
         if (BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_9_2_IsVariableRelevant_expressionFBB(childBuilder, objectVariable))
         {
            // 
            BindingAndBlackPatternBuilderImpl.pattern_BindingAndBlackPatternBuilder_9_3_InvokeDelegate_expressionBBBB(childBuilder, action, variable,
                  objectVariable);

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
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
      case ScopePackage.BINDING_AND_BLACK_PATTERN_BUILDER__BLACK_PATTERN_BUILDER:
         if (resolve)
            return getBlackPatternBuilder();
         return basicGetBlackPatternBuilder();
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
      case ScopePackage.BINDING_AND_BLACK_PATTERN_BUILDER__BLACK_PATTERN_BUILDER:
         setBlackPatternBuilder((BlackPatternBuilder) newValue);
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
      case ScopePackage.BINDING_AND_BLACK_PATTERN_BUILDER__BLACK_PATTERN_BUILDER:
         setBlackPatternBuilder((BlackPatternBuilder) null);
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
      case ScopePackage.BINDING_AND_BLACK_PATTERN_BUILDER__BLACK_PATTERN_BUILDER:
         return blackPatternBuilder != null;
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
      case ScopePackage.BINDING_AND_BLACK_PATTERN_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN:
         analyzeDependencies((PatternInvocationBuilder) arguments.get(0), (StoryPattern) arguments.get(1), (Pattern) arguments.get(2));
         return null;
      case ScopePackage.BINDING_AND_BLACK_PATTERN_BUILDER___BUILD_ACTION__CFNODE:
         buildAction((CFNode) arguments.get(0));
         return null;
      case ScopePackage.BINDING_AND_BLACK_PATTERN_BUILDER___BUILD_ACTION_IN_SUPER_CLASS__CFNODE:
         buildActionInSuperClass((CFNode) arguments.get(0));
         return null;
      case ScopePackage.BINDING_AND_BLACK_PATTERN_BUILDER___BUILD_PATTERN_CONTENT__REGULARPATTERNINVOCATION_STORYPATTERN:
         buildPatternContent((RegularPatternInvocation) arguments.get(0), (StoryPattern) arguments.get(1));
         return null;
      case ScopePackage.BINDING_AND_BLACK_PATTERN_BUILDER___CALCULATE_NEXT_ADORNMENT__PATTERN_ADORNMENT_PATTERNINVOCATIONCONSTRAINT:
         return calculateNextAdornment((Pattern) arguments.get(0), (Adornment) arguments.get(1), (PatternInvocationConstraint) arguments.get(2));
      case ScopePackage.BINDING_AND_BLACK_PATTERN_BUILDER___CALCULATE_PATTERN_INVOCATION_ADORNMENT__PATTERN_ADORNMENT_PATTERNINVOCATIONCONSTRAINT:
         return calculatePatternInvocationAdornment((Pattern) arguments.get(0), (Adornment) arguments.get(1), (PatternInvocationConstraint) arguments.get(2));
      case ScopePackage.BINDING_AND_BLACK_PATTERN_BUILDER___CONSTRUCT_EMBEDDED_PATTERN__REGULARPATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN:
         constructEmbeddedPattern((RegularPatternInvocationBuilder) arguments.get(0), (StoryPattern) arguments.get(1), (Pattern) arguments.get(2));
         return null;
      case ScopePackage.BINDING_AND_BLACK_PATTERN_BUILDER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE:
         return isVariableToAdd((ObjectVariable) arguments.get(0));
      case ScopePackage.BINDING_AND_BLACK_PATTERN_BUILDER___PROCESS_CHILD_PATTERN__REGULARPATTERNINVOCATIONBUILDER_REGULARPATTERNINVOCATION_STORYPATTERN_ADORNMENT:
         return processChildPattern((RegularPatternInvocationBuilder) arguments.get(0), (RegularPatternInvocation) arguments.get(1),
               (StoryPattern) arguments.get(2), (Adornment) arguments.get(3));
      case ScopePackage.BINDING_AND_BLACK_PATTERN_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE:
         validateVariable((Action) arguments.get(0), (CFVariable) arguments.get(1), (ObjectVariable) arguments.get(2));
         return null;
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Iterable<Object[]> pattern_BindingAndBlackPatternBuilder_0_1_LookupChildBuilders_blackBF(BindingAndBlackPatternBuilder _this)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (RegularPatternInvocationBuilder childBuilder : _this.getChildBuilders())
      {
         if (!childBuilder.equals(_this))
         {
            _result.add(new Object[] { _this, childBuilder });
         }
      }
      return _result;
   }

   public static final void pattern_BindingAndBlackPatternBuilder_0_2_DelegateToChildBuilder_expressionBBBB(RegularPatternInvocationBuilder childBuilder,
         BindingAndBlackPatternBuilder _this, StoryPattern storyPattern, Pattern pattern)
   {
      childBuilder.analyzeDependencies(_this, storyPattern, pattern);

   }

   public static final Object[] pattern_BindingAndBlackPatternBuilder_1_1_LookupStoryPattern_blackBFF(CFNode node)
   {
      ActivityNode tmpStoryNode = node.getOrigin();
      if (tmpStoryNode instanceof StoryNode)
      {
         StoryNode storyNode = (StoryNode) tmpStoryNode;
         StoryPattern storyPattern = storyNode.getStoryPattern();
         if (storyPattern != null)
         {
            return new Object[] { node, storyPattern, storyNode };
         }

      }

      return null;
   }

   public static final Object[] pattern_BindingAndBlackPatternBuilder_1_2_LookupBlackPatternBuilder_blackBF(BindingAndBlackPatternBuilder _this)
   {
      BlackPatternBuilder blackPatternBuilder = _this.getBlackPatternBuilder();
      if (blackPatternBuilder != null)
      {
         return new Object[] { _this, blackPatternBuilder };
      }

      return null;
   }

   public static final Object[] pattern_BindingAndBlackPatternBuilder_1_3_HasBindingExpressionInBlackVariable_blackBFF(StoryPattern storyPattern)
   {
      for (ObjectVariable blackVariable : storyPattern.getObjectVariable())
      {
         Expression blackBindingExpression = blackVariable.getBindingExpression();
         if (blackBindingExpression != null)
         {
            BindingOperator blackVariable_bindingOperator = blackVariable.getBindingOperator();
            if (blackVariable_bindingOperator.equals(BindingOperator.CHECK_ONLY))
            {
               return new Object[] { storyPattern, blackVariable, blackBindingExpression };
            }

         }

      }
      return null;
   }

   public static final Object[] pattern_BindingAndBlackPatternBuilder_1_4_HasBindingExpressionInRedVariable_blackBFF(StoryPattern storyPattern)
   {
      for (ObjectVariable redVariable : storyPattern.getObjectVariable())
      {
         Expression redBindingExpression = redVariable.getBindingExpression();
         if (redBindingExpression != null)
         {
            BindingOperator redVariable_bindingOperator = redVariable.getBindingOperator();
            if (redVariable_bindingOperator.equals(BindingOperator.DESTROY))
            {
               return new Object[] { storyPattern, redVariable, redBindingExpression };
            }

         }

      }
      return null;
   }

   public static final void pattern_BindingAndBlackPatternBuilder_1_5_BuildBlackPatternWithoutBindingExpression_expressionBB(
         BlackPatternBuilder blackPatternBuilder, CFNode node)
   {
      blackPatternBuilder.buildAction(node);

   }

   public static final void pattern_BindingAndBlackPatternBuilder_1_7_InvokeBuildActionInSuperclass_expressionBB(BindingAndBlackPatternBuilder _this,
         CFNode node)
   {
      _this.buildActionInSuperClass(node);

   }

   public static final Object[] pattern_BindingAndBlackPatternBuilder_6_1_LookupValidationReport_bindingFB(BindingAndBlackPatternBuilder _this)
   {
      ScopeValidator _localVariable_0 = _this.lookupScopeValidator();
      ScopeValidator scopeValidator = _localVariable_0;
      if (scopeValidator != null)
      {
         return new Object[] { scopeValidator, _this };
      }
      return null;
   }

   public static final Object[] pattern_BindingAndBlackPatternBuilder_6_1_LookupValidationReport_blackFBB(BindingAndBlackPatternBuilder _this,
         ScopeValidator scopeValidator)
   {
      ValidationReport report = scopeValidator.getValidationReport();
      if (report != null)
      {
         return new Object[] { report, _this, scopeValidator };
      }

      return null;
   }

   public static final Object[] pattern_BindingAndBlackPatternBuilder_6_1_LookupValidationReport_bindingAndBlackFBF(BindingAndBlackPatternBuilder _this)
   {
      Object[] result_pattern_BindingAndBlackPatternBuilder_6_1_LookupValidationReport_binding = pattern_BindingAndBlackPatternBuilder_6_1_LookupValidationReport_bindingFB(
            _this);
      if (result_pattern_BindingAndBlackPatternBuilder_6_1_LookupValidationReport_binding != null)
      {
         ScopeValidator scopeValidator = (ScopeValidator) result_pattern_BindingAndBlackPatternBuilder_6_1_LookupValidationReport_binding[0];

         Object[] result_pattern_BindingAndBlackPatternBuilder_6_1_LookupValidationReport_black = pattern_BindingAndBlackPatternBuilder_6_1_LookupValidationReport_blackFBB(
               _this, scopeValidator);
         if (result_pattern_BindingAndBlackPatternBuilder_6_1_LookupValidationReport_black != null)
         {
            ValidationReport report = (ValidationReport) result_pattern_BindingAndBlackPatternBuilder_6_1_LookupValidationReport_black[0];

            return new Object[] { report, _this, scopeValidator };
         }
      }
      return null;
   }

   public static final Object[] pattern_BindingAndBlackPatternBuilder_6_2_LookupPatternTransformer_blackFB(RegularPatternInvocationBuilder patternBuilder)
   {
      PatternTransformer patternTransformer = patternBuilder.getPatternTransformer();
      if (patternTransformer != null)
      {
         return new Object[] { patternTransformer, patternBuilder };
      }

      return null;
   }

   public static final Iterable<Object[]> pattern_BindingAndBlackPatternBuilder_6_3_ForAllObjectVariables_blackFB(StoryPattern storyPattern)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (ObjectVariable objectVariable : storyPattern.getObjectVariable())
      {
         _result.add(new Object[] { objectVariable, storyPattern });
      }
      return _result;
   }

   public static final boolean pattern_BindingAndBlackPatternBuilder_6_4_IsRelevantVariable_expressionFBB(RegularPatternInvocationBuilder patternBuilder,
         ObjectVariable objectVariable)
   {
      boolean _localVariable_0 = patternBuilder.isVariableToAdd(objectVariable);
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final Object[] pattern_BindingAndBlackPatternBuilder_6_5_LookupObjectVariableType_blackFB(ObjectVariable objectVariable)
   {
      EClassifier type = objectVariable.getType();
      if (type != null)
      {
         return new Object[] { type, objectVariable };
      }

      return null;
   }

   public static final Variable pattern_BindingAndBlackPatternBuilder_6_6_CreatePatternVariable_expressionFBBBB(PatternTransformer patternTransformer,
         Pattern pattern, ObjectVariable objectVariable, EClassifier type)
   {
      String objectVariable_name = objectVariable.getName();
      Variable _localVariable_0 = patternTransformer.lookupVariableInPattern(pattern, objectVariable_name, type);
      Variable _result = _localVariable_0;
      return _result;

   }

   public static final void pattern_BindingAndBlackPatternBuilder_6_7_AnalyzeDependencies_expressionBBB(RegularPatternInvocationBuilder patternBuilder,
         StoryPattern storyPattern, Pattern pattern)
   {
      patternBuilder.analyzeDependencies(patternBuilder, storyPattern, pattern);

   }

   public static final Object[] pattern_BindingAndBlackPatternBuilder_6_8_BuildPatternContent_bindingFBBB(PatternTransformer patternTransformer,
         StoryPattern storyPattern, Pattern pattern)
   {
      ValidationReport _localVariable_0 = patternTransformer.transform(storyPattern, pattern);
      ValidationReport patternTransformationResult = _localVariable_0;
      if (patternTransformationResult != null)
      {
         return new Object[] { patternTransformationResult, patternTransformer, storyPattern, pattern };
      }
      return null;
   }

   public static final Object[] pattern_BindingAndBlackPatternBuilder_6_8_BuildPatternContent_blackB(ValidationReport patternTransformationResult)
   {
      return new Object[] { patternTransformationResult };
   }

   public static final Object[] pattern_BindingAndBlackPatternBuilder_6_8_BuildPatternContent_bindingAndBlackFBBB(PatternTransformer patternTransformer,
         StoryPattern storyPattern, Pattern pattern)
   {
      Object[] result_pattern_BindingAndBlackPatternBuilder_6_8_BuildPatternContent_binding = pattern_BindingAndBlackPatternBuilder_6_8_BuildPatternContent_bindingFBBB(
            patternTransformer, storyPattern, pattern);
      if (result_pattern_BindingAndBlackPatternBuilder_6_8_BuildPatternContent_binding != null)
      {
         ValidationReport patternTransformationResult = (ValidationReport) result_pattern_BindingAndBlackPatternBuilder_6_8_BuildPatternContent_binding[0];

         Object[] result_pattern_BindingAndBlackPatternBuilder_6_8_BuildPatternContent_black = pattern_BindingAndBlackPatternBuilder_6_8_BuildPatternContent_blackB(
               patternTransformationResult);
         if (result_pattern_BindingAndBlackPatternBuilder_6_8_BuildPatternContent_black != null)
         {

            return new Object[] { patternTransformationResult, patternTransformer, storyPattern, pattern };
         }
      }
      return null;
   }

   public static final void pattern_BindingAndBlackPatternBuilder_6_9_MergePatternTransformationResult_expressionBB(ValidationReport report,
         ValidationReport patternTransformationResult)
   {
      report.merge(patternTransformationResult);

   }

   public static final Object[] pattern_BindingAndBlackPatternBuilder_7_1_LookupBlackPatternBuilder_blackFB(BindingAndBlackPatternBuilder _this)
   {
      BlackPatternBuilder blackPatternBuilder = _this.getBlackPatternBuilder();
      if (blackPatternBuilder != null)
      {
         return new Object[] { blackPatternBuilder, _this };
      }

      return null;
   }

   public static final boolean pattern_BindingAndBlackPatternBuilder_7_2_DelegateToBlackPatternBuilder_expressionFBB(BlackPatternBuilder blackPatternBuilder,
         ObjectVariable objectVariable)
   {
      boolean _localVariable_0 = blackPatternBuilder.isVariableToAdd(objectVariable);
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final boolean pattern_BindingAndBlackPatternBuilder_7_3_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final boolean pattern_BindingAndBlackPatternBuilder_7_4_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final Object[] pattern_BindingAndBlackPatternBuilder_8_1_LookupPatternBody_blackBFFBF(BindingAndBlackPatternBuilder _this,
         RegularPatternInvocation invocation)
   {
      Pattern pattern = invocation.getPattern();
      if (pattern != null)
      {
         CFNode node = invocation.getCfNode();
         if (node != null)
         {
            for (PatternBody patternBody : pattern.getBodies())
            {
               return new Object[] { _this, node, patternBody, invocation, pattern };
            }
         }

      }

      return null;
   }

   public static final Object[] pattern_BindingAndBlackPatternBuilder_8_2_CreateChildPattern_greenFFBB(RegularPatternInvocationBuilder childPatternBuilder,
         CFNode node)
   {
      Pattern childPattern = SpecificationFactory.eINSTANCE.createPattern();
      PatternBody childPatternBody = SpecificationFactory.eINSTANCE.createPatternBody();
      String _localVariable_0 = childPatternBuilder.calculatePatternName(node);
      childPatternBody.setHeader(childPattern);
      String childPattern_name_prime = _localVariable_0;
      childPattern.setName(childPattern_name_prime);
      return new Object[] { childPattern, childPatternBody, childPatternBuilder, node };
   }

   public static final void pattern_BindingAndBlackPatternBuilder_8_3_AttachChildPatternToResource_expressionBBB(BindingAndBlackPatternBuilder _this,
         CFNode node, Pattern childPattern)
   {
      _this.attachToResource(node, childPattern);

   }

   public static final void pattern_BindingAndBlackPatternBuilder_8_4_BuildChildPattern_expressionBBBB(BindingAndBlackPatternBuilder _this,
         RegularPatternInvocationBuilder childPatternBuilder, StoryPattern storyPattern, Pattern childPattern)
   {
      _this.constructEmbeddedPattern(childPatternBuilder, storyPattern, childPattern);

   }

   public static final Object[] pattern_BindingAndBlackPatternBuilder_8_5_CreateChildPatternInvocationConstraint_blackBB(PatternBody patternBody,
         Pattern childPattern)
   {
      return new Object[] { patternBody, childPattern };
   }

   public static final Object[] pattern_BindingAndBlackPatternBuilder_8_5_CreateChildPatternInvocationConstraint_greenBBF(PatternBody patternBody,
         Pattern childPattern)
   {
      PatternInvocationConstraint childPatternInvocationConstraint = SpecificationFactory.eINSTANCE.createPatternInvocationConstraint();
      boolean childPatternInvocationConstraint_positive_prime = Boolean.valueOf(true);
      patternBody.getConstraints().add(childPatternInvocationConstraint);
      childPatternInvocationConstraint.setInvokedPattern(childPattern);
      childPatternInvocationConstraint.setPositive(Boolean.valueOf(childPatternInvocationConstraint_positive_prime));
      return new Object[] { patternBody, childPattern, childPatternInvocationConstraint };
   }

   public static final Iterable<Object[]> pattern_BindingAndBlackPatternBuilder_8_6_ForAllChildParameters_blackBF(Pattern childPattern)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (Variable childParameter : childPattern.getSymbolicParameters())
      {
         _result.add(new Object[] { childPattern, childParameter });
      }
      return _result;
   }

   public static final Object[] pattern_BindingAndBlackPatternBuilder_8_7_CreateConstraintParameter_blackBBFB(Pattern pattern,
         PatternInvocationConstraint childPatternInvocationConstraint, Variable childParameter)
   {
      String childParameter_name = childParameter.getName();
      for (Variable symbolicVariable : pattern.getSymbolicParameters())
      {
         if (!childParameter.equals(symbolicVariable))
         {
            String symbolicVariable_name = symbolicVariable.getName();
            if (symbolicVariable_name.equals(childParameter_name))
            {
               return new Object[] { pattern, childPatternInvocationConstraint, symbolicVariable, childParameter };
            }

         }
      }

      return null;
   }

   public static final Object[] pattern_BindingAndBlackPatternBuilder_8_7_CreateConstraintParameter_greenFBBB(
         PatternInvocationConstraint childPatternInvocationConstraint, Variable symbolicVariable, Variable childParameter)
   {
      ConstraintParameter constraintParameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
      constraintParameter.setReference(symbolicVariable);
      childPatternInvocationConstraint.getParameters().add(constraintParameter);
      return new Object[] { constraintParameter, childPatternInvocationConstraint, symbolicVariable, childParameter };
   }

   public static final Object[] pattern_BindingAndBlackPatternBuilder_8_8_LookupPatternMatcher_blackFB(RegularPatternInvocationBuilder childPatternBuilder)
   {
      PatternMatcher patternMatcher = childPatternBuilder.getPatternMatcher();
      if (patternMatcher != null)
      {
         return new Object[] { patternMatcher, childPatternBuilder };
      }

      return null;
   }

   public static final boolean pattern_BindingAndBlackPatternBuilder_8_9_HasErrors_expressionFB(BindingAndBlackPatternBuilder _this)
   {
      boolean _localVariable_0 = _this.hasErrors();
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final Adornment pattern_BindingAndBlackPatternBuilder_8_10_expressionFBBBB(BindingAndBlackPatternBuilder _this, Pattern pattern,
         Adornment adornment, PatternInvocationConstraint childPatternInvocationConstraint)
   {
      Adornment _localVariable_0 = _this.calculateNextAdornment(pattern, adornment, childPatternInvocationConstraint);
      Adornment _result = _localVariable_0;
      return _result;
   }

   public static final Object[] pattern_BindingAndBlackPatternBuilder_8_11_GenerateSearchPlan_bindingFBBBBBBB(PatternMatcher patternMatcher,
         Pattern childPattern, BindingAndBlackPatternBuilder _this, Pattern pattern, Adornment adornment,
         PatternInvocationConstraint childPatternInvocationConstraint, RegularPatternInvocation invocation)
   {
      Adornment _localVariable_2 = _this.calculatePatternInvocationAdornment(pattern, adornment, childPatternInvocationConstraint);
      boolean _localVariable_3 = invocation.isMultipleMatch();
      ValidationReport _localVariable_1 = patternMatcher.generateSearchPlan(childPattern, _localVariable_2, Boolean.valueOf(_localVariable_3));
      ValidationReport patternMatchingReport = _localVariable_1;
      if (patternMatchingReport != null)
      {
         return new Object[] { patternMatchingReport, patternMatcher, childPattern, _this, pattern, adornment, childPatternInvocationConstraint, invocation };
      }
      return null;
   }

   public static final Object[] pattern_BindingAndBlackPatternBuilder_8_11_GenerateSearchPlan_blackB(ValidationReport patternMatchingReport)
   {
      return new Object[] { patternMatchingReport };
   }

   public static final Object[] pattern_BindingAndBlackPatternBuilder_8_11_GenerateSearchPlan_bindingAndBlackFBBBBBBB(PatternMatcher patternMatcher,
         Pattern childPattern, BindingAndBlackPatternBuilder _this, Pattern pattern, Adornment adornment,
         PatternInvocationConstraint childPatternInvocationConstraint, RegularPatternInvocation invocation)
   {
      Object[] result_pattern_BindingAndBlackPatternBuilder_8_11_GenerateSearchPlan_binding = pattern_BindingAndBlackPatternBuilder_8_11_GenerateSearchPlan_bindingFBBBBBBB(
            patternMatcher, childPattern, _this, pattern, adornment, childPatternInvocationConstraint, invocation);
      if (result_pattern_BindingAndBlackPatternBuilder_8_11_GenerateSearchPlan_binding != null)
      {
         ValidationReport patternMatchingReport = (ValidationReport) result_pattern_BindingAndBlackPatternBuilder_8_11_GenerateSearchPlan_binding[0];

         Object[] result_pattern_BindingAndBlackPatternBuilder_8_11_GenerateSearchPlan_black = pattern_BindingAndBlackPatternBuilder_8_11_GenerateSearchPlan_blackB(
               patternMatchingReport);
         if (result_pattern_BindingAndBlackPatternBuilder_8_11_GenerateSearchPlan_black != null)
         {

            return new Object[] { patternMatchingReport, patternMatcher, childPattern, _this, pattern, adornment, childPatternInvocationConstraint,
                  invocation };
         }
      }
      return null;
   }

   public static final void pattern_BindingAndBlackPatternBuilder_8_12_HandlePatternMatcherReport_expressionBBB(BindingAndBlackPatternBuilder _this,
         RegularPatternInvocation invocation, ValidationReport patternMatchingReport)
   {
      _this.handlePatternMatcherReport(invocation, patternMatchingReport);

   }

   public static final Object[] pattern_BindingAndBlackPatternBuilder_8_13_LookupValidationReport_bindingFB(BindingAndBlackPatternBuilder _this)
   {
      ScopeValidator _localVariable_0 = _this.lookupScopeValidator();
      ScopeValidator scopeValidator = _localVariable_0;
      if (scopeValidator != null)
      {
         return new Object[] { scopeValidator, _this };
      }
      return null;
   }

   public static final Object[] pattern_BindingAndBlackPatternBuilder_8_13_LookupValidationReport_blackFB(ScopeValidator scopeValidator)
   {
      ValidationReport report = scopeValidator.getValidationReport();
      if (report != null)
      {
         return new Object[] { report, scopeValidator };
      }

      return null;
   }

   public static final Object[] pattern_BindingAndBlackPatternBuilder_8_13_LookupValidationReport_bindingAndBlackFFB(BindingAndBlackPatternBuilder _this)
   {
      Object[] result_pattern_BindingAndBlackPatternBuilder_8_13_LookupValidationReport_binding = pattern_BindingAndBlackPatternBuilder_8_13_LookupValidationReport_bindingFB(
            _this);
      if (result_pattern_BindingAndBlackPatternBuilder_8_13_LookupValidationReport_binding != null)
      {
         ScopeValidator scopeValidator = (ScopeValidator) result_pattern_BindingAndBlackPatternBuilder_8_13_LookupValidationReport_binding[0];

         Object[] result_pattern_BindingAndBlackPatternBuilder_8_13_LookupValidationReport_black = pattern_BindingAndBlackPatternBuilder_8_13_LookupValidationReport_blackFB(
               scopeValidator);
         if (result_pattern_BindingAndBlackPatternBuilder_8_13_LookupValidationReport_black != null)
         {
            ValidationReport report = (ValidationReport) result_pattern_BindingAndBlackPatternBuilder_8_13_LookupValidationReport_black[0];

            return new Object[] { report, scopeValidator, _this };
         }
      }
      return null;
   }

   public static final void pattern_BindingAndBlackPatternBuilder_8_14_MergePatternMatchingReport_expressionBB(ValidationReport report,
         ValidationReport patternMatchingReport)
   {
      report.merge(patternMatchingReport);

   }

   public static final Adornment pattern_BindingAndBlackPatternBuilder_8_15_expressionFBBBB(BindingAndBlackPatternBuilder _this, Pattern pattern,
         Adornment adornment, PatternInvocationConstraint childPatternInvocationConstraint)
   {
      Adornment _localVariable_0 = _this.calculateNextAdornment(pattern, adornment, childPatternInvocationConstraint);
      Adornment _result = _localVariable_0;
      return _result;
   }

   public static final Iterable<Object[]> pattern_BindingAndBlackPatternBuilder_9_1_ForAllChildBuilders_blackFB(BindingAndBlackPatternBuilder _this)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (RegularPatternInvocationBuilder childBuilder : _this.getChildBuilders())
      {
         if (!childBuilder.equals(_this))
         {
            _result.add(new Object[] { childBuilder, _this });
         }
      }
      return _result;
   }

   public static final boolean pattern_BindingAndBlackPatternBuilder_9_2_IsVariableRelevant_expressionFBB(RegularPatternInvocationBuilder childBuilder,
         ObjectVariable objectVariable)
   {
      boolean _localVariable_0 = childBuilder.isVariableToAdd(objectVariable);
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final void pattern_BindingAndBlackPatternBuilder_9_3_InvokeDelegate_expressionBBBB(RegularPatternInvocationBuilder childBuilder, Action action,
         CFVariable variable, ObjectVariable objectVariable)
   {
      childBuilder.validateVariable(action, variable, objectVariable);

   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //BindingAndBlackPatternBuilderImpl
