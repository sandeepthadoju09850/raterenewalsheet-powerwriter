package pw.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import pw.Constants.constants;
import pw.OR.OR_CP;

public class CP_CommercialProperty extends OR_CP{
	
public void CommercialPropertyMethod(String strRegressionID, String transaction, ExtentTest test) throws IOException {
	try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase(constants.Commercial_Property)){
			 test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData("Commercial_Property", strRegressionID, transaction);
	int iteration = 0;
	while (iteration < table.size()) {
		LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCommProperty_BTN_Next = (String) row.get("CommProperty_BTN_Next");
		try {
			
			CP_CommercialProperty CommercialProperty =  TestPageFactory.initElements(se, CP_CommercialProperty.class);
			
			CommercialProperty.commercialPropertySection(row,test);
			CommercialProperty.IllinoisFireTax(row,test);
			CommercialProperty.CoverageOptions(row,test);
			CommercialProperty.KYTaxInformation(row,test);
			CommercialProperty.SecuraCoverageOptions(row,test);
			CommercialProperty.OtherConditions(row,test);
			CommercialProperty.SECURAWrapsCompanyRatingPlans(row,test);
			if(strCommProperty_BTN_Next.equalsIgnoreCase("Yes")){
				se.element().Click(getNext(),test);
			}
			
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for Commercial Property page ", true, false, true, test);
			
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
	
	public void commercialPropertySection(Map<String, String> row,ExtentTest test) throws IOException {
		String strCommProperty_TXT_PrimaryState = (String) row.get("CommProperty_TXT_PrimaryState");
		String strCommProperty_TXT_City = (String) row.get("CommProperty_TXT_City");
		String strCommProperty_TXT_Zip = (String) row.get("CommProperty_TXT_Zip");
		String strCommProperty_CHK_BlanketRating = (String) row.get("CommProperty_CHK_BlanketRating");
		String strCommProperty_CHK_MultipleLocAveRating = (String) row.get("CommProperty_CHK_MultipleLocAveRating");
		String strCommProperty_CHK_SpecialClassesOnlyPolicy = (String) row.get("CommProperty_CHK_SpecialClassesOnlyPolicy");
		String strCommProperty_DDN_PropertyHazardGrade = (String) row.get("CommProperty_DDN_PropertyHazardGrade");
		String transaction = (String) row.get("Transaction Name");
		try{
			se.log().logTestStep("CommercialProperty");
			test.log(LogStatus.INFO, "CommercialProperty page","Transaction Step : "+ transaction + "<br>" +"Page : CP_CommercialProperty" + "<br>" +"Section : CommercialProperty");
			se.verify().verifyEquals("Commercial Property Page of PowerWriter ", getCommProperty_TXT_LabelName().isDisplayed(),true, true,test);
			
			//Commercial Property Section:
		
			se.element().enterOrValidateText(getCommProperty_TXT_PrimaryState(strCommProperty_TXT_PrimaryState),strCommProperty_TXT_PrimaryState,test);
			se.element().enterOrValidateText(getCommProperty_TXT_City(strCommProperty_TXT_City),strCommProperty_TXT_City,test);
			se.element().selectPopupWithMagnifier(getCommProperty_TXT_Zip(strCommProperty_TXT_Zip), getCommProperty_TXT_Zip_search(strCommProperty_TXT_Zip), strCommProperty_TXT_City, constants.NA, strCommProperty_TXT_City, constants.NA, constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_BlanketRating(strCommProperty_CHK_BlanketRating),strCommProperty_CHK_BlanketRating,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_MultipleLocAveRating(strCommProperty_CHK_MultipleLocAveRating),strCommProperty_CHK_MultipleLocAveRating,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_SpecialClassesOnlyPolicy(strCommProperty_CHK_SpecialClassesOnlyPolicy),strCommProperty_CHK_SpecialClassesOnlyPolicy,test);
			se.element().selectElementDDrOrValidateText(getCommProperty_DDN_PropertyHazardGrade(strCommProperty_DDN_PropertyHazardGrade),strCommProperty_DDN_PropertyHazardGrade,test);
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CP_CommercialProperty", true, false, true, test);
					
		}
	}
	
	public void CoverageOptions(Map<String, String> row, ExtentTest test) throws IOException {
		String strCommProperty_CHK_BusinessIncomeALS = (String) row.get("CommProperty_CHK_BusinessIncomeALS");
		String strCommProperty_TXT_NumberofMonths = (String) row.get("CommProperty_TXT_NumberofMonths");
		String strCommProperty_CHK_FloodCoverage = (String) row.get("CommProperty_CHK_FloodCoverage");
		String strCommProperty_CHK_PollutantCleanupandRem = (String) row.get("CommProperty_CHK_PollutantCleanupandRem");
		String strCommProperty_CHK_ElectronicCommerceEndorsement = (String) row.get("CommProperty_CHK_ElectronicCommerceEndorsement");
		String strCommProperty_CHK_FungusWetRotDryRotBacertiaInc = (String) row.get("CommProperty_CHK_FungusWetRotDryRotBacertiaInc");
		String strCommProperty_CHK_TerrorismCertifiedActsCov = (String) row.get("CommProperty_CHK_TerrorismCertifiedActsCov");
		String strCommProperty_CHK_MiscellaneousCoverage = (String) row.get("CommProperty_CHK_MiscellaneousCoverage");
		String strCommProperty_CHK_PollutionExclusionPrecludeCovg = (String) row.get("CommProperty_CHK_PollutionExclusionPrecludeCovg");
		String strCommProperty_CHK_SECURAManuscript = (String) row.get("CommProperty_CHK_SECURAManuscript");
		String transaction = (String) row.get("Transaction Name");
		try{
			se.log().logTestStep("CommercialProperty");
			test.log(LogStatus.INFO, "CommercialProperty page","Transaction Step : "+ transaction + "<br>" +"Page : CP_CommercialProperty" + "<br>" +"Section : CoverageOptions");
			se.verify().verifyEquals("Commercial Property Page of PowerWriter ", getPagecontainingtext("Commercial Property").isDisplayed(),true, true,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_BusinessIncomeALS(strCommProperty_CHK_BusinessIncomeALS),strCommProperty_CHK_BusinessIncomeALS,test);
			se.element().enterOrValidateText(getCommProperty_TXT_NumberofMonths(strCommProperty_TXT_NumberofMonths),strCommProperty_TXT_NumberofMonths,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_FloodCoverage(strCommProperty_CHK_FloodCoverage),strCommProperty_CHK_FloodCoverage,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_PollutantCleanupandRem(strCommProperty_CHK_PollutantCleanupandRem),strCommProperty_CHK_PollutantCleanupandRem,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_ElectronicCommerceEndorsement(strCommProperty_CHK_ElectronicCommerceEndorsement),strCommProperty_CHK_ElectronicCommerceEndorsement,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_FungusWetRotDryRotBacertiaInc(strCommProperty_CHK_FungusWetRotDryRotBacertiaInc),strCommProperty_CHK_FungusWetRotDryRotBacertiaInc,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_TerrorismCertifiedActsCov(strCommProperty_CHK_TerrorismCertifiedActsCov),strCommProperty_CHK_TerrorismCertifiedActsCov,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_MiscellaneousCoverage(strCommProperty_CHK_MiscellaneousCoverage),strCommProperty_CHK_MiscellaneousCoverage,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_PollutionExclusionPrecludeCovg(strCommProperty_CHK_PollutionExclusionPrecludeCovg),strCommProperty_CHK_PollutionExclusionPrecludeCovg,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_SECURAManuscript(strCommProperty_CHK_SECURAManuscript),strCommProperty_CHK_SECURAManuscript,test);
			
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CP_CommercialProperty", true, false, true, test);
					
		}
	}
	
	public void KYTaxInformation(Map<String, String> row, ExtentTest test) throws IOException {
		String strCommProperty_CHK_KY_DoNotApplyCityorcountyTaxes = (String) row.get("CommProperty_CHK_KY_DoNotApplyCityorcountyTaxes");
		String strCommProperty_CHK_KY_AllCityName = (String) row.get("CommProperty_CHK_KY_AllCityName");
		String strCommProperty_TXT_KY_City = (String) row.get("CommProperty_TXT_KY_City");
		String strCommProperty_TXT_KY_CityCode = (String) row.get("CommProperty_TXT_KY_CityCode");
		String strCommProperty_CHK_KY_AllCountyName = (String) row.get("CommProperty_CHK_KY_AllCountyName");
		String strCommProperty_TXT_KY_County = (String) row.get("CommProperty_TXT_KY_County");
		String strCommProperty_TXT_KY_CountyCode = (String) row.get("CommProperty_TXT_KY_CountyCode");
		String strCommProperty_TXT_KY_TaxCode = (String) row.get("CommProperty_TXT_KY_TaxCode");
		String transaction = (String) row.get("Transaction Name");
		try{
			se.log().logTestStep("CommercialProperty");
			test.log(LogStatus.INFO, "CommercialProperty page","Transaction Step : "+ transaction + "<br>" +"Page : CP_CommercialProperty" + "<br>" +"Section : CoverageOptions");
			se.verify().verifyEquals("Commercial Property Page of PowerWriter ", getPagecontainingtext("Commercial Property").isDisplayed(),true, true,test);
			
			se.element().checkUncheckOrValidate(getCommProperty_CHK_KY_DoNotApplyCityorcountyTaxes(strCommProperty_CHK_KY_DoNotApplyCityorcountyTaxes),strCommProperty_CHK_KY_DoNotApplyCityorcountyTaxes,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_KY_AllCityName(strCommProperty_CHK_KY_AllCityName),strCommProperty_CHK_KY_AllCityName,test);
			se.element().enterOrValidateText(getCommProperty_TXT_KY_City(strCommProperty_TXT_KY_City),strCommProperty_TXT_KY_City,test);
			se.element().enterOrValidateText(getCommProperty_TXT_KY_CityCode(strCommProperty_TXT_KY_CityCode),strCommProperty_TXT_KY_CityCode,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_KY_AllCountyName(strCommProperty_CHK_KY_AllCountyName),strCommProperty_CHK_KY_AllCountyName,test);
			se.element().enterOrValidateText(getCommProperty_TXT_KY_County(strCommProperty_TXT_KY_County),strCommProperty_TXT_KY_County,test);
			se.element().enterOrValidateText(getCommProperty_TXT_KY_CountyCode(strCommProperty_TXT_KY_CountyCode),strCommProperty_TXT_KY_CountyCode,test);
			se.element().enterOrValidateText(getCommProperty_TXT_KY_TaxCode(strCommProperty_TXT_KY_TaxCode),strCommProperty_TXT_KY_TaxCode,test);
			
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CP_CommercialProperty", true, false, true, test);
					
		}
	}
	
	public void SecuraCoverageOptions(Map<String, String> row, ExtentTest test) throws IOException {
		String strCommProperty_CHK_BeverageManufacturingCoverage = (String) row.get("CommProperty_CHK_BeverageManufacturingCoverage");
		String strCommProperty_CHK_TankLeakage = (String) row.get("CommProperty_CHK_TankLeakage");
		String strCommProperty_TXT_TankLeakageLimit = (String) row.get("CommProperty_TXT_TankLeakageLimit");
		String strCommProperty_CHK_ProductContamination = (String) row.get("CommProperty_CHK_ProductContamination");
		String strCommProperty_TXT_ProductContaminationLimit = (String) row.get("CommProperty_TXT_ProductContaminationLimit");
		String strCommProperty_CHK_WaterBackupandSumpOverflow = (String) row.get("CommProperty_CHK_WaterBackupandSumpOverflow");
		String strCommProperty_TXT_Waterbkppremlmttype = (String) row.get("CommProperty_TXT_Waterbkppremlmttype");
		String strCommProperty_TXT_Waterbkppremdamlmt = (String) row.get("CommProperty_TXT_Waterbkppremdamlmt");
		String strCommProperty_TXT_Waterbkpbsnsintrlmt = (String) row.get("CommProperty_TXT_Waterbkpbsnsintrlmt");
		String strCommProperty_CHK_FoodContamination = (String) row.get("CommProperty_CHK_FoodContamination");
		String strCommProperty_TXT_FoodContmlmt = (String) row.get("CommProperty_TXT_FoodContmlmt");
		String strCommProperty_TXT_FoodContmAddlEexpLlmt = (String) row.get("CommProperty_TXT_FoodContmAddlEexpLlmt");
		String strCommProperty_CHK_DataCompromise = (String) row.get("CommProperty_CHK_DataCompromise");
		String strCommProperty_TXT_DataCompromiseLimit = (String) row.get("CommProperty_TXT_DataCompromiseLimit");
		String strCommProperty_CHK_DomesticAnimalBailee = (String) row.get("CommProperty_CHK_DomesticAnimalBailee");
		String strCommProperty_TXT_DomAnimBaiPerOccLimit = (String) row.get("CommProperty_TXT_DomAnimBaiPerOccLimit");
		String strCommProperty_TXT_DomAnimBaiPerAnimalMaxLimit = (String) row.get("CommProperty_TXT_DomAnimBaiPerAnimalMaxLimit");
		String strCommProperty_TXT_DomAnimBaiDeductible = (String) row.get("CommProperty_TXT_DomAnimBaiDeductible");
		String strCommProperty_CHK_KeyEmployeeReplacementExpense = (String) row.get("CommProperty_CHK_KeyEmployeeReplacementExpense");
		String strCommProperty_CHK_HepatitisACoverage = (String) row.get("CommProperty_CHK_HepatitisACoverage");
		String strCommProperty_TXT_HepMaxPeriodofIndemnity = (String) row.get("CommProperty_TXT_HepMaxPeriodofIndemnity");
		String strCommProperty_TXT_HepLimitofInsurance = (String) row.get("CommProperty_TXT_HepLimitofInsurance");
		String strCommProperty_CHK_eq_brkdwn_wrap = (String) row.get("CommProperty_CHK_eq_brkdwn_wrap");
		String strCommProperty_CHK_Company_Rated = (String) row.get("CommProperty_CHK_Company_Rated");
		String strCommProperty_CHK_Referral_Rating = (String) row.get("CommProperty_CHK_Referral_Rating");
		String strCommProperty_CHK_EquipBreakdownWrap = (String) row.get("CommProperty_CHK_EquipBreakdownWrap");
		String strCommProperty_CHK_EquipBreakdownOptionCompRated = (String) row.get("CommProperty_CHK_EquipBreakdownOptionCompRated");
		String strCommProperty_CHK_EquipBreakdownOptionReffRated = (String) row.get("CommProperty_CHK_EquipBreakdownOptionReffRated");
		String strCommProperty_TXT_EquipBreakdown_Comp_Deductible = (String) row.get("CommProperty_TXT_EquipBreakdown_Comp_Deductible");
		String strCommProperty_TXT_EquipBreakdown_Comp_SpoilDed = (String) row.get("CommProperty_TXT_EquipBreakdown_Comp_SpoilDed");
		String strCommProperty_CHK_TreesExpandedCausesofLoss = (String) row.get("CommProperty_CHK_TreesExpandedCausesofLoss");
		String strCommProperty_TXT_TreesExpandedCausesofLossLimit = (String) row.get("CommProperty_TXT_TreesExpandedCausesofLossLimit");
		String strCommProperty_CHK_TreesShrubsandPlantsDebrisRemoval = (String) row.get("CommProperty_CHK_TreesShrubsandPlantsDebrisRemoval");
		String strCommProperty_TXT_EqipBreakdown_Reff_HSBQuoteNumber = (String) row.get("CommProperty_TXT_EqipBreakdown_Reff_HSBQuoteNumber");
		String strCommProperty_TXT_EquipBreakdown_Reff_AnnualPremium = (String) row.get("CommProperty_TXT_EquipBreakdown_Reff_AnnualPremium");
		String strCommProperty_CHK_EquipBrakdown_Reff_Coverages = (String) row.get("CommProperty_CHK_EquipBrakdown_Reff_Coverages");
		String strCommProperty_TXT_EqipBreakdown_Reff_ExpeditingExpense = (String) row.get("CommProperty_TXT_EqipBreakdown_Reff_ExpeditingExpense");
		String strCommProperty_TXT_EqipBreakdown_Reff_HazardSubstance = (String) row.get("CommProperty_TXT_EqipBreakdown_Reff_HazardSubstance");
		String strCommProperty_CHK_EquipBrakdown_Reff_DedCombAllCov = (String) row.get("CommProperty_CHK_EquipBrakdown_Reff_DedCombAllCov");
		String strCommProperty_TXT_EqipBreakdown_Reff_DedComb_DedAmount = (String) row.get("CommProperty_TXT_EqipBreakdown_Reff_DedComb_DedAmount");
		String strCommProperty_CHK_EquipBrakdown_Reff_DedDirectCov = (String) row.get("CommProperty_CHK_EquipBrakdown_Reff_DedDirectCov");
		String strCommProperty_TXT_EqipBreakdown_Reff_DedDir_DedAmount = (String) row.get("CommProperty_TXT_EqipBreakdown_Reff_DedDir_DedAmount");
		String strCommProperty_CHK_EquipBrakdown_Reff_DirectExcept = (String) row.get("CommProperty_CHK_EquipBrakdown_Reff_DirectExcept");
		String strCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_DedType = (String) row.get("CommProperty_TXT_EqipBreakdown_Reff_DirectExcept_DedType");
		String strCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Deductible = (String) row.get("CommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Deductible");
		String strCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_PerHP$ = (String) row.get("CommProperty_TXT_EqipBreakdown_Reff_DirectExcept_PerHP$");
		String strCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Min$ = (String) row.get("CommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Min$");
		String strCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Description = (String) row.get("CommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Description");
		String strCommProperty_TXT_EqipBreakdown_Reff_IndirectDamage = (String) row.get("CommProperty_TXT_EqipBreakdown_Reff_IndirectDamage");
		String strCommProperty_TXT_EqipBreakdown_Reff_IndirectDamageHours = (String) row.get("CommProperty_TXT_EqipBreakdown_Reff_IndirectDamageHours");
		String strCommProperty_TXT_EqipBreakdown_Reff_IndirectDamageValue = (String) row.get("CommProperty_TXT_EqipBreakdown_Reff_IndirectDamageValue");
		String strCommProperty_CHK_EquipBrakdown_Reff_IndirectExcept = (String) row.get("CommProperty_CHK_EquipBrakdown_Reff_IndirectExcept");
		String strCommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_DedType = (String) row.get("CommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_DedType");
		String strCommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Deductible = (String) row.get("CommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Deductible");
		String strCommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Hours = (String) row.get("CommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Hours");
		String strCommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Time = (String) row.get("CommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Time");
		String strCommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Description = (String) row.get("CommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Description");
		String strCommProperty_CHK_EqipBreakdown_Reff_DeductibleSpoilage = (String) row.get("CommProperty_CHK_EqipBreakdown_Reff_DeductibleSpoilage");
		String strCommProperty_CHK_EqipBreakdown_Reff_SpoilOption_Deductible = (String) row.get("CommProperty_CHK_EqipBreakdown_Reff_SpoilOption_Deductible");
		String strCommProperty_CHK_EqipBreakdown_Reff_SpoilOption_percentageLoss = (String) row.get("CommProperty_CHK_EqipBreakdown_Reff_SpoilOption_%Loss");
		String strCommProperty_TXT_EqipBreakdown_Reff_SpoilOption_Deductible_Ded = (String) row.get("CommProperty_TXT_EqipBreakdown_Reff_SpoilOption_Deductible_Ded");
		String strCommProperty_TXT_EqipBreakdown_Reff_SpoilOption_percentageLoss_percentageofloss = (String) row.get("CommProperty_TXT_EqipBreakdown_Reff_SpoilOption_%Loss_%ofloss");
		String strCommProperty_TXT_EqipBreakdown_Reff_SpoilOption_percentageLoss_Min$ = (String) row.get("CommProperty_TXT_EqipBreakdown_Reff_SpoilOption_%Loss_Min$");
		String transaction = (String) row.get("Transaction Name");
		
		try{
			se.log().logTestStep("CommercialProperty");
			test.log(LogStatus.INFO, "CommercialProperty page","Transaction Step : "+ transaction + "<br>" +"Page : CP_CommercialProperty" + "<br>" +"Section : SecuraCoverageOptions");
			se.verify().verifyEquals("Commercial Property Page of PowerWriter ", getPagecontainingtext("Commercial Property").isDisplayed(),true, true,test);
			
			se.element().checkUncheckOrValidate(getCommProperty_CHK_BeverageManufacturingCoverage(strCommProperty_CHK_BeverageManufacturingCoverage),strCommProperty_CHK_BeverageManufacturingCoverage,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_TankLeakage(strCommProperty_CHK_TankLeakage),strCommProperty_CHK_TankLeakage,test);
			se.element().selectPopupWithMagnifier(getCommProperty_TXT_TankLeakageLimit(strCommProperty_TXT_TankLeakageLimit), getCommProperty_TXT_TankLeakageLimit_search(strCommProperty_TXT_TankLeakageLimit), strCommProperty_TXT_TankLeakageLimit, constants.NA, strCommProperty_TXT_TankLeakageLimit, constants.NA, constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_ProductContamination(strCommProperty_CHK_ProductContamination),strCommProperty_CHK_ProductContamination,test);
			se.element().selectPopupWithMagnifier(getCommProperty_TXT_ProductContaminationLimit(strCommProperty_TXT_ProductContaminationLimit), getCommProperty_TXT_ProductContaminationLimit_search(strCommProperty_TXT_ProductContaminationLimit), strCommProperty_TXT_ProductContaminationLimit, constants.NA, strCommProperty_TXT_ProductContaminationLimit, constants.NA, constants.NA, constants.NA, test);
		
			se.element().checkUncheckOrValidate(getCommProperty_CHK_WaterBackupandSumpOverflow(strCommProperty_CHK_WaterBackupandSumpOverflow),strCommProperty_CHK_WaterBackupandSumpOverflow,test);
			/*if(!strCommProperty_TXT_Waterbkppremlmttype.equalsIgnoreCase("N/A") && !strCommProperty_TXT_Waterbkppremlmttype.contains("validate2")){
				se.element().clickSearchIcon(getCommProperty_BTN_Waterbkppremlmttype(), test);
				se.element().Click(getCommProperty_LNK_Waterbkppremlmttype(strCommProperty_TXT_Waterbkppremlmttype), test);
			}else{
			se.element().enterOrValidateText(getCommProperty_TXT_Waterbkppremlmttype(strCommProperty_TXT_Waterbkppremlmttype),strCommProperty_TXT_Waterbkppremlmttype,test);
			}*/
			se.element().selectPopupWithMagnifier(getCommProperty_TXT_Waterbkppremlmttype(strCommProperty_TXT_Waterbkppremlmttype), getCommProperty_BTN_Waterbkppremlmttype(strCommProperty_TXT_Waterbkppremlmttype), strCommProperty_TXT_Waterbkppremlmttype, constants.NA, strCommProperty_TXT_Waterbkppremlmttype, constants.NA, constants.NA, constants.NA, test);
			/*if(!strCommProperty_TXT_Waterbkppremdamlmt.equalsIgnoreCase("N/A") && !strCommProperty_TXT_Waterbkppremdamlmt.contains("validate2")){
				se.element().clickSearchIcon(getCommProperty_BTN_Waterbkppremdamlmt(), test);
				se.element().Click(getCommProperty_LNK_Waterbkppremdamlmt(strCommProperty_TXT_Waterbkppremdamlmt), test);
			}else{
			se.element().enterOrValidateText(getCommProperty_TXT_Waterbkppremdamlmt(strCommProperty_TXT_Waterbkppremdamlmt),strCommProperty_TXT_Waterbkppremdamlmt,test);
			}*/
			se.element().selectPopupWithMagnifier(getCommProperty_TXT_Waterbkppremdamlmt(strCommProperty_TXT_Waterbkppremdamlmt), getCommProperty_BTN_Waterbkppremdamlmt(strCommProperty_TXT_Waterbkppremdamlmt), strCommProperty_TXT_Waterbkppremdamlmt, constants.NA, strCommProperty_TXT_Waterbkppremdamlmt, constants.NA, constants.NA, constants.NA, test);
			/*if(!strCommProperty_TXT_Waterbkpbsnsintrlmt.equalsIgnoreCase("N/A") && !strCommProperty_TXT_Waterbkpbsnsintrlmt.contains("validate2")){
				se.element().clickSearchIcon(getCommProperty_BTN_Waterbkpbsnsintrlmt(), test);
				se.element().Click(getCommProperty_LNK_Waterbkpbsnsintrlmt(strCommProperty_TXT_Waterbkpbsnsintrlmt), test);
			}else{
			se.element().enterOrValidateText(getCommProperty_TXT_Waterbkpbsnsintrlmt(strCommProperty_TXT_Waterbkpbsnsintrlmt),strCommProperty_TXT_Waterbkpbsnsintrlmt,test);
			}*/
			se.element().selectPopupWithMagnifier(getCommProperty_TXT_Waterbkpbsnsintrlmt(strCommProperty_TXT_Waterbkpbsnsintrlmt), getCommProperty_BTN_Waterbkpbsnsintrlmt(strCommProperty_TXT_Waterbkpbsnsintrlmt), strCommProperty_TXT_Waterbkpbsnsintrlmt, constants.NA, strCommProperty_TXT_Waterbkpbsnsintrlmt, constants.NA, constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_FoodContamination(strCommProperty_CHK_FoodContamination),strCommProperty_CHK_FoodContamination,test);
			se.element().enterOrValidateText(getCommProperty_TXT_FoodContmlmt(strCommProperty_TXT_FoodContmlmt),strCommProperty_TXT_FoodContmlmt,test);
			se.element().enterOrValidateText(getCommProperty_TXT_FoodContmAddlEexpLlmt(strCommProperty_TXT_FoodContmAddlEexpLlmt),strCommProperty_TXT_FoodContmAddlEexpLlmt,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_DataCompromise(strCommProperty_CHK_DataCompromise),strCommProperty_CHK_DataCompromise,test);
			/*if(!strCommProperty_TXT_DataCompromiseLimit.equalsIgnoreCase("N/A") && !strCommProperty_TXT_DataCompromiseLimit.contains("validate2")){
				se.element().clickSearchIcon(getCommProperty_BTN_DataCompromiseLimit(), test);
				se.element().Click(getCommProperty_LNK_DataCompromiseLimit(strCommProperty_TXT_DataCompromiseLimit), test);
			}else{
			se.element().enterOrValidateText(getCommProperty_TXT_DataCompromiseLimit(strCommProperty_TXT_DataCompromiseLimit),strCommProperty_TXT_DataCompromiseLimit,test);
			}*/
			se.element().selectPopupWithMagnifier(getCommProperty_TXT_DataCompromiseLimit(strCommProperty_TXT_DataCompromiseLimit), getCommProperty_BTN_DataCompromiseLimit(strCommProperty_TXT_DataCompromiseLimit), strCommProperty_TXT_DataCompromiseLimit, constants.NA, strCommProperty_TXT_DataCompromiseLimit, constants.NA, constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_DomesticAnimalBailee(strCommProperty_CHK_DomesticAnimalBailee),strCommProperty_CHK_DomesticAnimalBailee,test);
			/*if(!strCommProperty_TXT_DomAnimBaiPerOccLimit.equalsIgnoreCase("N/A") && !strCommProperty_TXT_DomAnimBaiPerOccLimit.contains("validate2")){
				se.element().clickSearchIcon(getCommProperty_BTN_DomAnimBaiPerOccLimit(), test);
				
				se.util().sleep(2000);
				se.element().enterOrValidateText(getCommProperty_TXT_DomAnimBaiPerOccLimitPopUPSearch(strCommProperty_TXT_DomAnimBaiPerOccLimit),strCommProperty_TXT_DomAnimBaiPerOccLimit,test);
				se.element().Click(getPopupBTNSearchIcon(), test);
				se.element().Click(getCommProperty_LNK_DomAnimBaiPerOccLimit(strCommProperty_TXT_DomAnimBaiPerOccLimit), test);
			}else{
			se.element().enterOrValidateText(getCommProperty_TXT_DomAnimBaiPerOccLimit(strCommProperty_TXT_DomAnimBaiPerOccLimit),strCommProperty_TXT_DomAnimBaiPerOccLimit,test);
			}*/
			se.element().selectPopupWithMagnifier(getCommProperty_TXT_DomAnimBaiPerOccLimit(strCommProperty_TXT_DomAnimBaiPerOccLimit), getCommProperty_BTN_DomAnimBaiPerOccLimit(strCommProperty_TXT_DomAnimBaiPerOccLimit), strCommProperty_TXT_DomAnimBaiPerOccLimit, "Yes", strCommProperty_TXT_DomAnimBaiPerOccLimit, constants.NA, constants.NA, constants.NA, test);
			/*if(!strCommProperty_TXT_DomAnimBaiPerAnimalMaxLimit.equalsIgnoreCase("N/A") && !strCommProperty_TXT_DomAnimBaiPerAnimalMaxLimit.contains("validate2")){
				se.element().clickSearchIcon(getCommProperty_BTN_DomAnimBaiPerAnimalMaxLimit(), test);
				se.element().Click(getCommProperty_LNK_DomAnimBaiPerAnimalMaxLimit(strCommProperty_TXT_DomAnimBaiPerAnimalMaxLimit), test);
			}else{
			se.element().enterOrValidateText(getCommProperty_TXT_DomAnimBaiPerAnimalMaxLimit(strCommProperty_TXT_DomAnimBaiPerAnimalMaxLimit),strCommProperty_TXT_DomAnimBaiPerAnimalMaxLimit,test);
			}*/
			se.element().selectPopupWithMagnifier(getCommProperty_TXT_DomAnimBaiPerAnimalMaxLimit(strCommProperty_TXT_DomAnimBaiPerAnimalMaxLimit), getCommProperty_BTN_DomAnimBaiPerAnimalMaxLimit(strCommProperty_TXT_DomAnimBaiPerAnimalMaxLimit), strCommProperty_TXT_DomAnimBaiPerAnimalMaxLimit, constants.NA, strCommProperty_TXT_DomAnimBaiPerAnimalMaxLimit, constants.NA, constants.NA, constants.NA, test);
			/*if(!strCommProperty_TXT_DomAnimBaiDeductible.equalsIgnoreCase("N/A") && !strCommProperty_TXT_DomAnimBaiDeductible.contains("validate2")){
				se.element().clickSearchIcon(getCommProperty_BTN_DomAnimBaiDeductible(), test);
				se.element().Click(getCommProperty_LNK_DomAnimBaiDeductible(strCommProperty_TXT_DomAnimBaiDeductible), test);
			}else{
			se.element().enterOrValidateText(getCommProperty_TXT_DomAnimBaiDeductible(strCommProperty_TXT_DomAnimBaiDeductible),strCommProperty_TXT_DomAnimBaiDeductible,test);
			}*/
			se.element().selectPopupWithMagnifier(getCommProperty_TXT_DomAnimBaiDeductible(strCommProperty_TXT_DomAnimBaiDeductible), getCommProperty_BTN_DomAnimBaiDeductible(strCommProperty_TXT_DomAnimBaiDeductible), strCommProperty_TXT_DomAnimBaiDeductible, constants.NA, strCommProperty_TXT_DomAnimBaiDeductible, constants.NA, constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_KeyEmployeeReplacementExpense(strCommProperty_CHK_KeyEmployeeReplacementExpense),strCommProperty_CHK_KeyEmployeeReplacementExpense,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_HepatitisACoverage(strCommProperty_CHK_HepatitisACoverage),strCommProperty_CHK_HepatitisACoverage,test);
			/*if(!strCommProperty_TXT_HepMaxPeriodofIndemnity.equalsIgnoreCase("N/A") && !strCommProperty_TXT_HepMaxPeriodofIndemnity.contains("validate2")){
				se.element().clickSearchIcon(getCommProperty_BTN_HepMaxPeriodofIndemnity(), test);
				se.element().Click(getCommProperty_LNK_HepMaxPeriodofIndemnity(strCommProperty_TXT_HepMaxPeriodofIndemnity), test);
			}else{
			se.element().enterOrValidateText(getCommProperty_TXT_HepMaxPeriodofIndemnity(strCommProperty_TXT_HepMaxPeriodofIndemnity),strCommProperty_TXT_HepMaxPeriodofIndemnity,test);
			}*/
			se.element().selectPopupWithMagnifier(getCommProperty_TXT_HepMaxPeriodofIndemnity(strCommProperty_TXT_HepMaxPeriodofIndemnity), getCommProperty_BTN_HepMaxPeriodofIndemnity(strCommProperty_TXT_HepMaxPeriodofIndemnity), strCommProperty_TXT_HepMaxPeriodofIndemnity, constants.NA, strCommProperty_TXT_HepMaxPeriodofIndemnity, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCommProperty_TXT_HepLimitofInsurance(strCommProperty_TXT_HepLimitofInsurance),strCommProperty_TXT_HepLimitofInsurance,test);
			//10/8/21 sheetal commented below field as its a duplicate of line 304
			//se.element().checkUncheckOrValidate(getCommProperty_CHK_eq_brkdwn_wrap(strCommProperty_CHK_eq_brkdwn_wrap),strCommProperty_CHK_eq_brkdwn_wrap,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_Company_Rated(strCommProperty_CHK_Company_Rated),strCommProperty_CHK_Company_Rated,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_Referral_Rating(strCommProperty_CHK_Referral_Rating),strCommProperty_CHK_Referral_Rating,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_EquipBreakdownWrap(strCommProperty_CHK_EquipBreakdownWrap),strCommProperty_CHK_EquipBreakdownWrap,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_EquipBreakdownOptionCompRated(strCommProperty_CHK_EquipBreakdownOptionCompRated),strCommProperty_CHK_EquipBreakdownOptionCompRated,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_EquipBreakdownOptionReffRated(strCommProperty_CHK_EquipBreakdownOptionReffRated),strCommProperty_CHK_EquipBreakdownOptionReffRated,test);
			/*if(!strCommProperty_TXT_EquipBreakdown_Comp_Deductible.equalsIgnoreCase("N/A") && !strCommProperty_TXT_EquipBreakdown_Comp_Deductible.contains("validate2")){
				se.element().clickSearchIcon(getCommProperty_BTN_EquipBreakdown_Comp_Deductible(), test);
				se.element().Click(getCommProperty_LNK_EquipBreakdown_Comp_Deductible(strCommProperty_TXT_EquipBreakdown_Comp_Deductible), test);
			}else{
			se.element().enterOrValidateText(getCommProperty_TXT_EquipBreakdown_Comp_Deductible(strCommProperty_TXT_EquipBreakdown_Comp_Deductible),strCommProperty_TXT_EquipBreakdown_Comp_Deductible,test);
			}*/
			se.element().selectPopupWithMagnifier(getCommProperty_TXT_EquipBreakdown_Comp_Deductible(strCommProperty_TXT_EquipBreakdown_Comp_Deductible), getCommProperty_BTN_EquipBreakdown_Comp_Deductible(strCommProperty_TXT_EquipBreakdown_Comp_Deductible), strCommProperty_TXT_EquipBreakdown_Comp_Deductible, constants.NA, strCommProperty_TXT_EquipBreakdown_Comp_Deductible, constants.NA, constants.NA, constants.NA, test);
			/*if(!strCommProperty_TXT_EquipBreakdown_Comp_SpoilDed.equalsIgnoreCase("N/A") && !strCommProperty_TXT_EquipBreakdown_Comp_SpoilDed.contains("validate2")){
				se.element().clickSearchIcon(getCommProperty_BTN_EquipBreakdown_Comp_SpoilDed(), test);
				se.element().Click(getCommProperty_LNK_EquipBreakdown_Comp_SpoilDed(strCommProperty_TXT_EquipBreakdown_Comp_SpoilDed), test);
			}else{
			se.element().enterOrValidateText(getCommProperty_TXT_EquipBreakdown_Comp_SpoilDed(strCommProperty_TXT_EquipBreakdown_Comp_SpoilDed),strCommProperty_TXT_EquipBreakdown_Comp_SpoilDed,test);
			}*/
			se.element().selectPopupWithMagnifier(getCommProperty_TXT_EquipBreakdown_Comp_SpoilDed(strCommProperty_TXT_EquipBreakdown_Comp_SpoilDed), getCommProperty_BTN_EquipBreakdown_Comp_SpoilDed(strCommProperty_TXT_EquipBreakdown_Comp_SpoilDed), strCommProperty_TXT_EquipBreakdown_Comp_SpoilDed, constants.NA, strCommProperty_TXT_EquipBreakdown_Comp_SpoilDed, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCommProperty_TXT_EqipBreakdown_Reff_HSBQuoteNumber(strCommProperty_TXT_EqipBreakdown_Reff_HSBQuoteNumber),strCommProperty_TXT_EqipBreakdown_Reff_HSBQuoteNumber,test);
			se.element().enterOrValidateText(getCommProperty_TXT_EquipBreakdown_Reff_AnnualPremium(strCommProperty_TXT_EquipBreakdown_Reff_AnnualPremium),strCommProperty_TXT_EquipBreakdown_Reff_AnnualPremium,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_EquipBrakdown_Reff_Coverages(strCommProperty_CHK_EquipBrakdown_Reff_Coverages),strCommProperty_CHK_EquipBrakdown_Reff_Coverages,test);
			se.element().enterOrValidateText(getCommProperty_TXT_EqipBreakdown_Reff_ExpeditingExpense(strCommProperty_TXT_EqipBreakdown_Reff_ExpeditingExpense),strCommProperty_TXT_EqipBreakdown_Reff_ExpeditingExpense,test);
			se.element().enterOrValidateText(getCommProperty_TXT_EqipBreakdown_Reff_HazardSubstance(strCommProperty_TXT_EqipBreakdown_Reff_HazardSubstance),strCommProperty_TXT_EqipBreakdown_Reff_HazardSubstance,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_EquipBrakdown_Reff_DedCombAllCov(strCommProperty_CHK_EquipBrakdown_Reff_DedCombAllCov),strCommProperty_CHK_EquipBrakdown_Reff_DedCombAllCov,test);
			//se.element().enterOrValidateText(getCommProperty_TXT_EqipBreakdown_Reff_DedComb_DedAmount(strCommProperty_TXT_EqipBreakdown_Reff_DedComb_DedAmount),strCommProperty_TXT_EqipBreakdown_Reff_DedComb_DedAmount,test);
			se.element().selectPopupWithMagnifier(getCommProperty_TXT_EqipBreakdown_Reff_DedComb_DedAmount(strCommProperty_TXT_EqipBreakdown_Reff_DedComb_DedAmount), getCommProperty_BTN_EqipBreakdown_Reff_DedComb_DedAmount_search(strCommProperty_TXT_EqipBreakdown_Reff_DedComb_DedAmount), strCommProperty_TXT_EqipBreakdown_Reff_DedComb_DedAmount, constants.NA, strCommProperty_TXT_EqipBreakdown_Reff_DedComb_DedAmount, constants.NA, constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_EquipBrakdown_Reff_DedDirectCov(strCommProperty_CHK_EquipBrakdown_Reff_DedDirectCov),strCommProperty_CHK_EquipBrakdown_Reff_DedDirectCov,test);
			se.element().enterOrValidateText(getCommProperty_TXT_EqipBreakdown_Reff_DedDir_DedAmount(strCommProperty_TXT_EqipBreakdown_Reff_DedDir_DedAmount),strCommProperty_TXT_EqipBreakdown_Reff_DedDir_DedAmount,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_EquipBrakdown_Reff_DirectExcept(strCommProperty_CHK_EquipBrakdown_Reff_DirectExcept),strCommProperty_CHK_EquipBrakdown_Reff_DirectExcept,test);
			se.element().enterOrValidateText(getCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_DedType(strCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_DedType),strCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_DedType,test);
			se.element().selectPopupWithMagnifier(getCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Deductible(strCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Deductible), getCommProperty_BTN_EqipBreakdown_Reff_DirectExcept_DeductibleSearch(strCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Deductible), strCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Deductible, constants.NA, strCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Deductible, constants.NA, constants.NA, constants.NA, test);
		
			//se.element().enterOrValidateText(getCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Deductible(strCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Deductible),strCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Deductible,test);
			se.element().enterOrValidateText(getCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_PerHP$(strCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_PerHP$),strCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_PerHP$,test);
			se.element().enterOrValidateText(getCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Min$(strCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Min$),strCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Min$,test);
			se.element().enterOrValidateText(getCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Description(strCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Description),strCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Description,test);
			se.element().enterOrValidateText(getCommProperty_TXT_EqipBreakdown_Reff_IndirectDamage(strCommProperty_TXT_EqipBreakdown_Reff_IndirectDamage),strCommProperty_TXT_EqipBreakdown_Reff_IndirectDamage,test);
			se.element().enterOrValidateText(getCommProperty_TXT_EqipBreakdown_Reff_IndirectDamageHours(strCommProperty_TXT_EqipBreakdown_Reff_IndirectDamageHours),strCommProperty_TXT_EqipBreakdown_Reff_IndirectDamageHours,test);
			se.element().enterOrValidateText(getCommProperty_TXT_EqipBreakdown_Reff_IndirectDamageValue(strCommProperty_TXT_EqipBreakdown_Reff_IndirectDamageValue),strCommProperty_TXT_EqipBreakdown_Reff_IndirectDamageValue,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_EquipBrakdown_Reff_IndirectExcept(strCommProperty_CHK_EquipBrakdown_Reff_IndirectExcept),strCommProperty_CHK_EquipBrakdown_Reff_IndirectExcept,test);
			se.element().enterOrValidateText(getCommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_DedType(strCommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_DedType),strCommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_DedType,test);
			se.element().enterOrValidateText(getCommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Deductible(strCommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Deductible),strCommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Deductible,test);
			se.element().enterOrValidateText(getCommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Hours(strCommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Hours),strCommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Hours,test);
			se.element().enterOrValidateText(getCommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Time(strCommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Time),strCommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Time,test);
			se.element().enterOrValidateText(getCommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Description(strCommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Description),strCommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Description,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_EqipBreakdown_Reff_DeductibleSpoilage(strCommProperty_CHK_EqipBreakdown_Reff_DeductibleSpoilage),strCommProperty_CHK_EqipBreakdown_Reff_DeductibleSpoilage,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_EqipBreakdown_Reff_SpoilOption_Deductible(strCommProperty_CHK_EqipBreakdown_Reff_SpoilOption_Deductible),strCommProperty_CHK_EqipBreakdown_Reff_SpoilOption_Deductible,test);
			/*if(!strCommProperty_TXT_EqipBreakdown_Reff_SpoilOption_Deductible_Ded.equalsIgnoreCase("N/A") && !strCommProperty_TXT_EqipBreakdown_Reff_SpoilOption_Deductible_Ded.contains("validate2")){
				se.element().clickSearchIcon(getCommProperty_BTN_EqipBreakdown_Reff_SpoilOption_Deductible_Ded_Search(), test);
				se.element().Click(getCommProperty_LNK_EqipBreakdown_Reff_SpoilOption_Deductible_Ded(strCommProperty_TXT_EqipBreakdown_Reff_SpoilOption_Deductible_Ded), test);
			}else{
				se.element().enterOrValidateText(getCommProperty_TXT_EqipBreakdown_Reff_SpoilOption_Deductible_Ded(strCommProperty_TXT_EqipBreakdown_Reff_SpoilOption_Deductible_Ded),strCommProperty_TXT_EqipBreakdown_Reff_SpoilOption_Deductible_Ded,test);
			}*/
			
			se.element().checkUncheckOrValidate(getCommProperty_CHK_TreesExpandedCausesofLoss(strCommProperty_CHK_TreesExpandedCausesofLoss),strCommProperty_CHK_TreesExpandedCausesofLoss,test);
			se.element().enterOrValidateText(getCommProperty_TXT_TreesExpandedCausesofLossLimit(strCommProperty_TXT_TreesExpandedCausesofLossLimit),strCommProperty_TXT_TreesExpandedCausesofLossLimit,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_TreesShrubsandPlantsDebrisRemoval(strCommProperty_CHK_TreesShrubsandPlantsDebrisRemoval),strCommProperty_CHK_TreesShrubsandPlantsDebrisRemoval,test);
			
			se.element().selectPopupWithMagnifier(getCommProperty_TXT_EqipBreakdown_Reff_SpoilOption_Deductible_Ded(strCommProperty_TXT_EqipBreakdown_Reff_SpoilOption_Deductible_Ded), getCommProperty_BTN_EqipBreakdown_Reff_SpoilOption_Deductible_Ded_Search(strCommProperty_TXT_EqipBreakdown_Reff_SpoilOption_Deductible_Ded), strCommProperty_TXT_EqipBreakdown_Reff_SpoilOption_Deductible_Ded, constants.NA, strCommProperty_TXT_EqipBreakdown_Reff_SpoilOption_Deductible_Ded, constants.NA, constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_EqipBreakdown_Reff_SpoilOption_PercentageLoss(strCommProperty_CHK_EqipBreakdown_Reff_SpoilOption_percentageLoss),strCommProperty_CHK_EqipBreakdown_Reff_SpoilOption_percentageLoss,test);
			se.element().enterOrValidateText(getCommProperty_TXT_EqipBreakdown_Reff_SpoilOption_perctLoss_perctLoss(strCommProperty_TXT_EqipBreakdown_Reff_SpoilOption_percentageLoss_percentageofloss),strCommProperty_TXT_EqipBreakdown_Reff_SpoilOption_percentageLoss_percentageofloss,test);
			se.element().enterOrValidateText(getCommProperty_TXT_EqipBreakdown_Reff_SpoilOption_perctLoss_Min$(strCommProperty_TXT_EqipBreakdown_Reff_SpoilOption_percentageLoss_Min$),strCommProperty_TXT_EqipBreakdown_Reff_SpoilOption_percentageLoss_Min$,test);
			
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CP_CommercialProperty", true, false, true, test);
					
		}
	}
	
	public void OtherConditions(Map<String, String> row, ExtentTest test) throws IOException {
		String strCommProperty_BTN_EqipBreakdown_Reff_OtherConditions_Add = (String) row.get("CommProperty_BTN_EqipBreakdown_Reff_OtherConditions_Add");
		String strCommProperty_TXT_EqipBreakdown_Reff_OptionNumber = (String) row.get("CommProperty_TXT_EqipBreakdown_Reff_OptionNumber");
		String strCommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOptionSearch = (String) row.get("CommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOptionSearch");
		String strCommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOption = (String) row.get("CommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOption");
		String strCommProperty_TXT_EqipBreakdown_Reff_OtherConditionsLimit = (String) row.get("CommProperty_TXT_EqipBreakdown_Reff_OtherConditionsLimit");
		String strCommProperty_CHK_EqipBreakdown_Reff_OtherConditionsApplies = (String) row.get("CommProperty_CHK_EqipBreakdown_Reff_OtherConditionsApplies");
		String strCommProperty_CHK_EqipBreakdown_Reff_OtherConditionsNotApplicable = (String) row.get("CommProperty_CHK_EqipBreakdown_Reff_OtherConditionsNotApplicable");
		String strCommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOther = (String) row.get("CommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOther");
		String transaction = (String) row.get("Transaction Name");
		try{
			se.log().logTestStep("CommercialProperty");
			test.log(LogStatus.INFO, "CommercialProperty page","Transaction Step : "+ transaction + "<br>" +"Page : CP_CommercialProperty" + "<br>" +"Section : OtherConditions");
			se.verify().verifyEquals("Commercial Property Page of PowerWriter ", getPagecontainingtext("Commercial Property").isDisplayed(),true, true,test);
			
			if(strCommProperty_BTN_EqipBreakdown_Reff_OtherConditions_Add.equalsIgnoreCase("Yes")){
				se.element().Click(getCommProperty_BTN_EqipBreakdown_Reff_OtherConditions_Add(strCommProperty_BTN_EqipBreakdown_Reff_OtherConditions_Add),test);
			}
			
			se.element().enterOrValidateText(getCommProperty_TXT_EqipBreakdown_Reff_OptionNumber(strCommProperty_TXT_EqipBreakdown_Reff_OptionNumber),strCommProperty_TXT_EqipBreakdown_Reff_OptionNumber,test);
			if(!strCommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOption.equalsIgnoreCase("N/A") && !strCommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOption.contains("validate2")){
				se.element().clickSearchIcon(getCommProperty_BTN_EqipBreakdown_Reff_OtherConditionsOption_Search(strCommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOptionSearch), test);
				se.element().enterOrValidateText(getCommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOptionSearch(strCommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOption),strCommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOption,test);
				se.element().clickElement(getCP_Bldgs_BTN_Search_Icon(), test);
				se.util().sleep(2000);
				se.element().Click(getCommProperty_LNK_EqipBreakdown_Reff_OtherConditionsOption(strCommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOption), test);
			}else{
				se.element().enterOrValidateText(getCommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOption(strCommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOption),strCommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOption,test);
			}
			
			se.element().enterOrValidateText(getCommProperty_TXT_EqipBreakdown_Reff_OtherConditionsLimit(strCommProperty_TXT_EqipBreakdown_Reff_OtherConditionsLimit),strCommProperty_TXT_EqipBreakdown_Reff_OtherConditionsLimit,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_EqipBreakdown_Reff_OtherConditionsApplies(strCommProperty_CHK_EqipBreakdown_Reff_OtherConditionsApplies),strCommProperty_CHK_EqipBreakdown_Reff_OtherConditionsApplies,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_EqipBreakdown_Reff_OtherConditionsNotApplicable(strCommProperty_CHK_EqipBreakdown_Reff_OtherConditionsNotApplicable),strCommProperty_CHK_EqipBreakdown_Reff_OtherConditionsNotApplicable,test);
			se.element().enterOrValidateText(getCommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOther(strCommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOther),strCommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOther,test);
			
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CP_CommercialProperty", true, false, true, test);
					
		}
	}
	
	public void SECURAWrapsCompanyRatingPlans(Map<String, String> row, ExtentTest test) throws IOException {
		String strCommProperty_TXT_PropertyWrap = (String) row.get("CommProperty_TXT_Property Wrap");
		String strCommProperty_CHK_PropertyWrap_Elite_250k = (String) row.get("CommProperty_CHK_PropertyWrap_Elite_250k");
		String strCommProperty_CHK_PropertyWrap_Elite_500k = (String) row.get("CommProperty_CHK_PropertyWrap_Elite_500k");
		String strCommProperty_TXT_CompRating_TransitionFactor = (String) row.get("CommProperty_TXT_CompRating_TransitionFactor");
		String strCommProperty_TXT_CompRating_MiscFactor = (String) row.get("CommProperty_TXT_CompRating_MiscFactor");
		String strCommProperty_TXT_miscellaneous_reason = (String) row.get("CommProperty_TXT_miscellaneous_reason");
		String strCommProperty_TXT_IA_IowaLargePremiumDiscount = (String) row.get("CommProperty_TXT_IA_IowaLargePremiumDiscount");
		String transaction = (String) row.get("Transaction Name");
		try{
			se.log().logTestStep("CommercialProperty");
			test.log(LogStatus.INFO, "CommercialProperty page","Transaction Step : "+ transaction + "<br>" +"Page : CP_CommercialProperty" + "<br>" +"Section : SECURAWrapsCompanyRatingPlans");
			se.verify().verifyEquals("Commercial Property Page of PowerWriter ", getPagecontainingtext("Commercial Property").isDisplayed(),true, true,test);
			
			//se.element().enterOrValidateText(getCommProperty_TXT_PropertyWrap(strCommProperty_TXT_PropertyWrap),strCommProperty_TXT_PropertyWrap,test);
			se.element().selectPopupWithMagnifier(getCommProperty_TXT_PropertyWrap(strCommProperty_TXT_PropertyWrap), getCommProperty_TXT_PropertyWrapSearch(strCommProperty_TXT_PropertyWrap), strCommProperty_TXT_PropertyWrap, constants.NA, strCommProperty_TXT_PropertyWrap, constants.NA, constants.NA,constants.NA, test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_PropertyWrap_Elite_250k(strCommProperty_CHK_PropertyWrap_Elite_250k),strCommProperty_CHK_PropertyWrap_Elite_250k,test);
			se.element().checkUncheckOrValidate(getCommProperty_CHK_PropertyWrap_Elite_500k(strCommProperty_CHK_PropertyWrap_Elite_500k),strCommProperty_CHK_PropertyWrap_Elite_500k,test);
			se.element().enterOrValidateText(getCommProperty_TXT_CompRating_TransitionFactor(strCommProperty_TXT_CompRating_TransitionFactor),strCommProperty_TXT_CompRating_TransitionFactor,test);
			se.element().enterOrValidateText(getCommProperty_TXT_CompRating_MiscFactor(strCommProperty_TXT_CompRating_MiscFactor),strCommProperty_TXT_CompRating_MiscFactor,test);
			se.element().enterOrValidateText(getCommProperty_TXT_miscellaneous_reason(strCommProperty_TXT_miscellaneous_reason),strCommProperty_TXT_miscellaneous_reason,test);
			se.element().enterOrValidateText(getCommProperty_TXT_IA_IowaLargePremiumDiscount(strCommProperty_TXT_IA_IowaLargePremiumDiscount),strCommProperty_TXT_IA_IowaLargePremiumDiscount,test);
			
			

		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CP_CommercialProperty", true, false, true, test);
					
		}
	}
	public void IllinoisFireTax(Map<String, String> row, ExtentTest test) throws IOException {
		
		String strCommProperty_TXT_IL_JurisdictionDesc = (String) row.get("CommProperty_TXT_IL_JurisdictionDesc");
		String strCommProperty_TXT_IL_FPDCode = (String) row.get("CommProperty_TXT_IL_FPDCode");
		String strCommProperty_TXT_IL_FireProtDist = (String) row.get("CommProperty_TXT_IL_FireProtDist");
		String transaction = (String) row.get("Transaction Name");
		try{
			se.log().logTestStep("CommercialProperty");
			test.log(LogStatus.INFO, "CommercialProperty page","Transaction Step : "+ transaction + "<br>" +"Page : CP_CommercialProperty"+ "<br>" +"Section : IllinoisFireTax");
			se.verify().verifyEquals("Commercial Property Page of PowerWriter ", getPagecontainingtext("Commercial Property").isDisplayed(),true, true,test);
			
			//Commercial Property Section:
			
			se.element().enterOrValidateText(getCommProperty_TXT_IL_JurisdictionDesc(strCommProperty_TXT_IL_JurisdictionDesc),strCommProperty_TXT_IL_JurisdictionDesc,test);
			se.element().enterOrValidateText(getCommProperty_TXT_IL_FPDCode(strCommProperty_TXT_IL_FPDCode),strCommProperty_TXT_IL_FPDCode,test);
			se.element().enterOrValidateText(getCommProperty_TXT_IL_FireProtDist(strCommProperty_TXT_IL_FireProtDist),strCommProperty_TXT_IL_FireProtDist,test);
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CP_CommercialProperty", true, false, true, test);
					
		}
		
	}
}
