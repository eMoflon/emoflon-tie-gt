/**
 */
package org.moflon.sdm.democles.literalexpressionsolver.impl;

import MocaTree.MocaTreePackage;

import SDMLanguage.SDMLanguagePackage;

import SDMLanguage.expressions.ExpressionsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gervarro.democles.specification.emf.SpecificationPackage;

import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage;

import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintPackage;

import org.moflon.sdm.democles.literalexpressionsolver.ConstantTransformer;
import org.moflon.sdm.democles.literalexpressionsolver.LiteralexpressionsolverFactory;
import org.moflon.sdm.democles.literalexpressionsolver.LiteralexpressionsolverPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LiteralexpressionsolverPackageImpl extends EPackageImpl implements LiteralexpressionsolverPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantTransformerEClass = null;

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
	 * @see org.moflon.sdm.democles.literalexpressionsolver.LiteralexpressionsolverPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LiteralexpressionsolverPackageImpl() {
		super(eNS_URI, LiteralexpressionsolverFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LiteralexpressionsolverPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LiteralexpressionsolverPackage init() {
		if (isInited)
			return (LiteralexpressionsolverPackage) EPackage.Registry.INSTANCE
					.getEPackage(LiteralexpressionsolverPackage.eNS_URI);

		// Obtain or create and register package
		LiteralexpressionsolverPackageImpl theLiteralexpressionsolverPackage = (LiteralexpressionsolverPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof LiteralexpressionsolverPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new LiteralexpressionsolverPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SpecificationPackage.eINSTANCE.eClass();
		EMFTypePackage.eINSTANCE.eClass();
		RelationalConstraintPackage.eINSTANCE.eClass();
		MocaTreePackage.eINSTANCE.eClass();
		SDMLanguagePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLiteralexpressionsolverPackage.createPackageContents();

		// Initialize created meta-data
		theLiteralexpressionsolverPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLiteralexpressionsolverPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LiteralexpressionsolverPackage.eNS_URI, theLiteralexpressionsolverPackage);
		return theLiteralexpressionsolverPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantTransformer() {
		return constantTransformerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstantTransformer__Parse__String() {
		return constantTransformerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstantTransformer__TransformLiteralExpression__LiteralExpression_EClassifier() {
		return constantTransformerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstantTransformer__CanCreateDataTypeFromString__EFactory_EDataType_String() {
		return constantTransformerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstantTransformer__CanCreateEnumLiteralFromString__EEnum_String() {
		return constantTransformerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralexpressionsolverFactory getLiteralexpressionsolverFactory() {
		return (LiteralexpressionsolverFactory) getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		constantTransformerEClass = createEClass(CONSTANT_TRANSFORMER);
		createEOperation(constantTransformerEClass, CONSTANT_TRANSFORMER___PARSE__STRING);
		createEOperation(constantTransformerEClass,
				CONSTANT_TRANSFORMER___TRANSFORM_LITERAL_EXPRESSION__LITERALEXPRESSION_ECLASSIFIER);
		createEOperation(constantTransformerEClass,
				CONSTANT_TRANSFORMER___CAN_CREATE_DATA_TYPE_FROM_STRING__EFACTORY_EDATATYPE_STRING);
		createEOperation(constantTransformerEClass,
				CONSTANT_TRANSFORMER___CAN_CREATE_ENUM_LITERAL_FROM_STRING__EENUM_STRING);
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
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		MocaTreePackage theMocaTreePackage = (MocaTreePackage) EPackage.Registry.INSTANCE
				.getEPackage(MocaTreePackage.eNS_URI);
		SpecificationPackage theSpecificationPackage = (SpecificationPackage) EPackage.Registry.INSTANCE
				.getEPackage(SpecificationPackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ExpressionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(constantTransformerEClass, ConstantTransformer.class, "ConstantTransformer", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getConstantTransformer__Parse__String(), theMocaTreePackage.getNode(), "parse",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "string", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConstantTransformer__TransformLiteralExpression__LiteralExpression_EClassifier(),
				theSpecificationPackage.getConstant(), "transformLiteralExpression", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theExpressionsPackage.getLiteralExpression(), "literalExpression", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEClassifier(), "expectedType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConstantTransformer__CanCreateDataTypeFromString__EFactory_EDataType_String(),
				ecorePackage.getEBoolean(), "canCreateDataTypeFromString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFactory(), "factory", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDataType(), "dataType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConstantTransformer__CanCreateEnumLiteralFromString__EEnum_String(),
				ecorePackage.getEBoolean(), "canCreateEnumLiteralFromString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEEnum(), "eEnum", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //LiteralexpressionsolverPackageImpl
