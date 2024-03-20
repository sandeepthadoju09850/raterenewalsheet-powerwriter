package ap.pages.UM;

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

public class UM_ScheduleName extends BL_OR_CP {
	public   void UM_ScheduleName_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.ScheduleName)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.ScheduleName, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strSNB_TXT_Name = (String) row.get("SNB_TXT_Name");
			try {
				se.log().logTestStep("UM_ScheduleName");
				test.log(LogStatus.INFO, "UM_ScheduleName page","Transaction Step : "+transaction + "<br>" +"Page : UM_ScheduleName");
				se.verify().verifyEquals("UM_ScheduleName Details  of AgencyPortal ", getScheduleName_label().isDisplayed(),true, true,test);
				se.element().enterOrValidateText(getSNB_TXT_Name(strSNB_TXT_Name),strSNB_TXT_Name,test);
				se.element().Click(getAdd_Button(), test);
				iteration++;
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for UM_ScheduleName ", true, false, true, test);
				iteration++;
			}
			
		}
		se.util().sleep(3000);
		se.element().Click(getGI_CHK_Continue(), test);
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}
}
