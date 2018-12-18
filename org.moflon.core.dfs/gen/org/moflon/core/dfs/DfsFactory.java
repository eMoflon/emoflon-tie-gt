/**
 */
package org.moflon.core.dfs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.moflon.core.dfs.DfsPackage
 * @generated
 */
public interface DfsFactory extends EFactory
{
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   DfsFactory eINSTANCE = org.moflon.core.dfs.impl.DfsFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Node</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Node</em>'.
    * @generated
    */
   Node createNode();

   /**
    * Returns a new object of class '<em>Edge</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Edge</em>'.
    * @generated
    */
   Edge createEdge();

   /**
    * Returns a new object of class '<em>Depth First Search</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Depth First Search</em>'.
    * @generated
    */
   DepthFirstSearch createDepthFirstSearch();

   /**
    * Returns a new object of class '<em>DFS Graph</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>DFS Graph</em>'.
    * @generated
    */
   DFSGraph createDFSGraph();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   DfsPackage getDfsPackage();

} //DfsFactory
