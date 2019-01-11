package org.moflon.compiler.sdm.democles;

import java.util.LinkedList;
import java.util.List;

import org.gervarro.democles.codegen.CompilableAdornedOperation;
import org.gervarro.democles.common.runtime.SpecificationExtendedVariableRuntime;
import org.gervarro.democles.constraint.CoreConstraintModule;
import org.gervarro.democles.specification.ConstraintType;

public class BindingAssignmentOperationBuilder extends AssignmentOperationBuilder {

	@Override
	public List<CompilableAdornedOperation> getConstraintOperation(final ConstraintType constraint,
			final List<? extends SpecificationExtendedVariableRuntime> parameters) {
		if (constraint == CoreConstraintModule.EQUAL) {
			final List<CompilableAdornedOperation> result = new LinkedList<>();
			result.add(new CompilableAdornedOperation(Adornments.createAdornment("FB"), constraint));
			return result;
		}
		return null;
	}
}
