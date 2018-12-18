/**
 */
package org.moflon.core.moca.processing.compare.impl;

import MocaTree.MocaTreePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.moflon.core.moca.processing.ProcessingPackage;

import org.moflon.core.moca.processing.compare.Addition;
import org.moflon.core.moca.processing.compare.CompareFactory;
import org.moflon.core.moca.processing.compare.ComparePackage;
import org.moflon.core.moca.processing.compare.Deletion;
import org.moflon.core.moca.processing.compare.MocaCompare;
import org.moflon.core.moca.processing.compare.MocaDiff;

import org.moflon.core.moca.processing.impl.ProcessingPackageImpl;

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
public class ComparePackageImpl extends EPackageImpl implements ComparePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deletionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mocaCompareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mocaDiffEClass = null;

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
	 * @see org.moflon.core.moca.processing.compare.ComparePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComparePackageImpl() {
		super(eNS_URI, CompareFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComparePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComparePackage init() {
		if (isInited)
			return (ComparePackage) EPackage.Registry.INSTANCE.getEPackage(ComparePackage.eNS_URI);

		// Obtain or create and register package
		ComparePackageImpl theComparePackage = (ComparePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ComparePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ComparePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MocaTreePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ProcessingPackageImpl theProcessingPackage = (ProcessingPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ProcessingPackage.eNS_URI) instanceof ProcessingPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ProcessingPackage.eNS_URI)
						: ProcessingPackage.eINSTANCE);
		ParserPackageImpl theParserPackage = (ParserPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ParserPackage.eNS_URI) instanceof ParserPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ParserPackage.eNS_URI)
						: ParserPackage.eINSTANCE);
		UnparserPackageImpl theUnparserPackage = (UnparserPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(UnparserPackage.eNS_URI) instanceof UnparserPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(UnparserPackage.eNS_URI)
						: UnparserPackage.eINSTANCE);

		// Create package meta-data objects
		theComparePackage.createPackageContents();
		theProcessingPackage.createPackageContents();
		theParserPackage.createPackageContents();
		theUnparserPackage.createPackageContents();

		// Initialize created meta-data
		theComparePackage.initializePackageContents();
		theProcessingPackage.initializePackageContents();
		theParserPackage.initializePackageContents();
		theUnparserPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComparePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComparePackage.eNS_URI, theComparePackage);
		return theComparePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddition() {
		return additionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeletion() {
		return deletionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMocaCompare() {
		return mocaCompareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMocaCompare_Addition() {
		return (EReference) mocaCompareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMocaCompare_Deletion() {
		return (EReference) mocaCompareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMocaCompare_FoundRightRlements() {
		return (EReference) mocaCompareEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMocaCompare__CacheRightFolder__Folder() {
		return mocaCompareEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMocaCompare__CollectAddition__TreeElement_TreeElement() {
		return mocaCompareEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMocaCompare__CollectDeletion__TreeElement_TreeElement() {
		return mocaCompareEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMocaCompare__Compare__Folder_Folder() {
		return mocaCompareEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMocaCompare__CompareFile__File_File() {
		return mocaCompareEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMocaCompare__CompareFolder__Folder_Folder() {
		return mocaCompareEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMocaCompare__CompareNode__Node_Node() {
		return mocaCompareEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMocaCompare__GetTreeElement__TreeElement_String_int() {
		return mocaCompareEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMocaDiff() {
		return mocaDiffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMocaDiff_Element() {
		return (EReference) mocaDiffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMocaDiff_LeftParent() {
		return (EReference) mocaDiffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompareFactory getCompareFactory() {
		return (CompareFactory) getEFactoryInstance();
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
		additionEClass = createEClass(ADDITION);

		deletionEClass = createEClass(DELETION);

		mocaCompareEClass = createEClass(MOCA_COMPARE);
		createEReference(mocaCompareEClass, MOCA_COMPARE__ADDITION);
		createEReference(mocaCompareEClass, MOCA_COMPARE__DELETION);
		createEReference(mocaCompareEClass, MOCA_COMPARE__FOUND_RIGHT_RLEMENTS);
		createEOperation(mocaCompareEClass, MOCA_COMPARE___CACHE_RIGHT_FOLDER__FOLDER);
		createEOperation(mocaCompareEClass, MOCA_COMPARE___COLLECT_ADDITION__TREEELEMENT_TREEELEMENT);
		createEOperation(mocaCompareEClass, MOCA_COMPARE___COLLECT_DELETION__TREEELEMENT_TREEELEMENT);
		createEOperation(mocaCompareEClass, MOCA_COMPARE___COMPARE__FOLDER_FOLDER);
		createEOperation(mocaCompareEClass, MOCA_COMPARE___COMPARE_FILE__FILE_FILE);
		createEOperation(mocaCompareEClass, MOCA_COMPARE___COMPARE_FOLDER__FOLDER_FOLDER);
		createEOperation(mocaCompareEClass, MOCA_COMPARE___COMPARE_NODE__NODE_NODE);
		createEOperation(mocaCompareEClass, MOCA_COMPARE___GET_TREE_ELEMENT__TREEELEMENT_STRING_INT);

		mocaDiffEClass = createEClass(MOCA_DIFF);
		createEReference(mocaDiffEClass, MOCA_DIFF__ELEMENT);
		createEReference(mocaDiffEClass, MOCA_DIFF__LEFT_PARENT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		additionEClass.getESuperTypes().add(this.getMocaDiff());
		deletionEClass.getESuperTypes().add(this.getMocaDiff());

		// Initialize classes, features, and operations; add parameters
		initEClass(additionEClass, Addition.class, "Addition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(deletionEClass, Deletion.class, "Deletion", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(mocaCompareEClass, MocaCompare.class, "MocaCompare", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMocaCompare_Addition(), this.getAddition(), null, "addition", null, 0, -1, MocaCompare.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMocaCompare_Deletion(), this.getDeletion(), null, "deletion", null, 0, -1, MocaCompare.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMocaCompare_FoundRightRlements(), theMocaTreePackage.getTreeElement(), null,
				"foundRightRlements", null, 0, -1, MocaCompare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getMocaCompare__CacheRightFolder__Folder(), null, "cacheRightFolder", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMocaTreePackage.getFolder(), "right", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMocaCompare__CollectAddition__TreeElement_TreeElement(), null, "collectAddition", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMocaTreePackage.getTreeElement(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMocaTreePackage.getTreeElement(), "leftParent", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMocaCompare__CollectDeletion__TreeElement_TreeElement(), null, "collectDeletion", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMocaTreePackage.getTreeElement(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMocaTreePackage.getTreeElement(), "leftParent", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMocaCompare__Compare__Folder_Folder(), null, "compare", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMocaTreePackage.getFolder(), "left", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMocaTreePackage.getFolder(), "right", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMocaCompare__CompareFile__File_File(), null, "compareFile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMocaTreePackage.getFile(), "left", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMocaTreePackage.getFile(), "right", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMocaCompare__CompareFolder__Folder_Folder(), null, "compareFolder", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theMocaTreePackage.getFolder(), "left", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMocaTreePackage.getFolder(), "right", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMocaCompare__CompareNode__Node_Node(), null, "compareNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMocaTreePackage.getNode(), "left", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMocaTreePackage.getNode(), "right", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMocaCompare__GetTreeElement__TreeElement_String_int(),
				theMocaTreePackage.getTreeElement(), "getTreeElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMocaTreePackage.getTreeElement(), "parent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mocaDiffEClass, MocaDiff.class, "MocaDiff", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMocaDiff_Element(), theMocaTreePackage.getTreeElement(), null, "element", null, 0, 1,
				MocaDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMocaDiff_LeftParent(), theMocaTreePackage.getTreeElement(), null, "leftParent", null, 0, 1,
				MocaDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ComparePackageImpl
