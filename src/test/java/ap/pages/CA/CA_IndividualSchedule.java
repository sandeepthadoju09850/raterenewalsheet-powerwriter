package ap.pages.CA;

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

public class CA_IndividualSchedule extends OR_CP  {

	public void CA_IndividualSchedule_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.IndividualSchedule)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.IndividualSchedule, strRegressionID, transaction);
		int iteration = 0;

		while (iteration < table.size()) {
			se.util().sleep(5000);
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strIndSch_BTN_AddNew= (String) row.get("IndSch_BTN_AddNew");
			String strIndSch_DD_State= (String) row.get("IndSch_DD_State");
			String strIndSch_TXT_FirstName= (String) row.get("IndSch_TXT_FirstName");
			String strIndSch_TXT_MiddleName= (String) row.get("IndSch_TXT_MiddleName");
			String strIndSch_TXT_LastName= (String) row.get("IndSch_TXT_LastName");
			String strIndSch_CHK_DriveOtherCar= (String) row.get("IndSch_CHK_DriveOtherCar");
			String strIndSch_CHK_BPIP= (String) row.get("IndSch_CHK_BPIP");
			
			try {
				se.log().logTestStep("CA_IndividualSchedule");
				
				test.log(LogStatus.INFO, "CA_IndividualSchedule","Transaction Step : "+transaction + "<br>" +"Page : CA_IndividualSchedule");
				se.verify().verifyEquals("CA_IndividualSchedule  of AgencyPortal ", getMenuLnkIndividualSchedule().isDisplayed(),true, true,test);
				if(strIndSch_BTN_AddNew.equals("Add"))
				{
					
					se.util().sleep(1000);
					
					se.element().Click(getBuildingandOccupantSelection_BTN_AddNew(strIndSch_BTN_AddNew), test);
					
						se.element().SelectElement(IndSch_DD_State, strIndSch_DD_State, test);
						se.element().waitForElementToAppear_One(strIndSch_CHK_DriveOtherCar,IndSch_CHK_DriveOtherCar, 60);
						se.element().checkUncheckOrValidate(getIndSch_CHK_DriveOtherCar(strIndSch_CHK_DriveOtherCar),strIndSch_CHK_DriveOtherCar,test);
						se.element().waitForElementToAppear_One(strIndSch_CHK_BPIP,IndSch_CHK_BPIP, 60);
						se.element().checkUncheckOrValidate(getIndSch_CHK_BPIP(strIndSch_CHK_BPIP),strIndSch_CHK_BPIP,test);
						se.element().enterOrValidateText(getIndSch_TXT_FirstName(strIndSch_TXT_FirstName), strIndSch_TXT_FirstName, test);	
						se.element().enterOrValidateText(getIndSch_TXT_MiddleName(strIndSch_TXT_MiddleName), strIndSch_TXT_MiddleName, test);
						se.element().enterOrValidateText(getIndSch_TXT_LastName(strIndSch_TXT_LastName), strIndSch_TXT_LastName, test);
						se.element().Click(getAdd_Button(), test);
						se.util().sleep(2000);
						se.element().waitForElementToDisappear_One(progressBar, 60);
				
					
					
					
				}
			}
			catch(Exception e){
				e.printStackTrace();
				e.getMessage();
				se.verify().verifyEquals("Failed to fill in details for CA_IndividualSchedule ", true, false, true, test);
			}
			iteration++;
		}
		se.element().waitForElementToAppear_One(" ",GI_CHK_Continue, 20);
		se.element().Click(getGI_CHK_Continue(), test);
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}
}
