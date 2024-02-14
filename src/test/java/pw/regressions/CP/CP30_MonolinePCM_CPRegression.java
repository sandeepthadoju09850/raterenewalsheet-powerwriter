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
import pw.pages.COMMON.PW_AddNamedInsured;
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
import pw.pages.GL.GL_Classifications;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_MiscellaneousCoverage;
import pw.pages.GL.GL_OptionalProvisions;
import pw.pages.GL.GL_PremAndProd;
import pw.pages.GL.GL_SpecialityOption;
import pw.pages.GL.GeneralLiability;
import pw.pages.PLCM.CP_ProfessionalLiabilityClaims;

public class CP30_MonolinePCM_CPRegression extends BaseTest {
	ExtentReports extent;
	ExtentTest test;
	
	public static void MonolinePCMRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,
			String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		
		PW_Login  LoginPage = TestPageFactory.initElements(se, PW_Login.class);
		PW_CommonFun CommonFunPage = TestPageFactory.initElements(se, PW_CommonFun.class);
		PW_Home WelcomePage = TestPageFactory.initElements(se, PW_Home.class);
		PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
		PW_Producers ProducerPage = TestPageFactory.initElements(se, PW_Producers.class);
		PW_AddNamedInsured AddNamedInsuredPage = TestPageFactory.initElements(se, PW_AddNamedInsured.class);
		CP_CommercialPackage CommercialPackage =  TestPageFactory.initElements(se, CP_CommercialPackage.class);
		GeneralLiability GeneralLiabilityPage = TestPageFactory.initElements(se, GeneralLiability.class);
		GL_Location GL_LocationPage = TestPageFactory.initElements(se, GL_Location.class);
		GL_PremAndProd GL_PremAndProdPage = TestPageFactory.initElements(se, GL_PremAndProd.class);
		GL_Classifications GL_ClassificationsPage = TestPageFactory.initElements(se, GL_Classifications.class);
		GL_SpecialityOption GL_SpecialityOptionPage = TestPageFactory.initElements(se, GL_SpecialityOption.class);
		GL_OptionalProvisions GL_OptionalProvisionsPage = TestPageFactory.initElements(se, GL_OptionalProvisions.class);
		GL_MiscellaneousCoverage GL_MiscellaneousCoveragePage = TestPageFactory.initElements(se, GL_MiscellaneousCoverage.class);
		CP_ProfessionalLiabilityClaims CP_ProfessionalLiabilityClaimsPage = TestPageFactory.initElements(se, CP_ProfessionalLiabilityClaims.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
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
				 AddNamedInsuredPage.AddAdditionalNamedInsuredMethod(strRegressionID,transaction,test);
				 String cyberChkY = CommercialPackage.CommercialPackage(strRegressionID,transaction,test);
				 GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID,transaction,test);
				 GL_LocationPage.GL_Location_Details(strRegressionID,transaction,test);
				 GL_PremAndProdPage.GL_PremAndProdPage(strRegressionID,transaction,test);
				 GL_ClassificationsPage.GL_ClassificationsPage(strRegressionID,transaction,test);
				 GL_SpecialityOptionPage.GL_SpecialityOption_Details(strRegressionID,transaction,test);
				 CommonMethods.NavigateToPage("Optional Provisions (13)",test);
				 GL_OptionalProvisionsPage.CP_GLOptionalProvisions(strRegressionID,transaction,test);
				 CommonMethods.NavigateTo("Miscellaneous Coverages",test);
				 GL_MiscellaneousCoveragePage.CP_GLMiscellaneousCoverage(strRegressionID,transaction,test);
				 CommonMethods.NavigateTo("Professional Liability Claims-Made",test);
				 CP_ProfessionalLiabilityClaimsPage.CP_ProfessionalLiabilityClaimsPage(strRegressionID,transaction,test);
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
				  String transaction ="ConvertToPolicy";
			  CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
			  PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
			  CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			  
			  }
			  
				  //FlatEndorsement1 
				if(transactionsList.contains("FlatEndorsement1")){ 
					String transaction = "FlatEndorsement1";
				  
				  QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				  CommonMethods.NavigateTo("Commercial Package",test);
				  CommonMethods.NavigateTo("Professional Liability Claims-Made",test);
				  CP_ProfessionalLiabilityClaimsPage.CP_ProfessionalLiabilityClaimsPage(strRegressionID,transaction,test);
				  CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				  PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				  //CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				  CommonMethods.getDashboardActions(strRegressionID,transaction,test);
				  
			  }
			 
				//Quote For Renewal
				if(transactionsList.contains("QuoteForRenewal")){
					String transaction = "QuoteForRenewal";
				  
				  QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				  CommonMethods.NavigateTo("Commercial Package",test);
				  CommonMethods.NavigateTo("Professional Liability Claims-Made",test);
				  CP_ProfessionalLiabilityClaimsPage.CP_ProfessionalLiabilityClaimsPage(strRegressionID,transaction,test);
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
				//CommonMethods.UWApproval(strRegressionID, transaction, test);

			}
		
			
		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("MonolinePCMRegression test  failed", true, false);
			testTearDown(se);
		}
	}

}