/**
 */
package SDMLanguage.patterns.impl;

import SDMLanguage.NamedElement;
import SDMLanguage.SDMLanguagePackage;

import SDMLanguage.expressions.Expression;

import SDMLanguage.impl.TypedElementImpl;

import SDMLanguage.patterns.AttributeAssignment;
import SDMLanguage.patterns.BindingOperator;
import SDMLanguage.patterns.BindingSemantics;
import SDMLanguage.patterns.BindingState;
import SDMLanguage.patterns.Constraint;
import SDMLanguage.patterns.LinkVariable;
import SDMLanguage.patterns.ObjectVariable;
import SDMLanguage.patterns.PatternsPackage;
import SDMLanguage.patterns.StoryPattern;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SDMLanguage.patterns.impl.ObjectVariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link SDMLanguage.patterns.impl.ObjectVariableImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link SDMLanguage.patterns.impl.ObjectVariableImpl#getBindingExpression <em>Binding Expression</em>}</li>
 *   <li>{@link SDMLanguage.patterns.impl.ObjectVariableImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link SDMLanguage.patterns.impl.ObjectVariableImpl#getIncomingLink <em>Incoming Link</em>}</li>
 *   <li>{@link SDMLanguage.patterns.impl.ObjectVariableImpl#getOutgoingLink <em>Outgoing Link</em>}</li>
 *   <li>{@link SDMLanguage.patterns.impl.ObjectVariableImpl#getAttributeAssignment <em>Attribute Assignment</em>}</li>
 *   <li>{@link SDMLanguage.patterns.impl.ObjectVariableImpl#getBindingOperator <em>Binding Operator</em>}</li>
 *   <li>{@link SDMLanguage.patterns.impl.ObjectVariableImpl#getBindingSemantics <em>Binding Semantics</em>}</li>
 *   <li>{@link SDMLanguage.patterns.impl.ObjectVariableImpl#getBindingState <em>Binding State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectVariableImpl extends TypedElementImpl implements ObjectVariable {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "\"\"";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraint;

	/**
	 * The cached value of the '{@link #getBindingExpression() <em>Binding Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression bindingExpression;

	/**
	 * The cached value of the '{@link #getIncomingLink() <em>Incoming Link</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingLink()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkVariable> incomingLink;

	/**
	 * The cached value of the '{@link #getOutgoingLink() <em>Outgoing Link</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingLink()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkVariable> outgoingLink;

	/**
	 * The cached value of the '{@link #getAttributeAssignment() <em>Attribute Assignment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeAssignment()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeAssignment> attributeAssignment;

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
	 * The default value of the '{@link #getBindingState() <em>Binding State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingState()
	 * @generated
	 * @ordered
	 */
	protected static final BindingState BINDING_STATE_EDEFAULT = BindingState.UNBOUND;

	/**
	 * The cached value of the '{@link #getBindingState() <em>Binding State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingState()
	 * @generated
	 * @ordered
	 */
	protected BindingState bindingState = BINDING_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.OBJECT_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.OBJECT_VARIABLE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this,
					PatternsPackage.OBJECT_VARIABLE__CONSTRAINT, PatternsPackage.CONSTRAINT__OBJECT_VARIABLE);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getBindingExpression() {
		return bindingExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBindingExpression(Expression newBindingExpression, NotificationChain msgs) {
		Expression oldBindingExpression = bindingExpression;
		bindingExpression = newBindingExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PatternsPackage.OBJECT_VARIABLE__BINDING_EXPRESSION, oldBindingExpression, newBindingExpression);
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
	public void setBindingExpression(Expression newBindingExpression) {
		if (newBindingExpression != bindingExpression) {
			NotificationChain msgs = null;
			if (bindingExpression != null)
				msgs = ((InternalEObject) bindingExpression).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PatternsPackage.OBJECT_VARIABLE__BINDING_EXPRESSION, null, msgs);
			if (newBindingExpression != null)
				msgs = ((InternalEObject) newBindingExpression).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PatternsPackage.OBJECT_VARIABLE__BINDING_EXPRESSION, null, msgs);
			msgs = basicSetBindingExpression(newBindingExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.OBJECT_VARIABLE__BINDING_EXPRESSION,
					newBindingExpression, newBindingExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryPattern getPattern() {
		if (eContainerFeatureID() != PatternsPackage.OBJECT_VARIABLE__PATTERN)
			return null;
		return (StoryPattern) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(StoryPattern newPattern, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newPattern, PatternsPackage.OBJECT_VARIABLE__PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(StoryPattern newPattern) {
		if (newPattern != eInternalContainer()
				|| (eContainerFeatureID() != PatternsPackage.OBJECT_VARIABLE__PATTERN && newPattern != null)) {
			if (EcoreUtil.isAncestor(this, newPattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPattern != null)
				msgs = ((InternalEObject) newPattern).eInverseAdd(this, PatternsPackage.STORY_PATTERN__OBJECT_VARIABLE,
						StoryPattern.class, msgs);
			msgs = basicSetPattern(newPattern, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.OBJECT_VARIABLE__PATTERN, newPattern,
					newPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkVariable> getIncomingLink() {
		if (incomingLink == null) {
			incomingLink = new EObjectWithInverseResolvingEList<LinkVariable>(LinkVariable.class, this,
					PatternsPackage.OBJECT_VARIABLE__INCOMING_LINK, PatternsPackage.LINK_VARIABLE__TARGET);
		}
		return incomingLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkVariable> getOutgoingLink() {
		if (outgoingLink == null) {
			outgoingLink = new EObjectWithInverseResolvingEList<LinkVariable>(LinkVariable.class, this,
					PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK, PatternsPackage.LINK_VARIABLE__SOURCE);
		}
		return outgoingLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeAssignment> getAttributeAssignment() {
		if (attributeAssignment == null) {
			attributeAssignment = new EObjectContainmentWithInverseEList<AttributeAssignment>(AttributeAssignment.class,
					this, PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT,
					PatternsPackage.ATTRIBUTE_ASSIGNMENT__OBJECT_VARIABLE);
		}
		return attributeAssignment;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.OBJECT_VARIABLE__BINDING_OPERATOR,
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.OBJECT_VARIABLE__BINDING_SEMANTICS,
					oldBindingSemantics, bindingSemantics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingState getBindingState() {
		return bindingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingState(BindingState newBindingState) {
		BindingState oldBindingState = bindingState;
		bindingState = newBindingState == null ? BINDING_STATE_EDEFAULT : newBindingState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.OBJECT_VARIABLE__BINDING_STATE,
					oldBindingState, bindingState));
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
		case PatternsPackage.OBJECT_VARIABLE__CONSTRAINT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConstraint()).basicAdd(otherEnd, msgs);
		case PatternsPackage.OBJECT_VARIABLE__PATTERN:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetPattern((StoryPattern) otherEnd, msgs);
		case PatternsPackage.OBJECT_VARIABLE__INCOMING_LINK:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomingLink()).basicAdd(otherEnd, msgs);
		case PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoingLink()).basicAdd(otherEnd, msgs);
		case PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAttributeAssignment()).basicAdd(otherEnd,
					msgs);
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
		case PatternsPackage.OBJECT_VARIABLE__CONSTRAINT:
			return ((InternalEList<?>) getConstraint()).basicRemove(otherEnd, msgs);
		case PatternsPackage.OBJECT_VARIABLE__BINDING_EXPRESSION:
			return basicSetBindingExpression(null, msgs);
		case PatternsPackage.OBJECT_VARIABLE__PATTERN:
			return basicSetPattern(null, msgs);
		case PatternsPackage.OBJECT_VARIABLE__INCOMING_LINK:
			return ((InternalEList<?>) getIncomingLink()).basicRemove(otherEnd, msgs);
		case PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK:
			return ((InternalEList<?>) getOutgoingLink()).basicRemove(otherEnd, msgs);
		case PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT:
			return ((InternalEList<?>) getAttributeAssignment()).basicRemove(otherEnd, msgs);
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
		case PatternsPackage.OBJECT_VARIABLE__PATTERN:
			return eInternalContainer().eInverseRemove(this, PatternsPackage.STORY_PATTERN__OBJECT_VARIABLE,
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
		case PatternsPackage.OBJECT_VARIABLE__NAME:
			return getName();
		case PatternsPackage.OBJECT_VARIABLE__CONSTRAINT:
			return getConstraint();
		case PatternsPackage.OBJECT_VARIABLE__BINDING_EXPRESSION:
			return getBindingExpression();
		case PatternsPackage.OBJECT_VARIABLE__PATTERN:
			return getPattern();
		case PatternsPackage.OBJECT_VARIABLE__INCOMING_LINK:
			return getIncomingLink();
		case PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK:
			return getOutgoingLink();
		case PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT:
			return getAttributeAssignment();
		case PatternsPackage.OBJECT_VARIABLE__BINDING_OPERATOR:
			return getBindingOperator();
		case PatternsPackage.OBJECT_VARIABLE__BINDING_SEMANTICS:
			return getBindingSemantics();
		case PatternsPackage.OBJECT_VARIABLE__BINDING_STATE:
			return getBindingState();
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
		case PatternsPackage.OBJECT_VARIABLE__NAME:
			setName((String) newValue);
			return;
		case PatternsPackage.OBJECT_VARIABLE__CONSTRAINT:
			getConstraint().clear();
			getConstraint().addAll((Collection<? extends Constraint>) newValue);
			return;
		case PatternsPackage.OBJECT_VARIABLE__BINDING_EXPRESSION:
			setBindingExpression((Expression) newValue);
			return;
		case PatternsPackage.OBJECT_VARIABLE__PATTERN:
			setPattern((StoryPattern) newValue);
			return;
		case PatternsPackage.OBJECT_VARIABLE__INCOMING_LINK:
			getIncomingLink().clear();
			getIncomingLink().addAll((Collection<? extends LinkVariable>) newValue);
			return;
		case PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK:
			getOutgoingLink().clear();
			getOutgoingLink().addAll((Collection<? extends LinkVariable>) newValue);
			return;
		case PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT:
			getAttributeAssignment().clear();
			getAttributeAssignment().addAll((Collection<? extends AttributeAssignment>) newValue);
			return;
		case PatternsPackage.OBJECT_VARIABLE__BINDING_OPERATOR:
			setBindingOperator((BindingOperator) newValue);
			return;
		case PatternsPackage.OBJECT_VARIABLE__BINDING_SEMANTICS:
			setBindingSemantics((BindingSemantics) newValue);
			return;
		case PatternsPackage.OBJECT_VARIABLE__BINDING_STATE:
			setBindingState((BindingState) newValue);
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
		case PatternsPackage.OBJECT_VARIABLE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PatternsPackage.OBJECT_VARIABLE__CONSTRAINT:
			getConstraint().clear();
			return;
		case PatternsPackage.OBJECT_VARIABLE__BINDING_EXPRESSION:
			setBindingExpression((Expression) null);
			return;
		case PatternsPackage.OBJECT_VARIABLE__PATTERN:
			setPattern((StoryPattern) null);
			return;
		case PatternsPackage.OBJECT_VARIABLE__INCOMING_LINK:
			getIncomingLink().clear();
			return;
		case PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK:
			getOutgoingLink().clear();
			return;
		case PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT:
			getAttributeAssignment().clear();
			return;
		case PatternsPackage.OBJECT_VARIABLE__BINDING_OPERATOR:
			setBindingOperator(BINDING_OPERATOR_EDEFAULT);
			return;
		case PatternsPackage.OBJECT_VARIABLE__BINDING_SEMANTICS:
			setBindingSemantics(BINDING_SEMANTICS_EDEFAULT);
			return;
		case PatternsPackage.OBJECT_VARIABLE__BINDING_STATE:
			setBindingState(BINDING_STATE_EDEFAULT);
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
		case PatternsPackage.OBJECT_VARIABLE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PatternsPackage.OBJECT_VARIABLE__CONSTRAINT:
			return constraint != null && !constraint.isEmpty();
		case PatternsPackage.OBJECT_VARIABLE__BINDING_EXPRESSION:
			return bindingExpression != null;
		case PatternsPackage.OBJECT_VARIABLE__PATTERN:
			return getPattern() != null;
		case PatternsPackage.OBJECT_VARIABLE__INCOMING_LINK:
			return incomingLink != null && !incomingLink.isEmpty();
		case PatternsPackage.OBJECT_VARIABLE__OUTGOING_LINK:
			return outgoingLink != null && !outgoingLink.isEmpty();
		case PatternsPackage.OBJECT_VARIABLE__ATTRIBUTE_ASSIGNMENT:
			return attributeAssignment != null && !attributeAssignment.isEmpty();
		case PatternsPackage.OBJECT_VARIABLE__BINDING_OPERATOR:
			return bindingOperator != BINDING_OPERATOR_EDEFAULT;
		case PatternsPackage.OBJECT_VARIABLE__BINDING_SEMANTICS:
			return bindingSemantics != BINDING_SEMANTICS_EDEFAULT;
		case PatternsPackage.OBJECT_VARIABLE__BINDING_STATE:
			return bindingState != BINDING_STATE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
			case PatternsPackage.OBJECT_VARIABLE__NAME:
				return SDMLanguagePackage.NAMED_ELEMENT__NAME;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
			case SDMLanguagePackage.NAMED_ELEMENT__NAME:
				return PatternsPackage.OBJECT_VARIABLE__NAME;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", bindingOperator: ");
		result.append(bindingOperator);
		result.append(", bindingSemantics: ");
		result.append(bindingSemantics);
		result.append(", bindingState: ");
		result.append(bindingState);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ObjectVariableImpl
