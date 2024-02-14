package pw.pages.GL;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.OR.OR_GL;

public class GL_Terrorism extends OR_GL {

	public void GL_TerrorismPage(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase("GL_Terrorism")){
			 test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			 testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData("GL_Terrorism", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strTerrorism_Premium_TXT = (String) row.get("Terrorism_Premium_TXT");
			
			try{
				se.log().logTestStep("GL_Terrorism");
				test.log(LogStatus.INFO, "GL_Terrorism","Transaction Step : " + transaction + "<br>" + "Page : GL_Terrorism");
				se.element().enterOrValidateText(GL_Terrorism_Premium(strTerrorism_Premium_TXT),strTerrorism_Premium_TXT,test);
				se.element().Click(getNext(),test);
				
			}catch(Exception e){
				se.verify().verifyEquals("Failed to fill in details for KYTaxExemption", true, false, true, test);	
				
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
