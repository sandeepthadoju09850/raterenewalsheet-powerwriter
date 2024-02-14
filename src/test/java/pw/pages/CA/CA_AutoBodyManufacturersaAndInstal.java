package pw.pages.CA;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CA;
import pw.OR.OR_CP;
import pw.OR.OR_GL;

/**
* @author ${ro09528}
*/
public class CA_AutoBodyManufacturersaAndInstal extends OR_CA{
	
	public void AutoBodyManufacturersaAndInstal(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		try{
		//String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(suspendSheet.equalsIgnoreCase(constants.CA_AutoBodyManufacturersaAndInstal)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_AutoBodyManufacturersaAndInstal, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			//String strAutoBodyManufacturersaAndInstallers_Label = (String) row.get("AutoBodyManufacturersaAndInstallers_Label");
			String strAutoBodyManufacturersaAndInstallers_BTN_Add = (String) row.get("AutoBodyManufacturersaAndInstallers_BTN_Add");
			String strAutoBodyManufacturersaAndInstallers_BTN_EditCov = (String) row.get("AutoBodyManufacturersaAndInstallers_BTN_EditCov");
			String strAutoBodyManufacturersaAndInstallers_BTN_RemoveCov = (String) row.get("AutoBodyManufacturersaAndInstallers_BTN_RemoveCov");
			String strAutoBodyManufacturersaAndInstallers_BTN_CopyCov = (String) row.get("AutoBodyManufacturersaAndInstallers_BTN_CopyCov");
			String strAutoBodyManufacturersaAndInstallers_BTN_Details = (String) row.get("AutoBodyManufacturersaAndInstallers_BTN_Details");
			String strAutoBodyManufacturersaAndInstallers_TXT_State = (String) row.get("AutoBodyManufacturersaAndInstallers_TXT_State");
			String strAutoBodyManufacturersaAndInstallers_TXT_StateFilterNeeded = (String) row.get("AutoBodyManufacturersaAndInstallers_TXT_StateFilterNeeded");
			String strAutoBodyManufacturersaAndInstallers_TXT_ZipCode = (String) row.get("AutoBodyManufacturersaAndInstallers_TXT_ZipCode");
			String strAutoBodyManufacturersaAndInstallers_TXT_ZipCodeFilterNeeded = (String) row.get("AutoBodyManufacturersaAndInstallers_TXT_ZipCodeFilterNeeded");
			String strAutoBodyManufacturersaAndInstallers_TXT_Territory = (String) row.get("AutoBodyManufacturersaAndInstallers_TXT_Territory");
			String strAutoBodyManufacturersaAndInstallers_TXT_TerritoryFilterNeeded = (String) row.get("AutoBodyManufacturersaAndInstallers_TXT_TerritoryFilterNeeded");
			String strAutoBodyManufacturersaAndInstallers_TXT_TerrDescrption = (String) row.get("AutoBodyManufacturersaAndInstallers_TXT_TerrDescrption");
			String strAutoBodyManufacturersaAndInstallers_CHK_KYDoNotApplyCity = (String) row.get("AutoBodyManufacturersaAndInstallers_CHK_KYDoNotApplyCity");
			String strAutoBodyManufacturersaAndInstallers_CHK_KYAllCityName = (String) row.get("AutoBodyManufacturersaAndInstallers_CHK_KYAllCityName");
			String strAutoBodyManufacturersaAndInstallers_TXT_KYCityName = (String) row.get("AutoBodyManufacturersaAndInstallers_TXT_KYCityName");
			String strAutoBodyManufacturersaAndInstallers_TXT_KYCityNameFilterNeeded = (String) row.get("AutoBodyManufacturersaAndInstallers_TXT_KYCityNameFilterNeeded");
			String strAutoBodyManufacturersaAndInstallers_TXT_KYCityCode = (String) row.get("AutoBodyManufacturersaAndInstallers_TXT_KYCityCode");
			String strAutoBodyManufacturersaAndInstallers_TXT_KYCounty = (String) row.get("AutoBodyManufacturersaAndInstallers_TXT_KYCounty");
			String strAutoBodyManufacturersaAndInstallers_TXT_KYCountyFilterNeeded = (String) row.get("AutoBodyManufacturersaAndInstallers_TXT_KYCountyFilterNeeded");
			String strAutoBodyManufacturersaAndInstallers_TXT_KYCountyCode = (String) row.get("AutoBodyManufacturersaAndInstallers_TXT_KYCountyCode");
			String strAutoBodyManufacturersaAndInstallers_TXT_KYTaxCode = (String) row.get("AutoBodyManufacturersaAndInstallers_TXT_KYTaxCode");
			String strAutoBodyManufacturersaAndInstallers_TXT_KYTortLimit = (String) row.get("AutoBodyManufacturersaAndInstallers_TXT_KYTortLimit");
			String strAutoBodyManufacturersaAndInstallers_TXT_KYTortLimitCode = (String) row.get("AutoBodyManufacturersaAndInstallers_TXT_KYTortLimitCode");
			String strAutoBodyManufacturersaAndInstallers_TXT_CombinedSingleLimit = (String) row.get("AutoBodyManufacturersaAndInstallers_TXT_CombinedSingleLimit");
			String strAutoBodyManufacturersaAndInstallers_TXT_Deductible = (String) row.get("AutoBodyManufacturersaAndInstallers_TXT_Deductible");
			String strAutoBodyManufacturersaAndInstallers_TXT_NumberOFEmployeesInvolvedInTestingOrDeliveryOfAutos = (String) row.get("AutoBodyManufacturersaAndInstallers_TXT_NumberOFEmployeesInvolvedInTestingOrDeliveryOfAutos");
			String strAutoBodyManufacturersaAndInstallers_BTN_Done = (String) row.get("AutoBodyManufacturersaAndInstallers_BTN_Done");

		try{
			se.log().logTestStep("CA_AutoBodyManufacturersaAndInstallers");
			test.log(LogStatus.INFO, "CA_AutoBodyManufacturersaAndInstallers page","Transaction Step : "+transaction + "<br>" +"Page : CA_AutoBodyManufacturersaAndInstallers");
			se.verify().verifyEquals("CA_AutoBodyManufacturersaAndInstallers Page of PowerWriter ", getAutoBodyManufacturersaAndInstallers_Label().isDisplayed(),true, true,test);
			if(!strAutoBodyManufacturersaAndInstallers_BTN_Add.equals(constants.NA)){
				se.element().Click(getAutoBodyManufacturersaAndInstallers_BTN_Add(strAutoBodyManufacturersaAndInstallers_BTN_Add),strAutoBodyManufacturersaAndInstallers_BTN_Add,test);
			}
			if(!strAutoBodyManufacturersaAndInstallers_BTN_Details.equals(constants.NA)){
				se.element().Click(getAutoBodyManufacturersaAndInstallers_BTN_Details(strAutoBodyManufacturersaAndInstallers_BTN_Details),strAutoBodyManufacturersaAndInstallers_BTN_Details,test);
			}			
			
			se.element().Click(getAutoBodyManufacturersaAndInstallers_BTN_EditCov(strAutoBodyManufacturersaAndInstallers_BTN_EditCov),strAutoBodyManufacturersaAndInstallers_BTN_EditCov,test);
			se.element().Click(getAutoBodyManufacturersaAndInstallers_BTN_CopyCov(strAutoBodyManufacturersaAndInstallers_BTN_CopyCov),strAutoBodyManufacturersaAndInstallers_BTN_CopyCov,test);
			
			se.element().selectPopupWithMagnifier(getAutoBodyManufacturersaAndInstallers_TXT_State(strAutoBodyManufacturersaAndInstallers_TXT_State),getAutoBodyManufacturersaAndInstallers_TXT_StateSearch(strAutoBodyManufacturersaAndInstallers_TXT_State),strAutoBodyManufacturersaAndInstallers_TXT_State,strAutoBodyManufacturersaAndInstallers_TXT_StateFilterNeeded,strAutoBodyManufacturersaAndInstallers_TXT_State, constants.NA, constants.NA,constants.NA,test);
			se.element().selectPopupWithMagnifier(getAutoBodyManufacturersaAndInstallers_TXT_ZipCode(strAutoBodyManufacturersaAndInstallers_TXT_ZipCode),getAutoBodyManufacturersaAndInstallers_TXT_ZipCodeSearch(strAutoBodyManufacturersaAndInstallers_TXT_ZipCode),strAutoBodyManufacturersaAndInstallers_TXT_ZipCode,strAutoBodyManufacturersaAndInstallers_TXT_ZipCodeFilterNeeded,strAutoBodyManufacturersaAndInstallers_TXT_ZipCode, constants.NA, constants.NA,constants.NA,test);
			se.element().selectPopupWithMagnifier(getAutoBodyManufacturersaAndInstallers_TXT_Territory(strAutoBodyManufacturersaAndInstallers_TXT_Territory),getAutoBodyManufacturersaAndInstallers_TXT_TerritorySearch(strAutoBodyManufacturersaAndInstallers_TXT_Territory),strAutoBodyManufacturersaAndInstallers_TXT_Territory,strAutoBodyManufacturersaAndInstallers_TXT_TerritoryFilterNeeded,strAutoBodyManufacturersaAndInstallers_TXT_Territory, constants.NA, constants.NA,constants.NA,test);
			se.element().enterOrValidateText(getAutoBodyManufacturersaAndInstallers_TXT_TerrDescrption(strAutoBodyManufacturersaAndInstallers_TXT_TerrDescrption),strAutoBodyManufacturersaAndInstallers_TXT_TerrDescrption,test);
			se.element().checkUncheckOrValidate(getAutoBodyManufacturersaAndInstallers_CHK_KYDoNotApplyCity(strAutoBodyManufacturersaAndInstallers_CHK_KYDoNotApplyCity),strAutoBodyManufacturersaAndInstallers_CHK_KYDoNotApplyCity,test);
			se.element().checkUncheckOrValidate(getAutoBodyManufacturersaAndInstallers_CHK_KYAllCityName(strAutoBodyManufacturersaAndInstallers_CHK_KYAllCityName),strAutoBodyManufacturersaAndInstallers_CHK_KYAllCityName,test);
			se.element().enterOrValidateText(getAutoBodyManufacturersaAndInstallers_TXT_KYCityName(strAutoBodyManufacturersaAndInstallers_TXT_KYCityName),strAutoBodyManufacturersaAndInstallers_TXT_KYCityName,test);
			se.element().selectPopupWithMagnifier(getAutoBodyManufacturersaAndInstallers_TXT_KYCityName(strAutoBodyManufacturersaAndInstallers_TXT_KYCityName),getAutoBodyManufacturersaAndInstallers_TXT_KYCityNameSearch(strAutoBodyManufacturersaAndInstallers_TXT_KYCityName),strAutoBodyManufacturersaAndInstallers_TXT_KYCityName,strAutoBodyManufacturersaAndInstallers_TXT_KYCityNameFilterNeeded,strAutoBodyManufacturersaAndInstallers_TXT_KYCityName, constants.NA, constants.NA,constants.NA,test);
			se.element().enterOrValidateText(getAutoBodyManufacturersaAndInstallers_TXT_KYCityCode(strAutoBodyManufacturersaAndInstallers_TXT_KYCityCode),strAutoBodyManufacturersaAndInstallers_TXT_KYCityCode,test);
			se.element().enterOrValidateText(getAutoBodyManufacturersaAndInstallers_TXT_KYCounty(strAutoBodyManufacturersaAndInstallers_TXT_KYCounty),strAutoBodyManufacturersaAndInstallers_TXT_KYCounty,test);
			se.element().selectPopupWithMagnifier(getAutoBodyManufacturersaAndInstallers_TXT_KYCounty(strAutoBodyManufacturersaAndInstallers_TXT_KYCounty),getAutoBodyManufacturersaAndInstallers_TXT_KYCountySearch(strAutoBodyManufacturersaAndInstallers_TXT_KYCounty),strAutoBodyManufacturersaAndInstallers_TXT_KYCounty,strAutoBodyManufacturersaAndInstallers_TXT_KYCountyFilterNeeded,strAutoBodyManufacturersaAndInstallers_TXT_KYCounty, constants.NA, constants.NA,constants.NA,test);
			se.element().enterOrValidateText(getAutoBodyManufacturersaAndInstallers_TXT_KYCountyCode(strAutoBodyManufacturersaAndInstallers_TXT_KYCountyCode),strAutoBodyManufacturersaAndInstallers_TXT_KYCountyCode,test);
			se.element().enterOrValidateText(getAutoBodyManufacturersaAndInstallers_TXT_KYTaxCode(strAutoBodyManufacturersaAndInstallers_TXT_KYTaxCode),strAutoBodyManufacturersaAndInstallers_TXT_KYTaxCode,test);
			se.element().enterOrValidateText(getAutoBodyManufacturersaAndInstallers_TXT_KYTortLimit(strAutoBodyManufacturersaAndInstallers_TXT_KYTortLimit),strAutoBodyManufacturersaAndInstallers_TXT_KYTortLimit,test);
			se.element().enterOrValidateText(getAutoBodyManufacturersaAndInstallers_TXT_KYTortLimitCode(strAutoBodyManufacturersaAndInstallers_TXT_KYTortLimitCode),strAutoBodyManufacturersaAndInstallers_TXT_KYTortLimitCode,test);
			se.element().enterOrValidateText(getAutoBodyManufacturersaAndInstallers_TXT_CombinedSingleLimit(strAutoBodyManufacturersaAndInstallers_TXT_CombinedSingleLimit),strAutoBodyManufacturersaAndInstallers_TXT_CombinedSingleLimit,test);
			se.element().enterOrValidateText(getAutoBodyManufacturersaAndInstallers_TXT_Deductible(strAutoBodyManufacturersaAndInstallers_TXT_Deductible),strAutoBodyManufacturersaAndInstallers_TXT_Deductible,test);
			se.element().enterOrValidateText(getAutoBodyManufacturersaAndInstallers_TXT_NumberOFEmployeesInvolvedInTestingOrDeliveryOfAutos(strAutoBodyManufacturersaAndInstallers_TXT_NumberOFEmployeesInvolvedInTestingOrDeliveryOfAutos),strAutoBodyManufacturersaAndInstallers_TXT_NumberOFEmployeesInvolvedInTestingOrDeliveryOfAutos,test);
			
			se.element().clickElement(getNext());
			if(!strAutoBodyManufacturersaAndInstallers_BTN_RemoveCov.equals(constants.NA)){
				se.element().Click(getAutoBodyManufacturersaAndInstallers_BTN_RemoveCov(strAutoBodyManufacturersaAndInstallers_BTN_RemoveCov),strAutoBodyManufacturersaAndInstallers_BTN_RemoveCov,test);
			}	
			
			if(strAutoBodyManufacturersaAndInstallers_BTN_Done.equals(constants.Yes)){
				se.element().Click(getDone(),test);
			}
			
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for CA_AutoBodyManufacturersaAndInstallers ", true, false, true, test);			
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
	

}