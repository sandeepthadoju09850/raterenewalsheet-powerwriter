package ap.pages.UM;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.BL_OR_CP;

public class UM_Underwriter  extends BL_OR_CP{

	public   void UM_UW_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.UnderwritingQuestions)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.UnderwritingQuestions, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strUW_CHK_Hasanyproductwork_Yes = (String) row.get("UW_CHK_Hasanyproductwork_Yes");
			String strUW_CHK_Hasanyproductwork_No = (String) row.get("UW_CHK_Hasanyproductwork_No");
			String strUW_TXT_Hasanyproductwork_Expalnation = (String) row.get("UW_TXT_Hasanyproductwork_Expalnation");
			String strUW_TXT_Specifydates = (String) row.get("UW_TXT_Specifydates");
			String strUW_CHK_Doyouhavepreviousexperience_Yes = (String) row.get("UW_CHK_Doyouhavepreviousexperience_Yes");
			String strUW_CHK_AreExplosivescaustics_Yes = (String) row.get("UW_CHK_AreExplosivescaustics_Yes");
			String strUW_CHK_AreExplosivescaustics_No = (String) row.get("UW_CHK_AreExplosivescaustics_No");
			String strUW_TXT_AreExplosivescaustics_Explanation = (String) row.get("UW_TXT_AreExplosivescaustics_Explanation");
			try {
				se.log().logTestStep("UM_Underwriter");
				test.log(LogStatus.INFO, "UM_Underwriter page","Transaction Step : "+transaction + "<br>" +"Page : UM_Underwriter");
				se.verify().verifyEquals("UM_Underwriter Details  of AgencyPortal ", getUnderWritterUM_label().isDisplayed(),true, true,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Hasanyproductwork_Yes(strUW_CHK_Hasanyproductwork_Yes),strUW_CHK_Hasanyproductwork_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Hasanyproductwork_No(strUW_CHK_Hasanyproductwork_No),strUW_CHK_Hasanyproductwork_No,test);
				se.element().enterOrValidateText(getUW_TXT_Hasanyproductwork_Expalnation(strUW_TXT_Hasanyproductwork_Expalnation),strUW_TXT_Hasanyproductwork_Expalnation,test);
				se.element().checkUncheckOrValidate( getUW_CHK_Doyouhavepreviousexperience_Yes(strUW_CHK_Doyouhavepreviousexperience_Yes),strUW_CHK_Doyouhavepreviousexperience_Yes,test);
				se.element().enterOrValidateText(getUW_TXT_Specifydates(strUW_TXT_Specifydates),strUW_TXT_Specifydates,test);
				se.element().checkUncheckOrValidate( getUW_CHK_AreExplosivescaustics_Yes(strUW_CHK_AreExplosivescaustics_Yes),strUW_CHK_AreExplosivescaustics_Yes,test);
				se.element().checkUncheckOrValidate( getUW_CHK_AreExplosivescaustics_No(strUW_CHK_AreExplosivescaustics_No),strUW_CHK_AreExplosivescaustics_No,test);
				se.element().enterOrValidateText(getUW_TXT_AreExplosivescaustics_Explanation(strUW_TXT_AreExplosivescaustics_Explanation),strUW_TXT_AreExplosivescaustics_Explanation,test);
				iteration++;
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for UM_Underwriter ", true, false, true, test);
				iteration++;
			}
			se.element().Click(getGI_CHK_Continue(), test);
		}
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}
}
