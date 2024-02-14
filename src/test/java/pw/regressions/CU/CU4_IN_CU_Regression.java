package pw.regressions.CU;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.relevantcodes.extentreports.ExtentTest;

import Libraries.automation.common.BaseTest;
import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.SeHelper;
import Libraries.automation.common.Utils.TestPageFactory;
import Libraries.automation.common.framework.Browser.Browsers;
import pw.pages.CA.CA_AdditionalCoverages;
import pw.pages.CA.CA_AutoAdditionalInsuredWRAP;
import pw.pages.CA.CA_CommercialAuto;
import pw.pages.CA.CA_ExperienceRating;
import pw.pages.CA.CA_FellowEmployeeCoverage;
import pw.pages.CA.CA_NonOwnedLiability;
import pw.pages.CA.CA_RepossessedAutoNone;
import pw.pages.CA.CA_StateCoverageLimits;
import pw.pages.CA.CA_Symbols;
import pw.pages.CA.CA_Vehicles;
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
import pw.pages.CU.CU_GLPolicyInfo;
import pw.pages.CU.CU_Main;
import pw.pages.CU.CU_ManualFactors;
import pw.pages.CU.CU_SECURAManuscript;
import pw.pages.CU.CU_ScheduleRating;
import pw.pages.CU.CU_UmbrellaOptions;

public class CU4_IN_CU_Regression extends BaseTest{
	public static void CU4_IN_CU_RegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login  LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		CAWC_ProductInfo ProductInfo = TestPageFactory.initElements(se, CAWC_ProductInfo.class);
		CAWC_PW_Producers CAWCPWProducers = TestPageFactory.initElements(se, CAWC_PW_Producers.class);
		CA_CommercialAuto CommercialAuto = TestPageFactory.initElements(se, CA_CommercialAuto.class);
		CA_StateCoverageLimits StateCoverageLimits = TestPageFactory.initElements(se, CA_StateCoverageLimits.class);
		CA_Symbols Symbols = TestPageFactory.initElements(se, CA_Symbols.class);
		CA_Vehicles Vehicles = TestPageFactory.initElements(se, CA_Vehicles.class);
		CA_AdditionalCoverages AdditionalCoverages = TestPageFactory.initElements(se, CA_AdditionalCoverages.class);
		CA_RepossessedAutoNone CA_RepossessedAutoNonePage = TestPageFactory.initElements(se, CA_RepossessedAutoNone.class);
		CA_ExperienceRating ExperienceRating = TestPageFactory.initElements(se, CA_ExperienceRating.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
		PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
		CU_Main CU_MainPage = TestPageFactory.initElements(se, CU_Main.class);
		CU_AutoDealersPolicyInfo CUAutoDealersPolicyInfoPage = TestPageFactory.initElements(se, CU_AutoDealersPolicyInfo.class);
		CU_UmbrellaOptions  CUUmbrellaOptionsPage = TestPageFactory.initElements(se, CU_UmbrellaOptions.class);
		CU_ManualFactors CUManualFactorsPage = TestPageFactory.initElements(se, CU_ManualFactors.class);
		CU_SECURAManuscript CUSecuraManuscriptPage = TestPageFactory.initElements(se, CU_SECURAManuscript.class);
		CA_FellowEmployeeCoverage CA_FellowEmployeeCoveragePage = TestPageFactory.initElements(se, CA_FellowEmployeeCoverage.class);
		CA_NonOwnedLiability CA_NonOwnedLiabilityPage = TestPageFactory.initElements(se, CA_NonOwnedLiability.class);
		CA_AutoAdditionalInsuredWRAP CA_AutoAdditionalInsuredWRAPPage = TestPageFactory.initElements(se, CA_AutoAdditionalInsuredWRAP.class);
		CU_ScheduleRating CU_ScheduleRatingPage = TestPageFactory.initElements(se, CU_ScheduleRating.class);
		CU_GLPolicyInfo CU_GLPolicyInfoPage = TestPageFactory.initElements(se, CU_GLPolicyInfo.class);
		CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
		PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);
		try {
			
			List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
			//int iteration = 0;
			CommonFunPage.PWAppStartUp(test);
		
		//CA NEWQUOTE
		if(transactionsList.contains("CANewQuote")){
			String transaction = "CANewQuote";
			String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
			LoginPage.PWAppLogin(strRegressionID,transaction,test);
			WelcomePage.homePage(strRegressionID,transaction, test);
			ProductInfo.quote_ProdInfo(strRegressionID,transaction,test);
			CAWCPWProducers.AddProducers(strRegressionID,transaction,test);
			CommonMethods.NavigateTo("Commercial Auto",test);
			CommercialAuto.CommercialAuto(strRegressionID, transaction, suspendSheet, test);
			StateCoverageLimits.StateCoverageLimits(strRegressionID, transaction, suspendSheet, test);
			Symbols.Symbols(strRegressionID, transaction, suspendSheet, test);
			CommonMethods.NavigateTo("Vehicles",test);
			Vehicles.CA_VehiclesPage(strRegressionID, transaction, suspendSheet, test);
			CommonMethods.NavigateTo("Additional Coverages",test);
			AdditionalCoverages.AdditionalCoverages(strRegressionID, transaction, suspendSheet, test);
			CA_FellowEmployeeCoveragePage.CAFellowEmployeeCoveragePage(strRegressionID, transaction, suspendSheet, test);
			CA_NonOwnedLiabilityPage.CANonOwnedLiabilityPage(strRegressionID, transaction, suspendSheet, test);
			CA_AutoAdditionalInsuredWRAPPage.AutoAdditionalInsuredWRAP(strRegressionID, transaction, suspendSheet, test);
			CommonMethods.NavigateToNextScreen(test);
			//CommonMethods.NavigateToNextScreen(test);
			ExperienceRating.ExperienceRating(strRegressionID, transaction, suspendSheet, test);
			CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
			PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
			BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
			CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
		
		}
		
		//CU NEWQUOTE
		if(transactionsList.contains("CUNewQuote")){
			String transaction = "CUNewQuote";
			String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
			WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
			WelcomePage.homePage(strRegressionID,transaction, test);
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			ProducerPage.AddProducers(strRegressionID,transaction,test);
			CommonMethods.NavigateTo("Commercial Umbrella",test);
			CU_MainPage.CU_MainPage(strRegressionID,transaction,suspendSheet,test);
			CU_GLPolicyInfoPage.generalLiabPolicyInfo_Main(strRegressionID,transaction,suspendSheet,test);
			CUAutoDealersPolicyInfoPage.AutoDealerPolicyInfo_Main(strRegressionID, transaction,suspendSheet, test);
			CommonMethods.NavigateTo("Umbrella Options",test);
			CUUmbrellaOptionsPage.UmbrellaOptions_Main(strRegressionID, transaction,suspendSheet, test);
			CommonMethods.NavigateTo("SECURA Manuscript",test);
			CUSecuraManuscriptPage.SECURAManuscript_Main(strRegressionID, transaction,suspendSheet, test);
			CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
			PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
			BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
			CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
		}
	
	

		//CA CONVERTTOPOLICY
		
		if(transactionsList.contains("CAConvertToPolicy")){
			String transaction = "CAConvertToPolicy";
			WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
			CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
			CommonMethods.getDashboardActions(strRegressionID, "CANewQuote", test);
			CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
			PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
			CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
				
		}
		
		//CU CONVERTTOPOLICY
		
		if(transactionsList.contains("CUConvertToPolicy")){
			String transaction = "CUConvertToPolicy";
			WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
			CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
			CommonMethods.getDashboardActions(strRegressionID, "CUNewQuote", test);
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
			PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
			CommonMethods.getDashboardActions(strRegressionID, "CUConvertToPolicy", test);
			
		}
		
		//CU FlatEndorsement1
		if(transactionsList.contains("CUFlatEndorsement1")){
			String transaction = "CUFlatEndorsement1";
			
			//CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
			//CommonMethods.getDashboardActions(strRegressionID, "CUNewQuote", test);
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			CommonMethods.NavigateTo("Schedule Rating/IRPM", test);
			CU_ScheduleRatingPage.CU_ScheduleRatingMethod(strRegressionID, transaction, test); 
			CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
			PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
			CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			
		}
		
		//CA QUOTEFORRENEWAL
		if(transactionsList.contains("CAQuoteForRenewal")){
			String transaction = "CAQuoteForRenewal";
			String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
			WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
			CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
			CommonMethods.getDashboardActions(strRegressionID, "CAConvertToPolicy", test);
			ProductInfo.quote_ProdInfo(strRegressionID,transaction,test);
			CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
			PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
			CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			
		}
		
		//CU QUOTEFORRENEWAL

		if(transactionsList.contains("CUQuoteForRenewal")){
			String transaction = "CUQuoteForRenewal";
			String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
			WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
			CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
			CommonMethods.getDashboardActions(strRegressionID, "CUFlatEndorsement1", test);
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			CommonMethods.NavigateTo("Commercial Umbrella", test);
			CU_MainPage.CU_MainPage(strRegressionID,transaction,suspendSheet,test);
			//Code newly added
			CommonMethods.NavigateTo("Umbrella Options", test);
			CUUmbrellaOptionsPage.UmbrellaOptions_Main(strRegressionID, transaction, suspendSheet, test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
			CommonMethods.getDashboardForms(strRegressionID, transaction, test);
			CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			
		}
		
		//CA CONVERTQFRTOPOLICY
		if(transactionsList.contains("CAConvertQFRToPolicy")){
			String transaction = "CAConvertQFRToPolicy";
			WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
			CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
			CommonMethods.getDashboardActions(strRegressionID, "CAQuoteForRenewal", test);
			CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
			PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
			CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			
		}
		
		//CU CONVERTQFRTOPOLICY
		if(transactionsList.contains("CUConvertQFRToPolicy")){
			String transaction = "CUConvertQFRToPolicy";
			WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
			CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
			CommonMethods.getDashboardActions(strRegressionID, "CUQuoteForRenewal", test);
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			CommonMethods.NavigateTo("Schedule Rating/IRPM", test);
			CU_ScheduleRatingPage.CU_ScheduleRatingMethod(strRegressionID, transaction, test); 
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			
		}
		
		
		} 
		catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("IN_CURegression test failed", true, false);
			testTearDown(se);
		}
		
	
	}

}
