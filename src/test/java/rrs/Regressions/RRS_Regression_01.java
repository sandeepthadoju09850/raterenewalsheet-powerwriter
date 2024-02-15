package rrs.Regressions;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
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
import pw.pages.CA.CA_ScheduleRating;
import pw.pages.CAF.CAF_CrimeEndorsement;
import pw.pages.CAF.CAF_InsuringAgreements;
import pw.pages.CAF.CAF_Locations;
import pw.pages.CAF.CrimeAndFidelity_Main;
import pw.pages.CIM.CIM_FineArtsFloater;
import pw.pages.CIM.CIM_FineArtsFloater_OtherCoverages;
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
import pw.pages.COMMON.PW_ScheduleRatingIRPM;
import pw.pages.CP.CP_Buildings;
import pw.pages.CP.CP_CommercialPackage;
import pw.pages.CP.CP_CommercialProperty;
import pw.pages.CP.CP_Coverages;
import pw.pages.CP.CP_ElectronicCommerce;
import pw.pages.CP.CP_FloodCoveragePage;
import pw.pages.CP.CP_KeyEmployeeReplacementExpense;
import pw.pages.CP.CP_Locations;
import pw.pages.CP.CP_Terrorism;
import pw.pages.CS.CyberSecurity_Main;
import pw.pages.DO.CP_DirectorsAndOfficers;
import pw.pages.GL.GL_Classifications;
import pw.pages.GL.GL_EmployeeBenefitsLiability;
import pw.pages.GL.GL_ExperienceRating;
import pw.pages.GL.GL_LiquorLiability;
import pw.pages.GL.GL_LiquorLiability_Classifications;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_OptionalProvisions;
import pw.pages.GL.GL_PremAndProd;
import pw.pages.GL.GeneralLiability;
import pw.pages.PLCM.CP_ProfessionalLiabilityClaims;
import pw.pages.PLCM.ProfLiab_MiscellaneousCoverage;
import pw.pages.WC.WC_ScheduleRating;
import pw.pages.WC.WC_WCRatingPeriod;
import rrs.pages.MainScreen.RateRenewalSheet;
import rrs.pages.MainScreen.PWQuoteOpen;
import rrs.pages.MainScreen.PWValidations;

public class RRS_Regression_01 extends BaseTest {
	ExtentReports extent;
	ExtentTest test;
	

	
	public static void RRS_RegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login  LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
		PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
		CP_CommercialPackage CommercialPackage =  TestPageFactory.initElements(se, CP_CommercialPackage.class);
		CP_CommercialProperty CommercialPropertyPage = TestPageFactory.initElements(se, CP_CommercialProperty.class);
		CP_FloodCoveragePage CP_FloodCoveragepage = TestPageFactory.initElements(se, CP_FloodCoveragePage.class);
		CP_ElectronicCommerce CP_ElectronicCommercepage = TestPageFactory.initElements(se, CP_ElectronicCommerce.class);
		CP_Locations CplocationsPage = TestPageFactory.initElements(se, CP_Locations.class);
		CP_Buildings BuildingsPage = TestPageFactory.initElements(se, CP_Buildings.class);
		CP_Coverages CPCoverages = TestPageFactory.initElements(se, CP_Coverages.class);
		CP_Terrorism CP_Terrorismpage = TestPageFactory.initElements(se, CP_Terrorism.class);
		CP_KeyEmployeeReplacementExpense CPKeyEmployeeReplacementExpense = TestPageFactory.initElements(se, CP_KeyEmployeeReplacementExpense.class);
		GeneralLiability GeneralLiabilityPage = TestPageFactory.initElements(se, GeneralLiability.class);
		GL_Location GLLocationPage = TestPageFactory.initElements(se, GL_Location.class);
		GL_PremAndProd GLPremAndProdPage = TestPageFactory.initElements(se, GL_PremAndProd.class);
		GL_Classifications GLClassificationsPage = TestPageFactory.initElements(se, GL_Classifications.class);
		GL_EmployeeBenefitsLiability GLEmployeeBenefitsLiabilityPage = TestPageFactory.initElements(se, GL_EmployeeBenefitsLiability.class);
		GL_ExperienceRating GLExperienceRating = TestPageFactory.initElements(se, GL_ExperienceRating.class);
		GL_OptionalProvisions GLOptionalProvisionsPage = TestPageFactory.initElements(se, GL_OptionalProvisions.class);
		CrimeAndFidelity_Main CrimeAndFidelity_MainPage = TestPageFactory.initElements(se, CrimeAndFidelity_Main.class);
		CAF_Locations CAF_LocationsPage =TestPageFactory.initElements(se, CAF_Locations.class);
		CAF_InsuringAgreements CAF_InsuringAgreementsPage =TestPageFactory.initElements(se, CAF_InsuringAgreements.class);
		CAF_CrimeEndorsement Crime_EndorsementsPage =TestPageFactory.initElements(se, CAF_CrimeEndorsement.class);
		CIM_Main CIMMainPage = TestPageFactory.initElements(se, CIM_Main.class);
		CIM_Locations CIMLocationsPage = TestPageFactory.initElements(se, CIM_Locations.class);
		CIM_FineArtsFloater CIMFineArtsFloaterPage = TestPageFactory.initElements(se, CIM_FineArtsFloater.class);
		CIM_FineArtsFloater_OtherCoverages CIMFineArtsFloaterOtherCoveragesPage = TestPageFactory.initElements(se, CIM_FineArtsFloater_OtherCoverages.class);
		CIM_Signs CIMSignsPage = TestPageFactory.initElements(se, CIM_Signs.class);
		PW_ScheduleRatingIRPM ScheduleRatingIRPMPage = TestPageFactory.initElements(se, PW_ScheduleRatingIRPM.class);
		CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);
		GL_LiquorLiability_Classifications GLLiquorLiabilityClassificationsPage=TestPageFactory.initElements(se, GL_LiquorLiability_Classifications.class);
		GL_LiquorLiability GLLiquorLiabilityPage=TestPageFactory.initElements(se, GL_LiquorLiability.class);
		CP_DirectorsAndOfficers DirectorsAndOfficersPage = TestPageFactory.initElements(se, CP_DirectorsAndOfficers.class);
		CP_ProfessionalLiabilityClaims ProfessionalLiabilityClaims  = TestPageFactory.initElements(se, CP_ProfessionalLiabilityClaims.class);
		ProfLiab_MiscellaneousCoverage ProfLiab_MiscellaneousCoveragePage = TestPageFactory.initElements(se, ProfLiab_MiscellaneousCoverage.class);
		CA_ScheduleRating CA_ScheduleRatingPage = TestPageFactory.initElements(se, CA_ScheduleRating.class);
		RateRenewalSheet RateRenewalSheet = TestPageFactory.initElements(se, RateRenewalSheet.class);
		PWValidations PWValidationsPage = TestPageFactory.initElements(se, PWValidations.class);
		PWQuoteOpen PWQuoteOpenPage = TestPageFactory.initElements(se, PWQuoteOpen.class);
		WC_WCRatingPeriod WC_WCRatingPeriodPage = TestPageFactory.initElements(se, WC_WCRatingPeriod.class);
		WC_ScheduleRating ScheduleRating = TestPageFactory.initElements(se, WC_ScheduleRating.class);
		
		try {
			List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
			LinkedHashMap<String, String> QFR= new LinkedHashMap<String, String>();
			LinkedHashMap<String, String> CurrentTermPremiums= new LinkedHashMap<String, String>();
			LinkedHashMap<String, String> CurrentTermPremiumsCA= new LinkedHashMap<String, String>();
			LinkedHashMap<String, String> CurrentTermPremiumsWC= new LinkedHashMap<String, String>();
			LinkedHashMap<String, String> CurrentTermPremiumsUM= new LinkedHashMap<String, String>();
			LinkedHashMap<String, String> QFRPremiumsCA= new LinkedHashMap<String, String>();
			LinkedHashMap<String, String> QFRPremiumsWC= new LinkedHashMap<String, String>();
			LinkedHashMap<String, String> QFRPremiumsUM= new LinkedHashMap<String, String>();
			LinkedHashMap<String, String> NewQFRPremium= new LinkedHashMap<String, String>();
			LinkedHashMap<String, String> NewQFRPremiumCA= new LinkedHashMap<String, String>();
			LinkedHashMap<String, String> NewQFRPremiumWC= new LinkedHashMap<String, String>();
			
			//int iteration = 0;
		

			if (transactionsList.contains("BPNewQuote")) {
			String transaction = "BPNewQuote";
			CommonFunPage.PWAppStartUp(test);
			LoginPage.PWAppLogin(strRegressionID, transaction, test);
			}
			
			
			if (transactionsList.contains("BPPWPremiums")) {
				String transaction = "BPPWPremiums";		
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
				PWQuoteOpenPage.PWQuoteForRenewal(CurrentTermPremiums,QFR,CurrentTermPremiumsCA,CurrentTermPremiumsWC,CurrentTermPremiumsUM,QFRPremiumsCA,QFRPremiumsWC,QFRPremiumsUM,strRegressionID, transaction, test);								
			}
			
			if (transactionsList.contains("BPRRSValidationOne1")) {
				String transaction = "BPRRSValidationOne";				
				CommonFunPage.RRSAppStartUp(test, constants.Env);				
				RateRenewalSheet.RateRenewalSheetMethod(CurrentTermPremiums,CurrentTermPremiumsCA,CurrentTermPremiumsWC,CurrentTermPremiumsUM,strRegressionID, transaction, test);							
			}
			
			if (transactionsList.contains("BPRRSValidationTwo1")) {
				String transaction = "BPRRSValidationTwo";				
				RateRenewalSheet.RateRenewalSheetMethod(QFR,QFRPremiumsCA,QFRPremiumsWC,QFRPremiumsUM,strRegressionID, transaction, test);
			}
			
			if(transactionsList.contains("BPReviseQuote")){				
				String transaction = "BPReviseQuote";
				String policyNum = PWQuoteOpen.policyNumberPackage;
				//String policyNum = "4165167";
				PWQuoteOpenPage.openPendingQuoteInPW(policyNum, test);
				CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
				CommonMethods.NavigateTo("Cyber Security", test);
				CommonMethods.NavigateTo("Schedule Rating/IRPM",test);				
				ScheduleRatingIRPMPage.ScheduleRatingIRPM(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);				
				PWQuoteOpenPage.getPremiums(NewQFRPremium,"Package");
				CommonMethods.getCompleteTransaction(strRegressionID, transaction, test);
				
			}
			
			if(transactionsList.contains("CAReviseQuote")){				
				String transaction = "CAReviseQuote";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
				String policyNum = PWQuoteOpen.policyNumberCA;
				//String policyNum = "4165167";
				PWQuoteOpenPage.openPendingQuoteInPW(policyNum, test);				
				CommonMethods.NavigateTo("Commercial Auto",test);
				CommonMethods.NavigateTo("Schedule Rating (1)",test);					
				CA_ScheduleRatingPage.CA_ScheduleRatingPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);				
				PWQuoteOpenPage.getPremiums(NewQFRPremiumCA,"CA");
				CommonMethods.getCompleteTransaction(strRegressionID, transaction, test);
				
			}
			
			if(transactionsList.contains("WCReviseQuote")){				
				String transaction = "CAReviseQuote";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
				String policyNum = PWQuoteOpen.policyNumberWC;
				//String policyNum = "4165167";
				PWQuoteOpenPage.openPendingQuoteInPW(policyNum, test);				
				CommonMethods.NavigateTo("Workers Compensation", test);
				CommonMethods.NavigateTo("State Information (3)", test);
				CommonMethods.NavigateTo("Colorado", test);
				CommonMethods.NavigateTo("Rating Periods (1)", test);
				CommonMethods.NavigateTo("1 - Policy Effective",test);
				CommonMethods.NavigateTo("Schedule Rating (1)",test);
				ScheduleRating.WC_ScheduleRatingPage(strRegressionID,transaction, suspendSheet,test);
				PWQuoteOpenPage.getPremiums(NewQFRPremiumWC,"WC");
				CommonMethods.getCompleteTransaction(strRegressionID, transaction, test);
				
			}
			
			if (transactionsList.contains("BPRRSValidationThree1")) {
				String transaction = "BPRRSValidationTwo";  //its valid
				CommonFunPage.RRSAppStartUp(test, constants.Env);
				RateRenewalSheet.RateRenewalSheetMethod(NewQFRPremium,NewQFRPremiumCA,NewQFRPremiumWC,QFRPremiumsUM,strRegressionID, transaction, test);				
				RateRenewalSheet.RateRenewalSheetMethod(QFR,QFRPremiumsCA,QFRPremiumsWC,QFRPremiumsUM,strRegressionID, "BPRRSValidationThree", test);
				
			}
			
			
				} 
				catch (Exception e) {
					e.printStackTrace();
					se.verify().verifyEquals("AZ_BPRegression test  failed", true, false);
					testTearDown(se);
				}
				
			
			}
}


