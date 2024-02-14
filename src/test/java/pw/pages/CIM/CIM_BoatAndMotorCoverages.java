package pw.pages.CIM;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CIM;

public class CIM_BoatAndMotorCoverages extends OR_CIM{
	
	public void BoatAndMotorCoverages(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_BoatAndMotorCov")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_BoatAndMotorCov", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCIM_BoatAndMotor_BTN_ADD = (String) row.get("CIM_BoatAndMotor_BTN_ADD");
		String strCIM_BoatAndMotor_BTN_Details = (String) row.get("CIM_BoatAndMotor_BTN_Details");
		String strCIM_BoatAndMotor_BTN_Done = (String) row.get("CIM_BoatAndMotor_BTN_Done");
		String strCIM_BoatAndMotor_TXT_ItemNo = (String) row.get("CIM_BoatAndMotor_TXT_ItemNo");
		String strCIM_BoatAndMotor_TXT_LocationNo = (String) row.get("CIM_BoatAndMotor_TXT_LocationNo");
		String strCIM_BoatAndMotor_TXT_Name = (String) row.get("CIM_BoatAndMotor_TXT_Name");
		String strCIM_BoatAndMotor_TXT_Description = (String) row.get("CIM_BoatAndMotor_TXT_Description");
		String strCIM_BoatAndMotor_TXT_Street = (String) row.get("CIM_BoatAndMotor_TXT_Street");
		String strCIM_BoatAndMotor_TXT_SteUnit = (String) row.get("CIM_BoatAndMotor_TXT_Ste/Unit");
		String strCIM_BoatAndMotor_TXT_City = (String) row.get("CIM_BoatAndMotor_TXT_City");
		String strCIM_BoatAndMotor_TXT_StateDescription = (String) row.get("CIM_BoatAndMotor_TXT_StateDescription");
		String strCIM_BoatAndMotor_TXT_ZipCode = (String) row.get("CIM_BoatAndMotor_TXT_ZipCode");
		String strCIM_BoatAndMotor_TXT_DescriptionOfEquipment = (String) row.get("CIM_BoatAndMotor_TXT_DescriptionOfEquipment");
		String strCIM_BoatAndMotor_TXT_EquipmentLimit = (String) row.get("CIM_BoatAndMotor_TXT_EquipmentLimit");
		String strCIM_BoatAndMotor_CHK_OverrideBaseRate_Yes = (String) row.get("CIM_BoatAndMotor_CHK_OverrideBaseRate_Yes");
		String strCIM_BoatAndMotor_CHK_OverrideBaseRate_No = (String) row.get("CIM_BoatAndMotor_CHK_OverrideBaseRate_No");
		String strCIM_BoatAndMotor_TXT_OverrideReason = (String) row.get("CIM_BoatAndMotor_TXT_OverrideReason");
		String strCIM_BoatAndMotor_TXT_OverrideReasonFilterNeeded = (String) row.get("CIM_BoatAndMotor_TXT_OverrideReasonFilterNeeded");
		
		String strCIM_BoatAndMotor_TXT_BaseRate = (String) row.get("CIM_BoatAndMotor_TXT_BaseRate");
		String strCIM_BoatAndMotor_TXT_BaseRateOverride = (String) row.get("CIM_BoatAndMotor_TXT_BaseRateOverride");
		String strCIM_BoatAndMotor_TXT_DeductibleFactor = (String) row.get("CIM_BoatAndMotor_TXT_DeductibleFactor");
		String strCIM_BoatAndMotor_TXT_TransitionAdjustmentFactor = (String) row.get("CIM_BoatAndMotor_TXT_TransitionAdjustmentFactor");
		String strCIM_BoatAndMotor_TXT_FinalRate = (String) row.get("CIM_BoatAndMotor_TXT_FinalRate");
		String strCIM_BoatAndMotor_TXT_OverrideFinalRate = (String) row.get("CIM_BoatAndMotor_TXT_OverrideFinalRate");
		String strCIM_BoatAndMotor_TXT_BoatANdMotorCoverageRatingDetailsEquipmentLimit = (String) row.get("CIM_BoatAndMotor_TXT_BoatANdMotorCoverageRatingDetailsEquipmentLimit");
		String strCIM_BoatAndMotor_TXT_Premium = (String) row.get("CIM_BoatAndMotor_TXT_Premium");
		String strCIM_BoatAndMotor_TXT_OverridePremium = (String) row.get("CIM_BoatAndMotor_TXT_OverridePremium");
		
		String strCIM_BoatAndMotor_BTN_Remove = (String) row.get("CIM_BoatAndMotor_BTN_Remove");
		String strCIM_BoatAndMotor_CHK_RemoveItemNo = (String) row.get("CIM_BoatAndMotor_CHK_RemoveItemNo");
		
		try{
			se.log().logTestStep("BoatAndMotorCoverages");
			test.log(LogStatus.INFO, "BoatAndMotorCoverages page","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMBoatAndMotorCoverages");
			se.verify().verifyEquals("BoatAndMotorCoverages page of PowerWriter ", getCIM_BoatAndMotor_TXT_VerifyBoatAndMotorCoverageText().isDisplayed(),true, true,test);
			
		
			if((strCIM_BoatAndMotor_BTN_ADD.equalsIgnoreCase("Yes"))){
				se.element().Click(getCIM_BoatAndMotor_BTN_ADD(strCIM_BoatAndMotor_BTN_ADD),test);
				}
				if((strCIM_BoatAndMotor_BTN_Details.equalsIgnoreCase("Yes"))){
				se.element().tryClick(getCIM_BoatAndMotor_BTN_Details(strCIM_BoatAndMotor_BTN_Details),test);
				}
				
				if(strCIM_BoatAndMotor_BTN_Remove.equalsIgnoreCase("Yes")){
					se.element().checkUncheckOrValidate(getCIM_BoatAndMotor_selectItemNo(strCIM_BoatAndMotor_CHK_RemoveItemNo),"Check",test);
					se.element().Click(getCIM_BoatAndMotor_removeLocation(), test);}
				
			se.element().enterOrValidateText(getCIM_BoatAndMotor_TXT_ItemNo(strCIM_BoatAndMotor_TXT_ItemNo),strCIM_BoatAndMotor_TXT_ItemNo,test);
			se.element().enterOrValidateText(getCIM_BoatAndMotor_TXT_LocationNo(strCIM_BoatAndMotor_TXT_LocationNo),strCIM_BoatAndMotor_TXT_LocationNo,test);
			se.element().enterOrValidateText(getCIM_BoatAndMotor_TXT_Name(strCIM_BoatAndMotor_TXT_Name),strCIM_BoatAndMotor_TXT_Name,test);
			se.element().enterOrValidateText(getCIM_BoatAndMotor_TXT_Description(strCIM_BoatAndMotor_TXT_Description),strCIM_BoatAndMotor_TXT_Description,test);
			se.element().enterOrValidateText(getCIM_BoatAndMotor_TXT_Street(strCIM_BoatAndMotor_TXT_Street),strCIM_BoatAndMotor_TXT_Street,test);
			se.element().enterOrValidateText(getCIM_BoatAndMotor_TXT_SteUnit(strCIM_BoatAndMotor_TXT_SteUnit),strCIM_BoatAndMotor_TXT_SteUnit,test);
			se.element().enterOrValidateText(getCIM_BoatAndMotor_TXT_City(strCIM_BoatAndMotor_TXT_City),strCIM_BoatAndMotor_TXT_City,test);
			se.element().enterOrValidateText(getCIM_BoatAndMotor_TXT_StateDescription(strCIM_BoatAndMotor_TXT_StateDescription),strCIM_BoatAndMotor_TXT_StateDescription,test);
			se.element().enterOrValidateText(getCIM_BoatAndMotor_TXT_ZipCode(strCIM_BoatAndMotor_TXT_ZipCode),strCIM_BoatAndMotor_TXT_ZipCode,test);
			se.element().enterOrValidateText(getCIM_BoatAndMotor_TXT_DescriptionOfEquipment(strCIM_BoatAndMotor_TXT_DescriptionOfEquipment),strCIM_BoatAndMotor_TXT_DescriptionOfEquipment,test);
			se.element().enterOrValidateText(getCIM_BoatAndMotor_TXT_EquipmentLimit(strCIM_BoatAndMotor_TXT_EquipmentLimit),strCIM_BoatAndMotor_TXT_EquipmentLimit,test);
			se.element().checkUncheckOrValidate(getCIM_BoatAndMotor_CHK_OverrideBaseRate_Yes(strCIM_BoatAndMotor_CHK_OverrideBaseRate_Yes),strCIM_BoatAndMotor_CHK_OverrideBaseRate_Yes,test);
			se.element().checkUncheckOrValidate(getCIM_BoatAndMotor_CHK_OverrideBaseRate_No(strCIM_BoatAndMotor_CHK_OverrideBaseRate_No),strCIM_BoatAndMotor_CHK_OverrideBaseRate_No,test);
			se.element().selectPopupWithMagnifier(getCIM_BoatAndMotor_TXT_OverrideReason(strCIM_BoatAndMotor_TXT_OverrideReason), getCIM_BoatAndMotor_BTN_OverrideReasonSearch(strCIM_BoatAndMotor_TXT_OverrideReason), strCIM_BoatAndMotor_TXT_OverrideReason,strCIM_BoatAndMotor_TXT_OverrideReasonFilterNeeded, strCIM_BoatAndMotor_TXT_OverrideReason,constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCIM_BoatAndMotor_TXT_BaseRate(strCIM_BoatAndMotor_TXT_BaseRate),strCIM_BoatAndMotor_TXT_BaseRate,test);
			se.element().enterOrValidateText(getCIM_BoatAndMotor_TXT_BaseRateOverride(strCIM_BoatAndMotor_TXT_BaseRateOverride),strCIM_BoatAndMotor_TXT_BaseRateOverride,test);
			se.element().enterOrValidateText(getCIM_BoatAndMotor_TXT_DeductibleFactor(strCIM_BoatAndMotor_TXT_DeductibleFactor),strCIM_BoatAndMotor_TXT_DeductibleFactor,test);
			se.element().enterOrValidateText(getCIM_BoatAndMotor_TXT_TransitionAdjustmentFactor(strCIM_BoatAndMotor_TXT_TransitionAdjustmentFactor),strCIM_BoatAndMotor_TXT_TransitionAdjustmentFactor,test);
			se.element().enterOrValidateText(getCIM_BoatAndMotor_TXT_FinalRate(strCIM_BoatAndMotor_TXT_FinalRate),strCIM_BoatAndMotor_TXT_FinalRate,test);
			se.element().enterOrValidateText(getCIM_BoatAndMotor_TXT_OverrideFinalRate(strCIM_BoatAndMotor_TXT_OverrideFinalRate),strCIM_BoatAndMotor_TXT_OverrideFinalRate,test);
			se.element().enterOrValidateText(getCIM_BoatAndMotor_TXT_BoatANdMotorCoverageRatingDetailsEquipmentLimit(strCIM_BoatAndMotor_TXT_BoatANdMotorCoverageRatingDetailsEquipmentLimit),strCIM_BoatAndMotor_TXT_BoatANdMotorCoverageRatingDetailsEquipmentLimit,test);
			se.element().enterOrValidateText(getCIM_BoatAndMotor_TXT_Premium(strCIM_BoatAndMotor_TXT_Premium),strCIM_BoatAndMotor_TXT_Premium,test);
			se.element().enterOrValidateText(getCIM_BoatAndMotor_TXT_OverridePremium(strCIM_BoatAndMotor_TXT_OverridePremium),strCIM_BoatAndMotor_TXT_OverridePremium,test);
			
			se.element().Click(getNext(),test);
			
			if((strCIM_BoatAndMotor_BTN_Done.equalsIgnoreCase("Yes"))){
				
				se.element().Click(getDone(),test);
			}
}
		catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for BoatAndMotorCoverages ", true, false, true, test);
		}
		iteration++;
	}

}
		catch (Exception e) {
			// TODO: handle exception
			se.log().logTestStep(
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			test.log(LogStatus.FAIL, "Faied",
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			testTearDown(se, test);
		}

}
}
