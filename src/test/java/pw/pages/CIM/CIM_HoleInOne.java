package pw.pages.CIM;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CIM;

public class CIM_HoleInOne extends OR_CIM{
	
	public void CIMHoleInOne(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase(constants.CIM_HoleInOne)){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CIM_HoleInOne, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);

			String strCIM_HoleInOne_BTN_ADD = (String) row.get("CIM_HoleInOne_BTN_ADD");
			String strCIM_HoleInOne_BTN_Details = (String) row.get("CIM_HoleInOne_BTN_Details");
			String strCIM_HoleInOne_BTN_PrizeHoleADDButton = (String) row.get("CIM_HoleInOne_BTN_PrizeHoleADDButton");
			String strCIM_HoleInOne_BTN_Done = (String) row.get("CIM_HoleInOne_BTN_Done");
			String strCIM_HoleInOne_TXT_LocationNo = (String) row.get("CIM_HoleInOne_TXT_LocationNo");
			String strCIM_HoleInOne_TXT_EventName = (String) row.get("CIM_HoleInOne_TXT_EventName");
			String strCIM_HoleInOne_TXT_EventDate = (String) row.get("CIM_HoleInOne_TXT_EventDate");
			String strCIM_HoleInOne_TXT_PrizeHoleNo = (String) row.get("CIM_HoleInOne_TXT_PrizeHoleNo");
			String strCIM_HoleInOne_TXT_PrizeHoleRowNo = (String) row.get("CIM_HoleInOne_TXT_PrizeHoleRowNo");
			String strCIM_HoleInOne_TXT_PrizeHoleValue = (String) row.get("CIM_HoleInOne_TXT_PrizeHoleValue");
			String strCIM_HoleInOne_TXT_PrizeHoleYardage = (String) row.get("CIM_HoleInOne_TXT_PrizeHoleYardage");
			String strCIM_HoleInOne_CHK_Reinstatement_Yes = (String) row.get("CIM_HoleInOne_CHK_Reinstatement_Yes");
			String strCIM_HoleInOne_CHK_Reinstatement_No = (String) row.get("CIM_HoleInOne_CHK_Reinstatement_No");
			String strCIM_HoleInOne_TXT_TotalNumOfPlayersAtEvent = (String) row.get("CIM_HoleInOne_TXT_TotalNumOfPlayersAtEvent");
			String strCIM_HoleInOne_CHK_SignNeeded = (String) row.get("CIM_HoleInOne_CHK_SignNeeded");
			String strCIM_HoleInOne_CHK_OverrideBaseRate_Yes = (String) row.get("CIM_HoleInOne_CHK_OverrideBaseRate_Yes");
			String strCIM_HoleInOne_CHK_OverrideBaseRate_No = (String) row.get("CIM_HoleInOne_CHK_OverrideBaseRate_No");
			String strCIM_HoleInOne_TXT_OverrideReason = (String) row.get("CIM_HoleInOne_TXT_OverrideReason");
			/*String strCIM_HoleInOne_CHK_DoNotApplyCityOrCountryTaxes = (String) row.get("CIM_HoleInOne_CHK_DoNotApplyCityOrCountryTaxes");
			String strCIM_HoleInOne_CHK_AllCityName = (String) row.get("CIM_HoleInOne_CHK_AllCityName");
			String strCIM_HoleInOne_TXT_KYCity = (String) row.get("CIM_HoleInOne_TXT_KYCity");
			String strCIM_HoleInOne_TXT_CityCode = (String) row.get("CIM_HoleInOne_TXT_CityCode");
			String strCIM_HoleInOne_TXT_County = (String) row.get("CIM_HoleInOne_TXT_County");
			String strCIM_HoleInOne_TXT_CountyCode = (String) row.get("CIM_HoleInOne_TXT_CountyCode");
			String strCIM_HoleInOne_TXT_TaxCode = (String) row.get("CIM_HoleInOne_TXT_TaxCode");*/
			String strCIM_HoleInOne_TXT_Hole = (String) row.get("CIM_HoleInOne_TXT_Hole");
			String strCIM_HoleInOne_TXT_BaseRate = (String) row.get("CIM_HoleInOne_TXT_BaseRate");
			String strCIM_HoleInOne_TXT_BaseRateOverride = (String) row.get("CIM_HoleInOne_TXT_BaseRateOverride");
			String strCIM_HoleInOne_TXT_ReinstatementFtr = (String) row.get("CIM_HoleInOne_TXT_ReinstatementFtr");
			String strCIM_HoleInOne_TXT_CommissionPremReducFtr = (String) row.get("CIM_HoleInOne_TXT_CommissionPremReducFtr");
			String strCIM_HoleInOne_TXT_AdditionalHoleFtr = (String) row.get("CIM_HoleInOne_TXT_AdditionalHoleFtr");
			String strCIM_HoleInOne_TXT_FinalRate = (String) row.get("CIM_HoleInOne_TXT_FinalRate");
			String strCIM_HoleInOne_TXT_OverrideFinalRate = (String) row.get("CIM_HoleInOne_TXT_OverrideFinalRate");
			String strCIM_HoleInOne_TXT_Premium = (String) row.get("CIM_HoleInOne_TXT_Premium");
			String strCIM_HoleInOne_TXT_OverridePremium = (String) row.get("CIM_HoleInOne_TXT_OverridePremium");
	
			try{
				se.log().logTestStep("CIMHoleInOne");
				test.log(LogStatus.INFO, "CIMHoleInOne page","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMHoleInOne");
				se.verify().verifyEquals("CIMHoleInOne page of PowerWriter ", getCIM_HoleInOne_TXT_VerifyHoleInOneText().isDisplayed(),true, true,test);
		
				if((strCIM_HoleInOne_BTN_ADD.equalsIgnoreCase(constants.Yes))){
					se.element().Click(getCIM_HoleInOne_BTN_ADD(strCIM_HoleInOne_BTN_ADD),test);
				}
				if(!(strCIM_HoleInOne_BTN_Details.equalsIgnoreCase(constants.NA))){
					se.element().tryClick(getCIM_HoleInOne_BTN_Details(strCIM_HoleInOne_BTN_Details),test);
					se.util().sleep(3000);
				}
				
			
				se.element().selectPopupWithMagnifier(getCIM_HoleInOne_TXT_LocationNo(strCIM_HoleInOne_TXT_LocationNo), getCIM_HoleInOne_TXT_LocationNoSearch(), strCIM_HoleInOne_TXT_LocationNo, constants.NA, strCIM_HoleInOne_TXT_LocationNo, constants.NA, constants.NA, constants.NA, test);
				
				se.element().enterOrValidateText(getCIM_HoleInOne_TXT_EventName(strCIM_HoleInOne_TXT_EventName),strCIM_HoleInOne_TXT_EventName,test);
				se.element().enterOrValidateText(getCIM_HoleInOne_TXT_EventDate(strCIM_HoleInOne_TXT_EventDate),strCIM_HoleInOne_TXT_EventDate,test);
				
				if((strCIM_HoleInOne_BTN_PrizeHoleADDButton.equalsIgnoreCase(constants.Yes))){
					se.element().Click(getCIM_HoleInOne_BTN_PrizeHoleADDButton(strCIM_HoleInOne_BTN_PrizeHoleADDButton),test);
				}
				
				se.element().enterOrValidateText(getCIM_HoleInOne_TXT_PrizeHoleNo(strCIM_HoleInOne_TXT_PrizeHoleNo,strCIM_HoleInOne_TXT_PrizeHoleRowNo),strCIM_HoleInOne_TXT_PrizeHoleNo,test);
				se.element().enterOrValidateText(getCIM_HoleInOne_TXT_PrizeHoleValue(strCIM_HoleInOne_TXT_PrizeHoleValue,strCIM_HoleInOne_TXT_PrizeHoleRowNo),strCIM_HoleInOne_TXT_PrizeHoleValue,test);
				se.element().enterOrValidateText(getCIM_HoleInOne_TXT_PrizeHoleYardage(strCIM_HoleInOne_TXT_PrizeHoleYardage,strCIM_HoleInOne_TXT_PrizeHoleRowNo),strCIM_HoleInOne_TXT_PrizeHoleYardage,test);
				se.element().checkUncheckOrValidate(getCIM_HoleInOne_CHK_Reinstatement_Yes(strCIM_HoleInOne_CHK_Reinstatement_Yes,strCIM_HoleInOne_TXT_PrizeHoleRowNo),strCIM_HoleInOne_CHK_Reinstatement_Yes,test);
				se.element().checkUncheckOrValidate(getCIM_HoleInOne_CHK_Reinstatement_No(strCIM_HoleInOne_CHK_Reinstatement_No,strCIM_HoleInOne_TXT_PrizeHoleRowNo),strCIM_HoleInOne_CHK_Reinstatement_No,test);
				se.element().enterOrValidateText(getCIM_HoleInOne_TXT_TotalNumOfPlayersAtEvent(strCIM_HoleInOne_TXT_TotalNumOfPlayersAtEvent),strCIM_HoleInOne_TXT_TotalNumOfPlayersAtEvent,test);
				se.element().checkUncheckOrValidate(getCIM_HoleInOne_CHK_SignNeeded(strCIM_HoleInOne_CHK_SignNeeded),strCIM_HoleInOne_CHK_SignNeeded,test);
				se.element().checkUncheckOrValidate(getCIM_HoleInOne_CHK_OverrideBaseRate_Yes(strCIM_HoleInOne_CHK_OverrideBaseRate_Yes),strCIM_HoleInOne_CHK_OverrideBaseRate_Yes,test);
				se.element().checkUncheckOrValidate(getCIM_HoleInOne_CHK_OverrideBaseRate_No(strCIM_HoleInOne_CHK_OverrideBaseRate_No),strCIM_HoleInOne_CHK_OverrideBaseRate_No,test);
				se.element().enterOrValidateText(getCIM_HoleInOne_TXT_OverrideReason(strCIM_HoleInOne_TXT_OverrideReason),strCIM_HoleInOne_TXT_OverrideReason,test);
				/*se.element().checkUncheckOrValidate(getCIM_HoleInOne_CHK_DoNotApplyCityOrCountryTaxes(strCIM_HoleInOne_CHK_DoNotApplyCityOrCountryTaxes),strCIM_HoleInOne_CHK_DoNotApplyCityOrCountryTaxes,test);
				se.element().checkUncheckOrValidate(getCIM_HoleInOne_CHK_AllCityName(strCIM_HoleInOne_CHK_AllCityName),strCIM_HoleInOne_CHK_AllCityName,test);
				se.element().enterOrValidateText(getCIM_HoleInOne_TXT_KYCity(strCIM_HoleInOne_TXT_KYCity),strCIM_HoleInOne_TXT_KYCity,test);
				se.element().enterOrValidateText(getCIM_HoleInOne_TXT_CityCode(strCIM_HoleInOne_TXT_CityCode),strCIM_HoleInOne_TXT_CityCode,test);
				se.element().enterOrValidateText(getCIM_HoleInOne_TXT_County(strCIM_HoleInOne_TXT_County),strCIM_HoleInOne_TXT_County,test);
				se.element().enterOrValidateText(getCIM_HoleInOne_TXT_CountyCode(strCIM_HoleInOne_TXT_CountyCode),strCIM_HoleInOne_TXT_CountyCode,test);
				se.element().enterOrValidateText(getCIM_HoleInOne_TXT_TaxCode(strCIM_HoleInOne_TXT_TaxCode),strCIM_HoleInOne_TXT_TaxCode,test);*/
				se.element().enterOrValidateText(getCIM_HoleInOne_TXT_Hole(strCIM_HoleInOne_TXT_Hole),strCIM_HoleInOne_TXT_Hole,test);
				se.element().enterOrValidateText(getCIM_HoleInOne_TXT_BaseRate(strCIM_HoleInOne_TXT_BaseRate),strCIM_HoleInOne_TXT_BaseRate,test);
				se.element().enterOrValidateText(getCIM_HoleInOne_TXT_BaseRateOverride(strCIM_HoleInOne_TXT_BaseRateOverride,strCIM_HoleInOne_TXT_PrizeHoleRowNo),strCIM_HoleInOne_TXT_BaseRateOverride,test);
				se.element().enterOrValidateText(getCIM_HoleInOne_TXT_ReinstatementFtr(strCIM_HoleInOne_TXT_ReinstatementFtr),strCIM_HoleInOne_TXT_ReinstatementFtr,test);
				se.element().enterOrValidateText(getCIM_HoleInOne_TXT_CommissionPremReducFtr(strCIM_HoleInOne_TXT_CommissionPremReducFtr),strCIM_HoleInOne_TXT_CommissionPremReducFtr,test);
				se.element().enterOrValidateText(getCIM_HoleInOne_TXT_AdditionalHoleFtr(strCIM_HoleInOne_TXT_AdditionalHoleFtr),strCIM_HoleInOne_TXT_AdditionalHoleFtr,test);
				se.element().enterOrValidateText(getCIM_HoleInOne_TXT_FinalRate(strCIM_HoleInOne_TXT_FinalRate),strCIM_HoleInOne_TXT_FinalRate,test);
				se.element().enterOrValidateText(getCIM_HoleInOne_TXT_OverrideFinalRate(strCIM_HoleInOne_TXT_OverrideFinalRate),strCIM_HoleInOne_TXT_OverrideFinalRate,test);
				se.element().enterOrValidateText(getCIM_HoleInOne_TXT_Premium(strCIM_HoleInOne_TXT_Premium),strCIM_HoleInOne_TXT_Premium,test);
				se.element().enterOrValidateText(getCIM_HoleInOne_TXT_OverridePremium(strCIM_HoleInOne_TXT_OverridePremium),strCIM_HoleInOne_TXT_OverridePremium,test);

				if(strCIM_HoleInOne_CHK_SignNeeded.equalsIgnoreCase(constants.Check)){
					se.element().Click(getNext(),test);
					se.util().sleep(2000);	
					CIM_HoleInOne_Signs(strRegressionID, transaction, test);
				}
				
				se.element().Click(getNext(),test);
		
				if((strCIM_HoleInOne_BTN_Done.equalsIgnoreCase(constants.Yes))){
					se.element().Click(getDone(),test);
				}
				
			}
			catch (Exception e) {
				se.verify().verifyEquals("Failed to fill in details for CIMHoleInOne ", true, false, true, test);
				
			}
					iteration++;
				}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Failed", "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			testTearDown(se, test);
		}
			
	}
	
	public void CIM_HoleInOne_Signs(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_HoleInOne_Signs")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_HoleInOne_Signs", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strCIM_HoleInOne_Signs_TXT_HoleSponserName = (String) row.get("CIM_HoleInOneSigns_TXT_HoleSponserName");
			String strCIM_HoleInOne_Signs_TXT_Prize = (String) row.get("CIM_HoleInOneSigns_TXT_Prize");
			//String strCIM_HoleInOne_Signs_LNK_Prize_Popup = (String) row.get("CIM_HoleInOneSigns_LNK_Prize_Popup");
			String strCIM_HoleInOne_Signs_TXT_CashAmount = (String) row.get("CIM_HoleInOneSigns_TXT_CashAmount");
			String strCIM_HoleInOne_Signs_TXT_PrizeDesc = (String) row.get("CIM_HoleInOneSigns_TXT_PrizeDescription");
			String strCIM_HoleInOne_Signs_TXT_MailSignsTo = (String) row.get("CIM_HoleInOneSigns_TXT_MailSignsTo");
			//String strCIM_HoleInOne_Signs_LNK_MailSignsTo_Popup = (String) row.get("CIM_HoleInOneSigns_LNK_MailSignsTo_Popup");
			String strCIM_HoleInOne_Signs_TXT_Name = (String) row.get("CIM_HoleInOneSigns_TXT_Name");
			String strCIM_HoleInOne_Signs_TXT_Street = (String) row.get("CIM_HoleInOneSigns_TXT_Street");
			String strCIM_HoleInOne_Signs_TXT_SteUnit = (String) row.get("CIM_HoleInOneSigns_TXT_Ste/Unit");
			String strCIM_HoleInOne_Signs_TXT_City = (String) row.get("CIM_HoleInOneSigns_TXT_City");
			String strCIM_HoleInOne_Signs_TXT_State = (String) row.get("CIM_HoleInOneSigns_TXT_State");
			String strCIM_HoleInOne_Signs_TXT_Zip = (String) row.get("CIM_HoleInOneSigns_TXT_Zip");
			
			try{
				//-------------------------------------------------- Sign Details Section ----------------------------------------------------------//
				se.element().enterOrValidateText(getCIM_HoleInOne_Sign_TXT_hole_spns_name(strCIM_HoleInOne_Signs_TXT_HoleSponserName),strCIM_HoleInOne_Signs_TXT_HoleSponserName,test);
				
				if(!strCIM_HoleInOne_Signs_TXT_Prize.equalsIgnoreCase(constants.NA) && !strCIM_HoleInOne_Signs_TXT_Prize.contains(constants.Validate)) {
					se.element().clickSearchIcon(getCIM_HoleInOne_Sign_BTN_prize_magnifier(strCIM_HoleInOne_Signs_TXT_Prize),test);
					se.util().sleep(2000);
					se.element().Click(getCIM_HoleInOne_Sign_LNK_prize_popup(strCIM_HoleInOne_Signs_TXT_Prize),test);
				}else {
					se.element().enterOrValidateText(getCIM_HoleInOne_Sign_TXT_prize(strCIM_HoleInOne_Signs_TXT_Prize), strCIM_HoleInOne_Signs_TXT_Prize, test);	
				}
				se.element().enterOrValidateText(getCIM_HoleInOne_Sign_TXT_CashAmount(strCIM_HoleInOne_Signs_TXT_CashAmount), strCIM_HoleInOne_Signs_TXT_CashAmount, test);
				if(!strCIM_HoleInOne_Signs_TXT_MailSignsTo.equalsIgnoreCase(constants.NA) && !strCIM_HoleInOne_Signs_TXT_MailSignsTo.contains(constants.Validate)) {
					se.element().clickSearchIcon(getCIM_HoleInOne_Sign_BTN_mail_sign_to_magnifier(strCIM_HoleInOne_Signs_TXT_MailSignsTo),test);
					se.element().Click(getCIM_HoleInOne_Sign_LNK_mail_sign_to_popup(strCIM_HoleInOne_Signs_TXT_MailSignsTo),test);
				}else {
					se.element().enterOrValidateText(getCIM_HoleInOne_Sign_TXT_mail_sign_to(strCIM_HoleInOne_Signs_TXT_MailSignsTo), strCIM_HoleInOne_Signs_TXT_Prize, test);	
				}
				se.element().enterOrValidateText(getCIM_HoleInOne_Sign_TXT_name(strCIM_HoleInOne_Signs_TXT_Name), strCIM_HoleInOne_Signs_TXT_Name, test);
				//-------------------------------------------------- Address Section --------------------------------------------------------------//
				se.element().enterOrValidateText(getCommon_CIM_Loc_TXT_Street(strCIM_HoleInOne_Signs_TXT_Street), strCIM_HoleInOne_Signs_TXT_Street, test);
				se.element().enterOrValidateText(getCommon_CIM_Loc_TXT_SteUnit(strCIM_HoleInOne_Signs_TXT_SteUnit), strCIM_HoleInOne_Signs_TXT_SteUnit, test);
				se.element().enterOrValidateText(getCommon_CIM_Loc_TXT_city(strCIM_HoleInOne_Signs_TXT_City), strCIM_HoleInOne_Signs_TXT_City, test);
				se.element().enterOrValidateText(getCommon_CIM_Loc_DDN_State(strCIM_HoleInOne_Signs_TXT_State), strCIM_HoleInOne_Signs_TXT_State, test);
				se.element().enterOrValidateText(getCommon_CIM_Loc_DDN_StateList(strCIM_HoleInOne_Signs_TXT_State), strCIM_HoleInOne_Signs_TXT_State, test);
				se.element().enterOrValidateText(getCommon_CIM_Loc_TXT_zip_code(strCIM_HoleInOne_Signs_TXT_Zip), strCIM_HoleInOne_Signs_TXT_Zip, test);
			
			} catch (Exception e) {
				se.verify().verifyEquals("Failed to fill in details for CIMHoleInOne_Signs ", true, false, true, test);
				
			}
					iteration++;
				}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Failed", "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			testTearDown(se, test);
		}
			
	}
}