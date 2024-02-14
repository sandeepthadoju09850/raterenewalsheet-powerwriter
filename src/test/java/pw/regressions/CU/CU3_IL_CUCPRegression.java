package pw.regressions.CU;
/**
 * @author ${ro09528}
 */
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
import pw.pages.CA.CA_AdditionalInterest;
import pw.pages.CA.CA_CommercialAuto;
import pw.pages.CA.CA_DriveAwayCollision;
import pw.pages.CA.CA_Drivers;
import pw.pages.CA.CA_ExperienceRating;
import pw.pages.CA.CA_FungiOrBacteriaLiability;
import pw.pages.CA.CA_GarageKeeperes;
import pw.pages.CA.CA_LiabilityExperienceRating;
import pw.pages.CA.CA_Locations;
import pw.pages.CA.CA_OptionalProvisions;
import pw.pages.CA.CA_PhysicalDamageExperienceRating;
import pw.pages.CA.CA_PickupOrDeliveryCoverage;
import pw.pages.CA.CA_ScheduleRating;
import pw.pages.CA.CA_StateCoverageLimits;
import pw.pages.CA.CA_Symbols;
import pw.pages.CA.CA_Vehicles;
import pw.pages.CA.CA_Year2000Endorsements;
import pw.pages.CIM.CIM_Terrorism;
import pw.pages.COMMON.CAWC_AdditionalNamedInsured;
import pw.pages.COMMON.CAWC_ProductInfo;
import pw.pages.COMMON.PW_AddNamedInsured;
import pw.pages.COMMON.PW_BillingTab;
import pw.pages.COMMON.PW_CommonFun;
import pw.pages.COMMON.PW_CommonMethods;
import pw.pages.COMMON.PW_GenInfo;
import pw.pages.COMMON.PW_Home;
import pw.pages.COMMON.PW_Login;
import pw.pages.COMMON.PW_PremiumSummary;
import pw.pages.COMMON.PW_Producers;
import pw.pages.COMMON.PW_ScheduleRatingIRPM;
import pw.pages.CP.CP_AdditionalInterest;
import pw.pages.CP.CP_Buildings;
import pw.pages.CP.CP_CommercialPackage;
import pw.pages.CP.CP_CommercialProperty;
import pw.pages.CP.CP_Coverages;
import pw.pages.CP.CP_Locations;
import pw.pages.CP.CP_Terrorism;
import pw.pages.CS.CyberSecurity_Main;
import pw.pages.CU.CU_AutoDealersPolicyInfo;
import pw.pages.CU.CU_EmpLiabPolicyInfo;
import pw.pages.CU.CU_GLCoverage;
import pw.pages.CU.CU_GLPolicyInfo;
import pw.pages.CU.CU_Main;
import pw.pages.CU.CU_ManualFactors;
import pw.pages.CU.CU_SECURAManuscript;
import pw.pages.CU.CU_UmbrellaOptions;
import pw.pages.DO.CP_DirectorsAndOfficers;
import pw.pages.GL.GL_AdditionalInterest;
import pw.pages.GL.GL_Classifications;
import pw.pages.GL.GL_EmployeeBenefitsLiability;
import pw.pages.GL.GL_ExperienceRating;
import pw.pages.GL.GL_LiquorLiability;
import pw.pages.GL.GL_LiquorLiability_Classifications;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_OptionalProvisions;
import pw.pages.GL.GL_PremAndProd;
import pw.pages.GL.GL_ProfessionalLiabilityOccurance;
import pw.pages.GL.GL_SecuraManuscript;
import pw.pages.GL.GL_SpecialityOption;
import pw.pages.GL.GeneralLiability;

public class CU3_IL_CUCPRegression extends BaseTest{
	ExtentReports extent;
	ExtentTest test;
		
	public static void CU3_IL_CUCPRegression(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login  LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
		PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);	
		PW_AddNamedInsured AddNamedInsuredPage = TestPageFactory.initElements(se, PW_AddNamedInsured.class);
		CAWC_AdditionalNamedInsured CAWCAdditionalNamedInsured = TestPageFactory.initElements(se, CAWC_AdditionalNamedInsured.class);
		CP_CommercialPackage CommercialPackage =  TestPageFactory.initElements(se, CP_CommercialPackage.class);
		CP_CommercialProperty CommercialPropertyPage = TestPageFactory.initElements(se, CP_CommercialProperty.class);
	
		CP_Locations CplocationsPage = TestPageFactory.initElements(se, CP_Locations.class);
		CP_Buildings BuildingsPage = TestPageFactory.initElements(se, CP_Buildings.class);
		CP_Coverages CPCoverages = TestPageFactory.initElements(se, CP_Coverages.class);
		CP_Terrorism CPTerrorism = TestPageFactory.initElements(se, CP_Terrorism.class);
		CP_DirectorsAndOfficers CPDirectorsAndOfficers = TestPageFactory.initElements(se, CP_DirectorsAndOfficers.class);		
		CA_OptionalProvisions CA_OptionalProvisionsPage = TestPageFactory.initElements(se, CA_OptionalProvisions.class);
		
		CAWC_AdditionalNamedInsured AdditionalNamedInsured =TestPageFactory.initElements(se, CAWC_AdditionalNamedInsured.class);
		
		GeneralLiability GeneralLiabilityPage = TestPageFactory.initElements(se, GeneralLiability.class);
		GL_Location GLLocationPage = TestPageFactory.initElements(se, GL_Location.class);
		GL_PremAndProd GLPremAndProdPage = TestPageFactory.initElements(se, GL_PremAndProd.class);
		GL_Classifications GLClassificationsPage = TestPageFactory.initElements(se, GL_Classifications.class);
		GL_AdditionalInterest GLAdditionalInterestPage=TestPageFactory.initElements(se, GL_AdditionalInterest.class);
		GL_ExperienceRating GLExperienceRating = TestPageFactory.initElements(se, GL_ExperienceRating.class);
		GL_OptionalProvisions GLOptionalProvisionsPage = TestPageFactory.initElements(se, GL_OptionalProvisions.class);
	
		GL_EmployeeBenefitsLiability GLEmployeeBenefitsLiability=TestPageFactory.initElements(se, GL_EmployeeBenefitsLiability.class);
		GL_SpecialityOption GLSpecialityOption=TestPageFactory.initElements(se, GL_SpecialityOption.class);
		GL_ProfessionalLiabilityOccurance GLProfessionalLiabilityOccurance=TestPageFactory.initElements(se, GL_ProfessionalLiabilityOccurance.class);
		
		CA_ExperienceRating CA_ExperienceRatingPage = TestPageFactory.initElements(se, CA_ExperienceRating.class);
		CA_LiabilityExperienceRating CA_LiabilityExperienceRatingPage = TestPageFactory.initElements(se, CA_LiabilityExperienceRating.class);
		CA_PhysicalDamageExperienceRating CA_PhysicalDamageExperienceRatingPage = TestPageFactory.initElements(se, CA_PhysicalDamageExperienceRating.class);
		CU_Main CU_MainPage = TestPageFactory.initElements(se, CU_Main.class);
		CU_GLPolicyInfo CUGLPolicyInfoPage = TestPageFactory.initElements(se, CU_GLPolicyInfo.class);
		CU_GLCoverage CUGLCoverage = TestPageFactory.initElements(se, CU_GLCoverage.class);
		CU_EmpLiabPolicyInfo CUEmpLiabPolicyInfo=TestPageFactory.initElements(se, CU_EmpLiabPolicyInfo.class);
		CU_AutoDealersPolicyInfo CUAutoDealersPolicyInfoPage = TestPageFactory.initElements(se, CU_AutoDealersPolicyInfo.class);
		CU_UmbrellaOptions  CUUmbrellaOptionsPage = TestPageFactory.initElements(se, CU_UmbrellaOptions.class);
		CU_ManualFactors CUManualFactorsPage = TestPageFactory.initElements(se, CU_ManualFactors.class);
		CU_SECURAManuscript CUSecuraManuscriptPage = TestPageFactory.initElements(se, CU_SECURAManuscript.class);
		
		PW_ScheduleRatingIRPM ScheduleRatingIRPM = TestPageFactory.initElements(se, PW_ScheduleRatingIRPM.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
		PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);
		try {
			List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
			//int iteration = 0;
			CommonFunPage.PWAppStartUp(test);
			//New Transaction Actions
			if (transactionsList.contains("CPNewQuote")) {
				String transaction = "CPNewQuote";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				LoginPage.PWAppLogin(strRegressionID, transaction, test);
				WelcomePage.homePage(strRegressionID, transaction, test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				ProducerPage.AddProducers(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Package",test);
				String cyberChkY = CommercialPackage.CommercialPackage(strRegressionID,transaction,test);
				CommercialPropertyPage.CommercialPropertyMethod(strRegressionID,transaction,test);
				CplocationsPage.Locations(strRegressionID, transaction, test);
				BuildingsPage.BuildingDetails(strRegressionID, transaction,test);
				CommonMethods.NavigateToNextScreen(test);
				CommonMethods.NavigateToNextScreen(test);
				//CommonMethods.CollapseAllAndNavigateTo("Commercial Package","20-CP",test);
				//CommonMethods.NavigateTo("General Liability",test);
				GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID,transaction,test);
				GLLocationPage.GL_Location_Details(strRegressionID,transaction,test);
				CommonMethods.NavigateToNextScreen(test);
				GLPremAndProdPage.GL_PremAndProdPage(strRegressionID,transaction,test);
				GLClassificationsPage.GL_ClassificationsPage(strRegressionID,transaction,test);
				GLEmployeeBenefitsLiability.GL_EmployeeBenefitsLiability_Details(strRegressionID, transaction, test);
				GLSpecialityOption.GL_SpecialityOption_Details(strRegressionID,transaction,test);
				GLProfessionalLiabilityOccurance.GL_ProfessionalLiabilityOccurance_Details(strRegressionID,transaction,test);
				GLAdditionalInterestPage.GL_AdditionalInterest_Details(strRegressionID, transaction, test);
				GLAdditionalInterestPage.clickDone();
				GLExperienceRating.GLExperienceRatingPage(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Directors and Officers",test);
				CPDirectorsAndOfficers.CP_DOMainPage(strRegressionID, transaction, test);
				CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				CommonMethods.CollapseAllAndNavigateTo("Schedule Rating/IRPM","20-CP",test);
				ScheduleRatingIRPM.ScheduleRatingIRPM(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
	 			CommonMethods.getDashboardForms(strRegressionID,transaction,test);
	 			CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			
			}
			if (transactionsList.contains("CUNewQuote")) {
				String transaction = "CUNewQuote";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				WelcomePage.homePage(strRegressionID,transaction, test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
		     	ProducerPage.AddProducers(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Additional Named Insured",test);
							
				AddNamedInsuredPage.AddAdditionalNamedInsuredMethod(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Umbrella",test);
			    CU_MainPage.CU_MainPage(strRegressionID, transaction,suspendSheet, test);
				CUGLPolicyInfoPage.generalLiabPolicyInfo_Main(strRegressionID, transaction,suspendSheet, test);

				CUAutoDealersPolicyInfoPage.AutoDealerPolicyInfo_Main(strRegressionID, transaction,suspendSheet, test);
				CommonMethods.NavigateTo("Employers Liability Policy Information",test);
				CUEmpLiabPolicyInfo.EmpLiabPolicyInfo_Main(strRegressionID, transaction,suspendSheet, test);
				CUUmbrellaOptionsPage.UmbrellaOptions_Main(strRegressionID, transaction,suspendSheet, test);
				CUManualFactorsPage.ManualFactors_Main(strRegressionID, transaction,suspendSheet, test);									
				CommonMethods.NavigateTo("SECURA Manuscript",test);
				CUSecuraManuscriptPage.SECURAManuscript_Main(strRegressionID, transaction,suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
							
	 			PremiumSummary.CU_GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
	 			BillingTab.getUpdateBillingTab(strRegressionID, transaction, test);
				CommonMethods.getDashboardForms(strRegressionID, transaction, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			
			}
			
			
			//Convert To Policy
			if(transactionsList.contains("CPConvertToPolicy")){
				String transaction = "CPConvertToPolicy";
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CPNewQuote", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
				}
			
			if (transactionsList.contains("CUConvertToPolicy")) {
				String transaction = "CUConvertToPolicy";
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CUNewQuote", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				//CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
				
			}
			
			if (transactionsList.contains("CUFlatEndorsement1")) {
				String transaction = "CUFlatEndorsement1";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
								
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Additional Named Insured (2)",test);
				AddNamedInsuredPage.AddAdditionalNamedInsuredMethod(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);

			}
			
			if (transactionsList.contains("CUReverseEndorsement1")) {
				String transaction = "CUReverseEndorsement1";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}
			
			if (transactionsList.contains("CPQuoteForRenewal")) {
				String transaction = "CPQuoteForRenewal";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.searchQuoteNo(strRegressionID,transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CPConvertToPolicy", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.CollapseAllAndNavigateTo("Commercial Package", "20-CP", test);
				CommonMethods.NavigateTo("Commercial Property", test);
				CommercialPropertyPage.CommercialPropertyMethod(strRegressionID, transaction, test);
				//As per word doc these commented actions not needed
				CommonMethods.CollapseAllAndNavigateTo("Commercial Package","20-CP",test);
				CommonMethods.NavigateTo("General Liability",test);
				CommonMethods.NavigateTo("Experience Rating",test);
				GLExperienceRating.GLExperienceRatingPage(strRegressionID, transaction, test);
				CommonMethods.CollapseAllAndNavigateTo("Schedule Rating/IRPM","20-CP",test);
				ScheduleRatingIRPM.ScheduleRatingIRPM(strRegressionID, transaction, test);
				
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
				
			}
			
			if (transactionsList.contains("CUQuoteForRenewal")) {
				String transaction = "CUQuoteForRenewal";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.SearchQuotePolicyNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CUReverseEndorsement1", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Umbrella",test);
				CommonMethods.NavigateTo("Manual Factors",test);
				CUManualFactorsPage.ManualFactors_Main(strRegressionID, transaction,suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardForms(strRegressionID, transaction, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}


		    if (transactionsList.contains("CPConvertQFRToPolicy")) {
				String transaction = "CPConvertQFRToPolicy";
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.SearchQuotePolicyNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CPQuoteForRenewal", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
		    
			if (transactionsList.contains("CUConvertQFRToPolicy")) {
				String transaction = "CUConvertQFRToPolicy";
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				CommonMethods.SearchQuotePolicyNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CUQuoteForRenewal", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}
			
			if (transactionsList.contains("CUProRataEndorsement1")) {
				String transaction = "CUProRataEndorsement1";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
				
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Umbrella", test);
				CommonMethods.NavigateTo("Auto/Auto Dealers Policy Information (2)", test);
				CUAutoDealersPolicyInfoPage.AutoDealerPolicyInfo_Main(strRegressionID, transaction,suspendSheet, test);
				CommonMethods.NavigateTo("Employers Liability Policy Information (1)",test);
				CUEmpLiabPolicyInfo.EmpLiabPolicyInfo_Main(strRegressionID, transaction,suspendSheet, test);

				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}
			
			
			
	
	} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("CU_3 IL_CU_CPCU Regression test  failed", true, false);
			testTearDown(se);
		}
	}

	}
