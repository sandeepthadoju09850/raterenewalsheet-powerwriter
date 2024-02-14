package pw.pages.GL;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.OR.OR_GL;

public class GL_SecuraManuscript extends OR_GL {
	

public void CP_GLSecuraManuscript(String strRegressionID, String transaction, ExtentTest test) throws IOException {
	try{
	
	List<Map<String, String>> table = ExcelOperations.getPagesData("GL_Secura_Manuscript", strRegressionID, transaction);
	int iteration = 0;
	while (iteration < table.size()) {
		LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strGLSecuraManuscript_BTN_ADD = (String) row.get("GLSecuraManuscript_BTN_ADD");
		String strGLSecuraManuscript_BTN_Details = (String) row.get("GLSecuraManuscript_BTN_Details");
		String strGLSecuraManuscript_TXT_State = (String) row.get("GLSecuraManuscript_TXT_State");
		String strGLSecuraManuscript_TXT_Form = (String) row.get("GLSecuraManuscript_TXT_Form");
		String strGLSecuraManuscript_TXT_LocationNo = (String) row.get("GLSecuraManuscript_TXT_LocationNo");
		String strGLSecuraManuscript_TXT_Name = (String) row.get("GLSecuraManuscript_TXT_Name");
		String strGLSecuraManuscript_TXT_Description = (String) row.get("GLSecuraManuscript_TXT_Description");
		String strGLSecuraManuscript_TXT_Street = (String) row.get("GLSecuraManuscript_TXT_Street");
		String strGLSecuraManuscript_TXT_SteUnit = (String) row.get("GLSecuraManuscript_TXT_SteUnit");
		String strGLSecuraManuscript_TXT_City = (String) row.get("GLSecuraManuscript_TXT_City");
		String strGLSecuraManuscript_DDN_StateCode = (String) row.get("GLSecuraManuscript_DDN_StateCode");
		String strGLSecuraManuscript_TXT_Zip = (String) row.get("GLSecuraManuscript_TXT_Zip");
		String strGLSecuraManuscript_CHK_AllLocations = (String) row.get("GLSecuraManuscript_CHK_AllLocations");
		String strGLSecuraManuscript_TXT_Description1 = (String) row.get("GLSecuraManuscript_TXT_Description1");
		String strGLSecuraManuscript_CHK_Edit = (String) row.get("GLSecuraManuscript_CHK_Edit");
		String strGLSecuraManuscript_TXT_ClassCode = (String) row.get("GLSecuraManuscript_TXT_ClassCode");
		String strGLSecuraManuscript_TXT_SublineCode = (String) row.get("GLSecuraManuscript_TXT_SublineCode");
		String strGLSecuraManuscript_TXT_SublineCodeDescription = (String) row.get("GLSecuraManuscript_TXT_SublineCodeDescription");
		String strGLSecuraManuscript_TXT_SublineCodeDesc = (String) row.get("GLSecuraManuscript_TXT_SublineCodeDesc");
		String strGLSecuraManuscript_TXT_AnnualPremium = (String) row.get("GLSecuraManuscript_TXT_AnnualPremium");
		String strGLSecuraManuscript_CHK_PremiumChargeTypeFlatCharge = (String) row.get("GLSecuraManuscript_CHK_PremiumChargeTypeFlatCharge");
		String strGLSecuraManuscript_CHK_PremiumChargeTypeFullyEarned = (String) row.get("GLSecuraManuscript_CHK_PremiumChargeTypeFullyEarned");
		String strGLSecuraManuscript_CHK_PremiumChargeTypeProRata = (String) row.get("GLSecuraManuscript_CHK_PremiumChargeTypeProRata");
		String strGLSecuraManuscript_TXT_JurisdictionDescription = (String) row.get("GLSecuraManuscript_TXT_JurisdictionDescription");
		String strGLSecuraManuscript_TXT_FPDCode = (String) row.get("GLSecuraManuscript_TXT_FPDCode");
		String strGLSecuraManuscript_TXT_FireProtectionDistrict = (String) row.get("GLSecuraManuscript_TXT_FireProtectionDistrict");
		String strGLSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes = (String) row.get("GLSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes");
		String strGLSecuraManuscript_CHK_AllCityName = (String) row.get("GLSecuraManuscript_CHK_AllCityName");
		String strGLSecuraManuscript_TXT_KYTaxCity = (String) row.get("GLSecuraManuscript_TXT_KYTaxCity");
		String strGLSecuraManuscript_TXT_CityCode = (String) row.get("GLSecuraManuscript_TXT_CityCode");
		String strGLSecuraManuscript_TXT_County = (String) row.get("GLSecuraManuscript_TXT_County");
		String strGLSecuraManuscript_TXT_CountyCode = (String) row.get("GLSecuraManuscript_TXT_CountyCode");
		String strGLSecuraManuscript_TXT_TaxCode = (String) row.get("GLSecuraManuscript_TXT_TaxCode");
		String strGLSecuraManuscript_BTN_DONE =  (String) row.get("GLSecuraManuscript_BTN_Done");
		String GLSecuraManuscript_TXT_JurisdictionDescriptionFilterNeeded = (String) row.get("GLSecuraManuscript_TXT_JurisdictionDescriptionFilterNeeded");
		try{
			se.log().logTestStep("GLSecuraManuscript");
			test.log(LogStatus.INFO, "GLSecuraManuscript","Transaction Step : " + transaction + "<br>" + "Page : GLSecuraManuscript");
			se.verify().verifyEquals("GLSecuraManuscript Page of PowerWriter ", getGLSecuraManuscript_LBL_SecuraManuscript("GLSecuraManuscript").isDisplayed(),true, true,test);
			
			
			if((strGLSecuraManuscript_BTN_ADD.equalsIgnoreCase("Yes"))){
			se.element().Click(getGLSecuraManuscript_BTN_ADD(strGLSecuraManuscript_BTN_ADD),test);
			se.verify().verifyEquals("GLSecuraManuscript Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
			}
			if((strGLSecuraManuscript_BTN_Details.equalsIgnoreCase("Yes"))){
			se.element().tryClick(getGLSecuraManuscript_BTN_Details(strGLSecuraManuscript_BTN_Details),test);
			se.verify().verifyEquals("GLSecuraManuscript Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
			}
			se.element().selectPopupWithMagnifier(getGLSecuraManuscript_TXT_State(strGLSecuraManuscript_TXT_State), getGLSecuraManuscript_TXT_StateSearch(strGLSecuraManuscript_TXT_State), strGLSecuraManuscript_TXT_State, "N/A", strGLSecuraManuscript_TXT_State,"N/A", "N/A", "N/A", test);
			se.element().selectPopupWithMagnifier(getGLSecuraManuscript_TXT_Form(strGLSecuraManuscript_TXT_Form), getGLSecuraManuscript_TXT_FormSearch(strGLSecuraManuscript_TXT_Form), strGLSecuraManuscript_TXT_Form, "N/A", strGLSecuraManuscript_TXT_Form,"N/A", "N/A", "N/A", test);
			se.element().enterOrValidateText(getGLSecuraManuscript_TXT_LocationNo(strGLSecuraManuscript_TXT_LocationNo),strGLSecuraManuscript_TXT_LocationNo,test);
			se.element().enterOrValidateText(getGLSecuraManuscript_TXT_Name(strGLSecuraManuscript_TXT_Name),strGLSecuraManuscript_TXT_Name,test);
			se.element().enterOrValidateText(getGLSecuraManuscript_TXT_Description(strGLSecuraManuscript_TXT_Description),strGLSecuraManuscript_TXT_Description,test);
			se.element().enterOrValidateText(getGLSecuraManuscript_TXT_Street(strGLSecuraManuscript_TXT_Street),strGLSecuraManuscript_TXT_Street,test);
			se.element().enterOrValidateText(getGLSecuraManuscript_TXT_SteUnit(strGLSecuraManuscript_TXT_SteUnit),strGLSecuraManuscript_TXT_SteUnit,test);
			se.element().enterOrValidateText(getGLSecuraManuscript_TXT_City(strGLSecuraManuscript_TXT_City),strGLSecuraManuscript_TXT_City,test);
			se.element().selectElementDDrOrValidateText(getGLSecuraManuscript_DDN_StateCode(strGLSecuraManuscript_DDN_StateCode),strGLSecuraManuscript_DDN_StateCode,test);
			se.element().enterOrValidateText(getGLSecuraManuscript_TXT_Zip(strGLSecuraManuscript_TXT_Zip),strGLSecuraManuscript_TXT_Zip,test);
			se.element().checkUncheckOrValidate(getGLSecuraManuscript_CHK_AllLocations(strGLSecuraManuscript_CHK_AllLocations),strGLSecuraManuscript_CHK_AllLocations,test);
			se.util().sleep(3000);
			se.element().checkUncheckOrValidate(getGLSecuraManuscript_CHK_Edit(strGLSecuraManuscript_CHK_Edit),strGLSecuraManuscript_CHK_Edit,test);
			se.element().enterOrValidateText(getGLSecuraManuscript_TXT_ClassCode(strGLSecuraManuscript_TXT_ClassCode),strGLSecuraManuscript_TXT_ClassCode,test);
			se.element().selectPopupWithMagnifier(getGLSecuraManuscript_TXT_SublineCode(strGLSecuraManuscript_TXT_SublineCode), getGLSecuraManuscript_TXT_SublineCodeSearch(strGLSecuraManuscript_TXT_SublineCode), strGLSecuraManuscript_TXT_SublineCode, "N/A", strGLSecuraManuscript_TXT_SublineCode,strGLSecuraManuscript_TXT_SublineCodeDescription, "N/A", "N/A", test);
			se.element().enterOrValidateText(getGLSecuraManuscript_TXT_SublineCodeDesc(strGLSecuraManuscript_TXT_SublineCodeDesc),strGLSecuraManuscript_TXT_SublineCodeDesc,test);
			se.element().enterOrValidateText(getGLSecuraManuscript_TXT_AnnualPremium(strGLSecuraManuscript_TXT_AnnualPremium),strGLSecuraManuscript_TXT_AnnualPremium,test);
			se.element().checkUncheckOrValidate(getGLSecuraManuscript_CHK_PremiumChargeTypeFlatCharge(strGLSecuraManuscript_CHK_PremiumChargeTypeFlatCharge),strGLSecuraManuscript_CHK_PremiumChargeTypeFlatCharge,test);
			se.element().checkUncheckOrValidate(getGLSecuraManuscript_CHK_PremiumChargeTypeFullyEarned(strGLSecuraManuscript_CHK_PremiumChargeTypeFullyEarned),strGLSecuraManuscript_CHK_PremiumChargeTypeFullyEarned,test);
			se.element().checkUncheckOrValidate(getGLSecuraManuscript_CHK_PremiumChargeTypeProRata(strGLSecuraManuscript_CHK_PremiumChargeTypeProRata),strGLSecuraManuscript_CHK_PremiumChargeTypeProRata,test);
			se.element().selectPopupWithMagnifier(getGLSecuraManuscript_TXT_JurisdictionDescription(strGLSecuraManuscript_TXT_JurisdictionDescription), getGLSecuraManuscript_BTN_JurisdictionDescriptionSearchIcon(strGLSecuraManuscript_TXT_JurisdictionDescription), strGLSecuraManuscript_TXT_JurisdictionDescription, GLSecuraManuscript_TXT_JurisdictionDescriptionFilterNeeded, strGLSecuraManuscript_TXT_JurisdictionDescription,"N/A", "N/A", "N/A", test);
			se.element().enterOrValidateText(getGLSecuraManuscript_TXT_FPDCode(strGLSecuraManuscript_TXT_FPDCode),strGLSecuraManuscript_TXT_FPDCode,test);
			se.element().enterOrValidateText(getGLSecuraManuscript_TXT_FireProtectionDistrict(strGLSecuraManuscript_TXT_FireProtectionDistrict),strGLSecuraManuscript_TXT_FireProtectionDistrict,test);
			se.element().checkUncheckOrValidate(getGLSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes(strGLSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes),strGLSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes,test);
			se.element().checkUncheckOrValidate(getGLSecuraManuscript_CHK_AllCityName(strGLSecuraManuscript_CHK_AllCityName),strGLSecuraManuscript_CHK_AllCityName,test);
			se.element().enterOrValidateText(getGLSecuraManuscript_TXT_KYTaxCity(strGLSecuraManuscript_TXT_KYTaxCity),strGLSecuraManuscript_TXT_KYTaxCity,test);
			se.element().enterOrValidateText(getGLSecuraManuscript_TXT_CityCode(strGLSecuraManuscript_TXT_CityCode),strGLSecuraManuscript_TXT_CityCode,test);
			se.element().enterOrValidateText(getGLSecuraManuscript_TXT_County(strGLSecuraManuscript_TXT_County),strGLSecuraManuscript_TXT_County,test);
			se.element().enterOrValidateText(getGLSecuraManuscript_TXT_CountyCode(strGLSecuraManuscript_TXT_CountyCode),strGLSecuraManuscript_TXT_CountyCode,test);
			se.element().enterOrValidateText(getGLSecuraManuscript_TXT_TaxCode(strGLSecuraManuscript_TXT_TaxCode),strGLSecuraManuscript_TXT_TaxCode,test);
			se.element().enter_textRich(getGLSecuraManuscript_TXT_Description1(strGLSecuraManuscript_TXT_Description1),strGLSecuraManuscript_TXT_Description1,test);
			se.element().Click(getNext(),test);
			
			/*if(strRegressionID.equalsIgnoreCase("BP_14") && transaction.equalsIgnoreCase("FlatEndorsement1")) {
				se.element().waitForElementIsDisplayed(CommPackage_BTN_CommercialProperty_YesButton, 10);
				if(se.element().isElementPresent(CommPackage_BTN_CommercialProperty_YesButton)){
					se.element().Click(getCommPackage_BTN_CommercialProperty_YesButton(), test);
				}
				se.element().enter_textRich(getGLSecuraManuscript_TXT_Description1(strGLSecuraManuscript_TXT_Description1),"Adding coverage test",test);
			}*/
			if((strGLSecuraManuscript_BTN_DONE.equalsIgnoreCase("Yes"))){	
				se.element().Click(getDone(),test);
			}

	
	
}catch(Exception e){
	se.verify().verifyEquals("Failed to fill in details for GLSecuraManuscript ", true, false, true, test);
	
	
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
