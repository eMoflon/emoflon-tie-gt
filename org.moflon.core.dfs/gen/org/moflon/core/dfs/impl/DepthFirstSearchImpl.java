/**
 */
package org.moflon.core.dfs.impl;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.DepthFirstSearch;
import org.moflon.core.dfs.DfsPackage;
import org.moflon.core.dfs.Edge;
import org.moflon.core.dfs.EdgeProcessor;
import org.moflon.core.dfs.EdgeType;
import org.moflon.core.dfs.Node;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Depth First Search</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.core.dfs.impl.DepthFirstSearchImpl#getPostTraversalCounter <em>Post Traversal Counter</em>}</li>
 *   <li>{@link org.moflon.core.dfs.impl.DepthFirstSearchImpl#getPreTraversalCounter <em>Pre Traversal Counter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DepthFirstSearchImpl extends EdgeProcessorImpl implements DepthFirstSearch
{
   /**
    * The default value of the '{@link #getPostTraversalCounter() <em>Post Traversal Counter</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getPostTraversalCounter()
    * @generated
    * @ordered
    */
   protected static final int POST_TRAVERSAL_COUNTER_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getPostTraversalCounter() <em>Post Traversal Counter</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getPostTraversalCounter()
    * @generated
    * @ordered
    */
   protected int postTraversalCounter = POST_TRAVERSAL_COUNTER_EDEFAULT;

   /**
    * The default value of the '{@link #getPreTraversalCounter() <em>Pre Traversal Counter</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getPreTraversalCounter()
    * @generated
    * @ordered
    */
   protected static final int PRE_TRAVERSAL_COUNTER_EDEFAULT = 0;

   /**
    * The cached value of the '{@link #getPreTraversalCounter() <em>Pre Traversal Counter</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getPreTraversalCounter()
    * @generated
    * @ordered
    */
   protected int preTraversalCounter = PRE_TRAVERSAL_COUNTER_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected DepthFirstSearchImpl()
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
      return DfsPackage.Literals.DEPTH_FIRST_SEARCH;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getPostTraversalCounter()
   {
      return postTraversalCounter;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setPostTraversalCounter(int newPostTraversalCounter)
   {
      int oldPostTraversalCounter = postTraversalCounter;
      postTraversalCounter = newPostTraversalCounter;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DfsPackage.DEPTH_FIRST_SEARCH__POST_TRAVERSAL_COUNTER, oldPostTraversalCounter,
               postTraversalCounter));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int getPreTraversalCounter()
   {
      return preTraversalCounter;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setPreTraversalCounter(int newPreTraversalCounter)
   {
      int oldPreTraversalCounter = preTraversalCounter;
      preTraversalCounter = newPreTraversalCounter;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, DfsPackage.DEPTH_FIRST_SEARCH__PRE_TRAVERSAL_COUNTER, oldPreTraversalCounter,
               preTraversalCounter));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int incrementPostTraversalCounter()
   {
      // [user code injected with eMoflon]

      return getPostTraversalCounter() + 1;

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public int incrementPreTraversalCounter()
   {
      // [user code injected with eMoflon]

      return getPreTraversalCounter() + 1;

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EObject processEdge(Edge edge)
   {

      Object[] result1_black = DepthFirstSearchImpl.pattern_DepthFirstSearch_2_1_LookupSourceNode_blackFB(edge);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[edge] = " + edge + ".");
      }
      Node sourceNode = (Node) result1_black[0];

      Object[] result2_black = DepthFirstSearchImpl.pattern_DepthFirstSearch_2_2_LookupTargetNode_blackBF(edge);
      if (result2_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[edge] = " + edge + ".");
      }
      Node targetNode = (Node) result2_black[1];
      // 
      Object[] result3_black = DepthFirstSearchImpl.pattern_DepthFirstSearch_2_3_SetTreeEdge_blackBB(targetNode, edge);
      if (result3_black != null)
      {
         DepthFirstSearchImpl.pattern_DepthFirstSearch_2_3_SetTreeEdge_greenB(edge);

         // 
         Object[] result4_black = DepthFirstSearchImpl.pattern_DepthFirstSearch_2_4_LookupDelegate_blackFB(this);
         if (result4_black != null)
         {
            EdgeProcessor delegate = (EdgeProcessor) result4_black[0];
            // 
            Object[] result5_bindingAndBlack = DepthFirstSearchImpl.pattern_DepthFirstSearch_2_5_ProcessEdge_bindingAndBlackFBB(delegate, targetNode);
            if (result5_bindingAndBlack != null)
            {
               EObject result = (EObject) result5_bindingAndBlack[0];
               return DepthFirstSearchImpl.pattern_DepthFirstSearch_2_6_expressionFB(result);
            } else
            {
            }

         } else
         {
         }
         return DepthFirstSearchImpl.pattern_DepthFirstSearch_2_7_expressionF();
      } else
      {
         // 
         Object[] result8_black = DepthFirstSearchImpl.pattern_DepthFirstSearch_2_8_SetForwardEdge_blackBBB(sourceNode, edge, targetNode);
         if (result8_black != null)
         {
            DepthFirstSearchImpl.pattern_DepthFirstSearch_2_8_SetForwardEdge_greenB(edge);

            return DepthFirstSearchImpl.pattern_DepthFirstSearch_2_9_expressionF();
         } else
         {
            // 
            Object[] result10_black = DepthFirstSearchImpl.pattern_DepthFirstSearch_2_10_SetBackwardEdge_blackBB(edge, targetNode);
            if (result10_black != null)
            {
               DepthFirstSearchImpl.pattern_DepthFirstSearch_2_10_SetBackwardEdge_greenB(edge);

               return DepthFirstSearchImpl.pattern_DepthFirstSearch_2_11_expressionF();
            } else
            {

               Object[] result12_black = DepthFirstSearchImpl.pattern_DepthFirstSearch_2_12_SetCrossEdge_blackB(edge);
               if (result12_black == null)
               {
                  throw new RuntimeException("Pattern matching failed." + " Variables: " + "[edge] = " + edge + ".");
               }
               DepthFirstSearchImpl.pattern_DepthFirstSearch_2_12_SetCrossEdge_greenB(edge);

               return DepthFirstSearchImpl.pattern_DepthFirstSearch_2_13_expressionF();
            }

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

      Object[] result1_black = DepthFirstSearchImpl.pattern_DepthFirstSearch_3_1_LookupValidator_blackFB(node);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[node] = " + node + ".");
      }
      //nothing DFSGraph graph = (DFSGraph) result1_black[0];

      Object[] result2_black = DepthFirstSearchImpl.pattern_DepthFirstSearch_3_2_IncrementPreTraversalCounter_blackB(this);
      if (result2_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      DepthFirstSearchImpl.pattern_DepthFirstSearch_3_2_IncrementPreTraversalCounter_greenB(this);

      Object[] result3_black = DepthFirstSearchImpl.pattern_DepthFirstSearch_3_3_SetPreTraversalCounter_blackBB(node, this);
      if (result3_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[node] = " + node + ", " + "[this] = " + this + ".");
      }
      DepthFirstSearchImpl.pattern_DepthFirstSearch_3_3_SetPreTraversalCounter_greenBB(node, this);

      // 
      Object[] result4_black = DepthFirstSearchImpl.pattern_DepthFirstSearch_3_4_LookupDelegate_blackBF(this);
      if (result4_black != null)
      {
         EdgeProcessor delegate = (EdgeProcessor) result4_black[1];
         // ForEach 
         for (Object[] result5_black : DepthFirstSearchImpl.pattern_DepthFirstSearch_3_5_TraverseOutgoingEdges_blackFB(node))
         {
            Edge edge = (Edge) result5_black[0];
            // 
            DepthFirstSearchImpl.pattern_DepthFirstSearch_3_6_ExploreEdge_expressionFBB(delegate, edge);

         }

      } else
      {
      }

      Object[] result7_black = DepthFirstSearchImpl.pattern_DepthFirstSearch_3_7_IncrementPostTraversalCounter_blackB(this);
      if (result7_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      DepthFirstSearchImpl.pattern_DepthFirstSearch_3_7_IncrementPostTraversalCounter_greenB(this);

      Object[] result8_black = DepthFirstSearchImpl.pattern_DepthFirstSearch_3_8_SetPostTraversalCounter_blackBB(node, this);
      if (result8_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[node] = " + node + ", " + "[this] = " + this + ".");
      }
      DepthFirstSearchImpl.pattern_DepthFirstSearch_3_8_SetPostTraversalCounter_greenBB(node, this);

      return DepthFirstSearchImpl.pattern_DepthFirstSearch_3_9_expressionF();
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
      case DfsPackage.DEPTH_FIRST_SEARCH__POST_TRAVERSAL_COUNTER:
         return getPostTraversalCounter();
      case DfsPackage.DEPTH_FIRST_SEARCH__PRE_TRAVERSAL_COUNTER:
         return getPreTraversalCounter();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
      case DfsPackage.DEPTH_FIRST_SEARCH__POST_TRAVERSAL_COUNTER:
         setPostTraversalCounter((Integer) newValue);
         return;
      case DfsPackage.DEPTH_FIRST_SEARCH__PRE_TRAVERSAL_COUNTER:
         setPreTraversalCounter((Integer) newValue);
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
      case DfsPackage.DEPTH_FIRST_SEARCH__POST_TRAVERSAL_COUNTER:
         setPostTraversalCounter(POST_TRAVERSAL_COUNTER_EDEFAULT);
         return;
      case DfsPackage.DEPTH_FIRST_SEARCH__PRE_TRAVERSAL_COUNTER:
         setPreTraversalCounter(PRE_TRAVERSAL_COUNTER_EDEFAULT);
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
      case DfsPackage.DEPTH_FIRST_SEARCH__POST_TRAVERSAL_COUNTER:
         return postTraversalCounter != POST_TRAVERSAL_COUNTER_EDEFAULT;
      case DfsPackage.DEPTH_FIRST_SEARCH__PRE_TRAVERSAL_COUNTER:
         return preTraversalCounter != PRE_TRAVERSAL_COUNTER_EDEFAULT;
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
      case DfsPackage.DEPTH_FIRST_SEARCH___INCREMENT_POST_TRAVERSAL_COUNTER:
         return incrementPostTraversalCounter();
      case DfsPackage.DEPTH_FIRST_SEARCH___INCREMENT_PRE_TRAVERSAL_COUNTER:
         return incrementPreTraversalCounter();
      case DfsPackage.DEPTH_FIRST_SEARCH___PROCESS_EDGE__EDGE:
         return processEdge((Edge) arguments.get(0));
      case DfsPackage.DEPTH_FIRST_SEARCH___PROCESS_NODE__NODE:
         return processNode((Node) arguments.get(0));
      }
      return super.eInvoke(operationID, arguments);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString()
   {
      if (eIsProxy())
         return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (postTraversalCounter: ");
      result.append(postTraversalCounter);
      result.append(", preTraversalCounter: ");
      result.append(preTraversalCounter);
      result.append(')');
      return result.toString();
   }

   public static final Object[] pattern_DepthFirstSearch_2_1_LookupSourceNode_blackFB(Edge edge)
   {
      Node sourceNode = edge.getSource();
      if (sourceNode != null)
      {
         return new Object[] { sourceNode, edge };
      }

      return null;
   }

   public static final Object[] pattern_DepthFirstSearch_2_2_LookupTargetNode_blackBF(Edge edge)
   {
      Node targetNode = edge.getTarget();
      if (targetNode != null)
      {
         return new Object[] { edge, targetNode };
      }

      return null;
   }

   public static final Object[] pattern_DepthFirstSearch_2_3_SetTreeEdge_blackBB(Node targetNode, Edge edge)
   {
      int targetNode_preTraversal = targetNode.getPreTraversal();
      if (Integer.valueOf(targetNode_preTraversal).equals(Integer.valueOf(0)))
      {
         return new Object[] { targetNode, edge };
      }

      return null;
   }

   public static final Object[] pattern_DepthFirstSearch_2_3_SetTreeEdge_greenB(Edge edge)
   {
      EdgeType edge_type_prime = EdgeType.TREE_EDGE;
      edge.setType(edge_type_prime);
      return new Object[] { edge };
   }

   public static final Object[] pattern_DepthFirstSearch_2_4_LookupDelegate_blackFB(DepthFirstSearch _this)
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

   public static final Object[] pattern_DepthFirstSearch_2_5_ProcessEdge_bindingFBB(EdgeProcessor delegate, Node targetNode)
   {
      EObject _localVariable_0 = delegate.processNode(targetNode);
      EObject result = _localVariable_0;
      if (result != null)
      {
         return new Object[] { result, delegate, targetNode };
      }
      return null;
   }

   public static final Object[] pattern_DepthFirstSearch_2_5_ProcessEdge_blackB(EObject result)
   {
      return new Object[] { result };
   }

   public static final Object[] pattern_DepthFirstSearch_2_5_ProcessEdge_bindingAndBlackFBB(EdgeProcessor delegate, Node targetNode)
   {
      Object[] result_pattern_DepthFirstSearch_2_5_ProcessEdge_binding = pattern_DepthFirstSearch_2_5_ProcessEdge_bindingFBB(delegate, targetNode);
      if (result_pattern_DepthFirstSearch_2_5_ProcessEdge_binding != null)
      {
         EObject result = (EObject) result_pattern_DepthFirstSearch_2_5_ProcessEdge_binding[0];

         Object[] result_pattern_DepthFirstSearch_2_5_ProcessEdge_black = pattern_DepthFirstSearch_2_5_ProcessEdge_blackB(result);
         if (result_pattern_DepthFirstSearch_2_5_ProcessEdge_black != null)
         {

            return new Object[] { result, delegate, targetNode };
         }
      }
      return null;
   }

   public static final EObject pattern_DepthFirstSearch_2_6_expressionFB(EObject result)
   {
      EObject _result = result;
      return _result;
   }

   public static final EObject pattern_DepthFirstSearch_2_7_expressionF()
   {
      EObject _result = null;
      return _result;
   }

   public static final Object[] pattern_DepthFirstSearch_2_8_SetForwardEdge_blackBBB(Node sourceNode, Edge edge, Node targetNode)
   {
      if (!sourceNode.equals(targetNode))
      {
         int sourceNode_preTraversal = sourceNode.getPreTraversal();
         int targetNode_preTraversal = targetNode.getPreTraversal();
         if (Integer.valueOf(sourceNode_preTraversal).compareTo(Integer.valueOf(targetNode_preTraversal)) < 0)
         {
            return new Object[] { sourceNode, edge, targetNode };
         }

      }
      return null;
   }

   public static final Object[] pattern_DepthFirstSearch_2_8_SetForwardEdge_greenB(Edge edge)
   {
      EdgeType edge_type_prime = EdgeType.FORWARD_EDGE;
      edge.setType(edge_type_prime);
      return new Object[] { edge };
   }

   public static final EObject pattern_DepthFirstSearch_2_9_expressionF()
   {
      EObject _result = null;
      return _result;
   }

   public static final Object[] pattern_DepthFirstSearch_2_10_SetBackwardEdge_blackBB(Edge edge, Node targetNode)
   {
      int targetNode_postTraversal = targetNode.getPostTraversal();
      if (Integer.valueOf(targetNode_postTraversal).equals(Integer.valueOf(0)))
      {
         return new Object[] { edge, targetNode };
      }

      return null;
   }

   public static final Object[] pattern_DepthFirstSearch_2_10_SetBackwardEdge_greenB(Edge edge)
   {
      EdgeType edge_type_prime = EdgeType.BACKWARD_EDGE;
      edge.setType(edge_type_prime);
      return new Object[] { edge };
   }

   public static final EObject pattern_DepthFirstSearch_2_11_expressionF()
   {
      EObject _result = null;
      return _result;
   }

   public static final Object[] pattern_DepthFirstSearch_2_12_SetCrossEdge_blackB(Edge edge)
   {
      return new Object[] { edge };
   }

   public static final Object[] pattern_DepthFirstSearch_2_12_SetCrossEdge_greenB(Edge edge)
   {
      EdgeType edge_type_prime = EdgeType.CROSS_EDGE;
      edge.setType(edge_type_prime);
      return new Object[] { edge };
   }

   public static final EObject pattern_DepthFirstSearch_2_13_expressionF()
   {
      EObject _result = null;
      return _result;
   }

   public static final Object[] pattern_DepthFirstSearch_3_1_LookupValidator_blackFB(Node node)
   {
      DFSGraph graph = node.getGraph();
      if (graph != null)
      {
         return new Object[] { graph, node };
      }

      return null;
   }

   public static final Object[] pattern_DepthFirstSearch_3_2_IncrementPreTraversalCounter_blackB(DepthFirstSearch _this)
   {
      return new Object[] { _this };
   }

   public static final Object[] pattern_DepthFirstSearch_3_2_IncrementPreTraversalCounter_greenB(DepthFirstSearch _this)
   {
      int _localVariable_0 = _this.incrementPreTraversalCounter();
      int this_preTraversalCounter_prime = Integer.valueOf(_localVariable_0);
      _this.setPreTraversalCounter(Integer.valueOf(this_preTraversalCounter_prime));
      return new Object[] { _this };
   }

   public static final Object[] pattern_DepthFirstSearch_3_3_SetPreTraversalCounter_blackBB(Node node, DepthFirstSearch _this)
   {
      return new Object[] { node, _this };
   }

   public static final Object[] pattern_DepthFirstSearch_3_3_SetPreTraversalCounter_greenBB(Node node, DepthFirstSearch _this)
   {
      int this_preTraversalCounter = _this.getPreTraversalCounter();
      int node_preTraversal_prime = Integer.valueOf(this_preTraversalCounter);
      node.setPreTraversal(Integer.valueOf(node_preTraversal_prime));
      return new Object[] { node, _this };

   }

   public static final Object[] pattern_DepthFirstSearch_3_4_LookupDelegate_blackBF(DepthFirstSearch _this)
   {
      EdgeProcessor delegate = _this.getDelegate();
      if (delegate != null)
      {
         if (!delegate.equals(_this))
         {
            return new Object[] { _this, delegate };
         }
      }

      return null;
   }

   public static final Iterable<Object[]> pattern_DepthFirstSearch_3_5_TraverseOutgoingEdges_blackFB(Node node)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (Edge edge : node.getOutgoing())
      {
         _result.add(new Object[] { edge, node });
      }
      return _result;
   }

   public static final EObject pattern_DepthFirstSearch_3_6_ExploreEdge_expressionFBB(EdgeProcessor delegate, Edge edge)
   {
      EObject _localVariable_0 = delegate.processEdge(edge);
      EObject _result = _localVariable_0;
      return _result;
   }

   public static final Object[] pattern_DepthFirstSearch_3_7_IncrementPostTraversalCounter_blackB(DepthFirstSearch _this)
   {
      return new Object[] { _this };
   }

   public static final Object[] pattern_DepthFirstSearch_3_7_IncrementPostTraversalCounter_greenB(DepthFirstSearch _this)
   {
      int _localVariable_0 = _this.incrementPostTraversalCounter();
      int this_postTraversalCounter_prime = Integer.valueOf(_localVariable_0);
      _this.setPostTraversalCounter(Integer.valueOf(this_postTraversalCounter_prime));
      return new Object[] { _this };
   }

   public static final Object[] pattern_DepthFirstSearch_3_8_SetPostTraversalCounter_blackBB(Node node, DepthFirstSearch _this)
   {
      return new Object[] { node, _this };
   }

   public static final Object[] pattern_DepthFirstSearch_3_8_SetPostTraversalCounter_greenBB(Node node, DepthFirstSearch _this)
   {
      int this_postTraversalCounter = _this.getPostTraversalCounter();
      int node_postTraversal_prime = Integer.valueOf(this_postTraversalCounter);
      node.setPostTraversal(Integer.valueOf(node_postTraversal_prime));
      return new Object[] { node, _this };

   }

   public static final EObject pattern_DepthFirstSearch_3_9_expressionF()
   {
      EObject _result = null;
      return _result;
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //DepthFirstSearchImpl
