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
import pw.pages.CIM.CIM_BuildersRisk;
import pw.pages.CIM.CIM_Buildings;
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
import pw.pages.CP.CP_Buildings;
import pw.pages.CP.CP_CommercialPackage;
import pw.pages.CP.CP_CommercialProperty;
import pw.pages.CP.CP_Coverages;
import pw.pages.CP.CP_KeyEmployeeReplacementExpense;
import pw.pages.CP.CP_Locations;
import pw.pages.CS.CyberSecurity_Main;
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

public class CP13_WI_CPRegression extends BaseTest {
	ExtentReports extent;
	ExtentTest test;
	
	public static void WICPRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		
		PW_Login  LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
		PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
		PW_AddNamedInsured AddNamedInsuredPage = TestPageFactory.initElements(se, PW_AddNamedInsured.class);
		CP_CommercialPackage CommercialPackage =  TestPageFactory.initElements(se, CP_CommercialPackage.class);
		CP_CommercialProperty CommercialPropertyPage = TestPageFactory.initElements(se, CP_CommercialProperty.class);
		CP_Locations CplocationsPage = TestPageFactory.initElements(se, CP_Locations.class);
		CP_Buildings BuildingsPage = TestPageFactory.initElements(se, CP_Buildings.class);
		CP_Coverages CPCoverages = TestPageFactory.initElements(se, CP_Coverages.class);
		CP_KeyEmployeeReplacementExpense CPKeyEmployeeReplacementExpense = TestPageFactory.initElements(se, CP_KeyEmployeeReplacementExpense.class);
		GeneralLiability GeneralLiabilityPage = TestPageFactory.initElements(se, GeneralLiability.class);
		GL_Location GLLocationPage = TestPageFactory.initElements(se, GL_Location.class);
		GL_PremAndProd GLPremAndProdPage = TestPageFactory.initElements(se, GL_PremAndProd.class);
		GL_Classifications GLClassificationsPage = TestPageFactory.initElements(se, GL_Classifications.class);
		GL_AdditionalInterest GLAdditionalInterestPage=TestPageFactory.initElements(se, GL_AdditionalInterest.class);
		GL_SpecialityOption GLSpecialityOptionPage=TestPageFactory.initElements(se, GL_SpecialityOption.class);
		GL_ExperienceRating GLExperienceRating = TestPageFactory.initElements(se, GL_ExperienceRating.class);
		GL_OptionalProvisions GLOptionalProvisionsPage = TestPageFactory.initElements(se, GL_OptionalProvisions.class);
		GL_EmployeeBenefitsLiability GLEmployeeBenefitsLiabilityPage = TestPageFactory.initElements(se, GL_EmployeeBenefitsLiability.class);
		CIM_Main CIMMainPage = TestPageFactory.initElements(se, CIM_Main.class);
		CIM_Locations CIMLocationsPage = TestPageFactory.initElements(se, CIM_Locations.class);
		CIM_Buildings CIMBuildingsPage = TestPageFactory.initElements(se, CIM_Buildings.class);
		CIM_ExhibitionFloaterDescribedProperty CIMExhibitionFloaterDescribedProperty = TestPageFactory.initElements(se, CIM_ExhibitionFloaterDescribedProperty.class);
		CIM_ExhibitionFloaterCoverage CIMExhibitionFloaterCoverage = TestPageFactory.initElements(se, CIM_ExhibitionFloaterCoverage.class);
		CIM_FineArtsFloater CIMFineArtsFloaterPage = TestPageFactory.initElements(se, CIM_FineArtsFloater.class);
		CIM_FineArtsFloater_OtherCoverages CIMFineArtsFloaterOtherCoveragesPage = TestPageFactory.initElements(se, CIM_FineArtsFloater_OtherCoverages.class);
		CIM_LossPayable CIMLossPayablePage = TestPageFactory.initElements(se, CIM_LossPayable.class);
		CIM_Signs CIMSignsPage = TestPageFactory.initElements(se, CIM_Signs.class);
		CIM_BuildersRisk CIMBuilderRiskPage = TestPageFactory.initElements(se, CIM_BuildersRisk.class);
		CIM_Terrorism CIMTerrorism = TestPageFactory.initElements(se, CIM_Terrorism.class);
		CrimeAndFidelity_Main CrimeAndFidelity_MainPage = TestPageFactory.initElements(se, CrimeAndFidelity_Main.class);
		CAF_Locations CAFLocationsPage =TestPageFactory.initElements(se, CAF_Locations.class);
		CAF_InsuringAgreements CAFInsuringAgreementsPage =TestPageFactory.initElements(se, CAF_InsuringAgreements.class);
		CAF_CrimeEndorsement CAFCrimeEndorsementPage =TestPageFactory.initElements(se, CAF_CrimeEndorsement.class);
		CP_EmploymentPracticesLiabilityInsurancePage EPLI_Main = TestPageFactory.initElements(se, CP_EmploymentPracticesLiabilityInsurancePage.class);
		PW_ScheduleRatingIRPM ScheduleRatingIRPMPage = TestPageFactory.initElements(se, PW_ScheduleRatingIRPM.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
		PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);
		
		try {
			List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
			
			CommonFunPage.PWAppStartUp(test);
			
			if(transactionsList.contains(constants.NewQuote)){
				String transaction = constants.NewQuote;
				LoginPage.PWAppLogin(strRegressionID,transaction,test);
				WelcomePage.homePage(strRegressionID,transaction, test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				ProducerPage.AddProducers(strRegressionID,transaction,test);
				AddNamedInsuredPage.AddAdditionalNamedInsuredMethod(strRegressionID, transaction, test);
				String cyberChkY = CommercialPackage.CommercialPackage(strRegressionID,transaction,test);
				CommercialPropertyPage.CommercialPropertyMethod(strRegressionID,transaction,test);
				CplocationsPage.Locations(strRegressionID, transaction, test);
				BuildingsPage.BuildingDetails(strRegressionID, transaction,test);
				CommonMethods.NavigateToNextScreen(test);
				CommonMethods.NavigateToNextScreen(test);
				CPKeyEmployeeReplacementExpense.CP_KeyEmployeePage(strRegressionID, transaction, test);
				
				GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID,transaction,test);
				GLLocationPage.GL_Location_Details(strRegressionID,transaction,test);
				GLPremAndProdPage.GL_PremAndProdPage(strRegressionID,transaction,test);
				GLClassificationsPage.GL_ClassificationsPage(strRegressionID,transaction,test);
				GLEmployeeBenefitsLiabilityPage.GL_EmployeeBenefitsLiability_Details(strRegressionID,transaction,test);
				GLSpecialityOptionPage.GL_SpecialityOption_Details(strRegressionID, transaction, test);
				GLAdditionalInterestPage.GL_AdditionalInterest_Details(strRegressionID, transaction, test);
				GLOptionalProvisionsPage.CP_GLOptionalProvisions(strRegressionID,transaction,test);
				GLExperienceRating.GLExperienceRatingPage(strRegressionID, transaction, test);
				
				CrimeAndFidelity_MainPage.CrimeAndFidelity_MainPage(strRegressionID,transaction,test);
				CAFLocationsPage.CAF_Locations_Details(strRegressionID,transaction,test);
				CAFInsuringAgreementsPage.CAF_InsuringAgreementsPage(strRegressionID,transaction,test);
				CAFCrimeEndorsementPage.CAF_CrimeEndorsementMethod(strRegressionID, transaction, test);
				
				CIMMainPage.CIM_Main(strRegressionID,transaction,test);
				CIMLocationsPage.CIM_Locations(strRegressionID,transaction,test);
				CIMBuildingsPage.CIM_Buildings(strRegressionID,transaction,test);
				CIMExhibitionFloaterDescribedProperty.CIMExhibitionFloaterDescribedProperty(strRegressionID, transaction, test);
				CIMExhibitionFloaterCoverage.ExhibitionFloaterCoverage(strRegressionID, transaction, test);
				CIMFineArtsFloaterPage.Add_FineArtsFloater(strRegressionID, transaction, test);
				CIMFineArtsFloaterOtherCoveragesPage.FineArtsFloater_OtherCoverages(strRegressionID, transaction, test);
				CIMLossPayablePage.LossPayable(strRegressionID, transaction, test);
				CIMSignsPage.CIMSigns(strRegressionID,transaction,test);
				CIMTerrorism.CIMTerrorism(strRegressionID,transaction,test);
			
				EPLI_Main.CP_EmployPracLiabInsPage(strRegressionID, transaction, test);
				
				CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
				
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
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
	 			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			if(transactionsList.contains(constants.FlatEndorsement1)){
				String transaction = constants.FlatEndorsement1;
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Package",test);
				CommonMethods.NavigateTo("Commercial Property",test);
				CommonMethods.NavigateTo("Buildings (1)",test);
				CommonMethods.NavigateToPageContaingText("Loc 1 Bldg 1",test);
				BuildingsPage.BuildingDetails(strRegressionID, transaction,test);
				CommonMethods.NavigateToPage("Utility Service Coverage",test);
				CPCoverages.CP_UtilityServiceCoveragePage(strRegressionID,transaction,"Location 1 Building 1", test);
				CommonMethods.NavigateToPage("General Liability",test);
				CommonMethods.NavigateToPageBasedOnOccurence("Additional Interest (1)","1",test);
				GLAdditionalInterestPage.GL_AdditionalInterest_Details(strRegressionID, transaction, test);
				//CommonMethods.CollapseAllAndNavigateTo("Commercial Package","20-CP",test);
				CommonMethods.NavigateToPage("Crime and Fidelity",test);
				CommonMethods.NavigateToPage("Insuring Agreements (3)",test);
				CAFInsuringAgreementsPage.CAF_InsuringAgreementsPage(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);	
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				//CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			if(transactionsList.contains(constants.DeleteFlatEndorsement1)){
				String transaction = constants.DeleteFlatEndorsement1;
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Package",test);
				CommonMethods.NavigateTo("General Liability",test);
				CommonMethods.NavigateTo("Prem & Prod",test);
				GLPremAndProdPage.GL_PremAndProdPage(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Crime and Fidelity",test);
				CommonMethods.NavigateTo("Insuring Agreements (4)",test);
				CAFInsuringAgreementsPage.CAF_InsuringAgreementsPage(strRegressionID,transaction,test);
				CommonMethods.CollapseAllAndNavigateTo("Commercial Package","20-CP",test);
				CommonMethods.NavigateTo("Commercial Inland Marine",test);
			    CIMMainPage.CIM_Main(strRegressionID,transaction,test);
			    CommonMethods.CollapseAllAndNavigateTo("Commercial Package","20-CP",test);
			    CommonMethods.NavigateTo("Crime and Fidelity",test);
			    CommonMethods.NavigateTo("Endorsements (1)",test);
			    CAFCrimeEndorsementPage.deleteFormCR2010(strRegressionID, transaction, test);
			    CommonMethods.getCalculatePremium(strRegressionID,transaction,test);	
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				//CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			if(transactionsList.contains(constants.ProRataEndorsement1)){
				String transaction = constants.ProRataEndorsement1;
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateToPage("Personal Property Coverage (1)",test);
				CPCoverages.CP_BusinessPersonalProperty(strRegressionID, transaction, "Location 1 Building 1", test);
				 CommonMethods.CollapseAllAndNavigateTo("Commercial Package","20-CP",test);
				CommonMethods.NavigateTo("Crime and Fidelity",test);
				CommonMethods.NavigateTo("Insuring Agreements (3)",test);
				CAFInsuringAgreementsPage.CAF_InsuringAgreementsPage(strRegressionID,transaction,test);
			    CommonMethods.getCalculatePremium(strRegressionID,transaction,test);	
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				//CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			if(transactionsList.contains(constants.ReverseProRataEndorsement1)){
				String transaction = constants.ReverseProRataEndorsement1;
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);	
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			if(transactionsList.contains(constants.ProRataEndorsement2)){
				String transaction = constants.ProRataEndorsement2;
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateToPage("Personal Property Coverage (1)",test);
				CPCoverages.CP_BusinessPersonalProperty(strRegressionID, transaction, "Location 1 Building 1", test);
				CommonMethods.CollapseAllAndNavigateTo("Commercial Package", "20-CP", test);
				CommonMethods.NavigateTo("Crime and Fidelity",test);
				CommonMethods.NavigateTo("Insuring Agreements (3)",test);
				CAFInsuringAgreementsPage.CAF_InsuringAgreementsPage(strRegressionID,transaction,test);
			    CommonMethods.clickCalculatePremNoWaive(strRegressionID,transaction,test);	
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				//CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			if(transactionsList.contains(constants.DeleteProRataEndorsement2)){
				String transaction = constants.DeleteProRataEndorsement2;
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateToPage("Commercial Property",test);
				CommercialPropertyPage.CommercialPropertyMethod(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);	
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				//CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			if(transactionsList.contains(constants.AddProRataEndorsement3)){
				String transaction = constants.AddProRataEndorsement3;
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Package",test);
				CommonMethods.NavigateToPage("General Liability",test);
				GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);	
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				//CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			if(transactionsList.contains(constants.QFR)){
				String transaction = constants.QFR;
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Package",test);
				CommonMethods.NavigateTo("Commercial Property",test);
				CommercialPropertyPage.CommercialPropertyMethod(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Buildings (1)",test);
				CommonMethods.NavigateTo("Loc 1 Bldg 1 - Amery, WI, 6689 Evergreen Dr",test);
				CommonMethods.NavigateTo("Personal Property Coverage (1)",test);
				CPCoverages.CP_BusinessPersonalProperty(strRegressionID, transaction, "Location 1 Building 1", test);
				CommonMethods.NavigateToPage("General Liability",test);
				GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID, transaction, test);
				CommonMethods.NavigateToPageBasedOnOccurence("Emp Benefits Liab","1",test);
				GLEmployeeBenefitsLiabilityPage.GL_EmployeeBenefitsLiability_Details(strRegressionID,transaction,test);
				CommonMethods.NavigateToPage("Commercial Inland Marine",test);
			    CIMMainPage.CIM_Main(strRegressionID,transaction,test);
			    CommonMethods.NavigateToPage("Builders Risk",test);
			    CIMBuilderRiskPage.BuildersRisk(strRegressionID,transaction,test);
			    CommonMethods.CollapseAllAndNavigateTo("Commercial Package", "20-CP", test);
			    CommonMethods.NavigateToPage("Commercial Property",test);
			    CommonMethods.NavigateTo("Buildings (1)",test);
				CommonMethods.NavigateToPageContaingText("Loc 1 Bldg 1", test);
			    CommonMethods.NavigateTo("Building Coverage",test);
			    CPCoverages.CP_BuildingCoveragePage(strRegressionID, transaction,"Location 1 Building 1", test);
			    CommonMethods.NavigateToPage("General Liability",test);
			    CommonMethods.NavigateToPageBasedOnOccurence("Prem & Prod","1",test);
			    CommonMethods.NavigateToPage("Classifications (1)",test);
				GLClassificationsPage.GL_ClassificationsPage(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);	
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			if(transactionsList.contains(constants.AmendConvertToPolicy)){
				String transaction = constants.AmendConvertToPolicy;
				CommonMethods.NavigateTo("Commercial Package",test);
				CommonMethods.NavigateToPage("Commercial Property",test);
				CommonMethods.NavigateTo("Personal Property Coverage (1)",test);
				CPCoverages.CP_BusinessPersonalProperty(strRegressionID, transaction, "Location 1 Building 1", test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);	
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			if(transactionsList.contains(constants.AmendProRataEndorsement3)){
				String transaction = constants.AmendProRataEndorsement3;
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Package",test);
				CommonMethods.NavigateTo("Commercial Inland Marine",test);
				CommonMethods.NavigateTo("Exhibition Floater Coverage",test);
				CIMExhibitionFloaterCoverage.ExhibitionFloaterCoverage(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);	
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				//CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("WI CP Regression test  failed", true, false);
			testTearDown(se);
		}
	}

}
