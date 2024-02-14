package pw.regressions.CA;
/**
 * @author ${pr09529}
 */
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
import pw.pages.CA.CA_DriveAwayCollision;
import pw.pages.CA.CA_GarageKeeperes;
import pw.pages.CA.CA_LiabilityExperienceRating;
import pw.pages.CA.CA_Locations;
import pw.pages.CA.CA_PDCoverageTypesOfAutosInterests;
import pw.pages.CA.CA_PhysicalDamageExperienceRating;
import pw.pages.CA.CA_PickupOrDeliveryCoverage;
import pw.pages.CA.CA_ScheduleRating;
import pw.pages.CA.CA_StateCoverageLimits;
import pw.pages.CA.CA_Symbols;
import pw.pages.COMMON.CAWC_PW_Producers;
import pw.pages.COMMON.CAWC_ProductInfo;
import pw.pages.COMMON.PW_BillingTab;
import pw.pages.COMMON.PW_CommonFun;
import pw.pages.COMMON.PW_CommonMethods;
import pw.pages.COMMON.PW_DashboardFormsComparision;
import pw.pages.COMMON.PW_Home;
import pw.pages.COMMON.PW_Login;
import pw.pages.COMMON.PW_PremiumSummary;

public class CA16_MI_AutoDealers_CARegression extends BaseTest{
	ExtentReports extent;
	ExtentTest test;
		
	public static void MIAutoDealers_CARegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login  LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		CAWC_ProductInfo CAWC_ProductInfoPage = TestPageFactory.initElements(se, CAWC_ProductInfo.class);
		CAWC_PW_Producers CAWC_PW_ProducersPage = TestPageFactory.initElements(se, CAWC_PW_Producers.class);
		CA_CommercialAuto CA_CommercialAutoPage = TestPageFactory.initElements(se, CA_CommercialAuto.class);
		CA_StateCoverageLimits CA_StateCoverageLimitsPage = TestPageFactory.initElements(se, CA_StateCoverageLimits.class);
		CA_Symbols CA_SymbolsPage = TestPageFactory.initElements(se, CA_Symbols.class);
		CA_Locations CA_LocationsPage = TestPageFactory.initElements(se, CA_Locations.class);
		CA_AdditionalCoverages CA_AdditionalCoveragesPage = TestPageFactory.initElements(se, CA_AdditionalCoverages.class);
		CA_DriveAwayCollision CA_DriveAwayCollisionPage = TestPageFactory.initElements(se, CA_DriveAwayCollision.class);
		CA_GarageKeeperes CA_GarageKeeperesPage = TestPageFactory.initElements(se, CA_GarageKeeperes.class);
		CA_PickupOrDeliveryCoverage CA_PickupOrDeliveryCoveragePage = TestPageFactory.initElements(se, CA_PickupOrDeliveryCoverage.class);
		CA_PDCoverageTypesOfAutosInterests CA_PDCoverageTypesOfAutosInterestsPage = TestPageFactory.initElements(se, CA_PDCoverageTypesOfAutosInterests.class);
		CA_AdditionalInterest CAAdditionalInterest = TestPageFactory.initElements(se, CA_AdditionalInterest.class);
		CA_LiabilityExperienceRating CA_LiabilityExperienceRatingPage = TestPageFactory.initElements(se, CA_LiabilityExperienceRating.class);
		CA_PhysicalDamageExperienceRating CA_PhysicalDamageExperienceRatingPage = TestPageFactory.initElements(se, CA_PhysicalDamageExperienceRating.class);
		CA_ScheduleRating CA_ScheduleRatingPage = TestPageFactory.initElements(se, CA_ScheduleRating.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		PW_DashboardFormsComparision DashboardFormsComparision = TestPageFactory.initElements(se,PW_DashboardFormsComparision.class);
		PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);
		
		try {
			List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
			
			
				CommonFunPage.PWAppStartUp(test);
			
			if (transactionsList.contains("NewQuote")) {
				String transaction = "NewQuote";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				LoginPage.PWAppLogin(strRegressionID, transaction, test);
				WelcomePage.homePage(strRegressionID, transaction, test);
				CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CAWC_PW_ProducersPage.AddProducers(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Auto", test);
				CA_CommercialAutoPage.CommercialAuto(strRegressionID, transaction, suspendSheet, test);
				CA_StateCoverageLimitsPage.StateCoverageLimits(strRegressionID, transaction, suspendSheet, test);
				CA_SymbolsPage.Symbols(strRegressionID, transaction, suspendSheet, test);
				CA_LocationsPage.Locations(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Additional Coverages", test);
				CA_AdditionalCoveragesPage.AdditionalCoverages(strRegressionID, transaction, suspendSheet, test);
				CA_DriveAwayCollisionPage.DriveAwayCollision(strRegressionID, transaction, suspendSheet, test);
				CA_GarageKeeperesPage.CAGarageKeepersPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateToPage("Pickup Or Delivery Coverage",test);
				CA_PickupOrDeliveryCoveragePage.PickupOrDeliveryCoverage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("PD Coverage-Types Of Autos/Interests Covered", test);
				CA_PDCoverageTypesOfAutosInterestsPage.PDCoverageTypesOfAutosInterests(strRegressionID, transaction, suspendSheet, test);
				CAAdditionalInterest.AdditionalInterest(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Experience Rating", test);
				CommonMethods.NavigateTo("Liability Experience Rating", test);
				CA_LiabilityExperienceRatingPage.LiabilityExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CA_PhysicalDamageExperienceRatingPage.PhysicalDamageExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CA_ScheduleRatingPage.CA_ScheduleRatingPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				// Commented this as company is not changing to 80
				/*CommonMethods.NavigateToPageContaingText("80-A", test);
				CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, "NewQuote1", test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);*/
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
					
			//Convert To Policy
			if(transactionsList.contains("ConvertToPolicy")){
				String transaction = "ConvertToPolicy";
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			if(transactionsList.contains("ProRataEndorsement1")){
				String transaction = "ProRataEndorsement1";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Auto", test);
				CommonMethods.NavigateTo("Locations (1)", test);
				CA_LocationsPage.Locations(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			//FlatEndorsementOOSE
			if(transactionsList.contains("FlatEndorsementOOSE")){
				String transaction = "FlatEndorsementOOSE";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CAWC_PW_ProducersPage.AddProducers(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Auto",test);
				CommonMethods.NavigateTo("Additional Coverages",test);
				CA_AdditionalCoveragesPage.AdditionalCoverages(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Covered Auto Symbols", test);
				CA_SymbolsPage.Symbols(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				//CommonMethods.getDashboardForms(strRegressionID,"FlatEndorsementOOSE1",test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			// Quote For Renewal
			if(transactionsList.contains("QuoteForRenewal")){
				String transaction = "QuoteForRenewal";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Auto", test);
				CommonMethods.NavigateTo("State Coverage Limits (1)", test);
				CA_StateCoverageLimitsPage.StateCoverageLimits(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			// Convert QFR To Policy
			if(transactionsList.contains("ConvertQFRToPolicy")){
				String transaction = "ConvertQFRToPolicy";				
				CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
				
		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("MIAutoDealers CARegression test failed", true, false);
			testTearDown(se);
		}
	}

	}
