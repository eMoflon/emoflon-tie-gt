/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow.impl;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.moflon.core.dfs.Edge;
import org.moflon.core.dfs.EdgeProcessor;
import org.moflon.core.dfs.EdgeType;
import org.moflon.core.dfs.Node;

import org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage;
import org.moflon.sdm.compiler.democles.validation.controlflow.TreeEdgeNavigator;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tree Edge Navigator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.TreeEdgeNavigatorImpl#getTerminalNode <em>Terminal Node</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.TreeEdgeNavigatorImpl#isForward <em>Forward</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TreeEdgeNavigatorImpl extends ValidatingEdgeProcessorImpl implements TreeEdgeNavigator
{
   /**
    * The cached value of the '{@link #getTerminalNode() <em>Terminal Node</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getTerminalNode()
    * @generated
    * @ordered
    */
   protected Node terminalNode;

   /**
    * The default value of the '{@link #isForward() <em>Forward</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isForward()
    * @generated
    * @ordered
    */
   protected static final boolean FORWARD_EDEFAULT = false;

   /**
    * The cached value of the '{@link #isForward() <em>Forward</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isForward()
    * @generated
    * @ordered
    */
   protected boolean forward = FORWARD_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected TreeEdgeNavigatorImpl()
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
      return ControlflowPackage.Literals.TREE_EDGE_NAVIGATOR;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node getTerminalNode()
   {
      if (terminalNode != null && terminalNode.eIsProxy())
      {
         InternalEObject oldTerminalNode = (InternalEObject) terminalNode;
         terminalNode = (Node) eResolveProxy(oldTerminalNode);
         if (terminalNode != oldTerminalNode)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlflowPackage.TREE_EDGE_NAVIGATOR__TERMINAL_NODE, oldTerminalNode, terminalNode));
         }
      }
      return terminalNode;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node basicGetTerminalNode()
   {
      return terminalNode;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setTerminalNode(Node newTerminalNode)
   {
      Node oldTerminalNode = terminalNode;
      terminalNode = newTerminalNode;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.TREE_EDGE_NAVIGATOR__TERMINAL_NODE, oldTerminalNode, terminalNode));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isForward()
   {
      return forward;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setForward(boolean newForward)
   {
      boolean oldForward = forward;
      forward = newForward;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.TREE_EDGE_NAVIGATOR__FORWARD, oldForward, forward));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EObject processEdge(Edge edge)
   {// 
      Object[] result1_black = TreeEdgeNavigatorImpl.pattern_TreeEdgeNavigator_0_1_LookupDelegate_blackFB(this);
      if (result1_black != null)
      {
         EdgeProcessor delegate = (EdgeProcessor) result1_black[0];
         // 
         Object[] result2_black = TreeEdgeNavigatorImpl.pattern_TreeEdgeNavigator_0_2_IsForwardNavigation_blackB(this);
         if (result2_black != null)
         {
            // 
            Object[] result3_black = TreeEdgeNavigatorImpl.pattern_TreeEdgeNavigator_0_3_LookupTargetNode_blackFB(edge);
            if (result3_black != null)
            {
               Node targetNode = (Node) result3_black[0];
               // 
               Object[] result4_bindingAndBlack = TreeEdgeNavigatorImpl.pattern_TreeEdgeNavigator_0_4_RecursionForward_bindingAndBlackFBB(delegate, targetNode);
               if (result4_bindingAndBlack != null)
               {
                  EObject fwdResult = (EObject) result4_bindingAndBlack[0];
                  return TreeEdgeNavigatorImpl.pattern_TreeEdgeNavigator_0_5_expressionFB(fwdResult);
               } else
               {
                  return TreeEdgeNavigatorImpl.pattern_TreeEdgeNavigator_0_6_expressionF();
               }

            } else
            {
               return TreeEdgeNavigatorImpl.pattern_TreeEdgeNavigator_0_7_expressionF();
            }

         } else
         {
            // 
            Object[] result8_black = TreeEdgeNavigatorImpl.pattern_TreeEdgeNavigator_0_8_LookupSourceNode_blackFB(edge);
            if (result8_black != null)
            {
               Node sourceNode = (Node) result8_black[0];
               // 
               Object[] result9_bindingAndBlack = TreeEdgeNavigatorImpl.pattern_TreeEdgeNavigator_0_9_RecursionBackward_bindingAndBlackFBB(delegate,
                     sourceNode);
               if (result9_bindingAndBlack != null)
               {
                  EObject bwdResult = (EObject) result9_bindingAndBlack[0];
                  return TreeEdgeNavigatorImpl.pattern_TreeEdgeNavigator_0_10_expressionFB(bwdResult);
               } else
               {
                  return TreeEdgeNavigatorImpl.pattern_TreeEdgeNavigator_0_11_expressionF();
               }

            } else
            {
               return TreeEdgeNavigatorImpl.pattern_TreeEdgeNavigator_0_12_expressionF();
            }

         }

      } else
      {
         return TreeEdgeNavigatorImpl.pattern_TreeEdgeNavigator_0_13_expressionF();
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EObject processNode(Node node)
   {// 
      Object[] result1_black = TreeEdgeNavigatorImpl.pattern_TreeEdgeNavigator_1_1_TerminationCheck_blackBB(this, node);
      if (result1_black != null)
      {
         return TreeEdgeNavigatorImpl.pattern_TreeEdgeNavigator_1_2_expressionF();
      } else
      {
         // 
         Object[] result3_black = TreeEdgeNavigatorImpl.pattern_TreeEdgeNavigator_1_3_LookupDelegate_blackBF(this);
         if (result3_black != null)
         {
            EdgeProcessor delegate = (EdgeProcessor) result3_black[1];
            // 
            Object[] result4_black = TreeEdgeNavigatorImpl.pattern_TreeEdgeNavigator_1_4_IsForwardNavigation_blackB(this);
            if (result4_black != null)
            {
               // ForEach 
               for (Object[] result5_black : TreeEdgeNavigatorImpl.pattern_TreeEdgeNavigator_1_5_LookupOutgoingTreeEdges_blackBF(node))
               {
                  Edge outgoingTreeEdge = (Edge) result5_black[1];
                  // 
                  Object[] result6_bindingAndBlack = TreeEdgeNavigatorImpl.pattern_TreeEdgeNavigator_1_6_RecursionForward_bindingAndBlackFBB(delegate,
                        outgoingTreeEdge);
                  if (result6_bindingAndBlack != null)
                  {
                     //nothing EObject fwdResult = (EObject) result6_bindingAndBlack[0];
                  } else
                  {
                  }

               }
               return TreeEdgeNavigatorImpl.pattern_TreeEdgeNavigator_1_7_expressionF();
            } else
            {
               // 
               Object[] result8_black = TreeEdgeNavigatorImpl.pattern_TreeEdgeNavigator_1_8_LookupIncomingTreeEdge_blackBF(node);
               if (result8_black != null)
               {
                  Edge incomingTreeEdge = (Edge) result8_black[1];
                  // 
                  Object[] result9_bindingAndBlack = TreeEdgeNavigatorImpl.pattern_TreeEdgeNavigator_1_9_RecursionBackward_bindingAndBlackFBB(delegate,
                        incomingTreeEdge);
                  if (result9_bindingAndBlack != null)
                  {
                     EObject bwdResult = (EObject) result9_bindingAndBlack[0];
                     return TreeEdgeNavigatorImpl.pattern_TreeEdgeNavigator_1_10_expressionFB(bwdResult);
                  } else
                  {
                     return TreeEdgeNavigatorImpl.pattern_TreeEdgeNavigator_1_11_expressionF();
                  }

               } else
               {
                  return TreeEdgeNavigatorImpl.pattern_TreeEdgeNavigator_1_12_expressionF();
               }

            }

         } else
         {
            return TreeEdgeNavigatorImpl.pattern_TreeEdgeNavigator_1_13_expressionF();
         }

      }

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
      case ControlflowPackage.TREE_EDGE_NAVIGATOR__TERMINAL_NODE:
         if (resolve)
            return getTerminalNode();
         return basicGetTerminalNode();
      case ControlflowPackage.TREE_EDGE_NAVIGATOR__FORWARD:
         return isForward();
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
      case ControlflowPackage.TREE_EDGE_NAVIGATOR__TERMINAL_NODE:
         setTerminalNode((Node) newValue);
         return;
      case ControlflowPackage.TREE_EDGE_NAVIGATOR__FORWARD:
         setForward((Boolean) newValue);
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
      case ControlflowPackage.TREE_EDGE_NAVIGATOR__TERMINAL_NODE:
         setTerminalNode((Node) null);
         return;
      case ControlflowPackage.TREE_EDGE_NAVIGATOR__FORWARD:
         setForward(FORWARD_EDEFAULT);
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
      case ControlflowPackage.TREE_EDGE_NAVIGATOR__TERMINAL_NODE:
         return terminalNode != null;
      case ControlflowPackage.TREE_EDGE_NAVIGATOR__FORWARD:
         return forward != FORWARD_EDEFAULT;
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
      case ControlflowPackage.TREE_EDGE_NAVIGATOR___PROCESS_EDGE__EDGE:
         return processEdge((Edge) arguments.get(0));
      case ControlflowPackage.TREE_EDGE_NAVIGATOR___PROCESS_NODE__NODE:
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
      result.append(" (forward: ");
      result.append(forward);
      result.append(')');
      return result.toString();
   }

   public static final Object[] pattern_TreeEdgeNavigator_0_1_LookupDelegate_blackFB(TreeEdgeNavigator _this)
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

   public static final Object[] pattern_TreeEdgeNavigator_0_2_IsForwardNavigation_blackB(TreeEdgeNavigator _this)
   {
      boolean this_forward = _this.isForward();
      if (Boolean.valueOf(this_forward).equals(Boolean.valueOf(true)))
      {
         return new Object[] { _this };
      }

      return null;
   }

   public static final Object[] pattern_TreeEdgeNavigator_0_3_LookupTargetNode_blackFB(Edge edge)
   {
      Node targetNode = edge.getTarget();
      if (targetNode != null)
      {
         return new Object[] { targetNode, edge };
      }

      return null;
   }

   public static final Object[] pattern_TreeEdgeNavigator_0_4_RecursionForward_bindingFBB(EdgeProcessor delegate, Node targetNode)
   {
      EObject _localVariable_0 = delegate.processNode(targetNode);
      EObject fwdResult = _localVariable_0;
      if (fwdResult != null)
      {
         return new Object[] { fwdResult, delegate, targetNode };
      }
      return null;
   }

   public static final Object[] pattern_TreeEdgeNavigator_0_4_RecursionForward_blackB(EObject fwdResult)
   {
      return new Object[] { fwdResult };
   }

   public static final Object[] pattern_TreeEdgeNavigator_0_4_RecursionForward_bindingAndBlackFBB(EdgeProcessor delegate, Node targetNode)
   {
      Object[] result_pattern_TreeEdgeNavigator_0_4_RecursionForward_binding = pattern_TreeEdgeNavigator_0_4_RecursionForward_bindingFBB(delegate, targetNode);
      if (result_pattern_TreeEdgeNavigator_0_4_RecursionForward_binding != null)
      {
         EObject fwdResult = (EObject) result_pattern_TreeEdgeNavigator_0_4_RecursionForward_binding[0];

         Object[] result_pattern_TreeEdgeNavigator_0_4_RecursionForward_black = pattern_TreeEdgeNavigator_0_4_RecursionForward_blackB(fwdResult);
         if (result_pattern_TreeEdgeNavigator_0_4_RecursionForward_black != null)
         {

            return new Object[] { fwdResult, delegate, targetNode };
         }
      }
      return null;
   }

   public static final EObject pattern_TreeEdgeNavigator_0_5_expressionFB(EObject fwdResult)
   {
      EObject _result = fwdResult;
      return _result;
   }

   public static final EObject pattern_TreeEdgeNavigator_0_6_expressionF()
   {
      EObject _result = null;
      return _result;
   }

   public static final EObject pattern_TreeEdgeNavigator_0_7_expressionF()
   {
      EObject _result = null;
      return _result;
   }

   public static final Object[] pattern_TreeEdgeNavigator_0_8_LookupSourceNode_blackFB(Edge edge)
   {
      Node sourceNode = edge.getSource();
      if (sourceNode != null)
      {
         return new Object[] { sourceNode, edge };
      }

      return null;
   }

   public static final Object[] pattern_TreeEdgeNavigator_0_9_RecursionBackward_bindingFBB(EdgeProcessor delegate, Node sourceNode)
   {
      EObject _localVariable_0 = delegate.processNode(sourceNode);
      EObject bwdResult = _localVariable_0;
      if (bwdResult != null)
      {
         return new Object[] { bwdResult, delegate, sourceNode };
      }
      return null;
   }

   public static final Object[] pattern_TreeEdgeNavigator_0_9_RecursionBackward_blackB(EObject bwdResult)
   {
      return new Object[] { bwdResult };
   }

   public static final Object[] pattern_TreeEdgeNavigator_0_9_RecursionBackward_bindingAndBlackFBB(EdgeProcessor delegate, Node sourceNode)
   {
      Object[] result_pattern_TreeEdgeNavigator_0_9_RecursionBackward_binding = pattern_TreeEdgeNavigator_0_9_RecursionBackward_bindingFBB(delegate,
            sourceNode);
      if (result_pattern_TreeEdgeNavigator_0_9_RecursionBackward_binding != null)
      {
         EObject bwdResult = (EObject) result_pattern_TreeEdgeNavigator_0_9_RecursionBackward_binding[0];

         Object[] result_pattern_TreeEdgeNavigator_0_9_RecursionBackward_black = pattern_TreeEdgeNavigator_0_9_RecursionBackward_blackB(bwdResult);
         if (result_pattern_TreeEdgeNavigator_0_9_RecursionBackward_black != null)
         {

            return new Object[] { bwdResult, delegate, sourceNode };
         }
      }
      return null;
   }

   public static final EObject pattern_TreeEdgeNavigator_0_10_expressionFB(EObject bwdResult)
   {
      EObject _result = bwdResult;
      return _result;
   }

   public static final EObject pattern_TreeEdgeNavigator_0_11_expressionF()
   {
      EObject _result = null;
      return _result;
   }

   public static final EObject pattern_TreeEdgeNavigator_0_12_expressionF()
   {
      EObject _result = null;
      return _result;
   }

   public static final EObject pattern_TreeEdgeNavigator_0_13_expressionF()
   {
      EObject _result = null;
      return _result;
   }

   public static final Object[] pattern_TreeEdgeNavigator_1_1_TerminationCheck_blackBB(TreeEdgeNavigator _this, Node node)
   {
      if (node.equals(_this.getTerminalNode()))
      {
         return new Object[] { _this, node };
      }
      return null;
   }

   public static final EObject pattern_TreeEdgeNavigator_1_2_expressionF()
   {
      EObject _result = null;
      return _result;
   }

   public static final Object[] pattern_TreeEdgeNavigator_1_3_LookupDelegate_blackBF(TreeEdgeNavigator _this)
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

   public static final Object[] pattern_TreeEdgeNavigator_1_4_IsForwardNavigation_blackB(TreeEdgeNavigator _this)
   {
      boolean this_forward = _this.isForward();
      if (Boolean.valueOf(this_forward).equals(Boolean.valueOf(true)))
      {
         return new Object[] { _this };
      }

      return null;
   }

   public static final Iterable<Object[]> pattern_TreeEdgeNavigator_1_5_LookupOutgoingTreeEdges_blackBF(Node node)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (Edge outgoingTreeEdge : node.getOutgoing())
      {
         EdgeType outgoingTreeEdge_type = outgoingTreeEdge.getType();
         if (outgoingTreeEdge_type.equals(EdgeType.TREE_EDGE))
         {
            _result.add(new Object[] { node, outgoingTreeEdge });
         }

      }
      return _result;
   }

   public static final Object[] pattern_TreeEdgeNavigator_1_6_RecursionForward_bindingFBB(EdgeProcessor delegate, Edge outgoingTreeEdge)
   {
      EObject _localVariable_0 = delegate.processEdge(outgoingTreeEdge);
      EObject fwdResult = _localVariable_0;
      if (fwdResult != null)
      {
         return new Object[] { fwdResult, delegate, outgoingTreeEdge };
      }
      return null;
   }

   public static final Object[] pattern_TreeEdgeNavigator_1_6_RecursionForward_blackB(EObject fwdResult)
   {
      return new Object[] { fwdResult };
   }

   public static final Object[] pattern_TreeEdgeNavigator_1_6_RecursionForward_bindingAndBlackFBB(EdgeProcessor delegate, Edge outgoingTreeEdge)
   {
      Object[] result_pattern_TreeEdgeNavigator_1_6_RecursionForward_binding = pattern_TreeEdgeNavigator_1_6_RecursionForward_bindingFBB(delegate,
            outgoingTreeEdge);
      if (result_pattern_TreeEdgeNavigator_1_6_RecursionForward_binding != null)
      {
         EObject fwdResult = (EObject) result_pattern_TreeEdgeNavigator_1_6_RecursionForward_binding[0];

         Object[] result_pattern_TreeEdgeNavigator_1_6_RecursionForward_black = pattern_TreeEdgeNavigator_1_6_RecursionForward_blackB(fwdResult);
         if (result_pattern_TreeEdgeNavigator_1_6_RecursionForward_black != null)
         {

            return new Object[] { fwdResult, delegate, outgoingTreeEdge };
         }
      }
      return null;
   }

   public static final EObject pattern_TreeEdgeNavigator_1_7_expressionF()
   {
      EObject _result = null;
      return _result;
   }

   public static final Object[] pattern_TreeEdgeNavigator_1_8_LookupIncomingTreeEdge_blackBF(Node node)
   {
      for (Edge incomingTreeEdge : node.getIncoming())
      {
         EdgeType incomingTreeEdge_type = incomingTreeEdge.getType();
         if (incomingTreeEdge_type.equals(EdgeType.TREE_EDGE))
         {
            return new Object[] { node, incomingTreeEdge };
         }

      }
      return null;
   }

   public static final Object[] pattern_TreeEdgeNavigator_1_9_RecursionBackward_bindingFBB(EdgeProcessor delegate, Edge incomingTreeEdge)
   {
      EObject _localVariable_0 = delegate.processEdge(incomingTreeEdge);
      EObject bwdResult = _localVariable_0;
      if (bwdResult != null)
      {
         return new Object[] { bwdResult, delegate, incomingTreeEdge };
      }
      return null;
   }

   public static final Object[] pattern_TreeEdgeNavigator_1_9_RecursionBackward_blackB(EObject bwdResult)
   {
      return new Object[] { bwdResult };
   }

   public static final Object[] pattern_TreeEdgeNavigator_1_9_RecursionBackward_bindingAndBlackFBB(EdgeProcessor delegate, Edge incomingTreeEdge)
   {
      Object[] result_pattern_TreeEdgeNavigator_1_9_RecursionBackward_binding = pattern_TreeEdgeNavigator_1_9_RecursionBackward_bindingFBB(delegate,
            incomingTreeEdge);
      if (result_pattern_TreeEdgeNavigator_1_9_RecursionBackward_binding != null)
      {
         EObject bwdResult = (EObject) result_pattern_TreeEdgeNavigator_1_9_RecursionBackward_binding[0];

         Object[] result_pattern_TreeEdgeNavigator_1_9_RecursionBackward_black = pattern_TreeEdgeNavigator_1_9_RecursionBackward_blackB(bwdResult);
         if (result_pattern_TreeEdgeNavigator_1_9_RecursionBackward_black != null)
         {

            return new Object[] { bwdResult, delegate, incomingTreeEdge };
         }
      }
      return null;
   }

   public static final EObject pattern_TreeEdgeNavigator_1_10_expressionFB(EObject bwdResult)
   {
      EObject _result = bwdResult;
      return _result;
   }

   public static final EObject pattern_TreeEdgeNavigator_1_11_expressionF()
   {
      EObject _result = null;
      return _result;
   }

   public static final EObject pattern_TreeEdgeNavigator_1_12_expressionF()
   {
      EObject _result = null;
      return _result;
   }

   public static final EObject pattern_TreeEdgeNavigator_1_13_expressionF()
   {
      EObject _result = null;
      return _result;
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //TreeEdgeNavigatorImpl
