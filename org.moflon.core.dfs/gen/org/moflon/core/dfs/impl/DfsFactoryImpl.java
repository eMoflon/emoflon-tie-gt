/**
 */
package org.moflon.core.dfs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.moflon.core.dfs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DfsFactoryImpl extends EFactoryImpl implements DfsFactory
{
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static DfsFactory init()
   {
      try
      {
         DfsFactory theDfsFactory = (DfsFactory) EPackage.Registry.INSTANCE.getEFactory(DfsPackage.eNS_URI);
         if (theDfsFactory != null)
         {
            return theDfsFactory;
         }
      } catch (Exception exception)
      {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new DfsFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DfsFactoryImpl()
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
      case DfsPackage.NODE:
         return createNode();
      case DfsPackage.EDGE:
         return createEdge();
      case DfsPackage.DEPTH_FIRST_SEARCH:
         return createDepthFirstSearch();
      case DfsPackage.DFS_GRAPH:
         return createDFSGraph();
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
      case DfsPackage.EDGE_TYPE:
         return createEdgeTypeFromString(eDataType, initialValue);
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
      case DfsPackage.EDGE_TYPE:
         return convertEdgeTypeToString(eDataType, instanceValue);
      default:
         throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Node createNode()
   {
      NodeImpl node = new NodeImpl();
      return node;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Edge createEdge()
   {
      EdgeImpl edge = new EdgeImpl();
      return edge;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DepthFirstSearch createDepthFirstSearch()
   {
      DepthFirstSearchImpl depthFirstSearch = new DepthFirstSearchImpl();
      return depthFirstSearch;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DFSGraph createDFSGraph()
   {
      DFSGraphImpl dfsGraph = new DFSGraphImpl();
      return dfsGraph;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EdgeType createEdgeTypeFromString(EDataType eDataType, String initialValue)
   {
      EdgeType result = EdgeType.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String convertEdgeTypeToString(EDataType eDataType, Object instanceValue)
   {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public DfsPackage getDfsPackage()
   {
      return (DfsPackage) getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static DfsPackage getPackage()
   {
      return DfsPackage.eINSTANCE;
   }

} //DfsFactoryImpl
