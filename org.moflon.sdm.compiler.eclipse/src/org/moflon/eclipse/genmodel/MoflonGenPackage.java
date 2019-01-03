package org.moflon.eclipse.genmodel;

import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenDataType;
import org.eclipse.emf.codegen.ecore.genmodel.GenEnum;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenResourceKind;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenPackageImpl;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;

public class MoflonGenPackage extends GenPackageImpl {

	public void initialize(final EPackage ePackage) {
		if (getPrefixGen() == null && ePackage.getName() != null) {
			setPrefix(capName(ePackage.getName()));
		}

		if (getBasePackageGen() == null
				&& EcoreUtil.getAnnotation(ePackage, GenModelPackage.eNS_URI, "basePackage") != null) {
			setBasePackage(EcoreUtil.getAnnotation(ePackage, GenModelPackage.eNS_URI, "basePackage"));
		}

		final boolean isDifferentPackage = ePackage != getEcorePackage();
		if (isDifferentPackage) {
			setEcorePackage(ePackage);

			// Do this here because getExtendedMetaData() is used during initialization
			// and the mappings are are populated the first time it's fetched
			// which will miss the packages we add as we initialize the tree.
			//
			if (!EcorePackage.eNS_URI.equals(ePackage.getNsURI())
					&& !GenModelPackage.eNS_URI.equals(ePackage.getNsURI())) {
				getGenModel().getExtendedMetaData().putPackage(ePackage.getNsURI(), ePackage);
			}

			if (hasExtendedMetaDataInternal(ePackage)) {
				setResource(GenResourceKind.XML_LITERAL);
			}
			setDisposableProviderFactory(true);
		}

		int eClassIndex = 0;
		int eEnumIndex = 0;
		int eDataTypeIndex = 0;
		CLASSIFIER_LOOP: for (final EClassifier eClassifier : ePackage.getEClassifiers()) {
			for (final GenClassifier genClassifier : getGenClassifiers()) {
				if (genClassifier.getEcoreClassifier() == eClassifier) {
					if (eClassifier instanceof EClass) {
						((GenClass) genClassifier).initialize((EClass) eClassifier);
						final int index = getGenClasses().indexOf(genClassifier);
						if (index != eClassIndex) {
							getGenClasses().move(eClassIndex, index);
						}
						++eClassIndex;
					} else if (eClassifier instanceof EEnum) {
						((GenEnum) genClassifier).initialize((EEnum) eClassifier);
						final int index = getGenEnums().indexOf(genClassifier);
						if (index != eEnumIndex) {
							getGenEnums().move(eEnumIndex, index);
						}
						++eEnumIndex;
					} else if (eClassifier instanceof EDataType) {
						((GenDataType) genClassifier).initialize((EDataType) eClassifier);
						final int index = getGenDataTypes().indexOf(genClassifier);
						if (index != eDataTypeIndex) {
							getGenDataTypes().move(eDataTypeIndex, index);
						}
						++eDataTypeIndex;
					}

					continue CLASSIFIER_LOOP;
				}
			}

			if (eClassifier instanceof EClass) {
				final EClass eClass = (EClass) eClassifier;
				final GenClass genClass = getGenModel().createGenClass();
				getGenClasses().add(eClassIndex++, genClass);
				genClass.initialize(eClass);
			} else if (eClassifier instanceof EEnum) {
				final EEnum eEnum = (EEnum) eClassifier;
				final GenEnum genEnum = getGenModel().createGenEnum();
				getGenEnums().add(eEnumIndex++, genEnum);
				genEnum.initialize(eEnum);
			} else if (eClassifier instanceof EDataType) {
				final EDataType eDataType = (EDataType) eClassifier;
				final GenDataType genDataType = getGenModel().createGenDataType();
				getGenDataTypes().add(eDataTypeIndex++, genDataType);
				genDataType.initialize(eDataType);
			}
		}

		int ePackageIndex = 0;
		PACKAGE_LOOP: for (final EPackage nestedEPackage : ePackage.getESubpackages()) {
			for (final GenPackage nestedGenPackage : getNestedGenPackages()) {
				if (nestedGenPackage.getEcorePackage() == nestedEPackage) {
					nestedGenPackage.initialize(nestedEPackage);
					final int index = getNestedGenPackages().indexOf(nestedGenPackage);
					if (index != ePackageIndex) {
						getNestedGenPackages().move(ePackageIndex, index);
					}
					++ePackageIndex;
					continue PACKAGE_LOOP;
				}
			}

			final GenPackage genPackage = getGenModel().createGenPackage();
			getNestedGenPackages().add(ePackageIndex++, genPackage);
			genPackage.initialize(nestedEPackage);
		}

		if (isDifferentPackage) {
			final boolean isBigModel = isBigModel();
			setLoadInitialization(isBigModel);
			setLiteralsInterface(!isBigModel);
		}
	}

	public boolean hasExtendedMetaData() {
		if (getResource() != GenResourceKind.XML_LITERAL) {
			return false;
		}
		return hasExtendedMetaDataInternal(getEcorePackage());
	}

	private boolean hasExtendedMetaDataInternal(final EPackage ePackage) {
		final List<EPackage> ePackages = new UniqueEList<EPackage>();
		ePackages.add(ePackage);
		for (int i = 0; i < ePackages.size(); ++i) {
			for (final TreeIterator<EObject> j = ePackages.get(i).eAllContents(); j.hasNext();) {
				final EObject eObject = j.next();
				if (eObject instanceof EPackage || eObject instanceof EDataType) {
					j.prune();
				} else if (eObject instanceof EAnnotation) {
					final EAnnotation eAnnotation = (EAnnotation) eObject;
					final String source = eAnnotation.getSource();
					if (ExtendedMetaData.ANNOTATION_URI.equals(source)) {
						return true;
					}
				}
				for (final EObject eCrossReference : eObject.eCrossReferences()) {
					if (eCrossReference instanceof EClass) {
						if (eCrossReference.eIsProxy()) {
							throw new RuntimeException(
									"Unresolved proxy '" + ((InternalEObject) eCrossReference).eProxyURI().toString()
											+ "' in " + EcoreUtil.getURI(ePackages.get(i)));
						}
						final EPackage referencedEPackage = ((EClassifier) eCrossReference).getEPackage();
						if (ePackages.add(referencedEPackage) && referencedEPackage.eIsProxy()) {
							throw new RuntimeException(
									"Unresolved proxy '" + ((InternalEObject) referencedEPackage).eProxyURI().toString()
											+ "' in " + EcoreUtil.getURI(ePackages.get(i)));
						}
					}
				}
			}
		}
		return false;
	}
}
