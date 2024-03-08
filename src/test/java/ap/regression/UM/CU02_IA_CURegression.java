package ap.regression.UM;
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
import Libraries.ap.automation.common.SystemPropertyUtil;
import Libraries.ap.automation.common.Utils.TestPageFactory;
import Libraries.ap.automation.common.framework.Browser.Browsers;
import Libraries.ap.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.OR_CP;
import ap.pages.CP.CP_AccountClearance;
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
import ap.pages.CP.CP_ScheduledProperty;
import ap.pages.CP.CP_Summary;
import ap.pages.CP.CP_UnderWriter;
import ap.pages.UM.UM_GenInfo;
import ap.pages.UM.UM_ScheduleName;
import ap.pages.UM.UM_Umbrellalimits;
import ap.pages.UM.UM_UnderLying;
import ap.pages.UM.UM_Underwriter;
import ap.pages.WC.WC_IndividualsIncluded;
import ap.pages.WC.WC_OtherStateInsurance;
import ap.pages.WC.WC_PolicyInformation;
import ap.pages.WC.WC_PremiumModification;
import ap.pages.WC.WC_RatingClassifications;
import ap.pages.WC.WC_StateRatingFactors;
import ap.pages.WC.WC_UWQuestions;
import ap.pages.common.APPW_CommonMethods;
import ap.pages.common.AP_Login;

public class CU02_IA_CURegression extends BaseTest{
	ExtentReports extent;
	ExtentTest test;
	static String PolicyNumberCU = "";
	static String PolicyNumberAG = "";
	static String PolicyNumberWC = "";
	static String quote;
	

	
	@SuppressWarnings("unused")
	public static void CU02_IA_CURegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,String strRegressionName, File file,XSSFWorkbook workbook, ExtentTest test) throws IOException 
	{
		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		OR_CP ORCP = TestPageFactory.initElements(se, OR_CP.class);
		CommonAPMethods BT=TestPageFactory.initElements(se, CommonAPMethods.class);
		AP_Login  LoginPage = TestPageFactory.initElements(se, AP_Login.class);
		CP_GenInfo CP_GenInfo = TestPageFactory.initElements(se, CP_GenInfo.class);
		CP_AccountClearance CP_AccountClearance = TestPageFactory.initElements(se, CP_AccountClearance.class);
		CP_CoverageParts CP_CovParts = TestPageFactory.initElements(se, CP_CoverageParts.class);
		CP_Locations CP_Locs = TestPageFactory.initElements(se, CP_Locations.class);
		CP_BuildingandOccupantSelection CP_BandOS = TestPageFactory.initElements(se, CP_BuildingandOccupantSelection.class);
		CP_BulidingDetails CP_BulidingDetails = TestPageFactory.initElements(se, CP_BulidingDetails.class);
		CP_PropertyCoverages CP_PropertyCoverages = TestPageFactory.initElements(se, CP_PropertyCoverages.class);
		CP_OptionalPropertyCoverages CP_OptionalPropertyCoverages = TestPageFactory.initElements(se, CP_OptionalPropertyCoverages.class);
		CP_Liablitycoverages CP_Liablitycoverages=TestPageFactory.initElements(se, CP_Liablitycoverages.class);
		CP_Liablityclasses CP_Liablityclasses=TestPageFactory.initElements(se, CP_Liablityclasses.class);
		CP_LiabilityOptions CP_LiabilityOptions = TestPageFactory.initElements(se, CP_LiabilityOptions.class);
		CP_LiabilityAdditonalInterests CP_LiabilityAdditonalInterests = TestPageFactory.initElements(se, CP_LiabilityAdditonalInterests.class);
		CP_CrimeCoverageSelection CP_CrimeCoverageSelection =TestPageFactory.initElements(se, CP_CrimeCoverageSelection.class);
		CP_PremiumIndication CP_PremiumIndication = TestPageFactory.initElements(se, CP_PremiumIndication.class);
		CP_LossHistoryExpRating CP_LossHistoryExpRating=TestPageFactory.initElements(se, CP_LossHistoryExpRating.class);
		CP_PremiumModification CP_PremiumModification=TestPageFactory.initElements(se, CP_PremiumModification.class);
		CP_UnderWriter CP_UnderWritter=TestPageFactory.initElements(se, CP_UnderWriter.class);
		CP_BillingInformation CP_BillingInformation=TestPageFactory.initElements(se, CP_BillingInformation.class);
		CP_CarrierInformation CP_CarrierInformation=TestPageFactory.initElements(se, CP_CarrierInformation.class);
		CP_Summary CP_Summary=TestPageFactory.initElements(se, CP_Summary.class);
		CP_AdditionalCoverageParts CP_AdditionalCoverageParts=TestPageFactory.initElements(se, CP_AdditionalCoverageParts.class);
		CP_ContractorsEquipmentScheduled CP_ContractorsEquipmentScheduled=TestPageFactory.initElements(se, CP_ContractorsEquipmentScheduled.class);
		CP_ExtendedNamedInsured CP_ExtendedNamedInsured = TestPageFactory.initElements(se, CP_ExtendedNamedInsured.class);
		CP_InlandMarineCovSelection CP_InlandMarineCovSelection = TestPageFactory.initElements(se, CP_InlandMarineCovSelection.class);
		CP_PropertyAdditionalInterests CP_PropertyAdditionalInterests = TestPageFactory.initElements(se, CP_PropertyAdditionalInterests.class); 
		APPW_CommonMethods APPW_CommonMethods=TestPageFactory.initElements(se, APPW_CommonMethods.class);
		CP_ScheduledProperty CP_ScheduledProperty = TestPageFactory.initElements(se, CP_ScheduledProperty.class);
		UM_UnderLying  UnderLying = TestPageFactory.initElements(se, UM_UnderLying.class);
		UM_GenInfo  UM_GenInfo = TestPageFactory.initElements(se, UM_GenInfo.class);
		UM_Umbrellalimits  UM_Umbrellalimits = TestPageFactory.initElements(se, UM_Umbrellalimits.class);
		UM_ScheduleName  UM_ScheduleName = TestPageFactory.initElements(se, UM_ScheduleName.class);
		UM_Underwriter UM_Underwriter=TestPageFactory.initElements(se, UM_Underwriter.class);
		WC_PolicyInformation WC_PolicyInformation=TestPageFactory.initElements(se, WC_PolicyInformation.class);
		WC_StateRatingFactors WC_StateRatingFactors=TestPageFactory.initElements(se, WC_StateRatingFactors.class);
		WC_RatingClassifications WC_RatingClassifications=TestPageFactory.initElements(se, WC_RatingClassifications.class);
		WC_PremiumModification WC_PremiumModification=TestPageFactory.initElements(se, WC_PremiumModification.class);
		WC_UWQuestions WC_UWQuestions=TestPageFactory.initElements(se, WC_UWQuestions.class);
		WC_IndividualsIncluded WC_IndividualsIncluded = TestPageFactory.initElements(se, WC_IndividualsIncluded.class);
		WC_OtherStateInsurance WC_OtherStateInsurance = TestPageFactory.initElements(se, WC_OtherStateInsurance.class);

		try {
			String transaction = "NewQuote";
			String strRegressionIDUnderlined = "CUAG_02";
			List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
			List<Map<String, String>> table = ExcelOperations.getPagesData(constants.loginPageName, strRegressionID,transaction);
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(0);
			String strAgentLink = (String) row.get("AgentLink");
			String strLOB = (String) row.get("LOB_Select");
			String strRole_SelectRoleAs = (String) row.get("Select_RoleAs");
			String strRelease_SelectRelease = (String) row.get("Select_Release");
			
			List<Map<String, String>> tableAG = ExcelOperations.getPagesData(constants.loginPageName, strRegressionIDUnderlined,transaction);
			LinkedHashMap<String, String> rowAG = (LinkedHashMap<String, String>) tableAG.get(0);
			String strAgentLinkAG = (String) rowAG.get("AgentLink");


			// UNDERLYING POLICY 1 CUAG_02 NEW QUOTE TRANSACTION
			
				if (transactionsList.contains("NewQuote")) {
				transaction = "NewQuote";String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				LoginPage.APAppLogin(strRegressionIDUnderlined,   transaction,"Yes", test);
				CP_GenInfo.CP_GenInfo_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLinkAG,strLOB,strRole_SelectRoleAs,strRelease_SelectRelease, test);
				CP_AccountClearance.CP_AccountClearance_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLinkAG, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs, test);
				CP_ExtendedNamedInsured.CP_ExtendedNamedInsured_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLinkAG,strLOB,strRelease_SelectRelease,strRole_SelectRoleAs, test);
				CP_CovParts.CP_CoverageParts_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_Locs.CP_Locations_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLinkAG,strLOB,strRelease_SelectRelease,strRole_SelectRoleAs, test);
				quote=APPW_CommonMethods.getQuoteNumber(strRegressionIDUnderlined,test);
				CP_BandOS.CP_BuildandOccupantSelection_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_BulidingDetails.CP_Buliding_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLinkAG, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs, test);
				CP_PropertyCoverages.CP_PropertyCoverages_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_OptionalPropertyCoverages.CP_OptionalPropertyCoverages_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_Liablitycoverages.CP_Liablitycoverages_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_Liablityclasses.CP_Liablityclasses_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_LiabilityOptions.CP_LiabilityOptions_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_LiabilityAdditonalInterests.CP_LiabilityAdditonalInterests_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_AdditionalCoverageParts.CP_AdditionalCoverageParts_Details(strRegressionID, transaction, suspendSheet, test);
				CP_CrimeCoverageSelection.CP_CrimeCoverageSelection_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_InlandMarineCovSelection.CP_InlandMarineCovSelection_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_ContractorsEquipmentScheduled.CP_ContractorsEquipmentScheduled_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_PremiumIndication.CP_PremiumIndication_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				
			}
			
			// UNDERLYING POLICY 1 CUAG_02 REDO NEW QUOTE TRANSACTION
			if (transactionsList.contains("RedoNewQuote")) {
				transaction = "RedoNewQuote";String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				BT.NavigateToTabs("General Information",test);
				CP_GenInfo.CP_GenInfo_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLink,strLOB,strRole_SelectRoleAs,strRelease_SelectRelease, test);
				BT.NavigateToTabs("Coverage Parts",test);
				CP_CovParts.CP_CoverageParts_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				BT.NavigateToTabs("Property Coverages",test);
				CP_PropertyCoverages.CP_PropertyCoverages_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				BT.NavigateToTabs("Liability Coverages",test);
				CP_Liablitycoverages.CP_Liablitycoverages_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				BT.NavigateToTabs("Liability Additional Interests",test);
				CP_LiabilityAdditonalInterests.CP_LiabilityAdditonalInterests_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_AdditionalCoverageParts.CP_AdditionalCoverageParts_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_InlandMarineCovSelection.CP_InlandMarineCovSelection_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_ContractorsEquipmentScheduled.CP_ContractorsEquipmentScheduled_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_PremiumIndication.CP_PremiumIndication_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_PremiumModification.CP_PremiumModification_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLinkAG,strLOB,strRole_SelectRoleAs,strRelease_SelectRelease, quote,test);
				CP_UnderWritter.CP_UnderWriter_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_PropertyAdditionalInterests.CP_PropertyAdditionalInterests_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				//CP_CarrierInformation.CP_CarrierInformation_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_BillingInformation.CP_BillingInformation_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_Summary.CP_Summary_Details(strRegressionIDUnderlined,strRegressionName, transaction, suspendSheet, strAgentLinkAG, "Package", strRelease_SelectRelease, strRole_SelectRoleAs,quote, test, file,  workbook);
				LoginPage.APLogoutDetails( strAgentLink,test );

			}
			// UNDERLYING POLICY 2 CUWC_03 
			strRegressionIDUnderlined = "CUWC_03";
			if (transactionsList.contains("NewQuote")) {
				transaction = "NewQuote";String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				LoginPage.APAppLogin(strRegressionIDUnderlined,   transaction,"No", test);
				APPW_CommonMethods.openQuoteInAP(quote,"N/A",test);
				APPW_CommonMethods.openAccountDetails(test);
				APPW_CommonMethods.addNewWorkItem("Workers", test);
				CP_GenInfo.CP_GenInfo_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLink, "Umbrella", strRelease_SelectRelease, strRole_SelectRoleAs, test);
				//CP_AccountClearance.CP_AccountClearance_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs, test);
				CP_Locs.CP_Locations_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLink,strLOB,strRelease_SelectRelease,strRole_SelectRoleAs, test);
				quote=APPW_CommonMethods.getQuoteNumber(strRegressionIDUnderlined,test);
				BT.NavigateToTabs("General Information",test);
				CP_GenInfo.CP_GenInfo_Details(strRegressionIDUnderlined, "NewQuote1",suspendSheet, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs, test);
				CP_ExtendedNamedInsured.CP_ExtendedNamedInsured_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLink,strLOB,strRelease_SelectRelease,strRole_SelectRoleAs, test);
				BT.ClickContinue(test);
				WC_PolicyInformation.WC_PolicyInformation_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				WC_StateRatingFactors.WC_StateRatingFactors_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				WC_RatingClassifications.WC_RatingClassifications_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_PremiumIndication.CP_PremiumIndication_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
			
			}
			if (transactionsList.contains("RedoNewQuote")) {
				transaction = "RedoNewQuote";String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				BT.NavigateToTabs("Rating Classifications",test);
				BT.NavigateToTabs("Locations",test);
				CP_Locs.CP_Locations_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLink,strLOB,strRelease_SelectRelease,strRole_SelectRoleAs, test);
				BT.ClickContinue(test);
				WC_StateRatingFactors.WC_StateRatingFactors_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				WC_RatingClassifications.WC_RatingClassifications_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_PremiumIndication.CP_PremiumIndication_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				WC_PremiumModification.WC_PremiumModification_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs, test);
				BT.ClickContinue(test);
				WC_UWQuestions.WC_UnderWriter_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				BT.ClickContinue(test);
				
				CP_BillingInformation.CP_BillingInformation_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_Summary.CP_Summary_Details(strRegressionIDUnderlined,strRegressionName, transaction, suspendSheet, strAgentLink, "Workers", strRelease_SelectRelease, strRole_SelectRoleAs,quote, test, file,  workbook);
				
				
			
			}
			
			// CommercialUmbrella New Quote transaction
					if (transactionsList.contains("NewQuote")) {
						transaction = "NewQuote";String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
						APPW_CommonMethods.openAccountDetails(test);
						APPW_CommonMethods.addNewWorkItem("Umbrella", test);
						UnderLying.UM_UnderLying_Details(strRegressionID, transaction, suspendSheet, test);
						UM_GenInfo.UM_GenInfo_Details(strRegressionID, transaction, suspendSheet,  test);
						UM_Umbrellalimits.UM_Umbrellalimits_Details(strRegressionID, transaction, suspendSheet, test);
						quote=APPW_CommonMethods.getQuoteNumber(strRegressionID,test);
						//CP_PremiumIndication.CP_PremiumIndication_Details(strRegressionID, transaction, suspendSheet, test);
						UM_Underwriter.UM_UW_Details(strRegressionID, transaction, suspendSheet, test);
						CP_Summary.CP_Summary_Details(strRegressionID,strRegressionName, transaction, suspendSheet, strAgentLink, "Umbrella", strRelease_SelectRelease, strRole_SelectRoleAs,quote, test, file,  workbook);
				        LoginPage.APLogoutDetails( strAgentLink,test );
						
					}
					
			// Booking Underlying Quote (AG IA) in PW
					
					test.log(LogStatus.INFO, "Bizlink Elapsed Time", "<b>Started Time : "+test.getStartedTime()+"<br> <b>Ended Time : "+Util.getTime()+"<br> <b>Time Taken : "+Util.DiffInTime(test.getStartedTime(), Util.getTime()));
					Date PWstartTime = Util.getTime();
					
					if (transactionsList.contains("BookPolicyInPW")) {
						transaction = "BookPolicyInPW";String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
						strRegressionIDUnderlined = "CUAG_02";
						LoginPage.APAppLogin(strRegressionIDUnderlined,   transaction,"No", test);
						APPW_CommonMethods.PW_Search_Details(test,quote,"CP");
						APPW_CommonMethods.getDashboardActions(strRegressionIDUnderlined, transaction, suspendSheet, test);
						APPW_CommonMethods.getCalculatePremium(strRegressionIDUnderlined,"N/A", transaction, test);
						PolicyNumberAG = APPW_CommonMethods.retrievePolicyNumber(test);
						CP_Summary.CP_Summary_Details(strRegressionID,strRegressionName, transaction, suspendSheet, strAgentLink, "N/A", strRelease_SelectRelease, strRole_SelectRoleAs,PolicyNumberAG, test, file,  workbook);
						APPW_CommonMethods.getCompleteTransaction(strRegressionIDUnderlined, transaction, test);
						APPW_CommonMethods.getDashboardActions(strRegressionIDUnderlined, "PWConvertToPolicy",suspendSheet, test);

					}
					
					// Booking Underlying Quote (WC IA) in PW
					if (transactionsList.contains("BookPolicyInPW")) {
						String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
						
						strRegressionIDUnderlined = "CUWC_03";
						se.browser().get(SystemPropertyUtil.getPwUrl(),test);
						
						APPW_CommonMethods.PW_Search_Details(test,quote,"WC");
						APPW_CommonMethods.getDashboardActions(strRegressionIDUnderlined, transaction, suspendSheet, test);
						APPW_CommonMethods.getCalculatePremium(strRegressionIDUnderlined,"N/A", transaction, test);
						PolicyNumberWC = APPW_CommonMethods.retrievePolicyNumber(test);
						CP_Summary.CP_Summary_Details(strRegressionID,strRegressionName, transaction, suspendSheet, strAgentLink, "N/A", strRelease_SelectRelease, strRole_SelectRoleAs,PolicyNumberWC, test, file,  workbook);
						APPW_CommonMethods.getCompleteTransaction(strRegressionIDUnderlined, transaction, test);
						APPW_CommonMethods.getDashboardActions(strRegressionIDUnderlined, "PWConvertToPolicy",suspendSheet, test);

					}
					
			// Booking CU Quote (IA CU) in PW
						if (transactionsList.contains("BookPolicyInPW")) {
							String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
							se.browser().get(SystemPropertyUtil.getPwUrl(),test);
								
						APPW_CommonMethods.PW_Search_Details(test,quote,"CU");
						APPW_CommonMethods.getDashboardForms(strRegressionID, transaction, suspendSheet, test);
						APPW_CommonMethods.getDashboardActions(strRegressionID, transaction, suspendSheet, test);
						APPW_CommonMethods.getCalculatePremium(strRegressionID,"N/A", transaction, test);
						PolicyNumberCU = APPW_CommonMethods.retrievePolicyNumber(test);
						CP_Summary.CP_Summary_Details(strRegressionID,strRegressionName, transaction, suspendSheet, strAgentLink, "N/A", strRelease_SelectRelease, strRole_SelectRoleAs,PolicyNumberCU, test, file,  workbook);
						APPW_CommonMethods.getCompleteTransaction(strRegressionID, transaction, test);
						APPW_CommonMethods.getDashboardActions(strRegressionID, "PWConvertToPolicy", suspendSheet, test);

					}
						test.log(LogStatus.INFO, "PW Elapsed Time", "<b>Started Time : "+PWstartTime+"<br> <b>Ended Time : "+Util.getTime()+"<br> <b>Time Taken : "+Util.DiffInTime(PWstartTime, Util.getTime())); 
						Date PolicyVerificationstartTime = Util.getTime();
						// Policy Issuance of Underlying Quote (IA AG)
					if (transactionsList.contains("PolicyIssuanceOnAP")) {
						     transaction = "PolicyIssuanceOnAP";String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
						   strRegressionIDUnderlined = "CUAG_02";
						   se.util().sleep(60000);
						   LoginPage.APAppLogin(strRegressionIDUnderlined,   transaction,"No", test);
						   APPW_CommonMethods.APSearchPolicyNumber(PolicyNumberAG,test);
						   CP_Summary.CP_Summary_Details(strRegressionIDUnderlined,strRegressionName, transaction, suspendSheet, strAgentLink, "Package", strRelease_SelectRelease, strRole_SelectRoleAs,PolicyNumberAG, test, file,  workbook);
							
					   }
					
					// Policy Issuance of Underlying Quote (IA WC)
					if (transactionsList.contains("PolicyIssuanceOnAP")) {
						   transaction = "PolicyIssuanceOnAP";String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
						 strRegressionIDUnderlined = "CUWC_03";
						  se.util().sleep(60000);
						  APPW_CommonMethods.APSearchPolicyNumber(PolicyNumberWC,test);
						  CP_Summary.CP_Summary_Details(strRegressionIDUnderlined,strRegressionName, transaction, suspendSheet, strAgentLink, "Workers", strRelease_SelectRelease, strRole_SelectRoleAs,PolicyNumberWC, test, file,  workbook);
							
					   }
					
					// Policy Issuance of CU Quote (IA CU) 
					if (transactionsList.contains("PolicyIssuanceOnAP")) {
						   transaction = "PolicyIssuanceOnAP";String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction); 
						 se.util().sleep(60000);
						 APPW_CommonMethods.APSearchPolicyNumber(PolicyNumberCU,test);
						 CP_Summary.CP_Summary_Details(strRegressionID,strRegressionName, transaction, suspendSheet, strAgentLink, "Umbrella", strRelease_SelectRelease, strRole_SelectRoleAs,PolicyNumberCU,test, file,  workbook);
					
					   }
					test.log(LogStatus.INFO, "Elapsed Time for PolicyVerification in Bizlink", "<b>Started Time : "+PolicyVerificationstartTime+"<br> <b>Ended Time : "+Util.getTime()+"<br> <b>Time Taken : "+Util.DiffInTime(PolicyVerificationstartTime, Util.getTime())); 
			
				
		}
		catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("CU02_IA_CURegression test  failed", true, false, true, test);
			testTearDown(se,test);
		}
	}
}




