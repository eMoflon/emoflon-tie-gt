package org.moflon.codegen.preferences;

import org.moflon.core.preferences.EMoflonPreferencesActivator;

public class TieGtCodeGenerationPreferences {

	/**
	 * Indicates unbounded adornment size for {@link #getMaximumAdornmentSize()}
	 */
	public static final int REACHABILITY_MAX_ADORNMENT_SIZE_INFINITY = 0;

	/**
	 * Default value for {@link #getMaximumAdornmentSize()}
	 */
	public static final int DEFAULT_REACHABILITY_MAX_ADORNMENT_SIZE = REACHABILITY_MAX_ADORNMENT_SIZE_INFINITY;

	/**
	 * Default value for {@link #getReachabilityEnabled()}
	 */
	public static final boolean DEFAULT_REACHABILITIY_IS_ENABLED = true;

	/**
	 * Stores the configured validation timeout in milliseconds. 'null' if not set.
	 */
	private static final String VALIDATION_TIMEOUT_KEY = "org.moflon.tie.gt.validation.timeout";

	/**
	 * Stores the configured maximum adornment size. 'null' if not set
	 */
	private static final String REACHABILITY_ANALYSIS_MAXIMUM_ADORNMENT_SIZE_KEY = "org.moflon.tie.gt.reachability.maxadornmentsize";

	/**
	 * Stores whether reachability analysis is active. 'null' if not set
	 */
	private static final String REACHABILITY_ENABLED_KEY = "org.moflon.tie.gt.reachability.enabled";

	/**
	 * Returns the timeout for the reachability validation (in milliseconds)
	 * 
	 * @return the validation timeout
	 */
	public static int getValidationTimeout() {
		return EMoflonPreferencesActivator.getDefault().getPreferencesStorage().getInt(VALIDATION_TIMEOUT_KEY);
	}

	/**
	 * Sets the maximum size of adornments that should be analyzed using the
	 * reachability analysis
	 * 
	 * @param maximumAdornmentSize the maximum adornment size
	 */
	public static void setReachabilityMaximumAdornmentSize(final int maximumAdornmentSize) {
		EMoflonPreferencesActivator.getDefault().getPreferencesStorage()
				.put(REACHABILITY_ANALYSIS_MAXIMUM_ADORNMENT_SIZE_KEY, maximumAdornmentSize);
	}

	/**
	 * @return the maximum size of adornments to analyze using reachability analysis
	 * @see #setReachabilityMaximumAdornmentSize(int)
	 */
	public static int getMaximumAdornmentSize() {
		final Integer storedValue = EMoflonPreferencesActivator.getDefault().getPreferencesStorage()
				.getInt(REACHABILITY_ANALYSIS_MAXIMUM_ADORNMENT_SIZE_KEY);
		return storedValue == null ? DEFAULT_REACHABILITY_MAX_ADORNMENT_SIZE : storedValue;
	}

	/**
	 * Enables or disables the reachability analysis
	 * 
	 * @param reachabilityEnabled true if the reachability analysis shall be
	 *                            enabled, false otherwise
	 */
	public static void setReachabilityEnabled(final boolean reachabilityEnabled) {
		EMoflonPreferencesActivator.getDefault().getPreferencesStorage().put(REACHABILITY_ENABLED_KEY,
				reachabilityEnabled);
	}

	/**
	 * @return true if the reachability analysis shall be enabled, false otherwise
	 * @see #setReachabilityEnabled(boolean)
	 */
	public static boolean getReachabilityEnabled() {
		final Boolean storedValue = EMoflonPreferencesActivator.getDefault().getPreferencesStorage()
				.getBoolean(REACHABILITY_ENABLED_KEY);
		return storedValue == null ? DEFAULT_REACHABILITIY_IS_ENABLED : storedValue;
	}
}
