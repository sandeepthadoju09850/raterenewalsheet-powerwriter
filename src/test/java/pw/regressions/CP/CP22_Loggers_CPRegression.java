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
import pw.pages.CIM.CIM_ContractorsEquipment;
import pw.pages.CIM.CIM_ContractorsOtherCoverages;
import pw.pages.CIM.CIM_ContractorsScheduledEquipment;
import pw.pages.CIM.CIM_Main;
import pw.pages.CIM.CIM_MiscellaneousCoverage;
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
import pw.pages.CP.CP_Locations;
import pw.pages.CS.CyberSecurity_Main;
import pw.pages.EPLI.CP_EmploymentPracticesLiabilityInsurancePage;
import pw.pages.EPLI.EPLI_MiscellaneousCoverage;
import pw.pages.GL.GL_AdditionalInterest;
import pw.pages.GL.GL_Classifications;
import pw.pages.GL.GL_ExperienceRating;
import pw.pages.GL.GL_InjuryToLeasedWorkers;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_OptionalProvisions;
import pw.pages.GL.GL_PremAndProd;
import pw.pages.GL.GeneralLiability;
import pw.pages.PLCM.CP_ProfessionalLiabilityClaims;

public class CP22_Loggers_CPRegression extends BaseTest  {
	ExtentReports extent;
		ExtentTest test;
		public static void LoggersCPRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params, String strRegressionID,File file,XSSFWorkbook workbook,ExtentTest test) throws IOException {
		
			PW_Login LoginPage = TestPageFactory.initElements(se, PW_Login.class);
			PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
			PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
			PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
			PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
			CP_CommercialPackage CommercialPackage =  TestPageFactory.initElements(se, CP_CommercialPackage.class);
			CP_CommercialProperty CommercialProperty =  TestPageFactory.initElements(se, CP_CommercialProperty.class);
			CP_Locations Locations = TestPageFactory.initElements(se, CP_Locations.class);
			CP_Buildings Bulidings = TestPageFactory.initElements(se, CP_Buildings.class);
			CP_AdditionalInterest AdditionalInterest = TestPageFactory.initElements(se, CP_AdditionalInterest.class);
			GeneralLiability GeneralLiabilityPage = TestPageFactory.initElements(se, GeneralLiability.class);
			GL_Location GLLocations = TestPageFactory.initElements(se, GL_Location.class);
			GL_PremAndProd GLPremAndProd = TestPageFactory.initElements(se, GL_PremAndProd.class);
			GL_Classifications GLClassifications = TestPageFactory.initElements(se, GL_Classifications.class);
			GL_InjuryToLeasedWorkers GLInjuryToLeasedWorkers = TestPageFactory.initElements(se, GL_InjuryToLeasedWorkers.class);
			GL_AdditionalInterest GLAdditionalInterest = TestPageFactory.initElements(se, GL_AdditionalInterest.class);
			GL_OptionalProvisions GLOptionalProvisions = TestPageFactory.initElements(se, GL_OptionalProvisions.class);
			GL_ExperienceRating GLExperienceRating = TestPageFactory.initElements(se, GL_ExperienceRating.class);
			CIM_Main CommercialInlandMarinePage =  TestPageFactory.initElements(se, CIM_Main.class);
			CIM_ContractorsScheduledEquipment CIMContractorsScheduledEquipment = TestPageFactory.initElements(se, CIM_ContractorsScheduledEquipment.class);
			CIM_ContractorsEquipment CIMContractorsEquipment = TestPageFactory.initElements(se, CIM_ContractorsEquipment.class);
			CIM_ContractorsOtherCoverages CIMContractorsOtherCoverages = TestPageFactory.initElements(se, CIM_ContractorsOtherCoverages.class);
			CIM_MiscellaneousCoverage CIMMiscellaneousCoverage =  TestPageFactory.initElements(se, CIM_MiscellaneousCoverage.class);
			CP_EmploymentPracticesLiabilityInsurancePage EmploymentPracticesLiabilityInsurancePage = TestPageFactory.initElements(se, CP_EmploymentPracticesLiabilityInsurancePage.class);
			EPLI_MiscellaneousCoverage EmpPracticesMiscellaneousCoverage =  TestPageFactory.initElements(se, EPLI_MiscellaneousCoverage.class);
			CP_ProfessionalLiabilityClaims ProfessionalLiabilityClaims  = TestPageFactory.initElements(se, CP_ProfessionalLiabilityClaims.class);
			PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
			PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
			CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
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
					cyberChkY = CommercialPackage.CommercialPackage(strRegressionID,transaction,test);
					CommercialProperty.CommercialPropertyMethod(strRegressionID, transaction, test);
					Locations.Locations(strRegressionID, transaction, test);
					Bulidings.BuildingDetails(strRegressionID, transaction, test);
					CommonMethods.NavigateToNextScreen(test);
					AdditionalInterest.CP_AddInterest(strRegressionID, transaction, test);
					GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID, transaction, test);
					GLLocations.GL_Location_Details(strRegressionID, transaction, test);
					GLPremAndProd.GL_PremAndProdPage(strRegressionID, transaction, test);
					GLClassifications.GL_ClassificationsPage(strRegressionID, transaction, test);
					CommonMethods.NavigateToPage("Injury To Leased Workers",test);
					GLInjuryToLeasedWorkers.GL_InjuryToLeasedWorkersPage(strRegressionID, transaction, test);
					GLAdditionalInterest.GL_AdditionalInterest_Details(strRegressionID, transaction, test);
					GLOptionalProvisions.CP_GLOptionalProvisions(strRegressionID, transaction, test);
					GLExperienceRating.GLExperienceRatingPage(strRegressionID, transaction, test);
					CommercialInlandMarinePage.CIM_Main(strRegressionID, transaction, test);
					CommonMethods.NavigateToPage("Contractors Scheduled Equipment",test);
					CIMContractorsScheduledEquipment.CIM_ContrScheduledEquip(strRegressionID, transaction, test);
					CIMContractorsEquipment.ContractorsEquipment(strRegressionID, transaction, test);
					CIMContractorsOtherCoverages.CIMContractorsOtherCoverages(strRegressionID, transaction, test);
					CIMMiscellaneousCoverage.CP_CIMMiscellaneousCoverage(strRegressionID, transaction, test);
					EmploymentPracticesLiabilityInsurancePage.CP_EmployPracLiabInsPage(strRegressionID, transaction, test);
					EmpPracticesMiscellaneousCoverage.CP_EmpPracticesMiscellaneousCoverage(strRegressionID, transaction, test);
					ProfessionalLiabilityClaims.CP_ProfessionalLiabilityClaimsPage(strRegressionID, transaction, test);
					CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
					CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
					PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
					BillingTab.getUpdateBillingTab(strRegressionID, transaction, test);
					//CommonMethods.getDashboardForms(strRegressionID, transaction, test);
					//CommonMethods.getDashboardSupplementaryInfo(strRegressionID, transaction, test);
					CommonMethods.getDashboardActions(strRegressionID, transaction, test);
					
				}
				
				//Convert To Policy
				    if(transactionsList.contains("ConvertToPolicy")){ 
				    String transaction ="ConvertToPolicy";
				    CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				    PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				    CommonMethods.getDashboardActions(strRegressionID,transaction,test); }
				 
				//ProRataEndorsement1
					if(transactionsList.contains("ProRataEndorsement1")){
					String transaction = "ProRataEndorsement1";
					QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
					CommonMethods.NavigateTo("Commercial Package",test);
					CommonMethods.NavigateTo("General Liability",test);
					CommonMethods.NavigateTo("Locations (1)",test);
					GLLocations.GL_Location_Details(strRegressionID, transaction, test);
					CommonMethods.NavigateToPage("Prem & Prod",test);
					CommonMethods.NavigateTo("Classifications (2)",test);
					GLClassifications.GL_ClassificationsPage(strRegressionID, transaction, test);
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
					CommonMethods.NavigateToPage("Commercial Property", test);
					CommercialProperty.CommercialPropertyMethod(strRegressionID, transaction, test);
					CommonMethods.NavigateToPage("General Liability",test);
					CommonMethods.NavigateToPage("Experience Rating",test);
					GLExperienceRating.GLExperienceRatingPage(strRegressionID, transaction, test);
					CommonMethods.NavigateTo("Cyber Security", test);
					CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
					CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
					PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
					CommonMethods.getDashboardActions(strRegressionID,transaction,test);
						 
				}
					
				//ConvertQFRToPolicy
					if(transactionsList.contains("ConvertQFRToPolicy")){
					String transaction = "ConvertQFRToPolicy";
					CommonMethods.NavigateTo("Commercial Package",test);
					//CommonMethods.NavigateTo("Commercial Property",test);
					//CommercialProperty.CommercialPropertyMethod(strRegressionID, transaction, test);
					CommonMethods.getCalculatePremium(strRegressionID,transaction,test);	
					PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
					CommonMethods.getDashboardActions(strRegressionID,transaction,test);
					
					}
			}catch (Exception e) {
				e.printStackTrace();
				se.verify().verifyEquals("Loggers CP Regression test failed", true, false);
				testTearDown(se);
			}
		}
		
		}
		


