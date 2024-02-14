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
import pw.pages.CIM.CIM_AccountsRecievable;
import pw.pages.CIM.CIM_Buildings;
import pw.pages.CIM.CIM_ComputerCoverage;
import pw.pages.CIM.CIM_ComputerLocationAndLimits;
import pw.pages.CIM.CIM_ContractorsEquipment;
import pw.pages.CIM.CIM_ContractorsOtherCoverages;
import pw.pages.CIM.CIM_InstallationFloater;
import pw.pages.CIM.CIM_Locations;
import pw.pages.CIM.CIM_LossPayable;
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
import pw.pages.CP.CP_AdditionalInterest;
import pw.pages.CP.CP_Buildings;
import pw.pages.CP.CP_CommercialPackage;
import pw.pages.CP.CP_CommercialProperty;
import pw.pages.CP.CP_Locations;
import pw.pages.CS.CyberSecurity_Main;
import pw.pages.EPLI.CP_EmploymentPracticesLiabilityInsurancePage;
import pw.pages.GL.GL_AdditionalInterest;
import pw.pages.GL.GL_Classifications;
import pw.pages.GL.GL_ExperienceRating;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_OptionalProvisions;
import pw.pages.GL.GL_PremAndProd;
import pw.pages.GL.GL_StateSpecificCoverages;
import pw.pages.GL.GeneralLiability;

public class TC2_CO_TCRegression extends BaseTest {
	ExtentReports extent;
	ExtentTest test;
	static String clonePolicy = "";

	
	public static void TC2_CO_TCRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
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
		GL_Location GLLocations = TestPageFactory.initElements(se, GL_Location.class);
		GL_PremAndProd GLPremAndProd = TestPageFactory.initElements(se, GL_PremAndProd.class);
		GL_Classifications GLClassifications = TestPageFactory.initElements(se, GL_Classifications.class);
		GL_AdditionalInterest GLAdditionalInterest = TestPageFactory.initElements(se, GL_AdditionalInterest.class);
		GL_OptionalProvisions GLOptionalProvisions = TestPageFactory.initElements(se, GL_OptionalProvisions.class);
		GL_ExperienceRating GLExperienceRating = TestPageFactory.initElements(se, GL_ExperienceRating.class);
		CIM_Main CommercialInlandMarinePage =  TestPageFactory.initElements(se, CIM_Main.class);
		CIM_Locations CIMLocationsPage = TestPageFactory.initElements(se, CIM_Locations.class);
		CIM_Buildings CIMBuildingsPage = TestPageFactory.initElements(se, CIM_Buildings.class);
		CIM_AccountsRecievable CIMAccountsRecievablePage =TestPageFactory.initElements(se, CIM_AccountsRecievable.class);
		CIM_ComputerLocationAndLimits CIMComputerLocationAndLimitsPage = TestPageFactory.initElements(se, CIM_ComputerLocationAndLimits.class);
		CIM_ComputerCoverage CIMComputerCoveragePage = TestPageFactory.initElements(se, CIM_ComputerCoverage.class);
		CIM_ContractorsEquipment ContractorsEquipment = TestPageFactory.initElements(se, CIM_ContractorsEquipment.class);
		CIM_ContractorsOtherCoverages ContractorsOtherCoverages = TestPageFactory.initElements(se, CIM_ContractorsOtherCoverages.class);
		CIM_InstallationFloater InstallationFloaterPage = TestPageFactory.initElements(se, CIM_InstallationFloater.class);
		CIM_LossPayable CIMLossPayablePage = TestPageFactory.initElements(se, CIM_LossPayable.class);
		CIM_Signs CIMSignsPage = TestPageFactory.initElements(se, CIM_Signs.class);
		CP_EmploymentPracticesLiabilityInsurancePage EPLICoverages= TestPageFactory.initElements(se, CP_EmploymentPracticesLiabilityInsurancePage.class);
		PW_ScheduleRatingIRPM PWScheduleRatingIRPMPage = TestPageFactory.initElements(se, PW_ScheduleRatingIRPM.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
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
				WelcomePage.homePage(strRegressionID,transaction, test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				ProducerPage.AddProducers(strRegressionID,transaction,test);
				CommonMethods.NavigateToNextScreen(test);
				String cyberChkY = CommercialPackage.CommercialPackage(strRegressionID,transaction, test);
				
				CommercialPropertyPage.CommercialPropertyMethod(strRegressionID,transaction,test);
				CplocationsPage.Locations(strRegressionID, transaction, test);
				BuildingsPage.BuildingDetails(strRegressionID, transaction,test);
				CommonMethods.NavigateToNextScreen(test);
				CP_AdditionalInterestPage.CP_AddInterest(strRegressionID, transaction, test);
				CommonMethods.CollapseAllAndNavigateTo("Target Contractor Protector", "20-TC", test);
				CommonMethods.NavigateTo("General Liability", test);
				
				GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID, transaction, test);
				GLLocations.GL_Location_Details(strRegressionID, transaction, test);
				GLPremAndProd.GL_PremAndProdPage(strRegressionID, transaction, test);
				GLClassifications.GL_ClassificationsPage(strRegressionID, transaction, test);
				GLAdditionalInterest.GL_AdditionalInterest_Details(strRegressionID, transaction, test);
				GLOptionalProvisions.CP_GLOptionalProvisions(strRegressionID, transaction, test);
				GLExperienceRating.GLExperienceRatingPage(strRegressionID, transaction, test);
				
				CommercialInlandMarinePage.CIM_Main(strRegressionID, transaction, test);
				CIMLocationsPage.CIM_Locations(strRegressionID, transaction, test);
				CIMBuildingsPage.CIM_Buildings(strRegressionID, transaction, test);
				CIMAccountsRecievablePage.CIMAccountsRecievable(strRegressionID,transaction,test);
				CIMComputerLocationAndLimitsPage.ComputerLocationAndLimits(strRegressionID,transaction,test);
				CIMComputerCoveragePage.CIMComputerCoverage(strRegressionID, transaction, test);
		//		CommonMethods.NavigateToNextScreen(test);
				ContractorsEquipment.ContractorsEquipment(strRegressionID, transaction, test);
				ContractorsOtherCoverages.CIMContractorsOtherCoverages(strRegressionID, transaction, test);
				InstallationFloaterPage.CIM_InstallationFloater_Details(strRegressionID, transaction, test);
				CIMLossPayablePage.LossPayable(strRegressionID, transaction, test);
				CIMSignsPage.CIMSigns(strRegressionID, transaction, test);
				CommonMethods.NavigateToNextScreen(test);
				
				EPLICoverages.CP_EmployPracLiabInsPage(strRegressionID, transaction, test);
				CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
				PWScheduleRatingIRPMPage.ScheduleRatingIRPM(strRegressionID, transaction, test);
			
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
			//	CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				//CommonMethods.getDashboardSupplementaryInfo(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			
				//Convert To Policy
			    if(transactionsList.contains("ConvertToPolicy")){ 
			    String transaction ="ConvertToPolicy";
			    CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			    PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			    CommonMethods.getDashboardActions(strRegressionID,transaction,test); 
			    }
			    

			 // Endorsement1
				if (transactionsList.contains("FlatEndorsement1")) {
					String transaction = "FlatEndorsement1";
					QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
					CommonMethods.NavigateTo("Target Contractor Protector", test);
					CommercialPackage.CommercialPackage(strRegressionID,transaction, test);
					CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
					PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
			//		CommonMethods.getDashboardForms(strRegressionID, transaction, test);
					CommonMethods.getDashboardActions(strRegressionID, transaction, test);
				}
				
				//Endorsement2
				if (transactionsList.contains("FlatEndorsement2")) {
					String transaction = "FlatEndorsement2";
					QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
					CommonMethods.NavigateTo("Schedule Rating/IRPM", test);
					PWScheduleRatingIRPMPage.ScheduleRatingIRPM(strRegressionID, transaction, test);
					CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
					PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
		//			CommonMethods.getDashboardForms(strRegressionID, transaction, test);
					CommonMethods.getDashboardActions(strRegressionID, transaction, test);
				}
				
				// Endorsement3
				if (transactionsList.contains("ProRataEndorsement1")) {
					String transaction = "ProRataEndorsement1";
					QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
					CommonMethods.NavigateTo("Target Contractor Protector", test);
					CommonMethods.NavigateTo("General Liability", test);
					CommonMethods.NavigateTo("Additional Interest (1)", test);
					GLAdditionalInterest.GL_AdditionalInterest_Details(strRegressionID, transaction, test);

					CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
					PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
		//			CommonMethods.getDashboardForms(strRegressionID, transaction, test);
					CommonMethods.getDashboardActions(strRegressionID, transaction, test);
				}
				
				 // Endorsement4
				if (transactionsList.contains("ProRataEndorsement2")) {
					String transaction = "ProRataEndorsement2";
					QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
					CommonMethods.NavigateTo("Target Contractor Protector", test);
					CommonMethods.NavigateTo("Commercial Inland Marine", test);
					CommercialInlandMarinePage.CIM_Main(strRegressionID, transaction, test);
					
					CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
					PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
		//			CommonMethods.getDashboardForms(strRegressionID, transaction, test);
					CommonMethods.getDashboardActions(strRegressionID, transaction, test);
				}
					
					//Quote For Renewal
					if(transactionsList.contains("QuoteForRenewal")){
						String transaction = "QuoteForRenewal";
						QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
						CommonMethods.NavigateToPage("Target Contractor Protector", test);
						CommonMethods.NavigateToPage("Commercial Property", test);
						CommercialPropertyPage.CommercialPropertyMethod(strRegressionID, transaction, test);
						CommonMethods.NavigateTo("General Liability", test);
						CommonMethods.NavigateTo("Prem & Prod", test);
						GLPremAndProd.GL_PremAndProdPage(strRegressionID, transaction, test);
						GLClassifications.GL_ClassificationsPage(strRegressionID, transaction, test);
						CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
						PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
						CommonMethods.getDashboardActions(strRegressionID,transaction,test);
					}
				
			
		    
		}catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("TC_CO_ISO_Prefill Regression test failed", true, false);
			testTearDown(se);
		}
	}
	}
