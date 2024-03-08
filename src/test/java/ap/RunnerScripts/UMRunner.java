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
import ap.regression.UM.CU01_CO_CURegression;
import ap.regression.UM.CU02_IA_CURegression;
import ap.regression.UM.CU03_KY_CURegression;
import ap.regression.UM.CU04_WI_CURegression;
import ap.regression.UM.CU05_MO_CURegression;
import ap.regression.UM.CU06_IA_CURegression;
import ap.regression.UM.CU07_IN_CURegression;
import ap.regression.UM.CU08_CO_CURegression;
import ap.regression.UM.CU09_KS_CURegression;
import ap.regression.UM.CU10_IL_CURegression;
import ap.regression.UM.CU11_KY_CURegression;
import ap.regression.UM.CU12_WI_CURegression;
import ap.regression.UM.CU13_CO_CURegression;
import ap.regression.UM.CU14_KY_CURegression;
import ap.regression.UM.CU15_WI_CURegression;
import ap.regression.UM.CU17_IA_CURegression;
//import ap.regression.UM.CU16_PA_CURegression;
import ap.regression.UM.CU19_KYServiceCenter_CURegression;

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
    
     @Test(description = "CU_01 CO CU Regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000,priority=1)

     @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
     public void CU_01(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
     { 
            String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
            String RegressionName = Util.getRegressionName(strRegressionId); 
            ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
            CU01_CO_CURegression.CU01_CO_CURegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
            test.setEndedTime(Util.getTime());
     }
     @Test(description = "CU_02 IA CU Regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000,priority=1)

     @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
     public void CU_02(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
     { 
            String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
            String RegressionName = Util.getRegressionName(strRegressionId); 
            ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
            CU02_IA_CURegression.CU02_IA_CURegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
            test.setEndedTime(Util.getTime());
     }
     @Test(description = "CU_03 KY CU Regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000,priority=1)

     @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
     public void CU_03(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
     { 
            String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
            String RegressionName = Util.getRegressionName(strRegressionId); 
            ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
            CU03_KY_CURegression.CU03_KY_CURegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
            test.setEndedTime(Util.getTime());
     }
     
     @Test(description = "CU_04 WI CU Regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000,priority=1)

     @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
     public void CU_04(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
     { 
            String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
            String RegressionName = Util.getRegressionName(strRegressionId); 
            ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
            CU04_WI_CURegression.CU04_WI_CURegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
            test.setEndedTime(Util.getTime());
     }

     @Test(description = "CU_05 MO CU Regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000,priority=1)

     @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
     public void CU_05(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
     { 
            String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
            String RegressionName = Util.getRegressionName(strRegressionId); 
            ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
            CU05_MO_CURegression.CU05_MO_CURegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
            test.setEndedTime(Util.getTime());
     }
     
     @Test(description = "CU_06 IA CU Regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000,priority=1)

     @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
     public void CU_06(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
     { 
            String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
            String RegressionName = Util.getRegressionName(strRegressionId); 
            ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
            CU06_IA_CURegression.CU06_IA_CURegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
            test.setEndedTime(Util.getTime());
     }
     @Test(description = "CU_07 IN CU Regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000,priority=1)

     @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
     public void CU_07(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
     { 
            String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
            String RegressionName = Util.getRegressionName(strRegressionId); 
            ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
            CU07_IN_CURegression.CU07_IN_CURegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
            test.setEndedTime(Util.getTime());
     }
     @Test(description = "CU_08 CO CU Regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000,priority=1)

     @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
     public void CU_08(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
     { 
            String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
            String RegressionName = Util.getRegressionName(strRegressionId); 
            ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
            CU08_CO_CURegression.CU08_CO_CURegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
            test.setEndedTime(Util.getTime());
     }
     @Test(description = "CU_09 KS CU Regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000,priority=1)

     @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
     public void CU_09(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
     { 
            String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
            String RegressionName = Util.getRegressionName(strRegressionId); 
            ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
            CU09_KS_CURegression.CU09_KS_CURegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
            test.setEndedTime(Util.getTime());  
     }
     @Test(description = "CU_10 IL CU Regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000,priority=1)

     @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
     public void CU_10(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
     { 
            String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
            String RegressionName = Util.getRegressionName(strRegressionId); 
            ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
            CU10_IL_CURegression.CU10_IL_CURegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
            test.setEndedTime(Util.getTime());  
     }
     @Test(description = "CU_11 KY CU Regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000,priority=1)

     @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
     public void CU_11(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
     { 
            String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
            String RegressionName = Util.getRegressionName(strRegressionId); 
            ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
            CU11_KY_CURegression.CU11_KY_CURegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
            test.setEndedTime(Util.getTime());  
     }
     @Test(description = "CU_12 WI CU Regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000,priority=1)

     @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
     public void CU_12(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
     { 
            String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
            String RegressionName = Util.getRegressionName(strRegressionId); 
            ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
            CU12_WI_CURegression.CU12_WI_CURegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
            test.setEndedTime(Util.getTime());  
     }
     @Test(description = "CU_13 CO CU Regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000,priority=1)

     @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
     public void CU_13(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
     { 
            String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
            String RegressionName = Util.getRegressionName(strRegressionId); 
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
     
    /* @Test(description = "CU_16 PA CU Regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000,priority=1)

     @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
     public void CU_16(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
     { 
            String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
            String RegressionName = Util.getRegressionName(strRegressionId); 
            ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
            CU16_PA_CURegression.CU16_PA_CURegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
            test.setEndedTime(Util.getTime());
     }*/
    /* @Test(description = "CU_17 IA CU Regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000,priority=1)

     @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
     public void CU_17(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
     { 
            String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
            String RegressionName = Util.getRegressionName(strRegressionId); 
            ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
            CU17_IA_CURegression.CU17_IA_CURegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
            test.setEndedTime(Util.getTime());
     }
    */ @Test(description = "CU_19 KY CU Regression testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000,priority=1)

     @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
     public void CU_19(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
     { 
            String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
            String RegressionName = Util.getRegressionName(strRegressionId); 
            ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
            CU19_KYServiceCenter_CURegression.CU19_KYServiceCenter_CURegressionMethod(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
            test.setEndedTime(Util.getTime());  
     }
}
