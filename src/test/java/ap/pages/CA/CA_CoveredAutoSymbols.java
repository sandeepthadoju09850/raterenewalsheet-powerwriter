package ap.pages.CA;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.BL_OR_CP;

public class CA_CoveredAutoSymbols extends BL_OR_CP {
	public void CA_CoveredAutoSymbols_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.CoveredAutoSymbols)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getBLPagesData(constants.CoveredAutoSymbols, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strCovAutoSym_TXT_Coverage = (String) row.get("CovAutoSym_TXT_Coverage");
			String strCovAutoSym_TXT_Symbols = (String) row.get("CovAutoSym_TXT_Symbols");
			try {
				se.log().logTestStep("CA_CoveredAutoSymbols");
				test.log(LogStatus.INFO, "CA_CoveredAutoSymbols","Transaction Step : "+transaction + "<br>" +"Page : CA_CoveredAutoSymbols");
				se.verify().verifyEquals("CA_CoveredAutoSymbols  of AgencyPortal ", getmenu_lnk_CoverageAuto().isDisplayed(),true, true,test);
				
				se.verify().verifyEquals("CoveredAuto Symbols of "+strCovAutoSym_TXT_Coverage+" ", getCovAutoSym_TXT_Symbols(strCovAutoSym_TXT_Coverage).getText().trim(),strCovAutoSym_TXT_Symbols.trim(), true,test);
				se.element().waitForElementToAppear_One(strCovAutoSym_TXT_Coverage,CovAutoSym_BTN_Edit, 20);
				se.element().Click(getCovAutoSym_BTN_Edit(strCovAutoSym_TXT_Coverage),test);
				se.element().waitForElementToAppear_One(strCovAutoSym_TXT_Coverage,CovAutoSym_BTN_Save, 20);
				se.element().Click(getCovAutoSym_BTN_Save(),test);
			
			}
			catch(Exception e){
				e.printStackTrace();
				e.getMessage();
				se.verify().verifyEquals("Failed to fill in details for CA_CoveredAutoSymbols ", true, false, true, test);
			}
			iteration++;
		}
		se.element().Click("CA_CoveredAutoSymbols continue",getGI_CHK_Continue(),test);
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}
}
