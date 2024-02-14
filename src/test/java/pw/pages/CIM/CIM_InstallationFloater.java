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

public class CIM_InstallationFloater extends OR_CIM{
	
	public void CIM_InstallationFloater_Details(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_InstallationFloater")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_InstallationFloater", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCIM_InstallationFloater_TXT_JobsiteLimit = (String) row.get("CIM_InstallationFloater_TXT_JobsiteLimit");
		String strCIM_InstallationFloater_TXT_CatastropheLimit = (String) row.get("CIM_InstallationFloater_TXT_CatastropheLimit");
		String strCIM_InstallationFloater_TXT_Receipts = (String) row.get("CIM_InstallationFloater_TXT_Receipts");
		String strCIM_InstallationFloater_TXT_AddDebrisRemovExpLimit = (String) row.get("CIM_InstallationFloater_TXT_AddDebrisRemovExpLimit");
		String strCIM_InstallationFloater_TXT_EmergencyRemovalDays = (String) row.get("CIM_InstallationFloater_TXT_EmergencyRemovalDays");
		String strCIM_InstallationFloater_TXT_LimitedFungusCovLimit = (String) row.get("CIM_InstallationFloater_TXT_LimitedFungusCovLimit");
		String strCIM_InstallationFloater_TXT_PollutantCleanUpAndRemovLim = (String) row.get("CIM_InstallationFloater_TXT_PollutantCleanUpAndRemovLim");
		String strCIM_InstallationFloater_TXT_SewerBackupCovLimit = (String) row.get("CIM_InstallationFloater_TXT_SewerBackupCovLimit");
		String strCIM_InstallationFloater_TXT_TransitLimit = (String) row.get("CIM_InstallationFloater_TXT_TransitLimit");
		String strCIM_InstallationFloater_TXT_TemporaryStorgLocLimit = (String) row.get("CIM_InstallationFloater_TXT_TemporaryStorgLocLimit");
		String strCIM_InstallationFloater_TXT_TransitAndTempStoLocLimPrem = (String) row.get("CIM_InstallationFloater_TXT_TransitAndTempStoLocLimPrem");
		String strCIM_InstallationFloater_TXT_AdditionalInformation = (String) row.get("CIM_InstallationFloater_TXT_AdditionalInformation");
		String strCIM_InstallationFloater_TXT_EquipBrkdwnAndTestPropDamageLim = (String) row.get("CIM_InstallationFloater_TXT_EquipBrkdwnAndTestPropDamageLim");
		String strCIM_InstallationFloater_TXT_EquipBrkdwnAndTestPollutantsLim = (String) row.get("CIM_InstallationFloater_TXT_EquipBrkdwnAndTestPollutantsLim");
		String strCIM_InstallationFloater_TXT_EquipBrkdwmAndTestPropDamageDed = (String) row.get("CIM_InstallationFloater_TXT_EquipBrkdwmAndTestPropDamageDed");
		String strCIM_InstallationFloater_TXT_AdditionalInfoEquipBrkdwnAndTestSch = (String) row.get("CIM_InstallationFloater_TXT_AdditionalInfoEquipBrkdwnAndTestSch");
		String strCIM_InstallationFloater_TXT_ContractPenaltyLimit = (String) row.get("CIM_InstallationFloater_TXT_ContractPenaltyLimit");
		String strCIM_InstallationFloater_TXT_EquipBrkdwnAndTestLimit = (String) row.get("CIM_InstallationFloater_TXT_EquipBrkdwnAndTestLimit");
		String strCIM_InstallationFloater_CHK_EarthquakeCoverage_Provided = (String) row.get("CIM_InstallationFloater_CHK_EarthquakeCoverage_Provided");
		String strCIM_InstallationFloater_TXT_EarthquakeCovEarthquakeLimit = (String) row.get("CIM_InstallationFloater_TXT_EarthquakeCovEarthquakeLimit");
		String strCIM_InstallationFloater_TXT_EarthquakeOccurenceLimit = (String) row.get("CIM_InstallationFloater_TXT_EarthquakeOccurenceLimit");
		String strCIM_InstallationFloater_TXT_EarthquakeCatastropheLimit = (String) row.get("CIM_InstallationFloater_TXT_EarthquakeCatastropheLimit");
		String strCIM_InstallationFloater_TXT_EarthquakeDeductibleAmount = (String) row.get("CIM_InstallationFloater_TXT_EarthquakeDeductibleAmount");
		String strCIM_InstallationFloater_CHK_OverrideInstallationFloaterBaseRate_Yes = (String) row.get("CIM_InstallationFloater_CHK_OverrideInstallationFloaterBaseRate_Yes");
		String strCIM_InstallationFloater_TXT_InstallationFloaterOverrideReason = (String) row.get("CIM_InstallationFloater_TXT_InstallationFloaterOverrideReason");
		String strCIM_InstallationFloater_CHK_OverrideInstallationFloaterBaseRate_No = (String) row.get("CIM_InstallationFloater_CHK_OverrideInstallationFloaterBaseRate_No");
		String strCIM_InstallationFloater_CHK_EarthquakeCoverage_NotProvided = (String) row.get("CIM_InstallationFloater_CHK_EarthquakeCoverage_NotProvided");
		String strCIM_InstallationFloater_CHK_FloodCoverage_Provided = (String) row.get("CIM_InstallationFloater_CHK_FloodCoverage_Provided");
		String strCIM_InstallationFloater_TXT_FloodLimit = (String) row.get("CIM_InstallationFloater_TXT_FloodLimit");
		String strCIM_InstallationFloater_TXT_FloodOccurenceLimit = (String) row.get("CIM_InstallationFloater_TXT_FloodOccurenceLimit");
		String strCIM_InstallationFloater_TXT_FloodCatastropheLimit = (String) row.get("CIM_InstallationFloater_TXT_FloodCatastropheLimit");
		String strCIM_InstallationFloater_TXT_FloodDeductibleAmount = (String) row.get("CIM_InstallationFloater_TXT_FloodDeductibleAmount");
		String strCIM_InstallationFloater_CHK_FloodCoverage_NotProvided = (String) row.get("CIM_InstallationFloater_CHK_FloodCoverage_NotProvided");
		String strCIM_InstallationFloater_TXT_InstallationBaseRate = (String) row.get("CIM_InstallationFloater_TXT_InstallationBaseRate");
		String strCIM_InstallationFloater_TXT_InstallationFloaterBaseRateOverride = (String) row.get("CIM_InstallationFloater_TXT_InstallationFloaterBaseRateOverride");
		String strCIM_InstallationFloater_TXT_InstallationFloater_CoinsuranceFtr = (String) row.get("CIM_InstallationFloater_TXT_InstallationFloater_CoinsuranceFtr");
		String strCIM_InstallationFloater_TXT_InstallationFloaterDedFtr = (String) row.get("CIM_InstallationFloater_TXT_InstallationFloaterDedFtr");
		String strCIM_InstallationFloater_TXT_InstallationFloater_TransitionFtr = (String) row.get("CIM_InstallationFloater_TXT_InstallationFloater_TransitionFtr");
		String strCIM_InstallationFloater_TXT_InstallationFloaterFinalRate = (String) row.get("CIM_InstallationFloater_TXT_InstallationFloaterFinalRate");
		String strCIM_InstallationFloater_TXT_InstallationFloater_Receipts = (String) row.get("CIM_InstallationFloater_TXT_InstallationFloater_Receipts");
		String strCIM_InstallationFloater_TXT_InstallationFloaterBasePrem = (String) row.get("CIM_InstallationFloater_TXT_InstallationFloaterBasePrem");
		String strCIM_InstallationFloater_TXT_InstallationFloaterOverridePrem = (String) row.get("CIM_InstallationFloater_TXT_InstallationFloaterOverridePrem");
		String strCIM_InstallationFloater_CHK_EarthquakeOverrideBaseRate_Yes = (String) row.get("CIM_InstallationFloater_CHK_EarthquakeOverrideBaseRate_Yes");
		String strCIM_InstallationFloater_TXT_EarthquakeOverrideReason = (String) row.get("CIM_InstallationFloater_TXT_EarthquakeOverrideReason");
		String strCIM_InstallationFloater_CHK_EarthquakeOverrideBaseRate_No = (String) row.get("CIM_InstallationFloater_CHK_EarthquakeOverrideBaseRate_No");
		String strCIM_InstallationFloater_TXT_EarrhquakeBaseRate = (String) row.get("CIM_InstallationFloater_TXT_EarrhquakeBaseRate");
		String strCIM_InstallationFloater_TXT_EarthquakeBaseRateOverride = (String) row.get("CIM_InstallationFloater_TXT_EarthquakeBaseRateOverride");
		String strCIM_InstallationFloater_TXT_Earthquake_CoinsuranceFtr = (String) row.get("CIM_InstallationFloater_TXT_Earthquake_CoinsuranceFtr");
		String strCIM_InstallationFloater_TXT_EarthquakeDedftr = (String) row.get("CIM_InstallationFloater_TXT_EarthquakeDedftr");
		String strCIM_InstallationFloater_TXT_EarthquakeFinalRate = (String) row.get("CIM_InstallationFloater_TXT_EarthquakeFinalRate");
		String strCIM_InstallationFloater_TXT_EarthquakeLimit = (String) row.get("CIM_InstallationFloater_TXT_EarthquakeLimit");
		String strCIM_InstallationFloater_TXT_EarthquakeBasePrem = (String) row.get("CIM_InstallationFloater_TXT_EarthquakeBasePrem");
		String strCIM_InstallationFloater_TXT_EarthquakeOverridePrem = (String) row.get("CIM_InstallationFloater_TXT_EarthquakeOverridePrem");
		String strCIM_InstallationFloater_CHK_FloodOverrideBaseRate_Yes = (String) row.get("CIM_InstallationFloater_CHK_FloodOverrideBaseRate_Yes");
		String strCIM_InstallationFloater_TXT_FloodOverrideReason = (String) row.get("CIM_InstallationFloater_TXT_FloodOverrideReason");
		String strCIM_InstallationFloater_CHK_FloodOverrideBaseRate_No = (String) row.get("CIM_InstallationFloater_CHK_FloodOverrideBaseRate_No");
		String strCIM_InstallationFloater_TXT_FloodBaseRate = (String) row.get("CIM_InstallationFloater_TXT_FloodBaseRate");
		String strCIM_InstallationFloater_TXT_FloodBaseOverride = (String) row.get("CIM_InstallationFloater_TXT_FloodBaseOverride");
		String strCIM_InstallationFloater_TXT_FloodBase_CoinsuranceFtr = (String) row.get("CIM_InstallationFloater_TXT_FloodBase_CoinsuranceFtr");
		String strCIM_InstallationFloater_TXT_FloodDedFtr = (String) row.get("CIM_InstallationFloater_TXT_FloodDedFtr");
		String strCIM_InstallationFloater_TXT_FloodFinalRate = (String) row.get("CIM_InstallationFloater_TXT_FloodFinalRate");
		String strCIM_InstallationFloater_TXT_FloodOverrideFinalRate = (String) row.get("CIM_InstallationFloater_TXT_FloodOverrideFinalRate");
		String strCIM_InstallationFloater_TXT_FloodRatingLimit = (String) row.get("CIM_InstallationFloater_TXT_FloodRatingLimit");
		String strCIM_InstallationFloater_TXT_FloodBasePrem = (String) row.get("CIM_InstallationFloater_TXT_FloodBasePrem");
		String strCIM_InstallationFloater_TXT_FloodOverridePrem = (String) row.get("CIM_InstallationFloater_TXT_FloodOverridePrem");
		String strCIM_InstallationFloater_TXT_InstallationFloaterMinPrem = (String) row.get("CIM_InstallationFloater_TXT_InstallationFloaterMinPrem");
		String strCIM_InstallationFloater_CHK_OverrideInstallationFloaterMinPrem_Yes = (String) row.get("CIM_InstallationFloater_CHK_OverrideInstallationFloaterMinPrem_Yes");
		String strCIM_InstallationFloater_TXT_InstallationFlaoterCovMinPremOverrideReasonSearchDisplay = (String) row.get("CIM_InstallationFloater_TXT_InstallationFlaoterCovMinPremOverrideReasonSearchDisplay");
		String strCIM_InstallationFloater_TXT_InstallationFlaoterCovMinPremOverrideReason = (String) row.get("CIM_InstallationFloater_TXT_InstallationFlaoterCovMinPremOverrideReason");
		String strCIM_InstallationFloater_CHK_OverrideInstallationFloaterMinPrem_No = (String) row.get("CIM_InstallationFloater_CHK_OverrideInstallationFloaterMinPrem_No");
		String strCIM_InstallationFloater_CHK_DoNotApplyCityOrCountyTaxes = (String) row.get("CIM_InstallationFloater_CHK_DoNotApplyCityOrCountyTaxes");
		String strCIM_InstallationFloater_CHK_AllCityName = (String) row.get("CIM_InstallationFloater_CHK_AllCityName");
		String strCIM_InstallationFloater_TXT_City = (String) row.get("CIM_InstallationFloater_TXT_City");
		String strCIM_InstallationFloater_TXT_CityCode = (String) row.get("CIM_InstallationFloater_TXT_CityCode");
		String strCIM_InstallationFloater_TXT_County = (String) row.get("CIM_InstallationFloater_TXT_County");
		String strCIM_InstallationFloater_TXT_CountyCode = (String) row.get("CIM_InstallationFloater_TXT_CountyCode");
		String strCIM_InstallationFloater_TXT_TaxCode = (String) row.get("CIM_InstallationFloater_TXT_TaxCode");
		String strCIM_InstallationFloater_TXT_Rating_InstalFloatBasePrem = (String) row.get("CIM_InstallationFloater_TXT_Rating_InstalFloatBasePrem");
		String strCIM_InstallationFloater_TXT_Rating_InstalFloatOverridePrem = (String) row.get("CIM_InstallationFloater_TXT_Rating_InstalFloatOverridePrem");
		String strCIM_InstallationFloater_TXT_Rating_EarthquakeBasePrem = (String) row.get("CIM_InstallationFloater_TXT_Rating_EarthquakeBasePrem");
		String strCIM_InstallationFloater_TXT_Rating_EarthquakeOverridePrem = (String) row.get("CIM_InstallationFloater_TXT_Rating_EarthquakeOverridePrem");
		String strCIM_InstallationFloater_TXT_Rating_FloodBasePrem = (String) row.get("CIM_InstallationFloater_TXT_Rating_FloodBasePrem");
		String strCIM_InstallationFloater_TXT_Rating_FloodOverridePrem = (String) row.get("CIM_InstallationFloater_TXT_Rating_FloodOverridePrem");
		String strCIM_InstallationFloater_TXT_Rating_TransitPrem = (String) row.get("CIM_InstallationFloater_TXT_Rating_TransitPrem");
		String strCIM_InstallationFloater_TXT_Rating_TotalInstallationFloaterCovPrem = (String) row.get("CIM_InstallationFloater_TXT_Rating_TotalInstallationFloaterCovPrem");
		String strCIM_InstallationFloater_TXT_Rating_InstallationFloaterMinPrem = (String) row.get("CIM_InstallationFloater_TXT_Rating_InstallationFloaterMinPrem");
		String strCIM_InstallationFloater_TXT_Rating_InstallationFloaterMinPremOverride = (String) row.get("CIM_InstallationFloater_TXT_Rating_InstallationFloaterMinPremOverride");
				String strTestDescription = (String) row.get("Transaction Name");
		try{
				se.log().logTestStep("CIM_InstallationFloater");
				test.log(LogStatus.INFO, "CIM_InstallationFloater page","Transaction Step : "+strTestDescription + "<br>" +"Page : CIM_InstallationFloater");
				se.verify().verifyEquals("CIM_InstallationFloater Page of PowerWriter ", getCIM_InstallationFloater_LabelName().isDisplayed(),true, true,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_JobsiteLimit(strCIM_InstallationFloater_TXT_JobsiteLimit),strCIM_InstallationFloater_TXT_JobsiteLimit,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_CatastropheLimit(strCIM_InstallationFloater_TXT_CatastropheLimit),strCIM_InstallationFloater_TXT_CatastropheLimit,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_Receipts(strCIM_InstallationFloater_TXT_Receipts),strCIM_InstallationFloater_TXT_Receipts,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_AddDebrisRemovExpLimit(strCIM_InstallationFloater_TXT_AddDebrisRemovExpLimit),strCIM_InstallationFloater_TXT_AddDebrisRemovExpLimit,test);
				se.element().waitForElementIsDisplayed(Common_Popup_BTN_OK, 10);
		        if(se.element().isElementPresent(Common_Popup_BTN_OK)){
		              se.element().Click(getCommon_Popup_BTN_OK(), test);
		        }
				se.element().selectPopupWithMagnifier(getCIM_InstallationFloater_TXT_EmergencyRemovalDays(strCIM_InstallationFloater_TXT_EmergencyRemovalDays), getCIM_InstallationFloater_BTN_EmergencyRemovalDaysSearch(strCIM_InstallationFloater_TXT_EmergencyRemovalDays), strCIM_InstallationFloater_TXT_EmergencyRemovalDays, constants.NA, strCIM_InstallationFloater_TXT_EmergencyRemovalDays, constants.NA, constants.NA, constants.NA, test);
				se.element().waitForElementIsDisplayed(Common_Popup_BTN_OK, 10);
		        if(se.element().isElementPresent(Common_Popup_BTN_OK)){
		              se.element().Click(getCommon_Popup_BTN_OK(), test);
		        }
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_LimitedFungusCovLimit(strCIM_InstallationFloater_TXT_LimitedFungusCovLimit),strCIM_InstallationFloater_TXT_LimitedFungusCovLimit,test);
				se.element().waitForElementIsDisplayed(Common_Popup_BTN_OK, 10);
		        if(se.element().isElementPresent(Common_Popup_BTN_OK)){
		              se.element().Click(getCommon_Popup_BTN_OK(), test);
		        }
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_PollutantCleanUpAndRemovLim(strCIM_InstallationFloater_TXT_PollutantCleanUpAndRemovLim),strCIM_InstallationFloater_TXT_PollutantCleanUpAndRemovLim,test);
				se.element().waitForElementIsDisplayed(Common_Popup_BTN_OK, 10);
		        if(se.element().isElementPresent(Common_Popup_BTN_OK)){
		              se.element().Click(getCommon_Popup_BTN_OK(), test);
		        }
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_SewerBackupCovLimit(strCIM_InstallationFloater_TXT_SewerBackupCovLimit),strCIM_InstallationFloater_TXT_SewerBackupCovLimit,test);
				se.element().waitForElementIsDisplayed(Common_Popup_BTN_OK, 10);
		        if(se.element().isElementPresent(Common_Popup_BTN_OK)){
		              se.element().Click(getCommon_Popup_BTN_OK(), test);
		        }
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_TransitLimit(strCIM_InstallationFloater_TXT_TransitLimit),strCIM_InstallationFloater_TXT_TransitLimit,test);
				se.element().waitForElementIsDisplayed(Common_Popup_BTN_OK, 10);
		        if(se.element().isElementPresent(Common_Popup_BTN_OK)){
		              se.element().Click(getCommon_Popup_BTN_OK(), test);
		        }
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_TemporaryStorgLocLimit(strCIM_InstallationFloater_TXT_TemporaryStorgLocLimit),strCIM_InstallationFloater_TXT_TemporaryStorgLocLimit,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_TransitAndTempStoLocLimPrem(strCIM_InstallationFloater_TXT_TransitAndTempStoLocLimPrem),strCIM_InstallationFloater_TXT_TransitAndTempStoLocLimPrem,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_AdditionalInformation(strCIM_InstallationFloater_TXT_AdditionalInformation),strCIM_InstallationFloater_TXT_AdditionalInformation,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_EquipBrkdwnAndTestPropDamageLim(strCIM_InstallationFloater_TXT_EquipBrkdwnAndTestPropDamageLim),strCIM_InstallationFloater_TXT_EquipBrkdwnAndTestPropDamageLim,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_EquipBrkdwnAndTestPollutantsLim(strCIM_InstallationFloater_TXT_EquipBrkdwnAndTestPollutantsLim),strCIM_InstallationFloater_TXT_EquipBrkdwnAndTestPollutantsLim,test);
				se.element().selectPopupWithMagnifier(getCIM_InstallationFloater_TXT_EquipBrkdwmAndTestPropDamageDed(strCIM_InstallationFloater_TXT_EquipBrkdwmAndTestPropDamageDed), getCIM_InstallationFloater_BTN_EquipBrkdwmAndTestPropDamageDedSearch(strCIM_InstallationFloater_TXT_EquipBrkdwmAndTestPropDamageDed), strCIM_InstallationFloater_TXT_EquipBrkdwmAndTestPropDamageDed, constants.NA, strCIM_InstallationFloater_TXT_EquipBrkdwmAndTestPropDamageDed, constants.NA, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_AdditionalInfoEquipBrkdwnAndTestSch(strCIM_InstallationFloater_TXT_AdditionalInfoEquipBrkdwnAndTestSch),strCIM_InstallationFloater_TXT_AdditionalInfoEquipBrkdwnAndTestSch,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_ContractPenaltyLimit(strCIM_InstallationFloater_TXT_ContractPenaltyLimit),strCIM_InstallationFloater_TXT_ContractPenaltyLimit,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_EquipBrkdwnAndTestLimit(strCIM_InstallationFloater_TXT_EquipBrkdwnAndTestLimit),strCIM_InstallationFloater_TXT_EquipBrkdwnAndTestLimit,test);
				se.element().checkUncheckOrValidate(getCIM_InstallationFloater_CHK_EarthquakeCoverage_Provided(strCIM_InstallationFloater_CHK_EarthquakeCoverage_Provided),strCIM_InstallationFloater_CHK_EarthquakeCoverage_Provided,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_EarthquakeLimit(strCIM_InstallationFloater_TXT_EarthquakeCovEarthquakeLimit),strCIM_InstallationFloater_TXT_EarthquakeCovEarthquakeLimit,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_EarthquakeOccurenceLimit(strCIM_InstallationFloater_TXT_EarthquakeOccurenceLimit),strCIM_InstallationFloater_TXT_EarthquakeOccurenceLimit,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_EarthquakeCatastropheLimit(strCIM_InstallationFloater_TXT_EarthquakeCatastropheLimit),strCIM_InstallationFloater_TXT_EarthquakeCatastropheLimit,test);
				se.element().selectPopupWithMagnifier(getCIM_InstallationFloater_TXT_EarthquakeDeductibleAmount(strCIM_InstallationFloater_TXT_EarthquakeDeductibleAmount), getCIM_InstallationFloater_BTN_EarthquakeDeductibleAmountSearch(strCIM_InstallationFloater_TXT_EarthquakeDeductibleAmount), strCIM_InstallationFloater_TXT_EarthquakeDeductibleAmount, constants.NA, strCIM_InstallationFloater_TXT_EarthquakeDeductibleAmount, constants.NA, constants.NA, constants.NA, test);
				se.element().checkUncheckOrValidate(getCIM_InstallationFloater_CHK_OverrideInstallationFloaterBaseRate_Yes(strCIM_InstallationFloater_CHK_OverrideInstallationFloaterBaseRate_Yes),strCIM_InstallationFloater_CHK_OverrideInstallationFloaterBaseRate_Yes,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_InstallationFloaterOverrideReason(strCIM_InstallationFloater_TXT_InstallationFloaterOverrideReason),strCIM_InstallationFloater_TXT_InstallationFloaterOverrideReason,test);
				se.element().checkUncheckOrValidate(getCIM_InstallationFloater_CHK_OverrideInstallationFloaterBaseRate_No(strCIM_InstallationFloater_CHK_OverrideInstallationFloaterBaseRate_No),strCIM_InstallationFloater_CHK_OverrideInstallationFloaterBaseRate_No,test);
				se.element().checkUncheckOrValidate(getCIM_InstallationFloater_CHK_EarthquakeCoverage_NotProvided(strCIM_InstallationFloater_CHK_EarthquakeCoverage_NotProvided),strCIM_InstallationFloater_CHK_EarthquakeCoverage_NotProvided,test);
				se.element().checkUncheckOrValidate(getCIM_InstallationFloater_CHK_FloodCoverage_Provided(strCIM_InstallationFloater_CHK_FloodCoverage_Provided),strCIM_InstallationFloater_CHK_FloodCoverage_Provided,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_FloodLimit(strCIM_InstallationFloater_TXT_FloodLimit),strCIM_InstallationFloater_TXT_FloodLimit,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_FloodOccurenceLimit(strCIM_InstallationFloater_TXT_FloodOccurenceLimit),strCIM_InstallationFloater_TXT_FloodOccurenceLimit,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_FloodCatastropheLimit(strCIM_InstallationFloater_TXT_FloodCatastropheLimit),strCIM_InstallationFloater_TXT_FloodCatastropheLimit,test);
				se.element().selectPopupWithMagnifier(getCIM_InstallationFloater_TXT_FloodDeductibleAmount(strCIM_InstallationFloater_TXT_FloodDeductibleAmount), getCIM_InstallationFloater_BTN_FloodDeductibleAmountSearch(strCIM_InstallationFloater_TXT_FloodDeductibleAmount), strCIM_InstallationFloater_TXT_FloodDeductibleAmount, constants.NA, strCIM_InstallationFloater_TXT_FloodDeductibleAmount, constants.NA, constants.NA, constants.NA, test);
				se.element().checkUncheckOrValidate(getCIM_InstallationFloater_CHK_FloodCoverage_NotProvided(strCIM_InstallationFloater_CHK_FloodCoverage_NotProvided),strCIM_InstallationFloater_CHK_FloodCoverage_NotProvided,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_InstallationBaseRate(strCIM_InstallationFloater_TXT_InstallationBaseRate),strCIM_InstallationFloater_TXT_InstallationBaseRate,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_InstallationFloaterBaseRateOverride(strCIM_InstallationFloater_TXT_InstallationFloaterBaseRateOverride),strCIM_InstallationFloater_TXT_InstallationFloaterBaseRateOverride,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_InstallationFloater_CoinsuranceFtr(strCIM_InstallationFloater_TXT_InstallationFloater_CoinsuranceFtr),strCIM_InstallationFloater_TXT_InstallationFloater_CoinsuranceFtr,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_InstallationFloaterDedFtr(strCIM_InstallationFloater_TXT_InstallationFloaterDedFtr),strCIM_InstallationFloater_TXT_InstallationFloaterDedFtr,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_InstallationFloater_TransitionFtr(strCIM_InstallationFloater_TXT_InstallationFloater_TransitionFtr),strCIM_InstallationFloater_TXT_InstallationFloater_TransitionFtr,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_InstallationFloaterFinalRate(strCIM_InstallationFloater_TXT_InstallationFloaterFinalRate),strCIM_InstallationFloater_TXT_InstallationFloaterFinalRate,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_InstallationFloater_Receipts(strCIM_InstallationFloater_TXT_InstallationFloater_Receipts),strCIM_InstallationFloater_TXT_InstallationFloater_Receipts,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_InstallationFloaterBasePrem(strCIM_InstallationFloater_TXT_InstallationFloaterBasePrem),strCIM_InstallationFloater_TXT_InstallationFloaterBasePrem,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_InstallationFloaterOverridePrem(strCIM_InstallationFloater_TXT_InstallationFloaterOverridePrem),strCIM_InstallationFloater_TXT_InstallationFloaterOverridePrem,test);
				se.element().checkUncheckOrValidate(getCIM_InstallationFloater_CHK_EarthquakeOverrideBaseRate_Yes(strCIM_InstallationFloater_CHK_EarthquakeOverrideBaseRate_Yes),strCIM_InstallationFloater_CHK_EarthquakeOverrideBaseRate_Yes,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_EarthquakeOverrideReason(strCIM_InstallationFloater_TXT_EarthquakeOverrideReason),strCIM_InstallationFloater_TXT_EarthquakeOverrideReason,test);
				se.element().checkUncheckOrValidate(getCIM_InstallationFloater_CHK_EarthquakeOverrideBaseRate_No(strCIM_InstallationFloater_CHK_EarthquakeOverrideBaseRate_No),strCIM_InstallationFloater_CHK_EarthquakeOverrideBaseRate_No,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_EarrhquakeBaseRate(strCIM_InstallationFloater_TXT_EarrhquakeBaseRate),strCIM_InstallationFloater_TXT_EarrhquakeBaseRate,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_EarthquakeBaseRateOverride(strCIM_InstallationFloater_TXT_EarthquakeBaseRateOverride),strCIM_InstallationFloater_TXT_EarthquakeBaseRateOverride,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_Earthquake_CoinsuranceFtr(strCIM_InstallationFloater_TXT_Earthquake_CoinsuranceFtr),strCIM_InstallationFloater_TXT_Earthquake_CoinsuranceFtr,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_EarthquakeDedftr(strCIM_InstallationFloater_TXT_EarthquakeDedftr),strCIM_InstallationFloater_TXT_EarthquakeDedftr,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_EarthquakeFinalRate(strCIM_InstallationFloater_TXT_EarthquakeFinalRate),strCIM_InstallationFloater_TXT_EarthquakeFinalRate,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_EarthquakeLimit(strCIM_InstallationFloater_TXT_EarthquakeLimit),strCIM_InstallationFloater_TXT_EarthquakeLimit,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_EarthquakeBasePrem(strCIM_InstallationFloater_TXT_EarthquakeBasePrem),strCIM_InstallationFloater_TXT_EarthquakeBasePrem,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_EarthquakeOverridePrem(strCIM_InstallationFloater_TXT_EarthquakeOverridePrem),strCIM_InstallationFloater_TXT_EarthquakeOverridePrem,test);
				se.element().checkUncheckOrValidate(getCIM_InstallationFloater_CHK_FloodOverrideBaseRate_Yes(strCIM_InstallationFloater_CHK_FloodOverrideBaseRate_Yes),strCIM_InstallationFloater_CHK_FloodOverrideBaseRate_Yes,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_FloodOverrideReason(strCIM_InstallationFloater_TXT_FloodOverrideReason),strCIM_InstallationFloater_TXT_FloodOverrideReason,test);
				se.element().checkUncheckOrValidate(getCIM_InstallationFloater_CHK_FloodOverrideBaseRate_No(strCIM_InstallationFloater_CHK_FloodOverrideBaseRate_No),strCIM_InstallationFloater_CHK_FloodOverrideBaseRate_No,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_FloodBaseRate(strCIM_InstallationFloater_TXT_FloodBaseRate),strCIM_InstallationFloater_TXT_FloodBaseRate,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_FloodBaseOverride(strCIM_InstallationFloater_TXT_FloodBaseOverride),strCIM_InstallationFloater_TXT_FloodBaseOverride,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_FloodBase_CoinsuranceFtr(strCIM_InstallationFloater_TXT_FloodBase_CoinsuranceFtr),strCIM_InstallationFloater_TXT_FloodBase_CoinsuranceFtr,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_FloodDedFtr(strCIM_InstallationFloater_TXT_FloodDedFtr),strCIM_InstallationFloater_TXT_FloodDedFtr,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_FloodFinalRate(strCIM_InstallationFloater_TXT_FloodFinalRate),strCIM_InstallationFloater_TXT_FloodFinalRate,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_FloodOverrideFinalRate(strCIM_InstallationFloater_TXT_FloodOverrideFinalRate),strCIM_InstallationFloater_TXT_FloodOverrideFinalRate,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_FloodLimit(strCIM_InstallationFloater_TXT_FloodRatingLimit),strCIM_InstallationFloater_TXT_FloodRatingLimit,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_FloodBasePrem(strCIM_InstallationFloater_TXT_FloodBasePrem),strCIM_InstallationFloater_TXT_FloodBasePrem,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_FloodOverridePrem(strCIM_InstallationFloater_TXT_FloodOverridePrem),strCIM_InstallationFloater_TXT_FloodOverridePrem,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_InstallationFloaterMinPrem(strCIM_InstallationFloater_TXT_InstallationFloaterMinPrem),strCIM_InstallationFloater_TXT_InstallationFloaterMinPrem,test);
				se.element().checkUncheckOrValidate(getCIM_InstallationFloater_CHK_OverrideInstallationFloaterMinPrem_Yes(strCIM_InstallationFloater_CHK_OverrideInstallationFloaterMinPrem_Yes),strCIM_InstallationFloater_CHK_OverrideInstallationFloaterMinPrem_Yes,test);
				se.element().selectPopupWithMagnifier(getCIM_InstallationFloater_TXT_InstallationFlaoterCovMinPremOverrideReason(strCIM_InstallationFloater_TXT_InstallationFlaoterCovMinPremOverrideReason), getCIM_InstallationFloater_BTN_InstallationFlaoterCovMinPremOverrideReasonSearch(strCIM_InstallationFloater_TXT_InstallationFlaoterCovMinPremOverrideReason), strCIM_InstallationFloater_TXT_InstallationFlaoterCovMinPremOverrideReason, strCIM_InstallationFloater_TXT_InstallationFlaoterCovMinPremOverrideReasonSearchDisplay, strCIM_InstallationFloater_TXT_InstallationFlaoterCovMinPremOverrideReason, constants.NA, constants.NA, constants.NA, test);
				se.element().checkUncheckOrValidate(getCIM_InstallationFloater_CHK_OverrideInstallationFloaterMinPrem_No(strCIM_InstallationFloater_CHK_OverrideInstallationFloaterMinPrem_No),strCIM_InstallationFloater_CHK_OverrideInstallationFloaterMinPrem_No,test);
				se.element().checkUncheckOrValidate(getCIM_InstallationFloater_CHK_DoNotApplyCityOrCountyTaxes(strCIM_InstallationFloater_CHK_DoNotApplyCityOrCountyTaxes),strCIM_InstallationFloater_CHK_DoNotApplyCityOrCountyTaxes,test);
				se.element().checkUncheckOrValidate(getCIM_InstallationFloater_CHK_AllCityName(strCIM_InstallationFloater_CHK_AllCityName),strCIM_InstallationFloater_CHK_AllCityName,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_City(strCIM_InstallationFloater_TXT_City),strCIM_InstallationFloater_TXT_City,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_CityCode(strCIM_InstallationFloater_TXT_CityCode),strCIM_InstallationFloater_TXT_CityCode,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_County(strCIM_InstallationFloater_TXT_County),strCIM_InstallationFloater_TXT_County,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_CountyCode(strCIM_InstallationFloater_TXT_CountyCode),strCIM_InstallationFloater_TXT_CountyCode,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_TaxCode(strCIM_InstallationFloater_TXT_TaxCode),strCIM_InstallationFloater_TXT_TaxCode,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_Rating_InstalFloatBasePrem(strCIM_InstallationFloater_TXT_Rating_InstalFloatBasePrem),strCIM_InstallationFloater_TXT_Rating_InstalFloatBasePrem,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_Rating_InstalFloatOverridePrem(strCIM_InstallationFloater_TXT_Rating_InstalFloatOverridePrem),strCIM_InstallationFloater_TXT_Rating_InstalFloatOverridePrem,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_Rating_EarthquakeBasePrem(strCIM_InstallationFloater_TXT_Rating_EarthquakeBasePrem),strCIM_InstallationFloater_TXT_Rating_EarthquakeBasePrem,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_Rating_EarthquakeOverridePrem(strCIM_InstallationFloater_TXT_Rating_EarthquakeOverridePrem),strCIM_InstallationFloater_TXT_Rating_EarthquakeOverridePrem,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_Rating_FloodBasePrem(strCIM_InstallationFloater_TXT_Rating_FloodBasePrem),strCIM_InstallationFloater_TXT_Rating_FloodBasePrem,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_Rating_FloodOverridePrem(strCIM_InstallationFloater_TXT_Rating_FloodOverridePrem),strCIM_InstallationFloater_TXT_Rating_FloodOverridePrem,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_Rating_TransitPrem(strCIM_InstallationFloater_TXT_Rating_TransitPrem),strCIM_InstallationFloater_TXT_Rating_TransitPrem,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_Rating_TotalInstallationFloaterCovPrem(strCIM_InstallationFloater_TXT_Rating_TotalInstallationFloaterCovPrem),strCIM_InstallationFloater_TXT_Rating_TotalInstallationFloaterCovPrem,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_Rating_InstallationFloaterMinPrem(strCIM_InstallationFloater_TXT_Rating_InstallationFloaterMinPrem),strCIM_InstallationFloater_TXT_Rating_InstallationFloaterMinPrem,test);
				se.element().enterOrValidateText(getCIM_InstallationFloater_TXT_Rating_InstallationFloaterMinPremOverride(strCIM_InstallationFloater_TXT_Rating_InstallationFloaterMinPremOverride),strCIM_InstallationFloater_TXT_Rating_InstallationFloaterMinPremOverride,test);
				se.element().Click(getNext(),test);
			

			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for CIM_InstallationFloater ", true, false, true, test);
							
					
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