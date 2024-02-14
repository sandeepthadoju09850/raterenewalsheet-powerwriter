/*package com.secura.pw.mainscripts;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.secura.pw.pages.common.PW_CommonFun;
import com.secura.pw.pages.common.PW_Login;
import com.test.automation.common.BaseTest;
import com.test.automation.common.SeHelper;
import com.test.automation.common.CommonBaseTest.TestDataXLS;
import com.test.automation.common.Utils.TestPageFactory;
import com.test.automation.common.framework.Browser.Browsers;

@SuppressWarnings("unused")
public class CommercialPackageTest extends BaseTest {
	
	@BeforeMethod(alwaysRun = true, groups = { "test" }, timeOut = 1800000000)
	protected void beforeMethod(Method method, Object[] params) {
		super.beforeMethod(method, params);
	}

	@AfterMethod(alwaysRun = true, groups = { "test" }, timeOut = 1800000000)
	protected void afterMethod(Method method, ITestResult result, Object[] params) {
		super.afterMethod(method, result, params);
	}

	@Test(description = "CommercialPackage LOB Testing", dataProvider = "browserXls", groups = { "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/test_data/CPTestdata.xlsx", sheetVersion = "new", sheetName = "CP_TestData_WI")
	public void CPDemoTest(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		
		PW_Login LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
	
		int iteration = 0;
		
		for (String name : params.keySet()) {
			List<Map<String, String>> table = new ArrayList<Map<String, String>>();
			table = (List<Map<String, String>>) params.get(name);
			while (iteration < table.size()) {
				try {
					Map<String, String> row = table.get(iteration);
					String strTestScenario = (String) row.get("Label_Name");
					String strExecuteScript = (String) row.get("ExecuteScenario");
					
					
					if (strExecuteScript.equalsIgnoreCase("Yes") && strTestScenario.equalsIgnoreCase("Scenario_One"))
					{
						se.log().logTestStep("Connecting to PW URL");
						CommonFunPage.PWAppStartUp();
						se.log().logTestStep("Loggin in to PWApp");
						LoginPage.PWAppLogin(row);
						
						
						
						
						
					}
					iteration++;
				} catch (Exception e) {
					se.verify().verifyEquals("CommercialPackageTest is failed", true, false);
					e.printStackTrace();
					iteration++;
				}
			}
		}
		testTearDown(se);
	}
}
*/