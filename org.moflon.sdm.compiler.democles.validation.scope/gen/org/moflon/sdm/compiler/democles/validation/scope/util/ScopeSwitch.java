/**
 */
package org.moflon.sdm.compiler.democles.validation.scope.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.moflon.sdm.compiler.democles.validation.scope.*;

import org.moflon.sdm.runtime.democles.UniformNoOperationVisitor;
import org.moflon.sdm.runtime.democles.Visitor;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage
 * @generated
 */
public class ScopeSwitch<T> extends Switch<T>
{
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static ScopePackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ScopeSwitch()
   {
      if (modelPackage == null)
      {
         modelPackage = ScopePackage.eINSTANCE;
      }
   }

   /**
    * Checks whether this is a switch for the given package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param ePackage the package in question.
    * @return whether this is a switch for the given package.
    * @generated
    */
   @Override
   protected boolean isSwitchFor(EPackage ePackage)
   {
      return ePackage == modelPackage;
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   @Override
   protected T doSwitch(int classifierID, EObject theEObject)
   {
      switch (classifierID)
      {
      case ScopePackage.BINDING_EXPRESSION_BUILDER:
      {
         BindingExpressionBuilder bindingExpressionBuilder = (BindingExpressionBuilder) theEObject;
         T result = caseBindingExpressionBuilder(bindingExpressionBuilder);
         if (result == null)
            result = caseRegularPatternInvocationBuilder(bindingExpressionBuilder);
         if (result == null)
            result = casePatternInvocationBuilder(bindingExpressionBuilder);
         if (result == null)
            result = caseActionBuilder(bindingExpressionBuilder);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ScopePackage.RED_NODE_DELETION_BUILDER:
      {
         RedNodeDeletionBuilder redNodeDeletionBuilder = (RedNodeDeletionBuilder) theEObject;
         T result = caseRedNodeDeletionBuilder(redNodeDeletionBuilder);
         if (result == null)
            result = caseActionBuilder(redNodeDeletionBuilder);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ScopePackage.NAC_PATTERN_BUILDER:
      {
         NacPatternBuilder nacPatternBuilder = (NacPatternBuilder) theEObject;
         T result = caseNacPatternBuilder(nacPatternBuilder);
         if (result == null)
            result = caseRegularPatternInvocationBuilder(nacPatternBuilder);
         if (result == null)
            result = casePatternInvocationBuilder(nacPatternBuilder);
         if (result == null)
            result = caseActionBuilder(nacPatternBuilder);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ScopePackage.RED_PATTERN_BUILDER:
      {
         RedPatternBuilder redPatternBuilder = (RedPatternBuilder) theEObject;
         T result = caseRedPatternBuilder(redPatternBuilder);
         if (result == null)
            result = caseRegularPatternInvocationBuilder(redPatternBuilder);
         if (result == null)
            result = casePatternInvocationBuilder(redPatternBuilder);
         if (result == null)
            result = caseActionBuilder(redPatternBuilder);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ScopePackage.BINDING_AND_BLACK_PATTERN_BUILDER:
      {
         BindingAndBlackPatternBuilder bindingAndBlackPatternBuilder = (BindingAndBlackPatternBuilder) theEObject;
         T result = caseBindingAndBlackPatternBuilder(bindingAndBlackPatternBuilder);
         if (result == null)
            result = caseCompoundPatternInvocationBuilder(bindingAndBlackPatternBuilder);
         if (result == null)
            result = caseRegularPatternInvocationBuilder(bindingAndBlackPatternBuilder);
         if (result == null)
            result = casePatternInvocationBuilder(bindingAndBlackPatternBuilder);
         if (result == null)
            result = caseActionBuilder(bindingAndBlackPatternBuilder);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ScopePackage.BLACK_PATTERN_BUILDER:
      {
         BlackPatternBuilder blackPatternBuilder = (BlackPatternBuilder) theEObject;
         T result = caseBlackPatternBuilder(blackPatternBuilder);
         if (result == null)
            result = caseCompoundPatternInvocationBuilder(blackPatternBuilder);
         if (result == null)
            result = caseRegularPatternInvocationBuilder(blackPatternBuilder);
         if (result == null)
            result = casePatternInvocationBuilder(blackPatternBuilder);
         if (result == null)
            result = caseActionBuilder(blackPatternBuilder);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ScopePackage.ACTION_BUILDER:
      {
         ActionBuilder actionBuilder = (ActionBuilder) theEObject;
         T result = caseActionBuilder(actionBuilder);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ScopePackage.SCOPE_VALIDATOR:
      {
         ScopeValidator scopeValidator = (ScopeValidator) theEObject;
         T result = caseScopeValidator(scopeValidator);
         if (result == null)
            result = caseUniformNoOperationVisitor(scopeValidator);
         if (result == null)
            result = caseVisitor(scopeValidator);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ScopePackage.COMPOUND_PATTERN_INVOCATION_BUILDER:
      {
         CompoundPatternInvocationBuilder compoundPatternInvocationBuilder = (CompoundPatternInvocationBuilder) theEObject;
         T result = caseCompoundPatternInvocationBuilder(compoundPatternInvocationBuilder);
         if (result == null)
            result = caseRegularPatternInvocationBuilder(compoundPatternInvocationBuilder);
         if (result == null)
            result = casePatternInvocationBuilder(compoundPatternInvocationBuilder);
         if (result == null)
            result = caseActionBuilder(compoundPatternInvocationBuilder);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ScopePackage.REGULAR_PATTERN_INVOCATION_BUILDER:
      {
         RegularPatternInvocationBuilder regularPatternInvocationBuilder = (RegularPatternInvocationBuilder) theEObject;
         T result = caseRegularPatternInvocationBuilder(regularPatternInvocationBuilder);
         if (result == null)
            result = casePatternInvocationBuilder(regularPatternInvocationBuilder);
         if (result == null)
            result = caseActionBuilder(regularPatternInvocationBuilder);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ScopePackage.PATTERN_MATCHER:
      {
         PatternMatcher patternMatcher = (PatternMatcher) theEObject;
         T result = casePatternMatcher(patternMatcher);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ScopePackage.SINGLE_RESULT_PATTERN_INVOCATION_BUILDER:
      {
         SingleResultPatternInvocationBuilder singleResultPatternInvocationBuilder = (SingleResultPatternInvocationBuilder) theEObject;
         T result = caseSingleResultPatternInvocationBuilder(singleResultPatternInvocationBuilder);
         if (result == null)
            result = casePatternInvocationBuilder(singleResultPatternInvocationBuilder);
         if (result == null)
            result = caseActionBuilder(singleResultPatternInvocationBuilder);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ScopePackage.PATTERN_INVOCATION_BUILDER:
      {
         PatternInvocationBuilder patternInvocationBuilder = (PatternInvocationBuilder) theEObject;
         T result = casePatternInvocationBuilder(patternInvocationBuilder);
         if (result == null)
            result = caseActionBuilder(patternInvocationBuilder);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ScopePackage.STORY_NODE_ACTION_BUILDER:
      {
         StoryNodeActionBuilder storyNodeActionBuilder = (StoryNodeActionBuilder) theEObject;
         T result = caseStoryNodeActionBuilder(storyNodeActionBuilder);
         if (result == null)
            result = caseCompoundActionBuilder(storyNodeActionBuilder);
         if (result == null)
            result = caseActionBuilder(storyNodeActionBuilder);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ScopePackage.COMPOUND_ACTION_BUILDER:
      {
         CompoundActionBuilder compoundActionBuilder = (CompoundActionBuilder) theEObject;
         T result = caseCompoundActionBuilder(compoundActionBuilder);
         if (result == null)
            result = caseActionBuilder(compoundActionBuilder);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ScopePackage.GREEN_PATTERN_BUILDER:
      {
         GreenPatternBuilder greenPatternBuilder = (GreenPatternBuilder) theEObject;
         T result = caseGreenPatternBuilder(greenPatternBuilder);
         if (result == null)
            result = caseRegularPatternInvocationBuilder(greenPatternBuilder);
         if (result == null)
            result = casePatternInvocationBuilder(greenPatternBuilder);
         if (result == null)
            result = caseActionBuilder(greenPatternBuilder);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ScopePackage.EXPRESSION_EXPLORER:
      {
         ExpressionExplorer expressionExplorer = (ExpressionExplorer) theEObject;
         T result = caseExpressionExplorer(expressionExplorer);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      default:
         return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Binding Expression Builder</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Binding Expression Builder</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseBindingExpressionBuilder(BindingExpressionBuilder object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Red Node Deletion Builder</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Red Node Deletion Builder</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseRedNodeDeletionBuilder(RedNodeDeletionBuilder object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Nac Pattern Builder</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Nac Pattern Builder</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseNacPatternBuilder(NacPatternBuilder object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Red Pattern Builder</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Red Pattern Builder</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseRedPatternBuilder(RedPatternBuilder object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Binding And Black Pattern Builder</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Binding And Black Pattern Builder</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseBindingAndBlackPatternBuilder(BindingAndBlackPatternBuilder object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Black Pattern Builder</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Black Pattern Builder</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseBlackPatternBuilder(BlackPatternBuilder object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Action Builder</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Action Builder</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseActionBuilder(ActionBuilder object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Validator</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Validator</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseScopeValidator(ScopeValidator object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Compound Pattern Invocation Builder</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Compound Pattern Invocation Builder</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseCompoundPatternInvocationBuilder(CompoundPatternInvocationBuilder object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Regular Pattern Invocation Builder</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Regular Pattern Invocation Builder</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseRegularPatternInvocationBuilder(RegularPatternInvocationBuilder object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Pattern Matcher</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Pattern Matcher</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casePatternMatcher(PatternMatcher object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Single Result Pattern Invocation Builder</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Single Result Pattern Invocation Builder</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseSingleResultPatternInvocationBuilder(SingleResultPatternInvocationBuilder object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Pattern Invocation Builder</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Pattern Invocation Builder</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casePatternInvocationBuilder(PatternInvocationBuilder object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Story Node Action Builder</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Story Node Action Builder</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseStoryNodeActionBuilder(StoryNodeActionBuilder object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Compound Action Builder</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Compound Action Builder</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseCompoundActionBuilder(CompoundActionBuilder object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Green Pattern Builder</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Green Pattern Builder</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseGreenPatternBuilder(GreenPatternBuilder object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Expression Explorer</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Expression Explorer</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseExpressionExplorer(ExpressionExplorer object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Visitor</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Visitor</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseVisitor(Visitor object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Uniform No Operation Visitor</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Uniform No Operation Visitor</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseUniformNoOperationVisitor(UniformNoOperationVisitor object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch, but this is the last case anyway.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject)
    * @generated
    */
   @Override
   public T defaultCase(EObject object)
   {
      return null;
   }

} //ScopeSwitch
