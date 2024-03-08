package ap.RunnerScripts;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.ITestResult;
import org.testng.TestNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Libraries.ap.automation.common.BaseTest;
import Libraries.ap.automation.common.SeHelper;
import Libraries.ap.automation.common.Transformer;
import Libraries.ap.automation.common.framework.Browser.Browsers;
import Libraries.ap.automation.common.framework.ExtentManager;
import Libraries.ap.automation.common.framework.ExtentTestManager;
import Libraries.ap.automation.common.framework.Util;
import ap.regression.SE.SE01_IA_SERegression;
import ap.regression.SE.SE02_KS_SERegression;
import ap.regression.SE.SE03_MO_SERegression;
import ap.regression.SE.SE04_PA_SEHRegression;
import ap.regression.SE.SE05_PA_SELRegression;

public class SERunner extends BaseTest {

	XSSFWorkbook workbook = null;
	String premiumsFilePath;
	File premiumsFile;
	
	String RegressionName = "";
	ExtentReports extent;

	@BeforeSuite()
	public void beforeSuite() {
		extent = ExtentManager.getInstance();
		premiumsFilePath = ExtentManager.getPremiumsFile()+ "\\PremiumSummaryReport_SE.xlsx";
		workbook = new XSSFWorkbook();
		premiumsFile = new File(premiumsFilePath);
		new TestNG().setAnnotationTransformer(new Transformer());
	}

	@BeforeMethod(alwaysRun = true, groups = { "test" }, timeOut = 1800000000)
	protected void beforeMethod(Method method, Object[] params) {
		super.beforeMethod(method, params);
		
	}

	@AfterMethod(alwaysRun = true, groups = { "test" }, timeOut = 1800000000)
	protected void afterMethod(Method method, ITestResult result, Object[] params) {
		super.afterMethod(method, result, params);
		extent.flush();
	}



	
	@Test(description = "SE_01 IA SE regression testing", dataProvider = "browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void SE_01(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId); 
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	SE01_IA_SERegression.SE01_IA_SERegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
	 test.setEndedTime(Util.getTime());
}
	
	
	@Test(description = "SE_02 SE02_KS14SERegression testing", dataProvider = "browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void SE_02(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	SE02_KS_SERegression.SE02_KS_SERegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
	 test.setEndedTime(Util.getTime());
}
	
	@Test(description = "SE_03 SE03_MO18SERegression testing", dataProvider = "browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void SE_03(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	SE03_MO_SERegression.SE03_MO_SERegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
	 test.setEndedTime(Util.getTime());
}

	
	@Test(description = "SE_04 PA_SEHRegression testing", dataProvider = "browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void SE_04(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	SE04_PA_SEHRegression.SE04_PA_SEHRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
	 test.setEndedTime(Util.getTime());
}
	
	@Test(description = "SE_05 PA_SELRegression testing", dataProvider = "browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void SE_05(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	SE05_PA_SELRegression.SE05_PA_SELRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
	 test.setEndedTime(Util.getTime());
}
	
	
}
