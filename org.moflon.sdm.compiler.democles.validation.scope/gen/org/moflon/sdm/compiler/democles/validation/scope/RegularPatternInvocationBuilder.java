/**
 */
package org.moflon.sdm.compiler.democles.validation.scope;

import SDMLanguage.patterns.ObjectVariable;
import SDMLanguage.patterns.StoryPattern;

import org.eclipse.emf.ecore.EClassifier;

import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.Variable;

import org.moflon.sdm.compiler.democles.pattern.PatternTransformer;

import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.PatternInvocation;
import org.moflon.sdm.runtime.democles.RegularPatternInvocation;
import org.moflon.sdm.runtime.democles.VariableReference;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regular Pattern Invocation Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#getParentBuilder <em>Parent Builder</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#getPatternTransformer <em>Pattern Transformer</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#isMainActionBuilder <em>Main Action Builder</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getRegularPatternInvocationBuilder()
 * @model
 * @generated
 */
public interface RegularPatternInvocationBuilder extends PatternInvocationBuilder
{
   /**
    * Returns the value of the '<em><b>Parent Builder</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.moflon.sdm.compiler.democles.validation.scope.CompoundPatternInvocationBuilder#getChildBuilders <em>Child Builders</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parent Builder</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Parent Builder</em>' container reference.
    * @see #setParentBuilder(CompoundPatternInvocationBuilder)
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getRegularPatternInvocationBuilder_ParentBuilder()
    * @see org.moflon.sdm.compiler.democles.validation.scope.CompoundPatternInvocationBuilder#getChildBuilders
    * @model opposite="childBuilders" transient="false"
    * @generated
    */
   CompoundPatternInvocationBuilder getParentBuilder();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#getParentBuilder <em>Parent Builder</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Parent Builder</em>' container reference.
    * @see #getParentBuilder()
    * @generated
    */
   void setParentBuilder(CompoundPatternInvocationBuilder value);

   /**
    * Returns the value of the '<em><b>Pattern Transformer</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Pattern Transformer</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Pattern Transformer</em>' containment reference.
    * @see #setPatternTransformer(PatternTransformer)
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getRegularPatternInvocationBuilder_PatternTransformer()
    * @model containment="true" required="true"
    * @generated
    */
   PatternTransformer getPatternTransformer();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#getPatternTransformer <em>Pattern Transformer</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Pattern Transformer</em>' containment reference.
    * @see #getPatternTransformer()
    * @generated
    */
   void setPatternTransformer(PatternTransformer value);

   /**
    * Returns the value of the '<em><b>Main Action Builder</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Main Action Builder</em>' attribute isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Main Action Builder</em>' attribute.
    * @see #setMainActionBuilder(boolean)
    * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getRegularPatternInvocationBuilder_MainActionBuilder()
    * @model required="true" ordered="false"
    * @generated
    */
   boolean isMainActionBuilder();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.scope.RegularPatternInvocationBuilder#isMainActionBuilder <em>Main Action Builder</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Main Action Builder</em>' attribute.
    * @see #isMainActionBuilder()
    * @generated
    */
   void setMainActionBuilder(boolean value);

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
   void buildPatternContent(RegularPatternInvocation invocation, StoryPattern storyPattern);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void buildPatternInterface(CFNode node, StoryPattern storyPattern);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   RegularPatternInvocation createAction();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void exploreAttributeAssignments(PatternInvocationBuilder invocationBuilder, ExpressionExplorer expressionExplorer, ObjectVariable objectVariable,
         Pattern pattern);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void exploreAttributeConstraints(PatternInvocationBuilder invocationBuilder, ExpressionExplorer expressionExplorer, ObjectVariable objectVariable,
         Pattern pattern);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model kind="operation"
    * @generated
    */
   RegularPatternInvocationBuilder getPatternInvocationBuilder();

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
   VariableReference handleVariableReference(Variable variable, EClassifier variableType);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   VariableReference handleVariableReferenceInSuperclass(Variable variable, EClassifier variableType);

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
   ScopeValidator lookupScopeValidator();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void postprocessPatternInterface(StoryPattern storyPattern);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void transformPattern(StoryPattern storyPattern, Pattern democlesPattern);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // RegularPatternInvocationBuilder
