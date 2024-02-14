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
import pw.pages.CA.CA_DealerExclusions;
import pw.pages.CA.CA_DriveAwayCollision;
import pw.pages.CA.CA_ExclusionOrExcessCoverageHazard;
import pw.pages.CA.CA_FungiOrBacteriaLiability;
import pw.pages.CA.CA_GarageKeeperes;
import pw.pages.CA.CA_LiabilityExperienceRating;
import pw.pages.CA.CA_Locations;
import pw.pages.CA.CA_LtdContrtactualLiability;
import pw.pages.CA.CA_OptionalProvisions;
import pw.pages.CA.CA_PDCoverageTypesOfAutosInterests;
import pw.pages.CA.CA_PhysicalDamageExperienceRating;
import pw.pages.CA.CA_PickupOrDeliveryCoverage;
import pw.pages.CA.CA_ScheduleRating;
import pw.pages.CA.CA_StateCoverageLimits;
import pw.pages.CA.CA_Symbols;
import pw.pages.CA.CA_Vehicles;
import pw.pages.CA.CA_Year2000Endorsements;
import pw.pages.COMMON.CAWC_PW_Producers;
import pw.pages.COMMON.CAWC_ProductInfo;
import pw.pages.COMMON.PW_BillingTab;
import pw.pages.COMMON.PW_CommonFun;
import pw.pages.COMMON.PW_CommonMethods;
import pw.pages.COMMON.PW_DashboardFormsComparision;
import pw.pages.COMMON.PW_Home;
import pw.pages.COMMON.PW_Login;
import pw.pages.COMMON.PW_PremiumSummary;

public class CA10_IN_AutoDealersRegression extends BaseTest{

	ExtentReports extent;
	ExtentTest test;
	public static void INAutoDealersRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params, String strRegressionID,File file,XSSFWorkbook workbook,ExtentTest test) throws IOException {
		

		PW_Login LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		CAWC_ProductInfo CAWCProductInfo = TestPageFactory.initElements(se, CAWC_ProductInfo.class);
		CAWC_PW_Producers CAWCPWProducers = TestPageFactory.initElements(se, CAWC_PW_Producers.class);
		CA_CommercialAuto CACommercialAuto =  TestPageFactory.initElements(se, CA_CommercialAuto.class);
		CA_StateCoverageLimits CAStateCoverageLimits =  TestPageFactory.initElements(se, CA_StateCoverageLimits.class);
		CA_Symbols CASymbols  =  TestPageFactory.initElements(se, CA_Symbols.class);
		CA_Locations CALocations = TestPageFactory.initElements(se, CA_Locations.class);
		CA_AdditionalCoverages CAAdditionalCoverages = TestPageFactory.initElements(se, CA_AdditionalCoverages.class);
		CA_Vehicles CA_VehiclesPage = TestPageFactory.initElements(se, CA_Vehicles.class);
		CA_DriveAwayCollision CADriveAwayCollision = TestPageFactory.initElements(se, CA_DriveAwayCollision.class);
		CA_ExclusionOrExcessCoverageHazard CA_ExclusionOrExcessCoverageHazardPage = TestPageFactory.initElements(se, CA_ExclusionOrExcessCoverageHazard.class);
		CA_ScheduleRating CAScheduleRatingPage = TestPageFactory.initElements(se, CA_ScheduleRating.class);
		CA_FungiOrBacteriaLiability CAFungiOrBacteriaLiability = TestPageFactory.initElements(se, CA_FungiOrBacteriaLiability.class);
		CA_OptionalProvisions CA_OptionalProvisionsPage = TestPageFactory.initElements(se, CA_OptionalProvisions.class);
		CA_PickupOrDeliveryCoverage CAPickupOrDeliveryCoverage = TestPageFactory.initElements(se, CA_PickupOrDeliveryCoverage.class);
		CA_PDCoverageTypesOfAutosInterests CAPDCoverageTypesOfAutosInterests =  TestPageFactory.initElements(se, CA_PDCoverageTypesOfAutosInterests.class);
		CA_AdditionalInterest CAAdditionalInterest = TestPageFactory.initElements(se, CA_AdditionalInterest.class);
		CA_DealerExclusions CA_DealerExclusionsPage = TestPageFactory.initElements(se, CA_DealerExclusions.class);
		CA_LiabilityExperienceRating CALiabilityExperienceRating = TestPageFactory.initElements(se, CA_LiabilityExperienceRating.class);
		CA_PhysicalDamageExperienceRating CAPhysicalDamageExperienceRating = TestPageFactory.initElements(se, CA_PhysicalDamageExperienceRating.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		CA_GarageKeeperes CA_GarageKeeperesPage = TestPageFactory.initElements(se, CA_GarageKeeperes.class);
		CA_Year2000Endorsements CA_Year2000EndorsementsPage = TestPageFactory.initElements(se, CA_Year2000Endorsements.class);
		CA_LtdContrtactualLiability CA_LtdContrtactualLiabilityPage = TestPageFactory.initElements(se, CA_LtdContrtactualLiability.class);
		PW_DashboardFormsComparision DashboardFormsComparision = TestPageFactory.initElements(se,
				PW_DashboardFormsComparision.class);
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
				CommonMethods.NavigateTo("Commercial Auto", test);
				CACommercialAuto.CommercialAuto(strRegressionID, transaction, suspendSheet, test);
				CAStateCoverageLimits.StateCoverageLimits(strRegressionID,transaction,suspendSheet, test);
				CASymbols.Symbols(strRegressionID, transaction, suspendSheet, test);
				CALocations.Locations(strRegressionID, transaction,suspendSheet, test);
				CommonMethods.NavigateTo("Vehicles", test);
				CA_VehiclesPage.CA_VehiclesPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Additional Coverages", test);
				CAAdditionalCoverages.AdditionalCoverages(strRegressionID, transaction, suspendSheet, test);
				CADriveAwayCollision.DriveAwayCollision(strRegressionID, transaction, suspendSheet, test);
				CA_ExclusionOrExcessCoverageHazardPage.ExclusionOrExcessCoverageHazard(strRegressionID, transaction, suspendSheet, test);
				CA_GarageKeeperesPage.CAGarageKeepersPage(strRegressionID, transaction, suspendSheet, test);
				CAFungiOrBacteriaLiability.FungiOrBacteriaLiability(strRegressionID, transaction, suspendSheet, test);	
				CA_Year2000EndorsementsPage.Year2000Endorsements(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Pickup Or Delivery Coverage", test);
				CAPickupOrDeliveryCoverage.PickupOrDeliveryCoverage(strRegressionID, transaction,suspendSheet, test);
				CAPDCoverageTypesOfAutosInterests.PDCoverageTypesOfAutosInterests(strRegressionID, transaction, suspendSheet, test);
				CAAdditionalInterest.AdditionalInterest(strRegressionID, transaction, suspendSheet, test);
				CA_OptionalProvisionsPage.OptionalProvisions(strRegressionID, transaction, suspendSheet, test);
				CA_DealerExclusionsPage.DealerExclusions(strRegressionID, transaction, suspendSheet, test);
				//CA_LtdContrtactualLiabilityPage.LtdContrtactualLiability(strRegressionID, transaction, suspendSheet, test); 09/14/22 commenting this step due to DF-9323
				CommonMethods.NavigateTo("Experience Rating", test);
				CommonMethods.NavigateTo("Liability Experience Rating", test);
				CALiabilityExperienceRating.LiabilityExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CAPhysicalDamageExperienceRating.PhysicalDamageExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CAScheduleRatingPage.CA_ScheduleRatingPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardCommissions(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			//ConverttoPolicy-1
			if(transactionsList.contains("ConvertToPolicy")){
				String transaction = "ConvertToPolicy";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				CAWCProductInfo.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Auto", test);
				CommonMethods.NavigateTo("State Coverage Limits (1)", test);
				CAStateCoverageLimits.StateCoverageLimits(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test); 
			}
			
			
			//QuoteforRenewal
			if(transactionsList.contains("QuoteForRenewal")){
				String transaction = "QuoteForRenewal";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				CAWCProductInfo.quote_ProdInfo(strRegressionID,transaction,test);
				CAWCPWProducers.AddProducers(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Producers",test);
				CAWCPWProducers.AddProducers(strRegressionID,"QuoteForRenewal1",test);
				CommonMethods.NavigateTo("Commercial Auto", test);
				CommonMethods.NavigateTo("State Coverage Limits (1)", test);
				CAStateCoverageLimits.StateCoverageLimits(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Additional Coverages", test);
				CommonMethods.NavigateTo("Exclusion Or Excess Coverage Hazards Otherwise Insured (1)", test);
				CA_ExclusionOrExcessCoverageHazardPage.ExclusionOrExcessCoverageHazard(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardCommissions(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				
			}
			
			//ConverttoPolicy-2
			if(transactionsList.contains("ConvertQFRToPolicy")){
				String transaction = "ConvertQFRToPolicy";
				CAWCProductInfo.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test); 
			}
			
			//ClonePolicy
			if(transactionsList.contains("ClonePolicy")){
				String transaction = "ClonePolicy";
				CAWCProductInfo.quote_ProdInfo(strRegressionID,transaction,test);
				CAWCPWProducers.AddProducers(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				CommonMethods.HandleAlertAndThenCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getCompleteTransaction(strRegressionID, transaction, test);
				BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test); 
			}
			
			// SearchQuote
				if (transactionsList.contains("SearchQuote")) {
					String transaction = "SearchQuote";
					WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
					CommonMethods.SearchQuotePolicyNo(strRegressionID, transaction, test);
					CommonMethods.getDashboardActions(strRegressionID, transaction, test);

				}
				
			//FlatCancellation
			if(transactionsList.contains("FlatCancellation")){
				String transaction = "FlatCancellation";
				CAWCProductInfo.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardCommissions(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test); 
			}
			
			//SearchQuote
			if(transactionsList.contains("BookClonedPolicy")){
				String transaction = "BookClonedPolicy";
				CommonMethods.getPreviousQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				
			}
			
			if(transactionsList.contains("ProRataEndorsement1")){
				String transaction = "ProRataEndorsement1";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				CAWCProductInfo.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Auto",test);
				CommonMethods.NavigateTo("Additional Interest (2)",test);
				CAAdditionalInterest.AdditionalInterest(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardCommissions(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
		
}
catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("IN_AutoDealersRegression test failed", true, false);
			testTearDown(se);
		}
	}
}