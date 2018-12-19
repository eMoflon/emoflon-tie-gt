package org.moflon.tie.gt.ide.core.patterns;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.emoflon.ibex.gt.editor.gT.EditorPattern;
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

	private PatternType patternType;

	public String generateName() {
		return generateName(false, true, null);
	}

	public String generateApplicationConditionName(final boolean positive, final Integer index) {
		return generateName(true, positive, index);
	}

	public String generateName(final boolean isApplicationCondition, final boolean isPositive, final Integer index) {
		final String descriptiveName = (this.patternDefinition != null && this.patternDefinition.getName() != null
				? this.patternDefinition.getName().trim()
				: "").replaceAll("\\s+", "");
		final String suffix = this.patternType.getSuffix();
		final int cfNodeId = cfNode.getId();
		if (patternType == PatternType.EXPRESSION_PATTERN) {
			return String.format("pattern_%s_%d_%d_%s", eContainingClass.getName(), eOperationIndex, cfNodeId, suffix);
		} else if (isApplicationCondition) {
			final int acIndex = index == null ? 0 : index;
			final String applicationConditionSuffix = (isPositive ? "p" : "n") + "ac";
			return String.format("pattern_%s_%d_%d_%s_%s_%s%d", eContainingClass.getName(), eOperationIndex, cfNodeId,
					descriptiveName, suffix, applicationConditionSuffix, acIndex);
		} else
			return String.format("pattern_%s_%d_%d_%s_%s", eContainingClass.getName(), eOperationIndex, cfNodeId,
					descriptiveName, suffix);
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
	public void setCFNode(final CFNode cfNode) {
		this.cfNode = cfNode;
	}

	/**
	 * Configures the {@link PatternType} being currently transformed
	 *
	 * @param patternType
	 */
	public void setPatternType(final PatternType patternType) {
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
