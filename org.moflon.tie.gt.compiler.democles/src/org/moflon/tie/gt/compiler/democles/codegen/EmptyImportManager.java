package org.moflon.tie.gt.compiler.democles.codegen;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;

public class EmptyImportManager extends TieGtImportManager {

	public EmptyImportManager(final GenModel genModel) {
		super(genModel);
	}

	public String getImportedName(final String fullyQualifiedName) {
		return fullyQualifiedName;
	}

	public List<String> getImportList() {
		return Collections.emptyList();
	}

	public void upload(final String fullyQualifiedName) {
		// Do nothing
	}
}
