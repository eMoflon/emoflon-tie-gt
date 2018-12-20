/**
 */
package org.moflon.sdm.compiler.democles.validation.scope;

import SDMLanguage.patterns.ObjectVariable;
import SDMLanguage.patterns.StoryPattern;

import org.gervarro.democles.common.Adornment;

import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternInvocationConstraint;

import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.PatternInvocation;
import org.moflon.sdm.runtime.democles.RegularPatternInvocation;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nac Pattern Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder#getNacPatternCounter <em>Nac Pattern Counter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getNacPatternBuilder()
 * @model
 * @generated
 */
public interface NacPatternBuilder extends RegularPatternInvocationBuilder
{
   /**
    * Returns the value of the '<em><b>Nac Pattern Counter</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Nac Pattern Counter</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Nac Pattern Counter</em>' attribute.
    * @see #setNacPatternCounter(int)
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getNacPatternBuilder_NacPatternCounter()
    * @model required="true" ordered="false"
    * @generated
    */
   int getNacPatternCounter();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.scope.NacPatternBuilder#getNacPatternCounter <em>Nac Pattern Counter</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Nac Pattern Counter</em>' attribute.
    * @see #getNacPatternCounter()
    * @generated
    */
   void setNacPatternCounter(int value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void analyzeDependencies(PatternInvocationBuilder invocationBuilder, StoryPattern storyPattern, Pattern pattern);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void attachToResource(Pattern pattern, Pattern nacPattern);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void buildPatternContent(RegularPatternInvocation invocation, StoryPattern storyPattern);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model dataType="org.moflon.sdm.runtime.democles.Adornment"
    * @generated
    */
   Adornment createAllBoundAdornment(Pattern pattern);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   String createNacPatternNameAndIncrementCounter(Pattern pattern);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void embedNacPattern(Pattern pattern, PatternInvocationConstraint patternInvocation, Pattern nacPattern);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void exploreNacPatternVariables(ObjectVariable objectVariable, Pattern nacPattern);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void handleRelevantObjectVariable(PatternInvocation invocation, ObjectVariable objectVariable);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void handleSimpleNacPattern(StoryPattern storyPattern, Pattern pattern);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   PatternInvocation lookupAction(CFNode node);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void postprocessPatternInterface(StoryPattern storyPattern);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // NacPatternBuilder
