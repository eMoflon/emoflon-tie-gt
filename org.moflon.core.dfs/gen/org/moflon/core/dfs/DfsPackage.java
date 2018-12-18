/**
 */
package org.moflon.core.dfs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.moflon.core.dfs.DfsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.moflon.core'"
 * @generated
 */
public interface DfsPackage extends EPackage
{
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNAME = "dfs";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_URI = "platform:/plugin/org.moflon.core.dfs/model/Dfs.ecore";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   String eNS_PREFIX = "org.moflon.core.dfs";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   DfsPackage eINSTANCE = org.moflon.core.dfs.impl.DfsPackageImpl.init();

   /**
    * The meta object id for the '{@link org.moflon.core.dfs.impl.EdgeProcessorImpl <em>Edge Processor</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.core.dfs.impl.EdgeProcessorImpl
    * @see org.moflon.core.dfs.impl.DfsPackageImpl#getEdgeProcessor()
    * @generated
    */
   int EDGE_PROCESSOR = 0;

   /**
    * The feature id for the '<em><b>Delegate</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EDGE_PROCESSOR__DELEGATE = 0;

   /**
    * The number of structural features of the '<em>Edge Processor</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EDGE_PROCESSOR_FEATURE_COUNT = 1;

   /**
    * The operation id for the '<em>Process Edge</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EDGE_PROCESSOR___PROCESS_EDGE__EDGE = 0;

   /**
    * The operation id for the '<em>Process Node</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EDGE_PROCESSOR___PROCESS_NODE__NODE = 1;

   /**
    * The number of operations of the '<em>Edge Processor</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EDGE_PROCESSOR_OPERATION_COUNT = 2;

   /**
    * The meta object id for the '{@link org.moflon.core.dfs.impl.NodeImpl <em>Node</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.core.dfs.impl.NodeImpl
    * @see org.moflon.core.dfs.impl.DfsPackageImpl#getNode()
    * @generated
    */
   int NODE = 1;

   /**
    * The feature id for the '<em><b>Incoming</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE__INCOMING = 0;

   /**
    * The feature id for the '<em><b>Graph</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE__GRAPH = 1;

   /**
    * The feature id for the '<em><b>Origin</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE__ORIGIN = 2;

   /**
    * The feature id for the '<em><b>Outgoing</b></em>' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE__OUTGOING = 3;

   /**
    * The feature id for the '<em><b>Post Traversal</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE__POST_TRAVERSAL = 4;

   /**
    * The feature id for the '<em><b>Pre Traversal</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE__PRE_TRAVERSAL = 5;

   /**
    * The number of structural features of the '<em>Node</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE_FEATURE_COUNT = 6;

   /**
    * The number of operations of the '<em>Node</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int NODE_OPERATION_COUNT = 0;

   /**
    * The meta object id for the '{@link org.moflon.core.dfs.impl.EdgeImpl <em>Edge</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.core.dfs.impl.EdgeImpl
    * @see org.moflon.core.dfs.impl.DfsPackageImpl#getEdge()
    * @generated
    */
   int EDGE = 2;

   /**
    * The feature id for the '<em><b>Graph</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EDGE__GRAPH = 0;

   /**
    * The feature id for the '<em><b>Source</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EDGE__SOURCE = 1;

   /**
    * The feature id for the '<em><b>Origin</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EDGE__ORIGIN = 2;

   /**
    * The feature id for the '<em><b>Target</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EDGE__TARGET = 3;

   /**
    * The feature id for the '<em><b>Type</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EDGE__TYPE = 4;

   /**
    * The number of structural features of the '<em>Edge</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EDGE_FEATURE_COUNT = 5;

   /**
    * The number of operations of the '<em>Edge</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int EDGE_OPERATION_COUNT = 0;

   /**
    * The meta object id for the '{@link org.moflon.core.dfs.impl.DepthFirstSearchImpl <em>Depth First Search</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.core.dfs.impl.DepthFirstSearchImpl
    * @see org.moflon.core.dfs.impl.DfsPackageImpl#getDepthFirstSearch()
    * @generated
    */
   int DEPTH_FIRST_SEARCH = 3;

   /**
    * The feature id for the '<em><b>Delegate</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEPTH_FIRST_SEARCH__DELEGATE = EDGE_PROCESSOR__DELEGATE;

   /**
    * The feature id for the '<em><b>Post Traversal Counter</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEPTH_FIRST_SEARCH__POST_TRAVERSAL_COUNTER = EDGE_PROCESSOR_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Pre Traversal Counter</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEPTH_FIRST_SEARCH__PRE_TRAVERSAL_COUNTER = EDGE_PROCESSOR_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Depth First Search</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEPTH_FIRST_SEARCH_FEATURE_COUNT = EDGE_PROCESSOR_FEATURE_COUNT + 2;

   /**
    * The operation id for the '<em>Increment Post Traversal Counter</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEPTH_FIRST_SEARCH___INCREMENT_POST_TRAVERSAL_COUNTER = EDGE_PROCESSOR_OPERATION_COUNT + 0;

   /**
    * The operation id for the '<em>Increment Pre Traversal Counter</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEPTH_FIRST_SEARCH___INCREMENT_PRE_TRAVERSAL_COUNTER = EDGE_PROCESSOR_OPERATION_COUNT + 1;

   /**
    * The operation id for the '<em>Process Edge</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEPTH_FIRST_SEARCH___PROCESS_EDGE__EDGE = EDGE_PROCESSOR_OPERATION_COUNT + 2;

   /**
    * The operation id for the '<em>Process Node</em>' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEPTH_FIRST_SEARCH___PROCESS_NODE__NODE = EDGE_PROCESSOR_OPERATION_COUNT + 3;

   /**
    * The number of operations of the '<em>Depth First Search</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DEPTH_FIRST_SEARCH_OPERATION_COUNT = EDGE_PROCESSOR_OPERATION_COUNT + 4;

   /**
    * The meta object id for the '{@link org.moflon.core.dfs.impl.DFSGraphImpl <em>DFS Graph</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.core.dfs.impl.DFSGraphImpl
    * @see org.moflon.core.dfs.impl.DfsPackageImpl#getDFSGraph()
    * @generated
    */
   int DFS_GRAPH = 4;

   /**
    * The feature id for the '<em><b>Edges</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DFS_GRAPH__EDGES = 0;

   /**
    * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DFS_GRAPH__NODES = 1;

   /**
    * The number of structural features of the '<em>DFS Graph</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DFS_GRAPH_FEATURE_COUNT = 2;

   /**
    * The number of operations of the '<em>DFS Graph</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    * @ordered
    */
   int DFS_GRAPH_OPERATION_COUNT = 0;

   /**
    * The meta object id for the '{@link org.moflon.core.dfs.EdgeType <em>Edge Type</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.moflon.core.dfs.EdgeType
    * @see org.moflon.core.dfs.impl.DfsPackageImpl#getEdgeType()
    * @generated
    */
   int EDGE_TYPE = 5;

   /**
    * Returns the meta object for class '{@link org.moflon.core.dfs.EdgeProcessor <em>Edge Processor</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Edge Processor</em>'.
    * @see org.moflon.core.dfs.EdgeProcessor
    * @generated
    */
   EClass getEdgeProcessor();

   /**
    * Returns the meta object for the reference '{@link org.moflon.core.dfs.EdgeProcessor#getDelegate <em>Delegate</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Delegate</em>'.
    * @see org.moflon.core.dfs.EdgeProcessor#getDelegate()
    * @see #getEdgeProcessor()
    * @generated
    */
   EReference getEdgeProcessor_Delegate();

   /**
    * Returns the meta object for the '{@link org.moflon.core.dfs.EdgeProcessor#processEdge(org.moflon.core.dfs.Edge) <em>Process Edge</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Process Edge</em>' operation.
    * @see org.moflon.core.dfs.EdgeProcessor#processEdge(org.moflon.core.dfs.Edge)
    * @generated
    */
   EOperation getEdgeProcessor__ProcessEdge__Edge();

   /**
    * Returns the meta object for the '{@link org.moflon.core.dfs.EdgeProcessor#processNode(org.moflon.core.dfs.Node) <em>Process Node</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Process Node</em>' operation.
    * @see org.moflon.core.dfs.EdgeProcessor#processNode(org.moflon.core.dfs.Node)
    * @generated
    */
   EOperation getEdgeProcessor__ProcessNode__Node();

   /**
    * Returns the meta object for class '{@link org.moflon.core.dfs.Node <em>Node</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Node</em>'.
    * @see org.moflon.core.dfs.Node
    * @generated
    */
   EClass getNode();

   /**
    * Returns the meta object for the reference list '{@link org.moflon.core.dfs.Node#getIncoming <em>Incoming</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Incoming</em>'.
    * @see org.moflon.core.dfs.Node#getIncoming()
    * @see #getNode()
    * @generated
    */
   EReference getNode_Incoming();

   /**
    * Returns the meta object for the container reference '{@link org.moflon.core.dfs.Node#getGraph <em>Graph</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Graph</em>'.
    * @see org.moflon.core.dfs.Node#getGraph()
    * @see #getNode()
    * @generated
    */
   EReference getNode_Graph();

   /**
    * Returns the meta object for the reference '{@link org.moflon.core.dfs.Node#getOrigin <em>Origin</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Origin</em>'.
    * @see org.moflon.core.dfs.Node#getOrigin()
    * @see #getNode()
    * @generated
    */
   EReference getNode_Origin();

   /**
    * Returns the meta object for the reference list '{@link org.moflon.core.dfs.Node#getOutgoing <em>Outgoing</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference list '<em>Outgoing</em>'.
    * @see org.moflon.core.dfs.Node#getOutgoing()
    * @see #getNode()
    * @generated
    */
   EReference getNode_Outgoing();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.core.dfs.Node#getPostTraversal <em>Post Traversal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Post Traversal</em>'.
    * @see org.moflon.core.dfs.Node#getPostTraversal()
    * @see #getNode()
    * @generated
    */
   EAttribute getNode_PostTraversal();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.core.dfs.Node#getPreTraversal <em>Pre Traversal</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Pre Traversal</em>'.
    * @see org.moflon.core.dfs.Node#getPreTraversal()
    * @see #getNode()
    * @generated
    */
   EAttribute getNode_PreTraversal();

   /**
    * Returns the meta object for class '{@link org.moflon.core.dfs.Edge <em>Edge</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Edge</em>'.
    * @see org.moflon.core.dfs.Edge
    * @generated
    */
   EClass getEdge();

   /**
    * Returns the meta object for the container reference '{@link org.moflon.core.dfs.Edge#getGraph <em>Graph</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the container reference '<em>Graph</em>'.
    * @see org.moflon.core.dfs.Edge#getGraph()
    * @see #getEdge()
    * @generated
    */
   EReference getEdge_Graph();

   /**
    * Returns the meta object for the reference '{@link org.moflon.core.dfs.Edge#getSource <em>Source</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Source</em>'.
    * @see org.moflon.core.dfs.Edge#getSource()
    * @see #getEdge()
    * @generated
    */
   EReference getEdge_Source();

   /**
    * Returns the meta object for the reference '{@link org.moflon.core.dfs.Edge#getOrigin <em>Origin</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Origin</em>'.
    * @see org.moflon.core.dfs.Edge#getOrigin()
    * @see #getEdge()
    * @generated
    */
   EReference getEdge_Origin();

   /**
    * Returns the meta object for the reference '{@link org.moflon.core.dfs.Edge#getTarget <em>Target</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the reference '<em>Target</em>'.
    * @see org.moflon.core.dfs.Edge#getTarget()
    * @see #getEdge()
    * @generated
    */
   EReference getEdge_Target();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.core.dfs.Edge#getType <em>Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Type</em>'.
    * @see org.moflon.core.dfs.Edge#getType()
    * @see #getEdge()
    * @generated
    */
   EAttribute getEdge_Type();

   /**
    * Returns the meta object for class '{@link org.moflon.core.dfs.DepthFirstSearch <em>Depth First Search</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>Depth First Search</em>'.
    * @see org.moflon.core.dfs.DepthFirstSearch
    * @generated
    */
   EClass getDepthFirstSearch();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.core.dfs.DepthFirstSearch#getPostTraversalCounter <em>Post Traversal Counter</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Post Traversal Counter</em>'.
    * @see org.moflon.core.dfs.DepthFirstSearch#getPostTraversalCounter()
    * @see #getDepthFirstSearch()
    * @generated
    */
   EAttribute getDepthFirstSearch_PostTraversalCounter();

   /**
    * Returns the meta object for the attribute '{@link org.moflon.core.dfs.DepthFirstSearch#getPreTraversalCounter <em>Pre Traversal Counter</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the attribute '<em>Pre Traversal Counter</em>'.
    * @see org.moflon.core.dfs.DepthFirstSearch#getPreTraversalCounter()
    * @see #getDepthFirstSearch()
    * @generated
    */
   EAttribute getDepthFirstSearch_PreTraversalCounter();

   /**
    * Returns the meta object for the '{@link org.moflon.core.dfs.DepthFirstSearch#incrementPostTraversalCounter() <em>Increment Post Traversal Counter</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Increment Post Traversal Counter</em>' operation.
    * @see org.moflon.core.dfs.DepthFirstSearch#incrementPostTraversalCounter()
    * @generated
    */
   EOperation getDepthFirstSearch__IncrementPostTraversalCounter();

   /**
    * Returns the meta object for the '{@link org.moflon.core.dfs.DepthFirstSearch#incrementPreTraversalCounter() <em>Increment Pre Traversal Counter</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Increment Pre Traversal Counter</em>' operation.
    * @see org.moflon.core.dfs.DepthFirstSearch#incrementPreTraversalCounter()
    * @generated
    */
   EOperation getDepthFirstSearch__IncrementPreTraversalCounter();

   /**
    * Returns the meta object for the '{@link org.moflon.core.dfs.DepthFirstSearch#processEdge(org.moflon.core.dfs.Edge) <em>Process Edge</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Process Edge</em>' operation.
    * @see org.moflon.core.dfs.DepthFirstSearch#processEdge(org.moflon.core.dfs.Edge)
    * @generated
    */
   EOperation getDepthFirstSearch__ProcessEdge__Edge();

   /**
    * Returns the meta object for the '{@link org.moflon.core.dfs.DepthFirstSearch#processNode(org.moflon.core.dfs.Node) <em>Process Node</em>}' operation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the '<em>Process Node</em>' operation.
    * @see org.moflon.core.dfs.DepthFirstSearch#processNode(org.moflon.core.dfs.Node)
    * @generated
    */
   EOperation getDepthFirstSearch__ProcessNode__Node();

   /**
    * Returns the meta object for class '{@link org.moflon.core.dfs.DFSGraph <em>DFS Graph</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for class '<em>DFS Graph</em>'.
    * @see org.moflon.core.dfs.DFSGraph
    * @generated
    */
   EClass getDFSGraph();

   /**
    * Returns the meta object for the containment reference list '{@link org.moflon.core.dfs.DFSGraph#getEdges <em>Edges</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Edges</em>'.
    * @see org.moflon.core.dfs.DFSGraph#getEdges()
    * @see #getDFSGraph()
    * @generated
    */
   EReference getDFSGraph_Edges();

   /**
    * Returns the meta object for the containment reference list '{@link org.moflon.core.dfs.DFSGraph#getNodes <em>Nodes</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for the containment reference list '<em>Nodes</em>'.
    * @see org.moflon.core.dfs.DFSGraph#getNodes()
    * @see #getDFSGraph()
    * @generated
    */
   EReference getDFSGraph_Nodes();

   /**
    * Returns the meta object for enum '{@link org.moflon.core.dfs.EdgeType <em>Edge Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the meta object for enum '<em>Edge Type</em>'.
    * @see org.moflon.core.dfs.EdgeType
    * @generated
    */
   EEnum getEdgeType();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the factory that creates the instances of the model.
    * @generated
    */
   DfsFactory getDfsFactory();

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
       * The meta object literal for the '{@link org.moflon.core.dfs.impl.EdgeProcessorImpl <em>Edge Processor</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.core.dfs.impl.EdgeProcessorImpl
       * @see org.moflon.core.dfs.impl.DfsPackageImpl#getEdgeProcessor()
       * @generated
       */
      EClass EDGE_PROCESSOR = eINSTANCE.getEdgeProcessor();

      /**
       * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference EDGE_PROCESSOR__DELEGATE = eINSTANCE.getEdgeProcessor_Delegate();

      /**
       * The meta object literal for the '<em><b>Process Edge</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation EDGE_PROCESSOR___PROCESS_EDGE__EDGE = eINSTANCE.getEdgeProcessor__ProcessEdge__Edge();

      /**
       * The meta object literal for the '<em><b>Process Node</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation EDGE_PROCESSOR___PROCESS_NODE__NODE = eINSTANCE.getEdgeProcessor__ProcessNode__Node();

      /**
       * The meta object literal for the '{@link org.moflon.core.dfs.impl.NodeImpl <em>Node</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.core.dfs.impl.NodeImpl
       * @see org.moflon.core.dfs.impl.DfsPackageImpl#getNode()
       * @generated
       */
      EClass NODE = eINSTANCE.getNode();

      /**
       * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference NODE__INCOMING = eINSTANCE.getNode_Incoming();

      /**
       * The meta object literal for the '<em><b>Graph</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference NODE__GRAPH = eINSTANCE.getNode_Graph();

      /**
       * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference NODE__ORIGIN = eINSTANCE.getNode_Origin();

      /**
       * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference NODE__OUTGOING = eINSTANCE.getNode_Outgoing();

      /**
       * The meta object literal for the '<em><b>Post Traversal</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute NODE__POST_TRAVERSAL = eINSTANCE.getNode_PostTraversal();

      /**
       * The meta object literal for the '<em><b>Pre Traversal</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute NODE__PRE_TRAVERSAL = eINSTANCE.getNode_PreTraversal();

      /**
       * The meta object literal for the '{@link org.moflon.core.dfs.impl.EdgeImpl <em>Edge</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.core.dfs.impl.EdgeImpl
       * @see org.moflon.core.dfs.impl.DfsPackageImpl#getEdge()
       * @generated
       */
      EClass EDGE = eINSTANCE.getEdge();

      /**
       * The meta object literal for the '<em><b>Graph</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference EDGE__GRAPH = eINSTANCE.getEdge_Graph();

      /**
       * The meta object literal for the '<em><b>Source</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference EDGE__SOURCE = eINSTANCE.getEdge_Source();

      /**
       * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference EDGE__ORIGIN = eINSTANCE.getEdge_Origin();

      /**
       * The meta object literal for the '<em><b>Target</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference EDGE__TARGET = eINSTANCE.getEdge_Target();

      /**
       * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute EDGE__TYPE = eINSTANCE.getEdge_Type();

      /**
       * The meta object literal for the '{@link org.moflon.core.dfs.impl.DepthFirstSearchImpl <em>Depth First Search</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.core.dfs.impl.DepthFirstSearchImpl
       * @see org.moflon.core.dfs.impl.DfsPackageImpl#getDepthFirstSearch()
       * @generated
       */
      EClass DEPTH_FIRST_SEARCH = eINSTANCE.getDepthFirstSearch();

      /**
       * The meta object literal for the '<em><b>Post Traversal Counter</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute DEPTH_FIRST_SEARCH__POST_TRAVERSAL_COUNTER = eINSTANCE.getDepthFirstSearch_PostTraversalCounter();

      /**
       * The meta object literal for the '<em><b>Pre Traversal Counter</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EAttribute DEPTH_FIRST_SEARCH__PRE_TRAVERSAL_COUNTER = eINSTANCE.getDepthFirstSearch_PreTraversalCounter();

      /**
       * The meta object literal for the '<em><b>Increment Post Traversal Counter</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation DEPTH_FIRST_SEARCH___INCREMENT_POST_TRAVERSAL_COUNTER = eINSTANCE.getDepthFirstSearch__IncrementPostTraversalCounter();

      /**
       * The meta object literal for the '<em><b>Increment Pre Traversal Counter</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation DEPTH_FIRST_SEARCH___INCREMENT_PRE_TRAVERSAL_COUNTER = eINSTANCE.getDepthFirstSearch__IncrementPreTraversalCounter();

      /**
       * The meta object literal for the '<em><b>Process Edge</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation DEPTH_FIRST_SEARCH___PROCESS_EDGE__EDGE = eINSTANCE.getDepthFirstSearch__ProcessEdge__Edge();

      /**
       * The meta object literal for the '<em><b>Process Node</b></em>' operation.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EOperation DEPTH_FIRST_SEARCH___PROCESS_NODE__NODE = eINSTANCE.getDepthFirstSearch__ProcessNode__Node();

      /**
       * The meta object literal for the '{@link org.moflon.core.dfs.impl.DFSGraphImpl <em>DFS Graph</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.core.dfs.impl.DFSGraphImpl
       * @see org.moflon.core.dfs.impl.DfsPackageImpl#getDFSGraph()
       * @generated
       */
      EClass DFS_GRAPH = eINSTANCE.getDFSGraph();

      /**
       * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference DFS_GRAPH__EDGES = eINSTANCE.getDFSGraph_Edges();

      /**
       * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @generated
       */
      EReference DFS_GRAPH__NODES = eINSTANCE.getDFSGraph_Nodes();

      /**
       * The meta object literal for the '{@link org.moflon.core.dfs.EdgeType <em>Edge Type</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * @see org.moflon.core.dfs.EdgeType
       * @see org.moflon.core.dfs.impl.DfsPackageImpl#getEdgeType()
       * @generated
       */
      EEnum EDGE_TYPE = eINSTANCE.getEdgeType();

   }

} //DfsPackage
