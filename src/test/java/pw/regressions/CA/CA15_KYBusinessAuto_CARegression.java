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
import Libraries.automation.common.framework.Browser.Browsers;
import pw.pages.CA.CA_AdditionalCoverages;
import pw.pages.CA.CA_AutoBodyManufacturersaAndInstal;
import pw.pages.CA.CA_CommercialAuto;
import pw.pages.CA.CA_ExperienceRating;
import pw.pages.CA.CA_GarageKeeperes;
import pw.pages.CA.CA_GarageKeepersCustmersSoundRecevingCoverage;
import pw.pages.CA.CA_LiabilityExperienceRating;
import pw.pages.CA.CA_Locations;
import pw.pages.CA.CA_PhysicalDamageExperienceRating;
import pw.pages.CA.CA_ScheduleRating;
import pw.pages.CA.CA_SecuraManusript;
import pw.pages.CA.CA_StateCoverageLimits;
import pw.pages.CA.CA_Symbols;
import pw.pages.CA.CA_Vehicles;
import pw.pages.COMMON.CAWC_PW_Producers;
import pw.pages.COMMON.CAWC_ProductInfo;
import pw.pages.COMMON.PW_BillingTab;
import pw.pages.COMMON.PW_CommonFun;
import pw.pages.COMMON.PW_CommonMethods;
import pw.pages.COMMON.PW_DashboardFormsComparision;
import pw.pages.COMMON.PW_Home;
import pw.pages.COMMON.PW_Login;
import pw.pages.COMMON.PW_PremiumSummary;

public class CA15_KYBusinessAuto_CARegression extends BaseTest{

	ExtentReports extent;
	ExtentTest test;
		
	public static void KYBusinessAuto_CARegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login  LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		CAWC_ProductInfo CAWC_ProductInfoPage = TestPageFactory.initElements(se, CAWC_ProductInfo.class);
		CAWC_PW_Producers CAWCPWProducers = TestPageFactory.initElements(se, CAWC_PW_Producers.class);
		CA_CommercialAuto CA_CommercialAutoPage = TestPageFactory.initElements(se, CA_CommercialAuto.class);
		CA_StateCoverageLimits CA_StateCoverageLimitsPage = TestPageFactory.initElements(se, CA_StateCoverageLimits.class);
		CA_Symbols CA_SymbolsPage = TestPageFactory.initElements(se, CA_Symbols.class);
		CA_Locations CA_LocationsPage = TestPageFactory.initElements(se, CA_Locations.class);
		CA_Vehicles CA_VehiclesPage = TestPageFactory.initElements(se, CA_Vehicles.class);
		CA_AdditionalCoverages CA_AdditionalCoveragesPage = TestPageFactory.initElements(se, CA_AdditionalCoverages.class);
		CA_GarageKeeperes CA_GarageKeeperesPage = TestPageFactory.initElements(se, CA_GarageKeeperes.class);
		CA_GarageKeepersCustmersSoundRecevingCoverage CA_GarageKeepersCustmersSoundRecevingCoveragePage = TestPageFactory.initElements(se, CA_GarageKeepersCustmersSoundRecevingCoverage.class);
		CA_AutoBodyManufacturersaAndInstal CA_AutoBodyManufacturersaAndInstalPage = TestPageFactory.initElements(se, CA_AutoBodyManufacturersaAndInstal.class);
		CA_SecuraManusript CA_SecuraManusriptPage = TestPageFactory.initElements(se, CA_SecuraManusript.class);
		CA_ExperienceRating CA_ExperienceRatingPage = TestPageFactory.initElements(se, CA_ExperienceRating.class);
		CA_LiabilityExperienceRating CA_LiabilityExperienceRatingPage = TestPageFactory.initElements(se, CA_LiabilityExperienceRating.class);
		CA_PhysicalDamageExperienceRating CA_PhysicalDamageExperienceRatingPage = TestPageFactory.initElements(se, CA_PhysicalDamageExperienceRating.class);
		CA_ScheduleRating CAScheduleRating = TestPageFactory.initElements(se, CA_ScheduleRating.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		PW_DashboardFormsComparision DashboardFormsComparision = TestPageFactory.initElements(se,PW_DashboardFormsComparision.class);
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
				CommonMethods.NavigateTo("Commercial Auto",test);
				CA_CommercialAutoPage.CommercialAuto(strRegressionID, transaction, suspendSheet, test);
				CA_StateCoverageLimitsPage.StateCoverageLimits(strRegressionID, transaction, suspendSheet, test);
				CA_SymbolsPage.Symbols(strRegressionID, transaction, suspendSheet, test);
				CA_LocationsPage.Locations(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Vehicles",test);
				CA_VehiclesPage.CA_VehiclesPage(strRegressionID, transaction, suspendSheet, test);
				CA_AdditionalCoveragesPage.AdditionalCoverages(strRegressionID, transaction, suspendSheet, test);
				CA_GarageKeeperesPage.CAGarageKeepersPage(strRegressionID, transaction, suspendSheet, test);
				CA_GarageKeepersCustmersSoundRecevingCoveragePage.GarageKeepersCustmersSoundRecevingCoverage(strRegressionID, transaction, suspendSheet, test);
				CA_AutoBodyManufacturersaAndInstalPage.AutoBodyManufacturersaAndInstal(strRegressionID, transaction, suspendSheet, test);
				CA_SecuraManusriptPage.SecuraManusript(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Experience Rating",test);
				CA_ExperienceRatingPage.ExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CA_LiabilityExperienceRatingPage.LiabilityExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CA_PhysicalDamageExperienceRatingPage.PhysicalDamageExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CAScheduleRating.CA_ScheduleRatingPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
				CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				}
			
			
			//Convert To Policy
			if(transactionsList.contains("ConvertToPolicy")){
				String transaction = "ConvertToPolicy";
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			//ProRataEndorsement1
			if(transactionsList.contains("ProRataEndorsement1")){
				String transaction = "ProRataEndorsement1";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Auto",test);
				CommonMethods.NavigateTo("Additional Coverages",test);
				CommonMethods.NavigateTo("SECURA Manuscript (2)",test);
				CA_SecuraManusriptPage.SecuraManusript(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			//ProRataEndorsementOOSE
			if(transactionsList.contains("ProRataEndorsementOOSE")){
				String transaction = "ProRataEndorsementOOSE";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Auto",test);
				CommonMethods.NavigateTo("Vehicles (3)",test);
				CA_VehiclesPage.CA_VehiclesPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				//CommonMethods.getDashboardForms(strRegressionID,"ProRataEndorsementOOSE1",test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			//ProRataCancellation
			if(transactionsList.contains("ProRataCancellation")){
				String transaction = "ProRataCancellation";
				CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			// Reinstatement
			if(transactionsList.contains("Reinstatement")){
				String transaction = "Reinstatement";
				CommonMethods.NavigateToNextScreen(test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			// Quote For Renewal
			if(transactionsList.contains("QuoteForRenewal")){
				String transaction = "QuoteForRenewal";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Auto",test);
				CommonMethods.NavigateTo("Vehicles (3)",test);
				CA_VehiclesPage.CA_VehiclesPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);	
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
		
			// Convert QFR To Policy
			if(transactionsList.contains("ConvertQFRToPolicy")){
				String transaction = "ConvertQFRToPolicy";
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
				
		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("KYBusinessAutoRegression test  failed", true, false);
			testTearDown(se);
		}
	}

}



