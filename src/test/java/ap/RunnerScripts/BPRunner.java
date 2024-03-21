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

import Libraries.automation.common.BaseTest;
import Libraries.automation.common.SeHelper;
import Libraries.automation.common.Transformer;
import Libraries.automation.common.framework.Browser.Browsers;
import Libraries.automation.common.framework.ExtentManager;
import Libraries.automation.common.framework.ExtentTestManager;
import Libraries.automation.common.framework.Util;

import ap.regression.BP.BP11_MN_BPRegression;

public class BPRunner extends BaseTest {

       XSSFWorkbook workbook = null;
       String premiumsFilePath;
       File premiumsFile;

       String RegressionName = "";
       ExtentReports extent;

       @BeforeSuite()
       public void beforeSuite() throws IOException {
    	   //super.beforeSuite();
              extent = ExtentManager.getInstance();
              premiumsFilePath = ExtentManager.getPremiumsFile()+ "\\PremiumSummaryReport_BP.xlsx";
              workbook = new XSSFWorkbook();
              premiumsFile = new File(premiumsFilePath);
       }

       @BeforeMethod(alwaysRun = true, groups = { "test" }, timeOut = 1800000000)
       protected void beforeMethod(Method method, Object[] params) {
    	   System.out.println("Before method in Runner");
              super.beforeMethod(method, params);
              new TestNG().setAnnotationTransformer(new Transformer());
       }

       @AfterMethod(alwaysRun = true, groups = { "test" }, timeOut = 1800000000)
       protected void afterMethod(Method method, ITestResult result, Object[] params) {
              super.afterMethod(method, result, params);
              extent.flush();
       }

       @Test(description = "BP_11 MN BP regression testing", dataProvider ="browserXlsByRowBL", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)

       @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection") 
       public void BP_11(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException
       { 
              String  strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getBLRegressionName(strRegressionId); 
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              BP11_MN_BPRegression.BP11_MN_BPRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
       
      
}



