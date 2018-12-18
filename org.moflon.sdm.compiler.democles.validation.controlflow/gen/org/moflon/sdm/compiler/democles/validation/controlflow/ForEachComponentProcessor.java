/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow;

import org.eclipse.emf.ecore.EObject;

import org.moflon.core.dfs.Edge;
import org.moflon.core.dfs.Node;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Each Component Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.ForEachComponentProcessor#getComponentStartingNode <em>Component Starting Node</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.ForEachComponentProcessor#getForEachNode <em>For Each Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getForEachComponentProcessor()
 * @model
 * @generated
 */
public interface ForEachComponentProcessor extends ValidatingEdgeProcessor
{
   /**
    * Returns the value of the '<em><b>Component Starting Node</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Component Starting Node</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Component Starting Node</em>' reference.
    * @see #setComponentStartingNode(Node)
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getForEachComponentProcessor_ComponentStartingNode()
    * @model required="true"
    * @generated
    */
   Node getComponentStartingNode();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.ForEachComponentProcessor#getComponentStartingNode <em>Component Starting Node</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Component Starting Node</em>' reference.
    * @see #getComponentStartingNode()
    * @generated
    */
   void setComponentStartingNode(Node value);

   /**
    * Returns the value of the '<em><b>For Each Node</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>For Each Node</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>For Each Node</em>' reference.
    * @see #setForEachNode(Node)
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getForEachComponentProcessor_ForEachNode()
    * @model required="true"
    * @generated
    */
   Node getForEachNode();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.ForEachComponentProcessor#getForEachNode <em>For Each Node</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>For Each Node</em>' reference.
    * @see #getForEachNode()
    * @generated
    */
   void setForEachNode(Node value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   EObject postDelegateEdgeAnalysis(Edge edge, EObject delegationResult);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   EObject processEdge(Edge edge);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // ForEachComponentProcessor
