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
import org.moflon.tie.gt.ide.core.patterns.PatternBuilderVisitor.PatternType;

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
		return generateName(false,true);
	}

	public String generateName(boolean isAC,boolean isPositive) {
		final String descriptiveName = (this.patternDefinition!=null&&this.patternDefinition.getName() != null
				? this.patternDefinition.getName().trim()
				: "").replaceAll("\\s+", "");
		if(isAC)
			return String.format("pattern_%s_%d_%d_%s_%s_"+(isPositive?"p":"n")+"ac", this.eContainingClass.getName(), this.eOperationIndex,
					this.cfNode.getId(), descriptiveName, this.patternType.getSuffix());
		else
			return String.format("pattern_%s_%d_%d_%s_%s", this.eContainingClass.getName(), this.eOperationIndex,
				this.cfNode.getId(), descriptiveName, this.patternType.getSuffix());
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
		List<EOperation> operations = new ArrayList<>(eClass.getEOperations());
		operations.sort(new Comparator<EOperation>() {

			@Override
			public int compare(EOperation o1, EOperation o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		return operations;
	}

}
