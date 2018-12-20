/**
 */
package SDMLanguage.sdmUtil;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compiler Injection Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.sdmUtil.CompilerInjectionEntry#getCompilerInjection <em>Compiler Injection</em>}</li>
 *   <li>{@link SDMLanguage.sdmUtil.CompilerInjectionEntry#getEOperation <em>EOperation</em>}</li>
 *   <li>{@link SDMLanguage.sdmUtil.CompilerInjectionEntry#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.sdmUtil.SdmUtilPackage#getCompilerInjectionEntry()
 * @model
 * @generated
 */
public interface CompilerInjectionEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Compiler Injection</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.sdmUtil.CompilerInjection#getCompilerInjectionEntries <em>Compiler Injection Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compiler Injection</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compiler Injection</em>' container reference.
	 * @see #setCompilerInjection(CompilerInjection)
	 * @see SDMLanguage.sdmUtil.SdmUtilPackage#getCompilerInjectionEntry_CompilerInjection()
	 * @see SDMLanguage.sdmUtil.CompilerInjection#getCompilerInjectionEntries
	 * @model opposite="compilerInjectionEntries" required="true" transient="false"
	 * @generated
	 */
	CompilerInjection getCompilerInjection();

	/**
	 * Sets the value of the '{@link SDMLanguage.sdmUtil.CompilerInjectionEntry#getCompilerInjection <em>Compiler Injection</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compiler Injection</em>' container reference.
	 * @see #getCompilerInjection()
	 * @generated
	 */
	void setCompilerInjection(CompilerInjection value);

	/**
	 * Returns the value of the '<em><b>EOperation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EOperation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EOperation</em>' reference.
	 * @see #setEOperation(EOperation)
	 * @see SDMLanguage.sdmUtil.SdmUtilPackage#getCompilerInjectionEntry_EOperation()
	 * @model required="true"
	 * @generated
	 */
	EOperation getEOperation();

	/**
	 * Sets the value of the '{@link SDMLanguage.sdmUtil.CompilerInjectionEntry#getEOperation <em>EOperation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EOperation</em>' reference.
	 * @see #getEOperation()
	 * @generated
	 */
	void setEOperation(EOperation value);

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
	 * @see SDMLanguage.sdmUtil.SdmUtilPackage#getCompilerInjectionEntry_Content()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link SDMLanguage.sdmUtil.CompilerInjectionEntry#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // CompilerInjectionEntry
