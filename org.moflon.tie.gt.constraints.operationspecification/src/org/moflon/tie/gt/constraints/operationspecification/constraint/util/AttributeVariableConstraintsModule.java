package org.moflon.tie.gt.constraints.operationspecification.constraint.util;

import org.eclipse.emf.ecore.util.Switch;
import org.gervarro.democles.constraint.emf.EMFConstraintModule;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.VariableType;
import org.gervarro.democles.specification.emf.TypeModule;
import org.moflon.tie.gt.constraints.democles.AttributeVariableConstraint;
import org.moflon.tie.gt.constraints.democles.util.DemoclesSwitch;
import org.moflon.tie.gt.constraints.operationspecification.constraint.AttributeVariableConstraintsTypeModule;

public class AttributeVariableConstraintsModule extends TypeModule<EMFConstraintModule> {

	public AttributeVariableConstraintsModule(final AttributeVariableConstraintsTypeModule typeModule) {
		super(typeModule);
	}

	@Override
	protected Switch<VariableType> createVariableTypeSwitch() {
		return null;
	}

	@Override
	protected Switch<ConstraintType> createConstraintTypeSwitch() {
		return new AttributeVariableConstraintsTypeSwitch();
	}

	private class AttributeVariableConstraintsTypeSwitch extends DemoclesSwitch<ConstraintType> {

		@Override
		public ConstraintType caseAttributeVariableConstraint(final AttributeVariableConstraint object) {
			return ((AttributeVariableConstraintsTypeModule) typeModule).getConstraintType(object);
		}

	}
}
