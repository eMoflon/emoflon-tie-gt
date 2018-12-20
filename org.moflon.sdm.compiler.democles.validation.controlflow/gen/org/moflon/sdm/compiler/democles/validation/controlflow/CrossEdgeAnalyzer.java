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
 * A representation of the model object '<em><b>Cross Edge Analyzer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.CrossEdgeAnalyzer#getMiddleRoot <em>Middle Root</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.CrossEdgeAnalyzer#getLowerTreeTester <em>Lower Tree Tester</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getCrossEdgeAnalyzer()
 * @model
 * @generated
 */
public interface CrossEdgeAnalyzer extends ValidatingEdgeProcessor
{
   /**
    * Returns the value of the '<em><b>Middle Root</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Middle Root</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Middle Root</em>' reference.
    * @see #setMiddleRoot(Node)
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getCrossEdgeAnalyzer_MiddleRoot()
    * @model required="true"
    * @generated
    */
   Node getMiddleRoot();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.CrossEdgeAnalyzer#getMiddleRoot <em>Middle Root</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Middle Root</em>' reference.
    * @see #getMiddleRoot()
    * @generated
    */
   void setMiddleRoot(Node value);

   /**
    * Returns the value of the '<em><b>Lower Tree Tester</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Lower Tree Tester</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Lower Tree Tester</em>' reference.
    * @see #setLowerTreeTester(SubTreeTester)
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getCrossEdgeAnalyzer_LowerTreeTester()
    * @model
    * @generated
    */
   SubTreeTester getLowerTreeTester();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.CrossEdgeAnalyzer#getLowerTreeTester <em>Lower Tree Tester</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Lower Tree Tester</em>' reference.
    * @see #getLowerTreeTester()
    * @generated
    */
   void setLowerTreeTester(SubTreeTester value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void deleteEdge(Edge edge);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   boolean isNodeInWrongComponent(Node node, int dynamicPreTraversal, int dynamicPostTraversal);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   EObject processNode(Node node);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // CrossEdgeAnalyzer
