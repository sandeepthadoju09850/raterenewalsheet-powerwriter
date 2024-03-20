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

import Libraries.ap.automation.common.CommonAPMethods;
import Libraries.ap.automation.common.SystemPropertyUtil;
import Libraries.automation.common.BaseTest;
import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.SeHelper;
import Libraries.automation.common.Utils.TestPageFactory;
import Libraries.automation.common.framework.Browser.Browsers;
import Libraries.automation.common.framework.Util;
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
import ap.pages.CP.CP_AccReceivableSchedule;
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
import ap.pages.CP.CP_SignsScheduleInfo;
import ap.pages.CP.CP_Summary;
import ap.pages.CP.CP_UnderWriter;
import ap.pages.CP.CP_ValuablePapers;
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
import ap.Constants.constants;
import ap.OR.OR_CP;
//import pw.Constants.constants;
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
		
		try {
			List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
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
			OR_CP ORCP = TestPageFactory.initElements(se, OR_CP.class);

			CommonAPMethods BT=TestPageFactory.initElements(se, CommonAPMethods.class);
			AP_Login  BLLoginPage = TestPageFactory.initElements(se, AP_Login.class);
			
				String transaction = "NewQuote";
				String strRegressionIDUnderlined = "CUBP_15";
				List<Map<String, String>> table = ExcelOperations.getPagesData(constants.loginPageName, strRegressionID,transaction);
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(0);
				String strAgentLink = (String) row.get("AgentLink");
				String strLOB = (String) row.get("LOB_Select");
				String strRole_SelectRoleAs = (String) row.get("Select_RoleAs");
				String strRelease_SelectRelease = (String) row.get("Select_Release");
				
				List<Map<String, String>> tableBP = ExcelOperations.getPagesData(constants.loginPageName, strRegressionIDUnderlined,transaction);
				LinkedHashMap<String, String> rowBP = (LinkedHashMap<String, String>) tableBP.get(0);
				String strAgentLinkBP = (String) rowBP.get("AgentLink");
				String strLOBBP = (String) rowBP.get("LOB_Select");
				String strRole_SelectRoleAsBP = (String) rowBP.get("Select_RoleAs");
				String strRelease_SelectReleaseBP = (String) rowBP.get("Select_Release");
				
				  // UNDERLYING POLICY 1 CUBP_15 NEW QUOTE TRANSACTION 
				if(transactionsList.contains("NewQuote")) { transaction = "NewQuote";String
				  suspendSheet =
				  ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				  BLLoginPage.APAppLogin(strRegressionIDUnderlined, transaction,"Yes", test);
				  BLLoginPage.APLogoutDetails( strAgentLink,test );
				  }
				 

				// UNDERLYING POLICY 2 CUCA_12 NEW QUOTE TRANSACTION
			
	
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
					se.verify().verifyEquals("CU BP CA WC Regression test  failed", true, false);
					testTearDown(se);
				}
				
			
			}
}


