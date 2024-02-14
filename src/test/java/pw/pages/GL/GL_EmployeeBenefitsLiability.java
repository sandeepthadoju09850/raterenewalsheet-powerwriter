package pw.pages.GL;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_GL;

public class GL_EmployeeBenefitsLiability extends OR_GL{
	
	public void GL_EmployeeBenefitsLiability_Details(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase("GL_EmployeeBenefitsLiability")){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData("GL_EmployeeBenefitsLiability", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strGL_EmployeeBenefitsLiability_TXT_EachEmployeeLimit_EBL = (String) row.get("GL_EmployeeBenefitsLiability_TXT_EachEmployeeLimit(EBL)");
				String strGL_EmployeeBenefitsLiability_TXT_EachEmployeeLimit_EBLPopup = (String) row.get("GL_EmployeeBenefitsLiability_TXT_AggregateLimit(EBL)Popup");
				String strGL_EmployeeBenefitsLiability_TXT_AggregateLimit_EBL = (String) row.get("GL_EmployeeBenefitsLiability_TXT_AggregateLimit(EBL)");
				String strGL_EmployeeBenefitsLiability_TXT_EachEmployeeDeductible_EBL = (String) row.get("GL_EmployeeBenefitsLiability_TXT_EachEmployeeDeductible(EBL)");
				String strGL_EmployeeBenefitsLiability_CHK_DateSet = (String) row.get("GL_EmployeeBenefitsLiability_CHK_DateSet");
				String strGL_EmployeeBenefitsLiability_CHK_None = (String) row.get("GL_EmployeeBenefitsLiability_CHK_None");
				String strGL_EmployeeBenefitsLiability_TXT_RetroactiveDate = (String) row.get("GL_EmployeeBenefitsLiability_TXT_RetroactiveDate");
				String strGL_EmployeeBenefitsLiability_TXT_NumberOfEmployees = (String) row.get("GL_EmployeeBenefitsLiability_TXT_NumberOfEmployees");
		try{
				se.log().logTestStep("GL_EmployeeBenefitsLiability_Details");
				test.log(LogStatus.INFO, "GL_EmployeeBenefitsLiability_Details page","Transaction Step : "+transaction + "<br>" +"Page : GL_EmployeeBenefitsLiability_Details");
				se.verify().verifyEquals("GL_EmployeeBenefitsLiability_Details Page of PowerWriter ", getGL_EmployeeBenefitsLiability_TXT_Header().isDisplayed(),true, true,test);
				se.element().selectPopupWithMagnifier(getGL_EmployeeBenefitsLiability_TXT_EachEmployeeLimit_EBL(strGL_EmployeeBenefitsLiability_TXT_EachEmployeeLimit_EBL), getGL_EmployeeBenefitsLiability_BTN_EachEmployeeLimit_EBLSearch(strGL_EmployeeBenefitsLiability_TXT_EachEmployeeLimit_EBL), strGL_EmployeeBenefitsLiability_TXT_EachEmployeeLimit_EBL, constants.NA, strGL_EmployeeBenefitsLiability_TXT_EachEmployeeLimit_EBL, strGL_EmployeeBenefitsLiability_TXT_EachEmployeeLimit_EBLPopup, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getGL_EmployeeBenefitsLiability_TXT_AggregateLimit_EBL(strGL_EmployeeBenefitsLiability_TXT_AggregateLimit_EBL),strGL_EmployeeBenefitsLiability_TXT_AggregateLimit_EBL,test);
				se.element().enterOrValidateText(getGL_EmployeeBenefitsLiability_TXT_EachEmployeeDeductible_EBL(strGL_EmployeeBenefitsLiability_TXT_EachEmployeeDeductible_EBL),strGL_EmployeeBenefitsLiability_TXT_EachEmployeeDeductible_EBL,test);
				se.element().checkUncheckOrValidate(getGL_EmployeeBenefitsLiability_CHK_DateSet(strGL_EmployeeBenefitsLiability_CHK_DateSet),strGL_EmployeeBenefitsLiability_CHK_DateSet,test);
				se.element().checkUncheckOrValidate(getGL_EmployeeBenefitsLiability_CHK_None(strGL_EmployeeBenefitsLiability_CHK_None),strGL_EmployeeBenefitsLiability_CHK_None,test);
				se.element().enterOrValidateText(getGL_EmployeeBenefitsLiability_TXT_RetroactiveDate(strGL_EmployeeBenefitsLiability_TXT_RetroactiveDate),strGL_EmployeeBenefitsLiability_TXT_RetroactiveDate,test);
				se.element().enterOrValidateText(getGL_EmployeeBenefitsLiability_TXT_NumberOfEmployees(strGL_EmployeeBenefitsLiability_TXT_NumberOfEmployees),strGL_EmployeeBenefitsLiability_TXT_NumberOfEmployees,test);
				se.element().clickElement(getNext());
				
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for GL_EmployeeBenefitsLiability_Details ", true, false, true, test);
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
