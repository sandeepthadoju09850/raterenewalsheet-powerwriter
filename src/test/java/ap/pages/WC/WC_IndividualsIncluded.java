package ap.pages.WC;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.BL_OR_CP;

public class WC_IndividualsIncluded extends BL_OR_CP {
	public void WC_IndividualsIncluded_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.IndividualsIncluded)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.IndividualsIncluded, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strInd_BTN_Add= (String) row.get("Ind_BTN_Add");
			String strInd_BTN_Edit= (String) row.get("Ind_BTN_Edit");
			String strInd_BTN_EditLoc= (String) row.get("Ind_BTN_EditLoc");
			String strInd_DD_Location= (String) row.get("Ind_DD_Location");
			String strInd_TXT_Name= (String) row.get("Ind_TXT_Name");
			String strInd_CHK_Included= (String) row.get("Ind_CHK_Included");
			String strInd_CHK_Excluded= (String) row.get("Ind_CHK_Excluded");
			String strInd_CHK_Sign_Yes= (String) row.get("Ind_CHK_Sign_Yes");
			String strInd_CHK_Sign_No= (String) row.get("Ind_CHK_Sign_No");
			String strInd_DD_Title= (String) row.get("Ind_DD_Title");
			String strInd_TXT_Ownership= (String) row.get("Ind_TXT_Ownership");
			String strInd_TXT_DOB= (String) row.get("Ind_TXT_DOB");
			String strInd_TXT_Duties= (String) row.get("Ind_TXT_Duties");
			try {
				se.util().sleep(3000);
				se.log().logTestStep("WC_IndividualsIncluded");
				test.log(LogStatus.INFO, "WC_IndividualsIncluded","Transaction Step : "+transaction + "<br>" +"Page : WC_IndividualsIncluded");
				se.verify().verifyEquals("WC_IndividualsIncluded  of AgencyPortal ", getmenu_lnk_Individuals().isDisplayed(),true, true,test);
				if(strInd_BTN_Edit.contains("Edit"))
				{
					se.element().Click(getRC_BTN_Edit(strInd_BTN_EditLoc), test);
					se.element().SelectElement(Ind_DD_Location,strInd_DD_Location,test);
					se.element().enterOrValidateText(getInd_TXT_Name(strInd_TXT_Name),strInd_TXT_Name,test);
					se.element().checkUncheckOrValidate(getInd_CHK_Included(strInd_CHK_Included),strInd_CHK_Included,test);
					se.element().checkUncheckOrValidate(getInd_CHK_Excluded(strInd_CHK_Excluded),strInd_CHK_Excluded,test);
					se.element().checkUncheckOrValidate(getInd_CHK_Sign_Yes(strInd_CHK_Sign_Yes),strInd_CHK_Sign_Yes,test);
					se.element().checkUncheckOrValidate(getInd_CHK_Sign_No(strInd_CHK_Sign_No),strInd_CHK_Sign_No,test);
					se.element().SelectElement(Ind_DD_Title,strInd_DD_Title,test);
					se.element().enterOrValidateText(getInd_TXT_Ownership(strInd_TXT_Ownership),strInd_TXT_Ownership,test);
					se.element().enterOrValidateText(getInd_TXT_DOB(strInd_TXT_DOB),strInd_TXT_DOB,test);
					se.element().enterOrValidateText(getInd_TXT_Duties(strInd_TXT_Duties),strInd_TXT_Duties,test);
					se.element().Click(getLocations_BTN_Save(), test);
				}
				else if(strInd_BTN_Add.contains("Add"))
				{
					se.element().Click(getLocations_BTN_AddNew(strInd_BTN_Add), test);
					se.element().SelectElement(Ind_DD_Location,strInd_DD_Location,test);
					se.element().enterOrValidateText(getInd_TXT_Name(strInd_TXT_Name),strInd_TXT_Name,test);
					se.element().checkUncheckOrValidate(getInd_CHK_Included(strInd_CHK_Included),strInd_CHK_Included,test);
					se.element().checkUncheckOrValidate(getInd_CHK_Excluded(strInd_CHK_Excluded),strInd_CHK_Excluded,test);
					se.element().checkUncheckOrValidate(getInd_CHK_Sign_Yes(strInd_CHK_Sign_Yes),strInd_CHK_Sign_Yes,test);
					se.element().checkUncheckOrValidate(getInd_CHK_Sign_No(strInd_CHK_Sign_No),strInd_CHK_Sign_No,test);
					se.element().SelectElement(Ind_DD_Title,strInd_DD_Title,test);
					se.element().enterOrValidateText(getInd_TXT_Ownership(strInd_TXT_Ownership),strInd_TXT_Ownership,test);
					se.element().enterOrValidateText(getInd_TXT_DOB(strInd_TXT_DOB),strInd_TXT_DOB,test);
					se.element().enterOrValidateText(getInd_TXT_Duties(strInd_TXT_Duties),strInd_TXT_Duties,test);
					/*se.element().SelectElement(RC_DD_State,strInd_DD_Location,test);
					se.element().enterOrValidateText(getRC_TXT_ClassCode(strInd_TXT_Name),strInd_TXT_Name,test);
					se.element().checkUncheckOrValidate(getRC_CHK_IfAny(strInd_CHK_Included),strInd_CHK_Included,test);
					se.element().checkUncheckOrValidate(getRC_CHK_IfAny(strInd_CHK_Excluded),strInd_CHK_Excluded,test);
					se.element().checkUncheckOrValidate(getRC_CHK_IfAny(strInd_CHK_Sign_Yes),strInd_CHK_Sign_Yes,test);
					se.element().checkUncheckOrValidate(getRC_CHK_IfAny(strInd_CHK_Sign_No),strInd_CHK_Sign_No,test);
					se.element().SelectElement(RC_DD_State,strInd_DD_Title,test);
					se.element().enterOrValidateText(getRC_TXT_EstimatedAnnualExposure(strInd_TXT_Ownership),strInd_TXT_Ownership,test);
					se.element().enterOrValidateText(getRC_TXT_FullTimeEmp(strInd_TXT_DOB),strInd_TXT_DOB,test);
					se.element().enterOrValidateText(getRC_TXT_PartTimeEmp(strInd_TXT_Duties),strInd_TXT_Duties,test);*/
					se.element().Click(getAdd_Button(), test);
				}
			}
			catch(Exception e){
				e.printStackTrace();
				e.getMessage();
				se.verify().verifyEquals("Failed to fill in details for WC_IndividualsIncluded", true, false, true, test);
			}
			iteration++;
		}
		se.element().Click(getGI_CHK_Continue(), test);
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}
}
