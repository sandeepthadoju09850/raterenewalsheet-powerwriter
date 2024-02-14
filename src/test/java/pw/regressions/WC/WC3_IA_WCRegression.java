package pw.regressions.WC;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Libraries.automation.common.BaseTest;
import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.SeHelper;
import Libraries.automation.common.Utils.TestPageFactory;
import Libraries.automation.common.framework.Browser.Browsers;
import pw.pages.COMMON.CAWC_AdditionalNamedInsured;
import pw.pages.COMMON.CAWC_PW_Producers;
import pw.pages.COMMON.CAWC_ProductInfo;
import pw.pages.COMMON.PW_BillingTab;
import pw.pages.COMMON.PW_CommonFun;
import pw.pages.COMMON.PW_CommonMethods;
import pw.pages.COMMON.PW_DashboardFormsComparision;
import pw.pages.COMMON.PW_Home;
import pw.pages.COMMON.PW_Login;
import pw.pages.COMMON.PW_PremiumSummary;
import pw.pages.WC.WC_Classifications;
import pw.pages.WC.WC_FinalAuditDetails;
import pw.pages.WC.WC_Locations;
import pw.pages.WC.WC_NameLocationLinking;
import pw.pages.WC.WC_StateInformation;
import pw.pages.WC.WC_WCRatingPeriod;
import pw.pages.WC.WC_WaiverOfSubrogation;
import pw.pages.WC.WC_WorkersCompensation;

public class WC3_IA_WCRegression extends BaseTest {
	ExtentReports extent;
	ExtentTest test;
	public static void IA_WCRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login  LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		CAWC_ProductInfo CAWC_ProductInfoPage = TestPageFactory.initElements(se, CAWC_ProductInfo.class);
		CAWC_PW_Producers CAWCPWProducers = TestPageFactory.initElements(se, CAWC_PW_Producers.class);
		WC_Locations WC_LocationsPage = TestPageFactory.initElements(se, WC_Locations.class);
		WC_WorkersCompensation WC_WorkersCompensationPage = TestPageFactory.initElements(se, WC_WorkersCompensation.class);
		WC_NameLocationLinking WC_NameLocationLinkingPage = TestPageFactory.initElements(se, WC_NameLocationLinking.class);
		WC_StateInformation WC_StateInformationPage = TestPageFactory.initElements(se, WC_StateInformation.class);
		WC_WCRatingPeriod WC_WCRatingPeriodPage = TestPageFactory.initElements(se, WC_WCRatingPeriod.class);
		WC_Classifications WC_ClassificationsPage = TestPageFactory.initElements(se, WC_Classifications.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		WC_FinalAuditDetails WCFinalAuditDetails = TestPageFactory.initElements(se, WC_FinalAuditDetails.class);
		CAWC_AdditionalNamedInsured CAWC_AdditionalNamedInsuredPage  = TestPageFactory.initElements(se, CAWC_AdditionalNamedInsured.class);
		WC_WaiverOfSubrogation WC_WaiverOfSubrogationPage  = TestPageFactory.initElements(se, WC_WaiverOfSubrogation.class);
		PW_DashboardFormsComparision DashboardFormsComparision = TestPageFactory.initElements(se,
				PW_DashboardFormsComparision.class);
		PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);
		
		try {
			List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
			
			//int iteration = 0;
			CommonFunPage.PWAppStartUp(test);
			//New Quote Transaction
			if (transactionsList.contains("NewQuote")) {
				String transaction = "NewQuote";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				LoginPage.PWAppLogin(strRegressionID, transaction, test);
				WelcomePage.homePage(strRegressionID, transaction, test);
				CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CAWCPWProducers.AddProducers(strRegressionID,transaction,test);
				CAWC_AdditionalNamedInsuredPage.AdditionalNamedInsured(strRegressionID,transaction,test);
				WC_LocationsPage.Locations(strRegressionID,transaction,suspendSheet,test);
				WC_WorkersCompensationPage.WorkersCompensation(strRegressionID,transaction,suspendSheet,test);
				WC_NameLocationLinkingPage.NameLocationLinking(strRegressionID,transaction,suspendSheet,test);
				CommonMethods.NavigateToNextScreen(test);
				WC_StateInformationPage.StateInformation(strRegressionID,transaction,suspendSheet,test);
				WC_WCRatingPeriodPage.WCRatingPeriod(strRegressionID,transaction,suspendSheet,test);
				CommonMethods.NavigateTo("Classifications", test);
				WC_ClassificationsPage.Classifications(strRegressionID,transaction,suspendSheet,test);
				CommonMethods.NavigateToNextScreen(test);
				WC_WaiverOfSubrogationPage.WaiverOfSubrogation(strRegressionID,transaction,suspendSheet,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
		
			//Convert To Policy
			if(transactionsList.contains("ConvertToPolicy")){
				String transaction = "ConvertToPolicy";
			
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				CommonMethods.NavigateToNextScreen(test);
				CAWCPWProducers.AddProducers(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Workers Compensation", test);
				CommonMethods.NavigateTo("State Information (1)", test);
				WC_StateInformationPage.StateInformation(strRegressionID,transaction,suspendSheet,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			
			//  QuoteforRenewal
				if(transactionsList.contains("QuoteForRenewal")){
					String transaction = "QuoteForRenewal";
					
					CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
					CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
					PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
					DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
					CommonMethods.getDashboardActions(strRegressionID,transaction,test);
							
				}
				
				//ReviseQFR
				if(transactionsList.contains("ReviseQFR")){
					String transaction = "ReviseQFR";
					String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
					CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
					CommonMethods.NavigateTo("Workers Compensation", test);
					CommonMethods.NavigateTo("State Information (1)", test);
					CommonMethods.NavigateTo("Iowa", test);
					CommonMethods.NavigateTo("Classifications (3)", test);
					WC_ClassificationsPage.Classifications(strRegressionID,transaction,suspendSheet,test);
					CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
					PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
					DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
					CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				}	
				
				//ConvertQFRToPolicy
				if(transactionsList.contains("ConvertQFRToPolicy")){
					String transaction = "ConvertQFRToPolicy";
					
					CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
					PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
					DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
					CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				}
			
				
				//FinalAudit
				if(transactionsList.contains("FinalAudit1")){
					String transaction = "FinalAudit1";
					String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
					
					CommonMethods.waitforSpinner(test);
					CommonMethods.NavigateToNextScreen(test);
					CommonMethods.ClickOkOnNotification(test);
					CommonMethods.NavigateTo("Audit Details",test);
					WCFinalAuditDetails.FinalAuditDetails(strRegressionID,transaction,suspendSheet,test);
					CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
					PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
					DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
					CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				}
				
				if(transactionsList.contains("ReverseEndorsement")){
					String transaction = "ReverseEndorsement";
					
					CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
					CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
					PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
					DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
					CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				}
				
				if(transactionsList.contains("FlatEndorsement1")){
					String transaction = "FlatEndorsement1";
					String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
					
					CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
					CommonMethods.NavigateTo("Workers Compensation", test);
					CommonMethods.NavigateTo("State Information (1)", test);
					CommonMethods.NavigateTo("Iowa", test);
					CommonMethods.NavigateTo("Classifications (3)", test);
					WC_ClassificationsPage.Classifications(strRegressionID,transaction,suspendSheet,test);
					CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
					PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
					DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
					CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				}
				
				
				if(transactionsList.contains("FinalAudit2")){
					String transaction = "FinalAudit2";
					String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
					
					CommonMethods.waitforSpinner(test);
					CommonMethods.NavigateToNextScreen(test);
					CommonMethods.ClickOkOnNotification(test);
					CommonMethods.NavigateTo("Audit Details",test);
					WCFinalAuditDetails.FinalAuditDetails(strRegressionID,transaction,suspendSheet,test);
					CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
					PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
					DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
					CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				}
				
				
				
		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("IA WC Regression test  failed", true, false);
			testTearDown(se);
		}
	}
}
