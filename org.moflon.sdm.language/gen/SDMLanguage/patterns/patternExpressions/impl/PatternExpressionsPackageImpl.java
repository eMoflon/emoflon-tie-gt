/**
 */
package SDMLanguage.patterns.patternExpressions.impl;

import SDMLanguage.SDMLanguagePackage;

import SDMLanguage.activities.ActivitiesPackage;

import SDMLanguage.activities.impl.ActivitiesPackageImpl;

import SDMLanguage.calls.CallsPackage;

import SDMLanguage.calls.callExpressions.CallExpressionsPackage;

import SDMLanguage.calls.callExpressions.impl.CallExpressionsPackageImpl;

import SDMLanguage.calls.impl.CallsPackageImpl;

import SDMLanguage.expressions.ExpressionsPackage;

import SDMLanguage.expressions.impl.ExpressionsPackageImpl;

import SDMLanguage.impl.SDMLanguagePackageImpl;

import SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage;

import SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintsPackageImpl;

import SDMLanguage.patterns.PatternsPackage;

import SDMLanguage.patterns.impl.PatternsPackageImpl;

import SDMLanguage.patterns.patternExpressions.AttributeValueExpression;
import SDMLanguage.patterns.patternExpressions.ObjectRefExpression;
import SDMLanguage.patterns.patternExpressions.ObjectVariableExpression;
import SDMLanguage.patterns.patternExpressions.PatternExpressionsFactory;
import SDMLanguage.patterns.patternExpressions.PatternExpressionsPackage;

import SDMLanguage.sdmUtil.SdmUtilPackage;

import SDMLanguage.sdmUtil.impl.SdmUtilPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternExpressionsPackageImpl extends EPackageImpl implements PatternExpressionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectRefExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectVariableExpressionEClass = null;

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
	 * @see SDMLanguage.patterns.patternExpressions.PatternExpressionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PatternExpressionsPackageImpl() {
		super(eNS_URI, PatternExpressionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PatternExpressionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PatternExpressionsPackage init() {
		if (isInited)
			return (PatternExpressionsPackage) EPackage.Registry.INSTANCE
					.getEPackage(PatternExpressionsPackage.eNS_URI);

		// Obtain or create and register package
		PatternExpressionsPackageImpl thePatternExpressionsPackage = (PatternExpressionsPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof PatternExpressionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new PatternExpressionsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SDMLanguagePackageImpl theSDMLanguagePackage = (SDMLanguagePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(SDMLanguagePackage.eNS_URI) instanceof SDMLanguagePackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(SDMLanguagePackage.eNS_URI)
						: SDMLanguagePackage.eINSTANCE);
		ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ActivitiesPackage.eNS_URI) instanceof ActivitiesPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI)
						: ActivitiesPackage.eINSTANCE);
		SdmUtilPackageImpl theSdmUtilPackage = (SdmUtilPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(SdmUtilPackage.eNS_URI) instanceof SdmUtilPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(SdmUtilPackage.eNS_URI)
						: SdmUtilPackage.eINSTANCE);
		CallsPackageImpl theCallsPackage = (CallsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CallsPackage.eNS_URI) instanceof CallsPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(CallsPackage.eNS_URI)
						: CallsPackage.eINSTANCE);
		CallExpressionsPackageImpl theCallExpressionsPackage = (CallExpressionsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CallExpressionsPackage.eNS_URI) instanceof CallExpressionsPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(CallExpressionsPackage.eNS_URI)
						: CallExpressionsPackage.eINSTANCE);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI)
						: ExpressionsPackage.eINSTANCE);
		PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(PatternsPackage.eNS_URI) instanceof PatternsPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI)
						: PatternsPackage.eINSTANCE);
		AttributeConstraintsPackageImpl theAttributeConstraintsPackage = (AttributeConstraintsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(AttributeConstraintsPackage.eNS_URI) instanceof AttributeConstraintsPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(AttributeConstraintsPackage.eNS_URI)
						: AttributeConstraintsPackage.eINSTANCE);

		// Create package meta-data objects
		thePatternExpressionsPackage.createPackageContents();
		theSDMLanguagePackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theSdmUtilPackage.createPackageContents();
		theCallsPackage.createPackageContents();
		theCallExpressionsPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		thePatternsPackage.createPackageContents();
		theAttributeConstraintsPackage.createPackageContents();

		// Initialize created meta-data
		thePatternExpressionsPackage.initializePackageContents();
		theSDMLanguagePackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theSdmUtilPackage.initializePackageContents();
		theCallsPackage.initializePackageContents();
		theCallExpressionsPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		thePatternsPackage.initializePackageContents();
		theAttributeConstraintsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePatternExpressionsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PatternExpressionsPackage.eNS_URI, thePatternExpressionsPackage);
		return thePatternExpressionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValueExpression() {
		return attributeValueExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueExpression_Attribute() {
		return (EReference) attributeValueExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectRefExpression() {
		return objectRefExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectRefExpression_Object() {
		return (EReference) objectRefExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectVariableExpression() {
		return objectVariableExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternExpressionsFactory getPatternExpressionsFactory() {
		return (PatternExpressionsFactory) getEFactoryInstance();
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
		attributeValueExpressionEClass = createEClass(ATTRIBUTE_VALUE_EXPRESSION);
		createEReference(attributeValueExpressionEClass, ATTRIBUTE_VALUE_EXPRESSION__ATTRIBUTE);

		objectRefExpressionEClass = createEClass(OBJECT_REF_EXPRESSION);
		createEReference(objectRefExpressionEClass, OBJECT_REF_EXPRESSION__OBJECT);

		objectVariableExpressionEClass = createEClass(OBJECT_VARIABLE_EXPRESSION);
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
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ExpressionsPackage.eNS_URI);
		PatternsPackage thePatternsPackage = (PatternsPackage) EPackage.Registry.INSTANCE
				.getEPackage(PatternsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		attributeValueExpressionEClass.getESuperTypes().add(this.getObjectRefExpression());
		attributeValueExpressionEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		objectRefExpressionEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		objectVariableExpressionEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		objectVariableExpressionEClass.getESuperTypes().add(this.getObjectRefExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(attributeValueExpressionEClass, AttributeValueExpression.class, "AttributeValueExpression",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeValueExpression_Attribute(), ecorePackage.getEAttribute(), null, "attribute", null,
				1, 1, AttributeValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectRefExpressionEClass, ObjectRefExpression.class, "ObjectRefExpression", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectRefExpression_Object(), thePatternsPackage.getObjectVariable(), null, "object", null, 1,
				1, ObjectRefExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectVariableExpressionEClass, ObjectVariableExpression.class, "ObjectVariableExpression",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //PatternExpressionsPackageImpl
