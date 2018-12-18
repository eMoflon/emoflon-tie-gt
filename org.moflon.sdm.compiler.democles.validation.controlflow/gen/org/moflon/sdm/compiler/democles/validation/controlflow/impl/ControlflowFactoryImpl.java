/**
 */
package org.moflon.sdm.compiler.democles.validation.controlflow.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.moflon.sdm.compiler.democles.validation.controlflow.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ControlflowFactoryImpl extends EFactoryImpl implements ControlflowFactory
{
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static ControlflowFactory init()
   {
      try
      {
         ControlflowFactory theControlflowFactory = (ControlflowFactory) EPackage.Registry.INSTANCE.getEFactory(ControlflowPackage.eNS_URI);
         if (theControlflowFactory != null)
         {
            return theControlflowFactory;
         }
      } catch (Exception exception)
      {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new ControlflowFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ControlflowFactoryImpl()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EObject create(EClass eClass)
   {
      switch (eClass.getClassifierID())
      {
      case ControlflowPackage.VALIDATOR:
         return createValidator();
      case ControlflowPackage.SDM_ACTIVITY_GRAPH_BUILDER:
         return createSDMActivityGraphBuilder();
      case ControlflowPackage.CROSS_EDGE_ANALYZER:
         return createCrossEdgeAnalyzer();
      case ControlflowPackage.INEFFICIENT_BOOTSTRAPPING_BUILDER:
         return createInefficientBootstrappingBuilder();
      case ControlflowPackage.SUB_TREE_TESTER:
         return createSubTreeTester();
      case ControlflowPackage.TREE_EDGE_BACKWARD_NAVIGATOR_TERMINAL:
         return createTreeEdgeBackwardNavigatorTerminal();
      case ControlflowPackage.FOR_EACH_COMPONENT_PROCESSOR:
         return createForEachComponentProcessor();
      case ControlflowPackage.TREE_EDGE_NAVIGATOR:
         return createTreeEdgeNavigator();
      case ControlflowPackage.JOIN_NODE_FINDER:
         return createJoinNodeFinder();
      case ControlflowPackage.MOFLON_OPERATION:
         return createMoflonOperation();
      case ControlflowPackage.DEFAULT_COMPONENT_PROCESSOR:
         return createDefaultComponentProcessor();
      case ControlflowPackage.CONTROL_FLOW_BUILDER:
         return createControlFlowBuilder();
      case ControlflowPackage.IDENTIFIER_ALLOCATOR:
         return createIdentifierAllocator();
      default:
         throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object createFromString(EDataType eDataType, String initialValue)
   {
      switch (eDataType.getClassifierID())
      {
      case ControlflowPackage.ERRORS:
         return createErrorsFromString(eDataType, initialValue);
      default:
         throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String convertToString(EDataType eDataType, Object instanceValue)
   {
      switch (eDataType.getClassifierID())
      {
      case ControlflowPackage.ERRORS:
         return convertErrorsToString(eDataType, instanceValue);
      default:
         throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Validator createValidator()
   {
      ValidatorImpl validator = new ValidatorImpl();
      return validator;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SDMActivityGraphBuilder createSDMActivityGraphBuilder()
   {
      SDMActivityGraphBuilderImpl sdmActivityGraphBuilder = new SDMActivityGraphBuilderImpl();
      return sdmActivityGraphBuilder;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CrossEdgeAnalyzer createCrossEdgeAnalyzer()
   {
      CrossEdgeAnalyzerImpl crossEdgeAnalyzer = new CrossEdgeAnalyzerImpl();
      return crossEdgeAnalyzer;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InefficientBootstrappingBuilder createInefficientBootstrappingBuilder()
   {
      InefficientBootstrappingBuilderImpl inefficientBootstrappingBuilder = new InefficientBootstrappingBuilderImpl();
      return inefficientBootstrappingBuilder;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SubTreeTester createSubTreeTester()
   {
      SubTreeTesterImpl subTreeTester = new SubTreeTesterImpl();
      return subTreeTester;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public TreeEdgeBackwardNavigatorTerminal createTreeEdgeBackwardNavigatorTerminal()
   {
      TreeEdgeBackwardNavigatorTerminalImpl treeEdgeBackwardNavigatorTerminal = new TreeEdgeBackwardNavigatorTerminalImpl();
      return treeEdgeBackwardNavigatorTerminal;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ForEachComponentProcessor createForEachComponentProcessor()
   {
      ForEachComponentProcessorImpl forEachComponentProcessor = new ForEachComponentProcessorImpl();
      return forEachComponentProcessor;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public TreeEdgeNavigator createTreeEdgeNavigator()
   {
      TreeEdgeNavigatorImpl treeEdgeNavigator = new TreeEdgeNavigatorImpl();
      return treeEdgeNavigator;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public JoinNodeFinder createJoinNodeFinder()
   {
      JoinNodeFinderImpl joinNodeFinder = new JoinNodeFinderImpl();
      return joinNodeFinder;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public MoflonOperation createMoflonOperation()
   {
      MoflonOperationImpl moflonOperation = new MoflonOperationImpl();
      return moflonOperation;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DefaultComponentProcessor createDefaultComponentProcessor()
   {
      DefaultComponentProcessorImpl defaultComponentProcessor = new DefaultComponentProcessorImpl();
      return defaultComponentProcessor;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ControlFlowBuilder createControlFlowBuilder()
   {
      ControlFlowBuilderImpl controlFlowBuilder = new ControlFlowBuilderImpl();
      return controlFlowBuilder;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public IdentifierAllocator createIdentifierAllocator()
   {
      IdentifierAllocatorImpl identifierAllocator = new IdentifierAllocatorImpl();
      return identifierAllocator;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Errors createErrorsFromString(EDataType eDataType, String initialValue)
   {
      Errors result = Errors.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String convertErrorsToString(EDataType eDataType, Object instanceValue)
   {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ControlflowPackage getControlflowPackage()
   {
      return (ControlflowPackage) getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static ControlflowPackage getPackage()
   {
      return ControlflowPackage.eINSTANCE;
   }

} //ControlflowFactoryImpl
