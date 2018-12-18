/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow.impl;

import SDMLanguage.activities.ActivityEdge;
import SDMLanguage.activities.StopNode;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.moflon.core.dfs.Edge;
import org.moflon.core.dfs.EdgeProcessor;
import org.moflon.core.dfs.Node;

import org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage;
import org.moflon.sdm.compiler.democles.validation.controlflow.Errors;
import org.moflon.sdm.compiler.democles.validation.controlflow.ForEachComponentProcessor;
import org.moflon.sdm.compiler.democles.validation.controlflow.Validator;

import org.moflon.sdm.compiler.democles.validation.result.ErrorMessage;
import org.moflon.sdm.compiler.democles.validation.result.ResultFactory;
import org.moflon.sdm.compiler.democles.validation.result.Severity;
import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Each Component Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.ForEachComponentProcessorImpl#getComponentStartingNode <em>Component Starting Node</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.ForEachComponentProcessorImpl#getForEachNode <em>For Each Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForEachComponentProcessorImpl extends ValidatingEdgeProcessorImpl implements ForEachComponentProcessor
{
   /**
    * The cached value of the '{@link #getComponentStartingNode() <em>Component Starting Node</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getComponentStartingNode()
    * @generated
    * @ordered
    */
   protected Node componentStartingNode;

   /**
    * The cached value of the '{@link #getForEachNode() <em>For Each Node</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getForEachNode()
    * @generated
    * @ordered
    */
   protected Node forEachNode;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ForEachComponentProcessorImpl()
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
      return ControlflowPackage.Literals.FOR_EACH_COMPONENT_PROCESSOR;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node getComponentStartingNode()
   {
      if (componentStartingNode != null && componentStartingNode.eIsProxy())
      {
         InternalEObject oldComponentStartingNode = (InternalEObject) componentStartingNode;
         componentStartingNode = (Node) eResolveProxy(oldComponentStartingNode);
         if (componentStartingNode != oldComponentStartingNode)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlflowPackage.FOR_EACH_COMPONENT_PROCESSOR__COMPONENT_STARTING_NODE,
                     oldComponentStartingNode, componentStartingNode));
         }
      }
      return componentStartingNode;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node basicGetComponentStartingNode()
   {
      return componentStartingNode;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setComponentStartingNode(Node newComponentStartingNode)
   {
      Node oldComponentStartingNode = componentStartingNode;
      componentStartingNode = newComponentStartingNode;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.FOR_EACH_COMPONENT_PROCESSOR__COMPONENT_STARTING_NODE,
               oldComponentStartingNode, componentStartingNode));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node getForEachNode()
   {
      if (forEachNode != null && forEachNode.eIsProxy())
      {
         InternalEObject oldForEachNode = (InternalEObject) forEachNode;
         forEachNode = (Node) eResolveProxy(oldForEachNode);
         if (forEachNode != oldForEachNode)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlflowPackage.FOR_EACH_COMPONENT_PROCESSOR__FOR_EACH_NODE, oldForEachNode,
                     forEachNode));
         }
      }
      return forEachNode;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node basicGetForEachNode()
   {
      return forEachNode;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setForEachNode(Node newForEachNode)
   {
      Node oldForEachNode = forEachNode;
      forEachNode = newForEachNode;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.FOR_EACH_COMPONENT_PROCESSOR__FOR_EACH_NODE, oldForEachNode, forEachNode));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EObject postDelegateEdgeAnalysis(Edge edge, EObject delegationResult)
   {

      Object[] result1_black = ForEachComponentProcessorImpl.pattern_ForEachComponentProcessor_0_1_ValidationReportInit_blackFFB(this);
      if (result1_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      ValidationReport report = (ValidationReport) result1_black[0];
      Validator validator = (Validator) result1_black[1];

      Object[] result2_black = ForEachComponentProcessorImpl.pattern_ForEachComponentProcessor_0_2_Initialization_blackFBF(this);
      if (result2_black == null)
      {
         throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
      }
      Node componentStartNode = (Node) result2_black[0];
      Node forEachNode = (Node) result2_black[2];
      // 
      Object[] result3_black = ForEachComponentProcessorImpl.pattern_ForEachComponentProcessor_0_3_LeadsToForEachNode_blackBB(forEachNode, edge);
      if (result3_black != null)
      {
         return ForEachComponentProcessorImpl.pattern_ForEachComponentProcessor_0_4_expressionFB(delegationResult);
      } else
      {
         // 
         Object[] result5_black = ForEachComponentProcessorImpl.pattern_ForEachComponentProcessor_0_5_LeadsToComponentStartNode_blackBB(edge,
               componentStartNode);
         if (result5_black != null)
         {
            return ForEachComponentProcessorImpl.pattern_ForEachComponentProcessor_0_6_expressionFB(delegationResult);
         } else
         {

            Object[] result7_black = ForEachComponentProcessorImpl.pattern_ForEachComponentProcessor_0_7_LookupTargetNode_blackFB(edge);
            if (result7_black == null)
            {
               throw new RuntimeException("Pattern matching failed." + " Variables: " + "[edge] = " + edge + ".");
            }
            Node targetNode = (Node) result7_black[0];
            // 
            Object[] result8_black = ForEachComponentProcessorImpl.pattern_ForEachComponentProcessor_0_8_IsComponentInternalEdge_blackBB(targetNode,
                  componentStartNode);
            if (result8_black != null)
            {
               // 
               Object[] result9_black = ForEachComponentProcessorImpl.pattern_ForEachComponentProcessor_0_9_IsConnectedToAStopNode_blackBF(targetNode);
               if (result9_black != null)
               {
                  StopNode stopActivityNode = (StopNode) result9_black[1];

                  Object[] result10_black = ForEachComponentProcessorImpl.pattern_ForEachComponentProcessor_0_10_ReportInternalStopNode_blackBB(report,
                        stopActivityNode);
                  if (result10_black == null)
                  {
                     throw new RuntimeException(
                           "Pattern matching failed." + " Variables: " + "[report] = " + report + ", " + "[stopActivityNode] = " + stopActivityNode + ".");
                  }
                  ForEachComponentProcessorImpl.pattern_ForEachComponentProcessor_0_10_ReportInternalStopNode_greenFBBB(report, stopActivityNode, validator);
                  //nothing ErrorMessage internalStopNodeFound = (ErrorMessage) result10_green[0];

               } else
               {
               }
               return ForEachComponentProcessorImpl.pattern_ForEachComponentProcessor_0_11_expressionFB(delegationResult);
            } else
            {

               Object[] result12_black = ForEachComponentProcessorImpl.pattern_ForEachComponentProcessor_0_12_HandleExternalEdge_blackBB(edge, targetNode);
               if (result12_black == null)
               {
                  throw new RuntimeException("Pattern matching failed." + " Variables: " + "[edge] = " + edge + ", " + "[targetNode] = " + targetNode + ".");
               }
               ForEachComponentProcessorImpl.pattern_ForEachComponentProcessor_0_12_HandleExternalEdge_redBB(edge, targetNode);

               Object[] result13_black = ForEachComponentProcessorImpl.pattern_ForEachComponentProcessor_0_13_ReportExternalEdge_blackBBF(edge, report);
               if (result13_black == null)
               {
                  throw new RuntimeException("Pattern matching failed." + " Variables: " + "[edge] = " + edge + ", " + "[report] = " + report + ".");
               }
               ActivityEdge externalActivityEdge = (ActivityEdge) result13_black[2];
               ForEachComponentProcessorImpl.pattern_ForEachComponentProcessor_0_13_ReportExternalEdge_greenBFBB(report, externalActivityEdge, validator);
               //nothing ErrorMessage externalEdgeFound = (ErrorMessage) result13_green[1];

               return ForEachComponentProcessorImpl.pattern_ForEachComponentProcessor_0_14_expressionFB(delegationResult);
            }

         }

      }

   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EObject processEdge(Edge edge)
   {// 
      Object[] result1_black = ForEachComponentProcessorImpl.pattern_ForEachComponentProcessor_1_1_LookupDelegate_blackFB(this);
      if (result1_black != null)
      {
         EdgeProcessor delegate = (EdgeProcessor) result1_black[0];
         return ForEachComponentProcessorImpl.pattern_ForEachComponentProcessor_1_2_expressionFBBB(this, edge, delegate);
      } else
      {
         return ForEachComponentProcessorImpl.pattern_ForEachComponentProcessor_1_3_expressionF();
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
      case ControlflowPackage.FOR_EACH_COMPONENT_PROCESSOR__COMPONENT_STARTING_NODE:
         if (resolve)
            return getComponentStartingNode();
         return basicGetComponentStartingNode();
      case ControlflowPackage.FOR_EACH_COMPONENT_PROCESSOR__FOR_EACH_NODE:
         if (resolve)
            return getForEachNode();
         return basicGetForEachNode();
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
      case ControlflowPackage.FOR_EACH_COMPONENT_PROCESSOR__COMPONENT_STARTING_NODE:
         setComponentStartingNode((Node) newValue);
         return;
      case ControlflowPackage.FOR_EACH_COMPONENT_PROCESSOR__FOR_EACH_NODE:
         setForEachNode((Node) newValue);
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
      case ControlflowPackage.FOR_EACH_COMPONENT_PROCESSOR__COMPONENT_STARTING_NODE:
         setComponentStartingNode((Node) null);
         return;
      case ControlflowPackage.FOR_EACH_COMPONENT_PROCESSOR__FOR_EACH_NODE:
         setForEachNode((Node) null);
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
      case ControlflowPackage.FOR_EACH_COMPONENT_PROCESSOR__COMPONENT_STARTING_NODE:
         return componentStartingNode != null;
      case ControlflowPackage.FOR_EACH_COMPONENT_PROCESSOR__FOR_EACH_NODE:
         return forEachNode != null;
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
      case ControlflowPackage.FOR_EACH_COMPONENT_PROCESSOR___POST_DELEGATE_EDGE_ANALYSIS__EDGE_EOBJECT:
         return postDelegateEdgeAnalysis((Edge) arguments.get(0), (EObject) arguments.get(1));
      case ControlflowPackage.FOR_EACH_COMPONENT_PROCESSOR___PROCESS_EDGE__EDGE:
         return processEdge((Edge) arguments.get(0));
      }
      return super.eInvoke(operationID, arguments);
   }

   public static final Object[] pattern_ForEachComponentProcessor_0_1_ValidationReportInit_blackFFB(ForEachComponentProcessor _this)
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

   public static final Object[] pattern_ForEachComponentProcessor_0_2_Initialization_blackFBF(ForEachComponentProcessor _this)
   {
      Node forEachNode = _this.getForEachNode();
      if (forEachNode != null)
      {
         Node componentStartNode = _this.getComponentStartingNode();
         if (componentStartNode != null)
         {
            if (!componentStartNode.equals(forEachNode))
            {
               return new Object[] { componentStartNode, _this, forEachNode };
            }
         }

      }

      return null;
   }

   public static final Object[] pattern_ForEachComponentProcessor_0_3_LeadsToForEachNode_blackBB(Node forEachNode, Edge edge)
   {
      if (forEachNode.getIncoming().contains(edge))
      {
         return new Object[] { forEachNode, edge };
      }
      return null;
   }

   public static final EObject pattern_ForEachComponentProcessor_0_4_expressionFB(EObject delegationResult)
   {
      EObject _result = delegationResult;
      return _result;
   }

   public static final Object[] pattern_ForEachComponentProcessor_0_5_LeadsToComponentStartNode_blackBB(Edge edge, Node componentStartNode)
   {
      if (componentStartNode.getIncoming().contains(edge))
      {
         return new Object[] { edge, componentStartNode };
      }
      return null;
   }

   public static final EObject pattern_ForEachComponentProcessor_0_6_expressionFB(EObject delegationResult)
   {
      EObject _result = delegationResult;
      return _result;
   }

   public static final Object[] pattern_ForEachComponentProcessor_0_7_LookupTargetNode_blackFB(Edge edge)
   {
      Node targetNode = edge.getTarget();
      if (targetNode != null)
      {
         return new Object[] { targetNode, edge };
      }

      return null;
   }

   public static final Object[] pattern_ForEachComponentProcessor_0_8_IsComponentInternalEdge_blackBB(Node targetNode, Node componentStartNode)
   {
      if (!componentStartNode.equals(targetNode))
      {
         int targetNode_preTraversal = targetNode.getPreTraversal();
         int componentStartNode_preTraversal = componentStartNode.getPreTraversal();
         if (Integer.valueOf(targetNode_preTraversal).compareTo(Integer.valueOf(componentStartNode_preTraversal)) >= 0)
         {
            return new Object[] { targetNode, componentStartNode };
         }

      }
      return null;
   }

   public static final Object[] pattern_ForEachComponentProcessor_0_9_IsConnectedToAStopNode_blackBF(Node targetNode)
   {
      EObject tmpStopActivityNode = targetNode.getOrigin();
      if (tmpStopActivityNode instanceof StopNode)
      {
         StopNode stopActivityNode = (StopNode) tmpStopActivityNode;
         return new Object[] { targetNode, stopActivityNode };
      }

      return null;
   }

   public static final Object[] pattern_ForEachComponentProcessor_0_10_ReportInternalStopNode_blackBB(ValidationReport report, StopNode stopActivityNode)
   {
      return new Object[] { report, stopActivityNode };
   }

   public static final Object[] pattern_ForEachComponentProcessor_0_10_ReportInternalStopNode_greenFBBB(ValidationReport report, StopNode stopActivityNode,
         Validator validator)
   {
      ErrorMessage internalStopNodeFound = ResultFactory.eINSTANCE.createErrorMessage();
      String _localVariable_0 = validator.lookupErrorMessage(Errors.NO_STOP_NODE_IN_FOREACH_COMPONENT);
      internalStopNodeFound.getLocation().add(stopActivityNode);
      report.getErrorMessages().add(internalStopNodeFound);
      String internalStopNodeFound_id_prime = _localVariable_0;
      internalStopNodeFound.setId(internalStopNodeFound_id_prime);
      Severity validator_stopNodeInForEachComponentSeverity = validator.getStopNodeInForEachComponentSeverity();
      Severity internalStopNodeFound_severity_prime = validator_stopNodeInForEachComponentSeverity;
      internalStopNodeFound.setSeverity(internalStopNodeFound_severity_prime);
      return new Object[] { internalStopNodeFound, report, stopActivityNode, validator };

   }

   public static final EObject pattern_ForEachComponentProcessor_0_11_expressionFB(EObject delegationResult)
   {
      EObject _result = delegationResult;
      return _result;
   }

   public static final Object[] pattern_ForEachComponentProcessor_0_12_HandleExternalEdge_blackBB(Edge edge, Node targetNode)
   {
      if (targetNode.getIncoming().contains(edge))
      {
         return new Object[] { edge, targetNode };
      }
      return null;
   }

   public static final Object[] pattern_ForEachComponentProcessor_0_12_HandleExternalEdge_redBB(Edge edge, Node targetNode)
   {
      targetNode.getIncoming().remove(edge);
      return new Object[] { edge, targetNode };
   }

   public static final Object[] pattern_ForEachComponentProcessor_0_13_ReportExternalEdge_blackBBF(Edge edge, ValidationReport report)
   {
      EObject tmpExternalActivityEdge = edge.getOrigin();
      if (tmpExternalActivityEdge instanceof ActivityEdge)
      {
         ActivityEdge externalActivityEdge = (ActivityEdge) tmpExternalActivityEdge;
         return new Object[] { edge, report, externalActivityEdge };
      }

      return null;
   }

   public static final Object[] pattern_ForEachComponentProcessor_0_13_ReportExternalEdge_greenBFBB(ValidationReport report, ActivityEdge externalActivityEdge,
         Validator validator)
   {
      ErrorMessage externalEdgeFound = ResultFactory.eINSTANCE.createErrorMessage();
      Severity externalEdgeFound_severity_prime = Severity.ERROR;
      String _localVariable_0 = validator.lookupErrorMessage(Errors.NO_EDGE_OUT_OF_FOREACH_COMPONENT);
      report.getErrorMessages().add(externalEdgeFound);
      externalEdgeFound.getLocation().add(externalActivityEdge);
      externalEdgeFound.setSeverity(externalEdgeFound_severity_prime);
      String externalEdgeFound_id_prime = _localVariable_0;
      externalEdgeFound.setId(externalEdgeFound_id_prime);
      return new Object[] { report, externalEdgeFound, externalActivityEdge, validator };
   }

   public static final EObject pattern_ForEachComponentProcessor_0_14_expressionFB(EObject delegationResult)
   {
      EObject _result = delegationResult;
      return _result;
   }

   public static final Object[] pattern_ForEachComponentProcessor_1_1_LookupDelegate_blackFB(ForEachComponentProcessor _this)
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

   public static final EObject pattern_ForEachComponentProcessor_1_2_expressionFBBB(ForEachComponentProcessor _this, Edge edge, EdgeProcessor delegate)
   {
      EObject _localVariable_1 = delegate.processEdge(edge);
      EObject _localVariable_0 = _this.postDelegateEdgeAnalysis(edge, _localVariable_1);
      EObject _result = _localVariable_0;
      return _result;
   }

   public static final EObject pattern_ForEachComponentProcessor_1_3_expressionF()
   {
      EObject _result = null;
      return _result;
   }

   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //ForEachComponentProcessorImpl
