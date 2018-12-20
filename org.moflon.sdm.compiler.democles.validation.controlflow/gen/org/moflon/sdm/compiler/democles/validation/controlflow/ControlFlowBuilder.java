/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow;

import SDMLanguage.activities.StoryNode;

import org.eclipse.emf.ecore.EObject;

import org.moflon.core.dfs.Edge;
import org.moflon.core.dfs.Node;

import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;

import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.IfStatement;
import org.moflon.sdm.runtime.democles.Scope;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Flow Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#getValidator <em>Validator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getControlFlowBuilder()
 * @model
 * @generated
 */
public interface ControlFlowBuilder extends EObject
{
   /**
    * Returns the value of the '<em><b>Validator</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Validator</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Validator</em>' reference.
    * @see #setValidator(Validator)
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getControlFlowBuilder_Validator()
    * @model required="true"
    * @generated
    */
   Validator getValidator();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#getValidator <em>Validator</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Validator</em>' reference.
    * @see #getValidator()
    * @generated
    */
   void setValidator(Validator value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   Edge findLargestBackwardEdgeInterval(Node node, Node root);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   ValidationReport handleForEachNode(Scope scope, Node node, StoryNode actForEachNode);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   ValidationReport handleHeadControlledLoop(Scope scope, Node node, Edge headLoopEdge);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   ValidationReport handleSimpleNode(Scope scope, Node node, Edge outgoingEdge);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   ValidationReport handleStumpedEdge(Scope scope, Edge stumpedEdge, CFNode sourceControlFlowNode);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   ValidationReport handleTailControlledLoop(Scope scope, Node node, Edge tailLoopEdge);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void handleUniqueJoinNode(Node joinNode, Node smallerRoot, Node largerRoot);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   boolean isHeadControlledLoopBranch(Edge edge);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   boolean isLoopBranch(Edge edge);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void lookahead(Scope scope, Node node);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void lookaheadAndConnect(Scope scope, Node node, CFNode currentCFNode);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   ValidationReport processNode(Scope scope, Node node);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void traverseThenAndElseBranches(IfStatement ifStatement, Edge firstOutgoingEdge, Edge secondOutgoingEdge, Scope successScope, Scope failureScope);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // ControlFlowBuilder
