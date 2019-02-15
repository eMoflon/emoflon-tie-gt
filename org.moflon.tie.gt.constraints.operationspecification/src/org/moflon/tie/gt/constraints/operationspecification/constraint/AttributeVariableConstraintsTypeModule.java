package org.moflon.tie.gt.constraints.operationspecification.constraint;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gervarro.democles.constraint.emf.EMFConstraintModule;
import org.gervarro.democles.specification.ConstraintType;
import org.moflon.tie.gt.constraints.democles.AttributeVariableConstraint;
import org.moflon.tie.gt.constraints.operationspecification.AttributeConstraintLibrary;
import org.moflon.tie.gt.constraints.operationspecification.AttributeConstraintsLibraryRegistry;
import org.moflon.tie.gt.constraints.operationspecification.ConstraintSpecification;

public class AttributeVariableConstraintsTypeModule extends EMFConstraintModule {

	public static AttributeVariableConstraintsTypeModule INSTANCE;

	private final AttributeConstraintsLibraryRegistry libraries;

	public AttributeVariableConstraintsTypeModule(
			final AttributeConstraintsLibraryRegistry attributeConstraintLibraries, final ResourceSet resourceSet) {
		super(resourceSet);
		this.libraries = attributeConstraintLibraries;
		INSTANCE = this;
	}

	public final ConstraintType getConstraintType(final AttributeVariableConstraint constraint) {
		ConstraintSpecification constraintSpecification = null;
		for (final URI uri : getAttributeConstraintsLibraries().getUris()) {
			final AttributeConstraintLibrary attributeConstraintLibrary = getAttributeConstraintsLibraries()
					.getLibrary(uri);
			constraintSpecification = attributeConstraintLibrary.lookupConstraintType(constraint);
			if (constraintSpecification != null) {
				return constraintSpecification;
			}
		}
		throw new IllegalArgumentException(String.format("Cannot handle constraint %s", constraint));
	}

	public AttributeConstraintsLibraryRegistry getAttributeConstraintsLibraries() {
		return libraries;
	}

	public void setPriorityUri(final URI priorityUri) {

	}

}
