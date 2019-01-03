package org.moflon.tie.gt.mosl.ide.ui.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

public abstract class AbstractNewFileInfoPage extends WizardNewFileCreationPage {
	public AbstractNewFileInfoPage(final IStructuredSelection selection, final String fileExtension) {
		this("New Pattern file wizard", selection, fileExtension);
	}

	protected WizardFileTemplate wizardFileTemplate;

	public AbstractNewFileInfoPage(final String pageName, final IStructuredSelection selection,
			final String fileExtension) {
		super(pageName, selection);

		setFileExtension(fileExtension);
		wizardFileTemplate = createWizardFileTemplate();
	}

	@Override
	public IFile createNewFile() {
		final IFile file = super.createNewFile();
		wizardFileTemplate.setContent(file);
		return file;
	}

	protected abstract WizardFileTemplate createWizardFileTemplate();

	public WizardFileTemplate getWizardFileTemplate() {
		return wizardFileTemplate;
	}

}
