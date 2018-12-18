/**
 */
package SDMLanguage.patterns.impl;

import SDMLanguage.impl.NamedElementImpl;

import SDMLanguage.patterns.BindingOperator;
import SDMLanguage.patterns.BindingSemantics;
import SDMLanguage.patterns.LinkVariable;
import SDMLanguage.patterns.ObjectVariable;
import SDMLanguage.patterns.PatternsPackage;
import SDMLanguage.patterns.StoryPattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SDMLanguage.patterns.impl.LinkVariableImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link SDMLanguage.patterns.impl.LinkVariableImpl#getSource <em>Source</em>}</li>
 *   <li>{@link SDMLanguage.patterns.impl.LinkVariableImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link SDMLanguage.patterns.impl.LinkVariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link SDMLanguage.patterns.impl.LinkVariableImpl#getBindingOperator <em>Binding Operator</em>}</li>
 *   <li>{@link SDMLanguage.patterns.impl.LinkVariableImpl#getBindingSemantics <em>Binding Semantics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkVariableImpl extends NamedElementImpl implements LinkVariable {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ObjectVariable target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ObjectVariable source;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EReference type;

	/**
	 * The default value of the '{@link #getBindingOperator() <em>Binding Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingOperator()
	 * @generated
	 * @ordered
	 */
	protected static final BindingOperator BINDING_OPERATOR_EDEFAULT = BindingOperator.CHECK_ONLY;

	/**
	 * The cached value of the '{@link #getBindingOperator() <em>Binding Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingOperator()
	 * @generated
	 * @ordered
	 */
	protected BindingOperator bindingOperator = BINDING_OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBindingSemantics() <em>Binding Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingSemantics()
	 * @generated
	 * @ordered
	 */
	protected static final BindingSemantics BINDING_SEMANTICS_EDEFAULT = BindingSemantics.MANDATORY;

	/**
	 * The cached value of the '{@link #getBindingSemantics() <em>Binding Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingSemantics()
	 * @generated
	 * @ordered
	 */
	protected BindingSemantics bindingSemantics = BINDING_SEMANTICS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.LINK_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectVariable getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (ObjectVariable) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternsPackage.LINK_VARIABLE__TARGET,
							oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectVariable basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(ObjectVariable newTarget, NotificationChain msgs) {
		ObjectVariable oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PatternsPackage.LINK_VARIABLE__TARGET, oldTarget, newTarget);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ObjectVariable newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this, PatternsPackage.OBJECT_VARIABLE__INCOMING_LINK,
						ObjectVariable.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this, PatternsPackage.OBJECT_VARIABLE__INCOMING_LINK,
						ObjectVariable.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.LINK_VARIABLE__TARGET, newTarget,
					newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectVariable getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (ObjectVariable) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternsPackage.LINK_VARIABLE__SOURCE,
							oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectVariable basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(ObjectVariable newSource, NotificationChain msgs) {
		ObjectVariable oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PatternsPackage.LINK_VARIABLE__SOURCE, oldSource, newSource);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ObjectVariable newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this, PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK,
						ObjectVariable.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this, PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK,
						ObjectVariable.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.LINK_VARIABLE__SOURCE, newSource,
					newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryPattern getPattern() {
		if (eContainerFeatureID() != PatternsPackage.LINK_VARIABLE__PATTERN)
			return null;
		return (StoryPattern) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(StoryPattern newPattern, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newPattern, PatternsPackage.LINK_VARIABLE__PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(StoryPattern newPattern) {
		if (newPattern != eInternalContainer()
				|| (eContainerFeatureID() != PatternsPackage.LINK_VARIABLE__PATTERN && newPattern != null)) {
			if (EcoreUtil.isAncestor(this, newPattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPattern != null)
				msgs = ((InternalEObject) newPattern).eInverseAdd(this, PatternsPackage.STORY_PATTERN__LINK_VARIABLE,
						StoryPattern.class, msgs);
			msgs = basicSetPattern(newPattern, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.LINK_VARIABLE__PATTERN, newPattern,
					newPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (EReference) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternsPackage.LINK_VARIABLE__TYPE,
							oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EReference newType) {
		EReference oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.LINK_VARIABLE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingOperator getBindingOperator() {
		return bindingOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingOperator(BindingOperator newBindingOperator) {
		BindingOperator oldBindingOperator = bindingOperator;
		bindingOperator = newBindingOperator == null ? BINDING_OPERATOR_EDEFAULT : newBindingOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.LINK_VARIABLE__BINDING_OPERATOR,
					oldBindingOperator, bindingOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingSemantics getBindingSemantics() {
		return bindingSemantics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingSemantics(BindingSemantics newBindingSemantics) {
		BindingSemantics oldBindingSemantics = bindingSemantics;
		bindingSemantics = newBindingSemantics == null ? BINDING_SEMANTICS_EDEFAULT : newBindingSemantics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.LINK_VARIABLE__BINDING_SEMANTICS,
					oldBindingSemantics, bindingSemantics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PatternsPackage.LINK_VARIABLE__TARGET:
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this, PatternsPackage.OBJECT_VARIABLE__INCOMING_LINK,
						ObjectVariable.class, msgs);
			return basicSetTarget((ObjectVariable) otherEnd, msgs);
		case PatternsPackage.LINK_VARIABLE__SOURCE:
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this, PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK,
						ObjectVariable.class, msgs);
			return basicSetSource((ObjectVariable) otherEnd, msgs);
		case PatternsPackage.LINK_VARIABLE__PATTERN:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetPattern((StoryPattern) otherEnd, msgs);
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
		case PatternsPackage.LINK_VARIABLE__TARGET:
			return basicSetTarget(null, msgs);
		case PatternsPackage.LINK_VARIABLE__SOURCE:
			return basicSetSource(null, msgs);
		case PatternsPackage.LINK_VARIABLE__PATTERN:
			return basicSetPattern(null, msgs);
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
		case PatternsPackage.LINK_VARIABLE__PATTERN:
			return eInternalContainer().eInverseRemove(this, PatternsPackage.STORY_PATTERN__LINK_VARIABLE,
					StoryPattern.class, msgs);
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
		case PatternsPackage.LINK_VARIABLE__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case PatternsPackage.LINK_VARIABLE__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case PatternsPackage.LINK_VARIABLE__PATTERN:
			return getPattern();
		case PatternsPackage.LINK_VARIABLE__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case PatternsPackage.LINK_VARIABLE__BINDING_OPERATOR:
			return getBindingOperator();
		case PatternsPackage.LINK_VARIABLE__BINDING_SEMANTICS:
			return getBindingSemantics();
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
		case PatternsPackage.LINK_VARIABLE__TARGET:
			setTarget((ObjectVariable) newValue);
			return;
		case PatternsPackage.LINK_VARIABLE__SOURCE:
			setSource((ObjectVariable) newValue);
			return;
		case PatternsPackage.LINK_VARIABLE__PATTERN:
			setPattern((StoryPattern) newValue);
			return;
		case PatternsPackage.LINK_VARIABLE__TYPE:
			setType((EReference) newValue);
			return;
		case PatternsPackage.LINK_VARIABLE__BINDING_OPERATOR:
			setBindingOperator((BindingOperator) newValue);
			return;
		case PatternsPackage.LINK_VARIABLE__BINDING_SEMANTICS:
			setBindingSemantics((BindingSemantics) newValue);
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
		case PatternsPackage.LINK_VARIABLE__TARGET:
			setTarget((ObjectVariable) null);
			return;
		case PatternsPackage.LINK_VARIABLE__SOURCE:
			setSource((ObjectVariable) null);
			return;
		case PatternsPackage.LINK_VARIABLE__PATTERN:
			setPattern((StoryPattern) null);
			return;
		case PatternsPackage.LINK_VARIABLE__TYPE:
			setType((EReference) null);
			return;
		case PatternsPackage.LINK_VARIABLE__BINDING_OPERATOR:
			setBindingOperator(BINDING_OPERATOR_EDEFAULT);
			return;
		case PatternsPackage.LINK_VARIABLE__BINDING_SEMANTICS:
			setBindingSemantics(BINDING_SEMANTICS_EDEFAULT);
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
		case PatternsPackage.LINK_VARIABLE__TARGET:
			return target != null;
		case PatternsPackage.LINK_VARIABLE__SOURCE:
			return source != null;
		case PatternsPackage.LINK_VARIABLE__PATTERN:
			return getPattern() != null;
		case PatternsPackage.LINK_VARIABLE__TYPE:
			return type != null;
		case PatternsPackage.LINK_VARIABLE__BINDING_OPERATOR:
			return bindingOperator != BINDING_OPERATOR_EDEFAULT;
		case PatternsPackage.LINK_VARIABLE__BINDING_SEMANTICS:
			return bindingSemantics != BINDING_SEMANTICS_EDEFAULT;
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
		result.append(" (bindingOperator: ");
		result.append(bindingOperator);
		result.append(", bindingSemantics: ");
		result.append(bindingSemantics);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //LinkVariableImpl
