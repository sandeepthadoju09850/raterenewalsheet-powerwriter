package pw.pages.WC;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_WC;

public class WC_StateInformation extends OR_WC {
public void StateInformation(String strRegressionID, String transaction, String suspendSheet, ExtentTest test) throws IOException {
		
		try{
			    if(suspendSheet.equalsIgnoreCase(constants.WC_StateInformation)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
			
			List<Map<String, String>> table = ExcelOperations.getPagesData(constants.WC_StateInformation, strRegressionID, transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				
				String strStateInformation_BTN_Add = (String) row.get("StateInformation_BTN_Add");
				String strStateInformation_BTN_Details = (String) row.get("StateInformation_BTN_Details");
				String strStateInformation_BTN_Done = (String) row.get("StateInformation_BTN_Done");
				String strStateInformation_TXT_RiskState = (String) row.get("StateInformation_TXT_RiskState");
				String strStateInformation_TXT_RiskStateFilterNeeded = (String) row.get("StateInformation_TXT_RiskStateFilterNeeded");
				String strStateInformation_TXT_StateAddedReason = (String) row.get("StateInformation_TXT_StateAddedReason");
				String strStateInformation_TXT_StateAddedReasonFilterNeeded = (String) row.get("StateInformation_TXT_StateAddedReasonFilterNeeded");
				String strStateInformation_TXT_ClassAssignment = (String) row.get("StateInformation_TXT_ClassAssignment");
				String strStateInformation_TXT_ClassAssignmentFilterNeeded = (String) row.get("StateInformation_TXT_ClassAssignmentFilterNeeded");
				String strStateInformation_TXT_CarrierCode = (String) row.get("StateInformation_TXT_CarrierCode");
				String strStateInformation_TXT_SI_NCCI_ID = (String) row.get("StateInformation_TXT_SI_NCCI_ID");
				String strStateInformation_CHK_AnniversaryRatingDate = (String) row.get("StateInformation_CHK_AnniversaryRatingDate");
				String strStateInformation_TXT_AnniversaryRatingDate = (String) row.get("StateInformation_TXT_AnniversaryRatingDate");
				String strStateInformation_TXT_IndependentBureauRiskID = (String) row.get("StateInformation_TXT_IndependentBureauRiskID");
				String strStateInformation_TXT_NCCIBureauRiskID = (String) row.get("StateInformation_TXT_NCCIBureauRiskID");
				String strStateInformation_CHK_ApplyPremiumDiscount = (String) row.get("StateInformation_CHK_ApplyPremiumDiscount");
				String strStateInformation_TXT_ActualLosses = (String) row.get("StateInformation_TXT_ActualLosses");
				String strStateInformation_TXT_ExpectedLosses = (String) row.get("StateInformation_TXT_ExpectedLosses");
				String strStateInformation_BTN_Delete = (String) row.get("StateInformation_BTN_Delete");
				
				
				try
				{
					test.log(LogStatus.INFO, "WC_StateInformation","Transaction Step : "+ transaction + "<br>" +"Page : WC_StateInformation");
					se.log().logSeStep("Selecting WC_StateInformation ");
					se.verify().verifyEquals("WC_StateInformation page of PowerWriter ", getStateInformation_BTN_Label().isDisplayed(),true, true,test);
					if(strStateInformation_BTN_Add.equalsIgnoreCase("Yes")){
						se.element().Click(getStateInformation_BTN_Add(strStateInformation_BTN_Add),test);
					}
						
					
					if(!strStateInformation_BTN_Details.equalsIgnoreCase("N/A")){
						se.element().Click(getStateInformation_BTN_Details(strStateInformation_BTN_Details), test);
					}
					
					if(strStateInformation_BTN_Delete.equalsIgnoreCase("Yes")){
						se.element().Click(getStateInformation_BTN_Delete(),test);
					}
					
					se.element().selectPopupWithMagnifier(getStateInformation_TXT_RiskState(strStateInformation_TXT_RiskState),getStateInformation_TXT_RiskStateSearch(strStateInformation_TXT_RiskState),strStateInformation_TXT_RiskState,strStateInformation_TXT_RiskStateFilterNeeded,strStateInformation_TXT_RiskState, constants.NA, constants.NA,constants.NA,test);
					
					if(strStateInformation_TXT_RiskState.equalsIgnoreCase("Indiana") && strRegressionID.equalsIgnoreCase("WC_13")) {
						se.element().enterOrValidateText(getStateInformation_TXT_StateAddedReason(strStateInformation_TXT_StateAddedReason),strStateInformation_TXT_StateAddedReason, test);
						se.util().sleep(1000);
						se.element().Click(getcommon_BTN_PopupCloseBTN(), test);
					} else {
						se.element().selectPopupWithMagnifier(getStateInformation_TXT_StateAddedReason(strStateInformation_TXT_StateAddedReason),getStateInformation_TXT_StateAddedReasonSearch(strStateInformation_TXT_StateAddedReason),strStateInformation_TXT_StateAddedReason,strStateInformation_TXT_StateAddedReasonFilterNeeded,strStateInformation_TXT_StateAddedReason, constants.NA, constants.NA,constants.NA,test);
					}
					//se.element().enterOrValidateText(getStateInformation_TXT_ClassAssignment(strStateInformation_TXT_ClassAssignment),strStateInformation_TXT_ClassAssignment,test);
					se.element().selectPopupWithMagnifier(getStateInformation_TXT_ClassAssignment(strStateInformation_TXT_ClassAssignment),getStateInformation_TXT_ClassAssignmentSearch(strStateInformation_TXT_ClassAssignment),strStateInformation_TXT_ClassAssignment,strStateInformation_TXT_ClassAssignmentFilterNeeded,strStateInformation_TXT_ClassAssignment, constants.NA, constants.NA,constants.NA,test);
					se.element().enterOrValidateText(getStateInformation_TXT_CarrierCode(strStateInformation_TXT_CarrierCode),strStateInformation_TXT_CarrierCode,test);
					se.element().Click(getStateInformation_TXT_SI_NCCI_ID(strStateInformation_TXT_SI_NCCI_ID),strStateInformation_TXT_SI_NCCI_ID,test);
					se.element().checkUncheckOrValidate(getStateInformation_CHK_AnniversaryRatingDate(strStateInformation_CHK_AnniversaryRatingDate),strStateInformation_CHK_AnniversaryRatingDate,test);
					se.element().enterOrValidateText(getStateInformation_TXT_AnniversaryRatingDate(strStateInformation_TXT_AnniversaryRatingDate),strStateInformation_TXT_AnniversaryRatingDate,test);
					se.element().enterOrValidateText(getStateInformation_TXT_IndependentBureauRiskID(strStateInformation_TXT_IndependentBureauRiskID),strStateInformation_TXT_IndependentBureauRiskID,test);
					se.element().enterOrValidateText(getStateInformation_TXT_NCCIBureauRiskID(strStateInformation_TXT_NCCIBureauRiskID),strStateInformation_TXT_NCCIBureauRiskID,test);
					se.element().checkUncheckOrValidate(getStateInformation_CHK_ApplyPremiumDiscount(strStateInformation_CHK_ApplyPremiumDiscount),strStateInformation_CHK_ApplyPremiumDiscount,test);
					se.element().enterOrValidateText(getStateInformation_TXT_ActualLosses(strStateInformation_TXT_ActualLosses),strStateInformation_TXT_ActualLosses,test);
					se.element().enterOrValidateText(getStateInformation_TXT_ExpectedLosses(strStateInformation_TXT_ExpectedLosses),strStateInformation_TXT_ExpectedLosses,test);
					se.element().clickElement(getNext());
					
					if(strStateInformation_BTN_Done.equalsIgnoreCase(constants.Yes)){
						se.element().Click(getDone(),test);	
					}
					
				
					
				}catch(Exception e) {
 					se.verify().verifyEquals("Failed to fill in details for WC_StateInformation", true, false, true, test);
							
					
					}
							iteration++;
						}
					
				}
				catch (Exception e) {
					
					se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
					test.log(LogStatus.FAIL, "Failed", "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
					testTearDown(se, test);
				}
					
			}
}
