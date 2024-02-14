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

public class CA_PhysicalDamageExperienceRating extends OR_CA{
	
	public void PhysicalDamageExperienceRating(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		try{
		
		if(suspendSheet.equalsIgnoreCase(constants.CA_PhysicalDamageExperienceRating)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_PhysicalDamageExperienceRating, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				
			String strPhysicalDamageExperienceRating_CHK_NoClaims = (String) row.get("PhysicalDamageExperienceRating_CHK_NoClaims");
			String strPhysicalDamageExperienceRating_CHK_LossRunsAreNotAvailableAtThisTime = (String) row.get("PhysicalDamageExperienceRating_CHK_LossRunsAreNotAvailableAtThisTime");
			String strPhysicalDamageExperienceRating_CHK_LossExperienceSelectRowNum = (String) row.get("PhysicalDamageExperienceRating_CHK_LossExperienceSelectRowNum");
			String strPhysicalDamageExperienceRating_BTN_LossExperienceAdd = (String) row.get("PhysicalDamageExperienceRating_BTN_LossExperienceAdd");
			String strPhysicalDamageExperienceRating_TXT_LossPeriod = (String) row.get("PhysicalDamageExperienceRating_TXT_LossPeriod");
			String strPhysicalDamageExperienceRating_TXT_LossPeriodFilterNeeded = (String) row.get("PhysicalDamageExperienceRating_TXT_LossPeriodFilterNeeded");
			String strPhysicalDamageExperienceRating_TXT_DateofLoss = (String) row.get("PhysicalDamageExperienceRating_TXT_DateofLoss");
			String strPhysicalDamageExperienceRating_TXT_IncurredLossAmount = (String) row.get("PhysicalDamageExperienceRating_TXT_IncurredLossAmount");
			String strPhysicalDamageExperienceRating_TXT_SubjectLoss = (String) row.get("PhysicalDamageExperienceRating_TXT_SubjectLoss");
			String strPhysicalDamageExperienceRating_BTN_UpdateFactors = (String) row.get("PhysicalDamageExperienceRating_BTN_UpdateFactors");
			String strTestDescription = (String) row.get("Transaction Name");
			try{
				se.log().logTestStep("CA_PhysicalDamageExperienceRating");
				test.log(LogStatus.INFO, "CA_PhysicalDamageExperienceRating page","Transaction Step : "+strTestDescription + "<br>" +"Page : CA_PhysicalDamageExperienceRating");
				se.verify().verifyEquals("CA_PhysicalDamageExperienceRating Page of PowerWriter ", getCA_PhysicalDamageExperienceRating_LabelName().isDisplayed(),true, true,test);
				
				se.element().checkUncheckOrValidate(getPhysicalDamageExperienceRating_CHK_NoClaims(strPhysicalDamageExperienceRating_CHK_NoClaims),strPhysicalDamageExperienceRating_CHK_NoClaims,test);
				se.element().checkUncheckOrValidate(getPhysicalDamageExperienceRating_CHK_LossRunsAreNotAvailableAtThisTime(strPhysicalDamageExperienceRating_CHK_LossRunsAreNotAvailableAtThisTime),strPhysicalDamageExperienceRating_CHK_LossRunsAreNotAvailableAtThisTime,test);
				se.element().checkUncheckOrValidate(getPhysicalDamageExperienceRating_CHK_LossExperienceSelectRowNum(strPhysicalDamageExperienceRating_CHK_LossExperienceSelectRowNum),strPhysicalDamageExperienceRating_CHK_LossExperienceSelectRowNum,test);
				
				if(!strPhysicalDamageExperienceRating_BTN_LossExperienceAdd.equalsIgnoreCase(constants.NA)){
					se.element().Click(getPhysicalDamageExperienceRating_BTN_LossExperienceAdd(strPhysicalDamageExperienceRating_BTN_LossExperienceAdd),strPhysicalDamageExperienceRating_BTN_LossExperienceAdd,test);
					}
				se.element().selectPopupWithMagnifier(getPhysicalDamageExperienceRating_TXT_LossPeriod(strPhysicalDamageExperienceRating_TXT_LossPeriod),getPhysicalDamageExperienceRating_TXT_LossPeriodSearch(strPhysicalDamageExperienceRating_TXT_LossPeriod),strPhysicalDamageExperienceRating_TXT_LossPeriod,strPhysicalDamageExperienceRating_TXT_LossPeriodFilterNeeded,strPhysicalDamageExperienceRating_TXT_LossPeriod, constants.NA, constants.NA,constants.NA,test);
				se.element().enterOrValidateText(getPhysicalDamageExperienceRating_TXT_DateofLoss(strPhysicalDamageExperienceRating_TXT_DateofLoss),strPhysicalDamageExperienceRating_TXT_DateofLoss,test);
				se.element().enterOrValidateText(getPhysicalDamageExperienceRating_TXT_IncurredLossAmount(strPhysicalDamageExperienceRating_TXT_IncurredLossAmount),strPhysicalDamageExperienceRating_TXT_IncurredLossAmount,test);
				se.element().enterOrValidateText(getPhysicalDamageExperienceRating_TXT_SubjectLoss(strPhysicalDamageExperienceRating_TXT_SubjectLoss),strPhysicalDamageExperienceRating_TXT_SubjectLoss,test);
				se.element().Click(getPhysicalDamageExperienceRating_BTN_UpdateFactors(strPhysicalDamageExperienceRating_BTN_UpdateFactors),strPhysicalDamageExperienceRating_BTN_UpdateFactors,test);
				
				if(!strPhysicalDamageExperienceRating_CHK_LossExperienceSelectRowNum.equalsIgnoreCase(constants.NA))
				{
					se.element().checkUncheckOrValidate(getPhysicalDamageExperienceRating_CHK_LossExperienceSelectRowNum(strPhysicalDamageExperienceRating_CHK_LossExperienceSelectRowNum),strPhysicalDamageExperienceRating_CHK_LossExperienceSelectRowNum,test);
					se.element().Click(getLiabilityExperienceRating_BTN_LossExperienceRemove(),test);
					
				}
				se.element().clickElement(getNext());
				se.util().sleep(2000);
				
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for CA_PhysicalDamageExperienceRating ", true, false, true, test);
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
		
