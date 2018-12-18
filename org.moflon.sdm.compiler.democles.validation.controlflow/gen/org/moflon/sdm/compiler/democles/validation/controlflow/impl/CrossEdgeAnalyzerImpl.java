/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow.impl;

import SDMLanguage.activities.ActivityEdge;
import SDMLanguage.activities.EdgeGuard;
import SDMLanguage.activities.StoryNode;

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
import org.moflon.sdm.compiler.democles.validation.controlflow.CrossEdgeAnalyzer;
import org.moflon.sdm.compiler.democles.validation.controlflow.Errors;
import org.moflon.sdm.compiler.democles.validation.controlflow.SubTreeTester;
import org.moflon.sdm.compiler.democles.validation.controlflow.Validator;

import org.moflon.sdm.compiler.democles.validation.result.ErrorMessage;
import org.moflon.sdm.compiler.democles.validation.result.ResultFactory;
import org.moflon.sdm.compiler.democles.validation.result.Severity;
import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cross Edge Analyzer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.CrossEdgeAnalyzerImpl#getMiddleRoot <em>Middle Root</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.CrossEdgeAnalyzerImpl#getLowerTreeTester <em>Lower Tree Tester</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CrossEdgeAnalyzerImpl extends ValidatingEdgeProcessorImpl implements CrossEdgeAnalyzer
{
   /**
    * The cached value of the '{@link #getMiddleRoot() <em>Middle Root</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getMiddleRoot()
    * @generated
    * @ordered
    */
   protected Node middleRoot;

   /**
    * The cached value of the '{@link #getLowerTreeTester() <em>Lower Tree Tester</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getLowerTreeTester()
    * @generated
    * @ordered
    */
   protected SubTreeTester lowerTreeTester;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected CrossEdgeAnalyzerImpl()
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
      return ControlflowPackage.Literals.CROSS_EDGE_ANALYZER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node getMiddleRoot()
   {
      if (middleRoot != null && middleRoot.eIsProxy())
      {
         InternalEObject oldMiddleRoot = (InternalEObject) middleRoot;
         middleRoot = (Node) eResolveProxy(oldMiddleRoot);
         if (middleRoot != oldMiddleRoot)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlflowPackage.CROSS_EDGE_ANALYZER__MIDDLE_ROOT, oldMiddleRoot, middleRoot));
         }
      }
      return middleRoot;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node basicGetMiddleRoot()
   {
      return middleRoot;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setMiddleRoot(Node newMiddleRoot)
   {
      Node oldMiddleRoot = middleRoot;
      middleRoot = newMiddleRoot;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.CROSS_EDGE_ANALYZER__MIDDLE_ROOT, oldMiddleRoot, middleRoot));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SubTreeTester getLowerTreeTester()
   {
      if (lowerTreeTester != null && lowerTreeTester.eIsProxy())
      {
         InternalEObject oldLowerTreeTester = (InternalEObject) lowerTreeTester;
         lowerTreeTester = (SubTreeTester) eResolveProxy(oldLowerTreeTester);
         if (lowerTreeTester != oldLowerTreeTester)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlflowPackage.CROSS_EDGE_ANALYZER__LOWER_TREE_TESTER, oldLowerTreeTester,
                     lowerTreeTester));
         }
      }
      return lowerTreeTester;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SubTreeTester basicGetLowerTreeTester()
   {
      return lowerTreeTester;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setLowerTreeTester(SubTreeTester newLowerTreeTester)
   {
      SubTreeTester oldLowerTreeTester = lowerTreeTester;
      lowerTreeTester = newLowerTreeTester;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.CROSS_EDGE_ANALYZER__LOWER_TREE_TESTER, oldLowerTreeTester, lowerTreeTester));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void deleteEdge(Edge edge)
   {// 
      Object[] result1_black = CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_0_1_HasValidator_blackBFFBF(this, edge);
      if (result1_black != null)
      {
         Validator validator = (Validator) result1_black[1];
         ValidationReport report = (ValidationReport) result1_black[2];
         ActivityEdge activityEdge = (ActivityEdge) result1_black[4];
         CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_0_1_HasValidator_greenBFBB(report, activityEdge, validator);
         //nothing ErrorMessage crossEdgeFoundMessage = (ErrorMessage) result1_green[1];

         Object[] result2_black = CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_0_2_DeleteEdge_blackFBF(edge);
         if (result2_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[edge] = " + edge + ".");
         }
         Node sourceNode = (Node) result2_black[0];
         Node targetNode = (Node) result2_black[2];
         CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_0_2_DeleteEdge_redBBB(sourceNode, edge, targetNode);

      } else
      {
      }
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isNodeInWrongComponent(Node node, int dynamicPreTraversal, int dynamicPostTraversal)
   {// 
      Object[] result1_black = CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_1_1_InitializeSubTreeTester_blackFB(this);
      if (result1_black != null)
      {
         SubTreeTester lowerTreeTester = (SubTreeTester) result1_black[0];
         // 
         if (CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_1_2_IsNodeInLowerTree_expressionFBB(lowerTreeTester, node))
         {
            return CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_1_3_expressionF();
         } else
         {
         }

      } else
      {
      }
      // 
      Object[] result4_black = CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_1_4_IsNodeInParameterTree_blackBBB(node, dynamicPreTraversal,
            dynamicPostTraversal);
      if (result4_black != null)
      {
         return CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_1_5_expressionF();
      } else
      {
         return CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_1_6_expressionF();
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EObject processNode(Node node)
   {

      Object[] result1_black = CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_2_1_LookupMiddleTreeRoot_blackBF(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      Node middleRoot = (Node) result1_black[1];
      // 
      Object[] result2_black = CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_2_2_IsForEachNodeWithEachTimeEdge_blackFBFFF(node);
      if (result2_black != null)
      {
         //nothing ActivityEdge actEachTimeEdge = (ActivityEdge) result2_black[0];
         //nothing StoryNode storyNode = (StoryNode) result2_black[2];
         Node eachTimeTarget = (Node) result2_black[3];
         //nothing Edge eachTimeEdge = (Edge) result2_black[4];
         // ForEach 
         for (Object[] result3_black : CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_2_3_IterateOnIncomingEdges2_blackFBF(node))
         {
            Edge nonCrossIncomingEdge = (Edge) result3_black[0];
            Node nonCrossPrevNode = (Node) result3_black[2];
            // 
            Object[] result4_black = CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_2_4_IsCrossEdge_blackB(nonCrossIncomingEdge);
            if (result4_black != null)
            {
               // 
               if (CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_2_5_EachTimeIncomingTest1_expressionFBBB(this, nonCrossPrevNode, eachTimeTarget))
               {
                  // 
                  if (CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_2_6_EachTimeIncomingTest3_expressionFBBB(this, nonCrossPrevNode, middleRoot))
                  {
                     // 
                     CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_2_7_HandleEachTimeIncomingCrossEdge1_expressionBB(this, nonCrossIncomingEdge);

                  } else
                  {
                  }

               } else
               {
               }

            } else
            {
               // 
               if (CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_2_8_EachTimeIncomingTest2_expressionFBBB(this, nonCrossPrevNode, middleRoot))
               {
                  // 
                  CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_2_9_HandleEachTimeIncomingCrossEdge2_expressionBB(this, nonCrossIncomingEdge);

               } else
               {
               }

            }

         }
         // ForEach 
         for (Object[] result10_black : CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_2_10_IterateOnOutgoingEdges2_blackFFB(node))
         {
            Edge fwdOutgoingEdge = (Edge) result10_black[0];
            Node fwdNextNode = (Node) result10_black[1];
            // 
            Object[] result11_black = CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_2_11_IsForwardEdge_blackB(fwdOutgoingEdge);
            if (result11_black != null)
            {
               // 
               if (CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_2_12_EachTimeOutgoingTest1_expressionFBBB(this, fwdNextNode, eachTimeTarget))
               {
                  // 
                  if (CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_2_13_EachTimeOutgoingTest3_expressionFBBB(this, fwdNextNode, middleRoot))
                  {
                     // 
                     CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_2_14_HandleEachTimeOutgoingCrossEdge1_expressionBB(this, fwdOutgoingEdge);

                  } else
                  {
                  }

               } else
               {
               }

            } else
            {
               // 
               if (CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_2_15_EachTimeOutgoingTest2_expressionFBBB(this, fwdNextNode, middleRoot))
               {
                  // 
                  CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_2_16_HandleEachTimeOutgoingCrossEdge2_expressionBB(this, fwdOutgoingEdge);

               } else
               {
               }

            }

         }

      } else
      {
         // ForEach 
         for (Object[] result17_black : CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_2_17_IterateOnIncomingEdges1_blackBFF(node))
         {
            Node prevNode = (Node) result17_black[1];
            Edge incomingEdge = (Edge) result17_black[2];
            // 
            if (CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_2_18_RegularIncomingTest_expressionFBBB(this, prevNode, middleRoot))
            {
               // 
               CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_2_19_HandleRegularIncomingCrossEdge_expressionBB(this, incomingEdge);

            } else
            {
            }

         }
         // ForEach 
         for (Object[] result20_black : CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_2_20_IterateOnOutgoingEdges_blackBFF(node))
         {
            Node nextNode = (Node) result20_black[1];
            Edge outgoingEdge = (Edge) result20_black[2];
            // 
            if (CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_2_21_RegularOutgoingTest_expressionFBBB(this, nextNode, middleRoot))
            {
               // 
               CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_2_22_HandleCrossEdge4_expressionBB(this, outgoingEdge);

            } else
            {
            }

         }

      }
      // 
      Object[] result23_black = CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_2_23_LookupDelegate_blackBF(this);
      if (result23_black != null)
      {
         EdgeProcessor delegate = (EdgeProcessor) result23_black[1];
         // 
         Object[] result24_bindingAndBlack = CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_2_24_Delegation_bindingAndBlackFBB(delegate, node);
         if (result24_bindingAndBlack != null)
         {
            EObject result = (EObject) result24_bindingAndBlack[0];
            return CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_2_25_expressionFB(result);
         } else
         {
         }

      } else
      {
      }
      return CrossEdgeAnalyzerImpl.pattern_CrossEdgeAnalyzer_2_26_expressionF();
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
      case ControlflowPackage.CROSS_EDGE_ANALYZER__MIDDLE_ROOT:
         if (resolve)
            return getMiddleRoot();
         return basicGetMiddleRoot();
      case ControlflowPackage.CROSS_EDGE_ANALYZER__LOWER_TREE_TESTER:
         if (resolve)
            return getLowerTreeTester();
         return basicGetLowerTreeTester();
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
      case ControlflowPackage.CROSS_EDGE_ANALYZER__MIDDLE_ROOT:
         setMiddleRoot((Node) newValue);
         return;
      case ControlflowPackage.CROSS_EDGE_ANALYZER__LOWER_TREE_TESTER:
         setLowerTreeTester((SubTreeTester) newValue);
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
      case ControlflowPackage.CROSS_EDGE_ANALYZER__MIDDLE_ROOT:
         setMiddleRoot((Node) null);
         return;
      case ControlflowPackage.CROSS_EDGE_ANALYZER__LOWER_TREE_TESTER:
         setLowerTreeTester((SubTreeTester) null);
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
      case ControlflowPackage.CROSS_EDGE_ANALYZER__MIDDLE_ROOT:
         return middleRoot != null;
      case ControlflowPackage.CROSS_EDGE_ANALYZER__LOWER_TREE_TESTER:
         return lowerTreeTester != null;
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
      case ControlflowPackage.CROSS_EDGE_ANALYZER___DELETE_EDGE__EDGE:
         deleteEdge((Edge) arguments.get(0));
         return null;
      case ControlflowPackage.CROSS_EDGE_ANALYZER___IS_NODE_IN_WRONG_COMPONENT__NODE_INT_INT:
         return isNodeInWrongComponent((Node) arguments.get(0), (Integer) arguments.get(1), (Integer) arguments.get(2));
      case ControlflowPackage.CROSS_EDGE_ANALYZER___PROCESS_NODE__NODE:
         return processNode((Node) arguments.get(0));
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_CrossEdgeAnalyzer_0_1_HasValidator_blackBFFBF(CrossEdgeAnalyzer _this, Edge edge)
   {
      Validator validator = _this.getValidator();
      if (validator != null)
      {
         EObject tmpActivityEdge = edge.getOrigin();
         if (tmpActivityEdge instanceof ActivityEdge)
         {
            ActivityEdge activityEdge = (ActivityEdge) tmpActivityEdge;
            ValidationReport report = validator.getValidationReport();
            if (report != null)
            {
               return new Object[] { _this, validator, report, edge, activityEdge };
            }

         }

      }

      return null;
   }

   public static final Object[] pattern_CrossEdgeAnalyzer_0_1_HasValidator_greenBFBB(ValidationReport report, ActivityEdge activityEdge, Validator validator)
   {
      ErrorMessage crossEdgeFoundMessage = ResultFactory.eINSTANCE.createErrorMessage();
      Severity crossEdgeFoundMessage_severity_prime = Severity.ERROR;
      String _localVariable_0 = validator.lookupErrorMessage(Errors.LOOP_CROSSING_EDGE);
      report.getErrorMessages().add(crossEdgeFoundMessage);
      crossEdgeFoundMessage.getLocation().add(activityEdge);
      crossEdgeFoundMessage.setSeverity(crossEdgeFoundMessage_severity_prime);
      String crossEdgeFoundMessage_id_prime = _localVariable_0;
      crossEdgeFoundMessage.setId(crossEdgeFoundMessage_id_prime);
      return new Object[] { report, crossEdgeFoundMessage, activityEdge, validator };
   }

   public static final Object[] pattern_CrossEdgeAnalyzer_0_2_DeleteEdge_blackFBF(Edge edge)
   {
      Node sourceNode = edge.getSource();
      if (sourceNode != null)
      {
         Node targetNode = edge.getTarget();
         if (targetNode != null)
         {
            if (!sourceNode.equals(targetNode))
            {
               return new Object[] { sourceNode, edge, targetNode };
            }
         }

      }

      return null;
   }

   public static final Object[] pattern_CrossEdgeAnalyzer_0_2_DeleteEdge_redBBB(Node sourceNode, Edge edge, Node targetNode)
   {
      sourceNode.getOutgoing().remove(edge);
      targetNode.getIncoming().remove(edge);
      return new Object[] { sourceNode, edge, targetNode };
   }

   public static final Object[] pattern_CrossEdgeAnalyzer_1_1_InitializeSubTreeTester_blackFB(CrossEdgeAnalyzer _this)
   {
      SubTreeTester lowerTreeTester = _this.getLowerTreeTester();
      if (lowerTreeTester != null)
      {
         return new Object[] { lowerTreeTester, _this };
      }

      return null;
   }

   public static final boolean pattern_CrossEdgeAnalyzer_1_2_IsNodeInLowerTree_expressionFBB(SubTreeTester lowerTreeTester, Node node)
   {
      boolean _localVariable_0 = lowerTreeTester.isInSubTree(node);
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final boolean pattern_CrossEdgeAnalyzer_1_3_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final Object[] pattern_CrossEdgeAnalyzer_1_4_IsNodeInParameterTree_blackBBB(Node node, int dynamicPreTraversal, int dynamicPostTraversal)
   {
      int node_preTraversal = node.getPreTraversal();
      if (Integer.valueOf(node_preTraversal).compareTo(Integer.valueOf(dynamicPreTraversal)) >= 0)
      {
         int node_postTraversal = node.getPostTraversal();
         if (Integer.valueOf(node_postTraversal).compareTo(Integer.valueOf(dynamicPostTraversal)) <= 0)
         {
            return new Object[] { node, dynamicPreTraversal, dynamicPostTraversal };
         }

      }

      return null;
   }

   public static final boolean pattern_CrossEdgeAnalyzer_1_5_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final boolean pattern_CrossEdgeAnalyzer_1_6_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final Object[] pattern_CrossEdgeAnalyzer_2_1_LookupMiddleTreeRoot_blackBF(CrossEdgeAnalyzer _this)
   {
      Node middleRoot = _this.getMiddleRoot();
      if (middleRoot != null)
      {
         return new Object[] { _this, middleRoot };
      }

      return null;
   }

   public static final Object[] pattern_CrossEdgeAnalyzer_2_2_IsForEachNodeWithEachTimeEdge_blackFBFFF(Node node)
   {
      EObject tmpStoryNode = node.getOrigin();
      if (tmpStoryNode instanceof StoryNode)
      {
         StoryNode storyNode = (StoryNode) tmpStoryNode;
         boolean storyNode_forEach = storyNode.isForEach();
         if (Boolean.valueOf(storyNode_forEach).equals(Boolean.valueOf(true)))
         {
            for (Edge eachTimeEdge : node.getOutgoing())
            {
               Node eachTimeTarget = eachTimeEdge.getTarget();
               if (eachTimeTarget != null)
               {
                  if (!eachTimeTarget.equals(node))
                  {
                     EObject tmpActEachTimeEdge = eachTimeEdge.getOrigin();
                     if (tmpActEachTimeEdge instanceof ActivityEdge)
                     {
                        ActivityEdge actEachTimeEdge = (ActivityEdge) tmpActEachTimeEdge;
                        EdgeType eachTimeEdge_type = eachTimeEdge.getType();
                        if (eachTimeEdge_type.equals(EdgeType.FORWARD_EDGE))
                        {
                           EdgeGuard actEachTimeEdge_guard = actEachTimeEdge.getGuard();
                           if (actEachTimeEdge_guard.equals(EdgeGuard.EACH_TIME))
                           {
                              return new Object[] { actEachTimeEdge, node, storyNode, eachTimeTarget, eachTimeEdge };
                           }

                        }

                     }

                  }
               }

            }
         }

      }

      return null;
   }

   public static final Iterable<Object[]> pattern_CrossEdgeAnalyzer_2_3_IterateOnIncomingEdges2_blackFBF(Node node)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (Edge nonCrossIncomingEdge : node.getIncoming())
      {
         Node nonCrossPrevNode = nonCrossIncomingEdge.getSource();
         if (nonCrossPrevNode != null)
         {
            if (!node.equals(nonCrossPrevNode))
            {
               EdgeType nonCrossIncomingEdge_type = nonCrossIncomingEdge.getType();
               if (!nonCrossIncomingEdge_type.equals(EdgeType.TREE_EDGE))
               {
                  _result.add(new Object[] { nonCrossIncomingEdge, node, nonCrossPrevNode });
               }

            }
         }

      }
      return _result;
   }

   public static final Object[] pattern_CrossEdgeAnalyzer_2_4_IsCrossEdge_blackB(Edge nonCrossIncomingEdge)
   {
      EdgeType nonCrossIncomingEdge_type = nonCrossIncomingEdge.getType();
      if (nonCrossIncomingEdge_type.equals(EdgeType.CROSS_EDGE))
      {
         return new Object[] { nonCrossIncomingEdge };
      }

      return null;
   }

   public static final boolean pattern_CrossEdgeAnalyzer_2_5_EachTimeIncomingTest1_expressionFBBB(CrossEdgeAnalyzer _this, Node nonCrossPrevNode,
         Node eachTimeTarget)
   {
      int eachTimeTarget_preTraversal = eachTimeTarget.getPreTraversal();
      int eachTimeTarget_postTraversal = eachTimeTarget.getPostTraversal();
      boolean _localVariable_0 = _this.isNodeInWrongComponent(nonCrossPrevNode, Integer.valueOf(eachTimeTarget_preTraversal),
            Integer.valueOf(eachTimeTarget_postTraversal));
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;

   }

   public static final boolean pattern_CrossEdgeAnalyzer_2_6_EachTimeIncomingTest3_expressionFBBB(CrossEdgeAnalyzer _this, Node nonCrossPrevNode,
         Node middleRoot)
   {
      int middleRoot_preTraversal = middleRoot.getPreTraversal();
      int middleRoot_postTraversal = middleRoot.getPostTraversal();
      boolean _localVariable_0 = _this.isNodeInWrongComponent(nonCrossPrevNode, Integer.valueOf(middleRoot_preTraversal),
            Integer.valueOf(middleRoot_postTraversal));
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;

   }

   public static final void pattern_CrossEdgeAnalyzer_2_7_HandleEachTimeIncomingCrossEdge1_expressionBB(CrossEdgeAnalyzer _this, Edge nonCrossIncomingEdge)
   {
      _this.deleteEdge(nonCrossIncomingEdge);

   }

   public static final boolean pattern_CrossEdgeAnalyzer_2_8_EachTimeIncomingTest2_expressionFBBB(CrossEdgeAnalyzer _this, Node nonCrossPrevNode,
         Node middleRoot)
   {
      int middleRoot_preTraversal = middleRoot.getPreTraversal();
      int middleRoot_postTraversal = middleRoot.getPostTraversal();
      boolean _localVariable_0 = _this.isNodeInWrongComponent(nonCrossPrevNode, Integer.valueOf(middleRoot_preTraversal),
            Integer.valueOf(middleRoot_postTraversal));
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;

   }

   public static final void pattern_CrossEdgeAnalyzer_2_9_HandleEachTimeIncomingCrossEdge2_expressionBB(CrossEdgeAnalyzer _this, Edge nonCrossIncomingEdge)
   {
      _this.deleteEdge(nonCrossIncomingEdge);

   }

   public static final Iterable<Object[]> pattern_CrossEdgeAnalyzer_2_10_IterateOnOutgoingEdges2_blackFFB(Node node)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (Edge fwdOutgoingEdge : node.getOutgoing())
      {
         Node fwdNextNode = fwdOutgoingEdge.getTarget();
         if (fwdNextNode != null)
         {
            if (!fwdNextNode.equals(node))
            {
               EdgeType fwdOutgoingEdge_type = fwdOutgoingEdge.getType();
               if (!fwdOutgoingEdge_type.equals(EdgeType.TREE_EDGE))
               {
                  _result.add(new Object[] { fwdOutgoingEdge, fwdNextNode, node });
               }

            }
         }

      }
      return _result;
   }

   public static final Object[] pattern_CrossEdgeAnalyzer_2_11_IsForwardEdge_blackB(Edge fwdOutgoingEdge)
   {
      EdgeType fwdOutgoingEdge_type = fwdOutgoingEdge.getType();
      if (fwdOutgoingEdge_type.equals(EdgeType.FORWARD_EDGE))
      {
         return new Object[] { fwdOutgoingEdge };
      }

      return null;
   }

   public static final boolean pattern_CrossEdgeAnalyzer_2_12_EachTimeOutgoingTest1_expressionFBBB(CrossEdgeAnalyzer _this, Node fwdNextNode,
         Node eachTimeTarget)
   {
      int eachTimeTarget_preTraversal = eachTimeTarget.getPreTraversal();
      int eachTimeTarget_postTraversal = eachTimeTarget.getPostTraversal();
      boolean _localVariable_0 = _this.isNodeInWrongComponent(fwdNextNode, Integer.valueOf(eachTimeTarget_preTraversal),
            Integer.valueOf(eachTimeTarget_postTraversal));
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;

   }

   public static final boolean pattern_CrossEdgeAnalyzer_2_13_EachTimeOutgoingTest3_expressionFBBB(CrossEdgeAnalyzer _this, Node fwdNextNode, Node middleRoot)
   {
      int middleRoot_preTraversal = middleRoot.getPreTraversal();
      int middleRoot_postTraversal = middleRoot.getPostTraversal();
      boolean _localVariable_0 = _this.isNodeInWrongComponent(fwdNextNode, Integer.valueOf(middleRoot_preTraversal), Integer.valueOf(middleRoot_postTraversal));
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;

   }

   public static final void pattern_CrossEdgeAnalyzer_2_14_HandleEachTimeOutgoingCrossEdge1_expressionBB(CrossEdgeAnalyzer _this, Edge fwdOutgoingEdge)
   {
      _this.deleteEdge(fwdOutgoingEdge);

   }

   public static final boolean pattern_CrossEdgeAnalyzer_2_15_EachTimeOutgoingTest2_expressionFBBB(CrossEdgeAnalyzer _this, Node fwdNextNode, Node middleRoot)
   {
      int middleRoot_preTraversal = middleRoot.getPreTraversal();
      int middleRoot_postTraversal = middleRoot.getPostTraversal();
      boolean _localVariable_0 = _this.isNodeInWrongComponent(fwdNextNode, Integer.valueOf(middleRoot_preTraversal), Integer.valueOf(middleRoot_postTraversal));
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;

   }

   public static final void pattern_CrossEdgeAnalyzer_2_16_HandleEachTimeOutgoingCrossEdge2_expressionBB(CrossEdgeAnalyzer _this, Edge fwdOutgoingEdge)
   {
      _this.deleteEdge(fwdOutgoingEdge);

   }

   public static final Iterable<Object[]> pattern_CrossEdgeAnalyzer_2_17_IterateOnIncomingEdges1_blackBFF(Node node)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (Edge incomingEdge : node.getIncoming())
      {
         Node prevNode = incomingEdge.getSource();
         if (prevNode != null)
         {
            if (!node.equals(prevNode))
            {
               EdgeType incomingEdge_type = incomingEdge.getType();
               if (!incomingEdge_type.equals(EdgeType.TREE_EDGE))
               {
                  _result.add(new Object[] { node, prevNode, incomingEdge });
               }

            }
         }

      }
      return _result;
   }

   public static final boolean pattern_CrossEdgeAnalyzer_2_18_RegularIncomingTest_expressionFBBB(CrossEdgeAnalyzer _this, Node prevNode, Node middleRoot)
   {
      int middleRoot_preTraversal = middleRoot.getPreTraversal();
      int middleRoot_postTraversal = middleRoot.getPostTraversal();
      boolean _localVariable_0 = _this.isNodeInWrongComponent(prevNode, Integer.valueOf(middleRoot_preTraversal), Integer.valueOf(middleRoot_postTraversal));
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;

   }

   public static final void pattern_CrossEdgeAnalyzer_2_19_HandleRegularIncomingCrossEdge_expressionBB(CrossEdgeAnalyzer _this, Edge incomingEdge)
   {
      _this.deleteEdge(incomingEdge);

   }

   public static final Iterable<Object[]> pattern_CrossEdgeAnalyzer_2_20_IterateOnOutgoingEdges_blackBFF(Node node)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (Edge outgoingEdge : node.getOutgoing())
      {
         Node nextNode = outgoingEdge.getTarget();
         if (nextNode != null)
         {
            if (!nextNode.equals(node))
            {
               EdgeType outgoingEdge_type = outgoingEdge.getType();
               if (!outgoingEdge_type.equals(EdgeType.TREE_EDGE))
               {
                  _result.add(new Object[] { node, nextNode, outgoingEdge });
               }

            }
         }

      }
      return _result;
   }

   public static final boolean pattern_CrossEdgeAnalyzer_2_21_RegularOutgoingTest_expressionFBBB(CrossEdgeAnalyzer _this, Node nextNode, Node middleRoot)
   {
      int middleRoot_preTraversal = middleRoot.getPreTraversal();
      int middleRoot_postTraversal = middleRoot.getPostTraversal();
      boolean _localVariable_0 = _this.isNodeInWrongComponent(nextNode, Integer.valueOf(middleRoot_preTraversal), Integer.valueOf(middleRoot_postTraversal));
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;

   }

   public static final void pattern_CrossEdgeAnalyzer_2_22_HandleCrossEdge4_expressionBB(CrossEdgeAnalyzer _this, Edge outgoingEdge)
   {
      _this.deleteEdge(outgoingEdge);

   }

   public static final Object[] pattern_CrossEdgeAnalyzer_2_23_LookupDelegate_blackBF(CrossEdgeAnalyzer _this)
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

   public static final Object[] pattern_CrossEdgeAnalyzer_2_24_Delegation_bindingFBB(EdgeProcessor delegate, Node node)
   {
      EObject _localVariable_0 = delegate.processNode(node);
      EObject result = _localVariable_0;
      if (result != null)
      {
         return new Object[] { result, delegate, node };
      }
      return null;
   }

   public static final Object[] pattern_CrossEdgeAnalyzer_2_24_Delegation_blackB(EObject result)
   {
      return new Object[] { result };
   }

   public static final Object[] pattern_CrossEdgeAnalyzer_2_24_Delegation_bindingAndBlackFBB(EdgeProcessor delegate, Node node)
   {
      Object[] result_pattern_CrossEdgeAnalyzer_2_24_Delegation_binding = pattern_CrossEdgeAnalyzer_2_24_Delegation_bindingFBB(delegate, node);
      if (result_pattern_CrossEdgeAnalyzer_2_24_Delegation_binding != null)
      {
         EObject result = (EObject) result_pattern_CrossEdgeAnalyzer_2_24_Delegation_binding[0];

         Object[] result_pattern_CrossEdgeAnalyzer_2_24_Delegation_black = pattern_CrossEdgeAnalyzer_2_24_Delegation_blackB(result);
         if (result_pattern_CrossEdgeAnalyzer_2_24_Delegation_black != null)
         {

            return new Object[] { result, delegate, node };
         }
      }
      return null;
   }

   public static final EObject pattern_CrossEdgeAnalyzer_2_25_expressionFB(EObject result)
   {
      EObject _result = result;
      return _result;
   }

   public static final EObject pattern_CrossEdgeAnalyzer_2_26_expressionF()
   {
      EObject _result = null;
      return _result;
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //CrossEdgeAnalyzerImpl
