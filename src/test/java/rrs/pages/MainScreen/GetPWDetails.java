package rrs.pages.MainScreen;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import Libraries.automation.common.framework.Util;
import pw.Constants.constants;
import pw.OR.OR_CP;

public class GetPWDetails extends OR_CP{

	
	public void GetPWDetails_Method(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		

		try{
			PWValidations PWValidationsPage = TestPageFactory.initElements(se, PWValidations.class);
			
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase(constants.RRS)){
			 test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.RRS, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		
			 
			
			String strRRS_TXT_SearchPolicy = (String) row.get("RRS_TXT_SearchPolicy");
			
			try{
				se.log().logTestStep("Navigated to PW Home screen");
				test.log(LogStatus.INFO, "Navigated to PW Home screen","Transaction Step : "+ transaction + "<br>" +"Page : Rate Renewal Sheet");
				
				
				 
			
				
				
		se.util().sleep(2000);
				
				
				
			} catch(Exception e){
				se.verify().verifyEquals("Failed to fill in details for DO_Main Page ", true, false, true, test);
				}
				iteration++;
			}

		} catch (Exception e) {
			// TODO: handle exception
			se.log().logTestStep(
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			test.log(LogStatus.FAIL, "Failed",
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			testTearDown(se, test);
		}

	

	}
	
		

		
}
