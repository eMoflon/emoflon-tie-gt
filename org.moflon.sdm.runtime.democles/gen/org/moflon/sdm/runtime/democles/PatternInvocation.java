/**
 */
package org.moflon.sdm.runtime.democles;

import org.eclipse.emf.common.util.EList;

import org.gervarro.democles.specification.emf.Pattern;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.runtime.democles.PatternInvocation#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.moflon.sdm.runtime.democles.PatternInvocation#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getPatternInvocation()
 * @model abstract="true"
 * @generated
 */
public interface PatternInvocation extends Action
{
   /**
    * Returns the value of the '<em><b>Pattern</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Pattern</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Pattern</em>' reference.
    * @see #setPattern(Pattern)
    * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getPatternInvocation_Pattern()
    * @model required="true"
    * @generated
    */
   Pattern getPattern();

   /**
    * Sets the value of the '{@link org.moflon.sdm.runtime.democles.PatternInvocation#getPattern <em>Pattern</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Pattern</em>' reference.
    * @see #getPattern()
    * @generated
    */
   void setPattern(Pattern value);

   /**
    * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
    * The list contents are of type {@link org.moflon.sdm.runtime.democles.VariableReference}.
    * It is bidirectional and its opposite is '{@link org.moflon.sdm.runtime.democles.VariableReference#getInvocation <em>Invocation</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Parameters</em>' containment reference list.
    * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getPatternInvocation_Parameters()
    * @see org.moflon.sdm.runtime.democles.VariableReference#getInvocation
    * @model opposite="invocation" containment="true"
    * @generated
    */
   EList<VariableReference> getParameters();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   boolean hasReferencedFreeParameters();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model kind="operation"
    * @generated
    */
   boolean isMultipleMatch();
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // PatternInvocation
