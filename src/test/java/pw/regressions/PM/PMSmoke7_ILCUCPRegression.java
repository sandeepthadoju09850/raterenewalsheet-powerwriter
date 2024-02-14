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
import pw.pages.COMMON.PW_BillingTab;
import pw.pages.COMMON.PW_CommonFun;
import pw.pages.COMMON.PW_CommonMethods;
import pw.pages.COMMON.PW_GenInfo;
import pw.pages.COMMON.PW_Home;
import pw.pages.COMMON.PW_Login;
import pw.pages.COMMON.PW_PremiumSummary;
import pw.pages.COMMON.PW_Producers;
import pw.pages.CP.CP_CommercialPackage;
import pw.pages.CU.CU_GLPolicyInfo;
import pw.pages.CU.CU_Main;
import pw.pages.CU.CU_ManualFactors;
import pw.pages.CU.CU_UmbrellaOptions;
import pw.pages.GL.GL_AbuseAndMolestation;
import pw.pages.GL.GL_AbuseAndMolestationClassification;
import pw.pages.GL.GL_Classifications;
import pw.pages.GL.GL_ExperienceRating;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_OptionalProvisions;
import pw.pages.GL.GL_PremAndProd;
import pw.pages.GL.GL_ProfessionalLiabilityOccurance;
import pw.pages.GL.GL_SpecialityOption;
import pw.pages.GL.GeneralLiability;

public class PMSmoke7_ILCUCPRegression extends BaseTest{
	ExtentReports extent;
	ExtentTest test;
		
	public static void PMSmoke7_ILCUCPRegressionMethod (Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login  LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
		PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
		CP_CommercialPackage CommercialPackage =  TestPageFactory.initElements(se, CP_CommercialPackage.class);
		GeneralLiability GeneralLiabilityPage = TestPageFactory.initElements(se, GeneralLiability.class);
		GL_Location GLLocations = TestPageFactory.initElements(se, GL_Location.class);
		GL_PremAndProd GLPremAndProd = TestPageFactory.initElements(se, GL_PremAndProd.class);
		GL_Classifications GLClassifications = TestPageFactory.initElements(se, GL_Classifications.class);
		GL_SpecialityOption GLSpecialityOptionPage=TestPageFactory.initElements(se, GL_SpecialityOption.class);
		GL_ExperienceRating GLExperienceRating = TestPageFactory.initElements(se, GL_ExperienceRating.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		CU_Main CU_MainPage = TestPageFactory.initElements(se, CU_Main.class);
		CU_GLPolicyInfo CUGLPolicyInfoPage = TestPageFactory.initElements(se, CU_GLPolicyInfo.class);
		CU_UmbrellaOptions  CUUmbrellaOptionsPage = TestPageFactory.initElements(se, CU_UmbrellaOptions.class);
		PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);
		try {
			List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
			//int iteration = 0;
			CommonFunPage.PWAppStartUp(test);
			//New Transaction Actions
			if(transactionsList.contains("CPNewQuote")){
				String transaction = "CPNewQuote";
				
				LoginPage.PWAppLogin(strRegressionID,transaction,test);
				WelcomePage.homePage(strRegressionID,transaction, test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				ProducerPage.AddProducers(strRegressionID,transaction,test);
				CommonMethods.NavigateToNextScreen(test);
				String cyberChkY = CommercialPackage.CommercialPackage(strRegressionID,transaction, test);
				GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID, transaction, test);
				GLLocations.GL_Location_Details(strRegressionID, transaction, test);
				CommonMethods.NavigateToNextScreen(test);
				GLPremAndProd.GL_PremAndProdPage(strRegressionID, transaction, test);
				GLClassifications.GL_ClassificationsPage(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Specialty Option",test);
				GLSpecialityOptionPage.GL_SpecialityOption_Details(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Experience Rating",test);
				GLExperienceRating.GLExperienceRatingPage(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				CommonMethods.getCompleteTransaction(strRegressionID,transaction,test);
				BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
				CommonMethods.getDashboardForms(strRegressionID, transaction, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
				
			}
			
				
			
			if(transactionsList.contains("CUNewQuote")){
				String transaction = "CUNewQuote";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				WelcomePage.homePage(strRegressionID,transaction, test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				ProducerPage.AddProducers(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Umbrella",test);
				CU_MainPage.CU_MainPage(strRegressionID,transaction,suspendSheet,test);
				CUGLPolicyInfoPage.generalLiabPolicyInfo_Main(strRegressionID, transaction,suspendSheet, test);
				CommonMethods.NavigateTo("Umbrella Options",test);
				CUUmbrellaOptionsPage.UmbrellaOptions_Main(strRegressionID, transaction,suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);	
				CommonMethods.getCompleteTransaction(strRegressionID,transaction,test);
				BillingTab.getUpdateBillingTab(strRegressionID, transaction, test);
				CommonMethods.getDashboardForms(strRegressionID, transaction, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}
			

			
			if(transactionsList.contains("CPConvertToPolicy")){
				String transaction = "CPConvertToPolicy";
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CPNewQuote", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				CommonMethods.getCompleteTransaction(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
				
			}
			

			
			if(transactionsList.contains("CUConvertToPolicy")){
				String transaction = "CUConvertToPolicy";
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CUNewQuote", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				CommonMethods.getCompleteTransaction(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}
			
			
			
			
			
	
	} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("CU Smoke Regression for Get ISO test  failed", true, false);
			testTearDown(se);
		}
	}

	}


