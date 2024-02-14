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

public class CIM_AccountsRecievable extends OR_CIM {
	
	
	public void CIMAccountsRecievable(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_AccountsRecievable")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_AccountsRecievable", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCIM_AccountsRecievable_BTN_Add = (String) row.get("CIM_AccountsRecievable_BTN_Add");
		String strCIM_AccountsRecievable_BTN_Details = (String) row.get("CIM_AccountsRecievable_BTN_Details");
		String strCIM_AccountsRecievable_BTN_Done = (String) row.get("CIM_AccountsRecievable_BTN_Done");
		String strCIM_AccountsRecievable_TXT_Location = (String) row.get("CIM_AccountsRecievable_TXT_Location");
		String strCIM_AccountsRecievable_TXT_Building = (String) row.get("CIM_AccountsRecievable_TXT_Building");
		String strCIM_AccountsRecievable_TXT_BuildingDescription = (String) row.get("CIM_AccountsRecievable_TXT_BuildingDescription");
		String strCIM_AccountsRecievable_CHK_MainPremise_Yes = (String) row.get("CIM_AccountsRecievable_CHK_MainPremise_Yes");
		String strCIM_AccountsRecievable_CHK_MainPremise_No = (String) row.get("CIM_AccountsRecievable_CHK_MainPremise_No");
		String strCIM_AccountsRecievable_CHK_BranchPremiseThatForwardsRecord_Yes = (String) row.get("CIM_AccountsRecievable_CHK_BranchPremiseThatForwardsRecord_Yes");
		String strCIM_AccountsRecievable_CHK_BranchPremiseThatForwardsRecord_No = (String) row.get("CIM_AccountsRecievable_CHK_BranchPremiseThatForwardsRecord_No");
		String strCIM_AccountsRecievable_CHK_SeparateLimitPerReceptacle_Yes = (String) row.get("CIM_AccountsRecievable_CHK_SeparateLimitPerReceptacle_Yes");
		String strCIM_AccountsRecievable_CHK_SeparateLimitPerReceptacle_No = (String) row.get("CIM_AccountsRecievable_CHK_SeparateLimitPerReceptacle_No");
		String strCIM_AccountsRecievable_TXT_Limit = (String) row.get("CIM_AccountsRecievable_TXT_Limit");
		String strCIM_AccountsRecievable_CHK_DuplicateRecordsMaintainedInSeparateFireDivision_Yes = (String) row.get("CIM_AccountsRecievable_CHK_DuplicateRecordsMaintainedInSeparateFireDivision_Yes");
		String strCIM_AccountsRecievable_CHK_DuplicateRecordsMaintainedInSeparateFireDivision_No = (String) row.get("CIM_AccountsRecievable_CHK_DuplicateRecordsMaintainedInSeparateFireDivision_No");
		String strCIM_AccountsRecievable_TXT_PercentageMaintained = (String) row.get("CIM_AccountsRecievable_TXT_PercentageMaintained");
		String strCIM_AccountsRecievable_CHK_51PercentOfTheCoveredAccounts_Yes = (String) row.get("CIM_AccountsRecievable_CHK_51PercentOfTheCoveredAccounts_Yes");
		String strCIM_AccountsRecievable_CHK_51PercentOfTheCoveredAccounts_No = (String) row.get("CIM_AccountsRecievable_CHK_51PercentOfTheCoveredAccounts_No");
		String strCIM_AccountsRecievable_TXT_ReceptacleSymbol = (String) row.get("CIM_AccountsRecievable_TXT_ReceptacleSymbol");
		String strCIM_AccountsRecievable_TXT_ReceptacleCriteria = (String) row.get("CIM_AccountsRecievable_TXT_ReceptacleCriteria");
		String strCIM_AccountsRecievable_TXT_ReceptacleLimit = (String) row.get("CIM_AccountsRecievable_TXT_ReceptacleLimit");
		String strCIM_AccountsRecievable_TXT_ReceptacleDescription = (String) row.get("CIM_AccountsRecievable_TXT_ReceptacleDescription");
		String strCIM_AccountsRecievable_TXT_PackageModFactor = (String) row.get("CIM_AccountsRecievable_TXT_PackageModFactor");
		try{
			if(strCIM_AccountsRecievable_BTN_Add.equalsIgnoreCase(constants.Yes)) {
				se.element().clickElement(getCIM_AccountsRecievable_BTN_Add(),test);
			}
			if(strCIM_AccountsRecievable_BTN_Details.equalsIgnoreCase(constants.Yes)) {
				se.element().clickElement(getCIM_AccountsRecievable_BTN_Details(strCIM_AccountsRecievable_BTN_Details),test);
			}
		
		se.element().enterOrValidateText(getCIM_AccountsRecievable_TXT_Location(strCIM_AccountsRecievable_TXT_Location),strCIM_AccountsRecievable_TXT_Location,test);
		se.element().enterOrValidateText(getCIM_AccountsRecievable_TXT_Building(strCIM_AccountsRecievable_TXT_Building),strCIM_AccountsRecievable_TXT_Building,test);
		se.element().enterOrValidateText(getCIM_AccountsRecievable_TXT_BuildingDescription(strCIM_AccountsRecievable_TXT_BuildingDescription),strCIM_AccountsRecievable_TXT_BuildingDescription,test);
		se.element().checkUncheckOrValidate(getCIM_AccountsRecievable_CHK_MainPremise_Yes(strCIM_AccountsRecievable_CHK_MainPremise_Yes),strCIM_AccountsRecievable_CHK_MainPremise_Yes,test);
		se.element().checkUncheckOrValidate(getCIM_AccountsRecievable_CHK_MainPremise_No(strCIM_AccountsRecievable_CHK_MainPremise_No),strCIM_AccountsRecievable_CHK_MainPremise_No,test);
		se.element().checkUncheckOrValidate(getCIM_AccountsRecievable_CHK_BranchPremiseThatForwardsRecord_Yes(strCIM_AccountsRecievable_CHK_BranchPremiseThatForwardsRecord_Yes),strCIM_AccountsRecievable_CHK_BranchPremiseThatForwardsRecord_Yes,test);
		se.element().checkUncheckOrValidate(getCIM_AccountsRecievable_CHK_BranchPremiseThatForwardsRecord_No(strCIM_AccountsRecievable_CHK_BranchPremiseThatForwardsRecord_No),strCIM_AccountsRecievable_CHK_BranchPremiseThatForwardsRecord_No,test);
		se.element().checkUncheckOrValidate(getCIM_AccountsRecievable_CHK_SeparateLimitPerReceptacle_Yes(strCIM_AccountsRecievable_CHK_SeparateLimitPerReceptacle_Yes),strCIM_AccountsRecievable_CHK_SeparateLimitPerReceptacle_Yes,test);
		se.element().checkUncheckOrValidate(getCIM_AccountsRecievable_CHK_SeparateLimitPerReceptacle_No(strCIM_AccountsRecievable_CHK_SeparateLimitPerReceptacle_No),strCIM_AccountsRecievable_CHK_SeparateLimitPerReceptacle_No,test);
		se.util().sleep(5000);
		se.element().enterOrValidateText(getCIM_AccountsRecievable_TXT_Limit(strCIM_AccountsRecievable_TXT_Limit),strCIM_AccountsRecievable_TXT_Limit,test);
		se.element().checkUncheckOrValidate(getCIM_AccountsRecievable_CHK_DuplicateRecordsMaintainedInSeparateFireDivision_Yes(strCIM_AccountsRecievable_CHK_DuplicateRecordsMaintainedInSeparateFireDivision_Yes),strCIM_AccountsRecievable_CHK_DuplicateRecordsMaintainedInSeparateFireDivision_Yes,test);
		se.element().checkUncheckOrValidate(getCIM_AccountsRecievable_CHK_DuplicateRecordsMaintainedInSeparateFireDivision_No(strCIM_AccountsRecievable_CHK_DuplicateRecordsMaintainedInSeparateFireDivision_No),strCIM_AccountsRecievable_CHK_DuplicateRecordsMaintainedInSeparateFireDivision_No,test);
		se.element().selectPopupWithMagnifier(getCIM_AccountsRecievable_TXT_PercentageMaintained(strCIM_AccountsRecievable_TXT_PercentageMaintained), getCIM_AccountsRecievable_TXT_PercentageMaintainedSearch(strCIM_AccountsRecievable_TXT_PercentageMaintained), strCIM_AccountsRecievable_TXT_PercentageMaintained,constants.NA, strCIM_AccountsRecievable_TXT_PercentageMaintained,constants.NA, constants.NA, constants.NA, test);
		se.element().checkUncheckOrValidate(getCIM_AccountsRecievable_CHK_51PercentOfTheCoveredAccounts_Yes(strCIM_AccountsRecievable_CHK_51PercentOfTheCoveredAccounts_Yes),strCIM_AccountsRecievable_CHK_51PercentOfTheCoveredAccounts_Yes,test);
		se.element().checkUncheckOrValidate(getCIM_AccountsRecievable_CHK_51PercentOfTheCoveredAccounts_No(strCIM_AccountsRecievable_CHK_51PercentOfTheCoveredAccounts_No),strCIM_AccountsRecievable_CHK_51PercentOfTheCoveredAccounts_No,test);
		se.element().selectPopupWithMagnifier(getCIM_AccountsRecievable_TXT_ReceptacleSymbol(strCIM_AccountsRecievable_TXT_ReceptacleSymbol), getCIM_AccountsRecievable_TXT_ReceptacleSymbolSearch(strCIM_AccountsRecievable_TXT_ReceptacleSymbol), strCIM_AccountsRecievable_TXT_ReceptacleSymbol,constants.NA, strCIM_AccountsRecievable_TXT_ReceptacleSymbol,constants.NA, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getCIM_AccountsRecievable_TXT_ReceptacleCriteria(strCIM_AccountsRecievable_TXT_ReceptacleCriteria),strCIM_AccountsRecievable_TXT_ReceptacleCriteria,test);
		se.element().enterOrValidateText(getCIM_AccountsRecievable_TXT_ReceptacleLimit(strCIM_AccountsRecievable_TXT_ReceptacleLimit),strCIM_AccountsRecievable_TXT_ReceptacleLimit,test);
		se.element().enterOrValidateText(getCIM_AccountsRecievable_TXT_ReceptacleDescription(strCIM_AccountsRecievable_TXT_ReceptacleDescription),strCIM_AccountsRecievable_TXT_ReceptacleDescription,test);
		se.element().enterOrValidateText(getCIM_AccountsRecievable_TXT_PackageModFactor(strCIM_AccountsRecievable_TXT_PackageModFactor),strCIM_AccountsRecievable_TXT_PackageModFactor,test);
		se.element().Click(getNext(),test);	
		if(strCIM_AccountsRecievable_BTN_Done.equalsIgnoreCase(constants.Yes)) {
			se.element().clickElement(getDone(),test);
		}
		}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CIMAccountsRecievable", true, false, true, test);
		}
		iteration++;
	}

		} catch (Exception e) {
			// TODO: handle exception
			se.log().logTestStep(
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			test.log(LogStatus.FAIL, "Faied",
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			testTearDown(se, test);
		}

}
}
