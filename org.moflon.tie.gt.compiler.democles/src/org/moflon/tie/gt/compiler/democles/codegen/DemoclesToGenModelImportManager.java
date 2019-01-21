package org.moflon.tie.gt.compiler.democles.codegen;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;

public final class DemoclesToGenModelImportManager extends TieGtImportManager {

	public DemoclesToGenModelImportManager(final GenModel genModel) {
		super(genModel);
	}

	@Override
	public final List<String> getImportList() {
		return Collections.emptyList();
	}

	@Override
	public final String getImportedName(final String fullyQualifiedName) {
		upload(fullyQualifiedName);
		return fullyQualifiedName;
	}

	@Override
	public final void upload(final String fullyQualifiedName) {
		getGenModel().addImport(fullyQualifiedName);
	}
}
