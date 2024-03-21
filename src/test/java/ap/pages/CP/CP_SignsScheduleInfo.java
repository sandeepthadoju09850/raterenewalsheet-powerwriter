package ap.pages.CP;

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

public class CP_SignsScheduleInfo extends BL_OR_CP {

	public void CP_SignsScheduleInfo_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.SignsScheduleInfo)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getBLPagesData(constants.SignsScheduleInfo, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strSignsScheduleInfo_DD_Location = (String) row.get("SignsScheduleInfo_DD_Location");
			String strSignsScheduleInfo_TXT_Limit = (String) row.get("SignsScheduleInfo_TXT_Limit");
			//String strSchPropFlt_BTN_Edit = (String) row.get("SchPropFlt_BTN_Edit");
			String strSignsScheduleInfo_BTN_Add = (String) row.get("SignsScheduleInfo_BTN_Add");
			String strSignsScheduleInfo_XarcMessage = (String) row.get("SignsScheduleInfo_XarcMessage");
			try {
				se.log().logTestStep("CP_SignsScheduleInfo_Details");
				test.log(LogStatus.INFO, "CP_SignsScheduleInfo_Details","Transaction Step : "+transaction + "<br>" +"Page : CP_SignsScheduleInfo_Details");
				se.verify().verifyEquals("CP_SignsScheduleInfo_Details  of AgencyPortal ", getSignsScheduleInfo_label().isDisplayed(),true, true,test);
				if(strSignsScheduleInfo_BTN_Add.contains("Add"))
				{
					se.element().Click(getIndSch_BTN_AddNew(strSignsScheduleInfo_BTN_Add), test);
					se.element().SelectElement(SignsScheduleInfo_DD_Location, strSignsScheduleInfo_DD_Location,test);
					se.element().enterOrValidateText( getSignsScheduleInfo_TXT_Limit(strSignsScheduleInfo_TXT_Limit),strSignsScheduleInfo_TXT_Limit,test);
					se.element().Click(getAdd_Button(), test);
				}
				if(!strSignsScheduleInfo_XarcMessage.contains("N/A"))
				{
				se.element().waitForElementToAppear_One(strSignsScheduleInfo_XarcMessage,SignsScheduleInfo_XarcMessage, 5);
				se.element().enterOrValidateText(getSignsScheduleInfo_XarcMessage(strSignsScheduleInfo_XarcMessage),strSignsScheduleInfo_XarcMessage,test);
				}
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for CP_SignsScheduleInfo_Details ", true, false, true, test);
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
