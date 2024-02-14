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
import pw.pages.COMMON.PW_AddNamedInsured;
import pw.pages.COMMON.PW_BillingTab;
import pw.pages.COMMON.PW_CommonFun;
import pw.pages.COMMON.PW_CommonMethods;
import pw.pages.COMMON.PW_GenInfo;
import pw.pages.COMMON.PW_Home;
import pw.pages.COMMON.PW_Login;
import pw.pages.COMMON.PW_PremiumSummary;
import pw.pages.COMMON.PW_Producers;
import pw.pages.CP.CP_AdditionalInterest;
import pw.pages.CP.CP_Buildings;
import pw.pages.CP.CP_CommercialPackage;
import pw.pages.CP.CP_CommercialProperty;
import pw.pages.CP.CP_Coverages;
import pw.pages.CP.CP_Locations;
import pw.pages.CP.CP_MNFireSafetySurcharge;
import pw.pages.CP.CP_SecuraManuscript;
import pw.pages.CS.CyberSecurity_Main;
import pw.pages.GL.GL_AdditionalInterest;
import pw.pages.GL.GL_Classifications;
import pw.pages.GL.GL_EmployeeBenefitsLiability;
import pw.pages.GL.GL_ExperienceRating;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_OptionalProvisions;
import pw.pages.GL.GL_PremAndProd;
import pw.pages.GL.GL_ProfessionalLiabilityOccurance;
import pw.pages.GL.GL_SpecialityOption;
import pw.pages.GL.GeneralLiability;

public class CP18_GLDetective_CPRegression extends BaseTest {
	
	ExtentReports extent;
	ExtentTest test;
	
	public static void glDetectiveCpMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params, String strRegressionID,File file,XSSFWorkbook workbook,ExtentTest test) throws IOException {
		

	PW_Login LoginPage = TestPageFactory.initElements(se, PW_Login.class);
	PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
	PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
	PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
	PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
	PW_AddNamedInsured AddNamedInsuredPage = TestPageFactory.initElements(se, PW_AddNamedInsured.class);
	CP_CommercialPackage CommercialPackage =  TestPageFactory.initElements(se, CP_CommercialPackage.class);
	CP_CommercialProperty CommercialProperty =  TestPageFactory.initElements(se, CP_CommercialProperty.class);
	CP_Locations Locations = TestPageFactory.initElements(se, CP_Locations.class);
	CP_Buildings Bulidings = TestPageFactory.initElements(se, CP_Buildings.class);
	CP_Coverages Coverages = TestPageFactory.initElements(se, CP_Coverages.class);
	CP_AdditionalInterest AdditionalInterest = TestPageFactory.initElements(se, CP_AdditionalInterest.class);
	CP_SecuraManuscript SecuraManuscript = TestPageFactory.initElements(se, CP_SecuraManuscript.class);
	GeneralLiability GeneralLiabilityPage = TestPageFactory.initElements(se, GeneralLiability.class);
	GL_Location GLLocations = TestPageFactory.initElements(se, GL_Location.class);
	GL_PremAndProd GLPremAndProd = TestPageFactory.initElements(se, GL_PremAndProd.class);
	GL_Classifications GLClassifications = TestPageFactory.initElements(se, GL_Classifications.class);
	GL_EmployeeBenefitsLiability GLEMPBenfitsLiability =  TestPageFactory.initElements(se, GL_EmployeeBenefitsLiability.class);
	GL_SpecialityOption GLSpecialityOption = TestPageFactory.initElements(se, GL_SpecialityOption.class);
	GL_ProfessionalLiabilityOccurance GLProfessionalLiabilityOccurance = TestPageFactory.initElements(se, GL_ProfessionalLiabilityOccurance.class);
	GL_AdditionalInterest GLAdditionalInterest = TestPageFactory.initElements(se, GL_AdditionalInterest.class);
	GL_OptionalProvisions GLOptionalProvisions = TestPageFactory.initElements(se, GL_OptionalProvisions.class);
	GL_ExperienceRating GLExperienceRating = TestPageFactory.initElements(se, GL_ExperienceRating.class);
	PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
	PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
	CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
	CP_MNFireSafetySurcharge CPMNFireSafetySurcharge = TestPageFactory.initElements(se, CP_MNFireSafetySurcharge.class);
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
			AddNamedInsuredPage.AddAdditionalNamedInsuredMethod(strRegressionID,transaction,test);
			String cyberChkY = CommercialPackage.CommercialPackage(strRegressionID,transaction,test);
			CommercialProperty.CommercialPropertyMethod(strRegressionID, transaction, test);
			Locations.Locations(strRegressionID, transaction, test);
			Bulidings.BuildingDetails(strRegressionID, transaction, test);
			AdditionalInterest.CP_AddInterest(strRegressionID, transaction, test);
			GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID, transaction, test);
			GLLocations.GL_Location_Details(strRegressionID, transaction, test);
			GLPremAndProd.GL_PremAndProdPage(strRegressionID, transaction, test);
			GLClassifications.GL_ClassificationsPage(strRegressionID, transaction, test);
			GLEMPBenfitsLiability.GL_EmployeeBenefitsLiability_Details(strRegressionID, transaction, test);
			GLSpecialityOption.GL_SpecialityOption_Details(strRegressionID, transaction, test);
			GLProfessionalLiabilityOccurance.GL_ProfessionalLiabilityOccurance_Details(strRegressionID, transaction, test);
			GLAdditionalInterest.GL_AdditionalInterest_Details(strRegressionID, transaction, test);
			GLOptionalProvisions.CP_GLOptionalProvisions(strRegressionID, transaction, test);
			GLExperienceRating.GLExperienceRatingPage(strRegressionID, transaction, test);
			CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
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
			//List<String> pagesList = ExcelOperations.getPagesList(strRegressionID,transaction);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		}
		
		//FlatEndorsement
		if(transactionsList.contains("FlatEndorsement")){
			String transaction = "FlatEndorsement";
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			CommonMethods.NavigateToPage("Personal Property Coverage (1)",test);
			Coverages.CP_BusinessPersonalProperty(strRegressionID, transaction, "Location 1 Building 1", test);
			CommonMethods.NavigateToPage("General Liability",test);
			GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID, transaction, test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			CommonMethods.getDashboardForms(strRegressionID,transaction,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		}
		
		//ProRataEndorsement
		if(transactionsList.contains("ProRataEndorsement")){
			String transaction = "ProRataEndorsement";
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			CommonMethods.NavigateToPage("Commercial Property",test);
			CommercialProperty.CommercialPropertyMethod(strRegressionID, transaction, test);
			CommonMethods.NavigateToPage("Secura Manuscript",test);
			SecuraManuscript.SecuraManuscriptPage(strRegressionID, transaction, test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			//CommonMethods.getDashboardForms(strRegressionID,transaction,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		}
		
		//Quote For Renewal
		if(transactionsList.contains("QuoteForRenewal")){
			String transaction = "QuoteForRenewal";
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			CommonMethods.NavigateTo("Commercial Package", test);
			CommonMethods.NavigateToPage("Commercial Property", test);
			CommercialProperty.CommercialPropertyMethod(strRegressionID, transaction, test);
			CommonMethods.NavigateToPage("Personal Property Coverage (1)",test);
			Coverages.CP_BusinessPersonalProperty(strRegressionID, transaction, "Location 1 Building 1", test);
			CommonMethods.NavigateToPage("General Liability",test);
			GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID, transaction, test);
			CommonMethods.NavigateToPage("Prem & Prod",test);
			GLPremAndProd.GL_PremAndProdPage(strRegressionID, transaction, test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		}
		
		//Convert QFR To Policy
		if(transactionsList.contains("ConvertQFRToPolicy")){
			String transaction = "ConvertQFRToPolicy";
			CommonMethods.NavigateTo("Commercial Package", test);
			CommonMethods.NavigateToPage("General Liability",test);
			GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID, transaction, test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		}
		
	} catch (Exception e) {
		e.printStackTrace();
		se.verify().verifyEquals("GL Detective CP test  failed", true, false);
		testTearDown(se);
	}
}
}
