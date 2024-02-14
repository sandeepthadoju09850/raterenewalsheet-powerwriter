package pw.pages.CAF;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import pw.Constants.constants;
import pw.OR.OR_Crime;

public class Crime_MiscellaneousCoverage extends OR_Crime {
	
	public void CP_CrimeMiscellaneousCoverage(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("Crime_MiscellaneousCoverages")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("Crime_MiscellaneousCoverages", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCrimeMiscellaneousCoverages_BTN_Done = (String) row.get("CrimeMiscellaneousCoverages_BTN_Done");
		Crime_MiscellaneousCoverage Crime_MiscellaneousCoveragePage = TestPageFactory.initElements(se, Crime_MiscellaneousCoverage.class);
		
		try{
			
			test.log(LogStatus.INFO, "CrimeMiscellaneousCoverage","Transaction Step : " + transaction + "<br>" + "Page : CrimeMiscellaneousCoverage");
			se.verify().verifyEquals("CrimeMiscellaneousCoverage Page of PowerWriter ", getCrimeMiscellaneousCoverage_LBL_MiscellaneousCoverage("CrimeMiscellaneousCoverage").isDisplayed(),true, true,test);
			Crime_MiscellaneousCoveragePage.CP_CrimeMiscellaneousCoverageGenInfo(row,test);
			Crime_MiscellaneousCoveragePage.CP_CrimeMiscellaneousCoverageTaxInfo(row,test);
				se.element().Click(getNext(),test);
					
					if((strCrimeMiscellaneousCoverages_BTN_Done.equalsIgnoreCase("Yes"))){
						
						se.element().Click(getDone(),test);
					}

		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details CrimeMiscellaneousCoverage ", true, false, true, test);
			
		}
		iteration++;
	}

		} catch (Exception e) {
			// TODO: handle exception
			se.log().logTestStep(
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			test.log(LogStatus.FAIL, "Faied",
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			testTearDown(se, test);
		}

	}	

public void CP_CrimeMiscellaneousCoverageGenInfo(Map<String, String> row, ExtentTest test) throws IOException {
	
	
		String strCrimeMiscellaneousCoverages_BTN_ADD = (String) row.get("CrimeMiscellaneousCoverages_BTN_ADD");
		String strCrimeMiscellaneousCoverages_BTN_Details = (String) row.get("CrimeMiscellaneousCoverages_BTN_Details");
		String strCrimeMiscellaneousCoverages_TXT_CoverageDescription = (String) row.get("CrimeMiscellaneousCoverages_TXT_CoverageDescription");
		String strCrimeMiscellaneousCoverages_TXT_FormNo = (String) row.get("CrimeMiscellaneousCoverages_TXT_FormNo");
		String strCrimeMiscellaneousCoverages_TXT_FormName = (String) row.get("CrimeMiscellaneousCoverages_TXT_FormName");
		String strCrimeMiscellaneousCoverages_TXT_State = (String) row.get("CrimeMiscellaneousCoverages_TXT_State");
		String strCrimeMiscellaneousCoverages_TXT_CrimeCoverageCode = (String) row.get("CrimeMiscellaneousCoverages_TXT_CrimeCoverageCode");
		String strCrimeMiscellaneousCoverages_TXT_CrimeAmendmentCode = (String) row.get("CrimeMiscellaneousCoverages_TXT_CrimeAmendmentCode");
		String strCrimeMiscellaneousCoverages_TXT_AnnualPremium = (String) row.get("CrimeMiscellaneousCoverages_TXT_AnnualPremium");
		String strCrimeMiscellaneousCoverages_CHK_PremiumChargeTypeProRata = (String) row.get("CrimeMiscellaneousCoverages_CHK_PremiumChargeTypeProRata");
		String strCrimeMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge = (String) row.get("CrimeMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge");
		String strCrimeMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned = (String) row.get("CrimeMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned");
		String strCrimeMiscellaneousCoverages_TXT_Description = (String) row.get("CrimeMiscellaneousCoverages_TXT_Description");
		String strCrimeMiscellaneousCoverages_TXT_LocationNo = (String) row.get("CrimeMiscellaneousCoverages_TXT_LocationNo");
		String strCrimeMiscellaneousCoverages_TXT_BuildingNo = (String) row.get("CrimeMiscellaneousCoverages_TXT_BuildingNo");
		
		try{
			
			
			if((strCrimeMiscellaneousCoverages_BTN_ADD.equalsIgnoreCase("Yes"))){
			se.element().Click(getCrimeMiscellaneousCoverage_BTN_ADD(strCrimeMiscellaneousCoverages_BTN_ADD),test);
			se.verify().verifyEquals("CrimeMiscellaneousCoverage Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
			}
			if((strCrimeMiscellaneousCoverages_BTN_Details.equalsIgnoreCase("Yes"))){
			se.element().tryClick(getCrimeMiscellaneousCoverage_BTN_Details(strCrimeMiscellaneousCoverages_BTN_Details),test);
			se.verify().verifyEquals("CrimeMiscellaneousCoverage Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
			}
		
			se.element().selectPopupWithMagnifier(getCrimeMiscellaneousCoverages_TXT_CoverageDescription(strCrimeMiscellaneousCoverages_TXT_CoverageDescription), getCrimeMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon(strCrimeMiscellaneousCoverages_TXT_CoverageDescription), strCrimeMiscellaneousCoverages_TXT_CoverageDescription, constants.NA, strCrimeMiscellaneousCoverages_TXT_CoverageDescription, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCrimeMiscellaneousCoverages_TXT_FormNo(strCrimeMiscellaneousCoverages_TXT_FormNo),strCrimeMiscellaneousCoverages_TXT_FormNo,test);
			se.element().enterOrValidateText(getCrimeMiscellaneousCoverages_TXT_FormName(strCrimeMiscellaneousCoverages_TXT_FormName),strCrimeMiscellaneousCoverages_TXT_FormName,test);
			se.element().selectPopupWithMagnifier(getCrimeMiscellaneousCoverages_TXT_State(strCrimeMiscellaneousCoverages_TXT_State), getCrimeMiscellaneousCoverages_BTN_StateSearchIcon(strCrimeMiscellaneousCoverages_TXT_State), strCrimeMiscellaneousCoverages_TXT_State,constants.NA, strCrimeMiscellaneousCoverages_TXT_State, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCrimeMiscellaneousCoverages_TXT_CrimeCoverageCode(strCrimeMiscellaneousCoverages_TXT_CrimeCoverageCode),strCrimeMiscellaneousCoverages_TXT_CrimeCoverageCode,test);
			se.element().enterOrValidateText(getCrimeMiscellaneousCoverages_TXT_CrimeAmendmentCode(strCrimeMiscellaneousCoverages_TXT_CrimeAmendmentCode),strCrimeMiscellaneousCoverages_TXT_CrimeAmendmentCode,test);
			se.element().enterOrValidateText(getCrimeMiscellaneousCoverages_TXT_AnnualPremium(strCrimeMiscellaneousCoverages_TXT_AnnualPremium),strCrimeMiscellaneousCoverages_TXT_AnnualPremium,test);
			se.element().checkUncheckOrValidate(getCrimeMiscellaneousCoverages_CHK_PremiumChargeTypeProRata(strCrimeMiscellaneousCoverages_CHK_PremiumChargeTypeProRata),strCrimeMiscellaneousCoverages_CHK_PremiumChargeTypeProRata,test);
			se.element().checkUncheckOrValidate(getCrimeMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge(strCrimeMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge),strCrimeMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge,test);
			se.element().checkUncheckOrValidate(getCrimeMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned(strCrimeMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned),strCrimeMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned,test);
			se.element().enterOrValidateText(getCrimeMiscellaneousCoverages_TXT_Description(strCrimeMiscellaneousCoverages_TXT_Description),strCrimeMiscellaneousCoverages_TXT_Description,test);
			se.element().enterOrValidateText(getCrimeMiscellaneousCoverages_TXT_LocationNo(strCrimeMiscellaneousCoverages_TXT_LocationNo),strCrimeMiscellaneousCoverages_TXT_LocationNo,test);
			se.element().enterOrValidateText(getCrimeMiscellaneousCoverages_TXT_BuildingNo(strCrimeMiscellaneousCoverages_TXT_BuildingNo),strCrimeMiscellaneousCoverages_TXT_BuildingNo,test);
			
	
	
}catch(Exception e){
	se.verify().verifyEquals("Failed to fill in details CrimeMiscellaneousCoverageGenInfo ", true, false, true, test);
			
		}

}
public void CP_CrimeMiscellaneousCoverageTaxInfo(Map<String, String> row, ExtentTest test) throws IOException {
	
	String strCrimeMiscellaneousCoverages_TXT_JurisdictionDescription = (String) row.get("CrimeMiscellaneousCoverages_TXT_JurisdictionDescription");
	String strCrimeMiscellaneousCoverages_TXT_FPDCode = (String) row.get("CrimeMiscellaneousCoverages_TXT_FPDCode");
	String strCrimeMiscellaneousCoverages_TXT_FireProtectionDistrict = (String) row.get("CrimeMiscellaneousCoverages_TXT_FireProtectionDistrict");
	String strCrimeMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes = (String) row.get("CrimeMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes");
	String strCrimeMiscellaneousCoverages_CHK_AllCityName = (String) row.get("CrimeMiscellaneousCoverages_CHK_AllCityName");
	String strCrimeMiscellaneousCoverages_TXT_City = (String) row.get("CrimeMiscellaneousCoverages_TXT_City");
	String strCrimeMiscellaneousCoverages_TXT_CityCode = (String) row.get("CrimeMiscellaneousCoverages_TXT_CityCode");
	String strCrimeMiscellaneousCoverages_TXT_County = (String) row.get("CrimeMiscellaneousCoverages_TXT_County");
	String strCrimeMiscellaneousCoverages_TXT_CountyCode = (String) row.get("CrimeMiscellaneousCoverages_TXT_CountyCode");
	String strCrimeMiscellaneousCoverages_TXT_TaxCode = (String) row.get("CrimeMiscellaneousCoverages_TXT_TaxCode");
	try{
		
		if(!strCrimeMiscellaneousCoverages_TXT_JurisdictionDescription.equalsIgnoreCase("N/A") && !strCrimeMiscellaneousCoverages_TXT_JurisdictionDescription.contains("validate2")){
			se.element().clickSearchIcon(getCrimeMiscellaneousCoverages_BTN_JurisdictionDescriptionSearchIcon(strCrimeMiscellaneousCoverages_TXT_JurisdictionDescription), test);
			se.element().enterOrValidateText(getCrimeMiscellaneousCoverages_TXT_Popup_JurisdictionDescriptionSearch(strCrimeMiscellaneousCoverages_TXT_JurisdictionDescription),strCrimeMiscellaneousCoverages_TXT_JurisdictionDescription,test);
			se.element().Click(getPopupBTNSearchIcon(), test);
			se.element().clickElement(getCrimeMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption(strCrimeMiscellaneousCoverages_TXT_JurisdictionDescription), test);
		}else{
		se.element().enterOrValidateText(getCrimeMiscellaneousCoverages_TXT_JurisdictionDescription(strCrimeMiscellaneousCoverages_TXT_JurisdictionDescription),strCrimeMiscellaneousCoverages_TXT_JurisdictionDescription,test);
		}
		
		se.element().enterOrValidateText(getCrimeMiscellaneousCoverages_TXT_FPDCode(strCrimeMiscellaneousCoverages_TXT_FPDCode),strCrimeMiscellaneousCoverages_TXT_FPDCode,test);
		se.element().enterOrValidateText(getCrimeMiscellaneousCoverages_TXT_FireProtectionDistrict(strCrimeMiscellaneousCoverages_TXT_FireProtectionDistrict),strCrimeMiscellaneousCoverages_TXT_FireProtectionDistrict,test);
		se.element().checkUncheckOrValidate(getCrimeMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes(strCrimeMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes),strCrimeMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes,test);
		se.element().checkUncheckOrValidate(getCrimeMiscellaneousCoverages_CHK_AllCityName(strCrimeMiscellaneousCoverages_CHK_AllCityName),strCrimeMiscellaneousCoverages_CHK_AllCityName,test);
		se.element().enterOrValidateText(getCrimeMiscellaneousCoverages_TXT_City(strCrimeMiscellaneousCoverages_TXT_City),strCrimeMiscellaneousCoverages_TXT_City,test);
		se.element().enterOrValidateText(getCrimeMiscellaneousCoverages_TXT_CityCode(strCrimeMiscellaneousCoverages_TXT_CityCode),strCrimeMiscellaneousCoverages_TXT_CityCode,test);
		se.element().enterOrValidateText(getCrimeMiscellaneousCoverages_TXT_County(strCrimeMiscellaneousCoverages_TXT_County),strCrimeMiscellaneousCoverages_TXT_County,test);
		se.element().enterOrValidateText(getCrimeMiscellaneousCoverages_TXT_CountyCode(strCrimeMiscellaneousCoverages_TXT_CountyCode),strCrimeMiscellaneousCoverages_TXT_CountyCode,test);
		se.element().enterOrValidateText(getCrimeMiscellaneousCoverages_TXT_TaxCode(strCrimeMiscellaneousCoverages_TXT_TaxCode),strCrimeMiscellaneousCoverages_TXT_TaxCode,test);
	
}catch(Exception e){
se.verify().verifyEquals("Failed to fill in details CrimeMiscellaneousCoverageTaxInfo ", true, false, true, test);
		
	}

}

	
	
	
}
