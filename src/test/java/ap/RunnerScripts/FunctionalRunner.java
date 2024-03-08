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
import ap.regression.Functional.Functional_01_CA_MelissaLookupPartialMatch;
import ap.regression.Functional.Functional_02_WC_MelissaLookupExactMatch;
import ap.regression.Functional.Functional_03_SL_MelissaLookupNoMatch;
import ap.regression.Functional.Functional_07_TC_GLClassDefaults_ElectricalWiringWithinBuildings;
import ap.regression.Functional.Functional_08_SL_PropertyCovDefaults_WindHailDeductible_Checked;
import ap.regression.Functional.Functional_09_TC_PropertyCovDefaults_WindHailDeductible_Checked;
import ap.regression.Functional.Functional_10_TC_PropertyCovDefaults_WindHailDeductible_UnChecked;
import ap.regression.Functional.Functional_11_SL_PropertyCovDefaults_RoofSurfacingActualCashValue_Checked;
import ap.regression.Functional.Functional_12_SL_PropertyCovDefaults_MineSubsidence_UnChecked;
import ap.regression.Functional.Functional_13_TC_PropertyCovDefaults_MineSubsidence_UnChecked;
import ap.regression.Functional.Functional_14_SL_PropertyCovDefaults_MineSubsidence_ShouldNotDisplay;
import ap.regression.Functional.Functional_15_SL_PropertyCovDefaults_RoofSurfacingCosmeticLossExclusion_Checked;
import ap.regression.Functional.Functional_16_CU_GuidesOutfitters_GLLimits;
//import ap.regression.Functional.Functional_16_CU_GuidesOutfitters_GLLimits;
import ap.regression.Functional.Functional_17_CU_TreePrune_QuoteNA;
import ap.regression.Functional.Functional_19_CP_Workflow_CloseSubmission;
import ap.regression.Functional.Functional_20_TC_WorkFlow_UWApprove;
import ap.regression.Functional.Functional_21_TC_WorkFlow_UWDecline;
import ap.regression.Functional.Functional_22_SL_ISO_ExactMatch_IntUser;
import ap.regression.Functional.Functional_23_SL_ISO_NoMatch_IntUser;
import ap.regression.Functional.Functional_24_TC_ISO_ExactMatch_ExtUser;
import ap.regression.Functional.Functional_25_TC_ISO_NoMatch_ExtUser;
import ap.regression.Functional.Functional_26_CA_SL_NonFleet;
import ap.regression.Functional.Functional_27_CA_TC_PolicyCovBehavior;
import ap.regression.Functional.Functional_28_CA_SL_Fleet;
import ap.regression.Functional.Functional_29_CA_TC_Fleet;
import ap.regression.Functional.Functional_30_SL_KYTax;
import ap.regression.Functional.Functional_31_TC_KYTax;
import ap.regression.Functional.Functional_32_SL_RatingAndMapping;
import ap.regression.Functional.Functional_33_SE_RatingAndMapping;
import ap.regression.Functional.Functional_34_SL_RatingAndMapping;
import ap.regression.Functional.Functional_37_CU_RatingAndMapping;
import ap.regression.Functional.Functional_04_SL_GLClassDefaults_PestControl;
import ap.regression.Functional.Functional_05_SL_GLClassDefaults_TreePruning;
import ap.regression.Functional.Functional_06_SL_GLClassDefaults_BasketballLeagues;

public class FunctionalRunner extends BaseTest {


    XSSFWorkbook workbook = null;
    String premiumsFilePath;
    File premiumsFile;

    String RegressionName = "";
    ExtentReports extent;

    @BeforeSuite()
    public void beforeSuite() throws IOException {
           extent = ExtentManager.getInstance();
           premiumsFilePath = ExtentManager.getPremiumsFile()+ "\\PremiumSummaryReport_Functional.xlsx";
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


    
    @Test(description = "Functional_01_CA_MelissaLookupPartialMatch testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_01(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
           Functional_01_CA_MelissaLookupPartialMatch.CA_MelissaLookupPartialMatch(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    @Test(description = "Functional_02_WC_MelissaLookupExactMatch testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_02(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
           Functional_02_WC_MelissaLookupExactMatch.WC_MelissaLookupExactMatch(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    
    @Test(description = "Functional_03_SL_MelissaLookupNoMatch testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_03(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName);
           Functional_03_SL_MelissaLookupNoMatch.SL_MelissaLookupNoMatch(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    
    @Test(description = "Functional_04_SL_GLClassDefaults_PestControl testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_04(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_04_SL_GLClassDefaults_PestControl.SL_GLClassDefaults_PestControl(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    @Test(description = "Functional_05_SL_GLClassDefaults_TreePruning testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_05(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_05_SL_GLClassDefaults_TreePruning.SL_GLClassDefaults_TreePruning(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    
    @Test(description = "Functional_06_SL_GLClassDefaults_BasketballLeagues testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_06(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_06_SL_GLClassDefaults_BasketballLeagues.SL_GLClassDefaults_BasketballLeagues(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    @Test(description = "Functional_07_TC_GLClassDefaults_ElectricalWiringWithinBuildings testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_07(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_07_TC_GLClassDefaults_ElectricalWiringWithinBuildings.TC_GLClassDefaults_ElectricalWiringWithinBuildings(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    
    @Test(description = "Functional_08_SL_PropertyCovDefaults_WindHailDeductible_Checked testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_08(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_08_SL_PropertyCovDefaults_WindHailDeductible_Checked.SL_PropertyCovDefaults_WindHailDeductible_Checked(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    
    @Test(description = "Functional_09_TC_PropertyCovDefaults_WindHailDeductible_Checked testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_09(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_09_TC_PropertyCovDefaults_WindHailDeductible_Checked.TC_PropertyCovDefaults_WindHailDeductible_Checked(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    
    @Test(description = "Functional_10_TC_PropertyCovDefaults_WindHailDeductible_UnChecked testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_10(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_10_TC_PropertyCovDefaults_WindHailDeductible_UnChecked.TC_PropertyCovDefaults_WindHailDeductible_UnChecked(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    
    @Test(description = "Functional_11_SL_PropertyCovDefaults_RoofSurfacingActualCashValue_Checked testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_11(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_11_SL_PropertyCovDefaults_RoofSurfacingActualCashValue_Checked.SL_PropertyCovDefaults_RoofSurfacingActualCashValue_Checked(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    
    @Test(description = "Functional_12_SL_PropertyCovDefaults_MineSubsidence_UnChecked testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_12(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_12_SL_PropertyCovDefaults_MineSubsidence_UnChecked.SL_PropertyCovDefaults_MineSubsidence_UnChecked(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    
    @Test(description = "Functional_13_TC_PropertyCovDefaults_MineSubsidence_UnChecked testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_13(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_13_TC_PropertyCovDefaults_MineSubsidence_UnChecked.TC_PropertyCovDefaults_MineSubsidence_UnChecked(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }  
    
    @Test(description = "Functional_14_SL_PropertyCovDefaults_MineSubsidence_ShouldNotDisplay testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_14(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_14_SL_PropertyCovDefaults_MineSubsidence_ShouldNotDisplay.SL_PropertyCovDefaults_MineSubsidence_ShouldNotDisplay(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    
    @Test(description = "Functional_15_SL_PropertyCovDefaults_RoofSurfacingCosmeticLossExclusion_Checked testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_15(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_15_SL_PropertyCovDefaults_RoofSurfacingCosmeticLossExclusion_Checked.SL_PropertyCovDefaults_RoofSurfacingCosmeticLossExclusion_Checked(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    
    @Test(description = "Functional_16_CU_GuidesOutfitters_GLLimits testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_16(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_16_CU_GuidesOutfitters_GLLimits.CU_GuidesOutfitters_GLLimits(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    
    @Test(description = "Functional_17 CU_TreePrune_QuoteNA testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_17(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_17_CU_TreePrune_QuoteNA.CU_TreePrune_QuoteNA(myBrowser, se,params, strRegressionId, RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    @Test(description = "Functional_19 CP_Workflow_CloseSubmission testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 

    public void Functional_19(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_19_CP_Workflow_CloseSubmission.CP_Workflow_CloseSubmission(myBrowser, se,params, strRegressionId, RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    
     @Test(description = "Functional_20 TC_WorkFlow_UWApprove testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_20(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_20_TC_WorkFlow_UWApprove.TC_WorkFlow_UWApprove(myBrowser, se,params, strRegressionId, RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    
    @Test(description = "Functional_21 TC_WorkFlow_UWDecline testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_21(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_21_TC_WorkFlow_UWDecline.TC_WorkFlow_UWDecline(myBrowser, se,params, strRegressionId, RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }

    @Test(description = "Functional_22_SL_ISO_ExactMatch_IntUser testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_22(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_22_SL_ISO_ExactMatch_IntUser.SL_ISO_ExactMatch_IntUser(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    @Test(description = "Functional_23_SL_ISO_NoMatch_IntUser testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_23(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_23_SL_ISO_NoMatch_IntUser.SL_ISO_NoMatch_IntUser(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    } @Test(description = "Functional_24_TC_ISO_ExactMatch_ExtUser testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_24(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_24_TC_ISO_ExactMatch_ExtUser.TC_ISO_ExactMatch_ExtUser(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    } @Test(description = "Functional_25_TC_ISO_NoMatch_ExtUser testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_25(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_25_TC_ISO_NoMatch_ExtUser.TC_ISO_NoMatch_ExtUser(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    @Test(description = "Functional_26_CA_SL_NonFleet testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_26(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_26_CA_SL_NonFleet.CA_SL_NonFleet(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    
    @Test(description = "Functional_27_CA_TC_PolicyCovBehavior testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_27(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_27_CA_TC_PolicyCovBehavior.CA_TC_PolicyCovBehavior(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    
    @Test(description = "Functional_28_CA_SL_Fleet testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_28(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_28_CA_SL_Fleet.CA_SL_Fleet(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    
    @Test(description = "Functional_29_CA_TC_Fleet testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_29(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_29_CA_TC_Fleet.CA_TC_Fleet(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    
    @Test(description = "Functional_30_SL_KYTax testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_30(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_30_SL_KYTax.SL_KYTax(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    
    @Test(description = "Functional_31_TC_KYTax testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_31(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_31_TC_KYTax.TC_KYTax(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    
    @Test(description = "Functional_32_SL_RatingAndMapping testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_32(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_32_SL_RatingAndMapping.SL_RatingAndMapping(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    
    @Test(description = "Functional_33_ND_RatingAndMapping testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_33(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_33_SE_RatingAndMapping.SE_RatingAndMapping(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    @Test(description = "Functional_34_SL_RatingAndMapping testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_34(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_34_SL_RatingAndMapping.SL_RatingAndMapping(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    @Test(description = "Functional_37_CU_RatingAndMapping testing", dataProvider ="browserXlsByRow", groups = {"AgencyPortal" }, timeOut = 500000000)

    @TestDataXLS(fileName ="../../resources/test_data/Scenario_Selection", sheetVersion = "new",sheetName = "Scenario_Selection") 
    public void Functional_37(Browsers myBrowser,SeHelper se, Map<String, Object> params) throws IOException 
    { 
           String strRegressionId = Thread.currentThread().getStackTrace()[1].getMethodName();
           String RegressionName = Util.getRegressionName(strRegressionId); 
           ExtentTest test = ExtentTestManager.startTest(strRegressionId + " :: " +RegressionName); 
           Functional_37_CU_RatingAndMapping.CU_RatingAndMapping(myBrowser, se,params, strRegressionId,RegressionName, premiumsFile, workbook, test);
           test.setEndedTime(Util.getTime());
           
    }
    
}
