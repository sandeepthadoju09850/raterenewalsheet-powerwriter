package pw.pages.CIM;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.OR.OR_CIM;

public class CIM_TransitFloater_Terminal extends OR_CIM{
	public void TransitFloater_Terminal(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_TransitFloater_Terminal")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_TransitFloater_Terminal", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCIM_TransitFloater_Terminal_BTN_Add=(String) row.get("CIM_TransitFloater_Terminal_BTN_Add");
		String strCIM_TransitFloater_Terminal_Edit=(String) row.get("CIM_TransitFloater_Terminal_Edit");
		String strCIM_TransitFloater_Terminal_TXT_TerminalLocationNo=(String) row.get("CIM_TransitFloater_Terminal_TXT_TerminalLocationNo");
		String strCIM_TransitFloater_Terminal_TXT_Street=(String) row.get("CIM_TransitFloater_Terminal_TXT_Street");
		String strCIM_TransitFloater_Terminal_TXT_SteUnit=(String) row.get("CIM_TransitFloater_Terminal_TXT_Ste/Unit");
		String strCIM_TransitFloater_Terminal_TXT_City=(String) row.get("CIM_TransitFloater_Terminal_TXT_City");
		String strCIM_TransitFloater_Terminal_TXT_State=(String) row.get("CIM_TransitFloater_Terminal_TXT_State");
		String strCIM_TransitFloater_Terminal_TXT_Zip=(String) row.get("CIM_TransitFloater_Terminal_TXT_Zip");
		String strCIM_TransitFloater_Terminal_TXT_TerminalLimit=(String) row.get("CIM_TransitFloater_Terminal_TXT_TerminalLimit");
		String strCIM_TransitFloater_Terminal_Done=(String) row.get("CIM_TransitFloater_Terminal_Done");
		String strTransaction  = (String) row.get("Transaction");
		
		try {
			se.log().logTestStep("TransitFloater_Terminal");
			test.log(LogStatus.INFO, "TransitFloater_Terminal page","Transaction Step : " + strTransaction + "<br>" +"Page : CIM_TransitFloater_Terminal");
			if(strCIM_TransitFloater_Terminal_BTN_Add.equalsIgnoreCase("Yes")){
				se.element().clickElement(getCIM_TransitFloater_Terminal_BTN_Add());
			}
			if(strCIM_TransitFloater_Terminal_Edit.equalsIgnoreCase("Yes")){
				se.element().clickElement(getCIM_TransitFloater_Terminal_Edit(strCIM_TransitFloater_Terminal_Edit));
			}
			se.element().enterOrValidateText(getCIM_TransitFloater_Terminal_TXT_TerminalLocationNo(strCIM_TransitFloater_Terminal_TXT_TerminalLocationNo),strCIM_TransitFloater_Terminal_TXT_TerminalLocationNo,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_Terminal_TXT_Street(strCIM_TransitFloater_Terminal_TXT_Street),strCIM_TransitFloater_Terminal_TXT_Street,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_Terminal_TXT_SteUnit(strCIM_TransitFloater_Terminal_TXT_SteUnit),strCIM_TransitFloater_Terminal_TXT_SteUnit,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_Terminal_TXT_City(strCIM_TransitFloater_Terminal_TXT_City),strCIM_TransitFloater_Terminal_TXT_City,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_Terminal_TXT_State(strCIM_TransitFloater_Terminal_TXT_State),strCIM_TransitFloater_Terminal_TXT_State,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_Terminal_TXT_Zip(strCIM_TransitFloater_Terminal_TXT_Zip),strCIM_TransitFloater_Terminal_TXT_Zip,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_Terminal_TXT_TerminalLimit(strCIM_TransitFloater_Terminal_TXT_TerminalLimit),strCIM_TransitFloater_Terminal_TXT_TerminalLimit,test);
			se.element().Click(getNext(), test);
			
			if(strCIM_TransitFloater_Terminal_Done.equalsIgnoreCase("Yes")){
				se.element().Click(getDone(), test);
				
			}
		
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CIM_TransitFloater_Terminal", true, false, true, test);
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
