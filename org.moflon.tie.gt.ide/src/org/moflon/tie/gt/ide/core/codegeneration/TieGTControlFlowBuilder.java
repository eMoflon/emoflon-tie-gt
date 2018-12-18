package org.moflon.tie.gt.ide.core.codegeneration;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gervarro.eclipse.task.ITask;
import org.moflon.codegen.MethodBodyHandler;
import org.moflon.codegen.eclipse.MoflonCodeGeneratorPhase;
import org.moflon.core.preferences.EMoflonPreferencesStorage;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.core.utilities.eMoflonEMFUtil;
import org.moflon.tie.gt.ide.core.pattern.searchplan.PatternMatcherConfiguration;
import org.moflon.tie.gt.ide.core.patterns.EditorToControlFlowTransformation;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.GraphTransformationControlFlowFile;

public class TieGTControlFlowBuilder implements MoflonCodeGeneratorPhase, ITask {

	public static final String MOFLON_TIE_CONTROLFLOW_FILE_EXTENSION = "mcf";
	public static final String IBEX_GT_FILE_EXTENSION = "gt";

	/**
	 * The top-level {@link EPackage} of the ongoing build process
	 */
	private EPackage ePackage;

	/**
	 * The common {@link ResourceSet} of the ongoing build process
	 */
	private ResourceSet resourceSet;

	private IProject project;

	private EditorToControlFlowTransformation controlFlowTransformation;
	private final EMoflonPreferencesStorage preferencesStorage;
	private EPackage ecorePackage;

	public TieGTControlFlowBuilder(final EMoflonPreferencesStorage preferencesStorage) {
		this.preferencesStorage = preferencesStorage;
	}

	public String getTaskName() {
		return "eMoflon-GT Transformation task";
	}

	@Override
	public IStatus run(final IProject project, final Resource resource, final MethodBodyHandler methodBodyHandler,
			final IProgressMonitor monitor) {
		this.project = project;
		this.ePackage = (EPackage) resource.getContents().get(0);
		this.resourceSet = ePackage.eResource().getResourceSet();
		if (this.ecorePackage == null) {
			return new Status(IStatus.ERROR, WorkspaceHelper.getPluginId(getClass()),
					"eCore Package was not set in " + getClass().getName());
		}
		this.controlFlowTransformation = new EditorToControlFlowTransformation(
				new PatternMatcherConfiguration(methodBodyHandler.getPatternMatcherConfiguration()),
				preferencesStorage);
		return run(monitor);
	}

	/**
	 * Entry point of this task
	 *
	 * It iterates through all {@link EClass}es in the metamodel and invokes
	 * {@link #weaveEClass(EClass, MultiStatus, IProgressMonitor)} for each one.
	 *
	 * @param monitor the progress monitor
	 * @return the status of the entire task
	 */
	@Override
	public IStatus run(final IProgressMonitor monitor) {
		final IStatus mcfLoadStatus = this.loadControlFlowFiles();
		if (mcfLoadStatus.matches(IStatus.ERROR))
			return mcfLoadStatus;
		final List<EClass> eClasses = eMoflonEMFUtil.getEClasses(this.ePackage);

		final SubMonitor subMon = SubMonitor.convert(monitor, getTaskName() + " in " + ePackage.getName(),
				eClasses.size());
		final IStatus weavingMultiStatus = processMCFFiles(subMon);
		return weavingMultiStatus.isOK() ? Status.OK_STATUS : weavingMultiStatus;
	}

	/**
	 * This routine identifies and loads all .mcf files in the current project.
	 *
	 * For each .mcf file, an appropriate resource is created in this generator's
	 * resource set ({@link #getResourceSet()}
	 */
	private IStatus loadControlFlowFiles() {
		try {
			getProject().accept(new IResourceVisitor() {

				@Override
				public boolean visit(final IResource resource) throws CoreException {
					if (resource.getName().equals("bin"))
						return false;

					if (isGTFile(resource)) {
						final Resource schemaResource = (Resource) getResourceSet().createResource(
								URI.createPlatformResourceURI(resource.getAdapter(IFile.class).getFullPath().toString(),
										false));
						try {
							schemaResource.load(null);
						} catch (final IOException e) {
							throw new CoreException(new Status(IStatus.ERROR, WorkspaceHelper.getPluginId(getClass()),
									"Problems while loading MOSL-GT specification", e));
						}
					}
					return true;
				}

				private boolean isGTFile(final IResource resource) {
					final IFile file = resource.getAdapter(IFile.class);
					return resource != null && resource.exists() && file != null
							&& "gt".equals(file.getFileExtension());
				}

			});
			getProject().accept(new IResourceVisitor() {

				@Override
				public boolean visit(final IResource resource) throws CoreException {
					if (resource.getName().equals("bin"))
						return false;

					if (isMOSLCFFile(resource)) {
						final Resource schemaResource = (Resource) getResourceSet()
								.getResource(
										URI.createPlatformResourceURI(
												resource.getAdapter(IFile.class).getFullPath().toString(), false),
										true);
						try {
							schemaResource.load(null);
						} catch (final IOException e) {
							throw new CoreException(new Status(IStatus.ERROR, WorkspaceHelper.getPluginId(getClass()),
									"Problems while loading MOSL-GT specification", e));
						}
					}
					return true;
				}

				private boolean isMOSLCFFile(final IResource resource) {
					final IFile file = resource.getAdapter(IFile.class);
					return resource != null && resource.exists() && file != null
							&& MOFLON_TIE_CONTROLFLOW_FILE_EXTENSION.equals(file.getFileExtension());
				}
			});
			// EcoreUtil.resolveAll(this.getResourceSet());
		} catch (final CoreException e) {
			return new Status(IStatus.ERROR, WorkspaceHelper.getPluginId(getClass()), e.getMessage(), e);
		}

		return Status.OK_STATUS;
	}

	private ResourceSet getResourceSet() {
		return this.resourceSet;
	}

	private IProject getProject() {
		return project;
	}

	private IStatus processMCFFiles(final IProgressMonitor monitor) {
		try {

			final List<Resource> mcfResources = this.resourceSet.getResources().stream().filter(
					resource -> resource.getURI().lastSegment().endsWith('.' + MOFLON_TIE_CONTROLFLOW_FILE_EXTENSION))
					.collect(Collectors.toList());

			for (final Resource schemaResource : mcfResources) {
				final IStatus status = processMCFResources(controlFlowTransformation, schemaResource);
				if (status.matches(IStatus.ERROR)) {
					return status;
				}
			}
			EcoreUtil.resolveAll(this.resourceSet);
		} catch (final IOException e) {
			return new Status(IStatus.ERROR, WorkspaceHelper.getPluginId(getClass()),
					"Problems while loading TIE-Controlflow specification", e);
		}
		return Status.OK_STATUS;
	}

	private IStatus processMCFResources(final EditorToControlFlowTransformation helper, final Resource schemaResource)
			throws IOException {
		final GraphTransformationControlFlowFile mCF = GraphTransformationControlFlowFile.class
				.cast(schemaResource.getContents().get(0));
		if (mCF.getImports().size() > 0) {
			final String contextEcorePath = mCF.getImports().get(0).getName().replaceFirst("platform:/resource", "")
					.replaceFirst("platform:/plugin", "");
			final Resource ecoreRes = this.resourceSet
					.getResource(URI.createPlatformResourceURI(contextEcorePath, false), true);
			ecoreRes.load(null);

			final EPackage contextEPackage = (EPackage) ecoreRes.getContents().get(0);

			return helper.transform(contextEPackage, mCF, this.resourceSet, this.ecorePackage);
		}
		return Status.OK_STATUS;
	}

	public void setECorePackage(final EPackage ecorePackage) {
		this.ecorePackage = ecorePackage;
	}

}
