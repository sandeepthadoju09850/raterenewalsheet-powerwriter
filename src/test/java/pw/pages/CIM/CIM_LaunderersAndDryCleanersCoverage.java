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

public class CIM_LaunderersAndDryCleanersCoverage extends OR_CIM{
	
	public void LaunderersAndDryCleanersCoverage(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_LaunderersAndDryCleanersCov")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_LaunderersAndDryCleanersCov", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_TotalSalesAllLocations = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_TotalSalesAllLocations");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_AddtnlDebrisRemovalExpLim = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_AddtnlDebrisRemovalExpLim");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_DefenseCosts = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_DefenseCosts");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_EmergencyRemoval = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_EmergencyRemoval");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_EarnedChargesLim = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_EarnedChargesLim");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_NewAcqPremisesLim = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_NewAcqPremisesLim");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_PollutantCleanupAndRemovalLim = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_PollutantCleanupAndRemovalLim");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_TransitLim = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_TransitLim");
		String strCIM_LaunderersAndDryCleanersCoverage_CHK_EarthquakeCoverage_Provided = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_CHK_EarthquakeCoverage_Provided");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeLim = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeLim");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeCatastropheLlim = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeCatastropheLlim");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeDedAmount = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeDedAmount");
		String strCIM_LaunderersAndDryCleanersCoverage_CHK_EarthquakeCoverage_NotProvided = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_CHK_EarthquakeCoverage_NotProvided");
		String strCIM_LaunderersAndDryCleanersCoverage_CHK_FloodCoverage_Provided = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_CHK_FloodCoverage_Provided");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_FloodLim = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_FloodLim");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_FloodCatastropheLim = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_FloodCatastropheLim");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_FloodDedAmt = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_FloodDedAmt");
		String strCIM_LaunderersAndDryCleanersCoverage_CHK_FloodCoverage_NotProvided = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_CHK_FloodCoverage_NotProvided");
		String strCIM_LaunderersAndDryCleanersCoverage_CHK_SewerBackupCoverage_Provided = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_CHK_SewerBackupCoverage_Provided");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupLim = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupLim");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupCatastropheLim = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupCatastropheLim");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupDedAmt = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupDedAmt");
		String strCIM_LaunderersAndDryCleanersCoverage_CHK_SewerBackupCoverage_NotProvided = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_CHK_SewerBackupCoverage_NotProvided");
		String strCIM_LaunderersAndDryCleanersCoverage_CHK_ReportingConditions_Waived = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_CHK_ReportingConditions_Waived");
		String strCIM_LaunderersAndDryCleanersCoverage_CHK_ReportingConditions_AnnualReporting = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_CHK_ReportingConditions_AnnualReporting");
		String strCIM_LaunderersAndDryCleanersCoverage_CHK_DryCleanersFullGoodsInProCov = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_CHK_DryCleanersFullGoodsInProCov");
		String strCIM_LaunderersAndDryCleanersCoverage_CHK_DryCleanersMissingGoodsCov = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_CHK_DryCleanersMissingGoodsCov");
		String strCIM_LaunderersAndDryCleanersCoverage_CHK_DryCleanersLtdCovForGoodsInProAndFurGrmts = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_CHK_DryCleanersLtdCovForGoodsInProAndFurGrmts");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_AdditionalInformation = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_AdditionalInformation");
		String strCIM_LaunderersAndDryCleanersCoverage_CHK_OverrideBaseRate_Yes = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_CHK_OverrideBaseRate_Yes");
		String strCIM_LaunderersAndDryCleanersCoverage_CHK_OverrideBaseRate_No = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_CHK_OverrideBaseRate_No");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_OverrideReason = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_OverrideReason");
		String strCIM_LaunderersAndDryCleanersCoverage_CHK_DoNotApplyCityOrCountyTaxes = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_CHK_DoNotApplyCityOrCountyTaxes");
		String strCIM_LaunderersAndDryCleanersCoverage_CHK_AllCityName = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_CHK_AllCityName");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_City = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_City");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_CityCode = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_CityCode");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_County = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_County");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_CountyCode = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_CountyCode");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_TaxCode = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_TaxCode");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_BaseRate = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_BaseRate");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_BaseRateOverride = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_BaseRateOverride");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_LaunderersAndDryClnrsDedFtr = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_LaunderersAndDryClnrsDedFtr");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_TransitionFtr = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_TransitionFtr");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_FinalRate = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_FinalRate");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_OverrideFinalRate = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_OverrideFinalRate");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_FinalPremium = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_FinalPremium");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_TotalSales = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_TotalSales");
		String strCIM_LaunderersAndDryCleanersCoverage_TXT_OverrideFinalPremium = (String) row.get("CIM_LaunderersAndDryCleanersCoverage_TXT_OverrideFinalPremium");
		
		try{
			se.log().logTestStep("LaunderersAndDryCleanersCoverage");
			test.log(LogStatus.INFO, "LaunderersAndDryCleanersCoverage page","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMLaunderersAndDryCleanersCoverage");
			se.verify().verifyEquals("LaunderersAndDryCleanersCoverage page of PowerWriter ", getCIM_LaunderersAndDryCleanersCoverage_TXT_VerifyLaunderersAndDryCleanersCoverageText().isDisplayed(),true, true,test);
			
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_TotalSalesAllLocations(strCIM_LaunderersAndDryCleanersCoverage_TXT_TotalSalesAllLocations),strCIM_LaunderersAndDryCleanersCoverage_TXT_TotalSalesAllLocations,test);
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_AddtnlDebrisRemovalExpLim(strCIM_LaunderersAndDryCleanersCoverage_TXT_AddtnlDebrisRemovalExpLim),strCIM_LaunderersAndDryCleanersCoverage_TXT_AddtnlDebrisRemovalExpLim,test);
			se.util().sleep(3000);
			if(se.element().isElementPresent(CIM_LaunderersAndDryCleanersCoverage_BTN_OKButton)){
			se.element().clickElement(getCIM_LaunderersAndDryCleanersCoverage_BTN_OKButton(),test);
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_AddtnlDebrisRemovalExpLim(strCIM_LaunderersAndDryCleanersCoverage_TXT_AddtnlDebrisRemovalExpLim),strCIM_LaunderersAndDryCleanersCoverage_TXT_AddtnlDebrisRemovalExpLim,test);
			se.util().sleep(3000);
			if(se.element().isElementPresent(CIM_LaunderersAndDryCleanersCoverage_BTN_OKButton)){
				se.element().clickElement(getCIM_LaunderersAndDryCleanersCoverage_BTN_OKButton(),test);
				}
			}
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_DefenseCosts(strCIM_LaunderersAndDryCleanersCoverage_TXT_DefenseCosts),strCIM_LaunderersAndDryCleanersCoverage_TXT_DefenseCosts,test);
			se.util().sleep(3000);
			if(se.element().isElementPresent(CIM_LaunderersAndDryCleanersCoverage_BTN_OKButton)){
				se.element().clickElement(getCIM_LaunderersAndDryCleanersCoverage_BTN_OKButton(),test);
				se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_DefenseCosts(strCIM_LaunderersAndDryCleanersCoverage_TXT_DefenseCosts),strCIM_LaunderersAndDryCleanersCoverage_TXT_DefenseCosts,test);
				se.util().sleep(3000);
				if(se.element().isElementPresent(CIM_LaunderersAndDryCleanersCoverage_BTN_OKButton)){
					se.element().clickElement(getCIM_LaunderersAndDryCleanersCoverage_BTN_OKButton(),test);
					}
				}
			se.element().selectPopupWithMagnifier(getCIM_LaunderersAndDryCleanersCoverage_TXT_EmergencyRemoval(strCIM_LaunderersAndDryCleanersCoverage_TXT_EmergencyRemoval), getCIM_LaunderersAndDryCleanersCoverage_BTN_EmergencyRemovalSearch(strCIM_LaunderersAndDryCleanersCoverage_TXT_EmergencyRemoval), strCIM_LaunderersAndDryCleanersCoverage_TXT_EmergencyRemoval, constants.NA, strCIM_LaunderersAndDryCleanersCoverage_TXT_EmergencyRemoval, constants.NA, constants.NA, constants.NA, test);
			se.util().sleep(3000);
			if(se.element().isElementPresent(CIM_LaunderersAndDryCleanersCoverage_BTN_OKButton)){
					se.element().clickElement(getCIM_LaunderersAndDryCleanersCoverage_BTN_OKButton(),test);
					se.element().selectPopupWithMagnifier(getCIM_LaunderersAndDryCleanersCoverage_TXT_EmergencyRemoval(strCIM_LaunderersAndDryCleanersCoverage_TXT_EmergencyRemoval), getCIM_LaunderersAndDryCleanersCoverage_BTN_EmergencyRemovalSearch(strCIM_LaunderersAndDryCleanersCoverage_TXT_EmergencyRemoval), strCIM_LaunderersAndDryCleanersCoverage_TXT_EmergencyRemoval, constants.NA, strCIM_LaunderersAndDryCleanersCoverage_TXT_EmergencyRemoval, constants.NA, constants.NA, constants.NA, test);
					se.util().sleep(3000);
					if(se.element().isElementPresent(CIM_LaunderersAndDryCleanersCoverage_BTN_OKButton)){
						se.element().clickElement(getCIM_LaunderersAndDryCleanersCoverage_BTN_OKButton(),test);
						}
				}
			
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_EarnedChargesLim(strCIM_LaunderersAndDryCleanersCoverage_TXT_EarnedChargesLim),strCIM_LaunderersAndDryCleanersCoverage_TXT_EarnedChargesLim,test);
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_NewAcqPremisesLim(strCIM_LaunderersAndDryCleanersCoverage_TXT_NewAcqPremisesLim),strCIM_LaunderersAndDryCleanersCoverage_TXT_NewAcqPremisesLim,test);
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_PollutantCleanupAndRemovalLim(strCIM_LaunderersAndDryCleanersCoverage_TXT_PollutantCleanupAndRemovalLim),strCIM_LaunderersAndDryCleanersCoverage_TXT_PollutantCleanupAndRemovalLim,test);
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_TransitLim(strCIM_LaunderersAndDryCleanersCoverage_TXT_TransitLim),strCIM_LaunderersAndDryCleanersCoverage_TXT_TransitLim,test);
			
			se.element().checkUncheckOrValidate(getCIM_LaunderersAndDryCleanersCoverage_CHK_EarthquakeCoverage_Provided(strCIM_LaunderersAndDryCleanersCoverage_CHK_EarthquakeCoverage_Provided),strCIM_LaunderersAndDryCleanersCoverage_CHK_EarthquakeCoverage_Provided,test);
			if(se.element().isElementPresent(CIM_LaunderersAndDryCleanersCoverage_BTN_OKButton)){
			se.element().clickElement(getCIM_LaunderersAndDryCleanersCoverage_BTN_OKButton(),test);
			}
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeLim(strCIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeLim),strCIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeLim,test);
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeCatastropheLlim(strCIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeCatastropheLlim),strCIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeCatastropheLlim,test);
			se.element().selectPopupWithMagnifier(getCIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeDedAmount(strCIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeDedAmount), getCIM_LaunderersAndDryCleanersCoverage_BTN_EarthquakeDedAmountSearch(), strCIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeDedAmount, constants.NA, strCIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeDedAmount, constants.NA, constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(getCIM_LaunderersAndDryCleanersCoverage_CHK_EarthquakeCoverage_NotProvided(strCIM_LaunderersAndDryCleanersCoverage_CHK_EarthquakeCoverage_NotProvided),strCIM_LaunderersAndDryCleanersCoverage_CHK_EarthquakeCoverage_NotProvided,test);
			se.element().checkUncheckOrValidate(getCIM_LaunderersAndDryCleanersCoverage_CHK_FloodCoverage_Provided(strCIM_LaunderersAndDryCleanersCoverage_CHK_FloodCoverage_Provided),strCIM_LaunderersAndDryCleanersCoverage_CHK_FloodCoverage_Provided,test);
			if(se.element().isElementPresent(CIM_LaunderersAndDryCleanersCoverage_BTN_OKButton)){
			se.element().clickElement(getCIM_LaunderersAndDryCleanersCoverage_BTN_OKButton(),test);
			}
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_FloodLim(strCIM_LaunderersAndDryCleanersCoverage_TXT_FloodLim),strCIM_LaunderersAndDryCleanersCoverage_TXT_FloodLim,test);
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_FloodCatastropheLim(strCIM_LaunderersAndDryCleanersCoverage_TXT_FloodCatastropheLim),strCIM_LaunderersAndDryCleanersCoverage_TXT_FloodCatastropheLim,test);
			se.element().selectPopupWithMagnifier(getCIM_LaunderersAndDryCleanersCoverage_TXT_FloodDedAmt(strCIM_LaunderersAndDryCleanersCoverage_TXT_FloodDedAmt), getCIM_LaunderersAndDryCleanersCoverage_BTN_FloodDedAmtSearch(strCIM_LaunderersAndDryCleanersCoverage_TXT_FloodDedAmt), strCIM_LaunderersAndDryCleanersCoverage_TXT_FloodDedAmt, constants.NA, strCIM_LaunderersAndDryCleanersCoverage_TXT_FloodDedAmt, constants.NA, constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(getCIM_LaunderersAndDryCleanersCoverage_CHK_FloodCoverage_NotProvided(strCIM_LaunderersAndDryCleanersCoverage_CHK_FloodCoverage_NotProvided),strCIM_LaunderersAndDryCleanersCoverage_CHK_FloodCoverage_NotProvided,test);
			se.element().checkUncheckOrValidate(getCIM_LaunderersAndDryCleanersCoverage_CHK_SewerBackupCoverage_Provided(strCIM_LaunderersAndDryCleanersCoverage_CHK_SewerBackupCoverage_Provided),strCIM_LaunderersAndDryCleanersCoverage_CHK_SewerBackupCoverage_Provided,test);
			if(se.element().isElementPresent(CIM_LaunderersAndDryCleanersCoverage_BTN_OKButton)){
				se.element().clickElement(getCIM_LaunderersAndDryCleanersCoverage_BTN_OKButton(),test);
				}
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupLim(strCIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupLim),strCIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupLim,test);
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupCatastropheLim(strCIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupCatastropheLim),strCIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupCatastropheLim,test);
			se.element().selectPopupWithMagnifier(getCIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupDedAmt(strCIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupDedAmt), getCIM_LaunderersAndDryCleanersCoverage_BTN_FloodDedAmtSearch(strCIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupDedAmt), strCIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupDedAmt, constants.NA, strCIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupDedAmt, constants.NA, constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(getCIM_LaunderersAndDryCleanersCoverage_CHK_SewerBackupCoverage_NotProvided(strCIM_LaunderersAndDryCleanersCoverage_CHK_SewerBackupCoverage_NotProvided),strCIM_LaunderersAndDryCleanersCoverage_CHK_SewerBackupCoverage_NotProvided,test);
			se.element().checkUncheckOrValidate(getCIM_LaunderersAndDryCleanersCoverage_CHK_ReportingConditions_Waived(strCIM_LaunderersAndDryCleanersCoverage_CHK_ReportingConditions_Waived),strCIM_LaunderersAndDryCleanersCoverage_CHK_ReportingConditions_Waived,test);
			se.element().checkUncheckOrValidate(getCIM_LaunderersAndDryCleanersCoverage_CHK_ReportingConditions_AnnualReporting(strCIM_LaunderersAndDryCleanersCoverage_CHK_ReportingConditions_AnnualReporting),strCIM_LaunderersAndDryCleanersCoverage_CHK_ReportingConditions_AnnualReporting,test);
			se.element().checkUncheckOrValidate(getCIM_LaunderersAndDryCleanersCoverage_CHK_DryCleanersFullGoodsInProCov(strCIM_LaunderersAndDryCleanersCoverage_CHK_DryCleanersFullGoodsInProCov),strCIM_LaunderersAndDryCleanersCoverage_CHK_DryCleanersFullGoodsInProCov,test);
			if(se.element().isElementPresent(CIM_LaunderersAndDryCleanersCoverage_BTN_OKButton)){
			se.element().clickElement(getCIM_LaunderersAndDryCleanersCoverage_BTN_OKButton(),test);
			}
			
			se.element().checkUncheckOrValidate(getCIM_LaunderersAndDryCleanersCoverage_CHK_DryCleanersMissingGoodsCov(strCIM_LaunderersAndDryCleanersCoverage_CHK_DryCleanersMissingGoodsCov),strCIM_LaunderersAndDryCleanersCoverage_CHK_DryCleanersMissingGoodsCov,test);
			if(se.element().isElementPresent(CIM_LaunderersAndDryCleanersCoverage_BTN_OKButton)){
			se.element().clickElement(getCIM_LaunderersAndDryCleanersCoverage_BTN_OKButton(),test);
			se.util().sleep(5000);
			}
			se.element().checkUncheckOrValidate(getCIM_LaunderersAndDryCleanersCoverage_CHK_DryCleanersLtdCovForGoodsInProAndFurGrmts(strCIM_LaunderersAndDryCleanersCoverage_CHK_DryCleanersLtdCovForGoodsInProAndFurGrmts),strCIM_LaunderersAndDryCleanersCoverage_CHK_DryCleanersLtdCovForGoodsInProAndFurGrmts,test);
			if(se.element().isElementPresent(CIM_LaunderersAndDryCleanersCoverage_BTN_OKButton)){
			se.element().clickElement(getCIM_LaunderersAndDryCleanersCoverage_BTN_OKButton(),test);
			}
			se.util().sleep(10000);
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_AdditionalInformation(strCIM_LaunderersAndDryCleanersCoverage_TXT_AdditionalInformation),strCIM_LaunderersAndDryCleanersCoverage_TXT_AdditionalInformation,test);
			se.element().checkUncheckOrValidate(getCIM_LaunderersAndDryCleanersCoverage_CHK_OverrideBaseRate_Yes(strCIM_LaunderersAndDryCleanersCoverage_CHK_OverrideBaseRate_Yes),strCIM_LaunderersAndDryCleanersCoverage_CHK_OverrideBaseRate_Yes,test);
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_OverrideReason(strCIM_LaunderersAndDryCleanersCoverage_TXT_OverrideReason),strCIM_LaunderersAndDryCleanersCoverage_TXT_OverrideReason,test);
			se.element().checkUncheckOrValidate(getCIM_LaunderersAndDryCleanersCoverage_CHK_OverrideBaseRate_No(strCIM_LaunderersAndDryCleanersCoverage_CHK_OverrideBaseRate_No),strCIM_LaunderersAndDryCleanersCoverage_CHK_OverrideBaseRate_No,test);
			se.element().checkUncheckOrValidate(getCIM_LaunderersAndDryCleanersCoverage_CHK_DoNotApplyCityOrCountyTaxes(strCIM_LaunderersAndDryCleanersCoverage_CHK_DoNotApplyCityOrCountyTaxes),strCIM_LaunderersAndDryCleanersCoverage_CHK_DoNotApplyCityOrCountyTaxes,test);
			se.element().checkUncheckOrValidate(getCIM_LaunderersAndDryCleanersCoverage_CHK_AllCityName(strCIM_LaunderersAndDryCleanersCoverage_CHK_AllCityName),strCIM_LaunderersAndDryCleanersCoverage_CHK_AllCityName,test);
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_City(strCIM_LaunderersAndDryCleanersCoverage_TXT_City),strCIM_LaunderersAndDryCleanersCoverage_TXT_City,test);
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_CityCode(strCIM_LaunderersAndDryCleanersCoverage_TXT_CityCode),strCIM_LaunderersAndDryCleanersCoverage_TXT_CityCode,test);
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_County(strCIM_LaunderersAndDryCleanersCoverage_TXT_County),strCIM_LaunderersAndDryCleanersCoverage_TXT_County,test);
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_CountyCode(strCIM_LaunderersAndDryCleanersCoverage_TXT_CountyCode),strCIM_LaunderersAndDryCleanersCoverage_TXT_CountyCode,test);
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_TaxCode(strCIM_LaunderersAndDryCleanersCoverage_TXT_TaxCode),strCIM_LaunderersAndDryCleanersCoverage_TXT_TaxCode,test);
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_BaseRate(strCIM_LaunderersAndDryCleanersCoverage_TXT_BaseRate),strCIM_LaunderersAndDryCleanersCoverage_TXT_BaseRate,test);
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_BaseRateOverride(strCIM_LaunderersAndDryCleanersCoverage_TXT_BaseRateOverride),strCIM_LaunderersAndDryCleanersCoverage_TXT_BaseRateOverride,test);
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_LaunderersAndDryClnrsDedFtr(strCIM_LaunderersAndDryCleanersCoverage_TXT_LaunderersAndDryClnrsDedFtr),strCIM_LaunderersAndDryCleanersCoverage_TXT_LaunderersAndDryClnrsDedFtr,test);
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_TransitionFtr(strCIM_LaunderersAndDryCleanersCoverage_TXT_TransitionFtr),strCIM_LaunderersAndDryCleanersCoverage_TXT_TransitionFtr,test);
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_FinalRate(strCIM_LaunderersAndDryCleanersCoverage_TXT_FinalRate),strCIM_LaunderersAndDryCleanersCoverage_TXT_FinalRate,test);
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_OverrideFinalRate(strCIM_LaunderersAndDryCleanersCoverage_TXT_OverrideFinalRate),strCIM_LaunderersAndDryCleanersCoverage_TXT_OverrideFinalRate,test);
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_TotalSales(strCIM_LaunderersAndDryCleanersCoverage_TXT_TotalSales),strCIM_LaunderersAndDryCleanersCoverage_TXT_TotalSales,test);
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_FinalPremium(strCIM_LaunderersAndDryCleanersCoverage_TXT_FinalPremium),strCIM_LaunderersAndDryCleanersCoverage_TXT_FinalPremium,test);
			se.element().enterOrValidateText(getCIM_LaunderersAndDryCleanersCoverage_TXT_OverrideFinalPremium(strCIM_LaunderersAndDryCleanersCoverage_TXT_OverrideFinalPremium),strCIM_LaunderersAndDryCleanersCoverage_TXT_OverrideFinalPremium,test);

			se.element().Click(getNext(),test);
		
}
		
		
		catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CP_CIMLaunderersAndDryCleanersCoverage ", true, false, true, test);
			
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
