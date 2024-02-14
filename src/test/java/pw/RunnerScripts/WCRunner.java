package pw.RunnerScripts;
	import java.io.File;
	import java.io.IOException;
	import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;

	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.testng.ITestResult;
	import org.testng.TestNG;
	import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.Test;

	import com.relevantcodes.extentreports.ExtentReports;
	import com.relevantcodes.extentreports.ExtentTest;

	import Libraries.automation.common.BaseTest;
	import Libraries.automation.common.SeHelper;
	import Libraries.automation.common.Transformer;
	import Libraries.automation.common.framework.Browser.Browsers;
	import Libraries.automation.common.framework.ExtentManager;
	import Libraries.automation.common.framework.ExtentTestManager;
	import Libraries.automation.common.framework.Util;
import pw.Constants.constants;
import pw.regressions.WC.WC10_MO_WCRegression;
import pw.regressions.WC.WC11_PA_WCRegression;
import pw.regressions.WC.WC12_WI_WCRegression;
import pw.regressions.WC.WC13_MultiStateOOSE_WCRegression;
import pw.regressions.WC.WC14_MultiState_WCRegression;
import pw.regressions.WC.WC15_RevEndorsement_WCRegression;
import pw.regressions.WC.WC16_AnalyticsTab_WCRegression;
import pw.regressions.WC.WC1_AZ_WCRegression;
import pw.regressions.WC.WC2_CO_WCRegression;
import pw.regressions.WC.WC3_IA_WCRegression;
import pw.regressions.WC.WC4_IL_WCRegression;
import pw.regressions.WC.WC5_IN_WCRegression;
import pw.regressions.WC.WC6_KS_WCRegression;
import pw.regressions.WC.WC7_KYClone_WCRegression;
import pw.regressions.WC.WC8_MI_WCRegression;
import pw.regressions.WC.WC9_MN_WCRegression;
	
	@SuppressWarnings("unused")
	public class WCRunner extends BaseTest{

		XSSFWorkbook workbook = null;
		String premiumsFilePath;
		File premiumsFile;
		String RegressionName = "";
		ExtentReports extent;
		LinkedHashMap<String, Boolean> RegressionStatus = new LinkedHashMap<String, Boolean>();
		
		@BeforeSuite()
		public void beforeSuite() throws IOException {
			extent = ExtentManager.getInstance();
			premiumsFilePath = ExtentManager.getPremiumsFile() + "\\PremiumSummaryReport.xlsx";
			workbook = new XSSFWorkbook();
			premiumsFile = new File(premiumsFilePath);
			//commented out Quote Number line to use manual entry on Selection Sheet  EB 9/20/23
			Util.setQuoteAndAccountNumber(constants.WC);
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
			Util.stopExecutionIfPassed(RegressionStatus,constants.WC);
			
		}
		
		
		@Test(description = "WC1_AZ_WCRegression", dataProvider = "browserXlsByRow", groups = {
	    "PWRateComparision" }, timeOut = 500000000)
		@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
		public void WC_1(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		WC1_AZ_WCRegression.AZ_WCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);
		}
		
		@Test(description = "WC2_CO_WCRegression", dataProvider = "browserXlsByRow", groups = {
	    "PWRateComparision" }, timeOut = 500000000)
		@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
		public void WC_2(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		WC2_CO_WCRegression.CO_WCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);
		}
		
		@Test(description = "WC3_IA_WCRegression", dataProvider = "browserXlsByRow", groups = {
	    "PWRateComparision" }, timeOut = 500000000)
		@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
		public void WC_3(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		WC3_IA_WCRegression.IA_WCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);
		}
		
		@Test(description = "WC4_IL_WCRegression", dataProvider = "browserXlsByRow", groups = {
	    "PWRateComparision" }, timeOut = 500000000)
		@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
		public void WC_4(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		WC4_IL_WCRegression.IL_WCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);
		}
		
		@Test(description = "WC5_IN_WCRegression", dataProvider = "browserXlsByRow", groups = {
	    "PWRateComparision" }, timeOut = 500000000)
		@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
		public void WC_5(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		WC5_IN_WCRegression.IN_WCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);
		}
		
		@Test(description = "WC6_KS_WCRegression", dataProvider = "browserXlsByRow", groups = {
	    "PWRateComparision" }, timeOut = 500000000)
		@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
		public void WC_6(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		WC6_KS_WCRegression.KS_WCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);
		}
		
		@Test(description = "WC7_KYClone_WCRegression", dataProvider = "browserXlsByRow", groups = {
	    "PWRateComparision" }, timeOut = 500000000)
		@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
		public void WC_7(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		WC7_KYClone_WCRegression.KYClone_WCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);
		}
		
		@Test(description = "WC8_MI_WCRegression", dataProvider = "browserXlsByRow", groups = {
	    "PWRateComparision" }, timeOut = 500000000)
		@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
		public void WC_8(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		WC8_MI_WCRegression.MI_WCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);
		}
		
		@Test(description = "WC9_MN_WCRegression", dataProvider = "browserXlsByRow", groups = {
	    "PWRateComparision" }, timeOut = 500000000)
		@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
		public void WC_9(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		WC9_MN_WCRegression.MN_WCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);
		}
		
		@Test(description = "WC10_MO_WCRegression", dataProvider = "browserXlsByRow", groups = {
	    "PWRateComparision" }, timeOut = 500000000)
		@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
		public void WC_10(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		WC10_MO_WCRegression.MO_WCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);
		}
		
		@Test(description = "WC11_PA_WCRegression", dataProvider = "browserXlsByRow", groups = {
	    "PWRateComparision" }, timeOut = 500000000)
		@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
		public void WC_11(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		WC11_PA_WCRegression.PA_WCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);
		}
		
		@Test(description = "WC12_WI_WCRegression", dataProvider = "browserXlsByRow", groups = {
	    "PWRateComparision" }, timeOut = 500000000)
		@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
		public void WC_12(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		WC12_WI_WCRegression.WI_WCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);
		}
		
		
		@Test(description = "WC13_MultiStateOOSE_WCRegression", dataProvider = "browserXlsByRow", groups = {
	    "PWRateComparision" }, timeOut = 500000000)
		@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
		public void WC_13(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		WC13_MultiStateOOSE_WCRegression.MultiStateOOSE_WCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);
		}
		
		@Test(description = "WC14_MultiState_WCRegression", dataProvider = "browserXlsByRow", groups = {
	    "PWRateComparision" }, timeOut = 500000000)
		@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
		public void WC_14(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		WC14_MultiState_WCRegression.MultiState_WCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);
		}
		
		@Test(description = "WC15_RevEndorsement_WCRegression", dataProvider = "browserXlsByRow", groups = {
	    "PWRateComparision" }, timeOut = 500000000)
		@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
		public void WC_15(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		WC15_RevEndorsement_WCRegression.RevEndorsement_WCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);
		}
		
		@Test(description = "WC16_AnalyticsTab_WCRegression", dataProvider = "browserXlsByRow", groups = {
	    "PWRateComparision" }, timeOut = 500000000)
		@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
		public void WC_16(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		WC16_AnalyticsTab_WCRegression.AnalyticsTab_WCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);
		}
		
		

}
