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
import pw.pages.CIM.CIM_Locations;
import pw.pages.CIM.CIM_Main;
import pw.pages.CIM.CIM_ScheduledPropertyFloater;
import pw.pages.CIM.CIM_ScheduledPropertyFloaterOtherCoverages;
import pw.pages.COMMON.PW_BillingTab;
import pw.pages.COMMON.PW_CommonFun;
import pw.pages.COMMON.PW_CommonMethods;
import pw.pages.COMMON.PW_GenInfo;
import pw.pages.COMMON.PW_Home;
import pw.pages.COMMON.PW_KYTaxExemption;
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
import pw.pages.GL.GL_LiquorLiability;
import pw.pages.GL.GL_LiquorLiability_Classifications;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_MiscellaneousCoverage;
import pw.pages.GL.GL_OptionalProvisions;
import pw.pages.GL.GL_PremAndProd;
import pw.pages.GL.GL_SecuraManuscript;
import pw.pages.GL.GL_SpecialEvents;
import pw.pages.GL.GL_StateSpecificCoverages;
import pw.pages.GL.GeneralLiability;

public class BP7_KY_BPRegression extends BaseTest {
	
	ExtentReports extent;
	ExtentTest test;

	
	public static void KY_BPRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
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
		GL_StateSpecificCoverages GLStateSpecificCoveragesPage = TestPageFactory.initElements(se, GL_StateSpecificCoverages.class);
		GL_PremAndProd GLPremAndProdPage = TestPageFactory.initElements(se, GL_PremAndProd.class);
		GL_SpecialEvents GLSpecialEvents = TestPageFactory.initElements(se, GL_SpecialEvents.class);
		GL_Classifications GLClassificationsPage = TestPageFactory.initElements(se, GL_Classifications.class);
		GL_EmployeeBenefitsLiability GLEmployeeBenefitsLiability = TestPageFactory.initElements(se, GL_EmployeeBenefitsLiability.class);
		GL_LiquorLiability GLLiquorLiability = TestPageFactory.initElements(se, GL_LiquorLiability.class);
		GL_LiquorLiability_Classifications GLLiquorLiability_Classifications = TestPageFactory.initElements(se, GL_LiquorLiability_Classifications.class);
		GL_AdditionalInterest GLAdditionalInterestPage=TestPageFactory.initElements(se, GL_AdditionalInterest.class);
		GL_ExperienceRating GLExperienceRating = TestPageFactory.initElements(se, GL_ExperienceRating.class);
		GL_OptionalProvisions GLOptionalProvisionsPage = TestPageFactory.initElements(se, GL_OptionalProvisions.class);
		GL_SecuraManuscript GLSecuraManuscript = TestPageFactory.initElements(se, GL_SecuraManuscript.class);
		GL_MiscellaneousCoverage GLMiscellaneousCoverage = TestPageFactory.initElements(se, GL_MiscellaneousCoverage.class);
		CrimeAndFidelity_Main CrimeAndFidelity = TestPageFactory.initElements(se, CrimeAndFidelity_Main.class);
		CAF_Locations CAFLocations = TestPageFactory.initElements(se, CAF_Locations.class);
		CAF_InsuringAgreements CAFInsuringAgreements = TestPageFactory.initElements(se, CAF_InsuringAgreements.class);
		CAF_CrimeEndorsement CAFCrimeEndorsement = TestPageFactory.initElements(se, CAF_CrimeEndorsement.class);
		PW_KYTaxExemption PWKYTaxExemption = TestPageFactory.initElements(se, PW_KYTaxExemption.class); 
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		CP_Coverages CPCoverages = TestPageFactory.initElements(se, CP_Coverages.class);
		CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
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
				  //CP_AdditionalInterestPage.CP_AddInterest(strRegressionID, transaction,test); 
				  GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID,transaction,test);
				  GLLocationPage.GL_Location_Details(strRegressionID,transaction,test);
				  GLPremAndProdPage.GL_PremAndProdPage(strRegressionID,transaction,test);
				  GLClassificationsPage.GL_ClassificationsPage(strRegressionID,transaction,test);
				  CommonMethods.NavigateToNextScreen(test);
				  //GLAdditionalInterestPage.GL_AdditionalInterest_Details(strRegressionID,transaction,test);
				  GLOptionalProvisionsPage.CP_GLOptionalProvisions(strRegressionID,transaction,test);
				  GLExperienceRating.GLExperienceRatingPage(strRegressionID,transaction,test);
				  CrimeAndFidelity.CrimeAndFidelity_MainPage(strRegressionID, transaction, test);
				  CAFLocations.CAF_Locations_Details(strRegressionID, transaction, test);		
				  CAFInsuringAgreements.CAF_InsuringAgreementsPage(strRegressionID, transaction, test);
				  CommonMethods.NavigateToNextScreen(test);
				  CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
				  PWKYTaxExemption.KYTaxExemption(strRegressionID, transaction, test);
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
				//CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
				CommonMethods.NavigateTo("Business Protector Policy", test);
				//Commented below lines as part of script updates for DF-9945 issue as per Janis
				/*CommonMethods.NavigateTo("Commercial Property", test);
				CommercialPropertyPage.CommercialPropertyMethod(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Buildings (1)", test);
				BuildingsPage.BuildingDetails(strRegressionID, transaction,test);
				CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);*/
				CommonMethods.NavigateTo("General Liability", test);
				//Commented below lines as part of script updates for DF-9945 issue as per Janis
				/*GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Prem & Prod", test);
				CommonMethods.NavigateTo("Classifications (1)", test);
				GLClassificationsPage.GL_ClassificationsPage(strRegressionID,transaction,test);*/
				CommonMethods.NavigateTo("Additional Interest", test);
				GLAdditionalInterestPage.GL_AdditionalInterest_Details(strRegressionID,transaction,test);
				//Commented below lines as part of script updates for DF-9945 issue as per Janis
				/*CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
				CommonMethods.NavigateTo("Crime and Fidelity", test);
				CrimeAndFidelity.CrimeAndFidelity_MainPage(strRegressionID, transaction, test);*/
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
				CommonMethods.NavigateTo("Commercial Property", test);
				CommonMethods.NavigateTo("Locations (1)", test);
				CplocationsPage.Locations(strRegressionID, transaction, test);
				BuildingsPage.BuildingDetails(strRegressionID, transaction,test);
				CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
				CommonMethods.NavigateTo("General Liability", test);
				CommonMethods.NavigateTo("Locations (1)", test);
				GLLocationPage.GL_Location_Details(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Classifications (1)", test);
				GLClassificationsPage.GL_ClassificationsPage(strRegressionID,transaction,test);
				CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
				CommonMethods.NavigateTo("Crime and Fidelity", test);
				 CrimeAndFidelity.CrimeAndFidelity_MainPage(strRegressionID, transaction, test);
				CAFLocations.CAF_Locations_Details(strRegressionID, transaction, test);	
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				//CommonMethods.getDashboardForms(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				  
			}
			
			if(transactionsList.contains("ProRataEndorsement2")){ 
				String transaction = "ProRataEndorsement2";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				//CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
				CommonMethods.NavigateTo("Business Protector Policy", test);
				CommonMethods.NavigateTo("Commercial Property", test);
				CommercialPropertyPage.CommercialPropertyMethod(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Buildings (2)", test);
				CommonMethods.NavigateToPageContaingText("Loc 1 Bldg 1 - Lexington, KY", test);
				CommonMethods.NavigateTo("Building Coverage", test);
				CPCoverages.CP_BuildingCoveragePage(strRegressionID, transaction,"Location 1 Building 1", test);
				CommonMethods.NavigateTo("Ordinance or Law Coverage B & C", test);
				CPCoverages.CP_OrdinanceOrLawCoveragePage(strRegressionID, transaction,"Location 1 Building 1", test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				//CommonMethods.getDashboardForms(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				  
			}
			
			if(transactionsList.contains("ProRataEndorsementOOSE")){ 
				String transaction = "ProRataEndorsementOOSE";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				//CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
				CommonMethods.NavigateTo("Business Protector Policy", test);
				CommonMethods.NavigateTo("Commercial Property", test);
				CommercialPropertyPage.CommercialPropertyMethod(strRegressionID,transaction,test); 
				CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
				CommonMethods.NavigateTo("General Liability", test);
				GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Miscellaneous Coverages", test);
				GLMiscellaneousCoverage.CP_GLMiscellaneousCoverage(strRegressionID,transaction,test);
				CommonMethods.NavigateToNextScreen(test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				se.util().sleep(300000);
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
			  CommonMethods.NavigateTo("Buildings (2)", test);
			  CommonMethods.NavigateToPageContaingText("Loc 1 Bldg 1 - Lexington, KY", test);
			  CommonMethods.NavigateTo("Building Coverage", test);
			  CPCoverages.CP_BuildingCoveragePage(strRegressionID, transaction,"Location 1 Building 1", test);
			  CommonMethods.NavigateTo("Personal Property Coverage (1)", test);
			  CPCoverages.CP_BusinessPersonalProperty(strRegressionID, transaction,"Location 1 Building 1", test);
			  CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
			  CommonMethods.NavigateTo("Commercial Property", test);
			  CommonMethods.NavigateTo("Buildings (2)", test);
			  CommonMethods.NavigateToPageContaingText("Loc 2 Bldg 1 - Louisville, KY, 2115 S 5th St", test);
			  CommonMethods.NavigateTo("Personal Property Coverage (1)", test);
			  CPCoverages.CP_BusinessPersonalProperty(strRegressionID, transaction,"Location 2 Building 1", test);
			  CommonMethods.NavigateTo("General Liability", test);
			  GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID,transaction,test);
			  /*CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
			  CommonMethods.NavigateTo("General Liability", test); 
			 */ CommonMethods.NavigateTo("Prem & Prod", test);
			  GLPremAndProdPage.GL_PremAndProdPage(strRegressionID,transaction,test);
			  GLSpecialEvents.GL_SpecialEvents_Details(strRegressionID,transaction,test);
			  GLClassificationsPage.GL_ClassificationsPage(strRegressionID,transaction,test);
			  CommonMethods.NavigateTo("Experience Rating", test);	
			  GLExperienceRating.GLExperienceRatingPage(strRegressionID,transaction,test);
			// added below 3 lines as Workaround for DF-4070
				CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
				CommonMethods.NavigateTo("General Liability", test);
				CommonMethods.NavigateTo("Miscellaneous Coverages (1)",test);
			  GLMiscellaneousCoverage.CP_GLMiscellaneousCoverage(strRegressionID,transaction,test);
			  CommonMethods.getCalculatePremium(strRegressionID,transaction,test);	
			  PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			  CommonMethods.getDashboardForms(strRegressionID, transaction, test);
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
				se.verify().verifyEquals("KY_BPRegression test  failed", true, false);
				testTearDown(se);
			}
			
		
		}
	

}
