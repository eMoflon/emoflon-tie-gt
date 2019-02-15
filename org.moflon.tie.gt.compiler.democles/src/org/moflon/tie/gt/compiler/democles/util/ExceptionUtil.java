package org.moflon.tie.gt.compiler.democles.util;

import org.moflon.core.utilities.UtilityClassNotInstantiableException;

public final class ExceptionUtil {

	private ExceptionUtil() {
		throw new UtilityClassNotInstantiableException();
	}

	/**
	 * Creates an {@link IllegalArgumentException} with a message resulting from
	 * formatting the given format string with the given format arguments
	 * 
	 * @param formatString
	 * @param formatArguments
	 * @return the exception object
	 */
	public static IllegalArgumentException createIllegalArgumentException(final String formatString,
			final Object... formatArguments) {
		return new IllegalArgumentException(String.format(formatString, formatArguments));
	}
}
