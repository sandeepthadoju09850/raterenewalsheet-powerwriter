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
import Libraries.automation.common.framework.Browser.Browsers;
import pw.Constants.constants;
import pw.pages.COMMON.PW_BillingTab;
import pw.pages.COMMON.PW_CommonFun;
import pw.pages.COMMON.PW_CommonMethods;
import pw.pages.COMMON.PW_GenInfo;
import pw.pages.COMMON.PW_Home;
import pw.pages.COMMON.PW_KYTaxExemption;
import pw.pages.COMMON.PW_Login;
import pw.pages.COMMON.PW_PremiumSummary;
import pw.pages.COMMON.PW_Producers;
import pw.pages.CP.CP_CommercialPackage;
import pw.pages.CS.CyberSecurity_Main;
import pw.pages.GL.GL_AdditionalInterest;
import pw.pages.GL.GL_Classifications;
import pw.pages.GL.GL_LiquorLiability;
import pw.pages.GL.GL_LiquorLiability_Classifications;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_OptionalProvisions;
import pw.pages.GL.GL_PremAndProd;
import pw.pages.GL.GL_SpecialEvents;
import pw.pages.GL.GL_Terrorism;
import pw.pages.GL.GeneralLiability;

public class CP24_SELiability_CPRegression extends BaseTest {

	ExtentReports extent;
	ExtentTest test;

	public static void SELiabilityCPRegression_Method(Browsers myBrowser, SeHelper se, Map<String, Object> params,
			String strRegressionID, File file, XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
		PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		PW_KYTaxExemption KYTaxExemption = TestPageFactory.initElements(se, PW_KYTaxExemption.class);

		CP_CommercialPackage CommercialPackage = TestPageFactory.initElements(se, CP_CommercialPackage.class);

		GeneralLiability GeneralLiabilityPage = TestPageFactory.initElements(se, GeneralLiability.class);
		GL_Location GLLocationPage = TestPageFactory.initElements(se, GL_Location.class);
		GL_PremAndProd GLPremAndProdPage = TestPageFactory.initElements(se, GL_PremAndProd.class);
		GL_SpecialEvents GLSpecialEventsPage = TestPageFactory.initElements(se, GL_SpecialEvents.class);
		GL_Classifications GLClassificationsPage = TestPageFactory.initElements(se, GL_Classifications.class);
		GL_LiquorLiability GLLiquorLiabilityPage = TestPageFactory.initElements(se, GL_LiquorLiability.class);
		GL_LiquorLiability_Classifications GLLiquorLiabilityClassificationsPage = TestPageFactory.initElements(se,
				GL_LiquorLiability_Classifications.class);
		GL_AdditionalInterest GLAdditionalInterestPage = TestPageFactory.initElements(se, GL_AdditionalInterest.class);
		GL_OptionalProvisions GLOptionalProvisionsPage = TestPageFactory.initElements(se, GL_OptionalProvisions.class);
		GL_Terrorism GLTerrorismPage = TestPageFactory.initElements(se, GL_Terrorism.class);
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
			CommonMethods.NavigateToPage(constants.CPkg, test);
			String cyberChkY = CommercialPackage.CommercialPackage(strRegressionID, transaction, test);
			GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID, transaction, test);
			GLLocationPage.GL_Location_Details(strRegressionID, transaction, test);
			GLPremAndProdPage.GL_PremAndProdPage(strRegressionID, transaction, test);
			GLSpecialEventsPage.GL_SpecialEvents_Details(strRegressionID, transaction, test);
			GLClassificationsPage.GL_ClassificationsPage(strRegressionID, transaction, test);
			GLLiquorLiabilityPage.GL_LiquorLiability_Details(strRegressionID, transaction, test);
			GLLiquorLiabilityClassificationsPage.GL_LiquorLiability_ClassificationsPage(strRegressionID, transaction,
					test);
			GLAdditionalInterestPage.GL_AdditionalInterest_Details(strRegressionID, transaction, test);
			GLOptionalProvisionsPage.CP_GLOptionalProvisions(strRegressionID, transaction, test);
			GLTerrorismPage.GL_TerrorismPage(strRegressionID, transaction, test);
			KYTaxExemption.KYTaxExemption(strRegressionID, transaction, test);
			CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
			CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
			PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
			BillingTab.getUpdateBillingTab(strRegressionID, transaction, test);
			CommonMethods.getDashboardForms(strRegressionID, transaction, test);
			//CommonMethods.getDashboardSupplementaryInfo(strRegressionID, transaction, test);
			CommonMethods.getDashboardActions(strRegressionID, transaction, test);
		}

		//Convert To Policy
		if(transactionsList.contains(constants.ConvertToPolicy)){
			transaction = constants.ConvertToPolicy;
			
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		}

		// FlatEndorsement1
		if (transactionsList.contains(constants.FlatEndorsement1)) {
			transaction = constants.FlatEndorsement1;
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
			CommonMethods.NavigateToPage("Additional Interest", test);
			GLAdditionalInterestPage.GL_AdditionalInterest_Details(strRegressionID, transaction, test);
			CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
			PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
			//CommonMethods.getDashboardForms(strRegressionID, transaction, test);
			CommonMethods.getDashboardActions(strRegressionID, transaction, test);
		}
		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("SE Liability CP Regression test  failed", true, false);
			testTearDown(se);
		}
	}

}
