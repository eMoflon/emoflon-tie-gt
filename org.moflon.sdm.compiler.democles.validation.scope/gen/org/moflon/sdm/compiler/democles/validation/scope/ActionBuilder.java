/**
 */
package org.moflon.sdm.compiler.democles.validation.scope;

import SDMLanguage.patterns.ObjectVariable;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import org.moflon.sdm.runtime.democles.Action;
import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.CFVariable;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder#getValidator <em>Validator</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder#getParent <em>Parent</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getActionBuilder()
 * @model abstract="true"
 * @generated
 */
public interface ActionBuilder extends EObject
{
   /**
    * Returns the value of the '<em><b>Validator</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator#getActionBuilders <em>Action Builders</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Validator</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Validator</em>' container reference.
    * @see #setValidator(ScopeValidator)
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getActionBuilder_Validator()
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopeValidator#getActionBuilders
    * @model opposite="actionBuilders" required="true" transient="false"
    * @generated
    */
   ScopeValidator getValidator();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder#getValidator <em>Validator</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Validator</em>' container reference.
    * @see #getValidator()
    * @generated
    */
   void setValidator(ScopeValidator value);

   /**
    * Returns the value of the '<em><b>Parent</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.moflon.sdm.compiler.democles.validation.scope.CompoundActionBuilder#getChildren <em>Children</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parent</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Parent</em>' container reference.
    * @see #setParent(CompoundActionBuilder)
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getActionBuilder_Parent()
    * @see org.moflon.sdm.compiler.democles.validation.scope.CompoundActionBuilder#getChildren
    * @model opposite="children" transient="false"
    * @generated
    */
   CompoundActionBuilder getParent();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder#getParent <em>Parent</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Parent</em>' container reference.
    * @see #getParent()
    * @generated
    */
   void setParent(CompoundActionBuilder value);

   /**
    * Returns the value of the '<em><b>Result</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Result</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Result</em>' reference.
    * @see #setResult(Action)
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getActionBuilder_Result()
    * @model
    * @generated
    */
   Action getResult();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder#getResult <em>Result</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Result</em>' reference.
    * @see #getResult()
    * @generated
    */
   void setResult(Action value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void addAction(CFNode node, Action newAction);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void buildAction(CFNode node);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   Action lookupAction(CFNode node);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   CFVariable lookupControlFlowVariable(Action action, String variableName, EClassifier variableType);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   ScopeValidator lookupScopeValidator();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void validateVariable(Action action, CFVariable variable, ObjectVariable objectVariable);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // ActionBuilder
