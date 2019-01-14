package org.moflon.compiler.sdm.democles.attributes;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.runtime.SearchPlanOperation;
import org.gervarro.democles.constraint.CoreConstraintModule;
import org.gervarro.democles.constraint.PatternInvocationConstraintType;
import org.gervarro.democles.constraint.emf.EMFConstraint;
import org.gervarro.democles.constraint.emf.Operation;
import org.gervarro.democles.constraint.emf.Reference;
import org.gervarro.democles.constraint.emf.StructuralFeature;
import org.gervarro.democles.plan.WeightedOperation;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.impl.Constraint;
import org.gervarro.democles.specification.impl.Variable;
import org.moflon.compiler.sdm.democles.pattern.Adornments;
import org.moflon.compiler.sdm.democles.searchplan.TieGtWeightedOperationBuilder;
import org.moflon.sdm.constraints.operationspecification.ConstraintSpecification;

/**
 * Assigns weights to operations in the context of complex attribute constraints
 * 
 * @author Frederik Deckwerth - Initial implementation
 *
 */
//TODO@rkluge: This builder will only be queried for a subset of the given operations
public class AttributeEnabledWeightedOperationBuilder implements TieGtWeightedOperationBuilder {

	@Override
	public WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer> createSearchPlanOperation(
			final SearchPlanOperation<GeneratorOperation> operation) {

		final Integer weight = getWeight(operation);
		if (weight != null) {
			return WeightedOperation.createOperation(operation, weight);
		} else {
			return null;
		}

	}

	public Integer getWeight(final SearchPlanOperation<GeneratorOperation> operation) {
		final Adornment adornment = operation.getPrecondition();
		final Object object = operation.getOrigin();
		if (object instanceof Constraint) {
			final Constraint constraint = (Constraint) object;
			final ConstraintType constraintType = constraint.getType();

			if (adornment.numberOfFrees() == 0) {
				if (constraintType instanceof PatternInvocationConstraintType) {
					return 5;
				}
				if (constraintType instanceof EMFConstraint<?>) {
					return -5;
				}
				return -10;
			}

			if (constraintType instanceof Reference && ((Reference) constraintType).isBidirectional()) {
				final Reference emfType = (Reference) constraintType;
				if (Adornments.equals(adornment, "BF")) {
					final int upperBound = emfType.getLinkedElement().getUpperBound();
					return upperBound > 1 || upperBound == EStructuralFeature.UNBOUNDED_MULTIPLICITY ? 10 : 1;
				} else if (Adornments.equals(adornment, "FB")) {
					final EReference opposite = emfType.getLinkedElement().getEOpposite();
					final int upperBound = opposite.getUpperBound();
					return upperBound > 1 || upperBound == EStructuralFeature.UNBOUNDED_MULTIPLICITY ? 10 : 1;
				}
			} else if (constraintType instanceof StructuralFeature<?>) {
				final StructuralFeature<?> emfType = (StructuralFeature<?>) constraintType;
				if (Adornments.equals(adornment, "BF")) {
					final int upperBound = emfType.getLinkedElement().getUpperBound();
					return upperBound > 1 || upperBound == EStructuralFeature.UNBOUNDED_MULTIPLICITY ? 10 : 1;
				}
			} else if (constraintType instanceof Operation) {
				return -5;
			} else if (constraintType == CoreConstraintModule.EQUAL) {
				return -5;
			} else if (constraintType instanceof ConstraintSpecification) {
				return 100;
			}

		} else if (object instanceof Variable) {
			return -5;
		}

		return null;
	}

}
