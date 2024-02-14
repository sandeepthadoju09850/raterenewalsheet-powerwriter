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
import pw.pages.WC.WC000308;
import pw.pages.WC.WC000310;
import pw.pages.WC.WC_Classifications;
import pw.pages.WC.WC_Deductibles;
import pw.pages.WC.WC_FinalAuditDetails;
import pw.pages.WC.WC_Locations;
import pw.pages.WC.WC_OptionalEndorsements;
import pw.pages.WC.WC_StateInformation;
import pw.pages.WC.WC_WorkersCompensation;

public class WC14_MultiState_WCRegression extends BaseTest {
	ExtentReports extent;
	ExtentTest test;
	public static void MultiState_WCRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login  LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		CAWC_ProductInfo CAWC_ProductInfoPage = TestPageFactory.initElements(se, CAWC_ProductInfo.class);
		CAWC_PW_Producers CAWCPWProducers = TestPageFactory.initElements(se, CAWC_PW_Producers.class);
		CAWC_AdditionalNamedInsured CAWC_AdditionalNamedInsuredPage  = TestPageFactory.initElements(se, CAWC_AdditionalNamedInsured.class);
		WC_Locations WC_LocationsPage = TestPageFactory.initElements(se, WC_Locations.class);
		WC_WorkersCompensation WC_WorkersCompensationPage = TestPageFactory.initElements(se, WC_WorkersCompensation.class);
		WC_StateInformation WC_StateInformationPage = TestPageFactory.initElements(se, WC_StateInformation.class);
		WC_Classifications WC_ClassificationsPage = TestPageFactory.initElements(se, WC_Classifications.class);
		WC_Deductibles WC_DeductiblesPage = TestPageFactory.initElements(se, WC_Deductibles.class);
		WC_OptionalEndorsements WC_OptionalEndorsementsPage = TestPageFactory.initElements(se, WC_OptionalEndorsements.class);
		WC000308 WC000308Page = TestPageFactory.initElements(se, WC000308.class);
		WC000310 WC000310Page  = TestPageFactory.initElements(se, WC000310.class);
		WC_FinalAuditDetails WC_FinalAuditDetailsPage = TestPageFactory.initElements(se, WC_FinalAuditDetails.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		PW_DashboardFormsComparision DashboardFormsComparision = TestPageFactory.initElements(se,
				PW_DashboardFormsComparision.class);
		PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);
		
		try {
			List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
			
			//int iteration = 0;
			CommonFunPage.PWAppStartUp(test);
			//New Quote
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
				CommonMethods.NavigateTo("State Information", test);
				WC_StateInformationPage.StateInformation(strRegressionID,"NewQuote1",suspendSheet,test);
				CommonMethods.NavigateTo("Classifications", test);
				WC_ClassificationsPage.Classifications(strRegressionID,"NewQuote1",suspendSheet,test);
				CommonMethods.CollapseAllAndNavigateTo("Workers Compensation", "20-WC", test);
				
				CommonMethods.NavigateTo("State Information (1)", test);
				WC_StateInformationPage.StateInformation(strRegressionID,"NewQuote2",suspendSheet,test);
				CommonMethods.CollapseAllAndNavigateTo("Workers Compensation", "20-WC", test);
				CommonMethods.NavigateTo("State Information (2)", test);
				CommonMethods.NavigateTo("Kansas", test);
				CommonMethods.NavigateTo("Classifications", test);
				WC_ClassificationsPage.Classifications(strRegressionID,"NewQuote2",suspendSheet,test);
				WC_DeductiblesPage.Deductibles(strRegressionID,"NewQuote2",suspendSheet,test);
				
				CommonMethods.CollapseAllAndNavigateTo("Workers Compensation", "20-WC", test);
				CommonMethods.NavigateTo("State Information (2)", test);
				WC_StateInformationPage.StateInformation(strRegressionID,"NewQuote3",suspendSheet,test);
				CommonMethods.CollapseAllAndNavigateTo("Workers Compensation", "20-WC", test);
				CommonMethods.NavigateTo("State Information (3)", test);
				CommonMethods.NavigateTo("Illinois", test);
				CommonMethods.NavigateTo("Classifications", test);
				WC_ClassificationsPage.Classifications(strRegressionID,"NewQuote3",suspendSheet,test);
				WC_DeductiblesPage.Deductibles(strRegressionID,"NewQuote3",suspendSheet,test);
				
				
				CommonMethods.CollapseAllAndNavigateTo("Workers Compensation", "20-WC", test);
				CommonMethods.NavigateTo("State Information (3)", test);
				WC_StateInformationPage.StateInformation(strRegressionID,"NewQuote4",suspendSheet,test);
				CommonMethods.CollapseAllAndNavigateTo("Workers Compensation", "20-WC", test);
				CommonMethods.NavigateTo("State Information (4)", test);
				CommonMethods.NavigateTo("Iowa", test);
				CommonMethods.NavigateTo("Classifications", test);
				WC_ClassificationsPage.Classifications(strRegressionID,"NewQuote4",suspendSheet,test);
				WC_DeductiblesPage.Deductibles(strRegressionID,"NewQuote4",suspendSheet,test);
				
				CommonMethods.CollapseAllAndNavigateTo("Workers Compensation", "20-WC", test);
				CommonMethods.NavigateTo("Optional Endorsements", test);
				WC_OptionalEndorsementsPage.OptionalEndorsements(strRegressionID,transaction,suspendSheet,test);
				WC000308Page.WC000308Page(strRegressionID,transaction,suspendSheet,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			
			//Convert To Policy
			if(transactionsList.contains("ConvertToPolicy")){
				String transaction = "ConvertToPolicy";
				CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			// FlatEndorsement1

			if(transactionsList.contains("FlatEndorsement1")){
				String transaction = "FlatEndorsement1";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Workers Compensation", test);
				CommonMethods.NavigateTo("State Information (4)", test);
				CommonMethods.NavigateTo("Illinois", test);
				CommonMethods.NavigateTo("Classifications (4)", test);
				WC_ClassificationsPage.Classifications(strRegressionID,transaction,suspendSheet,test);
				CommonMethods.CollapseAllAndNavigateTo("Workers Compensation", "20-WC", test);
				CommonMethods.NavigateTo("Optional Endorsements", test);
				WC_OptionalEndorsementsPage.OptionalEndorsements(strRegressionID,transaction,suspendSheet,test);
				WC000308Page.WC000308Page(strRegressionID,transaction,suspendSheet,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				
				
			}
			
			// Flat Cancellation
			if(transactionsList.contains("FlatCancellation")){
				String transaction = "FlatCancellation";
			    CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				
							
			}
						
			// Flat Reinstatement
			if(transactionsList.contains("FlatReinstatement")){
				String transaction = "FlatReinstatement";
				CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				
							
			}
						
			//Quote For Renewal
			if(transactionsList.contains("QuoteForRenewal")){
				String transaction = "QuoteForRenewal";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Locations (4)", test);
				WC_LocationsPage.Locations(strRegressionID,transaction,suspendSheet,test);
				CommonMethods.NavigateTo("State Information (4)", test);
				WC_StateInformationPage.StateInformation(strRegressionID,transaction,suspendSheet,test);
				CommonMethods.NavigateTo("State Information (3)", test);
				//CommonMethods.NavigateTo("Kansas", test);
				//CommonMethods.NavigateTo("Classifications (4)", test);
				//WC_ClassificationsPage.Classifications(strRegressionID,transaction,suspendSheet,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				
							
			}
						
			//Convert QFR To Policy
			if(transactionsList.contains("ConvertQFRToPolicy")){
				String transaction = "ConvertQFRToPolicy";
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				
							
			}
			
			//FlatEndorsement2
			if(transactionsList.contains("FlatEndorsement2")){
				String transaction = "FlatEndorsement2";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Workers Compensation", test);
				WC_WorkersCompensationPage.WorkersCompensation(strRegressionID,transaction,suspendSheet,test);
				CommonMethods.NavigateTo("Optional Endorsements", test);
				WC_OptionalEndorsementsPage.OptionalEndorsements(strRegressionID,transaction,suspendSheet,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				
							
			}
			
			//ProRataEndorsment1
			if(transactionsList.contains("ProRataEndorsement1")){
				String transaction = "ProRataEndorsement1";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Workers Compensation", test);
				WC_WorkersCompensationPage.WorkersCompensation(strRegressionID,transaction,suspendSheet,test);
				CommonMethods.NavigateTo("Optional Endorsements", test);
				WC_OptionalEndorsementsPage.OptionalEndorsements(strRegressionID,transaction,suspendSheet,test);
				WC000310Page.WC000310Page(strRegressionID,transaction,suspendSheet,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				
							
			}
			
			//Final Audit
			if(transactionsList.contains("FinalAudit")){
				String transaction = "FinalAudit";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				CommonMethods.waitforSpinner(test);
				CommonMethods.NavigateToNextScreen(test);
				CommonMethods.ClickOkOnNotification(test);
				CommonMethods.NavigateTo("Audit Details",test);
				WC_FinalAuditDetailsPage.FinalAuditDetails(strRegressionID,transaction,suspendSheet,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				
							
			}
				
			
			
				
		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("Multi State WC Regression test  failed", true, false);
			testTearDown(se);
		}
	}

}




