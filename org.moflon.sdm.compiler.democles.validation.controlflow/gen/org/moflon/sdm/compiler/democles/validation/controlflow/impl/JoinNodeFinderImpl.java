/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow.impl;

import SDMLanguage.activities.StopNode;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.moflon.core.dfs.Edge;
import org.moflon.core.dfs.EdgeProcessor;
import org.moflon.core.dfs.EdgeType;
import org.moflon.core.dfs.Node;

import org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage;
import org.moflon.sdm.compiler.democles.validation.controlflow.JoinNodeFinder;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Node Finder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.JoinNodeFinderImpl#getBranchRoot <em>Branch Root</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.JoinNodeFinderImpl#getJoinNodes <em>Join Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JoinNodeFinderImpl extends ValidatingEdgeProcessorImpl implements JoinNodeFinder
{
   /**
    * The cached value of the '{@link #getBranchRoot() <em>Branch Root</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getBranchRoot()
    * @generated
    * @ordered
    */
   protected Node branchRoot;

   /**
    * The cached value of the '{@link #getJoinNodes() <em>Join Nodes</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getJoinNodes()
    * @generated
    * @ordered
    */
   protected EList<Node> joinNodes;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected JoinNodeFinderImpl()
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
      return ControlflowPackage.Literals.JOIN_NODE_FINDER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node getBranchRoot()
   {
      if (branchRoot != null && branchRoot.eIsProxy())
      {
         InternalEObject oldBranchRoot = (InternalEObject) branchRoot;
         branchRoot = (Node) eResolveProxy(oldBranchRoot);
         if (branchRoot != oldBranchRoot)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlflowPackage.JOIN_NODE_FINDER__BRANCH_ROOT, oldBranchRoot, branchRoot));
         }
      }
      return branchRoot;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node basicGetBranchRoot()
   {
      return branchRoot;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setBranchRoot(Node newBranchRoot)
   {
      Node oldBranchRoot = branchRoot;
      branchRoot = newBranchRoot;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.JOIN_NODE_FINDER__BRANCH_ROOT, oldBranchRoot, branchRoot));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Node> getJoinNodes()
   {
      if (joinNodes == null)
      {
         joinNodes = new EObjectResolvingEList<Node>(Node.class, this, ControlflowPackage.JOIN_NODE_FINDER__JOIN_NODES);
      }
      return joinNodes;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean leadsToJoinNode(Edge edge)
   {

      Object[] result1_black = JoinNodeFinderImpl.pattern_JoinNodeFinder_0_1_LookupBranchStartingNode_blackFB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      Node root = (Node) result1_black[0];
      // 
      Object[] result2_black = JoinNodeFinderImpl.pattern_JoinNodeFinder_0_2_JoinNodeFound1_blackBB(edge, root);
      if (result2_black != null)
      {
         return JoinNodeFinderImpl.pattern_JoinNodeFinder_0_3_expressionF();
      } else
      {
         // 
         Object[] result4_black = JoinNodeFinderImpl.pattern_JoinNodeFinder_0_4_JoinNodeFound2_blackFBB(edge, root);
         if (result4_black != null)
         {
            //nothing Node sourceNode = (Node) result4_black[0];
            return JoinNodeFinderImpl.pattern_JoinNodeFinder_0_5_expressionF();
         } else
         {
            return JoinNodeFinderImpl.pattern_JoinNodeFinder_0_6_expressionF();
         }

      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EObject processNode(Node node)
   {

      Object[] result1_black = JoinNodeFinderImpl.pattern_JoinNodeFinder_1_1_LookupDelegate_blackFB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      EdgeProcessor delegate = (EdgeProcessor) result1_black[0];
      // ForEach 
      for (Object[] result2_black : JoinNodeFinderImpl.pattern_JoinNodeFinder_1_2_ForEachIncomingEdges_blackFB(node))
      {
         Edge incomingEdge = (Edge) result2_black[0];
         // 
         if (JoinNodeFinderImpl.pattern_JoinNodeFinder_1_3_LeadsToJoinNode_expressionFBB(this, incomingEdge))
         {
            // 
            Object[] result4_black = JoinNodeFinderImpl.pattern_JoinNodeFinder_1_4_IsJoinStopNode_blackBF(node);
            if (result4_black != null)
            {
               //nothing StopNode stopNode = (StopNode) result4_black[1];

               Object[] result5_black = JoinNodeFinderImpl.pattern_JoinNodeFinder_1_5_RecategorizeCrossEdge_blackB(incomingEdge);
               if (result5_black == null)
               {
                  throw new RuntimeException("Pattern matching failed." + " Variables: " + "[incomingEdge] = " + incomingEdge + ".");
               }
               JoinNodeFinderImpl.pattern_JoinNodeFinder_1_5_RecategorizeCrossEdge_greenB(incomingEdge);

            } else
            {

               Object[] result6_black = JoinNodeFinderImpl.pattern_JoinNodeFinder_1_6_RegularJoinNodeFound_blackBB(node, this);
               if (result6_black == null)
               {
                  throw new RuntimeException("Pattern matching failed." + " Variables: " + "[node] = " + node + ", " + "[this] = " + this + ".");
               }
               JoinNodeFinderImpl.pattern_JoinNodeFinder_1_6_RegularJoinNodeFound_greenBB(node, this);

            }

         } else
         {
         }

      }
      // 
      JoinNodeFinderImpl.pattern_JoinNodeFinder_1_7_Delegation_expressionFBB(delegate, node);
      return JoinNodeFinderImpl.pattern_JoinNodeFinder_1_8_expressionF();
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
      case ControlflowPackage.JOIN_NODE_FINDER__BRANCH_ROOT:
         if (resolve)
            return getBranchRoot();
         return basicGetBranchRoot();
      case ControlflowPackage.JOIN_NODE_FINDER__JOIN_NODES:
         return getJoinNodes();
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
      case ControlflowPackage.JOIN_NODE_FINDER__BRANCH_ROOT:
         setBranchRoot((Node) newValue);
         return;
      case ControlflowPackage.JOIN_NODE_FINDER__JOIN_NODES:
         getJoinNodes().clear();
         getJoinNodes().addAll((Collection<? extends Node>) newValue);
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
      case ControlflowPackage.JOIN_NODE_FINDER__BRANCH_ROOT:
         setBranchRoot((Node) null);
         return;
      case ControlflowPackage.JOIN_NODE_FINDER__JOIN_NODES:
         getJoinNodes().clear();
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
      case ControlflowPackage.JOIN_NODE_FINDER__BRANCH_ROOT:
         return branchRoot != null;
      case ControlflowPackage.JOIN_NODE_FINDER__JOIN_NODES:
         return joinNodes != null && !joinNodes.isEmpty();
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
   {
      switch (operationID)
      {
      case ControlflowPackage.JOIN_NODE_FINDER___LEADS_TO_JOIN_NODE__EDGE:
         return leadsToJoinNode((Edge) arguments.get(0));
      case ControlflowPackage.JOIN_NODE_FINDER___PROCESS_NODE__NODE:
         return processNode((Node) arguments.get(0));
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_JoinNodeFinder_0_1_LookupBranchStartingNode_blackFB(JoinNodeFinder _this)
   {
      Node root = _this.getBranchRoot();
      if (root != null)
      {
         return new Object[] { root, _this };
      }

      return null;
   }

   public static final Object[] pattern_JoinNodeFinder_0_2_JoinNodeFound1_blackBB(Edge edge, Node root)
   {
      if (root.getOutgoing().contains(edge))
      {
         EdgeType edge_type = edge.getType();
         if (edge_type.equals(EdgeType.CROSS_EDGE))
         {
            return new Object[] { edge, root };
         }

      }
      return null;
   }

   public static final boolean pattern_JoinNodeFinder_0_3_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final Object[] pattern_JoinNodeFinder_0_4_JoinNodeFound2_blackFBB(Edge edge, Node root)
   {
      Node sourceNode = edge.getSource();
      if (sourceNode != null)
      {
         if (!root.equals(sourceNode))
         {
            int root_preTraversal = root.getPreTraversal();
            int root_postTraversal = root.getPostTraversal();
            EdgeType edge_type = edge.getType();
            if (edge_type.equals(EdgeType.CROSS_EDGE))
            {
               int sourceNode_preTraversal = sourceNode.getPreTraversal();
               if (Integer.valueOf(sourceNode_preTraversal).compareTo(Integer.valueOf(root_preTraversal)) >= 0)
               {
                  int sourceNode_postTraversal = sourceNode.getPostTraversal();
                  if (Integer.valueOf(sourceNode_postTraversal).compareTo(Integer.valueOf(root_postTraversal)) <= 0)
                  {
                     return new Object[] { sourceNode, edge, root };
                  }

               }

            }

         }
      }

      return null;
   }

   public static final boolean pattern_JoinNodeFinder_0_5_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final boolean pattern_JoinNodeFinder_0_6_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final Object[] pattern_JoinNodeFinder_1_1_LookupDelegate_blackFB(JoinNodeFinder _this)
   {
      EdgeProcessor delegate = _this.getDelegate();
      if (delegate != null)
      {
         if (!delegate.equals(_this))
         {
            return new Object[] { delegate, _this };
         }
      }

      return null;
   }

   public static final Iterable<Object[]> pattern_JoinNodeFinder_1_2_ForEachIncomingEdges_blackFB(Node node)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (Edge incomingEdge : node.getIncoming())
      {
         _result.add(new Object[] { incomingEdge, node });
      }
      return _result;
   }

   public static final boolean pattern_JoinNodeFinder_1_3_LeadsToJoinNode_expressionFBB(JoinNodeFinder _this, Edge incomingEdge)
   {
      boolean _localVariable_0 = _this.leadsToJoinNode(incomingEdge);
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final Object[] pattern_JoinNodeFinder_1_4_IsJoinStopNode_blackBF(Node node)
   {
      EObject tmpStopNode = node.getOrigin();
      if (tmpStopNode instanceof StopNode)
      {
         StopNode stopNode = (StopNode) tmpStopNode;
         return new Object[] { node, stopNode };
      }

      return null;
   }

   public static final Object[] pattern_JoinNodeFinder_1_5_RecategorizeCrossEdge_blackB(Edge incomingEdge)
   {
      EdgeType incomingEdge_type = incomingEdge.getType();
      if (incomingEdge_type.equals(EdgeType.CROSS_EDGE))
      {
         return new Object[] { incomingEdge };
      }

      return null;
   }

   public static final Object[] pattern_JoinNodeFinder_1_5_RecategorizeCrossEdge_greenB(Edge incomingEdge)
   {
      EdgeType incomingEdge_type_prime = EdgeType.TREE_EDGE;
      incomingEdge.setType(incomingEdge_type_prime);
      return new Object[] { incomingEdge };
   }

   public static final Object[] pattern_JoinNodeFinder_1_6_RegularJoinNodeFound_blackBB(Node node, JoinNodeFinder _this)
   {
      return new Object[] { node, _this };
   }

   public static final Object[] pattern_JoinNodeFinder_1_6_RegularJoinNodeFound_greenBB(Node node, JoinNodeFinder _this)
   {
      _this.getJoinNodes().add(node);
      return new Object[] { node, _this };
   }

   public static final EObject pattern_JoinNodeFinder_1_7_Delegation_expressionFBB(EdgeProcessor delegate, Node node)
   {
      EObject _localVariable_0 = delegate.processNode(node);
      EObject _result = _localVariable_0;
      return _result;
   }

   public static final EObject pattern_JoinNodeFinder_1_8_expressionF()
   {
      EObject _result = null;
      return _result;
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //JoinNodeFinderImpl
