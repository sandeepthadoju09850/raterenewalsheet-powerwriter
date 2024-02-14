package pw.pages.GL;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_GL;

public class GL_MiscellaneousCoverage extends OR_GL {
	

public void CP_GLMiscellaneousCoverage(String strRegressionID, String transaction, ExtentTest test) throws IOException {
	try{
	String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	if(SuspendSheet.equalsIgnoreCase("GL_MiscellanousCoverages")){
		test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
		testTearDown(se, test);
	}
	List<Map<String, String>> table = ExcelOperations.getPagesData("GL_MiscellanousCoverages", strRegressionID, transaction);
	int iteration = 0;
	while (iteration < table.size()) {
		LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strGLMiscellaneousCoveragesLink = (String) row.get("GLMiscellaneousCoveragesLink");
		String strGLMiscellaneousCoverages_BTN_ADD = (String) row.get("GLMiscellaneousCoverages_BTN_ADD");
		String strGLMiscellaneousCoverages_BTN_Details = (String) row.get("GLMiscellaneousCoverages_BTN_Details");
		String strGLMiscellaneousCoverages_BTN_Done = (String) row.get("GLMiscellaneousCoverages_BTN_Done");
		String strGLMiscellaneousCoverages_TXT_CoverageDescription = (String) row.get("GLMiscellaneousCoverages_TXT_CoverageDescription");
		String strGLMiscellaneousCoverages_TXT_FormNo = (String) row.get("GLMiscellaneousCoverages_TXT_FormNo");
		String strGLMiscellaneousCoverages_TXT_FormName = (String) row.get("GLMiscellaneousCoverages_TXT_FormName");
		String strGLMiscellaneousCoverages_TXT_State = (String) row.get("GLMiscellaneousCoverages_TXT_State");
		String strGLMiscellaneousCoverages_TXT_ClassCode = (String) row.get("GLMiscellaneousCoverages_TXT_ClassCode");
		String strGLMiscellaneousCoverages_TXT_SublineCode = (String) row.get("GLMiscellaneousCoverages_TXT_SublineCode");
		String strGLMiscellaneousCoverages_TXT_AnnualPremium = (String) row.get("GLMiscellaneousCoverages_TXT_AnnualPremium");
		String strGLMiscellaneousCoverages_CHK_PremiumChargeTypeProRata = (String) row.get("GLMiscellaneousCoverages_CHK_PremiumChargeTypeProRata");
		String strGLMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge = (String) row.get("GLMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge");
		String strGLMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned = (String) row.get("GLMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned");
		String strGLMiscellaneousCoverages_TXT_Description = (String) row.get("GLMiscellaneousCoverages_TXT_Description");
		String strGLMiscellaneousCoverages_TXT_LocationNo = (String) row.get("GLMiscellaneousCoverages_TXT_LocationNo");
		String strGLMiscellaneousCoverages_TXT_BuildingNo = (String) row.get("GLMiscellaneousCoverages_TXT_BuildingNo");
		String strGLMiscellaneousCoverages_TXT_JurisdictionDescription = (String) row.get("GLMiscellaneousCoverages_TXT_JurisdictionDescription");
		String strGLMiscellaneousCoverages_TXT_FPDCode = (String) row.get("GLMiscellaneousCoverages_TXT_FPDCode");
		String strGLMiscellaneousCoverages_TXT_FireProtectionDistrict = (String) row.get("GLMiscellaneousCoverages_TXT_FireProtectionDistrict");
		String strGLMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes = (String) row.get("GLMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes");
		String strGLMiscellaneousCoverages_CHK_AllCityName = (String) row.get("GLMiscellaneousCoverages_CHK_AllCityName");
		String strGLMiscellaneousCoverages_TXT_City = (String) row.get("GLMiscellaneousCoverages_TXT_City");
		String strGLMiscellaneousCoverages_TXT_CityCode = (String) row.get("GLMiscellaneousCoverages_TXT_CityCode");
		String strGLMiscellaneousCoverages_TXT_County = (String) row.get("GLMiscellaneousCoverages_TXT_County");
		String strGLMiscellaneousCoverages_TXT_CountyCode = (String) row.get("GLMiscellaneousCoverages_TXT_CountyCode");
		String strGLMiscellaneousCoverages_TXT_TaxCode = (String) row.get("GLMiscellaneousCoverages_TXT_TaxCode");
		
		
		try{
			
			test.log(LogStatus.INFO, "GLMiscellaneousCoverages","Transaction Step : " + transaction + "<br>" + "Page : GLMiscellaneousCoverages");
			if((strGLMiscellaneousCoveragesLink.equalsIgnoreCase("Yes"))){
				se.element().Click(getGLMiscellaneousCoveragesLink(),test);
				}
			se.verify().verifyEquals("GLMiscellaneousCoverages Page of PowerWriter ", getGLMiscellaneousCoverages_LBL_MiscellaneousCoverages("GLMiscellaneousCoverages").isDisplayed(),true, true,test);
			
			if((strGLMiscellaneousCoverages_BTN_ADD.equalsIgnoreCase("Yes"))){
			se.element().Click(getGLMiscellaneousCoverage_BTN_ADD(strGLMiscellaneousCoverages_BTN_ADD),test);
			se.verify().verifyEquals("GLMiscellaneousCoverages Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
			}
			
			if((strGLMiscellaneousCoverages_BTN_Details.equalsIgnoreCase("Yes"))){
			se.element().tryClick(getGLMiscellaneousCoverage_BTN_Details(strGLMiscellaneousCoverages_BTN_Details),test);
			se.verify().verifyEquals("GLMiscellaneousCoverages Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
			}
			se.element().selectPopupWithMagnifier(getGLMiscellaneousCoverages_TXT_CoverageDescription(strGLMiscellaneousCoverages_TXT_CoverageDescription), getGLMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon(strGLMiscellaneousCoverages_TXT_CoverageDescription), strGLMiscellaneousCoverages_TXT_CoverageDescription, constants.NA, strGLMiscellaneousCoverages_TXT_CoverageDescription, constants.NA, constants.NA, constants.NA, test);
			
			se.element().enterOrValidateText(getGLMiscellaneousCoverages_TXT_FormNo(strGLMiscellaneousCoverages_TXT_FormNo),strGLMiscellaneousCoverages_TXT_FormNo,test);
			se.element().enterOrValidateText(getGLMiscellaneousCoverages_TXT_FormName(strGLMiscellaneousCoverages_TXT_FormName),strGLMiscellaneousCoverages_TXT_FormName,test);
			
			se.element().enterOrValidateText(getGLMiscellaneousCoverages_TXT_State(strGLMiscellaneousCoverages_TXT_State),strGLMiscellaneousCoverages_TXT_State,test);
			if(!strGLMiscellaneousCoverages_TXT_State.equalsIgnoreCase("N/A") && !strGLMiscellaneousCoverages_TXT_State.contains("validate2")){
				se.element().Click(getGLMiscellaneousCoverages_BTN_StateSearchIcon(), test);
				se.element().clickelement(getGLMiscellaneousCoverages_LNK_StateOption(strGLMiscellaneousCoverages_TXT_State),strGLMiscellaneousCoverages_TXT_State, test);
				
			}else{
			se.element().enterOrValidateText(getGLMiscellaneousCoverages_TXT_State(strGLMiscellaneousCoverages_TXT_State),strGLMiscellaneousCoverages_TXT_State,test);
			}
			
			se.element().enterOrValidateText(getGLMiscellaneousCoverages_TXT_ClassCode(strGLMiscellaneousCoverages_TXT_ClassCode),strGLMiscellaneousCoverages_TXT_ClassCode,test);
			se.element().enterOrValidateText(getGLMiscellaneousCoverages_TXT_SublineCode(strGLMiscellaneousCoverages_TXT_SublineCode),strGLMiscellaneousCoverages_TXT_SublineCode,test);
			se.element().enterOrValidateText(getGLMiscellaneousCoverages_TXT_AnnualPremium(strGLMiscellaneousCoverages_TXT_AnnualPremium),strGLMiscellaneousCoverages_TXT_AnnualPremium,test);
			se.element().checkUncheckOrValidate(getGLMiscellaneousCoverages_CHK_PremiumChargeTypeProRata(strGLMiscellaneousCoverages_CHK_PremiumChargeTypeProRata),strGLMiscellaneousCoverages_CHK_PremiumChargeTypeProRata,test);
			se.element().checkUncheckOrValidate(getGLMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge(strGLMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge),strGLMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge,test);
			se.element().checkUncheckOrValidate(getGLMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned(strGLMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned),strGLMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned,test);
			se.element().enterOrValidateText(getGLMiscellaneousCoverages_TXT_Description(strGLMiscellaneousCoverages_TXT_Description),strGLMiscellaneousCoverages_TXT_Description,test);
			se.element().enterOrValidateText(getGLMiscellaneousCoverages_TXT_LocationNo(strGLMiscellaneousCoverages_TXT_LocationNo),strGLMiscellaneousCoverages_TXT_LocationNo,test);
			se.element().enterOrValidateText(getGLMiscellaneousCoverages_TXT_BuildingNo(strGLMiscellaneousCoverages_TXT_BuildingNo),strGLMiscellaneousCoverages_TXT_BuildingNo,test);
			if(!strGLMiscellaneousCoverages_TXT_JurisdictionDescription.equalsIgnoreCase("N/A") && !strGLMiscellaneousCoverages_TXT_JurisdictionDescription.contains("validate2")){
				se.element().Click(getGLMiscellaneousCoverages_BTN_JurisdictionDescriptionSearchIcon(strGLMiscellaneousCoverages_TXT_JurisdictionDescription), test);
				se.element().enterOrValidateText(getGLMiscellaneousCoverages_TXT_Popup_JurisdictionDescriptionSearch(strGLMiscellaneousCoverages_TXT_JurisdictionDescription),strGLMiscellaneousCoverages_TXT_JurisdictionDescription,test);
				se.element().Click(getPopupBTNSearchIcon(), test);
				se.element().clickelement(getGLMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption(strGLMiscellaneousCoverages_TXT_JurisdictionDescription),strGLMiscellaneousCoverages_TXT_JurisdictionDescription, test);
			}else{
			se.element().enterOrValidateText(getGLMiscellaneousCoverages_TXT_JurisdictionDescription(strGLMiscellaneousCoverages_TXT_JurisdictionDescription),strGLMiscellaneousCoverages_TXT_JurisdictionDescription,test);
			}
			se.element().enterOrValidateText(getGLMiscellaneousCoverages_TXT_FPDCode(strGLMiscellaneousCoverages_TXT_FPDCode),strGLMiscellaneousCoverages_TXT_FPDCode,test);
			se.element().enterOrValidateText(getGLMiscellaneousCoverages_TXT_FireProtectionDistrict(strGLMiscellaneousCoverages_TXT_FireProtectionDistrict),strGLMiscellaneousCoverages_TXT_FireProtectionDistrict,test);
			se.element().checkUncheckOrValidate(getGLMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes(strGLMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes),strGLMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes,test);
			se.element().checkUncheckOrValidate(getGLMiscellaneousCoverages_CHK_AllCityName(strGLMiscellaneousCoverages_CHK_AllCityName),strGLMiscellaneousCoverages_CHK_AllCityName,test);
			se.element().enterOrValidateText(getGLMiscellaneousCoverages_TXT_City(strGLMiscellaneousCoverages_TXT_City),strGLMiscellaneousCoverages_TXT_City,test);
			se.element().enterOrValidateText(getGLMiscellaneousCoverages_TXT_CityCode(strGLMiscellaneousCoverages_TXT_CityCode),strGLMiscellaneousCoverages_TXT_CityCode,test);
			se.element().enterOrValidateText(getGLMiscellaneousCoverages_TXT_County(strGLMiscellaneousCoverages_TXT_County),strGLMiscellaneousCoverages_TXT_County,test);
			se.element().enterOrValidateText(getGLMiscellaneousCoverages_TXT_CountyCode(strGLMiscellaneousCoverages_TXT_CountyCode),strGLMiscellaneousCoverages_TXT_CountyCode,test);
			se.element().enterOrValidateText(getGLMiscellaneousCoverages_TXT_TaxCode(strGLMiscellaneousCoverages_TXT_TaxCode),strGLMiscellaneousCoverages_TXT_TaxCode,test);
			
			
				se.element().Click(getNext(),test);
					
					if((strGLMiscellaneousCoverages_BTN_Done.equalsIgnoreCase("Yes"))){
						
						se.element().Click(getDone(),test);
					}

				} catch (Exception e) {
					se.verify().verifyEquals("Failed to fill in details GLMiscellaneousCoverage ", true, false, true,
							test);
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
