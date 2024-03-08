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
import ap.regression.CP.AG02_IA_AGRegression;
import ap.regression.CP.SL01_CO_SLRegression;
import ap.regression.CP.SL02_IA_SLRegression;
import ap.regression.CP.SL03_IL_SLRegression;
import ap.regression.CP.SL04_KS_SLRegression;
import ap.regression.CP.SL05_ND_SLRegression;
import ap.regression.CP.SL06_MO_SLRegression;
import ap.regression.CP.SL08_CO_SLRegression;
import ap.regression.CP.SL09_MO_AGRegression;
import ap.regression.CP.SL10_ND_AGRegression;
import ap.regression.CP.SL11_KS_SLRegression;
import ap.regression.CP.SL12_PA_SLRegression;
import ap.regression.CP.SL13_MI_SLRegression;
import ap.regression.CP.SL14_KY_SLRegression;
import ap.regression.CP.SL15_IN_MO_SLRegression;
import ap.regression.CP.SL16_WI_SLRegression;
import ap.regression.CP.SL17_CO_SLRegression;

public class CPRunner extends BaseTest {

       XSSFWorkbook workbook = null;
       String premiumsFilePath;
       File premiumsFile;

       String RegressionName = "";
       ExtentReports extent;

       @BeforeSuite()
       public void beforeSuite() {
              extent = ExtentManager.getInstance();
              premiumsFilePath = ExtentManager.getPremiumsFile()+ "\\PremiumSummaryReport_CP.xlsx";
              workbook = new XSSFWorkbook();
              premiumsFile = new File(premiumsFilePath);
       }

       @BeforeMethod(alwaysRun = true, groups = { "test" }, timeOut = 1800000000)
       protected void beforeMethod(Method method, Object[] params) {
              super.beforeMethod(method, params);
              new TestNG().setAnnotationTransformer(new Transformer());
       }

       @AfterMethod(alwaysRun = true, groups = { "test" }, timeOut = 1800000000)
       protected void afterMethod(Method method, ITestResult result, Object[] params) {
              super.afterMethod(method, result, params);
              extent.flush();
       }
       @Test(description = "SL_01 CO SL regression testing", dataProvider = "browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)
       @TestDataXLS(fileName = "../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
       public void SL_01(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
              String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId);
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              SL01_CO_SLRegression.SL01_CO_SLRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
       
       @Test(description = "SL_02 IA SL regression testing", dataProvider = "browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)
       @TestDataXLS(fileName = "../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
       public void SL_02(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
              String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId);
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              SL02_IA_SLRegression.SL02_IA_SLRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
       @Test(description = "SL_03 IL SL regression testing", dataProvider = "browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)
       @TestDataXLS(fileName = "../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
       public void SL_03(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
              String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId);
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              SL03_IL_SLRegression.SL03_IL_SLRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
      
       @Test(description = "SL_04 KS SL regression testing", dataProvider = "browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)
       @TestDataXLS(fileName = "../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
       public void SL_04(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
              String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId);
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              SL04_KS_SLRegression.SL04_KS_SLRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
       @Test(description = "SL_05 ND SL regression testing", dataProvider = "browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)
       @TestDataXLS(fileName = "../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
       public void SL_05(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
              String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId);
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              SL05_ND_SLRegression.SL05_ND_SLRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
       @Test(description = "SL_06 MO SL regression testing", dataProvider = "browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)
       @TestDataXLS(fileName = "../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
       public void SL_06(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
              String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId);
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              SL06_MO_SLRegression.SL06_MO_SLRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }

       @Test(description = "SL_08 CO SL regression testing", dataProvider = "browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)
       @TestDataXLS(fileName = "../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
       public void SL_08(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
              String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId);
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              SL08_CO_SLRegression.SL08_CO_SLRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());

       }
       
       
       @Test(description = "AG_02 IA AG regression testing", dataProvider = "browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)
       @TestDataXLS(fileName = "../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
       public void AG_02(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
              String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId);
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              AG02_IA_AGRegression.AG02_IA_AGRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());

       }

       @Test(description = "SL_09 MO SL regression testing", dataProvider = "browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)
       @TestDataXLS(fileName = "../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
       public void SL_09(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
              String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId);
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              SL09_MO_AGRegression.SL09_MO_AGRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());

       }
       
       @Test(description = "SL_10 ND SL regression testing", dataProvider = "browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)
       @TestDataXLS(fileName = "../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
       public void SL_10(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
              String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId);
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              SL10_ND_AGRegression.SL10_ND_AGRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());

       }
       
       @Test(description = "SL_11 KS SL regression testing", dataProvider = "browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)
       @TestDataXLS(fileName = "../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
       public void SL_11(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
              String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId);
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              SL11_KS_SLRegression.SL11_KS_SLRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }

       @Test(description = "SL_12 PA SL regression testing", dataProvider = "browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)
       @TestDataXLS(fileName = "../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
       public void SL_12(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
              String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId);
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              SL12_PA_SLRegression.SL12_PA_SLRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());

       }
       
       @Test(description = "SL_13 MI SL regression testing", dataProvider = "browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)
       @TestDataXLS(fileName = "../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
       public void SL_13(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
              String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId);
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              SL13_MI_SLRegression.SL13_MI_SLRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }  
       @Test(description = "SL_14 KY SL regression testing", dataProvider = "browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)
       @TestDataXLS(fileName = "../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
       public void SL_14(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
       String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
       String RegressionName = Util.getRegressionName(strRegressionId);
       ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
       SL14_KY_SLRegression.SL14_KY_SLRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
       test.setEndedTime(Util.getTime());
       }
       @Test(description = "SL15_IN_MO_SLRegression testing", dataProvider = "browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)
       @TestDataXLS(fileName = "../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
       public void SL_15(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
              String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId);
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              SL15_IN_MO_SLRegression.SL15_IN_MO_SLRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       } 
       @Test(description = "SL16_WI_SLRegression testing", dataProvider = "browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)
       @TestDataXLS(fileName = "../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
       public void SL_16(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
              String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId);
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              SL16_WI_SLRegression.SL16_WI_SLRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       } 
       @Test(description = "SL17_CO_SLRegression testing", dataProvider = "browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)
       @TestDataXLS(fileName = "../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection")
       public void SL_17(Browsers myBrowser, SeHelper se, Map<String, Object> params) throws IOException {
              String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId);
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              SL17_CO_SLRegression.SL17_WI_SLRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       } 
}



