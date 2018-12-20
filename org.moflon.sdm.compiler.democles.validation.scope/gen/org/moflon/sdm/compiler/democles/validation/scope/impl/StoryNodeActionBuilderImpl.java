/**
 */
package org.moflon.sdm.compiler.democles.validation.scope.impl;

import SDMLanguage.activities.ActivityNode;
import SDMLanguage.activities.StoryNode;

import SDMLanguage.patterns.LinkVariable;
import SDMLanguage.patterns.ObjectVariable;
import SDMLanguage.patterns.StoryPattern;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.moflon.sdm.compiler.democles.validation.result.ErrorMessage;
import org.moflon.sdm.compiler.democles.validation.result.ResultFactory;
import org.moflon.sdm.compiler.democles.validation.result.Severity;
import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;

import org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.Errors;
import org.moflon.sdm.compiler.democles.validation.scope.ScopePackage;
import org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator;
import org.moflon.sdm.compiler.democles.validation.scope.StoryNodeActionBuilder;

import org.moflon.sdm.runtime.democles.Action;
import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.ForEach;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Story Node Action Builder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.impl.StoryNodeActionBuilderImpl#isRequiresForEach <em>Requires For Each</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StoryNodeActionBuilderImpl extends CompoundActionBuilderImpl implements StoryNodeActionBuilder
{
   /**
    * The default value of the '{@link #isRequiresForEach() <em>Requires For Each</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isRequiresForEach()
    * @generated
    * @ordered
    */
   protected static final boolean REQUIRES_FOR_EACH_EDEFAULT = false;

   /**
    * The cached value of the '{@link #isRequiresForEach() <em>Requires For Each</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isRequiresForEach()
    * @generated
    * @ordered
    */
   protected boolean requiresForEach = REQUIRES_FOR_EACH_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected StoryNodeActionBuilderImpl()
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
      return ScopePackage.Literals.STORY_NODE_ACTION_BUILDER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isRequiresForEach()
   {
      return requiresForEach;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRequiresForEach(boolean newRequiresForEach)
   {
      boolean oldRequiresForEach = requiresForEach;
      requiresForEach = newRequiresForEach;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ScopePackage.STORY_NODE_ACTION_BUILDER__REQUIRES_FOR_EACH, oldRequiresForEach, requiresForEach));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void buildAction(CFNode node)
   {// 
      Object[] result1_black = StoryNodeActionBuilderImpl.pattern_StoryNodeActionBuilder_0_1_LookupStoryPattern_blackBFFB(node, this);
      if (result1_black != null)
      {
         StoryNode storyNode = (StoryNode) result1_black[1];
         StoryPattern storyPattern = (StoryPattern) result1_black[2];
         // ForEach 
         for (Object[] result2_black : StoryNodeActionBuilderImpl.pattern_StoryNodeActionBuilder_0_2_ForAllActionBuilders_blackBF(this))
         {
            ActionBuilder childBuilder = (ActionBuilder) result2_black[1];
            // 
            StoryNodeActionBuilderImpl.pattern_StoryNodeActionBuilder_0_3_InvokeActionBuilder_expressionBB(childBuilder, node);

         }
         // 
         Object[] result4_bindingAndBlack = StoryNodeActionBuilderImpl.pattern_StoryNodeActionBuilder_0_4_LookupScopeValidator_bindingAndBlackFB(this);
         if (result4_bindingAndBlack != null)
         {
            ScopeValidator scopeValidator = (ScopeValidator) result4_bindingAndBlack[0];
            // ForEach 
            for (Object[] result5_black : StoryNodeActionBuilderImpl.pattern_StoryNodeActionBuilder_0_5_ForAllObjectVariables_blackFB(storyPattern))
            {
               ObjectVariable objectVariable = (ObjectVariable) result5_black[0];
               // 
               StoryNodeActionBuilderImpl.pattern_StoryNodeActionBuilder_0_6_ObjectVariableAnalysis_expressionBBB(scopeValidator, node, objectVariable);

            }
            // ForEach 
            for (Object[] result7_black : StoryNodeActionBuilderImpl.pattern_StoryNodeActionBuilder_0_7_ForAllLinkVariables_blackBF(storyPattern))
            {
               LinkVariable linkVariable = (LinkVariable) result7_black[1];
               // 
               StoryNodeActionBuilderImpl.pattern_StoryNodeActionBuilder_0_8_LinkVariableAnalysis_expressionBBB(scopeValidator, node, linkVariable);

            }
            // 
            Object[] result9_bindingAndBlack = StoryNodeActionBuilderImpl.pattern_StoryNodeActionBuilder_0_9_IsForEachActionBuilder_bindingAndBlackBFB(this,
                  node);
            if (result9_bindingAndBlack != null)
            {
               ForEach forEachNode = (ForEach) result9_bindingAndBlack[1];
               // 
               Object[] result10_black = StoryNodeActionBuilderImpl.pattern_StoryNodeActionBuilder_0_10_MainActionInForEachNode_blackBF(forEachNode);
               if (result10_black != null)
               {
                  //nothing Action mainAction = (Action) result10_black[1];
               } else
               {

                  Object[] result11_black = StoryNodeActionBuilderImpl.pattern_StoryNodeActionBuilder_0_11_EmptyForEachNodeError_blackBFB(scopeValidator,
                        storyNode);
                  if (result11_black == null)
                  {
                     throw new RuntimeException(
                           "Pattern matching failed." + " Variables: " + "[scopeValidator] = " + scopeValidator + ", " + "[storyNode] = " + storyNode + ".");
                  }
                  ValidationReport report = (ValidationReport) result11_black[1];
                  StoryNodeActionBuilderImpl.pattern_StoryNodeActionBuilder_0_11_EmptyForEachNodeError_greenBFBB(report, storyNode, scopeValidator);
                  //nothing ErrorMessage emptyForEachNode = (ErrorMessage) result11_green[1];

               }

            } else
            {
            }
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
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
      case ScopePackage.STORY_NODE_ACTION_BUILDER__REQUIRES_FOR_EACH:
         return isRequiresForEach();
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
      case ScopePackage.STORY_NODE_ACTION_BUILDER__REQUIRES_FOR_EACH:
         setRequiresForEach((Boolean) newValue);
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
      case ScopePackage.STORY_NODE_ACTION_BUILDER__REQUIRES_FOR_EACH:
         setRequiresForEach(REQUIRES_FOR_EACH_EDEFAULT);
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
      case ScopePackage.STORY_NODE_ACTION_BUILDER__REQUIRES_FOR_EACH:
         return requiresForEach != REQUIRES_FOR_EACH_EDEFAULT;
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
      case ScopePackage.STORY_NODE_ACTION_BUILDER___BUILD_ACTION__CFNODE:
         buildAction((CFNode) arguments.get(0));
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
      result.append(" (requiresForEach: ");
      result.append(requiresForEach);
      result.append(')');
      return result.toString();
   }

   public static final Object[] pattern_StoryNodeActionBuilder_0_1_LookupStoryPattern_blackBFFB(CFNode node, StoryNodeActionBuilder _this)
   {
      ActivityNode tmpStoryNode = node.getOrigin();
      if (tmpStoryNode instanceof StoryNode)
      {
         StoryNode storyNode = (StoryNode) tmpStoryNode;
         boolean this_requiresForEach = _this.isRequiresForEach();
         StoryPattern storyPattern = storyNode.getStoryPattern();
         if (storyPattern != null)
         {
            boolean storyNode_forEach = storyNode.isForEach();
            if (Boolean.valueOf(storyNode_forEach).equals(Boolean.valueOf(this_requiresForEach)))
            {
               return new Object[] { node, storyNode, storyPattern, _this };
            }

         }

      }

      return null;
   }

   public static final Iterable<Object[]> pattern_StoryNodeActionBuilder_0_2_ForAllActionBuilders_blackBF(StoryNodeActionBuilder _this)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (ActionBuilder childBuilder : _this.getChildren())
      {
         if (!childBuilder.equals(_this))
         {
            _result.add(new Object[] { _this, childBuilder });
         }
      }
      return _result;
   }

   public static final void pattern_StoryNodeActionBuilder_0_3_InvokeActionBuilder_expressionBB(ActionBuilder childBuilder, CFNode node)
   {
      childBuilder.buildAction(node);

   }

   public static final Object[] pattern_StoryNodeActionBuilder_0_4_LookupScopeValidator_bindingFB(StoryNodeActionBuilder _this)
   {
      ScopeValidator _localVariable_0 = _this.lookupScopeValidator();
      ScopeValidator scopeValidator = _localVariable_0;
      if (scopeValidator != null)
      {
         return new Object[] { scopeValidator, _this };
      }
      return null;
   }

   public static final Object[] pattern_StoryNodeActionBuilder_0_4_LookupScopeValidator_blackB(ScopeValidator scopeValidator)
   {
      return new Object[] { scopeValidator };
   }

   public static final Object[] pattern_StoryNodeActionBuilder_0_4_LookupScopeValidator_bindingAndBlackFB(StoryNodeActionBuilder _this)
   {
      Object[] result_pattern_StoryNodeActionBuilder_0_4_LookupScopeValidator_binding = pattern_StoryNodeActionBuilder_0_4_LookupScopeValidator_bindingFB(
            _this);
      if (result_pattern_StoryNodeActionBuilder_0_4_LookupScopeValidator_binding != null)
      {
         ScopeValidator scopeValidator = (ScopeValidator) result_pattern_StoryNodeActionBuilder_0_4_LookupScopeValidator_binding[0];

         Object[] result_pattern_StoryNodeActionBuilder_0_4_LookupScopeValidator_black = pattern_StoryNodeActionBuilder_0_4_LookupScopeValidator_blackB(
               scopeValidator);
         if (result_pattern_StoryNodeActionBuilder_0_4_LookupScopeValidator_black != null)
         {

            return new Object[] { scopeValidator, _this };
         }
      }
      return null;
   }

   public static final Iterable<Object[]> pattern_StoryNodeActionBuilder_0_5_ForAllObjectVariables_blackFB(StoryPattern storyPattern)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (ObjectVariable objectVariable : storyPattern.getObjectVariable())
      {
         _result.add(new Object[] { objectVariable, storyPattern });
      }
      return _result;
   }

   public static final void pattern_StoryNodeActionBuilder_0_6_ObjectVariableAnalysis_expressionBBB(ScopeValidator scopeValidator, CFNode node,
         ObjectVariable objectVariable)
   {
      scopeValidator.analyzeObjectVariable(node, objectVariable);

   }

   public static final Iterable<Object[]> pattern_StoryNodeActionBuilder_0_7_ForAllLinkVariables_blackBF(StoryPattern storyPattern)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (LinkVariable linkVariable : storyPattern.getLinkVariable())
      {
         _result.add(new Object[] { storyPattern, linkVariable });
      }
      return _result;
   }

   public static final void pattern_StoryNodeActionBuilder_0_8_LinkVariableAnalysis_expressionBBB(ScopeValidator scopeValidator, CFNode node,
         LinkVariable linkVariable)
   {
      scopeValidator.analyzeLinkVariable(node, linkVariable);

   }

   public static final Object[] pattern_StoryNodeActionBuilder_0_9_IsForEachActionBuilder_bindingFB(CFNode node)
   {
      CFNode tmpForEachNode = node;
      if (tmpForEachNode instanceof ForEach)
      {
         ForEach forEachNode = (ForEach) tmpForEachNode;
         return new Object[] { forEachNode, node };
      }
      return null;
   }

   public static final Object[] pattern_StoryNodeActionBuilder_0_9_IsForEachActionBuilder_blackBB(StoryNodeActionBuilder _this, ForEach forEachNode)
   {
      boolean this_requiresForEach = _this.isRequiresForEach();
      if (Boolean.valueOf(this_requiresForEach).equals(Boolean.valueOf(true)))
      {
         return new Object[] { _this, forEachNode };
      }

      return null;
   }

   public static final Object[] pattern_StoryNodeActionBuilder_0_9_IsForEachActionBuilder_bindingAndBlackBFB(StoryNodeActionBuilder _this, CFNode node)
   {
      Object[] result_pattern_StoryNodeActionBuilder_0_9_IsForEachActionBuilder_binding = pattern_StoryNodeActionBuilder_0_9_IsForEachActionBuilder_bindingFB(
            node);
      if (result_pattern_StoryNodeActionBuilder_0_9_IsForEachActionBuilder_binding != null)
      {
         ForEach forEachNode = (ForEach) result_pattern_StoryNodeActionBuilder_0_9_IsForEachActionBuilder_binding[0];

         Object[] result_pattern_StoryNodeActionBuilder_0_9_IsForEachActionBuilder_black = pattern_StoryNodeActionBuilder_0_9_IsForEachActionBuilder_blackBB(
               _this, forEachNode);
         if (result_pattern_StoryNodeActionBuilder_0_9_IsForEachActionBuilder_black != null)
         {

            return new Object[] { _this, forEachNode, node };
         }
      }
      return null;
   }

   public static final Object[] pattern_StoryNodeActionBuilder_0_10_MainActionInForEachNode_blackBF(ForEach forEachNode)
   {
      Action mainAction = forEachNode.getMainAction();
      if (mainAction != null)
      {
         return new Object[] { forEachNode, mainAction };
      }

      return null;
   }

   public static final Object[] pattern_StoryNodeActionBuilder_0_11_EmptyForEachNodeError_blackBFB(ScopeValidator scopeValidator, StoryNode storyNode)
   {
      ValidationReport report = scopeValidator.getValidationReport();
      if (report != null)
      {
         return new Object[] { scopeValidator, report, storyNode };
      }

      return null;
   }

   public static final Object[] pattern_StoryNodeActionBuilder_0_11_EmptyForEachNodeError_greenBFBB(ValidationReport report, StoryNode storyNode,
         ScopeValidator scopeValidator)
   {
      ErrorMessage emptyForEachNode = ResultFactory.eINSTANCE.createErrorMessage();
      Severity emptyForEachNode_severity_prime = Severity.ERROR;
      String _localVariable_0 = scopeValidator.lookupErrorMessage(Errors.EMPTY_FOREACH_NODE);
      report.getErrorMessages().add(emptyForEachNode);
      emptyForEachNode.getLocation().add(storyNode);
      emptyForEachNode.setSeverity(emptyForEachNode_severity_prime);
      String emptyForEachNode_id_prime = _localVariable_0;
      emptyForEachNode.setId(emptyForEachNode_id_prime);
      return new Object[] { report, emptyForEachNode, storyNode, scopeValidator };
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //StoryNodeActionBuilderImpl
