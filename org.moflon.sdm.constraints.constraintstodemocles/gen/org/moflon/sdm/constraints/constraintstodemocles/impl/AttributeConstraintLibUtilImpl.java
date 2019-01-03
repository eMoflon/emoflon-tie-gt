/**
 */
package org.moflon.sdm.constraints.constraintstodemocles.impl;

// <-- [user defined imports]
import java.io.IOException;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.moflon.core.utilities.LogUtils;
import org.moflon.sdm.constraints.constraintstodemocles.AttributeConstraintLibUtil;
import org.moflon.sdm.constraints.constraintstodemocles.AttributeConstraintLibraryUtil;
import org.moflon.sdm.constraints.operationspecification.AttributeConstraintLibrary;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Attribute Constraint Lib Util</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.moflon.sdm.constraints.constraintstodemocles.impl.AttributeConstraintLibUtilImpl#getBuildInAttributeConstraintLibrary
 * <em>Build In Attribute Constraint Library</em>}</li>
 * <li>{@link org.moflon.sdm.constraints.constraintstodemocles.impl.AttributeConstraintLibUtilImpl#getUserDefinedAttributeConstraintLibrary
 * <em>User Defined Attribute Constraint Library</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeConstraintLibUtilImpl extends EObjectImpl implements AttributeConstraintLibUtil {
	/**
	 * The cached value of the '{@link #getBuildInAttributeConstraintLibrary()
	 * <em>Build In Attribute Constraint Library</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBuildInAttributeConstraintLibrary()
	 * @generated
	 * @ordered
	 */
	protected AttributeConstraintLibrary buildInAttributeConstraintLibrary;

	/**
	 * The cached value of the '{@link #getUserDefinedAttributeConstraintLibrary()
	 * <em>User Defined Attribute Constraint Library</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUserDefinedAttributeConstraintLibrary()
	 * @generated
	 * @ordered
	 */
	protected AttributeConstraintLibrary userDefinedAttributeConstraintLibrary;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AttributeConstraintLibUtilImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AttributeConstraintLibrary getBuildInAttributeConstraintLibrary() {
		if (buildInAttributeConstraintLibrary != null && buildInAttributeConstraintLibrary.eIsProxy()) {
			final InternalEObject oldBuildInAttributeConstraintLibrary = (InternalEObject) buildInAttributeConstraintLibrary;
			buildInAttributeConstraintLibrary = (AttributeConstraintLibrary) eResolveProxy(
					oldBuildInAttributeConstraintLibrary);
		}
		return buildInAttributeConstraintLibrary;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AttributeConstraintLibrary basicGetBuildInAttributeConstraintLibrary() {
		return buildInAttributeConstraintLibrary;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBuildInAttributeConstraintLibrary(
			final AttributeConstraintLibrary newBuildInAttributeConstraintLibrary) {
		final AttributeConstraintLibrary oldBuildInAttributeConstraintLibrary = buildInAttributeConstraintLibrary;
		buildInAttributeConstraintLibrary = newBuildInAttributeConstraintLibrary;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AttributeConstraintLibrary getUserDefinedAttributeConstraintLibrary() {
		if (userDefinedAttributeConstraintLibrary != null && userDefinedAttributeConstraintLibrary.eIsProxy()) {
			final InternalEObject oldUserDefinedAttributeConstraintLibrary = (InternalEObject) userDefinedAttributeConstraintLibrary;
			userDefinedAttributeConstraintLibrary = (AttributeConstraintLibrary) eResolveProxy(
					oldUserDefinedAttributeConstraintLibrary);
		}
		return userDefinedAttributeConstraintLibrary;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AttributeConstraintLibrary basicGetUserDefinedAttributeConstraintLibrary() {
		return userDefinedAttributeConstraintLibrary;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setUserDefinedAttributeConstraintLibrary(
			final AttributeConstraintLibrary newUserDefinedAttributeConstraintLibrary) {
		final AttributeConstraintLibrary oldUserDefinedAttributeConstraintLibrary = userDefinedAttributeConstraintLibrary;
		userDefinedAttributeConstraintLibrary = newUserDefinedAttributeConstraintLibrary;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void saveUserDefinedAttributeConstraintLibrary() {
		// [user code injected with eMoflon]

		userDefinedAttributeConstraintLibrary.setPrefix(project.getName() + "AttributeConstraintsLib");

		if (userDefinedAttributeConstraintLibrary.eResource() == null) {
			final Resource resource = AttributeConstraintLibraryUtil.loadAttributeConstraintLibraryResource(
					AttributeConstraintLibraryUtil.getURIOfUserDefinedLibrary(this.project), true, this.resourceSet);
			resource.getContents().add(userDefinedAttributeConstraintLibrary);
		}

		try {
			userDefinedAttributeConstraintLibrary.eResource().save(null);
		} catch (final IOException e) {
			LogUtils.error(logger, e);
		}
	}

	public void init(final ResourceSet resourceSet, final IProject project) {
		this.resourceSet = resourceSet;
		this.project = project;
		final Resource buildInLibResource = AttributeConstraintLibraryUtil.loadAttributeConstraintLibraryResource(
				AttributeConstraintLibraryUtil.getURIOfBuiltInLibrary(), false, this.resourceSet);
		if (buildInLibResource == null) {
			throw new RuntimeException("Could not find built-in attribute constraint library");
		}
		this.setBuildInAttributeConstraintLibrary((AttributeConstraintLibrary) buildInLibResource.getContents().get(0));

		final Resource userDefLibResource = AttributeConstraintLibraryUtil.loadAttributeConstraintLibraryResource(
				AttributeConstraintLibraryUtil.getURIOfUserDefinedLibrary(this.project), false, this.resourceSet);
		if (userDefLibResource != null) {
			this.setUserDefinedAttributeConstraintLibrary(
					(AttributeConstraintLibrary) userDefLibResource.getContents().get(0));
		}

	}

	private ResourceSet resourceSet;

	private IProject project;

	private static final Logger logger = Logger.getLogger(AttributeConstraintLibUtilImpl.class);

	// [user code injected with eMoflon] -->
} // AttributeConstraintLibUtilImpl
