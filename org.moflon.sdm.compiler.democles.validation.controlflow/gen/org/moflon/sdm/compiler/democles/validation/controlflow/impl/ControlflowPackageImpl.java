/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow.impl;

import SDMLanguage.SDMLanguagePackage;

import SDMLanguage.activities.ActivitiesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gervarro.democles.specification.emf.SpecificationPackage;

import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage;

import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintPackage;

import org.moflon.core.dfs.DfsPackage;

import org.moflon.sdm.compiler.democles.validation.controlflow.ControlFlowBuilder;
import org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowFactory;
import org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage;
import org.moflon.sdm.compiler.democles.validation.controlflow.CrossEdgeAnalyzer;
import org.moflon.sdm.compiler.democles.validation.controlflow.DefaultComponentProcessor;
import org.moflon.sdm.compiler.democles.validation.controlflow.Errors;
import org.moflon.sdm.compiler.democles.validation.controlflow.ForEachComponentProcessor;
import org.moflon.sdm.compiler.democles.validation.controlflow.IdentifierAllocator;
import org.moflon.sdm.compiler.democles.validation.controlflow.InefficientBootstrappingBuilder;
import org.moflon.sdm.compiler.democles.validation.controlflow.JoinNodeFinder;
import org.moflon.sdm.compiler.democles.validation.controlflow.MoflonOperation;
import org.moflon.sdm.compiler.democles.validation.controlflow.SDMActivityGraphBuilder;
import org.moflon.sdm.compiler.democles.validation.controlflow.SubTreeTester;
import org.moflon.sdm.compiler.democles.validation.controlflow.TreeEdgeBackwardNavigatorTerminal;
import org.moflon.sdm.compiler.democles.validation.controlflow.TreeEdgeNavigator;
import org.moflon.sdm.compiler.democles.validation.controlflow.ValidatingEdgeProcessor;
import org.moflon.sdm.compiler.democles.validation.controlflow.Validator;

import org.moflon.sdm.compiler.democles.validation.result.ResultPackage;

import org.moflon.sdm.runtime.democles.DemoclesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ControlflowPackageImpl extends EPackageImpl implements ControlflowPackage
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass validatorEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass sdmActivityGraphBuilderEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass crossEdgeAnalyzerEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass inefficientBootstrappingBuilderEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass subTreeTesterEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass treeEdgeBackwardNavigatorTerminalEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass forEachComponentProcessorEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass treeEdgeNavigatorEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass joinNodeFinderEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass moflonOperationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass defaultComponentProcessorEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass controlFlowBuilderEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass identifierAllocatorEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EClass validatingEdgeProcessorEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private EEnum errorsEEnum = null;

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
    * @see org.moflon.sdm.compiler.democles.validation.controlflow.ControlflowPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private ControlflowPackageImpl()
   {
      super(eNS_URI, ControlflowFactory.eINSTANCE);
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
    * <p>This method is used to initialize {@link ControlflowPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static ControlflowPackage init()
   {
      if (isInited)
         return (ControlflowPackage) EPackage.Registry.INSTANCE.getEPackage(ControlflowPackage.eNS_URI);

      // Obtain or create and register package
      ControlflowPackageImpl theControlflowPackage = (ControlflowPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ControlflowPackageImpl
            ? EPackage.Registry.INSTANCE.get(eNS_URI)
            : new ControlflowPackageImpl());

      isInited = true;

      // Initialize simple dependencies
      SpecificationPackage.eINSTANCE.eClass();
      EMFTypePackage.eINSTANCE.eClass();
      RelationalConstraintPackage.eINSTANCE.eClass();
      DemoclesPackage.eINSTANCE.eClass();
      ResultPackage.eINSTANCE.eClass();
      DfsPackage.eINSTANCE.eClass();
      SDMLanguagePackage.eINSTANCE.eClass();

      // Create package meta-data objects
      theControlflowPackage.createPackageContents();

      // Initialize created meta-data
      theControlflowPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theControlflowPackage.freeze();

      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(ControlflowPackage.eNS_URI, theControlflowPackage);
      return theControlflowPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getValidator()
   {
      return validatorEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getValidator_Builders()
   {
      return (EReference) validatorEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getValidator_Graph()
   {
      return (EReference) validatorEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getValidator_ValidationReport()
   {
      return (EReference) validatorEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getValidator_StopNodeInForEachComponentSeverity()
   {
      return (EAttribute) validatorEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getValidator__HasFatalErrors()
   {
      return validatorEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getValidator__LookupErrorMessage__Errors()
   {
      return validatorEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getValidator__SortIncomingEdges__Node()
   {
      return validatorEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getValidator__SyntacticCheckWithStartNodeLookup__Activity()
   {
      return validatorEClass.getEOperations().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getValidator__Validate__Activity()
   {
      return validatorEClass.getEOperations().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getValidator__Validate__Activity_SDMActivityGraphBuilder()
   {
      return validatorEClass.getEOperations().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getSDMActivityGraphBuilder()
   {
      return sdmActivityGraphBuilderEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSDMActivityGraphBuilder_Validator()
   {
      return (EReference) sdmActivityGraphBuilderEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSDMActivityGraphBuilder_Graph()
   {
      return (EReference) sdmActivityGraphBuilderEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getSDMActivityGraphBuilder__ExploreEdge__Edge()
   {
      return sdmActivityGraphBuilderEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getSDMActivityGraphBuilder__ExploreStartNode__StartNode()
   {
      return sdmActivityGraphBuilderEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getSDMActivityGraphBuilder__ExploreStatementNode__StatementNode()
   {
      return sdmActivityGraphBuilderEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getSDMActivityGraphBuilder__ExploreStopNode__StopNode()
   {
      return sdmActivityGraphBuilderEClass.getEOperations().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getSDMActivityGraphBuilder__ExploreStoryNode__StoryNode()
   {
      return sdmActivityGraphBuilderEClass.getEOperations().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getCrossEdgeAnalyzer()
   {
      return crossEdgeAnalyzerEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCrossEdgeAnalyzer_MiddleRoot()
   {
      return (EReference) crossEdgeAnalyzerEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getCrossEdgeAnalyzer_LowerTreeTester()
   {
      return (EReference) crossEdgeAnalyzerEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getCrossEdgeAnalyzer__DeleteEdge__Edge()
   {
      return crossEdgeAnalyzerEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getCrossEdgeAnalyzer__IsNodeInWrongComponent__Node_int_int()
   {
      return crossEdgeAnalyzerEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getCrossEdgeAnalyzer__ProcessNode__Node()
   {
      return crossEdgeAnalyzerEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getInefficientBootstrappingBuilder()
   {
      return inefficientBootstrappingBuilderEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getInefficientBootstrappingBuilder_Delegate()
   {
      return (EReference) inefficientBootstrappingBuilderEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getInefficientBootstrappingBuilder__ExploreStatementNode__StatementNode()
   {
      return inefficientBootstrappingBuilderEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getInefficientBootstrappingBuilder__ExploreStopNode__StopNode()
   {
      return inefficientBootstrappingBuilderEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getInefficientBootstrappingBuilder__ExploreStoryNode__StoryNode()
   {
      return inefficientBootstrappingBuilderEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getSubTreeTester()
   {
      return subTreeTesterEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getSubTreeTester_Root()
   {
      return (EReference) subTreeTesterEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getSubTreeTester_IncludeRoot()
   {
      return (EAttribute) subTreeTesterEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getSubTreeTester__IsInSubTree__Node()
   {
      return subTreeTesterEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getTreeEdgeBackwardNavigatorTerminal()
   {
      return treeEdgeBackwardNavigatorTerminalEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getTreeEdgeBackwardNavigatorTerminal__ProcessEdge__Edge()
   {
      return treeEdgeBackwardNavigatorTerminalEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getForEachComponentProcessor()
   {
      return forEachComponentProcessorEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getForEachComponentProcessor_ComponentStartingNode()
   {
      return (EReference) forEachComponentProcessorEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getForEachComponentProcessor_ForEachNode()
   {
      return (EReference) forEachComponentProcessorEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getForEachComponentProcessor__PostDelegateEdgeAnalysis__Edge_EObject()
   {
      return forEachComponentProcessorEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getForEachComponentProcessor__ProcessEdge__Edge()
   {
      return forEachComponentProcessorEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getTreeEdgeNavigator()
   {
      return treeEdgeNavigatorEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getTreeEdgeNavigator_TerminalNode()
   {
      return (EReference) treeEdgeNavigatorEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getTreeEdgeNavigator_Forward()
   {
      return (EAttribute) treeEdgeNavigatorEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getTreeEdgeNavigator__ProcessEdge__Edge()
   {
      return treeEdgeNavigatorEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getTreeEdgeNavigator__ProcessNode__Node()
   {
      return treeEdgeNavigatorEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getJoinNodeFinder()
   {
      return joinNodeFinderEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getJoinNodeFinder_BranchRoot()
   {
      return (EReference) joinNodeFinderEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getJoinNodeFinder_JoinNodes()
   {
      return (EReference) joinNodeFinderEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getJoinNodeFinder__LeadsToJoinNode__Edge()
   {
      return joinNodeFinderEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getJoinNodeFinder__ProcessNode__Node()
   {
      return joinNodeFinderEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getMoflonOperation()
   {
      return moflonOperationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getMoflonOperation_RootScope()
   {
      return (EReference) moflonOperationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getMoflonOperation_Activity()
   {
      return (EReference) moflonOperationEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getDefaultComponentProcessor()
   {
      return defaultComponentProcessorEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getDefaultComponentProcessor_Builder()
   {
      return (EReference) defaultComponentProcessorEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getDefaultComponentProcessor__ExploreTargetNode__Edge()
   {
      return defaultComponentProcessorEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getDefaultComponentProcessor__ProcessEdge__Edge()
   {
      return defaultComponentProcessorEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getControlFlowBuilder()
   {
      return controlFlowBuilderEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getControlFlowBuilder_Validator()
   {
      return (EReference) controlFlowBuilderEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getControlFlowBuilder__FindLargestBackwardEdgeInterval__Node_Node()
   {
      return controlFlowBuilderEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getControlFlowBuilder__HandleForEachNode__Scope_Node_StoryNode()
   {
      return controlFlowBuilderEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getControlFlowBuilder__HandleHeadControlledLoop__Scope_Node_Edge()
   {
      return controlFlowBuilderEClass.getEOperations().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getControlFlowBuilder__HandleSimpleNode__Scope_Node_Edge()
   {
      return controlFlowBuilderEClass.getEOperations().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getControlFlowBuilder__HandleStumpedEdge__Scope_Edge_CFNode()
   {
      return controlFlowBuilderEClass.getEOperations().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getControlFlowBuilder__HandleTailControlledLoop__Scope_Node_Edge()
   {
      return controlFlowBuilderEClass.getEOperations().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getControlFlowBuilder__HandleUniqueJoinNode__Node_Node_Node()
   {
      return controlFlowBuilderEClass.getEOperations().get(6);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getControlFlowBuilder__IsHeadControlledLoopBranch__Edge()
   {
      return controlFlowBuilderEClass.getEOperations().get(7);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getControlFlowBuilder__IsLoopBranch__Edge()
   {
      return controlFlowBuilderEClass.getEOperations().get(8);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getControlFlowBuilder__Lookahead__Scope_Node()
   {
      return controlFlowBuilderEClass.getEOperations().get(9);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getControlFlowBuilder__LookaheadAndConnect__Scope_Node_CFNode()
   {
      return controlFlowBuilderEClass.getEOperations().get(10);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getControlFlowBuilder__ProcessNode__Scope_Node()
   {
      return controlFlowBuilderEClass.getEOperations().get(11);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getControlFlowBuilder__TraverseThenAndElseBranches__IfStatement_Edge_Edge_Scope_Scope()
   {
      return controlFlowBuilderEClass.getEOperations().get(12);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getIdentifierAllocator()
   {
      return identifierAllocatorEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getIdentifierAllocator_Id()
   {
      return (EAttribute) identifierAllocatorEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getIdentifierAllocator__IncrementIdentifier()
   {
      return identifierAllocatorEClass.getEOperations().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EOperation getIdentifierAllocator__VisitNode__CFNode()
   {
      return identifierAllocatorEClass.getEOperations().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EClass getValidatingEdgeProcessor()
   {
      return validatingEdgeProcessorEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EReference getValidatingEdgeProcessor_Validator()
   {
      return (EReference) validatingEdgeProcessorEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EEnum getErrors()
   {
      return errorsEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ControlflowFactory getControlflowFactory()
   {
      return (ControlflowFactory) getEFactoryInstance();
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
      validatorEClass = createEClass(VALIDATOR);
      createEReference(validatorEClass, VALIDATOR__BUILDERS);
      createEReference(validatorEClass, VALIDATOR__GRAPH);
      createEReference(validatorEClass, VALIDATOR__VALIDATION_REPORT);
      createEAttribute(validatorEClass, VALIDATOR__STOP_NODE_IN_FOR_EACH_COMPONENT_SEVERITY);
      createEOperation(validatorEClass, VALIDATOR___HAS_FATAL_ERRORS);
      createEOperation(validatorEClass, VALIDATOR___LOOKUP_ERROR_MESSAGE__ERRORS);
      createEOperation(validatorEClass, VALIDATOR___SORT_INCOMING_EDGES__NODE);
      createEOperation(validatorEClass, VALIDATOR___SYNTACTIC_CHECK_WITH_START_NODE_LOOKUP__ACTIVITY);
      createEOperation(validatorEClass, VALIDATOR___VALIDATE__ACTIVITY);
      createEOperation(validatorEClass, VALIDATOR___VALIDATE__ACTIVITY_SDMACTIVITYGRAPHBUILDER);

      sdmActivityGraphBuilderEClass = createEClass(SDM_ACTIVITY_GRAPH_BUILDER);
      createEReference(sdmActivityGraphBuilderEClass, SDM_ACTIVITY_GRAPH_BUILDER__VALIDATOR);
      createEReference(sdmActivityGraphBuilderEClass, SDM_ACTIVITY_GRAPH_BUILDER__GRAPH);
      createEOperation(sdmActivityGraphBuilderEClass, SDM_ACTIVITY_GRAPH_BUILDER___EXPLORE_EDGE__EDGE);
      createEOperation(sdmActivityGraphBuilderEClass, SDM_ACTIVITY_GRAPH_BUILDER___EXPLORE_START_NODE__STARTNODE);
      createEOperation(sdmActivityGraphBuilderEClass, SDM_ACTIVITY_GRAPH_BUILDER___EXPLORE_STATEMENT_NODE__STATEMENTNODE);
      createEOperation(sdmActivityGraphBuilderEClass, SDM_ACTIVITY_GRAPH_BUILDER___EXPLORE_STOP_NODE__STOPNODE);
      createEOperation(sdmActivityGraphBuilderEClass, SDM_ACTIVITY_GRAPH_BUILDER___EXPLORE_STORY_NODE__STORYNODE);

      crossEdgeAnalyzerEClass = createEClass(CROSS_EDGE_ANALYZER);
      createEReference(crossEdgeAnalyzerEClass, CROSS_EDGE_ANALYZER__MIDDLE_ROOT);
      createEReference(crossEdgeAnalyzerEClass, CROSS_EDGE_ANALYZER__LOWER_TREE_TESTER);
      createEOperation(crossEdgeAnalyzerEClass, CROSS_EDGE_ANALYZER___DELETE_EDGE__EDGE);
      createEOperation(crossEdgeAnalyzerEClass, CROSS_EDGE_ANALYZER___IS_NODE_IN_WRONG_COMPONENT__NODE_INT_INT);
      createEOperation(crossEdgeAnalyzerEClass, CROSS_EDGE_ANALYZER___PROCESS_NODE__NODE);

      inefficientBootstrappingBuilderEClass = createEClass(INEFFICIENT_BOOTSTRAPPING_BUILDER);
      createEReference(inefficientBootstrappingBuilderEClass, INEFFICIENT_BOOTSTRAPPING_BUILDER__DELEGATE);
      createEOperation(inefficientBootstrappingBuilderEClass, INEFFICIENT_BOOTSTRAPPING_BUILDER___EXPLORE_STATEMENT_NODE__STATEMENTNODE);
      createEOperation(inefficientBootstrappingBuilderEClass, INEFFICIENT_BOOTSTRAPPING_BUILDER___EXPLORE_STOP_NODE__STOPNODE);
      createEOperation(inefficientBootstrappingBuilderEClass, INEFFICIENT_BOOTSTRAPPING_BUILDER___EXPLORE_STORY_NODE__STORYNODE);

      subTreeTesterEClass = createEClass(SUB_TREE_TESTER);
      createEReference(subTreeTesterEClass, SUB_TREE_TESTER__ROOT);
      createEAttribute(subTreeTesterEClass, SUB_TREE_TESTER__INCLUDE_ROOT);
      createEOperation(subTreeTesterEClass, SUB_TREE_TESTER___IS_IN_SUB_TREE__NODE);

      treeEdgeBackwardNavigatorTerminalEClass = createEClass(TREE_EDGE_BACKWARD_NAVIGATOR_TERMINAL);
      createEOperation(treeEdgeBackwardNavigatorTerminalEClass, TREE_EDGE_BACKWARD_NAVIGATOR_TERMINAL___PROCESS_EDGE__EDGE);

      forEachComponentProcessorEClass = createEClass(FOR_EACH_COMPONENT_PROCESSOR);
      createEReference(forEachComponentProcessorEClass, FOR_EACH_COMPONENT_PROCESSOR__COMPONENT_STARTING_NODE);
      createEReference(forEachComponentProcessorEClass, FOR_EACH_COMPONENT_PROCESSOR__FOR_EACH_NODE);
      createEOperation(forEachComponentProcessorEClass, FOR_EACH_COMPONENT_PROCESSOR___POST_DELEGATE_EDGE_ANALYSIS__EDGE_EOBJECT);
      createEOperation(forEachComponentProcessorEClass, FOR_EACH_COMPONENT_PROCESSOR___PROCESS_EDGE__EDGE);

      treeEdgeNavigatorEClass = createEClass(TREE_EDGE_NAVIGATOR);
      createEReference(treeEdgeNavigatorEClass, TREE_EDGE_NAVIGATOR__TERMINAL_NODE);
      createEAttribute(treeEdgeNavigatorEClass, TREE_EDGE_NAVIGATOR__FORWARD);
      createEOperation(treeEdgeNavigatorEClass, TREE_EDGE_NAVIGATOR___PROCESS_EDGE__EDGE);
      createEOperation(treeEdgeNavigatorEClass, TREE_EDGE_NAVIGATOR___PROCESS_NODE__NODE);

      joinNodeFinderEClass = createEClass(JOIN_NODE_FINDER);
      createEReference(joinNodeFinderEClass, JOIN_NODE_FINDER__BRANCH_ROOT);
      createEReference(joinNodeFinderEClass, JOIN_NODE_FINDER__JOIN_NODES);
      createEOperation(joinNodeFinderEClass, JOIN_NODE_FINDER___LEADS_TO_JOIN_NODE__EDGE);
      createEOperation(joinNodeFinderEClass, JOIN_NODE_FINDER___PROCESS_NODE__NODE);

      moflonOperationEClass = createEClass(MOFLON_OPERATION);
      createEReference(moflonOperationEClass, MOFLON_OPERATION__ROOT_SCOPE);
      createEReference(moflonOperationEClass, MOFLON_OPERATION__ACTIVITY);

      defaultComponentProcessorEClass = createEClass(DEFAULT_COMPONENT_PROCESSOR);
      createEReference(defaultComponentProcessorEClass, DEFAULT_COMPONENT_PROCESSOR__BUILDER);
      createEOperation(defaultComponentProcessorEClass, DEFAULT_COMPONENT_PROCESSOR___EXPLORE_TARGET_NODE__EDGE);
      createEOperation(defaultComponentProcessorEClass, DEFAULT_COMPONENT_PROCESSOR___PROCESS_EDGE__EDGE);

      controlFlowBuilderEClass = createEClass(CONTROL_FLOW_BUILDER);
      createEReference(controlFlowBuilderEClass, CONTROL_FLOW_BUILDER__VALIDATOR);
      createEOperation(controlFlowBuilderEClass, CONTROL_FLOW_BUILDER___FIND_LARGEST_BACKWARD_EDGE_INTERVAL__NODE_NODE);
      createEOperation(controlFlowBuilderEClass, CONTROL_FLOW_BUILDER___HANDLE_FOR_EACH_NODE__SCOPE_NODE_STORYNODE);
      createEOperation(controlFlowBuilderEClass, CONTROL_FLOW_BUILDER___HANDLE_HEAD_CONTROLLED_LOOP__SCOPE_NODE_EDGE);
      createEOperation(controlFlowBuilderEClass, CONTROL_FLOW_BUILDER___HANDLE_SIMPLE_NODE__SCOPE_NODE_EDGE);
      createEOperation(controlFlowBuilderEClass, CONTROL_FLOW_BUILDER___HANDLE_STUMPED_EDGE__SCOPE_EDGE_CFNODE);
      createEOperation(controlFlowBuilderEClass, CONTROL_FLOW_BUILDER___HANDLE_TAIL_CONTROLLED_LOOP__SCOPE_NODE_EDGE);
      createEOperation(controlFlowBuilderEClass, CONTROL_FLOW_BUILDER___HANDLE_UNIQUE_JOIN_NODE__NODE_NODE_NODE);
      createEOperation(controlFlowBuilderEClass, CONTROL_FLOW_BUILDER___IS_HEAD_CONTROLLED_LOOP_BRANCH__EDGE);
      createEOperation(controlFlowBuilderEClass, CONTROL_FLOW_BUILDER___IS_LOOP_BRANCH__EDGE);
      createEOperation(controlFlowBuilderEClass, CONTROL_FLOW_BUILDER___LOOKAHEAD__SCOPE_NODE);
      createEOperation(controlFlowBuilderEClass, CONTROL_FLOW_BUILDER___LOOKAHEAD_AND_CONNECT__SCOPE_NODE_CFNODE);
      createEOperation(controlFlowBuilderEClass, CONTROL_FLOW_BUILDER___PROCESS_NODE__SCOPE_NODE);
      createEOperation(controlFlowBuilderEClass, CONTROL_FLOW_BUILDER___TRAVERSE_THEN_AND_ELSE_BRANCHES__IFSTATEMENT_EDGE_EDGE_SCOPE_SCOPE);

      identifierAllocatorEClass = createEClass(IDENTIFIER_ALLOCATOR);
      createEAttribute(identifierAllocatorEClass, IDENTIFIER_ALLOCATOR__ID);
      createEOperation(identifierAllocatorEClass, IDENTIFIER_ALLOCATOR___INCREMENT_IDENTIFIER);
      createEOperation(identifierAllocatorEClass, IDENTIFIER_ALLOCATOR___VISIT_NODE__CFNODE);

      validatingEdgeProcessorEClass = createEClass(VALIDATING_EDGE_PROCESSOR);
      createEReference(validatingEdgeProcessorEClass, VALIDATING_EDGE_PROCESSOR__VALIDATOR);

      // Create enums
      errorsEEnum = createEEnum(ERRORS);
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

      // Obtain other dependent packages
      DfsPackage theDfsPackage = (DfsPackage) EPackage.Registry.INSTANCE.getEPackage(DfsPackage.eNS_URI);
      ResultPackage theResultPackage = (ResultPackage) EPackage.Registry.INSTANCE.getEPackage(ResultPackage.eNS_URI);
      ActivitiesPackage theActivitiesPackage = (ActivitiesPackage) EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI);
      DemoclesPackage theDemoclesPackage = (DemoclesPackage) EPackage.Registry.INSTANCE.getEPackage(DemoclesPackage.eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      crossEdgeAnalyzerEClass.getESuperTypes().add(this.getValidatingEdgeProcessor());
      inefficientBootstrappingBuilderEClass.getESuperTypes().add(this.getSDMActivityGraphBuilder());
      treeEdgeBackwardNavigatorTerminalEClass.getESuperTypes().add(this.getValidatingEdgeProcessor());
      forEachComponentProcessorEClass.getESuperTypes().add(this.getValidatingEdgeProcessor());
      treeEdgeNavigatorEClass.getESuperTypes().add(this.getValidatingEdgeProcessor());
      joinNodeFinderEClass.getESuperTypes().add(this.getValidatingEdgeProcessor());
      moflonOperationEClass.getESuperTypes().add(ecorePackage.getEOperation());
      defaultComponentProcessorEClass.getESuperTypes().add(this.getValidatingEdgeProcessor());
      identifierAllocatorEClass.getESuperTypes().add(theDemoclesPackage.getUniformNoOperationVisitor());
      validatingEdgeProcessorEClass.getESuperTypes().add(theDfsPackage.getEdgeProcessor());

      // Initialize classes, features, and operations; add parameters
      initEClass(validatorEClass, Validator.class, "Validator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getValidator_Builders(), this.getSDMActivityGraphBuilder(), this.getSDMActivityGraphBuilder_Validator(), "builders", null, 0, -1,
            Validator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getValidator_Graph(), theDfsPackage.getDFSGraph(), null, "graph", null, 1, 1, Validator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getValidator_ValidationReport(), theResultPackage.getValidationReport(), null, "validationReport", null, 0, 1, Validator.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getValidator_StopNodeInForEachComponentSeverity(), theResultPackage.getSeverity(), "stopNodeInForEachComponentSeverity", null, 1, 1,
            Validator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEOperation(getValidator__HasFatalErrors(), ecorePackage.getEBoolean(), "hasFatalErrors", 0, 1, IS_UNIQUE, IS_ORDERED);

      EOperation op = initEOperation(getValidator__LookupErrorMessage__Errors(), ecorePackage.getEString(), "lookupErrorMessage", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getErrors(), "errorID", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getValidator__SortIncomingEdges__Node(), null, "sortIncomingEdges", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getValidator__SyntacticCheckWithStartNodeLookup__Activity(), theActivitiesPackage.getStartNode(), "syntacticCheckWithStartNodeLookup",
            0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theActivitiesPackage.getActivity(), "activity", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getValidator__Validate__Activity(), theResultPackage.getValidationReport(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theActivitiesPackage.getActivity(), "activity", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getValidator__Validate__Activity_SDMActivityGraphBuilder(), theResultPackage.getValidationReport(), "validate", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, theActivitiesPackage.getActivity(), "activity", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getSDMActivityGraphBuilder(), "builder", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(sdmActivityGraphBuilderEClass, SDMActivityGraphBuilder.class, "SDMActivityGraphBuilder", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
      initEReference(getSDMActivityGraphBuilder_Validator(), this.getValidator(), this.getValidator_Builders(), "validator", null, 0, 1,
            SDMActivityGraphBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
      initEReference(getSDMActivityGraphBuilder_Graph(), theDfsPackage.getDFSGraph(), null, "graph", null, 1, 1, SDMActivityGraphBuilder.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      op = initEOperation(getSDMActivityGraphBuilder__ExploreEdge__Edge(), theDfsPackage.getNode(), "exploreEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getEdge(), "edge", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getSDMActivityGraphBuilder__ExploreStartNode__StartNode(), theDfsPackage.getNode(), "exploreStartNode", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theActivitiesPackage.getStartNode(), "startNode", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getSDMActivityGraphBuilder__ExploreStatementNode__StatementNode(), theDfsPackage.getNode(), "exploreStatementNode", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, theActivitiesPackage.getStatementNode(), "statementNode", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getSDMActivityGraphBuilder__ExploreStopNode__StopNode(), theDfsPackage.getNode(), "exploreStopNode", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theActivitiesPackage.getStopNode(), "stopNode", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getSDMActivityGraphBuilder__ExploreStoryNode__StoryNode(), theDfsPackage.getNode(), "exploreStoryNode", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theActivitiesPackage.getStoryNode(), "storyNode", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(crossEdgeAnalyzerEClass, CrossEdgeAnalyzer.class, "CrossEdgeAnalyzer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getCrossEdgeAnalyzer_MiddleRoot(), theDfsPackage.getNode(), null, "middleRoot", null, 1, 1, CrossEdgeAnalyzer.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getCrossEdgeAnalyzer_LowerTreeTester(), this.getSubTreeTester(), null, "lowerTreeTester", null, 0, 1, CrossEdgeAnalyzer.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      op = initEOperation(getCrossEdgeAnalyzer__DeleteEdge__Edge(), null, "deleteEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getEdge(), "edge", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getCrossEdgeAnalyzer__IsNodeInWrongComponent__Node_int_int(), ecorePackage.getEBoolean(), "isNodeInWrongComponent", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, theDfsPackage.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEInt(), "dynamicPreTraversal", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEInt(), "dynamicPostTraversal", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getCrossEdgeAnalyzer__ProcessNode__Node(), ecorePackage.getEObject(), "processNode", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(inefficientBootstrappingBuilderEClass, InefficientBootstrappingBuilder.class, "InefficientBootstrappingBuilder", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
      initEReference(getInefficientBootstrappingBuilder_Delegate(), this.getSDMActivityGraphBuilder(), null, "delegate", null, 1, 1,
            InefficientBootstrappingBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);

      op = initEOperation(getInefficientBootstrappingBuilder__ExploreStatementNode__StatementNode(), theDfsPackage.getNode(), "exploreStatementNode", 0, 1,
            IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theActivitiesPackage.getStatementNode(), "statementNode", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getInefficientBootstrappingBuilder__ExploreStopNode__StopNode(), theDfsPackage.getNode(), "exploreStopNode", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, theActivitiesPackage.getStopNode(), "stopNode", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getInefficientBootstrappingBuilder__ExploreStoryNode__StoryNode(), theDfsPackage.getNode(), "exploreStoryNode", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, theActivitiesPackage.getStoryNode(), "storyNode", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(subTreeTesterEClass, SubTreeTester.class, "SubTreeTester", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getSubTreeTester_Root(), theDfsPackage.getNode(), null, "root", null, 1, 1, SubTreeTester.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getSubTreeTester_IncludeRoot(), ecorePackage.getEBoolean(), "includeRoot", null, 1, 1, SubTreeTester.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = initEOperation(getSubTreeTester__IsInSubTree__Node(), ecorePackage.getEBoolean(), "isInSubTree", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(treeEdgeBackwardNavigatorTerminalEClass, TreeEdgeBackwardNavigatorTerminal.class, "TreeEdgeBackwardNavigatorTerminal", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      op = initEOperation(getTreeEdgeBackwardNavigatorTerminal__ProcessEdge__Edge(), ecorePackage.getEObject(), "processEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getEdge(), "edge", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(forEachComponentProcessorEClass, ForEachComponentProcessor.class, "ForEachComponentProcessor", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
      initEReference(getForEachComponentProcessor_ComponentStartingNode(), theDfsPackage.getNode(), null, "componentStartingNode", null, 1, 1,
            ForEachComponentProcessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
      initEReference(getForEachComponentProcessor_ForEachNode(), theDfsPackage.getNode(), null, "forEachNode", null, 1, 1, ForEachComponentProcessor.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      op = initEOperation(getForEachComponentProcessor__PostDelegateEdgeAnalysis__Edge_EObject(), ecorePackage.getEObject(), "postDelegateEdgeAnalysis", 0, 1,
            IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getEdge(), "edge", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEObject(), "delegationResult", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getForEachComponentProcessor__ProcessEdge__Edge(), ecorePackage.getEObject(), "processEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getEdge(), "edge", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(treeEdgeNavigatorEClass, TreeEdgeNavigator.class, "TreeEdgeNavigator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getTreeEdgeNavigator_TerminalNode(), theDfsPackage.getNode(), null, "terminalNode", null, 0, 1, TreeEdgeNavigator.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getTreeEdgeNavigator_Forward(), ecorePackage.getEBoolean(), "forward", null, 1, 1, TreeEdgeNavigator.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      op = initEOperation(getTreeEdgeNavigator__ProcessEdge__Edge(), ecorePackage.getEObject(), "processEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getEdge(), "edge", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getTreeEdgeNavigator__ProcessNode__Node(), ecorePackage.getEObject(), "processNode", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(joinNodeFinderEClass, JoinNodeFinder.class, "JoinNodeFinder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getJoinNodeFinder_BranchRoot(), theDfsPackage.getNode(), null, "branchRoot", null, 1, 1, JoinNodeFinder.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getJoinNodeFinder_JoinNodes(), theDfsPackage.getNode(), null, "joinNodes", null, 0, -1, JoinNodeFinder.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      op = initEOperation(getJoinNodeFinder__LeadsToJoinNode__Edge(), ecorePackage.getEBoolean(), "leadsToJoinNode", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getEdge(), "edge", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getJoinNodeFinder__ProcessNode__Node(), ecorePackage.getEObject(), "processNode", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(moflonOperationEClass, MoflonOperation.class, "MoflonOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getMoflonOperation_RootScope(), theDemoclesPackage.getScope(), null, "rootScope", null, 0, 1, MoflonOperation.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getMoflonOperation_Activity(), theActivitiesPackage.getActivity(), null, "activity", null, 0, 1, MoflonOperation.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(defaultComponentProcessorEClass, DefaultComponentProcessor.class, "DefaultComponentProcessor", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
      initEReference(getDefaultComponentProcessor_Builder(), this.getSDMActivityGraphBuilder(), null, "builder", null, 1, 1, DefaultComponentProcessor.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      op = initEOperation(getDefaultComponentProcessor__ExploreTargetNode__Edge(), theDfsPackage.getNode(), "exploreTargetNode", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getEdge(), "edge", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getDefaultComponentProcessor__ProcessEdge__Edge(), ecorePackage.getEObject(), "processEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getEdge(), "edge", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(controlFlowBuilderEClass, ControlFlowBuilder.class, "ControlFlowBuilder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getControlFlowBuilder_Validator(), this.getValidator(), null, "validator", null, 1, 1, ControlFlowBuilder.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      op = initEOperation(getControlFlowBuilder__FindLargestBackwardEdgeInterval__Node_Node(), theDfsPackage.getEdge(), "findLargestBackwardEdgeInterval", 0, 1,
            IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getNode(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getControlFlowBuilder__HandleForEachNode__Scope_Node_StoryNode(), theResultPackage.getValidationReport(), "handleForEachNode", 0, 1,
            IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getScope(), "scope", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theActivitiesPackage.getStoryNode(), "actForEachNode", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getControlFlowBuilder__HandleHeadControlledLoop__Scope_Node_Edge(), theResultPackage.getValidationReport(),
            "handleHeadControlledLoop", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getScope(), "scope", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getEdge(), "headLoopEdge", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getControlFlowBuilder__HandleSimpleNode__Scope_Node_Edge(), theResultPackage.getValidationReport(), "handleSimpleNode", 0, 1,
            IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getScope(), "scope", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getEdge(), "outgoingEdge", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getControlFlowBuilder__HandleStumpedEdge__Scope_Edge_CFNode(), theResultPackage.getValidationReport(), "handleStumpedEdge", 0, 1,
            IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getScope(), "scope", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getEdge(), "stumpedEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFNode(), "sourceControlFlowNode", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getControlFlowBuilder__HandleTailControlledLoop__Scope_Node_Edge(), theResultPackage.getValidationReport(),
            "handleTailControlledLoop", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getScope(), "scope", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getEdge(), "tailLoopEdge", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getControlFlowBuilder__HandleUniqueJoinNode__Node_Node_Node(), null, "handleUniqueJoinNode", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getNode(), "joinNode", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getNode(), "smallerRoot", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getNode(), "largerRoot", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getControlFlowBuilder__IsHeadControlledLoopBranch__Edge(), ecorePackage.getEBoolean(), "isHeadControlledLoopBranch", 0, 1, IS_UNIQUE,
            IS_ORDERED);
      addEParameter(op, theDfsPackage.getEdge(), "edge", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getControlFlowBuilder__IsLoopBranch__Edge(), ecorePackage.getEBoolean(), "isLoopBranch", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getEdge(), "edge", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getControlFlowBuilder__Lookahead__Scope_Node(), null, "lookahead", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getScope(), "scope", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getControlFlowBuilder__LookaheadAndConnect__Scope_Node_CFNode(), null, "lookaheadAndConnect", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getScope(), "scope", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFNode(), "currentCFNode", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getControlFlowBuilder__ProcessNode__Scope_Node(), theResultPackage.getValidationReport(), "processNode", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getScope(), "scope", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getControlFlowBuilder__TraverseThenAndElseBranches__IfStatement_Edge_Edge_Scope_Scope(), null, "traverseThenAndElseBranches", 0, 1,
            IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getIfStatement(), "ifStatement", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getEdge(), "firstOutgoingEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDfsPackage.getEdge(), "secondOutgoingEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getScope(), "successScope", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getScope(), "failureScope", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(identifierAllocatorEClass, IdentifierAllocator.class, "IdentifierAllocator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getIdentifierAllocator_Id(), ecorePackage.getEInt(), "id", null, 1, 1, IdentifierAllocator.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

      initEOperation(getIdentifierAllocator__IncrementIdentifier(), ecorePackage.getEInt(), "incrementIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = initEOperation(getIdentifierAllocator__VisitNode__CFNode(), null, "visitNode", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, theDemoclesPackage.getCFNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(validatingEdgeProcessorEClass, ValidatingEdgeProcessor.class, "ValidatingEdgeProcessor", IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
      initEReference(getValidatingEdgeProcessor_Validator(), this.getValidator(), null, "validator", null, 0, 1, ValidatingEdgeProcessor.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      // Initialize enums and add enum literals
      initEEnum(errorsEEnum, Errors.class, "Errors");
      addEEnumLiteral(errorsEEnum, Errors.LOOP_CROSSING_EDGE);
      addEEnumLiteral(errorsEEnum, Errors.EXACTLY_ONE_START_NODE);
      addEEnumLiteral(errorsEEnum, Errors.AT_LEAST_ONE_STOP_NODE);
      addEEnumLiteral(errorsEEnum, Errors.NO_OUTGOING_EDGE_FROM_STOP_NODE);
      addEEnumLiteral(errorsEEnum, Errors.ACTIVITY_EDGE_END_NODES_IN_SAME_ACTIVITY);
      addEEnumLiteral(errorsEEnum, Errors.FOR_EACH_EDGE_FORWARD);
      addEEnumLiteral(errorsEEnum, Errors.ONE_EDGE_BACK_FROM_FOREACH_COMPONENT);
      addEEnumLiteral(errorsEEnum, Errors.NO_EDGE_OUT_OF_FOREACH_COMPONENT);
      addEEnumLiteral(errorsEEnum, Errors.NO_STOP_NODE_IN_FOREACH_COMPONENT);
      addEEnumLiteral(errorsEEnum, Errors.NODE_HAS_TO_HAVE_OUTGOING_EDGE);
      addEEnumLiteral(errorsEEnum, Errors.MAX_TWO_OUTGOING_EDGES);
      addEEnumLiteral(errorsEEnum, Errors.NO_INCOMING_EDGE_INTO_START_NODE);
      addEEnumLiteral(errorsEEnum, Errors.ONE_OUTGOING_EDGE_FROM_START_NODE);
      addEEnumLiteral(errorsEEnum, Errors.ONLY_ONE_EACH_TIME_EDGE);
      addEEnumLiteral(errorsEEnum, Errors.FOR_EACH_FALSE_OUTGOING_EDGE);
      addEEnumLiteral(errorsEEnum, Errors.FOR_EACH_NODE_HAS_EXACTLY_ONE_END_EDGE);
      addEEnumLiteral(errorsEEnum, Errors.INVALID_OUTGOING_EDGES);
      addEEnumLiteral(errorsEEnum, Errors.EMBEDDED_LOOP_FOUND);
      addEEnumLiteral(errorsEEnum, Errors.HEAD_LOOP_EXT_BWD_EDGE);
      addEEnumLiteral(errorsEEnum, Errors.SECOND_OUT_EDGE_INVALID);
      addEEnumLiteral(errorsEEnum, Errors.IFTHEN_ONLY_ONE_JOIN_NODE);
      addEEnumLiteral(errorsEEnum, Errors.BOTH_BRANCHES_HEAD_CONTROLLED);
      addEEnumLiteral(errorsEEnum, Errors.BOTH_BRANCHES_TAIL_CONTROLLED);
      addEEnumLiteral(errorsEEnum, Errors.FOREACH_END_EDGE_ERROR);
      addEEnumLiteral(errorsEEnum, Errors.EDGE_TARGET_UNKNOWN_TYPE);
      addEEnumLiteral(errorsEEnum, Errors.LOOP_EXTERN_EDGE);
      addEEnumLiteral(errorsEEnum, Errors.THEN_ELSE_BRANCH_INVALID_LOOP_CONTAINMENT);

      // Create resource
      createResource(eNS_URI);
   }

} //ControlflowPackageImpl
