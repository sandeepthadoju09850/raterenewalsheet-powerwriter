package pw.regressions.CP;

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
import Libraries.automation.common.framework.Util;
import Libraries.automation.common.framework.Browser.Browsers;
import pw.Constants.constants;
import pw.pages.COMMON.PW_AddNamedInsured;
import pw.pages.COMMON.PW_BillingTab;
import pw.pages.COMMON.PW_CommonFun;
import pw.pages.COMMON.PW_CommonMethods;
import pw.pages.COMMON.PW_GenInfo;
import pw.pages.COMMON.PW_Home;
import pw.pages.COMMON.PW_Login;
import pw.pages.COMMON.PW_PremiumSummary;
import pw.pages.COMMON.PW_Producers;
import pw.pages.CP.CP_CommercialPackage;
import pw.pages.CS.CyberSecurity_Main;
import pw.pages.GL.GL_ExclusionProvisions;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_OCPClassifications;
import pw.pages.GL.GL_OCPLiability;
import pw.pages.GL.GeneralLiability;

public class CP23_OCP_CPRegression extends BaseTest {
	ExtentReports extent;
	ExtentTest test;

	public static void OCPCPRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,
			String strRegressionID, File file, XSSFWorkbook workbook, ExtentTest test) throws IOException {

		PW_Login LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
		PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
		PW_AddNamedInsured AddNamedInsuredPage = TestPageFactory.initElements(se, PW_AddNamedInsured.class);
		CP_CommercialPackage CommercialPackage = TestPageFactory.initElements(se, CP_CommercialPackage.class);
		GeneralLiability GeneralLiabilityPage = TestPageFactory.initElements(se, GeneralLiability.class);
		GL_Location GL_LocationPage = TestPageFactory.initElements(se, GL_Location.class);
		GL_OCPLiability GL_OCPLiabilityPage = TestPageFactory.initElements(se, GL_OCPLiability.class);
		GL_OCPClassifications GL_OCPClassificationsPage = TestPageFactory.initElements(se, GL_OCPClassifications.class);
		GL_ExclusionProvisions GL_ExclusionProvisionsPage = TestPageFactory.initElements(se, GL_ExclusionProvisions.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
		PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);

		try {
			List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
			String transaction;
			CommonFunPage.PWAppStartUp(test);

			// New Transaction Actions

			if (transactionsList.contains(constants.NewQuote)) {
				transaction = constants.NewQuote;

				LoginPage.PWAppLogin(strRegressionID, transaction, test);
				WelcomePage.homePage(strRegressionID, transaction, test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				ProducerPage.AddProducers(strRegressionID, transaction, test);
				AddNamedInsuredPage.AddAdditionalNamedInsuredMethod(strRegressionID, transaction, test);
				String cyberChkY = CommercialPackage.CommercialPackage(strRegressionID, transaction, test);
				GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID, transaction, test);
				GL_LocationPage.GL_Location_Details(strRegressionID, transaction, test);
				GL_OCPLiabilityPage.OCPLiability(strRegressionID, transaction, test);
				GL_OCPClassificationsPage.OCPClassifications(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Optional Provisions", test);
				CommonMethods.NavigateTo("Exclusion Provisions (2)", test);
				GL_ExclusionProvisionsPage.GL_ExclusionProvisionsMethod(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				String quoteNumber = Util.getQuoteNumber(strRegressionID, transaction);
				CommonMethods.CollapseAll(quoteNumber, test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, constants.NewQuote1, test);
				//6/9/2021 Sheetal removed workaround added for DF-7946
				/*CommonMethods.NavigateTo("Commercial Package",test);
				CommercialPackage.CommercialPackage(strRegressionID, transaction, test);*/
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				BillingTab.getUpdateBillingTab(strRegressionID, transaction, test);
				CommonMethods.getDashboardForms(strRegressionID, transaction, test);
				//CommonMethods.getDashboardSupplementaryInfo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}

			// Convert To Policy

			if (transactionsList.contains(constants.ConvertToPolicy)) {
				transaction = constants.ConvertToPolicy;

				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}

			// FlatEndorsement1
			if (transactionsList.contains(constants.FlatEndorsement1)) {
				transaction = constants.FlatEndorsement1;

				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Package",test);
				CommonMethods.NavigateTo("General Liability",test);
				CommonMethods.NavigateTo("OCP Liability",test);
				CommonMethods.NavigateTo("Classifications (1)",test);
				GL_OCPClassificationsPage.OCPClassifications(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				//CommonMethods.getDashboardForms(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}

			// Quote For Renewal
			if (transactionsList.contains(constants.QFR)) {
				transaction = constants.QFR;
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}

			// Convert QFR To Policy
			if (transactionsList.contains(constants.ConvertQFRToPolicy)) {
				transaction = constants.ConvertQFRToPolicy;
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}

		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("OCPCPRegression test  failed", true, false);
			testTearDown(se);
		}
	}

}
