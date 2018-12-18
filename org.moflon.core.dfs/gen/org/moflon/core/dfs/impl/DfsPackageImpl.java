/**
 */
package org.moflon.core.dfs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.moflon.core.dfs.DFSGraph;
import org.moflon.core.dfs.DepthFirstSearch;
import org.moflon.core.dfs.DfsFactory;
import org.moflon.core.dfs.DfsPackage;
import org.moflon.core.dfs.Edge;
import org.moflon.core.dfs.EdgeProcessor;
import org.moflon.core.dfs.EdgeType;
import org.moflon.core.dfs.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DfsPackageImpl extends EPackageImpl implements DfsPackage
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass edgeProcessorEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass nodeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass edgeEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass depthFirstSearchEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass dfsGraphEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EEnum edgeTypeEEnum = null;

   /**
    * Creates an instance of the model <b>Package</b>, registered with
    * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
    * package URI value.
    * <p>Note: the correct way to create the package is via the static
    * factory method {@link #init init()}, which also performs
    * initialization of the package, or returns the registered package,
    * if one already exists.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.emf.ecore.EPackage.Registry
    * @see org.moflon.core.dfs.DfsPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private DfsPackageImpl()
   {
      super(eNS_URI, DfsFactory.eINSTANCE);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static boolean isInited = false;

   /**
    * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
    * 
    * <p>This method is used to initialize {@link DfsPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static DfsPackage init()
   {
      if (isInited)
         return (DfsPackage) EPackage.Registry.INSTANCE.getEPackage(DfsPackage.eNS_URI);

      // Obtain or create and register package
      DfsPackageImpl theDfsPackage = (DfsPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DfsPackageImpl
            ? EPackage.Registry.INSTANCE.get(eNS_URI)
            : new DfsPackageImpl());

      isInited = true;

      // Create package meta-data objects
      theDfsPackage.createPackageContents();

      // Initialize created meta-data
      theDfsPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theDfsPackage.freeze();

      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(DfsPackage.eNS_URI, theDfsPackage);
      return theDfsPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getEdgeProcessor()
   {
      return edgeProcessorEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEdgeProcessor_Delegate()
   {
      return (EReference) edgeProcessorEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getEdgeProcessor__ProcessEdge__Edge()
   {
      return edgeProcessorEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getEdgeProcessor__ProcessNode__Node()
   {
      return edgeProcessorEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getNode()
   {
      return nodeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getNode_Incoming()
   {
      return (EReference) nodeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getNode_Graph()
   {
      return (EReference) nodeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getNode_Origin()
   {
      return (EReference) nodeEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getNode_Outgoing()
   {
      return (EReference) nodeEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getNode_PostTraversal()
   {
      return (EAttribute) nodeEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getNode_PreTraversal()
   {
      return (EAttribute) nodeEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getEdge()
   {
      return edgeEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEdge_Graph()
   {
      return (EReference) edgeEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEdge_Source()
   {
      return (EReference) edgeEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEdge_Origin()
   {
      return (EReference) edgeEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getEdge_Target()
   {
      return (EReference) edgeEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getEdge_Type()
   {
      return (EAttribute) edgeEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getDepthFirstSearch()
   {
      return depthFirstSearchEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getDepthFirstSearch_PostTraversalCounter()
   {
      return (EAttribute) depthFirstSearchEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getDepthFirstSearch_PreTraversalCounter()
   {
      return (EAttribute) depthFirstSearchEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getDepthFirstSearch__IncrementPostTraversalCounter()
   {
      return depthFirstSearchEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getDepthFirstSearch__IncrementPreTraversalCounter()
   {
      return depthFirstSearchEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getDepthFirstSearch__ProcessEdge__Edge()
   {
      return depthFirstSearchEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getDepthFirstSearch__ProcessNode__Node()
   {
      return depthFirstSearchEClass.getEOperations().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getDFSGraph()
   {
      return dfsGraphEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getDFSGraph_Edges()
   {
      return (EReference) dfsGraphEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getDFSGraph_Nodes()
   {
      return (EReference) dfsGraphEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EEnum getEdgeType()
   {
      return edgeTypeEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DfsFactory getDfsFactory()
   {
      return (DfsFactory) getEFactoryInstance();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private boolean isCreated = false;

   /**
    * Creates the meta-model objects for the package.  This method is
    * guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void createPackageContents()
   {
      if (isCreated)
         return;
      isCreated = true;

      // Create classes and their features
      edgeProcessorEClass = createEClass(EDGE_PROCESSOR);
      createEReference(edgeProcessorEClass, EDGE_PROCESSOR__DELEGATE);
      createEOperation(edgeProcessorEClass, EDGE_PROCESSOR___PROCESS_EDGE__EDGE);
      createEOperation(edgeProcessorEClass, EDGE_PROCESSOR___PROCESS_NODE__NODE);

      nodeEClass = createEClass(NODE);
      createEReference(nodeEClass, NODE__INCOMING);
      createEReference(nodeEClass, NODE__GRAPH);
      createEReference(nodeEClass, NODE__ORIGIN);
      createEReference(nodeEClass, NODE__OUTGOING);
      createEAttribute(nodeEClass, NODE__POST_TRAVERSAL);
      createEAttribute(nodeEClass, NODE__PRE_TRAVERSAL);

      edgeEClass = createEClass(EDGE);
      createEReference(edgeEClass, EDGE__GRAPH);
      createEReference(edgeEClass, EDGE__SOURCE);
      createEReference(edgeEClass, EDGE__ORIGIN);
      createEReference(edgeEClass, EDGE__TARGET);
      createEAttribute(edgeEClass, EDGE__TYPE);

      depthFirstSearchEClass = createEClass(DEPTH_FIRST_SEARCH);
      createEAttribute(depthFirstSearchEClass, DEPTH_FIRST_SEARCH__POST_TRAVERSAL_COUNTER);
      createEAttribute(depthFirstSearchEClass, DEPTH_FIRST_SEARCH__PRE_TRAVERSAL_COUNTER);
      createEOperation(depthFirstSearchEClass, DEPTH_FIRST_SEARCH___INCREMENT_POST_TRAVERSAL_COUNTER);
      createEOperation(depthFirstSearchEClass, DEPTH_FIRST_SEARCH___INCREMENT_PRE_TRAVERSAL_COUNTER);
      createEOperation(depthFirstSearchEClass, DEPTH_FIRST_SEARCH___PROCESS_EDGE__EDGE);
      createEOperation(depthFirstSearchEClass, DEPTH_FIRST_SEARCH___PROCESS_NODE__NODE);

      dfsGraphEClass = createEClass(DFS_GRAPH);
      createEReference(dfsGraphEClass, DFS_GRAPH__EDGES);
      createEReference(dfsGraphEClass, DFS_GRAPH__NODES);

      // Create enums
      edgeTypeEEnum = createEEnum(EDGE_TYPE);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private boolean isInitialized = false;

   /**
    * Complete the initialization of the package and its meta-model.  This
    * method is guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void initializePackageContents()
   {
      if (isInitialized)
         return;
      isInitialized = true;

      // Initialize package
      setName(eNAME);
      setNsPrefix(eNS_PREFIX);
      setNsURI(eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      depthFirstSearchEClass.getESuperTypes().add(this.getEdgeProcessor());

      // Initialize classes, features, and operations; add parameters
      initEClass(edgeProcessorEClass, EdgeProcessor.class, "EdgeProcessor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getEdgeProcessor_Delegate(), this.getEdgeProcessor(), null, "delegate", null, 0, 1, EdgeProcessor.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      EOperation op = initEOperation(getEdgeProcessor__ProcessEdge__Edge(), ecorePackage.getEObject(), "processEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getEdge(), "edge", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getEdgeProcessor__ProcessNode__Node(), ecorePackage.getEObject(), "processNode", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getNode_Incoming(), this.getEdge(), this.getEdge_Target(), "incoming", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getNode_Graph(), this.getDFSGraph(), this.getDFSGraph_Nodes(), "graph", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getNode_Origin(), ecorePackage.getEObject(), null, "origin", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getNode_Outgoing(), this.getEdge(), this.getEdge_Source(), "outgoing", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getNode_PostTraversal(), ecorePackage.getEInt(), "postTraversal", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getNode_PreTraversal(), ecorePackage.getEInt(), "preTraversal", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getEdge_Graph(), this.getDFSGraph(), this.getDFSGraph_Edges(), "graph", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getEdge_Source(), this.getNode(), this.getNode_Outgoing(), "source", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getEdge_Origin(), ecorePackage.getEObject(), null, "origin", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getEdge_Target(), this.getNode(), this.getNode_Incoming(), "target", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getEdge_Type(), this.getEdgeType(), "type", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
            IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEClass(depthFirstSearchEClass, DepthFirstSearch.class, "DepthFirstSearch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getDepthFirstSearch_PostTraversalCounter(), ecorePackage.getEInt(), "postTraversalCounter", "0", 1, 1, DepthFirstSearch.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
      initEAttribute(getDepthFirstSearch_PreTraversalCounter(), ecorePackage.getEInt(), "preTraversalCounter", "0", 1, 1, DepthFirstSearch.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEOperation(getDepthFirstSearch__IncrementPostTraversalCounter(), ecorePackage.getEInt(), "incrementPostTraversalCounter", 0, 1, IS_UNIQUE,
            IS_ORDERED);

      initEOperation(getDepthFirstSearch__IncrementPreTraversalCounter(), ecorePackage.getEInt(), "incrementPreTraversalCounter", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getDepthFirstSearch__ProcessEdge__Edge(), ecorePackage.getEObject(), "processEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getEdge(), "edge", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getDepthFirstSearch__ProcessNode__Node(), ecorePackage.getEObject(), "processNode", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(dfsGraphEClass, DFSGraph.class, "DFSGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getDFSGraph_Edges(), this.getEdge(), this.getEdge_Graph(), "edges", null, 0, -1, DFSGraph.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getDFSGraph_Nodes(), this.getNode(), this.getNode_Graph(), "nodes", null, 0, -1, DFSGraph.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      // Initialize enums and add enum literals
      initEEnum(edgeTypeEEnum, EdgeType.class, "EdgeType");
      addEEnumLiteral(edgeTypeEEnum, EdgeType.TREE_EDGE);
      addEEnumLiteral(edgeTypeEEnum, EdgeType.BACKWARD_EDGE);
      addEEnumLiteral(edgeTypeEEnum, EdgeType.FORWARD_EDGE);
      addEEnumLiteral(edgeTypeEEnum, EdgeType.CROSS_EDGE);

      // Create resource
      createResource(eNS_URI);
   }

} //DfsPackageImpl
