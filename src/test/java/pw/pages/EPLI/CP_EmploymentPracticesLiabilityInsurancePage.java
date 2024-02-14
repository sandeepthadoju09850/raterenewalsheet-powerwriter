package pw.pages.EPLI;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import pw.Constants.constants;
import pw.OR.OR_CP;

public class CP_EmploymentPracticesLiabilityInsurancePage extends OR_CP {
public void CP_EmployPracLiabInsPage_GenInfo(Map<String, String> row, ExtentTest test) throws IOException {
	
	String strEmpPracticesLiability_TXT_Limit=(String) row.get("EmpPracticesLiability_TXT_Limit");
	String strEmpPracticesLiability_TXT_Deductible=(String) row.get("EmpPracticesLiability_TXT_Deductible");
	String strEmpPracticesLiability_TXT_NumOfPartTimeEmp=(String) row.get("EmpPracticesLiability_TXT_NumOfPartTimeEmp");
	String strEmpPracticesLiability_TXT_NumOfFullTimeEmp=(String) row.get("EmpPracticesLiability_TXT_NumOfFullTimeEmp");
	String strEmpPracticesLiability_CHK_SmallBusiness=(String) row.get("EmpPracticesLiability_CHK_SmallBusiness");
	String strEmpPracticesLiability_CHK_MidMarket=(String) row.get("EmpPracticesLiability_CHK_MidMarket");
	String strEmpPracticesLiability_CHK_SeparateDefenseLimitCoverage=(String) row.get("EmpPracticesLiability_CHK_SeparateDefenseLimitCoverage");
	String strEmpPracticesLiability_CHK_PriorActsCoverage=(String) row.get("EmpPracticesLiability_CHK_PriorActsCoverage");
	String strEmpPracticesLiability_TXT_PriorCarrierLimits=(String) row.get("EmpPracticesLiability_TXT_PriorCarrierLimits");
	String strEmpPracticesLiability_TXT_PriorCarrierRetroDate=(String) row.get("EmpPracticesLiability_TXT_PriorCarrierRetroDate");
	String strEmpPracticesLiability_CHK_ThirdPartyLiability=(String) row.get("EmpPracticesLiability_CHK_ThirdPartyLiability");
	String strEmpPracticesLiability_CHK_EpliProgramOverride=(String) row.get("EmpPracticesLiability_CHK_EpliProgramOverride");
	String strEmpPracticesLiability_TXT_RetroactiveDate=(String) row.get("EmpPracticesLiability_TXT_RetroactiveDate");
	String strEmpPracticesLiability_CHK_MiscellaneousCoverage=(String) row.get("EmpPracticesLiability_CHK_MiscellaneousCoverage");
	String strEmpPracticesLiability_CHK_SecuraManuscript=(String) row.get("EmpPracticesLiability_CHK_SecuraManuscript");
	String strTransaction  = (String) row.get("Transaction Name");
		
		try{
			se.log().logTestStep("EmpPracticesLiability");
			test.log(LogStatus.INFO, "EmpPracticesLiability page","Transaction Step : " + strTransaction + "<br>" +"Page : CP_EmpPracticesLiability");
			
			se.element().selectPopupWithMagnifier(getEmpPracticesLiability_TXT_Limit(strEmpPracticesLiability_TXT_Limit), getEmpPracticesLiability_BTN_Limit(strEmpPracticesLiability_TXT_Limit), strEmpPracticesLiability_TXT_Limit, constants.NA, strEmpPracticesLiability_TXT_Limit, constants.NA, constants.NA, constants.NA, test);
			se.element().selectPopupWithMagnifier(getEmpPracticesLiability_TXT_Deductible(strEmpPracticesLiability_TXT_Deductible), getEmpPracticesLiability_BTN_Deductible(strEmpPracticesLiability_TXT_Deductible), strEmpPracticesLiability_TXT_Deductible, constants.NA, strEmpPracticesLiability_TXT_Deductible, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getEmpPracticesLiability_TXT_NumOfPartTimeEmp(strEmpPracticesLiability_TXT_NumOfPartTimeEmp),strEmpPracticesLiability_TXT_NumOfPartTimeEmp,test);
			se.element().enterOrValidateText(getEmpPracticesLiability_TXT_NumOfFullTimeEmp(strEmpPracticesLiability_TXT_NumOfFullTimeEmp),strEmpPracticesLiability_TXT_NumOfFullTimeEmp,test);
			se.element().checkUncheckOrValidate(getEmpPracticesLiability_CHK_SmallBusiness(strEmpPracticesLiability_CHK_SmallBusiness),strEmpPracticesLiability_CHK_SmallBusiness,test);
			se.element().checkUncheckOrValidate(getEmpPracticesLiability_CHK_MidMarket(strEmpPracticesLiability_CHK_MidMarket),strEmpPracticesLiability_CHK_MidMarket,test);
			se.element().checkUncheckOrValidate(getEmpPracticesLiability_CHK_SeparateDefenseLimitCoverage(strEmpPracticesLiability_CHK_SeparateDefenseLimitCoverage),strEmpPracticesLiability_CHK_SeparateDefenseLimitCoverage,test);
			se.element().checkUncheckOrValidate(getEmpPracticesLiability_CHK_PriorActsCoverage(strEmpPracticesLiability_CHK_PriorActsCoverage),strEmpPracticesLiability_CHK_PriorActsCoverage,test);
			se.element().enterOrValidateText(getEmpPracticesLiability_TXT_PriorCarrierLimits(strEmpPracticesLiability_TXT_PriorCarrierLimits),strEmpPracticesLiability_TXT_PriorCarrierLimits,test);
			se.element().enterOrValidateText(getEmpPracticesLiability_TXT_PriorCarrierRetroDate(strEmpPracticesLiability_TXT_PriorCarrierRetroDate),strEmpPracticesLiability_TXT_PriorCarrierRetroDate,test);
			se.element().checkUncheckOrValidate(getEmpPracticesLiability_CHK_ThirdPartyLiability(strEmpPracticesLiability_CHK_ThirdPartyLiability),strEmpPracticesLiability_CHK_ThirdPartyLiability,test);
			se.element().checkUncheckOrValidate(getEmpPracticesLiability_CHK_EpliProgramOverride(strEmpPracticesLiability_CHK_EpliProgramOverride),strEmpPracticesLiability_CHK_EpliProgramOverride,test);
			se.element().enterOrValidateText(getEmpPracticesLiability_TXT_RetroactiveDate(strEmpPracticesLiability_TXT_RetroactiveDate),strEmpPracticesLiability_TXT_RetroactiveDate,test);
			se.element().checkUncheckOrValidate(getEmpPracticesLiability_CHK_MiscellaneousCoverage(strEmpPracticesLiability_CHK_MiscellaneousCoverage),strEmpPracticesLiability_CHK_MiscellaneousCoverage,test);
			se.element().checkUncheckOrValidate(getEmpPracticesLiability_CHK_SecuraManuscript(strEmpPracticesLiability_CHK_SecuraManuscript),strEmpPracticesLiability_CHK_SecuraManuscript,test);
			
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CP_EmploymentPracticesLiabilityInsurancePage", true, false, true, test);
					
		}
		
	}

	public void CP_EmployPracLiabInsPage_TaxInfo(Map<String, String> row, ExtentTest test) throws IOException {
		String strEmpPracticesLiability_CHK_DoNotApplyCityOrCountyTax=(String) row.get("EmpPracticesLiability_CHK_DoNotApplyCityOrCountyTax");
		String strEmpPracticesLiability_CHK_AllCityName=(String) row.get("EmpPracticesLiability_CHK_AllCityName");
		String strEmpPracticesLiability_TXT_City=(String) row.get("EmpPracticesLiability_TXT_City");
		String strEmpPracticesLiability_TXT_CItyCode=(String) row.get("EmpPracticesLiability_TXT_CItyCode");
		String strEmpPracticesLiability_CHK_ALLCountyName=(String) row.get("EmpPracticesLiability_CHK_ALLCountyName");
		String strEmpPracticesLiability_TXT_County=(String) row.get("EmpPracticesLiability_TXT_County");
		String strEmpPracticesLiability_TXT_CountyCode=(String) row.get("EmpPracticesLiability_TXT_CountyCode");
		String strEmpPracticesLiability_TXT_TaxCode=(String) row.get("EmpPracticesLiability_TXT_TaxCode");
		
		
		try{
			
			
			se.element().checkUncheckOrValidate(getEmpPracticesLiability_CHK_DoNotApplyCityOrCountyTax(strEmpPracticesLiability_CHK_DoNotApplyCityOrCountyTax),strEmpPracticesLiability_CHK_DoNotApplyCityOrCountyTax,test);
			se.element().checkUncheckOrValidate(getEmpPracticesLiability_CHK_AllCityName(strEmpPracticesLiability_CHK_AllCityName),strEmpPracticesLiability_CHK_AllCityName,test);
			if(!strEmpPracticesLiability_TXT_City.equalsIgnoreCase(constants.NA) && !strEmpPracticesLiability_TXT_City.contains(constants.Validate)){
				se.element().clickSearchIcon(getEmpPracticesLiability_BTN_City(), test);
				se.element().Click(getEmpPracticesLiability_LNK_City(strEmpPracticesLiability_TXT_City), test);
			}else{	
			se.element().enterOrValidateText(getEmpPracticesLiability_TXT_City(strEmpPracticesLiability_TXT_City),strEmpPracticesLiability_TXT_City,test);
			}
			se.element().enterOrValidateText(getEmpPracticesLiability_TXT_CItyCode(strEmpPracticesLiability_TXT_CItyCode),strEmpPracticesLiability_TXT_CItyCode,test);
			se.element().checkUncheckOrValidate(getEmpPracticesLiability_CHK_ALLCountyName(strEmpPracticesLiability_CHK_ALLCountyName),strEmpPracticesLiability_CHK_ALLCountyName,test);
			if(!strEmpPracticesLiability_TXT_County.equalsIgnoreCase(constants.NA) && !strEmpPracticesLiability_TXT_County.contains(constants.Validate)){
				se.element().clickSearchIcon(getEmpPracticesLiability_BTN_County(), test);
				se.element().Click(getEmpPracticesLiability_LNK_County(strEmpPracticesLiability_TXT_County), test);
			}else{	
			se.element().enterOrValidateText(getEmpPracticesLiability_TXT_County(strEmpPracticesLiability_TXT_County),strEmpPracticesLiability_TXT_County,test);
			}
			se.element().enterOrValidateText(getEmpPracticesLiability_TXT_CountyCode(strEmpPracticesLiability_TXT_CountyCode),strEmpPracticesLiability_TXT_CountyCode,test);
			se.element().enterOrValidateText(getEmpPracticesLiability_TXT_TaxCode(strEmpPracticesLiability_TXT_TaxCode),strEmpPracticesLiability_TXT_TaxCode,test);
			
			
			
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CP_EmploymentPracticesLiabilityInsurancePage", true, false, true, test);
			
}

}

	public void CP_EmployPracLiabInsPage(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase(constants.EmpPracticesLiability)){
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.EmpPracticesLiability, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		try{
			
			String strEmpPracticesLiability_BTN_Next=(String) row.get("EmpPracticesLiability_BTN_Next");
			CP_EmploymentPracticesLiabilityInsurancePage EPLIPage = TestPageFactory.initElements(se, CP_EmploymentPracticesLiabilityInsurancePage.class);
			EPLIPage.CP_EmployPracLiabInsPage_GenInfo(row, test);
			EPLIPage.CP_EmployPracLiabInsPage_TaxInfo(row, test);
			if(strEmpPracticesLiability_BTN_Next.equalsIgnoreCase(constants.Yes)){
				se.element().Click(getNext(),test);
			}
			
		
	}catch(Exception e){
		se.verify().verifyEquals("Failed to fill in details for CP_EmploymentPracticesLiabilityInsurancePage", true, false, true, test);
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
}

