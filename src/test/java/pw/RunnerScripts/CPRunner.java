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
import pw.regressions.BP.BP1_AZ_BPRegression;
import pw.regressions.BP.BP4_IL_BPRegression;
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
import pw.regressions.CP.CP32_PA_SportsRec_CPRegression;
import pw.regressions.CP.CP3_IA_CPRegression;
import pw.regressions.CP.CP4_IL_CPRegression;
import pw.regressions.CP.CP5_IN_CPRegression;
import pw.regressions.CP.CP6_KS_CPRegression;
import pw.regressions.CP.CP7_KY_CPRegression;
import pw.regressions.CP.CP8_MI_CPRegression;
import pw.regressions.CP.CP9_MN_CPRegression;

@SuppressWarnings("unused")
public class CPRunner extends BaseTest {

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
		Util.setQuoteAndAccountNumber(constants.CP);
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
		Util.stopExecutionIfPassed(RegressionStatus,constants.CP);
		
	}

	@Test(description = "CP_1 AZ CP Regression", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)

	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_1(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP1_AZ_CPRegression.AZ_CPRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);
	}

	@Test(description = "CP 2 CO CP Regression Testing", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_2(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP2_CO_CPRegression.COCPRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);

	}

	@Test(description = "CP_3 IA CP Regression", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_3(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP3_IA_CPRegression.IACPRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);

	}
	
	@Test(description = "CP_4 IL CP Regression", dataProvider = "browserXlsByRow", groups = {
	"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_4(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
	CP4_IL_CPRegression.IL_CPRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	
	}

	@Test(description = "CP_5 IN CP Regression Testing", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_5(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP5_IN_CPRegression.INCpRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);

	}

	@Test(description = "CP 6 KS CP Regression", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_6(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP6_KS_CPRegression.KSCpRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);
	}

	@Test(description = "CP_7 KY CP Regression", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_7(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP7_KY_CPRegression.KYCPRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);

	}

	@Test(description = "CP_8 MI CP Regression", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_8(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP8_MI_CPRegression.MICPRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);

	}

	@Test(description = "CP_9 MN CP Regression", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_9(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP9_MN_CPRegression.MNCPRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);

	}

	@Test(description = "CP+10 MO CP Regression", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_10(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP10_MO_CPRegression.MOCpRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);

	}

	@Test(description = "CP 11 ND CP Regression Testing", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_11(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP11_ND_CPRegression.NDCpRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);
	}

	@Test(description = "CP 12 PA CP Regression Testing", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_12(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP12_PA_CPRegression.PACPRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);

	}

	@Test(description = "CP 13 WI CP Regression Testing", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_13(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP13_WI_CPRegression.WICPRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);

	}

	@Test(description = "CP14_Multi_CPRegression Testing", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_14(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP14_Multi_CPRegression.MultiCpMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);

	}

	@Test(description = "CP15_MultistateISO_CPRegression Testing", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_15(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP15_MultistateISO_CPRegression.MultistateISOMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook,
				test);

	}

	@Test(description = "CP16_ISOELCMulti_CPRegression Testing", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_16(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP16_ISOELCMulti_CPRegression.ISOELCMultiMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);

	}

	@Test(description = "CP17_AG_CPRegression Testing", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_17(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP17_AG_CPRegression.AGCpRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);

	}

	@Test(description = "CP18_GLDetective_CPRegression Testing", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_18(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP18_GLDetective_CPRegression.glDetectiveCpMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);

	}

	@Test(description = "CP19_GolfProgram_CPRegression Testing", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_19(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP19_GolfProgram_CPRegression.GolfProgram_CPRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile,
				workbook, test);
		extent.endTest(test);

	}

	@Test(description = "CP20_HoleInOne_CPRegression Testing", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_20(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP20_HoleInOne_CPRegression.HoleInOneCPRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook,
				test);

	}

	@Test(description = "CP 21 Human Services CP Regression Testing", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_21(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);		
		CP21_HumanService_CPRegression.HumanServiceCPRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile,
				workbook, test);
		extent.endTest(test);

	}

	@Test(description = "CP22_Loggers_CPRegression Testing", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_22(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP22_Loggers_CPRegression.LoggersCPRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);
	}

	@Test(description = "CP23_OCP_CPRegression Testing", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_23(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP23_OCP_CPRegression.OCPCPRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);

	}

	@Test(description = "CP_24 SE Liablility CP regression testing", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_24(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP24_SELiability_CPRegression.SELiabilityCPRegression_Method(myBrowser, se, params, strRegressionId, premiumsFile,
				workbook, test);
		extent.endTest(test);
	}

	@Test(description = "CP_25 Monoline CR CPRegression testing", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_25(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP25_MonolineCR_CPRegression.MonolineCRCPRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile,
				workbook, test);
		extent.endTest(test);
	}

	@Test(description = "CP_26 Monoline DO CP Regression Testing", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_26(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP26_MonolineDO_CPRegression.MonolineDOCPRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile,
				workbook, test);
		extent.endTest(test);
	}

	@Test(description = "CP27_MonolineEPLI_CPRegression Testing", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_27(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP27_MonolineEPLI_CPRegression.MonolineEPLICPRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile,
				workbook, test);
		extent.endTest(test);

	}

	@Test(description = "CP 28 Monoline GL CP Regression", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_28(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP28_MonolineGL_CPRegression.MonolineGlCpRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile,
				workbook, test);
		extent.endTest(test);
	}

	@Test(description = "CP29_MonolineIM_CPRegression Testing", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_29(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP29_MonolineIM_CPRegression.MonolineIMCPRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile,
				workbook, test);
		extent.endTest(test);
	}

	@Test(description = "CP30_MonolinePCM_CPRegression Testing", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_30(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP30_MonolinePCM_CPRegression.MonolinePCMRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile,
				workbook, test);
		extent.endTest(test);

	}

	@Test(description = "CP31_MonolinePR_CPRegression Testing", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_31(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP31_MonolinePR_CPRegression.MonolinePRCPMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);

	}
	
	@Test(description = "CP 32_PA_CP_SportsRec_Regression Testing", dataProvider = "browserXlsByRow", groups = {
		"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CP_32(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId+" :: "+RegressionName);
		CP32_PA_SportsRec_CPRegression.PACPSportsRecMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);

	}
	
}