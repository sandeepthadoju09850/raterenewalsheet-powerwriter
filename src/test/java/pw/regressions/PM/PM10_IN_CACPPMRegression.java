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
import pw.pages.CA.CA_CommercialAuto;
import pw.pages.CA.CA_Drivers;
import pw.pages.CA.CA_ExperienceRating;
import pw.pages.CA.CA_LiabilityExperienceRating;
import pw.pages.CA.CA_Locations;
import pw.pages.CA.CA_PhysicalDamageExperienceRating;
import pw.pages.CA.CA_RepossessedAutoNone;
import pw.pages.CA.CA_ScheduleRating;
import pw.pages.CA.CA_StateCoverageLimits;
import pw.pages.CA.CA_Symbols;
import pw.pages.CA.CA_Vehicles;
import pw.pages.CIM.CIM_AccountsRecievable;
import pw.pages.CIM.CIM_BoatAndMotorCoverages;
import pw.pages.CIM.CIM_Buildings;
import pw.pages.CIM.CIM_CommercialArticles;
import pw.pages.CIM.CIM_ComputerCoverage;
import pw.pages.CIM.CIM_ComputerLocationAndLimits;
import pw.pages.CIM.CIM_GolfCartCoverage;
import pw.pages.CIM.CIM_GolfCartCoveredCourses;
import pw.pages.CIM.CIM_GolfCoursesTeesAndGreens;
import pw.pages.CIM.CIM_InstallationFloater;
import pw.pages.CIM.CIM_LaunderersAndDryCleanersCoverage;
import pw.pages.CIM.CIM_LaunderesAndDryCleaners_LocationsAndLimits;
import pw.pages.CIM.CIM_Locations;
import pw.pages.CIM.CIM_Main;
import pw.pages.CIM.CIM_MotorTruckCargo;
import pw.pages.CIM.CIM_MotorTruckCargoOtherCoverages;
import pw.pages.CIM.CIM_MotorTruckCargo_Terminals;
import pw.pages.CIM.CIM_PhysiciansAndSurgeonsEquipment;
import pw.pages.CIM.CIM_TransitFloater;
import pw.pages.CIM.CIM_TransitFloater_OtherCoverages;
import pw.pages.CIM.CIM_TransitFloater_Terminal;
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
import pw.pages.COMMON.PW_ScheduleRatingIRPM;
import pw.pages.CP.CP_CommercialPackage;
import pw.pages.CS.CyberSecurity_Main;
import pw.pages.CU.CU_AutoDealersPolicyInfo;
import pw.pages.CU.CU_GLPolicyInfo;
import pw.pages.CU.CU_Main;
import pw.pages.CU.CU_UmbrellaOptions;
import pw.pages.GL.GL_AbuseAndMolestation;
import pw.pages.GL.GL_AbuseAndMolestationClassification;
import pw.pages.GL.GL_Classifications;
import pw.pages.GL.GL_EmployeeBenefitsLiability;
import pw.pages.GL.GL_ExperienceRating;
import pw.pages.GL.GL_LiquorLiability;
import pw.pages.GL.GL_LiquorLiability_Classifications;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_OptionalProvisions;
import pw.pages.GL.GL_PremAndProd;
import pw.pages.GL.GL_SpecialityOption;
import pw.pages.GL.GeneralLiability;
import pw.pages.PLCM.CP_ProfessionalLiabilityClaims;

public class PM10_IN_CACPPMRegression extends BaseTest {
	
	public static void PM10_IN_CACPPMRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login  LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		CAWC_ProductInfo ProductInfo = TestPageFactory.initElements(se, CAWC_ProductInfo.class);
		CAWC_PW_Producers CAWC_PW_ProducersPage = TestPageFactory.initElements(se, CAWC_PW_Producers.class);
		PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
		PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
		CP_CommercialPackage CommercialPackage =  TestPageFactory.initElements(se, CP_CommercialPackage.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		GeneralLiability GeneralLiabilityPage = TestPageFactory.initElements(se, GeneralLiability.class);
		GL_Location GLLocationPage = TestPageFactory.initElements(se, GL_Location.class);
		GL_PremAndProd GLPremAndProdPage = TestPageFactory.initElements(se, GL_PremAndProd.class);
		GL_Classifications GLClassificationsPage = TestPageFactory.initElements(se, GL_Classifications.class);
		CIM_Main CIMMainPage  =  TestPageFactory.initElements(se, CIM_Main.class);
		CIM_Locations CIMLocationsPage = TestPageFactory.initElements(se, CIM_Locations.class);
		CIM_MotorTruckCargo CIMMotorTruckCargo = TestPageFactory.initElements(se, CIM_MotorTruckCargo.class);
		CIM_MotorTruckCargoOtherCoverages CIMMotorTruckCargoOtherCoverages = TestPageFactory.initElements(se, CIM_MotorTruckCargoOtherCoverages.class);
		CIM_MotorTruckCargo_Terminals CIMMotorTruckCargo_Terminals = TestPageFactory.initElements(se, CIM_MotorTruckCargo_Terminals.class);
		CA_CommercialAuto CommercialAuto = TestPageFactory.initElements(se, CA_CommercialAuto.class);
		CA_StateCoverageLimits StateCoverageLimits = TestPageFactory.initElements(se, CA_StateCoverageLimits.class);
		CA_Locations Locations = TestPageFactory.initElements(se, CA_Locations.class);
		CA_Vehicles Vehicles = TestPageFactory.initElements(se, CA_Vehicles.class);
		CA_ExperienceRating CA_ExperienceRatingPage = TestPageFactory.initElements(se, CA_ExperienceRating.class);
		CA_LiabilityExperienceRating CA_LiabilityExperienceRatingPage = TestPageFactory.initElements(se, CA_LiabilityExperienceRating.class);
		CA_PhysicalDamageExperienceRating CA_PhysicalDamageExperienceRatingPage = TestPageFactory.initElements(se, CA_PhysicalDamageExperienceRating.class);
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
				CommonMethods.NavigateToNextScreen(test);
				Locations.Locations(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateToNextScreen(test);
				Vehicles.CA_VehiclesPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Experience Rating", test);
				CA_ExperienceRatingPage.ExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CA_LiabilityExperienceRatingPage.LiabilityExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CA_PhysicalDamageExperienceRatingPage.PhysicalDamageExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.CollapseAllAndNavigateTo("Commercial Auto", "-A", test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				CommonMethods.NavigateToNextScreen(test);
				BillingTab.getUpdateBillingTab(strRegressionID, transaction, test);
				CommonMethods.validateStatusModelTypeOnAnalyticsTab(strRegressionID,transaction,test);
			}
			
			if(transactionsList.contains("CPNewQuote")){
				String transaction = "CPNewQuote";
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				WelcomePage.homePage(strRegressionID,transaction, test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				ProducerPage.AddProducers(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Package",test);
				CommercialPackage.CommercialPackage(strRegressionID,transaction,test);
				CommonMethods.CollapseAllAndNavigateTo("Commercial Package", "-CP", test);
				CommonMethods.NavigateTo("General Liability", test);
				GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID, transaction, test);
				GLLocationPage.GL_Location_Details(strRegressionID, transaction, test);
				CommonMethods.NavigateToNextScreen(test);
				GLPremAndProdPage.GL_PremAndProdPage(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Classifications (1)", test);
				GLClassificationsPage.GL_ClassificationsPage(strRegressionID, transaction, test);
				CommonMethods.CollapseAllAndNavigateTo("Commercial Package", "-CP", test);
				CommonMethods.NavigateTo("Commercial Inland Marine", test);
				CIMMainPage.CIM_Main(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Motor Truck Cargo", test);
				CIMMotorTruckCargo.CIM_MotorTruckCargoPage(strRegressionID, transaction, test);
				CIMMotorTruckCargoOtherCoverages.MotorTruckCargoOtherCoverages(strRegressionID, transaction, test);
				CIMMotorTruckCargo_Terminals.CIM_MotorTruckCargo_TerminalsPage(strRegressionID, transaction, test);
				CommonMethods.CollapseAllAndNavigateTo("Commercial Package", "-CP", test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				CommonMethods.NavigateToNextScreen(test);
				BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
				CommonMethods.validateStatusModelTypeOnAnalyticsTab(strRegressionID,transaction,test);
				
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("PM10_IN_CACPPMRegressionMethod test failed", true, false);
			testTearDown(se);
		}
	}
}
