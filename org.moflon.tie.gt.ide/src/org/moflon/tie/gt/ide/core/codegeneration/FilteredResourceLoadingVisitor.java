package org.moflon.tie.gt.ide.core.codegeneration;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
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
	private final IProject project;

	/**
	 * @param project
	 * @param tieGTControlFlowBuilder
	 */
	FilteredResourceLoadingVisitor(final ResourceSet resourceSet, final IProject project) {
		this.resourceSet = resourceSet;
		this.project = project;
	}

	@Override
	public boolean visit(final IResource resource) throws CoreException {
		if (isIgnoredFolder(resource))
			return false;

		if (shallLoadResource(resource)) {
			final Resource schemaResource = (Resource) resourceSet.getResource(
					URI.createPlatformResourceURI(resource.getAdapter(IFile.class).getFullPath().toString(), false),
					true);
			try {
				schemaResource.load(null);
			} catch (final IOException e) {
				throw new CoreException(new Status(IStatus.ERROR, WorkspaceHelper.getPluginId(getClass()),
						String.format("Problems while loading resource with URI %s", schemaResource.getURI()), e));
			}
		}
		return true;
	}

	/**
	 * Returns the extension of the files to collect
	 * 
	 * @return the desired file extension
	 */
	protected abstract String getExtension();

	protected boolean shallLoadResource(final IResource resource) {
		return FilteredResourceLoadingVisitor.isFileWithExtension(resource, getExtension());
	}

	protected static boolean isFileWithExtension(final IResource resource, final String extension) {
		final IFile file = resource.getAdapter(IFile.class);
		return resource != null && resource.exists() && file != null && extension.equals(file.getFileExtension());
	}

	/**
	 * Ignore the {@link Resource} if it is a folder in the project root and not
	 * named 'src'
	 * 
	 * @param resource the resource to check
	 * @return
	 */
	private boolean isIgnoredFolder(final IResource resource) {
		return resource instanceof IFolder && !resource.getName().equals("src") && resource.getParent() == getProject();
	}

	public IProject getProject() {
		return project;
	}

}