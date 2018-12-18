package org.moflon.tie.gt.ide.core.patterns.util;

import org.emoflon.ibex.gt.editor.gT.EditorAttribute;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.ConstraintVariable;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.constraint.relational.Equal;
import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraint;
import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintFactory;

public class RelationalConstraintUtil {

	public static RelationalConstraint createRelationalConstraint(final EditorAttribute attribute) {
		final RelationalConstraintFactory factory = RelationalConstraintFactory.eINSTANCE;
		RelationalConstraint relConstraint;
		switch (attribute.getRelation()) {
		case EQUAL:
			relConstraint = factory.createEqual();
			break;
		case GREATER:
			relConstraint = factory.createLarger();
			break;
		case SMALLER:
			relConstraint = factory.createSmaller();
			break;
		case GREATER_OR_EQUAL:
			relConstraint = factory.createLargerOrEqual();
			break;
		case SMALLER_OR_EQUAL:
			relConstraint = factory.createSmallerOrEqual();
			break;
		case UNEQUAL:
			relConstraint = factory.createUnequal();
			break;
		case ASSIGNMENT:
			relConstraint = factory.createEqual();
			break;
		default:
			System.out.println("Unsupported EditorRelation: " + attribute.getRelation());// TODO@rkluge Create error
			return null;
		}
		return relConstraint;
	}

	public static Equal createEqualConstraint(final ConstraintVariable source, final ConstraintVariable target) {
		final Equal equal = RelationalConstraintFactory.eINSTANCE.createEqual();
		final ConstraintParameter sourceConstr = SpecificationFactory.eINSTANCE.createConstraintParameter();
		sourceConstr.setReference(source);
		final ConstraintParameter targetConstr = SpecificationFactory.eINSTANCE.createConstraintParameter();
		targetConstr.setReference(target);
		equal.getParameters().add(targetConstr);
		equal.getParameters().add(sourceConstr);
		return equal;
	}

}
