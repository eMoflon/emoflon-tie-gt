package org.moflon.tie.gt.ide.core.codegeneration;

import org.eclipse.emf.ecore.resource.ResourceSet;

final class GtResourceLoadingVisitor extends FilteredResourceLoadingVisitor {

	GtResourceLoadingVisitor(final ResourceSet resourceSet) {
		super(resourceSet);
	}

	@Override
	protected String getExtension() {
		return "gt";
	}
}