package ap.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.ap.automation.common.ExcelOperations;
import Libraries.ap.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.OR_CP;

public class CP_AccReceivableSchedule extends OR_CP {

	public void CP_AccReceivableSchedule_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.AccReceivableSchedule)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.AccReceivableSchedule, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strAccReceivSchedule_DD_Location = (String) row.get("AccReceivSchedule_DD_Location");
			String strAccReceivSchedule_TXT_Limit = (String) row.get("AccReceivSchedule_TXT_Limit");
			//String strAccReceivSchedule_BTN_Edit = (String) row.get("AccReceivSchedule_BTN_Edit");
			String strAccReceivSchedule_BTN_Add = (String) row.get("AccReceivSchedule_BTN_Add");
			try {
				se.log().logTestStep("CP_AccReceivSchedule_Details");
				test.log(LogStatus.INFO, "CP_AccReceivSchedule_Details","Transaction Step : "+transaction + "<br>" +"Page : CP_AccReceivSchedule_Details");
				se.verify().verifyEquals("CP_AccReceivSchedule_Details  of AgencyPortal ", getAccReceivSchedule_label().isDisplayed(),true, true,test);
				if(strAccReceivSchedule_BTN_Add.contains("Add"))
				{
					se.element().Click(getIndSch_BTN_AddNew(strAccReceivSchedule_BTN_Add), test);
					se.element().SelectElement(AccReceivSchedule_DD_Location, strAccReceivSchedule_DD_Location,test);
					se.element().enterOrValidateText( getAccReceivSchedule_TXT_Limit(strAccReceivSchedule_TXT_Limit),strAccReceivSchedule_TXT_Limit,test);
					se.element().Click(getAdd_Button(), test);
				}
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for CP_AccReceivableSchedule ", true, false, true, test);
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
