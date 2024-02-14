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

public class CA_RentalVehicleCoverage extends OR_CA{
	
	public void RentalVehicleCoverage(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		try{
		
		if(suspendSheet.equalsIgnoreCase(constants.CA_RentalVehicleCoverage)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_RentalVehicleCoverage, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);	
			String strRentalVehicle_BTN_Add = (String) row.get("RentalVehicle_BTN_Add");
			String strRentalVehicle_BTN_Remove = (String) row.get("RentalVehicle_BTN_Remove");
			String strRentalVehicle_BTN_Details = (String) row.get("RentalVehicle_BTN_Details");
			String strRentalVehicle_BTN_Done = (String) row.get("RentalVehicle_BTN_Done");
			String strRentalVehicle_TXT_StateFilterNeeded = (String) row.get("RentalVehicle_BTN_StateFilterNeeded");
			String strRentalVehicle_TXT_State = (String) row.get("RentalVehicle_BTN_State");
			String strTestDescription = (String) row.get("Transaction Name");
			try{
				se.log().logTestStep("CA_RentalVehicleCoverage");
				test.log(LogStatus.INFO, "CA_RentalVehicleCoverage page","Transaction Step : "+strTestDescription + "<br>" +"Page : CA_RentalVehicleCoverage");
				se.verify().verifyEquals("CA_RentalVehicleCoverage Page of PowerWriter ", getCA_RentalVehicleCoverage_LabelName().isDisplayed(),true, true,test);
				
				if(strRentalVehicle_BTN_Add.equalsIgnoreCase("Yes")){
					se.element().waitForElementIsDisplayed(RentalVehicle_BTN_Add, 10);
					se.element().Click(getRentalVehicle_BTN_Add(), test);
				}
				if(!strRentalVehicle_BTN_Details.equalsIgnoreCase("N/A")){
					se.element().Click(getRentalVehicle_BTN_Details(strRentalVehicle_BTN_Details), test);
				}
				
				if(strRentalVehicle_BTN_Remove.equalsIgnoreCase("Yes")){
					se.element().checkUncheckOrValidate(getRentalVehicle_BTN_Remove(),"Check",test);
					se.element().Click(getRentalVehicle_BTN_Remove(), test);
				}else{
					
					se.element().selectPopupWithMagnifier(getRentalVehicle_TXT_State(strRentalVehicle_TXT_State),getRentalVehicle_TXT_StateSearch(strRentalVehicle_TXT_State),strRentalVehicle_TXT_State,strRentalVehicle_TXT_StateFilterNeeded,strRentalVehicle_TXT_State, constants.NA, constants.NA,constants.NA,test);
					se.element().clickElement(getNext());
					se.util().sleep(2000);
					if(strRentalVehicle_BTN_Done.equals("Yes")) {
						se.element().clickElement(getDone());
						}
				}
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for CA_RentalVehicleCoverage ", true, false, true, test);
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
		
