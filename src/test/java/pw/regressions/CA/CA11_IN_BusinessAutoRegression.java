package pw.regressions.CA;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import pw.pages.CA.CA_AdditionalCoverages;
import pw.pages.CA.CA_AdditionalInterest;
import pw.pages.CA.CA_AutoAdditionalInsuredWRAP;
import pw.pages.CA.CA_CommercialAuto;
import pw.pages.CA.CA_ExperienceRating;
import pw.pages.CA.CA_HiredOrBorrowedAuto;
import pw.pages.CA.CA_LeasedWorkersCoverage;
import pw.pages.CA.CA_LiabilityExperienceRating;
import pw.pages.CA.CA_LimitedBroadenedPollutionLiability;
import pw.pages.CA.CA_LimitedMexicoCoverage;
import pw.pages.CA.CA_NonOwnedLiability;
import pw.pages.CA.CA_PhysicalDamageExperienceRating;
import pw.pages.CA.CA_ScheduleRating;
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
import Libraries.automation.common.BaseTest;
import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.SeHelper;
import Libraries.automation.common.Utils.TestPageFactory;
import Libraries.automation.common.framework.Browser.Browsers;

public class CA11_IN_BusinessAutoRegression extends BaseTest{

	ExtentReports extent;
	ExtentTest test;
	public static void INBusinessAutoRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params, String strRegressionID,File file,XSSFWorkbook workbook,ExtentTest test) throws IOException {
		

		PW_Login LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		CAWC_ProductInfo CAWCProductInfo = TestPageFactory.initElements(se, CAWC_ProductInfo.class);
		CAWC_PW_Producers CAWCPWProducers = TestPageFactory.initElements(se, CAWC_PW_Producers.class);
		CA_CommercialAuto CACommercialAuto =  TestPageFactory.initElements(se, CA_CommercialAuto.class);
		CA_StateCoverageLimits CAStateCoverageLimits =  TestPageFactory.initElements(se, CA_StateCoverageLimits.class);
		CA_Symbols CASymbols  =  TestPageFactory.initElements(se, CA_Symbols.class);
		CA_LeasedWorkersCoverage  CA_LeasedWorkersCoveragepage = TestPageFactory.initElements(se, CA_LeasedWorkersCoverage.class);
		CA_LimitedMexicoCoverage CA_LimitedMexicoCoveragepage = TestPageFactory.initElements(se, CA_LimitedMexicoCoverage.class);
		CA_LimitedBroadenedPollutionLiability CA_LimitedBroadenedPollutionLiabilitypage = TestPageFactory.initElements(se, CA_LimitedBroadenedPollutionLiability.class);
		CA_AdditionalCoverages CAAdditionalCoverages = TestPageFactory.initElements(se, CA_AdditionalCoverages.class);
		CA_HiredOrBorrowedAuto CAHiredOrBorrowedAuto = TestPageFactory.initElements(se, CA_HiredOrBorrowedAuto.class);
		CA_NonOwnedLiability CA_NonOwnedLiabilitypage= TestPageFactory.initElements(se, CA_NonOwnedLiability.class);
		CA_ScheduleRating CAScheduleRating = TestPageFactory.initElements(se, CA_ScheduleRating.class);
		CA_Vehicles CAVehicles = TestPageFactory.initElements(se, CA_Vehicles.class);
		CA_AutoAdditionalInsuredWRAP CA_AutoAdditionalInsuredWRAPpage = TestPageFactory.initElements(se, CA_AutoAdditionalInsuredWRAP.class);
		CA_AdditionalInterest CAAdditionalInterest = TestPageFactory.initElements(se, CA_AdditionalInterest.class);
		CA_ExperienceRating CAExperienceRating = TestPageFactory.initElements(se, CA_ExperienceRating.class);
		CA_LiabilityExperienceRating CALiabilityExperienceRating = TestPageFactory.initElements(se, CA_LiabilityExperienceRating.class);
		CA_PhysicalDamageExperienceRating CAPhysicalDamageExperienceRating = TestPageFactory.initElements(se, CA_PhysicalDamageExperienceRating.class);
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
			
			if(transactionsList.contains("NewQuote")){
				String transaction = "NewQuote";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				LoginPage.PWAppLogin(strRegressionID,transaction,test);
				WelcomePage.homePage(strRegressionID,transaction, test);
				CAWCProductInfo.quote_ProdInfo(strRegressionID,transaction,test);
				CAWCPWProducers.AddProducers(strRegressionID,transaction,test);
				CommonMethods.NavigateToNextScreen(test);
				CACommercialAuto.CommercialAuto(strRegressionID, transaction, suspendSheet, test);
				CAStateCoverageLimits.StateCoverageLimits(strRegressionID,transaction,suspendSheet, test);
				CASymbols.Symbols(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Vehicles", test);
				CAVehicles.CA_VehiclesPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Additional Coverages", test);
				CAAdditionalCoverages.AdditionalCoverages(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Hired/Borrowed Auto", test);
				CAHiredOrBorrowedAuto.HiredOrBorrowedAuto(strRegressionID, transaction, suspendSheet, test);
				CA_LeasedWorkersCoveragepage.LeasedWorkersCoverage(strRegressionID, transaction, suspendSheet, test);
				CA_LimitedMexicoCoveragepage.LimitedMexicoCoverage(strRegressionID, transaction, suspendSheet, test);
				CA_NonOwnedLiabilitypage.CANonOwnedLiabilityPage(strRegressionID, transaction, suspendSheet, test);
				//CA_LimitedBroadenedPollutionLiabilitypage.LimitedBroadenedPollutionLiability(strRegressionID, transaction, suspendSheet, test);
				CA_AutoAdditionalInsuredWRAPpage.AutoAdditionalInsuredWRAP(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Additional Interest", test);
				CAAdditionalInterest.AdditionalInterest(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Experience Rating", test);
				CAExperienceRating.ExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CALiabilityExperienceRating.LiabilityExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CAPhysicalDamageExperienceRating.PhysicalDamageExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CAScheduleRating.CA_ScheduleRatingPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test); 
				
			}
			//ReviseNewQuote
			if(transactionsList.contains("ReviseNewQuote")){
				String transaction = "ReviseNewQuote";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				CommonMethods.NavigateTo("Commercial Auto", test);
				CommonMethods.NavigateToNextScreen(test);
				CAStateCoverageLimits.StateCoverageLimits(strRegressionID,transaction,suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);	
				CommonMethods.getDashboardActions(strRegressionID,transaction,test); 
			}
			//ConverttoPolicy-1
			if(transactionsList.contains("ConvertToPolicy")){
				String transaction = "ConvertToPolicy";
				
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test); 
			}
			
			
			//QuoteforRenewal
			if(transactionsList.contains("QuoteForRenewal")){
				String transaction = "QuoteForRenewal";
				CAWCProductInfo.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			//ConverttoPolicy-2
			if(transactionsList.contains("ConvertQFRToPolicy")){
				String transaction = "ConvertQFRToPolicy";
				CAWCProductInfo.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				DashboardFormsComparision.Dashboard_FormsComparision(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			
		
}
catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("CA11_IN_BusinessAutoRegression test  failed", true, false);
			testTearDown(se);
		}
	}
}