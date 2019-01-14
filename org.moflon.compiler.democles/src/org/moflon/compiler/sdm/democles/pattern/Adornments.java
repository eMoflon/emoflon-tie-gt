package org.moflon.compiler.sdm.democles.pattern;

import org.gervarro.democles.common.Adornment;

/**
 * Convenience methods for working with pattern adornments
 * 
 * @author Roland Kluge - Initial implementation
 */
public class Adornments {

	/**
	 * Human-readable symbol for free adornment
	 */
	public static final char ADORNMENT_SYMBOL_FREE = 'F';

	/**
	 * Human-readable symbol for bound adornment
	 */
	public static final char ADORNMENT_SYMBOL_BOUND = 'B';

	/**
	 * Human-readable symbol for adornment representing an unchecked type
	 */
	public static final char ADORNMENT_SYMBOL_NOT_TYPECHECKED = 'U';

	/**
	 * Human-readable symbol for an unknown adornment value
	 */
	public static final char ADORNMENT_SYMBOL_UNKNOWN = '?';

	// TODO@rkluge: Refactoring shorten
	public static Adornment create(final String adornmentString) {
		final int[] bindings = new int[adornmentString.length()];
		for (int i = 0; i < adornmentString.length(); i++) {
			bindings[i] = mapCharacterToAdornment(adornmentString.charAt(i));
		}
		return Adornment.create(bindings);

	}

	public static Adornment createConstantAdornment(final int length, final char adornmentChar) {
		final int[] bindings = new int[length];
		final int adornment = mapCharacterToAdornment(adornmentChar);

		for (int i = 0; i < length; i++) {
			bindings[i] = adornment;
		}

		return Adornment.create(bindings);

	}

	/**
	 * Maps the given character to an integer representing the corresponding binding
	 * in an {@link Adornment}
	 * 
	 * @param adornmentChar the adornment character
	 * @return the corresponding binding value in {@link Adornment}
	 */
	private static int mapCharacterToAdornment(final char adornmentChar) {
		switch (adornmentChar) {
		case ADORNMENT_SYMBOL_FREE:
			return Adornment.FREE;
		case ADORNMENT_SYMBOL_BOUND:
			return Adornment.BOUND;
		case ADORNMENT_SYMBOL_NOT_TYPECHECKED:
			return Adornment.NOT_TYPECHECKED;
		default:
			throw new IllegalArgumentException(
					String.format("Cannot translate adornment charater '%s' to adornment value.", adornmentChar));
		}
	}

	/**
	 * Returns true if the given adornment and adornmentString are equal
	 * 
	 * @param adornment       the adornment
	 * @param adornmentString the adornment string
	 * @return whether both are equal
	 */
	public static boolean equals(final Adornment adornment, final String adornmentString) {
		return equals(adornment, create(adornmentString));
	}

	/**
	 * Returns true if the given adornments are equal
	 * 
	 * @param adornment1 the first adornment
	 * @param adornment2 the second adornment
	 * @return whether both are equal
	 */
	private static boolean equals(final Adornment adornment1, final Adornment adornment2) {
		if (adornment1.size() != adornment2.size())
			return false;

		for (int i = 0; i < adornment1.size(); i++) {
			if (adornment1.get(i) != adornment2.get(i)) {
				return false;
			}
		}

		return true;
	}

	public static String describe(final int adornmentValue) {
		switch (adornmentValue) {
		case Adornment.BOUND:
			return Character.toString(ADORNMENT_SYMBOL_BOUND);
		case Adornment.NOT_TYPECHECKED:
			return Character.toString(ADORNMENT_SYMBOL_FREE);
		case Adornment.FREE:
			return Character.toString(ADORNMENT_SYMBOL_NOT_TYPECHECKED);
		default:
			return Character.toString(ADORNMENT_SYMBOL_UNKNOWN);
		}
	}

}
