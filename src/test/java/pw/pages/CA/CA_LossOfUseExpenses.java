package pw.pages.CA;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CA;
import pw.OR.OR_CP;
import pw.OR.OR_GL;

public class CA_LossOfUseExpenses extends OR_CA{
	
	public void LossOfUseExpenses(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase(constants.CA_LossOfUseExpenses)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_LossOfUseExpenses, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				
			String strLossOfUseExpenses_TXT_AmtPerDay = (String) row.get("LossOfUseExpenses_TXT_AmtPerDay");
			String strLossOfUseExpenses_TXT_AmtPerDayFilterNeeded = (String) row.get("LossOfUseExpenses_TXT_AmtPerDayFilterNeeded");
			String strLossOfUseExpenses_TXT_MaxLimit = (String) row.get("LossOfUseExpenses_TXT_MaxLimit");
			String strTestDescription = (String) row.get("Transaction Name");
			try{
				se.log().logTestStep("CA_LossOfUseExpenses");
				test.log(LogStatus.INFO, "CA_LossOfUseExpenses page","Transaction Step : "+strTestDescription + "<br>" +"Page : CA_LossOfUseExpenses");
				se.verify().verifyEquals("CA_LossOfUseExpenses Page of PowerWriter ", getLossOfUseExpenses_BTN_Label().isDisplayed(),true, true,test);
				se.element().selectPopupWithMagnifier(getLossOfUseExpenses_TXT_AmtPerDay(strLossOfUseExpenses_TXT_AmtPerDay),getLossOfUseExpenses_TXT_AmtPerDaySearch(strLossOfUseExpenses_TXT_AmtPerDay),strLossOfUseExpenses_TXT_AmtPerDay,strLossOfUseExpenses_TXT_AmtPerDayFilterNeeded,strLossOfUseExpenses_TXT_AmtPerDay, constants.NA, constants.NA,constants.NA,test);
				se.element().enterOrValidateText(getLossOfUseExpenses_TXT_MaxLimit(strLossOfUseExpenses_TXT_MaxLimit),strLossOfUseExpenses_TXT_MaxLimit,test);
				se.element().clickElement(getNext());
				se.util().sleep(2000);
		
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for CA_LossOfUseExpenses ", true, false, true, test);
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
		
