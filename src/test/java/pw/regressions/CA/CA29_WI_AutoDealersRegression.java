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
import pw.pages.CA.CA_CommercialAuto;
import pw.pages.CA.CA_DriveAwayCollision;
import pw.pages.CA.CA_GarageKeeperes;
import pw.pages.CA.CA_GeneralLiabilityExclusions;
import pw.pages.CA.CA_LiabilityExperienceRating;
import pw.pages.CA.CA_Locations;
import pw.pages.CA.CA_OptionalProvisions;
import pw.pages.CA.CA_PDCoverageTypesOfAutosInterests;
import pw.pages.CA.CA_PhysicalDamageExperienceRating;
import pw.pages.CA.CA_PickupOrDeliveryCoverage;
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

public class CA29_WI_AutoDealersRegression extends BaseTest{

	ExtentReports extent;
	ExtentTest test;
	public static void WIAutoDealerRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params, String strRegressionID,File file,XSSFWorkbook workbook,ExtentTest test) throws IOException {
		

		PW_Login LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		CAWC_ProductInfo CAWC_ProductInfoPage = TestPageFactory.initElements(se, CAWC_ProductInfo.class);
		CAWC_PW_Producers CAWC_PW_ProducersPage = TestPageFactory.initElements(se, CAWC_PW_Producers.class);
		CA_CommercialAuto CACommercialAuto =  TestPageFactory.initElements(se, CA_CommercialAuto.class);
		CA_StateCoverageLimits CAStateCoverageLimits =  TestPageFactory.initElements(se, CA_StateCoverageLimits.class);
		CA_Symbols CASymbols  =  TestPageFactory.initElements(se, CA_Symbols.class);
		CA_Locations CALocations = TestPageFactory.initElements(se, CA_Locations.class);
		CA_Vehicles CAVehicles = TestPageFactory.initElements(se, CA_Vehicles.class);
		CA_AdditionalCoverages CAAdditionalCoverages = TestPageFactory.initElements(se, CA_AdditionalCoverages.class);
		CA_GarageKeeperes CAGarageKeeperes = TestPageFactory.initElements(se, CA_GarageKeeperes.class);
		CA_PickupOrDeliveryCoverage CAPickupOrDeliveryCoverage = TestPageFactory.initElements(se, CA_PickupOrDeliveryCoverage.class);
		CA_PDCoverageTypesOfAutosInterests CAPDCoverageTypesOfAutosInterests =  TestPageFactory.initElements(se, CA_PDCoverageTypesOfAutosInterests.class);
		CA_LiabilityExperienceRating CALiabilityExperienceRating = TestPageFactory.initElements(se, CA_LiabilityExperienceRating.class);
		CA_PhysicalDamageExperienceRating CAPhysicalDamageExperienceRating = TestPageFactory.initElements(se, CA_PhysicalDamageExperienceRating.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		CA_DriveAwayCollision CA_DriveAwayCollisionPage = TestPageFactory.initElements(se, CA_DriveAwayCollision.class);
		CA_SecuraManusript CA_SecuraManusriptpage = TestPageFactory.initElements(se, CA_SecuraManusript.class);
		CA_OptionalProvisions CA_OptionalProvisionsPage = TestPageFactory.initElements(se, CA_OptionalProvisions.class);
		CA_GeneralLiabilityExclusions GeneralLiabilityExclusions = TestPageFactory.initElements(se, CA_GeneralLiabilityExclusions.class);
		CA_ScheduleRating CA_ScheduleRatingPage = TestPageFactory.initElements(se, CA_ScheduleRating.class);
		CA_StateCoverageLimits CA_StateCoverageLimitsPage = TestPageFactory.initElements(se, CA_StateCoverageLimits.class);
		PW_DashboardFormsComparision DashboardFormsComparision = TestPageFactory.initElements(se,
				PW_DashboardFormsComparision.class);
		PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);
		
		/*	NewQuote
		ConvertToPolicy
		ProRataEndorsement1
		QuoteForRenewal
		ConvertQFRToPolicy
*/
		try {
			
			List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
			//int iteration = 0;
			CommonFunPage.PWAppStartUp(test);
			
			//New Transaction Actions
			
			if(transactionsList.contains("NewQuote")){
				String transaction = "NewQuote";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				LoginPage.PWAppLogin(strRegressionID,transaction,test);
				WelcomePage.homePage(strRegressionID,transaction, test);
				CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CAWC_PW_ProducersPage.AddProducers(strRegressionID,transaction,test);
				CommonMethods.NavigateToNextScreen(test);
				CACommercialAuto.CommercialAuto(strRegressionID, transaction, suspendSheet, test);
				CAStateCoverageLimits.StateCoverageLimits(strRegressionID,transaction,suspendSheet, test);
				CASymbols.Symbols(strRegressionID, transaction, suspendSheet, test);
				CALocations.Locations(strRegressionID, transaction,suspendSheet, test);
				CommonMethods.NavigateToNextScreen(test);
				CommonMethods.NavigateToNextScreen(test);
				CAVehicles.CA_VehiclesPage(strRegressionID, transaction, suspendSheet, test);
				CAAdditionalCoverages.AdditionalCoverages(strRegressionID, transaction, suspendSheet, test);
				CA_DriveAwayCollisionPage.DriveAwayCollision(strRegressionID, transaction, suspendSheet, test);
				CAGarageKeeperes.CAGarageKeepersPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("SECURA Manuscript",test);
				CA_SecuraManusriptpage.SecuraManusript(strRegressionID, transaction, suspendSheet, test);
				CAPickupOrDeliveryCoverage.PickupOrDeliveryCoverage(strRegressionID, transaction,suspendSheet, test);
				CAPDCoverageTypesOfAutosInterests.PDCoverageTypesOfAutosInterests(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateToNextScreen(test);
				CommonMethods.NavigateTo("Optional Provisions",test);
				CA_OptionalProvisionsPage.OptionalProvisions(strRegressionID, transaction, suspendSheet, test);
				GeneralLiabilityExclusions.GeneralLiabilityExclusions(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateToNextScreen(test);
				
				CALiabilityExperienceRating.LiabilityExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CAPhysicalDamageExperienceRating.PhysicalDamageExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CA_ScheduleRatingPage.CA_ScheduleRatingPage(strRegressionID, transaction, suspendSheet, test);
				
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				BillingTab.getUpdateBillingTab(strRegressionID, transaction, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test); 
			}
			
			//Convert Quote to Policy (2)
			if(transactionsList.contains("ConvertToPolicy")){
				String transaction = "ConvertToPolicy";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				CommonMethods.NavigateTo("Commercial Auto",test);
				CommonMethods.NavigateTo("State Coverage Limits (1)",test);
				CA_StateCoverageLimitsPage.StateCoverageLimits(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);		
				CommonMethods.getDashboardActions(strRegressionID,transaction,test); 
			}
			
			//Flat  Endorsement (3)
			if(transactionsList.contains("ProRataEndorsement1")){
				String transaction = "ProRataEndorsement1";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Auto",test);
				CommonMethods.NavigateTo("Additional Coverages",test);
				CommonMethods.NavigateTo("SECURA Manuscript (1)",test);
				
				CA_SecuraManusriptpage.SecuraManusript(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			//Quote for Renewal (4)
			if(transactionsList.contains("QuoteForRenewal")){
				String transaction = "QuoteForRenewal";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				CAWC_ProductInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Auto",test);
				CommonMethods.NavigateTo("State Coverage Limits (1)",test);
				CAStateCoverageLimits.StateCoverageLimits(strRegressionID,transaction,suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			
			//Convert Quote to Policy (5)
			if(transactionsList.contains("ConvertQFRToPolicy")){
				String transaction = "ConvertQFRToPolicy";
			
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);			
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}		
		
}
catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("WI_AutoDealersRegression test  failed", true, false);
			testTearDown(se);
		}
	}
}