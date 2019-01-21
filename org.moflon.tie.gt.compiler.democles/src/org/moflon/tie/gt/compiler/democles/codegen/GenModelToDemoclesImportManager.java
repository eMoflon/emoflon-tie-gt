package org.moflon.tie.gt.compiler.democles.codegen;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;

public final class GenModelToDemoclesImportManager extends TieGtImportManager {

	public GenModelToDemoclesImportManager(final GenModel genModel) {
		super(genModel);
	}

	@Override
	public final List<String> getImportList() {
		return new ArrayList<>(getGenModel().getImportManager().getImports());
	}

	@Override
	public final String getImportedName(final String fullyQualifiedName) {
		return getGenModel().getImportedName(fullyQualifiedName);
	}

	@Override
	public final void upload(final String fullyQualifiedName) {
		// Do nothing
	}
}
