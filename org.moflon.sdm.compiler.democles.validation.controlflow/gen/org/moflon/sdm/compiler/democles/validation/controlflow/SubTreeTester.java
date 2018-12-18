/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow;

import org.eclipse.emf.ecore.EObject;

import org.moflon.core.dfs.Node;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Tree Tester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.SubTreeTester#getRoot <em>Root</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.SubTreeTester#isIncludeRoot <em>Include Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getSubTreeTester()
 * @model
 * @generated
 */
public interface SubTreeTester extends EObject
{
   /**
    * Returns the value of the '<em><b>Root</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Root</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Root</em>' reference.
    * @see #setRoot(Node)
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getSubTreeTester_Root()
    * @model required="true"
    * @generated
    */
   Node getRoot();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.SubTreeTester#getRoot <em>Root</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Root</em>' reference.
    * @see #getRoot()
    * @generated
    */
   void setRoot(Node value);

   /**
    * Returns the value of the '<em><b>Include Root</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Include Root</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Include Root</em>' attribute.
    * @see #setIncludeRoot(boolean)
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getSubTreeTester_IncludeRoot()
    * @model required="true" ordered="false"
    * @generated
    */
   boolean isIncludeRoot();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.SubTreeTester#isIncludeRoot <em>Include Root</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Include Root</em>' attribute.
    * @see #isIncludeRoot()
    * @generated
    */
   void setIncludeRoot(boolean value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   boolean isInSubTree(Node node);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // SubTreeTester
