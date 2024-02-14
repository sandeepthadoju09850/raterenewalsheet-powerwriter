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
import pw.pages.CP.CP_CondoUnitCoverage;
import pw.pages.CP.CP_FloodCoveragePage;
import pw.pages.CP.CP_Locations;
import pw.pages.CS.CyberSecurity_Main;
import pw.pages.DO.CP_DirectorsAndOfficers;
import pw.pages.GL.GL_Classifications;
import pw.pages.GL.GL_ExperienceRating;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_OptionalProvisions;
import pw.pages.GL.GL_PremAndProd;
import pw.pages.GL.GeneralLiability;

public class CP6_KS_CPRegression extends BaseTest {
	ExtentReports extent;
	ExtentTest test;
	
	public static void KSCpRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,
		String strRegressionID,File file,XSSFWorkbook workbook,ExtentTest test) throws IOException {
		PW_Login LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
		PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
		CP_CommercialPackage CommercialPackage =  TestPageFactory.initElements(se, CP_CommercialPackage.class);
		CP_CommercialProperty CommercialProperty =  TestPageFactory.initElements(se, CP_CommercialProperty.class);
		CP_Locations Locations = TestPageFactory.initElements(se, CP_Locations.class);
		CP_Buildings Bulidings = TestPageFactory.initElements(se, CP_Buildings.class);
		CP_FloodCoveragePage FloodCoverage = TestPageFactory.initElements(se, CP_FloodCoveragePage.class);
		CP_AdditionalInterest AdditionalInterest = TestPageFactory.initElements(se, CP_AdditionalInterest.class);
		GeneralLiability GeneralLiabilityPage = TestPageFactory.initElements(se, GeneralLiability.class);
		GL_Location GLLocationPage = TestPageFactory.initElements(se, GL_Location.class);
		GL_PremAndProd GLPremAndProdPage = TestPageFactory.initElements(se, GL_PremAndProd.class);
		GL_Classifications GLClassificationsPage = TestPageFactory.initElements(se, GL_Classifications.class);
		GL_OptionalProvisions GLOptionalProvisionsPage = TestPageFactory.initElements(se, GL_OptionalProvisions.class);
		GL_ExperienceRating GLExperienceRating = TestPageFactory.initElements(se, GL_ExperienceRating.class);
		CrimeAndFidelity_Main CrimeAndFidelity_MainPage = TestPageFactory.initElements(se, CrimeAndFidelity_Main.class);
		CAF_Locations CAF_LocationsPage =TestPageFactory.initElements(se, CAF_Locations.class);
		CAF_InsuringAgreements CAF_InsuringAgreementsPage =TestPageFactory.initElements(se, CAF_InsuringAgreements.class);
		CAF_CrimeEndorsement CAFCrimeEndorsementPage =TestPageFactory.initElements(se, CAF_CrimeEndorsement.class);
		PW_ScheduleRatingIRPM ScheduleRatingIRPM = TestPageFactory.initElements(se, PW_ScheduleRatingIRPM.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		CP_DirectorsAndOfficers DirectorsAndOfficers = TestPageFactory.initElements(se, CP_DirectorsAndOfficers.class);
		CP_CondoUnitCoverage CondoUnitCoverage = TestPageFactory.initElements(se, CP_CondoUnitCoverage.class);
		CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
		PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);
		try {		
			List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
			
			CommonFunPage.PWAppStartUp(test);
			//New Transaction Actions
		
			
			if(transactionsList.contains("NewQuote")){
			String transaction = "NewQuote";
			LoginPage.PWAppLogin(strRegressionID,transaction,test);
			WelcomePage.homePage(strRegressionID,transaction, test);
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			ProducerPage.AddProducers(strRegressionID,transaction,test);
			CommonMethods.NavigateToPage("Commercial Package",test);
			String cyberChkY = CommercialPackage.CommercialPackage(strRegressionID,transaction,test);
			CommercialProperty.CommercialPropertyMethod(strRegressionID, transaction, test);
			FloodCoverage.FloodCoveragePage(strRegressionID, transaction, test);
			Locations.Locations(strRegressionID, transaction, test);
			Bulidings.BuildingDetails(strRegressionID, transaction, test);
			CondoUnitCoverage.CondoUnitCoverage(strRegressionID, transaction, test);
			AdditionalInterest.CP_AddInterest(strRegressionID, transaction, test);
			GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID,transaction,test);
			GLLocationPage.GL_Location_Details(strRegressionID,transaction,test);
			GLPremAndProdPage.GL_PremAndProdPage(strRegressionID,transaction,test);
			GLClassificationsPage.GL_ClassificationsPage(strRegressionID,transaction,test);
			CommonMethods.NavigateToNextScreen(test);
			CommonMethods.NavigateToNextScreen(test);
			GLOptionalProvisionsPage.CP_GLOptionalProvisions(strRegressionID,transaction,test);
			GLExperienceRating.GLExperienceRatingPage(strRegressionID, transaction, test);
			CrimeAndFidelity_MainPage.CrimeAndFidelity_MainPage(strRegressionID,transaction,test);
			CAF_LocationsPage.CAF_Locations_Details(strRegressionID,transaction,test);
			CAF_InsuringAgreementsPage.CAF_InsuringAgreementsPage(strRegressionID,transaction,test);
			CAFCrimeEndorsementPage.CAF_CrimeEndorsementMethod(strRegressionID, transaction, test);
			DirectorsAndOfficers.CP_DOMainPage(strRegressionID, transaction, test);
			CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
			ScheduleRatingIRPM.ScheduleRatingIRPM(strRegressionID, transaction, test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
			//CommonMethods.getDashboardForms(strRegressionID,transaction,test);
			//CommonMethods.getDashboardSupplementaryInfo(strRegressionID,transaction,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
		
			//Convert To Policy
			if(transactionsList.contains("ConvertToPolicy")){
				String transaction = "ConvertToPolicy";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				//TODO Forms validate
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				
			}
			
			//FlatEndorsement1
			if(transactionsList.contains("FlatEndorsement1")){
				String transaction = "FlatEndorsement1";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Package", test);
				CommonMethods.NavigateToNextScreen(test);
				CommonMethods.NavigateToNextScreen(test);
				FloodCoverage.FloodCoveragePage(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			
			//Quote For Renewal
			if(transactionsList.contains("QuoteForRenewal")){
				String transaction = "QuoteForRenewal";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Package",test);
				CommonMethods.NavigateTo("Commercial Property", test);
				CommercialProperty.CommercialPropertyMethod(strRegressionID, transaction, test);
				//CommonMethods.NavigateToPage("General Liability", test);
				//CommonMethods.NavigateToPage("Optional Provisions (3)", test);
				//GLOptionalProvisionsPage.CP_GLOptionalProvisions(strRegressionID,transaction,test);
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
			
			
			//MidTermCancel
			if(transactionsList.contains("Cancellation")){
				String transaction = "Cancellation";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			//TODO Have to implement other transactions when Policy Load Error issue got resolved\
		
			

		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("KS CP Regression test  failed", true, false);
			testTearDown(se);
		}
	}

}
