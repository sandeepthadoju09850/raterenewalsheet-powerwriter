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
import pw.pages.CA.CA_HiredOrBorrowedAuto;
import pw.pages.CA.CA_Locations;
import pw.pages.CA.CA_NonOwnedLiability;
import pw.pages.CA.CA_StateCoverageLimits;
import pw.pages.CA.CA_Symbols;
import pw.pages.CA.CA_Vehicles;
import pw.pages.CAF.CAF_InsuringAgreements;
import pw.pages.CAF.CAF_Locations;
import pw.pages.CAF.CrimeAndFidelity_Main;
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
import pw.pages.GL.GL_Classifications;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_PremAndProd;
import pw.pages.GL.GeneralLiability;
import pw.pages.WC.WC_Classifications;
import pw.pages.WC.WC_Locations;
import pw.pages.WC.WC_NameLocationLinking;
import pw.pages.WC.WC_StateInformation;
import pw.pages.WC.WC_WorkersCompensation;

public class PM20_WI_CABPWCPMRegression extends BaseTest {
	
	public static void PM20_WI_CABPWCPMRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login  LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		CAWC_ProductInfo ProductInfo = TestPageFactory.initElements(se, CAWC_ProductInfo.class);
		CAWC_PW_Producers CAWC_PW_ProducersPage = TestPageFactory.initElements(se, CAWC_PW_Producers.class);
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
				CommonMethods.NavigateTo("Additional Coverages",test);
				AdditionalCoverages.AdditionalCoverages(strRegressionID, transaction, suspendSheet, test);
				CAHiredOrBorrowedAuto.HiredOrBorrowedAuto(strRegressionID, transaction, suspendSheet, test);
				NonOwnedLiability.CANonOwnedLiabilityPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.CollapseAllAndNavigateTo("Commercial Auto", "20-A", test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				//PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.NavigateToNextScreen(test);
				BillingTab.getUpdateBillingTab(strRegressionID, transaction, test);
				CommonMethods.validateStatusModelTypeOnAnalyticsTab(strRegressionID,transaction,test);
			}
			
			if(transactionsList.contains("BPNewQuote")){
				String transaction = "BPNewQuote";
				
				WelcomePage.navigateOnHomeButton(strRegressionID,transaction,test);
				WelcomePage.homePage(strRegressionID,transaction, test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				ProducerPage.AddProducers(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Business Protector Policy",test);
				String cyberChkY = CommercialPackage.CommercialPackage(strRegressionID,transaction,test);
				CommercialPropertyPage.CommercialPropertyMethod(strRegressionID,transaction,test);
				CplocationsPage.Locations(strRegressionID, transaction, test);
				BuildingsPage.BuildingDetails(strRegressionID, transaction,test);
				CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
				CommonMethods.NavigateTo("General Liability", test);
				GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID, transaction, test);
				GLLocationPage.GL_Location_Details(strRegressionID, transaction, test);
				GLPremAndProdPage.GL_PremAndProdPage(strRegressionID, transaction, test);
				GLClassificationsPage.GL_ClassificationsPage(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Crime and Fidelity", test);
				CrimeAndFidelity_MainPage.CrimeAndFidelity_MainPage(strRegressionID,transaction,test);
				CAF_LocationsPage.CAF_Locations_Details(strRegressionID,transaction,test);
				CAF_InsuringAgreementsPage.CAF_InsuringAgreementsPage(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				//PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.NavigateToNextScreen(test);
				BillingTab.getUpdateBillingTab(strRegressionID, transaction, test);
				CommonMethods.validateStatusModelTypeOnAnalyticsTab(strRegressionID,transaction,test);
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
				//PremiumSummary.WC_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.NavigateToNextScreen(test);
				BillingTab.getUpdateBillingTab(strRegressionID, transaction, test);
				CommonMethods.validateStatusModelTypeOnAnalyticsTab(strRegressionID,transaction,test);
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("PM20_WI_CACPWCRegressionMethod test failed", true, false);
			testTearDown(se);
		}
	}
}
