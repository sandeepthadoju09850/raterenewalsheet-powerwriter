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
import Libraries.automation.common.framework.Browser.Browsers;
import pw.Constants.constants;
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
import pw.pages.CU.CU_ManualFactors;
import pw.pages.CU.CU_SECURAManuscript;
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
import pw.pages.GL.GL_ProfessionalLiabilityOccurance;
import pw.pages.GL.GL_SpecialityOption;
import pw.pages.GL.GeneralLiability;
import pw.pages.PLCM.CP_ProfessionalLiabilityClaims;

public class CU11_IL_CP_HumSvc_CURegression extends BaseTest {
	ExtentReports extent;
	ExtentTest test;
	
	public static void CU11_IL_CP_HumSvc_CURegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
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
		GL_AbuseAndMolestation GL_AbuseAndMolestationPage = TestPageFactory.initElements(se,
				GL_AbuseAndMolestation.class);
		GL_AbuseAndMolestationClassification GL_AbuseAndMolestationClassificationPage = TestPageFactory.initElements(se,
				GL_AbuseAndMolestationClassification.class);
		GL_ProfessionalLiabilityOccurance GLProfessionalLiabilityOccurance=TestPageFactory.initElements(se, GL_ProfessionalLiabilityOccurance.class);
		GL_ExperienceRating GLExperienceRating = TestPageFactory.initElements(se, GL_ExperienceRating.class);
		GL_OptionalProvisions GLOptionalProvisionsPage = TestPageFactory.initElements(se, GL_OptionalProvisions.class);
		CP_ProfessionalLiabilityClaims CP_ProfessionalLiabilityClaimsPage = TestPageFactory.initElements(se, CP_ProfessionalLiabilityClaims.class);
		PW_ScheduleRatingIRPM PWScheduleRatingIRPMPage = TestPageFactory.initElements(se, PW_ScheduleRatingIRPM.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		
		CU_Main CU_MainPage = TestPageFactory.initElements(se, CU_Main.class);
		CU_GLPolicyInfo CUGLPolicyInfoPage = TestPageFactory.initElements(se, CU_GLPolicyInfo.class);
		CU_ManualFactors CUManualFactorsPage = TestPageFactory.initElements(se, CU_ManualFactors.class);
		CU_SECURAManuscript CUSecuraManuscriptPage = TestPageFactory.initElements(se, CU_SECURAManuscript.class);
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
				CommonMethods.NavigateToNextScreen(test);
				GLSpecialityOptionPage.GL_SpecialityOption_Details(strRegressionID,transaction,test);
				//Added below steps on Abuse Cov as part of 05/01/2023 rate changes
				GL_AbuseAndMolestationPage.GL_AbuseAndMolestationMethod(strRegressionID, transaction, test);
				GL_AbuseAndMolestationClassificationPage.GL_AbuseAndMolestationClassificationMethod(strRegressionID,
						transaction, test);
				GLProfessionalLiabilityOccurance.GL_ProfessionalLiabilityOccurance_Details(strRegressionID,transaction,test);
				CommonMethods.NavigateToNextScreen(test);
				GLOptionalProvisionsPage.CP_GLOptionalProvisions(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Experience Rating",test);
				GLExperienceRating.GLExperienceRatingPage(strRegressionID, transaction, test);
				//CP_ProfessionalLiabilityClaimsPage.CP_ProfessionalLiabilityClaimsPage(strRegressionID,transaction,test);
				//CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				CommonMethods.getCompleteTransaction(strRegressionID,transaction,test);
				BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
				CommonMethods.getDashboardForms(strRegressionID,transaction,test);
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
				//CommonMethods.getSaveAndResumeLater(strRegressionID,transaction,test);
				CUGLPolicyInfoPage.generalLiabPolicyInfo_Main(strRegressionID, transaction,suspendSheet, test);
				CommonMethods.NavigateTo("Umbrella Options",test);
				CUUmbrellaOptionsPage.UmbrellaOptions_Main(strRegressionID, transaction,suspendSheet, test);
				CUManualFactorsPage.ManualFactors_Main(strRegressionID, transaction,suspendSheet, test);									
				//commented lines 161 & 162 as these steps were taken out with 10/22 Cntrl Date changes and now moved to NQ with 5/1/23 rate change
				//CommonMethods.NavigateTo("SECURA Manuscript",test);
				//CUSecuraManuscriptPage.SECURAManuscript_Main(strRegressionID, transaction,suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);	
	 			PremiumSummary.CU_GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
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
	 			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
	 			CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
	 			
			}
			

			
			if(transactionsList.contains("CUConvertToPolicy")){
				String transaction = "CUConvertToPolicy";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CUNewQuote", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
				
			}
			
			
			
			if(transactionsList.contains("CPQuoteForRenewal")){
				String transaction = "CPQuoteForRenewal";
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CPConvertToPolicy", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Package",test);
				CommonMethods.NavigateTo("General Liability", test);
				CommonMethods.NavigateToPage(constants.PageNm_SpecialtyOption,test);
				GLSpecialityOptionPage.GL_SpecialityOption_Details(strRegressionID, transaction, test);
				//commented line 210 and 211 and moved these steps to NQ as part of 05/01/23 rate changes
				/*GL_AbuseAndMolestationPage.GL_AbuseAndMolestationMethod(strRegressionID, transaction, test);
				GL_AbuseAndMolestationClassificationPage.GL_AbuseAndMolestationClassificationMethod(strRegressionID,
						transaction, test);*/
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
	 			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
	 			CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
	 							
			}
			
			
			
			if(transactionsList.contains("CUQuoteForRenewal")){
				String transaction = "CUQuoteForRenewal";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CUConvertToPolicy", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Umbrella", test);
				CU_MainPage.CU_MainPage(strRegressionID,transaction,suspendSheet,test);
				CommonMethods.NavigateTo("Umbrella Options", test);
				//commented line 233 and moved these steps to NQ as part of 05/01/23 rate changes
				//CUUmbrellaOptionsPage.UmbrellaOptions_Main(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardForms(strRegressionID, transaction, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
				
			}
			
			
			if(transactionsList.contains("CPConvertQFRToPolicy")){
				String transaction = "CPConvertQFRToPolicy";
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CPQuoteForRenewal", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
	 			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				
			}
			
			
			
			if(transactionsList.contains("CUConvertQFRToPolicy")){
				String transaction = "CUConvertQFRToPolicy";
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CUQuoteForRenewal", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				
			}
			
			
		} 
		catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("IL_HHC_CURegression test failed", true, false);
			testTearDown(se);
		}
		
	
	}
}
