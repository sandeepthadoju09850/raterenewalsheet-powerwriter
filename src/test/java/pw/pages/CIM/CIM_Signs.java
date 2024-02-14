package pw.pages.CIM;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.OR.OR_CIM;

public class CIM_Signs extends OR_CIM{
	
	public void CIMSigns(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_Signs")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_Signs", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCIM_Signs_BTN_ADD = (String) row.get("CIM_Signs_BTN_ADD");
		String strCIM_Signs_BTN_Details = (String) row.get("CIM_Signs_BTN_Details");
		String strCIM_Signs_BTN_Done = (String) row.get("CIM_Signs_BTN_Done");
		String strCIM_Signs_TXT_LocationNo = (String) row.get("CIM_Signs_TXT_LocationNo");
		String strCIM_Signs_TXT_Name = (String) row.get("CIM_Signs_TXT_Name");
		String strCIM_Signs_TXT_Description = (String) row.get("CIM_Signs_TXT_Description");
		String strCIM_Signs_TXT_Street = (String) row.get("CIM_Signs_TXT_Street");
		String strCIM_Signs_TXT_SteUnit = (String) row.get("CIM_Signs_TXT_Ste/Unit");
		String strCIM_Signs_TXT_City = (String) row.get("CIM_Signs_TXT_City");
		String strCIM_Signs_TXT_State = (String) row.get("CIM_Signs_TXT_State");
		String strCIM_Signs_TXT_ZipCode = (String) row.get("CIM_Signs_TXT_ZipCode");
		String strCIM_Signs_CHK_DoNotApplyCityOrCountyTaxes = (String) row.get("CIM_Signs_CHK_DoNotApplyCityOrCountyTaxes");
		String strCIM_Signs_CHK_AllCityName = (String) row.get("CIM_Signs_CHK_AllCityName");
		String strCIM_Signs_TXT_KYCity = (String) row.get("CIM_Signs_TXT_KYCity");
		String strCIM_Signs_TXT_CityCode = (String) row.get("CIM_Signs_TXT_CityCode");
		String strCIM_Signs_TXT_County = (String) row.get("CIM_Signs_TXT_County");
		String strCIM_Signs_TXT_CountyCode = (String) row.get("CIM_Signs_TXT_CountyCode");
		String strCIM_Signs_TXT_TaxCode = (String) row.get("CIM_Signs_TXT_TaxCode");
		String strCIM_Signs_CHK_InsideSignYes = (String) row.get("CIM_Signs_CHK_InsideSignYes");
		String strCIM_Signs_CHK_InsideSignNo = (String) row.get("CIM_Signs_CHK_InsideSignNo");
		String strCIM_Signs_TXT_Limit = (String) row.get("CIM_Signs_TXT_Limit");
		String strCIM_Signs_TXT_TypeOfSign = (String) row.get("CIM_Signs_TXT_TypeOfSign");
		String strCIM_Signs_TXT_PackageModFactor = (String) row.get("CIM_Signs_TXT_PackageModFactor");
		
		try{
				se.log().logTestStep("CIMSigns");
				test.log(LogStatus.INFO, "CIMSigns page","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMSigns");
				se.verify().verifyEquals("CIMSigns page of PowerWriter ", getCIM_Signs_TXT_VerifySignsText().isDisplayed(),true, true,test);
			
				if((strCIM_Signs_BTN_ADD.equalsIgnoreCase("Yes"))){
					se.element().Click(getCIM_Signs_BTN_ADD(strCIM_Signs_BTN_ADD),test);
					}
					if((strCIM_Signs_BTN_Details.equalsIgnoreCase("Yes"))){
						se.util().sleep(3000);
						se.element().Click(getCIM_Signs_BTN_Details(strCIM_Signs_BTN_Details),test);
					}
				
				se.element().enterOrValidateText(getCIM_Signs_TXT_LocationNo(strCIM_Signs_TXT_LocationNo),strCIM_Signs_TXT_LocationNo,test);
				se.element().enterOrValidateText(getCIM_Signs_TXT_Name(strCIM_Signs_TXT_Name),strCIM_Signs_TXT_Name,test);
				se.element().enterOrValidateText(getCIM_Signs_TXT_Description(strCIM_Signs_TXT_Description),strCIM_Signs_TXT_Description,test);
				se.element().enterOrValidateText(getCIM_Signs_TXT_Street(strCIM_Signs_TXT_Street),strCIM_Signs_TXT_Street,test);
				se.element().enterOrValidateText(getCIM_Signs_TXT_SteUnit(strCIM_Signs_TXT_SteUnit),strCIM_Signs_TXT_SteUnit,test);
				se.element().enterOrValidateText(getCIM_Signs_TXT_City(strCIM_Signs_TXT_City),strCIM_Signs_TXT_City,test);
				se.element().enterOrValidateText(getCIM_Signs_TXT_State(strCIM_Signs_TXT_State),strCIM_Signs_TXT_State,test);
				se.element().enterOrValidateText(getCIM_Signs_TXT_ZipCode(strCIM_Signs_TXT_ZipCode),strCIM_Signs_TXT_ZipCode,test);
				se.element().checkUncheckOrValidate(getCIM_Signs_CHK_DoNotApplyCityOrCountyTaxes(strCIM_Signs_CHK_DoNotApplyCityOrCountyTaxes),strCIM_Signs_CHK_DoNotApplyCityOrCountyTaxes,test);
				se.element().checkUncheckOrValidate(getCIM_Signs_CHK_AllCityName(strCIM_Signs_CHK_AllCityName),strCIM_Signs_CHK_AllCityName,test);
				se.element().enterOrValidateText(getCIM_Signs_TXT_KYCity(strCIM_Signs_TXT_KYCity),strCIM_Signs_TXT_KYCity,test);
				se.element().enterOrValidateText(getCIM_Signs_TXT_CityCode(strCIM_Signs_TXT_CityCode),strCIM_Signs_TXT_CityCode,test);
				se.element().enterOrValidateText(getCIM_Signs_TXT_County(strCIM_Signs_TXT_County),strCIM_Signs_TXT_County,test);
				se.element().enterOrValidateText(getCIM_Signs_TXT_CountyCode(strCIM_Signs_TXT_CountyCode),strCIM_Signs_TXT_CountyCode,test);
				se.element().enterOrValidateText(getCIM_Signs_TXT_TaxCode(strCIM_Signs_TXT_TaxCode),strCIM_Signs_TXT_TaxCode,test);
				se.element().checkUncheckOrValidate(getCIM_Signs_CHK_InsideSignYes(strCIM_Signs_CHK_InsideSignYes),strCIM_Signs_CHK_InsideSignYes,test);
				se.element().checkUncheckOrValidate(getCIM_Signs_CHK_InsideSignNo(strCIM_Signs_CHK_InsideSignNo),strCIM_Signs_CHK_InsideSignNo,test);
				se.element().enterOrValidateText(getCIM_Signs_TXT_Limit(strCIM_Signs_TXT_Limit),strCIM_Signs_TXT_Limit,test);
				se.util().sleep(3000);
				se.element().enterOrValidateText(getCIM_Signs_TXT_TypeOfSign(strCIM_Signs_TXT_TypeOfSign),strCIM_Signs_TXT_TypeOfSign,test);
				se.element().enterOrValidateText(getCIM_Signs_TXT_PackageModFactor(strCIM_Signs_TXT_PackageModFactor),strCIM_Signs_TXT_PackageModFactor,test);

				se.element().Click(getNext(),test);
				
				if((strCIM_Signs_BTN_Done.equalsIgnoreCase("Yes"))){
					
					se.element().Click(getDone(),test);
				}
	
				
	}
		catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CIMSigns ", true, false, true, test);
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