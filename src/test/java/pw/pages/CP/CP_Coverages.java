package pw.pages.CP;

import java.io.IOException;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CP;

public class CP_Coverages extends OR_CP {

	public void CP_BuildingCoveragePage(String strRegressionID, String transaction, String buildingName, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CP_BuildingCoverage")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
	    List<Map<String, String>> table = ExcelOperations.getBuildingPagesData("CP_BuildingCoverage", strRegressionID, buildingName,transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String BuildingName=(String) row.get("CP_Bldgs_BuildingName");
		String strCP_BldgCov_TXT_ClassCode=(String) row.get("CP_BldgCov_TXT_ClassCode");
		String strCP_BldgCov_TXT_ClassDescription=(String) row.get("CP_BldgCov_TXT_ClassDescription");
		String strCP_BldgCov_CHK_PublicAndInsProPlanApply=(String) row.get("CP_BldgCov_CHK_PublicAndInsProPlanApply");
		String strCP_BldgCov_TXT_PolicyType=(String) row.get("CP_BldgCov_TXT_PolicyType");
		String strCP_BldgCov_TXT_BuilidingGlassDescription=(String) row.get("CP_BldgCov_TXT_BuilidingGlassDescription");
		String strCP_BldgCov_TXT_FormNumber=(String) row.get("CP_BldgCov_TXT_FormNumber");
		String strCP_BldgCov_CHK_BlanketRating=(String) row.get("CP_BldgCov_CHK_BlanketRating");
		String strCP_BldgCov_TXT_BlanketIdNo=(String) row.get("CP_BldgCov_TXT_BlanketIdNo");
		String strCP_BldgCov_TXT_LossSettleMargin=(String) row.get("CP_BldgCov_TXT_LossSettleMargin");
		String strCP_BldgCov_TXT_Coverage=(String) row.get("CP_BldgCov_TXT_Coverage");
		String strCP_BldgCov_TXT_AmountofInsurance=(String) row.get("CP_BldgCov_TXT_AmountofInsurance");
		String strCP_BldgCov_TXT_WindHailDeductible=(String) row.get("CP_BldgCov_TXT_WindHailDeductible");
		String strCP_BldgCov_TXT_CauseOfLoss=(String) row.get("CP_BldgCov_TXT_CauseOfLoss");
		String strCP_BldgCov_TXT_Occupancy=(String) row.get("CP_BldgCov_TXT_Occupancy");
		String strCP_BldgCov_TXT_AdditionalInsuredIncluded=(String) row.get("CP_BldgCov_TXT_AdditionalInsuredIncluded");
		String strCP_BldgCov_TXT_Coinsurance=(String) row.get("CP_BldgCov_TXT_Coinsurance");
		String strCP_BldgCov_TXT_InceptionDateofLease=(String) row.get("CP_BldgCov_TXT_InceptionDateofLease");
		String strCP_BldgCov_TXT_ExpirationDateofLease=(String) row.get("CP_BldgCov_TXT_ExpirationDateofLease");
		String strCP_BldgCov_TXT_PercentInterest=(String) row.get("CP_BldgCov_TXT_PercentInterest");
		String strCP_BldgCov_CHK_TenantsLeaseInterest=(String) row.get("CP_BldgCov_CHK_TenantsLeaseInterest");
		String strCP_BldgCov_TXT_ActualRentValue=(String) row.get("CP_BldgCov_TXT_ActualRentValue");
		String strCP_BldgCov_TXT_MonthlyRentValue=(String) row.get("CP_BldgCov_TXT_MonthlyRentValue");
		String strCP_BldgCov_CHK_BonusPayments=(String) row.get("CP_BldgCov_CHK_BonusPayments");
		String strCP_BldgCov_TXT_BonusPaymentsAmount=(String) row.get("CP_BldgCov_TXT_BonusPaymentsAmount");
		String strCP_BldgCov_CHK_ImprovementsAndBetterments=(String) row.get("CP_BldgCov_CHK_ImprovementsAndBetterments");
		String strCP_BldgCov_TXT_ImprovementsAndBettermentsAmount=(String) row.get("CP_BldgCov_TXT_ImprovementsAndBettermentsAmount");
		String strCP_BldgCov_CHK_PrepaidRent=(String) row.get("CP_BldgCov_CHK_PrepaidRent");
		String strCP_BldgCov_TXT_PrepaidRentAmount=(String) row.get("CP_BldgCov_TXT_PrepaidRentAmount");
		String strCP_BldgCov_CHK_TenantsLeaseInterestOption_Meth1=(String) row.get("CP_BldgCov_CHK_TenantsLeaseInterestOption_Meth1");
		String strCP_BldgCov_CHK_TenantsLeaseInterestOption_Meth2=(String) row.get("CP_BldgCov_CHK_TenantsLeaseInterestOption_Meth2");
		String strCP_BldgCov_TXT_Deductible=(String) row.get("CP_BldgCov_TXT_Deductible");
		String strCP_BldgCov_TXT_MinimumPercentageRentedUsed=(String) row.get("CP_BldgCov_TXT_MinimumPercentageRentedUsed");
		String strCP_BldgCov_CHK_IncludeFloodCoverage=(String) row.get("CP_BldgCov_CHK_IncludeFloodCoverage");
		String strCP_BldgCov_TXT_BlanketID=(String) row.get("CP_BldgCov_TXT_BlanketID");
		String strCP_BldgCov_TXT_FloodLimit=(String) row.get("CP_BldgCov_TXT_FloodLimit");
		String strCP_BldgCov_TXT_FloodPremium=(String) row.get("CP_BldgCov_TXT_FloodPremium");
		String strCP_BldgCov_CHK_FixturesMachineryandEquipment=(String) row.get("CP_BldgCov_CHK_FixturesMachineryandEquipment");
		String strCP_BldgCov_CHK_AdditionalCoveredProperty=(String) row.get("CP_BldgCov_CHK_AdditionalCoveredProperty");
		String strCP_BldgCov_CHK_AdditionalPropertyNotCovered=(String) row.get("CP_BldgCov_CHK_AdditionalPropertyNotCovered");
		String strCP_BldgCov_CHK_OutdoorTreesShrubsPlants=(String) row.get("CP_BldgCov_CHK_OutdoorTreesShrubsPlants");
		String strCP_BldgCov_TXT_windhaildeduamount=(String) row.get("CP_BldgCov_TXT_windhaildeduamount");
		String strCP_BldgCov_CHK_SameasBuilding=(String) row.get("CP_BldgCov_CHK_SameasBuilding");
		String strCP_BldgCov_CHK_ExcludeVandalism=(String) row.get("CP_BldgCov_CHK_ExcludeVandalism");
		String strCP_BldgCov_CHK_ExcludeSprinklerLeakage=(String) row.get("CP_BldgCov_CHK_ExcludeSprinklerLeakage");
		String strCP_BldgCov_CHK_ExcludeWindstormandHail=(String) row.get("CP_BldgCov_CHK_ExcludeWindstormandHail");
		String strCP_BldgCov_CHK_ExcludeTheft=(String) row.get("CP_BldgCov_CHK_ExcludeTheft");
		String strCP_BldgCov_CHK_AgreedValue=(String) row.get("CP_BldgCov_CHK_AgreedValue");
		String strCP_BldgCov_TXT_AgreedValueExpirationDate=(String) row.get("CP_BldgCov_TXT_AgreedValueExpirationDate");
		String strCP_BldgCov_CHK_FunctionalBuildingValuation=(String) row.get("CP_BldgCov_CHK_FunctionalBuildingValuation");
		String strCP_BldgCov_CHK_ActualCashValue=(String) row.get("CP_BldgCov_CHK_ActualCashValue");
		String strCP_BldgCov_CHK_ReplacementCost=(String) row.get("CP_BldgCov_CHK_ReplacementCost");
		String strCP_BldgCov_TXT_GroupIRate=(String) row.get("CP_BldgCov_TXT_GroupIRate");
		String strCP_BldgCov_TXT_GroupIIRate=(String) row.get("CP_BldgCov_TXT_GroupIIRate");
		String strCP_BldgCov_TXT_WindFactorApplied=(String) row.get("CP_BldgCov_TXT_WindFactorApplied");
		String strCP_BldgCov_TXT_InflationGuard=(String) row.get("CP_BldgCov_TXT_InflationGuardPercent");
		String strCP_BldgCov_CHK_GreenUpgrades=(String) row.get("CP_BldgCov_CHK_GreenUpgrades");
		String strCP_BldgCov_CHK_BrokenorCrackedGlassExclusion=(String) row.get("CP_BldgCov_CHK_BrokenorCrackedGlassExclusion");
		String strCP_BldgCov_CHK_CreatedAfterJan11991=(String) row.get("CP_BldgCov_CHK_CreatedAfterJan11991");
		String strCP_BldgCov_CHK_PollutantCleanupandRemoval=(String) row.get("CP_BldgCov_CHK_Pollutant Cleanup and Removal");
		String strCP_BldgCov_CHK_VacancyPermit=(String) row.get("CP_BldgCov_CHK_VacancyPermit");
		String strCP_BldgCov_CHK_VacancyChanges=(String) row.get("CP_BldgCov_CHK_VacancyChanges");
		String strCP_BldgCov_TXT_MinPercentageRentedUsed=(String) row.get("CP_BldgCov_TXT_MinPercentageRentedUsed");
		String strCP_BldgCov_CHK_OrdinanceOrLaw=(String) row.get("CP_BldgCov_CHK_OrdinanceOrLaw");
		String strCP_BldgCov_TXT_CoverageType=(String) row.get("CP_BldgCov_TXT_CoverageType");
		String strCP_BldgCov_CHK_DebrisRemoval=(String) row.get("CP_BldgCov_CHK_DebrisRemoval");
		String strCP_BldgCov_CHK_WatercraftExclusionBuyback=(String) row.get("CP_BldgCov_CHK_WatercraftExclusionBuyback");
		String strCP_BldgCov_TXT_WatercraftExclusionBuybackOption=(String) row.get("CP_BldgCov_TXT_WatercraftExclusionBuybackOption");
		String strCP_BldgCov_TXT_WatercraftExclusionBuybacklimitOfInsurance=(String) row.get("CP_BldgCov_TXT_WatercraftExclusionBuybacklimitOfInsurance");
		String strCP_BldgCov_CHK_WaterPropertyDamage=(String) row.get("CP_BldgCov_CHK_WaterPropertyDamage");
		String strCP_BldgCov_CHK_MoltenMaterial=(String) row.get("CP_BldgCov_CHK_MoltenMaterial");
		String strCP_BldgCov_CHK_PierAndWharf=(String) row.get("CP_BldgCov_CHK_PierAndWharf");
		String strCP_BldgCov_TXT_PierAndWharfOption=(String) row.get("CP_BldgCov_TXT_PierAndWharfOption");
		String strCP_BldgCov_TXT_PierAndWharfLimitOfInsurance=(String) row.get("CP_BldgCov_TXT_PierAndWharfLimitOfInsurance");
		String strCP_BldgCov_CHK_EarthquakeCauseOfLoss=(String) row.get("CP_BldgCov_CHK_EarthquakeCauseOfLoss");
		String strCP_BldgCov_CHK_EarthquakeSprinklerLeakage=(String) row.get("CP_BldgCov_CHK_EarthquakeSprinklerLeakage");
		String strCP_BldgCov_CHK_EarthquakeSubLimitCauseofLoss=(String) row.get("CP_BldgCov_CHK_EarthquakeSubLimitCauseofLoss");
		String strCP_BldgCov_TXT_EQSubLimit=(String) row.get("CP_BldgCov_TXT_EQSubLimit");
		String strCP_BldgCov_TXT_SubLimitPercentage=(String) row.get("CP_BldgCov_TXT_SubLimitPercentage");
		String strCP_BldgCov_TXT_SubLimitDeductible=(String) row.get("CP_BldgCov_TXT_SubLimitDeductible%");
		String strCP_BldgCov_CHK_Reporting=(String) row.get("CP_BldgCov_CHK_Reporting");
		String strCP_BldgCov_CHK_CompletedValue=(String) row.get("CP_BldgCov_CHK_CompletedValue");
		String strCP_BldgCov_CHK_Renovations=(String) row.get("CP_BldgCov_CHK_Renovations");
		String strCP_BldgCov_TXT_CompletedClassCode=(String) row.get("CP_BldgCov_TXT_CompletedClassCode");
		String strCP_BldgCov_TXT_RenovationsLimitOfInsurance=(String) row.get("CP_BldgCov_TXT_RenovationsLimitOfInsurance");
		String strCP_BldgCov_CHK_CollapseDuringConstruction=(String) row.get("CP_BldgCov_CHK_CollapseDuringConstruction");
		String strCP_BldgCov_TXT_CollapseOption=(String) row.get("CP_BldgCov_TXT_CollapseOption");
		String strCP_BldgCov_CHK_TheftofBldgMaterialsFixtMachineryEquip=(String) row.get("CP_BldgCov_CHK_TheftofBldgMaterialsFixtMachineryEquip");
		String strCP_BldgCov_CHK_BuildingMaterialsandSuppliesofOthers=(String) row.get("CP_BldgCov_CHK_BuildingMaterialsandSuppliesofOthers");
		String strCP_BldgCov_TXT_MaterialsSuppliesTotalIncreaseLimit=(String) row.get("CP_BldgCov_TXT_Materials&SuppliesTotalIncreaseLimit");
		String strCP_BldgCov_TXT_MaterialsSuppliesPremium=(String) row.get("CP_BldgCov_TXT_Materials&SuppliesPremium");
		String strCP_BldgCov_CHK_SeparateorSub_contractorexclusion=(String) row.get("CP_BldgCov_CHK_SeparateorSubContractorexclusion");
		String strCP_BldgCov_TXT_ExcludedContractor=(String) row.get("CP_BldgCov_TXT_ExcludedContractor");
		String strCP_BldgCov_TXT_ExcludedInstallation=(String) row.get("CP_BldgCov_TXT_ExcludedInstallation");
		String strCP_BldgCov_CHK_Separateorsub_contractorcoverage=(String) row.get("CP_BldgCov_CHK_SeparateorSubContractorcoverage");
		String strCP_BldgCov_TXT_CoveredContractor=(String) row.get("CP_BldgCov_TXT_CoveredContractor");
		String strCP_BldgCov_TXT_CoveredInstallation=(String) row.get("CP_BldgCov_TXT_CoveredInstallation");
		String strCP_BldgCov_CHK_HideRatingDetails=(String) row.get("CP_BldgCov_CHK_HideRatingDetails");
		String strTransaction  = (String) row.get("Transaction Name");
		String strCP_BldgCov_BTN_Done  = (String) row.get("CP_BldgCov_BTN_DoneWithBuildings");
		String strCP_BldgCov_TXT_CompletedClassCodeSearchField = (String) row.get("CP_BldgCov_TXT_CompletedClassCodeSearchField");
		String strCP_BldgCov_TXT_CompletedClassCodeDesc = (String) row.get("CP_BldgCov_TXT_CompletedClassCodeDesc");
		String strCP_BldgCov_TXT_InflationGuardPercentFilterNeeded = (String) row.get("CP_BldgCov_TXT_InflationGuardPercentFilterNeeded");
		
			try{
				se.log().logTestStep("CP_BuildingCoveragePage");
				test.log(LogStatus.INFO, "CP_BuildingCoverage page","Transaction Step : "+strTransaction + "<br>" +"Page : CP_BuildingCoverage" + "<br>" +"Building Details : ");
				se.util().sleep(1000);
				
				se.verify().verifyEquals("BuildingCoveragePage of PowerWriter ",getCP_BldgCov_LBL_VerifyBuildingCoverage().isDisplayed(),true, true,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_ClassCode(strCP_BldgCov_TXT_ClassCode),strCP_BldgCov_TXT_ClassCode,test); 
				se.element().enterOrValidateText(getCP_BldgCov_TXT_ClassDescription(strCP_BldgCov_TXT_ClassDescription),strCP_BldgCov_TXT_ClassDescription,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_PublicAndInsProPlanApply(strCP_BldgCov_CHK_PublicAndInsProPlanApply),strCP_BldgCov_CHK_PublicAndInsProPlanApply,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_PolicyType(strCP_BldgCov_TXT_PolicyType),strCP_BldgCov_TXT_PolicyType,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_FormNumber(strCP_BldgCov_TXT_FormNumber),strCP_BldgCov_TXT_FormNumber,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_BlanketRating(strCP_BldgCov_CHK_BlanketRating),strCP_BldgCov_CHK_BlanketRating,test);
			 	se.element().enterOrValidateText(getCP_BldgCov_TXT_BlanketIdNo(strCP_BldgCov_TXT_BlanketIdNo),strCP_BldgCov_TXT_BlanketIdNo,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_LossSettleMargin(strCP_BldgCov_TXT_LossSettleMargin),strCP_BldgCov_TXT_LossSettleMargin,test);
				/*if(!strCP_BldgCov_TXT_Coverage.equalsIgnoreCase("N/A") && !strCP_BldgCov_TXT_Coverage.contains("validate2")){
					se.element().clickSearchIcon(getCP_BldgCov_BTN_Coverage(), test);
					se.element().Click(getCP_BldgCov_LNK_Coverage(strCP_BldgCov_TXT_Coverage), test);
				}else{
					se.element().enterOrValidateText(getCP_BldgCov_TXT_Coverage(strCP_BldgCov_TXT_Coverage),strCP_BldgCov_TXT_Coverage,test);
					
				}*/
				se.element().selectPopupWithMagnifier(getCP_BldgCov_TXT_Coverage(strCP_BldgCov_TXT_Coverage), getCP_BldgCov_BTN_Coverage(strCP_BldgCov_TXT_Coverage), strCP_BldgCov_TXT_Coverage, constants.NA, strCP_BldgCov_TXT_Coverage, constants.NA, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_BuilidingGlassDescription(strCP_BldgCov_TXT_BuilidingGlassDescription),strCP_BldgCov_TXT_BuilidingGlassDescription,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_AmountofInsurance(strCP_BldgCov_TXT_AmountofInsurance),strCP_BldgCov_TXT_AmountofInsurance,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_WindHailDeductible(strCP_BldgCov_TXT_WindHailDeductible),strCP_BldgCov_TXT_WindHailDeductible,test);
				/*if(!strCP_BldgCov_TXT_CauseOfLoss.equalsIgnoreCase("N/A") && !strCP_BldgCov_TXT_CauseOfLoss.contains("validate2")){
					se.element().clickSearchIcon(getCP_BldgCov_BTN_CauseOfLoss(), test);
					se.element().Click(getCP_BldgCov_LNK_CauseOfLoss(strCP_BldgCov_TXT_CauseOfLoss), test);
				}else{
					se.element().enterOrValidateText(getCP_BldgCov_TXT_CauseOfLoss(strCP_BldgCov_TXT_CauseOfLoss),strCP_BldgCov_TXT_CauseOfLoss,test);
				}*/
				se.element().selectPopupWithMagnifier(getCP_BldgCov_TXT_CauseOfLoss(strCP_BldgCov_TXT_CauseOfLoss), getCP_BldgCov_BTN_CauseOfLoss(strCP_BldgCov_TXT_CauseOfLoss), strCP_BldgCov_TXT_CauseOfLoss, constants.NA, strCP_BldgCov_TXT_CauseOfLoss, constants.NA, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_Occupancy(strCP_BldgCov_TXT_Occupancy),strCP_BldgCov_TXT_Occupancy,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_AdditionalInsuredIncluded(strCP_BldgCov_TXT_AdditionalInsuredIncluded),strCP_BldgCov_TXT_AdditionalInsuredIncluded,test);
				
				/*if(!strCP_BldgCov_TXT_Coinsurance.equalsIgnoreCase("N/A") && !strCP_BldgCov_TXT_Coinsurance.contains("validate2")){
					se.element().clickSearchIcon(getCP_BldgCov_BTN_Coinsurance(), test);
					se.element().Click(getCP_BldgCov_LNK_Coinsurance(strCP_BldgCov_TXT_Coinsurance), test);
				}else{
					se.element().enterOrValidateText(getCP_BldgCov_TXT_Coinsurance(strCP_BldgCov_TXT_Coinsurance),strCP_BldgCov_TXT_Coinsurance,test);
				}*/
				se.element().selectPopupWithMagnifier(getCP_BldgCov_TXT_Coinsurance(strCP_BldgCov_TXT_Coinsurance), getCP_BldgCov_BTN_Coinsurance(strCP_BldgCov_TXT_Coinsurance), strCP_BldgCov_TXT_Coinsurance, constants.NA, strCP_BldgCov_TXT_Coinsurance, constants.NA, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_InceptionDateofLease(strCP_BldgCov_TXT_InceptionDateofLease),strCP_BldgCov_TXT_InceptionDateofLease,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_ExpirationDateofLease(strCP_BldgCov_TXT_ExpirationDateofLease),strCP_BldgCov_TXT_ExpirationDateofLease,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_PercentInterest(strCP_BldgCov_TXT_PercentInterest),strCP_BldgCov_TXT_PercentInterest,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_TenantsLeaseInterest(strCP_BldgCov_CHK_TenantsLeaseInterest),strCP_BldgCov_CHK_TenantsLeaseInterest,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_ActualRentValue(strCP_BldgCov_TXT_ActualRentValue),strCP_BldgCov_TXT_ActualRentValue,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_MonthlyRentValue(strCP_BldgCov_TXT_MonthlyRentValue),strCP_BldgCov_TXT_MonthlyRentValue,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_BonusPayments(strCP_BldgCov_CHK_BonusPayments),strCP_BldgCov_CHK_BonusPayments,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_BonusPaymentsAmount(strCP_BldgCov_TXT_BonusPaymentsAmount),strCP_BldgCov_TXT_BonusPaymentsAmount,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_ImprovementsAndBetterments(strCP_BldgCov_CHK_ImprovementsAndBetterments),strCP_BldgCov_CHK_ImprovementsAndBetterments,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_ImprovementsAndBettermentsAmount(strCP_BldgCov_TXT_ImprovementsAndBettermentsAmount),strCP_BldgCov_TXT_ImprovementsAndBettermentsAmount,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_PrepaidRent(strCP_BldgCov_CHK_PrepaidRent),strCP_BldgCov_CHK_PrepaidRent,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_PrepaidRentAmount(strCP_BldgCov_TXT_PrepaidRentAmount),strCP_BldgCov_TXT_PrepaidRentAmount,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_TenantsLeaseInterestOption_Meth1(strCP_BldgCov_CHK_TenantsLeaseInterestOption_Meth1),strCP_BldgCov_CHK_TenantsLeaseInterestOption_Meth1,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_TenantsLeaseInterestOption_Meth2(strCP_BldgCov_CHK_TenantsLeaseInterestOption_Meth2),strCP_BldgCov_CHK_TenantsLeaseInterestOption_Meth2,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_Deductible(strCP_BldgCov_TXT_Deductible),strCP_BldgCov_TXT_Deductible,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_MinimumPercentageRentedUsed(strCP_BldgCov_TXT_MinimumPercentageRentedUsed),strCP_BldgCov_TXT_MinimumPercentageRentedUsed,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_IncludeFloodCoverage(strCP_BldgCov_CHK_IncludeFloodCoverage),strCP_BldgCov_CHK_IncludeFloodCoverage,test);
				se.element().selectPopupWithMagnifier(getCP_BldgCov_TXT_BlanketID(strCP_BldgCov_TXT_BlanketID), getCP_BldgCov_TXT_BlanketIDSearch(strCP_BldgCov_TXT_BlanketID), strCP_BldgCov_TXT_BlanketID, constants.NA, strCP_BldgCov_TXT_BlanketID, constants.NA, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_FloodLimit(strCP_BldgCov_TXT_FloodLimit),strCP_BldgCov_TXT_FloodLimit,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_FloodPremium(strCP_BldgCov_TXT_FloodPremium),strCP_BldgCov_TXT_FloodPremium,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_FixturesMachineryandEquipment(strCP_BldgCov_CHK_FixturesMachineryandEquipment),strCP_BldgCov_CHK_FixturesMachineryandEquipment,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_AdditionalCoveredProperty(strCP_BldgCov_CHK_AdditionalCoveredProperty),strCP_BldgCov_CHK_AdditionalCoveredProperty,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_AdditionalPropertyNotCovered(strCP_BldgCov_CHK_AdditionalPropertyNotCovered),strCP_BldgCov_CHK_AdditionalPropertyNotCovered,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_OutdoorTreesShrubsPlants(strCP_BldgCov_CHK_OutdoorTreesShrubsPlants),strCP_BldgCov_CHK_OutdoorTreesShrubsPlants,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_windhaildeduamount(strCP_BldgCov_TXT_windhaildeduamount),strCP_BldgCov_TXT_windhaildeduamount,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_SameasBuilding(strCP_BldgCov_CHK_SameasBuilding),strCP_BldgCov_CHK_SameasBuilding,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_ExcludeVandalism(strCP_BldgCov_CHK_ExcludeVandalism),strCP_BldgCov_CHK_ExcludeVandalism,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_ExcludeSprinklerLeakage(strCP_BldgCov_CHK_ExcludeSprinklerLeakage),strCP_BldgCov_CHK_ExcludeSprinklerLeakage,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_ExcludeWindstormandHail(strCP_BldgCov_CHK_ExcludeWindstormandHail),strCP_BldgCov_CHK_ExcludeWindstormandHail,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_ExcludeTheft(strCP_BldgCov_CHK_ExcludeTheft),strCP_BldgCov_CHK_ExcludeTheft,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_AgreedValue(strCP_BldgCov_CHK_AgreedValue),strCP_BldgCov_CHK_AgreedValue,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_AgreedValueExpirationDate(strCP_BldgCov_TXT_AgreedValueExpirationDate),strCP_BldgCov_TXT_AgreedValueExpirationDate,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_FunctionalBuildingValuation(strCP_BldgCov_CHK_FunctionalBuildingValuation),strCP_BldgCov_CHK_FunctionalBuildingValuation,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_ActualCashValue(strCP_BldgCov_CHK_ActualCashValue),strCP_BldgCov_CHK_ActualCashValue,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_ReplacementCost(strCP_BldgCov_CHK_ReplacementCost),strCP_BldgCov_CHK_ReplacementCost,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_GroupIRate(strCP_BldgCov_TXT_GroupIRate),strCP_BldgCov_TXT_GroupIRate,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_GroupIIRate(strCP_BldgCov_TXT_GroupIIRate),strCP_BldgCov_TXT_GroupIIRate,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_WindFactorApplied(strCP_BldgCov_TXT_WindFactorApplied),strCP_BldgCov_TXT_WindFactorApplied,test);
				/*if(!strCP_BldgCov_TXT_InflationGuard.equalsIgnoreCase("N/A") && !strCP_BldgCov_TXT_InflationGuard.contains("validate2")){
					se.element().clickSearchIcon(getCP_BldgCov_BTN_InflationGuard(), test);
					se.element().Click(getCP_BldgCov_LNK_InflationGuard(strCP_BldgCov_TXT_InflationGuard), test);
				}else{ 
				se.element().enterOrValidateText(getCP_BldgCov_TXT_InflationGuard(strCP_BldgCov_TXT_InflationGuard),strCP_BldgCov_TXT_InflationGuard,test);
				}*/
				se.element().selectPopupWithMagnifier(getCP_BldgCov_TXT_InflationGuard(strCP_BldgCov_TXT_InflationGuard), getCP_BldgCov_BTN_InflationGuard(strCP_BldgCov_TXT_InflationGuard), strCP_BldgCov_TXT_InflationGuard, strCP_BldgCov_TXT_InflationGuardPercentFilterNeeded, strCP_BldgCov_TXT_InflationGuard, constants.NA, constants.NA, constants.NA, test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_GreenUpgrades(strCP_BldgCov_CHK_GreenUpgrades),strCP_BldgCov_CHK_GreenUpgrades,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_BrokenorCrackedGlassExclusion(strCP_BldgCov_CHK_BrokenorCrackedGlassExclusion),strCP_BldgCov_CHK_BrokenorCrackedGlassExclusion,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_CreatedAfterJan11991(strCP_BldgCov_CHK_CreatedAfterJan11991),strCP_BldgCov_CHK_CreatedAfterJan11991,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_PollutantCleanupandRemoval(strCP_BldgCov_CHK_PollutantCleanupandRemoval),strCP_BldgCov_CHK_PollutantCleanupandRemoval,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_VacancyPermit(strCP_BldgCov_CHK_VacancyPermit),strCP_BldgCov_CHK_VacancyPermit,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_VacancyChanges(strCP_BldgCov_CHK_VacancyChanges),strCP_BldgCov_CHK_VacancyChanges,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_MinPercentageRentedUsed(strCP_BldgCov_TXT_MinPercentageRentedUsed),strCP_BldgCov_TXT_MinPercentageRentedUsed,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_OrdinanceOrLaw(strCP_BldgCov_CHK_OrdinanceOrLaw),strCP_BldgCov_CHK_OrdinanceOrLaw,test);
				/*if(!strCP_BldgCov_TXT_CoverageType.equalsIgnoreCase("N/A") && !strCP_BldgCov_TXT_CoverageType.contains("validate2")){
					se.element().clickSearchIcon(getCP_BldgCov_BTN_CoverageType(), test);
					se.element().Click(getCP_BldgCov_LNK_CoverageType(strCP_BldgCov_TXT_CoverageType), test);
				}else{
				se.element().enterOrValidateText(getCP_BldgCov_TXT_CoverageType(strCP_BldgCov_TXT_CoverageType),strCP_BldgCov_TXT_CoverageType,test);
				}*/
				se.element().selectPopupWithMagnifier(getCP_BldgCov_TXT_CoverageType(strCP_BldgCov_TXT_CoverageType), getCP_BldgCov_BTN_CoverageType(strCP_BldgCov_TXT_CoverageType), strCP_BldgCov_TXT_CoverageType, constants.NA, strCP_BldgCov_TXT_CoverageType, constants.NA, constants.NA, constants.NA, test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_DebrisRemoval(strCP_BldgCov_CHK_DebrisRemoval),strCP_BldgCov_CHK_DebrisRemoval,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_WatercraftExclusionBuyback(strCP_BldgCov_CHK_WatercraftExclusionBuyback),strCP_BldgCov_CHK_WatercraftExclusionBuyback,test);
				/*se.element().enterOrValidateText(getCP_BldgCov_TXT_WatercraftExclusionBuybackOption((strCP_BldgCov_TXT_WatercraftExclusionBuybackOption)),strCP_BldgCov_TXT_WatercraftExclusionBuybackOption,test);
				if(se.element().isElementPresent(common_BTN_PopupClose)){
					se.element().Click(getCP_BldgCov_LNK_WatercraftExclusionBuybackOption(strCP_BldgCov_TXT_WatercraftExclusionBuybackOption), test);
				}*/
				se.element().selectPopupWithMagnifier(getCP_BldgCov_TXT_WatercraftExclusionBuybackOption(strCP_BldgCov_TXT_WatercraftExclusionBuybackOption), getCP_BldgCov_TXT_WatercraftExclusionBuybackOptionSearch(strCP_BldgCov_TXT_WatercraftExclusionBuybackOption), strCP_BldgCov_TXT_WatercraftExclusionBuybackOption, constants.NA, strCP_BldgCov_TXT_WatercraftExclusionBuybackOption, constants.NA, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_WatercraftExclusionBuybacklimitOfInsurance(strCP_BldgCov_TXT_WatercraftExclusionBuybacklimitOfInsurance),strCP_BldgCov_TXT_WatercraftExclusionBuybacklimitOfInsurance,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_WaterPropertyDamage(strCP_BldgCov_CHK_WaterPropertyDamage),strCP_BldgCov_CHK_WaterPropertyDamage,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_MoltenMaterial(strCP_BldgCov_CHK_MoltenMaterial),strCP_BldgCov_CHK_MoltenMaterial,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_PierAndWharf(strCP_BldgCov_CHK_PierAndWharf),strCP_BldgCov_CHK_PierAndWharf,test);
				/*if(!strCP_BldgCov_TXT_PierAndWharfOption.equalsIgnoreCase("N/A") && !strCP_BldgCov_TXT_PierAndWharfOption.contains("validate2")){
					se.util().sleep(1000);
					se.element().clickSearchIcon(getCP_BldgCov_BTN_PierAndWharfOption(), test);
					se.element().clickElement(getCP_BldgCov_LNK_PierAndWharfOption(strCP_BldgCov_TXT_PierAndWharfOption), test);
				}else{
					se.element().enterOrValidateText(getCP_BldgCov_TXT_PierAndWharfOption(strCP_BldgCov_TXT_PierAndWharfOption),strCP_BldgCov_TXT_PierAndWharfOption,test);
				}*/
				se.element().selectPopupWithMagnifier(getCP_BldgCov_TXT_PierAndWharfOption(strCP_BldgCov_TXT_PierAndWharfOption), getCP_BldgCov_BTN_PierAndWharfOption(strCP_BldgCov_TXT_PierAndWharfOption), strCP_BldgCov_TXT_PierAndWharfOption, constants.NA, strCP_BldgCov_TXT_PierAndWharfOption, constants.NA, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_PierAndWharfLimitOfInsurance(strCP_BldgCov_TXT_PierAndWharfLimitOfInsurance),strCP_BldgCov_TXT_PierAndWharfLimitOfInsurance,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_IncludeFloodCoverage(strCP_BldgCov_CHK_IncludeFloodCoverage),strCP_BldgCov_CHK_IncludeFloodCoverage,test);
 				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_EarthquakeCauseOfLoss(strCP_BldgCov_CHK_EarthquakeCauseOfLoss),strCP_BldgCov_CHK_EarthquakeCauseOfLoss,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_EarthquakeSprinklerLeakage(strCP_BldgCov_CHK_EarthquakeSprinklerLeakage),strCP_BldgCov_CHK_EarthquakeSprinklerLeakage,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_EarthquakeSubLimitCauseofLoss(strCP_BldgCov_CHK_EarthquakeSubLimitCauseofLoss),strCP_BldgCov_CHK_EarthquakeSubLimitCauseofLoss,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_EQSubLimit(strCP_BldgCov_TXT_EQSubLimit),strCP_BldgCov_TXT_EQSubLimit,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_SubLimitPercentage(strCP_BldgCov_TXT_SubLimitPercentage),strCP_BldgCov_TXT_SubLimitPercentage,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_SubLimitDeductible(strCP_BldgCov_TXT_SubLimitDeductible),strCP_BldgCov_TXT_SubLimitDeductible,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_Reporting(strCP_BldgCov_CHK_Reporting),strCP_BldgCov_CHK_Reporting,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_CompletedValue(strCP_BldgCov_CHK_CompletedValue),strCP_BldgCov_CHK_CompletedValue,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_Renovations(strCP_BldgCov_CHK_Renovations),strCP_BldgCov_CHK_Renovations,test);
				/*if(!strCP_BldgCov_TXT_CompletedClassCode.equalsIgnoreCase("N/A") && !strCP_BldgCov_TXT_CompletedClassCode.contains("validate2")){
					se.element().clickSearchIcon(getCP_BldgCov_TXT_CompletedClassCodeSearch(), test);
					if(strCP_BldgCov_TXT_CompletedClassCodeSearchField.equalsIgnoreCase("Yes")){
						se.element().enterOrValidateText(getCP_BldgCov_TXT_SearchCompletedClasCode(strCP_BldgCov_TXT_CompletedClassCode), strCP_BldgCov_TXT_CompletedClassCode, test);
						se.element().enterOrValidateText(getCP_BldgCov_TXT_SearchCompletedClasCodeDesc(strCP_BldgCov_TXT_CompletedClassCodeDesc), strCP_BldgCov_TXT_CompletedClassCodeDesc, test);
						se.element().clickElement(getCP_BldgCov_BTN_Search_Icon(), test);
					}
					se.element().Click(getCPBldgCov_LNK_SelectCompleteClassCode(strCP_BldgCov_TXT_CompletedClassCodeDesc,strCP_BldgCov_TXT_CompletedClassCode), test);
				}else{
					se.element().enterOrValidateText(getCP_BldgCov_TXT_CompletedClassCode(strCP_BldgCov_TXT_CompletedClassCode),strCP_BldgCov_TXT_CompletedClassCode,test);
				}*/
				se.element().selectPopupWithMagnifier(getCP_BldgCov_TXT_CompletedClassCode(strCP_BldgCov_TXT_CompletedClassCode), getCP_BldgCov_TXT_CompletedClassCodeSearch(strCP_BldgCov_TXT_CompletedClassCode), strCP_BldgCov_TXT_CompletedClassCode, strCP_BldgCov_TXT_CompletedClassCodeSearchField, strCP_BldgCov_TXT_CompletedClassCode, strCP_BldgCov_TXT_CompletedClassCodeDesc, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_RenovationsLimitOfInsurance(strCP_BldgCov_TXT_RenovationsLimitOfInsurance),strCP_BldgCov_TXT_RenovationsLimitOfInsurance,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_CollapseDuringConstruction(strCP_BldgCov_CHK_CollapseDuringConstruction),strCP_BldgCov_CHK_CollapseDuringConstruction,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_CollapseOption(strCP_BldgCov_TXT_CollapseOption),strCP_BldgCov_TXT_CollapseOption,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_TheftofBldgMaterialsFixtMachineryEquip(strCP_BldgCov_CHK_TheftofBldgMaterialsFixtMachineryEquip),strCP_BldgCov_CHK_TheftofBldgMaterialsFixtMachineryEquip,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_BuildingMaterialsandSuppliesofOthers(strCP_BldgCov_CHK_BuildingMaterialsandSuppliesofOthers),strCP_BldgCov_CHK_BuildingMaterialsandSuppliesofOthers,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_MaterialsSuppliesTotalIncreaseLimit(strCP_BldgCov_TXT_MaterialsSuppliesTotalIncreaseLimit),strCP_BldgCov_TXT_MaterialsSuppliesTotalIncreaseLimit,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_MaterialsSuppliesPremium(strCP_BldgCov_TXT_MaterialsSuppliesPremium),strCP_BldgCov_TXT_MaterialsSuppliesPremium,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_SeparateorSub_contractorexclusion(strCP_BldgCov_CHK_SeparateorSub_contractorexclusion),strCP_BldgCov_CHK_SeparateorSub_contractorexclusion,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_ExcludedContractor(strCP_BldgCov_TXT_ExcludedContractor),strCP_BldgCov_TXT_ExcludedContractor,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_ExcludedInstallation(strCP_BldgCov_TXT_ExcludedInstallation),strCP_BldgCov_TXT_ExcludedInstallation,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_Separateorsub_contractorcoverage(strCP_BldgCov_CHK_Separateorsub_contractorcoverage),strCP_BldgCov_CHK_Separateorsub_contractorcoverage,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_CoveredContractor(strCP_BldgCov_TXT_CoveredContractor),strCP_BldgCov_TXT_CoveredContractor,test);
				se.element().enterOrValidateText(getCP_BldgCov_TXT_CoveredInstallation(strCP_BldgCov_TXT_CoveredInstallation),strCP_BldgCov_TXT_CoveredInstallation,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_HideRatingDetails(strCP_BldgCov_CHK_HideRatingDetails),strCP_BldgCov_CHK_HideRatingDetails,test);
				se.element().Click(getNext(),test);
				se.util().sleep(2000); 
				if(strCP_BldgCov_BTN_Done.equalsIgnoreCase("Yes")){
					se.element().Click(getNext(),test);
				}
			
				
			}
			catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CP_BuildingCoveragePage", true, false, true, test);
			
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
	
	public void CP_BusinessPersonalProperty(String strRegressionID, String transaction, String buildingName, ExtentTest test) throws IOException {
		
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CP_PersonalPropertyCov")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		
		List<Map<String, String>> table = ExcelOperations.getBuildingPagesData("CP_PersonalPropertyCov", strRegressionID, buildingName,transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCP_PerPropCov_BTN_Add=(String) row.get("CP_PerPropCov_BTN_Add");
		String strCP_PerPropCov_Edit=(String) row.get("CP_PerPropCov_Edit"); 
		String strCP_PerPropCov_Done=(String) row.get("CP_PerPropCov_Done");
		String strCP_PerPropCov_TXT_PersonalPropertyClassCode=(String) row.get("CP_PerPropCov_TXT_PersonalPropertyClassCode");
		String strCP_PerPropCov_TXT_PersonalPropertyClassDescriptionPopup=(String) row.get("CP_PerPropCov_TXT_PersonalPropertyClassDescriptionPopup");
		String strCP_PerPropCov_TXT_PersonalPropertyClassDescription=(String) row.get("CP_PerPropCov_TXT_PersonalPropertyClassDescription");
		String strCP_PerPropCov_TXT_PersonalPropertyClassCodeSearch=(String) row.get("CP_PerPropCov_TXT_PersonalPropertyClassCodeSearch");
		String strCP_PerPropCov_TXT_PolicyType=(String) row.get("CP_PerPropCov_TXT_PolicyType");
		String strCP_PerPropCov_CHK_PublicAndInsPropPlanApply=(String) row.get("CP_PerPropCov_CHK_PublicAndInsPropPlanApply");
		String strCP_PerPropCov_CHK_BlanketRating=(String) row.get("CP_PerPropCov_CHK_BlanketRating");
		String strCP_PerPropCov_TXT_covblanketidno=(String) row.get("CP_PerPropCov_TXT_covblanketidno");
		String strCP_PerPropCov_TXT_losssettlemargin=(String) row.get("CP_PerPropCov_TXT_losssettlemargin");
		String strCP_PerPropCov_CHK_BusinessPersonalPropertyCoverage=(String) row.get("CP_PerPropCov_CHK_BusinessPersonalPropertyCoverage");
		String strCP_PerPropCov_CHK_PersonalPropertyOfOthersCoverage=(String) row.get("CP_PerPropCov_CHK_PersonalPropertyOfOthersCoverage");
		String strCP_PerPropCov_CHK_LegalLiabilityCoverage=(String) row.get("CP_PerPropCov_CHK_LegalLiabilityCoverage");
		String strCP_PerPropCov_CHK_CondominiumCommercial=(String) row.get("CP_PerPropCov_CHK_CondominiumCommercial");
		String strCP_PerPropCov_TXT_SeparationOfCoverage=(String) row.get("CP_PerPropCov_TXT_SeparationOfCoverage");
		String strCP_PerPropCov_CHK_IncludingStock=(String) row.get("CP_PerPropCov_CHK_IncludingStock");
		String strCP_PerPropCov_CHK_IncreaseCoverageForNonOwnedDetachedTrailers=(String) row.get("CP_PerPropCov_CHK_IncreaseCoverageForNonOwnedDetachedTrailers");
		String strCP_PerPropCov_TXT_CoverageLimitinexcessof$5000=(String) row.get("CP_PerPropCov_TXT_CoverageLimitinexcessof$5000");
		String strCP_PerPropCov_CHK_ValueReporting=(String) row.get("CP_PerPropCov_CHK_ValueReporting");
		String strCP_PerPropCov_TXT_ReportingType=(String) row.get("CP_PerPropCov_TXT_ReportingType");
		String strCP_PerPropCov_TXT_ReportingPeriod=(String) row.get("CP_PerPropCov_TXT_ReportingPeriod");
		String strCP_PerPropCov_CHK_SeasonalRisk=(String) row.get("CP_PerPropCov_CHK_SeasonalRisk");
		String strCP_PerPropCov_CHK_AgriculturalProductsStorage=(String) row.get("CP_PerPropCov_CHK_AgriculturalProductsStorage");
		String strCP_PerPropCov_TXT_NetAverageValue=(String) row.get("CP_PerPropCov_TXT_NetAverageValue");
		String strCP_PerPropCov_TXT_AmountofInsurance=(String) row.get("CP_PerPropCov_TXT_AmountofInsurance");
		String strCP_PerPropCov_TXT_CauseOfLoss=(String) row.get("CP_PerPropCov_TXT_CauseOfLoss");
		String strCP_PerPropCov_TXT_Occupancy=(String) row.get("CP_PerPropCov_TXT_Occupancy");
		String strCP_PerPropCov_TXT_AdditionalInsuredorInterestLegLiab=(String) row.get("CP_PerPropCov_TXT_AdditionalInsuredorInterestLegLiab");
		String strCP_PerPropCov_TXT_Coinsurance=(String) row.get("CP_PerPropCov_TXT_Coinsurance");
		String strCP_PerPropCov_CHK_LeasedProperty=(String) row.get("CP_PerPropCov_CHK_LeasedProperty");
		String strCP_PerPropCov_CHK_AdditionalCoveredProperty=(String) row.get("CP_PerPropCov_CHK_AdditionalCoveredProperty");
		String strCP_PerPropCov_CHK_AdditionalPropertyNotCovered=(String) row.get("CP_PerPropCov_CHK_AdditionalPropertyNotCovered");
		String strCP_PerPropCov_CHK_SameAsBuilding=(String) row.get("CP_PerPropCov_CHK_SameAsBuilding");
		String strCP_PerPropCov_CHK_ExcludeVandalism=(String) row.get("CP_PerPropCov_CHK_ExcludeVandalism");
		String strCP_PerPropCov_CHK_ExcludeSprinklerLeakage=(String) row.get("CP_PerPropCov_CHK_ExcludeSprinklerLeakage");
		String strCP_PerPropCov_CHK_ExcludeWindstormHail=(String) row.get("CP_PerPropCov_CHK_ExcludeWindstorm&Hail");
		String strCP_PerPropCov_CHK_ExcludeTheft=(String) row.get("CP_PerPropCov_CHK_ExcludeTheft");
		String strCP_PerPropCov_CHK_AgreedValue=(String) row.get("CP_PerPropCov_CHK_AgreedValue");
		String strCP_PerPropCov_TXT_AgreedValueExpirationDate=(String) row.get("CP_PerPropCov_TXT_AgreedValueExpirationDate");
		String strCP_PerPropCov_CHK_FuncPersonalPropVal=(String) row.get("CP_PerPropCov_CHK_FuncPersonalPropVal");
		String strCP_PerPropCov_TXT_DescOfPersonalProperty=(String) row.get("CP_PerPropCov_TXT_DescOfPersonalProperty");
		String strCP_PerPropCov_CHK_ActualCashValue=(String) row.get("CP_PerPropCov_CHK_ActualCashValue");
		String strCP_PerPropCov_CHK_ReplacementCost=(String) row.get("CP_PerPropCov_CHK_ReplacementCost");
		String strCP_PerPropCov_TXT_GroupIRate=(String) row.get("CP_PerPropCov_TXT_GroupIRate");
		String strCP_PerPropCov_TXT_GroupIIRate=(String) row.get("CP_PerPropCov_TXT_GroupIIRate");
		String strCP_PerPropCov_TXT_WindFactorApplied=(String) row.get("CP_PerPropCov_TXT_WindFactorApplied");
		String strCP_PerPropCov_TXT_InflationGuard=(String) row.get("CP_PerPropCov_TXT_InflationGuard%");
		String strCP_PerPropCov_CHK_GreenUpgrades=(String) row.get("CP_PerPropCov_CHK_GreenUpgrades");
		String strCP_PerPropCov_CHK_MoltenMaterial=(String) row.get("CP_PerPropCov_CHK_MoltenMaterial");
		String strCP_PerPropCov_CHK_SpoilageCoverage=(String) row.get("CP_PerPropCov_CHK_SpoilageCoverage");
		String strCP_PerPropCov_CHK_PeakSeason=(String) row.get("CP_PerPropCov_CHK_PeakSeason");
		String strCP_PerPropCov_TXT_PeakSeasonPeriodFrom=(String) row.get("CP_PerPropCov_TXT_PeakSeasonPeriodFrom");
		String strCP_PerPropCov_TXT_PeakSeasonPeriodTo=(String) row.get("CP_PerPropCov_TXT_PeakSeasonPeriodTo");
		String strCP_PerPropCov_TXT_Peak_LimitOfInsurance=(String) row.get("CP_PerPropCov_TXT_Peak_LimitOfInsurance");
		String strCP_PerPropCov_CHK_BrandsAndLabels=(String) row.get("CP_PerPropCov_CHK_BrandsAndLabels");
		String strCP_PerPropCov_CHK_BrokenorCrackedGlassExclusion=(String) row.get("CP_PerPropCov_CHK_BrokenorCrackedGlassExclusion");
		String strCP_PerPropCov_CHK_CondoUnitOwnersOptionalCov=(String) row.get("CP_PerPropCov_CHK_CondoUnitOwnersOptionalCov");
		String strCP_PerPropCov_CHK_EarthquakeSubLimitCauseofLoss=(String) row.get("CP_PerPropCov_CHK_EarthquakeSubLimitCauseofLoss");
		String strCP_PerPropCov_CHK_EarthquakeCauseOfLoss=(String) row.get("CP_PerPropCov_CHK_EarthquakeCauseOfLoss");
		String strCP_PerPropCov_TXT_EQSubLimit=(String) row.get("CP_PerPropCov_TXT_EQSubLimit");
		String strCP_PerPropCov_TXT_SubLimitPercentage=(String) row.get("CP_PerPropCov_TXT_SubLimitPercentage");
		String strCP_PerPropCov_TXT_SubLimitDeductible=(String) row.get("CP_PerPropCov_TXT_SubLimitDeductiblePercent");
		String strCP_PerPropCov_TXT_EarthquakeContentsRateGrade=(String) row.get("CP_PerPropCov_TXT_EarthquakeContentsRateGrade");
		String strCP_PerPropCov_TXT_EarthquakeContentsRateGradeOccupancy=(String) row.get("CP_PerPropCov_TXT_EarthquakeContentsRateGradeOccupancy");
		String strCP_PerPropCov_CHK_EarthquakeSprinklerLeakageOnly=(String) row.get("CP_PerPropCov_CHK_EarthquakeSprinklerLeakageOnly");
		String strCP_PerPropCov_TXT_EarthquakeSusceptibilityGrading=(String) row.get("CP_PerPropCov_TXT_EarthquakeSusceptibilityGrading");
		String strCP_PerPropCov_TXT_EQCoinsurance=(String) row.get("CP_PerPropCov_TXT_EQCoinsurance");
		String strCP_PerPropCov_CHK_ManufacturersConsequentialLossAssumptionBusinessPersonalProperty=(String) row.get("CP_PerPropCov_CHK_ManufacturersConsequentialLossAssumptionBusinessPersonalProperty");
		String strCP_PerPropCov_CHK_ManufacturersSellingPriceFinishedStockOnly=(String) row.get("CP_PerPropCov_CHK_ManufacturersSellingPrice(FinishedStockOnly)");
		String strCP_PerPropCov_CHK_MarketValueStock=(String) row.get("CP_PerPropCov_CHK_MarketValueStock");
		String strCP_PerPropCov_CHK_DistilledSpiritsandWinesMarketValue=(String) row.get("CP_PerPropCov_CHK_DistilledSpiritsandWinesMarketValue");
		String strCP_PerPropCov_CHK_MarketValueofDistilledSpirits=(String) row.get("CP_PerPropCov_CHK_MarketValueofDistilledSpirits");
		String strCP_PerPropCov_CHK_MarketValueofWines=(String) row.get("CP_PerPropCov_CHK_MarketValueofWines");
		String strCP_PerPropCov_CHK_ContentsinVaultsorSafes=(String) row.get("CP_PerPropCov_CHK_ContentsinVaultsorSafes");
		String strCP_PerPropCov_CHK_AlcoholicBeveragesTaxExclusion=(String) row.get("CP_PerPropCov_CHK_AlcoholicBeveragesTaxExclusion");
		String strCP_PerPropCov_CHK_StorageOrRepairsLimitedLiability=(String) row.get("CP_PerPropCov_CHK_StorageOrRepairsLimitedLiability");
		String strCP_PerPropCov_TXT_SpecialTheftLimit=(String) row.get("CP_PerPropCov_TXT_SpecialTheftLimit");
		String strCP_PerPropCov_CHK_IncludedInFloodCoverage=(String) row.get("CP_PerPropCov_CHK_IncludedInFloodCoverage");
		String strCP_PerPropCov_TXT_BlanketID=(String) row.get("CP_PerPropCov_TXT_BlanketID");
		String strCP_PerPropCov_TXT_FloodLimit=(String) row.get("CP_PerPropCov_TXT_FloodLimit");
		String strCP_PerPropCov_TXT_FloodPremium=(String) row.get("CP_PerPropCov_TXT_FloodPremium");
		String strCP_PerPropCov_TXT_HideRatingDetails=(String) row.get("CP_PerPropCov_TXT_HideRatingDetails");
		String strTransaction  = (String) row.get("Transaction Name");
		String strCP_PerPropCov_BTN_DoneWithBuildings    = (String) row.get("CP_PerPropCov_BTN_DoneWithBuildings");
		String strIDwithTxn = strRegressionID + "_" + transaction;
		
		
			try{
				se.log().logTestStep("CP_BusinessPersonalProperty"); 
				test.log(LogStatus.INFO, "CP_BusinessPersonalProperty page","Transaction Step : "+strTransaction + "<br>" +"Page : CP_BusinessPersonalProperty" + "<br>" +"Building Details : ");
				se.util().sleep(1000);
				se.verify().verifyEquals("BusinessPersonalPropertyPage of PowerWriter ", getCP_PerPropCov_LBL_VerifyPersonalPropertyCoverage().isDisplayed(),true, true,test);
				se.util().sleep(1000);
				if(strCP_PerPropCov_BTN_Add.equalsIgnoreCase("Yes")){
					se.element().clickElement(CP_PerPropCov_BTN_Add);
					}
				if(!strCP_PerPropCov_Edit.equalsIgnoreCase("N/A")){
					se.element().tryClick(getCP_PerPropCov_Edit(strCP_PerPropCov_Edit),test);
					}
				/*if(!strCP_PerPropCov_TXT_PersonalPropertyClassCode.equalsIgnoreCase("N/A") && !strCP_PerPropCov_TXT_PersonalPropertyClassCode.contains("validate2")){
					se.element().clickSearchIcon(getCP_PerPropCov_BTN_PersonalPropertyClassCode(), test);
					se.element().Click(getCP_PerPropCov_LNK_PersonalPropertyClassCode(strCP_PerPropCov_TXT_PersonalPropertyClassDescriptionPopup,strCP_PerPropCov_TXT_PersonalPropertyClassCode), test);
				}else{
					se.element().enterOrValidateText(getCP_PerPropCov_TXT_PersonalPropertyClassCode(strCP_PerPropCov_TXT_PersonalPropertyClassCode),strCP_PerPropCov_TXT_PersonalPropertyClassCode,test);
				}*/
				// sheetal added the below workaround on 11/10/22 as part of DF-10041 
				//sheetal added other regressions in the below if statement during 05/01/23 rate change updates
				if ((!strIDwithTxn.equalsIgnoreCase("BP_15_RedoQuoteForRenewal")) && (!strIDwithTxn.equalsIgnoreCase("BP_15_NewQuote")) &&(!strIDwithTxn.equalsIgnoreCase("BP_15_ProRataEndorsement1"))
						&& (!strIDwithTxn.equalsIgnoreCase("BP_14_NewQuote")) && (!strIDwithTxn.equalsIgnoreCase("BP_9_NewQuote"))&&
						(!strIDwithTxn.equalsIgnoreCase("BP_4_NewQuote")) && (!strIDwithTxn.equalsIgnoreCase("BP_2_NewQuote"))&& 
						(!strIDwithTxn.equalsIgnoreCase("CP_10_NewQuote"))&& (!strIDwithTxn.equalsIgnoreCase("CP_15_NewQuote"))&& 
						(!strIDwithTxn.equalsIgnoreCase("CP_15_ProRataEndorsement1"))&& (!strIDwithTxn.equalsIgnoreCase("CP_18_NewQuote"))&& 
						(!strIDwithTxn.equalsIgnoreCase("CP_21_NewQuote"))&& (!strIDwithTxn.equalsIgnoreCase("CP_22_NewQuote"))&& 
						(!strIDwithTxn.equalsIgnoreCase("CP_28_ProRataEndorsement1"))&&
						 (!strIDwithTxn.equalsIgnoreCase("TC_13_NewQuote"))
						&& (!strIDwithTxn.equalsIgnoreCase("TC_15_NewQuote")) && (!strIDwithTxn.equalsIgnoreCase("TC_16_NewQuote"))){	
				}
				else
				{
					se.element().selectClasscode(getCP_PerPropCov_TXT_PersonalPropertyClassCode(strCP_PerPropCov_TXT_PersonalPropertyClassDescriptionPopup), strCP_PerPropCov_TXT_PersonalPropertyClassCodeSearch, strCP_PerPropCov_TXT_PersonalPropertyClassDescriptionPopup, constants.NA, constants.NA, constants.NA, test);
						
				}
				
				
				
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_PersonalPropertyClassDescription(strCP_PerPropCov_TXT_PersonalPropertyClassDescription),strCP_PerPropCov_TXT_PersonalPropertyClassDescription,test);
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_PolicyType(strCP_PerPropCov_TXT_PolicyType),strCP_PerPropCov_TXT_PolicyType,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_PublicAndInsPropPlanApply(strCP_PerPropCov_CHK_PublicAndInsPropPlanApply),strCP_PerPropCov_CHK_PublicAndInsPropPlanApply,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_BlanketRating(strCP_PerPropCov_CHK_BlanketRating),strCP_PerPropCov_CHK_BlanketRating,test);
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_covblanketidno(strCP_PerPropCov_TXT_covblanketidno),strCP_PerPropCov_TXT_covblanketidno,test);
				/*if(!strCP_PerPropCov_TXT_losssettlemargin.equalsIgnoreCase("N/A") && !strCP_PerPropCov_TXT_losssettlemargin.contains("validate2")){
					se.element().clickSearchIcon(getCP_PerPropCov_BTN_losssettlemargin(), test);
					se.element().Click(getCP_PerPropCov_LNK_losssettlemargin(strCP_PerPropCov_TXT_losssettlemargin), test);
				}else{
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_losssettlemargin(strCP_PerPropCov_TXT_losssettlemargin),strCP_PerPropCov_TXT_losssettlemargin,test);
				}*/
				se.element().selectPopupWithMagnifier(getCP_PerPropCov_TXT_losssettlemargin(strCP_PerPropCov_TXT_losssettlemargin), getCP_PerPropCov_BTN_losssettlemargin(strCP_PerPropCov_TXT_losssettlemargin), strCP_PerPropCov_TXT_losssettlemargin, constants.NA, strCP_PerPropCov_TXT_losssettlemargin, constants.NA, constants.NA, constants.NA, test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_BusinessPersonalPropertyCoverage(strCP_PerPropCov_CHK_BusinessPersonalPropertyCoverage),strCP_PerPropCov_CHK_BusinessPersonalPropertyCoverage,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_PersonalPropertyOfOthersCoverage(strCP_PerPropCov_CHK_PersonalPropertyOfOthersCoverage),strCP_PerPropCov_CHK_PersonalPropertyOfOthersCoverage,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_LegalLiabilityCoverage(strCP_PerPropCov_CHK_LegalLiabilityCoverage),strCP_PerPropCov_CHK_LegalLiabilityCoverage,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_CondominiumCommercial(strCP_PerPropCov_CHK_CondominiumCommercial),strCP_PerPropCov_CHK_CondominiumCommercial,test);
				/*if(!strCP_PerPropCov_TXT_SeparationOfCoverage.equalsIgnoreCase("N/A") && !strCP_PerPropCov_TXT_SeparationOfCoverage.contains("validate2")){
					se.element().clickSearchIcon(getCP_PerPropCov_BTN_SeparationOfCoverage(), test);
					se.element().Click(getCP_PerPropCov_LNK_SeparationOfCoverage(strCP_PerPropCov_TXT_SeparationOfCoverage), test);
				}else{
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_SeparationOfCoverage(strCP_PerPropCov_TXT_SeparationOfCoverage),strCP_PerPropCov_TXT_SeparationOfCoverage,test);
				}*/
				se.element().selectPopupWithMagnifier(getCP_PerPropCov_TXT_SeparationOfCoverage(strCP_PerPropCov_TXT_SeparationOfCoverage), getCP_PerPropCov_BTN_SeparationOfCoverage(strCP_PerPropCov_TXT_SeparationOfCoverage), strCP_PerPropCov_TXT_SeparationOfCoverage, constants.NA, strCP_PerPropCov_TXT_SeparationOfCoverage, constants.NA, constants.NA, constants.NA, test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_IncludingStock(strCP_PerPropCov_CHK_IncludingStock),strCP_PerPropCov_CHK_IncludingStock,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_IncreaseCoverageForNonOwnedDetachedTrailers(strCP_PerPropCov_CHK_IncreaseCoverageForNonOwnedDetachedTrailers),strCP_PerPropCov_CHK_IncreaseCoverageForNonOwnedDetachedTrailers,test);
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_CoverageLimitinexcessof$5000(strCP_PerPropCov_TXT_CoverageLimitinexcessof$5000),strCP_PerPropCov_TXT_CoverageLimitinexcessof$5000,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_ValueReporting(strCP_PerPropCov_CHK_ValueReporting),strCP_PerPropCov_CHK_ValueReporting,test);
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_ReportingType(strCP_PerPropCov_TXT_ReportingType),strCP_PerPropCov_TXT_ReportingType,test);
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_ReportingPeriod(strCP_PerPropCov_TXT_ReportingPeriod),strCP_PerPropCov_TXT_ReportingPeriod,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_SeasonalRisk(strCP_PerPropCov_CHK_SeasonalRisk),strCP_PerPropCov_CHK_SeasonalRisk,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_AgriculturalProductsStorage(strCP_PerPropCov_CHK_AgriculturalProductsStorage),strCP_PerPropCov_CHK_AgriculturalProductsStorage,test);
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_NetAverageValue(strCP_PerPropCov_TXT_NetAverageValue),strCP_PerPropCov_TXT_NetAverageValue,test);
				
				if((!strCP_PerPropCov_TXT_AmountofInsurance.equalsIgnoreCase("N/A") && !strCP_PerPropCov_TXT_AmountofInsurance.contains("validate2"))){
					se.element().clearTheField(getCP_PerPropCov_TXT_AmountofInsurance(strCP_PerPropCov_TXT_AmountofInsurance));
				}
				
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_AmountofInsurance(strCP_PerPropCov_TXT_AmountofInsurance),strCP_PerPropCov_TXT_AmountofInsurance,test);
				/*if(!strCP_PerPropCov_TXT_CauseOfLoss.equalsIgnoreCase("N/A") && !strCP_PerPropCov_TXT_CauseOfLoss.contains("validate2")){
					se.element().clickSearchIcon(getCP_PerPropCov_BTN_CauseOfLoss(), test);
					se.element().Click(getCP_PerPropCov_LNK_CauseOfLoss(strCP_PerPropCov_TXT_CauseOfLoss), test);
				}else{
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_CauseOfLoss(strCP_PerPropCov_TXT_CauseOfLoss),strCP_PerPropCov_TXT_CauseOfLoss,test);
				}*/
				se.element().selectPopupWithMagnifier(getCP_PerPropCov_TXT_CauseOfLoss(strCP_PerPropCov_TXT_CauseOfLoss), getCP_PerPropCov_BTN_CauseOfLoss(strCP_PerPropCov_TXT_CauseOfLoss), strCP_PerPropCov_TXT_CauseOfLoss, constants.NA, strCP_PerPropCov_TXT_CauseOfLoss, constants.NA, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_Occupancy(strCP_PerPropCov_TXT_Occupancy),strCP_PerPropCov_TXT_Occupancy,test);
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_AdditionalInsuredorInterestLegLiab(strCP_PerPropCov_TXT_AdditionalInsuredorInterestLegLiab),strCP_PerPropCov_TXT_AdditionalInsuredorInterestLegLiab,test);
				/*if(!strCP_PerPropCov_TXT_Coinsurance.equalsIgnoreCase("N/A") && !strCP_PerPropCov_TXT_Coinsurance.contains("validate2")){
					se.element().clickSearchIcon(getCP_PerPropCov_BTN_Coinsurance(), test);
					se.element().Click(getCP_PerPropCov_LNK_Coinsurance(strCP_PerPropCov_TXT_Coinsurance), test);
				}else{
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_Coinsurance(strCP_PerPropCov_TXT_Coinsurance),strCP_PerPropCov_TXT_Coinsurance,test);
				}*/
				se.element().selectPopupWithMagnifier(getCP_PerPropCov_TXT_Coinsurance(strCP_PerPropCov_TXT_Coinsurance), getCP_PerPropCov_BTN_Coinsurance(strCP_PerPropCov_TXT_Coinsurance), strCP_PerPropCov_TXT_Coinsurance, constants.NA, strCP_PerPropCov_TXT_Coinsurance, constants.NA, constants.NA, constants.NA, test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_LeasedProperty(strCP_PerPropCov_CHK_LeasedProperty),strCP_PerPropCov_CHK_LeasedProperty,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_AdditionalCoveredProperty(strCP_PerPropCov_CHK_AdditionalCoveredProperty),strCP_PerPropCov_CHK_AdditionalCoveredProperty,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_AdditionalPropertyNotCovered(strCP_PerPropCov_CHK_AdditionalPropertyNotCovered),strCP_PerPropCov_CHK_AdditionalPropertyNotCovered,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_SameAsBuilding(strCP_PerPropCov_CHK_SameAsBuilding),strCP_PerPropCov_CHK_SameAsBuilding,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_ExcludeVandalism(strCP_PerPropCov_CHK_ExcludeVandalism),strCP_PerPropCov_CHK_ExcludeVandalism,test);
 				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_ExcludeSprinklerLeakage(strCP_PerPropCov_CHK_ExcludeSprinklerLeakage),strCP_PerPropCov_CHK_ExcludeSprinklerLeakage,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_ExcludeWindstormHail(strCP_PerPropCov_CHK_ExcludeWindstormHail),strCP_PerPropCov_CHK_ExcludeWindstormHail,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_ExcludeTheft(strCP_PerPropCov_CHK_ExcludeTheft),strCP_PerPropCov_CHK_ExcludeTheft,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_AgreedValue(strCP_PerPropCov_CHK_AgreedValue),strCP_PerPropCov_CHK_AgreedValue,test);
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_AgreedValueExpirationDate(strCP_PerPropCov_TXT_AgreedValueExpirationDate),strCP_PerPropCov_TXT_AgreedValueExpirationDate,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_FuncPersonalPropVal(strCP_PerPropCov_CHK_FuncPersonalPropVal),strCP_PerPropCov_CHK_FuncPersonalPropVal,test);
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_DescOfPersonalProperty(strCP_PerPropCov_TXT_DescOfPersonalProperty),strCP_PerPropCov_TXT_DescOfPersonalProperty,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_ActualCashValue(strCP_PerPropCov_CHK_ActualCashValue),strCP_PerPropCov_CHK_ActualCashValue,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_ReplacementCost(strCP_PerPropCov_CHK_ReplacementCost),strCP_PerPropCov_CHK_ReplacementCost,test);
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_GroupIRate(strCP_PerPropCov_TXT_GroupIRate),strCP_PerPropCov_TXT_GroupIRate,test);
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_GroupIIRate(strCP_PerPropCov_TXT_GroupIIRate),strCP_PerPropCov_TXT_GroupIIRate,test);
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_WindFactorApplied(strCP_PerPropCov_TXT_WindFactorApplied),strCP_PerPropCov_TXT_WindFactorApplied,test);
				/*if(!strCP_PerPropCov_TXT_InflationGuard.equalsIgnoreCase("N/A") && !strCP_PerPropCov_TXT_InflationGuard.contains("validate2")){
					se.element().clickSearchIcon(getCP_PerPropCov_BTN_InflationGuard(), test);
					se.element().Click(getCP_PerPropCov_LNK_InflationGuard(strCP_PerPropCov_TXT_InflationGuard), test);
				}else{
					se.element().enterOrValidateText(getCP_PerPropCov_TXT_InflationGuard(strCP_PerPropCov_TXT_InflationGuard),strCP_PerPropCov_TXT_InflationGuard,test);
				}*/
				se.element().selectPopupWithMagnifier(getCP_PerPropCov_TXT_InflationGuard(strCP_PerPropCov_TXT_InflationGuard), getCP_PerPropCov_BTN_InflationGuard(strCP_PerPropCov_TXT_InflationGuard), strCP_PerPropCov_TXT_InflationGuard, "Yes", strCP_PerPropCov_TXT_InflationGuard, constants.NA, constants.NA, constants.NA, test);
				se.util().sleep(3000);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_GreenUpgrades(strCP_PerPropCov_CHK_GreenUpgrades),strCP_PerPropCov_CHK_GreenUpgrades,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_MoltenMaterial(strCP_PerPropCov_CHK_MoltenMaterial), strCP_PerPropCov_CHK_MoltenMaterial, test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_SpoilageCoverage(strCP_PerPropCov_CHK_SpoilageCoverage),strCP_PerPropCov_CHK_SpoilageCoverage,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_PeakSeason(strCP_PerPropCov_CHK_PeakSeason),strCP_PerPropCov_CHK_PeakSeason,test);
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_PeakSeasonPeriodFrom(strCP_PerPropCov_TXT_PeakSeasonPeriodFrom),strCP_PerPropCov_TXT_PeakSeasonPeriodFrom,test);
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_PeakSeasonPeriodTo(strCP_PerPropCov_TXT_PeakSeasonPeriodTo),strCP_PerPropCov_TXT_PeakSeasonPeriodTo,test);
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_Peak_LimitOfInsurance(strCP_PerPropCov_TXT_Peak_LimitOfInsurance),strCP_PerPropCov_TXT_Peak_LimitOfInsurance,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_BrandsAndLabels(strCP_PerPropCov_CHK_BrandsAndLabels),strCP_PerPropCov_CHK_BrandsAndLabels,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_BrokenorCrackedGlassExclusion(strCP_PerPropCov_CHK_BrokenorCrackedGlassExclusion),strCP_PerPropCov_CHK_BrokenorCrackedGlassExclusion,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_CondoUnitOwnersOptionalCov(strCP_PerPropCov_CHK_CondoUnitOwnersOptionalCov),strCP_PerPropCov_CHK_CondoUnitOwnersOptionalCov,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_EarthquakeSubLimitCauseofLoss(strCP_PerPropCov_CHK_EarthquakeSubLimitCauseofLoss),strCP_PerPropCov_CHK_EarthquakeSubLimitCauseofLoss,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_EarthquakeCauseOfLoss(strCP_PerPropCov_CHK_EarthquakeCauseOfLoss),strCP_PerPropCov_CHK_EarthquakeCauseOfLoss,test);
				
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_EQSubLimit(strCP_PerPropCov_TXT_EQSubLimit),strCP_PerPropCov_TXT_EQSubLimit,test);
				/*if(!strCP_PerPropCov_TXT_SubLimitPercentage.equalsIgnoreCase("N/A") && !strCP_PerPropCov_TXT_SubLimitPercentage.contains("validate2")){
					se.element().clickSearchIcon(getCP_PerPropCov_BTN_SubLimitPercentage(), test);
					se.element().Click(getCP_PerPropCov_LNK_SubLimitPercentage(strCP_PerPropCov_TXT_SubLimitPercentage), test);
				}else{
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_SubLimitPercentage(strCP_PerPropCov_TXT_SubLimitPercentage),strCP_PerPropCov_TXT_SubLimitPercentage,test);
				}*/
				se.element().selectPopupWithMagnifier(getCP_PerPropCov_TXT_SubLimitPercentage(strCP_PerPropCov_TXT_SubLimitPercentage), getCP_PerPropCov_BTN_SubLimitPercentage(strCP_PerPropCov_TXT_SubLimitPercentage), strCP_PerPropCov_TXT_SubLimitPercentage, constants.NA, strCP_PerPropCov_TXT_SubLimitPercentage, constants.NA, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_SubLimitDeductible(strCP_PerPropCov_TXT_SubLimitDeductible),strCP_PerPropCov_TXT_SubLimitDeductible,test);
				if(!strCP_PerPropCov_TXT_EarthquakeContentsRateGrade.equalsIgnoreCase("N/A") && !strCP_PerPropCov_TXT_EarthquakeContentsRateGrade.contains("validate2")){
					se.element().clickSearchIcon(getCP_PerPropCov_BTN_EarthquakeContentsRateGrade(strCP_PerPropCov_TXT_EarthquakeContentsRateGrade), test);
					se.element().enterOrValidateText(getCP_PerPropCov_TXT_EarthquakeContentsRateGradeSearchFilter(),strCP_PerPropCov_TXT_EarthquakeContentsRateGrade,test);
					if(!strCP_PerPropCov_TXT_EarthquakeContentsRateGradeOccupancy.equalsIgnoreCase("N/A")) {
						se.element().enterOrValidateText(getCP_PerPropCov_TXT_EarthquakeContentsRateGradeOccupancySearchFilter(),strCP_PerPropCov_TXT_EarthquakeContentsRateGradeOccupancy,test);
					}
					se.element().Click(getSearch(),test);
					se.element().Click(getCP_PerPropCov_LNK_EarthquakeContentsRateGrade(strCP_PerPropCov_TXT_EarthquakeContentsRateGrade,strCP_PerPropCov_TXT_EarthquakeContentsRateGradeOccupancy), test);
				}else{
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_EarthquakeContentsRateGrade(strCP_PerPropCov_TXT_EarthquakeContentsRateGrade),strCP_PerPropCov_TXT_EarthquakeContentsRateGrade,test);
				}
				//se.element().selectPopupWithMagnifier(getCP_PerPropCov_TXT_EarthquakeContentsRateGrade(strCP_PerPropCov_TXT_EarthquakeContentsRateGrade), getCP_PerPropCov_BTN_EarthquakeContentsRateGrade(strCP_PerPropCov_TXT_EarthquakeContentsRateGrade), strCP_PerPropCov_TXT_EarthquakeContentsRateGrade, "Yes", strCP_PerPropCov_TXT_EarthquakeContentsRateGrade, strCP_PerPropCov_TXT_EarthquakeContentsRateGradeOccupancy, constants.NA, constants.NA, test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_EarthquakeSprinklerLeakageOnly(strCP_PerPropCov_CHK_EarthquakeSprinklerLeakageOnly),strCP_PerPropCov_CHK_EarthquakeSprinklerLeakageOnly,test);
				/*if(!strCP_PerPropCov_TXT_EarthquakeSusceptibilityGrading.equalsIgnoreCase("N/A") && !strCP_PerPropCov_TXT_EarthquakeSusceptibilityGrading.contains("validate2")){
					se.element().clickSearchIcon(getCP_PerPropCov_BTN_EarthquakeSusceptibilityGrading(), test);
					se.element().Click(getCP_PerPropCov_LNK_EarthquakeSusceptibilityGrading(strCP_PerPropCov_TXT_EarthquakeSusceptibilityGrading), test);
				}else{
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_EarthquakeSusceptibilityGrading(strCP_PerPropCov_TXT_EarthquakeSusceptibilityGrading),strCP_PerPropCov_TXT_EarthquakeSusceptibilityGrading,test);
				}*/
				se.element().selectPopupWithMagnifier(getCP_PerPropCov_TXT_EarthquakeSusceptibilityGrading(strCP_PerPropCov_TXT_EarthquakeSusceptibilityGrading), getCP_PerPropCov_BTN_EarthquakeSusceptibilityGrading(strCP_PerPropCov_TXT_EarthquakeSusceptibilityGrading), strCP_PerPropCov_TXT_EarthquakeSusceptibilityGrading, constants.NA, strCP_PerPropCov_TXT_EarthquakeSusceptibilityGrading, constants.NA, constants.NA, constants.NA, test);
				/*if(!strCP_PerPropCov_TXT_EQCoinsurance.equalsIgnoreCase("N/A") && !strCP_PerPropCov_TXT_EQCoinsurance.contains("validate2")){
					se.element().clickSearchIcon(getCP_PerPropCov_BTN_EQCoinsurance(), test);
					se.element().Click(getCP_PerPropCov_LNK_EQCoinsurance(strCP_PerPropCov_TXT_EQCoinsurance), test);
				}else{
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_EQCoinsurance(strCP_PerPropCov_TXT_EQCoinsurance),strCP_PerPropCov_TXT_EQCoinsurance,test);
				}*/
				se.element().selectPopupWithMagnifier(getCP_PerPropCov_TXT_EQCoinsurance(strCP_PerPropCov_TXT_EQCoinsurance), getCP_PerPropCov_BTN_EQCoinsurance(strCP_PerPropCov_TXT_EQCoinsurance), strCP_PerPropCov_TXT_EQCoinsurance, constants.NA, strCP_PerPropCov_TXT_EQCoinsurance, constants.NA, constants.NA, constants.NA, test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_ManufacturersConsequentialLossAssumptionBusinessPersonalProperty(strCP_PerPropCov_CHK_ManufacturersConsequentialLossAssumptionBusinessPersonalProperty),strCP_PerPropCov_CHK_ManufacturersConsequentialLossAssumptionBusinessPersonalProperty,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_ManufacturersSellingPriceFinishedStockOnly(strCP_PerPropCov_CHK_ManufacturersSellingPriceFinishedStockOnly),strCP_PerPropCov_CHK_ManufacturersSellingPriceFinishedStockOnly,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_MarketValueStock(strCP_PerPropCov_CHK_MarketValueStock),strCP_PerPropCov_CHK_MarketValueStock,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_DistilledSpiritsandWinesMarketValue(strCP_PerPropCov_CHK_DistilledSpiritsandWinesMarketValue),strCP_PerPropCov_CHK_DistilledSpiritsandWinesMarketValue,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_MarketValueofDistilledSpirits(strCP_PerPropCov_CHK_MarketValueofDistilledSpirits),strCP_PerPropCov_CHK_MarketValueofDistilledSpirits,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_MarketValueofWines(strCP_PerPropCov_CHK_MarketValueofWines),strCP_PerPropCov_CHK_MarketValueofWines,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_ContentsinVaultsorSafes(strCP_PerPropCov_CHK_ContentsinVaultsorSafes),strCP_PerPropCov_CHK_ContentsinVaultsorSafes,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_AlcoholicBeveragesTaxExclusion(strCP_PerPropCov_CHK_AlcoholicBeveragesTaxExclusion),strCP_PerPropCov_CHK_AlcoholicBeveragesTaxExclusion,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_StorageOrRepairsLimitedLiability(strCP_PerPropCov_CHK_StorageOrRepairsLimitedLiability),strCP_PerPropCov_CHK_StorageOrRepairsLimitedLiability,test);
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_SpecialTheftLimit(strCP_PerPropCov_TXT_SpecialTheftLimit),strCP_PerPropCov_TXT_SpecialTheftLimit,test);
				se.element().checkUncheckOrValidate(getCP_PerPropCov_CHK_IncludedInFloodCoverage(strCP_PerPropCov_CHK_IncludedInFloodCoverage),strCP_PerPropCov_CHK_IncludedInFloodCoverage,test);
				se.element().selectPopupWithMagnifier(getCP_PerPropCov_TXT_BlanketID(strCP_PerPropCov_TXT_BlanketID), getCP_PerPropCov_TXT_BlanketIDSearch(strCP_PerPropCov_TXT_BlanketID), strCP_PerPropCov_TXT_BlanketID, constants.NA, strCP_PerPropCov_TXT_BlanketID, constants.NA, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_FloodLimit(strCP_PerPropCov_TXT_FloodLimit),strCP_PerPropCov_TXT_FloodLimit,test);
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_FloodPremium(strCP_PerPropCov_TXT_FloodPremium),strCP_PerPropCov_TXT_FloodPremium,test);
				se.element().enterOrValidateText(getCP_PerPropCov_TXT_HideRatingDetails(strCP_PerPropCov_TXT_HideRatingDetails),strCP_PerPropCov_TXT_HideRatingDetails,test);
				se.element().Click(getNext(),test);
				
				if(strCP_PerPropCov_Done.equalsIgnoreCase("Yes")){
				se.element().Click(getNext(),test); 
				}
				
				if(strCP_PerPropCov_BTN_DoneWithBuildings.equalsIgnoreCase("Yes")){
				se.element().Click(getDone(),test); 
				}
			
			
			}catch(Exception e){
				se.verify().verifyEquals("Failed to fill in details for CP_BusinessPersonalPropertyPage", true, false, true, test);
				
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
	
	
	public void CP_ExtraExpenseCoveragePage(String strRegressionID, String transaction, String buildingName, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CP_ExtraExpense")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		
		List<Map<String, String>> table = ExcelOperations.getBuildingPagesData("CP_ExtraExpense", strRegressionID, buildingName,transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCP_ExtraExp_TXT_ClassCode=(String) row.get("CP_ExtraExp_TXT_ClassCode");
		String strCP_ExtraExp_TXT_ClassDescription=(String) row.get("CP_ExtraExp_TXT_ClassDescription");
		String strCP_ExtraExp_TXT_PolicyType=(String) row.get("CP_ExtraExp_TXT_PolicyType");
		String strCP_ExtraExp_TXT_CoverageType=(String) row.get("CP_ExtraExp_TXT_CoverageType");
		String strCP_ExtraExp_TXT_AmountOfInsurance=(String) row.get("CP_ExtraExp_TXT_AmountOfInsurance");
		String strCP_ExtraExp_TXT_LossPaymentType=(String) row.get("CP_ExtraExp_TXT_LossPaymentType");
		String strCP_ExtraExp_TXT_LimitOnLossPaymentPercent=(String) row.get("CP_ExtraExp_TXT_LimitOnLossPaymentPercent");
		String strCP_ExtraExp_TXT_CauseOfLoss=(String) row.get("CP_ExtraExp_TXT_CauseOfLoss");
		String strCP_ExtraExp_CHK_SameAsBuilding=(String) row.get("CP_ExtraExp_CHK_SameAsBuilding");
		String strCP_ExtraExp_CHK_ExcludeVandalism=(String) row.get("CP_ExtraExp_CHK_ExcludeVandalism");
		String strCP_ExtraExp_CHK_ExcludeSprinklerLeakage=(String) row.get("CP_ExtraExp_CHK_ExcludeSprinklerLeakage");
		String strCP_ExtraExp_CHK_ExcludeWindstormAndHail=(String) row.get("CP_ExtraExp_CHK_ExcludeWindstormAndHail");
		String strCP_ExtraExp_CHK_ExcludeTheft=(String) row.get("CP_ExtraExp_CHK_ExcludeTheft");
		String strCP_ExtraExp_CHK_MoltenMaterial=(String) row.get("CP_ExtraExp_CHK_MoltenMaterial");
		String strCP_ExtraExp_TXT_GroupIRate=(String) row.get("CP_ExtraExp_TXT_GroupIRate");
		String strCP_ExtraExp_TXT_GroupIIRate=(String) row.get("CP_ExtraExp_TXT_GroupIIRate");
		String strCP_ExtraExp_CHK_CivilAuthorityChangesIncCovPeriod=(String) row.get("CP_ExtraExp_CHK_CivilAuthorityChangesIncCovPeriod");
		String strCP_ExtraExp_TXT_IncreasedCoveragePeriod=(String) row.get("CP_ExtraExp_TXT_IncreasedCoveragePeriod");
		String strCP_ExtraExp_TXT_CoveragePeriodNoOfDays=(String) row.get("CP_ExtraExp_TXT_CoveragePeriod(NoOfDays)");
		String strCP_ExtraExp_TXT_RadiusNoOfMiles=(String) row.get("CP_ExtraExp_TXT_Radius(NoOfMiles)");
		String strCP_ExtraExp_CHK_FungusIncreasedCoverage=(String) row.get("CP_ExtraExp_CHK_FungusIncreasedCoverage");
		String strCP_ExtraExp_TXT_FungusIncreasedNoOfDays=(String) row.get("CP_ExtraExp_TXT_FungusIncreasedNoOfDays");
		String strCP_ExtraExp_CHK_ExtraExpenseFromDependentProperties=(String) row.get("CP_ExtraExp_CHK_ExtraExpenseFromDependentProperties");
		String strCP_ExtraExp_CHK_RadioOrTelevisionAntennasBroadcast=(String) row.get("CP_ExtraExp_CHK_RadioOrTelevisionAntennasBroadcast");
		String strCP_ExtraExp_CHK_RadioOrTelevisionAntennasReceiving=(String) row.get("CP_ExtraExp_CHK_RadioOrTelevisionAntennasReceiving");
		String strCP_ExtraExp_CHK_WatercraftExclusionBuyback=(String) row.get("CP_ExtraExp_CHK_WatercraftExclusionBuyback");
		String strCP_ExtraExp_TXT_WatercraftExclusionBuybackOption=(String) row.get("CP_ExtraExp_TXT_WatercraftExclusionBuybackOption");
		String strCP_ExtraExp_TXT_WatercraftExclusionLimitOfInsurance=(String) row.get("CP_ExtraExp_TXT_WatercraftExclusionLimitOfInsurance");
		String strCP_ExtraExp_CHK_WaterfrontPropertyDamage=(String) row.get("CP_ExtraExp_CHK_WaterfrontPropertyDamage");
		String strCP_ExtraExp_CHK_EarthquakeSublimitCauseOfLoss=(String) row.get("CP_ExtraExp_CHK_EarthquakeSublimitCauseOfLoss");
		String strCP_ExtraExp_TXT_EQSubLimit=(String) row.get("CP_ExtraExp_TXT_EQSubLimit");
		String strCP_ExtraExp_CHK_HideRatingDetails=(String) row.get("CP_ExtraExp_CHK_HideRatingDetails");
		String strTransaction  = (String) row.get("Transaction Name");
		String strCP_ExtraExp_BTN_Done  = (String) row.get("CP_ExtraExp_BTN_DoneWithBuildings");
			try{
				 
				se.log().logTestStep("CP_ExtraExpenseCoveragePage");
				test.log(LogStatus.INFO, "ExtraExpenseCoverage page","Transaction Step : " + strTransaction + "<br>" +"Page : CP_ExtraExpenseCoveragePage");
				se.util().sleep(1000);
				se.verify().verifyEquals("ExtraExpenseCoverage Page of PowerWriter ", getCP_ExtraExp_LBL_ExtraExpenseCoverage().isDisplayed(),true, true,test);
				se.element().enterOrValidateText(getCP_ExtraExp_TXT_ClassCode(strCP_ExtraExp_TXT_ClassCode),strCP_ExtraExp_TXT_ClassCode,test);
				se.element().enterOrValidateText(getCP_ExtraExp_TXT_ClassDescription(strCP_ExtraExp_TXT_ClassDescription),strCP_ExtraExp_TXT_ClassDescription,test);
				se.element().enterOrValidateText(getCP_ExtraExp_TXT_PolicyType(strCP_ExtraExp_TXT_PolicyType),strCP_ExtraExp_TXT_PolicyType,test);
				se.element().enterOrValidateText(getCP_ExtraExp_TXT_CoverageType(strCP_ExtraExp_TXT_CoverageType),strCP_ExtraExp_TXT_CoverageType,test);
				se.element().enterOrValidateText(getCP_ExtraExp_TXT_AmountOfInsurance(strCP_ExtraExp_TXT_AmountOfInsurance),strCP_ExtraExp_TXT_AmountOfInsurance,test);
				/*if(!strCP_ExtraExp_TXT_LossPaymentType.equalsIgnoreCase("N/A") && !strCP_ExtraExp_TXT_LossPaymentType.contains("validate2")){
					se.element().clickSearchIcon(getCP_ExtraExp_BTN_LossPaymentType(), test);
					se.element().Click(getCP_ExtraExp_LNK_LossPaymentType(strCP_ExtraExp_TXT_LossPaymentType), test);
				}else{
				se.element().enterOrValidateText(getCP_ExtraExp_TXT_LossPaymentType(strCP_ExtraExp_TXT_LossPaymentType),strCP_ExtraExp_TXT_LossPaymentType,test);
				}*/
				se.element().selectPopupWithMagnifier(getCP_ExtraExp_TXT_LossPaymentType(strCP_ExtraExp_TXT_LossPaymentType), getCP_ExtraExp_BTN_LossPaymentType(strCP_ExtraExp_TXT_LossPaymentType), strCP_ExtraExp_TXT_LossPaymentType, constants.NA, strCP_ExtraExp_TXT_LossPaymentType, constants.NA, constants.NA, constants.NA, test);
				/*if(!strCP_ExtraExp_TXT_LimitOnLossPaymentPercent.equalsIgnoreCase("N/A") && !strCP_ExtraExp_TXT_LimitOnLossPaymentPercent.contains("validate2")){
					se.element().clickSearchIcon(getCP_ExtraExp_BTN_LimitOnLossPaymentPercent(), test);
					se.element().Click(getCP_ExtraExp_LNK_LimitOnLossPaymentPercent(strCP_ExtraExp_TXT_LimitOnLossPaymentPercent), test);
				}else{
				se.element().enterOrValidateText(getCP_ExtraExp_TXT_LimitOnLossPaymentPercent(strCP_ExtraExp_TXT_LimitOnLossPaymentPercent),strCP_ExtraExp_TXT_LimitOnLossPaymentPercent,test);
				}*/
				se.element().selectPopupWithMagnifier(getCP_ExtraExp_TXT_LimitOnLossPaymentPercent(strCP_ExtraExp_TXT_LimitOnLossPaymentPercent), getCP_ExtraExp_BTN_LimitOnLossPaymentPercent(strCP_ExtraExp_TXT_LimitOnLossPaymentPercent), strCP_ExtraExp_TXT_LimitOnLossPaymentPercent, constants.NA, strCP_ExtraExp_TXT_LimitOnLossPaymentPercent, constants.NA, constants.NA, constants.NA, test);
				/*if(!strCP_ExtraExp_TXT_CauseOfLoss.equalsIgnoreCase("N/A") && !strCP_ExtraExp_TXT_CauseOfLoss.contains("validate2")){
					se.element().clickSearchIcon(getCP_ExtraExp_BTN_CauseOfLoss(), test);
					se.element().Click(getCP_ExtraExp_LNK_CauseOfLoss(strCP_ExtraExp_TXT_CauseOfLoss), test);
				}else{
				se.element().enterOrValidateText(getCP_ExtraExp_TXT_CauseOfLoss(strCP_ExtraExp_TXT_CauseOfLoss),strCP_ExtraExp_TXT_CauseOfLoss,test);
				}*/
				se.element().selectPopupWithMagnifier(getCP_ExtraExp_TXT_CauseOfLoss(strCP_ExtraExp_TXT_CauseOfLoss), getCP_ExtraExp_BTN_CauseOfLoss(strCP_ExtraExp_TXT_CauseOfLoss), strCP_ExtraExp_TXT_CauseOfLoss, constants.NA, strCP_ExtraExp_TXT_CauseOfLoss, constants.NA, constants.NA, constants.NA, test);
				se.element().checkUncheckOrValidate(getCP_ExtraExp_CHK_SameAsBuilding(strCP_ExtraExp_CHK_SameAsBuilding),strCP_ExtraExp_CHK_SameAsBuilding,test);
				se.element().checkUncheckOrValidate(getCP_ExtraExp_CHK_ExcludeVandalism(strCP_ExtraExp_CHK_ExcludeVandalism),strCP_ExtraExp_CHK_ExcludeVandalism,test);
				se.element().checkUncheckOrValidate(getCP_ExtraExp_CHK_ExcludeSprinklerLeakage(strCP_ExtraExp_CHK_ExcludeSprinklerLeakage),strCP_ExtraExp_CHK_ExcludeSprinklerLeakage,test);
				se.element().checkUncheckOrValidate(getCP_ExtraExp_CHK_ExcludeWindstormAndHail(strCP_ExtraExp_CHK_ExcludeWindstormAndHail),strCP_ExtraExp_CHK_ExcludeWindstormAndHail,test);
				se.element().checkUncheckOrValidate(getCP_ExtraExp_CHK_ExcludeTheft(strCP_ExtraExp_CHK_ExcludeTheft),strCP_ExtraExp_CHK_ExcludeTheft,test);
				se.element().checkUncheckOrValidate(getCP_BldgCov_CHK_MoltenMaterial(strCP_ExtraExp_CHK_MoltenMaterial), strCP_ExtraExp_CHK_MoltenMaterial, test);
				se.element().enterOrValidateText(getCP_ExtraExp_TXT_GroupIRate(strCP_ExtraExp_TXT_GroupIRate),strCP_ExtraExp_TXT_GroupIRate,test);
				se.element().enterOrValidateText(getCP_ExtraExp_TXT_GroupIIRate(strCP_ExtraExp_TXT_GroupIIRate),strCP_ExtraExp_TXT_GroupIIRate,test);
				se.element().checkUncheckOrValidate(getCP_ExtraExp_CHK_CivilAuthorityChangesIncCovPeriod(strCP_ExtraExp_CHK_CivilAuthorityChangesIncCovPeriod),strCP_ExtraExp_CHK_CivilAuthorityChangesIncCovPeriod,test);
				//se.element().enterOrValidateText(getCP_ExtraExp_TXT_IncreasedCoveragePeriod(strCP_ExtraExp_TXT_IncreasedCoveragePeriod),strCP_ExtraExp_TXT_IncreasedCoveragePeriod,test);
				se.element().selectPopupWithMagnifier(getCP_ExtraExp_TXT_IncreasedCoveragePeriod(strCP_ExtraExp_TXT_IncreasedCoveragePeriod), getCP_ExtraExp_TXT_IncreasedCoveragePeriodSearch(strCP_ExtraExp_TXT_IncreasedCoveragePeriod), strCP_ExtraExp_TXT_IncreasedCoveragePeriod, constants.NA, strCP_ExtraExp_TXT_IncreasedCoveragePeriod, constants.NA	, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getCP_ExtraExp_TXT_CoveragePeriodNoOfDays(strCP_ExtraExp_TXT_CoveragePeriodNoOfDays),strCP_ExtraExp_TXT_CoveragePeriodNoOfDays,test);
				//se.element().enterOrValidateText(getCP_ExtraExp_TXT_RadiusNoOfMiles(strCP_ExtraExp_TXT_RadiusNoOfMiles),strCP_ExtraExp_TXT_RadiusNoOfMiles,test);
				se.element().selectPopupWithMagnifier(getCP_ExtraExp_TXT_RadiusNoOfMiles(strCP_ExtraExp_TXT_RadiusNoOfMiles), getCP_ExtraExp_TXT_RadiusNoOfMilesSearch(strCP_ExtraExp_TXT_RadiusNoOfMiles), strCP_ExtraExp_TXT_RadiusNoOfMiles, constants.NA, strCP_ExtraExp_TXT_RadiusNoOfMiles, constants.NA, constants.NA, constants.NA, test);
				se.element().checkUncheckOrValidate(getCP_ExtraExp_CHK_FungusIncreasedCoverage(strCP_ExtraExp_CHK_FungusIncreasedCoverage),strCP_ExtraExp_CHK_FungusIncreasedCoverage,test);
				se.element().enterOrValidateText(getCP_ExtraExp_TXT_FungusIncreasedNoOfDays(strCP_ExtraExp_TXT_FungusIncreasedNoOfDays),strCP_ExtraExp_TXT_FungusIncreasedNoOfDays,test);
				se.element().checkUncheckOrValidate(getCP_ExtraExp_CHK_ExtraExpenseFromDependentProperties(strCP_ExtraExp_CHK_ExtraExpenseFromDependentProperties),strCP_ExtraExp_CHK_ExtraExpenseFromDependentProperties,test);
				se.element().checkUncheckOrValidate(getCP_ExtraExp_CHK_RadioOrTelevisionAntennasBroadcast(strCP_ExtraExp_CHK_RadioOrTelevisionAntennasBroadcast),strCP_ExtraExp_CHK_RadioOrTelevisionAntennasBroadcast,test);
				se.element().checkUncheckOrValidate(getCP_ExtraExp_CHK_RadioOrTelevisionAntennasReceiving(strCP_ExtraExp_CHK_RadioOrTelevisionAntennasReceiving),strCP_ExtraExp_CHK_RadioOrTelevisionAntennasReceiving,test);
				se.element().checkUncheckOrValidate(getCP_ExtraExp_CHK_WatercraftExclusionBuyback(strCP_ExtraExp_CHK_WatercraftExclusionBuyback),strCP_ExtraExp_CHK_WatercraftExclusionBuyback,test);
				se.element().enterOrValidateText(getCP_ExtraExp_TXT_WatercraftExclusionBuybackOption(strCP_ExtraExp_TXT_WatercraftExclusionBuybackOption),strCP_ExtraExp_TXT_WatercraftExclusionBuybackOption,test);
				se.element().enterOrValidateText(getCP_ExtraExp_TXT_WatercraftExclusionLimitOfInsurance(strCP_ExtraExp_TXT_WatercraftExclusionLimitOfInsurance),strCP_ExtraExp_TXT_WatercraftExclusionLimitOfInsurance,test);
				se.element().checkUncheckOrValidate(getCP_ExtraExp_CHK_WaterfrontPropertyDamage(strCP_ExtraExp_CHK_WaterfrontPropertyDamage),strCP_ExtraExp_CHK_WaterfrontPropertyDamage,test);
				se.element().checkUncheckOrValidate(getCP_ExtraExp_CHK_EarthquakeSublimitCauseOfLoss(strCP_ExtraExp_CHK_EarthquakeSublimitCauseOfLoss),strCP_ExtraExp_CHK_EarthquakeSublimitCauseOfLoss,test);
				se.element().enterOrValidateText(getCP_ExtraExp_TXT_EQSubLimit(strCP_ExtraExp_TXT_EQSubLimit),strCP_ExtraExp_TXT_EQSubLimit,test);
				se.element().checkUncheckOrValidate(getCP_ExtraExp_CHK_HideRatingDetails(strCP_ExtraExp_CHK_HideRatingDetails),strCP_ExtraExp_CHK_HideRatingDetails,test);
				se.element().Click(getNext(),test);
				
				
				if(strCP_ExtraExp_BTN_Done.equalsIgnoreCase("Yes")){
					se.element().Click(getNext(),test);
				}
				
			}catch(Exception e){
				se.verify().verifyEquals("Failed to fill in details for CP_ExtraExpenseCoveragePage", true, false, true, test);
				
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
	

public void CP_UtilityServiceCoveragePage(String strRegressionID, String transaction, String buildingName, ExtentTest test) throws IOException {
	
	try{
		
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CP_UtilityServiceCoverage")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		
		List<Map<String, String>> table = ExcelOperations.getBuildingPagesData("CP_UtilityServiceCoverage", strRegressionID, buildingName,transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		
		String strCP_UtilitySerCov_BTN_Add=(String) row.get("CP_UtilitySerCov_BTN_Add");
		String strCP_UtilitySerCov_Edit=(String) row.get("CP_UtilitySerCov_Edit");
		String strCP_UtilitySerCov_Done=(String) row.get("CP_UtilitySerCov_Done");
		String strCP_UtilitySerCov_TXT_ClassCode=(String) row.get("CP_UtilitySerCov_TXT_ClassCode");
		String strCP_UtilitySerCov_TXT_ClassDescription=(String) row.get("CP_UtilitySerCov_TXT_ClassDescription");
		String strCP_UtilitySerCov_TXT_PolicyType=(String) row.get("CP_UtilitySerCov_TXT_PolicyType");
		String strCP_UtilitySerCov_TXT_CoverageType=(String) row.get("CP_UtilitySerCov_TXT_CoverageType");
		String strCP_UtilitySerCov_TXT_Coverage=(String) row.get("CP_UtilitySerCov_TXT_Coverage");
		String strCP_UtilitySerCov_TXT_AmountOfInsurance=(String) row.get("CP_UtilitySerCov_TXT_AmountOfInsurance");
		String strCP_UtilitySerCov_TXT_CauseOfLoss=(String) row.get("CP_UtilitySerCov_TXT_CauseOfLoss");
		String strCP_UtilitySerCov_CHK_EarthquakeCoverage=(String) row.get("CP_UtilitySerCov_CHK_EarthquakeCoverage");
		String strCP_UtilitySerCov_TXT_UtilityType=(String) row.get("CP_UtilitySerCov_TXT_UtilityType");
		String strCP_UtilitySerCov_TXT_CoveredProperty=(String) row.get("CP_UtilitySerCov_TXT_CoveredProperty");
		String strCP_UtilitySerCov_CHK_PowerSupply=(String) row.get("CP_UtilitySerCov_CHK_PowerSupply");
		String strCP_UtilitySerCov_CHK_WaterSupply=(String) row.get("CP_UtilitySerCov_CHK_WaterSupply");
		String strCP_UtilitySerCov_CHK_CommunicationSupply=(String) row.get("CP_UtilitySerCov_CHK_CommunicationSupply");
		String strCP_UtilitySerCov_CHK_OverheadTransmissionLines=(String) row.get("CP_UtilitySerCov_CHK_OverheadTransmissionLines");
		String strCP_UtilitySerCov_CHK_OverheadCommunicationLines=(String) row.get("CP_UtilitySerCov_CHK_OverheadCommunicationLines");
		String strTransaction  = (String) row.get("Transaction Name");
		String strCP_UtilitySerCov_BTN_DoneWithBuilding  = (String) row.get("CP_UtilitySerCov_BTN_DoneWithBuilding");
		String strCP_UtilitySerCov_BTN_Remove=(String) row.get("CP_UtilitySerCov_BTN_Remove");
		String strCP_UtilitySerCov_CHK_UtilityNumber=(String) row.get("CP_UtilitySerCov_CHK_UtilityNumber");
		
		try{
				se.log().logTestStep("CP_UtilityServiceCoverage");
				test.log(LogStatus.INFO, "CP_UtilityServiceCoverage Page","Transaction Step : "+ strTransaction + "<br>" +"Page : CP_UtilityServiceCoverage"  + "<br>" +"Building Details : ");
				se.verify().verifyEquals("UtilityServiceCoverage Page of PowerWriter ", getCP_UtilitySerCov_LBL_VerifyUtilityServiceCoverage().isDisplayed(),true, true,test);
				se.util().sleep(1000);
				if(strCP_UtilitySerCov_BTN_Add.equalsIgnoreCase("Yes")){
				se.element().clickElement(CP_UtilitySerCov_BTN_Add);
				}
				if(strCP_UtilitySerCov_Edit.equalsIgnoreCase("Yes")){
	 				se.element().tryClick(getCP_UtilitySerCov_Edit(strCP_UtilitySerCov_Edit),test);
	 			}
				
				if(strCP_UtilitySerCov_BTN_Remove.equalsIgnoreCase("Yes")){
					se.element().checkUncheckOrValidate(getCP_UtilitySerCov_selectUtility(strCP_UtilitySerCov_CHK_UtilityNumber),"Check",test);
					se.element().Click(getCP_UtilitySerCov_removeUtility(), test);
					
				}
				
				se.element().enterOrValidateText(getCP_UtilitySerCov_TXT_ClassCode(strCP_UtilitySerCov_TXT_ClassCode),strCP_UtilitySerCov_TXT_ClassCode,test);
				se.element().enterOrValidateText(getCP_UtilitySerCov_TXT_ClassDescription(strCP_UtilitySerCov_TXT_ClassDescription),strCP_UtilitySerCov_TXT_ClassDescription,test);
				se.element().enterOrValidateText(getCP_UtilitySerCov_TXT_PolicyType(strCP_UtilitySerCov_TXT_PolicyType),strCP_UtilitySerCov_TXT_PolicyType,test);
				/*if(!strCP_UtilitySerCov_TXT_CoverageType.equalsIgnoreCase("N/A") && !strCP_UtilitySerCov_TXT_CoverageType.contains("validate2")){
					se.element().clickSearchIcon(getCP_UtilitySerCov_BTN_CoverageType(), test);
					se.element().clickElement(getCP_UtilitySerCov_LNK_CoverageType(strCP_UtilitySerCov_TXT_CoverageType), test);
					
		        }else{
				se.element().enterOrValidateText(getCP_UtilitySerCov_TXT_CoverageType(strCP_UtilitySerCov_TXT_CoverageType),strCP_UtilitySerCov_TXT_CoverageType,test);
				}*/
				se.element().selectPopupWithMagnifier(getCP_UtilitySerCov_TXT_CoverageType(strCP_UtilitySerCov_TXT_CoverageType), getCP_UtilitySerCov_BTN_CoverageType(strCP_UtilitySerCov_TXT_CoverageType), strCP_UtilitySerCov_TXT_CoverageType, constants.NA, strCP_UtilitySerCov_TXT_CoverageType, constants.NA, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getCP_UtilitySerCov_TXT_Coverage(strCP_UtilitySerCov_TXT_Coverage),strCP_UtilitySerCov_TXT_Coverage,test);
				se.element().enterOrValidateText(getCP_UtilitySerCov_TXT_AmountOfInsurance(strCP_UtilitySerCov_TXT_AmountOfInsurance),strCP_UtilitySerCov_TXT_AmountOfInsurance,test);
				
				/*if(!strCP_UtilitySerCov_TXT_CauseOfLoss.equalsIgnoreCase("N/A") && !strCP_UtilitySerCov_TXT_CauseOfLoss.contains("validate2")){
					se.element().clickSearchIcon(getCP_UtilitySerCov_BTN_CauseOfLoss(), test);
					se.element().clickElement(getCP_UtilitySerCov_LNK_CauseOfLoss(strCP_UtilitySerCov_TXT_CauseOfLoss), test);
					
		        }else{
				se.element().enterOrValidateText(getCP_UtilitySerCov_TXT_CauseOfLoss(strCP_UtilitySerCov_TXT_CauseOfLoss),strCP_UtilitySerCov_TXT_CauseOfLoss,test);
				}*/
				se.element().selectPopupWithMagnifier(getCP_UtilitySerCov_TXT_CauseOfLoss(strCP_UtilitySerCov_TXT_CauseOfLoss), getCP_UtilitySerCov_BTN_CauseOfLoss(strCP_UtilitySerCov_TXT_CauseOfLoss), strCP_UtilitySerCov_TXT_CauseOfLoss, constants.NA, strCP_UtilitySerCov_TXT_CauseOfLoss, constants.NA, constants.NA, constants.NA, test);
				se.element().checkUncheckOrValidate(getCP_UtilitySerCov_CHK_EarthquakeCoverage(strCP_UtilitySerCov_CHK_EarthquakeCoverage), strCP_UtilitySerCov_CHK_EarthquakeCoverage, test);
				/*if(!strCP_UtilitySerCov_TXT_UtilityType.equalsIgnoreCase("N/A") && !strCP_UtilitySerCov_TXT_UtilityType.contains("validate2")){
					se.element().clickSearchIcon(getCP_UtilitySerCov_BTN_UtilityType(), test);
					se.element().Click(getCP_UtilitySerCov_LNK_UtilityType(strCP_UtilitySerCov_TXT_UtilityType), test);
				}else{
				se.element().enterOrValidateText(getCP_UtilitySerCov_TXT_UtilityType(strCP_UtilitySerCov_TXT_UtilityType),strCP_UtilitySerCov_TXT_UtilityType,test);
				}*/
				se.element().selectPopupWithMagnifier(getCP_UtilitySerCov_TXT_UtilityType(strCP_UtilitySerCov_TXT_UtilityType), getCP_UtilitySerCov_BTN_UtilityType(strCP_UtilitySerCov_TXT_UtilityType), strCP_UtilitySerCov_TXT_UtilityType, constants.NA, strCP_UtilitySerCov_TXT_UtilityType, constants.NA, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getCP_UtilitySerCov_TXT_CoveredProperty(strCP_UtilitySerCov_TXT_CoveredProperty),strCP_UtilitySerCov_TXT_CoveredProperty,test);
				se.element().checkUncheckOrValidate(getCP_UtilitySerCov_CHK_PowerSupply(strCP_UtilitySerCov_CHK_PowerSupply),strCP_UtilitySerCov_CHK_PowerSupply,test);
				se.element().checkUncheckOrValidate(getCP_UtilitySerCov_CHK_WaterSupply(strCP_UtilitySerCov_CHK_WaterSupply),strCP_UtilitySerCov_CHK_WaterSupply,test);
				se.element().checkUncheckOrValidate(getCP_UtilitySerCov_CHK_CommunicationSupply(strCP_UtilitySerCov_CHK_CommunicationSupply),strCP_UtilitySerCov_CHK_CommunicationSupply,test);
				se.element().checkUncheckOrValidate(getCP_UtilitySerCov_CHK_OverheadTransmissionLines(strCP_UtilitySerCov_CHK_OverheadTransmissionLines),strCP_UtilitySerCov_CHK_OverheadTransmissionLines,test);
				se.element().checkUncheckOrValidate(getCP_UtilitySerCov_CHK_OverheadCommunicationLines(strCP_UtilitySerCov_CHK_OverheadCommunicationLines),strCP_UtilitySerCov_CHK_OverheadCommunicationLines,test);
				se.element().Click(getNext(),test);
				
			se.util().sleep(2000);
			if(strCP_UtilitySerCov_Done.equalsIgnoreCase("Yes")){
 				se.element().Click(getNext(), test);
 				
 			}
			
			if(strCP_UtilitySerCov_BTN_DoneWithBuilding.equalsIgnoreCase("Yes")){
 				se.element().Click(getNext(), test);
 				
 			}
		
	}
			catch(Exception e){
				se.verify().verifyEquals("Failed to fill in details for CP_UtilityServiceCoveragePage", true, false, true, test);
				
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
		
public void CP_VacancyPermitCoveragePage(String strRegressionID, String transaction, String buildingName, ExtentTest test) throws IOException {
	try{
	String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
    if(SuspendSheet.equalsIgnoreCase("CP_VacancyPermitCoverage")){
    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
         testTearDown(se, test);
    }
	
	List<Map<String, String>> table = ExcelOperations.getBuildingPagesData("CP_VacancyPermitCoverage", strRegressionID, buildingName,transaction);
	int iteration = 0;
	while (iteration < table.size()) {
		LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
	String strCP_VacPermCov_BTN_Add=(String) row.get("CP_VacPermCov_BTN_Add");
	String strCP_VacPermCov_Edit=(String) row.get("CP_VacPermCov_Edit");
	String strCP_VacPermCov_Done=(String) row.get("CP_VacPermCov_Done");
	String strCP_VacPermCov_CHK_Building=(String) row.get("CP_VacPermCov_CHK_Building");
	String strCP_VacPermCov_CHK_PersonalProperty=(String) row.get("CP_VacPermCov_CHK_PersonalProperty");
	String strCP_VacPermCov_TXT_ClassCode=(String) row.get("CP_VacPermCov_TXT_ClassCode");
	String strCP_VacPermCov_TXT_ClassDescription=(String) row.get("CP_VacPermCov_TXT_ClassDescription");
	String strCP_VacPermCov_TXT_PolicyType=(String) row.get("CP_VacPermCov_TXT_PolicyType");
	String strCP_VacPermCov_TXT_AmountOfInsurance=(String) row.get("CP_VacPermCov_TXT_AmountOfInsurance");
	String strCP_VacPermCov_TXT_VacancyPermitPeriodFrom=(String) row.get("CP_VacPermCov_TXT_VacancyPermitPeriodFrom");
	String strCP_VacPermCov_TXT_VacancyPermitPeriodTo=(String) row.get("CP_VacPermCov_TXT_VacancyPermitPeriodTo");
	String strCP_VacPermCov_TXT_Coinsurance=(String) row.get("CP_VacPermCov_TXT_Coinsurance");
	String strCP_VacPermCov_TXT_CauseOfLoss=(String) row.get("CP_VacPermCov_TXT_CauseOfLoss");
	String strTransaction  = (String) row.get("Transaction Name");
	String strCP_VacPermCov_BTN_DoneWithBuilding  = (String) row.get("CP_VacPermCov_BTN_DoneWithBuilding");
	
	try{
			se.log().logTestStep("CP_VacancyPermitCoveragePage");
			test.log(LogStatus.INFO, "CP_VacancyPermitCoverage Page","Transaction Step : "+ strTransaction + "<br>" +"Page : CP_VacancyPermitCoverage"  + "<br>" +"Building Details : ");
			se.verify().verifyEquals("VacancyPermitCoveragePage of PowerWriter ", getCP_VacPermCov_LBL_VacancyPermitCoverage().isDisplayed(),true, true,test);
			se.util().sleep(1000);
			if(strCP_VacPermCov_BTN_Add.equalsIgnoreCase("Yes")){
 				se.element().clickElement(getCP_VacPermCov_BTN_Add());
 			}
 			if(strCP_VacPermCov_Edit.equalsIgnoreCase("Yes")){
 				se.element().tryClick(getCP_VacPermCov_BTN_Edit(strCP_VacPermCov_Edit),test);
 			}
 			
 			se.element().checkUncheckOrValidate(getCP_VacPermCov_CHK_Building(strCP_VacPermCov_CHK_Building),strCP_VacPermCov_CHK_Building,test);
 			se.element().checkUncheckOrValidate(getCP_VacPermCov_CHK_PersonalProperty(strCP_VacPermCov_CHK_PersonalProperty),strCP_VacPermCov_CHK_PersonalProperty,test);
 			se.element().enterOrValidateText(getCP_VacPermCov_TXT_ClassCode(strCP_VacPermCov_TXT_ClassCode),strCP_VacPermCov_TXT_ClassCode,test);
 			se.element().enterOrValidateText(getCP_VacPermCov_TXT_ClassDescription(strCP_VacPermCov_TXT_ClassDescription),strCP_VacPermCov_TXT_ClassDescription,test);
 			se.element().enterOrValidateText(getCP_VacPermCov_TXT_PolicyType(strCP_VacPermCov_TXT_PolicyType),strCP_VacPermCov_TXT_PolicyType,test);
 			se.element().enterOrValidateText(getCP_VacPermCov_TXT_AmountOfInsurance(strCP_VacPermCov_TXT_AmountOfInsurance),strCP_VacPermCov_TXT_AmountOfInsurance,test);
 			se.element().enterOrValidateText(getCP_VacPermCov_TXT_VacancyPermitPeriodFrom(strCP_VacPermCov_TXT_VacancyPermitPeriodFrom),strCP_VacPermCov_TXT_VacancyPermitPeriodFrom,test);
 			se.element().enterOrValidateText(getCP_VacPermCov_TXT_VacancyPermitPeriodTo(strCP_VacPermCov_TXT_VacancyPermitPeriodTo),strCP_VacPermCov_TXT_VacancyPermitPeriodTo,test);
 			se.element().enterOrValidateText(getCP_VacPermCov_TXT_Coinsurance(strCP_VacPermCov_TXT_Coinsurance),strCP_VacPermCov_TXT_Coinsurance,test);
 			se.element().enterOrValidateText(getCP_VacPermCov_TXT_CauseOfLoss(strCP_VacPermCov_TXT_CauseOfLoss),strCP_VacPermCov_TXT_CauseOfLoss,test);

			
			se.element().Click(getNext(),test);
			if(strCP_VacPermCov_Done.equalsIgnoreCase("Yes")){
 				se.element().Click(getNext(), test);
			}
			if(strCP_VacPermCov_BTN_DoneWithBuilding.equalsIgnoreCase("Yes")){
 				se.element().Click(getNext(), test);
			}
 			

	}catch(Exception e){
		se.verify().verifyEquals("Failed to fill in details for CP_VacancyPermitCoveragePage", true, false, true, test);
		
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
		
	public void CP_LandlordAsAdditionalInsuredPage(String strRegressionID, String transaction, String buildingName, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CP_LandlordAsAdditionalInsured")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		
		List<Map<String, String>> table = ExcelOperations.getBuildingPagesData("CP_LandlordAsAdditionalInsured", strRegressionID, buildingName,transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCP_LandlordAsAddInsured_Edit=(String) row.get("CP_LandlordAsAddInsured_Edit");
		String strCP_LandlordAsAddInsured_Done=(String) row.get("CP_LandlordAsAddInsured_Done");
		String strCP_LandlordAsAddInsured_TXT_FormNumber = (String) row.get("CP_LandlordAsAddInsured_TXT_FormNumber");
		String strCP_LandlordAsAddInsured_TXT_FormName = (String) row.get("CP_LandlordAsAddInsured_TXT_FormName");
		String strCP_LandlordAsAddInsured_TXT_CauseOfLossForm = (String) row.get("CP_LandlordAsAddInsured_TXT_CauseOfLossForm");
		String strCP_LandlordAsAddInsured_TXT_BUsIncomeCovForm = (String) row.get("CP_LandlordAsAddInsured_TXT_BUsIncomeCovForm");
		String strCP_LandlordAsAddInsured_TXT_LimitOfInsurance = (String) row.get("CP_LandlordAsAddInsured_TXT_LimitOfInsurance");
		String strCP_LandlordAsAddInsured_TXT_Coinsurance = (String) row.get("CP_LandlordAsAddInsured_TXT_Coinsurance");
		String strCP_LandlordAsAddInsured_TXT_EndorsementSuppOrRestCovCauseOfLoss = (String) row.get("CP_LandlordAsAddInsured_TXT_EndorsementSuppOrRestCovCauseOfLoss");
		String strTransaction = (String) row.get("Transaction Name");
		String strCP_LandlordAsAddInsured_BTN_DoneWithBuilding  = (String) row.get("CP_LandlordAsAddInsured_BTN_DoneWithBuilding");
		
				try{
				se.log().logTestStep("CP_LandlordAsAdditionalInsuredPage");
				test.log(LogStatus.INFO, "CP_LandlordAsAdditionalInsured page","Transaction Step : "+ strTransaction + "<br>" +"Page : CP_LandlordAsAdditionalInsured" + "<br>" +"Section: CP_MortgageholdersEOCoveragePage");
				se.util().sleep(1000);
				se.verify().verifyEquals("CP_LandlordAsAdditionalInsuredPage of PowerWriter ", getCP_VerifyLandlordAsAddInsText().isDisplayed(),true, true,test);
				if(strCP_LandlordAsAddInsured_Edit.equalsIgnoreCase("Yes")){
					se.element().tryClick(getCP_BTN_EditLAIDetails(strCP_LandlordAsAddInsured_Edit),test);
				}
				se.verify().verifyEquals("CP_LandlordAsAdditionalInsuredPage of PowerWriter ", getCP_VerifyClassicalInfoText().isDisplayed(),true, true,test);
				se.element().enterOrValidateText(getCP_LandlordAsAddInsured_TXT_FormNumber(strCP_LandlordAsAddInsured_TXT_FormNumber),strCP_LandlordAsAddInsured_TXT_FormNumber,test);
				se.element().enterOrValidateText(getCP_LandlordAsAddInsured_TXT_FormName(strCP_LandlordAsAddInsured_TXT_FormName),strCP_LandlordAsAddInsured_TXT_FormName,test);
				se.element().enterOrValidateText(getCP_LandlordAsAddInsured_TXT_CauseOfLossForm(strCP_LandlordAsAddInsured_TXT_CauseOfLossForm),strCP_LandlordAsAddInsured_TXT_CauseOfLossForm,test);
				se.element().enterOrValidateText(getCP_LandlordAsAddInsured_TXT_BUsIncomeCovForm(strCP_LandlordAsAddInsured_TXT_BUsIncomeCovForm),strCP_LandlordAsAddInsured_TXT_BUsIncomeCovForm,test);
				se.element().enterOrValidateText(getCP_LandlordAsAddInsured_TXT_LimitOfInsurance(strCP_LandlordAsAddInsured_TXT_LimitOfInsurance),strCP_LandlordAsAddInsured_TXT_LimitOfInsurance,test);
				se.element().enterOrValidateText(getCP_LandlordAsAddInsured_TXT_Coinsurance(strCP_LandlordAsAddInsured_TXT_Coinsurance),strCP_LandlordAsAddInsured_TXT_Coinsurance,test);
				se.element().enterOrValidateText(getCP_LandlordAsAddInsured_TXT_EndorsementSuppOrRestCovCauseOfLoss(strCP_LandlordAsAddInsured_TXT_EndorsementSuppOrRestCovCauseOfLoss),strCP_LandlordAsAddInsured_TXT_EndorsementSuppOrRestCovCauseOfLoss,test);
				se.element().Click(getNext(),test);
				se.util().sleep(1000);
				if(strCP_LandlordAsAddInsured_Done.equalsIgnoreCase("Yes")){
					se.element().Click(getNext(),test);
					}
				if(strCP_LandlordAsAddInsured_BTN_DoneWithBuilding.equalsIgnoreCase("Yes")){
					se.element().Click(getNext(),test);
					}
			
				}catch(Exception e){
				se.verify().verifyEquals("Failed to fill in details for CP_LandlordAsAdditionalInsuredPage", true, false, true, test);
				
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
	public void CP_MortgageholdersEOCoveragePage(String strRegressionID, String transaction, String buildingName, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CP_MortgageholdersEOCoverage")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		
		List<Map<String, String>> table = ExcelOperations.getBuildingPagesData("CP_MortgageholdersEOCoverage", strRegressionID, buildingName,transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCP_mortgcov_BTN_Add=(String) row.get("CP_mortgcov_BTN_Add");
		String strCP_mortgcov_Edit=(String) row.get("CP_mortgcov_Edit");
		String strCP_mortgcov_Done=(String) row.get("CP_mortgcov_Done");
		String strCP_mortgcov_TXT_ClassCode = (String) row.get("CP_mortgcov_TXT_ClassCode");
		String strCP_mortgcov_TXT_ClassDescription = (String) row.get("CP_mortgcov_TXT_ClassDescription");
		String strCP_mortgcov_TXT_PolicyType = (String) row.get("CP_mortgcov_TXT_PolicyType");
		String strCP_mortgcov_TXT_CoverageType = (String) row.get("CP_mortgcov_TXT_CoverageType");
		String strCP_mortgcov_TXT_NumOfMortgages = (String) row.get("CP_mortgcov_TXT_NumOfMortgages");
		String strCP_mortgcov_TXT_LimitPerMortgage = (String) row.get("CP_mortgcov_TXT_LimitPerMortgage");
		String strTransaction = (String) row.get("Transaction Name");
		String strCP_mortgcov_BTN_DoneWithBuilding  = (String) row.get("CP_mortgcov_BTN_DoneWithBuilding");
		
			try{
				se.log().logTestStep("CP_MortgageholdersEOCoveragePage");
				test.log(LogStatus.INFO, "CP_MortgageholdersEOCoveragePage","Transaction Step : "+ strTransaction + "<br>" +"Page : CP_MortgageholdersEOCoveragePage"  + "<br>" +"Section: CP_MortgageholdersEOCoveragePage");
				se.util().sleep(1000);
				se.verify().verifyEquals("CP_MortgageholdersEOCoverage of PowerWriter ", getCP_VerifyMortgageCovText().isDisplayed(),true, true,test);
				if(strCP_mortgcov_BTN_Add.equalsIgnoreCase("Yes")){
					se.element().clickElement(AddbuttonMortgageCov);
				}
				if(strCP_mortgcov_Edit.equalsIgnoreCase("Yes")){
					se.element().tryClick(getEditbuttonMortgageCov(strCP_mortgcov_Edit),test);
				}	
				se.verify().verifyEquals("CP_MortgageholdersEOCoverage of PowerWriter ", getCP_VerifyMortgageEandOCovCIText().isDisplayed(),true, true,test);
				se.element().enterOrValidateText(getCP_mortgcov_TXT_ClassCode(strCP_mortgcov_TXT_ClassCode),strCP_mortgcov_TXT_ClassCode,test);
				se.element().enterOrValidateText(getCP_mortgcov_TXT_ClassDescription(strCP_mortgcov_TXT_ClassDescription),strCP_mortgcov_TXT_ClassDescription,test);
				se.element().enterOrValidateText(getCP_mortgcov_TXT_PolicyType(strCP_mortgcov_TXT_PolicyType),strCP_mortgcov_TXT_PolicyType,test);
				se.element().enterOrValidateText(getCP_mortgcov_TXT_CoverageType(strCP_mortgcov_TXT_CoverageType),strCP_mortgcov_TXT_CoverageType,test);
				se.element().enterOrValidateText(getCP_mortgcov_TXT_NumOfMortgages(strCP_mortgcov_TXT_NumOfMortgages),strCP_mortgcov_TXT_NumOfMortgages,test);
				se.element().enterOrValidateText(getCP_mortgcov_TXT_LimitPerMortgage(strCP_mortgcov_TXT_LimitPerMortgage),strCP_mortgcov_TXT_LimitPerMortgage,test);
				se.element().Click(getNext(),test);
				se.util().sleep(1000);
				if(strCP_mortgcov_Done.equalsIgnoreCase("Yes")){
					se.element().Click(getNext(),test);
					}
				if(strCP_mortgcov_BTN_DoneWithBuilding.equalsIgnoreCase("Yes")){
					se.element().Click(getNext(),test);
					}
				
			}catch(Exception e){
				se.verify().verifyEquals("Failed to fill in details for CP_MortgageholdersEOCoverage", true, false, true, test);
				
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
	public void CP_GreenUpgradesCoveragePage(String strRegressionID, String transaction, String buildingName,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CP_GreenUpgrades")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getBuildingPagesData("CP_GreenUpgrades", strRegressionID, buildingName,transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		/*String strCP_GreenUpg_BTN_Add=(String) row.get("CP_GreenUpg_BTN_Add");*/
		String strCP_GreenUpg_Edit=(String) row.get("CP_GreenUpg_Edit");
		String strCP_GreenUpg_Done=(String) row.get("CP_GreenUpg_Done");
		String strCP_GreenUpg_Next=(String) row.get("CP_GreenUpg_Next");
		String strCP_GreenUpg_TXT_FormNumber=(String) row.get("CP_GreenUpg_TXT_FormNumber");
		String strCP_GreenUpg_TXT_FormName=(String) row.get("CP_GreenUpg_TXT_FormName");
		String strCP_GreenUpg_TXT_IncreasedCostOfLoss=(String) row.get("CP_GreenUpg_TXT_IncreasedCostOfLoss");
		String strCP_GreenUpg_TXT_GreenUpgradesDollarLimit=(String) row.get("CP_GreenUpg_TXT_GreenUpgradesDollarLimit");
		String strCP_GreenUpg_TXT_GreenUpgradesMaximumAmount=(String) row.get("CP_GreenUpg_TXT_GreenUpgradesMaximumAmount");
		String strCP_GreenUpg_TXT_RelatedExpensesLimit=(String) row.get("CP_GreenUpg_TXT_RelatedExpensesLimit");
		String strCP_GreenUpg_CHK_HideRatingDetails=(String) row.get("CP_GreenUpg_CHK_HideRatingDetails");
		String strCP_GreenUpg_TXT_PeriodOfRestoration=(String) row.get("CP_GreenUpg_TXT_PeriodOfRestoration");
		
		String strTransaction  = (String) row.get("Transaction Name");
		
		
			try{
				se.log().logTestStep("CP_GreenUpgradesCoveragePage");
				test.log(LogStatus.INFO, "GreenUpgradesCoverage page","Transaction Step : " + strTransaction + "<br>" +"Page : CP_GreenUpgradesCoverage");
				se.verify().verifyEquals("GreenUpgradesCoverage Page of PowerWriter ",getCP_GreenUpg_LBL_VerifyGreenUpgradesCoverage().isDisplayed(),true, true,test);
				
				/*if(strCP_GreenUpg_BTN_Add.equalsIgnoreCase("Yes")){ 
					se.element().clickElement(CP_GreenUpg_BTN_Add);
				}*/
				if(!strCP_GreenUpg_Edit.equalsIgnoreCase("N/A")){
					se.element().tryClick(getCP_GreenUpg_Edit(strCP_GreenUpg_Edit),test);
				}
				se.element().enterOrValidateText(getCP_GreenUpg_TXT_FormNumber(strCP_GreenUpg_TXT_FormNumber),strCP_GreenUpg_TXT_FormNumber,test);
				se.element().enterOrValidateText(getCP_GreenUpg_TXT_FormName(strCP_GreenUpg_TXT_FormName),strCP_GreenUpg_TXT_FormName,test);
				/*if(!strCP_GreenUpg_TXT_IncreasedCostOfLoss.equalsIgnoreCase("N/A") && !strCP_GreenUpg_TXT_IncreasedCostOfLoss.contains("validate2")){
					se.element().clickSearchIcon(getCP_GreenUpg_BTN_IncreasedCostOfLoss(), test);
					se.element().Click(getCP_GreenUpg_LNK_IncreasedCostOfLoss(strCP_GreenUpg_TXT_IncreasedCostOfLoss), test); 
				}else{
				se.element().enterOrValidateText(getCP_GreenUpg_TXT_IncreasedCostOfLoss(strCP_GreenUpg_TXT_IncreasedCostOfLoss),strCP_GreenUpg_TXT_IncreasedCostOfLoss,test);
				}*/
				se.element().selectPopupWithMagnifier(getCP_GreenUpg_TXT_IncreasedCostOfLoss(strCP_GreenUpg_TXT_IncreasedCostOfLoss), getCP_GreenUpg_BTN_IncreasedCostOfLoss(strCP_GreenUpg_TXT_IncreasedCostOfLoss), strCP_GreenUpg_TXT_IncreasedCostOfLoss, constants.NA, strCP_GreenUpg_TXT_IncreasedCostOfLoss, constants.NA, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getCP_GreenUpg_TXT_GreenUpgradesDollarLimit(strCP_GreenUpg_TXT_GreenUpgradesDollarLimit),strCP_GreenUpg_TXT_GreenUpgradesDollarLimit,test);
				se.element().enterOrValidateText(getCP_GreenUpg_TXT_GreenUpgradesMaximumAmount(strCP_GreenUpg_TXT_GreenUpgradesMaximumAmount),strCP_GreenUpg_TXT_GreenUpgradesMaximumAmount,test);
				se.element().enterOrValidateText(getCP_GreenUpg_TXT_RelatedExpensesLimit(strCP_GreenUpg_TXT_RelatedExpensesLimit),strCP_GreenUpg_TXT_RelatedExpensesLimit,test);
				
				if(!strCP_GreenUpg_TXT_PeriodOfRestoration.equalsIgnoreCase("N/A") && !strCP_GreenUpg_TXT_PeriodOfRestoration.contains("validate2")){
					se.element().clearTheField(getCP_GreenUpg_TXT_PeriodOfRestoration(strCP_GreenUpg_TXT_PeriodOfRestoration));
				}
				
				se.element().enterOrValidateText(getCP_GreenUpg_TXT_PeriodOfRestoration(strCP_GreenUpg_TXT_PeriodOfRestoration),strCP_GreenUpg_TXT_PeriodOfRestoration,test);
				
				
				se.element().checkUncheckOrValidate(getCP_GreenUpg_CHK_HideRatingDetails(strCP_GreenUpg_CHK_HideRatingDetails),strCP_GreenUpg_CHK_HideRatingDetails,test);
				
				if(strCP_GreenUpg_Next.equalsIgnoreCase("Yes")){
					se.element().Click(getNext(),test);
					}
				if(strCP_GreenUpg_Done.equalsIgnoreCase("Yes")){
				se.element().Click(getDone(),test);
				}
	
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CP_GreenUpgradesPage", true, false, true, test);
			
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
	
	public void CP_PeakSeasonCoveragePage(String strRegressionID, String transaction, String buildingName,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CP_PeakSeasonCvg")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getBuildingPagesData("CP_PeakSeasonCvg", strRegressionID, buildingName,transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCP_PeakSeasonCvg_BTN_DoneWithBuilding=(String) row.get("CP_PeakSeasonCvg_BTN_DoneWithBuilding");
		String strCP_PeakSeasonCvg_Edit=(String) row.get("CP_PeakSeasonCvg_Edit");
		String strCP_PeakSeasonCvg_Done=(String) row.get("CP_PeakSeasonCvg_Done");
		String strCP_PeakSeasonCvg_TXT_ClassCode=(String) row.get("CP_PeakSeasonCvg_TXT_ClassCode");
		String strCP_PeakSeasonCvg_TXT_Coverage=(String) row.get("CP_PeakSeasonCvg_TXT_Coverage");
		String strCP_PeakSeasonCvg_TXT_PeakSeasonPeriodFrom=(String) row.get("CP_PeakSeasonCvg_TXT_PeakSeasonPeriodFrom");
		String strCP_PeakSeasonCvg_TXT_PeakSeasonPeriodTo=(String) row.get("CP_PeakSeasonCvg_TXT_PeakSeasonPeriodTo");
		String strCP_PeakSeasonCvg_TXT_PeakSeasonAdditionlaLimitOfInsurance=(String) row.get("CP_PeakSeasonCvg_TXT_PeakSeasonAdditionlaLimitOfInsurance");
		String strTransaction  = (String) row.get("Transaction");
		
		
			try{
				se.log().logTestStep("CP_PeakSeasonCoveragePage");
				test.log(LogStatus.INFO, "CP_PeakSeasonCoverage Page","Transaction Step : "+ strTransaction + "<br>" +"Page : CP_PeakSeasonCoveragePage"  + "<br>" +"Building Details : "+strCP_PeakSeasonCvg_TXT_ClassCode);
				
				se.verify().verifyEquals("CP_PeakSeasonCoverage Page of PowerWriter ",getCP_PeakSeasonCvg_LBL_VerifyPeakSeasonCoverage().isDisplayed(),true, true,test);
				if(!strCP_PeakSeasonCvg_Edit.equalsIgnoreCase(constants.NA)){
					se.element().tryClick(getCP_PeakSeasonCvg_Edit(strCP_PeakSeasonCvg_Edit),test);
				}
				se.element().enterOrValidateText(getCP_PeakSeasonCvg_TXT_ClassCode(strCP_PeakSeasonCvg_TXT_ClassCode),strCP_PeakSeasonCvg_TXT_ClassCode,test);
				se.element().enterOrValidateText(getCP_PeakSeasonCvg_TXT_Coverage(strCP_PeakSeasonCvg_TXT_Coverage),strCP_PeakSeasonCvg_TXT_Coverage,test);
				se.element().enterOrValidateText(getCP_PeakSeasonCvg_TXT_PeakSeasonPeriodFrom(strCP_PeakSeasonCvg_TXT_PeakSeasonPeriodFrom),strCP_PeakSeasonCvg_TXT_PeakSeasonPeriodFrom,test);
				se.element().enterOrValidateText(getCP_PeakSeasonCvg_TXT_PeakSeasonPeriodTo(strCP_PeakSeasonCvg_TXT_PeakSeasonPeriodTo),strCP_PeakSeasonCvg_TXT_PeakSeasonPeriodTo,test);
				se.element().enterOrValidateText(getCP_PeakSeasonCvg_TXT_PeakSeasonAdditionlaLimitOfInsurance(strCP_PeakSeasonCvg_TXT_PeakSeasonAdditionlaLimitOfInsurance),strCP_PeakSeasonCvg_TXT_PeakSeasonAdditionlaLimitOfInsurance,test);
				se.element().Click(getNext(),test);
				if(strCP_PeakSeasonCvg_Done.equalsIgnoreCase((constants.Yes))){
					se.element().Click(getDone(),test);	 
				}
				if(strCP_PeakSeasonCvg_BTN_DoneWithBuilding.equalsIgnoreCase("Yes")){
					se.element().Click(getNext(),test);
				}
			}
			catch(Exception e){
				se.verify().verifyEquals("Failed to fill in details for CP_ExtraExpenseCoveragePage", true, false, true, test);			
				
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
	

		
	
public void CP_OrdinanceOrLawCoveragePage(String strRegressionID, String transaction, String buildingName,ExtentTest test) throws IOException {
	try{
	String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
    if(SuspendSheet.equalsIgnoreCase("CP_OrdinanceOrLawCoverage")){
    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
         testTearDown(se, test);
    }
	List<Map<String, String>> table = ExcelOperations.getBuildingPagesData("CP_OrdinanceOrLawCoverage", strRegressionID, buildingName,transaction);
	int iteration = 0;
	while (iteration < table.size()) {
		LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		
		String strCP_OrdOrLawCov_TXT_ClassCode=(String) row.get("CP_OrdOrLawCov_TXT_ClassCode");
		String strCP_OrdOrLawCov_TXT_ClassDescription=(String) row.get("CP_OrdOrLawCov_TXT_ClassDescription");
		String strCP_OrdOrLawCov_TXT_PolicyType=(String) row.get("CP_OrdOrLawCov_TXT_PolicyType");
		String strCP_OrdOrLawCov_TXT_AmountOfInsurance=(String) row.get("CP_OrdOrLawCov_TXT_AmountOfInsurance");
		String strCP_OrdOrLawCov_TXT_CoverageType=(String) row.get("CP_OrdOrLawCov_TXT_CoverageType");
		String strCP_OrdOrLawCov_CHK_EarthquakeIncluded=(String) row.get("CP_OrdOrLawCov_CHK_EarthquakeIncluded");
		String strTransaction  = (String) row.get("Transaction Name");
		
			try{
				se.log().logTestStep("CP_OrdinanceOrLawCoveragePage");
				
				test.log(LogStatus.INFO, "CP_OrdinanceOrLawCoverage Page","Transaction Step : "+ strTransaction + "<br>" +"Page : CP_OrdinanceOrLawCoverage"  + "<br>" +"Building Details : ");
				se.util().sleep(1000);
				
				se.element().enterOrValidateText(getCP_OrdOrLawCov_TXT_ClassCode(strCP_OrdOrLawCov_TXT_ClassCode),strCP_OrdOrLawCov_TXT_ClassCode,test);
				se.element().enterOrValidateText(getCP_OrdOrLawCov_TXT_ClassDescription(strCP_OrdOrLawCov_TXT_ClassDescription),strCP_OrdOrLawCov_TXT_ClassDescription,test);
				se.element().enterOrValidateText(getCP_OrdOrLawCov_TXT_PolicyType(strCP_OrdOrLawCov_TXT_PolicyType),strCP_OrdOrLawCov_TXT_PolicyType,test);
				se.element().enterOrValidateText(getCP_OrdOrLawCov_TXT_AmountOfInsurance(strCP_OrdOrLawCov_TXT_AmountOfInsurance),strCP_OrdOrLawCov_TXT_AmountOfInsurance,test);
				se.element().enterOrValidateText(getCP_OrdOrLawCov_TXT_CoverageType(strCP_OrdOrLawCov_TXT_CoverageType),strCP_OrdOrLawCov_TXT_CoverageType,test);
				se.element().checkUncheckOrValidate(getCP_OrdOrLawCov_CHK_EarthquakeIncluded(strCP_OrdOrLawCov_CHK_EarthquakeIncluded),strCP_OrdOrLawCov_CHK_EarthquakeIncluded,test);
				se.element().Click(getNext(),test);
				
			}
			catch(Exception e){
				se.verify().verifyEquals("Failed to fill in details for CP_ExtraExpenseCoveragePage", true, false, true, test);
				
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
public void CP_MiscellaneousCoveragePage(String strRegressionID, String transaction, String buildingName,ExtentTest test) throws IOException {
	try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CP_MiscellaneousCoverage")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getBuildingPagesData("CP_MiscellaneousCoverage", strRegressionID, buildingName,transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCP_MiscCov_BTN_Add=(String) row.get("CP_MiscCov_BTN_Add");
		String strCP_MiscCov_Edit=(String) row.get("CP_MiscCov_Edit");
		String strCP_MiscCov_Done=(String) row.get("CP_MiscCov_Done");
		String strCP_MiscCov_TXT_CoverageDescription=(String) row.get("CP_MiscCov_TXT_CoverageDescription");
		String strCP_MiscCov_TXT_FormNo=(String) row.get("CP_MiscCov_TXT_FormNo");
		String strCP_MiscCov_TXT_FormName=(String) row.get("CP_MiscCov_TXT_FormName");
		String strCP_MiscCov_TXT_State=(String) row.get("CP_MiscCov_TXT_State");
		String strCP_MiscCov_TXT_CSPCode=(String) row.get("CP_MiscCov_TXT_CSPCode");
		String strCP_MiscCov_TXT_SublineCode=(String) row.get("CP_MiscCov_TXT_SublineCode");
		String strCP_MiscCov_TXT_AnnualPremium=(String) row.get("CP_MiscCov_TXT_AnnualPremium");
		String strCP_MiscCov_CHK_PremiumChargeTypeProRata=(String) row.get("CP_MiscCov_CHK_PremiumChargeTypeProRata");
		String strCP_MiscCov_CHK_PremiumChargeTypeFlatCharge=(String) row.get("CP_MiscCov_CHK_PremiumChargeTypeFlatCharge");
		String strCP_MiscCov_CHK_PremiumChargeTypeFullyEarned=(String) row.get("CP_MiscCov_CHK_PremiumChargeTypeFullyEarned");
		String strCP_MiscCov_TXT_Description=(String) row.get("CP_MiscCov_TXT_Description");
		String strCP_MiscCov_TXT_LocationNo=(String) row.get("CP_MiscCov_TXT_LocationNo");
		String strCP_MiscCov_TXT_BuildingNo=(String) row.get("CP_MiscCov_TXT_BuildingNo");
		String strCP_MiscCov_TXT_JurisdictionDescription=(String) row.get("CP_MiscCov_TXT_JurisdictionDescription");
		String strCP_MiscCov_TXT_FPDCode=(String) row.get("CP_MiscCov_TXT_FPDCode");
		String strCP_MiscCov_TXT_FireProtectionDistrict=(String) row.get("CP_MiscCov_TXT_FireProtectionDistrict");
		String strCP_MiscCov_CHK_DoNotApplyCityOrCountyTaxes=(String) row.get("CP_MiscCov_CHK_DoNotApplyCityOrCountyTaxes");
		String strCP_MiscCov_CHK_AllCityName=(String) row.get("CP_MiscCov_CHK_AllCityName");
		String strCP_MiscCov_TXT_City=(String) row.get("CP_MiscCov_TXT_City");
		String strCP_MiscCov_TXT_CityCode=(String) row.get("CP_MiscCov_TXT_CityCode");
		String strCP_MiscCov_TXT_County=(String) row.get("CP_MiscCov_TXT_County");
		String strCP_MiscCov_TXT_CountyCode=(String) row.get("CP_MiscCov_TXT_CountyCode");
		String strCP_MiscCov_TXT_TaxCode=(String) row.get("CP_MiscCov_TXT_TaxCode");
		String strTransaction  = (String) row.get("Transaction");
	
		try{
			se.log().logTestStep("CP_MiscellaneousCoveragePage");
			test.log(LogStatus.INFO, "CP_MiscellaneousCoverage Page","Transaction Step : "+ strTransaction + "<br>" +"Page : CP_MiscellaneousCoverage"  + "<br>" +"Building Details : ");
			
			se.verify().verifyEquals("MiscellaneousCoverage Page of PowerWriter ",getMiscCov_LBL_MiscellaneousCoverages().isDisplayed(),true, true,test);
			se.util().sleep(1000);
			if(strCP_MiscCov_BTN_Add.equalsIgnoreCase("Yes")){
			se.element().clickElement(CP_MiscCov_BTN_Add);
			}
			if(strCP_MiscCov_Edit.equalsIgnoreCase("Yes")){
				se.element().clickElement(CP_MiscCov_Edit);
			}
			/*if(!strCP_MiscCov_TXT_CoverageDescription.equalsIgnoreCase("N/A") && !strCP_MiscCov_TXT_CoverageDescription.contains("validate2")){
				se.element().clickSearchIcon(getCP_MiscCov_BTN_CoverageDescription(), test);
				se.element().Click(getCP_MiscCov_LNK_CoverageDescription(strCP_MiscCov_TXT_CoverageDescription), test);
			}else{
			se.element().enterOrValidateText(getCP_MiscCov_TXT_CoverageDescription(strCP_MiscCov_TXT_CoverageDescription),strCP_MiscCov_TXT_CoverageDescription,test);
			}*/
			se.element().selectPopupWithMagnifier(getCP_MiscCov_TXT_CoverageDescription(strCP_MiscCov_TXT_CoverageDescription), getCP_MiscCov_BTN_CoverageDescription(strCP_MiscCov_TXT_CoverageDescription), strCP_MiscCov_TXT_CoverageDescription, constants.NA, strCP_MiscCov_TXT_CoverageDescription, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCP_MiscCov_TXT_FormNo(strCP_MiscCov_TXT_FormNo),strCP_MiscCov_TXT_FormNo,test);
			se.element().enterOrValidateText(getCP_MiscCov_TXT_FormName(strCP_MiscCov_TXT_FormName),strCP_MiscCov_TXT_FormName,test);
			/*if(!strCP_MiscCov_TXT_State.equalsIgnoreCase("N/A") && !strCP_MiscCov_TXT_State.contains("validate2")){
				se.element().clickSearchIcon(getCP_MiscCov_BTN_State(), test);
				se.element().Click(getCP_MiscCov_LNK_State(strCP_MiscCov_TXT_State), test);
			}else{
			se.element().enterOrValidateText(getCP_MiscCov_TXT_State(strCP_MiscCov_TXT_State),strCP_MiscCov_TXT_State,test);
			}*/
			se.element().selectPopupWithMagnifier(getCP_MiscCov_TXT_State(strCP_MiscCov_TXT_State), getCP_MiscCov_BTN_State(strCP_MiscCov_TXT_State), strCP_MiscCov_TXT_State, constants.NA, strCP_MiscCov_TXT_State, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCP_MiscCov_TXT_CSPCode(strCP_MiscCov_TXT_CSPCode),strCP_MiscCov_TXT_CSPCode,test);
			se.element().enterOrValidateText(getCP_MiscCov_TXT_SublineCode(strCP_MiscCov_TXT_SublineCode),strCP_MiscCov_TXT_SublineCode,test);
			se.element().enterOrValidateText(getCP_MiscCov_TXT_AnnualPremium(strCP_MiscCov_TXT_AnnualPremium),strCP_MiscCov_TXT_AnnualPremium,test);
			se.element().checkUncheckOrValidate(getCP_MiscCov_CHK_PremiumChargeTypeProRata(strCP_MiscCov_CHK_PremiumChargeTypeProRata),strCP_MiscCov_CHK_PremiumChargeTypeProRata,test);
			se.element().checkUncheckOrValidate(getCP_MiscCov_CHK_PremiumChargeTypeFlatCharge(strCP_MiscCov_CHK_PremiumChargeTypeFlatCharge),strCP_MiscCov_CHK_PremiumChargeTypeFlatCharge,test);
			se.element().checkUncheckOrValidate(getCP_MiscCov_CHK_PremiumChargeTypeFullyEarned(strCP_MiscCov_CHK_PremiumChargeTypeFullyEarned),strCP_MiscCov_CHK_PremiumChargeTypeFullyEarned,test);
			se.element().enterOrValidateText(getCP_MiscCov_TXT_Description(strCP_MiscCov_TXT_Description),strCP_MiscCov_TXT_Description,test);
			se.element().enterOrValidateText(getCP_MiscCov_TXT_LocationNo(strCP_MiscCov_TXT_LocationNo),strCP_MiscCov_TXT_LocationNo,test);
			se.element().enterOrValidateText(getCP_MiscCov_TXT_BuildingNo(strCP_MiscCov_TXT_BuildingNo),strCP_MiscCov_TXT_BuildingNo,test);
			/*if(!strCP_MiscCov_TXT_JurisdictionDescription.equalsIgnoreCase("N/A") && !strCP_MiscCov_TXT_JurisdictionDescription.contains("validate2")){
				se.element().clickSearchIcon(getCP_MiscCov_BTN_JurisdictionDescription(), test);
				se.element().Click(getCP_MiscCov_LNK_JurisdictionDescription(strCP_MiscCov_TXT_JurisdictionDescription), test);
			}else{
			se.element().enterOrValidateText(getCP_MiscCov_TXT_JurisdictionDescription(strCP_MiscCov_TXT_JurisdictionDescription),strCP_MiscCov_TXT_JurisdictionDescription,test);
			}*/
			se.element().selectPopupWithMagnifier(getCP_MiscCov_TXT_JurisdictionDescription(strCP_MiscCov_TXT_JurisdictionDescription), getCP_MiscCov_BTN_JurisdictionDescription(strCP_MiscCov_TXT_JurisdictionDescription), strCP_MiscCov_TXT_JurisdictionDescription, constants.NA, strCP_MiscCov_TXT_JurisdictionDescription, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCP_MiscCov_TXT_FPDCode(strCP_MiscCov_TXT_FPDCode),strCP_MiscCov_TXT_FPDCode,test);
			se.element().enterOrValidateText(getCP_MiscCov_TXT_FireProtectionDistrict(strCP_MiscCov_TXT_FireProtectionDistrict),strCP_MiscCov_TXT_FireProtectionDistrict,test);
			se.element().checkUncheckOrValidate(getCP_MiscCov_CHK_DoNotApplyCityOrCountyTaxes(strCP_MiscCov_CHK_DoNotApplyCityOrCountyTaxes),strCP_MiscCov_CHK_DoNotApplyCityOrCountyTaxes,test);
			se.element().checkUncheckOrValidate(getCP_MiscCov_CHK_AllCityName(strCP_MiscCov_CHK_AllCityName),strCP_MiscCov_CHK_AllCityName,test);
			se.element().enterOrValidateText(getCP_MiscCov_TXT_City(strCP_MiscCov_TXT_City),strCP_MiscCov_TXT_City,test);
			se.element().enterOrValidateText(getCP_MiscCov_TXT_CityCode(strCP_MiscCov_TXT_CityCode),strCP_MiscCov_TXT_CityCode,test);
			se.element().enterOrValidateText(getCP_MiscCov_TXT_County(strCP_MiscCov_TXT_County),strCP_MiscCov_TXT_County,test);
			se.element().enterOrValidateText(getCP_MiscCov_TXT_CountyCode(strCP_MiscCov_TXT_CountyCode),strCP_MiscCov_TXT_CountyCode,test);
			se.element().enterOrValidateText(getCP_MiscCov_TXT_TaxCode(strCP_MiscCov_TXT_TaxCode),strCP_MiscCov_TXT_TaxCode,test);
			se.element().Click(getNext(),test);
			
			if(strCP_MiscCov_Done.equalsIgnoreCase("Yes")){
 				se.element().Click(getNext(), test);
			}
			}

		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CP_MiscellaneousCoveragePage", true, false, true, test);
			
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

public void CP_OptionalProvisions(String strRegressionID, String transaction, String buildingName, ExtentTest test) throws IOException {
	try{
	
	String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
    if(SuspendSheet.equalsIgnoreCase("CP_Optional_Provisions")){
    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
         testTearDown(se, test);
    }
	
	List<Map<String, String>> table = ExcelOperations.getBuildingPagesData("CP_Optional_Provisions", strRegressionID, buildingName,transaction);
	int iteration = 0;
	while (iteration < table.size()) {
		LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
    String strTransaction = (String) row.get("Transaction Name");
    String strCP_OptProv_Edit=(String) row.get("CP_OptProv_Edit");
    String strCP_OptProv_Done=(String) row.get("CP_OptProv_Done");
    String strCP_OptProv_TXT_ProvisionName = (String) row.get("CP_OptProv_TXT_ProvisionName");
    String strCP_OptProv_TXT_FormNumber = (String) row.get("CP_OptProv_TXT_FormNumber");
    String strCP_OptProv_TXT_Coverage = (String) row.get("CP_OptProv_TXT_Coverage");
    String strCP_OptProv_TXT_IndicateJobClassificationsOrEmployees = (String) row.get("CP_OptProv_TXT_IndicateJobClassificationsOrEmployees");
    String strCP_OptProv_BTN_DoneWithBuilding  = (String) row.get("CP_OptProv_BTN_DoneWithBuilding");
    
           try{
                 se.log().logTestStep("CP_OptionalProvisions");
                 test.log(LogStatus.INFO, "CP_OptionalProvisions page","Transaction Step : "+ strTransaction + "<br>" +"Page : CP_OptionalProvisions" + "<br>" +"Section: CP_OptionalProvisions");
                 se.util().sleep(3000);
                 se.verify().verifyEquals("OptionalProvisions of PowerWriter ", getCP_VerifyOptionalProvisionsText().isDisplayed(),true, true,test);
                 if(strCP_OptProv_Edit.equalsIgnoreCase("Yes")){
                        se.element().tryClick(getOPDetails(),test);
                 se.util().sleep(1000);
                 se.element().enterOrValidateText(getCP_OptProv_TXT_ProvisionName(strCP_OptProv_TXT_ProvisionName),strCP_OptProv_TXT_ProvisionName,test);
                 se.element().enterOrValidateText(getCP_OptProv_TXT_FormNumber(strCP_OptProv_TXT_FormNumber),strCP_OptProv_TXT_FormNumber,test);
                 se.element().enterOrValidateText(getCP_OptProv_TXT_Coverage(strCP_OptProv_TXT_Coverage),strCP_OptProv_TXT_Coverage,test);
                 se.element().enterOrValidateText(getCP_OptProv_TXT_IndicateJobClassificationsOrEmployees(strCP_OptProv_TXT_IndicateJobClassificationsOrEmployees),strCP_OptProv_TXT_IndicateJobClassificationsOrEmployees,test);
                 se.element().Click(getNext(),test);
                 se.util().sleep(1000);
                 }
                 if(strCP_OptProv_Done.equalsIgnoreCase("Yes")){
                 se.element().Click(getNext(),test);
                 }
                 if(strCP_OptProv_BTN_DoneWithBuilding.equalsIgnoreCase("Yes")){
                        se.element().Click(getNext(),test);
                 }
              
                 
           }catch(Exception e){
                 se.verify().verifyEquals("Failed to fill in details for CP_OptionalProvisions", true, false, true, test);
         		
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
