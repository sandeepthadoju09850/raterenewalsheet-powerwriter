package ap.pages.common;

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

public class Common_CloseSubmission extends BL_OR_CP {

	public void Common_CloseSubmission_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.CloseSub)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getBLPagesData(constants.CloseSub, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strCloseSub_DD_Reason = (String) row.get("CloseSub_DD_Reason");
			String strCloseSub_TXT_Comments = (String) row.get("CloseSub_TXT_Comments");
			String strCloseSub_DD_CarrierWrittenWith = (String) row.get("CloseSub_DD_CarrierWrittenWith");
			String strCloseSub_TXT_WrittenPremium = (String) row.get("CloseSub_TXT_WrittenPremium");
			try {
				se.log().logTestStep("CloseSubmission_Details");
				test.log(LogStatus.INFO, "CloseSubmission_Details","Transaction Step : "+transaction + "<br>" +"Page : CloseSubmission_Details");
				se.verify().verifyEquals("CloseSubmission of AgencyPortal ", getNotWritten_Label().isDisplayed(),true, true,test);
					se.element().SelectElement(CloseSub_DD_Reason, strCloseSub_DD_Reason,test);
					se.element().enterOrValidateText( getCloseSub_TXT_Comments(strCloseSub_TXT_Comments),strCloseSub_TXT_Comments,test);
					se.element().SelectElement(CloseSub_DD_CarrierWrittenWith, strCloseSub_DD_CarrierWrittenWith,test);
					se.element().enterOrValidateText( getCloseSub_TXT_WrittenPremium(strCloseSub_TXT_WrittenPremium),strCloseSub_TXT_WrittenPremium,test);
					se.element().Click(getsummary_btn_SaveAndExit(),test);
			
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for Close Submission ", true, false, true, test);
			}
			iteration++;
		}
		se.element().Click(getGI_CHK_Continue(), test);
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}
}
