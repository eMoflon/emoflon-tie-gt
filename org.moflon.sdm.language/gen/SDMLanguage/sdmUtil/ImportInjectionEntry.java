/**
 */
package SDMLanguage.sdmUtil;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Injection Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.sdmUtil.ImportInjectionEntry#getCompilerInjection <em>Compiler Injection</em>}</li>
 *   <li>{@link SDMLanguage.sdmUtil.ImportInjectionEntry#getEClass <em>EClass</em>}</li>
 *   <li>{@link SDMLanguage.sdmUtil.ImportInjectionEntry#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.sdmUtil.SdmUtilPackage#getImportInjectionEntry()
 * @model
 * @generated
 */
public interface ImportInjectionEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Compiler Injection</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.sdmUtil.CompilerInjection#getImportInjectionEntries <em>Import Injection Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compiler Injection</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compiler Injection</em>' container reference.
	 * @see #setCompilerInjection(CompilerInjection)
	 * @see SDMLanguage.sdmUtil.SdmUtilPackage#getImportInjectionEntry_CompilerInjection()
	 * @see SDMLanguage.sdmUtil.CompilerInjection#getImportInjectionEntries
	 * @model opposite="importInjectionEntries" required="true" transient="false"
	 * @generated
	 */
	CompilerInjection getCompilerInjection();

	/**
	 * Sets the value of the '{@link SDMLanguage.sdmUtil.ImportInjectionEntry#getCompilerInjection <em>Compiler Injection</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compiler Injection</em>' container reference.
	 * @see #getCompilerInjection()
	 * @generated
	 */
	void setCompilerInjection(CompilerInjection value);

	/**
	 * Returns the value of the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClass</em>' reference.
	 * @see #setEClass(EClass)
	 * @see SDMLanguage.sdmUtil.SdmUtilPackage#getImportInjectionEntry_EClass()
	 * @model required="true"
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Sets the value of the '{@link SDMLanguage.sdmUtil.ImportInjectionEntry#getEClass <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass</em>' reference.
	 * @see #getEClass()
	 * @generated
	 */
	void setEClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see SDMLanguage.sdmUtil.SdmUtilPackage#getImportInjectionEntry_Content()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link SDMLanguage.sdmUtil.ImportInjectionEntry#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ImportInjectionEntry
