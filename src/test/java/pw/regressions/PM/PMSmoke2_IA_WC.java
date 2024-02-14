package pw.regressions.PM;

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
import pw.pages.CA.CA_ExperienceRating;
import pw.pages.CA.CA_FellowEmployeeCoverage;
import pw.pages.CA.CA_FungiOrBacteriaLiability;
import pw.pages.CA.CA_Locations;
import pw.pages.CA.CA_PickupOrDeliveryCoverage;
import pw.pages.CA.CA_RegistrationPlates;
import pw.pages.CA.CA_StateCoverageLimits;
import pw.pages.CA.CA_Symbols;
import pw.pages.CA.CA_Vehicles;
import pw.pages.CA.CA_Year2000Endorsements;
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
import pw.pages.CU.CU_EmpLiabPolicyInfo;
import pw.pages.CU.CU_Main;
import pw.pages.CU.CU_ScheduleRating;
import pw.pages.CU.CU_UmbrellaOptions;
import pw.pages.WC.WC_Classifications;
import pw.pages.WC.WC_Locations;
import pw.pages.WC.WC_NameLocationLinking;
import pw.pages.WC.WC_StateInformation;
import pw.pages.WC.WC_WorkersCompensation;

public class PMSmoke2_IA_WC extends BaseTest {

	ExtentReports extent;
	ExtentTest test;

	public static void PMSmoke2_IA_WCMethod (Browsers myBrowser, SeHelper se, Map<String, Object> params,
			String strRegressionID, File file, XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		CAWC_ProductInfo ProductInfo = TestPageFactory.initElements(se, CAWC_ProductInfo.class);
		CAWC_PW_Producers CAWC_PW_ProducersPage = TestPageFactory.initElements(se, CAWC_PW_Producers.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		WC_Locations WC_LocationsPage = TestPageFactory.initElements(se, WC_Locations.class);
		WC_WorkersCompensation WC_WorkersCompensationPage = TestPageFactory.initElements(se,WC_WorkersCompensation.class);
		WC_NameLocationLinking WC_NameLocationLinkingPage = TestPageFactory.initElements(se,WC_NameLocationLinking.class);
		WC_StateInformation WC_StateInformationPage = TestPageFactory.initElements(se, WC_StateInformation.class);
		WC_Classifications WC_ClassificationsPage = TestPageFactory.initElements(se, WC_Classifications.class);
		PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);

		try {

			List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
			CommonFunPage.PWAppStartUp(test);
			
			if (transactionsList.contains("WCNewQuote")) {
				String transaction = "WCNewQuote";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);

				LoginPage.PWAppLogin(strRegressionID, transaction, test);
				WelcomePage.homePage(strRegressionID, transaction, test);
				ProductInfo.quote_ProdInfo(strRegressionID, transaction, test);
				CAWC_PW_ProducersPage.AddProducers(strRegressionID, transaction, test);
				CommonMethods.NavigateToNextScreen(test);
				WC_LocationsPage.Locations(strRegressionID, transaction, suspendSheet, test);
				WC_WorkersCompensationPage.WorkersCompensation(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("State Information", test);
				WC_StateInformationPage.StateInformation(strRegressionID, transaction, suspendSheet, test);
				WC_ClassificationsPage.Classifications(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				CommonMethods.NavigateToNextScreen(test);
				BillingTab.getUpdateBillingTab(strRegressionID, transaction, test);
				//CommonMethods.validateStatusModelTypeOnAnalyticsTab(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
				
			}
			
			/*if (transactionsList.contains("WCRedoNewQuote")) {
				String transaction = "WCRedoNewQuote";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
				ProductInfo.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				CommonMethods.NavigateToNextScreen(test);
				CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				CommonMethods.validateStatusModelTypeOnAnalyticsTab(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			
		}*/
			
			if (transactionsList.contains("WCConvertToPolicy")) {
			String transaction = "WCConvertToPolicy";
			CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
			CommonMethods.NavigateToNextScreen(test);
			CommonMethods.getDashboardActions(strRegressionID, transaction, test);
		
	}
			
		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("PMSmoke2_IA_WC smoke test failed", true, false);
			testTearDown(se);
		}

	}
}
