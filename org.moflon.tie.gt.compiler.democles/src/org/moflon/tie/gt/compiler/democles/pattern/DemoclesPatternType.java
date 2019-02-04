package org.moflon.tie.gt.compiler.democles.pattern;

import org.moflon.tie.gt.compiler.democles.util.ExceptionUtil;

/**
 * Represents the different patterns that jointly form a graph transformation
 * rule
 * 
 * @author Roland Kluge - Initial implementation
 *
 */
public enum DemoclesPatternType {
	/**
	 * Represents the LHS of a rule
	 */
	BLACK_PATTERN,
	/**
	 * Represents those elements of the LHS of a rule that are not in the RHS
	 */
	RED_PATTERN,
	/**
	 * Represents those elements of the RHS of a rule that are not in the LHS
	 */
	GREEN_PATTERN,
	/**
	 * This pattern type is used in return statements (returns a single value
	 * instead of a match)
	 */
	EXPRESSION_PATTERN,
	/**
	 * This pattern type binds variables based on given variables instead of
	 * matching them in a model
	 */
	BINDING_PATTERN,
	/**
	 * Combines a binding with the corresponding black pattern
	 */
	BINDING_AND_BLACK_PATTERN;

	public static final String CONTROL_FLOW_FILE_EXTENSION = "cf";
	public static final String BINDING_AND_BLACK_FILE_EXTENSION = "bindingAndBlack";
	public static final String BLACK_FILE_EXTENSION = "black";
	public static final String RED_FILE_EXTENSION = "red";
	public static final String GREEN_FILE_EXTENSION = "green";
	public static final String BINDING_FILE_EXTENSION = "binding";
	public static final String EXPRESSION_FILE_EXTENSION = "expression";

	/**
	 * Maps this object to the corresponding constants in
	 * {@link DemoclesMethodBodyHandler}
	 * 
	 * @return the corresponding string constant
	 */
	public String getSuffix() {
		switch (this) {
		case BLACK_PATTERN:
			return DemoclesPatternType.BLACK_FILE_EXTENSION;
		case GREEN_PATTERN:
			return DemoclesPatternType.GREEN_FILE_EXTENSION;
		case RED_PATTERN:
			return DemoclesPatternType.RED_FILE_EXTENSION;
		case BINDING_PATTERN:
			return DemoclesPatternType.BINDING_FILE_EXTENSION;
		case BINDING_AND_BLACK_PATTERN:
			return DemoclesPatternType.BINDING_AND_BLACK_FILE_EXTENSION;
		case EXPRESSION_PATTERN:
			return DemoclesPatternType.EXPRESSION_FILE_EXTENSION;
		default:
			throw ExceptionUtil.createIllegalArgumentException("No suffix registered for %s.", this);
		}
	}

	/**
	 * @return true iff this is {@link #BLACK_PATTERN}
	 */
	public boolean isBlack() {
		return this == BLACK_PATTERN;
	}

	/**
	 * @return true iff this is {@link #RED_PATTERN}
	 */
	public boolean isRed() {
		return this == RED_PATTERN;
	}

	/**
	 * @return true iff this is {@link #GREEN_PATTERN}
	 */
	public boolean isGreen() {
		return this == GREEN_PATTERN;
	}

	/**
	 * @return true iff this is {@link #BINDING_PATTERN}
	 */
	public boolean isBinding() {
		return this == BINDING_PATTERN;
	}

	/**
	 * @return true iff this is {@link #BINDING_AND_BLACK_PATTERN}
	 */
	public boolean isBindingAndBlack() {
		return this == BINDING_AND_BLACK_PATTERN;
	}

	/**
	 * @return true iff this is {@link #EXPRESSION_PATTERN}
	 */
	public boolean isExpression() {
		return this == EXPRESSION_PATTERN;
	}
}