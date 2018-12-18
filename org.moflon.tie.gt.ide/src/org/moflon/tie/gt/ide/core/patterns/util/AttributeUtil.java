package org.moflon.tie.gt.ide.core.patterns.util;

import java.util.Optional;

import org.eclipse.emf.ecore.EAttribute;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Attribute;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;

public final class AttributeUtil {
	private AttributeUtil() {
		throw new UtilityClassNotInstantiableException();
	}

	public static Attribute lookupOrCreateAttribute(final PatternBody patternBody, final EAttribute eAttribute) {

		final Optional<Attribute> existingAttribute = patternBody.getConstraints().stream() //
				.filter(constraint -> constraint instanceof Attribute)//
				.map(constraint -> (Attribute) constraint) //
				.filter(attribute -> attribute.getEModelElement().equals(eAttribute))//
				.findAny();
		if (existingAttribute.isPresent())
			return existingAttribute.get();
		else {
			final Attribute newAttribute = EMFTypeFactory.eINSTANCE.createAttribute();
			newAttribute.setEModelElement(eAttribute);
			return newAttribute;
		}
	}

	public static Attribute createAttribute() {
		return EMFTypeFactory.eINSTANCE.createAttribute();
	}

}
