package pw.pages.CA;

/**
 * @author ${pr09529}
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

public class CA_FinancialResponsibilityFiling extends OR_CA{
	
	public void FinancialResponsibilityFiling(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		try{
		
		if(suspendSheet.equalsIgnoreCase(constants.CA_FinancialResponsibilityFiling)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_FinancialResponsibilityFiling, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				
			String strFinancialResponsibilityFiling_BTN_Add = (String) row.get("FinancialResponsibilityFiling_BTN_Add");
			String strFinancialResponsibilityFiling_BTN_RemoveCov = (String) row.get("FinancialResponsibilityFiling_BTN_RemoveCov");
			String strFinancialResponsibilityFiling_BTN_Details = (String) row.get("FinancialResponsibilityFiling_BTN_Details");
			String strFinancialResponsibilityFiling_TXT_State = (String) row.get("FinancialResponsibilityFiling_TXT_State");
			String strFinancialResponsibilityFiling_TXT_StateFilterNeeded = (String) row.get("FinancialResponsibilityFiling_TXT_StateFilterNeeded");
			String strFinancialResponsibilityFiling_TXT_FilingReason = (String) row.get("FinancialResponsibilityFiling_TXT_FilingReason");
			String strFinancialResponsibilityFiling_TXT_FilingReasonFilterNeeded = (String) row.get("FinancialResponsibilityFiling_TXT_FilingReasonFilterNeeded");
			String strFinancialResponsibilityFiling_BTN_Done = (String) row.get("FinancialResponsibilityFiling_BTN_Done");
			String strTestDescription = (String) row.get("Transaction Name");
			try{
				se.log().logTestStep("CA_FinancialResponsibilityFiling");
				test.log(LogStatus.INFO, "CA_FinancialResponsibilityFiling page","Transaction Step : "+strTestDescription + "<br>" +"Page : CA_FinancialResponsibilityFiling");
				se.verify().verifyEquals("CA_FinancialResponsibilityFiling Page of PowerWriter ", getCA_FinancialResponsibilityFiling_LabelName().isDisplayed(),true, true,test);
				
				if(strFinancialResponsibilityFiling_BTN_Add.equalsIgnoreCase("Yes")){
					se.element().waitForElementIsDisplayed(FinancialResponsibilityFiling_BTN_Add, 10);
					se.element().Click(getFinancialResponsibilityFiling_BTN_Add(), test);
				}
				if(!strFinancialResponsibilityFiling_BTN_Details.equalsIgnoreCase("N/A")){
					se.element().Click(getFinancialResponsibilityFiling_BTN_Details(strFinancialResponsibilityFiling_BTN_Details), test);
				}
				
				if(strFinancialResponsibilityFiling_BTN_RemoveCov.equalsIgnoreCase("Yes")){
					se.element().checkUncheckOrValidate(getFinancialResponsibilityFiling_BTN_RemoveCov(),"Check",test);
					se.element().Click(getFinancialResponsibilityFiling_BTN_RemoveCov(), test);
				}else{
					
					se.element().selectPopupWithMagnifier(getFinancialResponsibilityFiling_TXT_State(strFinancialResponsibilityFiling_TXT_State),getFinancialResponsibilityFiling_TXT_StateSearch(strFinancialResponsibilityFiling_TXT_State),strFinancialResponsibilityFiling_TXT_State,strFinancialResponsibilityFiling_TXT_StateFilterNeeded,strFinancialResponsibilityFiling_TXT_State, constants.NA, constants.NA,constants.NA,test);
					se.element().selectPopupWithMagnifier(getFinancialResponsibilityFiling_TXT_FilingReason(strFinancialResponsibilityFiling_TXT_FilingReason),getFinancialResponsibilityFiling_TXT_FilingReasonSearch(strFinancialResponsibilityFiling_TXT_FilingReason),strFinancialResponsibilityFiling_TXT_FilingReason,strFinancialResponsibilityFiling_TXT_FilingReasonFilterNeeded,strFinancialResponsibilityFiling_TXT_FilingReason, constants.NA, constants.NA,constants.NA,test);
					se.element().clickElement(getNext());
					se.util().sleep(2000);
					if(strFinancialResponsibilityFiling_BTN_Done.equals("Yes")) {
						se.element().clickElement(getDone());
						}
				}
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for CA_FinancialResponsibilityFiling ", true, false, true, test);
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
		
