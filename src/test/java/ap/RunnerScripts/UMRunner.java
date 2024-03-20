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

import ap.regression.UM.CU13_CO_CURegression;
import ap.regression.UM.CU14_KY_CURegression;
import ap.regression.UM.CU15_WI_CURegression;

//import ap.regression.UM.CU16_PA_CURegression;


public class UMRunner extends BaseTest {
	
	 XSSFWorkbook workbook = null;
     String premiumsFilePath;
     File premiumsFile;

     String RegressionName = "";
     ExtentReports extent;

     @BeforeSuite()
     public void beforeSuite() {
            extent = ExtentManager.getInstance();
            premiumsFilePath = ExtentManager.getPremiumsFile()+ "\\PremiumSummaryReport_UM.xlsx";
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
    
    
     @Test(description = "CU_13 CO CU Regression testing", dataProvider ="browserXlsByRowBL", groups = {"AgencyPortal" }, timeOut = 500000000,priority=1)

     @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
     public void CU_13(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
     { 
            String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
            String RegressionName = Util.getBLRegressionName(strRegressionId); 
            ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
            CU13_CO_CURegression.CU13_CO_CURegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
            test.setEndedTime(Util.getTime());  
     }
     @Test(description = "CU_14 KY CU Regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000,priority=1)

     @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
     public void CU_14(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
     { 
            String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
            String RegressionName = Util.getRegressionName(strRegressionId); 
            ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
            CU14_KY_CURegression.CU14_KY_CURegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
            test.setEndedTime(Util.getTime());  
     }
     @Test(description = "CU_15 WI CU Regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000,priority=1)

     @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
     public void CU_15(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
     { 
            String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
            String RegressionName = Util.getRegressionName(strRegressionId); 
            ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
            CU15_WI_CURegression.CU15_WI_CURegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
            test.setEndedTime(Util.getTime());  
     }
   
}
