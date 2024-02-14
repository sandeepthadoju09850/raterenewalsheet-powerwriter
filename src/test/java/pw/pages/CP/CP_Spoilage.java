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

public class CP_Spoilage extends OR_CP{
	
	public void Spoilage(String strRegressionID, String transaction, String buildingName,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CP_Spoilage")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getBuildingPagesData("CP_Spoilage", strRegressionID, buildingName,transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strCP_Spoilage_BTN_Details = (String) row.get("CP_Spoilage_BTN_Details");
			String strCP_Spoilage_BTN_Done = (String) row.get("CP_Spoilage_BTN_Done");
			
		String strCP_Spoilage_TXT_ClassCode = (String) row.get("CP_Spoilage_TXT_ClassCode");
		String strCP_Spoilage_TXT_ClassDescription = (String) row.get("CP_Spoilage_TXT_ClassDescription");
		String strCP_Spoilage_TXT_PolicyType = (String) row.get("CP_Spoilage_TXT_PolicyType");
		String strCP_Spoilage_TXT_Coverage = (String) row.get("CP_Spoilage_TXT_Coverage");
		String strCP_Spoilage_TXT_FormNumber = (String) row.get("CP_Spoilage_TXT_FormNumber");
		String strCP_Spoilage_TXT_AmountOfInsurance = (String) row.get("CP_Spoilage_TXT_AmountOfInsurance");
		String strCP_Spoilage_TXT_CauseOfLoss = (String) row.get("CP_Spoilage_TXT_CauseOfLoss");
		String strCP_Spoilage_TXT_PropertyType = (String) row.get("CP_Spoilage_TXT_PropertyType");
		String strCP_Spoilage_CHK_RefrigeratorMaintenanceAgreement = (String) row.get("CP_Spoilage_CHK_RefrigeratorMaintenanceAgreement");
		String strCP_Spoilage_CHK_SellingPrice = (String) row.get("CP_Spoilage_CHK_SellingPrice");
		String strCP_Spoilage_TXT_Deductible = (String) row.get("CP_Spoilage_TXT_Deductible");
		String strCP_Spoilage_TXT_DescriptionOfProperty = (String) row.get("CP_Spoilage_TXT_DescriptionOfProperty");
		
		
		try{
				se.log().logTestStep("Spoilage");
				test.log(LogStatus.INFO, "Spoilage page","Transaction Step : "+transaction + "<br>" +"Page : CP_Spoilage");
				//se.verify().verifyEquals("Spoilage Page of PowerWriter ", getCP_Spoilage_TXT_SpoilageText().isDisplayed(),true, true,test);
				if(!strCP_Spoilage_BTN_Details.equalsIgnoreCase("N/A")){
					se.element().Click(getCP_Spoilage_BTN_Details(strCP_Spoilage_BTN_Details),test);
					}
				se.element().enterOrValidateText(getCP_Spoilage_TXT_ClassCode(strCP_Spoilage_TXT_ClassCode),strCP_Spoilage_TXT_ClassCode,test);
				se.element().enterOrValidateText(getCP_Spoilage_TXT_ClassDescription(strCP_Spoilage_TXT_ClassDescription),strCP_Spoilage_TXT_ClassDescription,test);
				se.element().enterOrValidateText(getCP_Spoilage_TXT_PolicyType(strCP_Spoilage_TXT_PolicyType),strCP_Spoilage_TXT_PolicyType,test);
				se.element().enterOrValidateText(getCP_Spoilage_TXT_Coverage(strCP_Spoilage_TXT_Coverage),strCP_Spoilage_TXT_Coverage,test);
				se.element().enterOrValidateText(getCP_Spoilage_TXT_FormNumber(strCP_Spoilage_TXT_FormNumber),strCP_Spoilage_TXT_FormNumber,test);
				se.element().enterOrValidateText(getCP_Spoilage_TXT_AmountOfInsurance(strCP_Spoilage_TXT_AmountOfInsurance),strCP_Spoilage_TXT_AmountOfInsurance,test);
				
				/*if(!strCP_Spoilage_TXT_CauseOfLoss.equalsIgnoreCase("N/A") && !strCP_Spoilage_TXT_CauseOfLoss.contains("validate2")) {
					se.element().clickSearchIcon(getCP_Spoilage_BTN_CauseOfLossSearch(), test);
					se.element().clickelement(getCP_Spoilage_LNK_CauseOfLossOption(strCP_Spoilage_TXT_CauseOfLoss),strCP_Spoilage_TXT_CauseOfLoss,test);
				}else {
					se.element().enterOrValidateText(getCP_Spoilage_TXT_CauseOfLoss(strCP_Spoilage_TXT_CauseOfLoss),strCP_Spoilage_TXT_CauseOfLoss,test);
				}*/
				se.element().selectPopupWithMagnifier(getCP_Spoilage_TXT_CauseOfLoss(strCP_Spoilage_TXT_CauseOfLoss), getCP_Spoilage_BTN_CauseOfLossSearch(strCP_Spoilage_TXT_CauseOfLoss), strCP_Spoilage_TXT_CauseOfLoss, constants.NA, strCP_Spoilage_TXT_CauseOfLoss, constants.NA, constants.NA, constants.NA, test);
				
				//se.element().enterOrValidateText(getCP_Spoilage_TXT_PropertyType(strCP_Spoilage_TXT_PropertyType),strCP_Spoilage_TXT_PropertyType,test);
				se.element().selectPopupWithMagnifier(getCP_Spoilage_TXT_PropertyType(strCP_Spoilage_TXT_PropertyType), getCP_Spoilage_TXT_PropertyTypeSearch(strCP_Spoilage_TXT_PropertyType), strCP_Spoilage_TXT_PropertyType, constants.NA, strCP_Spoilage_TXT_PropertyType, constants.NA, constants.NA, constants.NA, test);
				se.element().checkUncheckOrValidate(getCP_Spoilage_CHK_RefrigeratorMaintenanceAgreement(strCP_Spoilage_CHK_RefrigeratorMaintenanceAgreement),strCP_Spoilage_CHK_RefrigeratorMaintenanceAgreement,test);
				se.element().checkUncheckOrValidate(getCP_Spoilage_CHK_SellingPrice(strCP_Spoilage_CHK_SellingPrice),strCP_Spoilage_CHK_SellingPrice,test);
				se.element().enterOrValidateText(getCP_Spoilage_TXT_Deductible(strCP_Spoilage_TXT_Deductible),strCP_Spoilage_TXT_Deductible,test);
				se.element().enterOrValidateText(getCP_Spoilage_TXT_DescriptionOfProperty(strCP_Spoilage_TXT_DescriptionOfProperty),strCP_Spoilage_TXT_DescriptionOfProperty,test);

				se.element().Click(getNext(),test);
				if(strCP_Spoilage_BTN_Done.equalsIgnoreCase("Yes")){
					se.element().Click(getDone(),test);
					}
			
	}catch(Exception e){
		se.verify().verifyEquals("Failed to fill in details for CP_Spoilage", true, false, true, test);
		
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
