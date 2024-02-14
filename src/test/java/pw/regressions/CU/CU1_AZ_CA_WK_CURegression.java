package pw.regressions.CU;

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
import pw.pages.CA.CA_AdditionalCoverages;
import pw.pages.CA.CA_AdditionalInterest;
import pw.pages.CA.CA_CommercialAuto;
import pw.pages.CA.CA_ExperienceRating;
import pw.pages.CA.CA_FellowEmployeeCoverage;
import pw.pages.CA.CA_FungiOrBacteriaLiability;
import pw.pages.CA.CA_Locations;
import pw.pages.CA.CA_PickupOrDeliveryCoverage;
import pw.pages.CA.CA_RegistrationPlates;
import pw.pages.CA.CA_RepossessedAutoNone;
import pw.pages.CA.CA_StateCoverageLimits;
import pw.pages.CA.CA_Symbols;
import pw.pages.CA.CA_Vehicles;
import pw.pages.CA.CA_Year2000Endorsements;
import pw.pages.COMMON.CAWC_PW_Producers;
import pw.pages.COMMON.CAWC_ProductInfo;
import pw.pages.COMMON.PW_BillingTab;
import pw.pages.COMMON.PW_CommonFun;
import pw.pages.COMMON.PW_CommonMethods;
import pw.pages.COMMON.PW_GenInfo;
import pw.pages.COMMON.PW_Home;
import pw.pages.COMMON.PW_Login;
import pw.pages.COMMON.PW_PremiumSummary;
import pw.pages.COMMON.PW_Producers;
import pw.pages.CS.CyberSecurity_Main;
import pw.pages.CU.CU_AutoDealersPolicyInfo;
import pw.pages.CU.CU_EmpLiabPolicyInfo;
import pw.pages.CU.CU_GLPolicyInfo;
import pw.pages.CU.CU_Main;
import pw.pages.CU.CU_ScheduleRating;
import pw.pages.CU.CU_UmbrellaOptions;
import pw.pages.WC.WC_Classifications;
import pw.pages.WC.WC_Locations;
import pw.pages.WC.WC_NameLocationLinking;
import pw.pages.WC.WC_StateInformation;
import pw.pages.WC.WC_WorkersCompensation;

public class CU1_AZ_CA_WK_CURegression extends BaseTest {
	ExtentReports extent;
	ExtentTest test;
	
	public static void CU1_AZ_CA_WK_CURegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login  LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		CAWC_ProductInfo ProductInfo = TestPageFactory.initElements(se, CAWC_ProductInfo.class);
		PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
		PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
		CAWC_PW_Producers CAWC_PW_ProducersPage = TestPageFactory.initElements(se, CAWC_PW_Producers.class);
		CU_Main CU_MainPage = TestPageFactory.initElements(se, CU_Main.class);
		CU_EmpLiabPolicyInfo CU_EmpLiabPolicyInfoPage = TestPageFactory.initElements(se, CU_EmpLiabPolicyInfo.class);
		CU_AutoDealersPolicyInfo CUAutoDealersPolicyInfoPage = TestPageFactory.initElements(se, CU_AutoDealersPolicyInfo.class);
		CU_UmbrellaOptions  CUUmbrellaOptionsPage = TestPageFactory.initElements(se, CU_UmbrellaOptions.class);
		CA_CommercialAuto CommercialAuto = TestPageFactory.initElements(se, CA_CommercialAuto.class);
		CA_StateCoverageLimits StateCoverageLimits = TestPageFactory.initElements(se, CA_StateCoverageLimits.class);
		CA_Symbols Symbols = TestPageFactory.initElements(se, CA_Symbols.class);
		CA_Locations Locations = TestPageFactory.initElements(se, CA_Locations.class);
		CA_Vehicles Vehicles = TestPageFactory.initElements(se, CA_Vehicles.class);
		CA_AdditionalCoverages AdditionalCoverages = TestPageFactory.initElements(se, CA_AdditionalCoverages.class);
		CA_FungiOrBacteriaLiability CA_FungiOrBacteriaLiabilityPage = TestPageFactory.initElements(se, CA_FungiOrBacteriaLiability.class);
		CA_FellowEmployeeCoverage CA_FellowEmployeeCoveragePage = TestPageFactory.initElements(se, CA_FellowEmployeeCoverage.class);
		CA_RegistrationPlates CA_RegistrationPlatesPage = TestPageFactory.initElements(se, CA_RegistrationPlates.class);
		CA_Year2000Endorsements CA_Year2000EndorsementsPage = TestPageFactory.initElements(se, CA_Year2000Endorsements.class);
		CA_PickupOrDeliveryCoverage CA_PickupOrDeliveryCoveragePage = TestPageFactory.initElements(se, CA_PickupOrDeliveryCoverage.class);
		CA_AdditionalInterest CA_AdditionalInterestPage = TestPageFactory.initElements(se, CA_AdditionalInterest.class);
		CA_ExperienceRating ExperienceRating = TestPageFactory.initElements(se, CA_ExperienceRating.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		WC_Locations WC_LocationsPage = TestPageFactory.initElements(se, WC_Locations.class);
		WC_WorkersCompensation WC_WorkersCompensationPage = TestPageFactory.initElements(se, WC_WorkersCompensation.class);
		WC_NameLocationLinking WC_NameLocationLinkingPage = TestPageFactory.initElements(se, WC_NameLocationLinking.class);
		WC_StateInformation WC_StateInformationPage = TestPageFactory.initElements(se, WC_StateInformation.class);
		WC_Classifications WC_ClassificationsPage = TestPageFactory.initElements(se, WC_Classifications.class);
		CU_ScheduleRating CU_ScheduleRatingPage = TestPageFactory.initElements(se, CU_ScheduleRating.class);
		CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
		PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);
		try {
			
			List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
			//int iteration = 0;
			CommonFunPage.PWAppStartUp(test);
			
			//New Transaction Actions
			
			if(transactionsList.contains("CANewQuote")){
				String transaction = "CANewQuote";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				LoginPage.PWAppLogin(strRegressionID,transaction,test);
				WelcomePage.homePage(strRegressionID,transaction, test);
				ProductInfo.quote_ProdInfo(strRegressionID,transaction,test);
				CAWC_PW_ProducersPage.AddProducers(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Auto",test);
				CommercialAuto.CommercialAuto(strRegressionID, transaction, suspendSheet, test);
				StateCoverageLimits.StateCoverageLimits(strRegressionID, transaction, suspendSheet, test);
				Symbols.Symbols(strRegressionID, transaction, suspendSheet, test);
				Locations.Locations(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateToNextScreen(test);
				Vehicles.CA_VehiclesPage(strRegressionID, transaction, suspendSheet, test);
				AdditionalCoverages.AdditionalCoverages(strRegressionID, transaction, suspendSheet, test);
				CA_FungiOrBacteriaLiabilityPage.FungiOrBacteriaLiability(strRegressionID, transaction, suspendSheet, test);
				CA_FellowEmployeeCoveragePage.CAFellowEmployeeCoveragePage(strRegressionID, transaction, suspendSheet, test);
				CA_RegistrationPlatesPage.RegistrationPlates(strRegressionID, transaction, suspendSheet, test);
				CA_Year2000EndorsementsPage.Year2000Endorsements(strRegressionID, transaction, suspendSheet, test);
				CA_PickupOrDeliveryCoveragePage.PickupOrDeliveryCoverage(strRegressionID, transaction, suspendSheet, test);
				CA_AdditionalInterestPage.AdditionalInterest(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateToNextScreen(test);
				ExperienceRating.ExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.CollapseAllAndNavigateTo("Commercial Auto", "20-A", test);
				ProductInfo.quote_ProdInfo(strRegressionID,"NewQuote1",test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			} 
			
			// Convert To Policy
			/*if (transactionsList.contains("CAConvertToPolicy")) {
				String transaction = "CAConvertToPolicy";

				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				CommonMethods.getCompleteTransaction(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);

			}*/
			
			if(transactionsList.contains("WCNewQuote")){
				String transaction = "WCNewQuote";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				WelcomePage.homePage(strRegressionID,transaction, test);
				ProductInfo.quote_ProdInfo(strRegressionID,transaction,test);
				CAWC_PW_ProducersPage.AddProducers(strRegressionID,transaction,test);
				CommonMethods.NavigateToNextScreen(test);
				WC_LocationsPage.Locations(strRegressionID,transaction,suspendSheet,test);
				WC_WorkersCompensationPage.WorkersCompensation(strRegressionID,transaction,suspendSheet,test);
				WC_NameLocationLinkingPage.NameLocationLinking(strRegressionID,transaction,suspendSheet,test);
				WC_StateInformationPage.StateInformation(strRegressionID,transaction,suspendSheet,test);
				WC_ClassificationsPage.Classifications(strRegressionID,transaction,suspendSheet,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
				
				
			}
			// Convert To Policy
				/*if (transactionsList.contains("WCConvertToPolicy")) {
					String transaction = "WCConvertToPolicy";

					
					CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
					CommonMethods.getCompleteTransaction(strRegressionID, transaction, test);
					
				}*/
			
				if(transactionsList.contains("CUNewQuote")){
				String transaction = "CUNewQuote";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				WelcomePage.homePage(strRegressionID,transaction, test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				ProducerPage.AddProducers(strRegressionID,transaction,test);
				CommonMethods.NavigateToNextScreen(test);
				CU_MainPage.CU_MainPage(strRegressionID,transaction,suspendSheet,test);
				CommonMethods.NavigateToNextScreen(test);
				CUAutoDealersPolicyInfoPage.AutoDealerPolicyInfo_Main(strRegressionID,transaction, suspendSheet, test);
				CU_EmpLiabPolicyInfoPage.EmpLiabPolicyInfo_Main(strRegressionID,transaction, suspendSheet, test);
				CUUmbrellaOptionsPage.UmbrellaOptions_Main(strRegressionID,transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Schedule Rating/IRPM",test);
				CU_ScheduleRatingPage.CU_ScheduleRatingMethod(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}
			
				if (transactionsList.contains("CAConvertToPolicy")) {
					String transaction = "CAConvertToPolicy";

					WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
					CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
					CommonMethods.getDashboardActions(strRegressionID, "CANewQuote", test);
					CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
					PremiumSummary.CA_GetPremiumSummary(strRegressionID,transaction,transactionsList, file, workbook, test);
					CommonMethods.getDashboardStatus(strRegressionID, transaction, test);

				}
				
				if (transactionsList.contains("WCConvertToPolicy")) {
					String transaction = "WCConvertToPolicy";

					
					WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
					CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
					CommonMethods.getDashboardActions(strRegressionID, "WCNewQuote", test);
					CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
					//PremiumSummary.CA_GetPremiumSummary(strRegressionID,transaction,transactionsList, file, workbook, test);
					PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
					CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
					
				}
				
				if(transactionsList.contains("CUConvertToPolicy")){
				String transaction = "CUConvertToPolicy";
				
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CUNewQuote", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				
			}
			
			
			if(transactionsList.contains("CAProRataEndorsement1")){
				String transaction = "CAProRataEndorsement1";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CAConvertToPolicy", test);
				ProductInfo.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Auto",test);
				CommercialAuto.CommercialAuto(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				
			}
			
				if(transactionsList.contains("CUProRataEndorsement1")){
				String transaction = "CUProRataEndorsement1";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CUConvertToPolicy", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Umbrella", test);
				CU_MainPage.CU_MainPage(strRegressionID,transaction,suspendSheet,test);
				CommonMethods.NavigateTo("Auto/Auto Dealers Policy Information (2)", test);
				CUAutoDealersPolicyInfoPage.AutoDealerPolicyInfo_Main(strRegressionID,transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
			}
			
			if(transactionsList.contains("CAQuoteForRenewal")){
				String transaction = "CAQuoteForRenewal";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CAProRataEndorsement1A", test);
				ProductInfo.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
			}
			
			
			if(transactionsList.contains("WCQuoteForRenewal")){
				String transaction = "WCQuoteForRenewal";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "WCConvertToPolicy", test);
				ProductInfo.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
			}
			
			if(transactionsList.contains("CUQuoteForRenewal")){
				String transaction = "CUQuoteForRenewal";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CUProRataEndorsement1", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Umbrella", test);
				CU_MainPage.CU_MainPage(strRegressionID,transaction,suspendSheet,test);
				CommonMethods.NavigateTo("Auto/Auto Dealers Policy Information (2)", test);
				CUAutoDealersPolicyInfoPage.AutoDealerPolicyInfo_Main(strRegressionID,transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
			}
			
			if(transactionsList.contains("CAConvertQFRToPolicy")){
				String transaction = "CAConvertQFRToPolicy";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CAQuoteForRenewal", test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}
			
			
			if(transactionsList.contains("WCConvertQFRToPolicy")){
				String transaction = "WCConvertQFRToPolicy";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "WCQuoteForRenewal", test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}
			
			
			if(transactionsList.contains("CUConvertQFRToPolicy")){
				String transaction = "CUConvertQFRToPolicy";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CUQuoteForRenewal", test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
				
			}
		}
			catch (Exception e) {
				e.printStackTrace();
				se.verify().verifyEquals("AZ_CURegression test failed", true, false);
				testTearDown(se);
			}
			
		
		}
	}