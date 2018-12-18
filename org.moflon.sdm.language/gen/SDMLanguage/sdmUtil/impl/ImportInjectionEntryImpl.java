/**
 */
package SDMLanguage.sdmUtil.impl;

import SDMLanguage.sdmUtil.CompilerInjection;
import SDMLanguage.sdmUtil.ImportInjectionEntry;
import SDMLanguage.sdmUtil.SdmUtilPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Injection Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SDMLanguage.sdmUtil.impl.ImportInjectionEntryImpl#getCompilerInjection <em>Compiler Injection</em>}</li>
 *   <li>{@link SDMLanguage.sdmUtil.impl.ImportInjectionEntryImpl#getEClass <em>EClass</em>}</li>
 *   <li>{@link SDMLanguage.sdmUtil.impl.ImportInjectionEntryImpl#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImportInjectionEntryImpl extends EObjectImpl implements ImportInjectionEntry {
	/**
	 * The cached value of the '{@link #getEClass() <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClass()
	 * @generated
	 * @ordered
	 */
	protected EClass eClass;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportInjectionEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdmUtilPackage.Literals.IMPORT_INJECTION_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilerInjection getCompilerInjection() {
		if (eContainerFeatureID() != SdmUtilPackage.IMPORT_INJECTION_ENTRY__COMPILER_INJECTION)
			return null;
		return (CompilerInjection) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompilerInjection(CompilerInjection newCompilerInjection, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newCompilerInjection,
				SdmUtilPackage.IMPORT_INJECTION_ENTRY__COMPILER_INJECTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompilerInjection(CompilerInjection newCompilerInjection) {
		if (newCompilerInjection != eInternalContainer()
				|| (eContainerFeatureID() != SdmUtilPackage.IMPORT_INJECTION_ENTRY__COMPILER_INJECTION
						&& newCompilerInjection != null)) {
			if (EcoreUtil.isAncestor(this, newCompilerInjection))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCompilerInjection != null)
				msgs = ((InternalEObject) newCompilerInjection).eInverseAdd(this,
						SdmUtilPackage.COMPILER_INJECTION__IMPORT_INJECTION_ENTRIES, CompilerInjection.class, msgs);
			msgs = basicSetCompilerInjection(newCompilerInjection, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SdmUtilPackage.IMPORT_INJECTION_ENTRY__COMPILER_INJECTION, newCompilerInjection,
					newCompilerInjection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClass() {
		if (eClass != null && eClass.eIsProxy()) {
			InternalEObject oldEClass = (InternalEObject) eClass;
			eClass = (EClass) eResolveProxy(oldEClass);
			if (eClass != oldEClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SdmUtilPackage.IMPORT_INJECTION_ENTRY__ECLASS, oldEClass, eClass));
			}
		}
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetEClass() {
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEClass(EClass newEClass) {
		EClass oldEClass = eClass;
		eClass = newEClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SdmUtilPackage.IMPORT_INJECTION_ENTRY__ECLASS,
					oldEClass, eClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SdmUtilPackage.IMPORT_INJECTION_ENTRY__CONTENT,
					oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SdmUtilPackage.IMPORT_INJECTION_ENTRY__COMPILER_INJECTION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetCompilerInjection((CompilerInjection) otherEnd, msgs);
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
		case SdmUtilPackage.IMPORT_INJECTION_ENTRY__COMPILER_INJECTION:
			return basicSetCompilerInjection(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case SdmUtilPackage.IMPORT_INJECTION_ENTRY__COMPILER_INJECTION:
			return eInternalContainer().eInverseRemove(this,
					SdmUtilPackage.COMPILER_INJECTION__IMPORT_INJECTION_ENTRIES, CompilerInjection.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SdmUtilPackage.IMPORT_INJECTION_ENTRY__COMPILER_INJECTION:
			return getCompilerInjection();
		case SdmUtilPackage.IMPORT_INJECTION_ENTRY__ECLASS:
			if (resolve)
				return getEClass();
			return basicGetEClass();
		case SdmUtilPackage.IMPORT_INJECTION_ENTRY__CONTENT:
			return getContent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SdmUtilPackage.IMPORT_INJECTION_ENTRY__COMPILER_INJECTION:
			setCompilerInjection((CompilerInjection) newValue);
			return;
		case SdmUtilPackage.IMPORT_INJECTION_ENTRY__ECLASS:
			setEClass((EClass) newValue);
			return;
		case SdmUtilPackage.IMPORT_INJECTION_ENTRY__CONTENT:
			setContent((String) newValue);
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
		case SdmUtilPackage.IMPORT_INJECTION_ENTRY__COMPILER_INJECTION:
			setCompilerInjection((CompilerInjection) null);
			return;
		case SdmUtilPackage.IMPORT_INJECTION_ENTRY__ECLASS:
			setEClass((EClass) null);
			return;
		case SdmUtilPackage.IMPORT_INJECTION_ENTRY__CONTENT:
			setContent(CONTENT_EDEFAULT);
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
		case SdmUtilPackage.IMPORT_INJECTION_ENTRY__COMPILER_INJECTION:
			return getCompilerInjection() != null;
		case SdmUtilPackage.IMPORT_INJECTION_ENTRY__ECLASS:
			return eClass != null;
		case SdmUtilPackage.IMPORT_INJECTION_ENTRY__CONTENT:
			return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (content: ");
		result.append(content);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ImportInjectionEntryImpl
