package ap.regression.Functional;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Libraries.ap.automation.common.BaseTest;
import Libraries.ap.automation.common.CommonAPMethods;
import Libraries.ap.automation.common.ExcelOperations;
import Libraries.ap.automation.common.SeHelper;
import Libraries.ap.automation.common.Utils.TestPageFactory;
import Libraries.ap.automation.common.framework.Util;
import Libraries.ap.automation.common.framework.Browser.Browsers;
import ap.Constants.constants;
import ap.OR.OR_CP;
import ap.pages.CP.CP_AccountClearance;
import ap.pages.CP.CP_BillingInformation;
import ap.pages.CP.CP_CoverageParts;
import ap.pages.CP.CP_ExtendedNamedInsured;
import ap.pages.CP.CP_GenInfo;
import ap.pages.CP.CP_LiabilityOptions;
import ap.pages.CP.CP_Liablityclasses;
import ap.pages.CP.CP_Liablitycoverages;
import ap.pages.CP.CP_Locations;
import ap.pages.CP.CP_PremiumIndication;
import ap.pages.CP.CP_Summary;
import ap.pages.CP.CP_UnderWriter;
import ap.pages.UM.UM_UnderLying;
import ap.pages.common.APPW_CommonMethods;
import ap.pages.common.AP_Login;

public class Functional_17_CU_TreePrune_QuoteNA extends BaseTest{
	ExtentReports extent;
	ExtentTest test;
	static String quote;
	

	@SuppressWarnings("unused")
	public static void CU_TreePrune_QuoteNA(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,String strRegressionName, File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		{
			JavascriptExecutor executor = (JavascriptExecutor) se.driver();

			CommonAPMethods BT=TestPageFactory.initElements(se, CommonAPMethods.class);
			OR_CP ORCP = TestPageFactory.initElements(se, OR_CP.class);
			AP_Login  LoginPage = TestPageFactory.initElements(se, AP_Login.class);
			CP_GenInfo CP_GenInfo = TestPageFactory.initElements(se, CP_GenInfo.class);
			CP_ExtendedNamedInsured CP_ExtendedNamedInsured = TestPageFactory.initElements(se, CP_ExtendedNamedInsured.class);
			APPW_CommonMethods APPW_CommonMethods=TestPageFactory.initElements(se, APPW_CommonMethods.class);
			CP_AccountClearance CP_AccountClearance = TestPageFactory.initElements(se, CP_AccountClearance.class);
			CP_CoverageParts CP_CoverageParts = TestPageFactory.initElements(se, CP_CoverageParts.class);
			CP_Locations CP_Locations = TestPageFactory.initElements(se, CP_Locations.class);
			CP_Liablitycoverages CP_Liablitycoverages=TestPageFactory.initElements(se, CP_Liablitycoverages.class);
			CP_Liablityclasses CP_Liablityclasses=TestPageFactory.initElements(se, CP_Liablityclasses.class);
			CP_LiabilityOptions CP_LiabilityOptions = TestPageFactory.initElements(se, CP_LiabilityOptions.class);
			CP_PremiumIndication CP_PremiumIndication = TestPageFactory.initElements(se, CP_PremiumIndication.class);
			CP_UnderWriter CP_UnderWritter=TestPageFactory.initElements(se, CP_UnderWriter.class);
			CP_BillingInformation CP_BillingInformation=TestPageFactory.initElements(se, CP_BillingInformation.class);
			CP_Summary CP_Summary=TestPageFactory.initElements(se, CP_Summary.class);
			UM_UnderLying  UnderLying = TestPageFactory.initElements(se, UM_UnderLying.class);
			
			
			try {
				String transaction = "NewQuote";
				String strRegressionIDUnderlined = "FunctionalSL_17";
				List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
				List<Map<String, String>> table = ExcelOperations.getPagesData(constants.loginPageName, strRegressionID,transaction);
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(0);
				String strAgentLink = (String) row.get("AgentLink");
				String strLOB = (String) row.get("LOB_Select");
				String strRole_SelectRoleAs = (String) row.get("Select_RoleAs");
				String strRelease_SelectRelease = (String) row.get("Select_Release");


				List<Map<String, String>> tableTC = ExcelOperations.getPagesData(constants.loginPageName, strRegressionIDUnderlined,transaction);
				LinkedHashMap<String, String> rowTC = (LinkedHashMap<String, String>) tableTC.get(0);
				String strAgentLinkTC = (String) rowTC.get("AgentLink");


					if (transactionsList.contains("NewQuote")) {
						transaction = "NewQuote";
						String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
						LoginPage.APAppLogin(strRegressionIDUnderlined,   transaction,"Yes", test);
						CP_GenInfo.CP_GenInfo_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLinkTC, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs, test);
						CP_CoverageParts.CP_CoverageParts_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						quote=APPW_CommonMethods.getQuoteNumber(strRegressionIDUnderlined,test);
						BT.ClickContinue(test);
						CP_Liablitycoverages.CP_Liablitycoverages_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CP_Liablityclasses.CP_Liablityclasses_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CP_LiabilityOptions.CP_LiabilityOptions_Details(strRegressionID, transaction, suspendSheet, test);
						BT.ClickContinue(test);
						BT.ClickContinue(test);
						CP_PremiumIndication.CP_PremiumIndication_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						BT.ClickContinue(test);
						BT.ClickContinue(test);
						CP_UnderWritter.CP_UnderWriter_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						BT.ClickContinue(test);
						CP_BillingInformation.CP_BillingInformation_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CP_Summary.CP_Summary_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLink, "N/A", strRelease_SelectRelease, strRole_SelectRoleAs,quote, suspendSheet, test, file, workbook);
						
					}	
					if (transactionsList.contains("NewQuote")) {
						transaction = "NewQuote";
						String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
						
						APPW_CommonMethods.openAccountDetails(test);
						APPW_CommonMethods.addNewWorkItem("Umbrella", test);
						strRegressionIDUnderlined = "Functional_17";
						UnderLying.UM_UnderLying_Details(strRegressionID, transaction, suspendSheet, test);
						}
					}
			catch (Exception e) {
				e.printStackTrace();
				se.verify().verifyEquals("Functional_16 test failed", true, false, true, test);
				  test.setEndedTime(Util.getTime());
				  testTearDown(se,test);
			}

		}

	}

}
