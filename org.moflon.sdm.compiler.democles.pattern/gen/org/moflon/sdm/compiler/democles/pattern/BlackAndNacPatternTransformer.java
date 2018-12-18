/**
 */
package org.moflon.sdm.compiler.democles.pattern;

import SDMLanguage.expressions.ComparisonExpression;

import SDMLanguage.patterns.Constraint;
import SDMLanguage.patterns.LinkVariable;
import SDMLanguage.patterns.ObjectVariable;
import SDMLanguage.patterns.StoryPattern;

import org.eclipse.emf.ecore.EClassifier;

import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.Variable;

import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraint;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Black And Nac Pattern Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.moflon.sdm.compiler.democles.pattern.PatternPackage#getBlackAndNacPatternTransformer()
 * @model
 * @generated
 */
public interface BlackAndNacPatternTransformer extends PatternTransformer
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void analyzeInjectivity(Pattern pattern);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   boolean areCompatibleTypes(EClassifier first, EClassifier second);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void createInjectivityConstraint(Pattern pattern, Variable first, Variable second);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   RelationalConstraint createRelationalConstraint(ComparisonExpression comparison);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   boolean injectiveMappingRequired(Variable first, Variable second);

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
   void transformAttributeConstraint(Constraint constraint, Pattern pattern);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // BlackAndNacPatternTransformer
