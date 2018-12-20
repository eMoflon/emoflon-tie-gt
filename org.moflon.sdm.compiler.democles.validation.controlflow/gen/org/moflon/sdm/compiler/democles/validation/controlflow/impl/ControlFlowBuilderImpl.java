/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow.impl;

import SDMLanguage.activities.ActivityEdge;
import SDMLanguage.activities.ActivityNode;
import SDMLanguage.activities.EdgeGuard;
import SDMLanguage.activities.StopNode;
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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.moflon.core.dfs.Edge;
import org.moflon.core.dfs.EdgeType;
import org.moflon.core.dfs.Node;

import org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder;
import org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowFactory;
import org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage;
import org.moflon.sdm.compiler.democles.validation.controlflow.CrossEdgeAnalyzer;
import org.moflon.sdm.compiler.democles.validation.controlflow.Errors;
import org.moflon.sdm.compiler.democles.validation.controlflow.JoinNodeFinder;
import org.moflon.sdm.compiler.democles.validation.controlflow.SubTreeTester;
import org.moflon.sdm.compiler.democles.validation.controlflow.TreeEdgeNavigator;
import org.moflon.sdm.compiler.democles.validation.controlflow.Validator;

import org.moflon.sdm.compiler.democles.validation.result.ErrorMessage;
import org.moflon.sdm.compiler.democles.validation.result.ResultFactory;
import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;

import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.CompoundNode;
import org.moflon.sdm.runtime.democles.ContinueStatement;
import org.moflon.sdm.runtime.democles.DemoclesFactory;
import org.moflon.sdm.runtime.democles.ForEach;
import org.moflon.sdm.runtime.democles.HeadControlledLoop;
import org.moflon.sdm.runtime.democles.IfStatement;
import org.moflon.sdm.runtime.democles.RepetitionNode;
import org.moflon.sdm.runtime.democles.ReturnStatement;
import org.moflon.sdm.runtime.democles.Scope;
import org.moflon.sdm.runtime.democles.TailControlledLoop;
// <-- [user defined imports]
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.moflon.sdm.compiler.democles.validation.result.Severity;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Flow Builder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlFlowBuilderImpl#getValidator <em>Validator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControlFlowBuilderImpl extends EObjectImpl implements ControlFlowBuilder
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
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ControlFlowBuilderImpl()
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
      return ControlflowPackage.Literals.CONTROL_FLOW_BUILDER;
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
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlflowPackage.CONTROL_FLOW_BUILDER__VALIDATOR, oldValidator, validator));
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
   public void setValidator(Validator newValidator)
   {
      Validator oldValidator = validator;
      validator = newValidator;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.CONTROL_FLOW_BUILDER__VALIDATOR, oldValidator, validator));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Edge findLargestBackwardEdgeInterval(Node node, Node root)
   {
      // [user code injected with eMoflon]

      final Validator validator = getValidator();
      final ValidationReport report = validator.getValidationReport();

      final ArrayList<Edge> incomingEdges = new ArrayList<Edge>(node.getIncoming());
      Collections.sort(incomingEdges, EDGE_COMPARATOR);
      final SubTreeTester tester = ControlflowFactory.eINSTANCE.createSubTreeTester();
      tester.setIncludeRoot(true);
      tester.setRoot(root);

      Edge edge = null;
      Edge prevEdge = null;
      for (int i = 0; i < incomingEdges.size(); i++)
      {
         final Edge edgeCandidate = incomingEdges.get(i);
         final Node edgeCandidateSource = edgeCandidate.getSource();
         if (edgeCandidate.getType() == EdgeType.BACKWARD_EDGE && tester.isInSubTree(edgeCandidateSource))
         {
            prevEdge = edge;
            edge = edgeCandidate;
            if (prevEdge != null && (edge.getSource().getPreTraversal() <= prevEdge.getSource().getPreTraversal()
                  || edge.getSource().getPostTraversal() >= prevEdge.getSource().getPostTraversal()))
            {
               final ErrorMessage reportEmbeddedStructure = ResultFactory.eINSTANCE.createErrorMessage();
               report.getErrorMessages().add(reportEmbeddedStructure);
               reportEmbeddedStructure.setSeverity(Severity.ERROR);
               reportEmbeddedStructure.setId(validator.lookupErrorMessage(Errors.EMBEDDED_LOOP_FOUND));
               reportEmbeddedStructure.getLocation().add(prevEdge.getOrigin());
               reportEmbeddedStructure.getLocation().add(edge.getOrigin());
            }
         }
      }
      if (edge == null)
      {
         final ErrorMessage internalError = ResultFactory.eINSTANCE.createErrorMessage();
         report.getErrorMessages().add(internalError);
         internalError.setSeverity(Severity.FATAL);
         internalError.setId(validator.lookupErrorMessage(Errors.LOOP_EXTERN_EDGE));
         internalError.getLocation().add(node.getOrigin());
      }
      return edge;

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ValidationReport handleForEachNode(Scope scope, Node node, StoryNode actForEachNode)
   {

      Object[] result1_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_1_1_LookupValidator_blackBFF(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      ValidationReport report = (ValidationReport) result1_black[1];
      Validator validator = (Validator) result1_black[2];

      Object[] result2_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_1_2_CreateForEachNode_blackBB(scope, actForEachNode);
      if (result2_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[scope] = " + scope + ", " + "[actForEachNode] = " + actForEachNode + ".");
      }
      Object[] result2_green = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_1_2_CreateForEachNode_greenBFFB(scope, actForEachNode);
      ForEach cfForEachNode = (ForEach) result2_green[1];
      Scope forEachScope = (Scope) result2_green[2];

      // 
      Object[] result3_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_1_3_LookupEndEdge_blackFFB(node);
      if (result3_black != null)
      {
         //nothing ActivityEdge actEndEdge = (ActivityEdge) result3_black[0];
         Edge endEdge = (Edge) result3_black[1];
         // 
         Object[] result4_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_1_4_LookupEndEdgeTarget_blackFB(endEdge);
         if (result4_black != null)
         {
            Node endTarget = (Node) result4_black[0];
            // 
            ControlFlowBuilderImpl.pattern_ControlFlowBuilder_1_5_TraverseEndBranchDescendants_expressionBBBB(this, scope, endTarget, cfForEachNode);
            // 
            if (ControlFlowBuilderImpl.pattern_ControlFlowBuilder_1_6_CheckBlockingErrors1_expressionFB(validator))
            {
               return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_1_7_expressionFB(report);
            } else
            {
            }

         } else
         {
            // 
            ControlFlowBuilderImpl.pattern_ControlFlowBuilder_1_8_HandleStumpedEdge_expressionFBBBB(this, scope, endEdge, cfForEachNode);

         }
         // 
         Object[] result9_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_1_9_CheckSecondOutgoingEdge_blackBFB(node, endEdge);
         if (result9_black != null)
         {
            Edge eachTimeEdge = (Edge) result9_black[1];
            // 
            Object[] result10_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_1_10_LookupEachTimeEdge_blackBFF(eachTimeEdge);
            if (result10_black != null)
            {
               Node eachTimeTarget = (Node) result10_black[1];
               //nothing ActivityEdge actEachTimeEdge = (ActivityEdge) result10_black[2];
               // ForEach 
               for (Object[] result11_black : ControlFlowBuilderImpl.pattern_ControlFlowBuilder_1_11_StumpForEachComponentClosingEdge_blackBFFB(node,
                     eachTimeTarget))
               {
                  //nothing Node closingEdgeSource = (Node) result11_black[1];
                  Edge componentClosingEdge = (Edge) result11_black[2];
                  ControlFlowBuilderImpl.pattern_ControlFlowBuilder_1_11_StumpForEachComponentClosingEdge_redBB(node, componentClosingEdge);

                  ControlFlowBuilderImpl.pattern_ControlFlowBuilder_1_11_StumpForEachComponentClosingEdge_greenB(componentClosingEdge);

               }
               // 
               ControlFlowBuilderImpl.pattern_ControlFlowBuilder_1_12_TraverseEachTimeDescendants_expressionBBB(this, forEachScope, eachTimeTarget);
               // 
               if (ControlFlowBuilderImpl.pattern_ControlFlowBuilder_1_13_CheckBlockingErrors2_expressionFB(validator))
               {
                  return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_1_14_expressionFB(report);
               } else
               {
               }

            } else
            {

               Object[] result15_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_1_15_ReportEachTimeEdgeError_blackBB(report, actForEachNode);
               if (result15_black == null)
               {
                  throw new RuntimeException(
                        "Pattern matching failed." + " Variables: " + "[report] = " + report + ", " + "[actForEachNode] = " + actForEachNode + ".");
               }
               ControlFlowBuilderImpl.pattern_ControlFlowBuilder_1_15_ReportEachTimeEdgeError_greenBFBB(report, actForEachNode, validator);
               //nothing ErrorMessage reportEachTimeEdgeError = (ErrorMessage) result15_green[1];

               return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_1_16_expressionFB(report);
            }

         } else
         {
         }

         Object[] result17_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_1_17_ReturnForEachNode_blackBB(report, cfForEachNode);
         if (result17_black == null)
         {
            throw new RuntimeException(
                  "Pattern matching failed." + " Variables: " + "[report] = " + report + ", " + "[cfForEachNode] = " + cfForEachNode + ".");
         }
         ControlFlowBuilderImpl.pattern_ControlFlowBuilder_1_17_ReturnForEachNode_greenBB(report, cfForEachNode);

         return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_1_18_expressionFB(report);
      } else
      {

         Object[] result19_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_1_19_ReportEndEdgeError_blackBB(actForEachNode, report);
         if (result19_black == null)
         {
            throw new RuntimeException(
                  "Pattern matching failed." + " Variables: " + "[actForEachNode] = " + actForEachNode + ", " + "[report] = " + report + ".");
         }
         ControlFlowBuilderImpl.pattern_ControlFlowBuilder_1_19_ReportEndEdgeError_greenBBFB(actForEachNode, report, validator);
         //nothing ErrorMessage reportEndEdgeError = (ErrorMessage) result19_green[2];

         return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_1_20_expressionFB(report);
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ValidationReport handleHeadControlledLoop(Scope scope, Node node, Edge headLoopEdge)
   {

      Object[] result1_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_1_InitializeValidationReporting_blackFBF(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      Validator validator = (Validator) result1_black[0];
      ValidationReport report = (ValidationReport) result1_black[2];

      Object[] result2_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_2_LookupHeadLoopEdgeTarget_blackBF(headLoopEdge);
      if (result2_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[headLoopEdge] = " + headLoopEdge + ".");
      }
      Node headLoopEdgeTarget = (Node) result2_black[1];

      Object[] result3_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_3_CreateHeadControlledLoop_blackFBB(scope, node);
      if (result3_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[scope] = " + scope + ", " + "[node] = " + node + ".");
      }
      ActivityNode actHeadNode = (ActivityNode) result3_black[0];
      Object[] result3_green = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_3_CreateHeadControlledLoop_greenBBFF(actHeadNode, scope);
      HeadControlledLoop headControlledLoop = (HeadControlledLoop) result3_green[2];
      Scope headControlledLoopScope = (Scope) result3_green[3];

      // 
      Object[] result4_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_4_StumpSelfLoop_blackBB(headLoopEdge, node);
      if (result4_black != null)
      {
         ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_4_StumpSelfLoop_redBB(headLoopEdge, node);

         ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_4_StumpSelfLoop_greenB(headLoopEdge);

      } else
      {
      }
      // ForEach 
      for (Object[] result5_black : ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_5_StumpBackwardEdgesFromLoop1_blackBBF(headLoopEdgeTarget, node))
      {
         Edge backwardEdge1 = (Edge) result5_black[2];
         ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_5_StumpBackwardEdgesFromLoop1_redBB(node, backwardEdge1);

         ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_5_StumpBackwardEdgesFromLoop1_greenB(backwardEdge1);

      }
      // ForEach 
      for (Object[] result6_black : ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_6_StumpBackwardEdgesFromLoop2_blackFFBB(node, headLoopEdgeTarget))
      {
         //nothing Node backwardEdgeSource = (Node) result6_black[0];
         Edge backwardEdge2 = (Edge) result6_black[1];
         ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_6_StumpBackwardEdgesFromLoop2_redBB(backwardEdge2, node);

         ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_6_StumpBackwardEdgesFromLoop2_greenB(backwardEdge2);

      }
      // ForEach 
      for (Object[] result7_black : ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_7_NoLoopExternalBackwardEdgesAllowed_blackFBF(node))
      {
         Edge erroneousBackwardEdge = (Edge) result7_black[0];
         ActivityEdge erroneousActivityEdge = (ActivityEdge) result7_black[2];

         Object[] result8_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_8_ReportAndDeleteExternBwdEdge_blackBBB(erroneousBackwardEdge, report,
               erroneousActivityEdge);
         if (result8_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[erroneousBackwardEdge] = " + erroneousBackwardEdge + ", " + "[report] = "
                  + report + ", " + "[erroneousActivityEdge] = " + erroneousActivityEdge + ".");
         }
         ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_8_ReportAndDeleteExternBwdEdge_redB(erroneousBackwardEdge);

         ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_8_ReportAndDeleteExternBwdEdge_greenFBBB(report, erroneousActivityEdge, validator);
         //nothing ErrorMessage errorExternBwdEdge = (ErrorMessage) result8_green[0];
         EcoreUtil.delete(erroneousBackwardEdge);
         erroneousBackwardEdge = null;
         ;

      }
      // 
      Object[] result9_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_9_LookupHeadExitEdge_blackFBB(node, headLoopEdge);
      if (result9_black != null)
      {
         Edge headExitEdge = (Edge) result9_black[0];
         // 
         Object[] result10_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_10_HasThirdOutgoingEdge_blackBFBB(node, headExitEdge, headLoopEdge);
         if (result10_black != null)
         {
            Edge thirdOutgoingEdge = (Edge) result10_black[1];

            Object[] result11_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_11_ReportThirdOutgoingEdgeError_blackFBBBFBF(headLoopEdge,
                  thirdOutgoingEdge, report, headExitEdge);
            if (result11_black == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[headLoopEdge] = " + headLoopEdge + ", " + "[thirdOutgoingEdge] = "
                     + thirdOutgoingEdge + ", " + "[report] = " + report + ", " + "[headExitEdge] = " + headExitEdge + ".");
            }
            ActivityEdge thirdActivityEdge = (ActivityEdge) result11_black[0];
            ActivityEdge headExitActivityEdge = (ActivityEdge) result11_black[4];
            ActivityEdge headLoopActivityEdge = (ActivityEdge) result11_black[6];
            ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_11_ReportThirdOutgoingEdgeError_greenBBBFBB(thirdActivityEdge, report, headExitActivityEdge,
                  headLoopActivityEdge, validator);
            //nothing ErrorMessage threeOutgoingEdges = (ErrorMessage) result11_green[3];

            return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_12_expressionFB(report);
         } else
         {
            // 
            Object[] result13_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_13_LookupHeadExitEdgeTarget_blackBF(headExitEdge);
            if (result13_black != null)
            {
               Node headExitEdgeTarget = (Node) result13_black[1];
               // 
               Object[] result14_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_14_IsLoopEdgeTraversedFirst_blackBB(headLoopEdgeTarget,
                     headExitEdgeTarget);
               if (result14_black != null)
               {

                  Object[] result15_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_15_InitializeCrossEdgeAnalysisForHead1_blackBBB(validator, node,
                        headExitEdgeTarget);
                  if (result15_black == null)
                  {
                     throw new RuntimeException("Pattern matching failed." + " Variables: " + "[validator] = " + validator + ", " + "[node] = " + node + ", "
                           + "[headExitEdgeTarget] = " + headExitEdgeTarget + ".");
                  }
                  Object[] result15_green = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_15_InitializeCrossEdgeAnalysisForHead1_greenBBFFBF(validator,
                        node, headExitEdgeTarget);
                  //nothing TreeEdgeNavigator treeEdgeNavigator1 = (TreeEdgeNavigator) result15_green[2];
                  CrossEdgeAnalyzer crossEdgeAnalyzer1 = (CrossEdgeAnalyzer) result15_green[3];
                  //nothing SubTreeTester lowerEdgeTester1 = (SubTreeTester) result15_green[5];

                  // 
                  ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_16_CrossEdgeAnalysisForHeadLoop1_expressionFBB(crossEdgeAnalyzer1, headLoopEdgeTarget);

               } else
               {

                  Object[] result17_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_17_InitializeCrossEdgeAnalysisForHead2_blackBBB(validator, node,
                        headExitEdgeTarget);
                  if (result17_black == null)
                  {
                     throw new RuntimeException("Pattern matching failed." + " Variables: " + "[validator] = " + validator + ", " + "[node] = " + node + ", "
                           + "[headExitEdgeTarget] = " + headExitEdgeTarget + ".");
                  }
                  Object[] result17_green = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_17_InitializeCrossEdgeAnalysisForHead2_greenBFFBB(validator,
                        node, headExitEdgeTarget);
                  //nothing SubTreeTester lowerEdgeTester2 = (SubTreeTester) result17_green[1];
                  CrossEdgeAnalyzer crossEdgeAnalyzer2 = (CrossEdgeAnalyzer) result17_green[2];

                  // 
                  ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_18_CrossEdgeAnalysisForHeadLoop2_expressionFBB(crossEdgeAnalyzer2, node);

                  Object[] result19_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_19_InitializeCrossEdgeAnalysisForHead3_blackBB(validator,
                        headLoopEdgeTarget);
                  if (result19_black == null)
                  {
                     throw new RuntimeException("Pattern matching failed." + " Variables: " + "[validator] = " + validator + ", " + "[headLoopEdgeTarget] = "
                           + headLoopEdgeTarget + ".");
                  }
                  Object[] result19_green = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_19_InitializeCrossEdgeAnalysisForHead3_greenBFBF(validator,
                        headLoopEdgeTarget);
                  CrossEdgeAnalyzer crossEdgeAnalyzer3 = (CrossEdgeAnalyzer) result19_green[1];
                  //nothing TreeEdgeNavigator treeEdgeNavigator3 = (TreeEdgeNavigator) result19_green[3];

                  // 
                  ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_20_CrossEdgeAnalysisForHead3_expressionFBB(crossEdgeAnalyzer3, headLoopEdgeTarget);

               }
               // 
               ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_21_TraverseHeadLoopExitDescendant_expressionBBBB(this, scope, headExitEdgeTarget,
                     headControlledLoop);
               // 
               if (ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_22_CheckBlockingErrorsAfterHeadLoopExit_expressionFB(validator))
               {
                  return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_23_expressionFB(report);
               } else
               {
               }

            } else
            {
               // 
               ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_24_HandleStumpedEdge_expressionFBBBB(this, scope, headExitEdge, headControlledLoop);

            }

         }

      } else
      {
         // 
         Object[] result25_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_25_HasSecondInvalidOutgoingEdge_blackFBB(headLoopEdge, node);
         if (result25_black != null)
         {
            //nothing Edge secondOutgoingEdge = (Edge) result25_black[0];

            Object[] result26_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_26_ReportInvalidOutEdges_blackBBF(report, node);
            if (result26_black == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[report] = " + report + ", " + "[node] = " + node + ".");
            }
            ActivityNode activityNodeWithTwoOutgoingEdge = (ActivityNode) result26_black[2];
            ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_26_ReportInvalidOutEdges_greenBFBB(report, activityNodeWithTwoOutgoingEdge, validator);
            //nothing ErrorMessage reportOutEdges = (ErrorMessage) result26_green[1];

            return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_27_expressionFB(report);
         } else
         {
         }

      }
      // 
      ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_28_TraverseHeadLoopEdgeDescendant_expressionBBB(this, headControlledLoopScope, headLoopEdgeTarget);
      // 
      if (ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_29_CheckBlockingErrorsAfterHeadLoopEdge_expressionFB(validator))
      {
         return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_30_expressionFB(report);
      } else
      {
         // 
         Object[] result31_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_31_LoopsBySuccess_blackBF(headLoopEdge);
         if (result31_black != null)
         {
            //nothing ActivityEdge actHeadLoopEdge = (ActivityEdge) result31_black[1];

            Object[] result32_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_32_SetLoopAlongTrue_blackB(headControlledLoop);
            if (result32_black == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[headControlledLoop] = " + headControlledLoop + ".");
            }
            ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_32_SetLoopAlongTrue_greenB(headControlledLoop);

         } else
         {

            Object[] result33_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_33_SetLoopAlongFalse_blackB(headControlledLoop);
            if (result33_black == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[headControlledLoop] = " + headControlledLoop + ".");
            }
            ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_33_SetLoopAlongFalse_greenB(headControlledLoop);

         }

         Object[] result34_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_34_ReturnHeadControlledLoop_blackBB(report, headControlledLoop);
         if (result34_black == null)
         {
            throw new RuntimeException(
                  "Pattern matching failed." + " Variables: " + "[report] = " + report + ", " + "[headControlledLoop] = " + headControlledLoop + ".");
         }
         ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_34_ReturnHeadControlledLoop_greenBB(report, headControlledLoop);

         return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_2_35_expressionFB(report);
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ValidationReport handleSimpleNode(Scope scope, Node node, Edge outgoingEdge)
   {

      Object[] result1_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_3_1_LookupValidator_blackBFF(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      Validator validator = (Validator) result1_black[1];
      ValidationReport report = (ValidationReport) result1_black[2];
      // 
      Object[] result2_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_3_2_CreateSimpleNode_blackFBB(scope, node);
      if (result2_black != null)
      {
         ActivityNode actSimpleNode = (ActivityNode) result2_black[0];
         Object[] result2_green = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_3_2_CreateSimpleNode_greenBFB(actSimpleNode, scope);
         CFNode simpleNode = (CFNode) result2_green[1];

         // 
         Object[] result3_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_3_3_LookupTargetNode_blackBF(outgoingEdge);
         if (result3_black != null)
         {
            Node targetNode = (Node) result3_black[1];
            // 
            ControlFlowBuilderImpl.pattern_ControlFlowBuilder_3_4_TraverseSimpleNodeDescendants_expressionBBBB(this, scope, targetNode, simpleNode);
            // 
            if (ControlFlowBuilderImpl.pattern_ControlFlowBuilder_3_5_CheckBlockingErrors_expressionFB(validator))
            {
               return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_3_6_expressionFB(report);
            } else
            {
            }

         } else
         {
            // 
            ControlFlowBuilderImpl.pattern_ControlFlowBuilder_3_7_HandleStumpedEdge_expressionFBBBB(this, scope, outgoingEdge, simpleNode);

         }

         Object[] result8_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_3_8_ReturnSimpleNode_blackBB(simpleNode, report);
         if (result8_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[simpleNode] = " + simpleNode + ", " + "[report] = " + report + ".");
         }
         ControlFlowBuilderImpl.pattern_ControlFlowBuilder_3_8_ReturnSimpleNode_greenBB(simpleNode, report);

         return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_3_9_expressionFB(report);
      } else
      {
         return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_3_10_expressionFB(report);
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ValidationReport handleStumpedEdge(Scope scope, Edge stumpedEdge, CFNode sourceControlFlowNode)
   {

      Object[] result1_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_1_InitValidationReport_blackFBF(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      Validator validator = (Validator) result1_black[0];
      ValidationReport report = (ValidationReport) result1_black[2];

      Object[] result2_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_2_LookupActivityNode_blackBFF(stumpedEdge);
      if (result2_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[stumpedEdge] = " + stumpedEdge + ".");
      }
      ActivityEdge actEdge = (ActivityEdge) result2_black[1];
      ActivityNode actNode = (ActivityNode) result2_black[2];

      Object[] result3_bindingAndBlack = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_3_InitCurrentScope_bindingAndBlackFB(scope);
      if (result3_bindingAndBlack == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[scope] = " + scope + ".");
      }
      Scope currentScope = (Scope) result3_bindingAndBlack[0];
      // 
      Object[] result4_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_4_IsInCompoundNodeScope_blackBF(currentScope);
      while (result4_black != null)
      {
         CompoundNode compoundNode = (CompoundNode) result4_black[1];

         // 
         Object[] result5_bindingAndBlack = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_5_IsRepetitionNode_bindingAndBlackFB(compoundNode);
         if (result5_bindingAndBlack != null)
         {
            RepetitionNode repetitionNode = (RepetitionNode) result5_bindingAndBlack[0];
            // 
            Object[] result6_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_6_LeadsToImmediateRepetitionNode_blackBB(actNode, repetitionNode);
            if (result6_black != null)
            {
               // 
               Object[] result7_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_7_IsIfStatementScope_blackBF(scope);
               if (result7_black != null)
               {
                  IfStatement ifStatement = (IfStatement) result7_black[1];

                  Object[] result8_bindingAndBlack = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_8_InitNodePointer_bindingAndBlackFB(ifStatement);
                  if (result8_bindingAndBlack == null)
                  {
                     throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ifStatement] = " + ifStatement + ".");
                  }
                  CFNode nodePointer = (CFNode) result8_bindingAndBlack[0];
                  // 
                  Object[] result9_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_9_HasSkippedControlFlowNode_blackFB(nodePointer);
                  while (result9_black == null)
                  {

                     Object[] result10_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_10_LookupScope_blackBF(nodePointer);
                     if (result10_black == null)
                     {
                        throw new RuntimeException("Pattern matching failed." + " Variables: " + "[nodePointer] = " + nodePointer + ".");
                     }
                     Scope scopePointer = (Scope) result10_black[1];
                     // 
                     Object[] result11_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_11_IsLoopHeaderReached_blackBB(repetitionNode, scopePointer);
                     if (result11_black != null)
                     {

                        Object[] result12_black = ControlFlowBuilderImpl
                              .pattern_ControlFlowBuilder_4_12_HandleIfStatementNodeInRepetition_blackBB(sourceControlFlowNode, repetitionNode);
                        if (result12_black == null)
                        {
                           throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceControlFlowNode] = " + sourceControlFlowNode + ", "
                                 + "[repetitionNode] = " + repetitionNode + ".");
                        }
                        ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_12_HandleIfStatementNodeInRepetition_greenBB(sourceControlFlowNode, repetitionNode);

                        return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_13_expressionFB(report);
                     } else
                     {
                        // 
                        Object[] result14_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_14_HasParentScope_blackBF(scopePointer);
                        if (result14_black != null)
                        {
                           CompoundNode parentCompoundNodePointer = (CompoundNode) result14_black[1];

                           Object[] result15_bindingAndBlack = ControlFlowBuilderImpl
                                 .pattern_ControlFlowBuilder_4_15_UpdateNodePointer_bindingAndBlackFB(parentCompoundNodePointer);
                           if (result15_bindingAndBlack == null)
                           {
                              throw new RuntimeException(
                                    "Pattern matching failed." + " Variables: " + "[parentCompoundNodePointer] = " + parentCompoundNodePointer + ".");
                           }
                           nodePointer = (CFNode) result15_bindingAndBlack[0];

                        } else
                        {
                           return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_16_expressionFB(report);
                        }

                     }

                     result9_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_9_HasSkippedControlFlowNode_blackFB(nodePointer);
                  }
                  //nothing CFNode skippedNode = (CFNode) result9_black[0];

                  Object[] result17_green = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_17_CreateContinueStatement_greenF();
                  if (result17_green == null)
                  {
                     throw new RuntimeException("Pattern matching failed.");
                  }
                  ContinueStatement continueStatement = (ContinueStatement) result17_green[0];
                  // 
                  Object[] result18_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_18_LookupLastControlFlowNodeIfExists_blackBF(scope);
                  if (result18_black != null)
                  {
                     CFNode lastNode = (CFNode) result18_black[1];

                     Object[] result19_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_19_AppendContinueStatement_blackBBB(scope, lastNode,
                           continueStatement);
                     if (result19_black == null)
                     {
                        throw new RuntimeException("Pattern matching failed." + " Variables: " + "[scope] = " + scope + ", " + "[lastNode] = " + lastNode + ", "
                              + "[continueStatement] = " + continueStatement + ".");
                     }
                     ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_19_AppendContinueStatement_greenBBB(scope, lastNode, continueStatement);

                  } else
                  {

                     Object[] result20_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_20_AddContinueStatementToScope_blackBB(scope,
                           continueStatement);
                     if (result20_black == null)
                     {
                        throw new RuntimeException(
                              "Pattern matching failed." + " Variables: " + "[scope] = " + scope + ", " + "[continueStatement] = " + continueStatement + ".");
                     }
                     ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_20_AddContinueStatementToScope_greenBB(scope, continueStatement);

                  }

                  Object[] result21_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_21_ConnectContinueStatementToLoopHeader_blackBB(repetitionNode,
                        continueStatement);
                  if (result21_black == null)
                  {
                     throw new RuntimeException("Pattern matching failed." + " Variables: " + "[repetitionNode] = " + repetitionNode + ", "
                           + "[continueStatement] = " + continueStatement + ".");
                  }
                  ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_21_ConnectContinueStatementToLoopHeader_greenBB(repetitionNode, continueStatement);

                  return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_22_expressionFB(report);
               } else
               {

                  Object[] result23_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_23_HandleLastNodeInRepetition_blackBB(repetitionNode,
                        sourceControlFlowNode);
                  if (result23_black == null)
                  {
                     throw new RuntimeException("Pattern matching failed." + " Variables: " + "[repetitionNode] = " + repetitionNode + ", "
                           + "[sourceControlFlowNode] = " + sourceControlFlowNode + ".");
                  }
                  ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_23_HandleLastNodeInRepetition_greenBB(repetitionNode, sourceControlFlowNode);

                  return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_24_expressionFB(report);
               }

            } else
            {
               // 
               Object[] result28_black;
               do
               {
                  // 
                  Object[] result25_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_25_HasParentCompoundNode_blackFBF(compoundNode);
                  if (result25_black != null)
                  {
                     //nothing Scope localParentScope = (Scope) result25_black[0];
                     CompoundNode parentCompoundNode = (CompoundNode) result25_black[2];

                     Object[] result26_bindingAndBlack = ControlFlowBuilderImpl
                           .pattern_ControlFlowBuilder_4_26_UpdateCompoundNode_bindingAndBlackFB(parentCompoundNode);
                     if (result26_bindingAndBlack == null)
                     {
                        throw new RuntimeException("Pattern matching failed." + " Variables: " + "[parentCompoundNode] = " + parentCompoundNode + ".");
                     }
                     compoundNode = (CompoundNode) result26_bindingAndBlack[0];

                  } else
                  {
                     return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_27_expressionFB(report);
                  }

                  result28_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_28_LeadsToInvalidCompoundNode_blackBB(compoundNode, actNode);

               } while (result28_black == null);

               Object[] result29_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_29_ThenOrElseBranchLeadsToNotImmediateLoop_blackBB(actEdge,
                     report);
               if (result29_black == null)
               {
                  throw new RuntimeException("Pattern matching failed." + " Variables: " + "[actEdge] = " + actEdge + ", " + "[report] = " + report + ".");
               }
               ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_29_ThenOrElseBranchLeadsToNotImmediateLoop_greenBBFB(actEdge, report, validator);
               //nothing ErrorMessage errorMessage = (ErrorMessage) result29_green[2];

               return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_30_expressionFB(report);
            }

         } else
         {

            Object[] result31_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_31_LookupParentScope_blackBF(compoundNode);
            if (result31_black == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[compoundNode] = " + compoundNode + ".");
            }
            Scope parentScope = (Scope) result31_black[1];

            Object[] result32_bindingAndBlack = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_32_UpdateCurrentScope_bindingAndBlackFB(parentScope);
            if (result32_bindingAndBlack == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[parentScope] = " + parentScope + ".");
            }
            currentScope = (Scope) result32_bindingAndBlack[0];

         }

         result4_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_4_IsInCompoundNodeScope_blackBF(currentScope);
      }
      return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_4_33_expressionFB(report);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ValidationReport handleTailControlledLoop(Scope scope, Node node, Edge tailLoopEdge)
   {

      Object[] result1_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_1_LookupValidator_blackFFB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      Validator validator = (Validator) result1_black[0];
      ValidationReport report = (ValidationReport) result1_black[1];

      Object[] result2_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_2_LookupTailLoopEdgeTarget_blackFB(tailLoopEdge);
      if (result2_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tailLoopEdge] = " + tailLoopEdge + ".");
      }
      Node tailLoopEdgeTarget = (Node) result2_black[0];
      // 
      Object[] result3_bindingAndBlack = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_3_SearchLargestIntervalEdge_bindingAndBlackFFBBB(this, node,
            tailLoopEdgeTarget);
      if (result3_bindingAndBlack != null)
      {
         Node tailConditionNode = (Node) result3_bindingAndBlack[0];
         Edge backwardEdge = (Edge) result3_bindingAndBlack[1];
         // 
         Object[] result4_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_4_CheckTailExitEdge_blackFB(tailConditionNode);
         if (result4_black != null)
         {
            Edge tailExitEdge = (Edge) result4_black[0];

            Object[] result5_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_5_CreateTailControlledLoop_blackBBF(scope, tailConditionNode);
            if (result5_black == null)
            {
               throw new RuntimeException(
                     "Pattern matching failed." + " Variables: " + "[scope] = " + scope + ", " + "[tailConditionNode] = " + tailConditionNode + ".");
            }
            ActivityNode actTailNode = (ActivityNode) result5_black[2];
            Object[] result5_green = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_5_CreateTailControlledLoop_greenBFFB(scope, actTailNode);
            TailControlledLoop tailControlledLoop = (TailControlledLoop) result5_green[1];
            Scope tailControlledLoopScope = (Scope) result5_green[2];

            // 
            Object[] result6_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_6_CheckTailExitEdgeTarget_blackBF(tailExitEdge);
            if (result6_black != null)
            {
               Node tailExitEdgeTarget = (Node) result6_black[1];

               Object[] result7_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_7_InitializeCrossEdgeAnalysisForTailLoop_blackBBB(validator,
                     tailExitEdgeTarget, node);
               if (result7_black == null)
               {
                  throw new RuntimeException("Pattern matching failed." + " Variables: " + "[validator] = " + validator + ", " + "[tailExitEdgeTarget] = "
                        + tailExitEdgeTarget + ", " + "[node] = " + node + ".");
               }
               Object[] result7_green = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_7_InitializeCrossEdgeAnalysisForTailLoop_greenBBFFFB(validator,
                     tailExitEdgeTarget, node);
               //nothing TreeEdgeNavigator treeEdgeNavigator = (TreeEdgeNavigator) result7_green[2];
               //nothing SubTreeTester lowerTreeTester = (SubTreeTester) result7_green[3];
               CrossEdgeAnalyzer crossEdgeAnalyzer = (CrossEdgeAnalyzer) result7_green[4];

               // 
               ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_8_CrossEdgeAnalysisForTailLoop_expressionFBB(crossEdgeAnalyzer, node);
               // 
               ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_9_TraverseTailLoopDescendants_expressionBBBB(this, scope, tailExitEdgeTarget,
                     tailControlledLoop);
               // 
               if (ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_10_CheckBlockingErrors2_expressionFB(validator))
               {
                  return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_11_expressionFB(report);
               } else
               {
               }

            } else
            {
               // 
               ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_12_HandleStumpedEdge_expressionFBBBB(this, scope, tailExitEdge, tailControlledLoop);

            }

            Object[] result13_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_13_StumpTailControlledLoopEdges_blackBB(node, backwardEdge);
            if (result13_black == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[node] = " + node + ", " + "[backwardEdge] = " + backwardEdge + ".");
            }
            ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_13_StumpTailControlledLoopEdges_redBB(node, backwardEdge);

            ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_13_StumpTailControlledLoopEdges_greenB(backwardEdge);

            Object[] result14_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_14_InitLoopTesters_blackBB(tailConditionNode, node);
            if (result14_black == null)
            {
               throw new RuntimeException(
                     "Pattern matching failed." + " Variables: " + "[tailConditionNode] = " + tailConditionNode + ", " + "[node] = " + node + ".");
            }
            Object[] result14_green = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_14_InitLoopTesters_greenBBFF(tailConditionNode, node);
            SubTreeTester loopStartTester = (SubTreeTester) result14_green[2];
            SubTreeTester loopEndTester = (SubTreeTester) result14_green[3];

            // ForEach 
            for (Object[] result15_black : ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_15_ForAllIncomingEdges_blackFFB(tailConditionNode))
            {
               Edge incomingEdge = (Edge) result15_black[0];
               Node sourceNode = (Node) result15_black[1];
               // 
               if (ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_16_IsSourceInLoopStartSubTree_expressionFBB(loopStartTester, sourceNode))
               {
                  // 
                  if (ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_17_IsSourceInLoopEndSubTree_expressionFBB(loopEndTester, sourceNode))
                  {

                     Object[] result18_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_18_ReportInvalidLoopClosingEdge_blackBFBB(tailConditionNode,
                           report, incomingEdge);
                     if (result18_black == null)
                     {
                        throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tailConditionNode] = " + tailConditionNode + ", "
                              + "[report] = " + report + ", " + "[incomingEdge] = " + incomingEdge + ".");
                     }
                     ActivityEdge actIncomingEdge = (ActivityEdge) result18_black[1];
                     ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_18_ReportInvalidLoopClosingEdge_redBB(tailConditionNode, incomingEdge);

                     ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_18_ReportInvalidLoopClosingEdge_greenBBFBB(actIncomingEdge, report, incomingEdge,
                           validator);
                     //nothing ErrorMessage invalidLoopClosingEdge = (ErrorMessage) result18_green[2];

                  } else
                  {

                     Object[] result19_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_19_StumpLoopClosingIncomingEdge_blackBB(tailConditionNode,
                           incomingEdge);
                     if (result19_black == null)
                     {
                        throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tailConditionNode] = " + tailConditionNode + ", "
                              + "[incomingEdge] = " + incomingEdge + ".");
                     }
                     ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_19_StumpLoopClosingIncomingEdge_redBB(tailConditionNode, incomingEdge);

                     ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_19_StumpLoopClosingIncomingEdge_greenB(incomingEdge);

                  }

               } else
               {

                  Object[] result20_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_20_FujabaHack_blackBBBF(tailConditionNode, incomingEdge,
                        report);
                  if (result20_black == null)
                  {
                     throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tailConditionNode] = " + tailConditionNode + ", "
                           + "[incomingEdge] = " + incomingEdge + ", " + "[report] = " + report + ".");
                  }
                  ActivityEdge actIncomingEdgeHack = (ActivityEdge) result20_black[3];
                  ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_20_FujabaHack_redBB(tailConditionNode, incomingEdge);

                  ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_20_FujabaHack_greenBBBFB(incomingEdge, report, actIncomingEdgeHack, validator);
                  //nothing ErrorMessage invalidLoopClosingEdgeHack = (ErrorMessage) result20_green[3];

               }

            }
            // 
            ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_21_TraverseTailControlledLoop_expressionBBB(this, tailControlledLoopScope, node);
            // 
            if (ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_22_CheckBlockingErrors1_expressionFB(validator))
            {
               return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_23_expressionFB(report);
            } else
            {
               // 
               Object[] result24_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_24_LoopExitsBySuccess_blackBF(tailExitEdge);
               if (result24_black != null)
               {
                  //nothing ActivityEdge actTailExitEdge = (ActivityEdge) result24_black[1];

                  Object[] result25_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_25_SetLoopAlongFalse_blackB(tailControlledLoop);
                  if (result25_black == null)
                  {
                     throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tailControlledLoop] = " + tailControlledLoop + ".");
                  }
                  ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_25_SetLoopAlongFalse_greenB(tailControlledLoop);

               } else
               {

                  Object[] result26_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_26_SetLoopAlongTrue_blackB(tailControlledLoop);
                  if (result26_black == null)
                  {
                     throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tailControlledLoop] = " + tailControlledLoop + ".");
                  }
                  ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_26_SetLoopAlongTrue_greenB(tailControlledLoop);

               }

               Object[] result27_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_27_ReturnTailControlledLoop_blackBB(tailControlledLoop, report);
               if (result27_black == null)
               {
                  throw new RuntimeException(
                        "Pattern matching failed." + " Variables: " + "[tailControlledLoop] = " + tailControlledLoop + ", " + "[report] = " + report + ".");
               }
               ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_27_ReturnTailControlledLoop_greenBB(tailControlledLoop, report);

               return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_28_expressionFB(report);
            }

         } else
         {
         }

      } else
      {
      }
      return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_5_29_expressionFB(report);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void handleUniqueJoinNode(Node joinNode, Node smallerRoot, Node largerRoot)
   {

      Object[] result1_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_6_1_InitializeSubTreeTesters_blackBB(smallerRoot, largerRoot);
      if (result1_black == null)
      {
         throw new RuntimeException(
               "Pattern matching failed." + " Variables: " + "[smallerRoot] = " + smallerRoot + ", " + "[largerRoot] = " + largerRoot + ".");
      }
      Object[] result1_green = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_6_1_InitializeSubTreeTesters_greenFBBF(smallerRoot, largerRoot);
      SubTreeTester largerTreeTester = (SubTreeTester) result1_green[0];
      SubTreeTester smallerTreeTester = (SubTreeTester) result1_green[3];

      // ForEach 
      for (Object[] result2_black : ControlFlowBuilderImpl.pattern_ControlFlowBuilder_6_2_TraverseIncomingEdges_blackFFB(joinNode))
      {
         Node source = (Node) result2_black[0];
         Edge incomingEdge = (Edge) result2_black[1];
         // 
         if (ControlFlowBuilderImpl.pattern_ControlFlowBuilder_6_3_IsSourceInLargerSubTree_expressionFBB(largerTreeTester, source))
         {

            Object[] result4_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_6_4_ReconnectCrossEdgeFromLargerBranch_blackBB(joinNode, incomingEdge);
            if (result4_black == null)
            {
               throw new RuntimeException(
                     "Pattern matching failed." + " Variables: " + "[joinNode] = " + joinNode + ", " + "[incomingEdge] = " + incomingEdge + ".");
            }
            ControlFlowBuilderImpl.pattern_ControlFlowBuilder_6_4_ReconnectCrossEdgeFromLargerBranch_redBB(joinNode, incomingEdge);

            ControlFlowBuilderImpl.pattern_ControlFlowBuilder_6_4_ReconnectCrossEdgeFromLargerBranch_greenB(incomingEdge);

         } else
         {
            // 
            if (ControlFlowBuilderImpl.pattern_ControlFlowBuilder_6_5_IsSourceInSmallerSubTree_expressionFBB(smallerTreeTester, source))
            {
               // 
               Object[] result6_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_6_6_ReconnectCrossEdgeFromSmallerBranch_blackBB(incomingEdge,
                     joinNode);
               if (result6_black != null)
               {
                  ControlFlowBuilderImpl.pattern_ControlFlowBuilder_6_6_ReconnectCrossEdgeFromSmallerBranch_redBB(incomingEdge, joinNode);

                  ControlFlowBuilderImpl.pattern_ControlFlowBuilder_6_6_ReconnectCrossEdgeFromSmallerBranch_greenB(incomingEdge);

               } else
               {
                  // 
                  Object[] result7_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_6_7_ReconnectForwardEdgeFromSmallerBranch_blackBB(joinNode,
                        incomingEdge);
                  if (result7_black != null)
                  {
                     ControlFlowBuilderImpl.pattern_ControlFlowBuilder_6_7_ReconnectForwardEdgeFromSmallerBranch_redBB(joinNode, incomingEdge);

                     ControlFlowBuilderImpl.pattern_ControlFlowBuilder_6_7_ReconnectForwardEdgeFromSmallerBranch_greenB(incomingEdge);

                  } else
                  {

                     Object[] result8_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_6_8_ReconnectTreeEdgeFromSmallerBranch_blackBB(incomingEdge,
                           joinNode);
                     if (result8_black == null)
                     {
                        throw new RuntimeException(
                              "Pattern matching failed." + " Variables: " + "[incomingEdge] = " + incomingEdge + ", " + "[joinNode] = " + joinNode + ".");
                     }
                     ControlFlowBuilderImpl.pattern_ControlFlowBuilder_6_8_ReconnectTreeEdgeFromSmallerBranch_redBB(incomingEdge, joinNode);

                  }

               }

            } else
            {
            }

         }

      }
      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isHeadControlledLoopBranch(Edge edge)
   {// 
      Object[] result1_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_7_1_IsSelfLoop_blackBF(edge);
      if (result1_black != null)
      {
         //nothing Node selfLoopNode = (Node) result1_black[1];
         return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_7_2_expressionF();
      } else
      {

         Object[] result3_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_7_3_LookupSourceAndTargetNodes_blackBF(edge);
         if (result3_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[edge] = " + edge + ".");
         }
         Node analyzedNode = (Node) result3_black[1];
         // 
         Object[] result4_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_7_4_LookupTargetNode_blackFB(edge);
         if (result4_black != null)
         {
            Node branchRoot = (Node) result4_black[0];
            // 
            Object[] result5_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_7_5_HasDirectLoopClosingEdge_blackFBB(analyzedNode, branchRoot);
            if (result5_black != null)
            {
               Edge directLoopClosingEdge = (Edge) result5_black[0];
               // 
               Object[] result6_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_7_6_HasDirectSecondEdge_blackBFB(branchRoot, directLoopClosingEdge);
               if (result6_black != null)
               {
                  Edge directSecondEdge = (Edge) result6_black[1];
                  // 
                  Object[] result7_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_7_7_HasDirectDoubleEdge_blackBB(directSecondEdge, analyzedNode);
                  if (result7_black != null)
                  {
                     return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_7_8_expressionF();
                  } else
                  {
                  }

               } else
               {
                  return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_7_9_expressionF();
               }

            } else
            {
            }
            // 
            Object[] result10_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_7_10_HasLoopClosingEdgeInSubTree_blackFBFB(analyzedNode, branchRoot);
            if (result10_black != null)
            {
               Node sourceNode = (Node) result10_black[0];
               Edge indirectLoopClosingEdge = (Edge) result10_black[2];
               // 
               Object[] result11_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_7_11_HasIndirectSecondEdge_blackBFB(sourceNode,
                     indirectLoopClosingEdge);
               if (result11_black != null)
               {
                  Edge secondEdge = (Edge) result11_black[1];
                  // 
                  Object[] result12_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_7_12_HasIndirectDoubleEdge_blackBB(analyzedNode, secondEdge);
                  if (result12_black != null)
                  {
                     return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_7_13_expressionF();
                  } else
                  {
                     return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_7_14_expressionF();
                  }

               } else
               {
                  return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_7_15_expressionF();
               }

            } else
            {
               return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_7_16_expressionF();
            }

         } else
         {
            return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_7_17_expressionF();
         }

      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isLoopBranch(Edge edge)
   {// 
      Object[] result1_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_8_1_IsSelfLoop_blackBF(edge);
      if (result1_black != null)
      {
         //nothing Node selfLoopNode = (Node) result1_black[1];
         return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_8_2_expressionF();
      } else
      {

         Object[] result3_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_8_3_LookupSourceNode_blackFB(edge);
         if (result3_black == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[edge] = " + edge + ".");
         }
         Node analyzedNode = (Node) result3_black[0];
         // 
         Object[] result4_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_8_4_LookupTargetNode_blackFB(edge);
         if (result4_black != null)
         {
            Node branchRoot = (Node) result4_black[0];
            // 
            Object[] result5_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_8_5_HasDirectLoopClosingEdge_blackBBF(branchRoot, analyzedNode);
            if (result5_black != null)
            {
               //nothing Edge directLoopClosingEdge = (Edge) result5_black[2];
               return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_8_6_expressionF();
            } else
            {
               // 
               Object[] result7_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_8_7_HasLoopClosingEdgeInSubTree_blackFBFB(analyzedNode, branchRoot);
               if (result7_black != null)
               {
                  //nothing Node sourceNode = (Node) result7_black[0];
                  //nothing Edge indirectLoopClosingEdge = (Edge) result7_black[2];
                  return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_8_8_expressionF();
               } else
               {
                  return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_8_9_expressionF();
               }

            }

         } else
         {
            return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_8_10_expressionF();
         }

      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void lookahead(Scope scope, Node node)
   {// 
      Object[] result1_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_9_1_RefersToStopNode_blackBF(node);
      if (result1_black != null)
      {
         //nothing StopNode stopNode = (StopNode) result1_black[1];
      } else
      {
         // 
         Object[] result2_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_9_2_HasOutgoingEdge_blackBF(node);
         if (result2_black != null)
         {
            //nothing Edge outgoingEdge = (Edge) result2_black[1];
         } else
         {
            return;
         }

      }

      Object[] result4_bindingAndBlack = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_9_4_ProcessNode_bindingAndBlackFBBB(this, scope, node);
      if (result4_bindingAndBlack == null)
      {
         throw new RuntimeException(
               "Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[scope] = " + scope + ", " + "[node] = " + node + ".");
      }
      ValidationReport report = (ValidationReport) result4_bindingAndBlack[0];

      Object[] result5_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_9_5_RemoveResult_blackBF(report);
      if (result5_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[report] = " + report + ".");
      }
      CFNode result = (CFNode) result5_black[1];
      ControlFlowBuilderImpl.pattern_ControlFlowBuilder_9_5_RemoveResult_redBB(report, result);

      return;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void lookaheadAndConnect(Scope scope, Node node, CFNode currentCFNode)
   {

      Object[] result1_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_10_1_LookupValidator_blackFB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      Validator validator = (Validator) result1_black[0];
      // 
      Object[] result2_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_10_2_RefersToStopNode_blackBF(node);
      if (result2_black != null)
      {
         //nothing StopNode stopNode = (StopNode) result2_black[1];
      } else
      {
         // 
         Object[] result3_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_10_3_HasOutgoingEdge_blackBF(node);
         if (result3_black != null)
         {
            //nothing Edge outgoingEdge = (Edge) result3_black[1];
         } else
         {
            return;
         }

      }

      Object[] result5_bindingAndBlack = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_10_5_ProcessNode_bindingAndBlackFBBB(this, scope, node);
      if (result5_bindingAndBlack == null)
      {
         throw new RuntimeException(
               "Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[scope] = " + scope + ", " + "[node] = " + node + ".");
      }
      ValidationReport report = (ValidationReport) result5_bindingAndBlack[0];
      // 
      if (ControlFlowBuilderImpl.pattern_ControlFlowBuilder_10_6_CheckBlockingErrors_expressionFB(validator))
      {
         return;
      } else
      {

         Object[] result8_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_10_8_ConnectToDescendants_blackFBB(report, currentCFNode);
         if (result8_black == null)
         {
            throw new RuntimeException(
                  "Pattern matching failed." + " Variables: " + "[report] = " + report + ", " + "[currentCFNode] = " + currentCFNode + ".");
         }
         CFNode cfNode = (CFNode) result8_black[0];
         ControlFlowBuilderImpl.pattern_ControlFlowBuilder_10_8_ConnectToDescendants_redBB(cfNode, report);

         ControlFlowBuilderImpl.pattern_ControlFlowBuilder_10_8_ConnectToDescendants_greenBB(cfNode, currentCFNode);

         return;
      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ValidationReport processNode(Scope scope, Node node)
   {

      Object[] result1_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_1_InitValidationReport_blackFBF(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      Validator validator = (Validator) result1_black[0];
      ValidationReport report = (ValidationReport) result1_black[2];
      // 
      Object[] result2_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_2_IsForEachNode_blackFB(node);
      if (result2_black != null)
      {
         StoryNode actNode = (StoryNode) result2_black[0];

         Object[] result3_bindingAndBlack = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_3_HandleForEachNode_bindingAndBlackFBBBB(this, scope, node,
               actNode);
         if (result3_bindingAndBlack == null)
         {
            throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[scope] = " + scope + ", " + "[node] = "
                  + node + ", " + "[actNode] = " + actNode + ".");
         }
         ValidationReport forEachNodeReport = (ValidationReport) result3_bindingAndBlack[0];
         return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_4_expressionFB(forEachNodeReport);
      } else
      {
         // 
         Object[] result5_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_5_IsLoopRecognized_blackBF(node);
         if (result5_black != null)
         {
            //nothing Edge edge = (Edge) result5_black[1];

            Object[] result6_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_6_LookupFirstLoopBranch_blackBF(node);
            if (result6_black == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[node] = " + node + ".");
            }
            Edge firstLoopBranchEdge = (Edge) result6_black[1];
            // 
            Object[] result7_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_7_LookupSecondLoopBranch_blackFBB(node, firstLoopBranchEdge);
            if (result7_black != null)
            {
               Edge secondLoopBranchEdge = (Edge) result7_black[0];
               // 
               if (ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_8_IsSecondLoopBranch_expressionFBB(this, secondLoopBranchEdge))
               {
                  // 
                  if (ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_9_IsFirstLoopBranch2_expressionFBB(this, firstLoopBranchEdge))
                  {
                     // 
                     if (ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_10_IsSecondHeadControlledLoopBranch2_expressionFBB(this, secondLoopBranchEdge))
                     {
                        // 
                        if (ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_11_IsFirstHeadControlledLoopHead_expressionFBB(this, firstLoopBranchEdge))
                        {

                           Object[] result12_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_12_ReportTwoHeadControlledLoops_blackBBF(report,
                                 node);
                           if (result12_black == null)
                           {
                              throw new RuntimeException(
                                    "Pattern matching failed." + " Variables: " + "[report] = " + report + ", " + "[node] = " + node + ".");
                           }
                           ActivityNode twoHeadControlledLoopHeader = (ActivityNode) result12_black[2];
                           ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_12_ReportTwoHeadControlledLoops_greenBBFB(report, twoHeadControlledLoopHeader,
                                 validator);
                           //nothing ErrorMessage twoHeadControlledLoopBranchesFound = (ErrorMessage) result12_green[2];

                           return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_13_expressionFB(report);
                        } else
                        {
                           return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_14_expressionFBBBB(this, scope, node, firstLoopBranchEdge);
                        }

                     } else
                     {
                        // 
                        if (ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_15_IsFirstHeadControlledLoopTail_expressionFBB(this, firstLoopBranchEdge))
                        {
                           return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_16_expressionFBBBB(this, scope, node, secondLoopBranchEdge);
                        } else
                        {

                           Object[] result17_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_17_ReportTwoTailControlledLoops_blackBBF(node,
                                 report);
                           if (result17_black == null)
                           {
                              throw new RuntimeException(
                                    "Pattern matching failed." + " Variables: " + "[node] = " + node + ", " + "[report] = " + report + ".");
                           }
                           ActivityNode twoTailControlledLoopHeader = (ActivityNode) result17_black[2];
                           ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_17_ReportTwoTailControlledLoops_greenFBBB(report, twoTailControlledLoopHeader,
                                 validator);
                           //nothing ErrorMessage twoTailControlledLoopBranchesFound = (ErrorMessage) result17_green[0];

                           return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_18_expressionFB(report);
                        }

                     }

                  } else
                  {
                     // 
                     if (ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_19_IsSecondHeadControlledLoopBranch1_expressionFBB(this, secondLoopBranchEdge))
                     {
                        return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_20_expressionFBBBB(this, scope, node, secondLoopBranchEdge);
                     } else
                     {
                        return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_21_expressionFBBBB(this, scope, node, secondLoopBranchEdge);
                     }

                  }

               } else
               {
               }

            } else
            {
            }
            // 
            if (ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_22_IsFirstLoopBranch1_expressionFBB(this, firstLoopBranchEdge))
            {
               // 
               if (ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_23_IsFirstHeadControlledLoopBranch1_expressionFBB(this, firstLoopBranchEdge))
               {
                  return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_24_expressionFBBBB(this, scope, node, firstLoopBranchEdge);
               } else
               {
                  return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_25_expressionFBBBB(this, scope, node, firstLoopBranchEdge);
               }

            } else
            {

               Object[] result26_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_26_ReportInternalError_blackBBF(report, node);
               if (result26_black == null)
               {
                  throw new RuntimeException("Pattern matching failed." + " Variables: " + "[report] = " + report + ", " + "[node] = " + node + ".");
               }
               ActivityNode internalErrorLoop = (ActivityNode) result26_black[2];
               ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_26_ReportInternalError_greenBFBB(report, internalErrorLoop, validator);
               //nothing ErrorMessage internalError = (ErrorMessage) result26_green[1];

               return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_27_expressionFB(report);
            }

         } else
         {
            // 
            Object[] result28_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_28_LookupFirstOutgoingEdge_blackFB(node);
            if (result28_black != null)
            {
               Edge outgoingEdge = (Edge) result28_black[0];
               // 
               Object[] result29_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_29_LookupSecondOutgoingEdge_blackBBF(node, outgoingEdge);
               if (result29_black != null)
               {
                  Edge secondOutgoingEdge = (Edge) result29_black[2];
                  // 
                  Object[] result30_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_30_LookupThirdOutgoingEdge_blackBFBB(secondOutgoingEdge,
                        outgoingEdge, node);
                  if (result30_black != null)
                  {
                     Edge thirdOutgoingEdge = (Edge) result30_black[1];

                     Object[] result31_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_31_ReportThirdOutgoingEdge_blackBBFBBFF(secondOutgoingEdge,
                           thirdOutgoingEdge, outgoingEdge, report);
                     if (result31_black == null)
                     {
                        throw new RuntimeException("Pattern matching failed." + " Variables: " + "[secondOutgoingEdge] = " + secondOutgoingEdge + ", "
                              + "[thirdOutgoingEdge] = " + thirdOutgoingEdge + ", " + "[outgoingEdge] = " + outgoingEdge + ", " + "[report] = " + report + ".");
                     }
                     ActivityEdge actEdge3 = (ActivityEdge) result31_black[2];
                     ActivityEdge actEdge1 = (ActivityEdge) result31_black[5];
                     ActivityEdge actEdge2 = (ActivityEdge) result31_black[6];
                     ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_31_ReportThirdOutgoingEdge_greenBFBBBB(actEdge3, report, actEdge1, actEdge2,
                           validator);
                     //nothing ErrorMessage thirdOutgoingEdgeFound = (ErrorMessage) result31_green[1];

                     return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_32_expressionFB(report);
                  } else
                  {
                     // 
                     Object[] result33_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_33_IsSecondBranchEmpty_blackB(secondOutgoingEdge);
                     if (result33_black != null)
                     {

                        Object[] result34_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_34_CreateNodeWithEmptyBranch_blackFBB(node, scope);
                        if (result34_black == null)
                        {
                           throw new RuntimeException("Pattern matching failed." + " Variables: " + "[node] = " + node + ", " + "[scope] = " + scope + ".");
                        }
                        ActivityNode actEmptyBranchNode = (ActivityNode) result34_black[0];
                        Object[] result34_green = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_34_CreateNodeWithEmptyBranch_greenBFB(actEmptyBranchNode,
                              scope);
                        IfStatement emptyBranchNode = (IfStatement) result34_green[1];

                        Object[] result35_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_35_CreateEmptySuccessScope_blackB(emptyBranchNode);
                        if (result35_black == null)
                        {
                           throw new RuntimeException("Pattern matching failed." + " Variables: " + "[emptyBranchNode] = " + emptyBranchNode + ".");
                        }
                        Object[] result35_green = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_35_CreateEmptySuccessScope_greenFB(emptyBranchNode);
                        Scope emptySuccessScope = (Scope) result35_green[0];

                        Object[] result36_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_36_CreateEmptyFailureScope_blackB(emptyBranchNode);
                        if (result36_black == null)
                        {
                           throw new RuntimeException("Pattern matching failed." + " Variables: " + "[emptyBranchNode] = " + emptyBranchNode + ".");
                        }
                        Object[] result36_green = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_36_CreateEmptyFailureScope_greenBF(emptyBranchNode);
                        Scope emptyFailureScope = (Scope) result36_green[1];

                        // 
                        Object[] result37_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_37_HandleEmptyBranch_blackFB(secondOutgoingEdge);
                        if (result37_black != null)
                        {
                           Node emptyBranchJoinNode = (Node) result37_black[0];
                           ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_37_HandleEmptyBranch_redBB(emptyBranchJoinNode, secondOutgoingEdge);

                           ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_37_HandleEmptyBranch_greenB(secondOutgoingEdge);

                           // 
                           Object[] result38_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_38_AreBothBranchesEmpty_blackBB(outgoingEdge,
                                 emptyBranchJoinNode);
                           if (result38_black != null)
                           {

                              Object[] result39_black = ControlFlowBuilderImpl
                                    .pattern_ControlFlowBuilder_11_39_HandleTreeEdgeInEmptyBranch_blackFBB(emptyBranchJoinNode, secondOutgoingEdge);
                              if (result39_black == null)
                              {
                                 throw new RuntimeException("Pattern matching failed." + " Variables: " + "[emptyBranchJoinNode] = " + emptyBranchJoinNode
                                       + ", " + "[secondOutgoingEdge] = " + secondOutgoingEdge + ".");
                              }
                              Edge treeBranchEdge = (Edge) result39_black[0];
                              ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_39_HandleTreeEdgeInEmptyBranch_redBB(treeBranchEdge, emptyBranchJoinNode);

                           } else
                           {

                              Object[] result40_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_40_LookupNonEmptyBranchRoot_blackBF(outgoingEdge);
                              if (result40_black == null)
                              {
                                 throw new RuntimeException("Pattern matching failed." + " Variables: " + "[outgoingEdge] = " + outgoingEdge + ".");
                              }
                              Node nonEmptyBranchRoot = (Node) result40_black[1];
                              // ForEach 
                              for (Object[] result41_black : ControlFlowBuilderImpl
                                    .pattern_ControlFlowBuilder_11_41_HandleEdgesInNonEmptyBranch1_blackFBB(emptyBranchJoinNode, nonEmptyBranchRoot))
                              {
                                 Edge nonEmptyBranchEdge1 = (Edge) result41_black[0];
                                 ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_41_HandleEdgesInNonEmptyBranch1_redBB(nonEmptyBranchEdge1,
                                       emptyBranchJoinNode);

                                 ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_41_HandleEdgesInNonEmptyBranch1_greenB(nonEmptyBranchEdge1);

                              }
                              // ForEach 
                              for (Object[] result42_black : ControlFlowBuilderImpl
                                    .pattern_ControlFlowBuilder_11_42_HandleEdgesInNonEmptyBranch2_blackBFFB(emptyBranchJoinNode, nonEmptyBranchRoot))
                              {
                                 Edge nonEmptyBranchEdge2 = (Edge) result42_black[1];
                                 //nothing Node nonEmptyBranchEdgeSource = (Node) result42_black[2];
                                 ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_42_HandleEdgesInNonEmptyBranch2_redBB(emptyBranchJoinNode,
                                       nonEmptyBranchEdge2);

                                 ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_42_HandleEdgesInNonEmptyBranch2_greenB(nonEmptyBranchEdge2);

                              }

                           }
                           // 
                           ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_43_TraverseEmptyBranchDescendants_expressionBBBB(this, scope,
                                 emptyBranchJoinNode, emptyBranchNode);
                           // 
                           if (ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_44_CheckFatalErrors2_expressionFB(validator))
                           {
                              return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_45_expressionFB(report);
                           } else
                           {
                           }

                        } else
                        {
                        }
                        // 
                        ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_46_TraverseNonEmptyAndEmptyBranches_expressionBBBBBB(this, emptyBranchNode,
                              outgoingEdge, secondOutgoingEdge, emptySuccessScope, emptyFailureScope);
                        // 
                        if (ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_47_CheckFatalErrors3_expressionFB(validator))
                        {
                           return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_48_expressionFB(report);
                        } else
                        {

                           Object[] result49_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_49_ReturnEmptyBranchNode_blackBB(report,
                                 emptyBranchNode);
                           if (result49_black == null)
                           {
                              throw new RuntimeException("Pattern matching failed." + " Variables: " + "[report] = " + report + ", " + "[emptyBranchNode] = "
                                    + emptyBranchNode + ".");
                           }
                           ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_49_ReturnEmptyBranchNode_greenBB(report, emptyBranchNode);

                           return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_50_expressionFB(report);
                        }

                     } else
                     {
                        // 
                        Object[] result51_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_51_IsSecondEdgeValid_blackB(secondOutgoingEdge);
                        if (result51_black != null)
                        {

                           Object[] result52_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_52_CreateRegularBranchNode_blackFBB(scope, node);
                           if (result52_black == null)
                           {
                              throw new RuntimeException("Pattern matching failed." + " Variables: " + "[scope] = " + scope + ", " + "[node] = " + node + ".");
                           }
                           ActivityNode actRegularBranchNode = (ActivityNode) result52_black[0];
                           Object[] result52_green = ControlFlowBuilderImpl
                                 .pattern_ControlFlowBuilder_11_52_CreateRegularBranchNode_greenBFB(actRegularBranchNode, scope);
                           IfStatement regularBranchNode = (IfStatement) result52_green[1];

                           Object[] result53_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_53_CreateSuccessScope_blackB(regularBranchNode);
                           if (result53_black == null)
                           {
                              throw new RuntimeException("Pattern matching failed." + " Variables: " + "[regularBranchNode] = " + regularBranchNode + ".");
                           }
                           Object[] result53_green = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_53_CreateSuccessScope_greenFB(regularBranchNode);
                           Scope successScope = (Scope) result53_green[0];

                           Object[] result54_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_54_CreateFailureScope_blackB(regularBranchNode);
                           if (result54_black == null)
                           {
                              throw new RuntimeException("Pattern matching failed." + " Variables: " + "[regularBranchNode] = " + regularBranchNode + ".");
                           }
                           Object[] result54_green = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_54_CreateFailureScope_greenBF(regularBranchNode);
                           Scope failureScope = (Scope) result54_green[1];

                           // 
                           Object[] result55_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_55_LookupFirstTarget_blackFB(outgoingEdge);
                           if (result55_black != null)
                           {
                              Node firstTarget = (Node) result55_black[0];
                              // 
                              Object[] result56_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_56_LookupSecondTarget_blackBF(secondOutgoingEdge);
                              if (result56_black != null)
                              {
                                 Node secondTarget = (Node) result56_black[1];

                                 Object[] result57_green = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_57_InitializeJoinNodeFinder_greenFF();
                                 if (result57_green == null)
                                 {
                                    throw new RuntimeException("Pattern matching failed.");
                                 }
                                 //nothing TreeEdgeNavigator joinNodeVisitor = (TreeEdgeNavigator) result57_green[0];
                                 JoinNodeFinder joinNodeFinder = (JoinNodeFinder) result57_green[1];
                                 // 
                                 Object[] result58_black = ControlFlowBuilderImpl
                                       .pattern_ControlFlowBuilder_11_58_CompareBranchPreTraversalIDs_blackBB(secondTarget, firstTarget);
                                 if (result58_black != null)
                                 {

                                    Object[] result59_black = ControlFlowBuilderImpl
                                          .pattern_ControlFlowBuilder_11_59_JoinNodeLookupInitialization1_blackBB(joinNodeFinder, secondTarget);
                                    if (result59_black == null)
                                    {
                                       throw new RuntimeException("Pattern matching failed." + " Variables: " + "[joinNodeFinder] = " + joinNodeFinder + ", "
                                             + "[secondTarget] = " + secondTarget + ".");
                                    }
                                    ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_59_JoinNodeLookupInitialization1_greenBB(joinNodeFinder, secondTarget);

                                    // 
                                    ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_60_JoinNodeLookup1_expressionFBB(joinNodeFinder, firstTarget);

                                 } else
                                 {

                                    Object[] result61_black = ControlFlowBuilderImpl
                                          .pattern_ControlFlowBuilder_11_61_JoinNodeLookupInitialization2_blackBB(joinNodeFinder, firstTarget);
                                    if (result61_black == null)
                                    {
                                       throw new RuntimeException("Pattern matching failed." + " Variables: " + "[joinNodeFinder] = " + joinNodeFinder + ", "
                                             + "[firstTarget] = " + firstTarget + ".");
                                    }
                                    ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_61_JoinNodeLookupInitialization2_greenBB(joinNodeFinder, firstTarget);

                                    // 
                                    ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_62_JoinNodeLookup2_expressionFBB(joinNodeFinder, secondTarget);

                                 }
                                 // 
                                 Object[] result63_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_63_LookupFirstJoinNode_blackFB(joinNodeFinder);
                                 if (result63_black != null)
                                 {
                                    Node joinNode = (Node) result63_black[0];
                                    // 
                                    Object[] result64_black = ControlFlowBuilderImpl
                                          .pattern_ControlFlowBuilder_11_64_LookupSecondJoinNode_blackBBF(joinNodeFinder, joinNode);
                                    if (result64_black != null)
                                    {
                                       //nothing Node secondJoinNode = (Node) result64_black[2];

                                       Object[] result65_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_65_ReportMultipleJoinNodes_blackB(report);
                                       if (result65_black == null)
                                       {
                                          throw new RuntimeException("Pattern matching failed." + " Variables: " + "[report] = " + report + ".");
                                       }
                                       Object[] result65_green = ControlFlowBuilderImpl
                                             .pattern_ControlFlowBuilder_11_65_ReportMultipleJoinNodes_greenFBB(report, validator);
                                       ErrorMessage errorSecondJoinNode = (ErrorMessage) result65_green[0];

                                       // ForEach 
                                       for (Object[] result66_black : ControlFlowBuilderImpl
                                             .pattern_ControlFlowBuilder_11_66_AddAllJoinNodes_blackBBFF(errorSecondJoinNode, joinNodeFinder))
                                       {
                                          ActivityNode actJoinNodes = (ActivityNode) result66_black[2];
                                          //nothing Node joinNodes = (Node) result66_black[3];
                                          ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_66_AddAllJoinNodes_greenBB(errorSecondJoinNode, actJoinNodes);

                                       }
                                       return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_67_expressionFB(report);
                                    } else
                                    {
                                       // 
                                       Object[] result68_black = ControlFlowBuilderImpl
                                             .pattern_ControlFlowBuilder_11_68_CompareBranchTraversalIDsAgain_blackBB(secondTarget, firstTarget);
                                       if (result68_black != null)
                                       {
                                          // 
                                          ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_69_ProcessIncomingEdgesOfJoinNode1_expressionBBBB(this, joinNode,
                                                firstTarget, secondTarget);
                                          // 
                                          Object[] result70_black = ControlFlowBuilderImpl
                                                .pattern_ControlFlowBuilder_11_70_StumpTreeEdgeIfFirstBranchIsEmpty_blackFBB(firstTarget, joinNodeFinder);
                                          if (result70_black != null)
                                          {
                                             Edge firstIncomingTreeEdge = (Edge) result70_black[0];
                                             ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_70_StumpTreeEdgeIfFirstBranchIsEmpty_redBB(
                                                   firstIncomingTreeEdge, firstTarget);

                                          } else
                                          {
                                          }

                                       } else
                                       {
                                          // 
                                          ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_71_ProcessIncomingEdgesOfJoinNode2_expressionBBBB(this, joinNode,
                                                secondTarget, firstTarget);
                                          // 
                                          Object[] result72_black = ControlFlowBuilderImpl
                                                .pattern_ControlFlowBuilder_11_72_StumpTreeEdgeIfSecondBranchIsEmpty_blackFBB(joinNodeFinder, secondTarget);
                                          if (result72_black != null)
                                          {
                                             Edge secondIncomingTreeEdge = (Edge) result72_black[0];
                                             ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_72_StumpTreeEdgeIfSecondBranchIsEmpty_redBB(
                                                   secondIncomingTreeEdge, secondTarget);

                                          } else
                                          {
                                          }

                                       }
                                       // 
                                       ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_73_TraverseJoinNodeDescendants_expressionBBBB(this, scope, joinNode,
                                             regularBranchNode);
                                       // 
                                       if (ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_74_CheckFatalErrors4_expressionFB(validator))
                                       {
                                          return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_75_expressionFB(report);
                                       } else
                                       {
                                       }

                                    }

                                 } else
                                 {
                                 }

                              } else
                              {
                              }

                           } else
                           {
                           }
                           // 
                           ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_76_TraverseThenAndElseBranches_expressionBBBBBB(this, regularBranchNode,
                                 outgoingEdge, secondOutgoingEdge, successScope, failureScope);
                           // 
                           if (ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_77_CheckFatalErrors5_expressionFB(validator))
                           {
                              return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_78_expressionFB(report);
                           } else
                           {

                              Object[] result79_black = ControlFlowBuilderImpl
                                    .pattern_ControlFlowBuilder_11_79_ReturnRegularBranchNode_blackBB(regularBranchNode, report);
                              if (result79_black == null)
                              {
                                 throw new RuntimeException("Pattern matching failed." + " Variables: " + "[regularBranchNode] = " + regularBranchNode + ", "
                                       + "[report] = " + report + ".");
                              }
                              ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_79_ReturnRegularBranchNode_greenBB(regularBranchNode, report);

                              return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_80_expressionFB(report);
                           }

                        } else
                        {

                           Object[] result81_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_81_ReportInvalidOutEdgeType_blackBFB(report,
                                 secondOutgoingEdge);
                           if (result81_black == null)
                           {
                              throw new RuntimeException("Pattern matching failed." + " Variables: " + "[report] = " + report + ", " + "[secondOutgoingEdge] = "
                                    + secondOutgoingEdge + ".");
                           }
                           ActivityEdge secondOutActEdge = (ActivityEdge) result81_black[1];
                           ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_81_ReportInvalidOutEdgeType_greenFBBB(report, secondOutActEdge, validator);
                           //nothing ErrorMessage errorInvalidOutEdge = (ErrorMessage) result81_green[0];

                           return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_82_expressionFB(report);
                        }

                     }

                  }

               } else
               {

                  Object[] result83_bindingAndBlack = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_83_HandleSimpleNode_bindingAndBlackFBBBB(this, scope,
                        node, outgoingEdge);
                  if (result83_bindingAndBlack == null)
                  {
                     throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[scope] = " + scope + ", "
                           + "[node] = " + node + ", " + "[outgoingEdge] = " + outgoingEdge + ".");
                  }
                  ValidationReport simpleNodeResult = (ValidationReport) result83_bindingAndBlack[0];
                  return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_84_expressionFB(simpleNodeResult);
               }

            } else
            {

               Object[] result85_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_85_CreateStopNode_blackFBBB(scope, report, node);
               if (result85_black == null)
               {
                  throw new RuntimeException(
                        "Pattern matching failed." + " Variables: " + "[scope] = " + scope + ", " + "[report] = " + report + ", " + "[node] = " + node + ".");
               }
               StopNode actStopNode = (StopNode) result85_black[0];
               ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_85_CreateStopNode_greenBBFB(actStopNode, scope, report);
               //nothing ReturnStatement stopNode = (ReturnStatement) result85_green[2];

               return ControlFlowBuilderImpl.pattern_ControlFlowBuilder_11_86_expressionFB(report);
            }

         }

      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void traverseThenAndElseBranches(IfStatement ifStatement, Edge firstOutgoingEdge, Edge secondOutgoingEdge, Scope successScope, Scope failureScope)
   {

      Object[] result1_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_12_1_LookupValidator_blackBF(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      Validator validator = (Validator) result1_black[1];
      // 
      Object[] result2_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_12_2_FirstTargetLookup_blackBF(firstOutgoingEdge);
      if (result2_black != null)
      {
         Node firstTargetInBranch = (Node) result2_black[1];
         // 
         Object[] result3_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_12_3_IsFirstASuccessBranch_blackFB(firstOutgoingEdge);
         if (result3_black != null)
         {
            //nothing ActivityEdge actFirstEdge = (ActivityEdge) result3_black[0];
            // 
            ControlFlowBuilderImpl.pattern_ControlFlowBuilder_12_4_TraverseFirstAsSuccessBranch_expressionBBB(this, successScope, firstTargetInBranch);

         } else
         {
            // 
            ControlFlowBuilderImpl.pattern_ControlFlowBuilder_12_5_TraverseFirstAsFailureBranch_expressionBBB(this, failureScope, firstTargetInBranch);

         }
         // 
         if (ControlFlowBuilderImpl.pattern_ControlFlowBuilder_12_6_CheckBlockingErrorsAfterFirstBranch_expressionFB(validator))
         {
            return;
         } else
         {
         }

      } else
      {
         // 
         Object[] result8_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_12_8_IsFirstStumpedSuccessBranch_blackBF(firstOutgoingEdge);
         if (result8_black != null)
         {
            //nothing ActivityEdge actFirstStumpedEdge = (ActivityEdge) result8_black[1];
            // 
            ControlFlowBuilderImpl.pattern_ControlFlowBuilder_12_9_HandleFirstStumpedEdgeInSuccessScope_expressionFBBBB(this, successScope, firstOutgoingEdge,
                  ifStatement);

         } else
         {
            // 
            ControlFlowBuilderImpl.pattern_ControlFlowBuilder_12_10_HandleFirstStumpedEdgeInFailureScope_expressionFBBBB(this, failureScope, firstOutgoingEdge,
                  ifStatement);

         }

      }
      // 
      Object[] result11_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_12_11_SecondTargetLookup_blackFB(secondOutgoingEdge);
      if (result11_black != null)
      {
         Node secondTargetInBranch = (Node) result11_black[0];
         // 
         Object[] result12_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_12_12_IsSecondASuccessBranch_blackFB(secondOutgoingEdge);
         if (result12_black != null)
         {
            //nothing ActivityEdge actSecondEdge = (ActivityEdge) result12_black[0];
            // 
            ControlFlowBuilderImpl.pattern_ControlFlowBuilder_12_13_TraverseSecondAsSuccessBranch_expressionBBB(this, successScope, secondTargetInBranch);

         } else
         {
            // 
            ControlFlowBuilderImpl.pattern_ControlFlowBuilder_12_14_TraverseSecondAsFailureBranch_expressionBBB(this, failureScope, secondTargetInBranch);

         }
         // 
         ControlFlowBuilderImpl.pattern_ControlFlowBuilder_12_15_CheckBlockingErrorsAfterSecondBranch_expressionFB(validator);
         return;
      } else
      {
         // 
         Object[] result17_black = ControlFlowBuilderImpl.pattern_ControlFlowBuilder_12_17_IsSecondStumpedSuccessBranch_blackFB(secondOutgoingEdge);
         if (result17_black != null)
         {
            //nothing ActivityEdge actSecondStumpedEdge = (ActivityEdge) result17_black[0];
            // 
            ControlFlowBuilderImpl.pattern_ControlFlowBuilder_12_18_HandleSecondStumpedEdgeInSuccessScope_expressionFBBBB(this, successScope,
                  secondOutgoingEdge, ifStatement);
            return;
         } else
         {
            // 
            ControlFlowBuilderImpl.pattern_ControlFlowBuilder_12_20_HandleSecondStumpedEdgeInFailureScope_expressionFBBBB(this, failureScope,
                  secondOutgoingEdge, ifStatement);
            return;
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
      case ControlflowPackage.CONTROL_FLOW_BUILDER__VALIDATOR:
         if (resolve)
            return getValidator();
         return basicGetValidator();
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
      case ControlflowPackage.CONTROL_FLOW_BUILDER__VALIDATOR:
         setValidator((Validator) newValue);
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
      case ControlflowPackage.CONTROL_FLOW_BUILDER__VALIDATOR:
         setValidator((Validator) null);
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
      case ControlflowPackage.CONTROL_FLOW_BUILDER__VALIDATOR:
         return validator != null;
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
      case ControlflowPackage.CONTROL_FLOW_BUILDER___FIND_LARGEST_BACKWARD_EDGE_INTERVAL__NODE_NODE:
         return findLargestBackwardEdgeInterval((Node) arguments.get(0), (Node) arguments.get(1));
      case ControlflowPackage.CONTROL_FLOW_BUILDER___HANDLE_FOR_EACH_NODE__SCOPE_NODE_STORYNODE:
         return handleForEachNode((Scope) arguments.get(0), (Node) arguments.get(1), (StoryNode) arguments.get(2));
      case ControlflowPackage.CONTROL_FLOW_BUILDER___HANDLE_HEAD_CONTROLLED_LOOP__SCOPE_NODE_EDGE:
         return handleHeadControlledLoop((Scope) arguments.get(0), (Node) arguments.get(1), (Edge) arguments.get(2));
      case ControlflowPackage.CONTROL_FLOW_BUILDER___HANDLE_SIMPLE_NODE__SCOPE_NODE_EDGE:
         return handleSimpleNode((Scope) arguments.get(0), (Node) arguments.get(1), (Edge) arguments.get(2));
      case ControlflowPackage.CONTROL_FLOW_BUILDER___HANDLE_STUMPED_EDGE__SCOPE_EDGE_CFNODE:
         return handleStumpedEdge((Scope) arguments.get(0), (Edge) arguments.get(1), (CFNode) arguments.get(2));
      case ControlflowPackage.CONTROL_FLOW_BUILDER___HANDLE_TAIL_CONTROLLED_LOOP__SCOPE_NODE_EDGE:
         return handleTailControlledLoop((Scope) arguments.get(0), (Node) arguments.get(1), (Edge) arguments.get(2));
      case ControlflowPackage.CONTROL_FLOW_BUILDER___HANDLE_UNIQUE_JOIN_NODE__NODE_NODE_NODE:
         handleUniqueJoinNode((Node) arguments.get(0), (Node) arguments.get(1), (Node) arguments.get(2));
         return null;
      case ControlflowPackage.CONTROL_FLOW_BUILDER___IS_HEAD_CONTROLLED_LOOP_BRANCH__EDGE:
         return isHeadControlledLoopBranch((Edge) arguments.get(0));
      case ControlflowPackage.CONTROL_FLOW_BUILDER___IS_LOOP_BRANCH__EDGE:
         return isLoopBranch((Edge) arguments.get(0));
      case ControlflowPackage.CONTROL_FLOW_BUILDER___LOOKAHEAD__SCOPE_NODE:
         lookahead((Scope) arguments.get(0), (Node) arguments.get(1));
         return null;
      case ControlflowPackage.CONTROL_FLOW_BUILDER___LOOKAHEAD_AND_CONNECT__SCOPE_NODE_CFNODE:
         lookaheadAndConnect((Scope) arguments.get(0), (Node) arguments.get(1), (CFNode) arguments.get(2));
         return null;
      case ControlflowPackage.CONTROL_FLOW_BUILDER___PROCESS_NODE__SCOPE_NODE:
         return processNode((Scope) arguments.get(0), (Node) arguments.get(1));
      case ControlflowPackage.CONTROL_FLOW_BUILDER___TRAVERSE_THEN_AND_ELSE_BRANCHES__IFSTATEMENT_EDGE_EDGE_SCOPE_SCOPE:
         traverseThenAndElseBranches((IfStatement) arguments.get(0), (Edge) arguments.get(1), (Edge) arguments.get(2), (Scope) arguments.get(3),
               (Scope) arguments.get(4));
         return null;
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_ControlFlowBuilder_1_1_LookupValidator_blackBFF(ControlFlowBuilder _this)
   {
      Validator validator = _this.getValidator();
      if (validator != null)
      {
         ValidationReport report = validator.getValidationReport();
         if (report != null)
         {
            return new Object[] { _this, report, validator };
         }

      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_1_2_CreateForEachNode_blackBB(Scope scope, StoryNode actForEachNode)
   {
      return new Object[] { scope, actForEachNode };
   }

   public static final Object[] pattern_ControlFlowBuilder_1_2_CreateForEachNode_greenBFFB(Scope scope, StoryNode actForEachNode)
   {
      ForEach cfForEachNode = DemoclesFactory.eINSTANCE.createForEach();
      Scope forEachScope = DemoclesFactory.eINSTANCE.createScope();
      scope.getContents().add(cfForEachNode);
      cfForEachNode.setOrigin(actForEachNode);
      forEachScope.setParent(cfForEachNode);
      return new Object[] { scope, cfForEachNode, forEachScope, actForEachNode };
   }

   public static final Object[] pattern_ControlFlowBuilder_1_3_LookupEndEdge_blackFFB(Node node)
   {
      for (Edge endEdge : node.getOutgoing())
      {
         EObject tmpActEndEdge = endEdge.getOrigin();
         if (tmpActEndEdge instanceof ActivityEdge)
         {
            ActivityEdge actEndEdge = (ActivityEdge) tmpActEndEdge;
            EdgeType endEdge_type = endEdge.getType();
            if (endEdge_type.equals(EdgeType.TREE_EDGE))
            {
               EdgeGuard actEndEdge_guard = actEndEdge.getGuard();
               if (actEndEdge_guard.equals(EdgeGuard.END))
               {
                  return new Object[] { actEndEdge, endEdge, node };
               }

            }

         }

      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_1_4_LookupEndEdgeTarget_blackFB(Edge endEdge)
   {
      Node endTarget = endEdge.getTarget();
      if (endTarget != null)
      {
         return new Object[] { endTarget, endEdge };
      }

      return null;
   }

   public static final void pattern_ControlFlowBuilder_1_5_TraverseEndBranchDescendants_expressionBBBB(ControlFlowBuilder _this, Scope scope, Node endTarget,
         ForEach cfForEachNode)
   {
      _this.lookaheadAndConnect(scope, endTarget, cfForEachNode);

   }

   public static final boolean pattern_ControlFlowBuilder_1_6_CheckBlockingErrors1_expressionFB(Validator validator)
   {
      boolean _localVariable_0 = validator.hasFatalErrors();
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_1_7_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_1_8_HandleStumpedEdge_expressionFBBBB(ControlFlowBuilder _this, Scope scope, Edge endEdge,
         ForEach cfForEachNode)
   {
      ValidationReport _localVariable_0 = _this.handleStumpedEdge(scope, endEdge, cfForEachNode);
      ValidationReport _result = _localVariable_0;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_1_9_CheckSecondOutgoingEdge_blackBFB(Node node, Edge endEdge)
   {
      for (Edge eachTimeEdge : node.getOutgoing())
      {
         if (!eachTimeEdge.equals(endEdge))
         {
            return new Object[] { node, eachTimeEdge, endEdge };
         }
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_1_10_LookupEachTimeEdge_blackBFF(Edge eachTimeEdge)
   {
      EObject tmpActEachTimeEdge = eachTimeEdge.getOrigin();
      if (tmpActEachTimeEdge instanceof ActivityEdge)
      {
         ActivityEdge actEachTimeEdge = (ActivityEdge) tmpActEachTimeEdge;
         Node eachTimeTarget = eachTimeEdge.getTarget();
         if (eachTimeTarget != null)
         {
            EdgeType eachTimeEdge_type = eachTimeEdge.getType();
            if (eachTimeEdge_type.equals(EdgeType.FORWARD_EDGE))
            {
               EdgeGuard actEachTimeEdge_guard = actEachTimeEdge.getGuard();
               if (actEachTimeEdge_guard.equals(EdgeGuard.EACH_TIME))
               {
                  return new Object[] { eachTimeEdge, eachTimeTarget, actEachTimeEdge };
               }

            }

         }

      }

      return null;
   }

   public static final Iterable<Object[]> pattern_ControlFlowBuilder_1_11_StumpForEachComponentClosingEdge_blackBFFB(Node node, Node eachTimeTarget)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      if (!eachTimeTarget.equals(node))
      {
         int eachTimeTarget_preTraversal = eachTimeTarget.getPreTraversal();
         int eachTimeTarget_postTraversal = eachTimeTarget.getPostTraversal();
         for (Edge componentClosingEdge : node.getIncoming())
         {
            Node closingEdgeSource = componentClosingEdge.getSource();
            if (closingEdgeSource != null)
            {
               if (!closingEdgeSource.equals(node))
               {
                  if (!closingEdgeSource.equals(eachTimeTarget))
                  {
                     EdgeType componentClosingEdge_type = componentClosingEdge.getType();
                     if (componentClosingEdge_type.equals(EdgeType.CROSS_EDGE))
                     {
                        int closingEdgeSource_preTraversal = closingEdgeSource.getPreTraversal();
                        if (Integer.valueOf(closingEdgeSource_preTraversal).compareTo(Integer.valueOf(eachTimeTarget_preTraversal)) >= 0)
                        {
                           int closingEdgeSource_postTraversal = closingEdgeSource.getPostTraversal();
                           if (Integer.valueOf(closingEdgeSource_postTraversal).compareTo(Integer.valueOf(eachTimeTarget_postTraversal)) <= 0)
                           {
                              _result.add(new Object[] { node, closingEdgeSource, componentClosingEdge, eachTimeTarget });
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

   public static final Object[] pattern_ControlFlowBuilder_1_11_StumpForEachComponentClosingEdge_redBB(Node node, Edge componentClosingEdge)
   {
      node.getIncoming().remove(componentClosingEdge);
      return new Object[] { node, componentClosingEdge };
   }

   public static final Object[] pattern_ControlFlowBuilder_1_11_StumpForEachComponentClosingEdge_greenB(Edge componentClosingEdge)
   {
      EdgeType componentClosingEdge_type_prime = EdgeType.TREE_EDGE;
      componentClosingEdge.setType(componentClosingEdge_type_prime);
      return new Object[] { componentClosingEdge };
   }

   public static final void pattern_ControlFlowBuilder_1_12_TraverseEachTimeDescendants_expressionBBB(ControlFlowBuilder _this, Scope forEachScope,
         Node eachTimeTarget)
   {
      _this.lookahead(forEachScope, eachTimeTarget);

   }

   public static final boolean pattern_ControlFlowBuilder_1_13_CheckBlockingErrors2_expressionFB(Validator validator)
   {
      boolean _localVariable_0 = validator.hasFatalErrors();
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_1_14_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_1_15_ReportEachTimeEdgeError_blackBB(ValidationReport report, StoryNode actForEachNode)
   {
      return new Object[] { report, actForEachNode };
   }

   public static final Object[] pattern_ControlFlowBuilder_1_15_ReportEachTimeEdgeError_greenBFBB(ValidationReport report, StoryNode actForEachNode,
         Validator validator)
   {
      ErrorMessage reportEachTimeEdgeError = ResultFactory.eINSTANCE.createErrorMessage();
      Severity reportEachTimeEdgeError_severity_prime = Severity.ERROR;
      String _localVariable_0 = validator.lookupErrorMessage(Errors.FOR_EACH_EDGE_FORWARD);
      reportEachTimeEdgeError.getLocation().add(actForEachNode);
      report.getErrorMessages().add(reportEachTimeEdgeError);
      reportEachTimeEdgeError.setSeverity(reportEachTimeEdgeError_severity_prime);
      String reportEachTimeEdgeError_id_prime = _localVariable_0;
      reportEachTimeEdgeError.setId(reportEachTimeEdgeError_id_prime);
      return new Object[] { report, reportEachTimeEdgeError, actForEachNode, validator };
   }

   public static final ValidationReport pattern_ControlFlowBuilder_1_16_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_1_17_ReturnForEachNode_blackBB(ValidationReport report, ForEach cfForEachNode)
   {
      return new Object[] { report, cfForEachNode };
   }

   public static final Object[] pattern_ControlFlowBuilder_1_17_ReturnForEachNode_greenBB(ValidationReport report, ForEach cfForEachNode)
   {
      report.setResult(cfForEachNode);
      return new Object[] { report, cfForEachNode };
   }

   public static final ValidationReport pattern_ControlFlowBuilder_1_18_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_1_19_ReportEndEdgeError_blackBB(StoryNode actForEachNode, ValidationReport report)
   {
      return new Object[] { actForEachNode, report };
   }

   public static final Object[] pattern_ControlFlowBuilder_1_19_ReportEndEdgeError_greenBBFB(StoryNode actForEachNode, ValidationReport report,
         Validator validator)
   {
      ErrorMessage reportEndEdgeError = ResultFactory.eINSTANCE.createErrorMessage();
      Severity reportEndEdgeError_severity_prime = Severity.ERROR;
      String _localVariable_0 = validator.lookupErrorMessage(Errors.FOREACH_END_EDGE_ERROR);
      report.getErrorMessages().add(reportEndEdgeError);
      reportEndEdgeError.getLocation().add(actForEachNode);
      reportEndEdgeError.setSeverity(reportEndEdgeError_severity_prime);
      String reportEndEdgeError_id_prime = _localVariable_0;
      reportEndEdgeError.setId(reportEndEdgeError_id_prime);
      return new Object[] { actForEachNode, report, reportEndEdgeError, validator };
   }

   public static final ValidationReport pattern_ControlFlowBuilder_1_20_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_2_1_InitializeValidationReporting_blackFBF(ControlFlowBuilder _this)
   {
      Validator validator = _this.getValidator();
      if (validator != null)
      {
         ValidationReport report = validator.getValidationReport();
         if (report != null)
         {
            return new Object[] { validator, _this, report };
         }

      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_2_2_LookupHeadLoopEdgeTarget_blackBF(Edge headLoopEdge)
   {
      Node headLoopEdgeTarget = headLoopEdge.getTarget();
      if (headLoopEdgeTarget != null)
      {
         return new Object[] { headLoopEdge, headLoopEdgeTarget };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_2_3_CreateHeadControlledLoop_blackFBB(Scope scope, Node node)
   {
      EObject tmpActHeadNode = node.getOrigin();
      if (tmpActHeadNode instanceof ActivityNode)
      {
         ActivityNode actHeadNode = (ActivityNode) tmpActHeadNode;
         return new Object[] { actHeadNode, scope, node };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_2_3_CreateHeadControlledLoop_greenBBFF(ActivityNode actHeadNode, Scope scope)
   {
      HeadControlledLoop headControlledLoop = DemoclesFactory.eINSTANCE.createHeadControlledLoop();
      Scope headControlledLoopScope = DemoclesFactory.eINSTANCE.createScope();
      scope.getContents().add(headControlledLoop);
      headControlledLoop.setOrigin(actHeadNode);
      headControlledLoopScope.setParent(headControlledLoop);
      return new Object[] { actHeadNode, scope, headControlledLoop, headControlledLoopScope };
   }

   public static final Object[] pattern_ControlFlowBuilder_2_4_StumpSelfLoop_blackBB(Edge headLoopEdge, Node node)
   {
      if (node.getIncoming().contains(headLoopEdge))
      {
         EdgeType headLoopEdge_type = headLoopEdge.getType();
         if (headLoopEdge_type.equals(EdgeType.BACKWARD_EDGE))
         {
            return new Object[] { headLoopEdge, node };
         }

      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_2_4_StumpSelfLoop_redBB(Edge headLoopEdge, Node node)
   {
      node.getIncoming().remove(headLoopEdge);
      return new Object[] { headLoopEdge, node };
   }

   public static final Object[] pattern_ControlFlowBuilder_2_4_StumpSelfLoop_greenB(Edge headLoopEdge)
   {
      EdgeType headLoopEdge_type_prime = EdgeType.TREE_EDGE;
      headLoopEdge.setType(headLoopEdge_type_prime);
      return new Object[] { headLoopEdge };
   }

   public static final Iterable<Object[]> pattern_ControlFlowBuilder_2_5_StumpBackwardEdgesFromLoop1_blackBBF(Node headLoopEdgeTarget, Node node)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      if (!headLoopEdgeTarget.equals(node))
      {
         for (Edge backwardEdge1 : headLoopEdgeTarget.getOutgoing())
         {
            if (node.getIncoming().contains(backwardEdge1))
            {
               EdgeType backwardEdge1_type = backwardEdge1.getType();
               if (backwardEdge1_type.equals(EdgeType.BACKWARD_EDGE))
               {
                  _result.add(new Object[] { headLoopEdgeTarget, node, backwardEdge1 });
               }

            }
         }
      }
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_2_5_StumpBackwardEdgesFromLoop1_redBB(Node node, Edge backwardEdge1)
   {
      node.getIncoming().remove(backwardEdge1);
      return new Object[] { node, backwardEdge1 };
   }

   public static final Object[] pattern_ControlFlowBuilder_2_5_StumpBackwardEdgesFromLoop1_greenB(Edge backwardEdge1)
   {
      EdgeType backwardEdge1_type_prime = EdgeType.TREE_EDGE;
      backwardEdge1.setType(backwardEdge1_type_prime);
      return new Object[] { backwardEdge1 };
   }

   public static final Iterable<Object[]> pattern_ControlFlowBuilder_2_6_StumpBackwardEdgesFromLoop2_blackFFBB(Node node, Node headLoopEdgeTarget)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      if (!headLoopEdgeTarget.equals(node))
      {
         int headLoopEdgeTarget_preTraversal = headLoopEdgeTarget.getPreTraversal();
         int headLoopEdgeTarget_postTraversal = headLoopEdgeTarget.getPostTraversal();
         for (Edge backwardEdge2 : node.getIncoming())
         {
            Node backwardEdgeSource = backwardEdge2.getSource();
            if (backwardEdgeSource != null)
            {
               if (!backwardEdgeSource.equals(node))
               {
                  if (!backwardEdgeSource.equals(headLoopEdgeTarget))
                  {
                     EdgeType backwardEdge2_type = backwardEdge2.getType();
                     if (backwardEdge2_type.equals(EdgeType.BACKWARD_EDGE))
                     {
                        int backwardEdgeSource_preTraversal = backwardEdgeSource.getPreTraversal();
                        if (Integer.valueOf(backwardEdgeSource_preTraversal).compareTo(Integer.valueOf(headLoopEdgeTarget_preTraversal)) >= 0)
                        {
                           int backwardEdgeSource_postTraversal = backwardEdgeSource.getPostTraversal();
                           if (Integer.valueOf(backwardEdgeSource_postTraversal).compareTo(Integer.valueOf(headLoopEdgeTarget_postTraversal)) <= 0)
                           {
                              _result.add(new Object[] { backwardEdgeSource, backwardEdge2, node, headLoopEdgeTarget });
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

   public static final Object[] pattern_ControlFlowBuilder_2_6_StumpBackwardEdgesFromLoop2_redBB(Edge backwardEdge2, Node node)
   {
      node.getIncoming().remove(backwardEdge2);
      return new Object[] { backwardEdge2, node };
   }

   public static final Object[] pattern_ControlFlowBuilder_2_6_StumpBackwardEdgesFromLoop2_greenB(Edge backwardEdge2)
   {
      EdgeType backwardEdge2_type_prime = EdgeType.TREE_EDGE;
      backwardEdge2.setType(backwardEdge2_type_prime);
      return new Object[] { backwardEdge2 };
   }

   public static final Iterable<Object[]> pattern_ControlFlowBuilder_2_7_NoLoopExternalBackwardEdgesAllowed_blackFBF(Node node)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (Edge erroneousBackwardEdge : node.getIncoming())
      {
         EObject tmpErroneousActivityEdge = erroneousBackwardEdge.getOrigin();
         if (tmpErroneousActivityEdge instanceof ActivityEdge)
         {
            ActivityEdge erroneousActivityEdge = (ActivityEdge) tmpErroneousActivityEdge;
            EdgeType erroneousBackwardEdge_type = erroneousBackwardEdge.getType();
            if (erroneousBackwardEdge_type.equals(EdgeType.BACKWARD_EDGE))
            {
               _result.add(new Object[] { erroneousBackwardEdge, node, erroneousActivityEdge });
            }

         }

      }
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_2_8_ReportAndDeleteExternBwdEdge_blackBBB(Edge erroneousBackwardEdge, ValidationReport report,
         ActivityEdge erroneousActivityEdge)
   {
      return new Object[] { erroneousBackwardEdge, report, erroneousActivityEdge };
   }

   public static final Object[] pattern_ControlFlowBuilder_2_8_ReportAndDeleteExternBwdEdge_redB(Edge erroneousBackwardEdge)
   {
      return new Object[] { erroneousBackwardEdge };
   }

   public static final Object[] pattern_ControlFlowBuilder_2_8_ReportAndDeleteExternBwdEdge_greenFBBB(ValidationReport report,
         ActivityEdge erroneousActivityEdge, Validator validator)
   {
      ErrorMessage errorExternBwdEdge = ResultFactory.eINSTANCE.createErrorMessage();
      String _localVariable_0 = validator.lookupErrorMessage(Errors.HEAD_LOOP_EXT_BWD_EDGE);
      Severity errorExternBwdEdge_severity_prime = Severity.ERROR;
      errorExternBwdEdge.getLocation().add(erroneousActivityEdge);
      report.getErrorMessages().add(errorExternBwdEdge);
      String errorExternBwdEdge_id_prime = _localVariable_0;
      errorExternBwdEdge.setSeverity(errorExternBwdEdge_severity_prime);
      errorExternBwdEdge.setId(errorExternBwdEdge_id_prime);
      return new Object[] { errorExternBwdEdge, report, erroneousActivityEdge, validator };
   }

   public static final Object[] pattern_ControlFlowBuilder_2_9_LookupHeadExitEdge_blackFBB(Node node, Edge headLoopEdge)
   {
      for (Edge headExitEdge : node.getOutgoing())
      {
         if (!headExitEdge.equals(headLoopEdge))
         {
            EdgeType headExitEdge_type = headExitEdge.getType();
            if (headExitEdge_type.equals(EdgeType.TREE_EDGE))
            {
               return new Object[] { headExitEdge, node, headLoopEdge };
            }

         }
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_2_10_HasThirdOutgoingEdge_blackBFBB(Node node, Edge headExitEdge, Edge headLoopEdge)
   {
      if (!headExitEdge.equals(headLoopEdge))
      {
         for (Edge thirdOutgoingEdge : node.getOutgoing())
         {
            if (!headExitEdge.equals(thirdOutgoingEdge))
            {
               if (!headLoopEdge.equals(thirdOutgoingEdge))
               {
                  return new Object[] { node, thirdOutgoingEdge, headExitEdge, headLoopEdge };
               }
            }
         }
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_2_11_ReportThirdOutgoingEdgeError_blackFBBBFBF(Edge headLoopEdge, Edge thirdOutgoingEdge,
         ValidationReport report, Edge headExitEdge)
   {
      if (!headLoopEdge.equals(thirdOutgoingEdge))
      {
         if (!headExitEdge.equals(headLoopEdge))
         {
            if (!headExitEdge.equals(thirdOutgoingEdge))
            {
               EObject tmpHeadLoopActivityEdge = headLoopEdge.getOrigin();
               if (tmpHeadLoopActivityEdge instanceof ActivityEdge)
               {
                  ActivityEdge headLoopActivityEdge = (ActivityEdge) tmpHeadLoopActivityEdge;
                  EObject tmpThirdActivityEdge = thirdOutgoingEdge.getOrigin();
                  if (tmpThirdActivityEdge instanceof ActivityEdge)
                  {
                     ActivityEdge thirdActivityEdge = (ActivityEdge) tmpThirdActivityEdge;
                     if (!headLoopActivityEdge.equals(thirdActivityEdge))
                     {
                        EObject tmpHeadExitActivityEdge = headExitEdge.getOrigin();
                        if (tmpHeadExitActivityEdge instanceof ActivityEdge)
                        {
                           ActivityEdge headExitActivityEdge = (ActivityEdge) tmpHeadExitActivityEdge;
                           if (!headExitActivityEdge.equals(thirdActivityEdge))
                           {
                              if (!headExitActivityEdge.equals(headLoopActivityEdge))
                              {
                                 return new Object[] { thirdActivityEdge, headLoopEdge, thirdOutgoingEdge, report, headExitActivityEdge, headExitEdge,
                                       headLoopActivityEdge };
                              }
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

   public static final Object[] pattern_ControlFlowBuilder_2_11_ReportThirdOutgoingEdgeError_greenBBBFBB(ActivityEdge thirdActivityEdge,
         ValidationReport report, ActivityEdge headExitActivityEdge, ActivityEdge headLoopActivityEdge, Validator validator)
   {
      ErrorMessage threeOutgoingEdges = ResultFactory.eINSTANCE.createErrorMessage();
      Severity threeOutgoingEdges_severity_prime = Severity.FATAL;
      String _localVariable_0 = validator.lookupErrorMessage(Errors.MAX_TWO_OUTGOING_EDGES);
      report.getErrorMessages().add(threeOutgoingEdges);
      threeOutgoingEdges.getLocation().add(headLoopActivityEdge);
      threeOutgoingEdges.getLocation().add(headExitActivityEdge);
      threeOutgoingEdges.getLocation().add(thirdActivityEdge);
      threeOutgoingEdges.setSeverity(threeOutgoingEdges_severity_prime);
      String threeOutgoingEdges_id_prime = _localVariable_0;
      threeOutgoingEdges.setId(threeOutgoingEdges_id_prime);
      return new Object[] { thirdActivityEdge, report, headExitActivityEdge, threeOutgoingEdges, headLoopActivityEdge, validator };
   }

   public static final ValidationReport pattern_ControlFlowBuilder_2_12_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_2_13_LookupHeadExitEdgeTarget_blackBF(Edge headExitEdge)
   {
      Node headExitEdgeTarget = headExitEdge.getTarget();
      if (headExitEdgeTarget != null)
      {
         return new Object[] { headExitEdge, headExitEdgeTarget };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_2_14_IsLoopEdgeTraversedFirst_blackBB(Node headLoopEdgeTarget, Node headExitEdgeTarget)
   {
      if (!headExitEdgeTarget.equals(headLoopEdgeTarget))
      {
         int headLoopEdgeTarget_preTraversal = headLoopEdgeTarget.getPreTraversal();
         int headExitEdgeTarget_preTraversal = headExitEdgeTarget.getPreTraversal();
         if (Integer.valueOf(headLoopEdgeTarget_preTraversal).compareTo(Integer.valueOf(headExitEdgeTarget_preTraversal)) < 0)
         {
            return new Object[] { headLoopEdgeTarget, headExitEdgeTarget };
         }

      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_2_15_InitializeCrossEdgeAnalysisForHead1_blackBBB(Validator validator, Node node,
         Node headExitEdgeTarget)
   {
      if (!headExitEdgeTarget.equals(node))
      {
         return new Object[] { validator, node, headExitEdgeTarget };
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_2_15_InitializeCrossEdgeAnalysisForHead1_greenBBFFBF(Validator validator, Node node,
         Node headExitEdgeTarget)
   {
      TreeEdgeNavigator treeEdgeNavigator1 = ControlflowFactory.eINSTANCE.createTreeEdgeNavigator();
      CrossEdgeAnalyzer crossEdgeAnalyzer1 = ControlflowFactory.eINSTANCE.createCrossEdgeAnalyzer();
      SubTreeTester lowerEdgeTester1 = ControlflowFactory.eINSTANCE.createSubTreeTester();
      boolean treeEdgeNavigator1_forward_prime = Boolean.valueOf(true);
      boolean lowerEdgeTester1_includeRoot_prime = Boolean.valueOf(true);
      treeEdgeNavigator1.setDelegate(crossEdgeAnalyzer1);
      crossEdgeAnalyzer1.setValidator(validator);
      crossEdgeAnalyzer1.setDelegate(treeEdgeNavigator1);
      crossEdgeAnalyzer1.setMiddleRoot(node);
      crossEdgeAnalyzer1.setLowerTreeTester(lowerEdgeTester1);
      lowerEdgeTester1.setRoot(headExitEdgeTarget);
      treeEdgeNavigator1.setForward(Boolean.valueOf(treeEdgeNavigator1_forward_prime));
      lowerEdgeTester1.setIncludeRoot(Boolean.valueOf(lowerEdgeTester1_includeRoot_prime));
      return new Object[] { validator, node, treeEdgeNavigator1, crossEdgeAnalyzer1, headExitEdgeTarget, lowerEdgeTester1 };
   }

   public static final EObject pattern_ControlFlowBuilder_2_16_CrossEdgeAnalysisForHeadLoop1_expressionFBB(CrossEdgeAnalyzer crossEdgeAnalyzer1,
         Node headLoopEdgeTarget)
   {
      EObject _localVariable_0 = crossEdgeAnalyzer1.processNode(headLoopEdgeTarget);
      EObject _result = _localVariable_0;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_2_17_InitializeCrossEdgeAnalysisForHead2_blackBBB(Validator validator, Node node,
         Node headExitEdgeTarget)
   {
      if (!headExitEdgeTarget.equals(node))
      {
         return new Object[] { validator, node, headExitEdgeTarget };
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_2_17_InitializeCrossEdgeAnalysisForHead2_greenBFFBB(Validator validator, Node node,
         Node headExitEdgeTarget)
   {
      SubTreeTester lowerEdgeTester2 = ControlflowFactory.eINSTANCE.createSubTreeTester();
      CrossEdgeAnalyzer crossEdgeAnalyzer2 = ControlflowFactory.eINSTANCE.createCrossEdgeAnalyzer();
      boolean lowerEdgeTester2_includeRoot_prime = Boolean.valueOf(true);
      lowerEdgeTester2.setRoot(headExitEdgeTarget);
      crossEdgeAnalyzer2.setValidator(validator);
      crossEdgeAnalyzer2.setMiddleRoot(node);
      crossEdgeAnalyzer2.setLowerTreeTester(lowerEdgeTester2);
      lowerEdgeTester2.setIncludeRoot(Boolean.valueOf(lowerEdgeTester2_includeRoot_prime));
      return new Object[] { validator, lowerEdgeTester2, crossEdgeAnalyzer2, node, headExitEdgeTarget };
   }

   public static final EObject pattern_ControlFlowBuilder_2_18_CrossEdgeAnalysisForHeadLoop2_expressionFBB(CrossEdgeAnalyzer crossEdgeAnalyzer2, Node node)
   {
      EObject _localVariable_0 = crossEdgeAnalyzer2.processNode(node);
      EObject _result = _localVariable_0;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_2_19_InitializeCrossEdgeAnalysisForHead3_blackBB(Validator validator, Node headLoopEdgeTarget)
   {
      return new Object[] { validator, headLoopEdgeTarget };
   }

   public static final Object[] pattern_ControlFlowBuilder_2_19_InitializeCrossEdgeAnalysisForHead3_greenBFBF(Validator validator, Node headLoopEdgeTarget)
   {
      CrossEdgeAnalyzer crossEdgeAnalyzer3 = ControlflowFactory.eINSTANCE.createCrossEdgeAnalyzer();
      TreeEdgeNavigator treeEdgeNavigator3 = ControlflowFactory.eINSTANCE.createTreeEdgeNavigator();
      boolean treeEdgeNavigator3_forward_prime = Boolean.valueOf(true);
      crossEdgeAnalyzer3.setValidator(validator);
      crossEdgeAnalyzer3.setMiddleRoot(headLoopEdgeTarget);
      crossEdgeAnalyzer3.setDelegate(treeEdgeNavigator3);
      treeEdgeNavigator3.setDelegate(crossEdgeAnalyzer3);
      treeEdgeNavigator3.setForward(Boolean.valueOf(treeEdgeNavigator3_forward_prime));
      return new Object[] { validator, crossEdgeAnalyzer3, headLoopEdgeTarget, treeEdgeNavigator3 };
   }

   public static final EObject pattern_ControlFlowBuilder_2_20_CrossEdgeAnalysisForHead3_expressionFBB(CrossEdgeAnalyzer crossEdgeAnalyzer3,
         Node headLoopEdgeTarget)
   {
      EObject _localVariable_0 = crossEdgeAnalyzer3.processNode(headLoopEdgeTarget);
      EObject _result = _localVariable_0;
      return _result;
   }

   public static final void pattern_ControlFlowBuilder_2_21_TraverseHeadLoopExitDescendant_expressionBBBB(ControlFlowBuilder _this, Scope scope,
         Node headExitEdgeTarget, HeadControlledLoop headControlledLoop)
   {
      _this.lookaheadAndConnect(scope, headExitEdgeTarget, headControlledLoop);

   }

   public static final boolean pattern_ControlFlowBuilder_2_22_CheckBlockingErrorsAfterHeadLoopExit_expressionFB(Validator validator)
   {
      boolean _localVariable_0 = validator.hasFatalErrors();
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_2_23_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_2_24_HandleStumpedEdge_expressionFBBBB(ControlFlowBuilder _this, Scope scope,
         Edge headExitEdge, HeadControlledLoop headControlledLoop)
   {
      ValidationReport _localVariable_0 = _this.handleStumpedEdge(scope, headExitEdge, headControlledLoop);
      ValidationReport _result = _localVariable_0;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_2_25_HasSecondInvalidOutgoingEdge_blackFBB(Edge headLoopEdge, Node node)
   {
      for (Edge secondOutgoingEdge : node.getIncoming())
      {
         if (!headLoopEdge.equals(secondOutgoingEdge))
         {
            return new Object[] { secondOutgoingEdge, headLoopEdge, node };
         }
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_2_26_ReportInvalidOutEdges_blackBBF(ValidationReport report, Node node)
   {
      EObject tmpActivityNodeWithTwoOutgoingEdge = node.getOrigin();
      if (tmpActivityNodeWithTwoOutgoingEdge instanceof ActivityNode)
      {
         ActivityNode activityNodeWithTwoOutgoingEdge = (ActivityNode) tmpActivityNodeWithTwoOutgoingEdge;
         return new Object[] { report, node, activityNodeWithTwoOutgoingEdge };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_2_26_ReportInvalidOutEdges_greenBFBB(ValidationReport report,
         ActivityNode activityNodeWithTwoOutgoingEdge, Validator validator)
   {
      ErrorMessage reportOutEdges = ResultFactory.eINSTANCE.createErrorMessage();
      Severity reportOutEdges_severity_prime = Severity.FATAL;
      String _localVariable_0 = validator.lookupErrorMessage(Errors.INVALID_OUTGOING_EDGES);
      reportOutEdges.getLocation().add(activityNodeWithTwoOutgoingEdge);
      report.getErrorMessages().add(reportOutEdges);
      reportOutEdges.setSeverity(reportOutEdges_severity_prime);
      String reportOutEdges_id_prime = _localVariable_0;
      reportOutEdges.setId(reportOutEdges_id_prime);
      return new Object[] { report, reportOutEdges, activityNodeWithTwoOutgoingEdge, validator };
   }

   public static final ValidationReport pattern_ControlFlowBuilder_2_27_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final void pattern_ControlFlowBuilder_2_28_TraverseHeadLoopEdgeDescendant_expressionBBB(ControlFlowBuilder _this,
         Scope headControlledLoopScope, Node headLoopEdgeTarget)
   {
      _this.lookahead(headControlledLoopScope, headLoopEdgeTarget);

   }

   public static final boolean pattern_ControlFlowBuilder_2_29_CheckBlockingErrorsAfterHeadLoopEdge_expressionFB(Validator validator)
   {
      boolean _localVariable_0 = validator.hasFatalErrors();
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_2_30_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_2_31_LoopsBySuccess_blackBF(Edge headLoopEdge)
   {
      EObject tmpActHeadLoopEdge = headLoopEdge.getOrigin();
      if (tmpActHeadLoopEdge instanceof ActivityEdge)
      {
         ActivityEdge actHeadLoopEdge = (ActivityEdge) tmpActHeadLoopEdge;
         EdgeGuard actHeadLoopEdge_guard = actHeadLoopEdge.getGuard();
         if (actHeadLoopEdge_guard.equals(EdgeGuard.SUCCESS))
         {
            return new Object[] { headLoopEdge, actHeadLoopEdge };
         }

      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_2_32_SetLoopAlongTrue_blackB(HeadControlledLoop headControlledLoop)
   {
      return new Object[] { headControlledLoop };
   }

   public static final Object[] pattern_ControlFlowBuilder_2_32_SetLoopAlongTrue_greenB(HeadControlledLoop headControlledLoop)
   {
      boolean headControlledLoop_loopAlongTrue_prime = Boolean.valueOf(true);
      headControlledLoop.setLoopAlongTrue(Boolean.valueOf(headControlledLoop_loopAlongTrue_prime));
      return new Object[] { headControlledLoop };
   }

   public static final Object[] pattern_ControlFlowBuilder_2_33_SetLoopAlongFalse_blackB(HeadControlledLoop headControlledLoop)
   {
      return new Object[] { headControlledLoop };
   }

   public static final Object[] pattern_ControlFlowBuilder_2_33_SetLoopAlongFalse_greenB(HeadControlledLoop headControlledLoop)
   {
      boolean headControlledLoop_loopAlongTrue_prime = Boolean.valueOf(false);
      headControlledLoop.setLoopAlongTrue(Boolean.valueOf(headControlledLoop_loopAlongTrue_prime));
      return new Object[] { headControlledLoop };
   }

   public static final Object[] pattern_ControlFlowBuilder_2_34_ReturnHeadControlledLoop_blackBB(ValidationReport report, HeadControlledLoop headControlledLoop)
   {
      return new Object[] { report, headControlledLoop };
   }

   public static final Object[] pattern_ControlFlowBuilder_2_34_ReturnHeadControlledLoop_greenBB(ValidationReport report, HeadControlledLoop headControlledLoop)
   {
      report.setResult(headControlledLoop);
      return new Object[] { report, headControlledLoop };
   }

   public static final ValidationReport pattern_ControlFlowBuilder_2_35_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_3_1_LookupValidator_blackBFF(ControlFlowBuilder _this)
   {
      Validator validator = _this.getValidator();
      if (validator != null)
      {
         ValidationReport report = validator.getValidationReport();
         if (report != null)
         {
            return new Object[] { _this, validator, report };
         }

      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_3_2_CreateSimpleNode_blackFBB(Scope scope, Node node)
   {
      EObject tmpActSimpleNode = node.getOrigin();
      if (tmpActSimpleNode instanceof ActivityNode)
      {
         ActivityNode actSimpleNode = (ActivityNode) tmpActSimpleNode;
         return new Object[] { actSimpleNode, scope, node };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_3_2_CreateSimpleNode_greenBFB(ActivityNode actSimpleNode, Scope scope)
   {
      CFNode simpleNode = DemoclesFactory.eINSTANCE.createCFNode();
      simpleNode.setOrigin(actSimpleNode);
      scope.getContents().add(simpleNode);
      return new Object[] { actSimpleNode, simpleNode, scope };
   }

   public static final Object[] pattern_ControlFlowBuilder_3_3_LookupTargetNode_blackBF(Edge outgoingEdge)
   {
      Node targetNode = outgoingEdge.getTarget();
      if (targetNode != null)
      {
         return new Object[] { outgoingEdge, targetNode };
      }

      return null;
   }

   public static final void pattern_ControlFlowBuilder_3_4_TraverseSimpleNodeDescendants_expressionBBBB(ControlFlowBuilder _this, Scope scope, Node targetNode,
         CFNode simpleNode)
   {
      _this.lookaheadAndConnect(scope, targetNode, simpleNode);

   }

   public static final boolean pattern_ControlFlowBuilder_3_5_CheckBlockingErrors_expressionFB(Validator validator)
   {
      boolean _localVariable_0 = validator.hasFatalErrors();
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_3_6_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_3_7_HandleStumpedEdge_expressionFBBBB(ControlFlowBuilder _this, Scope scope,
         Edge outgoingEdge, CFNode simpleNode)
   {
      ValidationReport _localVariable_0 = _this.handleStumpedEdge(scope, outgoingEdge, simpleNode);
      ValidationReport _result = _localVariable_0;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_3_8_ReturnSimpleNode_blackBB(CFNode simpleNode, ValidationReport report)
   {
      return new Object[] { simpleNode, report };
   }

   public static final Object[] pattern_ControlFlowBuilder_3_8_ReturnSimpleNode_greenBB(CFNode simpleNode, ValidationReport report)
   {
      report.setResult(simpleNode);
      return new Object[] { simpleNode, report };
   }

   public static final ValidationReport pattern_ControlFlowBuilder_3_9_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_3_10_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_1_InitValidationReport_blackFBF(ControlFlowBuilder _this)
   {
      Validator validator = _this.getValidator();
      if (validator != null)
      {
         ValidationReport report = validator.getValidationReport();
         if (report != null)
         {
            return new Object[] { validator, _this, report };
         }

      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_2_LookupActivityNode_blackBFF(Edge stumpedEdge)
   {
      EObject tmpActEdge = stumpedEdge.getOrigin();
      if (tmpActEdge instanceof ActivityEdge)
      {
         ActivityEdge actEdge = (ActivityEdge) tmpActEdge;
         ActivityNode actNode = actEdge.getTarget();
         if (actNode != null)
         {
            return new Object[] { stumpedEdge, actEdge, actNode };
         }

      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_3_InitCurrentScope_bindingFB(Scope scope)
   {
      Scope currentScope = scope;
      if (currentScope != null)
      {
         return new Object[] { currentScope, scope };
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_3_InitCurrentScope_blackB(Scope currentScope)
   {
      return new Object[] { currentScope };
   }

   public static final Object[] pattern_ControlFlowBuilder_4_3_InitCurrentScope_bindingAndBlackFB(Scope scope)
   {
      Object[] result_pattern_ControlFlowBuilder_4_3_InitCurrentScope_binding = pattern_ControlFlowBuilder_4_3_InitCurrentScope_bindingFB(scope);
      if (result_pattern_ControlFlowBuilder_4_3_InitCurrentScope_binding != null)
      {
         Scope currentScope = (Scope) result_pattern_ControlFlowBuilder_4_3_InitCurrentScope_binding[0];

         Object[] result_pattern_ControlFlowBuilder_4_3_InitCurrentScope_black = pattern_ControlFlowBuilder_4_3_InitCurrentScope_blackB(currentScope);
         if (result_pattern_ControlFlowBuilder_4_3_InitCurrentScope_black != null)
         {

            return new Object[] { currentScope, scope };
         }
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_4_IsInCompoundNodeScope_blackBF(Scope currentScope)
   {
      CompoundNode compoundNode = currentScope.getParent();
      if (compoundNode != null)
      {
         return new Object[] { currentScope, compoundNode };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_5_IsRepetitionNode_bindingFB(CompoundNode compoundNode)
   {
      CompoundNode tmpRepetitionNode = compoundNode;
      if (tmpRepetitionNode instanceof RepetitionNode)
      {
         RepetitionNode repetitionNode = (RepetitionNode) tmpRepetitionNode;
         return new Object[] { repetitionNode, compoundNode };
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_5_IsRepetitionNode_blackB(RepetitionNode repetitionNode)
   {
      return new Object[] { repetitionNode };
   }

   public static final Object[] pattern_ControlFlowBuilder_4_5_IsRepetitionNode_bindingAndBlackFB(CompoundNode compoundNode)
   {
      Object[] result_pattern_ControlFlowBuilder_4_5_IsRepetitionNode_binding = pattern_ControlFlowBuilder_4_5_IsRepetitionNode_bindingFB(compoundNode);
      if (result_pattern_ControlFlowBuilder_4_5_IsRepetitionNode_binding != null)
      {
         RepetitionNode repetitionNode = (RepetitionNode) result_pattern_ControlFlowBuilder_4_5_IsRepetitionNode_binding[0];

         Object[] result_pattern_ControlFlowBuilder_4_5_IsRepetitionNode_black = pattern_ControlFlowBuilder_4_5_IsRepetitionNode_blackB(repetitionNode);
         if (result_pattern_ControlFlowBuilder_4_5_IsRepetitionNode_black != null)
         {

            return new Object[] { repetitionNode, compoundNode };
         }
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_6_LeadsToImmediateRepetitionNode_blackBB(ActivityNode actNode, RepetitionNode repetitionNode)
   {
      if (actNode.equals(repetitionNode.getOrigin()))
      {
         return new Object[] { actNode, repetitionNode };
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_7_IsIfStatementScope_blackBF(Scope scope)
   {
      CompoundNode tmpIfStatement = scope.getParent();
      if (tmpIfStatement instanceof IfStatement)
      {
         IfStatement ifStatement = (IfStatement) tmpIfStatement;
         return new Object[] { scope, ifStatement };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_8_InitNodePointer_bindingFB(IfStatement ifStatement)
   {
      CFNode nodePointer = ifStatement;
      if (nodePointer != null)
      {
         return new Object[] { nodePointer, ifStatement };
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_8_InitNodePointer_blackB(CFNode nodePointer)
   {
      return new Object[] { nodePointer };
   }

   public static final Object[] pattern_ControlFlowBuilder_4_8_InitNodePointer_bindingAndBlackFB(IfStatement ifStatement)
   {
      Object[] result_pattern_ControlFlowBuilder_4_8_InitNodePointer_binding = pattern_ControlFlowBuilder_4_8_InitNodePointer_bindingFB(ifStatement);
      if (result_pattern_ControlFlowBuilder_4_8_InitNodePointer_binding != null)
      {
         CFNode nodePointer = (CFNode) result_pattern_ControlFlowBuilder_4_8_InitNodePointer_binding[0];

         Object[] result_pattern_ControlFlowBuilder_4_8_InitNodePointer_black = pattern_ControlFlowBuilder_4_8_InitNodePointer_blackB(nodePointer);
         if (result_pattern_ControlFlowBuilder_4_8_InitNodePointer_black != null)
         {

            return new Object[] { nodePointer, ifStatement };
         }
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_9_HasSkippedControlFlowNode_blackFB(CFNode nodePointer)
   {
      CFNode skippedNode = nodePointer.getNext();
      if (skippedNode != null)
      {
         if (!nodePointer.equals(skippedNode))
         {
            return new Object[] { skippedNode, nodePointer };
         }
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_10_LookupScope_blackBF(CFNode nodePointer)
   {
      Scope scopePointer = nodePointer.getScope();
      if (scopePointer != null)
      {
         return new Object[] { nodePointer, scopePointer };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_11_IsLoopHeaderReached_blackBB(RepetitionNode repetitionNode, Scope scopePointer)
   {
      if (repetitionNode.equals(scopePointer.getParent()))
      {
         return new Object[] { repetitionNode, scopePointer };
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_12_HandleIfStatementNodeInRepetition_blackBB(CFNode sourceControlFlowNode,
         RepetitionNode repetitionNode)
   {
      if (!repetitionNode.equals(sourceControlFlowNode))
      {
         return new Object[] { sourceControlFlowNode, repetitionNode };
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_12_HandleIfStatementNodeInRepetition_greenBB(CFNode sourceControlFlowNode,
         RepetitionNode repetitionNode)
   {
      repetitionNode.getLastNodes().add(sourceControlFlowNode);
      return new Object[] { sourceControlFlowNode, repetitionNode };
   }

   public static final ValidationReport pattern_ControlFlowBuilder_4_13_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_14_HasParentScope_blackBF(Scope scopePointer)
   {
      CompoundNode parentCompoundNodePointer = scopePointer.getParent();
      if (parentCompoundNodePointer != null)
      {
         return new Object[] { scopePointer, parentCompoundNodePointer };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_15_UpdateNodePointer_bindingFB(CompoundNode parentCompoundNodePointer)
   {
      CFNode nodePointer = parentCompoundNodePointer;
      if (nodePointer != null)
      {
         return new Object[] { nodePointer, parentCompoundNodePointer };
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_15_UpdateNodePointer_blackB(CFNode nodePointer)
   {
      return new Object[] { nodePointer };
   }

   public static final Object[] pattern_ControlFlowBuilder_4_15_UpdateNodePointer_bindingAndBlackFB(CompoundNode parentCompoundNodePointer)
   {
      Object[] result_pattern_ControlFlowBuilder_4_15_UpdateNodePointer_binding = pattern_ControlFlowBuilder_4_15_UpdateNodePointer_bindingFB(
            parentCompoundNodePointer);
      if (result_pattern_ControlFlowBuilder_4_15_UpdateNodePointer_binding != null)
      {
         CFNode nodePointer = (CFNode) result_pattern_ControlFlowBuilder_4_15_UpdateNodePointer_binding[0];

         Object[] result_pattern_ControlFlowBuilder_4_15_UpdateNodePointer_black = pattern_ControlFlowBuilder_4_15_UpdateNodePointer_blackB(nodePointer);
         if (result_pattern_ControlFlowBuilder_4_15_UpdateNodePointer_black != null)
         {

            return new Object[] { nodePointer, parentCompoundNodePointer };
         }
      }
      return null;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_4_16_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_17_CreateContinueStatement_greenF()
   {
      ContinueStatement continueStatement = DemoclesFactory.eINSTANCE.createContinueStatement();
      return new Object[] { continueStatement };
   }

   public static final Object[] pattern_ControlFlowBuilder_4_18_LookupLastControlFlowNodeIfExists_black_nac_0B(CFNode lastNode)
   {
      CFNode nacNode = lastNode.getNext();
      if (nacNode != null)
      {
         if (!lastNode.equals(nacNode))
         {
            return new Object[] { lastNode };
         }
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_18_LookupLastControlFlowNodeIfExists_blackBF(Scope scope)
   {
      for (CFNode lastNode : scope.getContents())
      {
         if (pattern_ControlFlowBuilder_4_18_LookupLastControlFlowNodeIfExists_black_nac_0B(lastNode) == null)
         {
            return new Object[] { scope, lastNode };
         }
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_19_AppendContinueStatement_blackBBB(Scope scope, CFNode lastNode,
         ContinueStatement continueStatement)
   {
      if (!continueStatement.equals(lastNode))
      {
         return new Object[] { scope, lastNode, continueStatement };
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_19_AppendContinueStatement_greenBBB(Scope scope, CFNode lastNode,
         ContinueStatement continueStatement)
   {
      scope.getContents().add(continueStatement);
      lastNode.setNext(continueStatement);
      return new Object[] { scope, lastNode, continueStatement };
   }

   public static final Object[] pattern_ControlFlowBuilder_4_20_AddContinueStatementToScope_blackBB(Scope scope, ContinueStatement continueStatement)
   {
      return new Object[] { scope, continueStatement };
   }

   public static final Object[] pattern_ControlFlowBuilder_4_20_AddContinueStatementToScope_greenBB(Scope scope, ContinueStatement continueStatement)
   {
      scope.getContents().add(continueStatement);
      return new Object[] { scope, continueStatement };
   }

   public static final Object[] pattern_ControlFlowBuilder_4_21_ConnectContinueStatementToLoopHeader_blackBB(RepetitionNode repetitionNode,
         ContinueStatement continueStatement)
   {
      return new Object[] { repetitionNode, continueStatement };
   }

   public static final Object[] pattern_ControlFlowBuilder_4_21_ConnectContinueStatementToLoopHeader_greenBB(RepetitionNode repetitionNode,
         ContinueStatement continueStatement)
   {
      repetitionNode.getLastNodes().add(continueStatement);
      return new Object[] { repetitionNode, continueStatement };
   }

   public static final ValidationReport pattern_ControlFlowBuilder_4_22_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_23_HandleLastNodeInRepetition_blackBB(RepetitionNode repetitionNode, CFNode sourceControlFlowNode)
   {
      if (!repetitionNode.equals(sourceControlFlowNode))
      {
         return new Object[] { repetitionNode, sourceControlFlowNode };
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_23_HandleLastNodeInRepetition_greenBB(RepetitionNode repetitionNode, CFNode sourceControlFlowNode)
   {
      repetitionNode.getLastNodes().add(sourceControlFlowNode);
      return new Object[] { repetitionNode, sourceControlFlowNode };
   }

   public static final ValidationReport pattern_ControlFlowBuilder_4_24_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_25_HasParentCompoundNode_blackFBF(CompoundNode compoundNode)
   {
      Scope localParentScope = compoundNode.getScope();
      if (localParentScope != null)
      {
         CompoundNode parentCompoundNode = localParentScope.getParent();
         if (parentCompoundNode != null)
         {
            if (!compoundNode.equals(parentCompoundNode))
            {
               return new Object[] { localParentScope, compoundNode, parentCompoundNode };
            }
         }

      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_26_UpdateCompoundNode_bindingFB(CompoundNode parentCompoundNode)
   {
      CompoundNode compoundNode = parentCompoundNode;
      if (compoundNode != null)
      {
         return new Object[] { compoundNode, parentCompoundNode };
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_26_UpdateCompoundNode_blackB(CompoundNode compoundNode)
   {
      return new Object[] { compoundNode };
   }

   public static final Object[] pattern_ControlFlowBuilder_4_26_UpdateCompoundNode_bindingAndBlackFB(CompoundNode parentCompoundNode)
   {
      Object[] result_pattern_ControlFlowBuilder_4_26_UpdateCompoundNode_binding = pattern_ControlFlowBuilder_4_26_UpdateCompoundNode_bindingFB(
            parentCompoundNode);
      if (result_pattern_ControlFlowBuilder_4_26_UpdateCompoundNode_binding != null)
      {
         CompoundNode compoundNode = (CompoundNode) result_pattern_ControlFlowBuilder_4_26_UpdateCompoundNode_binding[0];

         Object[] result_pattern_ControlFlowBuilder_4_26_UpdateCompoundNode_black = pattern_ControlFlowBuilder_4_26_UpdateCompoundNode_blackB(compoundNode);
         if (result_pattern_ControlFlowBuilder_4_26_UpdateCompoundNode_black != null)
         {

            return new Object[] { compoundNode, parentCompoundNode };
         }
      }
      return null;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_4_27_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_28_LeadsToInvalidCompoundNode_blackBB(CompoundNode compoundNode, ActivityNode actNode)
   {
      if (actNode.equals(compoundNode.getOrigin()))
      {
         return new Object[] { compoundNode, actNode };
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_29_ThenOrElseBranchLeadsToNotImmediateLoop_blackBB(ActivityEdge actEdge, ValidationReport report)
   {
      return new Object[] { actEdge, report };
   }

   public static final Object[] pattern_ControlFlowBuilder_4_29_ThenOrElseBranchLeadsToNotImmediateLoop_greenBBFB(ActivityEdge actEdge, ValidationReport report,
         Validator validator)
   {
      ErrorMessage errorMessage = ResultFactory.eINSTANCE.createErrorMessage();
      Severity errorMessage_severity_prime = Severity.FATAL;
      String _localVariable_0 = validator.lookupErrorMessage(Errors.THEN_ELSE_BRANCH_INVALID_LOOP_CONTAINMENT);
      report.getErrorMessages().add(errorMessage);
      errorMessage.getLocation().add(actEdge);
      errorMessage.setSeverity(errorMessage_severity_prime);
      String errorMessage_id_prime = _localVariable_0;
      errorMessage.setId(errorMessage_id_prime);
      return new Object[] { actEdge, report, errorMessage, validator };
   }

   public static final ValidationReport pattern_ControlFlowBuilder_4_30_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_31_LookupParentScope_blackBF(CompoundNode compoundNode)
   {
      Scope parentScope = compoundNode.getScope();
      if (parentScope != null)
      {
         return new Object[] { compoundNode, parentScope };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_32_UpdateCurrentScope_bindingFB(Scope parentScope)
   {
      Scope currentScope = parentScope;
      if (currentScope != null)
      {
         return new Object[] { currentScope, parentScope };
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_4_32_UpdateCurrentScope_blackB(Scope currentScope)
   {
      return new Object[] { currentScope };
   }

   public static final Object[] pattern_ControlFlowBuilder_4_32_UpdateCurrentScope_bindingAndBlackFB(Scope parentScope)
   {
      Object[] result_pattern_ControlFlowBuilder_4_32_UpdateCurrentScope_binding = pattern_ControlFlowBuilder_4_32_UpdateCurrentScope_bindingFB(parentScope);
      if (result_pattern_ControlFlowBuilder_4_32_UpdateCurrentScope_binding != null)
      {
         Scope currentScope = (Scope) result_pattern_ControlFlowBuilder_4_32_UpdateCurrentScope_binding[0];

         Object[] result_pattern_ControlFlowBuilder_4_32_UpdateCurrentScope_black = pattern_ControlFlowBuilder_4_32_UpdateCurrentScope_blackB(currentScope);
         if (result_pattern_ControlFlowBuilder_4_32_UpdateCurrentScope_black != null)
         {

            return new Object[] { currentScope, parentScope };
         }
      }
      return null;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_4_33_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_5_1_LookupValidator_blackFFB(ControlFlowBuilder _this)
   {
      Validator validator = _this.getValidator();
      if (validator != null)
      {
         ValidationReport report = validator.getValidationReport();
         if (report != null)
         {
            return new Object[] { validator, report, _this };
         }

      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_5_2_LookupTailLoopEdgeTarget_blackFB(Edge tailLoopEdge)
   {
      Node tailLoopEdgeTarget = tailLoopEdge.getTarget();
      if (tailLoopEdgeTarget != null)
      {
         return new Object[] { tailLoopEdgeTarget, tailLoopEdge };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_5_3_SearchLargestIntervalEdge_bindingFBBB(ControlFlowBuilder _this, Node node,
         Node tailLoopEdgeTarget)
   {
      Edge _localVariable_0 = _this.findLargestBackwardEdgeInterval(node, tailLoopEdgeTarget);
      Edge backwardEdge = _localVariable_0;
      if (backwardEdge != null)
      {
         return new Object[] { backwardEdge, _this, node, tailLoopEdgeTarget };
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_5_3_SearchLargestIntervalEdge_blackFB(Edge backwardEdge)
   {
      Node tailConditionNode = backwardEdge.getSource();
      if (tailConditionNode != null)
      {
         return new Object[] { tailConditionNode, backwardEdge };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_5_3_SearchLargestIntervalEdge_bindingAndBlackFFBBB(ControlFlowBuilder _this, Node node,
         Node tailLoopEdgeTarget)
   {
      Object[] result_pattern_ControlFlowBuilder_5_3_SearchLargestIntervalEdge_binding = pattern_ControlFlowBuilder_5_3_SearchLargestIntervalEdge_bindingFBBB(
            _this, node, tailLoopEdgeTarget);
      if (result_pattern_ControlFlowBuilder_5_3_SearchLargestIntervalEdge_binding != null)
      {
         Edge backwardEdge = (Edge) result_pattern_ControlFlowBuilder_5_3_SearchLargestIntervalEdge_binding[0];

         Object[] result_pattern_ControlFlowBuilder_5_3_SearchLargestIntervalEdge_black = pattern_ControlFlowBuilder_5_3_SearchLargestIntervalEdge_blackFB(
               backwardEdge);
         if (result_pattern_ControlFlowBuilder_5_3_SearchLargestIntervalEdge_black != null)
         {
            Node tailConditionNode = (Node) result_pattern_ControlFlowBuilder_5_3_SearchLargestIntervalEdge_black[0];

            return new Object[] { tailConditionNode, backwardEdge, _this, node, tailLoopEdgeTarget };
         }
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_5_4_CheckTailExitEdge_blackFB(Node tailConditionNode)
   {
      for (Edge tailExitEdge : tailConditionNode.getOutgoing())
      {
         EdgeType tailExitEdge_type = tailExitEdge.getType();
         if (tailExitEdge_type.equals(EdgeType.TREE_EDGE))
         {
            return new Object[] { tailExitEdge, tailConditionNode };
         }

      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_5_5_CreateTailControlledLoop_blackBBF(Scope scope, Node tailConditionNode)
   {
      EObject tmpActTailNode = tailConditionNode.getOrigin();
      if (tmpActTailNode instanceof ActivityNode)
      {
         ActivityNode actTailNode = (ActivityNode) tmpActTailNode;
         return new Object[] { scope, tailConditionNode, actTailNode };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_5_5_CreateTailControlledLoop_greenBFFB(Scope scope, ActivityNode actTailNode)
   {
      TailControlledLoop tailControlledLoop = DemoclesFactory.eINSTANCE.createTailControlledLoop();
      Scope tailControlledLoopScope = DemoclesFactory.eINSTANCE.createScope();
      scope.getContents().add(tailControlledLoop);
      tailControlledLoop.setOrigin(actTailNode);
      tailControlledLoopScope.setParent(tailControlledLoop);
      return new Object[] { scope, tailControlledLoop, tailControlledLoopScope, actTailNode };
   }

   public static final Object[] pattern_ControlFlowBuilder_5_6_CheckTailExitEdgeTarget_blackBF(Edge tailExitEdge)
   {
      Node tailExitEdgeTarget = tailExitEdge.getTarget();
      if (tailExitEdgeTarget != null)
      {
         return new Object[] { tailExitEdge, tailExitEdgeTarget };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_5_7_InitializeCrossEdgeAnalysisForTailLoop_blackBBB(Validator validator, Node tailExitEdgeTarget,
         Node node)
   {
      if (!node.equals(tailExitEdgeTarget))
      {
         return new Object[] { validator, tailExitEdgeTarget, node };
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_5_7_InitializeCrossEdgeAnalysisForTailLoop_greenBBFFFB(Validator validator, Node tailExitEdgeTarget,
         Node node)
   {
      TreeEdgeNavigator treeEdgeNavigator = ControlflowFactory.eINSTANCE.createTreeEdgeNavigator();
      SubTreeTester lowerTreeTester = ControlflowFactory.eINSTANCE.createSubTreeTester();
      CrossEdgeAnalyzer crossEdgeAnalyzer = ControlflowFactory.eINSTANCE.createCrossEdgeAnalyzer();
      boolean treeEdgeNavigator_forward_prime = Boolean.valueOf(true);
      boolean lowerTreeTester_includeRoot_prime = Boolean.valueOf(true);
      treeEdgeNavigator.setTerminalNode(tailExitEdgeTarget);
      lowerTreeTester.setRoot(tailExitEdgeTarget);
      treeEdgeNavigator.setDelegate(crossEdgeAnalyzer);
      crossEdgeAnalyzer.setValidator(validator);
      crossEdgeAnalyzer.setLowerTreeTester(lowerTreeTester);
      crossEdgeAnalyzer.setMiddleRoot(node);
      crossEdgeAnalyzer.setDelegate(treeEdgeNavigator);
      treeEdgeNavigator.setForward(Boolean.valueOf(treeEdgeNavigator_forward_prime));
      lowerTreeTester.setIncludeRoot(Boolean.valueOf(lowerTreeTester_includeRoot_prime));
      return new Object[] { validator, tailExitEdgeTarget, treeEdgeNavigator, lowerTreeTester, crossEdgeAnalyzer, node };
   }

   public static final EObject pattern_ControlFlowBuilder_5_8_CrossEdgeAnalysisForTailLoop_expressionFBB(CrossEdgeAnalyzer crossEdgeAnalyzer, Node node)
   {
      EObject _localVariable_0 = crossEdgeAnalyzer.processNode(node);
      EObject _result = _localVariable_0;
      return _result;
   }

   public static final void pattern_ControlFlowBuilder_5_9_TraverseTailLoopDescendants_expressionBBBB(ControlFlowBuilder _this, Scope scope,
         Node tailExitEdgeTarget, TailControlledLoop tailControlledLoop)
   {
      _this.lookaheadAndConnect(scope, tailExitEdgeTarget, tailControlledLoop);

   }

   public static final boolean pattern_ControlFlowBuilder_5_10_CheckBlockingErrors2_expressionFB(Validator validator)
   {
      boolean _localVariable_0 = validator.hasFatalErrors();
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_5_11_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_5_12_HandleStumpedEdge_expressionFBBBB(ControlFlowBuilder _this, Scope scope,
         Edge tailExitEdge, TailControlledLoop tailControlledLoop)
   {
      ValidationReport _localVariable_0 = _this.handleStumpedEdge(scope, tailExitEdge, tailControlledLoop);
      ValidationReport _result = _localVariable_0;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_5_13_StumpTailControlledLoopEdges_blackBB(Node node, Edge backwardEdge)
   {
      if (node.getIncoming().contains(backwardEdge))
      {
         EdgeType backwardEdge_type = backwardEdge.getType();
         if (backwardEdge_type.equals(EdgeType.BACKWARD_EDGE))
         {
            return new Object[] { node, backwardEdge };
         }

      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_5_13_StumpTailControlledLoopEdges_redBB(Node node, Edge backwardEdge)
   {
      node.getIncoming().remove(backwardEdge);
      return new Object[] { node, backwardEdge };
   }

   public static final Object[] pattern_ControlFlowBuilder_5_13_StumpTailControlledLoopEdges_greenB(Edge backwardEdge)
   {
      EdgeType backwardEdge_type_prime = EdgeType.TREE_EDGE;
      backwardEdge.setType(backwardEdge_type_prime);
      return new Object[] { backwardEdge };
   }

   public static final Object[] pattern_ControlFlowBuilder_5_14_InitLoopTesters_blackBB(Node tailConditionNode, Node node)
   {
      if (!node.equals(tailConditionNode))
      {
         return new Object[] { tailConditionNode, node };
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_5_14_InitLoopTesters_greenBBFF(Node tailConditionNode, Node node)
   {
      SubTreeTester loopStartTester = ControlflowFactory.eINSTANCE.createSubTreeTester();
      SubTreeTester loopEndTester = ControlflowFactory.eINSTANCE.createSubTreeTester();
      boolean loopStartTester_includeRoot_prime = Boolean.valueOf(true);
      boolean loopEndTester_includeRoot_prime = Boolean.valueOf(true);
      loopStartTester.setRoot(node);
      loopEndTester.setRoot(tailConditionNode);
      loopStartTester.setIncludeRoot(Boolean.valueOf(loopStartTester_includeRoot_prime));
      loopEndTester.setIncludeRoot(Boolean.valueOf(loopEndTester_includeRoot_prime));
      return new Object[] { tailConditionNode, node, loopStartTester, loopEndTester };
   }

   public static final Iterable<Object[]> pattern_ControlFlowBuilder_5_15_ForAllIncomingEdges_blackFFB(Node tailConditionNode)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (Edge incomingEdge : tailConditionNode.getIncoming())
      {
         Node sourceNode = incomingEdge.getSource();
         if (sourceNode != null)
         {
            if (!sourceNode.equals(tailConditionNode))
            {
               EdgeType incomingEdge_type = incomingEdge.getType();
               if (!incomingEdge_type.equals(EdgeType.BACKWARD_EDGE))
               {
                  _result.add(new Object[] { incomingEdge, sourceNode, tailConditionNode });
               }

            }
         }

      }
      return _result;
   }

   public static final boolean pattern_ControlFlowBuilder_5_16_IsSourceInLoopStartSubTree_expressionFBB(SubTreeTester loopStartTester, Node sourceNode)
   {
      boolean _localVariable_0 = loopStartTester.isInSubTree(sourceNode);
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final boolean pattern_ControlFlowBuilder_5_17_IsSourceInLoopEndSubTree_expressionFBB(SubTreeTester loopEndTester, Node sourceNode)
   {
      boolean _localVariable_0 = loopEndTester.isInSubTree(sourceNode);
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_5_18_ReportInvalidLoopClosingEdge_blackBFBB(Node tailConditionNode, ValidationReport report,
         Edge incomingEdge)
   {
      if (tailConditionNode.getIncoming().contains(incomingEdge))
      {
         EObject tmpActIncomingEdge = incomingEdge.getOrigin();
         if (tmpActIncomingEdge instanceof ActivityEdge)
         {
            ActivityEdge actIncomingEdge = (ActivityEdge) tmpActIncomingEdge;
            return new Object[] { tailConditionNode, actIncomingEdge, report, incomingEdge };
         }

      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_5_18_ReportInvalidLoopClosingEdge_redBB(Node tailConditionNode, Edge incomingEdge)
   {
      tailConditionNode.getIncoming().remove(incomingEdge);
      return new Object[] { tailConditionNode, incomingEdge };
   }

   public static final Object[] pattern_ControlFlowBuilder_5_18_ReportInvalidLoopClosingEdge_greenBBFBB(ActivityEdge actIncomingEdge, ValidationReport report,
         Edge incomingEdge, Validator validator)
   {
      ErrorMessage invalidLoopClosingEdge = ResultFactory.eINSTANCE.createErrorMessage();
      Severity invalidLoopClosingEdge_severity_prime = Severity.ERROR;
      String _localVariable_0 = validator.lookupErrorMessage(Errors.LOOP_EXTERN_EDGE);
      EdgeType incomingEdge_type_prime = EdgeType.TREE_EDGE;
      report.getErrorMessages().add(invalidLoopClosingEdge);
      invalidLoopClosingEdge.getLocation().add(actIncomingEdge);
      invalidLoopClosingEdge.setSeverity(invalidLoopClosingEdge_severity_prime);
      String invalidLoopClosingEdge_id_prime = _localVariable_0;
      incomingEdge.setType(incomingEdge_type_prime);
      invalidLoopClosingEdge.setId(invalidLoopClosingEdge_id_prime);
      return new Object[] { actIncomingEdge, report, invalidLoopClosingEdge, incomingEdge, validator };
   }

   public static final Object[] pattern_ControlFlowBuilder_5_19_StumpLoopClosingIncomingEdge_blackBB(Node tailConditionNode, Edge incomingEdge)
   {
      if (tailConditionNode.getIncoming().contains(incomingEdge))
      {
         return new Object[] { tailConditionNode, incomingEdge };
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_5_19_StumpLoopClosingIncomingEdge_redBB(Node tailConditionNode, Edge incomingEdge)
   {
      tailConditionNode.getIncoming().remove(incomingEdge);
      return new Object[] { tailConditionNode, incomingEdge };
   }

   public static final Object[] pattern_ControlFlowBuilder_5_19_StumpLoopClosingIncomingEdge_greenB(Edge incomingEdge)
   {
      EdgeType incomingEdge_type_prime = EdgeType.TREE_EDGE;
      incomingEdge.setType(incomingEdge_type_prime);
      return new Object[] { incomingEdge };
   }

   public static final Object[] pattern_ControlFlowBuilder_5_20_FujabaHack_blackBBBF(Node tailConditionNode, Edge incomingEdge, ValidationReport report)
   {
      if (tailConditionNode.getIncoming().contains(incomingEdge))
      {
         EObject tmpActIncomingEdgeHack = incomingEdge.getOrigin();
         if (tmpActIncomingEdgeHack instanceof ActivityEdge)
         {
            ActivityEdge actIncomingEdgeHack = (ActivityEdge) tmpActIncomingEdgeHack;
            return new Object[] { tailConditionNode, incomingEdge, report, actIncomingEdgeHack };
         }

      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_5_20_FujabaHack_redBB(Node tailConditionNode, Edge incomingEdge)
   {
      tailConditionNode.getIncoming().remove(incomingEdge);
      return new Object[] { tailConditionNode, incomingEdge };
   }

   public static final Object[] pattern_ControlFlowBuilder_5_20_FujabaHack_greenBBBFB(Edge incomingEdge, ValidationReport report,
         ActivityEdge actIncomingEdgeHack, Validator validator)
   {
      ErrorMessage invalidLoopClosingEdgeHack = ResultFactory.eINSTANCE.createErrorMessage();
      EdgeType incomingEdge_type_prime = EdgeType.TREE_EDGE;
      Severity invalidLoopClosingEdgeHack_severity_prime = Severity.ERROR;
      String _localVariable_0 = validator.lookupErrorMessage(Errors.LOOP_EXTERN_EDGE);
      report.getErrorMessages().add(invalidLoopClosingEdgeHack);
      invalidLoopClosingEdgeHack.getLocation().add(actIncomingEdgeHack);
      incomingEdge.setType(incomingEdge_type_prime);
      invalidLoopClosingEdgeHack.setSeverity(invalidLoopClosingEdgeHack_severity_prime);
      String invalidLoopClosingEdgeHack_id_prime = _localVariable_0;
      invalidLoopClosingEdgeHack.setId(invalidLoopClosingEdgeHack_id_prime);
      return new Object[] { incomingEdge, report, actIncomingEdgeHack, invalidLoopClosingEdgeHack, validator };
   }

   public static final void pattern_ControlFlowBuilder_5_21_TraverseTailControlledLoop_expressionBBB(ControlFlowBuilder _this, Scope tailControlledLoopScope,
         Node node)
   {
      _this.lookahead(tailControlledLoopScope, node);

   }

   public static final boolean pattern_ControlFlowBuilder_5_22_CheckBlockingErrors1_expressionFB(Validator validator)
   {
      boolean _localVariable_0 = validator.hasFatalErrors();
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_5_23_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_5_24_LoopExitsBySuccess_blackBF(Edge tailExitEdge)
   {
      EObject tmpActTailExitEdge = tailExitEdge.getOrigin();
      if (tmpActTailExitEdge instanceof ActivityEdge)
      {
         ActivityEdge actTailExitEdge = (ActivityEdge) tmpActTailExitEdge;
         EdgeGuard actTailExitEdge_guard = actTailExitEdge.getGuard();
         if (actTailExitEdge_guard.equals(EdgeGuard.SUCCESS))
         {
            return new Object[] { tailExitEdge, actTailExitEdge };
         }

      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_5_25_SetLoopAlongFalse_blackB(TailControlledLoop tailControlledLoop)
   {
      return new Object[] { tailControlledLoop };
   }

   public static final Object[] pattern_ControlFlowBuilder_5_25_SetLoopAlongFalse_greenB(TailControlledLoop tailControlledLoop)
   {
      boolean tailControlledLoop_loopAlongTrue_prime = Boolean.valueOf(false);
      tailControlledLoop.setLoopAlongTrue(Boolean.valueOf(tailControlledLoop_loopAlongTrue_prime));
      return new Object[] { tailControlledLoop };
   }

   public static final Object[] pattern_ControlFlowBuilder_5_26_SetLoopAlongTrue_blackB(TailControlledLoop tailControlledLoop)
   {
      return new Object[] { tailControlledLoop };
   }

   public static final Object[] pattern_ControlFlowBuilder_5_26_SetLoopAlongTrue_greenB(TailControlledLoop tailControlledLoop)
   {
      boolean tailControlledLoop_loopAlongTrue_prime = Boolean.valueOf(true);
      tailControlledLoop.setLoopAlongTrue(Boolean.valueOf(tailControlledLoop_loopAlongTrue_prime));
      return new Object[] { tailControlledLoop };
   }

   public static final Object[] pattern_ControlFlowBuilder_5_27_ReturnTailControlledLoop_blackBB(TailControlledLoop tailControlledLoop, ValidationReport report)
   {
      return new Object[] { tailControlledLoop, report };
   }

   public static final Object[] pattern_ControlFlowBuilder_5_27_ReturnTailControlledLoop_greenBB(TailControlledLoop tailControlledLoop, ValidationReport report)
   {
      report.setResult(tailControlledLoop);
      return new Object[] { tailControlledLoop, report };
   }

   public static final ValidationReport pattern_ControlFlowBuilder_5_28_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_5_29_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_6_1_InitializeSubTreeTesters_blackBB(Node smallerRoot, Node largerRoot)
   {
      if (!largerRoot.equals(smallerRoot))
      {
         return new Object[] { smallerRoot, largerRoot };
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_6_1_InitializeSubTreeTesters_greenFBBF(Node smallerRoot, Node largerRoot)
   {
      SubTreeTester largerTreeTester = ControlflowFactory.eINSTANCE.createSubTreeTester();
      SubTreeTester smallerTreeTester = ControlflowFactory.eINSTANCE.createSubTreeTester();
      boolean largerTreeTester_includeRoot_prime = Boolean.valueOf(true);
      boolean smallerTreeTester_includeRoot_prime = Boolean.valueOf(true);
      largerTreeTester.setRoot(largerRoot);
      smallerTreeTester.setRoot(smallerRoot);
      largerTreeTester.setIncludeRoot(Boolean.valueOf(largerTreeTester_includeRoot_prime));
      smallerTreeTester.setIncludeRoot(Boolean.valueOf(smallerTreeTester_includeRoot_prime));
      return new Object[] { largerTreeTester, smallerRoot, largerRoot, smallerTreeTester };
   }

   public static final Iterable<Object[]> pattern_ControlFlowBuilder_6_2_TraverseIncomingEdges_blackFFB(Node joinNode)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (Edge incomingEdge : joinNode.getIncoming())
      {
         Node source = incomingEdge.getSource();
         if (source != null)
         {
            if (!joinNode.equals(source))
            {
               _result.add(new Object[] { source, incomingEdge, joinNode });
            }
         }

      }
      return _result;
   }

   public static final boolean pattern_ControlFlowBuilder_6_3_IsSourceInLargerSubTree_expressionFBB(SubTreeTester largerTreeTester, Node source)
   {
      boolean _localVariable_0 = largerTreeTester.isInSubTree(source);
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_6_4_ReconnectCrossEdgeFromLargerBranch_blackBB(Node joinNode, Edge incomingEdge)
   {
      if (joinNode.getIncoming().contains(incomingEdge))
      {
         EdgeType incomingEdge_type = incomingEdge.getType();
         if (incomingEdge_type.equals(EdgeType.CROSS_EDGE))
         {
            return new Object[] { joinNode, incomingEdge };
         }

      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_6_4_ReconnectCrossEdgeFromLargerBranch_redBB(Node joinNode, Edge incomingEdge)
   {
      joinNode.getIncoming().remove(incomingEdge);
      return new Object[] { joinNode, incomingEdge };
   }

   public static final Object[] pattern_ControlFlowBuilder_6_4_ReconnectCrossEdgeFromLargerBranch_greenB(Edge incomingEdge)
   {
      EdgeType incomingEdge_type_prime = EdgeType.TREE_EDGE;
      incomingEdge.setType(incomingEdge_type_prime);
      return new Object[] { incomingEdge };
   }

   public static final boolean pattern_ControlFlowBuilder_6_5_IsSourceInSmallerSubTree_expressionFBB(SubTreeTester smallerTreeTester, Node source)
   {
      boolean _localVariable_0 = smallerTreeTester.isInSubTree(source);
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_6_6_ReconnectCrossEdgeFromSmallerBranch_blackBB(Edge incomingEdge, Node joinNode)
   {
      if (joinNode.getIncoming().contains(incomingEdge))
      {
         EdgeType incomingEdge_type = incomingEdge.getType();
         if (incomingEdge_type.equals(EdgeType.CROSS_EDGE))
         {
            return new Object[] { incomingEdge, joinNode };
         }

      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_6_6_ReconnectCrossEdgeFromSmallerBranch_redBB(Edge incomingEdge, Node joinNode)
   {
      joinNode.getIncoming().remove(incomingEdge);
      return new Object[] { incomingEdge, joinNode };
   }

   public static final Object[] pattern_ControlFlowBuilder_6_6_ReconnectCrossEdgeFromSmallerBranch_greenB(Edge incomingEdge)
   {
      EdgeType incomingEdge_type_prime = EdgeType.TREE_EDGE;
      incomingEdge.setType(incomingEdge_type_prime);
      return new Object[] { incomingEdge };
   }

   public static final Object[] pattern_ControlFlowBuilder_6_7_ReconnectForwardEdgeFromSmallerBranch_blackBB(Node joinNode, Edge incomingEdge)
   {
      if (joinNode.getIncoming().contains(incomingEdge))
      {
         EdgeType incomingEdge_type = incomingEdge.getType();
         if (incomingEdge_type.equals(EdgeType.FORWARD_EDGE))
         {
            return new Object[] { joinNode, incomingEdge };
         }

      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_6_7_ReconnectForwardEdgeFromSmallerBranch_redBB(Node joinNode, Edge incomingEdge)
   {
      joinNode.getIncoming().remove(incomingEdge);
      return new Object[] { joinNode, incomingEdge };
   }

   public static final Object[] pattern_ControlFlowBuilder_6_7_ReconnectForwardEdgeFromSmallerBranch_greenB(Edge incomingEdge)
   {
      EdgeType incomingEdge_type_prime = EdgeType.TREE_EDGE;
      incomingEdge.setType(incomingEdge_type_prime);
      return new Object[] { incomingEdge };
   }

   public static final Object[] pattern_ControlFlowBuilder_6_8_ReconnectTreeEdgeFromSmallerBranch_blackBB(Edge incomingEdge, Node joinNode)
   {
      if (joinNode.getIncoming().contains(incomingEdge))
      {
         EdgeType incomingEdge_type = incomingEdge.getType();
         if (incomingEdge_type.equals(EdgeType.TREE_EDGE))
         {
            return new Object[] { incomingEdge, joinNode };
         }

      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_6_8_ReconnectTreeEdgeFromSmallerBranch_redBB(Edge incomingEdge, Node joinNode)
   {
      joinNode.getIncoming().remove(incomingEdge);
      return new Object[] { incomingEdge, joinNode };
   }

   public static final Object[] pattern_ControlFlowBuilder_7_1_IsSelfLoop_blackBF(Edge edge)
   {
      Node selfLoopNode = edge.getTarget();
      if (selfLoopNode != null)
      {
         if (selfLoopNode.getOutgoing().contains(edge))
         {
            return new Object[] { edge, selfLoopNode };
         }
      }

      return null;
   }

   public static final boolean pattern_ControlFlowBuilder_7_2_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_7_3_LookupSourceAndTargetNodes_blackBF(Edge edge)
   {
      Node analyzedNode = edge.getSource();
      if (analyzedNode != null)
      {
         return new Object[] { edge, analyzedNode };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_7_4_LookupTargetNode_blackFB(Edge edge)
   {
      Node branchRoot = edge.getTarget();
      if (branchRoot != null)
      {
         return new Object[] { branchRoot, edge };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_7_5_HasDirectLoopClosingEdge_blackFBB(Node analyzedNode, Node branchRoot)
   {
      if (!analyzedNode.equals(branchRoot))
      {
         for (Edge directLoopClosingEdge : analyzedNode.getIncoming())
         {
            if (branchRoot.getOutgoing().contains(directLoopClosingEdge))
            {
               EdgeType directLoopClosingEdge_type = directLoopClosingEdge.getType();
               if (directLoopClosingEdge_type.equals(EdgeType.BACKWARD_EDGE))
               {
                  return new Object[] { directLoopClosingEdge, analyzedNode, branchRoot };
               }

            }
         }
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_7_6_HasDirectSecondEdge_blackBFB(Node branchRoot, Edge directLoopClosingEdge)
   {
      for (Edge directSecondEdge : branchRoot.getOutgoing())
      {
         if (!directLoopClosingEdge.equals(directSecondEdge))
         {
            return new Object[] { branchRoot, directSecondEdge, directLoopClosingEdge };
         }
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_7_7_HasDirectDoubleEdge_blackBB(Edge directSecondEdge, Node analyzedNode)
   {
      if (analyzedNode.getIncoming().contains(directSecondEdge))
      {
         return new Object[] { directSecondEdge, analyzedNode };
      }
      return null;
   }

   public static final boolean pattern_ControlFlowBuilder_7_8_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final boolean pattern_ControlFlowBuilder_7_9_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_7_10_HasLoopClosingEdgeInSubTree_blackFBFB(Node analyzedNode, Node branchRoot)
   {
      if (!analyzedNode.equals(branchRoot))
      {
         int branchRoot_preTraversal = branchRoot.getPreTraversal();
         int branchRoot_postTraversal = branchRoot.getPostTraversal();
         for (Edge indirectLoopClosingEdge : analyzedNode.getIncoming())
         {
            Node sourceNode = indirectLoopClosingEdge.getSource();
            if (sourceNode != null)
            {
               if (!analyzedNode.equals(sourceNode))
               {
                  if (!branchRoot.equals(sourceNode))
                  {
                     EdgeType indirectLoopClosingEdge_type = indirectLoopClosingEdge.getType();
                     if (indirectLoopClosingEdge_type.equals(EdgeType.BACKWARD_EDGE))
                     {
                        int sourceNode_preTraversal = sourceNode.getPreTraversal();
                        if (Integer.valueOf(sourceNode_preTraversal).compareTo(Integer.valueOf(branchRoot_preTraversal)) > 0)
                        {
                           int sourceNode_postTraversal = sourceNode.getPostTraversal();
                           if (Integer.valueOf(sourceNode_postTraversal).compareTo(Integer.valueOf(branchRoot_postTraversal)) < 0)
                           {
                              return new Object[] { sourceNode, analyzedNode, indirectLoopClosingEdge, branchRoot };
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

   public static final Object[] pattern_ControlFlowBuilder_7_11_HasIndirectSecondEdge_blackBFB(Node sourceNode, Edge indirectLoopClosingEdge)
   {
      for (Edge secondEdge : sourceNode.getOutgoing())
      {
         if (!indirectLoopClosingEdge.equals(secondEdge))
         {
            return new Object[] { sourceNode, secondEdge, indirectLoopClosingEdge };
         }
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_7_12_HasIndirectDoubleEdge_blackBB(Node analyzedNode, Edge secondEdge)
   {
      if (analyzedNode.getIncoming().contains(secondEdge))
      {
         return new Object[] { analyzedNode, secondEdge };
      }
      return null;
   }

   public static final boolean pattern_ControlFlowBuilder_7_13_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final boolean pattern_ControlFlowBuilder_7_14_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final boolean pattern_ControlFlowBuilder_7_15_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final boolean pattern_ControlFlowBuilder_7_16_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final boolean pattern_ControlFlowBuilder_7_17_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_8_1_IsSelfLoop_blackBF(Edge edge)
   {
      Node selfLoopNode = edge.getTarget();
      if (selfLoopNode != null)
      {
         if (selfLoopNode.getOutgoing().contains(edge))
         {
            return new Object[] { edge, selfLoopNode };
         }
      }

      return null;
   }

   public static final boolean pattern_ControlFlowBuilder_8_2_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_8_3_LookupSourceNode_blackFB(Edge edge)
   {
      Node analyzedNode = edge.getSource();
      if (analyzedNode != null)
      {
         return new Object[] { analyzedNode, edge };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_8_4_LookupTargetNode_blackFB(Edge edge)
   {
      Node branchRoot = edge.getTarget();
      if (branchRoot != null)
      {
         return new Object[] { branchRoot, edge };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_8_5_HasDirectLoopClosingEdge_blackBBF(Node branchRoot, Node analyzedNode)
   {
      if (!analyzedNode.equals(branchRoot))
      {
         for (Edge directLoopClosingEdge : analyzedNode.getIncoming())
         {
            if (branchRoot.getOutgoing().contains(directLoopClosingEdge))
            {
               EdgeType directLoopClosingEdge_type = directLoopClosingEdge.getType();
               if (directLoopClosingEdge_type.equals(EdgeType.BACKWARD_EDGE))
               {
                  return new Object[] { branchRoot, analyzedNode, directLoopClosingEdge };
               }

            }
         }
      }
      return null;
   }

   public static final boolean pattern_ControlFlowBuilder_8_6_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_8_7_HasLoopClosingEdgeInSubTree_blackFBFB(Node analyzedNode, Node branchRoot)
   {
      if (!analyzedNode.equals(branchRoot))
      {
         int branchRoot_preTraversal = branchRoot.getPreTraversal();
         int branchRoot_postTraversal = branchRoot.getPostTraversal();
         for (Edge indirectLoopClosingEdge : analyzedNode.getIncoming())
         {
            Node sourceNode = indirectLoopClosingEdge.getSource();
            if (sourceNode != null)
            {
               if (!analyzedNode.equals(sourceNode))
               {
                  if (!branchRoot.equals(sourceNode))
                  {
                     EdgeType indirectLoopClosingEdge_type = indirectLoopClosingEdge.getType();
                     if (indirectLoopClosingEdge_type.equals(EdgeType.BACKWARD_EDGE))
                     {
                        int sourceNode_preTraversal = sourceNode.getPreTraversal();
                        if (Integer.valueOf(sourceNode_preTraversal).compareTo(Integer.valueOf(branchRoot_preTraversal)) > 0)
                        {
                           int sourceNode_postTraversal = sourceNode.getPostTraversal();
                           if (Integer.valueOf(sourceNode_postTraversal).compareTo(Integer.valueOf(branchRoot_postTraversal)) < 0)
                           {
                              return new Object[] { sourceNode, analyzedNode, indirectLoopClosingEdge, branchRoot };
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

   public static final boolean pattern_ControlFlowBuilder_8_8_expressionF()
   {
      boolean _result = Boolean.valueOf(true);
      return _result;
   }

   public static final boolean pattern_ControlFlowBuilder_8_9_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final boolean pattern_ControlFlowBuilder_8_10_expressionF()
   {
      boolean _result = Boolean.valueOf(false);
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_9_1_RefersToStopNode_blackBF(Node node)
   {
      EObject tmpStopNode = node.getOrigin();
      if (tmpStopNode instanceof StopNode)
      {
         StopNode stopNode = (StopNode) tmpStopNode;
         return new Object[] { node, stopNode };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_9_2_HasOutgoingEdge_blackBF(Node node)
   {
      for (Edge outgoingEdge : node.getOutgoing())
      {
         EdgeType outgoingEdge_type = outgoingEdge.getType();
         if (outgoingEdge_type.equals(EdgeType.TREE_EDGE))
         {
            return new Object[] { node, outgoingEdge };
         }

      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_9_4_ProcessNode_bindingFBBB(ControlFlowBuilder _this, Scope scope, Node node)
   {
      ValidationReport _localVariable_0 = _this.processNode(scope, node);
      ValidationReport report = _localVariable_0;
      if (report != null)
      {
         return new Object[] { report, _this, scope, node };
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_9_4_ProcessNode_blackBB(ValidationReport report, ControlFlowBuilder _this)
   {
      return new Object[] { report, _this };
   }

   public static final Object[] pattern_ControlFlowBuilder_9_4_ProcessNode_bindingAndBlackFBBB(ControlFlowBuilder _this, Scope scope, Node node)
   {
      Object[] result_pattern_ControlFlowBuilder_9_4_ProcessNode_binding = pattern_ControlFlowBuilder_9_4_ProcessNode_bindingFBBB(_this, scope, node);
      if (result_pattern_ControlFlowBuilder_9_4_ProcessNode_binding != null)
      {
         ValidationReport report = (ValidationReport) result_pattern_ControlFlowBuilder_9_4_ProcessNode_binding[0];

         Object[] result_pattern_ControlFlowBuilder_9_4_ProcessNode_black = pattern_ControlFlowBuilder_9_4_ProcessNode_blackBB(report, _this);
         if (result_pattern_ControlFlowBuilder_9_4_ProcessNode_black != null)
         {

            return new Object[] { report, _this, scope, node };
         }
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_9_5_RemoveResult_blackBF(ValidationReport report)
   {
      EObject tmpResult = report.getResult();
      if (tmpResult instanceof CFNode)
      {
         CFNode result = (CFNode) tmpResult;
         return new Object[] { report, result };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_9_5_RemoveResult_redBB(ValidationReport report, CFNode result)
   {
      report.setResult(null);
      return new Object[] { report, result };
   }

   public static final Object[] pattern_ControlFlowBuilder_10_1_LookupValidator_blackFB(ControlFlowBuilder _this)
   {
      Validator validator = _this.getValidator();
      if (validator != null)
      {
         return new Object[] { validator, _this };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_10_2_RefersToStopNode_blackBF(Node node)
   {
      EObject tmpStopNode = node.getOrigin();
      if (tmpStopNode instanceof StopNode)
      {
         StopNode stopNode = (StopNode) tmpStopNode;
         return new Object[] { node, stopNode };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_10_3_HasOutgoingEdge_blackBF(Node node)
   {
      for (Edge outgoingEdge : node.getOutgoing())
      {
         EdgeType outgoingEdge_type = outgoingEdge.getType();
         if (outgoingEdge_type.equals(EdgeType.TREE_EDGE))
         {
            return new Object[] { node, outgoingEdge };
         }

      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_10_5_ProcessNode_bindingFBBB(ControlFlowBuilder _this, Scope scope, Node node)
   {
      ValidationReport _localVariable_0 = _this.processNode(scope, node);
      ValidationReport report = _localVariable_0;
      if (report != null)
      {
         return new Object[] { report, _this, scope, node };
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_10_5_ProcessNode_blackB(ValidationReport report)
   {
      return new Object[] { report };
   }

   public static final Object[] pattern_ControlFlowBuilder_10_5_ProcessNode_bindingAndBlackFBBB(ControlFlowBuilder _this, Scope scope, Node node)
   {
      Object[] result_pattern_ControlFlowBuilder_10_5_ProcessNode_binding = pattern_ControlFlowBuilder_10_5_ProcessNode_bindingFBBB(_this, scope, node);
      if (result_pattern_ControlFlowBuilder_10_5_ProcessNode_binding != null)
      {
         ValidationReport report = (ValidationReport) result_pattern_ControlFlowBuilder_10_5_ProcessNode_binding[0];

         Object[] result_pattern_ControlFlowBuilder_10_5_ProcessNode_black = pattern_ControlFlowBuilder_10_5_ProcessNode_blackB(report);
         if (result_pattern_ControlFlowBuilder_10_5_ProcessNode_black != null)
         {

            return new Object[] { report, _this, scope, node };
         }
      }
      return null;
   }

   public static final boolean pattern_ControlFlowBuilder_10_6_CheckBlockingErrors_expressionFB(Validator validator)
   {
      boolean _localVariable_0 = validator.hasFatalErrors();
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_10_8_ConnectToDescendants_blackFBB(ValidationReport report, CFNode currentCFNode)
   {
      EObject tmpCfNode = report.getResult();
      if (tmpCfNode instanceof CFNode)
      {
         CFNode cfNode = (CFNode) tmpCfNode;
         if (!cfNode.equals(currentCFNode))
         {
            return new Object[] { cfNode, report, currentCFNode };
         }
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_10_8_ConnectToDescendants_redBB(CFNode cfNode, ValidationReport report)
   {
      report.setResult(null);
      return new Object[] { cfNode, report };
   }

   public static final Object[] pattern_ControlFlowBuilder_10_8_ConnectToDescendants_greenBB(CFNode cfNode, CFNode currentCFNode)
   {
      currentCFNode.setNext(cfNode);
      return new Object[] { cfNode, currentCFNode };
   }

   public static final Object[] pattern_ControlFlowBuilder_11_1_InitValidationReport_blackFBF(ControlFlowBuilder _this)
   {
      Validator validator = _this.getValidator();
      if (validator != null)
      {
         ValidationReport report = validator.getValidationReport();
         if (report != null)
         {
            return new Object[] { validator, _this, report };
         }

      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_2_IsForEachNode_blackFB(Node node)
   {
      EObject tmpActNode = node.getOrigin();
      if (tmpActNode instanceof StoryNode)
      {
         StoryNode actNode = (StoryNode) tmpActNode;
         boolean actNode_forEach = actNode.isForEach();
         if (Boolean.valueOf(actNode_forEach).equals(Boolean.valueOf(true)))
         {
            return new Object[] { actNode, node };
         }

      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_3_HandleForEachNode_bindingFBBBB(ControlFlowBuilder _this, Scope scope, Node node,
         StoryNode actNode)
   {
      ValidationReport _localVariable_0 = _this.handleForEachNode(scope, node, actNode);
      ValidationReport forEachNodeReport = _localVariable_0;
      if (forEachNodeReport != null)
      {
         return new Object[] { forEachNodeReport, _this, scope, node, actNode };
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_3_HandleForEachNode_blackB(ValidationReport forEachNodeReport)
   {
      return new Object[] { forEachNodeReport };
   }

   public static final Object[] pattern_ControlFlowBuilder_11_3_HandleForEachNode_bindingAndBlackFBBBB(ControlFlowBuilder _this, Scope scope, Node node,
         StoryNode actNode)
   {
      Object[] result_pattern_ControlFlowBuilder_11_3_HandleForEachNode_binding = pattern_ControlFlowBuilder_11_3_HandleForEachNode_bindingFBBBB(_this, scope,
            node, actNode);
      if (result_pattern_ControlFlowBuilder_11_3_HandleForEachNode_binding != null)
      {
         ValidationReport forEachNodeReport = (ValidationReport) result_pattern_ControlFlowBuilder_11_3_HandleForEachNode_binding[0];

         Object[] result_pattern_ControlFlowBuilder_11_3_HandleForEachNode_black = pattern_ControlFlowBuilder_11_3_HandleForEachNode_blackB(forEachNodeReport);
         if (result_pattern_ControlFlowBuilder_11_3_HandleForEachNode_black != null)
         {

            return new Object[] { forEachNodeReport, _this, scope, node, actNode };
         }
      }
      return null;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_11_4_expressionFB(ValidationReport forEachNodeReport)
   {
      ValidationReport _result = forEachNodeReport;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_5_IsLoopRecognized_blackBF(Node node)
   {
      for (Edge edge : node.getIncoming())
      {
         EdgeType edge_type = edge.getType();
         if (edge_type.equals(EdgeType.BACKWARD_EDGE))
         {
            return new Object[] { node, edge };
         }

      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_6_LookupFirstLoopBranch_blackBF(Node node)
   {
      for (Edge firstLoopBranchEdge : node.getOutgoing())
      {
         return new Object[] { node, firstLoopBranchEdge };
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_7_LookupSecondLoopBranch_blackFBB(Node node, Edge firstLoopBranchEdge)
   {
      for (Edge secondLoopBranchEdge : node.getOutgoing())
      {
         if (!firstLoopBranchEdge.equals(secondLoopBranchEdge))
         {
            return new Object[] { secondLoopBranchEdge, node, firstLoopBranchEdge };
         }
      }
      return null;
   }

   public static final boolean pattern_ControlFlowBuilder_11_8_IsSecondLoopBranch_expressionFBB(ControlFlowBuilder _this, Edge secondLoopBranchEdge)
   {
      boolean _localVariable_0 = _this.isLoopBranch(secondLoopBranchEdge);
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final boolean pattern_ControlFlowBuilder_11_9_IsFirstLoopBranch2_expressionFBB(ControlFlowBuilder _this, Edge firstLoopBranchEdge)
   {
      boolean _localVariable_0 = _this.isLoopBranch(firstLoopBranchEdge);
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final boolean pattern_ControlFlowBuilder_11_10_IsSecondHeadControlledLoopBranch2_expressionFBB(ControlFlowBuilder _this,
         Edge secondLoopBranchEdge)
   {
      boolean _localVariable_0 = _this.isHeadControlledLoopBranch(secondLoopBranchEdge);
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final boolean pattern_ControlFlowBuilder_11_11_IsFirstHeadControlledLoopHead_expressionFBB(ControlFlowBuilder _this, Edge firstLoopBranchEdge)
   {
      boolean _localVariable_0 = _this.isHeadControlledLoopBranch(firstLoopBranchEdge);
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_12_ReportTwoHeadControlledLoops_blackBBF(ValidationReport report, Node node)
   {
      EObject tmpTwoHeadControlledLoopHeader = node.getOrigin();
      if (tmpTwoHeadControlledLoopHeader instanceof ActivityNode)
      {
         ActivityNode twoHeadControlledLoopHeader = (ActivityNode) tmpTwoHeadControlledLoopHeader;
         return new Object[] { report, node, twoHeadControlledLoopHeader };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_12_ReportTwoHeadControlledLoops_greenBBFB(ValidationReport report,
         ActivityNode twoHeadControlledLoopHeader, Validator validator)
   {
      ErrorMessage twoHeadControlledLoopBranchesFound = ResultFactory.eINSTANCE.createErrorMessage();
      Severity twoHeadControlledLoopBranchesFound_severity_prime = Severity.FATAL;
      String _localVariable_0 = validator.lookupErrorMessage(Errors.BOTH_BRANCHES_HEAD_CONTROLLED);
      report.getErrorMessages().add(twoHeadControlledLoopBranchesFound);
      twoHeadControlledLoopBranchesFound.getLocation().add(twoHeadControlledLoopHeader);
      twoHeadControlledLoopBranchesFound.setSeverity(twoHeadControlledLoopBranchesFound_severity_prime);
      String twoHeadControlledLoopBranchesFound_id_prime = _localVariable_0;
      twoHeadControlledLoopBranchesFound.setId(twoHeadControlledLoopBranchesFound_id_prime);
      return new Object[] { report, twoHeadControlledLoopHeader, twoHeadControlledLoopBranchesFound, validator };
   }

   public static final ValidationReport pattern_ControlFlowBuilder_11_13_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_11_14_expressionFBBBB(ControlFlowBuilder _this, Scope scope, Node node,
         Edge firstLoopBranchEdge)
   {
      ValidationReport _localVariable_0 = _this.handleTailControlledLoop(scope, node, firstLoopBranchEdge);
      ValidationReport _result = _localVariable_0;
      return _result;
   }

   public static final boolean pattern_ControlFlowBuilder_11_15_IsFirstHeadControlledLoopTail_expressionFBB(ControlFlowBuilder _this, Edge firstLoopBranchEdge)
   {
      boolean _localVariable_0 = _this.isHeadControlledLoopBranch(firstLoopBranchEdge);
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_11_16_expressionFBBBB(ControlFlowBuilder _this, Scope scope, Node node,
         Edge secondLoopBranchEdge)
   {
      ValidationReport _localVariable_0 = _this.handleTailControlledLoop(scope, node, secondLoopBranchEdge);
      ValidationReport _result = _localVariable_0;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_17_ReportTwoTailControlledLoops_blackBBF(Node node, ValidationReport report)
   {
      EObject tmpTwoTailControlledLoopHeader = node.getOrigin();
      if (tmpTwoTailControlledLoopHeader instanceof ActivityNode)
      {
         ActivityNode twoTailControlledLoopHeader = (ActivityNode) tmpTwoTailControlledLoopHeader;
         return new Object[] { node, report, twoTailControlledLoopHeader };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_17_ReportTwoTailControlledLoops_greenFBBB(ValidationReport report,
         ActivityNode twoTailControlledLoopHeader, Validator validator)
   {
      ErrorMessage twoTailControlledLoopBranchesFound = ResultFactory.eINSTANCE.createErrorMessage();
      Severity twoTailControlledLoopBranchesFound_severity_prime = Severity.FATAL;
      String _localVariable_0 = validator.lookupErrorMessage(Errors.BOTH_BRANCHES_TAIL_CONTROLLED);
      twoTailControlledLoopBranchesFound.getLocation().add(twoTailControlledLoopHeader);
      report.getErrorMessages().add(twoTailControlledLoopBranchesFound);
      twoTailControlledLoopBranchesFound.setSeverity(twoTailControlledLoopBranchesFound_severity_prime);
      String twoTailControlledLoopBranchesFound_id_prime = _localVariable_0;
      twoTailControlledLoopBranchesFound.setId(twoTailControlledLoopBranchesFound_id_prime);
      return new Object[] { twoTailControlledLoopBranchesFound, report, twoTailControlledLoopHeader, validator };
   }

   public static final ValidationReport pattern_ControlFlowBuilder_11_18_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final boolean pattern_ControlFlowBuilder_11_19_IsSecondHeadControlledLoopBranch1_expressionFBB(ControlFlowBuilder _this,
         Edge secondLoopBranchEdge)
   {
      boolean _localVariable_0 = _this.isHeadControlledLoopBranch(secondLoopBranchEdge);
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_11_20_expressionFBBBB(ControlFlowBuilder _this, Scope scope, Node node,
         Edge secondLoopBranchEdge)
   {
      ValidationReport _localVariable_0 = _this.handleHeadControlledLoop(scope, node, secondLoopBranchEdge);
      ValidationReport _result = _localVariable_0;
      return _result;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_11_21_expressionFBBBB(ControlFlowBuilder _this, Scope scope, Node node,
         Edge secondLoopBranchEdge)
   {
      ValidationReport _localVariable_0 = _this.handleTailControlledLoop(scope, node, secondLoopBranchEdge);
      ValidationReport _result = _localVariable_0;
      return _result;
   }

   public static final boolean pattern_ControlFlowBuilder_11_22_IsFirstLoopBranch1_expressionFBB(ControlFlowBuilder _this, Edge firstLoopBranchEdge)
   {
      boolean _localVariable_0 = _this.isLoopBranch(firstLoopBranchEdge);
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final boolean pattern_ControlFlowBuilder_11_23_IsFirstHeadControlledLoopBranch1_expressionFBB(ControlFlowBuilder _this,
         Edge firstLoopBranchEdge)
   {
      boolean _localVariable_0 = _this.isHeadControlledLoopBranch(firstLoopBranchEdge);
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_11_24_expressionFBBBB(ControlFlowBuilder _this, Scope scope, Node node,
         Edge firstLoopBranchEdge)
   {
      ValidationReport _localVariable_0 = _this.handleHeadControlledLoop(scope, node, firstLoopBranchEdge);
      ValidationReport _result = _localVariable_0;
      return _result;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_11_25_expressionFBBBB(ControlFlowBuilder _this, Scope scope, Node node,
         Edge firstLoopBranchEdge)
   {
      ValidationReport _localVariable_0 = _this.handleTailControlledLoop(scope, node, firstLoopBranchEdge);
      ValidationReport _result = _localVariable_0;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_26_ReportInternalError_blackBBF(ValidationReport report, Node node)
   {
      EObject tmpInternalErrorLoop = node.getOrigin();
      if (tmpInternalErrorLoop instanceof ActivityNode)
      {
         ActivityNode internalErrorLoop = (ActivityNode) tmpInternalErrorLoop;
         return new Object[] { report, node, internalErrorLoop };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_26_ReportInternalError_greenBFBB(ValidationReport report, ActivityNode internalErrorLoop,
         Validator validator)
   {
      ErrorMessage internalError = ResultFactory.eINSTANCE.createErrorMessage();
      Severity internalError_severity_prime = Severity.FATAL;
      String _localVariable_0 = validator.lookupErrorMessage(Errors.LOOP_EXTERN_EDGE);
      report.getErrorMessages().add(internalError);
      internalError.getLocation().add(internalErrorLoop);
      internalError.setSeverity(internalError_severity_prime);
      String internalError_id_prime = _localVariable_0;
      internalError.setId(internalError_id_prime);
      return new Object[] { report, internalError, internalErrorLoop, validator };
   }

   public static final ValidationReport pattern_ControlFlowBuilder_11_27_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_28_LookupFirstOutgoingEdge_blackFB(Node node)
   {
      for (Edge outgoingEdge : node.getOutgoing())
      {
         EdgeType outgoingEdge_type = outgoingEdge.getType();
         if (outgoingEdge_type.equals(EdgeType.TREE_EDGE))
         {
            return new Object[] { outgoingEdge, node };
         }

      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_29_LookupSecondOutgoingEdge_blackBBF(Node node, Edge outgoingEdge)
   {
      for (Edge secondOutgoingEdge : node.getOutgoing())
      {
         if (!outgoingEdge.equals(secondOutgoingEdge))
         {
            return new Object[] { node, outgoingEdge, secondOutgoingEdge };
         }
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_30_LookupThirdOutgoingEdge_blackBFBB(Edge secondOutgoingEdge, Edge outgoingEdge, Node node)
   {
      if (!outgoingEdge.equals(secondOutgoingEdge))
      {
         for (Edge thirdOutgoingEdge : node.getOutgoing())
         {
            if (!secondOutgoingEdge.equals(thirdOutgoingEdge))
            {
               if (!outgoingEdge.equals(thirdOutgoingEdge))
               {
                  return new Object[] { secondOutgoingEdge, thirdOutgoingEdge, outgoingEdge, node };
               }
            }
         }
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_31_ReportThirdOutgoingEdge_blackBBFBBFF(Edge secondOutgoingEdge, Edge thirdOutgoingEdge,
         Edge outgoingEdge, ValidationReport report)
   {
      if (!secondOutgoingEdge.equals(thirdOutgoingEdge))
      {
         if (!outgoingEdge.equals(secondOutgoingEdge))
         {
            if (!outgoingEdge.equals(thirdOutgoingEdge))
            {
               EObject tmpActEdge2 = secondOutgoingEdge.getOrigin();
               if (tmpActEdge2 instanceof ActivityEdge)
               {
                  ActivityEdge actEdge2 = (ActivityEdge) tmpActEdge2;
                  EObject tmpActEdge3 = thirdOutgoingEdge.getOrigin();
                  if (tmpActEdge3 instanceof ActivityEdge)
                  {
                     ActivityEdge actEdge3 = (ActivityEdge) tmpActEdge3;
                     if (!actEdge2.equals(actEdge3))
                     {
                        EObject tmpActEdge1 = outgoingEdge.getOrigin();
                        if (tmpActEdge1 instanceof ActivityEdge)
                        {
                           ActivityEdge actEdge1 = (ActivityEdge) tmpActEdge1;
                           if (!actEdge1.equals(actEdge3))
                           {
                              if (!actEdge1.equals(actEdge2))
                              {
                                 return new Object[] { secondOutgoingEdge, thirdOutgoingEdge, actEdge3, outgoingEdge, report, actEdge1, actEdge2 };
                              }
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

   public static final Object[] pattern_ControlFlowBuilder_11_31_ReportThirdOutgoingEdge_greenBFBBBB(ActivityEdge actEdge3, ValidationReport report,
         ActivityEdge actEdge1, ActivityEdge actEdge2, Validator validator)
   {
      ErrorMessage thirdOutgoingEdgeFound = ResultFactory.eINSTANCE.createErrorMessage();
      Severity thirdOutgoingEdgeFound_severity_prime = Severity.FATAL;
      String _localVariable_0 = validator.lookupErrorMessage(Errors.MAX_TWO_OUTGOING_EDGES);
      thirdOutgoingEdgeFound.getLocation().add(actEdge2);
      thirdOutgoingEdgeFound.getLocation().add(actEdge1);
      thirdOutgoingEdgeFound.getLocation().add(actEdge3);
      report.getErrorMessages().add(thirdOutgoingEdgeFound);
      thirdOutgoingEdgeFound.setSeverity(thirdOutgoingEdgeFound_severity_prime);
      String thirdOutgoingEdgeFound_id_prime = _localVariable_0;
      thirdOutgoingEdgeFound.setId(thirdOutgoingEdgeFound_id_prime);
      return new Object[] { actEdge3, thirdOutgoingEdgeFound, report, actEdge1, actEdge2, validator };
   }

   public static final ValidationReport pattern_ControlFlowBuilder_11_32_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_33_IsSecondBranchEmpty_blackB(Edge secondOutgoingEdge)
   {
      EdgeType secondOutgoingEdge_type = secondOutgoingEdge.getType();
      if (secondOutgoingEdge_type.equals(EdgeType.FORWARD_EDGE))
      {
         return new Object[] { secondOutgoingEdge };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_34_CreateNodeWithEmptyBranch_blackFBB(Node node, Scope scope)
   {
      EObject tmpActEmptyBranchNode = node.getOrigin();
      if (tmpActEmptyBranchNode instanceof ActivityNode)
      {
         ActivityNode actEmptyBranchNode = (ActivityNode) tmpActEmptyBranchNode;
         return new Object[] { actEmptyBranchNode, node, scope };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_34_CreateNodeWithEmptyBranch_greenBFB(ActivityNode actEmptyBranchNode, Scope scope)
   {
      IfStatement emptyBranchNode = DemoclesFactory.eINSTANCE.createIfStatement();
      emptyBranchNode.setOrigin(actEmptyBranchNode);
      scope.getContents().add(emptyBranchNode);
      return new Object[] { actEmptyBranchNode, emptyBranchNode, scope };
   }

   public static final Object[] pattern_ControlFlowBuilder_11_35_CreateEmptySuccessScope_blackB(IfStatement emptyBranchNode)
   {
      return new Object[] { emptyBranchNode };
   }

   public static final Object[] pattern_ControlFlowBuilder_11_35_CreateEmptySuccessScope_greenFB(IfStatement emptyBranchNode)
   {
      Scope emptySuccessScope = DemoclesFactory.eINSTANCE.createScope();
      emptySuccessScope.setParent(emptyBranchNode);
      return new Object[] { emptySuccessScope, emptyBranchNode };
   }

   public static final Object[] pattern_ControlFlowBuilder_11_36_CreateEmptyFailureScope_blackB(IfStatement emptyBranchNode)
   {
      return new Object[] { emptyBranchNode };
   }

   public static final Object[] pattern_ControlFlowBuilder_11_36_CreateEmptyFailureScope_greenBF(IfStatement emptyBranchNode)
   {
      Scope emptyFailureScope = DemoclesFactory.eINSTANCE.createScope();
      emptyFailureScope.setParent(emptyBranchNode);
      return new Object[] { emptyBranchNode, emptyFailureScope };
   }

   public static final Object[] pattern_ControlFlowBuilder_11_37_HandleEmptyBranch_blackFB(Edge secondOutgoingEdge)
   {
      Node emptyBranchJoinNode = secondOutgoingEdge.getTarget();
      if (emptyBranchJoinNode != null)
      {
         return new Object[] { emptyBranchJoinNode, secondOutgoingEdge };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_37_HandleEmptyBranch_redBB(Node emptyBranchJoinNode, Edge secondOutgoingEdge)
   {
      emptyBranchJoinNode.getIncoming().remove(secondOutgoingEdge);
      return new Object[] { emptyBranchJoinNode, secondOutgoingEdge };
   }

   public static final Object[] pattern_ControlFlowBuilder_11_37_HandleEmptyBranch_greenB(Edge secondOutgoingEdge)
   {
      EdgeType secondOutgoingEdge_type_prime = EdgeType.TREE_EDGE;
      secondOutgoingEdge.setType(secondOutgoingEdge_type_prime);
      return new Object[] { secondOutgoingEdge };
   }

   public static final Object[] pattern_ControlFlowBuilder_11_38_AreBothBranchesEmpty_blackBB(Edge outgoingEdge, Node emptyBranchJoinNode)
   {
      if (emptyBranchJoinNode.getIncoming().contains(outgoingEdge))
      {
         return new Object[] { outgoingEdge, emptyBranchJoinNode };
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_39_HandleTreeEdgeInEmptyBranch_blackFBB(Node emptyBranchJoinNode, Edge secondOutgoingEdge)
   {
      for (Edge treeBranchEdge : emptyBranchJoinNode.getIncoming())
      {
         if (!secondOutgoingEdge.equals(treeBranchEdge))
         {
            EdgeType treeBranchEdge_type = treeBranchEdge.getType();
            if (treeBranchEdge_type.equals(EdgeType.TREE_EDGE))
            {
               return new Object[] { treeBranchEdge, emptyBranchJoinNode, secondOutgoingEdge };
            }

         }
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_39_HandleTreeEdgeInEmptyBranch_redBB(Edge treeBranchEdge, Node emptyBranchJoinNode)
   {
      emptyBranchJoinNode.getIncoming().remove(treeBranchEdge);
      return new Object[] { treeBranchEdge, emptyBranchJoinNode };
   }

   public static final Object[] pattern_ControlFlowBuilder_11_40_LookupNonEmptyBranchRoot_blackBF(Edge outgoingEdge)
   {
      Node nonEmptyBranchRoot = outgoingEdge.getTarget();
      if (nonEmptyBranchRoot != null)
      {
         return new Object[] { outgoingEdge, nonEmptyBranchRoot };
      }

      return null;
   }

   public static final Iterable<Object[]> pattern_ControlFlowBuilder_11_41_HandleEdgesInNonEmptyBranch1_blackFBB(Node emptyBranchJoinNode,
         Node nonEmptyBranchRoot)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      if (!emptyBranchJoinNode.equals(nonEmptyBranchRoot))
      {
         for (Edge nonEmptyBranchEdge1 : nonEmptyBranchRoot.getOutgoing())
         {
            if (emptyBranchJoinNode.getIncoming().contains(nonEmptyBranchEdge1))
            {
               _result.add(new Object[] { nonEmptyBranchEdge1, emptyBranchJoinNode, nonEmptyBranchRoot });
            }
         }
      }
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_41_HandleEdgesInNonEmptyBranch1_redBB(Edge nonEmptyBranchEdge1, Node emptyBranchJoinNode)
   {
      emptyBranchJoinNode.getIncoming().remove(nonEmptyBranchEdge1);
      return new Object[] { nonEmptyBranchEdge1, emptyBranchJoinNode };
   }

   public static final Object[] pattern_ControlFlowBuilder_11_41_HandleEdgesInNonEmptyBranch1_greenB(Edge nonEmptyBranchEdge1)
   {
      EdgeType nonEmptyBranchEdge1_type_prime = EdgeType.TREE_EDGE;
      nonEmptyBranchEdge1.setType(nonEmptyBranchEdge1_type_prime);
      return new Object[] { nonEmptyBranchEdge1 };
   }

   public static final Iterable<Object[]> pattern_ControlFlowBuilder_11_42_HandleEdgesInNonEmptyBranch2_blackBFFB(Node emptyBranchJoinNode,
         Node nonEmptyBranchRoot)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      if (!emptyBranchJoinNode.equals(nonEmptyBranchRoot))
      {
         int nonEmptyBranchRoot_preTraversal = nonEmptyBranchRoot.getPreTraversal();
         int nonEmptyBranchRoot_postTraversal = nonEmptyBranchRoot.getPostTraversal();
         for (Edge nonEmptyBranchEdge2 : emptyBranchJoinNode.getIncoming())
         {
            Node nonEmptyBranchEdgeSource = nonEmptyBranchEdge2.getSource();
            if (nonEmptyBranchEdgeSource != null)
            {
               if (!emptyBranchJoinNode.equals(nonEmptyBranchEdgeSource))
               {
                  if (!nonEmptyBranchEdgeSource.equals(nonEmptyBranchRoot))
                  {
                     int nonEmptyBranchEdgeSource_preTraversal = nonEmptyBranchEdgeSource.getPreTraversal();
                     if (Integer.valueOf(nonEmptyBranchEdgeSource_preTraversal).compareTo(Integer.valueOf(nonEmptyBranchRoot_preTraversal)) >= 0)
                     {
                        int nonEmptyBranchEdgeSource_postTraversal = nonEmptyBranchEdgeSource.getPostTraversal();
                        if (Integer.valueOf(nonEmptyBranchEdgeSource_postTraversal).compareTo(Integer.valueOf(nonEmptyBranchRoot_postTraversal)) <= 0)
                        {
                           _result.add(new Object[] { emptyBranchJoinNode, nonEmptyBranchEdge2, nonEmptyBranchEdgeSource, nonEmptyBranchRoot });
                        }

                     }

                  }
               }
            }

         }

      }
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_42_HandleEdgesInNonEmptyBranch2_redBB(Node emptyBranchJoinNode, Edge nonEmptyBranchEdge2)
   {
      emptyBranchJoinNode.getIncoming().remove(nonEmptyBranchEdge2);
      return new Object[] { emptyBranchJoinNode, nonEmptyBranchEdge2 };
   }

   public static final Object[] pattern_ControlFlowBuilder_11_42_HandleEdgesInNonEmptyBranch2_greenB(Edge nonEmptyBranchEdge2)
   {
      EdgeType nonEmptyBranchEdge2_type_prime = EdgeType.TREE_EDGE;
      nonEmptyBranchEdge2.setType(nonEmptyBranchEdge2_type_prime);
      return new Object[] { nonEmptyBranchEdge2 };
   }

   public static final void pattern_ControlFlowBuilder_11_43_TraverseEmptyBranchDescendants_expressionBBBB(ControlFlowBuilder _this, Scope scope,
         Node emptyBranchJoinNode, IfStatement emptyBranchNode)
   {
      _this.lookaheadAndConnect(scope, emptyBranchJoinNode, emptyBranchNode);

   }

   public static final boolean pattern_ControlFlowBuilder_11_44_CheckFatalErrors2_expressionFB(Validator validator)
   {
      boolean _localVariable_0 = validator.hasFatalErrors();
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_11_45_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final void pattern_ControlFlowBuilder_11_46_TraverseNonEmptyAndEmptyBranches_expressionBBBBBB(ControlFlowBuilder _this,
         IfStatement emptyBranchNode, Edge outgoingEdge, Edge secondOutgoingEdge, Scope emptySuccessScope, Scope emptyFailureScope)
   {
      _this.traverseThenAndElseBranches(emptyBranchNode, outgoingEdge, secondOutgoingEdge, emptySuccessScope, emptyFailureScope);

   }

   public static final boolean pattern_ControlFlowBuilder_11_47_CheckFatalErrors3_expressionFB(Validator validator)
   {
      boolean _localVariable_0 = validator.hasFatalErrors();
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_11_48_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_49_ReturnEmptyBranchNode_blackBB(ValidationReport report, IfStatement emptyBranchNode)
   {
      return new Object[] { report, emptyBranchNode };
   }

   public static final Object[] pattern_ControlFlowBuilder_11_49_ReturnEmptyBranchNode_greenBB(ValidationReport report, IfStatement emptyBranchNode)
   {
      report.setResult(emptyBranchNode);
      return new Object[] { report, emptyBranchNode };
   }

   public static final ValidationReport pattern_ControlFlowBuilder_11_50_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_51_IsSecondEdgeValid_blackB(Edge secondOutgoingEdge)
   {
      EdgeType secondOutgoingEdge_type = secondOutgoingEdge.getType();
      if (secondOutgoingEdge_type.equals(EdgeType.TREE_EDGE))
      {
         return new Object[] { secondOutgoingEdge };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_52_CreateRegularBranchNode_blackFBB(Scope scope, Node node)
   {
      EObject tmpActRegularBranchNode = node.getOrigin();
      if (tmpActRegularBranchNode instanceof ActivityNode)
      {
         ActivityNode actRegularBranchNode = (ActivityNode) tmpActRegularBranchNode;
         return new Object[] { actRegularBranchNode, scope, node };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_52_CreateRegularBranchNode_greenBFB(ActivityNode actRegularBranchNode, Scope scope)
   {
      IfStatement regularBranchNode = DemoclesFactory.eINSTANCE.createIfStatement();
      regularBranchNode.setOrigin(actRegularBranchNode);
      scope.getContents().add(regularBranchNode);
      return new Object[] { actRegularBranchNode, regularBranchNode, scope };
   }

   public static final Object[] pattern_ControlFlowBuilder_11_53_CreateSuccessScope_blackB(IfStatement regularBranchNode)
   {
      return new Object[] { regularBranchNode };
   }

   public static final Object[] pattern_ControlFlowBuilder_11_53_CreateSuccessScope_greenFB(IfStatement regularBranchNode)
   {
      Scope successScope = DemoclesFactory.eINSTANCE.createScope();
      successScope.setParent(regularBranchNode);
      return new Object[] { successScope, regularBranchNode };
   }

   public static final Object[] pattern_ControlFlowBuilder_11_54_CreateFailureScope_blackB(IfStatement regularBranchNode)
   {
      return new Object[] { regularBranchNode };
   }

   public static final Object[] pattern_ControlFlowBuilder_11_54_CreateFailureScope_greenBF(IfStatement regularBranchNode)
   {
      Scope failureScope = DemoclesFactory.eINSTANCE.createScope();
      failureScope.setParent(regularBranchNode);
      return new Object[] { regularBranchNode, failureScope };
   }

   public static final Object[] pattern_ControlFlowBuilder_11_55_LookupFirstTarget_blackFB(Edge outgoingEdge)
   {
      Node firstTarget = outgoingEdge.getTarget();
      if (firstTarget != null)
      {
         return new Object[] { firstTarget, outgoingEdge };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_56_LookupSecondTarget_blackBF(Edge secondOutgoingEdge)
   {
      Node secondTarget = secondOutgoingEdge.getTarget();
      if (secondTarget != null)
      {
         return new Object[] { secondOutgoingEdge, secondTarget };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_57_InitializeJoinNodeFinder_greenFF()
   {
      TreeEdgeNavigator joinNodeVisitor = ControlflowFactory.eINSTANCE.createTreeEdgeNavigator();
      JoinNodeFinder joinNodeFinder = ControlflowFactory.eINSTANCE.createJoinNodeFinder();
      boolean joinNodeVisitor_forward_prime = Boolean.valueOf(true);
      joinNodeVisitor.setDelegate(joinNodeFinder);
      joinNodeFinder.setDelegate(joinNodeVisitor);
      joinNodeVisitor.setForward(Boolean.valueOf(joinNodeVisitor_forward_prime));
      return new Object[] { joinNodeVisitor, joinNodeFinder };
   }

   public static final Object[] pattern_ControlFlowBuilder_11_58_CompareBranchPreTraversalIDs_blackBB(Node secondTarget, Node firstTarget)
   {
      if (!firstTarget.equals(secondTarget))
      {
         int secondTarget_preTraversal = secondTarget.getPreTraversal();
         int firstTarget_preTraversal = firstTarget.getPreTraversal();
         if (Integer.valueOf(secondTarget_preTraversal).compareTo(Integer.valueOf(firstTarget_preTraversal)) > 0)
         {
            return new Object[] { secondTarget, firstTarget };
         }

      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_59_JoinNodeLookupInitialization1_blackBB(JoinNodeFinder joinNodeFinder, Node secondTarget)
   {
      return new Object[] { joinNodeFinder, secondTarget };
   }

   public static final Object[] pattern_ControlFlowBuilder_11_59_JoinNodeLookupInitialization1_greenBB(JoinNodeFinder joinNodeFinder, Node secondTarget)
   {
      joinNodeFinder.setBranchRoot(secondTarget);
      return new Object[] { joinNodeFinder, secondTarget };
   }

   public static final EObject pattern_ControlFlowBuilder_11_60_JoinNodeLookup1_expressionFBB(JoinNodeFinder joinNodeFinder, Node firstTarget)
   {
      EObject _localVariable_0 = joinNodeFinder.processNode(firstTarget);
      EObject _result = _localVariable_0;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_61_JoinNodeLookupInitialization2_blackBB(JoinNodeFinder joinNodeFinder, Node firstTarget)
   {
      return new Object[] { joinNodeFinder, firstTarget };
   }

   public static final Object[] pattern_ControlFlowBuilder_11_61_JoinNodeLookupInitialization2_greenBB(JoinNodeFinder joinNodeFinder, Node firstTarget)
   {
      joinNodeFinder.setBranchRoot(firstTarget);
      return new Object[] { joinNodeFinder, firstTarget };
   }

   public static final EObject pattern_ControlFlowBuilder_11_62_JoinNodeLookup2_expressionFBB(JoinNodeFinder joinNodeFinder, Node secondTarget)
   {
      EObject _localVariable_0 = joinNodeFinder.processNode(secondTarget);
      EObject _result = _localVariable_0;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_63_LookupFirstJoinNode_blackFB(JoinNodeFinder joinNodeFinder)
   {
      for (Node joinNode : joinNodeFinder.getJoinNodes())
      {
         return new Object[] { joinNode, joinNodeFinder };
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_64_LookupSecondJoinNode_blackBBF(JoinNodeFinder joinNodeFinder, Node joinNode)
   {
      for (Node secondJoinNode : joinNodeFinder.getJoinNodes())
      {
         if (!joinNode.equals(secondJoinNode))
         {
            return new Object[] { joinNodeFinder, joinNode, secondJoinNode };
         }
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_65_ReportMultipleJoinNodes_blackB(ValidationReport report)
   {
      return new Object[] { report };
   }

   public static final Object[] pattern_ControlFlowBuilder_11_65_ReportMultipleJoinNodes_greenFBB(ValidationReport report, Validator validator)
   {
      ErrorMessage errorSecondJoinNode = ResultFactory.eINSTANCE.createErrorMessage();
      Severity errorSecondJoinNode_severity_prime = Severity.FATAL;
      String _localVariable_0 = validator.lookupErrorMessage(Errors.IFTHEN_ONLY_ONE_JOIN_NODE);
      report.getErrorMessages().add(errorSecondJoinNode);
      errorSecondJoinNode.setSeverity(errorSecondJoinNode_severity_prime);
      String errorSecondJoinNode_id_prime = _localVariable_0;
      errorSecondJoinNode.setId(errorSecondJoinNode_id_prime);
      return new Object[] { errorSecondJoinNode, report, validator };
   }

   public static final Iterable<Object[]> pattern_ControlFlowBuilder_11_66_AddAllJoinNodes_blackBBFF(ErrorMessage errorSecondJoinNode,
         JoinNodeFinder joinNodeFinder)
   {
      LinkedList<Object[]> _result = new LinkedList<Object[]>();
      for (Node joinNodes : joinNodeFinder.getJoinNodes())
      {
         EObject tmpActJoinNodes = joinNodes.getOrigin();
         if (tmpActJoinNodes instanceof ActivityNode)
         {
            ActivityNode actJoinNodes = (ActivityNode) tmpActJoinNodes;
            _result.add(new Object[] { errorSecondJoinNode, joinNodeFinder, actJoinNodes, joinNodes });
         }

      }
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_66_AddAllJoinNodes_greenBB(ErrorMessage errorSecondJoinNode, ActivityNode actJoinNodes)
   {
      errorSecondJoinNode.getLocation().add(actJoinNodes);
      return new Object[] { errorSecondJoinNode, actJoinNodes };
   }

   public static final ValidationReport pattern_ControlFlowBuilder_11_67_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_68_CompareBranchTraversalIDsAgain_blackBB(Node secondTarget, Node firstTarget)
   {
      if (!firstTarget.equals(secondTarget))
      {
         int secondTarget_preTraversal = secondTarget.getPreTraversal();
         int firstTarget_preTraversal = firstTarget.getPreTraversal();
         if (Integer.valueOf(secondTarget_preTraversal).compareTo(Integer.valueOf(firstTarget_preTraversal)) > 0)
         {
            return new Object[] { secondTarget, firstTarget };
         }

      }
      return null;
   }

   public static final void pattern_ControlFlowBuilder_11_69_ProcessIncomingEdgesOfJoinNode1_expressionBBBB(ControlFlowBuilder _this, Node joinNode,
         Node firstTarget, Node secondTarget)
   {
      _this.handleUniqueJoinNode(joinNode, firstTarget, secondTarget);

   }

   public static final Object[] pattern_ControlFlowBuilder_11_70_StumpTreeEdgeIfFirstBranchIsEmpty_blackFBB(Node firstTarget, JoinNodeFinder joinNodeFinder)
   {
      if (joinNodeFinder.getJoinNodes().contains(firstTarget))
      {
         for (Edge firstIncomingTreeEdge : firstTarget.getIncoming())
         {
            EdgeType firstIncomingTreeEdge_type = firstIncomingTreeEdge.getType();
            if (firstIncomingTreeEdge_type.equals(EdgeType.TREE_EDGE))
            {
               return new Object[] { firstIncomingTreeEdge, firstTarget, joinNodeFinder };
            }

         }
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_70_StumpTreeEdgeIfFirstBranchIsEmpty_redBB(Edge firstIncomingTreeEdge, Node firstTarget)
   {
      firstTarget.getIncoming().remove(firstIncomingTreeEdge);
      return new Object[] { firstIncomingTreeEdge, firstTarget };
   }

   public static final void pattern_ControlFlowBuilder_11_71_ProcessIncomingEdgesOfJoinNode2_expressionBBBB(ControlFlowBuilder _this, Node joinNode,
         Node secondTarget, Node firstTarget)
   {
      _this.handleUniqueJoinNode(joinNode, secondTarget, firstTarget);

   }

   public static final Object[] pattern_ControlFlowBuilder_11_72_StumpTreeEdgeIfSecondBranchIsEmpty_blackFBB(JoinNodeFinder joinNodeFinder, Node secondTarget)
   {
      if (joinNodeFinder.getJoinNodes().contains(secondTarget))
      {
         for (Edge secondIncomingTreeEdge : secondTarget.getIncoming())
         {
            EdgeType secondIncomingTreeEdge_type = secondIncomingTreeEdge.getType();
            if (secondIncomingTreeEdge_type.equals(EdgeType.TREE_EDGE))
            {
               return new Object[] { secondIncomingTreeEdge, joinNodeFinder, secondTarget };
            }

         }
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_72_StumpTreeEdgeIfSecondBranchIsEmpty_redBB(Edge secondIncomingTreeEdge, Node secondTarget)
   {
      secondTarget.getIncoming().remove(secondIncomingTreeEdge);
      return new Object[] { secondIncomingTreeEdge, secondTarget };
   }

   public static final void pattern_ControlFlowBuilder_11_73_TraverseJoinNodeDescendants_expressionBBBB(ControlFlowBuilder _this, Scope scope, Node joinNode,
         IfStatement regularBranchNode)
   {
      _this.lookaheadAndConnect(scope, joinNode, regularBranchNode);

   }

   public static final boolean pattern_ControlFlowBuilder_11_74_CheckFatalErrors4_expressionFB(Validator validator)
   {
      boolean _localVariable_0 = validator.hasFatalErrors();
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_11_75_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final void pattern_ControlFlowBuilder_11_76_TraverseThenAndElseBranches_expressionBBBBBB(ControlFlowBuilder _this,
         IfStatement regularBranchNode, Edge outgoingEdge, Edge secondOutgoingEdge, Scope successScope, Scope failureScope)
   {
      _this.traverseThenAndElseBranches(regularBranchNode, outgoingEdge, secondOutgoingEdge, successScope, failureScope);

   }

   public static final boolean pattern_ControlFlowBuilder_11_77_CheckFatalErrors5_expressionFB(Validator validator)
   {
      boolean _localVariable_0 = validator.hasFatalErrors();
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_11_78_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_79_ReturnRegularBranchNode_blackBB(IfStatement regularBranchNode, ValidationReport report)
   {
      return new Object[] { regularBranchNode, report };
   }

   public static final Object[] pattern_ControlFlowBuilder_11_79_ReturnRegularBranchNode_greenBB(IfStatement regularBranchNode, ValidationReport report)
   {
      report.setResult(regularBranchNode);
      return new Object[] { regularBranchNode, report };
   }

   public static final ValidationReport pattern_ControlFlowBuilder_11_80_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_81_ReportInvalidOutEdgeType_blackBFB(ValidationReport report, Edge secondOutgoingEdge)
   {
      EObject tmpSecondOutActEdge = secondOutgoingEdge.getOrigin();
      if (tmpSecondOutActEdge instanceof ActivityEdge)
      {
         ActivityEdge secondOutActEdge = (ActivityEdge) tmpSecondOutActEdge;
         return new Object[] { report, secondOutActEdge, secondOutgoingEdge };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_81_ReportInvalidOutEdgeType_greenFBBB(ValidationReport report, ActivityEdge secondOutActEdge,
         Validator validator)
   {
      ErrorMessage errorInvalidOutEdge = ResultFactory.eINSTANCE.createErrorMessage();
      Severity errorInvalidOutEdge_severity_prime = Severity.ERROR;
      String _localVariable_0 = validator.lookupErrorMessage(Errors.SECOND_OUT_EDGE_INVALID);
      errorInvalidOutEdge.getLocation().add(secondOutActEdge);
      report.getErrorMessages().add(errorInvalidOutEdge);
      errorInvalidOutEdge.setSeverity(errorInvalidOutEdge_severity_prime);
      String errorInvalidOutEdge_id_prime = _localVariable_0;
      errorInvalidOutEdge.setId(errorInvalidOutEdge_id_prime);
      return new Object[] { errorInvalidOutEdge, report, secondOutActEdge, validator };
   }

   public static final ValidationReport pattern_ControlFlowBuilder_11_82_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_83_HandleSimpleNode_bindingFBBBB(ControlFlowBuilder _this, Scope scope, Node node,
         Edge outgoingEdge)
   {
      ValidationReport _localVariable_0 = _this.handleSimpleNode(scope, node, outgoingEdge);
      ValidationReport simpleNodeResult = _localVariable_0;
      if (simpleNodeResult != null)
      {
         return new Object[] { simpleNodeResult, _this, scope, node, outgoingEdge };
      }
      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_83_HandleSimpleNode_blackB(ValidationReport simpleNodeResult)
   {
      return new Object[] { simpleNodeResult };
   }

   public static final Object[] pattern_ControlFlowBuilder_11_83_HandleSimpleNode_bindingAndBlackFBBBB(ControlFlowBuilder _this, Scope scope, Node node,
         Edge outgoingEdge)
   {
      Object[] result_pattern_ControlFlowBuilder_11_83_HandleSimpleNode_binding = pattern_ControlFlowBuilder_11_83_HandleSimpleNode_bindingFBBBB(_this, scope,
            node, outgoingEdge);
      if (result_pattern_ControlFlowBuilder_11_83_HandleSimpleNode_binding != null)
      {
         ValidationReport simpleNodeResult = (ValidationReport) result_pattern_ControlFlowBuilder_11_83_HandleSimpleNode_binding[0];

         Object[] result_pattern_ControlFlowBuilder_11_83_HandleSimpleNode_black = pattern_ControlFlowBuilder_11_83_HandleSimpleNode_blackB(simpleNodeResult);
         if (result_pattern_ControlFlowBuilder_11_83_HandleSimpleNode_black != null)
         {

            return new Object[] { simpleNodeResult, _this, scope, node, outgoingEdge };
         }
      }
      return null;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_11_84_expressionFB(ValidationReport simpleNodeResult)
   {
      ValidationReport _result = simpleNodeResult;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_85_CreateStopNode_blackFBBB(Scope scope, ValidationReport report, Node node)
   {
      EObject tmpActStopNode = node.getOrigin();
      if (tmpActStopNode instanceof StopNode)
      {
         StopNode actStopNode = (StopNode) tmpActStopNode;
         return new Object[] { actStopNode, scope, report, node };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_11_85_CreateStopNode_greenBBFB(StopNode actStopNode, Scope scope, ValidationReport report)
   {
      ReturnStatement stopNode = DemoclesFactory.eINSTANCE.createReturnStatement();
      scope.getContents().add(stopNode);
      stopNode.setOrigin(actStopNode);
      report.setResult(stopNode);
      return new Object[] { actStopNode, scope, stopNode, report };
   }

   public static final ValidationReport pattern_ControlFlowBuilder_11_86_expressionFB(ValidationReport report)
   {
      ValidationReport _result = report;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_12_1_LookupValidator_blackBF(ControlFlowBuilder _this)
   {
      Validator validator = _this.getValidator();
      if (validator != null)
      {
         return new Object[] { _this, validator };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_12_2_FirstTargetLookup_blackBF(Edge firstOutgoingEdge)
   {
      Node firstTargetInBranch = firstOutgoingEdge.getTarget();
      if (firstTargetInBranch != null)
      {
         return new Object[] { firstOutgoingEdge, firstTargetInBranch };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_12_3_IsFirstASuccessBranch_blackFB(Edge firstOutgoingEdge)
   {
      EObject tmpActFirstEdge = firstOutgoingEdge.getOrigin();
      if (tmpActFirstEdge instanceof ActivityEdge)
      {
         ActivityEdge actFirstEdge = (ActivityEdge) tmpActFirstEdge;
         EdgeGuard actFirstEdge_guard = actFirstEdge.getGuard();
         if (actFirstEdge_guard.equals(EdgeGuard.SUCCESS))
         {
            return new Object[] { actFirstEdge, firstOutgoingEdge };
         }

      }

      return null;
   }

   public static final void pattern_ControlFlowBuilder_12_4_TraverseFirstAsSuccessBranch_expressionBBB(ControlFlowBuilder _this, Scope successScope,
         Node firstTargetInBranch)
   {
      _this.lookahead(successScope, firstTargetInBranch);

   }

   public static final void pattern_ControlFlowBuilder_12_5_TraverseFirstAsFailureBranch_expressionBBB(ControlFlowBuilder _this, Scope failureScope,
         Node firstTargetInBranch)
   {
      _this.lookahead(failureScope, firstTargetInBranch);

   }

   public static final boolean pattern_ControlFlowBuilder_12_6_CheckBlockingErrorsAfterFirstBranch_expressionFB(Validator validator)
   {
      boolean _localVariable_0 = validator.hasFatalErrors();
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_12_8_IsFirstStumpedSuccessBranch_blackBF(Edge firstOutgoingEdge)
   {
      EObject tmpActFirstStumpedEdge = firstOutgoingEdge.getOrigin();
      if (tmpActFirstStumpedEdge instanceof ActivityEdge)
      {
         ActivityEdge actFirstStumpedEdge = (ActivityEdge) tmpActFirstStumpedEdge;
         EdgeGuard actFirstStumpedEdge_guard = actFirstStumpedEdge.getGuard();
         if (actFirstStumpedEdge_guard.equals(EdgeGuard.SUCCESS))
         {
            return new Object[] { firstOutgoingEdge, actFirstStumpedEdge };
         }

      }

      return null;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_12_9_HandleFirstStumpedEdgeInSuccessScope_expressionFBBBB(ControlFlowBuilder _this,
         Scope successScope, Edge firstOutgoingEdge, IfStatement ifStatement)
   {
      ValidationReport _localVariable_0 = _this.handleStumpedEdge(successScope, firstOutgoingEdge, ifStatement);
      ValidationReport _result = _localVariable_0;
      return _result;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_12_10_HandleFirstStumpedEdgeInFailureScope_expressionFBBBB(ControlFlowBuilder _this,
         Scope failureScope, Edge firstOutgoingEdge, IfStatement ifStatement)
   {
      ValidationReport _localVariable_0 = _this.handleStumpedEdge(failureScope, firstOutgoingEdge, ifStatement);
      ValidationReport _result = _localVariable_0;
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_12_11_SecondTargetLookup_blackFB(Edge secondOutgoingEdge)
   {
      Node secondTargetInBranch = secondOutgoingEdge.getTarget();
      if (secondTargetInBranch != null)
      {
         return new Object[] { secondTargetInBranch, secondOutgoingEdge };
      }

      return null;
   }

   public static final Object[] pattern_ControlFlowBuilder_12_12_IsSecondASuccessBranch_blackFB(Edge secondOutgoingEdge)
   {
      EObject tmpActSecondEdge = secondOutgoingEdge.getOrigin();
      if (tmpActSecondEdge instanceof ActivityEdge)
      {
         ActivityEdge actSecondEdge = (ActivityEdge) tmpActSecondEdge;
         EdgeGuard actSecondEdge_guard = actSecondEdge.getGuard();
         if (actSecondEdge_guard.equals(EdgeGuard.SUCCESS))
         {
            return new Object[] { actSecondEdge, secondOutgoingEdge };
         }

      }

      return null;
   }

   public static final void pattern_ControlFlowBuilder_12_13_TraverseSecondAsSuccessBranch_expressionBBB(ControlFlowBuilder _this, Scope successScope,
         Node secondTargetInBranch)
   {
      _this.lookahead(successScope, secondTargetInBranch);

   }

   public static final void pattern_ControlFlowBuilder_12_14_TraverseSecondAsFailureBranch_expressionBBB(ControlFlowBuilder _this, Scope failureScope,
         Node secondTargetInBranch)
   {
      _this.lookahead(failureScope, secondTargetInBranch);

   }

   public static final boolean pattern_ControlFlowBuilder_12_15_CheckBlockingErrorsAfterSecondBranch_expressionFB(Validator validator)
   {
      boolean _localVariable_0 = validator.hasFatalErrors();
      boolean _result = Boolean.valueOf(_localVariable_0);
      return _result;
   }

   public static final Object[] pattern_ControlFlowBuilder_12_17_IsSecondStumpedSuccessBranch_blackFB(Edge secondOutgoingEdge)
   {
      EObject tmpActSecondStumpedEdge = secondOutgoingEdge.getOrigin();
      if (tmpActSecondStumpedEdge instanceof ActivityEdge)
      {
         ActivityEdge actSecondStumpedEdge = (ActivityEdge) tmpActSecondStumpedEdge;
         EdgeGuard actSecondStumpedEdge_guard = actSecondStumpedEdge.getGuard();
         if (actSecondStumpedEdge_guard.equals(EdgeGuard.SUCCESS))
         {
            return new Object[] { actSecondStumpedEdge, secondOutgoingEdge };
         }

      }

      return null;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_12_18_HandleSecondStumpedEdgeInSuccessScope_expressionFBBBB(ControlFlowBuilder _this,
         Scope successScope, Edge secondOutgoingEdge, IfStatement ifStatement)
   {
      ValidationReport _localVariable_0 = _this.handleStumpedEdge(successScope, secondOutgoingEdge, ifStatement);
      ValidationReport _result = _localVariable_0;
      return _result;
   }

   public static final ValidationReport pattern_ControlFlowBuilder_12_20_HandleSecondStumpedEdgeInFailureScope_expressionFBBBB(ControlFlowBuilder _this,
         Scope failureScope, Edge secondOutgoingEdge, IfStatement ifStatement)
   {
      ValidationReport _localVariable_0 = _this.handleStumpedEdge(failureScope, secondOutgoingEdge, ifStatement);
      ValidationReport _result = _localVariable_0;
      return _result;
   }

   // <-- [user code injected with eMoflon]

   private static final Comparator<Edge> EDGE_COMPARATOR = new Comparator<Edge>() {
      @Override
      public final int compare(Edge edge1, Edge edge2)
      {
         int typeDiff = edge1.getType().getValue() - edge2.getType().getValue();
         if (typeDiff == 0)
         {
            return edge1.getSource().getPreTraversal() - edge2.getSource().getPreTraversal();
         }
         return typeDiff;
      }
   };

   // [user code injected with eMoflon] -->
} //ControlFlowBuilderImpl
