package ap.pages.WC;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.ap.automation.common.ExcelOperations;
import Libraries.ap.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.OR_CP;

public class WC_StateRatingFactors extends OR_CP {
	public void WC_StateRatingFactors_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.StateRatingFactors)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.StateRatingFactors, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strSRF_TXT_DeducAmt= (String) row.get("SRF_TXT_DeducAmt");
			String strSRF_DD_State= (String) row.get("SRF_DD_State");
			String strSRF_TXT_RiskId= (String) row.get("SRF_TXT_RiskId");
			String strSRF_BTN_Edit= (String) row.get("SRF_BTN_Edit");
			String strSRF_BTN_NoEdit= (String) row.get("SRF_BTN_NoEdit");
			String strSRF_BTN_Edit_Loc= (String) row.get("SRF_BTN_Edit_Loc");
			String strSRF_CHK_RiskIdNotAvailble= (String) row.get("SRF_CHK_RiskIdNotAvailble");
			String strSRF_TXT_ExpMod= (String) row.get("SRF_TXT_ExpMod");
			String strSRF_DD_WaiverSubrogation= (String) row.get("SRF_DD_WaiverSubrogation");
			String strSRF_TXT_StateEmployerNum= (String) row.get("SRF_TXT_StateEmployerNum");
			//Rating Options
			String strSRF_CHK_DrugAlchoholFree= (String) row.get("SRF_CHK_DrugAlchoholFree");
			String strSRF_CHK_ManagedCare= (String) row.get("SRF_CHK_ManagedCare");
			String strSRF_CHK_safetyCredit= (String) row.get("SRF_CHK_safetyCredit");
			String strSRF_CHK_ApplicantHasCCPAP = (String) row.get("SRF_CHK_ApplicantHasCCPAP");
			
			String strSRF_CHK_DoesTheInsuredHaveAProcedureThatEncouragesInjuredEmployees = (String) row.get("SRF_CHK_DoesTheInsuredHaveAProcedureThatEncouragesInjuredEmployees");
			String strSRF_CHK_DoesTheInsuredAdviceTheInjuredEmployee = (String) row.get("SRF_CHK_DoesTheInsuredAdviceTheInjuredEmployee");
			String strSRF_CHK_DoesTheInsuredModifyJobDuties =  (String) row.get("SRF_CHK_DoesTheInsuredModifyJobDuties");
			String strSRF_CHK_DoesTheInsuredHaveAScreeningProcedure = (String) row.get("SRF_CHK_DoesTheInsuredHaveAScreeningProcedure");
			String strSRF_CHK_PotentialEmpScreening = (String) row.get("SRF_CHK_PotentialEmpScreening");
			String strSRF_CHK_CurrentEmpScreening = (String) row.get("SRF_CHK_CurrentEmpScreening");
			String strSRF_CHK_PostAccidentScreening = (String) row.get("SRF_CHK_PostAccidentScreening");
			String strSRF_CHK_DoesTheInsuredAgreeToRefer = (String) row.get("SRF_CHK_DoesTheInsuredAgreeToRefer");
			String strSRF_CHK_NumberOfEmpCoveredByHealthInsurance = (String) row.get("SRF_CHK_NumberOfEmpCoveredByHealthInsurance");
			String strSRF_CHK_TotalNumberOfEmployees = (String) row.get("SRF_CHK_TotalNumberOfEmployees");
			String strSRF_CHK_DoesTheInsuredHaveAFormalProgram = (String) row.get("SRF_CHK_DoesTheInsuredHaveAFormalProgram");
			String strSRF_CHK_PriorYear  = (String) row.get("SRF_CHK_PriorYear");
			String strSRF_CHK_2ndPriorYear = (String) row.get("SRF_CHK_2ndPriorYear");
			String strSRF_CHK_3rdPriorYear  = (String) row.get("SRF_CHK_3rdPriorYear");
			String strSRF_CHK_CollectiveBargaining  = (String) row.get("SRF_CHK_CollectiveBargaining");
			String strSRF_CHK_ReturnToWork  = (String) row.get("SRF_CHK_ReturnToWork");
			String strSRF_DD_MeritRating  = (String) row.get("SRF_DD_MeritRating");
			String strSRF_TXT_MeritModifier  = (String) row.get("SRF_TXT_MeritModifier");
			
			try {
				se.log().logTestStep("WC_StateRatingFactors");
				test.log(LogStatus.INFO, "WC_StateRatingFactors","Transaction Step : "+transaction + "<br>" +"Page : WC_StateRatingFactors");
				//se.verify().verifyEquals("WC_StateRatingFactors  of AgencyPortal ", getmenu_lnk_StateRating().isDisplayed(),true, true,test);
				if(strSRF_BTN_Edit.contains("Edit") || strSRF_BTN_NoEdit.contains("Yes"))
				{
					se.element().Click(getSRF_BTN_Edit(strSRF_BTN_Edit_Loc), test);
					se.element().SelectElement(SRF_DD_State,strSRF_DD_State,test);
					//se.element().waitBasedOnCount(PleaseWaitPopup,40); 
					se.element().enterOrValidateText(getSRF_TXT_DeducAmt(strSRF_TXT_DeducAmt),strSRF_TXT_DeducAmt,test);
					se.element().enterOrValidateText(getSRF_TXT_StateEmployerNum(strSRF_TXT_StateEmployerNum),strSRF_TXT_StateEmployerNum,test);
					se.element().enterOrValidateText(getSRF_TXT_RiskId(strSRF_TXT_RiskId),strSRF_TXT_RiskId,test);					
					if(!strSRF_TXT_RiskId.equalsIgnoreCase("N/A")){
						se.element().waitBasedOnCount(PleaseWaitPopup,40);
					}
					se.element().checkUncheckOrValidate(getSRF_CHK_RiskIdNotAvailble(strSRF_CHK_RiskIdNotAvailble),strSRF_CHK_RiskIdNotAvailble,test);
					se.element().enterOrValidateText(getSRF_TXT_ExpMod(strSRF_TXT_ExpMod),strSRF_TXT_ExpMod,test);
					se.element().SelectElement(SRF_DD_MeritRating,strSRF_DD_MeritRating,test);
					se.element().enterOrValidateText(getSRF_TXT_MeritModifier(strSRF_TXT_MeritModifier),strSRF_TXT_MeritModifier,test);
					
					if(!strSRF_TXT_ExpMod.equalsIgnoreCase("N/A")){
						se.element().waitBasedOnCount(PleaseWaitPopup,40);
					}
					
					se.element().SelectElement(SRF_DD_WaiverSubrogation,strSRF_DD_WaiverSubrogation,test);
					
					se.element().Click(getSRF_CHK_DrugAlchoholFree(strSRF_CHK_DrugAlchoholFree),strSRF_CHK_DrugAlchoholFree,test);
					se.element().Click(getSRF_CHK_ManagedCare(strSRF_CHK_ManagedCare),strSRF_CHK_ManagedCare,test);
					se.element().Click(getSRF_CHK_safetyCredit(strSRF_CHK_safetyCredit),strSRF_CHK_safetyCredit,test);
					se.element().Click(getSRF_CHK_CollectiveBargaining(strSRF_CHK_CollectiveBargaining),strSRF_CHK_CollectiveBargaining,test);
					se.element().Click(getSRF_CHK_ReturnToWork(strSRF_CHK_ReturnToWork),strSRF_CHK_ReturnToWork,test);
					
						
					se.element().Click(getSRF_CHK_DoesTheInsuredHaveAProcedureThatEncouragesInjuredEmployees(strSRF_CHK_DoesTheInsuredHaveAProcedureThatEncouragesInjuredEmployees),strSRF_CHK_DoesTheInsuredHaveAProcedureThatEncouragesInjuredEmployees,test);
					se.element().Click(getSRF_CHK_DoesTheInsuredAdviceTheInjuredEmployee(strSRF_CHK_DoesTheInsuredAdviceTheInjuredEmployee),strSRF_CHK_DoesTheInsuredAdviceTheInjuredEmployee,test);
					se.element().Click(getSRF_CHK_DoesTheInsuredModifyJobDuties(strSRF_CHK_DoesTheInsuredModifyJobDuties),strSRF_CHK_DoesTheInsuredModifyJobDuties,test);
					
					se.element().Click(getSRF_CHK_DoesTheInsuredHaveAScreeningProcedure(strSRF_CHK_DoesTheInsuredHaveAScreeningProcedure),strSRF_CHK_DoesTheInsuredHaveAScreeningProcedure,test);
					se.element().checkUncheckOrValidate(getSRF_CHK_PotentialEmpScreening(strSRF_CHK_PotentialEmpScreening),strSRF_CHK_PotentialEmpScreening,test);
					se.element().checkUncheckOrValidate(getSRF_CHK_CurrentEmpScreening(strSRF_CHK_CurrentEmpScreening),strSRF_CHK_CurrentEmpScreening,test);
					se.element().checkUncheckOrValidate(getSRF_CHK_PostAccidentScreening(strSRF_CHK_PostAccidentScreening),strSRF_CHK_PostAccidentScreening,test);
					
					se.element().Click(getSRF_CHK_DoesTheInsuredAgreeToRefer(strSRF_CHK_DoesTheInsuredAgreeToRefer),strSRF_CHK_DoesTheInsuredAgreeToRefer,test);
					
					se.element().enterOrValidateText(getSRF_CHK_NumberOfEmpCoveredByHealthInsurance(strSRF_CHK_NumberOfEmpCoveredByHealthInsurance),strSRF_CHK_NumberOfEmpCoveredByHealthInsurance,test);
					
					se.element().enterOrValidateText(getSRF_CHK_TotalNumberOfEmployees(strSRF_CHK_TotalNumberOfEmployees),strSRF_CHK_TotalNumberOfEmployees,test);
						
					se.element().Click(getSRF_CHK_DoesTheInsuredHaveAFormalProgram(strSRF_CHK_DoesTheInsuredHaveAFormalProgram),strSRF_CHK_DoesTheInsuredHaveAFormalProgram,test);
						
					se.element().enterOrValidateText(getSRF_CHK_PriorYear(strSRF_CHK_PriorYear),strSRF_CHK_PriorYear,test);
					se.element().enterOrValidateText(getSRF_CHK_2ndPriorYear(strSRF_CHK_2ndPriorYear),strSRF_CHK_2ndPriorYear,test);
					se.element().enterOrValidateText(getSRF_CHK_3rdPriorYear(strSRF_CHK_3rdPriorYear),strSRF_CHK_3rdPriorYear,test);
					
					se.element().checkUncheckOrValidate(getSRF_CHK_ApplicantHasCCPAP(strSRF_CHK_ApplicantHasCCPAP),strSRF_CHK_ApplicantHasCCPAP,test);
					
					se.element().Click(getLocations_BTN_Save(), test);
				}
			}
			catch(Exception e){
				e.printStackTrace();
				e.getMessage();
				se.verify().verifyEquals("Failed to fill in details for WC_StateRatingFactors ", true, false, true, test);
			}
			iteration++;
		}
		se.element().Click(getGI_CHK_Continue(), test);
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}
}
