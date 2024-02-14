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

public class PW_AuditDetails extends OR_Common {

	public void AuditDetailsPage(String strRegressionID, String transaction, ExtentTest test) throws IOException {

		try {
			String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
			if (SuspendSheet.equalsIgnoreCase(constants.AuditDetails)) {
				test.log(LogStatus.INFO, "Page Suspended :- ",
						"Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
				testTearDown(se, test);
			}
			List<Map<String, String>> table = ExcelOperations.getPagesData(constants.AuditDetails, strRegressionID,
					transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);

				String strFinalAudit_ClassCode = (String) row.get("FinalAudit_ClassCode");
				String strFinalAudit_IfStatusApplies_Y = (String) row.get("FinalAudit_IfStatusApplies_Y");
				String strFinalAudit_IfStatusApplies_N = (String) row.get("FinalAudit_IfStatusApplies_N");
				String strFinalAudit_EstimatedExposure = (String) row.get("FinalAudit_EstimatedExposure");
				String strFinalAudit_AuditedExposure = (String) row.get("FinalAudit_AuditedExposure");
				String strFinalAudit_AuditRow = (String) row.get("FinalAudit_AuditRow");
				try {
					se.verify().verifyEquals("AuditDetails Page of PowerWriter ",
							getAuditDetails_LBL_AuditDetails().isDisplayed(), true, true, test);
					se.element().checkUncheckOrValidate(getAuditDetails_BTN_StatusAppliesYes(strFinalAudit_ClassCode),
							strFinalAudit_IfStatusApplies_Y, test);
					se.element().checkUncheckOrValidate(getAuditDetails_BTN_StatusAppliesNo(strFinalAudit_ClassCode),
							strFinalAudit_IfStatusApplies_N, test);

					if (!strFinalAudit_AuditedExposure.equalsIgnoreCase(constants.NA)
							|| !strFinalAudit_AuditedExposure.equalsIgnoreCase(constants.Validate)) {
						se.element().clearTheField(getAuditDetails_TXT_AuditedExposure(strFinalAudit_ClassCode,
								strFinalAudit_AuditedExposure, strFinalAudit_AuditRow));
						se.element().enterOrValidateText(
								getAuditDetails_TXT_AuditedExposure(strFinalAudit_ClassCode,
										strFinalAudit_AuditedExposure, strFinalAudit_AuditRow),
								strFinalAudit_AuditedExposure, test);
					}
				} catch (Exception e) {
					se.verify().verifyEquals("Failed to fill in Audit details", true, false, true, test);
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
