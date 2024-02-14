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
import pw.Constants.constants;
import pw.pages.CAF.CAF_CrimeEndorsement;
import pw.pages.CAF.CAF_InsuringAgreements;
import pw.pages.CAF.CAF_Locations;
import pw.pages.CAF.CrimeAndFidelity_Main;
import pw.pages.CIM.CIM_BuildersRisk;
import pw.pages.CIM.CIM_Buildings;
import pw.pages.CIM.CIM_ContractorsOtherCoverages;
import pw.pages.CIM.CIM_ExhibitionFloaterCoverage;
import pw.pages.CIM.CIM_ExhibitionFloaterDescribedProperty;
import pw.pages.CIM.CIM_FineArtsFloater;
import pw.pages.CIM.CIM_FineArtsFloater_OtherCoverages;
import pw.pages.CIM.CIM_Locations;
import pw.pages.CIM.CIM_LossPayable;
import pw.pages.CIM.CIM_Main;
import pw.pages.CIM.CIM_Signs;
import pw.pages.CIM.CIM_Terrorism;
import pw.pages.COMMON.PW_AddNamedInsured;
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
import pw.pages.CP.CP_Coverages;
import pw.pages.CP.CP_KeyEmployeeReplacementExpense;
import pw.pages.CP.CP_Locations;
import pw.pages.CP.CP_MiscellaneousCoverage;
import pw.pages.CP.CP_Terrorism;
import pw.pages.CS.CyberSecurity_Main;
import pw.pages.DO.CP_DirectorsAndOfficers;
import pw.pages.DO.DAndO_MiscellaneousCoverage;
import pw.pages.EPLI.CP_EmploymentPracticesLiabilityInsurancePage;
import pw.pages.GL.GL_AdditionalInterest;
import pw.pages.GL.GL_Classifications;
import pw.pages.GL.GL_EmployeeBenefitsLiability;
import pw.pages.GL.GL_ExperienceRating;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_OptionalProvisions;
import pw.pages.GL.GL_PremAndProd;
import pw.pages.GL.GL_SpecialityOption;
import pw.pages.GL.GeneralLiability;
import pw.pages.PLCM.CP_ProfessionalLiabilityClaims;

public class TC15_WI_TCRegression extends BaseTest {
	ExtentReports extent;
	ExtentTest test;
	
	public static void WITCRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		
		PW_Login  LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
		PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
		CP_CommercialPackage CommercialPackage =  TestPageFactory.initElements(se, CP_CommercialPackage.class);
		CP_CommercialProperty CommercialPropertyPage = TestPageFactory.initElements(se, CP_CommercialProperty.class);
		CP_Locations CplocationsPage = TestPageFactory.initElements(se, CP_Locations.class);
		CP_Buildings BuildingsPage = TestPageFactory.initElements(se, CP_Buildings.class);
		CP_AdditionalInterest CPAdditionalInterest = TestPageFactory.initElements(se, CP_AdditionalInterest.class);
		GeneralLiability GeneralLiabilityPage = TestPageFactory.initElements(se, GeneralLiability.class);
		GL_Location GLLocationPage = TestPageFactory.initElements(se, GL_Location.class);
		GL_PremAndProd GLPremAndProdPage = TestPageFactory.initElements(se, GL_PremAndProd.class);
		GL_Classifications GLClassificationsPage = TestPageFactory.initElements(se, GL_Classifications.class);
		GL_AdditionalInterest GLAdditionalInterestPage=TestPageFactory.initElements(se, GL_AdditionalInterest.class);
		GL_ExperienceRating GLExperienceRating = TestPageFactory.initElements(se, GL_ExperienceRating.class);
		GL_OptionalProvisions GLOptionalProvisionsPage = TestPageFactory.initElements(se, GL_OptionalProvisions.class);
		CIM_Main CIMMainPage = TestPageFactory.initElements(se, CIM_Main.class);
		CIM_Locations CIMLocationsPage = TestPageFactory.initElements(se, CIM_Locations.class);
		CIM_Buildings CIMBuildingsPage = TestPageFactory.initElements(se, CIM_Buildings.class);
		CIM_ContractorsOtherCoverages CIMContractorsOtherCoverages = TestPageFactory.initElements(se, CIM_ContractorsOtherCoverages.class);
		CP_EmploymentPracticesLiabilityInsurancePage CPEmploymentPracticesLiabilityInsurancePage = TestPageFactory.initElements(se, CP_EmploymentPracticesLiabilityInsurancePage.class);
		CP_ProfessionalLiabilityClaims CP_ProfessionalLiabilityClaimsPage = TestPageFactory.initElements(se, CP_ProfessionalLiabilityClaims.class);
		PW_ScheduleRatingIRPM ScheduleRatingIRPMPage = TestPageFactory.initElements(se, PW_ScheduleRatingIRPM.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
		CP_DirectorsAndOfficers DirectorsAndOfficersPage = TestPageFactory.initElements(se, CP_DirectorsAndOfficers.class);
		DAndO_MiscellaneousCoverage DAndO_MiscellaneousCoveragePage = TestPageFactory.initElements(se, DAndO_MiscellaneousCoverage.class);
		CP_MiscellaneousCoverage CP_MiscellaneousCoveragePage = TestPageFactory.initElements(se, CP_MiscellaneousCoverage.class);
		PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);
		String cyberChkY = "";
		
		try {
			List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
			
				CommonFunPage.PWAppStartUp(test);
			
			if(transactionsList.contains(constants.NewQuote)){
				String transaction = constants.NewQuote;
				LoginPage.PWAppLogin(strRegressionID,transaction,test);
				WelcomePage.homePage(strRegressionID,transaction, test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				ProducerPage.AddProducers(strRegressionID,transaction,test);
				
				CommonMethods.NavigateTo("Target Contractor Protector",test);
				cyberChkY = CommercialPackage.CommercialPackage(strRegressionID,transaction,test);
				CommercialPropertyPage.CommercialPropertyMethod(strRegressionID,transaction,test);
				CplocationsPage.Locations(strRegressionID, transaction, test);
				BuildingsPage.BuildingDetails(strRegressionID, transaction,test);
				CommonMethods.NavigateTo("Additional Interest", test);
				CPAdditionalInterest.CP_AddInterest(strRegressionID, transaction, test);
				
				GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID,transaction,test);
				GLLocationPage.GL_Location_Details(strRegressionID,transaction,test);
				GLPremAndProdPage.GL_PremAndProdPage(strRegressionID,transaction,test);
				GLClassificationsPage.GL_ClassificationsPage(strRegressionID,transaction,test);
				
				GLAdditionalInterestPage.GL_AdditionalInterest_Details(strRegressionID, transaction, test);
				GLOptionalProvisionsPage.CP_GLOptionalProvisions(strRegressionID,transaction,test);
				GLExperienceRating.GLExperienceRatingPage(strRegressionID, transaction, test);
				CommonMethods.NavigateToNextScreen(test);
							
				CommonMethods.NavigateTo("Commercial Inland Marine",test);
				CIMMainPage.CIM_Main(strRegressionID,transaction,test);
				CIMLocationsPage.CIM_Locations(strRegressionID,transaction,test);
				CIMBuildingsPage.CIM_Buildings(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Contractors -Other Coverages",test);
				CIMContractorsOtherCoverages.CIMContractorsOtherCoverages(strRegressionID, transaction, test);
				CommonMethods.NavigateToNextScreen(test);
				DirectorsAndOfficersPage.CP_DOMainPage(strRegressionID, transaction, test);
				DAndO_MiscellaneousCoveragePage.CP_DAndOMiscellaneousCoverage(strRegressionID, transaction, test);
				
				CommonMethods.NavigateTo("Employment Practices Liability Insurance",test);
				CPEmploymentPracticesLiabilityInsurancePage.CP_EmployPracLiabInsPage(strRegressionID, transaction, test);		
				
				CommonMethods.NavigateTo("Professional Liability Claims-Made",test);
				CP_ProfessionalLiabilityClaimsPage.CP_ProfessionalLiabilityClaimsPage(strRegressionID, transaction,
						test);
				CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				
				CommonMethods.NavigateTo("Schedule Rating/IRPM",test);
				ScheduleRatingIRPMPage.ScheduleRatingIRPM(strRegressionID,transaction,test);
							
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
	 			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
				//CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				//CommonMethods.getDashboardSupplementaryInfo(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
		
			if(transactionsList.contains(constants.ConvertToPolicy)){
				String transaction = constants.ConvertToPolicy;
				CommonMethods.NavigateTo("Target Contractor Protector",test);
				CommonMethods.NavigateTo("Commercial Property",test);
				CommercialPropertyPage.CommercialPropertyMethod(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Miscellaneous Coverages",test);
				CP_MiscellaneousCoveragePage.CP_MiscellaneousCov(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
	 			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			if(transactionsList.contains(constants.FlatEndorsement1)){
				String transaction = constants.FlatEndorsement1;
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Target Contractor Protector",test);
				CommonMethods.NavigateToPage("General Liability",test);
				CommonMethods.NavigateToPage("Additional Interest",test);
				GLAdditionalInterestPage.GL_AdditionalInterest_Details(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);	
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
	//		CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			if(transactionsList.contains(constants.FlatEndorsement2)){
				String transaction = constants.FlatEndorsement2;
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Target Contractor Protector",test);
				CommonMethods.NavigateTo("Commercial Property",test);
				CommonMethods.NavigateTo("Buildings (2)",test);
				CommonMethods.NavigateToPageContaingText("Loc 1 Bldg 2", test);
				BuildingsPage.BuildingDetails(strRegressionID, transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);	
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
	//			CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				
			}
			
			if(transactionsList.contains(constants.ProRataEndorsement1)){
				String transaction = constants.ProRataEndorsement1;
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.CollapseAllAndNavigateTo("Target Contractor Protector", "20-TC", test);
				CommonMethods.NavigateTo("General Liability",test);
				CommonMethods.NavigateTo("Additional Interest (1)",test);
				GLAdditionalInterestPage.GL_AdditionalInterest_Details(strRegressionID, transaction, test);
				CommonMethods.CollapseAllAndNavigateTo("Target Contractor Protector", "20-TC", test);
				CommonMethods.NavigateTo("Commercial Inland Marine",test);
			    CommonMethods.NavigateTo("Contractors -Other Coverages",test);
			    CIMContractorsOtherCoverages.CIMContractorsOtherCoverages(strRegressionID, transaction, test);
			    CommonMethods.getCalculatePremium(strRegressionID,transaction,test);	
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
	//			CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
		
			//QuoteForRenewal
			if(transactionsList.contains("QuoteForRenewal")){
				String transaction = "QuoteForRenewal";
		
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Target Contractor Protector", test);
				CommonMethods.NavigateTo("Commercial Property", test);
				CommercialPropertyPage.CommercialPropertyMethod(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("General Liability", test);
				CommonMethods.NavigateTo("Prem & Prod", test);
				CommonMethods.NavigateTo("Classifications (3)", test);
				GLClassificationsPage.GL_ClassificationsPage(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Experience Rating", test);
				GLExperienceRating.GLExperienceRatingPage(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Cyber Security", test);
				CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
				CommonMethods.NavigateTo("Schedule Rating/IRPM", test);
				ScheduleRatingIRPMPage.ScheduleRatingIRPM(strRegressionID,transaction,test);	
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);	
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		  
		}
			
			
			//Convert QFR To Policy
			if(transactionsList.contains("ConvertQFRToPolicy")){
				String transaction = "ConvertQFRToPolicy";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Target Contractor Protector",test);
				CommonMethods.NavigateTo("Commercial Property",test);
				CommonMethods.NavigateTo("Buildings (2)",test);
				CommonMethods.NavigateToPageContaingText("Loc 1 Bldg 1", test);
				BuildingsPage.BuildingDetails(strRegressionID, transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				

		}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("WITCRegression test  failed", true, false);
			testTearDown(se);
		}
	}

}
