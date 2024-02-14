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

public class CP_AdditionalProperty extends OR_CP{
	
	public void AdditionalProperty(String strRegressionID, String transaction, String buildingName,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CP_AdditionalProperty")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getBuildingPagesData("CP_AdditionalProperty", strRegressionID, buildingName,transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCP_AdditionalProperty_BTN_Details = (String) row.get("CP_AdditionalProperty_BTN_Details");
		String strCP_AdditionalProperty_TXT_AdditionalProperty = (String) row.get("CP_AdditionalProperty_TXT_AdditionalProperty");
		String strCP_AdditionalProperty_TXT_Coverage = (String) row.get("CP_AdditionalProperty_TXT_Coverage");
		String strCP_AdditionalProperty_TXT_FormNumber = (String) row.get("CP_AdditionalProperty_TXT_FormNumber");
		String strCP_AdditionalProperty_TXT_ClassCode = (String) row.get("CP_AdditionalProperty_TXT_ClassCode");
		String strCP_AdditionalProperty_TXT_AmountOfInsurance = (String) row.get("CP_AdditionalProperty_TXT_AmountOfInsurance");
		String strCP_AdditionalProperty_TXT_Coinsurance = (String) row.get("CP_AdditionalProperty_TXT_Coinsurance");
		String strCP_AdditionalProperty_TXT_CauseOfLoss = (String) row.get("CP_AdditionalProperty_TXT_CauseOfLoss");
		String strCP_AdditionalProperty_TXT_MachineryAndEquipmentDescription = (String) row.get("CP_AdditionalProperty_TXT_MachineryAndEquipmentDescription");
		String strCP_AdditionalProperty_TXT_DescriptionOfProperty = (String) row.get("CP_AdditionalProperty_TXT_DescriptionOfProperty");
		String strCP_AdditionalProperty_TXT_AgreedValueAmount = (String) row.get("CP_AdditionalProperty_TXT_AgreedValueAmount");
		String strCP_AdditionalProperty_BTN_ADD = (String) row.get("CP_AdditionalProperty_BTN_ADD");
		String strCP_AdditionalProperty_TXT_ClassDescription = (String) row.get("CP_AdditionalProperty_TXT_ClassDescription");
		String strCP_AdditionalProperty_TXT_ParagraphReference = (String) row.get("CP_AdditionalProperty_TXT_ParagraphReference");
		String strCP_AdditionalProperty_TXT_AdditionalCoveredPropertyDescriptionOfProperty = (String) row.get("CP_AdditionalProperty_TXT_AdditionalCoveredPropertyDescriptionOfProperty");
		String strCP_AdditionalProperty_TXT_AdditionalPropertyNotCoveredDescriptionOfProperty = (String) row.get("CP_AdditionalProperty_TXT_AdditionalPropertyNotCoveredDescriptionOfProperty");
		String strCP_AdditionalProperty_TXT_LeasedPropertyDescriptionOfProperty = (String) row.get("CP_AdditionalProperty_TXT_LeasedPropertyDescriptionOfProperty");
		String strCP_AdditionalProperty_TXT_LeasedPropertyAgreedValueAmount = (String) row.get("CP_AdditionalProperty_TXT_LeasedPropertyAgreedValueAmount");
		String strCP_AdditionalProperty_BTN_Done  = (String) row.get("CP_AdditionalProperty_BTN_Done");
		String strCP_AdditionalProperty_TXT_EachTreeLimit  = (String) row.get("CP_AdditionalProperty_TXT_EachTreeLimit");
		String strCP_AdditionalProperty_TXT_EachShrubLimit  = (String) row.get("CP_AdditionalProperty_TXT_EachShrubLimit");
		String strCP_AdditionalProperty_TXT_EachPlantLimit  = (String) row.get("CP_AdditionalProperty_TXT_EachPlantLimit");
		String strCP_AdditionalProperty_CHK_VehicleExclusion  = (String) row.get("CP_AdditionalProperty_CHK_VehicleExclusion");
		
		try{
				se.log().logTestStep("CP_AdditionalProperty");
				test.log(LogStatus.INFO, "CP_AdditionalProperty page","Transaction Step : "+transaction + "<br>" +"Page : CP_AdditionalProperty");
				se.verify().verifyEquals("AdditionalProperty Page of PowerWriter ", getCP_AdditionalProperty_TXT_VerifyAdditionalPropertyText().isDisplayed(),true, true,test);
				
				if(!strCP_AdditionalProperty_BTN_Details.equalsIgnoreCase("N/A")){
					se.element().Click(getCP_AdditionalProperty_BTN_EditDetails(strCP_AdditionalProperty_BTN_Details),test);
				}
				
				se.element().enterOrValidateText(getCP_AdditionalProperty_TXT_AdditionalProperty(strCP_AdditionalProperty_TXT_AdditionalProperty),strCP_AdditionalProperty_TXT_AdditionalProperty,test);
				se.element().enterOrValidateText(getCP_AdditionalProperty_TXT_Coverage(strCP_AdditionalProperty_TXT_Coverage),strCP_AdditionalProperty_TXT_Coverage,test);
				se.element().enterOrValidateText(getCP_AdditionalProperty_TXT_FormNumber(strCP_AdditionalProperty_TXT_FormNumber),strCP_AdditionalProperty_TXT_FormNumber,test);
				se.element().enterOrValidateText(getCP_AdditionalProperty_TXT_ClassCode(strCP_AdditionalProperty_TXT_ClassCode),strCP_AdditionalProperty_TXT_ClassCode,test);
				se.element().enterOrValidateText(getCP_AdditionalProperty_TXT_ClassDescription(strCP_AdditionalProperty_TXT_ClassDescription),strCP_AdditionalProperty_TXT_ClassDescription,test);
				
				se.element().enterOrValidateText(getCP_AdditionalProperty_TXT_AmountOfInsurance(strCP_AdditionalProperty_TXT_AmountOfInsurance),strCP_AdditionalProperty_TXT_AmountOfInsurance,test);
				se.element().selectPopupWithMagnifier(getCP_AdditionalProperty_TXT_Coinsurance(strCP_AdditionalProperty_TXT_Coinsurance), getCP_AdditionalProperty_TXT_CoinsuranceSearchIcon(strCP_AdditionalProperty_TXT_Coinsurance), strCP_AdditionalProperty_TXT_Coinsurance, constants.NA, strCP_AdditionalProperty_TXT_Coinsurance, constants.NA, constants.NA, constants.NA, test);
				se.element().selectPopupWithMagnifier(getCP_AdditionalProperty_TXT_CauseOfLoss(strCP_AdditionalProperty_TXT_CauseOfLoss), getCP_AdditionalProperty_TXT_CauseOfLossSearchIcon(strCP_AdditionalProperty_TXT_CauseOfLoss), strCP_AdditionalProperty_TXT_CauseOfLoss, constants.NA, strCP_AdditionalProperty_TXT_CauseOfLoss, constants.NA, constants.NA, constants.NA, test);
				
				se.element().enterOrValidateText(getCP_AdditionalProperty_TXT_MachineryAndEquipmentDescription(strCP_AdditionalProperty_TXT_MachineryAndEquipmentDescription),strCP_AdditionalProperty_TXT_MachineryAndEquipmentDescription,test);
				se.element().enterOrValidateText(getCP_AdditionalProperty_TXT_DescriptionOfProperty(strCP_AdditionalProperty_TXT_DescriptionOfProperty),strCP_AdditionalProperty_TXT_DescriptionOfProperty,test);
				
				se.element().enterOrValidateText(getCP_AdditionalProperty_TXT_AgreedValueAmount(strCP_AdditionalProperty_TXT_AgreedValueAmount),strCP_AdditionalProperty_TXT_AgreedValueAmount,test);
				
				if((strCP_AdditionalProperty_BTN_ADD.equalsIgnoreCase("Yes"))){
					se.element().Click(getCP_AdditionalProperty_BTN_ADD(strCP_AdditionalProperty_BTN_ADD),test);
					}
				
				se.element().selectPopupWithMagnifier(getCP_AdditionalProperty_TXT_ParagraphReference(strCP_AdditionalProperty_TXT_ParagraphReference), getCP_AdditionalProperty_BTN_ParagraphReferenceSearch(strCP_AdditionalProperty_TXT_ParagraphReference), strCP_AdditionalProperty_TXT_ParagraphReference, constants.NA, strCP_AdditionalProperty_TXT_ParagraphReference, constants.NA, constants.NA, constants.NA, test);
				
				se.element().enterOrValidateText(getCP_AdditionalProperty_TXT_AdditionalCoveredPropertyDescriptionOfProperty(strCP_AdditionalProperty_TXT_AdditionalCoveredPropertyDescriptionOfProperty),strCP_AdditionalProperty_TXT_AdditionalCoveredPropertyDescriptionOfProperty,test);
				se.element().enterOrValidateText(getCP_AdditionalProperty_TXT_AdditionalPropertyNotCoveredDescriptionOfProperty(strCP_AdditionalProperty_TXT_AdditionalPropertyNotCoveredDescriptionOfProperty),strCP_AdditionalProperty_TXT_AdditionalPropertyNotCoveredDescriptionOfProperty,test);
				se.element().enterOrValidateText(getCP_AdditionalProperty_TXT_LeasedPropertyDescriptionOfProperty(strCP_AdditionalProperty_TXT_LeasedPropertyDescriptionOfProperty),strCP_AdditionalProperty_TXT_LeasedPropertyDescriptionOfProperty,test);
				se.element().enterOrValidateText(getCP_AdditionalProperty_TXT_LeasedPropertyAgreedValueAmount(strCP_AdditionalProperty_TXT_LeasedPropertyAgreedValueAmount),strCP_AdditionalProperty_TXT_LeasedPropertyAgreedValueAmount,test);
				se.element().enterOrValidateText(getCP_AdditionalProperty_TXT_EachTreeLimit(strCP_AdditionalProperty_TXT_EachTreeLimit),strCP_AdditionalProperty_TXT_EachTreeLimit,test);
				se.element().enterOrValidateText(getCP_AdditionalProperty_TXT_EachShrubLimit(strCP_AdditionalProperty_TXT_EachShrubLimit),strCP_AdditionalProperty_TXT_EachShrubLimit,test);
				se.element().enterOrValidateText(getCP_AdditionalProperty_TXT_EachPlantLimit(strCP_AdditionalProperty_TXT_EachPlantLimit),strCP_AdditionalProperty_TXT_EachPlantLimit,test);
				se.element().checkUncheckOrValidate(getCP_AdditionalProperty_CHK_VehicleExclusion(strCP_AdditionalProperty_CHK_VehicleExclusion), strCP_AdditionalProperty_CHK_VehicleExclusion, test);
				
				
				se.element().Click(getNext(),test);
				if(strCP_AdditionalProperty_BTN_Done.equalsIgnoreCase("Yes")){
					se.element().Click(getDone(),test);
				}
			
	}catch(Exception e){
		se.verify().verifyEquals("Failed to fill in details for CP_AdditionalProperty", true, false, true, test);
		
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
