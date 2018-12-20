/**
 */
package org.moflon.sdm.runtime.democles;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.runtime.democles.Loop#isLoopAlongTrue <em>Loop Along True</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getLoop()
 * @model abstract="true"
 * @generated
 */
public interface Loop extends RepetitionNode
{
   /**
    * Returns the value of the '<em><b>Loop Along True</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Loop Along True</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Loop Along True</em>' attribute.
    * @see #setLoopAlongTrue(boolean)
    * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getLoop_LoopAlongTrue()
    * @model required="true" ordered="false"
    * @generated
    */
   boolean isLoopAlongTrue();

   /**
    * Sets the value of the '{@link org.moflon.sdm.runtime.democles.Loop#isLoopAlongTrue <em>Loop Along True</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Loop Along True</em>' attribute.
    * @see #isLoopAlongTrue()
    * @generated
    */
   void setLoopAlongTrue(boolean value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model kind="operation"
    * @generated
    */
   Scope getRelevantScope();
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // Loop
