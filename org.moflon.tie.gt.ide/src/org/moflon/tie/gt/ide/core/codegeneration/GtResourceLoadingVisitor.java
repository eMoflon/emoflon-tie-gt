package org.moflon.tie.gt.ide.core.codegeneration;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.ResourceSet;

final class GtResourceLoadingVisitor extends FilteredResourceLoadingVisitor {

	GtResourceLoadingVisitor(final ResourceSet resourceSet, final IProject project) {
		super(resourceSet, project);
	}

	@Override
	protected String getExtension() {
		return "gt";
	}
}