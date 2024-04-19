package rrs.RunnerScripts;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
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
import Libraries.automation.common.CommonBaseTest.TestDataXLS;
import Libraries.automation.common.framework.ExtentManager;
import Libraries.automation.common.framework.ExtentTestManager;
import Libraries.automation.common.framework.Util;
import Libraries.automation.common.framework.Browser.Browsers;
import pw.Constants.constants;
import pw.regressions.BP.BP10_MO_BPRegression;
import pw.regressions.BP.BP11_ND_BPRegression;
import pw.regressions.BP.BP12_PA_BPRegression;
import pw.regressions.BP.BP13_WI_BPRegression;
import pw.regressions.BP.BP14_MultiState_BPRegression;
import pw.regressions.BP.BP15_MultiStateISO_BPRegression;
import pw.regressions.BP.BP1_AZ_BPRegression;
import pw.regressions.BP.BP2_CO_BPRegression;
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
import rrs.Regressions.RRS_Regression_02;

@SuppressWarnings("unused")

public class RRSUmbrella  extends BaseTest {
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
		System.out.println("-----------------"+premiumsFilePath);
		workbook = new XSSFWorkbook();
		premiumsFile = new File(premiumsFilePath);
		//commented out Quote Number line to use manual entry on Selection Sheet  EB 9/20/23
		//Util.setQuoteAndAccountNumber(constants.BP);
		new TestNG().setAnnotationTransformer(new Transformer());
	}

	@BeforeMethod(alwaysRun = true, groups = { "test" }, timeOut = 1800000000)
	protected void beforeMethod(Method method, Object[] params) {
		System.out.println("BeforeMethod------------------------");
		super.beforeMethod(method, params);
		new TestNG().setAnnotationTransformer(new Transformer());
	
	}

	@AfterMethod(alwaysRun = true, groups = { "test" }, timeOut = 1800000000)
	protected void afterMethod(Method method, ITestResult result, Object[] params) {
		super.afterMethod( method, result, params);
	RegressionStatus.put(method.getName(), result.isSuccess());
		extent.flush();
	}
	@AfterSuite(alwaysRun = true, groups = { "test" }, timeOut = 1800000000)
	protected void afterSuite() throws IOException {
		Util.stopExecutionIfPassed(RegressionStatus,constants.BP);
		
	}

	@Test(description = "RRS PW 01 regression testing", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void BP_1(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		
		RRS_Regression_02.RRS_RegressionMethod(myBrowser, se, params, strRegressionId,RegressionName ,premiumsFile, workbook, test);
		test.setEndedTime(Util.getTime());
		extent.endTest(test);
	}


}
