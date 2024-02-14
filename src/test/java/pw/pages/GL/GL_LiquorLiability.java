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

public class GL_LiquorLiability extends OR_GL{
	
	public void GL_LiquorLiability_Details(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase(constants.GL_LiqourLiability)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.GL_LiqourLiability, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strGL_LiqourLiability_TXT_EachCommonCauseLimit_LLL = (String) row.get("GL_LiqourLiability_TXT_EachCommonCauseLimit(LLL)");
			String strGL_LiqourLiability_TXT_AggregateLimit_LLL = (String) row.get("GL_LiqourLiability_TXT_AggregateLimit(LLL)");
			String strGL_LiqourLiability_CHK_DeductibleLiabIns = (String) row.get("GL_LiqourLiability_CHK_DeductibleLiabIns");
			String strGL_LiqourLiability_CHK_DeductibleApp_Occurrence = (String) row.get("GL_LiqourLiability_CHK_DeductibleApplicationOccurence");
			String strGL_LiqourLiability_CHK_DeductibleApp_Claim = (String) row.get("GL_LiqourLiability_CHK_DeductibleApplicationOccurence");
			String strGL_LiqourLiability_TXT_PerClaimDeductible = (String) row.get("GL_LiqourLiability_TXT_PerClaimDeductible");
			
			try{
				se.log().logTestStep("GL_LiquorLiability");
				test.log(LogStatus.INFO, "GL_LiquorLiability page","Transaction Step : "+transaction + "<br>" +"Page : GL_LiquorLiability");
				se.verify().verifyEquals("GL_LiquorLiability_Details Page of PowerWriter ", getGL_LiquorLiability_TXT_EachCommonCauseLimit_LLL(strGL_LiqourLiability_TXT_EachCommonCauseLimit_LLL).isDisplayed(),true, true,test);
				se.element().selectPopupWithMagnifier(getGL_LiquorLiability_TXT_EachCommonCauseLimit_LLL(strGL_LiqourLiability_TXT_EachCommonCauseLimit_LLL), getGL_LiquorLiability_TXT_EachCommonCauseLimit_LLLSearch(strGL_LiqourLiability_TXT_EachCommonCauseLimit_LLL), strGL_LiqourLiability_TXT_EachCommonCauseLimit_LLL, constants.NA, strGL_LiqourLiability_TXT_EachCommonCauseLimit_LLL, constants.NA, constants.NA, constants.NA, test);
				se.element().selectPopupWithMagnifier(getGL_LiquorLiability_TXT_AggregateLimit_LLL(strGL_LiqourLiability_TXT_AggregateLimit_LLL), getGL_LiquorLiability_TXT_AggregateLimit_LLLSearch(strGL_LiqourLiability_TXT_AggregateLimit_LLL), strGL_LiqourLiability_TXT_AggregateLimit_LLL, constants.NA, strGL_LiqourLiability_TXT_AggregateLimit_LLL, constants.NA, constants.NA, constants.NA, test);
				se.element().checkUncheckOrValidate(getGL_LiquorLiability_CHK_DeductibleLiabIns(strGL_LiqourLiability_CHK_DeductibleLiabIns),strGL_LiqourLiability_CHK_DeductibleLiabIns,test);
				if(strGL_LiqourLiability_CHK_DeductibleLiabIns.equalsIgnoreCase(constants.Check)){
					se.element().checkUncheckOrValidate(getGL_LiquorLiability_CHK_DeductibleApp_Occurrence(strGL_LiqourLiability_CHK_DeductibleApp_Occurrence),strGL_LiqourLiability_CHK_DeductibleApp_Occurrence,test);
					se.element().checkUncheckOrValidate(getGL_LiquorLiability_CHK_DeductibleApp_Claim(strGL_LiqourLiability_CHK_DeductibleApp_Claim),strGL_LiqourLiability_CHK_DeductibleApp_Claim,test);
					if(!strGL_LiqourLiability_CHK_DeductibleApp_Claim.equals(constants.NA)){
						se.element().selectPopupWithMagnifier(getGL_LiquorLiability_TXT_PerClaimDeductible(strGL_LiqourLiability_TXT_PerClaimDeductible), getGL_LiquorLiability_TXT_PerClaimDeductibleSearch(strGL_LiqourLiability_TXT_PerClaimDeductible), strGL_LiqourLiability_TXT_PerClaimDeductible, constants.NA, strGL_LiqourLiability_TXT_PerClaimDeductible, constants.NA, constants.NA, constants.NA, test);
					} else if(!strGL_LiqourLiability_CHK_DeductibleApp_Occurrence.equals(constants.NA)){
						se.element().selectPopupWithMagnifier(getGL_LiquorLiability_TXT_PerCommonCauseDed(strGL_LiqourLiability_CHK_DeductibleApp_Occurrence), getGL_LiquorLiability_TXT_PerCommonCauseDedSearch(strGL_LiqourLiability_CHK_DeductibleApp_Occurrence), strGL_LiqourLiability_CHK_DeductibleApp_Occurrence, constants.NA, strGL_LiqourLiability_CHK_DeductibleApp_Occurrence, constants.NA, constants.NA, constants.NA, test);
					}
				}
				se.element().clickElement(getNext(),test);
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for GL_LiquorLiability ", true, false, true, test);
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
