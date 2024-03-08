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
import ap.regression.BP.BP01_IA_BPRegression;
import ap.regression.BP.BP02_KS_BPRegression;
import ap.regression.BP.BP03_MO_BPRegression;
import ap.regression.BP.BP04_ND_BPRegression;
import ap.regression.BP.BP05_CO_BPRegression;
import ap.regression.BP.BP06_IL_BPRegression;
import ap.regression.BP.BP07_KY_BPRegression;
import ap.regression.BP.BP08_WI_BPRegression;
import ap.regression.BP.BP09_IN_BPRegression;
import ap.regression.BP.BP10_MI_BPRegression;
import ap.regression.BP.BP11_MN_BPRegression;
import ap.regression.BP.BP12_PA_BPRegression;
import ap.regression.BP.BP13_WIServiceCenter_BPRegression;
import ap.regression.BP.BP14_AZ_BPRegression;
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

       @Test(description = "BP_01 IA BP regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)

       @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection") 
       public void BP_01(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException
       { 
              String  strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId); 
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              BP01_IA_BPRegression.BP01_IA_BPRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
       
       @Test(description = "BP_02 KS BP regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)

       @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection") 
       public void BP_02(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException
       { 
              String  strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId); 
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              BP02_KS_BPRegression.BP02_KS_BPRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
       

       @Test(description = "BP_03 MO BP regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)

       @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection") 
       public void BP_03(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException
       { 
              String  strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId); 
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              BP03_MO_BPRegression.BP03_MO_BPRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
       
       @Test(description = "BP_04 ND BP regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)

       @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection") 
       public void BP_04(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException
       { 
              String  strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId); 
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              BP04_ND_BPRegression.BP04_ND_BPRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
      

       @Test(description = "BP_05 CO BP regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)

       @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection") 
       public void BP_05(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException
       { 
              String  strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId); 
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              BP05_CO_BPRegression.BP05_CO_BPRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
      
       @Test(description = "BP_06 IL BP regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)

       @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection") 
       public void BP_06(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException
       { 
              String  strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId); 
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              BP06_IL_BPRegression.BP06_IL_BPRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
       
       @Test(description = "BP_07 KY BP regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)

       @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection") 
       public void BP_07(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException
       { 
              String  strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId); 
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              BP07_KY_BPRegression.BP07_KY_BPRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
       
       @Test(description = "BP_08 WI BP regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)

       @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection") 
       public void BP_08(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException
       { 
              String  strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId); 
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              BP08_WI_BPRegression.BP08_WI_BPRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }

     
       @Test(description = "BP_09 IN BP regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)

       @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection") 
       public void BP_09(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException
       { 
              String  strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId); 
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              BP09_IN_BPRegression.BP09_IN_BPRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
       
       @Test(description = "BP_10 MI BP regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)

       @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection") 
       public void BP_10(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException
       { 
              String  strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId); 
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              BP10_MI_BPRegression.BP10_MI_BPRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
       
       @Test(description = "BP_11 MN BP regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)

       @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection") 
       public void BP_11(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException
       { 
              String  strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId); 
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              BP11_MN_BPRegression.BP11_MN_BPRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
       
       @Test(description = "BP_12 PA BP regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)

       @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection") 
       public void BP_12(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException
       { 
              String  strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId); 
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              BP12_PA_BPRegression.BP12_PA_BPRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
       @Test(description = "BP_13 WI BP regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)

       @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection") 
       public void BP_13(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException
       { 
              String  strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId); 
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              BP13_WIServiceCenter_BPRegression.BP13_WIServiceCenter_BPRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
       @Test(description = "BP_14 AZ BP regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)

       @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection") 
       public void BP_14(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException
       { 
              String  strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId); 
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              BP14_AZ_BPRegression.BP14_AZ_BPRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
}



