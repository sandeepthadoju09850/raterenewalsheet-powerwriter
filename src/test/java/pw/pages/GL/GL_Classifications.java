package pw.pages.GL;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import pw.Constants.constants;
import pw.OR.OR_CP;

public class GL_Classifications extends OR_CP {

	public void GL_ClassificationsPage(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase(constants.GL_Classification)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.GL_Classification, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			try {
				GL_Classifications GL_ClassificationsPage = TestPageFactory.initElements(se,GL_Classifications.class);
				GL_ClassificationsPage.classificationDetails(row, test);
				navigateToNextScreen(row,test);
				
			} catch (Exception e) {
				
				se.verify().verifyEquals("Failed to fill in details for classifications page ", true, false,true, test);
			}
			iteration++;
		}
	
}
catch (Exception e) {
	// TODO: handle exception
	se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
	test.log(LogStatus.FAIL, "Failed", "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
	testTearDown(se, test);
}
	
}
	public void classificationDetails(Map<String, String> row, ExtentTest test) throws IOException {
		
		String strGL_Classification_BTN_AddButton = (String) row.get("GL_Classification_BTN_AddButton");
		String strGL_Classification_BTN_Remove = (String) row.get("GL_Classification_BTN_Remove");
		String strGL_Classification_TXT_CPLocationNo = (String) row.get("GL_Classification_TXT_CPLocationNo");
		String strGL_Classification_TXT_Name = (String) row.get("GL_Classification_TXT_Name");
		String strGL_Classification_TXT_Description = (String) row.get("GL_Classification_TXT_Description");
		String strGL_Classification_TXT_Street = (String) row.get("GL_Classification_TXT_Street");
		String strGL_Classification_TXT_Ste_Unit = (String) row.get("GL_Classification_TXT_Ste/Unit");
		String strGL_Classification_TXT_City = (String) row.get("GL_Classification_TXT_City");
		String strGL_Classification_TXT_State = (String) row.get("GL_Classification_TXT_State");
		String strGL_Classification_TXT_Zip = (String) row.get("GL_Classification_TXT_Zip");
		String strGL_Classification_TXT_PolicyType = (String) row.get("GL_Classification_TXT_PolicyType");
		String strGL_Classification_TXT_ClassCode = (String) row.get("GL_Classification_TXT_ClassCode");
		String strGL_Classification_TXT_ClassCodeFilterNeeded = (String) row.get("GL_Classification_TXT_ClassCodeFilterNeeded");
		String strGL_Classification_TXT_EventNumber = (String) row.get("GL_Classification_TXT_EventNumber");
		String strGL_Classification_CHK_Auditable = (String) row.get("GL_Classification_CHK_Auditable");
		String strGL_Classification_TXT_ClassDescription = (String) row.get("GL_Classification_TXT_ClassDescription");
		String strGL_Classification_CHK_IfAnyStatusAppliesYes = (String) row.get("GL_Classification_CHK_IfAnyStatusAppliesYes");
		String strGL_Classification_CHK_IfAnyStatusAppliesNo = (String) row.get("GL_Classification_CHK_IfAnyStatusAppliesNo");
		String strGL_Classification_TXT_ClassificationGroup = (String) row.get("GL_Classification_TXT_ClassificationGroup");
		String strGL_Classification_TXT_MedicalExpIncLimitFac = (String) row.get("GL_Classification_TXT_MedicalExpIncLimitFac");
		String strGL_Classification_TXT_OverrideMedExpIncLimiFac = (String) row.get("GL_Classification_TXT_OverrideMedExpIncLimiFac");
		String strGL_Classification_TXT_MinMedExpFac = (String) row.get("GL_Classification_TXT_MinMedExpFac");
		String strGL_Classification_TXT_MaxMedExpFactor = (String) row.get("GL_Classification_TXT_MaxMedExpFactor");
		String strGL_Classification_TXT_ExposureBasis = (String) row.get("GL_Classification_TXT_ExposureBasis");
		String strGL_Classification_TXT_EstimatedExposure = (String) row.get("GL_Classification_TXT_EstimatedExposure");
		String strGL_Classification_CHK_OverRidePremOpsLossCostELPYes = (String) row.get("GL_Classification_CHK_OverRidePremOpsLossCostELPYes");
		String strGL_Classification_TXT_OverrideReasonPremOps = (String) row.get("GL_Classification_TXT_OverrideReasonPremOps");
		String strGL_Classification_TXT_OverrideReasonPremOpsFilterNeeded = (String) row.get("GL_Classification_TXT_OverrideReasonPremOpsFilterNeeded");
		String strGL_Classification_CHK_OverRidePremOpsLossCostELPNo = (String) row.get("GL_Classification_CHK_OverRidePremOpsLossCostELPNo");
		String strGL_Classification_CHK_OverRideCompletedPremOps_Yes = (String) row.get("GL_Classification_CHK_OverRideCompletedPremOps_Yes");
		String strGL_Classification_TXT_OverrideReasonProdCompleted = (String) row.get("GL_Classification_TXT_OverrideReasonProdCompleted");
		String strGL_Classification_TXT_OverrideReasonProdCompletedFilterNeeded = (String) row.get("GL_Classification_TXT_OverrideReasonProdCompletedFilterNeeded");
		String strGL_Classification_CHK_OverRideCompletedPremOps_No = (String) row.get("GL_Classification_CHK_OverRideCompletedPremOps_No");
		String strGL_Classification_TXT_PremisesLossCostELPOverride = (String) row.get("GL_Classification_TXT_PremisesLossCostELPOverride");
		String strGL_Classification_TXT_ProductsLossCostELPOverride = (String) row.get("GL_Classification_TXT_ProductsLossCostELPOverride");
		String strGL_Classification_CHK_RiskLicensedPesticidesCompliance = (String) row.get("GL_Classification_CHK_RiskLicensedPesticidesCompliance");
		String strGL_Classification_BTN_Details = (String) row.get("GL_Classification_BTN_Details");
		String strGL_Classification_BTN_SelectDetailsIcon = (String) row.get("GL_Classification_BTN_SelectDetailsIcon");
		String strGL_Classification_CHK_LoggingAndLumberingOperationsEndo = (String) row.get("GL_Classification_CHK_LoggingAndLumberingOperationsEndo");
		String strGL_Classification_TXT_LoggingAndLumberingOperationsEndoRating_EndoPrem = (String) row.get("GL_Classification_TXT_LoggingAndLumberingOperationsEndoRating_EndoPrem");
		String strGL_Classification_TXT_LoggingAndLumberingOperationsEndoRating_Coverage = (String) row.get("GL_Classification_TXT_LoggingAndLumberingOperationsEndoRating_Coverage");
		String transaction = (String) row.get("Transaction Name");
		try{
			se.log().logTestStep("Classification Details");
			test.log(LogStatus.INFO, "Classification Details Section","Transaction Step : "+transaction + "<br>" +"Page : GL_ClassificationsPage");
			se.verify().verifyEquals("Classification Details of  GL_ClassificationsPage  of PowerWriter ", getGL_Classification_label().isDisplayed(),true, true,test);
			
			if(!strGL_Classification_BTN_Details.equals(constants.NA)){
				se.element().clickElement(getGL_Classification_BTN_SelectDetailsIcon(strGL_Classification_BTN_SelectDetailsIcon),test);
				se.verify().verifyEquals("GL_Classification details is displayed ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
			}
			if(!strGL_Classification_BTN_AddButton.equals(constants.NA)){
				se.element().clickElement(getGL_Classification_Classifications_BTN_Add(),test);
			}
			if(!strGL_Classification_BTN_Remove.equals(constants.NA)){
				se.element().clickElement(getGL_Classification_BTN_Remove(),test);
			}
			Thread.sleep(2000);
			se.element().enterOrValidateText(getGL_Classification_TXT_CPLocationNo(strGL_Classification_TXT_CPLocationNo),strGL_Classification_TXT_CPLocationNo,test);
			se.element().enterOrValidateText(getGL_Classification_TXT_Name(strGL_Classification_TXT_Name),strGL_Classification_TXT_Name,test);
			se.element().enterOrValidateText(getGL_Classification_TXT_Description(strGL_Classification_TXT_Description),strGL_Classification_TXT_Description,test);
			se.element().enterOrValidateText(getGL_Classification_TXT_Street(strGL_Classification_TXT_Street),strGL_Classification_TXT_Street,test);
			se.element().enterOrValidateText(getGL_Classification_TXT_Ste_Unit(strGL_Classification_TXT_Ste_Unit),strGL_Classification_TXT_Ste_Unit,test);
			se.element().enterOrValidateText(getGL_Classification_TXT_City(strGL_Classification_TXT_City),strGL_Classification_TXT_City,test);
			se.element().enterOrValidateText(getGL_Classification_TXT_State(strGL_Classification_TXT_State),strGL_Classification_TXT_State,test);
			se.element().enterOrValidateText(getGL_Classification_TXT_Zip(strGL_Classification_TXT_Zip),strGL_Classification_TXT_Zip,test);
			if(strGL_Classification_TXT_State.contains("Kentucky")){
				kyTaxInfo(row, test);
			}
			se.element().enterOrValidateText(getGL_Classification_TXT_PolicyType(strGL_Classification_TXT_PolicyType),strGL_Classification_TXT_PolicyType,test);
			se.element().enterOrValidateText(getGL_Classification_TXT_ClassCode(strGL_Classification_TXT_ClassCode),strGL_Classification_TXT_ClassCode,test);
			//se.element().selectClasscode(getGL_Classification_TXT_ClassCode(strGL_Classification_TXT_ClassCode), strGL_Classification_TXT_ClassCodeFilterNeeded, strGL_Classification_TXT_ClassCode, constants.NA, constants.NA, constants.NA, test);
			se.util().sleep(3000);
			if(se.element().isElementPresent(InfoOKbutton)){
				se.element().waitForElement(InfoOKbutton);
				se.element().Click(getInfoOKbutton(), test);
			}
			se.element().enterOrValidateText(getGL_Classification_TXT_EventNumber(strGL_Classification_TXT_EventNumber), strGL_Classification_TXT_EventNumber, test);
			se.element().checkUncheckOrValidate(getGL_Classification_CHK_Auditable(strGL_Classification_CHK_Auditable),strGL_Classification_CHK_Auditable,test);
			se.element().enterOrValidateText(getGL_Classification_TXT_ClassDescription(strGL_Classification_TXT_ClassDescription),strGL_Classification_TXT_ClassDescription,test);
			se.element().checkUncheckOrValidate(getGL_Classification_CHK_IfAnyStatusAppliesYes(strGL_Classification_CHK_IfAnyStatusAppliesYes),strGL_Classification_CHK_IfAnyStatusAppliesYes,test);
			se.element().checkUncheckOrValidate(getGL_Classification_CHK_IfAnyStatusAppliesNo(strGL_Classification_CHK_IfAnyStatusAppliesNo),strGL_Classification_CHK_IfAnyStatusAppliesNo,test);
			se.element().enterOrValidateText(getGL_Classification_TXT_ClassificationGroup(strGL_Classification_TXT_ClassificationGroup),strGL_Classification_TXT_ClassificationGroup,test);
			se.element().enterOrValidateText(getGL_Classification_TXT_MedicalExpIncLimitFac(strGL_Classification_TXT_MedicalExpIncLimitFac),strGL_Classification_TXT_MedicalExpIncLimitFac,test);
			se.element().enterOrValidateText(getGL_Classification_TXT_OverrideMedExpIncLimiFac(strGL_Classification_TXT_OverrideMedExpIncLimiFac),strGL_Classification_TXT_OverrideMedExpIncLimiFac,test);
			se.element().enterOrValidateText(getGL_Classification_TXT_MinMedExpFac(strGL_Classification_TXT_MinMedExpFac),strGL_Classification_TXT_MinMedExpFac,test);
			se.element().enterOrValidateText(getGL_Classification_TXT_MaxMedExpFactor(strGL_Classification_TXT_MaxMedExpFactor),strGL_Classification_TXT_MaxMedExpFactor,test);
			se.element().enterOrValidateText(getGL_Classification_TXT_ExposureBasis(strGL_Classification_TXT_ExposureBasis),strGL_Classification_TXT_ExposureBasis,test);
			se.element().enterOrValidateText(getGL_Classification_TXT_EstimatedExposure(strGL_Classification_TXT_EstimatedExposure),strGL_Classification_TXT_EstimatedExposure,test);
			se.element().checkUncheckOrValidate(getGL_Classification_CHK_OverRidePremOpsLossCostELPYes(strGL_Classification_CHK_OverRidePremOpsLossCostELPYes),strGL_Classification_CHK_OverRidePremOpsLossCostELPYes,test);
			
			se.element().selectPopupWithMagnifier(getGL_Classification_TXT_OverrideReasonPremOps(strGL_Classification_TXT_OverrideReasonPremOps), getGL_Classification_TXT_OverrideReasonPremOpsSearch(strGL_Classification_TXT_OverrideReasonPremOps), strGL_Classification_TXT_OverrideReasonPremOps, strGL_Classification_TXT_OverrideReasonPremOpsFilterNeeded, strGL_Classification_TXT_OverrideReasonPremOps, constants.NA, constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(getGL_Classification_CHK_OverRidePremOpsLossCostELPNo(strGL_Classification_CHK_OverRidePremOpsLossCostELPNo),strGL_Classification_CHK_OverRidePremOpsLossCostELPNo,test);
			se.element().checkUncheckOrValidate(getGL_Classification_CHK_OverRideCompletedPremOps_Yes(strGL_Classification_CHK_OverRideCompletedPremOps_Yes),strGL_Classification_CHK_OverRideCompletedPremOps_Yes,test);
			
			se.element().selectPopupWithMagnifier(getGL_Classification_TXT_OverrideReasonProdCompleted(strGL_Classification_TXT_OverrideReasonProdCompleted), getGL_Classification_TXT_OverrideReasonProdCompletedSearch(strGL_Classification_TXT_OverrideReasonProdCompleted), strGL_Classification_TXT_OverrideReasonProdCompleted, strGL_Classification_TXT_OverrideReasonProdCompletedFilterNeeded, strGL_Classification_TXT_OverrideReasonProdCompleted, constants.NA, constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(getGL_Classification_CHK_OverRideCompletedPremOps_No(strGL_Classification_CHK_OverRideCompletedPremOps_No),strGL_Classification_CHK_OverRideCompletedPremOps_No,test);
			se.element().enterOrValidateText(getGL_Classification_TXT_PremisesLossCostELPOverride(strGL_Classification_TXT_PremisesLossCostELPOverride),strGL_Classification_TXT_PremisesLossCostELPOverride,test);
			se.element().enterOrValidateText(getGL_Classification_TXT_ProductsLossCostELPOverride(strGL_Classification_TXT_ProductsLossCostELPOverride),strGL_Classification_TXT_ProductsLossCostELPOverride,test);
			se.element().checkUncheckOrValidate(getGL_Classification_CHK_RiskLicensedPesticidesCompliance(strGL_Classification_CHK_RiskLicensedPesticidesCompliance),strGL_Classification_CHK_RiskLicensedPesticidesCompliance,test);
			se.element().checkUncheckOrValidate(getGL_Classification_CHK_LoggingAndLumberingOperationsEndo(strGL_Classification_CHK_LoggingAndLumberingOperationsEndo),strGL_Classification_CHK_LoggingAndLumberingOperationsEndo,test);
			se.element().enterOrValidateText(getGL_Classification_TXT_LoggingAndLumberingOperationsEndoRating_EndoPrem(strGL_Classification_TXT_LoggingAndLumberingOperationsEndoRating_EndoPrem),strGL_Classification_TXT_LoggingAndLumberingOperationsEndoRating_EndoPrem,test);
			se.element().enterOrValidateText(getstrGL_Classification_TXT_LoggingAndLumberingOperationsEndoRating_Coverage(strGL_Classification_TXT_LoggingAndLumberingOperationsEndoRating_Coverage),strGL_Classification_TXT_LoggingAndLumberingOperationsEndoRating_Coverage,test);
			} catch(Exception e) {
				
			se.verify().verifyEquals("Failed to fill in classification details for GL_ClassificationsPage ", true, false,true, test);	
			}
	}
	

	public void kyTaxInfo(Map<String, String> row, ExtentTest test) throws IOException {
	
		String strGL_Classification_CHK_DoNotApplyCityOrCountyTax = (String) row.get("GL_Classification_CHK_DoNotApplyCityOrCountyTax");
		String strGL_Classification_CHK_AllCityName = (String) row.get("GL_Classification_CHK_AllCityName");
		String strGL_Classification_TXT_CityKYTax = (String) row.get("GL_Classification_TXT_CityKYTax");
		String strGL_Classification_TXT_CityCode = (String) row.get("GL_Classification_TXT_CityCode");
		String strGL_Classification_TXT_County = (String) row.get("GL_Classification_TXT_County");
		String strGL_Classification_TXT_CountyCode = (String) row.get("GL_Classification_TXT_CountyCode");
		String strGL_Classification_TXT_TaxCode = (String) row.get("GL_Classification_TXT_TaxCode");
		
		String transaction = (String) row.get("Transaction Name");
		try{
			se.log().logTestStep("Ky Tax Info");
			test.log(LogStatus.INFO, "Ky Tax Info section","Transaction Step : "+transaction + "<br>" +"Page : GL_ClassificationsPage");
			se.element().checkUncheckOrValidate(getGL_Classification_CHK_DoNotApplyCityOrCountyTax(strGL_Classification_CHK_DoNotApplyCityOrCountyTax),strGL_Classification_CHK_DoNotApplyCityOrCountyTax,test);
			se.element().checkUncheckOrValidate(getGL_Classification_CHK_AllCityName(strGL_Classification_CHK_AllCityName),strGL_Classification_CHK_AllCityName,test);
			se.element().enterOrValidateText(getGL_Classification_TXT_CityKYTax(strGL_Classification_TXT_CityKYTax),strGL_Classification_TXT_CityKYTax,test);
			se.element().enterOrValidateText(getGL_Classification_TXT_CityCode(strGL_Classification_TXT_CityCode),strGL_Classification_TXT_CityCode,test);
			se.element().enterOrValidateText(getGL_Classification_TXT_County(strGL_Classification_TXT_County),strGL_Classification_TXT_County,test);
			se.element().enterOrValidateText(getGL_Classification_TXT_CountyCode(strGL_Classification_TXT_CountyCode),strGL_Classification_TXT_CountyCode,test);
			se.element().enterOrValidateText(getGL_Classification_TXT_TaxCode(strGL_Classification_TXT_TaxCode),strGL_Classification_TXT_TaxCode,test);
		} catch(Exception e) {
			se.verify().verifyEquals("Failed to fill in KY Tax info details for GL_ClassificationsPage ", true, false,true, test);		
		}
	}
	
	public void navigateToNextScreen (Map<String, String> row, ExtentTest test){
		
		String strGL_Classification_BTN_DoneButton = (String) row.get("GL_Classification_BTN_DoneButton");
		se.element().clickElement(getNext(),test);
		se.util().sleep(3000);
		if(!strGL_Classification_BTN_DoneButton.equals("N/A")){
			se.element().clickElement(getDone(),test);
		}
	}
	
}
