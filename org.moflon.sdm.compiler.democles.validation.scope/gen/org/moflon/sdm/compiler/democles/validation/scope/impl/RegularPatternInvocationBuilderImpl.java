/**
 */
package org.moflon.sdm.compiler.democles.validation.scope.impl;

import SDMLanguage.activities.ActivityNode;
import SDMLanguage.activities.StoryNode;

import SDMLanguage.expressions.BinaryExpression;
import SDMLanguage.expressions.Expression;

import SDMLanguage.patterns.AttributeAssignment;
import SDMLanguage.patterns.BindingOperator;
import SDMLanguage.patterns.Constraint;
import SDMLanguage.patterns.ObjectVariable;
import SDMLanguage.patterns.StoryPattern;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.Variable;

import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;

import org.moflon.sdm.compiler.democles.pattern.DefaultExpressionTransformer;
import org.moflon.sdm.compiler.democles.pattern.ExpressionTransformer;
import org.moflon.sdm.compiler.democles.pattern.PatternTransformer;

import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;

import org.moflon.sdm.compiler.democles.validation.scope.CompoundActionBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.CompoundPatternInvocationBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.ExpressionExplorer;
import org.moflon.sdm.compiler.democles.validation.scope.PatternInvocationBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.PatternMatcher;
import org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.ScopePackage;
import org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator;

import org.moflon.sdm.runtime.democles.Action;
import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.CFVariable;
import org.moflon.sdm.runtime.democles.DemoclesFactory;
import org.moflon.sdm.runtime.democles.PatternInvocation;
import org.moflon.sdm.runtime.democles.RegularPatternInvocation;
import org.moflon.sdm.runtime.democles.VariableReference;
// <-- [user defined imports]
import java.util.List;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gervarro.democles.common.Adornment;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regular Pattern Invocation Builder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.impl.RegularPatternInvocationBuilderImpl#getParentBuilder <em>Parent Builder</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.impl.RegularPatternInvocationBuilderImpl#getPatternTransformer <em>Pattern Transformer</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.impl.RegularPatternInvocationBuilderImpl#isMainActionBuilder <em>Main Action Builder</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegularPatternInvocationBuilderImpl extends PatternInvocationBuilderImpl implements RegularPatternInvocationBuilder
{
   /**
    * The cached value of the '{@link #getPatternTransformer() <em>Pattern Transformer</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getPatternTransformer()
    * @generated
    * @ordered
    */
   protected PatternTransformer patternTransformer;

   /**
    * The default value of the '{@link #isMainActionBuilder() <em>Main Action Builder</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isMainActionBuilder()
    * @generated
    * @ordered
    */
   protected static final boolean MAIN_ACTION_BUILDER_EDEFAULT = false;

   /**
    * The cached value of the '{@link #isMainActionBuilder() <em>Main Action Builder</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isMainActionBuilder()
    * @generated
    * @ordered
    */
   protected boolean mainActionBuilder = MAIN_ACTION_BUILDER_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected RegularPatternInvocationBuilderImpl()
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
      return ScopePackage.Literals.REGULAR_PATTERN_INVOCATION_BUILDER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CompoundPatternInvocationBuilder getParentBuilder()
   {
      if (eContainerFeatureID() != ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER__PARENT_BUILDER)
         return null;
      return (CompoundPatternInvocationBuilder) eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetParentBuilder(CompoundPatternInvocationBuilder newParentBuilder, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newParentBuilder, ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER__PARENT_BUILDER, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setParentBuilder(CompoundPatternInvocationBuilder newParentBuilder)
   {
      if (newParentBuilder != eInternalContainer()
            || (eContainerFeatureID() != ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER__PARENT_BUILDER && newParentBuilder != null))
      {
         if (EcoreUtil.isAncestor(this, newParentBuilder))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newParentBuilder != null)
            msgs = ((InternalEObject) newParentBuilder).eInverseAdd(this, ScopePackage.COMPOUND_PATTERN_INVOCATION_BUILDER__CHILD_BUILDERS,
                  CompoundPatternInvocationBuilder.class, msgs);
         msgs = basicSetParentBuilder(newParentBuilder, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER__PARENT_BUILDER, newParentBuilder,
               newParentBuilder));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PatternTransformer getPatternTransformer()
   {
      return patternTransformer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetPatternTransformer(PatternTransformer newPatternTransformer, NotificationChain msgs)
   {
      PatternTransformer oldPatternTransformer = patternTransformer;
      patternTransformer = newPatternTransformer;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER__PATTERN_TRANSFORMER,
               oldPatternTransformer, newPatternTransformer);
         if (msgs == null)
            msgs = notification;
         else
            msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setPatternTransformer(PatternTransformer newPatternTransformer)
   {
      if (newPatternTransformer != patternTransformer)
      {
         NotificationChain msgs = null;
         if (patternTransformer != null)
            msgs = ((InternalEObject) patternTransformer).eInverseRemove(this,
                  EOPPOSITE_FEATURE_BASE - ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER__PATTERN_TRANSFORMER, null, msgs);
         if (newPatternTransformer != null)
            msgs = ((InternalEObject) newPatternTransformer).eInverseAdd(this,
                  EOPPOSITE_FEATURE_BASE - ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER__PATTERN_TRANSFORMER, null, msgs);
         msgs = basicSetPatternTransformer(newPatternTransformer, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER__PATTERN_TRANSFORMER, newPatternTransformer,
               newPatternTransformer));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isMainActionBuilder()
   {
      return mainActionBuilder;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setMainActionBuilder(boolean newMainActionBuilder)
   {
      boolean oldMainActionBuilder = mainActionBuilder;
      mainActionBuilder = newMainActionBuilder;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER__MAIN_ACTION_BUILDER, oldMainActionBuilder,
               mainActionBuilder));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void analyzeDependencies(PatternInvocationBuilder patternInvocationBuilder, StoryPattern storyPattern, Pattern pattern)
   {

      Object[] result1_black = RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_0_1_Init_blackBF(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      ExpressionExplorer expressionExplorer = (ExpressionExplorer) result1_black[1];
      // ForEach 
      for (Object[] result2_black : RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_0_2_ForAllObjectVariables_blackBF(storyPattern))
      {
         ObjectVariable objectVariable = (ObjectVariable) result2_black[1];
         // 
         if (RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_0_3_IsRelevantObjectVariable_expressionFBB(this, objectVariable))
         {
            // 
            Object[] result4_black = RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_0_4_IsVariableBlack_blackB(objectVariable);
            if (result4_black != null)
            {
               // 
               RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_0_5_ExploreBlackAttributeConstraints_expressionBBBBB(this,
                     patternInvocationBuilder, expressionExplorer, objectVariable, pattern);
               // 
               RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_0_6_ExploreBlackAttributeAssignments_expressionBBBBB(this,
                     patternInvocationBuilder, expressionExplorer, objectVariable, pattern);

            } else
            {
               // 
               Object[] result7_black = RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_0_7_IsVariableRed_blackB(objectVariable);
               if (result7_black != null)
               {
                  // 
                  RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_0_8_HandleRedAttributeConstraints_expressionBBBBB(this,
                        patternInvocationBuilder, expressionExplorer, objectVariable, pattern);
                  // 
                  Object[] result9_black = RegularPatternInvocationBuilderImpl
                        .pattern_RegularPatternInvocationBuilder_0_9_RedAssignmentExists_blackBF(objectVariable);
                  if (result9_black != null)
                  {
                     //nothing AttributeAssignment redAssignment = (AttributeAssignment) result9_black[1];
                     // 

                  } else
                  {
                  }

               } else
               {
                  // 
                  Object[] result11_black = RegularPatternInvocationBuilderImpl
                        .pattern_RegularPatternInvocationBuilder_0_11_IsVariableGreen_blackB(objectVariable);
                  if (result11_black != null)
                  {
                     // 
                     RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_0_12_HandleGreenAttributeAssignments_expressionBBBBB(this,
                           patternInvocationBuilder, expressionExplorer, objectVariable, pattern);
                     // 
                     Object[] result13_black = RegularPatternInvocationBuilderImpl
                           .pattern_RegularPatternInvocationBuilder_0_13_GreenConstraintExists_blackFB(objectVariable);
                     if (result13_black != null)
                     {
                        //nothing Constraint greenConstraint = (Constraint) result13_black[0];
                        // 

                     } else
                     {
                     }

                  } else
                  {
                  }

               }

            }

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
   public void buildAction(CFNode node)
   {

      Object[] result1_bindingAndBlack = RegularPatternInvocationBuilderImpl
            .pattern_RegularPatternInvocationBuilder_1_1_LookupActivityNode_bindingAndBlackFFFBBF(node, this);
      if (result1_bindingAndBlack == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[node] = " + node + ", " + "[this] = " + this + ".");
      }
      ValidationReport report = (ValidationReport) result1_bindingAndBlack[0];
      StoryPattern storyPattern = (StoryPattern) result1_bindingAndBlack[1];
      //nothing StoryNode storyNode = (StoryNode) result1_bindingAndBlack[2];
      //nothing ScopeValidator scopeValidator = (ScopeValidator) result1_bindingAndBlack[5];
      // 
      RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_1_2_BuildPatternInterface_expressionBBB(this, node, storyPattern);
      // 
      Object[] result3_black = RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_1_3_HasInvocationResult_blackBFF(this);
      if (result3_black != null)
      {
         Pattern democlesPattern = (Pattern) result3_black[1];
         RegularPatternInvocation invocationResult = (RegularPatternInvocation) result3_black[2];
         // 
         Object[] result4_black = RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_1_4_HandleMainAction_blackBBB(this,
               invocationResult, node);
         if (result4_black != null)
         {
            RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_1_4_HandleMainAction_greenBB(invocationResult, node);

         } else
         {
         }
         // 
         Object[] result5_black = RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_1_5_LookupPatternMatcher_blackBF(this);
         if (result5_black != null)
         {
            PatternMatcher patternMatcher = (PatternMatcher) result5_black[1];
            // 
            RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_1_6_BuildPatternContent_expressionBBB(this, invocationResult,
                  storyPattern);
            // 
            if (RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_1_7_HasErrors_expressionFB(this))
            {
            } else
            {

               Object[] result8_bindingAndBlack = RegularPatternInvocationBuilderImpl
                     .pattern_RegularPatternInvocationBuilder_1_8_GenerateSearchPlan_bindingAndBlackFBBBB(patternMatcher, democlesPattern, this,
                           invocationResult);
               if (result8_bindingAndBlack == null)
               {
                  throw new RuntimeException("Pattern matching failed." + " Variables: " + "[patternMatcher] = " + patternMatcher + ", "
                        + "[democlesPattern] = " + democlesPattern + ", " + "[this] = " + this + ", " + "[invocationResult] = " + invocationResult + ".");
               }
               ValidationReport patternMatchingReport = (ValidationReport) result8_bindingAndBlack[0];
               // 
               RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_1_9_HandlePatternMatchingReport_expressionBBB(this, invocationResult,
                     patternMatchingReport);
               // 
               RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_1_10_MergePatternMatchingResult_expressionBB(report,
                     patternMatchingReport);

            }

         } else
         {
         }

         Object[] result11_black = RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_1_11_RemoveResultLink_blackBB(invocationResult,
               this);
         if (result11_black == null)
         {
            throw new RuntimeException(
                  "Pattern matching failed." + " Variables: " + "[invocationResult] = " + invocationResult + ", " + "[this] = " + this + ".");
         }
         RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_1_11_RemoveResultLink_redBB(invocationResult, this);

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
   public void buildPatternContent(RegularPatternInvocation invocation, StoryPattern storyPattern)
   {

      Object[] result1_black = RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_2_1_Init_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }

      Object[] result2_black = RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_2_2_LookupDemoclesPattern_blackFB(invocation);
      if (result2_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[invocation] = " + invocation + ".");
      }
      Pattern democlesPattern = (Pattern) result2_black[0];
      // 
      RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_2_3_TransformPattern_expressionBBB(this, storyPattern, democlesPattern);
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void buildPatternInterface(CFNode node, StoryPattern storyPattern)
   {

      Object[] result1_black = RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_3_1_LookupThisObject_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      // ForEach 
      for (Object[] result2_black : RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_3_2_ForAllObjectVariables_blackBF(storyPattern))
      {
         ObjectVariable objectVariable = (ObjectVariable) result2_black[1];
         // 
         if (RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_3_3_IsRelevantObjectVariable_expressionFBB(this, objectVariable))
         {

            Object[] result4_bindingAndBlack = RegularPatternInvocationBuilderImpl
                  .pattern_RegularPatternInvocationBuilder_3_4_LookupOrCreateAction_bindingAndBlackFBB(this, node);
            if (result4_bindingAndBlack == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[node] = " + node + ".");
            }
            PatternInvocation invocation = (PatternInvocation) result4_bindingAndBlack[0];
            // 
            RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_3_5_HandleRelevantObjectVariable_expressionBBB(this, invocation,
                  objectVariable);

         } else
         {
         }

      }
      // 
      RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_3_6_PostprocessPatternInterface_expressionBB(this, storyPattern);
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public RegularPatternInvocation createAction()
   {

      Object[] result1_green = RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_4_1_CreateRegularPatternInvocation_greenF();
      if (result1_green == null)
      {
         throw new RuntimeException("Pattern matching failed.");
      }
      RegularPatternInvocation newInvocation = (RegularPatternInvocation) result1_green[0];
      return RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_4_2_expressionFB(newInvocation);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void exploreAttributeAssignments(PatternInvocationBuilder invocationBuilder, ExpressionExplorer expressionExplorer, ObjectVariable objectVariable,
         Pattern pattern)
   {// ForEach 
      for (Object[] result1_black : RegularPatternInvocationBuilderImpl
            .pattern_RegularPatternInvocationBuilder_5_1_ForAllAttributeAssignments_blackFFB(objectVariable))
      {
         //nothing AttributeAssignment assignment = (AttributeAssignment) result1_black[0];
         Expression expression = (Expression) result1_black[1];
         // 
         RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_5_2_HandleAssignmentExpression_expressionBBBB(expressionExplorer,
               invocationBuilder, pattern, expression);

      }
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void exploreAttributeConstraints(PatternInvocationBuilder invocationBuilder, ExpressionExplorer expressionExplorer, ObjectVariable objectVariable,
         Pattern pattern)
   {// ForEach 
      for (Object[] result1_black : RegularPatternInvocationBuilderImpl
            .pattern_RegularPatternInvocationBuilder_6_1_ForAllAttributeConstraints_blackFBFF(objectVariable))
      {
         //nothing Constraint constraint = (Constraint) result1_black[0];
         Expression constraintExpression = (Expression) result1_black[2];
         //nothing BinaryExpression binaryExpression = (BinaryExpression) result1_black[3];
         // 
         RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_6_2_ExploreConstraintExpression_expressionBBBB(expressionExplorer,
               invocationBuilder, pattern, constraintExpression);

      }
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public RegularPatternInvocationBuilder getPatternInvocationBuilder()
   {// 
      Object[] result1_black = RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_7_1_HasResult_blackFB(this);
      if (result1_black != null)
      {
         //nothing PatternInvocation invocation = (PatternInvocation) result1_black[0];
         return RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_7_2_expressionFB(this);
      } else
      {
         // 
         Object[] result3_black = RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_7_3_HasParentBuilder_blackFB(this);
         if (result3_black != null)
         {
            CompoundPatternInvocationBuilder parentBuilder = (CompoundPatternInvocationBuilder) result3_black[0];

            Object[] result4_bindingAndBlack = RegularPatternInvocationBuilderImpl
                  .pattern_RegularPatternInvocationBuilder_7_4_DelegateToParentBuilder_bindingAndBlackFB(parentBuilder);
            if (result4_bindingAndBlack == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[parentBuilder] = " + parentBuilder + ".");
            }
            RegularPatternInvocationBuilder result = (RegularPatternInvocationBuilder) result4_bindingAndBlack[0];
            return RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_7_5_expressionFB(result);
         } else
         {
            return RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_7_6_expressionFB(this);
         }

      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void handleRelevantObjectVariable(PatternInvocation invocation, ObjectVariable objectVariable)
   {

      Object[] result1_black = RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_8_1_LookupPattern_blackBFB(this, invocation);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[invocation] = " + invocation + ".");
      }
      Pattern pattern = (Pattern) result1_black[1];
      // 
      Object[] result2_black = RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_8_2_ExistsAsSymbolicParameter_blackFBB(pattern,
            objectVariable);
      if (result2_black != null)
      {
         //nothing Variable variable = (Variable) result2_black[0];
         return;
      } else
      {

         Object[] result4_black = RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_8_4_CreatePatternVariable_blackBFB(objectVariable,
               pattern);
         if (result4_black == null)
         {
            throw new RuntimeException(
                  "Pattern matching failed." + " Variables: " + "[objectVariable] = " + objectVariable + ", " + "[pattern] = " + pattern + ".");
         }
         EClassifier eClassifier = (EClassifier) result4_black[1];
         Object[] result4_green = RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_8_4_CreatePatternVariable_greenBBFB(eClassifier,
               pattern, objectVariable);
         EMFVariable newVariable = (EMFVariable) result4_green[2];

         Object[] result5_bindingAndBlack = RegularPatternInvocationBuilderImpl
               .pattern_RegularPatternInvocationBuilder_8_5_CreateVariableReference_bindingAndBlackFFBBB(this, newVariable, eClassifier);
         if (result5_bindingAndBlack == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[newVariable] = " + newVariable + ", "
                  + "[eClassifier] = " + eClassifier + ".");
         }
         CFVariable controlFlowVariable = (CFVariable) result5_bindingAndBlack[0];
         //nothing VariableReference newVarRef = (VariableReference) result5_bindingAndBlack[1];
         // 
         RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_8_6_ValidateVariable_expressionBBBB(this, invocation, controlFlowVariable,
               objectVariable);
         return;
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public VariableReference handleVariableReference(Variable variable, EClassifier variableType)
   {// 
      Object[] result1_black = RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_9_1_IsCurrentBuilderResponsible_blackBFBF(this,
            variable);
      if (result1_black != null)
      {
         //nothing Pattern democlesPattern = (Pattern) result1_black[1];
         //nothing RegularPatternInvocation invocation = (RegularPatternInvocation) result1_black[3];

         Object[] result2_bindingAndBlack = RegularPatternInvocationBuilderImpl
               .pattern_RegularPatternInvocationBuilder_9_2_DelegateToSuperclass_bindingAndBlackFBBB(this, variable, variableType);
         if (result2_bindingAndBlack == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[variable] = " + variable + ", "
                  + "[variableType] = " + variableType + ".");
         }
         VariableReference reference = (VariableReference) result2_bindingAndBlack[0];
         return RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_9_3_expressionFB(reference);
      } else
      {
         return RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_9_4_expressionF();
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public VariableReference handleVariableReferenceInSuperclass(Variable variable, EClassifier variableType)
   {
      // [user code injected with eMoflon]

      return super.handleVariableReference(variable, variableType);

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isVariableToAdd(ObjectVariable objectVariable)
   {// 
      Object[] result1_black = RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_11_1_HasPatternTransformer_blackBF(this);
      if (result1_black != null)
      {
         PatternTransformer patternTransformer = (PatternTransformer) result1_black[1];
         // 
         if (RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_11_2_DelegatingDecision_expressionFBB(patternTransformer,
               objectVariable))
         {
            return RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_11_3_expressionF();
         } else
         {
         }

      } else
      {
      }
      return RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_11_4_expressionF();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ScopeValidator lookupScopeValidator()
   {// 
      Object[] result1_black = RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_12_1_HasBindingPatternBuilder_blackBF(this);
      if (result1_black != null)
      {
         CompoundPatternInvocationBuilder parentPatternInvocationBuilder = (CompoundPatternInvocationBuilder) result1_black[1];

         Object[] result2_bindingAndBlack = RegularPatternInvocationBuilderImpl
               .pattern_RegularPatternInvocationBuilder_12_2_LookupPatternInvocationScopeValidator_bindingAndBlackFB(parentPatternInvocationBuilder);
         if (result2_bindingAndBlack == null)
         {
            throw new RuntimeException(
                  "Pattern matching failed." + " Variables: " + "[parentPatternInvocationBuilder] = " + parentPatternInvocationBuilder + ".");
         }
         ScopeValidator parentPatternInvocationScopeValidator = (ScopeValidator) result2_bindingAndBlack[0];
         return RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_12_3_expressionFB(parentPatternInvocationScopeValidator);
      } else
      {
         // 
         Object[] result4_black = RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_12_4_HasParentActionBuilder_blackFB(this);
         if (result4_black != null)
         {
            CompoundActionBuilder parentActionBuilder = (CompoundActionBuilder) result4_black[0];

            Object[] result5_bindingAndBlack = RegularPatternInvocationBuilderImpl
                  .pattern_RegularPatternInvocationBuilder_12_5_LookupParentActionScopeValidator_bindingAndBlackFB(parentActionBuilder);
            if (result5_bindingAndBlack == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[parentActionBuilder] = " + parentActionBuilder + ".");
            }
            ScopeValidator parentActionScopeValidator = (ScopeValidator) result5_bindingAndBlack[0];
            return RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_12_6_expressionFB(parentActionScopeValidator);
         } else
         {

            Object[] result7_black = RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_12_7_LookupScopeValidator_blackFB(this);
            if (result7_black == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
            }
            ScopeValidator validator = (ScopeValidator) result7_black[0];
            return RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_12_8_expressionFB(validator);
         }

      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void postprocessPatternInterface(StoryPattern storyPattern)
   {

      Object[] result1_black = RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_13_1_Init_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      // 
      Object[] result2_bindingAndBlack = RegularPatternInvocationBuilderImpl
            .pattern_RegularPatternInvocationBuilder_13_2_LookupPattern_bindingAndBlackFFFB(this);
      if (result2_bindingAndBlack != null)
      {
         //nothing PatternInvocation invocationResult = (PatternInvocation) result2_bindingAndBlack[0];
         Pattern pattern = (Pattern) result2_bindingAndBlack[1];
         //nothing RegularPatternInvocationBuilder invocationBuilder = (RegularPatternInvocationBuilder) result2_bindingAndBlack[2];
         // 
         RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_13_3_AnalyzeDependencies_expressionBBB(this, storyPattern, pattern);
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
   public void transformPattern(StoryPattern storyPattern, Pattern democlesPattern)
   {

      Object[] result1_black = RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_14_1_LookupPatternTransformer_blackFBF(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      DefaultExpressionTransformer expressionTransformer = (DefaultExpressionTransformer) result1_black[0];
      PatternTransformer patternTransformer = (PatternTransformer) result1_black[2];
      RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_14_1_LookupPatternTransformer_greenB(expressionTransformer);

      Object[] result2_bindingAndBlack = RegularPatternInvocationBuilderImpl
            .pattern_RegularPatternInvocationBuilder_14_2_LookupValidationResult_bindingAndBlackFFB(this);
      if (result2_bindingAndBlack == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      ValidationReport report = (ValidationReport) result2_bindingAndBlack[0];
      //nothing ScopeValidator scopeValidator = (ScopeValidator) result2_bindingAndBlack[1];

      Object[] result3_bindingAndBlack = RegularPatternInvocationBuilderImpl
            .pattern_RegularPatternInvocationBuilder_14_3_PatternToDemoclesTransformation_bindingAndBlackFBBB(patternTransformer, storyPattern,
                  democlesPattern);
      if (result3_bindingAndBlack == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[patternTransformer] = " + patternTransformer + ", " + "[storyPattern] = "
               + storyPattern + ", " + "[democlesPattern] = " + democlesPattern + ".");
      }
      ValidationReport patternToDemoclesReport = (ValidationReport) result3_bindingAndBlack[0];
      // 
      RegularPatternInvocationBuilderImpl.pattern_RegularPatternInvocationBuilder_14_4_MergeTransformationResult_expressionBB(report, patternToDemoclesReport);
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER__PARENT_BUILDER:
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         return basicSetParentBuilder((CompoundPatternInvocationBuilder) otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER__PARENT_BUILDER:
         return basicSetParentBuilder(null, msgs);
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER__PATTERN_TRANSFORMER:
         return basicSetPatternTransformer(null, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
   {
      switch (eContainerFeatureID())
      {
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER__PARENT_BUILDER:
         return eInternalContainer().eInverseRemove(this, ScopePackage.COMPOUND_PATTERN_INVOCATION_BUILDER__CHILD_BUILDERS,
               CompoundPatternInvocationBuilder.class, msgs);
      }
      return super.eBasicRemoveFromContainerFeature(msgs);
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
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER__PARENT_BUILDER:
         return getParentBuilder();
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER__PATTERN_TRANSFORMER:
         return getPatternTransformer();
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER__MAIN_ACTION_BUILDER:
         return isMainActionBuilder();
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
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER__PARENT_BUILDER:
         setParentBuilder((CompoundPatternInvocationBuilder) newValue);
         return;
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER__PATTERN_TRANSFORMER:
         setPatternTransformer((PatternTransformer) newValue);
         return;
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER__MAIN_ACTION_BUILDER:
         setMainActionBuilder((Boolean) newValue);
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
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER__PARENT_BUILDER:
         setParentBuilder((CompoundPatternInvocationBuilder) null);
         return;
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER__PATTERN_TRANSFORMER:
         setPatternTransformer((PatternTransformer) null);
         return;
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER__MAIN_ACTION_BUILDER:
         setMainActionBuilder(MAIN_ACTION_BUILDER_EDEFAULT);
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
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER__PARENT_BUILDER:
         return getParentBuilder() != null;
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER__PATTERN_TRANSFORMER:
         return patternTransformer != null;
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER__MAIN_ACTION_BUILDER:
         return mainActionBuilder != MAIN_ACTION_BUILDER_EDEFAULT;
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
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER___ANALYZE_DEPENDENCIES__PATTERNINVOCATIONBUILDER_STORYPATTERN_PATTERN:
         analyzeDependencies((PatternInvocationBuilder) arguments.get(0), (StoryPattern) arguments.get(1), (Pattern) arguments.get(2));
         return null;
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER___BUILD_ACTION__CFNODE:
         buildAction((CFNode) arguments.get(0));
         return null;
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER___BUILD_PATTERN_CONTENT__REGULARPATTERNINVOCATION_STORYPATTERN:
         buildPatternContent((RegularPatternInvocation) arguments.get(0), (StoryPattern) arguments.get(1));
         return null;
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER___BUILD_PATTERN_INTERFACE__CFNODE_STORYPATTERN:
         buildPatternInterface((CFNode) arguments.get(0), (StoryPattern) arguments.get(1));
         return null;
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER___CREATE_ACTION:
         return createAction();
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER___EXPLORE_ATTRIBUTE_ASSIGNMENTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN:
         exploreAttributeAssignments((PatternInvocationBuilder) arguments.get(0), (ExpressionExplorer) arguments.get(1), (ObjectVariable) arguments.get(2),
               (Pattern) arguments.get(3));
         return null;
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER___EXPLORE_ATTRIBUTE_CONSTRAINTS__PATTERNINVOCATIONBUILDER_EXPRESSIONEXPLORER_OBJECTVARIABLE_PATTERN:
         exploreAttributeConstraints((PatternInvocationBuilder) arguments.get(0), (ExpressionExplorer) arguments.get(1), (ObjectVariable) arguments.get(2),
               (Pattern) arguments.get(3));
         return null;
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER___GET_PATTERN_INVOCATION_BUILDER:
         return getPatternInvocationBuilder();
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_RELEVANT_OBJECT_VARIABLE__PATTERNINVOCATION_OBJECTVARIABLE:
         handleRelevantObjectVariable((PatternInvocation) arguments.get(0), (ObjectVariable) arguments.get(1));
         return null;
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE__VARIABLE_ECLASSIFIER:
         return handleVariableReference((Variable) arguments.get(0), (EClassifier) arguments.get(1));
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER___HANDLE_VARIABLE_REFERENCE_IN_SUPERCLASS__VARIABLE_ECLASSIFIER:
         return handleVariableReferenceInSuperclass((Variable) arguments.get(0), (EClassifier) arguments.get(1));
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER___IS_VARIABLE_TO_ADD__OBJECTVARIABLE:
         return isVariableToAdd((ObjectVariable) arguments.get(0));
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER___LOOKUP_SCOPE_VALIDATOR:
         return lookupScopeValidator();
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER___POSTPROCESS_PATTERN_INTERFACE__STORYPATTERN:
         postprocessPatternInterface((StoryPattern) arguments.get(0));
         return null;
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER___TRANSFORM_PATTERN__STORYPATTERN_PATTERN:
         transformPattern((StoryPattern) arguments.get(0), (Pattern) arguments.get(1));
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
      result.append(" (mainActionBuilder: ");
      result.append(mainActionBuilder);
      result.append(')');
      return result.toString();
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_0_1_Init_blackBF(RegularPatternInvocationBuilder _this)
   {
      ExpressionExplorer expressionExplorer = _this.getExpressionExplorer();
      if (expressionExplorer != null)
      {
         return new Object[] { _this, expressionExplorer };
      }

      return null;
   }

   public static final Iterable<Object[]> pattern_RegularPatternInvocationBuilder_0_2_ForAllObjectVariables_blackBF(StoryPattern storyPattern)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (ObjectVariable objectVariable : storyPattern.getObjectVariable())
      {
         _result.add(new Object[] { storyPattern, objectVariable });
      }
      return _result;
   }

   public static final boolean pattern_RegularPatternInvocationBuilder_0_3_IsRelevantObjectVariable_expressionFBB(RegularPatternInvocationBuilder _this,
         ObjectVariable objectVariable)
   {
      boolean _localVariable_0 = _this.isVariableToAdd(objectVariable);
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_0_4_IsVariableBlack_blackB(ObjectVariable objectVariable)
   {
      BindingOperator objectVariable_bindingOperator = objectVariable.getBindingOperator();
      if (objectVariable_bindingOperator.equals(BindingOperator.CHECK_ONLY))
      {
         return new Object[] { objectVariable };
      }

      return null;
   }

   public static final void pattern_RegularPatternInvocationBuilder_0_5_ExploreBlackAttributeConstraints_expressionBBBBB(RegularPatternInvocationBuilder _this,
         PatternInvocationBuilder patternInvocationBuilder, ExpressionExplorer expressionExplorer, ObjectVariable objectVariable, Pattern pattern)
   {
      _this.exploreAttributeConstraints(patternInvocationBuilder, expressionExplorer, objectVariable, pattern);

   }

   public static final void pattern_RegularPatternInvocationBuilder_0_6_ExploreBlackAttributeAssignments_expressionBBBBB(RegularPatternInvocationBuilder _this,
         PatternInvocationBuilder patternInvocationBuilder, ExpressionExplorer expressionExplorer, ObjectVariable objectVariable, Pattern pattern)
   {
      _this.exploreAttributeAssignments(patternInvocationBuilder, expressionExplorer, objectVariable, pattern);

   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_0_7_IsVariableRed_blackB(ObjectVariable objectVariable)
   {
      BindingOperator objectVariable_bindingOperator = objectVariable.getBindingOperator();
      if (objectVariable_bindingOperator.equals(BindingOperator.DESTROY))
      {
         return new Object[] { objectVariable };
      }

      return null;
   }

   public static final void pattern_RegularPatternInvocationBuilder_0_8_HandleRedAttributeConstraints_expressionBBBBB(RegularPatternInvocationBuilder _this,
         PatternInvocationBuilder patternInvocationBuilder, ExpressionExplorer expressionExplorer, ObjectVariable objectVariable, Pattern pattern)
   {
      _this.exploreAttributeConstraints(patternInvocationBuilder, expressionExplorer, objectVariable, pattern);

   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_0_9_RedAssignmentExists_blackBF(ObjectVariable objectVariable)
   {
      for (AttributeAssignment redAssignment : objectVariable.getAttributeAssignment())
      {
         return new Object[] { objectVariable, redAssignment };
      }
      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_0_11_IsVariableGreen_blackB(ObjectVariable objectVariable)
   {
      BindingOperator objectVariable_bindingOperator = objectVariable.getBindingOperator();
      if (objectVariable_bindingOperator.equals(BindingOperator.CREATE))
      {
         return new Object[] { objectVariable };
      }

      return null;
   }

   public static final void pattern_RegularPatternInvocationBuilder_0_12_HandleGreenAttributeAssignments_expressionBBBBB(RegularPatternInvocationBuilder _this,
         PatternInvocationBuilder patternInvocationBuilder, ExpressionExplorer expressionExplorer, ObjectVariable objectVariable, Pattern pattern)
   {
      _this.exploreAttributeAssignments(patternInvocationBuilder, expressionExplorer, objectVariable, pattern);

   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_0_13_GreenConstraintExists_blackFB(ObjectVariable objectVariable)
   {
      for (Constraint greenConstraint : objectVariable.getConstraint())
      {
         return new Object[] { greenConstraint, objectVariable };
      }
      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_1_1_LookupActivityNode_bindingFB(RegularPatternInvocationBuilder _this)
   {
      ScopeValidator _localVariable_0 = _this.lookupScopeValidator();
      ScopeValidator scopeValidator = _localVariable_0;
      if (scopeValidator != null)
      {
         return new Object[] { scopeValidator, _this };
      }
      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_1_1_LookupActivityNode_blackFFFBBB(CFNode node, RegularPatternInvocationBuilder _this,
         ScopeValidator scopeValidator)
   {
      ActivityNode tmpStoryNode = node.getOrigin();
      if (tmpStoryNode instanceof StoryNode)
      {
         StoryNode storyNode = (StoryNode) tmpStoryNode;
         ValidationReport report = scopeValidator.getValidationReport();
         if (report != null)
         {
            StoryPattern storyPattern = storyNode.getStoryPattern();
            if (storyPattern != null)
            {
               return new Object[] { report, storyPattern, storyNode, node, _this, scopeValidator };
            }

         }

      }

      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_1_1_LookupActivityNode_bindingAndBlackFFFBBF(CFNode node,
         RegularPatternInvocationBuilder _this)
   {
      Object[] result_pattern_RegularPatternInvocationBuilder_1_1_LookupActivityNode_binding = pattern_RegularPatternInvocationBuilder_1_1_LookupActivityNode_bindingFB(
            _this);
      if (result_pattern_RegularPatternInvocationBuilder_1_1_LookupActivityNode_binding != null)
      {
         ScopeValidator scopeValidator = (ScopeValidator) result_pattern_RegularPatternInvocationBuilder_1_1_LookupActivityNode_binding[0];

         Object[] result_pattern_RegularPatternInvocationBuilder_1_1_LookupActivityNode_black = pattern_RegularPatternInvocationBuilder_1_1_LookupActivityNode_blackFFFBBB(
               node, _this, scopeValidator);
         if (result_pattern_RegularPatternInvocationBuilder_1_1_LookupActivityNode_black != null)
         {
            ValidationReport report = (ValidationReport) result_pattern_RegularPatternInvocationBuilder_1_1_LookupActivityNode_black[0];
            StoryPattern storyPattern = (StoryPattern) result_pattern_RegularPatternInvocationBuilder_1_1_LookupActivityNode_black[1];
            StoryNode storyNode = (StoryNode) result_pattern_RegularPatternInvocationBuilder_1_1_LookupActivityNode_black[2];

            return new Object[] { report, storyPattern, storyNode, node, _this, scopeValidator };
         }
      }
      return null;
   }

   public static final void pattern_RegularPatternInvocationBuilder_1_2_BuildPatternInterface_expressionBBB(RegularPatternInvocationBuilder _this, CFNode node,
         StoryPattern storyPattern)
   {
      _this.buildPatternInterface(node, storyPattern);

   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_1_3_HasInvocationResult_blackBFF(RegularPatternInvocationBuilder _this)
   {
      Action tmpInvocationResult = _this.getResult();
      if (tmpInvocationResult instanceof RegularPatternInvocation)
      {
         RegularPatternInvocation invocationResult = (RegularPatternInvocation) tmpInvocationResult;
         Pattern democlesPattern = invocationResult.getPattern();
         if (democlesPattern != null)
         {
            return new Object[] { _this, democlesPattern, invocationResult };
         }

      }

      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_1_4_HandleMainAction_black_nac_0BB(CFNode node,
         RegularPatternInvocation invocationResult)
   {
      Action otherMainAction = node.getMainAction();
      if (otherMainAction != null)
      {
         if (!invocationResult.equals(otherMainAction))
         {
            return new Object[] { node, invocationResult };
         }
      }

      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_1_4_HandleMainAction_blackBBB(RegularPatternInvocationBuilder _this,
         RegularPatternInvocation invocationResult, CFNode node)
   {
      boolean this_mainActionBuilder = _this.isMainActionBuilder();
      if (Boolean.valueOf(this_mainActionBuilder).equals(Boolean.valueOf(true)))
      {
         if (pattern_RegularPatternInvocationBuilder_1_4_HandleMainAction_black_nac_0BB(node, invocationResult) == null)
         {
            return new Object[] { _this, invocationResult, node };
         }
      }

      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_1_4_HandleMainAction_greenBB(RegularPatternInvocation invocationResult, CFNode node)
   {
      node.setMainAction(invocationResult);
      return new Object[] { invocationResult, node };
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_1_5_LookupPatternMatcher_blackBF(RegularPatternInvocationBuilder _this)
   {
      PatternMatcher patternMatcher = _this.getPatternMatcher();
      if (patternMatcher != null)
      {
         return new Object[] { _this, patternMatcher };
      }

      return null;
   }

   public static final void pattern_RegularPatternInvocationBuilder_1_6_BuildPatternContent_expressionBBB(RegularPatternInvocationBuilder _this,
         RegularPatternInvocation invocationResult, StoryPattern storyPattern)
   {
      _this.buildPatternContent(invocationResult, storyPattern);

   }

   public static final boolean pattern_RegularPatternInvocationBuilder_1_7_HasErrors_expressionFB(RegularPatternInvocationBuilder _this)
   {
      boolean _localVariable_0 = _this.hasErrors();
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_1_8_GenerateSearchPlan_bindingFBBBB(PatternMatcher patternMatcher,
         Pattern democlesPattern, RegularPatternInvocationBuilder _this, RegularPatternInvocation invocationResult)
   {
      Adornment _localVariable_2 = _this.calculateAdornment(invocationResult);
      boolean _localVariable_3 = invocationResult.isMultipleMatch();
      ValidationReport _localVariable_1 = patternMatcher.generateSearchPlan(democlesPattern, _localVariable_2, Boolean.valueOf(_localVariable_3));
      ValidationReport patternMatchingReport = _localVariable_1;
      if (patternMatchingReport != null)
      {
         return new Object[] { patternMatchingReport, patternMatcher, democlesPattern, _this, invocationResult };
      }
      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_1_8_GenerateSearchPlan_blackB(ValidationReport patternMatchingReport)
   {
      return new Object[] { patternMatchingReport };
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_1_8_GenerateSearchPlan_bindingAndBlackFBBBB(PatternMatcher patternMatcher,
         Pattern democlesPattern, RegularPatternInvocationBuilder _this, RegularPatternInvocation invocationResult)
   {
      Object[] result_pattern_RegularPatternInvocationBuilder_1_8_GenerateSearchPlan_binding = pattern_RegularPatternInvocationBuilder_1_8_GenerateSearchPlan_bindingFBBBB(
            patternMatcher, democlesPattern, _this, invocationResult);
      if (result_pattern_RegularPatternInvocationBuilder_1_8_GenerateSearchPlan_binding != null)
      {
         ValidationReport patternMatchingReport = (ValidationReport) result_pattern_RegularPatternInvocationBuilder_1_8_GenerateSearchPlan_binding[0];

         Object[] result_pattern_RegularPatternInvocationBuilder_1_8_GenerateSearchPlan_black = pattern_RegularPatternInvocationBuilder_1_8_GenerateSearchPlan_blackB(
               patternMatchingReport);
         if (result_pattern_RegularPatternInvocationBuilder_1_8_GenerateSearchPlan_black != null)
         {

            return new Object[] { patternMatchingReport, patternMatcher, democlesPattern, _this, invocationResult };
         }
      }
      return null;
   }

   public static final void pattern_RegularPatternInvocationBuilder_1_9_HandlePatternMatchingReport_expressionBBB(RegularPatternInvocationBuilder _this,
         RegularPatternInvocation invocationResult, ValidationReport patternMatchingReport)
   {
      _this.handlePatternMatcherReport(invocationResult, patternMatchingReport);

   }

   public static final void pattern_RegularPatternInvocationBuilder_1_10_MergePatternMatchingResult_expressionBB(ValidationReport report,
         ValidationReport patternMatchingReport)
   {
      report.merge(patternMatchingReport);

   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_1_11_RemoveResultLink_blackBB(RegularPatternInvocation invocationResult,
         RegularPatternInvocationBuilder _this)
   {
      if (invocationResult.equals(_this.getResult()))
      {
         return new Object[] { invocationResult, _this };
      }
      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_1_11_RemoveResultLink_redBB(RegularPatternInvocation invocationResult,
         RegularPatternInvocationBuilder _this)
   {
      _this.setResult(null);
      return new Object[] { invocationResult, _this };
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_2_1_Init_blackB(RegularPatternInvocationBuilder _this)
   {
      return new Object[] { _this };
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_2_2_LookupDemoclesPattern_blackFB(RegularPatternInvocation invocation)
   {
      Pattern democlesPattern = invocation.getPattern();
      if (democlesPattern != null)
      {
         return new Object[] { democlesPattern, invocation };
      }

      return null;
   }

   public static final void pattern_RegularPatternInvocationBuilder_2_3_TransformPattern_expressionBBB(RegularPatternInvocationBuilder _this,
         StoryPattern storyPattern, Pattern democlesPattern)
   {
      _this.transformPattern(storyPattern, democlesPattern);

   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_3_1_LookupThisObject_blackB(RegularPatternInvocationBuilder _this)
   {
      return new Object[] { _this };
   }

   public static final Iterable<Object[]> pattern_RegularPatternInvocationBuilder_3_2_ForAllObjectVariables_blackBF(StoryPattern storyPattern)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (ObjectVariable objectVariable : storyPattern.getObjectVariable())
      {
         _result.add(new Object[] { storyPattern, objectVariable });
      }
      return _result;
   }

   public static final boolean pattern_RegularPatternInvocationBuilder_3_3_IsRelevantObjectVariable_expressionFBB(RegularPatternInvocationBuilder _this,
         ObjectVariable objectVariable)
   {
      boolean _localVariable_0 = _this.isVariableToAdd(objectVariable);
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_3_4_LookupOrCreateAction_bindingFBB(RegularPatternInvocationBuilder _this, CFNode node)
   {
      Action _localVariable_1 = _this.lookupAction(node);
      Action tmpInvocation = _localVariable_1;
      if (tmpInvocation instanceof PatternInvocation)
      {
         PatternInvocation invocation = (PatternInvocation) tmpInvocation;
         return new Object[] { invocation, _this, node };
      }
      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_3_4_LookupOrCreateAction_blackB(PatternInvocation invocation)
   {
      return new Object[] { invocation };
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_3_4_LookupOrCreateAction_bindingAndBlackFBB(RegularPatternInvocationBuilder _this,
         CFNode node)
   {
      Object[] result_pattern_RegularPatternInvocationBuilder_3_4_LookupOrCreateAction_binding = pattern_RegularPatternInvocationBuilder_3_4_LookupOrCreateAction_bindingFBB(
            _this, node);
      if (result_pattern_RegularPatternInvocationBuilder_3_4_LookupOrCreateAction_binding != null)
      {
         PatternInvocation invocation = (PatternInvocation) result_pattern_RegularPatternInvocationBuilder_3_4_LookupOrCreateAction_binding[0];

         Object[] result_pattern_RegularPatternInvocationBuilder_3_4_LookupOrCreateAction_black = pattern_RegularPatternInvocationBuilder_3_4_LookupOrCreateAction_blackB(
               invocation);
         if (result_pattern_RegularPatternInvocationBuilder_3_4_LookupOrCreateAction_black != null)
         {

            return new Object[] { invocation, _this, node };
         }
      }
      return null;
   }

   public static final void pattern_RegularPatternInvocationBuilder_3_5_HandleRelevantObjectVariable_expressionBBB(RegularPatternInvocationBuilder _this,
         PatternInvocation invocation, ObjectVariable objectVariable)
   {
      _this.handleRelevantObjectVariable(invocation, objectVariable);

   }

   public static final void pattern_RegularPatternInvocationBuilder_3_6_PostprocessPatternInterface_expressionBB(RegularPatternInvocationBuilder _this,
         StoryPattern storyPattern)
   {
      _this.postprocessPatternInterface(storyPattern);

   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_4_1_CreateRegularPatternInvocation_greenF()
   {
      RegularPatternInvocation newInvocation = DemoclesFactory.eINSTANCE.createRegularPatternInvocation();
      return new Object[] { newInvocation };
   }

   public static final RegularPatternInvocation pattern_RegularPatternInvocationBuilder_4_2_expressionFB(RegularPatternInvocation newInvocation)
   {
      RegularPatternInvocation _result = newInvocation;
      return _result;
   }

   public static final Iterable<Object[]> pattern_RegularPatternInvocationBuilder_5_1_ForAllAttributeAssignments_blackFFB(ObjectVariable objectVariable)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (AttributeAssignment assignment : objectVariable.getAttributeAssignment())
      {
         Expression expression = assignment.getValueExpression();
         if (expression != null)
         {
            _result.add(new Object[] { assignment, expression, objectVariable });
         }

      }
      return _result;
   }

   public static final void pattern_RegularPatternInvocationBuilder_5_2_HandleAssignmentExpression_expressionBBBB(ExpressionExplorer expressionExplorer,
         PatternInvocationBuilder invocationBuilder, Pattern pattern, Expression expression)
   {
      expressionExplorer.exploreExpression(invocationBuilder, pattern, expression);

   }

   public static final Iterable<Object[]> pattern_RegularPatternInvocationBuilder_6_1_ForAllAttributeConstraints_blackFBFF(ObjectVariable objectVariable)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (Constraint constraint : objectVariable.getConstraint())
      {
         Expression tmpBinaryExpression = constraint.getConstraintExpression();
         if (tmpBinaryExpression instanceof BinaryExpression)
         {
            BinaryExpression binaryExpression = (BinaryExpression) tmpBinaryExpression;
            Expression constraintExpression = binaryExpression.getRightExpression();
            if (constraintExpression != null)
            {
               if (!binaryExpression.equals(constraintExpression))
               {
                  _result.add(new Object[] { constraint, objectVariable, constraintExpression, binaryExpression });
               }
            }

         }

      }
      return _result;
   }

   public static final void pattern_RegularPatternInvocationBuilder_6_2_ExploreConstraintExpression_expressionBBBB(ExpressionExplorer expressionExplorer,
         PatternInvocationBuilder invocationBuilder, Pattern pattern, Expression constraintExpression)
   {
      expressionExplorer.exploreExpression(invocationBuilder, pattern, constraintExpression);

   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_7_1_HasResult_blackFB(RegularPatternInvocationBuilder _this)
   {
      Action tmpInvocation = _this.getResult();
      if (tmpInvocation instanceof PatternInvocation)
      {
         PatternInvocation invocation = (PatternInvocation) tmpInvocation;
         return new Object[] { invocation, _this };
      }

      return null;
   }

   public static final RegularPatternInvocationBuilder pattern_RegularPatternInvocationBuilder_7_2_expressionFB(RegularPatternInvocationBuilder _this)
   {
      RegularPatternInvocationBuilder _result = _this;
      return _result;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_7_3_HasParentBuilder_blackFB(RegularPatternInvocationBuilder _this)
   {
      CompoundPatternInvocationBuilder parentBuilder = _this.getParentBuilder();
      if (parentBuilder != null)
      {
         if (!parentBuilder.equals(_this))
         {
            return new Object[] { parentBuilder, _this };
         }
      }

      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_7_4_DelegateToParentBuilder_bindingFB(CompoundPatternInvocationBuilder parentBuilder)
   {
      RegularPatternInvocationBuilder _localVariable_0 = parentBuilder.getPatternInvocationBuilder();
      RegularPatternInvocationBuilder result = _localVariable_0;
      if (result != null)
      {
         return new Object[] { result, parentBuilder };
      }
      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_7_4_DelegateToParentBuilder_blackB(RegularPatternInvocationBuilder result)
   {
      return new Object[] { result };
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_7_4_DelegateToParentBuilder_bindingAndBlackFB(
         CompoundPatternInvocationBuilder parentBuilder)
   {
      Object[] result_pattern_RegularPatternInvocationBuilder_7_4_DelegateToParentBuilder_binding = pattern_RegularPatternInvocationBuilder_7_4_DelegateToParentBuilder_bindingFB(
            parentBuilder);
      if (result_pattern_RegularPatternInvocationBuilder_7_4_DelegateToParentBuilder_binding != null)
      {
         RegularPatternInvocationBuilder result = (RegularPatternInvocationBuilder) result_pattern_RegularPatternInvocationBuilder_7_4_DelegateToParentBuilder_binding[0];

         Object[] result_pattern_RegularPatternInvocationBuilder_7_4_DelegateToParentBuilder_black = pattern_RegularPatternInvocationBuilder_7_4_DelegateToParentBuilder_blackB(
               result);
         if (result_pattern_RegularPatternInvocationBuilder_7_4_DelegateToParentBuilder_black != null)
         {

            return new Object[] { result, parentBuilder };
         }
      }
      return null;
   }

   public static final RegularPatternInvocationBuilder pattern_RegularPatternInvocationBuilder_7_5_expressionFB(RegularPatternInvocationBuilder result)
   {
      RegularPatternInvocationBuilder _result = result;
      return _result;
   }

   public static final RegularPatternInvocationBuilder pattern_RegularPatternInvocationBuilder_7_6_expressionFB(RegularPatternInvocationBuilder _this)
   {
      RegularPatternInvocationBuilder _result = _this;
      return _result;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_8_1_LookupPattern_blackBFB(RegularPatternInvocationBuilder _this,
         PatternInvocation invocation)
   {
      Pattern pattern = invocation.getPattern();
      if (pattern != null)
      {
         return new Object[] { _this, pattern, invocation };
      }

      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_8_2_ExistsAsSymbolicParameter_blackFBB(Pattern pattern, ObjectVariable objectVariable)
   {
      String objectVariable_name = objectVariable.getName();
      for (Variable variable : pattern.getSymbolicParameters())
      {
         String variable_name = variable.getName();
         if (variable_name.equals(objectVariable_name))
         {
            return new Object[] { variable, pattern, objectVariable };
         }

      }

      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_8_4_CreatePatternVariable_blackBFB(ObjectVariable objectVariable, Pattern pattern)
   {
      EClassifier eClassifier = objectVariable.getType();
      if (eClassifier != null)
      {
         return new Object[] { objectVariable, eClassifier, pattern };
      }

      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_8_4_CreatePatternVariable_greenBBFB(EClassifier eClassifier, Pattern pattern,
         ObjectVariable objectVariable)
   {
      EMFVariable newVariable = EMFTypeFactory.eINSTANCE.createEMFVariable();
      pattern.getSymbolicParameters().add(newVariable);
      newVariable.setEClassifier(eClassifier);
      String objectVariable_name = objectVariable.getName();
      String newVariable_name_prime = objectVariable_name;
      newVariable.setName(newVariable_name_prime);
      return new Object[] { eClassifier, pattern, newVariable, objectVariable };

   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_8_5_CreateVariableReference_bindingFBBB(RegularPatternInvocationBuilder _this,
         EMFVariable newVariable, EClassifier eClassifier)
   {
      VariableReference _localVariable_0 = _this.handleVariableReference(newVariable, eClassifier);
      VariableReference newVarRef = _localVariable_0;
      if (newVarRef != null)
      {
         return new Object[] { newVarRef, _this, newVariable, eClassifier };
      }
      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_8_5_CreateVariableReference_blackFB(VariableReference newVarRef)
   {
      CFVariable controlFlowVariable = newVarRef.getFrom();
      if (controlFlowVariable != null)
      {
         return new Object[] { controlFlowVariable, newVarRef };
      }

      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_8_5_CreateVariableReference_bindingAndBlackFFBBB(RegularPatternInvocationBuilder _this,
         EMFVariable newVariable, EClassifier eClassifier)
   {
      Object[] result_pattern_RegularPatternInvocationBuilder_8_5_CreateVariableReference_binding = pattern_RegularPatternInvocationBuilder_8_5_CreateVariableReference_bindingFBBB(
            _this, newVariable, eClassifier);
      if (result_pattern_RegularPatternInvocationBuilder_8_5_CreateVariableReference_binding != null)
      {
         VariableReference newVarRef = (VariableReference) result_pattern_RegularPatternInvocationBuilder_8_5_CreateVariableReference_binding[0];

         Object[] result_pattern_RegularPatternInvocationBuilder_8_5_CreateVariableReference_black = pattern_RegularPatternInvocationBuilder_8_5_CreateVariableReference_blackFB(
               newVarRef);
         if (result_pattern_RegularPatternInvocationBuilder_8_5_CreateVariableReference_black != null)
         {
            CFVariable controlFlowVariable = (CFVariable) result_pattern_RegularPatternInvocationBuilder_8_5_CreateVariableReference_black[0];

            return new Object[] { controlFlowVariable, newVarRef, _this, newVariable, eClassifier };
         }
      }
      return null;
   }

   public static final void pattern_RegularPatternInvocationBuilder_8_6_ValidateVariable_expressionBBBB(RegularPatternInvocationBuilder _this,
         PatternInvocation invocation, CFVariable controlFlowVariable, ObjectVariable objectVariable)
   {
      _this.validateVariable(invocation, controlFlowVariable, objectVariable);

   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_9_1_IsCurrentBuilderResponsible_blackBFBF(RegularPatternInvocationBuilder _this,
         Variable variable)
   {
      Action tmpInvocation = _this.getResult();
      if (tmpInvocation instanceof RegularPatternInvocation)
      {
         RegularPatternInvocation invocation = (RegularPatternInvocation) tmpInvocation;
         Pattern democlesPattern = invocation.getPattern();
         if (democlesPattern != null)
         {
            if (democlesPattern.getSymbolicParameters().contains(variable))
            {
               return new Object[] { _this, democlesPattern, variable, invocation };
            }
         }

      }

      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_9_2_DelegateToSuperclass_bindingFBBB(RegularPatternInvocationBuilder _this,
         Variable variable, EClassifier variableType)
   {
      VariableReference _localVariable_0 = _this.handleVariableReferenceInSuperclass(variable, variableType);
      VariableReference reference = _localVariable_0;
      if (reference != null)
      {
         return new Object[] { reference, _this, variable, variableType };
      }
      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_9_2_DelegateToSuperclass_blackB(VariableReference reference)
   {
      return new Object[] { reference };
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_9_2_DelegateToSuperclass_bindingAndBlackFBBB(RegularPatternInvocationBuilder _this,
         Variable variable, EClassifier variableType)
   {
      Object[] result_pattern_RegularPatternInvocationBuilder_9_2_DelegateToSuperclass_binding = pattern_RegularPatternInvocationBuilder_9_2_DelegateToSuperclass_bindingFBBB(
            _this, variable, variableType);
      if (result_pattern_RegularPatternInvocationBuilder_9_2_DelegateToSuperclass_binding != null)
      {
         VariableReference reference = (VariableReference) result_pattern_RegularPatternInvocationBuilder_9_2_DelegateToSuperclass_binding[0];

         Object[] result_pattern_RegularPatternInvocationBuilder_9_2_DelegateToSuperclass_black = pattern_RegularPatternInvocationBuilder_9_2_DelegateToSuperclass_blackB(
               reference);
         if (result_pattern_RegularPatternInvocationBuilder_9_2_DelegateToSuperclass_black != null)
         {

            return new Object[] { reference, _this, variable, variableType };
         }
      }
      return null;
   }

   public static final VariableReference pattern_RegularPatternInvocationBuilder_9_3_expressionFB(VariableReference reference)
   {
      VariableReference _result = reference;
      return _result;
   }

   public static final VariableReference pattern_RegularPatternInvocationBuilder_9_4_expressionF()
   {
      VariableReference _result = null;
      return _result;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_11_1_HasPatternTransformer_blackBF(RegularPatternInvocationBuilder _this)
   {
      PatternTransformer patternTransformer = _this.getPatternTransformer();
      if (patternTransformer != null)
      {
         return new Object[] { _this, patternTransformer };
      }

      return null;
   }

   public static final boolean pattern_RegularPatternInvocationBuilder_11_2_DelegatingDecision_expressionFBB(PatternTransformer patternTransformer,
         ObjectVariable objectVariable)
   {
      boolean _localVariable_0 = patternTransformer.isVariableToAdd(objectVariable);
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final boolean pattern_RegularPatternInvocationBuilder_11_3_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final boolean pattern_RegularPatternInvocationBuilder_11_4_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_12_1_HasBindingPatternBuilder_blackBF(RegularPatternInvocationBuilder _this)
   {
      CompoundPatternInvocationBuilder parentPatternInvocationBuilder = _this.getParentBuilder();
      if (parentPatternInvocationBuilder != null)
      {
         if (!parentPatternInvocationBuilder.equals(_this))
         {
            return new Object[] { _this, parentPatternInvocationBuilder };
         }
      }

      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_12_2_LookupPatternInvocationScopeValidator_bindingFB(
         CompoundPatternInvocationBuilder parentPatternInvocationBuilder)
   {
      ScopeValidator _localVariable_0 = parentPatternInvocationBuilder.lookupScopeValidator();
      ScopeValidator parentPatternInvocationScopeValidator = _localVariable_0;
      if (parentPatternInvocationScopeValidator != null)
      {
         return new Object[] { parentPatternInvocationScopeValidator, parentPatternInvocationBuilder };
      }
      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_12_2_LookupPatternInvocationScopeValidator_blackB(
         ScopeValidator parentPatternInvocationScopeValidator)
   {
      return new Object[] { parentPatternInvocationScopeValidator };
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_12_2_LookupPatternInvocationScopeValidator_bindingAndBlackFB(
         CompoundPatternInvocationBuilder parentPatternInvocationBuilder)
   {
      Object[] result_pattern_RegularPatternInvocationBuilder_12_2_LookupPatternInvocationScopeValidator_binding = pattern_RegularPatternInvocationBuilder_12_2_LookupPatternInvocationScopeValidator_bindingFB(
            parentPatternInvocationBuilder);
      if (result_pattern_RegularPatternInvocationBuilder_12_2_LookupPatternInvocationScopeValidator_binding != null)
      {
         ScopeValidator parentPatternInvocationScopeValidator = (ScopeValidator) result_pattern_RegularPatternInvocationBuilder_12_2_LookupPatternInvocationScopeValidator_binding[0];

         Object[] result_pattern_RegularPatternInvocationBuilder_12_2_LookupPatternInvocationScopeValidator_black = pattern_RegularPatternInvocationBuilder_12_2_LookupPatternInvocationScopeValidator_blackB(
               parentPatternInvocationScopeValidator);
         if (result_pattern_RegularPatternInvocationBuilder_12_2_LookupPatternInvocationScopeValidator_black != null)
         {

            return new Object[] { parentPatternInvocationScopeValidator, parentPatternInvocationBuilder };
         }
      }
      return null;
   }

   public static final ScopeValidator pattern_RegularPatternInvocationBuilder_12_3_expressionFB(ScopeValidator parentPatternInvocationScopeValidator)
   {
      ScopeValidator _result = parentPatternInvocationScopeValidator;
      return _result;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_12_4_HasParentActionBuilder_blackFB(RegularPatternInvocationBuilder _this)
   {
      CompoundActionBuilder parentActionBuilder = _this.getParent();
      if (parentActionBuilder != null)
      {
         return new Object[] { parentActionBuilder, _this };
      }

      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_12_5_LookupParentActionScopeValidator_bindingFB(
         CompoundActionBuilder parentActionBuilder)
   {
      ScopeValidator _localVariable_0 = parentActionBuilder.lookupScopeValidator();
      ScopeValidator parentActionScopeValidator = _localVariable_0;
      if (parentActionScopeValidator != null)
      {
         return new Object[] { parentActionScopeValidator, parentActionBuilder };
      }
      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_12_5_LookupParentActionScopeValidator_blackB(ScopeValidator parentActionScopeValidator)
   {
      return new Object[] { parentActionScopeValidator };
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_12_5_LookupParentActionScopeValidator_bindingAndBlackFB(
         CompoundActionBuilder parentActionBuilder)
   {
      Object[] result_pattern_RegularPatternInvocationBuilder_12_5_LookupParentActionScopeValidator_binding = pattern_RegularPatternInvocationBuilder_12_5_LookupParentActionScopeValidator_bindingFB(
            parentActionBuilder);
      if (result_pattern_RegularPatternInvocationBuilder_12_5_LookupParentActionScopeValidator_binding != null)
      {
         ScopeValidator parentActionScopeValidator = (ScopeValidator) result_pattern_RegularPatternInvocationBuilder_12_5_LookupParentActionScopeValidator_binding[0];

         Object[] result_pattern_RegularPatternInvocationBuilder_12_5_LookupParentActionScopeValidator_black = pattern_RegularPatternInvocationBuilder_12_5_LookupParentActionScopeValidator_blackB(
               parentActionScopeValidator);
         if (result_pattern_RegularPatternInvocationBuilder_12_5_LookupParentActionScopeValidator_black != null)
         {

            return new Object[] { parentActionScopeValidator, parentActionBuilder };
         }
      }
      return null;
   }

   public static final ScopeValidator pattern_RegularPatternInvocationBuilder_12_6_expressionFB(ScopeValidator parentActionScopeValidator)
   {
      ScopeValidator _result = parentActionScopeValidator;
      return _result;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_12_7_LookupScopeValidator_blackFB(RegularPatternInvocationBuilder _this)
   {
      ScopeValidator validator = _this.getValidator();
      if (validator != null)
      {
         return new Object[] { validator, _this };
      }

      return null;
   }

   public static final ScopeValidator pattern_RegularPatternInvocationBuilder_12_8_expressionFB(ScopeValidator validator)
   {
      ScopeValidator _result = validator;
      return _result;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_13_1_Init_blackB(RegularPatternInvocationBuilder _this)
   {
      return new Object[] { _this };
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_13_2_LookupPattern_bindingFB(RegularPatternInvocationBuilder _this)
   {
      RegularPatternInvocationBuilder _localVariable_0 = _this.getPatternInvocationBuilder();
      RegularPatternInvocationBuilder invocationBuilder = _localVariable_0;
      if (invocationBuilder != null)
      {
         return new Object[] { invocationBuilder, _this };
      }
      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_13_2_LookupPattern_blackFFB(RegularPatternInvocationBuilder invocationBuilder)
   {
      Action tmpInvocationResult = invocationBuilder.getResult();
      if (tmpInvocationResult instanceof PatternInvocation)
      {
         PatternInvocation invocationResult = (PatternInvocation) tmpInvocationResult;
         Pattern pattern = invocationResult.getPattern();
         if (pattern != null)
         {
            return new Object[] { invocationResult, pattern, invocationBuilder };
         }

      }

      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_13_2_LookupPattern_bindingAndBlackFFFB(RegularPatternInvocationBuilder _this)
   {
      Object[] result_pattern_RegularPatternInvocationBuilder_13_2_LookupPattern_binding = pattern_RegularPatternInvocationBuilder_13_2_LookupPattern_bindingFB(
            _this);
      if (result_pattern_RegularPatternInvocationBuilder_13_2_LookupPattern_binding != null)
      {
         RegularPatternInvocationBuilder invocationBuilder = (RegularPatternInvocationBuilder) result_pattern_RegularPatternInvocationBuilder_13_2_LookupPattern_binding[0];

         Object[] result_pattern_RegularPatternInvocationBuilder_13_2_LookupPattern_black = pattern_RegularPatternInvocationBuilder_13_2_LookupPattern_blackFFB(
               invocationBuilder);
         if (result_pattern_RegularPatternInvocationBuilder_13_2_LookupPattern_black != null)
         {
            PatternInvocation invocationResult = (PatternInvocation) result_pattern_RegularPatternInvocationBuilder_13_2_LookupPattern_black[0];
            Pattern pattern = (Pattern) result_pattern_RegularPatternInvocationBuilder_13_2_LookupPattern_black[1];

            return new Object[] { invocationResult, pattern, invocationBuilder, _this };
         }
      }
      return null;
   }

   public static final void pattern_RegularPatternInvocationBuilder_13_3_AnalyzeDependencies_expressionBBB(RegularPatternInvocationBuilder _this,
         StoryPattern storyPattern, Pattern pattern)
   {
      _this.analyzeDependencies(_this, storyPattern, pattern);

   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_14_1_LookupPatternTransformer_blackFBF(RegularPatternInvocationBuilder _this)
   {
      PatternTransformer patternTransformer = _this.getPatternTransformer();
      if (patternTransformer != null)
      {
         ExpressionTransformer tmpExpressionTransformer = patternTransformer.getExpressionTransformer();
         if (tmpExpressionTransformer instanceof DefaultExpressionTransformer)
         {
            DefaultExpressionTransformer expressionTransformer = (DefaultExpressionTransformer) tmpExpressionTransformer;
            return new Object[] { expressionTransformer, _this, patternTransformer };
         }

      }

      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_14_1_LookupPatternTransformer_greenB(DefaultExpressionTransformer expressionTransformer)
   {
      int expressionTransformer_calleeETypeNameCounter_prime = Integer.valueOf(0);
      expressionTransformer.setCalleeETypeNameCounter(Integer.valueOf(expressionTransformer_calleeETypeNameCounter_prime));
      return new Object[] { expressionTransformer };
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_14_2_LookupValidationResult_bindingFB(RegularPatternInvocationBuilder _this)
   {
      ScopeValidator _localVariable_0 = _this.lookupScopeValidator();
      ScopeValidator scopeValidator = _localVariable_0;
      if (scopeValidator != null)
      {
         return new Object[] { scopeValidator, _this };
      }
      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_14_2_LookupValidationResult_blackFB(ScopeValidator scopeValidator)
   {
      ValidationReport report = scopeValidator.getValidationReport();
      if (report != null)
      {
         return new Object[] { report, scopeValidator };
      }

      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_14_2_LookupValidationResult_bindingAndBlackFFB(RegularPatternInvocationBuilder _this)
   {
      Object[] result_pattern_RegularPatternInvocationBuilder_14_2_LookupValidationResult_binding = pattern_RegularPatternInvocationBuilder_14_2_LookupValidationResult_bindingFB(
            _this);
      if (result_pattern_RegularPatternInvocationBuilder_14_2_LookupValidationResult_binding != null)
      {
         ScopeValidator scopeValidator = (ScopeValidator) result_pattern_RegularPatternInvocationBuilder_14_2_LookupValidationResult_binding[0];

         Object[] result_pattern_RegularPatternInvocationBuilder_14_2_LookupValidationResult_black = pattern_RegularPatternInvocationBuilder_14_2_LookupValidationResult_blackFB(
               scopeValidator);
         if (result_pattern_RegularPatternInvocationBuilder_14_2_LookupValidationResult_black != null)
         {
            ValidationReport report = (ValidationReport) result_pattern_RegularPatternInvocationBuilder_14_2_LookupValidationResult_black[0];

            return new Object[] { report, scopeValidator, _this };
         }
      }
      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_14_3_PatternToDemoclesTransformation_bindingFBBB(PatternTransformer patternTransformer,
         StoryPattern storyPattern, Pattern democlesPattern)
   {
      ValidationReport _localVariable_1 = patternTransformer.transform(storyPattern, democlesPattern);
      ValidationReport patternToDemoclesReport = _localVariable_1;
      if (patternToDemoclesReport != null)
      {
         return new Object[] { patternToDemoclesReport, patternTransformer, storyPattern, democlesPattern };
      }
      return null;
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_14_3_PatternToDemoclesTransformation_blackB(ValidationReport patternToDemoclesReport)
   {
      return new Object[] { patternToDemoclesReport };
   }

   public static final Object[] pattern_RegularPatternInvocationBuilder_14_3_PatternToDemoclesTransformation_bindingAndBlackFBBB(
         PatternTransformer patternTransformer, StoryPattern storyPattern, Pattern democlesPattern)
   {
      Object[] result_pattern_RegularPatternInvocationBuilder_14_3_PatternToDemoclesTransformation_binding = pattern_RegularPatternInvocationBuilder_14_3_PatternToDemoclesTransformation_bindingFBBB(
            patternTransformer, storyPattern, democlesPattern);
      if (result_pattern_RegularPatternInvocationBuilder_14_3_PatternToDemoclesTransformation_binding != null)
      {
         ValidationReport patternToDemoclesReport = (ValidationReport) result_pattern_RegularPatternInvocationBuilder_14_3_PatternToDemoclesTransformation_binding[0];

         Object[] result_pattern_RegularPatternInvocationBuilder_14_3_PatternToDemoclesTransformation_black = pattern_RegularPatternInvocationBuilder_14_3_PatternToDemoclesTransformation_blackB(
               patternToDemoclesReport);
         if (result_pattern_RegularPatternInvocationBuilder_14_3_PatternToDemoclesTransformation_black != null)
         {

            return new Object[] { patternToDemoclesReport, patternTransformer, storyPattern, democlesPattern };
         }
      }
      return null;
   }

   public static final void pattern_RegularPatternInvocationBuilder_14_4_MergeTransformationResult_expressionBB(ValidationReport report,
         ValidationReport patternToDemoclesReport)
   {
      report.merge(patternToDemoclesReport);

   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //RegularPatternInvocationBuilderImpl
