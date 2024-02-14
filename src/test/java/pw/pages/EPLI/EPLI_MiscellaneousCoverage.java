package pw.pages.EPLI;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_EmpPractices;

public class EPLI_MiscellaneousCoverage extends OR_EmpPractices {
	public void CP_EmpPracticesMiscellaneousCoverage(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		
		List<Map<String, String>> table = ExcelOperations.getPagesData("EmpPractices_MiscCovg", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strEmpPracticesMiscellaneousCoverages_BTN_Done = (String) row.get("EmpPracticesMiscellaneousCoverages_BTN_Done");
		
			try
			{
			test.log(LogStatus.INFO, "EmpPracticesMiscellaneousCoverage","Transaction Step : " + transaction + "<br>" + "Page : EmpPracticesMiscellaneousCoverage");
			se.verify().verifyEquals("EmpPracticesMiscellaneousCoverage Page of PowerWriter ", getEmpPracticesMiscellaneousCoverage_LBL_MiscellaneousCoverage("EmpPracticesMiscellaneousCoverage").isDisplayed(),true, true,test);
			CP_EmpPracticesMiscellaneousCoverageGenInfo(row,test);
			CP_EmpPracticesMiscellaneousCoverageTaxInfo(row,test);
				se.element().Click(getNext(),test);
					
					if((strEmpPracticesMiscellaneousCoverages_BTN_Done.equalsIgnoreCase("Yes"))){
						
						se.element().Click(getDone(),test);
					}
					
			

	}catch(Exception e){
	se.verify().verifyEquals("Failed to fill in details EmpPracticesMiscellaneousCoverage ", true, false, true, test);
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

	public void CP_EmpPracticesMiscellaneousCoverageGenInfo(Map<String, String> row, ExtentTest test) throws IOException {
	
		
		String strEmpPracticesMiscellaneousCoverages_BTN_ADD = (String) row.get("EmpPracticesMiscellaneousCoverages_BTN_ADD");
		String strEmpPracticesMiscellaneousCoverages_BTN_Details = (String) row.get("EmpPracticesMiscellaneousCoverages_BTN_Details");
		String strEmpPracticesMiscellaneousCoverages_TXT_CoverageDescription = (String) row.get("EmpPracticesMiscellaneousCoverages_TXT_CoverageDescription");
		String strEmpPracticesMiscellaneousCoverages_TXT_FormNo = (String) row.get("EmpPracticesMiscellaneousCoverages_TXT_FormNo");
		String strEmpPracticesMiscellaneousCoverages_TXT_FormName = (String) row.get("EmpPracticesMiscellaneousCoverages_TXT_FormName");
		String strEmpPracticesMiscellaneousCoverages_TXT_State = (String) row.get("EmpPracticesMiscellaneousCoverages_TXT_State");
		String strEmpPracticesMiscellaneousCoverages_TXT_ClassCode = (String) row.get("EmpPracticesMiscellaneousCoverages_TXT_ClassCode");
		String strEmpPracticesMiscellaneousCoverages_TXT_SublineCode = (String) row.get("EmpPracticesMiscellaneousCoverages_TXT_SublineCode");
		String strEmpPracticesMiscellaneousCoverages_TXT_AnnualPremium = (String) row.get("EmpPracticesMiscellaneousCoverages_TXT_AnnualPremium");
		String strEmpPracticesMiscellaneousCoverages_CHK_PremiumChargeTypeProRata = (String) row.get("EmpPracticesMiscellaneousCoverages_CHK_PremiumChargeTypeProRata");
		String strEmpPracticesMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge = (String) row.get("EmpPracticesMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge");
		String strEmpPracticesMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned = (String) row.get("EmpPracticesMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned");
		String strEmpPracticesMiscellaneousCoverages_TXT_Description = (String) row.get("EmpPracticesMiscellaneousCoverages_TXT_Description");
		String strEmpPracticesMiscellaneousCoverages_TXT_LocationNo = (String) row.get("EmpPracticesMiscellaneousCoverages_TXT_LocationNo");
		String strEmpPracticesMiscellaneousCoverages_TXT_BuildingNo = (String) row.get("EmpPracticesMiscellaneousCoverages_TXT_BuildingNo");
		
		try{
			
			if((strEmpPracticesMiscellaneousCoverages_BTN_ADD.equalsIgnoreCase("Yes"))){
			se.element().Click(getEmpPracticesMiscellaneousCoverage_BTN_ADD(strEmpPracticesMiscellaneousCoverages_BTN_ADD),test);
			se.verify().verifyEquals("EmpPracticesMiscellaneousCoverage Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
			}
			if((strEmpPracticesMiscellaneousCoverages_BTN_Details.equalsIgnoreCase("Yes"))){
			se.element().tryClick(getEmpPracticesMiscellaneousCoverage_BTN_Details(strEmpPracticesMiscellaneousCoverages_BTN_Details),test);
			se.verify().verifyEquals("EmpPracticesMiscellaneousCoverage Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
			}
			se.element().selectPopupWithMagnifier(getEmpPracticesMiscellaneousCoverages_TXT_CoverageDescription(strEmpPracticesMiscellaneousCoverages_TXT_CoverageDescription), getEmpPracticesMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon(strEmpPracticesMiscellaneousCoverages_TXT_CoverageDescription), strEmpPracticesMiscellaneousCoverages_TXT_CoverageDescription, constants.NA, strEmpPracticesMiscellaneousCoverages_TXT_CoverageDescription, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getEmpPracticesMiscellaneousCoverages_TXT_FormNo(strEmpPracticesMiscellaneousCoverages_TXT_FormNo),strEmpPracticesMiscellaneousCoverages_TXT_FormNo,test);
			se.element().enterOrValidateText(getEmpPracticesMiscellaneousCoverages_TXT_FormName(strEmpPracticesMiscellaneousCoverages_TXT_FormName),strEmpPracticesMiscellaneousCoverages_TXT_FormName,test);
			se.element().selectPopupWithMagnifier(getEmpPracticesMiscellaneousCoverages_TXT_State(strEmpPracticesMiscellaneousCoverages_TXT_State), getEmpPracticesMiscellaneousCoverages_BTN_StateSearchIcon(strEmpPracticesMiscellaneousCoverages_TXT_State), strEmpPracticesMiscellaneousCoverages_TXT_State, constants.NA, strEmpPracticesMiscellaneousCoverages_TXT_State, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getEmpPracticesMiscellaneousCoverages_TXT_EmpPracticesClassCode(strEmpPracticesMiscellaneousCoverages_TXT_ClassCode),strEmpPracticesMiscellaneousCoverages_TXT_ClassCode,test);
			se.element().enterOrValidateText(getEmpPracticesMiscellaneousCoverages_TXT_EmpPracticesSublineCode(strEmpPracticesMiscellaneousCoverages_TXT_SublineCode),strEmpPracticesMiscellaneousCoverages_TXT_SublineCode,test);
			se.element().enterOrValidateText(getEmpPracticesMiscellaneousCoverages_TXT_AnnualPremium(strEmpPracticesMiscellaneousCoverages_TXT_AnnualPremium),strEmpPracticesMiscellaneousCoverages_TXT_AnnualPremium,test);
			se.element().checkUncheckOrValidate(getEmpPracticesMiscellaneousCoverages_CHK_PremiumChargeTypeProRata(strEmpPracticesMiscellaneousCoverages_CHK_PremiumChargeTypeProRata),strEmpPracticesMiscellaneousCoverages_CHK_PremiumChargeTypeProRata,test);
			se.element().checkUncheckOrValidate(getEmpPracticesMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge(strEmpPracticesMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge),strEmpPracticesMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge,test);
			se.element().checkUncheckOrValidate(getEmpPracticesMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned(strEmpPracticesMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned),strEmpPracticesMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned,test);
			se.element().enterOrValidateText(getEmpPracticesMiscellaneousCoverages_TXT_Description(strEmpPracticesMiscellaneousCoverages_TXT_Description),strEmpPracticesMiscellaneousCoverages_TXT_Description,test);
			se.element().enterOrValidateText(getEmpPracticesMiscellaneousCoverages_TXT_LocationNo(strEmpPracticesMiscellaneousCoverages_TXT_LocationNo),strEmpPracticesMiscellaneousCoverages_TXT_LocationNo,test);
			se.element().enterOrValidateText(getEmpPracticesMiscellaneousCoverages_TXT_BuildingNo(strEmpPracticesMiscellaneousCoverages_TXT_BuildingNo),strEmpPracticesMiscellaneousCoverages_TXT_BuildingNo,test);
			
	
	
}catch(Exception e){
	se.verify().verifyEquals("Failed to fill in details EmpPracticesMiscellaneousCoverageGenInfo ", true, false, true, test);
			
		}

}
public void CP_EmpPracticesMiscellaneousCoverageTaxInfo(Map<String, String> row, ExtentTest test) throws IOException {
	
	String strEmpPracticesMiscellaneousCoverages_TXT_JurisdictionDescription = (String) row.get("EmpPracticesMiscellaneousCoverages_TXT_JurisdictionDescription");
	String strEmpPracticesMiscellaneousCoverages_TXT_FPDCode = (String) row.get("EmpPracticesMiscellaneousCoverages_TXT_FPDCode");
	String strEmpPracticesMiscellaneousCoverages_TXT_FireProtectionDistrict = (String) row.get("EmpPracticesMiscellaneousCoverages_TXT_FireProtectionDistrict");
	String strEmpPracticesMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes = (String) row.get("EmpPracticesMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes");
	String strEmpPracticesMiscellaneousCoverages_CHK_AllCityName = (String) row.get("EmpPracticesMiscellaneousCoverages_CHK_AllCityName");
	String strEmpPracticesMiscellaneousCoverages_TXT_City = (String) row.get("EmpPracticesMiscellaneousCoverages_TXT_City");
	String strEmpPracticesMiscellaneousCoverages_TXT_City_FilterNeeded = (String) row.get("strEmpPracticesMiscellaneousCoverages_TXT_City_FilterNeeded");
	String strEmpPracticesMiscellaneousCoverages_TXT_CityCode = (String) row.get("EmpPracticesMiscellaneousCoverages_TXT_CityCode");
	String strEmpPracticesMiscellaneousCoverages_TXT_County = (String) row.get("EmpPracticesMiscellaneousCoverages_TXT_County");
	String strEmpPracticesMiscellaneousCoverages_TXT_County_FilterNeeded = (String) row.get("EmpPracticesMiscellaneousCoverages_TXT_County_FilterNeeded");
	String strEmpPracticesMiscellaneousCoverages_TXT_CountyCode = (String) row.get("EmpPracticesMiscellaneousCoverages_TXT_CountyCode");
	String strEmpPracticesMiscellaneousCoverages_TXT_TaxCode = (String) row.get("EmpPracticesMiscellaneousCoverages_TXT_TaxCode");
	try{
		
		se.element().selectPopupWithMagnifier(getEmpPracticesMiscellaneousCoverages_TXT_JurisdictionDescription(strEmpPracticesMiscellaneousCoverages_TXT_JurisdictionDescription), getEmpPracticesMiscellaneousCoverages_BTN_JurisdictionDescriptionSearchIcon(strEmpPracticesMiscellaneousCoverages_TXT_JurisdictionDescription), strEmpPracticesMiscellaneousCoverages_TXT_JurisdictionDescription, constants.NA, strEmpPracticesMiscellaneousCoverages_TXT_JurisdictionDescription, constants.NA, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getEmpPracticesMiscellaneousCoverages_TXT_FPDCode(strEmpPracticesMiscellaneousCoverages_TXT_FPDCode),strEmpPracticesMiscellaneousCoverages_TXT_FPDCode,test);
		se.element().enterOrValidateText(getEmpPracticesMiscellaneousCoverages_TXT_FireProtectionDistrict(strEmpPracticesMiscellaneousCoverages_TXT_FireProtectionDistrict),strEmpPracticesMiscellaneousCoverages_TXT_FireProtectionDistrict,test);
		se.element().checkUncheckOrValidate(getEmpPracticesMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes(strEmpPracticesMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes),strEmpPracticesMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes,test);
		se.element().checkUncheckOrValidate(getEmpPracticesMiscellaneousCoverages_CHK_AllCityName(strEmpPracticesMiscellaneousCoverages_CHK_AllCityName),strEmpPracticesMiscellaneousCoverages_CHK_AllCityName,test);
		se.element().selectPopupWithMagnifier(getEmpPracticesMiscellaneousCoverages_TXT_City(strEmpPracticesMiscellaneousCoverages_TXT_City), getEmpPracticesMiscellaneousCoverages_TXT_City_Search(strEmpPracticesMiscellaneousCoverages_TXT_City), strEmpPracticesMiscellaneousCoverages_TXT_City, strEmpPracticesMiscellaneousCoverages_TXT_City_FilterNeeded, strEmpPracticesMiscellaneousCoverages_TXT_City, constants.NA, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getEmpPracticesMiscellaneousCoverages_TXT_CityCode(strEmpPracticesMiscellaneousCoverages_TXT_CityCode),strEmpPracticesMiscellaneousCoverages_TXT_CityCode,test);
		se.element().selectPopupWithMagnifier(getEmpPracticesMiscellaneousCoverages_TXT_County(strEmpPracticesMiscellaneousCoverages_TXT_County), getEmpPracticesMiscellaneousCoverages_TXT_County_Search(strEmpPracticesMiscellaneousCoverages_TXT_County), strEmpPracticesMiscellaneousCoverages_TXT_County, strEmpPracticesMiscellaneousCoverages_TXT_County_FilterNeeded, strEmpPracticesMiscellaneousCoverages_TXT_County, constants.NA, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getEmpPracticesMiscellaneousCoverages_TXT_CountyCode(strEmpPracticesMiscellaneousCoverages_TXT_CountyCode),strEmpPracticesMiscellaneousCoverages_TXT_CountyCode,test);
		se.element().enterOrValidateText(getEmpPracticesMiscellaneousCoverages_TXT_TaxCode(strEmpPracticesMiscellaneousCoverages_TXT_TaxCode),strEmpPracticesMiscellaneousCoverages_TXT_TaxCode,test);
		
		

}catch(Exception e){
se.verify().verifyEquals("Failed to fill in details EmpPracticesMiscellaneousCoverageTaxInfo ", true, false, true, test);
		
	}

}
	
}
