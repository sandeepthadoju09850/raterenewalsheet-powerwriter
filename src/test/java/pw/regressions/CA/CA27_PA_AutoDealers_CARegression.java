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
import pw.pages.CA.CA_AdditionalInterest;
import pw.pages.CA.CA_CommercialAuto;
import pw.pages.CA.CA_Drivers;
import pw.pages.CA.CA_ExperienceRating;
import pw.pages.CA.CA_LiabilityExperienceRating;
import pw.pages.CA.CA_Locations;
import pw.pages.CA.CA_PDCoverageTypesOfAutosInterests;
import pw.pages.CA.CA_PhysicalDamageExperienceRating;
import pw.pages.CA.CA_ScheduleRating;
import pw.pages.CA.CA_StateCoverageLimits;
import pw.pages.CA.CA_Symbols;
import pw.pages.CA.CA_Vehicles;
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

public class CA27_PA_AutoDealers_CARegression extends BaseTest{

	ExtentReports extent;
	ExtentTest test;
	public static void PAAutoDealersRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params, String strRegressionID,File file,XSSFWorkbook workbook,ExtentTest test) throws IOException {
		

		PW_Login LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		CAWC_ProductInfo CAWCProductInfo = TestPageFactory.initElements(se, CAWC_ProductInfo.class);
		CAWC_PW_Producers CAWCPWProducers = TestPageFactory.initElements(se, CAWC_PW_Producers.class);
		CAWC_AdditionalNamedInsured CAWCAdditionalNamedInsured = TestPageFactory.initElements(se, CAWC_AdditionalNamedInsured.class);
		CA_CommercialAuto CACommercialAuto =  TestPageFactory.initElements(se, CA_CommercialAuto.class);
		CA_StateCoverageLimits CAStateCoverageLimits =  TestPageFactory.initElements(se, CA_StateCoverageLimits.class);
		CA_Symbols CASymbols  =  TestPageFactory.initElements(se, CA_Symbols.class);
		CA_Locations CALocations = TestPageFactory.initElements(se, CA_Locations.class);
		CA_Drivers CADrivers = TestPageFactory.initElements(se, CA_Drivers.class);
		CA_Vehicles CAVehiclesPage = TestPageFactory.initElements(se, CA_Vehicles.class);
		CA_AdditionalCoverages CAAdditionalCoverages = TestPageFactory.initElements(se, CA_AdditionalCoverages.class);
		CA_ScheduleRating CAScheduleRatingPage = TestPageFactory.initElements(se, CA_ScheduleRating.class);
		CA_PDCoverageTypesOfAutosInterests CAPDCoverageTypesOfAutosInterests =  TestPageFactory.initElements(se, CA_PDCoverageTypesOfAutosInterests.class);
		CA_AdditionalInterest CAAdditionalInterest = TestPageFactory.initElements(se, CA_AdditionalInterest.class);
		CA_ExperienceRating CAExperienceRating = TestPageFactory.initElements(se, CA_ExperienceRating.class);
		CA_LiabilityExperienceRating CALiabilityExperienceRating = TestPageFactory.initElements(se, CA_LiabilityExperienceRating.class);
		CA_PhysicalDamageExperienceRating CAPhysicalDamageExperienceRating = TestPageFactory.initElements(se, CA_PhysicalDamageExperienceRating.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		PW_DashboardFormsComparision DashboardFormsComparision = TestPageFactory.initElements(se,PW_DashboardFormsComparision.class);
		PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);
		
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
				CAWCProductInfo.quote_ProdInfo(strRegressionID,transaction,test);
				CAWCPWProducers.AddProducers(strRegressionID,transaction,test);
				CAWCAdditionalNamedInsured.AdditionalNamedInsured(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Auto", test);
				CACommercialAuto.CommercialAuto(strRegressionID, transaction, suspendSheet, test);
				CAStateCoverageLimits.StateCoverageLimits(strRegressionID,transaction,suspendSheet, test);
				CASymbols.Symbols(strRegressionID, transaction, suspendSheet, test);
				CALocations.Locations(strRegressionID, transaction,suspendSheet, test);
				CADrivers.Drivers(strRegressionID, transaction, suspendSheet, test);
				CAVehiclesPage.CA_VehiclesPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Additional Coverages", test);
				CAAdditionalCoverages.AdditionalCoverages(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("PD Coverage-Types Of Autos/Interests Covered",test);				
				CAPDCoverageTypesOfAutosInterests.PDCoverageTypesOfAutosInterests(strRegressionID, transaction, suspendSheet, test);
				CAAdditionalInterest.AdditionalInterest(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Experience Rating", test);
				CAExperienceRating.ExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CALiabilityExperienceRating.LiabilityExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CAPhysicalDamageExperienceRating.PhysicalDamageExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CAScheduleRatingPage.CA_ScheduleRatingPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
				CommonMethods.getDashboardForms(strRegressionID, transaction, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			
			//ConverttoPolicy		
				if(transactionsList.contains("ConvertToPolicy")){
				String transaction = "ConvertToPolicy";
				
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardForms(strRegressionID, transaction, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test); 
			}
			
			//Flat Endorsement
			if(transactionsList.contains("FlatEndorsement1")){
				String transaction = "FlatEndorsement1";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				CAWCProductInfo.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Auto", test);
				CommonMethods.NavigateTo("Additional Coverages", test);
				CAAdditionalCoverages.AdditionalCoverages(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardForms(strRegressionID, transaction, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test); 
				
				
			}
			
			
			//QuoteforRenewal
			if(transactionsList.contains("QuoteForRenewal")){
				String transaction = "QuoteForRenewal";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				CAWCProductInfo.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Auto", test);
				CommonMethods.NavigateTo("State Coverage Limits (1)", test);
				CAStateCoverageLimits.StateCoverageLimits(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Experience Rating", test);
				CAExperienceRating.ExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CALiabilityExperienceRating.LiabilityExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CAPhysicalDamageExperienceRating.PhysicalDamageExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardForms(strRegressionID, transaction, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test); 
				
			}
			
			//ConvertQFRToPolicy

			if(transactionsList.contains("ConvertQFRToPolicy")){
				String transaction = "ConvertQFRToPolicy";
				
				CAWCProductInfo.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardForms(strRegressionID, transaction, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test); 
			}
		
}
catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("PA_AutoDealersRegression test failed", true, false);
			testTearDown(se);
		}
	}
}