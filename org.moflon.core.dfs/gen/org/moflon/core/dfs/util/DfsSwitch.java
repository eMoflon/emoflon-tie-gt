/**
 */
package org.moflon.core.dfs.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.moflon.core.dfs.*;

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
 * @see org.moflon.core.dfs.DfsPackage
 * @generated
 */
public class DfsSwitch<T> extends Switch<T>
{
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static DfsPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DfsSwitch()
   {
      if (modelPackage == null)
      {
         modelPackage = DfsPackage.eINSTANCE;
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
      case DfsPackage.EDGE_PROCESSOR:
      {
         EdgeProcessor edgeProcessor = (EdgeProcessor) theEObject;
         T result = caseEdgeProcessor(edgeProcessor);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case DfsPackage.NODE:
      {
         Node node = (Node) theEObject;
         T result = caseNode(node);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case DfsPackage.EDGE:
      {
         Edge edge = (Edge) theEObject;
         T result = caseEdge(edge);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case DfsPackage.DEPTH_FIRST_SEARCH:
      {
         DepthFirstSearch depthFirstSearch = (DepthFirstSearch) theEObject;
         T result = caseDepthFirstSearch(depthFirstSearch);
         if (result == null)
            result = caseEdgeProcessor(depthFirstSearch);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      case DfsPackage.DFS_GRAPH:
      {
         DFSGraph dfsGraph = (DFSGraph) theEObject;
         T result = caseDFSGraph(dfsGraph);
         if (result == null)
            result = defaultCase(theEObject);
         return result;
      }
      default:
         return defaultCase(theEObject);
      }
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
    * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Node</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseNode(Node object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseEdge(Edge object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Depth First Search</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Depth First Search</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseDepthFirstSearch(DepthFirstSearch object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>DFS Graph</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>DFS Graph</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseDFSGraph(DFSGraph object)
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

} //DfsSwitch
