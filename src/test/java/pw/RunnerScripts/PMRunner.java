package pw.RunnerScripts;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.ITestResult;
import org.testng.TestNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.BaseTest;
import Libraries.automation.common.SeHelper;
import Libraries.automation.common.Transformer;
import Libraries.automation.common.framework.ExtentManager;
import Libraries.automation.common.framework.ExtentTestManager;
import Libraries.automation.common.framework.Util;
import Libraries.automation.common.framework.Browser.Browsers;
import pw.Constants.constants;
import pw.regressions.PM.PM10_IN_CACPPMRegression;
import pw.regressions.PM.PM13_IA_CAWCPMRegression;
import pw.regressions.PM.PM20_WI_CABPWCPMRegression;
import pw.regressions.PM.PM23_WI_CATCWCPMRegression;
import pw.regressions.PM.PM2_MI_CAPMRegression;
import pw.regressions.PM.PM4_WI_CACPWCPMRegression;
import pw.regressions.PM.PM7_KY_CPPMRegression;
import pw.regressions.PM.PMSmoke1_MI_CA;
import pw.regressions.PM.PMSmoke2_IA_WC;
import pw.regressions.PM.PMSmoke3_WI_BP;
import pw.regressions.PM.PMSmoke4_WI_TC;
import pw.regressions.PM.PMSmoke5_KY_CP;
import pw.regressions.PM.PMSmoke6_MonolineGL_CPRegression;
import pw.regressions.PM.PMSmoke7_ILCUCPRegression;

public class PMRunner extends BaseTest {

	//private static final String PM20_WI_CACPWCRegression = null;
	XSSFWorkbook workbook = null;
	String premiumsFilePath;
	File premiumsFile;
	String RegressionName = "";
	ExtentReports extent;
	LinkedHashMap<String, Boolean> RegressionStatus = new LinkedHashMap<String, Boolean>();

	@BeforeSuite()
	public void beforeSuite() throws IOException {
		extent = ExtentManager.getInstance();
		premiumsFilePath = ExtentManager.getPremiumsFile()+ "\\PremiumSummaryReport.xlsx";
		workbook = new XSSFWorkbook();
		premiumsFile = new File(premiumsFilePath);
		Util.setQuoteAndAccountNumber(constants.PM);
		new TestNG().setAnnotationTransformer(new Transformer());
	}

	@BeforeMethod(alwaysRun = true, groups = { "test" }, timeOut = 1800000000)
	protected void beforeMethod(Method method, Object[] params) {
		super.beforeMethod(method, params);
		
	}
	@AfterMethod(alwaysRun = true, groups = { "test" }, timeOut = 1800000000)
	protected void afterMethod(Method method, ITestResult result, Object[] params) {
		super.afterMethod( method, result, params);
	RegressionStatus.put(method.getName(), result.isSuccess());
		extent.flush();
	}
	@AfterSuite(alwaysRun = true, groups = { "test" }, timeOut = 1800000000)
	protected void afterSuite() throws IOException {
		Util.stopExecutionIfPassed(RegressionStatus,constants.PM);
		
	}
	
	@Test(description = "PM2_MI_CAPMRegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void PM_2(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		PM2_MI_CAPMRegression.PM2_MI_CAPMRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	}
	
	@Test(description = "PM4_WI_CACPWCRegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void PM_4(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		PM4_WI_CACPWCPMRegression.PM4_WI_CACPWCPMRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);	
	}
	
	@Test(description = "PM7_KY_CPPMRegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void PM_7(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		PM7_KY_CPPMRegression.PM7_KY_CPPMRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	}
	
	@Test(description = "PM10_IN_CACPRegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void PM_10(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		PM10_IN_CACPPMRegression.PM10_IN_CACPPMRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	}
	
	@Test(description = "PM13_IA_CAWCRegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void PM_13(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		PM13_IA_CAWCPMRegression.PM13_IA_CAWCPMRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	}
	
	@Test(description = "PM20_WI_CABPWCRegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void PM_20(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		PM20_WI_CABPWCPMRegression.PM20_WI_CABPWCPMRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	}
	
	@Test(description = "PM23_WI_CATCWCRegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void PM_23(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		PM23_WI_CATCWCPMRegression.PM23_WI_CATCWCPMRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	}
	
	@Test(description = "PMSmoke1_MI_CA", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void PMSmoke_1(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		PMSmoke1_MI_CA.PMSmoke1_MI_CAMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	}
	
	@Test(description = "PMSmoke2_IA_WC", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void PMSmoke_2(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		PMSmoke2_IA_WC.PMSmoke2_IA_WCMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	}
	
	@Test(description = "PMSmoke3_WI_BP", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void PMSmoke_3(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		PMSmoke3_WI_BP.PMSmoke3_WI_BPMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	}
	
	@Test(description = "PMSmoke4_WI_TC", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void PMSmoke_4(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		PMSmoke4_WI_TC.PMSmoke4_WI_TCMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	}
	
	@Test(description = "PMSmoke5_KY_CP", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void PMSmoke_5(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		PMSmoke5_KY_CP.PMSmoke5_KY_CPMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	}
	
	@Test(description = "PMSmoke6_MonolineGL_CP", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void PMSmoke_6(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		PMSmoke6_MonolineGL_CPRegression.MonolineGlCpRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	}
	
	@Test(description = "PMSmoke7_ILCUCPRegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void PMSmoke_7(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		PMSmoke7_ILCUCPRegression.PMSmoke7_ILCUCPRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	}
	
}