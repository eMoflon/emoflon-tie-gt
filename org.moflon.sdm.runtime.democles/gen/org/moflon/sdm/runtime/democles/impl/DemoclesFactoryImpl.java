/**
 */
package org.moflon.sdm.runtime.democles.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gervarro.democles.common.Adornment;

import org.moflon.sdm.runtime.democles.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DemoclesFactoryImpl extends EFactoryImpl implements DemoclesFactory
{
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static DemoclesFactory init()
   {
      try
      {
         DemoclesFactory theDemoclesFactory = (DemoclesFactory) EPackage.Registry.INSTANCE.getEFactory(DemoclesPackage.eNS_URI);
         if (theDemoclesFactory != null)
         {
            return theDemoclesFactory;
         }
      } catch (Exception exception)
      {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new DemoclesFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DemoclesFactoryImpl()
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
      case DemoclesPackage.CONTINUE_STATEMENT:
         return createContinueStatement();
      case DemoclesPackage.RETURN_STATEMENT:
         return createReturnStatement();
      case DemoclesPackage.HEAD_CONTROLLED_LOOP:
         return createHeadControlledLoop();
      case DemoclesPackage.TAIL_CONTROLLED_LOOP:
         return createTailControlledLoop();
      case DemoclesPackage.FOR_EACH:
         return createForEach();
      case DemoclesPackage.REGULAR_PATTERN_INVOCATION:
         return createRegularPatternInvocation();
      case DemoclesPackage.CF_VARIABLE:
         return createCFVariable();
      case DemoclesPackage.CF_NODE:
         return createCFNode();
      case DemoclesPackage.BINDING_PATTERN_INVOCATION:
         return createBindingPatternInvocation();
      case DemoclesPackage.SINGLE_RESULT_PATTERN_INVOCATION:
         return createSingleResultPatternInvocation();
      case DemoclesPackage.SCOPE:
         return createScope();
      case DemoclesPackage.ACTION:
         return createAction();
      case DemoclesPackage.UNIFORM_NO_OPERATION_VISITOR:
         return createUniformNoOperationVisitor();
      case DemoclesPackage.NODE_DELETION:
         return createNodeDeletion();
      case DemoclesPackage.IF_STATEMENT:
         return createIfStatement();
      case DemoclesPackage.VISITOR:
         return createVisitor();
      case DemoclesPackage.VARIABLE_REFERENCE:
         return createVariableReference();
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
      case DemoclesPackage.ADORNMENT:
         return createAdornmentFromString(eDataType, initialValue);
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
      case DemoclesPackage.ADORNMENT:
         return convertAdornmentToString(eDataType, instanceValue);
      default:
         throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ContinueStatement createContinueStatement()
   {
      ContinueStatementImpl continueStatement = new ContinueStatementImpl();
      return continueStatement;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ReturnStatement createReturnStatement()
   {
      ReturnStatementImpl returnStatement = new ReturnStatementImpl();
      return returnStatement;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public HeadControlledLoop createHeadControlledLoop()
   {
      HeadControlledLoopImpl headControlledLoop = new HeadControlledLoopImpl();
      return headControlledLoop;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public TailControlledLoop createTailControlledLoop()
   {
      TailControlledLoopImpl tailControlledLoop = new TailControlledLoopImpl();
      return tailControlledLoop;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ForEach createForEach()
   {
      ForEachImpl forEach = new ForEachImpl();
      return forEach;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public RegularPatternInvocation createRegularPatternInvocation()
   {
      RegularPatternInvocationImpl regularPatternInvocation = new RegularPatternInvocationImpl();
      return regularPatternInvocation;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CFVariable createCFVariable()
   {
      CFVariableImpl cfVariable = new CFVariableImpl();
      return cfVariable;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CFNode createCFNode()
   {
      CFNodeImpl cfNode = new CFNodeImpl();
      return cfNode;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public BindingPatternInvocation createBindingPatternInvocation()
   {
      BindingPatternInvocationImpl bindingPatternInvocation = new BindingPatternInvocationImpl();
      return bindingPatternInvocation;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public SingleResultPatternInvocation createSingleResultPatternInvocation()
   {
      SingleResultPatternInvocationImpl singleResultPatternInvocation = new SingleResultPatternInvocationImpl();
      return singleResultPatternInvocation;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Scope createScope()
   {
      ScopeImpl scope = new ScopeImpl();
      return scope;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Action createAction()
   {
      ActionImpl action = new ActionImpl();
      return action;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public UniformNoOperationVisitor createUniformNoOperationVisitor()
   {
      UniformNoOperationVisitorImpl uniformNoOperationVisitor = new UniformNoOperationVisitorImpl();
      return uniformNoOperationVisitor;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NodeDeletion createNodeDeletion()
   {
      NodeDeletionImpl nodeDeletion = new NodeDeletionImpl();
      return nodeDeletion;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public IfStatement createIfStatement()
   {
      IfStatementImpl ifStatement = new IfStatementImpl();
      return ifStatement;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Visitor createVisitor()
   {
      VisitorImpl visitor = new VisitorImpl();
      return visitor;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public VariableReference createVariableReference()
   {
      VariableReferenceImpl variableReference = new VariableReferenceImpl();
      return variableReference;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Adornment createAdornmentFromString(EDataType eDataType, String initialValue)
   {
      return (Adornment) super.createFromString(eDataType, initialValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String convertAdornmentToString(EDataType eDataType, Object instanceValue)
   {
      return super.convertToString(eDataType, instanceValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DemoclesPackage getDemoclesPackage()
   {
      return (DemoclesPackage) getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static DemoclesPackage getPackage()
   {
      return DemoclesPackage.eINSTANCE;
   }

} //DemoclesFactoryImpl
