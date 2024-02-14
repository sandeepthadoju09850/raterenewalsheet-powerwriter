package pw.pages.COMMON;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_Common;

public class PW_Login extends OR_Common {

	public void PWAppLogin(String strRegressionID, String transaction, ExtentTest test) throws IOException {
	
	try{		
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
		if (SuspendSheet.equalsIgnoreCase(constants.Login)) {
			test.log(LogStatus.INFO, "Page Suspended :- ",
					"Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Login, strRegressionID,
				transaction);
		
			int iteration = 0;
			while (iteration < table.size()) {
				try{
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);

				String strLogin_TXT_UserName = (String) row.get("Login_TXT_UserName");
				String strLogin_TXT_Password = (String) row.get("Login_TXT_Password");

				se.log().logTestStep("Log into the PowerWriter");
				test.log(LogStatus.INFO, "<b>Executing</b>", "<b style='background-color:lightgreen; color:blue'>Transaction Step : " + transaction + "<br>Page : Login</br></b>");
				se.verify().verifyEquals("login page for PowerWriter ", getLogin_LBL_Login().isDisplayed(), true, true,test);
				se.element().enterOrValidateText(getLogin_TXT_UserName(strLogin_TXT_UserName), strLogin_TXT_UserName,test);
				se.element().enterOrValidateText(getLogin_TXT_Password(strLogin_TXT_Password), strLogin_TXT_Password,test);
				se.log().logSeStep("Entering username as: " + strLogin_TXT_UserName);
				se.log().logSeStep("Entering password as: " + strLogin_TXT_Password);
				se.element().Click(getLgnCommit(), test);
			}

		 catch (Exception e) {
			se.verify().verifyEquals("Application login is unsuccessful ", true, false, true, test);
			
		}
				iteration++;
			}
		
	}
	catch (Exception e) {
		
		se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
		test.log(LogStatus.FAIL, "Failed", "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
		testTearDown(se, test);
	}
		
   }
}
