/**
 */
package org.moflon.sdm.compiler.democles.validation.scope;

import SDMLanguage.patterns.ObjectVariable;

import org.moflon.sdm.runtime.democles.Action;
import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.CFVariable;
import org.moflon.sdm.runtime.democles.NodeDeletion;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Red Node Deletion Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.moflon.sdm.compiler.democles.validation.scope.ScopePackage#getRedNodeDeletionBuilder()
 * @model
 * @generated
 */
public interface RedNodeDeletionBuilder extends ActionBuilder
{
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
   NodeDeletion lookupAction(CFNode node);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void validateVariable(Action action, CFVariable variable, ObjectVariable objectVariable);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // RedNodeDeletionBuilder
