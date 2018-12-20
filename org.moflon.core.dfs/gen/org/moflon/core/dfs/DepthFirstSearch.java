/**
 */
package org.moflon.core.dfs;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Depth First Search</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.core.dfs.DepthFirstSearch#getPostTraversalCounter <em>Post Traversal Counter</em>}</li>
 *   <li>{@link org.moflon.core.dfs.DepthFirstSearch#getPreTraversalCounter <em>Pre Traversal Counter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.core.dfs.DfsPackage#getDepthFirstSearch()
 * @model
 * @generated
 */
public interface DepthFirstSearch extends EdgeProcessor
{
   /**
    * Returns the value of the '<em><b>Post Traversal Counter</b></em>' attribute.
    * The default value is <code>"0"</code>.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Post Traversal Counter</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Post Traversal Counter</em>' attribute.
    * @see #setPostTraversalCounter(int)
    * @see org.moflon.core.dfs.DfsPackage#getDepthFirstSearch_PostTraversalCounter()
    * @model default="0" required="true" ordered="false"
    * @generated
    */
   int getPostTraversalCounter();

   /**
    * Sets the value of the '{@link org.moflon.core.dfs.DepthFirstSearch#getPostTraversalCounter <em>Post Traversal Counter</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Post Traversal Counter</em>' attribute.
    * @see #getPostTraversalCounter()
    * @generated
    */
   void setPostTraversalCounter(int value);

   /**
    * Returns the value of the '<em><b>Pre Traversal Counter</b></em>' attribute.
    * The default value is <code>"0"</code>.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Pre Traversal Counter</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Pre Traversal Counter</em>' attribute.
    * @see #setPreTraversalCounter(int)
    * @see org.moflon.core.dfs.DfsPackage#getDepthFirstSearch_PreTraversalCounter()
    * @model default="0" required="true" ordered="false"
    * @generated
    */
   int getPreTraversalCounter();

   /**
    * Sets the value of the '{@link org.moflon.core.dfs.DepthFirstSearch#getPreTraversalCounter <em>Pre Traversal Counter</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Pre Traversal Counter</em>' attribute.
    * @see #getPreTraversalCounter()
    * @generated
    */
   void setPreTraversalCounter(int value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   int incrementPostTraversalCounter();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   int incrementPreTraversalCounter();

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
} // DepthFirstSearch
