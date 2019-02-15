package org.moflon.tie.gt.ide.core.patterns.util;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;
import org.moflon.core.utilities.WorkspaceHelper;

/**
 * Convenience methods for reporting problems during the transformation
 * 
 * @author Roland Kluge - Initial implementation
 *
 */
public final class TransformationExceptions {

	/**
	 * Disabled utility class constructor
	 */
	private TransformationExceptions() {
		throw new UtilityClassNotInstantiableException();
	}

	/**
	 * Adds an {@link IStatus} with level {@link IStatus#ERROR} to the given
	 * {@link MultiStatus} object. The message of the status object is created from
	 * the format string and the arguments list.
	 * 
	 * @param parentStatus the {@link MultiStatus} to which the new status will be
	 *                     added
	 * @param message      the format string representing the message
	 * @param arguments    the arguments of the format string.
	 */
	public static void recordError(final MultiStatus parentStatus, final String message, final Object... arguments) {
		final IStatus status = createError(message, arguments);
		parentStatus.add(status);
	}

	/**
	 * Creates an error {@link Status} from the given format string and arguments
	 * 
	 * @param message   the format string
	 * @param arguments the arguments
	 * @return the error status
	 */
	public static IStatus createError(final String message, final Object... arguments) {
		return createStatus(IStatus.ERROR, message, arguments);
	}

	/**
	 * Adds an {@link IStatus} with level {@link IStatus#WARNING} to the given
	 * {@link MultiStatus} object. The message of the status object is created from
	 * the format string and the arguments list.
	 * 
	 * @param parentStatus the {@link MultiStatus} to which the new status will be
	 *                     added
	 * @param message      the format string representing the message
	 * @param arguments    the arguments of the format string.
	 */
	public static void recordWarning(final MultiStatus parentStatus, final String message, final String arguments) {
		final IStatus status = createStatus(IStatus.WARNING, message, arguments);
		parentStatus.add(status);
	}

	/**
	 * Adds an {@link IStatus} with the given severity level to the given
	 * {@link MultiStatus} object. The message of the status object is created from
	 * the format string and the arguments list.
	 * 
	 * @param severity  the severity level
	 * @param message   the format string representing the message
	 * @param arguments the arguments of the format string.
	 * @return
	 */
	private static IStatus createStatus(final int severity, final String message, final Object... arguments) {
		final String detailedMessage = String.format(message, arguments);
		return new Status(severity, WorkspaceHelper.getPluginId(TransformationExceptions.class), detailedMessage);
	}

}
