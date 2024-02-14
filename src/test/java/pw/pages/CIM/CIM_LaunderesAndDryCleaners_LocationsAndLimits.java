package pw.pages.CIM;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.OR.OR_CIM;

public class CIM_LaunderesAndDryCleaners_LocationsAndLimits extends OR_CIM {

	public void CIM_LaunderesAndDryCleaners_LocationsAndLimitsPage(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
		if (SuspendSheet.equalsIgnoreCase("CIM_LaunderDryClean_LocAndLimit")) {
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_LaunderDryClean_LocAndLimit", strRegressionID,transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			
			String strAdd_BTN = (String) row.get("Add_BTN");
			String strLoc_Loc_No_TXT = (String) row.get("Loc_LocNo_TXT");
			String strLoc_Name_TXT = (String) row.get("Loc_Name_TXT");
			String strLoc_Description_TXT = (String) row.get("Loc_Description_TXT");
			String strLoc_Street_TXT = (String) row.get("Loc_Street_TXT");
			String strLoc_SteUnit_TXT = (String) row.get("Loc_SteUnit_TXT");
			String strLoc_City_TXT = (String) row.get("Loc_City_TXT");
			String strLoc_State_TXT = (String) row.get("Loc_State_TXT");
			String strLoc_Zip_TXT = (String) row.get("Loc_Zip_TXT");
			String strLaundDryClean_ProcessingCov_limit_TXT = (String) row.get("LaundDryClean_ProcessingCov_limit_TXT");
			String strProperty_in_the_cust_of_sub_cont_limit_TXT = (String) row.get("Property_in_the_cust_of_sub_cont_limit_TXT");
			String strLaundDryClean_BTN_DoneButton = (String) row.get("LaundDryClean_BTN_DoneButton");
	
			try{
			se.log().logTestStep("LaunderersAndDryCleanersCoverage");
			test.log(LogStatus.INFO, "LaunderersAndDryCleanersCoverage page","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMLaunderersAndDryCleanersCoverage");
			if(!strAdd_BTN.equals("N/A")){
			se.element().Click(getCommon_CIM_Cov_BTN_Add(strAdd_BTN),test);
			}
			se.element().enterOrValidateText(getCommon_CIM_Loc_TXT_location_no(strLoc_Loc_No_TXT), strLoc_Loc_No_TXT, test);
			//se.element().selectPopupWithMagnifier(getCommon_CIM_Loc_TXT_location_no(strLoc_Loc_No_TXT), getCommon_CIM_Loc_TXT_location_noSearch(strLoc_Loc_No_TXT), strLoc_Loc_No_TXT, constants.NA, strLoc_Loc_No_TXT, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCommon_CIM_Loc_TXT_name(strLoc_Name_TXT), strLoc_Name_TXT, test);
			se.element().enterOrValidateText(getCommon_CIM_Loc_TXT_description(strLoc_Description_TXT), strLoc_Description_TXT, test);
			se.element().enterOrValidateText(getCommon_CIM_Loc_TXT_Street(strLoc_Street_TXT), strLoc_Street_TXT, test);
			se.element().enterOrValidateText(getCommon_CIM_Loc_TXT_SteUnit(strLoc_SteUnit_TXT), strLoc_SteUnit_TXT, test);
			se.element().enterOrValidateText(getCommon_CIM_Loc_TXT_city(strLoc_City_TXT), strLoc_City_TXT, test);
			se.element().enterOrValidateText(getCommon_CIM_Loc_TXT_State(strLoc_State_TXT), strLoc_State_TXT, test);
			se.element().enterOrValidateText(getCommon_CIM_Loc_TXT_zip_code(strLoc_Zip_TXT), strLoc_Zip_TXT, test);
			se.element().enterOrValidateText(getCIM_LaundAndDryCleanBaileLocAndLimits_Loc_TXT_ProcessCovLimit(strLaundDryClean_ProcessingCov_limit_TXT), strLaundDryClean_ProcessingCov_limit_TXT, test);
			se.element().enterOrValidateText(getCIM_LaundAndDryCleanBaileLocAndLimits_Loc_TXT_SubcontractorLimit(strProperty_in_the_cust_of_sub_cont_limit_TXT), strProperty_in_the_cust_of_sub_cont_limit_TXT, test);
			
			se.element().Click(getNext(),test);
			if(!strLaundDryClean_BTN_DoneButton.equals("N/A")) {
				se.element().Click(getDone(),test);
				}	
		}
		 catch (Exception e) {
				se.verify().verifyEquals("Failed to fill in details for LaunderersAndDryCleanersCoverage", true, false, true, test);
				
			}
					iteration++;
				}
		}
		catch (Exception e) {
			// TODO: handle exception
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Failed", "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			testTearDown(se, test);
		}
			
	}
	}
