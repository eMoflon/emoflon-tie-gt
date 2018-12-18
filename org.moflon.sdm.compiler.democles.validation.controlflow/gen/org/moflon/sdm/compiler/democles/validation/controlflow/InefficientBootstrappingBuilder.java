/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow;

import SDMLanguage.activities.StatementNode;
import SDMLanguage.activities.StopNode;
import SDMLanguage.activities.StoryNode;

import org.moflon.core.dfs.Node;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inefficient Bootstrapping Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.InefficientBootstrappingBuilder#getDelegate <em>Delegate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getInefficientBootstrappingBuilder()
 * @model
 * @generated
 */
public interface InefficientBootstrappingBuilder extends SDMActivityGraphBuilder
{
   /**
    * Returns the value of the '<em><b>Delegate</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Delegate</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Delegate</em>' reference.
    * @see #setDelegate(SDMActivityGraphBuilder)
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getInefficientBootstrappingBuilder_Delegate()
    * @model required="true"
    * @generated
    */
   SDMActivityGraphBuilder getDelegate();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.InefficientBootstrappingBuilder#getDelegate <em>Delegate</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Delegate</em>' reference.
    * @see #getDelegate()
    * @generated
    */
   void setDelegate(SDMActivityGraphBuilder value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   Node exploreStatementNode(StatementNode statementNode);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   Node exploreStopNode(StopNode stopNode);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   Node exploreStoryNode(StoryNode storyNode);
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} // InefficientBootstrappingBuilder
