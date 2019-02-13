package org.moflon.tie.gt.compiler.democles.pattern;

import org.gervarro.democles.common.Adornment;
import org.moflon.tie.gt.controlflow.democles.VariableReference;

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

	/**
	 * Convenience constant for a B adornment
	 */
	public static final Adornment B = create("B");

	/**
	 * Convenience constant for a U adornment
	 */
	public static final Adornment U = create("U");

	/**
	 * Convenience constant for a F adornment
	 */
	public static final Adornment F = create("F");

	/**
	 * Convenience constant for a BB adornment
	 */
	public static final Adornment BB = create("BB");

	/**
	 * Convenience constant for a UB adornment
	 */
	public static final Adornment UB = create("UB");

	/**
	 * Convenience constant for a FB adornment
	 */
	public static final Adornment FB = create("FB");

	/**
	 * Convenience constant for a BF adornment
	 */
	public static final Adornment BF = create("BF");

	public static Adornment create(final String adornmentString) {
		final int[] bindings = new int[adornmentString.length()];
		for (int i = 0; i < adornmentString.length(); i++) {
			bindings[i] = mapCharacterToAdornment(adornmentString.charAt(i));
		}
		return Adornment.create(bindings);

	}

	public static Adornment createBoundAdornment(final int length) {
		return createConstantAdornment(length, ADORNMENT_SYMBOL_BOUND);
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

	public static String describe(final int adornmentValue) {
		switch (adornmentValue) {
		case Adornment.BOUND:
			return Character.toString(ADORNMENT_SYMBOL_BOUND);
		case Adornment.NOT_TYPECHECKED:
			return Character.toString(ADORNMENT_SYMBOL_NOT_TYPECHECKED);
		case Adornment.FREE:
			return Character.toString(ADORNMENT_SYMBOL_FREE);
		default:
			return Character.toString(ADORNMENT_SYMBOL_UNKNOWN);
		}
	}

	public static boolean isBound(final Adornment adornment, final int i) {
		return is(Adornment.BOUND, adornment, i);
	}

	public static boolean isFree(final Adornment adornment, final int i) {
		return is(Adornment.FREE, adornment, i);
	}

	public static boolean isNotTypechecked(final Adornment adornment, final int i) {
		return is(Adornment.NOT_TYPECHECKED, adornment, i);
	}

	public static boolean isOnlyBound(final Adornment adornment) {
		return adornment.getBoundColumns().length == adornment.size();
	}

	public static boolean is(final int adornmentValue, final Adornment adornment, final int i) {
		return adornment.get(i) == adornmentValue;
	}

	public static int getAdornmentValue(final VariableReference varRef) {
		final boolean isGreen = varRef.getInvocation().getPattern().getName().endsWith("_green");
		final boolean isAttributeValueVariable = varRef.getFrom().getName().endsWith("_prime");
		final int value;
		if (isAttributeValueVariable) {
			value = isGreen ? Adornment.BOUND : Adornment.FREE;
		} else {
			value = varRef.isFree() ? Adornment.FREE : Adornment.BOUND;
		}
		return value;
	}

}
