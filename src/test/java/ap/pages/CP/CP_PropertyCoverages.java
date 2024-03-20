package ap.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.SystemPropertyUtil;
import Libraries.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.BL_OR_CP;

public class CP_PropertyCoverages extends BL_OR_CP {
	public void CP_PropertyCoverages_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.Property_Coverages)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Property_Coverages, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strPropCovs_BTN_Edit = (String) row.get("PropCovs_BTN_Edit");
			String strPropCovs_BTN_NoEdit = (String) row.get("PropCovs_BTN_NoEdit");
			String strPropCovs_BTN_Edit_Loc = (String) row.get("PropCovs_BTN_Edit_Loc");
			String strPropCovs_TXTV_CauseofLoss = (String) row.get("PropCovs_TXTV_CauseofLoss");
			String strPropCovs_DDV_Deductible = (String) row.get("PropCovs_DDV_Deductible");
			String strPropCovs_DD_BuldingCoverage = (String) row.get("PropCovs_DD_BuldingCoverage");
			String strPropCovs_CHK_BC_IncBlanket_Build_Cov_Yes = (String) row.get("PropCovs_CHK_BC_IncBlanket_Build_Cov_Yes");
			String strPropCovs_CHK_BC_IncBlanket_Build_Cov_No = (String) row.get("PropCovs_CHK_BC_IncBlanket_Build_Cov_No");					
			String strPropCovs_TXT_BuildingAmoutofInsurance = (String) row.get("PropCovs_TXT_BuildingAmoutofInsurance");
			String strPropCovs_TXTV_BuildingofCoinsurance = (String) row.get("PropCovs_TXTV_BuildingofCoinsurance");
			String strPropCovs_DD_BuildingofCoinsurance = (String) row.get("PropCovs_DD_BuildingofCoinsurance");				
			String strPropCovs_CHK_ActualCashValue = (String) row.get("PropCovs_CHK_ActualCashValue");
			String strPropCovs_CHK_ReplacementCost = (String) row.get("PropCovs_CHK_ReplacementCost");
			String strPropCovs_TXT_BuildCov_IncBlanket_YES_Valuation = (String) row.get("PropCovs_TXT_BuildCov_IncBlanket_YES_Valuation");				
			String strPropCovs_CHK_WindandHailDeductible = (String) row.get("PropCovs_CHK_Wind&HailDeductible");
			String strPropCovs_CHK_RoofSurfACV = (String) row.get("PropCovs_CHK_RoofSurfACV");
			String strPropCovs_CHK_CosmeticLossExculsion = (String) row.get("PropCovs_CHK_CosmeticLossExculsion");
			String strPropCovs_TXTV_InflationGuard = (String) row.get("PropCovs_TXTV_InflationGuard");
			String strPropCovs_DD_InflationGuard = (String) row.get("PropCovs_DD_InflationGuard");
			String strPropCovs_CHK_BCMineSubsidence = (String) row.get("PropCovs_CHK_BCMineSubsidence");
			String strPropCovs_DD_BCOccupancyType = (String) row.get("PropCovs_DD_BCOccupancyType");
			String strPropCovs_TXT_BCMineSubsidenceLimit = (String) row.get("PropCovs_TXT_BCMineSubsidenceLimit");
			String strPropCovs_CHK_PersonaProperty = (String) row.get("PropCovs_CHK_PersonaProperty");
			String strPropCovs_CHK_PP_IncBlanket_PersonalProp_Cov_Yes = (String) row.get("PropCovs_CHK_PP_IncBlanket_PersonalProp_Cov_Yes");
			String strPropCovs_CHK_PP_IncBlanket_PersonalProp_Cov_No = (String) row.get("PropCovs_CHK_PP_IncBlanket_PersonalProp_Cov_No");				
			String strPropCovs_TXT_PPAmoutofInsurance = (String) row.get("PropCovs_TXT_PPAmoutofInsurance");
			String strPropCovs_DD_PPofCoinsurance = (String) row.get("PropCovs_DD_PPofCoinsurance");
			String strPropCovs_TXTV_PPofCoinsurance = (String) row.get("PropCovs_TXTV_PPofCoinsurance");
			String strPropCovs_CHK_PPValuationACV = (String) row.get("PropCovs_CHK_PPValuationACV");
			String strPropCovs_CHK_PPReplacementCost = (String) row.get("PropCovs_CHK_PPReplacementCost");
			String strPropCovs_CHK_Spoilage = (String) row.get("PropCovs_CHK_Spoilage");
			String strPropCovs_TXT_SpoilageLimit = (String) row.get("PropCovs_TXT_SpoilageLimit");
			String strPropCovs_TXT_SpoilageDeductible = (String) row.get("PropCovs_TXT_SpoilageDeductible");
			String strPropCovs_TXT_SpoilageDescriptionOfProp = (String) row.get("PropCovs_TXT_SpoilageDescriptionOfProp");
			
			String strPropCovs_CHK_BusinessIncomeandExtraExpense = (String) row.get("PropCovs_CHK_BusinessIncomeandExtraExpense");
			String strPropCovs_TXT_BusinessIncomeandExtraExpense = (String) row.get("PropCovs_TXT_BusinessIncomeandExtraExpense");
			String strPropCovs_CHK_BusinessIncomeALS = (String) row.get("PropCovs_CHK_BusinessIncomeALS");
			String strPropCovs_DDV_BIEE_ofCoinsurance = (String) row.get("PropCovs_DDV_BIEE_ofCoinsurance");
			String strPropCovs_TXT_BIEE_AmountOfInsurance = (String) row.get("PropCovs_TXT_BIEE_AmountOfInsurance");
			String strPropCovs_DDV_EPIndemnity_NoofDays = (String) row.get("PropCovs_DDV_EPIndemnity_NoofDays");
			String strPropCovs_DDV_WaitingPeriod = (String) row.get("PropCovs_DDV_WaitingPeriod");
			String strPropCovs_CHK_Earthquake = (String) row.get("PropCovs_CHK_Earthquake");
			String strPropCovs_DD_Earthquake_Deductible = (String) row.get("PropCovs_DD_Earthquake_Deductible");
			String strPropCovs_TXT_IncludeEarthquakeCauseOfLossInBlanketBuildingCoverage = (String) row.get("PropCovs_TXT_IncludeEarthquakeCauseOfLossInBlanketBuildingCoverage");
			String strPropCovs_TXT_EQCoinsurance_BlanketBuildingCoverage = (String) row.get("PropCovs_TXT_EQCoinsurance_BlanketBuildingCoverage");
			String strPropCovs_TXT_IncludeEarthquakeCauseOfLossInBlanketPersonalPropertyCoverage = (String) row.get("PropCovs_TXT_IncludeEarthquakeCauseOfLossInBlanketPersonalPropertyCoverage");
			String strPropCovs_TXT_EQCoinsurance_BlanketPersonalPropertyCoverage = (String) row.get("PropCovs_TXT_EQCoinsurance_BlanketPersonalPropertyCoverage");
			String strPropCovs_CHK_WindandHailDeductible_Amount =(String) row.get("PropCovs_CHK_WindandHailDeductible_Amount");
			String strPropCovs_CHK_WindandHailDeductible_Percent =(String) row.get("PropCovs_CHK_WindandHailDeductible_Percent");
			String strPropCovs_DD_WindandHailDeductible_Percent =(String) row.get("PropCovs_DD_WindandHailDeductible_Percent");
			String strPropCovs_DD_WindandHailDeductible_Amount =(String) row.get("PropCovs_DD_WindandHailDeductible_Amount");
			String strPropCovs_TXT_WindandHailDeductible =(String) row.get("PropCovs_TXT_WindandHailDeductible");
			String strPropCovs_TXT_WindandHailDeductibleType =(String) row.get("PropCovs_TXT_WindandHailDeductibleType");
			String strPropCovs_CHK_MonthlyLimitOfIndemnity = (String) row.get("PropCovs_CHK_MonthlyLimitOfIndemnity");
			String strPropCovs_DDV_MonthlyLimitation = (String) row.get("PropCovs_DDV_MonthlyLimitation");
			String strPropCovs_TXT_Validation = (String) row.get("PropCovs_TXT_Validation");
			//String strPropCovs_BTN_Delete = (String) row.get("PropCovs_BTN_Delete");
			String strPropCovs_CHK_PPPeakSeason = (String) row.get("PropCovs_CHK_PPPeakSeason");
			String strPropCovs_DD_PPNumberOfPeakSeason = (String) row.get("PropCovs_DD_PPNumberOfPeakSeason");
			String strPropCovs_TXT_PPPeakSeasonPeriod1 = (String) row.get("PropCovs_TXT_PPPeakSeasonPeriod1");
			String strPropCovs_TXT_PPPeakSeasonPeriod2 = (String) row.get("PropCovs_TXT_PPPeakSeasonPeriod2");
			String strPropCovs_DD_PPPeakSeasonAdditionalLimitofInsurance1 = (String) row.get("PropCovs_DD_PPPeakSeasonAdditionalLimitofInsurance1");
			String strPropCovs_DD_PPPeakSeasonAdditionalLimitofInsurance2 = (String) row.get("PropCovs_DD_PPPeakSeasonAdditionalLimitofInsurance2");
			String strPropCovs_TXT_PPPeakSeasonPeriod1From;
			String strPropCovs_TXT_PPPeakSeasonPeriod1To;
			String strPropCovs_TXT_PPPeakSeasonPeriod2From;
			String strPropCovs_TXT_PPPeakSeasonPeriod2To;
			
			
			try {
				se.log().logTestStep("CP_PropertyCoverages_Details");
				test.log(LogStatus.INFO, "CP_PropertyCoverages_Details","Transaction Step : "+transaction + "<br>" +"Page : CP_PropertyCoverages_Details");
				//se.verify().verifyEquals("CP_PropertyCoverages_Details  of AgencyPortal ", getPropertyCoverages_label().isDisplayed(),true, true,test);
				if(strPropCovs_BTN_Edit.contains("Edit") || strPropCovs_BTN_NoEdit.contains("Yes"))
				{
					se.element().Click(getPropertyCoverages_BTN_Edit(strPropCovs_BTN_Edit_Loc), test);
					se.element().enterOrValidateText(getPropCovs_TXTV_CauseofLoss(strPropCovs_TXTV_CauseofLoss),strPropCovs_TXTV_CauseofLoss,test);
					//se.verify().verifyEquals("PropCovs CauseofLoss validation",se.element(). getSelectedText(PropCovs_TXTV_CauseofLoss),strPropCovs_TXTV_CauseofLoss,true,test);
					se.element().SelectElement(PropCovs_DDV_Deductible, strPropCovs_DDV_Deductible,test);
					se.element().SelectElement(PropCovs_DD_BuldingCoverage, strPropCovs_DD_BuldingCoverage,test);
					
					//se.element().checkUncheckOrValidate( getPropCovs_CHK_BuldingCoverage(strPropCovs_CHK_BuldingCoverage),strPropCovs_CHK_BuldingCoverage,test);
					se.element().checkUncheckOrValidate( getPropCovs_CHK_BC_IncBlanket_Build_Cov_Yes(strPropCovs_CHK_BC_IncBlanket_Build_Cov_Yes),strPropCovs_CHK_BC_IncBlanket_Build_Cov_Yes,test);
					se.element().checkUncheckOrValidate( getPropCovs_CHK_BC_IncBlanket_Build_Cov_No(strPropCovs_CHK_BC_IncBlanket_Build_Cov_No),strPropCovs_CHK_BC_IncBlanket_Build_Cov_No,test);
					//se.verify().verifyEquals("PropCovs Deductible validation",se.element(). getSelectedValue(PropCovs_DDV_Deductible),strPropCovs_DDV_Deductible,true,test);
					//se.element().selectradiovalue(PropCovs_CHK_BuldingCoverage, strPropCovs_CHK_BuldingCoverage);
					se.util().sleep(1000);
					se.element().enterOrValidateText(getPropCovs_TXT_BuildingAmoutofInsurance(strPropCovs_TXT_BuildingAmoutofInsurance),strPropCovs_TXT_BuildingAmoutofInsurance,test);
					se.util().sleep(2000);
					se.element().enterOrValidateText(getPropCovs_TXTV_BuildingofCoinsurance(strPropCovs_TXTV_BuildingofCoinsurance),strPropCovs_TXTV_BuildingofCoinsurance,test);
					se.element().SelectElement(PropCovs_DD_BuildingofCoinsurance, strPropCovs_DD_BuildingofCoinsurance,test);
					//se.verify().verifyEquals("PropCovs BuildingofCoinsurance validation",se.element(). getSelectedText(PropCovs_TXTV_BuildingofCoinsurance),strPropCovs_TXTV_BuildingofCoinsurance,true,test);
					se.element().checkUncheckOrValidate( getPropCovs_CHK_ActualCashValue(strPropCovs_CHK_ActualCashValue),strPropCovs_CHK_ActualCashValue,test);
					se.element().checkUncheckOrValidate( getPropCovs_CHK_ReplacementCost(strPropCovs_CHK_ReplacementCost),strPropCovs_CHK_ReplacementCost,test);
					se.element().enterOrValidateText(getPropCovs_TXT_BuildCov_IncBlanket_YES_Valuation(strPropCovs_TXT_BuildCov_IncBlanket_YES_Valuation),strPropCovs_TXT_BuildCov_IncBlanket_YES_Valuation,test);
					se.element().checkUncheckOrValidate( getPropCovs_CHK_WindandHailDeductible(strPropCovs_CHK_WindandHailDeductible),strPropCovs_CHK_WindandHailDeductible,test);
					se.element().enterOrValidateText(getPropCovs_TXT_WindandHailDeductible(strPropCovs_TXT_WindandHailDeductible),strPropCovs_TXT_WindandHailDeductible,test);
					se.element().enterOrValidateText(getPropCovs_TXT_WindandHailDeductibleType(strPropCovs_TXT_WindandHailDeductibleType),strPropCovs_TXT_WindandHailDeductibleType,test);
					se.element().checkUncheckOrValidate( getPropCovs_CHK_WindandHailDeductible_Amount(strPropCovs_CHK_WindandHailDeductible_Amount),strPropCovs_CHK_WindandHailDeductible_Amount,test);
					se.element().SelectElement(PropCovs_DD_WindandHailDeductible_Amount, strPropCovs_DD_WindandHailDeductible_Amount,test);
					se.element().checkUncheckOrValidate( getPropCovs_CHK_WindandHailDeductible_Percent(strPropCovs_CHK_WindandHailDeductible_Percent),strPropCovs_CHK_WindandHailDeductible_Percent,test);
					se.element().SelectElement(PropCovs_CHK_WindandHailDeductible_percent, strPropCovs_DD_WindandHailDeductible_Percent,test);
					se.element().checkUncheckOrValidate( getPropCovs_CHK_RoofSurfACV(strPropCovs_CHK_RoofSurfACV),strPropCovs_CHK_RoofSurfACV,test);
					se.element().checkUncheckOrValidate( getPropCovs_CHK_CosmeticLossExculsion(strPropCovs_CHK_CosmeticLossExculsion),strPropCovs_CHK_CosmeticLossExculsion,test);
					se.element().checkUncheckOrValidate( getPropCovs_CHK_BCMineSubsidence(strPropCovs_CHK_BCMineSubsidence),strPropCovs_CHK_BCMineSubsidence,test);
					se.element().SelectElement(PropCovs_DD_BCOccupancyType, strPropCovs_DD_BCOccupancyType,test);
					se.element().enterOrValidateText(getPropCovs_TXT_BCMineSubsidenceLimit(strPropCovs_TXT_BCMineSubsidenceLimit),strPropCovs_TXT_BCMineSubsidenceLimit,test);
					se.element().enterOrValidateText(getPropCovs_TXTV_InflationGuard(strPropCovs_TXTV_InflationGuard),strPropCovs_TXTV_InflationGuard,test);
					se.element().SelectElement(PropCovs_DD_InflationGuard, strPropCovs_DD_InflationGuard,test);
					se.element().checkUncheckOrValidate( getPropCovs_CHK_PersonaProperty(strPropCovs_CHK_PersonaProperty),strPropCovs_CHK_PersonaProperty,test);
					se.element().checkUncheckOrValidate( getPropCovs_CHK_PP_IncBlanket_PersonalProp_Cov_Yes(strPropCovs_CHK_PP_IncBlanket_PersonalProp_Cov_Yes),strPropCovs_CHK_PP_IncBlanket_PersonalProp_Cov_Yes,test);
					se.element().checkUncheckOrValidate( getPropCovs_CHK_PP_IncBlanket_PersonalProp_Cov_No(strPropCovs_CHK_PP_IncBlanket_PersonalProp_Cov_No),strPropCovs_CHK_PP_IncBlanket_PersonalProp_Cov_No,test);
					/*se.element().selectradiovalue( PropCovs_CHK_WindandHailDeductible,strPropCovs_CHK_WindandHailDeductible);
						se.element().selectradiovalue(PropCovs_CHK_RoofSurfACV, strPropCovs_CHK_RoofSurfACV);
						se.element().selectradiovalue(PropCovs_CHK_CosmeticLossExculsion,strPropCovs_CHK_CosmeticLossExculsion);
						se.verify().verifyEquals("PropCovs InflationGuard validation",se.element(). getSelectedText(PropCovs_TXTV_InflationGuard),strPropCovs_TXTV_InflationGuard,true,test);
						se.element().selectradiovalue(PropCovs_CHK_PersonaProperty, strPropCovs_CHK_PersonaProperty);*/
					se.element().waitForElement(progressBar,60);
					se.element().enterOrValidateText( getPropCovs_TXT_PPAmoutofInsurance(strPropCovs_TXT_PPAmoutofInsurance),strPropCovs_TXT_PPAmoutofInsurance,test);
					se.element().enterOrValidateText( getPropCovs_TXTV_PPofCoinsurance(strPropCovs_TXTV_PPofCoinsurance),strPropCovs_TXTV_PPofCoinsurance,test);
					se.element().SelectElement(PropCovs_DDV_PP_ofCoinsurance, strPropCovs_DD_PPofCoinsurance,test);
					//se.verify().verifyEquals("PropCovs PPofCoinsurance validation",se.element(). getSelectedText(PropCovs_TXTV_PPofCoinsurance),strPropCovs_TXTV_PPofCoinsurance,true,test);
					se.element().checkUncheckOrValidate( getPropCovs_CHK_PPValuationACV(strPropCovs_CHK_PPValuationACV),strPropCovs_CHK_PPValuationACV,test);
					se.element().checkUncheckOrValidate( getPropCovs_CHK_PPReplacementCost(strPropCovs_CHK_PPReplacementCost),strPropCovs_CHK_PPReplacementCost,test);
					se.element().checkUncheckOrValidate( getPropCovs_CHK_PPReplacementCost(strPropCovs_CHK_PPReplacementCost),strPropCovs_CHK_PPReplacementCost,test);
					se.element().checkUncheckOrValidate( getPropCovs_CHK_Spoilage(strPropCovs_CHK_Spoilage),strPropCovs_CHK_Spoilage,test);
					se.element().enterOrValidateText( getPropCovs_TXT_SpoilageLimit(strPropCovs_TXT_SpoilageLimit),strPropCovs_TXT_SpoilageLimit,test);
					se.element().enterOrValidateText( getPropCovs_TXT_SpoilageDeductible(strPropCovs_TXT_SpoilageDeductible),strPropCovs_TXT_SpoilageDeductible,test);
					se.element().enterOrValidateText( getPropCovs_TXT_SpoilageDescriptionOfProp(strPropCovs_TXT_SpoilageDescriptionOfProp),strPropCovs_TXT_SpoilageDescriptionOfProp,test);
					
					se.element().checkUncheckOrValidate( getPropCovs_CHK_PPPeakSeason(strPropCovs_CHK_PPPeakSeason),strPropCovs_CHK_PPPeakSeason,test);
					se.element().SelectElement(PropCovs_DD_PPNumberOfPeakSeason, strPropCovs_DD_PPNumberOfPeakSeason,test);
					if(!strPropCovs_TXT_PPPeakSeasonPeriod1.equalsIgnoreCase("N/A")) {
					int period = Integer.parseInt(strPropCovs_TXT_PPPeakSeasonPeriod1);
					 strPropCovs_TXT_PPPeakSeasonPeriod1From= Util.FutureDate(3);
					 strPropCovs_TXT_PPPeakSeasonPeriod1To= Util.FutureDate(3+period);
					se.element().enterOrValidateText( getPropCovs_TXT_PPPeakSeasonPeriod1From(strPropCovs_TXT_PPPeakSeasonPeriod1From),strPropCovs_TXT_PPPeakSeasonPeriod1From,test);
					se.element().enterOrValidateText( getPropCovs_TXT_PPPeakSeasonPeriod1To(strPropCovs_TXT_PPPeakSeasonPeriod1To),strPropCovs_TXT_PPPeakSeasonPeriod1To,test);
					se.element().enterOrValidateText( getPropCovs_DD_PPPeakSeasonAdditionalLimitofInsurance1(strPropCovs_DD_PPPeakSeasonAdditionalLimitofInsurance1),strPropCovs_DD_PPPeakSeasonAdditionalLimitofInsurance1,test);
					if(!strPropCovs_TXT_PPPeakSeasonPeriod2.equalsIgnoreCase("N/A")) {
						 period = Integer.parseInt(strPropCovs_TXT_PPPeakSeasonPeriod2);
						strPropCovs_TXT_PPPeakSeasonPeriod2From= Util.FutureDate(16);
					 strPropCovs_TXT_PPPeakSeasonPeriod2To= Util.FutureDate(16+period);
					se.element().enterOrValidateText( getPropCovs_TXT_PPPeakSeasonPeriod2From(strPropCovs_TXT_PPPeakSeasonPeriod2From),strPropCovs_TXT_PPPeakSeasonPeriod2From,test);
					se.element().enterOrValidateText( getPropCovs_TXT_PPPeakSeasonPeriod2To(strPropCovs_TXT_PPPeakSeasonPeriod2To),strPropCovs_TXT_PPPeakSeasonPeriod2To,test);
					se.element().enterOrValidateText( getPropCovs_DD_PPPeakSeasonAdditionalLimitofInsurance2(strPropCovs_DD_PPPeakSeasonAdditionalLimitofInsurance2),strPropCovs_DD_PPPeakSeasonAdditionalLimitofInsurance2,test);
					}
						
					}
					
					se.element().checkUncheckOrValidate( getPropCovs_CHK_BusinessIncomeandExtraExpense(strPropCovs_CHK_BusinessIncomeandExtraExpense),strPropCovs_CHK_BusinessIncomeandExtraExpense,test);
					se.element().enterOrValidateText( getPropCovs_TXT_BusinessIncomeandExtraExpense(strPropCovs_TXT_BusinessIncomeandExtraExpense),strPropCovs_TXT_BusinessIncomeandExtraExpense,test);
					//se.element().selectradiovalue(PropCovs_CHK_PPReplacementCost, strPropCovs_CHK_PPReplacementCost);
					//se.element().selectradiovalue(PropCovs_CHK_BusinessIncomeandExtraExpense, strPropCovs_CHK_BusinessIncomeandExtraExpense);
					se.util().sleep(3000);
					se.element().checkUncheckOrValidate( getPropCovs_CHK_BusinessIncomeALS(strPropCovs_CHK_BusinessIncomeALS),strPropCovs_CHK_BusinessIncomeALS,test);
					
					
					se.element().SelectElement(PropCovs_DDV_BIEE_ofCoinsurance, strPropCovs_DDV_BIEE_ofCoinsurance,test);
					se.element().enterOrValidateText( getPropCovs_TXT_BIEE_AmountOfInsurance(strPropCovs_TXT_BIEE_AmountOfInsurance),strPropCovs_TXT_BIEE_AmountOfInsurance,test);
					se.element().checkUncheckOrValidate( getPropCovs_CHK_MonthlyLimitOfIndemnity(strPropCovs_CHK_MonthlyLimitOfIndemnity),strPropCovs_CHK_MonthlyLimitOfIndemnity,test);
					se.element().SelectElement(PropCovs_DDV_MonthlyLimitation, strPropCovs_DDV_MonthlyLimitation,test);
					se.element().SelectElement(PropCovs_DDV_EPIndemnity_NoofDays, strPropCovs_DDV_EPIndemnity_NoofDays,test);
					se.element().SelectElement(PropCovs_DDV_WaitingPeriod, strPropCovs_DDV_WaitingPeriod,test);
					//se.verify().verifyEquals("PropCovs BIEE_ofCoinsurance validation",se.element(). getSelectedValue(PropCovs_DDV_BIEE_ofCoinsurance),strPropCovs_DDV_BIEE_ofCoinsurance,true,test);
					//se.verify().verifyEquals("PropCovs EPIndemnity_NoofDays validation",se.element(). getSelectedValue(PropCovs_DDV_EPIndemnity_NoofDays),strPropCovs_DDV_EPIndemnity_NoofDays,true,test);
					/* for Tc IN State 2nd location earth quake should not displayed*/
					se.element().checkUncheckOrValidate( getPropCovs_CHK_Earthquake(strPropCovs_CHK_Earthquake),strPropCovs_CHK_Earthquake,test);
					se.element().SelectElement(PropCovs_DD_Earthquake_Deductible, strPropCovs_DD_Earthquake_Deductible,test);
					se.element().enterOrValidateText( getPropCovs_TXT_IncludeEarthquakeCauseOfLossInBlanketBuildingCoverage(strPropCovs_TXT_IncludeEarthquakeCauseOfLossInBlanketBuildingCoverage),strPropCovs_TXT_IncludeEarthquakeCauseOfLossInBlanketBuildingCoverage,test);
					se.element().enterOrValidateText( getPropCovs_TXT_EQCoinsurance_BlanketBuildingCoverage(strPropCovs_TXT_EQCoinsurance_BlanketBuildingCoverage),strPropCovs_TXT_EQCoinsurance_BlanketBuildingCoverage,test);
					se.element().enterOrValidateText( getPropCovs_TXT_IncludeEarthquakeCauseOfLossInBlanketPersonalPropertyCoverage(strPropCovs_TXT_IncludeEarthquakeCauseOfLossInBlanketPersonalPropertyCoverage),strPropCovs_TXT_IncludeEarthquakeCauseOfLossInBlanketPersonalPropertyCoverage,test);
					se.element().enterOrValidateText( getPropCovs_TXT_EQCoinsurance_BlanketPersonalPropertyCoverage(strPropCovs_TXT_EQCoinsurance_BlanketPersonalPropertyCoverage),strPropCovs_TXT_EQCoinsurance_BlanketPersonalPropertyCoverage,test);
					se.element().Click(getBuildingDetails_BTN_Save(), test);
					if(!strPropCovs_TXT_Validation.equalsIgnoreCase("N/A"))
					{
						se.element().Click(getGI_CHK_Continue(), test);
						se.element().checkUncheckOrValidate( getPremiumIndication_TXT_Rattingerror(strPropCovs_TXT_Validation),strPropCovs_TXT_Validation,test);
					}
				}
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for CP_Property coverages_Details ", true, false, true, test);
			}
			iteration++;
		}
		se.element().Click(getGI_CHK_Continue(), test);
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}

}
