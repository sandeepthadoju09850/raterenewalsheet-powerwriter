package pw.pages.COMMON;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_Common;

public class PW_ScheduleRatingIRPM extends OR_Common {

	public void ScheduleRatingIRPM(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase("ScheduleRating_IRPM")){
			 test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData("ScheduleRating_IRPM", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			System.out.println(table.size());
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strScheduleRating_CHK_Apply = (String) row.get("ScheduleRating_CHK_Apply");
		String strScheduleRating_CHK_DoNotApply = (String) row.get("ScheduleRating_CHK_DoNotApply");
		String strScheduleRating_TXT_State = (String) row.get("ScheduleRating_TXT_State");
		String strScheduleRating_TXT_LOB = (String) row.get("ScheduleRating_TXT_LOB");
		String strScheduleRating_TXT_Credit = (String) row.get("ScheduleRating_TXT_Credit");
		String strScheduleRating_TXT_CreditClear = (String) row.get("ScheduleRating_TXT_CreditClear");
		String strScheduleRating_TXT_Debit = (String) row.get("ScheduleRating_TXT_Debit");
		String strScheduleRating_CHK_Jstfy_Prm_Mod_Check_yes = (String) row.get("ScheduleRating_CHK_Jstfy_Prm_Mod_Check_yes");
		String strScheduleRating_CHK_Jstfy_Prm_Mod_Check_No = (String) row.get("ScheduleRating_CHK_Jstfy_Prm_Mod_Check_No");
		String strScheduleRating_TXT_Mngmt_SelectedPercent = (String) row.get("ScheduleRating_TXT_Mngmt_SelectedPercent");
		String strScheduleRating_TXT_Mngmt_Reason = (String) row.get("ScheduleRating_TXT_Mngmt_Reason");
		String strScheduleRating_TXT_Loc_SelectedPercent = (String) row.get("ScheduleRating_TXT_Loc_SelectedPercent");
		String strScheduleRating_TXT_Loc_Reason = (String) row.get("ScheduleRating_TXT_Loc_Reason");
		String strScheduleRating_TXT_BldgFeature_SelectedPercent = (String) row.get("ScheduleRating_TXT_BldgFeature_SelectedPercent");
		String strScheduleRating_TXT_BldgFeature_Reason = (String) row.get("ScheduleRating_TXT_BldgFeature_Reason");
		String strScheduleRating_TXT_PremAndEquip_SelectedPercent = (String) row.get("ScheduleRating_TXT_PremAndEquip_SelectedPercent");
		String strScheduleRating_TXT_PremAndEquip_Reason = (String) row.get("ScheduleRating_TXT_PremAndEquip_Reason");
		String strScheduleRating_TXT_Employees_SelectedPercent = (String) row.get("ScheduleRating_TXT_Employees_SelectedPercent");
		String strScheduleRating_TXT_Employees_Reason = (String) row.get("ScheduleRating_TXT_Employees_Reason");
		String strScheduleRating_TXT_Prot_SelectedPercent = (String) row.get("ScheduleRating_TXT_Prot_SelectedPercent");
		String strScheduleRating_TXT_Prot_Reason = (String) row.get("ScheduleRating_TXT_Prot_Reason");
		String strScheduleRating_TXT_TurnOverRatio_SelectedPercent = (String) row.get("ScheduleRating_TXT_TurnOverRatio_SelectedPercent");
		//String strScheduleRating_TXT_TurnOverRatio_Reason = (String) row.get("ScheduleRating_TXT_TurnOverRatio_Reason");
		String strScheduleRating_TXT_LossHistory_SelectedPercent = (String) row.get("ScheduleRating_TXT_LossHistory_SelectedPercent");
		//String strScheduleRating_TXT_LossHist3Year_Reason = (String) row.get("ScheduleRating_TXT_LossHist3Year_Reason");
		String strScheduleRating_TXT_SalaryRanges_SelectedPercent = (String) row.get("ScheduleRating_TXT_SalaryRanges_SelectedPercent");
		//String strScheduleRating_TXT_SalaryRanges_Reason = (String) row.get("ScheduleRating_TXT_SalaryRanges_Reason");
		String strScheduleRating_TXT_Total_SelectedPercent = (String) row.get("ScheduleRating_TXT_Total_SelectedPercent");
		

		
		try {
			se.log().logTestStep("ScheduleRatingIRPM");
			test.log(LogStatus.INFO, "ScheduleRatingIRPM","Transaction Step : "+ transaction + "<br>" +"Page : ScheduleRatingIRPM");
			
			se.verify().verifyEquals("ScheduleRating Page of PowerWriter ", getScheduleRating_LBL_ScheduleRating("ScheduleRating").isDisplayed(),true, true,test);
			
			se.element().checkUncheckOrValidate(getScheduleRating_CHK_Apply(strScheduleRating_CHK_Apply),strScheduleRating_CHK_Apply,test);
			se.element().checkUncheckOrValidate(getScheduleRating_CHK_DoNotApply(strScheduleRating_CHK_DoNotApply),strScheduleRating_CHK_DoNotApply,test);
			
			if((strScheduleRating_TXT_CreditClear.equalsIgnoreCase("Yes"))){
				
				getScheduleRating_TXT_Credit(strScheduleRating_TXT_CreditClear,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB).clear();
				se.util().sleep(5000);
			}
			se.element().enterOrValidateText(getScheduleRating_TXT_Credit(strScheduleRating_TXT_Credit,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_Credit,test);
			
			
			if(!strScheduleRating_TXT_Debit.equalsIgnoreCase(constants.NA) && !strScheduleRating_TXT_Debit.contains(constants.Validate)){
                se.element().clearTheField(getScheduleRating_TXT_Debit(strScheduleRating_TXT_Debit,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB));
                se.element().enterOrValidateText(getScheduleRating_TXT_Debit(strScheduleRating_TXT_Debit,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_Debit,test);
            }else{
            	se.element().enterOrValidateText(getScheduleRating_TXT_Debit(strScheduleRating_TXT_Debit,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_Debit,test);
            }

			//se.element().enterOrValidateText(getScheduleRating_TXT_Debit(strScheduleRating_TXT_Debit,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_Debit,test);
			
			se.element().checkUncheckOrValidate(getScheduleRating_CHK_Jstfy_Prm_Mod_Check_yes(strScheduleRating_CHK_Jstfy_Prm_Mod_Check_yes,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_CHK_Jstfy_Prm_Mod_Check_yes,test);
			se.element().checkUncheckOrValidate(getScheduleRating_CHK_Jstfy_Prm_Mod_Check_No(strScheduleRating_CHK_Jstfy_Prm_Mod_Check_No,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_CHK_Jstfy_Prm_Mod_Check_No,test);
			
			se.element().enterOrValidateText(getScheduleRating_TXT_Mngmt_SelectedPercent(strScheduleRating_TXT_Mngmt_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_Mngmt_SelectedPercent,test);
			se.element().enterOrValidateText(getScheduleRating_TXT_Employees_SelectedPercent(strScheduleRating_TXT_Employees_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_Employees_SelectedPercent,test);
			
			se.element().enterOrValidateText(getScheduleRating_TXT_Mngmt_Reason(strScheduleRating_TXT_Mngmt_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_Mngmt_Reason,test);
			se.element().enterOrValidateText(getScheduleRating_TXT_Mngmt_Reason(strScheduleRating_TXT_Mngmt_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_Mngmt_Reason,test);
			
			se.element().enterOrValidateText(getScheduleRating_TXT_Loc_SelectedPercent(strScheduleRating_TXT_Loc_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_Loc_SelectedPercent,test);
			se.element().enterOrValidateText(getScheduleRating_TXT_Loc_SelectedPercent(strScheduleRating_TXT_Loc_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_Loc_SelectedPercent,test);
			
			se.element().enterOrValidateText(getScheduleRating_TXT_Loc_Reason(strScheduleRating_TXT_Loc_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_Loc_Reason,test);
			se.element().enterOrValidateText(getScheduleRating_TXT_Loc_Reason(strScheduleRating_TXT_Loc_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_Loc_Reason,test);
			
			se.element().enterOrValidateText(getScheduleRating_TXT_BldgFeature_SelectedPercent(strScheduleRating_TXT_BldgFeature_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_BldgFeature_SelectedPercent,test);
			se.element().enterOrValidateText(getScheduleRating_TXT_BldgFeature_SelectedPercent(strScheduleRating_TXT_BldgFeature_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_BldgFeature_SelectedPercent,test);
			
			se.element().enterOrValidateText(getScheduleRating_TXT_BldgFeature_Reason(strScheduleRating_TXT_BldgFeature_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_BldgFeature_Reason,test);
			se.element().enterOrValidateText(getScheduleRating_TXT_BldgFeature_Reason(strScheduleRating_TXT_BldgFeature_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_BldgFeature_Reason,test);
			
			se.element().enterOrValidateText(getScheduleRating_TXT_PremAndEquip_SelectedPercent(strScheduleRating_TXT_PremAndEquip_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_PremAndEquip_SelectedPercent,test);
			se.element().enterOrValidateText(getScheduleRating_TXT_PremAndEquip_SelectedPercent(strScheduleRating_TXT_PremAndEquip_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_PremAndEquip_SelectedPercent,test);
			
			se.element().enterOrValidateText(getScheduleRating_TXT_PremAndEquip_Reason(strScheduleRating_TXT_PremAndEquip_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_PremAndEquip_Reason,test);
			se.element().enterOrValidateText(getScheduleRating_TXT_PremAndEquip_Reason(strScheduleRating_TXT_PremAndEquip_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_PremAndEquip_Reason,test);
			
			se.element().enterOrValidateText(getScheduleRating_TXT_Employees_SelectedPercent(strScheduleRating_TXT_Employees_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_Employees_SelectedPercent,test);
			se.element().enterOrValidateText(getScheduleRating_TXT_Employees_SelectedPercent(strScheduleRating_TXT_Employees_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_Employees_SelectedPercent,test);
			
			
			se.element().enterOrValidateText(getScheduleRating_TXT_Employees_Reason(strScheduleRating_TXT_Employees_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_Employees_Reason,test);
			se.element().enterOrValidateText(getScheduleRating_TXT_Employees_Reason(strScheduleRating_TXT_Employees_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_Employees_Reason,test);
			
			se.element().enterOrValidateText(getScheduleRating_TXT_Prot_SelectedPercent(strScheduleRating_TXT_Prot_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_Prot_SelectedPercent,test);
			se.element().enterOrValidateText(getScheduleRating_TXT_Prot_SelectedPercent(strScheduleRating_TXT_Prot_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_Prot_SelectedPercent,test);
					
			se.element().enterOrValidateText(getScheduleRating_TXT_Prot_Reason(strScheduleRating_TXT_Prot_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_Prot_Reason,test);
			se.element().enterOrValidateText(getScheduleRating_TXT_Prot_Reason(strScheduleRating_TXT_Prot_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_Prot_Reason,test);
			
			se.element().enterOrValidateText(getScheduleRating_TXT_TurnOverRatio_SelectedPercent(strScheduleRating_TXT_TurnOverRatio_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_TurnOverRatio_SelectedPercent,test);
			se.element().enterOrValidateText(getScheduleRating_TXT_TurnOverRatio_SelectedPercent(strScheduleRating_TXT_TurnOverRatio_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_TurnOverRatio_SelectedPercent,test);
			
			//se.element().enterOrValidateText(getScheduleRating_TXT_TurnOverRatio_Reason(strScheduleRating_TXT_TurnOverRatio_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_TurnOverRatio_Reason,test);
			se.util().sleep(5000);
			
			se.element().enterOrValidateText(getScheduleRating_TXT_LossHistory_SelectedPercent(strScheduleRating_TXT_LossHistory_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_LossHistory_SelectedPercent,test);
			se.element().enterOrValidateText(getScheduleRating_TXT_LossHistory_SelectedPercent(strScheduleRating_TXT_LossHistory_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_LossHistory_SelectedPercent,test);
			
			//se.element().enterOrValidateText(getScheduleRating_TXT_LossHist3Year_Reason(strScheduleRating_TXT_LossHist3Year_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_LossHist3Year_Reason,test);
			
			se.util().sleep(5000);
			se.element().enterOrValidateText(getScheduleRating_TXT_SalaryRanges_SelectedPercent(strScheduleRating_TXT_SalaryRanges_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_SalaryRanges_SelectedPercent,test);
			se.element().enterOrValidateText(getScheduleRating_TXT_SalaryRanges_SelectedPercent(strScheduleRating_TXT_SalaryRanges_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_SalaryRanges_SelectedPercent,test);
			
			//se.element().enterOrValidateText(getScheduleRating_TXT_SalaryRanges_Reason(strScheduleRating_TXT_SalaryRanges_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_SalaryRanges_Reason,test);
			se.util().sleep(5000);
			
			se.element().enterOrValidateText(getScheduleRating_TXT_Total_SelectedPercent(strScheduleRating_TXT_Total_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_Total_SelectedPercent,test);
			

			se.util().sleep(2000);
			
		
		}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for ScheduleRating ", true, false, true, test);
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
	public void SpinnerWait(String dataVal) throws IOException {

		
		try{
			if(!dataVal.equalsIgnoreCase("N/A") || !dataVal.contains("validate") ){
				se.element().waitForElementToDisappear(bluelineIndicator, 5000);
				se.element().waitForElementToDisappear(spinner, 5000);
				
			}
			
			
		}catch(Exception e){
			se.log().logSeStep("An unexpected error " + e.getMessage());
			e.printStackTrace();
					
				}
		
		
	}
	
	

	

}
