/**
 */
package org.moflon.sdm.compiler.democles.validation.scope;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Action Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.CompoundActionBuilder#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getCompoundActionBuilder()
 * @model abstract="true"
 * @generated
 */
public interface CompoundActionBuilder extends ActionBuilder
{
   /**
    * Returns the value of the '<em><b>Children</b></em>' containment reference list.
    * The list contents are of type {@link org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder}.
    * It is bidirectional and its opposite is '{@link org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder#getParent <em>Parent</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Children</em>' containment reference list.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getCompoundActionBuilder_Children()
    * @see org.moflon.sdm.compiler.democles.validation.scope.ActionBuilder#getParent
    * @model opposite="parent" containment="true"
    * @generated
    */
   EList<ActionBuilder> getChildren();
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // CompoundActionBuilder
