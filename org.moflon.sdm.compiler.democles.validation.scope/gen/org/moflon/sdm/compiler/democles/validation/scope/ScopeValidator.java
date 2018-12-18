/**
 */
package org.moflon.sdm.compiler.democles.validation.scope;

import SDMLanguage.patterns.LinkVariable;
import SDMLanguage.patterns.ObjectVariable;

import org.eclipse.emf.common.util.EList;

import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;

import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.CFVariable;
import org.moflon.sdm.runtime.democles.Scope;
import org.moflon.sdm.runtime.democles.UniformNoOperationVisitor;
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
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator#getValidationReport <em>Validation Report</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator#getActionBuilders <em>Action Builders</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getScopeValidator()
 * @model
 * @generated
 */
public interface ScopeValidator extends UniformNoOperationVisitor
{
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
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getScopeValidator_ValidationReport()
    * @model containment="true"
    * @generated
    */
   ValidationReport getValidationReport();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator#getValidationReport <em>Validation Report</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Validation Report</em>' containment reference.
    * @see #getValidationReport()
    * @generated
    */
   void setValidationReport(ValidationReport value);

   /**
    * Returns the value of the '<em><b>Action Builders</b></em>' containment reference list.
    * The list contents are of type {@link org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder}.
    * It is bidirectional and its opposite is '{@link org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder#getValidator <em>Validator</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Action Builders</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Action Builders</em>' containment reference list.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getScopeValidator_ActionBuilders()
    * @see org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder#getValidator
    * @model opposite="validator" containment="true"
    * @generated
    */
   EList<ActionBuilder> getActionBuilders();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void analyzeLinkVariable(CFNode node, LinkVariable linkVariable);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void analyzeObjectVariable(CFNode node, ObjectVariable objectVariable);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void checkDeletionOfBoundVariable(ObjectVariable objectVariable, CFVariable variable, CFNode node, CFNode deletionNode);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void checkRedBoundVariable(CFVariable variable, Scope scope, ObjectVariable objVar);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   boolean followsInSameScope(CFNode deletionNode, CFNode node);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   boolean isNull(CFVariable variable);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   CFVariable lookupControlFlowVariable(CFNode node, String variableName);

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
   void visitNode(CFNode node);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void visitScope(Scope scope);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // ScopeValidator
