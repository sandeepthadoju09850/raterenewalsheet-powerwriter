package pw.pages.CIM;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import pw.Constants.constants;
import pw.OR.OR_CIM;

public class CIM_ComputerCoverage extends OR_CIM  {
	
public void CIMComputerCoverage(String strRegressionID,String transaction,ExtentTest test) throws IOException {
	try{
	String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
    if(SuspendSheet.equalsIgnoreCase("CIM_ComputerCoverage")){
    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
         testTearDown(se, test);
    }
	List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_ComputerCoverage", strRegressionID, transaction);
	int iteration = 0;
	while (iteration < table.size()) {
		LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		try {
			
			CIM_ComputerCoverage CIMComputerCoverage =  TestPageFactory.initElements(se, CIM_ComputerCoverage.class);
			
			CIMComputerCoverage.CoverageExtensions(row,test);
			CIMComputerCoverage.SupplementalCoverage(row,test);
			CIMComputerCoverage.KYInformation(row,test);
			CIMComputerCoverage.ComputerCoverageRatingBoxDetails(row,test);
			CIMComputerCoverage.IncomeCoverageAndExtensions(row,test);
			CIMComputerCoverage.SupplementalIncomeCoverage(row,test);
			CIMComputerCoverage.VirusAndHackingCoverage(row,test);
			CIMComputerCoverage.ComputerCoverageFinalRatingDetails(row,test);
			
			se.element().Click(getNext(),test);
		
			
		
			
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for Computer Coverage ", true, false, true, test);
			
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
	
	public void CoverageExtensions(Map<String, String> row, ExtentTest test) throws IOException {
		String strCIM_ComputerCoverage_TXT_ComputerCatastropheLimit = (String) row.get("CIM_ComputerCoverage_TXT_ComputerCatastropheLimit");
		String strCIM_ComputerCoverage_TXT_AdditionalDebrisRemovalExpenseLimit = (String) row.get("CIM_ComputerCoverage_TXT_AdditionalDebrisRemovalExpenseLimit");
		String strCIM_ComputerCoverage_TXT_EmergencyRemoval = (String) row.get("CIM_ComputerCoverage_TXT_EmergencyRemoval");
		String strCIM_ComputerCoverage_TXT_EmergencyRemovalExpenses = (String) row.get("CIM_ComputerCoverage_TXT_EmergencyRemovalExpenses");
		String strCIM_ComputerCoverage_TXT_ElectricalPowerSupplyDisturbance = (String) row.get("CIM_ComputerCoverage_TXT_ElectricalPowerSupplyDisturbance");
		String strCIM_ComputerCoverage_CHK_ElectricalPowerSupplyDisturbance500FtLimitation_NotWaived = (String) row.get("CIM_ComputerCoverage_CHK_ElectricalPowerSupplyDisturbance500FtLimitation_NotWaived");
		String strCIM_ComputerCoverage_CHK_ElectricalPowerSupplyDisturbance500FtLimitation_Waived = (String) row.get("CIM_ComputerCoverage_CHK_ElectricalPowerSupplyDisturbance500FtLimitation_Waived");
		String strCIM_ComputerCoverage_TXT_FraudAndDeceit = (String) row.get("CIM_ComputerCoverage_TXT_FraudAndDeceit");
		String strCIM_ComputerCoverage_TXT_MechanicalBreakdownCoverage = (String) row.get("CIM_ComputerCoverage_TXT_MechanicalBreakdownCoverage");
		String strCIM_ComputerCoverage_TXT_MechanicalBreakdownElectricalDisturbanceAndPowerSupplyDisturbanceDeductible = (String) row.get("CIM_ComputerCoverage_TXT_MechanicalBreakdownElectricalDisturbanceAndPowerSupplyDisturbanceDeductible");
		String transaction = (String) row.get("Transaction Name");

	try{
		se.log().logTestStep("CoverageExtensions");
		test.log(LogStatus.INFO, "CoverageExtensions section","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMComputerCoverage");
		se.verify().verifyEquals("CoverageExtensions section of PowerWriter ", getCIM_ComputerCoverage_TXT_VerifyComputerText().isDisplayed(),true, true,test);
	
	se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_ComputerCatastropheLimit(strCIM_ComputerCoverage_TXT_ComputerCatastropheLimit),strCIM_ComputerCoverage_TXT_ComputerCatastropheLimit,test);
	se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_AdditionalDebrisRemovalExpenseLimit(strCIM_ComputerCoverage_TXT_AdditionalDebrisRemovalExpenseLimit),strCIM_ComputerCoverage_TXT_AdditionalDebrisRemovalExpenseLimit,test);
	if(se.element().isElementPresent(CIM_ComputerCoverage_BTN_OKButton)){
		se.element().Click(getCIM_ComputerCoverage_BTN_OKButton(), test);
	}
	se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_EmergencyRemoval(strCIM_ComputerCoverage_TXT_EmergencyRemoval),strCIM_ComputerCoverage_TXT_EmergencyRemoval,test);
	se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_EmergencyRemovalExpenses(strCIM_ComputerCoverage_TXT_EmergencyRemovalExpenses),strCIM_ComputerCoverage_TXT_EmergencyRemovalExpenses,test);
	se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_ElectricalPowerSupplyDisturbance(strCIM_ComputerCoverage_TXT_ElectricalPowerSupplyDisturbance),strCIM_ComputerCoverage_TXT_ElectricalPowerSupplyDisturbance,test);
	se.element().checkUncheckOrValidate(getCIM_ComputerCoverage_CHK_ElectricalPowerSupplyDisturbance500FtLimitation_NotWaived(strCIM_ComputerCoverage_CHK_ElectricalPowerSupplyDisturbance500FtLimitation_NotWaived),strCIM_ComputerCoverage_CHK_ElectricalPowerSupplyDisturbance500FtLimitation_NotWaived,test);
	se.element().checkUncheckOrValidate(getCIM_ComputerCoverage_CHK_ElectricalPowerSupplyDisturbance500FtLimitation_Waived(strCIM_ComputerCoverage_CHK_ElectricalPowerSupplyDisturbance500FtLimitation_Waived),strCIM_ComputerCoverage_CHK_ElectricalPowerSupplyDisturbance500FtLimitation_Waived,test);
	se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_FraudAndDeceit(strCIM_ComputerCoverage_TXT_FraudAndDeceit),strCIM_ComputerCoverage_TXT_FraudAndDeceit,test);
	if(se.element().isElementPresent(CIM_ComputerCoverage_BTN_OKButton)){
		se.element().Click(getCIM_ComputerCoverage_BTN_OKButton(), test);
	}
	
	se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_FraudAndDeceit(strCIM_ComputerCoverage_TXT_FraudAndDeceit),strCIM_ComputerCoverage_TXT_FraudAndDeceit,test);
	
	if(se.element().isElementPresent(CIM_ComputerCoverage_BTN_OKButton)){
		se.element().Click(getCIM_ComputerCoverage_BTN_OKButton(), test);
	}
	se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_MechanicalBreakdownCoverage(strCIM_ComputerCoverage_TXT_MechanicalBreakdownCoverage),strCIM_ComputerCoverage_TXT_MechanicalBreakdownCoverage,test);
	se.element().selectPopupWithMagnifier(getCIM_ComputerCoverage_TXT_MechanicalBreakdownElectricalDisturbanceAndPowerSupplyDisturbanceDeductible(strCIM_ComputerCoverage_TXT_MechanicalBreakdownElectricalDisturbanceAndPowerSupplyDisturbanceDeductible), getCIM_ComputerCoverage_BTN_MechanicalBreakdownElectricalDisturbanceAndPowerSupplyDisturbanceDeductibleSearch(strCIM_ComputerCoverage_TXT_MechanicalBreakdownElectricalDisturbanceAndPowerSupplyDisturbanceDeductible), strCIM_ComputerCoverage_TXT_MechanicalBreakdownElectricalDisturbanceAndPowerSupplyDisturbanceDeductible,constants.NA, strCIM_ComputerCoverage_TXT_MechanicalBreakdownElectricalDisturbanceAndPowerSupplyDisturbanceDeductible,constants.NA, constants.NA, constants.NA, test);
	
	
}
	catch(Exception e){
		se.verify().verifyEquals("Failed to fill in details for CoverageExtensions", true, false, true, test);
				
		}
	
}


public void SupplementalCoverage(Map<String, String> row, ExtentTest test) throws IOException {
	
	String strCIM_ComputerCoverage_TXT_AcquiredLocationLimit = (String) row.get("CIM_ComputerCoverage_TXT_AcquiredLocationLimit");
	String strCIM_ComputerCoverage_TXT_NewlyPurchasedORLeasedHardwareUnit = (String) row.get("CIM_ComputerCoverage_TXT_NewlyPurchasedORLeasedHardwareUnit");
	String strCIM_ComputerCoverage_TXT_OffsiteComputersLimit = (String) row.get("CIM_ComputerCoverage_TXT_OffsiteComputersLimit");
	String strCIM_ComputerCoverage_TXT_PollutantCleanupAndRemovalLimit = (String) row.get("CIM_ComputerCoverage_TXT_PollutantCleanupAndRemovalLimit");
	String strCIM_ComputerCoverage_TXT_ProprietaryProgramsAndDataRecordsLimit = (String) row.get("CIM_ComputerCoverage_TXT_ProprietaryProgramsAndDataRecordsLimit");
	String strCIM_ComputerCoverage_TXT_PropertyInTransitLimit = (String) row.get("CIM_ComputerCoverage_TXT_PropertyInTransitLimit");
	String strCIM_ComputerCoverage_TXT_RewardsLimit = (String) row.get("CIM_ComputerCoverage_TXT_RewardsLimit");
	String strCIM_ComputerCoverage_TXT_SoftStorageLimit = (String) row.get("CIM_ComputerCoverage_TXT_SoftStorageLimit");
	String strCIM_ComputerCoverage_TXT_VirusAndHackingCoverageLimitAnyOneOccurrence = (String) row.get("CIM_ComputerCoverage_TXT_VirusAndHackingCoverageLimitAnyOneOccurrence");
	String strCIM_ComputerCoverage_TXT_VirusAndHackingCoverageLimitEachSeparate12MonthsPeriod = (String) row.get("CIM_ComputerCoverage_TXT_VirusAndHackingCoverageLimitEachSeparate12MonthsPeriod");
	String strCIM_ComputerCoverage_CHK_ComputerCoverageOverrideBaseRate_Yes = (String) row.get("CIM_ComputerCoverage_CHK_ComputerCoverageOverrideBaseRate_Yes");
	String strCIM_ComputerCoverage_CHK_ComputerCoverageOverrideBaseRate_No = (String) row.get("CIM_ComputerCoverage_CHK_ComputerCoverageOverrideBaseRate_No");
	String strCIM_ComputerCoverage_TXT_ComputerCoverageOverrideReason = (String) row.get("CIM_ComputerCoverage_TXT_ComputerCoverageOverrideReason");
	String strCIM_ComputerCoverage_TXT_ComputerCoverageOverrideReasonFilterNeeded = (String) row.get("CIM_ComputerCoverage_TXT_ComputerCoverageOverrideReasonFilterNeeded");
	
	
	String transaction = (String) row.get("Transaction Name");	
	try{
		se.log().logTestStep("SupplementalCoverage");
		test.log(LogStatus.INFO, "SupplementalCoverage section","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMComputerCoverage");
		
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_AcquiredLocationLimit(strCIM_ComputerCoverage_TXT_AcquiredLocationLimit),strCIM_ComputerCoverage_TXT_AcquiredLocationLimit,test);
		if(se.element().isElementPresent(CIM_ComputerCoverage_BTN_OKButton)){
		se.element().clickElement(getCIM_ComputerCoverage_BTN_OKButton(),test);
		}
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_AcquiredLocationLimit(strCIM_ComputerCoverage_TXT_AcquiredLocationLimit),strCIM_ComputerCoverage_TXT_AcquiredLocationLimit,test);
		if(se.element().isElementPresent(CIM_ComputerCoverage_BTN_OKButton)){
			se.element().Click(getCIM_ComputerCoverage_BTN_OKButton(), test);
		}
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_NewlyPurchasedORLeasedHardwareUnit(strCIM_ComputerCoverage_TXT_NewlyPurchasedORLeasedHardwareUnit),strCIM_ComputerCoverage_TXT_NewlyPurchasedORLeasedHardwareUnit,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_OffsiteComputersLimit(strCIM_ComputerCoverage_TXT_OffsiteComputersLimit),strCIM_ComputerCoverage_TXT_OffsiteComputersLimit,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_PollutantCleanupAndRemovalLimit(strCIM_ComputerCoverage_TXT_PollutantCleanupAndRemovalLimit),strCIM_ComputerCoverage_TXT_PollutantCleanupAndRemovalLimit,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_ProprietaryProgramsAndDataRecordsLimit(strCIM_ComputerCoverage_TXT_ProprietaryProgramsAndDataRecordsLimit),strCIM_ComputerCoverage_TXT_ProprietaryProgramsAndDataRecordsLimit,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_PropertyInTransitLimit(strCIM_ComputerCoverage_TXT_PropertyInTransitLimit),strCIM_ComputerCoverage_TXT_PropertyInTransitLimit,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_RewardsLimit(strCIM_ComputerCoverage_TXT_RewardsLimit),strCIM_ComputerCoverage_TXT_RewardsLimit,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_SoftStorageLimit(strCIM_ComputerCoverage_TXT_SoftStorageLimit),strCIM_ComputerCoverage_TXT_SoftStorageLimit,test);
		if(se.element().isElementPresent(CIM_ComputerCoverage_BTN_OKButton)){
			se.element().Click(getCIM_ComputerCoverage_BTN_OKButton(), test);
		}
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_SoftStorageLimit(strCIM_ComputerCoverage_TXT_SoftStorageLimit),strCIM_ComputerCoverage_TXT_SoftStorageLimit,test);
		if(se.element().isElementPresent(CIM_ComputerCoverage_BTN_OKButton)){
			se.element().Click(getCIM_ComputerCoverage_BTN_OKButton(), test);
		}
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_VirusAndHackingCoverageLimitAnyOneOccurrence(strCIM_ComputerCoverage_TXT_VirusAndHackingCoverageLimitAnyOneOccurrence),strCIM_ComputerCoverage_TXT_VirusAndHackingCoverageLimitAnyOneOccurrence,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_VirusAndHackingCoverageLimitEachSeparate12MonthsPeriod(strCIM_ComputerCoverage_TXT_VirusAndHackingCoverageLimitEachSeparate12MonthsPeriod),strCIM_ComputerCoverage_TXT_VirusAndHackingCoverageLimitEachSeparate12MonthsPeriod,test);
		se.element().checkUncheckOrValidate(getCIM_ComputerCoverage_CHK_ComputerCoverageOverrideBaseRate_Yes(strCIM_ComputerCoverage_CHK_ComputerCoverageOverrideBaseRate_Yes),strCIM_ComputerCoverage_CHK_ComputerCoverageOverrideBaseRate_Yes,test);
		se.element().checkUncheckOrValidate(getCIM_ComputerCoverage_CHK_ComputerCoverageOverrideBaseRate_No(strCIM_ComputerCoverage_CHK_ComputerCoverageOverrideBaseRate_No),strCIM_ComputerCoverage_CHK_ComputerCoverageOverrideBaseRate_No,test);
		
		se.element().selectPopupWithMagnifier(getCIM_ComputerCoverage_TXT_ComputerCoverageOverrideReason(strCIM_ComputerCoverage_TXT_ComputerCoverageOverrideReason), getCIM_ComputerCoverage_BTN_ComputerCoverageOverrideReasonSearch(strCIM_ComputerCoverage_TXT_ComputerCoverageOverrideReason), strCIM_ComputerCoverage_TXT_ComputerCoverageOverrideReason,strCIM_ComputerCoverage_TXT_ComputerCoverageOverrideReasonFilterNeeded, strCIM_ComputerCoverage_TXT_ComputerCoverageOverrideReason,constants.NA, constants.NA, constants.NA, test);
		
	}
	catch(Exception e){
		se.verify().verifyEquals("Failed to fill in details for SupplementalCoverage", true, false, true, test);
				
		}
}
	
public void KYInformation(Map<String, String> row, ExtentTest test) throws IOException {

	String strCIM_ComputerCoverage_CHK_DoNotApplyCityorCountyTaxes = (String) row.get("CIM_ComputerCoverage_CHK_DoNotApplyCityorCountyTaxes");
	String strCIM_ComputerCoverage_CHK_AllCityName = (String) row.get("CIM_ComputerCoverage_CHK_AllCityName");
	String strCIM_ComputerCoverage_TXT_City = (String) row.get("CIM_ComputerCoverage_TXT_City");
	String strCIM_ComputerCoverage_TXT_CityFilterNeeded = (String) row.get("CIM_ComputerCoverage_TXT_CityFilterNeeded");
	String strCIM_ComputerCoverage_TXT_CityCode = (String) row.get("CIM_ComputerCoverage_TXT_CityCode");
	String strCIM_ComputerCoverage_TXT_CityCode_Popup = (String) row.get("CIM_ComputerCoverage_TXT_CityCode_Popup");
	String strCIM_ComputerCoverage_TXT_County = (String) row.get("CIM_ComputerCoverage_TXT_County");
	String strCIM_ComputerCoverage_TXT_CountyFilterNeeded = (String) row.get("CIM_ComputerCoverage_TXT_CountyFilterNeeded");
	String strCIM_ComputerCoverage_TXT_CountyCode = (String) row.get("CIM_ComputerCoverage_TXT_CountyCode");
	String strCIM_ComputerCoverage_TXT_CountyCode_Popup = (String) row.get("CIM_ComputerCoverage_TXT_CountyCode_Popup");
	String strCIM_ComputerCoverage_TXT_TaxCode = (String) row.get("CIM_ComputerCoverage_TXT_TaxCode");
	String transaction = (String) row.get("Transaction Name");	
	
	try{
		se.log().logTestStep("KYInformation");
		test.log(LogStatus.INFO, "KYInformation section","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMComputerCoverage");
		
	se.element().checkUncheckOrValidate(getCIM_ComputerCoverage_CHK_DoNotApplyCityorCountyTaxes(strCIM_ComputerCoverage_CHK_DoNotApplyCityorCountyTaxes),strCIM_ComputerCoverage_CHK_DoNotApplyCityorCountyTaxes,test);
	se.element().checkUncheckOrValidate(getCIM_ComputerCoverage_CHK_AllCityName(strCIM_ComputerCoverage_CHK_AllCityName),strCIM_ComputerCoverage_CHK_AllCityName,test);
	se.element().selectPopupWithMagnifier(getCIM_ComputerCoverage_TXT_City(strCIM_ComputerCoverage_TXT_City), getCIM_ComputerCoverage_TXT_CitySearch(strCIM_ComputerCoverage_TXT_City), strCIM_ComputerCoverage_TXT_City,strCIM_ComputerCoverage_TXT_CityFilterNeeded, strCIM_ComputerCoverage_TXT_City,strCIM_ComputerCoverage_TXT_CityCode_Popup, constants.NA, constants.NA, test);
	se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_CityCode(strCIM_ComputerCoverage_TXT_CityCode),strCIM_ComputerCoverage_TXT_CityCode,test);
	se.element().selectPopupWithMagnifier(getCIM_ComputerCoverage_TXT_County(strCIM_ComputerCoverage_TXT_County), getCIM_ComputerCoverage_BTN_CountySearch(strCIM_ComputerCoverage_TXT_County), strCIM_ComputerCoverage_TXT_County,strCIM_ComputerCoverage_TXT_CountyFilterNeeded, strCIM_ComputerCoverage_TXT_County,strCIM_ComputerCoverage_TXT_CountyCode_Popup, constants.NA, constants.NA, test);
	se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_CountyCode(strCIM_ComputerCoverage_TXT_CountyCode),strCIM_ComputerCoverage_TXT_CountyCode,test);
	se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_TaxCode(strCIM_ComputerCoverage_TXT_TaxCode),strCIM_ComputerCoverage_TXT_TaxCode,test);
}
	catch(Exception e){
		se.verify().verifyEquals("Failed to fill in details for KYInformation", true, false, true, test);
				
		}
}

public void ComputerCoverageRatingBoxDetails(Map<String, String> row, ExtentTest test) throws IOException {
	
	String strCIM_ComputerCoverage_TXT_BaseRate = (String) row.get("CIM_ComputerCoverage_TXT_BaseRate");
	String strCIM_ComputerCoverage_TXT_BaseRateOverride = (String) row.get("CIM_ComputerCoverage_TXT_BaseRateOverride");
	String strCIM_ComputerCoverage_TXT_ComputerDeductibleFactor = (String) row.get("CIM_ComputerCoverage_TXT_ComputerDeductibleFactor");
	String strCIM_ComputerCoverage_TXT_TransitionFactor = (String) row.get("CIM_ComputerCoverage_TXT_TransitionFactor");
	String strCIM_ComputerCoverage_TXT_FinalRate = (String) row.get("CIM_ComputerCoverage_TXT_FinalRate");
	String strCIM_ComputerCoverage_TXT_OverrideFinalRate = (String) row.get("CIM_ComputerCoverage_TXT_OverrideFinalRate");
	String strCIM_ComputerCoverage_TXT_ComputerCoverageRatingDetailsCatastropheLimit = (String) row.get("CIM_ComputerCoverage_TXT_ComputerCoverageRatingDetailsCatastropheLimit");
	String strCIM_ComputerCoverage_TXT_FinalPremium = (String) row.get("CIM_ComputerCoverage_TXT_FinalPremium");
	String strCIM_ComputerCoverage_TXT_OverrideFinalPremium = (String) row.get("CIM_ComputerCoverage_TXT_OverrideFinalPremium");
	String strCIM_ComputerCoverage_CHK_EarthquakeCoverageProvided = (String) row.get("CIM_ComputerCoverage_CHK_EarthquakeCoverageProvided");
	String strCIM_ComputerCoverage_CHK_EarthquakeCoverageNotProvided = (String) row.get("CIM_ComputerCoverage_CHK_EarthquakeCoverageNotProvided");
	String strCIM_ComputerCoverage_CHK_EarthquakeReferToEarthquakeAndFloodAndSewerBackupEndorsement = (String) row.get("CIM_ComputerCoverage_CHK_EarthquakeReferToEarthquakeAndFloodAndSewerBackupEndorsement");
	String strCIM_ComputerCoverage_CHK_FloodCoverageProvided = (String) row.get("CIM_ComputerCoverage_CHK_FloodCoverageProvided");
	String strCIM_ComputerCoverage_CHK_FloodCoverageNotProvided = (String) row.get("CIM_ComputerCoverage_CHK_FloodCoverageNotProvided");
	String strCIM_ComputerCoverage_CHK_FloodReferToEarthquakeAndFloodAndSewerBackupEndorsement = (String) row.get("CIM_ComputerCoverage_CHK_FloodReferToEarthquakeAndFloodAndSewerBackupEndorsement");
	String strCIM_ComputerCoverage_CHK_SewerBackupCoverageProvided = (String) row.get("CIM_ComputerCoverage_CHK_SewerBackupCoverageProvided");
	String strCIM_ComputerCoverage_CHK_SewerBackupCoverageNotProvided = (String) row.get("CIM_ComputerCoverage_CHK_SewerBackupCoverageNotProvided");
	String strCIM_ComputerCoverage_CHK_SewerBackupReferToEarthquakeAndFloodAndSewerBackupEndorsement = (String) row.get("CIM_ComputerCoverage_CHK_SewerBackupReferToEarthquakeAndFloodAndSewerBackupEndorsement");
	String strCIM_ComputerCoverage_TXT_EarthquakeDeductibleAmount = (String) row.get("CIM_ComputerCoverage_TXT_EarthquakeDeductibleAmount");
	String strCIM_ComputerCoverage_CHK_EarthquakeCoverageProvidedEarthquakeOverrideBaseRate_Yes = (String) row.get("CIM_ComputerCoverage_CHK_EarthquakeCoverageProvidedEarthquakeOverrideBaseRate_Yes");
	String strCIM_ComputerCoverage_CHK_EarthquakeCoverageProvidedEarthquakeOverrideBaseRate_No = (String) row.get("CIM_ComputerCoverage_CHK_EarthquakeCoverageProvidedEarthquakeOverrideBaseRate_No");
	String strCIM_ComputerCoverage_TXT_EarthquakeCoverageProvidedEarthquakeOverrideReason = (String) row.get("CIM_ComputerCoverage_TXT_EarthquakeCoverageProvidedEarthquakeOverrideReason");
	String strCIM_ComputerCoverage_TXT_EarthquakeCatastropheLimit = (String) row.get("CIM_ComputerCoverage_TXT_EarthquakeCatastropheLimit");
	String strCIM_ComputerCoverage_TXT_EarthquakeAggregateLimit = (String) row.get("CIM_ComputerCoverage_TXT_EarthquakeAggregateLimit");
	String strCIM_ComputerCoverage_TXT_EarthquakeOccurenceLimit = (String) row.get("CIM_ComputerCoverage_TXT_EarthquakeOccurenceLimit");
	String strCIM_ComputerCoverage_TXT_EarthquakeBaseRate = (String) row.get("CIM_ComputerCoverage_TXT_EarthquakeBaseRate");
	String strCIM_ComputerCoverage_TXT_EarthquakeBaseRateOverride = (String) row.get("CIM_ComputerCoverage_TXT_EarthquakeBaseRateOverride");
	String strCIM_ComputerCoverage_TXT_EarthquakeDeductibleFactor = (String) row.get("CIM_ComputerCoverage_TXT_EarthquakeDeductibleFactor");
	String strCIM_ComputerCoverage_TXT_EarthquakeFinalRate = (String) row.get("CIM_ComputerCoverage_TXT_EarthquakeFinalRate");
	String strCIM_ComputerCoverage_TXT_EarthquakeOverrideFinalRate = (String) row.get("CIM_ComputerCoverage_TXT_EarthquakeOverrideFinalRate");
	String strCIM_ComputerCoverage_TXT_EarthquakeRatingDetailsBoxCatastropheLimit = (String) row.get("CIM_ComputerCoverage_TXT_EarthquakeRatingDetailsBoxCatastropheLimit");
	String strCIM_ComputerCoverage_TXT_EarthquakeRatingDetailsBoxEarthquakePremium = (String) row.get("CIM_ComputerCoverage_TXT_EarthquakeRatingDetailsBoxEarthquakePremium");
	String strCIM_ComputerCoverage_TXT_EarthquakeRatingDetailsBoxEarthquakeOverridePremium = (String) row.get("CIM_ComputerCoverage_TXT_EarthquakeRatingDetailsBoxEarthquakeOverridePremium");
	String strCIM_ComputerCoverage_TXT_FloodDeductibleAmount = (String) row.get("CIM_ComputerCoverage_TXT_FloodDeductibleAmount");
	String strCIM_ComputerCoverage_CHK_FloodCoverageProvidedFloodOverrideBaseRate_Yes = (String) row.get("CIM_ComputerCoverage_CHK_FloodCoverageProvidedFloodOverrideBaseRate_Yes");
	String strCIM_ComputerCoverage_CHK_FloodCoverageProvidedFloodOverrideBaseRate_No = (String) row.get("CIM_ComputerCoverage_CHK_FloodCoverageProvidedFloodOverrideBaseRate_No");
	String strCIM_ComputerCoverage_TXT_FloodCoverageProvidedFloodOverrideReason = (String) row.get("CIM_ComputerCoverage_TXT_FloodCoverageProvidedFloodOverrideReason");
	String strCIM_ComputerCoverage_TXT_FloodCatastropheLimit = (String) row.get("CIM_ComputerCoverage_TXT_FloodCatastropheLimit");
	String strCIM_ComputerCoverage_TXT_FloodAggregateLimit = (String) row.get("CIM_ComputerCoverage_TXT_FloodAggregateLimit");
	String strCIM_ComputerCoverage_TXT_FloodOccurenceLimit = (String) row.get("CIM_ComputerCoverage_TXT_FloodOccurenceLimit");
	String strCIM_ComputerCoverage_TXT_FloodBaseRate = (String) row.get("CIM_ComputerCoverage_TXT_FloodBaseRate");
	String strCIM_ComputerCoverage_TXT_FloodBaseRateOverride = (String) row.get("CIM_ComputerCoverage_TXT_FloodBaseRateOverride");
	String strCIM_ComputerCoverage_TXT_FloodDeductibleFactor = (String) row.get("CIM_ComputerCoverage_TXT_FloodDeductibleFactor");
	String strCIM_ComputerCoverage_TXT_FloodFinalRate = (String) row.get("CIM_ComputerCoverage_TXT_FloodFinalRate");
	String strCIM_ComputerCoverage_TXT_FloodOverrideFinalRate = (String) row.get("CIM_ComputerCoverage_TXT_FloodOverrideFinalRate");
	String strCIM_ComputerCoverage_TXT_FloodRatingDetailsBoxCatastropheLimit = (String) row.get("CIM_ComputerCoverage_TXT_FloodRatingDetailsBoxCatastropheLimit");
	String strCIM_ComputerCoverage_TXT_FloodRatingDetailsBoxFloodPremium = (String) row.get("CIM_ComputerCoverage_TXT_FloodRatingDetailsBoxFloodPremium");
	String strCIM_ComputerCoverage_TXT_FloodRatingDetailsBoxFloodOverridePremium = (String) row.get("CIM_ComputerCoverage_TXT_FloodRatingDetailsBoxFloodOverridePremium");
	String strCIM_ComputerCoverage_CHK_SewerBackupCoverageProvidedSewerBackupOverrideBaseRate_Yes = (String) row.get("CIM_ComputerCoverage_CHK_SewerBackupCoverageProvidedSewerBackupOverrideBaseRate_Yes");
	String strCIM_ComputerCoverage_CHK_SewerBackupCoverageProvidedSewerBackupOverrideBaseRate_No = (String) row.get("CIM_ComputerCoverage_CHK_SewerBackupCoverageProvidedSewerBackupOverrideBaseRate_No");
	String strCIM_ComputerCoverage_TXT_SewerBackupCoverageProvidedSewerBackupOverrideReason = (String) row.get("CIM_ComputerCoverage_TXT_SewerBackupCoverageProvidedSewerBackupOverrideReason");
	String strCIM_ComputerCoverage_TXT_SewerBackupCatastropheLimit = (String) row.get("CIM_ComputerCoverage_TXT_SewerBackupCatastropheLimit");
	String strCIM_ComputerCoverage_TXT_SewerBackupAggregateLimit = (String) row.get("CIM_ComputerCoverage_TXT_SewerBackupAggregateLimit");
	String strCIM_ComputerCoverage_TXT_SewerBackupOccurenceLimit = (String) row.get("CIM_ComputerCoverage_TXT_SewerBackupOccurenceLimit");
	String strCIM_ComputerCoverage_TXT_SewerBackupBaseRate = (String) row.get("CIM_ComputerCoverage_TXT_SewerBackupBaseRate");
	String strCIM_ComputerCoverage_TXT_SewerBackupBaseRateOverride = (String) row.get("CIM_ComputerCoverage_TXT_SewerBackupBaseRateOverride");
	String strCIM_ComputerCoverage_TXT_SewerBackupComputerDeductibleFactor = (String) row.get("CIM_ComputerCoverage_TXT_SewerBackupComputerDeductibleFactor");
	String strCIM_ComputerCoverage_TXT_SewerBackupFinalRate = (String) row.get("CIM_ComputerCoverage_TXT_SewerBackupFinalRate");
	String strCIM_ComputerCoverage_TXT_SewerBackupOverrideFinalRate = (String) row.get("CIM_ComputerCoverage_TXT_SewerBackupOverrideFinalRate");
	String strCIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxCatastropheLimit = (String) row.get("CIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxCatastropheLimit");
	String strCIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxSewerBackupPremium = (String) row.get("CIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxSewerBackupPremium");
	String strCIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxSewerBackupOverridePremium = (String) row.get("CIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxSewerBackupOverridePremium");
	//String strCIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxComputerDeductibleFactor = (String) row.get("CIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxComputerDedcutibleFactor");
	String transaction = (String) row.get("Transaction Name");	
	
	try{
		se.log().logTestStep("ComputerCoverageRatingBoxDetails");
		test.log(LogStatus.INFO, "ComputerCoverageRatingBoxDetails page","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMComputerCoverage");
		
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_BaseRate(strCIM_ComputerCoverage_TXT_BaseRate),strCIM_ComputerCoverage_TXT_BaseRate,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_BaseRateOverride(strCIM_ComputerCoverage_TXT_BaseRateOverride),strCIM_ComputerCoverage_TXT_BaseRateOverride,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_ComputerDeductibleFactor(strCIM_ComputerCoverage_TXT_ComputerDeductibleFactor),strCIM_ComputerCoverage_TXT_ComputerDeductibleFactor,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_TransitionFactor(strCIM_ComputerCoverage_TXT_TransitionFactor),strCIM_ComputerCoverage_TXT_TransitionFactor,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_FinalRate(strCIM_ComputerCoverage_TXT_FinalRate),strCIM_ComputerCoverage_TXT_FinalRate,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_OverrideFinalRate(strCIM_ComputerCoverage_TXT_OverrideFinalRate),strCIM_ComputerCoverage_TXT_OverrideFinalRate,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_ComputerCoverageRatingDetailsCatastropheLimit(strCIM_ComputerCoverage_TXT_ComputerCoverageRatingDetailsCatastropheLimit),strCIM_ComputerCoverage_TXT_ComputerCoverageRatingDetailsCatastropheLimit,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_FinalPremium(strCIM_ComputerCoverage_TXT_FinalPremium),strCIM_ComputerCoverage_TXT_FinalPremium,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_OverrideFinalPremium(strCIM_ComputerCoverage_TXT_OverrideFinalPremium),strCIM_ComputerCoverage_TXT_OverrideFinalPremium,test);
		
		
		//Earthquake
		se.element().checkUncheckOrValidate(getCIM_ComputerCoverage_CHK_EarthquakeCoverageProvided(strCIM_ComputerCoverage_CHK_EarthquakeCoverageProvided),strCIM_ComputerCoverage_CHK_EarthquakeCoverageProvided,test);
		se.element().checkUncheckOrValidate(getCIM_ComputerCoverage_CHK_EarthquakeCoverageNotProvided(strCIM_ComputerCoverage_CHK_EarthquakeCoverageNotProvided),strCIM_ComputerCoverage_CHK_EarthquakeCoverageNotProvided,test);
		se.element().checkUncheckOrValidate(getCIM_ComputerCoverage_CHK_EarthquakeReferToEarthquakeAndFloodAndSewerBackupEndorsement(strCIM_ComputerCoverage_CHK_EarthquakeReferToEarthquakeAndFloodAndSewerBackupEndorsement),strCIM_ComputerCoverage_CHK_EarthquakeReferToEarthquakeAndFloodAndSewerBackupEndorsement,test);
		se.element().selectPopupWithMagnifier(getCIM_ComputerCoverage_TXT_EarthquakeDeductibleAmount(strCIM_ComputerCoverage_TXT_EarthquakeDeductibleAmount), getCIM_ComputerCoverage_BTN_EarthquakeDeductibleAmountSearch(strCIM_ComputerCoverage_TXT_EarthquakeDeductibleAmount), strCIM_ComputerCoverage_TXT_EarthquakeDeductibleAmount,constants.NA, strCIM_ComputerCoverage_TXT_EarthquakeDeductibleAmount,constants.NA, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_EarthquakeCatastropheLimit(strCIM_ComputerCoverage_TXT_EarthquakeCatastropheLimit),strCIM_ComputerCoverage_TXT_EarthquakeCatastropheLimit,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_EarthquakeAggregateLimit(strCIM_ComputerCoverage_TXT_EarthquakeAggregateLimit),strCIM_ComputerCoverage_TXT_EarthquakeAggregateLimit,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_EarthquakeOccurenceLimit(strCIM_ComputerCoverage_TXT_EarthquakeOccurenceLimit),strCIM_ComputerCoverage_TXT_EarthquakeOccurenceLimit,test);
		se.element().checkUncheckOrValidate(getCIM_ComputerCoverage_CHK_EarthquakeCoverageProvidedEarthquakeOverrideBaseRate_Yes(strCIM_ComputerCoverage_CHK_EarthquakeCoverageProvidedEarthquakeOverrideBaseRate_Yes),strCIM_ComputerCoverage_CHK_EarthquakeCoverageProvidedEarthquakeOverrideBaseRate_Yes,test);
		se.element().checkUncheckOrValidate(getCIM_ComputerCoverage_CHK_EarthquakeCoverageProvidedEarthquakeOverrideBaseRate_No(strCIM_ComputerCoverage_CHK_EarthquakeCoverageProvidedEarthquakeOverrideBaseRate_No),strCIM_ComputerCoverage_CHK_EarthquakeCoverageProvidedEarthquakeOverrideBaseRate_No,test);
		se.element().selectPopupWithMagnifier(getCIM_ComputerCoverage_TXT_EarthquakeCoverageProvidedEarthquakeOverrideReason(strCIM_ComputerCoverage_TXT_EarthquakeCoverageProvidedEarthquakeOverrideReason), getCIM_ComputerCoverage_BTN_EarthquakeCoverageProvidedEarthquakeOverrideReasonSearch(strCIM_ComputerCoverage_TXT_EarthquakeCoverageProvidedEarthquakeOverrideReason), strCIM_ComputerCoverage_TXT_EarthquakeCoverageProvidedEarthquakeOverrideReason, constants.NA, strCIM_ComputerCoverage_TXT_EarthquakeCoverageProvidedEarthquakeOverrideReason, constants.NA, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_EarthquakeBaseRate(strCIM_ComputerCoverage_TXT_EarthquakeBaseRate),strCIM_ComputerCoverage_TXT_EarthquakeBaseRate,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_EarthquakeBaseRateOverride(strCIM_ComputerCoverage_TXT_EarthquakeBaseRateOverride),strCIM_ComputerCoverage_TXT_EarthquakeBaseRateOverride,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_EarthquakeDeductibleFactor(strCIM_ComputerCoverage_TXT_EarthquakeDeductibleFactor),strCIM_ComputerCoverage_TXT_EarthquakeDeductibleFactor,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_EarthquakeFinalRate(strCIM_ComputerCoverage_TXT_EarthquakeFinalRate),strCIM_ComputerCoverage_TXT_EarthquakeFinalRate,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_EarthquakeOverrideFinalRate(strCIM_ComputerCoverage_TXT_EarthquakeOverrideFinalRate),strCIM_ComputerCoverage_TXT_EarthquakeOverrideFinalRate,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_EarthquakeRatingDetailsBoxCatastropheLimit(strCIM_ComputerCoverage_TXT_EarthquakeRatingDetailsBoxCatastropheLimit),strCIM_ComputerCoverage_TXT_EarthquakeRatingDetailsBoxCatastropheLimit,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_EarthquakeRatingDetailsBoxEarthquakePremium(strCIM_ComputerCoverage_TXT_EarthquakeRatingDetailsBoxEarthquakePremium),strCIM_ComputerCoverage_TXT_EarthquakeRatingDetailsBoxEarthquakePremium,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_EarthquakeRatingDetailsBoxEarthquakeOverridePremium(strCIM_ComputerCoverage_TXT_EarthquakeRatingDetailsBoxEarthquakeOverridePremium),strCIM_ComputerCoverage_TXT_EarthquakeRatingDetailsBoxEarthquakeOverridePremium,test);
		
		//Flood
		se.element().checkUncheckOrValidate(getCIM_ComputerCoverage_CHK_FloodCoverageProvided(strCIM_ComputerCoverage_CHK_FloodCoverageProvided),strCIM_ComputerCoverage_CHK_FloodCoverageProvided,test);
		se.element().checkUncheckOrValidate(getCIM_ComputerCoverage_CHK_FloodCoverageNotProvided(strCIM_ComputerCoverage_CHK_FloodCoverageNotProvided),strCIM_ComputerCoverage_CHK_FloodCoverageNotProvided,test);
		se.element().checkUncheckOrValidate(getCIM_ComputerCoverage_CHK_FloodReferToEarthquakeAndFloodAndSewerBackupEndorsement(strCIM_ComputerCoverage_CHK_FloodReferToEarthquakeAndFloodAndSewerBackupEndorsement),strCIM_ComputerCoverage_CHK_FloodReferToEarthquakeAndFloodAndSewerBackupEndorsement,test);
		se.element().selectPopupWithMagnifier(getCIM_ComputerCoverage_TXT_FloodDeductibleAmount(strCIM_ComputerCoverage_TXT_FloodDeductibleAmount), getCIM_ComputerCoverage_BTN_FloodDeductibleAmountSearch(strCIM_ComputerCoverage_TXT_FloodDeductibleAmount), strCIM_ComputerCoverage_TXT_FloodDeductibleAmount, constants.NA, strCIM_ComputerCoverage_TXT_FloodDeductibleAmount, constants.NA, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_FloodCatastropheLimit(strCIM_ComputerCoverage_TXT_FloodCatastropheLimit),strCIM_ComputerCoverage_TXT_FloodCatastropheLimit,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_FloodAggregateLimit(strCIM_ComputerCoverage_TXT_FloodAggregateLimit),strCIM_ComputerCoverage_TXT_FloodAggregateLimit,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_FloodOccurenceLimit(strCIM_ComputerCoverage_TXT_FloodOccurenceLimit),strCIM_ComputerCoverage_TXT_FloodOccurenceLimit,test);
		se.element().checkUncheckOrValidate(getCIM_ComputerCoverage_CHK_FloodCoverageProvidedFloodOverrideBaseRate_Yes(strCIM_ComputerCoverage_CHK_FloodCoverageProvidedFloodOverrideBaseRate_Yes),strCIM_ComputerCoverage_CHK_FloodCoverageProvidedFloodOverrideBaseRate_Yes,test);
		se.element().checkUncheckOrValidate(getCIM_ComputerCoverage_CHK_FloodCoverageProvidedFloodOverrideBaseRate_No(strCIM_ComputerCoverage_CHK_FloodCoverageProvidedFloodOverrideBaseRate_No),strCIM_ComputerCoverage_CHK_FloodCoverageProvidedFloodOverrideBaseRate_No,test);
		se.element().selectPopupWithMagnifier(getCIM_ComputerCoverage_TXT_FloodCoverageProvidedFloodOverrideReason(strCIM_ComputerCoverage_TXT_FloodCoverageProvidedFloodOverrideReason), getCIM_ComputerCoverage_BTN_FloodCoverageProvidedFloodOverrideReasonSearch(strCIM_ComputerCoverage_TXT_FloodCoverageProvidedFloodOverrideReason), strCIM_ComputerCoverage_TXT_FloodCoverageProvidedFloodOverrideReason, constants.NA, strCIM_ComputerCoverage_TXT_FloodCoverageProvidedFloodOverrideReason, constants.NA, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_FloodBaseRate(strCIM_ComputerCoverage_TXT_FloodBaseRate),strCIM_ComputerCoverage_TXT_FloodBaseRate,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_FloodBaseRateOverride(strCIM_ComputerCoverage_TXT_FloodBaseRateOverride),strCIM_ComputerCoverage_TXT_FloodBaseRateOverride,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_FloodDeductibleFactor(strCIM_ComputerCoverage_TXT_FloodDeductibleFactor),strCIM_ComputerCoverage_TXT_FloodDeductibleFactor,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_FloodFinalRate(strCIM_ComputerCoverage_TXT_FloodFinalRate),strCIM_ComputerCoverage_TXT_FloodFinalRate,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_FloodOverrideFinalRate(strCIM_ComputerCoverage_TXT_FloodOverrideFinalRate),strCIM_ComputerCoverage_TXT_FloodOverrideFinalRate,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_FloodRatingDetailsBoxCatastropheLimit(strCIM_ComputerCoverage_TXT_FloodRatingDetailsBoxCatastropheLimit),strCIM_ComputerCoverage_TXT_FloodRatingDetailsBoxCatastropheLimit,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_FloodRatingDetailsBoxFloodPremium(strCIM_ComputerCoverage_TXT_FloodRatingDetailsBoxFloodPremium),strCIM_ComputerCoverage_TXT_FloodRatingDetailsBoxFloodPremium,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_FloodRatingDetailsBoxFloodOverridePremium(strCIM_ComputerCoverage_TXT_FloodRatingDetailsBoxFloodOverridePremium),strCIM_ComputerCoverage_TXT_FloodRatingDetailsBoxFloodOverridePremium,test);
		
		//Sewer BackUp
		se.element().checkUncheckOrValidate(getCIM_ComputerCoverage_CHK_SewerBackupCoverageProvided(strCIM_ComputerCoverage_CHK_SewerBackupCoverageProvided),strCIM_ComputerCoverage_CHK_SewerBackupCoverageProvided,test);
		se.element().checkUncheckOrValidate(getCIM_ComputerCoverage_CHK_SewerBackupCoverageNotProvided(strCIM_ComputerCoverage_CHK_SewerBackupCoverageNotProvided),strCIM_ComputerCoverage_CHK_SewerBackupCoverageNotProvided,test);
		se.element().checkUncheckOrValidate(getCIM_ComputerCoverage_CHK_SewerBackupReferToEarthquakeAndFloodAndSewerBackupEndorsement(strCIM_ComputerCoverage_CHK_SewerBackupReferToEarthquakeAndFloodAndSewerBackupEndorsement),strCIM_ComputerCoverage_CHK_SewerBackupReferToEarthquakeAndFloodAndSewerBackupEndorsement,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_SewerBackupCatastropheLimit(strCIM_ComputerCoverage_TXT_SewerBackupCatastropheLimit),strCIM_ComputerCoverage_TXT_SewerBackupCatastropheLimit,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_SewerBackupAggregateLimit(strCIM_ComputerCoverage_TXT_SewerBackupAggregateLimit),strCIM_ComputerCoverage_TXT_SewerBackupAggregateLimit,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_SewerBackupOccurenceLimit(strCIM_ComputerCoverage_TXT_SewerBackupOccurenceLimit),strCIM_ComputerCoverage_TXT_SewerBackupOccurenceLimit,test);
		
		se.element().checkUncheckOrValidate(getCIM_ComputerCoverage_CHK_SewerBackupCoverageProvidedSewerBackupOverrideBaseRate_Yes(strCIM_ComputerCoverage_CHK_SewerBackupCoverageProvidedSewerBackupOverrideBaseRate_Yes),strCIM_ComputerCoverage_CHK_SewerBackupCoverageProvidedSewerBackupOverrideBaseRate_Yes,test);
		se.element().checkUncheckOrValidate(getCIM_ComputerCoverage_CHK_SewerBackupCoverageProvidedSewerBackupOverrideBaseRate_No(strCIM_ComputerCoverage_CHK_SewerBackupCoverageProvidedSewerBackupOverrideBaseRate_No),strCIM_ComputerCoverage_CHK_SewerBackupCoverageProvidedSewerBackupOverrideBaseRate_No,test);
		se.element().selectPopupWithMagnifier(getCIM_ComputerCoverage_TXT_SewerBackupCoverageProvidedSewerBackupOverrideReason(strCIM_ComputerCoverage_TXT_SewerBackupCoverageProvidedSewerBackupOverrideReason), getCIM_ComputerCoverage_BTN_SewerBackupCoverageProvidedSewerBackupOverrideReasonSearch(strCIM_ComputerCoverage_TXT_SewerBackupCoverageProvidedSewerBackupOverrideReason), strCIM_ComputerCoverage_TXT_SewerBackupCoverageProvidedSewerBackupOverrideReason, constants.NA, strCIM_ComputerCoverage_TXT_SewerBackupCoverageProvidedSewerBackupOverrideReason, constants.NA, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_SewerBackupBaseRate(strCIM_ComputerCoverage_TXT_SewerBackupBaseRate),strCIM_ComputerCoverage_TXT_SewerBackupBaseRate,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_SewerBackupBaseRateOverride(strCIM_ComputerCoverage_TXT_SewerBackupBaseRateOverride),strCIM_ComputerCoverage_TXT_SewerBackupBaseRateOverride,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_SewerBackupComputerDeductibleFactor(strCIM_ComputerCoverage_TXT_SewerBackupComputerDeductibleFactor),strCIM_ComputerCoverage_TXT_SewerBackupComputerDeductibleFactor,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_SewerBackupFinalRate(strCIM_ComputerCoverage_TXT_SewerBackupFinalRate),strCIM_ComputerCoverage_TXT_SewerBackupFinalRate,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_SewerBackupOverrideFinalRate(strCIM_ComputerCoverage_TXT_SewerBackupOverrideFinalRate),strCIM_ComputerCoverage_TXT_SewerBackupOverrideFinalRate,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxCatastropheLimit(strCIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxCatastropheLimit),strCIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxCatastropheLimit,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxSewerBackupPremium(strCIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxSewerBackupPremium),strCIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxSewerBackupPremium,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxSewerBackupOverridePremium(strCIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxSewerBackupOverridePremium),strCIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxSewerBackupOverridePremium,test);
		//se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxComputerDeductibleFactor(strCIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxComputerDeductibleFactor),strCIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxComputerDeductibleFactor,test);
	}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for ComputerCoverageRatingBoxDetails", true, false, true, test);		
			}
	
}

public void IncomeCoverageAndExtensions(Map<String, String> row, ExtentTest test) throws IOException {

	String strCIM_ComputerCoverage_TXT_IncomeCoinsurance = (String) row.get("CIM_ComputerCoverage_TXT_IncomeCoinsurance");
	String strCIM_ComputerCoverage_CHK_IncomeCoverageOptions_EarningsAndExtraExpense = (String) row.get("CIM_ComputerCoverage_CHK_IncomeCoverageOptions_EarningsAndExtraExpense");
	String strCIM_ComputerCoverage_CHK_IncomeCoverageOptions_ExtraExpenseOnly = (String) row.get("CIM_ComputerCoverage_CHK_IncomeCoverageOptions_ExtraExpenseOnly");
	String strCIM_ComputerCoverage_TXT_IncomeCoverageWaitingPeriods = (String) row.get("CIM_ComputerCoverage_TXT_IncomeCoverageWaitingPeriods");
	String strCIM_ComputerCoverage_TXT_InterruptionByCivilAuthority = (String) row.get("CIM_ComputerCoverage_TXT_InterruptionByCivilAuthority");
	String strCIM_ComputerCoverage_TXT_PeriodOfLossExtension = (String) row.get("CIM_ComputerCoverage_TXT_PeriodOfLossExtension");
	String transaction = (String) row.get("Transaction Name");		
	
	try{
		se.log().logTestStep("IncomeCoverageAndExtensions");
		test.log(LogStatus.INFO, "IncomeCoverageAndExtensions section","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMComputerCoverage");
		
		se.element().selectPopupWithMagnifier(getCIM_ComputerCoverage_TXT_IncomeCoinsurance(strCIM_ComputerCoverage_TXT_IncomeCoinsurance), getCIM_ComputerCoverage_BTN_IncomeCoinsuranceSearch(strCIM_ComputerCoverage_TXT_IncomeCoinsurance), strCIM_ComputerCoverage_TXT_IncomeCoinsurance, constants.NA, strCIM_ComputerCoverage_TXT_IncomeCoinsurance, constants.NA, constants.NA, constants.NA, test);
		se.element().checkUncheckOrValidate(getCIM_ComputerCoverage_CHK_IncomeCoverageOptions_EarningsAndExtraExpense(strCIM_ComputerCoverage_CHK_IncomeCoverageOptions_EarningsAndExtraExpense),strCIM_ComputerCoverage_CHK_IncomeCoverageOptions_EarningsAndExtraExpense,test);
		se.element().checkUncheckOrValidate(getCIM_ComputerCoverage_CHK_IncomeCoverageOptions_ExtraExpenseOnly(strCIM_ComputerCoverage_CHK_IncomeCoverageOptions_ExtraExpenseOnly),strCIM_ComputerCoverage_CHK_IncomeCoverageOptions_ExtraExpenseOnly,test);
		se.element().selectPopupWithMagnifier(getCIM_ComputerCoverage_TXT_IncomeCoverageWaitingPeriods(strCIM_ComputerCoverage_TXT_IncomeCoverageWaitingPeriods), getCIM_ComputerCoverage_BTN_IncomeCoverageWaitingPeriodsSearch(strCIM_ComputerCoverage_TXT_IncomeCoverageWaitingPeriods), strCIM_ComputerCoverage_TXT_IncomeCoverageWaitingPeriods, constants.NA, strCIM_ComputerCoverage_TXT_IncomeCoverageWaitingPeriods, constants.NA, constants.NA, constants.NA, test);
		//se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_IncomeCoverageWaitingPeriods(strCIM_ComputerCoverage_TXT_IncomeCoverageWaitingPeriods),strCIM_ComputerCoverage_TXT_IncomeCoverageWaitingPeriods,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_InterruptionByCivilAuthority(strCIM_ComputerCoverage_TXT_InterruptionByCivilAuthority),strCIM_ComputerCoverage_TXT_InterruptionByCivilAuthority,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_PeriodOfLossExtension(strCIM_ComputerCoverage_TXT_PeriodOfLossExtension),strCIM_ComputerCoverage_TXT_PeriodOfLossExtension,test);
}
	catch(Exception e){
		se.verify().verifyEquals("Failed to fill in details for IncomeCoverageAndExtensions", true, false, true, test);
				
		}

}

public void SupplementalIncomeCoverage(Map<String, String> row, ExtentTest test) throws IOException {

	String strCIM_ComputerCoverage_TXT_SupplemetalIncomeCoverageAcquiredLocationLimit = (String) row.get("CIM_ComputerCoverage_TXT_SupplemetalIncomeCoverageAcquiredLocationLimit");
	String strCIM_ComputerCoverage_TXT_OffPremisesUtilityServiceInterruptionLimit = (String) row.get("CIM_ComputerCoverage_TXT_OffPremisesUtilityServiceInterruptionLimit");
	String strCIM_ComputerCoverage_TXT_OverheadTransmissionLinesExtension = (String) row.get("CIM_ComputerCoverage_TXT_OverheadTransmissionLinesExtension");
	String strCIM_ComputerCoverage_TXT_WaitingPeriod = (String) row.get("CIM_ComputerCoverage_TXT_WaitingPeriod");
	String strCIM_ComputerCoverage_TXT_PropertyInTransit = (String) row.get("CIM_ComputerCoverage_TXT_PropertyInTransit");
	String transaction = (String) row.get("Transaction Name");
	
	try{
		se.log().logTestStep("SupplementalIncomeCoverage");
		test.log(LogStatus.INFO, "SupplementalIncomeCoverage section","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMComputerCoverage");
		
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_SupplemetalIncomeCoverageAcquiredLocationLimit(strCIM_ComputerCoverage_TXT_SupplemetalIncomeCoverageAcquiredLocationLimit),strCIM_ComputerCoverage_TXT_SupplemetalIncomeCoverageAcquiredLocationLimit,test);
		if(se.element().isElementPresent(CIM_ComputerCoverage_BTN_OKButton)){
			se.element().Click(getCIM_ComputerCoverage_BTN_OKButton(), test);
		}
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_SupplemetalIncomeCoverageAcquiredLocationLimit(strCIM_ComputerCoverage_TXT_SupplemetalIncomeCoverageAcquiredLocationLimit),strCIM_ComputerCoverage_TXT_SupplemetalIncomeCoverageAcquiredLocationLimit,test);
		if(se.element().isElementPresent(CIM_ComputerCoverage_BTN_OKButton)){
			se.element().Click(getCIM_ComputerCoverage_BTN_OKButton(), test);
		}
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_OffPremisesUtilityServiceInterruptionLimit(strCIM_ComputerCoverage_TXT_OffPremisesUtilityServiceInterruptionLimit),strCIM_ComputerCoverage_TXT_OffPremisesUtilityServiceInterruptionLimit,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_OverheadTransmissionLinesExtension(strCIM_ComputerCoverage_TXT_OverheadTransmissionLinesExtension),strCIM_ComputerCoverage_TXT_OverheadTransmissionLinesExtension,test);
		se.element().selectPopupWithMagnifier(getCIM_ComputerCoverage_TXT_WaitingPeriod(strCIM_ComputerCoverage_TXT_WaitingPeriod), getCIM_ComputerCoverage_BTN_WaitingPeriodSearch(strCIM_ComputerCoverage_TXT_WaitingPeriod), strCIM_ComputerCoverage_TXT_WaitingPeriod, constants.NA, strCIM_ComputerCoverage_TXT_WaitingPeriod, constants.NA, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_PropertyInTransit(strCIM_ComputerCoverage_TXT_PropertyInTransit),strCIM_ComputerCoverage_TXT_PropertyInTransit,test);
}
	catch(Exception e){
		se.verify().verifyEquals("Failed to fill in details for SupplementalIncomeCoverage", true, false, true, test);
				
		}
}


public void VirusAndHackingCoverage(Map<String, String> row, ExtentTest test) throws IOException {
	
	String strCIM_ComputerCoverage_TXT_LimitAnyOneOccurrence = (String) row.get("CIM_ComputerCoverage_TXT_LimitAnyOneOccurrence");
	String strCIM_ComputerCoverage_TXT_LimitEachSeparate12MonthsPeriod = (String) row.get("CIM_ComputerCoverage_TXT_LimitEachSeparate12MonthsPeriod");
	String strCIM_ComputerCoverage_TXT_VirusAndHackingCoverageWaitingPeriod = (String) row.get("CIM_ComputerCoverage_TXT_VirusAndHackingCoverageWaitingPeriod");
	String strCIM_ComputerCoverage_TXT_AdditionalInformation = (String) row.get("CIM_ComputerCoverage_TXT_AdditionalInformation");
	String transaction = (String) row.get("Transaction Name");
	
	try{
		se.log().logTestStep("VirusAndHackingCoverage");
		test.log(LogStatus.INFO, "VirusAndHackingCoverage section","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMComputerCoverage");
		
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_LimitAnyOneOccurrence(strCIM_ComputerCoverage_TXT_LimitAnyOneOccurrence),strCIM_ComputerCoverage_TXT_LimitAnyOneOccurrence,test);
		if(se.element().isElementPresent(CIM_ComputerCoverage_BTN_OKButton)){
			se.element().Click(getCIM_ComputerCoverage_BTN_OKButton(), test);
		}
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_LimitAnyOneOccurrence(strCIM_ComputerCoverage_TXT_LimitAnyOneOccurrence),strCIM_ComputerCoverage_TXT_LimitAnyOneOccurrence,test);
		
		if(se.element().isElementPresent(CIM_ComputerCoverage_BTN_OKButton)){
			se.element().Click(getCIM_ComputerCoverage_BTN_OKButton(), test);
		}
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_LimitEachSeparate12MonthsPeriod(strCIM_ComputerCoverage_TXT_LimitEachSeparate12MonthsPeriod),strCIM_ComputerCoverage_TXT_LimitEachSeparate12MonthsPeriod,test);
		se.element().selectPopupWithMagnifier(getCIM_ComputerCoverage_TXT_VirusAndHackingCoverageWaitingPeriod(strCIM_ComputerCoverage_TXT_VirusAndHackingCoverageWaitingPeriod), getCIM_ComputerCoverage_BTN_VirusAndHackingCoverageWaitingPeriodSearch(strCIM_ComputerCoverage_TXT_VirusAndHackingCoverageWaitingPeriod), strCIM_ComputerCoverage_TXT_VirusAndHackingCoverageWaitingPeriod, constants.NA, strCIM_ComputerCoverage_TXT_VirusAndHackingCoverageWaitingPeriod, constants.NA, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_AdditionalInformation(strCIM_ComputerCoverage_TXT_AdditionalInformation),strCIM_ComputerCoverage_TXT_AdditionalInformation,test);
}
	catch(Exception e){
		se.verify().verifyEquals("Failed to fill in details for VirusAndHackingCoverage", true, false, true, test);
				
		}
}


public void ComputerCoverageFinalRatingDetails(Map<String, String> row, ExtentTest test) throws IOException {
	
	String strCIM_ComputerCoverage_TXT_ComputerBasePremium = (String) row.get("CIM_ComputerCoverage_TXT_ComputerBasePremium");
	String strCIM_ComputerCoverage_TXT_ComputerOverridePremium = (String) row.get("CIM_ComputerCoverage_TXT_ComputerOverridePremium");
	String strCIM_ComputerCoverage_TXT_EarthquakePremium = (String) row.get("CIM_ComputerCoverage_TXT_EarthquakePremium");
	String strCIM_ComputerCoverage_TXT_EarthquakeOverridePremium = (String) row.get("CIM_ComputerCoverage_TXT_EarthquakeOverridePremium");
	String strCIM_ComputerCoverage_TXT_FloodPremium = (String) row.get("CIM_ComputerCoverage_TXT_FloodPremium");
	String strCIM_ComputerCoverage_TXT_FloodOverridePremium = (String) row.get("CIM_ComputerCoverage_TXT_FloodOverridePremium");
	String strCIM_ComputerCoverage_TXT_SewerBackupPremium = (String) row.get("CIM_ComputerCoverage_TXT_SewerBackupPremium");
	String strCIM_ComputerCoverage_TXT_SewerBackupOverridePremium = (String) row.get("CIM_ComputerCoverage_TXT_SewerBackupOverridePremium");
	String strCIM_ComputerCoverage_TXT_FinalComputerCoveragePremium = (String) row.get("CIM_ComputerCoverage_TXT_FinalComputerCoveragePremium");
	String transaction = (String) row.get("Transaction Name");
	
	try{
		se.log().logTestStep("ComputerCoverageFinalRatingDetails");
		test.log(LogStatus.INFO, "ComputerCoverageFinalRatingDetails section","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMComputerCoverage");
		
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_ComputerBasePremium(strCIM_ComputerCoverage_TXT_ComputerBasePremium),strCIM_ComputerCoverage_TXT_ComputerBasePremium,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_ComputerOverridePremium(strCIM_ComputerCoverage_TXT_ComputerOverridePremium),strCIM_ComputerCoverage_TXT_ComputerOverridePremium,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_EarthquakePremium(strCIM_ComputerCoverage_TXT_EarthquakePremium),strCIM_ComputerCoverage_TXT_EarthquakePremium,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_EarthquakeOverridePremium(strCIM_ComputerCoverage_TXT_EarthquakeOverridePremium),strCIM_ComputerCoverage_TXT_EarthquakeOverridePremium,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_FloodPremium(strCIM_ComputerCoverage_TXT_FloodPremium),strCIM_ComputerCoverage_TXT_FloodPremium,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_FloodOverridePremium(strCIM_ComputerCoverage_TXT_FloodOverridePremium),strCIM_ComputerCoverage_TXT_FloodOverridePremium,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_SewerBackupPremium(strCIM_ComputerCoverage_TXT_SewerBackupPremium),strCIM_ComputerCoverage_TXT_SewerBackupPremium,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_SewerBackupOverridePremium(strCIM_ComputerCoverage_TXT_SewerBackupOverridePremium),strCIM_ComputerCoverage_TXT_SewerBackupOverridePremium,test);
		se.element().enterOrValidateText(getCIM_ComputerCoverage_TXT_FinalComputerCoveragePremium(strCIM_ComputerCoverage_TXT_FinalComputerCoveragePremium),strCIM_ComputerCoverage_TXT_FinalComputerCoveragePremium,test);
				
}
	catch(Exception e){
		se.verify().verifyEquals("Failed to fill in details for ComputerCoverageFinalRatingDetails", true, false, true, test);
				
		}
}

}






