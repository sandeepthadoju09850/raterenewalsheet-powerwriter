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

public class GL_OCPLiability extends OR_GL{
	public void OCPLiability(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase("GL_OCP_Liability")){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData("GL_OCP_Liability", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strGL_OCP_Liability_TXT_DesignatedContractor = (String) row.get("GL_OCP_Liability_TXT_DesignatedContractor");
		String strGL_OCP_Liability_TXT_Street = (String) row.get("GL_OCP_Liability_TXT_Street");
		String strGL_OCP_Liability_TXT_SteUnit = (String) row.get("GL_OCP_Liability_TXT_SteUnit");
		String strGL_OCP_Liability_TXT_City = (String) row.get("GL_OCP_Liability_TXT_City");
		String strGL_OCP_Liability_TXT_State = (String) row.get("GL_OCP_Liability_TXT_State");
		String strGL_OCP_Liability_TXT_Zip = (String) row.get("GL_OCP_Liability_TXT_Zip");
		String strGL_OCP_Liability_CHK_ConsProjMgmtProtPolicy_Yes = (String) row.get("GL_OCP_Liability_CHK_ConsProjMgmtProtPolicy_Yes");
		String strGL_OCP_Liability_CHK_ConsProjMgmtProtPolicy_No = (String) row.get("GL_OCP_Liability_CHK_ConsProjMgmtProtPolicy_No");
		String strGL_OCP_Liability_CHK_CoverageForm_OwnersContractors = (String) row.get("GL_OCP_Liability_CHK_CoverageForm_OwnersContractors");
		String strGL_OCP_Liability_CHK_CoverageForm_Principals = (String) row.get("GL_OCP_Liability_CHK_CoverageForm_Principals");
		String strGL_OCP_Liability_CHK_CoverageForm_ConstructionProjectManagement = (String) row.get("GL_OCP_Liability_CHK_CoverageForm_ConstructionProjectManagement");
		String strGL_OCP_Liability_TXT_EachOccurenceLimit = (String) row.get("GL_OCP_Liability_TXT_EachOccurenceLimit");
		String strGL_OCP_Liability_TXT_EachOccurenceLimitFilterNeeded = (String) row.get("GL_OCP_Liability_TXT_EachOccurenceLimitFilterNeeded");
		
		String strGL_OCP_Liability_TXT_AggregateLimit = (String) row.get("GL_OCP_Liability_TXT_AggregateLimit");
		String strGL_OCP_Liability_TXT_AggregateLimitFilterNeeded = (String) row.get("GL_OCP_Liability_TXT_AggregateLimitFilterNeeded");
		
		
		try{
			se.log().logTestStep("GL_OCPLiability");
			test.log(LogStatus.INFO, "GL_OCPLiability","Transaction Step : "+ transaction + "<br>" +"Page : GL_OCPLiability"  + "<br>" +"Section: GL_OCPLiability");
			
			se.verify().verifyEquals("GL_OCPLiability of PowerWriter ", getGL_OCPLiability_TXT_VerifyOCPLiabilityText().isDisplayed(),true, true,test);
			se.element().enterOrValidateText(getGL_OCP_Liability_TXT_DesignatedContractor(strGL_OCP_Liability_TXT_DesignatedContractor),strGL_OCP_Liability_TXT_DesignatedContractor,test);
			se.element().enterOrValidateText(getGL_OCP_Liability_TXT_Street(strGL_OCP_Liability_TXT_Street),strGL_OCP_Liability_TXT_Street,test);
			se.element().enterOrValidateText(getGL_OCP_Liability_TXT_SteUnit(strGL_OCP_Liability_TXT_SteUnit),strGL_OCP_Liability_TXT_SteUnit,test);
			se.element().enterOrValidateText(getGL_OCP_Liability_TXT_City(strGL_OCP_Liability_TXT_City),strGL_OCP_Liability_TXT_City,test);
			se.element().enterOrValidateText(getGL_OCP_Liability_TXT_State(strGL_OCP_Liability_TXT_State),strGL_OCP_Liability_TXT_State,test);
			se.element().enterOrValidateText(getGL_OCP_Liability_TXT_Zip(strGL_OCP_Liability_TXT_Zip),strGL_OCP_Liability_TXT_Zip,test);
			se.element().checkUncheckOrValidate(getGL_OCP_Liability_CHK_ConsProjMgmtProtPolicy_Yes(strGL_OCP_Liability_CHK_ConsProjMgmtProtPolicy_Yes),strGL_OCP_Liability_CHK_ConsProjMgmtProtPolicy_Yes,test);
			se.element().checkUncheckOrValidate(getGL_OCP_Liability_CHK_ConsProjMgmtProtPolicy_No(strGL_OCP_Liability_CHK_ConsProjMgmtProtPolicy_No),strGL_OCP_Liability_CHK_ConsProjMgmtProtPolicy_No,test);
			se.element().checkUncheckOrValidate(getGL_OCP_Liability_CHK_CoverageForm_OwnersContractors(strGL_OCP_Liability_CHK_CoverageForm_OwnersContractors),strGL_OCP_Liability_CHK_CoverageForm_OwnersContractors,test);
			se.element().checkUncheckOrValidate(getGL_OCP_Liability_CHK_CoverageForm_Principals(strGL_OCP_Liability_CHK_CoverageForm_Principals),strGL_OCP_Liability_CHK_CoverageForm_Principals,test);
			se.element().checkUncheckOrValidate(getGL_OCP_Liability_CHK_CoverageForm_ConstructionProjectManagement(strGL_OCP_Liability_CHK_CoverageForm_ConstructionProjectManagement),strGL_OCP_Liability_CHK_CoverageForm_ConstructionProjectManagement,test);
			se.element().selectPopupWithMagnifier(getGL_OCP_Liability_TXT_EachOccurenceLimit(strGL_OCP_Liability_TXT_EachOccurenceLimit), getGL_OCP_Liability_TXT_EachOccurenceLimitSearch(strGL_OCP_Liability_TXT_EachOccurenceLimit), strGL_OCP_Liability_TXT_EachOccurenceLimit, strGL_OCP_Liability_TXT_EachOccurenceLimitFilterNeeded, strGL_OCP_Liability_TXT_EachOccurenceLimit, constants.NA, constants.NA, constants.NA, test);
			se.element().selectPopupWithMagnifier(getGL_OCP_Liability_TXT_AggregateLimit(strGL_OCP_Liability_TXT_AggregateLimit), getGL_OCP_Liability_TXT_AggregateLimitSearch(strGL_OCP_Liability_TXT_AggregateLimit), strGL_OCP_Liability_TXT_AggregateLimit, strGL_OCP_Liability_TXT_EachOccurenceLimitFilterNeeded, strGL_OCP_Liability_TXT_AggregateLimit, constants.NA, constants.NA, constants.NA, test);
			se.element().Click(getNext(),test);
		
			}catch(Exception e){
				se.verify().verifyEquals("Failed to fill in details for GL_OCPLiability", true, false, true, test);
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
