package rrs.Regressions;

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
import Libraries.automation.common.framework.Browser.Browsers;
import Libraries.automation.common.framework.Util;
import ap.Constants.constants;
import ap.pages.CA.CA_AdditionalCoverages;
import ap.pages.CA.CA_AdditionalInterests;
import ap.pages.CA.CA_Drivers;
import ap.pages.CA.CA_Garagekeepers;
import ap.pages.CA.CA_IndividualSchedule;
import ap.pages.CA.CA_PolicyCoverages;
import ap.pages.CA.CA_PremiumModification;
import ap.pages.CA.CA_TrailerInterchange;
import ap.pages.CA.CA_Underwriter;
import ap.pages.CA.CA_VehiclesCoverages;
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
import ap.pages.WC.WC_FlatWaiverOfSubrogation;
import ap.pages.WC.WC_IndividualsIncluded;
import ap.pages.WC.WC_OtherStateInsurance;
import ap.pages.WC.WC_PolicyInformation;
import ap.pages.WC.WC_PremiumModification;
import ap.pages.WC.WC_RatingClassifications;
import ap.pages.WC.WC_StateRatingFactors;
import ap.pages.WC.WC_UWQuestions;
import ap.pages.common.APPW_CommonMethods;
import ap.pages.common.AP_Login;
import pw.pages.CA.CA_ScheduleRating;
import pw.pages.COMMON.PW_CommonFun;
import pw.pages.COMMON.PW_CommonMethods;
import pw.pages.COMMON.PW_Login;
import pw.pages.COMMON.PW_ScheduleRatingIRPM;
import pw.pages.WC.WC_WaiverOfSubrogation;
import rrs.pages.MainScreen.PWQuoteOpen;
import rrs.pages.MainScreen.RateRenewalSheet;


public class RRS_Regression_01 extends BaseTest {
	ExtentReports extent;
	ExtentTest test;
	
	static String PolicyNumberCU = "";
	static String PolicyNumberBP = "";
	static String PolicyNumberCA = "";
	static String PolicyNumberWC = "";
	static String quote = "";


	
	public static void RRS_RegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,String strRegressionName,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login  LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_ScheduleRatingIRPM ScheduleRatingIRPMPage = TestPageFactory.initElements(se, PW_ScheduleRatingIRPM.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		CA_ScheduleRating CA_ScheduleRatingPage = TestPageFactory.initElements(se, CA_ScheduleRating.class);
		RateRenewalSheet RateRenewalSheet = TestPageFactory.initElements(se, RateRenewalSheet.class);
		PWQuoteOpen PWQuoteOpenPage = TestPageFactory.initElements(se, PWQuoteOpen.class);
		WC_WaiverOfSubrogation WCWaiverOfSubrogation = TestPageFactory.initElements(se, WC_WaiverOfSubrogation.class);
		CP_GenInfo CP_GenInfo = TestPageFactory.initElements(se, CP_GenInfo.class);
		CP_AccountClearance CP_AccountClearance = TestPageFactory.initElements(se, CP_AccountClearance.class);
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
		CP_CoverageParts CP_CoverageParts = TestPageFactory.initElements(se, CP_CoverageParts.class);
		CP_Locations CP_Locations = TestPageFactory.initElements(se, CP_Locations.class);
		CA_PolicyCoverages CA_PolicyCoverages=TestPageFactory.initElements(se, CA_PolicyCoverages.class);
		CA_VehiclesCoverages CA_VehiclesCoverages=TestPageFactory.initElements(se, CA_VehiclesCoverages.class);
		CA_AdditionalCoverages CA_AdditionalCoverages=TestPageFactory.initElements(se, CA_AdditionalCoverages.class);
		CA_AdditionalInterests CA_AdditionalInterests=TestPageFactory.initElements(se, CA_AdditionalInterests.class);
		CA_Garagekeepers CA_Garagekeepers = TestPageFactory.initElements(se, CA_Garagekeepers.class);
		CA_PremiumModification CA_PremiumModification=TestPageFactory.initElements(se, CA_PremiumModification.class);
		CA_Underwriter CA_Underwriter=TestPageFactory.initElements(se, CA_Underwriter.class);
		CA_Drivers CA_Drivers=TestPageFactory.initElements(se, CA_Drivers.class);
		WC_PolicyInformation WC_PolicyInformation=TestPageFactory.initElements(se, WC_PolicyInformation.class);
		WC_StateRatingFactors WC_StateRatingFactors=TestPageFactory.initElements(se, WC_StateRatingFactors.class);
		WC_RatingClassifications WC_RatingClassifications=TestPageFactory.initElements(se, WC_RatingClassifications.class);
		WC_PremiumModification WC_PremiumModification=TestPageFactory.initElements(se, WC_PremiumModification.class);
		WC_UWQuestions WC_UWQuestions=TestPageFactory.initElements(se, WC_UWQuestions.class);
		WC_IndividualsIncluded WC_IndividualsIncluded = TestPageFactory.initElements(se, WC_IndividualsIncluded.class);
		WC_OtherStateInsurance WC_OtherStateInsurance = TestPageFactory.initElements(se, WC_OtherStateInsurance.class);
		WC_FlatWaiverOfSubrogation WC_FlatWaiverOfSubrogation = TestPageFactory.initElements(se, WC_FlatWaiverOfSubrogation.class);
		CA_TrailerInterchange CA_TrailerInterchange = TestPageFactory.initElements(se, CA_TrailerInterchange.class);
		CA_IndividualSchedule CA_IndividualSchedule = TestPageFactory.initElements(se, CA_IndividualSchedule.class);
		CommonAPMethods BT=TestPageFactory.initElements(se, CommonAPMethods.class);
		
		try {
			
			LinkedHashMap<String, String> QFR= new LinkedHashMap<String, String>();
			LinkedHashMap<String, String> CurrentTermPremiums= new LinkedHashMap<String, String>();
			LinkedHashMap<String, String> CurrentTermPremiumsCA= new LinkedHashMap<String, String>();
			LinkedHashMap<String, String> CurrentTermPremiumsWC= new LinkedHashMap<String, String>();
			LinkedHashMap<String, String> CurrentTermPremiumsUM= new LinkedHashMap<String, String>();
			LinkedHashMap<String, String> QFRPremiumsCA= new LinkedHashMap<String, String>();
			LinkedHashMap<String, String> QFRPremiumsWC= new LinkedHashMap<String, String>();
			LinkedHashMap<String, String> QFRPremiumsUM= new LinkedHashMap<String, String>();
			LinkedHashMap<String, String> NewQFRPremium= new LinkedHashMap<String, String>();
			LinkedHashMap<String, String> NewQFRPremiumCA= new LinkedHashMap<String, String>();
			LinkedHashMap<String, String> NewQFRPremiumWC= new LinkedHashMap<String, String>();
			LinkedHashMap<String, String> OldQFRPremium= new LinkedHashMap<String, String>();
			
			
		//4174850

			JavascriptExecutor executor = (JavascriptExecutor) se.driver();
			

			//CommonAPMethods BT=TestPageFactory.initElements(se, CommonAPMethods.class);
			AP_Login  BLLoginPage = TestPageFactory.initElements(se, AP_Login.class);
				
			String transaction = "NewQuote";
			String strRegressionIDUnderlined = "CUTC_13";
			List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
			List<Map<String, String>> table = ExcelOperations.getBLPagesData(constants.loginPageName, strRegressionID,transaction);
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(0);
			String strAgentLink = (String) row.get("AgentLink");
			String strLOB = (String) row.get("LOB_Select");
			String strRole_SelectRoleAs = (String) row.get("Select_RoleAs");
			String strRelease_SelectRelease = (String) row.get("Select_Release");
			List<Map<String, String>> tableTC = ExcelOperations.getBLPagesData(constants.loginPageName, strRegressionIDUnderlined,transaction);
			LinkedHashMap<String, String> rowTC = (LinkedHashMap<String, String>) tableTC.get(0);
			String strAgentLinkTC = (String) rowTC.get("AgentLink");
			String strLOBTC = (String) rowTC.get("LOB_Select");
			String strRole_SelectRoleAsTC = (String) rowTC.get("Select_RoleAs");
			String strRelease_SelectReleaseTC = (String) rowTC.get("Select_Release");
			// UNDERLYING POLICY 1 CUTC_08 NEW QUOTE TRANSACTION
			
			if (transactionsList.contains("BLNewQuote")) {
				transaction = "NewQuote";String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				BLLoginPage.APAppLogin(strRegressionIDUnderlined,   transaction,"Yes", test);
				CP_GenInfo.CP_GenInfo_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLinkTC, strLOBTC, strRelease_SelectReleaseTC, strRole_SelectRoleAsTC, test);
				CP_AccountClearance.CP_AccountClearance_Details(strRegressionID, transaction, suspendSheet, strAgentLinkTC, strLOBTC, strRelease_SelectReleaseTC, strRole_SelectRoleAsTC, test);
				CP_ExtendedNamedInsured.CP_ExtendedNamedInsured_Details(strRegressionIDUnderlined, transaction, suspendSheet,strAgentLinkTC, strLOBTC, strRelease_SelectReleaseTC, strRole_SelectRoleAsTC, test);
				CP_CoverageParts.CP_CoverageParts_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_Locations.CP_Locations_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLinkTC,strLOBTC,strRelease_SelectRelease,strRole_SelectRoleAs, test);
				quote=APPW_CommonMethods.getQuoteNumber(strRegressionIDUnderlined,test);
				CP_BandOS.CP_BuildandOccupantSelection_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_BulidingDetails.CP_Buliding_Details(strRegressionIDUnderlined, transaction, suspendSheet,strAgentLinkTC, strLOBTC, strRelease_SelectReleaseTC, strRole_SelectRoleAsTC, test);
				CP_PropertyCoverages.CP_PropertyCoverages_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_OptionalPropertyCoverages.CP_OptionalPropertyCoverages_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_Liablitycoverages.CP_Liablitycoverages_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_Liablityclasses.CP_Liablityclasses_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_LiabilityAdditonalInterests.CP_LiabilityAdditonalInterests_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_AdditionalCoverageParts.CP_AdditionalCoverageParts_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_CrimeCoverageSelection.CP_CrimeCoverageSelection_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_InlandMarineCovSelection.CP_InlandMarineCovSelection_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_PremiumIndication.CP_PremiumIndication_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_LossHistoryExpRating.CP_LossHistoryExpRating_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_PremiumModification.CP_PremiumModification_Details(strRegressionIDUnderlined, transaction, suspendSheet,strAgentLinkTC, strLOBTC, strRelease_SelectReleaseTC, strRole_SelectRoleAsTC,quote, test);
				CP_UnderWritter.CP_UnderWriter_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_PropertyAdditionalInterests.CP_PropertyAdditionalInterests_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				BT.ClickContinue(test);
			}
			if (transactionsList.contains("BLRedoNewQuote")) {
				transaction = "RedoNewQuote";String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				BT.NavigateToTabs("Liability Classes", test);
				BT.ClickContinue(test);
				BT.NavigateToTabs("Crime Coverage Selection", test);
				BT.ClickContinue(test);
				BT.NavigateToTabs("Underwriting Questions", test);
				BT.ClickContinue(test);
				BT.NavigateToTabs("Property Additional Interests",test);			
				CP_PropertyAdditionalInterests.CP_PropertyAdditionalInterests_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_BillingInformation.CP_BillingInformation_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_Summary.CP_Summary_Details(strRegressionIDUnderlined,strRegressionName, transaction, suspendSheet, strAgentLinkTC, "Package", strRelease_SelectReleaseTC, strRole_SelectRoleAsTC,quote, test, file,  workbook);

			}

			strRegressionIDUnderlined = "CUCA_06";

			if (transactionsList.contains("BLNewQuote")) {
				transaction = "NewQuote";String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				APPW_CommonMethods.openQuoteInAP(quote,"N/A",test);
				APPW_CommonMethods.openAccountDetails(test);
				APPW_CommonMethods.addNewWorkItem("Commercial Auto", test);
				CP_GenInfo.CP_GenInfo_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLink, "Umbrella", strRelease_SelectRelease, strRole_SelectRoleAs, test);
				CP_ExtendedNamedInsured.CP_ExtendedNamedInsured_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLink,strLOB,strRelease_SelectRelease,strRole_SelectRoleAs, test);
				CP_Locations.CP_Locations_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLink,strLOB,strRelease_SelectRelease,strRole_SelectRoleAs, test);
				quote=APPW_CommonMethods.getQuoteNumber(strRegressionIDUnderlined,test);
				CA_PolicyCoverages.CA_PolicyCoverages_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CA_IndividualSchedule.CA_IndividualSchedule_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CA_VehiclesCoverages.CA_VehiclesCoverages_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CA_AdditionalCoverages.CA_AdditionalCoverages_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CA_Garagekeepers.CA_Garagekeepers_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				BT.ClickContinue(test);
				CA_AdditionalInterests.CA_AdditionalInterests_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_PremiumIndication.CP_PremiumIndication_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CA_PremiumModification.CA_PremiumModification_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs, test);
				CA_Underwriter.CA_UnderWriter_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CA_Drivers.CA_Drivers_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_BillingInformation.CP_BillingInformation_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_Summary.CP_Summary_Details(strRegressionIDUnderlined,strRegressionName, transaction, suspendSheet, strAgentLink, "Commercial Auto", strRelease_SelectRelease, strRole_SelectRoleAs,quote, test, file,  workbook);
				
			}

			strRegressionIDUnderlined = "CUWC_07";
			if (transactionsList.contains("BLNewQuote")) {
				transaction = "NewQuote";String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				APPW_CommonMethods.openAccountDetails(test);
				APPW_CommonMethods.addNewWorkItem("Workers", test);
				CP_GenInfo.CP_GenInfo_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLink, "Umbrella", strRelease_SelectRelease, strRole_SelectRoleAs, test);
				CP_ExtendedNamedInsured.CP_ExtendedNamedInsured_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLink,strLOB,strRelease_SelectRelease,strRole_SelectRoleAs, test);
				CP_Locations.CP_Locations_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLink,strLOB,strRelease_SelectRelease,strRole_SelectRoleAs, test);
				quote=APPW_CommonMethods.getQuoteNumber(strRegressionIDUnderlined,test);
				WC_PolicyInformation.WC_PolicyInformation_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				WC_StateRatingFactors.WC_StateRatingFactors_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				WC_RatingClassifications.WC_RatingClassifications_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_PremiumIndication.CP_PremiumIndication_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				WC_PremiumModification.WC_PremiumModification_Details(strRegressionIDUnderlined, transaction, suspendSheet, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs, test);
				WC_IndividualsIncluded.WC_IndividualsIncluded_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				WC_UWQuestions.WC_UnderWriter_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				WC_OtherStateInsurance.WC_OtherStateInsurance_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_BillingInformation.CP_BillingInformation_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_Summary.CP_Summary_Details(strRegressionIDUnderlined,strRegressionName, transaction, suspendSheet, strAgentLink, "Workers", strRelease_SelectRelease, strRole_SelectRoleAs,quote, test, file,  workbook);
				

			}

			


			strRegressionIDUnderlined = "RCU_07";
			if (transactionsList.contains("BLNewQuote")) {
				transaction = "NewQuote";String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				APPW_CommonMethods.openAccountDetails(test);
				APPW_CommonMethods.addNewWorkItem("Umbrella", test);
				UnderLying.UM_UnderLying_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				UM_GenInfo.UM_GenInfo_Details(strRegressionIDUnderlined, transaction, suspendSheet,  test);
				quote=APPW_CommonMethods.getQuoteNumber(strRegressionIDUnderlined,test);
				UM_Umbrellalimits.UM_Umbrellalimits_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				UM_ScheduleName.UM_ScheduleName_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				UM_Underwriter.UM_UW_Details(strRegressionIDUnderlined, transaction, suspendSheet, test);
				CP_Summary.CP_Summary_Details(strRegressionIDUnderlined,strRegressionName, transaction, suspendSheet, strAgentLinkTC, "Umbrella", strRelease_SelectRelease, strRole_SelectRoleAs,quote, test, file,  workbook);
				
			}
						
	
			Date PWstartTime = Util.getTime();
			if (transactionsList.contains("BPNewQuote")) {
			transaction = "BPNewQuote";			
			CommonFunPage.PWAppStartUp(test);
			LoginPage.PWAppLogin(strRegressionID, transaction, test);
			}
			
			
			if (transactionsList.contains("BPPWPremiums")) {
				transaction = "BPPWPremiums";		
				PWQuoteOpenPage.PWQuoteForRenewal(CurrentTermPremiums,QFR,CurrentTermPremiumsCA,CurrentTermPremiumsWC,CurrentTermPremiumsUM,QFRPremiumsCA,QFRPremiumsWC,QFRPremiumsUM,strRegressionID, transaction, test);								
			}
			
			if (transactionsList.contains("BPRRSValidationOne")) {
				
				transaction = "BPRRSValidationOne";	
				CommonMethods.newTab(test);
				CommonMethods.switchWindow(1,test);
				CommonFunPage.RRSAppStartUp(test, constants.Env);				
				RateRenewalSheet.RateRenewalSheetMethod(CurrentTermPremiums,CurrentTermPremiumsCA,CurrentTermPremiumsWC,CurrentTermPremiumsUM,strRegressionID, transaction,"CurrentTerm",test);							
				RateRenewalSheet.RateRenewalSheetMethod(QFR,QFRPremiumsCA,QFRPremiumsWC,QFRPremiumsUM,strRegressionID, "BPRRSValidationTwo", "QFR",test);
				
			}
			
			String controlDate = RateRenewalSheet.ControlDate;
			
			if(transactionsList.contains("BPReviseQuote")){				
				transaction = "BPReviseQuote";
				CommonMethods.switchWindow(0,test);
				CommonFunPage.PWAppStartUp(test);
				String policyNum = PWQuoteOpen.policyNumberPackage;
				//String policyNum = "4166696";
				PWQuoteOpenPage.openPendingQuoteInPW(policyNum, controlDate,test);
				CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
				CommonMethods.NavigateTo("Cyber Security", test);
				CommonMethods.NavigateTo("Schedule Rating/IRPM",test);				
				ScheduleRatingIRPMPage.ScheduleRatingIRPM(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);				
				PWQuoteOpenPage.getPremiums(NewQFRPremium,"Package");
				CommonMethods.getCompleteTransaction(strRegressionID, transaction, test);
				
			}
			
			if(transactionsList.contains("CAReviseQuote")){				
				transaction = "CAReviseQuote";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
				String policyNum = PWQuoteOpen.policyNumberCA;
				//String policyNum = "4166698";
				PWQuoteOpenPage.openPendingQuoteInPW(policyNum, controlDate,test);				
				CommonMethods.NavigateTo("Commercial Auto",test);
				CommonMethods.NavigateTo("Schedule Rating (1)",test);					
				CA_ScheduleRatingPage.CA_ScheduleRatingPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);				
				PWQuoteOpenPage.getPremiums(NewQFRPremiumCA,"CA");
				CommonMethods.getCompleteTransaction(strRegressionID, transaction, test);
				
			}
			
			if(transactionsList.contains("WCReviseQuote")){				
				transaction = "WCReviseQuote";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
				String policyNum = PWQuoteOpen.policyNumberWC;
				//String policyNum = "4166700";
				PWQuoteOpenPage.openPendingQuoteInPW(policyNum, controlDate,test);				
				CommonMethods.NavigateTo("Workers Compensation", test);
				CommonMethods.NavigateTo("State Information (3)", test);
				CommonMethods.NavigateTo("Colorado", test);
				CommonMethods.NavigateTo("Waiver of Subrogation", test);
				WCWaiverOfSubrogation.WaiverOfSubrogation(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);	
				PWQuoteOpenPage.getPremiums(NewQFRPremiumWC,"WC");
				CommonMethods.getCompleteTransaction(strRegressionID, transaction, test);
				
			}
			
			if (transactionsList.contains("BPRRSValidationThree")) {
				transaction = "BPRRSValidationThree";
				CommonMethods.switchWindow(1,test);
				RateRenewalSheet.RateRenewalSheetMethod(NewQFRPremium,NewQFRPremiumCA,NewQFRPremiumWC,QFRPremiumsUM,strRegressionID,transaction, "QFR",test);				
				
			}
			
			
			if(transactionsList.contains("BPReviseQuoteTwo")){				
				transaction = "BPReviseQuoteTwo";
				CommonMethods.switchWindow(0,test);
				String policyNum = PWQuoteOpen.policyNumberPackage;	
				//String policyNum = "4174843";
				PWQuoteOpenPage.openPendingQuoteInPW(policyNum,"N/A",test);
				CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
				CommonMethods.NavigateTo("Cyber Security", test);
				CommonMethods.NavigateTo("Schedule Rating/IRPM",test);				
				ScheduleRatingIRPMPage.ScheduleRatingIRPM(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);				
				PWQuoteOpenPage.getPremiums(OldQFRPremium,"Package");
				CommonMethods.getCompleteTransaction(strRegressionID, transaction, test);
				
			}
			
			if(transactionsList.contains("CAReviseQuoteTwo")){				
				transaction = "CAReviseQuoteTwo";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
				String policyNum = PWQuoteOpen.policyNumberCA;
				PWQuoteOpenPage.openPendingQuoteInPW(policyNum,"N/A",test);				
				CommonMethods.NavigateTo("Commercial Auto",test);
				CommonMethods.NavigateTo("Schedule Rating (1)",test);					
				CA_ScheduleRatingPage.CA_ScheduleRatingPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);				
				PWQuoteOpenPage.getPremiums(OldQFRPremium,"CA");
				CommonMethods.getCompleteTransaction(strRegressionID, transaction, test);
				
			}
			
			if(transactionsList.contains("WCReviseQuoteTwo")){				
				transaction = "WCReviseQuoteTwo";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
				String policyNum = PWQuoteOpen.policyNumberWC;
				PWQuoteOpenPage.openPendingQuoteInPW(policyNum,"N/A",test);				
				CommonMethods.NavigateTo("Workers Compensation", test);
				CommonMethods.NavigateTo("State Information (3)", test);
				CommonMethods.NavigateTo("Colorado", test);
				CommonMethods.NavigateTo("Waiver of Subrogation (1)", test);
				WCWaiverOfSubrogation.WaiverOfSubrogation(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);	
				PWQuoteOpenPage.getPremiums(OldQFRPremium,"WC");
				CommonMethods.getCompleteTransaction(strRegressionID, transaction, test);
				
			}
			
			if (transactionsList.contains("BPRRSValidationFour")) {
				transaction = "BPRRSValidationFour";
				CommonMethods.switchWindow(1,test);
				RateRenewalSheet.RateRenewalSheetMethod(OldQFRPremium,OldQFRPremium,OldQFRPremium,OldQFRPremium,strRegressionID,transaction, "OldQFR",test);				
				test.log(LogStatus.INFO, "PW Elapsed Time", "<b>Started Time : "+PWstartTime+"<br> <b>Ended Time : "+Util.getTime()+"<br> <b>Time Taken : "+Util.DiffInTime(PWstartTime, Util.getTime()));
				
			}
			
				} 
				catch (Exception e) {
					e.printStackTrace();
					//se.verify().verifyEquals("CU BP CA WC Regression test  failed", true, false);
					//testTearDown(se);
				}
				
			
			}
}


