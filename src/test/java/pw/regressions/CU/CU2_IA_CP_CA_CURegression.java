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
import pw.pages.CA.CA_Drivers;
import pw.pages.CA.CA_ExperienceRating;
import pw.pages.CA.CA_Locations;
import pw.pages.CA.CA_RegistrationPlates;
import pw.pages.CA.CA_RepossessedAutoNone;
import pw.pages.CA.CA_ScheduleRating;
import pw.pages.CA.CA_StateCoverageLimits;
import pw.pages.CA.CA_Symbols;
import pw.pages.CA.CA_Vehicles;
import pw.pages.COMMON.CAWC_AdditionalNamedInsured;
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
import pw.pages.COMMON.PW_ScheduleRatingIRPM;
import pw.pages.CP.CP_CommercialPackage;
import pw.pages.CS.CyberSecurity_Main;
import pw.pages.CU.CU_AutoDealersPolicyInfo;
import pw.pages.CU.CU_GLPolicyInfo;
import pw.pages.CU.CU_Main;
import pw.pages.CU.CU_UmbrellaOptions;
import pw.pages.GL.GL_AbuseAndMolestation;
import pw.pages.GL.GL_AbuseAndMolestationClassification;
import pw.pages.GL.GL_Classifications;
import pw.pages.GL.GL_EmployeeBenefitsLiability;
import pw.pages.GL.GL_ExperienceRating;
import pw.pages.GL.GL_LiquorLiability;
import pw.pages.GL.GL_LiquorLiability_Classifications;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_OptionalProvisions;
import pw.pages.GL.GL_PremAndProd;
import pw.pages.GL.GL_SpecialityOption;
import pw.pages.GL.GeneralLiability;
import pw.pages.PLCM.CP_ProfessionalLiabilityClaims;
import pw.pages.WC.WC_Classifications;
import pw.pages.WC.WC_Locations;
import pw.pages.WC.WC_NameLocationLinking;
import pw.pages.WC.WC_StateInformation;
import pw.pages.WC.WC_WorkersCompensation;

public class CU2_IA_CP_CA_CURegression extends BaseTest {
	ExtentReports extent;
	ExtentTest test;
	
	public static void CU2_IA_CP_CA_CURegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login  LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		CAWC_ProductInfo ProductInfo = TestPageFactory.initElements(se, CAWC_ProductInfo.class);
		CAWC_PW_Producers CAWC_PW_ProducersPage = TestPageFactory.initElements(se, CAWC_PW_Producers.class);
		PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
		PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
		CP_CommercialPackage CommercialPackage =  TestPageFactory.initElements(se, CP_CommercialPackage.class);
		GeneralLiability GeneralLiabilityPage = TestPageFactory.initElements(se, GeneralLiability.class);
		GL_Location GLLocations = TestPageFactory.initElements(se, GL_Location.class);
		GL_PremAndProd GLPremAndProd = TestPageFactory.initElements(se, GL_PremAndProd.class);
		GL_Classifications GLClassifications = TestPageFactory.initElements(se, GL_Classifications.class);
		GL_EmployeeBenefitsLiability GLEmployeeBenefitsLiabilityPage = TestPageFactory.initElements(se, GL_EmployeeBenefitsLiability.class);
		GL_LiquorLiability_Classifications GLLiquorLiabilityClassificationsPage=TestPageFactory.initElements(se, GL_LiquorLiability_Classifications.class);
		GL_LiquorLiability GLLiquorLiabilityPage=TestPageFactory.initElements(se, GL_LiquorLiability.class);
		GL_SpecialityOption GLSpecialityOptionPage=TestPageFactory.initElements(se, GL_SpecialityOption.class);
		GL_AbuseAndMolestation GL_AbuseAndMolestationPage=TestPageFactory.initElements(se, GL_AbuseAndMolestation.class);
		GL_AbuseAndMolestationClassification GL_AbuseAndMolestationClassificationPage=TestPageFactory.initElements(se, GL_AbuseAndMolestationClassification.class);
		GL_ExperienceRating GLExperienceRating = TestPageFactory.initElements(se, GL_ExperienceRating.class);
		GL_OptionalProvisions GLOptionalProvisionsPage = TestPageFactory.initElements(se, GL_OptionalProvisions.class);
		CP_ProfessionalLiabilityClaims CP_ProfessionalLiabilityClaimsPage = TestPageFactory.initElements(se, CP_ProfessionalLiabilityClaims.class);
		PW_ScheduleRatingIRPM PWScheduleRatingIRPMPage = TestPageFactory.initElements(se, PW_ScheduleRatingIRPM.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		CAWC_AdditionalNamedInsured AdditionalNamedInsured =TestPageFactory.initElements(se, CAWC_AdditionalNamedInsured.class);
		CA_CommercialAuto CommercialAuto = TestPageFactory.initElements(se, CA_CommercialAuto.class);
		CA_StateCoverageLimits StateCoverageLimits = TestPageFactory.initElements(se, CA_StateCoverageLimits.class);
		CA_Symbols Symbols = TestPageFactory.initElements(se, CA_Symbols.class);
		CA_Locations Locations = TestPageFactory.initElements(se, CA_Locations.class);
		CA_Drivers Drivers = TestPageFactory.initElements(se, CA_Drivers.class);
		CA_Vehicles Vehicles = TestPageFactory.initElements(se, CA_Vehicles.class);
		CA_AdditionalCoverages AdditionalCoverages = TestPageFactory.initElements(se, CA_AdditionalCoverages.class);
		CA_RepossessedAutoNone CA_RepossessedAutoNonePage = TestPageFactory.initElements(se, CA_RepossessedAutoNone.class);
		CA_ExperienceRating ExperienceRating = TestPageFactory.initElements(se, CA_ExperienceRating.class);
		CA_ScheduleRating ScheduleRating = TestPageFactory.initElements(se, CA_ScheduleRating.class);
		WC_Locations WC_LocationsPage = TestPageFactory.initElements(se, WC_Locations.class);
		WC_WorkersCompensation WC_WorkersCompensationPage = TestPageFactory.initElements(se, WC_WorkersCompensation.class);
		WC_NameLocationLinking WC_NameLocationLinkingPage = TestPageFactory.initElements(se, WC_NameLocationLinking.class);
		WC_StateInformation WC_StateInformationPage = TestPageFactory.initElements(se, WC_StateInformation.class);
		WC_Classifications WC_ClassificationsPage = TestPageFactory.initElements(se, WC_Classifications.class);
		CU_Main CU_MainPage = TestPageFactory.initElements(se, CU_Main.class);
		CU_GLPolicyInfo CUGLPolicyInfoPage = TestPageFactory.initElements(se, CU_GLPolicyInfo.class);
		CU_AutoDealersPolicyInfo CUAutoDealersPolicyInfoPage = TestPageFactory.initElements(se, CU_AutoDealersPolicyInfo.class);
		CU_UmbrellaOptions  CUUmbrellaOptionsPage = TestPageFactory.initElements(se, CU_UmbrellaOptions.class);
		CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
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
				GLEmployeeBenefitsLiabilityPage.GL_EmployeeBenefitsLiability_Details(strRegressionID,transaction,test);
				GLLiquorLiabilityPage.GL_LiquorLiability_Details(strRegressionID, transaction, test);
				GLLiquorLiabilityClassificationsPage.GL_LiquorLiability_ClassificationsPage(strRegressionID, transaction, test);
				GLSpecialityOptionPage.GL_SpecialityOption_Details(strRegressionID,transaction,test);
				GL_AbuseAndMolestationPage.GL_AbuseAndMolestationMethod(strRegressionID,transaction,test);
				GL_AbuseAndMolestationClassificationPage.GL_AbuseAndMolestationClassificationMethod(strRegressionID,transaction,test);
				CommonMethods.NavigateToNextScreen(test);
				GLOptionalProvisionsPage.CP_GLOptionalProvisions(strRegressionID,transaction,test);
				CommonMethods.NavigateToNextScreen(test);
				CommonMethods.CollapseAllAndNavigateTo("Commercial Package","20-CP",test);
				CommonMethods.NavigateTo("General Liability",test);
				CommonMethods.NavigateTo("Experience Rating",test);
				GLExperienceRating.GLExperienceRatingPage(strRegressionID, transaction, test);
				CP_ProfessionalLiabilityClaimsPage.CP_ProfessionalLiabilityClaimsPage(strRegressionID,transaction,test);
				CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				CommonMethods.getCompleteTransaction(strRegressionID,transaction,test);
				BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
				
			}
			
				if(transactionsList.contains("CANewQuote")){
				String transaction = "CANewQuote";
				
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				WelcomePage.homePage(strRegressionID,transaction, test);
				ProductInfo.quote_ProdInfo(strRegressionID,transaction,test);
				ProducerPage.AddProducers(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Auto",test);
				CommercialAuto.CommercialAuto(strRegressionID, transaction, suspendSheet, test);
				StateCoverageLimits.StateCoverageLimits(strRegressionID, transaction, suspendSheet, test);
				Symbols.Symbols(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Vehicles",test);
				Vehicles.CA_VehiclesPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Additional Coverages",test);
				AdditionalCoverages.AdditionalCoverages(strRegressionID, transaction, suspendSheet, test);
				CA_RepossessedAutoNonePage.RepossessedAutoNone(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateToNextScreen(test);
				ExperienceRating.ExperienceRating(strRegressionID, transaction, suspendSheet, test);
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
					ProductInfo.quote_ProdInfo(strRegressionID,transaction,test);
					CAWC_PW_ProducersPage.AddProducers(strRegressionID,transaction,test);
					CommonMethods.NavigateToNextScreen(test);
					WC_LocationsPage.Locations(strRegressionID,transaction,suspendSheet,test);
					WC_WorkersCompensationPage.WorkersCompensation(strRegressionID,transaction,suspendSheet,test);
					WC_NameLocationLinkingPage.NameLocationLinking(strRegressionID,transaction,suspendSheet,test);
					WC_StateInformationPage.StateInformation(strRegressionID,transaction,suspendSheet,test);
					WC_ClassificationsPage.Classifications(strRegressionID,transaction,suspendSheet,test);
					CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
					String quoteNumber = Util.getQuoteNumber(strRegressionID,transaction);
					CommonMethods.CollapseAll(quoteNumber,test);
					ProductInfo.quote_ProdInfo(strRegressionID, "NewQuote1", test);
					CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
					PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
					BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
					CommonMethods.getDashboardActions(strRegressionID, transaction, test);
										
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
				CommonMethods.getSaveAndResumeLater(strRegressionID,transaction,test);
			}
			
			if(transactionsList.contains("CPRedoNewQuote")){
				String transaction = "CPRedoNewQuote";
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CPNewQuote", test);
				CommonMethods.NavigateTo("Commercial Package",test);
				CommonMethods.NavigateTo("General Liability",test);
				CommonMethods.NavigateTo("Prem & Prod",test);
				GLPremAndProd.GL_PremAndProdPage(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Emp Benefits Liab",test);
				GLEmployeeBenefitsLiabilityPage.GL_EmployeeBenefitsLiability_Details(strRegressionID,transaction,test);
				GLLiquorLiabilityPage.GL_LiquorLiability_Details(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Professional Liability Claims-Made",test);
				CP_ProfessionalLiabilityClaimsPage.CP_ProfessionalLiabilityClaimsPage(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
	 			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
	 			CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
	 			
			}
			
			if(transactionsList.contains("CURedoNewQuote")){
				String transaction = "CURedoNewQuote";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CUNewQuote", test);
				CommonMethods.NavigateTo("Commercial Umbrella",test);
				CommonMethods.NavigateTo("General Liability Policy Information (1)",test);
				CUGLPolicyInfoPage.generalLiabPolicyInfo_Main(strRegressionID,transaction, suspendSheet, test);
				CUAutoDealersPolicyInfoPage.AutoDealerPolicyInfo_Main(strRegressionID,transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Umbrella Options", test);
				CUUmbrellaOptionsPage.UmbrellaOptions_Main(strRegressionID,transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}
			
			if(transactionsList.contains("CPConvertToPolicy")){
				String transaction = "CPConvertToPolicy";
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CPRedoNewQuote", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
	 			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
	 			CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
	 			
			}
			
			if(transactionsList.contains("CAConvertToPolicy")){
				String transaction = "CAConvertToPolicy";
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CANewQuote", test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardStatus(strRegressionID, "CAConvertToPolicy", test);
				
			}
			
			if (transactionsList.contains("WCConvertToPolicy")) {
				String transaction = "WCConvertToPolicy";
				
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "WCNewQuote", test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
				
			}
			
			if(transactionsList.contains("CUConvertToPolicy")){
				String transaction = "CUConvertToPolicy";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CURedoNewQuote", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}
			
			if(transactionsList.contains("CPFlatEndorsement1")){
				String transaction = "CPFlatEndorsement1";
				
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CPConvertToPolicy", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Package",test);
				CommonMethods.NavigateTo("General Liability",test);
				CommonMethods.NavigateTo("Specialty Option",test);
				CommonMethods.NavigateTo("Abuse And Molestation",test);
				GL_AbuseAndMolestationPage.GL_AbuseAndMolestationMethod(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
	 			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
	 			CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}
			
			if(transactionsList.contains("CUFlatEndorsement1")){
				String transaction = "CUFlatEndorsement1";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CUConvertToPolicy", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Umbrella",test);
				CU_MainPage.CU_MainPage(strRegressionID,transaction,suspendSheet,test);
				CommonMethods.NavigateTo("Umbrella Options", test);
				CUUmbrellaOptionsPage.UmbrellaOptions_Main(strRegressionID,transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				
			}
			
			
			if(transactionsList.contains("CUChangeNameAndAddress")){
				String transaction = "CUChangeNameAndAddress";
				
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
				
			}
			
			if(transactionsList.contains("CPQuoteForRenewal")){
				String transaction = "CPQuoteForRenewal";
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CPFlatEndorsement1", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
	 			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
	 							
			}
			
			if(transactionsList.contains("CAQuoteForRenewal")){
				String transaction = "CAQuoteForRenewal";
				
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CAConvertToPolicy", test);
				ProductInfo.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
								
			}
			
			if(transactionsList.contains("WCQuoteForRenewal")){
				String transaction = "WCQuoteForRenewal";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "WCConvertToPolicy", test);
				ProductInfo.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
			}
			
			if(transactionsList.contains("CUQuoteForRenewal")){
				String transaction = "CUQuoteForRenewal";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CUChangeNameAndAddress", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				
			}
			
			if(transactionsList.contains("CPConvertQFRToPolicy")){
				String transaction = "CPConvertQFRToPolicy";
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CPQuoteForRenewal", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
	 			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
	 			//CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,"CPConvertQFRToPolicy",test);
				
			}
			
			if(transactionsList.contains("CAConvertQFRToPolicy")){
				String transaction = "CAConvertQFRToPolicy";
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CAQuoteForRenewal", test);
				ProductInfo.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,"CAConvertQFRToPolicy",test);
								
			}
			
			if(transactionsList.contains("WCConvertQFRToPolicy")){
				String transaction = "WCConvertQFRToPolicy";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "WCQuoteForRenewal", test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}
			
			if(transactionsList.contains("CUConvertQFRToPolicy")){
				String transaction = "CUConvertQFRToPolicy";
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CUQuoteForRenewal", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardActions(strRegressionID,"CUConvertQFRToPolicy",test);
				
			}
			
			
		} 
		catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("IA_CURegression test failed", true, false);
			testTearDown(se);
		}
		
	
	}
}
