package org.moflon.tie.gt.ide.core.codegeneration;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

final class McfResourceLoadingVisitor extends FilteredResourceLoadingVisitor {

	McfResourceLoadingVisitor(final ResourceSet resourceSet, final IProject project) {
		super(resourceSet, project);
	}

	static List<Resource> collectControlFlowResources(final ResourceSet resourceSet) {
		return resourceSet.getResources().stream()
				.filter(resource -> resource.getURI().lastSegment().endsWith('.' + "mcf")).collect(Collectors.toList());
	}

	@Override
	protected String getExtension() {
		return "mcf";
	}
}