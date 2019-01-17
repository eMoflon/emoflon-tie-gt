package org.moflon.tie.gt.ide.core.codegeneration;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.moflon.core.utilities.WorkspaceHelper;

abstract class FilteredResourceLoadingVisitor implements IResourceVisitor {
	private final ResourceSet resourceSet;

	/**
	 * @param tieGTControlFlowBuilder
	 */
	FilteredResourceLoadingVisitor(final ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}

	@Override
	public boolean visit(final IResource resource) throws CoreException {
		if (resource.getName().equals("bin"))
			return false;

		if (shallLoadResource(resource)) {
			final Resource schemaResource = (Resource) resourceSet.getResource(
					URI.createPlatformResourceURI(resource.getAdapter(IFile.class).getFullPath().toString(), false),
					true);
			try {
				schemaResource.load(null);
			} catch (final IOException e) {
				throw new CoreException(new Status(IStatus.ERROR, WorkspaceHelper.getPluginId(getClass()), String
						.format("Problems while loading MOSL-GT specification with URI %s", schemaResource.getURI()),
						e));
			}
		}
		return true;
	}

	protected boolean shallLoadResource(final IResource resource) {
		return FilteredResourceLoadingVisitor.isFileWithExtension(resource, getExtension());
	}

	protected abstract String getExtension();

	protected static boolean isFileWithExtension(final IResource resource, final String extension) {
		final IFile file = resource.getAdapter(IFile.class);
		return resource != null && resource.exists() && file != null && extension.equals(file.getFileExtension());
	}
}