/**
 */
package org.moflon.sdm.constraints.constraintstodemocles.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.moflon.sdm.constraints.constraintstodemocles.AttributeConstraintLibUtil;
import org.moflon.sdm.constraints.constraintstodemocles.ConstraintstodemoclesPackage;

import org.moflon.sdm.constraints.operationspecification.AttributeConstraintLibrary;
// <-- [user defined imports]
import java.io.IOException;
import org.moflon.core.utilities.LogUtils;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.sdm.constraints.constraintstodemocles.AttributeConstraintLibraryUtil;
import org.moflon.sdm.constraints.operationspecification.AttributeConstraintsOperationActivator;
import org.moflon.sdm.constraints.operationspecification.OperationspecificationPackage;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Constraint Lib Util</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.constraints.constraintstodemocles.impl.AttributeConstraintLibUtilImpl#getBuildInAttributeConstraintLibrary <em>Build In Attribute Constraint Library</em>}</li>
 *   <li>{@link org.moflon.sdm.constraints.constraintstodemocles.impl.AttributeConstraintLibUtilImpl#getUserDefinedAttributeConstraintLibrary <em>User Defined Attribute Constraint Library</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeConstraintLibUtilImpl extends EObjectImpl implements AttributeConstraintLibUtil
{
   /**
    * The cached value of the '{@link #getBuildInAttributeConstraintLibrary() <em>Build In Attribute Constraint Library</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getBuildInAttributeConstraintLibrary()
    * @generated
    * @ordered
    */
   protected AttributeConstraintLibrary buildInAttributeConstraintLibrary;

   /**
    * The cached value of the '{@link #getUserDefinedAttributeConstraintLibrary() <em>User Defined Attribute Constraint Library</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getUserDefinedAttributeConstraintLibrary()
    * @generated
    * @ordered
    */
   protected AttributeConstraintLibrary userDefinedAttributeConstraintLibrary;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected AttributeConstraintLibUtilImpl()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass()
   {
      return ConstraintstodemoclesPackage.Literals.ATTRIBUTE_CONSTRAINT_LIB_UTIL;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AttributeConstraintLibrary getBuildInAttributeConstraintLibrary()
   {
      if (buildInAttributeConstraintLibrary != null && buildInAttributeConstraintLibrary.eIsProxy())
      {
         InternalEObject oldBuildInAttributeConstraintLibrary = (InternalEObject) buildInAttributeConstraintLibrary;
         buildInAttributeConstraintLibrary = (AttributeConstraintLibrary) eResolveProxy(oldBuildInAttributeConstraintLibrary);
         if (buildInAttributeConstraintLibrary != oldBuildInAttributeConstraintLibrary)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                     ConstraintstodemoclesPackage.ATTRIBUTE_CONSTRAINT_LIB_UTIL__BUILD_IN_ATTRIBUTE_CONSTRAINT_LIBRARY, oldBuildInAttributeConstraintLibrary,
                     buildInAttributeConstraintLibrary));
         }
      }
      return buildInAttributeConstraintLibrary;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AttributeConstraintLibrary basicGetBuildInAttributeConstraintLibrary()
   {
      return buildInAttributeConstraintLibrary;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setBuildInAttributeConstraintLibrary(AttributeConstraintLibrary newBuildInAttributeConstraintLibrary)
   {
      AttributeConstraintLibrary oldBuildInAttributeConstraintLibrary = buildInAttributeConstraintLibrary;
      buildInAttributeConstraintLibrary = newBuildInAttributeConstraintLibrary;
      if (eNotificationRequired())
         eNotify(
               new ENotificationImpl(this, Notification.SET, ConstraintstodemoclesPackage.ATTRIBUTE_CONSTRAINT_LIB_UTIL__BUILD_IN_ATTRIBUTE_CONSTRAINT_LIBRARY,
                     oldBuildInAttributeConstraintLibrary, buildInAttributeConstraintLibrary));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AttributeConstraintLibrary getUserDefinedAttributeConstraintLibrary()
   {
      if (userDefinedAttributeConstraintLibrary != null && userDefinedAttributeConstraintLibrary.eIsProxy())
      {
         InternalEObject oldUserDefinedAttributeConstraintLibrary = (InternalEObject) userDefinedAttributeConstraintLibrary;
         userDefinedAttributeConstraintLibrary = (AttributeConstraintLibrary) eResolveProxy(oldUserDefinedAttributeConstraintLibrary);
         if (userDefinedAttributeConstraintLibrary != oldUserDefinedAttributeConstraintLibrary)
         {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                     ConstraintstodemoclesPackage.ATTRIBUTE_CONSTRAINT_LIB_UTIL__USER_DEFINED_ATTRIBUTE_CONSTRAINT_LIBRARY,
                     oldUserDefinedAttributeConstraintLibrary, userDefinedAttributeConstraintLibrary));
         }
      }
      return userDefinedAttributeConstraintLibrary;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public AttributeConstraintLibrary basicGetUserDefinedAttributeConstraintLibrary()
   {
      return userDefinedAttributeConstraintLibrary;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setUserDefinedAttributeConstraintLibrary(AttributeConstraintLibrary newUserDefinedAttributeConstraintLibrary)
   {
      AttributeConstraintLibrary oldUserDefinedAttributeConstraintLibrary = userDefinedAttributeConstraintLibrary;
      userDefinedAttributeConstraintLibrary = newUserDefinedAttributeConstraintLibrary;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
               ConstraintstodemoclesPackage.ATTRIBUTE_CONSTRAINT_LIB_UTIL__USER_DEFINED_ATTRIBUTE_CONSTRAINT_LIBRARY, oldUserDefinedAttributeConstraintLibrary,
               userDefinedAttributeConstraintLibrary));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void saveUserDefinedAttributeConstraintLibrary()
   {
      // [user code injected with eMoflon]

      userDefinedAttributeConstraintLibrary.setPrefix(project.getName() + "AttributeConstraintsLib");

      if (userDefinedAttributeConstraintLibrary.eResource() == null)
      {
         Resource resource = AttributeConstraintLibraryUtil
               .loadAttributeConstraintLibraryResource(AttributeConstraintLibraryUtil.getURIOfUserDefinedLibrary(this.project), true, this.resourceSet);
         resource.getContents().add(userDefinedAttributeConstraintLibrary);
      }

      try
      {
         userDefinedAttributeConstraintLibrary.eResource().save(null);
      } catch (final IOException e)
      {
         LogUtils.error(logger, e);
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
      case ConstraintstodemoclesPackage.ATTRIBUTE_CONSTRAINT_LIB_UTIL__BUILD_IN_ATTRIBUTE_CONSTRAINT_LIBRARY:
         if (resolve)
            return getBuildInAttributeConstraintLibrary();
         return basicGetBuildInAttributeConstraintLibrary();
      case ConstraintstodemoclesPackage.ATTRIBUTE_CONSTRAINT_LIB_UTIL__USER_DEFINED_ATTRIBUTE_CONSTRAINT_LIBRARY:
         if (resolve)
            return getUserDefinedAttributeConstraintLibrary();
         return basicGetUserDefinedAttributeConstraintLibrary();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
      case ConstraintstodemoclesPackage.ATTRIBUTE_CONSTRAINT_LIB_UTIL__BUILD_IN_ATTRIBUTE_CONSTRAINT_LIBRARY:
         setBuildInAttributeConstraintLibrary((AttributeConstraintLibrary) newValue);
         return;
      case ConstraintstodemoclesPackage.ATTRIBUTE_CONSTRAINT_LIB_UTIL__USER_DEFINED_ATTRIBUTE_CONSTRAINT_LIBRARY:
         setUserDefinedAttributeConstraintLibrary((AttributeConstraintLibrary) newValue);
         return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eUnset(int featureID)
   {
      switch (featureID)
      {
      case ConstraintstodemoclesPackage.ATTRIBUTE_CONSTRAINT_LIB_UTIL__BUILD_IN_ATTRIBUTE_CONSTRAINT_LIBRARY:
         setBuildInAttributeConstraintLibrary((AttributeConstraintLibrary) null);
         return;
      case ConstraintstodemoclesPackage.ATTRIBUTE_CONSTRAINT_LIB_UTIL__USER_DEFINED_ATTRIBUTE_CONSTRAINT_LIBRARY:
         setUserDefinedAttributeConstraintLibrary((AttributeConstraintLibrary) null);
         return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean eIsSet(int featureID)
   {
      switch (featureID)
      {
      case ConstraintstodemoclesPackage.ATTRIBUTE_CONSTRAINT_LIB_UTIL__BUILD_IN_ATTRIBUTE_CONSTRAINT_LIBRARY:
         return buildInAttributeConstraintLibrary != null;
      case ConstraintstodemoclesPackage.ATTRIBUTE_CONSTRAINT_LIB_UTIL__USER_DEFINED_ATTRIBUTE_CONSTRAINT_LIBRARY:
         return userDefinedAttributeConstraintLibrary != null;
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
   {
      switch (operationID)
      {
      case ConstraintstodemoclesPackage.ATTRIBUTE_CONSTRAINT_LIB_UTIL___SAVE_USER_DEFINED_ATTRIBUTE_CONSTRAINT_LIBRARY:
         saveUserDefinedAttributeConstraintLibrary();
         return null;
      }
      return super.eInvoke(operationID, arguments);
   }
   // <-- [user code injected with eMoflon]

   public void init(ResourceSet resourceSet, IProject project)
   {
      this.resourceSet = resourceSet;
      this.project = project;
      Resource buildInLibResource = AttributeConstraintLibraryUtil
            .loadAttributeConstraintLibraryResource(AttributeConstraintLibraryUtil.getURIOfBuiltInLibrary(), false, this.resourceSet);
      if (buildInLibResource == null)
      {
         throw new RuntimeException("Could not find built-in attribute constraint library");
      }
      this.setBuildInAttributeConstraintLibrary((AttributeConstraintLibrary) buildInLibResource.getContents().get(0));

      Resource userDefLibResource = AttributeConstraintLibraryUtil
            .loadAttributeConstraintLibraryResource(AttributeConstraintLibraryUtil.getURIOfUserDefinedLibrary(this.project), false, this.resourceSet);
      if (userDefLibResource != null)
      {
         this.setUserDefinedAttributeConstraintLibrary((AttributeConstraintLibrary) userDefLibResource.getContents().get(0));
      }

   }

   private ResourceSet resourceSet;

   private IProject project;

   private static final Logger logger = Logger.getLogger(AttributeConstraintLibUtilImpl.class);

   // [user code injected with eMoflon] -->
} //AttributeConstraintLibUtilImpl
