package org.moflon.tie.gt.mosl.ide.ui.wizards;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EPackage;

public abstract class WizardFileTemplate {

	protected List<EPackage> epackageImports;

	public void setEPackageImports(final List<EPackage> imports) {
		epackageImports = imports;
	}

	public abstract void setContent(IFile file);

	protected void save(final IFile file, final String content) throws CoreException {
		final ByteArrayInputStream source = new ByteArrayInputStream(content.getBytes());

		if (file.exists()) {
			file.setContents(source, IFile.FORCE | IFile.KEEP_HISTORY, null);
		} else {
			file.create(source, true, null);
		}
	}
}
