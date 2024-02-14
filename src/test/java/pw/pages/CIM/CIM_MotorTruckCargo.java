package pw.pages.CIM;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import pw.Constants.constants;
import pw.OR.OR_CIM;

public class CIM_MotorTruckCargo extends OR_CIM {
	
public void CIM_MotorTruckCargoPage(String strRegressionID,String transaction,ExtentTest test) throws IOException {
	try{
	String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
    if(SuspendSheet.equalsIgnoreCase("CIM_MotorTruckCargo")){
    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
         testTearDown(se, test);
    }
	List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_MotorTruckCargo", strRegressionID, transaction);
	int iteration = 0;
	while (iteration < table.size()) {
		LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		try {	
			CIM_MotorTruckCargo CIMMotorTruckCargoPage =  TestPageFactory.initElements(se, CIM_MotorTruckCargo.class);
			CIMMotorTruckCargoPage.coveredPropertySection(row,test);
			CIMMotorTruckCargoPage.optionalCoveragesSection(row,test);
			CIMMotorTruckCargoPage.motorTruckCargoRatingSection(row,test);
			//CIMMotorTruckCargoPage.ratingDetailsSection(row,test);
			se.element().Click(getNext(),test);
		
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CIM_MotorTruckCargo ", true, false, true, test);		
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

public void coveredPropertySection(Map<String, String> row, ExtentTest test) throws IOException {


	String strCIM_MotorTruckCargo_TXT_MotorTruckCargoDescPropPredomComm = (String) row.get("CIM_MotorTruckCargo_TXT_MotorTruckCargoDescPropPredomComm");
	String strCIM_MotorTruckCargo_TXT_MotorTruckCargoAddDescProp = (String) row.get("CIM_MotorTruckCargo_TXT_MotorTruckCargoAddDescProp");
	String strCIM_MotorTruckCargo_TXT_RadiusOfOperation = (String) row.get("CIM_MotorTruckCargo_TXT_RadiusOfOperation");
	String strCIM_MotorTruckCargo_TXT_Catastrophelimit = (String) row.get("CIM_MotorTruckCargo_TXT_Catastrophelimit");
	String strCIM_MotorTruckCargo_TXT_PropertyInVehiclesLim = (String) row.get("CIM_MotorTruckCargo_TXT_PropertyInVehiclesLim");
	String strCIM_MotorTruckCargo_TXT_MotorTruckCargoDescPropPredomComm_FilterNeeded = (String) row.get("CIM_MotorTruckCargo_TXT_MotorTruckCargoDescPropPredomComm_FilterNeeded");
	String transaction = (String) row.get("Transaction Name");
	try{
		se.log().logTestStep("Covered Property");
		test.log(LogStatus.INFO, "Covered Property section","Transaction Step : "+transaction + "<br>" +"Page : CIM_MotorTruckCargo");
		se.verify().verifyEquals("Covered Property of PowerWriter ", getPagecontainingtext("Motor Truck Cargo").isDisplayed(),true, true,test);
		se.element().selectPopupWithMagnifier(getCIM_MotorTruckCargo_TXT_MotorTruckCargoDescPropPredomComm(strCIM_MotorTruckCargo_TXT_MotorTruckCargoDescPropPredomComm), getCIM_MotorTruckCargo_TXT_MotorTruckCargoDescPropPredomComm_Search(strCIM_MotorTruckCargo_TXT_MotorTruckCargoDescPropPredomComm), strCIM_MotorTruckCargo_TXT_MotorTruckCargoDescPropPredomComm, strCIM_MotorTruckCargo_TXT_MotorTruckCargoDescPropPredomComm_FilterNeeded, strCIM_MotorTruckCargo_TXT_MotorTruckCargoDescPropPredomComm, constants.NA, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getCIM_MotorTruckCargo_TXT_MotorTruckCargoAddDescProp(strCIM_MotorTruckCargo_TXT_MotorTruckCargoAddDescProp),strCIM_MotorTruckCargo_TXT_MotorTruckCargoAddDescProp,test);
		se.element().selectPopupWithMagnifier(getCIM_MotorTruckCargo_TXT_RadiusOfOperation(strCIM_MotorTruckCargo_TXT_RadiusOfOperation), getCIM_MotorTruckCargo_TXT_RadiusOfOperation_Search(strCIM_MotorTruckCargo_TXT_RadiusOfOperation), strCIM_MotorTruckCargo_TXT_RadiusOfOperation, constants.NA, strCIM_MotorTruckCargo_TXT_RadiusOfOperation, constants.NA, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getCIM_MotorTruckCargo_TXT_Catastrophelimit(strCIM_MotorTruckCargo_TXT_Catastrophelimit),strCIM_MotorTruckCargo_TXT_Catastrophelimit,test);
		se.element().enterOrValidateText(getCIM_MotorTruckCargo_TXT_PropertyInVehiclesLim(strCIM_MotorTruckCargo_TXT_PropertyInVehiclesLim),strCIM_MotorTruckCargo_TXT_PropertyInVehiclesLim,test);	
	}
	catch(Exception e){
		
		se.verify().verifyEquals("Failed to fill in details for Covered Property section ", true, false, true, test);		
		}
}


public void optionalCoveragesSection(Map<String, String> row, ExtentTest test) throws IOException {


	String transaction = (String) row.get("Transaction Name");

	String strCIM_MotorTruckCargo_CHK_RefrigerationBreakdownCoverageNo = (String) row.get("CIM_MotorTruckCargo_CHK_RefrigerationBreakdownCoverageNo");
	String strCIM_MotorTruckCargo_CHK_RefrigerationBreakdownCoverageYes = (String) row.get("CIM_MotorTruckCargo_CHK_RefrigerationBreakdownCoverageYes");
	String strCIM_MotorTruckCargo_CHK_RefBrkdwnPropInTerminal_NotCovered = (String) row.get("CIM_MotorTruckCargo_CHK_RefBrkdwnPropInTerminal_NotCovered");
	String strCIM_MotorTruckCargo_CHK_RefBrkdwnPropInTerminal_Covered = (String) row.get("CIM_MotorTruckCargo_CHK_RefBrkdwnPropInTerminal_Covered");
	String strCIM_MotorTruckCargo_TXT_PropertyInTerminalLimit = (String) row.get("CIM_MotorTruckCargo_TXT_PropertyInTerminalLimit");
	String strCIM_MotorTruckCargo_CHK_RefBrkdwnPropInVehicleCov_NotCovered = (String) row.get("CIM_MotorTruckCargo_CHK_RefBrkdwnPropInVehicleCov_NotCovered");
	String strCIM_MotorTruckCargo_CHK_RefBrkdwnPropInVehicleCov_Covered = (String) row.get("CIM_MotorTruckCargo_CHK_RefBrkdwnPropInVehicleCov_Covered");
	String strCIM_MotorTruckCargo_TXT_RefrigBrkdwnCatastropheLim = (String) row.get("CIM_MotorTruckCargo_TXT_RefrigBrkdwnCatastropheLim");
	String strCIM_MotorTruckCargo_TXT_RefrigerationBreakdownDeductible = (String) row.get("CIM_MotorTruckCargo_TXT_RefrigerationBreakdownDeductible");
	
	try{
		se.log().logTestStep("Optional Coverages");
		test.log(LogStatus.INFO, "Optional Coverages section","Transaction Step : "+transaction + "<br>" +"Page : CIM_MotorTruckCargo");
		se.element().checkUncheckOrValidate(getCIM_MotorTruckCargo_CHK_RefrigerationBreakdownCoverageNo(strCIM_MotorTruckCargo_CHK_RefrigerationBreakdownCoverageNo),strCIM_MotorTruckCargo_CHK_RefrigerationBreakdownCoverageNo,test);
		se.element().checkUncheckOrValidate(getCIM_MotorTruckCargo_CHK_RefrigerationBreakdownCoverageYes(strCIM_MotorTruckCargo_CHK_RefrigerationBreakdownCoverageYes),strCIM_MotorTruckCargo_CHK_RefrigerationBreakdownCoverageYes,test);
		se.element().checkUncheckOrValidate(getCIM_MotorTruckCargo_CHK_RefBrkdwnPropInTerminal_NotCovered(strCIM_MotorTruckCargo_CHK_RefBrkdwnPropInTerminal_NotCovered),strCIM_MotorTruckCargo_CHK_RefBrkdwnPropInTerminal_NotCovered,test);
		se.element().checkUncheckOrValidate(getCIM_MotorTruckCargo_CHK_RefBrkdwnPropInTerminal_Covered(strCIM_MotorTruckCargo_CHK_RefBrkdwnPropInTerminal_Covered),strCIM_MotorTruckCargo_CHK_RefBrkdwnPropInTerminal_Covered,test);
		se.element().enterOrValidateText(getCIM_MotorTruckCargo_TXT_PropertyInTerminalLimit(strCIM_MotorTruckCargo_TXT_PropertyInTerminalLimit),strCIM_MotorTruckCargo_TXT_PropertyInTerminalLimit,test);
		se.element().checkUncheckOrValidate(getCIM_MotorTruckCargo_CHK_RefBrkdwnPropInVehicleCov_NotCovered(strCIM_MotorTruckCargo_CHK_RefBrkdwnPropInVehicleCov_NotCovered),strCIM_MotorTruckCargo_CHK_RefBrkdwnPropInVehicleCov_NotCovered,test);
		se.element().checkUncheckOrValidate(getCIM_MotorTruckCargo_CHK_RefBrkdwnPropInVehicleCov_Covered(strCIM_MotorTruckCargo_CHK_RefBrkdwnPropInVehicleCov_Covered),strCIM_MotorTruckCargo_CHK_RefBrkdwnPropInVehicleCov_Covered,test);
		se.element().enterOrValidateText(getCIM_MotorTruckCargo_TXT_RefrigBrkdwnCatastropheLim(strCIM_MotorTruckCargo_TXT_RefrigBrkdwnCatastropheLim),strCIM_MotorTruckCargo_TXT_RefrigBrkdwnCatastropheLim,test);
		se.element().enterOrValidateText(getCIM_MotorTruckCargo_TXT_RefrigerationBreakdownDeductible(strCIM_MotorTruckCargo_TXT_RefrigerationBreakdownDeductible),strCIM_MotorTruckCargo_TXT_RefrigerationBreakdownDeductible,test);
	}
	catch(Exception e){
		se.verify().verifyEquals("Failed to fill in details for Optional Coverages section ", true, false, true, test);		
		}
}


public void motorTruckCargoRatingSection(Map<String, String> row, ExtentTest test) throws IOException {


	String strCIM_MotorTruckCargo_TXT_ExposureBasis = (String) row.get("CIM_MotorTruckCargo_TXT_ExposureBasis");
	String strCIM_MotorTruckCargo_TXT_NumberOfPowerUnits = (String) row.get("CIM_MotorTruckCargo_TXT_NumberOfPowerUnits");
	String strCIM_MotorTruckCargo_CHK_OverrideExposureRate_Yes = (String) row.get("CIM_MotorTruckCargo_CHK_OverrideExposureRate_Yes");
	String strCIM_MotorTruckCargo_TXT_OverrideExposureRateReason = (String) row.get("CIM_MotorTruckCargo_TXT_OverrideExposureRateReason");
	String strCIM_MotorTruckCargo_CHK_OverrideExposureRate_No = (String) row.get("CIM_MotorTruckCargo_CHK_OverrideExposureRate_No");
	String transaction = (String) row.get("Transaction Name");
	String strCIM_MotorTruckCargo_TXT_OverrideExposureRateReason_FilterNeeded = (String) row.get("CIM_MotorTruckCargo_TXT_OverrideExposureRateReason_FilterNeeded");
	
	try{
		se.log().logTestStep("Motor Truck Cargo Rating");
		test.log(LogStatus.INFO, "Motor Truck Cargo Rating section","Transaction Step : "+transaction + "<br>" +"Page : CIM_MotorTruckCargo");
		se.element().selectPopupWithMagnifier(getCIM_MotorTruckCargo_TXT_ExposureBasis(strCIM_MotorTruckCargo_TXT_ExposureBasis), getCIM_MotorTruckCargo_TXT_ExposureBasis_Search(strCIM_MotorTruckCargo_TXT_ExposureBasis), strCIM_MotorTruckCargo_TXT_ExposureBasis, constants.NA, strCIM_MotorTruckCargo_TXT_ExposureBasis, constants.NA, constants.NA, constants.NA, test);
		se.element().enterOrValidateText(getCIM_MotorTruckCargo_TXT_NumberOfPowerUnits(strCIM_MotorTruckCargo_TXT_NumberOfPowerUnits),strCIM_MotorTruckCargo_TXT_NumberOfPowerUnits,test);
		se.element().checkUncheckOrValidate(getCIM_MotorTruckCargo_CHK_OverrideExposureRate_Yes(strCIM_MotorTruckCargo_CHK_OverrideExposureRate_Yes),strCIM_MotorTruckCargo_CHK_OverrideExposureRate_Yes,test);
		se.element().selectPopupWithMagnifier(getCIM_MotorTruckCargo_TXT_OverrideExposureRateReason(strCIM_MotorTruckCargo_TXT_OverrideExposureRateReason), getCIM_MotorTruckCargo_TXT_OverrideExposureRateReason_Search(strCIM_MotorTruckCargo_TXT_OverrideExposureRateReason), strCIM_MotorTruckCargo_TXT_OverrideExposureRateReason, strCIM_MotorTruckCargo_TXT_OverrideExposureRateReason_FilterNeeded, strCIM_MotorTruckCargo_TXT_OverrideExposureRateReason, constants.NA, constants.NA, constants.NA, test);
		se.element().checkUncheckOrValidate(getCIM_MotorTruckCargo_CHK_OverrideExposureRate_No(strCIM_MotorTruckCargo_CHK_OverrideExposureRate_No),strCIM_MotorTruckCargo_CHK_OverrideExposureRate_No,test);
		
	}
	catch(Exception e){
		
		se.verify().verifyEquals("Failed to fill in details for  section ", true, false, true, test);		
		}
}


public void ratingDetailsSection(Map<String, String> row, ExtentTest test) throws IOException {

	String strCIM_MotorTruckCargo_TXT_Rating_ExposureBasis = (String) row.get("CIM_MotorTruckCargo_TXT_Rating_ExposureBasis");
	String strCIM_MotorTruckCargo_TXT_Rating_RateBasis = (String) row.get("CIM_MotorTruckCargo_TXT_Rating_RateBasis");
	String strCIM_MotorTruckCargo_TXT_Rating_PropertyInVehiclesLim = (String) row.get("CIM_MotorTruckCargo_TXT_Rating_PropertyInVehiclesLim");
	String strCIM_MotorTruckCargo_TXT_Rating_ExposureRate = (String) row.get("CIM_MotorTruckCargo_TXT_Rating_ExposureRate");
	String strCIM_MotorTruckCargo_TXT_Rating_OverrideExposureRate = (String) row.get("CIM_MotorTruckCargo_TXT_Rating_OverrideExposureRate");
	String strCIM_MotorTruckCargo_TXT_Rating_BaseChargePerUnit = (String) row.get("CIM_MotorTruckCargo_TXT_Rating_BaseChargePerUnit");
	String strCIM_MotorTruckCargo_TXT_Rating_NumberOfPowerUnits = (String) row.get("CIM_MotorTruckCargo_TXT_Rating_NumberOfPowerUnits");
	String strCIM_MotorTruckCargo_TXT_Rating_BasePremium = (String) row.get("CIM_MotorTruckCargo_TXT_Rating_BasePremium");
	String strCIM_MotorTruckCargo_TXT_Rating_DeductibleFtr = (String) row.get("CIM_MotorTruckCargo_TXT_Rating_DeductibleFtr");
	String strCIM_MotorTruckCargo_TXT_Rating_TransitionFtr = (String) row.get("CIM_MotorTruckCargo_TXT_Rating_TransitionFtr");
	String strCIM_MotorTruckCargo_TXT_Rating_CommodityFtr = (String) row.get("CIM_MotorTruckCargo_TXT_Rating_CommodityFtr");
	String strCIM_MotorTruckCargo_TXT_Rating_RadiusFtr = (String) row.get("CIM_MotorTruckCargo_TXT_Rating_RadiusFtr");
	String strCIM_MotorTruckCargo_TXT_Rating_RefBrkdwnFtr = (String) row.get("CIM_MotorTruckCargo_TXT_Rating_RefBrkdwnFtr");
	String strCIM_MotorTruckCargo_TXT_Rating_MotorTruckCargoFinalPremium = (String) row.get("CIM_MotorTruckCargo_TXT_Rating_MotorTruckCargoFinalPremium");
	String transaction = (String) row.get("Transaction Name");
	
	
	try{
		se.log().logTestStep("Rating Details Section");
		test.log(LogStatus.INFO, "Rating Detail section","Transaction Step : "+transaction + "<br>" +"Page : CIM_MotorTruckCargo");
		se.element().enterOrValidateText(getCIM_MotorTruckCargo_TXT_Rating_ExposureBasis(strCIM_MotorTruckCargo_TXT_Rating_ExposureBasis),strCIM_MotorTruckCargo_TXT_Rating_ExposureBasis,test);
		se.element().enterOrValidateText(getCIM_MotorTruckCargo_TXT_Rating_RateBasis(strCIM_MotorTruckCargo_TXT_Rating_RateBasis),strCIM_MotorTruckCargo_TXT_Rating_RateBasis,test);
		se.element().enterOrValidateText(getCIM_MotorTruckCargo_TXT_Rating_PropertyInVehiclesLim(strCIM_MotorTruckCargo_TXT_Rating_PropertyInVehiclesLim),strCIM_MotorTruckCargo_TXT_Rating_PropertyInVehiclesLim,test);
		se.element().enterOrValidateText(getCIM_MotorTruckCargo_TXT_Rating_ExposureRate(strCIM_MotorTruckCargo_TXT_Rating_ExposureRate),strCIM_MotorTruckCargo_TXT_Rating_ExposureRate,test);
		se.element().enterOrValidateText(getCIM_MotorTruckCargo_TXT_Rating_OverrideExposureRate(strCIM_MotorTruckCargo_TXT_Rating_OverrideExposureRate),strCIM_MotorTruckCargo_TXT_Rating_OverrideExposureRate,test);
		se.element().enterOrValidateText(getCIM_MotorTruckCargo_TXT_Rating_BaseChargePerUnit(strCIM_MotorTruckCargo_TXT_Rating_BaseChargePerUnit),strCIM_MotorTruckCargo_TXT_Rating_BaseChargePerUnit,test);
		se.element().enterOrValidateText(getCIM_MotorTruckCargo_TXT_Rating_NumberOfPowerUnits(strCIM_MotorTruckCargo_TXT_Rating_NumberOfPowerUnits),strCIM_MotorTruckCargo_TXT_Rating_NumberOfPowerUnits,test);
		se.element().enterOrValidateText(getCIM_MotorTruckCargo_TXT_Rating_BasePremium(strCIM_MotorTruckCargo_TXT_Rating_BasePremium),strCIM_MotorTruckCargo_TXT_Rating_BasePremium,test);
		se.element().enterOrValidateText(getCIM_MotorTruckCargo_TXT_Rating_DeductibleFtr(strCIM_MotorTruckCargo_TXT_Rating_DeductibleFtr),strCIM_MotorTruckCargo_TXT_Rating_DeductibleFtr,test);
		se.element().enterOrValidateText(getCIM_MotorTruckCargo_TXT_Rating_TransitionFtr(strCIM_MotorTruckCargo_TXT_Rating_TransitionFtr),strCIM_MotorTruckCargo_TXT_Rating_TransitionFtr,test);
		se.element().enterOrValidateText(getCIM_MotorTruckCargo_TXT_Rating_CommodityFtr(strCIM_MotorTruckCargo_TXT_Rating_CommodityFtr),strCIM_MotorTruckCargo_TXT_Rating_CommodityFtr,test);
		se.element().enterOrValidateText(getCIM_MotorTruckCargo_TXT_Rating_RadiusFtr(strCIM_MotorTruckCargo_TXT_Rating_RadiusFtr),strCIM_MotorTruckCargo_TXT_Rating_RadiusFtr,test);
		se.element().enterOrValidateText(getCIM_MotorTruckCargo_TXT_Rating_RefBrkdwnFtr(strCIM_MotorTruckCargo_TXT_Rating_RefBrkdwnFtr),strCIM_MotorTruckCargo_TXT_Rating_RefBrkdwnFtr,test);
		se.element().enterOrValidateText(getCIM_MotorTruckCargo_TXT_Rating_MotorTruckCargoFinalPremium(strCIM_MotorTruckCargo_TXT_Rating_MotorTruckCargoFinalPremium),strCIM_MotorTruckCargo_TXT_Rating_MotorTruckCargoFinalPremium,test);
		
	}
	catch(Exception e){
		
		se.verify().verifyEquals("Failed to fill in details for Rating Details section ", true, false, true, test);		
		}
}



}
