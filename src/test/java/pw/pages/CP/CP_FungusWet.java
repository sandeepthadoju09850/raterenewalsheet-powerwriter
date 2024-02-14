package pw.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.OR.OR_CP;

public class CP_FungusWet  extends OR_CP{

public void FungusWet(String strRegressionID, String transaction, ExtentTest test) throws IOException {
	try{
	List<Map<String, String>> table = ExcelOperations.getPagesData("CP_FungusWet", strRegressionID, transaction);
	int iteration = 0;
	while (iteration < table.size()) {
		LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		
		String strCP_FungusWet_TXT_RiskType = (String) row.get("CP_FungusWet_TXT_RiskType");
		String strCP_FungusWet_TXT_RevisedLimit = (String) row.get("CP_FungusWet_TXT_RevisedLimit");
		
		
		try{
				se.log().logTestStep("FungusWet");
				test.log(LogStatus.INFO, "FungusWet page","Transaction Step : "+transaction + "<br>" +"Page : CP_FungusWet");
				se.verify().verifyEquals("FungusWet Page of PowerWriter ", getCP_FungusWet_TXT_VerifyFungusWetText().isDisplayed(),true, true,test);
		
				se.element().enterOrValidateText(getCP_FungusWet_TXT_RiskType(strCP_FungusWet_TXT_RiskType), strCP_FungusWet_TXT_RiskType,test);
				se.element().enterOrValidateText(getCP_FungusWet_TXT_RevisedLimit(strCP_FungusWet_TXT_RevisedLimit), strCP_FungusWet_TXT_RevisedLimit, test);
				se.element().Click(getNext(),test);
					
					
	}catch(Exception e){
		se.verify().verifyEquals("Failed to fill in details for CP_FungusWet", true, false, true, test);
				
		
		}
				iteration++;
			}
		
	}
	catch (Exception e) {
		
		se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
		test.log(LogStatus.FAIL, "Failed", "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
		testTearDown(se, test);
	}
		
}
}
