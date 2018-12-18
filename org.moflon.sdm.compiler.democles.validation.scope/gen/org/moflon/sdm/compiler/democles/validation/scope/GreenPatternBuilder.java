/**
 */
package org.moflon.sdm.compiler.democles.validation.scope;

import SDMLanguage.patterns.ObjectVariable;

import org.moflon.sdm.runtime.democles.Action;
import org.moflon.sdm.runtime.democles.CFVariable;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Green Pattern Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getGreenPatternBuilder()
 * @model
 * @generated
 */
public interface GreenPatternBuilder extends RegularPatternInvocationBuilder
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void validateVariable(Action action, CFVariable variable, ObjectVariable objectVariable);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // GreenPatternBuilder
