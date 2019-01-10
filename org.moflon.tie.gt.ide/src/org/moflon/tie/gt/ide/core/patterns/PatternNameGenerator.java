package org.moflon.tie.gt.ide.core.patterns;

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

	private CFNode cfNode;

	private DemoclesPatternType patternType;

	private EOperation eOperation;

	public String generateName() {
		final String descriptiveName = getDescriptiveName();
		final String suffix = this.patternType.getSuffix();
		final int cfNodeId = cfNode.getId();
		return String.format("pattern_%s_%s_%d_%s_%s", eContainingClass.getName(), eOperation.getName(), cfNodeId,
				descriptiveName, suffix);
	}

	public String generateApplicationConditionName(final boolean positive, final int index) {
		final String descriptiveName = getDescriptiveName();
		final String suffix = this.patternType.getSuffix();
		final int cfNodeId = cfNode.getId();
		final String applicationConditionSuffix = (positive ? "p" : "n") + "ac";
		return String.format("pattern_%s_%s_%d_%s_%s_%s%d", eContainingClass.getName(), eOperation.getName(), cfNodeId,
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
		this.eOperation = eOperation;
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
}
