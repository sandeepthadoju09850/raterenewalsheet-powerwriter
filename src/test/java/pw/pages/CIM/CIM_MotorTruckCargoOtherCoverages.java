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

public class CIM_MotorTruckCargoOtherCoverages extends OR_CIM{
	
	public void MotorTruckCargoOtherCoverages(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CIM_MotorTruckCargo-OtherCovera")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("CIM_MotorTruckCargo-OtherCovera", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCIM_MotorTruckCargoOtherCoverages_TXT_AdditionalDebrisExpenseLimit = (String) row.get("CIM_MotorTruckCargoOtherCoverages_TXT_AdditionalDebrisExpenseLimit");
		String strCIM_MotorTruckCargoOtherCoverages_TXT_FraudAndDeceitLimit = (String) row.get("CIM_MotorTruckCargoOtherCoverages_TXT_FraudAndDeceitLimit");
		String strCIM_MotorTruckCargoOtherCoverages_TXT_ContractPenaltyLim = (String) row.get("CIM_MotorTruckCargoOtherCoverages_TXT_ContractPenaltyLim");
		String strCIM_MotorTruckCargoOtherCoverages_TXT_ExpeditingExpensesLimit = (String) row.get("CIM_MotorTruckCargoOtherCoverages_TXT_ExpeditingExpensesLimit");
		String strCIM_MotorTruckCargoOtherCoverages_TXT_FreightChargesLimit = (String) row.get("CIM_MotorTruckCargoOtherCoverages_TXT_FreightChargesLimit");
		String strCIM_MotorTruckCargoOtherCoverages_TXT_MovingEquipmntLimit = (String) row.get("CIM_MotorTruckCargoOtherCoverages_TXT_MovingEquipmntLimit");
		String strCIM_MotorTruckCargoOtherCoverages_TXT_NewlyAcquiredTerminalsLimit = (String) row.get("CIM_MotorTruckCargoOtherCoverages_TXT_NewlyAcquiredTerminalsLimit");
		String strCIM_MotorTruckCargoOtherCoverages_TXT_OffBoardElectronicsLimit = (String) row.get("CIM_MotorTruckCargoOtherCoverages_TXT_OffBoardElectronicsLimit");
		String strCIM_MotorTruckCargoOtherCoverages_TXT_OnBoardElectronicsLimit = (String) row.get("CIM_MotorTruckCargoOtherCoverages_TXT_OnBoardElectronicsLimit");
		String strCIM_MotorTruckCargoOtherCoverages_TXT_OnBoardExpendableSuppliesLimit = (String) row.get("CIM_MotorTruckCargoOtherCoverages_TXT_OnBoardExpendableSuppliesLimit");
		String strCIM_MotorTruckCargoOtherCoverages_TXT_PollutantCleanupandRemoval = (String) row.get("CIM_MotorTruckCargoOtherCoverages_TXT_PollutantCleanupandRemoval");
		String strCIM_MotorTruckCargoOtherCoverages_TXT_RewardsLimit = (String) row.get("CIM_MotorTruckCargoOtherCoverages_TXT_RewardsLimit");
		String strCIM_MotorTruckCargoOtherCoverages_TXT_AdditionalInformation = (String) row.get("CIM_MotorTruckCargoOtherCoverages_TXT_AdditionalInformation");
		String strCIM_MotorTruckCargoOtherCoverages_BTN_MotorCarrierFilingADDButton = (String) row.get("CIM_MotorTruckCargoOtherCoverages_BTN_MotorCarrierFilingADDButton");
		String strCIM_MotorTruckCargoOtherCoverages_TXT_MotorCarrierFilingsOption = (String) row.get("CIM_MotorTruckCargoOtherCoverages_TXT_MotorCarrierFilingsOption");
		String strCIM_MotorTruckCargoOtherCoverages_TXT_NameInsured = (String) row.get("CIM_MotorTruckCargoOtherCoverages_TXT_NameInsured");
		String strCIM_MotorTruckCargoOtherCoverages_TXT_Street = (String) row.get("CIM_MotorTruckCargoOtherCoverages_TXT_Street");
		String strCIM_MotorTruckCargoOtherCoverages_TXT_City = (String) row.get("CIM_MotorTruckCargoOtherCoverages_TXT_City");
		String strCIM_MotorTruckCargoOtherCoverages_TXT_State = (String) row.get("CIM_MotorTruckCargoOtherCoverages_TXT_State");
		String strCIM_MotorTruckCargoOtherCoverages_TXT_Zip = (String) row.get("CIM_MotorTruckCargoOtherCoverages_TXT_Zip");
		String strCIM_MotorTruckCargoOtherCoverages_TXT_DateIssued = (String) row.get("CIM_MotorTruckCargoOtherCoverages_TXT_DateIssued");
		
		try{
			se.log().logTestStep("MotorTruckCargoOtherCoverages");
			test.log(LogStatus.INFO, "MotorTruckCargoOtherCoverages page","Transaction Step : "+transaction + "<br>" +"Page : CP_CIMMotorTruckCargoOtherCoverages");
			se.verify().verifyEquals("MotorTruckCargoOtherCoverages page of PowerWriter ", getCIM_MotorTruckCargoOtherCoverages_TXT_VerifyMotorTruckCargoOtherCoveragesText().isDisplayed(),true, true,test);
			
			se.element().enterOrValidateText(getCIM_MotorTruckCargoOtherCoverages_TXT_AdditionalDebrisExpenseLimit(strCIM_MotorTruckCargoOtherCoverages_TXT_AdditionalDebrisExpenseLimit),strCIM_MotorTruckCargoOtherCoverages_TXT_AdditionalDebrisExpenseLimit,test);
			se.element().enterOrValidateText(getCIM_MotorTruckCargoOtherCoverages_TXT_FraudAndDeceitLimit(strCIM_MotorTruckCargoOtherCoverages_TXT_FraudAndDeceitLimit),strCIM_MotorTruckCargoOtherCoverages_TXT_FraudAndDeceitLimit,test);
			se.element().enterOrValidateText(getCIM_MotorTruckCargoOtherCoverages_TXT_ContractPenaltyLim(strCIM_MotorTruckCargoOtherCoverages_TXT_ContractPenaltyLim),strCIM_MotorTruckCargoOtherCoverages_TXT_ContractPenaltyLim,test);
			se.element().enterOrValidateText(getCIM_MotorTruckCargoOtherCoverages_TXT_ExpeditingExpensesLimit(strCIM_MotorTruckCargoOtherCoverages_TXT_ExpeditingExpensesLimit),strCIM_MotorTruckCargoOtherCoverages_TXT_ExpeditingExpensesLimit,test);
			se.element().enterOrValidateText(getCIM_MotorTruckCargoOtherCoverages_TXT_FreightChargesLimit(strCIM_MotorTruckCargoOtherCoverages_TXT_FreightChargesLimit),strCIM_MotorTruckCargoOtherCoverages_TXT_FreightChargesLimit,test);
			se.element().waitForElementIsDisplayed(CIM_MotorTruckCargoOtherCoverages_BTN_OKButton, 10);
			if(se.element().isElementPresent(CIM_MotorTruckCargoOtherCoverages_BTN_OKButton)){
				se.element().Click(getCIM_MotorTruckCargoOtherCoverages_BTN_OKButton(), test);
			}
			se.element().enterOrValidateText(getCIM_MotorTruckCargoOtherCoverages_TXT_FreightChargesLimit(strCIM_MotorTruckCargoOtherCoverages_TXT_FreightChargesLimit),strCIM_MotorTruckCargoOtherCoverages_TXT_FreightChargesLimit,test);
			
			se.element().waitForElementIsDisplayed(CIM_MotorTruckCargoOtherCoverages_BTN_OKButton, 10);
			if(se.element().isElementPresent(CIM_MotorTruckCargoOtherCoverages_BTN_OKButton)){
				se.element().Click(getCIM_MotorTruckCargoOtherCoverages_BTN_OKButton(), test);
			}
			se.element().enterOrValidateText(getCIM_MotorTruckCargoOtherCoverages_TXT_MovingEquipmntLimit(strCIM_MotorTruckCargoOtherCoverages_TXT_MovingEquipmntLimit),strCIM_MotorTruckCargoOtherCoverages_TXT_MovingEquipmntLimit,test);
			if(!strCIM_MotorTruckCargoOtherCoverages_TXT_NewlyAcquiredTerminalsLimit.equalsIgnoreCase(constants.NA) && !strCIM_MotorTruckCargoOtherCoverages_TXT_NewlyAcquiredTerminalsLimit.contains(constants.Validate)){
				se.element().clearTheField(getCIM_MotorTruckCargoOtherCoverages_TXT_NewlyAcquiredTerminalsLimit(strCIM_MotorTruckCargoOtherCoverages_TXT_NewlyAcquiredTerminalsLimit));
				se.element().waitForElementIsDisplayed(CIM_MotorTruckCargoOtherCoverages_BTN_OKButton, 10);
				if(se.element().isElementPresent(CIM_MotorTruckCargoOtherCoverages_BTN_OKButton)){
					se.element().Click(getCIM_MotorTruckCargoOtherCoverages_BTN_OKButton(), test);
				}
				se.element().enterOrValidateText(getCIM_MotorTruckCargoOtherCoverages_TXT_NewlyAcquiredTerminalsLimit(strCIM_MotorTruckCargoOtherCoverages_TXT_NewlyAcquiredTerminalsLimit),strCIM_MotorTruckCargoOtherCoverages_TXT_NewlyAcquiredTerminalsLimit,test);
				se.element().waitForElementIsDisplayed(CIM_MotorTruckCargoOtherCoverages_BTN_OKButton, 10);
				if(se.element().isElementPresent(CIM_MotorTruckCargoOtherCoverages_BTN_OKButton)){
					se.element().Click(getCIM_MotorTruckCargoOtherCoverages_BTN_OKButton(), test);
				}
			}else{
				se.element().enterOrValidateText(getCIM_MotorTruckCargoOtherCoverages_TXT_NewlyAcquiredTerminalsLimit(strCIM_MotorTruckCargoOtherCoverages_TXT_NewlyAcquiredTerminalsLimit),strCIM_MotorTruckCargoOtherCoverages_TXT_NewlyAcquiredTerminalsLimit,test);
			}
			
			se.element().enterOrValidateText(getCIM_MotorTruckCargoOtherCoverages_TXT_OffBoardElectronicsLimit(strCIM_MotorTruckCargoOtherCoverages_TXT_OffBoardElectronicsLimit),strCIM_MotorTruckCargoOtherCoverages_TXT_OffBoardElectronicsLimit,test);
			se.element().enterOrValidateText(getCIM_MotorTruckCargoOtherCoverages_TXT_OnBoardElectronicsLimit(strCIM_MotorTruckCargoOtherCoverages_TXT_OnBoardElectronicsLimit),strCIM_MotorTruckCargoOtherCoverages_TXT_OnBoardElectronicsLimit,test);
			se.element().enterOrValidateText(getCIM_MotorTruckCargoOtherCoverages_TXT_OnBoardExpendableSuppliesLimit(strCIM_MotorTruckCargoOtherCoverages_TXT_OnBoardExpendableSuppliesLimit),strCIM_MotorTruckCargoOtherCoverages_TXT_OnBoardExpendableSuppliesLimit,test);
			se.element().enterOrValidateText(getCIM_MotorTruckCargoOtherCoverages_TXT_PollutantCleanupandRemoval(strCIM_MotorTruckCargoOtherCoverages_TXT_PollutantCleanupandRemoval),strCIM_MotorTruckCargoOtherCoverages_TXT_PollutantCleanupandRemoval,test);
			se.element().enterOrValidateText(getCIM_MotorTruckCargoOtherCoverages_TXT_RewardsLimit(strCIM_MotorTruckCargoOtherCoverages_TXT_RewardsLimit),strCIM_MotorTruckCargoOtherCoverages_TXT_RewardsLimit,test);
			se.element().enterOrValidateText(getCIM_MotorTruckCargoOtherCoverages_TXT_AdditionalInformation(strCIM_MotorTruckCargoOtherCoverages_TXT_AdditionalInformation),strCIM_MotorTruckCargoOtherCoverages_TXT_AdditionalInformation,test);
			
			if((strCIM_MotorTruckCargoOtherCoverages_BTN_MotorCarrierFilingADDButton.equalsIgnoreCase("Yes"))){
				se.element().Click(getCIM_MotorTruckCargoOtherCoverages_BTN_MotorCarrierFilingADDButton(strCIM_MotorTruckCargoOtherCoverages_BTN_MotorCarrierFilingADDButton),test);
				}
			
			se.element().selectPopupWithMagnifier(getCIM_MotorTruckCargoOtherCoverages_TXT_MotorCarrierFilingsOption(strCIM_MotorTruckCargoOtherCoverages_TXT_MotorCarrierFilingsOption), getCIM_MotorTruckCargoOtherCoverages_BTN_MotorCarrierFilingsOptionSearch(strCIM_MotorTruckCargoOtherCoverages_TXT_MotorCarrierFilingsOption), strCIM_MotorTruckCargoOtherCoverages_TXT_MotorCarrierFilingsOption, constants.NA, strCIM_MotorTruckCargoOtherCoverages_TXT_MotorCarrierFilingsOption, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCIM_MotorTruckCargoOtherCoverages_TXT_NameInsured(strCIM_MotorTruckCargoOtherCoverages_TXT_NameInsured),strCIM_MotorTruckCargoOtherCoverages_TXT_NameInsured,test);
			se.element().enterOrValidateText(getCIM_MotorTruckCargoOtherCoverages_TXT_Street(strCIM_MotorTruckCargoOtherCoverages_TXT_Street),strCIM_MotorTruckCargoOtherCoverages_TXT_Street,test);
			se.element().enterOrValidateText(getCIM_MotorTruckCargoOtherCoverages_TXT_City(strCIM_MotorTruckCargoOtherCoverages_TXT_City),strCIM_MotorTruckCargoOtherCoverages_TXT_City,test);
			se.element().enterOrValidateText(getCIM_MotorTruckCargoOtherCoverages_TXT_State(strCIM_MotorTruckCargoOtherCoverages_TXT_State),strCIM_MotorTruckCargoOtherCoverages_TXT_State,test);
			se.element().enterOrValidateText(getCIM_MotorTruckCargoOtherCoverages_TXT_Zip(strCIM_MotorTruckCargoOtherCoverages_TXT_Zip),strCIM_MotorTruckCargoOtherCoverages_TXT_Zip,test);
			se.element().enterOrValidateText(getCIM_MotorTruckCargoOtherCoverages_TXT_DateIssued(strCIM_MotorTruckCargoOtherCoverages_TXT_DateIssued),strCIM_MotorTruckCargoOtherCoverages_TXT_DateIssued,test);

			se.element().Click(getNext(),test);
			
	}
		catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CIM_MotorTruckCargo-OtherCoverages", true, false, true, test);
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
