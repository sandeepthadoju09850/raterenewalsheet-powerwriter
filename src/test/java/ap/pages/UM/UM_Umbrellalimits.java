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

public class UM_Umbrellalimits extends BL_OR_CP {
	public   void UM_Umbrellalimits_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.UmbrellaLimits)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.UmbrellaLimits, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strUM_DD_CvgEachOccurene = (String) row.get("UM_DD_CvgEachOccurene");
			String strUM_TXT_SelfInsured = (String) row.get("UM_TXT_SelfInsured");
			String strUM_CHK_IncludeAbuse = (String) row.get("UM_CHK_IncludeAbuse");
			String strUM_CHK_PrimaryNonContributory = (String) row.get("UM_CHK_PrimaryNonContributory");
			String strUM_TXT_GlEachOccurence = (String) row.get("UM_TXT_GlEachOccurence");
			String strUM_TXT_GlAgglimit = (String) row.get("UM_TXT_GlAgglimit");
			String strUM_TXT_CA_EachAccident = (String) row.get("UM_TXT_CA_EachAccident");
			String strUM_TXT_BI_EachAccident = (String) row.get("UM_TXT_BI_EachAccident");
			String strUM_TXT_BI_EachEmployee = (String) row.get("UM_TXT_BI_EachEmployee");
			String strUM_TXT_BI_PolicyLimit = (String) row.get("UM_TXT_BI_PolicyLimit");
			try {
				se.log().logTestStep("UM_GenInfo");
				test.log(LogStatus.INFO, "UM_GenInfo page","Transaction Step : "+transaction + "<br>" +"Page : UM_GenInfo");
				se.verify().verifyEquals("UM_GenInfo Details  of AgencyPortal ", getUmbrellaLimits_label().isDisplayed(),true, true,test);
				se.element().SelectElement(UM_DD_CvgEachOccurene,strUM_DD_CvgEachOccurene,test);
				se.element().enterOrValidateText(getUM_TXT_SelfInsured(strUM_TXT_SelfInsured),strUM_TXT_SelfInsured,test);
				se.element().checkUncheckOrValidate( getLiabilityOptions_CHK_AbuseandMolestation(strUM_CHK_IncludeAbuse),strUM_CHK_IncludeAbuse,test);
				se.element().checkUncheckOrValidate(getUM_CHK_PrimaryNonContributory(strUM_CHK_PrimaryNonContributory),strUM_CHK_PrimaryNonContributory,test);
				se.element().enterOrValidateText(getUM_TXT_GlEachOccurence(strUM_TXT_GlEachOccurence),strUM_TXT_GlEachOccurence,test);
				se.element().enterOrValidateText(getUM_TXT_GlAgglimit(strUM_TXT_GlAgglimit),strUM_TXT_GlAgglimit,test);
				// For CA Underlying Quote
				se.element().enterOrValidateText(getUM_TXT_CA_EachAccident(strUM_TXT_CA_EachAccident),strUM_TXT_CA_EachAccident,test);
				// For WC(Employers Liability) Underlying Quote
				se.element().enterOrValidateText(getUM_TXT_BI_EachAccident(strUM_TXT_BI_EachAccident),strUM_TXT_BI_EachAccident,test);
				se.element().enterOrValidateText(getUM_TXT_BI_EachEmployee(strUM_TXT_BI_EachEmployee),strUM_TXT_BI_EachEmployee,test);
				se.element().enterOrValidateText(getUM_TXT_BI_PolicyLimit(strUM_TXT_BI_PolicyLimit),strUM_TXT_BI_PolicyLimit,test);
				iteration++;
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for UM_UnderLying ", true, false, true, test);
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
