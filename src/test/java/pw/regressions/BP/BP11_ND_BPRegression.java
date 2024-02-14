package pw.regressions.BP;

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
import pw.pages.CIM.CIM_BoatAndMotorCoverages;
import pw.pages.CIM.CIM_Buildings;
import pw.pages.CIM.CIM_ComputerCoverage;
import pw.pages.CIM.CIM_ComputerLocationAndLimits;
import pw.pages.CIM.CIM_Locations;
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
import pw.pages.CP.CP_AdditionalInterest;
import pw.pages.CP.CP_BlanketInsurance;
import pw.pages.CP.CP_Buildings;
import pw.pages.CP.CP_CommercialPackage;
import pw.pages.CP.CP_CommercialProperty;
import pw.pages.CP.CP_Locations;
import pw.pages.CP.CP_SecuraManuscript;
import pw.pages.CS.CyberSecurity_Main;
import pw.pages.GL.GL_AdditionalInterest;
import pw.pages.GL.GL_Classifications;
import pw.pages.GL.GL_EmployeeBenefitsLiability;
import pw.pages.GL.GL_ExperienceRating;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_OptionalProvisions;
import pw.pages.GL.GL_PremAndProd;
import pw.pages.GL.GL_SecuraManuscript;
import pw.pages.GL.GL_StateSpecificCoverages;
import pw.pages.GL.GeneralLiability;

public class BP11_ND_BPRegression extends BaseTest {
	ExtentReports extent;
	ExtentTest test;
	
	public static void NDBPRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,
		String strRegressionID,File file,XSSFWorkbook workbook,ExtentTest test) throws IOException {
		PW_Login LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
		PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
		CP_CommercialPackage CommercialPackage =  TestPageFactory.initElements(se, CP_CommercialPackage.class);
		CP_CommercialProperty CommercialProperty =  TestPageFactory.initElements(se, CP_CommercialProperty.class);
		CP_BlanketInsurance CPBlanketInsurance =  TestPageFactory.initElements(se, CP_BlanketInsurance.class);
		CP_Locations Locations = TestPageFactory.initElements(se, CP_Locations.class);
		CP_Buildings Bulidings = TestPageFactory.initElements(se, CP_Buildings.class);
		CP_AdditionalInterest AdditionalInterest = TestPageFactory.initElements(se, CP_AdditionalInterest.class);
		CP_SecuraManuscript SecuraManuscript = TestPageFactory.initElements(se, CP_SecuraManuscript.class);
		GeneralLiability GeneralLiabilityPage = TestPageFactory.initElements(se, GeneralLiability.class);
		GL_Location GLLocationPage = TestPageFactory.initElements(se, GL_Location.class);
		GL_StateSpecificCoverages GLStateSpecificCoveragesPage = TestPageFactory.initElements(se, GL_StateSpecificCoverages.class);
		GL_PremAndProd GLPremAndProdPage = TestPageFactory.initElements(se, GL_PremAndProd.class);
		GL_Classifications GLClassificationsPage = TestPageFactory.initElements(se, GL_Classifications.class);
		GL_AdditionalInterest GLAdditionalInterestPage = TestPageFactory.initElements(se, GL_AdditionalInterest.class);
		GL_OptionalProvisions GLOptionalProvisionsPage = TestPageFactory.initElements(se, GL_OptionalProvisions.class);
		GL_ExperienceRating GLExperienceRating = TestPageFactory.initElements(se, GL_ExperienceRating.class);
		GL_SecuraManuscript GLSecuraManuscript = TestPageFactory.initElements(se, GL_SecuraManuscript.class);
		GL_EmployeeBenefitsLiability EmployeeBenefitsLiability = TestPageFactory.initElements(se, GL_EmployeeBenefitsLiability.class);
		CIM_Main CIMMain = TestPageFactory.initElements(se, CIM_Main.class);
		CIM_Locations CIMLocationsPage = TestPageFactory.initElements(se, CIM_Locations.class);
		CIM_Buildings CIMBuildingsPage = TestPageFactory.initElements(se, CIM_Buildings.class);
		CIM_BoatAndMotorCoverages CIMBoatAndMotorCoverages = TestPageFactory.initElements(se, CIM_BoatAndMotorCoverages.class);
		CIM_ComputerLocationAndLimits CIMComputerLocationAndLimits = TestPageFactory.initElements(se, CIM_ComputerLocationAndLimits.class);
		CIM_ComputerCoverage CIMComputerCoverage = TestPageFactory.initElements(se, CIM_ComputerCoverage.class);
		CIM_Signs CIMSigns = TestPageFactory.initElements(se, CIM_Signs.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
		PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);
		String cyberChkY="";
		
		
		
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
			CommonMethods.NavigateToPage("Business Protector Policy",test);
			cyberChkY = CommercialPackage.CommercialPackage(strRegressionID,transaction,test);
			CommercialProperty.CommercialPropertyMethod(strRegressionID, transaction, test);
			CPBlanketInsurance.BlanketInsurance(strRegressionID, transaction, test);
			Locations.Locations(strRegressionID, transaction, test);
			Bulidings.BuildingDetails(strRegressionID, transaction, test);
			CommonMethods.NavigateToNextScreen(test);
			AdditionalInterest.CP_AddInterest(strRegressionID, transaction, test);
			SecuraManuscript.SecuraManuscriptPage(strRegressionID, transaction, test);
			GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID,transaction,test);
			GLLocationPage.GL_Location_Details(strRegressionID,transaction,test);
			GLStateSpecificCoveragesPage.GL_StateCoveragesPage(strRegressionID,transaction,test);
			GLPremAndProdPage.GL_PremAndProdPage(strRegressionID,transaction,test);
			GLClassificationsPage.GL_ClassificationsPage(strRegressionID,transaction,test);
			CommonMethods.NavigateToNextScreen(test);
			GLOptionalProvisionsPage.CP_GLOptionalProvisions(strRegressionID,transaction,test);
			GLSecuraManuscript.CP_GLSecuraManuscript(strRegressionID, transaction, test);
			//CommonMethods.NavigateToNextScreen(test);
			GLExperienceRating.GLExperienceRatingPage(strRegressionID, transaction, test);
			
			CommonMethods.NavigateTo("Commercial Inland Marine", test);
			CIMMain.CIM_Main(strRegressionID,transaction,test);
			CIMLocationsPage.CIM_Locations(strRegressionID,transaction,test);
			CIMBuildingsPage.CIM_Buildings(strRegressionID,transaction,test);
			CIMBoatAndMotorCoverages.BoatAndMotorCoverages(strRegressionID, transaction, test);
			CIMComputerLocationAndLimits.ComputerLocationAndLimits(strRegressionID, transaction, test);
			CIMComputerCoverage.CIMComputerCoverage(strRegressionID, transaction, test);
			CIMSigns.CIMSigns(strRegressionID, transaction, test);
			CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
			CommonMethods.NavigateTo("Cyber Security", test);
			CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
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
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				
			}
			
			//FlatEndorsement1 EndorsementAddFlat
			if(transactionsList.contains("FlatEndorsement1")){
				String transaction = "FlatEndorsement1";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
				CommonMethods.NavigateTo("General Liability", test);
				CommonMethods.NavigateTo("Prem & Prod", test);
				GLPremAndProdPage.GL_PremAndProdPage(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				//CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			//FlatEndorsement2 Endorsement Delete Flat
			if(transactionsList.contains("DeleteFlatEndorsement1")){
				String transaction = "DeleteFlatEndorsement1";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
				CommonMethods.NavigateTo("Commercial Property",test);
				CommonMethods.NavigateTo("Buildings (2)",test);
				Bulidings.BuildingDetails(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Buildings (2)",test);
				Bulidings.BuildingDetails(strRegressionID, "DeleteFlatEndorsement1B2", test);
			    CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				//CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			//Pro Rata Endorsement
			if(transactionsList.contains("ProRataEndorsement1")){
				String transaction = "ProRataEndorsement1";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Business Protector Policy",test);
				CommonMethods.NavigateTo("Commercial Property",test);
				CommonMethods.NavigateTo("Locations (1)",test);
				Locations.Locations(strRegressionID, transaction, test);
				Bulidings.BuildingDetails(strRegressionID, transaction, test);
				CommonMethods.CollapseAllAndNavigateTo("Business Protector Policy", "20-BP", test);
				CommonMethods.NavigateTo("General Liability", test);
				CommonMethods.NavigateToNextScreen(test);
				GLLocationPage.GL_Location_Details(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Prem & Prod",test);
				CommonMethods.NavigateToNextScreen(test);
				GLClassificationsPage.GL_ClassificationsPage(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				//CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			
			if(transactionsList.contains("ProRataEndorsement2")){
				String transaction = "ProRataEndorsement2";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Business Protector Policy",test);
				CommonMethods.NavigateTo("General Liability", test);
				GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Emp Benefits Liab", test);
				EmployeeBenefitsLiability.GL_EmployeeBenefitsLiability_Details(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				//CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				
			}
			
			if(transactionsList.contains("ProRataEndorsement3")){
				String transaction = "ProRataEndorsement3";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Business Protector Policy",test);
				CommonMethods.NavigateTo("General Liability", test);
				CommonMethods.NavigateTo("Additional Interest", test);
				GLAdditionalInterestPage.GL_AdditionalInterest_Details(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				//CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				
			}
			
			if(transactionsList.contains("ProRataEndorsementOOSE")){
				String transaction = "ProRataEndorsementOOSE";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Business Protector Policy",test);
				CommonMethods.NavigateTo("Commercial Inland Marine",test);
				CommonMethods.NavigateToNextScreen(test);
				CIMLocationsPage.CIM_Locations(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Signs (1)",test);
				CIMSigns.CIMSigns(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				CommonMethods.getDashboardForms(strRegressionID,"ProRataEndorsementOOSE1",test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			if(transactionsList.contains("QuoteForRenewal")){
				String transaction = "QuoteForRenewal";
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Business Protector Policy",test);
				CommonMethods.NavigateTo("Commercial Property",test);
				CommercialProperty.CommercialPropertyMethod(strRegressionID, transaction, test);
				CommonMethods.NavigateToNextScreen(test);
				CPBlanketInsurance.BlanketInsurance(strRegressionID, transaction, test);
				CommonMethods.NavigateTo("Cyber Security", test);
				CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);	
			}
			
			if(transactionsList.contains("ConvertQFRToPolicy")){
				String transaction = "ConvertQFRToPolicy";
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
	
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);	
				
			}	
			
		} catch (Exception e) {
			
			e.printStackTrace();
			se.verify().verifyEquals("ND BP Regression test  failed", true, false);
			testTearDown(se);
		}
	}

}
