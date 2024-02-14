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
import pw.regressions.BP.BP10_MO_BPRegression;
import pw.regressions.BP.BP15_MultiStateISO_BPRegression;
import pw.regressions.BP.BP1_AZ_BPRegression;
import pw.regressions.BP.BP3_IA_BPRegression;
import pw.regressions.BP.BP4_IL_BPRegression;
import pw.regressions.BP.BP5_IN_BPRegression;
import pw.regressions.BP.BP6_KS_BPRegression;
import pw.regressions.BP.BP7_KY_BPRegression;
import pw.regressions.BP.BP8_MI_BPRegression;
import pw.regressions.BP.BP9_MN_BPRegression;
import pw.regressions.CP.CP10_MO_CPRegression;
import pw.regressions.CP.CP11_ND_CPRegression;
import pw.regressions.CP.CP12_PA_CPRegression;
import pw.regressions.CP.CP13_WI_CPRegression;
import pw.regressions.CP.CP14_Multi_CPRegression;
import pw.regressions.CP.CP15_MultistateISO_CPRegression;
import pw.regressions.CP.CP16_ISOELCMulti_CPRegression;
import pw.regressions.CP.CP17_AG_CPRegression;
import pw.regressions.CP.CP18_GLDetective_CPRegression;
import pw.regressions.CP.CP19_GolfProgram_CPRegression;
import pw.regressions.CP.CP1_AZ_CPRegression;
import pw.regressions.CP.CP20_HoleInOne_CPRegression;
import pw.regressions.CP.CP21_HumanService_CPRegression;
import pw.regressions.CP.CP22_Loggers_CPRegression;
import pw.regressions.CP.CP23_OCP_CPRegression;
import pw.regressions.CP.CP24_SELiability_CPRegression;
import pw.regressions.CP.CP25_MonolineCR_CPRegression;
import pw.regressions.CP.CP26_MonolineDO_CPRegression;
import pw.regressions.CP.CP27_MonolineEPLI_CPRegression;
import pw.regressions.CP.CP28_MonolineGL_CPRegression;
import pw.regressions.CP.CP29_MonolineIM_CPRegression;
import pw.regressions.CP.CP2_CO_CPRegression;
import pw.regressions.CP.CP30_MonolinePCM_CPRegression;
import pw.regressions.CP.CP31_MonolinePR_CPRegression;
import pw.regressions.CP.CP3_IA_CPRegression;
import pw.regressions.CP.CP4_IL_CPRegression;
import pw.regressions.CP.CP5_IN_CPRegression;
import pw.regressions.CP.CP6_KS_CPRegression;
import pw.regressions.CP.CP7_KY_CPRegression;
import pw.regressions.CP.CP8_MI_CPRegression;
import pw.regressions.CP.CP9_MN_CPRegression;
import pw.regressions.TC.TC10_MN_TCRegression;
import pw.regressions.TC.TC11_MO_TCRegression;
import pw.regressions.TC.TC12_Multi_TCRegression;
import pw.regressions.TC.TC13_ND_TCRegression;
import pw.regressions.TC.TC14_PA_TCRegression;
import pw.regressions.TC.TC15_WI_TCRegression;
import pw.regressions.TC.TC16_CO_ISO_PrefillRegression;
import pw.regressions.TC.TC1_AZ_TCRegression;
import pw.regressions.TC.TC2_CO_TCRegression;
import pw.regressions.TC.TC3_HomeBuilder_TCRegression;
import pw.regressions.TC.TC4_IA_TCRegression;
import pw.regressions.TC.TC5_IL_TCRegression;
import pw.regressions.TC.TC6_IN_TCRegression;
import pw.regressions.TC.TC7_KS_TCRegression;
import pw.regressions.TC.TC8_KY_Regression;
import pw.regressions.TC.TC9_MI_TCRegression;

@SuppressWarnings("unused")
public class TCRunner extends BaseTest {

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
		Util.setQuoteAndAccountNumber(constants.TC);
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
		Util.stopExecutionIfPassed(RegressionStatus,constants.TC);
		
	}

	@Test(description = "TC_1 AZ TC regression testing", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void TC_1(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		TC1_AZ_TCRegression.AZ_TCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);
	}
	
	@Test(description = "TC_2 CO TC regression testing", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void TC_2(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	TC2_CO_TCRegression.TC2_CO_TCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}

	
	@Test(description = "TC_3 Home Builder regression testing", dataProvider = "browserXlsByRow", groups = {
	"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void TC_3(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	TC3_HomeBuilder_TCRegression.HomeBuilderTCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	
	@Test(description = "TC_4 IA TC regression testing", dataProvider = "browserXlsByRow", groups = {
	"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void TC_4(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	TC4_IA_TCRegression.IA_TCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	
	@Test(description = "TC_5 IL TC regression testing", dataProvider = "browserXlsByRow", groups = {
	"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void TC_5(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	TC5_IL_TCRegression.IL_TCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	@Test(description = "TC_6 IN TC Regression testing", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void TC_6(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	TC6_IN_TCRegression.IN_TCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}

	@Test(description = "TC_7 KS TC regression testing", dataProvider = "browserXlsByRow", groups = {
	"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void TC_7(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	TC7_KS_TCRegression.KS_TCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	
	@Test(description = "TC_8 KY TC Regression testing", dataProvider = "browserXlsByRow", groups = {
	"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void TC_8(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	TC8_KY_Regression.KYTCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	
	@Test(description = "TC_9 MI  TC  regression testing", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	    public void TC_9(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	     String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId);
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
           TC9_MI_TCRegression.MITCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
           extent.endTest(test);
	}

	
	@Test(description = "TC_10 MN TC regression testing", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void TC_10(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	TC10_MN_TCRegression.MN_TCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
  }

	
	@Test(description = "TC_11 MO TC regression testing", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void TC_11(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	TC11_MO_TCRegression.MO_TCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
  }

	@Test(description = "TC_12 Multi TC regression testing", dataProvider = "browserXlsByRow", groups = {
		"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void TC_12(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	TC12_Multi_TCRegression.Multi_TCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	
	@Test(description = "TC_13 ND TC regression testing", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void TC_13(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	TC13_ND_TCRegression.NDTCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	
	@Test(description = "TC_14 PA TC regression testing", dataProvider = "browserXlsByRow", groups = {
	"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void TC_14(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	TC14_PA_TCRegression.PA_TCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	
	@Test(description = "TC_15 WI TC regression testing", dataProvider = "browserXlsByRow", groups = {
	"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void TC_15(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		TC15_WI_TCRegression.WITCRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);
}
	
	@Test(description = "TC_16 CO_ISO_Prefill TC regression testing", dataProvider = "browserXlsByRow", groups = {
	"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void TC_16(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		TC16_CO_ISO_PrefillRegression.TC16_CO_ISO_PrefillRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);
}

}