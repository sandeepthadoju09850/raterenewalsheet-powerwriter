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

public class CIM_CargoOtherCoverages extends OR_CIM{
	
	public void CargoOtherCoverages(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_Cargo-OtherCoverages")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_Cargo-OtherCoverages", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCIM_CargoOtherCoverages_TXT_AdditionalDebrisRemovalExpensesLimit = (String) row.get("CIM_CargoOtherCoverages_TXT_AdditionalDebrisRemovalExpensesLimit");
		String strCIM_CargoOtherCoverages_TXT_EmergencyRemoval = (String) row.get("CIM_CargoOtherCoverages_TXT_EmergencyRemoval");
		String strCIM_CargoOtherCoverages_TXT_PollutantCleanupAndRemovalLimit = (String) row.get("CIM_CargoOtherCoverages_TXT_PollutantCleanupAndRemovalLimit");
		String strCIM_CargoOtherCoverages_TXT_PropertyYouHaveSold = (String) row.get("CIM_CargoOtherCoverages_TXT_PropertyYouHaveSold");
		String strCIM_CargoOtherCoverages_TXT_RejectedShipments = (String) row.get("CIM_CargoOtherCoverages_TXT_RejectedShipments");
		String strCIM_CargoOtherCoverages_TXT_AdditionalInformation = (String) row.get("CIM_CargoOtherCoverages_TXT_AdditionalInformation");
		String strCIM_CargoOtherCoverages_BTN_MotorCarrierFilingAddButton = (String) row.get("CIM_CargoOtherCoverages_BTN_MotorCarrierFilingAddButton");
		String strCIM_CargoOtherCoverages_TXT_MotorCarrierFilingsOption = (String) row.get("CIM_CargoOtherCoverages_TXT_MotorCarrierFilingsOption");
		String strCIM_CargoOtherCoverages_TXT_NamedInsured = (String) row.get("CIM_CargoOtherCoverages_TXT_NamedInsured");
		String strCIM_CargoOtherCoverages_TXT_Street = (String) row.get("CIM_CargoOtherCoverages_TXT_Street");
		String strCIM_CargoOtherCoverages_TXT_City = (String) row.get("CIM_CargoOtherCoverages_TXT_City");
		String strCIM_CargoOtherCoverages_TXT_State = (String) row.get("CIM_CargoOtherCoverages_TXT_State");
		String strCIM_CargoOtherCoverages_TXT_ZipCode = (String) row.get("CIM_CargoOtherCoverages_TXT_ZipCode");
		String strCIM_CargoOtherCoverages_TXT_DateIssued = (String) row.get("CIM_CargoOtherCoverages_TXT_DateIssued");
		try{
			se.log().logTestStep("CargoOtherCoverages");
			test.log(LogStatus.INFO, "CargoOtherCoverages page","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMCargoOtherCoverages");
			se.verify().verifyEquals("CargoOtherCoverages page of PowerWriter ", getCIM_CargoOtherCoverages_TXT_VerifyCargoOtherCoveragesText().isDisplayed(),true, true,test);
			
			se.element().enterOrValidateText(getCIM_CargoOtherCoverages_TXT_AdditionalDebrisRemovalExpensesLimit(strCIM_CargoOtherCoverages_TXT_AdditionalDebrisRemovalExpensesLimit),strCIM_CargoOtherCoverages_TXT_AdditionalDebrisRemovalExpensesLimit,test);
			se.element().enterOrValidateText(getCIM_CargoOtherCoverages_TXT_EmergencyRemoval(strCIM_CargoOtherCoverages_TXT_EmergencyRemoval),strCIM_CargoOtherCoverages_TXT_EmergencyRemoval,test);
			se.element().enterOrValidateText(getCIM_CargoOtherCoverages_TXT_PollutantCleanupAndRemovalLimit(strCIM_CargoOtherCoverages_TXT_PollutantCleanupAndRemovalLimit),strCIM_CargoOtherCoverages_TXT_PollutantCleanupAndRemovalLimit,test);
			se.element().selectPopupWithMagnifier(getCIM_CargoOtherCoverages_TXT_PropertyYouHaveSold(strCIM_CargoOtherCoverages_TXT_PropertyYouHaveSold), getCIM_CargoOtherCoverages_BTN_PropertyYouHaveSoldSearch(strCIM_CargoOtherCoverages_TXT_PropertyYouHaveSold), strCIM_CargoOtherCoverages_TXT_PropertyYouHaveSold,constants.NA, strCIM_CargoOtherCoverages_TXT_PropertyYouHaveSold,constants.NA, constants.NA, constants.NA, test);
			se.element().selectPopupWithMagnifier(getCIM_CargoOtherCoverages_TXT_RejectedShipments(strCIM_CargoOtherCoverages_TXT_RejectedShipments), getCIM_CargoOtherCoverages_BTN_RejectedShipmentsSearch(strCIM_CargoOtherCoverages_TXT_RejectedShipments), strCIM_CargoOtherCoverages_TXT_RejectedShipments,constants.NA, strCIM_CargoOtherCoverages_TXT_RejectedShipments,constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCIM_CargoOtherCoverages_TXT_AdditionalInformation(strCIM_CargoOtherCoverages_TXT_AdditionalInformation),strCIM_CargoOtherCoverages_TXT_AdditionalInformation,test);
			if((strCIM_CargoOtherCoverages_BTN_MotorCarrierFilingAddButton.equalsIgnoreCase("Yes"))){
				se.element().Click(getCIM_CargoOtherCoverages_BTN_MotorCarrierFilingAddButton(strCIM_CargoOtherCoverages_BTN_MotorCarrierFilingAddButton),test);
				}
			se.element().selectPopupWithMagnifier(getCIM_CargoOtherCoverages_TXT_MotorCarrierFilingsOption(strCIM_CargoOtherCoverages_TXT_MotorCarrierFilingsOption), getCIM_CargoOtherCoverages_BTN_MotorCarrierFilingsOptionSearch(strCIM_CargoOtherCoverages_TXT_MotorCarrierFilingsOption), strCIM_CargoOtherCoverages_TXT_MotorCarrierFilingsOption,constants.NA, strCIM_CargoOtherCoverages_TXT_MotorCarrierFilingsOption,constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCIM_CargoOtherCoverages_TXT_NamedInsured(strCIM_CargoOtherCoverages_TXT_NamedInsured),strCIM_CargoOtherCoverages_TXT_NamedInsured,test);
			se.element().enterOrValidateText(getCIM_CargoOtherCoverages_TXT_Street(strCIM_CargoOtherCoverages_TXT_Street),strCIM_CargoOtherCoverages_TXT_Street,test);
			se.element().enterOrValidateText(getCIM_CargoOtherCoverages_TXT_City(strCIM_CargoOtherCoverages_TXT_City),strCIM_CargoOtherCoverages_TXT_City,test);
			se.element().enterOrValidateText(getCIM_CargoOtherCoverages_TXT_State(strCIM_CargoOtherCoverages_TXT_State),strCIM_CargoOtherCoverages_TXT_State,test);
			se.element().enterOrValidateText(getCIM_CargoOtherCoverages_TXT_ZipCode(strCIM_CargoOtherCoverages_TXT_ZipCode),strCIM_CargoOtherCoverages_TXT_ZipCode,test);
			se.element().enterOrValidateText(getCIM_CargoOtherCoverages_TXT_DateIssued(strCIM_CargoOtherCoverages_TXT_DateIssued),strCIM_CargoOtherCoverages_TXT_DateIssued,test);

			se.element().Click(getNext(),test);
	
		}
		catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CargoOtherCoverages ", true, false, true, test);
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

