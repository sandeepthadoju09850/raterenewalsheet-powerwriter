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
import pw.pages.WC.WC_Deductibles;
import pw.pages.WC.WC_Locations;
import pw.pages.WC.WC_NameLocationLinking;
import pw.pages.WC.WC_StateInformation;
import pw.pages.WC.WC_WCRatingPeriod;
import pw.pages.WC.WC_WorkersCompensation;

public class WC10_MO_WCRegression extends BaseTest {
	ExtentReports extent;
	ExtentTest test;
	
	public static void MO_WCRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		
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
		WC_Deductibles WC_DeductiblesPage = TestPageFactory.initElements(se, WC_Deductibles.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
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
				CommonMethods.NavigateTo("Locations",test);
				WC_LocationsPage.Locations(strRegressionID,transaction,suspendSheet,test);
				WC_WorkersCompensationPage.WorkersCompensation(strRegressionID,transaction,suspendSheet,test);
				WC_NameLocationLinkingPage.NameLocationLinking(strRegressionID,transaction,suspendSheet,test);
				WC_StateInformationPage.StateInformation(strRegressionID,transaction,suspendSheet,test);
				WC_WCRatingPeriodPage.WCRatingPeriod(strRegressionID,transaction,suspendSheet,test);
				WC_ClassificationsPage.Classifications(strRegressionID,transaction,suspendSheet,test);
				WC_DeductiblesPage.Deductibles(strRegressionID,transaction,suspendSheet,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
				CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				
			}
			
			
			//Convert To Policy
			if(transactionsList.contains("ConvertToPolicy")){
				String transaction = "ConvertToPolicy";
				
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			
			// ProRataEndorsement1
				if(transactionsList.contains("ProRataEndorsement1")){
					String transaction = "ProRataEndorsement1";
					String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
					
					CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
					CommonMethods.NavigateTo("Locations (2)",test);
					WC_LocationsPage.Locations(strRegressionID,transaction,suspendSheet,test);
					CommonMethods.NavigateTo("Workers Compensation",test);
					CommonMethods.NavigateTo("State Information (1)",test);
					CommonMethods.NavigateTo("Missouri",test);
					CommonMethods.NavigateTo("Classifications (2)",test);
					WC_ClassificationsPage.Classifications(strRegressionID,transaction,suspendSheet,test);
					CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
					PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
					DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
					CommonMethods.getDashboardActions(strRegressionID,transaction,test);
							
				}
		
				if (transactionsList.contains("ProRataCancellation")) {
					String transaction = "ProRataCancellation";
					
					CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
					CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
					PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
					DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
					CommonMethods.getDashboardActions(strRegressionID, transaction, test);
				}

				if (transactionsList.contains("ProRataReinstatement")) {
					String transaction = "ProRataReinstatement";
										
					CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
					CommonMethods.NavigateToNextScreen(test);
					CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
					PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
					DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
					CommonMethods.getDashboardActions(strRegressionID, transaction, test);
				}

				//Renew1
				if(transactionsList.contains("Renew1")){
					String transaction = "Renew1";
					
					CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
					CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
					PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
					DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
					CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				}
				
				
				//Renew2
				if(transactionsList.contains("Renew2")){
					String transaction = "Renew2";
					
					CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
					CommonMethods.NavigateTo("Workers Compensation",test);
					CommonMethods.NavigateTo("State Information (1)",test);
					CommonMethods.NavigateTo("Missouri",test);
					//CommonMethods.NavigateTo("Classifications (3)",test); (appears this classification change was removed from the WORD doc  10/28/19)
					//WC_ClassificationsPage.Classifications(strRegressionID,transaction,suspendSheet,test); (appears this classification change was removed from the WORD doc  10/28/19)
					CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
					PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
					DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
					CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				}
				
				
				
		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("MO WC Regression test  failed", true, false);
			testTearDown(se);
		}
	}
}
