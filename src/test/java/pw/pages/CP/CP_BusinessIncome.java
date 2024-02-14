package pw.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CP;

public class CP_BusinessIncome extends OR_CP{
	
	
	public void BusinessIncome(String strRegressionID, String transaction, String buildingName, ExtentTest test)throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CP_Business_Income")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		
		List<Map<String, String>> table = ExcelOperations.getBuildingPagesData("CP_Business_Income", strRegressionID, buildingName,transaction);
		int iteration = 0;
		while (iteration < table.size()) {
		LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCP_BusIncome_BTN_Add = (String) row.get("CP_BusIncome_BTN_Add");
		String strCP_BusIncome_BTN_Details = (String) row.get("CP_BusIncome_BTN_Details");
		String strCP_BusIncome_BTN_Done = (String) row.get("CP_BusIncome_BTN_Done");
		String strCP_BusIncome_TXT_ClassCode = (String) row.get("CP_BusIncome_TXT_ClassCode");
		String strCP_BusIncome_TXT_ClassDescription = (String) row.get("CP_BusIncome_TXT_ClassDescription");
		String strCP_BusIncome_TXT_PolicyType = (String) row.get("CP_BusIncome_TXT_PolicyType");
		String strCP_BusIncome_TXT_TypeOfRisk = (String) row.get("CP_BusIncome_TXT_TypeOfRisk");
		String strCP_BusIncome_TXT_PercentOfRiskusedForManufacturing = (String) row.get("CP_BusIncome_TXT_PercentOfRiskusedForManufacturing");
		String strCP_BusIncome_TXT_PercentOfRiskusedForMercantile = (String) row.get("CP_BusIncome_TXT_PercentOfRiskusedForMercantile");
		String strCP_BusIncome_TXT_PercentOfRiskusedForREntal = (String) row.get("CP_BusIncome_TXT_PercentOfRiskusedForREntal");
		String strCP_BusIncome_TXT_BusinessIncomeOption = (String) row.get("CP_BusIncome_TXT_BusinessIncomeOption");
		String strCP_BusIncome_TXT_CoverageForm = (String) row.get("CP_BusIncome_TXT_CoverageForm");
		String strCP_BusIncome_TXT_CoverageType = (String) row.get("CP_BusIncome_TXT_CoverageType");
		String strCP_BusIncome_TXT_AmountOfInsurance = (String) row.get("CP_BusIncome_TXT_AmountOfInsurance");
		String strCP_BusIncome_TXT_EstimatedBIandExtraExpenseExpo = (String) row.get("CP_BusIncome_TXT_EstimatedBIandExtraExpenseExpo");
		String strCP_BusIncome_TXT_OverideEstimatedExposure = (String) row.get("CP_BusIncome_TXT_OverideEstimatedExposure");
		String strCP_BusIncome_TXT_CauseOfLoss = (String) row.get("CP_BusIncome_TXT_CauseOfLoss");
		String strCP_BusIncome_TXT_Coinsurance = (String) row.get("CP_BusIncome_TXT_Coinsurance");
		String strCP_BusIncome_TXT_ClearDepndentProperties = (String) row.get("CP_BusIncome_TXT_ClearDepndentProperties");
		String strCP_BusIncome_TXT_DepndentProperties = (String) row.get("CP_BusIncome_TXT_DepndentProperties");
		String strCP_BusIncome_TXT_ContributingLocations = (String) row.get("CP_BusIncome_TXT_ContributingLocations");
		String strCP_BusIncome_TXT_ContributingLimitOfInsurance = (String) row.get("CP_BusIncome_TXT_ContributingLimitOfInsurance");
		String strCP_BusIncome_TXT_RecipientLocations = (String) row.get("CP_BusIncome_TXT_RecipientLocations");
		String strCP_BusIncome_TXT_RecipientLimitOfInsurance = (String) row.get("CP_BusIncome_TXT_RecipientLimitOfInsurance");
		String strCP_BusIncome_TXT_ManufacLocations = (String) row.get("CP_BusIncome_TXT_ManufacLocations");
		String strCP_BusIncome_TXT_ManufacLimitOfinsurance = (String) row.get("CP_BusIncome_TXT_ManufacLimitOfinsurance");
		String strCP_BusIncome_TXT_LeaderLocations = (String) row.get("CP_BusIncome_TXT_LeaderLocations");
		String strCP_BusIncome_TXT_LeaderLimitOfInsurance = (String) row.get("CP_BusIncome_TXT_LeaderLimitOfInsurance");
		String strCP_BusIncome_TXT_DependentPropAmtOfIns = (String) row.get("CP_BusIncome_TXT_DependentPropAmtOfIns");
		String strCP_BusIncome_CHK_SameAsBuilding = (String) row.get("CP_BusIncome_CHK_SameAsBuilding");
		String strCP_BusIncome_CHK_ExcludeVandalism = (String) row.get("CP_BusIncome_CHK_ExcludeVandalism");
		String strCP_BusIncome_CHK_SprinklerLeakage = (String) row.get("CP_BusIncome_CHK_SprinklerLeakage");
		String strCP_BusIncome_CHK_ExcludeWindstormAndHail = (String) row.get("CP_BusIncome_CHK_ExcludeWindstormAndHail");
		String strCP_BusIncome_CHK_ExcludeTheft = (String) row.get("CP_BusIncome_CHK_ExcludeTheft");
		String strCP_BusIncome_TXT_GroupIRate = (String) row.get("CP_BusIncome_TXT_GroupIRate");
		String strCP_BusIncome_TXT_GroupIIRate = (String) row.get("CP_BusIncome_TXT_GroupIIRate");
		String strCP_BusIncome_CHK_FungusIncreasedCoverage = (String) row.get("CP_BusIncome_CHK_FungusIncreasedCoverage");
		String strCP_BusIncome_TXT_FungusIncNoOfdays = (String) row.get("CP_BusIncome_TXT_FungusIncNoOfdays");
		String strCP_BusIncome_CHK_PremiumAdjustment = (String) row.get("CP_BusIncome_CHK_PremiumAdjustment");
		String strCP_BusIncome_CHK_BIAgreedValueOption = (String) row.get("CP_BusIncome_CHK_BIAgreedValueOption");
		String strCP_BusIncome_CHK_MaximumPeriodOfIndemnity = (String) row.get("CP_BusIncome_CHK_MaximumPeriodOfIndemnity");
		String strCP_BusIncome_CHK_MonthlyLimitOfIndemnity = (String) row.get("CP_BusIncome_CHK_MonthlyLimitOfIndemnity");
		String strCP_BusIncome_TXT_MonthlyLimitation = (String) row.get("CP_BusIncome_TXT_MonthlyLimitation");
		String strCP_BusIncome_CHK_ExtendPeriodOfIndemnity = (String) row.get("CP_BusIncome_CHK_ExtendPeriodOfIndemnity");
		String strCP_BusIncome_TXT_ExtendedNoOfDays = (String) row.get("CP_BusIncome_TXT_ExtendedNoOfDays");
		String strCP_BusIncome_CHK_GreenUpExtensionOfThePeriodOfRestoration = (String) row.get("CP_BusIncome_CHK_GreenUpExtensionOfThePeriodOfRestoration");
		
		String strCP_BusIncome_CHK_PowerHeatAndRefDeduct = (String) row.get("CP_BusIncome_CHK_PowerHeatAndRefDeduct");
		String strCP_BusIncome_CHK_SeasonalLeases = (String) row.get("CP_BusIncome_CHK_SeasonalLeases");
		String strCP_BusIncome_TXT_Months = (String) row.get("CP_BusIncome_TXT_Months");
		String strCP_BusIncome_TXT_LimitPerMonth = (String) row.get("CP_BusIncome_TXT_LimitPerMonth");
		String strCP_BusIncome_CHK_BIChangesEducationalInstitutions = (String) row.get("CP_BusIncome_CHK_BIChangesEducationalInstitutions");
		String strCP_BusIncome_TXT_BIChangesEducationalInstitutionsDescriptionOfSchool = (String) row.get("CP_BusIncome_TXT_BIChangesEducationalInstitutionsDescriptionOfSchool");
		String strCP_BusIncome_CHK_BIChangesEducationalInstitutionsLimitedCoverage = (String) row.get("CP_BusIncome_CHK_BIChangesEducationalInstitutionsLimitedCoverage");
		String strCP_BusIncome_TXT_BIChangesEducationalInstitutionsExtensionOfRecoveryPeriodOption = (String) row.get("CP_BusIncome_TXT_BIChangesEducationalInstitutionsExtensionOfRecoveryPeriodOption");
		String strCP_BusIncome_CHK_LandlordAddnlInsured = (String) row.get("CP_BusIncome_CHK_LandlordAddnlInsured");
		String strCP_BusIncome_CHK_BIChangesBEgOfPeriosRestoration = (String) row.get("CP_BusIncome_CHK_BIChangesBEgOfPeriosRestoration");
		String strCP_BusIncome_TXT_Hour72PeriodOption = (String) row.get("CP_BusIncome_TXT_Hour72PeriodOption");
		String strCP_BusIncome_CHK_CivilAuthorityChangesIncCovPeriod = (String) row.get("CP_BusIncome_CHK_CivilAuthorityChangesIncCovPeriod");
		String strCP_BusIncome_TXT_IncreasedCovgPrd = (String) row.get("CP_BusIncome_TXT_IncreasedCovgPrd");
		String strCP_BusIncome_TXT_CoveragePeriod_NoOfDays = (String) row.get("CP_BusIncome_TXT_CoveragePeriod_NoOfDays");
		String strCP_BusIncome_TXT_Radius_NoOfMiles = (String) row.get("CP_BusIncome_TXT_Radius_NoOfMiles");
		String strCP_BusIncome_CHK_RadioOrTelevisionAntennasBroadcast = (String) row.get("CP_BusIncome_CHK_RadioOrTelevisionAntennasBroadcast");
		String strCP_BusIncome_CHK_RadioOrTelevisionAntennasReceiving = (String) row.get("CP_BusIncome_CHK_RadioOrTelevisionAntennasReceiving");
		String strCP_BusIncome_CHK_WaterExclusionBuyback = (String) row.get("CP_BusIncome_CHK_WaterExclusionBuyback");
		String strCP_BusIncome_TXT_WatercraftExclusionBuybackOption = (String) row.get("CP_BusIncome_TXT_WatercraftExclusionBuybackOption");
		String strCP_BusIncome_TXT_WatercraftExclusionBuybacklimitOfInsurance = (String) row.get("CP_BusIncome_TXT_WatercraftExclusionBuybacklimitOfInsurance");
		String strCP_BusIncome_CHK_WaterfrontPropDamage = (String) row.get("CP_BusIncome_CHK_WaterfrontPropDamage");
		String strCP_BusIncome_CHK_MoltenMaterial = (String) row.get("CP_BusIncome_CHK_MoltenMaterial");
		String strCP_BusIncome_CHK_PierAndWharf = (String) row.get("CP_BusIncome_CHK_PierAndWharf");
		String strCP_BusIncome_TXT_PierWharfOption = (String) row.get("CP_BusIncome_TXT_PierWharfOption");
		String strCP_BusIncome_TXT_PierAndWharfLimit = (String) row.get("CP_BusIncome_TXT_PierAndWharfLimit");
		
		String strCP_BusIncome_CHK_EQSprinklerLeakage = (String) row.get("CP_BusIncome_CHK_EQSprinklerLeakage");
		String strCP_BusIncome_CHK_EQ_SuLimitCauseOfCause = (String) row.get("CP_BusIncome_CHK_EQ_SuLimitCauseOfCause");
		String strCP_BusIncome_TXT_EQ_SubLimit = (String) row.get("CP_BusIncome_TXT_EQ_SubLimit");
		String strCP_BusIncome_CHK_earthquake = (String) row.get("CP_BusIncome_CHK_earthquake");
		String strCP_BusIncome_CHK_DiscretionaryPayrollExpenseEndo = (String) row.get("CP_BusIncome_CHK_DiscretionaryPayrollExpenseEndo");
		String strCP_BusIncome_CHK_IncludedInFloodCoverage=(String) row.get("CP_BusIncome_CHK_IncludedInFloodCoverage");
		String strCP_BusIncome_TXT_BlanketID=(String) row.get("CP_BusIncome_TXT_BlanketID");
		String strCP_BusIncome_TXT_FloodLimit=(String) row.get("CP_BusIncome_TXT_FloodLimit");
		String strCP_BusIncome_TXT_FloodPremium=(String) row.get("CP_BusIncome_TXT_FloodPremium");
		String strCP_BusIncome_CHK_HideRatingDetails = (String) row.get("CP_BusIncome_CHK_HideRatingDetails");
		String strTransaction = (String) row.get("Transaction Name");
		String strCP_BusIncome_BTN_DoneWithBuilding  = (String) row.get("CP_BusIncome_BTN_DoneWithBuilding");
		String strCP_BusIncome_TXT_NoOfStories  =(String) row.get("CP_BusIncome_TXT_NoOfStories");
		try{
				se.log().logTestStep("BusinessIncome");
				test.log(LogStatus.INFO, "BusinessIncome page","Transaction Step : "+strTransaction + "<br>" +"Page : CP_BusinessIncome");
				se.verify().verifyEquals("BusinessIncome Page of PowerWriter ", getCP_BusIncome_TXT_VerifyBusinessIncomeText().isDisplayed(),true, true,test);

				
				if((strCP_BusIncome_BTN_Add.equalsIgnoreCase("Yes"))){
					se.element().Click(getCP_BusIncome_BTN_ADD(strCP_BusIncome_BTN_Add),test);
					}
					if((strCP_BusIncome_BTN_Details.equalsIgnoreCase("Yes"))){
					se.element().tryClick(getCP_BusIncome_BTN_Details(strCP_BusIncome_BTN_Details),test);
					}
				
				se.element().enterOrValidateText(getCP_BusIncome_TXT_ClassCode(strCP_BusIncome_TXT_ClassCode),strCP_BusIncome_TXT_ClassCode,test);
				se.element().enterOrValidateText(getCP_BusIncome_TXT_ClassDescription(strCP_BusIncome_TXT_ClassDescription),strCP_BusIncome_TXT_ClassDescription,test);
				se.element().enterOrValidateText(getCP_BusIncome_TXT_PolicyType(strCP_BusIncome_TXT_PolicyType),strCP_BusIncome_TXT_PolicyType,test);
				//se.element().enterOrValidateText(getCP_BusIncome_TXT_TypeOfRisk(strCP_BusIncome_TXT_TypeOfRisk),strCP_BusIncome_TXT_TypeOfRisk,test);
				
			/*
			 * if(!strCP_BusIncome_TXT_TypeOfRisk.equalsIgnoreCase("N/A") &&
			 * !strCP_BusIncome_TXT_TypeOfRisk.contains("validate2")) {
			 * se.element().clickSearchIcon(getCP_BusIncome_BTN_TypeOfRiskSearch(), test);
			 * se.element().Click(getCP_BusIncome_LNK_TypeOfRiskOption(
			 * strCP_BusIncome_TXT_TypeOfRisk),test); }else {
			 * se.element().enterOrValidateText(getCP_BusIncome_TXT_TypeOfRisk(
			 * strCP_BusIncome_TXT_TypeOfRisk),strCP_BusIncome_TXT_TypeOfRisk,test); }
			 */
				se.element().selectPopupWithMagnifier(getCP_BusIncome_TXT_TypeOfRisk(strCP_BusIncome_TXT_TypeOfRisk), getCP_BusIncome_BTN_TypeOfRiskSearch(strCP_BusIncome_TXT_TypeOfRisk), strCP_BusIncome_TXT_TypeOfRisk, constants.NA, strCP_BusIncome_TXT_TypeOfRisk, constants.NA, constants.NA, constants.NA, test);
				
				se.element().enterOrValidateText(getCP_BusIncome_TXT_PercentOfRiskusedForManufacturing(strCP_BusIncome_TXT_PercentOfRiskusedForManufacturing),strCP_BusIncome_TXT_PercentOfRiskusedForManufacturing,test);
				se.element().enterOrValidateText(getCP_BusIncome_TXT_PercentOfRiskusedForMercantile(strCP_BusIncome_TXT_PercentOfRiskusedForMercantile),strCP_BusIncome_TXT_PercentOfRiskusedForMercantile,test);
				se.element().enterOrValidateText(getCP_BusIncome_TXT_PercentOfRiskusedForREntal(strCP_BusIncome_TXT_PercentOfRiskusedForREntal),strCP_BusIncome_TXT_PercentOfRiskusedForREntal,test);
				
				
				/*if(!strCP_BusIncome_TXT_BusinessIncomeOption.equalsIgnoreCase("N/A") && !strCP_BusIncome_TXT_BusinessIncomeOption.contains("validate2")) {
					se.element().clickSearchIcon(getCP_BusIncome_BTN_BusinessIncomeOptionSearch(), test);
					se.element().clickelement(getCP_BusIncome_LNK_BusinessIncomeOption(strCP_BusIncome_TXT_BusinessIncomeOption),strCP_BusIncome_TXT_BusinessIncomeOption,test);
				}else {
					se.element().enterOrValidateText(getCP_BusIncome_TXT_BusinessIncomeOption(strCP_BusIncome_TXT_BusinessIncomeOption),strCP_BusIncome_TXT_BusinessIncomeOption,test);
				}*/
				
				se.element().selectPopupWithMagnifier(getCP_BusIncome_TXT_BusinessIncomeOption(strCP_BusIncome_TXT_BusinessIncomeOption), getCP_BusIncome_BTN_BusinessIncomeOptionSearch(strCP_BusIncome_TXT_BusinessIncomeOption), strCP_BusIncome_TXT_BusinessIncomeOption, constants.NA, strCP_BusIncome_TXT_BusinessIncomeOption, constants.NA, constants.NA, constants.NA, test);
				
				
				/*if(!strCP_BusIncome_TXT_CoverageForm.equalsIgnoreCase("N/A") && !strCP_BusIncome_TXT_CoverageForm.contains("validate2")) {
					se.element().clickSearchIcon(getCP_BusIncome_BTN_CoverageFormSearch(), test);
					se.element().clickelement(getCP_BusIncome_LNK_CoverageFormOption(strCP_BusIncome_TXT_CoverageForm),strCP_BusIncome_TXT_CoverageForm,test);
				}else {
					se.element().enterOrValidateText(getCP_BusIncome_TXT_CoverageForm(strCP_BusIncome_TXT_CoverageForm),strCP_BusIncome_TXT_CoverageForm,test);
				}*/
				se.element().selectPopupWithMagnifier(getCP_BusIncome_TXT_CoverageForm(strCP_BusIncome_TXT_CoverageForm), getCP_BusIncome_BTN_CoverageFormSearch(strCP_BusIncome_TXT_CoverageForm), strCP_BusIncome_TXT_CoverageForm, constants.NA, strCP_BusIncome_TXT_CoverageForm, constants.NA, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getCP_BusIncome_TXT_CoverageType(strCP_BusIncome_TXT_CoverageType),strCP_BusIncome_TXT_CoverageType,test);
				se.element().enterOrValidateText(getCP_BusIncome_TXT_AmountOfInsurance(strCP_BusIncome_TXT_AmountOfInsurance),strCP_BusIncome_TXT_AmountOfInsurance,test);
				se.element().enterOrValidateText(getCP_BusIncome_TXT_EstimatedBIandExtraExpenseExpo(strCP_BusIncome_TXT_EstimatedBIandExtraExpenseExpo),strCP_BusIncome_TXT_EstimatedBIandExtraExpenseExpo,test);
				se.element().enterOrValidateText(getCP_BusIncome_TXT_OverideEstimatedExposure(strCP_BusIncome_TXT_OverideEstimatedExposure),strCP_BusIncome_TXT_OverideEstimatedExposure,test);
				
				/*if(!strCP_BusIncome_TXT_CauseOfLoss.equalsIgnoreCase("N/A") && !strCP_BusIncome_TXT_CauseOfLoss.contains("validate2")) {
					se.element().clickSearchIcon(getCP_BusIncome_BTN_CauseOfLossSearch(), test);
					se.element().clickelement(getCP_BusIncome_LNK_CauseOfLossOption(strCP_BusIncome_TXT_CauseOfLoss),strCP_BusIncome_TXT_CauseOfLoss,test);
				}else {
					se.element().enterOrValidateText(getCP_BusIncome_TXT_CauseOfLoss(strCP_BusIncome_TXT_CauseOfLoss),strCP_BusIncome_TXT_CauseOfLoss,test);
				}*/
				se.element().selectPopupWithMagnifier(getCP_BusIncome_TXT_CauseOfLoss(strCP_BusIncome_TXT_CauseOfLoss), getCP_BusIncome_BTN_CauseOfLossSearch(strCP_BusIncome_TXT_CauseOfLoss), strCP_BusIncome_TXT_CauseOfLoss, constants.NA, strCP_BusIncome_TXT_CauseOfLoss, constants.NA, constants.NA, constants.NA, test);
				
				if(!strCP_BusIncome_TXT_Coinsurance.equalsIgnoreCase("N/A") && !strCP_BusIncome_TXT_Coinsurance.contains("validate2")) {
					se.util().sleep(2000);
					se.element().clickSearchIcon(getCP_BusIncome_BTN_SearchCoinsurance(), test);
					se.element().clickelement(getCP_BusIncome_LNK_Coinsurance(strCP_BusIncome_TXT_Coinsurance),strCP_BusIncome_TXT_Coinsurance,test);
				}else {
					se.element().enterOrValidateText(getCP_BusIncome_TXT_Coinsurance(strCP_BusIncome_TXT_Coinsurance),strCP_BusIncome_TXT_Coinsurance,test);
				}
				
				if(strCP_BusIncome_TXT_ClearDepndentProperties.equalsIgnoreCase("Yes")){
					se.element().clearTheField(getCP_BusIncome_TXT_DepndentProperties(strCP_BusIncome_TXT_ClearDepndentProperties));	
					se.element().enterTAB(getCP_BusIncome_TXT_DepndentProperties(strCP_BusIncome_TXT_ClearDepndentProperties));
				}
				/*if(!strCP_BusIncome_TXT_DepndentProperties.equalsIgnoreCase("N/A") && !strCP_BusIncome_TXT_DepndentProperties.contains("validate2")) {
					se.util().sleep(2000);
					se.element().clickSearchIcon(getCP_BusIncome_BTN_DepndentPropertiesSearch(), test);
					se.element().clickelement(getCP_BusIncome_LNK_DepndentPropertiesOption(strCP_BusIncome_TXT_DepndentProperties),strCP_BusIncome_TXT_DepndentProperties,test);
				}else {
					se.element().enterOrValidateText(getCP_BusIncome_TXT_DepndentProperties(strCP_BusIncome_TXT_DepndentProperties),strCP_BusIncome_TXT_DepndentProperties,test);
				}*/
				se.util().sleep(2000);
				se.element().selectPopupWithMagnifier(getCP_BusIncome_TXT_DepndentProperties(strCP_BusIncome_TXT_DepndentProperties), getCP_BusIncome_BTN_DepndentPropertiesSearch(strCP_BusIncome_TXT_DepndentProperties), strCP_BusIncome_TXT_DepndentProperties, constants.NA, strCP_BusIncome_TXT_DepndentProperties, constants.NA, constants.NA, constants.NA, test);
				
			
				se.element().enterOrValidateText(getCP_BusIncome_TXT_ContributingLocations(strCP_BusIncome_TXT_ContributingLocations),strCP_BusIncome_TXT_ContributingLocations,test);
				se.element().enterOrValidateText(getCP_BusIncome_TXT_ContributingLimitOfInsurance(strCP_BusIncome_TXT_ContributingLimitOfInsurance),strCP_BusIncome_TXT_ContributingLimitOfInsurance,test);
				se.element().enterOrValidateText(getCP_BusIncome_TXT_RecipientLocations(strCP_BusIncome_TXT_RecipientLocations),strCP_BusIncome_TXT_RecipientLocations,test);
				se.element().enterOrValidateText(getCP_BusIncome_TXT_RecipientLimitOfInsurance(strCP_BusIncome_TXT_RecipientLimitOfInsurance),strCP_BusIncome_TXT_RecipientLimitOfInsurance,test);
				se.element().enterOrValidateText(getCP_BusIncome_TXT_ManufacLocations(strCP_BusIncome_TXT_ManufacLocations),strCP_BusIncome_TXT_ManufacLocations,test);
				se.element().enterOrValidateText(getCP_BusIncome_TXT_ManufacLimitOfinsurance(strCP_BusIncome_TXT_ManufacLimitOfinsurance),strCP_BusIncome_TXT_ManufacLimitOfinsurance,test);
				se.element().enterOrValidateText(getCP_BusIncome_TXT_LeaderLocations(strCP_BusIncome_TXT_LeaderLocations),strCP_BusIncome_TXT_LeaderLocations,test);
				se.element().enterOrValidateText(getCP_BusIncome_TXT_LeaderLimitOfInsurance(strCP_BusIncome_TXT_LeaderLimitOfInsurance),strCP_BusIncome_TXT_LeaderLimitOfInsurance,test);
				se.element().enterOrValidateText(getCP_BusIncome_TXT_DependentPropAmtOfIns(strCP_BusIncome_TXT_DependentPropAmtOfIns),strCP_BusIncome_TXT_DependentPropAmtOfIns,test);
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_SameAsBuilding(strCP_BusIncome_CHK_SameAsBuilding),strCP_BusIncome_CHK_SameAsBuilding,test);
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_ExcludeVandalism(strCP_BusIncome_CHK_ExcludeVandalism),strCP_BusIncome_CHK_ExcludeVandalism,test);
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_SprinklerLeakage(strCP_BusIncome_CHK_SprinklerLeakage),strCP_BusIncome_CHK_SprinklerLeakage,test);
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_ExcludeWindstormAndHail(strCP_BusIncome_CHK_ExcludeWindstormAndHail),strCP_BusIncome_CHK_ExcludeWindstormAndHail,test);
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_ExcludeTheft(strCP_BusIncome_CHK_ExcludeTheft),strCP_BusIncome_CHK_ExcludeTheft,test);
				se.element().enterOrValidateText(getCP_BusIncome_TXT_GroupIRate(strCP_BusIncome_TXT_GroupIRate),strCP_BusIncome_TXT_GroupIRate,test);
				se.element().enterOrValidateText(getCP_BusIncome_TXT_GroupIIRate(strCP_BusIncome_TXT_GroupIIRate),strCP_BusIncome_TXT_GroupIIRate,test);
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_FungusIncreasedCoverage(strCP_BusIncome_CHK_FungusIncreasedCoverage),strCP_BusIncome_CHK_FungusIncreasedCoverage,test);
					/*if(!strCP_BusIncome_TXT_FungusIncNoOfdays.equalsIgnoreCase("N/A") && !strCP_BusIncome_TXT_FungusIncNoOfdays.contains("validate2")) {
					se.element().clickSearchIcon(getCP_BusIncome_BTN_FungusIncNoOfdaysSearch(), test);
					se.element().clickelement(getCP_BusIncome_LNK_FungusIncNoOfdaysOption(strCP_BusIncome_TXT_FungusIncNoOfdays),strCP_BusIncome_TXT_FungusIncNoOfdays,test);
				}else {
					se.element().enterOrValidateText(getCP_BusIncome_TXT_FungusIncNoOfdays(strCP_BusIncome_TXT_FungusIncNoOfdays),strCP_BusIncome_TXT_FungusIncNoOfdays,test);
				}
				*/
				se.element().selectPopupWithMagnifier(getCP_BusIncome_TXT_FungusIncNoOfdays(strCP_BusIncome_TXT_FungusIncNoOfdays), getCP_BusIncome_BTN_FungusIncNoOfdaysSearch(strCP_BusIncome_TXT_FungusIncNoOfdays), strCP_BusIncome_TXT_FungusIncNoOfdays, constants.NA, strCP_BusIncome_TXT_FungusIncNoOfdays, constants.NA, constants.NA, constants.NA, test);
				
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_PremiumAdjustment(strCP_BusIncome_CHK_PremiumAdjustment),strCP_BusIncome_CHK_PremiumAdjustment,test);
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_BIAgreedValueOption(strCP_BusIncome_CHK_BIAgreedValueOption),strCP_BusIncome_CHK_BIAgreedValueOption,test);
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_MaximumPeriodOfIndemnity(strCP_BusIncome_CHK_MaximumPeriodOfIndemnity),strCP_BusIncome_CHK_MaximumPeriodOfIndemnity,test);
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_MonthlyLimitOfIndemnity(strCP_BusIncome_CHK_MonthlyLimitOfIndemnity),strCP_BusIncome_CHK_MonthlyLimitOfIndemnity,test);
				//se.element().enterOrValidateText(getCP_BusIncome_TXT_MonthlyLimitation(strCP_BusIncome_TXT_MonthlyLimitation),strCP_BusIncome_TXT_MonthlyLimitation,test);
				se.element().selectPopupWithMagnifier(getCP_BusIncome_TXT_MonthlyLimitation(strCP_BusIncome_TXT_MonthlyLimitation), getCP_BusIncome_TXT_MonthlyLimitationSearch(strCP_BusIncome_TXT_MonthlyLimitation), strCP_BusIncome_TXT_MonthlyLimitation, constants.NA, strCP_BusIncome_TXT_MonthlyLimitation, constants.NA, constants.NA, constants.NA, test);
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_ExtendPeriodOfIndemnity(strCP_BusIncome_CHK_ExtendPeriodOfIndemnity),strCP_BusIncome_CHK_ExtendPeriodOfIndemnity,test);
				
							/*
			 * if(!strCP_BusIncome_TXT_ExtendedNoOfDays.equalsIgnoreCase("N/A") &&
			 * !strCP_BusIncome_TXT_ExtendedNoOfDays.contains("validate2")) {
			 * se.element().clickSearchIcon(getCP_BusIncome_BTN_ExtendedNoOfDaysSearch(),
			 * test); se.element().clickelement(getCP_BusIncome_LNK_ExtendedNoOfDaysOption(
			 * strCP_BusIncome_TXT_ExtendedNoOfDays),strCP_BusIncome_TXT_ExtendedNoOfDays,
			 * test); }else {
			 * se.element().enterOrValidateText(getCP_BusIncome_TXT_ExtendedNoOfDays(
			 * strCP_BusIncome_TXT_ExtendedNoOfDays),strCP_BusIncome_TXT_ExtendedNoOfDays,
			 * test); }
			 */
				//se.element().enterOrValidateText(getCP_BusIncome_TXT_ExtendedNoOfDays(strCP_BusIncome_TXT_ExtendedNoOfDays),strCP_BusIncome_TXT_ExtendedNoOfDays,test);
				se.element().selectPopupWithMagnifier(getCP_BusIncome_TXT_ExtendedNoOfDays(strCP_BusIncome_TXT_ExtendedNoOfDays), getCP_BusIncome_BTN_ExtendedNoOfDaysSearch(strCP_BusIncome_TXT_ExtendedNoOfDays), strCP_BusIncome_TXT_ExtendedNoOfDays, constants.NA, strCP_BusIncome_TXT_ExtendedNoOfDays, constants.NA, constants.NA, constants.NA, test);
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_GreenUpExtensionOfThePeriodOfRestoration(strCP_BusIncome_CHK_GreenUpExtensionOfThePeriodOfRestoration),strCP_BusIncome_CHK_GreenUpExtensionOfThePeriodOfRestoration,test);
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_PowerHeatAndRefDeduct(strCP_BusIncome_CHK_PowerHeatAndRefDeduct),strCP_BusIncome_CHK_PowerHeatAndRefDeduct,test);
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_SeasonalLeases(strCP_BusIncome_CHK_SeasonalLeases),strCP_BusIncome_CHK_SeasonalLeases,test);
				se.element().enterOrValidateText(getCP_BusIncome_TXT_Months(strCP_BusIncome_TXT_Months),strCP_BusIncome_TXT_Months,test);
				se.element().enterOrValidateText(getCP_BusIncome_TXT_LimitPerMonth(strCP_BusIncome_TXT_LimitPerMonth),strCP_BusIncome_TXT_LimitPerMonth,test);
				
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_BIChangesEducationalInstitutions(strCP_BusIncome_CHK_BIChangesEducationalInstitutions),strCP_BusIncome_CHK_BIChangesEducationalInstitutions,test);
				se.element().enterOrValidateText(getCP_BusIncome_TXT_BIChangesEducationalInstitutionsDescriptionOfSchool(strCP_BusIncome_TXT_BIChangesEducationalInstitutionsDescriptionOfSchool),strCP_BusIncome_TXT_BIChangesEducationalInstitutionsDescriptionOfSchool,test);
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_BIChangesEducationalInstitutionsLimitedCoverage(strCP_BusIncome_CHK_BIChangesEducationalInstitutionsLimitedCoverage),strCP_BusIncome_CHK_BIChangesEducationalInstitutionsLimitedCoverage,test);
				se.element().enterOrValidateText(getCP_BusIncome_TXT_BIChangesEducationalInstitutionsExtensionOfRecoveryPeriodOption(strCP_BusIncome_TXT_BIChangesEducationalInstitutionsExtensionOfRecoveryPeriodOption),strCP_BusIncome_TXT_BIChangesEducationalInstitutionsExtensionOfRecoveryPeriodOption,test);
				
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_LandlordAddnlInsured(strCP_BusIncome_CHK_LandlordAddnlInsured),strCP_BusIncome_CHK_LandlordAddnlInsured,test);
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_BIChangesBEgOfPeriosRestoration(strCP_BusIncome_CHK_BIChangesBEgOfPeriosRestoration),strCP_BusIncome_CHK_BIChangesBEgOfPeriosRestoration,test);
				
				/*if(!strCP_BusIncome_TXT_Hour72PeriodOption.equalsIgnoreCase("N/A") && !strCP_BusIncome_TXT_Hour72PeriodOption.contains("validate2")) {
					se.element().clickSearchIcon(getCP_BusIncome_BTN_Hour72PeriodOptionSearch(), test);
					se.element().clickelement(getCP_BusIncome_LNK_Hour72PeriodOption(strCP_BusIncome_TXT_Hour72PeriodOption),strCP_BusIncome_TXT_Hour72PeriodOption,test);
				}else {
					se.element().enterOrValidateText(getCP_BusIncome_TXT_Hour72PeriodOption(strCP_BusIncome_TXT_Hour72PeriodOption),strCP_BusIncome_TXT_Hour72PeriodOption,test);
				}
				se.util().sleep(5000);
				*/				
				se.element().selectPopupWithMagnifier(getCP_BusIncome_TXT_Hour72PeriodOption(strCP_BusIncome_TXT_Hour72PeriodOption), getCP_BusIncome_BTN_Hour72PeriodOptionSearch(strCP_BusIncome_TXT_Hour72PeriodOption), strCP_BusIncome_TXT_Hour72PeriodOption, constants.NA, strCP_BusIncome_TXT_Hour72PeriodOption, constants.NA, constants.NA, constants.NA, test);
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_CivilAuthorityChangesIncCovPeriod(strCP_BusIncome_CHK_CivilAuthorityChangesIncCovPeriod),strCP_BusIncome_CHK_CivilAuthorityChangesIncCovPeriod,test);
				se.util().sleep(5000);
				/*if(!strCP_BusIncome_TXT_IncreasedCovgPrd.equalsIgnoreCase("N/A") && !strCP_BusIncome_TXT_IncreasedCovgPrd.contains("validate2")) {
					
					se.element().clickSearchIcon(getCP_BusIncome_BTN_IncreasedCovgPrdSearch(), test);
					se.element().clickelement(getCP_BusIncome_LNK_IncreasedCovgPrdOption(strCP_BusIncome_TXT_IncreasedCovgPrd),strCP_BusIncome_TXT_IncreasedCovgPrd,test);
				}else {
					se.element().enterOrValidateText(getCP_BusIncome_TXT_IncreasedCovgPrd(strCP_BusIncome_TXT_IncreasedCovgPrd),strCP_BusIncome_TXT_IncreasedCovgPrd,test);
				}
				*/
				se.element().selectPopupWithMagnifier(getCP_BusIncome_TXT_IncreasedCovgPrd(strCP_BusIncome_TXT_IncreasedCovgPrd), getCP_BusIncome_BTN_IncreasedCovgPrdSearch(strCP_BusIncome_TXT_IncreasedCovgPrd), strCP_BusIncome_TXT_IncreasedCovgPrd, constants.NA, strCP_BusIncome_TXT_IncreasedCovgPrd, constants.NA, constants.NA, constants.NA, test);
				
				se.element().enterOrValidateText(getCP_BusIncome_TXT_CoveragePeriod_NoOfDays(strCP_BusIncome_TXT_CoveragePeriod_NoOfDays),strCP_BusIncome_TXT_CoveragePeriod_NoOfDays,test);
				
				/*if(!strCP_BusIncome_TXT_Radius_NoOfMiles.equalsIgnoreCase("N/A") && !strCP_BusIncome_TXT_Radius_NoOfMiles.contains("validate2")) {
					se.element().clickSearchIcon(getCP_BusIncome_BTN_Radius_NoOfMilesSearch(), test);
					se.element().clickelement(getCP_BusIncome_LNK_Radius_NoOfMilesOption(strCP_BusIncome_TXT_Radius_NoOfMiles),strCP_BusIncome_TXT_Radius_NoOfMiles,test);
				}else {
					se.element().enterOrValidateText(getCP_BusIncome_TXT_Radius_NoOfMiles(strCP_BusIncome_TXT_Radius_NoOfMiles),strCP_BusIncome_TXT_Radius_NoOfMiles,test);
				}
				*/
				se.element().selectPopupWithMagnifier(getCP_BusIncome_TXT_Radius_NoOfMiles(strCP_BusIncome_TXT_Radius_NoOfMiles), getCP_BusIncome_BTN_Radius_NoOfMilesSearch(strCP_BusIncome_TXT_Radius_NoOfMiles), strCP_BusIncome_TXT_Radius_NoOfMiles, constants.NA, strCP_BusIncome_TXT_Radius_NoOfMiles, constants.NA, constants.NA, constants.NA, test);
				
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_RadioOrTelevisionAntennasBroadcast(strCP_BusIncome_CHK_RadioOrTelevisionAntennasBroadcast),strCP_BusIncome_CHK_RadioOrTelevisionAntennasBroadcast,test);
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_RadioOrTelevisionAntennasReceiving(strCP_BusIncome_CHK_RadioOrTelevisionAntennasReceiving),strCP_BusIncome_CHK_RadioOrTelevisionAntennasReceiving,test);
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_WaterExclusionBuyback(strCP_BusIncome_CHK_WaterExclusionBuyback),strCP_BusIncome_CHK_WaterExclusionBuyback,test);
				if(!strCP_BusIncome_TXT_WatercraftExclusionBuybackOption.equalsIgnoreCase("N/A") && !strCP_BusIncome_TXT_WatercraftExclusionBuybackOption.contains("validate2")) {
					se.element().clickSearchIcon(getCP_BusIncome_BTN_WatercraftExclusionBuybackOptionSearch(), test);
					se.element().clickelement(getCP_BusIncome_LNK_WatercraftExclusionBuybackOption(strCP_BusIncome_TXT_WatercraftExclusionBuybackOption),strCP_BusIncome_TXT_WatercraftExclusionBuybackOption,test);
				}else {
					se.element().enterOrValidateText(getCP_BusIncome_TXT_WatercraftExclusionBuybackOption(strCP_BusIncome_TXT_WatercraftExclusionBuybackOption),strCP_BusIncome_TXT_WatercraftExclusionBuybackOption,test);
				}
				se.element().enterOrValidateText(getCP_BusIncome_TXT_WatercraftExclusionBuybacklimitOfInsurance(strCP_BusIncome_TXT_WatercraftExclusionBuybacklimitOfInsurance),strCP_BusIncome_TXT_WatercraftExclusionBuybacklimitOfInsurance,test);
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_WaterfrontPropDamage(strCP_BusIncome_CHK_WaterfrontPropDamage),strCP_BusIncome_CHK_WaterfrontPropDamage,test);
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_MoltenMaterial(strCP_BusIncome_CHK_MoltenMaterial),strCP_BusIncome_CHK_MoltenMaterial,test);
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_PierAndWharf(strCP_BusIncome_CHK_PierAndWharf),strCP_BusIncome_CHK_PierAndWharf,test);
				if(!strCP_BusIncome_TXT_PierWharfOption.equalsIgnoreCase("N/A") && !strCP_BusIncome_TXT_PierWharfOption.contains("validate2")) {
					se.element().clickSearchIcon(getCP_BusIncome_BTN_PierWharfOptionSearch(), test);
					se.element().clickelement(getCP_BusIncome_LNK_PierWharfOption(strCP_BusIncome_TXT_PierWharfOption),strCP_BusIncome_TXT_PierWharfOption,test);
				}else {
					se.element().enterOrValidateText(getCP_BusIncome_TXT_PierWharfOption(strCP_BusIncome_TXT_PierWharfOption),strCP_BusIncome_TXT_PierWharfOption,test);
				}
				se.element().enterOrValidateText(getCP_BusIncome_TXT_PierAndWharfLimit(strCP_BusIncome_TXT_PierAndWharfLimit),strCP_BusIncome_TXT_PierAndWharfLimit,test);
				
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_EQSprinklerLeakage(strCP_BusIncome_CHK_EQSprinklerLeakage),strCP_BusIncome_CHK_EQSprinklerLeakage,test);
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_EQ_SuLimitCauseOfCause(strCP_BusIncome_CHK_EQ_SuLimitCauseOfCause),strCP_BusIncome_CHK_EQ_SuLimitCauseOfCause,test);
				se.element().enterOrValidateText(getCP_BusIncome_TXT_EQ_SubLimit(strCP_BusIncome_TXT_EQ_SubLimit),strCP_BusIncome_TXT_EQ_SubLimit,test);
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_earthquake(strCP_BusIncome_CHK_earthquake),strCP_BusIncome_CHK_earthquake,test);
				se.element().enterOrValidateText(getCP_BusIncome_TXT_NumberOfStories(strCP_BusIncome_TXT_NoOfStories),strCP_BusIncome_TXT_NoOfStories,test);
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_DiscretionaryPayrollExpenseEndo(strCP_BusIncome_CHK_DiscretionaryPayrollExpenseEndo),strCP_BusIncome_CHK_DiscretionaryPayrollExpenseEndo,test);
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_IncludedInFloodCoverage(strCP_BusIncome_CHK_IncludedInFloodCoverage),strCP_BusIncome_CHK_IncludedInFloodCoverage,test);
				se.element().selectPopupWithMagnifier(getCP_BusIncome_TXT_BlanketID(strCP_BusIncome_TXT_BlanketID), getCP_BusIncome_TXT_BlanketIDSearch(strCP_BusIncome_TXT_BlanketID), strCP_BusIncome_TXT_BlanketID, constants.NA, strCP_BusIncome_TXT_BlanketID, constants.NA, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getCP_BusIncome_TXT_FloodLimit(strCP_BusIncome_TXT_FloodLimit),strCP_BusIncome_TXT_FloodLimit,test);
				se.element().enterOrValidateText(getCP_BusIncome_TXT_FloodPremium(strCP_BusIncome_TXT_FloodPremium),strCP_BusIncome_TXT_FloodPremium,test);
				se.element().checkUncheckOrValidate(getCP_BusIncome_CHK_HideRatingDetails(strCP_BusIncome_CHK_HideRatingDetails),strCP_BusIncome_CHK_HideRatingDetails,test);

				se.element().Click(getNext(),test);
				
				if((strCP_BusIncome_BTN_Done.equalsIgnoreCase("Yes"))){
					
					se.element().Click(getDone(),test);
				}
				if((strCP_BusIncome_BTN_DoneWithBuilding.equalsIgnoreCase("Yes"))){
					
					se.element().Click(getDone(),test);
				}
				
	}catch(Exception e){
		se.verify().verifyEquals("Failed to fill in details for CP_BusIncome", true, false, true, test);
		
		}
				iteration++;
			}
		
	}
	catch (Exception e) {
		
		se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
		test.log(LogStatus.FAIL, "Failed", "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
		testTearDown(se, test);
	}
		
}
	}

