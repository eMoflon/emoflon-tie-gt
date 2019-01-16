/**
 */
package org.moflon.tie.gt.compiler.democles.searchplan;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.specification.emf.Pattern;
import org.moflon.core.utilities.LogUtils;
import org.moflon.core.utilities.WorkspaceHelper;

public abstract class PatternMatcher {

	/**
	 * Logger can be reused in subclasses with proper dynamic type
	 */
	protected final Logger logger = Logger.getLogger(getClass());

	public abstract IStatus generateSearchPlan(Pattern pattern, Adornment adornment, boolean isMultipleMatch);

	/**
	 * Creates a 'no search plan found' error for the given {@link Pattern} and
	 * attaches it to the {@link ValidationReport}.
	 * 
	 * @param pattern   the pattern
	 * @param report    the report
	 * @param exception details about the error message
	 */
	protected Status createAndAddErrorMessage(final Pattern pattern, final Exception exception) {
		final String detailsFragment;
		if (exception != null) {
			detailsFragment = String.format("%s occured with error message: %s.", exception.getClass(),
					exception.getMessage());
		} else {
			detailsFragment = "";
		}
		final String message = String.format(
				"No search plan found for pattern '%s'. Please ensure that your patterns are not disjunct. See also debug log. %s",
				pattern.getName(), detailsFragment);

		final String stacktrace = ExceptionUtils.getStackTrace(exception);
		LogUtils.debug(logger, "%s\nStack trace: %s", detailsFragment, stacktrace);

		return new Status(IStatus.ERROR, WorkspaceHelper.getPluginId(PatternMatcherGenerator.class), message);
	}
}
