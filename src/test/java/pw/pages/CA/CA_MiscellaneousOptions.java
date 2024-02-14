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
import pw.OR.OR_CP;
import pw.OR.OR_GL;

public class CA_MiscellaneousOptions extends OR_CA{
	
	public void MiscellaneousOptions(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		try{
		
		if(suspendSheet.equalsIgnoreCase(constants.CA_MiscellaneousOptions)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_MiscellaneousOptions, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strMiscellaneousOptions_CHK_Applicable = (String) row.get("MiscellaneousOptions_CHK_Applicable");
			String strMiscellaneousOptions_TXT_AmendmentOfDefOfPollutants = (String) row.get("MiscellaneousOptions_TXT_AmendmentOfDefOfPollutants");
			//String strMiscellaneousOptions_BTN_Done = (String) row.get("MiscellaneousOptions_BTN_Done");
			String strTestDescription = (String) row.get("Transaction Name");
			try{
				se.log().logTestStep("ExperienceRating");
				test.log(LogStatus.INFO, "MiscellaneousOptions page","Transaction Step : "+strTestDescription + "<br>" +"Page : CA_MiscellaneousOptions");
				se.verify().verifyEquals("MiscellaneousOptions Page of PowerWriter ", getMiscellaneousOptions_LabelName().isDisplayed(),true, true,test);
				se.element().checkUncheckOrValidate(getMiscellaneousOptions_CHK_Applicable(strMiscellaneousOptions_CHK_Applicable),strMiscellaneousOptions_CHK_Applicable,test);
				se.element().enterOrValidateText(getMiscellaneousOptions_TXT_AmendmentOfDefOfPollutants(strMiscellaneousOptions_TXT_AmendmentOfDefOfPollutants),strMiscellaneousOptions_TXT_AmendmentOfDefOfPollutants,test);
				se.element().clickElement(getNext());
				se.util().sleep(2000);
				
				/*if(strMiscellaneousOptions_BTN_Done.equals("Yes")) {
					se.element().clickElement(getDone());
					}*/
			
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for CA_MiscellaneousOptions ", true, false, true, test);
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
		
