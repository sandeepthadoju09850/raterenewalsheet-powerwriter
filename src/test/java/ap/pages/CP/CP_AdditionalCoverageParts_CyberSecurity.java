package ap.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.framework.Util;
import ap.OR.BL_OR_CP;

public class CP_AdditionalCoverageParts_CyberSecurity extends BL_OR_CP {
	public void CP_AdditionalCoverageParts_CyberSecurity_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase("AddCovParts_CyberSecurity")){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getBLPagesData("AddCovParts_CyberSecurity", strRegressionID, transaction);
		int iteration = 0;

		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strAddCoverageParts_DD_FirstPartyAggLimit = (String) row.get("AddCoverageParts_DD_FirstPartyAggLimit");
			String strAddCoverageParts_TXT_ThirdPartyAggLimit = (String) row.get("AddCoverageParts_TXT_ThirdPartyAggLimit");
			String strAddCoverageParts_TXT_CyberSec_Deductible = (String) row.get("AddCoverageParts_TXT_CyberSec_Deductible");
			try {
				se.log().logTestStep("CP_AdditionalCoverageParts_Details");
				test.log(LogStatus.INFO, "CP_AdditionalCoverageParts_Details","Transaction Step : "+transaction + "<br>" +"Page : CP_AdditionalCoverageParts_Details");
				se.verify().verifyEquals("CP_AdditionalCoverageParts_Details  of AgencyPortal ", getAdditionalCoverageParts_label1().isDisplayed(),true, true,test);
				/*se.element().SelectElement(AddCoverageParts_DD_FirstPartyAggLimit, strAddCoverageParts_DD_FirstPartyAggLimit,test);
				se.element().enterOrValidateText(getAddCoverageParts_TXT_ThirdPartyAggLimit(strAddCoverageParts_TXT_ThirdPartyAggLimit),strAddCoverageParts_TXT_ThirdPartyAggLimit,test);
				se.element().enterOrValidateText(getAddCoverageParts_TXT_CyberSec_Deductible(strAddCoverageParts_TXT_CyberSec_Deductible),strAddCoverageParts_TXT_CyberSec_Deductible,test);
			*/	se.util().sleep(5000);
				se.element().Click(getGI_CHK_Continue(), test);		
			}
			catch(Exception e){
				e.printStackTrace();
				e.getMessage();
				se.verify().verifyEquals("Failed to fill in details for CP_AdditionalCoverageParts_CyberSecurity ", true, false, true, test);
			}
			iteration++;
		}
		
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
}
}
