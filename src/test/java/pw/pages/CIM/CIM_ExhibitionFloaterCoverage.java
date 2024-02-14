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

public class CIM_ExhibitionFloaterCoverage extends OR_CIM{
	
	public void ExhibitionFloaterCoverage(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_ExhibitionFloaterCoverage")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_ExhibitionFloaterCoverage", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCIM_ExhibitionFloaterCoverage_TXT_AnyOneOccurenceLimit = (String) row.get("CIM_ExhibitionFloaterCoverage_TXT_AnyOneOccurenceLimit");
		String strCIM_ExhibitionFloaterCoverage_TXT_AnyOnePremisesLimit = (String) row.get("CIM_ExhibitionFloaterCoverage_TXT_AnyOnePremisesLimit");
		String strCIM_ExhibitionFloaterCoverage_TXT_AdditionalDebrisRemovalExpenseLimit = (String) row.get("CIM_ExhibitionFloaterCoverage_TXT_AdditionalDebrisRemovalExpenseLimit");
		String strCIM_ExhibitionFloaterCoverage_TXT_PollutantCleanupAndRemovalLimit = (String) row.get("CIM_ExhibitionFloaterCoverage_TXT_PollutantCleanupAndRemovalLimit");
		String strCIM_ExhibitionFloaterCoverage_TXT_AdditionalInformation = (String) row.get("CIM_ExhibitionFloaterCoverage_TXT_AdditionalInformation");
		String strCIM_ExhibitionFloaterCoverage_CHK_OverrideBaseRate_Yes = (String) row.get("CIM_ExhibitionFloaterCoverage_CHK_OverrideBaseRate_Yes");
		String strCIM_ExhibitionFloaterCoverage_CHK_OverrideBaseRate_No = (String) row.get("CIM_ExhibitionFloaterCoverage_CHK_OverrideBaseRate_No");
		String strCIM_ExhibitionFloaterCoverage_TXT_OverrideReason = (String) row.get("CIM_ExhibitionFloaterCoverage_TXT_OverrideReason");
		String strCIM_ExhibitionFloaterCoverage_TXT_OverrideReasonFilterNeeded = (String) row.get("CIM_ExhibitionFloaterCoverage_TXT_OverrideReasonFilterNeeded");
		String strCIM_ExhibitionFloaterCoverage_TXT_BaseRate = (String) row.get("CIM_ExhibitionFloaterCoverage_TXT_BaseRate");
		String strCIM_ExhibitionFloaterCoverage_TXT_BaseRateOverride = (String) row.get("CIM_ExhibitionFloaterCoverage_TXT_BaseRateOverride");
		String strCIM_ExhibitionFloaterCoverage_TXT_TransitionFactor = (String) row.get("CIM_ExhibitionFloaterCoverage_TXT_TransitionFactor");
		String strCIM_ExhibitionFloaterCoverage_TXT_FinalRate = (String) row.get("CIM_ExhibitionFloaterCoverage_TXT_FinalRate");
		String strCIM_ExhibitionFloaterCoverage_TXT_OverrideFinalRate = (String) row.get("CIM_ExhibitionFloaterCoverage_TXT_OverrideFinalRate");
		String strCIM_ExhibitionFloaterCoverage_TXT_OccurenceLimit = (String) row.get("CIM_ExhibitionFloaterCoverage_TXT_OccurenceLimit");
		String strCIM_ExhibitionFloaterCoverage_TXT_Premium = (String) row.get("CIM_ExhibitionFloaterCoverage_TXT_Premium");
		String strCIM_ExhibitionFloaterCoverage_TXT_OverridePremium = (String) row.get("CIM_ExhibitionFloaterCoverage_TXT_OverridePremium");
		
		
		try{
			se.log().logTestStep("ExhibitionFloaterCoverage");
			test.log(LogStatus.INFO, "ExhibitionFloaterCoverage page","Transaction Step : "+transaction + "<br>" +"Page : ExhibitionFloaterCoverage");
			se.verify().verifyEquals("ExhibitionFloaterCoverage page of PowerWriter ", getCIM_ExhibitionFloaterCoverage_TXT_VerifyExhibitionFloaterCoverageText().isDisplayed(),true, true,test);
			
			se.element().enterOrValidateText(getCIM_ExhibitionFloaterCoverage_TXT_AnyOneOccurenceLimit(strCIM_ExhibitionFloaterCoverage_TXT_AnyOneOccurenceLimit),strCIM_ExhibitionFloaterCoverage_TXT_AnyOneOccurenceLimit,test);
			se.element().enterOrValidateText(getCIM_ExhibitionFloaterCoverage_TXT_AnyOnePremisesLimit(strCIM_ExhibitionFloaterCoverage_TXT_AnyOnePremisesLimit),strCIM_ExhibitionFloaterCoverage_TXT_AnyOnePremisesLimit,test);
			se.element().enterOrValidateText(getCIM_ExhibitionFloaterCoverage_TXT_AdditionalDebrisRemovalExpenseLimit(strCIM_ExhibitionFloaterCoverage_TXT_AdditionalDebrisRemovalExpenseLimit),strCIM_ExhibitionFloaterCoverage_TXT_AdditionalDebrisRemovalExpenseLimit,test);
			se.element().enterOrValidateText(getCIM_ExhibitionFloaterCoverage_TXT_PollutantCleanupAndRemovalLimit(strCIM_ExhibitionFloaterCoverage_TXT_PollutantCleanupAndRemovalLimit),strCIM_ExhibitionFloaterCoverage_TXT_PollutantCleanupAndRemovalLimit,test);
			
			if(se.element().isElementPresent(InfoOKbutton)){
				se.element().Click(getInfoOKbutton(), test);
				se.element().enterOrValidateText(getCIM_ExhibitionFloaterCoverage_TXT_PollutantCleanupAndRemovalLimit(strCIM_ExhibitionFloaterCoverage_TXT_PollutantCleanupAndRemovalLimit),strCIM_ExhibitionFloaterCoverage_TXT_PollutantCleanupAndRemovalLimit,test);
				if(se.element().isElementPresent(InfoOKbutton)){
					se.element().Click(getInfoOKbutton(), test);
				}
			}
			
			se.element().enterOrValidateText(getCIM_ExhibitionFloaterCoverage_TXT_AdditionalInformation(strCIM_ExhibitionFloaterCoverage_TXT_AdditionalInformation),strCIM_ExhibitionFloaterCoverage_TXT_AdditionalInformation,test);
			se.element().checkUncheckOrValidate(getCIM_ExhibitionFloaterCoverage_CHK_OverrideBaseRate_Yes(strCIM_ExhibitionFloaterCoverage_CHK_OverrideBaseRate_Yes),strCIM_ExhibitionFloaterCoverage_CHK_OverrideBaseRate_Yes,test);
			se.element().checkUncheckOrValidate(getCIM_ExhibitionFloaterCoverage_CHK_OverrideBaseRate_No(strCIM_ExhibitionFloaterCoverage_CHK_OverrideBaseRate_No),strCIM_ExhibitionFloaterCoverage_CHK_OverrideBaseRate_No,test);
			se.element().selectPopupWithMagnifier(getCIM_ExhibitionFloaterCoverage_TXT_OverrideReason(strCIM_ExhibitionFloaterCoverage_TXT_OverrideReason), getCIM_ExhibitionFloaterCoverage_BTN_OverrideReasonSearch(strCIM_ExhibitionFloaterCoverage_TXT_OverrideReason), strCIM_ExhibitionFloaterCoverage_TXT_OverrideReason,strCIM_ExhibitionFloaterCoverage_TXT_OverrideReasonFilterNeeded, strCIM_ExhibitionFloaterCoverage_TXT_OverrideReason,constants.NA, constants.NA, constants.NA, test);
    		se.element().enterOrValidateText(getCIM_ExhibitionFloaterCoverage_TXT_BaseRate(strCIM_ExhibitionFloaterCoverage_TXT_BaseRate),strCIM_ExhibitionFloaterCoverage_TXT_BaseRate,test);
			se.element().enterOrValidateText(getCIM_ExhibitionFloaterCoverage_TXT_BaseRateOverride(strCIM_ExhibitionFloaterCoverage_TXT_BaseRateOverride),strCIM_ExhibitionFloaterCoverage_TXT_BaseRateOverride,test);
			se.element().enterOrValidateText(getCIM_ExhibitionFloaterCoverage_TXT_TransitionFactor(strCIM_ExhibitionFloaterCoverage_TXT_TransitionFactor),strCIM_ExhibitionFloaterCoverage_TXT_TransitionFactor,test);
			se.element().enterOrValidateText(getCIM_ExhibitionFloaterCoverage_TXT_FinalRate(strCIM_ExhibitionFloaterCoverage_TXT_FinalRate),strCIM_ExhibitionFloaterCoverage_TXT_FinalRate,test);
			se.element().enterOrValidateText(getCIM_ExhibitionFloaterCoverage_TXT_OverrideFinalRate(strCIM_ExhibitionFloaterCoverage_TXT_OverrideFinalRate),strCIM_ExhibitionFloaterCoverage_TXT_OverrideFinalRate,test);
			se.element().enterOrValidateText(getCIM_ExhibitionFloaterCoverage_TXT_OccurenceLimit(strCIM_ExhibitionFloaterCoverage_TXT_OccurenceLimit),strCIM_ExhibitionFloaterCoverage_TXT_OccurenceLimit,test);
			se.element().enterOrValidateText(getCIM_ExhibitionFloaterCoverage_TXT_Premium(strCIM_ExhibitionFloaterCoverage_TXT_Premium),strCIM_ExhibitionFloaterCoverage_TXT_Premium,test);
			se.element().enterOrValidateText(getCIM_ExhibitionFloaterCoverage_TXT_OverridePremium(strCIM_ExhibitionFloaterCoverage_TXT_OverridePremium),strCIM_ExhibitionFloaterCoverage_TXT_OverridePremium,test);
			se.element().Click(getNext(),test);
		
	}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for ExhibitionFloaterCoverage", true, false, true, test);
			
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