package pw.pages.CA;
/**
 * @author ${is09492}
 */
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CA;

public class CA_StateCoverageLimits extends OR_CA{

	public void StateCoverageLimits(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		
		try{
			//String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		    if(suspendSheet.equalsIgnoreCase("StateCoverageLimits")){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
			
			List<Map<String, String>> table = ExcelOperations.getPagesData("StateCoverageLimits", strRegressionID, transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			
				String strStateCoverageLimits_BTN_Add = (String) row.get("StateCoverageLimits_BTN_Add");
				String strStateCoverageLimits_BTN_Details = (String) row.get("StateCoverageLimits_BTN_Details");
				String strStateCoverageLimits_BTN_Done = (String) row.get("StateCoverageLimits_BTN_Done");
				String strStateCoverageLimits_BTN_Select = (String) row.get("StateCoverageLimits_BTN_Select");
				String strStateCoverageLimits_BTN_Delete = (String) row.get("StateCoverageLimits_BTN_Delete");
				String strStateCoverageLimits_TXT_State = (String) row.get("StateCoverageLimits_TXT_State");
				String strStateCoverageLimits_CHK_IsOCP_Adopted_State = (String) row.get("StateCoverageLimits_CHK_IsOCP_Adopted_State");
				String strStateCoverageLimits_CHK_VehicleCoverages = (String) row.get("StateCoverageLimits_CHK_VehicleCoverages");
				String strStateCoverageLimits_CHK_VC_Liability = (String) row.get("StateCoverageLimits_CHK_VC_Liability");
				String strStateCoverageLimits_TXT_VC_TortLimitFilterNeeded = (String) row.get("StateCoverageLimits_TXT_VC_TortLimitFilterNeeded");
				String strStateCoverageLimits_TXT_VC_TortLimit = (String) row.get("StateCoverageLimits_TXT_VC_TortLimit");
				String strStateCoverageLimits_TXT_VC_TortLimitationCode = (String) row.get("StateCoverageLimits_TXT_VC_TortLimitationCode");
				String strStateCoverageLimits_TXT_VC_Combined_Single_LimitFilterNeeded = (String) row.get("StateCoverageLimits_TXT_VC_Combined_Single_LimitFilterNeeded");
				String strStateCoverageLimits_TXT_VC_Combined_Single_Limit = (String) row.get("StateCoverageLimits_TXT_VC_Combined_Single_Limit");
				String strStateCoverageLimits_TXT_VC_DeductibleFilterNeeded = (String) row.get("StateCoverageLimits_TXT_VC_DeductibleFilterNeeded");
				String strStateCoverageLimits_TXT_VC_Deductible = (String) row.get("StateCoverageLimits_TXT_VC_Deductible");
				String strStateCoverageLimits_CHK_VC_DeductibleType_CombinedSingleLimit = (String) row.get("StateCoverageLimits_CHK_VC_DeductibleType_CombinedSingleLimit");
				String strStateCoverageLimits_CHK_VC_DeductibleType_PropDamagePerAccDeductible = (String) row.get("StateCoverageLimits_CHK_VC_DeductibleType_PropDamagePerAccDeductible");
				String strStateCoverageLimits_CHK_VC_PersonalInjuryProtection = (String) row.get("StateCoverageLimits_CHK_VC_PersonalInjuryProtection");
				String strStateCoverageLimits_RDO_VC_DriversCoveredUnderWorkersComp_Y = (String) row.get("StateCoverageLimits_RDO_VC_DriversCoveredUnderWorkersComp_Y");
				String strStateCoverageLimits_RDO_VC_DriversCoveredUnderWorkersComp_N = (String) row.get("StateCoverageLimits_RDO_VC_DriversCoveredUnderWorkersComp_N");
				String strStateCoverageLimits_TXT_VC_ExcessCoverage = (String) row.get("StateCoverageLimits_TXT_VC_ExcessCoverage");
				String strStateCoverageLimits_TXT_VC_ExcessCoverageSearch = (String) row.get("StateCoverageLimits_TXT_VC_ExcessCoverage");
				String strStateCoverageLimits_TXT_VC_ExcessCoverageDeductible = (String) row.get("StateCoverageLimits_TXT_VC_ExcessCoverageDeductible");
				String strStateCoverageLimits_CHK_VC_PropertyProtectionInsurance = (String) row.get("StateCoverageLimits_CHK_VC_PropertyProtectionInsurance");
				String strStateCoverageLimits_TXT_VC_PropertyProtectionInsuranceDeductible = (String) row.get("StateCoverageLimits_TXT_VC_PropertyProtectionInsuranceDeductible");
				String strStateCoverageLimits_CHK_Stackedcoverage = (String) row.get("StateCoverageLimits_CHK_Stackedcoverage");
				String strStateCoverageLimits_CHK_VC_Medical_Payments = (String) row.get("StateCoverageLimits_CHK_VC_Medical_Payments");
				String strStateCoverageLimits_TXT_VC_LimitEachPersonFilterNeeded = (String) row.get("StateCoverageLimits_TXT_VC_LimitEachPersonFilterNeeded");
				String strStateCoverageLimits_TXT_VC_LimitEachPerson = (String) row.get("StateCoverageLimits_TXT_VC_LimitEachPerson");
				String strStateCoverageLimits_CHK_Uninsured_Motorist = (String) row.get("StateCoverageLimits_CHK_Uninsured_Motorist");
				String strStateCoverageLimits_TXT_UninsuredMotorist_CombinedSingleLimitFilterNeeded = (String) row.get("StateCoverageLimits_TXT_UninsuredMotorist_CombinedSingleLimitFilterNeeded");
				String strStateCoverageLimits_TXT_UninsuredMotorist_CombinedSingleLimit = (String) row.get("StateCoverageLimits_TXT_UninsuredMotorist_CombinedSingleLimit");
				String strStateCoverageLimits_CHK_VC_IncludePropDamage = (String) row.get("StateCoverageLimits_CHK_VC_IncludePropDamage");
				String strStateCoverageLimits_CHK_Uninsured_Motorist_PD = (String) row.get("StateCoverageLimits_CHK_Uninsured_Motorist_PD");
				String strStateCoverageLimits_TXT_property_dam_limitFilterNeeded = (String) row.get("StateCoverageLimits_TXT_property_dam_limitFilterNeeded");
				String strStateCoverageLimits_TXT_property_dam_limit = (String) row.get("StateCoverageLimits_TXT_property_dam_limit");
				String strStateCoverageLimits_CHK_VC_underinsured_motorist = (String) row.get("StateCoverageLimits_CHK_VC_underinsured_motorist");
				String strStateCoverageLimits_TXT_combined_single_limit_underinsuredFilterNeeded = (String) row.get("StateCoverageLimits_TXT_combined_single_limit_underinsuredFilterNeeded");
				String strStateCoverageLimits_TXT_combined_single_limit_underinsured = (String) row.get("StateCoverageLimits_TXT_combined_single_limit_underinsured");
				String strStateCoverageLimits_CHK_LC_WithoutFullCoveredAutos = (String) row.get("StateCoverageLimits_CHK_LC_WithoutFullCoveredAutos");
				String strStateCoverageLimits_CHK_FullCoveredAutos = (String) row.get("StateCoverageLimits_CHK_FullCoveredAutos");
				String strStateCoverageLimits_CHK_LC_Liability = (String) row.get("StateCoverageLimits_CHK_LC_Liability");
				String strStateCoverageLimits_TXT_LC_Combined_Single_LimitFilterNeeded = (String) row.get("StateCoverageLimits_TXT_LC_Combined_Single_LimitFilterNeeded");
				String strStateCoverageLimits_TXT_LC_Combined_Single_Limit = (String) row.get("StateCoverageLimits_TXT_LC_Combined_Single_Limit");
				String strStateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedAggregateLimit = (String) row.get("StateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedAggregateLimit");
				String strStateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedOtherAggregateLimit = (String) row.get("StateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedOtherAggregateLimit");
				String strStateCoverageLimits_TXT_LC_GeneralLiabilityAggregateLimit = (String) row.get("StateCoverageLimits_TXT_LC_GeneralLiabilityAggregateLimit");
				String strStateCoverageLimits_TXT_LC_GeneralLiabilityOtherAggregateLimitFilterNeeded = (String) row.get("StateCoverageLimits_TXT_LC_GeneralLiabilityOtherAggregateLimitFilterNeeded");
				String strStateCoverageLimits_TXT_LC_GeneralLiabilityOtherAggregateLimit = (String) row.get("StateCoverageLimits_TXT_LC_GeneralLiabilityOtherAggregateLimit");
				String strStateCoverageLimits_TXT_LC_Deductible = (String) row.get("StateCoverageLimits_TXT_LC_Deductible");
				String strStateCoverageLimits_TXT_LC_DeductibleFilterNeeded = (String) row.get("StateCoverageLimits_TXT_LC_DeductibleFilterNeeded");
				String strStateCoverageLimits_CHK_LC_DeductibleType_CombinedSingleLimit = (String) row.get("StateCoverageLimits_CHK_LC_DeductibleType_CombinedSingleLimit");
				String strStateCoverageLimits_CHK_LC_DeductibleType_PropertDamPerAccDed = (String) row.get("StateCoverageLimits_CHK_LC_DeductibleType_PropertDamPerAccDed");
				String strStateCoverageLimits_CHK_LC_PersonalInjuryProtection = (String) row.get("StateCoverageLimits_CHK_LC_PersonalInjuryProtection");
				String strStateCoverageLimits_TXT_InsuredCoverageStatus = (String) row.get("StateCoverageLimits_TXT_InsuredCoverageStatus");
				String strStateCoverageLimits_TXT_VC_SpouseResidentReleativeCoverageStatus = (String) row.get("StateCoverageLimits_TXT_VC_SpouseResidentReleativeCoverageStatus");
				String strStateCoverageLimits_CHK_VC_MedicalExpenseBenefits = (String) row.get("StateCoverageLimits_CHK_VC_MedicalExpenseBenefits");
				String strStateCoverageLimits_TXT_VC_Limit = (String) row.get("StateCoverageLimits_TXT_VC_Limit");
				String strStateCoverageLimits_CHK_VC_ExcludeMedicalExpenseBenefits = (String) row.get("StateCoverageLimits_CHK_VC_ExcludeMedicalExpenseBenefits");
				String strStateCoverageLimits_RDO_VC_NumberofHouseholdMembers_All = (String) row.get("StateCoverageLimits_RDO_VC_NumberofHouseholdMembers_All");
				String strStateCoverageLimits_RDO_VC_NumberofHouseholdMembers_Oneormore = (String) row.get("StateCoverageLimits_RDO_VC_NumberofHouseholdMembers_Oneormore");
				String strStateCoverageLimits_BTN_VC_ADD = (String) row.get("StateCoverageLimits_BTN_VC_ADD");
				String strStateCoverageLimits_TXT_VC_FullNameofEachExcludedPerson = (String) row.get("StateCoverageLimits_TXT_VC_FullNameofEachExcludedPerson");
				String strStateCoverageLimits_TXT_VC_DateofBirth = (String) row.get("StateCoverageLimits_TXT_VC_DateofBirth");
				String strStateCoverageLimits_CHK_VC_ExcessAttendantCare = (String) row.get("StateCoverageLimits_CHK_VC_ExcessAttendantCare");
				String strStateCoverageLimits_TXT_VC_LimitPerPersonAccident = (String) row.get("StateCoverageLimits_TXT_VC_LimitPerPersonAccident");
				String strStateCoverageLimits_CHK_VC_AdditionalPersInjuryProt = (String) row.get("StateCoverageLimits_CHK_VC_AdditionalPersInjuryProt");
				String strStateCoverageLimits_TXT_OptionNumberFilterNeeded = (String) row.get("StateCoverageLimits_TXT_OptionNumberFilterNeeded");
				String strStateCoverageLimits_TXT_OptionNumber = (String) row.get("StateCoverageLimits_TXT_OptionNumber");
				String strStateCoverageLimits_TXT_VC_TotalMedicalExpenses = (String) row.get("StateCoverageLimits_TXT_VC_TotalMedicalExpenses");
				String strStateCoverageLimits_TXT_VC_TotalAggregateAmount = (String) row.get("StateCoverageLimits_TXT_VC_TotalAggregateAmount");
				String strStateCoverageLimits_TXT_TotalWeeklyMaxWorkLoss = (String) row.get("StateCoverageLimits_TXT_TotalWeeklyMaxWorkLoss");
				String strStateCoverageLimits_TXT_TotalWeeklyMaxEssServices = (String) row.get("StateCoverageLimits_TXT_TotalWeeklyMaxEssServices");
				String strStateCoverageLimits_TXT_FuneralExpenses = (String) row.get("StateCoverageLimits_TXT_FuneralExpenses");
				String strStateCoverageLimits_CHK_LC_Medical_PaymentsLocAndOpts = (String) row.get("StateCoverageLimits_CHK_LC_Medical_PaymentsLocAndOpts");
				String strStateCoverageLimits_TXT_LC_LimitEachPersonFilterNeeded = (String) row.get("StateCoverageLimits_TXT_LC_LimitEachPersonFilterNeeded");
				String strStateCoverageLimits_TXT_LC_LimitEachPerson = (String) row.get("StateCoverageLimits_TXT_LC_LimitEachPerson");
				String strStateCoverageLimits_CHK_LC_Medical_PaymentsAuto = (String) row.get("StateCoverageLimits_CHK_LC_Medical_PaymentsAuto");
				String strStateCoverageLimits_TXT_LC_AutoLimitEachPersonFilterNeeded = (String) row.get("StateCoverageLimits_TXT_LC_AutoLimitEachPersonFilterNeeded");
				String strStateCoverageLimits_TXT_LC_AutoLimitEachPerson = (String) row.get("StateCoverageLimits_TXT_LC_AutoLimitEachPerson");
				String strStateCoverageLimits_CHK_LC_Uninsured_Motorist = (String) row.get("StateCoverageLimits_CHK_LC_Uninsured_Motorist");
				String strStateCoverageLimits_TXT_LC_combined_single_limit_Uninsured = (String) row.get("StateCoverageLimits_TXT_LC_combined_single_limit_Uninsured");
				String strStateCoverageLimits_TXT_LC_combined_single_limit_UninsuredFilterNeeded = (String) row.get("StateCoverageLimits_TXT_LC_combined_single_limit_UninsuredFilterNeeded");
				String strStateCoverageLimits_CHK_LC_underinsured_motorist = (String) row.get("StateCoverageLimits_CHK_LC_underinsured_motorist");
				String strStateCoverageLimits_TXT_LC_combined_single_limit_underinsured = (String) row.get("StateCoverageLimits_TXT_LC_combined_single_limit_underinsured");
				String strStateCoverageLimits_TXT_VC_DeductibleCoverageFilterNeeded = (String) row.get("StateCoverageLimits_TXT_VC_DeductibleCoverageFilterNeeded");
				String strStateCoverageLimits_TXT_VC_DeductibleCoverage = (String) row.get("StateCoverageLimits_TXT_VC_DeductibleCoverage");
				String strStateCoverageLimits_TXT_ExclusionOfWorkLossBenefitsFilterNeeded = (String) row.get("StateCoverageLimits_TXT_ExclusionOfWorkLossBenefitsFilterNeeded");
				String strStateCoverageLimits_TXT_ExclusionOfWorkLossBenefits = (String) row.get("StateCoverageLimits_TXT_ExclusionOfWorkLossBenefits");
				String strStateCoverageLimits_CHK_LC_IncludePropertyDamage = (String) row.get("StateCoverageLimits_CHK_LC_IncludePropertyDamage");
				String strStateCoverageLimits_CHK_LC_FullCoverageNoDeductible_Yes = (String) row.get("StateCoverageLimits_CHK_LC_FullCoverageNoDeductible_Yes");
				String strStateCoverageLimits_CHK_LC_FullCoverageNoDeductible_No = (String) row.get("StateCoverageLimits_CHK_LC_FullCoverageNoDeductible_No");
				String strStateCoverageLimits_CHK_FGC_PrivatePassengerVehicles_Yes = (String) row.get("StateCoverageLimits_CHK_FGC_PrivatePassengerVehicles_Yes");
				String strStateCoverageLimits_CHK_FGC_PrivatePassengerVehicles_No = (String) row.get("StateCoverageLimits_CHK_FGC_PrivatePassengerVehicles_No");
				String strStateCoverageLimits_TXT_JurisDescFilterNeeded = (String) row.get("StateCoverageLimits_TXT_JurisDescFilterNeeded");
				String strStateCoverageLimits_TXT_JurisDesc = (String) row.get("StateCoverageLimits_TXT_JurisDesc");
				String strStateCoverageLimits_TXT_FPDcode = (String) row.get("StateCoverageLimits_TXT_FPDcode");
				String strStateCoverageLimits_TXT_Fireprotectiondist = (String) row.get("StateCoverageLimits_TXT_Fireprotectiondist");
				String strStateCoverageLimits_CHK_DoNotApplyCityOrCountyTax = (String) row.get("StateCoverageLimits_CHK_DoNotApplyCityOrCountyTax");
				String strStateCoverageLimits_CHK_AllCityName = (String) row.get("StateCoverageLimits_CHK_AllCityName");
				String strStateCoverageLimits_TXT_City = (String) row.get("StateCoverageLimits_TXT_City");
				String strStateCoverageLimits_TXT_CityCode = (String) row.get("StateCoverageLimits_TXT_CityCode");
				String strStateCoverageLimits_TXT_County = (String) row.get("StateCoverageLimits_TXT_County");
				String strStateCoverageLimits_TXT_CountyCode = (String) row.get("StateCoverageLimits_TXT_CountyCode");
				String strStateCoverageLimits_TXT_TaxCode = (String) row.get("StateCoverageLimits_TXT_TaxCode");
				String strStateCoverageLimits_TXT_ExcessCoverage = (String) row.get("StateCoverageLimits_TXT_ExcessCoverage");
				String strStateCoverageLimits_CHK_PropertyProtectionInsurance = (String) row.get("StateCoverageLimits_CHK_PropertyProtectionInsurance");
				String strStateCoverageLimits_TXT_LC_ExcessCoverageFilterNeeded = (String) row.get("StateCoverageLimits_TXT_LC_ExcessCoverageFilterNeeded");
				String strStateCoverageLimits_TXT_LC_ExcessCoverage = (String) row.get("StateCoverageLimits_TXT_LC_ExcessCoverage");
				String strStateCoverageLimits_TXT_LC_ExcessCoverage_DeductibleFilterNeeded = (String) row.get("StateCoverageLimits_TXT_LC_ExcessCoverage_DeductibleFilterNeeded");
				String strStateCoverageLimits_TXT_LC_ExcessCoverage_Deductible = (String) row.get("StateCoverageLimits_TXT_LC_ExcessCoverage_Deductible");
				String strStateCoverageLimits_CHK_PropDamLiabilityCov_Buyback = (String) row.get("StateCoverageLimits_CHK_PropDamLiabilityCov_Buyback");
				String strStateCoverageLimits_CHK_LC_AdditionalPersInjuryProt = (String) row.get("StateCoverageLimits_CHK_LC_AdditionalPersInjuryProt");
				String strStateCoverageLimits_TXT_LC_OptionNumber = (String) row.get("StateCoverageLimits_TXT_LC_OptionNumber");
				String strStateCoverageLimits_TXT_LC_OptionNumberFilterNeeded = (String) row.get("StateCoverageLimits_TXT_LC_OptionNumberFilterNeeded");
				String strStateCoverageLimits_TXT_LC_TotalMedicalExpenses = (String) row.get("StateCoverageLimits_TXT_LC_TotalMedicalExpenses");
				String strStateCoverageLimits_TXT_LC_TotalAggregateAmount = (String) row.get("StateCoverageLimits_TXT_LC_TotalAggregateAmount");
				String strStateCoverageLimits_TXT_LC_TotalWeeklyMaxWorkLoss = (String) row.get("StateCoverageLimits_TXT_LC_TotalWeeklyMaxWorkLoss");
				String strStateCoverageLimits_TXT_LC_TotalWeeklyMaxEssServices = (String) row.get("StateCoverageLimits_TXT_LC_TotalWeeklyMaxEssServices");
				String strStateCoverageLimits_TXT_PropertyProtectionInsuranceDeuctible = (String) row.get("StateCoverageLimits_TXT_PropertyProtectionInsuranceDeuctible");
				String strStateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedOtherAggregateLimitFilterNeeded = (String) row.get("StateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedOtherAggregateLimitFilterNeeded");
				
				try{
					se.log().logTestStep("CA_StateCoverageLimits");
					test.log(LogStatus.INFO, "CA_StateCoverageLimits page","Transaction Step : "+transaction + "<br>" +"Page : CA_StateCoverageLimits page");
					se.verify().verifyEquals("CA_StateCoverageLimits Details  of PowerWriter ", getStateCoverageLimits_BTN_Label().isDisplayed(),true, true,test);
					
					if(strStateCoverageLimits_BTN_Add.equalsIgnoreCase("Yes")){
						se.element().Click(getStateCoverageLimits_BTN_Add(),test);
					}
					if(!strStateCoverageLimits_BTN_Details.equalsIgnoreCase("N/A")){
						se.element().Click(getStateCoverageLimits_BTN_Details(strStateCoverageLimits_BTN_Details),test);
					}
					if(strStateCoverageLimits_BTN_Delete.equalsIgnoreCase("Yes")){
						se.element().checkUncheckOrValidate(getStateCoverageLimits_selectDetails(strStateCoverageLimits_BTN_Select),"Check",test);
						se.element().Click(getStateCoverageLimits_BTN_Delete(), test);
						
					}else{
				
						se.element().enterOrValidateText(getStateCoverageLimits_TXT_State(strStateCoverageLimits_TXT_State),strStateCoverageLimits_TXT_State,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_IsOCP_Adopted_State(strStateCoverageLimits_CHK_IsOCP_Adopted_State),strStateCoverageLimits_CHK_IsOCP_Adopted_State,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_VehicleCoverages(strStateCoverageLimits_CHK_VehicleCoverages),strStateCoverageLimits_CHK_VehicleCoverages,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_VC_Liability(strStateCoverageLimits_CHK_VC_Liability),strStateCoverageLimits_CHK_VC_Liability,test);
						se.element().selectPopupWithMagnifier(getStateCoverageLimits_TXT_VC_TortLimit(strStateCoverageLimits_TXT_VC_TortLimit),getStateCoverageLimits_TXT_VC_TortLimitSearch(strStateCoverageLimits_TXT_VC_TortLimit),strStateCoverageLimits_TXT_VC_TortLimit,strStateCoverageLimits_TXT_VC_TortLimitFilterNeeded,strStateCoverageLimits_TXT_VC_TortLimit, constants.NA, constants.NA,constants.NA,test);
						se.element().enterOrValidateText(getStateCoverageLimits_TXT_VC_TortLimitationCode(strStateCoverageLimits_TXT_VC_TortLimitationCode),strStateCoverageLimits_TXT_VC_TortLimitationCode,test);
						se.element().selectPopupWithMagnifier(getStateCoverageLimits_TXT_VC_Combined_Single_Limit(strStateCoverageLimits_TXT_VC_Combined_Single_Limit),getStateCoverageLimits_TXT_VC_Combined_Single_LimitSearch(strStateCoverageLimits_TXT_VC_Combined_Single_Limit),strStateCoverageLimits_TXT_VC_Combined_Single_Limit,strStateCoverageLimits_TXT_VC_Combined_Single_LimitFilterNeeded,strStateCoverageLimits_TXT_VC_Combined_Single_Limit, constants.NA, constants.NA,constants.NA,test);
						se.element().selectPopupWithMagnifier(getStateCoverageLimits_TXT_VC_Deductible(strStateCoverageLimits_TXT_VC_Deductible),getStateCoverageLimits_TXT_VC_DeductibleSearch(strStateCoverageLimits_TXT_VC_Deductible),strStateCoverageLimits_TXT_VC_Deductible,strStateCoverageLimits_TXT_VC_DeductibleFilterNeeded,strStateCoverageLimits_TXT_VC_Deductible, constants.NA, constants.NA,constants.NA,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_VC_DeductibleType_CombinedSingleLimit(strStateCoverageLimits_CHK_VC_DeductibleType_CombinedSingleLimit),strStateCoverageLimits_CHK_VC_DeductibleType_CombinedSingleLimit,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_VC_DeductibleType_PropDamagePerAccDeductible(strStateCoverageLimits_CHK_VC_DeductibleType_PropDamagePerAccDeductible),strStateCoverageLimits_CHK_VC_DeductibleType_PropDamagePerAccDeductible,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_VC_PersonalInjuryProtection(strStateCoverageLimits_CHK_VC_PersonalInjuryProtection),strStateCoverageLimits_CHK_VC_PersonalInjuryProtection,test);
						se.element().selectPopupWithMagnifier(getStateCoverageLimits_TXT_VC_ExcessCoverage(strStateCoverageLimits_TXT_VC_ExcessCoverage), getStateCoverageLimits_TXT_VC_ExcessCoverageSearch(strStateCoverageLimits_TXT_VC_ExcessCoverage), strStateCoverageLimits_TXT_VC_ExcessCoverage, constants.NA, strStateCoverageLimits_TXT_VC_ExcessCoverage, constants.NA, constants.NA, constants.NA, test);
						se.element().enterOrValidateText(getStateCoverageLimits_TXT_VC_ExcessCoverageDeductible(strStateCoverageLimits_TXT_VC_ExcessCoverageDeductible),strStateCoverageLimits_TXT_VC_ExcessCoverageDeductible,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_VC_PersonalInjuryProtection(strStateCoverageLimits_CHK_VC_PersonalInjuryProtection),strStateCoverageLimits_CHK_VC_PersonalInjuryProtection,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_RDO_VC_DriversCoveredUnderWorkersComp_Y(strStateCoverageLimits_RDO_VC_DriversCoveredUnderWorkersComp_Y),strStateCoverageLimits_RDO_VC_DriversCoveredUnderWorkersComp_Y,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_RDO_VC_DriversCoveredUnderWorkersComp_N(strStateCoverageLimits_RDO_VC_DriversCoveredUnderWorkersComp_N),strStateCoverageLimits_RDO_VC_DriversCoveredUnderWorkersComp_N,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_VC_PropertyProtectionInsurance(strStateCoverageLimits_CHK_VC_PropertyProtectionInsurance),strStateCoverageLimits_CHK_VC_PropertyProtectionInsurance,test);
						se.element().enterOrValidateText(getStateCoverageLimits_TXT_VC_PropertyProtectionInsuranceDeductible(strStateCoverageLimits_TXT_VC_PropertyProtectionInsuranceDeductible),strStateCoverageLimits_TXT_VC_PropertyProtectionInsuranceDeductible,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_Stackedcoverage(strStateCoverageLimits_CHK_Stackedcoverage),strStateCoverageLimits_CHK_Stackedcoverage,test);
						se.element().selectPopupWithMagnifier(getStateCoverageLimits_TXT_VC_DeductibleCoverage(strStateCoverageLimits_TXT_VC_DeductibleCoverage),getStateCoverageLimits_TXT_VC_DeductibleCoverageSearch(strStateCoverageLimits_TXT_VC_DeductibleCoverage),strStateCoverageLimits_TXT_VC_DeductibleCoverage,strStateCoverageLimits_TXT_VC_DeductibleCoverageFilterNeeded,strStateCoverageLimits_TXT_VC_DeductibleCoverage, constants.NA, constants.NA,constants.NA,test);
						se.element().selectPopupWithMagnifier(getStateCoverageLimits_TXT_ExclusionOfWorkLossBenefits(strStateCoverageLimits_TXT_ExclusionOfWorkLossBenefits),getStateCoverageLimits_TXT_ExclusionOfWorkLossBenefitsSearch(strStateCoverageLimits_TXT_ExclusionOfWorkLossBenefits),strStateCoverageLimits_TXT_ExclusionOfWorkLossBenefits,strStateCoverageLimits_TXT_ExclusionOfWorkLossBenefitsFilterNeeded,strStateCoverageLimits_TXT_ExclusionOfWorkLossBenefits, constants.NA, constants.NA,constants.NA,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_VC_AdditionalPersInjuryProt(strStateCoverageLimits_CHK_VC_AdditionalPersInjuryProt),strStateCoverageLimits_CHK_VC_AdditionalPersInjuryProt,test);
						se.element().selectPopupWithMagnifier(getStateCoverageLimits_TXT_OptionNumber(strStateCoverageLimits_TXT_OptionNumber),getStateCoverageLimits_TXT_OptionNumberSearch(strStateCoverageLimits_TXT_OptionNumber),strStateCoverageLimits_TXT_OptionNumber,strStateCoverageLimits_TXT_OptionNumberFilterNeeded,strStateCoverageLimits_TXT_OptionNumber, constants.NA, constants.NA,constants.NA,test);
						se.element().enterOrValidateText(getStateCoverageLimits_TXT_VC_TotalMedicalExpenses(strStateCoverageLimits_TXT_VC_TotalMedicalExpenses),strStateCoverageLimits_TXT_VC_TotalMedicalExpenses,test);
						se.element().enterOrValidateText(getStateCoverageLimits_TXT_VC_TotalAggregateAmount(strStateCoverageLimits_TXT_VC_TotalAggregateAmount),strStateCoverageLimits_TXT_VC_TotalAggregateAmount,test);
						se.element().enterOrValidateText(getStateCoverageLimits_TXT_TotalWeeklyMaxWorkLoss(strStateCoverageLimits_TXT_TotalWeeklyMaxWorkLoss),strStateCoverageLimits_TXT_TotalWeeklyMaxWorkLoss,test);
						se.element().enterOrValidateText(getStateCoverageLimits_TXT_TotalWeeklyMaxEssServices(strStateCoverageLimits_TXT_TotalWeeklyMaxEssServices),strStateCoverageLimits_TXT_TotalWeeklyMaxEssServices,test);
						se.element().enterOrValidateText(getStateCoverageLimits_TXT_FuneralExpenses(strStateCoverageLimits_TXT_FuneralExpenses),strStateCoverageLimits_TXT_FuneralExpenses,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_VC_Medical_Payments(strStateCoverageLimits_CHK_VC_Medical_Payments),strStateCoverageLimits_CHK_VC_Medical_Payments,test);
						se.element().selectPopupWithMagnifier(getStateCoverageLimits_TXT_VC_LimitEachPerson(strStateCoverageLimits_TXT_VC_LimitEachPerson),getStateCoverageLimits_TXT_VC_LimitEachPersonSearch(strStateCoverageLimits_TXT_VC_LimitEachPerson),strStateCoverageLimits_TXT_VC_LimitEachPerson,strStateCoverageLimits_TXT_VC_LimitEachPersonFilterNeeded,strStateCoverageLimits_TXT_VC_LimitEachPerson, constants.NA, constants.NA,constants.NA,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_Uninsured_Motorist(strStateCoverageLimits_CHK_Uninsured_Motorist),strStateCoverageLimits_CHK_Uninsured_Motorist,test);
						se.element().selectPopupWithMagnifier(getStateCoverageLimits_TXT_UninsuredMotorist_CombinedSingleLimit(strStateCoverageLimits_TXT_UninsuredMotorist_CombinedSingleLimit),getStateCoverageLimits_TXT_UninsuredMotorist_CombinedSingleLimitSearch(strStateCoverageLimits_TXT_UninsuredMotorist_CombinedSingleLimit),strStateCoverageLimits_TXT_UninsuredMotorist_CombinedSingleLimit,strStateCoverageLimits_TXT_UninsuredMotorist_CombinedSingleLimitFilterNeeded,strStateCoverageLimits_TXT_UninsuredMotorist_CombinedSingleLimit, constants.NA, constants.NA,constants.NA,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_VC_IncludePropDamage(strStateCoverageLimits_CHK_VC_IncludePropDamage),strStateCoverageLimits_CHK_VC_IncludePropDamage,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_Uninsured_Motorist_PD(strStateCoverageLimits_CHK_Uninsured_Motorist_PD),strStateCoverageLimits_CHK_Uninsured_Motorist_PD,test);
						se.element().selectPopupWithMagnifier(getStateCoverageLimits_TXT_property_dam_limit(strStateCoverageLimits_TXT_property_dam_limit),getStateCoverageLimits_TXT_property_dam_limitSearch(strStateCoverageLimits_TXT_property_dam_limit),strStateCoverageLimits_TXT_property_dam_limit,strStateCoverageLimits_TXT_property_dam_limitFilterNeeded,strStateCoverageLimits_TXT_property_dam_limit, constants.NA, constants.NA,constants.NA,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_VC_underinsured_motorist(strStateCoverageLimits_CHK_VC_underinsured_motorist),strStateCoverageLimits_CHK_VC_underinsured_motorist,test);
						se.element().selectPopupWithMagnifier(getStateCoverageLimits_TXT_combined_single_limit_underinsured(strStateCoverageLimits_TXT_combined_single_limit_underinsured),getStateCoverageLimits_TXT_combined_single_limit_underinsuredSearch(strStateCoverageLimits_TXT_combined_single_limit_underinsured),strStateCoverageLimits_TXT_combined_single_limit_underinsured,strStateCoverageLimits_TXT_combined_single_limit_underinsuredFilterNeeded,strStateCoverageLimits_TXT_combined_single_limit_underinsured, constants.NA, constants.NA,constants.NA,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_LC_WithoutFullCoveredAutos(strStateCoverageLimits_CHK_LC_WithoutFullCoveredAutos),strStateCoverageLimits_CHK_LC_WithoutFullCoveredAutos,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_FullCoveredAutos(strStateCoverageLimits_CHK_FullCoveredAutos),strStateCoverageLimits_CHK_FullCoveredAutos,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_LC_Liability(strStateCoverageLimits_CHK_LC_Liability),strStateCoverageLimits_CHK_LC_Liability,test);
						se.element().selectPopupWithMagnifier(getStateCoverageLimits_TXT_LC_Combined_Single_Limit(strStateCoverageLimits_TXT_LC_Combined_Single_Limit),getStateCoverageLimits_TXT_LC_Combined_Single_LimitSearch(strStateCoverageLimits_TXT_LC_Combined_Single_Limit),strStateCoverageLimits_TXT_LC_Combined_Single_Limit,strStateCoverageLimits_TXT_LC_Combined_Single_LimitFilterNeeded,strStateCoverageLimits_TXT_LC_Combined_Single_Limit, constants.NA, constants.NA,constants.NA,test);
						se.element().enterOrValidateText(getStateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedAggregateLimit(strStateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedAggregateLimit),strStateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedAggregateLimit,test);
						//se.element().enterOrValidateText(getStateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedOtherAggregateLimit(strStateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedOtherAggregateLimit),strStateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedOtherAggregateLimit,test);
						se.element().selectPopupWithMagnifier(getStateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedOtherAggregateLimit(strStateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedOtherAggregateLimit),getStateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedOtherAggregateLimitSearch(strStateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedOtherAggregateLimit),strStateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedOtherAggregateLimit,strStateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedOtherAggregateLimitFilterNeeded,strStateCoverageLimits_TXT_LC_ProductsAndWorkYouPerformedOtherAggregateLimit, constants.NA, constants.NA,constants.NA,test);
						se.element().enterOrValidateText(getStateCoverageLimits_TXT_LC_GeneralLiabilityAggregateLimit(strStateCoverageLimits_TXT_LC_GeneralLiabilityAggregateLimit),strStateCoverageLimits_TXT_LC_GeneralLiabilityAggregateLimit,test);
						se.element().selectPopupWithMagnifier(getStateCoverageLimits_TXT_LC_GeneralLiabilityOtherAggregateLimit(strStateCoverageLimits_TXT_LC_GeneralLiabilityOtherAggregateLimit),getStateCoverageLimits_TXT_LC_GeneralLiabilityOtherAggregateLimitSearch(strStateCoverageLimits_TXT_LC_GeneralLiabilityOtherAggregateLimit),strStateCoverageLimits_TXT_LC_GeneralLiabilityOtherAggregateLimit,strStateCoverageLimits_TXT_LC_GeneralLiabilityOtherAggregateLimitFilterNeeded,strStateCoverageLimits_TXT_LC_GeneralLiabilityOtherAggregateLimit, constants.NA, constants.NA,constants.NA,test);
						se.element().selectPopupWithMagnifier(getStateCoverageLimits_TXT_LC_Deductible(strStateCoverageLimits_TXT_LC_Deductible),getStateCoverageLimits_TXT_LC_DeductibleSearch(strStateCoverageLimits_TXT_LC_Deductible),strStateCoverageLimits_TXT_LC_Deductible,strStateCoverageLimits_TXT_LC_DeductibleFilterNeeded,strStateCoverageLimits_TXT_LC_Deductible, constants.NA, constants.NA,constants.NA,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_LC_DeductibleType_CombinedSingleLimit(strStateCoverageLimits_CHK_LC_DeductibleType_CombinedSingleLimit),strStateCoverageLimits_CHK_LC_DeductibleType_CombinedSingleLimit,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_LC_DeductibleType_PropertDamPerAccDed(strStateCoverageLimits_CHK_LC_DeductibleType_PropertDamPerAccDed),strStateCoverageLimits_CHK_LC_DeductibleType_PropertDamPerAccDed,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_LC_PersonalInjuryProtection(strStateCoverageLimits_CHK_LC_PersonalInjuryProtection),strStateCoverageLimits_CHK_LC_PersonalInjuryProtection,test);
						se.element().selectPopupWithMagnifier(getStateCoverageLimits_TXT_InsuredCoverageStatus(strStateCoverageLimits_TXT_InsuredCoverageStatus), getStateCoverageLimits_TXT_InsuredCoverageStatusSearch(strStateCoverageLimits_TXT_InsuredCoverageStatus), strStateCoverageLimits_TXT_InsuredCoverageStatus, constants.NA, strStateCoverageLimits_TXT_InsuredCoverageStatus, constants.NA, constants.NA, constants.NA, test);
						se.element().selectPopupWithMagnifier(getStateCoverageLimits_TXT_VC_SpouseResidentReleativeCoverageStatus(strStateCoverageLimits_TXT_VC_SpouseResidentReleativeCoverageStatus), getStateCoverageLimits_TXT_VC_SpouseResidentReleativeCoverageStatusSearch(strStateCoverageLimits_TXT_VC_SpouseResidentReleativeCoverageStatus), strStateCoverageLimits_TXT_VC_SpouseResidentReleativeCoverageStatus, constants.NA, strStateCoverageLimits_TXT_VC_SpouseResidentReleativeCoverageStatus, constants.NA, constants.NA, constants.NA, test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_VC_MedicalExpenseBenefits(strStateCoverageLimits_CHK_VC_MedicalExpenseBenefits),strStateCoverageLimits_CHK_VC_MedicalExpenseBenefits,test);
						se.element().selectPopupWithMagnifier(getStateCoverageLimits_TXT_VC_Limit(strStateCoverageLimits_TXT_VC_Limit), getStateCoverageLimits_TXT_VC_LimitSearch(strStateCoverageLimits_TXT_VC_Limit), strStateCoverageLimits_TXT_VC_Limit, constants.NA, strStateCoverageLimits_TXT_VC_Limit, constants.NA, constants.NA, constants.NA, test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_VC_ExcludeMedicalExpenseBenefits(strStateCoverageLimits_CHK_VC_ExcludeMedicalExpenseBenefits),strStateCoverageLimits_CHK_VC_ExcludeMedicalExpenseBenefits,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_RDO_VC_NumberofHouseholdMembers_All(strStateCoverageLimits_RDO_VC_NumberofHouseholdMembers_All),strStateCoverageLimits_RDO_VC_NumberofHouseholdMembers_All,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_RDO_VC_NumberofHouseholdMembers_Oneormore(strStateCoverageLimits_RDO_VC_NumberofHouseholdMembers_Oneormore),strStateCoverageLimits_RDO_VC_NumberofHouseholdMembers_Oneormore,test);
						se.element().enterOrValidateText(getStateCoverageLimits_TXT_VC_FullNameofEachExcludedPerson(strStateCoverageLimits_TXT_VC_FullNameofEachExcludedPerson),strStateCoverageLimits_TXT_VC_FullNameofEachExcludedPerson,test);
						se.element().enterOrValidateText(getStateCoverageLimits_TXT_VC_DateofBirth(strStateCoverageLimits_TXT_VC_DateofBirth),strStateCoverageLimits_TXT_VC_DateofBirth,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_VC_ExcessAttendantCare(strStateCoverageLimits_CHK_VC_ExcessAttendantCare),strStateCoverageLimits_CHK_VC_ExcessAttendantCare,test);
						se.element().enterOrValidateText(getStateCoverageLimits_TXT_VC_LimitPerPersonAccident(strStateCoverageLimits_TXT_VC_LimitPerPersonAccident),strStateCoverageLimits_TXT_VC_LimitPerPersonAccident,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_LC_AdditionalPersInjuryProt(strStateCoverageLimits_CHK_LC_AdditionalPersInjuryProt),strStateCoverageLimits_CHK_LC_AdditionalPersInjuryProt,test);
						se.element().selectPopupWithMagnifier(getStateCoverageLimits_TXT_LC_OptionNumber(strStateCoverageLimits_TXT_LC_OptionNumber),getStateCoverageLimits_TXT_LC_OptionNumberSearch(strStateCoverageLimits_TXT_LC_OptionNumber),strStateCoverageLimits_TXT_LC_OptionNumber,strStateCoverageLimits_TXT_LC_OptionNumberFilterNeeded,strStateCoverageLimits_TXT_LC_OptionNumber, constants.NA, constants.NA,constants.NA,test);
						se.element().enterOrValidateText(getStateCoverageLimits_TXT_LC_TotalMedicalExpenses(strStateCoverageLimits_TXT_LC_TotalMedicalExpenses),strStateCoverageLimits_TXT_LC_TotalMedicalExpenses,test);
						se.element().enterOrValidateText(getStateCoverageLimits_TXT_LC_TotalAggregateAmount(strStateCoverageLimits_TXT_LC_TotalAggregateAmount),strStateCoverageLimits_TXT_LC_TotalAggregateAmount,test);
						se.element().enterOrValidateText(getStateCoverageLimits_TXT_LC_TotalWeeklyMaxWorkLoss(strStateCoverageLimits_TXT_LC_TotalWeeklyMaxWorkLoss),strStateCoverageLimits_TXT_LC_TotalWeeklyMaxWorkLoss,test);
						se.element().enterOrValidateText(getStateCoverageLimits_TXT_LC_TotalWeeklyMaxEssServices(strStateCoverageLimits_TXT_LC_TotalWeeklyMaxEssServices),strStateCoverageLimits_TXT_LC_TotalWeeklyMaxEssServices,test);
						se.element().selectPopupWithMagnifier(getStateCoverageLimits_TXT_LC_ExcessCoverage(strStateCoverageLimits_TXT_LC_ExcessCoverage),getStateCoverageLimits_TXT_LC_ExcessCoverageSearch(strStateCoverageLimits_TXT_LC_ExcessCoverage),strStateCoverageLimits_TXT_LC_ExcessCoverage,strStateCoverageLimits_TXT_LC_ExcessCoverageFilterNeeded,strStateCoverageLimits_TXT_LC_ExcessCoverage, constants.NA, constants.NA,constants.NA,test);
						se.element().selectPopupWithMagnifier(getStateCoverageLimits_TXT_LC_ExcessCoverage_Deductible(strStateCoverageLimits_TXT_LC_ExcessCoverage_Deductible),getStateCoverageLimits_TXT_LC_ExcessCoverage_DeductibleSearch(strStateCoverageLimits_TXT_LC_ExcessCoverage_Deductible),strStateCoverageLimits_TXT_LC_ExcessCoverage_Deductible,strStateCoverageLimits_TXT_LC_ExcessCoverage_DeductibleFilterNeeded,strStateCoverageLimits_TXT_LC_ExcessCoverage_Deductible, constants.NA, constants.NA,constants.NA,test);
						se.element().selectPopupWithMagnifier(getStateCoverageLimits_TXT_PropertyProtectionInsuranceDeuctible(strStateCoverageLimits_TXT_PropertyProtectionInsuranceDeuctible),getStateCoverageLimits_TXT_PropertyProtectionInsuranceDeuctibleSearch(strStateCoverageLimits_TXT_PropertyProtectionInsuranceDeuctible),strStateCoverageLimits_TXT_PropertyProtectionInsuranceDeuctible,constants.NA,strStateCoverageLimits_TXT_PropertyProtectionInsuranceDeuctible, constants.NA, constants.NA,constants.NA,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_LC_Medical_PaymentsLocAndOpts(strStateCoverageLimits_CHK_LC_Medical_PaymentsLocAndOpts),strStateCoverageLimits_CHK_LC_Medical_PaymentsLocAndOpts,test);
						se.element().selectPopupWithMagnifier(getStateCoverageLimits_TXT_LC_LimitEachPerson(strStateCoverageLimits_TXT_LC_LimitEachPerson),getStateCoverageLimits_TXT_LC_LimitEachPersonSearch(strStateCoverageLimits_TXT_LC_LimitEachPerson),strStateCoverageLimits_TXT_LC_LimitEachPerson,strStateCoverageLimits_TXT_LC_LimitEachPersonFilterNeeded,strStateCoverageLimits_TXT_LC_LimitEachPerson, constants.NA, constants.NA,constants.NA,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_LC_Medical_PaymentsAuto(strStateCoverageLimits_CHK_LC_Medical_PaymentsAuto),strStateCoverageLimits_CHK_LC_Medical_PaymentsAuto,test);
						se.element().selectPopupWithMagnifier(getStateCoverageLimits_TXT_LC_AutoLimitEachPerson(strStateCoverageLimits_TXT_LC_AutoLimitEachPerson),getStateCoverageLimits_TXT_LC_AutoLimitEachPersonSearch(strStateCoverageLimits_TXT_LC_AutoLimitEachPerson),strStateCoverageLimits_TXT_LC_AutoLimitEachPerson,strStateCoverageLimits_TXT_LC_AutoLimitEachPersonFilterNeeded,strStateCoverageLimits_TXT_LC_AutoLimitEachPerson, constants.NA, constants.NA,constants.NA,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_LC_Uninsured_Motorist(strStateCoverageLimits_CHK_LC_Uninsured_Motorist),strStateCoverageLimits_CHK_LC_Uninsured_Motorist,test);
						se.element().selectPopupWithMagnifier(getStateCoverageLimits_TXT_LC_combined_single_limit_Uninsured(strStateCoverageLimits_TXT_LC_combined_single_limit_Uninsured),getStateCoverageLimits_TXT_LC_combined_single_limit_UninsuredSearch(strStateCoverageLimits_TXT_LC_combined_single_limit_Uninsured),strStateCoverageLimits_TXT_LC_combined_single_limit_Uninsured,strStateCoverageLimits_TXT_LC_combined_single_limit_UninsuredFilterNeeded,strStateCoverageLimits_TXT_LC_combined_single_limit_Uninsured, constants.NA, constants.NA,constants.NA,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_LC_underinsured_motorist(strStateCoverageLimits_CHK_LC_underinsured_motorist),strStateCoverageLimits_CHK_LC_underinsured_motorist,test);
						se.element().enterOrValidateText(getStateCoverageLimits_TXT_LC_combined_single_limit_underinsured(strStateCoverageLimits_TXT_LC_combined_single_limit_underinsured),strStateCoverageLimits_TXT_LC_combined_single_limit_underinsured,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_LC_IncludePropertyDamage(strStateCoverageLimits_CHK_LC_IncludePropertyDamage),strStateCoverageLimits_CHK_LC_IncludePropertyDamage,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_LC_FullCoverageNoDeductible_Yes(strStateCoverageLimits_CHK_LC_FullCoverageNoDeductible_Yes),strStateCoverageLimits_CHK_LC_FullCoverageNoDeductible_Yes,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_LC_FullCoverageNoDeductible_No(strStateCoverageLimits_CHK_LC_FullCoverageNoDeductible_No),strStateCoverageLimits_CHK_LC_FullCoverageNoDeductible_No,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_FGC_PrivatePassengerVehicles_Yes(strStateCoverageLimits_CHK_FGC_PrivatePassengerVehicles_Yes),strStateCoverageLimits_CHK_FGC_PrivatePassengerVehicles_Yes,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_FGC_PrivatePassengerVehicles_No(strStateCoverageLimits_CHK_FGC_PrivatePassengerVehicles_No),strStateCoverageLimits_CHK_FGC_PrivatePassengerVehicles_No,test);
						se.element().enterOrValidateText(getStateCoverageLimits_TXT_JurisDesc(strStateCoverageLimits_TXT_JurisDesc),strStateCoverageLimits_TXT_JurisDesc,test);
						se.element().enterOrValidateText(getStateCoverageLimits_TXT_FPDcode(strStateCoverageLimits_TXT_FPDcode),strStateCoverageLimits_TXT_FPDcode,test);
						se.element().enterOrValidateText(getStateCoverageLimits_TXT_Fireprotectiondist(strStateCoverageLimits_TXT_Fireprotectiondist),strStateCoverageLimits_TXT_Fireprotectiondist,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_DoNotApplyCityOrCountyTax(strStateCoverageLimits_CHK_DoNotApplyCityOrCountyTax),strStateCoverageLimits_CHK_DoNotApplyCityOrCountyTax,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_AllCityName(strStateCoverageLimits_CHK_AllCityName),strStateCoverageLimits_CHK_AllCityName,test);
						se.element().enterOrValidateText(getStateCoverageLimits_TXT_City(strStateCoverageLimits_TXT_City),strStateCoverageLimits_TXT_City,test);
						se.element().enterOrValidateText(getStateCoverageLimits_TXT_CityCode(strStateCoverageLimits_TXT_CityCode),strStateCoverageLimits_TXT_CityCode,test);
						se.element().enterOrValidateText(getStateCoverageLimits_TXT_County(strStateCoverageLimits_TXT_County),strStateCoverageLimits_TXT_County,test);
						se.element().enterOrValidateText(getStateCoverageLimits_TXT_CountyCode(strStateCoverageLimits_TXT_CountyCode),strStateCoverageLimits_TXT_CountyCode,test);
						se.element().enterOrValidateText(getStateCoverageLimits_TXT_TaxCode(strStateCoverageLimits_TXT_TaxCode),strStateCoverageLimits_TXT_TaxCode,test);
						se.element().enterOrValidateText(getStateCoverageLimits_TXT_ExcessCoverage(strStateCoverageLimits_TXT_ExcessCoverage),strStateCoverageLimits_TXT_ExcessCoverage,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_PropertyProtectionInsurance(strStateCoverageLimits_CHK_PropertyProtectionInsurance),strStateCoverageLimits_CHK_PropertyProtectionInsurance,test);
						se.element().checkUncheckOrValidate(getStateCoverageLimits_CHK_PropDamLiabilityCov_Buyback(strStateCoverageLimits_CHK_PropDamLiabilityCov_Buyback),strStateCoverageLimits_CHK_PropDamLiabilityCov_Buyback,test);
						se.element().Click(getNext(),test);
						
					}
							
							if(strStateCoverageLimits_BTN_Done.equalsIgnoreCase("Yes")){
								se.element().Click(getDone(),test);
							}
					
						}catch(Exception e){
							se.verify().verifyEquals("Failed to fill in details for CA_StateCoverageLimits ", true, false, true, test);
							
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
