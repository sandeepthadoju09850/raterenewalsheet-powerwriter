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

public class ProfLiab_SecuraManuscript extends OR_ProfLiab {
	
	public void CP_ProfLiabSecuraManuscript(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{

String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
           if(SuspendSheet.equalsIgnoreCase("ProfLiab_SecuraManuscript")){
                test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
                testTearDown(se, test);
           }

		List<Map<String, String>> table = ExcelOperations.getPagesData("ProfLiab_SecuraManuscript", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		
		String strProfLiabSecuraManuscript_BTN_Done = (String) row.get("ProfLiabSecuraManuscript_BTN_Done");

	ProfLiab_SecuraManuscript ProfLiabSecuraManuscript = TestPageFactory.initElements(se, ProfLiab_SecuraManuscript.class);
			try{
				se.log().logTestStep("ProfLiabSecuraManuscript");
				test.log(LogStatus.INFO, "ProfLiabSecuraManuscript","Transaction Step : " + transaction + "<br>" + "Page : ProfLiabSecuraManuscript");
				se.verify().verifyEquals("ProfLiabSecuraManuscript Page of PowerWriter ", getProfLiabSecuraManuscript_LBL_SecuraManuscript("ProfLiabSecuraManuscript").isDisplayed(),true, true,test);
				ProfLiabSecuraManuscript.CP_ProfLiabSecuraManuscriptGenInfo(row,test);
				ProfLiabSecuraManuscript.CP_ProfLiabSecuraManuscriptTaxInfo(row,test);
				se.element().Click(getNext(),test);
						
						if((strProfLiabSecuraManuscript_BTN_Done=="Yes")){
							
							se.element().Click(getDone(),test);
						}
						
		
	}catch(Exception e){
		se.verify().verifyEquals("Failed to fill in details for ProfLiabSecuraManuscript ", true, false, true, test);
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
public void CP_ProfLiabSecuraManuscriptGenInfo(Map<String, String> row, ExtentTest test) throws IOException {
	
	
	String strProfLiabSecuraManuscript_BTN_ADD = (String) row.get("ProfLiabSecuraManuscript_BTN_ADD");
	String strProfLiabSecuraManuscript_BTN_Details = (String) row.get("ProfLiabSecuraManuscript_BTN_Details");
	String strProfLiabSecuraManuscript_TXT_State = (String) row.get("ProfLiabSecuraManuscript_TXT_State");
	String strProfLiabSecuraManuscript_TXT_Form = (String) row.get("ProfLiabSecuraManuscript_TXT_Form");
	String strProfLiabSecuraManuscript_TXT_LocationNo = (String) row.get("ProfLiabSecuraManuscript_TXT_LocationNo");
	String strProfLiabSecuraManuscript_TXT_Name = (String) row.get("ProfLiabSecuraManuscript_TXT_Name");
	String strProfLiabSecuraManuscript_TXT_Description = (String) row.get("ProfLiabSecuraManuscript_TXT_Description");
	String strProfLiabSecuraManuscript_TXT_Street = (String) row.get("ProfLiabSecuraManuscript_TXT_Street");
	String strProfLiabSecuraManuscript_TXT_SteUnit = (String) row.get("ProfLiabSecuraManuscript_TXT_SteUnit");
	String strProfLiabSecuraManuscript_TXT_City = (String) row.get("ProfLiabSecuraManuscript_TXT_City");
	String strProfLiabSecuraManuscript_DDN_StateCode = (String) row.get("ProfLiabSecuraManuscript_DDN_StateCode");
	String strProfLiabSecuraManuscript_TXT_Zip = (String) row.get("ProfLiabSecuraManuscript_TXT_Zip");
	String strProfLiabSecuraManuscript_CHK_AllLocations = (String) row.get("ProfLiabSecuraManuscript_CHK_AllLocations");
	String strProfLiabSecuraManuscript_TXT_Description1 = (String) row.get("ProfLiabSecuraManuscript_TXT_Description1");
	String strProfLiabSecuraManuscript_CHK_Edit = (String) row.get("ProfLiabSecuraManuscript_CHK_Edit");
	String strProfLiabSecuraManuscript_TXT_ClassCode = (String) row.get("ProfLiabSecuraManuscript_TXT_ClassCode");
	String strProfLiabSecuraManuscript_TXT_SublineCode = (String) row.get("ProfLiabSecuraManuscript_TXT_SublineCode");
	String strProfLiabSecuraManuscript_TXT_AnnualPremium = (String) row.get("ProfLiabSecuraManuscript_TXT_AnnualPremium");
	String strProfLiabSecuraManuscript_CHK_PremiumChargeTypeFlatCharge = (String) row.get("ProfLiabSecuraManuscript_CHK_PremiumChargeTypeFlatCharge");
	String strProfLiabSecuraManuscript_CHK_PremiumChargeTypeFullyEarned = (String) row.get("ProfLiabSecuraManuscript_CHK_PremiumChargeTypeFullyEarned");
	String strProfLiabSecuraManuscript_CHK_PremiumChargeTypeProRata = (String) row.get("ProfLiabSecuraManuscript_CHK_PremiumChargeTypeProRata");
		try{
			se.log().logTestStep("ProfLiabSecuraManuscript");
			String transaction = (String) row.get("Transaction");
			test.log(LogStatus.INFO, "ProfLiabSecuraManuscript","Transaction Step : " + transaction + "<br>" + "Page : ProfLiabSecuraManuscript");
			se.verify().verifyEquals("ProfLiabSecuraManuscript Page of PowerWriter ", getProfLiabSecuraManuscript_LBL_SecuraManuscript("ProfLiabSecuraManuscript").isDisplayed(),true, true,test);
			
			if((strProfLiabSecuraManuscript_BTN_ADD.equalsIgnoreCase("Yes"))){
			se.element().Click(getProfLiabSecuraManuscript_BTN_ADD(strProfLiabSecuraManuscript_BTN_ADD),test);
			se.verify().verifyEquals("ProfLiabSecuraManuscript Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
			}
			if((strProfLiabSecuraManuscript_BTN_Details.equalsIgnoreCase("Yes"))){
			se.element().tryClick(getProfLiabSecuraManuscript_BTN_Details(strProfLiabSecuraManuscript_BTN_Details),test);
			se.verify().verifyEquals("ProfLiabSecuraManuscript Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
			}
			
			
			se.element().selectPopupWithMagnifier(getProfLiabSecuraManuscript_TXT_State(strProfLiabSecuraManuscript_TXT_State), getProfLiabSecuraManuscript_TXT_State_Search(strProfLiabSecuraManuscript_TXT_State), strProfLiabSecuraManuscript_TXT_State, constants.NA, strProfLiabSecuraManuscript_TXT_State, constants.NA, constants.NA, constants.NA, test);
			se.element().selectPopupWithMagnifier(getProfLiabSecuraManuscript_TXT_Form(strProfLiabSecuraManuscript_TXT_Form), getProfLiabSecuraManuscript_TXT_Form_Search(strProfLiabSecuraManuscript_TXT_Form), strProfLiabSecuraManuscript_TXT_Form, constants.NA, strProfLiabSecuraManuscript_TXT_Form, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getProfLiabSecuraManuscript_TXT_LocationNo(strProfLiabSecuraManuscript_TXT_LocationNo),strProfLiabSecuraManuscript_TXT_LocationNo,test);
			se.element().enterOrValidateText(getProfLiabSecuraManuscript_TXT_Name(strProfLiabSecuraManuscript_TXT_Name),strProfLiabSecuraManuscript_TXT_Name,test);
			se.element().enterOrValidateText(getProfLiabSecuraManuscript_TXT_Description(strProfLiabSecuraManuscript_TXT_Description),strProfLiabSecuraManuscript_TXT_Description,test);
			se.element().enterOrValidateText(getProfLiabSecuraManuscript_TXT_Street(strProfLiabSecuraManuscript_TXT_Street),strProfLiabSecuraManuscript_TXT_Street,test);
			se.element().enterOrValidateText(getProfLiabSecuraManuscript_TXT_SteUnit(strProfLiabSecuraManuscript_TXT_SteUnit),strProfLiabSecuraManuscript_TXT_SteUnit,test);
			se.element().enterOrValidateText(getProfLiabSecuraManuscript_TXT_City(strProfLiabSecuraManuscript_TXT_City),strProfLiabSecuraManuscript_TXT_City,test);
			se.element().selectElementDDrOrValidateText(getProfLiabSecuraManuscript_DDN_StateCode(strProfLiabSecuraManuscript_DDN_StateCode),strProfLiabSecuraManuscript_DDN_StateCode,test);
			se.element().enterOrValidateText(getProfLiabSecuraManuscript_TXT_Zip(strProfLiabSecuraManuscript_TXT_Zip),strProfLiabSecuraManuscript_TXT_Zip,test);
			se.element().checkUncheckOrValidate(getProfLiabSecuraManuscript_CHK_AllLocations(strProfLiabSecuraManuscript_CHK_AllLocations),strProfLiabSecuraManuscript_CHK_AllLocations,test);
			se.element().enter_textRich(getProfLiabSecuraManuscript_TXT_Description1(strProfLiabSecuraManuscript_TXT_Description1),strProfLiabSecuraManuscript_TXT_Description1,test);
			se.element().checkUncheckOrValidate(getProfLiabSecuraManuscript_CHK_Edit(strProfLiabSecuraManuscript_CHK_Edit),strProfLiabSecuraManuscript_CHK_Edit,test);
			se.element().selectPopupWithMagnifier(getProfLiabSecuraManuscript_TXT_ClassCode(strProfLiabSecuraManuscript_TXT_ClassCode), getProfLiabSecuraManuscript_TXT_ClassCode_Search(strProfLiabSecuraManuscript_TXT_ClassCode), strProfLiabSecuraManuscript_TXT_ClassCode, constants.NA, strProfLiabSecuraManuscript_TXT_ClassCode, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getProfLiabSecuraManuscript_TXT_SublineCode(strProfLiabSecuraManuscript_TXT_SublineCode),strProfLiabSecuraManuscript_TXT_SublineCode,test);
			se.element().enterOrValidateText(getProfLiabSecuraManuscript_TXT_AnnualPremium(strProfLiabSecuraManuscript_TXT_AnnualPremium),strProfLiabSecuraManuscript_TXT_AnnualPremium,test);
			se.element().checkUncheckOrValidate(getProfLiabSecuraManuscript_CHK_PremiumChargeTypeFlatCharge(strProfLiabSecuraManuscript_CHK_PremiumChargeTypeFlatCharge),strProfLiabSecuraManuscript_CHK_PremiumChargeTypeFlatCharge,test);
			se.element().checkUncheckOrValidate(getProfLiabSecuraManuscript_CHK_PremiumChargeTypeFullyEarned(strProfLiabSecuraManuscript_CHK_PremiumChargeTypeFullyEarned),strProfLiabSecuraManuscript_CHK_PremiumChargeTypeFullyEarned,test);
			se.element().checkUncheckOrValidate(getProfLiabSecuraManuscript_CHK_PremiumChargeTypeProRata(strProfLiabSecuraManuscript_CHK_PremiumChargeTypeProRata),strProfLiabSecuraManuscript_CHK_PremiumChargeTypeProRata,test);
			
	
	
}catch(Exception e){
	se.verify().verifyEquals("Failed to fill in details for ProfLiabSecuraManuscriptGenInfo ", true, false, true, test);
			
		}

}
public void CP_ProfLiabSecuraManuscriptTaxInfo(Map<String, String> row, ExtentTest test) throws IOException {
	
	
	
	String strProfLiabSecuraManuscript_TXT_JurisdictionDescription = (String) row.get("ProfLiabSecuraManuscript_TXT_JurisdictionDescription");
	String strProfLiabSecuraManuscript_TXT_FPDCode = (String) row.get("ProfLiabSecuraManuscript_TXT_FPDCode");
	String strProfLiabSecuraManuscript_TXT_FireProtectionDistrict = (String) row.get("ProfLiabSecuraManuscript_TXT_FireProtectionDistrict");
	String strProfLiabSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes = (String) row.get("ProfLiabSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes");
	String strProfLiabSecuraManuscript_CHK_AllCityName = (String) row.get("ProfLiabSecuraManuscript_CHK_AllCityName");
	String strProfLiabSecuraManuscript_TXT_KYTaxCity = (String) row.get("ProfLiabSecuraManuscript_TXT_KYTaxCity");
	String strProfLiabSecuraManuscript_TXT_CityCode = (String) row.get("ProfLiabSecuraManuscript_TXT_CityCode");
	String strProfLiabSecuraManuscript_TXT_County = (String) row.get("ProfLiabSecuraManuscript_TXT_County");
	String strProfLiabSecuraManuscript_TXT_CountyCode = (String) row.get("ProfLiabSecuraManuscript_TXT_CountyCode");
	String strProfLiabSecuraManuscript_TXT_TaxCode = (String) row.get("ProfLiabSecuraManuscript_TXT_TaxCode");
		try{
			if(!strProfLiabSecuraManuscript_TXT_JurisdictionDescription.equalsIgnoreCase("N/A") && !strProfLiabSecuraManuscript_TXT_JurisdictionDescription.contains("validate2")){
				se.element().clickSearchIcon(getProfLiabSecuraManuscript_BTN_JurisdictionDescriptionSearch(strProfLiabSecuraManuscript_TXT_JurisdictionDescription), test);
				se.element().enterOrValidateText(getProfLiabSecuraManuscript_TXT_Popup_JurisdictionDescriptionSearch(strProfLiabSecuraManuscript_TXT_JurisdictionDescription),strProfLiabSecuraManuscript_TXT_JurisdictionDescription,test);
				se.element().Click(getPopupBTNSearchIcon(), test);
				se.element().Click(getProfLiabSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption(strProfLiabSecuraManuscript_TXT_JurisdictionDescription), test);
			}else{
			se.element().enterOrValidateText(getProfLiabSecuraManuscript_TXT_JurisdictionDescription(strProfLiabSecuraManuscript_TXT_JurisdictionDescription),strProfLiabSecuraManuscript_TXT_JurisdictionDescription,test);
			}
			se.element().enterOrValidateText(getProfLiabSecuraManuscript_TXT_FPDCode(strProfLiabSecuraManuscript_TXT_FPDCode),strProfLiabSecuraManuscript_TXT_FPDCode,test);
			se.element().enterOrValidateText(getProfLiabSecuraManuscript_TXT_FireProtectionDistrict(strProfLiabSecuraManuscript_TXT_FireProtectionDistrict),strProfLiabSecuraManuscript_TXT_FireProtectionDistrict,test);
			se.element().checkUncheckOrValidate(getProfLiabSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes(strProfLiabSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes),strProfLiabSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes,test);
			se.element().checkUncheckOrValidate(getProfLiabSecuraManuscript_CHK_AllCityName(strProfLiabSecuraManuscript_CHK_AllCityName),strProfLiabSecuraManuscript_CHK_AllCityName,test);
			se.element().enterOrValidateText(getProfLiabSecuraManuscript_TXT_KYTaxCity(strProfLiabSecuraManuscript_TXT_KYTaxCity),strProfLiabSecuraManuscript_TXT_KYTaxCity,test);
			se.element().enterOrValidateText(getProfLiabSecuraManuscript_TXT_CityCode(strProfLiabSecuraManuscript_TXT_CityCode),strProfLiabSecuraManuscript_TXT_CityCode,test);
			se.element().enterOrValidateText(getProfLiabSecuraManuscript_TXT_County(strProfLiabSecuraManuscript_TXT_County),strProfLiabSecuraManuscript_TXT_County,test);
			se.element().enterOrValidateText(getProfLiabSecuraManuscript_TXT_CountyCode(strProfLiabSecuraManuscript_TXT_CountyCode),strProfLiabSecuraManuscript_TXT_CountyCode,test);
			se.element().enterOrValidateText(getProfLiabSecuraManuscript_TXT_TaxCode(strProfLiabSecuraManuscript_TXT_TaxCode),strProfLiabSecuraManuscript_TXT_TaxCode,test);
			
	
	
}catch(Exception e){
	se.verify().verifyEquals("Failed to fill in details for ProfLiabSecuraManuscriptTaxInfo ", true, false, true, test);
			
		}

}


}
