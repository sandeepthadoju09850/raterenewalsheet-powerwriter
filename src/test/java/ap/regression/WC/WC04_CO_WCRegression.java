package ap.regression.WC;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

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
import ap.pages.CP.CP_ExtendedNamedInsured;
import ap.pages.CP.CP_GenInfo;
import ap.pages.CP.CP_Locations;
import ap.pages.CP.CP_PremiumIndication;
import ap.pages.CP.CP_Summary;
import ap.pages.WC.WC_IndividualsIncluded;
import ap.pages.WC.WC_OtherStateInsurance;
import ap.pages.WC.WC_PolicyInformation;
import ap.pages.WC.WC_PremiumModification;
import ap.pages.WC.WC_RatingClassifications;
import ap.pages.WC.WC_StateRatingFactors;
import ap.pages.WC.WC_UWQuestions;
import ap.pages.common.APPW_CommonMethods;
import ap.pages.common.AP_Login;

public class WC04_CO_WCRegression extends BaseTest {

	ExtentReports extent;
	ExtentTest test;
	static String quote;
	static String PolicyNumber = "";

	
	@SuppressWarnings("unused")
	public static void WC04_CO_WCRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,String strRegressionName, File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		{
			JavascriptExecutor executor = (JavascriptExecutor) se.driver();
			CommonAPMethods BT=TestPageFactory.initElements(se, CommonAPMethods.class);
			OR_CP ORCP = TestPageFactory.initElements(se, OR_CP.class);
			AP_Login  LoginPage = TestPageFactory.initElements(se, AP_Login.class);
			CP_GenInfo CP_GenInfo = TestPageFactory.initElements(se, CP_GenInfo.class);
			CP_ExtendedNamedInsured CP_ExtendedNamedInsured = TestPageFactory.initElements(se, CP_ExtendedNamedInsured.class);
			CP_Locations CP_Locations = TestPageFactory.initElements(se, CP_Locations.class);
			WC_PolicyInformation WC_PolicyInformation=TestPageFactory.initElements(se, WC_PolicyInformation.class);
			WC_StateRatingFactors WC_StateRatingFactors=TestPageFactory.initElements(se, WC_StateRatingFactors.class);
			WC_RatingClassifications WC_RatingClassifications=TestPageFactory.initElements(se, WC_RatingClassifications.class);
			WC_PremiumModification WC_PremiumModification=TestPageFactory.initElements(se, WC_PremiumModification.class);
			CP_PremiumIndication CP_PremiumIndication=TestPageFactory.initElements(se, CP_PremiumIndication.class);
			WC_UWQuestions WC_UWQuestions=TestPageFactory.initElements(se, WC_UWQuestions.class);
			CP_BillingInformation CP_BillingInformation=TestPageFactory.initElements(se, CP_BillingInformation.class);
			CP_Summary CP_Summary=TestPageFactory.initElements(se, CP_Summary.class);
			APPW_CommonMethods APPW_CommonMethods=TestPageFactory.initElements(se, APPW_CommonMethods.class);
			WC_IndividualsIncluded WC_IndividualsIncluded = TestPageFactory.initElements(se, WC_IndividualsIncluded.class);
			WC_OtherStateInsurance WC_OtherStateInsurance = TestPageFactory.initElements(se, WC_OtherStateInsurance.class);
			CP_AccountClearance CP_AccountClearance = TestPageFactory.initElements(se, CP_AccountClearance.class);
			
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
						//CP_AccountClearance.CP_AccountClearance_Details(strRegressionID, transaction, suspendSheet, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs, test);
						CP_ExtendedNamedInsured.CP_ExtendedNamedInsured_Details(strRegressionID, transaction, suspendSheet, strAgentLink,strLOB,strRelease_SelectRelease,strRole_SelectRoleAs, test);
						CP_Locations.CP_Locations_Details(strRegressionID, transaction, suspendSheet, strAgentLink,strLOB,strRelease_SelectRelease,strRole_SelectRoleAs, test);
						quote=APPW_CommonMethods.getQuoteNumber(strRegressionID,test);
						WC_PolicyInformation.WC_PolicyInformation_Details(strRegressionID, transaction, suspendSheet, test);
						WC_StateRatingFactors.WC_StateRatingFactors_Details(strRegressionID, transaction, suspendSheet, test);
						WC_RatingClassifications.WC_RatingClassifications_Details(strRegressionID, transaction, suspendSheet, test);
						CP_PremiumIndication.CP_PremiumIndication_Details(strRegressionID, transaction, suspendSheet, test);
						
					
					}
					if (transactionsList.contains("RedoNewQuote")) {
						transaction = "RedoNewQuote";
						String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
						BT.NavigateToTabs("Locations",test);
						CP_Locations.CP_Locations_Details(strRegressionID, transaction, suspendSheet, strAgentLink,strLOB,strRelease_SelectRelease,strRole_SelectRoleAs, test);
						BT.ClickContinue(test);
						WC_StateRatingFactors.WC_StateRatingFactors_Details(strRegressionID, transaction, suspendSheet, test);
						WC_RatingClassifications.WC_RatingClassifications_Details(strRegressionID, transaction, suspendSheet, test);
						CP_PremiumIndication.CP_PremiumIndication_Details(strRegressionID, transaction, suspendSheet, test);
						WC_PremiumModification.WC_PremiumModification_Details(strRegressionID, transaction, suspendSheet, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs, test);
						WC_IndividualsIncluded.WC_IndividualsIncluded_Details(strRegressionID, transaction, suspendSheet, test);
						WC_UWQuestions.WC_UnderWriter_Details(strRegressionID, transaction, suspendSheet, test);
						WC_OtherStateInsurance.WC_OtherStateInsurance_Details(strRegressionID, transaction, suspendSheet, test);
						BT.ClickContinue(test);
						CP_BillingInformation.CP_BillingInformation_Details(strRegressionID, transaction, suspendSheet, test);
						CP_Summary.CP_Summary_Details(strRegressionID,strRegressionName, transaction, suspendSheet, strAgentLink, "N/A", strRelease_SelectRelease, strRole_SelectRoleAs,quote, test, file,  workbook);
											
					}
					
					
					if (transactionsList.contains("BookPolicyInPW")) {
						 transaction = "BookPolicyInPW";
						String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
						test.log(LogStatus.INFO, "Bizlink Elapsed Time", "<b>Started Time : "+test.getStartedTime()+"<br> <b>Ended Time : "+Util.getTime()+"<br> <b>Time Taken : "+Util.DiffInTime(test.getStartedTime(), Util.getTime())); 
						Date PWstartTime = Util.getTime();
						LoginPage.APAppLogin(strRegressionID,   transaction,"No", test);
						APPW_CommonMethods.PW_Search_Details(test,quote,"WC");
						APPW_CommonMethods.getDashboardActions(strRegressionID, transaction, suspendSheet, test);
						APPW_CommonMethods.getCalculatePremium(strRegressionID,"N/A", transaction, test);
						PolicyNumber = APPW_CommonMethods.retrievePolicyNumber(test);APPW_CommonMethods.getCalculatePremium(strRegressionID,"N/A", "PWConvertToPolicy", test);
						CP_Summary.CP_Summary_Details(strRegressionID,strRegressionName, transaction, suspendSheet, strAgentLink, "N/A", strRelease_SelectRelease, strRole_SelectRoleAs,PolicyNumber, test, file,  workbook);
						APPW_CommonMethods.getCompleteTransaction(strRegressionID, transaction, test);
						APPW_CommonMethods.getDashboardActions(strRegressionID, "PWConvertToPolicy", suspendSheet, test);
						test.log(LogStatus.INFO, "PW Elapsed Time", "<b>Started Time : "+PWstartTime+"<br> <b>Ended Time : "+Util.getTime()+"<br> <b>Time Taken : "+Util.DiffInTime(PWstartTime, Util.getTime()));
					}
					
					if (transactionsList.contains("PolicyIssuanceOnAP")) {
						 transaction = "PolicyIssuanceOnAP";
						String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
						Date PolicyVerificationstartTime = Util.getTime();
						LoginPage.APAppLogin(strRegressionID,   transaction,"No", test);
						APPW_CommonMethods.APSearchPolicyNumber(PolicyNumber,test);
						CP_Summary.CP_Summary_Details(strRegressionID,strRegressionName, transaction, suspendSheet, strAgentLink, "N/A", strRelease_SelectRelease, strRole_SelectRoleAs,PolicyNumber, test, file,  workbook);
						test.log(LogStatus.INFO, "Elapsed Time for PolicyVerification in Bizlink", "<b>Started Time : "+PolicyVerificationstartTime+"<br> <b>Ended Time : "+Util.getTime()+"<br> <b>Time Taken : "+Util.DiffInTime(PolicyVerificationstartTime, Util.getTime())); 
					}
					
					iteration++;

				}
			}
			catch (Exception e) {
				e.printStackTrace();
				se.verify().verifyEquals("WC04_CO_WCRegression test  failed", true, false, true, test);
				testTearDown(se,test);
			}

		}
	}
}

