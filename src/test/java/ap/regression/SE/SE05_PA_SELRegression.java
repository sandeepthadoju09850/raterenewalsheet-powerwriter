package ap.regression.SE;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

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
import ap.pages.CP.CP_AdditionalCoverageParts;
import ap.pages.CP.CP_BillingInformation;
import ap.pages.CP.CP_BuildingandOccupantSelection;
import ap.pages.CP.CP_BulidingDetails;
import ap.pages.CP.CP_CarrierInformation;
import ap.pages.CP.CP_ContractorsEquipmentScheduled;
import ap.pages.CP.CP_CoverageParts;
import ap.pages.CP.CP_CrimeCoverageSelection;
import ap.pages.CP.CP_ExtendedNamedInsured;
import ap.pages.CP.CP_GenInfo;
import ap.pages.CP.CP_InlandMarineCovSelection;
import ap.pages.CP.CP_LiabilityAdditonalInterests;
import ap.pages.CP.CP_LiabilityOptions;
import ap.pages.CP.CP_Liablityclasses;
import ap.pages.CP.CP_Liablitycoverages;
import ap.pages.CP.CP_Locations;
import ap.pages.CP.CP_LossHistoryExpRating;
import ap.pages.CP.CP_OptionalPropertyCoverages;
import ap.pages.CP.CP_PremiumIndication;
import ap.pages.CP.CP_PremiumModification;
import ap.pages.CP.CP_PropertyAdditionalInterests;
import ap.pages.CP.CP_PropertyCoverages;
import ap.pages.CP.CP_Summary;
import ap.pages.SE.SE_SpecialEventCoverages;
import ap.pages.SE.SE_Summary;
import ap.pages.SE.SE_UnderWriter;
import ap.pages.common.APPW_CommonMethods;
import ap.pages.common.AP_Login;

public class SE05_PA_SELRegression extends BaseTest{
	ExtentReports extent;
	ExtentTest test;
	static String PolicyNumber = "";
	static String quote="";


	@SuppressWarnings("unused")
	public static void SE05_PA_SELRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,String strRegressionName, File file,XSSFWorkbook workbook, ExtentTest test) throws IOException 
	{
		CommonAPMethods BT=TestPageFactory.initElements(se, CommonAPMethods.class);
		AP_Login  LoginPage = TestPageFactory.initElements(se, AP_Login.class);
		CP_GenInfo CP_GenInfo = TestPageFactory.initElements(se, CP_GenInfo.class);

		CP_Locations CP_Locs = TestPageFactory.initElements(se, CP_Locations.class);
		SE_SpecialEventCoverages SE_SpecialEventCoverages = TestPageFactory.initElements(se, SE_SpecialEventCoverages.class);
		
		CP_LiabilityAdditonalInterests CP_LiabilityAdditonalInterests = TestPageFactory.initElements(se, CP_LiabilityAdditonalInterests.class);
		SE_UnderWriter SE_UnderWritter=TestPageFactory.initElements(se, SE_UnderWriter.class);
		CP_Summary CP_Summary=TestPageFactory.initElements(se, CP_Summary.class);
		SE_Summary SE_Summary=TestPageFactory.initElements(se, SE_Summary.class);
		CP_ExtendedNamedInsured CP_ExtendedNamedInsured = TestPageFactory.initElements(se, CP_ExtendedNamedInsured.class);
		APPW_CommonMethods APPW_CommonMethods=TestPageFactory.initElements(se, APPW_CommonMethods.class);

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
					CP_ExtendedNamedInsured.CP_ExtendedNamedInsured_Details(strRegressionID, transaction, suspendSheet, strAgentLink,strLOB,strRelease_SelectRelease,strRole_SelectRoleAs, test);
					CP_Locs.CP_Locations_Details(strRegressionID, transaction, suspendSheet, strAgentLink,strLOB,strRelease_SelectRelease,strRole_SelectRoleAs, test);
					quote=APPW_CommonMethods.getQuoteNumber(strRegressionID,test);
					SE_SpecialEventCoverages.SE_SpecialEventCoverages_Details(strRegressionID, transaction, suspendSheet, test);
					CP_LiabilityAdditonalInterests.CP_LiabilityAdditonalInterests_Details(strRegressionID, transaction, suspendSheet, test);
					
				}
				if (transactionsList.contains("RedoNewQuote")) {
					transaction = "RedoNewQuote";
					String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
					
					BT.NavigateToTabs("General Information",test);
					CP_GenInfo.CP_GenInfo_Details(strRegressionID, transaction, suspendSheet, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs, test);
					BT.NavigateToTabs("Special Event Coverages",test);
					SE_SpecialEventCoverages.SE_SpecialEventCoverages_Details(strRegressionID, transaction, suspendSheet, test);
					BT.ClickContinue(test);
					SE_UnderWritter.SE_UnderWriter_Details(strRegressionID, transaction, suspendSheet, test);
					SE_Summary.SE_Summary_Details(strRegressionID,strRegressionName, transaction, suspendSheet, strAgentLink, "N/A", strRelease_SelectRelease, strRole_SelectRoleAs,quote, test, file,  workbook);
					LoginPage.APLogoutDetails(strAgentLink, test);


				}
				

				if (transactionsList.contains("BookPolicyInPW")) {
					 transaction = "BookPolicyInPW";
					String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
					test.log(LogStatus.INFO, "Bizlink Elapsed Time", "<b>Started Time : "+test.getStartedTime()+"<br> <b>Ended Time : "+Util.getTime()+"<br> <b>Time Taken : "+Util.DiffInTime(test.getStartedTime(), Util.getTime())); 
					Date PWstartTime = Util.getTime();
					LoginPage.APAppLogin(strRegressionID,   transaction,"No", test);
					APPW_CommonMethods.PW_Search_Details(test,quote,"N/A");
					APPW_CommonMethods.getDashboardForms(strRegressionID, transaction, suspendSheet, test);
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
			se.verify().verifyEquals("SE05_PA_SERegression test  failed", true, false, test);
			testTearDown(se,test);
		}
	}
}


