package ap.pages.SE;

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

public class SE_SpecialEventCoverages extends OR_CP{

	public void SE_SpecialEventCoverages_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.SpecialEventCoverages)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.SpecialEventCoverages, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strSEC_DD_EachOccurrenceLimit = (String) row.get("SEC_DD_EachOccurrenceLimit");
			String strSEC_DD_PersonalAndAdvertisingInjuryLimit = (String) row.get("SEC_DD_PersonalAndAdvertisingInjuryLimit");
			String strSEC_DD_GeneralAggregateLimit = (String) row.get("SEC_DD_GeneralAggregateLimit");
			String strSEC_DD_SEPDDeductible = (String) row.get("SEC_DD_SEPDDeductible");
			String strSEC_CHK_SELiquorLiability = (String) row.get("SEC_CHK_SELiquorLiability");
			String strSEC_CHK_SEHiredAutoNonOwnedLiabilityCoverage = (String) row.get("SEC_CHK_SEHiredAutoNonOwnedLiabilityCoverage");
			String strSEC_Radio_SESELiabAddInt = (String) row.get("SEC_Radio_SESELiabAddInt");
			String strSEC_DD_SELiquorEachLimit = (String) row.get("SEC_DD_SELiquorEachLimit");
			String strSEC_TXT_SETotalLiquorSales = (String) row.get("SEC_TXT_SETotalLiquorSales");
			String strSEC_CHK_SEClassesExhibitionFloater = (String) row.get("SEC_CHK_SEClassesExhibitionFloater");
			
			try {
				se.log().logTestStep("SE_SpecialEventsCoverages");
				test.log(LogStatus.INFO, "SE_SpecialEventsCoverages","Transaction Step : "+transaction + "<br>" +"Page : SE_SpecialEventsCoverages");
				//se.verify().verifyEquals("SE_SpecialEventsCoverages  of AgencyPortal ", getHOLEINONEPRIZES_label().isDisplayed(),true, true,test);
				
				
				se.element().SelectElement(SEC_DD_EachOccurrenceLimit,strSEC_DD_EachOccurrenceLimit,test);
				se.element().SelectElement(SEC_DD_PersonalAndAdvertisingInjuryLimit,strSEC_DD_PersonalAndAdvertisingInjuryLimit,test);
				se.element().SelectElement(SEC_DD_GeneralAggregateLimit,strSEC_DD_GeneralAggregateLimit,test);
				se.element().SelectElement(SEC_DD_SEPDDeductible,strSEC_DD_SEPDDeductible,test);
				se.element().checkUncheckOrValidate(getSEC_CHK_SELiquorLiability(strSEC_CHK_SELiquorLiability),strSEC_CHK_SELiquorLiability,test);
				se.element().checkUncheckOrValidate(getSEC_CHK_SEHiredAutoNonOwnedLiabilityCoverage(strSEC_CHK_SEHiredAutoNonOwnedLiabilityCoverage),strSEC_CHK_SEHiredAutoNonOwnedLiabilityCoverage,test);
				se.element().chkElement(getSEC_Radio_SESELiabAddInt(strSEC_Radio_SESELiabAddInt), strSEC_Radio_SESELiabAddInt,test);
				se.element().SelectElement(SEC_DD_SELiquorEachLimit,strSEC_DD_SELiquorEachLimit,test);
				se.element().enterOrValidateText(getSEC_TXT_SETotalLiquorSales(strSEC_TXT_SETotalLiquorSales),strSEC_TXT_SETotalLiquorSales,test);
				se.element().checkUncheckOrValidate(getSEC_CHK_SEClassesExhibitionFloater(strSEC_CHK_SEClassesExhibitionFloater),strSEC_CHK_SEClassesExhibitionFloater,test);
				
			}
			catch(Exception e){
				se.verify().verifyEquals("Failed to fill in details for SE_SpecialEventCoverages_Details ", true, false, true, test);
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
