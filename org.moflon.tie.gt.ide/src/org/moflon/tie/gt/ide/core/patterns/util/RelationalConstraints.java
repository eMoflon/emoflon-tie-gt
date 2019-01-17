package org.moflon.tie.gt.ide.core.patterns.util;

import org.eclipse.core.runtime.MultiStatus;
import org.emoflon.ibex.gt.editor.gT.EditorAttribute;
import org.emoflon.ibex.gt.editor.gT.EditorRelation;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.ConstraintVariable;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.constraint.relational.Equal;
import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraint;
import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintFactory;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;

public final class RelationalConstraints {
	private RelationalConstraints() {
		throw new UtilityClassNotInstantiableException();
	}

	/**
	 * Returns an instance of a Democles relational constraint that corresponds to
	 * the relational constraint of the given {@link EditorAttribute}
	 * 
	 * @param attribute            the editor attribute
	 * @param transformationStatus
	 * @return the corresponding relational constraint or <code>null</code> if none
	 *         exists
	 */
	public static RelationalConstraint createRelationalConstraint(final EditorAttribute attribute,
			final MultiStatus transformationStatus) {
		final RelationalConstraintFactory factory = RelationalConstraintFactory.eINSTANCE;
		final EditorRelation relation = attribute.getRelation();
		switch (relation) {
		case EQUAL:
			return factory.createEqual();
		case GREATER:
			return factory.createLarger();
		case SMALLER:
			return factory.createSmaller();
		case GREATER_OR_EQUAL:
			return factory.createLargerOrEqual();
		case SMALLER_OR_EQUAL:
			return factory.createSmallerOrEqual();
		case UNEQUAL:
			return factory.createUnequal();
		case ASSIGNMENT:
			return factory.createEqual();
		default:
			TransformationExceptions.recordTransformationErrorMessage(transformationStatus,
					"Unsupported relation %s", relation);
			return null;
		}
	}

	public static Equal createEqualConstraint(final ConstraintVariable source, final ConstraintVariable target) {
		final Equal equal = RelationalConstraintFactory.eINSTANCE.createEqual();
		final ConstraintParameter sourceConstr = SpecificationFactory.eINSTANCE.createConstraintParameter();
		sourceConstr.setReference(source);
		final ConstraintParameter targetConstr = SpecificationFactory.eINSTANCE.createConstraintParameter();
		targetConstr.setReference(target);
		equal.getParameters().add(targetConstr);
		equal.getParameters().add(sourceConstr);
		return equal;
	}

	public static Equal createAndRegisterEqualConstraint(final ConstraintVariable lhsVariable,
			final ConstraintVariable rhsVariable, final PatternBody body) {
		final Equal equal = createEqualConstraint(lhsVariable, rhsVariable);
		body.getConstraints().add(equal);

		return equal;
	}

}
