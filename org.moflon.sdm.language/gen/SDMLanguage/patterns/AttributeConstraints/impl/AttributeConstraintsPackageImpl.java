/**
 */
package SDMLanguage.patterns.AttributeConstraints.impl;

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

import SDMLanguage.patterns.AttributeConstraints.AssignmentConstraint;
import SDMLanguage.patterns.AttributeConstraints.AttributeConstraint;
import SDMLanguage.patterns.AttributeConstraints.AttributeConstraintExpression;
import SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable;
import SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsFactory;
import SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage;
import SDMLanguage.patterns.AttributeConstraints.AttributeLookupConstraint;
import SDMLanguage.patterns.AttributeConstraints.AttributeValueConstraint;
import SDMLanguage.patterns.AttributeConstraints.CspConstraint;
import SDMLanguage.patterns.AttributeConstraints.CspConstraintVariableReference;
import SDMLanguage.patterns.AttributeConstraints.LiteralVariable;
import SDMLanguage.patterns.AttributeConstraints.PrimitiveVariable;

import SDMLanguage.patterns.PatternsPackage;

import SDMLanguage.patterns.impl.PatternsPackageImpl;

import SDMLanguage.patterns.patternExpressions.PatternExpressionsPackage;

import SDMLanguage.patterns.patternExpressions.impl.PatternExpressionsPackageImpl;

import SDMLanguage.sdmUtil.SdmUtilPackage;

import SDMLanguage.sdmUtil.impl.SdmUtilPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class AttributeConstraintsPackageImpl extends EPackageImpl implements AttributeConstraintsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeConstraintExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeConstraintVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeLookupConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cspConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cspConstraintVariableReferenceEClass = null;

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
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AttributeConstraintsPackageImpl() {
		super(eNS_URI, AttributeConstraintsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AttributeConstraintsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AttributeConstraintsPackage init() {
		if (isInited)
			return (AttributeConstraintsPackage) EPackage.Registry.INSTANCE
					.getEPackage(AttributeConstraintsPackage.eNS_URI);

		// Obtain or create and register package
		AttributeConstraintsPackageImpl theAttributeConstraintsPackage = (AttributeConstraintsPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof AttributeConstraintsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new AttributeConstraintsPackageImpl());

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
		PatternExpressionsPackageImpl thePatternExpressionsPackage = (PatternExpressionsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(PatternExpressionsPackage.eNS_URI) instanceof PatternExpressionsPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(PatternExpressionsPackage.eNS_URI)
						: PatternExpressionsPackage.eINSTANCE);

		// Create package meta-data objects
		theAttributeConstraintsPackage.createPackageContents();
		theSDMLanguagePackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theSdmUtilPackage.createPackageContents();
		theCallsPackage.createPackageContents();
		theCallExpressionsPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		thePatternsPackage.createPackageContents();
		thePatternExpressionsPackage.createPackageContents();

		// Initialize created meta-data
		theAttributeConstraintsPackage.initializePackageContents();
		theSDMLanguagePackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theSdmUtilPackage.initializePackageContents();
		theCallsPackage.initializePackageContents();
		theCallExpressionsPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		thePatternsPackage.initializePackageContents();
		thePatternExpressionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAttributeConstraintsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AttributeConstraintsPackage.eNS_URI, theAttributeConstraintsPackage);
		return theAttributeConstraintsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentConstraint() {
		return assignmentConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeConstraint() {
		return attributeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeConstraint_StoryPattern() {
		return (EReference) attributeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeConstraintExpression() {
		return attributeConstraintExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeConstraintExpression_TargetVariable() {
		return (EReference) attributeConstraintExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeConstraintExpression_ContainedVariables() {
		return (EReference) attributeConstraintExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeConstraintExpression_ContainedConstraints() {
		return (EReference) attributeConstraintExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttributeConstraintExpression__Compare__Expression() {
		return attributeConstraintExpressionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeConstraintVariable() {
		return attributeConstraintVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeConstraintVariable_StoryPattern() {
		return (EReference) attributeConstraintVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeConstraintVariable_AttributeValueConstraints() {
		return (EReference) attributeConstraintVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeConstraintVariable_Type() {
		return (EReference) attributeConstraintVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeConstraintVariable_Name() {
		return (EAttribute) attributeConstraintVariableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeLookupConstraint() {
		return attributeLookupConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValueConstraint() {
		return attributeValueConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueConstraint_Parameter() {
		return (EReference) attributeValueConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueConstraint_ObjectVariable() {
		return (EReference) attributeValueConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueConstraint_Type() {
		return (EReference) attributeValueConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCspConstraint() {
		return cspConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCspConstraint_Parameters() {
		return (EReference) cspConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCspConstraint_Name() {
		return (EAttribute) cspConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralVariable() {
		return literalVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveVariable() {
		return primitiveVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCspConstraintVariableReference() {
		return cspConstraintVariableReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCspConstraintVariableReference_CspConstraint() {
		return (EReference) cspConstraintVariableReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCspConstraintVariableReference_AttributeConstraintVariable() {
		return (EReference) cspConstraintVariableReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsFactory getAttributeConstraintsFactory() {
		return (AttributeConstraintsFactory) getEFactoryInstance();
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
		assignmentConstraintEClass = createEClass(ASSIGNMENT_CONSTRAINT);

		attributeConstraintEClass = createEClass(ATTRIBUTE_CONSTRAINT);
		createEReference(attributeConstraintEClass, ATTRIBUTE_CONSTRAINT__STORY_PATTERN);

		attributeConstraintExpressionEClass = createEClass(ATTRIBUTE_CONSTRAINT_EXPRESSION);
		createEReference(attributeConstraintExpressionEClass, ATTRIBUTE_CONSTRAINT_EXPRESSION__TARGET_VARIABLE);
		createEReference(attributeConstraintExpressionEClass, ATTRIBUTE_CONSTRAINT_EXPRESSION__CONTAINED_VARIABLES);
		createEReference(attributeConstraintExpressionEClass, ATTRIBUTE_CONSTRAINT_EXPRESSION__CONTAINED_CONSTRAINTS);
		createEOperation(attributeConstraintExpressionEClass, ATTRIBUTE_CONSTRAINT_EXPRESSION___COMPARE__EXPRESSION);

		attributeConstraintVariableEClass = createEClass(ATTRIBUTE_CONSTRAINT_VARIABLE);
		createEReference(attributeConstraintVariableEClass, ATTRIBUTE_CONSTRAINT_VARIABLE__STORY_PATTERN);
		createEReference(attributeConstraintVariableEClass, ATTRIBUTE_CONSTRAINT_VARIABLE__ATTRIBUTE_VALUE_CONSTRAINTS);
		createEReference(attributeConstraintVariableEClass, ATTRIBUTE_CONSTRAINT_VARIABLE__TYPE);
		createEAttribute(attributeConstraintVariableEClass, ATTRIBUTE_CONSTRAINT_VARIABLE__NAME);

		attributeLookupConstraintEClass = createEClass(ATTRIBUTE_LOOKUP_CONSTRAINT);

		attributeValueConstraintEClass = createEClass(ATTRIBUTE_VALUE_CONSTRAINT);
		createEReference(attributeValueConstraintEClass, ATTRIBUTE_VALUE_CONSTRAINT__PARAMETER);
		createEReference(attributeValueConstraintEClass, ATTRIBUTE_VALUE_CONSTRAINT__OBJECT_VARIABLE);
		createEReference(attributeValueConstraintEClass, ATTRIBUTE_VALUE_CONSTRAINT__TYPE);

		cspConstraintEClass = createEClass(CSP_CONSTRAINT);
		createEReference(cspConstraintEClass, CSP_CONSTRAINT__PARAMETERS);
		createEAttribute(cspConstraintEClass, CSP_CONSTRAINT__NAME);

		literalVariableEClass = createEClass(LITERAL_VARIABLE);

		primitiveVariableEClass = createEClass(PRIMITIVE_VARIABLE);

		cspConstraintVariableReferenceEClass = createEClass(CSP_CONSTRAINT_VARIABLE_REFERENCE);
		createEReference(cspConstraintVariableReferenceEClass, CSP_CONSTRAINT_VARIABLE_REFERENCE__CSP_CONSTRAINT);
		createEReference(cspConstraintVariableReferenceEClass,
				CSP_CONSTRAINT_VARIABLE_REFERENCE__ATTRIBUTE_CONSTRAINT_VARIABLE);
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
		PatternsPackage thePatternsPackage = (PatternsPackage) EPackage.Registry.INSTANCE
				.getEPackage(PatternsPackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ExpressionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		assignmentConstraintEClass.getESuperTypes().add(this.getAttributeValueConstraint());
		attributeConstraintExpressionEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		attributeLookupConstraintEClass.getESuperTypes().add(this.getAttributeValueConstraint());
		attributeValueConstraintEClass.getESuperTypes().add(this.getAttributeConstraint());
		cspConstraintEClass.getESuperTypes().add(this.getAttributeConstraint());
		literalVariableEClass.getESuperTypes().add(this.getAttributeConstraintVariable());
		primitiveVariableEClass.getESuperTypes().add(this.getAttributeConstraintVariable());

		// Initialize classes, features, and operations; add parameters
		initEClass(assignmentConstraintEClass, AssignmentConstraint.class, "AssignmentConstraint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeConstraintEClass, AttributeConstraint.class, "AttributeConstraint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeConstraint_StoryPattern(), thePatternsPackage.getStoryPattern(),
				thePatternsPackage.getStoryPattern_Constraints(), "storyPattern", null, 1, 1, AttributeConstraint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeConstraintExpressionEClass, AttributeConstraintExpression.class,
				"AttributeConstraintExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeConstraintExpression_TargetVariable(), this.getAttributeConstraintVariable(), null,
				"targetVariable", null, 1, 1, AttributeConstraintExpression.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeConstraintExpression_ContainedVariables(), this.getAttributeConstraintVariable(),
				null, "containedVariables", null, 0, -1, AttributeConstraintExpression.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAttributeConstraintExpression_ContainedConstraints(), this.getAttributeConstraint(), null,
				"containedConstraints", null, 0, -1, AttributeConstraintExpression.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getAttributeConstraintExpression__Compare__Expression(),
				ecorePackage.getEBoolean(), "compare", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theExpressionsPackage.getExpression(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(attributeConstraintVariableEClass, AttributeConstraintVariable.class, "AttributeConstraintVariable",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeConstraintVariable_StoryPattern(), thePatternsPackage.getStoryPattern(),
				thePatternsPackage.getStoryPattern_Variables(), "storyPattern", null, 0, 1,
				AttributeConstraintVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeConstraintVariable_AttributeValueConstraints(), this.getAttributeValueConstraint(),
				this.getAttributeValueConstraint_Parameter(), "attributeValueConstraints", null, 0, -1,
				AttributeConstraintVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeConstraintVariable_Type(), ecorePackage.getEDataType(), null, "type", null, 0, 1,
				AttributeConstraintVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeConstraintVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				AttributeConstraintVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeLookupConstraintEClass, AttributeLookupConstraint.class, "AttributeLookupConstraint",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeValueConstraintEClass, AttributeValueConstraint.class, "AttributeValueConstraint",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeValueConstraint_Parameter(), this.getAttributeConstraintVariable(),
				this.getAttributeConstraintVariable_AttributeValueConstraints(), "parameter", null, 0, 1,
				AttributeValueConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeValueConstraint_ObjectVariable(), thePatternsPackage.getObjectVariable(), null,
				"objectVariable", null, 0, 1, AttributeValueConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeValueConstraint_Type(), ecorePackage.getEAttribute(), null, "type", null, 0, 1,
				AttributeValueConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cspConstraintEClass, CspConstraint.class, "CspConstraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCspConstraint_Parameters(), this.getCspConstraintVariableReference(),
				this.getCspConstraintVariableReference_CspConstraint(), "parameters", null, 0, -1, CspConstraint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCspConstraint_Name(), ecorePackage.getEString(), "name", null, 1, 1, CspConstraint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(literalVariableEClass, LiteralVariable.class, "LiteralVariable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveVariableEClass, PrimitiveVariable.class, "PrimitiveVariable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(cspConstraintVariableReferenceEClass, CspConstraintVariableReference.class,
				"CspConstraintVariableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCspConstraintVariableReference_CspConstraint(), this.getCspConstraint(),
				this.getCspConstraint_Parameters(), "cspConstraint", null, 0, 1, CspConstraintVariableReference.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCspConstraintVariableReference_AttributeConstraintVariable(),
				this.getAttributeConstraintVariable(), null, "attributeConstraintVariable", null, 0, 1,
				CspConstraintVariableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //AttributeConstraintsPackageImpl
