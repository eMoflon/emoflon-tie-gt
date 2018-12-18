/**
 */
package org.moflon.sdm.compiler.democles.validation.scope.impl;

import SDMLanguage.activities.Activity;
import SDMLanguage.activities.ActivityNode;
import SDMLanguage.activities.StatementNode;
import SDMLanguage.activities.StopNode;

import SDMLanguage.calls.callExpressions.MethodCallExpression;

import SDMLanguage.expressions.Expression;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gervarro.democles.common.Adornment;

import org.gervarro.democles.specification.emf.ConstraintVariable;
import org.gervarro.democles.specification.emf.Pattern;

import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;

import org.moflon.sdm.compiler.democles.pattern.DefaultExpressionTransformer;
import org.moflon.sdm.compiler.democles.pattern.ExpressionTransformer;
import org.moflon.sdm.compiler.democles.pattern.PatternVariableHandler;

import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;

import org.moflon.sdm.compiler.democles.validation.scope.ExpressionExplorer;
import org.moflon.sdm.compiler.democles.validation.scope.PatternMatcher;
import org.moflon.sdm.compiler.democles.validation.scope.ScopePackage;
import org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator;
import org.moflon.sdm.compiler.democles.validation.scope.SingleResultPatternInvocationBuilder;

import org.moflon.sdm.runtime.democles.Action;
import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.CFVariable;
import org.moflon.sdm.runtime.democles.CompoundNode;
import org.moflon.sdm.runtime.democles.DemoclesFactory;
import org.moflon.sdm.runtime.democles.ForEach;
import org.moflon.sdm.runtime.democles.PatternInvocation;
import org.moflon.sdm.runtime.democles.ReturnStatement;
import org.moflon.sdm.runtime.democles.Scope;
import org.moflon.sdm.runtime.democles.SingleResultPatternInvocation;
import org.moflon.sdm.runtime.democles.VariableReference;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Result Pattern Invocation Builder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.impl.SingleResultPatternInvocationBuilderImpl#getPatternVariableHandler <em>Pattern Variable Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingleResultPatternInvocationBuilderImpl extends PatternInvocationBuilderImpl implements SingleResultPatternInvocationBuilder
{
   /**
    * The cached value of the '{@link #getPatternVariableHandler() <em>Pattern Variable Handler</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getPatternVariableHandler()
    * @generated
    * @ordered
    */
   protected PatternVariableHandler patternVariableHandler;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected SingleResultPatternInvocationBuilderImpl()
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
      return ScopePackage.Literals.SINGLE_RESULT_PATTERN_INVOCATION_BUILDER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public PatternVariableHandler getPatternVariableHandler()
   {
      return patternVariableHandler;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetPatternVariableHandler(PatternVariableHandler newPatternVariableHandler, NotificationChain msgs)
   {
      PatternVariableHandler oldPatternVariableHandler = patternVariableHandler;
      patternVariableHandler = newPatternVariableHandler;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
               ScopePackage.SINGLE_RESULT_PATTERN_INVOCATION_BUILDER__PATTERN_VARIABLE_HANDLER, oldPatternVariableHandler, newPatternVariableHandler);
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
   public void setPatternVariableHandler(PatternVariableHandler newPatternVariableHandler)
   {
      if (newPatternVariableHandler != patternVariableHandler)
      {
         NotificationChain msgs = null;
         if (patternVariableHandler != null)
            msgs = ((InternalEObject) patternVariableHandler).eInverseRemove(this,
                  EOPPOSITE_FEATURE_BASE - ScopePackage.SINGLE_RESULT_PATTERN_INVOCATION_BUILDER__PATTERN_VARIABLE_HANDLER, null, msgs);
         if (newPatternVariableHandler != null)
            msgs = ((InternalEObject) newPatternVariableHandler).eInverseAdd(this,
                  EOPPOSITE_FEATURE_BASE - ScopePackage.SINGLE_RESULT_PATTERN_INVOCATION_BUILDER__PATTERN_VARIABLE_HANDLER, null, msgs);
         msgs = basicSetPatternVariableHandler(newPatternVariableHandler, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ScopePackage.SINGLE_RESULT_PATTERN_INVOCATION_BUILDER__PATTERN_VARIABLE_HANDLER,
               newPatternVariableHandler, newPatternVariableHandler));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void buildAction(CFNode node)
   {

      Object[] result1_black = SingleResultPatternInvocationBuilderImpl.pattern_SingleResultPatternInvocationBuilder_0_1_LookupThisObject_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      // 
      Object[] result2_black = SingleResultPatternInvocationBuilderImpl.pattern_SingleResultPatternInvocationBuilder_0_2_LookupStatementNode_blackFFFB(node);
      if (result2_black != null)
      {
         EOperation eOperation = (EOperation) result2_black[0];
         MethodCallExpression statementExpression = (MethodCallExpression) result2_black[1];
         //nothing StatementNode statementNode = (StatementNode) result2_black[2];
         // 
         Object[] result3_black = SingleResultPatternInvocationBuilderImpl.pattern_SingleResultPatternInvocationBuilder_0_3_ReturnsBoolean_blackFBF(eOperation);
         if (result3_black != null)
         {
            //nothing EPackage ecorePackage = (EPackage) result3_black[0];
            //nothing EDataType booleanDataType = (EDataType) result3_black[2];
            // 
            Object[] result4_bindingAndBlack = SingleResultPatternInvocationBuilderImpl
                  .pattern_SingleResultPatternInvocationBuilder_0_4_IsForEach_bindingAndBlackFB(node);
            if (result4_bindingAndBlack != null)
            {
               //nothing ForEach forEach = (ForEach) result4_bindingAndBlack[0];
               // 
               return;
            } else
            {
            }

         } else
         {
            // 
            Object[] result7_bindingAndBlack = SingleResultPatternInvocationBuilderImpl
                  .pattern_SingleResultPatternInvocationBuilder_0_7_IsCompoundNode_bindingAndBlackFB(node);
            if (result7_bindingAndBlack != null)
            {
               //nothing CompoundNode compoundNode = (CompoundNode) result7_bindingAndBlack[0];
               // 
               return;
            } else
            {
            }

         }
         // 
         SingleResultPatternInvocationBuilderImpl.pattern_SingleResultPatternInvocationBuilder_0_10_ExploreAndTransformExpression_expressionBBBB(this, node,
               statementExpression, eOperation);
         return;
      } else
      {
         // 
         Object[] result12_black = SingleResultPatternInvocationBuilderImpl.pattern_SingleResultPatternInvocationBuilder_0_12_LookupStopNode_blackFB(node);
         if (result12_black != null)
         {
            StopNode stopNode = (StopNode) result12_black[0];

            Object[] result13_bindingAndBlack = SingleResultPatternInvocationBuilderImpl
                  .pattern_SingleResultPatternInvocationBuilder_0_13_CastToReturnStatement_bindingAndBlackFB(node);
            if (result13_bindingAndBlack == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[node] = " + node + ".");
            }
            ReturnStatement returnNode = (ReturnStatement) result13_bindingAndBlack[0];
            // 
            Object[] result14_black = SingleResultPatternInvocationBuilderImpl
                  .pattern_SingleResultPatternInvocationBuilder_0_14_HasReturnValueExpression_blackFBFF(stopNode);
            if (result14_black != null)
            {
               //nothing Activity activity = (Activity) result14_black[0];
               Expression returnValueExpression = (Expression) result14_black[2];
               EOperation method = (EOperation) result14_black[3];
               // 
               SingleResultPatternInvocationBuilderImpl.pattern_SingleResultPatternInvocationBuilder_0_15_ExploreAndTransformReturnExpression_expressionBBBB(
                     this, returnNode, returnValueExpression, method);
               // 
               Object[] result16_black = SingleResultPatternInvocationBuilderImpl
                     .pattern_SingleResultPatternInvocationBuilder_0_16_HandleReturnType_blackFBBF(returnNode, method);
               if (result16_black != null)
               {
                  SingleResultPatternInvocation mainAction = (SingleResultPatternInvocation) result16_black[0];
                  EClassifier returnType = (EClassifier) result16_black[3];
                  SingleResultPatternInvocationBuilderImpl.pattern_SingleResultPatternInvocationBuilder_0_16_HandleReturnType_greenBB(mainAction, returnType);

                  return;
               } else
               {
                  return;
               }

            } else
            {

               Object[] result19_black = SingleResultPatternInvocationBuilderImpl
                     .pattern_SingleResultPatternInvocationBuilder_0_19_CreateEmptyAction_blackB(returnNode);
               if (result19_black == null)
               {
                  throw new RuntimeException("Pattern matching failed." + " Variables: " + "[returnNode] = " + returnNode + ".");
               }
               SingleResultPatternInvocationBuilderImpl.pattern_SingleResultPatternInvocationBuilder_0_19_CreateEmptyAction_greenFB(returnNode);
               //nothing Action emptyAction = (Action) result19_green[0];

               return;
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
   public void buildAction(CFNode node, Expression expression, EOperation eOperation)
   {

      Object[] result1_bindingAndBlack = SingleResultPatternInvocationBuilderImpl
            .pattern_SingleResultPatternInvocationBuilder_1_1_LookupValidationReport_bindingAndBlackFBF(this);
      if (result1_bindingAndBlack == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      ValidationReport report = (ValidationReport) result1_bindingAndBlack[0];
      //nothing ScopeValidator scopeValidator = (ScopeValidator) result1_bindingAndBlack[2];

      Object[] result2_black = SingleResultPatternInvocationBuilderImpl
            .pattern_SingleResultPatternInvocationBuilder_1_2_LookupPatternTransformer_blackFFFB(this);
      if (result2_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      PatternVariableHandler patternVariableHandler = (PatternVariableHandler) result2_black[0];
      ExpressionExplorer expressionExplorer = (ExpressionExplorer) result2_black[1];
      DefaultExpressionTransformer expressionTransformer = (DefaultExpressionTransformer) result2_black[2];
      SingleResultPatternInvocationBuilderImpl.pattern_SingleResultPatternInvocationBuilder_1_2_LookupPatternTransformer_greenB(expressionTransformer);

      Object[] result3_bindingAndBlack = SingleResultPatternInvocationBuilderImpl
            .pattern_SingleResultPatternInvocationBuilder_1_3_LookupOrCreateAction_bindingAndBlackFFBB(this, node);
      if (result3_bindingAndBlack == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[node] = " + node + ".");
      }
      Pattern pattern = (Pattern) result3_bindingAndBlack[0];
      SingleResultPatternInvocation invocation = (SingleResultPatternInvocation) result3_bindingAndBlack[1];
      // 
      Object[] result4_black = SingleResultPatternInvocationBuilderImpl.pattern_SingleResultPatternInvocationBuilder_1_4_HasReturnValue_blackBFB(eOperation,
            invocation);
      if (result4_black != null)
      {
         EClassifier returnType = (EClassifier) result4_black[1];
         SingleResultPatternInvocationBuilderImpl.pattern_SingleResultPatternInvocationBuilder_1_4_HasReturnValue_greenBB(returnType, invocation);

         Object[] result5_black = SingleResultPatternInvocationBuilderImpl
               .pattern_SingleResultPatternInvocationBuilder_1_5_CreateControlFlowVariableAndReference_blackFBBBB(node, returnType, invocation, pattern);
         if (result5_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[node] = " + node + ", " + "[returnType] = " + returnType + ", "
                  + "[invocation] = " + invocation + ", " + "[pattern] = " + pattern + ".");
         }
         Scope scope = (Scope) result5_black[0];
         Object[] result5_green = SingleResultPatternInvocationBuilderImpl
               .pattern_SingleResultPatternInvocationBuilder_1_5_CreateControlFlowVariableAndReference_greenFBFFBBBB(scope, returnType, invocation, pattern,
                     patternVariableHandler);
         EMFVariable returnVariable = (EMFVariable) result5_green[0];
         //nothing VariableReference newReference = (VariableReference) result5_green[2];
         //nothing CFVariable controlFlowVariable = (CFVariable) result5_green[3];

         // 
         SingleResultPatternInvocationBuilderImpl.pattern_SingleResultPatternInvocationBuilder_1_6_ExploreExpressionInterface_expressionBBBB(expressionExplorer,
               this, pattern, expression);
         // 
         SingleResultPatternInvocationBuilderImpl.pattern_SingleResultPatternInvocationBuilder_1_7_ExploreExpression_expressionBBBBBBB(expressionTransformer,
               report, patternVariableHandler, expression, pattern, returnVariable, returnType);

      } else
      {
         // 
         SingleResultPatternInvocationBuilderImpl.pattern_SingleResultPatternInvocationBuilder_1_8_ExploreExpressionInterfaceWithoutReturn_expressionBBBB(
               expressionExplorer, this, pattern, expression);
         // 
         SingleResultPatternInvocationBuilderImpl.pattern_SingleResultPatternInvocationBuilder_1_9_ExploreExpressionPatternWithoutReturn_expressionFBBBBB(
               expressionTransformer, report, patternVariableHandler, expression, pattern);

      }
      // 
      Object[] result10_black = SingleResultPatternInvocationBuilderImpl.pattern_SingleResultPatternInvocationBuilder_1_10_LookupPatternMatcher_blackBF(this);
      if (result10_black != null)
      {
         PatternMatcher patternMatcher = (PatternMatcher) result10_black[1];
         // 
         if (SingleResultPatternInvocationBuilderImpl.pattern_SingleResultPatternInvocationBuilder_1_11_HasErrors_expressionFB(this))
         {
         } else
         {

            Object[] result12_bindingAndBlack = SingleResultPatternInvocationBuilderImpl
                  .pattern_SingleResultPatternInvocationBuilder_1_12_GenerateSearchPlan_bindingAndBlackFBBBB(patternMatcher, pattern, this, invocation);
            if (result12_bindingAndBlack == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[patternMatcher] = " + patternMatcher + ", " + "[pattern] = " + pattern
                     + ", " + "[this] = " + this + ", " + "[invocation] = " + invocation + ".");
            }
            ValidationReport patternMatchingReport = (ValidationReport) result12_bindingAndBlack[0];
            // 
            SingleResultPatternInvocationBuilderImpl.pattern_SingleResultPatternInvocationBuilder_1_13_HandlePatternMatcherReport_expressionBBB(this,
                  invocation, patternMatchingReport);
            // 
            SingleResultPatternInvocationBuilderImpl.pattern_SingleResultPatternInvocationBuilder_1_14_MergePatternMatchingReport_expressionBB(report,
                  patternMatchingReport);

         }

      } else
      {
      }
      // 
      Object[] result15_black = SingleResultPatternInvocationBuilderImpl.pattern_SingleResultPatternInvocationBuilder_1_15_HandleMainAction_blackBBF(this,
            node);
      if (result15_black != null)
      {
         PatternInvocation mainAction = (PatternInvocation) result15_black[2];
         SingleResultPatternInvocationBuilderImpl.pattern_SingleResultPatternInvocationBuilder_1_15_HandleMainAction_redBB(this, mainAction);

         SingleResultPatternInvocationBuilderImpl.pattern_SingleResultPatternInvocationBuilder_1_15_HandleMainAction_greenBB(node, mainAction);

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
   public SingleResultPatternInvocation createAction()
   {

      Object[] result1_green = SingleResultPatternInvocationBuilderImpl.pattern_SingleResultPatternInvocationBuilder_2_1_CreatePatternInvocation_greenF();
      if (result1_green == null)
      {
         throw new RuntimeException("Pattern matching failed.");
      }
      SingleResultPatternInvocation newPatternInvocation = (SingleResultPatternInvocation) result1_green[0];
      return SingleResultPatternInvocationBuilderImpl.pattern_SingleResultPatternInvocationBuilder_2_2_expressionFB(newPatternInvocation);
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
      case ScopePackage.SINGLE_RESULT_PATTERN_INVOCATION_BUILDER__PATTERN_VARIABLE_HANDLER:
         return basicSetPatternVariableHandler(null, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ScopePackage.SINGLE_RESULT_PATTERN_INVOCATION_BUILDER__PATTERN_VARIABLE_HANDLER:
         return getPatternVariableHandler();
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
      case ScopePackage.SINGLE_RESULT_PATTERN_INVOCATION_BUILDER__PATTERN_VARIABLE_HANDLER:
         setPatternVariableHandler((PatternVariableHandler) newValue);
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
      case ScopePackage.SINGLE_RESULT_PATTERN_INVOCATION_BUILDER__PATTERN_VARIABLE_HANDLER:
         setPatternVariableHandler((PatternVariableHandler) null);
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
      case ScopePackage.SINGLE_RESULT_PATTERN_INVOCATION_BUILDER__PATTERN_VARIABLE_HANDLER:
         return patternVariableHandler != null;
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
      case ScopePackage.SINGLE_RESULT_PATTERN_INVOCATION_BUILDER___BUILD_ACTION__CFNODE:
         buildAction((CFNode) arguments.get(0));
         return null;
      case ScopePackage.SINGLE_RESULT_PATTERN_INVOCATION_BUILDER___BUILD_ACTION__CFNODE_EXPRESSION_EOPERATION:
         buildAction((CFNode) arguments.get(0), (Expression) arguments.get(1), (EOperation) arguments.get(2));
         return null;
      case ScopePackage.SINGLE_RESULT_PATTERN_INVOCATION_BUILDER___CREATE_ACTION:
         return createAction();
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_0_1_LookupThisObject_blackB(SingleResultPatternInvocationBuilder _this)
   {
      return new Object[] { _this };
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_0_2_LookupStatementNode_blackFFFB(CFNode node)
   {
      ActivityNode tmpStatementNode = node.getOrigin();
      if (tmpStatementNode instanceof StatementNode)
      {
         StatementNode statementNode = (StatementNode) tmpStatementNode;
         Expression tmpStatementExpression = statementNode.getStatementExpression();
         if (tmpStatementExpression instanceof MethodCallExpression)
         {
            MethodCallExpression statementExpression = (MethodCallExpression) tmpStatementExpression;
            EOperation eOperation = statementExpression.getCallee();
            if (eOperation != null)
            {
               return new Object[] { eOperation, statementExpression, statementNode, node };
            }

         }

      }

      return null;
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_0_3_ReturnsBoolean_blackFBF(EOperation eOperation)
   {
      EClassifier tmpBooleanDataType = eOperation.getEType();
      if (tmpBooleanDataType instanceof EDataType)
      {
         EDataType booleanDataType = (EDataType) tmpBooleanDataType;
         EPackage ecorePackage = booleanDataType.getEPackage();
         if (ecorePackage != null)
         {
            String booleanDataType_name = booleanDataType.getName();
            if (booleanDataType_name.equals("EBoolean"))
            {
               String ecorePackage_name = ecorePackage.getName();
               if (ecorePackage_name.equals("ecore"))
               {
                  String ecorePackage_nsPrefix = ecorePackage.getNsPrefix();
                  if (ecorePackage_nsPrefix.equals("ecore"))
                  {
                     String ecorePackage_nsURI = ecorePackage.getNsURI();
                     if (ecorePackage_nsURI.equals("http://www.eclipse.org/emf/2002/Ecore"))
                     {
                        return new Object[] { ecorePackage, eOperation, booleanDataType };
                     }

                  }

               }

            }

         }

      }

      return null;
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_0_4_IsForEach_bindingFB(CFNode node)
   {
      CFNode tmpForEach = node;
      if (tmpForEach instanceof ForEach)
      {
         ForEach forEach = (ForEach) tmpForEach;
         return new Object[] { forEach, node };
      }
      return null;
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_0_4_IsForEach_blackB(ForEach forEach)
   {
      return new Object[] { forEach };
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_0_4_IsForEach_bindingAndBlackFB(CFNode node)
   {
      Object[] result_pattern_SingleResultPatternInvocationBuilder_0_4_IsForEach_binding = pattern_SingleResultPatternInvocationBuilder_0_4_IsForEach_bindingFB(
            node);
      if (result_pattern_SingleResultPatternInvocationBuilder_0_4_IsForEach_binding != null)
      {
         ForEach forEach = (ForEach) result_pattern_SingleResultPatternInvocationBuilder_0_4_IsForEach_binding[0];

         Object[] result_pattern_SingleResultPatternInvocationBuilder_0_4_IsForEach_black = pattern_SingleResultPatternInvocationBuilder_0_4_IsForEach_blackB(
               forEach);
         if (result_pattern_SingleResultPatternInvocationBuilder_0_4_IsForEach_black != null)
         {

            return new Object[] { forEach, node };
         }
      }
      return null;
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_0_7_IsCompoundNode_bindingFB(CFNode node)
   {
      CFNode tmpCompoundNode = node;
      if (tmpCompoundNode instanceof CompoundNode)
      {
         CompoundNode compoundNode = (CompoundNode) tmpCompoundNode;
         return new Object[] { compoundNode, node };
      }
      return null;
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_0_7_IsCompoundNode_blackB(CompoundNode compoundNode)
   {
      return new Object[] { compoundNode };
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_0_7_IsCompoundNode_bindingAndBlackFB(CFNode node)
   {
      Object[] result_pattern_SingleResultPatternInvocationBuilder_0_7_IsCompoundNode_binding = pattern_SingleResultPatternInvocationBuilder_0_7_IsCompoundNode_bindingFB(
            node);
      if (result_pattern_SingleResultPatternInvocationBuilder_0_7_IsCompoundNode_binding != null)
      {
         CompoundNode compoundNode = (CompoundNode) result_pattern_SingleResultPatternInvocationBuilder_0_7_IsCompoundNode_binding[0];

         Object[] result_pattern_SingleResultPatternInvocationBuilder_0_7_IsCompoundNode_black = pattern_SingleResultPatternInvocationBuilder_0_7_IsCompoundNode_blackB(
               compoundNode);
         if (result_pattern_SingleResultPatternInvocationBuilder_0_7_IsCompoundNode_black != null)
         {

            return new Object[] { compoundNode, node };
         }
      }
      return null;
   }

   public static final void pattern_SingleResultPatternInvocationBuilder_0_10_ExploreAndTransformExpression_expressionBBBB(
         SingleResultPatternInvocationBuilder _this, CFNode node, MethodCallExpression statementExpression, EOperation eOperation)
   {
      _this.buildAction(node, statementExpression, eOperation);

   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_0_12_LookupStopNode_blackFB(CFNode node)
   {
      ActivityNode tmpStopNode = node.getOrigin();
      if (tmpStopNode instanceof StopNode)
      {
         StopNode stopNode = (StopNode) tmpStopNode;
         return new Object[] { stopNode, node };
      }

      return null;
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_0_13_CastToReturnStatement_bindingFB(CFNode node)
   {
      CFNode tmpReturnNode = node;
      if (tmpReturnNode instanceof ReturnStatement)
      {
         ReturnStatement returnNode = (ReturnStatement) tmpReturnNode;
         return new Object[] { returnNode, node };
      }
      return null;
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_0_13_CastToReturnStatement_blackB(ReturnStatement returnNode)
   {
      return new Object[] { returnNode };
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_0_13_CastToReturnStatement_bindingAndBlackFB(CFNode node)
   {
      Object[] result_pattern_SingleResultPatternInvocationBuilder_0_13_CastToReturnStatement_binding = pattern_SingleResultPatternInvocationBuilder_0_13_CastToReturnStatement_bindingFB(
            node);
      if (result_pattern_SingleResultPatternInvocationBuilder_0_13_CastToReturnStatement_binding != null)
      {
         ReturnStatement returnNode = (ReturnStatement) result_pattern_SingleResultPatternInvocationBuilder_0_13_CastToReturnStatement_binding[0];

         Object[] result_pattern_SingleResultPatternInvocationBuilder_0_13_CastToReturnStatement_black = pattern_SingleResultPatternInvocationBuilder_0_13_CastToReturnStatement_blackB(
               returnNode);
         if (result_pattern_SingleResultPatternInvocationBuilder_0_13_CastToReturnStatement_black != null)
         {

            return new Object[] { returnNode, node };
         }
      }
      return null;
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_0_14_HasReturnValueExpression_blackFBFF(StopNode stopNode)
   {
      Expression returnValueExpression = stopNode.getReturnValue();
      if (returnValueExpression != null)
      {
         Activity activity = stopNode.getOwningActivity();
         if (activity != null)
         {
            EOperation method = activity.getOwningOperation();
            if (method != null)
            {
               return new Object[] { activity, stopNode, returnValueExpression, method };
            }

         }

      }

      return null;
   }

   public static final void pattern_SingleResultPatternInvocationBuilder_0_15_ExploreAndTransformReturnExpression_expressionBBBB(
         SingleResultPatternInvocationBuilder _this, ReturnStatement returnNode, Expression returnValueExpression, EOperation method)
   {
      _this.buildAction(returnNode, returnValueExpression, method);

   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_0_16_HandleReturnType_blackFBBF(ReturnStatement returnNode, EOperation method)
   {
      Action tmpMainAction = returnNode.getMainAction();
      if (tmpMainAction instanceof SingleResultPatternInvocation)
      {
         SingleResultPatternInvocation mainAction = (SingleResultPatternInvocation) tmpMainAction;
         EClassifier returnType = method.getEType();
         if (returnType != null)
         {
            return new Object[] { mainAction, returnNode, method, returnType };
         }

      }

      return null;
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_0_16_HandleReturnType_greenBB(SingleResultPatternInvocation mainAction,
         EClassifier returnType)
   {
      mainAction.setReturnType(returnType);
      return new Object[] { mainAction, returnType };
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_0_19_CreateEmptyAction_blackB(ReturnStatement returnNode)
   {
      return new Object[] { returnNode };
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_0_19_CreateEmptyAction_greenFB(ReturnStatement returnNode)
   {
      Action emptyAction = DemoclesFactory.eINSTANCE.createAction();
      returnNode.getActions().add(emptyAction);
      returnNode.setMainAction(emptyAction);
      return new Object[] { emptyAction, returnNode };
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_1_1_LookupValidationReport_bindingFB(SingleResultPatternInvocationBuilder _this)
   {
      ScopeValidator _localVariable_0 = _this.lookupScopeValidator();
      ScopeValidator scopeValidator = _localVariable_0;
      if (scopeValidator != null)
      {
         return new Object[] { scopeValidator, _this };
      }
      return null;
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_1_1_LookupValidationReport_blackFBB(SingleResultPatternInvocationBuilder _this,
         ScopeValidator scopeValidator)
   {
      ValidationReport report = scopeValidator.getValidationReport();
      if (report != null)
      {
         return new Object[] { report, _this, scopeValidator };
      }

      return null;
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_1_1_LookupValidationReport_bindingAndBlackFBF(
         SingleResultPatternInvocationBuilder _this)
   {
      Object[] result_pattern_SingleResultPatternInvocationBuilder_1_1_LookupValidationReport_binding = pattern_SingleResultPatternInvocationBuilder_1_1_LookupValidationReport_bindingFB(
            _this);
      if (result_pattern_SingleResultPatternInvocationBuilder_1_1_LookupValidationReport_binding != null)
      {
         ScopeValidator scopeValidator = (ScopeValidator) result_pattern_SingleResultPatternInvocationBuilder_1_1_LookupValidationReport_binding[0];

         Object[] result_pattern_SingleResultPatternInvocationBuilder_1_1_LookupValidationReport_black = pattern_SingleResultPatternInvocationBuilder_1_1_LookupValidationReport_blackFBB(
               _this, scopeValidator);
         if (result_pattern_SingleResultPatternInvocationBuilder_1_1_LookupValidationReport_black != null)
         {
            ValidationReport report = (ValidationReport) result_pattern_SingleResultPatternInvocationBuilder_1_1_LookupValidationReport_black[0];

            return new Object[] { report, _this, scopeValidator };
         }
      }
      return null;
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_1_2_LookupPatternTransformer_blackFFFB(SingleResultPatternInvocationBuilder _this)
   {
      ExpressionExplorer expressionExplorer = _this.getExpressionExplorer();
      if (expressionExplorer != null)
      {
         PatternVariableHandler patternVariableHandler = _this.getPatternVariableHandler();
         if (patternVariableHandler != null)
         {
            ExpressionTransformer tmpExpressionTransformer = expressionExplorer.getExpressionTransformer();
            if (tmpExpressionTransformer instanceof DefaultExpressionTransformer)
            {
               DefaultExpressionTransformer expressionTransformer = (DefaultExpressionTransformer) tmpExpressionTransformer;
               return new Object[] { patternVariableHandler, expressionExplorer, expressionTransformer, _this };
            }

         }

      }

      return null;
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_1_2_LookupPatternTransformer_greenB(
         DefaultExpressionTransformer expressionTransformer)
   {
      int expressionTransformer_calleeETypeNameCounter_prime = Integer.valueOf(0);
      expressionTransformer.setCalleeETypeNameCounter(Integer.valueOf(expressionTransformer_calleeETypeNameCounter_prime));
      return new Object[] { expressionTransformer };
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_1_3_LookupOrCreateAction_bindingFBB(SingleResultPatternInvocationBuilder _this,
         CFNode node)
   {
      Action _localVariable_0 = _this.lookupAction(node);
      Action tmpInvocation = _localVariable_0;
      if (tmpInvocation instanceof SingleResultPatternInvocation)
      {
         SingleResultPatternInvocation invocation = (SingleResultPatternInvocation) tmpInvocation;
         return new Object[] { invocation, _this, node };
      }
      return null;
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_1_3_LookupOrCreateAction_blackFB(SingleResultPatternInvocation invocation)
   {
      Pattern pattern = invocation.getPattern();
      if (pattern != null)
      {
         return new Object[] { pattern, invocation };
      }

      return null;
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_1_3_LookupOrCreateAction_bindingAndBlackFFBB(
         SingleResultPatternInvocationBuilder _this, CFNode node)
   {
      Object[] result_pattern_SingleResultPatternInvocationBuilder_1_3_LookupOrCreateAction_binding = pattern_SingleResultPatternInvocationBuilder_1_3_LookupOrCreateAction_bindingFBB(
            _this, node);
      if (result_pattern_SingleResultPatternInvocationBuilder_1_3_LookupOrCreateAction_binding != null)
      {
         SingleResultPatternInvocation invocation = (SingleResultPatternInvocation) result_pattern_SingleResultPatternInvocationBuilder_1_3_LookupOrCreateAction_binding[0];

         Object[] result_pattern_SingleResultPatternInvocationBuilder_1_3_LookupOrCreateAction_black = pattern_SingleResultPatternInvocationBuilder_1_3_LookupOrCreateAction_blackFB(
               invocation);
         if (result_pattern_SingleResultPatternInvocationBuilder_1_3_LookupOrCreateAction_black != null)
         {
            Pattern pattern = (Pattern) result_pattern_SingleResultPatternInvocationBuilder_1_3_LookupOrCreateAction_black[0];

            return new Object[] { pattern, invocation, _this, node };
         }
      }
      return null;
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_1_4_HasReturnValue_blackBFB(EOperation eOperation,
         SingleResultPatternInvocation invocation)
   {
      EClassifier returnType = eOperation.getEType();
      if (returnType != null)
      {
         return new Object[] { eOperation, returnType, invocation };
      }

      return null;
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_1_4_HasReturnValue_greenBB(EClassifier returnType,
         SingleResultPatternInvocation invocation)
   {
      invocation.setReturnType(returnType);
      return new Object[] { returnType, invocation };
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_1_5_CreateControlFlowVariableAndReference_blackFBBBB(CFNode node,
         EClassifier returnType, SingleResultPatternInvocation invocation, Pattern pattern)
   {
      Scope scope = node.getScope();
      if (scope != null)
      {
         return new Object[] { scope, node, returnType, invocation, pattern };
      }

      return null;
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_1_5_CreateControlFlowVariableAndReference_greenFBFFBBBB(Scope scope,
         EClassifier returnType, SingleResultPatternInvocation invocation, Pattern pattern, PatternVariableHandler patternVariableHandler)
   {
      EMFVariable returnVariable = EMFTypeFactory.eINSTANCE.createEMFVariable();
      VariableReference newReference = DemoclesFactory.eINSTANCE.createVariableReference();
      CFVariable controlFlowVariable = DemoclesFactory.eINSTANCE.createCFVariable();
      String returnVariable_name_prime = "_result";
      boolean controlFlowVariable_local_prime = Boolean.valueOf(true);
      returnVariable.setEClassifier(returnType);
      pattern.getSymbolicParameters().add(returnVariable);
      newReference.setTo(returnVariable);
      newReference.setInvocation(invocation);
      scope.getVariables().add(controlFlowVariable);
      newReference.setFrom(controlFlowVariable);
      controlFlowVariable.setConstructor(invocation);
      controlFlowVariable.setType(returnType);
      returnVariable.setName(returnVariable_name_prime);
      controlFlowVariable.setLocal(Boolean.valueOf(controlFlowVariable_local_prime));
      String returnType_name = returnType.getName();
      String _localVariable_0 = patternVariableHandler.concat(returnType_name, "_0");
      String controlFlowVariable_name_prime = _localVariable_0;
      controlFlowVariable.setName(controlFlowVariable_name_prime);
      return new Object[] { returnVariable, scope, newReference, controlFlowVariable, returnType, invocation, pattern, patternVariableHandler };

   }

   public static final void pattern_SingleResultPatternInvocationBuilder_1_6_ExploreExpressionInterface_expressionBBBB(ExpressionExplorer expressionExplorer,
         SingleResultPatternInvocationBuilder _this, Pattern pattern, Expression expression)
   {
      expressionExplorer.exploreExpression(_this, pattern, expression);

   }

   public static final void pattern_SingleResultPatternInvocationBuilder_1_7_ExploreExpression_expressionBBBBBBB(
         DefaultExpressionTransformer expressionTransformer, ValidationReport report, PatternVariableHandler patternVariableHandler, Expression expression,
         Pattern pattern, EMFVariable returnVariable, EClassifier returnType)
   {
      expressionTransformer.transformAndAssignExpression(report, patternVariableHandler, expression, pattern, returnVariable, returnType);

   }

   public static final void pattern_SingleResultPatternInvocationBuilder_1_8_ExploreExpressionInterfaceWithoutReturn_expressionBBBB(
         ExpressionExplorer expressionExplorer, SingleResultPatternInvocationBuilder _this, Pattern pattern, Expression expression)
   {
      expressionExplorer.exploreExpression(_this, pattern, expression);

   }

   public static final ConstraintVariable pattern_SingleResultPatternInvocationBuilder_1_9_ExploreExpressionPatternWithoutReturn_expressionFBBBBB(
         DefaultExpressionTransformer expressionTransformer, ValidationReport report, PatternVariableHandler patternVariableHandler, Expression expression,
         Pattern pattern)
   {
      ConstraintVariable _localVariable_0 = expressionTransformer.transformExpression(report, patternVariableHandler, expression, pattern, null);
      ConstraintVariable _result = _localVariable_0;
      return _result;
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_1_10_LookupPatternMatcher_blackBF(SingleResultPatternInvocationBuilder _this)
   {
      PatternMatcher patternMatcher = _this.getPatternMatcher();
      if (patternMatcher != null)
      {
         return new Object[] { _this, patternMatcher };
      }

      return null;
   }

   public static final boolean pattern_SingleResultPatternInvocationBuilder_1_11_HasErrors_expressionFB(SingleResultPatternInvocationBuilder _this)
   {
      boolean _localVariable_0 = _this.hasErrors();
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_1_12_GenerateSearchPlan_bindingFBBBB(PatternMatcher patternMatcher,
         Pattern pattern, SingleResultPatternInvocationBuilder _this, SingleResultPatternInvocation invocation)
   {
      Adornment _localVariable_2 = _this.calculateAdornment(invocation);
      ValidationReport _localVariable_1 = patternMatcher.generateSearchPlan(pattern, _localVariable_2, Boolean.valueOf(false));
      ValidationReport patternMatchingReport = _localVariable_1;
      if (patternMatchingReport != null)
      {
         return new Object[] { patternMatchingReport, patternMatcher, pattern, _this, invocation };
      }
      return null;
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_1_12_GenerateSearchPlan_blackB(ValidationReport patternMatchingReport)
   {
      return new Object[] { patternMatchingReport };
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_1_12_GenerateSearchPlan_bindingAndBlackFBBBB(PatternMatcher patternMatcher,
         Pattern pattern, SingleResultPatternInvocationBuilder _this, SingleResultPatternInvocation invocation)
   {
      Object[] result_pattern_SingleResultPatternInvocationBuilder_1_12_GenerateSearchPlan_binding = pattern_SingleResultPatternInvocationBuilder_1_12_GenerateSearchPlan_bindingFBBBB(
            patternMatcher, pattern, _this, invocation);
      if (result_pattern_SingleResultPatternInvocationBuilder_1_12_GenerateSearchPlan_binding != null)
      {
         ValidationReport patternMatchingReport = (ValidationReport) result_pattern_SingleResultPatternInvocationBuilder_1_12_GenerateSearchPlan_binding[0];

         Object[] result_pattern_SingleResultPatternInvocationBuilder_1_12_GenerateSearchPlan_black = pattern_SingleResultPatternInvocationBuilder_1_12_GenerateSearchPlan_blackB(
               patternMatchingReport);
         if (result_pattern_SingleResultPatternInvocationBuilder_1_12_GenerateSearchPlan_black != null)
         {

            return new Object[] { patternMatchingReport, patternMatcher, pattern, _this, invocation };
         }
      }
      return null;
   }

   public static final void pattern_SingleResultPatternInvocationBuilder_1_13_HandlePatternMatcherReport_expressionBBB(
         SingleResultPatternInvocationBuilder _this, SingleResultPatternInvocation invocation, ValidationReport patternMatchingReport)
   {
      _this.handlePatternMatcherReport(invocation, patternMatchingReport);

   }

   public static final void pattern_SingleResultPatternInvocationBuilder_1_14_MergePatternMatchingReport_expressionBB(ValidationReport report,
         ValidationReport patternMatchingReport)
   {
      report.merge(patternMatchingReport);

   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_1_15_HandleMainAction_blackBBF(SingleResultPatternInvocationBuilder _this,
         CFNode node)
   {
      Action tmpMainAction = _this.getResult();
      if (tmpMainAction instanceof PatternInvocation)
      {
         PatternInvocation mainAction = (PatternInvocation) tmpMainAction;
         return new Object[] { _this, node, mainAction };
      }

      return null;
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_1_15_HandleMainAction_redBB(SingleResultPatternInvocationBuilder _this,
         PatternInvocation mainAction)
   {
      _this.setResult(null);
      return new Object[] { _this, mainAction };
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_1_15_HandleMainAction_greenBB(CFNode node, PatternInvocation mainAction)
   {
      node.setMainAction(mainAction);
      return new Object[] { node, mainAction };
   }

   public static final Object[] pattern_SingleResultPatternInvocationBuilder_2_1_CreatePatternInvocation_greenF()
   {
      SingleResultPatternInvocation newPatternInvocation = DemoclesFactory.eINSTANCE.createSingleResultPatternInvocation();
      return new Object[] { newPatternInvocation };
   }

   public static final SingleResultPatternInvocation pattern_SingleResultPatternInvocationBuilder_2_2_expressionFB(
         SingleResultPatternInvocation newPatternInvocation)
   {
      SingleResultPatternInvocation _result = newPatternInvocation;
      return _result;
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //SingleResultPatternInvocationBuilderImpl
