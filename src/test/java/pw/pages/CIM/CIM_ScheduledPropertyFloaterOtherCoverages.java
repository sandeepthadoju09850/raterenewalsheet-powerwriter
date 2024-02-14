package pw.pages.CIM;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.OR.OR_CIM;

public class CIM_ScheduledPropertyFloaterOtherCoverages extends OR_CIM{
	
	public void ScheduledPropertyFloaterOtherCoverages(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_ScheduledPropertyFloater-Ot")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_ScheduledPropertyFloater-Ot", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCIM_ScheduledPropertyFloaterOtherCoverages_TXT_AdditionalDebrisRemovalExpenseLimit = (String) row.get("CIM_ScheduledPropertyFloaterOtherCoverages_TXT_AdditionalDebrisRemovalExpenseLimit");
		String strCIM_ScheduledPropertyFloaterOtherCoverages_TXT_NewlyAcquiredPropertyLimit = (String) row.get("CIM_ScheduledPropertyFloaterOtherCoverages_TXT_NewlyAcquiredPropertyLimit");
		String strCIM_ScheduledPropertyFloaterOtherCoverages_TXT_PollutantCleanupAndRemovalLim = (String) row.get("CIM_ScheduledPropertyFloaterOtherCoverages_TXT_PollutantCleanupAndRemovalLim");
		String strCIM_ScheduledPropertyFloaterOtherCoverages_TXT_AdditionalInformation = (String) row.get("CIM_ScheduledPropertyFloaterOtherCoverages_TXT_AdditionalInformation");
		
		try{
			se.log().logTestStep("ScheduledPropertyFloaterOtherCoverages");
			test.log(LogStatus.INFO, "ScheduledPropertyFloaterOtherCoverages page","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMScheduledPropertyFloaterOtherCoverages");
			se.verify().verifyEquals("ScheduledPropertyFloaterOtherCoverages page of PowerWriter ", getCIM_ScheduledPropertyFloaterOtherCoverages_TXT_VerifyScheduledPropertyFloaterOtherCoveragesText().isDisplayed(),true, true,test);	
			
			se.element().enterOrValidateText(getCIM_ScheduledPropertyFloaterOtherCoverages_TXT_AdditionalDebrisRemovalExpenseLimit(strCIM_ScheduledPropertyFloaterOtherCoverages_TXT_AdditionalDebrisRemovalExpenseLimit),strCIM_ScheduledPropertyFloaterOtherCoverages_TXT_AdditionalDebrisRemovalExpenseLimit,test);
			if (se.element().isElementPresent(InfoOKbutton)) {
				se.element().waitForElement(InfoOKbutton);
				se.element().Click(getInfoOKbutton(), test);
				se.util().sleep(2000);
				se.element().enterOrValidateText(getCIM_ScheduledPropertyFloaterOtherCoverages_TXT_AdditionalDebrisRemovalExpenseLimit(strCIM_ScheduledPropertyFloaterOtherCoverages_TXT_AdditionalDebrisRemovalExpenseLimit),strCIM_ScheduledPropertyFloaterOtherCoverages_TXT_AdditionalDebrisRemovalExpenseLimit,test);
				if (se.element().isElementPresent(InfoOKbutton)) {
					se.element().waitForElement(InfoOKbutton);
					se.element().Click(getInfoOKbutton(), test);
					se.util().sleep(2000);
				}
			}
			se.element().enterOrValidateText(getCIM_ScheduledPropertyFloaterOtherCoverages_TXT_NewlyAcquiredPropertyLimit(strCIM_ScheduledPropertyFloaterOtherCoverages_TXT_NewlyAcquiredPropertyLimit),strCIM_ScheduledPropertyFloaterOtherCoverages_TXT_NewlyAcquiredPropertyLimit,test);
			se.element().enterOrValidateText(getCIM_ScheduledPropertyFloaterOtherCoverages_TXT_PollutantCleanupAndRemovalLim(strCIM_ScheduledPropertyFloaterOtherCoverages_TXT_PollutantCleanupAndRemovalLim),strCIM_ScheduledPropertyFloaterOtherCoverages_TXT_PollutantCleanupAndRemovalLim,test);
			
			se.element().enterOrValidateText(getCIM_ScheduledPropertyFloaterOtherCoverages_TXT_AdditionalInformation(strCIM_ScheduledPropertyFloaterOtherCoverages_TXT_AdditionalInformation),strCIM_ScheduledPropertyFloaterOtherCoverages_TXT_AdditionalInformation,test);
			se.element().Click(getNext(),test);
		
		}
		catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for ScheduledPropertyFloaterOtherCoverages ", true, false, true, test);
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
