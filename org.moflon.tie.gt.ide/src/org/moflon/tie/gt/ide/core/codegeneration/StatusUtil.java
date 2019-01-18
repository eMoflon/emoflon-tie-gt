package org.moflon.tie.gt.ide.core.codegeneration;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;

/**
 * Utility methods for working with {@link IStatus} objects
 * 
 * @author Roland Kluge - Initial implementation
 */
public final class StatusUtil {

	/**
	 * Disabled utility class constructor
	 */
	private StatusUtil() {
		throw new UtilityClassNotInstantiableException();
	}

	/**
	 * Returns {@link Status#OK_STATUS} if the given status is OK, else the given
	 * status.
	 * 
	 * @param status the status to check
	 * @return status if it is not OK, else {@link Status#OK_STATUS}
	 */
	public static IStatus returnIfNotOK(final IStatus status) {
		return status.isOK() ? Status.OK_STATUS : status;
	}

	/**
	 * Adds the given single {@link IStatus} to the given {@link MultiStatus} if it
	 * is not OK.
	 * 
	 * @param singleStatus   the single status
	 * @param combinedStatus the combined status
	 * @return whether the {@link MultiStatus} has errors after adding the single
	 *         {@link Status}
	 */
	public static boolean addAndCheckForErrors(final IStatus singleStatus, final MultiStatus combinedStatus) {
		if (!singleStatus.isOK())
			combinedStatus.add(singleStatus);
		return hasErrors(combinedStatus);
	}

	/**
	 * @param status the status
	 * @return whether the given status matches {@link IStatus#ERROR}
	 */
	public static boolean hasErrors(final IStatus status) {
		return status.matches(IStatus.ERROR);
	}
}