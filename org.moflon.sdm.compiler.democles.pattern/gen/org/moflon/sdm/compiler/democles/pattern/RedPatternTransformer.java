/**
 */
package org.moflon.sdm.compiler.democles.pattern;

import SDMLanguage.patterns.LinkVariable;
import SDMLanguage.patterns.ObjectVariable;

import org.gervarro.democles.specification.emf.Pattern;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Red Pattern Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.moflon.sdm.compiler.democles.pattern.PatternPackage#getRedPatternTransformer()
 * @model
 * @generated
 */
public interface RedPatternTransformer extends PatternTransformer
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   boolean isLinkToAdd(LinkVariable linkVariable, Pattern pattern);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   boolean isVariableToAdd(ObjectVariable objectVariable);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // RedPatternTransformer
