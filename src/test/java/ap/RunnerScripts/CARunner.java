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
import ap.regression.CA.CA01_MI_CARegression;
import ap.regression.CA.CA01_MI_TCRegression;
import ap.regression.CA.CA02_WI_CARegression;
import ap.regression.CA.CA03_KY_CARegression;
import ap.regression.CA.CA04_IN_BPRegression;
import ap.regression.CA.CA04_IN_CARegression;
import ap.regression.CA.CA05_AZ_CARegression;
import ap.regression.CA.CA05_AZ_TCRegression;
import ap.regression.CA.CA06_MN_BPRegression;
import ap.regression.CA.CA06_MN_CARegression;
import ap.regression.CA.CA07_PA_CARegression;
import ap.regression.CA.CA07_PA_SLRegression;

public class CARunner extends BaseTest {


    XSSFWorkbook workbook = null;
    String premiumsFilePath;
    File premiumsFile;

    String RegressionName = "";
    ExtentReports extent;

    @BeforeSuite()
    public void beforeSuite() throws IOException {
           extent = ExtentManager.getInstance();
           premiumsFilePath = ExtentManager.getPremiumsFile()+ "\\PremiumSummaryReport_CA.xlsx";
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

    /*@Test(description = "CA_1 IA CA regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void CA_1(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
           CA01_IA_CARegression.CA01_IA_CARegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);

    }*/
    
    @Test(description = "CA_01 MI CA regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void CA_01(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
           CA01_MI_CARegression.CA01_MI_CARegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }

    @Test(description = "CA_02 WI CA regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void CA_02(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
           CA02_WI_CARegression.CA02_WI_CARegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
    }

    @Test(description = "CA_03 KY CA regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void CA_03(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
           CA03_KY_CARegression.CA03_KY_CARegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
    }
    
    @Test(description = "CA_04 IN CA regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void CA_04(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
           CA04_IN_BPRegression.CABP04_IN_RegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
    }
    
    @Test(description = "CA_05 AZ CA regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void CA_05(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
           CA05_AZ_TCRegression.CATC05_AZ_RegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
    }
    
    @Test(description = "CA_06 MN CA regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void CA_06(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
           CA06_MN_CARegression.CA06_MN_CARegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
    }
    
    @Test(description = "CA_07 PA CA regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void CA_07(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
           CA07_PA_SLRegression.CASL07_PA_RegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
    }
}
