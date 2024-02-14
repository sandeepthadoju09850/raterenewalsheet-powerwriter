package pw.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import pw.Constants.constants;
import pw.OR.OR_CP;
import pw.pages.COMMON.PW_CommonMethods;

public class CP_MNFireSafetySurcharge extends OR_CP {
	
	public void MNFireSafetySurcharge(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		
		try{
			
			String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
			if (SuspendSheet.equalsIgnoreCase(constants.MNFireSafetySurcharge)) {
				test.log(LogStatus.INFO, "Page Suspended :- ", "Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
				testTearDown(se, test);
			}
			List<Map<String, String>> table = ExcelOperations.getPagesData(constants.MNFireSafetySurcharge, strRegressionID, transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strNone_RDO = (String) row.get("None_RDO");
				String strIG261_FireSafetySurcharge_RDO = (String) row.get("IG261_FireSafetySurcharge_RDO");
				String strIG262_FireSafetySurchargeForMutualCompanies = (String) row.get("IG262_FireSafetySurchargeForMutualCompanies");
				
				try {
					CommonMethods.NavigateTo(constants.pageNm_MNFireSafetySurcharge, test);
					se.log().logTestStep(constants.MNFireSafetySurcharge);
					test.log(LogStatus.INFO, constants.MNFireSafetySurcharge, "Transaction Step : " + transaction + "<br>" + "Page : MNFireSafetySurcharge");
					se.verify().verifyEquals("MN Fire Safety Surcharge Page is displayed",getMNFireSafetySurcharge_LBL_MNFireSafetySurcharge("MN Fire Safety Surcharge").isDisplayed(), true, true, test);				
					se.element().checkUncheckOrValidate(getMNFireSafetySurcharge_RDO_None(strNone_RDO),strNone_RDO, test);
					se.element().checkUncheckOrValidate(getMNFireSafetySurcharge_RDO_IG261(strIG261_FireSafetySurcharge_RDO),strIG261_FireSafetySurcharge_RDO, test);
					se.element().checkUncheckOrValidate(getMNFireSafetySurcharge_RDO_IG262(strIG262_FireSafetySurchargeForMutualCompanies),strIG262_FireSafetySurchargeForMutualCompanies, test);
					se.element().Click(getNext(), test);
				} catch (Exception e) {
					se.verify().verifyEquals("Failed to fill in details for MNFireSafetySurcharge", true, false, true, test);
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
