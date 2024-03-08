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

public class CP_ValuablePapers extends OR_CP {

	public void CP_ValuablePapers_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.ValuablePapers)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.ValuablePapers, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strValuablePapers_DD_Location = (String) row.get("ValuablePapers_DD_Location");
			String strValuablePapers_TXT_Limit = (String) row.get("ValuablePapers_TXT_Limit");
			//String strValuablePapers_BTN_Edit = (String) row.get("ValuablePapers_BTN_Edit");
			String strValuablePapers_BTN_Add = (String) row.get("ValuablePapers_BTN_Add");
			String strValuablePapers_XarcMessage = (String) row.get("ValuablePapers_XarcMessage");
			try {
				se.log().logTestStep("CP_ValuablePapers_Details");
				test.log(LogStatus.INFO, "CP_ValuablePapers_Details","Transaction Step : "+transaction + "<br>" +"Page : CP_ValuablePapers_Details");
				se.verify().verifyEquals("CP_ValuablePapers_Details  of AgencyPortal ", getValuablePapers_label().isDisplayed(),true, true,test);
				if(strValuablePapers_BTN_Add.contains("Add"))
				{
					se.element().Click(getIndSch_BTN_AddNew(strValuablePapers_BTN_Add), test);
					se.element().SelectElement(ValuablePapers_DD_Location, strValuablePapers_DD_Location,test);
					se.element().enterOrValidateText( getValuablePapers_TXT_Limit(strValuablePapers_TXT_Limit),strValuablePapers_TXT_Limit,test);
					se.element().Click(getAdd_Button(), test);
				}
				if(!strValuablePapers_XarcMessage.contains("N/A"))
				{
				se.element().waitForElementToAppear_One(strValuablePapers_XarcMessage,ValuablePapers_XarcMessage, 5);
				se.element().enterOrValidateText(getSignsScheduleInfo_XarcMessage(strValuablePapers_XarcMessage),strValuablePapers_XarcMessage,test);
				}
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for CP_ValuablePapers ", true, false, true, test);
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
