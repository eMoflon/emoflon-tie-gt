/**
 */
package org.moflon.sdm.constraints.constraintstodemocles;

import org.eclipse.emf.ecore.EObject;

import org.moflon.sdm.constraints.operationspecification.AttributeConstraintLibrary;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Constraint Lib Util</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.constraints.constraintstodemocles.AttributeConstraintLibUtil#getBuildInAttributeConstraintLibrary <em>Build In Attribute Constraint Library</em>}</li>
 *   <li>{@link org.moflon.sdm.constraints.constraintstodemocles.AttributeConstraintLibUtil#getUserDefinedAttributeConstraintLibrary <em>User Defined Attribute Constraint Library</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.constraints.constraintstodemocles.ConstraintstodemoclesPackage#getAttributeConstraintLibUtil()
 * @model
 * @generated
 */
public interface AttributeConstraintLibUtil extends EObject
{
   /**
    * Returns the value of the '<em><b>Build In Attribute Constraint Library</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Build In Attribute Constraint Library</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Build In Attribute Constraint Library</em>' reference.
    * @see #setBuildInAttributeConstraintLibrary(AttributeConstraintLibrary)
    * @see org.moflon.sdm.constraints.constraintstodemocles.ConstraintstodemoclesPackage#getAttributeConstraintLibUtil_BuildInAttributeConstraintLibrary()
    * @model
    * @generated
    */
   AttributeConstraintLibrary getBuildInAttributeConstraintLibrary();

   /**
    * Sets the value of the '{@link org.moflon.sdm.constraints.constraintstodemocles.AttributeConstraintLibUtil#getBuildInAttributeConstraintLibrary <em>Build In Attribute Constraint Library</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Build In Attribute Constraint Library</em>' reference.
    * @see #getBuildInAttributeConstraintLibrary()
    * @generated
    */
   void setBuildInAttributeConstraintLibrary(AttributeConstraintLibrary value);

   /**
    * Returns the value of the '<em><b>User Defined Attribute Constraint Library</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>User Defined Attribute Constraint Library</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>User Defined Attribute Constraint Library</em>' reference.
    * @see #setUserDefinedAttributeConstraintLibrary(AttributeConstraintLibrary)
    * @see org.moflon.sdm.constraints.constraintstodemocles.ConstraintstodemoclesPackage#getAttributeConstraintLibUtil_UserDefinedAttributeConstraintLibrary()
    * @model
    * @generated
    */
   AttributeConstraintLibrary getUserDefinedAttributeConstraintLibrary();

   /**
    * Sets the value of the '{@link org.moflon.sdm.constraints.constraintstodemocles.AttributeConstraintLibUtil#getUserDefinedAttributeConstraintLibrary <em>User Defined Attribute Constraint Library</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>User Defined Attribute Constraint Library</em>' reference.
    * @see #getUserDefinedAttributeConstraintLibrary()
    * @generated
    */
   void setUserDefinedAttributeConstraintLibrary(AttributeConstraintLibrary value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void saveUserDefinedAttributeConstraintLibrary();
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // AttributeConstraintLibUtil
