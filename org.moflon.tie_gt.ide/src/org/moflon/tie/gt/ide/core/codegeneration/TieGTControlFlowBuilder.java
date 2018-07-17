package org.moflon.tie.gt.ide.core.codegeneration;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import org.moflon.compiler.sdm.democles.DemoclesMethodBodyHandler;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.core.utilities.eMoflonEMFUtil;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.GraphTransformationControlFlowFile;
import org.moflon.sdm.compiler.democles.validation.scope.PatternMatcher;
import org.moflon.tie.gt.ide.core.patterns.CodeadapterTrafo;
import org.moflon.tie.gt.ide.core.patterns.TIEGTAdapterTrafo;

public class TieGTControlFlowBuilder implements MoflonCodeGeneratorPhase,ITask{


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
	   
	   private TIEGTAdapterTrafo tieGTAdapterTransformation;

	   public String getTaskName()
	   {
	      return "eMoflon-GT Transformation task";
	   }

	   @Override
	   public IStatus run(final IProject project, Resource resource, MethodBodyHandler methodBodyHandler, IProgressMonitor monitor)
	   {
	      this.project = project;
	      this.ePackage = (EPackage) resource.getContents().get(0);
	      this.resourceSet = ePackage.eResource().getResourceSet();
	      this.tieGTAdapterTransformation = new TIEGTAdapterTrafo();
	      //TODO:
	      //final Map<String, PatternMatcher> patternMatcherConfiguration = methodBodyHandler.getPatternMatcherConfiguration();
	      //this.transformationConfiguration.getPatternMatchingController().setSearchplanGenerators(patternMatcherConfiguration);
	      //DemoclesMethodBodyHandler.initResourceSetForDemocles(resourceSet);
	      return run(monitor);
	   }

	   /**
	    * Entry point of this task
	    * 
	    * It iterates through all {@link EClass}es in the metamodel and invokes
	    * {@link #weaveEClass(EClass, MultiStatus, IProgressMonitor)} for each one.
	    * 
	    * @param monitor
	    *           the progress monitor
	    * @return the status of the entire task
	    */
	   @Override
	   public IStatus run(IProgressMonitor monitor)
	   {
	      final IStatus mcfLoadStatus = this.loadControlFlowFiles();
	      if (mcfLoadStatus.matches(IStatus.ERROR))
	         return mcfLoadStatus;
	      //TODO: load gt Resources if GTBuilder is removed in the future
	      //final IStatus gtLoadStatus=this.loadGTFiles();
	      //if (gtLoadStatus.matches(IStatus.ERROR))
		  //       return gtLoadStatus;
	      // This status collects all information about the weaving process for 'ePackage'
	      final MultiStatus weavingMultiStatus = new MultiStatus(WorkspaceHelper.getPluginId(TieGTControlFlowBuilder.class), 0, getTaskName() + " failed", null);
	      final List<EClass> eClasses=eMoflonEMFUtil.getEClasses(this.ePackage);

	      final SubMonitor subMon = SubMonitor.convert(monitor, getTaskName() + " in " + ePackage.getName(), eClasses.size());
	      processMCFFiles(subMon);
	      return weavingMultiStatus.isOK() ? Status.OK_STATUS : weavingMultiStatus;
	   }

	   /**
	    * This routine identifies and loads all .mcf files in the current project.
	    * 
	    * For each .mcf file, an appropriate resource is created in this generator's resource set ({@link #getResourceSet()}
	    */
	   private IStatus loadControlFlowFiles()
	   {
	      try
	      {
	         getProject().accept(new IResourceVisitor() {

	            @Override
	            public boolean visit(IResource resource) throws CoreException
	            {
	               if (resource.getName().equals("bin"))
	                  return false;

	               if (isMOSLCFFile(resource))
	               {
	                  final Resource schemaResource = (Resource) getResourceSet()
	                        .createResource(URI.createPlatformResourceURI(resource.getAdapter(IFile.class).getFullPath().toString(), false));
	                  try
	                  {
	                     schemaResource.load(null);
	                  } catch (final IOException e)
	                  {
	                     throw new CoreException(
	                           new Status(IStatus.ERROR, WorkspaceHelper.getPluginId(getClass()), "Problems while loading MOSL-GT specification", e));
	                  }
	               }
	               return true;
	            }

	            private boolean isMOSLCFFile(IResource resource)
	            {
	               final IFile file = resource.getAdapter(IFile.class);
	               return resource != null && resource.exists() && file != null && MOFLON_TIE_CONTROLFLOW_FILE_EXTENSION.equals(file.getFileExtension());
	            }

	         });
	         EcoreUtil.resolveAll(this.getResourceSet());
	      } catch (final CoreException e)
	      {
	         return new Status(IStatus.ERROR, WorkspaceHelper.getPluginId(getClass()), e.getMessage(), e);
	      }

	      return Status.OK_STATUS;
	   }

	   private ResourceSet getResourceSet()
	   {
	      return this.resourceSet;
	   }

	   private IProject getProject()
	   {
	      return project;
	   }

	private IStatus processMCFFiles(final IProgressMonitor monitor)
	   {
	      try
	      {
	         
	         final List<Resource> mcfResources = this.resourceSet.getResources().stream()
	               .filter(resource -> resource.getURI().lastSegment().endsWith('.' + MOFLON_TIE_CONTROLFLOW_FILE_EXTENSION)).collect(Collectors.toList());

	         for (final Resource schemaResource : mcfResources)
	         {
	            processMCFResources(tieGTAdapterTransformation, schemaResource);

	         }
	         EcoreUtil.resolveAll(this.resourceSet);
	      } catch (final IOException e)
	      {
	         return new Status(IStatus.ERROR, WorkspaceHelper.getPluginId(getClass()), "Problems while loading TIE-Controlflow specification", e);
	      }
	      return Status.OK_STATUS;
	   }

	   private void processMCFResources(CodeadapterTrafo helper, final Resource schemaResource) throws IOException
	   {
	      final GraphTransformationControlFlowFile mCF = GraphTransformationControlFlowFile.class.cast(schemaResource.getContents().get(0));
	      if (mCF.getImports().size() > 0)
	      {
	         // TODO@rkluge: Probably, we will have to translate the .mgt files "package-by-package" and load the
	         // appropriate packages

	         // load context
	         String contextEcorePath = mCF.getImports().get(0).getName().replaceFirst("platform:/resource", "").replaceFirst("platform:/plugin", "");
	         Resource ecoreRes = this.resourceSet.getResource(URI.createPlatformResourceURI(contextEcorePath, false), true);
	         ecoreRes.load(null);
	         // TODO@rkluge: Extend to support multiple root packages
	         final EPackage contextEPackage = EcoreUtil.copy((EPackage) ecoreRes.getContents().get(0));

	         // transformation
	         Resource enrichedEcoreResource = ePackage.eResource(); // this.resourceSet.createResource(enrichedEcoreURI);
	         String nsURI = ePackage.eResource().getURI().toString();
	         enrichedEcoreResource.getContents().clear();
	         enrichedEcoreResource.getContents().add(contextEPackage);
	         contextEPackage.setNsURI(nsURI);
	         enrichedEcoreResource.save(Collections.EMPTY_MAP);
	         EcoreUtil.resolveAll(contextEPackage);
	         final EPackage enrichedEPackage = helper.transform(contextEPackage, mCF, this.resourceSet);

	         // save context
	         enrichedEcoreResource.getContents().clear();
	         enrichedEcoreResource.getContents().add(enrichedEPackage);
	         final Map<String, String> saveOptions = new HashMap<>();
	         saveOptions.put(Resource.OPTION_LINE_DELIMITER, WorkspaceHelper.DEFAULT_RESOURCE_LINE_DELIMITER);
	         enrichedEcoreResource.save(saveOptions);

	      }
	   }

}