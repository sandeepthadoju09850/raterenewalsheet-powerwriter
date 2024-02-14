package pw.regressions.CU;

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
import pw.pages.CA.CA_AdditionalCoverages;
import pw.pages.CA.CA_CommercialAuto;
import pw.pages.CA.CA_ExperienceRating;
import pw.pages.CA.CA_ScheduleRating;
import pw.pages.CA.CA_SecuraManusript;
import pw.pages.CA.CA_StateCoverageLimits;
import pw.pages.CA.CA_Symbols;
import pw.pages.CA.CA_Vehicles;
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
import pw.pages.CP.CP_CommercialPackage;
import pw.pages.CP.CP_MNFireSafetySurcharge;
import pw.pages.CS.CyberSecurity_Main;
import pw.pages.CU.CU_AutoDealersPolicyInfo;
import pw.pages.CU.CU_GLPolicyInfo;
import pw.pages.CU.CU_Main;
import pw.pages.CU.CU_Reinsurance;
import pw.pages.CU.CU_SECURAManuscript;
import pw.pages.CU.CU_UmbrellaOptions;
import pw.pages.GL.GL_AdditionalInterest;
import pw.pages.GL.GL_Classifications;
import pw.pages.GL.GL_ExperienceRating;
import pw.pages.GL.GL_LiquorLiability;
import pw.pages.GL.GL_LiquorLiability_Classifications;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_PremAndProd;
import pw.pages.GL.GL_SpecialityOption;
import pw.pages.GL.GeneralLiability;
import pw.pages.WC.WC_Classifications;
import pw.pages.WC.WC_Locations;
import pw.pages.WC.WC_NameLocationLinking;
import pw.pages.WC.WC_StateInformation;
import pw.pages.WC.WC_WorkersCompensation;

public class CU8_MN_CP_CA_CURegression extends BaseTest {
	ExtentReports extent;
	ExtentTest test;
	

	
	public static void MN_CURegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
 		PW_Login  LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		CAWC_ProductInfo CAWCProductInfo = TestPageFactory.initElements(se, CAWC_ProductInfo.class);
		
		CA_CommercialAuto CA_CommercialAutoPage = TestPageFactory.initElements(se, CA_CommercialAuto.class);
		PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
		PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
		CAWC_PW_Producers CAWCProducerPage = TestPageFactory.initElements(se, CAWC_PW_Producers.class);
		CP_CommercialPackage CommercialPackage =  TestPageFactory.initElements(se, CP_CommercialPackage.class);
		
		GeneralLiability GeneralLiabilityPage = TestPageFactory.initElements(se, GeneralLiability.class);
		GL_Location GLLocationPage = TestPageFactory.initElements(se, GL_Location.class);
		GL_PremAndProd GLPremAndProdPage = TestPageFactory.initElements(se, GL_PremAndProd.class);
		GL_Classifications GLClassificationsPage = TestPageFactory.initElements(se, GL_Classifications.class);
		GL_ExperienceRating GLExperienceRating = TestPageFactory.initElements(se, GL_ExperienceRating.class);
		GL_AdditionalInterest GLAdditionalInterestPage=TestPageFactory.initElements(se, GL_AdditionalInterest.class);
		GL_LiquorLiability_Classifications GLLiquorLiabilityClassificationsPage=TestPageFactory.initElements(se, GL_LiquorLiability_Classifications.class);
		GL_LiquorLiability GLLiquorLiabilityPage=TestPageFactory.initElements(se, GL_LiquorLiability.class);
		GL_SpecialityOption GLSpecialityOptionPage=TestPageFactory.initElements(se, GL_SpecialityOption.class);
		
		
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		CA_StateCoverageLimits StateCoverageLimits = TestPageFactory.initElements(se, CA_StateCoverageLimits.class);
		CA_Symbols Symbols = TestPageFactory.initElements(se, CA_Symbols.class);
		CA_Vehicles Vehicles = TestPageFactory.initElements(se, CA_Vehicles.class);
		CA_AdditionalCoverages AdditionalCoverages = TestPageFactory.initElements(se, CA_AdditionalCoverages.class);
		CA_SecuraManusript CA_SecuraManusriptpage = TestPageFactory.initElements(se, CA_SecuraManusript.class);
		CA_ScheduleRating CA_ScheduleRatingpage = TestPageFactory.initElements(se, CA_ScheduleRating.class);
		CA_ExperienceRating ExperienceRating = TestPageFactory.initElements(se, CA_ExperienceRating.class);
		
		WC_Locations WC_LocationsPage = TestPageFactory.initElements(se, WC_Locations.class);
		WC_WorkersCompensation WC_WorkersCompensationPage = TestPageFactory.initElements(se, WC_WorkersCompensation.class);
		WC_NameLocationLinking WC_NameLocationLinkingPage = TestPageFactory.initElements(se, WC_NameLocationLinking.class);
		WC_StateInformation WC_StateInformationPage = TestPageFactory.initElements(se, WC_StateInformation.class);
		WC_Classifications WC_ClassificationsPage = TestPageFactory.initElements(se, WC_Classifications.class);
		
		CU_Main CUMainPage =  TestPageFactory.initElements(se, CU_Main.class);
		CU_GLPolicyInfo CUGLPolicyInfoPage = TestPageFactory.initElements(se, CU_GLPolicyInfo.class);
		CU_AutoDealersPolicyInfo CUAutoDealersPolicyInfoPage = TestPageFactory.initElements(se, CU_AutoDealersPolicyInfo.class);
		CU_UmbrellaOptions  CUUmbrellaOptionsPage = TestPageFactory.initElements(se, CU_UmbrellaOptions.class);
		CU_SECURAManuscript CUSecuraManuscript = TestPageFactory.initElements(se, CU_SECURAManuscript.class);
		CU_Reinsurance CU_Reinsurancepage = TestPageFactory.initElements(se, CU_Reinsurance.class);
		CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
		CP_MNFireSafetySurcharge CPMNFireSafetySurcharge = TestPageFactory.initElements(se, CP_MNFireSafetySurcharge.class);
		PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);

		try {
			List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
		
			CommonFunPage.PWAppStartUp(test);
			

			if (transactionsList.contains("CPNewQuote")) {
				String transaction = "CPNewQuote";
				LoginPage.PWAppLogin(strRegressionID, transaction, test);
				WelcomePage.homePage(strRegressionID, transaction, test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				ProducerPage.AddProducers(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Package",test);
				String cyberChkY = CommercialPackage.CommercialPackage(strRegressionID, transaction, test);
				GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID, transaction, test);
				GLLocationPage.GL_Location_Details(strRegressionID, transaction, test);
				GLPremAndProdPage.GL_PremAndProdPage(strRegressionID, transaction, test);
				GLClassificationsPage.GL_ClassificationsPage(strRegressionID, transaction, test);
				GLLiquorLiabilityPage.GL_LiquorLiability_Details(strRegressionID, transaction, test);
				GLLiquorLiabilityClassificationsPage.GL_LiquorLiability_ClassificationsPage(strRegressionID, transaction, test);
				GLSpecialityOptionPage.GL_SpecialityOption_Details(strRegressionID, transaction, test);
				GLAdditionalInterestPage.GL_AdditionalInterest_Details(strRegressionID, transaction, test);
				CommonMethods.CollapseAllAndNavigateTo("Commercial Package","20-CP",test);
				CommonMethods.NavigateTo("General Liability",test);
				CommonMethods.NavigateTo("Experience Rating", test);
				GLExperienceRating.GLExperienceRatingPage(strRegressionID, transaction, test);
				CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				BillingTab.getUpdateBillingTab(strRegressionID, transaction, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
				}
		
			
			if (transactionsList.contains("CANewQuote")) {
				String transaction = "CANewQuote";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				WelcomePage.homePage(strRegressionID,transaction, test);
				CAWCProductInfo.quote_ProdInfo(strRegressionID,transaction,test);
				CAWCProducerPage.AddProducers(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Auto",test);
				CA_CommercialAutoPage.CommercialAuto(strRegressionID, transaction, suspendSheet, test);
				StateCoverageLimits.StateCoverageLimits(strRegressionID, transaction, suspendSheet, test);
				Symbols.Symbols(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Vehicles",test);
				Vehicles.CA_VehiclesPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Additional Coverages",test);
				AdditionalCoverages.AdditionalCoverages(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateToNextScreen(test);
				CA_SecuraManusriptpage.SecuraManusript(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateToNextScreen(test);
				ExperienceRating.ExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CA_ScheduleRatingpage.CA_ScheduleRatingPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}
			
			if(transactionsList.contains("WCNewQuote")){
				String transaction = "WCNewQuote";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				WelcomePage.homePage(strRegressionID,transaction, test);
				CAWCProductInfo.quote_ProdInfo(strRegressionID,transaction,test);
				CAWCProducerPage.AddProducers(strRegressionID,transaction,test);
				CommonMethods.NavigateToNextScreen(test);
				WC_LocationsPage.Locations(strRegressionID,transaction,suspendSheet,test);
				WC_WorkersCompensationPage.WorkersCompensation(strRegressionID,transaction,suspendSheet,test);
				WC_NameLocationLinkingPage.NameLocationLinking(strRegressionID,transaction,suspendSheet,test);
				WC_StateInformationPage.StateInformation(strRegressionID,transaction,suspendSheet,test);
				WC_ClassificationsPage.Classifications(strRegressionID,transaction,suspendSheet,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
									
			}
			
			
			if (transactionsList.contains("CUNewQuote")) {
				String transaction = "CUNewQuote";
				
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				WelcomePage.homePage(strRegressionID,transaction, test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				ProducerPage.AddProducers(strRegressionID, transaction, test);
				CommonMethods.NavigateToNextScreen(test);
				CUMainPage.CU_MainPage(strRegressionID, transaction,suspendSheet, test);
				CUGLPolicyInfoPage.generalLiabPolicyInfo_Main(strRegressionID, transaction,suspendSheet, test);
				CUGLPolicyInfoPage.generalLiabPolicyInfo_Main(strRegressionID, "CUNewQuote1",suspendSheet, test);
				CUAutoDealersPolicyInfoPage.AutoDealerPolicyInfo_Main(strRegressionID, transaction,suspendSheet, test);
				CommonMethods.NavigateTo("Umbrella Options", test);
				CUUmbrellaOptionsPage.UmbrellaOptions_Main(strRegressionID, transaction,suspendSheet, test);
				CommonMethods.NavigateToNextScreen(test);
				CUSecuraManuscript.SECURAManuscript_Main(strRegressionID, transaction,suspendSheet, test);									
				CU_Reinsurancepage.Reinsurance_Main(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
				CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
				
			}
			
			if (transactionsList.contains("CPConvertToPolicy")) {
				String transaction = "CPConvertToPolicy";
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CPNewQuote", test);
				
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
				}
			
				if (transactionsList.contains("CAConvertToPolicy")) {
				String transaction = "CAConvertToPolicy";
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CANewQuote", test);
				
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
				}
				
				if (transactionsList.contains("WCConvertToPolicy")) {
					String transaction = "WCConvertToPolicy";
					
					WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
					CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
					CommonMethods.getDashboardActions(strRegressionID, "WCNewQuote", test);
					
					CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
					PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
					CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
					}
				
				if (transactionsList.contains("CUConvertToPolicy")) {
				String transaction = "CUConvertToPolicy";
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CANewQuote", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
				}
				
				if (transactionsList.contains("CUProRataEndorsement1")) {
				String transaction = "CUProRataEndorsement1";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Umbrella",test);
				CUMainPage.CU_MainPage(strRegressionID, transaction,suspendSheet, test);
				CommonMethods.NavigateTo("Umbrella Options", test);
				CUUmbrellaOptionsPage.UmbrellaOptions_Main(strRegressionID, transaction,suspendSheet, test);
				CommonMethods.NavigateTo("Reinsurance",test);
				CU_Reinsurancepage.Reinsurance_Main(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
				}

			if (transactionsList.contains("CPQuoteForRenewal")) {
				String transaction = "CPQuoteForRenewal";
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CPConvertToPolicy1", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.CollapseAllAndNavigateTo("Commercial Package","20-CP",test);
				CommonMethods.NavigateTo("General Liability",test);
				GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Liquor Liability",test);
				CommonMethods.NavigateToNextScreen(test);
				GLLiquorLiabilityPage.GL_LiquorLiability_Details(strRegressionID, transaction, test);
				GLLiquorLiabilityClassificationsPage.GL_LiquorLiability_ClassificationsPage(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}
			
			if (transactionsList.contains("CAQuoteForRenewal")) {
				String transaction = "CAQuoteForRenewal";
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CAConvertToPolicy1", test);
				CAWCProductInfo.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
				}
			
			if (transactionsList.contains("WCQuoteForRenewal")) {
				String transaction = "WCQuoteForRenewal";
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "WCConvertToPolicy", test);
				CAWCProductInfo.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
				}
			
			if (transactionsList.contains("CUQuoteForRenewal")) {
				String transaction = "CUQuoteForRenewal";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CUProRataEndorsement1", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Umbrella",test);
				CommonMethods.NavigateTo("Umbrella Options", test);
				CUUmbrellaOptionsPage.UmbrellaOptions_Main(strRegressionID, transaction,suspendSheet, test);
			
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
				}
			

			if (transactionsList.contains("CPConvertQFRToPolicy")) {
				String transaction = "CPConvertQFRToPolicy";
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CPQuoteForRenewal", test);
				
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}
			
			if (transactionsList.contains("CAConvertQFRToPolicy")) {
				String transaction = "CAConvertQFRToPolicy";
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CAQuoteForRenewal", test);
				
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}
			
			if (transactionsList.contains("WCConvertQFRToPolicy")) {
				String transaction = "WCConvertQFRToPolicy";
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "WCQuoteForRenewal", test);
				
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}
			
			if (transactionsList.contains("CUConvertQFRToPolicy")) {
				String transaction = "CUConvertQFRToPolicy";
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CUQuoteForRenewal", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}
			
				} 
				catch (Exception e) {
					e.printStackTrace();
					se.verify().verifyEquals("MN_CURegression test  failed", true, false);
					testTearDown(se);
				}
				
			
			}
}


