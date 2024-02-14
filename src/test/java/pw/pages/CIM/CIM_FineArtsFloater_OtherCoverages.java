package pw.pages.CIM;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CIM;

	public class CIM_FineArtsFloater_OtherCoverages extends OR_CIM{
	public void FineArtsFloater_OtherCoverages(String strRegressionID,String transaction,ExtentTest test) throws IOException { 
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_FineArtsFloater-OtherCovera")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_FineArtsFloater-OtherCovera", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCIM_FineArtsFloater_OtherCoverages_TXT_EmergencyRemoval=(String) row.get("CIM_FineArtsFloater_OtherCoverages_TXT_EmergencyRemoval");
		String strCIM_FineArtsFloater_OtherCoverages_TXT_EmergencyRemovalExpenses=(String) row.get("CIM_FineArtsFloater_OtherCoverages_TXT_EmergencyRemovalExpenses");
		String strCIM_FineArtsFloater_OtherCoverages_TXT_NewlyAcquiredArtLim=(String) row.get("CIM_FineArtsFloater_OtherCoverages_TXT_NewlyAcquiredArtLim");
		String strCIM_FineArtsFloater_OtherCoverages_TXT_OffPremisesCovLim=(String) row.get("CIM_FineArtsFloater_OtherCoverages_TXT_OffPremisesCovLim");
		String strCIM_FineArtsFloater_OtherCoverages_TXT_ProopertyUsedToDispOrProtectArtLim=(String) row.get("CIM_FineArtsFloater_OtherCoverages_TXT_ProopertyUsedToDispOrProtectArtLim");
		String strCIM_FineArtsFloater_OtherCoverages_TXT_TransitCoverageLimit=(String) row.get("CIM_FineArtsFloater_OtherCoverages_TXT_TransitCoverageLimit");
		String strCIM_FineArtsFloater_OtherCoverages_TXT_AdditionalInformation=(String) row.get("CIM_FineArtsFloater_OtherCoverages_TXT_AdditionalInformation");
		
		
		try {
			se.log().logTestStep("FineArtsFloater_OtherCoverages");
			test.log(LogStatus.INFO, "FineArtsFloater_OtherCoverages page","Transaction Step : " + transaction + "<br>" +"Page : CIM_FineArtsFloater_OtherCoverages");
			
			se.element().selectPopupWithMagnifier(getCIM_FineArtsFloater_OtherCoverages_TXT_EmergencyRemoval(strCIM_FineArtsFloater_OtherCoverages_TXT_EmergencyRemoval), getCIM_FineArtsFloater_OtherCoverages_BTN_EmergencyRemoval(strCIM_FineArtsFloater_OtherCoverages_TXT_EmergencyRemoval), strCIM_FineArtsFloater_OtherCoverages_TXT_EmergencyRemoval, constants.NA, strCIM_FineArtsFloater_OtherCoverages_TXT_EmergencyRemoval, constants.NA, constants.NA, constants.NA, test);
			se.element().waitForElementIsDisplayed(Common_Popup_BTN_OK, 10);
			if(se.element().isElementPresent(Common_Popup_BTN_OK)){
				se.element().Click(getCommon_Popup_BTN_OK(), test);
			}
			
			if(!strCIM_FineArtsFloater_OtherCoverages_TXT_EmergencyRemovalExpenses.equalsIgnoreCase(constants.NA) && !strCIM_FineArtsFloater_OtherCoverages_TXT_EmergencyRemovalExpenses.contains(constants.Validate)){
                se.element().clearTheField(getCIM_FineArtsFloater_OtherCoverages_TXT_EmergencyRemovalExpenses(strCIM_FineArtsFloater_OtherCoverages_TXT_EmergencyRemovalExpenses));
                se.element().enterOrValidateText(getCIM_FineArtsFloater_OtherCoverages_TXT_EmergencyRemovalExpenses(strCIM_FineArtsFloater_OtherCoverages_TXT_EmergencyRemovalExpenses),strCIM_FineArtsFloater_OtherCoverages_TXT_EmergencyRemovalExpenses,test);
            }else{
            	se.element().enterOrValidateText(getCIM_FineArtsFloater_OtherCoverages_TXT_EmergencyRemovalExpenses(strCIM_FineArtsFloater_OtherCoverages_TXT_EmergencyRemovalExpenses),strCIM_FineArtsFloater_OtherCoverages_TXT_EmergencyRemovalExpenses,test);
            }
			se.element().waitForElementIsDisplayed(Common_Popup_BTN_OK, 10);
			if(se.element().isElementPresent(Common_Popup_BTN_OK)){
				se.element().Click(getCommon_Popup_BTN_OK(), test);
			}
			
			if(!strCIM_FineArtsFloater_OtherCoverages_TXT_NewlyAcquiredArtLim.equalsIgnoreCase(constants.NA) && !strCIM_FineArtsFloater_OtherCoverages_TXT_NewlyAcquiredArtLim.contains(constants.Validate)){
                se.element().clearTheField(getCIM_FineArtsFloater_OtherCoverages_TXT_NewlyAcquiredArtLim(strCIM_FineArtsFloater_OtherCoverages_TXT_NewlyAcquiredArtLim));
                se.element().enterOrValidateText(getCIM_FineArtsFloater_OtherCoverages_TXT_NewlyAcquiredArtLim(strCIM_FineArtsFloater_OtherCoverages_TXT_NewlyAcquiredArtLim),strCIM_FineArtsFloater_OtherCoverages_TXT_NewlyAcquiredArtLim,test);
            }else{
            	se.element().enterOrValidateText(getCIM_FineArtsFloater_OtherCoverages_TXT_NewlyAcquiredArtLim(strCIM_FineArtsFloater_OtherCoverages_TXT_NewlyAcquiredArtLim),strCIM_FineArtsFloater_OtherCoverages_TXT_NewlyAcquiredArtLim,test);
            }
			se.element().waitForElementIsDisplayed(Common_Popup_BTN_OK, 10);
			if(se.element().isElementPresent(Common_Popup_BTN_OK)){
				se.element().Click(getCommon_Popup_BTN_OK(), test);
			}
			
			if(!strCIM_FineArtsFloater_OtherCoverages_TXT_OffPremisesCovLim.equalsIgnoreCase(constants.NA) && !strCIM_FineArtsFloater_OtherCoverages_TXT_OffPremisesCovLim.contains(constants.Validate)){
                se.element().clearTheField(getCIM_FineArtsFloater_OtherCoverages_TXT_OffPremisesCovLim(strCIM_FineArtsFloater_OtherCoverages_TXT_OffPremisesCovLim));
                se.element().enterOrValidateText(getCIM_FineArtsFloater_OtherCoverages_TXT_OffPremisesCovLim(strCIM_FineArtsFloater_OtherCoverages_TXT_OffPremisesCovLim),strCIM_FineArtsFloater_OtherCoverages_TXT_OffPremisesCovLim,test);
            }else{
            	se.element().enterOrValidateText(getCIM_FineArtsFloater_OtherCoverages_TXT_OffPremisesCovLim(strCIM_FineArtsFloater_OtherCoverages_TXT_OffPremisesCovLim),strCIM_FineArtsFloater_OtherCoverages_TXT_OffPremisesCovLim,test);
            }
			se.element().waitForElementIsDisplayed(Common_Popup_BTN_OK, 10);
			if(se.element().isElementPresent(Common_Popup_BTN_OK)){
				se.element().Click(getCommon_Popup_BTN_OK(), test);
			}
			if(!strCIM_FineArtsFloater_OtherCoverages_TXT_ProopertyUsedToDispOrProtectArtLim.equalsIgnoreCase(constants.NA) && !strCIM_FineArtsFloater_OtherCoverages_TXT_ProopertyUsedToDispOrProtectArtLim.contains(constants.Validate)){
                se.element().clearTheField(getCIM_FineArtsFloater_OtherCoverages_TXT_ProopertyUsedToDispOrProtectArtLim(strCIM_FineArtsFloater_OtherCoverages_TXT_ProopertyUsedToDispOrProtectArtLim));
                se.element().enterOrValidateText(getCIM_FineArtsFloater_OtherCoverages_TXT_ProopertyUsedToDispOrProtectArtLim(strCIM_FineArtsFloater_OtherCoverages_TXT_ProopertyUsedToDispOrProtectArtLim),strCIM_FineArtsFloater_OtherCoverages_TXT_ProopertyUsedToDispOrProtectArtLim,test);
            }else{
            	se.element().enterOrValidateText(getCIM_FineArtsFloater_OtherCoverages_TXT_ProopertyUsedToDispOrProtectArtLim(strCIM_FineArtsFloater_OtherCoverages_TXT_ProopertyUsedToDispOrProtectArtLim),strCIM_FineArtsFloater_OtherCoverages_TXT_ProopertyUsedToDispOrProtectArtLim,test);
            }
			se.element().waitForElementIsDisplayed(Common_Popup_BTN_OK, 10);
			if(se.element().isElementPresent(Common_Popup_BTN_OK)){
				se.element().Click(getCommon_Popup_BTN_OK(), test);
			}
			if(!strCIM_FineArtsFloater_OtherCoverages_TXT_TransitCoverageLimit.equalsIgnoreCase(constants.NA) && !strCIM_FineArtsFloater_OtherCoverages_TXT_TransitCoverageLimit.contains(constants.Validate)){
                se.element().clearTheField(getCIM_FineArtsFloater_OtherCoverages_TXT_TransitCoverageLimit(strCIM_FineArtsFloater_OtherCoverages_TXT_TransitCoverageLimit));
                se.element().enterOrValidateText(getCIM_FineArtsFloater_OtherCoverages_TXT_TransitCoverageLimit(strCIM_FineArtsFloater_OtherCoverages_TXT_TransitCoverageLimit),strCIM_FineArtsFloater_OtherCoverages_TXT_TransitCoverageLimit,test);
            }else{
            	se.element().enterOrValidateText(getCIM_FineArtsFloater_OtherCoverages_TXT_TransitCoverageLimit(strCIM_FineArtsFloater_OtherCoverages_TXT_TransitCoverageLimit),strCIM_FineArtsFloater_OtherCoverages_TXT_TransitCoverageLimit,test);
            }
			se.element().waitForElementIsDisplayed(Common_Popup_BTN_OK, 10);
			if(se.element().isElementPresent(Common_Popup_BTN_OK)){
				se.element().Click(getCommon_Popup_BTN_OK(), test);
			}
			se.element().enterOrValidateText(getCIM_FineArtsFloater_OtherCoverages_TXT_AdditionalInformation(strCIM_FineArtsFloater_OtherCoverages_TXT_AdditionalInformation),strCIM_FineArtsFloater_OtherCoverages_TXT_AdditionalInformation,test);
			se.element().Click(getNext(), test);
			se.util().sleep(1000);
			
				
				
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for FineArtsFloater_OtherCoverages", true, false, true, test);
			
		}
				iteration++;
			}
		
	}
	catch (Exception e) {
		// TODO: handle exception
		se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
		test.log(LogStatus.FAIL, "Failed", "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
		testTearDown(se, test);
	}
		
}
}