/**
 */
package SDMLanguage.sdmUtil;

import SDMLanguage.activities.Activity;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SDM Precompiler</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see SDMLanguage.sdmUtil.SdmUtilPackage#getSDMPrecompiler()
 * @model
 * @generated
 */
public interface SDMPrecompiler extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void processActivity(Activity activity);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // SDMPrecompiler
