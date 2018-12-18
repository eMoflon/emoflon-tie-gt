/**
 */
package org.moflon.sdm.democles.literalexpressionsolver.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.moflon.sdm.democles.literalexpressionsolver.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LiteralexpressionsolverFactoryImpl extends EFactoryImpl implements LiteralexpressionsolverFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LiteralexpressionsolverFactory init() {
		try {
			LiteralexpressionsolverFactory theLiteralexpressionsolverFactory = (LiteralexpressionsolverFactory) EPackage.Registry.INSTANCE
					.getEFactory(LiteralexpressionsolverPackage.eNS_URI);
			if (theLiteralexpressionsolverFactory != null) {
				return theLiteralexpressionsolverFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LiteralexpressionsolverFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralexpressionsolverFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case LiteralexpressionsolverPackage.CONSTANT_TRANSFORMER:
			return createConstantTransformer();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantTransformer createConstantTransformer() {
		ConstantTransformerImpl constantTransformer = new ConstantTransformerImpl();
		return constantTransformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralexpressionsolverPackage getLiteralexpressionsolverPackage() {
		return (LiteralexpressionsolverPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LiteralexpressionsolverPackage getPackage() {
		return LiteralexpressionsolverPackage.eINSTANCE;
	}

} //LiteralexpressionsolverFactoryImpl
