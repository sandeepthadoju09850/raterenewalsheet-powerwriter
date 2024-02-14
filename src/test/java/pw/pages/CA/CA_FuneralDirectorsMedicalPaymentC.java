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
public class CA_FuneralDirectorsMedicalPaymentC extends OR_CA{
	
	public void FuneralDirectorsMedicalPaymentC(String strRegressionID, String transaction,String suspendSheet,ExtentTest test) throws IOException {
		try{
		//String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(suspendSheet.equalsIgnoreCase(constants.CA_FuneralDirectorsMedicalPaymentC)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_FuneralDirectorsMedicalPaymentC, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strFuneralDirectors_BTN_Add = (String) row.get("FuneralDirectors_BTN_Add");
			String strFuneralDirectors_BTN_Done = (String) row.get("FuneralDirectors_BTN_Done");
			String strFuneralDirectors_TXT_State = (String) row.get("FuneralDirectors_TXT_State");
			String strFuneralDirectors_TXT_StateFilterNeeded = (String) row.get("FuneralDirectors_TXT_StateFilterNeeded");
			String strFuneralDirectors_BTN_Remove = (String) row.get("FuneralDirectors_BTN_Remove");
			String strFuneralDirectors_BTN_Details = (String) row.get("FuneralDirectors_BTN_Details");

		try{
			se.log().logTestStep("CA_FuneralDirectorsMedicalPaymentCov");
			test.log(LogStatus.INFO, "CA_FuneralDirectorsMedicalPaymentCov page","Transaction Step : "+transaction + "<br>" +"Page : CA_FuneralDirectorsMedicalPaymentCov");
			se.verify().verifyEquals("CA_FuneralDirectorsMedicalPaymentCov Page of PowerWriter ", getFuneralDirectors_Label().isDisplayed(),true, true,test);
							
			if(strFuneralDirectors_BTN_Add.equalsIgnoreCase("Yes")){
				se.element().Click(getFuneralDirectors_BTN_Add(strFuneralDirectors_BTN_Add),test);
			}
				
			if(strFuneralDirectors_BTN_Details.equalsIgnoreCase("Yes")){
				se.element().Click(getFuneralDirectors_Details(strFuneralDirectors_BTN_Details),test);
			}
			
			se.element().selectPopupWithMagnifier(getFuneralDirectors_TXT_State(strFuneralDirectors_TXT_State),getFuneralDirectors_TXT_StateSearch(strFuneralDirectors_TXT_State),strFuneralDirectors_TXT_State,strFuneralDirectors_TXT_StateFilterNeeded,strFuneralDirectors_TXT_State, constants.NA, constants.NA,constants.NA,test);
			se.element().clickElement(getNext());
			if(strFuneralDirectors_BTN_Remove.equalsIgnoreCase("Yes")){
				se.element().Click(getFuneralDirectors_BTN_Remove(strFuneralDirectors_BTN_Remove), test);
			}
			
			if(strFuneralDirectors_BTN_Done.equalsIgnoreCase("Yes")){
				se.element().Click(getFuneralDirectors_BTN_Done(strFuneralDirectors_BTN_Done),test);
			}
		}
			catch(Exception e){
				se.verify().verifyEquals("Failed to fill in details for CA_FuneralDirectorsMedicalPaymentCov ", true, false, true, test);			
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