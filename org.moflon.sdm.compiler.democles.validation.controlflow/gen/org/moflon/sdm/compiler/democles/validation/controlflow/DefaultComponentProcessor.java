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
 * A representation of the model object '<em><b>Default Component Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.DefaultComponentProcessor#getBuilder <em>Builder</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getDefaultComponentProcessor()
 * @model
 * @generated
 */
public interface DefaultComponentProcessor extends ValidatingEdgeProcessor
{
   /**
    * Returns the value of the '<em><b>Builder</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Builder</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Builder</em>' reference.
    * @see #setBuilder(SDMActivityGraphBuilder)
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getDefaultComponentProcessor_Builder()
    * @model required="true"
    * @generated
    */
   SDMActivityGraphBuilder getBuilder();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.DefaultComponentProcessor#getBuilder <em>Builder</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Builder</em>' reference.
    * @see #getBuilder()
    * @generated
    */
   void setBuilder(SDMActivityGraphBuilder value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   Node exploreTargetNode(Edge edge);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   EObject processEdge(Edge edge);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // DefaultComponentProcessor
