/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow;

import SDMLanguage.activities.Activity;
import SDMLanguage.activities.StartNode;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.Node;

import org.moflon.sdm.compiler.democles.validation.result.Severity;
import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.Validator#getBuilders <em>Builders</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.Validator#getGraph <em>Graph</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.Validator#getValidationReport <em>Validation Report</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.Validator#getStopNodeInForEachComponentSeverity <em>Stop Node In For Each Component Severity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getValidator()
 * @model
 * @generated
 */
public interface Validator extends EObject
{
   /**
    * Returns the value of the '<em><b>Builders</b></em>' reference list.
    * The list contents are of type {@link org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder}.
    * It is bidirectional and its opposite is '{@link org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder#getValidator <em>Validator</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Builders</em>' reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Builders</em>' reference list.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getValidator_Builders()
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder#getValidator
    * @model opposite="validator"
    * @generated
    */
   EList<SDMActivityGraphBuilder> getBuilders();

   /**
    * Returns the value of the '<em><b>Graph</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Graph</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Graph</em>' containment reference.
    * @see #setGraph(DFSGraph)
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getValidator_Graph()
    * @model containment="true" required="true"
    * @generated
    */
   DFSGraph getGraph();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.Validator#getGraph <em>Graph</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Graph</em>' containment reference.
    * @see #getGraph()
    * @generated
    */
   void setGraph(DFSGraph value);

   /**
    * Returns the value of the '<em><b>Validation Report</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Validation Report</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Validation Report</em>' containment reference.
    * @see #setValidationReport(ValidationReport)
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getValidator_ValidationReport()
    * @model containment="true"
    * @generated
    */
   ValidationReport getValidationReport();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.Validator#getValidationReport <em>Validation Report</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Validation Report</em>' containment reference.
    * @see #getValidationReport()
    * @generated
    */
   void setValidationReport(ValidationReport value);

   /**
    * Returns the value of the '<em><b>Stop Node In For Each Component Severity</b></em>' attribute.
    * The literals are from the enumeration {@link org.moflon.sdm.compiler.democles.validation.result.Severity}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Stop Node In For Each Component Severity</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Stop Node In For Each Component Severity</em>' attribute.
    * @see org.moflon.sdm.compiler.democles.validation.result.Severity
    * @see #setStopNodeInForEachComponentSeverity(Severity)
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getValidator_StopNodeInForEachComponentSeverity()
    * @model required="true" ordered="false"
    * @generated
    */
   Severity getStopNodeInForEachComponentSeverity();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.Validator#getStopNodeInForEachComponentSeverity <em>Stop Node In For Each Component Severity</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Stop Node In For Each Component Severity</em>' attribute.
    * @see org.moflon.sdm.compiler.democles.validation.result.Severity
    * @see #getStopNodeInForEachComponentSeverity()
    * @generated
    */
   void setStopNodeInForEachComponentSeverity(Severity value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   boolean hasFatalErrors();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   String lookupErrorMessage(Errors errorID);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void sortIncomingEdges(Node node);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   StartNode syntacticCheckWithStartNodeLookup(Activity activity);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   ValidationReport validate(Activity activity);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   ValidationReport validate(Activity activity, SDMActivityGraphBuilder builder);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // Validator
