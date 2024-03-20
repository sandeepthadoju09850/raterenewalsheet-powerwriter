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

public class CP_CarrierInformation  extends BL_OR_CP {

	public void CP_CarrierInformation_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.PriorCarrierInformation)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.PriorCarrierInformation, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strCarrierinfo_TXT_PriorCarrierName = (String) row.get("Carrierinfo_TXT_PriorCarrierName");
			String strCarrierinfo_TXT_PolicyNumber = (String) row.get("Carrierinfo_TXT_PolicyNumber");
			String strCarrierinfo_TXT_TotalPremium = (String) row.get("Carrierinfo_TXT_TotalPremium");
			String strCarrierinfo_TXT_EffectiveDate = (String) row.get("Carrierinfo_TXT_EffectiveDate");
			String strCarrierinfo_TXT_ExpirationDate = (String) row.get("Carrierinfo_TXT_ExpirationDate");
			String strCarrierinfo_BTN_Add = (String) row.get("Carrierinfo_BTN_Add");
			String strCarrierinfo_BTN_Delete = (String) row.get("Carrierinfo_BTN_Delete");
			String strCarrierinfo_BTN_Delete_Loc = (String) row.get("Carrierinfo_BTN_Delete_Loc");
			try
			{
				se.util().sleep(2000);
				se.log().logTestStep("CP_CarrierInformation_Details");
				test.log(LogStatus.INFO, "CP_CarrierInformation_Details","Transaction Step : "+transaction + "<br>" +"Page : CP_CarrierInformation_Details");
				se.verify().verifyEquals("CP_CarrierInformation_Details  of AgencyPortal ", getCarrierInformation_label().isDisplayed(),true, true,test);
				if(strCarrierinfo_BTN_Add.contains("Add"))
				{
					se.element().Click(getBuildingandOccupantSelection_BTN_AddNew(strCarrierinfo_BTN_Add), test);
					se.element().enterOrValidateText( getCarrierinfo_TXT_PriorCarrierName(strCarrierinfo_TXT_PriorCarrierName),strCarrierinfo_TXT_PriorCarrierName,test);
					se.element().enterOrValidateText( getCarrierinfo_TXT_PolicyNumber(strCarrierinfo_TXT_PolicyNumber),strCarrierinfo_TXT_PolicyNumber,test);
					se.element().enterOrValidateText( getCarrierinfo_TXT_TotalPremium(strCarrierinfo_TXT_TotalPremium),strCarrierinfo_TXT_TotalPremium,test);
					se.element().enterOrValidateText( getCarrierinfo_TXT_EffectiveDate(strCarrierinfo_TXT_EffectiveDate),strCarrierinfo_TXT_EffectiveDate,test);
					se.element().enterOrValidateText( getCarrierinfo_TXT_ExpirationDate(strCarrierinfo_TXT_ExpirationDate),strCarrierinfo_TXT_ExpirationDate,test);
					se.element().Click(getBuildingandOccupSelection_BTN_Add(), test);
				}
				else if(strCarrierinfo_BTN_Delete.contains("Delete"))
				{
					se.element().Click(getCarrierinfo_BTN_Delete(strCarrierinfo_BTN_Delete_Loc), test);
					//se.util().sleep(2000);
					se.element().Click(getLocations_BTN_Delete_Yes(), test);
				}
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for CP_CarrierInformation_Details ", true, false, true, test);
			}
			iteration++;
		}
		executor.executeScript("arguments[0].scrollIntoView(0,500);", getGI_CHK_Continue());
		se.element().Click(getGI_CHK_Continue(), test);
	}catch (Exception e) {
		
		se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
		test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
		testTearDown(se, test);
	}
	}
}
