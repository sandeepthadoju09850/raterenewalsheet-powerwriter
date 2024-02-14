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

public class CIM_Cargo extends OR_CIM{
	
	public void Cargo(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_Cargo")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_Cargo", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCIM_Cargo_TXT_CargoDescribedPropertyPredominantCommodity = (String) row.get("CIM_Cargo_TXT_CargoDescribedPropertyPredominantCommodity");
		String strCIM_Cargo_TXT_CargoDescribedPropertyPredominantCommodityFilterNeeded = (String) row.get("CIM_Cargo_TXT_CargoDescribedPropertyPredominantCommodityFilterNeeded");
		String strCIM_Cargo_TXT_CargoDescribedPropertyPredominantCommodityPopup_Grade = (String) row.get("CIM_Cargo_TXT_CargoDescribedPropertyPredominantCommodityPopup_Grade");
		String strCIM_Cargo_TXT_CargoDescribedPropertyPredominantCommodityPopup_HouseHold = (String) row.get("CIM_Cargo_TXT_CargoDescribedPropertyPredominantCommodityPopup_HouseHold");
		String strCIM_Cargo_TXT_CargoAdditionalDescribedProperty = (String) row.get("CIM_Cargo_TXT_CargoAdditionalDescribedProperty");
		String strCIM_Cargo_TXT_CoveredPropertyRadiusOfOperation = (String) row.get("CIM_Cargo_TXT_CoveredPropertyRadiusOfOperation");
		String strCIM_Cargo_TXT_CoveredPropertyCatatropheLimit = (String) row.get("CIM_Cargo_TXT_CoveredPropertyCatatropheLimit");
		String strCIM_Cargo_TXT_CoveredPropertyOwnedVechilesLimit = (String) row.get("CIM_Cargo_TXT_CoveredPropertyOwnedVechilesLimit");
		String strCIM_Cargo_CHK_RefrigerationBreakdownCoverage_Yes = (String) row.get("CIM_Cargo_CHK_RefrigerationBreakdownCoverage_Yes");
		String strCIM_Cargo_CHK_RefrigerationBreakdownCoverage_No = (String) row.get("CIM_Cargo_CHK_RefrigerationBreakdownCoverage_No");
		String strCIM_Cargo_CHK_RefrigerationBreakdownPropertyInTerminal_NotCovered = (String) row.get("CIM_Cargo_CHK_RefrigerationBreakdownPropertyInTerminal_NotCovered");
		String strCIM_Cargo_CHK_RefrigerationBreakdownPropertyInTerminal_Covered = (String) row.get("CIM_Cargo_CHK_RefrigerationBreakdownPropertyInTerminal_Covered");
		String strCIM_Cargo_TXT_PropertyInTerminalLimit = (String) row.get("CIM_Cargo_TXT_PropertyInTerminalLimit");
		String strCIM_Cargo_CHK_RefrigerationBreakdownPropertyInVehicleCoverage_NotCovered = (String) row.get("CIM_Cargo_CHK_RefrigerationBreakdownPropertyInVehicleCoverage_NotCovered");
		String strCIM_Cargo_CHK_RefrigerationBreakdownPropertyInVehicleCoverage_Covered = (String) row.get("CIM_Cargo_CHK_RefrigerationBreakdownPropertyInVehicleCoverage_Covered");
		String strCIM_Cargo_TXT_PropertyInVechileLimit = (String) row.get("CIM_Cargo_TXT_PropertyInVechileLimit");
		String strCIM_Cargo_TXT_RefrigerationBreakdownCatastropheLimit = (String) row.get("CIM_Cargo_TXT_RefrigerationBreakdownCatastropheLimit");
		String strCIM_Cargo_TXT_RefrigerationBreakdownDeductible = (String) row.get("CIM_Cargo_TXT_RefrigerationBreakdownDeductible");
		String strCIM_Cargo_TXT_ExposureBasis = (String) row.get("CIM_Cargo_TXT_ExposureBasis");
		String strCIM_Cargo_TXT_NumberOfPowerUnits = (String) row.get("CIM_Cargo_TXT_NumberOfPowerUnits");
		String strCIM_Cargo_CHK_OverrideExposureRate_Yes = (String) row.get("CIM_Cargo_CHK_OverrideExposureRate_Yes");
		String strCIM_Cargo_CHK_OverrideExposureRate_No = (String) row.get("CIM_Cargo_CHK_OverrideExposureRate_No");
		String strCIM_Cargo_TXT_OverrideExposureRateReason = (String) row.get("CIM_Cargo_TXT_OverrideExposureRateReason");
		String strCIM_Cargo_TXT_OverrideExposureRateReasonFilterNeeded = (String) row.get("CIM_Cargo_TXT_OverrideExposureRateReasonFilterNeeded");
		String strCIM_Cargo_TXT_AnnualPremiumCharge = (String) row.get("CIM_Cargo_TXT_AnnualPremiumCharge");
		String strCIM_Cargo_TXT_RatingDetailsExposureBasis = (String) row.get("CIM_Cargo_TXT_RatingDetailsExposureBasis");
		String strCIM_Cargo_TXT_RateBasis = (String) row.get("CIM_Cargo_TXT_RateBasis");
		String strCIM_Cargo_TXT_OwnVechiclesLimit = (String) row.get("CIM_Cargo_TXT_OwnVechiclesLimit");
		String strCIM_Cargo_TXT_ExposureRate = (String) row.get("CIM_Cargo_TXT_ExposureRate");
		String strCIM_Cargo_TXT_OverrideExposureRate = (String) row.get("CIM_Cargo_TXT_OverrideExposureRate");
		String strCIM_Cargo_TXT_BaseChargePerUnit = (String) row.get("CIM_Cargo_TXT_BaseChargePerUnit");
		String strCIM_Cargo_TXT_RatingDetailsNumberOfPowerUnits = (String) row.get("CIM_Cargo_TXT_RatingDetailsNumberOfPowerUnits");
		String strCIM_Cargo_TXT_RatingDetailsAnnualPremiumCharge = (String) row.get("CIM_Cargo_TXT_RatingDetailsAnnualPremiumCharge");
		String strCIM_Cargo_TXT_BasePremium = (String) row.get("CIM_Cargo_TXT_BasePremium");
		String strCIM_Cargo_TXT_DeductibleFactor = (String) row.get("CIM_Cargo_TXT_DeductibleFactor");
		String strCIM_Cargo_TXT_TransitionFactor = (String) row.get("CIM_Cargo_TXT_TransitionFactor");
		String strCIM_Cargo_TXT_CommodityFactor = (String) row.get("CIM_Cargo_TXT_CommodityFactor");
		String strCIM_Cargo_TXT_RadiusFactor = (String) row.get("CIM_Cargo_TXT_RadiusFactor");
		String strCIM_Cargo_TXT_RefrigerationBreakdownFactor = (String) row.get("CIM_Cargo_TXT_RefrigerationBreakdownFactor");
		String strCIM_Cargo_TXT_CargoFinalPremium = (String) row.get("CIM_Cargo_TXT_CargoFinalPremium");

		try{
			se.log().logTestStep("Cargo");
			test.log(LogStatus.INFO, "Cargo page","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMCargo");
			se.verify().verifyEquals("Cargo page of PowerWriter ", getCIM_Cargo_TXT_VerifyCargoText().isDisplayed(),true, true,test);
			se.element().selectPopupWithMagnifier(getCIM_Cargo_TXT_CargoDescribedPropertyPredominantCommodity(strCIM_Cargo_TXT_CargoDescribedPropertyPredominantCommodity), getCIM_Cargo_BTN_CargoDescribedPropertyPredominantCommoditySearch(strCIM_Cargo_TXT_CargoDescribedPropertyPredominantCommodity), strCIM_Cargo_TXT_CargoDescribedPropertyPredominantCommodity,strCIM_Cargo_TXT_CargoDescribedPropertyPredominantCommodityFilterNeeded, strCIM_Cargo_TXT_CargoDescribedPropertyPredominantCommodity,strCIM_Cargo_TXT_CargoDescribedPropertyPredominantCommodityPopup_Grade, strCIM_Cargo_TXT_CargoDescribedPropertyPredominantCommodityPopup_HouseHold, constants.NA, test);
			se.element().enterOrValidateText(getCIM_Cargo_TXT_CargoAdditionalDescribedProperty(strCIM_Cargo_TXT_CargoAdditionalDescribedProperty),strCIM_Cargo_TXT_CargoAdditionalDescribedProperty,test);
			se.element().selectPopupWithMagnifier(getCIM_Cargo_TXT_CoveredPropertyRadiusOfOperation(strCIM_Cargo_TXT_CoveredPropertyRadiusOfOperation), getCIM_Cargo_BTN_CoveredPropertyRadiusOfOperationSearch(strCIM_Cargo_TXT_CoveredPropertyRadiusOfOperation), strCIM_Cargo_TXT_CoveredPropertyRadiusOfOperation,constants.NA, strCIM_Cargo_TXT_CoveredPropertyRadiusOfOperation,constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCIM_Cargo_TXT_CoveredPropertyCatatropheLimit(strCIM_Cargo_TXT_CoveredPropertyCatatropheLimit),strCIM_Cargo_TXT_CoveredPropertyCatatropheLimit,test);
			se.element().enterOrValidateText(getCIM_Cargo_TXT_CoveredPropertyOwnedVechilesLimit(strCIM_Cargo_TXT_CoveredPropertyOwnedVechilesLimit),strCIM_Cargo_TXT_CoveredPropertyOwnedVechilesLimit,test);
			se.element().checkUncheckOrValidate(getCIM_Cargo_CHK_RefrigerationBreakdownCoverage_Yes(strCIM_Cargo_CHK_RefrigerationBreakdownCoverage_Yes),strCIM_Cargo_CHK_RefrigerationBreakdownCoverage_Yes,test);
			se.element().checkUncheckOrValidate(getCIM_Cargo_CHK_RefrigerationBreakdownCoverage_No(strCIM_Cargo_CHK_RefrigerationBreakdownCoverage_No),strCIM_Cargo_CHK_RefrigerationBreakdownCoverage_No,test);
			se.element().checkUncheckOrValidate(getCIM_Cargo_CHK_RefrigerationBreakdownPropertyInTerminal_NotCovered(strCIM_Cargo_CHK_RefrigerationBreakdownPropertyInTerminal_NotCovered),strCIM_Cargo_CHK_RefrigerationBreakdownPropertyInTerminal_NotCovered,test);
			se.element().checkUncheckOrValidate(getCIM_Cargo_CHK_RefrigerationBreakdownPropertyInTerminal_Covered(strCIM_Cargo_CHK_RefrigerationBreakdownPropertyInTerminal_Covered),strCIM_Cargo_CHK_RefrigerationBreakdownPropertyInTerminal_Covered,test);
			se.element().enterOrValidateText(getCIM_Cargo_TXT_PropertyInTerminalLimit(strCIM_Cargo_TXT_PropertyInTerminalLimit),strCIM_Cargo_TXT_PropertyInTerminalLimit,test);
			se.element().checkUncheckOrValidate(getCIM_Cargo_CHK_RefrigerationBreakdownPropertyInVehicleCoverage_NotCovered(strCIM_Cargo_CHK_RefrigerationBreakdownPropertyInVehicleCoverage_NotCovered),strCIM_Cargo_CHK_RefrigerationBreakdownPropertyInVehicleCoverage_NotCovered,test);
			se.element().checkUncheckOrValidate(getCIM_Cargo_CHK_RefrigerationBreakdownPropertyInVehicleCoverage_Covered(strCIM_Cargo_CHK_RefrigerationBreakdownPropertyInVehicleCoverage_Covered),strCIM_Cargo_CHK_RefrigerationBreakdownPropertyInVehicleCoverage_Covered,test);
			se.element().enterOrValidateText(getCIM_Cargo_TXT_PropertyInVechileLimit(strCIM_Cargo_TXT_PropertyInVechileLimit),strCIM_Cargo_TXT_PropertyInVechileLimit,test);
			se.element().enterOrValidateText(getCIM_Cargo_TXT_RefrigerationBreakdownCatastropheLimit(strCIM_Cargo_TXT_RefrigerationBreakdownCatastropheLimit),strCIM_Cargo_TXT_RefrigerationBreakdownCatastropheLimit,test);
			se.element().enterOrValidateText(getCIM_Cargo_TXT_RefrigerationBreakdownDeductible(strCIM_Cargo_TXT_RefrigerationBreakdownDeductible),strCIM_Cargo_TXT_RefrigerationBreakdownDeductible,test);
			se.element().selectPopupWithMagnifier(getCIM_Cargo_TXT_ExposureBasis(strCIM_Cargo_TXT_ExposureBasis), getCIM_Cargo_BTN_ExposureBasisSearch(strCIM_Cargo_TXT_ExposureBasis), strCIM_Cargo_TXT_ExposureBasis,constants.NA, strCIM_Cargo_TXT_ExposureBasis,constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCIM_Cargo_TXT_NumberOfPowerUnits(strCIM_Cargo_TXT_NumberOfPowerUnits),strCIM_Cargo_TXT_NumberOfPowerUnits,test);
			se.element().checkUncheckOrValidate(getCIM_Cargo_CHK_OverrideExposureRate_Yes(strCIM_Cargo_CHK_OverrideExposureRate_Yes),strCIM_Cargo_CHK_OverrideExposureRate_Yes,test);
			se.element().checkUncheckOrValidate(getCIM_Cargo_CHK_OverrideExposureRate_No(strCIM_Cargo_CHK_OverrideExposureRate_No),strCIM_Cargo_CHK_OverrideExposureRate_No,test);
			se.element().selectPopupWithMagnifier(getCIM_Cargo_TXT_OverrideExposureRateReason(strCIM_Cargo_TXT_OverrideExposureRateReason), getCIM_Cargo_BTN_OverrideExposureRateReasonSearch(strCIM_Cargo_TXT_OverrideExposureRateReason), strCIM_Cargo_TXT_OverrideExposureRateReason,strCIM_Cargo_TXT_OverrideExposureRateReasonFilterNeeded, strCIM_Cargo_TXT_OverrideExposureRateReason,constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCIM_Cargo_TXT_AnnualPremiumCharge(strCIM_Cargo_TXT_AnnualPremiumCharge),strCIM_Cargo_TXT_AnnualPremiumCharge,test);
			se.element().enterOrValidateText(getCIM_Cargo_TXT_RatingDetailsExposureBasis(strCIM_Cargo_TXT_RatingDetailsExposureBasis),strCIM_Cargo_TXT_RatingDetailsExposureBasis,test);
			se.element().enterOrValidateText(getCIM_Cargo_TXT_RateBasis(strCIM_Cargo_TXT_RateBasis),strCIM_Cargo_TXT_RateBasis,test);
			se.element().enterOrValidateText(getCIM_Cargo_TXT_OwnVechiclesLimit(strCIM_Cargo_TXT_OwnVechiclesLimit),strCIM_Cargo_TXT_OwnVechiclesLimit,test);
			se.element().enterOrValidateText(getCIM_Cargo_TXT_ExposureRate(strCIM_Cargo_TXT_ExposureRate),strCIM_Cargo_TXT_ExposureRate,test);
			se.element().enterOrValidateText(getCIM_Cargo_TXT_OverrideExposureRate(strCIM_Cargo_TXT_OverrideExposureRate),strCIM_Cargo_TXT_OverrideExposureRate,test);
			se.element().enterOrValidateText(getCIM_Cargo_TXT_BaseChargePerUnit(strCIM_Cargo_TXT_BaseChargePerUnit),strCIM_Cargo_TXT_BaseChargePerUnit,test);
			se.element().enterOrValidateText(getCIM_Cargo_TXT_RatingDetailsNumberOfPowerUnits(strCIM_Cargo_TXT_RatingDetailsNumberOfPowerUnits),strCIM_Cargo_TXT_RatingDetailsNumberOfPowerUnits,test);
			se.element().enterOrValidateText(getCIM_Cargo_TXT_RatingDetailsAnnualPremiumCharge(strCIM_Cargo_TXT_RatingDetailsAnnualPremiumCharge),strCIM_Cargo_TXT_RatingDetailsAnnualPremiumCharge,test);
			se.element().enterOrValidateText(getCIM_Cargo_TXT_BasePremium(strCIM_Cargo_TXT_BasePremium),strCIM_Cargo_TXT_BasePremium,test);
			se.element().enterOrValidateText(getCIM_Cargo_TXT_DeductibleFactor(strCIM_Cargo_TXT_DeductibleFactor),strCIM_Cargo_TXT_DeductibleFactor,test);
			se.element().enterOrValidateText(getCIM_Cargo_TXT_TransitionFactor(strCIM_Cargo_TXT_TransitionFactor),strCIM_Cargo_TXT_TransitionFactor,test);
			se.element().enterOrValidateText(getCIM_Cargo_TXT_CommodityFactor(strCIM_Cargo_TXT_CommodityFactor),strCIM_Cargo_TXT_CommodityFactor,test);
			se.element().enterOrValidateText(getCIM_Cargo_TXT_RadiusFactor(strCIM_Cargo_TXT_RadiusFactor),strCIM_Cargo_TXT_RadiusFactor,test);
			se.element().enterOrValidateText(getCIM_Cargo_TXT_RefrigerationBreakdownFactor(strCIM_Cargo_TXT_RefrigerationBreakdownFactor),strCIM_Cargo_TXT_RefrigerationBreakdownFactor,test);
			se.element().enterOrValidateText(getCIM_Cargo_TXT_CargoFinalPremium(strCIM_Cargo_TXT_CargoFinalPremium),strCIM_Cargo_TXT_CargoFinalPremium,test);
			
			se.element().Click(getNext(),test);
		
	}
		catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for Cargo ", true, false, true, test);
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
