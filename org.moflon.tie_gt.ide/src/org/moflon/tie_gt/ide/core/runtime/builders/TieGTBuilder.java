package org.moflon.tie_gt.ide.core.runtime.builders;

import java.util.Map;

import org.eclipse.core.resources.IBuildConfiguration;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gervarro.eclipse.workspace.util.AntPatternCondition;
import org.moflon.codegen.eclipse.MoflonCodeGenerator;
import org.moflon.core.build.AbstractVisitorBuilder;
import org.moflon.core.preferences.EMoflonPreferencesActivator;
import org.moflon.core.utilities.ClasspathUtil;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.core.utilities.eMoflonEMFUtil;
import org.moflon.tie_gt.ide.core.codegeneration.TieGTCodeGenerator;
import org.moflon.tie_gt.ide.core.runtime.utilities.TieGTRepositoryProjectCreator;

public class TieGTBuilder extends AbstractVisitorBuilder{
	
	public static String BUILDER_ID=TieGTBuilder.class.toString();

	protected TieGTBuilder() {
		super(new AntPatternCondition(new String[] { "model/*.ecore" }));
		// TODO possibly wrong/unnecessary
	}

	@Override
	protected AntPatternCondition getTriggerCondition(IProject project) {
		// TODO possibly wrong/unnecessary
		return new AntPatternCondition(new String[0]);
	}

	@Override
	protected void processResource(IResource ecoreResource, int kind, Map<String, String> arg2, IProgressMonitor monitor) {
		final IFile ecoreFile = Platform.getAdapterManager().getAdapter(ecoreResource, IFile.class);

	      try
	      {
	         //final SubMonitor subMon = SubMonitor.convert(monitor, "Processing Resource", 53);
	         //logger.info("Generating code for " + this.getProject());
	         //final CMoflonRepositoryCodeGenerator generator = new CMoflonRepositoryCodeGenerator(getProject());

	         //final IStatus status = generator.generateCode(subMon.split(50), CMoflonWorkspaceHelper.getCMoflonPropertiesFile(getProject()));
	    	  final SubMonitor subMon = SubMonitor.convert(monitor,
						"Generating code for project " + getProject().getName(), 13);

				final IProject project = getProject();
				TieGTRepositoryProjectCreator projectCreator = new TieGTRepositoryProjectCreator(project, null, null);
				projectCreator.createFoldersIfNecessary(project, subMon.split(1));
				ClasspathUtil.makeSourceFolderIfNecessary(WorkspaceHelper.getGenFolder(getProject()));
				ClasspathUtil.makeSourceFolderIfNecessary(WorkspaceHelper.getInjectionFolder(getProject()));

				// Compute project dependencies
				final IBuildConfiguration[] referencedBuildConfigs = project
						.getReferencedBuildConfigs(project.getActiveBuildConfig().getName(), false);
				for (final IBuildConfiguration referencedConfig : referencedBuildConfigs) {
					addTriggerProject(referencedConfig.getProject());
				}

				deleteProblemMarkers();
				cleanGeneratedCode(getProject());
	    	  
	    	 final ResourceSet resourceSet = eMoflonEMFUtil.createDefaultResourceSet();
	    	 MoflonCodeGenerator moflonCodeGenerator = new MoflonCodeGenerator(ecoreFile, resourceSet, EMoflonPreferencesActivator.getDefault().getPreferencesStorage());
	    	 moflonCodeGenerator.setAdditionalCodeGenerationPhase(new TieGTCodeGenerator());
	    	 IStatus status=moflonCodeGenerator.run(monitor);
	         handleErrorsAndWarnings(status, ecoreFile);
	      } catch (final CoreException e)
	      {
	    	  final IStatus status = new Status(e.getStatus().getSeverity(), WorkspaceHelper.getPluginId(getClass()),
						e.getMessage(), e);
				handleErrorsInEclipse(status, ecoreFile);
	      }
	}

	private void cleanGeneratedCode(IProject project) {
		// TODO Auto-generated method stub
		
	}

	private void handleErrorsInEclipse(IStatus status, IFile ecoreFile) {
		// TODO Auto-generated method stub
		
	}

	private void handleErrorsAndWarnings(IStatus status, IFile ecoreFile) {
		// TODO Auto-generated method stub
		
	}

}
