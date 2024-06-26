package pw.Validations;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import Libraries.automation.common.framework.Util;
import pw.Constants.constants;
import pw.OR.OR_Common;
import pw.pages.COMMON.PW_GenInfo;

public class PW_ControlDateChange extends OR_Common {
	

	
	
	public void PW_ControlDateChangeMethod(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase(constants.ProductInfo)){
			 test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.ProductInfo, strRegressionID, transaction);
		int iteration = 0;
		int serverErrorCount = 0;
		int confirmationPopupCount = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		
		try {
			
			PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
			
			
			
			
			String AccountNumber = Util.getAccountNumber(strRegressionID,transaction);
			String quoteNumber = Util.getQuoteNumber(strRegressionID,transaction);
			String CloneQuoteNumber = Util.getCloneQuoteNumber(strRegressionID,transaction);
			String CloneAccountNumber  = Util.getCloneAccountNumber(strRegressionID,transaction);
			
			
			
			
			
			
				test.log(LogStatus.INFO, "Policy/Product Confirm Button","Transaction Step : "+ transaction + "<br>" +"Page : quote_genInfo");
					
			
			
			
			

		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for Product info page", true, false, true, test);
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
