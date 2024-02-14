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

public class CA_LimitedBroadenedPollutionLiability extends OR_CA{
	
	public void LimitedBroadenedPollutionLiability(String strRegressionID, String transaction ,String suspendSheet ,ExtentTest test) throws IOException {
		try{
		
		if(suspendSheet.equalsIgnoreCase(constants.CA_LimitedBroadenedPollutionLiability)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_LimitedBroadenedPollutionLiability, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			
			String strLimitedBroadenedPollutionLiability_TXT_EachAccidentLimit = (String) row.get("LimitedBroadenedPollutionLiability_TXT_EachAccidentLimit");
			String strLimitedBroadenedPollutionLiability_TXT_EachAccidentLimitFilterNeeded = (String) row.get("LimitedBroadenedPollutionLiability_TXT_EachAccidentLimitFilterNeeded");
			String strLimitedBroadenedPollutionLiability_TXT_AggregateLimit = (String) row.get("LimitedBroadenedPollutionLiability_TXT_AggregateLimit");
				
			String strTestDescription = (String) row.get("Transaction Name");
			try{
				se.log().logTestStep("CA_LimitedBroadenedPollutionLiability");
				test.log(LogStatus.INFO, "CA_LimitedBroadenedPollutionLiability page","Transaction Step : "+strTestDescription + "<br>" +"Page : CA_LimitedBroadenedPollutionLiability");
				se.verify().verifyEquals("CA_LimitedBroadenedPollutionLiability Page of PowerWriter ", getCA_LimitedBroadenedPollutionLiability_LabelName().isDisplayed(),true, true,test);
				se.element().selectPopupWithMagnifier(getLimitedBroadenedPollutionLiability_TXT_EachAccidentLimit(strLimitedBroadenedPollutionLiability_TXT_EachAccidentLimit),getLimitedBroadenedPollutionLiability_TXT_EachAccidentLimitSearch(strLimitedBroadenedPollutionLiability_TXT_EachAccidentLimit),strLimitedBroadenedPollutionLiability_TXT_EachAccidentLimit,strLimitedBroadenedPollutionLiability_TXT_EachAccidentLimitFilterNeeded,strLimitedBroadenedPollutionLiability_TXT_EachAccidentLimit, constants.NA, constants.NA,constants.NA,test);
				se.element().enterOrValidateText(getLimitedBroadenedPollutionLiability_TXT_AggregateLimit(strLimitedBroadenedPollutionLiability_TXT_AggregateLimit),strLimitedBroadenedPollutionLiability_TXT_AggregateLimit,test);
				se.element().clickElement(getNext());
				se.util().sleep(2000);
				
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for CA_LimitedBroadenedPollutionLiability ", true, false, true, test);
			}
			iteration++;
		}
		se.element().clickElement(getDone());
}
catch (Exception e) {
	// TODO: handle exception
	se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
	test.log(LogStatus.FAIL, "Failed", "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
	testTearDown(se, test);
}
			
	}
}
		
