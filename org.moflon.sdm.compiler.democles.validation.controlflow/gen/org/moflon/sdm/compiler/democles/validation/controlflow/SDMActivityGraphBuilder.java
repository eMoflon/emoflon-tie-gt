/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow;

import SDMLanguage.activities.StartNode;
import SDMLanguage.activities.StatementNode;
import SDMLanguage.activities.StopNode;
import SDMLanguage.activities.StoryNode;

import org.eclipse.emf.ecore.EObject;

import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.Edge;
import org.moflon.core.dfs.Node;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SDM Activity Graph Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder#getValidator <em>Validator</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder#getGraph <em>Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getSDMActivityGraphBuilder()
 * @model
 * @generated
 */
public interface SDMActivityGraphBuilder extends EObject
{
   /**
    * Returns the value of the '<em><b>Validator</b></em>' reference.
    * It is bidirectional and its opposite is '{@link org.moflon.sdm.compiler.democles.validation.controlflow.Validator#getBuilders <em>Builders</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Validator</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Validator</em>' reference.
    * @see #setValidator(Validator)
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getSDMActivityGraphBuilder_Validator()
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.Validator#getBuilders
    * @model opposite="builders"
    * @generated
    */
   Validator getValidator();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder#getValidator <em>Validator</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Validator</em>' reference.
    * @see #getValidator()
    * @generated
    */
   void setValidator(Validator value);

   /**
    * Returns the value of the '<em><b>Graph</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Graph</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Graph</em>' reference.
    * @see #setGraph(DFSGraph)
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#getSDMActivityGraphBuilder_Graph()
    * @model required="true"
    * @generated
    */
   DFSGraph getGraph();

   /**
    * Sets the value of the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder#getGraph <em>Graph</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Graph</em>' reference.
    * @see #getGraph()
    * @generated
    */
   void setGraph(DFSGraph value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   Node exploreEdge(Edge edge);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   Node exploreStartNode(StartNode startNode);

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
} // SDMActivityGraphBuilder
