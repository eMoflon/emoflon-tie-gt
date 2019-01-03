package org.moflon.tie.gt.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.moflon.tie.gt.ui.preferences.EMoflonPreferenceInitializer;
import org.osgi.framework.BundleContext;

public class TieGtUiActivator extends AbstractUIPlugin {

	@Override
	public void start(final BundleContext context) throws Exception {
		super.start(context);
		EMoflonPreferenceInitializer.loadPreferences();
	}
}
