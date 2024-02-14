package com.secura.pw.mainscripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;import com.relevantcodes.extentreports.LogStatus;
import com.secura.pw.pages.CA.CA;
import com.secura.pw.pages.CA.CA_AdditionalCoverages;
import com.secura.pw.pages.CA.CA_Drivers;
import com.secura.pw.pages.CA.CA_Locations;
import com.secura.pw.pages.CA.CA_PDCoverages;
import com.secura.pw.pages.CA.CA_Vehicles;
import com.secura.pw.pages.common.PW_CommonFun;
import com.secura.pw.pages.CA.CA_GenInfo;
import com.secura.pw.pages.common.PW_Login;
import com.secura.pw.pages.CA.CA_ProducersandAddNmInsured;
import com.secura.pw.pages.common.PW_Home;
import com.test.automation.common.BaseTest;
import com.test.automation.common.SeHelper;
import com.test.automation.common.SystemPropertyUtil;
import com.test.automation.common.Utils.TestPageFactory;
import com.test.automation.common.framework.Util;
import com.test.automation.common.framework.Browser.Browsers;

public class CommercialAutoTest extends BaseTest {
	
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest()
	public void BeforeTest() throws IOException {
		String homepath = new File(".").getCanonicalPath();
			
		extent = new ExtentReports (System.getProperty("user.dir")+"/Reports/CA/Automation/Smoke/"+Util.getCurrentTime()+"_ReportSummary.html", true);

		extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));

	}
	
	@BeforeMethod(alwaysRun = true, groups = { "test" }, timeOut = 1800000000)
	protected void beforeMethod(Method method, Object[] params) {
		super.beforeMethod(method, params);
		test = extent.startTest((this.getClass().getSimpleName() + " :: " + method.getName()), method.getName());
	}

	@AfterMethod(alwaysRun = true, groups = { "test" }, timeOut = 1800000000)
	protected void afterMethod(Method method, ITestResult result, Object[] params) {
		super.afterMethod(method, result, params);
		extent.endTest(test);
	}
	
	@AfterTest(alwaysRun = true, groups = { "test" }, timeOut = 1800000000)
	public void AfterTest() throws IOException {
		extent.flush();
		extent.close();
	}
	

	@Test(description = "CommercialAuto LOB Testing", dataProvider = "browserXls", groups = { "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/test_data/CATestdata.xlsx", sheetVersion = "new", sheetName = "CA_TestData_WI")
	public void PWFWDemo(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		PW_Login LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		CA_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, CA_GenInfo.class);
		CA_ProducersandAddNmInsured ProducerandAddNmInsuredPage = TestPageFactory.initElements(se, CA_ProducersandAddNmInsured.class);
		CA CommercialAutoPage = TestPageFactory.initElements(se, CA.class);
		CA_Locations CALocationsPage = TestPageFactory.initElements(se, CA_Locations.class);
		CA_Drivers CADriversPage = TestPageFactory.initElements(se, CA_Drivers.class);
		/*CA_Vehicles CAVehiclesPage = TestPageFactory.initElements(se, CA_Vehicles.class);
		
		CA_AdditionalCoverages CAAdditionalCoveragesPage = TestPageFactory.initElements(se, CA_AdditionalCoverages.class);
		CA_PDCoverages CAPDCoverages = TestPageFactory.initElements(se, CA_PDCoverages.class);
*/		
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
					String strCADrNoOfDrivers = (String) row.get("No_of_Drivers");
					String strCAVehNoOfVehicles = (String) row.get("No_of_Vehicles");
					
					if (strExecuteScript.equalsIgnoreCase("Yes") && strTestScenario.equalsIgnoreCase("Scenario_One"))
					{
						se.log().logTestStep("Connecting to PW URL");
						CommonFunPage.PWAppStartUp();
					
						se.log().logTestStep("Loggin in to PWApp");
						LoginPage.PWAppLogin(row,test);
						test.log(LogStatus.PASS, "Login Successful");
						
						
						se.log().logTestStep("Select a product for New quote");
						WelcomePage.homePage(row,test);
						test.log(LogStatus.PASS, "Product selection is Successful");
										
						
						se.log().logTestStep("Create a new quote");
						QuoteGenInfoPage.quote_genInfo(row,test);
						ProducerandAddNmInsuredPage.AddProducers(row,test);
						
						test.log(LogStatus.PASS, "Creating a new quote and AddingProducers are successful");
						
						se.log().logTestStep("ProducerandAddNmInsured");
						ProducerandAddNmInsuredPage.AddAdditionalNmInsured(row,test);
						test.log(LogStatus.PASS, "ProducerandAddNmInsured is successful");
						
						
						se.log().logTestStep("CommercialAutoInfo,StateCoverageLimits and CoveredAutoSymbols");
						CommercialAutoPage.CA_CommercialAutoInfo(row,test);
						CommercialAutoPage.CA_StateCoverageLimits(row,test);
						CommercialAutoPage.CA_CoveredAutoSymbols();
						test.log(LogStatus.PASS, "CommercialAutoInfo,StateCoverageLimits and CoveredAutoSymbols details are added successful");
						
						se.log().logTestStep("Adding locations");
						CALocationsPage.CA_AddLocations(table,iteration,strCALocNoOfLoc,test);
						test.log(LogStatus.PASS, "Adding locations one and two successful");
						
						se.log().logTestStep("Adding 9 Drivers");
						CADriversPage.CA_AddDrivers(table,iteration,strCADrNoOfDrivers);
						test.log(LogStatus.PASS, "Adding 9 Drivers are successful");
						
						/*CAVehiclesPage.CA_AddVehicles(table,iteration,strCAVehNoOfVehicles);
						CAAdditionalCoveragesPage.AddAdditionalCoverages(row);
						CAPDCoverages.PDCoverages(row);
						CAPDCoverages.additionalInterest(row);
						CAPDCoverages.experienceRating(row);
						CAPDCoverages.calculatePremium();
						se.util().sleep(2000);*/
					}
					iteration++;
				} catch (Exception e) {
					se.verify().verifyEquals("CommercialAutoTest is failed", true, false);
					e.printStackTrace();
					iteration++;
				}
			}
		}
		testTearDown(se);
	}
}
