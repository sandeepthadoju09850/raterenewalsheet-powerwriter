package ap.pages.SE;

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

public class SE_HoleInOnePrizes  extends BL_OR_CP{
	public void CP_HoleInOnePrizes_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.HoleInOne)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.HoleInOne, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strHOLEIN_TXT_Prize_Hole_Number = (String) row.get("HOLEIN_TXT_Prize_Hole_Number");
			String strHOLEIN_TXT_Prize_Hole_Value = (String) row.get("HOLEIN_TXT_Prize_Hole_Value");
			String strHOLEIN_TXT_Prize_Hole_Yardage = (String) row.get("HOLEIN_TXT_Prize_Hole_Yardage");
			String strHOLEIN_CHK_Reinstatement_Yes = (String) row.get("HOLEIN_CHK_Reinstatement_Yes");
			String strHOLEIN_CHK_Reinstatement_No = (String) row.get("HOLEIN_CHK_Reinstatement_No");
			String strHOLEIN_CHK_Sign_Yes = (String) row.get("HOLEIN_CHK_Sign_Yes");
			String strHOLEIN_CHK_Sign_No = (String) row.get("HOLEIN_CHK_Sign_No");
			String strHOLEIN_TXT_Hole_Sponsor_Name = (String) row.get("HOLEIN_TXT_Hole_Sponsor_Name");
			String strHOLEIN_CHK_Prize_Cash = (String) row.get("HOLEIN_CHK_Prize_Cash");
			String strHOLEIN_CHK_Prize_Other = (String) row.get("HOLEIN_CHK_Prize_Other");
			String strHOLEIN_TXT_CashAmount = (String) row.get("HOLEIN_TXT_CashAmount");
			String strHOLEIN_TXT_PrizeDescription = (String) row.get("HOLEIN_TXT_PrizeDescription");
			String strHOLEIN_DD_MailSign = (String) row.get("HOLEIN_DD_MailSign");
			String strHOLEIN_TXT_Name = (String) row.get("HOLEIN_TXT_Name");
			String strHOLEIN_TXT_MailingAdd1 = (String) row.get("HOLEIN_TXT_MailingAdd1");
			String strHOLEIN_TXT_MailingAdd2 = (String) row.get("HOLEIN_TXT_MailingAdd2");
			String strHOLEIN_TXT_City = (String) row.get("HOLEIN_TXT_City");
			String strHOLEIN_DD_State = (String) row.get("HOLEIN_DD_State");
			String strHOLEIN_TXT_Zipcode = (String) row.get("HOLEIN_TXT_Zipcode");
			String strHOLEIN_BTN_Edit = (String) row.get("HOLEIN_BTN_Edit");
			String strHOLEIN_BTN_Edit_Loc = (String) row.get("HOLEIN_BTN_Edit_Loc");
			String strHOLEIN_BTN_ADD = (String) row.get("HOLEIN_BTN_ADD");
			try {
				se.log().logTestStep("SE_HoleInOnePrizes");
				test.log(LogStatus.INFO, "SE_HoleInOnePrizes","Transaction Step : "+transaction + "<br>" +"Page : SE_HoleInOnePrizes");
				se.verify().verifyEquals("SE_HoleInOnePrizes  of AgencyPortal ", getHOLEINONEPRIZES_label().isDisplayed(),true, true,test);
				if(strHOLEIN_BTN_Edit.contains("Edit"))
				{
					se.element().Click(getLocations_BTN_Edit(strHOLEIN_BTN_Edit_Loc), test);
				}
				if(iteration>=1&&strHOLEIN_BTN_ADD.contains("Add"))
				{
					se.element().Click(getLocations_BTN_AddNew(strHOLEIN_BTN_ADD), test);
				}
				se.element().enterOrValidateText(getHOLEIN_TXT_Prize_Hole_Number(strHOLEIN_TXT_Prize_Hole_Number),strHOLEIN_TXT_Prize_Hole_Number,test);
				se.element().enterOrValidateText(getHOLEIN_TXT_Prize_Hole_Value(strHOLEIN_TXT_Prize_Hole_Value),strHOLEIN_TXT_Prize_Hole_Value,test);
				se.element().enterOrValidateText(getHOLEIN_TXT_Prize_Hole_Yardage(strHOLEIN_TXT_Prize_Hole_Yardage),strHOLEIN_TXT_Prize_Hole_Yardage,test);
				se.element().checkUncheckOrValidate(getHOLEIN_CHK_Reinstatement_Yes(strHOLEIN_CHK_Reinstatement_Yes),strHOLEIN_CHK_Reinstatement_Yes,test);
				se.element().checkUncheckOrValidate(getHOLEIN_CHK_Reinstatement_No(strHOLEIN_CHK_Reinstatement_No),strHOLEIN_CHK_Reinstatement_No,test);
				se.element().checkUncheckOrValidate(getHOLEIN_CHK_Sign_Yes(strHOLEIN_CHK_Sign_Yes),strHOLEIN_CHK_Sign_Yes,test);
				se.element().checkUncheckOrValidate(getHOLEIN_CHK_Sign_No(strHOLEIN_CHK_Sign_No),strHOLEIN_CHK_Sign_No,test);
				se.element().enterOrValidateText(getHOLEIN_TXT_Hole_Sponsor_Name(strHOLEIN_TXT_Hole_Sponsor_Name),strHOLEIN_TXT_Hole_Sponsor_Name,test);
				se.element().checkUncheckOrValidate(getHOLEIN_CHK_Prize_Cash(strHOLEIN_CHK_Prize_Cash),strHOLEIN_CHK_Prize_Cash,test);
				se.element().checkUncheckOrValidate(getHOLEIN_CHK_Prize_Other(strHOLEIN_CHK_Prize_Other),strHOLEIN_CHK_Prize_Other,test);
				se.element().enterOrValidateText(getHOLEIN_TXT_CashAmount(strHOLEIN_TXT_CashAmount),strHOLEIN_TXT_CashAmount,test);
				se.element().enterOrValidateText(getHOLEIN_TXT_PrizeDescription(strHOLEIN_TXT_PrizeDescription),strHOLEIN_TXT_PrizeDescription,test);
				se.element().SelectElement(HOLEIN_DD_MailSign,strHOLEIN_DD_MailSign,test);
				se.element().enterOrValidateText(getHOLEIN_TXT_Name(strHOLEIN_TXT_Name),strHOLEIN_TXT_Name,test);
				se.element().enterOrValidateText(getHOLEIN_TXT_MailingAdd1(strHOLEIN_TXT_MailingAdd1),strHOLEIN_TXT_MailingAdd1,test);
				se.element().enterOrValidateText(getHOLEIN_TXT_MailingAdd2(strHOLEIN_TXT_MailingAdd2),strHOLEIN_TXT_MailingAdd2,test);
				se.element().enterOrValidateText(getHOLEIN_TXT_City(strHOLEIN_TXT_City),strHOLEIN_TXT_City,test);
				se.element().SelectElement(HOLEIN_DD_State,strHOLEIN_DD_State,test);
				se.element().enterOrValidateText(getHOLEIN_TXT_Zipcode(strHOLEIN_TXT_Zipcode),strHOLEIN_TXT_Zipcode,test);
				if(strHOLEIN_BTN_Edit.contains("Edit"))
				{
					se.element().Click(getLocations_BTN_Save(), test);
				}
				if(iteration>=0||strHOLEIN_BTN_ADD.contains("Add"))
				{
					se.element().Click(getAdd_Button(), test);
				}
			}
			catch(Exception e){
				se.verify().verifyEquals("Failed to fill in details for CP_HoleInOnePrizes_Details ", true, false, true, test);
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

