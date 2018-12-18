/**
 */
package org.moflon.sdm.compiler.democles.validation.scope;

import SDMLanguage.patterns.StoryPattern;

import org.gervarro.democles.specification.emf.Pattern;

import org.moflon.sdm.runtime.democles.RegularPatternInvocation;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Black Pattern Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getBlackPatternBuilder()
 * @model
 * @generated
 */
public interface BlackPatternBuilder extends CompoundPatternInvocationBuilder
{
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
   void analyzeDependenciesInSuperclass(PatternInvocationBuilder invocationBuilder, StoryPattern storyPattern, Pattern pattern);

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
    * @model
    * @generated
    */
   void buildPatternContentInSuperclass(RegularPatternInvocation invocation, StoryPattern storyPattern);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // BlackPatternBuilder
