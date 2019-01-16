package org.moflon.tie.gt.compiler.democles.searchplan;

import java.util.LinkedList;
import java.util.List;

import org.gervarro.democles.codegen.CompilableAdornedOperation;
import org.gervarro.democles.common.runtime.SpecificationExtendedVariableRuntime;
import org.gervarro.democles.constraint.CoreConstraintModule;
import org.gervarro.democles.specification.ConstraintType;
import org.moflon.tie.gt.compiler.democles.pattern.Adornments;

public class BindingAssignmentOperationBuilder extends AssignmentOperationBuilder {

	@Override
	public List<CompilableAdornedOperation> getConstraintOperation(final ConstraintType constraint,
			final List<? extends SpecificationExtendedVariableRuntime> parameters) {
		if (constraint == CoreConstraintModule.EQUAL) {
			final List<CompilableAdornedOperation> result = new LinkedList<>();
			result.add(new CompilableAdornedOperation(Adornments.create("FB"), constraint));
			return result;
		}
		return null;
	}
}
