package pw.pages.GL;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import pw.Constants.constants;
import pw.OR.OR_GL;

public class GL_LiquorLiability_Classifications extends OR_GL{
	
	
	public void GL_LiquorLiability_ClassificationsPage(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase(constants.GL_LiquorLiability_Classifications)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.GL_LiquorLiability_Classifications, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		try {
			GL_LiquorLiability_Classifications GL_LiquorLiability_ClassificationsPage = TestPageFactory.initElements(se,GL_LiquorLiability_Classifications.class);
			GL_LiquorLiability_ClassificationsPage.liquorLiabilityClassificationsDetails(row, test);
			//GL_LiquorLiability_ClassificationsPage.liquorLiabilityClassRatingDetails(row, test);
			navigateToNextScreen(row, test);
			
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for  page ", true, false,true, test);
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
	public void liquorLiabilityClassificationsDetails(Map<String, String> row, ExtentTest test) throws IOException {
		
		String strGL_LiquorLiability_Classifications_BTN_AddButton = (String) row.get("GL_LiquorLiability_Classifications_BTN_AddButton");
		String strGL_LiquorLiability_Classifications_BTN_Details = (String) row.get("GL_LiquorLiability_Classifications_BTN_Details");
		String strGL_LiquorLiability_Classifications_CHK_OverrideLossCostELPNo = (String) row.get("GL_LiquorLiability_Classifications_CHK_OverrideLossCostELPNo");
		String strGL_LiquorLiability_Classifications_TXT_LocationNo = (String) row.get("GL_LiquorLiability_Classifications_TXT_LocationNo");
		String strGL_LiquorLiability_Classifications_TXT_Name = (String) row.get("GL_LiquorLiability_Classifications_TXT_Name");
		String strGL_LiquorLiability_Classifications_TXT_Description = (String) row.get("GL_LiquorLiability_Classifications_TXT_Description");
		String strGL_LiquorLiability_Classifications_TXT_Street = (String) row.get("GL_LiquorLiability_Classifications_TXT_Street");
		String strGL_LiquorLiability_Classifications_TXT_SteUnit = (String) row.get("GL_LiquorLiability_Classifications_TXT_Ste/Unit");
		String strGL_LiquorLiability_Classifications_TXT_City = (String) row.get("GL_LiquorLiability_Classifications_TXT_City");
		String strGL_LiquorLiability_Classifications_TXT_State = (String) row.get("GL_LiquorLiability_Classifications_TXT_State");
		String strGL_LiquorLiability_Classifications_TXT_Zip = (String) row.get("GL_LiquorLiability_Classifications_TXT_Zip");
		
		String strGL_LiquorLiability_Classifications_TXT_PolicyType = (String) row.get("GL_LiquorLiability_Classifications_TXT_PolicyType");
		String strGL_LiquorLiability_Classifications_TXT_LiqLicenseName = (String) row.get("GL_LiquorLiability_Classifications_TXT_LiqLicenseName");
		String strGL_LiquorLiability_Classifications_TXT_LiqLicenseAddress = (String) row.get("GL_LiquorLiability_Classifications_TXT_LiqLicenseAddress");
		String strGL_LiquorLiability_Classifications_TXT_ClassCode = (String) row.get("GL_LiquorLiability_Classifications_TXT_ClassCode");
		String strGL_LiquorLiability_Classifications_CHK_Auditable = (String) row.get("GL_LiquorLiability_Classifications_CHK_Auditable");
		String strGL_LiquorLiability_Classifications_TXT_ClassDescription = (String) row.get("GL_LiquorLiability_Classifications_TXT_ClassDescription");
		String strGL_LiquorLiability_Classifications_CHK_IfAnyStatusAppliesYes = (String) row.get("GL_LiquorLiability_Classifications_CHK_IfAnyStatusAppliesYes");
		String strGL_LiquorLiability_Classifications_CHK_IfAnyStatusAppliesNo = (String) row.get("GL_LiquorLiability_Classifications_CHK_IfAnyStatusAppliesNo");
		String strGL_LiquorLiability_Classifications_TXT_IncLimitTableAssignment = (String) row.get("GL_LiquorLiability_Classifications_TXT_IncLimitTableAssignment");
		String strGL_LiquorLiability_Classifications_TXT_ExposureBasis = (String) row.get("GL_LiquorLiability_Classifications_TXT_ExposureBasis");
		String strGL_LiquorLiability_Classifications_TXT_EstimatedExposure = (String) row.get("GL_LiquorLiability_Classifications_TXT_EstimatedExposure");
		String strGL_LiquorLiability_Classifications_CHK_OverrideLossCostELPYes = (String) row.get("GL_LiquorLiability_Classifications_CHK_OverrideLossCostELPYes");
		String strGL_LiquorLiability_Classifications_CHK_OverrideReason = (String) row.get("GL_LiquorLiability_Classifications_CHK_OverrideReason");
		String transaction = (String) row.get("Transaction");
		try{
			se.log().logTestStep("liquor Liability Classifications Details");
			test.log(LogStatus.INFO, "liquorLiabilityClassificationsDetails section","Transaction Step : "+transaction + "<br>" +"Page : GL_LiquorLiability_Classifications");
			se.verify().verifyEquals("liquor Liability Classifications Details of GL_LiquorLiability_Classifications",getPagecontainingtext("Classifications").isDisplayed(),true, true,test);
			
			if((strGL_LiquorLiability_Classifications_BTN_Details.equalsIgnoreCase("Yes"))){
				se.element().clickElement(getGL_LiquorLiability_Classifications_BTN_Details(),test);
				se.verify().verifyEquals("GL_Classification details is displayed ", getcommon_BTN_SaveAndResume().isDisplayed(),true, true,test);
			}
			if(!strGL_LiquorLiability_Classifications_BTN_AddButton.equals("N/A")){
				se.element().clickElement(getGL_LiquorLiability_Classifications_BTN_Add(),test);
			}
			se.util().sleep(3000);
			se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_LocationNo(strGL_LiquorLiability_Classifications_TXT_LocationNo),strGL_LiquorLiability_Classifications_TXT_LocationNo,test);
			se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_Name(strGL_LiquorLiability_Classifications_TXT_Name),strGL_LiquorLiability_Classifications_TXT_Name,test);
			se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_Description(strGL_LiquorLiability_Classifications_TXT_Description),strGL_LiquorLiability_Classifications_TXT_Description,test);
			se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_Street(strGL_LiquorLiability_Classifications_TXT_Street),strGL_LiquorLiability_Classifications_TXT_Street,test);
			se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_SteUnit(strGL_LiquorLiability_Classifications_TXT_SteUnit),strGL_LiquorLiability_Classifications_TXT_SteUnit,test);
			se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_City(strGL_LiquorLiability_Classifications_TXT_City),strGL_LiquorLiability_Classifications_TXT_City,test);
			se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_State(strGL_LiquorLiability_Classifications_TXT_State),strGL_LiquorLiability_Classifications_TXT_State,test);
			se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_Zip(strGL_LiquorLiability_Classifications_TXT_Zip),strGL_LiquorLiability_Classifications_TXT_Zip,test);
			if(strGL_LiquorLiability_Classifications_TXT_State.contains("Kentucky")){
				kyTaxInfo(row, test);
			}
			se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_PolicyType(strGL_LiquorLiability_Classifications_TXT_PolicyType),strGL_LiquorLiability_Classifications_TXT_PolicyType,test);
			se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_LiqLicenseName(strGL_LiquorLiability_Classifications_TXT_LiqLicenseName),strGL_LiquorLiability_Classifications_TXT_LiqLicenseName,test);
			se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_LiqLicenseAddress(strGL_LiquorLiability_Classifications_TXT_LiqLicenseAddress),strGL_LiquorLiability_Classifications_TXT_LiqLicenseAddress,test);
			
			//se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_ClassCode(strGL_LiquorLiability_Classifications_TXT_ClassCode),strGL_LiquorLiability_Classifications_TXT_ClassCode,test);
			se.element().selectClasscode(getGL_LiquorLiability_Classifications_TXT_ClassCode(strGL_LiquorLiability_Classifications_TXT_ClassCode), constants.NA, strGL_LiquorLiability_Classifications_TXT_ClassCode, constants.NA, constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(getGL_LiquorLiability_Classifications_CHK_Auditable(strGL_LiquorLiability_Classifications_CHK_Auditable),strGL_LiquorLiability_Classifications_CHK_Auditable,test);
			se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_ClassDescription(strGL_LiquorLiability_Classifications_TXT_ClassDescription),strGL_LiquorLiability_Classifications_TXT_ClassDescription,test);
			se.element().checkUncheckOrValidate(getGL_LiquorLiability_Classifications_CHK_IfAnyStatusAppliesYes(strGL_LiquorLiability_Classifications_CHK_IfAnyStatusAppliesYes),strGL_LiquorLiability_Classifications_CHK_IfAnyStatusAppliesYes,test);
			se.element().checkUncheckOrValidate(getGL_LiquorLiability_Classifications_CHK_IfAnyStatusAppliesNo(strGL_LiquorLiability_Classifications_CHK_IfAnyStatusAppliesNo),strGL_LiquorLiability_Classifications_CHK_IfAnyStatusAppliesNo,test);
			se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_IncLimitTableAssignment(strGL_LiquorLiability_Classifications_TXT_IncLimitTableAssignment),strGL_LiquorLiability_Classifications_TXT_IncLimitTableAssignment,test);
			se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_ExposureBasis(strGL_LiquorLiability_Classifications_TXT_ExposureBasis),strGL_LiquorLiability_Classifications_TXT_ExposureBasis,test);
			se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_EstimatedExposure(strGL_LiquorLiability_Classifications_TXT_EstimatedExposure),strGL_LiquorLiability_Classifications_TXT_EstimatedExposure,test);
			se.element().checkUncheckOrValidate(getGL_LiquorLiability_Classifications_CHK_OverrideLossCostELPYes(strGL_LiquorLiability_Classifications_CHK_OverrideLossCostELPYes),strGL_LiquorLiability_Classifications_CHK_OverrideLossCostELPYes,test);
			//se.element().checkUncheckOrValidate(getGL_LiquorLiability_Classifications_CHK_OverrideReason(strGL_LiquorLiability_Classifications_CHK_OverrideReason),strGL_LiquorLiability_Classifications_CHK_OverrideReason,test);
			se.element().selectPopupWithMagnifier(getGL_LiquorLiability_Classifications_CHK_OverrideReason(strGL_LiquorLiability_Classifications_CHK_OverrideReason), getGL_LiquorLiability_Classifications_CHK_OverrideReasonSearch(strGL_LiquorLiability_Classifications_CHK_OverrideReason), strGL_LiquorLiability_Classifications_CHK_OverrideReason, constants.NA, strGL_LiquorLiability_Classifications_CHK_OverrideReason, constants.NA, constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(getGL_LiquorLiability_Classifications_CHK_OverrideLossCostELPNo(strGL_LiquorLiability_Classifications_CHK_OverrideLossCostELPNo),strGL_LiquorLiability_Classifications_CHK_OverrideLossCostELPNo,test);
		}
		catch(Exception e) {
			se.verify().verifyEquals("Failed to fill in details for GL_LiquorLiability_Classifications ", true, false,true, test);		
			}
	}
	
	public void liquorLiabilityClassRatingDetails(Map<String, String> row,ExtentTest test) throws IOException {

				String strGL_LiquorLiability_Classifications_TXT_Territory = (String) row.get("GL_LiquorLiability_Classifications_TXT_Territory");
				String strGL_LiquorLiability_Classifications_TXT_LossCost = (String) row.get("GL_LiquorLiability_Classifications_TXT_LossCost");
				String strGL_LiquorLiability_Classifications_TXT_LossCostELPOverride = (String) row.get("GL_LiquorLiability_Classifications_TXT_LossCostELPOverride");
				String strGL_LiquorLiability_Classifications_TXT_LossCostMultiplier = (String) row.get("GL_LiquorLiability_Classifications_TXT_LossCostMultiplier");
				String strGL_LiquorLiability_Classifications_TXT_BaseLimitsRate = (String) row.get("GL_LiquorLiability_Classifications_TXT_BaseLimitsRate");
				String strGL_LiquorLiability_Classifications_TXT_IncLimitsLessDedFactor = (String) row.get("GL_LiquorLiability_Classifications_TXT_IncLimitsLessDedFactor");
				String strGL_LiquorLiability_Classifications_TXT_PKGModFtr = (String) row.get("GL_LiquorLiability_Classifications_TXT_PKGModFtr");
				String strGL_LiquorLiability_Classifications_TXT_TransitionFtr = (String) row.get("GL_LiquorLiability_Classifications_TXT_TransitionFtr");
				String strGL_LiquorLiability_Classifications_TXT_MiscellaneousFtr = (String) row.get("GL_LiquorLiability_Classifications_TXT_MiscellaneousFtr");
				String strGL_LiquorLiability_Classifications_TXT_AssociationGroupFtr = (String) row.get("GL_LiquorLiability_Classifications_TXT_AssociationGroupFtr");
				String strGL_LiquorLiability_Classifications_TXT_RenewalRewardsFtr = (String) row.get("GL_LiquorLiability_Classifications_TXT_RenewalRewardsFtr");
				String strGL_LiquorLiability_Classifications_TXT_AccountCreditFtr = (String) row.get("GL_LiquorLiability_Classifications_TXT_AccountCreditFtr");
				String strGL_LiquorLiability_Classifications_TXT_AdjBaseRate = (String) row.get("GL_LiquorLiability_Classifications_TXT_AdjBaseRate");
				String strGL_LiquorLiability_Classifications_TXT_TransactionPremium = (String) row.get("GL_LiquorLiability_Classifications_TXT_TransactionPremium");
				String strGL_LiquorLiability_Classifications_BTN_DoneButton = (String) row.get("GL_LiquorLiability_Classifications_BTN_DoneButton");
				String transaction = (String) row.get("Transaction");
		try{
				se.log().logTestStep("liquor Liability Class Rating Details");
				test.log(LogStatus.INFO, "liquor Liability Class Rating Details section","Transaction Step : "+transaction + "<br>" +"Page : GL_LiquorLiability_Classifications");
				se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_Territory(strGL_LiquorLiability_Classifications_TXT_Territory),strGL_LiquorLiability_Classifications_TXT_Territory,test);
				se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_LossCost(strGL_LiquorLiability_Classifications_TXT_LossCost),strGL_LiquorLiability_Classifications_TXT_LossCost,test);
				se.element().enterOrValidateText(getstrGL_LiquorLiability_Classifications_TXT_LossCostELPOverride(strGL_LiquorLiability_Classifications_TXT_LossCostELPOverride),strGL_LiquorLiability_Classifications_TXT_LossCostELPOverride,test);
				se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_LossCostMultiplier(strGL_LiquorLiability_Classifications_TXT_LossCostMultiplier),strGL_LiquorLiability_Classifications_TXT_LossCostMultiplier,test);
				se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_BaseLimitsRate(strGL_LiquorLiability_Classifications_TXT_BaseLimitsRate),strGL_LiquorLiability_Classifications_TXT_BaseLimitsRate,test);
				se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_IncLimitsLessDedFactor(strGL_LiquorLiability_Classifications_TXT_IncLimitsLessDedFactor),strGL_LiquorLiability_Classifications_TXT_IncLimitsLessDedFactor,test);
				se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_PKGModFtr(strGL_LiquorLiability_Classifications_TXT_PKGModFtr),strGL_LiquorLiability_Classifications_TXT_PKGModFtr,test);
				se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_TransitionFtr(strGL_LiquorLiability_Classifications_TXT_TransitionFtr),strGL_LiquorLiability_Classifications_TXT_TransitionFtr,test);
				se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_MiscellaneousFtr(strGL_LiquorLiability_Classifications_TXT_MiscellaneousFtr),strGL_LiquorLiability_Classifications_TXT_MiscellaneousFtr,test);
				se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_AssociationGroupFtr(strGL_LiquorLiability_Classifications_TXT_AssociationGroupFtr),strGL_LiquorLiability_Classifications_TXT_AssociationGroupFtr,test);
				se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_RenewalRewardsFtr(strGL_LiquorLiability_Classifications_TXT_RenewalRewardsFtr),strGL_LiquorLiability_Classifications_TXT_RenewalRewardsFtr,test);
				se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_AccountCreditFtr(strGL_LiquorLiability_Classifications_TXT_AccountCreditFtr),strGL_LiquorLiability_Classifications_TXT_AccountCreditFtr,test);
				se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_AdjBaseRate(strGL_LiquorLiability_Classifications_TXT_AdjBaseRate),strGL_LiquorLiability_Classifications_TXT_AdjBaseRate,test);
				se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_TransactionPremium(strGL_LiquorLiability_Classifications_TXT_TransactionPremium),strGL_LiquorLiability_Classifications_TXT_TransactionPremium,test);
				se.element().clickElement(getNext(),test);
				if(!strGL_LiquorLiability_Classifications_BTN_DoneButton.equals("N/A")){
				se.element().clickElement(getDone(),test);
				}
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in liquor Liability Class Rating Details for GL_LiquorLiability_Classifications ", true, false, true, test);
							
			}
		}
	
	public void kyTaxInfo(Map<String, String> row, ExtentTest test) throws IOException {
		
		String strGL_LiquorLiability_Classifications_CHK_DoNotApplyCityOrCountyTax = (String) row.get("GL_LiquorLiability_Classifications_CHK_DoNotApplyCityOrCountyTax");
		String strGL_LiquorLiability_Classifications_CHK_AllCityName = (String) row.get("GL_LiquorLiability_Classifications_CHK_AllCityName");
		String strGL_LiquorLiability_Classifications_TXT_CityKYTax = (String) row.get("GL_LiquorLiability_Classifications_TXT_CityKYTax");
		String strGL_LiquorLiability_Classifications_TXT_CItyCode = (String) row.get("GL_LiquorLiability_Classifications_TXT_CItyCode");
		String strGL_LiquorLiability_Classifications_TXT_County = (String) row.get("GL_LiquorLiability_Classifications_TXT_County");
		String strGL_LiquorLiability_Classifications_TXT_CountyCode = (String) row.get("GL_LiquorLiability_Classifications_TXT_CountyCode");
		String strGL_LiquorLiability_Classifications_TXT_TaxCode = (String) row.get("GL_LiquorLiability_Classifications_TXT_TaxCode");
		
		String transaction = (String) row.get("Transaction Name");
		try{
			se.log().logTestStep("Ky Tax Info");
			test.log(LogStatus.INFO, "Ky Tax Info section","Transaction Step : "+transaction + "<br>" +"Page : GL_Liquor Liability classification");
			
			se.element().checkUncheckOrValidate(getGL_LiquorLiability_Classifications_CHK_DoNotApplyCityOrCountyTax(strGL_LiquorLiability_Classifications_CHK_DoNotApplyCityOrCountyTax),strGL_LiquorLiability_Classifications_CHK_DoNotApplyCityOrCountyTax,test);
			se.element().checkUncheckOrValidate(getGL_LiquorLiability_Classifications_CHK_AllCityName(strGL_LiquorLiability_Classifications_CHK_AllCityName),strGL_LiquorLiability_Classifications_CHK_AllCityName,test);
			se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_CityKYTax(strGL_LiquorLiability_Classifications_TXT_CityKYTax),strGL_LiquorLiability_Classifications_TXT_CityKYTax,test);
			se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_CItyCode(strGL_LiquorLiability_Classifications_TXT_CItyCode),strGL_LiquorLiability_Classifications_TXT_CItyCode,test);
			se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_County(strGL_LiquorLiability_Classifications_TXT_County),strGL_LiquorLiability_Classifications_TXT_County,test);
			se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_CountyCode(strGL_LiquorLiability_Classifications_TXT_CountyCode),strGL_LiquorLiability_Classifications_TXT_CountyCode,test);
			se.element().enterOrValidateText(getGL_LiquorLiability_Classifications_TXT_TaxCode(strGL_LiquorLiability_Classifications_TXT_TaxCode),strGL_LiquorLiability_Classifications_TXT_TaxCode,test);
		} catch(Exception e) {
			se.verify().verifyEquals("Failed to fill in KY Tax info details for GL_Liquor Liability classification", true, false,true, test);		
		}
	}
	
	
	public void navigateToNextScreen (Map<String, String> row, ExtentTest test){
		
		String strGL_Classification_BTN_DoneButton = (String) row.get("GL_LiquorLiability_Classifications_BTN_DoneButton");
		se.element().clickElement(getNext(),test);
		if(!strGL_Classification_BTN_DoneButton.equals("N/A")){
			se.element().clickElement(getDone(),test);
		}
	}
	
	
	

}
