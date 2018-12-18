/**
 */
package org.moflon.core.moca.processing.impl;

import MocaTree.MocaTreePackage;

import java.io.File;
import java.io.Reader;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.moflon.core.moca.processing.CodeAdapter;
import org.moflon.core.moca.processing.Problem;
import org.moflon.core.moca.processing.ProblemType;
import org.moflon.core.moca.processing.ProcessingFactory;
import org.moflon.core.moca.processing.ProcessingPackage;

import org.moflon.core.moca.processing.compare.ComparePackage;

import org.moflon.core.moca.processing.compare.impl.ComparePackageImpl;

import org.moflon.core.moca.processing.parser.ParserPackage;

import org.moflon.core.moca.processing.parser.impl.ParserPackageImpl;

import org.moflon.core.moca.processing.unparser.UnparserPackage;

import org.moflon.core.moca.processing.unparser.impl.UnparserPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessingPackageImpl extends EPackageImpl implements ProcessingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeAdapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum problemTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType directoryEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fileEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType readerEDataType = null;

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
	 * @see org.moflon.core.moca.processing.ProcessingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProcessingPackageImpl() {
		super(eNS_URI, ProcessingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ProcessingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProcessingPackage init() {
		if (isInited)
			return (ProcessingPackage) EPackage.Registry.INSTANCE.getEPackage(ProcessingPackage.eNS_URI);

		// Obtain or create and register package
		ProcessingPackageImpl theProcessingPackage = (ProcessingPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ProcessingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ProcessingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MocaTreePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ComparePackageImpl theComparePackage = (ComparePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ComparePackage.eNS_URI) instanceof ComparePackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ComparePackage.eNS_URI)
						: ComparePackage.eINSTANCE);
		ParserPackageImpl theParserPackage = (ParserPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ParserPackage.eNS_URI) instanceof ParserPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ParserPackage.eNS_URI)
						: ParserPackage.eINSTANCE);
		UnparserPackageImpl theUnparserPackage = (UnparserPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(UnparserPackage.eNS_URI) instanceof UnparserPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(UnparserPackage.eNS_URI)
						: UnparserPackage.eINSTANCE);

		// Create package meta-data objects
		theProcessingPackage.createPackageContents();
		theComparePackage.createPackageContents();
		theParserPackage.createPackageContents();
		theUnparserPackage.createPackageContents();

		// Initialize created meta-data
		theProcessingPackage.initializePackageContents();
		theComparePackage.initializePackageContents();
		theParserPackage.initializePackageContents();
		theUnparserPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProcessingPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProcessingPackage.eNS_URI, theProcessingPackage);
		return theProcessingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeAdapter() {
		return codeAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeAdapter_Unparser() {
		return (EReference) codeAdapterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeAdapter_Problems() {
		return (EReference) codeAdapterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeAdapter_Parser() {
		return (EReference) codeAdapterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCodeAdapter__Parse__File() {
		return codeAdapterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCodeAdapter__Unparse__String_Folder() {
		return codeAdapterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCodeAdapter__ParseFile__File_Folder() {
		return codeAdapterEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCodeAdapter__UnparseFile__File_File() {
		return codeAdapterEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblem() {
		return problemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProblem_CodeAdapter() {
		return (EReference) problemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProblem_CharacterPositionEnd() {
		return (EAttribute) problemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProblem_CharacterPositionStart() {
		return (EAttribute) problemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProblem_Line() {
		return (EAttribute) problemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProblem_Message() {
		return (EAttribute) problemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProblem_Source() {
		return (EAttribute) problemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProblem_Type() {
		return (EAttribute) problemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProblemType() {
		return problemTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDirectory() {
		return directoryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFile() {
		return fileEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getReader() {
		return readerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingFactory getProcessingFactory() {
		return (ProcessingFactory) getEFactoryInstance();
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
		codeAdapterEClass = createEClass(CODE_ADAPTER);
		createEReference(codeAdapterEClass, CODE_ADAPTER__UNPARSER);
		createEReference(codeAdapterEClass, CODE_ADAPTER__PROBLEMS);
		createEReference(codeAdapterEClass, CODE_ADAPTER__PARSER);
		createEOperation(codeAdapterEClass, CODE_ADAPTER___PARSE__FILE);
		createEOperation(codeAdapterEClass, CODE_ADAPTER___UNPARSE__STRING_FOLDER);
		createEOperation(codeAdapterEClass, CODE_ADAPTER___PARSE_FILE__FILE_FOLDER);
		createEOperation(codeAdapterEClass, CODE_ADAPTER___UNPARSE_FILE__FILE_FILE);

		problemEClass = createEClass(PROBLEM);
		createEReference(problemEClass, PROBLEM__CODE_ADAPTER);
		createEAttribute(problemEClass, PROBLEM__CHARACTER_POSITION_END);
		createEAttribute(problemEClass, PROBLEM__CHARACTER_POSITION_START);
		createEAttribute(problemEClass, PROBLEM__LINE);
		createEAttribute(problemEClass, PROBLEM__MESSAGE);
		createEAttribute(problemEClass, PROBLEM__SOURCE);
		createEAttribute(problemEClass, PROBLEM__TYPE);

		// Create enums
		problemTypeEEnum = createEEnum(PROBLEM_TYPE);

		// Create data types
		directoryEDataType = createEDataType(DIRECTORY);
		fileEDataType = createEDataType(FILE);
		readerEDataType = createEDataType(READER);
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
		ComparePackage theComparePackage = (ComparePackage) EPackage.Registry.INSTANCE
				.getEPackage(ComparePackage.eNS_URI);
		ParserPackage theParserPackage = (ParserPackage) EPackage.Registry.INSTANCE.getEPackage(ParserPackage.eNS_URI);
		UnparserPackage theUnparserPackage = (UnparserPackage) EPackage.Registry.INSTANCE
				.getEPackage(UnparserPackage.eNS_URI);
		MocaTreePackage theMocaTreePackage = (MocaTreePackage) EPackage.Registry.INSTANCE
				.getEPackage(MocaTreePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theComparePackage);
		getESubpackages().add(theParserPackage);
		getESubpackages().add(theUnparserPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(codeAdapterEClass, CodeAdapter.class, "CodeAdapter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodeAdapter_Unparser(), theUnparserPackage.getUnparser(),
				theUnparserPackage.getUnparser_CodeAdapter(), "unparser", null, 0, -1, CodeAdapter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCodeAdapter_Problems(), this.getProblem(), this.getProblem_CodeAdapter(), "problems", null, 0,
				-1, CodeAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeAdapter_Parser(), theParserPackage.getParser(), theParserPackage.getParser_CodeAdapter(),
				"parser", null, 0, -1, CodeAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getCodeAdapter__Parse__File(), theMocaTreePackage.getFolder(), "parse", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDirectory(), "dir", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCodeAdapter__Unparse__String_Folder(), this.getDirectory(), "unparse", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMocaTreePackage.getFolder(), "folder", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCodeAdapter__ParseFile__File_Folder(), theMocaTreePackage.getFile(), "parseFile", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDirectory(), "file", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMocaTreePackage.getFolder(), "parent", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCodeAdapter__UnparseFile__File_File(), null, "unparseFile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMocaTreePackage.getFile(), "eFile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDirectory(), "dir", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(problemEClass, Problem.class, "Problem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProblem_CodeAdapter(), this.getCodeAdapter(), this.getCodeAdapter_Problems(), "codeAdapter",
				null, 1, 1, Problem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProblem_CharacterPositionEnd(), ecorePackage.getEInt(), "characterPositionEnd", null, 1, 1,
				Problem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProblem_CharacterPositionStart(), ecorePackage.getEInt(), "characterPositionStart", null, 1,
				1, Problem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProblem_Line(), ecorePackage.getEInt(), "line", null, 1, 1, Problem.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProblem_Message(), ecorePackage.getEString(), "message", null, 1, 1, Problem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getProblem_Source(), ecorePackage.getEString(), "source", null, 1, 1, Problem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getProblem_Type(), this.getProblemType(), "type", null, 1, 1, Problem.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(problemTypeEEnum, ProblemType.class, "ProblemType");
		addEEnumLiteral(problemTypeEEnum, ProblemType.ERROR);
		addEEnumLiteral(problemTypeEEnum, ProblemType.WARNING);
		addEEnumLiteral(problemTypeEEnum, ProblemType.INFO);

		// Initialize data types
		initEDataType(directoryEDataType, File.class, "Directory", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fileEDataType, File.class, "File", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(readerEDataType, Reader.class, "Reader", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ProcessingPackageImpl
