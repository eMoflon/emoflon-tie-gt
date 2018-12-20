/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.moflon.core.dfs.DfsPackage;

import org.moflon.sdm.runtime.democles.DemoclesPackage;

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
 * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.moflon.sdm.compiler.democles.validation'"
 * @generated
 */
public interface ControlflowPackage extends EPackage
{
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "controlflow";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "platform:/plugin/org.moflon.sdm.compiler.democles.validation.controlflow/model/Controlflow.ecore";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "org.moflon.sdm.compiler.democles.validation.controlflow";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   ControlflowPackage eINSTANCE = org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl.init();

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.ValidatorImpl <em>Validator</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ValidatorImpl
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getValidator()
    * @generated
    */
   int VALIDATOR = 0;

   /**
    * The feature id for the '<em><b>Builders</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VALIDATOR__BUILDERS = 0;

   /**
    * The feature id for the '<em><b>Graph</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VALIDATOR__GRAPH = 1;

   /**
    * The feature id for the '<em><b>Validation Report</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VALIDATOR__VALIDATION_REPORT = 2;

   /**
    * The feature id for the '<em><b>Stop Node In For Each Component Severity</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VALIDATOR__STOP_NODE_IN_FOR_EACH_COMPONENT_SEVERITY = 3;

   /**
    * The number of structural features of the '<em>Validator</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VALIDATOR_FEATURE_COUNT = 4;

   /**
    * The operation id for the '<em>Has Fatal Errors</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VALIDATOR___HAS_FATAL_ERRORS = 0;

   /**
    * The operation id for the '<em>Lookup Error Message</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VALIDATOR___LOOKUP_ERROR_MESSAGE__ERRORS = 1;

   /**
    * The operation id for the '<em>Sort Incoming Edges</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VALIDATOR___SORT_INCOMING_EDGES__NODE = 2;

   /**
    * The operation id for the '<em>Syntactic Check With Start Node Lookup</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VALIDATOR___SYNTACTIC_CHECK_WITH_START_NODE_LOOKUP__ACTIVITY = 3;

   /**
    * The operation id for the '<em>Validate</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VALIDATOR___VALIDATE__ACTIVITY = 4;

   /**
    * The operation id for the '<em>Validate</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VALIDATOR___VALIDATE__ACTIVITY_SDMACTIVITYGRAPHBUILDER = 5;

   /**
    * The number of operations of the '<em>Validator</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VALIDATOR_OPERATION_COUNT = 6;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.SDMActivityGraphBuilderImpl <em>SDM Activity Graph Builder</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.SDMActivityGraphBuilderImpl
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getSDMActivityGraphBuilder()
    * @generated
    */
   int SDM_ACTIVITY_GRAPH_BUILDER = 1;

   /**
    * The feature id for the '<em><b>Validator</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SDM_ACTIVITY_GRAPH_BUILDER__VALIDATOR = 0;

   /**
    * The feature id for the '<em><b>Graph</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SDM_ACTIVITY_GRAPH_BUILDER__GRAPH = 1;

   /**
    * The number of structural features of the '<em>SDM Activity Graph Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SDM_ACTIVITY_GRAPH_BUILDER_FEATURE_COUNT = 2;

   /**
    * The operation id for the '<em>Explore Edge</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SDM_ACTIVITY_GRAPH_BUILDER___EXPLORE_EDGE__EDGE = 0;

   /**
    * The operation id for the '<em>Explore Start Node</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SDM_ACTIVITY_GRAPH_BUILDER___EXPLORE_START_NODE__STARTNODE = 1;

   /**
    * The operation id for the '<em>Explore Statement Node</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SDM_ACTIVITY_GRAPH_BUILDER___EXPLORE_STATEMENT_NODE__STATEMENTNODE = 2;

   /**
    * The operation id for the '<em>Explore Stop Node</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SDM_ACTIVITY_GRAPH_BUILDER___EXPLORE_STOP_NODE__STOPNODE = 3;

   /**
    * The operation id for the '<em>Explore Story Node</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SDM_ACTIVITY_GRAPH_BUILDER___EXPLORE_STORY_NODE__STORYNODE = 4;

   /**
    * The number of operations of the '<em>SDM Activity Graph Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SDM_ACTIVITY_GRAPH_BUILDER_OPERATION_COUNT = 5;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.ValidatingEdgeProcessorImpl <em>Validating Edge Processor</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ValidatingEdgeProcessorImpl
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getValidatingEdgeProcessor()
    * @generated
    */
   int VALIDATING_EDGE_PROCESSOR = 13;

   /**
    * The feature id for the '<em><b>Delegate</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VALIDATING_EDGE_PROCESSOR__DELEGATE = DfsPackage.EDGE_PROCESSOR__DELEGATE;

   /**
    * The feature id for the '<em><b>Validator</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VALIDATING_EDGE_PROCESSOR__VALIDATOR = DfsPackage.EDGE_PROCESSOR_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Validating Edge Processor</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VALIDATING_EDGE_PROCESSOR_FEATURE_COUNT = DfsPackage.EDGE_PROCESSOR_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>Process Edge</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VALIDATING_EDGE_PROCESSOR___PROCESS_EDGE__EDGE = DfsPackage.EDGE_PROCESSOR___PROCESS_EDGE__EDGE;

   /**
    * The operation id for the '<em>Process Node</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VALIDATING_EDGE_PROCESSOR___PROCESS_NODE__NODE = DfsPackage.EDGE_PROCESSOR___PROCESS_NODE__NODE;

   /**
    * The number of operations of the '<em>Validating Edge Processor</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int VALIDATING_EDGE_PROCESSOR_OPERATION_COUNT = DfsPackage.EDGE_PROCESSOR_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.CrossEdgeAnalyzerImpl <em>Cross Edge Analyzer</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.CrossEdgeAnalyzerImpl
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getCrossEdgeAnalyzer()
    * @generated
    */
   int CROSS_EDGE_ANALYZER = 2;

   /**
    * The feature id for the '<em><b>Delegate</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CROSS_EDGE_ANALYZER__DELEGATE = VALIDATING_EDGE_PROCESSOR__DELEGATE;

   /**
    * The feature id for the '<em><b>Validator</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CROSS_EDGE_ANALYZER__VALIDATOR = VALIDATING_EDGE_PROCESSOR__VALIDATOR;

   /**
    * The feature id for the '<em><b>Middle Root</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CROSS_EDGE_ANALYZER__MIDDLE_ROOT = VALIDATING_EDGE_PROCESSOR_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Lower Tree Tester</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CROSS_EDGE_ANALYZER__LOWER_TREE_TESTER = VALIDATING_EDGE_PROCESSOR_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Cross Edge Analyzer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CROSS_EDGE_ANALYZER_FEATURE_COUNT = VALIDATING_EDGE_PROCESSOR_FEATURE_COUNT + 2;

   /**
    * The operation id for the '<em>Process Edge</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CROSS_EDGE_ANALYZER___PROCESS_EDGE__EDGE = VALIDATING_EDGE_PROCESSOR___PROCESS_EDGE__EDGE;

   /**
    * The operation id for the '<em>Delete Edge</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CROSS_EDGE_ANALYZER___DELETE_EDGE__EDGE = VALIDATING_EDGE_PROCESSOR_OPERATION_COUNT + 0;

   /**
    * The operation id for the '<em>Is Node In Wrong Component</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CROSS_EDGE_ANALYZER___IS_NODE_IN_WRONG_COMPONENT__NODE_INT_INT = VALIDATING_EDGE_PROCESSOR_OPERATION_COUNT + 1;

   /**
    * The operation id for the '<em>Process Node</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CROSS_EDGE_ANALYZER___PROCESS_NODE__NODE = VALIDATING_EDGE_PROCESSOR_OPERATION_COUNT + 2;

   /**
    * The number of operations of the '<em>Cross Edge Analyzer</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CROSS_EDGE_ANALYZER_OPERATION_COUNT = VALIDATING_EDGE_PROCESSOR_OPERATION_COUNT + 3;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.InefficientBootstrappingBuilderImpl <em>Inefficient Bootstrapping Builder</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.InefficientBootstrappingBuilderImpl
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getInefficientBootstrappingBuilder()
    * @generated
    */
   int INEFFICIENT_BOOTSTRAPPING_BUILDER = 3;

   /**
    * The feature id for the '<em><b>Validator</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INEFFICIENT_BOOTSTRAPPING_BUILDER__VALIDATOR = SDM_ACTIVITY_GRAPH_BUILDER__VALIDATOR;

   /**
    * The feature id for the '<em><b>Graph</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INEFFICIENT_BOOTSTRAPPING_BUILDER__GRAPH = SDM_ACTIVITY_GRAPH_BUILDER__GRAPH;

   /**
    * The feature id for the '<em><b>Delegate</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INEFFICIENT_BOOTSTRAPPING_BUILDER__DELEGATE = SDM_ACTIVITY_GRAPH_BUILDER_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Inefficient Bootstrapping Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INEFFICIENT_BOOTSTRAPPING_BUILDER_FEATURE_COUNT = SDM_ACTIVITY_GRAPH_BUILDER_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>Explore Edge</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INEFFICIENT_BOOTSTRAPPING_BUILDER___EXPLORE_EDGE__EDGE = SDM_ACTIVITY_GRAPH_BUILDER___EXPLORE_EDGE__EDGE;

   /**
    * The operation id for the '<em>Explore Start Node</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INEFFICIENT_BOOTSTRAPPING_BUILDER___EXPLORE_START_NODE__STARTNODE = SDM_ACTIVITY_GRAPH_BUILDER___EXPLORE_START_NODE__STARTNODE;

   /**
    * The operation id for the '<em>Explore Statement Node</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INEFFICIENT_BOOTSTRAPPING_BUILDER___EXPLORE_STATEMENT_NODE__STATEMENTNODE = SDM_ACTIVITY_GRAPH_BUILDER_OPERATION_COUNT + 0;

   /**
    * The operation id for the '<em>Explore Stop Node</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INEFFICIENT_BOOTSTRAPPING_BUILDER___EXPLORE_STOP_NODE__STOPNODE = SDM_ACTIVITY_GRAPH_BUILDER_OPERATION_COUNT + 1;

   /**
    * The operation id for the '<em>Explore Story Node</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INEFFICIENT_BOOTSTRAPPING_BUILDER___EXPLORE_STORY_NODE__STORYNODE = SDM_ACTIVITY_GRAPH_BUILDER_OPERATION_COUNT + 2;

   /**
    * The number of operations of the '<em>Inefficient Bootstrapping Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int INEFFICIENT_BOOTSTRAPPING_BUILDER_OPERATION_COUNT = SDM_ACTIVITY_GRAPH_BUILDER_OPERATION_COUNT + 3;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.SubTreeTesterImpl <em>Sub Tree Tester</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.SubTreeTesterImpl
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getSubTreeTester()
    * @generated
    */
   int SUB_TREE_TESTER = 4;

   /**
    * The feature id for the '<em><b>Root</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SUB_TREE_TESTER__ROOT = 0;

   /**
    * The feature id for the '<em><b>Include Root</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SUB_TREE_TESTER__INCLUDE_ROOT = 1;

   /**
    * The number of structural features of the '<em>Sub Tree Tester</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SUB_TREE_TESTER_FEATURE_COUNT = 2;

   /**
    * The operation id for the '<em>Is In Sub Tree</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SUB_TREE_TESTER___IS_IN_SUB_TREE__NODE = 0;

   /**
    * The number of operations of the '<em>Sub Tree Tester</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int SUB_TREE_TESTER_OPERATION_COUNT = 1;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.TreeEdgeBackwardNavigatorTerminalImpl <em>Tree Edge Backward Navigator Terminal</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.TreeEdgeBackwardNavigatorTerminalImpl
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getTreeEdgeBackwardNavigatorTerminal()
    * @generated
    */
   int TREE_EDGE_BACKWARD_NAVIGATOR_TERMINAL = 5;

   /**
    * The feature id for the '<em><b>Delegate</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TREE_EDGE_BACKWARD_NAVIGATOR_TERMINAL__DELEGATE = VALIDATING_EDGE_PROCESSOR__DELEGATE;

   /**
    * The feature id for the '<em><b>Validator</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TREE_EDGE_BACKWARD_NAVIGATOR_TERMINAL__VALIDATOR = VALIDATING_EDGE_PROCESSOR__VALIDATOR;

   /**
    * The number of structural features of the '<em>Tree Edge Backward Navigator Terminal</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TREE_EDGE_BACKWARD_NAVIGATOR_TERMINAL_FEATURE_COUNT = VALIDATING_EDGE_PROCESSOR_FEATURE_COUNT + 0;

   /**
    * The operation id for the '<em>Process Node</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TREE_EDGE_BACKWARD_NAVIGATOR_TERMINAL___PROCESS_NODE__NODE = VALIDATING_EDGE_PROCESSOR___PROCESS_NODE__NODE;

   /**
    * The operation id for the '<em>Process Edge</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TREE_EDGE_BACKWARD_NAVIGATOR_TERMINAL___PROCESS_EDGE__EDGE = VALIDATING_EDGE_PROCESSOR_OPERATION_COUNT + 0;

   /**
    * The number of operations of the '<em>Tree Edge Backward Navigator Terminal</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TREE_EDGE_BACKWARD_NAVIGATOR_TERMINAL_OPERATION_COUNT = VALIDATING_EDGE_PROCESSOR_OPERATION_COUNT + 1;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.ForEachComponentProcessorImpl <em>For Each Component Processor</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ForEachComponentProcessorImpl
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getForEachComponentProcessor()
    * @generated
    */
   int FOR_EACH_COMPONENT_PROCESSOR = 6;

   /**
    * The feature id for the '<em><b>Delegate</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_EACH_COMPONENT_PROCESSOR__DELEGATE = VALIDATING_EDGE_PROCESSOR__DELEGATE;

   /**
    * The feature id for the '<em><b>Validator</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_EACH_COMPONENT_PROCESSOR__VALIDATOR = VALIDATING_EDGE_PROCESSOR__VALIDATOR;

   /**
    * The feature id for the '<em><b>Component Starting Node</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_EACH_COMPONENT_PROCESSOR__COMPONENT_STARTING_NODE = VALIDATING_EDGE_PROCESSOR_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>For Each Node</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_EACH_COMPONENT_PROCESSOR__FOR_EACH_NODE = VALIDATING_EDGE_PROCESSOR_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>For Each Component Processor</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_EACH_COMPONENT_PROCESSOR_FEATURE_COUNT = VALIDATING_EDGE_PROCESSOR_FEATURE_COUNT + 2;

   /**
    * The operation id for the '<em>Process Node</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_EACH_COMPONENT_PROCESSOR___PROCESS_NODE__NODE = VALIDATING_EDGE_PROCESSOR___PROCESS_NODE__NODE;

   /**
    * The operation id for the '<em>Post Delegate Edge Analysis</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_EACH_COMPONENT_PROCESSOR___POST_DELEGATE_EDGE_ANALYSIS__EDGE_EOBJECT = VALIDATING_EDGE_PROCESSOR_OPERATION_COUNT + 0;

   /**
    * The operation id for the '<em>Process Edge</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_EACH_COMPONENT_PROCESSOR___PROCESS_EDGE__EDGE = VALIDATING_EDGE_PROCESSOR_OPERATION_COUNT + 1;

   /**
    * The number of operations of the '<em>For Each Component Processor</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int FOR_EACH_COMPONENT_PROCESSOR_OPERATION_COUNT = VALIDATING_EDGE_PROCESSOR_OPERATION_COUNT + 2;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.TreeEdgeNavigatorImpl <em>Tree Edge Navigator</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.TreeEdgeNavigatorImpl
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getTreeEdgeNavigator()
    * @generated
    */
   int TREE_EDGE_NAVIGATOR = 7;

   /**
    * The feature id for the '<em><b>Delegate</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TREE_EDGE_NAVIGATOR__DELEGATE = VALIDATING_EDGE_PROCESSOR__DELEGATE;

   /**
    * The feature id for the '<em><b>Validator</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TREE_EDGE_NAVIGATOR__VALIDATOR = VALIDATING_EDGE_PROCESSOR__VALIDATOR;

   /**
    * The feature id for the '<em><b>Terminal Node</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TREE_EDGE_NAVIGATOR__TERMINAL_NODE = VALIDATING_EDGE_PROCESSOR_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Forward</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TREE_EDGE_NAVIGATOR__FORWARD = VALIDATING_EDGE_PROCESSOR_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Tree Edge Navigator</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TREE_EDGE_NAVIGATOR_FEATURE_COUNT = VALIDATING_EDGE_PROCESSOR_FEATURE_COUNT + 2;

   /**
    * The operation id for the '<em>Process Edge</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TREE_EDGE_NAVIGATOR___PROCESS_EDGE__EDGE = VALIDATING_EDGE_PROCESSOR_OPERATION_COUNT + 0;

   /**
    * The operation id for the '<em>Process Node</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TREE_EDGE_NAVIGATOR___PROCESS_NODE__NODE = VALIDATING_EDGE_PROCESSOR_OPERATION_COUNT + 1;

   /**
    * The number of operations of the '<em>Tree Edge Navigator</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int TREE_EDGE_NAVIGATOR_OPERATION_COUNT = VALIDATING_EDGE_PROCESSOR_OPERATION_COUNT + 2;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.JoinNodeFinderImpl <em>Join Node Finder</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.JoinNodeFinderImpl
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getJoinNodeFinder()
    * @generated
    */
   int JOIN_NODE_FINDER = 8;

   /**
    * The feature id for the '<em><b>Delegate</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOIN_NODE_FINDER__DELEGATE = VALIDATING_EDGE_PROCESSOR__DELEGATE;

   /**
    * The feature id for the '<em><b>Validator</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOIN_NODE_FINDER__VALIDATOR = VALIDATING_EDGE_PROCESSOR__VALIDATOR;

   /**
    * The feature id for the '<em><b>Branch Root</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOIN_NODE_FINDER__BRANCH_ROOT = VALIDATING_EDGE_PROCESSOR_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Join Nodes</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOIN_NODE_FINDER__JOIN_NODES = VALIDATING_EDGE_PROCESSOR_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Join Node Finder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOIN_NODE_FINDER_FEATURE_COUNT = VALIDATING_EDGE_PROCESSOR_FEATURE_COUNT + 2;

   /**
    * The operation id for the '<em>Process Edge</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOIN_NODE_FINDER___PROCESS_EDGE__EDGE = VALIDATING_EDGE_PROCESSOR___PROCESS_EDGE__EDGE;

   /**
    * The operation id for the '<em>Leads To Join Node</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOIN_NODE_FINDER___LEADS_TO_JOIN_NODE__EDGE = VALIDATING_EDGE_PROCESSOR_OPERATION_COUNT + 0;

   /**
    * The operation id for the '<em>Process Node</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOIN_NODE_FINDER___PROCESS_NODE__NODE = VALIDATING_EDGE_PROCESSOR_OPERATION_COUNT + 1;

   /**
    * The number of operations of the '<em>Join Node Finder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int JOIN_NODE_FINDER_OPERATION_COUNT = VALIDATING_EDGE_PROCESSOR_OPERATION_COUNT + 2;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.MoflonOperationImpl <em>Moflon Operation</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.MoflonOperationImpl
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getMoflonOperation()
    * @generated
    */
   int MOFLON_OPERATION = 9;

   /**
    * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MOFLON_OPERATION__EANNOTATIONS = EcorePackage.EOPERATION__EANNOTATIONS;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MOFLON_OPERATION__NAME = EcorePackage.EOPERATION__NAME;

   /**
    * The feature id for the '<em><b>Ordered</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MOFLON_OPERATION__ORDERED = EcorePackage.EOPERATION__ORDERED;

   /**
    * The feature id for the '<em><b>Unique</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MOFLON_OPERATION__UNIQUE = EcorePackage.EOPERATION__UNIQUE;

   /**
    * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MOFLON_OPERATION__LOWER_BOUND = EcorePackage.EOPERATION__LOWER_BOUND;

   /**
    * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MOFLON_OPERATION__UPPER_BOUND = EcorePackage.EOPERATION__UPPER_BOUND;

   /**
    * The feature id for the '<em><b>Many</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MOFLON_OPERATION__MANY = EcorePackage.EOPERATION__MANY;

   /**
    * The feature id for the '<em><b>Required</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MOFLON_OPERATION__REQUIRED = EcorePackage.EOPERATION__REQUIRED;

   /**
    * The feature id for the '<em><b>EType</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MOFLON_OPERATION__ETYPE = EcorePackage.EOPERATION__ETYPE;

   /**
    * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MOFLON_OPERATION__EGENERIC_TYPE = EcorePackage.EOPERATION__EGENERIC_TYPE;

   /**
    * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MOFLON_OPERATION__ECONTAINING_CLASS = EcorePackage.EOPERATION__ECONTAINING_CLASS;

   /**
    * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MOFLON_OPERATION__ETYPE_PARAMETERS = EcorePackage.EOPERATION__ETYPE_PARAMETERS;

   /**
    * The feature id for the '<em><b>EParameters</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MOFLON_OPERATION__EPARAMETERS = EcorePackage.EOPERATION__EPARAMETERS;

   /**
    * The feature id for the '<em><b>EExceptions</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MOFLON_OPERATION__EEXCEPTIONS = EcorePackage.EOPERATION__EEXCEPTIONS;

   /**
    * The feature id for the '<em><b>EGeneric Exceptions</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MOFLON_OPERATION__EGENERIC_EXCEPTIONS = EcorePackage.EOPERATION__EGENERIC_EXCEPTIONS;

   /**
    * The feature id for the '<em><b>Root Scope</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MOFLON_OPERATION__ROOT_SCOPE = EcorePackage.EOPERATION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Activity</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MOFLON_OPERATION__ACTIVITY = EcorePackage.EOPERATION_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Moflon Operation</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MOFLON_OPERATION_FEATURE_COUNT = EcorePackage.EOPERATION_FEATURE_COUNT + 2;

   /**
    * The operation id for the '<em>Get EAnnotation</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MOFLON_OPERATION___GET_EANNOTATION__STRING = EcorePackage.EOPERATION___GET_EANNOTATION__STRING;

   /**
    * The operation id for the '<em>Get Operation ID</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MOFLON_OPERATION___GET_OPERATION_ID = EcorePackage.EOPERATION___GET_OPERATION_ID;

   /**
    * The operation id for the '<em>Is Override Of</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MOFLON_OPERATION___IS_OVERRIDE_OF__EOPERATION = EcorePackage.EOPERATION___IS_OVERRIDE_OF__EOPERATION;

   /**
    * The number of operations of the '<em>Moflon Operation</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int MOFLON_OPERATION_OPERATION_COUNT = EcorePackage.EOPERATION_OPERATION_COUNT + 0;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.DefaultComponentProcessorImpl <em>Default Component Processor</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.DefaultComponentProcessorImpl
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getDefaultComponentProcessor()
    * @generated
    */
   int DEFAULT_COMPONENT_PROCESSOR = 10;

   /**
    * The feature id for the '<em><b>Delegate</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEFAULT_COMPONENT_PROCESSOR__DELEGATE = VALIDATING_EDGE_PROCESSOR__DELEGATE;

   /**
    * The feature id for the '<em><b>Validator</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEFAULT_COMPONENT_PROCESSOR__VALIDATOR = VALIDATING_EDGE_PROCESSOR__VALIDATOR;

   /**
    * The feature id for the '<em><b>Builder</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEFAULT_COMPONENT_PROCESSOR__BUILDER = VALIDATING_EDGE_PROCESSOR_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Default Component Processor</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEFAULT_COMPONENT_PROCESSOR_FEATURE_COUNT = VALIDATING_EDGE_PROCESSOR_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>Process Node</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEFAULT_COMPONENT_PROCESSOR___PROCESS_NODE__NODE = VALIDATING_EDGE_PROCESSOR___PROCESS_NODE__NODE;

   /**
    * The operation id for the '<em>Explore Target Node</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEFAULT_COMPONENT_PROCESSOR___EXPLORE_TARGET_NODE__EDGE = VALIDATING_EDGE_PROCESSOR_OPERATION_COUNT + 0;

   /**
    * The operation id for the '<em>Process Edge</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEFAULT_COMPONENT_PROCESSOR___PROCESS_EDGE__EDGE = VALIDATING_EDGE_PROCESSOR_OPERATION_COUNT + 1;

   /**
    * The number of operations of the '<em>Default Component Processor</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEFAULT_COMPONENT_PROCESSOR_OPERATION_COUNT = VALIDATING_EDGE_PROCESSOR_OPERATION_COUNT + 2;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlFlowBuilderImpl <em>Control Flow Builder</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlFlowBuilderImpl
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getControlFlowBuilder()
    * @generated
    */
   int CONTROL_FLOW_BUILDER = 11;

   /**
    * The feature id for the '<em><b>Validator</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTROL_FLOW_BUILDER__VALIDATOR = 0;

   /**
    * The number of structural features of the '<em>Control Flow Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTROL_FLOW_BUILDER_FEATURE_COUNT = 1;

   /**
    * The operation id for the '<em>Find Largest Backward Edge Interval</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTROL_FLOW_BUILDER___FIND_LARGEST_BACKWARD_EDGE_INTERVAL__NODE_NODE = 0;

   /**
    * The operation id for the '<em>Handle For Each Node</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTROL_FLOW_BUILDER___HANDLE_FOR_EACH_NODE__SCOPE_NODE_STORYNODE = 1;

   /**
    * The operation id for the '<em>Handle Head Controlled Loop</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTROL_FLOW_BUILDER___HANDLE_HEAD_CONTROLLED_LOOP__SCOPE_NODE_EDGE = 2;

   /**
    * The operation id for the '<em>Handle Simple Node</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTROL_FLOW_BUILDER___HANDLE_SIMPLE_NODE__SCOPE_NODE_EDGE = 3;

   /**
    * The operation id for the '<em>Handle Stumped Edge</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTROL_FLOW_BUILDER___HANDLE_STUMPED_EDGE__SCOPE_EDGE_CFNODE = 4;

   /**
    * The operation id for the '<em>Handle Tail Controlled Loop</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTROL_FLOW_BUILDER___HANDLE_TAIL_CONTROLLED_LOOP__SCOPE_NODE_EDGE = 5;

   /**
    * The operation id for the '<em>Handle Unique Join Node</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTROL_FLOW_BUILDER___HANDLE_UNIQUE_JOIN_NODE__NODE_NODE_NODE = 6;

   /**
    * The operation id for the '<em>Is Head Controlled Loop Branch</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTROL_FLOW_BUILDER___IS_HEAD_CONTROLLED_LOOP_BRANCH__EDGE = 7;

   /**
    * The operation id for the '<em>Is Loop Branch</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTROL_FLOW_BUILDER___IS_LOOP_BRANCH__EDGE = 8;

   /**
    * The operation id for the '<em>Lookahead</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTROL_FLOW_BUILDER___LOOKAHEAD__SCOPE_NODE = 9;

   /**
    * The operation id for the '<em>Lookahead And Connect</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTROL_FLOW_BUILDER___LOOKAHEAD_AND_CONNECT__SCOPE_NODE_CFNODE = 10;

   /**
    * The operation id for the '<em>Process Node</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTROL_FLOW_BUILDER___PROCESS_NODE__SCOPE_NODE = 11;

   /**
    * The operation id for the '<em>Traverse Then And Else Branches</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTROL_FLOW_BUILDER___TRAVERSE_THEN_AND_ELSE_BRANCHES__IFSTATEMENT_EDGE_EDGE_SCOPE_SCOPE = 12;

   /**
    * The number of operations of the '<em>Control Flow Builder</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int CONTROL_FLOW_BUILDER_OPERATION_COUNT = 13;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.IdentifierAllocatorImpl <em>Identifier Allocator</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.IdentifierAllocatorImpl
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getIdentifierAllocator()
    * @generated
    */
   int IDENTIFIER_ALLOCATOR = 12;

   /**
    * The feature id for the '<em><b>Id</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IDENTIFIER_ALLOCATOR__ID = DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Identifier Allocator</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IDENTIFIER_ALLOCATOR_FEATURE_COUNT = DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR_FEATURE_COUNT + 1;

   /**
    * The operation id for the '<em>Visit Scope</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IDENTIFIER_ALLOCATOR___VISIT_SCOPE__SCOPE = DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR___VISIT_SCOPE__SCOPE;

   /**
    * The operation id for the '<em>Visit For Each</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IDENTIFIER_ALLOCATOR___VISIT_FOR_EACH__FOREACH = DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR___VISIT_FOR_EACH__FOREACH;

   /**
    * The operation id for the '<em>Visit Head Controlled Loop</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IDENTIFIER_ALLOCATOR___VISIT_HEAD_CONTROLLED_LOOP__HEADCONTROLLEDLOOP = DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR___VISIT_HEAD_CONTROLLED_LOOP__HEADCONTROLLEDLOOP;

   /**
    * The operation id for the '<em>Visit If Statement</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IDENTIFIER_ALLOCATOR___VISIT_IF_STATEMENT__IFSTATEMENT = DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR___VISIT_IF_STATEMENT__IFSTATEMENT;

   /**
    * The operation id for the '<em>Visit Tail Controlled Loop</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IDENTIFIER_ALLOCATOR___VISIT_TAIL_CONTROLLED_LOOP__TAILCONTROLLEDLOOP = DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR___VISIT_TAIL_CONTROLLED_LOOP__TAILCONTROLLEDLOOP;

   /**
    * The operation id for the '<em>Increment Identifier</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IDENTIFIER_ALLOCATOR___INCREMENT_IDENTIFIER = DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR_OPERATION_COUNT + 0;

   /**
    * The operation id for the '<em>Visit Node</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IDENTIFIER_ALLOCATOR___VISIT_NODE__CFNODE = DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR_OPERATION_COUNT + 1;

   /**
    * The number of operations of the '<em>Identifier Allocator</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int IDENTIFIER_ALLOCATOR_OPERATION_COUNT = DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR_OPERATION_COUNT + 2;

   /**
    * The meta object id for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.Errors <em>Errors</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.Errors
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getErrors()
    * @generated
    */
   int ERRORS = 14;

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.controlflow.Validator <em>Validator</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Validator</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.Validator
    * @generated
    */
   EClass getValidator();

   /**
    * Returns the meta object for the reference list '{@link org.moflon.sdm.compiler.democles.validation.controlflow.Validator#getBuilders <em>Builders</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Builders</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.Validator#getBuilders()
    * @see #getValidator()
    * @generated
    */
   EReference getValidator_Builders();

   /**
    * Returns the meta object for the containment reference '{@link org.moflon.sdm.compiler.democles.validation.controlflow.Validator#getGraph <em>Graph</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Graph</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.Validator#getGraph()
    * @see #getValidator()
    * @generated
    */
   EReference getValidator_Graph();

   /**
    * Returns the meta object for the containment reference '{@link org.moflon.sdm.compiler.democles.validation.controlflow.Validator#getValidationReport <em>Validation Report</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Validation Report</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.Validator#getValidationReport()
    * @see #getValidator()
    * @generated
    */
   EReference getValidator_ValidationReport();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.sdm.compiler.democles.validation.controlflow.Validator#getStopNodeInForEachComponentSeverity <em>Stop Node In For Each Component Severity</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Stop Node In For Each Component Severity</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.Validator#getStopNodeInForEachComponentSeverity()
    * @see #getValidator()
    * @generated
    */
   EAttribute getValidator_StopNodeInForEachComponentSeverity();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.Validator#hasFatalErrors() <em>Has Fatal Errors</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Has Fatal Errors</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.Validator#hasFatalErrors()
    * @generated
    */
   EOperation getValidator__HasFatalErrors();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.Validator#lookupErrorMessage(org.moflon.sdm.compiler.democles.validation.controlflow.Errors) <em>Lookup Error Message</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Lookup Error Message</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.Validator#lookupErrorMessage(org.moflon.sdm.compiler.democles.validation.controlflow.Errors)
    * @generated
    */
   EOperation getValidator__LookupErrorMessage__Errors();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.Validator#sortIncomingEdges(org.moflon.core.dfs.Node) <em>Sort Incoming Edges</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Sort Incoming Edges</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.Validator#sortIncomingEdges(org.moflon.core.dfs.Node)
    * @generated
    */
   EOperation getValidator__SortIncomingEdges__Node();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.Validator#syntacticCheckWithStartNodeLookup(SDMLanguage.activities.Activity) <em>Syntactic Check With Start Node Lookup</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Syntactic Check With Start Node Lookup</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.Validator#syntacticCheckWithStartNodeLookup(SDMLanguage.activities.Activity)
    * @generated
    */
   EOperation getValidator__SyntacticCheckWithStartNodeLookup__Activity();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.Validator#validate(SDMLanguage.activities.Activity) <em>Validate</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Validate</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.Validator#validate(SDMLanguage.activities.Activity)
    * @generated
    */
   EOperation getValidator__Validate__Activity();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.Validator#validate(SDMLanguage.activities.Activity, org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder) <em>Validate</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Validate</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.Validator#validate(SDMLanguage.activities.Activity, org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder)
    * @generated
    */
   EOperation getValidator__Validate__Activity_SDMActivityGraphBuilder();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder <em>SDM Activity Graph Builder</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>SDM Activity Graph Builder</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder
    * @generated
    */
   EClass getSDMActivityGraphBuilder();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder#getValidator <em>Validator</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Validator</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder#getValidator()
    * @see #getSDMActivityGraphBuilder()
    * @generated
    */
   EReference getSDMActivityGraphBuilder_Validator();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder#getGraph <em>Graph</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Graph</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder#getGraph()
    * @see #getSDMActivityGraphBuilder()
    * @generated
    */
   EReference getSDMActivityGraphBuilder_Graph();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder#exploreEdge(org.moflon.core.dfs.Edge) <em>Explore Edge</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Explore Edge</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder#exploreEdge(org.moflon.core.dfs.Edge)
    * @generated
    */
   EOperation getSDMActivityGraphBuilder__ExploreEdge__Edge();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder#exploreStartNode(SDMLanguage.activities.StartNode) <em>Explore Start Node</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Explore Start Node</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder#exploreStartNode(SDMLanguage.activities.StartNode)
    * @generated
    */
   EOperation getSDMActivityGraphBuilder__ExploreStartNode__StartNode();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder#exploreStatementNode(SDMLanguage.activities.StatementNode) <em>Explore Statement Node</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Explore Statement Node</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder#exploreStatementNode(SDMLanguage.activities.StatementNode)
    * @generated
    */
   EOperation getSDMActivityGraphBuilder__ExploreStatementNode__StatementNode();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder#exploreStopNode(SDMLanguage.activities.StopNode) <em>Explore Stop Node</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Explore Stop Node</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder#exploreStopNode(SDMLanguage.activities.StopNode)
    * @generated
    */
   EOperation getSDMActivityGraphBuilder__ExploreStopNode__StopNode();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder#exploreStoryNode(SDMLanguage.activities.StoryNode) <em>Explore Story Node</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Explore Story Node</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder#exploreStoryNode(SDMLanguage.activities.StoryNode)
    * @generated
    */
   EOperation getSDMActivityGraphBuilder__ExploreStoryNode__StoryNode();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.controlflow.CrossEdgeAnalyzer <em>Cross Edge Analyzer</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Cross Edge Analyzer</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.CrossEdgeAnalyzer
    * @generated
    */
   EClass getCrossEdgeAnalyzer();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.compiler.democles.validation.controlflow.CrossEdgeAnalyzer#getMiddleRoot <em>Middle Root</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Middle Root</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.CrossEdgeAnalyzer#getMiddleRoot()
    * @see #getCrossEdgeAnalyzer()
    * @generated
    */
   EReference getCrossEdgeAnalyzer_MiddleRoot();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.compiler.democles.validation.controlflow.CrossEdgeAnalyzer#getLowerTreeTester <em>Lower Tree Tester</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Lower Tree Tester</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.CrossEdgeAnalyzer#getLowerTreeTester()
    * @see #getCrossEdgeAnalyzer()
    * @generated
    */
   EReference getCrossEdgeAnalyzer_LowerTreeTester();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.CrossEdgeAnalyzer#deleteEdge(org.moflon.core.dfs.Edge) <em>Delete Edge</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Delete Edge</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.CrossEdgeAnalyzer#deleteEdge(org.moflon.core.dfs.Edge)
    * @generated
    */
   EOperation getCrossEdgeAnalyzer__DeleteEdge__Edge();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.CrossEdgeAnalyzer#isNodeInWrongComponent(org.moflon.core.dfs.Node, int, int) <em>Is Node In Wrong Component</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Is Node In Wrong Component</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.CrossEdgeAnalyzer#isNodeInWrongComponent(org.moflon.core.dfs.Node, int, int)
    * @generated
    */
   EOperation getCrossEdgeAnalyzer__IsNodeInWrongComponent__Node_int_int();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.CrossEdgeAnalyzer#processNode(org.moflon.core.dfs.Node) <em>Process Node</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Process Node</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.CrossEdgeAnalyzer#processNode(org.moflon.core.dfs.Node)
    * @generated
    */
   EOperation getCrossEdgeAnalyzer__ProcessNode__Node();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.controlflow.InefficientBootstrappingBuilder <em>Inefficient Bootstrapping Builder</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Inefficient Bootstrapping Builder</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.InefficientBootstrappingBuilder
    * @generated
    */
   EClass getInefficientBootstrappingBuilder();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.compiler.democles.validation.controlflow.InefficientBootstrappingBuilder#getDelegate <em>Delegate</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Delegate</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.InefficientBootstrappingBuilder#getDelegate()
    * @see #getInefficientBootstrappingBuilder()
    * @generated
    */
   EReference getInefficientBootstrappingBuilder_Delegate();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.InefficientBootstrappingBuilder#exploreStatementNode(SDMLanguage.activities.StatementNode) <em>Explore Statement Node</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Explore Statement Node</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.InefficientBootstrappingBuilder#exploreStatementNode(SDMLanguage.activities.StatementNode)
    * @generated
    */
   EOperation getInefficientBootstrappingBuilder__ExploreStatementNode__StatementNode();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.InefficientBootstrappingBuilder#exploreStopNode(SDMLanguage.activities.StopNode) <em>Explore Stop Node</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Explore Stop Node</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.InefficientBootstrappingBuilder#exploreStopNode(SDMLanguage.activities.StopNode)
    * @generated
    */
   EOperation getInefficientBootstrappingBuilder__ExploreStopNode__StopNode();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.InefficientBootstrappingBuilder#exploreStoryNode(SDMLanguage.activities.StoryNode) <em>Explore Story Node</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Explore Story Node</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.InefficientBootstrappingBuilder#exploreStoryNode(SDMLanguage.activities.StoryNode)
    * @generated
    */
   EOperation getInefficientBootstrappingBuilder__ExploreStoryNode__StoryNode();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.controlflow.SubTreeTester <em>Sub Tree Tester</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Sub Tree Tester</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.SubTreeTester
    * @generated
    */
   EClass getSubTreeTester();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.compiler.democles.validation.controlflow.SubTreeTester#getRoot <em>Root</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Root</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.SubTreeTester#getRoot()
    * @see #getSubTreeTester()
    * @generated
    */
   EReference getSubTreeTester_Root();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.sdm.compiler.democles.validation.controlflow.SubTreeTester#isIncludeRoot <em>Include Root</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Include Root</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.SubTreeTester#isIncludeRoot()
    * @see #getSubTreeTester()
    * @generated
    */
   EAttribute getSubTreeTester_IncludeRoot();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.SubTreeTester#isInSubTree(org.moflon.core.dfs.Node) <em>Is In Sub Tree</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Is In Sub Tree</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.SubTreeTester#isInSubTree(org.moflon.core.dfs.Node)
    * @generated
    */
   EOperation getSubTreeTester__IsInSubTree__Node();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.controlflow.TreeEdgeBackwardNavigatorTerminal <em>Tree Edge Backward Navigator Terminal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Tree Edge Backward Navigator Terminal</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.TreeEdgeBackwardNavigatorTerminal
    * @generated
    */
   EClass getTreeEdgeBackwardNavigatorTerminal();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.TreeEdgeBackwardNavigatorTerminal#processEdge(org.moflon.core.dfs.Edge) <em>Process Edge</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Process Edge</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.TreeEdgeBackwardNavigatorTerminal#processEdge(org.moflon.core.dfs.Edge)
    * @generated
    */
   EOperation getTreeEdgeBackwardNavigatorTerminal__ProcessEdge__Edge();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.controlflow.ForEachComponentProcessor <em>For Each Component Processor</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>For Each Component Processor</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ForEachComponentProcessor
    * @generated
    */
   EClass getForEachComponentProcessor();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.compiler.democles.validation.controlflow.ForEachComponentProcessor#getComponentStartingNode <em>Component Starting Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Component Starting Node</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ForEachComponentProcessor#getComponentStartingNode()
    * @see #getForEachComponentProcessor()
    * @generated
    */
   EReference getForEachComponentProcessor_ComponentStartingNode();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.compiler.democles.validation.controlflow.ForEachComponentProcessor#getForEachNode <em>For Each Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>For Each Node</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ForEachComponentProcessor#getForEachNode()
    * @see #getForEachComponentProcessor()
    * @generated
    */
   EReference getForEachComponentProcessor_ForEachNode();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.ForEachComponentProcessor#postDelegateEdgeAnalysis(org.moflon.core.dfs.Edge, org.eclipse.emf.ecore.EObject) <em>Post Delegate Edge Analysis</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Post Delegate Edge Analysis</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ForEachComponentProcessor#postDelegateEdgeAnalysis(org.moflon.core.dfs.Edge, org.eclipse.emf.ecore.EObject)
    * @generated
    */
   EOperation getForEachComponentProcessor__PostDelegateEdgeAnalysis__Edge_EObject();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.ForEachComponentProcessor#processEdge(org.moflon.core.dfs.Edge) <em>Process Edge</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Process Edge</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ForEachComponentProcessor#processEdge(org.moflon.core.dfs.Edge)
    * @generated
    */
   EOperation getForEachComponentProcessor__ProcessEdge__Edge();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.controlflow.TreeEdgeNavigator <em>Tree Edge Navigator</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Tree Edge Navigator</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.TreeEdgeNavigator
    * @generated
    */
   EClass getTreeEdgeNavigator();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.compiler.democles.validation.controlflow.TreeEdgeNavigator#getTerminalNode <em>Terminal Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Terminal Node</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.TreeEdgeNavigator#getTerminalNode()
    * @see #getTreeEdgeNavigator()
    * @generated
    */
   EReference getTreeEdgeNavigator_TerminalNode();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.sdm.compiler.democles.validation.controlflow.TreeEdgeNavigator#isForward <em>Forward</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Forward</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.TreeEdgeNavigator#isForward()
    * @see #getTreeEdgeNavigator()
    * @generated
    */
   EAttribute getTreeEdgeNavigator_Forward();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.TreeEdgeNavigator#processEdge(org.moflon.core.dfs.Edge) <em>Process Edge</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Process Edge</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.TreeEdgeNavigator#processEdge(org.moflon.core.dfs.Edge)
    * @generated
    */
   EOperation getTreeEdgeNavigator__ProcessEdge__Edge();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.TreeEdgeNavigator#processNode(org.moflon.core.dfs.Node) <em>Process Node</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Process Node</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.TreeEdgeNavigator#processNode(org.moflon.core.dfs.Node)
    * @generated
    */
   EOperation getTreeEdgeNavigator__ProcessNode__Node();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.controlflow.JoinNodeFinder <em>Join Node Finder</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Join Node Finder</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.JoinNodeFinder
    * @generated
    */
   EClass getJoinNodeFinder();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.compiler.democles.validation.controlflow.JoinNodeFinder#getBranchRoot <em>Branch Root</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Branch Root</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.JoinNodeFinder#getBranchRoot()
    * @see #getJoinNodeFinder()
    * @generated
    */
   EReference getJoinNodeFinder_BranchRoot();

   /**
    * Returns the meta object for the reference list '{@link org.moflon.sdm.compiler.democles.validation.controlflow.JoinNodeFinder#getJoinNodes <em>Join Nodes</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Join Nodes</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.JoinNodeFinder#getJoinNodes()
    * @see #getJoinNodeFinder()
    * @generated
    */
   EReference getJoinNodeFinder_JoinNodes();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.JoinNodeFinder#leadsToJoinNode(org.moflon.core.dfs.Edge) <em>Leads To Join Node</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Leads To Join Node</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.JoinNodeFinder#leadsToJoinNode(org.moflon.core.dfs.Edge)
    * @generated
    */
   EOperation getJoinNodeFinder__LeadsToJoinNode__Edge();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.JoinNodeFinder#processNode(org.moflon.core.dfs.Node) <em>Process Node</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Process Node</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.JoinNodeFinder#processNode(org.moflon.core.dfs.Node)
    * @generated
    */
   EOperation getJoinNodeFinder__ProcessNode__Node();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.controlflow.MoflonOperation <em>Moflon Operation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Moflon Operation</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.MoflonOperation
    * @generated
    */
   EClass getMoflonOperation();

   /**
    * Returns the meta object for the containment reference '{@link org.moflon.sdm.compiler.democles.validation.controlflow.MoflonOperation#getRootScope <em>Root Scope</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Root Scope</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.MoflonOperation#getRootScope()
    * @see #getMoflonOperation()
    * @generated
    */
   EReference getMoflonOperation_RootScope();

   /**
    * Returns the meta object for the containment reference '{@link org.moflon.sdm.compiler.democles.validation.controlflow.MoflonOperation#getActivity <em>Activity</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference '<em>Activity</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.MoflonOperation#getActivity()
    * @see #getMoflonOperation()
    * @generated
    */
   EReference getMoflonOperation_Activity();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.controlflow.DefaultComponentProcessor <em>Default Component Processor</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Default Component Processor</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.DefaultComponentProcessor
    * @generated
    */
   EClass getDefaultComponentProcessor();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.compiler.democles.validation.controlflow.DefaultComponentProcessor#getBuilder <em>Builder</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Builder</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.DefaultComponentProcessor#getBuilder()
    * @see #getDefaultComponentProcessor()
    * @generated
    */
   EReference getDefaultComponentProcessor_Builder();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.DefaultComponentProcessor#exploreTargetNode(org.moflon.core.dfs.Edge) <em>Explore Target Node</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Explore Target Node</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.DefaultComponentProcessor#exploreTargetNode(org.moflon.core.dfs.Edge)
    * @generated
    */
   EOperation getDefaultComponentProcessor__ExploreTargetNode__Edge();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.DefaultComponentProcessor#processEdge(org.moflon.core.dfs.Edge) <em>Process Edge</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Process Edge</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.DefaultComponentProcessor#processEdge(org.moflon.core.dfs.Edge)
    * @generated
    */
   EOperation getDefaultComponentProcessor__ProcessEdge__Edge();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder <em>Control Flow Builder</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Control Flow Builder</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder
    * @generated
    */
   EClass getControlFlowBuilder();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#getValidator <em>Validator</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Validator</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#getValidator()
    * @see #getControlFlowBuilder()
    * @generated
    */
   EReference getControlFlowBuilder_Validator();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#findLargestBackwardEdgeInterval(org.moflon.core.dfs.Node, org.moflon.core.dfs.Node) <em>Find Largest Backward Edge Interval</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Find Largest Backward Edge Interval</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#findLargestBackwardEdgeInterval(org.moflon.core.dfs.Node, org.moflon.core.dfs.Node)
    * @generated
    */
   EOperation getControlFlowBuilder__FindLargestBackwardEdgeInterval__Node_Node();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#handleForEachNode(org.moflon.sdm.runtime.democles.Scope, org.moflon.core.dfs.Node, SDMLanguage.activities.StoryNode) <em>Handle For Each Node</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Handle For Each Node</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#handleForEachNode(org.moflon.sdm.runtime.democles.Scope, org.moflon.core.dfs.Node, SDMLanguage.activities.StoryNode)
    * @generated
    */
   EOperation getControlFlowBuilder__HandleForEachNode__Scope_Node_StoryNode();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#handleHeadControlledLoop(org.moflon.sdm.runtime.democles.Scope, org.moflon.core.dfs.Node, org.moflon.core.dfs.Edge) <em>Handle Head Controlled Loop</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Handle Head Controlled Loop</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#handleHeadControlledLoop(org.moflon.sdm.runtime.democles.Scope, org.moflon.core.dfs.Node, org.moflon.core.dfs.Edge)
    * @generated
    */
   EOperation getControlFlowBuilder__HandleHeadControlledLoop__Scope_Node_Edge();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#handleSimpleNode(org.moflon.sdm.runtime.democles.Scope, org.moflon.core.dfs.Node, org.moflon.core.dfs.Edge) <em>Handle Simple Node</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Handle Simple Node</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#handleSimpleNode(org.moflon.sdm.runtime.democles.Scope, org.moflon.core.dfs.Node, org.moflon.core.dfs.Edge)
    * @generated
    */
   EOperation getControlFlowBuilder__HandleSimpleNode__Scope_Node_Edge();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#handleStumpedEdge(org.moflon.sdm.runtime.democles.Scope, org.moflon.core.dfs.Edge, org.moflon.sdm.runtime.democles.CFNode) <em>Handle Stumped Edge</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Handle Stumped Edge</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#handleStumpedEdge(org.moflon.sdm.runtime.democles.Scope, org.moflon.core.dfs.Edge, org.moflon.sdm.runtime.democles.CFNode)
    * @generated
    */
   EOperation getControlFlowBuilder__HandleStumpedEdge__Scope_Edge_CFNode();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#handleTailControlledLoop(org.moflon.sdm.runtime.democles.Scope, org.moflon.core.dfs.Node, org.moflon.core.dfs.Edge) <em>Handle Tail Controlled Loop</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Handle Tail Controlled Loop</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#handleTailControlledLoop(org.moflon.sdm.runtime.democles.Scope, org.moflon.core.dfs.Node, org.moflon.core.dfs.Edge)
    * @generated
    */
   EOperation getControlFlowBuilder__HandleTailControlledLoop__Scope_Node_Edge();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#handleUniqueJoinNode(org.moflon.core.dfs.Node, org.moflon.core.dfs.Node, org.moflon.core.dfs.Node) <em>Handle Unique Join Node</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Handle Unique Join Node</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#handleUniqueJoinNode(org.moflon.core.dfs.Node, org.moflon.core.dfs.Node, org.moflon.core.dfs.Node)
    * @generated
    */
   EOperation getControlFlowBuilder__HandleUniqueJoinNode__Node_Node_Node();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#isHeadControlledLoopBranch(org.moflon.core.dfs.Edge) <em>Is Head Controlled Loop Branch</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Is Head Controlled Loop Branch</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#isHeadControlledLoopBranch(org.moflon.core.dfs.Edge)
    * @generated
    */
   EOperation getControlFlowBuilder__IsHeadControlledLoopBranch__Edge();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#isLoopBranch(org.moflon.core.dfs.Edge) <em>Is Loop Branch</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Is Loop Branch</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#isLoopBranch(org.moflon.core.dfs.Edge)
    * @generated
    */
   EOperation getControlFlowBuilder__IsLoopBranch__Edge();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#lookahead(org.moflon.sdm.runtime.democles.Scope, org.moflon.core.dfs.Node) <em>Lookahead</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Lookahead</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#lookahead(org.moflon.sdm.runtime.democles.Scope, org.moflon.core.dfs.Node)
    * @generated
    */
   EOperation getControlFlowBuilder__Lookahead__Scope_Node();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#lookaheadAndConnect(org.moflon.sdm.runtime.democles.Scope, org.moflon.core.dfs.Node, org.moflon.sdm.runtime.democles.CFNode) <em>Lookahead And Connect</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Lookahead And Connect</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#lookaheadAndConnect(org.moflon.sdm.runtime.democles.Scope, org.moflon.core.dfs.Node, org.moflon.sdm.runtime.democles.CFNode)
    * @generated
    */
   EOperation getControlFlowBuilder__LookaheadAndConnect__Scope_Node_CFNode();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#processNode(org.moflon.sdm.runtime.democles.Scope, org.moflon.core.dfs.Node) <em>Process Node</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Process Node</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#processNode(org.moflon.sdm.runtime.democles.Scope, org.moflon.core.dfs.Node)
    * @generated
    */
   EOperation getControlFlowBuilder__ProcessNode__Scope_Node();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#traverseThenAndElseBranches(org.moflon.sdm.runtime.democles.IfStatement, org.moflon.core.dfs.Edge, org.moflon.core.dfs.Edge, org.moflon.sdm.runtime.democles.Scope, org.moflon.sdm.runtime.democles.Scope) <em>Traverse Then And Else Branches</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Traverse Then And Else Branches</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder#traverseThenAndElseBranches(org.moflon.sdm.runtime.democles.IfStatement, org.moflon.core.dfs.Edge, org.moflon.core.dfs.Edge, org.moflon.sdm.runtime.democles.Scope, org.moflon.sdm.runtime.democles.Scope)
    * @generated
    */
   EOperation getControlFlowBuilder__TraverseThenAndElseBranches__IfStatement_Edge_Edge_Scope_Scope();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.controlflow.IdentifierAllocator <em>Identifier Allocator</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Identifier Allocator</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.IdentifierAllocator
    * @generated
    */
   EClass getIdentifierAllocator();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.sdm.compiler.democles.validation.controlflow.IdentifierAllocator#getId <em>Id</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Id</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.IdentifierAllocator#getId()
    * @see #getIdentifierAllocator()
    * @generated
    */
   EAttribute getIdentifierAllocator_Id();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.IdentifierAllocator#incrementIdentifier() <em>Increment Identifier</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Increment Identifier</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.IdentifierAllocator#incrementIdentifier()
    * @generated
    */
   EOperation getIdentifierAllocator__IncrementIdentifier();

   /**
    * Returns the meta object for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.IdentifierAllocator#visitNode(org.moflon.sdm.runtime.democles.CFNode) <em>Visit Node</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Visit Node</em>' operation.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.IdentifierAllocator#visitNode(org.moflon.sdm.runtime.democles.CFNode)
    * @generated
    */
   EOperation getIdentifierAllocator__VisitNode__CFNode();

   /**
    * Returns the meta object for class '{@link org.moflon.sdm.compiler.democles.validation.controlflow.ValidatingEdgeProcessor <em>Validating Edge Processor</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Validating Edge Processor</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ValidatingEdgeProcessor
    * @generated
    */
   EClass getValidatingEdgeProcessor();

   /**
    * Returns the meta object for the reference '{@link org.moflon.sdm.compiler.democles.validation.controlflow.ValidatingEdgeProcessor#getValidator <em>Validator</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Validator</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ValidatingEdgeProcessor#getValidator()
    * @see #getValidatingEdgeProcessor()
    * @generated
    */
   EReference getValidatingEdgeProcessor_Validator();

   /**
    * Returns the meta object for enum '{@link org.moflon.sdm.compiler.democles.validation.controlflow.Errors <em>Errors</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for enum '<em>Errors</em>'.
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.Errors
    * @generated
    */
   EEnum getErrors();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   ControlflowFactory getControlflowFactory();

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
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.ValidatorImpl <em>Validator</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ValidatorImpl
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getValidator()
       * @generated
       */
      EClass VALIDATOR = eINSTANCE.getValidator();

      /**
       * The meta object literal for the '<em><b>Builders</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference VALIDATOR__BUILDERS = eINSTANCE.getValidator_Builders();

      /**
       * The meta object literal for the '<em><b>Graph</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference VALIDATOR__GRAPH = eINSTANCE.getValidator_Graph();

      /**
       * The meta object literal for the '<em><b>Validation Report</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference VALIDATOR__VALIDATION_REPORT = eINSTANCE.getValidator_ValidationReport();

      /**
       * The meta object literal for the '<em><b>Stop Node In For Each Component Severity</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute VALIDATOR__STOP_NODE_IN_FOR_EACH_COMPONENT_SEVERITY = eINSTANCE.getValidator_StopNodeInForEachComponentSeverity();

      /**
       * The meta object literal for the '<em><b>Has Fatal Errors</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation VALIDATOR___HAS_FATAL_ERRORS = eINSTANCE.getValidator__HasFatalErrors();

      /**
       * The meta object literal for the '<em><b>Lookup Error Message</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation VALIDATOR___LOOKUP_ERROR_MESSAGE__ERRORS = eINSTANCE.getValidator__LookupErrorMessage__Errors();

      /**
       * The meta object literal for the '<em><b>Sort Incoming Edges</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation VALIDATOR___SORT_INCOMING_EDGES__NODE = eINSTANCE.getValidator__SortIncomingEdges__Node();

      /**
       * The meta object literal for the '<em><b>Syntactic Check With Start Node Lookup</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation VALIDATOR___SYNTACTIC_CHECK_WITH_START_NODE_LOOKUP__ACTIVITY = eINSTANCE.getValidator__SyntacticCheckWithStartNodeLookup__Activity();

      /**
       * The meta object literal for the '<em><b>Validate</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation VALIDATOR___VALIDATE__ACTIVITY = eINSTANCE.getValidator__Validate__Activity();

      /**
       * The meta object literal for the '<em><b>Validate</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation VALIDATOR___VALIDATE__ACTIVITY_SDMACTIVITYGRAPHBUILDER = eINSTANCE.getValidator__Validate__Activity_SDMActivityGraphBuilder();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.SDMActivityGraphBuilderImpl <em>SDM Activity Graph Builder</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.SDMActivityGraphBuilderImpl
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getSDMActivityGraphBuilder()
       * @generated
       */
      EClass SDM_ACTIVITY_GRAPH_BUILDER = eINSTANCE.getSDMActivityGraphBuilder();

      /**
       * The meta object literal for the '<em><b>Validator</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SDM_ACTIVITY_GRAPH_BUILDER__VALIDATOR = eINSTANCE.getSDMActivityGraphBuilder_Validator();

      /**
       * The meta object literal for the '<em><b>Graph</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SDM_ACTIVITY_GRAPH_BUILDER__GRAPH = eINSTANCE.getSDMActivityGraphBuilder_Graph();

      /**
       * The meta object literal for the '<em><b>Explore Edge</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation SDM_ACTIVITY_GRAPH_BUILDER___EXPLORE_EDGE__EDGE = eINSTANCE.getSDMActivityGraphBuilder__ExploreEdge__Edge();

      /**
       * The meta object literal for the '<em><b>Explore Start Node</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation SDM_ACTIVITY_GRAPH_BUILDER___EXPLORE_START_NODE__STARTNODE = eINSTANCE.getSDMActivityGraphBuilder__ExploreStartNode__StartNode();

      /**
       * The meta object literal for the '<em><b>Explore Statement Node</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation SDM_ACTIVITY_GRAPH_BUILDER___EXPLORE_STATEMENT_NODE__STATEMENTNODE = eINSTANCE
            .getSDMActivityGraphBuilder__ExploreStatementNode__StatementNode();

      /**
       * The meta object literal for the '<em><b>Explore Stop Node</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation SDM_ACTIVITY_GRAPH_BUILDER___EXPLORE_STOP_NODE__STOPNODE = eINSTANCE.getSDMActivityGraphBuilder__ExploreStopNode__StopNode();

      /**
       * The meta object literal for the '<em><b>Explore Story Node</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation SDM_ACTIVITY_GRAPH_BUILDER___EXPLORE_STORY_NODE__STORYNODE = eINSTANCE.getSDMActivityGraphBuilder__ExploreStoryNode__StoryNode();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.CrossEdgeAnalyzerImpl <em>Cross Edge Analyzer</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.CrossEdgeAnalyzerImpl
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getCrossEdgeAnalyzer()
       * @generated
       */
      EClass CROSS_EDGE_ANALYZER = eINSTANCE.getCrossEdgeAnalyzer();

      /**
       * The meta object literal for the '<em><b>Middle Root</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference CROSS_EDGE_ANALYZER__MIDDLE_ROOT = eINSTANCE.getCrossEdgeAnalyzer_MiddleRoot();

      /**
       * The meta object literal for the '<em><b>Lower Tree Tester</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference CROSS_EDGE_ANALYZER__LOWER_TREE_TESTER = eINSTANCE.getCrossEdgeAnalyzer_LowerTreeTester();

      /**
       * The meta object literal for the '<em><b>Delete Edge</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation CROSS_EDGE_ANALYZER___DELETE_EDGE__EDGE = eINSTANCE.getCrossEdgeAnalyzer__DeleteEdge__Edge();

      /**
       * The meta object literal for the '<em><b>Is Node In Wrong Component</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation CROSS_EDGE_ANALYZER___IS_NODE_IN_WRONG_COMPONENT__NODE_INT_INT = eINSTANCE.getCrossEdgeAnalyzer__IsNodeInWrongComponent__Node_int_int();

      /**
       * The meta object literal for the '<em><b>Process Node</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation CROSS_EDGE_ANALYZER___PROCESS_NODE__NODE = eINSTANCE.getCrossEdgeAnalyzer__ProcessNode__Node();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.InefficientBootstrappingBuilderImpl <em>Inefficient Bootstrapping Builder</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.InefficientBootstrappingBuilderImpl
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getInefficientBootstrappingBuilder()
       * @generated
       */
      EClass INEFFICIENT_BOOTSTRAPPING_BUILDER = eINSTANCE.getInefficientBootstrappingBuilder();

      /**
       * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference INEFFICIENT_BOOTSTRAPPING_BUILDER__DELEGATE = eINSTANCE.getInefficientBootstrappingBuilder_Delegate();

      /**
       * The meta object literal for the '<em><b>Explore Statement Node</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation INEFFICIENT_BOOTSTRAPPING_BUILDER___EXPLORE_STATEMENT_NODE__STATEMENTNODE = eINSTANCE
            .getInefficientBootstrappingBuilder__ExploreStatementNode__StatementNode();

      /**
       * The meta object literal for the '<em><b>Explore Stop Node</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation INEFFICIENT_BOOTSTRAPPING_BUILDER___EXPLORE_STOP_NODE__STOPNODE = eINSTANCE.getInefficientBootstrappingBuilder__ExploreStopNode__StopNode();

      /**
       * The meta object literal for the '<em><b>Explore Story Node</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation INEFFICIENT_BOOTSTRAPPING_BUILDER___EXPLORE_STORY_NODE__STORYNODE = eINSTANCE
            .getInefficientBootstrappingBuilder__ExploreStoryNode__StoryNode();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.SubTreeTesterImpl <em>Sub Tree Tester</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.SubTreeTesterImpl
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getSubTreeTester()
       * @generated
       */
      EClass SUB_TREE_TESTER = eINSTANCE.getSubTreeTester();

      /**
       * The meta object literal for the '<em><b>Root</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference SUB_TREE_TESTER__ROOT = eINSTANCE.getSubTreeTester_Root();

      /**
       * The meta object literal for the '<em><b>Include Root</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute SUB_TREE_TESTER__INCLUDE_ROOT = eINSTANCE.getSubTreeTester_IncludeRoot();

      /**
       * The meta object literal for the '<em><b>Is In Sub Tree</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation SUB_TREE_TESTER___IS_IN_SUB_TREE__NODE = eINSTANCE.getSubTreeTester__IsInSubTree__Node();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.TreeEdgeBackwardNavigatorTerminalImpl <em>Tree Edge Backward Navigator Terminal</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.TreeEdgeBackwardNavigatorTerminalImpl
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getTreeEdgeBackwardNavigatorTerminal()
       * @generated
       */
      EClass TREE_EDGE_BACKWARD_NAVIGATOR_TERMINAL = eINSTANCE.getTreeEdgeBackwardNavigatorTerminal();

      /**
       * The meta object literal for the '<em><b>Process Edge</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation TREE_EDGE_BACKWARD_NAVIGATOR_TERMINAL___PROCESS_EDGE__EDGE = eINSTANCE.getTreeEdgeBackwardNavigatorTerminal__ProcessEdge__Edge();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.ForEachComponentProcessorImpl <em>For Each Component Processor</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ForEachComponentProcessorImpl
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getForEachComponentProcessor()
       * @generated
       */
      EClass FOR_EACH_COMPONENT_PROCESSOR = eINSTANCE.getForEachComponentProcessor();

      /**
       * The meta object literal for the '<em><b>Component Starting Node</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference FOR_EACH_COMPONENT_PROCESSOR__COMPONENT_STARTING_NODE = eINSTANCE.getForEachComponentProcessor_ComponentStartingNode();

      /**
       * The meta object literal for the '<em><b>For Each Node</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference FOR_EACH_COMPONENT_PROCESSOR__FOR_EACH_NODE = eINSTANCE.getForEachComponentProcessor_ForEachNode();

      /**
       * The meta object literal for the '<em><b>Post Delegate Edge Analysis</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation FOR_EACH_COMPONENT_PROCESSOR___POST_DELEGATE_EDGE_ANALYSIS__EDGE_EOBJECT = eINSTANCE
            .getForEachComponentProcessor__PostDelegateEdgeAnalysis__Edge_EObject();

      /**
       * The meta object literal for the '<em><b>Process Edge</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation FOR_EACH_COMPONENT_PROCESSOR___PROCESS_EDGE__EDGE = eINSTANCE.getForEachComponentProcessor__ProcessEdge__Edge();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.TreeEdgeNavigatorImpl <em>Tree Edge Navigator</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.TreeEdgeNavigatorImpl
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getTreeEdgeNavigator()
       * @generated
       */
      EClass TREE_EDGE_NAVIGATOR = eINSTANCE.getTreeEdgeNavigator();

      /**
       * The meta object literal for the '<em><b>Terminal Node</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference TREE_EDGE_NAVIGATOR__TERMINAL_NODE = eINSTANCE.getTreeEdgeNavigator_TerminalNode();

      /**
       * The meta object literal for the '<em><b>Forward</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute TREE_EDGE_NAVIGATOR__FORWARD = eINSTANCE.getTreeEdgeNavigator_Forward();

      /**
       * The meta object literal for the '<em><b>Process Edge</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation TREE_EDGE_NAVIGATOR___PROCESS_EDGE__EDGE = eINSTANCE.getTreeEdgeNavigator__ProcessEdge__Edge();

      /**
       * The meta object literal for the '<em><b>Process Node</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation TREE_EDGE_NAVIGATOR___PROCESS_NODE__NODE = eINSTANCE.getTreeEdgeNavigator__ProcessNode__Node();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.JoinNodeFinderImpl <em>Join Node Finder</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.JoinNodeFinderImpl
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getJoinNodeFinder()
       * @generated
       */
      EClass JOIN_NODE_FINDER = eINSTANCE.getJoinNodeFinder();

      /**
       * The meta object literal for the '<em><b>Branch Root</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference JOIN_NODE_FINDER__BRANCH_ROOT = eINSTANCE.getJoinNodeFinder_BranchRoot();

      /**
       * The meta object literal for the '<em><b>Join Nodes</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference JOIN_NODE_FINDER__JOIN_NODES = eINSTANCE.getJoinNodeFinder_JoinNodes();

      /**
       * The meta object literal for the '<em><b>Leads To Join Node</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation JOIN_NODE_FINDER___LEADS_TO_JOIN_NODE__EDGE = eINSTANCE.getJoinNodeFinder__LeadsToJoinNode__Edge();

      /**
       * The meta object literal for the '<em><b>Process Node</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation JOIN_NODE_FINDER___PROCESS_NODE__NODE = eINSTANCE.getJoinNodeFinder__ProcessNode__Node();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.MoflonOperationImpl <em>Moflon Operation</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.MoflonOperationImpl
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getMoflonOperation()
       * @generated
       */
      EClass MOFLON_OPERATION = eINSTANCE.getMoflonOperation();

      /**
       * The meta object literal for the '<em><b>Root Scope</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference MOFLON_OPERATION__ROOT_SCOPE = eINSTANCE.getMoflonOperation_RootScope();

      /**
       * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference MOFLON_OPERATION__ACTIVITY = eINSTANCE.getMoflonOperation_Activity();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.DefaultComponentProcessorImpl <em>Default Component Processor</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.DefaultComponentProcessorImpl
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getDefaultComponentProcessor()
       * @generated
       */
      EClass DEFAULT_COMPONENT_PROCESSOR = eINSTANCE.getDefaultComponentProcessor();

      /**
       * The meta object literal for the '<em><b>Builder</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference DEFAULT_COMPONENT_PROCESSOR__BUILDER = eINSTANCE.getDefaultComponentProcessor_Builder();

      /**
       * The meta object literal for the '<em><b>Explore Target Node</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation DEFAULT_COMPONENT_PROCESSOR___EXPLORE_TARGET_NODE__EDGE = eINSTANCE.getDefaultComponentProcessor__ExploreTargetNode__Edge();

      /**
       * The meta object literal for the '<em><b>Process Edge</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation DEFAULT_COMPONENT_PROCESSOR___PROCESS_EDGE__EDGE = eINSTANCE.getDefaultComponentProcessor__ProcessEdge__Edge();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlFlowBuilderImpl <em>Control Flow Builder</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlFlowBuilderImpl
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getControlFlowBuilder()
       * @generated
       */
      EClass CONTROL_FLOW_BUILDER = eINSTANCE.getControlFlowBuilder();

      /**
       * The meta object literal for the '<em><b>Validator</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference CONTROL_FLOW_BUILDER__VALIDATOR = eINSTANCE.getControlFlowBuilder_Validator();

      /**
       * The meta object literal for the '<em><b>Find Largest Backward Edge Interval</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation CONTROL_FLOW_BUILDER___FIND_LARGEST_BACKWARD_EDGE_INTERVAL__NODE_NODE = eINSTANCE
            .getControlFlowBuilder__FindLargestBackwardEdgeInterval__Node_Node();

      /**
       * The meta object literal for the '<em><b>Handle For Each Node</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation CONTROL_FLOW_BUILDER___HANDLE_FOR_EACH_NODE__SCOPE_NODE_STORYNODE = eINSTANCE.getControlFlowBuilder__HandleForEachNode__Scope_Node_StoryNode();

      /**
       * The meta object literal for the '<em><b>Handle Head Controlled Loop</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation CONTROL_FLOW_BUILDER___HANDLE_HEAD_CONTROLLED_LOOP__SCOPE_NODE_EDGE = eINSTANCE
            .getControlFlowBuilder__HandleHeadControlledLoop__Scope_Node_Edge();

      /**
       * The meta object literal for the '<em><b>Handle Simple Node</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation CONTROL_FLOW_BUILDER___HANDLE_SIMPLE_NODE__SCOPE_NODE_EDGE = eINSTANCE.getControlFlowBuilder__HandleSimpleNode__Scope_Node_Edge();

      /**
       * The meta object literal for the '<em><b>Handle Stumped Edge</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation CONTROL_FLOW_BUILDER___HANDLE_STUMPED_EDGE__SCOPE_EDGE_CFNODE = eINSTANCE.getControlFlowBuilder__HandleStumpedEdge__Scope_Edge_CFNode();

      /**
       * The meta object literal for the '<em><b>Handle Tail Controlled Loop</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation CONTROL_FLOW_BUILDER___HANDLE_TAIL_CONTROLLED_LOOP__SCOPE_NODE_EDGE = eINSTANCE
            .getControlFlowBuilder__HandleTailControlledLoop__Scope_Node_Edge();

      /**
       * The meta object literal for the '<em><b>Handle Unique Join Node</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation CONTROL_FLOW_BUILDER___HANDLE_UNIQUE_JOIN_NODE__NODE_NODE_NODE = eINSTANCE.getControlFlowBuilder__HandleUniqueJoinNode__Node_Node_Node();

      /**
       * The meta object literal for the '<em><b>Is Head Controlled Loop Branch</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation CONTROL_FLOW_BUILDER___IS_HEAD_CONTROLLED_LOOP_BRANCH__EDGE = eINSTANCE.getControlFlowBuilder__IsHeadControlledLoopBranch__Edge();

      /**
       * The meta object literal for the '<em><b>Is Loop Branch</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation CONTROL_FLOW_BUILDER___IS_LOOP_BRANCH__EDGE = eINSTANCE.getControlFlowBuilder__IsLoopBranch__Edge();

      /**
       * The meta object literal for the '<em><b>Lookahead</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation CONTROL_FLOW_BUILDER___LOOKAHEAD__SCOPE_NODE = eINSTANCE.getControlFlowBuilder__Lookahead__Scope_Node();

      /**
       * The meta object literal for the '<em><b>Lookahead And Connect</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation CONTROL_FLOW_BUILDER___LOOKAHEAD_AND_CONNECT__SCOPE_NODE_CFNODE = eINSTANCE.getControlFlowBuilder__LookaheadAndConnect__Scope_Node_CFNode();

      /**
       * The meta object literal for the '<em><b>Process Node</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation CONTROL_FLOW_BUILDER___PROCESS_NODE__SCOPE_NODE = eINSTANCE.getControlFlowBuilder__ProcessNode__Scope_Node();

      /**
       * The meta object literal for the '<em><b>Traverse Then And Else Branches</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation CONTROL_FLOW_BUILDER___TRAVERSE_THEN_AND_ELSE_BRANCHES__IFSTATEMENT_EDGE_EDGE_SCOPE_SCOPE = eINSTANCE
            .getControlFlowBuilder__TraverseThenAndElseBranches__IfStatement_Edge_Edge_Scope_Scope();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.IdentifierAllocatorImpl <em>Identifier Allocator</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.IdentifierAllocatorImpl
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getIdentifierAllocator()
       * @generated
       */
      EClass IDENTIFIER_ALLOCATOR = eINSTANCE.getIdentifierAllocator();

      /**
       * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute IDENTIFIER_ALLOCATOR__ID = eINSTANCE.getIdentifierAllocator_Id();

      /**
       * The meta object literal for the '<em><b>Increment Identifier</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation IDENTIFIER_ALLOCATOR___INCREMENT_IDENTIFIER = eINSTANCE.getIdentifierAllocator__IncrementIdentifier();

      /**
       * The meta object literal for the '<em><b>Visit Node</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation IDENTIFIER_ALLOCATOR___VISIT_NODE__CFNODE = eINSTANCE.getIdentifierAllocator__VisitNode__CFNode();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.impl.ValidatingEdgeProcessorImpl <em>Validating Edge Processor</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ValidatingEdgeProcessorImpl
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getValidatingEdgeProcessor()
       * @generated
       */
      EClass VALIDATING_EDGE_PROCESSOR = eINSTANCE.getValidatingEdgeProcessor();

      /**
       * The meta object literal for the '<em><b>Validator</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference VALIDATING_EDGE_PROCESSOR__VALIDATOR = eINSTANCE.getValidatingEdgeProcessor_Validator();

      /**
       * The meta object literal for the '{@link org.moflon.sdm.compiler.democles.validation.controlflow.Errors <em>Errors</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.Errors
       * @see org.moflon.sdm.compiler.democles.validation.controlflow.impl.ControlflowPackageImpl#getErrors()
       * @generated
       */
      EEnum ERRORS = eINSTANCE.getErrors();

   }

} //ControlflowPackage
