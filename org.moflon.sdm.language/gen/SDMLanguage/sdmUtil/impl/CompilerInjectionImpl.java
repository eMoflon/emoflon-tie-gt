/**
 */
package SDMLanguage.sdmUtil.impl;

import SDMLanguage.sdmUtil.CompilerInjection;
import SDMLanguage.sdmUtil.CompilerInjectionEntry;
import SDMLanguage.sdmUtil.ImportInjectionEntry;
import SDMLanguage.sdmUtil.SdmUtilPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compiler Injection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SDMLanguage.sdmUtil.impl.CompilerInjectionImpl#getImportInjectionEntries <em>Import Injection Entries</em>}</li>
 *   <li>{@link SDMLanguage.sdmUtil.impl.CompilerInjectionImpl#getCompilerInjectionEntries <em>Compiler Injection Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompilerInjectionImpl extends EObjectImpl implements CompilerInjection {
	/**
	 * The cached value of the '{@link #getImportInjectionEntries() <em>Import Injection Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportInjectionEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportInjectionEntry> importInjectionEntries;

	/**
	 * The cached value of the '{@link #getCompilerInjectionEntries() <em>Compiler Injection Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompilerInjectionEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<CompilerInjectionEntry> compilerInjectionEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilerInjectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdmUtilPackage.Literals.COMPILER_INJECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportInjectionEntry> getImportInjectionEntries() {
		if (importInjectionEntries == null) {
			importInjectionEntries = new EObjectContainmentWithInverseEList<ImportInjectionEntry>(
					ImportInjectionEntry.class, this, SdmUtilPackage.COMPILER_INJECTION__IMPORT_INJECTION_ENTRIES,
					SdmUtilPackage.IMPORT_INJECTION_ENTRY__COMPILER_INJECTION);
		}
		return importInjectionEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompilerInjectionEntry> getCompilerInjectionEntries() {
		if (compilerInjectionEntries == null) {
			compilerInjectionEntries = new EObjectContainmentWithInverseEList<CompilerInjectionEntry>(
					CompilerInjectionEntry.class, this, SdmUtilPackage.COMPILER_INJECTION__COMPILER_INJECTION_ENTRIES,
					SdmUtilPackage.COMPILER_INJECTION_ENTRY__COMPILER_INJECTION);
		}
		return compilerInjectionEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SdmUtilPackage.COMPILER_INJECTION__IMPORT_INJECTION_ENTRIES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getImportInjectionEntries()).basicAdd(otherEnd,
					msgs);
		case SdmUtilPackage.COMPILER_INJECTION__COMPILER_INJECTION_ENTRIES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCompilerInjectionEntries())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SdmUtilPackage.COMPILER_INJECTION__IMPORT_INJECTION_ENTRIES:
			return ((InternalEList<?>) getImportInjectionEntries()).basicRemove(otherEnd, msgs);
		case SdmUtilPackage.COMPILER_INJECTION__COMPILER_INJECTION_ENTRIES:
			return ((InternalEList<?>) getCompilerInjectionEntries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SdmUtilPackage.COMPILER_INJECTION__IMPORT_INJECTION_ENTRIES:
			return getImportInjectionEntries();
		case SdmUtilPackage.COMPILER_INJECTION__COMPILER_INJECTION_ENTRIES:
			return getCompilerInjectionEntries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SdmUtilPackage.COMPILER_INJECTION__IMPORT_INJECTION_ENTRIES:
			getImportInjectionEntries().clear();
			getImportInjectionEntries().addAll((Collection<? extends ImportInjectionEntry>) newValue);
			return;
		case SdmUtilPackage.COMPILER_INJECTION__COMPILER_INJECTION_ENTRIES:
			getCompilerInjectionEntries().clear();
			getCompilerInjectionEntries().addAll((Collection<? extends CompilerInjectionEntry>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SdmUtilPackage.COMPILER_INJECTION__IMPORT_INJECTION_ENTRIES:
			getImportInjectionEntries().clear();
			return;
		case SdmUtilPackage.COMPILER_INJECTION__COMPILER_INJECTION_ENTRIES:
			getCompilerInjectionEntries().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SdmUtilPackage.COMPILER_INJECTION__IMPORT_INJECTION_ENTRIES:
			return importInjectionEntries != null && !importInjectionEntries.isEmpty();
		case SdmUtilPackage.COMPILER_INJECTION__COMPILER_INJECTION_ENTRIES:
			return compilerInjectionEntries != null && !compilerInjectionEntries.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //CompilerInjectionImpl
