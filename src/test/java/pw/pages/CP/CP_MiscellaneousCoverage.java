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

public class CP_MiscellaneousCoverage extends OR_CP {
	

public void CP_MiscellaneousCov(String strRegressionID, String transaction, ExtentTest test) throws IOException {
	try{
	String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
    if(SuspendSheet.equalsIgnoreCase("CP_MiscellaneousCoverage")){
    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
         testTearDown(se, test);
    }
	List<Map<String, String>> table = ExcelOperations.getPagesData("CP_MiscellaneousCoverage", strRegressionID, transaction);
	int iteration = 0;
	while (iteration < table.size()) {
		LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
	String strCP_MiscCov_BTN_Add=(String) row.get("CP_MiscCov_BTN_Add");
	String strCP_MiscCov_Edit=(String) row.get("CP_MiscCov_Edit");
	String strCP_MiscCov_Done=(String) row.get("CP_MiscCov_Done");
	String strCP_MiscCov_TXT_CoverageDescription=(String) row.get("CP_MiscCov_TXT_CoverageDescription");
	String strCP_MiscCov_TXT_FormNo=(String) row.get("CP_MiscCov_TXT_FormNo");
	String strCP_MiscCov_TXT_FormName=(String) row.get("CP_MiscCov_TXT_FormName");
	String strCP_MiscCov_TXT_State=(String) row.get("CP_MiscCov_TXT_State");
	String strCP_MiscCov_TXT_CSPCode=(String) row.get("CP_MiscCov_TXT_CSPCode");
	String strCP_MiscCov_TXT_SublineCode=(String) row.get("CP_MiscCov_TXT_SublineCode");
	String strCP_MiscCov_TXT_AnnualPremium=(String) row.get("CP_MiscCov_TXT_AnnualPremium");
	String strCP_MiscCov_CHK_PremiumChargeTypeProRata=(String) row.get("CP_MiscCov_CHK_PremiumChargeTypeProRata");
	String strCP_MiscCov_CHK_PremiumChargeTypeFlatCharge=(String) row.get("CP_MiscCov_CHK_PremiumChargeTypeFlatCharge");
	String strCP_MiscCov_CHK_PremiumChargeTypeFullyEarned=(String) row.get("CP_MiscCov_CHK_PremiumChargeTypeFullyEarned");
	String strCP_MiscCov_TXT_Description=(String) row.get("CP_MiscCov_TXT_Description");
	String strCP_MiscCov_TXT_LocationNo=(String) row.get("CP_MiscCov_TXT_LocationNo");
	String strCP_MiscCov_TXT_BuildingNo=(String) row.get("CP_MiscCov_TXT_BuildingNo");
	String strCP_MiscCov_TXT_JurisdictionDescription=(String) row.get("CP_MiscCov_TXT_JurisdictionDescription");
	String strCP_MiscCov_TXT_JurisdictionDescription_FilterNeeded=(String) row.get("CP_MiscCov_TXT_JurisdictionDescription_FilterNeeded");
	String strCP_MiscCov_TXT_FPDCode=(String) row.get("CP_MiscCov_TXT_FPDCode");
	String strCP_MiscCov_TXT_FireProtectionDistrict=(String) row.get("CP_MiscCov_TXT_FireProtectionDistrict");
	String strCP_MiscCov_CHK_DoNotApplyCityOrCountyTaxes=(String) row.get("CP_MiscCov_CHK_DoNotApplyCityOrCountyTaxes");
	String strCP_MiscCov_CHK_AllCityName=(String) row.get("CP_MiscCov_CHK_AllCityName");
	String strCP_MiscCov_TXT_City=(String) row.get("CP_MiscCov_TXT_City");
	String strCP_MiscCov_TXT_CityCode=(String) row.get("CP_MiscCov_TXT_CityCode");
	String strCP_MiscCov_TXT_County=(String) row.get("CP_MiscCov_TXT_County");
	String strCP_MiscCov_TXT_CountyCode=(String) row.get("CP_MiscCov_TXT_CountyCode");
	String strCP_MiscCov_TXT_TaxCode=(String) row.get("CP_MiscCov_TXT_TaxCode");
	
	try{
		se.log().logTestStep("CP_MiscellaneousCoveragePage");
		test.log(LogStatus.INFO, "CP_MiscellaneousCoverage Page","Transaction Step : " + transaction + "<br>" + "Page : GLMiscellaneousCoverages");
		
		se.verify().verifyEquals("MiscellaneousCoverage Page of PowerWriter ",getMiscCov_LBL_MiscellaneousCoverages().isDisplayed(),true, true,test);
		se.util().sleep(1000);
		if(strCP_MiscCov_BTN_Add.equalsIgnoreCase("Yes")){
		se.element().clickElement(CP_MiscCov_BTN_Add);
		}
		if(strCP_MiscCov_Edit.equalsIgnoreCase("Yes")){
			se.element().clickElement(CP_MiscCov_Edit);
		}
		/*if(!strCP_MiscCov_TXT_CoverageDescription.equalsIgnoreCase("N/A") && !strCP_MiscCov_TXT_CoverageDescription.contains("validate2")){
			se.element().clickSearchIcon(getCP_MiscCov_BTN_CoverageDescription(), test);
			se.element().Click(getCP_MiscCov_LNK_CoverageDescription(strCP_MiscCov_TXT_CoverageDescription), test);
		}else{
		se.element().enterOrValidateText(getCP_MiscCov_TXT_CoverageDescription(strCP_MiscCov_TXT_CoverageDescription),strCP_MiscCov_TXT_CoverageDescription,test);
		}*/
		se.element().selectPopupWithMagnifier(getCP_MiscCov_TXT_CoverageDescription(strCP_MiscCov_TXT_CoverageDescription), getCP_MiscCov_BTN_CoverageDescription(strCP_MiscCov_TXT_CoverageDescription), strCP_MiscCov_TXT_CoverageDescription, constants.NA, strCP_MiscCov_TXT_CoverageDescription, constants.NA, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getCP_MiscCov_TXT_FormNo(strCP_MiscCov_TXT_FormNo),strCP_MiscCov_TXT_FormNo,test);
		se.element().enterOrValidateText(getCP_MiscCov_TXT_FormName(strCP_MiscCov_TXT_FormName),strCP_MiscCov_TXT_FormName,test);
		/*if(!strCP_MiscCov_TXT_State.equalsIgnoreCase("N/A") && !strCP_MiscCov_TXT_State.contains("validate2")){
			se.element().clickSearchIcon(getCP_MiscCov_BTN_State(), test);
			se.element().Click(getCP_MiscCov_LNK_State(strCP_MiscCov_TXT_State), test);
		}else{
		se.element().enterOrValidateText(getCP_MiscCov_TXT_State(strCP_MiscCov_TXT_State),strCP_MiscCov_TXT_State,test);
		}*/
		se.element().selectPopupWithMagnifier(getCP_MiscCov_TXT_State(strCP_MiscCov_TXT_State), getCP_MiscCov_BTN_State(strCP_MiscCov_TXT_State), strCP_MiscCov_TXT_State, constants.NA, strCP_MiscCov_TXT_State, constants.NA, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getCP_MiscCov_TXT_CSPCode(strCP_MiscCov_TXT_CSPCode),strCP_MiscCov_TXT_CSPCode,test);
		se.element().enterOrValidateText(getCP_MiscCov_TXT_SublineCode(strCP_MiscCov_TXT_SublineCode),strCP_MiscCov_TXT_SublineCode,test);
		se.element().enterOrValidateText(getCP_MiscCov_TXT_AnnualPremium(strCP_MiscCov_TXT_AnnualPremium),strCP_MiscCov_TXT_AnnualPremium,test);
		se.element().checkUncheckOrValidate(getCP_MiscCov_CHK_PremiumChargeTypeProRata(strCP_MiscCov_CHK_PremiumChargeTypeProRata),strCP_MiscCov_CHK_PremiumChargeTypeProRata,test);
		se.element().checkUncheckOrValidate(getCP_MiscCov_CHK_PremiumChargeTypeFlatCharge(strCP_MiscCov_CHK_PremiumChargeTypeFlatCharge),strCP_MiscCov_CHK_PremiumChargeTypeFlatCharge,test);
		se.element().checkUncheckOrValidate(getCP_MiscCov_CHK_PremiumChargeTypeFullyEarned(strCP_MiscCov_CHK_PremiumChargeTypeFullyEarned),strCP_MiscCov_CHK_PremiumChargeTypeFullyEarned,test);
		se.element().enterOrValidateText(getCP_MiscCov_TXT_Description(strCP_MiscCov_TXT_Description),strCP_MiscCov_TXT_Description,test);
		se.element().enterOrValidateText(getCP_MiscCov_TXT_LocationNo(strCP_MiscCov_TXT_LocationNo),strCP_MiscCov_TXT_LocationNo,test);
		se.element().enterOrValidateText(getCP_MiscCov_TXT_BuildingNo(strCP_MiscCov_TXT_BuildingNo),strCP_MiscCov_TXT_BuildingNo,test);
		/*if(!strCP_MiscCov_TXT_JurisdictionDescription.equalsIgnoreCase("N/A") && !strCP_MiscCov_TXT_JurisdictionDescription.contains("validate2")){
			se.element().clickSearchIcon(getCP_MiscCov_BTN_JurisdictionDescription(), test);
			se.element().Click(getCP_MiscCov_LNK_JurisdictionDescription(strCP_MiscCov_TXT_JurisdictionDescription), test);
		}else{
		se.element().enterOrValidateText(getCP_MiscCov_TXT_JurisdictionDescription(strCP_MiscCov_TXT_JurisdictionDescription),strCP_MiscCov_TXT_JurisdictionDescription,test);
		}*/
		se.element().selectPopupWithMagnifier(getCP_MiscCov_TXT_JurisdictionDescription(strCP_MiscCov_TXT_JurisdictionDescription), getCP_MiscCov_BTN_JurisdictionDescription(strCP_MiscCov_TXT_JurisdictionDescription), strCP_MiscCov_TXT_JurisdictionDescription, strCP_MiscCov_TXT_JurisdictionDescription_FilterNeeded, strCP_MiscCov_TXT_JurisdictionDescription, constants.NA, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getCP_MiscCov_TXT_FPDCode(strCP_MiscCov_TXT_FPDCode),strCP_MiscCov_TXT_FPDCode,test);
		se.element().enterOrValidateText(getCP_MiscCov_TXT_FireProtectionDistrict(strCP_MiscCov_TXT_FireProtectionDistrict),strCP_MiscCov_TXT_FireProtectionDistrict,test);
		se.element().checkUncheckOrValidate(getCP_MiscCov_CHK_DoNotApplyCityOrCountyTaxes(strCP_MiscCov_CHK_DoNotApplyCityOrCountyTaxes),strCP_MiscCov_CHK_DoNotApplyCityOrCountyTaxes,test);
		se.element().checkUncheckOrValidate(getCP_MiscCov_CHK_AllCityName(strCP_MiscCov_CHK_AllCityName),strCP_MiscCov_CHK_AllCityName,test);
		se.element().enterOrValidateText(getCP_MiscCov_TXT_City(strCP_MiscCov_TXT_City),strCP_MiscCov_TXT_City,test);
		se.element().enterOrValidateText(getCP_MiscCov_TXT_CityCode(strCP_MiscCov_TXT_CityCode),strCP_MiscCov_TXT_CityCode,test);
		se.element().enterOrValidateText(getCP_MiscCov_TXT_County(strCP_MiscCov_TXT_County),strCP_MiscCov_TXT_County,test);
		se.element().enterOrValidateText(getCP_MiscCov_TXT_CountyCode(strCP_MiscCov_TXT_CountyCode),strCP_MiscCov_TXT_CountyCode,test);
		se.element().enterOrValidateText(getCP_MiscCov_TXT_TaxCode(strCP_MiscCov_TXT_TaxCode),strCP_MiscCov_TXT_TaxCode,test);
		se.element().Click(getNext(),test);
		
		if(strCP_MiscCov_Done.equalsIgnoreCase("Yes")){
				se.element().Click(getNext(), test);
		}
		}

	catch(Exception e){
		se.verify().verifyEquals("Failed to fill in details for CP_MiscellaneousCoveragePage", true, false, true, test);
		
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

