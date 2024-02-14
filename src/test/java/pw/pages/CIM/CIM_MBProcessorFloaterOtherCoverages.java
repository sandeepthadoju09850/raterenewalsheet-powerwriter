package pw.pages.CIM;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.OR.OR_CIM;

public class CIM_MBProcessorFloaterOtherCoverages extends OR_CIM{
	
	public void CIMMBProcessorFloaterOtherCoveragesPage(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_MB_ProcessorFloaterOtherCov")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_MB_ProcessorFloaterOtherCov", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		
		String strCIM_MB_ProcessorFloater_OtherCoverages_TXT_AdditionalDebrisRemovalExpenseLimit = (String) row.get("CIM_MB_ProcessorFloater_OtherCoverages_TXT_AdditionalDebrisRemovalExpenseLimit");
		String strCIM_MB_ProcessorFloater_OtherCoverages_TXT_OffSitePropertyLimit = (String) row.get("CIM_MB_ProcessorFloater_OtherCoverages_TXT_OffSitePropertyLimit");
		String strCIM_MB_ProcessorFloater_OtherCoverages_TXT_PollutantCleanUpAndRemoval = (String) row.get("CIM_MB_ProcessorFloater_OtherCoverages_TXT_PollutantCleanUpAndRemoval");
		String strCIM_MB_ProcessorFloater_OtherCoverages_TXT_PropertyInStorageLimit = (String) row.get("CIM_MB_ProcessorFloater_OtherCoverages_TXT_PropertyInStorageLimit");
		String strCIM_MB_ProcessorFloater_OtherCoverages_TXT_TransitLimit = (String) row.get("CIM_MB_ProcessorFloater_OtherCoverages_TXT_TransitLimit");
		String strCIM_MB_ProcessorFloater_OtherCoverages_TXT_AdditionalInformation = (String) row.get("CIM_MB_ProcessorFloater_OtherCoverages_TXT_AdditionalInformation");
		try{	
		se.log().logTestStep("CIMMB Processor Floater OtherCoverages Page");
			test.log(LogStatus.INFO, "CIMMB Processor Floater OtherCoverages Page","Transaction Step : "+transaction + "<br>" +"Page : CIMMB Processor Floater OtherCoverages Page");
			se.verify().verifyEquals("CIMMB Processor Floater OtherCoverages Page of PowerWriter ", getPagecontainingtext("Miscellaneous Bailee -Processor Floater -Other Coverages").isDisplayed(),true, true,test);
			se.element().enterOrValidateText(getCIM_MB_ProcessorFloater_OtherCoverages_TXT_AdditionalDebrisRemovalExpenseLimit(strCIM_MB_ProcessorFloater_OtherCoverages_TXT_AdditionalDebrisRemovalExpenseLimit),strCIM_MB_ProcessorFloater_OtherCoverages_TXT_AdditionalDebrisRemovalExpenseLimit,test);
			if((!strCIM_MB_ProcessorFloater_OtherCoverages_TXT_OffSitePropertyLimit.equalsIgnoreCase("N/A") && !strCIM_MB_ProcessorFloater_OtherCoverages_TXT_OffSitePropertyLimit.contains("validate2"))){
				se.element().clearTheField(getCIM_MB_ProcessorFloater_OtherCoverages_TXT_OffSitePropertyLimit(strCIM_MB_ProcessorFloater_OtherCoverages_TXT_OffSitePropertyLimit));
			}
			se.element().enterOrValidateText(getCIM_MB_ProcessorFloater_OtherCoverages_TXT_OffSitePropertyLimit(strCIM_MB_ProcessorFloater_OtherCoverages_TXT_OffSitePropertyLimit),strCIM_MB_ProcessorFloater_OtherCoverages_TXT_OffSitePropertyLimit,test);
			se.util().sleep(3000);
			if(se.element().isElementPresent(InfoOKbutton)){
				se.element().waitForElement(InfoOKbutton);
				se.element().Click(getInfoOKbutton(), test);
			}
			se.element().waitForElementToDisappear(bluelineIndicator, 5000);
			se.element().enterOrValidateText(getCIM_MB_ProcessorFloater_OtherCoverages_TXT_PollutantCleanUpAndRemoval(strCIM_MB_ProcessorFloater_OtherCoverages_TXT_PollutantCleanUpAndRemoval),strCIM_MB_ProcessorFloater_OtherCoverages_TXT_PollutantCleanUpAndRemoval,test);
			se.element().enterOrValidateText(getCIM_MB_ProcessorFloater_OtherCoverages_TXT_PropertyInStorageLimit(strCIM_MB_ProcessorFloater_OtherCoverages_TXT_PropertyInStorageLimit),strCIM_MB_ProcessorFloater_OtherCoverages_TXT_PropertyInStorageLimit,test);
			se.element().enterOrValidateText(getCIM_MB_ProcessorFloater_OtherCoverages_TXT_TransitLimit(strCIM_MB_ProcessorFloater_OtherCoverages_TXT_TransitLimit),strCIM_MB_ProcessorFloater_OtherCoverages_TXT_TransitLimit,test);
			se.element().enterOrValidateText(getCIM_MB_ProcessorFloater_OtherCoverages_TXT_AdditionalInformation(strCIM_MB_ProcessorFloater_OtherCoverages_TXT_AdditionalInformation),strCIM_MB_ProcessorFloater_OtherCoverages_TXT_AdditionalInformation,test);
			se.element().Click(getNext(),test);
			iteration++;
		
	}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CIMMBProcessorFloaterOtherCoveragesPage ", true, false, true, test);		
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
