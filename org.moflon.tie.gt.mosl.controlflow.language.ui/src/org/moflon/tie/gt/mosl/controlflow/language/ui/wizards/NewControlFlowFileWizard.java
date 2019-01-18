package org.moflon.tie.gt.mosl.controlflow.language.ui.wizards;

import org.moflon.tie.gt.mosl.ide.ui.wizards.AbstractNewFileInfoPage;
import org.moflon.tie.gt.mosl.ide.ui.wizards.AbstractNewFileWizard;

public class NewControlFlowFileWizard extends AbstractNewFileWizard {

	public static final String WIZARD_ID = "org.moflon.tie.gt.mosl.controlflow.language.ui.controlflowwizard";

	@Override
	protected AbstractNewFileInfoPage createMainPage() {
		return new NewControlFileInfoPage(this.selection);
	}

}
