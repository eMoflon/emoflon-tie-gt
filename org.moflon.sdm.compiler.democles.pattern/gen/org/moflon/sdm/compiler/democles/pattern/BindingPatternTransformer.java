/**
 */
package org.moflon.sdm.compiler.democles.pattern;

import SDMLanguage.patterns.ObjectVariable;
import SDMLanguage.patterns.StoryPattern;

import org.gervarro.democles.specification.emf.Pattern;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Pattern Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.moflon.sdm.compiler.democles.pattern.PatternPackage#getBindingPatternTransformer()
 * @model
 * @generated
 */
public interface BindingPatternTransformer extends PatternTransformer
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   boolean isVariableToAdd(ObjectVariable objectVariable);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void postprocess(StoryPattern storyPattern, Pattern pattern);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void processObjectVariables(StoryPattern storyPattern, Pattern pattern);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // BindingPatternTransformer
