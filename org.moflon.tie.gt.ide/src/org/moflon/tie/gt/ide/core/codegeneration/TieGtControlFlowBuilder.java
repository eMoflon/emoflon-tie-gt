package org.moflon.tie.gt.ide.core.codegeneration;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.resources.IProject;
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
import org.moflon.core.preferences.EMoflonPreferencesStorage;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.core.utilities.eMoflonEMFUtil;
import org.moflon.tie.gt.compiler.democles.searchplan.PatternMatcherConfiguration;
import org.moflon.tie.gt.ide.core.patterns.EditorToControlFlowTransformation;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.GraphTransformationControlFlowFile;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.Import;

public class TieGtControlFlowBuilder {

	/**
	 * The top-level {@link EPackage} of the ongoing build process
	 */
	private EPackage ePackage;

	/**
	 * The common {@link ResourceSet} of the ongoing build process
	 */
	private ResourceSet resourceSet;

	private EditorToControlFlowTransformation controlFlowTransformation;
	private final EMoflonPreferencesStorage preferencesStorage;
	private EPackage ecorePackage;

	public TieGtControlFlowBuilder(final EMoflonPreferencesStorage preferencesStorage) {
		this.preferencesStorage = preferencesStorage;
	}

	public String getTaskName() {
		return "eMoflon::TIE-GT transformation";
	}

	public void setECorePackage(final EPackage ecorePackage) {
		this.ecorePackage = ecorePackage;
	}

	public IStatus run(final IProject project, final Resource resource,
			final PatternMatcherConfiguration patternMatcherConfiguration, final IProgressMonitor monitor) {

		if (this.ecorePackage == null) {
			return new Status(IStatus.ERROR, WorkspaceHelper.getPluginId(getClass()), "Ecore package was not set.");
		}

		this.ePackage = (EPackage) resource.getContents().get(0);
		this.resourceSet = ePackage.eResource().getResourceSet();
		this.controlFlowTransformation = new EditorToControlFlowTransformation(patternMatcherConfiguration,
				preferencesStorage);
		return run(monitor);
	}

	/**
	 * Entry point of this task
	 *
	 * It iterates through all {@link EClass} in the metamodel and invokes
	 * {@link #weaveEClass(EClass, MultiStatus, IProgressMonitor)} for each one.
	 *
	 * @param monitor the progress monitor
	 * @return the status of the entire task
	 */
	private IStatus run(final IProgressMonitor monitor) {
		final List<EClass> eClasses = eMoflonEMFUtil.getEClasses(this.ePackage);

		final SubMonitor subMon = SubMonitor.convert(monitor, getTaskName() + " in " + ePackage.getName(),
				eClasses.size());

		final IStatus transformationStatus = processControlFlowFiles(subMon);

		return StatusUtil.returnIfNotOK(transformationStatus);
	}

	private IStatus processControlFlowFiles(final IProgressMonitor monitor) {
		final MultiStatus controlFlowFilesStatus = new MultiStatus(WorkspaceHelper.getPluginId(getClass()), 0,
				"Problems during transformation of control flow specification", null);
		try {
			final List<Resource> mcfResources = McfResourceLoadingVisitor.collectControlFlowResources(getResourceSet());

			for (final Resource schemaResource : mcfResources) {
				final IStatus status = processControlFlowResources(controlFlowTransformation, schemaResource);
				if (StatusUtil.addAndCheckForErrors(status, controlFlowFilesStatus))
					return controlFlowFilesStatus;
			}
			EcoreUtil.resolveAll(this.resourceSet);
		} catch (final IOException e) {
			return new Status(IStatus.ERROR, WorkspaceHelper.getPluginId(getClass()),
					"Problems while loading control flow specification", e);
		}
		return StatusUtil.returnIfNotOK(controlFlowFilesStatus);
	}

	private IStatus processControlFlowResources(final EditorToControlFlowTransformation helper,
			final Resource schemaResource) throws IOException {
		final GraphTransformationControlFlowFile controlFlowSpecificationRoot = GraphTransformationControlFlowFile.class
				.cast(schemaResource.getContents().get(0));
		for (final Import mcfImport : controlFlowSpecificationRoot.getImports()) {
			final String importPath = mcfImport.getName();
			final URI uri = URI.createURI(importPath);
			final Resource ecoreResource = this.resourceSet.getResource(uri, true);
			ecoreResource.load(null);

			if (!ecoreResource.getContents().isEmpty()) {
				final EPackage contextEPackage = (EPackage) ecoreResource.getContents().get(0);

				return helper.transform(contextEPackage, controlFlowSpecificationRoot, this.resourceSet,
						this.ecorePackage);
			} else {
				return Status.OK_STATUS;
			}
		}
		return Status.OK_STATUS;
	}

	private ResourceSet getResourceSet() {
		return this.resourceSet;
	}

}
