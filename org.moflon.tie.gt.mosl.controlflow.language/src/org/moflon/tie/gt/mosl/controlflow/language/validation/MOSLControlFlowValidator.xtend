/*
 * generated by Xtext 2.11.0
 */
package org.moflon.tie.gt.mosl.controlflow.language.validation

import org.eclipse.xtext.validation.Check
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.OperationCallStatement
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.MoslControlFlowPackage
import org.eclipse.emf.ecore.EClassifier
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.OperationCallStatementParameter
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.ObjectVariableStatement
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.impl.MethodDecImpl
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.MethodParameter
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.PatternStatement
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.EClassDef
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.GraphTransformationControlFlowFile
import org.eclipse.emf.ecore.EObject
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.Import
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EClass
import org.moflon.tie.gt.mosl.controlflow.language.utils.ControlFlowEditorModelUtil
import org.eclipse.emf.ecore.EPackage

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class MOSLControlFlowValidator extends BaseMOSLControlFlowValidator {

	static val CODE_PREFIX = "org.moflon.tie.gt.mosl.controlflow.language."

	public static val TOO_MANY_ARGUMENTS = CODE_PREFIX + 'tooManyArguments'
	public static val TOO_FEW_ARGUMENTS = CODE_PREFIX + 'tooFewArguments'
	public static val CANNOT_RESOLVE_TYPE = CODE_PREFIX + 'cannotResolveType'
	public static val DUPLICATE_VARIABLE_NAME = CODE_PREFIX + 'duplicateVariable'
	public static val DUPLICATE_OPERATION_DECLARATION = CODE_PREFIX + 'duplicateOperation'
	public static val IMPORT_NO_ECORE = CODE_PREFIX + "import.noEcore"
	public static val IMPORT_NO_ECORE_MESSAGE = "The file '%s' cannot be imported because it is no Ecore file."
	public static val IMPORT_FILE_DOES_NOT_EXIST = CODE_PREFIX + "import.fileDoesNotExist"
	public static val IMPORT_FILE_DOES_NOT_EXIST_MESSAGE = "The file '%s' does not exist."
	public static val IMPORT_DUPLICATE = CODE_PREFIX + "import.duplicate"
	public static val IMPORT_DUPLICATE_MESSAGE = "Import '%s' must not be declared %s."

	@Check
	def checkParametersofMethodCall(OperationCallStatement callStatement) {
		val operation = getOperation(callStatement)
		if (operation === null)
			return
		val eparameters = operation.EParameters
		val trgTypes = eparameters.map[param|param.EType]
		val srcTypes = callStatement?.parameters?.map[param|getTypeOfCalledParameter(param)]
		if (trgTypes.size > srcTypes.size)
			error("Too few Arguments for Operation: " + operation.name + "()", callStatement,
				MoslControlFlowPackage.Literals.OPERATION_CALL_STATEMENT__PARAMETERS, TOO_FEW_ARGUMENTS)
		else if (trgTypes.size < srcTypes.size)
			error("Too many Arguments for Operation: " + operation.name + "()", callStatement,
				MoslControlFlowPackage.Literals.OPERATION_CALL_STATEMENT__PARAMETERS, TOO_MANY_ARGUMENTS)

		for (var index = 0; index < trgTypes.size; index++) {
			val srcType = srcTypes.get(index)
			if (srcType !== null && !this.isInstanceOf(srcType, trgTypes.get(index)))
				error(srcType.name + " cannot be resolved to a variable of " + trgTypes.get(index).name, callStatement,
					MoslControlFlowPackage.Literals.OPERATION_CALL_STATEMENT__PARAMETERS, CANNOT_RESOLVE_TYPE)
		}
	}

	def getOperation(OperationCallStatement callStatement) {
		return callStatement.call
	}

	def EClassifier getTypeOfCalledParameter(OperationCallStatementParameter param) {
		return param.object.EType
	}

	@Check
	def notSet() {
	}

	@Check
	def uniqueVariableNames(ObjectVariableStatement oVar) {
		val name = oVar.name
		var methodCall = oVar.eContainer
		while (!(methodCall instanceof MethodDecImpl)) {
			methodCall = methodCall.eContainer
			if (methodCall instanceof PatternStatement || methodCall instanceof OperationCallStatement) {
				return
			}
		}
		methodCall = methodCall as MethodDecImpl
		val contents = methodCall.eAllContents
		val result = contents.filter[obj|obj instanceof ObjectVariableStatement || obj instanceof MethodParameter].
			findFirst [ candidate |
				if (candidate instanceof MethodParameter) {
					val methodParam = candidate as MethodParameter
					if (methodParam.name.equals(name)) {
						return true
					}
				} else {
					val oVarCandidate = candidate as ObjectVariableStatement
					if (oVarCandidate.name.equals(name) && !(oVarCandidate === oVar)) {
						return true
					}
				}
				return false
			]
		if (result !== null) {
			error("Multiple ObjectVariables with name " + name, oVar,
				MoslControlFlowPackage.Literals.OBJECT_VARIABLE_STATEMENT.getEStructuralFeature(
					MoslControlFlowPackage.OBJECT_VARIABLE_STATEMENT__NAME), DUPLICATE_VARIABLE_NAME)
		}
	}

	@Check
	def checkImport(Import importEcore) {
		val ecoreModel = ControlFlowEditorModelUtil.loadEcoreModel(importEcore.name)
		if (ecoreModel.present) {
			// Imports must be of type ecore.
			val classes = ControlFlowEditorModelUtil.getElements(ecoreModel.get, EClass).size
			val datatypes = ControlFlowEditorModelUtil.getElements(ecoreModel.get, EDataType).size
			if (classes + datatypes == 0) {
				error(
					String.format(IMPORT_NO_ECORE_MESSAGE, importEcore.name),
					MoslControlFlowPackage.Literals.IMPORT__NAME,
					org.emoflon.ibex.gt.editor.validation.GTValidator.IMPORT_NO_ECORE,
					importEcore.name
				)
			}
		} else {
			// Import files must exist.
			error(
				String.format(IMPORT_FILE_DOES_NOT_EXIST_MESSAGE, importEcore.name),
				MoslControlFlowPackage.Literals.IMPORT__NAME,
				IMPORT_FILE_DOES_NOT_EXIST,
				importEcore.name
			)
		}

		// Imports must be unique.
		val file = importEcore.eContainer as GraphTransformationControlFlowFile
		val importDeclarationCount = file.imports.filter[name.equals(importEcore.name)].size
		if (importDeclarationCount !== 1) {
			warning(
				String.format(IMPORT_DUPLICATE_MESSAGE, importEcore.name, getTimes(importDeclarationCount)),
				MoslControlFlowPackage.Literals.IMPORT__NAME,
				IMPORT_DUPLICATE,
				importEcore.name
			)
		}
	}

	@Check
	def methodDeclaredInEcoreFile(MethodDecImpl methodImpl) {
		val methodName = methodImpl.name
		val eClass = methodImpl.eContainer as EClassDef
		val eClassCandidates = getEClassCandidatesFromSpec(eClass.name.name,
			eClass.eContainer as GraphTransformationControlFlowFile)
		for (candidate: eClassCandidates) {
			val eClassCand=candidate as EClass
			val opsWithSameName = eClassCand.EOperations.filter [ method |
				!(method === methodImpl) && method.name.equals(methodName)
			]
			var match = false
			if (!opsWithSameName.empty) {
				for (op : opsWithSameName) {
					// TODO: Check Return Type
					var typesEqual = false
					if ((methodImpl.EType===null&&op.EType===null)||methodImpl.EType !== null && op.EType !== null && methodImpl.EType.name.equals(op.EType.name)) {
						typesEqual = true
					}
					if (typesEqual && methodImpl.EParameters.size == op.EParameters.size) {
						val paramsMethod = methodImpl.EParameters
						val paramsCandidate = op.EParameters
						var parametersMatch = true
						for (var i = 0; i < paramsMethod.size; i++) {
							val paramMethod = paramsMethod.get(i)
							val paramCandidate = paramsCandidate.get(i)
							val paramCandidateType = paramCandidate.EType
							val paramMethodType = paramMethod.EType
							if (!(paramCandidateType !== null && paramMethodType !== null &&
								paramMethod.name.equals(paramCandidate.getName()) &&
								paramMethod.EType.name.equals(paramCandidate.EType.name))) {
								parametersMatch = false
							}
						}
						if (parametersMatch) {
							match = true;
						}
					}
				}
				if (!match) {
					error("Operation with name " + methodName+" was not declared in the metamodel.", methodImpl,
						MoslControlFlowPackage.Literals.METHOD_DEC.getEStructuralFeature(
							MoslControlFlowPackage.METHOD_DEC__NAME), DUPLICATE_VARIABLE_NAME)
				} else {
					return
				}
			}

		}
	}

	@Check
	def uniqueMethodImplementations(MethodDecImpl methodImpl) {
		val methodName = methodImpl.name
		val eClass = methodImpl.eContainer as EClassDef
		val opsWithSameName = eClass.operations.filter [ method |
			!(method === methodImpl) && method.name.equals(methodName)
		]
		var match = false
		if (!opsWithSameName.empty) {
			for (op : opsWithSameName) {
				// TODO: Check Return Type
				var typesEqual = false
				if ((methodImpl.EType===null&&op.EType===null)||methodImpl.EType !== null && op.EType !== null && methodImpl.EType.name.equals(op.EType.name)) {
					typesEqual = true
				}
				if (typesEqual && methodImpl.EParameters.size == op.EParameters.size) {
					val paramsMethod = methodImpl.EParameters
					val paramsCandidate = op.EParameters
					var parametersMatch = true
					for (var i = 0; i < paramsMethod.size; i++) {
						val paramMethod = paramsMethod.get(i)
						val paramCandidate = paramsCandidate.get(i)
						val paramCandidateType = paramCandidate.EType
						val paramMethodType = paramMethod.EType
						if (!(paramCandidateType !== null && paramMethodType !== null &&
							paramMethod.name.equals(paramCandidate.getName()) &&
							paramMethod.EType.name.equals(paramCandidate.EType.name))) {
							parametersMatch = false
						}
					}
					if (parametersMatch) {
						match = true;
					}
				}
			}
			if (match) {
				error("Multiple declarations of same operation with name " + methodName, methodImpl,
					MoslControlFlowPackage.Literals.METHOD_DEC.getEStructuralFeature(
						MoslControlFlowPackage.METHOD_DEC__NAME), DUPLICATE_VARIABLE_NAME)
			} else {
				return
			}
		}
	}

	def getEClassCandidatesFromSpec(String eclassName, GraphTransformationControlFlowFile gtcf) {
		val resources = gtcf.imports.map[import|ControlFlowEditorModelUtil.loadEcoreModel(import.name)]
		var emptyList = newArrayList
		val result = resources.filter[res|res.isPresent].map [ res |
			val resource = res.get
			val ePack = resource.contents.get(0) as EPackage
			return ePack.EClassifiers.filter[eClassifier|eClassifier.name.equals(eclassName)]
		].filter(list|!list.empty).reduce[list1, list2|list1 + list2]
		return result

	}

	def getEcoreSpecs(EObject elem) {
		var gtcf = elem
		while (gtcf !== null && !(gtcf instanceof GraphTransformationControlFlowFile)) {
			gtcf = gtcf.eContainer
		}
		if (gtcf !== null) {
			val file = gtcf as GraphTransformationControlFlowFile
			val resources = file.imports.map[import|ControlFlowEditorModelUtil.loadEcoreModel(import.name)]
			val epacks = EPackages
		}
	}

	/**
	 * Converts an integer into a "... times" String.
	 */
	def static String getTimes(int count) {
		return if(count == 2) 'twice' else count + ' times'
	}
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital',
//					MOSLControlFlowPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
}
