package pw.pages.GL;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.OR.OR_GL;

public class GL_InjuryToLeasedWorkers extends OR_GL{
	
	public void GL_InjuryToLeasedWorkersPage(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase("GL_InjuryToLeasedWorkers")){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData("GL_InjuryToLeasedWorkers", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strGL_InjuryToLeasedWorkers_TXT_Coverage = (String) row.get("GL_InjuryToLeasedWorkers_TXT_Coverage");
				String strGL_InjuryToLeasedWorkers_TXT_EndorsementPremium = (String) row.get("GL_InjuryToLeasedWorkers_TXT_EndorsementPremium");
				String strTestDescription = (String) row.get("Transaction Name");
		try{
				se.log().logTestStep("GL_InjuryToLeasedWorkers");
				test.log(LogStatus.INFO, "GL_InjuryToLeasedWorkers page","Transaction Step : "+strTestDescription + "<br>" +"Page : GL_InjuryToLeasedWorkers");
				se.verify().verifyEquals("GL_InjuryToLeasedWorkers Page of PowerWriter ", getGL_InjuryToLeasedWorkers_LBL_VerifyInjuryToLeasedWorkers().isDisplayed(),true, true,test);
				se.element().enterOrValidateText(getGL_InjuryToLeasedWorkers_TXT_Coverage(strGL_InjuryToLeasedWorkers_TXT_Coverage),strGL_InjuryToLeasedWorkers_TXT_Coverage,test);
				se.element().enterOrValidateText(getGL_InjuryToLeasedWorkers_TXT_EndorsementPremium(strGL_InjuryToLeasedWorkers_TXT_EndorsementPremium),strGL_InjuryToLeasedWorkers_TXT_EndorsementPremium,test);
				se.element().clickElement(getNext());
			
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for GL_InjuryToLeasedWorkers ", true, false, true, test);
			}
		iteration++;
	}

		} catch (Exception e) {
			// TODO: handle exception
			se.log().logTestStep(
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			test.log(LogStatus.FAIL, "Failed",
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			testTearDown(se, test);
		}

}

}