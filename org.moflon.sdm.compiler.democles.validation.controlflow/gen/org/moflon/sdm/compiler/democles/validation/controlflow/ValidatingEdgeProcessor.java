/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow;

import org.moflon.core.dfs.EdgeProcessor;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validating Edge Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.ValidatingEdgeProcessor#getValidator <em>Validator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getValidatingEdgeProcessor()
 * @model abstract="true"
 * @generated
 */
public interface ValidatingEdgeProcessor extends EdgeProcessor
{
   /**
    * Returns the value of the '<em><b>Validator</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Validator</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Validator</em>' reference.
    * @see #setValidator(Validator)
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getValidatingEdgeProcessor_Validator()
    * @model
    * @generated
    */
   Validator getValidator();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.ValidatingEdgeProcessor#getValidator <em>Validator</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Validator</em>' reference.
    * @see #getValidator()
    * @generated
    */
   void setValidator(Validator value);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // ValidatingEdgeProcessor
