package pw.regressions.CA;
/**
 * @author ${is09492}
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
import pw.pages.CA.CA_Drivers;
import pw.pages.CA.CA_ExperienceRating;
import pw.pages.CA.CA_FungiOrBacteriaLiability;
import pw.pages.CA.CA_GarageKeeperes;
import pw.pages.CA.CA_LiabilityExperienceRating;
import pw.pages.CA.CA_Locations;
import pw.pages.CA.CA_NamedDriverCollision;
import pw.pages.CA.CA_OptionalProvisions;
import pw.pages.CA.CA_PDCoverageTypesOfAutosInterests;
import pw.pages.CA.CA_PhysicalDamageExperienceRating;
import pw.pages.CA.CA_PickupOrDeliveryCoverage;
import pw.pages.CA.CA_ScheduleRating;
import pw.pages.CA.CA_StateCoverageLimits;
import pw.pages.CA.CA_Symbols;
import pw.pages.CA.CA_Vehicles;
import pw.pages.CA.CA_Year2000Endorsements;
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
import pw.pages.COMMON.PW_Producers;

public class CA3_CO_AutoDealers_CARegression extends BaseTest{
	ExtentReports extent;
	ExtentTest test;
		
	public static void CO_AutoDealers_CARegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login  LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		CAWC_ProductInfo CAWC_ProductInfoPage = TestPageFactory.initElements(se, CAWC_ProductInfo.class);
		CAWC_PW_Producers CAWC_PW_ProducersPage = TestPageFactory.initElements(se, CAWC_PW_Producers.class);
		CAWC_AdditionalNamedInsured CAWC_AdditionalNamedInsuredPage = TestPageFactory.initElements(se, CAWC_AdditionalNamedInsured.class);
		CA_CommercialAuto CA_CommercialAutoPage = TestPageFactory.initElements(se, CA_CommercialAuto.class);
		CA_StateCoverageLimits CA_StateCoverageLimitsPage = TestPageFactory.initElements(se, CA_StateCoverageLimits.class);
		CA_Symbols CA_SymbolsPage = TestPageFactory.initElements(se, CA_Symbols.class);
		CA_Locations CA_LocationsPage = TestPageFactory.initElements(se, CA_Locations.class);
		CA_Drivers CA_DriversPage = TestPageFactory.initElements(se, CA_Drivers.class);
		CA_Vehicles CA_VehiclesPage = TestPageFactory.initElements(se, CA_Vehicles.class);
		CA_AdditionalCoverages CA_AdditionalCoveragesPage = TestPageFactory.initElements(se, CA_AdditionalCoverages.class);
		CA_DriveAwayCollision CA_DriveAwayCollisionPage = TestPageFactory.initElements(se, CA_DriveAwayCollision.class);
		CA_GarageKeeperes CA_GarageKeeperesPage = TestPageFactory.initElements(se, CA_GarageKeeperes.class);
		CA_NamedDriverCollision CA_NamedDriverCollisionPage = TestPageFactory.initElements(se, CA_NamedDriverCollision.class);
		CA_Year2000Endorsements CA_Year2000EndorsementsPage = TestPageFactory.initElements(se, CA_Year2000Endorsements.class);
		CA_PickupOrDeliveryCoverage CA_PickupOrDeliveryCoveragePage = TestPageFactory.initElements(se, CA_PickupOrDeliveryCoverage.class);
		CA_PDCoverageTypesOfAutosInterests CA_PDCoverageTypesOfAutosInterestsPage = TestPageFactory.initElements(se, CA_PDCoverageTypesOfAutosInterests.class);
		
		CA_ExperienceRating CA_ExperienceRatingPage = TestPageFactory.initElements(se, CA_ExperienceRating.class);
		CA_LiabilityExperienceRating CA_LiabilityExperienceRatingPage = TestPageFactory.initElements(se, CA_LiabilityExperienceRating.class);
		CA_PhysicalDamageExperienceRating CA_PhysicalDamageExperienceRatingPage = TestPageFactory.initElements(se, CA_PhysicalDamageExperienceRating.class);
		CA_ScheduleRating CA_ScheduleRatingPage = TestPageFactory.initElements(se, CA_ScheduleRating.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		PW_DashboardFormsComparision DashboardFormsComparision = TestPageFactory.initElements(se,
				PW_DashboardFormsComparision.class);
		PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);
		
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
				CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CAWC_PW_ProducersPage.AddProducers(strRegressionID,transaction,test);
				CAWC_AdditionalNamedInsuredPage.AdditionalNamedInsured(strRegressionID, transaction, test);
				CA_CommercialAutoPage.CommercialAuto(strRegressionID, transaction, suspendSheet, test);
				CA_StateCoverageLimitsPage.StateCoverageLimits(strRegressionID, transaction, suspendSheet, test);
				CA_SymbolsPage.Symbols(strRegressionID, transaction, suspendSheet, test);
				CA_LocationsPage.Locations(strRegressionID, transaction, suspendSheet, test);
				CA_DriversPage.Drivers(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Vehicles", test);
				CA_VehiclesPage.CA_VehiclesPage(strRegressionID, transaction, suspendSheet, test);
				CA_AdditionalCoveragesPage.AdditionalCoverages(strRegressionID, transaction, suspendSheet, test);
				//CA_NamedDriverCollisionPage.CANamedDriverCollisionPage(strRegressionID, transaction, suspendSheet, test); (commented this line as this coverage is not being selected as per Regression doc)
				CA_DriveAwayCollisionPage.DriveAwayCollision(strRegressionID, transaction, suspendSheet, test);
				CA_GarageKeeperesPage.CAGarageKeepersPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Year 2000 Endorsements", test);
				CA_Year2000EndorsementsPage.Year2000Endorsements(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("PD Coverage-Types Of Autos/Interests Covered", test);
				CA_PDCoverageTypesOfAutosInterestsPage.PDCoverageTypesOfAutosInterests(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Experience Rating", test);
				CA_ExperienceRatingPage.ExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CA_LiabilityExperienceRatingPage.LiabilityExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CA_PhysicalDamageExperienceRatingPage.PhysicalDamageExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				CommonMethods.CollapseAllAndNavigateTo("Commercial Auto", "-A", test);
				CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, "NewQuote1", test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				
			}
			
			//Convert To Policy
			if(transactionsList.contains("ConvertToPolicy")){
				String transaction = "ConvertToPolicy";
				//String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			if(transactionsList.contains("FlatEndorsement1")){
				String transaction = "FlatEndorsement1";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
			
				CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Auto", test);
				CommonMethods.NavigateTo("Vehicles (2)", test);
				CA_VehiclesPage.CA_VehiclesPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Commercial Auto", test);
				CA_CommercialAutoPage.CommercialAuto(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			if(transactionsList.contains("QuoteForRenewal")){
				String transaction = "QuoteForRenewal";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Auto", test);
				CommonMethods.NavigateTo("State Coverage Limits (1)", test);
				CA_StateCoverageLimitsPage.StateCoverageLimits(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			
			if(transactionsList.contains("ConvertQFRToPolicy")){
				String transaction = "ConvertQFRToPolicy";
				
				CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
				
		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("COAutoDealersCARegression test  failed", true, false);
			testTearDown(se);
		}
	}

	}
