/**
 */
package org.moflon.sdm.compiler.democles.validation.scope;

import SDMLanguage.patterns.ObjectVariable;
import SDMLanguage.patterns.StoryPattern;

import org.gervarro.democles.common.Adornment;

import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternInvocationConstraint;

import org.moflon.sdm.runtime.democles.Action;
import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.CFVariable;
import org.moflon.sdm.runtime.democles.RegularPatternInvocation;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding And Black Pattern Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder#getBlackPatternBuilder <em>Black Pattern Builder</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getBindingAndBlackPatternBuilder()
 * @model
 * @generated
 */
public interface BindingAndBlackPatternBuilder extends CompoundPatternInvocationBuilder
{
   /**
    * Returns the value of the '<em><b>Black Pattern Builder</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Black Pattern Builder</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Black Pattern Builder</em>' reference.
    * @see #setBlackPatternBuilder(BlackPatternBuilder)
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getBindingAndBlackPatternBuilder_BlackPatternBuilder()
    * @model required="true"
    * @generated
    */
   BlackPatternBuilder getBlackPatternBuilder();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.scope.BindingAndBlackPatternBuilder#getBlackPatternBuilder <em>Black Pattern Builder</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Black Pattern Builder</em>' reference.
    * @see #getBlackPatternBuilder()
    * @generated
    */
   void setBlackPatternBuilder(BlackPatternBuilder value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void analyzeDependencies(PatternInvocationBuilder patternInvocationBuilder, StoryPattern storyPattern, Pattern pattern);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void buildAction(CFNode node);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void buildActionInSuperClass(CFNode node);

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
    * @model dataType="org.moflon.sdm.runtime.democles.Adornment" adornmentDataType="org.moflon.sdm.runtime.democles.Adornment"
    * @generated
    */
   Adornment calculateNextAdornment(Pattern pattern, Adornment adornment, PatternInvocationConstraint patternInvocationConstraint);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model dataType="org.moflon.sdm.runtime.democles.Adornment" adornmentDataType="org.moflon.sdm.runtime.democles.Adornment"
    * @generated
    */
   Adornment calculatePatternInvocationAdornment(Pattern pattern, Adornment adornment, PatternInvocationConstraint patternInvocationConstraint);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void constructEmbeddedPattern(RegularPatternInvocationBuilder patternBuilder, StoryPattern storyPattern, Pattern pattern);

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
    * @model dataType="org.moflon.sdm.runtime.democles.Adornment" adornmentDataType="org.moflon.sdm.runtime.democles.Adornment"
    * @generated
    */
   Adornment processChildPattern(RegularPatternInvocationBuilder childPatternBuilder, RegularPatternInvocation invocation, StoryPattern storyPattern,
         Adornment adornment);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void validateVariable(Action action, CFVariable variable, ObjectVariable objectVariable);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // BindingAndBlackPatternBuilder
