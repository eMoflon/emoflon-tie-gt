/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.moflon.core.dfs.Edge;
import org.moflon.core.dfs.Node;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Node Finder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.JoinNodeFinder#getBranchRoot <em>Branch Root</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.JoinNodeFinder#getJoinNodes <em>Join Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getJoinNodeFinder()
 * @model
 * @generated
 */
public interface JoinNodeFinder extends ValidatingEdgeProcessor
{
   /**
    * Returns the value of the '<em><b>Branch Root</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Branch Root</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Branch Root</em>' reference.
    * @see #setBranchRoot(Node)
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getJoinNodeFinder_BranchRoot()
    * @model required="true"
    * @generated
    */
   Node getBranchRoot();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.JoinNodeFinder#getBranchRoot <em>Branch Root</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Branch Root</em>' reference.
    * @see #getBranchRoot()
    * @generated
    */
   void setBranchRoot(Node value);

   /**
    * Returns the value of the '<em><b>Join Nodes</b></em>' reference list.
    * The list contents are of type {@link org.moflon.core.dfs.Node}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Join Nodes</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Join Nodes</em>' reference list.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getJoinNodeFinder_JoinNodes()
    * @model
    * @generated
    */
   EList<Node> getJoinNodes();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   boolean leadsToJoinNode(Edge edge);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   EObject processNode(Node node);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // JoinNodeFinder
