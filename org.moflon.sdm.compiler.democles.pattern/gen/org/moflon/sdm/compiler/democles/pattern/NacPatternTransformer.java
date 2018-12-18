/**
 */
package org.moflon.sdm.compiler.democles.pattern;

import SDMLanguage.patterns.LinkVariable;
import SDMLanguage.patterns.ObjectVariable;
import SDMLanguage.patterns.StoryPattern;

import org.gervarro.democles.specification.emf.Pattern;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nac Pattern Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.moflon.sdm.compiler.democles.pattern.PatternPackage#getNacPatternTransformer()
 * @model
 * @generated
 */
public interface NacPatternTransformer extends BlackAndNacPatternTransformer
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void addLinkToPattern(LinkVariable linkVariable, Pattern pattern);

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
   void transformNacConstraints(ObjectVariable nacObjectVariable, Pattern nacPattern);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // NacPatternTransformer
