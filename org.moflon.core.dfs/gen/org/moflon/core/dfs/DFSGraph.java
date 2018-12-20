/**
 */
package org.moflon.core.dfs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DFS Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.core.dfs.DFSGraph#getEdges <em>Edges</em>}</li>
 *   <li>{@link org.moflon.core.dfs.DFSGraph#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.core.dfs.DfsPackage#getDFSGraph()
 * @model
 * @generated
 */
public interface DFSGraph extends EObject
{
   /**
    * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
    * The list contents are of type {@link org.moflon.core.dfs.Edge}.
    * It is bidirectional and its opposite is '{@link org.moflon.core.dfs.Edge#getGraph <em>Graph</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Edges</em>' containment reference list.
    * @see org.moflon.core.dfs.DfsPackage#getDFSGraph_Edges()
    * @see org.moflon.core.dfs.Edge#getGraph
    * @model opposite="graph" containment="true"
    * @generated
    */
   EList<Edge> getEdges();

   /**
    * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
    * The list contents are of type {@link org.moflon.core.dfs.Node}.
    * It is bidirectional and its opposite is '{@link org.moflon.core.dfs.Node#getGraph <em>Graph</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Nodes</em>' containment reference list.
    * @see org.moflon.core.dfs.DfsPackage#getDFSGraph_Nodes()
    * @see org.moflon.core.dfs.Node#getGraph
    * @model opposite="graph" containment="true"
    * @generated
    */
   EList<Node> getNodes();
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // DFSGraph
