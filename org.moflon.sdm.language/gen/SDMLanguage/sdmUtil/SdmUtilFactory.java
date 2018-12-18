/**
 */
package SDMLanguage.sdmUtil;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SDMLanguage.sdmUtil.SdmUtilPackage
 * @generated
 */
public interface SdmUtilFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SdmUtilFactory eINSTANCE = SDMLanguage.sdmUtil.impl.SdmUtilFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Compiler Injection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compiler Injection</em>'.
	 * @generated
	 */
	CompilerInjection createCompilerInjection();

	/**
	 * Returns a new object of class '<em>Compiler Injection Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compiler Injection Entry</em>'.
	 * @generated
	 */
	CompilerInjectionEntry createCompilerInjectionEntry();

	/**
	 * Returns a new object of class '<em>Import Injection Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Injection Entry</em>'.
	 * @generated
	 */
	ImportInjectionEntry createImportInjectionEntry();

	/**
	 * Returns a new object of class '<em>SDM Precompiler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SDM Precompiler</em>'.
	 * @generated
	 */
	SDMPrecompiler createSDMPrecompiler();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SdmUtilPackage getSdmUtilPackage();

} //SdmUtilFactory
