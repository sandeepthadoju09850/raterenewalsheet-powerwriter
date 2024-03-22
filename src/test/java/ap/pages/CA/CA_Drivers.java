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

public class CA_Drivers extends BL_OR_CP {

	public void CA_Drivers_Details(String strRegressionID, String transaction, String suspendSheet, ExtentTest test) throws IOException
	{
		try{
		if(suspendSheet.equalsIgnoreCase(constants.Drivers)){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
	         testTearDown(se, test);
	    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getBLPagesData(constants.Drivers, strRegressionID, transaction);
		int iteration = 0;

		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strDriver_TXT_Firstname = (String) row.get("Driver_TXT_Firstname");
			String strDriver_TXT_Lastname = (String) row.get("Driver_TXT_Lastname");
			String strDriver_TXT_Dob = (String) row.get("Driver_TXT_Dob");
			String strDriver_TXT_LicenseNo = (String) row.get("Driver_TXT_LicenseNo");
			String strDriver_DD_LicenseState = (String) row.get("Driver_DD_LicenseState");
			String strDriver_TXT_Licensed = (String) row.get("Driver_TXT_Licensed");
			String strDriver_DD_Gender = (String) row.get("Driver_DD_Gender");
			String strDriver_DD_Martial = (String) row.get("Driver_DD_Martial");
			String strDriver_TXT_YrsofExp = (String) row.get("Driver_TXT_YrsofExp");
			String strDriver_TXT_Hireddate = (String) row.get("Driver_TXT_Hireddate");
			String strDriver_BTN_Edit = (String) row.get("Driver_BTN_Edit");
			String strDriver_BTN_EditLoc = (String) row.get("Driver_BTN_EditLoc");
			String strDriver_BTN_Add = (String) row.get("Driver_BTN_Add");
			//String strDriver_BTN_AddLoc = (String) row.get("Driver_BTN_AddLoc");
			try {

				se.log().logTestStep("CA_Drivers");
				test.log(LogStatus.INFO, "CA_Drivers","Transaction Step : "+transaction + "<br>" +"Page : CA_Drivers");
				se.verify().verifyEquals("CA_Drivers  of AgencyPortal ", getMenuLnkDrivers().isDisplayed(),true, true,test);
				if(strDriver_BTN_Edit.equals("Edit"))
				{
					se.element().Click(getLocations_BTN_Edit(strDriver_BTN_EditLoc),test);
					se.element().enterOrValidateText(getDriverFirstName(strDriver_TXT_Firstname), strDriver_TXT_Firstname,test);
					se.element().enterOrValidateText(getDriverLastName(strDriver_TXT_Lastname), strDriver_TXT_Lastname,test);
					se.element().enterOrValidateTextDate(getDriverDateOfBirth(strDriver_TXT_Dob), strDriver_TXT_Dob,test);
					se.element().enterOrValidateText(getDriverLicenseNumber(strDriver_TXT_LicenseNo), strDriver_TXT_LicenseNo,test);
					se.element().SelectElement(drivers_dd_LicenseState, strDriver_DD_LicenseState,test);
					se.element().enterOrValidateText(getDriverDateLicensed(strDriver_TXT_Licensed), strDriver_TXT_Licensed,test);
					se.element().SelectElement(drivers_dd_Gender, strDriver_DD_Gender,test);
					se.element().SelectElement(drivers_dd_MaritalStatus, strDriver_DD_Martial,test);
					se.element().enterOrValidateText(getDriverYearsExperience(strDriver_TXT_YrsofExp), strDriver_TXT_YrsofExp,test);
					se.element().enterOrValidateText(getDriverHireDate(strDriver_TXT_Hireddate), strDriver_TXT_Hireddate,test);
					se.element().Click(getLocations_BTN_Save(),test);
				}
				else if(strDriver_BTN_Add.equals("Add"))
				{
					se.element().Click(getLocations_BTN_AddNew(strDriver_BTN_Add),test);
					se.element().enterOrValidateText(getDriverFirstName(strDriver_TXT_Firstname), strDriver_TXT_Firstname,test);
					se.element().enterOrValidateText(getDriverLastName(strDriver_TXT_Lastname), strDriver_TXT_Lastname,test);
					se.element().enterOrValidateTextDate(getDriverDateOfBirth(strDriver_TXT_Dob), strDriver_TXT_Dob,test);
					se.element().enterOrValidateText(getDriverLicenseNumber(strDriver_TXT_LicenseNo), strDriver_TXT_LicenseNo,test);
					se.element().selectElement(drivers_dd_LicenseState, strDriver_DD_LicenseState);
					se.element().enterOrValidateText(getDriverDateLicensed(strDriver_TXT_Licensed), strDriver_TXT_Licensed,test);
					se.util().sleep(2000);
					se.element().selectElement(drivers_dd_Gender, strDriver_DD_Gender);
					se.element().selectElement(drivers_dd_MaritalStatus, strDriver_DD_Martial);
					se.element().enterOrValidateText(getDriverYearsExperience(strDriver_TXT_YrsofExp), strDriver_TXT_YrsofExp,test);
					se.element().enterOrValidateText(getDriverHireDate(strDriver_TXT_Hireddate), strDriver_TXT_Hireddate,test);
					se.element().Click(getAdd_Button(),test);
				}
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for CA_Drivers_Details ", true, false, true, test);
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
