package org.moflon.tie.gt.compiler.democles.searchplan;

import static org.moflon.tie.gt.compiler.democles.util.ConstraintUtil.isConstraint;
import static org.moflon.tie.gt.compiler.democles.util.ConstraintUtil.isEqual;
import static org.moflon.tie.gt.compiler.democles.util.TemplateUtil.createChain;

import org.gervarro.democles.codegen.Chain;
import org.gervarro.democles.codegen.CodeGeneratorProvider;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.TemplateController;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.constraint.CoreConstraintType;
import org.gervarro.democles.specification.Constraint;
import org.gervarro.democles.specification.ConstraintType;
import org.moflon.tie.gt.compiler.democles.pattern.Adornments;
import org.moflon.tie.gt.compiler.democles.util.ConstraintUtil;
import org.moflon.tie.gt.compiler.democles.util.ExceptionUtil;

public class AssignmentTemplateProvider implements CodeGeneratorProvider<Chain<TemplateController>> {

	@Override
	public final Chain<TemplateController> getTemplateController(final GeneratorOperation operation,
			final Chain<TemplateController> tail) {
		final Adornment adornment = operation.getPrecondition();
		if (adornment.equals(Adornments.FB)) {
			final ConstraintType type = (ConstraintType) operation.getType();
			if (isEqual(type)) {
				final Object origin = operation.getOrigin();
				if (isConstraint(origin)) {
					final Constraint constraint = (Constraint) origin;
					if (ConstraintUtil.requiresTypeCheck(constraint))
						return createChain("/assignment/AssignWithTypeCheck", operation, tail);
				}

				if (operation.isAlwaysSuccessful()) {
					return createChain("/assignment/Assign", operation, tail);
				} else {
					return createChain("/assignment/AssignWithNullCheck", operation, tail);
				}
			}
		}
		throw ExceptionUtil.createIllegalArgumentException("Cannot handle operation: %", operation);
	}

	@Override
	public final boolean isResponsibleFor(final GeneratorOperation operation) {
		return operation != null && operation.getType() instanceof CoreConstraintType;
	}
}
