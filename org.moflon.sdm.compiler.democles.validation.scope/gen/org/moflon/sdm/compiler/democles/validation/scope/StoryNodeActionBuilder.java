/**
 */
package org.moflon.sdm.compiler.democles.validation.scope;

import org.moflon.sdm.runtime.democles.CFNode;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Story Node Action Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.StoryNodeActionBuilder#isRequiresForEach <em>Requires For Each</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getStoryNodeActionBuilder()
 * @model
 * @generated
 */
public interface StoryNodeActionBuilder extends CompoundActionBuilder
{
   /**
    * Returns the value of the '<em><b>Requires For Each</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Requires For Each</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Requires For Each</em>' attribute.
    * @see #setRequiresForEach(boolean)
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getStoryNodeActionBuilder_RequiresForEach()
    * @model required="true" ordered="false"
    * @generated
    */
   boolean isRequiresForEach();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.scope.StoryNodeActionBuilder#isRequiresForEach <em>Requires For Each</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Requires For Each</em>' attribute.
    * @see #isRequiresForEach()
    * @generated
    */
   void setRequiresForEach(boolean value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void buildAction(CFNode node);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // StoryNodeActionBuilder
