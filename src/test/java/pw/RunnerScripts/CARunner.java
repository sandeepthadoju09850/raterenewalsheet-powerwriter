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
import pw.regressions.CA.CA10_IN_AutoDealersRegression;
import pw.regressions.CA.CA11_IN_BusinessAutoRegression;
import pw.regressions.CA.CA12_KS_AutoDealers_CARegression;
import pw.regressions.CA.CA13_KS_BusinessAuto_CARegression;
import pw.regressions.CA.CA14_KYAutoDealers_CARegression;
import pw.regressions.CA.CA15_KYBusinessAuto_CARegression;
import pw.regressions.CA.CA16_MI_AutoDealers_CARegression;
import pw.regressions.CA.CA17_MI_BusinessAuto_CARegression;
import pw.regressions.CA.CA18_MNAutoDealers_CARegression;
import pw.regressions.CA.CA19_MNBusinessAuto_CARegression;
import pw.regressions.CA.CA1_AZAutoDealers_CARegression;
import pw.regressions.CA.CA20_MOAutoDealers_CARegression;
import pw.regressions.CA.CA21_MOBusinessAuto_CARegression;
import pw.regressions.CA.CA22_MS_AutoDealersRegression;
//import pw.regressions.CA.CA22_MS_AutoDealersRegression;
import pw.regressions.CA.CA23_MSBusinessAuto_CARegression;
import pw.regressions.CA.CA24_MSMotorCarrier_CARegression;
import pw.regressions.CA.CA25_NDAutoDealers_CARegression;
import pw.regressions.CA.CA26_NDBusinessAuto_CARegression;
import pw.regressions.CA.CA27_PA_AutoDealers_CARegression;
import pw.regressions.CA.CA28_PABusinessAuto_CARegression;
import pw.regressions.CA.CA29_WI_AutoDealersRegression;
import pw.regressions.CA.CA2_AZ_Business_CARegression;
import pw.regressions.CA.CA30_WIBusinessAuto_CARegression;
import pw.regressions.CA.CA31_MIFarmAutoFleet_CARegression;
import pw.regressions.CA.CA32_WIFarmAutoNonFleet_CARegression;
import pw.regressions.CA.CA3_CO_AutoDealers_CARegression;
import pw.regressions.CA.CA4_CO_Business_CARegression;
import pw.regressions.CA.CA5_CO_MotorCarrier_CARegression;
import pw.regressions.CA.CA6_IA_AutoDealersRegression;
import pw.regressions.CA.CA7_IA_BusinessAutoRegression;
import pw.regressions.CA.CA8_ILAutoDealers_CARegression;
import pw.regressions.CA.CA9_ILBusinessAuto_CARegression;

public class CARunner extends BaseTest {

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
		Util.setQuoteAndAccountNumber(constants.CA);
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
		Util.stopExecutionIfPassed(RegressionStatus,constants.CA);
		
	}
	
	@Test(description = "CA1_AZ_AutoDealersRegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_1(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	CA1_AZAutoDealers_CARegression.AZAutoDealers_CARegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	
	@Test(description = "CA2_AZ_Business_CARegression", dataProvider = "browserXlsByRow", groups = {
	"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_2(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		CA2_AZ_Business_CARegression.AZ_Business_CARegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);
	}
	
	@Test(description = "CA3_CO_AutoDealersRegression", dataProvider = "browserXlsByRow", groups = {
			"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_3(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		CA3_CO_AutoDealers_CARegression.CO_AutoDealers_CARegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);
	}
	

	@Test(description = "CA4_CO_BusinessRegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_4(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	CA4_CO_Business_CARegression.CO_Business_CARegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	
	@Test(description = "CA5_CO_MotorCarrier_CARegression", dataProvider = "browserXlsByRow", groups = {
	"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_5(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	CA5_CO_MotorCarrier_CARegression.COMotorCarrierRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	
	@Test(description = "CA6_IA_AutoDealersRegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_6(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	CA6_IA_AutoDealersRegression.IAAutoDealersRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	
	@Test(description = "CA7_IA_BusinessAutoRegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_7(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	CA7_IA_BusinessAutoRegression.IABusinessAutoRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}

	@Test(description = "CA8_IL_AutoDealersRegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_8(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	CA8_ILAutoDealers_CARegression.ILAutoDealers_CARegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	
	@Test(description = "CA9_ILBusinessAuto_CARegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_9(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	CA9_ILBusinessAuto_CARegression.ILBusinessAuto_CARegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	
	@Test(description = "CA10_IN_AutoDealersRegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_10(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	CA10_IN_AutoDealersRegression.INAutoDealersRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	
	@Test(description = "CA11_IN_BusinessAutoRegression", dataProvider = "browserXlsByRow", groups = {
	"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_11(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	CA11_IN_BusinessAutoRegression.INBusinessAutoRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	
	@Test(description = "CA12_KS_AutoDealers_CARegression", dataProvider = "browserXlsByRow", groups = {
	"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_12(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	CA12_KS_AutoDealers_CARegression.KSAutoDealers_CARegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	@Test(description = "CA13_KS_BusinessAuto_CARegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_13(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	CA13_KS_BusinessAuto_CARegression.KS_BusinessAuto_CARegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	
	@Test(description = "CA14_KY_AutoDealers_CARegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_14(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	CA14_KYAutoDealers_CARegression.KYAutoDealers_CARegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	
	
	@Test(description = "CA15_KYBusinessAuto_CARegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_15(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	CA15_KYBusinessAuto_CARegression.KYBusinessAuto_CARegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	
	@Test(description = "CA16_MI_AutoDealers_CARegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_16(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	CA16_MI_AutoDealers_CARegression.MIAutoDealers_CARegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	
	@Test(description = "CA17_MI_BusinessAuto_CARegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_17(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	CA17_MI_BusinessAuto_CARegression.MIBusiness_CARegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	
	@Test(description = "CA18_MNAutoDealers_CARegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_18(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	CA18_MNAutoDealers_CARegression.MNAutoDealers_CARegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}

	@Test(description = "CA19_MNBusinessAuto_CARegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_19(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	CA19_MNBusinessAuto_CARegression.MNBusinessAuto_CARegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	
	@Test(description = "CA20_MOAutoDealers_CARegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_20(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	CA20_MOAutoDealers_CARegression.MOAutoDealers_CARegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	
	@Test(description = "CA21_MOBusinessAuto_CARegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_21(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	CA21_MOBusinessAuto_CARegression.MOBusinessAuto_CARegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	
	@Test(description = "CA22_MSAutoDealers_CARegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_22(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	CA22_MS_AutoDealersRegression.MSAutoDealerRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	
	@Test(description = "CA23_MSBusinessAuto_CARegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_23(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	CA23_MSBusinessAuto_CARegression.MSBusinessAuto_CARegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	
	@Test(description = "CA24_MSMotorCarrier_CARegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_24(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	CA24_MSMotorCarrier_CARegression.MSBusinessAuto_CARegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	
	@Test(description = "CA25_NDAutoDealers_CARegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_25(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	CA25_NDAutoDealers_CARegression.NDAutoDealers_CARegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	
	@Test(description = "CA26_NDBusinessAuto_CARegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_26(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	CA26_NDBusinessAuto_CARegression.NDBusinessAuto_CARegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	
	@Test(description = "CA27_PAAuto_CARegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_27(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	CA27_PA_AutoDealers_CARegression.PAAutoDealersRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	

	@Test(description = "CA28_PABusinessAuto_CARegression", dataProvider = "browserXlsByRow", groups = {
    "PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_28(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
	String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
	String RegressionName = Util.getRegressionName(strRegressionId);
	ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
	CA28_PABusinessAuto_CARegression.PABusinessAutoRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
	extent.endTest(test);
	}
	
	@Test(description = "CA29_WI_AutoDealers_CARegression", dataProvider = "browserXlsByRow", groups = {
	"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_29(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		CA29_WI_AutoDealersRegression.WIAutoDealerRegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);
	}
	
	@Test(description = "CA30_WIBusinessAuto_CARegression", dataProvider = "browserXlsByRow", groups = {
	"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_30(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		CA30_WIBusinessAuto_CARegression.WIBusinessAuto_CARegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);
	}
	
	@Test(description = "CA31_MIFarmAutoFleet_CARegression", dataProvider = "browserXlsByRow", groups = {
	"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_31(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		CA31_MIFarmAutoFleet_CARegression.MIFarmAutoFleet_CARegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);
	}

	@Test(description = "CA32_WIFarmAutoNonFleet_CARegression", dataProvider = "browserXlsByRow", groups = {
	"PWRateComparision" }, timeOut = 500000000)
	@TestDataXLS(fileName = "../../resources/testData/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
	public void CA_32(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
		String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
		String RegressionName = Util.getRegressionName(strRegressionId);
		ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
		CA32_WIFarmAutoNonFleet_CARegression.WIFarmAutoNonFleet_CARegressionMethod(myBrowser, se, params, strRegressionId, premiumsFile, workbook, test);
		extent.endTest(test);
	}


}