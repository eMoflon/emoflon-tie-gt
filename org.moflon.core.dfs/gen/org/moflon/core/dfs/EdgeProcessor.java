/**
 */
package org.moflon.core.dfs;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.core.dfs.EdgeProcessor#getDelegate <em>Delegate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.core.dfs.DfsPackage#getEdgeProcessor()
 * @model abstract="true"
 * @generated
 */
public interface EdgeProcessor extends EObject
{
   /**
    * Returns the value of the '<em><b>Delegate</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Delegate</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Delegate</em>' reference.
    * @see #setDelegate(EdgeProcessor)
    * @see org.moflon.core.dfs.DfsPackage#getEdgeProcessor_Delegate()
    * @model
    * @generated
    */
   EdgeProcessor getDelegate();

   /**
    * Sets the value of the '{@link org.moflon.core.dfs.EdgeProcessor#getDelegate <em>Delegate</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Delegate</em>' reference.
    * @see #getDelegate()
    * @generated
    */
   void setDelegate(EdgeProcessor value);

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
} // EdgeProcessor
