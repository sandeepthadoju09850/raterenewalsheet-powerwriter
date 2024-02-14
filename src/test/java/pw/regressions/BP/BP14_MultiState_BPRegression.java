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
import pw.pages.CAF.CAF_CrimeEndorsement;
import pw.pages.CAF.CAF_InsuringAgreements;
import pw.pages.CAF.CAF_Locations;
import pw.pages.CAF.CrimeAndFidelity_Main;
import pw.pages.CIM.CIM_Buildings;
import pw.pages.CIM.CIM_CommercialArticles;
import pw.pages.CIM.CIM_Locations;
import pw.pages.CIM.CIM_Main;
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
import pw.pages.CS.CyberSecurity_Main;
import pw.pages.GL.GL_AdditionalInterest;
import pw.pages.GL.GL_Classifications;
import pw.pages.GL.GL_EmployeeBenefitsLiability;
import pw.pages.GL.GL_ExperienceRating;
import pw.pages.GL.GL_LiquorLiability;
import pw.pages.GL.GL_LiquorLiability_Classifications;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_OptionalProvisions;
import pw.pages.GL.GL_PremAndProd;
import pw.pages.GL.GeneralLiability;

public class BP14_MultiState_BPRegression extends BaseTest{
	
	ExtentReports extent;
	ExtentTest test;

	
	public static void MultiState_BPRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login  LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
		PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
		CP_CommercialPackage CommercialPackage =  TestPageFactory.initElements(se, CP_CommercialPackage.class);
		CP_CommercialProperty CommercialPropertyPage = TestPageFactory.initElements(se, CP_CommercialProperty.class);
		CP_Locations CplocationsPage = TestPageFactory.initElements(se, CP_Locations.class);
		CP_Buildings BuildingsPage = TestPageFactory.initElements(se, CP_Buildings.class);
		GeneralLiability GeneralLiabilityPage = TestPageFactory.initElements(se, GeneralLiability.class);
		GL_Location GLLocationPage = TestPageFactory.initElements(se, GL_Location.class);
		GL_PremAndProd GLPremAndProdPage = TestPageFactory.initElements(se, GL_PremAndProd.class);
		GL_Classifications GLClassificationsPage = TestPageFactory.initElements(se, GL_Classifications.class);
		GL_EmployeeBenefitsLiability GLEmployeeBenefitsLiabilityPage = TestPageFactory.initElements(se, GL_EmployeeBenefitsLiability.class);
		GL_AdditionalInterest GLAdditionalInterestPage=TestPageFactory.initElements(se, GL_AdditionalInterest.class);
		GL_OptionalProvisions GLOptionalProvisionsPage = TestPageFactory.initElements(se, GL_OptionalProvisions.class);
		GL_ExperienceRating GLExperienceRating = TestPageFactory.initElements(se, GL_ExperienceRating.class);
		CrimeAndFidelity_Main CrimeAndFidelity = TestPageFactory.initElements(se, CrimeAndFidelity_Main.class);
		CAF_Locations CAFLocations = TestPageFactory.initElements(se, CAF_Locations.class);
		CAF_InsuringAgreements CAFInsuringAgreements = TestPageFactory.initElements(se, CAF_InsuringAgreements.class);
		CAF_CrimeEndorsement CAFCrimeEndorsement = TestPageFactory.initElements(se, CAF_CrimeEndorsement.class);
		CIM_Main CIMMainPage  =  TestPageFactory.initElements(se, CIM_Main.class);
		CIM_Locations CIMLocationsPage = TestPageFactory.initElements(se, CIM_Locations.class);
		CIM_Buildings CIMBuildings = TestPageFactory.initElements(se, CIM_Buildings.class);
		CIM_CommercialArticles CommercialArticles = TestPageFactory.initElements(se, CIM_CommercialArticles.class);
		CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		PW_KYTaxExemption KYTaxExemptionPage = TestPageFactory.initElements(se, PW_KYTaxExemption.class);
		GL_LiquorLiability_Classifications GLLiquorLiabilityClassificationsPage=TestPageFactory.initElements(se, GL_LiquorLiability_Classifications.class);
		GL_LiquorLiability GLLiquorLiabilityPage=TestPageFactory.initElements(se, GL_LiquorLiability.class);
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
				  CommonMethods.NavigateToNextScreen(test);
				  String cyberChkY = CommercialPackage.CommercialPackage(strRegressionID,transaction, test);
				  CommercialPropertyPage.CommercialPropertyMethod(strRegressionID,transaction,test); 
				
				  CplocationsPage.Locations(strRegressionID, transaction, test);
				  BuildingsPage.BuildingDetails(strRegressionID, transaction,test);
				  CommonMethods.NavigateToNextScreen(test);
				  CommonMethods.NavigateToNextScreen(test);
				 
				  GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID,transaction,test);
				  GLLocationPage.GL_Location_Details(strRegressionID,transaction,test);
				  GLPremAndProdPage.GL_PremAndProdPage(strRegressionID,transaction,test);
				  GLClassificationsPage.GL_ClassificationsPage(strRegressionID,transaction,test);
				  GLEmployeeBenefitsLiabilityPage.GL_EmployeeBenefitsLiability_Details(strRegressionID,transaction,test);

				  GLAdditionalInterestPage.GL_AdditionalInterest_Details(strRegressionID,transaction, test);
				  GLOptionalProvisionsPage.CP_GLOptionalProvisions(strRegressionID,transaction,test);
				  GLExperienceRating.GLExperienceRatingPage(strRegressionID,transaction,test);
				  
				  CrimeAndFidelity.CrimeAndFidelity_MainPage(strRegressionID, transaction, test);
				  CAFLocations.CAF_Locations_Details(strRegressionID, transaction, test);	
				  CAFInsuringAgreements.CAF_InsuringAgreementsPage(strRegressionID, transaction, test);
				  CAFCrimeEndorsement.CAF_CrimeEndorsementMethod(strRegressionID, transaction, test);
				  
				  CIMMainPage.CIM_Main(strRegressionID, transaction, test);
				  CIMLocationsPage.CIM_Locations(strRegressionID, transaction, test);
				  CIMBuildings.CIM_Buildings(strRegressionID, transaction, test);
				  CommercialArticles.CommercialArticles(strRegressionID, transaction, test);
				  CommonMethods.NavigateToNextScreen(test);
				  
				  CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
				  KYTaxExemptionPage.KYTaxExemption(strRegressionID, transaction, test); 
				  CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				  CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
				  CommonMethods.NavigateTo("Crime and Fidelity",test);
				  CrimeAndFidelity.CrimeAndFidelity_MainPage(strRegressionID, transaction, test);
				  CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				  PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				  BillingTab.getUpdateBillingTab(strRegressionID, transaction, test);
				  CommonMethods.getDashboardForms(strRegressionID, transaction, test);
				  //CommonMethods.getDashboardSupplementaryInfo(strRegressionID, transaction, test);
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
					CommonMethods.NavigateTo("Business Protector Policy",test);
					CommonMethods.NavigateTo("General Liability", test);
					GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID,transaction,test);
					CommonMethods.NavigateTo("Liquor Liability", test);
					GLLiquorLiabilityPage.GL_LiquorLiability_Details(strRegressionID, transaction, test);
					GLLiquorLiabilityClassificationsPage.GL_LiquorLiability_ClassificationsPage(strRegressionID, transaction, test);
					CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
					PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
					//CommonMethods.getDashboardForms(strRegressionID, transaction, test);
					CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			} 
				
			  //Endorsement2
			if(transactionsList.contains("ProRataEndorsement1")){ 
				String transaction = "ProRataEndorsement1";		
					QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
					CommonMethods.NavigateTo("Business Protector Policy",test);
					CommonMethods.NavigateTo("General Liability", test);
					GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID,transaction,test);
					CommonMethods.NavigateTo("Additional Interest", test);
					GLAdditionalInterestPage.GL_AdditionalInterest_Details(strRegressionID,transaction, test);
					CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
					PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
					//CommonMethods.getDashboardForms(strRegressionID, transaction, test);
					CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			} 
			
			//QuoteForRenewal
			if(transactionsList.contains("QuoteForRenewal")){
				String transaction = "QuoteForRenewal";
					QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);	
					CommonMethods.NavigateTo("Business Protector Policy",test);
					CommonMethods.NavigateTo("Commercial Property", test);
					CommercialPropertyPage.CommercialPropertyMethod(strRegressionID, transaction, test);
					CommonMethods.NavigateTo("General Liability", test);
					GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID,transaction,test);
					CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
					CommonMethods.NavigateTo("Crime and Fidelity",test);
					CommonMethods.NavigateTo("Insuring Agreements (3)", test);
					CAFInsuringAgreements.CAF_InsuringAgreementsPage(strRegressionID, transaction, test);
					CAFCrimeEndorsement.deleteFormCR2010(strRegressionID, transaction, test);
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
	
		}catch (Exception e) {
				e.printStackTrace();
				se.verify().verifyEquals("Multi_BPRegression test  failed", true, false);
				testTearDown(se);
			}
	
		}
}
