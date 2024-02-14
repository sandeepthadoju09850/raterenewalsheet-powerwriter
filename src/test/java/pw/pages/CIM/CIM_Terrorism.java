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

public class CIM_Terrorism extends OR_CIM{
	public void CIMTerrorism(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase(constants.CIM_Terrorism)){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CIM_Terrorism, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);

		String strCIM_Terrorism_TXT_Locations=(String) row.get("CIM_Terrorism_TXT_Locations");
		String strCIM_Terrorism_TXT_Building=(String) row.get("CIM_Terrorism_TXT_Building");
		String strCIM_Terrorism_TXT_Item=(String) row.get("CIM_Terrorism_TXT_Item");
		String strCIM_Terrorism_TXT_Coverage=(String) row.get("CIM_Terrorism_TXT_Coverage");
		String strCIM_Terrorism_TXT_LocationZip=(String) row.get("CIM_Terrorism_TXT_LocationZip");
		String strCIM_Terrorism_TXT_RatingTier=(String) row.get("CIM_Terrorism_TXT_RatingTier");
		String strCIM_Terrorism_TXT_RatingPercent=(String) row.get("CIM_Terrorism_TXT_RatingPercent");
		String strCIM_Terrorism_TXT_TerrorismPremium=(String) row.get("CIM_Terrorism_TXT_TerrorismPremium");
		
		try {
			se.log().logTestStep("CIM_Terrorism");
			test.log(LogStatus.INFO, "CIM_Terrorism page","Transaction Step : " + transaction + "<br>" +"Page : CIM_CTerrorism");
			if(!strRegressionID.equalsIgnoreCase("CP_13")){
				se.element().enterOrValidateText(getCIM_Terrorism_TXT_TerrorismPremium(strCIM_Terrorism_TXT_TerrorismPremium),strCIM_Terrorism_TXT_TerrorismPremium,test);
			}
			se.element().Click(getNext(),test);
		
		}
		
	catch (Exception e) {
		se.verify().verifyEquals("Failed to fill in details for CIM_Terrorism", true, false, true, test);
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