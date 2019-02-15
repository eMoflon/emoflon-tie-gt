package org.moflon.tie.gt.ide.core.patterns;

import org.gervarro.democles.specification.emf.PatternInvocationConstraint;

public enum ApplicationConditionType {
	NONE, NEGATIVE, POSITIVE;

	public static ApplicationConditionType getType(final PatternInvocationConstraint constraint) {
		final boolean isPositive = constraint.isPositive();
		final ApplicationConditionType applicationConditionType = isPositive ? POSITIVE : NEGATIVE;
		return applicationConditionType;
	}

}
