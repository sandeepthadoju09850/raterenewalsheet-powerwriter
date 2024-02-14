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

public class CIM_ContractorsOtherCoverages extends OR_CIM {
	
	public void CIMContractorsOtherCoverages(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_Contractors-OtherCoverages")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_Contractors-OtherCoverages", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		try {
		
			CIM_ContractorsOtherCoverages CIMContractorsOtherCoverages =  TestPageFactory.initElements(se, CIM_ContractorsOtherCoverages.class);
		
			CIMContractorsOtherCoverages.EquipmentBorrowedFromOthers(row,test);
			CIMContractorsOtherCoverages.EquipmentLeaseOrRentedToOthersSchedule(row,test);
			CIMContractorsOtherCoverages.EquipmentTheftRecoverySystem(row,test);
			CIMContractorsOtherCoverages.LoggingEquipmentProtectionSafeguard(row,test);
			CIMContractorsOtherCoverages.PropertyLoanedToOthersJobsiteCoverage(row,test);
			CIMContractorsOtherCoverages.ToolsEndorsement(row,test);
			CIMContractorsOtherCoverages.WaterWellDrillersRigAndRecoveryCoverage(row,test);
			CIMContractorsOtherCoverages.WeightOfLoadExclusion(row,test);
			
			se.element().Click(getNext(),test);
			
		}catch (Exception e) {
		se.verify().verifyEquals("Failed to fill in details for Contractor Other Coverages", true, false, true, test);
		
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
	
	public void EquipmentBorrowedFromOthers(Map<String, String> row, ExtentTest test) throws IOException {
	
		String strCIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthers = (String) row.get("CIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthers");
		String strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerItemLimit = (String) row.get("CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerItemLimit");
		String strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerOccurenceLimit = (String) row.get("CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerOccurenceLimit");
		String strCIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthersOverrideBaseRate_Yes = (String) row.get("CIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthersOverrideBaseRate_Yes");
		String strCIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthersOverrideBaseRate_No = (String) row.get("CIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthersOverrideBaseRate_No");
		String strCIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthersOverrideReason = (String) row.get("CIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthersOverrideReason");
		String strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersBaseRate = (String) row.get("CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersBaseRate");
		String strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersBaseRateOverride = (String) row.get("CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersBaseRateOverride");
		String strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersContractorsEquipmentDeductibleFactor = (String) row.get("CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersContractorsEquipmentDeductibleFactor");
		String strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersTransitionFactor = (String) row.get("CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersTransitionFactor");
		String strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersFinalRate = (String) row.get("CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersFinalRate");
		String strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersOverrideFinalRate = (String) row.get("CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersOverrideFinalRate");
		String strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersRatingDetailsPerOccurenceLimit = (String) row.get("CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersRatingDetailsPerOccurenceLimit");
		String strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPremium = (String) row.get("CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPremium");
		String strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersOverridePremium = (String) row.get("CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersOverridePremium");
		String strCIM_ContractorsOtherCoverages_TXT_AnyOneOccurenceLimit = (String) row.get("CIM_ContractorsOtherCoverages_TXT_AnyOneOccurenceLimit");
		
		String strTestDescription = (String) row.get("Transaction Name");

		try{
			se.log().logTestStep("EquipmentBorrowedFromOthers");
			test.log(LogStatus.INFO, "EquipmentBorrowedFromOthers section","Transaction Step : "+strTestDescription + "<br>" +"Page : CP_CIMContractorsOtherCoverages");
			se.verify().verifyEquals("EquipmentBorrowedFromOthers section of PowerWriter ", getCIM_ContractorsOtherCoverages_TXT_VerifyContractorsOtherCoveragesText().isDisplayed(),true, true,test);
			
			se.element().checkUncheckOrValidate(getCIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthers(strCIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthers),strCIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthers,test);
			if(!strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerItemLimit.equalsIgnoreCase(constants.NA)&& !strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerItemLimit.contains(constants.Validate)){
				se.element().clearTheField(getCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerItemLimit(strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerItemLimit));
				se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerItemLimit(strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerItemLimit),strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerItemLimit,test);
			}else{
				se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerItemLimit(strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerItemLimit),strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerItemLimit,test);
			}
			if(!strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerOccurenceLimit.equalsIgnoreCase(constants.NA)&& !strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerOccurenceLimit.contains(constants.Validate)){
				se.element().clearTheField(getCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerOccurenceLimit(strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerOccurenceLimit));
				se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerOccurenceLimit(strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerOccurenceLimit),strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerOccurenceLimit,test);
			}else{
				se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerOccurenceLimit(strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerOccurenceLimit),strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerOccurenceLimit,test);
			}
			
			
			se.element().checkUncheckOrValidate(getCIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthersOverrideBaseRate_Yes(strCIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthersOverrideBaseRate_Yes),strCIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthersOverrideBaseRate_Yes,test);
			se.element().checkUncheckOrValidate(getCIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthersOverrideBaseRate_No(strCIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthersOverrideBaseRate_No),strCIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthersOverrideBaseRate_No,test);
			se.element().checkUncheckOrValidate(getCIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthersOverrideReason(strCIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthersOverrideReason),strCIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthersOverrideReason,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersBaseRate(strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersBaseRate),strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersBaseRate,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersBaseRateOverride(strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersBaseRateOverride),strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersBaseRateOverride,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersContractorsEquipmentDeductibleFactor(strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersContractorsEquipmentDeductibleFactor),strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersContractorsEquipmentDeductibleFactor,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersTransitionFactor(strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersTransitionFactor),strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersTransitionFactor,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersFinalRate(strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersFinalRate),strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersFinalRate,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersOverrideFinalRate(strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersOverrideFinalRate),strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersOverrideFinalRate,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersRatingDetailsPerOccurenceLimit(strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersRatingDetailsPerOccurenceLimit),strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersRatingDetailsPerOccurenceLimit,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPremium(strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPremium),strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPremium,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersOverridePremium(strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersOverridePremium),strCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersOverridePremium,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_AnyOneOccurenceLimit(strCIM_ContractorsOtherCoverages_TXT_AnyOneOccurenceLimit),strCIM_ContractorsOtherCoverages_TXT_AnyOneOccurenceLimit,test);
			
	}catch (Exception e) {
		se.verify().verifyEquals("Failed to fill in details for EquipmentBorrowedFromOthers ", true, false, true, test);
	}
}
	
	
	public void EquipmentLeaseOrRentedToOthersSchedule(Map<String, String> row, ExtentTest test) throws IOException {
	
		String strCIM_ContractorsOtherCoverages_CHK_EuipmentsLeasedOrRentedToOthersSchedule = (String) row.get("CIM_ContractorsOtherCoverages_CHK_EuipmentsLeasedOrRentedToOthersSchedule");
		String strCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersEquipmentLimit = (String) row.get("CIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersEquipmentLimit");
		String strCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersCatastropheLimit = (String) row.get("CIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersCatastropheLimit");
		String strCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersDeductible = (String) row.get("CIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersDeductible");
		String strCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersBasePremium = (String) row.get("CIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersBasePremium");
		String strCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersDeductibleFactor = (String) row.get("CIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersDeductibleFactor");
		String strCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersTransitionFactor = (String) row.get("CIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersTransitionFactor");
		String strCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersFinalPremium = (String) row.get("CIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersFinalPremium");
		
		String strTestDescription = (String) row.get("Transaction Name");

		try{
			se.log().logTestStep("EquipmentLeaseOrRentedToOthersSchedule");
			test.log(LogStatus.INFO, "EquipmentLeaseOrRentedToOthersSchedule section","Transaction Step : "+strTestDescription + "<br>" +"Page : CP_CIMContractorsOtherCoverages");
		
			se.element().checkUncheckOrValidate(getCIM_ContractorsOtherCoverages_CHK_EuipmentsLeasedOrRentedToOthersSchedule(strCIM_ContractorsOtherCoverages_CHK_EuipmentsLeasedOrRentedToOthersSchedule),strCIM_ContractorsOtherCoverages_CHK_EuipmentsLeasedOrRentedToOthersSchedule,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersEquipmentLimit(strCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersEquipmentLimit),strCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersEquipmentLimit,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersCatastropheLimit(strCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersCatastropheLimit),strCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersCatastropheLimit,test);
			
			if(!strCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersDeductible.equalsIgnoreCase("N/A") && !strCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersDeductible.contains("validate2")) {
				se.element().clickSearchIcon(getCIM_ContractorsOtherCoverages_BTN_EquipmentLeaseOrRentedToOthersDeductibleSearch(), test);
				se.element().Click(getCIM_ContractorsOtherCoverages_LNK_EquipmentLeaseOrRentedToOthersDeductibleOption(strCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersDeductible),test);
			}else {
				se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersDeductible(strCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersDeductible),strCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersDeductible,test);
			}
			
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersBasePremium(strCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersBasePremium),strCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersBasePremium,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersDeductibleFactor(strCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersDeductibleFactor),strCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersDeductibleFactor,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersTransitionFactor(strCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersTransitionFactor),strCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersTransitionFactor,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersFinalPremium(strCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersFinalPremium),strCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersFinalPremium,test);
			
		}catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for EquipmentLeaseOrRentedToOthersSchedule ", true, false, true, test);
		}
		
		
}
	
	public void EquipmentTheftRecoverySystem(Map<String, String> row, ExtentTest test) throws IOException {

		String strCIM_ContractorsOtherCoverages_CHK_EquipmentTheftRecoverySystem = (String) row.get("CIM_ContractorsOtherCoverages_CHK_EquipmentTheftRecoverySystem");
		String strTestDescription = (String) row.get("Transaction Name");
		
		try{
			se.log().logTestStep("EquipmentTheftRecoverySystem");
			test.log(LogStatus.INFO, "EquipmentTheftRecoverySystem section","Transaction Step : "+strTestDescription + "<br>" +"Page : CP_CIMContractorsOtherCoverages");
		
			se.element().checkUncheckOrValidate(getCIM_ContractorsOtherCoverages_CHK_EquipmentTheftRecoverySystem(strCIM_ContractorsOtherCoverages_CHK_EquipmentTheftRecoverySystem),strCIM_ContractorsOtherCoverages_CHK_EquipmentTheftRecoverySystem,test);
		}catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for EquipmentTheftRecoverySystem ", true, false, true, test);
		}
		
	}

	public void LoggingEquipmentProtectionSafeguard(Map<String, String> row, ExtentTest test) throws IOException {

		String strCIM_ContractorsOtherCoverages_CHK_LoggingEquipmentProtectionSafeguard = (String) row.get("CIM_ContractorsOtherCoverages_CHK_LoggingEquipmentProtectionSafeguard");
		
		String strTestDescription = (String) row.get("Transaction Name");
		
		try{
			se.log().logTestStep("LoggingEquipmentProtectionSafeguard");
			test.log(LogStatus.INFO, "LoggingEquipmentProtectionSafeguard section","Transaction Step : "+strTestDescription + "<br>" +"Page : CP_CIMContractorsOtherCoverages");
		
			se.element().checkUncheckOrValidate(getCIM_ContractorsOtherCoverages_CHK_LoggingEquipmentProtectionSafeguard(strCIM_ContractorsOtherCoverages_CHK_LoggingEquipmentProtectionSafeguard),strCIM_ContractorsOtherCoverages_CHK_LoggingEquipmentProtectionSafeguard,test);
		}catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for LoggingEquipmentProtectionSafeguard ", true, false, true, test);
		}
		
	}


	public void PropertyLoanedToOthersJobsiteCoverage(Map<String, String> row, ExtentTest test) throws IOException {

		String strCIM_ContractorsOtherCoverages_CHK_PropertyLoanedToOthersJobsiteCoverage = (String) row.get("CIM_ContractorsOtherCoverages_CHK_PropertyLoanedToOthersJobsiteCoverage");
		String strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoveragePerOccurenceLimit = (String) row.get("CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoveragePerOccurenceLimit");
		String strCIM_ContractorsOtherCoverages_CHK_PropertyLoanedToOthersJobsiteCoverageOverrideBaseRate_Yes = (String) row.get("CIM_ContractorsOtherCoverages_CHK_PropertyLoanedToOthersJobsiteCoverageOverrideBaseRate_Yes");
		String strCIM_ContractorsOtherCoverages_CHK_PropertyLoanedToOthersJobsiteCoverageOverrideBaseRate_No = (String) row.get("CIM_ContractorsOtherCoverages_CHK_PropertyLoanedToOthersJobsiteCoverageOverrideBaseRate_No");
		String strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageOverrideReason = (String) row.get("CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageOverrideReason");
		String strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageBaseRate = (String) row.get("CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageBaseRate");
		String strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageBaseRateOverride = (String) row.get("CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageBaseRateOverride");
		String strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageContractorEquipmentDeductibleFactor = (String) row.get("CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageContractorEquipmentDeductibleFactor");
		String strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageTransitionFactor = (String) row.get("CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageTransitionFactor");
		String strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageFinalRate = (String) row.get("CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageFinalRate");
		String strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageOverrideFinalRate = (String) row.get("CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageOverrideFinalRate");
		String strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageRatingDetailsOccurenceLimit = (String) row.get("CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageRatingDetailsOccurenceLimit");
		String strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoveragePremium = (String) row.get("CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoveragePremium");
		String strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageOverridePremium = (String) row.get("CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageOverridePremium");
		
		String strTestDescription = (String) row.get("Transaction Name");
		
		try{
			se.log().logTestStep("PropertyLoanedToOthersJobsiteCoverage");
			test.log(LogStatus.INFO, "PropertyLoanedToOthersJobsiteCoverage section","Transaction Step : "+strTestDescription + "<br>" +"Page : CP_CIMContractorsOtherCoverages");
		
			se.element().checkUncheckOrValidate(getCIM_ContractorsOtherCoverages_CHK_PropertyLoanedToOthersJobsiteCoverage(strCIM_ContractorsOtherCoverages_CHK_PropertyLoanedToOthersJobsiteCoverage),strCIM_ContractorsOtherCoverages_CHK_PropertyLoanedToOthersJobsiteCoverage,test);
			if(!strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoveragePerOccurenceLimit.equalsIgnoreCase(constants.NA) && !strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoveragePerOccurenceLimit.contains(constants.Validate)){
				se.element().clearTheField(getCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoveragePerOccurenceLimit(strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoveragePerOccurenceLimit));
				se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoveragePerOccurenceLimit(strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoveragePerOccurenceLimit),strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoveragePerOccurenceLimit,test);
			}else{
				se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoveragePerOccurenceLimit(strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoveragePerOccurenceLimit),strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoveragePerOccurenceLimit,test);
			}
			se.element().checkUncheckOrValidate(getCIM_ContractorsOtherCoverages_CHK_PropertyLoanedToOthersJobsiteCoverageOverrideBaseRate_Yes(strCIM_ContractorsOtherCoverages_CHK_PropertyLoanedToOthersJobsiteCoverageOverrideBaseRate_Yes),strCIM_ContractorsOtherCoverages_CHK_PropertyLoanedToOthersJobsiteCoverageOverrideBaseRate_Yes,test);
			se.element().checkUncheckOrValidate(getCIM_ContractorsOtherCoverages_CHK_PropertyLoanedToOthersJobsiteCoverageOverrideBaseRate_No(strCIM_ContractorsOtherCoverages_CHK_PropertyLoanedToOthersJobsiteCoverageOverrideBaseRate_No),strCIM_ContractorsOtherCoverages_CHK_PropertyLoanedToOthersJobsiteCoverageOverrideBaseRate_No,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageOverrideReason(strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageOverrideReason),strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageOverrideReason,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageBaseRate(strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageBaseRate),strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageBaseRate,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageBaseRateOverride(strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageBaseRateOverride),strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageBaseRateOverride,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageContractorEquipmentDeductibleFactor(strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageContractorEquipmentDeductibleFactor),strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageContractorEquipmentDeductibleFactor,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageTransitionFactor(strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageTransitionFactor),strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageTransitionFactor,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageFinalRate(strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageFinalRate),strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageFinalRate,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageOverrideFinalRate(strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageOverrideFinalRate),strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageOverrideFinalRate,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageRatingDetailsOccurenceLimit(strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageRatingDetailsOccurenceLimit),strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageRatingDetailsOccurenceLimit,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoveragePremium(strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoveragePremium),strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoveragePremium,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageOverridePremium(strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageOverridePremium),strCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageOverridePremium,test);
			
			
		}catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for PropertyLoanedToOthersJobsiteCoverage ", true, false, true, test);
		}
		
	}

	
	public void ToolsEndorsement(Map<String, String> row, ExtentTest test) throws IOException {

		String strCIM_ContractorsOtherCoverages_CHK_ToolsEndorsement = (String) row.get("CIM_ContractorsOtherCoverages_CHK_ToolsEndorsement");
		String strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneToolLimit = (String) row.get("CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneToolLimit");
		String strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneOccurrenceLimit = (String) row.get("CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneOccurrenceLimit");
		String strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementToolsDeductible = (String) row.get("CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementToolsDeductible");
		String strCIM_ContractorsOtherCoverages_CHK_ToolsEndorsementOverrideBaseRate_Yes = (String) row.get("CIM_ContractorsOtherCoverages_CHK_ToolsEndorsementOverrideBaseRate_Yes");
		String strCIM_ContractorsOtherCoverages_CHK_ToolsEndorsementOverrideBaseRate_No = (String) row.get("CIM_ContractorsOtherCoverages_CHK_ToolsEndorsementOverrideBaseRate_No");
		String strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOverrideReason = (String) row.get("CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOverrideReason");
		String strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementBaseRate = (String) row.get("CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementBaseRate");
		String strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementBaseRateOverride = (String) row.get("CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementBaseRateOverride");
		String strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementToolsDeductibleFactor = (String) row.get("CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementToolsDeductibleFactor");
		String strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneToolFactor = (String) row.get("CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneToolFactor");
		String strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementTransitionFactor = (String) row.get("CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementTransitionFactor");
		String strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementFinalRate = (String) row.get("CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementFinalRate");
		String strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOverrideFinalRate = (String) row.get("CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOverrideFinalRate");
		String strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOccurenceLimit = (String) row.get("CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOccurenceLimit");
		String strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementPremium = (String) row.get("CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementPremium");
		String strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOverridePremium = (String) row.get("CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOverridePremium");
		String strTestDescription = (String) row.get("Transaction Name");
		
		try{
			se.log().logTestStep("ToolsEndorsement");
			test.log(LogStatus.INFO, "ToolsEndorsement section","Transaction Step : "+strTestDescription + "<br>" +"Page : CP_CIMContractorsOtherCoverages");
		
			se.element().checkUncheckOrValidate(getCIM_ContractorsOtherCoverages_CHK_ToolsEndorsement(strCIM_ContractorsOtherCoverages_CHK_ToolsEndorsement),strCIM_ContractorsOtherCoverages_CHK_ToolsEndorsement,test);
			se.element().selectPopupWithMagnifier(getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneToolLimit(strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneToolLimit), getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneToolLimitSearch(strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneToolLimit), strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneToolLimit, constants.NA, strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneToolLimit, constants.NA, constants.NA, constants.NA, test);
			if(!strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneOccurrenceLimit.equalsIgnoreCase(constants.NA) && !strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneOccurrenceLimit.contains(constants.Validate)){
				se.element().clearTheField(getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneOccurrenceLimit(strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneOccurrenceLimit));
				se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneOccurrenceLimit(strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneOccurrenceLimit),strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneOccurrenceLimit,test);
			}else{
				se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneOccurrenceLimit(strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneOccurrenceLimit),strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneOccurrenceLimit,test);
			}
			se.element().selectPopupWithMagnifier(getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementToolsDeductible(strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementToolsDeductible), getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementToolsDeductibleSearch(), strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementToolsDeductible, constants.NA, strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementToolsDeductible, constants.NA, constants.NA,constants.NA , test);
			se.element().checkUncheckOrValidate(getCIM_ContractorsOtherCoverages_CHK_ToolsEndorsementOverrideBaseRate_Yes(strCIM_ContractorsOtherCoverages_CHK_ToolsEndorsementOverrideBaseRate_Yes),strCIM_ContractorsOtherCoverages_CHK_ToolsEndorsementOverrideBaseRate_Yes,test);
			se.element().checkUncheckOrValidate(getCIM_ContractorsOtherCoverages_CHK_ToolsEndorsementOverrideBaseRate_No(strCIM_ContractorsOtherCoverages_CHK_ToolsEndorsementOverrideBaseRate_No),strCIM_ContractorsOtherCoverages_CHK_ToolsEndorsementOverrideBaseRate_No,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOverrideReason(strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOverrideReason),strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOverrideReason,test);
			
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementBaseRate(strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementBaseRate),strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementBaseRate,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementBaseRateOverride(strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementBaseRateOverride),strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementBaseRateOverride,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementToolsDeductibleFactor(strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementToolsDeductibleFactor),strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementToolsDeductibleFactor,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneToolFactor(strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneToolFactor),strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneToolFactor,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementTransitionFactor(strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementTransitionFactor),strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementTransitionFactor,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementFinalRate(strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementFinalRate),strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementFinalRate,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOverrideFinalRate(strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOverrideFinalRate),strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOverrideFinalRate,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOccurenceLimit(strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOccurenceLimit),strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOccurenceLimit,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementPremium(strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementPremium),strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementPremium,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOverridePremium(strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOverridePremium),strCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOverridePremium,test);
			
		}catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for ToolsEndorsement ", true, false, true, test);
		}
		
	}

	
	public void WaterWellDrillersRigAndRecoveryCoverage(Map<String, String> row, ExtentTest test) throws IOException {

		String strCIM_ContractorsOtherCoverages_CHK_WaterWellDrillingRigCoverage = (String) row.get("CIM_ContractorsOtherCoverages_CHK_WaterWellDrillingRigCoverage");
		String strCIM_ContractorsOtherCoverages_CHK_WaterWellDrillersRecoveryCoverage = (String) row.get("CIM_ContractorsOtherCoverages_CHK_WaterWellDrillersRecoveryCoverage");
		String strCIM_ContractorsOtherCoverages_TXT_WaterWellDrillersRecoveryCoveragePolicyYearAggregate = (String) row.get("CIM_ContractorsOtherCoverages_TXT_WaterWellDrillersRecoveryCoveragePolicyYearAggregate");
		String strCIM_ContractorsOtherCoverages_TXT_WaterWellDrillersEndorsementsDeductible = (String) row.get("CIM_ContractorsOtherCoverages_TXT_WaterWellDrillersEndorsementsDeductible");
		String strTestDescription = (String) row.get("Transaction Name");
		
		try{
			se.log().logTestStep("WaterWellDrillersRigAndRecoveryCoverage");
			test.log(LogStatus.INFO, "WaterWellDrillersRigAndRecoveryCoverage section","Transaction Step : "+strTestDescription + "<br>" +"Page : CP_CIMContractorsOtherCoverages");
		
			se.element().checkUncheckOrValidate(getCIM_ContractorsOtherCoverages_CHK_WaterWellDrillingRigCoverage(strCIM_ContractorsOtherCoverages_CHK_WaterWellDrillingRigCoverage),strCIM_ContractorsOtherCoverages_CHK_WaterWellDrillingRigCoverage,test);
			se.element().checkUncheckOrValidate(getCIM_ContractorsOtherCoverages_CHK_WaterWellDrillersRecoveryCoverage(strCIM_ContractorsOtherCoverages_CHK_WaterWellDrillersRecoveryCoverage),strCIM_ContractorsOtherCoverages_CHK_WaterWellDrillersRecoveryCoverage,test);
			se.element().enterOrValidateText(getCIM_ContractorsOtherCoverages_TXT_WaterWellDrillersRecoveryCoveragePolicyYearAggregate(strCIM_ContractorsOtherCoverages_TXT_WaterWellDrillersRecoveryCoveragePolicyYearAggregate),strCIM_ContractorsOtherCoverages_TXT_WaterWellDrillersRecoveryCoveragePolicyYearAggregate,test);
			se.element().selectPopupWithMagnifier(getCIM_ContractorsOtherCoverages_TXT_WaterWellDrillersEndorsementsDeductible(strCIM_ContractorsOtherCoverages_TXT_WaterWellDrillersEndorsementsDeductible), getCIM_ContractorsOtherCoverages_TXT_WaterWellDrillersEndorsementsDeductibleSearch(strCIM_ContractorsOtherCoverages_TXT_WaterWellDrillersEndorsementsDeductible), strCIM_ContractorsOtherCoverages_TXT_WaterWellDrillersEndorsementsDeductible, constants.NA, strCIM_ContractorsOtherCoverages_TXT_WaterWellDrillersEndorsementsDeductible, constants.NA, constants.NA, constants.NA, test);
			
		}catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for WaterWellDrillersRigAndRecoveryCoverage ", true, false, true, test);
		}
		
	}
	
	
	public void WeightOfLoadExclusion(Map<String, String> row, ExtentTest test) throws IOException {
		
		String strCIM_ContractorsOtherCoverages_CHK_WeightOfLoadExclusion = (String) row.get("CIM_ContractorsOtherCoverages_CHK_WeightOfLoadExclusion");
		String strTestDescription = (String) row.get("Transaction Name");
		
		try{
			se.log().logTestStep("WeightOfLoadExclusion");
			test.log(LogStatus.INFO, "WeightOfLoadExclusion section","Transaction Step : "+strTestDescription + "<br>" +"Page : CP_CIMContractorsOtherCoverages");
		
			se.element().checkUncheckOrValidate(getCIM_ContractorsOtherCoverages_CHK_WeightOfLoadExclusion(strCIM_ContractorsOtherCoverages_CHK_WeightOfLoadExclusion),strCIM_ContractorsOtherCoverages_CHK_WeightOfLoadExclusion,test);
		}catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for WeightOfLoadExclusion ", true, false, true, test);
		}
		
	}
}












