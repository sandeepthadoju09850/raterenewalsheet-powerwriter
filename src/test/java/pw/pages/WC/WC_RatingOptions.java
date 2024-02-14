package pw.pages.WC;
/**
* @author ${ra09491}
*/
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_WC;

public class WC_RatingOptions extends OR_WC {
public void RatingOptions(String strRegressionID, String transaction, String suspendSheet, ExtentTest test) throws IOException {
		
		try{
			
		    if(suspendSheet.equalsIgnoreCase(constants.WC_RatingOptions)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
			
			List<Map<String, String>> table = ExcelOperations.getPagesData(constants.WC_RatingOptions, strRegressionID, transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strRatingOptions_CHK_AppDesignatedMedicalProvider = (String) row.get("RatingOptions_CHK_AppDesignatedMedicalProvider");
				String strRatingOptions_TXT_AppDesignatedMedicalProviderFactor = (String) row.get("RatingOptions_TXT_AppDesignatedMedicalProviderFactor");
				String strRatingOptions_TXT_CertifiedWorkplaceSafety_PCF = (String) row.get("RatingOptions_TXT_CertifiedWorkplaceSafety_PCF");
				String strRatingOptions_TXT_EffDateEmployeeParticipation = (String) row.get("RatingOptions_TXT_EffDateEmployeeParticipation");
				String strRatingOptions_CHK_SafeWorkplaceProgram = (String) row.get("RatingOptions_CHK_SafeWorkplaceProgram");
				String strRatingOptions_TXT_ClassPremiumAdjustment = (String) row.get("RatingOptions_TXT_ClassPremiumAdjustment");
				String strRatingOptions_CHK_DrugFree = (String) row.get("RatingOptions_CHK_DrugFree");
				String strRatingOptions_CHK_ManagedCare = (String) row.get("RatingOptions_CHK_ManagedCare");
				String strRatingOptions_TXT_ManagedCareCorvel = (String) row.get("RatingOptions_TXT_ManagedCareCorvel");
				String strRatingOptions_CHK_SafetyProgram = (String) row.get("RatingOptions_CHK_SafetyProgram");
				String strRatingOptions_CHK_CollectiveBargaining = (String) row.get("RatingOptions_CHK_CollectiveBargaining");
				String strRatingOptions_CHK_ReturntoWork = (String) row.get("RatingOptions_CHK_ReturntoWork");
				String strRatingOptions_CHK_ReturnToWorkProcedure = (String) row.get("RatingOptions_CHK_ReturnToWorkProcedure");
				String strRatingOptions_CHK_ReturnToWorkModifyJobDuties = (String) row.get("RatingOptions_CHK_ReturnToWorkModifyJobDuties");
				String strRatingOptions_CHK_DrugScreen = (String) row.get("RatingOptions_CHK_DrugScreen");
				String strRatingOptions_CHK_DrugScreenPotentialEmployee = (String) row.get("RatingOptions_CHK_DrugScreenPotentialEmployee");
				String strRatingOptions_CHK_DrugScreenPostAccident = (String) row.get("RatingOptions_CHK_DrugScreenPostAccident");
				String strRatingOptions_TXT_NumberOFEmployeesCovered = (String) row.get("RatingOptions_TXT_NumberOFEmployeesCovered");
				String strRatingOptions_TXT_TotalNumOfEmp = (String) row.get("RatingOptions_TXT_TotalNumOfEmp");
				
			
				try
				{
					se.log().logSeStep("WC_RatingOptions");
					test.log(LogStatus.INFO, "WC_RatingOptions","Transaction Step : "+ transaction + "<br>" +"Page : WC_RatingOptions");
					se.verify().verifyEquals("WC_RatingOptions page of PowerWriter ", getRatingOptions_TXT_LabelName().isDisplayed(),true, true,test);					
					se.element().checkUncheckOrValidate(getRatingOptions_CHK_AppDesignatedMedicalProvider(strRatingOptions_CHK_AppDesignatedMedicalProvider),strRatingOptions_CHK_AppDesignatedMedicalProvider,test);
					se.element().checkUncheckOrValidate(getRatingOptions_CHK_AppDesignatedMedicalProvider(strRatingOptions_CHK_AppDesignatedMedicalProvider),strRatingOptions_CHK_AppDesignatedMedicalProvider,test);
					se.element().enterOrValidateText(getRatingOptions_TXT_AppDesignatedMedicalProviderFactor(strRatingOptions_TXT_AppDesignatedMedicalProviderFactor),strRatingOptions_TXT_AppDesignatedMedicalProviderFactor,test);
					se.element().enterOrValidateText(getRatingOptions_TXT_CertifiedWorkplaceSafety_PCF(strRatingOptions_TXT_CertifiedWorkplaceSafety_PCF),strRatingOptions_TXT_CertifiedWorkplaceSafety_PCF,test);
					se.element().enterOrValidateText(getRatingOptions_TXT_EffDateEmployeeParticipation(strRatingOptions_TXT_EffDateEmployeeParticipation),strRatingOptions_TXT_EffDateEmployeeParticipation,test);
					se.element().checkUncheckOrValidate(getRatingOptions_CHK_SafeWorkplaceProgram(strRatingOptions_CHK_SafeWorkplaceProgram),strRatingOptions_CHK_SafeWorkplaceProgram,test);
					se.element().enterOrValidateText(getRatingOptions_TXT_ClassPremiumAdjustment(strRatingOptions_TXT_ClassPremiumAdjustment),strRatingOptions_TXT_ClassPremiumAdjustment,test);
					se.element().checkUncheckOrValidate(getRatingOptions_CHK_DrugFree(strRatingOptions_CHK_DrugFree),strRatingOptions_CHK_DrugFree,test);
					se.element().checkUncheckOrValidate(getRatingOptions_CHK_ManagedCare(strRatingOptions_CHK_ManagedCare),strRatingOptions_CHK_ManagedCare,test);
					se.element().enterOrValidateText(getRatingOptions_TXT_ManagedCareCorvel(strRatingOptions_TXT_ManagedCareCorvel),strRatingOptions_TXT_ManagedCareCorvel,test);
					se.element().checkUncheckOrValidate(getRatingOptions_CHK_SafetyProgram(strRatingOptions_CHK_SafetyProgram),strRatingOptions_CHK_SafetyProgram,test);
					se.element().checkUncheckOrValidate(getRatingOptions_CHK_CollectiveBargaining(strRatingOptions_CHK_CollectiveBargaining),strRatingOptions_CHK_CollectiveBargaining,test);
					se.element().checkUncheckOrValidate(getRatingOptions_CHK_ReturntoWork(strRatingOptions_CHK_ReturntoWork),strRatingOptions_CHK_ReturntoWork,test);
					se.element().checkUncheckOrValidate(getRatingOptions_CHK_ReturnToWorkProcedure(strRatingOptions_CHK_ReturnToWorkProcedure),strRatingOptions_CHK_ReturnToWorkProcedure,test);
					se.element().checkUncheckOrValidate(getRatingOptions_CHK_ReturnToWorkModifyJobDuties(strRatingOptions_CHK_ReturnToWorkModifyJobDuties),strRatingOptions_CHK_ReturnToWorkModifyJobDuties,test);
					se.element().checkUncheckOrValidate(getRatingOptions_CHK_DrugScreen(strRatingOptions_CHK_DrugScreen),strRatingOptions_CHK_DrugScreen,test);
					se.element().checkUncheckOrValidate(getRatingOptions_CHK_DrugScreenPotentialEmployee(strRatingOptions_CHK_DrugScreenPotentialEmployee),strRatingOptions_CHK_DrugScreenPotentialEmployee,test);
					se.element().checkUncheckOrValidate(getRatingOptions_CHK_DrugScreenPostAccident(strRatingOptions_CHK_DrugScreenPostAccident),strRatingOptions_CHK_DrugScreenPostAccident,test);
					se.element().enterOrValidateText(getRatingOptions_TXT_NumberOFEmployeesCovered(strRatingOptions_TXT_NumberOFEmployeesCovered),strRatingOptions_TXT_NumberOFEmployeesCovered,test);
					se.element().enterOrValidateText(getRatingOptions_TXT_TotalNumOfEmp(strRatingOptions_TXT_TotalNumOfEmp),strRatingOptions_TXT_TotalNumOfEmp,test);
					se.element().Click(getNext(),test);
				
					
				}catch(Exception e) {
					se.verify().verifyEquals("Failed to fill in details for WC_RatingOptions", true, false, true, test);
							
					
					}
							iteration++;
						}
					
				}
				catch (Exception e) {
					
					se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
					test.log(LogStatus.FAIL, "Failed", "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
					testTearDown(se, test);
				}
					
			}
			}
