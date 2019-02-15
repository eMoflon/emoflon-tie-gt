package org.moflon.tie.gt.mosl.ide.ui.wizards;

import java.io.ByteArrayInputStream;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

public abstract class WizardFileTemplate {

	private static final String ECORE_NS_URI = EcorePackage.eINSTANCE.getNsURI();
	private Deque<String> ePackageImports;

	public void setEPackageImports(final Collection<EPackage> imports) {
		ePackageImports = new LinkedList<>(getNsUris(imports));
	}

	private List<String> getNsUris(final Collection<EPackage> imports) {
		return imports.stream().map(EPackage::getNsURI).collect(Collectors.toList());
	}

	public Collection<String> getEPackageImports() {
		if (!ePackageImports.contains(ECORE_NS_URI)) {
			ePackageImports.addFirst(ECORE_NS_URI);
		}
		return ePackageImports;
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
