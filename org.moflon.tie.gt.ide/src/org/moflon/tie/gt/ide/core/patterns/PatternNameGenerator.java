package org.moflon.tie.gt.ide.core.patterns;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.emoflon.ibex.gt.editor.gT.EditorPattern;
import org.moflon.tie.gt.compiler.democles.pattern.DemoclesPatternType;
import org.moflon.tie.gt.controlflow.democles.CFNode;

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

	private ApplicationConditionType applicationConditionType = ApplicationConditionType.NONE;

	private Integer index;

	public String generateName() {
		final String descriptiveName = getDescriptiveName();
		final String suffix = this.patternType.getSuffix();
		final int cfNodeId = cfNode.getId();
		final String applicationConditionSuffix = getApplicationConditionSuffix();
		return String.format("pattern_%s_%s_%d_%s%s_%s", eContainingClass.getName(), eOperation.getName(), cfNodeId,
				descriptiveName, applicationConditionSuffix, suffix);
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

	/**
	 * The type of application condition to generate. Use
	 * {@link ApplicationConditionType#NONE} to indicate a regular pattern. If the
	 * type is {@link ApplicationConditionType#POSITIVE} or
	 * {@link ApplicationConditionType#NEGATIVE}, the index must not be
	 * <code>null</code>
	 * 
	 * @param applicationConditionType the type of application condition to generate
	 * @param index                    the index of the application condition
	 */
	public void setApplicationConditionType(final ApplicationConditionType applicationConditionType,
			final Integer index) {
		switch (applicationConditionType) {
		case POSITIVE:
		case NEGATIVE:
			if (index == null)
				throw new IllegalStateException("Index must be set for positive or negative pattern invocations.");
			this.index = index;
			break;
		case NONE:
			this.index = null;
			break;
		}
		this.applicationConditionType = applicationConditionType;
	}

	/**
	 * Reconfigures this object to generate names for regular patterns
	 */
	public void unsetApplicationConditionType() {
		this.setApplicationConditionType(ApplicationConditionType.NONE, null);
	}

	/**
	 * Sets the index in case an application condition is generated
	 * 
	 * @param index the index. May be <code>null</code> to mark that no application
	 *              condition is generated
	 */
	public void setIndex(final Integer index) {
		this.index = index;
	}

	private String getApplicationConditionSuffix() {
		switch (applicationConditionType) {
		case POSITIVE:
			return String.format("_pac%d", index);
		case NEGATIVE:
			return String.format("_nac%d", index);
		case NONE:
			return "";
		default:
			throw new IllegalArgumentException(
					String.format("Cannot handle application condition type %s", applicationConditionType));
		}
	}

	@Override
	public String toString() {
		return "PatternNameGenerator [eContainingClass=" + eContainingClass + ", patternDefinition=" + patternDefinition
				+ ", cfNode=" + cfNode + ", patternType=" + patternType + ", eOperation=" + eOperation
				+ ", applicationConditionType=" + applicationConditionType + ", index=" + index + "]";
	}
}
