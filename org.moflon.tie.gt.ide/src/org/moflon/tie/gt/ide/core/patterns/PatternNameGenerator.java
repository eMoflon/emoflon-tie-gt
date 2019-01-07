package org.moflon.tie.gt.ide.core.patterns;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.emoflon.ibex.gt.editor.gT.EditorPattern;
import org.moflon.compiler.sdm.democles.DemoclesPatternType;
import org.moflon.sdm.runtime.democles.CFNode;

/**
 * Configurable name generator for patterns
 *
 * @author Roland Kluge - Initial implementation
 */
public class PatternNameGenerator {
	private EClass eContainingClass;

	private EditorPattern patternDefinition;

	private int eOperationIndex;

	private CFNode cfNode;

	private DemoclesPatternType patternType;

	public String generateName() {
		final String descriptiveName = getDescriptiveName();
		final String suffix = this.patternType.getSuffix();
		final int cfNodeId = cfNode.getId();
		return String.format("pattern_%s_%d_%d_%s_%s", eContainingClass.getName(), eOperationIndex, cfNodeId,
				descriptiveName, suffix);
	}

	public String generateApplicationConditionName(final boolean positive, final int index) {
		final String descriptiveName = getDescriptiveName();
		final String suffix = this.patternType.getSuffix();
		final int cfNodeId = cfNode.getId();
		final String applicationConditionSuffix = (positive ? "p" : "n") + "ac";
		return String.format("pattern_%s_%d_%d_%s_%s_%s%d", eContainingClass.getName(), eOperationIndex, cfNodeId,
				descriptiveName, suffix, applicationConditionSuffix, index);
	}

	public String getDescriptiveName() {
		final String descriptiveName = (this.patternDefinition != null && this.patternDefinition.getName() != null
				? this.patternDefinition.getName().trim()
				: "").replaceAll("\\s+", "");
		return descriptiveName;
	}

	/**
	 * Configures the {@link EClass} being currently transformed
	 */
	public void setEClass(final EClass eContainingClass) {
		this.eContainingClass = eContainingClass;
	}

	/**
	 * Configures the {@link EOperation} being currently transformed
	 */
	public void setEOperation(final EOperation eOperation) {
		final List<EOperation> operations = getOperationsSortedByName(eContainingClass);
		int operationIndex = 0;

		final Map<EOperation, Integer> eOperationIndexes = new HashMap<>();
		for (final EOperation eOperationInClass : operations) {
			eOperationIndexes.put(eOperationInClass, operationIndex);
			++operationIndex;
		}

		this.eOperationIndex = eOperationIndexes.get(eOperation);
	}

	/**
	 * Configures the {@link PatternDef} being currently transformed
	 */
	public void setPatternDefinition(final EditorPattern patternDefinition) {
		this.patternDefinition = patternDefinition;
	}

	/**
	 * Configures the {@link CFNode} being currently transformed
	 */
	public void setControlFlowNode(final CFNode cfNode) {
		this.cfNode = cfNode;
	}

	/**
	 * Configures the {@link DemoclesPatternType} being currently transformed
	 *
	 * @param patternType
	 */
	public void setPatternType(final DemoclesPatternType patternType) {
		this.patternType = patternType;
	}

	/**
	 * Returns the {@link EOperation}s of the given {@link EClass} sorted in
	 * ascending order by name
	 */
	private List<EOperation> getOperationsSortedByName(final EClass eClass) {
		final List<EOperation> operations = new ArrayList<>(eClass.getEOperations());
		operations.sort(new Comparator<EOperation>() {

			@Override
			public int compare(final EOperation o1, final EOperation o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		return operations;
	}

}
