package ap.pages.WC;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.BL_OR_CP;

public class WC_FlatWaiverOfSubrogation extends BL_OR_CP {
	public void WC_FlatWaiverOfSubrogation_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.FlatWaiverOfSubrogation)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.FlatWaiverOfSubrogation, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strFlatWaiverOfSub_DD_EntityType= (String) row.get("FlatWaiverOfSub_DD_EntityType");
			String strFlatWaiverOfSub_TXT_EntityName= (String) row.get("FlatWaiverOfSub_TXT_EntityName");
			String strFlatWaiverOfSub_BTN_Add =  (String) row.get("FlatWaiverOfSub_BTN_Add");
			try {
				se.log().logTestStep("FlatWaiverOfSubrogation");
				test.log(LogStatus.INFO, "FlatWaiverOfSubrogation","Transaction Step : "+transaction + "<br>" +"Page : FlatWaiverOfSubrogation");
				se.verify().verifyEquals("FlatWaiverOfSubrogation  of AgencyPortal ", getmenu_lnk_FlatWaiverOfSubrogation().isDisplayed(),true, true,test);
				if(strFlatWaiverOfSub_BTN_Add.equalsIgnoreCase("Add")){
				se.element().Click(getAddNew_Button(strFlatWaiverOfSub_BTN_Add), test);
				}se.element().SelectElement(FlatWaiverOfSub_DD_EntityType,strFlatWaiverOfSub_DD_EntityType,test);
				se.element().enterOrValidateText(getFlatWaiverOfSub_TXT_EntityName(strFlatWaiverOfSub_TXT_EntityName),strFlatWaiverOfSub_TXT_EntityName,test);
				se.element().Click(getAdd_Button(), test);
			}
			catch(Exception e){
				e.printStackTrace();
				e.getMessage();
				se.verify().verifyEquals("Failed to fill in details for FlatWaiverOfSubrogation ", true, false, true, test);
			}
			iteration++;
		}
		se.element().Click(getGI_CHK_Continue(), test);
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}
}
