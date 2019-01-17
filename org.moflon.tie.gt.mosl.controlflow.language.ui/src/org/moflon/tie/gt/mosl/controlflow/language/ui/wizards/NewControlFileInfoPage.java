package org.moflon.tie.gt.mosl.controlflow.language.ui.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.moflon.tie.gt.mosl.controlflow.language.ui.wizards.ControlFileTemplate;
import org.moflon.tie.gt.mosl.ide.ui.wizards.AbstractNewFileInfoPage;
import org.moflon.tie.gt.mosl.ide.ui.wizards.WizardFileTemplate;

public class NewControlFileInfoPage extends AbstractNewFileInfoPage {

	public NewControlFileInfoPage(IStructuredSelection selection) {
		super("New eMoflon::TIE-GT Controlflow Specification File", selection, "mcf");
	}

	@Override
	protected WizardFileTemplate createWizardFileTemplate() {
		return new ControlFileTemplate();
	}

}
