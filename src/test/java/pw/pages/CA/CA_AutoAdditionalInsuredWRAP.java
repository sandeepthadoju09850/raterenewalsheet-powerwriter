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

public class CA_AutoAdditionalInsuredWRAP extends OR_CA{
	
	public void AutoAdditionalInsuredWRAP(String strRegressionID, String transaction,String suspendSheet ,ExtentTest test) throws IOException {
		try{
			
		if(suspendSheet.equalsIgnoreCase(constants.CA_AutoAdditionalInsuredWRAP)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_AutoAdditionalInsuredWRAP, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strAutoAddInsuredWrap_TXT_WrapPercentage= (String) row.get("AutoAddInsuredWrap_TXT_WrapPercentage");	
			String strAutoAddInsuredWrap_TXT_WrapPercentOverride= (String) row.get("AutoAddInsuredWrap_TXT_WrapPercentOverride");
			String strAutoAddInsuredWrap_TXT_TXT_Override_Premium_Reason= (String) row.get("AutoAddInsuredWrap_TXT_TXT_Override_Premium_Reason");
			String strAutoAddInsuredWrap_TXT_TXT_Override_Premium_ReasonFilterNeeded= (String) row.get("AutoAddInsuredWrap_TXT_TXT_Override_Premium_ReasonFilterNeeded");
			
			String strTestDescription = (String) row.get("Transaction Name");
			try{
				se.log().logTestStep("CA_AutoAdditionalInsuredWRAP");
				test.log(LogStatus.INFO, "CA_AutoAdditionalInsuredWRAP page","Transaction Step : "+strTestDescription + "<br>" +"Page : CA_AutoAdditionalInsuredWRAP");
				se.verify().verifyEquals("CA_AutoAdditionalInsuredWRAP Page of PowerWriter ", getAutoAdditionalInsuredWRAP_LabelName().isDisplayed(),true, true,test);
				
				se.element().enterOrValidateText(getAutoAddInsuredWrap_TXT_WrapPercentage(strAutoAddInsuredWrap_TXT_WrapPercentage),strAutoAddInsuredWrap_TXT_WrapPercentage,test);
				se.element().enterOrValidateText(getAutoAddInsuredWrap_TXT_WrapPercentOverride(strAutoAddInsuredWrap_TXT_WrapPercentOverride),strAutoAddInsuredWrap_TXT_WrapPercentOverride,test);
				se.element().selectPopupWithMagnifier(getAutoAddInsuredWrap_TXT_TXT_Override_Premium_Reason(strAutoAddInsuredWrap_TXT_TXT_Override_Premium_Reason), getAutoAddInsuredWrap_TXT_TXT_Override_Premium_ReasonSearch(strAutoAddInsuredWrap_TXT_TXT_Override_Premium_Reason), strAutoAddInsuredWrap_TXT_TXT_Override_Premium_Reason, strAutoAddInsuredWrap_TXT_TXT_Override_Premium_ReasonFilterNeeded, strAutoAddInsuredWrap_TXT_TXT_Override_Premium_Reason, constants.NA, constants.NA, constants.NA, test);
				se.util().sleep(2000);
				se.element().clickElement(getNext());
				se.util().sleep(2000);
				
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for CA_AutoAdditionalInsuredWRAP", true, false, true, test);
			}
			iteration++;
		}
		se.element().clickElement(getDone());
		}
		catch (Exception e) {
			// TODO: handle exception
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Failed", "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			testTearDown(se, test);
		}		
	}
}
		
