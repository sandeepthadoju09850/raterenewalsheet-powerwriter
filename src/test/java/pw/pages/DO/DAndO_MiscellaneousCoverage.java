package pw.pages.DO;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import pw.Constants.constants;
import pw.OR.OR_DO;

public class DAndO_MiscellaneousCoverage extends OR_DO {
	

public void CP_DAndOMiscellaneousCoverageGenInfo(Map<String, String> row, ExtentTest test) throws IOException {
	
	
		String strDAndOMiscellaneousCoverages_BTN_ADD = (String) row.get("DAndOMiscellaneousCoverages_BTN_ADD");
		String strDAndOMiscellaneousCoverages_BTN_Details = (String) row.get("DAndOMiscellaneousCoverages_BTN_Details");
		String strDAndOMiscellaneousCoverages_TXT_CoverageDescription = (String) row.get("DAndOMiscellaneousCoverages_TXT_CoverageDescription");
		String strDAndOMiscellaneousCoverages_TXT_FormNo = (String) row.get("DAndOMiscellaneousCoverages_TXT_FormNo");
		String strDAndOMiscellaneousCoverages_TXT_FormName = (String) row.get("DAndOMiscellaneousCoverages_TXT_FormName");
		String strDAndOMiscellaneousCoverages_TXT_State = (String) row.get("DAndOMiscellaneousCoverages_TXT_State");
		String strDAndOMiscellaneousCoverages_TXT_ClassCode = (String) row.get("DAndOMiscellaneousCoverages_TXT_ClassCode");
		String strDAndOMiscellaneousCoverages_TXT_SublineCode = (String) row.get("DAndOMiscellaneousCoverages_TXT_SublineCode");
		String strDAndOMiscellaneousCoverages_TXT_AnnualPremium = (String) row.get("DAndOMiscellaneousCoverages_TXT_AnnualPremium");
		String strDAndOMiscellaneousCoverages_CHK_PremiumChargeTypeProRata = (String) row.get("DAndOMiscellaneousCoverages_CHK_PremiumChargeTypeProRata");
		String strDAndOMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge = (String) row.get("DAndOMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge");
		String strDAndOMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned = (String) row.get("DAndOMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned");
		String strDAndOMiscellaneousCoverages_TXT_Description = (String) row.get("DAndOMiscellaneousCoverages_TXT_Description");
		String strDAndOMiscellaneousCoverages_TXT_LocationNo = (String) row.get("DAndOMiscellaneousCoverages_TXT_LocationNo");
		String strDAndOMiscellaneousCoverages_TXT_BuildingNo = (String) row.get("DAndOMiscellaneousCoverages_TXT_BuildingNo");
		try{
			
			
			if((strDAndOMiscellaneousCoverages_BTN_ADD.equalsIgnoreCase("Yes"))){
			se.element().Click(getDAndOMiscellaneousCoverage_BTN_ADD(strDAndOMiscellaneousCoverages_BTN_ADD),test);
			se.verify().verifyEquals("DAndOMiscellaneousCoverage Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
			}
			if((strDAndOMiscellaneousCoverages_BTN_Details.equalsIgnoreCase("Yes"))){
			se.element().tryClick(getDAndOMiscellaneousCoverage_BTN_Details(strDAndOMiscellaneousCoverages_BTN_Details),test);
			se.verify().verifyEquals("DAndOMiscellaneousCoverage Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
			}
			se.element().selectPopupWithMagnifier(getDAndOMiscellaneousCoverages_TXT_CoverageDescription(strDAndOMiscellaneousCoverages_TXT_CoverageDescription), getDAndOMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon(strDAndOMiscellaneousCoverages_TXT_CoverageDescription), strDAndOMiscellaneousCoverages_TXT_CoverageDescription, constants.NA, strDAndOMiscellaneousCoverages_TXT_CoverageDescription, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getDAndOMiscellaneousCoverages_TXT_FormNo(strDAndOMiscellaneousCoverages_TXT_FormNo),strDAndOMiscellaneousCoverages_TXT_FormNo,test);
			se.element().enterOrValidateText(getDAndOMiscellaneousCoverages_TXT_FormName(strDAndOMiscellaneousCoverages_TXT_FormName),strDAndOMiscellaneousCoverages_TXT_FormName,test);
			se.element().selectPopupWithMagnifier(getDAndOMiscellaneousCoverages_TXT_State(strDAndOMiscellaneousCoverages_TXT_State), getDAndOMiscellaneousCoverages_BTN_StateSearchIcon(strDAndOMiscellaneousCoverages_TXT_State), strDAndOMiscellaneousCoverages_TXT_State, constants.NA, strDAndOMiscellaneousCoverages_TXT_State, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getDAndOMiscellaneousCoverages_TXT_DAndOClassCode(strDAndOMiscellaneousCoverages_TXT_ClassCode),strDAndOMiscellaneousCoverages_TXT_ClassCode,test);
			se.element().enterOrValidateText(getDAndOMiscellaneousCoverages_TXT_DAndOSublineCode(strDAndOMiscellaneousCoverages_TXT_SublineCode),strDAndOMiscellaneousCoverages_TXT_SublineCode,test);
			se.element().enterOrValidateText(getDAndOMiscellaneousCoverages_TXT_AnnualPremium(strDAndOMiscellaneousCoverages_TXT_AnnualPremium),strDAndOMiscellaneousCoverages_TXT_AnnualPremium,test);
			se.element().checkUncheckOrValidate(getDAndOMiscellaneousCoverages_CHK_PremiumChargeTypeProRata(strDAndOMiscellaneousCoverages_CHK_PremiumChargeTypeProRata),strDAndOMiscellaneousCoverages_CHK_PremiumChargeTypeProRata,test);
			se.element().checkUncheckOrValidate(getDAndOMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge(strDAndOMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge),strDAndOMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge,test);
			se.element().checkUncheckOrValidate(getDAndOMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned(strDAndOMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned),strDAndOMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned,test);
			se.element().enterOrValidateText(getDAndOMiscellaneousCoverages_TXT_Description(strDAndOMiscellaneousCoverages_TXT_Description),strDAndOMiscellaneousCoverages_TXT_Description,test);
			se.element().enterOrValidateText(getDAndOMiscellaneousCoverages_TXT_LocationNo(strDAndOMiscellaneousCoverages_TXT_LocationNo),strDAndOMiscellaneousCoverages_TXT_LocationNo,test);
			se.element().enterOrValidateText(getDAndOMiscellaneousCoverages_TXT_BuildingNo(strDAndOMiscellaneousCoverages_TXT_BuildingNo),strDAndOMiscellaneousCoverages_TXT_BuildingNo,test);
			
	
}catch(Exception e){
	se.verify().verifyEquals("Failed to fill in details DAndOMiscellaneousCoverageGenInfo ", true, false, true, test);
			
		}

}
public void CP_DAndOMiscellaneousCoverageTaxInfo(Map<String, String> row, ExtentTest test) throws IOException {
	
	String strDAndOMiscellaneousCoverages_TXT_JurisdictionDescription = (String) row.get("DAndOMiscellaneousCoverages_TXT_JurisdictionDescription");
	String strDAndOMiscellaneousCoverages_TXT_FPDCode = (String) row.get("DAndOMiscellaneousCoverages_TXT_FPDCode");
	String strDAndOMiscellaneousCoverages_TXT_FireProtectionDistrict = (String) row.get("DAndOMiscellaneousCoverages_TXT_FireProtectionDistrict");
	String strDAndOMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes = (String) row.get("DAndOMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes");
	String strDAndOMiscellaneousCoverages_CHK_AllCityName = (String) row.get("DAndOMiscellaneousCoverages_CHK_AllCityName");
	String strDAndOMiscellaneousCoverages_TXT_City = (String) row.get("DAndOMiscellaneousCoverages_TXT_City");
	String strDAndOMiscellaneousCoverages_TXT_City_FilterNeeded = (String) row.get("DAndOMiscellaneousCoverages_TXT_City_FilterNeeded");
	String strDAndOMiscellaneousCoverages_TXT_CityCode = (String) row.get("DAndOMiscellaneousCoverages_TXT_CityCode");
	String strDAndOMiscellaneousCoverages_TXT_County = (String) row.get("DAndOMiscellaneousCoverages_TXT_County");
	String strDAndOMiscellaneousCoverages_TXT_County_FilterNeeded = (String) row.get("DAndOMiscellaneousCoverages_TXT_County_FilterNeeded");
	String strDAndOMiscellaneousCoverages_TXT_CountyCode = (String) row.get("DAndOMiscellaneousCoverages_TXT_CountyCode");
	String strDAndOMiscellaneousCoverages_TXT_TaxCode = (String) row.get("DAndOMiscellaneousCoverages_TXT_TaxCode");
	try{
		
		se.element().selectPopupWithMagnifier(getDAndOMiscellaneousCoverages_TXT_JurisdictionDescription(strDAndOMiscellaneousCoverages_TXT_JurisdictionDescription), getDAndOMiscellaneousCoverages_BTN_JurisdictionDescriptionSearchIcon(strDAndOMiscellaneousCoverages_TXT_JurisdictionDescription), strDAndOMiscellaneousCoverages_TXT_JurisdictionDescription, constants.NA, strDAndOMiscellaneousCoverages_TXT_JurisdictionDescription, constants.NA, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getDAndOMiscellaneousCoverages_TXT_FPDCode(strDAndOMiscellaneousCoverages_TXT_FPDCode),strDAndOMiscellaneousCoverages_TXT_FPDCode,test);
		se.element().enterOrValidateText(getDAndOMiscellaneousCoverages_TXT_FireProtectionDistrict(strDAndOMiscellaneousCoverages_TXT_FireProtectionDistrict),strDAndOMiscellaneousCoverages_TXT_FireProtectionDistrict,test);
		se.element().checkUncheckOrValidate(getDAndOMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes(strDAndOMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes),strDAndOMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes,test);
		se.element().checkUncheckOrValidate(getDAndOMiscellaneousCoverages_CHK_AllCityName(strDAndOMiscellaneousCoverages_CHK_AllCityName),strDAndOMiscellaneousCoverages_CHK_AllCityName,test);
		//se.element().enterOrValidateText(getDAndOMiscellaneousCoverages_TXT_City(strDAndOMiscellaneousCoverages_TXT_City),strDAndOMiscellaneousCoverages_TXT_City,test);
		se.element().selectPopupWithMagnifier(getDAndOMiscellaneousCoverages_TXT_City(strDAndOMiscellaneousCoverages_TXT_City), getDAndOMiscellaneousCoverages_TXT_City_Search(strDAndOMiscellaneousCoverages_TXT_City), strDAndOMiscellaneousCoverages_TXT_City, strDAndOMiscellaneousCoverages_TXT_City_FilterNeeded, strDAndOMiscellaneousCoverages_TXT_City, constants.NA, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getDAndOMiscellaneousCoverages_TXT_CityCode(strDAndOMiscellaneousCoverages_TXT_CityCode),strDAndOMiscellaneousCoverages_TXT_CityCode,test);
		//se.element().enterOrValidateText(getDAndOMiscellaneousCoverages_TXT_County(strDAndOMiscellaneousCoverages_TXT_County),strDAndOMiscellaneousCoverages_TXT_County,test);
		se.element().selectPopupWithMagnifier(getDAndOMiscellaneousCoverages_TXT_County(strDAndOMiscellaneousCoverages_TXT_County), getDAndOMiscellaneousCoverages_TXT_County_Search(strDAndOMiscellaneousCoverages_TXT_County), strDAndOMiscellaneousCoverages_TXT_County, strDAndOMiscellaneousCoverages_TXT_County_FilterNeeded, strDAndOMiscellaneousCoverages_TXT_County, constants.NA, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getDAndOMiscellaneousCoverages_TXT_CountyCode(strDAndOMiscellaneousCoverages_TXT_CountyCode),strDAndOMiscellaneousCoverages_TXT_CountyCode,test);
		se.element().enterOrValidateText(getDAndOMiscellaneousCoverages_TXT_TaxCode(strDAndOMiscellaneousCoverages_TXT_TaxCode),strDAndOMiscellaneousCoverages_TXT_TaxCode,test);
		

}catch(Exception e){
se.verify().verifyEquals("Failed to fill in details DAndOMiscellaneousCoverageTaxinfo ", true, false, true, test);
		
	}

}
public void CP_DAndOMiscellaneousCoverage(String strRegressionID, String transaction, ExtentTest test) throws IOException {
	
try{
String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
           if(SuspendSheet.equalsIgnoreCase("D&O_MiscellaneousCov")){
                test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
                testTearDown(se, test);
           }

	List<Map<String, String>> table = ExcelOperations.getPagesData("D&O_MiscellaneousCov", strRegressionID, transaction);
	int iteration = 0;
	while (iteration < table.size()) {
		LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);

	
	String strDAndOMiscellaneousCoverages_BTN_Done = (String) row.get("DAndOMiscellaneousCoverages_BTN_Done");

	DAndO_MiscellaneousCoverage DAndO_MiscellaneousCoveragePage = TestPageFactory.initElements(se, DAndO_MiscellaneousCoverage.class);
	try{
		
		
		test.log(LogStatus.INFO, "DAndOMiscellaneousCoverage","Transaction Step : " + transaction + "<br>" + "Page : DAndOMiscellaneousCoverage");
		se.verify().verifyEquals("DAndOMiscellaneousCoverage Page of PowerWriter ", getDAndOMiscellaneousCoverage_LBL_MiscellaneousCoverage("DAndOMiscellaneousCoverage").isDisplayed(),true, true,test);
		
		DAndO_MiscellaneousCoveragePage.CP_DAndOMiscellaneousCoverageGenInfo(row,test);
		DAndO_MiscellaneousCoveragePage.CP_DAndOMiscellaneousCoverageTaxInfo(row,test);
			se.element().Click(getNext(),test);
				
				if((strDAndOMiscellaneousCoverages_BTN_Done.equalsIgnoreCase("Yes"))){
					
					se.element().Click(getDone(),test);
				}
				
	

}catch(Exception e){
se.verify().verifyEquals("Failed to fill in details DAndOMiscellaneousCoverage ", true, false, true, test);
		
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
}
