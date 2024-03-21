package ap.pages.WC;

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

public class WC_OtherStateInsurance extends BL_OR_CP {
	public void WC_OtherStateInsurance_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.WC_OtherStateInsurance)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getBLPagesData(constants.WC_OtherStateInsurance, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strOtherStateIns_BTN_ADDNew= (String) row.get("OtherStateIns_BTN_ADDNew");
			String strOtherStateIns_DD_OtherStatesTheApplicanthasWorkIn= (String) row.get("OtherStateIns_DD_OtherStatesTheApplicanthasWorkIn");
			try {
				se.log().logTestStep("WC_OtherStateInsurance");
				test.log(LogStatus.INFO, "WC_OtherStateInsurance","Transaction Step : "+transaction + "<br>" +"Page : WC_OtherStateInsurance");
				se.verify().verifyEquals("WC_OtherStateInsurance  of AgencyPortal ", getmenu_lnk_OtherStateInsurance().isDisplayed(),true, true,test);
				if(strOtherStateIns_BTN_ADDNew.contains("Add")){
					se.element().waitForElementToClickable(getOtherStateIns_BTN_ADDNew(strOtherStateIns_BTN_ADDNew), 60);
					se.element().Click(getOtherStateIns_BTN_ADDNew(strOtherStateIns_BTN_ADDNew), test);
				}
				se.element().SelectElement(OtherStateIns_DD_OtherStatesTheApplicanthasWorkIn,strOtherStateIns_DD_OtherStatesTheApplicanthasWorkIn,test);
				se.element().Click(getAdd_Button(), test);
			}
			catch(Exception e){
				e.printStackTrace();
				e.getMessage();
				se.verify().verifyEquals("Failed to fill in details for WC_OtherStateInsurance ", true, false, true, test);
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