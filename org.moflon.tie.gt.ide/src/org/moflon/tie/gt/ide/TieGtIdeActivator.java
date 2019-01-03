package org.moflon.tie.gt.ide;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.moflon.tie.gt.ide.preferences.EMoflonPreferenceInitializer;
import org.osgi.framework.BundleContext;

public class TieGtIdeActivator extends AbstractUIPlugin {

	@Override
	public void start(final BundleContext context) throws Exception {
		super.start(context);
		EMoflonPreferenceInitializer.refreshEMoflonPreferencesStorage();
	}
}
