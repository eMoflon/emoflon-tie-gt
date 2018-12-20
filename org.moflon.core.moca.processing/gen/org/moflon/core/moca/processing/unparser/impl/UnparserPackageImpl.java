/**
 */
package org.moflon.core.moca.processing.unparser.impl;

import MocaTree.MocaTreePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.moflon.core.moca.processing.ProcessingPackage;

import org.moflon.core.moca.processing.compare.ComparePackage;

import org.moflon.core.moca.processing.compare.impl.ComparePackageImpl;

import org.moflon.core.moca.processing.impl.ProcessingPackageImpl;

import org.moflon.core.moca.processing.parser.ParserPackage;

import org.moflon.core.moca.processing.parser.impl.ParserPackageImpl;

import org.moflon.core.moca.processing.unparser.TemplateUnparser;
import org.moflon.core.moca.processing.unparser.Unparser;
import org.moflon.core.moca.processing.unparser.UnparserFactory;
import org.moflon.core.moca.processing.unparser.UnparserPackage;
import org.moflon.core.moca.processing.unparser.XMLUnparser;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnparserPackageImpl extends EPackageImpl implements UnparserPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateUnparserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unparserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlUnparserEClass = null;

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
	 * @see org.moflon.core.moca.processing.unparser.UnparserPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UnparserPackageImpl() {
		super(eNS_URI, UnparserFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UnparserPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UnparserPackage init() {
		if (isInited)
			return (UnparserPackage) EPackage.Registry.INSTANCE.getEPackage(UnparserPackage.eNS_URI);

		// Obtain or create and register package
		UnparserPackageImpl theUnparserPackage = (UnparserPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof UnparserPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new UnparserPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MocaTreePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ProcessingPackageImpl theProcessingPackage = (ProcessingPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ProcessingPackage.eNS_URI) instanceof ProcessingPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ProcessingPackage.eNS_URI)
						: ProcessingPackage.eINSTANCE);
		ComparePackageImpl theComparePackage = (ComparePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ComparePackage.eNS_URI) instanceof ComparePackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ComparePackage.eNS_URI)
						: ComparePackage.eINSTANCE);
		ParserPackageImpl theParserPackage = (ParserPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ParserPackage.eNS_URI) instanceof ParserPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ParserPackage.eNS_URI)
						: ParserPackage.eINSTANCE);

		// Create package meta-data objects
		theUnparserPackage.createPackageContents();
		theProcessingPackage.createPackageContents();
		theComparePackage.createPackageContents();
		theParserPackage.createPackageContents();

		// Initialize created meta-data
		theUnparserPackage.initializePackageContents();
		theProcessingPackage.initializePackageContents();
		theComparePackage.initializePackageContents();
		theParserPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUnparserPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UnparserPackage.eNS_URI, theUnparserPackage);
		return theUnparserPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateUnparser() {
		return templateUnparserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateUnparser__Unparse__Node() {
		return templateUnparserEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateUnparser__CanUnparseFile__String() {
		return templateUnparserEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnparser() {
		return unparserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnparser_CodeAdapter() {
		return (EReference) unparserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnparser__Unparse__Node() {
		return unparserEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnparser__CanUnparseFile__String() {
		return unparserEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMLUnparser() {
		return xmlUnparserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXMLUnparser__Unparse__Node() {
		return xmlUnparserEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXMLUnparser__CanUnparseFile__String() {
		return xmlUnparserEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnparserFactory getUnparserFactory() {
		return (UnparserFactory) getEFactoryInstance();
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
		templateUnparserEClass = createEClass(TEMPLATE_UNPARSER);
		createEOperation(templateUnparserEClass, TEMPLATE_UNPARSER___UNPARSE__NODE);
		createEOperation(templateUnparserEClass, TEMPLATE_UNPARSER___CAN_UNPARSE_FILE__STRING);

		unparserEClass = createEClass(UNPARSER);
		createEReference(unparserEClass, UNPARSER__CODE_ADAPTER);
		createEOperation(unparserEClass, UNPARSER___UNPARSE__NODE);
		createEOperation(unparserEClass, UNPARSER___CAN_UNPARSE_FILE__STRING);

		xmlUnparserEClass = createEClass(XML_UNPARSER);
		createEOperation(xmlUnparserEClass, XML_UNPARSER___UNPARSE__NODE);
		createEOperation(xmlUnparserEClass, XML_UNPARSER___CAN_UNPARSE_FILE__STRING);
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
		ProcessingPackage theProcessingPackage = (ProcessingPackage) EPackage.Registry.INSTANCE
				.getEPackage(ProcessingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		templateUnparserEClass.getESuperTypes().add(this.getUnparser());
		xmlUnparserEClass.getESuperTypes().add(this.getTemplateUnparser());

		// Initialize classes, features, and operations; add parameters
		initEClass(templateUnparserEClass, TemplateUnparser.class, "TemplateUnparser", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getTemplateUnparser__Unparse__Node(), ecorePackage.getEString(), "unparse", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMocaTreePackage.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTemplateUnparser__CanUnparseFile__String(), ecorePackage.getEBoolean(), "canUnparseFile",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fileName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(unparserEClass, Unparser.class, "Unparser", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnparser_CodeAdapter(), theProcessingPackage.getCodeAdapter(),
				theProcessingPackage.getCodeAdapter_Unparser(), "codeAdapter", null, 1, 1, Unparser.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getUnparser__Unparse__Node(), ecorePackage.getEString(), "unparse", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theMocaTreePackage.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUnparser__CanUnparseFile__String(), ecorePackage.getEBoolean(), "canUnparseFile", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fileName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(xmlUnparserEClass, XMLUnparser.class, "XMLUnparser", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getXMLUnparser__Unparse__Node(), ecorePackage.getEString(), "unparse", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theMocaTreePackage.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXMLUnparser__CanUnparseFile__String(), ecorePackage.getEBoolean(), "canUnparseFile", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fileName", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //UnparserPackageImpl
