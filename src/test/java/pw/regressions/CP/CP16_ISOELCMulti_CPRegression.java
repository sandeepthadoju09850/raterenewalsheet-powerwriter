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
import pw.pages.COMMON.PW_AddNamedInsured;
import pw.pages.COMMON.PW_BillingTab;
import pw.pages.COMMON.PW_CommonFun;
import pw.pages.COMMON.PW_CommonMethods;
import pw.pages.COMMON.PW_GenInfo;
import pw.pages.COMMON.PW_Home;
import pw.pages.COMMON.PW_KYTaxExemption;
import pw.pages.COMMON.PW_Login;
import pw.pages.COMMON.PW_PremiumSummary;
import pw.pages.COMMON.PW_Producers;
import pw.pages.CP.CP_Buildings;
import pw.pages.CP.CP_CommercialPackage;
import pw.pages.CP.CP_CommercialProperty;
import pw.pages.CP.CP_Locations;
import pw.pages.CP.CP_MNFireSafetySurcharge;
import pw.pages.CS.CyberSecurity_Main;

public class CP16_ISOELCMulti_CPRegression extends BaseTest {
	ExtentReports extent;
	ExtentTest test;
	
	public static void ISOELCMultiMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params, String strRegressionID,File file,XSSFWorkbook workbook,ExtentTest test) throws IOException {
		

	PW_Login LoginPage = TestPageFactory.initElements(se, PW_Login.class);
	PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
	PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
	PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
	PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
	PW_AddNamedInsured AddNamedInsuredPage = TestPageFactory.initElements(se, PW_AddNamedInsured.class);
	CP_CommercialPackage CommercialPackage =  TestPageFactory.initElements(se, CP_CommercialPackage.class);
	CP_CommercialProperty CommercialProperty =  TestPageFactory.initElements(se, CP_CommercialProperty.class);
	CP_Locations Locations = TestPageFactory.initElements(se, CP_Locations.class);
	CP_Buildings Bulidings = TestPageFactory.initElements(se, CP_Buildings.class);
	PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
	PW_KYTaxExemption KYTaxInformation  = TestPageFactory.initElements(se, PW_KYTaxExemption.class);
	PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
	CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
	CP_MNFireSafetySurcharge CPMNFireSafetySurcharge = TestPageFactory.initElements(se, CP_MNFireSafetySurcharge.class);
	PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);

	try {
		
		List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
		//int iteration = 0;
		CommonFunPage.PWAppStartUp(test);
		
		//New Transaction Actions
		
		if(transactionsList.contains("NewQuote")){
			String transaction = "NewQuote";
			
			LoginPage.PWAppLogin(strRegressionID,transaction,test);
			WelcomePage.homePage(strRegressionID,transaction, test);
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			ProducerPage.AddProducers(strRegressionID,transaction,test);
			AddNamedInsuredPage.AddAdditionalNamedInsuredMethod(strRegressionID,transaction,test);
			String cyberChkY = CommercialPackage.CommercialPackage(strRegressionID,transaction,test);
			CommercialProperty.CommercialPropertyMethod(strRegressionID, transaction, test);
			Locations.Locations(strRegressionID, transaction, test);
			Bulidings.BuildingDetails(strRegressionID, transaction, test);
			CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
			//CommonMethods.getDashboardForms(strRegressionID,transaction,test);
			//CommonMethods.getDashboardSupplementaryInfo(strRegressionID,transaction,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		}
		
		//Convert To Policy
		if(transactionsList.contains("ConvertToPolicy")){
			String transaction = "ConvertToPolicy";
			//List<String> pagesList = ExcelOperations.getPagesList(strRegressionID,transaction);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		}
		
		//Clone Policy
		if(transactionsList.contains("ClonePolicy")){
			String transaction = "ClonePolicy";
			//List<String> pagesList = ExcelOperations.getPagesList(strRegressionID,transaction);
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			ProducerPage.AddProducers(strRegressionID,transaction,test);
			CommonMethods.NavigateToPage("Commercial Package",test);
			CommercialPackage.CommercialPackage(strRegressionID,transaction,test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		}
		
		//SearchQuote
		if(transactionsList.contains("SearchQuote")){
			String transaction = "SearchQuote";
			//List<String> pagesList = ExcelOperations.getPagesList(strRegressionID,transaction);
			WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
			CommonMethods.getPreviousQuoteNo(strRegressionID,transaction,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		}
		
		//Cancellation
		if(transactionsList.contains("Cancellation")){
			String transaction = "Cancellation";
			//List<String> pagesList = ExcelOperations.getPagesList(strRegressionID,transaction);
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		}
		
		//SearchQuote
		if(transactionsList.contains("SearchQuote2")){
			String transaction = "SearchQuote2";
			//List<String> pagesList = ExcelOperations.getPagesList(strRegressionID,transaction);
			WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
			CommonMethods.getPreviousQuoteNo(strRegressionID,transaction,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		}
		
		//Convert To Policy2
		if(transactionsList.contains("ConvertToPolicy2")){
			String transaction = "ConvertToPolicy2";
			//List<String> pagesList = ExcelOperations.getPagesList(strRegressionID,transaction);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		}
		
		//FlatEndorsement
		if(transactionsList.contains("FlatEndorsement1")){
			String transaction = "FlatEndorsement1";
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			CommonMethods.NavigateToPage("Locations (1)",test);
			Locations.Locations(strRegressionID, transaction, test);
			Bulidings.BuildingDetails(strRegressionID, transaction, test);
			CommonMethods.NavigateToPage("KY Tax Exemption",test);
			KYTaxInformation.KYTaxExemption(strRegressionID,transaction,test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			//CommonMethods.getDashboardForms(strRegressionID,transaction,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
		se.verify().verifyEquals("ISO ELC Multi_CP test  failed", true, false);
		testTearDown(se);
	}
}

}
