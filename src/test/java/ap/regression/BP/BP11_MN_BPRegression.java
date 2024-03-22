package ap.regression.BP;

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

import Libraries.automation.common.BaseTest;
import Libraries.automation.common.CommonAPMethods;
import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.SeHelper;
import Libraries.automation.common.Utils.TestPageFactory;
import Libraries.automation.common.framework.Util;
import Libraries.automation.common.framework.Browser.Browsers;
import ap.Constants.constants;
import ap.OR.BL_OR_CP;
import ap.pages.CA.CA_AdditionalCoverages;
import ap.pages.CA.CA_BusinessInterruption;
import ap.pages.CA.CA_Drivers;
import ap.pages.CA.CA_Garagekeepers;
import ap.pages.CA.CA_IndividualSchedule;
import ap.pages.CA.CA_PolicyCoverages;
import ap.pages.CA.CA_PremiumModification;
import ap.pages.CA.CA_TrailerInterchange;
import ap.pages.CA.CA_Underwriter;
import ap.pages.CA.CA_VehiclesCoverages;
import ap.pages.CP.CP_AccReceivableSchedule;
import ap.pages.CP.CP_ValuablePapers;
import ap.pages.CP.CP_AccountClearance;
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
import ap.pages.CP.CP_SignsScheduleInfo;
import ap.pages.CP.CP_Summary;
import ap.pages.CP.CP_UnderWriter;
import ap.pages.common.APPW_CommonMethods;
import ap.pages.common.AP_Login;

public class BP11_MN_BPRegression extends BaseTest{
	ExtentReports extent;
	ExtentTest test;
	static String quote;
	static String PolicyNumber = "";

	@SuppressWarnings("unused")
	public static void BP11_MN_BPRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,String strRegressionName, File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		{
			JavascriptExecutor executor = (JavascriptExecutor) se.driver();

			CommonAPMethods BT=TestPageFactory.initElements(se, CommonAPMethods.class);
			BL_OR_CP ORCP = TestPageFactory.initElements(se, BL_OR_CP.class);
			AP_Login  LoginPage = TestPageFactory.initElements(se, AP_Login.class);
			CP_GenInfo CP_GenInfo = TestPageFactory.initElements(se, CP_GenInfo.class);
			CP_ExtendedNamedInsured CP_ExtendedNamedInsured = TestPageFactory.initElements(se, CP_ExtendedNamedInsured.class);
			CP_CoverageParts CP_CoverageParts = TestPageFactory.initElements(se, CP_CoverageParts.class);
			CP_Locations CP_Locations = TestPageFactory.initElements(se, CP_Locations.class);
			CP_BuildingandOccupantSelection CP_BandOS = TestPageFactory.initElements(se, CP_BuildingandOccupantSelection.class);
			CP_BulidingDetails CP_BulidingDetails = TestPageFactory.initElements(se, CP_BulidingDetails.class);
			CP_PropertyCoverages CP_PropertyCoverages = TestPageFactory.initElements(se, CP_PropertyCoverages.class);
			CP_OptionalPropertyCoverages CP_OptionalPropertyCoverages = TestPageFactory.initElements(se, CP_OptionalPropertyCoverages.class);
			CP_Liablitycoverages CP_Liablitycoverages=TestPageFactory.initElements(se, CP_Liablitycoverages.class);
			CP_Liablityclasses CP_Liablityclasses=TestPageFactory.initElements(se, CP_Liablityclasses.class);
			CP_LiabilityAdditonalInterests CP_LiabilityAdditonalInterests = TestPageFactory.initElements(se, CP_LiabilityAdditonalInterests.class);
			CP_CrimeCoverageSelection CP_CrimeCoverageSelection =TestPageFactory.initElements(se, CP_CrimeCoverageSelection.class);
			CP_InlandMarineCovSelection CP_InlandMarineCovSelection = TestPageFactory.initElements(se, CP_InlandMarineCovSelection.class);
			CP_PremiumIndication CP_PremiumIndication = TestPageFactory.initElements(se, CP_PremiumIndication.class);
			CP_LossHistoryExpRating CP_LossHistoryExpRating=TestPageFactory.initElements(se, CP_LossHistoryExpRating.class);
			CP_PremiumModification CP_PremiumModification=TestPageFactory.initElements(se, CP_PremiumModification.class);
			CP_UnderWriter CP_UnderWritter=TestPageFactory.initElements(se, CP_UnderWriter.class);
			CP_PropertyAdditionalInterests CP_PropertyAdditionalInterests=TestPageFactory.initElements(se, CP_PropertyAdditionalInterests.class);
			CP_CarrierInformation CP_CarrierInformation=TestPageFactory.initElements(se, CP_CarrierInformation.class);
			CP_BillingInformation CP_BillingInformation=TestPageFactory.initElements(se, CP_BillingInformation.class);
			CP_Summary CP_Summary=TestPageFactory.initElements(se, CP_Summary.class);
			CP_AccountClearance CP_AccountClearance = TestPageFactory.initElements(se, CP_AccountClearance.class);
			CP_SignsScheduleInfo CP_SignsScheduleInfo = TestPageFactory.initElements(se, CP_SignsScheduleInfo.class);
			APPW_CommonMethods APPW_CommonMethods=TestPageFactory.initElements(se, APPW_CommonMethods.class);
			CP_ContractorsEquipmentScheduled CP_ContractorsEquipmentScheduled = TestPageFactory.initElements(se, CP_ContractorsEquipmentScheduled.class);
			CP_LiabilityOptions CP_LiabilityOptions = TestPageFactory.initElements(se, CP_LiabilityOptions.class);
			CP_AccReceivableSchedule CP_AccReceivableSchedule = TestPageFactory.initElements(se, CP_AccReceivableSchedule.class);
			CA_PolicyCoverages CA_PolicyCoverages=TestPageFactory.initElements(se, CA_PolicyCoverages.class);
			CA_IndividualSchedule CA_IndividualSchedule=TestPageFactory.initElements(se, CA_IndividualSchedule.class);
			CA_VehiclesCoverages CA_VehiclesCoverages=TestPageFactory.initElements(se, CA_VehiclesCoverages.class);
			CA_AdditionalCoverages CA_AdditionalCoverages=TestPageFactory.initElements(se, CA_AdditionalCoverages.class);
			CA_BusinessInterruption CA_BusinessInterruption=TestPageFactory.initElements(se, CA_BusinessInterruption.class);
			CA_TrailerInterchange CA_TrailerInterchange=TestPageFactory.initElements(se, CA_TrailerInterchange.class);
			CA_Garagekeepers CA_Garagekeepers=TestPageFactory.initElements(se, CA_Garagekeepers.class);
			CA_PremiumModification CA_PremiumModification=TestPageFactory.initElements(se, CA_PremiumModification.class);
			CA_Underwriter CA_Underwriter=TestPageFactory.initElements(se, CA_Underwriter.class);
			CA_Drivers CA_Drivers=TestPageFactory.initElements(se, CA_Drivers.class);
			CP_ValuablePapers CP_ValuablePapers = TestPageFactory.initElements(se, CP_ValuablePapers.class);
						try {
				String transaction = "NewQuote";
				String strRegressionIDUnderlined = "CUBP_11";
				List<String> transactionsList = ExcelOperations.getBLTransactionsList(strRegressionIDUnderlined);
				List<Map<String, String>> table = ExcelOperations.getBLPagesData(constants.loginPageName, strRegressionIDUnderlined,transaction);

				int iteration = 0;
				while (iteration < table.size()) {
					System.out.println(table.size());
					LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
					String strAgentLink = (String) row.get("AgentLink");
					String strLOB = (String) row.get("LOB_Select");
					String strRole_SelectRoleAs = (String) row.get("Select_RoleAs");
					String strRelease_SelectRelease = (String) row.get("Select_Release");

					if (transactionsList.contains("NewQuote")) {
						transaction = "NewQuote";String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionIDUnderlined,transaction);
						LoginPage.APAppLogin(strRegressionIDUnderlined,   transaction,"No", test);
						quote=APPW_CommonMethods.getQuoteNumber(strRegressionIDUnderlined,test);
						CP_PremiumIndication.CP_PremiumIndication_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						
					}
					if (transactionsList.contains("RedoNewQuote")) {
						 transaction = "RedoNewQuote";String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionIDUnderlined,transaction);
						BT.NavigateToTabs("Liability Coverages",test);
						CP_Liablitycoverages.CP_Liablitycoverages_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						//BT.NavigateToTabs("Crime Coverage Selection",test);
						BT.ClickContinue(test);
						BT.ClickContinue(test);
						
						CP_CrimeCoverageSelection.CP_CrimeCoverageSelection_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						BT.ClickContinue(test);
						
						BT.ClickContinue(test);
						BT.ClickContinue(test);
						BT.ClickContinue(test);
						BT.ClickContinue(test);
						CP_PremiumIndication.CP_PremiumIndication_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CP_LossHistoryExpRating.CP_LossHistoryExpRating_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CP_PremiumModification.CP_PremiumModification_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs,quote, test);
						CP_UnderWritter.CP_UnderWriter_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CP_PropertyAdditionalInterests.CP_PropertyAdditionalInterests_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CP_BillingInformation.CP_BillingInformation_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CP_Summary.CP_Summary_Details(strRegressionIDUnderlined,strRegressionName, transaction, suspendSheet, strAgentLink, "N/A", strRelease_SelectRelease, strRole_SelectRoleAs,quote, test, file,  workbook);
						
					}
					
					
					strRegressionIDUnderlined = "RCUCA_11";
					if (transactionsList.contains("NewQuote")) {
						transaction = "NewQuote";

						String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionIDUnderlined,transaction);
						
						LoginPage.APAppLogin(strRegressionID,   transaction,"No", test);
						APPW_CommonMethods.openQuoteInAP(quote,"N/A",test);
						APPW_CommonMethods.openAccountDetails(test);
						APPW_CommonMethods.addNewWorkItem("Commercial Auto", test);
						CP_GenInfo.CP_GenInfo_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLink, "Umbrella", strRelease_SelectRelease, strRole_SelectRoleAs, test);
						CP_AccountClearance.CP_AccountClearance_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs, test);
						CP_Locations.CP_Locations_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLink,strLOB,strRelease_SelectRelease,strRole_SelectRoleAs, test);
						quote=APPW_CommonMethods.getQuoteNumber(strRegressionIDUnderlined,test);
						CA_PolicyCoverages.CA_PolicyCoverages_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CA_IndividualSchedule.CA_IndividualSchedule_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CA_VehiclesCoverages.CA_VehiclesCoverages_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CA_AdditionalCoverages.CA_AdditionalCoverages_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						//CA_TrailerInterchange.CA_TrailerInterchange_Details(strRegressionID, transaction, suspendSheet, test);
						BT.ClickContinue(test);
						BT.ClickContinue(test);
						CP_PremiumIndication.CP_PremiumIndication_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						BT.ClickContinue(test);
						BT.ClickContinue(test);
						CA_Underwriter.CA_UnderWriter_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CA_Drivers.CA_Drivers_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						//BT.ClickContinue(test);
						CP_BillingInformation.CP_BillingInformation_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
						CP_Summary.CP_Summary_Details(strRegressionIDUnderlined,strRegressionName, transaction, suspendSheet, strAgentLink, "N/A", strRelease_SelectRelease, strRole_SelectRoleAs,quote, test, file,  workbook);
									
					}
						
					
					 if (transactionsList.contains("BookPolicyInPW")) {
							transaction = "BookPolicyInPW";String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
							test.log(LogStatus.INFO, "Bizlink Elapsed Time", "<b>Started Time : "+test.getStartedTime()+"<br> <b>Ended Time : "+Util.getTime()+"<br> <b>Time Taken : "+Util.DiffInTime(test.getStartedTime(), Util.getTime())); 
							Date PWstartTime = Util.getTime();
							LoginPage.APAppLogin(strRegressionID,   transaction,"No", test);
							APPW_CommonMethods.PW_Search_Details(test,quote,"N/A");
							APPW_CommonMethods.getDashboardActions(strRegressionID, transaction, suspendSheet, test);
							APPW_CommonMethods.getCalculatePremium(strRegressionID,"N/A", transaction, test);
							PolicyNumber = APPW_CommonMethods.retrievePolicyNumber(test);APPW_CommonMethods.getCalculatePremium(strRegressionID,"N/A", "PWConvertToPolicy", test);CP_Summary.CP_Summary_Details(strRegressionID,strRegressionName, transaction, suspendSheet, strAgentLink, "N/A", strRelease_SelectRelease, strRole_SelectRoleAs,PolicyNumber, test, file,  workbook);
							APPW_CommonMethods.getCompleteTransaction(strRegressionID, transaction, test);
							APPW_CommonMethods.getDashboardActions(strRegressionID, "PWConvertToPolicy", suspendSheet, test);
							test.log(LogStatus.INFO, "PW Elapsed Time", "<b>Started Time : "+PWstartTime+"<br> <b>Ended Time : "+Util.getTime()+"<br> <b>Time Taken : "+Util.DiffInTime(PWstartTime, Util.getTime())); 
							
						}
						
						if (transactionsList.contains("PolicyIssuanceOnAP")) {
							  transaction = "PolicyIssuanceOnAP";String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
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
				se.verify().verifyEquals("BP11_MN_BPRegression test  failed", true, false, true, test);
				testTearDown(se,test);
			}
		}
	}
}

