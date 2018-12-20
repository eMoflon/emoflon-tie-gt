/**
 */
package org.moflon.core.dfs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.DfsPackage;
import org.moflon.core.dfs.Edge;
import org.moflon.core.dfs.Node;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DFS Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.core.dfs.impl.DFSGraphImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link org.moflon.core.dfs.impl.DFSGraphImpl#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DFSGraphImpl extends EObjectImpl implements DFSGraph
{
   /**
    * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getEdges()
    * @generated
    * @ordered
    */
   protected EList<Edge> edges;

   /**
    * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getNodes()
    * @generated
    * @ordered
    */
   protected EList<Node> nodes;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected DFSGraphImpl()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass()
   {
      return DfsPackage.Literals.DFS_GRAPH;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Edge> getEdges()
   {
      if (edges == null)
      {
         edges = new EObjectContainmentWithInverseEList<Edge>(Edge.class, this, DfsPackage.DFS_GRAPH__EDGES, DfsPackage.EDGE__GRAPH);
      }
      return edges;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Node> getNodes()
   {
      if (nodes == null)
      {
         nodes = new EObjectContainmentWithInverseEList<Node>(Node.class, this, DfsPackage.DFS_GRAPH__NODES, DfsPackage.NODE__GRAPH);
      }
      return nodes;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
      case DfsPackage.DFS_GRAPH__EDGES:
         return ((InternalEList<InternalEObject>) (InternalEList<?>) getEdges()).basicAdd(otherEnd, msgs);
      case DfsPackage.DFS_GRAPH__NODES:
         return ((InternalEList<InternalEObject>) (InternalEList<?>) getNodes()).basicAdd(otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
      case DfsPackage.DFS_GRAPH__EDGES:
         return ((InternalEList<?>) getEdges()).basicRemove(otherEnd, msgs);
      case DfsPackage.DFS_GRAPH__NODES:
         return ((InternalEList<?>) getNodes()).basicRemove(otherEnd, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
      case DfsPackage.DFS_GRAPH__EDGES:
         return getEdges();
      case DfsPackage.DFS_GRAPH__NODES:
         return getNodes();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
      case DfsPackage.DFS_GRAPH__EDGES:
         getEdges().clear();
         getEdges().addAll((Collection<? extends Edge>) newValue);
         return;
      case DfsPackage.DFS_GRAPH__NODES:
         getNodes().clear();
         getNodes().addAll((Collection<? extends Node>) newValue);
         return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eUnset(int featureID)
   {
      switch (featureID)
      {
      case DfsPackage.DFS_GRAPH__EDGES:
         getEdges().clear();
         return;
      case DfsPackage.DFS_GRAPH__NODES:
         getNodes().clear();
         return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean eIsSet(int featureID)
   {
      switch (featureID)
      {
      case DfsPackage.DFS_GRAPH__EDGES:
         return edges != null && !edges.isEmpty();
      case DfsPackage.DFS_GRAPH__NODES:
         return nodes != null && !nodes.isEmpty();
      }
      return super.eIsSet(featureID);
   }
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //DFSGraphImpl
