package pw.pages.PLCM;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import pw.Constants.constants;
import pw.OR.OR_ProfLiab;

public class ProfLiab_MiscellaneousCoverage extends OR_ProfLiab {
	
	public void CP_ProfLiabMiscellaneousCoverage(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
        if(SuspendSheet.equalsIgnoreCase("ProfLiab_MiscCovg")){
             test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
             testTearDown(se, test);
        }
		List<Map<String, String>> table = ExcelOperations.getPagesData("ProfLiab_MiscCovg", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);	
		String strProfLiabMiscellaneousCoverages_BTN_Done = (String) row.get("ProfLiabMiscellaneousCoverages_BTN_Done");
		ProfLiab_MiscellaneousCoverage ProfLiab_MiscellaneousCoveragePage = TestPageFactory.initElements(se, ProfLiab_MiscellaneousCoverage.class);
		try{
			
			test.log(LogStatus.INFO, "ProfLiabMiscellaneousCoverage","Transaction Step : " + transaction + "<br>" + "Page : ProfLiabMiscellaneousCoverage");
			se.verify().verifyEquals("ProfLiabMiscellaneousCoverage Page of PowerWriter ", getProfLiabMiscellaneousCoverage_LBL_MiscellaneousCoverage("ProfLiabMiscellaneousCoverage").isDisplayed(),true, true,test);
			ProfLiab_MiscellaneousCoveragePage.CP_ProfLiabMiscellaneousCoverageGenInfo(row,test);
			ProfLiab_MiscellaneousCoveragePage.CP_ProfLiabMiscellaneousCoverageTaxInfo(row,test);
			
				se.element().Click(getNext(),test);
					
					if((strProfLiabMiscellaneousCoverages_BTN_Done.equalsIgnoreCase("Yes"))){
						
						se.element().Click(getDone(),test);
					}
					
			
				
	}catch(Exception e){
	se.verify().verifyEquals("Failed to fill in details ProfLiabMiscellaneousCoverage ", true, false, true, test);
			
	}
				iteration++;
			}

		} catch (Exception e) {
			// TODO: handle exception
			se.log().logTestStep(
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			test.log(LogStatus.FAIL, "Failed",
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			testTearDown(se, test);
		}

	}
public void CP_ProfLiabMiscellaneousCoverageGenInfo(Map<String, String> row, ExtentTest test) throws IOException {
	
	
		String strProfLiabMiscellaneousCoverages_BTN_ADD = (String) row.get("ProfLiabMiscellaneousCoverages_BTN_ADD");
		String strProfLiabMiscellaneousCoverages_BTN_Details = (String) row.get("ProfLiabMiscellaneousCoverages_BTN_Details");
		String strProfLiabMiscellaneousCoverages_TXT_CoverageDescription = (String) row.get("ProfLiabMiscellaneousCoverages_TXT_CoverageDescription");
		String strProfLiabMiscellaneousCoverages_TXT_FormNo = (String) row.get("ProfLiabMiscellaneousCoverages_TXT_FormNo");
		String strProfLiabMiscellaneousCoverages_TXT_FormName = (String) row.get("ProfLiabMiscellaneousCoverages_TXT_FormName");
		String strProfLiabMiscellaneousCoverages_TXT_State = (String) row.get("ProfLiabMiscellaneousCoverages_TXT_State");
		String strProfLiabMiscellaneousCoverages_TXT_ClassCode = (String) row.get("ProfLiabMiscellaneousCoverages_TXT_ClassCode");
		String strProfLiabMiscellaneousCoverages_TXT_SublineCode = (String) row.get("ProfLiabMiscellaneousCoverages_TXT_SublineCode");
		String strProfLiabMiscellaneousCoverages_TXT_AnnualPremium = (String) row.get("ProfLiabMiscellaneousCoverages_TXT_AnnualPremium");
		String strProfLiabMiscellaneousCoverages_CHK_PremiumChargeTypeProRata = (String) row.get("ProfLiabMiscellaneousCoverages_CHK_PremiumChargeTypeProRata");
		String strProfLiabMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge = (String) row.get("ProfLiabMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge");
		String strProfLiabMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned = (String) row.get("ProfLiabMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned");
		String strProfLiabMiscellaneousCoverages_TXT_Description = (String) row.get("ProfLiabMiscellaneousCoverages_TXT_Description");
		String strProfLiabMiscellaneousCoverages_TXT_LocationNo = (String) row.get("ProfLiabMiscellaneousCoverages_TXT_LocationNo");
		String strProfLiabMiscellaneousCoverages_TXT_BuildingNo = (String) row.get("ProfLiabMiscellaneousCoverages_TXT_BuildingNo");
		try{
			
			if((strProfLiabMiscellaneousCoverages_BTN_ADD.equalsIgnoreCase("Yes"))){
			se.element().Click(getProfLiabMiscellaneousCoverage_BTN_ADD(strProfLiabMiscellaneousCoverages_BTN_ADD),test);
			se.verify().verifyEquals("ProfLiabMiscellaneousCoverage Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
			}
			if((strProfLiabMiscellaneousCoverages_BTN_Details.equalsIgnoreCase("Yes"))){
			se.element().tryClick(getProfLiabMiscellaneousCoverage_BTN_Details(strProfLiabMiscellaneousCoverages_BTN_Details),test);
			se.verify().verifyEquals("ProfLiabMiscellaneousCoverage Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
			}
			se.element().selectPopupWithMagnifier(getProfLiabMiscellaneousCoverages_TXT_CoverageDescription(strProfLiabMiscellaneousCoverages_TXT_CoverageDescription), getProfLiabMiscellaneousCoverages_TXT_CoverageDescription_Search(strProfLiabMiscellaneousCoverages_TXT_CoverageDescription), strProfLiabMiscellaneousCoverages_TXT_CoverageDescription, constants.NA, strProfLiabMiscellaneousCoverages_TXT_CoverageDescription, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getProfLiabMiscellaneousCoverages_TXT_FormNo(strProfLiabMiscellaneousCoverages_TXT_FormNo),strProfLiabMiscellaneousCoverages_TXT_FormNo,test);
			se.element().enterOrValidateText(getProfLiabMiscellaneousCoverages_TXT_FormName(strProfLiabMiscellaneousCoverages_TXT_FormName),strProfLiabMiscellaneousCoverages_TXT_FormName,test);
			se.element().selectPopupWithMagnifier(getProfLiabMiscellaneousCoverages_TXT_State(strProfLiabMiscellaneousCoverages_TXT_State), getProfLiabMiscellaneousCoverages_BTN_StateSearchIcon(strProfLiabMiscellaneousCoverages_TXT_State), strProfLiabMiscellaneousCoverages_TXT_State, constants.NA, strProfLiabMiscellaneousCoverages_TXT_State, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getProfLiabMiscellaneousCoverages_TXT_ClassCode(strProfLiabMiscellaneousCoverages_TXT_ClassCode),strProfLiabMiscellaneousCoverages_TXT_ClassCode,test);
			se.element().enterOrValidateText(getProfLiabMiscellaneousCoverages_TXT_SublineCode(strProfLiabMiscellaneousCoverages_TXT_SublineCode),strProfLiabMiscellaneousCoverages_TXT_SublineCode,test);
			se.element().enterOrValidateText(getProfLiabMiscellaneousCoverages_TXT_AnnualPremium(strProfLiabMiscellaneousCoverages_TXT_AnnualPremium),strProfLiabMiscellaneousCoverages_TXT_AnnualPremium,test);
			se.element().checkUncheckOrValidate(getProfLiabMiscellaneousCoverages_CHK_PremiumChargeTypeProRata(strProfLiabMiscellaneousCoverages_CHK_PremiumChargeTypeProRata),strProfLiabMiscellaneousCoverages_CHK_PremiumChargeTypeProRata,test);
			se.element().checkUncheckOrValidate(getProfLiabMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge(strProfLiabMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge),strProfLiabMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge,test);
			se.element().checkUncheckOrValidate(getProfLiabMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned(strProfLiabMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned),strProfLiabMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned,test);
			se.element().enterOrValidateText(getProfLiabMiscellaneousCoverages_TXT_Description(strProfLiabMiscellaneousCoverages_TXT_Description),strProfLiabMiscellaneousCoverages_TXT_Description,test);
			se.element().enterOrValidateText(getProfLiabMiscellaneousCoverages_TXT_LocationNo(strProfLiabMiscellaneousCoverages_TXT_LocationNo),strProfLiabMiscellaneousCoverages_TXT_LocationNo,test);
			se.element().enterOrValidateText(getProfLiabMiscellaneousCoverages_TXT_BuildingNo(strProfLiabMiscellaneousCoverages_TXT_BuildingNo),strProfLiabMiscellaneousCoverages_TXT_BuildingNo,test);
			
	
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details ProfLiabMiscellaneousCoverageGenInfo ", true, false, true, test);	
		}
	}

public void CP_ProfLiabMiscellaneousCoverageTaxInfo(Map<String, String> row, ExtentTest test) throws IOException {
	
	String strProfLiabMiscellaneousCoverages_TXT_JurisdictionDescription = (String) row.get("ProfLiabMiscellaneousCoverages_TXT_JurisdictionDescription");
	String strProfLiabMiscellaneousCoverages_TXT_FPDCode = (String) row.get("ProfLiabMiscellaneousCoverages_TXT_FPDCode");
	String strProfLiabMiscellaneousCoverages_TXT_FireProtectionDistrict = (String) row.get("ProfLiabMiscellaneousCoverages_TXT_FireProtectionDistrict");
	String strProfLiabMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes = (String) row.get("ProfLiabMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes");
	String strProfLiabMiscellaneousCoverages_CHK_AllCityName = (String) row.get("ProfLiabMiscellaneousCoverages_CHK_AllCityName");
	String strProfLiabMiscellaneousCoverages_TXT_City = (String) row.get("ProfLiabMiscellaneousCoverages_TXT_City");
	String strProfLiabMiscellaneousCoverages_TXT_City_FilterNeeded = (String) row.get("ProfLiabMiscellaneousCoverages_TXT_City_FilterNeeded");
	String strProfLiabMiscellaneousCoverages_TXT_CityCode = (String) row.get("ProfLiabMiscellaneousCoverages_TXT_CityCode");
	String strProfLiabMiscellaneousCoverages_TXT_County = (String) row.get("ProfLiabMiscellaneousCoverages_TXT_County");
	String strProfLiabMiscellaneousCoverages_TXT_County_FilterNeeded = (String) row.get("ProfLiabMiscellaneousCoverages_TXT_County_FilterNeeded");
	String strProfLiabMiscellaneousCoverages_TXT_CountyCode = (String) row.get("ProfLiabMiscellaneousCoverages_TXT_CountyCode");
	String strProfLiabMiscellaneousCoverages_TXT_TaxCode = (String) row.get("ProfLiabMiscellaneousCoverages_TXT_TaxCode");
	try{
		
		if(!strProfLiabMiscellaneousCoverages_TXT_JurisdictionDescription.equalsIgnoreCase("N/A") && !strProfLiabMiscellaneousCoverages_TXT_JurisdictionDescription.contains("validate2")){
		se.element().selectPopupWithMagnifier(getProfLiabMiscellaneousCoverages_TXT_JurisdictionDescription(strProfLiabMiscellaneousCoverages_TXT_JurisdictionDescription), getProfLiabMiscellaneousCoverages_TXT_JurisdictionDescription_Search(strProfLiabMiscellaneousCoverages_TXT_JurisdictionDescription), strProfLiabMiscellaneousCoverages_TXT_JurisdictionDescription, constants.NA, strProfLiabMiscellaneousCoverages_TXT_JurisdictionDescription, constants.NA, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getProfLiabMiscellaneousCoverages_TXT_FPDCode(strProfLiabMiscellaneousCoverages_TXT_FPDCode),strProfLiabMiscellaneousCoverages_TXT_FPDCode,test);
		se.element().enterOrValidateText(getProfLiabMiscellaneousCoverages_TXT_FireProtectionDistrict(strProfLiabMiscellaneousCoverages_TXT_FireProtectionDistrict),strProfLiabMiscellaneousCoverages_TXT_FireProtectionDistrict,test);
		se.element().checkUncheckOrValidate(getProfLiabMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes(strProfLiabMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes),strProfLiabMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes,test);
		se.element().checkUncheckOrValidate(getProfLiabMiscellaneousCoverages_CHK_AllCityName(strProfLiabMiscellaneousCoverages_CHK_AllCityName),strProfLiabMiscellaneousCoverages_CHK_AllCityName,test);
		se.element().selectPopupWithMagnifier(getProfLiabMiscellaneousCoverages_TXT_City(strProfLiabMiscellaneousCoverages_TXT_City), getProfLiabMiscellaneousCoverages_TXT_City_Search(strProfLiabMiscellaneousCoverages_TXT_City), strProfLiabMiscellaneousCoverages_TXT_City, strProfLiabMiscellaneousCoverages_TXT_City_FilterNeeded, strProfLiabMiscellaneousCoverages_TXT_City, constants.NA, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getProfLiabMiscellaneousCoverages_TXT_CityCode(strProfLiabMiscellaneousCoverages_TXT_CityCode),strProfLiabMiscellaneousCoverages_TXT_CityCode,test);
		se.element().selectPopupWithMagnifier(getProfLiabMiscellaneousCoverages_TXT_County(strProfLiabMiscellaneousCoverages_TXT_County), getProfLiabMiscellaneousCoverages_TXT_County_Search(strProfLiabMiscellaneousCoverages_TXT_County), strProfLiabMiscellaneousCoverages_TXT_County, strProfLiabMiscellaneousCoverages_TXT_County_FilterNeeded, strProfLiabMiscellaneousCoverages_TXT_County, constants.NA, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getProfLiabMiscellaneousCoverages_TXT_CountyCode(strProfLiabMiscellaneousCoverages_TXT_CountyCode),strProfLiabMiscellaneousCoverages_TXT_CountyCode,test);
		se.element().enterOrValidateText(getProfLiabMiscellaneousCoverages_TXT_TaxCode(strProfLiabMiscellaneousCoverages_TXT_TaxCode),strProfLiabMiscellaneousCoverages_TXT_TaxCode,test);
		}
		


}catch(Exception e){
se.verify().verifyEquals("Failed to fill in details ProfLiabMiscellaneousCoverageTaxInfo ", true, false, true, test);
		
	}

}


}
	
	
