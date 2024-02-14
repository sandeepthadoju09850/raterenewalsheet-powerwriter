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
import pw.pages.CA.CA_CommercialAuto;
import pw.pages.CA.CA_NonOwnedLiability;
import pw.pages.CA.CA_StateCoverageLimits;
import pw.pages.CA.CA_Symbols;
import pw.pages.CA.CA_Vehicles;
import pw.pages.COMMON.CAWC_PW_Producers;
import pw.pages.COMMON.CAWC_ProductInfo;
import pw.pages.COMMON.PW_BillingTab;
import pw.pages.COMMON.PW_CommonFun;
import pw.pages.COMMON.PW_CommonMethods;
import pw.pages.COMMON.PW_Home;
import pw.pages.COMMON.PW_Login;
import pw.pages.COMMON.PW_PremiumSummary;

public class PMSmoke1_MI_CA extends BaseTest {

	ExtentReports extent;
	ExtentTest test;

	public static void PMSmoke1_MI_CAMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,
			String strRegressionID, File file, XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		CAWC_ProductInfo ProductInfo = TestPageFactory.initElements(se, CAWC_ProductInfo.class);
		CAWC_PW_Producers CAWC_PW_ProducersPage = TestPageFactory.initElements(se, CAWC_PW_Producers.class);
		CA_CommercialAuto CommercialAuto = TestPageFactory.initElements(se, CA_CommercialAuto.class);
		CA_StateCoverageLimits StateCoverageLimits = TestPageFactory.initElements(se, CA_StateCoverageLimits.class);
		CA_Vehicles Vehicles = TestPageFactory.initElements(se, CA_Vehicles.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		CA_NonOwnedLiability NonOwnedLiability = TestPageFactory.initElements(se, CA_NonOwnedLiability.class);
		CA_AdditionalCoverages AdditionalCoverages = TestPageFactory.initElements(se, CA_AdditionalCoverages.class);
		CA_Symbols CA_SymbolsPage = TestPageFactory.initElements(se, CA_Symbols.class);
		PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);
		

		try {

			List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
			CommonFunPage.PWAppStartUp(test);

			// New Transaction Actions
			if (transactionsList.contains("CANewQuote")) {
				String transaction = "CANewQuote";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);

				LoginPage.PWAppLogin(strRegressionID, transaction, test);
				WelcomePage.homePage(strRegressionID, transaction, test);
				ProductInfo.quote_ProdInfo(strRegressionID, transaction, test);
				CAWC_PW_ProducersPage.AddProducers(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Auto", test);
				CommercialAuto.CommercialAuto(strRegressionID, transaction, suspendSheet, test);
				StateCoverageLimits.StateCoverageLimits(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Vehicles", test);
				Vehicles.CA_VehiclesPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.CollapseAllAndNavigateTo("Commercial Auto", "-A", test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				//PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook,test);
				CommonMethods.NavigateToNextScreen(test);
				BillingTab.getUpdateBillingTab(strRegressionID, transaction, test);
				CommonMethods.validateStatusModelTypeOnAnalyticsTab(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}
			
			if (transactionsList.contains("CARedoNewQuote")) {
				String transaction = "CARedoNewQuote";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
				ProductInfo.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Auto",test);
				CommonMethods.NavigateTo("Covered Auto Symbols",test);
				CA_SymbolsPage.Symbols(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Additional Coverages",test);
				AdditionalCoverages.AdditionalCoverages(strRegressionID, transaction, suspendSheet, test);
				NonOwnedLiability.CANonOwnedLiabilityPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				CommonMethods.NavigateToNextScreen(test);
				CommonMethods.validateStatusModelTypeOnAnalyticsTab(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}

		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("PMSmoke1_MI_CA Smoke test failed", true, false);
			testTearDown(se);
		}
	}
}
