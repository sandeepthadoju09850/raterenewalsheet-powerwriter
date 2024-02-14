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
import pw.pages.COMMON.PW_Login;
import pw.pages.COMMON.PW_PremiumSummary;
import pw.pages.COMMON.PW_Producers;
import pw.pages.CP.CP_Buildings;
import pw.pages.CP.CP_CommercialPackage;
import pw.pages.CP.CP_CommercialProperty;
import pw.pages.CP.CP_Locations;
import pw.pages.CS.CyberSecurity_Main;

public class CP15_MultistateISO_CPRegression extends BaseTest {
	ExtentReports extent;
	ExtentTest test;
	
	public static void MultistateISOMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params, String strRegressionID,File file,XSSFWorkbook workbook,ExtentTest test) throws IOException {
		

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
	CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
	PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
	PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
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
			CommonMethods.CollapseAllAndNavigateTo("Commercial Package","20-CP",test);
			CommonMethods.NavigateTo("Cyber Security",test);
			CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
			//CommonMethods.getDashboardForms(strRegressionID,transaction,test);
			//CommonMethods.getDashboardSupplementaryInfo(strRegressionID,transaction,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		}
		
		//New Business Quote Revision	
		if(transactionsList.contains("ReviseQuote")){
			String transaction = "ReviseQuote";
			//List<String> pagesList = ExcelOperations.getPagesList(strRegressionID,transaction);
			CommonMethods.NavigateTo("Commercial Package",test);
			CommonMethods.NavigateTo("Commercial Property",test);
			CommonMethods.NavigateTo("Buildings (5)",test);
			//CommonMethods.NavigateToPageContaingText("Loc 2 Bldg 1",test);
			Bulidings.BuildingDetails(strRegressionID, transaction, test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
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
		
		if(transactionsList.contains("ProRataEndorsement1")){
			String transaction = "ProRataEndorsement1";
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			CommonMethods.NavigateTo("Commercial Package",test);
			CommonMethods.NavigateTo("Commercial Property",test);
			CommonMethods.NavigateToNextScreen(test);
			Locations.Locations(strRegressionID, transaction, test);
			Bulidings.BuildingDetails(strRegressionID, transaction, test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);	
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			CommonMethods.getDashboardForms(strRegressionID,transaction,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		}
		//ProRataEndorsementOOSE
		if(transactionsList.contains("EndorsementOOSE")){
			String transaction = "EndorsementOOSE";
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			CommonMethods.NavigateTo("Commercial Package",test);
			CommonMethods.NavigateTo("Commercial Property",test);
			CommonMethods.NavigateToPageContaingText("Buildings", test);
			Bulidings.BuildingDetails(strRegressionID, transaction, test);
			CommonMethods.NavigateToPageContaingText("Locations",test);
			Locations.Locations(strRegressionID, transaction, test);
			
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);	
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);	
			//PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			CommonMethods.getDashboardForms(strRegressionID,transaction,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		}
		
		if(transactionsList.contains("ProRataEndorsement2")){
			String transaction = "ProRataEndorsement2";
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			CommonMethods.NavigateTo("Commercial Package",test);
			CommonMethods.NavigateTo("Commercial Property",test);
			CommonMethods.NavigateToNextScreen(test);
			Locations.Locations(strRegressionID, transaction, test);
			Bulidings.BuildingDetails(strRegressionID, transaction, test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);	
			//PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			CommonMethods.getDashboardForms(strRegressionID,transaction,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			
		}
		
		if(transactionsList.contains("QuoteForRenewal")){
			String transaction = "QuoteForRenewal";
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			CommonMethods.NavigateTo("Commercial Package",test);
			CommonMethods.NavigateTo("Commercial Property",test);
			CommercialProperty.CommercialPropertyMethod(strRegressionID, transaction, test);
			CommonMethods.NavigateToNextScreen(test);
			CommonMethods.NavigateToPageContaingText("Buildings (6)", test);
			Bulidings.BuildingDetails(strRegressionID, transaction, test);
			CommonMethods.NavigateToPageContaingText("Buildings (6)", test);
			Bulidings.BuildingDetails(strRegressionID, "QuoteForRenewal1", test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);	
			//PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		}
		//QFRRevise
		if(transactionsList.contains("QFRRevise")){
			String transaction = "QFRRevise";
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			CommonMethods.NavigateTo("Commercial Package",test);
			CommonMethods.NavigateTo("Commercial Property",test);
			CommonMethods.NavigateToNextScreen(test);
			Locations.Locations(strRegressionID, transaction, test);
			Bulidings.BuildingDetails(strRegressionID, transaction, test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);	
			//PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
		CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		}
		
		
		if(transactionsList.contains("ConvertQFRToPolicy")){
			String transaction = "ConvertQFRToPolicy";
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);	
			//PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		}
		
	} catch (Exception e) {
		e.printStackTrace();
		se.verify().verifyEquals("Multi ISO CP test failed", true, false);
		testTearDown(se);
	}
}

}
