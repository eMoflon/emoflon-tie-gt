package org.moflon.tie.gt.compiler.democles.searchplan;

import static org.moflon.tie.gt.compiler.democles.util.ConstraintUtil.isEqual;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EClassifier;
import org.gervarro.democles.codegen.CompilableAdornedOperation;
import org.gervarro.democles.common.runtime.SpecificationExtendedVariableRuntime;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.VariableType;
import org.moflon.tie.gt.compiler.democles.pattern.Adornments;
import org.moflon.tie.gt.compiler.democles.util.ConstraintUtil;

public class AssignmentOperationBuilder implements TieGtOperationBuilder {

	@Override
	public List<CompilableAdornedOperation> getConstraintOperation(final ConstraintType constraint,
			final List<? extends SpecificationExtendedVariableRuntime> parameters) {
		if (isEqual(constraint)) {
			final boolean isTypeCheckNeeded = isTypeCheckNeeded(parameters);
			final int isAlwaysSuccessfull = isTypeCheckNeeded ? 0 : CompilableAdornedOperation.ALWAYS_SUCCESSFUL;

			return Arrays.asList(new CompilableAdornedOperation(Adornments.FB, constraint, isAlwaysSuccessfull));
		}
		return null;
	}

	@Override
	public CompilableAdornedOperation getVariableOperation(final VariableType variable,
			final SpecificationExtendedVariableRuntime runtimeVariable) {
		return null;
	}

	private final boolean isTypeCheckNeeded(final List<? extends SpecificationExtendedVariableRuntime> parameters) {
		final SpecificationExtendedVariableRuntime lhsVariable = parameters.get(0);
		final SpecificationExtendedVariableRuntime rhsParameter = parameters.get(1);
		final EClassifier lhsType = ConstraintUtil.lookupEClassifier(lhsVariable);
		final EClassifier rhsType = ConstraintUtil.lookupEClassifier(rhsParameter);
		return lhsType != null && rhsType != null && ConstraintUtil.requiresTypeCheck(lhsType, rhsType);
	}

}
