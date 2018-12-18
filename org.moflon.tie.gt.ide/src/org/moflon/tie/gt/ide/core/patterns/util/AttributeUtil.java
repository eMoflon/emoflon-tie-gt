package org.moflon.tie.gt.ide.core.patterns.util;

import org.gervarro.democles.specification.emf.constraint.emf.emf.Attribute;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;

public final class AttributeUtil {
	private AttributeUtil() {
		throw new UtilityClassNotInstantiableException();
	}

	public static Attribute createAttribute() {
		return EMFTypeFactory.eINSTANCE.createAttribute();
	}

}
