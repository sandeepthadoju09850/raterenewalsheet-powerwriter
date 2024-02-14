/**
* @author ${sw09380}
*/

package pw.pages.CU;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CU;

public class CU_ScheduleRating extends OR_CU  {
	
	public void CU_ScheduleRatingMethod(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase("ScheduleRating_IRPM")){
			 test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData("ScheduleRating_IRPM", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			
		String strScheduleRating_CHK_Apply = (String) row.get("ScheduleRating_CHK_Apply");
		String strScheduleRating_CHK_DoNotApply = (String) row.get("ScheduleRating_CHK_DoNotApply");
		String strScheduleRating_TXT_State = (String) row.get("ScheduleRating_TXT_State");
		String strScheduleRating_TXT_LOB = (String) row.get("ScheduleRating_TXT_LOB");
		String strScheduleRating_TXT_Credit = (String) row.get("ScheduleRating_TXT_Credit");
		String strScheduleRating_TXT_CreditClear = (String) row.get("ScheduleRating_TXT_CreditClear");
		String strScheduleRating_TXT_Debit = (String) row.get("ScheduleRating_TXT_Debit");
		String strScheduleRating_TXT_FiledStateMin = (String) row.get("ScheduleRating_TXT_FiledStateMin");
		String strScheduleRating_TXT_FiledStateMax = (String) row.get("ScheduleRating_TXT_FiledStateMax");
		String strScheduleRating_CHK_Jstfy_Prm_Mod_Check_yes = (String) row.get("ScheduleRating_CHK_Jstfy_Prm_Mod_Check_yes");
		String strScheduleRating_CHK_Jstfy_Prm_Mod_Check_No = (String) row.get("ScheduleRating_CHK_Jstfy_Prm_Mod_Check_No");
		String strScheduleRating_TXT_LocationExpoOutsidePrem_SelectedPercent = (String) row.get("ScheduleRating_TXT_LocationExpoOutsidePrem_SelectedPercent");
		String strScheduleRating_TXT_LocationExpoOutsidePrem_Reason = (String) row.get("ScheduleRating_TXT_LocationExpoOutsidePrem_Reason");
		String strScheduleRating_TXT_LocationExpoInsidePrem_SelectedPercent = (String) row.get("ScheduleRating_TXT_LocationExpoInsidePrem_SelectedPercent");
		String strScheduleRating_TXT_LocationExpoInsidePrem_Reason = (String) row.get("ScheduleRating_TXT_LocationExpoInsidePrem_Reason");
		String strScheduleRating_TXT_PremisesConditionAndCare_SelectedPercent = (String) row.get("ScheduleRating_TXT_PremisesConditionAndCare_SelectedPercent");
		String strScheduleRating_TXT_PremisesConditionAndCare_Reason = (String) row.get("ScheduleRating_TXT_PremisesConditionAndCare_Reason");
		String strScheduleRating_TXT_EquipTypeConditionAndCare_SelectedPercent = (String) row.get("ScheduleRating_TXT_EquipTypeConditionAndCare_SelectedPercent");
		String strScheduleRating_TXT_EquipTypeConditionAndCare_Reason = (String) row.get("ScheduleRating_TXT_EquipTypeConditionAndCare_Reason");
		String strScheduleRating_TXT_ClassificationOfUnderlying_SelectedPercent = (String) row.get("ScheduleRating_TXT_ClassificationOfUnderlying_SelectedPercent");
		String strScheduleRating_TXT_ClassificationOfUnderlying_Reason = (String) row.get("ScheduleRating_TXT_ClassificationOfUnderlying_Reason");
		String strScheduleRating_TXT_EmployeesSelection_SelectedPercent = (String) row.get("ScheduleRating_TXT_EmployeesSelection_SelectedPercent");
		String strScheduleRating_TXT_EmployeesSelection_Reason = (String) row.get("ScheduleRating_TXT_EmployeesSelection_Reason");
		String strScheduleRating_TXT_CooperationMedicalFacilities_SelectedPercent = (String) row.get("ScheduleRating_TXT_CooperationMedicalFacilities_SelectedPercent");
		String strScheduleRating_TXT_CooperationMedicalFacilities_Reason = (String) row.get("ScheduleRating_TXT_CooperationMedicalFacilities_Reason");
		String strScheduleRating_TXT_Total_SelectedPercent = (String) row.get("ScheduleRating_TXT_Total_SelectedPercent");
		String strScheduleRating_TXT_AutoLiab_ManagementCooperation_SelectedPercent = (String) row.get("ScheduleRating_TXT_AutoLiab_ManagementCooperation_SelectedPercent");
		String strScheduleRating_TXT_AutoLiab_ManagementCooperation_Reason = (String) row.get("ScheduleRating_TXT_AutoLiab_ManagementCooperation_Reason");
		String strScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_SelectedPercent = (String) row.get("ScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_SelectedPercent");
		String strScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_Reason = (String) row.get("ScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_Reason");
		String strScheduleRating_TXT_AutoLiab_EquipTypeCondition_SelectedPercent = (String) row.get("ScheduleRating_TXT_AutoLiab_EquipTypeCondition_SelectedPercent");
		String strScheduleRating_TXT_AutoLiab_EquipTypeCondition_ManagementCooperation_Reason = (String) row.get("ScheduleRating_TXT_AutoLiab_EquipTypeCondition_ManagementCooperation_Reason");
		String strScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_SelectedPercent = (String) row.get("ScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_SelectedPercent");
		String strScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_ManagementCooperation_Reason = (String) row.get("ScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_ManagementCooperation_Reason");
		String strRowNo = (String) row.get("RowNo");;
		
		try {
			se.log().logTestStep("CU_ScheduleRating");
			test.log(LogStatus.INFO, "CU_ScheduleRating","Transaction Step : "+ transaction + "<br>" +"Page : CU_ScheduleRating");
			
			se.verify().verifyEquals("CU_ScheduleRating Page ", getScheduleRating_LBL_ScheduleRating("ScheduleRating").isDisplayed(),true, true,test);
			
			se.element().checkUncheckOrValidate(getScheduleRating_CHK_Apply(strScheduleRating_CHK_Apply),strScheduleRating_CHK_Apply,test);
			se.element().checkUncheckOrValidate(getScheduleRating_CHK_DoNotApply(strScheduleRating_CHK_DoNotApply),strScheduleRating_CHK_DoNotApply,test);
			
			se.element().enterOrValidateText(getScheduleRating_TXT_Credit(strScheduleRating_TXT_Credit,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_Credit,test);
			if((strScheduleRating_TXT_CreditClear.equalsIgnoreCase("Yes"))){
				
				getScheduleRating_TXT_Credit(strScheduleRating_TXT_CreditClear,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB).clear();
				se.util().sleep(5000);
			}
			
			if(!strScheduleRating_TXT_Debit.equalsIgnoreCase(constants.NA) && !strScheduleRating_TXT_Debit.contains(constants.Validate)){
                se.element().clearTheField(getScheduleRating_TXT_Debit(strScheduleRating_TXT_Debit,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB));
                se.element().enterOrValidateText(getScheduleRating_TXT_Debit(strScheduleRating_TXT_Debit,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_Debit,test);
            }else{
            	se.element().enterOrValidateText(getScheduleRating_TXT_Debit(strScheduleRating_TXT_Debit,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_Debit,test);
            }
			
			se.element().enterOrValidateText(getScheduleRating_TXT_FiledStateMin(strScheduleRating_TXT_FiledStateMin,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_FiledStateMin,test);
			se.element().enterOrValidateText(getScheduleRating_TXT_FiledStateMax(strScheduleRating_TXT_FiledStateMax,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_FiledStateMax,test);
			
			se.element().checkUncheckOrValidate(getScheduleRating_CHK_Jstfy_Prm_Mod_Check_yes(strScheduleRating_CHK_Jstfy_Prm_Mod_Check_yes,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_CHK_Jstfy_Prm_Mod_Check_yes,test);
			se.element().checkUncheckOrValidate(getScheduleRating_CHK_Jstfy_Prm_Mod_Check_No(strScheduleRating_CHK_Jstfy_Prm_Mod_Check_No,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_CHK_Jstfy_Prm_Mod_Check_No,test);
			
					
			se.element().enterOrValidateText(getScheduleRating_TXT_LocationExpoOutsidePrem_SelectedPercent(strScheduleRating_TXT_LocationExpoOutsidePrem_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB), strScheduleRating_TXT_LocationExpoOutsidePrem_SelectedPercent,test);
			se.element().enterOrValidateText(getScheduleRating_TXT_LocationExpoOutsidePrem_Reason(strScheduleRating_TXT_LocationExpoOutsidePrem_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_LocationExpoOutsidePrem_Reason,test);
			
			se.element().waitForElement(ScheduleRatin_LBL_Model, 10);
			if(se.element().isElementPresent(ScheduleRatin_LBL_Model)){
				se.element().clickElement(getScheduleRatin_LBL_Model(strScheduleRating_TXT_LocationExpoOutsidePrem_Reason), test);
				se.util().sleep(2000);
			}
			se.element().enterOrValidateText(getScheduleRating_TXT_LocationExpoInsidePrem_SelectedPercent(strScheduleRating_TXT_LocationExpoInsidePrem_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_LocationExpoInsidePrem_SelectedPercent,test);
			se.element().enterOrValidateText(getScheduleRating_TXT_LocationExpoInsidePrem_Reason(strScheduleRating_TXT_LocationExpoInsidePrem_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_LocationExpoInsidePrem_Reason,test);
			
			se.element().waitForElement(ScheduleRatin_LBL_Model, 10);
			if(se.element().isElementPresent(ScheduleRatin_LBL_Model)){
				se.element().clickElement(getScheduleRatin_LBL_Model(strScheduleRating_TXT_LocationExpoInsidePrem_Reason), test);
				se.util().sleep(2000);
			}
			
			se.element().enterOrValidateText(getScheduleRating_TXT_PremisesConditionAndCare_SelectedPercent(strScheduleRating_TXT_PremisesConditionAndCare_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_PremisesConditionAndCare_SelectedPercent,test);
			se.element().enterOrValidateText(getScheduleRating_TXT_PremisesConditionAndCare_Reason(strScheduleRating_TXT_PremisesConditionAndCare_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_PremisesConditionAndCare_Reason,test);
			
			se.element().waitForElement(ScheduleRatin_LBL_Model, 10);
			if(se.element().isElementPresent(ScheduleRatin_LBL_Model)){
				se.element().clickElement(getScheduleRatin_LBL_Model(strScheduleRating_TXT_PremisesConditionAndCare_Reason), test);
				se.util().sleep(2000);
			}
			
			se.element().enterOrValidateText(getScheduleRating_TXT_EquipTypeConditionAndCare_SelectedPercent(strScheduleRating_TXT_EquipTypeConditionAndCare_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_EquipTypeConditionAndCare_SelectedPercent,test);
			se.element().enterOrValidateText(getScheduleRating_TXT_EquipTypeConditionAndCare_Reason(strScheduleRating_TXT_EquipTypeConditionAndCare_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_EquipTypeConditionAndCare_Reason,test);
			
			se.element().waitForElement(ScheduleRatin_LBL_Model, 10);
			if(se.element().isElementPresent(ScheduleRatin_LBL_Model)){
				se.element().clickElement(getScheduleRatin_LBL_Model(strScheduleRating_TXT_EquipTypeConditionAndCare_Reason), test);
				se.util().sleep(2000);
			}
			
			se.element().enterOrValidateText(getScheduleRating_TXT_ClassificationOfUnderlying_SelectedPercent(strScheduleRating_TXT_ClassificationOfUnderlying_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_ClassificationOfUnderlying_SelectedPercent,test);
			se.element().enterOrValidateText(getScheduleRating_TXT_ClassificationOfUnderlying_Reason(strScheduleRating_TXT_ClassificationOfUnderlying_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_ClassificationOfUnderlying_Reason,test);
			if(se.element().isElementPresent(ScheduleRatin_LBL_Model)){
				se.element().clickElement(getScheduleRatin_LBL_Model(strScheduleRating_TXT_ClassificationOfUnderlying_Reason), test);
				se.util().sleep(2000);
			}
			se.element().enterOrValidateText(getScheduleRating_TXT_EmployeesSelection_SelectedPercent(strScheduleRating_TXT_EmployeesSelection_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_EmployeesSelection_SelectedPercent,test);
			se.element().enterOrValidateText(getScheduleRating_TXT_EmployeesSelection_Reason(strScheduleRating_TXT_EmployeesSelection_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_EmployeesSelection_Reason,test);
			if(se.element().isElementPresent(ScheduleRatin_LBL_Model)){
				se.element().clickElement(getScheduleRatin_LBL_Model(strScheduleRating_TXT_EmployeesSelection_Reason), test);
				se.util().sleep(2000);
			}
			se.element().enterOrValidateText(getScheduleRating_TXT_CooperationMedicalFacilities_SelectedPercent(strScheduleRating_TXT_CooperationMedicalFacilities_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_CooperationMedicalFacilities_SelectedPercent,test);
			se.element().enterOrValidateText(getScheduleRating_TXT_CooperationMedicalFacilities_Reason(strScheduleRating_TXT_CooperationMedicalFacilities_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_CooperationMedicalFacilities_Reason,test);
			if(se.element().isElementPresent(ScheduleRatin_LBL_Model)){
				se.element().clickElement(getScheduleRatin_LBL_Model(strScheduleRating_TXT_CooperationMedicalFacilities_Reason), test);
				se.util().sleep(2000);
			}
			
			se.element().enterOrValidateText(getScheduleRating_TXT_AutoLiab_ManagementCooperation_SelectedPercent(strScheduleRating_TXT_AutoLiab_ManagementCooperation_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_AutoLiab_ManagementCooperation_SelectedPercent,test);
			//se.element().enterOrValidateText(getScheduleRating_TXT_AutoLiab_ManagementCooperation_Reason(strScheduleRating_TXT_AutoLiab_ManagementCooperation_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_AutoLiab_ManagementCooperation_Reason,test);
			
			if(!strScheduleRating_TXT_AutoLiab_ManagementCooperation_Reason.equalsIgnoreCase("N/A") && !strScheduleRating_TXT_AutoLiab_ManagementCooperation_Reason.contains("validate2")){
			se.element().clickSearchIcon(getScheduleRating_TXT_AutoLiab_ManagementCooperation_ReasonSearch(strScheduleRating_TXT_AutoLiab_ManagementCooperation_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB), test);
			se.element().clickElement(getScheduleRating_TXT_AutoLiab_ManagementCooperation_ReasonLookup(strScheduleRating_TXT_AutoLiab_ManagementCooperation_Reason),test);
		}
			
			se.element().enterOrValidateText(getScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_SelectedPercent(strScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_SelectedPercent,test);
			//se.element().enterOrValidateText(getScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_Reason(strScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_Reason,test);
			
			if(!strScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_Reason.equalsIgnoreCase("N/A") && !strScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_Reason.contains("validate2")){
				se.element().clickSearchIcon(getScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_ReasonSearch(strScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB), test);
				se.element().clickElement(getScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_ReasonLookup(strScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_Reason),test);
			}
			
			se.element().enterOrValidateText(getScheduleRating_TXT_AutoLiab_EquipTypeCondition_SelectedPercent(strScheduleRating_TXT_AutoLiab_EquipTypeCondition_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_AutoLiab_EquipTypeCondition_SelectedPercent,test);
			//se.element().enterOrValidateText(getScheduleRating_TXT_AutoLiab_EquipTypeCondition_ManagementCooperation_Reason(strScheduleRating_TXT_AutoLiab_EquipTypeCondition_ManagementCooperation_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_AutoLiab_EquipTypeCondition_ManagementCooperation_Reason,test);
			
			if(!strScheduleRating_TXT_AutoLiab_EquipTypeCondition_ManagementCooperation_Reason.equalsIgnoreCase("N/A") && !strScheduleRating_TXT_AutoLiab_EquipTypeCondition_ManagementCooperation_Reason.contains("validate2")){
				se.element().clickSearchIcon(getScheduleRating_TXT_AutoLiab_EquipTypeCondition_ManagementCooperation_ReasonSearch(strScheduleRating_TXT_AutoLiab_EquipTypeCondition_ManagementCooperation_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB), test);
				se.element().clickElement(getScheduleRating_TXT_AutoLiab_EquipTypeCondition_ManagementCooperation_ReasonLookup(strScheduleRating_TXT_AutoLiab_EquipTypeCondition_ManagementCooperation_Reason),test);
			}
			
			se.element().enterOrValidateText(getScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_SelectedPercent(strScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_SelectedPercent,test);
			//se.element().enterOrValidateText(getScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_ManagementCooperation_Reason(strScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_ManagementCooperation_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB),strScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_ManagementCooperation_Reason,test);

			if(!strScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_ManagementCooperation_Reason.equalsIgnoreCase("N/A") && !strScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_ManagementCooperation_Reason.contains("validate2")){
				se.element().clickSearchIcon(getScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_ManagementCooperation_ReasonSearch(strScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_ManagementCooperation_Reason,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB), test);
				se.element().clickElement(getScheduleRating_TXT_AutoLiab_EquipTypeCondition_ManagementCooperation_ReasonLookup(strScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_ManagementCooperation_Reason),test);
			}
			//4/20/23 sheetal: moved the below line from line 152 for correct validation of total %
			se.element().enterOrValidateText(getScheduleRating_TXT_Total_SelectedPercent(strScheduleRating_TXT_Total_SelectedPercent,strScheduleRating_TXT_State,strScheduleRating_TXT_LOB, strRowNo),strScheduleRating_TXT_Total_SelectedPercent,test);
			

		}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CU_ScheduleRating ", true, false, true, test);
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
			