package org.moflon.tie.gt.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.moflon.codegen.preferences.TieGtCodeGenerationPreferences;
import org.moflon.core.preferences.EMoflonPreferencesStorage;
import org.moflon.core.utilities.WorkspaceHelper;

public class EMoflonPreferenceInitializer extends AbstractPreferenceInitializer {
	private static final String KEY_REACHABILITY_ENABLED = "org.moflon.ide.ui.preferences.ReachabilityEnabled";

	private static final String KEY_REACHABILITY_MAX_ADORNMENT_SIZE = "org.moflon.ide.ui.preferences.ReachabilityMaxAdornmentSize";

	/**
	 * Empty default constructor
	 */
	public EMoflonPreferenceInitializer() {
		// Needed for OSGi
	}

	@Override
	public void initializeDefaultPreferences() {
	}

	public static void loadPreferences() {
		getPreferences();
	}

	/**
	 * Stores the default values to the {@link EMoflonPreferenceInitializer}
	 * singleton (as specified in {@link EMoflonPreferencesStorage}).
	 */
	public static void resetToDefaults() {
		setReachabilityEnabled(TieGtCodeGenerationPreferences.DEFAULT_REACHABILITIY_IS_ENABLED);
		setReachabilityMaxAdornmentSize(TieGtCodeGenerationPreferences.DEFAULT_REACHABILITY_MAX_ADORNMENT_SIZE);
	}

	public static void setReachabilityEnabled(final boolean isEnabled) {
		getPreferences().putBoolean(KEY_REACHABILITY_ENABLED, isEnabled);
		TieGtCodeGenerationPreferences.setReachabilityEnabled(isEnabled);
	}

	public static boolean getReachabilityEnabled() {
		return getPreferences().getBoolean(KEY_REACHABILITY_ENABLED,
				TieGtCodeGenerationPreferences.DEFAULT_REACHABILITIY_IS_ENABLED);
	}

	public static void setReachabilityMaxAdornmentSize(final int maxAdornmentSize) {
		getPreferences().putInt(KEY_REACHABILITY_MAX_ADORNMENT_SIZE, maxAdornmentSize);
		TieGtCodeGenerationPreferences.setReachabilityMaximumAdornmentSize(maxAdornmentSize);
	}

	public static int getReachabilityMaxAdornmentSize() {
		return getPreferences().getInt(KEY_REACHABILITY_MAX_ADORNMENT_SIZE,
				TieGtCodeGenerationPreferences.DEFAULT_REACHABILITY_MAX_ADORNMENT_SIZE);
	}

	private static IEclipsePreferences getPreferences() {
		return InstanceScope.INSTANCE.getNode(WorkspaceHelper.getPluginId(EMoflonPreferenceInitializer.class));
	}
}
