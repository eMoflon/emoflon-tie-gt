/**
 */
package SDMLanguage.sdmUtil.util;

import SDMLanguage.sdmUtil.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see SDMLanguage.sdmUtil.SdmUtilPackage
 * @generated
 */
public class SdmUtilAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SdmUtilPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SdmUtilAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SdmUtilPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SdmUtilSwitch<Adapter> modelSwitch = new SdmUtilSwitch<Adapter>() {
		@Override
		public Adapter caseCompilerInjection(CompilerInjection object) {
			return createCompilerInjectionAdapter();
		}

		@Override
		public Adapter caseCompilerInjectionEntry(CompilerInjectionEntry object) {
			return createCompilerInjectionEntryAdapter();
		}

		@Override
		public Adapter caseImportInjectionEntry(ImportInjectionEntry object) {
			return createImportInjectionEntryAdapter();
		}

		@Override
		public Adapter caseSDMPrecompiler(SDMPrecompiler object) {
			return createSDMPrecompilerAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link SDMLanguage.sdmUtil.CompilerInjection <em>Compiler Injection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SDMLanguage.sdmUtil.CompilerInjection
	 * @generated
	 */
	public Adapter createCompilerInjectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SDMLanguage.sdmUtil.CompilerInjectionEntry <em>Compiler Injection Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SDMLanguage.sdmUtil.CompilerInjectionEntry
	 * @generated
	 */
	public Adapter createCompilerInjectionEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SDMLanguage.sdmUtil.ImportInjectionEntry <em>Import Injection Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SDMLanguage.sdmUtil.ImportInjectionEntry
	 * @generated
	 */
	public Adapter createImportInjectionEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SDMLanguage.sdmUtil.SDMPrecompiler <em>SDM Precompiler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SDMLanguage.sdmUtil.SDMPrecompiler
	 * @generated
	 */
	public Adapter createSDMPrecompilerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SdmUtilAdapterFactory
