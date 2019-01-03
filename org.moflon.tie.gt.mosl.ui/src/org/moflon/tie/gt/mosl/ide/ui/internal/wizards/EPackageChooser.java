package org.moflon.tie.gt.mosl.ide.ui.internal.wizards;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.ui.resource.IStorage2UriMapper;
import org.eclipse.xtext.ui.util.IJdtHelper;
import org.eclipse.xtext.xtext.ui.wizard.ecore2xtext.Messages;
import org.eclipse.xtext.xtext.wizard.EPackageInfo;
import org.moflon.core.utilities.eMoflonEMFUtil;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

/**
 * @author Jan Koehnlein - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class EPackageChooser {

	private static final String PATH_TO_ECORE_ECORE = "org.eclipse.emf.ecore/model/Ecore.ecore";

	private final Shell shell;

	private final IJdtHelper jdtHelper;

	public EPackageChooser(final Shell shell, final IJdtHelper jdtHelper) {
		this.shell = shell;
		this.jdtHelper = jdtHelper;
	}

	private List<EPackageInfo> createEPackageInfosFromGenModel(final URI genModelURI) {
		final ResourceSet resourceSet = createResourceSet(genModelURI);
		try {
			eMoflonEMFUtil.createPluginToResourceMapping(resourceSet);
		} catch (final CoreException e) {
			e.printStackTrace();
		}
		final Resource resource = resourceSet.getResource(genModelURI, true);
		final List<EPackageInfo> ePackageInfos = Lists.newArrayList();
		for (final TreeIterator<EObject> i = resource.getAllContents(); i.hasNext();) {
			final EObject next = i.next();
			if (next instanceof GenPackage) {
				final GenPackage genPackage = (GenPackage) next;
				final EPackage ePackage = genPackage.getEcorePackage();
				URI importURI;
				if (ePackage.eResource() == null) {
					importURI = URI.createURI(ePackage.getNsURI());
				} else {
					importURI = ePackage.eResource().getURI();
				}
				final EPackageInfo ePackageInfo = new EPackageInfo(ePackage, importURI, genModelURI,
						genPackage.getQualifiedPackageInterfaceName(), genPackage.getGenModel().getModelPluginID());
				ePackageInfos.add(ePackageInfo);
			} else if (!(next instanceof GenModel)) {
				i.prune();
			}
		}
		return ePackageInfos;
	}

	private ResourceSet createResourceSet(final URI genModelUri) {
		ResourceSetImpl resourceSet;
		if (genModelUri.fileExtension().equals("xcore")) {
			final IResourceServiceProvider resourceServiceProvider = IResourceServiceProvider.Registry.INSTANCE
					.getResourceServiceProvider(genModelUri);
			final IStorage2UriMapper storage2UriMapper = resourceServiceProvider.get(IStorage2UriMapper.class);
			final IProject project = storage2UriMapper.getStorages(genModelUri).iterator().next().getSecond();
			resourceSet = (ResourceSetImpl) resourceServiceProvider.get(IResourceSetProvider.class).get(project);
		} else {
			resourceSet = new ResourceSetImpl();
		}
		final Resource ecorePackageResource = EcorePackage.eINSTANCE.eResource();
		final Map<URI, Resource> uriResourceMap = Maps.newHashMap();
		uriResourceMap.put(URI.createPlatformResourceURI(PATH_TO_ECORE_ECORE, true), ecorePackageResource);
		uriResourceMap.put(URI.createPlatformPluginURI(PATH_TO_ECORE_ECORE, true), ecorePackageResource);
		resourceSet.setURIResourceMap(uriResourceMap);
		return resourceSet;
	}

	private static class LabelProvider extends org.eclipse.jface.viewers.LabelProvider {

		private final ILabelProvider delegate = new WorkbenchLabelProvider();

		@Override
		public String getText(final Object object) {
			if (object instanceof IFile) {
				final IFile file = (IFile) object;
				return delegate.getText(file) + " - " + file.getParent().getFullPath();
			}
			return delegate.getText(object);
		}

		@Override
		public Image getImage(final Object element) {
			return delegate.getImage(element);
		}
	}

	private static class ContentProvider implements IStructuredContentProvider {

		private Iterable<Object> content;

		@Override
		public Object[] getElements(final Object inputElement) {
			if (content != null) {
				return Iterables.toArray(content, Object.class);
			} else {
				return new Object[0];
			}
		}

		@Override
		public void dispose() {
			content = null;
		}

		@Override
		@SuppressWarnings("unchecked")
		public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
			if (newInput instanceof Iterable<?>) {
				content = (Iterable<Object>) newInput;
			}
		}

	}

	public List<EPackageInfo> open() {
		final Iterable<IResource> resourcesContainingGenModels = findResourcesContainingGenModels();
		final ListSelectionDialog listSelectionDialog = new ListSelectionDialog(shell, resourcesContainingGenModels,
				new ContentProvider(), new LabelProvider(), Messages.EPackageChooser_ChooseGenModel);
		final int result = listSelectionDialog.open();
		if (result == Window.OK) {
			final List<EPackageInfo> ePackageInfos = Lists.newArrayList();
			for (final Object selection : listSelectionDialog.getResult()) {
				if (selection instanceof IFile) {
					final IFile file = (IFile) selection;
					final URI genModelURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
					ePackageInfos.addAll(createEPackageInfosFromGenModel(genModelURI));
				}
			}
			return ePackageInfos;
		}
		return Collections.emptyList();
	}

	private Iterable<IResource> findResourcesContainingGenModels() {
		final List<IResource> filteredResources = Lists.newArrayList();
		try {
			ResourcesPlugin.getWorkspace().getRoot().accept(new IResourceVisitor() {
				@Override
				public boolean visit(final IResource resource) throws CoreException {
					if (resource instanceof IFile) {
						final String fileExtension = ((IFile) resource).getFileExtension();
						if ("genmodel".equals(fileExtension) || "xcore".equals(fileExtension)) {
							filteredResources.add(resource);
						}
					}
					if (jdtHelper.isJavaCoreAvailable()) {
						return !jdtHelper.isFromOutputPath(resource);
					}
					return true;
				}
			});
		} catch (final CoreException e) {
			Logger.getLogger(this.getClass()).error(Messages.EPackageChooser_ErrorFindingGenModels, e);
		}
		return filteredResources;
	}
}
