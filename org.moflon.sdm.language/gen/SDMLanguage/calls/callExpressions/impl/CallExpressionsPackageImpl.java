/**
 */
package SDMLanguage.calls.callExpressions.impl;

import SDMLanguage.SDMLanguagePackage;

import SDMLanguage.activities.ActivitiesPackage;

import SDMLanguage.activities.impl.ActivitiesPackageImpl;

import SDMLanguage.calls.CallsPackage;

import SDMLanguage.calls.callExpressions.CallExpressionsFactory;
import SDMLanguage.calls.callExpressions.CallExpressionsPackage;
import SDMLanguage.calls.callExpressions.MethodCallExpression;
import SDMLanguage.calls.callExpressions.ParameterExpression;

import SDMLanguage.calls.impl.CallsPackageImpl;

import SDMLanguage.expressions.ExpressionsPackage;

import SDMLanguage.expressions.impl.ExpressionsPackageImpl;

import SDMLanguage.impl.SDMLanguagePackageImpl;

import SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage;

import SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintsPackageImpl;

import SDMLanguage.patterns.PatternsPackage;

import SDMLanguage.patterns.impl.PatternsPackageImpl;

import SDMLanguage.patterns.patternExpressions.PatternExpressionsPackage;

import SDMLanguage.patterns.patternExpressions.impl.PatternExpressionsPackageImpl;

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
public class CallExpressionsPackageImpl extends EPackageImpl implements CallExpressionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodCallExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterExpressionEClass = null;

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
	 * @see SDMLanguage.calls.callExpressions.CallExpressionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CallExpressionsPackageImpl() {
		super(eNS_URI, CallExpressionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CallExpressionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CallExpressionsPackage init() {
		if (isInited)
			return (CallExpressionsPackage) EPackage.Registry.INSTANCE.getEPackage(CallExpressionsPackage.eNS_URI);

		// Obtain or create and register package
		CallExpressionsPackageImpl theCallExpressionsPackage = (CallExpressionsPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof CallExpressionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new CallExpressionsPackageImpl());

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
		PatternExpressionsPackageImpl thePatternExpressionsPackage = (PatternExpressionsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(PatternExpressionsPackage.eNS_URI) instanceof PatternExpressionsPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(PatternExpressionsPackage.eNS_URI)
						: PatternExpressionsPackage.eINSTANCE);

		// Create package meta-data objects
		theCallExpressionsPackage.createPackageContents();
		theSDMLanguagePackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theSdmUtilPackage.createPackageContents();
		theCallsPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		thePatternsPackage.createPackageContents();
		theAttributeConstraintsPackage.createPackageContents();
		thePatternExpressionsPackage.createPackageContents();

		// Initialize created meta-data
		theCallExpressionsPackage.initializePackageContents();
		theSDMLanguagePackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theSdmUtilPackage.initializePackageContents();
		theCallsPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		thePatternsPackage.initializePackageContents();
		theAttributeConstraintsPackage.initializePackageContents();
		thePatternExpressionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCallExpressionsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CallExpressionsPackage.eNS_URI, theCallExpressionsPackage);
		return theCallExpressionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodCallExpression() {
		return methodCallExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodCallExpression_Target() {
		return (EReference) methodCallExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterExpression() {
		return parameterExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterExpression_Parameter() {
		return (EReference) parameterExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallExpressionsFactory getCallExpressionsFactory() {
		return (CallExpressionsFactory) getEFactoryInstance();
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
		methodCallExpressionEClass = createEClass(METHOD_CALL_EXPRESSION);
		createEReference(methodCallExpressionEClass, METHOD_CALL_EXPRESSION__TARGET);

		parameterExpressionEClass = createEClass(PARAMETER_EXPRESSION);
		createEReference(parameterExpressionEClass, PARAMETER_EXPRESSION__PARAMETER);
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
		CallsPackage theCallsPackage = (CallsPackage) EPackage.Registry.INSTANCE.getEPackage(CallsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		methodCallExpressionEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		methodCallExpressionEClass.getESuperTypes().add(theCallsPackage.getInvocation());
		parameterExpressionEClass.getESuperTypes().add(theExpressionsPackage.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(methodCallExpressionEClass, MethodCallExpression.class, "MethodCallExpression", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethodCallExpression_Target(), theExpressionsPackage.getExpression(), null, "target", null, 1,
				1, MethodCallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterExpressionEClass, ParameterExpression.class, "ParameterExpression", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterExpression_Parameter(), ecorePackage.getEParameter(), null, "parameter", null, 1, 1,
				ParameterExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //CallExpressionsPackageImpl
