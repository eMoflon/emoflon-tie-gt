/**
 */
package org.moflon.sdm.compiler.democles.validation.scope.impl;

import SDMLanguage.activities.ActivityNode;
import SDMLanguage.activities.StoryNode;

import SDMLanguage.patterns.BindingOperator;
import SDMLanguage.patterns.ObjectVariable;
import SDMLanguage.patterns.StoryPattern;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import org.moflon.sdm.compiler.democles.validation.result.ErrorMessage;
import org.moflon.sdm.compiler.democles.validation.result.ResultFactory;
import org.moflon.sdm.compiler.democles.validation.result.Severity;
import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;

import org.moflon.sdm.compiler.democles.validation.scope.Errors;
import org.moflon.sdm.compiler.democles.validation.scope.RedNodeDeletionBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.ScopePackage;
import org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator;

import org.moflon.sdm.runtime.democles.Action;
import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.CFVariable;
import org.moflon.sdm.runtime.democles.DemoclesFactory;
import org.moflon.sdm.runtime.democles.NodeDeletion;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Red Node Deletion Builder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RedNodeDeletionBuilderImpl extends ActionBuilderImpl implements RedNodeDeletionBuilder
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected RedNodeDeletionBuilderImpl()
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
      return ScopePackage.Literals.RED_NODE_DELETION_BUILDER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void buildAction(CFNode node)
   {

      Object[] result1_bindingAndBlack = RedNodeDeletionBuilderImpl.pattern_RedNodeDeletionBuilder_0_1_LookupStoryNode_bindingAndBlackFFBFB(this, node);
      if (result1_bindingAndBlack == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[node] = " + node + ".");
      }
      StoryPattern storyPattern = (StoryPattern) result1_bindingAndBlack[0];
      //nothing ScopeValidator scopeValidator = (ScopeValidator) result1_bindingAndBlack[1];
      //nothing StoryNode storyNode = (StoryNode) result1_bindingAndBlack[3];
      // ForEach 
      for (Object[] result2_black : RedNodeDeletionBuilderImpl.pattern_RedNodeDeletionBuilder_0_2_ForAllRedObjectVariables_blackFB(storyPattern))
      {
         ObjectVariable objectVariable = (ObjectVariable) result2_black[0];

         Object[] result3_bindingAndBlack = RedNodeDeletionBuilderImpl.pattern_RedNodeDeletionBuilder_0_3_LookupOrCreateAction_bindingAndBlackFBB(this, node);
         if (result3_bindingAndBlack == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[node] = " + node + ".");
         }
         NodeDeletion action = (NodeDeletion) result3_bindingAndBlack[0];

         Object[] result4_black = RedNodeDeletionBuilderImpl.pattern_RedNodeDeletionBuilder_0_4_LookupVariableType_blackBF(objectVariable);
         if (result4_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[objectVariable] = " + objectVariable + ".");
         }
         EClassifier eClassifier = (EClassifier) result4_black[1];

         Object[] result5_bindingAndBlack = RedNodeDeletionBuilderImpl.pattern_RedNodeDeletionBuilder_0_5_LookupControlFlowVariable_bindingAndBlackFBBBB(this,
               action, objectVariable, eClassifier);
         if (result5_bindingAndBlack == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[action] = " + action + ", "
                  + "[objectVariable] = " + objectVariable + ", " + "[eClassifier] = " + eClassifier + ".");
         }
         CFVariable variable = (CFVariable) result5_bindingAndBlack[0];
         // 
         RedNodeDeletionBuilderImpl.pattern_RedNodeDeletionBuilder_0_6_ValidateVariable_expressionBBBB(this, action, variable, objectVariable);

         Object[] result7_black = RedNodeDeletionBuilderImpl.pattern_RedNodeDeletionBuilder_0_7_MarkDeletion_blackBB(variable, action);
         if (result7_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[variable] = " + variable + ", " + "[action] = " + action + ".");
         }
         RedNodeDeletionBuilderImpl.pattern_RedNodeDeletionBuilder_0_7_MarkDeletion_greenBB(variable, action);

      }
      // 
      Object[] result8_black = RedNodeDeletionBuilderImpl.pattern_RedNodeDeletionBuilder_0_8_RemoveResult_blackBF(this);
      if (result8_black != null)
      {
         NodeDeletion actionResult = (NodeDeletion) result8_black[1];
         RedNodeDeletionBuilderImpl.pattern_RedNodeDeletionBuilder_0_8_RemoveResult_redBB(this, actionResult);

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
   public NodeDeletion lookupAction(CFNode node)
   {// 
      Object[] result1_black = RedNodeDeletionBuilderImpl.pattern_RedNodeDeletionBuilder_1_1_ResultAlreadyAvailable_blackFB(this);
      if (result1_black != null)
      {
         NodeDeletion result = (NodeDeletion) result1_black[0];
         return RedNodeDeletionBuilderImpl.pattern_RedNodeDeletionBuilder_1_2_expressionFB(result);
      } else
      {

         Object[] result3_black = RedNodeDeletionBuilderImpl.pattern_RedNodeDeletionBuilder_1_3_CreateNewNodeDeletionResult_blackB(this);
         if (result3_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
         }
         Object[] result3_green = RedNodeDeletionBuilderImpl.pattern_RedNodeDeletionBuilder_1_3_CreateNewNodeDeletionResult_greenBF(this);
         NodeDeletion newResult = (NodeDeletion) result3_green[1];

         // 
         RedNodeDeletionBuilderImpl.pattern_RedNodeDeletionBuilder_1_4_AddNewAction_expressionBBB(this, node, newResult);
         return RedNodeDeletionBuilderImpl.pattern_RedNodeDeletionBuilder_1_5_expressionFB(newResult);
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void validateVariable(Action action, CFVariable variable, ObjectVariable objectVariable)
   {

      Object[] result1_black = RedNodeDeletionBuilderImpl.pattern_RedNodeDeletionBuilder_2_1_InitThisObject_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }

      Object[] result2_bindingAndBlack = RedNodeDeletionBuilderImpl.pattern_RedNodeDeletionBuilder_2_2_InitValidationReport_bindingAndBlackFFB(this);
      if (result2_bindingAndBlack == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      ScopeValidator scopeValidator = (ScopeValidator) result2_bindingAndBlack[0];
      ValidationReport report = (ValidationReport) result2_bindingAndBlack[1];
      // 
      Object[] result3_black = RedNodeDeletionBuilderImpl.pattern_RedNodeDeletionBuilder_2_3_IsVariableFree_blackBB(variable, action);
      if (result3_black != null)
      {

         Object[] result4_black = RedNodeDeletionBuilderImpl.pattern_RedNodeDeletionBuilder_2_4_ReportFreeVariableAsError_blackBB(objectVariable, report);
         if (result4_black == null)
         {
            throw new RuntimeException(
                  "Pattern matching failed." + " Variables: " + "[objectVariable] = " + objectVariable + ", " + "[report] = " + report + ".");
         }
         RedNodeDeletionBuilderImpl.pattern_RedNodeDeletionBuilder_2_4_ReportFreeVariableAsError_greenBBFB(objectVariable, report, scopeValidator);
         //nothing ErrorMessage freeRedVariableError = (ErrorMessage) result4_green[2];

         return;
      } else
      {
         // 
         Object[] result6_black = RedNodeDeletionBuilderImpl.pattern_RedNodeDeletionBuilder_2_6_IsThisObjectDeleted_blackB(variable);
         if (result6_black != null)
         {

            Object[] result7_black = RedNodeDeletionBuilderImpl.pattern_RedNodeDeletionBuilder_2_7_ReportThisObjectDeleted_blackBB(objectVariable, report);
            if (result7_black == null)
            {
               throw new RuntimeException(
                     "Pattern matching failed." + " Variables: " + "[objectVariable] = " + objectVariable + ", " + "[report] = " + report + ".");
            }
            RedNodeDeletionBuilderImpl.pattern_RedNodeDeletionBuilder_2_7_ReportThisObjectDeleted_greenBFBB(objectVariable, report, scopeValidator);
            //nothing ErrorMessage thisObjectDeletedError = (ErrorMessage) result7_green[1];

            return;
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
   @Override
   public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
   {
      switch (operationID)
      {
      case ScopePackage.RED_NODE_DELETION_BUILDER___BUILD_ACTION__CFNODE:
         buildAction((CFNode) arguments.get(0));
         return null;
      case ScopePackage.RED_NODE_DELETION_BUILDER___LOOKUP_ACTION__CFNODE:
         return lookupAction((CFNode) arguments.get(0));
      case ScopePackage.RED_NODE_DELETION_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE:
         validateVariable((Action) arguments.get(0), (CFVariable) arguments.get(1), (ObjectVariable) arguments.get(2));
         return null;
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_RedNodeDeletionBuilder_0_1_LookupStoryNode_bindingFB(RedNodeDeletionBuilder _this)
   {
      ScopeValidator _localVariable_1 = _this.lookupScopeValidator();
      ScopeValidator scopeValidator = _localVariable_1;
      if (scopeValidator != null)
      {
         return new Object[] { scopeValidator, _this };
      }
      return null;
   }

   public static final Object[] pattern_RedNodeDeletionBuilder_0_1_LookupStoryNode_blackFBBFB(ScopeValidator scopeValidator, RedNodeDeletionBuilder _this,
         CFNode node)
   {
      ActivityNode tmpStoryNode = node.getOrigin();
      if (tmpStoryNode instanceof StoryNode)
      {
         StoryNode storyNode = (StoryNode) tmpStoryNode;
         StoryPattern storyPattern = storyNode.getStoryPattern();
         if (storyPattern != null)
         {
            return new Object[] { storyPattern, scopeValidator, _this, storyNode, node };
         }

      }

      return null;
   }

   public static final Object[] pattern_RedNodeDeletionBuilder_0_1_LookupStoryNode_bindingAndBlackFFBFB(RedNodeDeletionBuilder _this, CFNode node)
   {
      Object[] result_pattern_RedNodeDeletionBuilder_0_1_LookupStoryNode_binding = pattern_RedNodeDeletionBuilder_0_1_LookupStoryNode_bindingFB(_this);
      if (result_pattern_RedNodeDeletionBuilder_0_1_LookupStoryNode_binding != null)
      {
         ScopeValidator scopeValidator = (ScopeValidator) result_pattern_RedNodeDeletionBuilder_0_1_LookupStoryNode_binding[0];

         Object[] result_pattern_RedNodeDeletionBuilder_0_1_LookupStoryNode_black = pattern_RedNodeDeletionBuilder_0_1_LookupStoryNode_blackFBBFB(
               scopeValidator, _this, node);
         if (result_pattern_RedNodeDeletionBuilder_0_1_LookupStoryNode_black != null)
         {
            StoryPattern storyPattern = (StoryPattern) result_pattern_RedNodeDeletionBuilder_0_1_LookupStoryNode_black[0];
            StoryNode storyNode = (StoryNode) result_pattern_RedNodeDeletionBuilder_0_1_LookupStoryNode_black[3];

            return new Object[] { storyPattern, scopeValidator, _this, storyNode, node };
         }
      }
      return null;
   }

   public static final Iterable<Object[]> pattern_RedNodeDeletionBuilder_0_2_ForAllRedObjectVariables_blackFB(StoryPattern storyPattern)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (ObjectVariable objectVariable : storyPattern.getObjectVariable())
      {
         BindingOperator objectVariable_bindingOperator = objectVariable.getBindingOperator();
         if (objectVariable_bindingOperator.equals(BindingOperator.DESTROY))
         {
            _result.add(new Object[] { objectVariable, storyPattern });
         }

      }
      return _result;
   }

   public static final Object[] pattern_RedNodeDeletionBuilder_0_3_LookupOrCreateAction_bindingFBB(RedNodeDeletionBuilder _this, CFNode node)
   {
      Action _localVariable_0 = _this.lookupAction(node);
      Action tmpAction = _localVariable_0;
      if (tmpAction instanceof NodeDeletion)
      {
         NodeDeletion action = (NodeDeletion) tmpAction;
         return new Object[] { action, _this, node };
      }
      return null;
   }

   public static final Object[] pattern_RedNodeDeletionBuilder_0_3_LookupOrCreateAction_blackB(NodeDeletion action)
   {
      return new Object[] { action };
   }

   public static final Object[] pattern_RedNodeDeletionBuilder_0_3_LookupOrCreateAction_bindingAndBlackFBB(RedNodeDeletionBuilder _this, CFNode node)
   {
      Object[] result_pattern_RedNodeDeletionBuilder_0_3_LookupOrCreateAction_binding = pattern_RedNodeDeletionBuilder_0_3_LookupOrCreateAction_bindingFBB(
            _this, node);
      if (result_pattern_RedNodeDeletionBuilder_0_3_LookupOrCreateAction_binding != null)
      {
         NodeDeletion action = (NodeDeletion) result_pattern_RedNodeDeletionBuilder_0_3_LookupOrCreateAction_binding[0];

         Object[] result_pattern_RedNodeDeletionBuilder_0_3_LookupOrCreateAction_black = pattern_RedNodeDeletionBuilder_0_3_LookupOrCreateAction_blackB(action);
         if (result_pattern_RedNodeDeletionBuilder_0_3_LookupOrCreateAction_black != null)
         {

            return new Object[] { action, _this, node };
         }
      }
      return null;
   }

   public static final Object[] pattern_RedNodeDeletionBuilder_0_4_LookupVariableType_blackBF(ObjectVariable objectVariable)
   {
      EClassifier eClassifier = objectVariable.getType();
      if (eClassifier != null)
      {
         return new Object[] { objectVariable, eClassifier };
      }

      return null;
   }

   public static final Object[] pattern_RedNodeDeletionBuilder_0_5_LookupControlFlowVariable_bindingFBBBB(RedNodeDeletionBuilder _this, NodeDeletion action,
         ObjectVariable objectVariable, EClassifier eClassifier)
   {
      String objectVariable_name = objectVariable.getName();
      CFVariable _localVariable_0 = _this.lookupControlFlowVariable(action, objectVariable_name, eClassifier);
      CFVariable variable = _localVariable_0;
      if (variable != null)
      {
         return new Object[] { variable, _this, action, objectVariable, eClassifier };
      }

      return null;
   }

   public static final Object[] pattern_RedNodeDeletionBuilder_0_5_LookupControlFlowVariable_blackB(CFVariable variable)
   {
      return new Object[] { variable };
   }

   public static final Object[] pattern_RedNodeDeletionBuilder_0_5_LookupControlFlowVariable_bindingAndBlackFBBBB(RedNodeDeletionBuilder _this,
         NodeDeletion action, ObjectVariable objectVariable, EClassifier eClassifier)
   {
      Object[] result_pattern_RedNodeDeletionBuilder_0_5_LookupControlFlowVariable_binding = pattern_RedNodeDeletionBuilder_0_5_LookupControlFlowVariable_bindingFBBBB(
            _this, action, objectVariable, eClassifier);
      if (result_pattern_RedNodeDeletionBuilder_0_5_LookupControlFlowVariable_binding != null)
      {
         CFVariable variable = (CFVariable) result_pattern_RedNodeDeletionBuilder_0_5_LookupControlFlowVariable_binding[0];

         Object[] result_pattern_RedNodeDeletionBuilder_0_5_LookupControlFlowVariable_black = pattern_RedNodeDeletionBuilder_0_5_LookupControlFlowVariable_blackB(
               variable);
         if (result_pattern_RedNodeDeletionBuilder_0_5_LookupControlFlowVariable_black != null)
         {

            return new Object[] { variable, _this, action, objectVariable, eClassifier };
         }
      }
      return null;
   }

   public static final void pattern_RedNodeDeletionBuilder_0_6_ValidateVariable_expressionBBBB(RedNodeDeletionBuilder _this, NodeDeletion action,
         CFVariable variable, ObjectVariable objectVariable)
   {
      _this.validateVariable(action, variable, objectVariable);

   }

   public static final Object[] pattern_RedNodeDeletionBuilder_0_7_MarkDeletion_blackBB(CFVariable variable, NodeDeletion action)
   {
      return new Object[] { variable, action };
   }

   public static final Object[] pattern_RedNodeDeletionBuilder_0_7_MarkDeletion_greenBB(CFVariable variable, NodeDeletion action)
   {
      action.getDestructedVariables().add(variable);
      return new Object[] { variable, action };
   }

   public static final Object[] pattern_RedNodeDeletionBuilder_0_8_RemoveResult_blackBF(RedNodeDeletionBuilder _this)
   {
      Action tmpActionResult = _this.getResult();
      if (tmpActionResult instanceof NodeDeletion)
      {
         NodeDeletion actionResult = (NodeDeletion) tmpActionResult;
         return new Object[] { _this, actionResult };
      }

      return null;
   }

   public static final Object[] pattern_RedNodeDeletionBuilder_0_8_RemoveResult_redBB(RedNodeDeletionBuilder _this, NodeDeletion actionResult)
   {
      _this.setResult(null);
      return new Object[] { _this, actionResult };
   }

   public static final Object[] pattern_RedNodeDeletionBuilder_1_1_ResultAlreadyAvailable_blackFB(RedNodeDeletionBuilder _this)
   {
      Action tmpResult = _this.getResult();
      if (tmpResult instanceof NodeDeletion)
      {
         NodeDeletion result = (NodeDeletion) tmpResult;
         return new Object[] { result, _this };
      }

      return null;
   }

   public static final NodeDeletion pattern_RedNodeDeletionBuilder_1_2_expressionFB(NodeDeletion result)
   {
      NodeDeletion _result = result;
      return _result;
   }

   public static final Object[] pattern_RedNodeDeletionBuilder_1_3_CreateNewNodeDeletionResult_blackB(RedNodeDeletionBuilder _this)
   {
      return new Object[] { _this };
   }

   public static final Object[] pattern_RedNodeDeletionBuilder_1_3_CreateNewNodeDeletionResult_greenBF(RedNodeDeletionBuilder _this)
   {
      NodeDeletion newResult = DemoclesFactory.eINSTANCE.createNodeDeletion();
      _this.setResult(newResult);
      return new Object[] { _this, newResult };
   }

   public static final void pattern_RedNodeDeletionBuilder_1_4_AddNewAction_expressionBBB(RedNodeDeletionBuilder _this, CFNode node, NodeDeletion newResult)
   {
      _this.addAction(node, newResult);

   }

   public static final NodeDeletion pattern_RedNodeDeletionBuilder_1_5_expressionFB(NodeDeletion newResult)
   {
      NodeDeletion _result = newResult;
      return _result;
   }

   public static final Object[] pattern_RedNodeDeletionBuilder_2_1_InitThisObject_blackB(RedNodeDeletionBuilder _this)
   {
      return new Object[] { _this };
   }

   public static final Object[] pattern_RedNodeDeletionBuilder_2_2_InitValidationReport_bindingFB(RedNodeDeletionBuilder _this)
   {
      ScopeValidator _localVariable_0 = _this.lookupScopeValidator();
      ScopeValidator scopeValidator = _localVariable_0;
      if (scopeValidator != null)
      {
         return new Object[] { scopeValidator, _this };
      }
      return null;
   }

   public static final Object[] pattern_RedNodeDeletionBuilder_2_2_InitValidationReport_blackBF(ScopeValidator scopeValidator)
   {
      ValidationReport report = scopeValidator.getValidationReport();
      if (report != null)
      {
         return new Object[] { scopeValidator, report };
      }

      return null;
   }

   public static final Object[] pattern_RedNodeDeletionBuilder_2_2_InitValidationReport_bindingAndBlackFFB(RedNodeDeletionBuilder _this)
   {
      Object[] result_pattern_RedNodeDeletionBuilder_2_2_InitValidationReport_binding = pattern_RedNodeDeletionBuilder_2_2_InitValidationReport_bindingFB(
            _this);
      if (result_pattern_RedNodeDeletionBuilder_2_2_InitValidationReport_binding != null)
      {
         ScopeValidator scopeValidator = (ScopeValidator) result_pattern_RedNodeDeletionBuilder_2_2_InitValidationReport_binding[0];

         Object[] result_pattern_RedNodeDeletionBuilder_2_2_InitValidationReport_black = pattern_RedNodeDeletionBuilder_2_2_InitValidationReport_blackBF(
               scopeValidator);
         if (result_pattern_RedNodeDeletionBuilder_2_2_InitValidationReport_black != null)
         {
            ValidationReport report = (ValidationReport) result_pattern_RedNodeDeletionBuilder_2_2_InitValidationReport_black[1];

            return new Object[] { scopeValidator, report, _this };
         }
      }
      return null;
   }

   public static final Object[] pattern_RedNodeDeletionBuilder_2_3_IsVariableFree_blackBB(CFVariable variable, Action action)
   {
      if (action.equals(variable.getConstructor()))
      {
         return new Object[] { variable, action };
      }
      return null;
   }

   public static final Object[] pattern_RedNodeDeletionBuilder_2_4_ReportFreeVariableAsError_blackBB(ObjectVariable objectVariable, ValidationReport report)
   {
      return new Object[] { objectVariable, report };
   }

   public static final Object[] pattern_RedNodeDeletionBuilder_2_4_ReportFreeVariableAsError_greenBBFB(ObjectVariable objectVariable, ValidationReport report,
         ScopeValidator scopeValidator)
   {
      ErrorMessage freeRedVariableError = ResultFactory.eINSTANCE.createErrorMessage();
      Severity freeRedVariableError_severity_prime = Severity.ERROR;
      String _localVariable_0 = scopeValidator.lookupErrorMessage(Errors.FREE_VAR_IS_RED);
      report.getErrorMessages().add(freeRedVariableError);
      freeRedVariableError.getLocation().add(objectVariable);
      freeRedVariableError.setSeverity(freeRedVariableError_severity_prime);
      String freeRedVariableError_id_prime = _localVariable_0;
      freeRedVariableError.setId(freeRedVariableError_id_prime);
      return new Object[] { objectVariable, report, freeRedVariableError, scopeValidator };
   }

   public static final Object[] pattern_RedNodeDeletionBuilder_2_6_IsThisObjectDeleted_blackB(CFVariable variable)
   {
      String variable_name = variable.getName();
      if (variable_name.equals("this"))
      {
         return new Object[] { variable };
      }

      return null;
   }

   public static final Object[] pattern_RedNodeDeletionBuilder_2_7_ReportThisObjectDeleted_blackBB(ObjectVariable objectVariable, ValidationReport report)
   {
      return new Object[] { objectVariable, report };
   }

   public static final Object[] pattern_RedNodeDeletionBuilder_2_7_ReportThisObjectDeleted_greenBFBB(ObjectVariable objectVariable, ValidationReport report,
         ScopeValidator scopeValidator)
   {
      ErrorMessage thisObjectDeletedError = ResultFactory.eINSTANCE.createErrorMessage();
      Severity thisObjectDeletedError_severity_prime = Severity.ERROR;
      String _localVariable_0 = scopeValidator.lookupErrorMessage(Errors.THIS_OBJECT_DELETED);
      thisObjectDeletedError.getLocation().add(objectVariable);
      report.getErrorMessages().add(thisObjectDeletedError);
      thisObjectDeletedError.setSeverity(thisObjectDeletedError_severity_prime);
      String thisObjectDeletedError_id_prime = _localVariable_0;
      thisObjectDeletedError.setId(thisObjectDeletedError_id_prime);
      return new Object[] { objectVariable, thisObjectDeletedError, report, scopeValidator };
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //RedNodeDeletionBuilderImpl
