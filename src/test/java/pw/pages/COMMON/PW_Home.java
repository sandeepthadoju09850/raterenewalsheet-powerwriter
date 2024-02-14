package pw.pages.COMMON;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_Common;

public class PW_Home extends OR_Common {

	public void homePage(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
		if (SuspendSheet.equalsIgnoreCase(constants.Homepage)) {
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Homepage, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);

			String strNewQuoteSelect = (String) row.get("Select_LOB");

			try {
				se.log().logTestStep("Select a product for New quote");
				test.log(LogStatus.INFO, "Executing", "Transaction Step : " + transaction + "<br>" + "Page : Homepage");
				se.verify().verifyEquals("Welcome page for PowerWriter ", getWlcmNewquote().isDisplayed(), true, true,test);
				se.log().logSeStep("Click on select dropdown to select a product for New Quote");
				se.element().Click(getWlcmNewquote(), test);
				se.util().sleep(2000);

				se.log().logSeStep("Select a product from the drop down list");
				se.element().Click(getWlcmSelectproduct(strNewQuoteSelect), test);
				se.log().logSeStep("Selected product as: "+strNewQuoteSelect);
				test.log(LogStatus.INFO, "Selected product","Selected product as : "+ strNewQuoteSelect + "<br>" +"Page : Start Page");
				se.util().sleep(2000);
				se.log().logSeStep("Click on start button to Start a new quote for the selected product");
				se.element().Click(getWlcmStartnewquote(), test);
			
			} catch (Exception e) {
				se.verify().verifyEquals("Issue with welcome page", true, false, true, test);
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

	public void searchQuote(Map<String, String> row, ExtentTest test) throws IOException {
		String strGetQuoteNum = (String) row.get("GI_Quote_No");

		try {
			se.util().sleep(5000);
			se.verify().verifyEquals("Welcome page for PowerWriter ", getWlcm_Txt_Searchquote().isDisplayed(), true,
					true, test);
			se.element().enterText(getWlcm_Txt_Searchquote(), strGetQuoteNum, test);
			se.element().Click(getWlcm_Btn_Searchquote(), test);
			se.util().sleep(5000);

		} catch (Exception e) {
			se.verify().verifyEquals("Issue with Search quote on welcome page", true, false, true, test);
		}
	}
	


	public void navigateOnHomeButton(String strRegressionID, String transaction, ExtentTest test) throws IOException{
		
			
		try {
			se.util().sleep(5000);
			se.element().refreshBrowser();
			se.util().sleep(10000);
			se.element().Click(getwlcm_Btn_HomeButton(), test);
			//se.element().Click(getWlcm_Txt_Searchquote(), test);
			/*--------------Below line performs search quote action on Welcome Screen ----------------*/
			se.element().Click(getWlcm_Txt_Searchquote2(), test);
			se.util().sleep(5000);

		} catch (Exception e) {
			se.verify().verifyEquals("Issue with Navigation on Home page", true, false, true, test);
		}
	}
}

	