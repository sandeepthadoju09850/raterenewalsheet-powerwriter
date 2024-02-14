package pw.pages.CU;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CU;

public class CU_AutoDealersPolicyCoverage extends OR_CU {
	
	public void AutoDealerPolicyCoverageInfo(String strRegressionID, String transaction,String suspendSheet ,ExtentTest test) throws IOException {
		try {
			
			if (suspendSheet.equalsIgnoreCase("AutoCoverageInformation")) {
				test.log(LogStatus.INFO, "Page Suspended :- ", "Transaction Step : " + transaction + "<br>" + "Page : " + suspendSheet);
				testTearDown(se, test);
			}
			List<Map<String, String>> table = ExcelOperations.getPagesData("AutoCoverageInformation", strRegressionID,transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strUnderlyingQuotePolicyNum_TXT = (String) row.get("UnderlyingQuotePolicyNum_TXT");
				String strRepossessedAuto_CHK = (String) row.get("RepossessedAuto_CHK");
				String strEachAccidentLimit_TXT = (String) row.get("EachAccidentLimit_TXT");
				String strDone_BTN = (String) row.get("Done_BTN");
				try {
					se.log().logTestStep("Entering details on Auto dealers Policy Coverage Page");
					test.log(LogStatus.INFO, "Entering details on Auto dealers Policy Coverage Page screen", "Transaction Step : " + transaction + "<br>" + "Page : Auto dealers Coverage Info Page");
					se.verify().verifyEquals("Auto dealers Policy Info Page displayed", getPagecontainingtext("Auto Dealers Policy Information").isDisplayed(),true, true, test);
					se.element().enterOrValidateText(getCU_AutoCovInfo_UndelyingQuoteNo_TXT(strUnderlyingQuotePolicyNum_TXT),strUnderlyingQuotePolicyNum_TXT, test);
					se.element().checkUncheckOrValidate(getCU_AutoCovInfo_RepossessedAutp_CHK(strRepossessedAuto_CHK),strRepossessedAuto_CHK, test);
					se.element().enterOrValidateText(getCU_AutoCovInfoEachAcciLimit_TXT(strEachAccidentLimit_TXT),strEachAccidentLimit_TXT, test);
					se.element().Click(getNext(),test);
					if(strDone_BTN.equalsIgnoreCase(constants.Yes)){
						se.element().Click(getDone(),test);	
					}
				} catch (Exception e) {
					se.verify().verifyEquals("Failed to fill in details for CU_Auto Dealers Coverage Information Page", true, false, true, test);
				}
				iteration++;
			}
		} catch (Exception e) {
			se.log().logTestStep("Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			test.log(LogStatus.FAIL, "Failed","Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			testTearDown(se, test);
		}
	}
}
	