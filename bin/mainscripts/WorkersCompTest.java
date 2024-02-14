/*package com.secura.pw.mainscripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.secura.pw.pages.common.PW_CommonFun;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.secura.pw.pages.WC.WC;
import com.secura.pw.pages.WC.WC_GenInfo;
import com.secura.pw.pages.WC.WC_Locations;
import com.secura.pw.pages.WC.WC_OptionalEndorsements;
import com.secura.pw.pages.WC.WC_OtherStatesInfo;
import com.secura.pw.pages.common.PW_Login;
import com.secura.pw.pages.WC.WC_ProducersandAddNmInsured;
import com.secura.pw.pages.WC.WC_StateInformation;
import com.secura.pw.pages.common.PW_Home;
import com.test.automation.common.BaseTest;
import com.test.automation.common.SeHelper;
import com.test.automation.common.Utils.TestPageFactory;
import com.test.automation.common.framework.Browser.Browsers;
import com.test.automation.common.framework.Util;

public class WorkersCompTest extends BaseTest {
	
	ExtentReports extent;
	ExtentTest test;
	
	
	@BeforeSuite(alwaysRun = true, groups = { "test" }, timeOut = 1800000000)
	public void beforeSuite() throws IOException{
		String homepath = new File(".").getCanonicalPath();
		extent = new ExtentReports(homepath+"\\"+"Run_"+Util.getCurrentDate()+"_"+Util.getCurrentTime()+"\\Automation\\Reports\\ReportSummary.html");
	}
	@BeforeMethod(alwaysRun = true, groups = { "test" }, timeOut = 1800000000)
	protected void beforeMethod(Method method, Object[] params) {
		super.beforeMethod(method, params);
		test = extent.startTest((this.getClass().getSimpleName() + " :: " +method.getName()),method.getName());
	}

	@AfterMethod(alwaysRun = true, groups = { "test" }, timeOut = 1800000000)
	protected void afterMethod(Method method, ITestResult result, Object[] params) {
		super.afterMethod(method, result, params);
	}
	
	@Test(description = "WorkersCOmp LOB Testing", dataProvider = "browserXls", groups = { "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/test_data/WCTestdata.xlsx", sheetVersion = "new", sheetName = "WC_TestData_WI")
	public void PWRateComparision_One(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		PW_Login LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		WC_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, WC_GenInfo.class);
		WC_ProducersandAddNmInsured ProducerandAddNmInsuredPage = TestPageFactory.initElements(se, WC_ProducersandAddNmInsured.class);
		WC_Locations LocationsPage = TestPageFactory.initElements(se, WC_Locations.class);
		WC WorkersCompPage = TestPageFactory.initElements(se, WC.class);
		WC_StateInformation StateInfoPage = TestPageFactory.initElements(se, WC_StateInformation.class);
		WC_OptionalEndorsements OptionalEndorsementPage = TestPageFactory.initElements(se, WC_OptionalEndorsements.class);
		WC_OtherStatesInfo OtherStateInfoPage = TestPageFactory.initElements(se, WC_OtherStatesInfo.class);
		int iteration = 0;

		for (String name : params.keySet()) {
			List<Map<String, String>> table = new ArrayList<Map<String, String>>();
			table = (List<Map<String, String>>) params.get(name);
			while (iteration < table.size()) {
				try {
					Map<String, String> row = table.get(iteration);
					String strTestScenario = (String) row.get("Label_Name");
					String strExecuteScript = (String) row.get("ExecuteScenario");
					String strCALocNoOfLoc = (String) row.get("No_of_Locations"); 
					
					if (strExecuteScript.equalsIgnoreCase("Yes") && strTestScenario.equalsIgnoreCase("Scenario_One")) {
						se.log().logTestStep("Connecting to PW URL");
						CommonFunPage.PWAppStartUp();
						se.log().logTestStep("Loggin in to PWApp");
						LoginPage.PWAppLogin(row);
						String screenshot = Util.captureScreenshot("Login", se);
						String image = test.addScreenCapture(screenshot);
						test.log(LogStatus.PASS, "Login Successful", image);
						se.log().logTestStep("Select a product for New quote");
						WelcomePage.homePage(row);
						se.log().logTestStep("Starting new quote");
						QuoteGenInfoPage.quote_genInfo(row);
						se.log().logTestStep("Entering Producers info");
						ProducerandAddNmInsuredPage.AddProducers(row);
						se.log().logTestStep("Entering Additional Nameed Insured info");
						ProducerandAddNmInsuredPage.AddAdditionalNmInsured(row);
						LocationsPage.WC_AddLocations(table,iteration,strCALocNoOfLoc);
						WorkersCompPage.WorkersCompInfo(row);
						WorkersCompPage.LocationLinking();
						StateInfoPage.stateInfo(row);
						//StateInfoPage.WI_RatingPeriod(row);
						StateInfoPage.WI_Classification(row);
						StateInfoPage.WI_WaiverOfSurogation(row);
						StateInfoPage.WI_RatingOptions(row);
						OptionalEndorsementPage.optionalEndorsement(row);
						OptionalEndorsementPage.WC000308(row);
						OptionalEndorsementPage.WC000310(row);
						OtherStateInfoPage.otherStateInfo(row);
						se.util().sleep(2000);
					}
					iteration++;
				} catch (Exception e) {
					se.verify().verifyEquals("WorkersCompTest is failed", true, false);
					e.printStackTrace();
					iteration++;
				}
			}
		}
		testTearDown(se);
		extent.flush();
	}
}
*/