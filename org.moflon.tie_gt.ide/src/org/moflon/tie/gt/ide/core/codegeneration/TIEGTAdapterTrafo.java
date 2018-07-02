package org.moflon.tie.gt.ide.core.codegeneration;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.GraphTransformationControlFlowFile;

public class TIEGTAdapterTrafo implements CodeadapterTrafo {

	@Override
	public EPackage transform(EPackage contextEPackage, GraphTransformationControlFlowFile gtCF,
			ResourceSet resourceSet) {
		// TODO Auto-generated method stub
		return contextEPackage;
	}

}
