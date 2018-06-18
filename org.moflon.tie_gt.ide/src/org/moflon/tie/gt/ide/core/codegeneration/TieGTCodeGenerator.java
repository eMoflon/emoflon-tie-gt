package org.moflon.tie.gt.ide.core.codegeneration;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.moflon.codegen.MethodBodyHandler;
import org.moflon.codegen.eclipse.MoflonCodeGeneratorPhase;
import org.moflon.core.utilities.WorkspaceHelper;

public class TieGTCodeGenerator implements MoflonCodeGeneratorPhase {

	@Override
	public IStatus run(IProject project, Resource rsource, MethodBodyHandler methodBodyHandler,
			IProgressMonitor monitor) {
		System.out.println("Running Tie-GT CodeGenPhase");
		return new Status(Status.OK, WorkspaceHelper.getPluginId(TieGTCodeGenerator.class), "");
	}

}
