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

public class CP_Liablityclasses extends BL_OR_CP{
	public void CP_Liablityclasses_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.Liability_Classes)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getBLPagesData(constants.Liability_Classes, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strLiabilityClasses_BTN_Add = (String) row.get("LiabilityClasses_BTN_ADDNew");
			String strLiabilityClasses_BTN_NoEdit = (String) row.get("LiabilityClasses_BTN_NoEdit");
			String strLiabilityClasses_DD_Loc = (String) row.get("LiabilityClasses_DD_LOC");
			String strLiabilityClasses_DD_ClassCode = (String) row.get("LiabilityClasses_DD_ClassCode");
			String strLiabilityClasses_CHK_Ifanystatusapplies_Yes = (String) row.get("LiabilityClasses_CHK_Ifanystatusapplies_Yes");
			String strLiabilityClasses_CHK_Ifanystatusapplies_No = (String) row.get("LiabilityClasses_CHK_Ifanystatusapplies_No");
			String strLiabilityClasses_BTN_Edit = (String) row.get("LiabilityClasses_BTN_Edit");
			String strLiabilityClasses_BTN_Edit1 = (String) row.get("LiabilityClasses_BTN_Edit1");
			String strLiabilityClasses_TXTV_ExposureBasis = (String) row.get("LiabilityClasses_TXTV_ExposureBasis");
			String strLiabilityClasses_BTN_Delete = (String) row.get("LiabilityClasses_BTN_Delete");
			String strLiabilityClasses_BTN_Delete_Loc = (String) row.get("LiabilityClasses_BTN_Delete_Loc");
			String strLiabilityClasses_TXTV_EstimatedExposure = (String) row.get("LiabilityClasses_TXTV_EstimatedExposure");
			String strLiabilityClasses_TXT_ClassCode = (String) row.get("LiabilityClasses_TXT_ClassCode");
			String strLiabilityClasses_LBL_HardstopMessage_YesOrNo = (String) row.get("LiabilityClasses_LBL_HardstopMessage_YesOrNo");
			String strLiabilityClasses_LBL_HardstopMessage = (String) row.get("LiabilityClasses_LBL_HardstopMessage");
			String strLiabilityClasses_TipMessage1 = (String) row.get("LiabilityClasses_TipMessage1");
			String strLiabilityClasses_TipMessage2 = (String) row.get("LiabilityClasses_TipMessage2");
			try {
				se.util().sleep(2000);
				se.log().logTestStep("CP_Liablityclasses_Details");
				test.log(LogStatus.INFO, "CP_Liablityclasses_Details","Transaction Step : "+transaction + "<br>" +"Page : CP_Liablityclasses_Details");
				//se.verify().verifyEquals("CP_Liablityclasses_Details  of AgencyPortal ", getLiabilityClasses_label().isDisplayed(),true, true,test);
				if(!strLiabilityClasses_TipMessage1.equalsIgnoreCase("N/A")) {
					se.element().enterOrValidateText(getLiabilityClasses_TipMessage1(strLiabilityClasses_TipMessage1),strLiabilityClasses_TipMessage1,test);
					
				}
				if(!strLiabilityClasses_TipMessage2.equalsIgnoreCase("N/A")) {
					se.element().enterOrValidateText(getLiabilityClasses_TipMessage2(strLiabilityClasses_TipMessage2),strLiabilityClasses_TipMessage2,test);
					
				}
				if(strLiabilityClasses_BTN_Edit.contains("Edit") ||strLiabilityClasses_BTN_NoEdit.contains("Yes"))
				{
					se.element().Click(getLiabilityClassess_BTN_Edit(strLiabilityClasses_BTN_Edit1), test);
					se.element().SelectElement(LiabilityClasses_DD_LOC, strLiabilityClasses_DD_Loc,test);
					se.element().enterOrValidateText(getLiabilityClasses_DD_ClassCode_text(strLiabilityClasses_TXT_ClassCode),strLiabilityClasses_TXT_ClassCode,test);
					//se.verify().verifyEquals( "LiabilityClasses classcode validation",se.element(). getSelectedText(LiabilityClasses_DD_ClassCode_text),strLiabilityClasses_DD_ClassCode,true,test);
					se.element().checkUncheckOrValidate(getLiabilityClasses_CHK_Ifanystatusapplies_Yes(strLiabilityClasses_CHK_Ifanystatusapplies_Yes),strLiabilityClasses_CHK_Ifanystatusapplies_Yes,test);
					se.element().checkUncheckOrValidate(getLiabilityClasses_CHK_Ifanystatusapplies_No(strLiabilityClasses_CHK_Ifanystatusapplies_No),strLiabilityClasses_CHK_Ifanystatusapplies_No,test);
					se.element().enterOrValidateText(getLiabilityClasses_TXTV_ExposureBasis(strLiabilityClasses_TXTV_ExposureBasis),strLiabilityClasses_TXTV_ExposureBasis,test);
					//se.verify().verifyEquals( "LiabilityClasses ExposureBasis validation",se.element(). getSelectedText(LiabilityClasses_TXTV_ExposureBasis ),strLiabilityClasses_TXTV_ExposureBasis ,true,test);
					se.element().enterOrValidateText(getLiabilityClasses_TXTV_EstimatedExposure(strLiabilityClasses_TXTV_EstimatedExposure),strLiabilityClasses_TXTV_EstimatedExposure,test);
					executor.executeScript("arguments[0].scrollIntoView(0,500);", getLocations_BTN_Save());
					se.element().Click(getLocations_BTN_Save(), test);
					se.element().waitForElementToDisappear_One(progressBar, 120);
				}
				else if(strLiabilityClasses_BTN_Delete.contains("Delete"))
				{
					se.element().Click(getLiabilityClassess_BTN_Delete(strLiabilityClasses_BTN_Delete_Loc), test);
					se.element().Click(getLiabilityClassess_BTN_Delete_Yes(), test);
					if(strLiabilityClasses_LBL_HardstopMessage_YesOrNo.contains("Yes")) {
						se.verify().verifyEquals("Verifying Hard stop Message", se.element().getText(LiabilityClassess_LBL_HardStopMessage), strLiabilityClasses_LBL_HardstopMessage, test);
					}
				}
				else if(strLiabilityClasses_BTN_Add.contains("Add"))
				{
					se.element().Click(getBuildingandOccupantSelection_BTN_AddNew(strLiabilityClasses_BTN_Add), test);
					se.element().SelectElement(LiabilityClasses_DD_LOC, strLiabilityClasses_DD_Loc,test);
					se.element().Click(getLiabilityClasses_DD_ClassCode(strLiabilityClasses_DD_ClassCode), test);
					se.element().enterOrValidateText(LiabilityClasses_DD_ClassCode_type(strLiabilityClasses_DD_ClassCode),strLiabilityClasses_DD_ClassCode,test);
					se.element().checkUncheckOrValidate(getLiabilityClasses_CHK_Ifanystatusapplies_Yes(strLiabilityClasses_CHK_Ifanystatusapplies_Yes),strLiabilityClasses_CHK_Ifanystatusapplies_Yes,test);
					se.element().checkUncheckOrValidate(getLiabilityClasses_CHK_Ifanystatusapplies_No(strLiabilityClasses_CHK_Ifanystatusapplies_No),strLiabilityClasses_CHK_Ifanystatusapplies_No,test);
					se.element().enterOrValidateText(getLiabilityClasses_TXTV_ExposureBasis(strLiabilityClasses_TXTV_ExposureBasis),strLiabilityClasses_TXTV_ExposureBasis,test);
					//se.verify().verifyEquals( "LiabilityClasses ExposureBasis validation",se.element(). getSelectedText(LiabilityClasses_TXTV_ExposureBasis ),strLiabilityClasses_TXTV_ExposureBasis ,true,test);
					se.element().enterOrValidateText(getLiabilityClasses_TXTV_EstimatedExposure(strLiabilityClasses_TXTV_EstimatedExposure),strLiabilityClasses_TXTV_EstimatedExposure,test);
					executor.executeScript("arguments[0].scrollIntoView(0,500);", getBuildingandOccupSelection_BTN_Add());
					se.element().Click(getBuildingandOccupSelection_BTN_Add(), test);
					se.element().waitForElementToDisappear_One(progressBar, 120);
				}
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for CP_Liablityclasses_Details ", true, false, true, test);
			}
			iteration++;
		}
		se.util().sleep(1000);
		se.element().Click(getGI_CHK_Continue(), test);
	}catch (Exception e) {
		
		se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
		test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
		testTearDown(se, test);
	}
	}
}
