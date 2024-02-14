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
import pw.Constants.constants;
import pw.pages.CAF.CAF_CrimeEndorsement;
import pw.pages.CAF.CAF_InsuringAgreements;
import pw.pages.CAF.CAF_Locations;
import pw.pages.CAF.CrimeAndFidelity_Main;
import pw.pages.CIM.CIM_AccountsRecievable;
import pw.pages.CIM.CIM_Buildings;
import pw.pages.CIM.CIM_ComputerCoverage;
import pw.pages.CIM.CIM_ComputerLocationAndLimits;
import pw.pages.CIM.CIM_ContractorsEquipment;
import pw.pages.CIM.CIM_ContractorsOtherCoverages;
import pw.pages.CIM.CIM_Locations;
import pw.pages.CIM.CIM_Main;
import pw.pages.CIM.CIM_SecuraManuscript;
import pw.pages.COMMON.PW_BillingTab;
import pw.pages.COMMON.PW_CommonFun;
import pw.pages.COMMON.PW_CommonMethods;
import pw.pages.COMMON.PW_GenInfo;
import pw.pages.COMMON.PW_Home;
import pw.pages.COMMON.PW_Login;
import pw.pages.COMMON.PW_PremiumSummary;
import pw.pages.COMMON.PW_Producers;
import pw.pages.CP.CP_CommercialPackage;
import pw.pages.CP.CP_MNFireSafetySurcharge;
import pw.pages.CS.CyberSecurity_Main;
import pw.pages.GL.GL_AdditionalInterest;
import pw.pages.GL.GL_Classifications;
import pw.pages.GL.GL_EmployeeBenefitsLiability;
import pw.pages.GL.GL_ExperienceRating;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_OptionalProvisions;
import pw.pages.GL.GL_PremAndProd;
import pw.pages.GL.GeneralLiability;
import pw.pages.PLCM.CP_ProfessionalLiabilityClaims;

public class CP9_MN_CPRegression extends BaseTest {
	ExtentReports extent;
	ExtentTest test;
	public static void MNCPRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params, String strRegressionID,File file,XSSFWorkbook workbook,ExtentTest test) throws IOException {
		

		PW_Login LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
		PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
		CP_CommercialPackage CommercialPackage =  TestPageFactory.initElements(se, CP_CommercialPackage.class);
		GeneralLiability GeneralLiabilityPage = TestPageFactory.initElements(se, GeneralLiability.class);
		GL_Location GLLocations = TestPageFactory.initElements(se, GL_Location.class);
		GL_PremAndProd GLPremAndProd = TestPageFactory.initElements(se, GL_PremAndProd.class);
		GL_Classifications GLClassifications = TestPageFactory.initElements(se, GL_Classifications.class);
		GL_AdditionalInterest GLAdditionalInterest = TestPageFactory.initElements(se, GL_AdditionalInterest.class);
		GL_OptionalProvisions GLOptionalProvisions = TestPageFactory.initElements(se, GL_OptionalProvisions.class);
		GL_ExperienceRating GLExperienceRating = TestPageFactory.initElements(se, GL_ExperienceRating.class);
		CrimeAndFidelity_Main CrimeAndFidelity_MainPage = TestPageFactory.initElements(se, CrimeAndFidelity_Main.class);
		CAF_Locations CAF_LocationsPage =TestPageFactory.initElements(se, CAF_Locations.class);
		CAF_InsuringAgreements CAF_InsuringAgreementsPage =TestPageFactory.initElements(se, CAF_InsuringAgreements.class);
		CAF_CrimeEndorsement Crime_EndorsementsPage =TestPageFactory.initElements(se, CAF_CrimeEndorsement.class);
		CIM_Main CommercialInlandMarinePage =  TestPageFactory.initElements(se, CIM_Main.class);
		CIM_Locations CIMLocationsPage = TestPageFactory.initElements(se, CIM_Locations.class);
		CIM_Buildings CIMBuildingsPage = TestPageFactory.initElements(se, CIM_Buildings.class);
		CIM_AccountsRecievable CIM_AccountsRecievablePage = TestPageFactory.initElements(se, CIM_AccountsRecievable.class);
		CIM_ComputerLocationAndLimits CIM_ComputerLocationAndLimitsPage = TestPageFactory.initElements(se, CIM_ComputerLocationAndLimits.class);
		CIM_ComputerCoverage  CIM_ComputerCoveragePage = TestPageFactory.initElements(se, CIM_ComputerCoverage.class);
		CIM_ContractorsEquipment ContractorsEquipment = TestPageFactory.initElements(se, CIM_ContractorsEquipment.class);
		CIM_ContractorsOtherCoverages ContractorsOtherCoverages = TestPageFactory.initElements(se, CIM_ContractorsOtherCoverages.class);
		CIM_SecuraManuscript CIMSecuraManuscript = TestPageFactory.initElements(se, CIM_SecuraManuscript.class);
		CP_ProfessionalLiabilityClaims ProfessionalLiabilityClaims = TestPageFactory.initElements(se, CP_ProfessionalLiabilityClaims.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		GL_EmployeeBenefitsLiability GL_EmployeeBenefitsLiability = TestPageFactory.initElements(se, GL_EmployeeBenefitsLiability.class);
		CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
		CP_MNFireSafetySurcharge CPMNFireSafetySurcharge = TestPageFactory.initElements(se, CP_MNFireSafetySurcharge.class);
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
				WelcomePage.homePage(strRegressionID,transaction, test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				ProducerPage.AddProducers(strRegressionID,transaction,test);
				CommonMethods.NavigateToPage("Commercial Package",test);
				cyberChkY =CommercialPackage.CommercialPackage(strRegressionID,transaction,test);
				GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID, transaction, test);
				GLLocations.GL_Location_Details(strRegressionID, transaction, test);
				GLPremAndProd.GL_PremAndProdPage(strRegressionID, transaction, test);
				GLClassifications.GL_ClassificationsPage(strRegressionID, transaction, test);
				//CommonMethods.NavigateToPage("Additional Interest",test);
				CommonMethods.NavigateToNextScreen(test);
				GLAdditionalInterest.GL_AdditionalInterest_Details(strRegressionID, transaction, test);
				GLOptionalProvisions.CP_GLOptionalProvisions(strRegressionID, transaction, test);
				GLExperienceRating.GLExperienceRatingPage(strRegressionID, transaction, test);
				CrimeAndFidelity_MainPage.CrimeAndFidelity_MainPage(strRegressionID,transaction,test);
				CAF_LocationsPage.CAF_Locations_Details(strRegressionID,transaction,test);
				CAF_InsuringAgreementsPage.CAF_InsuringAgreementsPage(strRegressionID,transaction,test);
				Crime_EndorsementsPage.CAF_CrimeEndorsementMethod(strRegressionID,transaction,test);
				CommercialInlandMarinePage.CIM_Main(strRegressionID, transaction, test);
				CIMLocationsPage.CIM_Locations(strRegressionID, transaction, test);
				CIMBuildingsPage.CIM_Buildings(strRegressionID, transaction, test);
				CIM_AccountsRecievablePage.CIMAccountsRecievable(strRegressionID, transaction, test);
				CIM_ComputerLocationAndLimitsPage.ComputerLocationAndLimits(strRegressionID, transaction, test);
				CIM_ComputerCoveragePage.CIMComputerCoverage(strRegressionID, transaction, test);
				ContractorsEquipment.ContractorsEquipment(strRegressionID, transaction, test);
				ContractorsOtherCoverages.CIMContractorsOtherCoverages(strRegressionID, transaction, test);
				CIMSecuraManuscript.CP_CIMSecuraManuscript(strRegressionID, transaction, test);
				CommonMethods.CollapseAllAndNavigateTo("Commercial Package","20-CP",test);
				CommonMethods.NavigateTo("Commercial Package",test);
				CommonMethods.NavigateTo("Professional Liability Claims-Made",test);
				ProfessionalLiabilityClaims.CP_ProfessionalLiabilityClaimsPage(strRegressionID, transaction, test);
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
			    String transaction ="ConvertToPolicy";
			    CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			    PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			    CommonMethods.getDashboardActions(strRegressionID,transaction,test); }
			 
			//FlatEndorsement1
				if(transactionsList.contains("FlatEndorsement1")){
				String transaction = "FlatEndorsement1";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateToPage("General Liability",test);
				GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID, transaction, test);
				CommonMethods.NavigateToPage("Emp Benefits Liab", test);
				GL_EmployeeBenefitsLiability.GL_EmployeeBenefitsLiability_Details(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				//CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
					 
				
				}
				
			//Quote For Renewal
				if(transactionsList.contains("QuoteForRenewal")){
				String transaction = "QuoteForRenewal";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.CollapseAllAndNavigateTo("Commercial Package","20-CP",test);
				CommonMethods.NavigateTo("General Liability",test);
				GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Experience Rating",test);
				GLExperienceRating.GLExperienceRatingPage(strRegressionID, transaction, test);
				CrimeAndFidelity_MainPage.CrimeAndFidelity_MainPage(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Inland Marine", test);
				CommercialInlandMarinePage.CIM_Main(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Cyber Security", test);
				CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
					 
			}
				
				//ConvertQFRToPolicy
				if(transactionsList.contains("ConvertQFRToPolicy")){
				String transaction = "ConvertQFRToPolicy";
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);	
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				
				}
		}catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("MN CP Regression test failed", true, false);
			testTearDown(se);
		}
	}
	}
	
