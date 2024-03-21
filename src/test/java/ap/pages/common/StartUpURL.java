package ap.pages.common;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Page;
import Libraries.automation.common.SystemPropertyUtil;
import Libraries.automation.common.Utils.TestPageFactory;
import ap.OR.BL_OR_CP;

public class StartUpURL extends Page{
	AP_Login login;
	public void APStartUp(String strRegressionID, String transaction, ExtentTest test)
	{
		BL_OR_CP ORCP = TestPageFactory.initElements(se, BL_OR_CP.class);
		try {
			List<Map<String, String>> table = ExcelOperations.getBLPagesData("Startup", strRegressionID,transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				try {
					LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
					String strAgentLink = (String) row.get("AgentLink");
					String strAgentLink_URL = (String) row.get("AgentLink_URL");
					if(strAgentLink.equalsIgnoreCase("Yes")){
						se.log().logTestStep("Access AP Application");	
						test.log(LogStatus.INFO, "Started Execution", "Connecting to AP URL");
						se.browser().get(SystemPropertyUtil.getBaseStoreUrl(),test);
					}
					else
					{
						se.log().logTestStep("Access Agency Port Application");	
						test.log(LogStatus.INFO, "Access Agency Port Application", "<br> URL : "+strAgentLink_URL);
						se.browser().get(strAgentLink_URL,test);
						se.util().sleep(1000);
					}
				}
				catch (Exception e) {
					se.verify().verifyEquals("Application login is unsuccessful ", true, false, true, test);
				}
				iteration++;
			}
		} catch (Exception e) {
			se.log().logTestStep(
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			test.log(LogStatus.FAIL, "Failed",
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			ORCP.testTearDown(se, test);
		}
	}
}
