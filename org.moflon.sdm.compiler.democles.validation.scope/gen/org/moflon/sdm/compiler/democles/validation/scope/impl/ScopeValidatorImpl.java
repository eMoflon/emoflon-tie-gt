/**
 */
package org.moflon.sdm.compiler.democles.validation.scope.impl;

import SDMLanguage.activities.ActivityNode;

import SDMLanguage.expressions.Expression;

import SDMLanguage.patterns.BindingOperator;
import SDMLanguage.patterns.BindingSemantics;
import SDMLanguage.patterns.BindingState;
import SDMLanguage.patterns.LinkVariable;
import SDMLanguage.patterns.ObjectVariable;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.moflon.sdm.compiler.democles.validation.result.ErrorMessage;
import org.moflon.sdm.compiler.democles.validation.result.ResultFactory;
import org.moflon.sdm.compiler.democles.validation.result.Severity;
import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;

import org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.Errors;
import org.moflon.sdm.compiler.democles.validation.scope.ScopePackage;
import org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator;

import org.moflon.sdm.runtime.democles.Action;
import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.CFVariable;
import org.moflon.sdm.runtime.democles.CompoundNode;
import org.moflon.sdm.runtime.democles.IfStatement;
import org.moflon.sdm.runtime.democles.Loop;
import org.moflon.sdm.runtime.democles.NodeDeletion;
import org.moflon.sdm.runtime.democles.Scope;

import org.moflon.sdm.runtime.democles.impl.UniformNoOperationVisitorImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.impl.ScopeValidatorImpl#getValidationReport <em>Validation Report</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.impl.ScopeValidatorImpl#getActionBuilders <em>Action Builders</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScopeValidatorImpl extends UniformNoOperationVisitorImpl implements ScopeValidator
{
   /**
    * The cached value of the '{@link #getValidationReport() <em>Validation Report</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getValidationReport()
    * @generated
    * @ordered
    */
   protected ValidationReport validationReport;

   /**
    * The cached value of the '{@link #getActionBuilders() <em>Action Builders</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getActionBuilders()
    * @generated
    * @ordered
    */
   protected EList<ActionBuilder> actionBuilders;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ScopeValidatorImpl()
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
      return ScopePackage.Literals.SCOPE_VALIDATOR;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ValidationReport getValidationReport()
   {
      return validationReport;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetValidationReport(ValidationReport newValidationReport, NotificationChain msgs)
   {
      ValidationReport oldValidationReport = validationReport;
      validationReport = newValidationReport;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScopePackage.SCOPE_VALIDATOR__VALIDATION_REPORT, oldValidationReport,
               newValidationReport);
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
   public void setValidationReport(ValidationReport newValidationReport)
   {
      if (newValidationReport != validationReport)
      {
         NotificationChain msgs = null;
         if (validationReport != null)
            msgs = ((InternalEObject) validationReport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScopePackage.SCOPE_VALIDATOR__VALIDATION_REPORT, null,
                  msgs);
         if (newValidationReport != null)
            msgs = ((InternalEObject) newValidationReport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScopePackage.SCOPE_VALIDATOR__VALIDATION_REPORT, null,
                  msgs);
         msgs = basicSetValidationReport(newValidationReport, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ScopePackage.SCOPE_VALIDATOR__VALIDATION_REPORT, newValidationReport, newValidationReport));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ActionBuilder> getActionBuilders()
   {
      if (actionBuilders == null)
      {
         actionBuilders = new EObjectContainmentWithInverseEList<ActionBuilder>(ActionBuilder.class, this, ScopePackage.SCOPE_VALIDATOR__ACTION_BUILDERS,
               ScopePackage.ACTION_BUILDER__VALIDATOR);
      }
      return actionBuilders;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void analyzeLinkVariable(CFNode node, LinkVariable linkVariable)
   {

      Object[] result1_black = ScopeValidatorImpl.pattern_ScopeValidator_0_1_InitValidationReport_blackFB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      ValidationReport report = (ValidationReport) result1_black[0];
      // 
      Object[] result2_black = ScopeValidatorImpl.pattern_ScopeValidator_0_2_IsOptionalNode_blackBB(report, linkVariable);
      if (result2_black != null)
      {
         ScopeValidatorImpl.pattern_ScopeValidator_0_2_IsOptionalNode_greenBBFB(report, linkVariable, this);
         //nothing ErrorMessage errorUnboundBoundInSpec = (ErrorMessage) result2_green[2];

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
   public void analyzeObjectVariable(CFNode node, ObjectVariable objectVariable)
   {

      Object[] result1_black = ScopeValidatorImpl.pattern_ScopeValidator_1_1_InitValidationReport_blackFB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      ValidationReport report = (ValidationReport) result1_black[0];
      // 
      Object[] result2_black = ScopeValidatorImpl.pattern_ScopeValidator_1_2_IsOptionalNode_blackBB(objectVariable, report);
      if (result2_black != null)
      {
         ScopeValidatorImpl.pattern_ScopeValidator_1_2_IsOptionalNode_greenFBBB(objectVariable, report, this);
         //nothing ErrorMessage optionalObjectVariableError = (ErrorMessage) result2_green[0];

         return;
      } else
      {
         // 
         Object[] result4_black = ScopeValidatorImpl.pattern_ScopeValidator_1_4_IsNegativeNode_blackB(objectVariable);
         if (result4_black != null)
         {
         } else
         {

            Object[] result5_bindingAndBlack = ScopeValidatorImpl.pattern_ScopeValidator_1_5_LookupControlFlowVariable_bindingAndBlackFBBB(this, node,
                  objectVariable);
            if (result5_bindingAndBlack == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[node] = " + node + ", "
                     + "[objectVariable] = " + objectVariable + ".");
            }
            CFVariable variable = (CFVariable) result5_bindingAndBlack[0];
            // 
            Object[] result6_black = ScopeValidatorImpl.pattern_ScopeValidator_1_6_IsVariableUnbound_blackFBB(variable, node);
            if (result6_black != null)
            {
               //nothing Action action = (Action) result6_black[0];
               // 
               Object[] result7_black = ScopeValidatorImpl.pattern_ScopeValidator_1_7_HasBindingExpression_blackBF(objectVariable);
               if (result7_black != null)
               {
                  //nothing Expression expression = (Expression) result7_black[1];
                  return;
               } else
               {
               }

            } else
            {
               // 
               Object[] result9_black = ScopeValidatorImpl.pattern_ScopeValidator_1_9_CheckBindingInformationOnBoundVariable_blackB(objectVariable);
               if (result9_black != null)
               {

                  Object[] result10_black = ScopeValidatorImpl.pattern_ScopeValidator_1_10_BoundVariableMarkedAsUnboundInSpecification_blackBB(report,
                        objectVariable);
                  if (result10_black == null)
                  {
                     throw new RuntimeException(
                           "Pattern matching failed." + " Variables: " + "[report] = " + report + ", " + "[objectVariable] = " + objectVariable + ".");
                  }
                  ScopeValidatorImpl.pattern_ScopeValidator_1_10_BoundVariableMarkedAsUnboundInSpecification_greenBFBB(report, objectVariable, this);
                  //nothing ErrorMessage errorBoundUnboundInSpec = (ErrorMessage) result10_green[1];

               } else
               {
               }
               // 
               Object[] result11_black = ScopeValidatorImpl.pattern_ScopeValidator_1_11_BoundCreateVariableFound_blackB(objectVariable);
               if (result11_black != null)
               {

                  Object[] result12_black = ScopeValidatorImpl.pattern_ScopeValidator_1_12_ReportGreenBoundVar_blackBB(objectVariable, report);
                  if (result12_black == null)
                  {
                     throw new RuntimeException(
                           "Pattern matching failed." + " Variables: " + "[objectVariable] = " + objectVariable + ", " + "[report] = " + report + ".");
                  }
                  ScopeValidatorImpl.pattern_ScopeValidator_1_12_ReportGreenBoundVar_greenBBFB(objectVariable, report, this);
                  //nothing ErrorMessage errorGreenBoundVar = (ErrorMessage) result12_green[2];

                  return;
               } else
               {

                  Object[] result14_black = ScopeValidatorImpl.pattern_ScopeValidator_1_14_LookupDeclarationScope_blackBF(variable);
                  if (result14_black == null)
                  {
                     throw new RuntimeException("Pattern matching failed." + " Variables: " + "[variable] = " + variable + ".");
                  }
                  //nothing Scope declarationScope = (Scope) result14_black[1];
                  // ForEach 
                  for (Object[] result15_black : ScopeValidatorImpl.pattern_ScopeValidator_1_15_ForAllDeletionPoint_blackBBFF(variable, node))
                  {
                     CFNode deletionNode = (CFNode) result15_black[2];
                     //nothing NodeDeletion action = (NodeDeletion) result15_black[3];
                     // 
                     ScopeValidatorImpl.pattern_ScopeValidator_1_16_CheckWhetherVariableIsAlreadyDeleted_expressionBBBBB(this, objectVariable, variable, node,
                           deletionNode);

                  }
                  // 
                  Object[] result17_black = ScopeValidatorImpl.pattern_ScopeValidator_1_17_RedBoundVariableFound_blackB(objectVariable);
                  if (result17_black != null)
                  {

                     Object[] result18_bindingAndBlack = ScopeValidatorImpl.pattern_ScopeValidator_1_18_LookupRelevantScope_bindingAndBlackFB(node);
                     if (result18_bindingAndBlack == null)
                     {
                        throw new RuntimeException("Pattern matching failed." + " Variables: " + "[node] = " + node + ".");
                     }
                     Scope scope = (Scope) result18_bindingAndBlack[0];
                     // 
                     ScopeValidatorImpl.pattern_ScopeValidator_1_19_CheckRedBoundVariable_expressionBBBB(this, variable, scope, objectVariable);

                  } else
                  {
                  }
                  return;
               }

            }

         }
         // 
         Object[] result21_black = ScopeValidatorImpl.pattern_ScopeValidator_1_21_CheckBindingInformationOnUnboundVariable_blackB(objectVariable);
         if (result21_black != null)
         {

            Object[] result22_black = ScopeValidatorImpl.pattern_ScopeValidator_1_22_UnboundVariableMarkedAsBoundInSpecification_blackBB(objectVariable,
                  report);
            if (result22_black == null)
            {
               throw new RuntimeException(
                     "Pattern matching failed." + " Variables: " + "[objectVariable] = " + objectVariable + ", " + "[report] = " + report + ".");
            }
            ScopeValidatorImpl.pattern_ScopeValidator_1_22_UnboundVariableMarkedAsBoundInSpecification_greenBBFB(objectVariable, report, this);
            //nothing ErrorMessage errorUnboundBoundInSpec = (ErrorMessage) result22_green[2];

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
   public void checkDeletionOfBoundVariable(ObjectVariable objectVariable, CFVariable variable, CFNode node, CFNode deletionNode)
   {

      Object[] result1_bindingAndBlack = ScopeValidatorImpl.pattern_ScopeValidator_2_1_Init_bindingAndBlackFBFB(this, node);
      if (result1_bindingAndBlack == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[node] = " + node + ".");
      }
      ValidationReport report = (ValidationReport) result1_bindingAndBlack[0];
      CFNode analyzedNode = (CFNode) result1_bindingAndBlack[2];

      Object[] result2_bindingAndBlack = ScopeValidatorImpl.pattern_ScopeValidator_2_2_LookupRelevantDeletionScope_bindingAndBlackFB(deletionNode);
      if (result2_bindingAndBlack == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[deletionNode] = " + deletionNode + ".");
      }
      Scope relevantScope = (Scope) result2_bindingAndBlack[0];
      // 
      Object[] result3_black = ScopeValidatorImpl.pattern_ScopeValidator_2_3_RelevantDeletionScopeReached_blackBB(relevantScope, analyzedNode);
      while (result3_black == null)
      {
         // 
         Object[] result4_black = ScopeValidatorImpl.pattern_ScopeValidator_2_4_IsDeclarationScopeReachedWithDeletionNode_blackBB(relevantScope, variable);
         while (result4_black == null)
         {

            Object[] result5_black = ScopeValidatorImpl.pattern_ScopeValidator_2_5_LookupDeletionParentNode_blackFFB(relevantScope);
            if (result5_black == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[relevantScope] = " + relevantScope + ".");
            }
            Scope deletionParentScope = (Scope) result5_black[0];
            CompoundNode deletionParentNode = (CompoundNode) result5_black[1];

            Object[] result6_bindingAndBlack = ScopeValidatorImpl.pattern_ScopeValidator_2_6_UpdateRelevantDeletionScope_bindingAndBlackFB(deletionParentScope);
            if (result6_bindingAndBlack == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[deletionParentScope] = " + deletionParentScope + ".");
            }
            relevantScope = (Scope) result6_bindingAndBlack[0];
            // 
            if (ScopeValidatorImpl.pattern_ScopeValidator_2_7_DeletionNodePrecedesAnalyzedNodeInSameScope_expressionFBBB(this, deletionParentNode,
                  analyzedNode))
            {

               Object[] result8_black = ScopeValidatorImpl.pattern_ScopeValidator_2_8_ReportDeletedBoundVariableHorizontal_blackBB(report, objectVariable);
               if (result8_black == null)
               {
                  throw new RuntimeException(
                        "Pattern matching failed." + " Variables: " + "[report] = " + report + ", " + "[objectVariable] = " + objectVariable + ".");
               }
               ScopeValidatorImpl.pattern_ScopeValidator_2_8_ReportDeletedBoundVariableHorizontal_greenBFBB(report, objectVariable, this);
               //nothing ErrorMessage deletedBoundVariableErrorHorizontal = (ErrorMessage) result8_green[1];

            } else
            {
            }

            result4_black = ScopeValidatorImpl.pattern_ScopeValidator_2_4_IsDeclarationScopeReachedWithDeletionNode_blackBB(relevantScope, variable);
         }

         Object[] result9_black = ScopeValidatorImpl.pattern_ScopeValidator_2_9_LookupAnalyzedParentScope_blackBF(analyzedNode);
         if (result9_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[analyzedNode] = " + analyzedNode + ".");
         }
         Scope analyzedParentScope = (Scope) result9_black[1];
         // 
         Object[] result10_black = ScopeValidatorImpl.pattern_ScopeValidator_2_10_IsDeclarationScopeReachedWithAnalyzedNode_blackBB(analyzedParentScope,
               variable);
         if (result10_black != null)
         {
            return;
         } else
         {

            Object[] result12_black = ScopeValidatorImpl.pattern_ScopeValidator_2_12_LookupAnalyzedParentNode_blackBF(analyzedParentScope);
            if (result12_black == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[analyzedParentScope] = " + analyzedParentScope + ".");
            }
            CompoundNode analyzedParentNode = (CompoundNode) result12_black[1];

            Object[] result13_bindingAndBlack = ScopeValidatorImpl
                  .pattern_ScopeValidator_2_13_UpdateAnalyzedNodeAndReinitDeletionNodeScope_bindingAndBlackFFBB(analyzedParentNode, deletionNode);
            if (result13_bindingAndBlack == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[analyzedParentNode] = " + analyzedParentNode + ", "
                     + "[deletionNode] = " + deletionNode + ".");
            }
            analyzedNode = (CFNode) result13_bindingAndBlack[0];
            relevantScope = (Scope) result13_bindingAndBlack[1];

         }

         result3_black = ScopeValidatorImpl.pattern_ScopeValidator_2_3_RelevantDeletionScopeReached_blackBB(relevantScope, analyzedNode);
      }

      Object[] result14_black = ScopeValidatorImpl.pattern_ScopeValidator_2_14_ReportDeletedBoundVariableVertical_blackBB(report, objectVariable);
      if (result14_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[report] = " + report + ", " + "[objectVariable] = " + objectVariable + ".");
      }
      ScopeValidatorImpl.pattern_ScopeValidator_2_14_ReportDeletedBoundVariableVertical_greenBBFB(report, objectVariable, this);
      //nothing ErrorMessage deletedBoundVariableErrorVertical = (ErrorMessage) result14_green[2];

      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void checkRedBoundVariable(CFVariable variable, Scope scope, ObjectVariable objVar)
   {

      Object[] result1_bindingAndBlack = ScopeValidatorImpl.pattern_ScopeValidator_3_1_InitializeCurrentScope_bindingAndBlackFB(scope);
      if (result1_bindingAndBlack == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[scope] = " + scope + ".");
      }
      Scope currentScope = (Scope) result1_bindingAndBlack[0];
      // 
      Object[] result2_black = ScopeValidatorImpl.pattern_ScopeValidator_3_2_VariableDeclarationScopeReached_blackBB(variable, currentScope);
      while (result2_black == null)
      {
         // 
         Object[] result3_black = ScopeValidatorImpl.pattern_ScopeValidator_3_3_ContainedInIfStatement_blackFB(currentScope);
         if (result3_black != null)
         {
            IfStatement ifStatement = (IfStatement) result3_black[0];

            Object[] result4_black = ScopeValidatorImpl.pattern_ScopeValidator_3_4_LookupParentScope_blackFB(ifStatement);
            if (result4_black == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ifStatement] = " + ifStatement + ".");
            }
            Scope parentScope = (Scope) result4_black[0];

            Object[] result5_bindingAndBlack = ScopeValidatorImpl.pattern_ScopeValidator_3_5_UpdateCurrentScope_bindingAndBlackFB(parentScope);
            if (result5_bindingAndBlack == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[parentScope] = " + parentScope + ".");
            }
            currentScope = (Scope) result5_bindingAndBlack[0];

         } else
         {

            Object[] result6_black = ScopeValidatorImpl.pattern_ScopeValidator_3_6_RedBoundVariableInLoopContextError_blackFBB(this, objVar);
            if (result6_black == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[objVar] = " + objVar + ".");
            }
            ValidationReport report = (ValidationReport) result6_black[0];
            ScopeValidatorImpl.pattern_ScopeValidator_3_6_RedBoundVariableInLoopContextError_greenFBBB(report, objVar, this);
            //nothing ErrorMessage reportRedBoundInLoop = (ErrorMessage) result6_green[0];

            return;
         }

         result2_black = ScopeValidatorImpl.pattern_ScopeValidator_3_2_VariableDeclarationScopeReached_blackBB(variable, currentScope);
      }
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean followsInSameScope(CFNode deletionNode, CFNode node)
   {// 
      Object[] result1_black = ScopeValidatorImpl.pattern_ScopeValidator_4_1_InCommonScope_blackBFB(deletionNode, node);
      if (result1_black != null)
      {
         //nothing Scope commonScope = (Scope) result1_black[1];

         Object[] result2_bindingAndBlack = ScopeValidatorImpl.pattern_ScopeValidator_4_2_InitializeAnalyzedNode_bindingAndBlackFB(node);
         if (result2_bindingAndBlack == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[node] = " + node + ".");
         }
         CFNode analyzedNode = (CFNode) result2_bindingAndBlack[0];
         // 
         Object[] result3_black = ScopeValidatorImpl.pattern_ScopeValidator_4_3_IsAnalyzedNodeDirectlyAfterDeletionNode_blackBB(analyzedNode, deletionNode);
         while (result3_black == null)
         {
            // 
            Object[] result4_black = ScopeValidatorImpl.pattern_ScopeValidator_4_4_LookupPreviousNode_blackFB(analyzedNode);
            if (result4_black != null)
            {
               CFNode previousNode = (CFNode) result4_black[0];

               Object[] result5_bindingAndBlack = ScopeValidatorImpl.pattern_ScopeValidator_4_5_UpdateAnalyzedNode_bindingAndBlackFB(previousNode);
               if (result5_bindingAndBlack == null)
               {
                  throw new RuntimeException("Pattern matching failed." + " Variables: " + "[previousNode] = " + previousNode + ".");
               }
               analyzedNode = (CFNode) result5_bindingAndBlack[0];

            } else
            {
               return ScopeValidatorImpl.pattern_ScopeValidator_4_6_expressionF();
            }

            result3_black = ScopeValidatorImpl.pattern_ScopeValidator_4_3_IsAnalyzedNodeDirectlyAfterDeletionNode_blackBB(analyzedNode, deletionNode);
         }
         return ScopeValidatorImpl.pattern_ScopeValidator_4_7_expressionF();
      } else
      {
         return ScopeValidatorImpl.pattern_ScopeValidator_4_8_expressionF();
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isNull(CFVariable variable)
   {
      // [user code injected with eMoflon]

      return variable == null;

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CFVariable lookupControlFlowVariable(CFNode node, String variableName)
   {

      Object[] result1_bindingAndBlack = ScopeValidatorImpl.pattern_ScopeValidator_6_1_LookupRelevantScope_bindingAndBlackFB(node);
      if (result1_bindingAndBlack == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[node] = " + node + ".");
      }
      Scope scope = (Scope) result1_bindingAndBlack[0];

      Object[] result2_bindingAndBlack = ScopeValidatorImpl.pattern_ScopeValidator_6_2_InitializeCurrentScope_bindingAndBlackFB(scope);
      if (result2_bindingAndBlack == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[scope] = " + scope + ".");
      }
      Scope currentScope = (Scope) result2_bindingAndBlack[0];
      // 
      Object[] result3_black = ScopeValidatorImpl.pattern_ScopeValidator_6_3_CheckVariableInScope_blackFBB(currentScope, variableName);
      while (result3_black == null)
      {
         // 
         Object[] result4_black = ScopeValidatorImpl.pattern_ScopeValidator_6_4_LookupParentScope_blackFFB(currentScope);
         if (result4_black != null)
         {
            //nothing CompoundNode compoundNode = (CompoundNode) result4_black[0];
            Scope parentScope = (Scope) result4_black[1];

            Object[] result5_bindingAndBlack = ScopeValidatorImpl.pattern_ScopeValidator_6_5_UpdateCurrentScope_bindingAndBlackFB(parentScope);
            if (result5_bindingAndBlack == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[parentScope] = " + parentScope + ".");
            }
            currentScope = (Scope) result5_bindingAndBlack[0];

         } else
         {
            return ScopeValidatorImpl.pattern_ScopeValidator_6_6_expressionF();
         }

         result3_black = ScopeValidatorImpl.pattern_ScopeValidator_6_3_CheckVariableInScope_blackFBB(currentScope, variableName);
      }
      CFVariable variable = (CFVariable) result3_black[0];
      return ScopeValidatorImpl.pattern_ScopeValidator_6_7_expressionFB(variable);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String lookupErrorMessage(Errors errorID)
   {
      // [user code injected with eMoflon]

      if (Errors.GREEN_BOUND_VAR_FOUND == errorID)
      {
         return "A bound variable can not be newly created";
      } else if (Errors.UNBOUND_IS_BOUND_IN_SPEC == errorID)
      {
         return "Unbound variable is specified as bound";
      } else if (Errors.BOUND_IS_UNBOUND_IN_SPEC == errorID)
      {
         return "Bound variable is specified as unbound";
      } else if (Errors.BOUND_VARIABLE_ALREADY_DELETED == errorID)
      {
         return "Bound variable has been already deleted earlier";
      } else if (Errors.RED_BOUND_VAR_IN_LOOP == errorID)
      {
         return "Deletion of a bound variable is not allowed in a loop";
      } else if (Errors.FREE_VAR_IS_RED == errorID)
      {
         return "The variable constructed in this action can not be deleted";
      } else if (Errors.GREEN_VAR_IS_NOT_NEW == errorID)
      {
         return "The variable to be created has to be newly constructed";
      } else if (Errors.BINDING_VAR_NOT_FREE == errorID)
      {
         return "The variable must be newly constructed or reassigned";
      } else if (Errors.OPTIONAL_VAR_FOUND == errorID)
      {
         return "Optional variables are not supported";
      } else if (Errors.REASSIGNED_METHOD_PARAMETER == errorID)
      {
         return "Method parameters cannot be reassigned";
      } else if (Errors.MULTIPLE_ATTRIBUTE_ASSIGNMENT == errorID)
      {
         return "Attribute is assigned ambiguously";
      } else if (Errors.EMPTY_COMPOUND_NODE == errorID)
      {
         return "Empty story node with two outgoing edges can produce code in which not all activity nodes are represented";
      } else if (Errors.INFINITE_LOOP == errorID)
      {
         return "Possible infinite loop";
      } else if (Errors.FREE_GREEN_VARIABLE_MARKED_AS_BOUND == errorID)
      {
         return "Free green object variable has been incorrectly marked as bound";
      } else if (Errors.GREEN_VARIABLE_WITH_BINDING == errorID)
      {
         return "Binding in green variable is not allowed";
      } else if (Errors.THIS_OBJECT_DELETED == errorID)
      {
         return "Deletion of this object is not allowed";
      } else if (Errors.EMPTY_FOREACH_NODE == errorID)
      {
         return "For each node must contain at least one variable";
      }
      return "Unknown error";

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void visitNode(CFNode node)
   {// ForEach 
      for (Object[] result1_black : ScopeValidatorImpl.pattern_ScopeValidator_8_1_ForAllActionBuilders_blackFB(this))
      {
         ActionBuilder actionBuilder = (ActionBuilder) result1_black[0];
         // 
         ScopeValidatorImpl.pattern_ScopeValidator_8_2_InvokeActionBuilder_expressionBB(actionBuilder, node);

      }
      // 
      Object[] result3_bindingAndBlack = ScopeValidatorImpl.pattern_ScopeValidator_8_3_IsCompoundNode_bindingAndBlackFB(node);
      if (result3_bindingAndBlack != null)
      {
         CompoundNode compoundNode = (CompoundNode) result3_bindingAndBlack[0];
         // 
         Object[] result4_black = ScopeValidatorImpl.pattern_ScopeValidator_8_4_IsEmptyCompoundNode_blackB(compoundNode);
         if (result4_black != null)
         {
            // 
            Object[] result5_bindingAndBlack = ScopeValidatorImpl.pattern_ScopeValidator_8_5_IsIfStatement_bindingAndBlackFB(compoundNode);
            if (result5_bindingAndBlack != null)
            {
               //nothing IfStatement ifStatement = (IfStatement) result5_bindingAndBlack[0];
            } else
            {
               // 
               Object[] result6_bindingAndBlack = ScopeValidatorImpl.pattern_ScopeValidator_8_6_IsLoop_bindingAndBlackFB(compoundNode);
               if (result6_bindingAndBlack != null)
               {
                  Loop loop = (Loop) result6_bindingAndBlack[0];
                  // 
                  Object[] result7_black = ScopeValidatorImpl.pattern_ScopeValidator_8_7_IsPossibleInfiniteLoop_blackB(loop);
                  if (result7_black != null)
                  {

                     Object[] result8_black = ScopeValidatorImpl.pattern_ScopeValidator_8_8_ReportPossibleInfiniteLoop_blackFFBB(this, loop);
                     if (result8_black == null)
                     {
                        throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[loop] = " + loop + ".");
                     }
                     ValidationReport report2 = (ValidationReport) result8_black[0];
                     ActivityNode loopActivityNode = (ActivityNode) result8_black[1];
                     ScopeValidatorImpl.pattern_ScopeValidator_8_8_ReportPossibleInfiniteLoop_greenBBFB(report2, loopActivityNode, this);
                     //nothing ErrorMessage possibleInfiniteLoopError = (ErrorMessage) result8_green[2];

                     return;
                  } else
                  {
                  }

               } else
               {
                  return;
               }

            }

            Object[] result11_black = ScopeValidatorImpl.pattern_ScopeValidator_8_11_ReportEmptyCompoundNode_blackFBBF(this, compoundNode);
            if (result11_black == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[compoundNode] = " + compoundNode + ".");
            }
            ActivityNode compoundActivityNode = (ActivityNode) result11_black[0];
            ValidationReport report1 = (ValidationReport) result11_black[3];
            ScopeValidatorImpl.pattern_ScopeValidator_8_11_ReportEmptyCompoundNode_greenBFBB(compoundActivityNode, report1, this);
            //nothing ErrorMessage emptyCompoundNodeWarning = (ErrorMessage) result11_green[1];

            return;
         } else
         {
         }

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
   public void visitScope(Scope scope)
   {// 
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
      case ScopePackage.SCOPE_VALIDATOR__ACTION_BUILDERS:
         return ((InternalEList<InternalEObject>) (InternalEList<?>) getActionBuilders()).basicAdd(otherEnd, msgs);
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
      case ScopePackage.SCOPE_VALIDATOR__VALIDATION_REPORT:
         return basicSetValidationReport(null, msgs);
      case ScopePackage.SCOPE_VALIDATOR__ACTION_BUILDERS:
         return ((InternalEList<?>) getActionBuilders()).basicRemove(otherEnd, msgs);
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
      case ScopePackage.SCOPE_VALIDATOR__VALIDATION_REPORT:
         return getValidationReport();
      case ScopePackage.SCOPE_VALIDATOR__ACTION_BUILDERS:
         return getActionBuilders();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
      case ScopePackage.SCOPE_VALIDATOR__VALIDATION_REPORT:
         setValidationReport((ValidationReport) newValue);
         return;
      case ScopePackage.SCOPE_VALIDATOR__ACTION_BUILDERS:
         getActionBuilders().clear();
         getActionBuilders().addAll((Collection<? extends ActionBuilder>) newValue);
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
      case ScopePackage.SCOPE_VALIDATOR__VALIDATION_REPORT:
         setValidationReport((ValidationReport) null);
         return;
      case ScopePackage.SCOPE_VALIDATOR__ACTION_BUILDERS:
         getActionBuilders().clear();
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
      case ScopePackage.SCOPE_VALIDATOR__VALIDATION_REPORT:
         return validationReport != null;
      case ScopePackage.SCOPE_VALIDATOR__ACTION_BUILDERS:
         return actionBuilders != null && !actionBuilders.isEmpty();
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
      case ScopePackage.SCOPE_VALIDATOR___ANALYZE_LINK_VARIABLE__CFNODE_LINKVARIABLE:
         analyzeLinkVariable((CFNode) arguments.get(0), (LinkVariable) arguments.get(1));
         return null;
      case ScopePackage.SCOPE_VALIDATOR___ANALYZE_OBJECT_VARIABLE__CFNODE_OBJECTVARIABLE:
         analyzeObjectVariable((CFNode) arguments.get(0), (ObjectVariable) arguments.get(1));
         return null;
      case ScopePackage.SCOPE_VALIDATOR___CHECK_DELETION_OF_BOUND_VARIABLE__OBJECTVARIABLE_CFVARIABLE_CFNODE_CFNODE:
         checkDeletionOfBoundVariable((ObjectVariable) arguments.get(0), (CFVariable) arguments.get(1), (CFNode) arguments.get(2), (CFNode) arguments.get(3));
         return null;
      case ScopePackage.SCOPE_VALIDATOR___CHECK_RED_BOUND_VARIABLE__CFVARIABLE_SCOPE_OBJECTVARIABLE:
         checkRedBoundVariable((CFVariable) arguments.get(0), (Scope) arguments.get(1), (ObjectVariable) arguments.get(2));
         return null;
      case ScopePackage.SCOPE_VALIDATOR___FOLLOWS_IN_SAME_SCOPE__CFNODE_CFNODE:
         return followsInSameScope((CFNode) arguments.get(0), (CFNode) arguments.get(1));
      case ScopePackage.SCOPE_VALIDATOR___IS_NULL__CFVARIABLE:
         return isNull((CFVariable) arguments.get(0));
      case ScopePackage.SCOPE_VALIDATOR___LOOKUP_CONTROL_FLOW_VARIABLE__CFNODE_STRING:
         return lookupControlFlowVariable((CFNode) arguments.get(0), (String) arguments.get(1));
      case ScopePackage.SCOPE_VALIDATOR___LOOKUP_ERROR_MESSAGE__ERRORS:
         return lookupErrorMessage((Errors) arguments.get(0));
      case ScopePackage.SCOPE_VALIDATOR___VISIT_NODE__CFNODE:
         visitNode((CFNode) arguments.get(0));
         return null;
      case ScopePackage.SCOPE_VALIDATOR___VISIT_SCOPE__SCOPE:
         visitScope((Scope) arguments.get(0));
         return null;
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_ScopeValidator_0_1_InitValidationReport_blackFB(ScopeValidator _this)
   {
      ValidationReport report = _this.getValidationReport();
      if (report != null)
      {
         return new Object[] { report, _this };
      }

      return null;
   }

   public static final Object[] pattern_ScopeValidator_0_2_IsOptionalNode_blackBB(ValidationReport report, LinkVariable linkVariable)
   {
      BindingSemantics linkVariable_bindingSemantics = linkVariable.getBindingSemantics();
      if (linkVariable_bindingSemantics.equals(BindingSemantics.OPTIONAL))
      {
         return new Object[] { report, linkVariable };
      }

      return null;
   }

   public static final Object[] pattern_ScopeValidator_0_2_IsOptionalNode_greenBBFB(ValidationReport report, LinkVariable linkVariable, ScopeValidator _this)
   {
      ErrorMessage errorUnboundBoundInSpec = ResultFactory.eINSTANCE.createErrorMessage();
      Severity errorUnboundBoundInSpec_severity_prime = Severity.ERROR;
      String _localVariable_0 = _this.lookupErrorMessage(Errors.OPTIONAL_VAR_FOUND);
      errorUnboundBoundInSpec.getLocation().add(linkVariable);
      report.getErrorMessages().add(errorUnboundBoundInSpec);
      errorUnboundBoundInSpec.setSeverity(errorUnboundBoundInSpec_severity_prime);
      String errorUnboundBoundInSpec_id_prime = _localVariable_0;
      errorUnboundBoundInSpec.setId(errorUnboundBoundInSpec_id_prime);
      return new Object[] { report, linkVariable, errorUnboundBoundInSpec, _this };
   }

   public static final Object[] pattern_ScopeValidator_1_1_InitValidationReport_blackFB(ScopeValidator _this)
   {
      ValidationReport report = _this.getValidationReport();
      if (report != null)
      {
         return new Object[] { report, _this };
      }

      return null;
   }

   public static final Object[] pattern_ScopeValidator_1_2_IsOptionalNode_blackBB(ObjectVariable objectVariable, ValidationReport report)
   {
      BindingSemantics objectVariable_bindingSemantics = objectVariable.getBindingSemantics();
      if (objectVariable_bindingSemantics.equals(BindingSemantics.OPTIONAL))
      {
         return new Object[] { objectVariable, report };
      }

      return null;
   }

   public static final Object[] pattern_ScopeValidator_1_2_IsOptionalNode_greenFBBB(ObjectVariable objectVariable, ValidationReport report,
         ScopeValidator _this)
   {
      ErrorMessage optionalObjectVariableError = ResultFactory.eINSTANCE.createErrorMessage();
      Severity optionalObjectVariableError_severity_prime = Severity.ERROR;
      String _localVariable_0 = _this.lookupErrorMessage(Errors.OPTIONAL_VAR_FOUND);
      optionalObjectVariableError.getLocation().add(objectVariable);
      report.getErrorMessages().add(optionalObjectVariableError);
      optionalObjectVariableError.setSeverity(optionalObjectVariableError_severity_prime);
      String optionalObjectVariableError_id_prime = _localVariable_0;
      optionalObjectVariableError.setId(optionalObjectVariableError_id_prime);
      return new Object[] { optionalObjectVariableError, objectVariable, report, _this };
   }

   public static final Object[] pattern_ScopeValidator_1_4_IsNegativeNode_blackB(ObjectVariable objectVariable)
   {
      BindingSemantics objectVariable_bindingSemantics = objectVariable.getBindingSemantics();
      if (objectVariable_bindingSemantics.equals(BindingSemantics.NEGATIVE))
      {
         return new Object[] { objectVariable };
      }

      return null;
   }

   public static final Object[] pattern_ScopeValidator_1_5_LookupControlFlowVariable_bindingFBBB(ScopeValidator _this, CFNode node,
         ObjectVariable objectVariable)
   {
      String objectVariable_name = objectVariable.getName();
      CFVariable _localVariable_0 = _this.lookupControlFlowVariable(node, objectVariable_name);
      CFVariable variable = _localVariable_0;
      if (variable != null)
      {
         return new Object[] { variable, _this, node, objectVariable };
      }

      return null;
   }

   public static final Object[] pattern_ScopeValidator_1_5_LookupControlFlowVariable_blackB(CFVariable variable)
   {
      return new Object[] { variable };
   }

   public static final Object[] pattern_ScopeValidator_1_5_LookupControlFlowVariable_bindingAndBlackFBBB(ScopeValidator _this, CFNode node,
         ObjectVariable objectVariable)
   {
      Object[] result_pattern_ScopeValidator_1_5_LookupControlFlowVariable_binding = pattern_ScopeValidator_1_5_LookupControlFlowVariable_bindingFBBB(_this,
            node, objectVariable);
      if (result_pattern_ScopeValidator_1_5_LookupControlFlowVariable_binding != null)
      {
         CFVariable variable = (CFVariable) result_pattern_ScopeValidator_1_5_LookupControlFlowVariable_binding[0];

         Object[] result_pattern_ScopeValidator_1_5_LookupControlFlowVariable_black = pattern_ScopeValidator_1_5_LookupControlFlowVariable_blackB(variable);
         if (result_pattern_ScopeValidator_1_5_LookupControlFlowVariable_black != null)
         {

            return new Object[] { variable, _this, node, objectVariable };
         }
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_1_6_IsVariableUnbound_blackFBB(CFVariable variable, CFNode node)
   {
      Action action = variable.getConstructor();
      if (action != null)
      {
         if (node.getActions().contains(action))
         {
            return new Object[] { action, variable, node };
         }
      }

      return null;
   }

   public static final Object[] pattern_ScopeValidator_1_7_HasBindingExpression_blackBF(ObjectVariable objectVariable)
   {
      Expression expression = objectVariable.getBindingExpression();
      if (expression != null)
      {
         return new Object[] { objectVariable, expression };
      }

      return null;
   }

   public static final Object[] pattern_ScopeValidator_1_9_CheckBindingInformationOnBoundVariable_blackB(ObjectVariable objectVariable)
   {
      BindingState objectVariable_bindingState = objectVariable.getBindingState();
      if (objectVariable_bindingState.equals(BindingState.UNBOUND))
      {
         return new Object[] { objectVariable };
      }

      return null;
   }

   public static final Object[] pattern_ScopeValidator_1_10_BoundVariableMarkedAsUnboundInSpecification_blackBB(ValidationReport report,
         ObjectVariable objectVariable)
   {
      return new Object[] { report, objectVariable };
   }

   public static final Object[] pattern_ScopeValidator_1_10_BoundVariableMarkedAsUnboundInSpecification_greenBFBB(ValidationReport report,
         ObjectVariable objectVariable, ScopeValidator _this)
   {
      ErrorMessage errorBoundUnboundInSpec = ResultFactory.eINSTANCE.createErrorMessage();
      Severity errorBoundUnboundInSpec_severity_prime = Severity.ERROR;
      String _localVariable_0 = _this.lookupErrorMessage(Errors.BOUND_IS_UNBOUND_IN_SPEC);
      errorBoundUnboundInSpec.getLocation().add(objectVariable);
      report.getErrorMessages().add(errorBoundUnboundInSpec);
      errorBoundUnboundInSpec.setSeverity(errorBoundUnboundInSpec_severity_prime);
      String errorBoundUnboundInSpec_id_prime = _localVariable_0;
      errorBoundUnboundInSpec.setId(errorBoundUnboundInSpec_id_prime);
      return new Object[] { report, errorBoundUnboundInSpec, objectVariable, _this };
   }

   public static final Object[] pattern_ScopeValidator_1_11_BoundCreateVariableFound_blackB(ObjectVariable objectVariable)
   {
      BindingOperator objectVariable_bindingOperator = objectVariable.getBindingOperator();
      if (objectVariable_bindingOperator.equals(BindingOperator.CREATE))
      {
         return new Object[] { objectVariable };
      }

      return null;
   }

   public static final Object[] pattern_ScopeValidator_1_12_ReportGreenBoundVar_blackBB(ObjectVariable objectVariable, ValidationReport report)
   {
      return new Object[] { objectVariable, report };
   }

   public static final Object[] pattern_ScopeValidator_1_12_ReportGreenBoundVar_greenBBFB(ObjectVariable objectVariable, ValidationReport report,
         ScopeValidator _this)
   {
      ErrorMessage errorGreenBoundVar = ResultFactory.eINSTANCE.createErrorMessage();
      Severity errorGreenBoundVar_severity_prime = Severity.ERROR;
      String _localVariable_0 = _this.lookupErrorMessage(Errors.GREEN_BOUND_VAR_FOUND);
      report.getErrorMessages().add(errorGreenBoundVar);
      errorGreenBoundVar.getLocation().add(objectVariable);
      errorGreenBoundVar.setSeverity(errorGreenBoundVar_severity_prime);
      String errorGreenBoundVar_id_prime = _localVariable_0;
      errorGreenBoundVar.setId(errorGreenBoundVar_id_prime);
      return new Object[] { objectVariable, report, errorGreenBoundVar, _this };
   }

   public static final Object[] pattern_ScopeValidator_1_14_LookupDeclarationScope_blackBF(CFVariable variable)
   {
      Scope declarationScope = variable.getScope();
      if (declarationScope != null)
      {
         return new Object[] { variable, declarationScope };
      }

      return null;
   }

   public static final Iterable<Object[]> pattern_ScopeValidator_1_15_ForAllDeletionPoint_blackBBFF(CFVariable variable, CFNode node)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (NodeDeletion action : variable.getDestructors())
      {
         CFNode deletionNode = action.getCfNode();
         if (deletionNode != null)
         {
            if (!deletionNode.equals(node))
            {
               _result.add(new Object[] { variable, node, deletionNode, action });
            }
         }

      }
      return _result;
   }

   public static final void pattern_ScopeValidator_1_16_CheckWhetherVariableIsAlreadyDeleted_expressionBBBBB(ScopeValidator _this,
         ObjectVariable objectVariable, CFVariable variable, CFNode node, CFNode deletionNode)
   {
      _this.checkDeletionOfBoundVariable(objectVariable, variable, node, deletionNode);

   }

   public static final Object[] pattern_ScopeValidator_1_17_RedBoundVariableFound_blackB(ObjectVariable objectVariable)
   {
      BindingOperator objectVariable_bindingOperator = objectVariable.getBindingOperator();
      if (objectVariable_bindingOperator.equals(BindingOperator.DESTROY))
      {
         return new Object[] { objectVariable };
      }

      return null;
   }

   public static final Object[] pattern_ScopeValidator_1_18_LookupRelevantScope_bindingFB(CFNode node)
   {
      Scope _localVariable_0 = node.getRelevantScope();
      Scope scope = _localVariable_0;
      if (scope != null)
      {
         return new Object[] { scope, node };
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_1_18_LookupRelevantScope_blackB(Scope scope)
   {
      return new Object[] { scope };
   }

   public static final Object[] pattern_ScopeValidator_1_18_LookupRelevantScope_bindingAndBlackFB(CFNode node)
   {
      Object[] result_pattern_ScopeValidator_1_18_LookupRelevantScope_binding = pattern_ScopeValidator_1_18_LookupRelevantScope_bindingFB(node);
      if (result_pattern_ScopeValidator_1_18_LookupRelevantScope_binding != null)
      {
         Scope scope = (Scope) result_pattern_ScopeValidator_1_18_LookupRelevantScope_binding[0];

         Object[] result_pattern_ScopeValidator_1_18_LookupRelevantScope_black = pattern_ScopeValidator_1_18_LookupRelevantScope_blackB(scope);
         if (result_pattern_ScopeValidator_1_18_LookupRelevantScope_black != null)
         {

            return new Object[] { scope, node };
         }
      }
      return null;
   }

   public static final void pattern_ScopeValidator_1_19_CheckRedBoundVariable_expressionBBBB(ScopeValidator _this, CFVariable variable, Scope scope,
         ObjectVariable objectVariable)
   {
      _this.checkRedBoundVariable(variable, scope, objectVariable);

   }

   public static final Object[] pattern_ScopeValidator_1_21_CheckBindingInformationOnUnboundVariable_blackB(ObjectVariable objectVariable)
   {
      BindingState objectVariable_bindingState = objectVariable.getBindingState();
      if (objectVariable_bindingState.equals(BindingState.BOUND))
      {
         return new Object[] { objectVariable };
      }

      return null;
   }

   public static final Object[] pattern_ScopeValidator_1_22_UnboundVariableMarkedAsBoundInSpecification_blackBB(ObjectVariable objectVariable,
         ValidationReport report)
   {
      return new Object[] { objectVariable, report };
   }

   public static final Object[] pattern_ScopeValidator_1_22_UnboundVariableMarkedAsBoundInSpecification_greenBBFB(ObjectVariable objectVariable,
         ValidationReport report, ScopeValidator _this)
   {
      ErrorMessage errorUnboundBoundInSpec = ResultFactory.eINSTANCE.createErrorMessage();
      Severity errorUnboundBoundInSpec_severity_prime = Severity.ERROR;
      String _localVariable_0 = _this.lookupErrorMessage(Errors.UNBOUND_IS_BOUND_IN_SPEC);
      report.getErrorMessages().add(errorUnboundBoundInSpec);
      errorUnboundBoundInSpec.getLocation().add(objectVariable);
      errorUnboundBoundInSpec.setSeverity(errorUnboundBoundInSpec_severity_prime);
      String errorUnboundBoundInSpec_id_prime = _localVariable_0;
      errorUnboundBoundInSpec.setId(errorUnboundBoundInSpec_id_prime);
      return new Object[] { objectVariable, report, errorUnboundBoundInSpec, _this };
   }

   public static final Object[] pattern_ScopeValidator_2_1_Init_bindingFB(CFNode node)
   {
      CFNode analyzedNode = node;
      if (analyzedNode != null)
      {
         return new Object[] { analyzedNode, node };
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_2_1_Init_blackFBB(ScopeValidator _this, CFNode analyzedNode)
   {
      ValidationReport report = _this.getValidationReport();
      if (report != null)
      {
         return new Object[] { report, _this, analyzedNode };
      }

      return null;
   }

   public static final Object[] pattern_ScopeValidator_2_1_Init_bindingAndBlackFBFB(ScopeValidator _this, CFNode node)
   {
      Object[] result_pattern_ScopeValidator_2_1_Init_binding = pattern_ScopeValidator_2_1_Init_bindingFB(node);
      if (result_pattern_ScopeValidator_2_1_Init_binding != null)
      {
         CFNode analyzedNode = (CFNode) result_pattern_ScopeValidator_2_1_Init_binding[0];

         Object[] result_pattern_ScopeValidator_2_1_Init_black = pattern_ScopeValidator_2_1_Init_blackFBB(_this, analyzedNode);
         if (result_pattern_ScopeValidator_2_1_Init_black != null)
         {
            ValidationReport report = (ValidationReport) result_pattern_ScopeValidator_2_1_Init_black[0];

            return new Object[] { report, _this, analyzedNode, node };
         }
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_2_2_LookupRelevantDeletionScope_bindingFB(CFNode deletionNode)
   {
      Scope _localVariable_1 = deletionNode.getRelevantScope();
      Scope relevantScope = _localVariable_1;
      if (relevantScope != null)
      {
         return new Object[] { relevantScope, deletionNode };
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_2_2_LookupRelevantDeletionScope_blackB(Scope relevantScope)
   {
      return new Object[] { relevantScope };
   }

   public static final Object[] pattern_ScopeValidator_2_2_LookupRelevantDeletionScope_bindingAndBlackFB(CFNode deletionNode)
   {
      Object[] result_pattern_ScopeValidator_2_2_LookupRelevantDeletionScope_binding = pattern_ScopeValidator_2_2_LookupRelevantDeletionScope_bindingFB(
            deletionNode);
      if (result_pattern_ScopeValidator_2_2_LookupRelevantDeletionScope_binding != null)
      {
         Scope relevantScope = (Scope) result_pattern_ScopeValidator_2_2_LookupRelevantDeletionScope_binding[0];

         Object[] result_pattern_ScopeValidator_2_2_LookupRelevantDeletionScope_black = pattern_ScopeValidator_2_2_LookupRelevantDeletionScope_blackB(
               relevantScope);
         if (result_pattern_ScopeValidator_2_2_LookupRelevantDeletionScope_black != null)
         {

            return new Object[] { relevantScope, deletionNode };
         }
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_2_3_RelevantDeletionScopeReached_blackBB(Scope relevantScope, CFNode analyzedNode)
   {
      if (relevantScope.getContents().contains(analyzedNode))
      {
         return new Object[] { relevantScope, analyzedNode };
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_2_4_IsDeclarationScopeReachedWithDeletionNode_blackBB(Scope relevantScope, CFVariable variable)
   {
      if (relevantScope.getVariables().contains(variable))
      {
         return new Object[] { relevantScope, variable };
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_2_5_LookupDeletionParentNode_blackFFB(Scope relevantScope)
   {
      CompoundNode deletionParentNode = relevantScope.getParent();
      if (deletionParentNode != null)
      {
         Scope deletionParentScope = deletionParentNode.getScope();
         if (deletionParentScope != null)
         {
            if (!deletionParentScope.equals(relevantScope))
            {
               return new Object[] { deletionParentScope, deletionParentNode, relevantScope };
            }
         }

      }

      return null;
   }

   public static final Object[] pattern_ScopeValidator_2_6_UpdateRelevantDeletionScope_bindingFB(Scope deletionParentScope)
   {
      Scope relevantScope = deletionParentScope;
      if (relevantScope != null)
      {
         return new Object[] { relevantScope, deletionParentScope };
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_2_6_UpdateRelevantDeletionScope_blackB(Scope relevantScope)
   {
      return new Object[] { relevantScope };
   }

   public static final Object[] pattern_ScopeValidator_2_6_UpdateRelevantDeletionScope_bindingAndBlackFB(Scope deletionParentScope)
   {
      Object[] result_pattern_ScopeValidator_2_6_UpdateRelevantDeletionScope_binding = pattern_ScopeValidator_2_6_UpdateRelevantDeletionScope_bindingFB(
            deletionParentScope);
      if (result_pattern_ScopeValidator_2_6_UpdateRelevantDeletionScope_binding != null)
      {
         Scope relevantScope = (Scope) result_pattern_ScopeValidator_2_6_UpdateRelevantDeletionScope_binding[0];

         Object[] result_pattern_ScopeValidator_2_6_UpdateRelevantDeletionScope_black = pattern_ScopeValidator_2_6_UpdateRelevantDeletionScope_blackB(
               relevantScope);
         if (result_pattern_ScopeValidator_2_6_UpdateRelevantDeletionScope_black != null)
         {

            return new Object[] { relevantScope, deletionParentScope };
         }
      }
      return null;
   }

   public static final boolean pattern_ScopeValidator_2_7_DeletionNodePrecedesAnalyzedNodeInSameScope_expressionFBBB(ScopeValidator _this,
         CompoundNode deletionParentNode, CFNode analyzedNode)
   {
      boolean _localVariable_0 = _this.followsInSameScope(deletionParentNode, analyzedNode);
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final Object[] pattern_ScopeValidator_2_8_ReportDeletedBoundVariableHorizontal_blackBB(ValidationReport report, ObjectVariable objectVariable)
   {
      return new Object[] { report, objectVariable };
   }

   public static final Object[] pattern_ScopeValidator_2_8_ReportDeletedBoundVariableHorizontal_greenBFBB(ValidationReport report,
         ObjectVariable objectVariable, ScopeValidator _this)
   {
      ErrorMessage deletedBoundVariableErrorHorizontal = ResultFactory.eINSTANCE.createErrorMessage();
      Severity deletedBoundVariableErrorHorizontal_severity_prime = Severity.ERROR;
      String _localVariable_0 = _this.lookupErrorMessage(Errors.BOUND_VARIABLE_ALREADY_DELETED);
      report.getErrorMessages().add(deletedBoundVariableErrorHorizontal);
      deletedBoundVariableErrorHorizontal.getLocation().add(objectVariable);
      deletedBoundVariableErrorHorizontal.setSeverity(deletedBoundVariableErrorHorizontal_severity_prime);
      String deletedBoundVariableErrorHorizontal_id_prime = _localVariable_0;
      deletedBoundVariableErrorHorizontal.setId(deletedBoundVariableErrorHorizontal_id_prime);
      return new Object[] { report, deletedBoundVariableErrorHorizontal, objectVariable, _this };
   }

   public static final Object[] pattern_ScopeValidator_2_9_LookupAnalyzedParentScope_blackBF(CFNode analyzedNode)
   {
      Scope analyzedParentScope = analyzedNode.getScope();
      if (analyzedParentScope != null)
      {
         return new Object[] { analyzedNode, analyzedParentScope };
      }

      return null;
   }

   public static final Object[] pattern_ScopeValidator_2_10_IsDeclarationScopeReachedWithAnalyzedNode_blackBB(Scope analyzedParentScope, CFVariable variable)
   {
      if (analyzedParentScope.getVariables().contains(variable))
      {
         return new Object[] { analyzedParentScope, variable };
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_2_12_LookupAnalyzedParentNode_blackBF(Scope analyzedParentScope)
   {
      CompoundNode analyzedParentNode = analyzedParentScope.getParent();
      if (analyzedParentNode != null)
      {
         return new Object[] { analyzedParentScope, analyzedParentNode };
      }

      return null;
   }

   public static final Object[] pattern_ScopeValidator_2_13_UpdateAnalyzedNodeAndReinitDeletionNodeScope_bindingFFBB(CompoundNode analyzedParentNode,
         CFNode deletionNode)
   {
      CFNode analyzedNode = analyzedParentNode;
      if (analyzedNode != null)
      {
         Scope _localVariable_0 = deletionNode.getRelevantScope();
         Scope relevantScope = _localVariable_0;
         if (relevantScope != null)
         {
            return new Object[] { analyzedNode, relevantScope, analyzedParentNode, deletionNode };
         }
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_2_13_UpdateAnalyzedNodeAndReinitDeletionNodeScope_blackBB(CFNode analyzedNode, Scope relevantScope)
   {
      return new Object[] { analyzedNode, relevantScope };
   }

   public static final Object[] pattern_ScopeValidator_2_13_UpdateAnalyzedNodeAndReinitDeletionNodeScope_bindingAndBlackFFBB(CompoundNode analyzedParentNode,
         CFNode deletionNode)
   {
      Object[] result_pattern_ScopeValidator_2_13_UpdateAnalyzedNodeAndReinitDeletionNodeScope_binding = pattern_ScopeValidator_2_13_UpdateAnalyzedNodeAndReinitDeletionNodeScope_bindingFFBB(
            analyzedParentNode, deletionNode);
      if (result_pattern_ScopeValidator_2_13_UpdateAnalyzedNodeAndReinitDeletionNodeScope_binding != null)
      {
         CFNode analyzedNode = (CFNode) result_pattern_ScopeValidator_2_13_UpdateAnalyzedNodeAndReinitDeletionNodeScope_binding[0];
         Scope relevantScope = (Scope) result_pattern_ScopeValidator_2_13_UpdateAnalyzedNodeAndReinitDeletionNodeScope_binding[1];

         Object[] result_pattern_ScopeValidator_2_13_UpdateAnalyzedNodeAndReinitDeletionNodeScope_black = pattern_ScopeValidator_2_13_UpdateAnalyzedNodeAndReinitDeletionNodeScope_blackBB(
               analyzedNode, relevantScope);
         if (result_pattern_ScopeValidator_2_13_UpdateAnalyzedNodeAndReinitDeletionNodeScope_black != null)
         {

            return new Object[] { analyzedNode, relevantScope, analyzedParentNode, deletionNode };
         }
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_2_14_ReportDeletedBoundVariableVertical_blackBB(ValidationReport report, ObjectVariable objectVariable)
   {
      return new Object[] { report, objectVariable };
   }

   public static final Object[] pattern_ScopeValidator_2_14_ReportDeletedBoundVariableVertical_greenBBFB(ValidationReport report, ObjectVariable objectVariable,
         ScopeValidator _this)
   {
      ErrorMessage deletedBoundVariableErrorVertical = ResultFactory.eINSTANCE.createErrorMessage();
      String _localVariable_0 = _this.lookupErrorMessage(Errors.BOUND_VARIABLE_ALREADY_DELETED);
      Severity deletedBoundVariableErrorVertical_severity_prime = Severity.ERROR;
      report.getErrorMessages().add(deletedBoundVariableErrorVertical);
      deletedBoundVariableErrorVertical.getLocation().add(objectVariable);
      String deletedBoundVariableErrorVertical_id_prime = _localVariable_0;
      deletedBoundVariableErrorVertical.setSeverity(deletedBoundVariableErrorVertical_severity_prime);
      deletedBoundVariableErrorVertical.setId(deletedBoundVariableErrorVertical_id_prime);
      return new Object[] { report, objectVariable, deletedBoundVariableErrorVertical, _this };
   }

   public static final Object[] pattern_ScopeValidator_3_1_InitializeCurrentScope_bindingFB(Scope scope)
   {
      Scope currentScope = scope;
      if (currentScope != null)
      {
         return new Object[] { currentScope, scope };
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_3_1_InitializeCurrentScope_blackB(Scope currentScope)
   {
      return new Object[] { currentScope };
   }

   public static final Object[] pattern_ScopeValidator_3_1_InitializeCurrentScope_bindingAndBlackFB(Scope scope)
   {
      Object[] result_pattern_ScopeValidator_3_1_InitializeCurrentScope_binding = pattern_ScopeValidator_3_1_InitializeCurrentScope_bindingFB(scope);
      if (result_pattern_ScopeValidator_3_1_InitializeCurrentScope_binding != null)
      {
         Scope currentScope = (Scope) result_pattern_ScopeValidator_3_1_InitializeCurrentScope_binding[0];

         Object[] result_pattern_ScopeValidator_3_1_InitializeCurrentScope_black = pattern_ScopeValidator_3_1_InitializeCurrentScope_blackB(currentScope);
         if (result_pattern_ScopeValidator_3_1_InitializeCurrentScope_black != null)
         {

            return new Object[] { currentScope, scope };
         }
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_3_2_VariableDeclarationScopeReached_blackBB(CFVariable variable, Scope currentScope)
   {
      if (currentScope.getVariables().contains(variable))
      {
         return new Object[] { variable, currentScope };
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_3_3_ContainedInIfStatement_blackFB(Scope currentScope)
   {
      CompoundNode tmpIfStatement = currentScope.getParent();
      if (tmpIfStatement instanceof IfStatement)
      {
         IfStatement ifStatement = (IfStatement) tmpIfStatement;
         return new Object[] { ifStatement, currentScope };
      }

      return null;
   }

   public static final Object[] pattern_ScopeValidator_3_4_LookupParentScope_blackFB(IfStatement ifStatement)
   {
      Scope parentScope = ifStatement.getScope();
      if (parentScope != null)
      {
         return new Object[] { parentScope, ifStatement };
      }

      return null;
   }

   public static final Object[] pattern_ScopeValidator_3_5_UpdateCurrentScope_bindingFB(Scope parentScope)
   {
      Scope currentScope = parentScope;
      if (currentScope != null)
      {
         return new Object[] { currentScope, parentScope };
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_3_5_UpdateCurrentScope_blackB(Scope currentScope)
   {
      return new Object[] { currentScope };
   }

   public static final Object[] pattern_ScopeValidator_3_5_UpdateCurrentScope_bindingAndBlackFB(Scope parentScope)
   {
      Object[] result_pattern_ScopeValidator_3_5_UpdateCurrentScope_binding = pattern_ScopeValidator_3_5_UpdateCurrentScope_bindingFB(parentScope);
      if (result_pattern_ScopeValidator_3_5_UpdateCurrentScope_binding != null)
      {
         Scope currentScope = (Scope) result_pattern_ScopeValidator_3_5_UpdateCurrentScope_binding[0];

         Object[] result_pattern_ScopeValidator_3_5_UpdateCurrentScope_black = pattern_ScopeValidator_3_5_UpdateCurrentScope_blackB(currentScope);
         if (result_pattern_ScopeValidator_3_5_UpdateCurrentScope_black != null)
         {

            return new Object[] { currentScope, parentScope };
         }
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_3_6_RedBoundVariableInLoopContextError_blackFBB(ScopeValidator _this, ObjectVariable objVar)
   {
      ValidationReport report = _this.getValidationReport();
      if (report != null)
      {
         return new Object[] { report, _this, objVar };
      }

      return null;
   }

   public static final Object[] pattern_ScopeValidator_3_6_RedBoundVariableInLoopContextError_greenFBBB(ValidationReport report, ObjectVariable objVar,
         ScopeValidator _this)
   {
      ErrorMessage reportRedBoundInLoop = ResultFactory.eINSTANCE.createErrorMessage();
      Severity reportRedBoundInLoop_severity_prime = Severity.ERROR;
      String _localVariable_0 = _this.lookupErrorMessage(Errors.RED_BOUND_VAR_IN_LOOP);
      report.getErrorMessages().add(reportRedBoundInLoop);
      reportRedBoundInLoop.getLocation().add(objVar);
      reportRedBoundInLoop.setSeverity(reportRedBoundInLoop_severity_prime);
      String reportRedBoundInLoop_id_prime = _localVariable_0;
      reportRedBoundInLoop.setId(reportRedBoundInLoop_id_prime);
      return new Object[] { reportRedBoundInLoop, report, objVar, _this };
   }

   public static final Object[] pattern_ScopeValidator_4_1_InCommonScope_blackBFB(CFNode deletionNode, CFNode node)
   {
      if (!deletionNode.equals(node))
      {
         Scope commonScope = deletionNode.getScope();
         if (commonScope != null)
         {
            if (commonScope.getContents().contains(node))
            {
               return new Object[] { deletionNode, commonScope, node };
            }
         }

      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_4_2_InitializeAnalyzedNode_bindingFB(CFNode node)
   {
      CFNode analyzedNode = node;
      if (analyzedNode != null)
      {
         return new Object[] { analyzedNode, node };
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_4_2_InitializeAnalyzedNode_blackB(CFNode analyzedNode)
   {
      return new Object[] { analyzedNode };
   }

   public static final Object[] pattern_ScopeValidator_4_2_InitializeAnalyzedNode_bindingAndBlackFB(CFNode node)
   {
      Object[] result_pattern_ScopeValidator_4_2_InitializeAnalyzedNode_binding = pattern_ScopeValidator_4_2_InitializeAnalyzedNode_bindingFB(node);
      if (result_pattern_ScopeValidator_4_2_InitializeAnalyzedNode_binding != null)
      {
         CFNode analyzedNode = (CFNode) result_pattern_ScopeValidator_4_2_InitializeAnalyzedNode_binding[0];

         Object[] result_pattern_ScopeValidator_4_2_InitializeAnalyzedNode_black = pattern_ScopeValidator_4_2_InitializeAnalyzedNode_blackB(analyzedNode);
         if (result_pattern_ScopeValidator_4_2_InitializeAnalyzedNode_black != null)
         {

            return new Object[] { analyzedNode, node };
         }
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_4_3_IsAnalyzedNodeDirectlyAfterDeletionNode_blackBB(CFNode analyzedNode, CFNode deletionNode)
   {
      if (!analyzedNode.equals(deletionNode))
      {
         if (deletionNode.equals(analyzedNode.getPrev()))
         {
            return new Object[] { analyzedNode, deletionNode };
         }
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_4_4_LookupPreviousNode_blackFB(CFNode analyzedNode)
   {
      CFNode previousNode = analyzedNode.getPrev();
      if (previousNode != null)
      {
         if (!analyzedNode.equals(previousNode))
         {
            return new Object[] { previousNode, analyzedNode };
         }
      }

      return null;
   }

   public static final Object[] pattern_ScopeValidator_4_5_UpdateAnalyzedNode_bindingFB(CFNode previousNode)
   {
      CFNode analyzedNode = previousNode;
      if (analyzedNode != null)
      {
         return new Object[] { analyzedNode, previousNode };
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_4_5_UpdateAnalyzedNode_blackB(CFNode analyzedNode)
   {
      return new Object[] { analyzedNode };
   }

   public static final Object[] pattern_ScopeValidator_4_5_UpdateAnalyzedNode_bindingAndBlackFB(CFNode previousNode)
   {
      Object[] result_pattern_ScopeValidator_4_5_UpdateAnalyzedNode_binding = pattern_ScopeValidator_4_5_UpdateAnalyzedNode_bindingFB(previousNode);
      if (result_pattern_ScopeValidator_4_5_UpdateAnalyzedNode_binding != null)
      {
         CFNode analyzedNode = (CFNode) result_pattern_ScopeValidator_4_5_UpdateAnalyzedNode_binding[0];

         Object[] result_pattern_ScopeValidator_4_5_UpdateAnalyzedNode_black = pattern_ScopeValidator_4_5_UpdateAnalyzedNode_blackB(analyzedNode);
         if (result_pattern_ScopeValidator_4_5_UpdateAnalyzedNode_black != null)
         {

            return new Object[] { analyzedNode, previousNode };
         }
      }
      return null;
   }

   public static final boolean pattern_ScopeValidator_4_6_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final boolean pattern_ScopeValidator_4_7_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final boolean pattern_ScopeValidator_4_8_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final Object[] pattern_ScopeValidator_6_1_LookupRelevantScope_bindingFB(CFNode node)
   {
      Scope _localVariable_0 = node.getRelevantScope();
      Scope scope = _localVariable_0;
      if (scope != null)
      {
         return new Object[] { scope, node };
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_6_1_LookupRelevantScope_blackB(Scope scope)
   {
      return new Object[] { scope };
   }

   public static final Object[] pattern_ScopeValidator_6_1_LookupRelevantScope_bindingAndBlackFB(CFNode node)
   {
      Object[] result_pattern_ScopeValidator_6_1_LookupRelevantScope_binding = pattern_ScopeValidator_6_1_LookupRelevantScope_bindingFB(node);
      if (result_pattern_ScopeValidator_6_1_LookupRelevantScope_binding != null)
      {
         Scope scope = (Scope) result_pattern_ScopeValidator_6_1_LookupRelevantScope_binding[0];

         Object[] result_pattern_ScopeValidator_6_1_LookupRelevantScope_black = pattern_ScopeValidator_6_1_LookupRelevantScope_blackB(scope);
         if (result_pattern_ScopeValidator_6_1_LookupRelevantScope_black != null)
         {

            return new Object[] { scope, node };
         }
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_6_2_InitializeCurrentScope_bindingFB(Scope scope)
   {
      Scope currentScope = scope;
      if (currentScope != null)
      {
         return new Object[] { currentScope, scope };
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_6_2_InitializeCurrentScope_blackB(Scope currentScope)
   {
      return new Object[] { currentScope };
   }

   public static final Object[] pattern_ScopeValidator_6_2_InitializeCurrentScope_bindingAndBlackFB(Scope scope)
   {
      Object[] result_pattern_ScopeValidator_6_2_InitializeCurrentScope_binding = pattern_ScopeValidator_6_2_InitializeCurrentScope_bindingFB(scope);
      if (result_pattern_ScopeValidator_6_2_InitializeCurrentScope_binding != null)
      {
         Scope currentScope = (Scope) result_pattern_ScopeValidator_6_2_InitializeCurrentScope_binding[0];

         Object[] result_pattern_ScopeValidator_6_2_InitializeCurrentScope_black = pattern_ScopeValidator_6_2_InitializeCurrentScope_blackB(currentScope);
         if (result_pattern_ScopeValidator_6_2_InitializeCurrentScope_black != null)
         {

            return new Object[] { currentScope, scope };
         }
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_6_3_CheckVariableInScope_blackFBB(Scope currentScope, String variableName)
   {
      for (CFVariable variable : currentScope.getVariables())
      {
         String variable_name = variable.getName();
         if (variable_name.equals(variableName))
         {
            return new Object[] { variable, currentScope, variableName };
         }

      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_6_4_LookupParentScope_blackFFB(Scope currentScope)
   {
      CompoundNode compoundNode = currentScope.getParent();
      if (compoundNode != null)
      {
         Scope parentScope = compoundNode.getScope();
         if (parentScope != null)
         {
            if (!currentScope.equals(parentScope))
            {
               return new Object[] { compoundNode, parentScope, currentScope };
            }
         }

      }

      return null;
   }

   public static final Object[] pattern_ScopeValidator_6_5_UpdateCurrentScope_bindingFB(Scope parentScope)
   {
      Scope currentScope = parentScope;
      if (currentScope != null)
      {
         return new Object[] { currentScope, parentScope };
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_6_5_UpdateCurrentScope_blackB(Scope currentScope)
   {
      return new Object[] { currentScope };
   }

   public static final Object[] pattern_ScopeValidator_6_5_UpdateCurrentScope_bindingAndBlackFB(Scope parentScope)
   {
      Object[] result_pattern_ScopeValidator_6_5_UpdateCurrentScope_binding = pattern_ScopeValidator_6_5_UpdateCurrentScope_bindingFB(parentScope);
      if (result_pattern_ScopeValidator_6_5_UpdateCurrentScope_binding != null)
      {
         Scope currentScope = (Scope) result_pattern_ScopeValidator_6_5_UpdateCurrentScope_binding[0];

         Object[] result_pattern_ScopeValidator_6_5_UpdateCurrentScope_black = pattern_ScopeValidator_6_5_UpdateCurrentScope_blackB(currentScope);
         if (result_pattern_ScopeValidator_6_5_UpdateCurrentScope_black != null)
         {

            return new Object[] { currentScope, parentScope };
         }
      }
      return null;
   }

   public static final CFVariable pattern_ScopeValidator_6_6_expressionF()
   {
      CFVariable _result = null;
      return _result;
   }

   public static final CFVariable pattern_ScopeValidator_6_7_expressionFB(CFVariable variable)
   {
      CFVariable _result = variable;
      return _result;
   }

   public static final Iterable<Object[]> pattern_ScopeValidator_8_1_ForAllActionBuilders_blackFB(ScopeValidator _this)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (ActionBuilder actionBuilder : _this.getActionBuilders())
      {
         _result.add(new Object[] { actionBuilder, _this });
      }
      return _result;
   }

   public static final void pattern_ScopeValidator_8_2_InvokeActionBuilder_expressionBB(ActionBuilder actionBuilder, CFNode node)
   {
      actionBuilder.buildAction(node);

   }

   public static final Object[] pattern_ScopeValidator_8_3_IsCompoundNode_bindingFB(CFNode node)
   {
      CFNode tmpCompoundNode = node;
      if (tmpCompoundNode instanceof CompoundNode)
      {
         CompoundNode compoundNode = (CompoundNode) tmpCompoundNode;
         return new Object[] { compoundNode, node };
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_8_3_IsCompoundNode_blackB(CompoundNode compoundNode)
   {
      return new Object[] { compoundNode };
   }

   public static final Object[] pattern_ScopeValidator_8_3_IsCompoundNode_bindingAndBlackFB(CFNode node)
   {
      Object[] result_pattern_ScopeValidator_8_3_IsCompoundNode_binding = pattern_ScopeValidator_8_3_IsCompoundNode_bindingFB(node);
      if (result_pattern_ScopeValidator_8_3_IsCompoundNode_binding != null)
      {
         CompoundNode compoundNode = (CompoundNode) result_pattern_ScopeValidator_8_3_IsCompoundNode_binding[0];

         Object[] result_pattern_ScopeValidator_8_3_IsCompoundNode_black = pattern_ScopeValidator_8_3_IsCompoundNode_blackB(compoundNode);
         if (result_pattern_ScopeValidator_8_3_IsCompoundNode_black != null)
         {

            return new Object[] { compoundNode, node };
         }
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_8_4_IsEmptyCompoundNode_black_nac_0B(CompoundNode compoundNode)
   {
      for (Action action : compoundNode.getActions())
      {
         return new Object[] { compoundNode };
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_8_4_IsEmptyCompoundNode_blackB(CompoundNode compoundNode)
   {
      if (pattern_ScopeValidator_8_4_IsEmptyCompoundNode_black_nac_0B(compoundNode) == null)
      {
         return new Object[] { compoundNode };
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_8_5_IsIfStatement_bindingFB(CompoundNode compoundNode)
   {
      CompoundNode tmpIfStatement = compoundNode;
      if (tmpIfStatement instanceof IfStatement)
      {
         IfStatement ifStatement = (IfStatement) tmpIfStatement;
         return new Object[] { ifStatement, compoundNode };
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_8_5_IsIfStatement_blackB(IfStatement ifStatement)
   {
      return new Object[] { ifStatement };
   }

   public static final Object[] pattern_ScopeValidator_8_5_IsIfStatement_bindingAndBlackFB(CompoundNode compoundNode)
   {
      Object[] result_pattern_ScopeValidator_8_5_IsIfStatement_binding = pattern_ScopeValidator_8_5_IsIfStatement_bindingFB(compoundNode);
      if (result_pattern_ScopeValidator_8_5_IsIfStatement_binding != null)
      {
         IfStatement ifStatement = (IfStatement) result_pattern_ScopeValidator_8_5_IsIfStatement_binding[0];

         Object[] result_pattern_ScopeValidator_8_5_IsIfStatement_black = pattern_ScopeValidator_8_5_IsIfStatement_blackB(ifStatement);
         if (result_pattern_ScopeValidator_8_5_IsIfStatement_black != null)
         {

            return new Object[] { ifStatement, compoundNode };
         }
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_8_6_IsLoop_bindingFB(CompoundNode compoundNode)
   {
      CompoundNode tmpLoop = compoundNode;
      if (tmpLoop instanceof Loop)
      {
         Loop loop = (Loop) tmpLoop;
         return new Object[] { loop, compoundNode };
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_8_6_IsLoop_blackB(Loop loop)
   {
      return new Object[] { loop };
   }

   public static final Object[] pattern_ScopeValidator_8_6_IsLoop_bindingAndBlackFB(CompoundNode compoundNode)
   {
      Object[] result_pattern_ScopeValidator_8_6_IsLoop_binding = pattern_ScopeValidator_8_6_IsLoop_bindingFB(compoundNode);
      if (result_pattern_ScopeValidator_8_6_IsLoop_binding != null)
      {
         Loop loop = (Loop) result_pattern_ScopeValidator_8_6_IsLoop_binding[0];

         Object[] result_pattern_ScopeValidator_8_6_IsLoop_black = pattern_ScopeValidator_8_6_IsLoop_blackB(loop);
         if (result_pattern_ScopeValidator_8_6_IsLoop_black != null)
         {

            return new Object[] { loop, compoundNode };
         }
      }
      return null;
   }

   public static final Object[] pattern_ScopeValidator_8_7_IsPossibleInfiniteLoop_blackB(Loop loop)
   {
      boolean loop_loopAlongTrue = loop.isLoopAlongTrue();
      if (Boolean.valueOf(loop_loopAlongTrue).equals(Boolean.valueOf(true)))
      {
         return new Object[] { loop };
      }

      return null;
   }

   public static final Object[] pattern_ScopeValidator_8_8_ReportPossibleInfiniteLoop_blackFFBB(ScopeValidator _this, Loop loop)
   {
      ValidationReport report2 = _this.getValidationReport();
      if (report2 != null)
      {
         ActivityNode loopActivityNode = loop.getOrigin();
         if (loopActivityNode != null)
         {
            return new Object[] { report2, loopActivityNode, _this, loop };
         }

      }

      return null;
   }

   public static final Object[] pattern_ScopeValidator_8_8_ReportPossibleInfiniteLoop_greenBBFB(ValidationReport report2, ActivityNode loopActivityNode,
         ScopeValidator _this)
   {
      ErrorMessage possibleInfiniteLoopError = ResultFactory.eINSTANCE.createErrorMessage();
      Severity possibleInfiniteLoopError_severity_prime = Severity.ERROR;
      String _localVariable_0 = _this.lookupErrorMessage(Errors.INFINITE_LOOP);
      report2.getErrorMessages().add(possibleInfiniteLoopError);
      possibleInfiniteLoopError.getLocation().add(loopActivityNode);
      possibleInfiniteLoopError.setSeverity(possibleInfiniteLoopError_severity_prime);
      String possibleInfiniteLoopError_id_prime = _localVariable_0;
      possibleInfiniteLoopError.setId(possibleInfiniteLoopError_id_prime);
      return new Object[] { report2, loopActivityNode, possibleInfiniteLoopError, _this };
   }

   public static final Object[] pattern_ScopeValidator_8_11_ReportEmptyCompoundNode_blackFBBF(ScopeValidator _this, CompoundNode compoundNode)
   {
      ValidationReport report1 = _this.getValidationReport();
      if (report1 != null)
      {
         ActivityNode compoundActivityNode = compoundNode.getOrigin();
         if (compoundActivityNode != null)
         {
            return new Object[] { compoundActivityNode, _this, compoundNode, report1 };
         }

      }

      return null;
   }

   public static final Object[] pattern_ScopeValidator_8_11_ReportEmptyCompoundNode_greenBFBB(ActivityNode compoundActivityNode, ValidationReport report1,
         ScopeValidator _this)
   {
      ErrorMessage emptyCompoundNodeWarning = ResultFactory.eINSTANCE.createErrorMessage();
      Severity emptyCompoundNodeWarning_severity_prime = Severity.WARNING;
      String _localVariable_0 = _this.lookupErrorMessage(Errors.EMPTY_COMPOUND_NODE);
      emptyCompoundNodeWarning.getLocation().add(compoundActivityNode);
      report1.getErrorMessages().add(emptyCompoundNodeWarning);
      emptyCompoundNodeWarning.setSeverity(emptyCompoundNodeWarning_severity_prime);
      String emptyCompoundNodeWarning_id_prime = _localVariable_0;
      emptyCompoundNodeWarning.setId(emptyCompoundNodeWarning_id_prime);
      return new Object[] { compoundActivityNode, emptyCompoundNodeWarning, report1, _this };
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //ScopeValidatorImpl
