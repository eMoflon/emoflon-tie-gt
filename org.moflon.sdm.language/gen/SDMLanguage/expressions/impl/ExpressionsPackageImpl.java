/**
 */
package SDMLanguage.expressions.impl;

import SDMLanguage.SDMLanguagePackage;

import SDMLanguage.activities.ActivitiesPackage;

import SDMLanguage.activities.impl.ActivitiesPackageImpl;

import SDMLanguage.calls.CallsPackage;

import SDMLanguage.calls.callExpressions.CallExpressionsPackage;

import SDMLanguage.calls.callExpressions.impl.CallExpressionsPackageImpl;

import SDMLanguage.calls.impl.CallsPackageImpl;

import SDMLanguage.expressions.BinaryExpression;
import SDMLanguage.expressions.ComparingOperator;
import SDMLanguage.expressions.ComparisonExpression;
import SDMLanguage.expressions.Expression;
import SDMLanguage.expressions.ExpressionsFactory;
import SDMLanguage.expressions.ExpressionsPackage;
import SDMLanguage.expressions.LiteralExpression;
import SDMLanguage.expressions.TextualExpression;

import SDMLanguage.impl.SDMLanguagePackageImpl;

import SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage;

import SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintsPackageImpl;

import SDMLanguage.patterns.PatternsPackage;

import SDMLanguage.patterns.impl.PatternsPackageImpl;

import SDMLanguage.patterns.patternExpressions.PatternExpressionsPackage;

import SDMLanguage.patterns.patternExpressions.impl.PatternExpressionsPackageImpl;

import SDMLanguage.sdmUtil.SdmUtilPackage;

import SDMLanguage.sdmUtil.impl.SdmUtilPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionsPackageImpl extends EPackageImpl implements ExpressionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textualExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparingOperatorEEnum = null;

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
	 * @see SDMLanguage.expressions.ExpressionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExpressionsPackageImpl() {
		super(eNS_URI, ExpressionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExpressionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExpressionsPackage init() {
		if (isInited)
			return (ExpressionsPackage) EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

		// Obtain or create and register package
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ExpressionsPackageImpl());

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
		theExpressionsPackage.createPackageContents();
		theSDMLanguagePackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theSdmUtilPackage.createPackageContents();
		theCallsPackage.createPackageContents();
		theCallExpressionsPackage.createPackageContents();
		thePatternsPackage.createPackageContents();
		theAttributeConstraintsPackage.createPackageContents();
		thePatternExpressionsPackage.createPackageContents();

		// Initialize created meta-data
		theExpressionsPackage.initializePackageContents();
		theSDMLanguagePackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theSdmUtilPackage.initializePackageContents();
		theCallsPackage.initializePackageContents();
		theCallExpressionsPackage.initializePackageContents();
		thePatternsPackage.initializePackageContents();
		theAttributeConstraintsPackage.initializePackageContents();
		thePatternExpressionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExpressionsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExpressionsPackage.eNS_URI, theExpressionsPackage);
		return theExpressionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExpression() {
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_RightExpression() {
		return (EReference) binaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_LeftExpression() {
		return (EReference) binaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparisonExpression() {
		return comparisonExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparisonExpression_Operator() {
		return (EAttribute) comparisonExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpression__Compare__Expression() {
		return expressionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralExpression() {
		return literalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralExpression_Value() {
		return (EAttribute) literalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextualExpression() {
		return textualExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextualExpression_ExpressionText() {
		return (EAttribute) textualExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextualExpression_Language() {
		return (EAttribute) textualExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextualExpression_LanguageVersion() {
		return (EAttribute) textualExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparingOperator() {
		return comparingOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsFactory getExpressionsFactory() {
		return (ExpressionsFactory) getEFactoryInstance();
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
		binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__RIGHT_EXPRESSION);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__LEFT_EXPRESSION);

		comparisonExpressionEClass = createEClass(COMPARISON_EXPRESSION);
		createEAttribute(comparisonExpressionEClass, COMPARISON_EXPRESSION__OPERATOR);

		expressionEClass = createEClass(EXPRESSION);
		createEOperation(expressionEClass, EXPRESSION___COMPARE__EXPRESSION);

		literalExpressionEClass = createEClass(LITERAL_EXPRESSION);
		createEAttribute(literalExpressionEClass, LITERAL_EXPRESSION__VALUE);

		textualExpressionEClass = createEClass(TEXTUAL_EXPRESSION);
		createEAttribute(textualExpressionEClass, TEXTUAL_EXPRESSION__EXPRESSION_TEXT);
		createEAttribute(textualExpressionEClass, TEXTUAL_EXPRESSION__LANGUAGE);
		createEAttribute(textualExpressionEClass, TEXTUAL_EXPRESSION__LANGUAGE_VERSION);

		// Create enums
		comparingOperatorEEnum = createEEnum(COMPARING_OPERATOR);
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
		SDMLanguagePackage theSDMLanguagePackage = (SDMLanguagePackage) EPackage.Registry.INSTANCE
				.getEPackage(SDMLanguagePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		binaryExpressionEClass.getESuperTypes().add(this.getExpression());
		comparisonExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		expressionEClass.getESuperTypes().add(theSDMLanguagePackage.getCommentableElement());
		literalExpressionEClass.getESuperTypes().add(this.getExpression());
		literalExpressionEClass.getESuperTypes().add(theSDMLanguagePackage.getTypedElement());
		textualExpressionEClass.getESuperTypes().add(this.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryExpression_RightExpression(), this.getExpression(), null, "rightExpression", null, 1, 1,
				BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_LeftExpression(), this.getExpression(), null, "leftExpression", null, 1, 1,
				BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparisonExpressionEClass, ComparisonExpression.class, "ComparisonExpression", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComparisonExpression_Operator(), this.getComparingOperator(), "operator", null, 1, 1,
				ComparisonExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getExpression__Compare__Expression(), ecorePackage.getEBoolean(), "compare", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getExpression(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(literalExpressionEClass, LiteralExpression.class, "LiteralExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralExpression_Value(), ecorePackage.getEString(), "value", null, 1, 1,
				LiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(textualExpressionEClass, TextualExpression.class, "TextualExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextualExpression_ExpressionText(), ecorePackage.getEString(), "expressionText", null, 1, 1,
				TextualExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTextualExpression_Language(), ecorePackage.getEString(), "language", null, 1, 1,
				TextualExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTextualExpression_LanguageVersion(), ecorePackage.getEString(), "languageVersion", null, 1, 1,
				TextualExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(comparingOperatorEEnum, ComparingOperator.class, "ComparingOperator");
		addEEnumLiteral(comparingOperatorEEnum, ComparingOperator.LESS);
		addEEnumLiteral(comparingOperatorEEnum, ComparingOperator.LESS_OR_EQUAL);
		addEEnumLiteral(comparingOperatorEEnum, ComparingOperator.EQUAL);
		addEEnumLiteral(comparingOperatorEEnum, ComparingOperator.GREATER_OR_EQUAL);
		addEEnumLiteral(comparingOperatorEEnum, ComparingOperator.GREATER);
		addEEnumLiteral(comparingOperatorEEnum, ComparingOperator.UNEQUAL);
	}

} //ExpressionsPackageImpl
