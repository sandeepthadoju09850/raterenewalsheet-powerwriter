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

public class CP_ScheduledProperty extends BL_OR_CP {

	public void CP_ScheduledProperty_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.ScheduledPropertyFloater)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.ScheduledPropertyFloater, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strSchPropFlt_DD_Location = (String) row.get("SchPropFlt_DD_Location");
			String strSchPropFlt_TXT_DescProperty = (String) row.get("SchPropFlt_TXT_DescProperty");
			String strSchPropFlt_TXT_DescPropertyLmt = (String) row.get("SchPropFlt_TXT_DescPropertyLmt");
			//String strSchPropFlt_BTN_Edit = (String) row.get("SchPropFlt_BTN_Edit");
			String strSchPropFlt_BTN_Add = (String) row.get("SchPropFlt_BTN_Add");
			String strSchPropFlt_XarcMessage = (String) row.get("SchPropFlt_XarcMessage");
			try {
				se.log().logTestStep("CP_ScheduledProperty_Details");
				test.log(LogStatus.INFO, "CP_ScheduledProperty_Details","Transaction Step : "+transaction + "<br>" +"Page : CP_ScheduledProperty_Details");
				se.verify().verifyEquals("CP_ScheduledProperty_Details  of AgencyPortal ", getSchPropFlt_label().isDisplayed(),true, true,test);
				if(strSchPropFlt_BTN_Add.contains("Add"))
				{
					se.element().Click(getLocations_BTN_AddNew(strSchPropFlt_BTN_Add), test);
					se.element().SelectElement(SchPropFlt_DD_Location, strSchPropFlt_DD_Location,test);
					se.element().enterOrValidateText( getSchPropFlt_TXT_DescProperty(strSchPropFlt_TXT_DescProperty),strSchPropFlt_TXT_DescProperty,test);
					se.element().enterOrValidateText( getSchPropFlt_TXT_DescPropertyLmt(strSchPropFlt_TXT_DescPropertyLmt),strSchPropFlt_TXT_DescPropertyLmt,test);
					se.element().Click(getAdd_Button(), test);
				}
				if(!strSchPropFlt_XarcMessage.contains("N/A"))
				{
				se.element().waitForElementToAppear_One(strSchPropFlt_XarcMessage,SchPropFlt_XarcMessage, 5);
				se.element().enterOrValidateText(getSignsScheduleInfo_XarcMessage(strSchPropFlt_XarcMessage),strSchPropFlt_XarcMessage,test);
				}
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for CP_ScheduledProperty_Details ", true, false, true, test);
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
