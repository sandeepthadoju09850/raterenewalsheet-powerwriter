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

public class Crime_SecuraManuscript extends OR_Crime {
	
	public void CP_CrimeSecuraManuscript(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("Crime_SecuraManuscript")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("Crime_SecuraManuscript", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		
		String strCrimeSecuraManuscript_BTN_Done = (String) row.get("CrimeSecuraManuscript_BTN_Done");
		Crime_SecuraManuscript CrimeSecuraManuscript = TestPageFactory.initElements(se, Crime_SecuraManuscript.class);
			try{
				se.log().logTestStep("CrimeSecuraManuscript");
				test.log(LogStatus.INFO, "CrimeSecuraManuscript","Transaction Step : " + transaction + "<br>" + "Page : CrimeSecuraManuscript");
				se.verify().verifyEquals("CrimeSecuraManuscript Page of PowerWriter ", getCrimeSecuraManuscript_LBL_SecuraManuscript("CrimeSecuraManuscript").isDisplayed(),true, true,test);
				
				CrimeSecuraManuscript.CP_CrimeSecuraManuscriptGenInfo(row,test);
				CrimeSecuraManuscript.CP_CrimeSecuraManuscriptTaxInfo(row,test);
				
				se.element().Click(getNext(),test);
						
						if((strCrimeSecuraManuscript_BTN_Done=="Yes")){
							
							se.element().Click(getDone(),test);
						}

			}catch(Exception e){
				se.verify().verifyEquals("Failed to fill in details for CrimeSecuraManuscript ", true, false, true, test);
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

public void CP_CrimeSecuraManuscriptGenInfo(Map<String, String> row, ExtentTest test) throws IOException {
	
	
	String strCrimeSecuraManuscript_BTN_ADD = (String) row.get("CrimeSecuraManuscript_BTN_ADD");
	String strCrimeSecuraManuscript_BTN_Details = (String) row.get("CrimeSecuraManuscript_BTN_Details");
	String strCrimeSecuraManuscript_TXT_State = (String) row.get("CrimeSecuraManuscript_TXT_State");
	String strCrimeSecuraManuscript_TXT_Form = (String) row.get("CrimeSecuraManuscript_TXT_Form");
	String strCrimeSecuraManuscript_TXT_LocationNo = (String) row.get("CrimeSecuraManuscript_TXT_LocationNo");
	String strCrimeSecuraManuscript_TXT_Name = (String) row.get("CrimeSecuraManuscript_TXT_Name");
	String strCrimeSecuraManuscript_TXT_Description = (String) row.get("CrimeSecuraManuscript_TXT_Description");
	String strCrimeSecuraManuscript_TXT_Street = (String) row.get("CrimeSecuraManuscript_TXT_Street");
	String strCrimeSecuraManuscript_TXT_SteUnit = (String) row.get("CrimeSecuraManuscript_TXT_SteUnit");
	String strCrimeSecuraManuscript_TXT_City = (String) row.get("CrimeSecuraManuscript_TXT_City");
	String strCrimeSecuraManuscript_DDN_StateCode = (String) row.get("CrimeSecuraManuscript_DDN_StateCode");
	String strCrimeSecuraManuscript_TXT_Zip = (String) row.get("CrimeSecuraManuscript_TXT_Zip");
	String strCrimeSecuraManuscript_CHK_AllLocations = (String) row.get("CrimeSecuraManuscript_CHK_AllLocations");
	String strCrimeSecuraManuscript_TXT_Description1 = (String) row.get("CrimeSecuraManuscript_TXT_Description1");
	String strCrimeSecuraManuscript_CHK_Edit = (String) row.get("CrimeSecuraManuscript_CHK_Edit");
	String strCrimeSecuraManuscript_TXT_ClassCode = (String) row.get("CrimeSecuraManuscript_TXT_ClassCode");
	String strCrimeSecuraManuscript_TXT_CoverageCode = (String) row.get("CrimeSecuraManuscript_TXT_CoverageCode");
	String strCrimeSecuraManuscript_TXT_CoverageCodeFilterNeeded = (String) row.get("CrimeSecuraManuscript_TXT_CoverageCodeFilterNeeded");
	String strCrimeSecuraManuscript_TXT_CrimeCoverageCodeDesc = (String) row.get("CrimeSecuraManuscript_TXT_CrimeCoverageCodeDesc");
	String strCrimeSecuraManuscript_TXT_AmendmentCode = (String) row.get("CrimeSecuraManuscript_TXT_AmendmentCode");
	String CrimeSecuraManuscript_TXT_AmendmentCodeFilterNeeded = (String) row.get("CrimeSecuraManuscript_TXT_AmendmentCodeFilterNeeded");
	String strCrimeSecuraManuscript_TXT_AmendmentCodeDesc = (String) row.get("CrimeSecuraManuscript_TXT_AmendmentCodeDesc");
	String strCrimeSecuraManuscript_TXT_AnnualPremium = (String) row.get("CrimeSecuraManuscript_TXT_AnnualPremium");
	String strCrimeSecuraManuscript_CHK_PremiumChargeTypeFlatCharge = (String) row.get("CrimeSecuraManuscript_CHK_PremiumChargeTypeFlatCharge");
	String strCrimeSecuraManuscript_CHK_PremiumChargeTypeFullyEarned = (String) row.get("CrimeSecuraManuscript_CHK_PremiumChargeTypeFullyEarned");
	String strCrimeSecuraManuscript_CHK_PremiumChargeTypeProRata = (String) row.get("CrimeSecuraManuscript_CHK_PremiumChargeTypeProRata");
		try{
				if((strCrimeSecuraManuscript_BTN_ADD.equalsIgnoreCase("Yes"))){
			se.element().Click(getCrimeSecuraManuscript_BTN_ADD(strCrimeSecuraManuscript_BTN_ADD),test);
			se.verify().verifyEquals("CrimeSecuraManuscript Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
			}
			if((strCrimeSecuraManuscript_BTN_Details.equalsIgnoreCase("Yes"))){
			se.element().tryClick(getCrimeSecuraManuscript_BTN_Details(strCrimeSecuraManuscript_BTN_Details),test);
			se.verify().verifyEquals("CrimeSecuraManuscript Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
			}
			
			
			se.element().enterOrValidateText(getCrimeSecuraManuscript_TXT_State(strCrimeSecuraManuscript_TXT_State),strCrimeSecuraManuscript_TXT_State,test);
			//se.element().enterOrValidateText(getCrimeSecuraManuscript_TXT_Form(strCrimeSecuraManuscript_TXT_Form),strCrimeSecuraManuscript_TXT_Form,test);
			
			se.element().selectPopupWithMagnifier(getCrimeSecuraManuscript_TXT_Form(strCrimeSecuraManuscript_TXT_Form), getCrimeSecuraManuscript_BTN_FormSearch(strCrimeSecuraManuscript_TXT_Form), strCrimeSecuraManuscript_TXT_Form, constants.NA, strCrimeSecuraManuscript_TXT_Form, constants.NA, constants.NA, constants.NA, test);
			
			//se.element().enterOrValidateText(getCrimeSecuraManuscript_TXT_LocationNo(strCrimeSecuraManuscript_TXT_LocationNo),strCrimeSecuraManuscript_TXT_LocationNo,test);
			
			se.element().selectPopupWithMagnifier(getCrimeSecuraManuscript_TXT_LocationNo(strCrimeSecuraManuscript_TXT_LocationNo), getCrimeSecuraManuscript_BTN_LocationNoSearch(strCrimeSecuraManuscript_TXT_LocationNo), strCrimeSecuraManuscript_TXT_LocationNo, constants.NA, strCrimeSecuraManuscript_TXT_LocationNo, constants.NA, constants.NA, constants.NA, test);
			
			se.element().enterOrValidateText(getCrimeSecuraManuscript_TXT_Name(strCrimeSecuraManuscript_TXT_Name),strCrimeSecuraManuscript_TXT_Name,test);
			se.element().enterOrValidateText(getCrimeSecuraManuscript_TXT_Description(strCrimeSecuraManuscript_TXT_Description),strCrimeSecuraManuscript_TXT_Description,test);
			se.element().enterOrValidateText(getCrimeSecuraManuscript_TXT_Street(strCrimeSecuraManuscript_TXT_Street),strCrimeSecuraManuscript_TXT_Street,test);
			se.element().enterOrValidateText(getCrimeSecuraManuscript_TXT_SteUnit(strCrimeSecuraManuscript_TXT_SteUnit),strCrimeSecuraManuscript_TXT_SteUnit,test);
			se.element().enterOrValidateText(getCrimeSecuraManuscript_TXT_City(strCrimeSecuraManuscript_TXT_City),strCrimeSecuraManuscript_TXT_City,test);
			se.element().selectElementDDrOrValidateText(getCrimeSecuraManuscript_DDN_StateCode(strCrimeSecuraManuscript_DDN_StateCode),strCrimeSecuraManuscript_DDN_StateCode,test);
			se.element().enterOrValidateText(getCrimeSecuraManuscript_TXT_Zip(strCrimeSecuraManuscript_TXT_Zip),strCrimeSecuraManuscript_TXT_Zip,test);
			se.element().checkUncheckOrValidate(getCrimeSecuraManuscript_CHK_AllLocations(strCrimeSecuraManuscript_CHK_AllLocations),strCrimeSecuraManuscript_CHK_AllLocations,test);
			se.element().enter_textRich(getCrimeSecuraManuscript_TXT_Description1(strCrimeSecuraManuscript_TXT_Description1),strCrimeSecuraManuscript_TXT_Description1,test);
			se.element().checkUncheckOrValidate(getCrimeSecuraManuscript_CHK_Edit(strCrimeSecuraManuscript_CHK_Edit),strCrimeSecuraManuscript_CHK_Edit,test);
			se.element().enterOrValidateText(getCrimeSecuraManuscript_TXT_ClassCode(strCrimeSecuraManuscript_TXT_ClassCode),strCrimeSecuraManuscript_TXT_ClassCode,test);
			//se.element().enterOrValidateText(getCrimeSecuraManuscript_TXT_CoverageCode(strCrimeSecuraManuscript_TXT_CoverageCode),strCrimeSecuraManuscript_TXT_CoverageCode,test);
			se.element().selectPopupWithMagnifier(getCrimeSecuraManuscript_TXT_CoverageCode(strCrimeSecuraManuscript_TXT_CoverageCode), getCrimeSecuraManuscript_TXT_CoverageCodeSearch(strCrimeSecuraManuscript_TXT_CoverageCode), strCrimeSecuraManuscript_TXT_CoverageCode, strCrimeSecuraManuscript_TXT_CoverageCodeFilterNeeded, strCrimeSecuraManuscript_TXT_CoverageCode, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCrimeSecuraManuscript_TXT_CrimeCoveergaeCodeDesc(strCrimeSecuraManuscript_TXT_CrimeCoverageCodeDesc),strCrimeSecuraManuscript_TXT_CrimeCoverageCodeDesc,test);
			
			//se.element().enterOrValidateText(getCrimeSecuraManuscript_TXT_AmendmentCode(strCrimeSecuraManuscript_TXT_AmendmentCode),strCrimeSecuraManuscript_TXT_AmendmentCode,test);
			se.element().selectPopupWithMagnifier(getCrimeSecuraManuscript_TXT_AmendmentCode(strCrimeSecuraManuscript_TXT_AmendmentCode), getCrimeSecuraManuscript_TXT_AmendmentCodeSearch(strCrimeSecuraManuscript_TXT_AmendmentCode), strCrimeSecuraManuscript_TXT_AmendmentCode, CrimeSecuraManuscript_TXT_AmendmentCodeFilterNeeded, strCrimeSecuraManuscript_TXT_AmendmentCode,constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCrimeSecuraManuscript_TXT_AmendmentCodeDesc(strCrimeSecuraManuscript_TXT_AmendmentCodeDesc),strCrimeSecuraManuscript_TXT_AmendmentCodeDesc,test);
			se.element().enterOrValidateText(getCrimeSecuraManuscript_TXT_AnnualPremium(strCrimeSecuraManuscript_TXT_AnnualPremium),strCrimeSecuraManuscript_TXT_AnnualPremium,test);
			se.element().checkUncheckOrValidate(getCrimeSecuraManuscript_CHK_PremiumChargeTypeFlatCharge(strCrimeSecuraManuscript_CHK_PremiumChargeTypeFlatCharge),strCrimeSecuraManuscript_CHK_PremiumChargeTypeFlatCharge,test);
			se.element().checkUncheckOrValidate(getCrimeSecuraManuscript_CHK_PremiumChargeTypeFullyEarned(strCrimeSecuraManuscript_CHK_PremiumChargeTypeFullyEarned),strCrimeSecuraManuscript_CHK_PremiumChargeTypeFullyEarned,test);
			se.element().checkUncheckOrValidate(getCrimeSecuraManuscript_CHK_PremiumChargeTypeProRata(strCrimeSecuraManuscript_CHK_PremiumChargeTypeProRata),strCrimeSecuraManuscript_CHK_PremiumChargeTypeProRata,test);
			
	
}catch(Exception e){
	se.verify().verifyEquals("Failed to fill in details for CrimeSecuraManuscriptGenInfo ", true, false, true, test);
			
		}

}

public void CP_CrimeSecuraManuscriptTaxInfo(Map<String, String> row, ExtentTest test) throws IOException {
	
	
	
	String strCrimeSecuraManuscript_TXT_JurisdictionDescription = (String) row.get("CrimeSecuraManuscript_TXT_JurisdictionDescription");
	String strCrimeSecuraManuscript_TXT_FPDCode = (String) row.get("CrimeSecuraManuscript_TXT_FPDCode");
	String strCrimeSecuraManuscript_TXT_FireProtectionDistrict = (String) row.get("CrimeSecuraManuscript_TXT_FireProtectionDistrict");
	String strCrimeSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes = (String) row.get("CrimeSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes");
	String strCrimeSecuraManuscript_CHK_AllCityName = (String) row.get("CrimeSecuraManuscript_CHK_AllCityName");
	String strCrimeSecuraManuscript_TXT_KYTaxCity = (String) row.get("CrimeSecuraManuscript_TXT_KYTaxCity");
	String strCrimeSecuraManuscript_TXT_CityCode = (String) row.get("CrimeSecuraManuscript_TXT_CityCode");
	String strCrimeSecuraManuscript_TXT_County = (String) row.get("CrimeSecuraManuscript_TXT_County");
	String strCrimeSecuraManuscript_TXT_CountyCode = (String) row.get("CrimeSecuraManuscript_TXT_CountyCode");
	String strCrimeSecuraManuscript_TXT_TaxCode = (String) row.get("CrimeSecuraManuscript_TXT_TaxCode");
		try{
			if(!strCrimeSecuraManuscript_TXT_JurisdictionDescription.equalsIgnoreCase("N/A") && !strCrimeSecuraManuscript_TXT_JurisdictionDescription.contains("validate2")){
				se.element().clickSearchIcon(getCrimeSecuraManuscript_BTN_JurisdictionDescriptionSearch(strCrimeSecuraManuscript_TXT_JurisdictionDescription), test);
				se.element().enterOrValidateText(getCrimeSecuraManuscript_TXT_Popup_JurisdictionDescriptionSearch(strCrimeSecuraManuscript_TXT_JurisdictionDescription),strCrimeSecuraManuscript_TXT_JurisdictionDescription,test);
				se.element().Click(getPopupBTNSearchIcon(), test);
				se.element().Click(getCrimeSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption(strCrimeSecuraManuscript_TXT_JurisdictionDescription), test);
			}else{
			se.element().enterOrValidateText(getCrimeSecuraManuscript_TXT_JurisdictionDescription(strCrimeSecuraManuscript_TXT_JurisdictionDescription),strCrimeSecuraManuscript_TXT_JurisdictionDescription,test);
			}
			se.element().enterOrValidateText(getCrimeSecuraManuscript_TXT_FPDCode(strCrimeSecuraManuscript_TXT_FPDCode),strCrimeSecuraManuscript_TXT_FPDCode,test);
			se.element().enterOrValidateText(getCrimeSecuraManuscript_TXT_FireProtectionDistrict(strCrimeSecuraManuscript_TXT_FireProtectionDistrict),strCrimeSecuraManuscript_TXT_FireProtectionDistrict,test);
			se.element().checkUncheckOrValidate(getCrimeSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes(strCrimeSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes),strCrimeSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes,test);
			se.element().checkUncheckOrValidate(getCrimeSecuraManuscript_CHK_AllCityName(strCrimeSecuraManuscript_CHK_AllCityName),strCrimeSecuraManuscript_CHK_AllCityName,test);
			se.element().enterOrValidateText(getCrimeSecuraManuscript_TXT_KYTaxCity(strCrimeSecuraManuscript_TXT_KYTaxCity),strCrimeSecuraManuscript_TXT_KYTaxCity,test);
			se.element().enterOrValidateText(getCrimeSecuraManuscript_TXT_CityCode(strCrimeSecuraManuscript_TXT_CityCode),strCrimeSecuraManuscript_TXT_CityCode,test);
			se.element().enterOrValidateText(getCrimeSecuraManuscript_TXT_County(strCrimeSecuraManuscript_TXT_County),strCrimeSecuraManuscript_TXT_County,test);
			se.element().enterOrValidateText(getCrimeSecuraManuscript_TXT_CountyCode(strCrimeSecuraManuscript_TXT_CountyCode),strCrimeSecuraManuscript_TXT_CountyCode,test);
			se.element().enterOrValidateText(getCrimeSecuraManuscript_TXT_TaxCode(strCrimeSecuraManuscript_TXT_TaxCode),strCrimeSecuraManuscript_TXT_TaxCode,test);
			
	
}catch(Exception e){
	se.verify().verifyEquals("Failed to fill in details for CrimeSecuraManuscriptTaxInfo ", true, false, true, test);
			
		}

}
	
}
