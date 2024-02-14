package pw.pages.CA;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CA;
import pw.OR.OR_CP;
import pw.OR.OR_GL;


/**
* @author ${ro09528}
*/
public class CA_SecuraManusript extends OR_CA{
	
	public void SecuraManusript(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		try{
		//String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(suspendSheet.equalsIgnoreCase(constants.CA_SecuraManusript)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_SecuraManusript, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strSecuraManuscript_BTN_ADD = (String) row.get("SecuraManuscript_BTN_ADD");
			String strSecuraManuscript_BTN_Details = (String) row.get("SecuraManuscript_BTN_Details");
			String strSecuraManuscript_BTN_Remove = (String) row.get("SecuraManuscript_BTN_Remove");
			String strSecuraManuscript_TXT_State = (String) row.get("SecuraManuscript_TXT_State");
			String strSecuraManuscript_TXT_StateFilterNeeded = (String) row.get("SecuraManuscript_TXT_StateFilterNeeded");
			String strSecuraManuscript_TXT_Form = (String) row.get("SecuraManuscript_TXT_Form");
			String strSecuraManuscript_TXT_FormFilterNeeded = (String) row.get("SecuraManuscript_TXT_FormFilterNeeded");
			String strSecuraManuscript_TXT_Description = (String) row.get("SecuraManuscript_TXT_Description");
			String strSecuraManuscript_TXT_AnnualPremium = (String) row.get("SecuraManuscript_TXT_AnnualPremium");
			String strSecuraManuscript_TXT_ClassificationCode = (String) row.get("SecuraManuscript_TXT_ClassificationCode");
			String strSecuraManuscript_TXT_ClassificationCodeFilterNeeded = (String) row.get("SecuraManuscript_TXT_ClassificationCode_FilterNeeded");
			String strSecuraManuscript_TXT_ClassificationDescription = (String) row.get("SecuraManuscript_TXT_ClassificationDescription");
			String strSecuraManuscript_CHK_PremiumChargeTypeProRata = (String) row.get("SecuraManuscript_CHK_PremiumChargeTypeProRata");
			String strSecuraManuscript_CHK_PremiumChargeTypeFlatCharge = (String) row.get("SecuraManuscript_CHK_PremiumChargeTypeFlatCharge");
			String strSecuraManuscript_CHK_PremiumChargeTypeFullyEarned = (String) row.get("SecuraManuscript_CHK_PremiumChargeTypeFullyEarned");
			String strSecuraManuscript_TXT_JurisdictionDescriptionFilterNeeded = (String) row.get("SecuraManuscript_TXT_JurisdictionDescription_FilterNeeded");
			String strSecuraManuscript_TXT_JurisdictionDescription = (String) row.get("SecuraManuscript_TXT_JurisdictionDescription");
			String strSecuraManuscript_TXT_FPDCode = (String) row.get("SecuraManuscript_TXT_FPDCode");
			String strSecuraManuscript_TXT_FireProtectionDistrict = (String) row.get("SecuraManuscript_TXT_FireProtectionDistrict");
			String strSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes = (String) row.get("SecuraManuscript_CHK_DoNotApplyCityorCountyTaxes");
			String strSecuraManuscript_CHK_AllCityName = (String) row.get("SecuraManuscript_CHK_AllCityName");
			String strSecuraManuscript_TXT_KYTaxCityFilterNeeded = (String) row.get("SecuraManuscript_TXT_KYTaxCity_FilterNeeded");
			String strSecuraManuscript_TXT_KYTaxCity = (String) row.get("SecuraManuscript_TXT_KYTaxCity");
			String strSecuraManuscript_TXT_CityCode = (String) row.get("SecuraManuscript_TXT_CityCode");
			String strSecuraManuscript_TXT_CountyFilterNeeded = (String) row.get("SecuraManuscript_TXT_County_FilterNeeded");
			String strSecuraManuscript_TXT_County = (String) row.get("SecuraManuscript_TXT_County");
			String strSecuraManuscript_TXT_CountyCode = (String) row.get("SecuraManuscript_TXT_CountyCode");
			String strSecuraManuscript_TXT_TaxCode = (String) row.get("SecuraManuscript_TXT_TaxCode");
			String strSecuraManuscript_BTN_Done = (String) row.get("SecuraManuscript_BTN_Done");

		try{
			se.log().logTestStep("CA_SecuraManusript");
			test.log(LogStatus.INFO, "CA_SecuraManusript page","Transaction Step : "+transaction + "<br>" +"Page : CA_SecuraManusript");
			se.verify().verifyEquals("CA_SecuraManusript Page of PowerWriter ", getSecuraManuscript_TXT_Label().isDisplayed(),true, true,test);
			if(!strSecuraManuscript_BTN_ADD.equals(constants.NA)){
				se.element().Click(getSecuraManuscript_BTN_ADD(strSecuraManuscript_BTN_ADD),strSecuraManuscript_BTN_ADD,test);
			}
			if(!strSecuraManuscript_BTN_Details.equals(constants.NA)){
				se.element().Click(getSecuraManuscript_BTN_Details(strSecuraManuscript_BTN_Details),strSecuraManuscript_BTN_Details,test);
			}
			
			if(strSecuraManuscript_BTN_Remove.equalsIgnoreCase("Yes")){
				se.element().Click(getSecuraManuscript_BTN_Remove(strSecuraManuscript_BTN_Remove),strSecuraManuscript_BTN_Remove,test);
			}
			
			se.element().selectPopupWithMagnifier(getSecuraManuscript_TXT_State(strSecuraManuscript_TXT_State),getSecuraManuscript_TXT_StateSearch(strSecuraManuscript_TXT_State),strSecuraManuscript_TXT_State,strSecuraManuscript_TXT_StateFilterNeeded,strSecuraManuscript_TXT_State, constants.NA, constants.NA,constants.NA,test);
			se.element().selectPopupWithMagnifier(getSecuraManuscript_TXT_Form(strSecuraManuscript_TXT_Form),getSecuraManuscript_TXT_FormSearch(strSecuraManuscript_TXT_Form),strSecuraManuscript_TXT_Form,strSecuraManuscript_TXT_FormFilterNeeded,strSecuraManuscript_TXT_Form, constants.NA, constants.NA,constants.NA,test);
			se.element().enter_textRich(getSecuraManuscript_TXT_Description(strSecuraManuscript_TXT_Description),strSecuraManuscript_TXT_Description,test);
			se.element().enterOrValidateText(getSecuraManuscript_TXT_AnnualPremium(strSecuraManuscript_TXT_AnnualPremium),strSecuraManuscript_TXT_AnnualPremium,test);
			se.element().selectPopupWithMagnifier(getSecuraManuscript_TXT_ClassificationCode(strSecuraManuscript_TXT_ClassificationCode),getSecuraManuscript_TXT_ClassificationCodeSearch(strSecuraManuscript_TXT_ClassificationCode),strSecuraManuscript_TXT_ClassificationCode,strSecuraManuscript_TXT_ClassificationCodeFilterNeeded,strSecuraManuscript_TXT_ClassificationCode, constants.NA, constants.NA,constants.NA,test);
			se.element().enterOrValidateText(getSecuraManuscript_TXT_ClassificationDescription(strSecuraManuscript_TXT_ClassificationDescription),strSecuraManuscript_TXT_ClassificationDescription,test);
			se.element().checkUncheckOrValidate(getSecuraManuscript_CHK_PremiumChargeTypeProRata(strSecuraManuscript_CHK_PremiumChargeTypeProRata),strSecuraManuscript_CHK_PremiumChargeTypeProRata,test);
			se.element().checkUncheckOrValidate(getSecuraManuscript_CHK_PremiumChargeTypeFlatCharge(strSecuraManuscript_CHK_PremiumChargeTypeFlatCharge),strSecuraManuscript_CHK_PremiumChargeTypeFlatCharge,test);
			se.element().checkUncheckOrValidate(getSecuraManuscript_CHK_PremiumChargeTypeFullyEarned(strSecuraManuscript_CHK_PremiumChargeTypeFullyEarned),strSecuraManuscript_CHK_PremiumChargeTypeFullyEarned,test);
			se.element().enterOrValidateText(getSecuraManuscript_TXT_JurisdictionDescription_FilterNeeded(strSecuraManuscript_TXT_JurisdictionDescriptionFilterNeeded),strSecuraManuscript_TXT_JurisdictionDescriptionFilterNeeded,test);
			se.element().enterOrValidateText(getSecuraManuscript_TXT_JurisdictionDescription(strSecuraManuscript_TXT_JurisdictionDescription),strSecuraManuscript_TXT_JurisdictionDescription,test);
			se.element().enterOrValidateText(getSecuraManuscript_TXT_FPDCode(strSecuraManuscript_TXT_FPDCode),strSecuraManuscript_TXT_FPDCode,test);
			se.element().enterOrValidateText(getSecuraManuscript_TXT_FireProtectionDistrict(strSecuraManuscript_TXT_FireProtectionDistrict),strSecuraManuscript_TXT_FireProtectionDistrict,test);
			se.element().checkUncheckOrValidate(getSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes(strSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes),strSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes,test);
			se.element().checkUncheckOrValidate(getSecuraManuscript_CHK_AllCityName(strSecuraManuscript_CHK_AllCityName),strSecuraManuscript_CHK_AllCityName,test);
			se.element().selectPopupWithMagnifier(getSecuraManuscript_TXT_KYTaxCity(strSecuraManuscript_TXT_KYTaxCity),getSecuraManuscript_TXT_KYTaxCitySearch(strSecuraManuscript_TXT_KYTaxCity),strSecuraManuscript_TXT_KYTaxCity,strSecuraManuscript_TXT_KYTaxCityFilterNeeded,strSecuraManuscript_TXT_KYTaxCity, constants.NA, constants.NA,constants.NA,test);
			se.element().enterOrValidateText(getSecuraManuscript_TXT_CityCode(strSecuraManuscript_TXT_CityCode),strSecuraManuscript_TXT_CityCode,test);
			se.element().selectPopupWithMagnifier(getSecuraManuscript_TXT_County(strSecuraManuscript_TXT_County),getSecuraManuscript_TXT_CountySearch(strSecuraManuscript_TXT_County),strSecuraManuscript_TXT_County,strSecuraManuscript_TXT_CountyFilterNeeded,strSecuraManuscript_TXT_County, constants.NA, constants.NA,constants.NA,test);
			se.element().enterOrValidateText(getSecuraManuscript_TXT_CountyCode(strSecuraManuscript_TXT_CountyCode),strSecuraManuscript_TXT_CountyCode,test);
			se.element().enterOrValidateText(getSecuraManuscript_TXT_TaxCode(strSecuraManuscript_TXT_TaxCode),strSecuraManuscript_TXT_TaxCode,test);
					
			se.element().clickElement(getNext());
		
			if(!strSecuraManuscript_BTN_Done.equals(constants.NA)){
				se.element().Click(getDone(),strSecuraManuscript_BTN_Done,test);
			}
			}catch(Exception e){				
					se.verify().verifyEquals("Failed to fill in details for CA_SecuraManusript ", true, false, true, test);			
				
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