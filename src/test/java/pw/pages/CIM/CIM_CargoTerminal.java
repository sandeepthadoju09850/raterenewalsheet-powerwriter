package pw.pages.CIM;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.OR.OR_CIM;

public class CIM_CargoTerminal extends OR_CIM{
	public void CargoTerminal(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_CargoTerminal")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_CargoTerminal", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCIM_CargoTerminal_BTN_Add=(String) row.get("CIM_CargoTerminal_BTN_Add");
		String strCIM_CargoTerminal_Edit=(String) row.get("CIM_CargoTerminal_Edit");
		/*String strCIM_CargoTerminal_EditRowNumber=(String) row.get("CIM_CargoTerminal_EditRowNumber");*/
		String strCIM_CargoTerminal_Done=(String) row.get("CIM_CargoTerminal_Done");
		String strCIM_CargoTerminal_TXT_TerminalLocationNo=(String) row.get("CIM_CargoTerminal_TXT_TerminalLocationNo");
		String strCIM_CargoTerminal_TXT_Street=(String) row.get("CIM_CargoTerminal_TXT_Street");
		String strCIM_CargoTerminal_TXT_SteUnit=(String) row.get("CIM_CargoTerminal_TXT_SteUnit");
		String strCIM_CargoTerminal_TXT_City=(String) row.get("CIM_CargoTerminal_TXT_City");
		String strCIM_CargoTerminal_TXT_State=(String) row.get("CIM_CargoTerminal_TXT_State");
		String strCIM_CargoTerminal_TXT_ZipCode=(String) row.get("CIM_CargoTerminal_TXT_ZipCode");
		String strCIM_CargoTerminal_TXT_TerminalLimit=(String) row.get("CIM_CargoTerminal_TXT_TerminalLimit");
		String strTransaction  = (String) row.get("Transaction");
		
		try {
			se.log().logTestStep("CargoTerminal");
			test.log(LogStatus.INFO, "CargoTerminal page","Transaction Step : " + strTransaction + "<br>" +"Page : CIM_CargoTerminal");
			if(strCIM_CargoTerminal_BTN_Add.equalsIgnoreCase("Yes")){
				se.element().clickElement(CIM_CargoTerminal_BTN_Add);
			}
			if(strCIM_CargoTerminal_Edit.equalsIgnoreCase("Yes")){
				se.element().tryClick(getCIM_CargoTerminal_Edit(strCIM_CargoTerminal_Edit),test);
			}
			se.element().enterOrValidateText(getCIM_CargoTerminal_TXT_TerminalLocationNo(strCIM_CargoTerminal_TXT_TerminalLocationNo),strCIM_CargoTerminal_TXT_TerminalLocationNo,test);
			se.element().enterOrValidateText(getCIM_CargoTerminal_TXT_Street(strCIM_CargoTerminal_TXT_Street),strCIM_CargoTerminal_TXT_Street,test);
			se.element().enterOrValidateText(getCIM_CargoTerminal_TXT_SteUnit(strCIM_CargoTerminal_TXT_SteUnit),strCIM_CargoTerminal_TXT_SteUnit,test);
			se.element().enterOrValidateText(getCIM_CargoTerminal_TXT_City(strCIM_CargoTerminal_TXT_City),strCIM_CargoTerminal_TXT_City,test);
			if(!strCIM_CargoTerminal_TXT_State.equalsIgnoreCase("N/A") && !strCIM_CargoTerminal_TXT_State.contains("validate2")){
					se.element().clickSearchIcon(getCIM_CargoTerminal_BTN_State(), test);
					se.element().Click(getCIM_CargoTerminal_LNK_State(strCIM_CargoTerminal_TXT_State), test);
		    }else{
			se.element().enterOrValidateText(getCIM_CargoTerminal_TXT_State(strCIM_CargoTerminal_TXT_State),strCIM_CargoTerminal_TXT_State,test);
		    }
			if(!strCIM_CargoTerminal_TXT_ZipCode.equalsIgnoreCase("N/A") && !strCIM_CargoTerminal_TXT_ZipCode.contains("validate2")){
				se.element().clickSearchIcon(getCIM_CargoTerminal_BTN_ZipCode(), test);
				se.element().clickElement(getCIM_CargoTerminal_LNK_ZipCode(strCIM_CargoTerminal_TXT_ZipCode), test);
				
	        }else{
			se.element().enterOrValidateText(getCIM_CargoTerminal_TXT_ZipCode(strCIM_CargoTerminal_TXT_ZipCode),strCIM_CargoTerminal_TXT_ZipCode,test);
	        }
			se.element().enterOrValidateText(getCIM_CargoTerminal_TXT_TerminalLimit(strCIM_CargoTerminal_TXT_TerminalLimit),strCIM_CargoTerminal_TXT_TerminalLimit,test);


			se.element().Click(getNext(), test);
			se.util().sleep(1000);
			
			if(strCIM_CargoTerminal_Done.equalsIgnoreCase("Yes")){
				se.element().Click(getNext(), test);
				
			}
		

		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CIM_CargoTerminalPage", true, false, true, test);
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
