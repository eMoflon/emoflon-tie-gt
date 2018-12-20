/**
 */
package SDMLanguage.sdmUtil.impl;

import SDMLanguage.sdmUtil.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SdmUtilFactoryImpl extends EFactoryImpl implements SdmUtilFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SdmUtilFactory init() {
		try {
			SdmUtilFactory theSdmUtilFactory = (SdmUtilFactory) EPackage.Registry.INSTANCE
					.getEFactory(SdmUtilPackage.eNS_URI);
			if (theSdmUtilFactory != null) {
				return theSdmUtilFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SdmUtilFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SdmUtilFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SdmUtilPackage.COMPILER_INJECTION:
			return createCompilerInjection();
		case SdmUtilPackage.COMPILER_INJECTION_ENTRY:
			return createCompilerInjectionEntry();
		case SdmUtilPackage.IMPORT_INJECTION_ENTRY:
			return createImportInjectionEntry();
		case SdmUtilPackage.SDM_PRECOMPILER:
			return createSDMPrecompiler();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilerInjection createCompilerInjection() {
		CompilerInjectionImpl compilerInjection = new CompilerInjectionImpl();
		return compilerInjection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilerInjectionEntry createCompilerInjectionEntry() {
		CompilerInjectionEntryImpl compilerInjectionEntry = new CompilerInjectionEntryImpl();
		return compilerInjectionEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportInjectionEntry createImportInjectionEntry() {
		ImportInjectionEntryImpl importInjectionEntry = new ImportInjectionEntryImpl();
		return importInjectionEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDMPrecompiler createSDMPrecompiler() {
		SDMPrecompilerImpl sdmPrecompiler = new SDMPrecompilerImpl();
		return sdmPrecompiler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SdmUtilPackage getSdmUtilPackage() {
		return (SdmUtilPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SdmUtilPackage getPackage() {
		return SdmUtilPackage.eINSTANCE;
	}

} //SdmUtilFactoryImpl
