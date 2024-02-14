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

public class CU_ManualFactors extends OR_CU {
	
	public void ManualFactors_Main(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		try {
			
			if (suspendSheet.equalsIgnoreCase("ManualFactors")) {
				test.log(LogStatus.INFO, "Page Suspended :- ", "Transaction Step : " + transaction + "<br>" + "Page : " + suspendSheet);
				testTearDown(se, test);
			}
			List<Map<String, String>> table = ExcelOperations.getPagesData("ManualFactors", strRegressionID,transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strTransitionFactor_TXT = (String) row.get("TransitionFactor_TXT");
				String strMiscellanoeusFactor_TXT = (String) row.get("MiscellanoeusFactor_TXT");
				String strMiscellanoeusfactorReason_TXT = (String) row.get("MiscellanoeusfactorReason_TXT");
				String strMiscellanoeusfactorReasonFilterNeeded_TXT = (String) row.get("MiscellanoeusfactorReason_TXT_FilterNeeded");
						
				try {
					se.log().logTestStep("Entering details on ManualFactors Page");
					test.log(LogStatus.INFO, "Entering details on ManualFactors Page screen", "Transaction Step : " + transaction + "<br>" + "Page : ManualFactors");
					se.verify().verifyEquals("ManualFactors Page displayed", getPagecontainingtext("Manual Factors").isDisplayed(),true, true, test);
					se.element().enterOrValidateText(getCU_ManualFtr_TransitionFtr_TXT(strTransitionFactor_TXT),strTransitionFactor_TXT, test);
					se.element().enterOrValidateText(getCU_ManualFtr_MiscFtr_TXT(strMiscellanoeusFactor_TXT),strMiscellanoeusFactor_TXT, test);
					se.element().selectPopupWithMagnifier(
							getCU_ManualFtr_MiscFtrReason_TXT(strMiscellanoeusfactorReason_TXT),
							getCU_ManualFtr_MiscFtrReason_Search_BTN(strMiscellanoeusfactorReason_TXT),
							strMiscellanoeusfactorReason_TXT, strMiscellanoeusfactorReasonFilterNeeded_TXT, strMiscellanoeusfactorReason_TXT,
							constants.NA, constants.NA, constants.NA, test);
					se.element().Click(getNext(),test);
				} catch (Exception e) {
					se.verify().verifyEquals("Failed to fill in details for ManualFactors screen Main Page ", true, false, true, test);
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
