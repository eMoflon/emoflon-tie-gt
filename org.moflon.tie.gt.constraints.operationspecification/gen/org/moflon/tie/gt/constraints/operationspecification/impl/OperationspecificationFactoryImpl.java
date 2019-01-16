/**
 */
package org.moflon.tie.gt.constraints.operationspecification.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.moflon.tie.gt.constraints.operationspecification.AttributeConstraintLibrary;
import org.moflon.tie.gt.constraints.operationspecification.ConstraintSpecification;
import org.moflon.tie.gt.constraints.operationspecification.OperationSpecification;
import org.moflon.tie.gt.constraints.operationspecification.OperationSpecificationGroup;
import org.moflon.tie.gt.constraints.operationspecification.OperationspecificationFactory;
import org.moflon.tie.gt.constraints.operationspecification.OperationspecificationPackage;
import org.moflon.tie.gt.constraints.operationspecification.ParamIdentifier;
import org.moflon.tie.gt.constraints.operationspecification.ParameterType;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class OperationspecificationFactoryImpl extends EFactoryImpl implements OperationspecificationFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static OperationspecificationFactory init() {
		try {
			final OperationspecificationFactory theOperationspecificationFactory = (OperationspecificationFactory) EPackage.Registry.INSTANCE
					.getEFactory(OperationspecificationPackage.eNS_URI);
			if (theOperationspecificationFactory != null) {
				return theOperationspecificationFactory;
			}
		} catch (final Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperationspecificationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public OperationspecificationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(final EClass eClass) {
		switch (eClass.getClassifierID()) {
		case OperationspecificationPackage.OPERATION_SPECIFICATION:
			return createOperationSpecification();
		case OperationspecificationPackage.ATTRIBUTE_CONSTRAINT_LIBRARY:
			return createAttributeConstraintLibrary();
		case OperationspecificationPackage.OPERATION_SPECIFICATION_GROUP:
			return createOperationSpecificationGroup();
		case OperationspecificationPackage.PARAM_IDENTIFIER:
			return createParamIdentifier();
		case OperationspecificationPackage.CONSTRAINT_SPECIFICATION:
			return createConstraintSpecification();
		case OperationspecificationPackage.PARAMETER_TYPE:
			return createParameterType();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OperationSpecification createOperationSpecification() {
		final OperationSpecificationImpl operationSpecification = new OperationSpecificationImpl();
		return operationSpecification;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AttributeConstraintLibrary createAttributeConstraintLibrary() {
		final AttributeConstraintLibraryImpl attributeConstraintLibrary = new AttributeConstraintLibraryImpl();
		return attributeConstraintLibrary;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OperationSpecificationGroup createOperationSpecificationGroup() {
		final OperationSpecificationGroupImpl operationSpecificationGroup = new OperationSpecificationGroupImpl();
		return operationSpecificationGroup;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ParamIdentifier createParamIdentifier() {
		final ParamIdentifierImpl paramIdentifier = new ParamIdentifierImpl();
		return paramIdentifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ConstraintSpecification createConstraintSpecification() {
		final ConstraintSpecificationImpl constraintSpecification = new ConstraintSpecificationImpl();
		return constraintSpecification;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ParameterType createParameterType() {
		final ParameterTypeImpl parameterType = new ParameterTypeImpl();
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OperationspecificationPackage getOperationspecificationPackage() {
		return (OperationspecificationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OperationspecificationPackage getPackage() {
		return OperationspecificationPackage.eINSTANCE;
	}

} // OperationspecificationFactoryImpl
