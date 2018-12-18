/**
 */
package org.moflon.sdm.compiler.democles.validation.scope.impl;

import SDMLanguage.patterns.ObjectVariable;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.CompoundActionBuilder;
import org.moflon.sdm.compiler.democles.validation.scope.ScopePackage;
import org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator;

import org.moflon.sdm.runtime.democles.Action;
import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.CFVariable;
import org.moflon.sdm.runtime.democles.DemoclesFactory;
import org.moflon.sdm.runtime.democles.Scope;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Builder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.impl.ActionBuilderImpl#getValidator <em>Validator</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.impl.ActionBuilderImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.impl.ActionBuilderImpl#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActionBuilderImpl extends EObjectImpl implements ActionBuilder
{
   /**
    * The cached value of the '{@link #getResult() <em>Result</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getResult()
    * @generated
    * @ordered
    */
   protected Action result;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ActionBuilderImpl()
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
      return ScopePackage.Literals.ACTION_BUILDER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ScopeValidator getValidator()
   {
      if (eContainerFeatureID() != ScopePackage.ACTION_BUILDER__VALIDATOR)
         return null;
      return (ScopeValidator) eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetValidator(ScopeValidator newValidator, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newValidator, ScopePackage.ACTION_BUILDER__VALIDATOR, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setValidator(ScopeValidator newValidator)
   {
      if (newValidator != eInternalContainer() || (eContainerFeatureID() != ScopePackage.ACTION_BUILDER__VALIDATOR && newValidator != null))
      {
         if (EcoreUtil.isAncestor(this, newValidator))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newValidator != null)
            msgs = ((InternalEObject) newValidator).eInverseAdd(this, ScopePackage.SCOPE_VALIDATOR__ACTION_BUILDERS, ScopeValidator.class, msgs);
         msgs = basicSetValidator(newValidator, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ScopePackage.ACTION_BUILDER__VALIDATOR, newValidator, newValidator));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CompoundActionBuilder getParent()
   {
      if (eContainerFeatureID() != ScopePackage.ACTION_BUILDER__PARENT)
         return null;
      return (CompoundActionBuilder) eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetParent(CompoundActionBuilder newParent, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newParent, ScopePackage.ACTION_BUILDER__PARENT, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setParent(CompoundActionBuilder newParent)
   {
      if (newParent != eInternalContainer() || (eContainerFeatureID() != ScopePackage.ACTION_BUILDER__PARENT && newParent != null))
      {
         if (EcoreUtil.isAncestor(this, newParent))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newParent != null)
            msgs = ((InternalEObject) newParent).eInverseAdd(this, ScopePackage.COMPOUND_ACTION_BUILDER__CHILDREN, CompoundActionBuilder.class, msgs);
         msgs = basicSetParent(newParent, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ScopePackage.ACTION_BUILDER__PARENT, newParent, newParent));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Action getResult()
   {
      if (result != null && result.eIsProxy())
      {
         InternalEObject oldResult = (InternalEObject) result;
         result = (Action) eResolveProxy(oldResult);
         if (result != oldResult)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScopePackage.ACTION_BUILDER__RESULT, oldResult, result));
         }
      }
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Action basicGetResult()
   {
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setResult(Action newResult)
   {
      Action oldResult = result;
      result = newResult;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ScopePackage.ACTION_BUILDER__RESULT, oldResult, result));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void addAction(CFNode node, Action newAction)
   {// 
      Object[] result1_black = ActionBuilderImpl.pattern_ActionBuilder_0_1_ExistsAction_blackBF(node);
      if (result1_black != null)
      {
         //nothing Action action = (Action) result1_black[1];

         Object[] result2_black = ActionBuilderImpl.pattern_ActionBuilder_0_2_AppendAction_blackBFB(node, newAction);
         if (result2_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[node] = " + node + ", " + "[newAction] = " + newAction + ".");
         }
         Action lastAction = (Action) result2_black[1];
         ActionBuilderImpl.pattern_ActionBuilder_0_2_AppendAction_greenBBB(node, lastAction, newAction);

         return;
      } else
      {

         Object[] result4_black = ActionBuilderImpl.pattern_ActionBuilder_0_4_AddAsFirstAction_blackBB(node, newAction);
         if (result4_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[node] = " + node + ", " + "[newAction] = " + newAction + ".");
         }
         ActionBuilderImpl.pattern_ActionBuilder_0_4_AddAsFirstAction_greenBB(node, newAction);

         return;
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void buildAction(CFNode node)
   {
      // [user code injected with eMoflon]

      // TODO: implement this method here but do not remove the injection marker 
      throw new UnsupportedOperationException();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Action lookupAction(CFNode node)
   {
      // [user code injected with eMoflon]

      // TODO: implement this method here but do not remove the injection marker 
      throw new UnsupportedOperationException();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CFVariable lookupControlFlowVariable(Action action, String variableName, EClassifier variableType)
   {

      Object[] result1_bindingAndBlack = ActionBuilderImpl.pattern_ActionBuilder_3_1_LookupControlFlowNode_bindingAndBlackBFBF(action, this);
      if (result1_bindingAndBlack == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[action] = " + action + ", " + "[this] = " + this + ".");
      }
      CFNode node = (CFNode) result1_bindingAndBlack[1];
      ScopeValidator scopeValidator = (ScopeValidator) result1_bindingAndBlack[3];
      // 
      if (ActionBuilderImpl.pattern_ActionBuilder_3_2_IsNull_expressionFBBB(scopeValidator, node, variableName))
      {

         Object[] result3_bindingAndBlack = ActionBuilderImpl.pattern_ActionBuilder_3_3_CreateNewControlFlowVariable_bindingAndBlackFBBB(variableType, action,
               node);
         if (result3_bindingAndBlack == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[variableType] = " + variableType + ", " + "[action] = " + action + ", "
                  + "[node] = " + node + ".");
         }
         Scope scope = (Scope) result3_bindingAndBlack[0];
         Object[] result3_green = ActionBuilderImpl.pattern_ActionBuilder_3_3_CreateNewControlFlowVariable_greenBBFBB(scope, variableType, action,
               variableName);
         CFVariable newVariable = (CFVariable) result3_green[2];

         return ActionBuilderImpl.pattern_ActionBuilder_3_4_expressionFB(newVariable);
      } else
      {

         Object[] result5_bindingAndBlack = ActionBuilderImpl.pattern_ActionBuilder_3_5_LookupControlFlowVariableInScope_bindingAndBlackFBBB(scopeValidator,
               node, variableName);
         if (result5_bindingAndBlack == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[scopeValidator] = " + scopeValidator + ", " + "[node] = " + node + ", "
                  + "[variableName] = " + variableName + ".");
         }
         CFVariable variable = (CFVariable) result5_bindingAndBlack[0];
         return ActionBuilderImpl.pattern_ActionBuilder_3_6_expressionFB(variable);
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ScopeValidator lookupScopeValidator()
   {// 
      Object[] result1_black = ActionBuilderImpl.pattern_ActionBuilder_4_1_HasParentActionBuilder_blackFB(this);
      if (result1_black != null)
      {
         CompoundActionBuilder parentBuilder = (CompoundActionBuilder) result1_black[0];

         Object[] result2_bindingAndBlack = ActionBuilderImpl.pattern_ActionBuilder_4_2_LookupValidatorInParent_bindingAndBlackFB(parentBuilder);
         if (result2_bindingAndBlack == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[parentBuilder] = " + parentBuilder + ".");
         }
         ScopeValidator parentValidator = (ScopeValidator) result2_bindingAndBlack[0];
         return ActionBuilderImpl.pattern_ActionBuilder_4_3_expressionFB(parentValidator);
      } else
      {

         Object[] result4_black = ActionBuilderImpl.pattern_ActionBuilder_4_4_LookupScopeValidator_blackBF(this);
         if (result4_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
         }
         ScopeValidator validator = (ScopeValidator) result4_black[1];
         return ActionBuilderImpl.pattern_ActionBuilder_4_5_expressionFB(validator);
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void validateVariable(Action action, CFVariable variable, ObjectVariable objectVariable)
   {// 
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
      case ScopePackage.ACTION_BUILDER__VALIDATOR:
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         return basicSetValidator((ScopeValidator) otherEnd, msgs);
      case ScopePackage.ACTION_BUILDER__PARENT:
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         return basicSetParent((CompoundActionBuilder) otherEnd, msgs);
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
      case ScopePackage.ACTION_BUILDER__VALIDATOR:
         return basicSetValidator(null, msgs);
      case ScopePackage.ACTION_BUILDER__PARENT:
         return basicSetParent(null, msgs);
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
      case ScopePackage.ACTION_BUILDER__VALIDATOR:
         return eInternalContainer().eInverseRemove(this, ScopePackage.SCOPE_VALIDATOR__ACTION_BUILDERS, ScopeValidator.class, msgs);
      case ScopePackage.ACTION_BUILDER__PARENT:
         return eInternalContainer().eInverseRemove(this, ScopePackage.COMPOUND_ACTION_BUILDER__CHILDREN, CompoundActionBuilder.class, msgs);
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
      case ScopePackage.ACTION_BUILDER__VALIDATOR:
         return getValidator();
      case ScopePackage.ACTION_BUILDER__PARENT:
         return getParent();
      case ScopePackage.ACTION_BUILDER__RESULT:
         if (resolve)
            return getResult();
         return basicGetResult();
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
      case ScopePackage.ACTION_BUILDER__VALIDATOR:
         setValidator((ScopeValidator) newValue);
         return;
      case ScopePackage.ACTION_BUILDER__PARENT:
         setParent((CompoundActionBuilder) newValue);
         return;
      case ScopePackage.ACTION_BUILDER__RESULT:
         setResult((Action) newValue);
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
      case ScopePackage.ACTION_BUILDER__VALIDATOR:
         setValidator((ScopeValidator) null);
         return;
      case ScopePackage.ACTION_BUILDER__PARENT:
         setParent((CompoundActionBuilder) null);
         return;
      case ScopePackage.ACTION_BUILDER__RESULT:
         setResult((Action) null);
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
      case ScopePackage.ACTION_BUILDER__VALIDATOR:
         return getValidator() != null;
      case ScopePackage.ACTION_BUILDER__PARENT:
         return getParent() != null;
      case ScopePackage.ACTION_BUILDER__RESULT:
         return result != null;
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
      case ScopePackage.ACTION_BUILDER___ADD_ACTION__CFNODE_ACTION:
         addAction((CFNode) arguments.get(0), (Action) arguments.get(1));
         return null;
      case ScopePackage.ACTION_BUILDER___BUILD_ACTION__CFNODE:
         buildAction((CFNode) arguments.get(0));
         return null;
      case ScopePackage.ACTION_BUILDER___LOOKUP_ACTION__CFNODE:
         return lookupAction((CFNode) arguments.get(0));
      case ScopePackage.ACTION_BUILDER___LOOKUP_CONTROL_FLOW_VARIABLE__ACTION_STRING_ECLASSIFIER:
         return lookupControlFlowVariable((Action) arguments.get(0), (String) arguments.get(1), (EClassifier) arguments.get(2));
      case ScopePackage.ACTION_BUILDER___LOOKUP_SCOPE_VALIDATOR:
         return lookupScopeValidator();
      case ScopePackage.ACTION_BUILDER___VALIDATE_VARIABLE__ACTION_CFVARIABLE_OBJECTVARIABLE:
         validateVariable((Action) arguments.get(0), (CFVariable) arguments.get(1), (ObjectVariable) arguments.get(2));
         return null;
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_ActionBuilder_0_1_ExistsAction_blackBF(CFNode node)
   {
      for (Action action : node.getActions())
      {
         return new Object[] { node, action };
      }
      return null;
   }

   public static final Object[] pattern_ActionBuilder_0_2_AppendAction_black_nac_0BB(Action lastAction, Action newAction)
   {
      if (!lastAction.equals(newAction))
      {
         Action nextAction = lastAction.getNext();
         if (nextAction != null)
         {
            if (!lastAction.equals(nextAction))
            {
               if (!newAction.equals(nextAction))
               {
                  return new Object[] { lastAction, newAction };
               }
            }
         }

      }
      return null;
   }

   public static final Object[] pattern_ActionBuilder_0_2_AppendAction_blackBFB(CFNode node, Action newAction)
   {
      for (Action lastAction : node.getActions())
      {
         if (!lastAction.equals(newAction))
         {
            if (pattern_ActionBuilder_0_2_AppendAction_black_nac_0BB(lastAction, newAction) == null)
            {
               return new Object[] { node, lastAction, newAction };
            }
         }
      }
      return null;
   }

   public static final Object[] pattern_ActionBuilder_0_2_AppendAction_greenBBB(CFNode node, Action lastAction, Action newAction)
   {
      node.getActions().add(newAction);
      newAction.setPrev(lastAction);
      return new Object[] { node, lastAction, newAction };
   }

   public static final Object[] pattern_ActionBuilder_0_4_AddAsFirstAction_blackBB(CFNode node, Action newAction)
   {
      return new Object[] { node, newAction };
   }

   public static final Object[] pattern_ActionBuilder_0_4_AddAsFirstAction_greenBB(CFNode node, Action newAction)
   {
      node.getActions().add(newAction);
      return new Object[] { node, newAction };
   }

   public static final Object[] pattern_ActionBuilder_3_1_LookupControlFlowNode_bindingFB(ActionBuilder _this)
   {
      ScopeValidator _localVariable_0 = _this.lookupScopeValidator();
      ScopeValidator scopeValidator = _localVariable_0;
      if (scopeValidator != null)
      {
         return new Object[] { scopeValidator, _this };
      }
      return null;
   }

   public static final Object[] pattern_ActionBuilder_3_1_LookupControlFlowNode_blackBFBB(Action action, ActionBuilder _this, ScopeValidator scopeValidator)
   {
      CFNode node = action.getCfNode();
      if (node != null)
      {
         return new Object[] { action, node, _this, scopeValidator };
      }

      return null;
   }

   public static final Object[] pattern_ActionBuilder_3_1_LookupControlFlowNode_bindingAndBlackBFBF(Action action, ActionBuilder _this)
   {
      Object[] result_pattern_ActionBuilder_3_1_LookupControlFlowNode_binding = pattern_ActionBuilder_3_1_LookupControlFlowNode_bindingFB(_this);
      if (result_pattern_ActionBuilder_3_1_LookupControlFlowNode_binding != null)
      {
         ScopeValidator scopeValidator = (ScopeValidator) result_pattern_ActionBuilder_3_1_LookupControlFlowNode_binding[0];

         Object[] result_pattern_ActionBuilder_3_1_LookupControlFlowNode_black = pattern_ActionBuilder_3_1_LookupControlFlowNode_blackBFBB(action, _this,
               scopeValidator);
         if (result_pattern_ActionBuilder_3_1_LookupControlFlowNode_black != null)
         {
            CFNode node = (CFNode) result_pattern_ActionBuilder_3_1_LookupControlFlowNode_black[1];

            return new Object[] { action, node, _this, scopeValidator };
         }
      }
      return null;
   }

   public static final boolean pattern_ActionBuilder_3_2_IsNull_expressionFBBB(ScopeValidator scopeValidator, CFNode node, String variableName)
   {
      CFVariable _localVariable_1 = scopeValidator.lookupControlFlowVariable(node, variableName);
      boolean _localVariable_0 = scopeValidator.isNull(_localVariable_1);
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final Object[] pattern_ActionBuilder_3_3_CreateNewControlFlowVariable_bindingFB(CFNode node)
   {
      Scope _localVariable_2 = node.getRelevantScope();
      Scope scope = _localVariable_2;
      if (scope != null)
      {
         return new Object[] { scope, node };
      }
      return null;
   }

   public static final Object[] pattern_ActionBuilder_3_3_CreateNewControlFlowVariable_blackBBB(Scope scope, EClassifier variableType, Action action)
   {
      return new Object[] { scope, variableType, action };
   }

   public static final Object[] pattern_ActionBuilder_3_3_CreateNewControlFlowVariable_bindingAndBlackFBBB(EClassifier variableType, Action action, CFNode node)
   {
      Object[] result_pattern_ActionBuilder_3_3_CreateNewControlFlowVariable_binding = pattern_ActionBuilder_3_3_CreateNewControlFlowVariable_bindingFB(node);
      if (result_pattern_ActionBuilder_3_3_CreateNewControlFlowVariable_binding != null)
      {
         Scope scope = (Scope) result_pattern_ActionBuilder_3_3_CreateNewControlFlowVariable_binding[0];

         Object[] result_pattern_ActionBuilder_3_3_CreateNewControlFlowVariable_black = pattern_ActionBuilder_3_3_CreateNewControlFlowVariable_blackBBB(scope,
               variableType, action);
         if (result_pattern_ActionBuilder_3_3_CreateNewControlFlowVariable_black != null)
         {

            return new Object[] { scope, variableType, action, node };
         }
      }
      return null;
   }

   public static final Object[] pattern_ActionBuilder_3_3_CreateNewControlFlowVariable_greenBBFBB(Scope scope, EClassifier variableType, Action action,
         String variableName)
   {
      CFVariable newVariable = DemoclesFactory.eINSTANCE.createCFVariable();
      String newVariable_name_prime = variableName;
      boolean newVariable_local_prime = Boolean.valueOf(false);
      scope.getVariables().add(newVariable);
      newVariable.setType(variableType);
      newVariable.setConstructor(action);
      newVariable.setName(newVariable_name_prime);
      newVariable.setLocal(Boolean.valueOf(newVariable_local_prime));
      return new Object[] { scope, variableType, newVariable, action, variableName };
   }

   public static final CFVariable pattern_ActionBuilder_3_4_expressionFB(CFVariable newVariable)
   {
      CFVariable _result = newVariable;
      return _result;
   }

   public static final Object[] pattern_ActionBuilder_3_5_LookupControlFlowVariableInScope_bindingFBBB(ScopeValidator scopeValidator, CFNode node,
         String variableName)
   {
      CFVariable _localVariable_0 = scopeValidator.lookupControlFlowVariable(node, variableName);
      CFVariable variable = _localVariable_0;
      if (variable != null)
      {
         return new Object[] { variable, scopeValidator, node, variableName };
      }
      return null;
   }

   public static final Object[] pattern_ActionBuilder_3_5_LookupControlFlowVariableInScope_blackB(CFVariable variable)
   {
      return new Object[] { variable };
   }

   public static final Object[] pattern_ActionBuilder_3_5_LookupControlFlowVariableInScope_bindingAndBlackFBBB(ScopeValidator scopeValidator, CFNode node,
         String variableName)
   {
      Object[] result_pattern_ActionBuilder_3_5_LookupControlFlowVariableInScope_binding = pattern_ActionBuilder_3_5_LookupControlFlowVariableInScope_bindingFBBB(
            scopeValidator, node, variableName);
      if (result_pattern_ActionBuilder_3_5_LookupControlFlowVariableInScope_binding != null)
      {
         CFVariable variable = (CFVariable) result_pattern_ActionBuilder_3_5_LookupControlFlowVariableInScope_binding[0];

         Object[] result_pattern_ActionBuilder_3_5_LookupControlFlowVariableInScope_black = pattern_ActionBuilder_3_5_LookupControlFlowVariableInScope_blackB(
               variable);
         if (result_pattern_ActionBuilder_3_5_LookupControlFlowVariableInScope_black != null)
         {

            return new Object[] { variable, scopeValidator, node, variableName };
         }
      }
      return null;
   }

   public static final CFVariable pattern_ActionBuilder_3_6_expressionFB(CFVariable variable)
   {
      CFVariable _result = variable;
      return _result;
   }

   public static final Object[] pattern_ActionBuilder_4_1_HasParentActionBuilder_blackFB(ActionBuilder _this)
   {
      CompoundActionBuilder parentBuilder = _this.getParent();
      if (parentBuilder != null)
      {
         if (!parentBuilder.equals(_this))
         {
            return new Object[] { parentBuilder, _this };
         }
      }

      return null;
   }

   public static final Object[] pattern_ActionBuilder_4_2_LookupValidatorInParent_bindingFB(CompoundActionBuilder parentBuilder)
   {
      ScopeValidator _localVariable_0 = parentBuilder.lookupScopeValidator();
      ScopeValidator parentValidator = _localVariable_0;
      if (parentValidator != null)
      {
         return new Object[] { parentValidator, parentBuilder };
      }
      return null;
   }

   public static final Object[] pattern_ActionBuilder_4_2_LookupValidatorInParent_blackB(ScopeValidator parentValidator)
   {
      return new Object[] { parentValidator };
   }

   public static final Object[] pattern_ActionBuilder_4_2_LookupValidatorInParent_bindingAndBlackFB(CompoundActionBuilder parentBuilder)
   {
      Object[] result_pattern_ActionBuilder_4_2_LookupValidatorInParent_binding = pattern_ActionBuilder_4_2_LookupValidatorInParent_bindingFB(parentBuilder);
      if (result_pattern_ActionBuilder_4_2_LookupValidatorInParent_binding != null)
      {
         ScopeValidator parentValidator = (ScopeValidator) result_pattern_ActionBuilder_4_2_LookupValidatorInParent_binding[0];

         Object[] result_pattern_ActionBuilder_4_2_LookupValidatorInParent_black = pattern_ActionBuilder_4_2_LookupValidatorInParent_blackB(parentValidator);
         if (result_pattern_ActionBuilder_4_2_LookupValidatorInParent_black != null)
         {

            return new Object[] { parentValidator, parentBuilder };
         }
      }
      return null;
   }

   public static final ScopeValidator pattern_ActionBuilder_4_3_expressionFB(ScopeValidator parentValidator)
   {
      ScopeValidator _result = parentValidator;
      return _result;
   }

   public static final Object[] pattern_ActionBuilder_4_4_LookupScopeValidator_blackBF(ActionBuilder _this)
   {
      ScopeValidator validator = _this.getValidator();
      if (validator != null)
      {
         return new Object[] { _this, validator };
      }

      return null;
   }

   public static final ScopeValidator pattern_ActionBuilder_4_5_expressionFB(ScopeValidator validator)
   {
      ScopeValidator _result = validator;
      return _result;
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //ActionBuilderImpl
