package pw.regressions.PM;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.relevantcodes.extentreports.ExtentTest;

import Libraries.automation.common.BaseTest;
import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.SeHelper;
import Libraries.automation.common.Utils.TestPageFactory;
import Libraries.automation.common.framework.Browser.Browsers;
import pw.pages.CA.CA_AdditionalCoverages;
import pw.pages.CA.CA_AdditionalInterest;
import pw.pages.CA.CA_CommercialAuto;
import pw.pages.CA.CA_HiredOrBorrowedAuto;
import pw.pages.CA.CA_Locations;
import pw.pages.CA.CA_NonOwnedLiability;
import pw.pages.CA.CA_StateCoverageLimits;
import pw.pages.CA.CA_Symbols;
import pw.pages.CA.CA_Vehicles;
import pw.pages.CAF.CAF_InsuringAgreements;
import pw.pages.CAF.CAF_Locations;
import pw.pages.CAF.CrimeAndFidelity_Main;
import pw.pages.CIM.CIM_AccountsRecievable;
import pw.pages.CIM.CIM_Buildings;
import pw.pages.CIM.CIM_ContractorsEquipment;
import pw.pages.CIM.CIM_ContractorsOtherCoverages;
import pw.pages.CIM.CIM_ContractorsScheduledEquipment;
import pw.pages.CIM.CIM_InstallationFloater;
import pw.pages.CIM.CIM_Locations;
import pw.pages.CIM.CIM_Main;
import pw.pages.COMMON.CAWC_AdditionalNamedInsured;
import pw.pages.COMMON.CAWC_PW_Producers;
import pw.pages.COMMON.CAWC_ProductInfo;
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
import pw.pages.CP.CP_Locations;
import pw.pages.EPLI.CP_EmploymentPracticesLiabilityInsurancePage;
import pw.pages.GL.GL_Classifications;
import pw.pages.GL.GL_EmployeeBenefitsLiability;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_PremAndProd;
import pw.pages.GL.GeneralLiability;
import pw.pages.PLCM.CP_ProfessionalLiabilityClaims;
import pw.pages.WC.WC_Classifications;
import pw.pages.WC.WC_Locations;
import pw.pages.WC.WC_NameLocationLinking;
import pw.pages.WC.WC_StateInformation;
import pw.pages.WC.WC_WorkersCompensation;

public class PM23_WI_CATCWCPMRegression extends BaseTest {
	
	public static void PM23_WI_CATCWCPMRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login  LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		CAWC_ProductInfo ProductInfo = TestPageFactory.initElements(se, CAWC_ProductInfo.class);
		CAWC_PW_Producers CAWC_PW_ProducersPage = TestPageFactory.initElements(se, CAWC_PW_Producers.class);
		CAWC_AdditionalNamedInsured AdditionalNamedInsured =TestPageFactory.initElements(se, CAWC_AdditionalNamedInsured.class);
		PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
		PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
		CP_CommercialPackage CommercialPackage =  TestPageFactory.initElements(se, CP_CommercialPackage.class);
		CP_CommercialProperty CommercialPropertyPage = TestPageFactory.initElements(se, CP_CommercialProperty.class);
		CP_Locations CplocationsPage = TestPageFactory.initElements(se, CP_Locations.class);
		CP_Buildings BuildingsPage = TestPageFactory.initElements(se, CP_Buildings.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		GeneralLiability GeneralLiabilityPage = TestPageFactory.initElements(se, GeneralLiability.class);
		GL_Location GLLocationPage = TestPageFactory.initElements(se, GL_Location.class);
		GL_PremAndProd GLPremAndProdPage = TestPageFactory.initElements(se, GL_PremAndProd.class);
		GL_Classifications GLClassificationsPage = TestPageFactory.initElements(se, GL_Classifications.class);
		CA_CommercialAuto CommercialAuto = TestPageFactory.initElements(se, CA_CommercialAuto.class);
		CA_StateCoverageLimits StateCoverageLimits = TestPageFactory.initElements(se, CA_StateCoverageLimits.class);
		CA_Locations Locations = TestPageFactory.initElements(se, CA_Locations.class);
		CA_Vehicles Vehicles = TestPageFactory.initElements(se, CA_Vehicles.class);
		CA_AdditionalCoverages AdditionalCoverages = TestPageFactory.initElements(se, CA_AdditionalCoverages.class);
		CA_Symbols CA_SymbolsPage = TestPageFactory.initElements(se, CA_Symbols.class);
		CA_HiredOrBorrowedAuto CAHiredOrBorrowedAuto = TestPageFactory.initElements(se, CA_HiredOrBorrowedAuto.class);
		CA_NonOwnedLiability NonOwnedLiability = TestPageFactory.initElements(se, CA_NonOwnedLiability.class);
		WC_Locations WC_LocationsPage = TestPageFactory.initElements(se, WC_Locations.class);
		WC_WorkersCompensation WC_WorkersCompensationPage = TestPageFactory.initElements(se,WC_WorkersCompensation.class);
		WC_NameLocationLinking WC_NameLocationLinkingPage = TestPageFactory.initElements(se,WC_NameLocationLinking.class);
		WC_StateInformation WC_StateInformationPage = TestPageFactory.initElements(se, WC_StateInformation.class);
		WC_Classifications WC_ClassificationsPage = TestPageFactory.initElements(se, WC_Classifications.class);
		CrimeAndFidelity_Main CrimeAndFidelity_MainPage = TestPageFactory.initElements(se, CrimeAndFidelity_Main.class);
		CAF_Locations CAF_LocationsPage =TestPageFactory.initElements(se, CAF_Locations.class);
		CAF_InsuringAgreements CAF_InsuringAgreementsPage =TestPageFactory.initElements(se, CAF_InsuringAgreements.class);
		CA_AdditionalInterest CAAdditionalInterest = TestPageFactory.initElements(se, CA_AdditionalInterest.class);
		CIM_Main CIMMainPage  =  TestPageFactory.initElements(se, CIM_Main.class);
		CIM_Locations CIMLocationsPage = TestPageFactory.initElements(se, CIM_Locations.class);
		CIM_Buildings CIMBuildingsPage = TestPageFactory.initElements(se, CIM_Buildings.class);
		CIM_ContractorsScheduledEquipment CIMContractorsScheduledEquipment = TestPageFactory.initElements(se, CIM_ContractorsScheduledEquipment.class);
		CIM_ContractorsEquipment CIMContractorsEquipment = TestPageFactory.initElements(se, CIM_ContractorsEquipment.class);
		CIM_ContractorsOtherCoverages CIMContractorsOtherCoverages = TestPageFactory.initElements(se, CIM_ContractorsOtherCoverages.class);
		CIM_AccountsRecievable CIM_AccountsRecievablePage = TestPageFactory.initElements(se, CIM_AccountsRecievable.class);
		CIM_InstallationFloater CIM_InstallFloaterPage = TestPageFactory.initElements(se, CIM_InstallationFloater.class);
		CP_EmploymentPracticesLiabilityInsurancePage CPEmploymentPracticesLiabilityInsurancePage = TestPageFactory.initElements(se, CP_EmploymentPracticesLiabilityInsurancePage.class);
		CP_ProfessionalLiabilityClaims CP_ProfessionalLiabilityClaimsPage = TestPageFactory.initElements(se, CP_ProfessionalLiabilityClaims.class);
		GL_EmployeeBenefitsLiability GLEmployeeBenefitsLiabilityPage = TestPageFactory.initElements(se, GL_EmployeeBenefitsLiability.class);
		PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);
		

		try {
			
			List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
			//int iteration = 0;
			CommonFunPage.PWAppStartUp(test);
			
			//New Transaction Actions
			
			if (transactionsList.contains("CANewQuote")) {
				String transaction = "CANewQuote";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);

				LoginPage.PWAppLogin(strRegressionID, transaction, test);
				WelcomePage.homePage(strRegressionID, transaction, test);
				ProductInfo.quote_ProdInfo(strRegressionID, transaction, test);
				CAWC_PW_ProducersPage.AddProducers(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Auto", test);
				CommercialAuto.CommercialAuto(strRegressionID, transaction, suspendSheet, test);
				StateCoverageLimits.StateCoverageLimits(strRegressionID, transaction, suspendSheet, test);
				CA_SymbolsPage.Symbols(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Vehicles", test);
				Vehicles.CA_VehiclesPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Additional Coverages",test);
				AdditionalCoverages.AdditionalCoverages(strRegressionID, transaction, suspendSheet, test);
				CAHiredOrBorrowedAuto.HiredOrBorrowedAuto(strRegressionID, transaction, suspendSheet, test);
				NonOwnedLiability.CANonOwnedLiabilityPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.CollapseAllAndNavigateTo("Commercial Auto", "-A", test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				CommonMethods.NavigateToNextScreen(test);
				BillingTab.getUpdateBillingTab(strRegressionID, transaction, test);
				CommonMethods.validateStatusModelTypeOnAnalyticsTab(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}
			
			
			if (transactionsList.contains("CARedoNewQuote")) {
				String transaction = "CARedoNewQuote";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
				ProductInfo.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Additional Named Insured",test);
				AdditionalNamedInsured.AdditionalNamedInsured(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Additional Interest",test);
				CAAdditionalInterest.AdditionalInterest(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				CommonMethods.NavigateToNextScreen(test);
				CommonMethods.validateStatusModelTypeOnAnalyticsTab(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}
		
			if(transactionsList.contains("TCNewQuote")){
				String transaction = "TCNewQuote";
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				WelcomePage.homePage(strRegressionID,transaction, test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				ProducerPage.AddProducers(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Target Contractor Protector",test);
				String cyberChkY = CommercialPackage.CommercialPackage(strRegressionID,transaction,test);
				CommercialPropertyPage.CommercialPropertyMethod(strRegressionID,transaction,test);
				CplocationsPage.Locations(strRegressionID, transaction, test);
				BuildingsPage.BuildingDetails(strRegressionID, transaction,test);
				CommonMethods.CollapseAllAndNavigateTo("Target Contractor Protector", "-TC", test);
				CommonMethods.NavigateTo("General Liability", test);
				GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID, transaction, test);
				GLLocationPage.GL_Location_Details(strRegressionID, transaction, test);
				GLPremAndProdPage.GL_PremAndProdPage(strRegressionID, transaction, test);
				GLClassificationsPage.GL_ClassificationsPage(strRegressionID, transaction, test);
				GLEmployeeBenefitsLiabilityPage.GL_EmployeeBenefitsLiability_Details(strRegressionID, transaction,test);
				CommonMethods.CollapseAllAndNavigateTo("Target Contractor Protector", "-TC", test);
				CommonMethods.NavigateTo("Commercial Inland Marine", test);
				CIMMainPage.CIM_Main(strRegressionID, transaction, test);
				CIMLocationsPage.CIM_Locations(strRegressionID, transaction, test);
				CIMBuildingsPage.CIM_Buildings(strRegressionID,transaction,test);
				CIM_AccountsRecievablePage.CIMAccountsRecievable(strRegressionID,transaction,test);
				CIMContractorsScheduledEquipment.CIM_ContrScheduledEquip(strRegressionID, transaction, test);
				CIMContractorsEquipment.ContractorsEquipment(strRegressionID, transaction, test);
				CIMContractorsOtherCoverages.CIMContractorsOtherCoverages(strRegressionID, transaction, test);
				CIM_InstallFloaterPage.CIM_InstallationFloater_Details(strRegressionID, transaction, test);
				CommonMethods.NavigateToNextScreen(test);
				CPEmploymentPracticesLiabilityInsurancePage.CP_EmployPracLiabInsPage(strRegressionID, transaction,test);
				CP_ProfessionalLiabilityClaimsPage.CP_ProfessionalLiabilityClaimsPage(strRegressionID, transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				CommonMethods.NavigateToNextScreen(test);
				BillingTab.getUpdateBillingTab(strRegressionID, transaction, test);
				CommonMethods.validateStatusModelTypeOnAnalyticsTab(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}
			
			if(transactionsList.contains("TCConvertToPolicy")){
				String transaction = "TCConvertToPolicy";
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				CommonMethods.NavigateToNextScreen(test);
				CommonMethods.validateStatusModelTypeOnAnalyticsTab(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			if(transactionsList.contains("TCRedoConvertToPolicy")){
				String transaction = "TCRedoConvertToPolicy";
				ProductInfo.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Target Contractor Protector",test);
				CommonMethods.NavigateTo("Commercial Property", test);
				CommonMethods.NavigateTo("Buildings (1)", test);
				BuildingsPage.BuildingDetails(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				CommonMethods.NavigateToNextScreen(test);
				CommonMethods.validateStatusModelTypeOnAnalyticsTab(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
		
			if (transactionsList.contains("WCNewQuote")) {
				String transaction = "WCNewQuote";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);

				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				WelcomePage.homePage(strRegressionID, transaction, test);
				ProductInfo.quote_ProdInfo(strRegressionID, transaction, test);
				CAWC_PW_ProducersPage.AddProducers(strRegressionID, transaction, test);
				CommonMethods.NavigateToNextScreen(test);
				WC_LocationsPage.Locations(strRegressionID, transaction, suspendSheet, test);
				WC_WorkersCompensationPage.WorkersCompensation(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateToNextScreen(test);
				WC_StateInformationPage.StateInformation(strRegressionID, transaction, suspendSheet, test);
				WC_ClassificationsPage.Classifications(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				CommonMethods.NavigateToNextScreen(test);
				BillingTab.getUpdateBillingTab(strRegressionID, transaction, test);
				CommonMethods.validateStatusModelTypeOnAnalyticsTab(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			if (transactionsList.contains("WCRedoNewQuote")) {
				String transaction = "WCRedoNewQuote";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
				ProductInfo.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Workers Compensation",test);
				WC_WorkersCompensationPage.WorkersCompensation(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateToNextScreen(test);
				CommonMethods.NavigateTo("State Information (1)",test);
				CommonMethods.NavigateTo("Wisconsin",test);
				CommonMethods.NavigateTo("Classifications (2)",test);
				WC_ClassificationsPage.Classifications(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				CommonMethods.NavigateToNextScreen(test);
				CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				CommonMethods.validateStatusModelTypeOnAnalyticsTab(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			
		}
	}
		
		catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("PM23_WI_CATCWCPMRegressionMethod test failed", true, false);
			testTearDown(se);
		}
	}
}
