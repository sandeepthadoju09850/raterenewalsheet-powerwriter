package ap.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.ap.automation.common.ExcelOperations;
import Libraries.ap.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.OR_CP;

public class CP_InlandMarineCovSelection extends OR_CP{
	public void CP_InlandMarineCovSelection_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.Inlnd_Marine_Coverage_Selection)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Inlnd_Marine_Coverage_Selection, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strInlandMarine_CHK_ExhibitionFloater = (String) row.get("InlandMarine_CHK_ExhibitionFloater");
			String strInlandMarine_TXTV_EF_Deductible = (String) row.get("InlandMarine_TXTV_EF_Deductible");
			String strInlandMarine_TXTV_EF_AnyOccurrenceLimit = (String) row.get("InlandMarine_TXTV_EF_AnyOccurrenceLimit");
			String strInlandMarine_TXTV_EF_AnyOnePremise = (String) row.get("InlandMarine_TXTV_EF_AnyOnePremise");
			String strInlandMarine_CHK_ContractorsEquipCov = (String) row.get("InlandMarine_CHK_ContractorsEquipCov");
			String strInlandMarine_CHK_SignCov = (String) row.get("InlandMarine_CHK_SignCov");
			String strInlandMarine_CHK_AccRecCov = (String) row.get("InlandMarine_CHK_AccRecCov");
			String strInlandMarine_CHK_AccRecAwayFromPremCov = (String) row.get("InlandMarine_CHK_AccRecAwayFromPremCov");
			String strInlandMarine_TXT_AccRecAwayLimit = (String) row.get("InlandMarine_TXT_AccRecAwayLimit");
			String strInlandMarine_TXTV_AddSmallToolsunscheduled = (String) row.get("InlandMarine_TXTV_AddSmallToolsunscheduled");
			String strInlandMarine_CHK_AddSmallToolsunscheduled_Yes = (String) row.get("InlandMarine_CHK_AddSmallToolsunscheduled_Yes");
			String strInlandMarine_CHK_AddSmallToolsunscheduled_No = (String) row.get("InlandMarine_CHK_AddSmallToolsunscheduled_No");
			String strInlandMarine_TXT_AnyOneOccLimit = (String) row.get("InlandMarine_TXT_AnyOneOccLimit");
			String strInlandMarine_DDV_SmallToolsDedu = (String) row.get("InlandMarine_DDV_SmallToolsDedu");
			String strInlandMarine_CHK_ValPapersCov = (String) row.get("InlandMarine_CHK_ValPapersCov");
			String strInlandMarine_CHK_ValPapersAwayFromPremCov = (String) row.get("InlandMarine_CHK_ValPapersAwayFromPremCov");
			String strInlandMarine_TXT_ValPapersAwayLimit = (String) row.get("InlandMarine_TXT_ValPapersAwayLimit");
			String strInlandMarine_DD_ValPapersDedu = (String) row.get("InlandMarine_DD_ValPapersDedu");
			String strInlandMarine_TXTV_AnyoneToolLimit = (String) row.get("InlandMarine_TXTV_AnyoneToolLimit");
			String strInlandMarine_RBTN_AddSchEquipment_Yes = (String) row.get("InlandMarine_RBTN_AddSchEquipment_Yes");
			String strInlandMarine_RBTN_AddSchEquipment_No = (String) row.get("InlandMarine_RBTN_AddSchEquipment_No");
			String strInlandMarine_RBTN_ListofEnteredQuote_Yes = (String) row.get("InlandMarine_RBTN_ListofEnteredQuote_Yes");
			String strInlandMarine_RBTN_ListofEnteredQuote_No = (String) row.get("InlandMarine_RBTN_ListofEnteredQuote_No");
			String strInlandMarine_TXT_TotEquipLimit = (String) row.get("InlandMarine_TXT_TotEquipLimit");
			String strInlandMarine_DDV_ContractsEquipDeduAmt = (String) row.get("InlandMarine_DDV_ContractsEquipDeduAmt");
			String strInlandMarine_TXT_EmpToolsLimit = (String) row.get("InlandMarine_TXT_EmpToolsLimit");
			String strInlandMarine_TXT_EquipLeasedorRentedfromOthersLimit = (String) row.get("InlandMarine_TXT_EquipLeasedorRentedfromOthersLimit");
			String strInlandMarine_RBTN_InstallationFloaterCov = (String) row.get("InlandMarine_RBTN_InstallationFloaterCov");
			String strInlandMarine_DDV_InstallationFloaterDeduc = (String) row.get("InlandMarine_DDV_InstallationFloaterDeduc");
			String strInlandMarine_TXT_JobsiteLimit = (String) row.get("InlandMarine_TXT_JobsiteLimit");
			String strInlandMarine_TXTV_CatastropheLimit = (String) row.get("InlandMarine_TXTV_CatastropheLimit");
			String strInlandMarine_TXT_TransitLimit = (String) row.get("InlandMarine_TXT_TransitLimit");
			String strInlandMarine_TXTV_TempStorageLocLimit = (String) row.get("InlandMarine_TXTV_TempStorageLocLimit");
			String strInlandMarine_CHK_WaterborneEndorsement = (String) row.get("InlandMarine_CHK_WaterborneEndorsement");
			String strInlandMarine_CHK_SchedulePropertyFloater = (String) row.get("InlandMarine_CHK_SchedulePropertyFloater");
			String strInlandMarine_CHK_SchedulePropertyList_Yes = (String) row.get("InlandMarine_CHK_SchedulePropertyList_Yes");
			String strInlandMarine_CHK_SchedulePropertyList_No = (String) row.get("InlandMarine_CHK_SchedulePropertyList_No");
			String strInlandMarine_TXT_SchedPropLimit = (String) row.get("InlandMarine_TXT_SchedPropLimit");
			String strInlandMarine_DD_SchedDeductibleAmount = (String) row.get("InlandMarine_DD_SchedDeductibleAmount");
			String strInlandMarine_DD_SchedCoinsurance = (String) row.get("InlandMarine_DD_SchedCoinsurance");
			String strInlandMarine_CHK_BoatAndMotor = (String) row.get("InlandMarine_CHK_BoatAndMotor");
			String strInlandMarine_DD_BoatAndMotor_DedAmt = (String) row.get("InlandMarine_DD_BoatAndMotor_DedAmt");
			String strInlandMarine_CHK_MotorTruckCargoCov = (String) row.get("InlandMarine_CHK_MotorTruckCargoCov");
			String strInlandMarine_DD_MTC_DedAmt = (String) row.get("InlandMarine_DD_MTC_DedAmt");
			String strInlandMarine_DD_MTC_RadiusOfOperation = (String) row.get("InlandMarine_DD_MTC_RadiusOfOperation");
			String strInlandMarine_TXT_MTC_CatastropheLim = (String) row.get("InlandMarine_TXT_MTC_CatastropheLim");
			String strInlandMarine_DD_MTC_DesPropPredominantComm = (String) row.get("InlandMarine_DD_MTC_DesPropPredominantComm");
			String strInlandMarine_TXT_MTC_NoOfPowerUnits = (String) row.get("InlandMarine_TXT_MTC_NoOfPowerUnits");
			String strInlandMarine_TXT_Validation = (String) row.get("InlandMarine_TXT_Validation");
			String strInlandMarine_CHK_TransporationCvg = (String) row.get("InlandMarine_CHK_TransporationCvg");
			String strInlandMarine_DD_TC_DedAmt = (String) row.get("InlandMarine_DD_TC_DedAmt");
			String strInlandMarine_DD_TC_RadiusOfOperation = (String) row.get("InlandMarine_DD_TC_RadiusOfOperation");
			String strInlandMarine_TXT_TC_CatastropheLim = (String) row.get("InlandMarine_TXT_TC_CatastropheLim");
			String strInlandMarine_DD_TC_DesPropPredominantComm = (String) row.get("InlandMarine_DD_TC_DesPropPredominantComm");
			String strInlandMarine_TXT_TC_NoOfPowerUnits = (String) row.get("InlandMarine_TXT_TC_NoOfPowerUnits");
			String strInlandMarine_CHK_CargoCoverage = (String) row.get("InlandMarine_CHK_CargoCoverage");
			String strInlandMarine_DD_CargoDeductible = (String) row.get("InlandMarine_DD_CargoDeductible");
			String strInlandMarine_DD_CargoDescribedProperty = (String) row.get("InlandMarine_DD_CargoDescribedProperty");
			String strInlandMarine_DD_AvgDailyRadiusOfOperation = (String) row.get("InlandMarine_DD_AvgDailyRadiusOfOperation");
			String strInlandMarine_TXT_CargoCatastropheLimit = (String) row.get("InlandMarine_TXT_CargoCatastropheLimit");
			String strInlandMarine_TXTV_OwnedVehiclesLimit = (String) row.get("InlandMarine_TXTV_OwnedVehiclesLimit");
			String strInlandMarine_TXT_CargoNoOfPowerUnits = (String) row.get("InlandMarine_TXT_CargoNoOfPowerUnits");
			String strInlandMarine_CHK_RefregBreakPoint = (String) row.get("InlandMarine_CHK_RefregBreakPoint");
			String strInlandMarine_TXTV_RefrigerationBreakdownCatastropheLimit = (String) row.get("InlandMarine_TXTV_RefrigerationBreakdownCatastropheLimit");
			String strInlandMarine_TXTV_RefrigerationBreakdownDeductible = (String) row.get("InlandMarine_TXTV_RefrigerationBreakdownDeductible");
			String strInlandMarine_DoesApplicantHaveAnyInlandAdditionalInterests_Yes = (String) row.get("InlandMarine_DoesApplicantHaveAnyInlandAdditionalInterests_Yes");
			String strInlandMarine_DoesApplicantHaveAnyInlandAdditionalInterests_No = (String) row.get("InlandMarine_DoesApplicantHaveAnyInlandAdditionalInterests_No");
			
			
			try {
				se.log().logTestStep("CP_InlandMarineCovSelection_Details");
				test.log(LogStatus.INFO, "CP_InlandMarineCovSelection_Details","Transaction Step : "+transaction + "<br>" +"Page : CP_InlandMarineCovSelection_Details");
				se.verify().verifyEquals("CP_InlandMarineCovSelection_Details  of AgencyPortal ", getInlandMarine_label().isDisplayed(),true, true,test);
				se.element().checkUncheckOrValidate(getInlandMarine_CHK_WaterborneEndorsement(strInlandMarine_CHK_WaterborneEndorsement),strInlandMarine_CHK_WaterborneEndorsement,test);
				se.element().checkUncheckOrValidate( getInlandMarine_CHK_ExhibitionFloater(strInlandMarine_CHK_ExhibitionFloater),strInlandMarine_CHK_ExhibitionFloater,test);
				se.element().enterOrValidateText( getInlandMarine_TXTV_EF_Deductible(strInlandMarine_TXTV_EF_Deductible),strInlandMarine_TXTV_EF_Deductible,test);
				se.element().enterOrValidateText( getInlandMarine_TXTV_EF_AnyOccurrenceLimit(strInlandMarine_TXTV_EF_AnyOccurrenceLimit),strInlandMarine_TXTV_EF_AnyOccurrenceLimit,test);
				se.element().enterOrValidateText( getInlandMarine_TXTV_EF_AnyOnePremise(strInlandMarine_TXTV_EF_AnyOnePremise),strInlandMarine_TXTV_EF_AnyOnePremise,test);
				se.element().checkUncheckOrValidate( getInlandMarine_CHK_BoatAndMotor(strInlandMarine_CHK_BoatAndMotor),strInlandMarine_CHK_BoatAndMotor,test);
				se.element().SelectElement(InlandMarine_DD_BoatAndMotor_DedAmt, strInlandMarine_DD_BoatAndMotor_DedAmt,test);
				se.element().checkUncheckOrValidate( getInlandMarine_CHK_MotorTruckCargoCov(strInlandMarine_CHK_MotorTruckCargoCov),strInlandMarine_CHK_MotorTruckCargoCov,test);
				se.element().SelectElement(InlandMarine_DD_MTC_DedAmt, strInlandMarine_DD_MTC_DedAmt,test);
				se.element().SelectElement(InlandMarine_DD_MTC_DesPropPredominantComm, strInlandMarine_DD_MTC_DesPropPredominantComm,test);
				se.element().SelectElement(InlandMarine_DD_MTC_RadiusOfOperation, strInlandMarine_DD_MTC_RadiusOfOperation,test);
				se.element().enterOrValidateText( getInlandMarine_TXT_MTC_CatastropheLim(strInlandMarine_TXT_MTC_CatastropheLim),strInlandMarine_TXT_MTC_CatastropheLim,test);
				se.element().enterOrValidateText( getInlandMarine_TXT_MTC_NoOfPowerUnits(strInlandMarine_TXT_MTC_NoOfPowerUnits),strInlandMarine_TXT_MTC_NoOfPowerUnits,test);
				se.element().checkUncheckOrValidate( getInlandMarine_CHK_AccRecCov(strInlandMarine_CHK_AccRecCov),strInlandMarine_CHK_AccRecCov,test);
				se.element().checkUncheckOrValidate( getInlandMarine_CHK_AccRecAwayFromPremCov(strInlandMarine_CHK_AccRecAwayFromPremCov),strInlandMarine_CHK_AccRecAwayFromPremCov,test);
				se.element().enterOrValidateText( getInlandMarine_TXT_AccRecAwayLimit(strInlandMarine_TXT_AccRecAwayLimit),strInlandMarine_TXT_AccRecAwayLimit,test);
				
				se.element().checkUncheckOrValidate( getInlandMarine_CHK_ContractorsEquipCov(strInlandMarine_CHK_ContractorsEquipCov),strInlandMarine_CHK_ContractorsEquipCov,test);
				se.element().checkUncheckOrValidate( getInlandMarine_CHK_SignCov(strInlandMarine_CHK_SignCov),strInlandMarine_CHK_SignCov,test);
				se.element().checkUncheckOrValidate( getInlandMarine_CHK_ValPapersCov(strInlandMarine_CHK_ValPapersCov),strInlandMarine_CHK_ValPapersCov,test);
				
				se.element().enterOrValidateText( getInlandMarine_TXTV_AddSmallToolsunscheduled(strInlandMarine_TXTV_AddSmallToolsunscheduled),strInlandMarine_TXTV_AddSmallToolsunscheduled,test);
				se.element().checkUncheckOrValidate( getInlandMarine_CHK_AddSmallToolsunscheduled_Yes(strInlandMarine_CHK_AddSmallToolsunscheduled_Yes),strInlandMarine_CHK_AddSmallToolsunscheduled_Yes,test);
				se.element().checkUncheckOrValidate( getInlandMarine_CHK_AddSmallToolsunscheduled_No(strInlandMarine_CHK_AddSmallToolsunscheduled_No),strInlandMarine_CHK_AddSmallToolsunscheduled_No,test);
				se.element().enterOrValidateText( getInlandMarine_TXT_AnyOneOccLimit(strInlandMarine_TXT_AnyOneOccLimit),strInlandMarine_TXT_AnyOneOccLimit,test);
				se.element().SelectElement(InlandMarine_DDV_SmallToolsDedu, strInlandMarine_DDV_SmallToolsDedu,test);
				se.element().enterOrValidateText( getInlandMarine_TXTV_AnyoneToolLimit(strInlandMarine_TXTV_AnyoneToolLimit),strInlandMarine_TXTV_AnyoneToolLimit,test);
				se.element().checkUncheckOrValidate( getInlandMarine_RBTN_AddSchEquipment_Yes(strInlandMarine_RBTN_AddSchEquipment_Yes),strInlandMarine_RBTN_AddSchEquipment_Yes,test);
				se.element().checkUncheckOrValidate( getInlandMarine_RBTN_AddSchEquipment_No(strInlandMarine_RBTN_AddSchEquipment_No),strInlandMarine_RBTN_AddSchEquipment_No,test);
				se.element().checkUncheckOrValidate( getInlandMarine_RBTN_ListofEnteredQuote_Yes(strInlandMarine_RBTN_ListofEnteredQuote_Yes),strInlandMarine_RBTN_ListofEnteredQuote_Yes,test);
				se.element().checkUncheckOrValidate( getInlandMarine_RBTN_ListofEnteredQuote_No(strInlandMarine_RBTN_ListofEnteredQuote_No),strInlandMarine_RBTN_ListofEnteredQuote_No,test);
				
				
				se.element().SelectElement(InlandMarine_DD_ValPapersDedu, strInlandMarine_DD_ValPapersDedu,test);
				se.element().checkUncheckOrValidate( getInlandMarine_CHK_ValPapersAwayFromPremCov(strInlandMarine_CHK_ValPapersAwayFromPremCov),strInlandMarine_CHK_ValPapersAwayFromPremCov,test);
				se.element().enterOrValidateText(getInlandMarine_TXT_ValPapersAwayLimit(strInlandMarine_TXT_ValPapersAwayLimit),strInlandMarine_TXT_ValPapersAwayLimit,test);
				
				se.element().SelectElement(InlandMarine_DDV_ContractsEquipDeduAmt, strInlandMarine_DDV_ContractsEquipDeduAmt,test);
				se.element().enterOrValidateText( getInlandMarine_TXT_EmpToolsLimit(strInlandMarine_TXT_EmpToolsLimit),strInlandMarine_TXT_EmpToolsLimit,test);
				se.element().enterOrValidateText( getInlandMarine_TXT_EquipLeasedorRentedfromOthersLimit(strInlandMarine_TXT_EquipLeasedorRentedfromOthersLimit),strInlandMarine_TXT_EquipLeasedorRentedfromOthersLimit,test);
				se.element().checkUncheckOrValidate( getInlandMarine_RBTN_InstallationFloaterCov(strInlandMarine_RBTN_InstallationFloaterCov),strInlandMarine_RBTN_InstallationFloaterCov,test);
				se.element().SelectElement(InlandMarine_DDV_InstallationFloaterDeduc, strInlandMarine_DDV_InstallationFloaterDeduc,test);
				se.element().enterOrValidateText( getInlandMarine_TXT_JobsiteLimit(strInlandMarine_TXT_JobsiteLimit),strInlandMarine_TXT_JobsiteLimit,test);
				se.element().enterOrValidateText( getInlandMarine_TXTV_CatastropheLimit(strInlandMarine_TXTV_CatastropheLimit),strInlandMarine_TXTV_CatastropheLimit,test);
				se.element().waitForElementToDisappear_One(progressBar, 60);
				se.element().enterOrValidateText( getInlandMarine_TXT_TransitLimit(strInlandMarine_TXT_TransitLimit),strInlandMarine_TXT_TransitLimit,test);
				se.element().enterOrValidateText( getInlandMarine_TXTV_TempStorageLocLimit(strInlandMarine_TXTV_TempStorageLocLimit),strInlandMarine_TXTV_TempStorageLocLimit,test);
				se.element().waitForElementToDisappear_One(progressBar, 60);
				se.util().sleep(2000);
				if(!strInlandMarine_TXT_TotEquipLimit.equalsIgnoreCase("N/A")) {
					executor.executeScript("arguments[0].scrollIntoView(0,500);", getInlandMarine_TXT_TotEquipLimit(strInlandMarine_TXT_TotEquipLimit));
					se.util().sleep(2000);
					se.element().enterOrValidateText( getInlandMarine_TXT_TotEquipLimit(strInlandMarine_TXT_TotEquipLimit),strInlandMarine_TXT_TotEquipLimit,test);	
				}
				
				se.element().checkUncheckOrValidate( getInlandMarine_CHK_SchedulePropertyFloater(strInlandMarine_CHK_SchedulePropertyFloater),strInlandMarine_CHK_SchedulePropertyFloater,test);
				se.util().sleep(2000);
				se.element().Click(getInlandMarine_CHK_SchedulePropertyFloaterPopUp(), test);
				
				se.element().checkUncheckOrValidate( getInlandMarine_CHK_SchedulePropertyList_Yes(strInlandMarine_CHK_SchedulePropertyList_Yes),strInlandMarine_CHK_SchedulePropertyList_Yes,test);
				se.element().checkUncheckOrValidate( getInlandMarine_CHK_SchedulePropertyList_No(strInlandMarine_CHK_SchedulePropertyList_No),strInlandMarine_CHK_SchedulePropertyList_No,test);
				se.element().enterOrValidateText( getInlandMarine_TXT_SchedPropLimit(strInlandMarine_TXT_SchedPropLimit),strInlandMarine_TXT_SchedPropLimit,test);
				se.element().SelectElement(InlandMarine_DD_SchedDeductibleAmount, strInlandMarine_DD_SchedDeductibleAmount,test);
				se.element().SelectElement(InlandMarine_DD_SchedCoinsurance, strInlandMarine_DD_SchedCoinsurance,test);
				se.element().checkUncheckOrValidate( getInlandMarine_CHK_TransporationCvg(strInlandMarine_CHK_TransporationCvg),strInlandMarine_CHK_TransporationCvg,test);
				se.element().SelectElement(InlandMarine_DD_TC_DedAmt, strInlandMarine_DD_TC_DedAmt,test);
				se.element().SelectElement(InlandMarine_DD_TC_DesPropPredominantComm, strInlandMarine_DD_TC_DesPropPredominantComm,test);
				se.element().SelectElement(InlandMarine_DD_TC_RadiusOfOperation, strInlandMarine_DD_TC_RadiusOfOperation,test);
				se.element().enterOrValidateText( getInlandMarine_TXT_TC_CatastropheLim(strInlandMarine_TXT_TC_CatastropheLim),strInlandMarine_TXT_TC_CatastropheLim,test);
				se.element().enterOrValidateText( getInlandMarine_TXT_TC_NoOfPowerUnits(strInlandMarine_TXT_TC_NoOfPowerUnits),strInlandMarine_TXT_TC_NoOfPowerUnits,test);
				se.element().checkUncheckOrValidate( getInlandMarine_CHK_CargoCoverage(strInlandMarine_CHK_CargoCoverage),strInlandMarine_CHK_CargoCoverage,test);
				se.element().SelectElement(InlandMarine_DD_CargoDeductible, strInlandMarine_DD_CargoDeductible,test);
				se.element().SelectElement(InlandMarine_DD_CargoDescribedProperty, strInlandMarine_DD_CargoDescribedProperty,test);
				se.element().SelectElement(InlandMarine_DD_AvgDailyRadiusOfOperation, strInlandMarine_DD_AvgDailyRadiusOfOperation,test);
				se.element().enterOrValidateText( getInlandMarine_TXT_CargoCatastropheLimit(strInlandMarine_TXT_CargoCatastropheLimit),strInlandMarine_TXT_CargoCatastropheLimit,test);
				se.element().enterOrValidateText( getInlandMarine_TXTV_OwnedVehiclesLimit(strInlandMarine_TXTV_OwnedVehiclesLimit),strInlandMarine_TXTV_OwnedVehiclesLimit,test);
				se.element().enterOrValidateText( getInlandMarine_TXT_CargoNoOfPowerUnits(strInlandMarine_TXT_CargoNoOfPowerUnits),strInlandMarine_TXT_CargoNoOfPowerUnits,test);
				se.element().checkUncheckOrValidate( getInlandMarine_CHK_RefregBreakPoint(strInlandMarine_CHK_RefregBreakPoint),strInlandMarine_CHK_RefregBreakPoint,test);
				se.element().enterOrValidateText( getInlandMarine_TXTV_RefrigerationBreakdownCatastropheLimit(strInlandMarine_TXTV_RefrigerationBreakdownCatastropheLimit),strInlandMarine_TXTV_RefrigerationBreakdownCatastropheLimit,test);
				se.element().enterOrValidateText( getInlandMarine_TXTV_RefrigerationBreakdownDeductible(strInlandMarine_TXTV_RefrigerationBreakdownDeductible),strInlandMarine_TXTV_RefrigerationBreakdownDeductible,test);
				se.element().checkUncheckOrValidate( getInlandMarine_DoesApplicantHaveAnyInlandAdditionalInterests_Yes(strInlandMarine_DoesApplicantHaveAnyInlandAdditionalInterests_Yes),strInlandMarine_DoesApplicantHaveAnyInlandAdditionalInterests_Yes,test);
				se.element().checkUncheckOrValidate( getInlandMarine_DoesApplicantHaveAnyInlandAdditionalInterests_No(strInlandMarine_DoesApplicantHaveAnyInlandAdditionalInterests_No),strInlandMarine_DoesApplicantHaveAnyInlandAdditionalInterests_No,test);
				
				
				if(!strInlandMarine_TXT_Validation.equalsIgnoreCase("N/A"))
				{
					executor.executeScript("arguments[0].scrollIntoView(0,500);", getGI_CHK_Continue());
					
					se.element().Click(getGI_CHK_Continue(), test);
					se.element().enterOrValidateText( getPremiumIndication_TXT_Rattingerror(strInlandMarine_TXT_Validation),strInlandMarine_TXT_Validation,test);
				}
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for CP_InlandMarineCovSelection_Details ", true, false, true, test);
			}
			iteration++;

		}
		executor.executeScript("arguments[0].scrollIntoView(0,500);", getGI_CHK_Continue());
		
		se.element().Click(getGI_CHK_Continue(), test);
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}
}
