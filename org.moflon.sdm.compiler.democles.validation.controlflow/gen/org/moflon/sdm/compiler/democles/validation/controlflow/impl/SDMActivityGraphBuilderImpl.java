/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow.impl;

import SDMLanguage.activities.ActivityEdge;
import SDMLanguage.activities.ActivityNode;
import SDMLanguage.activities.EdgeGuard;
import SDMLanguage.activities.StartNode;
import SDMLanguage.activities.StatementNode;
import SDMLanguage.activities.StopNode;
import SDMLanguage.activities.StoryNode;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.DfsFactory;
import org.moflon.core.dfs.Edge;
import org.moflon.core.dfs.Node;

import org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage;
import org.moflon.sdm.compiler.democles.validation.controlflow.Errors;
import org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder;
import org.moflon.sdm.compiler.democles.validation.controlflow.Validator;

import org.moflon.sdm.compiler.democles.validation.result.ErrorMessage;
import org.moflon.sdm.compiler.democles.validation.result.ResultFactory;
import org.moflon.sdm.compiler.democles.validation.result.Severity;
import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SDM Activity Graph Builder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.SDMActivityGraphBuilderImpl#getValidator <em>Validator</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.SDMActivityGraphBuilderImpl#getGraph <em>Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SDMActivityGraphBuilderImpl extends EObjectImpl implements SDMActivityGraphBuilder
{
   /**
    * The cached value of the '{@link #getValidator() <em>Validator</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getValidator()
    * @generated
    * @ordered
    */
   protected Validator validator;

   /**
    * The cached value of the '{@link #getGraph() <em>Graph</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getGraph()
    * @generated
    * @ordered
    */
   protected DFSGraph graph;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected SDMActivityGraphBuilderImpl()
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
      return ControlflowPackage.Literals.SDM_ACTIVITY_GRAPH_BUILDER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Validator getValidator()
   {
      if (validator != null && validator.eIsProxy())
      {
         InternalEObject oldValidator = (InternalEObject) validator;
         validator = (Validator) eResolveProxy(oldValidator);
         if (validator != oldValidator)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlflowPackage.SDM_ACTIVITY_GRAPH_BUILDER__VALIDATOR, oldValidator, validator));
         }
      }
      return validator;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Validator basicGetValidator()
   {
      return validator;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetValidator(Validator newValidator, NotificationChain msgs)
   {
      Validator oldValidator = validator;
      validator = newValidator;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlflowPackage.SDM_ACTIVITY_GRAPH_BUILDER__VALIDATOR, oldValidator,
               newValidator);
         if (msgs == null)
            msgs = notification;
         else
            msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setValidator(Validator newValidator)
   {
      if (newValidator != validator)
      {
         NotificationChain msgs = null;
         if (validator != null)
            msgs = ((InternalEObject) validator).eInverseRemove(this, ControlflowPackage.VALIDATOR__BUILDERS, Validator.class, msgs);
         if (newValidator != null)
            msgs = ((InternalEObject) newValidator).eInverseAdd(this, ControlflowPackage.VALIDATOR__BUILDERS, Validator.class, msgs);
         msgs = basicSetValidator(newValidator, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.SDM_ACTIVITY_GRAPH_BUILDER__VALIDATOR, newValidator, newValidator));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DFSGraph getGraph()
   {
      if (graph != null && graph.eIsProxy())
      {
         InternalEObject oldGraph = (InternalEObject) graph;
         graph = (DFSGraph) eResolveProxy(oldGraph);
         if (graph != oldGraph)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlflowPackage.SDM_ACTIVITY_GRAPH_BUILDER__GRAPH, oldGraph, graph));
         }
      }
      return graph;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DFSGraph basicGetGraph()
   {
      return graph;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setGraph(DFSGraph newGraph)
   {
      DFSGraph oldGraph = graph;
      graph = newGraph;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.SDM_ACTIVITY_GRAPH_BUILDER__GRAPH, oldGraph, graph));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node exploreEdge(Edge edge)
   {

      Object[] result1_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_0_1_LookupActivityEdge_blackFBB(edge, this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[edge] = " + edge + ", " + "[this] = " + this + ".");
      }
      ActivityEdge activityEdge = (ActivityEdge) result1_black[0];
      // 
      Object[] result2_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_0_2_TargetStoryNode_blackBF(activityEdge);
      if (result2_black != null)
      {
         StoryNode targetStoryNode = (StoryNode) result2_black[1];

         Object[] result3_bindingAndBlack = SDMActivityGraphBuilderImpl
               .pattern_SDMActivityGraphBuilder_0_3_CreateInternalTargetStoryNode_bindingAndBlackFBB(this, targetStoryNode);
         if (result3_bindingAndBlack == null)
         {
            throw new RuntimeException(
                  "Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[targetStoryNode] = " + targetStoryNode + ".");
         }
         Node intTargetStoryNode = (Node) result3_bindingAndBlack[0];
         return SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_0_4_expressionFB(intTargetStoryNode);
      } else
      {
         // 
         Object[] result5_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_0_5_TargetStatementNode_blackBF(activityEdge);
         if (result5_black != null)
         {
            StatementNode targetStatementNode = (StatementNode) result5_black[1];

            Object[] result6_bindingAndBlack = SDMActivityGraphBuilderImpl
                  .pattern_SDMActivityGraphBuilder_0_6_CreateInternalTargetStatementNode_bindingAndBlackFBB(this, targetStatementNode);
            if (result6_bindingAndBlack == null)
            {
               throw new RuntimeException(
                     "Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[targetStatementNode] = " + targetStatementNode + ".");
            }
            Node intTargetStatementNode = (Node) result6_bindingAndBlack[0];
            return SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_0_7_expressionFB(intTargetStatementNode);
         } else
         {
            // 
            Object[] result8_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_0_8_TargetStopNode_blackBF(activityEdge);
            if (result8_black != null)
            {
               StopNode targetStopNode = (StopNode) result8_black[1];

               Object[] result9_bindingAndBlack = SDMActivityGraphBuilderImpl
                     .pattern_SDMActivityGraphBuilder_0_9_CreateInternalTargetStopNode_bindingAndBlackFBB(this, targetStopNode);
               if (result9_bindingAndBlack == null)
               {
                  throw new RuntimeException(
                        "Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[targetStopNode] = " + targetStopNode + ".");
               }
               Node intTargetStopNode = (Node) result9_bindingAndBlack[0];
               return SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_0_10_expressionFB(intTargetStopNode);
            } else
            {

               Object[] result11_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_0_11_ReportUnknownTrgType_blackFBBF(this, activityEdge);
               if (result11_black == null)
               {
                  throw new RuntimeException(
                        "Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[activityEdge] = " + activityEdge + ".");
               }
               Validator validator = (Validator) result11_black[0];
               ValidationReport report = (ValidationReport) result11_black[3];
               SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_0_11_ReportUnknownTrgType_greenBBFB(activityEdge, report, validator);
               //nothing ErrorMessage reportUnknownTrgType = (ErrorMessage) result11_green[2];

               return SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_0_12_expressionF();
            }

         }

      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node exploreStartNode(StartNode startNode)
   {

      Object[] result1_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_1_1_InitValidationReport_blackFFB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      ValidationReport report = (ValidationReport) result1_black[0];
      Validator validator = (Validator) result1_black[1];
      // 
      Object[] result2_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_1_2_NoIncomingEdges_blackB(startNode);
      if (result2_black != null)
      {
         // 
         Object[] result3_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_1_3_CheckFirstOutgoingEdgeFromStartNode_blackBF(startNode);
         if (result3_black != null)
         {
            ActivityEdge regularEdge = (ActivityEdge) result3_black[1];
            // 
            Object[] result4_black = SDMActivityGraphBuilderImpl
                  .pattern_SDMActivityGraphBuilder_1_4_CheckAdditionalOutgoingEdgesFromStartNode_blackBB(startNode, regularEdge);
            if (result4_black != null)
            {

               Object[] result5_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_1_5_CreateInternalStartNode_blackBBBF(regularEdge, this,
                     startNode);
               if (result5_black == null)
               {
                  throw new RuntimeException("Pattern matching failed." + " Variables: " + "[regularEdge] = " + regularEdge + ", " + "[this] = " + this + ", "
                        + "[startNode] = " + startNode + ".");
               }
               DFSGraph graph = (DFSGraph) result5_black[3];
               Object[] result5_green = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_1_5_CreateInternalStartNode_greenFBFBB(regularEdge,
                     startNode, graph);
               Node sourceNode = (Node) result5_green[0];
               //nothing Edge intEdge = (Edge) result5_green[2];

               return SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_1_6_expressionFB(sourceNode);
            } else
            {

               Object[] result7_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_1_7_ReportTwoOutgoingEdges_blackBB(report, regularEdge);
               if (result7_black == null)
               {
                  throw new RuntimeException(
                        "Pattern matching failed." + " Variables: " + "[report] = " + report + ", " + "[regularEdge] = " + regularEdge + ".");
               }
               Object[] result7_green = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_1_7_ReportTwoOutgoingEdges_greenFBBB(report, regularEdge,
                     validator);
               ErrorMessage errorTwoOutgoingEdge = (ErrorMessage) result7_green[0];

               // ForEach 
               for (Object[] result8_black : SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_1_8_ReportTwoOutgoingEdgesCycle_blackBBFB(regularEdge,
                     errorTwoOutgoingEdge, startNode))
               {
                  ActivityEdge additionalEdge = (ActivityEdge) result8_black[2];
                  SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_1_8_ReportTwoOutgoingEdgesCycle_greenBB(errorTwoOutgoingEdge, additionalEdge);

               }
               return SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_1_9_expressionF();
            }

         } else
         {

            Object[] result10_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_1_10_ReportGuardedOutgoingEdge_blackBBF(report, startNode);
            if (result10_black == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[report] = " + report + ", " + "[startNode] = " + startNode + ".");
            }
            ActivityEdge guardedEdge = (ActivityEdge) result10_black[2];
            SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_1_10_ReportGuardedOutgoingEdge_greenBFBB(report, guardedEdge, validator);
            //nothing ErrorMessage errorGuardedOutgoingEdge = (ErrorMessage) result10_green[1];

            return SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_1_11_expressionF();
         }

      } else
      {

         Object[] result12_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_1_12_ReportIncomingEdge_blackBBF(startNode, report);
         if (result12_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[startNode] = " + startNode + ", " + "[report] = " + report + ".");
         }
         ActivityEdge incomingEdge = (ActivityEdge) result12_black[2];
         SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_1_12_ReportIncomingEdge_greenFBBB(report, incomingEdge, validator);
         //nothing ErrorMessage errorIncomingEdge = (ErrorMessage) result12_green[0];

         return SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_1_13_expressionF();
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node exploreStatementNode(StatementNode statementNode)
   {

      Object[] result1_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_2_1_DetermineDFSGraph_blackFB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      DFSGraph graph = (DFSGraph) result1_black[0];
      // 
      Object[] result2_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_2_2_CheckStatementNode_blackFB(statementNode);
      if (result2_black != null)
      {
         ActivityEdge actEdge = (ActivityEdge) result2_black[0];

         Object[] result3_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_2_3_CreateStatementNode_blackBBB(statementNode, actEdge, graph);
         if (result3_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[statementNode] = " + statementNode + ", " + "[actEdge] = " + actEdge
                  + ", " + "[graph] = " + graph + ".");
         }
         Object[] result3_green = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_2_3_CreateStatementNode_greenBFBBF(statementNode, actEdge, graph);
         Node intNode = (Node) result3_green[1];
         //nothing Edge intEdge = (Edge) result3_green[4];

         return SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_2_4_expressionFB(intNode);
      } else
      {

         Object[] result5_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_2_5_CheckBranchingStatementNode_blackBFF(statementNode);
         if (result5_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[statementNode] = " + statementNode + ".");
         }
         ActivityEdge trueEdge = (ActivityEdge) result5_black[1];
         ActivityEdge falseEdge = (ActivityEdge) result5_black[2];

         Object[] result6_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_2_6_CreateBranchingStatementNode_blackBBBB(trueEdge, falseEdge,
               graph, statementNode);
         if (result6_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[trueEdge] = " + trueEdge + ", " + "[falseEdge] = " + falseEdge + ", "
                  + "[graph] = " + graph + ", " + "[statementNode] = " + statementNode + ".");
         }
         Object[] result6_green = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_2_6_CreateBranchingStatementNode_greenFBFBBFB(trueEdge, falseEdge,
               graph, statementNode);
         Node branchingNode = (Node) result6_green[0];
         //nothing Edge intTrueEdge = (Edge) result6_green[2];
         //nothing Edge intFalseEdge = (Edge) result6_green[5];

         return SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_2_7_expressionFB(branchingNode);
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node exploreStopNode(StopNode stopNode)
   {

      Object[] result1_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_3_1_CreateInternalStopNode_blackFBB(stopNode, this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[stopNode] = " + stopNode + ", " + "[this] = " + this + ".");
      }
      DFSGraph graph = (DFSGraph) result1_black[0];
      Object[] result1_green = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_3_1_CreateInternalStopNode_greenBBF(graph, stopNode);
      Node internalStopNode = (Node) result1_green[2];

      return SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_3_2_expressionFB(internalStopNode);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node exploreStoryNode(StoryNode storyNode)
   {

      Object[] result1_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_1_DetermineDFSGraph_blackFB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      DFSGraph graph = (DFSGraph) result1_black[0];

      Object[] result2_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_2_InitValidationReport_blackFFB(this);
      if (result2_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      ValidationReport report = (ValidationReport) result2_black[0];
      Validator validator = (Validator) result2_black[1];
      // 
      Object[] result3_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_3_IsForEach_blackB(storyNode);
      if (result3_black != null)
      {
         // 
         Object[] result4_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_4_CheckForEach1_blackFB(storyNode);
         if (result4_black != null)
         {
            ActivityEdge endEdge = (ActivityEdge) result4_black[0];
            // 
            Object[] result5_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_5_NoSecondOutgoingEdge_blackBB(storyNode, endEdge);
            if (result5_black != null)
            {

               Object[] result6_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_6_HandleForEach1_blackBBB(storyNode, endEdge, graph);
               if (result6_black == null)
               {
                  throw new RuntimeException("Pattern matching failed." + " Variables: " + "[storyNode] = " + storyNode + ", " + "[endEdge] = " + endEdge + ", "
                        + "[graph] = " + graph + ".");
               }
               Object[] result6_green = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_6_HandleForEach1_greenFFBBB(storyNode, endEdge, graph);
               //nothing Edge intEndEdge1 = (Edge) result6_green[0];
               Node forEachNode1 = (Node) result6_green[1];

               return SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_7_expressionFB(forEachNode1);
            } else
            {
               // 
               Object[] result8_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_8_CheckForEach2_blackBFB(storyNode, endEdge);
               if (result8_black != null)
               {
                  ActivityEdge forEachEdge = (ActivityEdge) result8_black[1];

                  Object[] result9_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_9_HandleForEach2_blackBBBB(graph, endEdge, storyNode,
                        forEachEdge);
                  if (result9_black == null)
                  {
                     throw new RuntimeException("Pattern matching failed." + " Variables: " + "[graph] = " + graph + ", " + "[endEdge] = " + endEdge + ", "
                           + "[storyNode] = " + storyNode + ", " + "[forEachEdge] = " + forEachEdge + ".");
                  }
                  Object[] result9_green = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_9_HandleForEach2_greenFFBFBBB(graph, endEdge,
                        storyNode, forEachEdge);
                  Node forEachNode2 = (Node) result9_green[0];
                  //nothing Edge intEndEdge2 = (Edge) result9_green[1];
                  //nothing Edge intForEachEdge = (Edge) result9_green[3];

                  return SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_10_expressionFB(forEachNode2);
               } else
               {

                  Object[] result11_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_11_ReportFalseActivityEdge_blackBB(report, storyNode);
                  if (result11_black == null)
                  {
                     throw new RuntimeException(
                           "Pattern matching failed." + " Variables: " + "[report] = " + report + ", " + "[storyNode] = " + storyNode + ".");
                  }
                  SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_11_ReportFalseActivityEdge_greenBBFB(report, storyNode, validator);
                  //nothing ErrorMessage ReportFalseOutEdge = (ErrorMessage) result11_green[2];

                  return SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_12_expressionF();
               }

            }

         } else
         {

            Object[] result13_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_13_ReportNoEndEdge_blackBB(storyNode, report);
            if (result13_black == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[storyNode] = " + storyNode + ", " + "[report] = " + report + ".");
            }
            SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_13_ReportNoEndEdge_greenFB(validator);
            //nothing ErrorMessage ReportNoEndEdge = (ErrorMessage) result13_green[0];

            return SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_14_expressionF();
         }

      } else
      {
         // 
         Object[] result15_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_15_CheckRegularNode_blackBF(storyNode);
         if (result15_black != null)
         {
            ActivityEdge regularEdge = (ActivityEdge) result15_black[1];

            Object[] result16_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_16_CreateSimpleNode_blackBBB(regularEdge, graph, storyNode);
            if (result16_black == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[regularEdge] = " + regularEdge + ", " + "[graph] = " + graph + ", "
                     + "[storyNode] = " + storyNode + ".");
            }
            Object[] result16_green = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_16_CreateSimpleNode_greenBFBBF(regularEdge, graph,
                  storyNode);
            //nothing Edge internalRegularEdge = (Edge) result16_green[1];
            Node simpleNode = (Node) result16_green[4];

            return SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_17_expressionFB(simpleNode);
         } else
         {
            // 
            Object[] result18_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_18_CheckBranchingNode_blackFBF(storyNode);
            if (result18_black != null)
            {
               ActivityEdge falseEdge = (ActivityEdge) result18_black[0];
               ActivityEdge trueEdge = (ActivityEdge) result18_black[2];

               Object[] result19_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_19_CreateBranchingNode_blackBBBB(storyNode, trueEdge,
                     graph, falseEdge);
               if (result19_black == null)
               {
                  throw new RuntimeException("Pattern matching failed." + " Variables: " + "[storyNode] = " + storyNode + ", " + "[trueEdge] = " + trueEdge
                        + ", " + "[graph] = " + graph + ", " + "[falseEdge] = " + falseEdge + ".");
               }
               Object[] result19_green = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_19_CreateBranchingNode_greenBBBFFBF(storyNode, trueEdge,
                     graph, falseEdge);
               //nothing Edge intTrueEdge = (Edge) result19_green[3];
               Node branchingNode = (Node) result19_green[4];
               //nothing Edge intFalseEdge = (Edge) result19_green[6];

               return SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_20_expressionFB(branchingNode);
            } else
            {

               Object[] result21_black = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_21_ReportInvalidOutgoingEdges_blackBBB(graph, report,
                     storyNode);
               if (result21_black == null)
               {
                  throw new RuntimeException("Pattern matching failed." + " Variables: " + "[graph] = " + graph + ", " + "[report] = " + report + ", "
                        + "[storyNode] = " + storyNode + ".");
               }
               Object[] result21_green = SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_21_ReportInvalidOutgoingEdges_greenBFBFB(graph,
                     storyNode, validator);
               //nothing ErrorMessage ReportInvalidOutEdges = (ErrorMessage) result21_green[1];
               Node dummyNode = (Node) result21_green[3];

               // ForEach 
               for (Object[] result22_black : SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_22_ForEachOutgoingEdge_blackBFB(dummyNode,
                     storyNode))
               {
                  ActivityEdge outgoingActivityEdge = (ActivityEdge) result22_black[1];
                  SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_22_ForEachOutgoingEdge_greenBFB(dummyNode, outgoingActivityEdge);
                  //nothing Edge outgoingEdge = (Edge) result22_green[1];

               }
               return SDMActivityGraphBuilderImpl.pattern_SDMActivityGraphBuilder_4_23_expressionFB(dummyNode);
            }

         }

      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
      case ControlflowPackage.SDM_ACTIVITY_GRAPH_BUILDER__VALIDATOR:
         if (validator != null)
            msgs = ((InternalEObject) validator).eInverseRemove(this, ControlflowPackage.VALIDATOR__BUILDERS, Validator.class, msgs);
         return basicSetValidator((Validator) otherEnd, msgs);
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
      case ControlflowPackage.SDM_ACTIVITY_GRAPH_BUILDER__VALIDATOR:
         return basicSetValidator(null, msgs);
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
      case ControlflowPackage.SDM_ACTIVITY_GRAPH_BUILDER__VALIDATOR:
         if (resolve)
            return getValidator();
         return basicGetValidator();
      case ControlflowPackage.SDM_ACTIVITY_GRAPH_BUILDER__GRAPH:
         if (resolve)
            return getGraph();
         return basicGetGraph();
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
      case ControlflowPackage.SDM_ACTIVITY_GRAPH_BUILDER__VALIDATOR:
         setValidator((Validator) newValue);
         return;
      case ControlflowPackage.SDM_ACTIVITY_GRAPH_BUILDER__GRAPH:
         setGraph((DFSGraph) newValue);
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
      case ControlflowPackage.SDM_ACTIVITY_GRAPH_BUILDER__VALIDATOR:
         setValidator((Validator) null);
         return;
      case ControlflowPackage.SDM_ACTIVITY_GRAPH_BUILDER__GRAPH:
         setGraph((DFSGraph) null);
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
      case ControlflowPackage.SDM_ACTIVITY_GRAPH_BUILDER__VALIDATOR:
         return validator != null;
      case ControlflowPackage.SDM_ACTIVITY_GRAPH_BUILDER__GRAPH:
         return graph != null;
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
      case ControlflowPackage.SDM_ACTIVITY_GRAPH_BUILDER___EXPLORE_EDGE__EDGE:
         return exploreEdge((Edge) arguments.get(0));
      case ControlflowPackage.SDM_ACTIVITY_GRAPH_BUILDER___EXPLORE_START_NODE__STARTNODE:
         return exploreStartNode((StartNode) arguments.get(0));
      case ControlflowPackage.SDM_ACTIVITY_GRAPH_BUILDER___EXPLORE_STATEMENT_NODE__STATEMENTNODE:
         return exploreStatementNode((StatementNode) arguments.get(0));
      case ControlflowPackage.SDM_ACTIVITY_GRAPH_BUILDER___EXPLORE_STOP_NODE__STOPNODE:
         return exploreStopNode((StopNode) arguments.get(0));
      case ControlflowPackage.SDM_ACTIVITY_GRAPH_BUILDER___EXPLORE_STORY_NODE__STORYNODE:
         return exploreStoryNode((StoryNode) arguments.get(0));
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_0_1_LookupActivityEdge_blackFBB(Edge edge, SDMActivityGraphBuilder _this)
   {
      EObject tmpActivityEdge = edge.getOrigin();
      if (tmpActivityEdge instanceof ActivityEdge)
      {
         ActivityEdge activityEdge = (ActivityEdge) tmpActivityEdge;
         return new Object[] { activityEdge, edge, _this };
      }

      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_0_2_TargetStoryNode_blackBF(ActivityEdge activityEdge)
   {
      ActivityNode tmpTargetStoryNode = activityEdge.getTarget();
      if (tmpTargetStoryNode instanceof StoryNode)
      {
         StoryNode targetStoryNode = (StoryNode) tmpTargetStoryNode;
         return new Object[] { activityEdge, targetStoryNode };
      }

      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_0_3_CreateInternalTargetStoryNode_bindingFBB(SDMActivityGraphBuilder _this,
         StoryNode targetStoryNode)
   {
      Node _localVariable_0 = _this.exploreStoryNode(targetStoryNode);
      Node intTargetStoryNode = _localVariable_0;
      if (intTargetStoryNode != null)
      {
         return new Object[] { intTargetStoryNode, _this, targetStoryNode };
      }
      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_0_3_CreateInternalTargetStoryNode_blackB(Node intTargetStoryNode)
   {
      return new Object[] { intTargetStoryNode };
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_0_3_CreateInternalTargetStoryNode_bindingAndBlackFBB(SDMActivityGraphBuilder _this,
         StoryNode targetStoryNode)
   {
      Object[] result_pattern_SDMActivityGraphBuilder_0_3_CreateInternalTargetStoryNode_binding = pattern_SDMActivityGraphBuilder_0_3_CreateInternalTargetStoryNode_bindingFBB(
            _this, targetStoryNode);
      if (result_pattern_SDMActivityGraphBuilder_0_3_CreateInternalTargetStoryNode_binding != null)
      {
         Node intTargetStoryNode = (Node) result_pattern_SDMActivityGraphBuilder_0_3_CreateInternalTargetStoryNode_binding[0];

         Object[] result_pattern_SDMActivityGraphBuilder_0_3_CreateInternalTargetStoryNode_black = pattern_SDMActivityGraphBuilder_0_3_CreateInternalTargetStoryNode_blackB(
               intTargetStoryNode);
         if (result_pattern_SDMActivityGraphBuilder_0_3_CreateInternalTargetStoryNode_black != null)
         {

            return new Object[] { intTargetStoryNode, _this, targetStoryNode };
         }
      }
      return null;
   }

   public static final Node pattern_SDMActivityGraphBuilder_0_4_expressionFB(Node intTargetStoryNode)
   {
      Node _result = intTargetStoryNode;
      return _result;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_0_5_TargetStatementNode_blackBF(ActivityEdge activityEdge)
   {
      ActivityNode tmpTargetStatementNode = activityEdge.getTarget();
      if (tmpTargetStatementNode instanceof StatementNode)
      {
         StatementNode targetStatementNode = (StatementNode) tmpTargetStatementNode;
         return new Object[] { activityEdge, targetStatementNode };
      }

      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_0_6_CreateInternalTargetStatementNode_bindingFBB(SDMActivityGraphBuilder _this,
         StatementNode targetStatementNode)
   {
      Node _localVariable_0 = _this.exploreStatementNode(targetStatementNode);
      Node intTargetStatementNode = _localVariable_0;
      if (intTargetStatementNode != null)
      {
         return new Object[] { intTargetStatementNode, _this, targetStatementNode };
      }
      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_0_6_CreateInternalTargetStatementNode_blackB(Node intTargetStatementNode)
   {
      return new Object[] { intTargetStatementNode };
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_0_6_CreateInternalTargetStatementNode_bindingAndBlackFBB(SDMActivityGraphBuilder _this,
         StatementNode targetStatementNode)
   {
      Object[] result_pattern_SDMActivityGraphBuilder_0_6_CreateInternalTargetStatementNode_binding = pattern_SDMActivityGraphBuilder_0_6_CreateInternalTargetStatementNode_bindingFBB(
            _this, targetStatementNode);
      if (result_pattern_SDMActivityGraphBuilder_0_6_CreateInternalTargetStatementNode_binding != null)
      {
         Node intTargetStatementNode = (Node) result_pattern_SDMActivityGraphBuilder_0_6_CreateInternalTargetStatementNode_binding[0];

         Object[] result_pattern_SDMActivityGraphBuilder_0_6_CreateInternalTargetStatementNode_black = pattern_SDMActivityGraphBuilder_0_6_CreateInternalTargetStatementNode_blackB(
               intTargetStatementNode);
         if (result_pattern_SDMActivityGraphBuilder_0_6_CreateInternalTargetStatementNode_black != null)
         {

            return new Object[] { intTargetStatementNode, _this, targetStatementNode };
         }
      }
      return null;
   }

   public static final Node pattern_SDMActivityGraphBuilder_0_7_expressionFB(Node intTargetStatementNode)
   {
      Node _result = intTargetStatementNode;
      return _result;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_0_8_TargetStopNode_blackBF(ActivityEdge activityEdge)
   {
      ActivityNode tmpTargetStopNode = activityEdge.getTarget();
      if (tmpTargetStopNode instanceof StopNode)
      {
         StopNode targetStopNode = (StopNode) tmpTargetStopNode;
         return new Object[] { activityEdge, targetStopNode };
      }

      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_0_9_CreateInternalTargetStopNode_bindingFBB(SDMActivityGraphBuilder _this,
         StopNode targetStopNode)
   {
      Node _localVariable_0 = _this.exploreStopNode(targetStopNode);
      Node intTargetStopNode = _localVariable_0;
      if (intTargetStopNode != null)
      {
         return new Object[] { intTargetStopNode, _this, targetStopNode };
      }
      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_0_9_CreateInternalTargetStopNode_blackB(Node intTargetStopNode)
   {
      return new Object[] { intTargetStopNode };
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_0_9_CreateInternalTargetStopNode_bindingAndBlackFBB(SDMActivityGraphBuilder _this,
         StopNode targetStopNode)
   {
      Object[] result_pattern_SDMActivityGraphBuilder_0_9_CreateInternalTargetStopNode_binding = pattern_SDMActivityGraphBuilder_0_9_CreateInternalTargetStopNode_bindingFBB(
            _this, targetStopNode);
      if (result_pattern_SDMActivityGraphBuilder_0_9_CreateInternalTargetStopNode_binding != null)
      {
         Node intTargetStopNode = (Node) result_pattern_SDMActivityGraphBuilder_0_9_CreateInternalTargetStopNode_binding[0];

         Object[] result_pattern_SDMActivityGraphBuilder_0_9_CreateInternalTargetStopNode_black = pattern_SDMActivityGraphBuilder_0_9_CreateInternalTargetStopNode_blackB(
               intTargetStopNode);
         if (result_pattern_SDMActivityGraphBuilder_0_9_CreateInternalTargetStopNode_black != null)
         {

            return new Object[] { intTargetStopNode, _this, targetStopNode };
         }
      }
      return null;
   }

   public static final Node pattern_SDMActivityGraphBuilder_0_10_expressionFB(Node intTargetStopNode)
   {
      Node _result = intTargetStopNode;
      return _result;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_0_11_ReportUnknownTrgType_blackFBBF(SDMActivityGraphBuilder _this, ActivityEdge activityEdge)
   {
      Validator validator = _this.getValidator();
      if (validator != null)
      {
         ValidationReport report = validator.getValidationReport();
         if (report != null)
         {
            return new Object[] { validator, _this, activityEdge, report };
         }

      }

      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_0_11_ReportUnknownTrgType_greenBBFB(ActivityEdge activityEdge, ValidationReport report,
         Validator validator)
   {
      ErrorMessage reportUnknownTrgType = ResultFactory.eINSTANCE.createErrorMessage();
      Severity reportUnknownTrgType_severity_prime = Severity.FATAL;
      String _localVariable_0 = validator.lookupErrorMessage(Errors.EDGE_TARGET_UNKNOWN_TYPE);
      report.getErrorMessages().add(reportUnknownTrgType);
      reportUnknownTrgType.getLocation().add(activityEdge);
      reportUnknownTrgType.setSeverity(reportUnknownTrgType_severity_prime);
      String reportUnknownTrgType_id_prime = _localVariable_0;
      reportUnknownTrgType.setId(reportUnknownTrgType_id_prime);
      return new Object[] { activityEdge, report, reportUnknownTrgType, validator };
   }

   public static final Node pattern_SDMActivityGraphBuilder_0_12_expressionF()
   {
      Node _result = null;
      return _result;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_1_1_InitValidationReport_blackFFB(SDMActivityGraphBuilder _this)
   {
      Validator validator = _this.getValidator();
      if (validator != null)
      {
         ValidationReport report = validator.getValidationReport();
         if (report != null)
         {
            return new Object[] { report, validator, _this };
         }

      }

      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_1_2_NoIncomingEdges_black_nac_0B(StartNode startNode)
   {
      for (ActivityEdge incomingEdge : startNode.getIncoming())
      {
         return new Object[] { startNode };
      }
      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_1_2_NoIncomingEdges_blackB(StartNode startNode)
   {
      if (pattern_SDMActivityGraphBuilder_1_2_NoIncomingEdges_black_nac_0B(startNode) == null)
      {
         return new Object[] { startNode };
      }
      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_1_3_CheckFirstOutgoingEdgeFromStartNode_blackBF(StartNode startNode)
   {
      for (ActivityEdge regularEdge : startNode.getOutgoing())
      {
         EdgeGuard regularEdge_guard = regularEdge.getGuard();
         if (regularEdge_guard.equals(EdgeGuard.NONE))
         {
            return new Object[] { startNode, regularEdge };
         }

      }
      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_1_4_CheckAdditionalOutgoingEdgesFromStartNode_black_nac_0BB(StartNode startNode,
         ActivityEdge regularEdge)
   {
      for (ActivityEdge secondEdge : startNode.getOutgoing())
      {
         if (!regularEdge.equals(secondEdge))
         {
            return new Object[] { startNode, regularEdge };
         }
      }
      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_1_4_CheckAdditionalOutgoingEdgesFromStartNode_blackBB(StartNode startNode,
         ActivityEdge regularEdge)
   {
      if (pattern_SDMActivityGraphBuilder_1_4_CheckAdditionalOutgoingEdgesFromStartNode_black_nac_0BB(startNode, regularEdge) == null)
      {
         return new Object[] { startNode, regularEdge };
      }
      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_1_5_CreateInternalStartNode_blackBBBF(ActivityEdge regularEdge, SDMActivityGraphBuilder _this,
         StartNode startNode)
   {
      DFSGraph graph = _this.getGraph();
      if (graph != null)
      {
         return new Object[] { regularEdge, _this, startNode, graph };
      }

      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_1_5_CreateInternalStartNode_greenFBFBB(ActivityEdge regularEdge, StartNode startNode,
         DFSGraph graph)
   {
      Node sourceNode = DfsFactory.eINSTANCE.createNode();
      Edge intEdge = DfsFactory.eINSTANCE.createEdge();
      sourceNode.setOrigin(startNode);
      sourceNode.setGraph(graph);
      sourceNode.getOutgoing().add(intEdge);
      intEdge.setOrigin(regularEdge);
      intEdge.setGraph(graph);
      return new Object[] { sourceNode, regularEdge, intEdge, startNode, graph };
   }

   public static final Node pattern_SDMActivityGraphBuilder_1_6_expressionFB(Node sourceNode)
   {
      Node _result = sourceNode;
      return _result;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_1_7_ReportTwoOutgoingEdges_blackBB(ValidationReport report, ActivityEdge regularEdge)
   {
      return new Object[] { report, regularEdge };
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_1_7_ReportTwoOutgoingEdges_greenFBBB(ValidationReport report, ActivityEdge regularEdge,
         Validator validator)
   {
      ErrorMessage errorTwoOutgoingEdge = ResultFactory.eINSTANCE.createErrorMessage();
      Severity errorTwoOutgoingEdge_severity_prime = Severity.FATAL;
      String _localVariable_0 = validator.lookupErrorMessage(Errors.ONE_OUTGOING_EDGE_FROM_START_NODE);
      errorTwoOutgoingEdge.getLocation().add(regularEdge);
      report.getErrorMessages().add(errorTwoOutgoingEdge);
      errorTwoOutgoingEdge.setSeverity(errorTwoOutgoingEdge_severity_prime);
      String errorTwoOutgoingEdge_id_prime = _localVariable_0;
      errorTwoOutgoingEdge.setId(errorTwoOutgoingEdge_id_prime);
      return new Object[] { errorTwoOutgoingEdge, report, regularEdge, validator };
   }

   public static final Iterable<Object[]> pattern_SDMActivityGraphBuilder_1_8_ReportTwoOutgoingEdgesCycle_blackBBFB(ActivityEdge regularEdge,
         ErrorMessage errorTwoOutgoingEdge, StartNode startNode)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (ActivityEdge additionalEdge : startNode.getOutgoing())
      {
         if (!additionalEdge.equals(regularEdge))
         {
            _result.add(new Object[] { regularEdge, errorTwoOutgoingEdge, additionalEdge, startNode });
         }
      }
      return _result;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_1_8_ReportTwoOutgoingEdgesCycle_greenBB(ErrorMessage errorTwoOutgoingEdge,
         ActivityEdge additionalEdge)
   {
      errorTwoOutgoingEdge.getLocation().add(additionalEdge);
      return new Object[] { errorTwoOutgoingEdge, additionalEdge };
   }

   public static final Node pattern_SDMActivityGraphBuilder_1_9_expressionF()
   {
      Node _result = null;
      return _result;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_1_10_ReportGuardedOutgoingEdge_blackBBF(ValidationReport report, StartNode startNode)
   {
      for (ActivityEdge guardedEdge : startNode.getOutgoing())
      {
         EdgeGuard guardedEdge_guard = guardedEdge.getGuard();
         if (!guardedEdge_guard.equals(EdgeGuard.NONE))
         {
            return new Object[] { report, startNode, guardedEdge };
         }

      }
      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_1_10_ReportGuardedOutgoingEdge_greenBFBB(ValidationReport report, ActivityEdge guardedEdge,
         Validator validator)
   {
      ErrorMessage errorGuardedOutgoingEdge = ResultFactory.eINSTANCE.createErrorMessage();
      String _localVariable_0 = validator.lookupErrorMessage(Errors.ONE_OUTGOING_EDGE_FROM_START_NODE);
      Severity errorGuardedOutgoingEdge_severity_prime = Severity.FATAL;
      report.getErrorMessages().add(errorGuardedOutgoingEdge);
      errorGuardedOutgoingEdge.getLocation().add(guardedEdge);
      String errorGuardedOutgoingEdge_id_prime = _localVariable_0;
      errorGuardedOutgoingEdge.setSeverity(errorGuardedOutgoingEdge_severity_prime);
      errorGuardedOutgoingEdge.setId(errorGuardedOutgoingEdge_id_prime);
      return new Object[] { report, errorGuardedOutgoingEdge, guardedEdge, validator };
   }

   public static final Node pattern_SDMActivityGraphBuilder_1_11_expressionF()
   {
      Node _result = null;
      return _result;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_1_12_ReportIncomingEdge_blackBBF(StartNode startNode, ValidationReport report)
   {
      for (ActivityEdge incomingEdge : startNode.getIncoming())
      {
         return new Object[] { startNode, report, incomingEdge };
      }
      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_1_12_ReportIncomingEdge_greenFBBB(ValidationReport report, ActivityEdge incomingEdge,
         Validator validator)
   {
      ErrorMessage errorIncomingEdge = ResultFactory.eINSTANCE.createErrorMessage();
      Severity errorIncomingEdge_severity_prime = Severity.FATAL;
      String _localVariable_0 = validator.lookupErrorMessage(Errors.NO_INCOMING_EDGE_INTO_START_NODE);
      report.getErrorMessages().add(errorIncomingEdge);
      errorIncomingEdge.getLocation().add(incomingEdge);
      errorIncomingEdge.setSeverity(errorIncomingEdge_severity_prime);
      String errorIncomingEdge_id_prime = _localVariable_0;
      errorIncomingEdge.setId(errorIncomingEdge_id_prime);
      return new Object[] { errorIncomingEdge, report, incomingEdge, validator };
   }

   public static final Node pattern_SDMActivityGraphBuilder_1_13_expressionF()
   {
      Node _result = null;
      return _result;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_2_1_DetermineDFSGraph_blackFB(SDMActivityGraphBuilder _this)
   {
      DFSGraph graph = _this.getGraph();
      if (graph != null)
      {
         return new Object[] { graph, _this };
      }

      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_2_2_CheckStatementNode_black_nac_0BB(StatementNode statementNode, ActivityEdge actEdge)
   {
      for (ActivityEdge secondEdge : statementNode.getOutgoing())
      {
         if (!actEdge.equals(secondEdge))
         {
            return new Object[] { statementNode, actEdge };
         }
      }
      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_2_2_CheckStatementNode_blackFB(StatementNode statementNode)
   {
      for (ActivityEdge actEdge : statementNode.getOutgoing())
      {
         EdgeGuard actEdge_guard = actEdge.getGuard();
         if (actEdge_guard.equals(EdgeGuard.NONE))
         {
            if (pattern_SDMActivityGraphBuilder_2_2_CheckStatementNode_black_nac_0BB(statementNode, actEdge) == null)
            {
               return new Object[] { actEdge, statementNode };
            }
         }

      }
      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_2_3_CreateStatementNode_blackBBB(StatementNode statementNode, ActivityEdge actEdge,
         DFSGraph graph)
   {
      return new Object[] { statementNode, actEdge, graph };
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_2_3_CreateStatementNode_greenBFBBF(StatementNode statementNode, ActivityEdge actEdge,
         DFSGraph graph)
   {
      Node intNode = DfsFactory.eINSTANCE.createNode();
      Edge intEdge = DfsFactory.eINSTANCE.createEdge();
      intNode.setOrigin(statementNode);
      intNode.setGraph(graph);
      intNode.getOutgoing().add(intEdge);
      intEdge.setGraph(graph);
      intEdge.setOrigin(actEdge);
      return new Object[] { statementNode, intNode, actEdge, graph, intEdge };
   }

   public static final Node pattern_SDMActivityGraphBuilder_2_4_expressionFB(Node intNode)
   {
      Node _result = intNode;
      return _result;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_2_5_CheckBranchingStatementNode_black_nac_0BBB(StatementNode statementNode,
         ActivityEdge trueEdge, ActivityEdge falseEdge)
   {
      if (!falseEdge.equals(trueEdge))
      {
         for (ActivityEdge thirdEdge : statementNode.getOutgoing())
         {
            if (!trueEdge.equals(thirdEdge))
            {
               if (!falseEdge.equals(thirdEdge))
               {
                  return new Object[] { statementNode, trueEdge, falseEdge };
               }
            }
         }
      }
      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_2_5_CheckBranchingStatementNode_blackBFF(StatementNode statementNode)
   {
      for (ActivityEdge trueEdge : statementNode.getOutgoing())
      {
         EdgeGuard trueEdge_guard = trueEdge.getGuard();
         if (trueEdge_guard.equals(EdgeGuard.SUCCESS))
         {
            for (ActivityEdge falseEdge : statementNode.getOutgoing())
            {
               if (!falseEdge.equals(trueEdge))
               {
                  EdgeGuard falseEdge_guard = falseEdge.getGuard();
                  if (falseEdge_guard.equals(EdgeGuard.FAILURE))
                  {
                     if (pattern_SDMActivityGraphBuilder_2_5_CheckBranchingStatementNode_black_nac_0BBB(statementNode, trueEdge, falseEdge) == null)
                     {
                        return new Object[] { statementNode, trueEdge, falseEdge };
                     }
                  }

               }
            }
         }

      }
      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_2_6_CreateBranchingStatementNode_blackBBBB(ActivityEdge trueEdge, ActivityEdge falseEdge,
         DFSGraph graph, StatementNode statementNode)
   {
      if (!falseEdge.equals(trueEdge))
      {
         return new Object[] { trueEdge, falseEdge, graph, statementNode };
      }
      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_2_6_CreateBranchingStatementNode_greenFBFBBFB(ActivityEdge trueEdge, ActivityEdge falseEdge,
         DFSGraph graph, StatementNode statementNode)
   {
      Node branchingNode = DfsFactory.eINSTANCE.createNode();
      Edge intTrueEdge = DfsFactory.eINSTANCE.createEdge();
      Edge intFalseEdge = DfsFactory.eINSTANCE.createEdge();
      branchingNode.setOrigin(statementNode);
      branchingNode.setGraph(graph);
      branchingNode.getOutgoing().add(intTrueEdge);
      intTrueEdge.setOrigin(trueEdge);
      intTrueEdge.setGraph(graph);
      branchingNode.getOutgoing().add(intFalseEdge);
      intFalseEdge.setGraph(graph);
      intFalseEdge.setOrigin(falseEdge);
      return new Object[] { branchingNode, trueEdge, intTrueEdge, falseEdge, graph, intFalseEdge, statementNode };
   }

   public static final Node pattern_SDMActivityGraphBuilder_2_7_expressionFB(Node branchingNode)
   {
      Node _result = branchingNode;
      return _result;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_3_1_CreateInternalStopNode_blackFBB(StopNode stopNode, SDMActivityGraphBuilder _this)
   {
      DFSGraph graph = _this.getGraph();
      if (graph != null)
      {
         return new Object[] { graph, stopNode, _this };
      }

      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_3_1_CreateInternalStopNode_greenBBF(DFSGraph graph, StopNode stopNode)
   {
      Node internalStopNode = DfsFactory.eINSTANCE.createNode();
      internalStopNode.setGraph(graph);
      internalStopNode.setOrigin(stopNode);
      return new Object[] { graph, stopNode, internalStopNode };
   }

   public static final Node pattern_SDMActivityGraphBuilder_3_2_expressionFB(Node internalStopNode)
   {
      Node _result = internalStopNode;
      return _result;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_4_1_DetermineDFSGraph_blackFB(SDMActivityGraphBuilder _this)
   {
      DFSGraph graph = _this.getGraph();
      if (graph != null)
      {
         return new Object[] { graph, _this };
      }

      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_4_2_InitValidationReport_blackFFB(SDMActivityGraphBuilder _this)
   {
      Validator validator = _this.getValidator();
      if (validator != null)
      {
         ValidationReport report = validator.getValidationReport();
         if (report != null)
         {
            return new Object[] { report, validator, _this };
         }

      }

      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_4_3_IsForEach_blackB(StoryNode storyNode)
   {
      boolean storyNode_forEach = storyNode.isForEach();
      if (Boolean.valueOf(storyNode_forEach).equals(Boolean.valueOf(true)))
      {
         return new Object[] { storyNode };
      }

      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_4_4_CheckForEach1_blackFB(StoryNode storyNode)
   {
      for (ActivityEdge endEdge : storyNode.getOutgoing())
      {
         EdgeGuard endEdge_guard = endEdge.getGuard();
         if (endEdge_guard.equals(EdgeGuard.END))
         {
            return new Object[] { endEdge, storyNode };
         }

      }
      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_4_5_NoSecondOutgoingEdge_black_nac_0BB(StoryNode storyNode, ActivityEdge endEdge)
   {
      for (ActivityEdge nacEdge : storyNode.getOutgoing())
      {
         if (!endEdge.equals(nacEdge))
         {
            return new Object[] { storyNode, endEdge };
         }
      }
      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_4_5_NoSecondOutgoingEdge_blackBB(StoryNode storyNode, ActivityEdge endEdge)
   {
      if (pattern_SDMActivityGraphBuilder_4_5_NoSecondOutgoingEdge_black_nac_0BB(storyNode, endEdge) == null)
      {
         return new Object[] { storyNode, endEdge };
      }
      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_4_6_HandleForEach1_blackBBB(StoryNode storyNode, ActivityEdge endEdge, DFSGraph graph)
   {
      return new Object[] { storyNode, endEdge, graph };
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_4_6_HandleForEach1_greenFFBBB(StoryNode storyNode, ActivityEdge endEdge, DFSGraph graph)
   {
      Edge intEndEdge1 = DfsFactory.eINSTANCE.createEdge();
      Node forEachNode1 = DfsFactory.eINSTANCE.createNode();
      intEndEdge1.setOrigin(endEdge);
      intEndEdge1.setGraph(graph);
      forEachNode1.setOrigin(storyNode);
      forEachNode1.getOutgoing().add(intEndEdge1);
      forEachNode1.setGraph(graph);
      return new Object[] { intEndEdge1, forEachNode1, storyNode, endEdge, graph };
   }

   public static final Node pattern_SDMActivityGraphBuilder_4_7_expressionFB(Node forEachNode1)
   {
      Node _result = forEachNode1;
      return _result;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_4_8_CheckForEach2_black_nac_0BBB(StoryNode storyNode, ActivityEdge forEachEdge,
         ActivityEdge endEdge)
   {
      if (!endEdge.equals(forEachEdge))
      {
         for (ActivityEdge thirdForEachEdge : storyNode.getOutgoing())
         {
            if (!forEachEdge.equals(thirdForEachEdge))
            {
               if (!endEdge.equals(thirdForEachEdge))
               {
                  return new Object[] { storyNode, forEachEdge, endEdge };
               }
            }
         }
      }
      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_4_8_CheckForEach2_blackBFB(StoryNode storyNode, ActivityEdge endEdge)
   {
      for (ActivityEdge forEachEdge : storyNode.getOutgoing())
      {
         if (!endEdge.equals(forEachEdge))
         {
            EdgeGuard forEachEdge_guard = forEachEdge.getGuard();
            if (forEachEdge_guard.equals(EdgeGuard.EACH_TIME))
            {
               if (pattern_SDMActivityGraphBuilder_4_8_CheckForEach2_black_nac_0BBB(storyNode, forEachEdge, endEdge) == null)
               {
                  return new Object[] { storyNode, forEachEdge, endEdge };
               }
            }

         }
      }
      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_4_9_HandleForEach2_blackBBBB(DFSGraph graph, ActivityEdge endEdge, StoryNode storyNode,
         ActivityEdge forEachEdge)
   {
      if (!endEdge.equals(forEachEdge))
      {
         return new Object[] { graph, endEdge, storyNode, forEachEdge };
      }
      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_4_9_HandleForEach2_greenFFBFBBB(DFSGraph graph, ActivityEdge endEdge, StoryNode storyNode,
         ActivityEdge forEachEdge)
   {
      Node forEachNode2 = DfsFactory.eINSTANCE.createNode();
      Edge intEndEdge2 = DfsFactory.eINSTANCE.createEdge();
      Edge intForEachEdge = DfsFactory.eINSTANCE.createEdge();
      forEachNode2.setOrigin(storyNode);
      forEachNode2.setGraph(graph);
      forEachNode2.getOutgoing().add(intEndEdge2);
      intEndEdge2.setOrigin(endEdge);
      intEndEdge2.setGraph(graph);
      forEachNode2.getOutgoing().add(intForEachEdge);
      intForEachEdge.setGraph(graph);
      intForEachEdge.setOrigin(forEachEdge);
      return new Object[] { forEachNode2, intEndEdge2, graph, intForEachEdge, endEdge, storyNode, forEachEdge };
   }

   public static final Node pattern_SDMActivityGraphBuilder_4_10_expressionFB(Node forEachNode2)
   {
      Node _result = forEachNode2;
      return _result;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_4_11_ReportFalseActivityEdge_blackBB(ValidationReport report, StoryNode storyNode)
   {
      return new Object[] { report, storyNode };
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_4_11_ReportFalseActivityEdge_greenBBFB(ValidationReport report, StoryNode storyNode,
         Validator validator)
   {
      ErrorMessage reportFalseOutEdge = ResultFactory.eINSTANCE.createErrorMessage();
      Severity reportFalseOutEdge_severity_prime = Severity.FATAL;
      String _localVariable_0 = validator.lookupErrorMessage(Errors.FOR_EACH_FALSE_OUTGOING_EDGE);
      reportFalseOutEdge.getLocation().add(storyNode);
      report.getErrorMessages().add(reportFalseOutEdge);
      reportFalseOutEdge.setSeverity(reportFalseOutEdge_severity_prime);
      String reportFalseOutEdge_id_prime = _localVariable_0;
      reportFalseOutEdge.setId(reportFalseOutEdge_id_prime);
      return new Object[] { report, storyNode, reportFalseOutEdge, validator };
   }

   public static final Node pattern_SDMActivityGraphBuilder_4_12_expressionF()
   {
      Node _result = null;
      return _result;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_4_13_ReportNoEndEdge_blackBB(StoryNode storyNode, ValidationReport report)
   {
      return new Object[] { storyNode, report };
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_4_13_ReportNoEndEdge_greenFB(Validator validator)
   {
      ErrorMessage reportNoEndEdge = ResultFactory.eINSTANCE.createErrorMessage();
      Severity reportNoEndEdge_severity_prime = Severity.FATAL;
      String _localVariable_0 = validator.lookupErrorMessage(Errors.FOR_EACH_NODE_HAS_EXACTLY_ONE_END_EDGE);
      reportNoEndEdge.setSeverity(reportNoEndEdge_severity_prime);
      String reportNoEndEdge_id_prime = _localVariable_0;
      reportNoEndEdge.setId(reportNoEndEdge_id_prime);
      return new Object[] { reportNoEndEdge, validator };
   }

   public static final Node pattern_SDMActivityGraphBuilder_4_14_expressionF()
   {
      Node _result = null;
      return _result;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_4_15_CheckRegularNode_black_nac_0BB(StoryNode storyNode, ActivityEdge regularEdge)
   {
      for (ActivityEdge secondEdge : storyNode.getOutgoing())
      {
         if (!regularEdge.equals(secondEdge))
         {
            return new Object[] { storyNode, regularEdge };
         }
      }
      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_4_15_CheckRegularNode_blackBF(StoryNode storyNode)
   {
      for (ActivityEdge regularEdge : storyNode.getOutgoing())
      {
         EdgeGuard regularEdge_guard = regularEdge.getGuard();
         if (regularEdge_guard.equals(EdgeGuard.NONE))
         {
            if (pattern_SDMActivityGraphBuilder_4_15_CheckRegularNode_black_nac_0BB(storyNode, regularEdge) == null)
            {
               return new Object[] { storyNode, regularEdge };
            }
         }

      }
      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_4_16_CreateSimpleNode_blackBBB(ActivityEdge regularEdge, DFSGraph graph, StoryNode storyNode)
   {
      return new Object[] { regularEdge, graph, storyNode };
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_4_16_CreateSimpleNode_greenBFBBF(ActivityEdge regularEdge, DFSGraph graph, StoryNode storyNode)
   {
      Edge internalRegularEdge = DfsFactory.eINSTANCE.createEdge();
      Node simpleNode = DfsFactory.eINSTANCE.createNode();
      internalRegularEdge.setOrigin(regularEdge);
      internalRegularEdge.setGraph(graph);
      simpleNode.setGraph(graph);
      simpleNode.setOrigin(storyNode);
      simpleNode.getOutgoing().add(internalRegularEdge);
      return new Object[] { regularEdge, internalRegularEdge, graph, storyNode, simpleNode };
   }

   public static final Node pattern_SDMActivityGraphBuilder_4_17_expressionFB(Node simpleNode)
   {
      Node _result = simpleNode;
      return _result;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_4_18_CheckBranchingNode_black_nac_0BBB(StoryNode storyNode, ActivityEdge falseEdge,
         ActivityEdge trueEdge)
   {
      if (!falseEdge.equals(trueEdge))
      {
         for (ActivityEdge thirdEdge : storyNode.getOutgoing())
         {
            if (!falseEdge.equals(thirdEdge))
            {
               if (!trueEdge.equals(thirdEdge))
               {
                  return new Object[] { storyNode, falseEdge, trueEdge };
               }
            }
         }
      }
      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_4_18_CheckBranchingNode_blackFBF(StoryNode storyNode)
   {
      for (ActivityEdge falseEdge : storyNode.getOutgoing())
      {
         EdgeGuard falseEdge_guard = falseEdge.getGuard();
         if (falseEdge_guard.equals(EdgeGuard.FAILURE))
         {
            for (ActivityEdge trueEdge : storyNode.getOutgoing())
            {
               if (!falseEdge.equals(trueEdge))
               {
                  EdgeGuard trueEdge_guard = trueEdge.getGuard();
                  if (trueEdge_guard.equals(EdgeGuard.SUCCESS))
                  {
                     if (pattern_SDMActivityGraphBuilder_4_18_CheckBranchingNode_black_nac_0BBB(storyNode, falseEdge, trueEdge) == null)
                     {
                        return new Object[] { falseEdge, storyNode, trueEdge };
                     }
                  }

               }
            }
         }

      }
      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_4_19_CreateBranchingNode_blackBBBB(StoryNode storyNode, ActivityEdge trueEdge, DFSGraph graph,
         ActivityEdge falseEdge)
   {
      if (!falseEdge.equals(trueEdge))
      {
         return new Object[] { storyNode, trueEdge, graph, falseEdge };
      }
      return null;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_4_19_CreateBranchingNode_greenBBBFFBF(StoryNode storyNode, ActivityEdge trueEdge,
         DFSGraph graph, ActivityEdge falseEdge)
   {
      Edge intTrueEdge = DfsFactory.eINSTANCE.createEdge();
      Node branchingNode = DfsFactory.eINSTANCE.createNode();
      Edge intFalseEdge = DfsFactory.eINSTANCE.createEdge();
      intTrueEdge.setGraph(graph);
      intTrueEdge.setOrigin(trueEdge);
      branchingNode.setGraph(graph);
      branchingNode.getOutgoing().add(intTrueEdge);
      branchingNode.setOrigin(storyNode);
      intFalseEdge.setGraph(graph);
      branchingNode.getOutgoing().add(intFalseEdge);
      intFalseEdge.setOrigin(falseEdge);
      return new Object[] { storyNode, trueEdge, graph, intTrueEdge, branchingNode, falseEdge, intFalseEdge };
   }

   public static final Node pattern_SDMActivityGraphBuilder_4_20_expressionFB(Node branchingNode)
   {
      Node _result = branchingNode;
      return _result;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_4_21_ReportInvalidOutgoingEdges_blackBBB(DFSGraph graph, ValidationReport report,
         StoryNode storyNode)
   {
      return new Object[] { graph, report, storyNode };
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_4_21_ReportInvalidOutgoingEdges_greenBFBFB(DFSGraph graph, StoryNode storyNode,
         Validator validator)
   {
      ErrorMessage reportInvalidOutEdges = ResultFactory.eINSTANCE.createErrorMessage();
      Node dummyNode = DfsFactory.eINSTANCE.createNode();
      Severity reportInvalidOutEdges_severity_prime = Severity.FATAL;
      String _localVariable_0 = validator.lookupErrorMessage(Errors.INVALID_OUTGOING_EDGES);
      dummyNode.setGraph(graph);
      dummyNode.setOrigin(storyNode);
      reportInvalidOutEdges.setSeverity(reportInvalidOutEdges_severity_prime);
      String reportInvalidOutEdges_id_prime = _localVariable_0;
      reportInvalidOutEdges.setId(reportInvalidOutEdges_id_prime);
      return new Object[] { graph, reportInvalidOutEdges, storyNode, dummyNode, validator };
   }

   public static final Iterable<Object[]> pattern_SDMActivityGraphBuilder_4_22_ForEachOutgoingEdge_blackBFB(Node dummyNode, StoryNode storyNode)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      if (storyNode.equals(dummyNode.getOrigin()))
      {
         for (ActivityEdge outgoingActivityEdge : storyNode.getOutgoing())
         {
            _result.add(new Object[] { dummyNode, outgoingActivityEdge, storyNode });
         }
      }
      return _result;
   }

   public static final Object[] pattern_SDMActivityGraphBuilder_4_22_ForEachOutgoingEdge_greenBFB(Node dummyNode, ActivityEdge outgoingActivityEdge)
   {
      Edge outgoingEdge = DfsFactory.eINSTANCE.createEdge();
      dummyNode.getOutgoing().add(outgoingEdge);
      outgoingEdge.setOrigin(outgoingActivityEdge);
      return new Object[] { dummyNode, outgoingEdge, outgoingActivityEdge };
   }

   public static final Node pattern_SDMActivityGraphBuilder_4_23_expressionFB(Node dummyNode)
   {
      Node _result = dummyNode;
      return _result;
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //SDMActivityGraphBuilderImpl
