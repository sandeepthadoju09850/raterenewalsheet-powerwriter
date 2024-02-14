package pw.pages.CIM;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import pw.Constants.constants;
import pw.OR.OR_CIM;

public class CIM_SecuraManuscript extends OR_CIM {
	public void CP_CIMSecuraManuscript(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_SecuraManuscript")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_SecuraManuscript", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCIMSecuraManuscript_BTN_Done = (String) row.get("CIMSecuraManuscript_BTN_Done");
		CIM_SecuraManuscript CIMSecuraManuscript = TestPageFactory.initElements(se, CIM_SecuraManuscript.class);
		
			try{
				se.log().logTestStep("CIMSecuraManuscript");
				test.log(LogStatus.INFO, "CIMSecuraManuscript","Transaction Step : " + transaction + "<br>" + "Page : CIMSecuraManuscript");
				se.verify().verifyEquals("CIMSecuraManuscript Page of PowerWriter ", getCIMSecuraManuscript_LBL_SecuraManuscript("CIMSecuraManuscript").isDisplayed(),true, true,test);
				

				CIMSecuraManuscript.CP_CIMSecuraManuscriptGenInfo(row,test);
				CIMSecuraManuscript.CP_CIMSecuraManuscriptTaxInfo(row,test);
				se.element().Click(getNext(),test);
						
						if((strCIMSecuraManuscript_BTN_Done=="Yes")){
							
							se.element().Click(getDone(),test);
						}
						
			
				}catch(Exception e){
		
					se.verify().verifyEquals("Failed to fill in details for CIMSecuraManuscript ", true, false, true,
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

public void CP_CIMSecuraManuscriptGenInfo(Map<String, String> row, ExtentTest test) throws IOException {
	
	
	String strCIMSecuraManuscript_BTN_ADD = (String) row.get("CIMSecuraManuscript_BTN_ADD");
	String strCIMSecuraManuscript_BTN_Details = (String) row.get("CIMSecuraManuscript_BTN_Details");
	String strCIMSecuraManuscript_TXT_State = (String) row.get("CIMSecuraManuscript_TXT_State");
	String strCIMSecuraManuscript_TXT_Form = (String) row.get("CIMSecuraManuscript_TXT_Form");
	String strCIMSecuraManuscript_TXT_LocationNo = (String) row.get("CIMSecuraManuscript_TXT_LocationNo");
	String strCIMSecuraManuscript_TXT_Name = (String) row.get("CIMSecuraManuscript_TXT_Name");
	String strCIMSecuraManuscript_TXT_Description = (String) row.get("CIMSecuraManuscript_TXT_Description");
	String strCIMSecuraManuscript_TXT_Street = (String) row.get("CIMSecuraManuscript_TXT_Street");
	String strCIMSecuraManuscript_TXT_SteUnit = (String) row.get("CIMSecuraManuscript_TXT_SteUnit");
	String strCIMSecuraManuscript_TXT_City = (String) row.get("CIMSecuraManuscript_TXT_City");
	String strCIMSecuraManuscript_DDN_StateCode = (String) row.get("CIMSecuraManuscript_DDN_StateCode");
	String strCIMSecuraManuscript_TXT_Zip = (String) row.get("CIMSecuraManuscript_TXT_Zip");
	String strCIMSecuraManuscript_CHK_AllLocations = (String) row.get("CIMSecuraManuscript_CHK_AllLocations");
	String strCIMSecuraManuscript_TXT_Description1 = (String) row.get("CIMSecuraManuscript_TXT_Description1");
	String strCIMSecuraManuscript_CHK_Edit = (String) row.get("CIMSecuraManuscript_CHK_Edit");
	String strCIMSecuraManuscript_TXT_NISSCode = (String) row.get("CIMSecuraManuscript_TXT_NISSCode");
	String strCIMSecuraManuscript_TXT_NISSCodeDesc = (String) row.get("CIMSecuraManuscript_TXT_NISSCodeDesc");
	String strCIMSecuraManuscript_TXT_AAISCode = (String) row.get("CIMSecuraManuscript_TXT_AAISCode");
	String strCIMSecuraManuscript_TXT_AnnualPremium = (String) row.get("CIMSecuraManuscript_TXT_AnnualPremium");
	String strCIMSecuraManuscript_CHK_PremiumChargeTypeProRata = (String) row.get("CIMSecuraManuscript_CHK_PremiumChargeTypeProRata");
	String strCIMSecuraManuscript_CHK_PremiumChargeTypeFlatCharge = (String) row.get("CIMSecuraManuscript_CHK_PremiumChargeTypeFlatCharge");
	String strCIMSecuraManuscript_CHK_PremiumChargeTypeFullyEarned = (String) row.get("CIMSecuraManuscript_CHK_PremiumChargeTypeFullyEarned");
	String strCIMSecuraManuscript_TXT_NISSCode_FilterNeeded = (String) row.get("CIMSecuraManuscript_TXT_NISSCode_FilterNeeded");
	String strCIMSecuraManuscript_TXT_NISSCodeDesc_Popup = (String) row.get("CIMSecuraManuscript_TXT_NISSCodeDesc_Popup");
	String strCIMSecuraManuscript_TXT_AAISCode_Popup = (String) row.get("CIMSecuraManuscript_TXT_AAISCode_Popup");
	
	
	try{
			
			if((strCIMSecuraManuscript_BTN_ADD.equalsIgnoreCase("Yes"))){
			se.element().Click(getCIMSecuraManuscript_BTN_ADD(strCIMSecuraManuscript_BTN_ADD),test);
			se.verify().verifyEquals("CIMSecuraManuscript Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
			}
			if((strCIMSecuraManuscript_BTN_Details.equalsIgnoreCase("Yes"))){
			se.element().tryClick(getCIMSecuraManuscript_BTN_Details(strCIMSecuraManuscript_BTN_Details),test);
			se.verify().verifyEquals("CIMSecuraManuscript Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
			}
			
			
			se.element().selectPopupWithMagnifier(getCIMSecuraManuscript_TXT_State(strCIMSecuraManuscript_TXT_State), getCIMSecuraManuscript_TXT_StateSearch(strCIMSecuraManuscript_TXT_State), strCIMSecuraManuscript_TXT_State, constants.NA, strCIMSecuraManuscript_TXT_State, constants.NA, constants.NA, constants.NA, test);
			se.element().selectPopupWithMagnifier(getCIMSecuraManuscript_TXT_Form(strCIMSecuraManuscript_TXT_Form), getCIMSecuraManuscript_TXT_FormSearch(strCIMSecuraManuscript_TXT_State), strCIMSecuraManuscript_TXT_Form, constants.NA, strCIMSecuraManuscript_TXT_Form, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCIMSecuraManuscript_TXT_LocationNo(strCIMSecuraManuscript_TXT_LocationNo),strCIMSecuraManuscript_TXT_LocationNo,test);
			se.element().enterOrValidateText(getCIMSecuraManuscript_TXT_Name(strCIMSecuraManuscript_TXT_Name),strCIMSecuraManuscript_TXT_Name,test);
			se.element().enterOrValidateText(getCIMSecuraManuscript_TXT_Description(strCIMSecuraManuscript_TXT_Description),strCIMSecuraManuscript_TXT_Description,test);
			se.element().enterOrValidateText(getCIMSecuraManuscript_TXT_Street(strCIMSecuraManuscript_TXT_Street),strCIMSecuraManuscript_TXT_Street,test);
			se.element().enterOrValidateText(getCIMSecuraManuscript_TXT_SteUnit(strCIMSecuraManuscript_TXT_SteUnit),strCIMSecuraManuscript_TXT_SteUnit,test);
			se.element().enterOrValidateText(getCIMSecuraManuscript_TXT_City(strCIMSecuraManuscript_TXT_City),strCIMSecuraManuscript_TXT_City,test);
			se.element().selectElementDDrOrValidateText(getCIMSecuraManuscript_DDN_StateCode(strCIMSecuraManuscript_DDN_StateCode),strCIMSecuraManuscript_DDN_StateCode,test);
			se.element().enterOrValidateText(getCIMSecuraManuscript_TXT_Zip(strCIMSecuraManuscript_TXT_Zip),strCIMSecuraManuscript_TXT_Zip,test);
			se.element().checkUncheckOrValidate(getCIMSecuraManuscript_CHK_AllLocations(strCIMSecuraManuscript_CHK_AllLocations),strCIMSecuraManuscript_CHK_AllLocations,test);
			se.element().enter_textRich(getCIMSecuraManuscript_TXT_Description1(strCIMSecuraManuscript_TXT_Description1),strCIMSecuraManuscript_TXT_Description1,test);
			se.element().checkUncheckOrValidate(getCIMSecuraManuscript_CHK_Edit(strCIMSecuraManuscript_CHK_Edit),strCIMSecuraManuscript_CHK_Edit,test);
			se.element().selectPopupWithMagnifier(getCIMSecuraManuscript_TXT_NISSCode(strCIMSecuraManuscript_TXT_NISSCode), getCIMSecuraManuscript_TXT_NISSCodeSearch(strCIMSecuraManuscript_TXT_NISSCode), strCIMSecuraManuscript_TXT_NISSCode, strCIMSecuraManuscript_TXT_NISSCode_FilterNeeded, strCIMSecuraManuscript_TXT_NISSCode, strCIMSecuraManuscript_TXT_NISSCodeDesc_Popup, strCIMSecuraManuscript_TXT_AAISCode_Popup, constants.NA, test);
			se.element().enterOrValidateText(getCIMSecuraManuscript_TXT_NISSCodeDesc(strCIMSecuraManuscript_TXT_NISSCodeDesc),strCIMSecuraManuscript_TXT_NISSCodeDesc,test);
			se.element().enterOrValidateText(getCIMSecuraManuscript_TXT_AAISCode(strCIMSecuraManuscript_TXT_AAISCode),strCIMSecuraManuscript_TXT_AAISCode,test);
			se.element().enterOrValidateText(getCIMSecuraManuscript_TXT_AnnualPremium(strCIMSecuraManuscript_TXT_AnnualPremium),strCIMSecuraManuscript_TXT_AnnualPremium,test);
			se.element().checkUncheckOrValidate(getCIMSecuraManuscript_CHK_PremiumChargeTypeFlatCharge(strCIMSecuraManuscript_CHK_PremiumChargeTypeFlatCharge),strCIMSecuraManuscript_CHK_PremiumChargeTypeFlatCharge,test);
			se.element().checkUncheckOrValidate(getCIMSecuraManuscript_CHK_PremiumChargeTypeFullyEarned(strCIMSecuraManuscript_CHK_PremiumChargeTypeFullyEarned),strCIMSecuraManuscript_CHK_PremiumChargeTypeFullyEarned,test);
			se.element().checkUncheckOrValidate(getCIMSecuraManuscript_CHK_PremiumChargeTypeProRata(strCIMSecuraManuscript_CHK_PremiumChargeTypeProRata),strCIMSecuraManuscript_CHK_PremiumChargeTypeProRata,test);
			
	
	
}catch(Exception e){
	
	se.verify().verifyEquals("Failed to fill in details for CIMSecuraManuscriptGenInfo ", true, false, true, test);
			
		}

}
public void CP_CIMSecuraManuscriptTaxInfo(Map<String, String> row, ExtentTest test) throws IOException {
	
	String strCIMSecuraManuscript_TXT_JurisdictionDescription = (String) row.get("CIMSecuraManuscript_TXT_JurisdictionDescription");
	String strCIMSecuraManuscript_TXT_FPDCode = (String) row.get("CIMSecuraManuscript_TXT_FPDCode");
	String strCIMSecuraManuscript_TXT_FireProtectionDistrict = (String) row.get("CIMSecuraManuscript_TXT_FireProtectionDistrict");
	String strCIMSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes = (String) row.get("CIMSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes");
	String strCIMSecuraManuscript_CHK_AllCityName = (String) row.get("CIMSecuraManuscript_CHK_AllCityName");
	String strCIMSecuraManuscript_TXT_KYTaxCity = (String) row.get("CIMSecuraManuscript_TXT_KYTaxCity");
	String strCIMSecuraManuscript_TXT_CityCode = (String) row.get("CIMSecuraManuscript_TXT_CityCode");
	String strCIMSecuraManuscript_TXT_County = (String) row.get("CIMSecuraManuscript_TXT_County");
	String strCIMSecuraManuscript_TXT_CountyCode = (String) row.get("CIMSecuraManuscript_TXT_CountyCode");
	String strCIMSecuraManuscript_TXT_TaxCode = (String) row.get("CIMSecuraManuscript_TXT_TaxCode");
	String strCIMSecuraManuscript_TXT_JurisdictionDescription_FilterNeeded = (String) row.get("CIMSecuraManuscript_TXT_JurisdictionDescription_FilterNeeded");
	
		try{
			se.element().selectPopupWithMagnifier(getCIMSecuraManuscript_TXT_JurisdictionDescription(strCIMSecuraManuscript_TXT_JurisdictionDescription), getCIMSecuraManuscript_BTN_JurisdictionDescriptionSearch(strCIMSecuraManuscript_TXT_JurisdictionDescription), strCIMSecuraManuscript_TXT_JurisdictionDescription, strCIMSecuraManuscript_TXT_JurisdictionDescription_FilterNeeded, strCIMSecuraManuscript_TXT_JurisdictionDescription, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCIMSecuraManuscript_TXT_FPDCode(strCIMSecuraManuscript_TXT_FPDCode),strCIMSecuraManuscript_TXT_FPDCode,test);
			se.element().enterOrValidateText(getCIMSecuraManuscript_TXT_FireProtectionDistrict(strCIMSecuraManuscript_TXT_FireProtectionDistrict),strCIMSecuraManuscript_TXT_FireProtectionDistrict,test);
			se.element().checkUncheckOrValidate(getCIMSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes(strCIMSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes),strCIMSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes,test);
			se.element().checkUncheckOrValidate(getCIMSecuraManuscript_CHK_AllCityName(strCIMSecuraManuscript_CHK_AllCityName),strCIMSecuraManuscript_CHK_AllCityName,test);
			se.element().enterOrValidateText(getCIMSecuraManuscript_TXT_KYTaxCity(strCIMSecuraManuscript_TXT_KYTaxCity),strCIMSecuraManuscript_TXT_KYTaxCity,test);
			se.element().enterOrValidateText(getCIMSecuraManuscript_TXT_CityCode(strCIMSecuraManuscript_TXT_CityCode),strCIMSecuraManuscript_TXT_CityCode,test);
			se.element().enterOrValidateText(getCIMSecuraManuscript_TXT_County(strCIMSecuraManuscript_TXT_County),strCIMSecuraManuscript_TXT_County,test);
			se.element().enterOrValidateText(getCIMSecuraManuscript_TXT_CountyCode(strCIMSecuraManuscript_TXT_CountyCode),strCIMSecuraManuscript_TXT_CountyCode,test);
			se.element().enterOrValidateText(getCIMSecuraManuscript_TXT_TaxCode(strCIMSecuraManuscript_TXT_TaxCode),strCIMSecuraManuscript_TXT_TaxCode,test);
			
			
	
	
}catch(Exception e){
	
	se.verify().verifyEquals("Failed to fill in details for CIMSecuraManuscriptTaxInfo ", true, false, true, test);
			
		}

}

	


	
	
}
