/**
 */
package org.moflon.core.dfs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.core.dfs.Node#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.moflon.core.dfs.Node#getGraph <em>Graph</em>}</li>
 *   <li>{@link org.moflon.core.dfs.Node#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.moflon.core.dfs.Node#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.moflon.core.dfs.Node#getPostTraversal <em>Post Traversal</em>}</li>
 *   <li>{@link org.moflon.core.dfs.Node#getPreTraversal <em>Pre Traversal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.core.dfs.DfsPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject
{
   /**
    * Returns the value of the '<em><b>Incoming</b></em>' reference list.
    * The list contents are of type {@link org.moflon.core.dfs.Edge}.
    * It is bidirectional and its opposite is '{@link org.moflon.core.dfs.Edge#getTarget <em>Target</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Incoming</em>' reference list.
    * @see org.moflon.core.dfs.DfsPackage#getNode_Incoming()
    * @see org.moflon.core.dfs.Edge#getTarget
    * @model opposite="target"
    * @generated
    */
   EList<Edge> getIncoming();

   /**
    * Returns the value of the '<em><b>Graph</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.moflon.core.dfs.DFSGraph#getNodes <em>Nodes</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Graph</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Graph</em>' container reference.
    * @see #setGraph(DFSGraph)
    * @see org.moflon.core.dfs.DfsPackage#getNode_Graph()
    * @see org.moflon.core.dfs.DFSGraph#getNodes
    * @model opposite="nodes" required="true" transient="false"
    * @generated
    */
   DFSGraph getGraph();

   /**
    * Sets the value of the '{@link org.moflon.core.dfs.Node#getGraph <em>Graph</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Graph</em>' container reference.
    * @see #getGraph()
    * @generated
    */
   void setGraph(DFSGraph value);

   /**
    * Returns the value of the '<em><b>Origin</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Origin</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Origin</em>' reference.
    * @see #setOrigin(EObject)
    * @see org.moflon.core.dfs.DfsPackage#getNode_Origin()
    * @model required="true"
    * @generated
    */
   EObject getOrigin();

   /**
    * Sets the value of the '{@link org.moflon.core.dfs.Node#getOrigin <em>Origin</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Origin</em>' reference.
    * @see #getOrigin()
    * @generated
    */
   void setOrigin(EObject value);

   /**
    * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
    * The list contents are of type {@link org.moflon.core.dfs.Edge}.
    * It is bidirectional and its opposite is '{@link org.moflon.core.dfs.Edge#getSource <em>Source</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Outgoing</em>' reference list.
    * @see org.moflon.core.dfs.DfsPackage#getNode_Outgoing()
    * @see org.moflon.core.dfs.Edge#getSource
    * @model opposite="source"
    * @generated
    */
   EList<Edge> getOutgoing();

   /**
    * Returns the value of the '<em><b>Post Traversal</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Post Traversal</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Post Traversal</em>' attribute.
    * @see #setPostTraversal(int)
    * @see org.moflon.core.dfs.DfsPackage#getNode_PostTraversal()
    * @model required="true" ordered="false"
    * @generated
    */
   int getPostTraversal();

   /**
    * Sets the value of the '{@link org.moflon.core.dfs.Node#getPostTraversal <em>Post Traversal</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Post Traversal</em>' attribute.
    * @see #getPostTraversal()
    * @generated
    */
   void setPostTraversal(int value);

   /**
    * Returns the value of the '<em><b>Pre Traversal</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Pre Traversal</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Pre Traversal</em>' attribute.
    * @see #setPreTraversal(int)
    * @see org.moflon.core.dfs.DfsPackage#getNode_PreTraversal()
    * @model required="true" ordered="false"
    * @generated
    */
   int getPreTraversal();

   /**
    * Sets the value of the '{@link org.moflon.core.dfs.Node#getPreTraversal <em>Pre Traversal</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Pre Traversal</em>' attribute.
    * @see #getPreTraversal()
    * @generated
    */
   void setPreTraversal(int value);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // Node
