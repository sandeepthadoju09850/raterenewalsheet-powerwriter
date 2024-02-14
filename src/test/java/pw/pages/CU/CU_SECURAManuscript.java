package pw.pages.CU;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Keys;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CU;

public class CU_SECURAManuscript extends OR_CU {

	public void SECURAManuscript_Main(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		try {
			
			if (suspendSheet.equalsIgnoreCase("SecuraManuscript")) {
				test.log(LogStatus.INFO, "Page Suspended :- ",
						"Transaction Step : " + transaction + "<br>" + "Page : " + suspendSheet);
				testTearDown(se, test);
			}
			List<Map<String, String>> table = ExcelOperations.getPagesData("SECURAManuscript", strRegressionID,
					transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strSecuraManuscript_BTN_Add = (String) row.get("SecuraManuscript_BTN_Add");
				String strSecuraManuscript_BTN_Details = (String) row.get("SecuraManuscript_BTN_Details");
				String strSecuraManuscript_BTN_Delete = (String) row.get("SecuraManuscript_BTN_Delete");
				String strSecuraManuscript_BTN_Done = (String) row.get("SecuraManuscript_BTN_Done");
				String strSecuraManuscript_TXT_State = (String) row.get("SecuraManuscript_TXT_State");
				String strSecuraManuscript_TXT_Form = (String) row.get("SecuraManuscript_TXT_Form");

				try {
					se.log().logTestStep("Entering details on SECURAManuscript Page");
					test.log(LogStatus.INFO, "Entering details on SECURAManuscript Page screen",
							"Transaction Step : " + transaction + "<br>" + "Page : SECURAManuscript Page");
					se.verify().verifyEquals("SECURAManuscript displayed",
							getPagecontainingtext("SECURA Manuscript").isDisplayed(), true, true, test);
					if (!strSecuraManuscript_BTN_Details.equals(constants.NA)) {
						se.element().clickElement(getCU_Manuscript_Details_BTN(strSecuraManuscript_BTN_Details), test);
						se.verify().verifyEquals("Auto dealers Policy Info details is displayed ",
								getcommon_BTN_SaveAndNew().isDisplayed(), true, true, test);
					}
					if (!strSecuraManuscript_BTN_Add.equals(constants.NA)) {
						se.element().clickElement(getCU_Manuscript_ADD_BTN(strSecuraManuscript_BTN_Add), test);
					}
					if (!strSecuraManuscript_BTN_Delete.equals(constants.NA)) {
						se.element().clickElement(getCU_Manuscript_DELETE_BTN(strSecuraManuscript_BTN_Delete), test);
					}
					Thread.sleep(2000);
					se.element().enterOrValidateText(getCU_Manuscript_State_TXT(strSecuraManuscript_TXT_State), strSecuraManuscript_TXT_State, test);
					se.element().enterOrValidateText(getCU_Manuscript_Form_TXT(strSecuraManuscript_TXT_Form), strSecuraManuscript_TXT_Form, test);
					ManuscriptDetails(row, test);
					KYTaxInformation(row, test);
					if(strSecuraManuscript_BTN_Delete.equals(constants.NA)){
					se.element().Click(getNext(), test);
					}
					if (strSecuraManuscript_BTN_Done.equalsIgnoreCase(constants.Yes)) {
						se.element().Click(getNext(), test);
					}
				} catch (Exception e) {
					se.verify().verifyEquals("Failed to fill in details for CU_SECURAManuscript_Main ",
							true, false, true, test);
				}
				iteration++;
			}
		} catch (Exception e) {
			se.log().logTestStep(
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			test.log(LogStatus.FAIL, "Failed",
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			testTearDown(se, test);
		}
	}

	public void ManuscriptDetails(Map<String, String> row, ExtentTest test) throws IOException {

		String strSecuraManuscript_TXT_Option = (String) row.get("SecuraManuscript_TXT_Option");
		String strSecuraManuscript_TXT_OptionFilterNeeded = (String) row.get("SecuraManuscript_TXT_OptionFilterNeeded");
		String strSecuraManuscript_TXT_FormBasedOnOptionSelected = (String) row
				.get("SecuraManuscript_TXT_FormBasedOnOptionSelected");
		String strSecuraManuscript_TXT_Description = (String) row.get("SecuraManuscript_TXT_Description");
		String strSecuraManuscript_CHK_Edit = (String) row.get("SecuraManuscript_CHK_Edit");
		String strSecuraManuscript_TXT_ClassCode = (String) row.get("SecuraManuscript_TXT_ClassCode");
		String strSecuraManuscript_TXT_ClassCodeFilterNeeded = (String) row
				.get("SecuraManuscript_TXT_ClassCodeFilterNeeded");
		String strSecuraManuscript_TXT_AnnualPremium = (String) row.get("SecuraManuscript_TXT_AnnualPremium");
		String strSecuraManuscript_CHK_PremiumChargeType_ProRate = (String) row
				.get("SecuraManuscript_CHK_PremiumChargeType_ProRate");
		String strSecuraManuscript_CHK_PremiumChargeType_FlatType = (String) row
				.get("SecuraManuscript_CHK_PremiumChargeType_FlatType");
		String strSecuraManuscript_CHK_PremiumChargeType_FullyEarned = (String) row
				.get("SecuraManuscript_CHK_PremiumChargeType_FullyEarned");
		try {
			se.element().selectPopupWithMagnifier(getCU_Manuscript_Option_TXT(strSecuraManuscript_TXT_Option), getCU_Manuscript_Option_Search_BTN(strSecuraManuscript_TXT_Option),
					strSecuraManuscript_TXT_Option, strSecuraManuscript_TXT_OptionFilterNeeded,
					strSecuraManuscript_TXT_Option, constants.NA, constants.NA, constants.NA, test);

			se.element().enterOrValidateText(getCU_Manuscript_FormBasedOnOptionSelected_TXT(strSecuraManuscript_TXT_FormBasedOnOptionSelected),
					strSecuraManuscript_TXT_FormBasedOnOptionSelected, test);
			se.element().checkUncheckOrValidate(getCU_Manuscript_CHK_Edit(strSecuraManuscript_CHK_Edit),
					strSecuraManuscript_CHK_Edit, test);
			
			if (!strSecuraManuscript_TXT_Description.equalsIgnoreCase("N/A")&&!strSecuraManuscript_TXT_Description.contains("validate2")) {
			getCU_Manuscript_Description_TXTArea("strSecuraManuscript_TXT_Description").sendKeys(Keys.chord(Keys.CONTROL, "a"));
			getCU_Manuscript_Description_TXTArea("strSecuraManuscript_TXT_Description").sendKeys(Keys.chord(Keys.CONTROL, "x"));}
			se.element().enter_textRich(getCU_Manuscript_Description_TXTArea(strSecuraManuscript_TXT_Description),
					strSecuraManuscript_TXT_Description, test);
			se.element().selectClasscode(getCU_Manuscript_ClassCode_TXT(strSecuraManuscript_TXT_ClassCode),
					strSecuraManuscript_TXT_ClassCodeFilterNeeded, strSecuraManuscript_TXT_ClassCode, constants.NA,
					constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCU_Manuscript_AnnualPrem_TXT(strSecuraManuscript_TXT_AnnualPremium), strSecuraManuscript_TXT_AnnualPremium,
					test);
			se.element().checkUncheckOrValidate(getCU_Manuscript_PremChargeTyp_ProRate_RDO(strSecuraManuscript_CHK_PremiumChargeType_ProRate),
					strSecuraManuscript_CHK_PremiumChargeType_ProRate, test);
			se.element().checkUncheckOrValidate(getCU_Manuscript_PremChargeTyp_FlatCharge_RDO(strSecuraManuscript_CHK_PremiumChargeType_FlatType),
					strSecuraManuscript_CHK_PremiumChargeType_FlatType, test);
			se.element().checkUncheckOrValidate(getCU_Manuscript_PremChargeTyp_FullyEarned_RDO(strSecuraManuscript_CHK_PremiumChargeType_FullyEarned),
					strSecuraManuscript_CHK_PremiumChargeType_FullyEarned, test);

		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for ManuscriptDetails", true, false, true,
					test);

		}
	}

	public void KYTaxInformation(Map<String, String> row, ExtentTest test) throws IOException {
		String strSecuraManuscript_CHK_DoNotApplyCityOrCountyTaxes = (String) row
				.get("SecuraManuscript_CHK_DoNotApplyCityOrCountyTaxes");
		String strSecuraManuscript_CHK_AllCityName = (String) row.get("SecuraManuscript_CHK_AllCityName");
		String strSecuraManuscript_TXT_City = (String) row.get("SecuraManuscript_TXT_City");
		String strSecuraManuscript_TXT_CityCode = (String) row.get("SecuraManuscript_TXT_CityCode");
		String strSecuraManuscript_TXT_County = (String) row.get("SecuraManuscript_TXT_County");
		String strSecuraManuscript_TXT_CountyCode = (String) row.get("SecuraManuscript_TXT_CountyCode");
		String strSecuraManuscript_TXT_TaxCode = (String) row.get("SecuraManuscript_TXT_TaxCode");

		try {
			se.element().checkUncheckOrValidate(
					getCommon_KYTax_CHK_DoNotApplyTaxes(strSecuraManuscript_CHK_DoNotApplyCityOrCountyTaxes),
					strSecuraManuscript_CHK_DoNotApplyCityOrCountyTaxes, test);
			se.element().checkUncheckOrValidate(getCommon_KYTax_CHK_AllCityName(strSecuraManuscript_CHK_AllCityName),
					strSecuraManuscript_CHK_AllCityName, test);
			if (!strSecuraManuscript_CHK_DoNotApplyCityOrCountyTaxes.equalsIgnoreCase(constants.NA)) {
				if (!getCommon_KYTax_CHK_DoNotApplyTaxes(strSecuraManuscript_CHK_DoNotApplyCityOrCountyTaxes)
						.isSelected()) {
					se.element().enterOrValidateText(getCommon_KYTax_TXT_City(strSecuraManuscript_TXT_City),
							strSecuraManuscript_TXT_City, test);
					se.element().enterOrValidateText(getCommon_KYTax_TXT_CityCode(strSecuraManuscript_TXT_CityCode),
							strSecuraManuscript_TXT_CityCode, test);
					se.element().enterOrValidateText(getCommon_KYTax_TXT_County(strSecuraManuscript_TXT_County),
							strSecuraManuscript_TXT_County, test);
					se.element().enterOrValidateText(getCommon_KYTax_TXT_CountyCode(strSecuraManuscript_TXT_CountyCode),
							strSecuraManuscript_TXT_CountyCode, test);
					se.element().enterOrValidateText(getCommon_KYTax_TXT_TaxCode(strSecuraManuscript_TXT_TaxCode),
							strSecuraManuscript_TXT_TaxCode, test);
				}
			}
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CU_Main_KYTax Info section", true, false, true,
					test);

		}
	}
}
