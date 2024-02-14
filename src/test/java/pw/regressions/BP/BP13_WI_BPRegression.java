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
import pw.pages.CIM.CIM_BuildersRisk;
import pw.pages.CIM.CIM_Buildings;
import pw.pages.CIM.CIM_Cargo;
import pw.pages.CIM.CIM_CargoOtherCoverages;
import pw.pages.CIM.CIM_CargoTerminal;
import pw.pages.CIM.CIM_CommercialArticles;
import pw.pages.CIM.CIM_Locations;
import pw.pages.CIM.CIM_Main;
import pw.pages.CIM.CIM_ScheduledPropertyFloater;
import pw.pages.CIM.CIM_ScheduledPropertyFloaterOtherCoverages;
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
import pw.pages.CP.CP_FungusWet;
import pw.pages.CP.CP_Locations;
import pw.pages.CS.CyberSecurity_Main;
import pw.pages.EPLI.CP_EmploymentPracticesLiabilityInsurancePage;
import pw.pages.GL.GL_AdditionalInterest;
import pw.pages.GL.GL_Classifications;
import pw.pages.GL.GL_EmployeeBenefitsLiability;
import pw.pages.GL.GL_ExperienceRating;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_MiscellaneousCoverage;
import pw.pages.GL.GL_OptionalProvisions;
import pw.pages.GL.GL_PremAndProd;
import pw.pages.GL.GL_SecuraManuscript;
import pw.pages.GL.GL_StateSpecificCoverages;
import pw.pages.GL.GeneralLiability;

public class BP13_WI_BPRegression extends BaseTest {
	

	ExtentReports extent;
	ExtentTest test;

	
	public static void WI_BPRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login  LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
		PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
		CP_CommercialPackage CommercialPackage =  TestPageFactory.initElements(se, CP_CommercialPackage.class);
		CP_CommercialProperty CommercialPropertyPage = TestPageFactory.initElements(se, CP_CommercialProperty.class);
		CP_Locations CplocationsPage = TestPageFactory.initElements(se, CP_Locations.class);
		CP_Buildings BuildingsPage = TestPageFactory.initElements(se, CP_Buildings.class);
		CP_AdditionalInterest CP_AdditionalInterestPage = TestPageFactory.initElements(se, CP_AdditionalInterest.class);
		GeneralLiability GeneralLiabilityPage = TestPageFactory.initElements(se, GeneralLiability.class);
		GL_Location GLLocationPage = TestPageFactory.initElements(se, GL_Location.class);
		GL_PremAndProd GLPremAndProdPage = TestPageFactory.initElements(se, GL_PremAndProd.class);
		GL_Classifications GLClassificationsPage = TestPageFactory.initElements(se, GL_Classifications.class);
		GL_ExperienceRating GLExperienceRating = TestPageFactory.initElements(se, GL_ExperienceRating.class);
		GL_OptionalProvisions GLOptionalProvisionsPage = TestPageFactory.initElements(se, GL_OptionalProvisions.class);
		GL_MiscellaneousCoverage GLMiscellaneousCoverage = TestPageFactory.initElements(se, GL_MiscellaneousCoverage.class);
		GL_SecuraManuscript GLSecuraManuscript = TestPageFactory.initElements(se, GL_SecuraManuscript.class);
		CrimeAndFidelity_Main CrimeAndFidelity = TestPageFactory.initElements(se, CrimeAndFidelity_Main.class);
		CAF_Locations CAFLocations = TestPageFactory.initElements(se, CAF_Locations.class);
		CAF_InsuringAgreements CAFInsuringAgreements = TestPageFactory.initElements(se, CAF_InsuringAgreements.class);
		CAF_CrimeEndorsement CAFCrimeEndorsement = TestPageFactory.initElements(se, CAF_CrimeEndorsement.class);
		CIM_Main CIMMainPage  =  TestPageFactory.initElements(se, CIM_Main.class);
		CIM_Locations CIMLocationsPage = TestPageFactory.initElements(se, CIM_Locations.class);
		CIM_Buildings CIMBuildings = TestPageFactory.initElements(se, CIM_Buildings.class);
		CIM_ScheduledPropertyFloater CIMScheduledPropertyFloater = TestPageFactory.initElements(se, CIM_ScheduledPropertyFloater.class);
		CIM_ScheduledPropertyFloaterOtherCoverages CIMScheduledPropertyFloaterOtherCoverages = TestPageFactory.initElements(se, CIM_ScheduledPropertyFloaterOtherCoverages.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
		CIM_BuildersRisk CIMBuilderRiskPage = TestPageFactory.initElements(se, CIM_BuildersRisk.class);
		CIM_CommercialArticles CommercialArticles = TestPageFactory.initElements(se, CIM_CommercialArticles.class);
		CP_EmploymentPracticesLiabilityInsurancePage EmploymentPracticesLiabilityInsurancePage = TestPageFactory.initElements(se, CP_EmploymentPracticesLiabilityInsurancePage.class);
		CIM_Cargo CIMCargo = TestPageFactory.initElements(se, CIM_Cargo.class);
		CIM_CargoOtherCoverages CIMCargoOtherCoverages = TestPageFactory.initElements(se, CIM_CargoOtherCoverages.class);
		CIM_CargoTerminal CIMCargoTerminal = TestPageFactory.initElements(se, CIM_CargoTerminal.class);
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
				  CP_AdditionalInterestPage.CP_AddInterest(strRegressionID, transaction,test); 
				  GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID,transaction,test);
				  GLLocationPage.GL_Location_Details(strRegressionID,transaction,test);
				  GLPremAndProdPage.GL_PremAndProdPage(strRegressionID,transaction,test);
				  GLClassificationsPage.GL_ClassificationsPage(strRegressionID,transaction,test); 
				  CommonMethods.NavigateToNextScreen(test);
				  GLOptionalProvisionsPage.CP_GLOptionalProvisions(strRegressionID,transaction,test);
				  GLMiscellaneousCoverage.CP_GLMiscellaneousCoverage(strRegressionID,transaction,test);
				  GLExperienceRating.GLExperienceRatingPage(strRegressionID,transaction,test);
				  CommonMethods.NavigateTo("Crime and Fidelity", test);
				  CrimeAndFidelity.CrimeAndFidelity_MainPage(strRegressionID, transaction, test);
				  CAFLocations.CAF_Locations_Details(strRegressionID, transaction, test);		
				  CAFInsuringAgreements.CAF_InsuringAgreementsPage(strRegressionID, transaction, test);
				  CAFCrimeEndorsement.CAF_CrimeEndorsementMethod(strRegressionID, transaction, test);
				  CIMMainPage.CIM_Main(strRegressionID, transaction, test);
				  CIMLocationsPage.CIM_Locations(strRegressionID, transaction, test);
				  CIMBuildings.CIM_Buildings(strRegressionID, transaction, test);
				  CIMBuilderRiskPage.BuildersRisk(strRegressionID,transaction,test);
				  CommonMethods.NavigateToNextScreen(test);
				  CommercialArticles.CommercialArticles(strRegressionID, transaction, test);
				  CIMScheduledPropertyFloater.CIM_ScheduledPropertyFloaterPage(strRegressionID, transaction, test);
				  CIMScheduledPropertyFloaterOtherCoverages.ScheduledPropertyFloaterOtherCoverages(strRegressionID, transaction, test);
				  CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
				  CommonMethods.NavigateTo("Cyber Security", test);
				  CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
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
				CommonMethods.NavigateTo("Business Protector Policy", test);
				CommonMethods.NavigateTo("General Liability", test);
				GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Secura Manuscript", test);
				GLSecuraManuscript.CP_GLSecuraManuscript(strRegressionID,transaction,test);
				CommonMethods.NavigateToNextScreen(test);
				CommonMethods.NavigateTo("Commercial Inland Marine", test);
				CIMMainPage.CIM_Main(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Cargo", test);
				CIMCargo.Cargo(strRegressionID, transaction, test);
				CIMCargoOtherCoverages.CargoOtherCoverages(strRegressionID, transaction, test);
				CIMCargoTerminal.CargoTerminal(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				//CommonMethods.getDashboardForms(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				  
			} 
			if(transactionsList.contains("ProRataEndorsement1")){ 
				String transaction = "ProRataEndorsement1";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Business Protector Policy", test);
				CommercialPackage.CommercialPackage(strRegressionID,transaction, test);
				CommonMethods.NavigateTo("General Liability", test);
				GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID,transaction,test);
				CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
				CommonMethods.NavigateTo("Employment Practices Liability Insurance", test);
				EmploymentPracticesLiabilityInsurancePage.CP_EmployPracLiabInsPage(strRegressionID, transaction, test);
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
				CommonMethods.getDashboardForms(strRegressionID,"ProRataEndorsementOOSE1",test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				  
			}
			
			//QuoteForRenewal
			if(transactionsList.contains("QuoteForRenewal")){
				String transaction = "QuoteForRenewal";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Business Protector Policy", test);
				CommonMethods.NavigateTo("Commercial Property", test);
				CommercialPropertyPage.CommercialPropertyMethod(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("General Liability", test);
				CommonMethods.NavigateTo("Experience Rating", test);	
				GLExperienceRating.GLExperienceRatingPage(strRegressionID,transaction,test);
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
				se.verify().verifyEquals("WI_BPRegression test  failed", true, false);
				testTearDown(se);
			}
		}
}
