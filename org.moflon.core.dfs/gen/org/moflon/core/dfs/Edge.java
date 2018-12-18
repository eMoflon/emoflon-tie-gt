/**
 */
package org.moflon.core.dfs;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.core.dfs.Edge#getGraph <em>Graph</em>}</li>
 *   <li>{@link org.moflon.core.dfs.Edge#getSource <em>Source</em>}</li>
 *   <li>{@link org.moflon.core.dfs.Edge#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.moflon.core.dfs.Edge#getTarget <em>Target</em>}</li>
 *   <li>{@link org.moflon.core.dfs.Edge#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.core.dfs.DfsPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends EObject
{
   /**
    * Returns the value of the '<em><b>Graph</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.moflon.core.dfs.DFSGraph#getEdges <em>Edges</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Graph</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Graph</em>' container reference.
    * @see #setGraph(DFSGraph)
    * @see org.moflon.core.dfs.DfsPackage#getEdge_Graph()
    * @see org.moflon.core.dfs.DFSGraph#getEdges
    * @model opposite="edges" required="true" transient="false"
    * @generated
    */
   DFSGraph getGraph();

   /**
    * Sets the value of the '{@link org.moflon.core.dfs.Edge#getGraph <em>Graph</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Graph</em>' container reference.
    * @see #getGraph()
    * @generated
    */
   void setGraph(DFSGraph value);

   /**
    * Returns the value of the '<em><b>Source</b></em>' reference.
    * It is bidirectional and its opposite is '{@link org.moflon.core.dfs.Node#getOutgoing <em>Outgoing</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Source</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Source</em>' reference.
    * @see #setSource(Node)
    * @see org.moflon.core.dfs.DfsPackage#getEdge_Source()
    * @see org.moflon.core.dfs.Node#getOutgoing
    * @model opposite="outgoing" required="true"
    * @generated
    */
   Node getSource();

   /**
    * Sets the value of the '{@link org.moflon.core.dfs.Edge#getSource <em>Source</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Source</em>' reference.
    * @see #getSource()
    * @generated
    */
   void setSource(Node value);

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
    * @see org.moflon.core.dfs.DfsPackage#getEdge_Origin()
    * @model required="true"
    * @generated
    */
   EObject getOrigin();

   /**
    * Sets the value of the '{@link org.moflon.core.dfs.Edge#getOrigin <em>Origin</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Origin</em>' reference.
    * @see #getOrigin()
    * @generated
    */
   void setOrigin(EObject value);

   /**
    * Returns the value of the '<em><b>Target</b></em>' reference.
    * It is bidirectional and its opposite is '{@link org.moflon.core.dfs.Node#getIncoming <em>Incoming</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Target</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Target</em>' reference.
    * @see #setTarget(Node)
    * @see org.moflon.core.dfs.DfsPackage#getEdge_Target()
    * @see org.moflon.core.dfs.Node#getIncoming
    * @model opposite="incoming" required="true"
    * @generated
    */
   Node getTarget();

   /**
    * Sets the value of the '{@link org.moflon.core.dfs.Edge#getTarget <em>Target</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Target</em>' reference.
    * @see #getTarget()
    * @generated
    */
   void setTarget(Node value);

   /**
    * Returns the value of the '<em><b>Type</b></em>' attribute.
    * The literals are from the enumeration {@link org.moflon.core.dfs.EdgeType}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Type</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Type</em>' attribute.
    * @see org.moflon.core.dfs.EdgeType
    * @see #setType(EdgeType)
    * @see org.moflon.core.dfs.DfsPackage#getEdge_Type()
    * @model required="true" ordered="false"
    * @generated
    */
   EdgeType getType();

   /**
    * Sets the value of the '{@link org.moflon.core.dfs.Edge#getType <em>Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Type</em>' attribute.
    * @see org.moflon.core.dfs.EdgeType
    * @see #getType()
    * @generated
    */
   void setType(EdgeType value);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // Edge
