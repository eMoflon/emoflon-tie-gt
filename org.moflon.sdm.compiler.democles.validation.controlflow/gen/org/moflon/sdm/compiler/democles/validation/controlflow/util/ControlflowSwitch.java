/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow.util;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypedElement;

import org.eclipse.emf.ecore.util.Switch;

import org.moflon.core.dfs.EdgeProcessor;

import org.moflon.sdm.compiler.democles.validation.controlflow.*;

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
 * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage
 * @generated
 */
public class ControlflowSwitch<T> extends Switch<T>
{
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static ControlflowPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ControlflowSwitch()
   {
      if (modelPackage == null)
      {
         modelPackage = ControlflowPackage.eINSTANCE;
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
      case ControlflowPackage.VALIDATOR:
      {
         Validator validator = (Validator) theEObject;
         T result = caseValidator(validator);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ControlflowPackage.SDM_ACTIVITY_GRAPH_BUILDER:
      {
         SDMActivityGraphBuilder sdmActivityGraphBuilder = (SDMActivityGraphBuilder) theEObject;
         T result = caseSDMActivityGraphBuilder(sdmActivityGraphBuilder);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ControlflowPackage.CROSS_EDGE_ANALYZER:
      {
         CrossEdgeAnalyzer crossEdgeAnalyzer = (CrossEdgeAnalyzer) theEObject;
         T result = caseCrossEdgeAnalyzer(crossEdgeAnalyzer);
         if (result == null)
            result = caseValidatingEdgeProcessor(crossEdgeAnalyzer);
         if (result == null)
            result = caseEdgeProcessor(crossEdgeAnalyzer);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ControlflowPackage.INEFFICIENT_BOOTSTRAPPING_BUILDER:
      {
         InefficientBootstrappingBuilder inefficientBootstrappingBuilder = (InefficientBootstrappingBuilder) theEObject;
         T result = caseInefficientBootstrappingBuilder(inefficientBootstrappingBuilder);
         if (result == null)
            result = caseSDMActivityGraphBuilder(inefficientBootstrappingBuilder);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ControlflowPackage.SUB_TREE_TESTER:
      {
         SubTreeTester subTreeTester = (SubTreeTester) theEObject;
         T result = caseSubTreeTester(subTreeTester);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ControlflowPackage.TREE_EDGE_BACKWARD_NAVIGATOR_TERMINAL:
      {
         TreeEdgeBackwardNavigatorTerminal treeEdgeBackwardNavigatorTerminal = (TreeEdgeBackwardNavigatorTerminal) theEObject;
         T result = caseTreeEdgeBackwardNavigatorTerminal(treeEdgeBackwardNavigatorTerminal);
         if (result == null)
            result = caseValidatingEdgeProcessor(treeEdgeBackwardNavigatorTerminal);
         if (result == null)
            result = caseEdgeProcessor(treeEdgeBackwardNavigatorTerminal);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ControlflowPackage.FOR_EACH_COMPONENT_PROCESSOR:
      {
         ForEachComponentProcessor forEachComponentProcessor = (ForEachComponentProcessor) theEObject;
         T result = caseForEachComponentProcessor(forEachComponentProcessor);
         if (result == null)
            result = caseValidatingEdgeProcessor(forEachComponentProcessor);
         if (result == null)
            result = caseEdgeProcessor(forEachComponentProcessor);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ControlflowPackage.TREE_EDGE_NAVIGATOR:
      {
         TreeEdgeNavigator treeEdgeNavigator = (TreeEdgeNavigator) theEObject;
         T result = caseTreeEdgeNavigator(treeEdgeNavigator);
         if (result == null)
            result = caseValidatingEdgeProcessor(treeEdgeNavigator);
         if (result == null)
            result = caseEdgeProcessor(treeEdgeNavigator);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ControlflowPackage.JOIN_NODE_FINDER:
      {
         JoinNodeFinder joinNodeFinder = (JoinNodeFinder) theEObject;
         T result = caseJoinNodeFinder(joinNodeFinder);
         if (result == null)
            result = caseValidatingEdgeProcessor(joinNodeFinder);
         if (result == null)
            result = caseEdgeProcessor(joinNodeFinder);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ControlflowPackage.MOFLON_OPERATION:
      {
         MoflonOperation moflonOperation = (MoflonOperation) theEObject;
         T result = caseMoflonOperation(moflonOperation);
         if (result == null)
            result = caseEOperation(moflonOperation);
         if (result == null)
            result = caseETypedElement(moflonOperation);
         if (result == null)
            result = caseENamedElement(moflonOperation);
         if (result == null)
            result = caseEModelElement(moflonOperation);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ControlflowPackage.DEFAULT_COMPONENT_PROCESSOR:
      {
         DefaultComponentProcessor defaultComponentProcessor = (DefaultComponentProcessor) theEObject;
         T result = caseDefaultComponentProcessor(defaultComponentProcessor);
         if (result == null)
            result = caseValidatingEdgeProcessor(defaultComponentProcessor);
         if (result == null)
            result = caseEdgeProcessor(defaultComponentProcessor);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ControlflowPackage.CONTROL_FLOW_BUILDER:
      {
         ControlFlowBuilder controlFlowBuilder = (ControlFlowBuilder) theEObject;
         T result = caseControlFlowBuilder(controlFlowBuilder);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ControlflowPackage.IDENTIFIER_ALLOCATOR:
      {
         IdentifierAllocator identifierAllocator = (IdentifierAllocator) theEObject;
         T result = caseIdentifierAllocator(identifierAllocator);
         if (result == null)
            result = caseUniformNoOperationVisitor(identifierAllocator);
         if (result == null)
            result = caseVisitor(identifierAllocator);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case ControlflowPackage.VALIDATING_EDGE_PROCESSOR:
      {
         ValidatingEdgeProcessor validatingEdgeProcessor = (ValidatingEdgeProcessor) theEObject;
         T result = caseValidatingEdgeProcessor(validatingEdgeProcessor);
         if (result == null)
            result = caseEdgeProcessor(validatingEdgeProcessor);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      default:
         return defaultCase(theEObject);
      }
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
   public T caseValidator(Validator object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>SDM Activity Graph Builder</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>SDM Activity Graph Builder</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseSDMActivityGraphBuilder(SDMActivityGraphBuilder object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Cross Edge Analyzer</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Cross Edge Analyzer</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseCrossEdgeAnalyzer(CrossEdgeAnalyzer object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Inefficient Bootstrapping Builder</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Inefficient Bootstrapping Builder</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseInefficientBootstrappingBuilder(InefficientBootstrappingBuilder object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Sub Tree Tester</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Sub Tree Tester</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseSubTreeTester(SubTreeTester object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Tree Edge Backward Navigator Terminal</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Tree Edge Backward Navigator Terminal</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseTreeEdgeBackwardNavigatorTerminal(TreeEdgeBackwardNavigatorTerminal object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>For Each Component Processor</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>For Each Component Processor</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseForEachComponentProcessor(ForEachComponentProcessor object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Tree Edge Navigator</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Tree Edge Navigator</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseTreeEdgeNavigator(TreeEdgeNavigator object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Join Node Finder</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Join Node Finder</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseJoinNodeFinder(JoinNodeFinder object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Moflon Operation</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Moflon Operation</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseMoflonOperation(MoflonOperation object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Default Component Processor</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Default Component Processor</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseDefaultComponentProcessor(DefaultComponentProcessor object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Control Flow Builder</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Control Flow Builder</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseControlFlowBuilder(ControlFlowBuilder object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Identifier Allocator</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Identifier Allocator</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseIdentifierAllocator(IdentifierAllocator object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Validating Edge Processor</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Validating Edge Processor</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseValidatingEdgeProcessor(ValidatingEdgeProcessor object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Edge Processor</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Edge Processor</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseEdgeProcessor(EdgeProcessor object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EModel Element</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EModel Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseEModelElement(EModelElement object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>ENamed Element</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>ENamed Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseENamedElement(ENamedElement object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>ETyped Element</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>ETyped Element</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseETypedElement(ETypedElement object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EOperation</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EOperation</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseEOperation(EOperation object)
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

} //ControlflowSwitch
