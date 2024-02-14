package pw.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CP;

public class CP_BlanketInsurance extends OR_CP{
	public void BlanketInsurance(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		List<Map<String, String>> table = ExcelOperations.getPagesData("CP_BlanketInsurance", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			
		String strCP_BlanketInsurance_BTN_Add = (String) row.get("CP_BlanketInsurance_BTN_Add");
		String strCP_BlanketInsurance_Edit = (String) row.get("CP_BlanketInsurance_Edit");
		String strCP_BlanketInsurance_Done = (String) row.get("CP_BlanketInsurance_Done");
		String strCP_BlanketInsurance_TXT_BlanketIDNumber = (String) row.get("CP_BlanketInsurance_TXT_BlanketIDNumber");
		String strCP_BlanketInsurance_TXT_BlanketType = (String) row.get("CP_BlanketInsurance_TXT_BlanketType");
		String strCP_BlanketInsurance_TXT_BlanketLimit = (String) row.get("CP_BlanketInsurance_TXT_BlanketLimit");
		String strCP_BlanketInsurance_TXT_CauseOfLoss = (String) row.get("CP_BlanketInsurance_TXT_CauseOfLoss");
		String strCP_BlanketInsurance_CHK_Perpropr_ValueReporting = (String) row.get("CP_BlanketInsurance_CHK_Perpropr_ValueReporting");
		String strCP_BlanketInsurance_TXT_Coinsurance = (String) row.get("CP_BlanketInsurance_TXT_Coinsurance");
		String strCP_BlanketInsurance_CHK_AgreedValue = (String) row.get("CP_BlanketInsurance_CHK_AgreedValue");
		String strCP_BlanketInsurance_CHK_IncludeEarthquakecauseofLoss = (String) row.get("CP_BlanketInsurance_CHK_IncludeEarthquakecauseofLoss");
		String strCP_BlanketInsurance_TXT_EQ_Coinsurance = (String) row.get("CP_BlanketInsurance_TXT_EQ_Coinsurance");
		String strCP_BlanketInsurance_TXT_BlanketRatingType = (String) row.get("CP_BlanketInsurance_TXT_BlanketRatingType");
		String strCP_BlanketInsurance_CHK_RecalculateBlanketRate = (String) row.get("CP_BlanketInsurance_CHK_RecalculateBlanketRate");
		String strCP_BlanketInsurance_TXT_BG1BlanketRate = (String) row.get("CP_BlanketInsurance_TXT_BG1BlanketRate");
		String strCP_BlanketInsurance_TXT_BG2BlanketRate = (String) row.get("CP_BlanketInsurance_TXT_BG2BlanketRate");
		String strCP_BlanketInsurance_TXT_BroadBlanketRate = (String) row.get("CP_BlanketInsurance_TXT_BroadBlanketRate");
		String strCP_BlanketInsurance_TXT_SpecialBlanketRate = (String) row.get("CP_BlanketInsurance_TXT_SpecialBlanketRate");
		String strCP_BlanketInsurance_TXT_EarthquakeBlanketRate = (String) row.get("CP_BlanketInsurance_TXT_EarthquakeBlanketRate");
		String strCP_BlanketInsurance_TXT_TotalBG1BasePremium = (String) row.get("CP_BlanketInsurance_TXT_TotalBG1BasePremium");
		String strCP_BlanketInsurance_TXT_TotalBG2BasePremium = (String) row.get("CP_BlanketInsurance_TXT_TotalBG2BasePremium");
		String strCP_BlanketInsurance_TXT_TotalSpecialBasePremium = (String) row.get("CP_BlanketInsurance_TXT_TotalSpecialBasePremium");
		String strCP_BlanketInsurance_TXT_TotalBuildingValue = (String) row.get("CP_BlanketInsurance_TXT_TotalBuildingValue");
		
		
		String strTransaction = (String) row.get("Transaction Name");
		
		try{
			se.log().logTestStep("CP_BlanketInsurance");
			test.log(LogStatus.INFO, "CP_BlanketInsurance page","Transaction Step : "+ strTransaction + "<br>" +"Page : CP_BlanketInsurance");
			se.verify().verifyEquals("Blanket Insurance Page of PowerWriter ", getCP_BlanketInsuranceTXT_VerifyBlanketInsuranceText().isDisplayed(),true, true,test);
			
			if(strCP_BlanketInsurance_BTN_Add.equalsIgnoreCase("Yes")){
				
				se.element().clickElement(ClickonAddBlanketInsurance,test);
			}
			
			if(strCP_BlanketInsurance_Edit.equalsIgnoreCase("Yes")){
				se.element().Click(getEditbuttonCPBlanketInsurance(strCP_BlanketInsurance_Edit),test);
			}
			
			se.element().enterOrValidateText(getCP_BlanketInsurance_TXT_BlanketIDNumber(strCP_BlanketInsurance_TXT_BlanketIDNumber) ,  strCP_BlanketInsurance_TXT_BlanketIDNumber, test);
			
			se.element().selectPopupWithMagnifier(getCP_BlanketInsurance_TXT_BlanketType(strCP_BlanketInsurance_TXT_BlanketType), getCP_BlanketInsurance_BTN_BlanketType_Search(strCP_BlanketInsurance_TXT_BlanketType), strCP_BlanketInsurance_TXT_BlanketType, constants.NA, strCP_BlanketInsurance_TXT_BlanketType, constants.NA, constants.NA, constants.NA, test);
			
			se.element().enterOrValidateText(getCP_BlanketInsurance_TXT_BlanketLimit(strCP_BlanketInsurance_TXT_BlanketLimit) ,  strCP_BlanketInsurance_TXT_BlanketLimit, test);
			
			se.element().selectPopupWithMagnifier(getCP_BlanketInsurance_TXT_CauseOfLoss(strCP_BlanketInsurance_TXT_CauseOfLoss), getCP_BlanketInsurance_BTN_CauseOfLoss_Search(strCP_BlanketInsurance_TXT_CauseOfLoss), strCP_BlanketInsurance_TXT_CauseOfLoss, constants.NA, strCP_BlanketInsurance_TXT_CauseOfLoss, constants.NA, constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(getCP_BlanketInsurance_CHK_Perpropr_ValueReporting(strCP_BlanketInsurance_CHK_Perpropr_ValueReporting), strCP_BlanketInsurance_CHK_Perpropr_ValueReporting, test);
			
			se.element().selectPopupWithMagnifier(getCP_BlanketInsurance_TXT_Coinsurance(strCP_BlanketInsurance_TXT_Coinsurance), getCP_BlanketInsurance_BTN_Coinsurance_Search(strCP_BlanketInsurance_TXT_Coinsurance), strCP_BlanketInsurance_TXT_Coinsurance, constants.NA, strCP_BlanketInsurance_TXT_Coinsurance, constants.NA, constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(getCP_BlanketInsurance_CHK_AgreedValue(strCP_BlanketInsurance_CHK_AgreedValue), strCP_BlanketInsurance_CHK_AgreedValue, test);
			se.element().checkUncheckOrValidate(getCP_BlanketInsurance_CHK_IncludeEarthquakecauseofLoss(strCP_BlanketInsurance_CHK_IncludeEarthquakecauseofLoss), strCP_BlanketInsurance_CHK_IncludeEarthquakecauseofLoss, test);
			se.element().selectPopupWithMagnifier(getCP_BlanketInsurance_TXT_EQ_Coinsurance(strCP_BlanketInsurance_TXT_EQ_Coinsurance), getCP_BlanketInsurance_TXT_EQ_Coinsurance_Search(strCP_BlanketInsurance_TXT_EQ_Coinsurance), strCP_BlanketInsurance_TXT_EQ_Coinsurance, constants.NA, strCP_BlanketInsurance_TXT_EQ_Coinsurance, constants.NA, constants.NA, constants.NA, test);
			
			se.element().selectPopupWithMagnifier(getCP_BlanketInsurance_TXT_BlanketRatingType(strCP_BlanketInsurance_TXT_BlanketRatingType), getCP_BlanketInsurance_BTN_BlanketRatingType_Search(strCP_BlanketInsurance_TXT_BlanketRatingType), strCP_BlanketInsurance_TXT_BlanketRatingType, constants.NA, strCP_BlanketInsurance_TXT_BlanketRatingType, constants.NA, constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(getCP_BlanketInsurance_CHK_RecalculateBlanketRate(strCP_BlanketInsurance_CHK_RecalculateBlanketRate), strCP_BlanketInsurance_CHK_RecalculateBlanketRate, test);
			se.element().enterOrValidateText(getCP_BlanketInsurance_TXT_TotalBuildingValue(strCP_BlanketInsurance_TXT_TotalBuildingValue) ,  strCP_BlanketInsurance_TXT_TotalBuildingValue, test);
			se.element().enterOrValidateText(getCP_BlanketInsurance_TXT_TotalBG1BasePremium(strCP_BlanketInsurance_TXT_TotalBG1BasePremium) ,  strCP_BlanketInsurance_TXT_TotalBG1BasePremium, test);
			se.element().enterOrValidateText(getCP_BlanketInsurance_TXT_TotalBG2BasePremium(strCP_BlanketInsurance_TXT_TotalBG2BasePremium) ,  strCP_BlanketInsurance_TXT_TotalBG2BasePremium, test);
			se.element().enterOrValidateText(getCP_BlanketInsurance_TXT_TotalSpecialBasePremium(strCP_BlanketInsurance_TXT_TotalSpecialBasePremium) ,  strCP_BlanketInsurance_TXT_TotalSpecialBasePremium, test);
			se.element().enterOrValidateText(getCP_BlanketInsurance_TXT_BG1BlanketRate(strCP_BlanketInsurance_TXT_BG1BlanketRate) ,  strCP_BlanketInsurance_TXT_BG1BlanketRate, test);
			
			se.element().enterOrValidateText(getCP_BlanketInsurance_TXT_BG2BlanketRate(strCP_BlanketInsurance_TXT_BG2BlanketRate) ,  strCP_BlanketInsurance_TXT_BG2BlanketRate, test);
			se.element().enterOrValidateText(getCP_BlanketInsurance_TXT_BroadBlanketRate(strCP_BlanketInsurance_TXT_BroadBlanketRate) ,  strCP_BlanketInsurance_TXT_BroadBlanketRate, test);
			se.element().enterOrValidateText(getCP_BlanketInsurance_TXT_SpecialBlanketRate(strCP_BlanketInsurance_TXT_SpecialBlanketRate) ,  strCP_BlanketInsurance_TXT_SpecialBlanketRate, test);
			se.element().enterOrValidateText(getCP_BlanketInsurance_TXT_EarthquakeBlanketRate(strCP_BlanketInsurance_TXT_EarthquakeBlanketRate) ,  strCP_BlanketInsurance_TXT_EarthquakeBlanketRate, test);
			se.element().Click(getNext(),test);
			se.util().sleep(1000);
			if(strCP_BlanketInsurance_Done.equalsIgnoreCase("Yes")){
				se.element().Click(getNext(),test);
			}
			
			
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CP_BlanketInsurance", true, false, true, test);
			
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
