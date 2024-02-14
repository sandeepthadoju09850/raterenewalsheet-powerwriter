package pw.pages.CIM;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import pw.Constants.constants;
import pw.OR.OR_CIM;

public class CIM_MiscellaneousCoverage extends OR_CIM {
	
	public void CP_CIMMiscellaneousCoverage(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_MiscellaneousCoverages")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_MiscellaneousCoverages", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCIMMiscellaneousCoverages_BTN_Done = (String) row.get("CIMMiscellaneousCoverages_BTN_Done");

		CIM_MiscellaneousCoverage CIM_MiscellaneousCoveragePage = TestPageFactory.initElements(se, CIM_MiscellaneousCoverage.class);

		
		try{
			test.log(LogStatus.INFO, "CIMMiscellaneousCoverages","Transaction Step : " + transaction + "<br>" + "Page : CIMMiscellaneousCoverages");
			se.verify().verifyEquals("CIMMiscellaneousCoverages Page of PowerWriter ", getCIMMiscellaneousCoverages_LBL_MiscellaneousCoverages("CIMMiscellaneousCoverages").isDisplayed(),true, true,test);
			CIM_MiscellaneousCoveragePage.CP_CIMMiscellaneousCoverageGenInfo(row,test);
			CIM_MiscellaneousCoveragePage.CP_CIMMiscellaneousCoverageTaxInfo(row,test);
				se.element().Click(getNext(),test);
					
					if((strCIMMiscellaneousCoverages_BTN_Done.equalsIgnoreCase("Yes"))){
						
						se.element().Click(getDone(),test);
					}
			
				
				
				}catch(Exception e){
				se.verify().verifyEquals("Failed to fill in details CIMMiscellaneousCoverage ", true, false, true, test);

			}
			iteration++;
		}

	}catch(

	Exception e)
	{
		// TODO: handle exception
		se.log().logTestStep(
				"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
		test.log(LogStatus.FAIL, "Failed",
				"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
		testTearDown(se, test);
	}

}

public void CP_CIMMiscellaneousCoverageGenInfo(Map<String, String> row, ExtentTest test) throws IOException {
	
	
		String strCIMMiscellaneousCoverages_BTN_ADD = (String) row.get("CIMMiscellaneousCoverages_BTN_ADD");
		String strCIMMiscellaneousCoverages_BTN_Details = (String) row.get("CIMMiscellaneousCoverages_BTN_Details");
		String strCIMMiscellaneousCoverages_TXT_CoverageDescription = (String) row.get("CIMMiscellaneousCoverages_TXT_CoverageDescription");
		String strCIMMiscellaneousCoverages_BTN_CoverageDescriptionSearchDisplay = (String) row.get("CIMMiscellaneousCoverages_BTN_CoverageDescriptionSearchDisplay");
		String strCIMMiscellaneousCoverages_TXT_FormNo = (String) row.get("CIMMiscellaneousCoverages_TXT_FormNo");
		String strCIMMiscellaneousCoverages_TXT_FormName = (String) row.get("CIMMiscellaneousCoverages_TXT_FormName");
		String strCIMMiscellaneousCoverages_TXT_State = (String) row.get("CIMMiscellaneousCoverages_TXT_State");
		String strCIMMiscellaneousCoverages_TXT_NISSCode = (String) row.get("CIMMiscellaneousCoverages_TXT_NISSCode");
		String strCIMMiscellaneousCoverages_TXT_AAISCode = (String) row.get("CIMMiscellaneousCoverages_TXT_AAISCode");
		String strCIMMiscellaneousCoverages_TXT_AnnualPremium = (String) row.get("CIMMiscellaneousCoverages_TXT_AnnualPremium");
		String strCIMMiscellaneousCoverages_CHK_PremiumChargeTypeProRata = (String) row.get("CIMMiscellaneousCoverages_CHK_PremiumChargeTypeProRata");
		String strCIMMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge = (String) row.get("CIMMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge");
		String strCIMMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned = (String) row.get("CIMMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned");
		String strCIMMiscellaneousCoverages_TXT_Description = (String) row.get("CIMMiscellaneousCoverages_TXT_Description");
		String strCIMMiscellaneousCoverages_TXT_LocationNo = (String) row.get("CIMMiscellaneousCoverages_TXT_LocationNo");
		String strCIMMiscellaneousCoverages_TXT_BuildingNo = (String) row.get("CIMMiscellaneousCoverages_TXT_BuildingNo");

		
		try{

			if((strCIMMiscellaneousCoverages_BTN_ADD.equalsIgnoreCase("Yes"))){
			se.element().Click(getCIMMiscellaneousCoverage_BTN_ADD(strCIMMiscellaneousCoverages_BTN_ADD),test);
			se.verify().verifyEquals("CIMMiscellaneousCoverages Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
			}
			if((strCIMMiscellaneousCoverages_BTN_Details.equalsIgnoreCase("Yes"))){
			se.element().tryClick(getCIMMiscellaneousCoverage_BTN_Details(strCIMMiscellaneousCoverages_BTN_Details),test);
			se.verify().verifyEquals("CIMMiscellaneousCoverages Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
			}

			/*
			 * if(!strCIMMiscellaneousCoverages_TXT_CoverageDescription.equalsIgnoreCase(
			 * "N/A") &&
			 * !strCIMMiscellaneousCoverages_TXT_CoverageDescription.contains("validate2")){
			 * se.element().Click(
			 * getCIMMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon(
			 * strCIMMiscellaneousCoverages_TXT_CoverageDescription), test);
			 * se.element().clickElement(
			 * getCIMMiscellaneousCoverages_LNK_CoverageDescription(
			 * strCIMMiscellaneousCoverages_TXT_CoverageDescription), test); }else{
			 * se.element().enterOrValidateText(
			 * getCIMMiscellaneousCoverages_TXT_CoverageDescription(
			 * strCIMMiscellaneousCoverages_TXT_CoverageDescription),
			 * strCIMMiscellaneousCoverages_TXT_CoverageDescription,test); }
			 */
			
			se.element().selectPopupWithMagnifier(getCIMMiscellaneousCoverages_TXT_CoverageDescription(strCIMMiscellaneousCoverages_TXT_CoverageDescription), getCIMMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon(strCIMMiscellaneousCoverages_TXT_CoverageDescription), strCIMMiscellaneousCoverages_TXT_CoverageDescription, strCIMMiscellaneousCoverages_BTN_CoverageDescriptionSearchDisplay, strCIMMiscellaneousCoverages_TXT_CoverageDescription, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCIMMiscellaneousCoverages_TXT_FormNo(strCIMMiscellaneousCoverages_TXT_FormNo),strCIMMiscellaneousCoverages_TXT_FormNo,test);
			se.element().enterOrValidateText(getCIMMiscellaneousCoverages_TXT_FormName(strCIMMiscellaneousCoverages_TXT_FormName),strCIMMiscellaneousCoverages_TXT_FormName,test);
			
			//se.element().enterOrValidateText(getCIMMiscellaneousCoverages_TXT_State(strCIMMiscellaneousCoverages_TXT_State),strCIMMiscellaneousCoverages_TXT_State,test);
			/*
			 * if(!strCIMMiscellaneousCoverages_TXT_State.equalsIgnoreCase("N/A") &&
			 * !strCIMMiscellaneousCoverages_TXT_State.contains("validate2")){
			 * se.element().Click(getCIMMiscellaneousCoverages_BTN_StateSearchIcon(), test);
			 * se.element().clickElement(getCIMMiscellaneousCoverages_LNK_StateOption(
			 * strCIMMiscellaneousCoverages_TXT_State), test);
			 * 
			 * }else{
			 * se.element().enterOrValidateText(getCIMMiscellaneousCoverages_TXT_State(
			 * strCIMMiscellaneousCoverages_TXT_State),
			 * strCIMMiscellaneousCoverages_TXT_State,test); }
			 */
			se.element().selectPopupWithMagnifier(getCIMMiscellaneousCoverages_TXT_State(strCIMMiscellaneousCoverages_TXT_State), getCIMMiscellaneousCoverages_BTN_StateSearchIcon(strCIMMiscellaneousCoverages_TXT_State), strCIMMiscellaneousCoverages_TXT_State, constants.NA, strCIMMiscellaneousCoverages_TXT_State, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCIMMiscellaneousCoverages_TXT_NISSCode(strCIMMiscellaneousCoverages_TXT_NISSCode),strCIMMiscellaneousCoverages_TXT_NISSCode,test);
			se.element().enterOrValidateText(getCIMMiscellaneousCoverages_TXT_AAISCode(strCIMMiscellaneousCoverages_TXT_AAISCode),strCIMMiscellaneousCoverages_TXT_AAISCode,test);
			se.element().enterOrValidateText(getCIMMiscellaneousCoverages_TXT_AnnualPremium(strCIMMiscellaneousCoverages_TXT_AnnualPremium),strCIMMiscellaneousCoverages_TXT_AnnualPremium,test);
			se.element().checkUncheckOrValidate(getCIMMiscellaneousCoverages_CHK_PremiumChargeTypeProRata(strCIMMiscellaneousCoverages_CHK_PremiumChargeTypeProRata),strCIMMiscellaneousCoverages_CHK_PremiumChargeTypeProRata,test);
			se.element().checkUncheckOrValidate(getCIMMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge(strCIMMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge),strCIMMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge,test);
			se.element().checkUncheckOrValidate(getCIMMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned(strCIMMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned),strCIMMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned,test);
			se.element().enterOrValidateText(getCIMMiscellaneousCoverages_TXT_Description(strCIMMiscellaneousCoverages_TXT_Description),strCIMMiscellaneousCoverages_TXT_Description,test);
			se.element().enterOrValidateText(getCIMMiscellaneousCoverages_TXT_LocationNo(strCIMMiscellaneousCoverages_TXT_LocationNo),strCIMMiscellaneousCoverages_TXT_LocationNo,test);
			se.element().enterOrValidateText(getCIMMiscellaneousCoverages_TXT_BuildingNo(strCIMMiscellaneousCoverages_TXT_BuildingNo),strCIMMiscellaneousCoverages_TXT_BuildingNo,test);
			
	
}catch(Exception e){
	se.verify().verifyEquals("Failed to fill in details CIMMiscellaneousCoverageGenInfo ", true, false, true, test);
			
		}

}
	
public void CP_CIMMiscellaneousCoverageTaxInfo(Map<String, String> row, ExtentTest test) throws IOException {
	
	
	String strCIMMiscellaneousCoverages_TXT_JurisdictionDescription = (String) row.get("CIMMiscellaneousCoverages_TXT_JurisdictionDescription");
	String strCIMMiscellaneousCoverages_TXT_FPDCode = (String) row.get("CIMMiscellaneousCoverages_TXT_FPDCode");
	String strCIMMiscellaneousCoverages_TXT_FireProtectionDistrict = (String) row.get("CIMMiscellaneousCoverages_TXT_FireProtectionDistrict");
	String strCIMMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes = (String) row.get("CIMMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes");
	String strCIMMiscellaneousCoverages_CHK_AllCityName = (String) row.get("CIMMiscellaneousCoverages_CHK_AllCityName");
	String strCIMMiscellaneousCoverages_TXT_City = (String) row.get("CIMMiscellaneousCoverages_TXT_City");
	String strCIMMiscellaneousCoverages_TXT_CityCode = (String) row.get("CIMMiscellaneousCoverages_TXT_CityCode");
	String strCIMMiscellaneousCoverages_TXT_County = (String) row.get("CIMMiscellaneousCoverages_TXT_County");
	String strCIMMiscellaneousCoverages_TXT_CountyCode = (String) row.get("CIMMiscellaneousCoverages_TXT_CountyCode");
	String strCIMMiscellaneousCoverages_TXT_TaxCode = (String) row.get("CIMMiscellaneousCoverages_TXT_TaxCode");

	
	try{
		if(!strCIMMiscellaneousCoverages_TXT_JurisdictionDescription.equalsIgnoreCase("N/A") && !strCIMMiscellaneousCoverages_TXT_JurisdictionDescription.contains("validate2")){
			se.element().Click(getCIMMiscellaneousCoverages_BTN_JurisdictionDescriptionSearchIcon(strCIMMiscellaneousCoverages_TXT_JurisdictionDescription), test);
			se.element().enterOrValidateText(getCIMMiscellaneousCoverages_TXT_Popup_JurisdictionDescriptionSearch(strCIMMiscellaneousCoverages_TXT_JurisdictionDescription),strCIMMiscellaneousCoverages_TXT_JurisdictionDescription,test);
			se.element().Click(getPopupBTNSearchIcon(), test);
			se.element().clickElement(getCIMMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption(strCIMMiscellaneousCoverages_TXT_JurisdictionDescription), test);
		}else{
		se.element().enterOrValidateText(getCIMMiscellaneousCoverages_TXT_JurisdictionDescription(strCIMMiscellaneousCoverages_TXT_JurisdictionDescription),strCIMMiscellaneousCoverages_TXT_JurisdictionDescription,test);
		}
		se.element().enterOrValidateText(getCIMMiscellaneousCoverages_TXT_FPDCode(strCIMMiscellaneousCoverages_TXT_FPDCode),strCIMMiscellaneousCoverages_TXT_FPDCode,test);
		se.element().enterOrValidateText(getCIMMiscellaneousCoverages_TXT_FireProtectionDistrict(strCIMMiscellaneousCoverages_TXT_FireProtectionDistrict),strCIMMiscellaneousCoverages_TXT_FireProtectionDistrict,test);
		se.element().checkUncheckOrValidate(getCIMMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes(strCIMMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes),strCIMMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes,test);
		se.element().checkUncheckOrValidate(getCIMMiscellaneousCoverages_CHK_AllCityName(strCIMMiscellaneousCoverages_CHK_AllCityName),strCIMMiscellaneousCoverages_CHK_AllCityName,test);
		se.element().enterOrValidateText(getCIMMiscellaneousCoverages_TXT_City(strCIMMiscellaneousCoverages_TXT_City),strCIMMiscellaneousCoverages_TXT_City,test);
		se.element().enterOrValidateText(getCIMMiscellaneousCoverages_TXT_CityCode(strCIMMiscellaneousCoverages_TXT_CityCode),strCIMMiscellaneousCoverages_TXT_CityCode,test);
		se.element().enterOrValidateText(getCIMMiscellaneousCoverages_TXT_County(strCIMMiscellaneousCoverages_TXT_County),strCIMMiscellaneousCoverages_TXT_County,test);
		se.element().enterOrValidateText(getCIMMiscellaneousCoverages_TXT_CountyCode(strCIMMiscellaneousCoverages_TXT_CountyCode),strCIMMiscellaneousCoverages_TXT_CountyCode,test);
		se.element().enterOrValidateText(getCIMMiscellaneousCoverages_TXT_TaxCode(strCIMMiscellaneousCoverages_TXT_TaxCode),strCIMMiscellaneousCoverages_TXT_TaxCode,test);
		
}catch(Exception e){
se.verify().verifyEquals("Failed to fill in details CIMMiscellaneousCoverageTaxInfo ", true, false, true, test);
		
	}

}

}
