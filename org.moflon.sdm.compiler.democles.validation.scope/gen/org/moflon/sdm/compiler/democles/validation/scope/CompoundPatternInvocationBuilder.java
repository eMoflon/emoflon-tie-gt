/**
 */
package org.moflon.sdm.compiler.democles.validation.scope;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound Pattern Invocation Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.CompoundPatternInvocationBuilder#getChildBuilders <em>Child Builders</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getCompoundPatternInvocationBuilder()
 * @model
 * @generated
 */
public interface CompoundPatternInvocationBuilder extends RegularPatternInvocationBuilder
{
   /**
    * Returns the value of the '<em><b>Child Builders</b></em>' containment reference list.
    * The list contents are of type {@link org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder}.
    * It is bidirectional and its opposite is '{@link org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#getParentBuilder <em>Parent Builder</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Child Builders</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Child Builders</em>' containment reference list.
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getCompoundPatternInvocationBuilder_ChildBuilders()
    * @see org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#getParentBuilder
    * @model opposite="parentBuilder" containment="true"
    * @generated
    */
   EList<RegularPatternInvocationBuilder> getChildBuilders();
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // CompoundPatternInvocationBuilder
