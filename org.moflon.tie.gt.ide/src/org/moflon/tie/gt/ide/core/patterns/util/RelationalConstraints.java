package org.moflon.tie.gt.ide.core.patterns.util;

import org.eclipse.core.runtime.MultiStatus;
import org.emoflon.ibex.gt.editor.gT.EditorAttribute;
import org.emoflon.ibex.gt.editor.gT.EditorRelation;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.ConstraintVariable;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.constraint.relational.Equal;
import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraint;
import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintFactory;
import org.gervarro.democles.specification.emf.constraint.relational.Unequal;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;

/**
 * Utility methods related to {@link RelationalConstraint}
 * 
 * @author Roland Kluge - Initial implementation
 *
 */
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
			TransformationExceptions.recordError(transformationStatus, "Unsupported relation %s",
					relation);
			return null;
		}
	}

	public static Equal addEqual(final ConstraintVariable lhsVariable,
			final ConstraintVariable rhsVariable, final PatternBody body) {
		final Equal equal = createEqual(lhsVariable, rhsVariable);
		Patterns.addConstraint(equal, body);

		return equal;
	}
	public static Unequal addUnequal(final ConstraintVariable lhsVariable,
			final ConstraintVariable rhsVariable, final PatternBody body) {
		final Unequal unequal = createUnequal(lhsVariable, rhsVariable);
		Patterns.addConstraint(unequal, body);

		return unequal;
	}

	private static Unequal createUnequal(final ConstraintVariable source, final ConstraintVariable target) {
		final Unequal unequal = RelationalConstraintFactory.eINSTANCE.createUnequal();
		final ConstraintParameter sourceConstr = ConstraintParameters.create(source);
		final ConstraintParameter targetConstr = ConstraintParameters.create(target);
		unequal.getParameters().add(targetConstr);
		unequal.getParameters().add(sourceConstr);
		return unequal;
	}
	
	private static Equal createEqual(final ConstraintVariable source, final ConstraintVariable target) {
		final Equal equal = RelationalConstraintFactory.eINSTANCE.createEqual();
		final ConstraintParameter sourceConstr = ConstraintParameters.create(source);
		final ConstraintParameter targetConstr = ConstraintParameters.create(target);
		equal.getParameters().add(targetConstr);
		equal.getParameters().add(sourceConstr);
		return equal;
	}

}
