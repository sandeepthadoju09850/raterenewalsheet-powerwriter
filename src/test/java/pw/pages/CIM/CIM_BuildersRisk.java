package pw.pages.CIM;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CIM;

public class CIM_BuildersRisk extends OR_CIM{
	
	public void BuildersRisk(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_BuildersRisk")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_BuildersRisk", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strTransaction = (String) row.get("Transaction");
		String strCIM_BuildersRisk_BTN_Add=(String) row.get("CIM_BuildersRisk_BTN_Add");
		String strCIM_BuildersRisk_Edit=(String) row.get("CIM_BuildersRisk_Edit");
		String strCIM_BuildersRisk_Done=(String) row.get("CIM_BuildersRisk_Done");
		String strCIM_BuildersRisk_TXT_LocationNo = (String) row.get("CIM_BuildersRisk_TXT_LocationNo");
		String strCIM_BuildersRisk_TXT_Name = (String) row.get("CIM_BuildersRisk_TXT_Name");
		String strCIM_BuildersRisk_TXT_Description = (String) row.get("CIM_BuildersRisk_TXT_Description");
		String strCIM_BuildersRisk_TXT_Street = (String) row.get("CIM_BuildersRisk_TXT_Street");
		String strCIM_BuildersRisk_TXT_SteUnit = (String) row.get("CIM_BuildersRisk_TXT_SteUnit");
		String strCIM_BuildersRisk_TXT_City = (String) row.get("CIM_BuildersRisk_TXT_City");
		String strCIM_BuildersRisk_TXT_StateDescription = (String) row.get("CIM_BuildersRisk_TXT_StateDescription");
		String strCIM_BuildersRisk_TXT_ZipCode = (String) row.get("CIM_BuildersRisk_TXT_ZipCode");
		String strCIM_BuildersRisk_CHK_DoNotApplyCityOrCountyTaxes = (String) row.get("CIM_BuildersRisk_CHK_DoNotApplyCityOrCountyTaxes");
		String strCIM_BuildersRisk_CHK_AllCityName = (String) row.get("CIM_BuildersRisk_CHK_AllCityName");
		String strCIM_BuildersRisk_TXT_KYCity = (String) row.get("CIM_BuildersRisk_TXT_KYCity");
		String strCIM_BuildersRisk_TXT_KYCityFilterNeeded = (String) row.get("CIM_BuildersRisk_TXT_KYCityFilterNeeded");
		String strCIM_BuildersRisk_TXT_CityCode = (String) row.get("CIM_BuildersRisk_TXT_CityCode");
		String strCIM_BuildersRisk_TXT_CityCode_Popup = (String) row.get("CIM_BuildersRisk_TXT_CityCode_Popup");
		String strCIM_BuildersRisk_TXT_County = (String) row.get("CIM_BuildersRisk_TXT_County");
		String strCIM_BuildersRisk_TXT_CountyFilterNeeded = (String) row.get("CIM_BuildersRisk_TXT_CountyFilterNeeded");
		String strCIM_BuildersRisk_TXT_CountyCode = (String) row.get("CIM_BuildersRisk_TXT_CountyCode");
		String strCIM_BuildersRisk_TXT_CountyCode_Popup = (String) row.get("CIM_BuildersRisk_TXT_CountyCode_Popup");
		String strCIM_BuildersRisk_TXT_TaxCode = (String) row.get("CIM_BuildersRisk_TXT_TaxCode");
		String strCIM_BuildersRisk_TXT_JobSiteLimit = (String) row.get("CIM_BuildersRisk_TXT_JobSiteLimit");
		String strCIM_BuildersRisk_CHK_OverrideBaseRate_Yes = (String) row.get("CIM_BuildersRisk_CHK_OverrideBaseRate_Yes");
		String strCIM_BuildersRisk_CHK_OverrideBaseRate_No = (String) row.get("CIM_BuildersRisk_CHK_OverrideBaseRate_No");
		String strCIM_BuildersRisk_TXT_OverrideReason = (String) row.get("CIM_BuildersRisk_TXT_OverrideReason");
		String strCIM_BuildersRisk_TXT_OverrideReasonFilterNeeded = (String) row.get("CIM_BuildersRisk_TXT_OverrideReasonFilterNeeded");
		
		String strCIM_BuildersRisk_TXT_Rating_BaseRate = (String) row.get("CIM_BuildersRisk_TXT_Rating_BaseRate");
		String strCIM_BuildersRisk_TXT_Rating_BaseRateOverride = (String) row.get("CIM_BuildersRisk_TXT_Rating_BaseRateOverride");
		String strCIM_BuildersRisk_TXT_Rating_CoinsuranceFactor = (String) row.get("CIM_BuildersRisk_TXT_Rating_CoinsuranceFactor");
		String strCIM_BuildersRisk_TXT_Rating_DeductibleFactor = (String) row.get("CIM_BuildersRisk_TXT_Rating_DeductibleFactor");
		String strCIM_BuildersRisk_TXT_Rating_TransitionFactor = (String) row.get("CIM_BuildersRisk_TXT_Rating_TransitionFactor");
		String strCIM_BuildersRisk_TXT_Rating_FinalRate = (String) row.get("CIM_BuildersRisk_TXT_Rating_FinalRate");
		String strCIM_BuildersRisk_TXT_Rating_OverrideFinalRate = (String) row.get("CIM_BuildersRisk_TXT_Rating_OverrideFinalRate");
		String strCIM_BuildersRisk_TXT_Rating_JobSiteLimit = (String) row.get("CIM_BuildersRisk_TXT_Rating_JobSiteLimit");
		String strCIM_BuildersRisk_TXT_Rating_Premium = (String) row.get("CIM_BuildersRisk_TXT_Rating_Premium");
		String strCIM_BuildersRisk_TXT_Rating_OverridePremium = (String) row.get("CIM_BuildersRisk_TXT_Rating_OverridePremium");
		try{
			se.log().logTestStep("CIM_BuildersRisk");
			
			test.log(LogStatus.INFO, "CIM_BuildersRisk","Transaction Step : "+ strTransaction + "<br>" +"Page : CIM_BuildersRisk"  + "<br>" +"Section: CIM_BuildersRisk");
			se.util().sleep(1000);
			se.verify().verifyEquals("CIM_BuildersRisk of PowerWriter ", getCIM_BuildersRisk_TXT_VerifyBuildersRiskText().isDisplayed(),true, true,test);
			
			if(strCIM_BuildersRisk_BTN_Add.equalsIgnoreCase("Yes")){
				se.element().clickElement(AddbuttonCIMBuildersRisk);
			}
			if(strCIM_BuildersRisk_Edit.equalsIgnoreCase("Yes")){
				se.element().tryClick(getEditbuttonCIMBuildersRisk(strCIM_BuildersRisk_Edit),test);
			}
			se.verify().verifyEquals("CIM_BuildersRisk of PowerWriter ", getCIM_BuildersRisk_TXT_VerifyBuildersRiskText().isDisplayed(),true, true,test);
			se.element().enterOrValidateText(getCIM_BuildersRisk_TXT_LocationNo(strCIM_BuildersRisk_TXT_LocationNo),strCIM_BuildersRisk_TXT_LocationNo,test);
			se.element().enterOrValidateText(getCIM_BuildersRisk_TXT_Name(strCIM_BuildersRisk_TXT_Name),strCIM_BuildersRisk_TXT_Name,test);
			se.element().enterOrValidateText(getCIM_BuildersRisk_TXT_Description(strCIM_BuildersRisk_TXT_Description),strCIM_BuildersRisk_TXT_Description,test);
			se.element().enterOrValidateText(getCIM_BuildersRisk_TXT_Street(strCIM_BuildersRisk_TXT_Street),strCIM_BuildersRisk_TXT_Street,test);
			se.element().enterOrValidateText(getCIM_BuildersRisk_TXT_SteUnit(strCIM_BuildersRisk_TXT_SteUnit),strCIM_BuildersRisk_TXT_SteUnit,test);
			se.element().enterOrValidateText(getCIM_BuildersRisk_TXT_City(strCIM_BuildersRisk_TXT_City),strCIM_BuildersRisk_TXT_City,test);
			se.element().enterOrValidateText(getCIM_BuildersRisk_TXT_StateDescription(strCIM_BuildersRisk_TXT_StateDescription),strCIM_BuildersRisk_TXT_StateDescription,test);
			se.element().enterOrValidateText(getCIM_BuildersRisk_TXT_ZipCode(strCIM_BuildersRisk_TXT_ZipCode),strCIM_BuildersRisk_TXT_ZipCode,test);
			se.element().checkUncheckOrValidate(getCIM_BuildersRisk_CHK_DoNotApplyCityOrCountyTaxes(strCIM_BuildersRisk_CHK_DoNotApplyCityOrCountyTaxes),strCIM_BuildersRisk_CHK_DoNotApplyCityOrCountyTaxes,test);
			se.element().checkUncheckOrValidate(getCIM_BuildersRisk_CHK_AllCityName(strCIM_BuildersRisk_CHK_AllCityName),strCIM_BuildersRisk_CHK_AllCityName,test);
			se.element().selectPopupWithMagnifier(getCIM_BuildersRisk_TXT_KYCity(strCIM_BuildersRisk_TXT_KYCity), getCIM_BuildersRisk_TXT_KYCitySearch(strCIM_BuildersRisk_TXT_KYCity), strCIM_BuildersRisk_TXT_KYCity,strCIM_BuildersRisk_TXT_KYCityFilterNeeded, strCIM_BuildersRisk_TXT_KYCity,strCIM_BuildersRisk_TXT_CityCode_Popup, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCIM_BuildersRisk_TXT_CityCode(strCIM_BuildersRisk_TXT_CityCode),strCIM_BuildersRisk_TXT_CityCode,test);
			se.element().selectPopupWithMagnifier(getCIM_BuildersRisk_TXT_County(strCIM_BuildersRisk_TXT_County), getCIM_BuildersRisk_TXT_CountySearch(strCIM_BuildersRisk_TXT_County), strCIM_BuildersRisk_TXT_County,strCIM_BuildersRisk_TXT_CountyFilterNeeded, strCIM_BuildersRisk_TXT_County,strCIM_BuildersRisk_TXT_CountyCode_Popup, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCIM_BuildersRisk_TXT_CountyCode(strCIM_BuildersRisk_TXT_CountyCode),strCIM_BuildersRisk_TXT_CountyCode,test);
			se.element().enterOrValidateText(getCIM_BuildersRisk_TXT_TaxCode(strCIM_BuildersRisk_TXT_TaxCode),strCIM_BuildersRisk_TXT_TaxCode,test);
			se.element().enterOrValidateText(getCIM_BuildersRisk_TXT_JobSiteLimit(strCIM_BuildersRisk_TXT_JobSiteLimit),strCIM_BuildersRisk_TXT_JobSiteLimit,test);
			se.element().checkUncheckOrValidate(getCIM_BuildersRisk_CHK_OverrideBaseRate_Yes(strCIM_BuildersRisk_CHK_OverrideBaseRate_Yes),strCIM_BuildersRisk_CHK_OverrideBaseRate_Yes,test);
			se.element().checkUncheckOrValidate(getCIM_BuildersRisk_CHK_OverrideBaseRate_No(strCIM_BuildersRisk_CHK_OverrideBaseRate_No),strCIM_BuildersRisk_CHK_OverrideBaseRate_No,test);
			se.element().selectPopupWithMagnifier(getCIM_BuildersRisk_TXT_OverrideReason(strCIM_BuildersRisk_TXT_OverrideReason), getCIM_BuildersRisk_BTN_OverrideReason_Search(strCIM_BuildersRisk_TXT_OverrideReason), strCIM_BuildersRisk_TXT_OverrideReason,strCIM_BuildersRisk_TXT_OverrideReasonFilterNeeded, strCIM_BuildersRisk_TXT_OverrideReason,constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCIM_BuildersRisk_TXT_Rating_BaseRateOverride(strCIM_BuildersRisk_TXT_Rating_BaseRateOverride),strCIM_BuildersRisk_TXT_Rating_BaseRateOverride,test);
			se.element().Click(getNext(),test);
			se.util().sleep(1000);
			if(strCIM_BuildersRisk_Done.equalsIgnoreCase("Yes")){
				se.element().Click(getNext(),test);
				}

		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CIM_BuildersRisk", true, false, true, test);
		}
		iteration++;
	}

		} catch (Exception e) {
			// TODO: handle exception
			se.log().logTestStep(
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			test.log(LogStatus.FAIL, "Faied",
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			testTearDown(se, test);
		}

}
}	
