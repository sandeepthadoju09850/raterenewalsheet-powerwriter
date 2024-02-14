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

public class CIM_BuildersRiskOtherCoverages extends OR_CIM{
	
	public void BuildersRiskOtherCoverages(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_BuildersRisk_OtherCoverages")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_BuildersRisk_OtherCoverages", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCIM_BuildersRisk_OtherCoverages_CHK_PermissionToOccupy = (String) row.get("CIM_BuildersRisk_OtherCoverages_CHK_PermissionToOccupy");
		String strCIM_BuildersRisk_OtherCoverages_CHK_OccupancyAndUseProvisionsUnderAdditionalCoverage = (String) row.get("CIM_BuildersRisk_OtherCoverages_CHK_OccupancyAndUseProvisionsUnderAdditionalCoverage");
		String strCIM_BuildersRisk_OtherCoverages_TXT_EffectiveDate = (String) row.get("CIM_BuildersRisk_OtherCoverages_TXT_EffectiveDate");
		String strCIM_BuildersRisk_OtherCoverages_TXT_AdditionalDebrisRemovalExpenses = (String) row.get("CIM_BuildersRisk_OtherCoverages_TXT_AdditionalDebrisRemovalExpenses");
		String strCIM_BuildersRisk_OtherCoverages_TXT_EmergencyRemoval = (String) row.get("CIM_BuildersRisk_OtherCoverages_TXT_EmergencyRemoval");
		String strCIM_BuildersRisk_OtherCoverages_TXT_EmergencyRemovalExpenses = (String) row.get("CIM_BuildersRisk_OtherCoverages_TXT_EmergencyRemovalExpenses");
		String strCIM_BuildersRisk_OtherCoverages_TXT_FraudAndDeceit = (String) row.get("CIM_BuildersRisk_OtherCoverages_TXT_FraudAndDeceit");
		String strCIM_BuildersRisk_OtherCoverages_TXT_LimitFungusCoverage = (String) row.get("CIM_BuildersRisk_OtherCoverages_TXT_LimitFungusCoverage");
		String strCIM_BuildersRisk_OtherCoverages_TXT_WaterborneProperty = (String) row.get("CIM_BuildersRisk_OtherCoverages_TXT_WaterborneProperty");
		String strCIM_BuildersRisk_OtherCoverages_TXT_ExpeditingExpenses = (String) row.get("CIM_BuildersRisk_OtherCoverages_TXT_ExpeditingExpenses");
		String strCIM_BuildersRisk_OtherCoverages_TXT_ExpensesToReErectScaffolding = (String) row.get("CIM_BuildersRisk_OtherCoverages_TXT_ExpensesToReErectScaffolding");
		String strCIM_BuildersRisk_OtherCoverages_TXT_FireDepartmentServiceCharges = (String) row.get("CIM_BuildersRisk_OtherCoverages_TXT_FireDepartmentServiceCharges");
		String strCIM_BuildersRisk_OtherCoverages_TXT_OrdiananceOrLaw = (String) row.get("CIM_BuildersRisk_OtherCoverages_TXT_OrdiananceOrLaw");
		String strCIM_BuildersRisk_OtherCoverages_TXT_PersonalProperty = (String) row.get("CIM_BuildersRisk_OtherCoverages_TXT_PersonalProperty");
		String strCIM_BuildersRisk_OtherCoverages_TXT_PollutantCleanupAndRemoval = (String) row.get("CIM_BuildersRisk_OtherCoverages_TXT_PollutantCleanupAndRemoval");
		String strCIM_BuildersRisk_OtherCoverages_TXT_Rewards = (String) row.get("CIM_BuildersRisk_OtherCoverages_TXT_Rewards");
		String strCIM_BuildersRisk_OtherCoverages_TXT_SewerBackup = (String) row.get("CIM_BuildersRisk_OtherCoverages_TXT_SewerBackup");
		String strCIM_BuildersRisk_OtherCoverages_TXT_TemporaryStorageLocations = (String) row.get("CIM_BuildersRisk_OtherCoverages_TXT_TemporaryStorageLocations");
		String strCIM_BuildersRisk_OtherCoverages_TXT_TransitLimit = (String) row.get("CIM_BuildersRisk_OtherCoverages_TXT_TransitLimit");
		String strCIM_BuildersRisk_OtherCoverages_TXT_TreesShrubsPlants = (String) row.get("CIM_BuildersRisk_OtherCoverages_TXT_TreesShrubsPlants");
		String strCIM_BuildersRisk_OtherCoverages_TXT_AdditionalInformation = (String) row.get("CIM_BuildersRisk_OtherCoverages_TXT_AdditionalInformation");

		try{
			se.log().logTestStep("BuildersRiskOtherCoverages");
			test.log(LogStatus.INFO, "BuildersRiskOtherCoverages page","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMBuildersRiskOtherCoverages");
			se.verify().verifyEquals("BuildersRiskOtherCoverages page of PowerWriter ", getCIM_BuildersRisk_OtherCoverages_TXT_VerifyBuildersRiskOtherCoveragesText().isDisplayed(),true, true,test);
			
			se.element().checkUncheckOrValidate(getCIM_BuildersRisk_OtherCoverages_CHK_PermissionToOccupy(strCIM_BuildersRisk_OtherCoverages_CHK_PermissionToOccupy),strCIM_BuildersRisk_OtherCoverages_CHK_PermissionToOccupy,test);
			se.element().checkUncheckOrValidate(getCIM_BuildersRisk_OtherCoverages_CHK_OccupancyAndUseProvisionsUnderAdditionalCoverage(strCIM_BuildersRisk_OtherCoverages_CHK_OccupancyAndUseProvisionsUnderAdditionalCoverage),strCIM_BuildersRisk_OtherCoverages_CHK_OccupancyAndUseProvisionsUnderAdditionalCoverage,test);
			se.element().enterOrValidateText(getCIM_BuildersRisk_OtherCoverages_TXT_EffectiveDate(strCIM_BuildersRisk_OtherCoverages_TXT_EffectiveDate),strCIM_BuildersRisk_OtherCoverages_TXT_EffectiveDate,test);
			se.element().verifyTextIsEnabled(getCIM_BuildersRisk_OtherCoverages_TXT_AdditionalDebrisRemovalExpenses(strCIM_BuildersRisk_OtherCoverages_TXT_AdditionalDebrisRemovalExpenses),strCIM_BuildersRisk_OtherCoverages_TXT_AdditionalDebrisRemovalExpenses,test);
			se.element().selectPopupWithMagnifier(getCIM_BuildersRisk_OtherCoverages_TXT_EmergencyRemoval(strCIM_BuildersRisk_OtherCoverages_TXT_EmergencyRemoval), getCIM_BuildersRisk_OtherCoverages_BTN_EmergencyRemovalSearch(strCIM_BuildersRisk_OtherCoverages_TXT_EmergencyRemoval), strCIM_BuildersRisk_OtherCoverages_TXT_EmergencyRemoval,constants.NA, strCIM_BuildersRisk_OtherCoverages_TXT_EmergencyRemoval,constants.NA, constants.NA, constants.NA, test);
			se.element().verifyTextIsEnabled(getCIM_BuildersRisk_OtherCoverages_TXT_EmergencyRemovalExpenses(strCIM_BuildersRisk_OtherCoverages_TXT_EmergencyRemovalExpenses),strCIM_BuildersRisk_OtherCoverages_TXT_EmergencyRemovalExpenses,test);
			se.element().verifyTextIsEnabled(getCIM_BuildersRisk_OtherCoverages_TXT_FraudAndDeceit(strCIM_BuildersRisk_OtherCoverages_TXT_FraudAndDeceit),strCIM_BuildersRisk_OtherCoverages_TXT_FraudAndDeceit,test);
			se.element().verifyTextIsEnabled(getCIM_BuildersRisk_OtherCoverages_TXT_LimitFungusCoverage(strCIM_BuildersRisk_OtherCoverages_TXT_LimitFungusCoverage),strCIM_BuildersRisk_OtherCoverages_TXT_LimitFungusCoverage,test);
			se.element().verifyTextIsEnabled(getCIM_BuildersRisk_OtherCoverages_TXT_WaterborneProperty(strCIM_BuildersRisk_OtherCoverages_TXT_WaterborneProperty),strCIM_BuildersRisk_OtherCoverages_TXT_WaterborneProperty,test);
			se.element().verifyTextIsEnabled(getCIM_BuildersRisk_OtherCoverages_TXT_ExpeditingExpenses(strCIM_BuildersRisk_OtherCoverages_TXT_ExpeditingExpenses),strCIM_BuildersRisk_OtherCoverages_TXT_ExpeditingExpenses,test);
			se.element().verifyTextIsEnabled(getCIM_BuildersRisk_OtherCoverages_TXT_ExpensesToReErectScaffolding(strCIM_BuildersRisk_OtherCoverages_TXT_ExpensesToReErectScaffolding),strCIM_BuildersRisk_OtherCoverages_TXT_ExpensesToReErectScaffolding,test);
			se.element().verifyTextIsEnabled(getCIM_BuildersRisk_OtherCoverages_TXT_FireDepartmentServiceCharges(strCIM_BuildersRisk_OtherCoverages_TXT_FireDepartmentServiceCharges),strCIM_BuildersRisk_OtherCoverages_TXT_FireDepartmentServiceCharges,test);
			se.element().verifyTextIsEnabled(getCIM_BuildersRisk_OtherCoverages_TXT_OrdiananceOrLaw(strCIM_BuildersRisk_OtherCoverages_TXT_OrdiananceOrLaw),strCIM_BuildersRisk_OtherCoverages_TXT_OrdiananceOrLaw,test);
			se.element().verifyTextIsEnabled(getCIM_BuildersRisk_OtherCoverages_TXT_PersonalProperty(strCIM_BuildersRisk_OtherCoverages_TXT_PersonalProperty),strCIM_BuildersRisk_OtherCoverages_TXT_PersonalProperty,test);
			se.element().verifyTextIsEnabled(getCIM_BuildersRisk_OtherCoverages_TXT_PollutantCleanupAndRemoval(strCIM_BuildersRisk_OtherCoverages_TXT_PollutantCleanupAndRemoval),strCIM_BuildersRisk_OtherCoverages_TXT_PollutantCleanupAndRemoval,test);
			se.element().verifyTextIsEnabled(getCIM_BuildersRisk_OtherCoverages_TXT_Rewards(strCIM_BuildersRisk_OtherCoverages_TXT_Rewards),strCIM_BuildersRisk_OtherCoverages_TXT_Rewards,test);
			se.element().verifyTextIsEnabled(getCIM_BuildersRisk_OtherCoverages_TXT_SewerBackup(strCIM_BuildersRisk_OtherCoverages_TXT_SewerBackup),strCIM_BuildersRisk_OtherCoverages_TXT_SewerBackup,test);
			se.element().verifyTextIsEnabled(getCIM_BuildersRisk_OtherCoverages_TXT_TemporaryStorageLocations(strCIM_BuildersRisk_OtherCoverages_TXT_TemporaryStorageLocations),strCIM_BuildersRisk_OtherCoverages_TXT_TemporaryStorageLocations,test);
			se.element().verifyTextIsEnabled(getCIM_BuildersRisk_OtherCoverages_TXT_TransitLimit(strCIM_BuildersRisk_OtherCoverages_TXT_TransitLimit),strCIM_BuildersRisk_OtherCoverages_TXT_TransitLimit,test);
			se.element().verifyTextIsEnabled(getCIM_BuildersRisk_OtherCoverages_TXT_TreesShrubsPlants(strCIM_BuildersRisk_OtherCoverages_TXT_TreesShrubsPlants),strCIM_BuildersRisk_OtherCoverages_TXT_TreesShrubsPlants,test);
			se.element().enterOrValidateText(getCIM_BuildersRisk_OtherCoverages_TXT_AdditionalInformation(strCIM_BuildersRisk_OtherCoverages_TXT_AdditionalInformation),strCIM_BuildersRisk_OtherCoverages_TXT_AdditionalInformation,test);
			
			se.element().Click(getNext(),test);
			
			
}
		catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for BuildersRiskOtherCoverages ", true, false, true, test);
		}
		iteration++;
	}

		} catch (Exception e) {
			se.log().logTestStep(
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			test.log(LogStatus.FAIL, "Faied",
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			testTearDown(se, test);
		}

	}
}
