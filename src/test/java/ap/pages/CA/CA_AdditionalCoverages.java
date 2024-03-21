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

public class CA_AdditionalCoverages extends BL_OR_CP {
	public void CA_AdditionalCoverages_Details(String strRegressionID, String transaction,String suspendSheet,   ExtentTest test) throws IOException
	{
		try{
		if(suspendSheet.equalsIgnoreCase(constants.AdditionalCoverages)){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
	         testTearDown(se, test);
	    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getBLPagesData(constants.AdditionalCoverages, strRegressionID, transaction);
		int iteration = 0;

		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strAdditionalCoverages_CHK_Bussinessinterruption= (String) row.get("AdditionalCoverages_CHK_Bussinessinterruption");
			String strAdditionalCoverages_TXT_DesSchVehicles=(String) row.get("AdditionalCoverages_TXT_DesSchVehicles");
			String strAdditionalCoverages_DD_AppCoverages=(String) row.get("AdditionalCoverages_DD_AppCoverages");
			String strAdditionalCoverages_DD_BICovWaitPeriod=(String) row.get("AdditionalCoverages_DD_BICovWaitPeriod");
			String strAdditionalCoverages_DD_ExtBIAddlCov=(String) row.get("AdditionalCoverages_DD_ExtBIAddlCov");
			String strAdditionalCoverages_DD_OptionType=(String) row.get("AdditionalCoverages_DD_OptionType");
			String strAdditionalCoverages_CHK_GarageKeepers= (String) row.get("AdditionalCoverages_CHK_GarageKeepers");
			String strAdditionalCoverages_CHK_AutoAdditional= (String) row.get("AdditionalCoverages_CHK_AutoAdditional");
			String strAdditionalCoverages_CHK_TrailerInterchange= (String) row.get("AdditionalCoverages_CHK_TrailerInterchange");
			String strAdditionalCoverages_CHK_LimitedBroadened= (String) row.get("AdditionalCoverages_CHK_LimitedBroadened");
			String strAdditionalCoverages_DD_EachAccidentLmt= (String) row.get("AdditionalCoverages_DD_EachAccidentLmt");

			try {
				se.log().logTestStep("CA_AdditionalCoverages");
				test.log(LogStatus.INFO, "CA_AdditionalCoverages","Transaction Step : "+transaction + "<br>" +"Page : CA_AdditionalCoverages");
				se.verify().verifyEquals("CA_AdditionalCoverages  of AgencyPortal ", getAdditionalCovg_page().isDisplayed(),true, true,test);
				se.element().waitForElementToAppear_One(strAdditionalCoverages_CHK_Bussinessinterruption,AC_chk_BusinessInterruptionCoverage, 20);
				se.element().checkUncheckOrValidate(getACBusinessInterruptionCoverage(strAdditionalCoverages_CHK_Bussinessinterruption),strAdditionalCoverages_CHK_Bussinessinterruption,test);
				se.element().enterOrValidateText(getAdditionalCoverages_TXT_DesSchVehicles(strAdditionalCoverages_TXT_DesSchVehicles), strAdditionalCoverages_TXT_DesSchVehicles, test);
				se.element().SelectElement(AdditionalCoverages_DD_AppCoverages, strAdditionalCoverages_DD_AppCoverages,test);
				se.element().SelectElement(AdditionalCoverages_DD_BICovWaitPeriod, strAdditionalCoverages_DD_BICovWaitPeriod, test);
				se.element().SelectElement(AdditionalCoverages_DD_ExtBIAddlCov, strAdditionalCoverages_DD_ExtBIAddlCov, test);
				se.element().SelectElement(AdditionalCoverages_DD_OptionType, strAdditionalCoverages_DD_OptionType, test);
				se.element().checkUncheckOrValidate(getACGarageKeepers(strAdditionalCoverages_CHK_GarageKeepers),strAdditionalCoverages_CHK_GarageKeepers,test);
				se.element().checkUncheckOrValidate(getACSECURAAutoAdditionalInsuredWRAPCoverage(strAdditionalCoverages_CHK_AutoAdditional),strAdditionalCoverages_CHK_AutoAdditional,test);
				se.element().checkUncheckOrValidate(getACTrailerInterchangeCoverage(strAdditionalCoverages_CHK_TrailerInterchange),strAdditionalCoverages_CHK_TrailerInterchange,test);
				se.element().checkUncheckOrValidate(getACLBPLCoverage(strAdditionalCoverages_CHK_LimitedBroadened),strAdditionalCoverages_CHK_LimitedBroadened,test);
				se.element().SelectElement(AC_dd_LBPL_EachAccidentLimit,strAdditionalCoverages_DD_EachAccidentLmt,test);
			}
			catch(Exception e){
				e.printStackTrace();
				e.getMessage();
				se.verify().verifyEquals("Failed to fill in details for CA_AdditionalCoverages ", true, false, true, test);

			}
			iteration++;
		}
		se.element().Click(getGI_CHK_Continue(),test);
	}catch (Exception e) {
		
		se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
		test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
		testTearDown(se, test);
	}
	}
}
