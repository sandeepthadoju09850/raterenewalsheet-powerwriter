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
import pw.Constants.constants;
import pw.pages.CAF.CAF_CrimeEndorsement;
import pw.pages.CAF.CAF_InsuringAgreements;
import pw.pages.CAF.CAF_Locations;
import pw.pages.CAF.CrimeAndFidelity_Main;
import pw.pages.COMMON.PW_AddNamedInsured;
import pw.pages.COMMON.PW_BillingTab;
import pw.pages.COMMON.PW_CommonFun;
import pw.pages.COMMON.PW_CommonMethods;
import pw.pages.COMMON.PW_GenInfo;
import pw.pages.COMMON.PW_Home;
import pw.pages.COMMON.PW_Login;
import pw.pages.COMMON.PW_PremiumSummary;
import pw.pages.COMMON.PW_Producers;
import pw.pages.CP.CP_AdditionalInterest;
import pw.pages.CP.CP_Buildings;
import pw.pages.CP.CP_CommercialPackage;
import pw.pages.CP.CP_CommercialProperty;
import pw.pages.CP.CP_Locations;
import pw.pages.CP.CP_Terrorism;
import pw.pages.CS.CyberSecurity_Main;
import pw.pages.GL.GL_AbuseAndMolestation;
import pw.pages.GL.GL_AbuseAndMolestationClassification;
import pw.pages.GL.GL_AdditionalInterest;
import pw.pages.GL.GL_Classifications;
import pw.pages.GL.GL_ExperienceRating;
import pw.pages.GL.GL_Location;
import pw.pages.GL.GL_OptionalProvisions;
import pw.pages.GL.GL_PremAndProd;
import pw.pages.GL.GL_SpecialityOption;
import pw.pages.GL.GL_StateSpecificCoverages;
import pw.pages.GL.GeneralLiability;
import pw.pages.PLCM.CP_ProfessionalLiabilityClaims;

public class CP21_HumanService_CPRegression extends BaseTest {
	
	public static void HumanServiceCPRegressionMethod(Browsers myBrowser, SeHelper se, Map<String, Object> params,String strRegressionID,File file,XSSFWorkbook workbook, ExtentTest test) throws IOException {
		
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
		CP_Terrorism CPTerrorism = TestPageFactory.initElements(se, CP_Terrorism.class);
		CP_AdditionalInterest CPAdditionalInterest = TestPageFactory.initElements(se, CP_AdditionalInterest.class);
		GeneralLiability GeneralLiabilityPage = TestPageFactory.initElements(se, GeneralLiability.class);
		GL_Location GLLocationPage = TestPageFactory.initElements(se, GL_Location.class);
		GL_StateSpecificCoverages GLStateSpecificCoveragesPage = TestPageFactory.initElements(se, GL_StateSpecificCoverages.class);
		GL_PremAndProd GLPremAndProdPage = TestPageFactory.initElements(se, GL_PremAndProd.class);
		GL_Classifications GLClassificationsPage = TestPageFactory.initElements(se, GL_Classifications.class);
		GL_SpecialityOption GLSpecialityOptionPage=TestPageFactory.initElements(se, GL_SpecialityOption.class);
		GL_AbuseAndMolestation GL_AbuseAndMolestationPage = TestPageFactory.initElements(se,
				GL_AbuseAndMolestation.class);
		GL_AbuseAndMolestationClassification GL_AbuseAndMolestationClassificationPage = TestPageFactory.initElements(se,
				GL_AbuseAndMolestationClassification.class);
		GL_AdditionalInterest GLAdditionalInterestPage = TestPageFactory.initElements(se, GL_AdditionalInterest.class);
		GL_ExperienceRating GLExperienceRating = TestPageFactory.initElements(se, GL_ExperienceRating.class);
		GL_OptionalProvisions GLOptionalProvisionsPage = TestPageFactory.initElements(se, GL_OptionalProvisions.class);
		CrimeAndFidelity_Main CrimeAndFidelity_MainPage = TestPageFactory.initElements(se, CrimeAndFidelity_Main.class);
		CAF_Locations CAFLocationsPage =TestPageFactory.initElements(se, CAF_Locations.class);
		CAF_InsuringAgreements CAFInsuringAgreementsPage =TestPageFactory.initElements(se, CAF_InsuringAgreements.class);
		CAF_CrimeEndorsement CAFCrimeEndorsementPage = TestPageFactory.initElements(se, CAF_CrimeEndorsement.class);
		CP_ProfessionalLiabilityClaims CP_ProfessionalLiabilityClaimsPage = TestPageFactory.initElements(se, CP_ProfessionalLiabilityClaims.class);
		PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
		PW_PremiumSummary PremiumSummary = TestPageFactory.initElements(se, PW_PremiumSummary.class);
		CyberSecurity_Main CyberSecurtiy_Main = TestPageFactory.initElements(se, CyberSecurity_Main.class);
		PW_BillingTab BillingTab = TestPageFactory.initElements(se, PW_BillingTab.class);
		String cyberChkY = "";
		
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
				cyberChkY = CommercialPackage.CommercialPackage(strRegressionID,transaction,test);
				CommercialPropertyPage.CommercialPropertyMethod(strRegressionID,transaction,test);
				CplocationsPage.Locations(strRegressionID, transaction, test);
				BuildingsPage.BuildingDetails(strRegressionID, transaction,test);
				CPTerrorism.CP_TerrorismPage(strRegressionID, transaction,test);
				CPAdditionalInterest.CP_AddInterest(strRegressionID, transaction, test);
				
				GeneralLiabilityPage.GeneralLiabilityPage(strRegressionID,transaction,test);
				GLLocationPage.GL_Location_Details(strRegressionID,transaction,test);
				GLStateSpecificCoveragesPage.GL_StateCoveragesPage(strRegressionID,transaction,test);
				GLPremAndProdPage.GL_PremAndProdPage(strRegressionID,transaction,test);
				GLClassificationsPage.GL_ClassificationsPage(strRegressionID,transaction,test);
				GLSpecialityOptionPage.GL_SpecialityOption_Details(strRegressionID, transaction, test);
				//Added below steps on Abuse Cov as part of 05/01/2023 rate changes
				GL_AbuseAndMolestationPage.GL_AbuseAndMolestationMethod(strRegressionID, transaction, test);
				GL_AbuseAndMolestationClassificationPage.GL_AbuseAndMolestationClassificationMethod(strRegressionID,
						transaction, test);
				GLAdditionalInterestPage.clickDone();
				GLOptionalProvisionsPage.CP_GLOptionalProvisions(strRegressionID,transaction,test);
				GLExperienceRating.GLExperienceRatingPageHumanService(strRegressionID, transaction,false, test);
				
				CrimeAndFidelity_MainPage.CrimeAndFidelity_MainPage(strRegressionID,transaction,test);
				CAFLocationsPage.CAF_Locations_Details(strRegressionID,transaction,test);
				CAFInsuringAgreementsPage.CAF_InsuringAgreementsPage(strRegressionID,transaction,test);
				CAFCrimeEndorsementPage.clickDone(test);
				
				CP_ProfessionalLiabilityClaimsPage.CP_ProfessionalLiabilityClaimsPage(strRegressionID,transaction,test);
				CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				
				
				CommonMethods.CollapseAllAndNavigateTo("Commercial Package", "20-CP", test);
				CommonMethods.NavigateTo("General Liability", test);
				CommonMethods.NavigateTo("Experience Rating", test);
				GLExperienceRating.GLExperienceRatingPageHumanService(strRegressionID, transaction,true, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
	 			PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				BillingTab.getUpdateBillingTab(strRegressionID,transaction,test);
				CommonMethods.getDashboardForms(strRegressionID,transaction,test);
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
				CommonMethods.NavigateToPage(constants.PageNm_GL,test);
				CommonMethods.NavigateToPage(constants.PageNm_SpecialtyOption,test);
				GLSpecialityOptionPage.GL_SpecialityOption_Details(strRegressionID, transaction, test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				//CommonMethods.getDashboardForms(strRegressionID,transaction,test);
	 			CommonMethods.getDashboardActions(strRegressionID,transaction,test);
	 			
			}
			
			if(transactionsList.contains(constants.QFR)){
				String transaction = constants.QFR;
				QuoteGenInfoPage.quote_ProdInfo(strRegressionID,transaction,test);
				CommonMethods.NavigateTo("Commercial Package",test);
				//CommonMethods.NavigateTo("Commercial Property", test);
				//CommercialPropertyPage.CommercialPropertyMethod(strRegressionID, transaction, test);
				//CommonMethods.NavigateToPage(constants.PageNm_GL,test);
				CommonMethods.NavigateTo("General Liability", test);
				CommonMethods.NavigateToPage(constants.PageNm_SpecialtyOption,test);
				GLSpecialityOptionPage.GL_SpecialityOption_Details(strRegressionID, transaction, test);
				//commented line 178 and 179 and moved these steps to NQ as part of 05/01/23 rate changes
				/*GL_AbuseAndMolestationPage.GL_AbuseAndMolestationMethod(strRegressionID, transaction, test);
				GL_AbuseAndMolestationClassificationPage.GL_AbuseAndMolestationClassificationMethod(strRegressionID,
						transaction, test);*/
				//CommonMethods.NavigateToPage(constants.PageNm_ExperienceRating,test);
				//GLExperienceRating.GLExperienceRatingPage(strRegressionID, transaction, test);
				CommonMethods.CollapseAllAndNavigateTo("Commercial Package", "20-CP", test);
				CommonMethods.NavigateTo("Cyber Security", test);
				CyberSecurtiy_Main.CyberSecurityPage(strRegressionID, transaction,cyberChkY,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				CommonMethods.getDashboardForms(strRegressionID,transaction,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
			if(transactionsList.contains(constants.ConvertQFRToPolicy)){
				String transaction = constants.ConvertQFRToPolicy;
				CommonMethods.CollapseAllAndNavigateTo("Commercial Package", "20-CP", test);
				CommonMethods.NavigateTo(constants.PageNm_GL,test);
				CommonMethods.NavigateTo(constants.PageNm_ProfessionLiabClaims,test);
				CP_ProfessionalLiabilityClaimsPage.CP_ProfessionalLiabilityClaimsPage(strRegressionID,transaction,test);
				CommonMethods.getCalculatePremium(strRegressionID,transaction,test);
				PremiumSummary.GetPremiumSummary(strRegressionID,transaction,transactionsList,file, workbook,test);
				CommonMethods.getDashboardActions(strRegressionID,transaction,test);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("Human Service CP Regression test  failed", true, false);
			testTearDown(se);
		}
	}

}
