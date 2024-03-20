package ap.pages.CP;

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

public class CP_LiabilityAdditonalInterests extends BL_OR_CP {
	public void CP_LiabilityAdditonalInterests_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.Liability_Additional_Interests)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Liability_Additional_Interests, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strLiabilityAdditionalInterests_BTN_Add = (String) row.get("LiabilityAdditionalInterests_BTN_ADDNew");
			//String strLiabilityAdditionalInterests_DD_Loc = (String) row.get("LiabilityAdditionalInterests_DD_LOC");
			String strLiabilityAdditionalInterests_BTN_Edit = (String) row.get("LiabilityAdditionalInterests_BTN_Edit");
			String strLiabilityAdditionalInterests_BTN_Delete = (String) row.get("LiabilityAdditionalInterests_BTN_Delete");
			String strLiabilityAdditionalInterests_BTN_Delete_Loc = (String) row.get("LiabilityAdditionalInterests_BTN_Delete_Loc");
			String strLiabilityAdditionalInterests_DD_InterestType = (String) row.get("LiabilityAdditionalInterests_DD_InterestType");
			String strLiabilityAdditionalInterests_DD_Vehicle = (String) row.get("LiabilityAdditionalInterests_DD_Vehicle");
			String strLiabilityAdditionalIntersets_TXT_UnspecifiedVehicle  = (String) row.get("LiabilityAdditionalIntersets_TXT_UnspecifiedVehicle ");
			String strLiabilityAdditionalInterests_TXT_Name = (String) row.get("LiabilityAdditionalInterests_TXT_Name");
			String strLiabilityAdditionalInterests_TXT_StrAddLine1 = (String) row.get("LiabilityAdditionalInterests_TXT_StrAddLine1");
			String strLiabilityAdditionalInterests_TXT_StrAddLine2 = (String) row.get("LiabilityAdditionalInterests_TXT_StrAddLine2");
			String strLiabilityAdditionalInterests_TXT_City = (String) row.get("LiabilityAdditionalInterests_TXT_City");
			String strLiabilityAdditionalInterests_DD_State = (String) row.get("LiabilityAdditionalInterests_DD_State");
			String strLiabilityAdditionalInterests_TXT_ZipCode = (String) row.get("LiabilityAdditionalInterests_TXT_ZipCode");
			String strLiabilityAdditionalInterests_DD_Location = (String) row.get("LiabilityAdditionalInterests_DD_Location");
			String strLiabilityAdditionalInterests_TXT_DesignatedConstruction = (String) row.get("LiabilityAdditionalInterests_TXT_DesignatedConstruction");
			String strLiabilityAdditionalInterests_TXT_ProductDescription = (String) row.get("LiabilityAdditionalInterests_TXT_ProductDescription");
			String strLiabilityAdditionalInterests_TXT_Project = (String) row.get("LiabilityAdditionalInterests_TXT_Project");
			String strLiabilityAdditionalInterests_LBL_HardstopMsg_NatOfCanc_YesorNo = (String) row.get("LiabilityAdditionalInterests_LBL_HardstopMsg_NatOfCanc_YesorNo");
			String strLiabilityAdditionalInterests_LBL_HardstopMsg_NatOfCanc = (String) row.get("LiabilityAdditionalInterests_LBL_HardstopMsg_NatOfCanc");
			try {
				se.util().sleep(2000);
				se.log().logTestStep("CP_LiabilityAdditonalInterests_Details");
				test.log(LogStatus.INFO, "CP_LiabilityAdditonalInterests_Details","Transaction Step : "+transaction + "<br>" +"Page : CP_LiabilityAdditonalInterests_Details");
				se.verify().verifyEquals("CP_LiabilityAdditonalInterests_Details  of AgencyPortal ", getLiabilityAdditionalInterests_label().isDisplayed(),true, true,test);
				if(strLiabilityAdditionalInterests_BTN_Edit.contains("Edit"))
				{
					se.element().Click(getLiabilityAdditionalInterests_BTN_Edit(strLiabilityAdditionalInterests_BTN_Delete_Loc), test);
					se.element().SelectElement(LiabilityAdditionalInterests_DD_InterestType, strLiabilityAdditionalInterests_DD_InterestType,test);
					se.element().waitForElementToAppear_One(strLiabilityAdditionalInterests_DD_Vehicle,AI_dd_AddIntVehicle, 20);
					se.element().SelectElement(AI_dd_AddIntVehicle, strLiabilityAdditionalInterests_DD_Vehicle,test);
					se.util().sleep(2000);
					se.element().enterOrValidateText(getAI_dd_AddIntVehicleType(strLiabilityAdditionalIntersets_TXT_UnspecifiedVehicle), strLiabilityAdditionalIntersets_TXT_UnspecifiedVehicle,test);
					if(!strLiabilityAdditionalInterests_TXT_Name.equalsIgnoreCase("N/A")) {
						se.element().Click(getLiabilityAdditionalInterests_TXT_Name(strLiabilityAdditionalInterests_TXT_Name), test);
						
					}
					se.element().enterOrValidateText(getLiabilityAdditionalInterests_TXT_Name(strLiabilityAdditionalInterests_TXT_Name), strLiabilityAdditionalInterests_TXT_Name,test);
					se.element().enterOrValidateText(getLiabilityAdditionalInterests_TXT_StrAddLine1(strLiabilityAdditionalInterests_TXT_StrAddLine1), strLiabilityAdditionalInterests_TXT_StrAddLine1,test);
					se.element().enterOrValidateText(getLiabilityAdditionalInterests_TXT_StrAddLine2(strLiabilityAdditionalInterests_TXT_StrAddLine2), strLiabilityAdditionalInterests_TXT_StrAddLine2,test);
					se.element().enterOrValidateText(getLiabilityAdditionalInterests_TXT_City(strLiabilityAdditionalInterests_TXT_City), strLiabilityAdditionalInterests_TXT_City,test);
					se.element().SelectElement(LiabilityAdditionalInterests_DD_State, strLiabilityAdditionalInterests_DD_State,test);
					se.element().enterOrValidateText(getLiabilityAdditionalInterests_TXT_ZipCode(strLiabilityAdditionalInterests_TXT_ZipCode), strLiabilityAdditionalInterests_TXT_ZipCode,test);
					se.element().SelectElement(LiabilityAdditionalInterests_DD_Location, strLiabilityAdditionalInterests_DD_Location,test);
					se.element().enterOrValidateText(getLiabilityAdditionalInterests_TXT_DesignatedConstruction(strLiabilityAdditionalInterests_TXT_DesignatedConstruction), strLiabilityAdditionalInterests_TXT_DesignatedConstruction,test);
					se.element().enterOrValidateText(getLiabilityAdditionalInterests_TXT_ProductDescription(strLiabilityAdditionalInterests_TXT_ProductDescription), strLiabilityAdditionalInterests_TXT_ProductDescription,test);
					se.element().enterOrValidateText(getLiabilityAdditionalInterests_TXT_Project(strLiabilityAdditionalInterests_TXT_Project), strLiabilityAdditionalInterests_TXT_Project,test);
					executor.executeScript("arguments[0].scrollIntoView(0,500);", getLocations_BTN_Save());
					se.element().Click(getLocations_BTN_Save(), test);
					se.element().waitForElement(progressBar);
				}
				else if(strLiabilityAdditionalInterests_BTN_Delete.contains("Delete"))
				{
					se.element().Click(getLiabilityAdditionalInterests_BTN_Delete(strLiabilityAdditionalInterests_BTN_Delete_Loc), test);
					se.element().Click(getLocations_BTN_Delete_Yes(), test);
				}
				else if(strLiabilityAdditionalInterests_BTN_Add.contains("Add"))
				{
					se.element().Click(getBuildingandOccupantSelection_BTN_AddNew(strLiabilityAdditionalInterests_BTN_Add), test);
					se.element().SelectElement(LiabilityAdditionalInterests_DD_InterestType, strLiabilityAdditionalInterests_DD_InterestType,test);
					//se.element().waitForElementToDisappear_One(AI_dd_AddIntVehicle, 20);
					se.element().SelectElement(AI_dd_AddIntVehicle, strLiabilityAdditionalInterests_DD_Vehicle,test);
					se.util().sleep(2000);
					se.element().enterOrValidateText(getAI_dd_AddIntVehicleType(strLiabilityAdditionalIntersets_TXT_UnspecifiedVehicle), strLiabilityAdditionalIntersets_TXT_UnspecifiedVehicle,test);
					if(!strLiabilityAdditionalInterests_TXT_Name.equalsIgnoreCase("N/A")) {
						se.element().Click(getLiabilityAdditionalInterests_TXT_Name(strLiabilityAdditionalInterests_TXT_Name), test);
						
					}
					se.element().enterOrValidateText(getLiabilityAdditionalInterests_TXT_Name(strLiabilityAdditionalInterests_TXT_Name), strLiabilityAdditionalInterests_TXT_Name,test);
					se.element().enterOrValidateText(getLiabilityAdditionalInterests_TXT_StrAddLine1(strLiabilityAdditionalInterests_TXT_StrAddLine1), strLiabilityAdditionalInterests_TXT_StrAddLine1,test);
					se.element().enterOrValidateText(getLiabilityAdditionalInterests_TXT_StrAddLine2(strLiabilityAdditionalInterests_TXT_StrAddLine2), strLiabilityAdditionalInterests_TXT_StrAddLine2,test);
					se.element().enterOrValidateText(getLiabilityAdditionalInterests_TXT_City(strLiabilityAdditionalInterests_TXT_City), strLiabilityAdditionalInterests_TXT_City,test);
					se.element().SelectElement(LiabilityAdditionalInterests_DD_State, strLiabilityAdditionalInterests_DD_State,test);
					se.element().enterOrValidateText(getLiabilityAdditionalInterests_TXT_ZipCode(strLiabilityAdditionalInterests_TXT_ZipCode), strLiabilityAdditionalInterests_TXT_ZipCode,test);
					se.element().SelectElement(LiabilityAdditionalInterests_DD_Location, strLiabilityAdditionalInterests_DD_Location,test);
					se.element().enterOrValidateText(getLiabilityAdditionalInterests_TXT_DesignatedConstruction(strLiabilityAdditionalInterests_TXT_DesignatedConstruction), strLiabilityAdditionalInterests_TXT_DesignatedConstruction,test);
					se.element().enterOrValidateText(getLiabilityAdditionalInterests_TXT_ProductDescription(strLiabilityAdditionalInterests_TXT_ProductDescription), strLiabilityAdditionalInterests_TXT_ProductDescription,test);
					se.element().enterOrValidateText(getLiabilityAdditionalInterests_TXT_Project(strLiabilityAdditionalInterests_TXT_Project), strLiabilityAdditionalInterests_TXT_Project,test);
					se.element().Click(getBuildingandOccupSelection_BTN_Add(), test);
					if(strLiabilityAdditionalInterests_LBL_HardstopMsg_NatOfCanc_YesorNo.contains("Yes")) 
					{						
						se.element().Click(getGI_CHK_Continue(), test);
						se.verify().verifyEquals("Verifying Hard stop Message", se.element().getText(LiabilityAdditionalInterests_LBL_HardstopMsg_NatOfCanc), strLiabilityAdditionalInterests_LBL_HardstopMsg_NatOfCanc,  test);
					}
				}
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for CP_LiabilityAdditonalInterests_Details ", true, false, true, test);
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


