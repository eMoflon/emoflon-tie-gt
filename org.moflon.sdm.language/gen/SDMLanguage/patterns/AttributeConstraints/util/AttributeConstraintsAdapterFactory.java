/**
 */
package SDMLanguage.patterns.AttributeConstraints.util;

import SDMLanguage.CommentableElement;

import SDMLanguage.expressions.Expression;

import SDMLanguage.patterns.AttributeConstraints.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage
 * @generated
 */
public class AttributeConstraintsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AttributeConstraintsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AttributeConstraintsPackage.eINSTANCE;
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
	protected AttributeConstraintsSwitch<Adapter> modelSwitch = new AttributeConstraintsSwitch<Adapter>() {
		@Override
		public Adapter caseAssignmentConstraint(AssignmentConstraint object) {
			return createAssignmentConstraintAdapter();
		}

		@Override
		public Adapter caseAttributeConstraint(AttributeConstraint object) {
			return createAttributeConstraintAdapter();
		}

		@Override
		public Adapter caseAttributeConstraintExpression(AttributeConstraintExpression object) {
			return createAttributeConstraintExpressionAdapter();
		}

		@Override
		public Adapter caseAttributeConstraintVariable(AttributeConstraintVariable object) {
			return createAttributeConstraintVariableAdapter();
		}

		@Override
		public Adapter caseAttributeLookupConstraint(AttributeLookupConstraint object) {
			return createAttributeLookupConstraintAdapter();
		}

		@Override
		public Adapter caseAttributeValueConstraint(AttributeValueConstraint object) {
			return createAttributeValueConstraintAdapter();
		}

		@Override
		public Adapter caseCspConstraint(CspConstraint object) {
			return createCspConstraintAdapter();
		}

		@Override
		public Adapter caseLiteralVariable(LiteralVariable object) {
			return createLiteralVariableAdapter();
		}

		@Override
		public Adapter casePrimitiveVariable(PrimitiveVariable object) {
			return createPrimitiveVariableAdapter();
		}

		@Override
		public Adapter caseCspConstraintVariableReference(CspConstraintVariableReference object) {
			return createCspConstraintVariableReferenceAdapter();
		}

		@Override
		public Adapter caseCommentableElement(CommentableElement object) {
			return createCommentableElementAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
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
	 * Creates a new adapter for an object of class '{@link SDMLanguage.patterns.AttributeConstraints.AssignmentConstraint <em>Assignment Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SDMLanguage.patterns.AttributeConstraints.AssignmentConstraint
	 * @generated
	 */
	public Adapter createAssignmentConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraint <em>Attribute Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraint
	 * @generated
	 */
	public Adapter createAttributeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraintExpression <em>Attribute Constraint Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintExpression
	 * @generated
	 */
	public Adapter createAttributeConstraintExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable <em>Attribute Constraint Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintVariable
	 * @generated
	 */
	public Adapter createAttributeConstraintVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SDMLanguage.patterns.AttributeConstraints.AttributeLookupConstraint <em>Attribute Lookup Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeLookupConstraint
	 * @generated
	 */
	public Adapter createAttributeLookupConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SDMLanguage.patterns.AttributeConstraints.AttributeValueConstraint <em>Attribute Value Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeValueConstraint
	 * @generated
	 */
	public Adapter createAttributeValueConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SDMLanguage.patterns.AttributeConstraints.CspConstraint <em>Csp Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SDMLanguage.patterns.AttributeConstraints.CspConstraint
	 * @generated
	 */
	public Adapter createCspConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SDMLanguage.patterns.AttributeConstraints.LiteralVariable <em>Literal Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SDMLanguage.patterns.AttributeConstraints.LiteralVariable
	 * @generated
	 */
	public Adapter createLiteralVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SDMLanguage.patterns.AttributeConstraints.PrimitiveVariable <em>Primitive Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SDMLanguage.patterns.AttributeConstraints.PrimitiveVariable
	 * @generated
	 */
	public Adapter createPrimitiveVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SDMLanguage.patterns.AttributeConstraints.CspConstraintVariableReference <em>Csp Constraint Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SDMLanguage.patterns.AttributeConstraints.CspConstraintVariableReference
	 * @generated
	 */
	public Adapter createCspConstraintVariableReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SDMLanguage.CommentableElement <em>Commentable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SDMLanguage.CommentableElement
	 * @generated
	 */
	public Adapter createCommentableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SDMLanguage.expressions.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SDMLanguage.expressions.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
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

} //AttributeConstraintsAdapterFactory
