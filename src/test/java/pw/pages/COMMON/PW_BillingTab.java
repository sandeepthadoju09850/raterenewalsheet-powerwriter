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

public class PW_BillingTab extends OR_Common {
	
	//PW_CommonMethods CommonMethods = new PW_CommonMethods();
	
	public void getUpdateBillingTab(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try {
			String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
			if (SuspendSheet.equalsIgnoreCase(constants.Dashboard_Billing)) {
				test.log(LogStatus.INFO, "Page Suspended :- ",
						"Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
				testTearDown(se, test);
			}
			List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Dashboard_Billing, strRegressionID,
					transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);

				String strDashboard_DDN_BillPlanOption = (String) row.get("DashboardBilling_DDN_BillPlanOption");
				String strDashboard_BTN_Edit = (String) row.get("DashboardBilling_BTN_Edit");
				String strDashboardBilling_DDN_BillTypeOption = (String) row.get("DashboardBilling_DDN_BillTypeOption");
				String strDashboardBilling_DDN_EFTOption = (String) row.get("DashboardBilling_DDN_EFTOption");
				String strDashboardBilling_TXT_AccountNumber = (String) row.get("DashboardBilling_TXT_AccountNumber");
				String strDashboardBilling_DDN_PayorOption = (String) row.get("DashboardBilling_DDN_PayorOption");
				try {

					se.log().logTestStep("UpdateBillingTab");

					test.log(LogStatus.INFO, "UpdateBillingTab",
							"Transaction Step : " + transaction + "<br>" + "Page : UpdateBillingTab");

					SwitchToDefaultAndThenSwitchToFrame();

					se.element().waitForElementIsDisplayed(Dashboard_TAB_BillingSelected, 100);
					SwitchToDefaultAndThenSwitchToFrame();
					se.verify().verifyEquals("DashboardBilling Page of PowerWriter ",
							getDashboard_TAB_Billing().isDisplayed(), true, true, test);

					//SwitchToDefaultAndThenSwitchToFrame();
					se.element().Click(getDashboardBilling_BTN_Edit(strDashboard_BTN_Edit), test);

					if (!strDashboard_DDN_BillPlanOption.equalsIgnoreCase(constants.NA)
							&& !strDashboard_DDN_BillPlanOption.contains(constants.Validate)) {
						se.util().sleep(3000);
						se.element().Click(getDashboardBilling_DDN_BillPlanOption(strDashboard_DDN_BillPlanOption),
								test);
					}
					if (!strDashboardBilling_DDN_BillTypeOption.equalsIgnoreCase(constants.NA)
							&& !strDashboardBilling_DDN_BillTypeOption.contains(constants.Validate)) {
						se.element().Click(
								getDashboardBilling_DDN_BillTypeOption(strDashboardBilling_DDN_BillTypeOption), test);
					}
					if (!strDashboardBilling_DDN_EFTOption.equalsIgnoreCase(constants.NA)
							&& !strDashboardBilling_DDN_EFTOption.contains(constants.Validate)) {
						se.element().Click(getDashboardBilling_DDN_EFTOption(strDashboardBilling_DDN_EFTOption), test);
					}
					se.element().enterOrValidateText(
							getDashboardBilling_TXT_AccountNumber(strDashboardBilling_TXT_AccountNumber),
							strDashboardBilling_TXT_AccountNumber, test);
					if (!strDashboardBilling_DDN_PayorOption.equalsIgnoreCase(constants.NA)
							&& !strDashboardBilling_DDN_PayorOption.contains(constants.Validate)) {
						se.element().Click(getDashboardBilling_DDN_PayorOption(strDashboardBilling_DDN_PayorOption),
								test);
					}
					se.element().Click(getDasboardBilling_BTN_OK(), test);
					se.element().Click(getDasboardBilling_BTN_Complete(), test);
					se.util().sleep(5000);

				} catch (Exception e) {
					e.printStackTrace();
					se.verify().verifyEquals("Failed to fill in details for UpdateBillingTab ", true, false, true,
							test);
					se.log().logTestStep("Exception in UpdateBillingTab - " + e);
					test.log(LogStatus.FAIL, "Exception in UpdateBillingTab  - " + e);
				}
				iteration++;
			}
			
			

		} catch (Exception e) {
			// TODO: handle exception
			se.log().logTestStep("Issue in the page " + "UpdateBillingTab" + " For the transaction " + transaction);
			test.log(LogStatus.FAIL, "Failed",
					"Issue in the page " + "UpdateBillingTab" + " For the transaction " + transaction);
			testTearDown(se, test);
		}

	}
	public void SwitchToDefaultAndThenSwitchToFrame() throws IOException {
		try {

			driver.switchTo().defaultContent();
			driver.switchTo().frame(getDashboard_Iframe_TitlesReportFrame());
		} catch (Exception e) {

			se.log().logTestStep("Failed at SwitchToDefaultAndThenSwitchToFrame - " + e);

		}

	}

}
