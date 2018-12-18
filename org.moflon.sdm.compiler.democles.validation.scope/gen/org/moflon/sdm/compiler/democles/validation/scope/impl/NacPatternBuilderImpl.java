/**
 */
package org.moflon.sdm.compiler.democles.validation.scope.impl;

import SDMLanguage.patterns.BindingOperator;
import SDMLanguage.patterns.BindingSemantics;
import SDMLanguage.patterns.LinkVariable;
import SDMLanguage.patterns.ObjectVariable;
import SDMLanguage.patterns.StoryPattern;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gervarro.democles.common.Adornment;

import org.gervarro.democles.specification.emf.Constraint;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.PatternInvocationConstraint;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.Variable;

import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Reference;

import org.moflon.sdm.compiler.democles.pattern.NacPatternTransformer;
import org.moflon.sdm.compiler.democles.pattern.PatternTransformer;

import org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.CompoundPatternInvocationBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.ExpressionExplorer;
import org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.ScopePackage;

import org.moflon.sdm.runtime.democles.Action;
import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.PatternInvocation;
import org.moflon.sdm.runtime.democles.RegularPatternInvocation;
// <-- [user defined imports]
import org.eclipse.emf.ecore.resource.Resource;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nac Pattern Builder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.impl.NacPatternBuilderImpl#getNacPatternCounter <em>Nac Pattern Counter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NacPatternBuilderImpl extends RegularPatternInvocationBuilderImpl implements NacPatternBuilder
{
   /**
    * The default value of the '{@link #getNacPatternCounter() <em>Nac Pattern Counter</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getNacPatternCounter()
    * @generated
    * @ordered
    */
   protected static final int NAC_PATTERN_COUNTER_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getNacPatternCounter() <em>Nac Pattern Counter</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getNacPatternCounter()
    * @generated
    * @ordered
    */
   protected int nacPatternCounter = NAC_PATTERN_COUNTER_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected NacPatternBuilderImpl()
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
      return ScopePackage.Literals.NAC_PATTERN_BUILDER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getNacPatternCounter()
   {
      return nacPatternCounter;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setNacPatternCounter(int newNacPatternCounter)
   {
      int oldNacPatternCounter = nacPatternCounter;
      nacPatternCounter = newNacPatternCounter;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ScopePackage.NAC_PATTERN_BUILDER__NAC_PATTERN_COUNTER, oldNacPatternCounter, nacPatternCounter));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void analyzeDependencies(PatternInvocationBuilder invocationBuilder, StoryPattern storyPattern, Pattern pattern)
   {

      Object[] result1_black = NacPatternBuilderImpl.pattern_NacPatternBuilder_0_1_Init_blackBFFB(this, pattern);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[pattern] = " + pattern + ".");
      }
      //nothing PatternBody body = (PatternBody) result1_black[1];
      ExpressionExplorer expressionExplorer = (ExpressionExplorer) result1_black[2];
      // ForEach 
      for (Object[] result2_black : NacPatternBuilderImpl.pattern_NacPatternBuilder_0_2_ForAllNegativeObjectVariables_blackBF(storyPattern))
      {
         ObjectVariable objectVariable = (ObjectVariable) result2_black[1];
         // 
         NacPatternBuilderImpl.pattern_NacPatternBuilder_0_3_HandleAttributeConstraints_expressionBBBBB(this, invocationBuilder, expressionExplorer,
               objectVariable, pattern);

      }
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void attachToResource(Pattern pattern, Pattern nacPattern)
   {
      // [user code injected with eMoflon]

      Resource patternResource = pattern.eResource();
      if (patternResource != null)
      {
         patternResource.getContents().add(nacPattern);
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void buildPatternContent(RegularPatternInvocation invocation, StoryPattern storyPattern)
   {

      Object[] result1_black = NacPatternBuilderImpl.pattern_NacPatternBuilder_2_1_Init_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      // ForEach 
      for (Object[] result2_black : NacPatternBuilderImpl.pattern_NacPatternBuilder_2_2_LookupNacPatterns_blackFFFBF(invocation))
      {
         //nothing PatternBody body = (PatternBody) result2_black[0];
         //nothing PatternInvocationConstraint nacInvocation = (PatternInvocationConstraint) result2_black[1];
         Pattern nacPattern = (Pattern) result2_black[2];
         //nothing Pattern pattern = (Pattern) result2_black[4];
         // 
         NacPatternBuilderImpl.pattern_NacPatternBuilder_2_3_TransformPattern_expressionBBB(this, storyPattern, nacPattern);

      }
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Adornment createAllBoundAdornment(Pattern pattern)
   {
      // [user code injected with eMoflon]

      return new Adornment(pattern.getSymbolicParameters().size());

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String createNacPatternNameAndIncrementCounter(Pattern pattern)
   {
      // [user code injected with eMoflon]

      return pattern.getName() + "_nac_" + nacPatternCounter++;

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void embedNacPattern(Pattern pattern, PatternInvocationConstraint patternInvocation, Pattern nacPattern)
   {

      Object[] result1_black = NacPatternBuilderImpl.pattern_NacPatternBuilder_5_1_Init_blackBF(pattern);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[pattern] = " + pattern + ".");
      }
      PatternBody body = (PatternBody) result1_black[1];
      // ForEach 
      for (Object[] result2_black : NacPatternBuilderImpl.pattern_NacPatternBuilder_5_2_ForAllSymbolicParametersInNacPattern_blackFB(nacPattern))
      {
         Variable nacVariable = (Variable) result2_black[0];
         // 
         Object[] result3_black = NacPatternBuilderImpl.pattern_NacPatternBuilder_5_3_HandleSymbolicParameter_blackBBFB(patternInvocation, pattern,
               nacVariable);
         if (result3_black != null)
         {
            Variable symbolicParameter = (Variable) result3_black[2];
            NacPatternBuilderImpl.pattern_NacPatternBuilder_5_3_HandleSymbolicParameter_greenFBBB(patternInvocation, symbolicParameter, nacVariable);
            //nothing ConstraintParameter symbolicConstraintParameter = (ConstraintParameter) result3_green[0];

         } else
         {
            // 
            Object[] result4_black = NacPatternBuilderImpl.pattern_NacPatternBuilder_5_4_HandleLocalVariable_blackBFBB(body, patternInvocation, nacVariable);
            if (result4_black != null)
            {
               Variable localVariable = (Variable) result4_black[1];
               NacPatternBuilderImpl.pattern_NacPatternBuilder_5_4_HandleLocalVariable_greenBBFB(localVariable, patternInvocation, nacVariable);
               //nothing ConstraintParameter localConstraintParameter = (ConstraintParameter) result4_green[2];

            } else
            {
               // 

            }

         }

      }
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void exploreNacPatternVariables(ObjectVariable objectVariable, Pattern nacPattern)
   {

      Object[] result1_black = NacPatternBuilderImpl.pattern_NacPatternBuilder_6_1_Init_blackFB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      NacPatternTransformer patternTransformer = (NacPatternTransformer) result1_black[0];
      // 
      Object[] result2_black = NacPatternBuilderImpl.pattern_NacPatternBuilder_6_2_IsObjectVariableNegative_blackB(objectVariable);
      if (result2_black != null)
      {

         Object[] result3_black = NacPatternBuilderImpl.pattern_NacPatternBuilder_6_3_CreateNegativeVariable_blackFBBF(nacPattern, objectVariable);
         if (result3_black == null)
         {
            throw new RuntimeException(
                  "Pattern matching failed." + " Variables: " + "[nacPattern] = " + nacPattern + ", " + "[objectVariable] = " + objectVariable + ".");
         }
         PatternBody nacPatternBody = (PatternBody) result3_black[0];
         EClassifier nacClassifier = (EClassifier) result3_black[3];
         NacPatternBuilderImpl.pattern_NacPatternBuilder_6_3_CreateNegativeVariable_greenBFBB(nacPatternBody, nacClassifier, objectVariable);
         //nothing EMFVariable negativeVariable = (EMFVariable) result3_green[1];

         // ForEach 
         for (Object[] result4_black : NacPatternBuilderImpl.pattern_NacPatternBuilder_6_4_CreateConstraintForEachSourceLink_blackBFF(objectVariable))
         {
            //nothing LinkVariable sourceLink = (LinkVariable) result4_black[1];
            ObjectVariable target = (ObjectVariable) result4_black[2];
            // 
            NacPatternBuilderImpl.pattern_NacPatternBuilder_6_5_RecursiveCallForTarget_expressionBBB(this, target, nacPattern);

         }
         // ForEach 
         for (Object[] result6_black : NacPatternBuilderImpl.pattern_NacPatternBuilder_6_6_CreateConstraintForEachTargetLink_blackFFB(objectVariable))
         {
            ObjectVariable source = (ObjectVariable) result6_black[0];
            //nothing LinkVariable targetLink = (LinkVariable) result6_black[1];
            // 
            NacPatternBuilderImpl.pattern_NacPatternBuilder_6_7_RecursiveCallForSource_expressionBBB(this, source, nacPattern);

         }

         Object[] result8_black = NacPatternBuilderImpl.pattern_NacPatternBuilder_6_8_LookupStoryPattern_blackFB(objectVariable);
         if (result8_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[objectVariable] = " + objectVariable + ".");
         }
         StoryPattern storyPattern = (StoryPattern) result8_black[0];
         // ForEach 
         for (Object[] result9_black : NacPatternBuilderImpl.pattern_NacPatternBuilder_6_9_ForAllCrossPatternInjectivityCandidates_blackBFB(storyPattern,
               objectVariable))
         {
            ObjectVariable injectivityCandidate = (ObjectVariable) result9_black[1];

            Object[] result10_black = NacPatternBuilderImpl.pattern_NacPatternBuilder_6_10_LookupPositiveClassifier_blackFB(injectivityCandidate);
            if (result10_black == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[injectivityCandidate] = " + injectivityCandidate + ".");
            }
            EClassifier positiveClassifier = (EClassifier) result10_black[0];

            Object[] result11_black = NacPatternBuilderImpl.pattern_NacPatternBuilder_6_11_LookupNegativeClassifier_blackFB(objectVariable);
            if (result11_black == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[objectVariable] = " + objectVariable + ".");
            }
            EClassifier negativeClassifier = (EClassifier) result11_black[0];
            // 
            if (NacPatternBuilderImpl.pattern_NacPatternBuilder_6_12_HaveCompatibleTypes_expressionFBBB(patternTransformer, positiveClassifier,
                  negativeClassifier))
            {
               // 
               Object[] result13_black = NacPatternBuilderImpl.pattern_NacPatternBuilder_6_13_AddCrossPatternInjectivityVariable_blackBBB(positiveClassifier,
                     nacPattern, injectivityCandidate);
               if (result13_black != null)
               {
                  NacPatternBuilderImpl.pattern_NacPatternBuilder_6_13_AddCrossPatternInjectivityVariable_greenBFBB(positiveClassifier, nacPattern,
                        injectivityCandidate);
                  //nothing EMFVariable crossPatternInjectivityVariable = (EMFVariable) result13_green[1];

               } else
               {
               }

            } else
            {
            }

         }
         return;
      } else
      {
         // 
         Object[] result15_black = NacPatternBuilderImpl.pattern_NacPatternBuilder_6_15_IsVariableBlackAndMandatory_blackB(objectVariable);
         if (result15_black != null)
         {
         } else
         {
            // 
            Object[] result16_black = NacPatternBuilderImpl.pattern_NacPatternBuilder_6_16_IsVariableRed_blackB(objectVariable);
            if (result16_black != null)
            {
            } else
            {
               // 
               return;
            }

         }
         // 
         Object[] result19_black = NacPatternBuilderImpl.pattern_NacPatternBuilder_6_19_CreateMandatoryVariable_blackBBF(objectVariable, nacPattern);
         if (result19_black != null)
         {
            EClassifier eClassifier = (EClassifier) result19_black[2];
            NacPatternBuilderImpl.pattern_NacPatternBuilder_6_19_CreateMandatoryVariable_greenFBBB(nacPattern, eClassifier, objectVariable);
            //nothing EMFVariable mandatoryVariable = (EMFVariable) result19_green[0];

         } else
         {
         }
         return;
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void handleRelevantObjectVariable(PatternInvocation invocation, ObjectVariable objectVariable)
   {

      Object[] result1_black = NacPatternBuilderImpl.pattern_NacPatternBuilder_7_1_Init_blackBFFB(objectVariable, invocation);
      if (result1_black == null)
      {
         throw new RuntimeException(
               "Pattern matching failed." + " Variables: " + "[objectVariable] = " + objectVariable + ", " + "[invocation] = " + invocation + ".");
      }
      Pattern pattern = (Pattern) result1_black[1];
      PatternBody body = (PatternBody) result1_black[2];
      // 
      Object[] result2_black = NacPatternBuilderImpl.pattern_NacPatternBuilder_7_2_AlreadyExistsAsLocalVariable_blackBFFFFB(body, objectVariable);
      if (result2_black != null)
      {
         //nothing EMFVariable existingLocalVariable = (EMFVariable) result2_black[1];
         //nothing PatternInvocationConstraint existingInvocationConstraint = (PatternInvocationConstraint) result2_black[2];
         //nothing PatternBody existingNacBody = (PatternBody) result2_black[3];
         //nothing Pattern existingNacPattern = (Pattern) result2_black[4];
         return;
      } else
      {

         Object[] result4_black = NacPatternBuilderImpl.pattern_NacPatternBuilder_7_4_CreateNewNacPattern_blackBB(this, body);
         if (result4_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[body] = " + body + ".");
         }
         Object[] result4_green = NacPatternBuilderImpl.pattern_NacPatternBuilder_7_4_CreateNewNacPattern_greenFFFBBB(body, this, pattern);
         //nothing PatternInvocationConstraint patternInvocation = (PatternInvocationConstraint) result4_green[0];
         //nothing PatternBody nacPatternBody = (PatternBody) result4_green[1];
         Pattern nacPattern = (Pattern) result4_green[2];

         // 
         NacPatternBuilderImpl.pattern_NacPatternBuilder_7_5_AttachNacPatternToResource_expressionBBB(this, pattern, nacPattern);
         // 
         NacPatternBuilderImpl.pattern_NacPatternBuilder_7_6_ExploreNegativeVariables_expressionBBB(this, objectVariable, nacPattern);
         return;
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void handleSimpleNacPattern(StoryPattern storyPattern, Pattern pattern)
   {

      Object[] result1_black = NacPatternBuilderImpl.pattern_NacPatternBuilder_8_1_Init_blackBF(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      PatternTransformer patternTransformer = (PatternTransformer) result1_black[1];
      // ForEach 
      for (Object[] result2_black : NacPatternBuilderImpl.pattern_NacPatternBuilder_8_2_ForEachSimpleNacPattern_blackFFFB(storyPattern))
      {
         ObjectVariable source = (ObjectVariable) result2_black[0];
         ObjectVariable target = (ObjectVariable) result2_black[1];
         LinkVariable linkVariable = (LinkVariable) result2_black[2];

         Object[] result3_green = NacPatternBuilderImpl.pattern_NacPatternBuilder_8_3_CreateSimpleNacPattern_greenFBB(this, pattern);
         if (result3_green == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[pattern] = " + pattern + ".");
         }
         Pattern simpleNacPattern = (Pattern) result3_green[0];
         // 
         NacPatternBuilderImpl.pattern_NacPatternBuilder_8_4_AttachSimpleNacPatternToResource_expressionBBB(this, pattern, simpleNacPattern);

         Object[] result5_bindingAndBlack = NacPatternBuilderImpl.pattern_NacPatternBuilder_8_5_CreateConstraint_bindingAndBlackBFBB(simpleNacPattern,
               patternTransformer, linkVariable);
         if (result5_bindingAndBlack == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[simpleNacPattern] = " + simpleNacPattern + ", "
                  + "[patternTransformer] = " + patternTransformer + ", " + "[linkVariable] = " + linkVariable + ".");
         }
         EReference eReference = (EReference) result5_bindingAndBlack[1];
         Object[] result5_green = NacPatternBuilderImpl.pattern_NacPatternBuilder_8_5_CreateConstraint_greenBFBF(simpleNacPattern, eReference);
         //nothing PatternBody simpleNacPatternBody = (PatternBody) result5_green[1];
         Reference simpleNacConstraint = (Reference) result5_green[3];

         Object[] result6_black = NacPatternBuilderImpl.pattern_NacPatternBuilder_8_6_LookupSourceType_blackBF(source);
         if (result6_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[source] = " + source + ".");
         }
         EClassifier sourceType = (EClassifier) result6_black[1];

         Object[] result7_black = NacPatternBuilderImpl.pattern_NacPatternBuilder_8_7_LookupTargetType_blackFB(target);
         if (result7_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[target] = " + target + ".");
         }
         EClassifier targetType = (EClassifier) result7_black[0];

         Object[] result8_bindingAndBlack = NacPatternBuilderImpl.pattern_NacPatternBuilder_8_8_CreateSourceVariable_bindingAndBlackFBBBBBB(simpleNacConstraint,
               simpleNacPattern, sourceType, patternTransformer, pattern, source);
         if (result8_bindingAndBlack == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[simpleNacConstraint] = " + simpleNacConstraint + ", "
                  + "[simpleNacPattern] = " + simpleNacPattern + ", " + "[sourceType] = " + sourceType + ", " + "[patternTransformer] = " + patternTransformer
                  + ", " + "[pattern] = " + pattern + ", " + "[source] = " + source + ".");
         }
         //nothing Variable sourceVariable = (Variable) result8_bindingAndBlack[0];
         NacPatternBuilderImpl.pattern_NacPatternBuilder_8_8_CreateSourceVariable_greenFBBFBB(simpleNacConstraint, simpleNacPattern, sourceType, source);
         //nothing ConstraintParameter sourceParameter = (ConstraintParameter) result8_green[0];
         //nothing EMFVariable sourceNacVariable = (EMFVariable) result8_green[3];

         Object[] result9_bindingAndBlack = NacPatternBuilderImpl.pattern_NacPatternBuilder_8_9_CreateTargetVariable_bindingAndBlackBBFBBBB(targetType,
               simpleNacConstraint, simpleNacPattern, patternTransformer, pattern, target);
         if (result9_bindingAndBlack == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[targetType] = " + targetType + ", " + "[simpleNacConstraint] = "
                  + simpleNacConstraint + ", " + "[simpleNacPattern] = " + simpleNacPattern + ", " + "[patternTransformer] = " + patternTransformer + ", "
                  + "[pattern] = " + pattern + ", " + "[target] = " + target + ".");
         }
         //nothing Variable targetVariable = (Variable) result9_bindingAndBlack[2];
         NacPatternBuilderImpl.pattern_NacPatternBuilder_8_9_CreateTargetVariable_greenBBFFBB(targetType, simpleNacConstraint, simpleNacPattern, target);
         //nothing EMFVariable targetNacVariable = (EMFVariable) result9_green[2];
         //nothing ConstraintParameter targetParameter = (ConstraintParameter) result9_green[3];

         Object[] result10_black = NacPatternBuilderImpl.pattern_NacPatternBuilder_8_10_CreatePatternInvocationConstraint_blackFBB(pattern, simpleNacPattern);
         if (result10_black == null)
         {
            throw new RuntimeException(
                  "Pattern matching failed." + " Variables: " + "[pattern] = " + pattern + ", " + "[simpleNacPattern] = " + simpleNacPattern + ".");
         }
         PatternBody body = (PatternBody) result10_black[0];
         Object[] result10_green = NacPatternBuilderImpl.pattern_NacPatternBuilder_8_10_CreatePatternInvocationConstraint_greenFBB(body, simpleNacPattern);
         PatternInvocationConstraint patternInvocation = (PatternInvocationConstraint) result10_green[0];

         // 
         NacPatternBuilderImpl.pattern_NacPatternBuilder_8_11_EmbedSimpleNacPattern_expressionBBBB(this, pattern, patternInvocation, simpleNacPattern);

      }
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PatternInvocation lookupAction(CFNode node)
   {

      Object[] result1_black = NacPatternBuilderImpl.pattern_NacPatternBuilder_9_1_LookupParentBuilder_blackFB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      CompoundPatternInvocationBuilder parent = (CompoundPatternInvocationBuilder) result1_black[0];

      Object[] result2_bindingAndBlack = NacPatternBuilderImpl.pattern_NacPatternBuilder_9_2_DelegateToParent_bindingAndBlackFBB(parent, node);
      if (result2_bindingAndBlack == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[parent] = " + parent + ", " + "[node] = " + node + ".");
      }
      PatternInvocation invocation = (PatternInvocation) result2_bindingAndBlack[0];
      return NacPatternBuilderImpl.pattern_NacPatternBuilder_9_3_expressionFB(invocation);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void postprocessPatternInterface(StoryPattern storyPattern)
   {

      Object[] result1_bindingAndBlack = NacPatternBuilderImpl.pattern_NacPatternBuilder_10_1_Init_bindingAndBlackFFFBF(this);
      if (result1_bindingAndBlack == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      Pattern pattern = (Pattern) result1_bindingAndBlack[0];
      //nothing RegularPatternInvocationBuilder invocationBuilder = (RegularPatternInvocationBuilder) result1_bindingAndBlack[1];
      //nothing PatternInvocation invocation = (PatternInvocation) result1_bindingAndBlack[2];
      ExpressionExplorer expressionExplorer = (ExpressionExplorer) result1_bindingAndBlack[4];
      // ForEach 
      for (Object[] result2_black : NacPatternBuilderImpl.pattern_NacPatternBuilder_10_2_ForAllNacPatterns_blackFFFB(pattern))
      {
         PatternInvocationConstraint nacPatternInvocation = (PatternInvocationConstraint) result2_black[0];
         Pattern nacPattern = (Pattern) result2_black[1];
         //nothing PatternBody body = (PatternBody) result2_black[2];
         // ForEach 
         for (Object[] result3_black : NacPatternBuilderImpl.pattern_NacPatternBuilder_10_3_ForAllNegativeObjectVariables_blackFB(storyPattern))
         {
            ObjectVariable objectVariable = (ObjectVariable) result3_black[0];
            // 
            Object[] result4_black = NacPatternBuilderImpl.pattern_NacPatternBuilder_10_4_BelongsToNacPattern_blackBFFB(nacPattern, objectVariable);
            if (result4_black != null)
            {
               //nothing PatternBody nacBody = (PatternBody) result4_black[1];
               //nothing Variable localVariable = (Variable) result4_black[2];
               // 
               NacPatternBuilderImpl.pattern_NacPatternBuilder_10_5_HandleAttributeConstraints_expressionBBBB(this, expressionExplorer, objectVariable,
                     nacPattern);

            } else
            {
            }

         }
         // 
         NacPatternBuilderImpl.pattern_NacPatternBuilder_10_6_EmbedNacPattern_expressionBBBB(this, pattern, nacPatternInvocation, nacPattern);

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
      case ScopePackage.NAC_PATTERN_BUILDER__NAC_PATTERN_COUNTER:
         return getNacPatternCounter();
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
      case ScopePackage.NAC_PATTERN_BUILDER__NAC_PATTERN_COUNTER:
         setNacPatternCounter((Integer) newValue);
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
      case ScopePackage.NAC_PATTERN_BUILDER__NAC_PATTERN_COUNTER:
         setNacPatternCounter(NAC_PATTERN_COUNTER_EDEFAULT);
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
      case ScopePackage.NAC_PATTERN_BUILDER__NAC_PATTERN_COUNTER:
         return nacPatternCounter != NAC_PATTERN_COUNTER_EDEFAULT;
      }
      return super.eIsSet(featureID);
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
         case ScopePackage.ACTION_BUILDER___LOOKUP_ACTION__CFNODE:
            return ScopePackage.NAC_PATTERN_BUILDER___LOOKUP_ACTION__CFNODE;
         default:
            return super.eDerivedOperationID(baseOperationID, baseClass);
         }
      }
      if (baseClass == PatternInvocationBuilder.class)
      {
         switch (baseOperationID)
         {
         case ScopePackage.PATTERN_INVOCATION_BUILDER___LOOKUP_ACTION__CFNODE:
            return ScopePackage.NAC_PATTERN_BUILDER___LOOKUP_ACTION__CFNODE;
         default:
            return super.eDerivedOperationID(baseOperationID, baseClass);
         }
      }
      if (baseClass == RegularPatternInvocationBuilder.class)
      {
         switch (baseOperationID)
         {
         case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN:
            return ScopePackage.NAC_PATTERN_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN;
         case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER___BUILD_PATTERN_CONTENT__REGULARPATTERNINVOCATION_STORYPATTERN:
            return ScopePackage.NAC_PATTERN_BUILDER___BUILD_PATTERN_CONTENT__REGULARPATTERNINVOCATION_STORYPATTERN;
         case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_RELEVANT_OBJECT_VARIABLE__PATTERNINVOCATION_OBJECTVARIABLE:
            return ScopePackage.NAC_PATTERN_BUILDER___HANDLE_RELEVANT_OBJECT_VARIABLE__PATTERNINVOCATION_OBJECTVARIABLE;
         case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER___POSTPROCESS_PATTERN_INTERFACE__STORYPATTERN:
            return ScopePackage.NAC_PATTERN_BUILDER___POSTPROCESS_PATTERN_INTERFACE__STORYPATTERN;
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
      case ScopePackage.NAC_PATTERN_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN:
         analyzeDependencies((PatternInvocationBuilder) arguments.get(0), (StoryPattern) arguments.get(1), (Pattern) arguments.get(2));
         return null;
      case ScopePackage.NAC_PATTERN_BUILDER___ATTACH_TO_RESOURCE__PATTERN_PATTERN:
         attachToResource((Pattern) arguments.get(0), (Pattern) arguments.get(1));
         return null;
      case ScopePackage.NAC_PATTERN_BUILDER___BUILD_PATTERN_CONTENT__REGULARPATTERNINVOCATION_STORYPATTERN:
         buildPatternContent((RegularPatternInvocation) arguments.get(0), (StoryPattern) arguments.get(1));
         return null;
      case ScopePackage.NAC_PATTERN_BUILDER___CREATE_ALL_BOUND_ADORNMENT__PATTERN:
         return createAllBoundAdornment((Pattern) arguments.get(0));
      case ScopePackage.NAC_PATTERN_BUILDER___CREATE_NAC_PATTERN_NAME_AND_INCREMENT_COUNTER__PATTERN:
         return createNacPatternNameAndIncrementCounter((Pattern) arguments.get(0));
      case ScopePackage.NAC_PATTERN_BUILDER___EMBED_NAC_PATTERN__PATTERN_PATTERNINVOCATIONCONSTRAINT_PATTERN:
         embedNacPattern((Pattern) arguments.get(0), (PatternInvocationConstraint) arguments.get(1), (Pattern) arguments.get(2));
         return null;
      case ScopePackage.NAC_PATTERN_BUILDER___EXPLORE_NAC_PATTERN_VARIABLES__OBJECTVARIABLE_PATTERN:
         exploreNacPatternVariables((ObjectVariable) arguments.get(0), (Pattern) arguments.get(1));
         return null;
      case ScopePackage.NAC_PATTERN_BUILDER___HANDLE_RELEVANT_OBJECT_VARIABLE__PATTERNINVOCATION_OBJECTVARIABLE:
         handleRelevantObjectVariable((PatternInvocation) arguments.get(0), (ObjectVariable) arguments.get(1));
         return null;
      case ScopePackage.NAC_PATTERN_BUILDER___HANDLE_SIMPLE_NAC_PATTERN__STORYPATTERN_PATTERN:
         handleSimpleNacPattern((StoryPattern) arguments.get(0), (Pattern) arguments.get(1));
         return null;
      case ScopePackage.NAC_PATTERN_BUILDER___LOOKUP_ACTION__CFNODE:
         return lookupAction((CFNode) arguments.get(0));
      case ScopePackage.NAC_PATTERN_BUILDER___POSTPROCESS_PATTERN_INTERFACE__STORYPATTERN:
         postprocessPatternInterface((StoryPattern) arguments.get(0));
         return null;
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
      result.append(" (nacPatternCounter: ");
      result.append(nacPatternCounter);
      result.append(')');
      return result.toString();
   }

   public static final Object[] pattern_NacPatternBuilder_0_1_Init_blackBFFB(NacPatternBuilder _this, Pattern pattern)
   {
      ExpressionExplorer expressionExplorer = _this.getExpressionExplorer();
      if (expressionExplorer != null)
      {
         for (PatternBody body : pattern.getBodies())
         {
            return new Object[] { _this, body, expressionExplorer, pattern };
         }
      }

      return null;
   }

   public static final Iterable<Object[]> pattern_NacPatternBuilder_0_2_ForAllNegativeObjectVariables_blackBF(StoryPattern storyPattern)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (ObjectVariable objectVariable : storyPattern.getObjectVariable())
      {
         BindingOperator objectVariable_bindingOperator = objectVariable.getBindingOperator();
         if (objectVariable_bindingOperator.equals(BindingOperator.CHECK_ONLY))
         {
            BindingSemantics objectVariable_bindingSemantics = objectVariable.getBindingSemantics();
            if (objectVariable_bindingSemantics.equals(BindingSemantics.NEGATIVE))
            {
               _result.add(new Object[] { storyPattern, objectVariable });
            }

         }

      }
      return _result;
   }

   public static final void pattern_NacPatternBuilder_0_3_HandleAttributeConstraints_expressionBBBBB(NacPatternBuilder _this,
         PatternInvocationBuilder invocationBuilder, ExpressionExplorer expressionExplorer, ObjectVariable objectVariable, Pattern pattern)
   {
      _this.exploreAttributeConstraints(invocationBuilder, expressionExplorer, objectVariable, pattern);

   }

   public static final Object[] pattern_NacPatternBuilder_2_1_Init_blackB(NacPatternBuilder _this)
   {
      return new Object[] { _this };
   }

   public static final Iterable<Object[]> pattern_NacPatternBuilder_2_2_LookupNacPatterns_blackFFFBF(RegularPatternInvocation invocation)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      Pattern pattern = invocation.getPattern();
      if (pattern != null)
      {
         for (PatternBody body : pattern.getBodies())
         {
            for (Constraint tmpNacInvocation : body.getConstraints())
            {
               if (tmpNacInvocation instanceof PatternInvocationConstraint)
               {
                  PatternInvocationConstraint nacInvocation = (PatternInvocationConstraint) tmpNacInvocation;
                  Pattern nacPattern = nacInvocation.getInvokedPattern();
                  if (nacPattern != null)
                  {
                     if (!nacPattern.equals(pattern))
                     {
                        boolean nacInvocation_positive = nacInvocation.isPositive();
                        if (Boolean.valueOf(nacInvocation_positive).equals(Boolean.valueOf(false)))
                        {
                           _result.add(new Object[] { body, nacInvocation, nacPattern, invocation, pattern });
                        }

                     }
                  }

               }
            }
         }
      }

      return _result;
   }

   public static final void pattern_NacPatternBuilder_2_3_TransformPattern_expressionBBB(NacPatternBuilder _this, StoryPattern storyPattern, Pattern nacPattern)
   {
      _this.transformPattern(storyPattern, nacPattern);

   }

   public static final Object[] pattern_NacPatternBuilder_5_1_Init_blackBF(Pattern pattern)
   {
      for (PatternBody body : pattern.getBodies())
      {
         return new Object[] { pattern, body };
      }
      return null;
   }

   public static final Iterable<Object[]> pattern_NacPatternBuilder_5_2_ForAllSymbolicParametersInNacPattern_blackFB(Pattern nacPattern)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (Variable nacVariable : nacPattern.getSymbolicParameters())
      {
         _result.add(new Object[] { nacVariable, nacPattern });
      }
      return _result;
   }

   public static final Object[] pattern_NacPatternBuilder_5_3_HandleSymbolicParameter_blackBBFB(PatternInvocationConstraint patternInvocation, Pattern pattern,
         Variable nacVariable)
   {
      String nacVariable_name = nacVariable.getName();
      for (Variable symbolicParameter : pattern.getSymbolicParameters())
      {
         if (!nacVariable.equals(symbolicParameter))
         {
            String symbolicParameter_name = symbolicParameter.getName();
            if (symbolicParameter_name.equals(nacVariable_name))
            {
               return new Object[] { patternInvocation, pattern, symbolicParameter, nacVariable };
            }

         }
      }

      return null;
   }

   public static final Object[] pattern_NacPatternBuilder_5_3_HandleSymbolicParameter_greenFBBB(PatternInvocationConstraint patternInvocation,
         Variable symbolicParameter, Variable nacVariable)
   {
      ConstraintParameter symbolicConstraintParameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
      symbolicConstraintParameter.setReference(symbolicParameter);
      patternInvocation.getParameters().add(symbolicConstraintParameter);
      return new Object[] { symbolicConstraintParameter, patternInvocation, symbolicParameter, nacVariable };
   }

   public static final Object[] pattern_NacPatternBuilder_5_4_HandleLocalVariable_blackBFBB(PatternBody body, PatternInvocationConstraint patternInvocation,
         Variable nacVariable)
   {
      String nacVariable_name = nacVariable.getName();
      for (Variable localVariable : body.getLocalVariables())
      {
         if (!localVariable.equals(nacVariable))
         {
            String localVariable_name = localVariable.getName();
            if (localVariable_name.equals(nacVariable_name))
            {
               return new Object[] { body, localVariable, patternInvocation, nacVariable };
            }

         }
      }

      return null;
   }

   public static final Object[] pattern_NacPatternBuilder_5_4_HandleLocalVariable_greenBBFB(Variable localVariable,
         PatternInvocationConstraint patternInvocation, Variable nacVariable)
   {
      ConstraintParameter localConstraintParameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
      patternInvocation.getParameters().add(localConstraintParameter);
      localConstraintParameter.setReference(localVariable);
      return new Object[] { localVariable, patternInvocation, localConstraintParameter, nacVariable };
   }

   public static final Object[] pattern_NacPatternBuilder_6_1_Init_blackFB(NacPatternBuilder _this)
   {
      PatternTransformer tmpPatternTransformer = _this.getPatternTransformer();
      if (tmpPatternTransformer instanceof NacPatternTransformer)
      {
         NacPatternTransformer patternTransformer = (NacPatternTransformer) tmpPatternTransformer;
         return new Object[] { patternTransformer, _this };
      }

      return null;
   }

   public static final Object[] pattern_NacPatternBuilder_6_2_IsObjectVariableNegative_blackB(ObjectVariable objectVariable)
   {
      BindingSemantics objectVariable_bindingSemantics = objectVariable.getBindingSemantics();
      if (objectVariable_bindingSemantics.equals(BindingSemantics.NEGATIVE))
      {
         return new Object[] { objectVariable };
      }

      return null;
   }

   public static final Object[] pattern_NacPatternBuilder_6_3_CreateNegativeVariable_blackFBBF(Pattern nacPattern, ObjectVariable objectVariable)
   {
      EClassifier nacClassifier = objectVariable.getType();
      if (nacClassifier != null)
      {
         for (PatternBody nacPatternBody : nacPattern.getBodies())
         {
            return new Object[] { nacPatternBody, nacPattern, objectVariable, nacClassifier };
         }
      }

      return null;
   }

   public static final Object[] pattern_NacPatternBuilder_6_3_CreateNegativeVariable_greenBFBB(PatternBody nacPatternBody, EClassifier nacClassifier,
         ObjectVariable objectVariable)
   {
      EMFVariable negativeVariable = EMFTypeFactory.eINSTANCE.createEMFVariable();
      nacPatternBody.getLocalVariables().add(negativeVariable);
      negativeVariable.setEClassifier(nacClassifier);
      String objectVariable_name = objectVariable.getName();
      String negativeVariable_name_prime = objectVariable_name;
      negativeVariable.setName(negativeVariable_name_prime);
      return new Object[] { nacPatternBody, negativeVariable, nacClassifier, objectVariable };

   }

   public static final Iterable<Object[]> pattern_NacPatternBuilder_6_4_CreateConstraintForEachSourceLink_blackBFF(ObjectVariable objectVariable)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (LinkVariable sourceLink : objectVariable.getOutgoingLink())
      {
         ObjectVariable target = sourceLink.getTarget();
         if (target != null)
         {
            if (!objectVariable.equals(target))
            {
               _result.add(new Object[] { objectVariable, sourceLink, target });
            }
         }

      }
      return _result;
   }

   public static final void pattern_NacPatternBuilder_6_5_RecursiveCallForTarget_expressionBBB(NacPatternBuilder _this, ObjectVariable target,
         Pattern nacPattern)
   {
      _this.exploreNacPatternVariables(target, nacPattern);

   }

   public static final Iterable<Object[]> pattern_NacPatternBuilder_6_6_CreateConstraintForEachTargetLink_blackFFB(ObjectVariable objectVariable)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (LinkVariable targetLink : objectVariable.getIncomingLink())
      {
         ObjectVariable source = targetLink.getSource();
         if (source != null)
         {
            if (!objectVariable.equals(source))
            {
               _result.add(new Object[] { source, targetLink, objectVariable });
            }
         }

      }
      return _result;
   }

   public static final void pattern_NacPatternBuilder_6_7_RecursiveCallForSource_expressionBBB(NacPatternBuilder _this, ObjectVariable source,
         Pattern nacPattern)
   {
      _this.exploreNacPatternVariables(source, nacPattern);

   }

   public static final Object[] pattern_NacPatternBuilder_6_8_LookupStoryPattern_blackFB(ObjectVariable objectVariable)
   {
      StoryPattern storyPattern = objectVariable.getPattern();
      if (storyPattern != null)
      {
         return new Object[] { storyPattern, objectVariable };
      }

      return null;
   }

   public static final Iterable<Object[]> pattern_NacPatternBuilder_6_9_ForAllCrossPatternInjectivityCandidates_blackBFB(StoryPattern storyPattern,
         ObjectVariable objectVariable)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (ObjectVariable injectivityCandidate : storyPattern.getObjectVariable())
      {
         if (!injectivityCandidate.equals(objectVariable))
         {
            BindingSemantics injectivityCandidate_bindingSemantics = injectivityCandidate.getBindingSemantics();
            if (injectivityCandidate_bindingSemantics.equals(BindingSemantics.MANDATORY))
            {
               BindingOperator injectivityCandidate_bindingOperator = injectivityCandidate.getBindingOperator();
               if (!injectivityCandidate_bindingOperator.equals(BindingOperator.CREATE))
               {
                  _result.add(new Object[] { storyPattern, injectivityCandidate, objectVariable });
               }

            }

         }
      }
      return _result;
   }

   public static final Object[] pattern_NacPatternBuilder_6_10_LookupPositiveClassifier_blackFB(ObjectVariable injectivityCandidate)
   {
      EClassifier positiveClassifier = injectivityCandidate.getType();
      if (positiveClassifier != null)
      {
         return new Object[] { positiveClassifier, injectivityCandidate };
      }

      return null;
   }

   public static final Object[] pattern_NacPatternBuilder_6_11_LookupNegativeClassifier_blackFB(ObjectVariable objectVariable)
   {
      EClassifier negativeClassifier = objectVariable.getType();
      if (negativeClassifier != null)
      {
         return new Object[] { negativeClassifier, objectVariable };
      }

      return null;
   }

   public static final boolean pattern_NacPatternBuilder_6_12_HaveCompatibleTypes_expressionFBBB(NacPatternTransformer patternTransformer,
         EClassifier positiveClassifier, EClassifier negativeClassifier)
   {
      boolean _localVariable_0 = patternTransformer.areCompatibleTypes(positiveClassifier, negativeClassifier);
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final Object[] pattern_NacPatternBuilder_6_13_AddCrossPatternInjectivityVariable_black_nac_0BB(Pattern nacPattern,
         ObjectVariable injectivityCandidate)
   {
      String injectivityCandidate_name = injectivityCandidate.getName();
      for (Variable existingCrossPatternInjectivityVariable : nacPattern.getSymbolicParameters())
      {
         String existingCrossPatternInjectivityVariable_name = existingCrossPatternInjectivityVariable.getName();
         if (existingCrossPatternInjectivityVariable_name.equals(injectivityCandidate_name))
         {
            return new Object[] { nacPattern, injectivityCandidate };
         }

      }

      return null;
   }

   public static final Object[] pattern_NacPatternBuilder_6_13_AddCrossPatternInjectivityVariable_blackBBB(EClassifier positiveClassifier, Pattern nacPattern,
         ObjectVariable injectivityCandidate)
   {
      if (pattern_NacPatternBuilder_6_13_AddCrossPatternInjectivityVariable_black_nac_0BB(nacPattern, injectivityCandidate) == null)
      {
         return new Object[] { positiveClassifier, nacPattern, injectivityCandidate };
      }
      return null;
   }

   public static final Object[] pattern_NacPatternBuilder_6_13_AddCrossPatternInjectivityVariable_greenBFBB(EClassifier positiveClassifier, Pattern nacPattern,
         ObjectVariable injectivityCandidate)
   {
      EMFVariable crossPatternInjectivityVariable = EMFTypeFactory.eINSTANCE.createEMFVariable();
      crossPatternInjectivityVariable.setEClassifier(positiveClassifier);
      nacPattern.getSymbolicParameters().add(crossPatternInjectivityVariable);
      String injectivityCandidate_name = injectivityCandidate.getName();
      String crossPatternInjectivityVariable_name_prime = injectivityCandidate_name;
      crossPatternInjectivityVariable.setName(crossPatternInjectivityVariable_name_prime);
      return new Object[] { positiveClassifier, crossPatternInjectivityVariable, nacPattern, injectivityCandidate };

   }

   public static final Object[] pattern_NacPatternBuilder_6_15_IsVariableBlackAndMandatory_blackB(ObjectVariable objectVariable)
   {
      BindingOperator objectVariable_bindingOperator = objectVariable.getBindingOperator();
      if (objectVariable_bindingOperator.equals(BindingOperator.CHECK_ONLY))
      {
         BindingSemantics objectVariable_bindingSemantics = objectVariable.getBindingSemantics();
         if (objectVariable_bindingSemantics.equals(BindingSemantics.MANDATORY))
         {
            return new Object[] { objectVariable };
         }

      }

      return null;
   }

   public static final Object[] pattern_NacPatternBuilder_6_16_IsVariableRed_blackB(ObjectVariable objectVariable)
   {
      BindingOperator objectVariable_bindingOperator = objectVariable.getBindingOperator();
      if (objectVariable_bindingOperator.equals(BindingOperator.DESTROY))
      {
         return new Object[] { objectVariable };
      }

      return null;
   }

   public static final Object[] pattern_NacPatternBuilder_6_19_CreateMandatoryVariable_black_nac_0BB(Pattern nacPattern, ObjectVariable objectVariable)
   {
      String objectVariable_name = objectVariable.getName();
      for (Variable knownMandatoryVariable : nacPattern.getSymbolicParameters())
      {
         String knownMandatoryVariable_name = knownMandatoryVariable.getName();
         if (knownMandatoryVariable_name.equals(objectVariable_name))
         {
            return new Object[] { nacPattern, objectVariable };
         }

      }

      return null;
   }

   public static final Object[] pattern_NacPatternBuilder_6_19_CreateMandatoryVariable_blackBBF(ObjectVariable objectVariable, Pattern nacPattern)
   {
      EClassifier eClassifier = objectVariable.getType();
      if (eClassifier != null)
      {
         if (pattern_NacPatternBuilder_6_19_CreateMandatoryVariable_black_nac_0BB(nacPattern, objectVariable) == null)
         {
            return new Object[] { objectVariable, nacPattern, eClassifier };
         }
      }

      return null;
   }

   public static final Object[] pattern_NacPatternBuilder_6_19_CreateMandatoryVariable_greenFBBB(Pattern nacPattern, EClassifier eClassifier,
         ObjectVariable objectVariable)
   {
      EMFVariable mandatoryVariable = EMFTypeFactory.eINSTANCE.createEMFVariable();
      mandatoryVariable.setEClassifier(eClassifier);
      nacPattern.getSymbolicParameters().add(mandatoryVariable);
      String objectVariable_name = objectVariable.getName();
      String mandatoryVariable_name_prime = objectVariable_name;
      mandatoryVariable.setName(mandatoryVariable_name_prime);
      return new Object[] { mandatoryVariable, nacPattern, eClassifier, objectVariable };

   }

   public static final Object[] pattern_NacPatternBuilder_7_1_Init_blackBFFB(ObjectVariable objectVariable, PatternInvocation invocation)
   {
      Pattern pattern = invocation.getPattern();
      if (pattern != null)
      {
         for (PatternBody body : pattern.getBodies())
         {
            return new Object[] { objectVariable, pattern, body, invocation };
         }
      }

      return null;
   }

   public static final Object[] pattern_NacPatternBuilder_7_2_AlreadyExistsAsLocalVariable_blackBFFFFB(PatternBody body, ObjectVariable objectVariable)
   {
      String objectVariable_name = objectVariable.getName();
      for (Constraint tmpExistingInvocationConstraint : body.getConstraints())
      {
         if (tmpExistingInvocationConstraint instanceof PatternInvocationConstraint)
         {
            PatternInvocationConstraint existingInvocationConstraint = (PatternInvocationConstraint) tmpExistingInvocationConstraint;
            Pattern existingNacPattern = existingInvocationConstraint.getInvokedPattern();
            if (existingNacPattern != null)
            {
               boolean existingInvocationConstraint_positive = existingInvocationConstraint.isPositive();
               if (Boolean.valueOf(existingInvocationConstraint_positive).equals(Boolean.valueOf(false)))
               {
                  for (PatternBody existingNacBody : existingNacPattern.getBodies())
                  {
                     if (!body.equals(existingNacBody))
                     {
                        for (Variable tmpExistingLocalVariable : existingNacBody.getLocalVariables())
                        {
                           if (tmpExistingLocalVariable instanceof EMFVariable)
                           {
                              EMFVariable existingLocalVariable = (EMFVariable) tmpExistingLocalVariable;
                              String existingLocalVariable_name = existingLocalVariable.getName();
                              if (existingLocalVariable_name.equals(objectVariable_name))
                              {
                                 return new Object[] { body, existingLocalVariable, existingInvocationConstraint, existingNacBody, existingNacPattern,
                                       objectVariable };
                              }

                           }
                        }
                     }
                  }
               }

            }

         }
      }

      return null;
   }

   public static final Object[] pattern_NacPatternBuilder_7_4_CreateNewNacPattern_blackBB(NacPatternBuilder _this, PatternBody body)
   {
      return new Object[] { _this, body };
   }

   public static final Object[] pattern_NacPatternBuilder_7_4_CreateNewNacPattern_greenFFFBBB(PatternBody body, NacPatternBuilder _this, Pattern pattern)
   {
      PatternInvocationConstraint patternInvocation = SpecificationFactory.eINSTANCE.createPatternInvocationConstraint();
      PatternBody nacPatternBody = SpecificationFactory.eINSTANCE.createPatternBody();
      Pattern nacPattern = SpecificationFactory.eINSTANCE.createPattern();
      boolean patternInvocation_positive_prime = Boolean.valueOf(false);
      String _localVariable_0 = _this.createNacPatternNameAndIncrementCounter(pattern);
      body.getConstraints().add(patternInvocation);
      patternInvocation.setInvokedPattern(nacPattern);
      nacPatternBody.setHeader(nacPattern);
      patternInvocation.setPositive(Boolean.valueOf(patternInvocation_positive_prime));
      String nacPattern_name_prime = _localVariable_0;
      nacPattern.setName(nacPattern_name_prime);
      return new Object[] { patternInvocation, nacPatternBody, nacPattern, body, _this, pattern };
   }

   public static final void pattern_NacPatternBuilder_7_5_AttachNacPatternToResource_expressionBBB(NacPatternBuilder _this, Pattern pattern, Pattern nacPattern)
   {
      _this.attachToResource(pattern, nacPattern);

   }

   public static final void pattern_NacPatternBuilder_7_6_ExploreNegativeVariables_expressionBBB(NacPatternBuilder _this, ObjectVariable objectVariable,
         Pattern nacPattern)
   {
      _this.exploreNacPatternVariables(objectVariable, nacPattern);

   }

   public static final Object[] pattern_NacPatternBuilder_8_1_Init_blackBF(NacPatternBuilder _this)
   {
      PatternTransformer patternTransformer = _this.getPatternTransformer();
      if (patternTransformer != null)
      {
         return new Object[] { _this, patternTransformer };
      }

      return null;
   }

   public static final Iterable<Object[]> pattern_NacPatternBuilder_8_2_ForEachSimpleNacPattern_blackFFFB(StoryPattern storyPattern)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (LinkVariable linkVariable : storyPattern.getLinkVariable())
      {
         ObjectVariable target = linkVariable.getTarget();
         if (target != null)
         {
            ObjectVariable source = linkVariable.getSource();
            if (source != null)
            {
               if (!source.equals(target))
               {
                  BindingSemantics linkVariable_bindingSemantics = linkVariable.getBindingSemantics();
                  if (linkVariable_bindingSemantics.equals(BindingSemantics.NEGATIVE))
                  {
                     BindingSemantics target_bindingSemantics = target.getBindingSemantics();
                     if (target_bindingSemantics.equals(BindingSemantics.MANDATORY))
                     {
                        BindingSemantics source_bindingSemantics = source.getBindingSemantics();
                        if (source_bindingSemantics.equals(BindingSemantics.MANDATORY))
                        {
                           _result.add(new Object[] { source, target, linkVariable, storyPattern });
                        }

                     }

                  }

               }
            }

         }

      }
      return _result;
   }

   public static final Object[] pattern_NacPatternBuilder_8_3_CreateSimpleNacPattern_greenFBB(NacPatternBuilder _this, Pattern pattern)
   {
      Pattern simpleNacPattern = SpecificationFactory.eINSTANCE.createPattern();
      String _localVariable_0 = _this.createNacPatternNameAndIncrementCounter(pattern);
      String simpleNacPattern_name_prime = _localVariable_0;
      simpleNacPattern.setName(simpleNacPattern_name_prime);
      return new Object[] { simpleNacPattern, _this, pattern };
   }

   public static final void pattern_NacPatternBuilder_8_4_AttachSimpleNacPatternToResource_expressionBBB(NacPatternBuilder _this, Pattern pattern,
         Pattern simpleNacPattern)
   {
      _this.attachToResource(pattern, simpleNacPattern);

   }

   public static final Object[] pattern_NacPatternBuilder_8_5_CreateConstraint_bindingFBB(PatternTransformer patternTransformer, LinkVariable linkVariable)
   {
      EReference _localVariable_0 = patternTransformer.getEReference(linkVariable);
      EReference eReference = _localVariable_0;
      if (eReference != null)
      {
         return new Object[] { eReference, patternTransformer, linkVariable };
      }
      return null;
   }

   public static final Object[] pattern_NacPatternBuilder_8_5_CreateConstraint_blackBB(Pattern simpleNacPattern, EReference eReference)
   {
      return new Object[] { simpleNacPattern, eReference };
   }

   public static final Object[] pattern_NacPatternBuilder_8_5_CreateConstraint_bindingAndBlackBFBB(Pattern simpleNacPattern,
         PatternTransformer patternTransformer, LinkVariable linkVariable)
   {
      Object[] result_pattern_NacPatternBuilder_8_5_CreateConstraint_binding = pattern_NacPatternBuilder_8_5_CreateConstraint_bindingFBB(patternTransformer,
            linkVariable);
      if (result_pattern_NacPatternBuilder_8_5_CreateConstraint_binding != null)
      {
         EReference eReference = (EReference) result_pattern_NacPatternBuilder_8_5_CreateConstraint_binding[0];

         Object[] result_pattern_NacPatternBuilder_8_5_CreateConstraint_black = pattern_NacPatternBuilder_8_5_CreateConstraint_blackBB(simpleNacPattern,
               eReference);
         if (result_pattern_NacPatternBuilder_8_5_CreateConstraint_black != null)
         {

            return new Object[] { simpleNacPattern, eReference, patternTransformer, linkVariable };
         }
      }
      return null;
   }

   public static final Object[] pattern_NacPatternBuilder_8_5_CreateConstraint_greenBFBF(Pattern simpleNacPattern, EReference eReference)
   {
      PatternBody simpleNacPatternBody = SpecificationFactory.eINSTANCE.createPatternBody();
      Reference simpleNacConstraint = EMFTypeFactory.eINSTANCE.createReference();
      simpleNacPatternBody.setHeader(simpleNacPattern);
      simpleNacPatternBody.getConstraints().add(simpleNacConstraint);
      simpleNacConstraint.setEModelElement(eReference);
      return new Object[] { simpleNacPattern, simpleNacPatternBody, eReference, simpleNacConstraint };
   }

   public static final Object[] pattern_NacPatternBuilder_8_6_LookupSourceType_blackBF(ObjectVariable source)
   {
      EClassifier sourceType = source.getType();
      if (sourceType != null)
      {
         return new Object[] { source, sourceType };
      }

      return null;
   }

   public static final Object[] pattern_NacPatternBuilder_8_7_LookupTargetType_blackFB(ObjectVariable target)
   {
      EClassifier targetType = target.getType();
      if (targetType != null)
      {
         return new Object[] { targetType, target };
      }

      return null;
   }

   public static final Object[] pattern_NacPatternBuilder_8_8_CreateSourceVariable_bindingFBBBB(PatternTransformer patternTransformer, Pattern pattern,
         ObjectVariable source, EClassifier sourceType)
   {
      String source_name = source.getName();
      Variable _localVariable_0 = patternTransformer.lookupVariableInPattern(pattern, source_name, sourceType);
      Variable sourceVariable = _localVariable_0;
      if (sourceVariable != null)
      {
         return new Object[] { sourceVariable, patternTransformer, pattern, source, sourceType };
      }

      return null;
   }

   public static final Object[] pattern_NacPatternBuilder_8_8_CreateSourceVariable_blackBBBB(Variable sourceVariable, Reference simpleNacConstraint,
         Pattern simpleNacPattern, EClassifier sourceType)
   {
      return new Object[] { sourceVariable, simpleNacConstraint, simpleNacPattern, sourceType };
   }

   public static final Object[] pattern_NacPatternBuilder_8_8_CreateSourceVariable_bindingAndBlackFBBBBBB(Reference simpleNacConstraint,
         Pattern simpleNacPattern, EClassifier sourceType, PatternTransformer patternTransformer, Pattern pattern, ObjectVariable source)
   {
      Object[] result_pattern_NacPatternBuilder_8_8_CreateSourceVariable_binding = pattern_NacPatternBuilder_8_8_CreateSourceVariable_bindingFBBBB(
            patternTransformer, pattern, source, sourceType);
      if (result_pattern_NacPatternBuilder_8_8_CreateSourceVariable_binding != null)
      {
         Variable sourceVariable = (Variable) result_pattern_NacPatternBuilder_8_8_CreateSourceVariable_binding[0];

         Object[] result_pattern_NacPatternBuilder_8_8_CreateSourceVariable_black = pattern_NacPatternBuilder_8_8_CreateSourceVariable_blackBBBB(sourceVariable,
               simpleNacConstraint, simpleNacPattern, sourceType);
         if (result_pattern_NacPatternBuilder_8_8_CreateSourceVariable_black != null)
         {

            return new Object[] { sourceVariable, simpleNacConstraint, simpleNacPattern, sourceType, patternTransformer, pattern, source };
         }
      }
      return null;
   }

   public static final Object[] pattern_NacPatternBuilder_8_8_CreateSourceVariable_greenFBBFBB(Reference simpleNacConstraint, Pattern simpleNacPattern,
         EClassifier sourceType, ObjectVariable source)
   {
      ConstraintParameter sourceParameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
      EMFVariable sourceNacVariable = EMFTypeFactory.eINSTANCE.createEMFVariable();
      simpleNacConstraint.getParameters().add(sourceParameter);
      sourceParameter.setReference(sourceNacVariable);
      simpleNacPattern.getSymbolicParameters().add(sourceNacVariable);
      sourceNacVariable.setEClassifier(sourceType);
      String source_name = source.getName();
      String sourceNacVariable_name_prime = source_name;
      sourceNacVariable.setName(sourceNacVariable_name_prime);
      return new Object[] { sourceParameter, simpleNacConstraint, simpleNacPattern, sourceNacVariable, sourceType, source };

   }

   public static final Object[] pattern_NacPatternBuilder_8_9_CreateTargetVariable_bindingFBBBB(PatternTransformer patternTransformer, Pattern pattern,
         ObjectVariable target, EClassifier targetType)
   {
      String target_name = target.getName();
      Variable _localVariable_0 = patternTransformer.lookupVariableInPattern(pattern, target_name, targetType);
      Variable targetVariable = _localVariable_0;
      if (targetVariable != null)
      {
         return new Object[] { targetVariable, patternTransformer, pattern, target, targetType };
      }

      return null;
   }

   public static final Object[] pattern_NacPatternBuilder_8_9_CreateTargetVariable_blackBBBB(EClassifier targetType, Reference simpleNacConstraint,
         Variable targetVariable, Pattern simpleNacPattern)
   {
      return new Object[] { targetType, simpleNacConstraint, targetVariable, simpleNacPattern };
   }

   public static final Object[] pattern_NacPatternBuilder_8_9_CreateTargetVariable_bindingAndBlackBBFBBBB(EClassifier targetType, Reference simpleNacConstraint,
         Pattern simpleNacPattern, PatternTransformer patternTransformer, Pattern pattern, ObjectVariable target)
   {
      Object[] result_pattern_NacPatternBuilder_8_9_CreateTargetVariable_binding = pattern_NacPatternBuilder_8_9_CreateTargetVariable_bindingFBBBB(
            patternTransformer, pattern, target, targetType);
      if (result_pattern_NacPatternBuilder_8_9_CreateTargetVariable_binding != null)
      {
         Variable targetVariable = (Variable) result_pattern_NacPatternBuilder_8_9_CreateTargetVariable_binding[0];

         Object[] result_pattern_NacPatternBuilder_8_9_CreateTargetVariable_black = pattern_NacPatternBuilder_8_9_CreateTargetVariable_blackBBBB(targetType,
               simpleNacConstraint, targetVariable, simpleNacPattern);
         if (result_pattern_NacPatternBuilder_8_9_CreateTargetVariable_black != null)
         {

            return new Object[] { targetType, simpleNacConstraint, targetVariable, simpleNacPattern, patternTransformer, pattern, target };
         }
      }
      return null;
   }

   public static final Object[] pattern_NacPatternBuilder_8_9_CreateTargetVariable_greenBBFFBB(EClassifier targetType, Reference simpleNacConstraint,
         Pattern simpleNacPattern, ObjectVariable target)
   {
      EMFVariable targetNacVariable = EMFTypeFactory.eINSTANCE.createEMFVariable();
      ConstraintParameter targetParameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
      targetNacVariable.setEClassifier(targetType);
      simpleNacPattern.getSymbolicParameters().add(targetNacVariable);
      simpleNacConstraint.getParameters().add(targetParameter);
      targetParameter.setReference(targetNacVariable);
      String target_name = target.getName();
      String targetNacVariable_name_prime = target_name;
      targetNacVariable.setName(targetNacVariable_name_prime);
      return new Object[] { targetType, simpleNacConstraint, targetNacVariable, targetParameter, simpleNacPattern, target };

   }

   public static final Object[] pattern_NacPatternBuilder_8_10_CreatePatternInvocationConstraint_blackFBB(Pattern pattern, Pattern simpleNacPattern)
   {
      if (!pattern.equals(simpleNacPattern))
      {
         for (PatternBody body : pattern.getBodies())
         {
            return new Object[] { body, pattern, simpleNacPattern };
         }
      }
      return null;
   }

   public static final Object[] pattern_NacPatternBuilder_8_10_CreatePatternInvocationConstraint_greenFBB(PatternBody body, Pattern simpleNacPattern)
   {
      PatternInvocationConstraint patternInvocation = SpecificationFactory.eINSTANCE.createPatternInvocationConstraint();
      boolean patternInvocation_positive_prime = Boolean.valueOf(false);
      patternInvocation.setInvokedPattern(simpleNacPattern);
      body.getConstraints().add(patternInvocation);
      patternInvocation.setPositive(Boolean.valueOf(patternInvocation_positive_prime));
      return new Object[] { patternInvocation, body, simpleNacPattern };
   }

   public static final void pattern_NacPatternBuilder_8_11_EmbedSimpleNacPattern_expressionBBBB(NacPatternBuilder _this, Pattern pattern,
         PatternInvocationConstraint patternInvocation, Pattern simpleNacPattern)
   {
      _this.embedNacPattern(pattern, patternInvocation, simpleNacPattern);

   }

   public static final Object[] pattern_NacPatternBuilder_9_1_LookupParentBuilder_blackFB(NacPatternBuilder _this)
   {
      CompoundPatternInvocationBuilder parent = _this.getParentBuilder();
      if (parent != null)
      {
         return new Object[] { parent, _this };
      }

      return null;
   }

   public static final Object[] pattern_NacPatternBuilder_9_2_DelegateToParent_bindingFBB(CompoundPatternInvocationBuilder parent, CFNode node)
   {
      PatternInvocation _localVariable_0 = parent.lookupAction(node);
      PatternInvocation invocation = _localVariable_0;
      if (invocation != null)
      {
         return new Object[] { invocation, parent, node };
      }
      return null;
   }

   public static final Object[] pattern_NacPatternBuilder_9_2_DelegateToParent_blackB(PatternInvocation invocation)
   {
      return new Object[] { invocation };
   }

   public static final Object[] pattern_NacPatternBuilder_9_2_DelegateToParent_bindingAndBlackFBB(CompoundPatternInvocationBuilder parent, CFNode node)
   {
      Object[] result_pattern_NacPatternBuilder_9_2_DelegateToParent_binding = pattern_NacPatternBuilder_9_2_DelegateToParent_bindingFBB(parent, node);
      if (result_pattern_NacPatternBuilder_9_2_DelegateToParent_binding != null)
      {
         PatternInvocation invocation = (PatternInvocation) result_pattern_NacPatternBuilder_9_2_DelegateToParent_binding[0];

         Object[] result_pattern_NacPatternBuilder_9_2_DelegateToParent_black = pattern_NacPatternBuilder_9_2_DelegateToParent_blackB(invocation);
         if (result_pattern_NacPatternBuilder_9_2_DelegateToParent_black != null)
         {

            return new Object[] { invocation, parent, node };
         }
      }
      return null;
   }

   public static final PatternInvocation pattern_NacPatternBuilder_9_3_expressionFB(PatternInvocation invocation)
   {
      PatternInvocation _result = invocation;
      return _result;
   }

   public static final Object[] pattern_NacPatternBuilder_10_1_Init_bindingFB(NacPatternBuilder _this)
   {
      RegularPatternInvocationBuilder _localVariable_0 = _this.getPatternInvocationBuilder();
      RegularPatternInvocationBuilder invocationBuilder = _localVariable_0;
      if (invocationBuilder != null)
      {
         return new Object[] { invocationBuilder, _this };
      }
      return null;
   }

   public static final Object[] pattern_NacPatternBuilder_10_1_Init_blackFBFBF(RegularPatternInvocationBuilder invocationBuilder, NacPatternBuilder _this)
   {
      if (!invocationBuilder.equals(_this))
      {
         Action tmpInvocation = invocationBuilder.getResult();
         if (tmpInvocation instanceof PatternInvocation)
         {
            PatternInvocation invocation = (PatternInvocation) tmpInvocation;
            ExpressionExplorer expressionExplorer = _this.getExpressionExplorer();
            if (expressionExplorer != null)
            {
               Pattern pattern = invocation.getPattern();
               if (pattern != null)
               {
                  return new Object[] { pattern, invocationBuilder, invocation, _this, expressionExplorer };
               }

            }

         }

      }
      return null;
   }

   public static final Object[] pattern_NacPatternBuilder_10_1_Init_bindingAndBlackFFFBF(NacPatternBuilder _this)
   {
      Object[] result_pattern_NacPatternBuilder_10_1_Init_binding = pattern_NacPatternBuilder_10_1_Init_bindingFB(_this);
      if (result_pattern_NacPatternBuilder_10_1_Init_binding != null)
      {
         RegularPatternInvocationBuilder invocationBuilder = (RegularPatternInvocationBuilder) result_pattern_NacPatternBuilder_10_1_Init_binding[0];

         Object[] result_pattern_NacPatternBuilder_10_1_Init_black = pattern_NacPatternBuilder_10_1_Init_blackFBFBF(invocationBuilder, _this);
         if (result_pattern_NacPatternBuilder_10_1_Init_black != null)
         {
            Pattern pattern = (Pattern) result_pattern_NacPatternBuilder_10_1_Init_black[0];
            PatternInvocation invocation = (PatternInvocation) result_pattern_NacPatternBuilder_10_1_Init_black[2];
            ExpressionExplorer expressionExplorer = (ExpressionExplorer) result_pattern_NacPatternBuilder_10_1_Init_black[4];

            return new Object[] { pattern, invocationBuilder, invocation, _this, expressionExplorer };
         }
      }
      return null;
   }

   public static final Iterable<Object[]> pattern_NacPatternBuilder_10_2_ForAllNacPatterns_blackFFFB(Pattern pattern)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (PatternBody body : pattern.getBodies())
      {
         for (Constraint tmpNacPatternInvocation : body.getConstraints())
         {
            if (tmpNacPatternInvocation instanceof PatternInvocationConstraint)
            {
               PatternInvocationConstraint nacPatternInvocation = (PatternInvocationConstraint) tmpNacPatternInvocation;
               Pattern nacPattern = nacPatternInvocation.getInvokedPattern();
               if (nacPattern != null)
               {
                  if (!nacPattern.equals(pattern))
                  {
                     boolean nacPatternInvocation_positive = nacPatternInvocation.isPositive();
                     if (Boolean.valueOf(nacPatternInvocation_positive).equals(Boolean.valueOf(false)))
                     {
                        _result.add(new Object[] { nacPatternInvocation, nacPattern, body, pattern });
                     }

                  }
               }

            }
         }
      }
      return _result;
   }

   public static final Iterable<Object[]> pattern_NacPatternBuilder_10_3_ForAllNegativeObjectVariables_blackFB(StoryPattern storyPattern)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (ObjectVariable objectVariable : storyPattern.getObjectVariable())
      {
         BindingOperator objectVariable_bindingOperator = objectVariable.getBindingOperator();
         if (objectVariable_bindingOperator.equals(BindingOperator.CHECK_ONLY))
         {
            BindingSemantics objectVariable_bindingSemantics = objectVariable.getBindingSemantics();
            if (objectVariable_bindingSemantics.equals(BindingSemantics.NEGATIVE))
            {
               _result.add(new Object[] { objectVariable, storyPattern });
            }

         }

      }
      return _result;
   }

   public static final Object[] pattern_NacPatternBuilder_10_4_BelongsToNacPattern_blackBFFB(Pattern nacPattern, ObjectVariable objectVariable)
   {
      String objectVariable_name = objectVariable.getName();
      for (PatternBody nacBody : nacPattern.getBodies())
      {
         for (Variable localVariable : nacBody.getLocalVariables())
         {
            String localVariable_name = localVariable.getName();
            if (localVariable_name.equals(objectVariable_name))
            {
               return new Object[] { nacPattern, nacBody, localVariable, objectVariable };
            }

         }
      }

      return null;
   }

   public static final void pattern_NacPatternBuilder_10_5_HandleAttributeConstraints_expressionBBBB(NacPatternBuilder _this,
         ExpressionExplorer expressionExplorer, ObjectVariable objectVariable, Pattern nacPattern)
   {
      _this.exploreAttributeConstraints(_this, expressionExplorer, objectVariable, nacPattern);

   }

   public static final void pattern_NacPatternBuilder_10_6_EmbedNacPattern_expressionBBBB(NacPatternBuilder _this, Pattern pattern,
         PatternInvocationConstraint nacPatternInvocation, Pattern nacPattern)
   {
      _this.embedNacPattern(pattern, nacPatternInvocation, nacPattern);

   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //NacPatternBuilderImpl
