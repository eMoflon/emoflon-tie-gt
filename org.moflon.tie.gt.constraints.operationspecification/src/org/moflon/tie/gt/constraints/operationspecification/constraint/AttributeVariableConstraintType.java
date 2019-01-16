package org.moflon.tie.gt.constraints.operationspecification.constraint;

import org.gervarro.democles.specification.ConstraintType;
import org.moflon.tie.gt.constraints.operationspecification.impl.ConstraintSpecificationImpl;

public class AttributeVariableConstraintType extends ConstraintSpecificationImpl implements ConstraintType {

	public final static AttributeVariableConstraintsTypeModule getModule() {
		return AttributeVariableConstraintsTypeModule.INSTANCE;
	}

}
