package ap.pages.CA;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.BL_OR_CP;

public class CA_AdditionalInterests extends BL_OR_CP {
	public void CA_AdditionalInterests_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.CA_AdditionalInterests)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_AdditionalInterests, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strAutoAdditionalInterests_BTN_Add = (String) row.get("AutoAdditionalInterests_BTN_Add");
			String strAutoAdditionalInterests_BTN_Edit = (String) row.get("AutoAdditionalInterests_BTN_Edit");
			String strAutoAdditionalInterests_BTN_Delete = (String) row.get("AutoAdditionalInterests_BTN_Delete");
			String strAutoAdditionalInterests_BTN_Delete_Loc = (String) row.get("AutoAdditionalInterests_BTN_Delete_Loc");
			String strAutoAdditionalInterests_DD_InterestType = (String) row.get("AutoAdditionalInterests_DD_InterestType");
			String strAutoAdditionalInterests_DD_Vehicle = (String) row.get("AutoAdditionalInterests_DD_Vehicle");
			String strAutoAdditionalIntersets_TXT_UnspecifiedVehicle  = (String) row.get("AutoAdditionalInterests_DD_UnspecVehicle");
			String strAutoAdditionalInterests_TXT_Name = (String) row.get("AutoAdditionalInterests_TXT_Name");
			String strAutoAdditionalInterests_TXT_StrAddLine1 = (String) row.get("AutoAdditionalInterests_TXT_StrAddLine1");
			String strAutoAdditionalInterests_TXT_StrAddLine2 = (String) row.get("AutoAdditionalInterests_TXT_StrAddLine2");
			String strAutoAdditionalInterests_TXT_City = (String) row.get("AutoAdditionalInterests_TXT_City");
			String strAutoAdditionalInterests_DD_State = (String) row.get("AutoAdditionalInterests_DD_State");
			String strAutoAdditionalInterests_TXT_ZipCode = (String) row.get("AutoAdditionalInterests_TXT_ZipCode");
			String strAutoAdditionalInterests_TXT_RefLoan = (String) row.get("AutoAdditionalInterests_TXT_RefLoan");
			try {
				se.util().sleep(2000);
				se.log().logTestStep("CA_LiabilityAdditonalInterests_Details");
				test.log(LogStatus.INFO, "CA_LiabilityAdditonalInterests_Details","Transaction Step : "+transaction + "<br>" +"Page : CP_LiabilityAdditonalInterests_Details");
				se.verify().verifyEquals("CA_LiabilityAdditonalInterests_Details  of AgencyPortal ", getAutoAdditionalInterests_label().isDisplayed(),true, true,test);
				if(strAutoAdditionalInterests_BTN_Edit.contains("Edit"))
				{
					se.element().Click(getAutoAdditionalInterests_BTN_Edit(strAutoAdditionalInterests_BTN_Edit), test);
					se.element().SelectElement(AutoAdditionalInterests_DD_InterestType, strAutoAdditionalInterests_DD_InterestType,test);
					se.element().waitForElementToAppear_One(strAutoAdditionalInterests_DD_Vehicle,AI_dd_AddIntVehicle, 20);
					se.element().SelectElement(AI_dd_AddIntVehicle, strAutoAdditionalInterests_DD_Vehicle,test);
					se.element().enterOrValidateText(getAI_dd_AddIntVehicleType(strAutoAdditionalIntersets_TXT_UnspecifiedVehicle), strAutoAdditionalIntersets_TXT_UnspecifiedVehicle,test);
					se.element().enterOrValidateText(getAutoAdditionalInterests_TXT_Name(strAutoAdditionalInterests_TXT_Name), strAutoAdditionalInterests_TXT_Name,test);
					se.element().enterOrValidateText(getAutoAdditionalInterests_TXT_StrAddLine1(strAutoAdditionalInterests_TXT_StrAddLine1), strAutoAdditionalInterests_TXT_StrAddLine1,test);
					se.element().enterOrValidateText(getAutoAdditionalInterests_TXT_StrAddLine2(strAutoAdditionalInterests_TXT_StrAddLine2), strAutoAdditionalInterests_TXT_StrAddLine2,test);
					se.element().enterOrValidateText(getAutoAdditionalInterests_TXT_City(strAutoAdditionalInterests_TXT_City), strAutoAdditionalInterests_TXT_City,test);
					se.element().SelectElement(AutoAdditionalInterests_DD_State, strAutoAdditionalInterests_DD_State,test);
					se.element().enterOrValidateText(getAutoAdditionalInterests_TXT_ZipCode(strAutoAdditionalInterests_TXT_ZipCode), strAutoAdditionalInterests_TXT_ZipCode,test);
					se.element().enterOrValidateText(getAutoAdditionalInterests_TXT_ZipCode(strAutoAdditionalInterests_TXT_ZipCode), strAutoAdditionalInterests_TXT_ZipCode,test);
					executor.executeScript("arguments[0].scrollIntoView(0,500);", getLocations_BTN_Save());
					se.element().Click(getLocations_BTN_Save(), test);
					se.element().waitForElement(progressBar);
				}
				else if(strAutoAdditionalInterests_BTN_Delete.contains("Delete"))
				{
					se.element().Click(getAutoAdditionalInterests_BTN_Delete(strAutoAdditionalInterests_BTN_Delete_Loc), test);
					se.element().Click(getLocations_BTN_Delete_Yes(), test);
				}
				else if(strAutoAdditionalInterests_BTN_Add.contains("Add"))
				{
					se.element().Click(getBuildingandOccupantSelection_BTN_AddNew(strAutoAdditionalInterests_BTN_Add), test);
					se.element().SelectElement(AutoAdditionalInterests_DD_InterestType, strAutoAdditionalInterests_DD_InterestType,test);
					se.element().SelectElement(AI_dd_AddIntVehicle, strAutoAdditionalInterests_DD_Vehicle,test);
					se.element().enterOrValidateText(getAI_dd_AddIntVehicleType(strAutoAdditionalIntersets_TXT_UnspecifiedVehicle), strAutoAdditionalIntersets_TXT_UnspecifiedVehicle,test);
					se.element().enterOrValidateText(getAutoAdditionalInterests_TXT_Name(strAutoAdditionalInterests_TXT_Name), strAutoAdditionalInterests_TXT_Name,test);
					se.element().enterOrValidateText(getAutoAdditionalInterests_TXT_StrAddLine1(strAutoAdditionalInterests_TXT_StrAddLine1), strAutoAdditionalInterests_TXT_StrAddLine1,test);
					se.element().enterOrValidateText(getAutoAdditionalInterests_TXT_StrAddLine2(strAutoAdditionalInterests_TXT_StrAddLine2), strAutoAdditionalInterests_TXT_StrAddLine2,test);
					se.element().enterOrValidateText(getAutoAdditionalInterests_TXT_City(strAutoAdditionalInterests_TXT_City), strAutoAdditionalInterests_TXT_City,test);
					se.element().SelectElement(AutoAdditionalInterests_DD_State, strAutoAdditionalInterests_DD_State,test);
					se.element().enterOrValidateText(getAutoAdditionalInterests_TXT_ZipCode(strAutoAdditionalInterests_TXT_ZipCode), strAutoAdditionalInterests_TXT_ZipCode,test);
					se.element().enterOrValidateText(getAutoAdditionalInterests_TXT_RefLoan(strAutoAdditionalInterests_TXT_RefLoan), strAutoAdditionalInterests_TXT_RefLoan,test);
					se.element().Click(getBuildingandOccupSelection_BTN_Add(), test);
					se.element().Click(getGI_CHK_Continue(), test);
					}
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for CA_AdditonalInterests_Details ", true, false, true, test);
			}iteration++;
		}

se.util().sleep(3000);
		se.element().Click(getGI_CHK_Continue(), test);
	}catch (Exception e) {
		
		se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
		test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
		testTearDown(se, test);
	}
	}



}


