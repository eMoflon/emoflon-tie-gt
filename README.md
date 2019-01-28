# emoflon-tie-gt

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/7566bf29bf0546a6a75c52be30b85c79)](https://www.codacy.com/app/RolandKluge/emoflon-tie-gt?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=eMoflon/emoflon-tie-gt&amp;utm_campaign=Badge_Grade)
[![codebeat badge](https://codebeat.co/badges/5d38ead2-f38e-472c-99b5-9f7408970d8e)](https://codebeat.co/projects/github-com-emoflon-emoflon-tie-gt-master)
[![Project Stats](https://www.openhub.net/p/emoflon-tie-gt/widgets/project_thin_badge.gif)](https://www.openhub.net/p/emoflon-tie-gt)
[![Run Status](https://api.shippable.com/projects/5b0413d69f890e0700fdeb2e/badge?branch=master)]()

eMoflon Tool Integration Environment with Unidirectional Graph Transformation

## Gettings started (user setup)
(If you are new to eMoflon::TIE-GT, please consult [our handbook](https://paper.dropbox.com/doc/AVuIhKAu4ZWDck9vCnnQMykWAg-FhfAuR8acECs3kUpgAxoZ).)

1. Install Eclipse with Modeling Components (2018-09 or above)
1. Open Eclipse, navigate to **Help &rarr; Install New Software...**, and enter the following update site URL: https://raw.githubusercontent.com/eMoflon/emoflon-tie-gt-updatesite/master/
   * *Note:* The update site may take some time to load. Please be patient! After installing TIE-GT, you may use the following update site, which loads faster but provides no dependencies: https://raw.githubusercontent.com/eMoflon/emoflon-tie-gt-updatesite/master/stable/updatesite
1. Select **eMoflon::TIE-GT**, press **Next**, and following the instructions.
   * Make sure that *Contact all update sites during install to find software* is selected. You may also try the installation without this option, but, then, certain dependencies may not be resolved.
1. Restart Eclipse and switch to the **eMoflon** perspective.
1. Check out the following small example via **right-click &rarr; Import... &rarr; Team Project Set** and the following URL: TODO

## Developer setup
1. Prerequisites
   - Eclipse 2018-09 or 2018-12 with Modeling Components
   - Xtext Complete SDK from http://download.eclipse.org/modeling/tmf/xtext/updates/releases/
   - eMoflon::Core from https://emoflon.org/emoflon-core-updatesite/stable/updatesite/
   - Democles Pattern Matcher Specification and Pattern Matcher Compiler 0.5.0 from http://gervarro.org/democles/integration-0.5.0/
1. Import https://raw.githubusercontent.com/eMoflon/emoflon-tie-gt/master/developerWorkspace.psf (*Import &rarr; Team Project Set*)
1. Run all MWE2 workflows (see *Ctrl+Shift+R* &rarr; '*.mwe2').
   * Proceed even if Eclipse warns you about "Errors in the Workspace"
1. The subsequent build should complete without errors.
1. Run the test suite 
   1. Start Runtime Eclipse
   1. Check out all projects from *https://github.com/eMoflon/emoflon-tie-gt-examples*
   1. Ensure that automatic build is enabled (*Project &rarr; Build Automatically*)
   1. Run JUnit test suite *EMoflonTieGtTestSuite*
      * Runner class *org.moflon.tie.gt.testsuite.EMoflonTieGtTestSuite*
   
   
