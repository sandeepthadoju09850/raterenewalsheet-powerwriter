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
import ap.regression.WC.WC01_WI_WCRegression;

import ap.regression.WC.WC02_MN_WCRegression;
import ap.regression.WC.WC03_IA_WCRegression;
import ap.regression.WC.WC04_CO_SLRegression;
import ap.regression.WC.WC04_CO_WCRegression;
import ap.regression.WC.WC05_IN_BPRegression;
import ap.regression.WC.WC05_IN_WCRegression;
import ap.regression.WC.WC06_PA_BPRegression;
import ap.regression.WC.WC06_PA_WCRegression;

public class WCRunner extends BaseTest {


    XSSFWorkbook workbook = null;
    String premiumsFilePath;
    File premiumsFile;

    String RegressionName = "";
    ExtentReports extent;

    @BeforeSuite()
    public void beforeSuite() throws IOException {
           extent = ExtentManager.getInstance();
           premiumsFilePath = ExtentManager.getPremiumsFile()+ "\\PremiumSummaryReport_WC.xlsx";
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
    @Test(description = "WC_01 WI WC regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void WC_01(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
           WC01_WI_WCRegression.WC01_WI_WCRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
    }
    @Test(description = "WC_02 MN WC regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void WC_02(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
           WC02_MN_WCRegression.WC02_MN_WCRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
    }
    @Test(description = "WC_03 IA WC regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void WC_03(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
           WC03_IA_WCRegression.WC03_IA_WCRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
    }
    

    @Test(description = "WC_04 CO WC regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void WC_04(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
           WC04_CO_SLRegression.WCSL04_CO_RegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
    }
    @Test(description = "WC_05 IN WC regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void WC_05(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
           WC05_IN_WCRegression.WC05_IN_WCRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
    }

    @Test(description = "WC_06 PA WC regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void WC_06(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
           WC06_PA_BPRegression.WCBP06_PA_RegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
    }
    
}
