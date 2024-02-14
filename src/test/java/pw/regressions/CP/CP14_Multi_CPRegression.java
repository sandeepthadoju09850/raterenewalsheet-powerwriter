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
import pw.pages.CAF.CAF_InsuringAgreements;
import pw.pages.CAF.CAF_Locations;
import pw.pages.CAF.CrimeAndFidelity_Main;
import pw.pages.CIM.CIM_AccountsRecievable;
import pw.pages.CIM.CIM_Buildings;
import pw.pages.CIM.CIM_Cargo;
import pw.pages.CIM.CIM_CargoOtherCoverages;
import pw.pages.CIM.CIM_CargoTerminal;
import pw.pages.CIM.CIM_ContractorsEquipment;
import pw.pages.CIM.CIM_ContractorsOtherCoverages;
import pw.pages.CIM.CIM_ContractorsScheduledEquipment;
import pw.pages.CIM.CIM_ExhibitionFloaterCoverage;
import pw.pages.CIM.CIM_ExhibitionFloaterDescribedProperty;
import pw.pages.CIM.CIM_FineArtsFloater;
import pw.pages.CIM.CIM_Locations;
import pw.pages.CIM.CIM_Main;
import pw.pages.CIM.CIM_MotorTruckCargo;
import pw.pages.CIM.CIM_MotorTruckCargoOtherCoverages;
import pw.pages.CIM.CIM_MotorTruckCargo_Terminals;
import pw.pages.CIM.CIM_ScheduledPropertyFloater;
import pw.pages.CIM.CIM_ScheduledPropertyFloaterOtherCoverages;
import pw.pages.CIM.CIM_Signs;
import pw.pages.CIM.CIM_TransitFloater;
import pw.pages.CIM.CIM_TransitFloater_OtherCoverages;
import pw.pages.CIM.CIM_TransitFloater_Terminal;
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
import pw.pages.CP.CP_Locations;
import pw.pages.CP.CP_MNFireSafetySurcharge;
import pw.pages.CS.CyberSecurity_Main;
import pw.pages.EPLI.CP_EmploymentPracticesLiabilityInsurancePage;
import pw.pages.GL.GL_AbuseAndMolestation;
import pw.pages.GL.GL_AbuseAndMolestationClassification;
import pw.pages.GL.GL_AdditionalInterest;
import pw.pages.GL.GL_Classifications;
import pw.pages.GL.GL_EmployeeBenefitsLiability;
import pw.pages.GL.GL_ExperienceRating;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_MiscellaneousCoverage;
import pw.pages.GL.GL_OptionalProvisions;
import pw.pages.GL.GL_PremAndProd;
import pw.pages.GL.GL_SpecialityOption;
import pw.pages.GL.GeneralLiability;
import pw.pages.PLCM.CP_ProfessionalLiabilityClaims;

public class CP14_Multi_CPRegression extends BaseTest{
	ExtentReports extent;
	ExtentTest test;
	
	public static void MultiCpMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params, String strRegressionID,File file,XSSFWorkbook workbook,ExtentTest test) throws IOException {
		

	PW_Login LoginPage = TestPageFactory.initElements(se, PW_Login.class);
	PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
	PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
	PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
	PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
	CP_CommercialPackage CommercialPackage =  TestPageFactory.initElements(se, CP_CommercialPackage.class);
	CP_CommercialProperty CommercialProperty =  TestPageFactory.initElements(se, CP_CommercialProperty.class);
	CP_BlanketInsurance BlanketInsurance =  TestPageFactory.initElements(se, CP_BlanketInsurance.class);
	CP_Locations Locations = TestPageFactory.initElements(se, CP_Locations.class);
	CP_Buildings Bulidings = TestPageFactory.initElements(se, CP_Buildings.class);
	CP_AdditionalInterest AdditionalInterest = TestPageFactory.initElements(se, CP_AdditionalInterest.class);
	GeneralLiability GeneralLiabilityPage = TestPageFactory.initElements(se, GeneralLiability.class);
	GL_Location GLLocations = TestPageFactory.initElements(se, GL_Location.class);
	GL_PremAndProd GLPremAndProd = TestPageFactory.initElements(se, GL_PremAndProd.class);
	GL_Classifications GLClassifications = TestPageFactory.initElements(se, GL_Classifications.class);
	GL_SpecialityOption GLSpecialityOption = TestPageFactory.initElements(se, GL_SpecialityOption.class);
	GL_SpecialityOption GLSpecialityOptionPage=TestPageFactory.initElements(se, GL_SpecialityOption.class);
	GL_AbuseAndMolestation GL_AbuseAndMolestationPage = TestPageFactory.initElements(se,
			GL_AbuseAndMolestation.class);
	GL_AbuseAndMolestationClassification GL_AbuseAndMolestationClassificationPage = TestPageFactory.initElements(se,
			GL_AbuseAndMolestationClassification.class);
	GL_AdditionalInterest GLAdditionalInterest = TestPageFactory.initElements(se, GL_AdditionalInterest.class);
	GL_OptionalProvisions GLOptionalProvisions = TestPageFactory.initElements(se, GL_OptionalProvisions.class);
	GL_ExperienceRating GLExperienceRating = TestPageFactory.initElements(se, GL_ExperienceRating.class);
	CIM_Main CIMMainPage  =  TestPageFactory.initElements(se, CIM_Main.class);
	CIM_Locations CIMLocationsPage = TestPageFactory.initElements(se, CIM_Locations.class);
	CIM_Buildings CIMBuildings = TestPageFactory.initElements(se, CIM_Buildings.class);
	CIM_Cargo CIMCargo = TestPageFactory.initElements(se, CIM_Cargo.class);
	CIM_CargoOtherCoverages CIMCargoOtherCoverages = TestPageFactory.initElements(se, CIM_CargoOtherCoverages.class);
	CIM_CargoTerminal CIMCargoTerminal = TestPageFactory.initElements(se, CIM_CargoTerminal.class);
	CIM_ContractorsScheduledEquipment CIMContractorsScheduledEquipment = TestPageFactory.initElements(se, CIM_ContractorsScheduledEquipment.class);
	CIM_ContractorsEquipment CIMContractorsEquipment = TestPageFactory.initElements(se, CIM_ContractorsEquipment.class);
	CIM_ContractorsOtherCoverages CIMContractorsOtherCoverages = TestPageFactory.initElements(se, CIM_ContractorsOtherCoverages.class);
	CIM_ExhibitionFloaterDescribedProperty CIMExhibitionFloaterDescribedProperty = TestPageFactory.initElements(se, CIM_ExhibitionFloaterDescribedProperty.class);
	CIM_ExhibitionFloaterCoverage CIMExhibitionFloaterCoverage = TestPageFactory.initElements(se, CIM_ExhibitionFloaterCoverage.class);
	CIM_MotorTruckCargo CIMMotorTruckCargo = TestPageFactory.initElements(se, CIM_MotorTruckCargo.class);
	CIM_MotorTruckCargoOtherCoverages CIMMotorTruckCargoOtherCoverages = TestPageFactory.initElements(se, CIM_MotorTruckCargoOtherCoverages.class);
	CIM_MotorTruckCargo_Terminals CIMMotorTruckCargo_Terminals = TestPageFactory.initElements(se, CIM_MotorTruckCargo_Terminals.class);
	CIM_ScheduledPropertyFloater CIMScheduledPropertyFloater = TestPageFactory.initElements(se, CIM_ScheduledPropertyFloater.class);
	CIM_ScheduledPropertyFloaterOtherCoverages CIMScheduledPropertyFloaterOtherCoverages = TestPageFactory.initElements(se, CIM_ScheduledPropertyFloaterOtherCoverages.class);
	CIM_Signs CIMSigns = TestPageFactory.initElements(se, CIM_Signs.class);
	CIM_TransitFloater CIMTransitFloater  = TestPageFactory.initElements(se, CIM_TransitFloater.class);
	CIM_TransitFloater_OtherCoverages CIMTransitFloater_OtherCoverages = TestPageFactory.initElements(se, CIM_TransitFloater_OtherCoverages.class);
	CIM_TransitFloater_Terminal CIM_TransitFloater_Terminal = TestPageFactory.initElements(se, CIM_TransitFloater_Terminal.class);
	CP_EmploymentPracticesLiabilityInsurancePage EmploymentPracticesLiabilityInsurancePage = TestPageFactory.initElements(se, CP_EmploymentPracticesLiabilityInsurancePage.class);
	CP_ProfessionalLiabilityClaims ProfessionalLiabilityClaims  = TestPageFactory.initElements(se, CP_ProfessionalLiabilityClaims.class);
	PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
	PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
	PW_KYTaxExemption KYTaxExemption  = TestPageFactory.initElements(se, PW_KYTaxExemption.class);
	CrimeAndFidelity_Main CrimeAndFidelity = TestPageFactory.initElements(se, CrimeAndFidelity_Main.class);
	CAF_Locations CAFLocations = TestPageFactory.initElements(se, CAF_Locations.class);
	CAF_InsuringAgreements CAFInsuringAgreements = TestPageFactory.initElements(se, CAF_InsuringAgreements.class);
	CIM_AccountsRecievable CIMAccountsRecievable = TestPageFactory.initElements(se, CIM_AccountsRecievable.class);
	CIM_FineArtsFloater CIMFineArtsFloater = TestPageFactory.initElements(se, CIM_FineArtsFloater.class);
	GL_EmployeeBenefitsLiability EmployeeBenefitsLiability = TestPageFactory.initElements(se, GL_EmployeeBenefitsLiability.class);
	CP_Coverages CPCoverages = TestPageFactory.initElements(se, CP_Coverages.class);
	CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
	GL_MiscellaneousCoverage GL_MiscellaneousCoveragePage = TestPageFactory.initElements(se, GL_MiscellaneousCoverage.class);
	CP_MNFireSafetySurcharge CPMNFireSafetySurcharge = TestPageFactory.initElements(se, CP_MNFireSafetySurcharge.class);
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
			String cyberChkY = CommercialPackage.CommercialPackage(strRegressionID,transaction,test);
			CommercialProperty.CommercialPropertyMethod(strRegressionID, transaction, test);
			BlanketInsurance.BlanketInsurance(strRegressionID, transaction, test);
			Locations.Locations(strRegressionID, transaction, test);
			Bulidings.BuildingDetails(strRegressionID, transaction, test);
			CommonMethods.NavigateToNextScreen(test);
			AdditionalInterest.CP_AddInterest(strRegressionID, transaction, test);
			GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID, transaction, test);
			GLLocations.GL_Location_Details(strRegressionID, transaction, test);
			CommonMethods.NavigateToNextScreen(test);
			GLPremAndProd.GL_PremAndProdPage(strRegressionID, transaction, test);
			GLClassifications.GL_ClassificationsPage(strRegressionID, transaction, test);
			GLSpecialityOption.GL_SpecialityOption_Details(strRegressionID, transaction, test);
			GLAdditionalInterest.GL_AdditionalInterest_Details(strRegressionID, transaction, test);
			GLOptionalProvisions.CP_GLOptionalProvisions(strRegressionID, transaction, test);
			GL_MiscellaneousCoveragePage.CP_GLMiscellaneousCoverage(strRegressionID,transaction,test);
			GLExperienceRating.GLExperienceRatingPage(strRegressionID, transaction, test);
			CommonMethods.NavigateTo("Commercial Inland Marine", test);
			CIMMainPage.CIM_Main(strRegressionID, transaction, test);
			CIMLocationsPage.CIM_Locations(strRegressionID, transaction, test);
			CommonMethods.NavigateToNextScreen(test);
			CIMCargo.Cargo(strRegressionID, transaction, test);
			CIMCargoOtherCoverages.CargoOtherCoverages(strRegressionID, transaction, test);
			CIMCargoTerminal.CargoTerminal(strRegressionID, transaction, test);
			CIMContractorsScheduledEquipment.CIM_ContrScheduledEquip(strRegressionID, transaction, test);
			CIMContractorsEquipment.ContractorsEquipment(strRegressionID, transaction, test);
			CIMContractorsOtherCoverages.CIMContractorsOtherCoverages(strRegressionID, transaction, test);
			CIMExhibitionFloaterDescribedProperty.CIMExhibitionFloaterDescribedProperty(strRegressionID, transaction, test);
			CIMExhibitionFloaterCoverage.ExhibitionFloaterCoverage(strRegressionID, transaction, test);
			CIMMotorTruckCargo.CIM_MotorTruckCargoPage(strRegressionID, transaction, test);
			CIMMotorTruckCargoOtherCoverages.MotorTruckCargoOtherCoverages(strRegressionID, transaction, test);
			CIMMotorTruckCargo_Terminals.CIM_MotorTruckCargo_TerminalsPage(strRegressionID, transaction, test);
			CIMScheduledPropertyFloater.CIM_ScheduledPropertyFloaterPage(strRegressionID, transaction, test);
			CIMScheduledPropertyFloaterOtherCoverages.ScheduledPropertyFloaterOtherCoverages(strRegressionID, transaction, test);
			CIMSigns.CIMSigns(strRegressionID, transaction, test);
			CIMTransitFloater.CIM_TransitFloaterPage(strRegressionID, transaction, test);
			CIMTransitFloater_OtherCoverages.TransitFloater_OtherCoverages(strRegressionID, transaction, test);
			CIM_TransitFloater_Terminal.TransitFloater_Terminal(strRegressionID, transaction, test);
			EmploymentPracticesLiabilityInsurancePage.CP_EmployPracLiabInsPage(strRegressionID, transaction, test);
			ProfessionalLiabilityClaims.CP_ProfessionalLiabilityClaimsPage(strRegressionID, transaction, test);
			CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
			CommonMethods.NavigateToNextScreen(test);
			KYTaxExemption.KYTaxExemption(strRegressionID, transaction, test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		}
		
		//Convert To Policy
		if(transactionsList.contains("ConvertToPolicy")){
			String transaction = "ConvertToPolicy";
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		}
		
		//FlatEndorsement
		if(transactionsList.contains("FlatEndorsement1")){
			String transaction = "FlatEndorsement1";
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			CommonMethods.NavigateTo("Commercial Package",test);
			CommercialPackage.CommercialPackage(strRegressionID,transaction,test);
			CommercialProperty.CommercialPropertyMethod(strRegressionID, transaction, test);
			CommonMethods.NavigateTo("General Liability",test);
			GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID, transaction, test);
			CommonMethods.CollapseAllAndNavigateTo("Commercial Package","20-CP",test);
			CommonMethods.NavigateTo("General Liability",test);
			CommonMethods.NavigateTo("Emp Benefits Liab",test);
			EmployeeBenefitsLiability.GL_EmployeeBenefitsLiability_Details(strRegressionID, transaction, test);
			GLSpecialityOption.GL_SpecialityOption_Details(strRegressionID, transaction, test);
			CommonMethods.CollapseAllAndNavigateTo("Commercial Package","20-CP",test);
			CommonMethods.NavigateTo("Crime and Fidelity",test);
			CrimeAndFidelity.CrimeAndFidelity_MainPage(strRegressionID, transaction, test);
			CAFLocations.CAF_Locations_Details(strRegressionID, transaction, test);		
			CAFInsuringAgreements.CAF_InsuringAgreementsPage(strRegressionID, transaction, test);
			CommonMethods.CollapseAllAndNavigateTo("Commercial Package","20-CP",test);
			CommonMethods.NavigateTo("Commercial Inland Marine",test);
			CIMMainPage.CIM_Main(strRegressionID, transaction, test);
			CommonMethods.NavigateToNextScreen(test);
			CIMBuildings.CIM_Buildings(strRegressionID, transaction, test);
			CIMAccountsRecievable.CIMAccountsRecievable(strRegressionID, transaction, test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			//CommonMethods.getDashboardForms(strRegressionID,transaction,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		}
		
		//ProRataEndorsement
		if(transactionsList.contains("ProRataEndorsement1")){
			String transaction = "ProRataEndorsement1";
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			CommonMethods.NavigateTo("Commercial Package",test);
			CommonMethods.NavigateTo("Commercial Property",test);
			CommonMethods.NavigateToPageContaingText("Locations", test);
			//@Sai - Modified transaction name to handle the UI change for deleting a location. This steps adds location 7
			Locations.Locations(strRegressionID, "ProRataEndorsement1-01", test);
			Bulidings.BuildingDetails(strRegressionID, "ProRataEndorsement1-01", test);
			//@Sai - This step deletes location 2
			CommonMethods.NavigateTo("Buildings (8)",test);
			Bulidings.BuildingDetails(strRegressionID, transaction, test);
			CommonMethods.NavigateToPageContaingText("Locations", test);
			Locations.Locations(strRegressionID, transaction, test);
			CommonMethods.CollapseAllAndNavigateTo("Commercial Package","20-CP",test);
			CommonMethods.NavigateTo("General Liability",test);
			CommonMethods.NavigateToNextScreen(test);
			GLLocations.GL_Location_Details(strRegressionID, transaction, test);
			CommonMethods.NavigateToNextScreen(test);
			CommonMethods.NavigateToNextScreen(test);
			GLClassifications.GL_ClassificationsPage(strRegressionID, transaction, test);
			CommonMethods.NavigateToNextScreen(test);
			GLSpecialityOption.GL_SpecialityOption_Details(strRegressionID, transaction, test);
			CommonMethods.CollapseAllAndNavigateTo("Commercial Package","20-CP",test);
			CommonMethods.NavigateTo("Crime and Fidelity",test);
			CommonMethods.NavigateTo("Insuring Agreements (1)",test);
			CAFInsuringAgreements.CAF_InsuringAgreementsPage(strRegressionID, transaction, test);
			CommonMethods.CollapseAllAndNavigateTo("Commercial Package","20-CP",test);
			CommonMethods.NavigateTo("Commercial Inland Marine",test);
			CIMMainPage.CIM_Main(strRegressionID, transaction, test);
			CIMLocationsPage.CIM_Locations(strRegressionID, transaction, test);
			CommonMethods.CollapseAllAndNavigateTo("Commercial Package","20-CP",test);
			CommonMethods.NavigateTo("Commercial Inland Marine",test);
			CommonMethods.NavigateTo("Fine Arts Floater",test);
			CIMFineArtsFloater.Add_FineArtsFloater(strRegressionID, transaction, test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);	
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			//CommonMethods.getDashboardForms(strRegressionID,transaction,test);
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
		
		//Reinstatement Pro-Rate
		if(transactionsList.contains("Reinstatement")){
			String transaction = "Reinstatement";
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		}
		
		//Change Name and Address
		if(transactionsList.contains("ChangeNameAddress")){
			String transaction = "ChangeNameAddress";
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		}
		
		
		//Quote For Renewal
		if(transactionsList.contains("QuoteForRenewal")){
			String transaction = "QuoteForRenewal";
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			CommonMethods.NavigateTo("Commercial Package",test);
			CommonMethods.NavigateTo("Commercial Property",test);
			CommonMethods.NavigateTo("Buildings (7)",test);
			CommonMethods.NavigateToPageContaingText("Loc 2 Bldg 1 - Detroit, MI",test);
			CommonMethods.NavigateTo("Vacancy Permit Coverage (1)",test);
			CPCoverages.CP_VacancyPermitCoveragePage(strRegressionID, transaction,"Location 2 Building 1", test);
			CommonMethods.CollapseAllAndNavigateTo("Commercial Package","20-CP",test);
			CommonMethods.NavigateTo("Commercial Property",test);
			CommonMethods.NavigateTo("Additional Interest (3)",test);
			//CommonMethods.NavigateTo("Magic Moonbeams",test);
			AdditionalInterest.CP_AddInterest(strRegressionID, transaction, test);
			CommonMethods.NavigateTo("General Liability", test);
			CommonMethods.NavigateTo("Specialty Option", test);
			GLSpecialityOptionPage.GL_SpecialityOption_Details(strRegressionID, transaction, test);
			GL_AbuseAndMolestationPage.GL_AbuseAndMolestationMethod(strRegressionID, transaction, test);
			GL_AbuseAndMolestationClassificationPage.GL_AbuseAndMolestationClassificationMethod(strRegressionID,
					transaction, test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		}
		
		//Convert QFR To Policy
		if(transactionsList.contains("ConvertQFRToPolicy")){
			String transaction = "ConvertQFRToPolicy";
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
		}
		
	} catch (Exception e) {
		e.printStackTrace();
		se.verify().verifyEquals("Multi_CPRegression test  failed", true, false);
		testTearDown(se);
	}
}

}
