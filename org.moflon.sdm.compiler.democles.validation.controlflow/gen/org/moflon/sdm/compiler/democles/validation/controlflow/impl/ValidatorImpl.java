/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow.impl;

import SDMLanguage.activities.Activity;
import SDMLanguage.activities.ActivityEdge;
import SDMLanguage.activities.ActivityNode;
import SDMLanguage.activities.EdgeGuard;
import SDMLanguage.activities.StartNode;
import SDMLanguage.activities.StopNode;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.DepthFirstSearch;
import org.moflon.core.dfs.DfsFactory;
import org.moflon.core.dfs.Edge;
import org.moflon.core.dfs.EdgeType;
import org.moflon.core.dfs.Node;

import org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder;
import org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowFactory;
import org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage;
import org.moflon.sdm.compiler.democles.validation.controlflow.DefaultComponentProcessor;
import org.moflon.sdm.compiler.democles.validation.controlflow.Errors;
import org.moflon.sdm.compiler.democles.validation.controlflow.ForEachComponentProcessor;
import org.moflon.sdm.compiler.democles.validation.controlflow.InefficientBootstrappingBuilder;
import org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder;
import org.moflon.sdm.compiler.democles.validation.controlflow.Validator;

import org.moflon.sdm.compiler.democles.validation.result.ErrorMessage;
import org.moflon.sdm.compiler.democles.validation.result.ResultFactory;
import org.moflon.sdm.compiler.democles.validation.result.Severity;
import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;

import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.DemoclesFactory;
import org.moflon.sdm.runtime.democles.Scope;
// <-- [user defined imports]
import java.util.Comparator;
import org.moflon.core.utilities.WorkspaceHelper;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.ValidatorImpl#getBuilders <em>Builders</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.ValidatorImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.ValidatorImpl#getValidationReport <em>Validation Report</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.ValidatorImpl#getStopNodeInForEachComponentSeverity <em>Stop Node In For Each Component Severity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValidatorImpl extends EObjectImpl implements Validator
{
   /**
    * The cached value of the '{@link #getBuilders() <em>Builders</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getBuilders()
    * @generated
    * @ordered
    */
   protected EList<SDMActivityGraphBuilder> builders;

   /**
    * The cached value of the '{@link #getGraph() <em>Graph</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getGraph()
    * @generated
    * @ordered
    */
   protected DFSGraph graph;

   /**
    * The cached value of the '{@link #getValidationReport() <em>Validation Report</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getValidationReport()
    * @generated
    * @ordered
    */
   protected ValidationReport validationReport;

   /**
    * The default value of the '{@link #getStopNodeInForEachComponentSeverity() <em>Stop Node In For Each Component Severity</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getStopNodeInForEachComponentSeverity()
    * @generated
    * @ordered
    */
   protected static final Severity STOP_NODE_IN_FOR_EACH_COMPONENT_SEVERITY_EDEFAULT = Severity.OK;

   /**
    * The cached value of the '{@link #getStopNodeInForEachComponentSeverity() <em>Stop Node In For Each Component Severity</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getStopNodeInForEachComponentSeverity()
    * @generated
    * @ordered
    */
   protected Severity stopNodeInForEachComponentSeverity = STOP_NODE_IN_FOR_EACH_COMPONENT_SEVERITY_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ValidatorImpl()
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
      return ControlflowPackage.Literals.VALIDATOR;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<SDMActivityGraphBuilder> getBuilders()
   {
      if (builders == null)
      {
         builders = new EObjectWithInverseResolvingEList<SDMActivityGraphBuilder>(SDMActivityGraphBuilder.class, this, ControlflowPackage.VALIDATOR__BUILDERS,
               ControlflowPackage.SDM_ACTIVITY_GRAPH_BUILDER__VALIDATOR);
      }
      return builders;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DFSGraph getGraph()
   {
      return graph;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetGraph(DFSGraph newGraph, NotificationChain msgs)
   {
      DFSGraph oldGraph = graph;
      graph = newGraph;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlflowPackage.VALIDATOR__GRAPH, oldGraph, newGraph);
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
   public void setGraph(DFSGraph newGraph)
   {
      if (newGraph != graph)
      {
         NotificationChain msgs = null;
         if (graph != null)
            msgs = ((InternalEObject) graph).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ControlflowPackage.VALIDATOR__GRAPH, null, msgs);
         if (newGraph != null)
            msgs = ((InternalEObject) newGraph).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ControlflowPackage.VALIDATOR__GRAPH, null, msgs);
         msgs = basicSetGraph(newGraph, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.VALIDATOR__GRAPH, newGraph, newGraph));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ValidationReport getValidationReport()
   {
      return validationReport;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetValidationReport(ValidationReport newValidationReport, NotificationChain msgs)
   {
      ValidationReport oldValidationReport = validationReport;
      validationReport = newValidationReport;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlflowPackage.VALIDATOR__VALIDATION_REPORT, oldValidationReport,
               newValidationReport);
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
   public void setValidationReport(ValidationReport newValidationReport)
   {
      if (newValidationReport != validationReport)
      {
         NotificationChain msgs = null;
         if (validationReport != null)
            msgs = ((InternalEObject) validationReport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ControlflowPackage.VALIDATOR__VALIDATION_REPORT, null,
                  msgs);
         if (newValidationReport != null)
            msgs = ((InternalEObject) newValidationReport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ControlflowPackage.VALIDATOR__VALIDATION_REPORT, null,
                  msgs);
         msgs = basicSetValidationReport(newValidationReport, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.VALIDATOR__VALIDATION_REPORT, newValidationReport, newValidationReport));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Severity getStopNodeInForEachComponentSeverity()
   {
      return stopNodeInForEachComponentSeverity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setStopNodeInForEachComponentSeverity(Severity newStopNodeInForEachComponentSeverity)
   {
      Severity oldStopNodeInForEachComponentSeverity = stopNodeInForEachComponentSeverity;
      stopNodeInForEachComponentSeverity = newStopNodeInForEachComponentSeverity == null ? STOP_NODE_IN_FOR_EACH_COMPONENT_SEVERITY_EDEFAULT
            : newStopNodeInForEachComponentSeverity;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.VALIDATOR__STOP_NODE_IN_FOR_EACH_COMPONENT_SEVERITY,
               oldStopNodeInForEachComponentSeverity, stopNodeInForEachComponentSeverity));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean hasFatalErrors()
   {// 
      Object[] result1_black = ValidatorImpl.pattern_Validator_0_1_CheckFatalErrors_blackFFB(this);
      if (result1_black != null)
      {
         //nothing ErrorMessage error = (ErrorMessage) result1_black[0];
         ValidationReport report = (ValidationReport) result1_black[1];
         // 
         Object[] result2_black = ValidatorImpl.pattern_Validator_0_2_RemoveResult_blackFB(report);
         if (result2_black != null)
         {
            CFNode result = (CFNode) result2_black[0];
            ValidatorImpl.pattern_Validator_0_2_RemoveResult_redBB(result, report);

         } else
         {
         }
         return ValidatorImpl.pattern_Validator_0_3_expressionF();
      } else
      {
         return ValidatorImpl.pattern_Validator_0_4_expressionF();
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String lookupErrorMessage(Errors errorID)
   {
      // [user code injected with eMoflon]

      if (Errors.EXACTLY_ONE_START_NODE == errorID)
      {
         return "Exactly one start node";
      } else if (Errors.AT_LEAST_ONE_STOP_NODE == errorID)
      {
         return "At least one stop node";
      } else if (Errors.NO_OUTGOING_EDGE_FROM_STOP_NODE == errorID)
      {
         return "No outgoing edge from stop node";
      } else if (Errors.ACTIVITY_EDGE_END_NODES_IN_SAME_ACTIVITY == errorID)
      {
         return "Activity edge end nodes in same activity";
      } else if (Errors.FOR_EACH_EDGE_FORWARD == errorID)
      {
         return "Invalid ForEach edge (This might be a bug in the control flow validation. Please report here: " + WorkspaceHelper.ISSUE_TRACKER_URL + ".)";
      } else if (Errors.ONE_EDGE_BACK_FROM_FOREACH_COMPONENT == errorID)
      {
         return "At least one edge must lead from a ForEach component to the corresponding ForEach node";
      } else if (Errors.NO_EDGE_OUT_OF_FOREACH_COMPONENT == errorID)
      {
         return "A cycle represented by a ForEach component must always end in the corresponding ForEach node";
      } else if (Errors.NO_STOP_NODE_IN_FOREACH_COMPONENT == errorID)
      {
         return "Stop nodes in ForEach components are disallowed";
      } else if (Errors.MAX_TWO_OUTGOING_EDGES == errorID)
      {
         return "An activity node can have at most two outgoing edges";
      } else if (Errors.NODE_HAS_TO_HAVE_OUTGOING_EDGE == errorID)
      {
         return "Each activity node must have at least one outgoing edge";
      } else if (Errors.NO_INCOMING_EDGE_INTO_START_NODE == errorID)
      {
         return "Incoming edges into a start node are disallowed";
      } else if (Errors.ONE_OUTGOING_EDGE_FROM_START_NODE == errorID)
      {
         return "Only one unguarded outgoing edge from a start node is allowed";
      } else if (Errors.ONLY_ONE_EACH_TIME_EDGE == errorID)
      {
         return "Only one EachTime edge from a ForEach node is allowed";
      } else if (Errors.FOR_EACH_FALSE_OUTGOING_EDGE == errorID)
      {
         return "A ForEach node has exactly one End edge and at most one EachTime edge";
      } else if (Errors.FOR_EACH_NODE_HAS_EXACTLY_ONE_END_EDGE == errorID)
      {
         return "A ForEach node has exactly one End edge";
      } else if (Errors.INVALID_OUTGOING_EDGES == errorID)
      {
         return "A simple (non-ForEach) node has either one outgoing edge without guard or one Success and one Failure edge";
      } else if (Errors.EMBEDDED_LOOP_FOUND == errorID)
      {
         return "While iterating through nested loops, an embedded loop has been found";
      } else if (Errors.HEAD_LOOP_EXT_BWD_EDGE == errorID)
      {
         return "An outermost loop head cannot have additional external backward edges";
      } else if (Errors.SECOND_OUT_EDGE_INVALID == errorID)
      {
         return "Second outgoing edge has invalid type";
      } else if (Errors.IFTHEN_ONLY_ONE_JOIN_NODE == errorID)
      {
         return "The two branches of an if-then structure have to join in one node";
      } else if (Errors.BOTH_BRANCHES_HEAD_CONTROLLED == errorID)
      {
         return "Two head-controlled loops cannot have the same head node";
      } else if (Errors.BOTH_BRANCHES_TAIL_CONTROLLED == errorID)
      {
         return "Two tail-controlled loops cannot begin at the same node";
      } else if (Errors.FOREACH_END_EDGE_ERROR == errorID)
      {
         return "The target of the End Edge is set invalid (probably is within the ForEach loop)";
      } else if (Errors.EDGE_TARGET_UNKNOWN_TYPE == errorID)
      {
         return "The target of the edge is of unknown type";
      } else if (Errors.LOOP_EXTERN_EDGE == errorID)
      {
         return "Erroneous loop closing edge";
      } else if (Errors.THEN_ELSE_BRANCH_INVALID_LOOP_CONTAINMENT == errorID)
      {
         return "Edge in a then or else branch can only lead to the closest Loop or ForEach node";
      } else if (Errors.LOOP_CROSSING_EDGE == errorID)
      {
         return "Loop crossing edge found";
      }
      return "Unknown error";

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void sortIncomingEdges(Node node)
   {
      // [user code injected with eMoflon]

      // Collections.sort(node.getIncoming(), EDGE_COMPARATOR);

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public StartNode syntacticCheckWithStartNodeLookup(Activity activity)
   {

      Object[] result1_black = ValidatorImpl.pattern_Validator_3_1_LookupValidationReport_blackFB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      ValidationReport report = (ValidationReport) result1_black[0];
      // 
      Object[] result2_black = ValidatorImpl.pattern_Validator_3_2_AtLeastOneStartNode_blackBF(activity);
      if (result2_black != null)
      {
         StartNode startNode = (StartNode) result2_black[1];
         // 
         Object[] result3_black = ValidatorImpl.pattern_Validator_3_3_AtMostOneStartNode_blackBFB(startNode, activity);
         if (result3_black != null)
         {
            //nothing StartNode secondStartNode = (StartNode) result3_black[1];

            Object[] result4_black = ValidatorImpl.pattern_Validator_3_4_ReportSuperfluousStartNodes_blackB(report);
            if (result4_black == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[report] = " + report + ".");
            }
            Object[] result4_green = ValidatorImpl.pattern_Validator_3_4_ReportSuperfluousStartNodes_greenFBB(report, this);
            ErrorMessage superfluousStartNode = (ErrorMessage) result4_green[0];

            // ForEach 
            for (Object[] result5_black : ValidatorImpl.pattern_Validator_3_5_AddSuperfluousStartNodeLocations_blackBBF(superfluousStartNode, activity))
            {
               StartNode erroneousStartNode = (StartNode) result5_black[2];
               ValidatorImpl.pattern_Validator_3_5_AddSuperfluousStartNodeLocations_greenBB(superfluousStartNode, erroneousStartNode);

            }
            return ValidatorImpl.pattern_Validator_3_6_expressionF();
         } else
         {
            // 
            Object[] result7_black = ValidatorImpl.pattern_Validator_3_7_AtLeastOneStopNode_blackBF(activity);
            if (result7_black != null)
            {
               //nothing StopNode firstStopNode = (StopNode) result7_black[1];
            } else
            {

               Object[] result8_black = ValidatorImpl.pattern_Validator_3_8_ReportMissingStopNode_blackBB(report, activity);
               if (result8_black == null)
               {
                  throw new RuntimeException("Pattern matching failed." + " Variables: " + "[report] = " + report + ", " + "[activity] = " + activity + ".");
               }
               ValidatorImpl.pattern_Validator_3_8_ReportMissingStopNode_greenFBBB(report, activity, this);
               //nothing ErrorMessage missingStopNode = (ErrorMessage) result8_green[0];

            }
            // ForEach 
            for (Object[] result9_black : ValidatorImpl.pattern_Validator_3_9_ForAllStopNodes_blackFB(activity))
            {
               StopNode stopNode = (StopNode) result9_black[0];
               // ForEach 
               for (Object[] result10_black : ValidatorImpl.pattern_Validator_3_10_NoOutgoingEdgesFromStopNodes_blackBFB(report, stopNode))
               {
                  ActivityEdge stopOutgoingEdge = (ActivityEdge) result10_black[1];
                  ValidatorImpl.pattern_Validator_3_10_NoOutgoingEdgesFromStopNodes_greenBBFB(report, stopOutgoingEdge, this);
                  //nothing ErrorMessage stopOutgoingEdgeError = (ErrorMessage) result10_green[2];

               }

            }
            // ForEach 
            for (Object[] result11_black : ValidatorImpl.pattern_Validator_3_11_ForEachActivityEdge_blackBF(activity))
            {
               ActivityEdge edge = (ActivityEdge) result11_black[1];
               // 
               Object[] result12_black = ValidatorImpl.pattern_Validator_3_12_ActivityEdgeEndNodesInTheSameActivity_blackFBFB(edge, activity);
               if (result12_black != null)
               {
                  //nothing ActivityNode source = (ActivityNode) result12_black[0];
                  //nothing ActivityNode target = (ActivityNode) result12_black[2];
               } else
               {

                  Object[] result13_black = ValidatorImpl.pattern_Validator_3_13_ReportActivityEdgeEndNodesInDifferentAcitivities_blackBB(edge, report);
                  if (result13_black == null)
                  {
                     throw new RuntimeException("Pattern matching failed." + " Variables: " + "[edge] = " + edge + ", " + "[report] = " + report + ".");
                  }
                  ValidatorImpl.pattern_Validator_3_13_ReportActivityEdgeEndNodesInDifferentAcitivities_greenFBBB(edge, report, this);
                  //nothing ErrorMessage activityEdgeEndNodeInSameActivity = (ErrorMessage) result13_green[0];

               }

            }
            return ValidatorImpl.pattern_Validator_3_14_expressionFB(startNode);
         }

      } else
      {

         Object[] result15_black = ValidatorImpl.pattern_Validator_3_15_ReportMissingStartNode_blackBB(report, activity);
         if (result15_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[report] = " + report + ", " + "[activity] = " + activity + ".");
         }
         ValidatorImpl.pattern_Validator_3_15_ReportMissingStartNode_greenBFBB(report, activity, this);
         //nothing ErrorMessage missingStartNode = (ErrorMessage) result15_green[1];

         return ValidatorImpl.pattern_Validator_3_16_expressionF();
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ValidationReport validate(Activity activity)
   {

      Object[] result1_black = ValidatorImpl.pattern_Validator_4_1_CreateInefficientBuilder_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      Object[] result1_green = ValidatorImpl.pattern_Validator_4_1_CreateInefficientBuilder_greenBFFF(this);
      InefficientBootstrappingBuilder inefficientBuilder = (InefficientBootstrappingBuilder) result1_green[1];
      //nothing SDMActivityGraphBuilder builder = (SDMActivityGraphBuilder) result1_green[2];
      //nothing DFSGraph graph = (DFSGraph) result1_green[3];

      Object[] result2_bindingAndBlack = ValidatorImpl.pattern_Validator_4_2_InvokeValidation_bindingAndBlackFBBB(this, activity, inefficientBuilder);
      if (result2_bindingAndBlack == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[activity] = " + activity + ", "
               + "[inefficientBuilder] = " + inefficientBuilder + ".");
      }
      ValidationReport report = (ValidationReport) result2_bindingAndBlack[0];
      return ValidatorImpl.pattern_Validator_4_3_expressionFB(report);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ValidationReport validate(Activity activity, SDMActivityGraphBuilder builder)
   {

      Object[] result1_black = ValidatorImpl.pattern_Validator_5_1_CreateValidationReport_blackB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      Object[] result1_green = ValidatorImpl.pattern_Validator_5_1_CreateValidationReport_greenFB(this);
      ValidationReport report = (ValidationReport) result1_green[0];

      // 
      Object[] result2_bindingAndBlack = ValidatorImpl.pattern_Validator_5_2_BasicSyntacticCheck_bindingAndBlackFBB(this, activity);
      if (result2_bindingAndBlack != null)
      {
         StartNode startNode = (StartNode) result2_bindingAndBlack[0];
         // 
         Object[] result3_black = ValidatorImpl.pattern_Validator_5_3_CheckFatalErrorsAfterBasicSyntacticCheck_blackFB(report);
         if (result3_black != null)
         {
            //nothing ErrorMessage fatalError1 = (ErrorMessage) result3_black[0];
            return ValidatorImpl.pattern_Validator_5_4_expressionFB(report);
         } else
         {

            Object[] result5_black = ValidatorImpl.pattern_Validator_5_5_Initialization_blackBB(builder, this);
            if (result5_black == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[builder] = " + builder + ", " + "[this] = " + this + ".");
            }
            Object[] result5_green = ValidatorImpl.pattern_Validator_5_5_Initialization_greenBFBF(builder, this);
            DefaultComponentProcessor visitor = (DefaultComponentProcessor) result5_green[1];
            DepthFirstSearch defaultEdgeProcessor = (DepthFirstSearch) result5_green[3];

            Object[] result6_bindingAndBlack = ValidatorImpl.pattern_Validator_5_6_DetermineStartNodeForDFS_bindingAndBlackFBB(builder, startNode);
            if (result6_bindingAndBlack == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[builder] = " + builder + ", " + "[startNode] = " + startNode + ".");
            }
            Node intStartNode = (Node) result6_bindingAndBlack[0];
            // 
            ValidatorImpl.pattern_Validator_5_7_PerformDFS_expressionFBB(visitor, intStartNode);

            Object[] result8_black = ValidatorImpl.pattern_Validator_5_8_InsertForEachComponentProcessor_blackBBB(visitor, this, defaultEdgeProcessor);
            if (result8_black == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[visitor] = " + visitor + ", " + "[this] = " + this + ", "
                     + "[defaultEdgeProcessor] = " + defaultEdgeProcessor + ".");
            }
            ValidatorImpl.pattern_Validator_5_8_InsertForEachComponentProcessor_redBB(visitor, defaultEdgeProcessor);

            Object[] result8_green = ValidatorImpl.pattern_Validator_5_8_InsertForEachComponentProcessor_greenBBBF(visitor, this, defaultEdgeProcessor);
            ForEachComponentProcessor forEachComponentProcessor = (ForEachComponentProcessor) result8_green[3];

            // 
            Object[] result9_black = ValidatorImpl.pattern_Validator_5_9_HasMoreForEachComponents_blackFFBFFF(builder);
            while (result9_black != null)
            {
               Node forEachNode = (Node) result9_black[0];
               Edge edge = (Edge) result9_black[1];
               Node componentStartNode = (Node) result9_black[3];
               //nothing DFSGraph graph = (DFSGraph) result9_black[4];
               //nothing ActivityEdge actEdge = (ActivityEdge) result9_black[5];

               // 
               Object[] result10_black = ValidatorImpl.pattern_Validator_5_10_LookupForEachComponentProcessorParameters_blackFFB(forEachComponentProcessor);
               if (result10_black != null)
               {
                  Node prevForEachNode = (Node) result10_black[0];
                  Node prevComponentStartNode = (Node) result10_black[1];

                  Object[] result11_black = ValidatorImpl.pattern_Validator_5_11_DeleteForEachComponentProcessorParameters_blackBBB(prevForEachNode,
                        forEachComponentProcessor, prevComponentStartNode);
                  if (result11_black == null)
                  {
                     throw new RuntimeException(
                           "Pattern matching failed." + " Variables: " + "[prevForEachNode] = " + prevForEachNode + ", " + "[forEachComponentProcessor] = "
                                 + forEachComponentProcessor + ", " + "[prevComponentStartNode] = " + prevComponentStartNode + ".");
                  }
                  ValidatorImpl.pattern_Validator_5_11_DeleteForEachComponentProcessorParameters_redBBB(prevForEachNode, forEachComponentProcessor,
                        prevComponentStartNode);

               } else
               {
               }

               Object[] result12_black = ValidatorImpl.pattern_Validator_5_12_CreateForEachComponentProcessorParameters_blackBBB(componentStartNode,
                     forEachComponentProcessor, forEachNode);
               if (result12_black == null)
               {
                  throw new RuntimeException("Pattern matching failed." + " Variables: " + "[componentStartNode] = " + componentStartNode + ", "
                        + "[forEachComponentProcessor] = " + forEachComponentProcessor + ", " + "[forEachNode] = " + forEachNode + ".");
               }
               ValidatorImpl.pattern_Validator_5_12_CreateForEachComponentProcessorParameters_greenBBB(componentStartNode, forEachComponentProcessor,
                     forEachNode);

               // 
               ValidatorImpl.pattern_Validator_5_13_ProcessForEachComponent_expressionFBB(visitor, componentStartNode);
               // 
               Object[] result14_black = ValidatorImpl.pattern_Validator_5_14_BackwardEdgeFromComponentStartNodeToForEachNodeExists_blackFBB(forEachNode,
                     componentStartNode);
               if (result14_black != null)
               {
                  //nothing Edge backEdge1 = (Edge) result14_black[0];
               } else
               {
                  // 
                  Object[] result15_black = ValidatorImpl.pattern_Validator_5_15_AtLeastOneBackwardEdgeFromComponentToForEachNodeExists_blackFBFB(forEachNode,
                        componentStartNode);
                  if (result15_black != null)
                  {
                     //nothing Node nodeInForEachComponent = (Node) result15_black[0];
                     //nothing Edge backEdge2 = (Edge) result15_black[2];
                  } else
                  {

                     Object[] result16_black = ValidatorImpl.pattern_Validator_5_16_ReportNoEdgeBack_blackBFB(report, forEachNode);
                     if (result16_black == null)
                     {
                        throw new RuntimeException(
                              "Pattern matching failed." + " Variables: " + "[report] = " + report + ", " + "[forEachNode] = " + forEachNode + ".");
                     }
                     ActivityNode forEachActivity = (ActivityNode) result16_black[1];
                     ValidatorImpl.pattern_Validator_5_16_ReportNoEdgeBack_greenFBBB(report, forEachActivity, this);
                     //nothing ErrorMessage backwardEdgeMissingFromForEachComponent = (ErrorMessage) result16_green[0];

                  }

               }
               // ForEach 
               for (Object[] result17_black : ValidatorImpl.pattern_Validator_5_17_StumpBackwardEdgesToForEachNode1_blackFBB(componentStartNode, forEachNode))
               {
                  Edge backwardEdge1 = (Edge) result17_black[0];
                  ValidatorImpl.pattern_Validator_5_17_StumpBackwardEdgesToForEachNode1_redBB(backwardEdge1, forEachNode);

                  ValidatorImpl.pattern_Validator_5_17_StumpBackwardEdgesToForEachNode1_greenB(backwardEdge1);

               }
               // ForEach 
               for (Object[] result18_black : ValidatorImpl.pattern_Validator_5_18_StumpBackwardEdgesToForEachNode2_blackBFFB(forEachNode, componentStartNode))
               {
                  //nothing Node sourceNodeInForEachComponent = (Node) result18_black[1];
                  Edge backwardEdge2 = (Edge) result18_black[2];
                  ValidatorImpl.pattern_Validator_5_18_StumpBackwardEdgesToForEachNode2_redBB(forEachNode, backwardEdge2);

                  ValidatorImpl.pattern_Validator_5_18_StumpBackwardEdgesToForEachNode2_greenB(backwardEdge2);

               }
               // 
               ValidatorImpl.pattern_Validator_5_19_CategorizeEachTimeEdge_expressionFBB(defaultEdgeProcessor, edge);
               // 
               Object[] result20_black = ValidatorImpl.pattern_Validator_5_20_CheckEachTimeEdgeCategorization_blackB(edge);
               if (result20_black != null)
               {
               } else
               {

                  Object[] result21_black = ValidatorImpl.pattern_Validator_5_21_ReportNotForwardEdge_blackFBB(edge, report);
                  if (result21_black == null)
                  {
                     throw new RuntimeException("Pattern matching failed." + " Variables: " + "[edge] = " + edge + ", " + "[report] = " + report + ".");
                  }
                  ActivityEdge activityEdge = (ActivityEdge) result21_black[0];
                  ValidatorImpl.pattern_Validator_5_21_ReportNotForwardEdge_greenFBBB(activityEdge, report, this);
                  //nothing ErrorMessage forEachEdgeNotForward = (ErrorMessage) result21_green[0];

               }
               // 

               result9_black = ValidatorImpl.pattern_Validator_5_9_HasMoreForEachComponents_blackFFBFFF(builder);
            }

            Object[] result23_black = ValidatorImpl.pattern_Validator_5_23_LookupGraph_blackFB(intStartNode);
            if (result23_black == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[intStartNode] = " + intStartNode + ".");
            }
            DFSGraph g = (DFSGraph) result23_black[0];
            // ForEach 
            for (Object[] result24_black : ValidatorImpl.pattern_Validator_5_24_AllNodes_blackBF(g))
            {
               Node dfsNode = (Node) result24_black[1];
               // 
               Object[] result25_black = ValidatorImpl.pattern_Validator_5_25_RefersToStopNode_blackBF(dfsNode);
               if (result25_black != null)
               {
                  //nothing StopNode stopNode = (StopNode) result25_black[1];
               } else
               {
                  // 
                  Object[] result26_black = ValidatorImpl.pattern_Validator_5_26_HasEachNodeOutgoingEdges_blackFB(dfsNode);
                  if (result26_black != null)
                  {
                     //nothing Edge testOutgoingEdge = (Edge) result26_black[0];
                  } else
                  {

                     Object[] result27_black = ValidatorImpl.pattern_Validator_5_27_ErrorHandling_blackBFB(dfsNode, report);
                     if (result27_black == null)
                     {
                        throw new RuntimeException(
                              "Pattern matching failed." + " Variables: " + "[dfsNode] = " + dfsNode + ", " + "[report] = " + report + ".");
                     }
                     ActivityNode actNode = (ActivityNode) result27_black[1];
                     ValidatorImpl.pattern_Validator_5_27_ErrorHandling_greenFBBB(actNode, report, this);
                     //nothing ErrorMessage noOutgoingEdge = (ErrorMessage) result27_green[0];

                  }

               }

            }
            // 
            Object[] result28_black = ValidatorImpl.pattern_Validator_5_28_LookupRealStartNode_blackBFF(intStartNode);
            if (result28_black != null)
            {
               Node intRealStartNode = (Node) result28_black[1];
               //nothing Edge startToRealStartEdge = (Edge) result28_black[2];

               Object[] result29_black = ValidatorImpl.pattern_Validator_5_29_InitializeControlFlowAnalysis_blackB(this);
               if (result29_black == null)
               {
                  throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
               }
               Object[] result29_green = ValidatorImpl.pattern_Validator_5_29_InitializeControlFlowAnalysis_greenFFB(this);
               Scope scope = (Scope) result29_green[0];
               ControlFlowBuilder analyzer = (ControlFlowBuilder) result29_green[1];

               Object[] result30_bindingAndBlack = ValidatorImpl.pattern_Validator_5_30_PerformControlFlowAnalysis_bindingAndBlackFBBB(analyzer, scope,
                     intRealStartNode);
               if (result30_bindingAndBlack == null)
               {
                  throw new RuntimeException("Pattern matching failed." + " Variables: " + "[analyzer] = " + analyzer + ", " + "[scope] = " + scope + ", "
                        + "[intRealStartNode] = " + intRealStartNode + ".");
               }
               ValidationReport controlFlowReport = (ValidationReport) result30_bindingAndBlack[0];

               Object[] result31_black = ValidatorImpl.pattern_Validator_5_31_AddScopeToValidationResult_blackBBF(controlFlowReport, scope);
               if (result31_black == null)
               {
                  throw new RuntimeException(
                        "Pattern matching failed." + " Variables: " + "[controlFlowReport] = " + controlFlowReport + ", " + "[scope] = " + scope + ".");
               }
               CFNode controlFlow = (CFNode) result31_black[2];
               ValidatorImpl.pattern_Validator_5_31_AddScopeToValidationResult_redBB(controlFlowReport, controlFlow);

               ValidatorImpl.pattern_Validator_5_31_AddScopeToValidationResult_greenBB(controlFlowReport, scope);

               return ValidatorImpl.pattern_Validator_5_32_expressionFB(controlFlowReport);
            } else
            {
               return ValidatorImpl.pattern_Validator_5_33_expressionFB(report);
            }

         }

      } else
      {
         return ValidatorImpl.pattern_Validator_5_34_expressionFB(report);
      }

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
      case ControlflowPackage.VALIDATOR__BUILDERS:
         return ((InternalEList<InternalEObject>) (InternalEList<?>) getBuilders()).basicAdd(otherEnd, msgs);
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
      case ControlflowPackage.VALIDATOR__BUILDERS:
         return ((InternalEList<?>) getBuilders()).basicRemove(otherEnd, msgs);
      case ControlflowPackage.VALIDATOR__GRAPH:
         return basicSetGraph(null, msgs);
      case ControlflowPackage.VALIDATOR__VALIDATION_REPORT:
         return basicSetValidationReport(null, msgs);
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
      case ControlflowPackage.VALIDATOR__BUILDERS:
         return getBuilders();
      case ControlflowPackage.VALIDATOR__GRAPH:
         return getGraph();
      case ControlflowPackage.VALIDATOR__VALIDATION_REPORT:
         return getValidationReport();
      case ControlflowPackage.VALIDATOR__STOP_NODE_IN_FOR_EACH_COMPONENT_SEVERITY:
         return getStopNodeInForEachComponentSeverity();
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
      case ControlflowPackage.VALIDATOR__BUILDERS:
         getBuilders().clear();
         getBuilders().addAll((Collection<? extends SDMActivityGraphBuilder>) newValue);
         return;
      case ControlflowPackage.VALIDATOR__GRAPH:
         setGraph((DFSGraph) newValue);
         return;
      case ControlflowPackage.VALIDATOR__VALIDATION_REPORT:
         setValidationReport((ValidationReport) newValue);
         return;
      case ControlflowPackage.VALIDATOR__STOP_NODE_IN_FOR_EACH_COMPONENT_SEVERITY:
         setStopNodeInForEachComponentSeverity((Severity) newValue);
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
      case ControlflowPackage.VALIDATOR__BUILDERS:
         getBuilders().clear();
         return;
      case ControlflowPackage.VALIDATOR__GRAPH:
         setGraph((DFSGraph) null);
         return;
      case ControlflowPackage.VALIDATOR__VALIDATION_REPORT:
         setValidationReport((ValidationReport) null);
         return;
      case ControlflowPackage.VALIDATOR__STOP_NODE_IN_FOR_EACH_COMPONENT_SEVERITY:
         setStopNodeInForEachComponentSeverity(STOP_NODE_IN_FOR_EACH_COMPONENT_SEVERITY_EDEFAULT);
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
      case ControlflowPackage.VALIDATOR__BUILDERS:
         return builders != null && !builders.isEmpty();
      case ControlflowPackage.VALIDATOR__GRAPH:
         return graph != null;
      case ControlflowPackage.VALIDATOR__VALIDATION_REPORT:
         return validationReport != null;
      case ControlflowPackage.VALIDATOR__STOP_NODE_IN_FOR_EACH_COMPONENT_SEVERITY:
         return stopNodeInForEachComponentSeverity != STOP_NODE_IN_FOR_EACH_COMPONENT_SEVERITY_EDEFAULT;
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
      case ControlflowPackage.VALIDATOR___HAS_FATAL_ERRORS:
         return hasFatalErrors();
      case ControlflowPackage.VALIDATOR___LOOKUP_ERROR_MESSAGE__ERRORS:
         return lookupErrorMessage((Errors) arguments.get(0));
      case ControlflowPackage.VALIDATOR___SORT_INCOMING_EDGES__NODE:
         sortIncomingEdges((Node) arguments.get(0));
         return null;
      case ControlflowPackage.VALIDATOR___SYNTACTIC_CHECK_WITH_START_NODE_LOOKUP__ACTIVITY:
         return syntacticCheckWithStartNodeLookup((Activity) arguments.get(0));
      case ControlflowPackage.VALIDATOR___VALIDATE__ACTIVITY:
         return validate((Activity) arguments.get(0));
      case ControlflowPackage.VALIDATOR___VALIDATE__ACTIVITY_SDMACTIVITYGRAPHBUILDER:
         return validate((Activity) arguments.get(0), (SDMActivityGraphBuilder) arguments.get(1));
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
      result.append(" (stopNodeInForEachComponentSeverity: ");
      result.append(stopNodeInForEachComponentSeverity);
      result.append(')');
      return result.toString();
   }

   public static final Object[] pattern_Validator_0_1_CheckFatalErrors_blackFFB(Validator _this)
   {
      ValidationReport report = _this.getValidationReport();
      if (report != null)
      {
         for (ErrorMessage error : report.getErrorMessages())
         {
            Severity error_severity = error.getSeverity();
            if (error_severity.equals(Severity.FATAL))
            {
               return new Object[] { error, report, _this };
            }

         }
      }

      return null;
   }

   public static final Object[] pattern_Validator_0_2_RemoveResult_blackFB(ValidationReport report)
   {
      EObject tmpResult = report.getResult();
      if (tmpResult instanceof CFNode)
      {
         CFNode result = (CFNode) tmpResult;
         return new Object[] { result, report };
      }

      return null;
   }

   public static final Object[] pattern_Validator_0_2_RemoveResult_redBB(CFNode result, ValidationReport report)
   {
      report.setResult(null);
      return new Object[] { result, report };
   }

   public static final boolean pattern_Validator_0_3_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final boolean pattern_Validator_0_4_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final Object[] pattern_Validator_3_1_LookupValidationReport_blackFB(Validator _this)
   {
      ValidationReport report = _this.getValidationReport();
      if (report != null)
      {
         return new Object[] { report, _this };
      }

      return null;
   }

   public static final Object[] pattern_Validator_3_2_AtLeastOneStartNode_blackBF(Activity activity)
   {
      for (ActivityNode tmpStartNode : activity.getOwnedActivityNode())
      {
         if (tmpStartNode instanceof StartNode)
         {
            StartNode startNode = (StartNode) tmpStartNode;
            return new Object[] { activity, startNode };
         }
      }
      return null;
   }

   public static final Object[] pattern_Validator_3_3_AtMostOneStartNode_blackBFB(StartNode startNode, Activity activity)
   {
      for (ActivityNode tmpSecondStartNode : activity.getOwnedActivityNode())
      {
         if (tmpSecondStartNode instanceof StartNode)
         {
            StartNode secondStartNode = (StartNode) tmpSecondStartNode;
            if (!secondStartNode.equals(startNode))
            {
               return new Object[] { startNode, secondStartNode, activity };
            }
         }
      }
      return null;
   }

   public static final Object[] pattern_Validator_3_4_ReportSuperfluousStartNodes_blackB(ValidationReport report)
   {
      return new Object[] { report };
   }

   public static final Object[] pattern_Validator_3_4_ReportSuperfluousStartNodes_greenFBB(ValidationReport report, Validator _this)
   {
      ErrorMessage superfluousStartNode = ResultFactory.eINSTANCE.createErrorMessage();
      Severity superfluousStartNode_severity_prime = Severity.FATAL;
      String _localVariable_0 = _this.lookupErrorMessage(Errors.EXACTLY_ONE_START_NODE);
      report.getErrorMessages().add(superfluousStartNode);
      superfluousStartNode.setSeverity(superfluousStartNode_severity_prime);
      String superfluousStartNode_id_prime = _localVariable_0;
      superfluousStartNode.setId(superfluousStartNode_id_prime);
      return new Object[] { superfluousStartNode, report, _this };
   }

   public static final Iterable<Object[]> pattern_Validator_3_5_AddSuperfluousStartNodeLocations_blackBBF(ErrorMessage superfluousStartNode, Activity activity)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (ActivityNode tmpErroneousStartNode : activity.getOwnedActivityNode())
      {
         if (tmpErroneousStartNode instanceof StartNode)
         {
            StartNode erroneousStartNode = (StartNode) tmpErroneousStartNode;
            _result.add(new Object[] { superfluousStartNode, activity, erroneousStartNode });
         }
      }
      return _result;
   }

   public static final Object[] pattern_Validator_3_5_AddSuperfluousStartNodeLocations_greenBB(ErrorMessage superfluousStartNode, StartNode erroneousStartNode)
   {
      superfluousStartNode.getLocation().add(erroneousStartNode);
      return new Object[] { superfluousStartNode, erroneousStartNode };
   }

   public static final StartNode pattern_Validator_3_6_expressionF()
   {
      StartNode _result = null;
      return _result;
   }

   public static final Object[] pattern_Validator_3_7_AtLeastOneStopNode_blackBF(Activity activity)
   {
      for (ActivityNode tmpFirstStopNode : activity.getOwnedActivityNode())
      {
         if (tmpFirstStopNode instanceof StopNode)
         {
            StopNode firstStopNode = (StopNode) tmpFirstStopNode;
            return new Object[] { activity, firstStopNode };
         }
      }
      return null;
   }

   public static final Object[] pattern_Validator_3_8_ReportMissingStopNode_blackBB(ValidationReport report, Activity activity)
   {
      return new Object[] { report, activity };
   }

   public static final Object[] pattern_Validator_3_8_ReportMissingStopNode_greenFBBB(ValidationReport report, Activity activity, Validator _this)
   {
      ErrorMessage missingStopNode = ResultFactory.eINSTANCE.createErrorMessage();
      Severity missingStopNode_severity_prime = Severity.ERROR;
      String _localVariable_0 = _this.lookupErrorMessage(Errors.AT_LEAST_ONE_STOP_NODE);
      missingStopNode.getLocation().add(activity);
      report.getErrorMessages().add(missingStopNode);
      missingStopNode.setSeverity(missingStopNode_severity_prime);
      String missingStopNode_id_prime = _localVariable_0;
      missingStopNode.setId(missingStopNode_id_prime);
      return new Object[] { missingStopNode, report, activity, _this };
   }

   public static final Iterable<Object[]> pattern_Validator_3_9_ForAllStopNodes_blackFB(Activity activity)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (ActivityNode tmpStopNode : activity.getOwnedActivityNode())
      {
         if (tmpStopNode instanceof StopNode)
         {
            StopNode stopNode = (StopNode) tmpStopNode;
            _result.add(new Object[] { stopNode, activity });
         }
      }
      return _result;
   }

   public static final Iterable<Object[]> pattern_Validator_3_10_NoOutgoingEdgesFromStopNodes_blackBFB(ValidationReport report, StopNode stopNode)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (ActivityEdge stopOutgoingEdge : stopNode.getOutgoing())
      {
         _result.add(new Object[] { report, stopOutgoingEdge, stopNode });
      }
      return _result;
   }

   public static final Object[] pattern_Validator_3_10_NoOutgoingEdgesFromStopNodes_greenBBFB(ValidationReport report, ActivityEdge stopOutgoingEdge,
         Validator _this)
   {
      ErrorMessage stopOutgoingEdgeError = ResultFactory.eINSTANCE.createErrorMessage();
      String _localVariable_0 = _this.lookupErrorMessage(Errors.NO_OUTGOING_EDGE_FROM_STOP_NODE);
      Severity stopOutgoingEdgeError_severity_prime = Severity.ERROR;
      report.getErrorMessages().add(stopOutgoingEdgeError);
      stopOutgoingEdgeError.getLocation().add(stopOutgoingEdge);
      String stopOutgoingEdgeError_id_prime = _localVariable_0;
      stopOutgoingEdgeError.setSeverity(stopOutgoingEdgeError_severity_prime);
      stopOutgoingEdgeError.setId(stopOutgoingEdgeError_id_prime);
      return new Object[] { report, stopOutgoingEdge, stopOutgoingEdgeError, _this };
   }

   public static final Iterable<Object[]> pattern_Validator_3_11_ForEachActivityEdge_blackBF(Activity activity)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (ActivityEdge edge : activity.getOwnedActivityEdge())
      {
         _result.add(new Object[] { activity, edge });
      }
      return _result;
   }

   public static final Object[] pattern_Validator_3_12_ActivityEdgeEndNodesInTheSameActivity_blackFBFB(ActivityEdge edge, Activity activity)
   {
      ActivityNode target = edge.getTarget();
      if (target != null)
      {
         if (activity.equals(target.getOwningActivity()))
         {
            ActivityNode source = edge.getSource();
            if (source != null)
            {
               if (!source.equals(target))
               {
                  if (activity.equals(source.getOwningActivity()))
                  {
                     return new Object[] { source, edge, target, activity };
                  }
               }
            }

         }
      }

      return null;
   }

   public static final Object[] pattern_Validator_3_13_ReportActivityEdgeEndNodesInDifferentAcitivities_blackBB(ActivityEdge edge, ValidationReport report)
   {
      return new Object[] { edge, report };
   }

   public static final Object[] pattern_Validator_3_13_ReportActivityEdgeEndNodesInDifferentAcitivities_greenFBBB(ActivityEdge edge, ValidationReport report,
         Validator _this)
   {
      ErrorMessage activityEdgeEndNodeInSameActivity = ResultFactory.eINSTANCE.createErrorMessage();
      String _localVariable_0 = _this.lookupErrorMessage(Errors.ACTIVITY_EDGE_END_NODES_IN_SAME_ACTIVITY);
      Severity activityEdgeEndNodeInSameActivity_severity_prime = Severity.FATAL;
      activityEdgeEndNodeInSameActivity.getLocation().add(edge);
      report.getErrorMessages().add(activityEdgeEndNodeInSameActivity);
      String activityEdgeEndNodeInSameActivity_id_prime = _localVariable_0;
      activityEdgeEndNodeInSameActivity.setSeverity(activityEdgeEndNodeInSameActivity_severity_prime);
      activityEdgeEndNodeInSameActivity.setId(activityEdgeEndNodeInSameActivity_id_prime);
      return new Object[] { activityEdgeEndNodeInSameActivity, edge, report, _this };
   }

   public static final StartNode pattern_Validator_3_14_expressionFB(StartNode startNode)
   {
      StartNode _result = startNode;
      return _result;
   }

   public static final Object[] pattern_Validator_3_15_ReportMissingStartNode_blackBB(ValidationReport report, Activity activity)
   {
      return new Object[] { report, activity };
   }

   public static final Object[] pattern_Validator_3_15_ReportMissingStartNode_greenBFBB(ValidationReport report, Activity activity, Validator _this)
   {
      ErrorMessage missingStartNode = ResultFactory.eINSTANCE.createErrorMessage();
      Severity missingStartNode_severity_prime = Severity.FATAL;
      String _localVariable_0 = _this.lookupErrorMessage(Errors.EXACTLY_ONE_START_NODE);
      report.getErrorMessages().add(missingStartNode);
      missingStartNode.getLocation().add(activity);
      missingStartNode.setSeverity(missingStartNode_severity_prime);
      String missingStartNode_id_prime = _localVariable_0;
      missingStartNode.setId(missingStartNode_id_prime);
      return new Object[] { report, missingStartNode, activity, _this };
   }

   public static final StartNode pattern_Validator_3_16_expressionF()
   {
      StartNode _result = null;
      return _result;
   }

   public static final Object[] pattern_Validator_4_1_CreateInefficientBuilder_blackB(Validator _this)
   {
      return new Object[] { _this };
   }

   public static final Object[] pattern_Validator_4_1_CreateInefficientBuilder_greenBFFF(Validator _this)
   {
      InefficientBootstrappingBuilder inefficientBuilder = ControlflowFactory.eINSTANCE.createInefficientBootstrappingBuilder();
      SDMActivityGraphBuilder builder = ControlflowFactory.eINSTANCE.createSDMActivityGraphBuilder();
      DFSGraph graph = DfsFactory.eINSTANCE.createDFSGraph();
      _this.getBuilders().add(inefficientBuilder);
      inefficientBuilder.setDelegate(builder);
      _this.getBuilders().add(builder);
      _this.setGraph(graph);
      inefficientBuilder.setGraph(graph);
      builder.setGraph(graph);
      return new Object[] { _this, inefficientBuilder, builder, graph };
   }

   public static final Object[] pattern_Validator_4_2_InvokeValidation_bindingFBBB(Validator _this, Activity activity,
         InefficientBootstrappingBuilder inefficientBuilder)
   {
      ValidationReport _localVariable_0 = _this.validate(activity, inefficientBuilder);
      ValidationReport report = _localVariable_0;
      if (report != null)
      {
         return new Object[] { report, _this, activity, inefficientBuilder };
      }
      return null;
   }

   public static final Object[] pattern_Validator_4_2_InvokeValidation_blackB(ValidationReport report)
   {
      return new Object[] { report };
   }

   public static final Object[] pattern_Validator_4_2_InvokeValidation_bindingAndBlackFBBB(Validator _this, Activity activity,
         InefficientBootstrappingBuilder inefficientBuilder)
   {
      Object[] result_pattern_Validator_4_2_InvokeValidation_binding = pattern_Validator_4_2_InvokeValidation_bindingFBBB(_this, activity, inefficientBuilder);
      if (result_pattern_Validator_4_2_InvokeValidation_binding != null)
      {
         ValidationReport report = (ValidationReport) result_pattern_Validator_4_2_InvokeValidation_binding[0];

         Object[] result_pattern_Validator_4_2_InvokeValidation_black = pattern_Validator_4_2_InvokeValidation_blackB(report);
         if (result_pattern_Validator_4_2_InvokeValidation_black != null)
         {

            return new Object[] { report, _this, activity, inefficientBuilder };
         }
      }
      return null;
   }

   public static final ValidationReport pattern_Validator_4_3_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final Object[] pattern_Validator_5_1_CreateValidationReport_blackB(Validator _this)
   {
      return new Object[] { _this };
   }

   public static final Object[] pattern_Validator_5_1_CreateValidationReport_greenFB(Validator _this)
   {
      ValidationReport report = ResultFactory.eINSTANCE.createValidationReport();
      _this.setValidationReport(report);
      return new Object[] { report, _this };
   }

   public static final Object[] pattern_Validator_5_2_BasicSyntacticCheck_bindingFBB(Validator _this, Activity activity)
   {
      StartNode _localVariable_0 = _this.syntacticCheckWithStartNodeLookup(activity);
      StartNode startNode = _localVariable_0;
      if (startNode != null)
      {
         return new Object[] { startNode, _this, activity };
      }
      return null;
   }

   public static final Object[] pattern_Validator_5_2_BasicSyntacticCheck_blackBB(StartNode startNode, Validator _this)
   {
      return new Object[] { startNode, _this };
   }

   public static final Object[] pattern_Validator_5_2_BasicSyntacticCheck_bindingAndBlackFBB(Validator _this, Activity activity)
   {
      Object[] result_pattern_Validator_5_2_BasicSyntacticCheck_binding = pattern_Validator_5_2_BasicSyntacticCheck_bindingFBB(_this, activity);
      if (result_pattern_Validator_5_2_BasicSyntacticCheck_binding != null)
      {
         StartNode startNode = (StartNode) result_pattern_Validator_5_2_BasicSyntacticCheck_binding[0];

         Object[] result_pattern_Validator_5_2_BasicSyntacticCheck_black = pattern_Validator_5_2_BasicSyntacticCheck_blackBB(startNode, _this);
         if (result_pattern_Validator_5_2_BasicSyntacticCheck_black != null)
         {

            return new Object[] { startNode, _this, activity };
         }
      }
      return null;
   }

   public static final Object[] pattern_Validator_5_3_CheckFatalErrorsAfterBasicSyntacticCheck_blackFB(ValidationReport report)
   {
      for (ErrorMessage fatalError1 : report.getErrorMessages())
      {
         Severity fatalError1_severity = fatalError1.getSeverity();
         if (fatalError1_severity.equals(Severity.FATAL))
         {
            return new Object[] { fatalError1, report };
         }

      }
      return null;
   }

   public static final ValidationReport pattern_Validator_5_4_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final Object[] pattern_Validator_5_5_Initialization_blackBB(SDMActivityGraphBuilder builder, Validator _this)
   {
      return new Object[] { builder, _this };
   }

   public static final Object[] pattern_Validator_5_5_Initialization_greenBFBF(SDMActivityGraphBuilder builder, Validator _this)
   {
      DefaultComponentProcessor visitor = ControlflowFactory.eINSTANCE.createDefaultComponentProcessor();
      DepthFirstSearch defaultEdgeProcessor = DfsFactory.eINSTANCE.createDepthFirstSearch();
      visitor.setValidator(_this);
      visitor.setBuilder(builder);
      visitor.setDelegate(defaultEdgeProcessor);
      defaultEdgeProcessor.setDelegate(visitor);
      return new Object[] { builder, visitor, _this, defaultEdgeProcessor };
   }

   public static final Object[] pattern_Validator_5_6_DetermineStartNodeForDFS_bindingFBB(SDMActivityGraphBuilder builder, StartNode startNode)
   {
      Node _localVariable_0 = builder.exploreStartNode(startNode);
      Node intStartNode = _localVariable_0;
      if (intStartNode != null)
      {
         return new Object[] { intStartNode, builder, startNode };
      }
      return null;
   }

   public static final Object[] pattern_Validator_5_6_DetermineStartNodeForDFS_blackB(Node intStartNode)
   {
      return new Object[] { intStartNode };
   }

   public static final Object[] pattern_Validator_5_6_DetermineStartNodeForDFS_bindingAndBlackFBB(SDMActivityGraphBuilder builder, StartNode startNode)
   {
      Object[] result_pattern_Validator_5_6_DetermineStartNodeForDFS_binding = pattern_Validator_5_6_DetermineStartNodeForDFS_bindingFBB(builder, startNode);
      if (result_pattern_Validator_5_6_DetermineStartNodeForDFS_binding != null)
      {
         Node intStartNode = (Node) result_pattern_Validator_5_6_DetermineStartNodeForDFS_binding[0];

         Object[] result_pattern_Validator_5_6_DetermineStartNodeForDFS_black = pattern_Validator_5_6_DetermineStartNodeForDFS_blackB(intStartNode);
         if (result_pattern_Validator_5_6_DetermineStartNodeForDFS_black != null)
         {

            return new Object[] { intStartNode, builder, startNode };
         }
      }
      return null;
   }

   public static final EObject pattern_Validator_5_7_PerformDFS_expressionFBB(DefaultComponentProcessor visitor, Node intStartNode)
   {
      EObject _localVariable_0 = visitor.processNode(intStartNode);
      EObject _result = _localVariable_0;
      return _result;
   }

   public static final Object[] pattern_Validator_5_8_InsertForEachComponentProcessor_blackBBB(DefaultComponentProcessor visitor, Validator _this,
         DepthFirstSearch defaultEdgeProcessor)
   {
      if (defaultEdgeProcessor.equals(visitor.getDelegate()))
      {
         return new Object[] { visitor, _this, defaultEdgeProcessor };
      }
      return null;
   }

   public static final Object[] pattern_Validator_5_8_InsertForEachComponentProcessor_redBB(DefaultComponentProcessor visitor,
         DepthFirstSearch defaultEdgeProcessor)
   {
      visitor.setDelegate(null);
      return new Object[] { visitor, defaultEdgeProcessor };
   }

   public static final Object[] pattern_Validator_5_8_InsertForEachComponentProcessor_greenBBBF(DefaultComponentProcessor visitor, Validator _this,
         DepthFirstSearch defaultEdgeProcessor)
   {
      ForEachComponentProcessor forEachComponentProcessor = ControlflowFactory.eINSTANCE.createForEachComponentProcessor();
      visitor.setDelegate(forEachComponentProcessor);
      forEachComponentProcessor.setDelegate(defaultEdgeProcessor);
      forEachComponentProcessor.setValidator(_this);
      return new Object[] { visitor, _this, defaultEdgeProcessor, forEachComponentProcessor };
   }

   public static final Object[] pattern_Validator_5_9_HasMoreForEachComponents_blackFFBFFF(SDMActivityGraphBuilder builder)
   {
      DFSGraph graph = builder.getGraph();
      if (graph != null)
      {
         for (Node forEachNode : graph.getNodes())
         {
            for (Edge edge : forEachNode.getOutgoing())
            {
               Node componentStartNode = edge.getTarget();
               if (componentStartNode != null)
               {
                  if (!componentStartNode.equals(forEachNode))
                  {
                     EObject tmpActEdge = edge.getOrigin();
                     if (tmpActEdge instanceof ActivityEdge)
                     {
                        ActivityEdge actEdge = (ActivityEdge) tmpActEdge;
                        int componentStartNode_preTraversal = componentStartNode.getPreTraversal();
                        if (Integer.valueOf(componentStartNode_preTraversal).equals(Integer.valueOf(0)))
                        {
                           EdgeGuard actEdge_guard = actEdge.getGuard();
                           if (actEdge_guard.equals(EdgeGuard.EACH_TIME))
                           {
                              return new Object[] { forEachNode, edge, builder, componentStartNode, graph, actEdge };
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

   public static final Object[] pattern_Validator_5_10_LookupForEachComponentProcessorParameters_blackFFB(ForEachComponentProcessor forEachComponentProcessor)
   {
      Node prevComponentStartNode = forEachComponentProcessor.getComponentStartingNode();
      if (prevComponentStartNode != null)
      {
         Node prevForEachNode = forEachComponentProcessor.getForEachNode();
         if (prevForEachNode != null)
         {
            if (!prevComponentStartNode.equals(prevForEachNode))
            {
               return new Object[] { prevForEachNode, prevComponentStartNode, forEachComponentProcessor };
            }
         }

      }

      return null;
   }

   public static final Object[] pattern_Validator_5_11_DeleteForEachComponentProcessorParameters_blackBBB(Node prevForEachNode,
         ForEachComponentProcessor forEachComponentProcessor, Node prevComponentStartNode)
   {
      if (!prevComponentStartNode.equals(prevForEachNode))
      {
         if (prevComponentStartNode.equals(forEachComponentProcessor.getComponentStartingNode()))
         {
            if (prevForEachNode.equals(forEachComponentProcessor.getForEachNode()))
            {
               return new Object[] { prevForEachNode, forEachComponentProcessor, prevComponentStartNode };
            }
         }
      }
      return null;
   }

   public static final Object[] pattern_Validator_5_11_DeleteForEachComponentProcessorParameters_redBBB(Node prevForEachNode,
         ForEachComponentProcessor forEachComponentProcessor, Node prevComponentStartNode)
   {
      forEachComponentProcessor.setComponentStartingNode(null);
      forEachComponentProcessor.setForEachNode(null);
      return new Object[] { prevForEachNode, forEachComponentProcessor, prevComponentStartNode };
   }

   public static final Object[] pattern_Validator_5_12_CreateForEachComponentProcessorParameters_blackBBB(Node componentStartNode,
         ForEachComponentProcessor forEachComponentProcessor, Node forEachNode)
   {
      if (!componentStartNode.equals(forEachNode))
      {
         return new Object[] { componentStartNode, forEachComponentProcessor, forEachNode };
      }
      return null;
   }

   public static final Object[] pattern_Validator_5_12_CreateForEachComponentProcessorParameters_greenBBB(Node componentStartNode,
         ForEachComponentProcessor forEachComponentProcessor, Node forEachNode)
   {
      forEachComponentProcessor.setForEachNode(forEachNode);
      forEachComponentProcessor.setComponentStartingNode(componentStartNode);
      return new Object[] { componentStartNode, forEachComponentProcessor, forEachNode };
   }

   public static final EObject pattern_Validator_5_13_ProcessForEachComponent_expressionFBB(DefaultComponentProcessor visitor, Node componentStartNode)
   {
      EObject _localVariable_0 = visitor.processNode(componentStartNode);
      EObject _result = _localVariable_0;
      return _result;
   }

   public static final Object[] pattern_Validator_5_14_BackwardEdgeFromComponentStartNodeToForEachNodeExists_blackFBB(Node forEachNode, Node componentStartNode)
   {
      if (!componentStartNode.equals(forEachNode))
      {
         for (Edge backEdge1 : componentStartNode.getOutgoing())
         {
            if (forEachNode.getIncoming().contains(backEdge1))
            {
               EdgeType backEdge1_type = backEdge1.getType();
               if (backEdge1_type.equals(EdgeType.CROSS_EDGE))
               {
                  return new Object[] { backEdge1, forEachNode, componentStartNode };
               }

            }
         }
      }
      return null;
   }

   public static final Object[] pattern_Validator_5_15_AtLeastOneBackwardEdgeFromComponentToForEachNodeExists_blackFBFB(Node forEachNode,
         Node componentStartNode)
   {
      if (!componentStartNode.equals(forEachNode))
      {
         int componentStartNode_preTraversal = componentStartNode.getPreTraversal();
         int componentStartNode_postTraversal = componentStartNode.getPostTraversal();
         for (Edge backEdge2 : forEachNode.getIncoming())
         {
            Node nodeInForEachComponent = backEdge2.getSource();
            if (nodeInForEachComponent != null)
            {
               if (!forEachNode.equals(nodeInForEachComponent))
               {
                  if (!componentStartNode.equals(nodeInForEachComponent))
                  {
                     EdgeType backEdge2_type = backEdge2.getType();
                     if (backEdge2_type.equals(EdgeType.CROSS_EDGE))
                     {
                        int nodeInForEachComponent_preTraversal = nodeInForEachComponent.getPreTraversal();
                        if (Integer.valueOf(nodeInForEachComponent_preTraversal).compareTo(Integer.valueOf(componentStartNode_preTraversal)) >= 0)
                        {
                           int nodeInForEachComponent_postTraversal = nodeInForEachComponent.getPostTraversal();
                           if (Integer.valueOf(nodeInForEachComponent_postTraversal).compareTo(Integer.valueOf(componentStartNode_postTraversal)) <= 0)
                           {
                              return new Object[] { nodeInForEachComponent, forEachNode, backEdge2, componentStartNode };
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

   public static final Object[] pattern_Validator_5_16_ReportNoEdgeBack_blackBFB(ValidationReport report, Node forEachNode)
   {
      EObject tmpForEachActivity = forEachNode.getOrigin();
      if (tmpForEachActivity instanceof ActivityNode)
      {
         ActivityNode forEachActivity = (ActivityNode) tmpForEachActivity;
         return new Object[] { report, forEachActivity, forEachNode };
      }

      return null;
   }

   public static final Object[] pattern_Validator_5_16_ReportNoEdgeBack_greenFBBB(ValidationReport report, ActivityNode forEachActivity, Validator _this)
   {
      ErrorMessage backwardEdgeMissingFromForEachComponent = ResultFactory.eINSTANCE.createErrorMessage();
      Severity backwardEdgeMissingFromForEachComponent_severity_prime = Severity.ERROR;
      String _localVariable_0 = _this.lookupErrorMessage(Errors.ONE_EDGE_BACK_FROM_FOREACH_COMPONENT);
      backwardEdgeMissingFromForEachComponent.getLocation().add(forEachActivity);
      report.getErrorMessages().add(backwardEdgeMissingFromForEachComponent);
      backwardEdgeMissingFromForEachComponent.setSeverity(backwardEdgeMissingFromForEachComponent_severity_prime);
      String backwardEdgeMissingFromForEachComponent_id_prime = _localVariable_0;
      backwardEdgeMissingFromForEachComponent.setId(backwardEdgeMissingFromForEachComponent_id_prime);
      return new Object[] { backwardEdgeMissingFromForEachComponent, report, forEachActivity, _this };
   }

   public static final Iterable<Object[]> pattern_Validator_5_17_StumpBackwardEdgesToForEachNode1_blackFBB(Node componentStartNode, Node forEachNode)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      if (!componentStartNode.equals(forEachNode))
      {
         for (Edge backwardEdge1 : componentStartNode.getOutgoing())
         {
            if (forEachNode.getIncoming().contains(backwardEdge1))
            {
               EdgeType backwardEdge1_type = backwardEdge1.getType();
               if (backwardEdge1_type.equals(EdgeType.CROSS_EDGE))
               {
                  _result.add(new Object[] { backwardEdge1, componentStartNode, forEachNode });
               }

            }
         }
      }
      return _result;
   }

   public static final Object[] pattern_Validator_5_17_StumpBackwardEdgesToForEachNode1_redBB(Edge backwardEdge1, Node forEachNode)
   {
      forEachNode.getIncoming().remove(backwardEdge1);
      return new Object[] { backwardEdge1, forEachNode };
   }

   public static final Object[] pattern_Validator_5_17_StumpBackwardEdgesToForEachNode1_greenB(Edge backwardEdge1)
   {
      EdgeType backwardEdge1_type_prime = EdgeType.TREE_EDGE;
      backwardEdge1.setType(backwardEdge1_type_prime);
      return new Object[] { backwardEdge1 };
   }

   public static final Iterable<Object[]> pattern_Validator_5_18_StumpBackwardEdgesToForEachNode2_blackBFFB(Node forEachNode, Node componentStartNode)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      if (!componentStartNode.equals(forEachNode))
      {
         int componentStartNode_preTraversal = componentStartNode.getPreTraversal();
         int componentStartNode_postTraversal = componentStartNode.getPostTraversal();
         for (Edge backwardEdge2 : forEachNode.getIncoming())
         {
            Node sourceNodeInForEachComponent = backwardEdge2.getSource();
            if (sourceNodeInForEachComponent != null)
            {
               if (!forEachNode.equals(sourceNodeInForEachComponent))
               {
                  if (!componentStartNode.equals(sourceNodeInForEachComponent))
                  {
                     EdgeType backwardEdge2_type = backwardEdge2.getType();
                     if (backwardEdge2_type.equals(EdgeType.CROSS_EDGE))
                     {
                        int sourceNodeInForEachComponent_preTraversal = sourceNodeInForEachComponent.getPreTraversal();
                        if (Integer.valueOf(sourceNodeInForEachComponent_preTraversal).compareTo(Integer.valueOf(componentStartNode_preTraversal)) >= 0)
                        {
                           int sourceNodeInForEachComponent_postTraversal = sourceNodeInForEachComponent.getPostTraversal();
                           if (Integer.valueOf(sourceNodeInForEachComponent_postTraversal).compareTo(Integer.valueOf(componentStartNode_postTraversal)) <= 0)
                           {
                              _result.add(new Object[] { forEachNode, sourceNodeInForEachComponent, backwardEdge2, componentStartNode });
                           }

                        }

                     }

                  }
               }
            }

         }

      }
      return _result;
   }

   public static final Object[] pattern_Validator_5_18_StumpBackwardEdgesToForEachNode2_redBB(Node forEachNode, Edge backwardEdge2)
   {
      forEachNode.getIncoming().remove(backwardEdge2);
      return new Object[] { forEachNode, backwardEdge2 };
   }

   public static final Object[] pattern_Validator_5_18_StumpBackwardEdgesToForEachNode2_greenB(Edge backwardEdge2)
   {
      EdgeType backwardEdge2_type_prime = EdgeType.TREE_EDGE;
      backwardEdge2.setType(backwardEdge2_type_prime);
      return new Object[] { backwardEdge2 };
   }

   public static final EObject pattern_Validator_5_19_CategorizeEachTimeEdge_expressionFBB(DepthFirstSearch defaultEdgeProcessor, Edge edge)
   {
      EObject _localVariable_0 = defaultEdgeProcessor.processEdge(edge);
      EObject _result = _localVariable_0;
      return _result;
   }

   public static final Object[] pattern_Validator_5_20_CheckEachTimeEdgeCategorization_blackB(Edge edge)
   {
      EdgeType edge_type = edge.getType();
      if (edge_type.equals(EdgeType.FORWARD_EDGE))
      {
         return new Object[] { edge };
      }

      return null;
   }

   public static final Object[] pattern_Validator_5_21_ReportNotForwardEdge_blackFBB(Edge edge, ValidationReport report)
   {
      EObject tmpActivityEdge = edge.getOrigin();
      if (tmpActivityEdge instanceof ActivityEdge)
      {
         ActivityEdge activityEdge = (ActivityEdge) tmpActivityEdge;
         return new Object[] { activityEdge, edge, report };
      }

      return null;
   }

   public static final Object[] pattern_Validator_5_21_ReportNotForwardEdge_greenFBBB(ActivityEdge activityEdge, ValidationReport report, Validator _this)
   {
      ErrorMessage forEachEdgeNotForward = ResultFactory.eINSTANCE.createErrorMessage();
      Severity forEachEdgeNotForward_severity_prime = Severity.FATAL;
      String _localVariable_0 = _this.lookupErrorMessage(Errors.FOR_EACH_EDGE_FORWARD);
      forEachEdgeNotForward.getLocation().add(activityEdge);
      report.getErrorMessages().add(forEachEdgeNotForward);
      forEachEdgeNotForward.setSeverity(forEachEdgeNotForward_severity_prime);
      String forEachEdgeNotForward_id_prime = _localVariable_0;
      forEachEdgeNotForward.setId(forEachEdgeNotForward_id_prime);
      return new Object[] { forEachEdgeNotForward, activityEdge, report, _this };
   }

   public static final Object[] pattern_Validator_5_23_LookupGraph_blackFB(Node intStartNode)
   {
      DFSGraph g = intStartNode.getGraph();
      if (g != null)
      {
         return new Object[] { g, intStartNode };
      }

      return null;
   }

   public static final Iterable<Object[]> pattern_Validator_5_24_AllNodes_blackBF(DFSGraph g)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (Node dfsNode : g.getNodes())
      {
         _result.add(new Object[] { g, dfsNode });
      }
      return _result;
   }

   public static final Object[] pattern_Validator_5_25_RefersToStopNode_blackBF(Node dfsNode)
   {
      EObject tmpStopNode = dfsNode.getOrigin();
      if (tmpStopNode instanceof StopNode)
      {
         StopNode stopNode = (StopNode) tmpStopNode;
         return new Object[] { dfsNode, stopNode };
      }

      return null;
   }

   public static final Object[] pattern_Validator_5_26_HasEachNodeOutgoingEdges_blackFB(Node dfsNode)
   {
      for (Edge testOutgoingEdge : dfsNode.getOutgoing())
      {
         return new Object[] { testOutgoingEdge, dfsNode };
      }
      return null;
   }

   public static final Object[] pattern_Validator_5_27_ErrorHandling_blackBFB(Node dfsNode, ValidationReport report)
   {
      EObject tmpActNode = dfsNode.getOrigin();
      if (tmpActNode instanceof ActivityNode)
      {
         ActivityNode actNode = (ActivityNode) tmpActNode;
         return new Object[] { dfsNode, actNode, report };
      }

      return null;
   }

   public static final Object[] pattern_Validator_5_27_ErrorHandling_greenFBBB(ActivityNode actNode, ValidationReport report, Validator _this)
   {
      ErrorMessage noOutgoingEdge = ResultFactory.eINSTANCE.createErrorMessage();
      Severity noOutgoingEdge_severity_prime = Severity.FATAL;
      String _localVariable_0 = _this.lookupErrorMessage(Errors.NODE_HAS_TO_HAVE_OUTGOING_EDGE);
      noOutgoingEdge.getLocation().add(actNode);
      report.getErrorMessages().add(noOutgoingEdge);
      noOutgoingEdge.setSeverity(noOutgoingEdge_severity_prime);
      String noOutgoingEdge_id_prime = _localVariable_0;
      noOutgoingEdge.setId(noOutgoingEdge_id_prime);
      return new Object[] { noOutgoingEdge, actNode, report, _this };
   }

   public static final Object[] pattern_Validator_5_28_LookupRealStartNode_blackBFF(Node intStartNode)
   {
      for (Edge startToRealStartEdge : intStartNode.getOutgoing())
      {
         Node intRealStartNode = startToRealStartEdge.getTarget();
         if (intRealStartNode != null)
         {
            if (!intRealStartNode.equals(intStartNode))
            {
               EdgeType startToRealStartEdge_type = startToRealStartEdge.getType();
               if (startToRealStartEdge_type.equals(EdgeType.TREE_EDGE))
               {
                  return new Object[] { intStartNode, intRealStartNode, startToRealStartEdge };
               }

            }
         }

      }
      return null;
   }

   public static final Object[] pattern_Validator_5_29_InitializeControlFlowAnalysis_blackB(Validator _this)
   {
      return new Object[] { _this };
   }

   public static final Object[] pattern_Validator_5_29_InitializeControlFlowAnalysis_greenFFB(Validator _this)
   {
      Scope scope = DemoclesFactory.eINSTANCE.createScope();
      ControlFlowBuilder analyzer = ControlflowFactory.eINSTANCE.createControlFlowBuilder();
      analyzer.setValidator(_this);
      return new Object[] { scope, analyzer, _this };
   }

   public static final Object[] pattern_Validator_5_30_PerformControlFlowAnalysis_bindingFBBB(ControlFlowBuilder analyzer, Scope scope, Node intRealStartNode)
   {
      ValidationReport _localVariable_0 = analyzer.processNode(scope, intRealStartNode);
      ValidationReport controlFlowReport = _localVariable_0;
      if (controlFlowReport != null)
      {
         return new Object[] { controlFlowReport, analyzer, scope, intRealStartNode };
      }
      return null;
   }

   public static final Object[] pattern_Validator_5_30_PerformControlFlowAnalysis_blackB(ValidationReport controlFlowReport)
   {
      return new Object[] { controlFlowReport };
   }

   public static final Object[] pattern_Validator_5_30_PerformControlFlowAnalysis_bindingAndBlackFBBB(ControlFlowBuilder analyzer, Scope scope,
         Node intRealStartNode)
   {
      Object[] result_pattern_Validator_5_30_PerformControlFlowAnalysis_binding = pattern_Validator_5_30_PerformControlFlowAnalysis_bindingFBBB(analyzer, scope,
            intRealStartNode);
      if (result_pattern_Validator_5_30_PerformControlFlowAnalysis_binding != null)
      {
         ValidationReport controlFlowReport = (ValidationReport) result_pattern_Validator_5_30_PerformControlFlowAnalysis_binding[0];

         Object[] result_pattern_Validator_5_30_PerformControlFlowAnalysis_black = pattern_Validator_5_30_PerformControlFlowAnalysis_blackB(controlFlowReport);
         if (result_pattern_Validator_5_30_PerformControlFlowAnalysis_black != null)
         {

            return new Object[] { controlFlowReport, analyzer, scope, intRealStartNode };
         }
      }
      return null;
   }

   public static final Object[] pattern_Validator_5_31_AddScopeToValidationResult_blackBBF(ValidationReport controlFlowReport, Scope scope)
   {
      EObject tmpControlFlow = controlFlowReport.getResult();
      if (tmpControlFlow instanceof CFNode)
      {
         CFNode controlFlow = (CFNode) tmpControlFlow;
         return new Object[] { controlFlowReport, scope, controlFlow };
      }

      return null;
   }

   public static final Object[] pattern_Validator_5_31_AddScopeToValidationResult_redBB(ValidationReport controlFlowReport, CFNode controlFlow)
   {
      controlFlowReport.setResult(null);
      return new Object[] { controlFlowReport, controlFlow };
   }

   public static final Object[] pattern_Validator_5_31_AddScopeToValidationResult_greenBB(ValidationReport controlFlowReport, Scope scope)
   {
      controlFlowReport.setResult(scope);
      return new Object[] { controlFlowReport, scope };
   }

   public static final ValidationReport pattern_Validator_5_32_expressionFB(ValidationReport controlFlowReport)
   {
      ValidationReport _result = controlFlowReport;
      return _result;
   }

   public static final ValidationReport pattern_Validator_5_33_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final ValidationReport pattern_Validator_5_34_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //ValidatorImpl
