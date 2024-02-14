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

public class CU_Reinsurance extends OR_CU {

	public void Reinsurance_Main(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		try {
			
			if (suspendSheet.equalsIgnoreCase("Reinsurance")) {
				test.log(LogStatus.INFO, "Page Suspended :- ",
						"Transaction Step : " + transaction + "<br>" + "Page : " + suspendSheet);
				testTearDown(se, test);
			}
			List<Map<String, String>> table = ExcelOperations.getPagesData("Reinsurance", strRegressionID, transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strReinsurance_TXT_TotalFromFacRePlacementPremAdj = (String) row
						.get("Reinsurance_TXT_TotalFromFacRePlacementPremAdj");
				String strReinsurance_CHK_OverrideToFAC_RowNum = (String) row
						.get("Reinsurance_CHK_OverrideToFAC_RowNum");
				String strReinsurance_CHK_OverrideToFAC = (String) row.get("Reinsurance_CHK_OverrideToFAC");
				String strReinsurance_TXT_FacRePlacementPremAdj_RowNum = (String) row
						.get("Reinsurance_TXT_FacRePlacementPremAdj_RowNum");
				String strReinsurance_TXT_FacRePlacementPremAdj = (String) row
						.get("Reinsurance_TXT_FacRePlacementPremAdj");
				String strReinsurance_BTN_Next = (String) row
						.get("Reinsurance_BTN_Next");

				try {
					se.log().logTestStep("Entering details on Reinsurance Page");
					test.log(LogStatus.INFO, "Entering details on Reinsurance screen",
							"Transaction Step : " + transaction + "<br>" + "Page : Reinsurance Page");
					se.verify().verifyEquals("Reinsurance Page displayed",
							getPagecontainingtext("Reinsurance").isDisplayed(), true, true, test);
					se.element().enterOrValidateText(getCU_Reinsu_TotalFacPrem_TXT(strReinsurance_TXT_TotalFromFacRePlacementPremAdj),
							strReinsurance_TXT_TotalFromFacRePlacementPremAdj, test);
					if (!strReinsurance_CHK_OverrideToFAC_RowNum.equalsIgnoreCase(constants.NA)) {
						se.element().checkUncheckOrValidate(
								getCU_Reinsu_OverrideToFAC_CHK(strReinsurance_CHK_OverrideToFAC_RowNum),
								strReinsurance_CHK_OverrideToFAC, test);
					}
					if (!strReinsurance_TXT_FacRePlacementPremAdj_RowNum.equalsIgnoreCase(constants.NA)) {
						se.element().enterOrValidateText(
								getCU_Reinsu_PremAdjustment_TXT(strReinsurance_TXT_FacRePlacementPremAdj_RowNum),
								strReinsurance_TXT_FacRePlacementPremAdj, test);
					}
					if(!strReinsurance_BTN_Next.equalsIgnoreCase(constants.NA)){
						
						se.element().Click(getNext(), test);
					}
					
				} catch (Exception e) {
					se.verify().verifyEquals(
							"Failed to fill in details for CU_Reinsurance Page ",
							true, false, true, test);
				}
				iteration++;
			}
		} catch (Exception e) {
			se.log().logTestStep(
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			test.log(LogStatus.FAIL, "Failed",
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			testTearDown(se, test);
		}
	}
}
