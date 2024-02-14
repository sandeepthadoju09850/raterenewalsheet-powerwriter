
package pw.pages.CIM;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import pw.Constants.constants;
import pw.OR.OR_CIM;

public class CIM_Main extends OR_CIM {

	public void CIM_Main(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase(constants.CIM_Main)){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CIM_Main, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		try {
			
			CIM_Main CIMMainPage =  TestPageFactory.initElements(se, CIM_Main.class);
			
			CIMMainPage.primaryCoverage(row,test);
			CIMMainPage.kYTaxInformation(row,test);
			CIMMainPage.accountReceivableCoverage(row,test);
			CIMMainPage.boatAndMotorCoverage(row,test);
			CIMMainPage.builderRiskCoverage(row,test);
			CIMMainPage.cameraDealersCoverage(row,test);
			CIMMainPage.commercialArticlesCoverage(row,test);
			CIMMainPage.computerCoverage(row,test);
			CIMMainPage.contractorsEquipmentCoverage(row,test);
			CIMMainPage.exhibitionFloaterCoverage(row,test);
			CIMMainPage.fineArtsFloaterCoverage(row,test);
			CIMMainPage.golfCartCoverage(row,test);
			CIMMainPage.golfCourseTeesAndGreenCoverage(row,test);
			CIMMainPage.installationFloaterCoverage(row,test);
			CIMMainPage.launderersAndDryCleanersBaileeCoverage(row,test);
			CIMMainPage.lossPayableOptionsCoverage(row,test);
			CIMMainPage.miscellaneousBaileeProcessorFloaterCoverage(row,test);
			CIMMainPage.muscialInstrumentDealersCoverage(row,test);
			CIMMainPage.physiciansAndSurgeonsCoverage(row,test);
			CIMMainPage.scheduledPropertyFloaterCoverage(row,test);
			CIMMainPage.signsCoverage(row,test);
			CIMMainPage.transportationCoverage(row,test);
			CIMMainPage.valuablePapersCoverage(row,test);
			CIMMainPage.companyRatingPlans(row,test);
			se.element().Click(getNext(),test);
			se.util().sleep(3000);
			if(se.element().isElementPresent(Wariningyesbutton)){
				se.element().waitForElement(Wariningyesbutton);
				se.element().Click(getWariningyesbutton(), test);
				
			} 
			
					
		} catch (Exception e) {
			
			se.verify().verifyEquals("Failed to fill in details for CIMMainPage", true, false, true, test);
				}
				iteration++;
			}

		} catch (Exception e) {
			// TODO: handle exception
			se.log().logTestStep(
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			test.log(LogStatus.FAIL, "Failed",
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			testTearDown(se, test);
		}

	}
	
	
	public void primaryCoverage(Map<String, String> row, ExtentTest test) throws IOException {

		
		String strCIM_Main_TXT_PrimaryState = (String) row.get("CIM_Main_TXT_PrimaryState");
		String strCIM_Main_TXT_PrimaryCity = (String) row.get("CIM_Main_TXT_PrimaryCity");
		String strCIM_Main_TXT_Zip = (String) row.get("CIM_Main_TXT_Zip");
		String strCIM_Main_CHK_ProvideCovForCertActOfTerr = (String) row.get("CIM_Main_CHK_ProvideCovForCertActOfTerr");
		String strCIM_Main_CHK_SpecialEventsAward = (String) row.get("CIM_Main_CHK_SpecialEventsAward");
		String strCIM_Main_CHK_HoleInOne = (String) row.get("CIM_Main_CHK_HoleInOne");
		String strCIM_Main_CHK_MiscellaneousCoverage = (String) row.get("CIM_Main_CHK_MiscellaneousCoverage");
		
		try{
			se.log().logTestStep("Primary Coverage");
			test.log(LogStatus.INFO, "Primary Coverage section","Transaction Step : "+"" + "<br>" +"Page : CP_CIMMainPage");
			se.verify().verifyEquals("Primary Coverage section of PowerWriter ", getCIM_Main_LabelName().isDisplayed(),true, true,test);
			
		se.element().enterOrValidateText(getCIM_Main_TXT_PrimaryState(strCIM_Main_TXT_PrimaryState),strCIM_Main_TXT_PrimaryState,test);
		//below 2 New fields displayed from April 2021 release
		se.element().enterOrValidateText(getCIM_Main_TXT_PrimaryCity(strCIM_Main_TXT_PrimaryCity),strCIM_Main_TXT_PrimaryCity,test);
		se.element().selectPopupWithMagnifier(getCIM_Main_TXT_Zip(strCIM_Main_TXT_Zip), getCIM_Main_TXT_Zip_Search(strCIM_Main_TXT_Zip), strCIM_Main_TXT_PrimaryCity, constants.NA, strCIM_Main_TXT_PrimaryCity, constants.NA, constants.NA, constants.NA, test);
		
		se.element().checkUncheckOrValidate(getCIM_Main_CHK_ProvideCovForCertActOfTerr(strCIM_Main_CHK_ProvideCovForCertActOfTerr),strCIM_Main_CHK_ProvideCovForCertActOfTerr,test);
		
		se.element().checkUncheckOrValidate(getCIM_Main_CHK_SpecialEventsAward(strCIM_Main_CHK_SpecialEventsAward),strCIM_Main_CHK_SpecialEventsAward,test);
		
		se.element().checkUncheckOrValidate(getCIM_Main_CHK_HoleInOne(strCIM_Main_CHK_HoleInOne),strCIM_Main_CHK_HoleInOne,test);
		
		se.element().checkUncheckOrValidate(getCIM_Main_CHK_MiscellaneousCoverage(strCIM_Main_CHK_MiscellaneousCoverage),strCIM_Main_CHK_MiscellaneousCoverage,test);
		}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for Primary Coverage", true, false, true, test);		
			}
	}
	
	public void kYTaxInformation(Map<String, String> row, ExtentTest test) throws IOException {

		
		String transaction = (String) row.get("Transaction Name");
		String strCIM_Main_CHK_DoNotApplyCityOrCountyTax = (String) row.get("CIM_Main_CHK_DoNotApplyCityOrCountyTax");
		String strCIM_Main_CHK_AllCityName = (String) row.get("CIM_Main_CHK_AllCityName");
		String strCIM_Main_TXT_City = (String) row.get("CIM_Main_TXT_City");
		String strCIM_Main_TXT_CityFilter = (String) row.get("CIM_Main_TXT_CityFilter");
		String strCIM_Main_TXT_CityCode = (String) row.get("CIM_Main_TXT_CityCode");
		String strCIM_Main_CHK_AllCountyName = (String) row.get("CIM_Main_CHK_AllCountyName");
		String strCIM_Main_TXT_County = (String) row.get("CIM_Main_TXT_County");
		String strCIM_Main_TXT_CountyFilter = (String) row.get("CIM_Main_TXT_CountyFilter");
		String strCIM_Main_TXT_CountyCode = (String) row.get("CIM_Main_TXT_CountyCode");
		String strCIM_Main_TXT_TaxCode = (String) row.get("CIM_Main_TXT_TaxCode");
		String strCIM_Main_TXT_CountyCode_Popup = (String) row.get("CIM_Main_TXT_CountyCode_Popup");
		String strCIM_Main_TXT_CityCode_Popup = (String) row.get("CIM_Main_TXT_CityCode_Popup");
		
		try{
			se.log().logTestStep("KYInformation");
			test.log(LogStatus.INFO, "KYInformation section","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMMain");
			
		se.element().checkUncheckOrValidate(getCIM_Main_CHK_DoNotApplyCityOrCountyTax(strCIM_Main_CHK_DoNotApplyCityOrCountyTax),strCIM_Main_CHK_DoNotApplyCityOrCountyTax,test);
		se.element().checkUncheckOrValidate(getCIM_Main_CHK_AllCityName(strCIM_Main_CHK_AllCityName),strCIM_Main_CHK_AllCityName,test);
		se.element().selectPopupWithMagnifier(getCIM_Main_TXT_City(strCIM_Main_TXT_City), getCIM_Main_BTN_CitySearch(strCIM_Main_TXT_City), strCIM_Main_TXT_City,strCIM_Main_TXT_CityFilter, strCIM_Main_TXT_City,constants.NA, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getCIM_Main_TXT_CityCode(strCIM_Main_TXT_CityCode),strCIM_Main_TXT_CityCode,test);
		se.element().selectPopupWithMagnifier(getCIM_Main_TXT_County(strCIM_Main_TXT_County), getCIM_Main_BTN_CountySearch(strCIM_Main_TXT_County), strCIM_Main_TXT_County,strCIM_Main_TXT_CountyFilter, strCIM_Main_TXT_County,strCIM_Main_TXT_CountyCode_Popup, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getCIM_Main_TXT_CountyCode(strCIM_Main_TXT_CountyCode),strCIM_Main_TXT_CountyCode,test);
		se.element().enterOrValidateText(getCIM_Main_TXT_TaxCode(strCIM_Main_TXT_TaxCode),strCIM_Main_TXT_TaxCode,test);
	}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for KYInformation", true, false, true, test);
		}		
		
	}
		
	public void accountReceivableCoverage(Map<String, String> row, ExtentTest test) throws IOException {
		
		String strCIM_Main_CHK_AccountsReceivable = (String) row.get("CIM_Main_CHK_AccountsReceivable");
		String strCIM_Main_TXT_AccRecPolicyType = (String) row.get("CIM_Main_TXT_AccRecPolicyType");
		String strCIM_Main_TXT_AccRecCoinsurance = (String) row.get("CIM_Main_TXT_AccRecCoinsurance");
		String strCIM_Main_CHK_AccRecAwayFromPremiseCov = (String) row.get("CIM_Main_CHK_AccRecAwayFromPremiseCov");
		String strCIM_Main_TXT_AwayFromPremiseLimit = (String) row.get("CIM_Main_TXT_AwayFromPremiseLimit");
		String strCIM_Main_TXT_PackageModFactor = (String) row.get("CIM_Main_TXT_PackageModFactor");
		String strCIM_Main_CHK_AccRecSpecialProvisions = (String) row.get("CIM_Main_CHK_AccRecSpecialProvisions");
		String strCIM_Main_TXT_AccRec_EnterSpclProvVerbiage = (String) row.get("CIM_Main_TXT_AccRec_EnterSpclProvVerbiage");
		
		
		try{
			se.log().logTestStep("AccountReceivable Coverage");
			test.log(LogStatus.INFO, "AccountReceivable section","Transaction Step : "+"" + "<br>" +"Page : CP_CIMMainPage");
			
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_AccountsReceivable(strCIM_Main_CHK_AccountsReceivable),strCIM_Main_CHK_AccountsReceivable,test);
			se.element().selectPopupWithMagnifier(getCIM_Main_TXT_AccRecPolicyType(strCIM_Main_TXT_AccRecPolicyType), getCIM_Main_TXT_AccRecPolicyTypeSearch(strCIM_Main_TXT_AccRecPolicyType), strCIM_Main_TXT_AccRecPolicyType,constants.NA, strCIM_Main_TXT_AccRecPolicyType,constants.NA, constants.NA,constants.NA, test);
			se.element().selectPopupWithMagnifier(getCIM_Main_TXT_AccRecCoinsurance(strCIM_Main_TXT_AccRecCoinsurance), getCIM_Main_TXT_AccRecPolicyTypeSearch(strCIM_Main_TXT_AccRecCoinsurance), strCIM_Main_TXT_AccRecCoinsurance,constants.NA, strCIM_Main_TXT_AccRecCoinsurance,constants.NA, constants.NA,constants.NA, test);
			
			if(!strCIM_Main_CHK_AccRecAwayFromPremiseCov.equalsIgnoreCase(constants.NA)){
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_AccRecAwayFromPremiseCov(strCIM_Main_CHK_AccRecAwayFromPremiseCov),strCIM_Main_CHK_AccRecAwayFromPremiseCov,test);
			se.element().enterOrValidateText(getCIM_Main_TXT_AwayFromPremiseLimit(strCIM_Main_TXT_AwayFromPremiseLimit),strCIM_Main_TXT_AwayFromPremiseLimit,test);
			se.element().enterOrValidateText(getCIM_Main_TXT_PackageModFactor(strCIM_Main_TXT_PackageModFactor),strCIM_Main_TXT_PackageModFactor,test);
			}
			if(!strCIM_Main_CHK_AccRecSpecialProvisions.equalsIgnoreCase(constants.NA)){
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_AccRecSpecialProvisions(strCIM_Main_CHK_AccRecSpecialProvisions),strCIM_Main_CHK_AccRecSpecialProvisions,test);
			se.element().enterOrValidateText(getCIM_Main_TXT_AccRec_EnterSpclProvVerbiage(strCIM_Main_TXT_AccRec_EnterSpclProvVerbiage),strCIM_Main_TXT_AccRec_EnterSpclProvVerbiage,test);
			}
		}
			
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for AccountReceivable Coverage", true, false, true, test);		
			}
	}
		
	public void boatAndMotorCoverage(Map<String, String> row, ExtentTest test) throws IOException {

	String transaction = (String) row.get("Transaction Name");
	String strCIM_Main_CHK_BoatAndMotor = (String) row.get("CIM_Main_CHK_BoatAndMotor");
	String strCIM_Main_TXT_BoatAndMotorCovDedAmount = (String) row.get("CIM_Main_TXT_BoatAndMotorCovDedAmount");
	String strCIM_Main_TXT_BoatAndMotorNewlyAcqPropLimit = (String) row.get("CIM_Main_TXT_BoatAndMotorNewlyAcqPropLimit");

	try{
		se.log().logTestStep("Boat And Motor Coverage");
		test.log(LogStatus.INFO, "Boat And Motor  Coverage section","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMMainPage");
		if(!strCIM_Main_CHK_BoatAndMotor.equalsIgnoreCase(constants.NA)){
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_BoatAndMotor(strCIM_Main_CHK_BoatAndMotor),strCIM_Main_CHK_BoatAndMotor,test);
			se.element().selectPopupWithMagnifier(getCIM_Main_TXT_BoatAndMotorCovDedAmount(strCIM_Main_TXT_BoatAndMotorCovDedAmount), getCIM_Main_BTN_BoatAndMotorCovDedAmountSearch(strCIM_Main_TXT_BoatAndMotorCovDedAmount), strCIM_Main_TXT_BoatAndMotorCovDedAmount,constants.NA, strCIM_Main_TXT_BoatAndMotorCovDedAmount,constants.NA, constants.NA,constants.NA, test);
			se.element().enterOrValidateText(getCIM_Main_TXT_BoatAndMotorNewlyAcqPropLimit(strCIM_Main_TXT_BoatAndMotorNewlyAcqPropLimit),strCIM_Main_TXT_BoatAndMotorNewlyAcqPropLimit,test);
			if(se.element().isElementPresent(CIM_Main_BTN_OKButton)){
				se.element().Click(getCIM_Main_BTN_OKButton(), test);
			}
		}
	}
	catch(Exception e){
		se.verify().verifyEquals("Failed to fill in details for Boat And Motor Coverage", true, false, true, test);		
		}
}
		
	public void builderRiskCoverage(Map<String, String> row, ExtentTest test) throws IOException {

		
		String transaction = (String) row.get("Transaction Name");
		String strCIM_Main_CHK_BuildersRisk = (String) row.get("CIM_Main_CHK_BuildersRisk");
		String strCIM_Main_TXT_BuildersRiskDedAmount = (String) row.get("CIM_Main_TXT_BuildersRiskDedAmount");
		String strCIM_Main_TXT_BuildersRiskCoinsurance = (String) row.get("CIM_Main_TXT_BuildersRiskCoinsurance");
		String strCIM_Main_TXT_BuildersRiskCatastropheLim = (String) row.get("CIM_Main_TXT_BuildersRiskCatastropheLim");
		
		try{
			se.log().logTestStep("BuilderRisk Coverage ");
			test.log(LogStatus.INFO, "BuilderRisk Coverage section","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMMainPage");
			if(!transaction.equalsIgnoreCase(constants.NA)){
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_BuildersRisk(strCIM_Main_CHK_BuildersRisk),strCIM_Main_CHK_BuildersRisk,test);
			se.element().selectPopupWithMagnifier(getCIM_Main_TXT_BuildersRiskDedAmount(strCIM_Main_TXT_BuildersRiskDedAmount), getCIM_Main_BTN_BuildersRiskDedAmountSearch(strCIM_Main_TXT_BuildersRiskDedAmount), strCIM_Main_TXT_BuildersRiskDedAmount,constants.NA, strCIM_Main_TXT_BuildersRiskDedAmount,constants.NA, constants.NA,constants.NA, test);
			se.element().selectPopupWithMagnifier(getCIM_Main_TXT_BuildersRiskCoinsurance(strCIM_Main_TXT_BuildersRiskCoinsurance), getCIM_Main_BTN_BuildersRiskCoinsuranceSearch(strCIM_Main_TXT_BuildersRiskCoinsurance), strCIM_Main_TXT_BuildersRiskCoinsurance,constants.NA, strCIM_Main_TXT_BuildersRiskCoinsurance,constants.NA, constants.NA,constants.NA, test);
			se.element().enterOrValidateText(getCIM_Main_TXT_BuildersRiskCatastropheLim(strCIM_Main_TXT_BuildersRiskCatastropheLim),strCIM_Main_TXT_BuildersRiskCatastropheLim,test);
			}
		}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for BuilderRisk Coverage", true, false, true, test);		
			}
	}
		
	public void cameraDealersCoverage(Map<String, String> row, ExtentTest test) throws IOException {

		
		String transaction = (String) row.get("Transaction Name");
		String strCIM_Main_CHK_CameraDealers = (String) row.get("CIM_Main_CHK_CameraDealers");
		String strCIM_Main_TXT_CameraDealersPolicyType = (String) row.get("CIM_Main_TXT_CameraDealersPolicyType");
		String strCIM_Main_TXT_CameraDealersCoinsurance = (String) row.get("CIM_Main_TXT_CameraDealersCoinsurance");
		String strCIM_Main_TXT_CameraDealersTotLimAllLoc = (String) row.get("CIM_Main_TXT_CameraDealersTotLimAllLoc");
		String strCIM_Main_TXT_CameraDealerDedAmt = (String) row.get("CIM_Main_TXT_CameraDealerDedAmt");
		String strCIM_Main_CHK_CameraDealerSpecialProv = (String) row.get("CIM_Main_CHK_CameraDealerSpecialProv");
		String strCIM_Main_TXT_CamDealers_EnterSpecProvVerbiage = (String) row.get("CIM_Main_TXT_CamDealers_EnterSpecProvVerbiage");
		
		try{
			se.log().logTestStep("CameraDealers Coverage");
			test.log(LogStatus.INFO, "CameraDealers Coverage section","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMMainPage");
			if(!strCIM_Main_CHK_CameraDealers.equalsIgnoreCase(constants.NA)){
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_CameraDealers(strCIM_Main_CHK_CameraDealers),strCIM_Main_CHK_CameraDealers,test);
			se.element().selectPopupWithMagnifier(getCIM_Main_TXT_CameraDealersPolicyType(strCIM_Main_TXT_CameraDealersPolicyType), getCIM_Main_TXT_CameraDealersPolicyTypeSearch(strCIM_Main_TXT_CameraDealersPolicyType), strCIM_Main_TXT_CameraDealersPolicyType,constants.NA, strCIM_Main_TXT_CameraDealersPolicyType,constants.NA, constants.NA,constants.NA, test);
			se.element().selectPopupWithMagnifier(getCIM_Main_TXT_CameraDealersCoinsurance(strCIM_Main_TXT_CameraDealersCoinsurance), getCIM_Main_BTN_CameraDealersCoinsuranceSearch(strCIM_Main_TXT_CameraDealersCoinsurance), strCIM_Main_TXT_CameraDealersCoinsurance,constants.NA, strCIM_Main_TXT_CameraDealersCoinsurance,constants.NA, constants.NA,constants.NA, test);
			se.element().enterOrValidateText(getCIM_Main_TXT_CameraDealersTotLimAllLoc(strCIM_Main_TXT_CameraDealersTotLimAllLoc),strCIM_Main_TXT_CameraDealersTotLimAllLoc,test);
			se.element().selectPopupWithMagnifier(getCIM_Main_TXT_CameraDealerDedAmt(strCIM_Main_TXT_CameraDealerDedAmt), getCIM_Main_BTN_CameraDealerDedAmtSearch(strCIM_Main_TXT_CameraDealerDedAmt), strCIM_Main_TXT_CameraDealerDedAmt,constants.NA, strCIM_Main_TXT_CameraDealerDedAmt,constants.NA, constants.NA,constants.NA, test);
			
				if(!strCIM_Main_CHK_CameraDealerSpecialProv.equalsIgnoreCase(constants.NA)){
				se.element().checkUncheckOrValidate(getCIM_Main_CHK_CameraDealerSpecialProv(strCIM_Main_CHK_CameraDealerSpecialProv),strCIM_Main_CHK_CameraDealerSpecialProv,test);
				se.element().enterOrValidateText(getCIM_Main_TXT_CamDealers_EnterSpecProvVerbiage(strCIM_Main_TXT_CamDealers_EnterSpecProvVerbiage),strCIM_Main_TXT_CamDealers_EnterSpecProvVerbiage,test);
			}
			
			}
		
		}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CameraDealers Coverage", true, false, true, test);		
			}
	}
	
	public void commercialArticlesCoverage(Map<String, String> row, ExtentTest test) throws IOException {

		String transaction = (String) row.get("Transaction Name");
		String strCIM_Main_CHK_CommercialArticles = (String) row.get("CIM_Main_CHK_CommercialArticles");
		String strCIM_Main_TXT_CommercialArticlesTotLimAllLoc = (String) row.get("CIM_Main_TXT_CommercialArticlesTotLimAllLoc");
		String strCIM_Main_TXT_CommercialArticlesDedAmt = (String) row.get("CIM_Main_TXT_CommercialArticlesDedAmt");
		String strCIM_Main_CHK_DoesOrgansNotPfMobile = (String) row.get("CIM_Main_CHK_DoesOrgansNotPfMobile");
		String strCIM_Main_CHK_CommercialArticlesSpecialProv = (String) row.get("CIM_Main_CHK_CommercialArticlesSpecialProv");
		String strCIM_Main_TXT_CommArticles_EnterSpecProvVerbiage = (String) row.get("CIM_Main_TXT_CommArticles_EnterSpecProvVerbiage");
		
		try{
			se.log().logTestStep("CommercialArticles Coverage");
			test.log(LogStatus.INFO, "CommercialArticles Coverage section","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMMainPage");
			if(!transaction.equalsIgnoreCase(constants.NA)){
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_CommercialArticles(strCIM_Main_CHK_CommercialArticles),strCIM_Main_CHK_CommercialArticles,test);
			se.util().sleep(1000);
			se.element().enterOrValidateText(getCIM_Main_TXT_CommercialArticlesTotLimAllLoc(strCIM_Main_TXT_CommercialArticlesTotLimAllLoc),strCIM_Main_TXT_CommercialArticlesTotLimAllLoc,test);
			se.element().selectPopupWithMagnifier(getCIM_Main_TXT_CommercialArticlesDedAmt(strCIM_Main_TXT_CommercialArticlesDedAmt), getCIM_Main_BTN_CommercialArticlesDedAmtSearch(strCIM_Main_TXT_CommercialArticlesDedAmt), strCIM_Main_TXT_CommercialArticlesDedAmt,constants.NA, strCIM_Main_TXT_CommercialArticlesDedAmt,constants.NA, constants.NA,constants.NA, test);
			
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_DoesOrgansNotPfMobile(strCIM_Main_CHK_DoesOrgansNotPfMobile),strCIM_Main_CHK_DoesOrgansNotPfMobile,test);
			if(!strCIM_Main_CHK_CommercialArticlesSpecialProv.equalsIgnoreCase(constants.NA)){
				se.element().checkUncheckOrValidate(getCIM_Main_CHK_CommercialArticlesSpecialProv(strCIM_Main_CHK_CommercialArticlesSpecialProv),strCIM_Main_CHK_CommercialArticlesSpecialProv,test);
				se.element().enterOrValidateText(getCIM_Main_TXT_CommArticles_EnterSpecProvVerbiage(strCIM_Main_TXT_CommArticles_EnterSpecProvVerbiage),strCIM_Main_TXT_CommArticles_EnterSpecProvVerbiage,test);
			}
		}
	}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CommercialArticles Coverage", true, false, true, test);		
			}
	}
	
	public void computerCoverage(Map<String, String> row, ExtentTest test) throws IOException {

	
		
		String transaction = (String) row.get("Transaction Name");
		String strCIM_Main_CHK_Computer = (String) row.get("CIM_Main_CHK_Computer");
		String strCIM_Main_TXT_ComputerDedAmt = (String) row.get("CIM_Main_TXT_ComputerDedAmt");
		String strCIM_Main_TXT_ComputerCoinsurance = (String) row.get("CIM_Main_TXT_ComputerCoinsurance");
		String strCIM_Main_CHK_ComputerCovg_ActualCashValue = (String) row.get("CIM_Main_CHK_ComputerCovg_ActualCashValue");
		String strCIM_Main_CHK_ComputerCovg_ReplacementCost = (String) row.get("CIM_Main_CHK_ComputerCovg_ReplacementCost");
		
		
		try{
			se.log().logTestStep("Computer Coverage");
			test.log(LogStatus.INFO, "Primary Coverage section","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMMainPage");
			if(!strCIM_Main_CHK_Computer.equalsIgnoreCase(constants.NA)){
				se.element().checkUncheckOrValidate(getCIM_Main_CHK_Computer(strCIM_Main_CHK_Computer),strCIM_Main_CHK_Computer,test);
				se.element().selectPopupWithMagnifier(getCIM_Main_TXT_ComputerDedAmt(strCIM_Main_TXT_ComputerDedAmt), getCIM_Main_BTN_ComputerDedAmtSearch(strCIM_Main_TXT_ComputerDedAmt), strCIM_Main_TXT_ComputerDedAmt,constants.NA, strCIM_Main_TXT_ComputerDedAmt,constants.NA, constants.NA,constants.NA, test);
				se.element().selectPopupWithMagnifier(getCIM_Main_TXT_ComputerCoinsurance(strCIM_Main_TXT_ComputerCoinsurance), getCIM_Main_BTN_ComputerCoinsuranceSearch(strCIM_Main_TXT_ComputerCoinsurance), strCIM_Main_TXT_ComputerCoinsurance,constants.NA, strCIM_Main_TXT_ComputerCoinsurance,constants.NA, constants.NA,constants.NA, test);
				
			}
				
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_ComputerCovg_ActualCashValue(strCIM_Main_CHK_ComputerCovg_ActualCashValue),strCIM_Main_CHK_ComputerCovg_ActualCashValue,test);
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_ComputerCovg_ReplacementCost(strCIM_Main_CHK_ComputerCovg_ReplacementCost),strCIM_Main_CHK_ComputerCovg_ReplacementCost,test);
		}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for Computer Coverage", true, false, true, test);		
			}
	}

	public void contractorsEquipmentCoverage(Map<String, String> row, ExtentTest test) throws IOException {
		
		String transaction = (String) row.get("Transaction Name");
		String strCIM_Main_CHK_ContractorsEquipment = (String) row.get("CIM_Main_CHK_ContractorsEquipment");
		String strCIM_Main_CHK_EquipmentSpecificallySchAndSmallTools = (String) row.get("CIM_Main_CHK_EquipmentSpecificallySchAndSmallTools");
		String strCIM_Main_TXT_ContractorsEquipDedAmt = (String) row.get("CIM_Main_TXT_ContractorsEquipDedAmt");
		String strCIM_Main_CHK_ContractorEquipment_ActualCashValue = (String) row.get("CIM_Main_CHK_ContractorEquipment_ActualCashValue");
		String strCIM_Main_CHK_ContractorEquipment_ReplacementCost = (String) row.get("CIM_Main_CHK_ContractorEquipment_ReplacementCost");
		String strCIM_Main_TXT_ContractorsEquipCoinsurance = (String) row.get("CIM_Main_TXT_ContractorsEquipCoinsurance");
		String strCIM_Main_TXT_ContractorsEquipCatastropheLim = (String) row.get("CIM_Main_TXT_ContractorsEquipCatastropheLim");
		String strCIM_Main_CHK_EquipScheduleOnFilewithComSmallTools = (String) row.get("CIM_Main_CHK_EquipScheduleOnFilewithComSmallTools");
		String strCIM_Main_TXT_EquipSchOnFile_ContrEquipDedAmount = (String) row.get("CIM_Main_TXT_EquipSchOnFile_ContrEquipDedAmount");
		String strCIM_Main_CHK_EquipSchOnFile_ContrEquipActualCashValue = (String) row.get("CIM_Main_CHK_EquipSchOnFile_ContrEquipActualCashValue");
		String strCIM_Main_CHK_EquipSchOnFile_ContrEquipReplacementCost = (String) row.get("CIM_Main_CHK_EquipSchOnFile_ContrEquipReplacementCost");
		String strCIM_Main_TXT_EquipSchOnFile_ContrEquipCoinsurance = (String) row.get("CIM_Main_TXT_EquipSchOnFile_ContrEquipCoinsurance");
		String strCIM_Main_TXT_EquipSchOnFile_ContrEquipCatastropheLim = (String) row.get("CIM_Main_TXT_EquipSchOnFile_ContrEquipCatastropheLim");
		String strCIM_Main_CHK_NoEquipmentSmallEndorsOnly = (String) row.get("CIM_Main_CHK_NoEquipmentSmallEndorsOnly");
		
		try{
			se.log().logTestStep("ContractorsEquipment Coverage");
			test.log(LogStatus.INFO, "ContractorsEquipment Coverage section","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMMainPage");
			
				se.element().checkUncheckOrValidate(getCIM_Main_CHK_ContractorsEquipment(strCIM_Main_CHK_ContractorsEquipment),strCIM_Main_CHK_ContractorsEquipment,test);
			
				if(!strCIM_Main_CHK_EquipmentSpecificallySchAndSmallTools.equalsIgnoreCase(constants.NA)){
					se.element().checkUncheckOrValidate(getCIM_Main_CHK_EquipmentSpecificallySchAndSmallTools(strCIM_Main_CHK_EquipmentSpecificallySchAndSmallTools),strCIM_Main_CHK_EquipmentSpecificallySchAndSmallTools,test);
					se.element().selectPopupWithMagnifier(getCIM_Main_TXT_ContractorsEquipDedAmt(strCIM_Main_TXT_ContractorsEquipDedAmt), getCIM_Main_BTN_ContractorsEquipDedAmtSearch(strCIM_Main_TXT_ContractorsEquipDedAmt), strCIM_Main_TXT_ContractorsEquipDedAmt,constants.NA, strCIM_Main_TXT_ContractorsEquipDedAmt,constants.NA, constants.NA,constants.NA, test);
					se.element().checkUncheckOrValidate(getCIM_Main_CHK_ContractorEquipment_ActualCashValue(strCIM_Main_CHK_ContractorEquipment_ActualCashValue),strCIM_Main_CHK_ContractorEquipment_ActualCashValue,test);
					se.element().checkUncheckOrValidate(getCIM_Main_CHK_ContractorEquipment_ReplacementCost(strCIM_Main_CHK_ContractorEquipment_ReplacementCost),strCIM_Main_CHK_ContractorEquipment_ReplacementCost,test);
					se.element().selectPopupWithMagnifier(getCIM_Main_TXT_ContractorsEquipCoinsurance(strCIM_Main_TXT_ContractorsEquipCoinsurance), getCIM_Main_BTN_ContractorsEquipCoinsuranceSearch(strCIM_Main_TXT_ContractorsEquipCoinsurance), strCIM_Main_TXT_ContractorsEquipCoinsurance,constants.NA, strCIM_Main_TXT_ContractorsEquipCoinsurance,constants.NA, constants.NA,constants.NA, test);
					se.element().enterOrValidateText(getCIM_Main_TXT_ContractorsEquipCatastropheLim(strCIM_Main_TXT_ContractorsEquipCatastropheLim),strCIM_Main_TXT_ContractorsEquipCatastropheLim,test);
				}
				
				if(!strCIM_Main_CHK_EquipScheduleOnFilewithComSmallTools.equalsIgnoreCase(constants.NA)){
					se.element().checkUncheckOrValidate(getCIM_Main_CHK_EquipScheduleOnFilewithComSmallTools(strCIM_Main_CHK_EquipScheduleOnFilewithComSmallTools),strCIM_Main_CHK_EquipScheduleOnFilewithComSmallTools,test);
					se.element().selectPopupWithMagnifier(getCIM_Main_TXT_EquipSchOnFile_ContrEquipDedAmount(strCIM_Main_TXT_EquipSchOnFile_ContrEquipDedAmount), getCIM_Main_BTN_EquipSchOnFile_ContrEquipDedAmountSearch(strCIM_Main_TXT_EquipSchOnFile_ContrEquipDedAmount), strCIM_Main_TXT_EquipSchOnFile_ContrEquipDedAmount,constants.NA, strCIM_Main_TXT_EquipSchOnFile_ContrEquipDedAmount,constants.NA, constants.NA,constants.NA, test);
					se.element().checkUncheckOrValidate(getCIM_Main_CHK_EquipSchOnFile_ContrEquipActualCashValue(strCIM_Main_CHK_EquipSchOnFile_ContrEquipActualCashValue),strCIM_Main_CHK_EquipSchOnFile_ContrEquipActualCashValue,test);
					se.element().checkUncheckOrValidate(getCIM_Main_CHK_EquipSchOnFile_ContrEquipReplacementCost(strCIM_Main_CHK_EquipSchOnFile_ContrEquipReplacementCost),strCIM_Main_CHK_EquipSchOnFile_ContrEquipReplacementCost,test);
					se.element().selectPopupWithMagnifier(getCIM_Main_TXT_EquipSchOnFile_ContrEquipCoinsurance(strCIM_Main_TXT_EquipSchOnFile_ContrEquipCoinsurance), getCIM_Main_BTN_EquipSchOnFile_ContrEquipCoinsuranceSearch(strCIM_Main_TXT_EquipSchOnFile_ContrEquipCoinsurance), strCIM_Main_TXT_EquipSchOnFile_ContrEquipCoinsurance,constants.NA, strCIM_Main_TXT_EquipSchOnFile_ContrEquipCoinsurance,constants.NA, constants.NA,constants.NA, test);
					se.element().enterOrValidateText(getCIM_Main_TXT_EquipSchOnFile_ContrEquipCatastropheLim(strCIM_Main_TXT_EquipSchOnFile_ContrEquipCatastropheLim),strCIM_Main_TXT_EquipSchOnFile_ContrEquipCatastropheLim,test);
				}
				
				se.element().checkUncheckOrValidate(getCIM_Main_CHK_NoEquipmentSmallEndorsOnly(strCIM_Main_CHK_NoEquipmentSmallEndorsOnly),strCIM_Main_CHK_NoEquipmentSmallEndorsOnly,test);
				se.util().sleep(2000);
				if(se.element().isElementPresent(Wariningyesbutton)){
					se.element().waitForElement(Wariningyesbutton);
					se.element().Click(getWariningyesbutton(), test);
					
				} 
			
	
		}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for ContractorsEquipment Coverage", true, false, true, test);		
			}
	}

	public void exhibitionFloaterCoverage(Map<String, String> row, ExtentTest test) throws IOException {


		String transaction = (String) row.get("Transaction Name");
		String strCIM_Main_CHK_ExhibitionFloater = (String) row.get("CIM_Main_CHK_ExhibitionFloater");
		String strCIM_Main_TXT_ExhibFlaoterDedAmount = (String) row.get("CIM_Main_TXT_ExhibFlaoterDedAmount");
		
		try{
			se.log().logTestStep("ExhibitionFloater Coverage");
			test.log(LogStatus.INFO, "ExhibitionFloater Coverage section","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMMainPage");
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_ExhibitionFloater(strCIM_Main_CHK_ExhibitionFloater),strCIM_Main_CHK_ExhibitionFloater,test);
			se.element().selectPopupWithMagnifier(getCIM_Main_TXT_ExhibFlaoterDedAmount(strCIM_Main_TXT_ExhibFlaoterDedAmount), getCIM_Main_BTN_ExhibFlaoterDedAmountSearch(strCIM_Main_TXT_ExhibFlaoterDedAmount), strCIM_Main_TXT_ExhibFlaoterDedAmount,constants.NA, strCIM_Main_TXT_ExhibFlaoterDedAmount,constants.NA, constants.NA,constants.NA, test);
			
		}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for ExhibitionFloater Coverage", true, false, true, test);		
			}
	}
	
	public void fineArtsFloaterCoverage(Map<String, String> row, ExtentTest test) throws IOException {

		
		String transaction = (String) row.get("Transaction Name");
		String strCIM_Main_CHK_FineArtsFloater = (String) row.get("CIM_Main_CHK_FineArtsFloater");
		String strCIM_Main_TXT_FineArtsFloaterDedAmount = (String) row.get("CIM_Main_TXT_FineArtsFloaterDedAmount");
		String strCIM_Main_TXT_FineArtsCatastropheLimit = (String) row.get("CIM_Main_TXT_FineArtsCatastropheLimit");
		
		try{
			se.log().logTestStep("FineArts Floater Coverage");
			test.log(LogStatus.INFO, "FineArts Floater Coverage section","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMMainPage");
			if(!transaction.equalsIgnoreCase(constants.NA)){
				se.element().checkUncheckOrValidate(getCIM_Main_CHK_FineArtsFloater(strCIM_Main_CHK_FineArtsFloater),strCIM_Main_CHK_FineArtsFloater,test);
				se.element().selectPopupWithMagnifier(getCIM_Main_FineArtsFloater_TXT_DedAmt(strCIM_Main_TXT_FineArtsFloaterDedAmount), getCIM_Main_FineArtsFloater_BTN_DedAmt_Magnifier(strCIM_Main_TXT_FineArtsFloaterDedAmount), strCIM_Main_TXT_FineArtsFloaterDedAmount,constants.NA, strCIM_Main_TXT_FineArtsFloaterDedAmount,constants.NA, constants.NA,constants.NA, test);
				se.element().enterOrValidateText(getCIM_Main_FineArtsFloater_TXT_CatastropheLimit(strCIM_Main_TXT_FineArtsCatastropheLimit),strCIM_Main_TXT_FineArtsCatastropheLimit,test);
			}
		}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for FineArts Floater Coverage", true, false, true, test);		
			}
	}

	public void golfCartCoverage(Map<String, String> row, ExtentTest test) throws IOException {

		
		String transaction = (String) row.get("Transaction Name");
		String strCIM_Main_CHK_GolfCart = (String) row.get("CIM_Main_CHK_GolfCart");
		String strCIM_Main_TXT_GolfCartDedAmount = (String) row.get("CIM_Main_TXT_GolfCartDedAmount");
		String strCIM_Main_TXT_GolfCartCoinsurance = (String) row.get("CIM_Main_TXT_GolfCartCoinsurance");
		String strCIM_Main_CHK_GolfCart_ActualCashValue = (String) row.get("CIM_Main_CHK_GolfCart_ActualCashValue");
		String strCIM_Main_CHK_GolfCart_ReplacementCost = (String) row.get("CIM_Main_CHK_GolfCart_ReplacementCost");

		try{
			se.log().logTestStep("GolfCart Coverage");
			test.log(LogStatus.INFO, "GolfCart Coverage section","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMMainPage");
			if(!strCIM_Main_CHK_GolfCart.equalsIgnoreCase(constants.NA)){
	
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_GolfCart(strCIM_Main_CHK_GolfCart),strCIM_Main_CHK_GolfCart,test);
			se.element().selectPopupWithMagnifier(getCIM_Main_TXT_GolfCartDedAmount(strCIM_Main_TXT_GolfCartDedAmount), getCIM_Main_BTN_GolfCartDedAmountSearch(strCIM_Main_TXT_GolfCartDedAmount), strCIM_Main_TXT_GolfCartDedAmount,constants.NA, strCIM_Main_TXT_GolfCartDedAmount,constants.NA, constants.NA,constants.NA, test);
			se.element().selectPopupWithMagnifier(getCIM_Main_LNK_GolfCartCoinsuranceOption(strCIM_Main_TXT_GolfCartCoinsurance), getCIM_Main_BTN_GolfCartCoinsuranceSearch(strCIM_Main_TXT_GolfCartCoinsurance), strCIM_Main_TXT_GolfCartCoinsurance,constants.NA, strCIM_Main_TXT_GolfCartCoinsurance,constants.NA, constants.NA,constants.NA, test);
			
			//se.element().enterOrValidateText(getCIM_Main_TXT_GolfCartCoinsurance(strCIM_Main_TXT_GolfCartCoinsurance),strCIM_Main_TXT_GolfCartCoinsurance,test);
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_GolfCart_ActualCashValue(strCIM_Main_CHK_GolfCart_ActualCashValue),strCIM_Main_CHK_GolfCart_ActualCashValue,test);
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_GolfCart_ReplacementCost(strCIM_Main_CHK_GolfCart_ReplacementCost),strCIM_Main_CHK_GolfCart_ReplacementCost,test);
			
		}
			
		}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for GolfCart Coverage", true, false, true, test);		
			}
	}
	
	public void golfCourseTeesAndGreenCoverage(Map<String, String> row, ExtentTest test) throws IOException {

		
		String transaction = (String) row.get("Transaction Name");
		String strCIM_Main_CHK_GolfCourseTeesAndGreens = (String) row.get("CIM_Main_CHK_GolfCourseTeesAndGreens");
		String strCIM_Main_TXT_GolfCoTeesAndGreenDedAmount = (String) row.get("CIM_Main_TXT_GolfCoTeesAndGreenDedAmount");
		String strCIM_Main_TXT_GolfCoTeesAndGreenBusinessIncome = (String) row.get("CIM_Main_TXT_GolfCoTeesAndGreenBusinessIncome");
	
		
		try{
			se.log().logTestStep("golfCourseTeesAndGreen Coverage");
			test.log(LogStatus.INFO, "golfCourseTeesAndGreen Coverage section","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMMainPage");
			if(!strCIM_Main_CHK_GolfCourseTeesAndGreens.equalsIgnoreCase(constants.NA)){
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_GolfCourseTeesAndGreens(strCIM_Main_CHK_GolfCourseTeesAndGreens),strCIM_Main_CHK_GolfCourseTeesAndGreens,test);
			se.element().selectPopupWithMagnifier(getCIM_Main_TXT_GolfCoTeesAndGreenDedAmount(strCIM_Main_TXT_GolfCoTeesAndGreenDedAmount), getCIM_Main_BTN_GolfCoTeesAndGreenDedAmountSearch(strCIM_Main_TXT_GolfCoTeesAndGreenDedAmount), strCIM_Main_TXT_GolfCoTeesAndGreenDedAmount,constants.NA, strCIM_Main_TXT_GolfCoTeesAndGreenDedAmount,constants.NA, constants.NA,constants.NA, test);
			se.element().enterOrValidateText(getCIM_Main_TXT_GolfCoTeesAndGreenBusinessIncome(strCIM_Main_TXT_GolfCoTeesAndGreenBusinessIncome),strCIM_Main_TXT_GolfCoTeesAndGreenBusinessIncome,test);
			}
		}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for golfCourseTeesAndGreen Coverage", true, false, true, test);		
			}
	}
	
	public void installationFloaterCoverage(Map<String, String> row, ExtentTest test) throws IOException {

		
		String transaction = (String) row.get("Transaction Name");
		String strCIM_Main_CHK_InstallationFloater = (String) row.get("CIM_Main_CHK_InstallationFloater");
		String strCIM_Main_TXT_InstallationFloaterDedAmount = (String) row.get("CIM_Main_TXT_InstallationFloaterDedAmount");
		String strCIM_Main_TXT_InstallationFloaterCoinsurance = (String) row.get("CIM_Main_TXT_InstallationFloaterCoinsurance");
		
		try{
			se.log().logTestStep("installationFloater Coverage");
			test.log(LogStatus.INFO, "installationFloater Coverage section","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMMainPage");
			if(!strCIM_Main_CHK_InstallationFloater.equalsIgnoreCase(constants.NA)){
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_InstallationFloater(strCIM_Main_CHK_InstallationFloater),strCIM_Main_CHK_InstallationFloater,test);
			se.element().selectPopupWithMagnifier(getCIM_Main_TXT_InstallationFloaterDedAmount(strCIM_Main_TXT_InstallationFloaterDedAmount), getCIM_Main_BTN_InstallationFloaterDedAmountSearch(strCIM_Main_TXT_InstallationFloaterDedAmount), strCIM_Main_TXT_InstallationFloaterDedAmount,constants.NA, strCIM_Main_TXT_InstallationFloaterDedAmount,constants.NA, constants.NA,constants.NA, test);
			se.element().selectPopupWithMagnifier(getCIM_Main_TXT_InstallationFloaterCoinsurance(strCIM_Main_TXT_InstallationFloaterCoinsurance), getCIM_Main_BTN_InstallationFloaterCoinsuranceSearch(strCIM_Main_TXT_InstallationFloaterCoinsurance), strCIM_Main_TXT_InstallationFloaterCoinsurance,constants.NA, strCIM_Main_TXT_InstallationFloaterCoinsurance,constants.NA, constants.NA,constants.NA, test);
			
			
			}
		}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for installationFloater Coverage", true, false, true, test);		
			}
	}
	
	public void launderersAndDryCleanersBaileeCoverage(Map<String, String> row, ExtentTest test) throws IOException {

		String transaction = (String) row.get("Transaction Name");
		String strCIM_Main_CHK_LaunderersAndDryCleanersBailee = (String) row.get("CIM_Main_CHK_LaunderersAndDryCleanersBailee");
		String strCIM_Main_TXT_LaunderersAndDryCleanersBaileeDedAmt = (String) row.get("CIM_Main_TXT_LaunderersAndDryCleanersBaileeDedAmt");

		
		try{
			se.log().logTestStep("launderersAndDryCleanersBailee Coverage");
			test.log(LogStatus.INFO, "launderersAndDryCleanersBailee Coverage section","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMMainPage");
			if(!strCIM_Main_CHK_LaunderersAndDryCleanersBailee.equalsIgnoreCase(constants.NA)){
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_LaunderersAndDryCleanersBailee(strCIM_Main_CHK_LaunderersAndDryCleanersBailee),strCIM_Main_CHK_LaunderersAndDryCleanersBailee,test);
			se.element().selectPopupWithMagnifier(getCIM_Main_TXT_LaunderersAndDryCleanersBaileeDedAmt(strCIM_Main_TXT_LaunderersAndDryCleanersBaileeDedAmt), getCIM_Main_BTN_LaunderersAndDryCleanersBaileeDedAmtSearch(strCIM_Main_TXT_LaunderersAndDryCleanersBaileeDedAmt), strCIM_Main_TXT_LaunderersAndDryCleanersBaileeDedAmt,constants.NA, strCIM_Main_TXT_LaunderersAndDryCleanersBaileeDedAmt,constants.NA, constants.NA,constants.NA, test);
			
			}
		}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for launderersAndDryCleanersBailee Coverage", true, false, true, test);		
			}
	}
	
	public void lossPayableOptionsCoverage(Map<String, String> row, ExtentTest test) throws IOException {

		
		String transaction = (String) row.get("Transaction Name");
		String strCIM_Main_CHK_LossPayableOptions = (String) row.get("CIM_Main_CHK_LossPayableOptions");
		
		try{
			se.log().logTestStep("lossPayableOptions Coverage");
			test.log(LogStatus.INFO, "lossPayableOptions Coverage section","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMMainPage");
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_LossPayableOptions(strCIM_Main_CHK_LossPayableOptions),strCIM_Main_CHK_LossPayableOptions,test);
		}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for lossPayableOptions Coverage", true, false, true, test);		
			}
	}
		
	public void miscellaneousBaileeProcessorFloaterCoverage(Map<String, String> row, ExtentTest test) throws IOException {

		
		String transaction = (String) row.get("Transaction Name");
		String strCIM_Main_CHK_LaunderersAndDryCleanersBailee = (String) row.get("CIM_Main_CHK_LaunderersAndDryCleanersBailee");
		String strCIM_Main_TXT_LaunderersAndDryCleanersBaileeDedAmt = (String) row.get("CIM_Main_TXT_LaunderersAndDryCleanersBaileeDedAmt");
		String strCIM_Main_CHK_LossPayableOptions = (String) row.get("CIM_Main_CHK_LossPayableOptions");
		String strCIM_Main_CHK_MiscellaneousBaileePrecessorFloater = (String) row.get("CIM_Main_CHK_MiscellaneousBaileePrecessorFloater");
		String strCIM_Main_TXT_MiscBaileeProcessorFloaterDedAmount = (String) row.get("CIM_Main_TXT_MiscBaileeProcessorFloaterDedAmount");
		String strCIM_Main_CHK_MiscBaileeProcFloater_ActualCashValue = (String) row.get("CIM_Main_CHK_MiscBaileeProcFloater_ActualCashValue");
		String strCIM_Main_CHK_MiscBaileeProcFloater_ReplacementCost = (String) row.get("CIM_Main_CHK_MiscBaileeProcFloater_ReplacementCost");
		
		try{
			se.log().logTestStep("MiscellaneousBaileeProcessorFloater Coverage");
			test.log(LogStatus.INFO, "MiscellaneousBaileeProcessorFloater Coverage section","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMMainPage");
			if(!strCIM_Main_CHK_MiscellaneousBaileePrecessorFloater.equalsIgnoreCase(constants.NA)){
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_MiscellaneousBaileePrecessorFloater(strCIM_Main_CHK_MiscellaneousBaileePrecessorFloater),strCIM_Main_CHK_MiscellaneousBaileePrecessorFloater,test);
			se.element().selectPopupWithMagnifier(getCIM_Main_TXT_MiscBaileeProcessorFloaterDedAmount(strCIM_Main_TXT_MiscBaileeProcessorFloaterDedAmount), getCIM_Main_BTN_MiscBaileeProcessorFloaterDedAmountSearch(strCIM_Main_TXT_MiscBaileeProcessorFloaterDedAmount), strCIM_Main_TXT_MiscBaileeProcessorFloaterDedAmount,constants.NA, strCIM_Main_TXT_MiscBaileeProcessorFloaterDedAmount,constants.NA, constants.NA,constants.NA, test);
			
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_MiscBaileeProcFloater_ActualCashValue(strCIM_Main_CHK_MiscBaileeProcFloater_ActualCashValue),strCIM_Main_CHK_MiscBaileeProcFloater_ActualCashValue,test);
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_MiscBaileeProcFloater_ReplacementCost(strCIM_Main_CHK_MiscBaileeProcFloater_ReplacementCost),strCIM_Main_CHK_MiscBaileeProcFloater_ReplacementCost,test);
			}
		}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for MiscellaneousBaileeProcessorFloater Coverage", true, false, true, test);		
			}
	}
	
	public void muscialInstrumentDealersCoverage(Map<String, String> row, ExtentTest test) throws IOException {

		
		String transaction = (String) row.get("Transaction Name");

		String strCIM_Main_CHK_MusicalInstrumentDealers = (String) row.get("CIM_Main_CHK_MusicalInstrumentDealers");
		String strCIM_Main_TXT_MusicalInstrumentDealersPolicyType = (String) row.get("CIM_Main_TXT_MusicalInstrumentDealersPolicyType");
		String strCIM_Main_TXT_MusicalInstrumentDealersCoinsurance = (String) row.get("CIM_Main_TXT_MusicalInstrumentDealersCoinsurance");
		String strCIM_Main_TXT_MusicalInstrTotalLimAllLoc = (String) row.get("CIM_Main_TXT_MusicalInstrTotalLimAllLoc");
		String strCIM_Main_TXT_MusicalInstrumentDealersDedAmount = (String) row.get("CIM_Main_TXT_MusicalInstrumentDealersDedAmount");
		String strCIM_Main_CHK_MusicalInstrumentDealersSpecProv = (String) row.get("CIM_Main_CHK_MusicalInstrumentDealersSpecProv");
		String strCIM_Main_TXT_MusicalInsDealers_EnterSpecProvVerbiage = (String) row.get("CIM_Main_TXT_MusicalInsDealers_EnterSpecProvVerbiage");
		
		try{
			se.log().logTestStep("MuscialInstrumentDealers Coverage");
			test.log(LogStatus.INFO, "MuscialInstrumentDealers Coverage section","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMMainPage");
			if(!transaction.equalsIgnoreCase(constants.NA)){
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_MusicalInstrumentDealers(strCIM_Main_CHK_MusicalInstrumentDealers),strCIM_Main_CHK_MusicalInstrumentDealers,test);
			se.element().selectPopupWithMagnifier(getCIM_Main_TXT_MusicalInstrumentDealersPolicyType(strCIM_Main_TXT_MusicalInstrumentDealersPolicyType), getCIM_Main_TXT_MusicalInstrumentDealersPolicyTypeSearch(strCIM_Main_TXT_MusicalInstrumentDealersPolicyType), strCIM_Main_TXT_MusicalInstrumentDealersPolicyType,constants.NA, strCIM_Main_TXT_MusicalInstrumentDealersPolicyType,constants.NA, constants.NA,constants.NA, test);
			se.element().selectPopupWithMagnifier(getCIM_Main_TXT_MusicalInstrumentDealersCoinsurance(strCIM_Main_TXT_MusicalInstrumentDealersCoinsurance), getCIM_Main_BTN_MusicalInstrumentDealersCoinsuranceSearch(strCIM_Main_TXT_MusicalInstrumentDealersCoinsurance), strCIM_Main_TXT_MusicalInstrumentDealersCoinsurance,constants.NA, strCIM_Main_TXT_MusicalInstrumentDealersCoinsurance,constants.NA, constants.NA,constants.NA, test);
			se.element().enterOrValidateText(getCIM_Main_TXT_MusicalInstrTotalLimAllLoc(strCIM_Main_TXT_MusicalInstrTotalLimAllLoc),strCIM_Main_TXT_MusicalInstrTotalLimAllLoc,test);
			se.element().selectPopupWithMagnifier(getCIM_Main_TXT_MusicalInstrumentDealersDedAmount(strCIM_Main_TXT_MusicalInstrumentDealersDedAmount), getCIM_Main_BTN_MusicalInstrumentDealersDedAmountSearch(strCIM_Main_TXT_MusicalInstrumentDealersDedAmount), strCIM_Main_TXT_MusicalInstrumentDealersDedAmount,constants.NA, strCIM_Main_TXT_MusicalInstrumentDealersDedAmount,constants.NA, constants.NA,constants.NA, test);
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_MusicalInstrumentDealersSpecProv(strCIM_Main_CHK_MusicalInstrumentDealersSpecProv),strCIM_Main_CHK_MusicalInstrumentDealersSpecProv,test);
			se.element().enterOrValidateText(getCIM_Main_TXT_MusicalInsDealers_EnterSpecProvVerbiage(strCIM_Main_TXT_MusicalInsDealers_EnterSpecProvVerbiage),strCIM_Main_TXT_MusicalInsDealers_EnterSpecProvVerbiage,test);
			}
		}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for MuscialInstrumentDealers Coverage", true, false, true, test);		
			}
	}
			
	public void physiciansAndSurgeonsCoverage(Map<String, String> row, ExtentTest test) throws IOException {

		
		String transaction = (String) row.get("Transaction Name");
		String strCIM_Main_CHK_PhysiciansAndSurgeons = (String) row.get("CIM_Main_CHK_PhysiciansAndSurgeons");
		String strCIM_Main_TXT_PhyAndSurgTotalLimitAllLoc = (String) row.get("CIM_Main_TXT_PhyAndSurgTotalLimitAllLoc");
		String strCIM_Main_TXT_PhyAndSurgCoinsurance = (String) row.get("CIM_Main_TXT_PhyAndSurgCoinsurance");
		String strCIM_Main_TXT_PhyAndSurgDeducibleAmount = (String) row.get("CIM_Main_TXT_PhyAndSurgDeducibleAmount");
		String strCIM_Main_CHK_PhyAndSurgSpecialProvisions = (String) row.get("CIM_Main_CHK_PhyAndSurgSpecialProvisions");
		String strCIM_Main_TXT_PhyAndSurg_EnterSpecProvVerbiage = (String) row.get("CIM_Main_TXT_PhyAndSurg_EnterSpecProvVerbiage");
		
		try{
			se.log().logTestStep("PhysiciansAndSurgeons Coverage");
			test.log(LogStatus.INFO, "PhysiciansAndSurgeons Coverage section","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMMainPage");
			if(!strCIM_Main_CHK_PhysiciansAndSurgeons.equalsIgnoreCase(constants.NA)){
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_PhysiciansAndSurgeons(strCIM_Main_CHK_PhysiciansAndSurgeons),strCIM_Main_CHK_PhysiciansAndSurgeons,test);
			se.element().enterOrValidateText(getCIM_Main_TXT_PhyAndSurgTotalLimitAllLoc(strCIM_Main_TXT_PhyAndSurgTotalLimitAllLoc),strCIM_Main_TXT_PhyAndSurgTotalLimitAllLoc,test);
			se.element().selectPopupWithMagnifier(getCIM_Main_TXT_PhyAndSurgCoinsurance(strCIM_Main_TXT_PhyAndSurgCoinsurance), getCIM_Main_BTN_PhyAndSurgCoinsuranceSearch(strCIM_Main_TXT_PhyAndSurgCoinsurance), strCIM_Main_TXT_PhyAndSurgCoinsurance,constants.NA, strCIM_Main_TXT_PhyAndSurgCoinsurance,constants.NA, constants.NA,constants.NA, test);
			se.element().selectPopupWithMagnifier(getCIM_Main_TXT_PhyAndSurgDeducibleAmount(strCIM_Main_TXT_PhyAndSurgDeducibleAmount), getCIM_Main_BTN_PhyAndSurgDeducibleAmountSearch(strCIM_Main_TXT_PhyAndSurgDeducibleAmount), strCIM_Main_TXT_PhyAndSurgDeducibleAmount,constants.NA, strCIM_Main_TXT_PhyAndSurgDeducibleAmount,constants.NA, constants.NA,constants.NA, test);
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_PhyAndSurgSpecialProvisions(strCIM_Main_CHK_PhyAndSurgSpecialProvisions),strCIM_Main_CHK_PhyAndSurgSpecialProvisions,test);
			se.element().enterOrValidateText(getCIM_Main_TXT_PhyAndSurg_EnterSpecProvVerbiage(strCIM_Main_TXT_PhyAndSurg_EnterSpecProvVerbiage),strCIM_Main_TXT_PhyAndSurg_EnterSpecProvVerbiage,test);
		}
		}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for physiciansAndSurgeons Coverage", true, false, true, test);		
			}
	}
		
	public void scheduledPropertyFloaterCoverage(Map<String, String> row, ExtentTest test) throws IOException {

		
		String transaction = (String) row.get("Transaction Name");
		String strCIM_Main_CHK_ScheduledPropertyFloater = (String) row.get("CIM_Main_CHK_ScheduledPropertyFloater");
		String strCIM_Main_TXT_SchPropFloaterDedAmount = (String) row.get("CIM_Main_TXT_SchPropFloaterDedAmount");
		String strCIM_Main_TXT_SchPropFloaterCoinsurance = (String) row.get("CIM_Main_TXT_SchPropFloaterCoinsurance");
		String strCIM_Main_CHK_SchPropFloater_ActualCashValue = (String) row.get("CIM_Main_CHK_SchPropFloater_ActualCashValue");
		String strCIM_Main_CHK_SchPropFloater_ReplacementCost = (String) row.get("CIM_Main_CHK_SchPropFloater_ReplacementCost");
		
		try{
			se.log().logTestStep("Primary Coverage");
			test.log(LogStatus.INFO, "Primary Coverage section","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMMainPage");
			if(!strCIM_Main_CHK_ScheduledPropertyFloater.equalsIgnoreCase(constants.NA)){	
				se.util().sleep(1000);
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_ScheduledPropertyFloater(strCIM_Main_CHK_ScheduledPropertyFloater),strCIM_Main_CHK_ScheduledPropertyFloater,test);
			se.element().selectPopupWithMagnifier(getCIM_Main_TXT_SchPropFloaterDedAmount(strCIM_Main_TXT_SchPropFloaterDedAmount), getCIM_Main_BTN_SchPropFloaterDedAmountSearch(strCIM_Main_TXT_SchPropFloaterDedAmount), strCIM_Main_TXT_SchPropFloaterDedAmount,constants.NA, strCIM_Main_TXT_SchPropFloaterDedAmount,constants.NA, constants.NA,constants.NA, test);
			se.element().selectPopupWithMagnifier(getCIM_Main_TXT_SchPropFloaterCoinsurance(strCIM_Main_TXT_SchPropFloaterCoinsurance), getCIM_Main_TXT_SchPropFloaterCoinsuranceSearch(strCIM_Main_TXT_SchPropFloaterCoinsurance), strCIM_Main_TXT_SchPropFloaterCoinsurance,constants.NA, strCIM_Main_TXT_SchPropFloaterCoinsurance,constants.NA, constants.NA,constants.NA, test);
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_SchPropFloater_ActualCashValue(strCIM_Main_CHK_SchPropFloater_ActualCashValue),strCIM_Main_CHK_SchPropFloater_ActualCashValue,test);
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_SchPropFloater_ReplacementCost(strCIM_Main_CHK_SchPropFloater_ReplacementCost),strCIM_Main_CHK_SchPropFloater_ReplacementCost,test);
			}
		}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for Primary Coverage", true, false, true, test);		
			}
	}
		
	public void signsCoverage(Map<String, String> row, ExtentTest test) throws IOException {

		
		String transaction = (String) row.get("Transaction Name");
		String strCIM_Main_CHK_Signs = (String) row.get("CIM_Main_CHK_Signs");
		String strCIM_Main_TXT_SignCoinsurance = (String) row.get("CIM_Main_TXT_SignCoinsurance");
		String strCIM_Main_CHK_SignsSpecialProvisions = (String) row.get("CIM_Main_CHK_SignsSpecialProvisions");
		String strCIM_Main_TXT_Signs_EnterSpecProvVerbiage = (String) row.get("CIM_Main_TXT_Signs_EnterSpecProvVerbiage");
		String strCIM_Main_CHK_AdditionalSpecialProv = (String) row.get("CIM_Main_CHK_AdditionalSpecialProv");
		String strCIM_Main_TXT_Signs_EnterAdditionalSpecProvVerbiage = (String) row.get("CIM_Main_TXT_Signs_EnterAdditionalSpecProvVerbiage");
		
		try{
			se.log().logTestStep("Signs Coverage");
			test.log(LogStatus.INFO, "Signs Coverage section","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMMainPage");
			if(!transaction.equalsIgnoreCase(constants.NA)){
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_Signs(strCIM_Main_CHK_Signs),strCIM_Main_CHK_Signs,test);
			se.element().selectPopupWithMagnifier(getCIM_Main_TXT_SignCoinsurance(strCIM_Main_TXT_SignCoinsurance), getCIM_Main_BTN_SignCoinsuranceSearch(strCIM_Main_TXT_SignCoinsurance), strCIM_Main_TXT_SignCoinsurance,constants.NA, strCIM_Main_TXT_SignCoinsurance,constants.NA, constants.NA,constants.NA, test);
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_SignsSpecialProvisions(strCIM_Main_CHK_SignsSpecialProvisions),strCIM_Main_CHK_SignsSpecialProvisions,test);
			se.element().enterOrValidateText(getCIM_Main_TXT_Signs_EnterSpecProvVerbiage(strCIM_Main_TXT_Signs_EnterSpecProvVerbiage),strCIM_Main_TXT_Signs_EnterSpecProvVerbiage,test);
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_AdditionalSpecialProv(strCIM_Main_CHK_AdditionalSpecialProv),strCIM_Main_CHK_AdditionalSpecialProv,test);
			se.element().enterOrValidateText(getCIM_Main_TXT_Signs_EnterAdditionalSpecProvVerbiage(strCIM_Main_TXT_Signs_EnterAdditionalSpecProvVerbiage),strCIM_Main_TXT_Signs_EnterAdditionalSpecProvVerbiage,test);
			}
		}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for Signs Coverage", true, false, true, test);		
			}
	}
	
	public void transportationCoverage(Map<String, String> row, ExtentTest test) throws IOException {

		
		String transaction = (String) row.get("Transaction Name");
		String strCIM_Main_CHK_Transportation = (String) row.get("CIM_Main_CHK_Transportation");
		String strCIM_Main_CHK_CargoCoverage = (String) row.get("CIM_Main_CHK_CargoCoverage");
		String strCIM_Main_TXT_CargoDedAmount = (String) row.get("CIM_Main_TXT_CargoDedAmount");
		String strCIM_Main_CHK_CargoTerminalAppliesYes = (String) row.get("CIM_Main_CHK_CargoTerminalAppliesYes");
		String strCIM_Main_CHK_CargoTerminalAppliesNo = (String) row.get("CIM_Main_CHK_CargoTerminalAppliesNo");
		String strCIM_Main_CHK_CargoCovg_ActualCashValue = (String) row.get("CIM_Main_CHK_CargoCovg_ActualCashValue");
		String strCIM_Main_CHK_CargoCovg_ReplacementCost = (String) row.get("CIM_Main_CHK_CargoCovg_ReplacementCost");
		String strCIM_Main_CHK_MotorTruckCargoCoverage = (String) row.get("CIM_Main_CHK_MotorTruckCargoCoverage");
		String strCIM_Main_TXT_MotorTruckCargoDedAmount = (String) row.get("CIM_Main_TXT_MotorTruckCargoDedAmount");
		String strCIM_Main_CHK_MotorTruckCargoTermAppliesYes = (String) row.get("CIM_Main_CHK_MotorTruckCargoTermAppliesYes");
		String strCIM_Main_CHK_MotorTruckCargoTermAppliesNo = (String) row.get("CIM_Main_CHK_MotorTruckCargoTermAppliesNo");
		String strCIM_Main_CHK_MotorTruckCargoCovg_ReportingBasis = (String) row.get("CIM_Main_CHK_MotorTruckCargoCovg_ReportingBasis");
		String strCIM_Main_CHK_MotorTruckCargoCovg_NonreportingBasis = (String) row.get("CIM_Main_CHK_MotorTruckCargoCovg_NonreportingBasis");
		String strCIM_Main_CHK_TransitFloaterCoverage = (String) row.get("CIM_Main_CHK_TransitFloaterCoverage");
		String strCIM_Main_TXT_TransitFloaterDedAmount = (String) row.get("CIM_Main_TXT_TransitFloaterDedAmount");
		String strCIM_Main_CHK_TransitFloaterTermAppliesYes = (String) row.get("CIM_Main_CHK_TransitFloaterTermAppliesYes");
		String strCIM_Main_CHK_TransitFloaterTermAppliesNo = (String) row.get("CIM_Main_CHK_TransitFloaterTermAppliesNo");
		
		try{
			se.log().logTestStep("Transportation Coverage");
			test.log(LogStatus.INFO, "Transportation Coverage section","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMMainPage");
			if(!strCIM_Main_CHK_Transportation.equalsIgnoreCase(constants.NA)){
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_Transportation(strCIM_Main_CHK_Transportation),strCIM_Main_CHK_Transportation,test);
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_CargoCoverage(strCIM_Main_CHK_CargoCoverage),strCIM_Main_CHK_CargoCoverage,test);
			se.element().selectPopupWithMagnifier(getCIM_Main_TXT_CargoDedAmount(strCIM_Main_TXT_CargoDedAmount), getCIM_Main_BTN_CargoDedAmountSearch(strCIM_Main_TXT_CargoDedAmount), strCIM_Main_TXT_CargoDedAmount,constants.NA, strCIM_Main_TXT_CargoDedAmount,constants.NA, constants.NA,constants.NA, test);
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_CargoTerminalAppliesYes(strCIM_Main_CHK_CargoTerminalAppliesYes),strCIM_Main_CHK_CargoTerminalAppliesYes,test);
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_CargoTerminalAppliesNo(strCIM_Main_CHK_CargoTerminalAppliesNo),strCIM_Main_CHK_CargoTerminalAppliesNo,test);
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_CargoCovg_ActualCashValue(strCIM_Main_CHK_CargoCovg_ActualCashValue),strCIM_Main_CHK_CargoCovg_ActualCashValue,test);
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_CargoCovg_ReplacementCost(strCIM_Main_CHK_CargoCovg_ReplacementCost),strCIM_Main_CHK_CargoCovg_ReplacementCost,test);
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_MotorTruckCargoCoverage(strCIM_Main_CHK_MotorTruckCargoCoverage),strCIM_Main_CHK_MotorTruckCargoCoverage,test);
			se.element().selectPopupWithMagnifier(getCIM_Main_TXT_MotorTruckCargoDedAmount(strCIM_Main_TXT_MotorTruckCargoDedAmount), getCIM_Main_BTN_MotorTruckCargoDedAmountSearch(strCIM_Main_TXT_MotorTruckCargoDedAmount), strCIM_Main_TXT_MotorTruckCargoDedAmount,constants.NA, strCIM_Main_TXT_MotorTruckCargoDedAmount,constants.NA, constants.NA,constants.NA, test);
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_MotorTruckCargoTermAppliesYes(strCIM_Main_CHK_MotorTruckCargoTermAppliesYes),strCIM_Main_CHK_MotorTruckCargoTermAppliesYes,test);
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_MotorTruckCargoTermAppliesNo(strCIM_Main_CHK_MotorTruckCargoTermAppliesNo),strCIM_Main_CHK_MotorTruckCargoTermAppliesNo,test);
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_MotorTruckCargoCovg_ReportingBasis(strCIM_Main_CHK_MotorTruckCargoCovg_ReportingBasis),strCIM_Main_CHK_MotorTruckCargoCovg_ReportingBasis,test);
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_MotorTruckCargoCovg_NonreportingBasis(strCIM_Main_CHK_MotorTruckCargoCovg_NonreportingBasis),strCIM_Main_CHK_MotorTruckCargoCovg_NonreportingBasis,test);
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_TransitFloaterCoverage(strCIM_Main_CHK_TransitFloaterCoverage),strCIM_Main_CHK_TransitFloaterCoverage,test);
			se.element().selectPopupWithMagnifier(getCIM_Main_TXT_TransitFloaterDedAmount(strCIM_Main_TXT_TransitFloaterDedAmount), getCIM_Main_BTN_TransitFloaterDedAmountSearch(strCIM_Main_TXT_TransitFloaterDedAmount), strCIM_Main_TXT_TransitFloaterDedAmount,constants.NA, strCIM_Main_TXT_TransitFloaterDedAmount,constants.NA, constants.NA,constants.NA, test);
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_TransitFloaterTermAppliesYes(strCIM_Main_CHK_TransitFloaterTermAppliesYes),strCIM_Main_CHK_TransitFloaterTermAppliesYes,test);
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_TransitFloaterTermAppliesNo(strCIM_Main_CHK_TransitFloaterTermAppliesNo),strCIM_Main_CHK_TransitFloaterTermAppliesNo,test);
			}
		}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for Transportation Coverage", true, false, true, test);		
			}
	}
	
	public void valuablePapersCoverage(Map<String, String> row, ExtentTest test) throws IOException {

		
		String transaction = (String) row.get("Transaction Name");
		String strCIM_Main_CHK_ValuablePapers = (String) row.get("CIM_Main_CHK_ValuablePapers");
		String strCIM_Main_TXT_ValuablePapersPolicyType = (String) row.get("CIM_Main_TXT_ValuablePapersPolicyType");
		String strCIM_Main_CHK_IncreasedValuablePapersAwayFromPremCov = (String) row.get("CIM_Main_CHK_IncreasedValuablePapersAwayFromPremCov");
		String strCIM_Main_TXT_ValuablePapersLimitAllLoc = (String) row.get("CIM_Main_TXT_ValuablePapersLimitAllLoc");
		String strCIM_Main_TXT_ValuablePapersDedAmount = (String) row.get("CIM_Main_TXT_ValuablePapersDedAmount");
		String strCIM_Main_CHK_ValuablePapersSpecialProvisions = (String) row.get("CIM_Main_CHK_ValuablePapersSpecialProvisions");
		String strCIM_Main_TXT_ValuablePapers_EnterSpecProvVerbiage = (String) row.get("CIM_Main_TXT_ValuablePapers_EnterSpecProvVerbiage");
		String strCIM_Main_CHK_SecuraManuscript = (String) row.get("CIM_Main_CHK_SecuraManuscript");
		String strCIM_Main_TXT_ValuablePapersAwayFromPremiseLimit = (String) row.get("CIM_Main_TXT_ValuablePapersAwayFromPremiseLimit");
		String strCIM_Main_TXT_PackageModFactor = (String) row.get("CIM_Main_TXT_PackageModFactor");
		
		try{
			se.log().logTestStep("Valuable Papers Coverage");
			test.log(LogStatus.INFO, "Valuable Papers Coverage section","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMMainPage");
			if(!strCIM_Main_CHK_ValuablePapers.equalsIgnoreCase(constants.NA)){
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_ValuablePapers(strCIM_Main_CHK_ValuablePapers),strCIM_Main_CHK_ValuablePapers,test);
			se.element().enterOrValidateText(getCIM_Main_TXT_ValuablePapersPolicyType(strCIM_Main_TXT_ValuablePapersPolicyType),strCIM_Main_TXT_ValuablePapersPolicyType,test);
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_IncreasedValuablePapersAwayFromPremCov(strCIM_Main_CHK_IncreasedValuablePapersAwayFromPremCov),strCIM_Main_CHK_IncreasedValuablePapersAwayFromPremCov,test);
			if(se.element().isElementPresent(CIM_Main_BTN_OKButton)){
				se.element().waitForElementIsDisplayed(CIM_Main_BTN_OKButton, 60);
				se.element().clickElement(getCIM_Main_BTN_OKButton(),test);
			}
			
			//se.element().enterOrValidateText(getCIM_Main_TXT_VP_PackageModFactor(strCIM_Main_TXT_PackageModFactor),strCIM_Main_TXT_PackageModFactor,test);
			se.element().enterOrValidateText(getCIM_Main_TXT_ValuablePapersLimitAllLoc(strCIM_Main_TXT_ValuablePapersLimitAllLoc),strCIM_Main_TXT_ValuablePapersLimitAllLoc,test);
			se.element().selectPopupWithMagnifier(getCIM_Main_TXT_ValuablePapersDedAmount(strCIM_Main_TXT_ValuablePapersDedAmount), getCIM_Main_BTN_ValuablePapersDedAmountSearch(strCIM_Main_TXT_ValuablePapersDedAmount), strCIM_Main_TXT_ValuablePapersDedAmount,constants.NA, strCIM_Main_TXT_ValuablePapersDedAmount,constants.NA, constants.NA,constants.NA, test);
			
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_ValuablePapersSpecialProvisions(strCIM_Main_CHK_ValuablePapersSpecialProvisions),strCIM_Main_CHK_ValuablePapersSpecialProvisions,test);
			se.element().enterOrValidateText(getCIM_Main_TXT_ValuablePapers_EnterSpecProvVerbiage(strCIM_Main_TXT_ValuablePapers_EnterSpecProvVerbiage),strCIM_Main_TXT_ValuablePapers_EnterSpecProvVerbiage,test);
			se.element().enterOrValidateText(getCIM_Main_TXT_VP_AwayFromPremiseLimit(strCIM_Main_TXT_ValuablePapersAwayFromPremiseLimit),strCIM_Main_TXT_ValuablePapersAwayFromPremiseLimit,test);
			}
			se.element().checkUncheckOrValidate(getCIM_Main_CHK_SecuraManuscript(strCIM_Main_CHK_SecuraManuscript),strCIM_Main_CHK_SecuraManuscript,test);
		}

		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for Valuable Papers Coverage", true, false, true, test);		
			}
	}
	
	public void companyRatingPlans(Map<String, String> row, ExtentTest test) throws IOException {

		
		String transaction = (String) row.get("Transaction Name");
		String strCIM_Main_TXT_TransitionFtr = (String) row.get("CIM_Main_TXT_TransitionFtr");
		String strCIM_Main_TXT_MiscellaneousFtr = (String) row.get("CIM_Main_TXT_MiscellaneousFtr");
		
		try{
			se.log().logTestStep("Company Rating Coverage");
			test.log(LogStatus.INFO, "Company Rating Coverage section","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMMainPage");
			se.element().enterOrValidateText(getCIM_Main_TXT_TransitionFtr(strCIM_Main_TXT_TransitionFtr),strCIM_Main_TXT_TransitionFtr,test);
			se.element().enterOrValidateText(getCIM_Main_TXT_MiscellaneousFtr(strCIM_Main_TXT_MiscellaneousFtr),strCIM_Main_TXT_MiscellaneousFtr,test);
		}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for Company Rating Coverage", true, false, true, test);		
			}
	}


}
