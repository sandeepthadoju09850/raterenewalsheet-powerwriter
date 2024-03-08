package ap.pages.WC;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.ap.automation.common.ExcelOperations;
import Libraries.ap.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.OR_CP;

public class WC_RatingClassifications extends OR_CP {
	public void WC_RatingClassifications_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.RatingClassifications)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.RatingClassifications, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strRC_TXT_PartTimeEmp= (String) row.get("RC_TXT_PartTimeEmp");
			String strRC_DD_State= (String) row.get("RC_DD_State");
			String strRC_TXT_ClassCode= (String) row.get("RC_TXT_ClassCode");
			String strRC_BTN_Edit= (String) row.get("RC_BTN_Edit");
			String strRC_BTN_Add= (String) row.get("RC_BTN_Add");
			String strRC_BTN_Delete= (String) row.get("RC_BTN_Delete");
			String strRC_BTN_Delete_Loc= (String) row.get("RC_BTN_Delete_Loc");
			String strRC_BTN_Edit_Loc= (String) row.get("RC_BTN_Edit_Loc");
			String strRC_CHK_IfAny= (String) row.get("RC_CHK_IfAny");
			String strRC_TXT_EstimatedAnnualExposure= (String) row.get("RC_TXT_EstimatedAnnualExposure");
			String strRC_TXT_FullTimeEmp= (String) row.get("RC_TXT_FullTimeEmp");
			try {
				se.util().sleep(3000);
				se.log().logTestStep("WC_RatingClassifications");
				test.log(LogStatus.INFO, "WC_RatingClassifications","Transaction Step : "+transaction + "<br>" +"Page : WC_RatingClassifications");
				se.verify().verifyEquals("WC_RatingClassifications  of AgencyPortal ", getmenu_lnk_RatingClassifications().isDisplayed(),true, true,test);
				
				if(strRC_BTN_Edit.contains("Edit"))
				{
					se.element().Click(getRC_BTN_Edit(strRC_BTN_Edit_Loc), test);
					se.element().SelectElement(RC_DD_State,strRC_DD_State,test);
					se.element().Click(getRC_Click_ClassCode(), test);
					se.element().enterOrValidateText(getRC_TXT_ClassCode(strRC_TXT_ClassCode),strRC_TXT_ClassCode,test);
					se.element().checkUncheckOrValidate(getRC_CHK_IfAny(strRC_CHK_IfAny),strRC_CHK_IfAny,test);
					se.element().enterOrValidateText(getRC_TXT_EstimatedAnnualExposure(strRC_TXT_EstimatedAnnualExposure),strRC_TXT_EstimatedAnnualExposure,test);
					se.element().enterOrValidateText(getRC_TXT_FullTimeEmp(strRC_TXT_FullTimeEmp),strRC_TXT_FullTimeEmp,test);
					se.element().enterOrValidateText(getRC_TXT_PartTimeEmp(strRC_TXT_PartTimeEmp),strRC_TXT_PartTimeEmp,test);
					se.element().Click(getLocations_BTN_Save(), test);
				}
				else if(strRC_BTN_Add.contains("Add"))
				{
					se.element().Click(getLocations_BTN_AddNew(strRC_BTN_Add), test);
					se.element().SelectElement(RC_DD_State,strRC_DD_State,test);
					se.element().Click(getRC_Click_ClassCode(), test);
					se.element().enterOrValidateText(getRC_TXT_ClassCode(strRC_TXT_ClassCode),strRC_TXT_ClassCode,test);
					se.element().checkUncheckOrValidate(getRC_CHK_IfAny(strRC_CHK_IfAny),strRC_CHK_IfAny,test);
					se.element().enterOrValidateText(getRC_TXT_EstimatedAnnualExposure(strRC_TXT_EstimatedAnnualExposure),strRC_TXT_EstimatedAnnualExposure,test);
					se.element().enterOrValidateText(getRC_TXT_FullTimeEmp(strRC_TXT_FullTimeEmp),strRC_TXT_FullTimeEmp,test);
					se.element().enterOrValidateText(getRC_TXT_PartTimeEmp(strRC_TXT_PartTimeEmp),strRC_TXT_PartTimeEmp,test);
					se.element().Click(getAdd_Button(), test);
				}
				else if(strRC_BTN_Delete.equalsIgnoreCase("Delete"))
				{
					se.element().Click(getRC_BTN_Delete(strRC_BTN_Delete_Loc), test);
					se.element().Click(getLocations_BTN_Delete_Yes(), test);
				}
			}
			catch(Exception e){
				e.printStackTrace();
				e.getMessage();
				se.verify().verifyEquals("Failed to fill in details for WC_RatingClassifications", true, false, true, test);
			}
			iteration++;
		}
		test.log(LogStatus.INFO,"Rating Classification Roster - ",test.addScreenCapture(Util.captureScreenshot("Rating Classification Roster" , se)));
		se.util().sleep(2000);
		se.element().Click(getGI_CHK_Continue(), test);
		se.element().waitBasedOnCount(PleaseWaitPopup,40);
	}catch (Exception e) {
		
		se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
		test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
		testTearDown(se, test);
	}
	}
}
