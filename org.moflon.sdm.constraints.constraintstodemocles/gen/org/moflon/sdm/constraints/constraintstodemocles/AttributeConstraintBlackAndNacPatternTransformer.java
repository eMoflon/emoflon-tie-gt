/**
 */
package org.moflon.sdm.constraints.constraintstodemocles;

import SDMLanguage.patterns.AttributeConstraints.AttributeLookupConstraint;
import SDMLanguage.patterns.AttributeConstraints.CspConstraint;
import SDMLanguage.patterns.AttributeConstraints.PrimitiveVariable;

import SDMLanguage.patterns.StoryPattern;

import org.eclipse.emf.ecore.EObject;

import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.Variable;

import org.moflon.sdm.compiler.democles.pattern.BlackAndNacPatternTransformer;

import org.moflon.sdm.compiler.democles.validation.result.ErrorMessage;

import org.moflon.sdm.constraints.democles.AttributeVariableConstraint;

import org.moflon.sdm.constraints.operationspecification.AttributeConstraintLibrary;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Constraint Black And Nac Pattern Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.constraints.constraintstodemocles.AttributeConstraintBlackAndNacPatternTransformer#getAttributeConstraintLibUtil <em>Attribute Constraint Lib Util</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.constraints.constraintstodemocles.ConstraintstodemoclesPackage#getAttributeConstraintBlackAndNacPatternTransformer()
 * @model
 * @generated
 */
public interface AttributeConstraintBlackAndNacPatternTransformer extends BlackAndNacPatternTransformer
{
   /**
    * Returns the value of the '<em><b>Attribute Constraint Lib Util</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Attribute Constraint Lib Util</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Attribute Constraint Lib Util</em>' reference.
    * @see #setAttributeConstraintLibUtil(AttributeConstraintLibUtil)
    * @see org.moflon.sdm.constraints.constraintstodemocles.ConstraintstodemoclesPackage#getAttributeConstraintBlackAndNacPatternTransformer_AttributeConstraintLibUtil()
    * @model
    * @generated
    */
   AttributeConstraintLibUtil getAttributeConstraintLibUtil();

   /**
    * Sets the value of the '{@link org.moflon.sdm.constraints.constraintstodemocles.AttributeConstraintBlackAndNacPatternTransformer#getAttributeConstraintLibUtil <em>Attribute Constraint Lib Util</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Attribute Constraint Lib Util</em>' reference.
    * @see #getAttributeConstraintLibUtil()
    * @generated
    */
   void setAttributeConstraintLibUtil(AttributeConstraintLibUtil value);

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
   void processPrimitiveVariable(PrimitiveVariable primitiveVariable, Pattern pattern);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void processLookupConstraint(AttributeLookupConstraint lookupConstraint, Pattern pattern);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void processCspConstraint(CspConstraint cspConstraint, Pattern pattern);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   Variable lookupVariableByName(String name, Pattern pattern);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void callSuperPostprocess(StoryPattern storyPattern, Pattern pattern);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void validateConstraintLibrary(AttributeConstraintLibrary attributeConstraintLibrary);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void validateCspConstraints(AttributeVariableConstraint attributeConstraint, CspConstraint cspConstraint);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void updateUserDefinedConstraintLib(AttributeVariableConstraint attributeConstraint, AttributeConstraintLibrary userDefinedLib);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   ErrorMessage createErrorMessage(EObject location);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // AttributeConstraintBlackAndNacPatternTransformer
