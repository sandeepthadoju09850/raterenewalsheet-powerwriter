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
import ap.pages.CA.CA_PremiumModification;
import ap.pages.CA.CA_Underwriter;
import ap.pages.CP.CP_AccountClearance;
import ap.pages.CP.CP_BillingInformation;
import ap.pages.CP.CP_BuildingandOccupantSelection;
import ap.pages.CP.CP_BulidingDetails;
import ap.pages.CP.CP_CoverageParts;
import ap.pages.CP.CP_GenInfo;
import ap.pages.CP.CP_LiabilityAdditonalInterests;
import ap.pages.CP.CP_Liablityclasses;
import ap.pages.CP.CP_Locations;
import ap.pages.CP.CP_LossHistoryExpRating;
import ap.pages.CP.CP_PremiumIndication;
import ap.pages.CP.CP_PropertyCoverages;
import ap.pages.CP.CP_Summary;
import ap.pages.common.APPW_CommonMethods;
import ap.pages.common.AP_Login;

public class Functional_06_SL_GLClassDefaults_BasketballLeagues extends BaseTest{
	ExtentReports extent;
	ExtentTest test;
	static String quote;
	static String PolicyNumber = "";

	@SuppressWarnings("unused")
	public static void SL_GLClassDefaults_BasketballLeagues(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,String strRegressionName, File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		{
			JavascriptExecutor executor = (JavascriptExecutor) se.driver();

			CommonAPMethods BT=TestPageFactory.initElements(se, CommonAPMethods.class);
			OR_CP ORCP = TestPageFactory.initElements(se, OR_CP.class);
			AP_Login  LoginPage = TestPageFactory.initElements(se, AP_Login.class);
			CP_GenInfo CP_GenInfo = TestPageFactory.initElements(se, CP_GenInfo.class);
			CP_AccountClearance CP_AccountClearance = TestPageFactory.initElements(se, CP_AccountClearance.class);
			CP_Locations CP_Locations = TestPageFactory.initElements(se, CP_Locations.class);
			CP_LiabilityAdditonalInterests CP_LiabilityAdditonalInterests=TestPageFactory.initElements(se, CP_LiabilityAdditonalInterests.class);
			CP_PremiumIndication CP_PremiumIndication=TestPageFactory.initElements(se, CP_PremiumIndication.class);
			CP_LossHistoryExpRating CP_LossHistoryExpRating=TestPageFactory.initElements(se, CP_LossHistoryExpRating.class);
			CA_Underwriter CA_Underwriter=TestPageFactory.initElements(se, CA_Underwriter.class);
			CP_BillingInformation CP_BillingInformation=TestPageFactory.initElements(se, CP_BillingInformation.class);
			CP_Summary CP_Summary=TestPageFactory.initElements(se, CP_Summary.class);
			APPW_CommonMethods APPW_CommonMethods=TestPageFactory.initElements(se, APPW_CommonMethods.class);
			CA_PremiumModification CA_PremiumModification=TestPageFactory.initElements(se, CA_PremiumModification.class);
			CP_BuildingandOccupantSelection CP_BandOS = TestPageFactory.initElements(se, CP_BuildingandOccupantSelection.class);
			CP_BulidingDetails CP_BulidingDetails = TestPageFactory.initElements(se, CP_BulidingDetails.class);
			CP_PropertyCoverages CP_PropertyCoverages = TestPageFactory.initElements(se, CP_PropertyCoverages.class);
			CP_CoverageParts CP_CoverageParts = TestPageFactory.initElements(se, CP_CoverageParts.class);
			CP_Liablityclasses CP_Liablityclasses=TestPageFactory.initElements(se, CP_Liablityclasses.class);
			
			try {
				String transaction = "NewQuote";
				List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
				List<Map<String, String>> table = ExcelOperations.getPagesData(constants.loginPageName, strRegressionID,transaction);

				int iteration = 0;
				while (iteration < table.size()) {
					System.out.println(table.size());
					LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
					String strAgentLink = (String) row.get("AgentLink");
					String strLOB = (String) row.get("LOB_Select");
					String strRole_SelectRoleAs = (String) row.get("Select_RoleAs");
					String strRelease_SelectRelease = (String) row.get("Select_Release");

					if (transactionsList.contains("NewQuote")) {
						transaction = "NewQuote";
						String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
						
						LoginPage.APAppLogin(strRegressionID,   transaction,"Yes", test);
						CP_GenInfo.CP_GenInfo_Details(strRegressionID, transaction, suspendSheet, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs, test);
						CP_AccountClearance.CP_AccountClearance_Details(strRegressionID, transaction, suspendSheet, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs, test);
						quote=APPW_CommonMethods.getQuoteNumber(strRegressionID,test);
						CP_CoverageParts.CP_CoverageParts_Details(strRegressionID, transaction, suspendSheet, test);
						CP_Locations.CP_Locations_Details(strRegressionID, transaction, suspendSheet, strAgentLink,strLOB,strRelease_SelectRelease,strRole_SelectRoleAs, test);
						BT.ClickContinue(test);
						CP_Liablityclasses.CP_Liablityclasses_Details(strRegressionID, transaction, suspendSheet, test);
						APPW_CommonMethods.Verify(test,"LiabilityOptions","//h3[contains(text(),'Liability Options')]");
						LoginPage.APLogoutDetails( strAgentLink,test );
					
					}
					
					
					iteration++;

				}
			}
			catch (Exception e) {
				e.printStackTrace();
				se.verify().verifyEquals("Functional_06_SL_GLClassDefaults_BasketballLeagues test failed", true, false, true, test);
				  test.setEndedTime(Util.getTime());
				  testTearDown(se,test);
			}






		}




	}








}
