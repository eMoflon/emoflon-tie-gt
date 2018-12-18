/**
 */
package org.moflon.core.moca.processing.parser.impl;

import MocaTree.MocaTreePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.moflon.core.moca.processing.ProcessingPackage;

import org.moflon.core.moca.processing.compare.ComparePackage;

import org.moflon.core.moca.processing.compare.impl.ComparePackageImpl;

import org.moflon.core.moca.processing.impl.ProcessingPackageImpl;

import org.moflon.core.moca.processing.parser.Parser;
import org.moflon.core.moca.processing.parser.ParserFactory;
import org.moflon.core.moca.processing.parser.ParserPackage;
import org.moflon.core.moca.processing.parser.XMLParser;

import org.moflon.core.moca.processing.unparser.UnparserPackage;

import org.moflon.core.moca.processing.unparser.impl.UnparserPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParserPackageImpl extends EPackageImpl implements ParserPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlParserEClass = null;

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
	 * @see org.moflon.core.moca.processing.parser.ParserPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ParserPackageImpl() {
		super(eNS_URI, ParserFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ParserPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ParserPackage init() {
		if (isInited)
			return (ParserPackage) EPackage.Registry.INSTANCE.getEPackage(ParserPackage.eNS_URI);

		// Obtain or create and register package
		ParserPackageImpl theParserPackage = (ParserPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ParserPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ParserPackageImpl());

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
		UnparserPackageImpl theUnparserPackage = (UnparserPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(UnparserPackage.eNS_URI) instanceof UnparserPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(UnparserPackage.eNS_URI)
						: UnparserPackage.eINSTANCE);

		// Create package meta-data objects
		theParserPackage.createPackageContents();
		theProcessingPackage.createPackageContents();
		theComparePackage.createPackageContents();
		theUnparserPackage.createPackageContents();

		// Initialize created meta-data
		theParserPackage.initializePackageContents();
		theProcessingPackage.initializePackageContents();
		theComparePackage.initializePackageContents();
		theUnparserPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theParserPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ParserPackage.eNS_URI, theParserPackage);
		return theParserPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParser() {
		return parserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParser_CodeAdapter() {
		return (EReference) parserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParser__CanParseFile__String() {
		return parserEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParser__Parse__Reader() {
		return parserEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParser__Parse__File_Reader() {
		return parserEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMLParser() {
		return xmlParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLParser_IgnoreWhitespaces() {
		return (EAttribute) xmlParserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXMLParser__CanParseFile__String() {
		return xmlParserEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXMLParser__Parse__Reader() {
		return xmlParserEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParserFactory getParserFactory() {
		return (ParserFactory) getEFactoryInstance();
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
		parserEClass = createEClass(PARSER);
		createEReference(parserEClass, PARSER__CODE_ADAPTER);
		createEOperation(parserEClass, PARSER___CAN_PARSE_FILE__STRING);
		createEOperation(parserEClass, PARSER___PARSE__READER);
		createEOperation(parserEClass, PARSER___PARSE__FILE_READER);

		xmlParserEClass = createEClass(XML_PARSER);
		createEAttribute(xmlParserEClass, XML_PARSER__IGNORE_WHITESPACES);
		createEOperation(xmlParserEClass, XML_PARSER___CAN_PARSE_FILE__STRING);
		createEOperation(xmlParserEClass, XML_PARSER___PARSE__READER);
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
		ProcessingPackage theProcessingPackage = (ProcessingPackage) EPackage.Registry.INSTANCE
				.getEPackage(ProcessingPackage.eNS_URI);
		MocaTreePackage theMocaTreePackage = (MocaTreePackage) EPackage.Registry.INSTANCE
				.getEPackage(MocaTreePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		xmlParserEClass.getESuperTypes().add(this.getParser());

		// Initialize classes, features, and operations; add parameters
		initEClass(parserEClass, Parser.class, "Parser", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParser_CodeAdapter(), theProcessingPackage.getCodeAdapter(),
				theProcessingPackage.getCodeAdapter_Parser(), "codeAdapter", null, 1, 1, Parser.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		EOperation op = initEOperation(getParser__CanParseFile__String(), ecorePackage.getEBoolean(), "canParseFile", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fileName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParser__Parse__Reader(), theMocaTreePackage.getNode(), "parse", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theProcessingPackage.getReader(), "reader", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParser__Parse__File_Reader(), theMocaTreePackage.getNode(), "parse", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theProcessingPackage.getFile(), "file", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theProcessingPackage.getReader(), "reader", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(xmlParserEClass, XMLParser.class, "XMLParser", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXMLParser_IgnoreWhitespaces(), ecorePackage.getEBoolean(), "ignoreWhitespaces", "true", 1, 1,
				XMLParser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getXMLParser__CanParseFile__String(), ecorePackage.getEBoolean(), "canParseFile", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fileName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXMLParser__Parse__Reader(), theMocaTreePackage.getNode(), "parse", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theProcessingPackage.getReader(), "reader", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //ParserPackageImpl
