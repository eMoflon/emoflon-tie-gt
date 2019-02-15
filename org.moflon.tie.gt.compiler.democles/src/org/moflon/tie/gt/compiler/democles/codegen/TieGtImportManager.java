package org.moflon.tie.gt.compiler.democles.codegen;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.gervarro.democles.codegen.ImportManager;

public abstract class TieGtImportManager implements ImportManager {

	private final GenModel genModel;

	public TieGtImportManager(final GenModel genModel) {
		this.genModel = genModel;
	}

	public GenModel getGenModel() {
		return genModel;
	}
}
