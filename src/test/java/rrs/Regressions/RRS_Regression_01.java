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
import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.SeHelper;
import Libraries.automation.common.Utils.TestPageFactory;
import Libraries.automation.common.framework.Browser.Browsers;
import Libraries.automation.common.framework.Util;
import ap.Constants.constants;
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
			

			//CommonAPMethods BT=TestPageFactory.initElements(se, CommonAPMethods.class);
			AP_Login  BLLoginPage = TestPageFactory.initElements(se, AP_Login.class);
				
			
				String transaction = "NewQuote";
				String strRegressionIDUnderlined = "CUSL_01";
				System.out.println(strRegressionID);
				
				//List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
				List<Map<String, String>> table = ExcelOperations.getBLPagesData(constants.loginPageName, strRegressionID,transaction);
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(0);
				String strAgentLink = (String) row.get("AgentLink");
				String strLOB = (String) row.get("LOB_Select");
				String strRole_SelectRoleAs = (String) row.get("Select_RoleAs");
				String strRelease_SelectRelease = (String) row.get("Select_Release");
				

				//List<Map<String, String>> tableSL = ExcelOperations.getPagesData(constants.loginPageName, strRegressionIDUnderlined,transaction);
				//LinkedHashMap<String, String> rowSL = (LinkedHashMap<String, String>) tableSL.get(0);
				//String strAgentLinkSL = (String) rowSL.get("AgentLink");

				// UNDERLYING POLICY (SL CO) NEW QUOTE TRANSACTION
				
						if (transactionsList.contains("BLNewQuote")) {
							String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
							
						BLLoginPage.APAppLogin(strRegressionIDUnderlined,   transaction,"Yes", test);
						
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


