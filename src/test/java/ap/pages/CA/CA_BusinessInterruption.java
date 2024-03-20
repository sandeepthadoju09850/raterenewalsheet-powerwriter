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


public class CA_BusinessInterruption extends BL_OR_CP  {
	public void CA_BusinessInterruptionDetails(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.BusinessInterruption)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.BusinessInterruption, strRegressionID, transaction);
		int iteration = 0;

		while (iteration < table.size()) {
			
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strBI_BTN_Add= (String) row.get("BI_BTN_Add");
			String strBI_DD_ScheduleVehicle= (String) row.get("BI_DD_ScheduleVehicle");
			String strBI_TXT_LimitOfInsurance= (String) row.get("BI_TXT_LimitOfInsurance");
			String strBI_BTN_Edit= (String) row.get("BI_BTN_Edit");
			String strBI_BTN_EditLoc= (String) row.get("BI_BTN_EditLoc");
			
			
			try {
				se.log().logTestStep("CA_BusinessInterruption");
				test.log(LogStatus.INFO, "CA_BusinessInterruption","Transaction Step : "+transaction + "<br>" +"Page : CA_IndividualSchedule");
				se.verify().verifyEquals("CA_BusinessInterruption of AgencyPortal ", getmenu_lnk_BusinessInterruption().isDisplayed(),true, true,test);
				if(strBI_BTN_Edit.equals("Edit"))
				{
					se.element().waitForElementToAppear_One(strBI_BTN_EditLoc,Locations_BTN_Edit, 20);
					se.element().Click(getLocations_BTN_Edit(strBI_BTN_EditLoc), test);
					se.element().waitForElementToAppear_One(strBI_DD_ScheduleVehicle,BI_DD_ScheduleVehicle, 20);
					se.element().SelectElement(BI_DD_ScheduleVehicle, strBI_DD_ScheduleVehicle, test);
					se.element().enterOrValidateText(getBI_TXT_LimitOfInsurance(strBI_TXT_LimitOfInsurance), strBI_TXT_LimitOfInsurance, test);
					se.element().Click(getLocations_BTN_Save(), test);
				}
				else if(strBI_BTN_Add.equals("Add"))
				{
					if(iteration>=1) {
						se.element().waitForElementToAppear_One(strBI_BTN_Add,Locations_BTN_AddNew, 20);
						se.element().Click(getLocations_BTN_AddNew(strBI_BTN_Add), test); 
						}
					se.element().waitForElementToAppear_One(strBI_DD_ScheduleVehicle,BI_DD_ScheduleVehicle, 20);
						se.element().SelectElement(BI_DD_ScheduleVehicle, strBI_DD_ScheduleVehicle, test);
						se.element().enterOrValidateText(getBI_TXT_LimitOfInsurance(strBI_TXT_LimitOfInsurance), strBI_TXT_LimitOfInsurance, test);	
						se.element().Click(getAdd_Button(), test);
					}
			}
			catch(Exception e){
				e.printStackTrace();
				e.getMessage();
				se.verify().verifyEquals("Failed to fill in details for CA_BusinessInterruption", true, false, true, test);
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
