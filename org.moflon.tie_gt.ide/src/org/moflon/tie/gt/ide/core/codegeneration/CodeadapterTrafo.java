package org.moflon.tie.gt.ide.core.codegeneration;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.gt.editor.gT.EditorPattern;
import org.gervarro.democles.specification.emf.Pattern;
import org.moflon.gt.mosl.controlflow.language.moslControlFlow.GraphTransformationControlFlowFile;

public interface CodeadapterTrafo {

	EPackage transform(EPackage contextEPackage, GraphTransformationControlFlowFile gtCF, ResourceSet resourceSet, Map<EditorPattern, Pattern> editorToDemoclesPatterns);

}
