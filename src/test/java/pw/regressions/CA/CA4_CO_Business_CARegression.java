package pw.regressions.CA;

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
import Libraries.automation.common.framework.Util;
import Libraries.automation.common.framework.Browser.Browsers;
import pw.pages.CA.CA_AdditionalCoverages;
import pw.pages.CA.CA_AutoAdditionalInsuredWRAP;
import pw.pages.CA.CA_CommercialAuto;
import pw.pages.CA.CA_Drivers;
import pw.pages.CA.CA_ExperienceRating;
import pw.pages.CA.CA_HiredOrBorrowedAuto;
import pw.pages.CA.CA_LiabilityExperienceRating;
import pw.pages.CA.CA_Locations;
import pw.pages.CA.CA_NonOwnedLiability;
import pw.pages.CA.CA_PhysicalDamageExperienceRating;
import pw.pages.CA.CA_RepossessedAutoNone;
import pw.pages.CA.CA_ScheduleRating;
import pw.pages.CA.CA_StateCoverageLimits;
import pw.pages.CA.CA_Symbols;
import pw.pages.CA.CA_Vehicles;
import pw.pages.COMMON.CAWC_ProductInfo;
import pw.pages.COMMON.PW_BillingTab;
import pw.pages.COMMON.PW_CommonFun;
import pw.pages.COMMON.PW_CommonMethods;
import pw.pages.COMMON.PW_DashboardFormsComparision;
import pw.pages.COMMON.PW_Home;
import pw.pages.COMMON.PW_Login;
import pw.pages.COMMON.PW_PremiumSummary;
import pw.pages.COMMON.PW_Producers;


public class CA4_CO_Business_CARegression extends BaseTest {
	ExtentReports extent;
	ExtentTest test;
	

	
	public static void CO_Business_CARegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		CAWC_ProductInfo ProductInfo = TestPageFactory.initElements(se, CAWC_ProductInfo.class);
		
		//PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
		PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
		CA_CommercialAuto CommercialAuto = TestPageFactory.initElements(se, CA_CommercialAuto.class);
		CA_StateCoverageLimits StateCoverageLimits = TestPageFactory.initElements(se, CA_StateCoverageLimits.class);
		CA_Symbols Symbols = TestPageFactory.initElements(se, CA_Symbols.class);
		CA_Locations Locations = TestPageFactory.initElements(se, CA_Locations.class);
		CA_Drivers Drivers = TestPageFactory.initElements(se, CA_Drivers.class);
		CA_Vehicles Vehicles = TestPageFactory.initElements(se, CA_Vehicles.class);
		CA_AdditionalCoverages AdditionalCoverages = TestPageFactory.initElements(se, CA_AdditionalCoverages.class);
		CA_HiredOrBorrowedAuto HiredOrBorrowedAuto = TestPageFactory.initElements(se, CA_HiredOrBorrowedAuto.class);
		CA_NonOwnedLiability NonOwnedLiability = TestPageFactory.initElements(se, CA_NonOwnedLiability.class);
		CA_ExperienceRating ExperienceRating = TestPageFactory.initElements(se, CA_ExperienceRating.class);
		CA_LiabilityExperienceRating LiabilityExperienceRating = TestPageFactory.initElements(se, CA_LiabilityExperienceRating.class);
		CA_PhysicalDamageExperienceRating PhysicalDamageExperienceRating = TestPageFactory.initElements(se, CA_PhysicalDamageExperienceRating.class);
		CA_ScheduleRating ScheduleRating = TestPageFactory.initElements(se, CA_ScheduleRating.class);	
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		CA_RepossessedAutoNone CA_RepossessedAutoNonePage = TestPageFactory.initElements(se, CA_RepossessedAutoNone.class);
		CA_AutoAdditionalInsuredWRAP CA_AutoAdditionalInsuredWRAPPage = TestPageFactory.initElements(se, CA_AutoAdditionalInsuredWRAP.class);
		PW_DashboardFormsComparision DashboardFormsComparision = TestPageFactory.initElements(se,
				PW_DashboardFormsComparision.class);
		PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);
		
		/*NewQuote
		ConvertToPolicy
		FlatEndorsement1
		FlatCancellation
		Reinstatement
		QuoteForRenewal
		ConvertQFRToPolicy
		ProRataEndorsement1*/
		
		try {
			List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
			//int iteration = 0;
				CommonFunPage.PWAppStartUp(test);
			
			//New Transaction Actions
			
			if (transactionsList.contains("NewQuote")) {
				String transaction = "NewQuote";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				LoginPage.PWAppLogin(strRegressionID, transaction, test);
				WelcomePage.homePage(strRegressionID, transaction, test);
				ProductInfo.quote_ProdInfo(strRegressionID, transaction, test);
				ProducerPage.AddProducers(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Auto",test);
				CommercialAuto.CommercialAuto(strRegressionID, transaction, suspendSheet, test);
				StateCoverageLimits.StateCoverageLimits(strRegressionID, transaction, suspendSheet, test);
				Symbols.Symbols(strRegressionID, transaction, suspendSheet, test);
				Locations.Locations(strRegressionID, transaction, suspendSheet, test);
				Drivers.Drivers(strRegressionID, transaction, suspendSheet, test);
				Vehicles.CA_VehiclesPage(strRegressionID, transaction, suspendSheet, test);
				AdditionalCoverages.AdditionalCoverages(strRegressionID, transaction, suspendSheet, test);
				HiredOrBorrowedAuto.HiredOrBorrowedAuto(strRegressionID, transaction, suspendSheet, test);
				NonOwnedLiability.CANonOwnedLiabilityPage(strRegressionID, transaction, suspendSheet, test);
				CA_RepossessedAutoNonePage.RepossessedAutoNone(strRegressionID, transaction, suspendSheet, test);
				CA_AutoAdditionalInsuredWRAPPage.AutoAdditionalInsuredWRAP(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Experience Rating",test);
				ExperienceRating.ExperienceRating(strRegressionID, transaction, suspendSheet, test);
				LiabilityExperienceRating.LiabilityExperienceRating(strRegressionID, transaction, suspendSheet, test);
				PhysicalDamageExperienceRating.PhysicalDamageExperienceRating(strRegressionID, transaction, suspendSheet, test);
				ScheduleRating.CA_ScheduleRatingPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				String quoteNumber = Util.getQuoteNumber(strRegressionID,transaction);
				CommonMethods.CollapseAll(quoteNumber,test);
				ProductInfo.quote_ProdInfo(strRegressionID, "NewQuote1", test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);			
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
					
			}
			// Convert To Quote
			if (transactionsList.contains("ConvertToPolicy")) {
				String transaction = "ConvertToPolicy";
				
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}
			// ProRataEndorsement1
			if (transactionsList.contains("FlatEndorsement1")) {
				String transaction = "FlatEndorsement1";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				ProductInfo.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Auto", test);
				CommonMethods.NavigateTo("Covered Auto Symbols", test);
				Symbols.Symbols(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Vehicles (2)", test);
				Vehicles.CA_VehiclesPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			
			}
			
			// ProRataCancellation			
			if (transactionsList.contains("FlatCancellation")) {
				String transaction = "FlatCancellation";
				ProductInfo.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}
			
			// Reinstatement			
			if (transactionsList.contains("Reinstatement")) {
				String transaction = "Reinstatement";
				CommonMethods.NavigateToNextScreen(test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}
			
			// QuoteForRenewal
			if (transactionsList.contains("QuoteForRenewal")) {
				String transaction = "QuoteForRenewal";
				ProductInfo.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}
			// Convert QFR To Policy
			if (transactionsList.contains("ConvertQFRToPolicy")) {
				String transaction = "ConvertQFRToPolicy";
				ProductInfo.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}
			
			if (transactionsList.contains("ProRataEndorsement1")) {
				String transaction = "ProRataEndorsement1";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				ProductInfo.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Auto",test);
				CommonMethods.NavigateTo("Vehicles (3)", test);
				Vehicles.CA_VehiclesPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}
						
					
				} 
				catch (Exception e) {
					e.printStackTrace();
					se.verify().verifyEquals("AZ_TCRegression test  failed", true, false);
					testTearDown(se);
				}
				
			
			}
}


