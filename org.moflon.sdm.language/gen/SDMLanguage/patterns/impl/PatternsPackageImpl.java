/**
 */
package SDMLanguage.patterns.impl;

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

import SDMLanguage.patterns.ApplicationConditionStoryPattern;
import SDMLanguage.patterns.AttributeAssignment;

import SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage;

import SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintsPackageImpl;

import SDMLanguage.patterns.BindingOperator;
import SDMLanguage.patterns.BindingSemantics;
import SDMLanguage.patterns.BindingState;
import SDMLanguage.patterns.Constraint;
import SDMLanguage.patterns.LinkVariable;
import SDMLanguage.patterns.ObjectVariable;
import SDMLanguage.patterns.PatternsFactory;
import SDMLanguage.patterns.PatternsPackage;
import SDMLanguage.patterns.StoryPattern;

import SDMLanguage.patterns.patternExpressions.PatternExpressionsPackage;

import SDMLanguage.patterns.patternExpressions.impl.PatternExpressionsPackageImpl;

import SDMLanguage.sdmUtil.SdmUtilPackage;

import SDMLanguage.sdmUtil.impl.SdmUtilPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternsPackageImpl extends EPackageImpl implements PatternsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationConditionStoryPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storyPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bindingOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bindingSemanticsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bindingStateEEnum = null;

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
	 * @see SDMLanguage.patterns.PatternsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PatternsPackageImpl() {
		super(eNS_URI, PatternsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PatternsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PatternsPackage init() {
		if (isInited)
			return (PatternsPackage) EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI);

		// Obtain or create and register package
		PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof PatternsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new PatternsPackageImpl());

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
		AttributeConstraintsPackageImpl theAttributeConstraintsPackage = (AttributeConstraintsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(AttributeConstraintsPackage.eNS_URI) instanceof AttributeConstraintsPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(AttributeConstraintsPackage.eNS_URI)
						: AttributeConstraintsPackage.eINSTANCE);
		PatternExpressionsPackageImpl thePatternExpressionsPackage = (PatternExpressionsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(PatternExpressionsPackage.eNS_URI) instanceof PatternExpressionsPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(PatternExpressionsPackage.eNS_URI)
						: PatternExpressionsPackage.eINSTANCE);

		// Create package meta-data objects
		thePatternsPackage.createPackageContents();
		theSDMLanguagePackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theSdmUtilPackage.createPackageContents();
		theCallsPackage.createPackageContents();
		theCallExpressionsPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theAttributeConstraintsPackage.createPackageContents();
		thePatternExpressionsPackage.createPackageContents();

		// Initialize created meta-data
		thePatternsPackage.initializePackageContents();
		theSDMLanguagePackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theSdmUtilPackage.initializePackageContents();
		theCallsPackage.initializePackageContents();
		theCallExpressionsPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theAttributeConstraintsPackage.initializePackageContents();
		thePatternExpressionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePatternsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PatternsPackage.eNS_URI, thePatternsPackage);
		return thePatternsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationConditionStoryPattern() {
		return applicationConditionStoryPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationConditionStoryPattern_StoryPattern() {
		return (EReference) applicationConditionStoryPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeAssignment() {
		return attributeAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeAssignment_ObjectVariable() {
		return (EReference) attributeAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeAssignment_ValueExpression() {
		return (EReference) attributeAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeAssignment_Attribute() {
		return (EReference) attributeAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_ConstraintExpression() {
		return (EReference) constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_ObjectVariable() {
		return (EReference) constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkVariable() {
		return linkVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkVariable_Target() {
		return (EReference) linkVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkVariable_Source() {
		return (EReference) linkVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkVariable_Pattern() {
		return (EReference) linkVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkVariable_Type() {
		return (EReference) linkVariableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkVariable_BindingOperator() {
		return (EAttribute) linkVariableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkVariable_BindingSemantics() {
		return (EAttribute) linkVariableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectVariable() {
		return objectVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectVariable_Constraint() {
		return (EReference) objectVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectVariable_BindingExpression() {
		return (EReference) objectVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectVariable_Pattern() {
		return (EReference) objectVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectVariable_IncomingLink() {
		return (EReference) objectVariableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectVariable_OutgoingLink() {
		return (EReference) objectVariableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectVariable_AttributeAssignment() {
		return (EReference) objectVariableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectVariable_BindingOperator() {
		return (EAttribute) objectVariableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectVariable_BindingSemantics() {
		return (EAttribute) objectVariableEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectVariable_BindingState() {
		return (EAttribute) objectVariableEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoryPattern() {
		return storyPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryPattern_ObjectVariable() {
		return (EReference) storyPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryPattern_LinkVariable() {
		return (EReference) storyPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryPattern_Constraints() {
		return (EReference) storyPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryPattern_Variables() {
		return (EReference) storyPatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryPattern_ApplicationConditions() {
		return (EReference) storyPatternEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStoryPattern_StoryNode() {
		return (EReference) storyPatternEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBindingOperator() {
		return bindingOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBindingSemantics() {
		return bindingSemanticsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBindingState() {
		return bindingStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternsFactory getPatternsFactory() {
		return (PatternsFactory) getEFactoryInstance();
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
		applicationConditionStoryPatternEClass = createEClass(APPLICATION_CONDITION_STORY_PATTERN);
		createEReference(applicationConditionStoryPatternEClass, APPLICATION_CONDITION_STORY_PATTERN__STORY_PATTERN);

		attributeAssignmentEClass = createEClass(ATTRIBUTE_ASSIGNMENT);
		createEReference(attributeAssignmentEClass, ATTRIBUTE_ASSIGNMENT__OBJECT_VARIABLE);
		createEReference(attributeAssignmentEClass, ATTRIBUTE_ASSIGNMENT__VALUE_EXPRESSION);
		createEReference(attributeAssignmentEClass, ATTRIBUTE_ASSIGNMENT__ATTRIBUTE);

		constraintEClass = createEClass(CONSTRAINT);
		createEReference(constraintEClass, CONSTRAINT__CONSTRAINT_EXPRESSION);
		createEReference(constraintEClass, CONSTRAINT__OBJECT_VARIABLE);

		linkVariableEClass = createEClass(LINK_VARIABLE);
		createEReference(linkVariableEClass, LINK_VARIABLE__TARGET);
		createEReference(linkVariableEClass, LINK_VARIABLE__SOURCE);
		createEReference(linkVariableEClass, LINK_VARIABLE__PATTERN);
		createEReference(linkVariableEClass, LINK_VARIABLE__TYPE);
		createEAttribute(linkVariableEClass, LINK_VARIABLE__BINDING_OPERATOR);
		createEAttribute(linkVariableEClass, LINK_VARIABLE__BINDING_SEMANTICS);

		objectVariableEClass = createEClass(OBJECT_VARIABLE);
		createEReference(objectVariableEClass, OBJECT_VARIABLE__CONSTRAINT);
		createEReference(objectVariableEClass, OBJECT_VARIABLE__BINDING_EXPRESSION);
		createEReference(objectVariableEClass, OBJECT_VARIABLE__PATTERN);
		createEReference(objectVariableEClass, OBJECT_VARIABLE__INCOMING_LINK);
		createEReference(objectVariableEClass, OBJECT_VARIABLE__OUTGOING_LINK);
		createEReference(objectVariableEClass, OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT);
		createEAttribute(objectVariableEClass, OBJECT_VARIABLE__BINDING_OPERATOR);
		createEAttribute(objectVariableEClass, OBJECT_VARIABLE__BINDING_SEMANTICS);
		createEAttribute(objectVariableEClass, OBJECT_VARIABLE__BINDING_STATE);

		storyPatternEClass = createEClass(STORY_PATTERN);
		createEReference(storyPatternEClass, STORY_PATTERN__OBJECT_VARIABLE);
		createEReference(storyPatternEClass, STORY_PATTERN__LINK_VARIABLE);
		createEReference(storyPatternEClass, STORY_PATTERN__CONSTRAINTS);
		createEReference(storyPatternEClass, STORY_PATTERN__VARIABLES);
		createEReference(storyPatternEClass, STORY_PATTERN__APPLICATION_CONDITIONS);
		createEReference(storyPatternEClass, STORY_PATTERN__STORY_NODE);

		// Create enums
		bindingOperatorEEnum = createEEnum(BINDING_OPERATOR);
		bindingSemanticsEEnum = createEEnum(BINDING_SEMANTICS);
		bindingStateEEnum = createEEnum(BINDING_STATE);
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
		AttributeConstraintsPackage theAttributeConstraintsPackage = (AttributeConstraintsPackage) EPackage.Registry.INSTANCE
				.getEPackage(AttributeConstraintsPackage.eNS_URI);
		PatternExpressionsPackage thePatternExpressionsPackage = (PatternExpressionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(PatternExpressionsPackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ExpressionsPackage.eNS_URI);
		SDMLanguagePackage theSDMLanguagePackage = (SDMLanguagePackage) EPackage.Registry.INSTANCE
				.getEPackage(SDMLanguagePackage.eNS_URI);
		ActivitiesPackage theActivitiesPackage = (ActivitiesPackage) EPackage.Registry.INSTANCE
				.getEPackage(ActivitiesPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theAttributeConstraintsPackage);
		getESubpackages().add(thePatternExpressionsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		applicationConditionStoryPatternEClass.getESuperTypes().add(this.getStoryPattern());
		linkVariableEClass.getESuperTypes().add(theSDMLanguagePackage.getNamedElement());
		objectVariableEClass.getESuperTypes().add(theSDMLanguagePackage.getTypedElement());
		objectVariableEClass.getESuperTypes().add(theSDMLanguagePackage.getNamedElement());
		storyPatternEClass.getESuperTypes().add(theSDMLanguagePackage.getCommentableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(applicationConditionStoryPatternEClass, ApplicationConditionStoryPattern.class,
				"ApplicationConditionStoryPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationConditionStoryPattern_StoryPattern(), this.getStoryPattern(),
				this.getStoryPattern_ApplicationConditions(), "storyPattern", null, 1, 1,
				ApplicationConditionStoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeAssignmentEClass, AttributeAssignment.class, "AttributeAssignment", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeAssignment_ObjectVariable(), this.getObjectVariable(),
				this.getObjectVariable_AttributeAssignment(), "objectVariable", null, 1, 1, AttributeAssignment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeAssignment_ValueExpression(), theExpressionsPackage.getExpression(), null,
				"valueExpression", null, 1, 1, AttributeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeAssignment_Attribute(), ecorePackage.getEAttribute(), null, "attribute", null, 1, 1,
				AttributeAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraint_ConstraintExpression(), theExpressionsPackage.getExpression(), null,
				"constraintExpression", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_ObjectVariable(), this.getObjectVariable(), this.getObjectVariable_Constraint(),
				"objectVariable", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkVariableEClass, LinkVariable.class, "LinkVariable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkVariable_Target(), this.getObjectVariable(), this.getObjectVariable_IncomingLink(),
				"target", null, 1, 1, LinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkVariable_Source(), this.getObjectVariable(), this.getObjectVariable_OutgoingLink(),
				"source", null, 1, 1, LinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkVariable_Pattern(), this.getStoryPattern(), this.getStoryPattern_LinkVariable(),
				"pattern", null, 1, 1, LinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkVariable_Type(), ecorePackage.getEReference(), null, "type", null, 0, 1,
				LinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkVariable_BindingOperator(), this.getBindingOperator(), "bindingOperator", null, 1, 1,
				LinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLinkVariable_BindingSemantics(), this.getBindingSemantics(), "bindingSemantics", null, 1, 1,
				LinkVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(objectVariableEClass, ObjectVariable.class, "ObjectVariable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectVariable_Constraint(), this.getConstraint(), this.getConstraint_ObjectVariable(),
				"constraint", null, 0, -1, ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectVariable_BindingExpression(), theExpressionsPackage.getExpression(), null,
				"bindingExpression", null, 0, 1, ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectVariable_Pattern(), this.getStoryPattern(), this.getStoryPattern_ObjectVariable(),
				"pattern", null, 1, 1, ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectVariable_IncomingLink(), this.getLinkVariable(), this.getLinkVariable_Target(),
				"incomingLink", null, 0, -1, ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectVariable_OutgoingLink(), this.getLinkVariable(), this.getLinkVariable_Source(),
				"outgoingLink", null, 0, -1, ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectVariable_AttributeAssignment(), this.getAttributeAssignment(),
				this.getAttributeAssignment_ObjectVariable(), "attributeAssignment", null, 0, -1, ObjectVariable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectVariable_BindingOperator(), this.getBindingOperator(), "bindingOperator", null, 1, 1,
				ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getObjectVariable_BindingSemantics(), this.getBindingSemantics(), "bindingSemantics", null, 1, 1,
				ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getObjectVariable_BindingState(), this.getBindingState(), "bindingState", null, 1, 1,
				ObjectVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(storyPatternEClass, StoryPattern.class, "StoryPattern", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStoryPattern_ObjectVariable(), this.getObjectVariable(), this.getObjectVariable_Pattern(),
				"objectVariable", null, 0, -1, StoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStoryPattern_LinkVariable(), this.getLinkVariable(), this.getLinkVariable_Pattern(),
				"linkVariable", null, 0, -1, StoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStoryPattern_Constraints(), theAttributeConstraintsPackage.getAttributeConstraint(),
				theAttributeConstraintsPackage.getAttributeConstraint_StoryPattern(), "constraints", null, 0, -1,
				StoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStoryPattern_Variables(), theAttributeConstraintsPackage.getAttributeConstraintVariable(),
				theAttributeConstraintsPackage.getAttributeConstraintVariable_StoryPattern(), "variables", null, 0, -1,
				StoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStoryPattern_ApplicationConditions(), this.getApplicationConditionStoryPattern(),
				this.getApplicationConditionStoryPattern_StoryPattern(), "applicationConditions", null, 0, -1,
				StoryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStoryPattern_StoryNode(), theActivitiesPackage.getStoryNode(),
				theActivitiesPackage.getStoryNode_StoryPattern(), "storyNode", null, 1, 1, StoryPattern.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(bindingOperatorEEnum, BindingOperator.class, "BindingOperator");
		addEEnumLiteral(bindingOperatorEEnum, BindingOperator.CHECK_ONLY);
		addEEnumLiteral(bindingOperatorEEnum, BindingOperator.CREATE);
		addEEnumLiteral(bindingOperatorEEnum, BindingOperator.DESTROY);

		initEEnum(bindingSemanticsEEnum, BindingSemantics.class, "BindingSemantics");
		addEEnumLiteral(bindingSemanticsEEnum, BindingSemantics.MANDATORY);
		addEEnumLiteral(bindingSemanticsEEnum, BindingSemantics.OPTIONAL);
		addEEnumLiteral(bindingSemanticsEEnum, BindingSemantics.NEGATIVE);

		initEEnum(bindingStateEEnum, BindingState.class, "BindingState");
		addEEnumLiteral(bindingStateEEnum, BindingState.UNBOUND);
		addEEnumLiteral(bindingStateEEnum, BindingState.BOUND);
	}

} //PatternsPackageImpl
