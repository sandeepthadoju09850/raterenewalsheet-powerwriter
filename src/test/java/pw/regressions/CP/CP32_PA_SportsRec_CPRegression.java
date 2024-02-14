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
import pw.pages.CIM.CIM_BoatAndMotorCoverages;
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
import pw.pages.COMMON.PW_ScheduleRatingIRPM;
import pw.pages.CP.CP_AdditionalInterest;
import pw.pages.CP.CP_BlanketInsurance;
import pw.pages.CP.CP_Buildings;
import pw.pages.CP.CP_CommercialPackage;
import pw.pages.CP.CP_CommercialProperty;
import pw.pages.CP.CP_Coverages;
import pw.pages.CP.CP_KeyEmployeeReplacementExpense;
import pw.pages.CP.CP_Locations;
import pw.pages.CS.CyberSecurity_Main;
import pw.pages.GL.GL_AbuseAndMolestation;
import pw.pages.GL.GL_AbuseAndMolestationClassification;
import pw.pages.GL.GL_AdditionalInterest;
import pw.pages.GL.GL_Classifications;
import pw.pages.GL.GL_EmployeeBenefitsLiability;
import pw.pages.GL.GL_ExperienceRating;
import pw.pages.GL.GL_InjuryToLeasedWorkers;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_MiscellaneousCoverage;
import pw.pages.GL.GL_OptionalProvisions;
import pw.pages.GL.GL_PremAndProd;
import pw.pages.GL.GL_ProfessionalLiabilityOccurance;
import pw.pages.GL.GL_SpecialityOption;
import pw.pages.GL.GeneralLiability;

public class CP32_PA_SportsRec_CPRegression extends BaseTest {
	ExtentReports extent;
	ExtentTest test;
	
	
	public static void PACPSportsRecMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
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
		CP_Coverages CPCoverages = TestPageFactory.initElements(se, CP_Coverages.class);
		CP_AdditionalInterest CP_AdditionalInterestPage = TestPageFactory.initElements(se, CP_AdditionalInterest.class);
		CP_KeyEmployeeReplacementExpense CPKeyEmployeeReplacementExpense = TestPageFactory.initElements(se, CP_KeyEmployeeReplacementExpense.class);
				
		GeneralLiability GeneralLiabilityPage = TestPageFactory.initElements(se, GeneralLiability.class);
		GL_Location GLLocationPage = TestPageFactory.initElements(se, GL_Location.class);
		GL_PremAndProd GLPremAndProdPage = TestPageFactory.initElements(se, GL_PremAndProd.class);
		GL_Classifications GLClassificationsPage = TestPageFactory.initElements(se, GL_Classifications.class);
		GL_EmployeeBenefitsLiability GLEmployeeBenefitsLiabilityPage = TestPageFactory.initElements(se, GL_EmployeeBenefitsLiability.class);
		GL_SpecialityOption GLSpecialityOptionPage=TestPageFactory.initElements(se, GL_SpecialityOption.class);
		GL_AbuseAndMolestation GL_AbuseAndMolestationPage = TestPageFactory.initElements(se,
				GL_AbuseAndMolestation.class);
		GL_AbuseAndMolestationClassification GL_AbuseAndMolestationClassificationPage = TestPageFactory.initElements(se,
				GL_AbuseAndMolestationClassification.class);
		GL_ProfessionalLiabilityOccurance GLProfessionalLiabilityOccurance = TestPageFactory.initElements(se, GL_ProfessionalLiabilityOccurance.class);
		GL_AdditionalInterest GLAdditionalInterestPage=TestPageFactory.initElements(se, GL_AdditionalInterest.class);
		GL_ExperienceRating GLExperienceRating = TestPageFactory.initElements(se, GL_ExperienceRating.class);
		GL_MiscellaneousCoverage GLMiscellaneousCoverage = TestPageFactory.initElements(se, GL_MiscellaneousCoverage.class);
		GL_OptionalProvisions GLOptionalProvisionsPage = TestPageFactory.initElements(se, GL_OptionalProvisions.class);
				
		CIM_Main CIMMainPage = TestPageFactory.initElements(se, CIM_Main.class);
		CIM_Locations CIMLocationsPage = TestPageFactory.initElements(se, CIM_Locations.class);
		CIM_Buildings CIMBuildingsPage = TestPageFactory.initElements(se, CIM_Buildings.class);
		CIM_BoatAndMotorCoverages CIM_BoatAndMotorCoveragesPage = TestPageFactory.initElements(se, CIM_BoatAndMotorCoverages.class);
		
		CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
		PW_ScheduleRatingIRPM ScheduleRatingIRPMPage = TestPageFactory.initElements(se, PW_ScheduleRatingIRPM.class);
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
			CplocationsPage.Locations(strRegressionID, transaction, test);
			BuildingsPage.BuildingDetails(strRegressionID, transaction,test);
			CommonMethods.NavigateToNextScreen(test);
			CP_AdditionalInterestPage.CP_AddInterest(strRegressionID, transaction,test); 
			CPKeyEmployeeReplacementExpense.CP_KeyEmployeePage(strRegressionID, transaction, test);
			CommonMethods.NavigateTo("General Liability",test);
			GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID,transaction,test);
			GLLocationPage.GL_Location_Details(strRegressionID,transaction,test);
			GLPremAndProdPage.GL_PremAndProdPage(strRegressionID,transaction,test);
			GLClassificationsPage.GL_ClassificationsPage(strRegressionID,transaction,test);
			GLEmployeeBenefitsLiabilityPage.GL_EmployeeBenefitsLiability_Details(strRegressionID,transaction,test);
			GLSpecialityOptionPage.GL_SpecialityOption_Details(strRegressionID, transaction, test);
			GL_AbuseAndMolestationPage.GL_AbuseAndMolestationMethod(strRegressionID, transaction, test);
			GL_AbuseAndMolestationClassificationPage.GL_AbuseAndMolestationClassificationMethod(strRegressionID,
					transaction, test);
			GLProfessionalLiabilityOccurance.GL_ProfessionalLiabilityOccurance_Details(strRegressionID, transaction, test);
			GLAdditionalInterestPage.GL_AdditionalInterest_Details(strRegressionID, transaction, test);
			GLOptionalProvisionsPage.CP_GLOptionalProvisions(strRegressionID,transaction,test);
			GLMiscellaneousCoverage.CP_GLMiscellaneousCoverage(strRegressionID,transaction,test);
			GLExperienceRating.GLExperienceRatingPage(strRegressionID, transaction, test);
			CommonMethods.NavigateTo("Commercial Inland Marine", test);
			CIMMainPage.CIM_Main(strRegressionID,transaction,test);
			CIMLocationsPage.CIM_Locations(strRegressionID,transaction,test);
			CIMBuildingsPage.CIM_Buildings(strRegressionID,transaction,test);
			CIM_BoatAndMotorCoveragesPage.BoatAndMotorCoverages(strRegressionID, transaction, test);
						
			CommonMethods.NavigateToNextScreen(test);
			CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
			//PW_ScheduleRatingIRPM ScheduleRatingIRPM = TestPageFactory.initElements(se, PW_ScheduleRatingIRPM.class);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
 			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
			CommonMethods.getDashboardForms(strRegressionID,transaction,test);
			//CommonMethods.getDashboardSupplementaryInfo(strRegressionID,transaction,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			
			//Revise Quote
			if(transactionsList.contains("ReviseQuote")){
				String transaction = "ReviseQuote";
				CommonMethods.NavigateTo("Schedule Rating/IRPM",test);
				ScheduleRatingIRPMPage.ScheduleRatingIRPM(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
	 			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			
			//Convert To Policy
			if(transactionsList.contains("ConvertToPolicy")){
				String transaction = "ConvertToPolicy";
				//QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
	 			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}

			
			// ProRataEndorsement1
			if (transactionsList.contains("ProRataEndorsement1")) {
				String transaction = "ProRataEndorsement1";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Package",test);
				CommonMethods.NavigateTo("Commercial Property", test);
				CommonMethods.NavigateToPageBasedOnOccurence("Buildings (1)","1",test);
				//CommonMethods.NavigateTo("Buildings (1)", test);
				//CommonMethods.NavigateToPageContaingText("Loc 1 Bldg 1", test);
				//CommonMethods.NavigateToNextScreen(test);
				//CommonMethods.NavigateTo("Building Coverage", test);
				BuildingsPage.BuildingDetails(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("General Liability",test);
				GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				//CommonMethods.getDashboardForms(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}
						
						
			//Reverse Endorsement
			if (transactionsList.contains("ReverseEndorsement1")) {
				String transaction = "ReverseEndorsement1";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			} 

						
			//QFR
			if(transactionsList.contains("QuoteForRenewal")){
				String transaction = "QuoteForRenewal";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Package", test);
				CommonMethods.NavigateTo("Commercial Property", test);
				CommonMethods.NavigateTo("Buildings (1)", test);
				CommonMethods.NavigateToPageContaingText("Loc 1 Bldg 1",test);
				CommonMethods.NavigateToPageContaingText("Personal Property Coverage",test);
				CPCoverages.CP_BusinessPersonalProperty(strRegressionID, transaction,"Location 1 Building 1", test);
				CommonMethods.NavigateTo("Peak Season Coverage (1)", test);
				CPCoverages.CP_PeakSeasonCoveragePage(strRegressionID, transaction,"Location 1 Building 1", test);
				
				
				CommonMethods.NavigateTo("General Liability",test);
				CommonMethods.NavigateTo("Prem & Prod",test);
				CommonMethods.NavigateTo("Classifications (2)",test);
				GLClassificationsPage.GL_ClassificationsPage(strRegressionID,transaction,test);
				
				CommonMethods.CollapseAllAndNavigateTo("Commercial Package", "20-CP", test);
				CommonMethods.NavigateTo("Commercial Inland Marine", test);
				CommonMethods.NavigateTo("Boat And Motor Coverage (3)",test);
				CIM_BoatAndMotorCoveragesPage.BoatAndMotorCoverages(strRegressionID, transaction, test);
								
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
			
			
			//Cancellation
			if(transactionsList.contains("Cancellation")){
				String transaction = "Cancellation";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			
			//Reinstatement
			if(transactionsList.contains("Reinstatement")){
				String transaction = "Reinstatement";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
		
			
		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("PACPSportsRecRegression test  failed", true, false);
			testTearDown(se);
		}
	}

}
