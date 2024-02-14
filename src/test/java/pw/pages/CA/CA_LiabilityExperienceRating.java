package pw.pages.CA;

/**
 * @author ${pr09529}
 */

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

public class CA_LiabilityExperienceRating extends OR_CA{
	
	public void LiabilityExperienceRating(String strRegressionID, String transaction ,String suspendSheet, ExtentTest test) throws IOException {
		try{
			
		if(suspendSheet.equalsIgnoreCase(constants.CA_LiabilityExperienceRating)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_LiabilityExperienceRating, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				
			String strLiabilityExperienceRating_CHK_NoClaims = (String) row.get("LiabilityExperienceRating_CHK_NoClaims");
			String strLiabilityExperienceRating_CHK_LossRunsAreNotAvailableAtThisTime = (String) row.get("LiabilityExperienceRating_CHK_LossRunsAreNotAvailableAtThisTime");
			String strLiabilityExperienceRating_CHK_ReorderLosses = (String) row.get("LiabilityExperienceRating_CHK_ReorderLosses");
			String strLiabilityExperienceRating_CHK_LossExperienceSelectRowNum = (String) row.get("LiabilityExperienceRating_CHK_LossExperienceSelectRowNum");
			String strLiabilityExperienceRating_BTN_LossExperienceAdd = (String) row.get("LiabilityExperienceRating_BTN_LossExperienceAdd");
			String strLiabilityExperienceRating_TXT_LossPeriod = (String) row.get("LiabilityExperienceRating_TXT_LossPeriod");
			String strLiabilityExperienceRating_TXT_LossPeriodFilterNeeded = (String) row.get("LiabilityExperienceRating_TXT_LossPeriodFilterNeeded");
			String strLiabilityExperienceRating_TXT_DateofLoss = (String) row.get("LiabilityExperienceRating_TXT_DateofLoss");
			String strLiabilityExperienceRating_TXT_IncurredLossAmount = (String) row.get("LiabilityExperienceRating_TXT_IncurredLossAmount");
			String strLiabilityExperienceRating_TXT_BasicLoss = (String) row.get("LiabilityExperienceRating_TXT_BasicLoss");
			String strLiabilityExperienceRating_TXT_ALAE_Expenses = (String) row.get("LiabilityExperienceRating_TXT_ALAE_Expenses");
			String strLiabilityExperienceRating_TXT_SubjectLoss = (String) row.get("LiabilityExperienceRating_TXT_SubjectLoss");
			String strLiabilityExperienceRating_BTN_UpdateFactors = (String) row.get("LiabilityExperienceRating_BTN_UpdateFactors");
			
			String strTestDescription = (String) row.get("Transaction Name");
			try{
				se.log().logTestStep("CA_LiabilityExperienceRating");
				test.log(LogStatus.INFO, "CA_LiabilityExperienceRating page","Transaction Step : "+strTestDescription + "<br>" +"Page : CA_LiabilityExperienceRating");
				se.verify().verifyEquals("CA_LiabilityExperienceRating Page of PowerWriter ", getCA_LiabilityExperienceRating_LabelName().isDisplayed(),true, true,test);
				
				se.element().checkUncheckOrValidate(getLiabilityExperienceRating_CHK_NoClaims(strLiabilityExperienceRating_CHK_NoClaims),strLiabilityExperienceRating_CHK_NoClaims,test);
				se.element().checkUncheckOrValidate(getLiabilityExperienceRating_CHK_LossRunsAreNotAvailableAtThisTime(strLiabilityExperienceRating_CHK_LossRunsAreNotAvailableAtThisTime),strLiabilityExperienceRating_CHK_LossRunsAreNotAvailableAtThisTime,test);
				se.element().checkUncheckOrValidate(getLiabilityExperienceRating_CHK_ReorderLosses(strLiabilityExperienceRating_CHK_ReorderLosses),strLiabilityExperienceRating_CHK_ReorderLosses,test);
				
				if(!strLiabilityExperienceRating_BTN_LossExperienceAdd.equalsIgnoreCase(constants.NA)){
					se.element().Click(getLiabilityExperienceRating_BTN_LossExperienceAdd(strLiabilityExperienceRating_BTN_LossExperienceAdd),strLiabilityExperienceRating_BTN_LossExperienceAdd,test);
					}
				se.element().selectPopupWithMagnifier(getLiabilityExperienceRating_TXT_LossPeriod(strLiabilityExperienceRating_TXT_LossPeriod),getLiabilityExperienceRating_TXT_LossPeriodSearch(strLiabilityExperienceRating_TXT_LossPeriod),strLiabilityExperienceRating_TXT_LossPeriod,strLiabilityExperienceRating_TXT_LossPeriodFilterNeeded,strLiabilityExperienceRating_TXT_LossPeriod, constants.NA, constants.NA,constants.NA,test);
				se.element().enterOrValidateText(getLiabilityExperienceRating_TXT_DateofLoss(strLiabilityExperienceRating_TXT_DateofLoss),strLiabilityExperienceRating_TXT_DateofLoss,test);
				se.element().enterOrValidateText(getLiabilityExperienceRating_TXT_IncurredLossAmount(strLiabilityExperienceRating_TXT_IncurredLossAmount),strLiabilityExperienceRating_TXT_IncurredLossAmount,test);
				se.element().enterOrValidateText(getLiabilityExperienceRating_TXT_BasicLoss(strLiabilityExperienceRating_TXT_BasicLoss),strLiabilityExperienceRating_TXT_BasicLoss,test);
				se.element().enterOrValidateText(getLiabilityExperienceRating_TXT_ALAE_Expenses(strLiabilityExperienceRating_TXT_ALAE_Expenses),strLiabilityExperienceRating_TXT_ALAE_Expenses,test);
				se.element().enterOrValidateText(getLiabilityExperienceRating_TXT_SubjectLoss(strLiabilityExperienceRating_TXT_SubjectLoss),strLiabilityExperienceRating_TXT_SubjectLoss,test);
				se.element().Click(getLiabilityExperienceRating_BTN_UpdateFactors(strLiabilityExperienceRating_BTN_UpdateFactors),strLiabilityExperienceRating_BTN_UpdateFactors,test);
				if(!strLiabilityExperienceRating_CHK_LossExperienceSelectRowNum.equalsIgnoreCase(constants.NA))
				{
					se.element().checkUncheckOrValidate(getLiabilityExperienceRating_CHK_LossExperienceSelectRowNum(strLiabilityExperienceRating_CHK_LossExperienceSelectRowNum),strLiabilityExperienceRating_CHK_LossExperienceSelectRowNum,test);
					se.element().Click(getLiabilityExperienceRating_BTN_LossExperienceRemove(),test);
				}
				
				se.element().clickElement(getNext());
				se.util().sleep(2000);
				
				
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for CA_LiabilityExperienceRating ", true, false, true, test);
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
		
