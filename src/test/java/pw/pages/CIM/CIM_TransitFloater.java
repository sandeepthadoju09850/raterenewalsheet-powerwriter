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

public class CIM_TransitFloater extends OR_CIM {

	public void CIM_TransitFloaterPage(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_TransitFloater")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_TransitFloater", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		try {
			CIM_TransitFloater CIM_TransitFloaterPage = TestPageFactory.initElements(se,CIM_TransitFloater.class);
			CIM_TransitFloaterPage.coveredPropertySection(row, test);
			CIM_TransitFloaterPage.transportationLimitsSection(row, test);
			CIM_TransitFloaterPage.optionalCoveragesSection(row, test);
			CIM_TransitFloaterPage.transitFloaterRatingSection(row, test);
			CIM_TransitFloaterPage.ratingDetailsSection(row, test);
			se.element().Click(getNext(),test);
		
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for TransitFloater page ", true, false,true, test);
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
		String strCIM_TransitFloater_TXT_TransitFloaterDecPropPredominantComm = (String) row.get("CIM_TransitFloater_TXT_TransitFloaterDecPropPredominantComm");
		String strCIM_TransitFloater_TXT_TransitFloaterDecPropPredominantCommFiterNeeded = (String) row.get("CIM_TransitFloater_TXT_TransitFloaterDecPropPredominantCommFiterNeeded");
		String strCIM_TransitFloater_TXT_TransitFlaoterAdditionalDescProp = (String) row.get("CIM_TransitFloater_TXT_TransitFlaoterAdditionalDescProp");
		String strCIM_TransitFloater_TXT_RadiusOfOperation = (String) row.get("CIM_TransitFloater_TXT_RadiusOfOperation");
		String strCIM_TransitFloater_TXT_CatastropheLimit = (String) row.get("CIM_TransitFloater_TXT_CatastropheLimit");
		String transaction = (String) row.get("Transaction Name");
		try{
			se.log().logTestStep("Covered Property");
			test.log(LogStatus.INFO, "Covered Property section","Transaction Step : "+transaction + "<br>" +"Page : CIM_TransitFloater");
			se.verify().verifyEquals("Covered Property of PowerWriter ", getPagecontainingtext("Transit Floater").isDisplayed(),true, true,test);
			se.element().selectPopupWithMagnifier(getCIM_TransitFloater_TXT_TransitFloaterDecPropPredominantComm(strCIM_TransitFloater_TXT_TransitFloaterDecPropPredominantComm), getCIM_TransitFloater_TXT_TransitFloaterDecPropPredominantCommSearch(), strCIM_TransitFloater_TXT_TransitFloaterDecPropPredominantComm, strCIM_TransitFloater_TXT_TransitFloaterDecPropPredominantCommFiterNeeded, strCIM_TransitFloater_TXT_TransitFloaterDecPropPredominantComm, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCIM_TransitFloater_TXT_TransitFlaoterAdditionalDescProp(strCIM_TransitFloater_TXT_TransitFlaoterAdditionalDescProp),strCIM_TransitFloater_TXT_TransitFlaoterAdditionalDescProp,test);
			se.element().selectPopupWithMagnifier(getCIM_TransitFloater_TXT_RadiusOfOperation(strCIM_TransitFloater_TXT_RadiusOfOperation), getCIM_TransitFloater_TXT_RadiusOfOperationSearch(), strCIM_TransitFloater_TXT_RadiusOfOperation, constants.NA, strCIM_TransitFloater_TXT_RadiusOfOperation, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCIM_TransitFloater_TXT_CatastropheLimit(strCIM_TransitFloater_TXT_CatastropheLimit),strCIM_TransitFloater_TXT_CatastropheLimit,test);
		}
		catch(Exception e) {
			se.verify().verifyEquals("Failed to fill in details for TransitFloater page ", true, false,true, test);		
			}
	}
	
	public void transportationLimitsSection(Map<String, String> row, ExtentTest test) throws IOException {
		
		String strCIM_TransitFloater_TXT_AnyConveyanceLimit = (String) row.get("CIM_TransitFloater_TXT_AnyConveyanceLimit");
		String strCIM_TransitFloater_TXT_AircraftLimit = (String) row.get("CIM_TransitFloater_TXT_AircraftLimit");
		String strCIM_TransitFloater_TXT_OwnedVehicleLimit = (String) row.get("CIM_TransitFloater_TXT_OwnedVehicleLimit");
		String strCIM_TransitFloater_TXT_CarrierForHireLimit = (String) row.get("CIM_TransitFloater_TXT_CarrierForHireLimit");
		String strCIM_TransitFloater_TXT_RailroadAnyoneRailroadCarLimit = (String) row.get("CIM_TransitFloater_TXT_RailroadAnyoneRailroadCarLimit");
		String strCIM_TransitFloater_TXT_RailroadAnyOneTrainLimit = (String) row.get("CIM_TransitFloater_TXT_RailroadAnyOneTrainLimit");
		String transaction = (String) row.get("Transaction Name");
		try{
			se.log().logTestStep("Transportation Limits Section");
			test.log(LogStatus.INFO, "Transportation Limits Section","Transaction Step : "+transaction + "<br>" +"Page : CIM_TransitFloater");
			se.element().enterOrValidateText(getCIM_TransitFloater_TXT_AnyConveyanceLimit(strCIM_TransitFloater_TXT_AnyConveyanceLimit),strCIM_TransitFloater_TXT_AnyConveyanceLimit,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_TXT_AircraftLimit(strCIM_TransitFloater_TXT_AircraftLimit),strCIM_TransitFloater_TXT_AircraftLimit,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_TXT_OwnedVehicleLimit(strCIM_TransitFloater_TXT_OwnedVehicleLimit),strCIM_TransitFloater_TXT_OwnedVehicleLimit,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_TXT_CarrierForHireLimit(strCIM_TransitFloater_TXT_CarrierForHireLimit),strCIM_TransitFloater_TXT_CarrierForHireLimit,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_TXT_RailroadAnyoneRailroadCarLimit(strCIM_TransitFloater_TXT_RailroadAnyoneRailroadCarLimit),strCIM_TransitFloater_TXT_RailroadAnyoneRailroadCarLimit,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_TXT_RailroadAnyOneTrainLimit(strCIM_TransitFloater_TXT_RailroadAnyOneTrainLimit),strCIM_TransitFloater_TXT_RailroadAnyOneTrainLimit,test);
		}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for TransitFloater page ", true, false,true, test);		
			}
	}
	
	public void optionalCoveragesSection(Map<String, String> row, ExtentTest test) throws IOException {
		
		String strCIM_TransitFloater_CHK_RefrigerationBreakdownCoverageYes = (String) row.get("CIM_TransitFloater_CHK_RefrigerationBreakdownCoverageYes");
		String strCIM_TransitFloater_CHK_RefrigerationBreakdownCoverageNo = (String) row.get("CIM_TransitFloater_CHK_RefrigerationBreakdownCoverageNo");
		String strCIM_TransitFloater_TXT_RefBreakdownConveyanceLimit = (String) row.get("CIM_TransitFloater_TXT_RefBreakdownConveyanceLimit");
		String strCIM_TransitFloater_TXT_RefBreakdownCatastropheLimit = (String) row.get("CIM_TransitFloater_TXT_RefBreakdownCatastropheLimit");
		String strCIM_TransitFloater_TXT_RefBreakdownDeductible = (String) row.get("CIM_TransitFloater_TXT_RefBreakdownDeductible");
		String transaction = (String) row.get("Transaction Name");
		try{
			se.log().logTestStep("Optional Coverages Section");
			test.log(LogStatus.INFO, "Optional Coverages Section","Transaction Step : "+transaction + "<br>" +"Page : CIM_TransitFloater");	
			se.element().checkUncheckOrValidate(getCIM_TransitFloater_CHK_RefrigerationBreakdownCoverageYes(strCIM_TransitFloater_CHK_RefrigerationBreakdownCoverageYes),strCIM_TransitFloater_CHK_RefrigerationBreakdownCoverageYes,test);
			se.element().checkUncheckOrValidate(getCIM_TransitFloater_CHK_RefrigerationBreakdownCoverageNo(strCIM_TransitFloater_CHK_RefrigerationBreakdownCoverageNo),strCIM_TransitFloater_CHK_RefrigerationBreakdownCoverageNo,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_TXT_RefBreakdownConveyanceLimit(strCIM_TransitFloater_TXT_RefBreakdownConveyanceLimit),strCIM_TransitFloater_TXT_RefBreakdownConveyanceLimit,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_TXT_RefBreakdownCatastropheLimit(strCIM_TransitFloater_TXT_RefBreakdownCatastropheLimit),strCIM_TransitFloater_TXT_RefBreakdownCatastropheLimit,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_TXT_RefBreakdownDeductible(strCIM_TransitFloater_TXT_RefBreakdownDeductible),strCIM_TransitFloater_TXT_RefBreakdownDeductible,test);
		}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in Optional Coverages Section details for TransitFloater page ", true, false,true, test);		
			}
	}
	
	public void transitFloaterRatingSection(Map<String, String> row, ExtentTest test) throws IOException {

		String strCIM_TransitFloater_TXT_ExposureBasis = (String) row.get("CIM_TransitFloater_TXT_ExposureBasis");
		String strCIM_TransitFloater_TXT_AnnualValueShipped = (String) row.get("CIM_TransitFloater_TXT_AnnualValueShipped");
		String strCIM_TransitFloater_CHK_OverrideExposureRateYes = (String) row.get("CIM_TransitFloater_CHK_OverrideExposureRateYes");
		String strCIM_TransitFloater_TXT_OverrideExposureRateReason = (String) row.get("CIM_TransitFloater_TXT_OverrideExposureRateReason");
		String strCIM_TransitFloater_TXT_OverrideExposureRateReasonFilterNeeded = (String) row.get("CIM_TransitFloater_TXT_OverrideExposureRateReasonFilterNeeded");
		String strCIM_TransitFloater_CHK_OverrideExposureRateNo = (String) row.get("CIM_TransitFloater_CHK_OverrideExposureRateNo");
		String strCIM_TransitFloater_CHK_OverrideLimitDifferentialYes = (String) row.get("CIM_TransitFloater_CHK_OverrideLimitDifferentialYes");
		String strCIM_TransitFloater_TXT_OverrideLimitDifferentialReason = (String) row.get("CIM_TransitFloater_TXT_OverrideLimitDifferentialReason");
		String strCIM_TransitFloater_TXT_OverrideLimitDifferentialReasonFilterNeeded = (String) row.get("CIM_TransitFloater_TXT_OverrideLimitDifferentialReasonFilterNeeded");
		String strCIM_TransitFloater_CHK_OverrideLimitDifferentialNo = (String) row.get("CIM_TransitFloater_CHK_OverrideLimitDifferentialNo");
		String transaction = (String) row.get("Transaction Name");
		try{
			se.log().logTestStep("Transit Floater Rating Section");
			test.log(LogStatus.INFO, "Transit Floater Rating Section","Transaction Step : "+transaction + "<br>" +"Page : CIM_TransitFloater");	
			//se.element().enterOrValidateText(getCIM_TransitFloater_TXT_ExposureBasis(strCIM_TransitFloater_TXT_ExposureBasis),strCIM_TransitFloater_TXT_ExposureBasis,test);
			se.element().selectPopupWithMagnifier(getCIM_TransitFloater_TXT_ExposureBasis(strCIM_TransitFloater_TXT_ExposureBasis), getCIM_TransitFloater_TXT_ExposureBasisSearch(), strCIM_TransitFloater_TXT_ExposureBasis, constants.NA, strCIM_TransitFloater_TXT_ExposureBasis, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCIM_TransitFloater_TXT_AnnualValueShipped(strCIM_TransitFloater_TXT_AnnualValueShipped),strCIM_TransitFloater_TXT_AnnualValueShipped,test);
			se.element().checkUncheckOrValidate(getCIM_TransitFloater_CHK_OverrideExposureRateYes(strCIM_TransitFloater_CHK_OverrideExposureRateYes),strCIM_TransitFloater_CHK_OverrideExposureRateYes,test);
			//se.element().enterOrValidateText(getCIM_TransitFloater_TXT_OverrideExposureRateReason(strCIM_TransitFloater_TXT_OverrideExposureRateReason),strCIM_TransitFloater_TXT_OverrideExposureRateReason,test);
			se.element().selectPopupWithMagnifier(getCIM_TransitFloater_TXT_OverrideExposureRateReason(strCIM_TransitFloater_TXT_OverrideExposureRateReason), getCIM_TransitFloater_TXT_OverrideExposureRateReasonSearch(strCIM_TransitFloater_TXT_OverrideExposureRateReason), strCIM_TransitFloater_TXT_OverrideExposureRateReason, strCIM_TransitFloater_TXT_OverrideExposureRateReasonFilterNeeded, strCIM_TransitFloater_TXT_OverrideExposureRateReason, constants.NA, constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(getCIM_TransitFloater_CHK_OverrideExposureRateNo(strCIM_TransitFloater_CHK_OverrideExposureRateNo),strCIM_TransitFloater_CHK_OverrideExposureRateNo,test);
			se.element().checkUncheckOrValidate(getCIM_TransitFloater_CHK_OverrideLimitDifferentialYes(strCIM_TransitFloater_CHK_OverrideLimitDifferentialYes),strCIM_TransitFloater_CHK_OverrideLimitDifferentialYes,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_TXT_OverrideLimitDifferentialReason(strCIM_TransitFloater_TXT_OverrideLimitDifferentialReason),strCIM_TransitFloater_TXT_OverrideLimitDifferentialReason,test);
			se.element().selectPopupWithMagnifier(getCIM_TransitFloater_TXT_OverrideLimitDifferentialReason(strCIM_TransitFloater_TXT_OverrideLimitDifferentialReason), getCIM_TransitFloater_TXT_OverrideLimitDifferentialReasonSearch(strCIM_TransitFloater_TXT_OverrideLimitDifferentialReason), strCIM_TransitFloater_TXT_OverrideLimitDifferentialReason, strCIM_TransitFloater_TXT_OverrideLimitDifferentialReasonFilterNeeded, strCIM_TransitFloater_TXT_OverrideLimitDifferentialReason, constants.NA, constants.NA, constants.NA, test);
			
			se.element().checkUncheckOrValidate(getCIM_TransitFloater_CHK_OverrideLimitDifferentialNo(strCIM_TransitFloater_CHK_OverrideLimitDifferentialNo),strCIM_TransitFloater_CHK_OverrideLimitDifferentialNo,test);
			
		}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in Transit Floater Rating Section details for TransitFloater page ", true, false,true, test);		
			}
	}
	
	public void ratingDetailsSection(Map<String, String> row, ExtentTest test) throws IOException {
		
		String strCIM_TransitFloater_TXT_Rating_ExposureBasis = (String) row.get("CIM_TransitFloater_TXT_Rating_ExposureBasis");
		String strCIM_TransitFloater_TXT_Rating_Ratebasis = (String) row.get("CIM_TransitFloater_TXT_Rating_Ratebasis");
		String strCIM_TransitFloater_TXT_Rating_AnnualValueShipped = (String) row.get("CIM_TransitFloater_TXT_Rating_AnnualValueShipped");
		String strCIM_TransitFloater_TXT_Rating_ExposureRate = (String) row.get("CIM_TransitFloater_TXT_Rating_ExposureRate");
		String strCIM_TransitFloater_TXT_Rating_OverrideExposureRate = (String) row.get("CIM_TransitFloater_TXT_Rating_OverrideExposureRate");
		String strCIM_TransitFloater_TXT_Rating_LimitDifferential = (String) row.get("CIM_TransitFloater_TXT_Rating_LimitDifferential");
		String strCIM_TransitFloater_TXT_Rating_LimitDiffOverride = (String) row.get("CIM_TransitFloater_TXT_Rating_LimitDiffOverride");
		String strCIM_TransitFloater_TXT_Rating_BasePremium = (String) row.get("CIM_TransitFloater_TXT_Rating_BasePremium");
		String strCIM_TransitFloater_TXT_Rating_DeductibleFtr = (String) row.get("CIM_TransitFloater_TXT_Rating_DeductibleFtr");
		String strCIM_TransitFloater_TXT_Rating_TransitionFtr = (String) row.get("CIM_TransitFloater_TXT_Rating_TransitionFtr");
		String strCIM_TransitFloater_TXT_Rating_CommodityFtr = (String) row.get("CIM_TransitFloater_TXT_Rating_CommodityFtr");
		String strCIM_TransitFloater_TXT_Rating_RadiusFtr = (String) row.get("CIM_TransitFloater_TXT_Rating_RadiusFtr");
		String strCIM_TransitFloater_TXT_Rating_RefrigerationBreakdownFtr = (String) row.get("CIM_TransitFloater_TXT_Rating_RefrigerationBreakdownFtr");
		String strCIM_TransitFloater_TXT_Rating_TransitFloaterFinalPrem = (String) row.get("CIM_TransitFloater_TXT_Rating_TransitFloaterFinalPrem");
		String transaction = (String) row.get("Transaction Name");
		
		try{
			se.log().logTestStep("Rating Details Section");
			test.log(LogStatus.INFO, "Rating Details Section","Transaction Step : "+transaction + "<br>" +"Page : CIM_TransitFloater");	
			se.element().enterOrValidateText(getCIM_TransitFloater_TXT_Rating_ExposureBasis(strCIM_TransitFloater_TXT_Rating_ExposureBasis),strCIM_TransitFloater_TXT_Rating_ExposureBasis,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_TXT_Rating_Ratebasis(strCIM_TransitFloater_TXT_Rating_Ratebasis),strCIM_TransitFloater_TXT_Rating_Ratebasis,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_TXT_Rating_AnnualValueShipped(strCIM_TransitFloater_TXT_Rating_AnnualValueShipped),strCIM_TransitFloater_TXT_Rating_AnnualValueShipped,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_TXT_Rating_ExposureRate(strCIM_TransitFloater_TXT_Rating_ExposureRate),strCIM_TransitFloater_TXT_Rating_ExposureRate,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_TXT_Rating_OverrideExposureRate(strCIM_TransitFloater_TXT_Rating_OverrideExposureRate),strCIM_TransitFloater_TXT_Rating_OverrideExposureRate,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_TXT_Rating_LimitDifferential(strCIM_TransitFloater_TXT_Rating_LimitDifferential),strCIM_TransitFloater_TXT_Rating_LimitDifferential,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_TXT_Rating_LimitDiffOverride(strCIM_TransitFloater_TXT_Rating_LimitDiffOverride),strCIM_TransitFloater_TXT_Rating_LimitDiffOverride,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_TXT_Rating_BasePremium(strCIM_TransitFloater_TXT_Rating_BasePremium),strCIM_TransitFloater_TXT_Rating_BasePremium,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_TXT_Rating_DeductibleFtr(strCIM_TransitFloater_TXT_Rating_DeductibleFtr),strCIM_TransitFloater_TXT_Rating_DeductibleFtr,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_TXT_Rating_TransitionFtr(strCIM_TransitFloater_TXT_Rating_TransitionFtr),strCIM_TransitFloater_TXT_Rating_TransitionFtr,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_TXT_Rating_CommodityFtr(strCIM_TransitFloater_TXT_Rating_CommodityFtr),strCIM_TransitFloater_TXT_Rating_CommodityFtr,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_TXT_Rating_RadiusFtr(strCIM_TransitFloater_TXT_Rating_RadiusFtr),strCIM_TransitFloater_TXT_Rating_RadiusFtr,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_TXT_Rating_RefrigerationBreakdownFtr(strCIM_TransitFloater_TXT_Rating_RefrigerationBreakdownFtr),strCIM_TransitFloater_TXT_Rating_RefrigerationBreakdownFtr,test);
			se.element().enterOrValidateText(getCIM_TransitFloater_TXT_Rating_TransitFloaterFinalPrem(strCIM_TransitFloater_TXT_Rating_TransitFloaterFinalPrem),strCIM_TransitFloater_TXT_Rating_TransitFloaterFinalPrem,test);
		}
		catch(Exception e){
			se.verify().verifyEquals("Failed to fill in Rating Details Section details for TransitFloater page ", true, false,true, test);		
			}
	}
	
}
