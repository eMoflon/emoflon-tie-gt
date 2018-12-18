/**
 */
package org.moflon.sdm.runtime.democles;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.moflon.sdm.runtime.democles.DemoclesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.moflon.sdm.runtime'"
 * @generated
 */
public interface DemoclesPackage extends EPackage
{
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "democles";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "platform:/plugin/org.moflon.sdm.runtime.democles/model/Democles.ecore";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "org.moflon.sdm.runtime.democles";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   DemoclesPackage eINSTANCE = org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl.init();

   /**
    * The meta object id for the '{@link org.moflon.sdm.runtime.democles.impl.CFNodeImpl <em>CF Node</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.runtime.democles.impl.CFNodeImpl
    * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getCFNode()
    * @generated
    */
   int CF_NODE = 10;

   /**
    * The feature id for the '<em><b>Scope</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CF_NODE__SCOPE = 0;

   /**
    * The feature id for the '<em><b>Main Action</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CF_NODE__MAIN_ACTION = 1;

   /**
    * The feature id for the '<em><b>Actions</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CF_NODE__ACTIONS = 2;

   /**
    * The feature id for the '<em><b>Next</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CF_NODE__NEXT = 3;

   /**
    * The feature id for the '<em><b>Prev</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CF_NODE__PREV = 4;

   /**
    * The feature id for the '<em><b>Origin</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CF_NODE__ORIGIN = 5;

   /**
    * The feature id for the '<em><b>Header</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CF_NODE__HEADER = 6;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CF_NODE__ID = 7;

   /**
    * The number of structural features of the '<em>CF Node</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CF_NODE_FEATURE_COUNT = 8;

   /**
    * The operation id for the '<em>Accept</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CF_NODE___ACCEPT__VISITOR = 0;

   /**
    * The operation id for the '<em>Get Relevant Scope</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CF_NODE___GET_RELEVANT_SCOPE = 1;

   /**
    * The number of operations of the '<em>CF Node</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CF_NODE_OPERATION_COUNT = 2;

   /**
    * The meta object id for the '{@link org.moflon.sdm.runtime.democles.impl.ContinueStatementImpl <em>Continue Statement</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.runtime.democles.impl.ContinueStatementImpl
    * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getContinueStatement()
    * @generated
    */
   int CONTINUE_STATEMENT = 0;

   /**
    * The feature id for the '<em><b>Scope</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTINUE_STATEMENT__SCOPE = CF_NODE__SCOPE;

   /**
    * The feature id for the '<em><b>Main Action</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTINUE_STATEMENT__MAIN_ACTION = CF_NODE__MAIN_ACTION;

   /**
    * The feature id for the '<em><b>Actions</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTINUE_STATEMENT__ACTIONS = CF_NODE__ACTIONS;

   /**
    * The feature id for the '<em><b>Next</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTINUE_STATEMENT__NEXT = CF_NODE__NEXT;

   /**
    * The feature id for the '<em><b>Prev</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTINUE_STATEMENT__PREV = CF_NODE__PREV;

   /**
    * The feature id for the '<em><b>Origin</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTINUE_STATEMENT__ORIGIN = CF_NODE__ORIGIN;

   /**
    * The feature id for the '<em><b>Header</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTINUE_STATEMENT__HEADER = CF_NODE__HEADER;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTINUE_STATEMENT__ID = CF_NODE__ID;

   /**
    * The number of structural features of the '<em>Continue Statement</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTINUE_STATEMENT_FEATURE_COUNT = CF_NODE_FEATURE_COUNT + 0;

   /**
    * The operation id for the '<em>Accept</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTINUE_STATEMENT___ACCEPT__VISITOR = CF_NODE___ACCEPT__VISITOR;

   /**
    * The operation id for the '<em>Get Relevant Scope</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTINUE_STATEMENT___GET_RELEVANT_SCOPE = CF_NODE___GET_RELEVANT_SCOPE;

   /**
    * The number of operations of the '<em>Continue Statement</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTINUE_STATEMENT_OPERATION_COUNT = CF_NODE_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.moflon.sdm.runtime.democles.impl.CompoundNodeImpl <em>Compound Node</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.runtime.democles.impl.CompoundNodeImpl
    * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getCompoundNode()
    * @generated
    */
   int COMPOUND_NODE = 7;

   /**
    * The feature id for the '<em><b>Scope</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_NODE__SCOPE = CF_NODE__SCOPE;

   /**
    * The feature id for the '<em><b>Main Action</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_NODE__MAIN_ACTION = CF_NODE__MAIN_ACTION;

   /**
    * The feature id for the '<em><b>Actions</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_NODE__ACTIONS = CF_NODE__ACTIONS;

   /**
    * The feature id for the '<em><b>Next</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_NODE__NEXT = CF_NODE__NEXT;

   /**
    * The feature id for the '<em><b>Prev</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_NODE__PREV = CF_NODE__PREV;

   /**
    * The feature id for the '<em><b>Origin</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_NODE__ORIGIN = CF_NODE__ORIGIN;

   /**
    * The feature id for the '<em><b>Header</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_NODE__HEADER = CF_NODE__HEADER;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_NODE__ID = CF_NODE__ID;

   /**
    * The feature id for the '<em><b>Scopes</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_NODE__SCOPES = CF_NODE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Compound Node</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_NODE_FEATURE_COUNT = CF_NODE_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>Accept</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_NODE___ACCEPT__VISITOR = CF_NODE___ACCEPT__VISITOR;

   /**
    * The operation id for the '<em>Get Relevant Scope</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_NODE___GET_RELEVANT_SCOPE = CF_NODE_OPERATION_COUNT + 0;

   /**
    * The number of operations of the '<em>Compound Node</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int COMPOUND_NODE_OPERATION_COUNT = CF_NODE_OPERATION_COUNT + 1;

   /**
    * The meta object id for the '{@link org.moflon.sdm.runtime.democles.impl.RepetitionNodeImpl <em>Repetition Node</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.runtime.democles.impl.RepetitionNodeImpl
    * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getRepetitionNode()
    * @generated
    */
   int REPETITION_NODE = 1;

   /**
    * The feature id for the '<em><b>Scope</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPETITION_NODE__SCOPE = COMPOUND_NODE__SCOPE;

   /**
    * The feature id for the '<em><b>Main Action</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPETITION_NODE__MAIN_ACTION = COMPOUND_NODE__MAIN_ACTION;

   /**
    * The feature id for the '<em><b>Actions</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPETITION_NODE__ACTIONS = COMPOUND_NODE__ACTIONS;

   /**
    * The feature id for the '<em><b>Next</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPETITION_NODE__NEXT = COMPOUND_NODE__NEXT;

   /**
    * The feature id for the '<em><b>Prev</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPETITION_NODE__PREV = COMPOUND_NODE__PREV;

   /**
    * The feature id for the '<em><b>Origin</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPETITION_NODE__ORIGIN = COMPOUND_NODE__ORIGIN;

   /**
    * The feature id for the '<em><b>Header</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPETITION_NODE__HEADER = COMPOUND_NODE__HEADER;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPETITION_NODE__ID = COMPOUND_NODE__ID;

   /**
    * The feature id for the '<em><b>Scopes</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPETITION_NODE__SCOPES = COMPOUND_NODE__SCOPES;

   /**
    * The feature id for the '<em><b>Last Nodes</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPETITION_NODE__LAST_NODES = COMPOUND_NODE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Repetition Node</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPETITION_NODE_FEATURE_COUNT = COMPOUND_NODE_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>Accept</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPETITION_NODE___ACCEPT__VISITOR = COMPOUND_NODE___ACCEPT__VISITOR;

   /**
    * The operation id for the '<em>Get Relevant Scope</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPETITION_NODE___GET_RELEVANT_SCOPE = COMPOUND_NODE___GET_RELEVANT_SCOPE;

   /**
    * The operation id for the '<em>Has Shortcuts</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPETITION_NODE___HAS_SHORTCUTS = COMPOUND_NODE_OPERATION_COUNT + 0;

   /**
    * The number of operations of the '<em>Repetition Node</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REPETITION_NODE_OPERATION_COUNT = COMPOUND_NODE_OPERATION_COUNT + 1;

   /**
    * The meta object id for the '{@link org.moflon.sdm.runtime.democles.impl.LoopImpl <em>Loop</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.runtime.democles.impl.LoopImpl
    * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getLoop()
    * @generated
    */
   int LOOP = 2;

   /**
    * The feature id for the '<em><b>Scope</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LOOP__SCOPE = REPETITION_NODE__SCOPE;

   /**
    * The feature id for the '<em><b>Main Action</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LOOP__MAIN_ACTION = REPETITION_NODE__MAIN_ACTION;

   /**
    * The feature id for the '<em><b>Actions</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LOOP__ACTIONS = REPETITION_NODE__ACTIONS;

   /**
    * The feature id for the '<em><b>Next</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LOOP__NEXT = REPETITION_NODE__NEXT;

   /**
    * The feature id for the '<em><b>Prev</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LOOP__PREV = REPETITION_NODE__PREV;

   /**
    * The feature id for the '<em><b>Origin</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LOOP__ORIGIN = REPETITION_NODE__ORIGIN;

   /**
    * The feature id for the '<em><b>Header</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LOOP__HEADER = REPETITION_NODE__HEADER;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LOOP__ID = REPETITION_NODE__ID;

   /**
    * The feature id for the '<em><b>Scopes</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LOOP__SCOPES = REPETITION_NODE__SCOPES;

   /**
    * The feature id for the '<em><b>Last Nodes</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LOOP__LAST_NODES = REPETITION_NODE__LAST_NODES;

   /**
    * The feature id for the '<em><b>Loop Along True</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LOOP__LOOP_ALONG_TRUE = REPETITION_NODE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Loop</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LOOP_FEATURE_COUNT = REPETITION_NODE_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>Accept</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LOOP___ACCEPT__VISITOR = REPETITION_NODE___ACCEPT__VISITOR;

   /**
    * The operation id for the '<em>Has Shortcuts</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LOOP___HAS_SHORTCUTS = REPETITION_NODE___HAS_SHORTCUTS;

   /**
    * The operation id for the '<em>Get Relevant Scope</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LOOP___GET_RELEVANT_SCOPE = REPETITION_NODE_OPERATION_COUNT + 0;

   /**
    * The number of operations of the '<em>Loop</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int LOOP_OPERATION_COUNT = REPETITION_NODE_OPERATION_COUNT + 1;

   /**
    * The meta object id for the '{@link org.moflon.sdm.runtime.democles.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.runtime.democles.impl.ReturnStatementImpl
    * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getReturnStatement()
    * @generated
    */
   int RETURN_STATEMENT = 3;

   /**
    * The feature id for the '<em><b>Scope</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RETURN_STATEMENT__SCOPE = CF_NODE__SCOPE;

   /**
    * The feature id for the '<em><b>Main Action</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RETURN_STATEMENT__MAIN_ACTION = CF_NODE__MAIN_ACTION;

   /**
    * The feature id for the '<em><b>Actions</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RETURN_STATEMENT__ACTIONS = CF_NODE__ACTIONS;

   /**
    * The feature id for the '<em><b>Next</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RETURN_STATEMENT__NEXT = CF_NODE__NEXT;

   /**
    * The feature id for the '<em><b>Prev</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RETURN_STATEMENT__PREV = CF_NODE__PREV;

   /**
    * The feature id for the '<em><b>Origin</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RETURN_STATEMENT__ORIGIN = CF_NODE__ORIGIN;

   /**
    * The feature id for the '<em><b>Header</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RETURN_STATEMENT__HEADER = CF_NODE__HEADER;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RETURN_STATEMENT__ID = CF_NODE__ID;

   /**
    * The number of structural features of the '<em>Return Statement</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RETURN_STATEMENT_FEATURE_COUNT = CF_NODE_FEATURE_COUNT + 0;

   /**
    * The operation id for the '<em>Accept</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RETURN_STATEMENT___ACCEPT__VISITOR = CF_NODE___ACCEPT__VISITOR;

   /**
    * The operation id for the '<em>Get Relevant Scope</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RETURN_STATEMENT___GET_RELEVANT_SCOPE = CF_NODE___GET_RELEVANT_SCOPE;

   /**
    * The number of operations of the '<em>Return Statement</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int RETURN_STATEMENT_OPERATION_COUNT = CF_NODE_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.moflon.sdm.runtime.democles.impl.HeadControlledLoopImpl <em>Head Controlled Loop</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.runtime.democles.impl.HeadControlledLoopImpl
    * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getHeadControlledLoop()
    * @generated
    */
   int HEAD_CONTROLLED_LOOP = 4;

   /**
    * The feature id for the '<em><b>Scope</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HEAD_CONTROLLED_LOOP__SCOPE = LOOP__SCOPE;

   /**
    * The feature id for the '<em><b>Main Action</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HEAD_CONTROLLED_LOOP__MAIN_ACTION = LOOP__MAIN_ACTION;

   /**
    * The feature id for the '<em><b>Actions</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HEAD_CONTROLLED_LOOP__ACTIONS = LOOP__ACTIONS;

   /**
    * The feature id for the '<em><b>Next</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HEAD_CONTROLLED_LOOP__NEXT = LOOP__NEXT;

   /**
    * The feature id for the '<em><b>Prev</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HEAD_CONTROLLED_LOOP__PREV = LOOP__PREV;

   /**
    * The feature id for the '<em><b>Origin</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HEAD_CONTROLLED_LOOP__ORIGIN = LOOP__ORIGIN;

   /**
    * The feature id for the '<em><b>Header</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HEAD_CONTROLLED_LOOP__HEADER = LOOP__HEADER;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HEAD_CONTROLLED_LOOP__ID = LOOP__ID;

   /**
    * The feature id for the '<em><b>Scopes</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HEAD_CONTROLLED_LOOP__SCOPES = LOOP__SCOPES;

   /**
    * The feature id for the '<em><b>Last Nodes</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HEAD_CONTROLLED_LOOP__LAST_NODES = LOOP__LAST_NODES;

   /**
    * The feature id for the '<em><b>Loop Along True</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HEAD_CONTROLLED_LOOP__LOOP_ALONG_TRUE = LOOP__LOOP_ALONG_TRUE;

   /**
    * The number of structural features of the '<em>Head Controlled Loop</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HEAD_CONTROLLED_LOOP_FEATURE_COUNT = LOOP_FEATURE_COUNT + 0;

   /**
    * The operation id for the '<em>Has Shortcuts</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HEAD_CONTROLLED_LOOP___HAS_SHORTCUTS = LOOP___HAS_SHORTCUTS;

   /**
    * The operation id for the '<em>Get Relevant Scope</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HEAD_CONTROLLED_LOOP___GET_RELEVANT_SCOPE = LOOP___GET_RELEVANT_SCOPE;

   /**
    * The operation id for the '<em>Accept</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HEAD_CONTROLLED_LOOP___ACCEPT__VISITOR = LOOP_OPERATION_COUNT + 0;

   /**
    * The number of operations of the '<em>Head Controlled Loop</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int HEAD_CONTROLLED_LOOP_OPERATION_COUNT = LOOP_OPERATION_COUNT + 1;

   /**
    * The meta object id for the '{@link org.moflon.sdm.runtime.democles.impl.TailControlledLoopImpl <em>Tail Controlled Loop</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.runtime.democles.impl.TailControlledLoopImpl
    * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getTailControlledLoop()
    * @generated
    */
   int TAIL_CONTROLLED_LOOP = 5;

   /**
    * The feature id for the '<em><b>Scope</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TAIL_CONTROLLED_LOOP__SCOPE = LOOP__SCOPE;

   /**
    * The feature id for the '<em><b>Main Action</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TAIL_CONTROLLED_LOOP__MAIN_ACTION = LOOP__MAIN_ACTION;

   /**
    * The feature id for the '<em><b>Actions</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TAIL_CONTROLLED_LOOP__ACTIONS = LOOP__ACTIONS;

   /**
    * The feature id for the '<em><b>Next</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TAIL_CONTROLLED_LOOP__NEXT = LOOP__NEXT;

   /**
    * The feature id for the '<em><b>Prev</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TAIL_CONTROLLED_LOOP__PREV = LOOP__PREV;

   /**
    * The feature id for the '<em><b>Origin</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TAIL_CONTROLLED_LOOP__ORIGIN = LOOP__ORIGIN;

   /**
    * The feature id for the '<em><b>Header</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TAIL_CONTROLLED_LOOP__HEADER = LOOP__HEADER;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TAIL_CONTROLLED_LOOP__ID = LOOP__ID;

   /**
    * The feature id for the '<em><b>Scopes</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TAIL_CONTROLLED_LOOP__SCOPES = LOOP__SCOPES;

   /**
    * The feature id for the '<em><b>Last Nodes</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TAIL_CONTROLLED_LOOP__LAST_NODES = LOOP__LAST_NODES;

   /**
    * The feature id for the '<em><b>Loop Along True</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TAIL_CONTROLLED_LOOP__LOOP_ALONG_TRUE = LOOP__LOOP_ALONG_TRUE;

   /**
    * The number of structural features of the '<em>Tail Controlled Loop</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TAIL_CONTROLLED_LOOP_FEATURE_COUNT = LOOP_FEATURE_COUNT + 0;

   /**
    * The operation id for the '<em>Has Shortcuts</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TAIL_CONTROLLED_LOOP___HAS_SHORTCUTS = LOOP___HAS_SHORTCUTS;

   /**
    * The operation id for the '<em>Get Relevant Scope</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TAIL_CONTROLLED_LOOP___GET_RELEVANT_SCOPE = LOOP___GET_RELEVANT_SCOPE;

   /**
    * The operation id for the '<em>Accept</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TAIL_CONTROLLED_LOOP___ACCEPT__VISITOR = LOOP_OPERATION_COUNT + 0;

   /**
    * The number of operations of the '<em>Tail Controlled Loop</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TAIL_CONTROLLED_LOOP_OPERATION_COUNT = LOOP_OPERATION_COUNT + 1;

   /**
    * The meta object id for the '{@link org.moflon.sdm.runtime.democles.impl.ForEachImpl <em>For Each</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.runtime.democles.impl.ForEachImpl
    * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getForEach()
    * @generated
    */
   int FOR_EACH = 6;

   /**
    * The feature id for the '<em><b>Scope</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_EACH__SCOPE = REPETITION_NODE__SCOPE;

   /**
    * The feature id for the '<em><b>Main Action</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_EACH__MAIN_ACTION = REPETITION_NODE__MAIN_ACTION;

   /**
    * The feature id for the '<em><b>Actions</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_EACH__ACTIONS = REPETITION_NODE__ACTIONS;

   /**
    * The feature id for the '<em><b>Next</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_EACH__NEXT = REPETITION_NODE__NEXT;

   /**
    * The feature id for the '<em><b>Prev</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_EACH__PREV = REPETITION_NODE__PREV;

   /**
    * The feature id for the '<em><b>Origin</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_EACH__ORIGIN = REPETITION_NODE__ORIGIN;

   /**
    * The feature id for the '<em><b>Header</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_EACH__HEADER = REPETITION_NODE__HEADER;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_EACH__ID = REPETITION_NODE__ID;

   /**
    * The feature id for the '<em><b>Scopes</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_EACH__SCOPES = REPETITION_NODE__SCOPES;

   /**
    * The feature id for the '<em><b>Last Nodes</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_EACH__LAST_NODES = REPETITION_NODE__LAST_NODES;

   /**
    * The number of structural features of the '<em>For Each</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_EACH_FEATURE_COUNT = REPETITION_NODE_FEATURE_COUNT + 0;

   /**
    * The operation id for the '<em>Get Relevant Scope</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_EACH___GET_RELEVANT_SCOPE = REPETITION_NODE___GET_RELEVANT_SCOPE;

   /**
    * The operation id for the '<em>Has Shortcuts</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_EACH___HAS_SHORTCUTS = REPETITION_NODE___HAS_SHORTCUTS;

   /**
    * The operation id for the '<em>Accept</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_EACH___ACCEPT__VISITOR = REPETITION_NODE_OPERATION_COUNT + 0;

   /**
    * The number of operations of the '<em>For Each</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_EACH_OPERATION_COUNT = REPETITION_NODE_OPERATION_COUNT + 1;

   /**
    * The meta object id for the '{@link org.moflon.sdm.runtime.democles.impl.ActionImpl <em>Action</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.runtime.democles.impl.ActionImpl
    * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getAction()
    * @generated
    */
   int ACTION = 14;

   /**
    * The feature id for the '<em><b>Reassigned Variables</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION__REASSIGNED_VARIABLES = 0;

   /**
    * The feature id for the '<em><b>Cf Node</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION__CF_NODE = 1;

   /**
    * The feature id for the '<em><b>Constructed Variables</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION__CONSTRUCTED_VARIABLES = 2;

   /**
    * The feature id for the '<em><b>Next</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION__NEXT = 3;

   /**
    * The feature id for the '<em><b>Prev</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION__PREV = 4;

   /**
    * The number of structural features of the '<em>Action</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION_FEATURE_COUNT = 5;

   /**
    * The operation id for the '<em>Has Referenced Free Parameters</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION___HAS_REFERENCED_FREE_PARAMETERS = 0;

   /**
    * The number of operations of the '<em>Action</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int ACTION_OPERATION_COUNT = 1;

   /**
    * The meta object id for the '{@link org.moflon.sdm.runtime.democles.impl.PatternInvocationImpl <em>Pattern Invocation</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.runtime.democles.impl.PatternInvocationImpl
    * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getPatternInvocation()
    * @generated
    */
   int PATTERN_INVOCATION = 18;

   /**
    * The feature id for the '<em><b>Reassigned Variables</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION__REASSIGNED_VARIABLES = ACTION__REASSIGNED_VARIABLES;

   /**
    * The feature id for the '<em><b>Cf Node</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION__CF_NODE = ACTION__CF_NODE;

   /**
    * The feature id for the '<em><b>Constructed Variables</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION__CONSTRUCTED_VARIABLES = ACTION__CONSTRUCTED_VARIABLES;

   /**
    * The feature id for the '<em><b>Next</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION__NEXT = ACTION__NEXT;

   /**
    * The feature id for the '<em><b>Prev</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION__PREV = ACTION__PREV;

   /**
    * The feature id for the '<em><b>Pattern</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION__PATTERN = ACTION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION__PARAMETERS = ACTION_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Pattern Invocation</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

   /**
    * The operation id for the '<em>Has Referenced Free Parameters</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION___HAS_REFERENCED_FREE_PARAMETERS = ACTION_OPERATION_COUNT + 0;

   /**
    * The operation id for the '<em>Is Multiple Match</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION___IS_MULTIPLE_MATCH = ACTION_OPERATION_COUNT + 1;

   /**
    * The number of operations of the '<em>Pattern Invocation</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int PATTERN_INVOCATION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 2;

   /**
    * The meta object id for the '{@link org.moflon.sdm.runtime.democles.impl.RegularPatternInvocationImpl <em>Regular Pattern Invocation</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.runtime.democles.impl.RegularPatternInvocationImpl
    * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getRegularPatternInvocation()
    * @generated
    */
   int REGULAR_PATTERN_INVOCATION = 8;

   /**
    * The feature id for the '<em><b>Reassigned Variables</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION__REASSIGNED_VARIABLES = PATTERN_INVOCATION__REASSIGNED_VARIABLES;

   /**
    * The feature id for the '<em><b>Cf Node</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION__CF_NODE = PATTERN_INVOCATION__CF_NODE;

   /**
    * The feature id for the '<em><b>Constructed Variables</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION__CONSTRUCTED_VARIABLES = PATTERN_INVOCATION__CONSTRUCTED_VARIABLES;

   /**
    * The feature id for the '<em><b>Next</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION__NEXT = PATTERN_INVOCATION__NEXT;

   /**
    * The feature id for the '<em><b>Prev</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION__PREV = PATTERN_INVOCATION__PREV;

   /**
    * The feature id for the '<em><b>Pattern</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION__PATTERN = PATTERN_INVOCATION__PATTERN;

   /**
    * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION__PARAMETERS = PATTERN_INVOCATION__PARAMETERS;

   /**
    * The number of structural features of the '<em>Regular Pattern Invocation</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_FEATURE_COUNT = PATTERN_INVOCATION_FEATURE_COUNT + 0;

   /**
    * The operation id for the '<em>Has Referenced Free Parameters</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION___HAS_REFERENCED_FREE_PARAMETERS = PATTERN_INVOCATION___HAS_REFERENCED_FREE_PARAMETERS;

   /**
    * The operation id for the '<em>Is Multiple Match</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION___IS_MULTIPLE_MATCH = PATTERN_INVOCATION_OPERATION_COUNT + 0;

   /**
    * The number of operations of the '<em>Regular Pattern Invocation</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int REGULAR_PATTERN_INVOCATION_OPERATION_COUNT = PATTERN_INVOCATION_OPERATION_COUNT + 1;

   /**
    * The meta object id for the '{@link org.moflon.sdm.runtime.democles.impl.CFVariableImpl <em>CF Variable</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.runtime.democles.impl.CFVariableImpl
    * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getCFVariable()
    * @generated
    */
   int CF_VARIABLE = 9;

   /**
    * The feature id for the '<em><b>References</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CF_VARIABLE__REFERENCES = 0;

   /**
    * The feature id for the '<em><b>Scope</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CF_VARIABLE__SCOPE = 1;

   /**
    * The feature id for the '<em><b>Reassignments</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CF_VARIABLE__REASSIGNMENTS = 2;

   /**
    * The feature id for the '<em><b>Constructor</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CF_VARIABLE__CONSTRUCTOR = 3;

   /**
    * The feature id for the '<em><b>Type</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CF_VARIABLE__TYPE = 4;

   /**
    * The feature id for the '<em><b>Destructors</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CF_VARIABLE__DESTRUCTORS = 5;

   /**
    * The feature id for the '<em><b>Local</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CF_VARIABLE__LOCAL = 6;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CF_VARIABLE__NAME = 7;

   /**
    * The number of structural features of the '<em>CF Variable</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CF_VARIABLE_FEATURE_COUNT = 8;

   /**
    * The operation id for the '<em>Is Only Defined</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CF_VARIABLE___IS_ONLY_DEFINED = 0;

   /**
    * The number of operations of the '<em>CF Variable</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CF_VARIABLE_OPERATION_COUNT = 1;

   /**
    * The meta object id for the '{@link org.moflon.sdm.runtime.democles.impl.BindingPatternInvocationImpl <em>Binding Pattern Invocation</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.runtime.democles.impl.BindingPatternInvocationImpl
    * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getBindingPatternInvocation()
    * @generated
    */
   int BINDING_PATTERN_INVOCATION = 11;

   /**
    * The feature id for the '<em><b>Reassigned Variables</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_PATTERN_INVOCATION__REASSIGNED_VARIABLES = REGULAR_PATTERN_INVOCATION__REASSIGNED_VARIABLES;

   /**
    * The feature id for the '<em><b>Cf Node</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_PATTERN_INVOCATION__CF_NODE = REGULAR_PATTERN_INVOCATION__CF_NODE;

   /**
    * The feature id for the '<em><b>Constructed Variables</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_PATTERN_INVOCATION__CONSTRUCTED_VARIABLES = REGULAR_PATTERN_INVOCATION__CONSTRUCTED_VARIABLES;

   /**
    * The feature id for the '<em><b>Next</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_PATTERN_INVOCATION__NEXT = REGULAR_PATTERN_INVOCATION__NEXT;

   /**
    * The feature id for the '<em><b>Prev</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_PATTERN_INVOCATION__PREV = REGULAR_PATTERN_INVOCATION__PREV;

   /**
    * The feature id for the '<em><b>Pattern</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_PATTERN_INVOCATION__PATTERN = REGULAR_PATTERN_INVOCATION__PATTERN;

   /**
    * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_PATTERN_INVOCATION__PARAMETERS = REGULAR_PATTERN_INVOCATION__PARAMETERS;

   /**
    * The number of structural features of the '<em>Binding Pattern Invocation</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_PATTERN_INVOCATION_FEATURE_COUNT = REGULAR_PATTERN_INVOCATION_FEATURE_COUNT + 0;

   /**
    * The operation id for the '<em>Has Referenced Free Parameters</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_PATTERN_INVOCATION___HAS_REFERENCED_FREE_PARAMETERS = REGULAR_PATTERN_INVOCATION___HAS_REFERENCED_FREE_PARAMETERS;

   /**
    * The operation id for the '<em>Is Multiple Match</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_PATTERN_INVOCATION___IS_MULTIPLE_MATCH = REGULAR_PATTERN_INVOCATION___IS_MULTIPLE_MATCH;

   /**
    * The number of operations of the '<em>Binding Pattern Invocation</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int BINDING_PATTERN_INVOCATION_OPERATION_COUNT = REGULAR_PATTERN_INVOCATION_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.moflon.sdm.runtime.democles.impl.SingleResultPatternInvocationImpl <em>Single Result Pattern Invocation</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.runtime.democles.impl.SingleResultPatternInvocationImpl
    * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getSingleResultPatternInvocation()
    * @generated
    */
   int SINGLE_RESULT_PATTERN_INVOCATION = 12;

   /**
    * The feature id for the '<em><b>Reassigned Variables</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION__REASSIGNED_VARIABLES = PATTERN_INVOCATION__REASSIGNED_VARIABLES;

   /**
    * The feature id for the '<em><b>Cf Node</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION__CF_NODE = PATTERN_INVOCATION__CF_NODE;

   /**
    * The feature id for the '<em><b>Constructed Variables</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION__CONSTRUCTED_VARIABLES = PATTERN_INVOCATION__CONSTRUCTED_VARIABLES;

   /**
    * The feature id for the '<em><b>Next</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION__NEXT = PATTERN_INVOCATION__NEXT;

   /**
    * The feature id for the '<em><b>Prev</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION__PREV = PATTERN_INVOCATION__PREV;

   /**
    * The feature id for the '<em><b>Pattern</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION__PATTERN = PATTERN_INVOCATION__PATTERN;

   /**
    * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION__PARAMETERS = PATTERN_INVOCATION__PARAMETERS;

   /**
    * The feature id for the '<em><b>Return Type</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION__RETURN_TYPE = PATTERN_INVOCATION_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Single Result Pattern Invocation</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION_FEATURE_COUNT = PATTERN_INVOCATION_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>Has Referenced Free Parameters</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION___HAS_REFERENCED_FREE_PARAMETERS = PATTERN_INVOCATION___HAS_REFERENCED_FREE_PARAMETERS;

   /**
    * The operation id for the '<em>Is Multiple Match</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION___IS_MULTIPLE_MATCH = PATTERN_INVOCATION___IS_MULTIPLE_MATCH;

   /**
    * The number of operations of the '<em>Single Result Pattern Invocation</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SINGLE_RESULT_PATTERN_INVOCATION_OPERATION_COUNT = PATTERN_INVOCATION_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.moflon.sdm.runtime.democles.impl.ScopeImpl <em>Scope</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.runtime.democles.impl.ScopeImpl
    * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getScope()
    * @generated
    */
   int SCOPE = 13;

   /**
    * The feature id for the '<em><b>Parent</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE__PARENT = 0;

   /**
    * The feature id for the '<em><b>Next Scope</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE__NEXT_SCOPE = 1;

   /**
    * The feature id for the '<em><b>Previous Scope</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE__PREVIOUS_SCOPE = 2;

   /**
    * The feature id for the '<em><b>Contents</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE__CONTENTS = 3;

   /**
    * The feature id for the '<em><b>Variables</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE__VARIABLES = 4;

   /**
    * The number of structural features of the '<em>Scope</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE_FEATURE_COUNT = 5;

   /**
    * The operation id for the '<em>Accept</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE___ACCEPT__VISITOR = 0;

   /**
    * The number of operations of the '<em>Scope</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SCOPE_OPERATION_COUNT = 1;

   /**
    * The meta object id for the '{@link org.moflon.sdm.runtime.democles.impl.VisitorImpl <em>Visitor</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.runtime.democles.impl.VisitorImpl
    * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getVisitor()
    * @generated
    */
   int VISITOR = 19;

   /**
    * The number of structural features of the '<em>Visitor</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VISITOR_FEATURE_COUNT = 0;

   /**
    * The operation id for the '<em>Visit Head Controlled Loop</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VISITOR___VISIT_HEAD_CONTROLLED_LOOP__HEADCONTROLLEDLOOP = 0;

   /**
    * The operation id for the '<em>Visit If Statement</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VISITOR___VISIT_IF_STATEMENT__IFSTATEMENT = 1;

   /**
    * The operation id for the '<em>Visit Node</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VISITOR___VISIT_NODE__CFNODE = 2;

   /**
    * The operation id for the '<em>Visit Scope</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VISITOR___VISIT_SCOPE__SCOPE = 3;

   /**
    * The operation id for the '<em>Visit Tail Controlled Loop</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VISITOR___VISIT_TAIL_CONTROLLED_LOOP__TAILCONTROLLEDLOOP = 4;

   /**
    * The operation id for the '<em>Visit For Each</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VISITOR___VISIT_FOR_EACH__FOREACH = 5;

   /**
    * The number of operations of the '<em>Visitor</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VISITOR_OPERATION_COUNT = 6;

   /**
    * The meta object id for the '{@link org.moflon.sdm.runtime.democles.impl.UniformNoOperationVisitorImpl <em>Uniform No Operation Visitor</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.runtime.democles.impl.UniformNoOperationVisitorImpl
    * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getUniformNoOperationVisitor()
    * @generated
    */
   int UNIFORM_NO_OPERATION_VISITOR = 15;

   /**
    * The number of structural features of the '<em>Uniform No Operation Visitor</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int UNIFORM_NO_OPERATION_VISITOR_FEATURE_COUNT = VISITOR_FEATURE_COUNT + 0;

   /**
    * The operation id for the '<em>Visit Node</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int UNIFORM_NO_OPERATION_VISITOR___VISIT_NODE__CFNODE = VISITOR___VISIT_NODE__CFNODE;

   /**
    * The operation id for the '<em>Visit Scope</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int UNIFORM_NO_OPERATION_VISITOR___VISIT_SCOPE__SCOPE = VISITOR___VISIT_SCOPE__SCOPE;

   /**
    * The operation id for the '<em>Visit For Each</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int UNIFORM_NO_OPERATION_VISITOR___VISIT_FOR_EACH__FOREACH = VISITOR_OPERATION_COUNT + 0;

   /**
    * The operation id for the '<em>Visit Head Controlled Loop</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int UNIFORM_NO_OPERATION_VISITOR___VISIT_HEAD_CONTROLLED_LOOP__HEADCONTROLLEDLOOP = VISITOR_OPERATION_COUNT + 1;

   /**
    * The operation id for the '<em>Visit If Statement</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int UNIFORM_NO_OPERATION_VISITOR___VISIT_IF_STATEMENT__IFSTATEMENT = VISITOR_OPERATION_COUNT + 2;

   /**
    * The operation id for the '<em>Visit Tail Controlled Loop</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int UNIFORM_NO_OPERATION_VISITOR___VISIT_TAIL_CONTROLLED_LOOP__TAILCONTROLLEDLOOP = VISITOR_OPERATION_COUNT + 3;

   /**
    * The number of operations of the '<em>Uniform No Operation Visitor</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int UNIFORM_NO_OPERATION_VISITOR_OPERATION_COUNT = VISITOR_OPERATION_COUNT + 4;

   /**
    * The meta object id for the '{@link org.moflon.sdm.runtime.democles.impl.NodeDeletionImpl <em>Node Deletion</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.runtime.democles.impl.NodeDeletionImpl
    * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getNodeDeletion()
    * @generated
    */
   int NODE_DELETION = 16;

   /**
    * The feature id for the '<em><b>Reassigned Variables</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE_DELETION__REASSIGNED_VARIABLES = ACTION__REASSIGNED_VARIABLES;

   /**
    * The feature id for the '<em><b>Cf Node</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE_DELETION__CF_NODE = ACTION__CF_NODE;

   /**
    * The feature id for the '<em><b>Constructed Variables</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE_DELETION__CONSTRUCTED_VARIABLES = ACTION__CONSTRUCTED_VARIABLES;

   /**
    * The feature id for the '<em><b>Next</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE_DELETION__NEXT = ACTION__NEXT;

   /**
    * The feature id for the '<em><b>Prev</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE_DELETION__PREV = ACTION__PREV;

   /**
    * The feature id for the '<em><b>Destructed Variables</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE_DELETION__DESTRUCTED_VARIABLES = ACTION_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Node Deletion</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE_DELETION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>Has Referenced Free Parameters</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE_DELETION___HAS_REFERENCED_FREE_PARAMETERS = ACTION___HAS_REFERENCED_FREE_PARAMETERS;

   /**
    * The number of operations of the '<em>Node Deletion</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE_DELETION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.moflon.sdm.runtime.democles.impl.IfStatementImpl <em>If Statement</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.runtime.democles.impl.IfStatementImpl
    * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getIfStatement()
    * @generated
    */
   int IF_STATEMENT = 17;

   /**
    * The feature id for the '<em><b>Scope</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IF_STATEMENT__SCOPE = COMPOUND_NODE__SCOPE;

   /**
    * The feature id for the '<em><b>Main Action</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IF_STATEMENT__MAIN_ACTION = COMPOUND_NODE__MAIN_ACTION;

   /**
    * The feature id for the '<em><b>Actions</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IF_STATEMENT__ACTIONS = COMPOUND_NODE__ACTIONS;

   /**
    * The feature id for the '<em><b>Next</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IF_STATEMENT__NEXT = COMPOUND_NODE__NEXT;

   /**
    * The feature id for the '<em><b>Prev</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IF_STATEMENT__PREV = COMPOUND_NODE__PREV;

   /**
    * The feature id for the '<em><b>Origin</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IF_STATEMENT__ORIGIN = COMPOUND_NODE__ORIGIN;

   /**
    * The feature id for the '<em><b>Header</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IF_STATEMENT__HEADER = COMPOUND_NODE__HEADER;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IF_STATEMENT__ID = COMPOUND_NODE__ID;

   /**
    * The feature id for the '<em><b>Scopes</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IF_STATEMENT__SCOPES = COMPOUND_NODE__SCOPES;

   /**
    * The number of structural features of the '<em>If Statement</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IF_STATEMENT_FEATURE_COUNT = COMPOUND_NODE_FEATURE_COUNT + 0;

   /**
    * The operation id for the '<em>Accept</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IF_STATEMENT___ACCEPT__VISITOR = COMPOUND_NODE_OPERATION_COUNT + 0;

   /**
    * The operation id for the '<em>Get Relevant Scope</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IF_STATEMENT___GET_RELEVANT_SCOPE = COMPOUND_NODE_OPERATION_COUNT + 1;

   /**
    * The number of operations of the '<em>If Statement</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IF_STATEMENT_OPERATION_COUNT = COMPOUND_NODE_OPERATION_COUNT + 2;

   /**
    * The meta object id for the '{@link org.moflon.sdm.runtime.democles.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.runtime.democles.impl.VariableReferenceImpl
    * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getVariableReference()
    * @generated
    */
   int VARIABLE_REFERENCE = 20;

   /**
    * The feature id for the '<em><b>Invocation</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE_REFERENCE__INVOCATION = 0;

   /**
    * The feature id for the '<em><b>To</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE_REFERENCE__TO = 1;

   /**
    * The feature id for the '<em><b>From</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE_REFERENCE__FROM = 2;

   /**
    * The number of structural features of the '<em>Variable Reference</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE_REFERENCE_FEATURE_COUNT = 3;

   /**
    * The operation id for the '<em>Is Free</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE_REFERENCE___IS_FREE = 0;

   /**
    * The operation id for the '<em>Is Constructed</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE_REFERENCE___IS_CONSTRUCTED = 1;

   /**
    * The operation id for the '<em>Is Reassigned</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE_REFERENCE___IS_REASSIGNED = 2;

   /**
    * The number of operations of the '<em>Variable Reference</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VARIABLE_REFERENCE_OPERATION_COUNT = 3;

   /**
    * The meta object id for the '<em>Adornment</em>' data type.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.gervarro.democles.common.Adornment
    * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getAdornment()
    * @generated
    */
   int ADORNMENT = 21;

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.runtime.democles.ContinueStatement <em>Continue Statement</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Continue Statement</em>'.
    * @see org.moflon.sdm.runtime.democles.ContinueStatement
    * @generated
    */
   EClass getContinueStatement();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.runtime.democles.RepetitionNode <em>Repetition Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Repetition Node</em>'.
    * @see org.moflon.sdm.runtime.democles.RepetitionNode
    * @generated
    */
   EClass getRepetitionNode();

   /**
    * Returns the meta object for the reference list '{@link org.moflon.sdm.runtime.democles.RepetitionNode#getLastNodes <em>Last Nodes</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Last Nodes</em>'.
    * @see org.moflon.sdm.runtime.democles.RepetitionNode#getLastNodes()
    * @see #getRepetitionNode()
    * @generated
    */
   EReference getRepetitionNode_LastNodes();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.runtime.democles.RepetitionNode#hasShortcuts() <em>Has Shortcuts</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Has Shortcuts</em>' operation.
    * @see org.moflon.sdm.runtime.democles.RepetitionNode#hasShortcuts()
    * @generated
    */
   EOperation getRepetitionNode__HasShortcuts();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.runtime.democles.Loop <em>Loop</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Loop</em>'.
    * @see org.moflon.sdm.runtime.democles.Loop
    * @generated
    */
   EClass getLoop();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.sdm.runtime.democles.Loop#isLoopAlongTrue <em>Loop Along True</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Loop Along True</em>'.
    * @see org.moflon.sdm.runtime.democles.Loop#isLoopAlongTrue()
    * @see #getLoop()
    * @generated
    */
   EAttribute getLoop_LoopAlongTrue();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.runtime.democles.Loop#getRelevantScope() <em>Get Relevant Scope</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Get Relevant Scope</em>' operation.
    * @see org.moflon.sdm.runtime.democles.Loop#getRelevantScope()
    * @generated
    */
   EOperation getLoop__GetRelevantScope();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.runtime.democles.ReturnStatement <em>Return Statement</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Return Statement</em>'.
    * @see org.moflon.sdm.runtime.democles.ReturnStatement
    * @generated
    */
   EClass getReturnStatement();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.runtime.democles.HeadControlledLoop <em>Head Controlled Loop</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Head Controlled Loop</em>'.
    * @see org.moflon.sdm.runtime.democles.HeadControlledLoop
    * @generated
    */
   EClass getHeadControlledLoop();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.runtime.democles.HeadControlledLoop#accept(org.moflon.sdm.runtime.democles.Visitor) <em>Accept</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Accept</em>' operation.
    * @see org.moflon.sdm.runtime.democles.HeadControlledLoop#accept(org.moflon.sdm.runtime.democles.Visitor)
    * @generated
    */
   EOperation getHeadControlledLoop__Accept__Visitor();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.runtime.democles.TailControlledLoop <em>Tail Controlled Loop</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Tail Controlled Loop</em>'.
    * @see org.moflon.sdm.runtime.democles.TailControlledLoop
    * @generated
    */
   EClass getTailControlledLoop();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.runtime.democles.TailControlledLoop#accept(org.moflon.sdm.runtime.democles.Visitor) <em>Accept</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Accept</em>' operation.
    * @see org.moflon.sdm.runtime.democles.TailControlledLoop#accept(org.moflon.sdm.runtime.democles.Visitor)
    * @generated
    */
   EOperation getTailControlledLoop__Accept__Visitor();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.runtime.democles.ForEach <em>For Each</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>For Each</em>'.
    * @see org.moflon.sdm.runtime.democles.ForEach
    * @generated
    */
   EClass getForEach();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.runtime.democles.ForEach#accept(org.moflon.sdm.runtime.democles.Visitor) <em>Accept</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Accept</em>' operation.
    * @see org.moflon.sdm.runtime.democles.ForEach#accept(org.moflon.sdm.runtime.democles.Visitor)
    * @generated
    */
   EOperation getForEach__Accept__Visitor();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.runtime.democles.CompoundNode <em>Compound Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Compound Node</em>'.
    * @see org.moflon.sdm.runtime.democles.CompoundNode
    * @generated
    */
   EClass getCompoundNode();

   /**
    * Returns the meta object for the containment reference list '{@link org.moflon.sdm.runtime.democles.CompoundNode#getScopes <em>Scopes</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Scopes</em>'.
    * @see org.moflon.sdm.runtime.democles.CompoundNode#getScopes()
    * @see #getCompoundNode()
    * @generated
    */
   EReference getCompoundNode_Scopes();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.runtime.democles.CompoundNode#getRelevantScope() <em>Get Relevant Scope</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Get Relevant Scope</em>' operation.
    * @see org.moflon.sdm.runtime.democles.CompoundNode#getRelevantScope()
    * @generated
    */
   EOperation getCompoundNode__GetRelevantScope();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.runtime.democles.RegularPatternInvocation <em>Regular Pattern Invocation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Regular Pattern Invocation</em>'.
    * @see org.moflon.sdm.runtime.democles.RegularPatternInvocation
    * @generated
    */
   EClass getRegularPatternInvocation();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.runtime.democles.RegularPatternInvocation#isMultipleMatch() <em>Is Multiple Match</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Is Multiple Match</em>' operation.
    * @see org.moflon.sdm.runtime.democles.RegularPatternInvocation#isMultipleMatch()
    * @generated
    */
   EOperation getRegularPatternInvocation__IsMultipleMatch();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.runtime.democles.CFVariable <em>CF Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>CF Variable</em>'.
    * @see org.moflon.sdm.runtime.democles.CFVariable
    * @generated
    */
   EClass getCFVariable();

   /**
    * Returns the meta object for the reference list '{@link org.moflon.sdm.runtime.democles.CFVariable#getReferences <em>References</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>References</em>'.
    * @see org.moflon.sdm.runtime.democles.CFVariable#getReferences()
    * @see #getCFVariable()
    * @generated
    */
   EReference getCFVariable_References();

   /**
    * Returns the meta object for the container reference '{@link org.moflon.sdm.runtime.democles.CFVariable#getScope <em>Scope</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Scope</em>'.
    * @see org.moflon.sdm.runtime.democles.CFVariable#getScope()
    * @see #getCFVariable()
    * @generated
    */
   EReference getCFVariable_Scope();

   /**
    * Returns the meta object for the reference list '{@link org.moflon.sdm.runtime.democles.CFVariable#getReassignments <em>Reassignments</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Reassignments</em>'.
    * @see org.moflon.sdm.runtime.democles.CFVariable#getReassignments()
    * @see #getCFVariable()
    * @generated
    */
   EReference getCFVariable_Reassignments();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.runtime.democles.CFVariable#getConstructor <em>Constructor</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Constructor</em>'.
    * @see org.moflon.sdm.runtime.democles.CFVariable#getConstructor()
    * @see #getCFVariable()
    * @generated
    */
   EReference getCFVariable_Constructor();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.runtime.democles.CFVariable#getType <em>Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Type</em>'.
    * @see org.moflon.sdm.runtime.democles.CFVariable#getType()
    * @see #getCFVariable()
    * @generated
    */
   EReference getCFVariable_Type();

   /**
    * Returns the meta object for the reference list '{@link org.moflon.sdm.runtime.democles.CFVariable#getDestructors <em>Destructors</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Destructors</em>'.
    * @see org.moflon.sdm.runtime.democles.CFVariable#getDestructors()
    * @see #getCFVariable()
    * @generated
    */
   EReference getCFVariable_Destructors();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.sdm.runtime.democles.CFVariable#isLocal <em>Local</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Local</em>'.
    * @see org.moflon.sdm.runtime.democles.CFVariable#isLocal()
    * @see #getCFVariable()
    * @generated
    */
   EAttribute getCFVariable_Local();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.sdm.runtime.democles.CFVariable#getName <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see org.moflon.sdm.runtime.democles.CFVariable#getName()
    * @see #getCFVariable()
    * @generated
    */
   EAttribute getCFVariable_Name();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.runtime.democles.CFVariable#isOnlyDefined() <em>Is Only Defined</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Is Only Defined</em>' operation.
    * @see org.moflon.sdm.runtime.democles.CFVariable#isOnlyDefined()
    * @generated
    */
   EOperation getCFVariable__IsOnlyDefined();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.runtime.democles.CFNode <em>CF Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>CF Node</em>'.
    * @see org.moflon.sdm.runtime.democles.CFNode
    * @generated
    */
   EClass getCFNode();

   /**
    * Returns the meta object for the container reference '{@link org.moflon.sdm.runtime.democles.CFNode#getScope <em>Scope</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Scope</em>'.
    * @see org.moflon.sdm.runtime.democles.CFNode#getScope()
    * @see #getCFNode()
    * @generated
    */
   EReference getCFNode_Scope();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.runtime.democles.CFNode#getMainAction <em>Main Action</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Main Action</em>'.
    * @see org.moflon.sdm.runtime.democles.CFNode#getMainAction()
    * @see #getCFNode()
    * @generated
    */
   EReference getCFNode_MainAction();

   /**
    * Returns the meta object for the containment reference list '{@link org.moflon.sdm.runtime.democles.CFNode#getActions <em>Actions</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Actions</em>'.
    * @see org.moflon.sdm.runtime.democles.CFNode#getActions()
    * @see #getCFNode()
    * @generated
    */
   EReference getCFNode_Actions();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.runtime.democles.CFNode#getNext <em>Next</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Next</em>'.
    * @see org.moflon.sdm.runtime.democles.CFNode#getNext()
    * @see #getCFNode()
    * @generated
    */
   EReference getCFNode_Next();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.runtime.democles.CFNode#getPrev <em>Prev</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Prev</em>'.
    * @see org.moflon.sdm.runtime.democles.CFNode#getPrev()
    * @see #getCFNode()
    * @generated
    */
   EReference getCFNode_Prev();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.runtime.democles.CFNode#getOrigin <em>Origin</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Origin</em>'.
    * @see org.moflon.sdm.runtime.democles.CFNode#getOrigin()
    * @see #getCFNode()
    * @generated
    */
   EReference getCFNode_Origin();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.runtime.democles.CFNode#getHeader <em>Header</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Header</em>'.
    * @see org.moflon.sdm.runtime.democles.CFNode#getHeader()
    * @see #getCFNode()
    * @generated
    */
   EReference getCFNode_Header();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.sdm.runtime.democles.CFNode#getId <em>Id</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Id</em>'.
    * @see org.moflon.sdm.runtime.democles.CFNode#getId()
    * @see #getCFNode()
    * @generated
    */
   EAttribute getCFNode_Id();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.runtime.democles.CFNode#accept(org.moflon.sdm.runtime.democles.Visitor) <em>Accept</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Accept</em>' operation.
    * @see org.moflon.sdm.runtime.democles.CFNode#accept(org.moflon.sdm.runtime.democles.Visitor)
    * @generated
    */
   EOperation getCFNode__Accept__Visitor();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.runtime.democles.CFNode#getRelevantScope() <em>Get Relevant Scope</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Get Relevant Scope</em>' operation.
    * @see org.moflon.sdm.runtime.democles.CFNode#getRelevantScope()
    * @generated
    */
   EOperation getCFNode__GetRelevantScope();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.runtime.democles.BindingPatternInvocation <em>Binding Pattern Invocation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Binding Pattern Invocation</em>'.
    * @see org.moflon.sdm.runtime.democles.BindingPatternInvocation
    * @generated
    */
   EClass getBindingPatternInvocation();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.runtime.democles.SingleResultPatternInvocation <em>Single Result Pattern Invocation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Single Result Pattern Invocation</em>'.
    * @see org.moflon.sdm.runtime.democles.SingleResultPatternInvocation
    * @generated
    */
   EClass getSingleResultPatternInvocation();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.runtime.democles.SingleResultPatternInvocation#getReturnType <em>Return Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Return Type</em>'.
    * @see org.moflon.sdm.runtime.democles.SingleResultPatternInvocation#getReturnType()
    * @see #getSingleResultPatternInvocation()
    * @generated
    */
   EReference getSingleResultPatternInvocation_ReturnType();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.runtime.democles.Scope <em>Scope</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Scope</em>'.
    * @see org.moflon.sdm.runtime.democles.Scope
    * @generated
    */
   EClass getScope();

   /**
    * Returns the meta object for the container reference '{@link org.moflon.sdm.runtime.democles.Scope#getParent <em>Parent</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Parent</em>'.
    * @see org.moflon.sdm.runtime.democles.Scope#getParent()
    * @see #getScope()
    * @generated
    */
   EReference getScope_Parent();

   /**
    * Returns the meta object for the containment reference '{@link org.moflon.sdm.runtime.democles.Scope#getNextScope <em>Next Scope</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Next Scope</em>'.
    * @see org.moflon.sdm.runtime.democles.Scope#getNextScope()
    * @see #getScope()
    * @generated
    */
   EReference getScope_NextScope();

   /**
    * Returns the meta object for the container reference '{@link org.moflon.sdm.runtime.democles.Scope#getPreviousScope <em>Previous Scope</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Previous Scope</em>'.
    * @see org.moflon.sdm.runtime.democles.Scope#getPreviousScope()
    * @see #getScope()
    * @generated
    */
   EReference getScope_PreviousScope();

   /**
    * Returns the meta object for the containment reference list '{@link org.moflon.sdm.runtime.democles.Scope#getContents <em>Contents</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Contents</em>'.
    * @see org.moflon.sdm.runtime.democles.Scope#getContents()
    * @see #getScope()
    * @generated
    */
   EReference getScope_Contents();

   /**
    * Returns the meta object for the containment reference list '{@link org.moflon.sdm.runtime.democles.Scope#getVariables <em>Variables</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Variables</em>'.
    * @see org.moflon.sdm.runtime.democles.Scope#getVariables()
    * @see #getScope()
    * @generated
    */
   EReference getScope_Variables();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.runtime.democles.Scope#accept(org.moflon.sdm.runtime.democles.Visitor) <em>Accept</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Accept</em>' operation.
    * @see org.moflon.sdm.runtime.democles.Scope#accept(org.moflon.sdm.runtime.democles.Visitor)
    * @generated
    */
   EOperation getScope__Accept__Visitor();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.runtime.democles.Action <em>Action</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Action</em>'.
    * @see org.moflon.sdm.runtime.democles.Action
    * @generated
    */
   EClass getAction();

   /**
    * Returns the meta object for the reference list '{@link org.moflon.sdm.runtime.democles.Action#getReassignedVariables <em>Reassigned Variables</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Reassigned Variables</em>'.
    * @see org.moflon.sdm.runtime.democles.Action#getReassignedVariables()
    * @see #getAction()
    * @generated
    */
   EReference getAction_ReassignedVariables();

   /**
    * Returns the meta object for the container reference '{@link org.moflon.sdm.runtime.democles.Action#getCfNode <em>Cf Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Cf Node</em>'.
    * @see org.moflon.sdm.runtime.democles.Action#getCfNode()
    * @see #getAction()
    * @generated
    */
   EReference getAction_CfNode();

   /**
    * Returns the meta object for the reference list '{@link org.moflon.sdm.runtime.democles.Action#getConstructedVariables <em>Constructed Variables</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Constructed Variables</em>'.
    * @see org.moflon.sdm.runtime.democles.Action#getConstructedVariables()
    * @see #getAction()
    * @generated
    */
   EReference getAction_ConstructedVariables();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.runtime.democles.Action#getNext <em>Next</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Next</em>'.
    * @see org.moflon.sdm.runtime.democles.Action#getNext()
    * @see #getAction()
    * @generated
    */
   EReference getAction_Next();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.runtime.democles.Action#getPrev <em>Prev</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Prev</em>'.
    * @see org.moflon.sdm.runtime.democles.Action#getPrev()
    * @see #getAction()
    * @generated
    */
   EReference getAction_Prev();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.runtime.democles.Action#hasReferencedFreeParameters() <em>Has Referenced Free Parameters</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Has Referenced Free Parameters</em>' operation.
    * @see org.moflon.sdm.runtime.democles.Action#hasReferencedFreeParameters()
    * @generated
    */
   EOperation getAction__HasReferencedFreeParameters();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.runtime.democles.UniformNoOperationVisitor <em>Uniform No Operation Visitor</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Uniform No Operation Visitor</em>'.
    * @see org.moflon.sdm.runtime.democles.UniformNoOperationVisitor
    * @generated
    */
   EClass getUniformNoOperationVisitor();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.runtime.democles.UniformNoOperationVisitor#visitForEach(org.moflon.sdm.runtime.democles.ForEach) <em>Visit For Each</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Visit For Each</em>' operation.
    * @see org.moflon.sdm.runtime.democles.UniformNoOperationVisitor#visitForEach(org.moflon.sdm.runtime.democles.ForEach)
    * @generated
    */
   EOperation getUniformNoOperationVisitor__VisitForEach__ForEach();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.runtime.democles.UniformNoOperationVisitor#visitHeadControlledLoop(org.moflon.sdm.runtime.democles.HeadControlledLoop) <em>Visit Head Controlled Loop</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Visit Head Controlled Loop</em>' operation.
    * @see org.moflon.sdm.runtime.democles.UniformNoOperationVisitor#visitHeadControlledLoop(org.moflon.sdm.runtime.democles.HeadControlledLoop)
    * @generated
    */
   EOperation getUniformNoOperationVisitor__VisitHeadControlledLoop__HeadControlledLoop();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.runtime.democles.UniformNoOperationVisitor#visitIfStatement(org.moflon.sdm.runtime.democles.IfStatement) <em>Visit If Statement</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Visit If Statement</em>' operation.
    * @see org.moflon.sdm.runtime.democles.UniformNoOperationVisitor#visitIfStatement(org.moflon.sdm.runtime.democles.IfStatement)
    * @generated
    */
   EOperation getUniformNoOperationVisitor__VisitIfStatement__IfStatement();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.runtime.democles.UniformNoOperationVisitor#visitTailControlledLoop(org.moflon.sdm.runtime.democles.TailControlledLoop) <em>Visit Tail Controlled Loop</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Visit Tail Controlled Loop</em>' operation.
    * @see org.moflon.sdm.runtime.democles.UniformNoOperationVisitor#visitTailControlledLoop(org.moflon.sdm.runtime.democles.TailControlledLoop)
    * @generated
    */
   EOperation getUniformNoOperationVisitor__VisitTailControlledLoop__TailControlledLoop();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.runtime.democles.NodeDeletion <em>Node Deletion</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Node Deletion</em>'.
    * @see org.moflon.sdm.runtime.democles.NodeDeletion
    * @generated
    */
   EClass getNodeDeletion();

   /**
    * Returns the meta object for the reference list '{@link org.moflon.sdm.runtime.democles.NodeDeletion#getDestructedVariables <em>Destructed Variables</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Destructed Variables</em>'.
    * @see org.moflon.sdm.runtime.democles.NodeDeletion#getDestructedVariables()
    * @see #getNodeDeletion()
    * @generated
    */
   EReference getNodeDeletion_DestructedVariables();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.runtime.democles.IfStatement <em>If Statement</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>If Statement</em>'.
    * @see org.moflon.sdm.runtime.democles.IfStatement
    * @generated
    */
   EClass getIfStatement();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.runtime.democles.IfStatement#accept(org.moflon.sdm.runtime.democles.Visitor) <em>Accept</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Accept</em>' operation.
    * @see org.moflon.sdm.runtime.democles.IfStatement#accept(org.moflon.sdm.runtime.democles.Visitor)
    * @generated
    */
   EOperation getIfStatement__Accept__Visitor();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.runtime.democles.IfStatement#getRelevantScope() <em>Get Relevant Scope</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Get Relevant Scope</em>' operation.
    * @see org.moflon.sdm.runtime.democles.IfStatement#getRelevantScope()
    * @generated
    */
   EOperation getIfStatement__GetRelevantScope();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.runtime.democles.PatternInvocation <em>Pattern Invocation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Pattern Invocation</em>'.
    * @see org.moflon.sdm.runtime.democles.PatternInvocation
    * @generated
    */
   EClass getPatternInvocation();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.runtime.democles.PatternInvocation#getPattern <em>Pattern</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Pattern</em>'.
    * @see org.moflon.sdm.runtime.democles.PatternInvocation#getPattern()
    * @see #getPatternInvocation()
    * @generated
    */
   EReference getPatternInvocation_Pattern();

   /**
    * Returns the meta object for the containment reference list '{@link org.moflon.sdm.runtime.democles.PatternInvocation#getParameters <em>Parameters</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Parameters</em>'.
    * @see org.moflon.sdm.runtime.democles.PatternInvocation#getParameters()
    * @see #getPatternInvocation()
    * @generated
    */
   EReference getPatternInvocation_Parameters();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.runtime.democles.PatternInvocation#hasReferencedFreeParameters() <em>Has Referenced Free Parameters</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Has Referenced Free Parameters</em>' operation.
    * @see org.moflon.sdm.runtime.democles.PatternInvocation#hasReferencedFreeParameters()
    * @generated
    */
   EOperation getPatternInvocation__HasReferencedFreeParameters();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.runtime.democles.PatternInvocation#isMultipleMatch() <em>Is Multiple Match</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Is Multiple Match</em>' operation.
    * @see org.moflon.sdm.runtime.democles.PatternInvocation#isMultipleMatch()
    * @generated
    */
   EOperation getPatternInvocation__IsMultipleMatch();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.runtime.democles.Visitor <em>Visitor</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Visitor</em>'.
    * @see org.moflon.sdm.runtime.democles.Visitor
    * @generated
    */
   EClass getVisitor();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.runtime.democles.Visitor#visitHeadControlledLoop(org.moflon.sdm.runtime.democles.HeadControlledLoop) <em>Visit Head Controlled Loop</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Visit Head Controlled Loop</em>' operation.
    * @see org.moflon.sdm.runtime.democles.Visitor#visitHeadControlledLoop(org.moflon.sdm.runtime.democles.HeadControlledLoop)
    * @generated
    */
   EOperation getVisitor__VisitHeadControlledLoop__HeadControlledLoop();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.runtime.democles.Visitor#visitIfStatement(org.moflon.sdm.runtime.democles.IfStatement) <em>Visit If Statement</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Visit If Statement</em>' operation.
    * @see org.moflon.sdm.runtime.democles.Visitor#visitIfStatement(org.moflon.sdm.runtime.democles.IfStatement)
    * @generated
    */
   EOperation getVisitor__VisitIfStatement__IfStatement();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.runtime.democles.Visitor#visitNode(org.moflon.sdm.runtime.democles.CFNode) <em>Visit Node</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Visit Node</em>' operation.
    * @see org.moflon.sdm.runtime.democles.Visitor#visitNode(org.moflon.sdm.runtime.democles.CFNode)
    * @generated
    */
   EOperation getVisitor__VisitNode__CFNode();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.runtime.democles.Visitor#visitScope(org.moflon.sdm.runtime.democles.Scope) <em>Visit Scope</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Visit Scope</em>' operation.
    * @see org.moflon.sdm.runtime.democles.Visitor#visitScope(org.moflon.sdm.runtime.democles.Scope)
    * @generated
    */
   EOperation getVisitor__VisitScope__Scope();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.runtime.democles.Visitor#visitTailControlledLoop(org.moflon.sdm.runtime.democles.TailControlledLoop) <em>Visit Tail Controlled Loop</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Visit Tail Controlled Loop</em>' operation.
    * @see org.moflon.sdm.runtime.democles.Visitor#visitTailControlledLoop(org.moflon.sdm.runtime.democles.TailControlledLoop)
    * @generated
    */
   EOperation getVisitor__VisitTailControlledLoop__TailControlledLoop();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.runtime.democles.Visitor#visitForEach(org.moflon.sdm.runtime.democles.ForEach) <em>Visit For Each</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Visit For Each</em>' operation.
    * @see org.moflon.sdm.runtime.democles.Visitor#visitForEach(org.moflon.sdm.runtime.democles.ForEach)
    * @generated
    */
   EOperation getVisitor__VisitForEach__ForEach();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.runtime.democles.VariableReference <em>Variable Reference</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Variable Reference</em>'.
    * @see org.moflon.sdm.runtime.democles.VariableReference
    * @generated
    */
   EClass getVariableReference();

   /**
    * Returns the meta object for the container reference '{@link org.moflon.sdm.runtime.democles.VariableReference#getInvocation <em>Invocation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Invocation</em>'.
    * @see org.moflon.sdm.runtime.democles.VariableReference#getInvocation()
    * @see #getVariableReference()
    * @generated
    */
   EReference getVariableReference_Invocation();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.runtime.democles.VariableReference#getTo <em>To</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>To</em>'.
    * @see org.moflon.sdm.runtime.democles.VariableReference#getTo()
    * @see #getVariableReference()
    * @generated
    */
   EReference getVariableReference_To();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.runtime.democles.VariableReference#getFrom <em>From</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>From</em>'.
    * @see org.moflon.sdm.runtime.democles.VariableReference#getFrom()
    * @see #getVariableReference()
    * @generated
    */
   EReference getVariableReference_From();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.runtime.democles.VariableReference#isFree() <em>Is Free</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Is Free</em>' operation.
    * @see org.moflon.sdm.runtime.democles.VariableReference#isFree()
    * @generated
    */
   EOperation getVariableReference__IsFree();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.runtime.democles.VariableReference#isConstructed() <em>Is Constructed</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Is Constructed</em>' operation.
    * @see org.moflon.sdm.runtime.democles.VariableReference#isConstructed()
    * @generated
    */
   EOperation getVariableReference__IsConstructed();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.runtime.democles.VariableReference#isReassigned() <em>Is Reassigned</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Is Reassigned</em>' operation.
    * @see org.moflon.sdm.runtime.democles.VariableReference#isReassigned()
    * @generated
    */
   EOperation getVariableReference__IsReassigned();

   /**
    * Returns the meta object for data type '{@link org.gervarro.democles.common.Adornment <em>Adornment</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for data type '<em>Adornment</em>'.
    * @see org.gervarro.democles.common.Adornment
    * @model instanceClass="org.gervarro.democles.common.Adornment"
    * @generated
    */
   EDataType getAdornment();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   DemoclesFactory getDemoclesFactory();

   /**
    * <!-- begin-user-doc -->
    * Defines literals for the meta objects that represent
    * <ul>
    *   <li>each class,</li>
    *   <li>each feature of each class,</li>
    *   <li>each operation of each class,</li>
    *   <li>each enum,</li>
    *   <li>and each data type</li>
    * </ul>
    * <!-- end-user-doc -->
    * @generated
    */
   interface Literals
   {
      /**
       * The meta object literal for the '{@link org.moflon.sdm.runtime.democles.impl.ContinueStatementImpl <em>Continue Statement</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.runtime.democles.impl.ContinueStatementImpl
       * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getContinueStatement()
       * @generated
       */
      EClass CONTINUE_STATEMENT = eINSTANCE.getContinueStatement();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.runtime.democles.impl.RepetitionNodeImpl <em>Repetition Node</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.runtime.democles.impl.RepetitionNodeImpl
       * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getRepetitionNode()
       * @generated
       */
      EClass REPETITION_NODE = eINSTANCE.getRepetitionNode();

      /**
       * The meta object literal for the '<em><b>Last Nodes</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference REPETITION_NODE__LAST_NODES = eINSTANCE.getRepetitionNode_LastNodes();

      /**
       * The meta object literal for the '<em><b>Has Shortcuts</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation REPETITION_NODE___HAS_SHORTCUTS = eINSTANCE.getRepetitionNode__HasShortcuts();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.runtime.democles.impl.LoopImpl <em>Loop</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.runtime.democles.impl.LoopImpl
       * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getLoop()
       * @generated
       */
      EClass LOOP = eINSTANCE.getLoop();

      /**
       * The meta object literal for the '<em><b>Loop Along True</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute LOOP__LOOP_ALONG_TRUE = eINSTANCE.getLoop_LoopAlongTrue();

      /**
       * The meta object literal for the '<em><b>Get Relevant Scope</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation LOOP___GET_RELEVANT_SCOPE = eINSTANCE.getLoop__GetRelevantScope();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.runtime.democles.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.runtime.democles.impl.ReturnStatementImpl
       * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getReturnStatement()
       * @generated
       */
      EClass RETURN_STATEMENT = eINSTANCE.getReturnStatement();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.runtime.democles.impl.HeadControlledLoopImpl <em>Head Controlled Loop</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.runtime.democles.impl.HeadControlledLoopImpl
       * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getHeadControlledLoop()
       * @generated
       */
      EClass HEAD_CONTROLLED_LOOP = eINSTANCE.getHeadControlledLoop();

      /**
       * The meta object literal for the '<em><b>Accept</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation HEAD_CONTROLLED_LOOP___ACCEPT__VISITOR = eINSTANCE.getHeadControlledLoop__Accept__Visitor();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.runtime.democles.impl.TailControlledLoopImpl <em>Tail Controlled Loop</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.runtime.democles.impl.TailControlledLoopImpl
       * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getTailControlledLoop()
       * @generated
       */
      EClass TAIL_CONTROLLED_LOOP = eINSTANCE.getTailControlledLoop();

      /**
       * The meta object literal for the '<em><b>Accept</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation TAIL_CONTROLLED_LOOP___ACCEPT__VISITOR = eINSTANCE.getTailControlledLoop__Accept__Visitor();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.runtime.democles.impl.ForEachImpl <em>For Each</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.runtime.democles.impl.ForEachImpl
       * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getForEach()
       * @generated
       */
      EClass FOR_EACH = eINSTANCE.getForEach();

      /**
       * The meta object literal for the '<em><b>Accept</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation FOR_EACH___ACCEPT__VISITOR = eINSTANCE.getForEach__Accept__Visitor();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.runtime.democles.impl.CompoundNodeImpl <em>Compound Node</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.runtime.democles.impl.CompoundNodeImpl
       * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getCompoundNode()
       * @generated
       */
      EClass COMPOUND_NODE = eINSTANCE.getCompoundNode();

      /**
       * The meta object literal for the '<em><b>Scopes</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference COMPOUND_NODE__SCOPES = eINSTANCE.getCompoundNode_Scopes();

      /**
       * The meta object literal for the '<em><b>Get Relevant Scope</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation COMPOUND_NODE___GET_RELEVANT_SCOPE = eINSTANCE.getCompoundNode__GetRelevantScope();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.runtime.democles.impl.RegularPatternInvocationImpl <em>Regular Pattern Invocation</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.runtime.democles.impl.RegularPatternInvocationImpl
       * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getRegularPatternInvocation()
       * @generated
       */
      EClass REGULAR_PATTERN_INVOCATION = eINSTANCE.getRegularPatternInvocation();

      /**
       * The meta object literal for the '<em><b>Is Multiple Match</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation REGULAR_PATTERN_INVOCATION___IS_MULTIPLE_MATCH = eINSTANCE.getRegularPatternInvocation__IsMultipleMatch();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.runtime.democles.impl.CFVariableImpl <em>CF Variable</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.runtime.democles.impl.CFVariableImpl
       * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getCFVariable()
       * @generated
       */
      EClass CF_VARIABLE = eINSTANCE.getCFVariable();

      /**
       * The meta object literal for the '<em><b>References</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference CF_VARIABLE__REFERENCES = eINSTANCE.getCFVariable_References();

      /**
       * The meta object literal for the '<em><b>Scope</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference CF_VARIABLE__SCOPE = eINSTANCE.getCFVariable_Scope();

      /**
       * The meta object literal for the '<em><b>Reassignments</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference CF_VARIABLE__REASSIGNMENTS = eINSTANCE.getCFVariable_Reassignments();

      /**
       * The meta object literal for the '<em><b>Constructor</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference CF_VARIABLE__CONSTRUCTOR = eINSTANCE.getCFVariable_Constructor();

      /**
       * The meta object literal for the '<em><b>Type</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference CF_VARIABLE__TYPE = eINSTANCE.getCFVariable_Type();

      /**
       * The meta object literal for the '<em><b>Destructors</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference CF_VARIABLE__DESTRUCTORS = eINSTANCE.getCFVariable_Destructors();

      /**
       * The meta object literal for the '<em><b>Local</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute CF_VARIABLE__LOCAL = eINSTANCE.getCFVariable_Local();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute CF_VARIABLE__NAME = eINSTANCE.getCFVariable_Name();

      /**
       * The meta object literal for the '<em><b>Is Only Defined</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation CF_VARIABLE___IS_ONLY_DEFINED = eINSTANCE.getCFVariable__IsOnlyDefined();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.runtime.democles.impl.CFNodeImpl <em>CF Node</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.runtime.democles.impl.CFNodeImpl
       * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getCFNode()
       * @generated
       */
      EClass CF_NODE = eINSTANCE.getCFNode();

      /**
       * The meta object literal for the '<em><b>Scope</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference CF_NODE__SCOPE = eINSTANCE.getCFNode_Scope();

      /**
       * The meta object literal for the '<em><b>Main Action</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference CF_NODE__MAIN_ACTION = eINSTANCE.getCFNode_MainAction();

      /**
       * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference CF_NODE__ACTIONS = eINSTANCE.getCFNode_Actions();

      /**
       * The meta object literal for the '<em><b>Next</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference CF_NODE__NEXT = eINSTANCE.getCFNode_Next();

      /**
       * The meta object literal for the '<em><b>Prev</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference CF_NODE__PREV = eINSTANCE.getCFNode_Prev();

      /**
       * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference CF_NODE__ORIGIN = eINSTANCE.getCFNode_Origin();

      /**
       * The meta object literal for the '<em><b>Header</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference CF_NODE__HEADER = eINSTANCE.getCFNode_Header();

      /**
       * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute CF_NODE__ID = eINSTANCE.getCFNode_Id();

      /**
       * The meta object literal for the '<em><b>Accept</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation CF_NODE___ACCEPT__VISITOR = eINSTANCE.getCFNode__Accept__Visitor();

      /**
       * The meta object literal for the '<em><b>Get Relevant Scope</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation CF_NODE___GET_RELEVANT_SCOPE = eINSTANCE.getCFNode__GetRelevantScope();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.runtime.democles.impl.BindingPatternInvocationImpl <em>Binding Pattern Invocation</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.runtime.democles.impl.BindingPatternInvocationImpl
       * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getBindingPatternInvocation()
       * @generated
       */
      EClass BINDING_PATTERN_INVOCATION = eINSTANCE.getBindingPatternInvocation();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.runtime.democles.impl.SingleResultPatternInvocationImpl <em>Single Result Pattern Invocation</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.runtime.democles.impl.SingleResultPatternInvocationImpl
       * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getSingleResultPatternInvocation()
       * @generated
       */
      EClass SINGLE_RESULT_PATTERN_INVOCATION = eINSTANCE.getSingleResultPatternInvocation();

      /**
       * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SINGLE_RESULT_PATTERN_INVOCATION__RETURN_TYPE = eINSTANCE.getSingleResultPatternInvocation_ReturnType();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.runtime.democles.impl.ScopeImpl <em>Scope</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.runtime.democles.impl.ScopeImpl
       * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getScope()
       * @generated
       */
      EClass SCOPE = eINSTANCE.getScope();

      /**
       * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SCOPE__PARENT = eINSTANCE.getScope_Parent();

      /**
       * The meta object literal for the '<em><b>Next Scope</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SCOPE__NEXT_SCOPE = eINSTANCE.getScope_NextScope();

      /**
       * The meta object literal for the '<em><b>Previous Scope</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SCOPE__PREVIOUS_SCOPE = eINSTANCE.getScope_PreviousScope();

      /**
       * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SCOPE__CONTENTS = eINSTANCE.getScope_Contents();

      /**
       * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SCOPE__VARIABLES = eINSTANCE.getScope_Variables();

      /**
       * The meta object literal for the '<em><b>Accept</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation SCOPE___ACCEPT__VISITOR = eINSTANCE.getScope__Accept__Visitor();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.runtime.democles.impl.ActionImpl <em>Action</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.runtime.democles.impl.ActionImpl
       * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getAction()
       * @generated
       */
      EClass ACTION = eINSTANCE.getAction();

      /**
       * The meta object literal for the '<em><b>Reassigned Variables</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTION__REASSIGNED_VARIABLES = eINSTANCE.getAction_ReassignedVariables();

      /**
       * The meta object literal for the '<em><b>Cf Node</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTION__CF_NODE = eINSTANCE.getAction_CfNode();

      /**
       * The meta object literal for the '<em><b>Constructed Variables</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTION__CONSTRUCTED_VARIABLES = eINSTANCE.getAction_ConstructedVariables();

      /**
       * The meta object literal for the '<em><b>Next</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTION__NEXT = eINSTANCE.getAction_Next();

      /**
       * The meta object literal for the '<em><b>Prev</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference ACTION__PREV = eINSTANCE.getAction_Prev();

      /**
       * The meta object literal for the '<em><b>Has Referenced Free Parameters</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation ACTION___HAS_REFERENCED_FREE_PARAMETERS = eINSTANCE.getAction__HasReferencedFreeParameters();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.runtime.democles.impl.UniformNoOperationVisitorImpl <em>Uniform No Operation Visitor</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.runtime.democles.impl.UniformNoOperationVisitorImpl
       * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getUniformNoOperationVisitor()
       * @generated
       */
      EClass UNIFORM_NO_OPERATION_VISITOR = eINSTANCE.getUniformNoOperationVisitor();

      /**
       * The meta object literal for the '<em><b>Visit For Each</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation UNIFORM_NO_OPERATION_VISITOR___VISIT_FOR_EACH__FOREACH = eINSTANCE.getUniformNoOperationVisitor__VisitForEach__ForEach();

      /**
       * The meta object literal for the '<em><b>Visit Head Controlled Loop</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation UNIFORM_NO_OPERATION_VISITOR___VISIT_HEAD_CONTROLLED_LOOP__HEADCONTROLLEDLOOP = eINSTANCE
            .getUniformNoOperationVisitor__VisitHeadControlledLoop__HeadControlledLoop();

      /**
       * The meta object literal for the '<em><b>Visit If Statement</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation UNIFORM_NO_OPERATION_VISITOR___VISIT_IF_STATEMENT__IFSTATEMENT = eINSTANCE.getUniformNoOperationVisitor__VisitIfStatement__IfStatement();

      /**
       * The meta object literal for the '<em><b>Visit Tail Controlled Loop</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation UNIFORM_NO_OPERATION_VISITOR___VISIT_TAIL_CONTROLLED_LOOP__TAILCONTROLLEDLOOP = eINSTANCE
            .getUniformNoOperationVisitor__VisitTailControlledLoop__TailControlledLoop();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.runtime.democles.impl.NodeDeletionImpl <em>Node Deletion</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.runtime.democles.impl.NodeDeletionImpl
       * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getNodeDeletion()
       * @generated
       */
      EClass NODE_DELETION = eINSTANCE.getNodeDeletion();

      /**
       * The meta object literal for the '<em><b>Destructed Variables</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference NODE_DELETION__DESTRUCTED_VARIABLES = eINSTANCE.getNodeDeletion_DestructedVariables();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.runtime.democles.impl.IfStatementImpl <em>If Statement</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.runtime.democles.impl.IfStatementImpl
       * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getIfStatement()
       * @generated
       */
      EClass IF_STATEMENT = eINSTANCE.getIfStatement();

      /**
       * The meta object literal for the '<em><b>Accept</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation IF_STATEMENT___ACCEPT__VISITOR = eINSTANCE.getIfStatement__Accept__Visitor();

      /**
       * The meta object literal for the '<em><b>Get Relevant Scope</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation IF_STATEMENT___GET_RELEVANT_SCOPE = eINSTANCE.getIfStatement__GetRelevantScope();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.runtime.democles.impl.PatternInvocationImpl <em>Pattern Invocation</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.runtime.democles.impl.PatternInvocationImpl
       * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getPatternInvocation()
       * @generated
       */
      EClass PATTERN_INVOCATION = eINSTANCE.getPatternInvocation();

      /**
       * The meta object literal for the '<em><b>Pattern</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PATTERN_INVOCATION__PATTERN = eINSTANCE.getPatternInvocation_Pattern();

      /**
       * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference PATTERN_INVOCATION__PARAMETERS = eINSTANCE.getPatternInvocation_Parameters();

      /**
       * The meta object literal for the '<em><b>Has Referenced Free Parameters</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation PATTERN_INVOCATION___HAS_REFERENCED_FREE_PARAMETERS = eINSTANCE.getPatternInvocation__HasReferencedFreeParameters();

      /**
       * The meta object literal for the '<em><b>Is Multiple Match</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation PATTERN_INVOCATION___IS_MULTIPLE_MATCH = eINSTANCE.getPatternInvocation__IsMultipleMatch();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.runtime.democles.impl.VisitorImpl <em>Visitor</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.runtime.democles.impl.VisitorImpl
       * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getVisitor()
       * @generated
       */
      EClass VISITOR = eINSTANCE.getVisitor();

      /**
       * The meta object literal for the '<em><b>Visit Head Controlled Loop</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation VISITOR___VISIT_HEAD_CONTROLLED_LOOP__HEADCONTROLLEDLOOP = eINSTANCE.getVisitor__VisitHeadControlledLoop__HeadControlledLoop();

      /**
       * The meta object literal for the '<em><b>Visit If Statement</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation VISITOR___VISIT_IF_STATEMENT__IFSTATEMENT = eINSTANCE.getVisitor__VisitIfStatement__IfStatement();

      /**
       * The meta object literal for the '<em><b>Visit Node</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation VISITOR___VISIT_NODE__CFNODE = eINSTANCE.getVisitor__VisitNode__CFNode();

      /**
       * The meta object literal for the '<em><b>Visit Scope</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation VISITOR___VISIT_SCOPE__SCOPE = eINSTANCE.getVisitor__VisitScope__Scope();

      /**
       * The meta object literal for the '<em><b>Visit Tail Controlled Loop</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation VISITOR___VISIT_TAIL_CONTROLLED_LOOP__TAILCONTROLLEDLOOP = eINSTANCE.getVisitor__VisitTailControlledLoop__TailControlledLoop();

      /**
       * The meta object literal for the '<em><b>Visit For Each</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation VISITOR___VISIT_FOR_EACH__FOREACH = eINSTANCE.getVisitor__VisitForEach__ForEach();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.runtime.democles.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.runtime.democles.impl.VariableReferenceImpl
       * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getVariableReference()
       * @generated
       */
      EClass VARIABLE_REFERENCE = eINSTANCE.getVariableReference();

      /**
       * The meta object literal for the '<em><b>Invocation</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference VARIABLE_REFERENCE__INVOCATION = eINSTANCE.getVariableReference_Invocation();

      /**
       * The meta object literal for the '<em><b>To</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference VARIABLE_REFERENCE__TO = eINSTANCE.getVariableReference_To();

      /**
       * The meta object literal for the '<em><b>From</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference VARIABLE_REFERENCE__FROM = eINSTANCE.getVariableReference_From();

      /**
       * The meta object literal for the '<em><b>Is Free</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation VARIABLE_REFERENCE___IS_FREE = eINSTANCE.getVariableReference__IsFree();

      /**
       * The meta object literal for the '<em><b>Is Constructed</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation VARIABLE_REFERENCE___IS_CONSTRUCTED = eINSTANCE.getVariableReference__IsConstructed();

      /**
       * The meta object literal for the '<em><b>Is Reassigned</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation VARIABLE_REFERENCE___IS_REASSIGNED = eINSTANCE.getVariableReference__IsReassigned();

      /**
       * The meta object literal for the '<em>Adornment</em>' data type.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.gervarro.democles.common.Adornment
       * @see org.moflon.sdm.runtime.democles.impl.DemoclesPackageImpl#getAdornment()
       * @generated
       */
      EDataType ADORNMENT = eINSTANCE.getAdornment();

   }

} //DemoclesPackage
