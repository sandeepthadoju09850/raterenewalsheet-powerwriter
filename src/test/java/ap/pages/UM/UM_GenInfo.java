package ap.pages.UM;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.BL_OR_CP;

public class UM_GenInfo extends BL_OR_CP{
	public   void UM_GenInfo_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.GeneralInformation)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getBLPagesData(constants.GeneralInformation, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strGI_AppInfo_TXT_ApplicantName = (String) row.get("GI_AppInfo_TXT_ApplicantName");
			String strGI_AppInfo_TXT_DoingBusinessAs = (String) row.get("GI_AppInfo_TXT_DoingBusinessAs");
			String strGI_Underwriter_Underwriter = (String) row.get("GI_UW_Underwriter");
			String strGI_Umb_AppName_TipText = (String) row.get("GI_Umb_AppName_TipText");
			try {
				se.log().logTestStep("UM_GenInfo");
				test.log(LogStatus.INFO, "UM_GenInfo page","Transaction Step : "+transaction + "<br>" +"Page : UM_GenInfo");
				se.verify().verifyEquals("UM_GenInfo Details  of AgencyPortal ", getApplicantInformation_label().isDisplayed(),true, true,test);
				se.element().enterOrValidateText(getGI_AppInfo_TXT_ApplicantName(strGI_AppInfo_TXT_ApplicantName),strGI_AppInfo_TXT_ApplicantName,test);
				se.element().enterOrValidateText(getGI_AppInfo_TXT_DoingBusinessAs(strGI_AppInfo_TXT_DoingBusinessAs),strGI_AppInfo_TXT_DoingBusinessAs,test);
				se.element().enterOrValidateText(getGI_UW_Underwriter(strGI_Underwriter_Underwriter),strGI_Underwriter_Underwriter,test);
				se.element().enterOrValidateText(getGI_Umb_AppName_TipText(strGI_Umb_AppName_TipText),strGI_Umb_AppName_TipText,test);
				iteration++;
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for CP_GenInfo ", true, false, true, test);
				iteration++;
			}
			se.element().Click(getGI_CHK_Continue(), test);
		}
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}
}
