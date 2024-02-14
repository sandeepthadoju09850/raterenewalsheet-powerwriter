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

public class GL_OCPClassifications extends OR_GL{

	public void OCPClassifications(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase("GL_OCP_Classifications")){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData("GL_OCP_Classifications", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCP_OCP_Classifications_BTN_ADD = (String) row.get("CP_OCP_Classifications_BTN_ADD");
		String strCP_OCP_Classifications_BTN_Details = (String) row.get("CP_OCP_Classifications_BTN_Details");
		//String strCP_OCP_Classifications_BTN_Done = (String) row.get("CP_OCP_Classifications_BTN_Done");
		String strCP_OCP_Classifications_TXT_location_no = (String) row.get("CP_OCP_Classifications_TXT_location_no");
		String strCP_OCP_Classifications_TXT_name = (String) row.get("CP_OCP_Classifications_TXT_name");
		String strCP_OCP_Classifications_TXT_description = (String) row.get("CP_OCP_Classifications_TXT_description");
		String strCP_OCP_Classifications_TXT_line_1 = (String) row.get("CP_OCP_Classifications_TXT_line_1");
		String strCP_OCP_Classifications_TXT_line_2 = (String) row.get("CP_OCP_Classifications_TXT_line_2");
		String strCP_OCP_Classifications_TXT_city = (String) row.get("CP_OCP_Classifications_TXT_city");
		String strCP_OCP_Classifications_TXT_state_desc = (String) row.get("CP_OCP_Classifications_TXT_state_desc");
		String strCP_OCP_Classifications_TXT_zip_code = (String) row.get("CP_OCP_Classifications_TXT_zip_code");
		String strCP_OCP_Classifications_CHK_DoNotApplyCityOrCountyTaxes = (String) row.get("CP_OCP_Classifications_CHK_DoNotApplyCityOrCountyTaxes");
		String strCP_OCP_Classifications_CHK_AllCityName = (String) row.get("CP_OCP_Classifications_CHK_AllCityName");
		String strCP_OCP_Classifications_TXT_City = (String) row.get("CP_OCP_Classifications_TXT_City");
		String strCP_OCP_Classifications_TXT_CityCode = (String) row.get("CP_OCP_Classifications_TXT_CityCode");
		String strCP_OCP_Classifications_TXT_County = (String) row.get("CP_OCP_Classifications_TXT_County");
		String strCP_OCP_Classifications_TXT_CountyCode = (String) row.get("CP_OCP_Classifications_TXT_CountyCode");
		String strCP_OCP_Classifications_TXT_class_descriptionPopUp = (String) row.get("CP_OCP_Classifications_TXT_class_descriptionPopUp");
		String strCP_OCP_Classifications_TXT_TaxCode = (String) row.get("CP_OCP_Classifications_TXT_TaxCode");
		String strCP_OCP_Classifications_TXT_class_code = (String) row.get("CP_OCP_Classifications_TXT_class_code");
		String strCP_OCP_Classifications_CHK_1is_auditable = (String) row.get("CP_OCP_Classifications_CHK_1is_auditable");
		String strCP_OCP_Classifications_TXT_class_description = (String) row.get("CP_OCP_Classifications_TXT_class_description");
		String strCP_OCP_Classifications_CHK_IfAnyStatusApplies_Yes = (String) row.get("CP_OCP_Classifications_CHK_IfAnyStatusApplies_Yes");
		String strCP_OCP_Classifications_CHK_IfAnyStatusApplies_No = (String) row.get("CP_OCP_Classifications_CHK_IfAnyStatusApplies_No");
		String strCP_OCP_Classifications_TXT_premium_basis = (String) row.get("CP_OCP_Classifications_TXT_premium_basis");
		String strCP_OCP_Classifications_TXT_exposure = (String) row.get("CP_OCP_Classifications_TXT_exposure");
		String strCP_OCP_Classifications_CHK_OverrideLossCost_Yes = (String) row.get("CP_OCP_Classifications_CHK_OverrideLossCost_Yes");
		String strCP_OCP_Classifications_CHK_OverrideLossCost_No = (String) row.get("CP_OCP_Classifications_CHK_OverrideLossCost_No");
		String strCP_OCP_Classifications_CHK_OverrideReason = (String) row.get("CP_OCP_Classifications_CHK_OverrideReason");
		String strCP_OCP_Classifications_CHK_OverrideReasonFilterNeeded = (String) row.get("CP_OCP_Classifications_CHK_OverrideReasonFilterNeeded");
		String strCP_OCP_Classifications_TXT_loss_cost = (String) row.get("CP_OCP_Classifications_TXT_loss_cost");
		String strCP_OCP_Classifications_TXT_loss_cost_multiplier = (String) row.get("CP_OCP_Classifications_TXT_loss_cost_multiplier");
		String strCP_OCP_Classifications_TXT_base_rate = (String) row.get("CP_OCP_Classifications_TXT_base_rate");
		String strCP_OCP_Classifications_TXT_c_transition_ftr = (String) row.get("CP_OCP_Classifications_TXT_c_transition_ftr");
		String strCP_OCP_Classifications_TXT_c_miscellaneous_ftr = (String) row.get("CP_OCP_Classifications_TXT_c_miscellaneous_ftr");
		String strCP_OCP_Classifications_TXT_c_assoc_group_ftr = (String) row.get("CP_OCP_Classifications_TXT_c_assoc_group_ftr");
		String strCP_OCP_Classifications_TXT_c_renewal_rewards_ftr = (String) row.get("CP_OCP_Classifications_TXT_c_renewal_rewards_ftr");
		String strCP_OCP_Classifications_TXT_c_account_credit_ftr = (String) row.get("CP_OCP_Classifications_TXT_c_account_credit_ftr");
		String strCP_OCP_Classifications_TXT_adj_base_rate = (String) row.get("CP_OCP_Classifications_TXT_adj_base_rate");
		String strCP_OCP_Classifications_TXT_transaction_premium = (String) row.get("CP_OCP_Classifications_TXT_transaction_premium");

		
		
		try{
			se.log().logTestStep("OCPClassifications");
			test.log(LogStatus.INFO, "OCPClassifications","Transaction Step : "+ transaction + "<br>" +"Page : OCPClassifications"  + "<br>" +"Section: OCPClassifications");
			se.verify().verifyEquals("OCPClassifications of PowerWriter ", getCP_OCP_Classifications_TXT_VerifyOCPClassificationText().isDisplayed(),true, true,test);
			
			if((strCP_OCP_Classifications_BTN_ADD.equalsIgnoreCase("Yes"))){
				se.element().Click(getCP_OCP_Classifications_BTN_ADD(strCP_OCP_Classifications_BTN_ADD),test);
				}
				if((strCP_OCP_Classifications_BTN_Details.equalsIgnoreCase("Yes"))){
				se.element().tryClick(getCP_OCP_Classifications_BTN_Details(strCP_OCP_Classifications_BTN_Details),test);
				}
				
			se.element().enterOrValidateText(getCP_OCP_Classifications_TXT_location_no(strCP_OCP_Classifications_TXT_location_no),strCP_OCP_Classifications_TXT_location_no,test);
			se.element().enterOrValidateText(getCP_OCP_Classifications_TXT_name(strCP_OCP_Classifications_TXT_name),strCP_OCP_Classifications_TXT_name,test);
			se.element().enterOrValidateText(getCP_OCP_Classifications_TXT_description(strCP_OCP_Classifications_TXT_description),strCP_OCP_Classifications_TXT_description,test);
			se.element().enterOrValidateText(getCP_OCP_Classifications_TXT_line_1(strCP_OCP_Classifications_TXT_line_1),strCP_OCP_Classifications_TXT_line_1,test);
			se.element().enterOrValidateText(getCP_OCP_Classifications_TXT_line_2(strCP_OCP_Classifications_TXT_line_2),strCP_OCP_Classifications_TXT_line_2,test);
			se.element().enterOrValidateText(getCP_OCP_Classifications_TXT_city(strCP_OCP_Classifications_TXT_city),strCP_OCP_Classifications_TXT_city,test);
			se.element().enterOrValidateText(getCP_OCP_Classifications_TXT_state_desc(strCP_OCP_Classifications_TXT_state_desc),strCP_OCP_Classifications_TXT_state_desc,test);
			se.element().enterOrValidateText(getCP_OCP_Classifications_TXT_zip_code(strCP_OCP_Classifications_TXT_zip_code),strCP_OCP_Classifications_TXT_zip_code,test);
			
			se.element().checkUncheckOrValidate(getCP_OCP_Classifications_CHK_DoNotApplyCityOrCountyTaxes(strCP_OCP_Classifications_CHK_DoNotApplyCityOrCountyTaxes),strCP_OCP_Classifications_CHK_DoNotApplyCityOrCountyTaxes,test);
			se.element().checkUncheckOrValidate(getCP_OCP_Classifications_CHK_AllCityName(strCP_OCP_Classifications_CHK_AllCityName),strCP_OCP_Classifications_CHK_AllCityName,test);
			se.element().enterOrValidateText(getCP_OCP_Classifications_TXT_City(strCP_OCP_Classifications_TXT_City),strCP_OCP_Classifications_TXT_City,test);
			se.element().enterOrValidateText(getCP_OCP_Classifications_TXT_CityCode(strCP_OCP_Classifications_TXT_CityCode),strCP_OCP_Classifications_TXT_CityCode,test);
			se.element().enterOrValidateText(getCP_OCP_Classifications_TXT_County(strCP_OCP_Classifications_TXT_County),strCP_OCP_Classifications_TXT_County,test);
			se.element().enterOrValidateText(getCP_OCP_Classifications_TXT_CountyCode(strCP_OCP_Classifications_TXT_CountyCode),strCP_OCP_Classifications_TXT_CountyCode,test);
			se.element().enterOrValidateText(getCP_OCP_Classifications_TXT_TaxCode(strCP_OCP_Classifications_TXT_TaxCode),strCP_OCP_Classifications_TXT_TaxCode,test);
			//se.element().enterOrValidateText(getCP_OCP_Classifications_TXT_class_code(strCP_OCP_Classifications_TXT_class_code),strCP_OCP_Classifications_TXT_class_code,test);
			se.element().selectClasscode(getCP_OCP_Classifications_TXT_class_code(strCP_OCP_Classifications_TXT_class_code), constants.NA, strCP_OCP_Classifications_TXT_class_code, strCP_OCP_Classifications_TXT_class_descriptionPopUp, constants.NA, constants.NA, test);;
			se.element().checkUncheckOrValidate(getCP_OCP_Classifications_CHK_1is_auditable(strCP_OCP_Classifications_CHK_1is_auditable),strCP_OCP_Classifications_CHK_1is_auditable,test);
			se.element().enterOrValidateText(getCP_OCP_Classifications_TXT_class_description(strCP_OCP_Classifications_TXT_class_description),strCP_OCP_Classifications_TXT_class_description,test);
			se.element().checkUncheckOrValidate(getCP_OCP_Classifications_CHK_IfAnyStatusApplies_Yes(strCP_OCP_Classifications_CHK_IfAnyStatusApplies_Yes),strCP_OCP_Classifications_CHK_IfAnyStatusApplies_Yes,test);
			se.util().sleep(1000);
			se.element().checkUncheckOrValidate(getCP_OCP_Classifications_CHK_IfAnyStatusApplies_No(strCP_OCP_Classifications_CHK_IfAnyStatusApplies_No),strCP_OCP_Classifications_CHK_IfAnyStatusApplies_No,test);
			se.element().enterOrValidateText(getCP_OCP_Classifications_TXT_premium_basis(strCP_OCP_Classifications_TXT_premium_basis),strCP_OCP_Classifications_TXT_premium_basis,test);
			se.element().enterOrValidateText(getCP_OCP_Classifications_TXT_exposure(strCP_OCP_Classifications_TXT_exposure),strCP_OCP_Classifications_TXT_exposure,test);
			se.element().checkUncheckOrValidate(getCP_OCP_Classifications_CHK_OverrideLossCost_Yes(strCP_OCP_Classifications_CHK_OverrideLossCost_Yes),strCP_OCP_Classifications_CHK_OverrideLossCost_Yes,test);
			se.element().checkUncheckOrValidate(getCP_OCP_Classifications_CHK_OverrideLossCost_No(strCP_OCP_Classifications_CHK_OverrideLossCost_No),strCP_OCP_Classifications_CHK_OverrideLossCost_No,test);
			se.element().selectPopupWithMagnifier(getCP_OCP_Classifications_CHK_OverrideReason(strCP_OCP_Classifications_CHK_OverrideReason), getCP_OCP_Classifications_CHK_OverrideReasonSearch(strCP_OCP_Classifications_CHK_OverrideReason), strCP_OCP_Classifications_CHK_OverrideReason, strCP_OCP_Classifications_CHK_OverrideReasonFilterNeeded, strCP_OCP_Classifications_CHK_OverrideReason, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCP_OCP_Classifications_TXT_loss_cost(strCP_OCP_Classifications_TXT_loss_cost),strCP_OCP_Classifications_TXT_loss_cost,test);
			se.element().enterOrValidateText(getCP_OCP_Classifications_TXT_loss_cost_multiplier(strCP_OCP_Classifications_TXT_loss_cost_multiplier),strCP_OCP_Classifications_TXT_loss_cost_multiplier,test);
			se.element().enterOrValidateText(getCP_OCP_Classifications_TXT_base_rate(strCP_OCP_Classifications_TXT_base_rate),strCP_OCP_Classifications_TXT_base_rate,test);
			se.element().enterOrValidateText(getCP_OCP_Classifications_TXT_c_transition_ftr(strCP_OCP_Classifications_TXT_c_transition_ftr),strCP_OCP_Classifications_TXT_c_transition_ftr,test);
			se.element().enterOrValidateText(getCP_OCP_Classifications_TXT_c_miscellaneous_ftr(strCP_OCP_Classifications_TXT_c_miscellaneous_ftr),strCP_OCP_Classifications_TXT_c_miscellaneous_ftr,test);
			se.element().enterOrValidateText(getCP_OCP_Classifications_TXT_c_assoc_group_ftr(strCP_OCP_Classifications_TXT_c_assoc_group_ftr),strCP_OCP_Classifications_TXT_c_assoc_group_ftr,test);
			se.element().enterOrValidateText(getCP_OCP_Classifications_TXT_c_renewal_rewards_ftr(strCP_OCP_Classifications_TXT_c_renewal_rewards_ftr),strCP_OCP_Classifications_TXT_c_renewal_rewards_ftr,test);
			se.element().enterOrValidateText(getCP_OCP_Classifications_TXT_c_account_credit_ftr(strCP_OCP_Classifications_TXT_c_account_credit_ftr),strCP_OCP_Classifications_TXT_c_account_credit_ftr,test);
			se.element().enterOrValidateText(getCP_OCP_Classifications_TXT_adj_base_rate(strCP_OCP_Classifications_TXT_adj_base_rate),strCP_OCP_Classifications_TXT_adj_base_rate,test);
			se.element().enterOrValidateText(getCP_OCP_Classifications_TXT_transaction_premium(strCP_OCP_Classifications_TXT_transaction_premium),strCP_OCP_Classifications_TXT_transaction_premium,test);

			se.element().Click(getNext(),test);
		
			
	}
		catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for OCPClassifications ", true, false, true, test);
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
