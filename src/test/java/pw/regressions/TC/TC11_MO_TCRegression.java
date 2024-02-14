package pw.regressions.TC;

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
import pw.pages.CIM.CIM_ContractorsEquipment;
import pw.pages.CIM.CIM_ContractorsOtherCoverages;
import pw.pages.CIM.CIM_ContractorsScheduledEquipment;
import pw.pages.CIM.CIM_Locations;
import pw.pages.CIM.CIM_Main;
import pw.pages.CIM.CIM_Signs;
import pw.pages.COMMON.PW_BillingTab;
import pw.pages.COMMON.PW_CommonFun;
import pw.pages.COMMON.PW_CommonMethods;
import pw.pages.COMMON.PW_GenInfo;
import pw.pages.COMMON.PW_Home;
import pw.pages.COMMON.PW_Login;
import pw.pages.COMMON.PW_PremiumSummary;
import pw.pages.COMMON.PW_Producers;
import pw.pages.CP.CP_Buildings;
import pw.pages.CP.CP_CommercialPackage;
import pw.pages.CP.CP_CommercialProperty;
import pw.pages.CP.CP_Coverages;
import pw.pages.CP.CP_Locations;
import pw.pages.CS.CyberSecurity_Main;
import pw.pages.DO.CP_DirectorsAndOfficers;
import pw.pages.DO.DAndO_SecuraManuscript;
import pw.pages.GL.GL_AdditionalInterest;
import pw.pages.GL.GL_Classifications;
import pw.pages.GL.GL_EmployeeBenefitsLiability;
import pw.pages.GL.GL_ExperienceRating;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_OptionalProvisions;
import pw.pages.GL.GL_PremAndProd;
import pw.pages.GL.GL_StateSpecificCoverages;
import pw.pages.GL.GeneralLiability;

public class TC11_MO_TCRegression extends BaseTest {
	ExtentReports extent;
	ExtentTest test;

	
	public static void MO_TCRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login  LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
		PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
		CP_CommercialPackage CommercialPackage =  TestPageFactory.initElements(se, CP_CommercialPackage.class);
		CP_CommercialProperty CommercialPropertyPage = TestPageFactory.initElements(se, CP_CommercialProperty.class);
		CP_Locations CplocationsPage = TestPageFactory.initElements(se, CP_Locations.class);
		CP_Buildings BuildingsPage = TestPageFactory.initElements(se, CP_Buildings.class);
		CP_Coverages CPCoverages = TestPageFactory.initElements(se, CP_Coverages.class);
		GeneralLiability GeneralLiabilityPage = TestPageFactory.initElements(se, GeneralLiability.class);
		GL_Location GLLocationPage = TestPageFactory.initElements(se, GL_Location.class);
		GL_PremAndProd GLPremAndProdPage = TestPageFactory.initElements(se, GL_PremAndProd.class);
		GL_Classifications GLClassificationsPage = TestPageFactory.initElements(se, GL_Classifications.class);
		GL_AdditionalInterest GLAdditionalInterestPage=TestPageFactory.initElements(se, GL_AdditionalInterest.class);
		GL_ExperienceRating GLExperienceRating = TestPageFactory.initElements(se, GL_ExperienceRating.class);
		GL_OptionalProvisions GLOptionalProvisionsPage = TestPageFactory.initElements(se, GL_OptionalProvisions.class);
		GL_EmployeeBenefitsLiability GLEmployeeBenefitsLiabilityPage = TestPageFactory.initElements(se, GL_EmployeeBenefitsLiability.class);
		GL_StateSpecificCoverages GLStateSpecificCoveragesPage = TestPageFactory.initElements(se, GL_StateSpecificCoverages.class);
		CrimeAndFidelity_Main CrimeAndFidelity_MainPage = TestPageFactory.initElements(se, CrimeAndFidelity_Main.class);
		CAF_Locations CAF_LocationsPage =TestPageFactory.initElements(se, CAF_Locations.class);
		CAF_InsuringAgreements CAF_InsuringAgreementsPage =TestPageFactory.initElements(se, CAF_InsuringAgreements.class);
		CAF_CrimeEndorsement Crime_EndorsementsPage =TestPageFactory.initElements(se, CAF_CrimeEndorsement.class);
		CIM_Main CIMMainPage = TestPageFactory.initElements(se, CIM_Main.class);
		CIM_Locations CIMLocationsPage = TestPageFactory.initElements(se, CIM_Locations.class);
		CIM_Signs CIMSignsPage = TestPageFactory.initElements(se, CIM_Signs.class);
		CIM_ContractorsOtherCoverages CIMContractorsOtherCoverages = TestPageFactory.initElements(se, CIM_ContractorsOtherCoverages.class);
		CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		CP_DirectorsAndOfficers DirectorsAndOfficersPage = TestPageFactory.initElements(se, CP_DirectorsAndOfficers.class);
		DAndO_SecuraManuscript SecuraManuscriptPage = TestPageFactory.initElements(se, DAndO_SecuraManuscript.class);
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
				CommonMethods.NavigateToNextScreen(test);
				String cyberChkY = CommercialPackage.CommercialPackage(strRegressionID,transaction, test);
				CommercialPropertyPage.CommercialPropertyMethod(strRegressionID,transaction,test);
				CplocationsPage.Locations(strRegressionID, transaction, test);
				BuildingsPage.BuildingDetails(strRegressionID, transaction,test);
				CommonMethods.CollapseAllAndNavigateTo("Target Contractor Protector", "20-TC", test);
				CommonMethods.NavigateTo("General Liability", test);
				GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID, transaction, test);
				GLLocationPage.GL_Location_Details(strRegressionID, transaction, test);
				GLStateSpecificCoveragesPage.GL_StateCoveragesPage(strRegressionID,transaction,test);
				GLPremAndProdPage.GL_PremAndProdPage(strRegressionID, transaction, test);
				GLClassificationsPage.GL_ClassificationsPage(strRegressionID, transaction, test);
				GLAdditionalInterestPage.GL_AdditionalInterest_Details(strRegressionID, transaction, test);
				GLOptionalProvisionsPage.CP_GLOptionalProvisions(strRegressionID, transaction, test);
				GLExperienceRating.GLExperienceRatingPage(strRegressionID, transaction, test);
				CrimeAndFidelity_MainPage.CrimeAndFidelity_MainPage(strRegressionID, transaction, test);
				CAF_LocationsPage.CAF_Locations_Details(strRegressionID, transaction, test);
				CAF_InsuringAgreementsPage.CAF_InsuringAgreementsPage(strRegressionID, transaction, test);
				Crime_EndorsementsPage.CAF_CrimeEndorsementMethod(strRegressionID, transaction, test);
				CIMMainPage.CIM_Main(strRegressionID, transaction, test);
				CIMLocationsPage.CIM_Locations(strRegressionID, transaction, test);
				CommonMethods.NavigateToNextScreen(test);
				CIMContractorsOtherCoverages.CIMContractorsOtherCoverages(strRegressionID, transaction, test);
				CIMSignsPage.CIMSigns(strRegressionID,transaction,test);
				CommonMethods.NavigateToNextScreen(test);
				DirectorsAndOfficersPage.CP_DOMainPage(strRegressionID, transaction, test);
				SecuraManuscriptPage.CP_DAndOSecuraManuscript(strRegressionID, transaction, test);
				CommonMethods.CollapseAllAndNavigateTo("Target Contractor Protector", "20-TC", test);
				CommonMethods.NavigateTo("Cyber Security", test);
				CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				BillingTab.getUpdateBillingTab(strRegressionID, transaction, test);
				//CommonMethods.getDashboardForms(strRegressionID, transaction, test);
				//CommonMethods.getDashboardSupplementaryInfo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}	
				// Convert To Policy
				if (transactionsList.contains("ConvertToPolicy")) {
					String transaction = "ConvertToPolicy";
					QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
					CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
					PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
					CommonMethods.getDashboardActions(strRegressionID, transaction, test);
				}
								
				//Pro Rata Endorsement
				if(transactionsList.contains("ProRataEndorsement1")){
					String transaction = "ProRataEndorsement1";
					QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
					CommonMethods.NavigateTo("Target Contractor Protector",test);
					CommonMethods.NavigateTo("General Liability", test);
					GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID, transaction, test);
					CommonMethods.NavigateTo("Emp Benefits Liab",test);
					GLEmployeeBenefitsLiabilityPage.GL_EmployeeBenefitsLiability_Details(strRegressionID, transaction,test);
					CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
					PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
					//CommonMethods.getDashboardForms(strRegressionID, transaction, test);
					CommonMethods.getDashboardActions(strRegressionID, transaction, test);
					
				}
				//Pro Rata Endorsement2
				if(transactionsList.contains("ProRataEndorsement2")){
					String transaction = "ProRataEndorsement2";
					
					QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
					CommonMethods.NavigateTo("Target Contractor Protector",test);
					CommonMethods.NavigateTo("Commercial Property", test);
					CommonMethods.NavigateTo("Buildings (1)", test);
					CommonMethods.NavigateToPageContaingText("Loc 1 Bldg 1",test);
					CommonMethods.NavigateToPageContaingText("Personal Property Coverage",test);
					CPCoverages.CP_BusinessPersonalProperty(strRegressionID, transaction,"Location 1 Building 1", test);
					CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
					PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
					//CommonMethods.getDashboardForms(strRegressionID, transaction, test);
					CommonMethods.getDashboardActions(strRegressionID, transaction, test);
				}
				
				if(transactionsList.contains("EndorsementOOSE")){ 
					String transaction = "EndorsementOOSE";
					QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
					CommonMethods.NavigateTo("Target Contractor Protector",test);
					CommonMethods.NavigateTo("General Liability", test);
					CommonMethods.NavigateTo("Additional Interest (2)", test);
					GLAdditionalInterestPage.GL_AdditionalInterest_Details(strRegressionID, transaction, test);
					CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
					PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
					CommonMethods.getDashboardForms(strRegressionID, transaction, test);
					CommonMethods.getDashboardActions(strRegressionID,transaction,test);
					  
				}
				
				// QuoteForRenewal
				if (transactionsList.contains("QuoteForRenewal")) {
					String transaction = "QuoteForRenewal";
					QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
					CommonMethods.NavigateToPage("Target Contractor Protector",test);
					CommonMethods.NavigateToPage("Commercial Property", test);
					CommercialPropertyPage.CommercialPropertyMethod(strRegressionID, transaction, test);
					CommonMethods.NavigateTo("General Liability", test);
					GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID, transaction, test);
					CommonMethods.CollapseAllAndNavigateTo("Target Contractor Protector", "20-TC", test);
					CommonMethods.NavigateTo("Commercial Inland Marine",test);
					CommonMethods.NavigateTo("Signs (1)",test);
					CIMSignsPage.CIMSigns(strRegressionID, transaction, test);
					CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
					PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
					CommonMethods.getDashboardActions(strRegressionID, transaction, test);
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
					se.verify().verifyEquals("MO TC Regression test failed", true, false);
					testTearDown(se);
				}
				
			
			}

	}
