package org.moflon.tie.gt.ide.core.patterns;

import org.moflon.compiler.sdm.democles.DemoclesMethodBodyHandler;

/**
 * Represents the different patterns that jointly form a graph transformation
 * rule
 * 
 * @author Roland Kluge - Initial implementation
 *
 */
public enum PatternType {
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

	/**
	 * Maps this object to the corresponding constants in
	 * {@link DemoclesMethodBodyHandler}
	 * 
	 * @return the corresponding string constant
	 */
	public String getSuffix() {
		switch (this) {
		case BLACK_PATTERN:
			return DemoclesMethodBodyHandler.BLACK_FILE_EXTENSION;
		case GREEN_PATTERN:
			return DemoclesMethodBodyHandler.GREEN_FILE_EXTENSION;
		case RED_PATTERN:
			return DemoclesMethodBodyHandler.RED_FILE_EXTENSION;
		case BINDING_PATTERN:
			return DemoclesMethodBodyHandler.BINDING_FILE_EXTENSION;
		case BINDING_AND_BLACK_PATTERN:
			return DemoclesMethodBodyHandler.BINDING_AND_BLACK_FILE_EXTENSION;
		case EXPRESSION_PATTERN:
			return DemoclesMethodBodyHandler.EXPRESSION_FILE_EXTENSION;
		default:
			throw new IllegalArgumentException(String.format("No suffix registered for %s.", this));
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