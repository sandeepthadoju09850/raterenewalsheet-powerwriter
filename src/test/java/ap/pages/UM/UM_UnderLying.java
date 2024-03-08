package ap.pages.UM;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.ap.automation.common.ExcelOperations;
import Libraries.ap.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.OR_CP;

public class UM_UnderLying  extends OR_CP{

	public   void UM_UnderLying_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.Underlyingquotes)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Underlyingquotes, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strUQ_TXT_AgencyName = (String) row.get("UQ_TXT_AgencyName");
			String strUQ_TXT_ApplicantName = (String) row.get("UQ_TXT_ApplicantName");
			String strUQ_DD_GLQuoteNumber = (String) row.get("UQ_DD_GLQuoteNumber");
			String strUQ_TXT_PrimaryLiabilityQuote = (String) row.get("UQ_TXT_PrimaryLiabilityQuote");
			String strUQ_TXT_PrimaryAutoQuote = (String) row.get("UQ_TXT_PrimaryAutoQuote");
			String strUQ_TXT_PrimaryEmployerQuote = (String) row.get("UQ_TXT_PrimaryEmployerQuote");
			String strUQ_DD_WCQuoteNumber = (String) row.get("UQ_DD_WCQuoteNumber");
			String strUQ_DD_CAQuoteNumber = (String) row.get("UQ_DD_CAQuoteNumber");
			try {
				se.log().logTestStep("UM_UnderLying_Details");
				test.log(LogStatus.INFO, "UM_UnderLying_Details page","Transaction Step : "+transaction + "<br>" +"Page : UM_GenInfo");
				se.verify().verifyEquals("UM_UnderLying_Details Details  of AgencyPortal ", getUnderLying_label().isDisplayed(),true, true,test);
				/*se.element().Click(getUQ_TXT_AgencyName());
				se.element().enterOrValidateText(getGI_AI_TXT_AgencyName(strUQ_TXT_AgencyName),strUQ_TXT_AgencyName,test);
				se.util().sleep(5000);
				se.element().waitBasedOnCount(PleaseWaitPopup,40);
				se.element().Click(getUQ_Click_ApplicantName());
				se.element().enterOrValidateText(getUQ_TXT_ApplicantName(strUQ_TXT_ApplicantName),strUQ_TXT_ApplicantName,test);
				*/se.util().sleep(5000);
				se.element().waitBasedOnCount(PleaseWaitPopup,40);
				se.element().enterOrValidateText(getUQ_TXT_AgencyName(strUQ_TXT_AgencyName),strUQ_TXT_AgencyName,test);
				se.element().enterOrValidateText(getUQ_TXT_ApplicantName(strUQ_TXT_ApplicantName),strUQ_TXT_ApplicantName,test);
				if (!strUQ_DD_GLQuoteNumber.equalsIgnoreCase("N/A")){
				se.element().SelectElementByIndex(UQ_DD_GLQuoteNumber,strUQ_DD_GLQuoteNumber,test);
				se.element().waitBasedOnCount(PleaseWaitPopup,40);
				}
				else{
					se.element().enterOrValidateText(getUQ_TXT_PrimaryLiabilityQuote(strUQ_TXT_PrimaryLiabilityQuote),strUQ_TXT_PrimaryLiabilityQuote,test);
				}
				if(!strUQ_DD_CAQuoteNumber.equalsIgnoreCase("N/A")){
					se.element().SelectElementByIndex(UQ_DD_CAQuoteNumber,strUQ_DD_CAQuoteNumber,test);
					se.element().waitBasedOnCount(PleaseWaitPopup,40);
				}
				else{
					se.element().enterOrValidateText(getUQ_TXT_PrimaryAutoQuote(strUQ_TXT_PrimaryAutoQuote),strUQ_TXT_PrimaryAutoQuote,test);
				}
				if(!strUQ_DD_WCQuoteNumber.equalsIgnoreCase("N/A")){
					se.element().SelectElementByIndex(UQ_DD_WCQuoteNumber,strUQ_DD_WCQuoteNumber,test);
					se.element().waitBasedOnCount(PleaseWaitPopup,40);
				}
				else{
					se.element().enterOrValidateText(getUQ_TXT_PrimaryEmployerQuote(strUQ_TXT_PrimaryEmployerQuote),strUQ_TXT_PrimaryEmployerQuote,test);
				}
				se.util().sleep(3000);
				iteration++;
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for UM_UnderLying ", true, false, true, test);
				iteration++;
			}
			se.util().sleep(3000);
			se.element().Click(getGI_CHK_Continue(), test);
		}
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}
}
