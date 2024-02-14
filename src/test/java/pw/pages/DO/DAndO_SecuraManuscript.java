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

public class DAndO_SecuraManuscript extends OR_DO {
	

public void CP_DAndOSecuraManuscriptGenInfo(Map<String, String> row, ExtentTest test) throws IOException {
	
	
	String strDAndOSecuraManuscript_BTN_ADD = (String) row.get("DAndOSecuraManuscript_BTN_ADD");
	String strDAndOSecuraManuscript_BTN_Details = (String) row.get("DAndOSecuraManuscript_BTN_Details");
	String strDAndOSecuraManuscript_TXT_State = (String) row.get("DAndOSecuraManuscript_TXT_State");
	String strDAndOSecuraManuscript_TXT_Form = (String) row.get("DAndOSecuraManuscript_TXT_Form");
	String strDAndOSecuraManuscript_TXT_LocationNo = (String) row.get("DAndOSecuraManuscript_TXT_LocationNo");
	String strDAndOSecuraManuscript_TXT_Name = (String) row.get("DAndOSecuraManuscript_TXT_Name");
	String strDAndOSecuraManuscript_TXT_Description = (String) row.get("DAndOSecuraManuscript_TXT_Description");
	String strDAndOSecuraManuscript_TXT_Street = (String) row.get("DAndOSecuraManuscript_TXT_Street");
	String strDAndOSecuraManuscript_TXT_SteUnit = (String) row.get("DAndOSecuraManuscript_TXT_SteUnit");
	String strDAndOSecuraManuscript_TXT_City = (String) row.get("DAndOSecuraManuscript_TXT_City");
	String strDAndOSecuraManuscript_DDN_StateCode = (String) row.get("DAndOSecuraManuscript_DDN_StateCode");
	String strDAndOSecuraManuscript_TXT_Zip = (String) row.get("DAndOSecuraManuscript_TXT_Zip");
	String strDAndOSecuraManuscript_CHK_AllLocations = (String) row.get("DAndOSecuraManuscript_CHK_AllLocations");
	String strDAndOSecuraManuscript_TXT_Description1 = (String) row.get("DAndOSecuraManuscript_TXT_Description1");
	String strDAndOSecuraManuscript_CHK_Edit = (String) row.get("DAndOSecuraManuscript_CHK_Edit");
	String strDAndOSecuraManuscript_TXT_ClassCode = (String) row.get("DAndOSecuraManuscript_TXT_ClassCode");
	String strDAndOSecuraManuscript_TXT_SublineCode = (String) row.get("DAndOSecuraManuscript_TXT_SublineCode");
	String strDAndOSecuraManuscript_TXT_AnnualPremium = (String) row.get("DAndOSecuraManuscript_TXT_AnnualPremium");
	String strDAndOSecuraManuscript_CHK_PremiumChargeTypeFlatCharge = (String) row.get("DAndOSecuraManuscript_CHK_PremiumChargeTypeFlatCharge");
	String strDAndOSecuraManuscript_CHK_PremiumChargeTypeFullyEarned = (String) row.get("DAndOSecuraManuscript_CHK_PremiumChargeTypeFullyEarned");
	String strDAndOSecuraManuscript_CHK_PremiumChargeTypeProRata = (String) row.get("DAndOSecuraManuscript_CHK_PremiumChargeTypeProRata");
		try{
		
			if((strDAndOSecuraManuscript_BTN_ADD.equalsIgnoreCase("Yes"))){
			se.element().Click(getDAndOSecuraManuscript_BTN_ADD(strDAndOSecuraManuscript_BTN_ADD),test);
			se.verify().verifyEquals("DAndOSecuraManuscript Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
			}
			if((strDAndOSecuraManuscript_BTN_Details.equalsIgnoreCase("Yes"))){
			se.element().tryClick(getDAndOSecuraManuscript_BTN_Details(strDAndOSecuraManuscript_BTN_Details),test);
			se.verify().verifyEquals("DAndOSecuraManuscript Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
			}
			se.element().selectPopupWithMagnifier(getDAndOSecuraManuscript_TXT_State(strDAndOSecuraManuscript_TXT_State), getDAndOSecuraManuscript_TXT_State_Search(strDAndOSecuraManuscript_TXT_State), strDAndOSecuraManuscript_TXT_State, constants.NA, strDAndOSecuraManuscript_TXT_State, constants.NA, constants.NA, constants.NA, test);
			se.element().selectPopupWithMagnifier(getDAndOSecuraManuscript_TXT_Form(strDAndOSecuraManuscript_TXT_Form), getDAndOSecuraManuscript_TXT_Form_Search(strDAndOSecuraManuscript_TXT_Form), strDAndOSecuraManuscript_TXT_Form, constants.NA, strDAndOSecuraManuscript_TXT_Form, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getDAndOSecuraManuscript_TXT_LocationNo(strDAndOSecuraManuscript_TXT_LocationNo),strDAndOSecuraManuscript_TXT_LocationNo,test);
			se.element().enterOrValidateText(getDAndOSecuraManuscript_TXT_Name(strDAndOSecuraManuscript_TXT_Name),strDAndOSecuraManuscript_TXT_Name,test);
			se.element().enterOrValidateText(getDAndOSecuraManuscript_TXT_Description(strDAndOSecuraManuscript_TXT_Description),strDAndOSecuraManuscript_TXT_Description,test);
			se.element().enterOrValidateText(getDAndOSecuraManuscript_TXT_Street(strDAndOSecuraManuscript_TXT_Street),strDAndOSecuraManuscript_TXT_Street,test);
			se.element().enterOrValidateText(getDAndOSecuraManuscript_TXT_SteUnit(strDAndOSecuraManuscript_TXT_SteUnit),strDAndOSecuraManuscript_TXT_SteUnit,test);
			se.element().enterOrValidateText(getDAndOSecuraManuscript_TXT_City(strDAndOSecuraManuscript_TXT_City),strDAndOSecuraManuscript_TXT_City,test);
			se.element().selectElementDDrOrValidateText(getDAndOSecuraManuscript_DDN_StateCode(strDAndOSecuraManuscript_DDN_StateCode),strDAndOSecuraManuscript_DDN_StateCode,test);
			se.element().enterOrValidateText(getDAndOSecuraManuscript_TXT_Zip(strDAndOSecuraManuscript_TXT_Zip),strDAndOSecuraManuscript_TXT_Zip,test);
			se.element().checkUncheckOrValidate(getDAndOSecuraManuscript_CHK_AllLocations(strDAndOSecuraManuscript_CHK_AllLocations),strDAndOSecuraManuscript_CHK_AllLocations,test);
			se.element().enter_textRich(getDAndOSecuraManuscript_TXT_Description1(strDAndOSecuraManuscript_TXT_Description1),strDAndOSecuraManuscript_TXT_Description1,test);
			se.element().checkUncheckOrValidate(getDAndOSecuraManuscript_CHK_Edit(strDAndOSecuraManuscript_CHK_Edit),strDAndOSecuraManuscript_CHK_Edit,test);
			se.element().enterOrValidateText(getDAndOSecuraManuscript_TXT_ClassCode(strDAndOSecuraManuscript_TXT_ClassCode),strDAndOSecuraManuscript_TXT_ClassCode,test);
			se.element().enterOrValidateText(getDAndOSecuraManuscript_TXT_SublineCode(strDAndOSecuraManuscript_TXT_SublineCode),strDAndOSecuraManuscript_TXT_SublineCode,test);
			se.element().enterOrValidateText(getDAndOSecuraManuscript_TXT_AnnualPremium(strDAndOSecuraManuscript_TXT_AnnualPremium),strDAndOSecuraManuscript_TXT_AnnualPremium,test);
			se.element().checkUncheckOrValidate(getDAndOSecuraManuscript_CHK_PremiumChargeTypeFlatCharge(strDAndOSecuraManuscript_CHK_PremiumChargeTypeFlatCharge),strDAndOSecuraManuscript_CHK_PremiumChargeTypeFlatCharge,test);
			se.element().checkUncheckOrValidate(getDAndOSecuraManuscript_CHK_PremiumChargeTypeFullyEarned(strDAndOSecuraManuscript_CHK_PremiumChargeTypeFullyEarned),strDAndOSecuraManuscript_CHK_PremiumChargeTypeFullyEarned,test);
			se.element().checkUncheckOrValidate(getDAndOSecuraManuscript_CHK_PremiumChargeTypeProRata(strDAndOSecuraManuscript_CHK_PremiumChargeTypeProRata),strDAndOSecuraManuscript_CHK_PremiumChargeTypeProRata,test);
		
	
}catch(Exception e){
	se.verify().verifyEquals("Failed to fill in details for DAndOSecuraManuscriptGenInfo ", true, false, true, test);	
		}
}

public void CP_DAndOSecuraManuscriptTaxInfo(Map<String, String> row, ExtentTest test) throws IOException {
	
	
	String strDAndOSecuraManuscript_TXT_JurisdictionDescription = (String) row.get("DAndOSecuraManuscript_TXT_JurisdictionDescription");
	String strDAndOSecuraManuscript_TXT_JurisdictionDescription_FilterNeeded = (String) row.get("DAndOSecuraManuscript_TXT_JurisdictionDescription_FilterNeeded");
	String strDAndOSecuraManuscript_TXT_FPDCode = (String) row.get("DAndOSecuraManuscript_TXT_FPDCode");
	String strDAndOSecuraManuscript_TXT_FireProtectionDistrict = (String) row.get("DAndOSecuraManuscript_TXT_FireProtectionDistrict");
	String strDAndOSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes = (String) row.get("DAndOSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes");
	String strDAndOSecuraManuscript_CHK_AllCityName = (String) row.get("DAndOSecuraManuscript_CHK_AllCityName");
	String strDAndOSecuraManuscript_TXT_KYTaxCity = (String) row.get("DAndOSecuraManuscript_TXT_KYTaxCity");
	String strDAndOSecuraManuscript_TXT_KYTaxCity_FilterNeeded = (String) row.get("DAndOSecuraManuscript_TXT_KYTaxCity_FilterNeeded");
	String strDAndOSecuraManuscript_TXT_CityCode = (String) row.get("DAndOSecuraManuscript_TXT_CityCode");
	String strDAndOSecuraManuscript_TXT_County = (String) row.get("DAndOSecuraManuscript_TXT_County");
	String strDAndOSecuraManuscript_TXT_County_FilterNeeded = (String) row.get("DAndOSecuraManuscript_TXT_County_FilterNeeded");
	String strDAndOSecuraManuscript_TXT_CountyCode = (String) row.get("DAndOSecuraManuscript_TXT_CountyCode");
	String strDAndOSecuraManuscript_TXT_TaxCode = (String) row.get("DAndOSecuraManuscript_TXT_TaxCode");
		try{
			se.element().selectPopupWithMagnifier(getDAndOSecuraManuscript_TXT_JurisdictionDescription(strDAndOSecuraManuscript_TXT_JurisdictionDescription), getDAndOSecuraManuscript_BTN_JurisdictionDescriptionSearch(strDAndOSecuraManuscript_TXT_JurisdictionDescription), strDAndOSecuraManuscript_TXT_JurisdictionDescription, strDAndOSecuraManuscript_TXT_JurisdictionDescription_FilterNeeded, strDAndOSecuraManuscript_TXT_JurisdictionDescription, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getDAndOSecuraManuscript_TXT_FPDCode(strDAndOSecuraManuscript_TXT_FPDCode),strDAndOSecuraManuscript_TXT_FPDCode,test);
			se.element().enterOrValidateText(getDAndOSecuraManuscript_TXT_FireProtectionDistrict(strDAndOSecuraManuscript_TXT_FireProtectionDistrict),strDAndOSecuraManuscript_TXT_FireProtectionDistrict,test);
			se.element().checkUncheckOrValidate(getDAndOSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes(strDAndOSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes),strDAndOSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes,test);
			se.element().checkUncheckOrValidate(getDAndOSecuraManuscript_CHK_AllCityName(strDAndOSecuraManuscript_CHK_AllCityName),strDAndOSecuraManuscript_CHK_AllCityName,test);
			se.element().selectPopupWithMagnifier(getDAndOSecuraManuscript_TXT_KYTaxCity(strDAndOSecuraManuscript_TXT_KYTaxCity), getDAndOSecuraManuscript_TXT_KYTaxCity_Search(strDAndOSecuraManuscript_TXT_KYTaxCity), strDAndOSecuraManuscript_TXT_KYTaxCity, strDAndOSecuraManuscript_TXT_KYTaxCity_FilterNeeded, strDAndOSecuraManuscript_TXT_KYTaxCity, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getDAndOSecuraManuscript_TXT_CityCode(strDAndOSecuraManuscript_TXT_CityCode),strDAndOSecuraManuscript_TXT_CityCode,test);
			se.element().selectPopupWithMagnifier(getDAndOSecuraManuscript_TXT_County(strDAndOSecuraManuscript_TXT_County), getDAndOSecuraManuscript_TXT_County_Search(strDAndOSecuraManuscript_TXT_County), strDAndOSecuraManuscript_TXT_County, strDAndOSecuraManuscript_TXT_County_FilterNeeded, strDAndOSecuraManuscript_TXT_County, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getDAndOSecuraManuscript_TXT_CountyCode(strDAndOSecuraManuscript_TXT_CountyCode),strDAndOSecuraManuscript_TXT_CountyCode,test);
			se.element().enterOrValidateText(getDAndOSecuraManuscript_TXT_TaxCode(strDAndOSecuraManuscript_TXT_TaxCode),strDAndOSecuraManuscript_TXT_TaxCode,test);
			
	
	
}catch(Exception e){
	se.verify().verifyEquals("Failed to fill in details for DAndOSecuraManuscriptTaxInfo ", true, false, true, test);
			
		}

}
public void CP_DAndOSecuraManuscript(String strRegressionID, String transaction, ExtentTest test) throws IOException {
	try{
	String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
    if(SuspendSheet.equalsIgnoreCase("D&O_SecuraManuscript")){
         test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
         testTearDown(se, test);
    }

	List<Map<String, String>> table = ExcelOperations.getPagesData("D&O_SecuraManuscript", strRegressionID, transaction);
	int iteration = 0;
	while (iteration < table.size()) {
		LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
	
	String strDAndOSecuraManuscript_BTN_Done = (String) row.get("DAndOSecuraManuscript_BTN_Done");
	DAndO_SecuraManuscript DAndOSecuraManuscript = TestPageFactory.initElements(se, DAndO_SecuraManuscript.class);
	
		try{
			se.log().logTestStep("DAndOSecuraManuscript");
			
			test.log(LogStatus.INFO, "DAndOSecuraManuscript","Transaction Step : " + transaction + "<br>" + "Page : DAndOSecuraManuscript");
			se.verify().verifyEquals("DAndOSecuraManuscript Page of PowerWriter ", getDAndOSecuraManuscript_LBL_SecuraManuscript("DAndOSecuraManuscript").isDisplayed(),true, true,test);
			DAndOSecuraManuscript.CP_DAndOSecuraManuscriptGenInfo(row,test);
			DAndOSecuraManuscript.CP_DAndOSecuraManuscriptTaxInfo(row,test);
			se.element().Click(getNext(),test);
					
					if((strDAndOSecuraManuscript_BTN_Done=="Yes")){
						
						se.element().Click(getDone(),test);
					}
					
		
	
	
}catch(Exception e){
	se.verify().verifyEquals("Failed to fill in details for DAndOSecuraManuscript ", true, false, true, test);
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
