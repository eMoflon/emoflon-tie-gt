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
 * A representation of the model object '<em><b>Tree Edge Navigator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.TreeEdgeNavigator#getTerminalNode <em>Terminal Node</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.TreeEdgeNavigator#isForward <em>Forward</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getTreeEdgeNavigator()
 * @model
 * @generated
 */
public interface TreeEdgeNavigator extends ValidatingEdgeProcessor
{
   /**
    * Returns the value of the '<em><b>Terminal Node</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Terminal Node</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Terminal Node</em>' reference.
    * @see #setTerminalNode(Node)
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getTreeEdgeNavigator_TerminalNode()
    * @model
    * @generated
    */
   Node getTerminalNode();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.TreeEdgeNavigator#getTerminalNode <em>Terminal Node</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Terminal Node</em>' reference.
    * @see #getTerminalNode()
    * @generated
    */
   void setTerminalNode(Node value);

   /**
    * Returns the value of the '<em><b>Forward</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Forward</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Forward</em>' attribute.
    * @see #setForward(boolean)
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getTreeEdgeNavigator_Forward()
    * @model required="true" ordered="false"
    * @generated
    */
   boolean isForward();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.TreeEdgeNavigator#isForward <em>Forward</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Forward</em>' attribute.
    * @see #isForward()
    * @generated
    */
   void setForward(boolean value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   EObject processEdge(Edge edge);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   EObject processNode(Node node);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // TreeEdgeNavigator
