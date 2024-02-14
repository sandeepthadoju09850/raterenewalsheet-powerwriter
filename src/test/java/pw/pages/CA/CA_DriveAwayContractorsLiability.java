package pw.pages.CA;

/**
 * @author ${pr09529}
 */

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CA;
import pw.OR.OR_CP;
import pw.OR.OR_GL;

public class CA_DriveAwayContractorsLiability extends OR_CA{
	
	public void DriveAwayContractorsLiability(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase(constants.CA_DriveAwayContractorsLiability)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_DriveAwayContractorsLiability, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				
			String strDriveAwayContractorsLiability_BTN_Add = (String) row.get("DriveAwayContractorsLiability_BTN_Add");
			String strDriveAwayContractorsLiability_BTN_RemoveCov = (String) row.get("DriveAwayContractorsLiability_BTN_RemoveCov");
			String strDriveAwayContractorsLiability_BTN_Details = (String) row.get("DriveAwayContractorsLiability_BTN_Details");
			String strDriveAwayContractorsLiability_TXT_State = (String) row.get("DriveAwayContractorsLiability_TXT_State");
			String strDriveAwayContractorsLiability_TXT_StateFilterNeeded = (String) row.get("DriveAwayContractorsLiability_TXT_StateFilterNeeded");
			String strDriveAwayContractorsLiability_TXT_Territory = (String) row.get("DriveAwayContractorsLiability_TXT_Territory");
			String strDriveAwayContractorsLiability_TXT_DescriptionOfPlates = (String) row.get("DriveAwayContractorsLiability_TXT_DescriptionOfPlates");
			String strDriveAwayContractorsLiability_TXT_CombinedSingleLimit = (String) row.get("DriveAwayContractorsLiability_TXT_CombinedSingleLimit");
			String strDriveAwayContractorsLiability_TXT_Deductible = (String) row.get("DriveAwayContractorsLiability_TXT_Deductible");
			String strDriveAwayContractorsLiability_TXT_NumberOfPlates = (String) row.get("DriveAwayContractorsLiability_TXT_NumberOfPlates");
			String strDriveAwayContractorsLiability_BTN_Done = (String) row.get("DriveAwayContractorsLiability_BTN_Done");
			
			String strTestDescription = (String) row.get("Transaction Name");
			try{
				se.log().logTestStep("CA_DriveAwayContractorsLiability");
				test.log(LogStatus.INFO, "DriveAwayContractorsLiability page","Transaction Step : "+strTestDescription + "<br>" +"Page : DriveAwayContractorsLiability");
				se.verify().verifyEquals("DriveAwayContractorsLiability Page of PowerWriter ", getCA_DriveAwayContractorsLiability_LabelName().isDisplayed(),true, true,test);
				
				if(strDriveAwayContractorsLiability_BTN_Add.equalsIgnoreCase("Yes")){
					se.element().waitForElementIsDisplayed(DriveAwayContractorsLiability_BTN_Add, 10);
					se.element().Click(getDriveAwayContractorsLiability_BTN_Add(), test);
				}
				if(!strDriveAwayContractorsLiability_BTN_Details.equalsIgnoreCase(constants.NA)){
					se.element().Click(getDriveAwayContractorsLiability_BTN_Details(strDriveAwayContractorsLiability_BTN_Details), test);
				}
				
				if(strDriveAwayContractorsLiability_BTN_RemoveCov.equalsIgnoreCase("Yes")){
					se.element().checkUncheckOrValidate(getDriveAwayContractorsLiability_BTN_RemoveCov(),"Check",test);
					se.element().Click(getDriveAwayContractorsLiability_BTN_RemoveCov(), test);
				}else{
					
					se.element().selectPopupWithMagnifier(getDriveAwayContractorsLiability_TXT_State(strDriveAwayContractorsLiability_TXT_State),getDriveAwayContractorsLiability_TXT_StateSearch(strDriveAwayContractorsLiability_TXT_State),strDriveAwayContractorsLiability_TXT_State,strDriveAwayContractorsLiability_TXT_StateFilterNeeded,strDriveAwayContractorsLiability_TXT_State, constants.NA, constants.NA,constants.NA,test);
					se.element().enterOrValidateText(getDriveAwayContractorsLiability_TXT_Territory(strDriveAwayContractorsLiability_TXT_Territory),strDriveAwayContractorsLiability_TXT_Territory,test);
					se.element().enterOrValidateText(getDriveAwayContractorsLiability_TXT_DescriptionOfPlates(strDriveAwayContractorsLiability_TXT_DescriptionOfPlates),strDriveAwayContractorsLiability_TXT_DescriptionOfPlates,test);
					se.element().enterOrValidateText(getDriveAwayContractorsLiability_TXT_CombinedSingleLimit(strDriveAwayContractorsLiability_TXT_CombinedSingleLimit),strDriveAwayContractorsLiability_TXT_CombinedSingleLimit,test);
					se.element().enterOrValidateText(getDriveAwayContractorsLiability_TXT_Deductible(strDriveAwayContractorsLiability_TXT_Deductible),strDriveAwayContractorsLiability_TXT_Deductible,test);
					se.element().enterOrValidateText(getDriveAwayContractorsLiability_TXT_NumberOfPlates(strDriveAwayContractorsLiability_TXT_NumberOfPlates),strDriveAwayContractorsLiability_TXT_NumberOfPlates,test);
					se.element().clickElement(getNext());
					se.util().sleep(2000);
					if(strDriveAwayContractorsLiability_BTN_Done.equals("Yes")) {
						se.element().clickElement(getDone());
						}
				}
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for CA_DriveAwayContractorsLiability ", true, false, true, test);
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
		
