package org.moflon.tie.gt.ide.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.moflon.core.preferences.EMoflonPreferencesStorage;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.tie.gt.compiler.democles.searchplan.CodeGenerationPreferences;

public class EMoflonPreferenceInitializer extends AbstractPreferenceInitializer {
	private static final String REACHABILITY_PREFIX = "org.moflon.tie.gt.ide.preferences.reachability";

	private static final String KEY_REACHABILITY_ENABLED = REACHABILITY_PREFIX + ".enabled";

	private static final String KEY_REACHABILITY_MAX_ADORNMENT_SIZE = REACHABILITY_PREFIX + ".maxadornmentsize";

	/**
	 * Empty default constructor
	 */
	public EMoflonPreferenceInitializer() {
		// Needed for OSGi
	}

	@Override
	public void initializeDefaultPreferences() {
		resetToDefaults();
	}

	public static void refreshEMoflonPreferencesStorage() {
		CodeGenerationPreferences.setReachabilityEnabled(getPreferences().getBoolean(KEY_REACHABILITY_ENABLED,
				CodeGenerationPreferences.DEFAULT_REACHABILITIY_IS_ENABLED));
		CodeGenerationPreferences
				.setReachabilityMaximumAdornmentSize(getPreferences().getInt(KEY_REACHABILITY_MAX_ADORNMENT_SIZE,
						CodeGenerationPreferences.REACHABILITY_MAX_ADORNMENT_SIZE_INFINITY));
	}

	/**
	 * Stores the default values to the {@link EMoflonPreferenceInitializer}
	 * singleton (as specified in {@link EMoflonPreferencesStorage}).
	 */
	public static void resetToDefaults() {
		setReachabilityEnabled(CodeGenerationPreferences.DEFAULT_REACHABILITIY_IS_ENABLED);
		setReachabilityMaxAdornmentSize(CodeGenerationPreferences.DEFAULT_REACHABILITY_MAX_ADORNMENT_SIZE);
	}

	public static void setReachabilityEnabled(final boolean isEnabled) {
		getPreferences().putBoolean(KEY_REACHABILITY_ENABLED, isEnabled);
		refreshEMoflonPreferencesStorage();
	}

	public static boolean getReachabilityEnabled() {
		return getPreferences().getBoolean(KEY_REACHABILITY_ENABLED,
				CodeGenerationPreferences.DEFAULT_REACHABILITIY_IS_ENABLED);
	}

	public static void setReachabilityMaxAdornmentSize(final int maxAdornmentSize) {
		getPreferences().putInt(KEY_REACHABILITY_MAX_ADORNMENT_SIZE, maxAdornmentSize);
		refreshEMoflonPreferencesStorage();
	}

	public static int getReachabilityMaxAdornmentSize() {
		return getPreferences().getInt(KEY_REACHABILITY_MAX_ADORNMENT_SIZE,
				CodeGenerationPreferences.DEFAULT_REACHABILITY_MAX_ADORNMENT_SIZE);
	}

	private static IEclipsePreferences getPreferences() {
		return InstanceScope.INSTANCE.getNode(WorkspaceHelper.getPluginId(EMoflonPreferenceInitializer.class));
	}
}
