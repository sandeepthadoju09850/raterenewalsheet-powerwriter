package pw.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CP;

public class CP_Terrorism extends OR_CP {
	public void CP_TerrorismPage(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		/*String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
		if (SuspendSheet.equalsIgnoreCase(constants.Commercial_Package)) {
			test.log(LogStatus.INFO, "Page Suspended :- ",
					"Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CP_Terrorism, strRegressionID,
				transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);

			// String transaction = (String) row.get("Transaction Name");
			String strCP_Terrorism_TXT_Location = (String) row.get("CP_Terrorism_TXT_Location");
			String strCP_Terrorism_TXT_Building = (String) row.get("CP_Terrorism_TXT_Building");
			String strCP_Terrorism_TXT_CoverageType = (String) row.get("CP_Terrorism_TXT_CoverageType");
			String strCP_Terrorism_TXT_LossCost = (String) row.get("CP_Terrorism_TXT_LossCost");
			String strCP_Terrorism_TXT_LossCostMultiplier = (String) row.get("CP_Terrorism_TXT_LossCostMultiplier");
			String strCP_Terrorism_TXT_FinalRate = (String) row.get("CP_Terrorism_TXT_FinalRate");
			String strCP_Terrorism_TXT_LimitOfInsurance = (String) row.get("CP_Terrorism_TXT_LimitOfInsurance");
			if (!strCP_Terrorism_TXT_Location.equalsIgnoreCase("N/A")) {
				try {
					se.verify().verifyEquals("Terrorism Page of PowerWriter ",
							getCP_Terrorism_LBL_Terrorism().isDisplayed(), true, true, test);
					se.log().logTestStep("CP_TerrorismPage");
					test.log(LogStatus.INFO, "CP_Terrorism Page",
							"Transaction Step : " + transaction + "<br>" + "Page : CP_TerrorismPage" + "<br>"
									+ "Building Details : " + strCP_Terrorism_TXT_Location);
					se.util().sleep(1000);

					se.element().enterOrValidateText(getCP_Terrorism_TXT_Location(strCP_Terrorism_TXT_Location),
							strCP_Terrorism_TXT_Location, test);
					se.element().enterOrValidateText(getCP_Terrorism_TXT_Building(strCP_Terrorism_TXT_Building),
							strCP_Terrorism_TXT_Building, test);
					se.element().enterOrValidateText(getCP_Terrorism_TXT_CoverageType(strCP_Terrorism_TXT_CoverageType),
							strCP_Terrorism_TXT_CoverageType, test);
					se.element().enterOrValidateText(getCP_Terrorism_TXT_LossCost(strCP_Terrorism_TXT_LossCost),
							strCP_Terrorism_TXT_LossCost, test);
					se.element().enterOrValidateText(
							getCP_Terrorism_TXT_LossCostMultiplier(strCP_Terrorism_TXT_LossCostMultiplier),
							strCP_Terrorism_TXT_LossCostMultiplier, test);
					se.element().enterOrValidateText(getCP_Terrorism_TXT_FinalRate(strCP_Terrorism_TXT_FinalRate),
							strCP_Terrorism_TXT_FinalRate, test);
					se.element().enterOrValidateText(
							getCP_Terrorism_TXT_LimitOfInsurance(strCP_Terrorism_TXT_LimitOfInsurance),
							strCP_Terrorism_TXT_LimitOfInsurance, test);*/
					se.element().Click(getNext(), test);
				/*} catch (Exception e) {
					se.verify().verifyEquals("Failed to fill in details for CP_ExtraExpenseCoveragePage", true, false,
							true, test);

				}*/
			

		}
		//iteration++;
	}

