package pw.regressions.BP;

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
import pw.pages.COMMON.PW_ScheduleRatingIRPM;
import pw.pages.CP.CP_AdditionalInterest;
import pw.pages.CP.CP_Buildings;
import pw.pages.CP.CP_CommercialPackage;
import pw.pages.CP.CP_CommercialProperty;
import pw.pages.CP.CP_Coverages;
import pw.pages.CP.CP_FloodCoveragePage;
import pw.pages.CP.CP_KeyEmployeeReplacementExpense;
import pw.pages.CP.CP_Locations;
import pw.pages.CS.CyberSecurity_Main;
import pw.pages.GL.GL_AdditionalInterest;
import pw.pages.GL.GL_Classifications;
import pw.pages.GL.GL_EmployeeBenefitsLiability;
import pw.pages.GL.GL_ExperienceRating;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_OptionalProvisions;
import pw.pages.GL.GL_PremAndProd;
import pw.pages.GL.GeneralLiability;

public class BP9_MN_BPRegression extends BaseTest {
	ExtentReports extent;
	ExtentTest test;

	
	public static void MN_BPRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login  LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
		PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
		CP_CommercialPackage CommercialPackage =  TestPageFactory.initElements(se, CP_CommercialPackage.class);
		CP_CommercialProperty CommercialPropertyPage = TestPageFactory.initElements(se, CP_CommercialProperty.class);
		CP_FloodCoveragePage CP_FloodCoveragepage = TestPageFactory.initElements(se, CP_FloodCoveragePage.class);
		CP_Locations CplocationsPage = TestPageFactory.initElements(se, CP_Locations.class);
		CP_Buildings BuildingsPage = TestPageFactory.initElements(se, CP_Buildings.class);
		CP_AdditionalInterest CP_AdditionalInterestPage = TestPageFactory.initElements(se, CP_AdditionalInterest.class);
		CP_KeyEmployeeReplacementExpense CPKeyEmployeeReplacementExpense = TestPageFactory.initElements(se, CP_KeyEmployeeReplacementExpense.class);
		CP_Coverages CPCoverages = TestPageFactory.initElements(se, CP_Coverages.class);
		GeneralLiability GeneralLiabilityPage = TestPageFactory.initElements(se, GeneralLiability.class);
		GL_Location GLLocationPage = TestPageFactory.initElements(se, GL_Location.class);
		GL_PremAndProd GLPremAndProdPage = TestPageFactory.initElements(se, GL_PremAndProd.class);
		GL_Classifications GLClassificationsPage = TestPageFactory.initElements(se, GL_Classifications.class);
		GL_AdditionalInterest GLAdditionalInterestPage=TestPageFactory.initElements(se, GL_AdditionalInterest.class);
		GL_ExperienceRating GLExperienceRating = TestPageFactory.initElements(se, GL_ExperienceRating.class);
		GL_EmployeeBenefitsLiability GLEmployeeBenefitsLiability = TestPageFactory.initElements(se, GL_EmployeeBenefitsLiability.class);
		GL_OptionalProvisions GLOptionalProvisionsPage = TestPageFactory.initElements(se, GL_OptionalProvisions.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		PW_ScheduleRatingIRPM ScheduleRatingIRPMPage = TestPageFactory.initElements(se, PW_ScheduleRatingIRPM.class);
		CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
		PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);

		try {
			List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
			//int iteration = 0;
			CommonFunPage.PWAppStartUp(test);
			
			//New Transaction Actions
			
			if (transactionsList.contains("NewQuote")) {
				String transaction = "NewQuote";
				LoginPage.PWAppLogin(strRegressionID, transaction, test);
				WelcomePage.homePage(strRegressionID, transaction, test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				ProducerPage.AddProducers(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Business Protector Policy",test);
				String cyberChkY = CommercialPackage.CommercialPackage(strRegressionID, transaction, test);
				CommercialPropertyPage.CommercialPropertyMethod(strRegressionID, transaction, test);
				CP_FloodCoveragepage.FloodCoveragePage(strRegressionID, transaction, test);
				CplocationsPage.Locations(strRegressionID, transaction, test);
				BuildingsPage.BuildingDetails(strRegressionID, transaction, test);
				CommonMethods.NavigateToNextScreen(test);
				CPKeyEmployeeReplacementExpense.CP_KeyEmployeePage(strRegressionID, transaction, test);
				//sheetal commented below navigation as paert of 05/01/22 rate changes
				//Elaine commented "collapse" row below on 4/4/23
				//CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
				CommonMethods.NavigateTo("General Liability", test);
				GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID, transaction, test);
				GLLocationPage.GL_Location_Details(strRegressionID, transaction, test);
				GLPremAndProdPage.GL_PremAndProdPage(strRegressionID, transaction, test);
				GLClassificationsPage.GL_ClassificationsPage(strRegressionID, transaction, test);
				GLAdditionalInterestPage.GL_AdditionalInterest_Details(strRegressionID, transaction, test);
				GLOptionalProvisionsPage.CP_GLOptionalProvisions(strRegressionID, transaction, test);
				CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
				GLExperienceRating.GLExperienceRatingPage(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				BillingTab.getUpdateBillingTab(strRegressionID, transaction, test);
				CommonMethods.getDashboardForms(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}
			// Convert To Policy
			if (transactionsList.contains("ConvertToPolicy")) {
				String transaction = "ConvertToPolicy";
				//QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Business Protector Policy",test);
				CommonMethods.NavigateTo("General Liability", test);
				GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Emp Benefits Liab", test);
				GLEmployeeBenefitsLiability.GL_EmployeeBenefitsLiability_Details(strRegressionID, transaction, test);
				CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
				CommonMethods.NavigateTo("Schedule Rating/IRPM",test);
				ScheduleRatingIRPMPage.ScheduleRatingIRPM(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}
			
			  //FlatEndorsement1 
			if(transactionsList.contains("FlatEndorsement1")){ 
				String transaction = "FlatEndorsement1";
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
			CommercialPackage.CommercialPackage(strRegressionID, transaction, test);
			CommonMethods.NavigateTo("General Liability", test);
			GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID,transaction,test);
			CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
			PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
			CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}
			
			//ProRataEndorsement1 
			if(transactionsList.contains("ProRataEndorsement1")){ 
				String transaction = "ProRataEndorsement1";
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			CommonMethods.NavigateToPage("Buildings (1)", test);
			CommonMethods.NavigateToPageContaingText("Loc 1 Bldg 1", test);
			CommonMethods.NavigateToNextScreen(test);
			CPCoverages.CP_BusinessPersonalProperty(strRegressionID, transaction, "Location 1 Building 1", test);
			CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
			CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
			PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
			CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}
			
			
			//ProRataEndorsement2 
			if(transactionsList.contains("ProRataEndorsement2")){ 
				String transaction = "ProRataEndorsement2";
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			CommonMethods.NavigateTo("Business Protector Policy",test);
			CommonMethods.NavigateTo("Commercial Property", test);
			CommonMethods.NavigateTo("Additional Interest", test);
			CP_AdditionalInterestPage.CP_AddInterest(strRegressionID, transaction,test);
			CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
			PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
			CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}
			
			//QuoteForRenewal
			if(transactionsList.contains("QuoteForRenewal")){
				String transaction = "QuoteForRenewal";
		
		  QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
		  CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
		  CommonMethods.NavigateTo("Commercial Property", test);
		  CommercialPropertyPage.CommercialPropertyMethod(strRegressionID, transaction, test);
		  CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
		  CommonMethods.NavigateTo("General Liability", test);
		  GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID,transaction,test);
		  CommonMethods.NavigateTo("Additional Interest (1)", test);
		  GLAdditionalInterestPage.GL_AdditionalInterest_Details(strRegressionID, transaction, test);
		  CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
		  PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
		  CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}
			
			
			//Convert QFR To Policy
			if(transactionsList.contains("ConvertQFRToPolicy")){
				String transaction = "ConvertQFRToPolicy";
			
		  QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
		  CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
		  CommonMethods.NavigateTo("General Liability", test);
		  CommonMethods.NavigateTo("Prem & Prod", test); 
		  GLPremAndProdPage.GL_PremAndProdPage(strRegressionID, transaction, test);
		  CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
		  PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
		  CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				

		}
			
		}catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("MN_BPRegression test  failed", true, false);
			testTearDown(se);
		}
		
	
	}
}
			
