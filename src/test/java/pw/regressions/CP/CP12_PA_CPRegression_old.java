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
import pw.pages.CIM.CIM_Buildings;
import pw.pages.CIM.CIM_InstallationFloater;
import pw.pages.CIM.CIM_Locations;
import pw.pages.CIM.CIM_MBProcessorFloaterOtherCoverages;
import pw.pages.CIM.CIM_Main;
import pw.pages.CIM.CIM_MiscellaneousBailee;
import pw.pages.CIM.CIM_MusicalInstrumentDealers;
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
import pw.pages.CP.CP_BlanketInsurance;
import pw.pages.CP.CP_Buildings;
import pw.pages.CP.CP_CommercialPackage;
import pw.pages.CP.CP_CommercialProperty;
import pw.pages.CP.CP_Locations;
import pw.pages.CS.CyberSecurity_Main;
import pw.pages.GL.GL_AdditionalInterest;
import pw.pages.GL.GL_Classifications;
import pw.pages.GL.GL_ExperienceRating;
import pw.pages.GL.GL_InjuryToLeasedWorkers;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_OptionalProvisions;
import pw.pages.GL.GL_PremAndProd;
import pw.pages.GL.GeneralLiability;

public class CP12_PA_CPRegression_old extends BaseTest {
	ExtentReports extent;
	ExtentTest test;
	
	
	public static void PACPRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login  LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
		PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
		PW_AddNamedInsured PWAddNamedInsured = TestPageFactory.initElements(se, PW_AddNamedInsured.class);
		
		CP_CommercialPackage CommercialPackage =  TestPageFactory.initElements(se, CP_CommercialPackage.class);
		CP_CommercialProperty CommercialPropertyPage = TestPageFactory.initElements(se, CP_CommercialProperty.class);
	
		CP_Locations CplocationsPage = TestPageFactory.initElements(se, CP_Locations.class);
		CP_Buildings BuildingsPage = TestPageFactory.initElements(se, CP_Buildings.class);
		CP_BlanketInsurance CPBlanketInsurance = TestPageFactory.initElements(se, CP_BlanketInsurance.class);
		
		GeneralLiability GeneralLiabilityPage = TestPageFactory.initElements(se, GeneralLiability.class);
		GL_Location GLLocationPage = TestPageFactory.initElements(se, GL_Location.class);
		GL_PremAndProd GLPremAndProdPage = TestPageFactory.initElements(se, GL_PremAndProd.class);
		GL_Classifications GLClassificationsPage = TestPageFactory.initElements(se, GL_Classifications.class);
		GL_AdditionalInterest GLAdditionalInterestPage=TestPageFactory.initElements(se, GL_AdditionalInterest.class);
		GL_ExperienceRating GLExperienceRating = TestPageFactory.initElements(se, GL_ExperienceRating.class);
		GL_OptionalProvisions GLOptionalProvisionsPage = TestPageFactory.initElements(se, GL_OptionalProvisions.class);
		GL_InjuryToLeasedWorkers GLInjuryToLeasedWorkers = TestPageFactory.initElements(se, GL_InjuryToLeasedWorkers.class);
		CIM_Main CIMMainPage = TestPageFactory.initElements(se, CIM_Main.class);
		CIM_Locations CIMLocationsPage = TestPageFactory.initElements(se, CIM_Locations.class);
		CIM_Buildings CIMBuildingsPage = TestPageFactory.initElements(se, CIM_Buildings.class);
		CIM_InstallationFloater CIMInstallationFloater = TestPageFactory.initElements(se, CIM_InstallationFloater.class);
		CIM_MiscellaneousBailee CIMMiscellaneousBailee = TestPageFactory.initElements(se, CIM_MiscellaneousBailee.class);
		CIM_MBProcessorFloaterOtherCoverages CIMMBProcessorFloaterOtherCoverages = TestPageFactory.initElements(se, CIM_MBProcessorFloaterOtherCoverages.class);
		CIM_MusicalInstrumentDealers CIMMusicalInstrumentDealers = TestPageFactory.initElements(se, CIM_MusicalInstrumentDealers.class);
		
		CrimeAndFidelity_Main CrimeAndFidelity_MainPage = TestPageFactory.initElements(se, CrimeAndFidelity_Main.class);
		CAF_Locations CAFLocationsPage =TestPageFactory.initElements(se, CAF_Locations.class);
		CAF_InsuringAgreements CAFInsuringAgreementsPage =TestPageFactory.initElements(se, CAF_InsuringAgreements.class);
		CAF_CrimeEndorsement CAFCrimeEndorsementPage =TestPageFactory.initElements(se, CAF_CrimeEndorsement.class);
		
		CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
		
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		PW_AuditDetails AuditDetailsPage = TestPageFactory.initElements(se, PW_AuditDetails.class);
		PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);
		
		try {
			List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
			//int iteration = 0;
			CommonFunPage.PWAppStartUp(test);
			
			//New Transaction Actions
			
			if(transactionsList.contains("NewQuote")){
			String transaction = "NewQuote";
			LoginPage.PWAppLogin(strRegressionID,transaction,test);
			WelcomePage.homePage(strRegressionID,transaction, test);
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			ProducerPage.AddProducers(strRegressionID,transaction,test);
			PWAddNamedInsured.AddAdditionalNamedInsuredMethod(strRegressionID,transaction,test);
			String cyberChkY = CommercialPackage.CommercialPackage(strRegressionID,transaction,test);
			CommercialPropertyPage.CommercialPropertyMethod(strRegressionID,transaction,test);
			CPBlanketInsurance.BlanketInsurance(strRegressionID,transaction,test);
			CplocationsPage.Locations(strRegressionID, transaction, test);
			BuildingsPage.BuildingDetails(strRegressionID, transaction,test);
		
			
			CommonMethods.NavigateTo("General Liability",test);
			GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID,transaction,test);
			GLLocationPage.GL_Location_Details(strRegressionID,transaction,test);
			
			GLPremAndProdPage.GL_PremAndProdPage(strRegressionID,transaction,test);
			GLClassificationsPage.GL_ClassificationsPage(strRegressionID,transaction,test);
			CommonMethods.NavigateToNextScreen(test);
			GLInjuryToLeasedWorkers.GL_InjuryToLeasedWorkersPage(strRegressionID,transaction,test);
			GLAdditionalInterestPage.GL_AdditionalInterest_Details(strRegressionID, transaction, test);
			GLOptionalProvisionsPage.CP_GLOptionalProvisions(strRegressionID,transaction,test);
			GLExperienceRating.GLExperienceRatingPage(strRegressionID, transaction, test);
			
			CrimeAndFidelity_MainPage.CrimeAndFidelity_MainPage(strRegressionID,transaction,test);
			CAFLocationsPage.CAF_Locations_Details(strRegressionID,transaction,test);
			CAFInsuringAgreementsPage.CAF_InsuringAgreementsPage(strRegressionID,transaction,test);
			CAFCrimeEndorsementPage.CAF_CrimeEndorsementMethod(strRegressionID, transaction, test);
			
			CIMMainPage.CIM_Main(strRegressionID,transaction,test);
			CIMLocationsPage.CIM_Locations(strRegressionID,transaction,test);
			CIMBuildingsPage.CIM_Buildings(strRegressionID,transaction,test);
			CIMInstallationFloater.CIM_InstallationFloater_Details(strRegressionID, transaction, test);
			CIMMiscellaneousBailee.MiscellaneousBailee(strRegressionID, transaction, test);
			CommonMethods.CollapseAllAndNavigateTo("Commercial Package", "20-CP", test);
			CommonMethods.NavigateTo("Commercial Inland Marine", test);
			CommonMethods.NavigateTo("Miscellaneous Bailee -Processor Floater -Other Coverages", test);
			CIMMBProcessorFloaterOtherCoverages.CIMMBProcessorFloaterOtherCoveragesPage(strRegressionID, transaction, test);
			CIMMusicalInstrumentDealers.MusicalInstrumentDealers(strRegressionID, transaction, test);
			CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
 			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
			CommonMethods.getDashboardForms(strRegressionID,transaction,test);
			//CommonMethods.getDashboardSupplementaryInfo(strRegressionID,transaction,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			//Convert To Policy
			if(transactionsList.contains("ConvertToPolicy")){
				String transaction = "ConvertToPolicy";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
	 			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			//QFR
			if(transactionsList.contains("QuoteForRenewal")){
				String transaction = "QuoteForRenewal";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Package", test);
				CommonMethods.NavigateTo("Commercial Inland Marine", test);
				CommonMethods.NavigateTo("Installation Floater",test);
				CIMInstallationFloater.CIM_InstallationFloater_Details(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);	
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			//ConvertQFR
			if(transactionsList.contains("ConvertQFRToPolicy")){
				String transaction = "ConvertQFRToPolicy";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);	
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
		
		//Audit
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
			//Cancel
		if(transactionsList.contains("Cancellation")){
		String transaction = "Cancellation";
		QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
		CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		}
			
		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("PACPRegression test  failed", true, false);
			testTearDown(se);
		}
	}

}
