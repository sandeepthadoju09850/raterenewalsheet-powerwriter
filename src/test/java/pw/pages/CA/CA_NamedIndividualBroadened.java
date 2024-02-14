package pw.pages.CA;

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

/**
* @author ${ro09528}
*/

public class CA_NamedIndividualBroadened extends OR_CA{
	
	public void NamedIndividualBroadened(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		try{
		//String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(suspendSheet.equalsIgnoreCase(constants.CA_NamedIndividualBroadened)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_NamedIndividualBroadened, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strNamedIndvidualBroadened_BTN_Add = (String) row.get("NamedIndvidualBroadened_BTN_Add");
			String strNamedIndvidualBroadened_BTN_Details = (String) row.get("NamedIndvidualBroadened_BTN_Details");
			String strNamedIndvidualBroadened_BTN_Done = (String) row.get("NamedIndvidualBroadened_BTN_Done");
			String strNamedIndvidualBroadened_BTN_Remove = (String) row.get("NamedIndvidualBroadened_BTN_Remove");
			String strNamedIndvidualBroadened_TXT_State = (String) row.get("NamedIndvidualBroadened_TXT_State");
			String strNamedIndvidualBroadened_TXT_StateFilterNeeded = (String) row.get("NamedIndvidualBroadened_TXT_StateFilterNeeded");
			String strNamedIndvidualBroadened_TXT_FirstName = (String) row.get("NamedIndvidualBroadened_TXT_FirstName");
			String strNamedIndvidualBroadened_TXT_MiddleName = (String) row.get("NamedIndvidualBroadened_TXT_MiddleName");
			String strNamedIndvidualBroadened_TXT_NameSuffix = (String) row.get("NamedIndvidualBroadened_TXT_NameSuffix");
			String strNamedIndvidualBroadened_TXT_LastName = (String) row.get("NamedIndvidualBroadened_TXT_LastName");
			
			String strNamedIndvidualBroadened_TXT_TitlePrefix = (String) row.get("NamedIndvidualBroadened_TXT_TitlePrefix");

		try{
			se.log().logTestStep("CA_NamedIndividualBroadened");
			test.log(LogStatus.INFO, "CA_NamedIndividualBroadened page","Transaction Step : "+transaction + "<br>" +"Page : CA_NamedIndividualBroadened");
			se.verify().verifyEquals("CA_NamedIndividualBroadened Page of PowerWriter ", getNamedIndvidualBroadenedLabel().isDisplayed(),true, true,test);
			
			if(!strNamedIndvidualBroadened_BTN_Add.equals(constants.NA)){
				se.element().Click(getNamedIndvidualBroadened_BTN_Add(strNamedIndvidualBroadened_BTN_Add),strNamedIndvidualBroadened_BTN_Add,test);
			}
			if(!strNamedIndvidualBroadened_BTN_Details.equals(constants.NA)){
				se.element().Click(getNamedIndvidualBroadened_BTN_Details(strNamedIndvidualBroadened_BTN_Details),strNamedIndvidualBroadened_BTN_Details,test);
			}
			
			se.element().selectPopupWithMagnifier(getNamedIndvidualBroadened_TXT_State(strNamedIndvidualBroadened_TXT_State),getNamedIndvidualBroadened_TXT_StateSearch(strNamedIndvidualBroadened_TXT_State),strNamedIndvidualBroadened_TXT_State,strNamedIndvidualBroadened_TXT_StateFilterNeeded,strNamedIndvidualBroadened_TXT_State, constants.NA, constants.NA,constants.NA,test);
			se.element().enterOrValidateText(getNamedIndvidualBroadened_TXT_FirstName(strNamedIndvidualBroadened_TXT_FirstName),strNamedIndvidualBroadened_TXT_FirstName,test);
			se.element().enterOrValidateText(getNamedIndvidualBroadened_TXT_MiddleName(strNamedIndvidualBroadened_TXT_MiddleName),strNamedIndvidualBroadened_TXT_MiddleName,test);
			se.element().enterOrValidateText(getNamedIndvidualBroadened_TXT_LastName(strNamedIndvidualBroadened_TXT_LastName),strNamedIndvidualBroadened_TXT_LastName,test);
			se.element().enterOrValidateText(getNamedIndvidualBroadened_TXT_NameSuffix(strNamedIndvidualBroadened_TXT_NameSuffix),strNamedIndvidualBroadened_TXT_NameSuffix,test);
			
			
			se.element().enterOrValidateText(getNamedIndvidualBroadened_TXT_TitlePrefix(strNamedIndvidualBroadened_TXT_TitlePrefix),strNamedIndvidualBroadened_TXT_TitlePrefix,test);
			se.element().Click(getNamedIndvidualBroadened_BTN_Done(strNamedIndvidualBroadened_BTN_Done),strNamedIndvidualBroadened_BTN_Done,test);
			se.element().Click(getNext(),test);
			if(!strNamedIndvidualBroadened_BTN_Done.equals(constants.NA)){
				se.element().Click(getNamedIndvidualBroadened_BTN_Done(strNamedIndvidualBroadened_BTN_Done),strNamedIndvidualBroadened_BTN_Done,test);
			}
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for CA_NamedIndividualBroadened ", true, false, true, test);
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