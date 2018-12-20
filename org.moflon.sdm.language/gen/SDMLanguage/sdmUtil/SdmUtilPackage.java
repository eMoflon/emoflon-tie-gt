/**
 */
package SDMLanguage.sdmUtil;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see SDMLanguage.sdmUtil.SdmUtilFactory
 * @model kind="package"
 * @generated
 */
public interface SdmUtilPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sdmUtil";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/SDMLanguage/model/SDMLanguage.ecore#//sdmUtil";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sdmUtil";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SdmUtilPackage eINSTANCE = SDMLanguage.sdmUtil.impl.SdmUtilPackageImpl.init();

	/**
	 * The meta object id for the '{@link SDMLanguage.sdmUtil.impl.CompilerInjectionImpl <em>Compiler Injection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SDMLanguage.sdmUtil.impl.CompilerInjectionImpl
	 * @see SDMLanguage.sdmUtil.impl.SdmUtilPackageImpl#getCompilerInjection()
	 * @generated
	 */
	int COMPILER_INJECTION = 0;

	/**
	 * The feature id for the '<em><b>Import Injection Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER_INJECTION__IMPORT_INJECTION_ENTRIES = 0;

	/**
	 * The feature id for the '<em><b>Compiler Injection Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER_INJECTION__COMPILER_INJECTION_ENTRIES = 1;

	/**
	 * The number of structural features of the '<em>Compiler Injection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER_INJECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Compiler Injection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER_INJECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SDMLanguage.sdmUtil.impl.CompilerInjectionEntryImpl <em>Compiler Injection Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SDMLanguage.sdmUtil.impl.CompilerInjectionEntryImpl
	 * @see SDMLanguage.sdmUtil.impl.SdmUtilPackageImpl#getCompilerInjectionEntry()
	 * @generated
	 */
	int COMPILER_INJECTION_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Compiler Injection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER_INJECTION_ENTRY__COMPILER_INJECTION = 0;

	/**
	 * The feature id for the '<em><b>EOperation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER_INJECTION_ENTRY__EOPERATION = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER_INJECTION_ENTRY__CONTENT = 2;

	/**
	 * The number of structural features of the '<em>Compiler Injection Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER_INJECTION_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Compiler Injection Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER_INJECTION_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SDMLanguage.sdmUtil.impl.ImportInjectionEntryImpl <em>Import Injection Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SDMLanguage.sdmUtil.impl.ImportInjectionEntryImpl
	 * @see SDMLanguage.sdmUtil.impl.SdmUtilPackageImpl#getImportInjectionEntry()
	 * @generated
	 */
	int IMPORT_INJECTION_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Compiler Injection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_INJECTION_ENTRY__COMPILER_INJECTION = 0;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_INJECTION_ENTRY__ECLASS = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_INJECTION_ENTRY__CONTENT = 2;

	/**
	 * The number of structural features of the '<em>Import Injection Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_INJECTION_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Import Injection Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_INJECTION_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SDMLanguage.sdmUtil.impl.SDMPrecompilerImpl <em>SDM Precompiler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SDMLanguage.sdmUtil.impl.SDMPrecompilerImpl
	 * @see SDMLanguage.sdmUtil.impl.SdmUtilPackageImpl#getSDMPrecompiler()
	 * @generated
	 */
	int SDM_PRECOMPILER = 3;

	/**
	 * The number of structural features of the '<em>SDM Precompiler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDM_PRECOMPILER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Process Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDM_PRECOMPILER___PROCESS_ACTIVITY__ACTIVITY = 0;

	/**
	 * The number of operations of the '<em>SDM Precompiler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDM_PRECOMPILER_OPERATION_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link SDMLanguage.sdmUtil.CompilerInjection <em>Compiler Injection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compiler Injection</em>'.
	 * @see SDMLanguage.sdmUtil.CompilerInjection
	 * @generated
	 */
	EClass getCompilerInjection();

	/**
	 * Returns the meta object for the containment reference list '{@link SDMLanguage.sdmUtil.CompilerInjection#getImportInjectionEntries <em>Import Injection Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import Injection Entries</em>'.
	 * @see SDMLanguage.sdmUtil.CompilerInjection#getImportInjectionEntries()
	 * @see #getCompilerInjection()
	 * @generated
	 */
	EReference getCompilerInjection_ImportInjectionEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link SDMLanguage.sdmUtil.CompilerInjection#getCompilerInjectionEntries <em>Compiler Injection Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compiler Injection Entries</em>'.
	 * @see SDMLanguage.sdmUtil.CompilerInjection#getCompilerInjectionEntries()
	 * @see #getCompilerInjection()
	 * @generated
	 */
	EReference getCompilerInjection_CompilerInjectionEntries();

	/**
	 * Returns the meta object for class '{@link SDMLanguage.sdmUtil.CompilerInjectionEntry <em>Compiler Injection Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compiler Injection Entry</em>'.
	 * @see SDMLanguage.sdmUtil.CompilerInjectionEntry
	 * @generated
	 */
	EClass getCompilerInjectionEntry();

	/**
	 * Returns the meta object for the container reference '{@link SDMLanguage.sdmUtil.CompilerInjectionEntry#getCompilerInjection <em>Compiler Injection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Compiler Injection</em>'.
	 * @see SDMLanguage.sdmUtil.CompilerInjectionEntry#getCompilerInjection()
	 * @see #getCompilerInjectionEntry()
	 * @generated
	 */
	EReference getCompilerInjectionEntry_CompilerInjection();

	/**
	 * Returns the meta object for the reference '{@link SDMLanguage.sdmUtil.CompilerInjectionEntry#getEOperation <em>EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EOperation</em>'.
	 * @see SDMLanguage.sdmUtil.CompilerInjectionEntry#getEOperation()
	 * @see #getCompilerInjectionEntry()
	 * @generated
	 */
	EReference getCompilerInjectionEntry_EOperation();

	/**
	 * Returns the meta object for the attribute '{@link SDMLanguage.sdmUtil.CompilerInjectionEntry#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see SDMLanguage.sdmUtil.CompilerInjectionEntry#getContent()
	 * @see #getCompilerInjectionEntry()
	 * @generated
	 */
	EAttribute getCompilerInjectionEntry_Content();

	/**
	 * Returns the meta object for class '{@link SDMLanguage.sdmUtil.ImportInjectionEntry <em>Import Injection Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Injection Entry</em>'.
	 * @see SDMLanguage.sdmUtil.ImportInjectionEntry
	 * @generated
	 */
	EClass getImportInjectionEntry();

	/**
	 * Returns the meta object for the container reference '{@link SDMLanguage.sdmUtil.ImportInjectionEntry#getCompilerInjection <em>Compiler Injection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Compiler Injection</em>'.
	 * @see SDMLanguage.sdmUtil.ImportInjectionEntry#getCompilerInjection()
	 * @see #getImportInjectionEntry()
	 * @generated
	 */
	EReference getImportInjectionEntry_CompilerInjection();

	/**
	 * Returns the meta object for the reference '{@link SDMLanguage.sdmUtil.ImportInjectionEntry#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClass</em>'.
	 * @see SDMLanguage.sdmUtil.ImportInjectionEntry#getEClass()
	 * @see #getImportInjectionEntry()
	 * @generated
	 */
	EReference getImportInjectionEntry_EClass();

	/**
	 * Returns the meta object for the attribute '{@link SDMLanguage.sdmUtil.ImportInjectionEntry#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see SDMLanguage.sdmUtil.ImportInjectionEntry#getContent()
	 * @see #getImportInjectionEntry()
	 * @generated
	 */
	EAttribute getImportInjectionEntry_Content();

	/**
	 * Returns the meta object for class '{@link SDMLanguage.sdmUtil.SDMPrecompiler <em>SDM Precompiler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SDM Precompiler</em>'.
	 * @see SDMLanguage.sdmUtil.SDMPrecompiler
	 * @generated
	 */
	EClass getSDMPrecompiler();

	/**
	 * Returns the meta object for the '{@link SDMLanguage.sdmUtil.SDMPrecompiler#processActivity(SDMLanguage.activities.Activity) <em>Process Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Process Activity</em>' operation.
	 * @see SDMLanguage.sdmUtil.SDMPrecompiler#processActivity(SDMLanguage.activities.Activity)
	 * @generated
	 */
	EOperation getSDMPrecompiler__ProcessActivity__Activity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SdmUtilFactory getSdmUtilFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link SDMLanguage.sdmUtil.impl.CompilerInjectionImpl <em>Compiler Injection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SDMLanguage.sdmUtil.impl.CompilerInjectionImpl
		 * @see SDMLanguage.sdmUtil.impl.SdmUtilPackageImpl#getCompilerInjection()
		 * @generated
		 */
		EClass COMPILER_INJECTION = eINSTANCE.getCompilerInjection();

		/**
		 * The meta object literal for the '<em><b>Import Injection Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILER_INJECTION__IMPORT_INJECTION_ENTRIES = eINSTANCE
				.getCompilerInjection_ImportInjectionEntries();

		/**
		 * The meta object literal for the '<em><b>Compiler Injection Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILER_INJECTION__COMPILER_INJECTION_ENTRIES = eINSTANCE
				.getCompilerInjection_CompilerInjectionEntries();

		/**
		 * The meta object literal for the '{@link SDMLanguage.sdmUtil.impl.CompilerInjectionEntryImpl <em>Compiler Injection Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SDMLanguage.sdmUtil.impl.CompilerInjectionEntryImpl
		 * @see SDMLanguage.sdmUtil.impl.SdmUtilPackageImpl#getCompilerInjectionEntry()
		 * @generated
		 */
		EClass COMPILER_INJECTION_ENTRY = eINSTANCE.getCompilerInjectionEntry();

		/**
		 * The meta object literal for the '<em><b>Compiler Injection</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILER_INJECTION_ENTRY__COMPILER_INJECTION = eINSTANCE
				.getCompilerInjectionEntry_CompilerInjection();

		/**
		 * The meta object literal for the '<em><b>EOperation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILER_INJECTION_ENTRY__EOPERATION = eINSTANCE.getCompilerInjectionEntry_EOperation();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILER_INJECTION_ENTRY__CONTENT = eINSTANCE.getCompilerInjectionEntry_Content();

		/**
		 * The meta object literal for the '{@link SDMLanguage.sdmUtil.impl.ImportInjectionEntryImpl <em>Import Injection Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SDMLanguage.sdmUtil.impl.ImportInjectionEntryImpl
		 * @see SDMLanguage.sdmUtil.impl.SdmUtilPackageImpl#getImportInjectionEntry()
		 * @generated
		 */
		EClass IMPORT_INJECTION_ENTRY = eINSTANCE.getImportInjectionEntry();

		/**
		 * The meta object literal for the '<em><b>Compiler Injection</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT_INJECTION_ENTRY__COMPILER_INJECTION = eINSTANCE.getImportInjectionEntry_CompilerInjection();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT_INJECTION_ENTRY__ECLASS = eINSTANCE.getImportInjectionEntry_EClass();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_INJECTION_ENTRY__CONTENT = eINSTANCE.getImportInjectionEntry_Content();

		/**
		 * The meta object literal for the '{@link SDMLanguage.sdmUtil.impl.SDMPrecompilerImpl <em>SDM Precompiler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SDMLanguage.sdmUtil.impl.SDMPrecompilerImpl
		 * @see SDMLanguage.sdmUtil.impl.SdmUtilPackageImpl#getSDMPrecompiler()
		 * @generated
		 */
		EClass SDM_PRECOMPILER = eINSTANCE.getSDMPrecompiler();

		/**
		 * The meta object literal for the '<em><b>Process Activity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SDM_PRECOMPILER___PROCESS_ACTIVITY__ACTIVITY = eINSTANCE
				.getSDMPrecompiler__ProcessActivity__Activity();

	}

} //SdmUtilPackage
