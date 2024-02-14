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

public class CIM_TransitFloater_OtherCoverages extends OR_CIM{
	public void TransitFloater_OtherCoverages(String strRegressionID,String transaction,ExtentTest test) throws IOException { 
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_TransitFloater_OtherCoverag")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_TransitFloater_OtherCoverag", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCIM_TransitFloater_OtherCoverages_TXT_AdditionalDebrisRemExpLim=(String) row.get("CIM_TransitFloater_OtherCoverages_TXT_AdditionalDebrisRemExpLim");
		String strCIM_TransitFloater_OtherCoverages_TXT_EmergencyRemoval=(String) row.get("CIM_TransitFloater_OtherCoverages_TXT_EmergencyRemoval");
		String strCIM_TransitFloater_OtherCoverages_TXT_PollutantCleanupandRemovalLim=(String) row.get("CIM_TransitFloater_OtherCoverages_TXT_PollutantCleanupandRemovalLim");
		String strCIM_TransitFloater_OtherCoverages_TXT_PropYouHavesold=(String) row.get("CIM_TransitFloater_OtherCoverages_TXT_PropYouHavesold");
		String strCIM_TransitFloater_OtherCoverages_TXT_RejectedShipments=(String) row.get("CIM_TransitFloater_OtherCoverages_TXT_RejectedShipments");
		String strCIM_TransitFloater_OtherCoverages_TXT_AdditionalInformation=(String) row.get("CIM_TransitFloater_OtherCoverages_TXT_AdditionalInformation");
		String strCIM_TransitFloater_OtherCoverages_BTN_Add=(String) row.get("CIM_TransitFloater_OtherCoverages_BTN_Add");
		String strCIM_TransitFloater_OtherCoverages_TXT_MotorCarrierFilingsOption=(String) row.get("CIM_TransitFloater_OtherCoverages_TXT_MotorCarrierFilingsOption");
		String strCIM_TransitFloater_OtherCoverages_TXT_NamedInsured=(String) row.get("CIM_TransitFloater_OtherCoverages_TXT_NamedInsured");
		String strCIM_TransitFloater_OtherCoverages_TXT_Street=(String) row.get("CIM_TransitFloater_OtherCoverages_TXT_Street");
		String strCIM_TransitFloater_OtherCoverages_TXT_City=(String) row.get("CIM_TransitFloater_OtherCoverages_TXT_City");
		String strCIM_TransitFloater_OtherCoverages_TXT_State=(String) row.get("CIM_TransitFloater_OtherCoverages_TXT_State");
		String strCIM_TransitFloater_OtherCoverages_TXT_Zip=(String) row.get("CIM_TransitFloater_OtherCoverages_TXT_Zip");
		String strCIM_TransitFloater_OtherCoverages_TXT_DateIssued=(String) row.get("CIM_TransitFloater_OtherCoverages_TXT_DateIssued");
		String strCIM_TransitFloater_OtherCoverages_Done=(String) row.get("CIM_TransitFloater_OtherCoverages_Done");
		String strTransaction  = (String) row.get("Transaction Name");
		try {
			se.log().logTestStep("TransitFloater_OtherCoverages");
			test.log(LogStatus.INFO, "TransitFloater_OtherCoverages page","Transaction Step : " + strTransaction + "<br>" +"Page : CIM_TransitFloater_OtherCoverages");
			se.verify().verifyEquals("TransitFloater_OtherCoverages Page of PowerWriter ",getCP_TransitFloater_OtherCoverages_LBL_TransitFloaterOtherCoverages().isDisplayed(),true, true,test);
			
			
			se.element().enterOrValidateText(getCIM_TransitFloater_OtherCoverages_TXT_AdditionalDebrisRemExpLim(strCIM_TransitFloater_OtherCoverages_TXT_AdditionalDebrisRemExpLim),strCIM_TransitFloater_OtherCoverages_TXT_AdditionalDebrisRemExpLim,test);
			if(se.element().isElementPresent(CIM_TransitFloater_OtherCoverages_BTN_OKButton)){
				se.element().Click(getCIM_TransitFloater_OtherCoverages_BTN_OKButton(), test);
			}
			se.element().enterOrValidateText(getCIM_TransitFloater_OtherCoverages_TXT_AdditionalDebrisRemExpLim(strCIM_TransitFloater_OtherCoverages_TXT_AdditionalDebrisRemExpLim),strCIM_TransitFloater_OtherCoverages_TXT_AdditionalDebrisRemExpLim,test);
			if(se.element().isElementPresent(CIM_TransitFloater_OtherCoverages_BTN_OKButton)){
				se.element().Click(getCIM_TransitFloater_OtherCoverages_BTN_OKButton(), test);
			}
			se.element().enterOrValidateText(getCIM_TransitFloater_OtherCoverages_TXT_EmergencyRemoval(strCIM_TransitFloater_OtherCoverages_TXT_EmergencyRemoval),strCIM_TransitFloater_OtherCoverages_TXT_EmergencyRemoval,test);
			
			se.element().enterOrValidateText(getCIM_TransitFloater_OtherCoverages_TXT_PollutantCleanupandRemovalLim(strCIM_TransitFloater_OtherCoverages_TXT_PollutantCleanupandRemovalLim),strCIM_TransitFloater_OtherCoverages_TXT_PollutantCleanupandRemovalLim,test);
			if(se.element().isElementPresent(CIM_TransitFloater_OtherCoverages_BTN_OKButton)){
				se.element().Click(getCIM_TransitFloater_OtherCoverages_BTN_OKButton(), test);
			}
			se.element().selectPopupWithMagnifier(getCIM_TransitFloater_OtherCoverages_TXT_PropYouHavesold(strCIM_TransitFloater_OtherCoverages_TXT_PropYouHavesold), getCIM_TransitFloater_OtherCoverages_BTN_PropYouHavesold(strCIM_TransitFloater_OtherCoverages_TXT_PropYouHavesold), strCIM_TransitFloater_OtherCoverages_TXT_PropYouHavesold, constants.NA, strCIM_TransitFloater_OtherCoverages_TXT_PropYouHavesold, constants.NA, constants.NA, constants.NA, test);
			se.element().selectPopupWithMagnifier(getCIM_TransitFloater_OtherCoverages_TXT_RejectedShipments(strCIM_TransitFloater_OtherCoverages_TXT_RejectedShipments), getCIM_TransitFloater_OtherCoverages_BTN_RejectedShipments(strCIM_TransitFloater_OtherCoverages_TXT_RejectedShipments), strCIM_TransitFloater_OtherCoverages_TXT_RejectedShipments, constants.NA, strCIM_TransitFloater_OtherCoverages_TXT_RejectedShipments, constants.NA, constants.NA, constants.NA, test);
	        se.element().enterOrValidateText(getCIM_TransitFloater_OtherCoverages_TXT_AdditionalInformation(strCIM_TransitFloater_OtherCoverages_TXT_AdditionalInformation),strCIM_TransitFloater_OtherCoverages_TXT_AdditionalInformation,test);
	        if(strCIM_TransitFloater_OtherCoverages_BTN_Add.equalsIgnoreCase("Yes")){
	        se.element().clickElement(CIM_TransitFloater_OtherCoverages_BTN_Add);
	        }
	        se.element().selectPopupWithMagnifier(getCIM_TransitFloater_OtherCoverages_TXT_MotorCarrierFilingsOption(strCIM_TransitFloater_OtherCoverages_TXT_MotorCarrierFilingsOption), getCIM_TransitFloater_OtherCoverages_BTN_MotorCarrierFilingsOption(strCIM_TransitFloater_OtherCoverages_TXT_MotorCarrierFilingsOption), strCIM_TransitFloater_OtherCoverages_TXT_MotorCarrierFilingsOption, constants.NA, strCIM_TransitFloater_OtherCoverages_TXT_MotorCarrierFilingsOption, constants.NA, constants.NA, constants.NA, test);
	        se.element().enterOrValidateText(getCIM_TransitFloater_OtherCoverages_TXT_NamedInsured(strCIM_TransitFloater_OtherCoverages_TXT_NamedInsured),strCIM_TransitFloater_OtherCoverages_TXT_NamedInsured,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_OtherCoverages_TXT_Street(strCIM_TransitFloater_OtherCoverages_TXT_Street),strCIM_TransitFloater_OtherCoverages_TXT_Street,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_OtherCoverages_TXT_City(strCIM_TransitFloater_OtherCoverages_TXT_City),strCIM_TransitFloater_OtherCoverages_TXT_City,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_OtherCoverages_TXT_State(strCIM_TransitFloater_OtherCoverages_TXT_State),strCIM_TransitFloater_OtherCoverages_TXT_State,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_OtherCoverages_TXT_Zip(strCIM_TransitFloater_OtherCoverages_TXT_Zip),strCIM_TransitFloater_OtherCoverages_TXT_Zip,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_OtherCoverages_TXT_DateIssued(strCIM_TransitFloater_OtherCoverages_TXT_DateIssued),strCIM_TransitFloater_OtherCoverages_TXT_DateIssued,test);
			se.element().Click(getNext(), test);
			if(strCIM_TransitFloater_OtherCoverages_Done.equalsIgnoreCase("Yes")){
				se.element().Click(getNext(), test);
				
			}
		
		}
	catch (Exception e) {
		se.verify().verifyEquals("Failed to fill in details for CIM_TransitFloater_OtherCoverages Page", true, false, true, test);
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
