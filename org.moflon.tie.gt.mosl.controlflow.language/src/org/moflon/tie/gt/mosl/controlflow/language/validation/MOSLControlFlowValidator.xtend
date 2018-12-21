/*
 * generated by Xtext 2.11.0
 */
package org.moflon.tie.gt.mosl.controlflow.language.validation

import org.eclipse.xtext.validation.Check
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.OperationCallStatement
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.CalledParameter
import org.eclipse.emf.ecore.ETypedElement
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.MoslControlFlowPackage

/**
 * This class contains custom validation rules.
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class MOSLControlFlowValidator extends BaseMOSLControlFlowValidator {

	public static val TOO_MANY_ARGUMENTS = 'tooManyArguments'
	public static val TOO_FEW_ARGUMENTS = 'tooFewArguments'
	public static val CANNOT_RESOLVE_TYPE = 'cannotResolveType'

@Check
def checkParametersofMethodCall(OperationCallStatement callStatement){
	val operation = getOperartion(callStatement)
	if (operation === null)
	 return
	val eparameters = operation.EParameters
	val trgTypes = eparameters.map[param | param.EType]
	val srcTypes = callStatement?.parameters?.map[param | getTypeOfCalledParameter(param)?.EType]
	if(trgTypes.size > srcTypes.size)
		error("Too few Arguments for Operation: " + operation.name +"()", callStatement, MoslControlFlowPackage.Literals.OPERATION_CALL_STATEMENT__PARAMETERS, TOO_FEW_ARGUMENTS)
	else if(trgTypes.size < srcTypes.size)
		error("Too many Arguments for Operation: " + operation.name +"()", callStatement, MoslControlFlowPackage.Literals.OPERATION_CALL_STATEMENT__PARAMETERS, TOO_MANY_ARGUMENTS)

	for(var index = 0; index < trgTypes.size; index++){
	  val srcType = srcTypes.get(index)
		if(srcType !== null && !this.isInstanceOf(srcType, trgTypes.get(index)))
			error(srcType.name + " cannot be resolved to a variable of " + trgTypes.get(index).name, callStatement, MoslControlFlowPackage.Literals.OPERATION_CALL_STATEMENT__PARAMETERS, CANNOT_RESOLVE_TYPE)
	}
}

def getOperartion(OperationCallStatement callStatement){
		return callStatement.call
}

def ETypedElement getTypeOfCalledParameter(CalledParameter param){
	val typedElement =
	{
		if(param.create === null)
			 param.object
		else
			 param.create
	}
	if (typedElement instanceof ETypedElement)
		typedElement
}

@Check
def notSet(){

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
