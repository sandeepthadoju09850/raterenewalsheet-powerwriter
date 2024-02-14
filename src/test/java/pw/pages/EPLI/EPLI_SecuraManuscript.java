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

public class EPLI_SecuraManuscript extends OR_EmpPractices {
	

public void CP_EmpPracticesSecuraManuscriptGenInfo(Map<String, String> row, ExtentTest test) throws IOException {

	
	String strEmpPracticesSecuraManuscript_BTN_ADD = (String) row.get("EmpPracticesSecuraManuscript_BTN_ADD");
	String strEmpPracticesSecuraManuscript_BTN_Details = (String) row.get("EmpPracticesSecuraManuscript_BTN_Details");
	String strEmpPracticesSecuraManuscript_TXT_State = (String) row.get("EmpPracticesSecuraManuscript_TXT_State");
	String strEmpPracticesSecuraManuscript_TXT_Form = (String) row.get("EmpPracticesSecuraManuscript_TXT_Form");
	String strEmpPracticesSecuraManuscript_TXT_LocationNo = (String) row.get("EmpPracticesSecuraManuscript_TXT_LocationNo");
	String strEmpPracticesSecuraManuscript_TXT_Name = (String) row.get("EmpPracticesSecuraManuscript_TXT_Name");
	String strEmpPracticesSecuraManuscript_TXT_Description = (String) row.get("EmpPracticesSecuraManuscript_TXT_Description");
	String strEmpPracticesSecuraManuscript_TXT_Street = (String) row.get("EmpPracticesSecuraManuscript_TXT_Street");
	String strEmpPracticesSecuraManuscript_TXT_SteUnit = (String) row.get("EmpPracticesSecuraManuscript_TXT_SteUnit");
	String strEmpPracticesSecuraManuscript_TXT_City = (String) row.get("EmpPracticesSecuraManuscript_TXT_City");
	String strEmpPracticesSecuraManuscript_DDN_StateCode = (String) row.get("EmpPracticesSecuraManuscript_DDN_StateCode");
	String strEmpPracticesSecuraManuscript_TXT_Zip = (String) row.get("EmpPracticesSecuraManuscript_TXT_Zip");
	String strEmpPracticesSecuraManuscript_CHK_AllLocations = (String) row.get("EmpPracticesSecuraManuscript_CHK_AllLocations");
	String strEmpPracticesSecuraManuscript_TXT_Description1 = (String) row.get("EmpPracticesSecuraManuscript_TXT_Description1");
	String strEmpPracticesSecuraManuscript_CHK_Edit = (String) row.get("EmpPracticesSecuraManuscript_CHK_Edit");
	String strEmpPracticesSecuraManuscript_TXT_ClassCode = (String) row.get("EmpPracticesSecuraManuscript_TXT_ClassCode");
	String strEmpPracticesSecuraManuscript_TXT_SublineCode = (String) row.get("EmpPracticesSecuraManuscript_TXT_SublineCode");
	String strEmpPracticesSecuraManuscript_TXT_AnnualPremium = (String) row.get("EmpPracticesSecuraManuscript_TXT_AnnualPremium");
	String strEmpPracticesSecuraManuscript_CHK_PremiumChargeTypeFlatCharge = (String) row.get("EmpPracticesSecuraManuscript_CHK_PremiumChargeTypeFlatCharge");
	String strEmpPracticesSecuraManuscript_CHK_PremiumChargeTypeFullyEarned = (String) row.get("EmpPracticesSecuraManuscript_CHK_PremiumChargeTypeFullyEarned");
	String strEmpPracticesSecuraManuscript_CHK_PremiumChargeTypeProRata = (String) row.get("EmpPracticesSecuraManuscript_CHK_PremiumChargeTypeProRata");
		try{
			
			if((strEmpPracticesSecuraManuscript_BTN_ADD.equalsIgnoreCase("Yes"))){
			se.element().Click(getEmpPracticesSecuraManuscript_BTN_ADD(strEmpPracticesSecuraManuscript_BTN_ADD),test);
			se.verify().verifyEquals("EmpPracticesSecuraManuscript Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
			}
			if((strEmpPracticesSecuraManuscript_BTN_Details.equalsIgnoreCase("Yes"))){
			se.element().tryClick(getEmpPracticesSecuraManuscript_BTN_Details(strEmpPracticesSecuraManuscript_BTN_Details),test);
			se.verify().verifyEquals("EmpPracticesSecuraManuscript Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
			}
			se.element().selectPopupWithMagnifier(getEmpPracticesSecuraManuscript_TXT_State(strEmpPracticesSecuraManuscript_TXT_State), getEmpPracticesSecuraManuscript_TXT_State_Search(strEmpPracticesSecuraManuscript_TXT_State), strEmpPracticesSecuraManuscript_TXT_State, constants.NA, strEmpPracticesSecuraManuscript_TXT_State, constants.NA, constants.NA, constants.NA, test);
			se.element().selectPopupWithMagnifier(getEmpPracticesSecuraManuscript_TXT_Form(strEmpPracticesSecuraManuscript_TXT_Form), getEmpPracticesSecuraManuscript_TXT_Form_Search(strEmpPracticesSecuraManuscript_TXT_Form), strEmpPracticesSecuraManuscript_TXT_Form, constants.NA, strEmpPracticesSecuraManuscript_TXT_Form, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getEmpPracticesSecuraManuscript_TXT_LocationNo(strEmpPracticesSecuraManuscript_TXT_LocationNo),strEmpPracticesSecuraManuscript_TXT_LocationNo,test);
			se.element().enterOrValidateText(getEmpPracticesSecuraManuscript_TXT_Name(strEmpPracticesSecuraManuscript_TXT_Name),strEmpPracticesSecuraManuscript_TXT_Name,test);
			se.element().enterOrValidateText(getEmpPracticesSecuraManuscript_TXT_Description(strEmpPracticesSecuraManuscript_TXT_Description),strEmpPracticesSecuraManuscript_TXT_Description,test);
			se.element().enterOrValidateText(getEmpPracticesSecuraManuscript_TXT_Street(strEmpPracticesSecuraManuscript_TXT_Street),strEmpPracticesSecuraManuscript_TXT_Street,test);
			se.element().enterOrValidateText(getEmpPracticesSecuraManuscript_TXT_SteUnit(strEmpPracticesSecuraManuscript_TXT_SteUnit),strEmpPracticesSecuraManuscript_TXT_SteUnit,test);
			se.element().enterOrValidateText(getEmpPracticesSecuraManuscript_TXT_City(strEmpPracticesSecuraManuscript_TXT_City),strEmpPracticesSecuraManuscript_TXT_City,test);
			se.element().selectElementDDrOrValidateText(getEmpPracticesSecuraManuscript_DDN_StateCode(strEmpPracticesSecuraManuscript_DDN_StateCode),strEmpPracticesSecuraManuscript_DDN_StateCode,test);
			se.element().enterOrValidateText(getEmpPracticesSecuraManuscript_TXT_Zip(strEmpPracticesSecuraManuscript_TXT_Zip),strEmpPracticesSecuraManuscript_TXT_Zip,test);
			se.element().checkUncheckOrValidate(getEmpPracticesSecuraManuscript_CHK_AllLocations(strEmpPracticesSecuraManuscript_CHK_AllLocations),strEmpPracticesSecuraManuscript_CHK_AllLocations,test);
			se.element().enter_textRich(getEmpPracticesSecuraManuscript_TXT_Description1(strEmpPracticesSecuraManuscript_TXT_Description1),strEmpPracticesSecuraManuscript_TXT_Description1,test);
			se.element().checkUncheckOrValidate(getEmpPracticesSecuraManuscript_CHK_Edit(strEmpPracticesSecuraManuscript_CHK_Edit),strEmpPracticesSecuraManuscript_CHK_Edit,test);
			se.element().enterOrValidateText(getEmpPracticesSecuraManuscript_TXT_ClassCode(strEmpPracticesSecuraManuscript_TXT_ClassCode),strEmpPracticesSecuraManuscript_TXT_ClassCode,test);
			se.element().enterOrValidateText(getEmpPracticesSecuraManuscript_TXT_SublineCode(strEmpPracticesSecuraManuscript_TXT_SublineCode),strEmpPracticesSecuraManuscript_TXT_SublineCode,test);
			se.element().enterOrValidateText(getEmpPracticesSecuraManuscript_TXT_AnnualPremium(strEmpPracticesSecuraManuscript_TXT_AnnualPremium),strEmpPracticesSecuraManuscript_TXT_AnnualPremium,test);
			se.element().checkUncheckOrValidate(getEmpPracticesSecuraManuscript_CHK_PremiumChargeTypeFlatCharge(strEmpPracticesSecuraManuscript_CHK_PremiumChargeTypeFlatCharge),strEmpPracticesSecuraManuscript_CHK_PremiumChargeTypeFlatCharge,test);
			se.element().checkUncheckOrValidate(getEmpPracticesSecuraManuscript_CHK_PremiumChargeTypeFullyEarned(strEmpPracticesSecuraManuscript_CHK_PremiumChargeTypeFullyEarned),strEmpPracticesSecuraManuscript_CHK_PremiumChargeTypeFullyEarned,test);
			se.element().checkUncheckOrValidate(getEmpPracticesSecuraManuscript_CHK_PremiumChargeTypeProRata(strEmpPracticesSecuraManuscript_CHK_PremiumChargeTypeProRata),strEmpPracticesSecuraManuscript_CHK_PremiumChargeTypeProRata,test);
			
	
}catch(Exception e){
	se.verify().verifyEquals("Failed to fill in details for EmpPracticesSecuraManuscriptGenInfo ", true, false, true, test);
			
		}

}
public void CP_EmpPracticesSecuraManuscriptTaxInfo(Map<String, String> row, ExtentTest test) throws IOException {

	String strEmpPracticesSecuraManuscript_TXT_JurisdictionDescription = (String) row.get("EmpPracticesSecuraManuscript_TXT_JurisdictionDescription");
	String strEmpPracticesSecuraManuscript_TXT_FPDCode = (String) row.get("EmpPracticesSecuraManuscript_TXT_FPDCode");
	String strEmpPracticesSecuraManuscript_TXT_FireProtectionDistrict = (String) row.get("EmpPracticesSecuraManuscript_TXT_FireProtectionDistrict");
	String strEmpPracticesSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes = (String) row.get("EmpPracticesSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes");
	String strEmpPracticesSecuraManuscript_CHK_AllCityName = (String) row.get("EmpPracticesSecuraManuscript_CHK_AllCityName");
	String strEmpPracticesSecuraManuscript_TXT_KYTaxCity = (String) row.get("EmpPracticesSecuraManuscript_TXT_KYTaxCity");
	String strEmpPracticesSecuraManuscript_TXT_CityCode = (String) row.get("EmpPracticesSecuraManuscript_TXT_CityCode");
	String strEmpPracticesSecuraManuscript_TXT_County = (String) row.get("EmpPracticesSecuraManuscript_TXT_County");
	String strEmpPracticesSecuraManuscript_TXT_CountyCode = (String) row.get("EmpPracticesSecuraManuscript_TXT_CountyCode");
	String strEmpPracticesSecuraManuscript_TXT_TaxCode = (String) row.get("EmpPracticesSecuraManuscript_TXT_TaxCode");
		try{
		if(!strEmpPracticesSecuraManuscript_TXT_JurisdictionDescription.equalsIgnoreCase("N/A") && !strEmpPracticesSecuraManuscript_TXT_JurisdictionDescription.contains("validate2")){
				se.element().clickSearchIcon(getEmpPracticesSecuraManuscript_BTN_JurisdictionDescriptionSearch(strEmpPracticesSecuraManuscript_TXT_JurisdictionDescription), test);
				se.element().enterOrValidateText(getEmpPracticesSecuraManuscript_TXT_Popup_JurisdictionDescriptionSearch(strEmpPracticesSecuraManuscript_TXT_JurisdictionDescription),strEmpPracticesSecuraManuscript_TXT_JurisdictionDescription,test);
				se.element().Click(getPopupBTNSearchIcon(), test);
				se.element().Click(getEmpPracticesSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption(strEmpPracticesSecuraManuscript_TXT_JurisdictionDescription), test);
			}else{
			se.element().enterOrValidateText(getEmpPracticesSecuraManuscript_TXT_JurisdictionDescription(strEmpPracticesSecuraManuscript_TXT_JurisdictionDescription),strEmpPracticesSecuraManuscript_TXT_JurisdictionDescription,test);
			}
			se.element().enterOrValidateText(getEmpPracticesSecuraManuscript_TXT_FPDCode(strEmpPracticesSecuraManuscript_TXT_FPDCode),strEmpPracticesSecuraManuscript_TXT_FPDCode,test);
			se.element().enterOrValidateText(getEmpPracticesSecuraManuscript_TXT_FireProtectionDistrict(strEmpPracticesSecuraManuscript_TXT_FireProtectionDistrict),strEmpPracticesSecuraManuscript_TXT_FireProtectionDistrict,test);
			se.element().checkUncheckOrValidate(getEmpPracticesSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes(strEmpPracticesSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes),strEmpPracticesSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes,test);
			se.element().checkUncheckOrValidate(getEmpPracticesSecuraManuscript_CHK_AllCityName(strEmpPracticesSecuraManuscript_CHK_AllCityName),strEmpPracticesSecuraManuscript_CHK_AllCityName,test);
			se.element().enterOrValidateText(getEmpPracticesSecuraManuscript_TXT_KYTaxCity(strEmpPracticesSecuraManuscript_TXT_KYTaxCity),strEmpPracticesSecuraManuscript_TXT_KYTaxCity,test);
			se.element().enterOrValidateText(getEmpPracticesSecuraManuscript_TXT_CityCode(strEmpPracticesSecuraManuscript_TXT_CityCode),strEmpPracticesSecuraManuscript_TXT_CityCode,test);
			se.element().enterOrValidateText(getEmpPracticesSecuraManuscript_TXT_County(strEmpPracticesSecuraManuscript_TXT_County),strEmpPracticesSecuraManuscript_TXT_County,test);
			se.element().enterOrValidateText(getEmpPracticesSecuraManuscript_TXT_CountyCode(strEmpPracticesSecuraManuscript_TXT_CountyCode),strEmpPracticesSecuraManuscript_TXT_CountyCode,test);
			se.element().enterOrValidateText(getEmpPracticesSecuraManuscript_TXT_TaxCode(strEmpPracticesSecuraManuscript_TXT_TaxCode),strEmpPracticesSecuraManuscript_TXT_TaxCode,test);
			
	
}catch(Exception e){
	se.verify().verifyEquals("Failed to fill in details for EmpPracticesSecuraManuscriptTaxInfo ", true, false, true, test);
			
		}

}
public void CP_EmpPracticesSecuraManuscript(String strRegressionID, String transaction, ExtentTest test) throws IOException {
	
	try{
	List<Map<String, String>> table = ExcelOperations.getPagesData("EmpPractices_SecuraManuscript", strRegressionID, transaction);
	int iteration = 0;
	while (iteration < table.size()) {
		LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
	String strEmpPracticesSecuraManuscript_BTN_Done = (String) row.get("EmpPracticesSecuraManuscript_BTN_Done");
	
	
		try{
			se.log().logTestStep("EmpPracticesSecuraManuscript");
	
			test.log(LogStatus.INFO, "EmpPracticesSecuraManuscript","Transaction Step : " + transaction + "<br>" + "Page : EmpPracticesSecuraManuscript");
			se.verify().verifyEquals("EmpPracticesSecuraManuscript Page of PowerWriter ", getEmpPracticesSecuraManuscript_LBL_SecuraManuscript("EmpPracticesSecuraManuscript").isDisplayed(),true, true,test);
			CP_EmpPracticesSecuraManuscriptGenInfo(row,test);
			CP_EmpPracticesSecuraManuscriptTaxInfo(row,test);
			
			se.element().Click(getNext(),test);
					
					if((strEmpPracticesSecuraManuscript_BTN_Done=="Yes")){
						
						se.element().Click(getDone(),test);
					}
					
	
	
	
}catch(Exception e){
	se.verify().verifyEquals("Failed to fill in details for EmpPracticesSecuraManuscript ", true, false, true, test);
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
