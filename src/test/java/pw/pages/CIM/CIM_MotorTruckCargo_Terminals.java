package pw.pages.CIM;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CIM;

public class CIM_MotorTruckCargo_Terminals extends OR_CIM{

	public void CIM_MotorTruckCargo_TerminalsPage(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_MotorTruckCargo_Terminals")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_MotorTruckCargo_Terminals", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		
		String strCIM_MotorTruckCargoTerminals_TXT_TerminalLocationNo = (String) row.get("CIM_MotorTruckCargoTerminals_TXT_TerminalLocationNo");
		String strCIM_MotorTruckCargoTerminals_TXT_Street = (String) row.get("CIM_MotorTruckCargoTerminals_TXT_Street");
		String strCIM_MotorTruckCargoTerminals_TXT_Ste_Unit = (String) row.get("CIM_MotorTruckCargoTerminals_TXT_Ste/Unit");
		String strCIM_MotorTruckCargoTerminals_TXT_City = (String) row.get("CIM_MotorTruckCargoTerminals_TXT_City");
		String strCIM_MotorTruckCargoTerminals_TXT_State = (String) row.get("CIM_MotorTruckCargoTerminals_TXT_State");
		String strCIM_MotorTruckCargoTerminals_TXT_Zip = (String) row.get("CIM_MotorTruckCargoTerminals_TXT_Zip");
		String strCIM_MotorTruckCargoTerminals_TXT_TerminalLimit = (String) row.get("CIM_MotorTruckCargoTerminals_TXT_TerminalLimit");
		String strCIM_MotorTruckCargoTerminals_BTN_DONE = (String) row.get("CIM_MotorTruckCargoTerminals_BTN_DONE");

	try {
		se.log().logTestStep("CP_CIM_MotorCargoPage");
		test.log(LogStatus.INFO, "CP_CIM_MotorCargoPage page","Transaction Step : " + transaction + "<br>" + "Page : CP_CIM_MotorCargoPage");
		//se.verify().verifyEquals("CP_CIM_MotorCargoPage Page of PowerWriter ",getPagecontainingtext("Terminal").isDisplayed(), true, true, test);
		se.element().clickElement(getCIM_Locations_BTN_Add(""),test);
		se.element().enterOrValidateText(getCIM_MotorTruckCargoTerminals_TXT_TerminalLocationNo(strCIM_MotorTruckCargoTerminals_TXT_TerminalLocationNo),strCIM_MotorTruckCargoTerminals_TXT_TerminalLocationNo,test);
		se.element().enterOrValidateText(getCIM_MotorTruckCargoTerminals_TXT_Street(strCIM_MotorTruckCargoTerminals_TXT_Street),strCIM_MotorTruckCargoTerminals_TXT_Street,test);
		se.element().enterOrValidateText(getCIM_MotorTruckCargoTerminals_TXT_Ste_Unit(strCIM_MotorTruckCargoTerminals_TXT_Ste_Unit),strCIM_MotorTruckCargoTerminals_TXT_Ste_Unit,test);
		se.element().enterOrValidateText(getCIM_MotorTruckCargoTerminals_TXT_City(strCIM_MotorTruckCargoTerminals_TXT_City),strCIM_MotorTruckCargoTerminals_TXT_City,test);
		se.element().enterOrValidateText(getCIM_MotorTruckCargoTerminals_TXT_State(strCIM_MotorTruckCargoTerminals_TXT_State),strCIM_MotorTruckCargoTerminals_TXT_State,test);
		se.element().enterOrValidateText(getCIM_MotorTruckCargoTerminals_TXT_Zip(strCIM_MotorTruckCargoTerminals_TXT_Zip),strCIM_MotorTruckCargoTerminals_TXT_Zip,test);
		se.util().sleep(2000);
		se.element().enterOrValidateText(getCIM_MotorTruckCargoTerminals_TXT_TerminalLimit(strCIM_MotorTruckCargoTerminals_TXT_TerminalLimit),strCIM_MotorTruckCargoTerminals_TXT_TerminalLimit,test);
		se.util().sleep(2000);
		se.element().Click(getNext(),test);
		if(strCIM_MotorTruckCargoTerminals_BTN_DONE.equalsIgnoreCase(constants.Yes)){
			se.element().Click(getDone(),test);
		}
		
	
	} catch (Exception e) {
		se.verify().verifyEquals("Failed to fill in details for CP_CIM_MotorCargoTerminals Page ", true, false, true, test);
				}
				iteration++;
			}

		} catch (Exception e) {
			// TODO: handle exception
			se.log().logTestStep(
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			test.log(LogStatus.FAIL, "Failed",
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			testTearDown(se, test);
		}

	}
}
