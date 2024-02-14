package pw.regressions.CU;

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
import pw.pages.CA.CA_AdditionalCoverages;
import pw.pages.CA.CA_AutoAdditionalInsuredWRAP;
import pw.pages.CA.CA_CommercialAuto;
import pw.pages.CA.CA_ExperienceRating;
import pw.pages.CA.CA_HiredOrBorrowedAuto;
import pw.pages.CA.CA_NonOwnedLiability;
import pw.pages.CA.CA_SecuraManusript;
import pw.pages.CA.CA_StateCoverageLimits;
import pw.pages.CA.CA_Symbols;
import pw.pages.CA.CA_Vehicles;
import pw.pages.CIM.CIM_Buildings;
import pw.pages.CIM.CIM_ContractorsOtherCoverages;
import pw.pages.CIM.CIM_Locations;
import pw.pages.CIM.CIM_Main;
import pw.pages.COMMON.CAWC_PW_Producers;
import pw.pages.COMMON.CAWC_ProductInfo;
import pw.pages.COMMON.PW_AddNamedInsured;
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
import pw.pages.CS.CyberSecurity_Main;
import pw.pages.CU.CU_AutoDealersPolicyInfo;
import pw.pages.CU.CU_GLCoverage;
import pw.pages.CU.CU_GLPolicyInfo;
import pw.pages.CU.CU_Main;
import pw.pages.CU.CU_SECURAManuscript;
import pw.pages.CU.CU_ScheduleRating;
import pw.pages.CU.CU_UmbrellaOptions;
import pw.pages.GL.GL_AdditionalInterest;
import pw.pages.GL.GL_Classifications;
import pw.pages.GL.GL_ExperienceRating;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_OptionalProvisions;
import pw.pages.GL.GL_PremAndProd;
import pw.pages.GL.GeneralLiability;

public class CU10_WI_TC_CA_CURegression extends BaseTest {
	ExtentReports extent;
	ExtentTest test;

	public static void WI_CURegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,
			String strRegressionID, File file, XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		CAWC_ProductInfo CAWCProductInfo = TestPageFactory.initElements(se, CAWC_ProductInfo.class);
		CAWC_PW_Producers CAWCPWProducers = TestPageFactory.initElements(se, CAWC_PW_Producers.class);
		PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
		PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
		CP_CommercialPackage CommercialPackage = TestPageFactory.initElements(se, CP_CommercialPackage.class);
		CP_CommercialProperty CommercialPropertyPage = TestPageFactory.initElements(se, CP_CommercialProperty.class);
		CP_Buildings BuildingsPage = TestPageFactory.initElements(se, CP_Buildings.class);
		GeneralLiability GeneralLiabilityPage = TestPageFactory.initElements(se, GeneralLiability.class);
		GL_Location GLLocationPage = TestPageFactory.initElements(se, GL_Location.class);
		GL_PremAndProd GLPremAndProdPage = TestPageFactory.initElements(se, GL_PremAndProd.class);
		GL_Classifications GLClassificationsPage = TestPageFactory.initElements(se, GL_Classifications.class);
		GL_ExperienceRating GLExperienceRating = TestPageFactory.initElements(se, GL_ExperienceRating.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		CAWC_ProductInfo ProductInfo = TestPageFactory.initElements(se, CAWC_ProductInfo.class);
		CA_CommercialAuto CommercialAuto = TestPageFactory.initElements(se, CA_CommercialAuto.class);
		CA_StateCoverageLimits StateCoverageLimits = TestPageFactory.initElements(se, CA_StateCoverageLimits.class);
		CA_Symbols Symbols = TestPageFactory.initElements(se, CA_Symbols.class);
		CA_Vehicles Vehicles = TestPageFactory.initElements(se, CA_Vehicles.class);
		CA_AdditionalCoverages AdditionalCoverages = TestPageFactory.initElements(se, CA_AdditionalCoverages.class);
		CA_ExperienceRating ExperienceRating = TestPageFactory.initElements(se, CA_ExperienceRating.class);
		CA_HiredOrBorrowedAuto CAHiredOrBorrowedAuto = TestPageFactory.initElements(se, CA_HiredOrBorrowedAuto.class);
		CA_NonOwnedLiability NonOwnedLiability = TestPageFactory.initElements(se, CA_NonOwnedLiability.class);
		CA_AutoAdditionalInsuredWRAP CA_AutoAdditionalInsuredWRAPpage = TestPageFactory.initElements(se, CA_AutoAdditionalInsuredWRAP.class);
		CU_Main CUMainPage = TestPageFactory.initElements(se, CU_Main.class);
		CU_GLPolicyInfo CUGLPolicyInfoPage = TestPageFactory.initElements(se, CU_GLPolicyInfo.class);
		CU_AutoDealersPolicyInfo CUAutoDealersPolicyInfoPage = TestPageFactory.initElements(se,
				CU_AutoDealersPolicyInfo.class);
		CU_UmbrellaOptions CUUmbrellaOptionsPage = TestPageFactory.initElements(se, CU_UmbrellaOptions.class);
		
		CP_Locations CplocationsPage = TestPageFactory.initElements(se, CP_Locations.class);
		PW_AddNamedInsured AddNamedInsured = TestPageFactory.initElements(se, PW_AddNamedInsured.class);
		GL_OptionalProvisions GLOptionalProvisionsPage = TestPageFactory.initElements(se, GL_OptionalProvisions.class);
		GL_AdditionalInterest GLAdditionalInterestPage = TestPageFactory.initElements(se, GL_AdditionalInterest.class);
		CIM_Main CIMMainPage = TestPageFactory.initElements(se, CIM_Main.class);
		CIM_Locations CIMLocationsPage = TestPageFactory.initElements(se, CIM_Locations.class);
		CIM_Buildings CIMBuildingsPage = TestPageFactory.initElements(se, CIM_Buildings.class);
		CIM_ContractorsOtherCoverages CIMContractorsOtherCoverages = TestPageFactory.initElements(se,
				CIM_ContractorsOtherCoverages.class);

		CU_SECURAManuscript CUSecuraManuscript = TestPageFactory.initElements(se, CU_SECURAManuscript.class);
		CU_GLCoverage CUGLCoverage = TestPageFactory.initElements(se, CU_GLCoverage.class);
		CU_ScheduleRating CU_ScheduleRatingPage = TestPageFactory.initElements(se, CU_ScheduleRating.class);
		CA_SecuraManusript CASecuraManusript = TestPageFactory.initElements(se, CA_SecuraManusript.class);
		CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
		PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);

		try {
			List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
			//// int iteration = 0;
			CommonFunPage.PWAppStartUp(test);

			if (transactionsList.contains("TCNewQuote")) {

				String transaction = "TCNewQuote";
				LoginPage.PWAppLogin(strRegressionID, transaction, test);
				WelcomePage.homePage(strRegressionID, transaction, test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				ProducerPage.AddProducers(strRegressionID, transaction, test);
				AddNamedInsured.AddAdditionalNamedInsuredMethod(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Target Contractor Protector", test);
				String cyberChkY = CommercialPackage.CommercialPackage(strRegressionID, transaction, test);
				CommercialPropertyPage.CommercialPropertyMethod(strRegressionID, transaction, test);
				CommonMethods.NavigateToNextScreen(test);
				CplocationsPage.Locations(strRegressionID, transaction, test);
				BuildingsPage.BuildingDetails(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("General Liability", test);
				GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID, transaction, test);
				GLLocationPage.GL_Location_Details(strRegressionID, transaction, test);
				GLPremAndProdPage.GL_PremAndProdPage(strRegressionID, transaction, test);
				GLClassificationsPage.GL_ClassificationsPage(strRegressionID, transaction, test);
				GLAdditionalInterestPage.GL_AdditionalInterest_Details(strRegressionID, transaction, test);
				GLOptionalProvisionsPage.CP_GLOptionalProvisions(strRegressionID, transaction, test);
				GLExperienceRating.GLExperienceRatingPage(strRegressionID, transaction, test);
				CommonMethods.NavigateToNextScreen(test);
				CIMMainPage.CIM_Main(strRegressionID, transaction, test);
				CIMLocationsPage.CIM_Locations(strRegressionID, transaction, test);
				CIMBuildingsPage.CIM_Buildings(strRegressionID, transaction, test);
				CommonMethods.CollapseAllAndNavigateTo("Target Contractor Protector", "20-TC", test);
				CommonMethods.NavigateTo("Commercial Inland Marine", test);
				CommonMethods.NavigateTo("Contractors -Other Coverages", test);
				CIMContractorsOtherCoverages.CIMContractorsOtherCoverages(strRegressionID, transaction, test);
				CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				CommonMethods.CollapseAllAndNavigateTo("Target Contractor Protector", "20-TC", test);
				CommonMethods.NavigateTo("General Liability", test);
				GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook,test);
				BillingTab.getUpdateBillingTab(strRegressionID, transaction, test);
				CommonMethods.getDashboardForms(strRegressionID, transaction, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);

			}

			// CA NEWQUOTE

		if (transactionsList.contains("CANewQuote")) {
				String transaction = "CANewQuote";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				WelcomePage.homePage(strRegressionID, transaction, test);
				ProductInfo.quote_ProdInfo(strRegressionID, transaction, test);
				CAWCPWProducers.AddProducers(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Auto", test);
				CommercialAuto.CommercialAuto(strRegressionID, transaction, suspendSheet, test);
				StateCoverageLimits.StateCoverageLimits(strRegressionID, transaction, suspendSheet, test);
				Symbols.Symbols(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Vehicles", test);
				Vehicles.CA_VehiclesPage(strRegressionID, transaction, suspendSheet, test);
				AdditionalCoverages.AdditionalCoverages(strRegressionID, transaction, suspendSheet, test);
				CAHiredOrBorrowedAuto.HiredOrBorrowedAuto(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Non Owned Liability", test);
				NonOwnedLiability.CANonOwnedLiabilityPage(strRegressionID, transaction, suspendSheet, test);
				CA_AutoAdditionalInsuredWRAPpage.AutoAdditionalInsuredWRAP(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateToNextScreen(test);
				CommonMethods.NavigateTo("Experience Rating", test);
				ExperienceRating.ExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook,test);
				BillingTab.getUpdateBillingTab(strRegressionID, transaction, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);

			}

			// CU NEWQUOTE
			if (transactionsList.contains("CUNewQuote")) {
				String transaction = "CUNewQuote";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);

			WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				WelcomePage.homePage(strRegressionID, transaction, test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				ProducerPage.AddProducers(strRegressionID, transaction, test);
				CommonMethods.NavigateToNextScreen(test);
				CUMainPage.CU_MainPage(strRegressionID, transaction, suspendSheet, test);
				CUGLPolicyInfoPage.generalLiabPolicyInfo_Main(strRegressionID, transaction, suspendSheet, test);
				CUGLCoverage.generalLiabPolicyCoverage(strRegressionID, transaction, suspendSheet, test);
				CUAutoDealersPolicyInfoPage.AutoDealerPolicyInfo_Main(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Umbrella Options", test);
				CUUmbrellaOptionsPage.UmbrellaOptions_Main(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("SECURA Manuscript", test);
				CUSecuraManuscript.SECURAManuscript_Main(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Schedule Rating/IRPM", test);
				CU_ScheduleRatingPage.CU_ScheduleRatingMethod(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook,test);
				BillingTab.getUpdateBillingTab(strRegressionID, transaction, test);
				CommonMethods.getDashboardForms(strRegressionID, transaction, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);

			}

			if (transactionsList.contains("TCConvertToPolicy")) {
				String transaction = "TCConvertToPolicy";
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "TCNewQuote", test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList, file, workbook, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}

			if (transactionsList.contains("CAConvertToPolicy")) {
				String transaction = "CAConvertToPolicy";
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CANewQuote", test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID,transaction,transactionsList, file, workbook, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}

			if (transactionsList.contains("CUConvertToPolicy")) {
				String transaction = "CUConvertToPolicy";
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CUNewQuote", test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID,transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}

			if (transactionsList.contains("TCFlatEndorsement1")) {
				String transaction = "TCFlatEndorsement1";

				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "TCConvertToPolicy", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Target Contractor Protector", test);
				CommonMethods.NavigateTo("General Liability", test);
				CommonMethods.NavigateTo("Prem & Prod", test);
				CommonMethods.NavigateTo("Classifications (3)", test);
				GLClassificationsPage.GL_ClassificationsPage(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file,workbook,test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}

			if (transactionsList.contains("CAFlatEndorsement1")) {
				String transaction = "CAFlatEndorsement1";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CAConvertToPolicy", test);
				CAWCProductInfo.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Auto", test);
				CommercialAuto.CommercialAuto(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Vehicles (6)", test);
				Vehicles.CA_VehiclesPage(strRegressionID, transaction, suspendSheet, test);
				AdditionalCoverages.AdditionalCoverages(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("SECURA Manuscript", test);
				CASecuraManusript.SecuraManusript(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID,transaction,transactionsList,file,workbook,test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);

			}

			if (transactionsList.contains("CUFlatEndorsement1")) {
				String transaction = "CUFlatEndorsement1";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);

				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CUConvertToPolicy", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Umbrella", test);
				CUMainPage.CU_MainPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID,transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);

			}
			if (transactionsList.contains("CUFlatCancellation")) {
				String transaction = "CUFlatCancellation";
				
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID,transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);

			}
			if (transactionsList.contains("CUFlatReinstatement")) {
				String transaction = "CUFlatReinstatement";
				se.util().sleep(3000);
				CommonMethods.NavigateToNextScreen(test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID,transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);

			}

			if (transactionsList.contains("TCProRataEndorsement1")) {
				String transaction = "TCProRataEndorsement1";
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "TCFlatEndorsement1", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Target Contractor Protector", test);
				CommonMethods.NavigateTo("General Liability", test);
				CommonMethods.NavigateTo("Prem & Prod", test);
				GLPremAndProdPage.GL_PremAndProdPage(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}

			if (transactionsList.contains("CUProRataEndorsement1")) {
				String transaction = "CUProRataEndorsement1";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CUFlatReinstatement", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Umbrella", test);
				CUMainPage.CU_MainPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Umbrella Options", test);
				CUUmbrellaOptionsPage.UmbrellaOptions_Main(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID,transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}

			if (transactionsList.contains("TCQuoteForRenewal")) {
				String transaction = "TCQuoteForRenewal";
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "TCProRataEndorsement1", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateToPage("Target Contractor Protector",test);
				CommonMethods.NavigateToPage("Commercial Property", test);
				CommercialPropertyPage.CommercialPropertyMethod(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardForms(strRegressionID, transaction, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);

			}

			if (transactionsList.contains("CAQuoteForRenewal")) {
				String transaction = "CAQuoteForRenewal";
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CAFlatEndorsement1", test);
				CAWCProductInfo.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID,transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}

			if (transactionsList.contains("CUQuoteForRenewal")) {
				String transaction = "CUQuoteForRenewal";
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CUProRataEndorsement1", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID,transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}

			if (transactionsList.contains("TCConvertQFRToPolicy")) {
				String transaction = "TCConvertQFRToPolicy";
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "TCQuoteForRenewal", test);
				CommonMethods.NavigateToNextScreen(test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}

			if (transactionsList.contains("CAConvertQFRToPolicy")) {
				String transaction = "CAConvertQFRToPolicy";
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CAQuoteForRenewal", test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID,transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}

			if (transactionsList.contains("CUConvertQFRToPolicy")) {
				String transaction = "CUConvertQFRToPolicy";
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CUQuoteForRenewal", test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID,transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}

		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("WI_TC_CA_CURegression test  failed", true, false);
			testTearDown(se);
		}

	}
}
