package pw.regressions.CA;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import pw.pages.CA.CA_AdditionalCoverages;
import pw.pages.CA.CA_CommercialAuto;
import pw.pages.CA.CA_DriveAwayCollision;
import pw.pages.CA.CA_ExperienceRating;
import pw.pages.CA.CA_GarageKeeperes;
import pw.pages.CA.CA_LiabilityExperienceRating;
import pw.pages.CA.CA_Locations;
import pw.pages.CA.CA_PDCoverageTypesOfAutosInterests;
import pw.pages.CA.CA_PhysicalDamageExperienceRating;
import pw.pages.CA.CA_PickupOrDeliveryCoverage;
import pw.pages.CA.CA_ScheduleRating;
import pw.pages.CA.CA_SilicaOrSilicaRelatedDustLiabil;
import pw.pages.CA.CA_StateCoverageLimits;
import pw.pages.CA.CA_Symbols;
import pw.pages.CA.CA_Year2000Endorsements;
import pw.pages.COMMON.CAWC_PW_Producers;
import pw.pages.COMMON .CAWC_ProductInfo;
import pw.pages.COMMON.PW_BillingTab;
import pw.pages.COMMON .PW_CommonFun;
import pw.pages.COMMON .PW_CommonMethods;
import pw.pages.COMMON.PW_DashboardFormsComparision;
import pw.pages.COMMON .PW_Home;
import pw.pages.COMMON .PW_Login;
import pw.pages.COMMON .PW_PremiumSummary;
import Libraries.automation.common.BaseTest;
import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.SeHelper;
import Libraries.automation.common.Utils.TestPageFactory;
import Libraries.automation.common.framework.Browser.Browsers;

public class CA18_MNAutoDealers_CARegression extends BaseTest{

	ExtentReports extent;
	ExtentTest test;
		
	public static void MNAutoDealers_CARegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login  LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		CAWC_ProductInfo CAWC_ProductInfoPage = TestPageFactory.initElements(se, CAWC_ProductInfo.class);
		CAWC_PW_Producers CAWCPWProducers = TestPageFactory.initElements(se, CAWC_PW_Producers.class);
		CA_CommercialAuto CA_CommercialAutoPage = TestPageFactory.initElements(se, CA_CommercialAuto.class);
		CA_StateCoverageLimits CA_StateCoverageLimitsPage = TestPageFactory.initElements(se, CA_StateCoverageLimits.class);
		CA_Symbols CA_SymbolsPage = TestPageFactory.initElements(se, CA_Symbols.class);
		CA_Locations CALocations = TestPageFactory.initElements(se, CA_Locations.class);
		CA_AdditionalCoverages CA_AdditionalCoveragesPage = TestPageFactory.initElements(se, CA_AdditionalCoverages.class);
		CA_DriveAwayCollision CADriveAwayCollision = TestPageFactory.initElements(se, CA_DriveAwayCollision.class);
		CA_GarageKeeperes CA_GarageKeeperesPage = TestPageFactory.initElements(se, CA_GarageKeeperes.class);
		CA_SilicaOrSilicaRelatedDustLiabil CA_SilicaOrSilicaRelatedDustLiabilPage = TestPageFactory.initElements(se, CA_SilicaOrSilicaRelatedDustLiabil.class);
		CA_Year2000Endorsements CA_Year2000EndorsementsPage = TestPageFactory.initElements(se, CA_Year2000Endorsements.class);
		CA_ScheduleRating CAScheduleRating = TestPageFactory.initElements(se, CA_ScheduleRating.class);
		CA_PickupOrDeliveryCoverage CAPickupOrDeliveryCoverage = TestPageFactory.initElements(se, CA_PickupOrDeliveryCoverage.class);
		CA_PDCoverageTypesOfAutosInterests CAPDCoverageTypesOfAutosInterests =  TestPageFactory.initElements(se, CA_PDCoverageTypesOfAutosInterests.class);
		CA_ExperienceRating CA_ExperienceRatingPage = TestPageFactory.initElements(se, CA_ExperienceRating.class);
		CA_LiabilityExperienceRating CA_LiabilityExperienceRatingPage = TestPageFactory.initElements(se, CA_LiabilityExperienceRating.class);
		CA_PhysicalDamageExperienceRating CA_PhysicalDamageExperienceRatingPage = TestPageFactory.initElements(se, CA_PhysicalDamageExperienceRating.class);
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
				CALocations.Locations(strRegressionID, transaction,suspendSheet, test);
				CommonMethods.NavigateTo("Additional Coverages",test);
				CA_AdditionalCoveragesPage.AdditionalCoverages(strRegressionID, transaction, suspendSheet, test);
				CADriveAwayCollision.DriveAwayCollision(strRegressionID, transaction, suspendSheet, test);
				CA_GarageKeeperesPage.CAGarageKeepersPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Silica Or Silica - Related Dust Liability",test);
				CA_SilicaOrSilicaRelatedDustLiabilPage.SilicaOrSilicaRelatedDustLiabil(strRegressionID, transaction, suspendSheet, test);
				CA_Year2000EndorsementsPage.Year2000Endorsements(strRegressionID, transaction, suspendSheet, test);
				CAPickupOrDeliveryCoverage.PickupOrDeliveryCoverage(strRegressionID, transaction,suspendSheet, test);
				CAPDCoverageTypesOfAutosInterests.PDCoverageTypesOfAutosInterests(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Experience Rating",test);
				CA_ExperienceRatingPage.ExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CA_LiabilityExperienceRatingPage.LiabilityExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CA_PhysicalDamageExperienceRatingPage.PhysicalDamageExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CAScheduleRating.CA_ScheduleRatingPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
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
				CommonMethods.NavigateTo("Locations (2)",test);
				CALocations.Locations(strRegressionID, transaction,suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			//FlatEndorsementOOSE
			if(transactionsList.contains("FlatEndorsementOOSE")){
				String transaction = "FlatEndorsementOOSE";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Auto",test);
				CommonMethods.NavigateTo("Additional Coverages", test);
				CommonMethods.NavigateTo("Drive-Away Collision (2)", test);
				CADriveAwayCollision.DriveAwayCollision(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Garage Keepers (2)", test);
				CA_GarageKeeperesPage.CAGarageKeepersPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Locations (2)",test);
				CALocations.Locations(strRegressionID, transaction,suspendSheet, test);
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
				CommonMethods.NavigateTo("Commercial Auto",test);
				CommonMethods.NavigateTo("State Coverage Limits (1)",test);
				CA_StateCoverageLimitsPage.StateCoverageLimits(strRegressionID, transaction, suspendSheet, test);
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
			se.verify().verifyEquals("MNAutoDealersRegression test  failed", true, false);
			testTearDown(se);
		}
	}

}



