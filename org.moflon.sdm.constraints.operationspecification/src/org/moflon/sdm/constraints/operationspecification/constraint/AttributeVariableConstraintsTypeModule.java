package org.moflon.sdm.constraints.operationspecification.constraint;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gervarro.democles.constraint.emf.EMFConstraintModule;
import org.gervarro.democles.specification.ConstraintType;
import org.moflon.sdm.constraints.democles.AttributeVariableConstraint;
import org.moflon.sdm.constraints.operationspecification.AttributeConstraintLibrary;
import org.moflon.sdm.constraints.operationspecification.ConstraintSpecification;

public class AttributeVariableConstraintsTypeModule extends EMFConstraintModule {

	public static AttributeVariableConstraintsTypeModule INSTANCE;

	private final List<AttributeConstraintLibrary> libraries;

	public AttributeVariableConstraintsTypeModule(final Collection<AttributeConstraintLibrary> libraries,
			final ResourceSet resourceSet) {
		super(resourceSet);
		this.libraries = new ArrayList<>(libraries);
		INSTANCE = this;
	}

	public final ConstraintType getConstraintType(final AttributeVariableConstraint constraint) {
		ConstraintSpecification constraintSpecification = null;
		for (final AttributeConstraintLibrary attributeConstraintLibrary : getAttributeConstraintsLibraries()) {
			constraintSpecification = attributeConstraintLibrary.lookupConstraintType(constraint);
			if (constraintSpecification != null) {
				break;
			}
		}
		return constraintSpecification;
	}

	public Collection<AttributeConstraintLibrary> getAttributeConstraintsLibraries() {
		return libraries;
	}

}
