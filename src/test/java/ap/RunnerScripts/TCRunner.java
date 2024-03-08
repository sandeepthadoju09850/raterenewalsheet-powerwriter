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
import ap.regression.TC.TC01_IA_TCRegression;
import ap.regression.TC.TC02_KS_TCRegression;
import ap.regression.TC.TC03_MO_TCRegression;
import ap.regression.TC.TC04_ND_TCRegression;
import ap.regression.TC.TC05_CO_TCRegression;
import ap.regression.TC.TC06_IL_TCRegression;
import ap.regression.TC.TC07_KY_TCRegression;
import ap.regression.TC.TC08_WI_TCRegression;
import ap.regression.TC.TC09_IN_TCRegression;
import ap.regression.TC.TC10_MI_TCRegression;
import ap.regression.TC.TC11_MN_TCRegression;
import ap.regression.TC.TC12_PA_TCRegression;
import ap.regression.TC.TC13_MNServiceCenter_TCRegression;
import ap.regression.TC.TC14_AZ_TCRegression;

public class TCRunner extends BaseTest {

       XSSFWorkbook workbook = null;
       String premiumsFilePath;
       File premiumsFile;

       String RegressionName = "";
       ExtentReports extent;

       @BeforeSuite()
       public void beforeSuite() {
              extent = ExtentManager.getInstance();
              premiumsFilePath = ExtentManager.getPremiumsFile()+ "\\PremiumSummaryReport_TC.xlsx";
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

       @Test(description = "TC_01 IA TC regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)

       @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection") 
       public void TC_01(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException
       { 
              String  strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId); 
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              TC01_IA_TCRegression.TC01_IA_TCRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
       
       @Test(description = "TC_02 KS TC regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)

       @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection") 
       public void TC_02(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException
       { 
              String  strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId); 
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              TC02_KS_TCRegression.TC02_KS_TCRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
       

       @Test(description = "TC_03 MO TC regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)

       @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection") 
       public void TC_03(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException
       { 
              String  strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId); 
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              TC03_MO_TCRegression.TC03_MO_TCRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
       
       @Test(description = "TC_04 ND TC regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)

       @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection") 
       public void TC_04(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException
       { 
              String  strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId); 
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              TC04_ND_TCRegression.TC04_ND_TCRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
      

       @Test(description = "TC_05 CO TC regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)

       @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection") 
       public void TC_05(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException
       { 
              String  strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId); 
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              TC05_CO_TCRegression.TC05_CO_TCRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
       
       @Test(description = "TC_06 IL TC regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)

       @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection") 
       public void TC_06(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException
       { 
              String  strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId); 
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              TC06_IL_TCRegression.TC06_IL_TCRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
       
       @Test(description = "TC_07 KY TC regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)

       @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection") 
       public void TC_07(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException
       { 
              String  strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId); 
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              TC07_KY_TCRegression.TC07_KY_TCRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
       
       @Test(description = "TC_08 WI TC regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)

       @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection") 
       public void TC_08(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException
       { 
              String  strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId); 
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              TC08_WI_TCRegression.TC08_WI_TCRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }

     
       @Test(description = "TC_09 IN TC regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)

       @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection") 
       public void TC_09(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException
       { 
              String  strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId); 
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              TC09_IN_TCRegression.TC09_IN_TCRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
       
       @Test(description = "TC_10 MI TC regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)

       @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection") 
       public void TC_10(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException
       { 
              String  strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId); 
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              TC10_MI_TCRegression.TC10_MI_TCRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
       
       @Test(description = "TC_11 MN TC regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)

       @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection") 
       public void TC_11(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException
       { 
              String  strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId); 
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              TC11_MN_TCRegression.TC11_MN_TCRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
       
       @Test(description = "TC_12 PA TC regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)

       @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection") 
       public void TC_12(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException
       { 
              String  strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId); 
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              TC12_PA_TCRegression.TC12_PA_TCRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
       @Test(description = "TC_13 MN TC regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)

       @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection") 
       public void TC_13(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException
       { 
              String  strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId); 
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              TC13_MNServiceCenter_TCRegression.TC13_MNServiceCenter_TCRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }
       @Test(description = "TC_14 AZ TC regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal","Smoke" }, timeOut = 500000000)

       @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new", sheetName = "Scenario_Selection") 
       public void TC_14(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException
       { 
              String  strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
              String RegressionName = Util.getRegressionName(strRegressionId); 
              ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " + RegressionName);
              TC14_AZ_TCRegression.TC14_AZ_TCRegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
              test.setEndedTime(Util.getTime());
       }

}



