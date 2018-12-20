/**
 */
package SDMLanguage.sdmUtil;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compiler Injection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.sdmUtil.CompilerInjection#getImportInjectionEntries <em>Import Injection Entries</em>}</li>
 *   <li>{@link SDMLanguage.sdmUtil.CompilerInjection#getCompilerInjectionEntries <em>Compiler Injection Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.sdmUtil.SdmUtilPackage#getCompilerInjection()
 * @model
 * @generated
 */
public interface CompilerInjection extends EObject {
	/**
	 * Returns the value of the '<em><b>Import Injection Entries</b></em>' containment reference list.
	 * The list contents are of type {@link SDMLanguage.sdmUtil.ImportInjectionEntry}.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.sdmUtil.ImportInjectionEntry#getCompilerInjection <em>Compiler Injection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Injection Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Injection Entries</em>' containment reference list.
	 * @see SDMLanguage.sdmUtil.SdmUtilPackage#getCompilerInjection_ImportInjectionEntries()
	 * @see SDMLanguage.sdmUtil.ImportInjectionEntry#getCompilerInjection
	 * @model opposite="compilerInjection" containment="true"
	 * @generated
	 */
	EList<ImportInjectionEntry> getImportInjectionEntries();

	/**
	 * Returns the value of the '<em><b>Compiler Injection Entries</b></em>' containment reference list.
	 * The list contents are of type {@link SDMLanguage.sdmUtil.CompilerInjectionEntry}.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.sdmUtil.CompilerInjectionEntry#getCompilerInjection <em>Compiler Injection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compiler Injection Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compiler Injection Entries</em>' containment reference list.
	 * @see SDMLanguage.sdmUtil.SdmUtilPackage#getCompilerInjection_CompilerInjectionEntries()
	 * @see SDMLanguage.sdmUtil.CompilerInjectionEntry#getCompilerInjection
	 * @model opposite="compilerInjection" containment="true"
	 * @generated
	 */
	EList<CompilerInjectionEntry> getCompilerInjectionEntries();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // CompilerInjection
