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

public class CIM_ContractorsEquipment  extends OR_CIM {
	public void ContractorsEquipment(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_ContractorsEquipment")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_ContractorsEquipment", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCIM_ContractorsEquipment_CHK_OverrideBaseRate_Yes=(String) row.get("CIM_ContractorsEquipment_CHK_OverrideBaseRate_Yes");
		String strCIM_ContractorsEquipment_CHK_OverrideBaseRate_No=(String) row.get("CIM_ContractorsEquipment_CHK_OverrideBaseRate_No");
		String strCIM_ContractorsEquipment_TXT_OverrideReason=(String) row.get("CIM_ContractorsEquipment_TXT_OverrideReason");
		//String strCIM_ContractorsEquipment_TXT_BaseRate=(String) row.get("CIM_ContractorsEquipment_TXT_BaseRate");
		String strCIM_ContractorsEquipment_TXT_BaseRateOverride=(String) row.get("CIM_ContractorsEquipment_TXT_BaseRateOverride");
		/*String strCIM_ContractorsEquipment_TXT_ContractorsEquipmentDeductibleFactor=(String) row.get("CIM_ContractorsEquipment_TXT_ContractorsEquipmentDeductibleFactor");
		String strCIM_ContractorsEquipment_TXT_TransitionFactor=(String) row.get("CIM_ContractorsEquipment_TXT_TransitionFactor");
		String strCIM_ContractorsEquipment_TXT_FinalRate=(String) row.get("CIM_ContractorsEquipment_TXT_FinalRate");
		String strCIM_ContractorsEquipment_TXT_OverrideFinalRate=(String) row.get("CIM_ContractorsEquipment_TXT_OverrideFinalRate");
		String strCIM_ContractorsEquipment_TXT_ContractorsScheduleOnFileCatastropheLimit=(String) row.get("CIM_ContractorsEquipment_TXT_ContractorsScheduleOnFileCatastropheLimit");
		String strCIM_ContractorsEquipment_TXT_Premium=(String) row.get("CIM_ContractorsEquipment_TXT_Premium");
		String strCIM_ContractorsEquipment_TXT_OverridePremium=(String) row.get("CIM_ContractorsEquipment_TXT_OverridePremium");*/
		String strCIM_ContractorsEquipment_TXT_AdditionalDebrisRemovalExpenseLimit=(String) row.get("CIM_ContractorsEquipment_TXT_AdditionalDebrisRemovalExpenseLimit");
		String strCIM_ContractorsEquipment_TXT_EmployeeToolLimit=(String) row.get("CIM_ContractorsEquipment_TXT_EmployeeToolLimit");
		String strCIM_ContractorsEquipment_TXT_EquipmentLeaseOrRentedFromOthersLimit=(String) row.get("CIM_ContractorsEquipment_TXT_EquipmentLeaseOrRentedFromOthersLimit");
		String strCIM_ContractorsEquipment_CHK_NewlyPurchasedEquipmentLimit_PercentOfCatastropheLimit=(String) row.get("CIM_ContractorsEquipment_CHK_NewlyPurchasedEquipmentLimit_PercentOfCatastropheLimit");
		String strCIM_ContractorsEquipment_CHK_NewlyPurchasedEquipmentLimit_DollarLimit=(String) row.get("CIM_ContractorsEquipment_CHK_NewlyPurchasedEquipmentLimit_DollarLimit");
		String strCIM_ContractorsEquipment_TXT_PercentageOfCatastropheLimit=(String) row.get("CIM_ContractorsEquipment_TXT_PercentageOfCatastropheLimit");
		String strCIM_ContractorsEquipment_TXT_RentalReimbursementLimit=(String) row.get("CIM_ContractorsEquipment_TXT_RentalReimbursementLimit");
		String strCIM_ContractorsEquipment_TXT_WaitingPeriod=(String) row.get("CIM_ContractorsEquipment_TXT_WaitingPeriod");
		String strCIM_ContractorsEquipment_TXT_AdditionalInformation=(String) row.get("CIM_ContractorsEquipment_TXT_AdditionalInformation");
		String strCIM_ContractorsEquipment_TXT_DollarLimit=(String) row.get("CIM_ContractorsEquipment_TXT_DollarLimit");
		String strCIM_ContractorsEquipment_TXT_OverrideReason_FilterNeeded=(String) row.get("CIM_ContractorsEquipment_TXT_OverrideReason_FilterNeeded");
		String strTransaction  = (String) row.get("Transaction Name");
	
		try {
			se.log().logTestStep("ContractorsEquipment");
			test.log(LogStatus.INFO, "ContractorsEquipment page","Transaction Step : " + strTransaction + "<br>" +"Page : CIM_ContractorsEquipment");
		se.element().checkUncheckOrValidate(getCIM_ContractorsEquipment_CHK_OverrideBaseRate_Yes(strCIM_ContractorsEquipment_CHK_OverrideBaseRate_Yes),strCIM_ContractorsEquipment_CHK_OverrideBaseRate_Yes,test);
		se.element().checkUncheckOrValidate(getCIM_ContractorsEquipment_CHK_OverrideBaseRate_No(strCIM_ContractorsEquipment_CHK_OverrideBaseRate_No),strCIM_ContractorsEquipment_CHK_OverrideBaseRate_No,test);
		
		se.element().selectPopupWithMagnifier(getCIM_ContractorsEquipment_TXT_OverrideReason(strCIM_ContractorsEquipment_TXT_OverrideReason), getCIM_ContractorsEquipment_TXT_OverrideReasonSearch(strCIM_ContractorsEquipment_TXT_OverrideReason), strCIM_ContractorsEquipment_TXT_OverrideReason, strCIM_ContractorsEquipment_TXT_OverrideReason_FilterNeeded, strCIM_ContractorsEquipment_TXT_OverrideReason,"N/A", "N/A", "N/A", test);
		//se.element().enterOrValidateText(getCIM_ContractorsEquipment_TXT_BaseRate(strCIM_ContractorsEquipment_TXT_BaseRate),strCIM_ContractorsEquipment_TXT_BaseRate,test);
		se.element().enterOrValidateText(getCIM_ContractorsEquipment_TXT_BaseRateOverride(strCIM_ContractorsEquipment_TXT_BaseRateOverride),strCIM_ContractorsEquipment_TXT_BaseRateOverride,test);
		/*se.element().enterOrValidateText(getCIM_ContractorsEquipment_TXT_ContractorsEquipmentDeductibleFactor(strCIM_ContractorsEquipment_TXT_ContractorsEquipmentDeductibleFactor),strCIM_ContractorsEquipment_TXT_ContractorsEquipmentDeductibleFactor,test);
		se.element().enterOrValidateText(getCIM_ContractorsEquipment_TXT_TransitionFactor(strCIM_ContractorsEquipment_TXT_TransitionFactor),strCIM_ContractorsEquipment_TXT_TransitionFactor,test);
		se.element().enterOrValidateText(getCIM_ContractorsEquipment_TXT_FinalRate(strCIM_ContractorsEquipment_TXT_FinalRate),strCIM_ContractorsEquipment_TXT_FinalRate,test);
		se.element().enterOrValidateText(getCIM_ContractorsEquipment_TXT_OverrideFinalRate(strCIM_ContractorsEquipment_TXT_OverrideFinalRate),strCIM_ContractorsEquipment_TXT_OverrideFinalRate,test);
		se.element().enterOrValidateText(getCIM_ContractorsEquipment_TXT_ContractorsScheduleOnFileCatastropheLimit(strCIM_ContractorsEquipment_TXT_ContractorsScheduleOnFileCatastropheLimit),strCIM_ContractorsEquipment_TXT_ContractorsScheduleOnFileCatastropheLimit,test);
		se.element().enterOrValidateText(getCIM_ContractorsEquipment_TXT_Premium(strCIM_ContractorsEquipment_TXT_Premium),strCIM_ContractorsEquipment_TXT_Premium,test);
		se.element().enterOrValidateText(getCIM_ContractorsEquipment_TXT_OverridePremium(strCIM_ContractorsEquipment_TXT_OverridePremium),strCIM_ContractorsEquipment_TXT_OverridePremium,test);*/
		
		se.element().enterOrValidateText(getCIM_ContractorsEquipment_TXT_AdditionalDebrisRemovalExpenseLimit(strCIM_ContractorsEquipment_TXT_AdditionalDebrisRemovalExpenseLimit),strCIM_ContractorsEquipment_TXT_AdditionalDebrisRemovalExpenseLimit,test);
		if(!strCIM_ContractorsEquipment_TXT_EmployeeToolLimit.equalsIgnoreCase(constants.NA)&& !strCIM_ContractorsEquipment_TXT_EmployeeToolLimit.contains(constants.Validate)){
			se.element().clearTheField(getCIM_ContractorsEquipment_TXT_EmployeeToolLimit(strCIM_ContractorsEquipment_TXT_EmployeeToolLimit));
			se.element().enterOrValidateText(getCIM_ContractorsEquipment_TXT_EmployeeToolLimit(strCIM_ContractorsEquipment_TXT_EmployeeToolLimit),strCIM_ContractorsEquipment_TXT_EmployeeToolLimit,test);
		}else{
			se.element().enterOrValidateText(getCIM_ContractorsEquipment_TXT_EmployeeToolLimit(strCIM_ContractorsEquipment_TXT_EmployeeToolLimit),strCIM_ContractorsEquipment_TXT_EmployeeToolLimit,test);
		}
		//se.element().enterOrValidateText(getCIM_ContractorsEquipment_TXT_EmployeeToolLimit(strCIM_ContractorsEquipment_TXT_EmployeeToolLimit),strCIM_ContractorsEquipment_TXT_EmployeeToolLimit,test);
		se.element().enterOrValidateText(getCIM_ContractorsEquipment_TXT_EquipmentLeaseOrRentedFromOthersLimit(strCIM_ContractorsEquipment_TXT_EquipmentLeaseOrRentedFromOthersLimit),strCIM_ContractorsEquipment_TXT_EquipmentLeaseOrRentedFromOthersLimit,test);
		se.element().checkUncheckOrValidate(getCIM_ContractorsEquipment_CHK_NewlyPurchasedEquipmentLimit_PercentOfCatastropheLimit(strCIM_ContractorsEquipment_CHK_NewlyPurchasedEquipmentLimit_PercentOfCatastropheLimit),strCIM_ContractorsEquipment_CHK_NewlyPurchasedEquipmentLimit_PercentOfCatastropheLimit,test);
		se.element().checkUncheckOrValidate(getCIM_ContractorsEquipment_CHK_NewlyPurchasedEquipmentLimit_DollarLimit(strCIM_ContractorsEquipment_CHK_NewlyPurchasedEquipmentLimit_DollarLimit),strCIM_ContractorsEquipment_CHK_NewlyPurchasedEquipmentLimit_DollarLimit,test);
		Thread.sleep(5000);
		if(!strCIM_ContractorsEquipment_TXT_PercentageOfCatastropheLimit.equalsIgnoreCase(constants.NA)&& !strCIM_ContractorsEquipment_TXT_PercentageOfCatastropheLimit.contains(constants.Validate)){
			se.element().clearTheField(getCIM_ContractorsEquipment_TXT_PercentageOfCatastropheLimit(strCIM_ContractorsEquipment_TXT_PercentageOfCatastropheLimit));
			se.element().enterOrValidateText(getCIM_ContractorsEquipment_TXT_PercentageOfCatastropheLimit(strCIM_ContractorsEquipment_TXT_PercentageOfCatastropheLimit),strCIM_ContractorsEquipment_TXT_PercentageOfCatastropheLimit,test);
		}else{
			se.element().enterOrValidateText(getCIM_ContractorsEquipment_TXT_PercentageOfCatastropheLimit(strCIM_ContractorsEquipment_TXT_PercentageOfCatastropheLimit),strCIM_ContractorsEquipment_TXT_PercentageOfCatastropheLimit,test);
		}
		
		//se.element().enterOrValidateText(getCIM_ContractorsEquipment_TXT_PercentageOfCatastropheLimit(strCIM_ContractorsEquipment_TXT_PercentageOfCatastropheLimit),strCIM_ContractorsEquipment_TXT_PercentageOfCatastropheLimit,test);
		se.element().enterOrValidateText(getCIM_ContractorsEquipment_TXT_RentalReimbursementLimit(strCIM_ContractorsEquipment_TXT_RentalReimbursementLimit),strCIM_ContractorsEquipment_TXT_RentalReimbursementLimit,test);
		/*if(!strCIM_ContractorsEquipment_TXT_WaitingPeriod.equalsIgnoreCase("N/A") && !strCIM_ContractorsEquipment_TXT_WaitingPeriod.contains("validate2")){
			se.element().clickSearchIcon(getCIM_ContractorsEquipment_BTN_WaitingPeriod(), test);
			se.element().clickElement(getCIM_ContractorsEquipment_LNK_WaitingPeriod(strCIM_ContractorsEquipment_TXT_WaitingPeriod), test);
			
	    }else{
		se.element().enterOrValidateText(getCIM_ContractorsEquipment_TXT_WaitingPeriod(strCIM_ContractorsEquipment_TXT_WaitingPeriod),strCIM_ContractorsEquipment_TXT_WaitingPeriod,test);
		}*/
		se.element().selectPopupWithMagnifier(getCIM_ContractorsEquipment_TXT_WaitingPeriod(strCIM_ContractorsEquipment_TXT_WaitingPeriod), getCIM_ContractorsEquipment_BTN_WaitingPeriod(strCIM_ContractorsEquipment_TXT_WaitingPeriod), strCIM_ContractorsEquipment_TXT_WaitingPeriod,constants.NA, strCIM_ContractorsEquipment_TXT_WaitingPeriod,constants.NA, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getCIM_ContractorsEquipment_TXT_AdditionalInformation(strCIM_ContractorsEquipment_TXT_AdditionalInformation),strCIM_ContractorsEquipment_TXT_AdditionalInformation,test);
		se.element().enterOrValidateText(getCIM_ContractorsEquipment_TXT_DollarLimit(strCIM_ContractorsEquipment_TXT_DollarLimit),strCIM_ContractorsEquipment_TXT_DollarLimit,test);
		se.element().Click(getNext(), test);
		se.util().sleep(1000);
	
		}
	catch (Exception e) {
		se.verify().verifyEquals("Failed to fill in details for CIM_ContractorsEquipment Page", true, false, true, test);
		
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