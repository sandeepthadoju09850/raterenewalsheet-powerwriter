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
import pw.pages.CAF.CAF_CrimeEndorsement;
import pw.pages.CAF.CAF_InsuringAgreements;
import pw.pages.CAF.CAF_Locations;
import pw.pages.CAF.CrimeAndFidelity_Main;
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

public class CP25_MonolineCR_CPRegression extends BaseTest {
	ExtentReports extent;
	ExtentTest test;

	public static void MonolineCRCPRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login  LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
		PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
		PW_AddNamedInsured AddNamedInsuredPage = TestPageFactory.initElements(se, PW_AddNamedInsured.class);
		CP_CommercialPackage CommercialPackage =  TestPageFactory.initElements(se, CP_CommercialPackage.class);
		CrimeAndFidelity_Main CrimeAndFidelity_MainPage = TestPageFactory.initElements(se, CrimeAndFidelity_Main.class);
		CAF_Locations CAF_LocationsPage =TestPageFactory.initElements(se, CAF_Locations.class);
		CAF_InsuringAgreements CAF_InsuringAgreementsPage =TestPageFactory.initElements(se, CAF_InsuringAgreements.class);
		CAF_CrimeEndorsement Crime_EndorsementsPage =TestPageFactory.initElements(se, CAF_CrimeEndorsement.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		//PW_PremiumSummaryBackUp PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummaryBackUp.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
		PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);
		
		try {
			List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
			//int iteration = 0;
			CommonFunPage.PWAppStartUp(test);
			
			//New Transaction Actions
			
			if(transactionsList.contains("NewQuote")){
			String transaction = "NewQuote";
			
			LoginPage.PWAppLogin(strRegressionID,transaction,test);
			WelcomePage.homePage(strRegressionID, transaction, test);
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
			ProducerPage.AddProducers(strRegressionID, transaction, test);
			AddNamedInsuredPage.AddAdditionalNamedInsuredMethod(strRegressionID,transaction, test); 
			String cyberChkY = CommercialPackage.CommercialPackage(strRegressionID,transaction, test);
			CrimeAndFidelity_MainPage.CrimeAndFidelity_MainPage(strRegressionID,transaction,test);
			CAF_LocationsPage.CAF_Locations_Details(strRegressionID,transaction,test);
			CAF_InsuringAgreementsPage.CAF_InsuringAgreementsPage(strRegressionID,transaction,test);
			Crime_EndorsementsPage.CAF_CrimeEndorsementMethod(strRegressionID,transaction,test); 
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			//PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
			//CommonMethods.getDashboardForms(strRegressionID,transaction,test);
			//CommonMethods.getDashboardSupplementaryInfo(strRegressionID,transaction,test); 
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				 
			}
			
			//Convert To Policy1
			 if(transactionsList.contains("ConvertToPolicy1")){ 
			  String transaction ="ConvertToPolicy1";
			  CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			  //PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,test);
			  PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			  CommonMethods.getDashboardActions(strRegressionID,transaction,test); }
			 
			 
			//FlatEndorsement1
			if(transactionsList.contains("FlatEndorsement1")){
			String transaction = "FlatEndorsement1";
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			CommonMethods.NavigateTo("Commercial Package",test);
			CommonMethods.NavigateTo("Crime and Fidelity",test);
			CommonMethods.NavigateTo("Endorsements (2)",test);
			Crime_EndorsementsPage.CAF_CrimeEndorsementMethod(strRegressionID,transaction,test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			//PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			//CommonMethods.getDashboardForms(strRegressionID,transaction,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				 
			
			}
			
			//Quote For Renewal
			if(transactionsList.contains("QuoteForRenewal")){
			String transaction = "QuoteForRenewal";
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			//PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				 
		}
			
			//Convert To Policy2
			if(transactionsList.contains("ConvertToPolicy2")){
			String transaction = "ConvertToPolicy2";
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			CommonMethods.NavigateTo("Commercial Package",test);
			CommonMethods.NavigateTo("Crime and Fidelity",test);
			CrimeAndFidelity_MainPage.CrimeAndFidelity_MainPage(strRegressionID,transaction,test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);	
			//PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			//CommonMethods.getDashboardForms(strRegressionID,transaction,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			
			}
}
		
			 catch (Exception e) {
					e.printStackTrace();
					se.verify().verifyEquals("MonolineCRCPRegression test  failed", true, false);
					testTearDown(se);
				}
		}
}
