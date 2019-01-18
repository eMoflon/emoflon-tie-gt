package org.moflon.tie.gt.mosl.controlflow.language.ui.wizards

import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.Path
import org.moflon.tie.gt.mosl.ide.ui.wizards.WizardFileTemplate

class ControlFileTemplate extends WizardFileTemplate {

  override setContent(IFile file) {
    val gtFileName = file.name.replaceFirst("\\.mcf$", ".gt")
    val mcfContent = createTemplate(gtFileName)
    save(file, mcfContent)
    val gtContent = createGtTemplate()
    val gtFile = file.parent.getFile(Path.fromPortableString(gtFileName));
    save(gtFile, gtContent)
  }
  
  def String createGtTemplate() {
    '''
    «FOR epackage : EPackageImports»
      import "«epackage»"
    «ENDFOR»
    '''
  }

  def String createImportText(){
    '''
    «FOR epackage : EPackageImports»
      import "«epackage»"
    «ENDFOR»
    '''
  }
  
  def String createTemplate(String gtFileName){
    '''
    «createImportText»

    using "«gtFileName»"
    
    '''
  }
}