package pw.pages.COMMON;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.OR.OR_Common;

public class PW_KYTaxExemption extends OR_Common {

	public void KYTaxExemption(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
		if (SuspendSheet.equalsIgnoreCase("KYTaxExemption")) {
			test.log(LogStatus.INFO, "Page Suspended :- ",
					"Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData("KYTaxExemption", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strKYTaxExemption_DDN_IsTheOrgAnEducationalOrCharitable = (String) row
					.get("KYTaxExemption_DDN_IsTheOrgAnEducationalOrCharitable");
			String strKYTaxExemption_LBL_TaxCode = (String) row.get("KYTaxExemption_LBL_TaxCode");
			String strKYTaxExemption_CHK_Applicable = (String) row.get("KYTaxExemption_CHK_Applicable");
			try {

				se.log().logTestStep("KYTaxExemption");
				test.log(LogStatus.INFO, "KYTaxExemption",
						"Transaction Step : " + transaction + "<br>" + "Page : KYTaxExemption");
				/*driver.switchTo().defaultContent();
				driver.switchTo().frame(getDashboard_Iframe_TitlesReportFrame());*/
				/*se.verify().verifyEquals("KYTaxExemption Page of PowerWriter ",
						getKYTaxExemption_LBL_KYTaxExemption("KY Tax Exemption").isDisplayed(), true, true, test);*/
				se.element().selectElementDDrOrValidateText(
						getKYTaxExemption_DDN_IsTheOrgAnEducationalOrCharitable(
								strKYTaxExemption_DDN_IsTheOrgAnEducationalOrCharitable),
						strKYTaxExemption_DDN_IsTheOrgAnEducationalOrCharitable, test);
				se.verify().verifyEquals("Tax Code", strKYTaxExemption_LBL_TaxCode,
						strKYTaxExemption_LBL_TaxCode.trim(), true, test);
				se.element().checkUncheckOrValidate(getKYTaxExemption_CHK_Applicable(strKYTaxExemption_CHK_Applicable),
						strKYTaxExemption_CHK_Applicable, test);
				se.element().Click(getNext(), test);
			
			} catch (Exception e) {
				se.verify().verifyEquals("Failed to fill in details for KYTaxExemption", true, false, true, test);
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
