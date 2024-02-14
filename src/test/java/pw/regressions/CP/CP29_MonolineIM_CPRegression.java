package pw.regressions.CP;

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
import pw.pages.CIM.CIM_PhysiciansAndSurgeonsEquipment;
import pw.pages.CIM.CIM_TransitFloater;
import pw.pages.CIM.CIM_TransitFloater_OtherCoverages;
import pw.pages.CIM.CIM_TransitFloater_Terminal;
import pw.pages.COMMON.PW_BillingTab;
import pw.pages.COMMON.PW_CommonFun;
import pw.pages.COMMON.PW_CommonMethods;
import pw.pages.COMMON.PW_GenInfo;
import pw.pages.COMMON.PW_Home;
import pw.pages.COMMON.PW_Login;
import pw.pages.COMMON.PW_PremiumSummary;
import pw.pages.COMMON.PW_Producers;
import pw.pages.CP.CP_CommercialPackage;
import pw.pages.CS.CyberSecurity_Main;

public class CP29_MonolineIM_CPRegression extends BaseTest {
	
	public static void MonolineIMCPRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,
		String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
		PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
		CP_CommercialPackage CommercialPackage =  TestPageFactory.initElements(se, CP_CommercialPackage.class);
		CIM_Main CommercialInlandMarinePage =  TestPageFactory.initElements(se, CIM_Main.class);
		CIM_Locations CIMLocationsPage = TestPageFactory.initElements(se, CIM_Locations.class);
		CIM_Buildings CIMBuildingsPage = TestPageFactory.initElements(se, CIM_Buildings.class);
		CIM_LaunderesAndDryCleaners_LocationsAndLimits CIM_LAndD_LocationsAndLimitsPage = TestPageFactory.initElements(se, CIM_LaunderesAndDryCleaners_LocationsAndLimits.class);
		CIM_LaunderersAndDryCleanersCoverage CIM_LAndDCoveragePage = TestPageFactory.initElements(se, CIM_LaunderersAndDryCleanersCoverage.class);
		CIM_PhysiciansAndSurgeonsEquipment CIM_PhysiciansAndSurgeonsEquipmentPage = TestPageFactory.initElements(se, CIM_PhysiciansAndSurgeonsEquipment.class);
		CIM_InstallationFloater CIM_InstallFloaterPage = TestPageFactory.initElements(se, CIM_InstallationFloater.class);
		CIM_AccountsRecievable CIM_AccountsRecievablePage = TestPageFactory.initElements(se, CIM_AccountsRecievable.class);
		CIM_BoatAndMotorCoverages CIM_BoatAndMotorCoveragesPage = TestPageFactory.initElements(se, CIM_BoatAndMotorCoverages.class);
		CIM_CommercialArticles CIM_CommercialArticlesPage = TestPageFactory.initElements(se, CIM_CommercialArticles.class);
		CIM_ComputerLocationAndLimits CIM_ComputerLocationAndLimitsPage = TestPageFactory.initElements(se, CIM_ComputerLocationAndLimits.class);
		CIM_ComputerCoverage  CIM_ComputerCoveragePage = TestPageFactory.initElements(se, CIM_ComputerCoverage.class);
		CIM_GolfCartCoveredCourses CIM_GolfCartCoveredCoursesPage = TestPageFactory.initElements(se, CIM_GolfCartCoveredCourses.class);
		CIM_GolfCartCoverage CIM_GolfCartCoveragePage = TestPageFactory.initElements(se, CIM_GolfCartCoverage.class);
		CIM_GolfCoursesTeesAndGreens CIM_GolfCoursesTeesAndGreensPage = TestPageFactory.initElements(se, CIM_GolfCoursesTeesAndGreens.class);
		CIM_LaunderersAndDryCleanersCoverage CIM_LaunderersAndDryCleanersCoveragePage = TestPageFactory.initElements(se, CIM_LaunderersAndDryCleanersCoverage.class);
		CIM_TransitFloater CIM_TransitFloaterPage = TestPageFactory.initElements(se, CIM_TransitFloater.class);
		CIM_TransitFloater_OtherCoverages CIM_TransitFloater_OtherCoveragesPage = TestPageFactory.initElements(se, CIM_TransitFloater_OtherCoverages.class);
		CIM_TransitFloater_Terminal CIM_TransitFloater_TerminalPage = TestPageFactory.initElements(se, CIM_TransitFloater_Terminal.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
		PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);
		
			try {	
		
			List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
			
			CommonFunPage.PWAppStartUp(test);
			
			//New Transaction Actions
			if(transactionsList.contains("NewQuote")){
			String transaction = "NewQuote";
			LoginPage.PWAppLogin(strRegressionID,transaction,test);
			WelcomePage.homePage(strRegressionID,transaction, test);
			QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
			ProducerPage.AddProducers(strRegressionID,transaction,test);
			CommonMethods.NavigateToPage("Commercial Package",test);
			String cyberChkY = CommercialPackage.CommercialPackage(strRegressionID,transaction,test);
			CommercialInlandMarinePage.CIM_Main(strRegressionID, transaction, test);
			CIMLocationsPage.CIM_Locations(strRegressionID, transaction, test);
			CIMBuildingsPage.CIM_Buildings(strRegressionID, transaction, test);
			CIM_LAndD_LocationsAndLimitsPage.CIM_LaunderesAndDryCleaners_LocationsAndLimitsPage(strRegressionID, transaction, test);
			CIM_LAndDCoveragePage.LaunderersAndDryCleanersCoverage(strRegressionID, transaction, test);
			CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
			//CommonMethods.getDashboardForms(strRegressionID,transaction,test);
			//CommonMethods.getDashboardSupplementaryInfo(strRegressionID,transaction,test);
			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
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
				CommonMethods.NavigateToPage("Commercial Inland Marine",test);
				CommercialInlandMarinePage.CIM_Main(strRegressionID, transaction, test);
				CommonMethods.NavigateToPage("Physicians and Surgeons Equipment",test);
				CIM_PhysiciansAndSurgeonsEquipmentPage.PhysiciansAndSurgeonsEquipment(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				//CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			//MidTermProrataEndorsement
			if(transactionsList.contains("MidTermProrataEndorsement")){
				String transaction = "MidTermProrataEndorsement";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateToPage("Commercial Inland Marine",test);
				CommercialInlandMarinePage.CIM_Main(strRegressionID, transaction, test);
				CommonMethods.NavigateToPage("Installation Floater",test);
				CIM_InstallFloaterPage.CIM_InstallationFloater_Details(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				//CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			//Quote For Renewal
			if(transactionsList.contains("QuoteForRenewal")){
				String transaction = "QuoteForRenewal";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateToPage("Commercial Inland Marine",test);
				CommercialInlandMarinePage.CIM_Main(strRegressionID, transaction, test);
				CommonMethods.NavigateToPage("Accounts Receivable",test);
				CIM_AccountsRecievablePage.CIMAccountsRecievable(strRegressionID, transaction, test);
				CIM_BoatAndMotorCoveragesPage.BoatAndMotorCoverages(strRegressionID, transaction, test);
				CIM_CommercialArticlesPage.CommercialArticles(strRegressionID, transaction, test);
				CIM_ComputerLocationAndLimitsPage.ComputerLocationAndLimits(strRegressionID, transaction, test);
				CIM_ComputerCoveragePage.CIMComputerCoverage(strRegressionID, transaction, test);
				CIM_GolfCartCoveredCoursesPage.GolfCartCoveredCourses(strRegressionID, transaction, test);
				CIM_GolfCartCoveragePage.GolfCartCoverage(strRegressionID, transaction, test);
				CommonMethods.NavigateToPage("Golf Course Tees And Greens Coverage",test);
				CIM_GolfCoursesTeesAndGreensPage.Add_GolfCoursesTeesAndGreens(strRegressionID, transaction, test);
				CommonMethods.NavigateToPage("Launderers And Dry Cleaners Coverage",test);
				CIM_LaunderersAndDryCleanersCoveragePage.LaunderersAndDryCleanersCoverage(strRegressionID, transaction, test);
				CommonMethods.NavigateToPage("Transit Floater",test);
				CIM_TransitFloaterPage.CIM_TransitFloaterPage(strRegressionID, transaction, test);
				CIM_TransitFloater_OtherCoveragesPage.TransitFloater_OtherCoverages(strRegressionID, transaction, test);
				CIM_TransitFloater_TerminalPage.TransitFloater_Terminal(strRegressionID, transaction, test);
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
			
			
			//FlatEndorsement2
			if(transactionsList.contains("FlatEndorsement2")){
				String transaction = "FlatEndorsement2";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateToPage("Golf Cart Coverage",test);
				CIM_GolfCartCoveragePage.GolfCartCoverage(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				//CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			

		} catch (Exception e) {
			e.printStackTrace();
			
			se.verify().verifyEquals("Monoline IM CP Regression test  failed", true, false);
			testTearDown(se);
		}
	}

}
