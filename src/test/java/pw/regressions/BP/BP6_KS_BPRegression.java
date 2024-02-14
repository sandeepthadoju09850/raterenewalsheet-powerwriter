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
import pw.Constants.constants;
import pw.pages.CAF.CAF_InsuringAgreements;
import pw.pages.CAF.CAF_Locations;
import pw.pages.CAF.CrimeAndFidelity_Main;
import pw.pages.COMMON.PW_AddNamedInsured;
import pw.pages.COMMON.PW_AuditDetails;
import pw.pages.COMMON.PW_BillingTab;
import pw.pages.COMMON.PW_CommonFun;
import pw.pages.COMMON.PW_CommonMethods;
import pw.pages.COMMON.PW_GenInfo;
import pw.pages.COMMON.PW_Home;
import pw.pages.COMMON.PW_Login;
import pw.pages.COMMON.PW_PremiumSummary;
import pw.pages.COMMON.PW_Producers;
import pw.pages.CP.CP_AdditionalInterest;
import pw.pages.CP.CP_BlanketInsurance;
import pw.pages.CP.CP_Buildings;
import pw.pages.CP.CP_CommercialPackage;
import pw.pages.CP.CP_CommercialProperty;
import pw.pages.CP.CP_Coverages;
import pw.pages.CP.CP_FungusWet;
import pw.pages.CP.CP_Locations;
import pw.pages.CS.CyberSecurity_Main;
import pw.pages.GL.GL_AdditionalInterest;
import pw.pages.GL.GL_Classifications;
import pw.pages.GL.GL_EmployeeBenefitsLiability;
import pw.pages.GL.GL_ExperienceRating;
import pw.pages.GL.GL_InjuryToLeasedWorkers;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_OptionalProvisions;
import pw.pages.GL.GL_PremAndProd;
import pw.pages.GL.GL_StateSpecificCoverages;
import pw.pages.GL.GeneralLiability;

public class BP6_KS_BPRegression  extends BaseTest {
	ExtentReports extent;
	ExtentTest test;

	
	public static void KS_BPRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login  LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
		PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
		PW_AddNamedInsured AddNamedInsuredPage = TestPageFactory.initElements(se, PW_AddNamedInsured.class);
		CP_CommercialPackage CommercialPackage =  TestPageFactory.initElements(se, CP_CommercialPackage.class);
		CP_CommercialProperty CommercialPropertyPage = TestPageFactory.initElements(se, CP_CommercialProperty.class);	
		CP_BlanketInsurance CPBlanketInsurance = TestPageFactory.initElements(se, CP_BlanketInsurance.class);
		CP_Locations CPlocationsPage = TestPageFactory.initElements(se, CP_Locations.class);
		CP_Buildings BuildingsPage = TestPageFactory.initElements(se, CP_Buildings.class);
		CP_Coverages CPCoverages = TestPageFactory.initElements(se, CP_Coverages.class);
		GeneralLiability GeneralLiabilityPage = TestPageFactory.initElements(se, GeneralLiability.class);
		GL_Location GLLocationPage = TestPageFactory.initElements(se, GL_Location.class);
		GL_PremAndProd GLPremAndProdPage = TestPageFactory.initElements(se, GL_PremAndProd.class);
		GL_Classifications GLClassificationsPage = TestPageFactory.initElements(se, GL_Classifications.class);
		GL_InjuryToLeasedWorkers GLInjuryToLeasedWorkers = TestPageFactory.initElements(se, GL_InjuryToLeasedWorkers.class);
		GL_ExperienceRating GLExperienceRating = TestPageFactory.initElements(se, GL_ExperienceRating.class);
		GL_OptionalProvisions GLOptionalProvisionsPage = TestPageFactory.initElements(se, GL_OptionalProvisions.class);
		CrimeAndFidelity_Main CrimeAndFidelity = TestPageFactory.initElements(se, CrimeAndFidelity_Main.class);
		CAF_Locations CAFLocations = TestPageFactory.initElements(se, CAF_Locations.class);
		CAF_InsuringAgreements CAFInsuringAgreements = TestPageFactory.initElements(se, CAF_InsuringAgreements.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		PW_AuditDetails AuditDetailsPage = TestPageFactory.initElements(se, PW_AuditDetails.class);
		CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);	
		PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);
		String cyberChkY = "";
		
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
				  AddNamedInsuredPage.AddAdditionalNamedInsuredMethod(strRegressionID, transaction, test);
				  cyberChkY = CommercialPackage.CommercialPackage(strRegressionID,transaction, test);
				  CommercialPropertyPage.CommercialPropertyMethod(strRegressionID,transaction,test); 
				  CPlocationsPage.Locations(strRegressionID, transaction, test);
				  BuildingsPage.BuildingDetails(strRegressionID, transaction,test);
				  CommonMethods.NavigateToNextScreen(test);
				  CommonMethods.NavigateToNextScreen(test);
				  GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID,transaction,test);
				  GLLocationPage.GL_Location_Details(strRegressionID,transaction,test);
				  GLPremAndProdPage.GL_PremAndProdPage(strRegressionID,transaction,test);
				  GLClassificationsPage.GL_ClassificationsPage(strRegressionID,transaction,test); 
				  GLInjuryToLeasedWorkers.GL_InjuryToLeasedWorkersPage(strRegressionID,transaction,test);
				  CommonMethods.NavigateToNextScreen(test);
				  GLOptionalProvisionsPage.CP_GLOptionalProvisions(strRegressionID,transaction,test);
				  GLExperienceRating.GLExperienceRatingPage(strRegressionID,transaction,test);
				  CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
				  CommonMethods.NavigateTo("Cyber Security", test);
				  CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
				  CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				  PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				  BillingTab.getUpdateBillingTab(strRegressionID, transaction, test);
				  //CommonMethods.getDashboardForms(strRegressionID, transaction, test);
				 // CommonMethods.getDashboardSupplementaryInfo(strRegressionID, transaction, test);
				  CommonMethods.getDashboardActions(strRegressionID, transaction, test);
		
			}
			
			//Convert To Policy
			if(transactionsList.contains("ConvertToPolicy")){
			   String transaction = "ConvertToPolicy";
				  QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				  CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				  PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				  CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				 
			 
			}
			
			  //FlatEndorsement1 
			if(transactionsList.contains("FlatEndorsement1")){ 
				String transaction = "FlatEndorsement1";
			  
				
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			//CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
			CommonMethods.NavigateTo("Business Protector Policy", test);
			CommercialPackage.CommercialPackage(strRegressionID,transaction, test);
			CommonMethods.NavigateTo("Buildings (1)", test);
			BuildingsPage.BuildingDetails(strRegressionID, transaction,test);
			CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
			CommonMethods.NavigateTo("Crime and Fidelity", test);
			CrimeAndFidelity.CrimeAndFidelity_MainPage(strRegressionID, transaction, test);
			CAFLocations.CAF_Locations_Details(strRegressionID, transaction, test);		
			CAFInsuringAgreements.CAF_InsuringAgreementsPage(strRegressionID, transaction, test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			//CommonMethods.getDashboardForms(strRegressionID, transaction, test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			  
			} 
			
			if(transactionsList.contains("ProRataEndorsement1")){ 
				String transaction = "ProRataEndorsement1";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				//CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
				CommonMethods.NavigateTo("Business Protector Policy", test);
				CommonMethods.NavigateTo("General Liability", test);
				GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				//CommonMethods.getDashboardForms(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				  
			}
			
			if(transactionsList.contains("ProRataEndorsementOOSE")){ 
				String transaction = "ProRataEndorsementOOSE";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Business Protector Policy", test);
				CommonMethods.NavigateTo("Commercial Property", test);
				CommercialPropertyPage.CommercialPropertyMethod(strRegressionID,transaction,test); 
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				CommonMethods.getDashboardForms(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				  
			}
			
			
			//QuoteForRenewal
			if(transactionsList.contains("QuoteForRenewal")){
				String transaction = "QuoteForRenewal";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Business Protector Policy", test);
				CommonMethods.NavigateTo("Commercial Property", test);
				CommercialPropertyPage.CommercialPropertyMethod(strRegressionID,transaction,test); 
				CPBlanketInsurance.BlanketInsurance(strRegressionID,transaction,test); 
				CommonMethods.NavigateTo("Buildings (1)", test);
				CommonMethods.NavigateToPageContaingText("Loc 1 Bldg 1", test);
				CommonMethods.NavigateToNextScreen(test);
				CPCoverages.CP_BuildingCoveragePage(strRegressionID, transaction, "Location 1 Building 1", test);
				CPCoverages.CP_BusinessPersonalProperty(strRegressionID, transaction,"Location 1 Building 1", test);
				CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
				CommonMethods.NavigateTo("General Liability", test);
				CommonMethods.NavigateTo("Prem & Prod", test);
				CommonMethods.NavigateTo("Classifications (1)", test);
				GLClassificationsPage.GL_ClassificationsPage(strRegressionID,transaction,test); 
				CommonMethods.NavigateTo("Cyber Security", test);
				CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);	
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		  
			}
			
			
			//Convert QFR To Policy
			if(transactionsList.contains("ConvertQFRToPolicy")){
				String transaction = "ConvertQFRToPolicy";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			//Final Audit
			if(transactionsList.contains("Audit")){
				String transaction = "Audit";
				CommonMethods.waitforSpinner(test);
				CommonMethods.NavigateToNextScreen(test);
				CommonMethods.ClickOkOnNotification(test);
				CommonMethods.NavigateTo("Audit Details",test);
				AuditDetailsPage.AuditDetailsPage(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
	 			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			//ReviseAudit
			if(transactionsList.contains("ReviseAudit")){
				String transaction = "ReviseAudit";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateToNextScreen(test);
				CommonMethods.NavigateTo("Audit Details",test);
				AuditDetailsPage.AuditDetailsPage(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
	 			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
		}catch (Exception e) {
				e.printStackTrace();
				se.verify().verifyEquals("KS_BPRegression test  failed", true, false);
				testTearDown(se);
			}
			
		
		}
}
