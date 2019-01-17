/**
 */
package org.moflon.tie.gt.controlflow.democles.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import org.moflon.tie.gt.controlflow.democles.*;

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
 * @see org.moflon.tie.gt.controlflow.democles.DemoclesPackage
 * @generated
 */
public class DemoclesSwitch<T> extends Switch<T>
{
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static DemoclesPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DemoclesSwitch()
   {
      if (modelPackage == null)
      {
         modelPackage = DemoclesPackage.eINSTANCE;
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
      case DemoclesPackage.CONTINUE_STATEMENT:
      {
         ContinueStatement continueStatement = (ContinueStatement) theEObject;
         T result = caseContinueStatement(continueStatement);
         if (result == null)
            result = caseCFNode(continueStatement);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case DemoclesPackage.REPETITION_NODE:
      {
         RepetitionNode repetitionNode = (RepetitionNode) theEObject;
         T result = caseRepetitionNode(repetitionNode);
         if (result == null)
            result = caseCompoundNode(repetitionNode);
         if (result == null)
            result = caseCFNode(repetitionNode);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case DemoclesPackage.LOOP:
      {
         Loop loop = (Loop) theEObject;
         T result = caseLoop(loop);
         if (result == null)
            result = caseRepetitionNode(loop);
         if (result == null)
            result = caseCompoundNode(loop);
         if (result == null)
            result = caseCFNode(loop);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case DemoclesPackage.RETURN_STATEMENT:
      {
         ReturnStatement returnStatement = (ReturnStatement) theEObject;
         T result = caseReturnStatement(returnStatement);
         if (result == null)
            result = caseCFNode(returnStatement);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case DemoclesPackage.HEAD_CONTROLLED_LOOP:
      {
         HeadControlledLoop headControlledLoop = (HeadControlledLoop) theEObject;
         T result = caseHeadControlledLoop(headControlledLoop);
         if (result == null)
            result = caseLoop(headControlledLoop);
         if (result == null)
            result = caseRepetitionNode(headControlledLoop);
         if (result == null)
            result = caseCompoundNode(headControlledLoop);
         if (result == null)
            result = caseCFNode(headControlledLoop);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case DemoclesPackage.TAIL_CONTROLLED_LOOP:
      {
         TailControlledLoop tailControlledLoop = (TailControlledLoop) theEObject;
         T result = caseTailControlledLoop(tailControlledLoop);
         if (result == null)
            result = caseLoop(tailControlledLoop);
         if (result == null)
            result = caseRepetitionNode(tailControlledLoop);
         if (result == null)
            result = caseCompoundNode(tailControlledLoop);
         if (result == null)
            result = caseCFNode(tailControlledLoop);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case DemoclesPackage.FOR_EACH:
      {
         ForEach forEach = (ForEach) theEObject;
         T result = caseForEach(forEach);
         if (result == null)
            result = caseRepetitionNode(forEach);
         if (result == null)
            result = caseCompoundNode(forEach);
         if (result == null)
            result = caseCFNode(forEach);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case DemoclesPackage.COMPOUND_NODE:
      {
         CompoundNode compoundNode = (CompoundNode) theEObject;
         T result = caseCompoundNode(compoundNode);
         if (result == null)
            result = caseCFNode(compoundNode);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case DemoclesPackage.REGULAR_PATTERN_INVOCATION:
      {
         RegularPatternInvocation regularPatternInvocation = (RegularPatternInvocation) theEObject;
         T result = caseRegularPatternInvocation(regularPatternInvocation);
         if (result == null)
            result = casePatternInvocation(regularPatternInvocation);
         if (result == null)
            result = caseAction(regularPatternInvocation);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case DemoclesPackage.CF_VARIABLE:
      {
         CFVariable cfVariable = (CFVariable) theEObject;
         T result = caseCFVariable(cfVariable);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case DemoclesPackage.CF_NODE:
      {
         CFNode cfNode = (CFNode) theEObject;
         T result = caseCFNode(cfNode);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case DemoclesPackage.BINDING_PATTERN_INVOCATION:
      {
         BindingPatternInvocation bindingPatternInvocation = (BindingPatternInvocation) theEObject;
         T result = caseBindingPatternInvocation(bindingPatternInvocation);
         if (result == null)
            result = caseRegularPatternInvocation(bindingPatternInvocation);
         if (result == null)
            result = casePatternInvocation(bindingPatternInvocation);
         if (result == null)
            result = caseAction(bindingPatternInvocation);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case DemoclesPackage.SINGLE_RESULT_PATTERN_INVOCATION:
      {
         SingleResultPatternInvocation singleResultPatternInvocation = (SingleResultPatternInvocation) theEObject;
         T result = caseSingleResultPatternInvocation(singleResultPatternInvocation);
         if (result == null)
            result = casePatternInvocation(singleResultPatternInvocation);
         if (result == null)
            result = caseAction(singleResultPatternInvocation);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case DemoclesPackage.SCOPE:
      {
         Scope scope = (Scope) theEObject;
         T result = caseScope(scope);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case DemoclesPackage.ACTION:
      {
         Action action = (Action) theEObject;
         T result = caseAction(action);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR:
      {
         UniformNoOperationVisitor uniformNoOperationVisitor = (UniformNoOperationVisitor) theEObject;
         T result = caseUniformNoOperationVisitor(uniformNoOperationVisitor);
         if (result == null)
            result = caseVisitor(uniformNoOperationVisitor);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case DemoclesPackage.NODE_DELETION:
      {
         NodeDeletion nodeDeletion = (NodeDeletion) theEObject;
         T result = caseNodeDeletion(nodeDeletion);
         if (result == null)
            result = caseAction(nodeDeletion);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case DemoclesPackage.IF_STATEMENT:
      {
         IfStatement ifStatement = (IfStatement) theEObject;
         T result = caseIfStatement(ifStatement);
         if (result == null)
            result = caseCompoundNode(ifStatement);
         if (result == null)
            result = caseCFNode(ifStatement);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case DemoclesPackage.PATTERN_INVOCATION:
      {
         PatternInvocation patternInvocation = (PatternInvocation) theEObject;
         T result = casePatternInvocation(patternInvocation);
         if (result == null)
            result = caseAction(patternInvocation);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case DemoclesPackage.VISITOR:
      {
         Visitor visitor = (Visitor) theEObject;
         T result = caseVisitor(visitor);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case DemoclesPackage.VARIABLE_REFERENCE:
      {
         VariableReference variableReference = (VariableReference) theEObject;
         T result = caseVariableReference(variableReference);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      default:
         return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Continue Statement</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Continue Statement</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseContinueStatement(ContinueStatement object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Repetition Node</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Repetition Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseRepetitionNode(RepetitionNode object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Loop</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Loop</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseLoop(Loop object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Return Statement</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Return Statement</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseReturnStatement(ReturnStatement object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Head Controlled Loop</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Head Controlled Loop</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseHeadControlledLoop(HeadControlledLoop object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Tail Controlled Loop</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Tail Controlled Loop</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseTailControlledLoop(TailControlledLoop object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>For Each</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>For Each</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseForEach(ForEach object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Compound Node</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Compound Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseCompoundNode(CompoundNode object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Regular Pattern Invocation</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Regular Pattern Invocation</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseRegularPatternInvocation(RegularPatternInvocation object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>CF Variable</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>CF Variable</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseCFVariable(CFVariable object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>CF Node</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>CF Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseCFNode(CFNode object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Binding Pattern Invocation</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Binding Pattern Invocation</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseBindingPatternInvocation(BindingPatternInvocation object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Single Result Pattern Invocation</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Single Result Pattern Invocation</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseSingleResultPatternInvocation(SingleResultPatternInvocation object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseScope(Scope object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Action</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseAction(Action object)
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
    * Returns the result of interpreting the object as an instance of '<em>Node Deletion</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Node Deletion</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseNodeDeletion(NodeDeletion object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseIfStatement(IfStatement object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Pattern Invocation</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Pattern Invocation</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casePatternInvocation(PatternInvocation object)
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
    * Returns the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseVariableReference(VariableReference object)
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

} //DemoclesSwitch
