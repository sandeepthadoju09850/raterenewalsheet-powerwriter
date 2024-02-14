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
import pw.pages.CA.CA_AdditionalInterest;
import pw.pages.CA.CA_CommercialAuto;
import pw.pages.CA.CA_DriveOtherCar;
import pw.pages.CA.CA_ExperienceRating;
import pw.pages.CA.CA_HiredOrBorrowedAuto;
import pw.pages.CA.CA_LiabilityExperienceRating;
import pw.pages.CA.CA_NonOwnedLiability;
import pw.pages.CA.CA_ScheduleRating;
import pw.pages.CA.CA_StateCoverageLimits;
import pw.pages.CA.CA_Symbols;
import pw.pages.CA.CA_Vehicles;
import pw.pages.CAF.CAF_CrimeEndorsement;
import pw.pages.CAF.CAF_InsuringAgreements;
import pw.pages.CAF.CAF_Locations;
import pw.pages.CAF.CrimeAndFidelity_Main;
import pw.pages.CIM.CIM_Buildings;
import pw.pages.CIM.CIM_FineArtsFloater;
import pw.pages.CIM.CIM_FineArtsFloater_OtherCoverages;
import pw.pages.CIM.CIM_Locations;
import pw.pages.CIM.CIM_Main;
import pw.pages.CIM.CIM_Signs;
import pw.pages.COMMON.CAWC_AdditionalNamedInsured;
import pw.pages.COMMON.CAWC_PW_Producers;
import pw.pages.COMMON.CAWC_ProductInfo;
import pw.pages.COMMON.PW_AddNamedInsured;
import pw.pages.COMMON.PW_BillingTab;
import pw.pages.COMMON.PW_CommonFun;
import pw.pages.COMMON.PW_CommonMethods;
import pw.pages.COMMON.PW_GenInfo;
import pw.pages.COMMON.PW_Home;
import pw.pages.COMMON.PW_KYTaxExemption;
import pw.pages.COMMON.PW_Login;
import pw.pages.COMMON.PW_PremiumSummary;
import pw.pages.COMMON.PW_Producers;
import pw.pages.COMMON.PW_ScheduleRatingIRPM;
import pw.pages.CP.CP_Buildings;
import pw.pages.CP.CP_BusinessIncome;
import pw.pages.CP.CP_CommercialPackage;
import pw.pages.CP.CP_CommercialProperty;
import pw.pages.CP.CP_Coverages;
import pw.pages.CP.CP_ElectronicCommerce;
import pw.pages.CP.CP_FloodCoveragePage;
import pw.pages.CP.CP_Locations;
import pw.pages.CS.CyberSecurity_Main;
import pw.pages.CU.CU_AutoDealersPolicyInfo;
import pw.pages.CU.CU_EmpLiabPolicyInfo;
import pw.pages.CU.CU_GLPolicyInfo;
import pw.pages.CU.CU_Main;
import pw.pages.CU.CU_ManualFactors;
import pw.pages.CU.CU_SECURAManuscript;
import pw.pages.CU.CU_UmbrellaOptions;
import pw.pages.GL.GL_AdditionalInterest;
import pw.pages.GL.GL_Classifications;
import pw.pages.GL.GL_ExperienceRating;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_OptionalProvisions;
import pw.pages.GL.GL_PremAndProd;
import pw.pages.GL.GeneralLiability;

public class CU7_MI_CP_CA_CURegression extends BaseTest {
	ExtentReports extent;
	ExtentTest test;

	public static void MI_CURegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,
			String strRegressionID, File file, XSSFWorkbook workbook, ExtentTest test) throws IOException {
		PW_Login LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		CAWC_ProductInfo CAWCProductInfo = TestPageFactory.initElements(se, CAWC_ProductInfo.class);
		CAWC_PW_Producers CAWCPWProducers = TestPageFactory.initElements(se, CAWC_PW_Producers.class);
		CA_CommercialAuto CA_CommercialAutoPage = TestPageFactory.initElements(se, CA_CommercialAuto.class);
		PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
		PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
		PW_AddNamedInsured AddNamedInsuredPage = TestPageFactory.initElements(se, PW_AddNamedInsured.class);
		CAWC_AdditionalNamedInsured CAWCAdditionalNamedInsured = TestPageFactory.initElements(se,
				CAWC_AdditionalNamedInsured.class);
		CP_CommercialPackage CommercialPackage = TestPageFactory.initElements(se, CP_CommercialPackage.class);
		CP_CommercialProperty CommercialPropertyPage = TestPageFactory.initElements(se, CP_CommercialProperty.class);
		CP_Buildings BuildingsPage = TestPageFactory.initElements(se, CP_Buildings.class);
		CP_Coverages CPCoverages = TestPageFactory.initElements(se, CP_Coverages.class);
		GeneralLiability GeneralLiabilityPage = TestPageFactory.initElements(se, GeneralLiability.class);
		GL_Location GLLocationPage = TestPageFactory.initElements(se, GL_Location.class);
		GL_PremAndProd GLPremAndProdPage = TestPageFactory.initElements(se, GL_PremAndProd.class);
		GL_Classifications GLClassificationsPage = TestPageFactory.initElements(se, GL_Classifications.class);
		GL_ExperienceRating GLExperienceRating = TestPageFactory.initElements(se, GL_ExperienceRating.class);
		PW_ScheduleRatingIRPM ScheduleRatingIRPMPage = TestPageFactory.initElements(se, PW_ScheduleRatingIRPM.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		CA_StateCoverageLimits StateCoverageLimits = TestPageFactory.initElements(se, CA_StateCoverageLimits.class);
		CA_Symbols Symbols = TestPageFactory.initElements(se, CA_Symbols.class);
		CA_Vehicles Vehicles = TestPageFactory.initElements(se, CA_Vehicles.class);
		CA_AdditionalCoverages AdditionalCoverages = TestPageFactory.initElements(se, CA_AdditionalCoverages.class);
		CA_ExperienceRating CAExperienceRating = TestPageFactory.initElements(se, CA_ExperienceRating.class);
		CA_HiredOrBorrowedAuto CAHiredOrBorrowedAuto = TestPageFactory.initElements(se, CA_HiredOrBorrowedAuto.class);
		CA_NonOwnedLiability NonOwnedLiability = TestPageFactory.initElements(se, CA_NonOwnedLiability.class);
		CA_AdditionalInterest CA_AdditionalInterestPage = TestPageFactory.initElements(se, CA_AdditionalInterest.class);
		CA_ScheduleRating CA_ScheduleRatingPage = TestPageFactory.initElements(se, CA_ScheduleRating.class);
		CU_Main CUMainPage = TestPageFactory.initElements(se, CU_Main.class);
		CU_GLPolicyInfo CUGLPolicyInfoPage = TestPageFactory.initElements(se, CU_GLPolicyInfo.class);
		CU_AutoDealersPolicyInfo CUAutoDealersPolicyInfoPage = TestPageFactory.initElements(se,
				CU_AutoDealersPolicyInfo.class);
		CU_EmpLiabPolicyInfo CUEmpLiabPolicyInfoPage = TestPageFactory.initElements(se, CU_EmpLiabPolicyInfo.class);
		CU_UmbrellaOptions CUUmbrellaOptionsPage = TestPageFactory.initElements(se, CU_UmbrellaOptions.class);
		CU_ManualFactors CUManualFactorsPage = TestPageFactory.initElements(se, CU_ManualFactors.class);
		CU_SECURAManuscript CUSecuraManuscript = TestPageFactory.initElements(se, CU_SECURAManuscript.class);
		CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
		PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);

		try {
			List<String> transactionsList = ExcelOperations.getTransactionsList(strRegressionID);
			//// int iteration = 0;
			CommonFunPage.PWAppStartUp(test);

			// New Transaction Actions
			// CPConvertToPolicy - CPQuoteForRenewal - CPConvertQFRToPolicy -
			// CPRenew1 - CPRenew2 - CPRenew3

			if (transactionsList.contains("CPNewQuote")) {

				String transaction = "CPNewQuote";
				LoginPage.PWAppLogin(strRegressionID, transaction, test);
				WelcomePage.homePage(strRegressionID, transaction, test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				ProducerPage.AddProducers(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Package", test);
				String cyberChkY = CommercialPackage.CommercialPackage(strRegressionID, transaction, test);
				GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID, transaction, test);
				GLLocationPage.GL_Location_Details(strRegressionID, transaction, test);
				GLPremAndProdPage.GL_PremAndProdPage(strRegressionID, transaction, test);
				GLClassificationsPage.GL_ClassificationsPage(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Experience Rating", test);
				GLExperienceRating.GLExperienceRatingPage(strRegressionID, transaction, test);
				CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				BillingTab.getUpdateBillingTab(strRegressionID, transaction, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);

			}

			if (transactionsList.contains("CANewQuote")) {
				String transaction = "CANewQuote";

				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				WelcomePage.homePage(strRegressionID, transaction, test);
				CAWCProductInfo.quote_ProdInfo(strRegressionID, transaction, test);
				CAWCPWProducers.AddProducers(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Auto", test);
				CA_CommercialAutoPage.CommercialAuto(strRegressionID, transaction, suspendSheet, test);
				StateCoverageLimits.StateCoverageLimits(strRegressionID, transaction, suspendSheet, test);
				Symbols.Symbols(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Vehicles", test);
				Vehicles.CA_VehiclesPage(strRegressionID, transaction, suspendSheet, test);
				AdditionalCoverages.AdditionalCoverages(strRegressionID, transaction, suspendSheet, test);
				CAHiredOrBorrowedAuto.HiredOrBorrowedAuto(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Non Owned Liability", test);
				NonOwnedLiability.CANonOwnedLiabilityPage(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Experience Rating", test);
				CAExperienceRating.ExperienceRating(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook,
						test);
				BillingTab.getUpdateBillingTab(strRegressionID, transaction, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}

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
				CUAutoDealersPolicyInfoPage.AutoDealerPolicyInfo_Main(strRegressionID, transaction, suspendSheet, test);
				CUEmpLiabPolicyInfoPage.EmpLiabPolicyInfo_Main(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.NavigateTo("Umbrella Options", test);
				CUUmbrellaOptionsPage.UmbrellaOptions_Main(strRegressionID, transaction, suspendSheet, test);
				CUManualFactorsPage.ManualFactors_Main(strRegressionID, transaction, suspendSheet, test);
				CUSecuraManuscript.SECURAManuscript_Main(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook,
						test);
				BillingTab.getUpdateBillingTab(strRegressionID, transaction, test);
				CommonMethods.getDashboardForms(strRegressionID, transaction, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}

			if (transactionsList.contains("CPConvertToPolicy")) {
				String transaction = "CPConvertToPolicy";
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CPNewQuote", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}

			if (transactionsList.contains("CAConvertToPolicy")) {
				String transaction = "CAConvertToPolicy";
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CANewQuote", test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook,
						test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}

			if (transactionsList.contains("CUConvertToPolicy")) {
				String transaction = "CUConvertToPolicy";
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CUNewQuote", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook,
						test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}

			if (transactionsList.contains("CUProRataCancellation")) {
				String transaction = "CUProRataCancellation";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook,
						test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}

			if (transactionsList.contains("CUProRataReinstatement")) {
				String transaction = "CUProRataReinstatement";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook,
						test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}

			if (transactionsList.contains("CUProRataEndorsement1")) {
				String transaction = "CUProRataEndorsement1";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Umbrella", test);
				CommonMethods.NavigateTo("SECURA Manuscript (3)", test);
				CUSecuraManuscript.SECURAManuscript_Main(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook,
						test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}

			if (transactionsList.contains("CPQuoteForRenewal")) {
				String transaction = "CPQuoteForRenewal";
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CPConvertToPolicy", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Package", test);
				CommonMethods.NavigateTo("General Liability", test);
				CommonMethods.NavigateTo("Prem & Prod", test);
				CommonMethods.NavigateToNextScreen(test);
				GLClassificationsPage.GL_ClassificationsPage(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);

			}

			if (transactionsList.contains("CAQuoteForRenewal")) {
				String transaction = "CAQuoteForRenewal";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CAConvertToPolicy", test);
				CAWCProductInfo.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Auto", test);
				CommonMethods.NavigateTo("State Coverage Limits (1)",test);
				StateCoverageLimits.StateCoverageLimits(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}

			if (transactionsList.contains("CUQuoteForRenewal")) {
				String transaction = "CUQuoteForRenewal";
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.SearchQuotePolicyNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CUProRataEndorsement1", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook,
						test);
				CommonMethods.getDashboardForms(strRegressionID, transaction, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}

			if (transactionsList.contains("CPConvertQFRToPolicy")) {
				String transaction = "CPConvertQFRToPolicy";
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CPQuoteForRenewal", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}

			if (transactionsList.contains("CAConvertQFRToPolicy")) {
				String transaction = "CAConvertQFRToPolicy";
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CAQuoteForRenewal", test);
				CAWCProductInfo.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook,
						test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}

			if (transactionsList.contains("CUConvertQFRToPolicy")) {
				String transaction = "CUConvertQFRToPolicy";
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.SearchQuotePolicyNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CUQuoteForRenewal", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook,
						test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}

			if (transactionsList.contains("CUProRataEndorsement2")) {
				String transaction = "CUProRataEndorsement2";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Umbrella", test);
				CommonMethods.NavigateTo("SECURA Manuscript (3)", test);
				CUSecuraManuscript.SECURAManuscript_Main(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook,
						test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}

			if (transactionsList.contains("CUReverseEndorsement1")) {
				String transaction = "CUReverseEndorsement1";

				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook,
						test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}

			if (transactionsList.contains("CPRenew1")) {
				String transaction = "CPRenew1";
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CPConvertQFRToPolicy", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Package", test);
				CommercialPackage.CommercialPackage(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}

			if (transactionsList.contains("CARenew1")) {
				String transaction = "CARenew1";
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CAConvertQFRToPolicy", test);
				CAWCProductInfo.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook,
						test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);

			}

			if (transactionsList.contains("CURenew1")) {
				String transaction = "CURenew1";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.SearchQuotePolicyNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CUReverseEndorsement1", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Umbrella", test);
				CommonMethods.NavigateTo("Manual Factors", test);
				CUManualFactorsPage.ManualFactors_Main(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook,
						test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}

			if (transactionsList.contains("CPRenew2")) {
				String transaction = "CPRenew2";
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CPRenew1", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}

			if (transactionsList.contains("CARenew2")) {
				String transaction = "CARenew2";
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CARenew1", test);
				CAWCProductInfo.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook,
						test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);

			}

			if (transactionsList.contains("CURenew2")) {
				String transaction = "CURenew2";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.SearchQuotePolicyNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CURenew1", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Umbrella", test);
				CommonMethods.NavigateTo("Manual Factors", test);
				CUManualFactorsPage.ManualFactors_Main(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook,
						test);
				CommonMethods.getDashboardStatus(strRegressionID, transaction, test);
			}

			if (transactionsList.contains("CPRenew3")) {
				String transaction = "CPRenew3";
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CPRenew2", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook, test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}

			if (transactionsList.contains("CARenew3")) {
				String transaction = "CARenew3";
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.searchQuoteNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CARenew2", test);
				CAWCProductInfo.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CA_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook,
						test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);

			}

			if (transactionsList.contains("CURenew3")) {
				String transaction = "CURenew3";
				String suspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
				WelcomePage.navigateOnHomeButton(strRegressionID, transaction, test);
				CommonMethods.SearchQuotePolicyNo(strRegressionID, transaction, test);
				CommonMethods.getDashboardActions(strRegressionID, "CURenew2", test);
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Commercial Umbrella", test);
				CommonMethods.NavigateTo("Manual Factors", test);
				CUManualFactorsPage.ManualFactors_Main(strRegressionID, transaction, suspendSheet, test);
				CommonMethods.getCalculatePremium(strRegressionID, transaction, test);
				PremiumSummary.CU_GetPremiumSummary(strRegressionID, transaction, transactionsList, file, workbook,
						test);
				CommonMethods.getDashboardActions(strRegressionID, transaction, test);
			}
		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("MI_CP_CA_CU Regression test  failed", true, false);
			testTearDown(se);
		}

	}
}
