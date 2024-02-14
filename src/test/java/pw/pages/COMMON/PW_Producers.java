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

public class PW_Producers extends OR_Common {

	public void AddProducers(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase(constants.Producers)){
			 test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Producers, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strProducers_TXT_AgencyNumber = (String) row.get("Producers_TXT_AgencyNumber");
		String strProducers_TXT_ProducerFilterNeeded = (String) row.get("Producers_TXT_ProducerFilterNeeded");
		String strProducers_TXT_Producer = (String) row.get("Producers_TXT_Producer");
		String strProducers_TXT_SubAgent = (String) row.get("Producers_TXT_SubAgent");
		String strProducers_TXT_BusinessName = (String) row.get("Producers_TXT_BusinessName");
		String strProducers_CHK_ProducerofRecord = (String) row.get("Producers_CHK_ProducerofRecord");
		String strProducers_TXT_Street = (String) row.get("Producers_TXT_Street");
		String strProducers_TXT_SteUnit = (String) row.get("Producers_TXT_SteUnit");
		String strProducers_TXT_City = (String) row.get("Producers_TXT_City");
		String strProducers_DDN_State = (String) row.get("Producers_DDN_State");
		String strProducers_TXT_Zip = (String) row.get("Producers_TXT_Zip");
		String strProducers_TXT_LicenseNumber = (String) row.get("Producers_TXT_LicenseNumber");
		String strProducers_TXT_LicenseState = (String) row.get("Producers_TXT_LicenseState");
		String strProducers_TXT_ContactName = (String) row.get("Producers_TXT_ContactName");
		String strProducers_TXT_Email = (String) row.get("Producers_TXT_Email");
		String strProducers_TXT_Title = (String) row.get("Producers_TXT_Title");
		String strProducers_TXT_Phone = (String) row.get("Producers_TXT_Phone");
		String strProducers_TXT_Fax = (String) row.get("Producers_TXT_Fax");
		String strProducers_TXT_Website = (String) row.get("Producers_TXT_Website");
		String strProducers_CHK_DirectBillIndicator = (String) row.get("Producers_CHK_DirectBillIndicator");
		String strProducers_BTN_AddProducer = (String) row.get("Producers_BTN_AddProducer");
		String strProducers_BTN_EditProducer = (String) row.get("Producers_BTN_EditProducer");
		
		
		try{
			se.log().logTestStep("Add Producers");
			test.log(LogStatus.INFO, "Add Producers","Transaction Step : "+ transaction + "<br>" +"Page : AddProducers");
			
			se.verify().verifyEquals("Producer Page of PowerWriter ", getPagecontainingtext("Producers").isDisplayed(),true, true,test);
			if(strProducers_BTN_AddProducer.equalsIgnoreCase("Yes")){
				se.element().Click(getProducers_BTN_Add(), test);
			}
			if(strProducers_BTN_EditProducer.equalsIgnoreCase("Yes")){
				se.element().Click(getProducers_BTN_Edit(), test);
			}
			se.element().waitForElement(Producers_TXT_AgencyNumber, 50);
			se.element().enterOrValidateText(getProducers_TXT_AgencyNumber(strProducers_TXT_AgencyNumber),strProducers_TXT_AgencyNumber,test);
			
			if(strProducers_BTN_EditProducer.contains(constants.Yes)){
				se.element().selectAgencyWithMagnifier(getProducers_TXT_AgencyNumber(strProducers_TXT_AgencyNumber), getProducers_AgencyNumber_magnifier_BTN(strProducers_TXT_AgencyNumber), strProducers_TXT_AgencyNumber, constants.Yes, strProducers_TXT_AgencyNumber, constants.NA, constants.NA, constants.NA, test);
			}
			/*se.element().clickSearchIcon(getProducers_Producer_magnifier_BTN(strProducers_TXT_Producer), test);
			if(se.element().exists(Producers_Producer_Popup_TXT)){
				se.element().enterOrValidateText(getProducers_Producer_Popup_TXT(strProducers_TXT_Producer), strProducers_TXT_Producer, test);
				se.element().Click(getProducers_Producer_Popup_Search_BTN(strProducers_TXT_Producer), test);
			}*/
			se.element().selectPopupWithMagnifier(getProducers_TXT_Producer(strProducers_TXT_Producer), getProducers_Producer_magnifier_BTN(strProducers_TXT_Producer), strProducers_TXT_Producer, strProducers_TXT_ProducerFilterNeeded, strProducers_TXT_Producer, constants.NA, constants.NA, constants.NA, test);
			
		     //se.element().waitForElementIsDisplayed(getProducers_Producer_LNK_popup(strProducers_TXT_Producer.toUpperCase());
			//se.element().Click(getProducers_Producer_LNK_popup(strProducers_TXT_Producer.toUpperCase()), test);
			//se.element().enterOrValidateText(getProducers_TXT_Producer(strProducers_TXT_Producer),strProducers_TXT_Producer,test);
			se.element().enterOrValidateText(getProducers_TXT_SubAgent(strProducers_TXT_SubAgent),strProducers_TXT_SubAgent,test);
			se.element().enterOrValidateText(getProducers_TXT_BusinessName(strProducers_TXT_BusinessName),strProducers_TXT_BusinessName,test);
			se.element().checkUncheckOrValidate(getProducers_CHK_ProducerofRecord(strProducers_CHK_ProducerofRecord),strProducers_CHK_ProducerofRecord,test);
			se.element().enterOrValidateText(getProducers_TXT_Street(strProducers_TXT_Street),strProducers_TXT_Street,test);
			se.element().enterOrValidateText(getProducers_TXT_SteUnit(strProducers_TXT_SteUnit),strProducers_TXT_SteUnit,test);
			se.element().enterOrValidateText(getProducers_TXT_City(strProducers_TXT_City),strProducers_TXT_City,test);
			se.element().selectElementDDrOrValidateText(getProducers_DDN_State(strProducers_DDN_State),strProducers_DDN_State,test);
			se.element().enterOrValidateText(getProducers_TXT_Zip(strProducers_TXT_Zip),strProducers_TXT_Zip,test);
			if(strProducers_BTN_EditProducer.contains(constants.Yes) && transaction.contains("Clone")){
				getProducers_TXT_LicenseNumber().clear();
			}
			se.element().enterOrValidateText(getProducers_TXT_LicenseNumber(),strProducers_TXT_LicenseNumber,test);
			se.element().enterOrValidateText(getProducers_TXT_LicenseState(strProducers_TXT_LicenseState),strProducers_TXT_LicenseState,test);
			se.element().enterOrValidateText(getProducers_TXT_ContactName(strProducers_TXT_ContactName),strProducers_TXT_ContactName,test);
			se.element().enterOrValidateText(getProducers_TXT_Email(strProducers_TXT_Email),strProducers_TXT_Email,test);
			se.element().enterOrValidateText(getProducers_TXT_Title(strProducers_TXT_Title),strProducers_TXT_Title,test);
			se.element().enterOrValidateText(getProducers_TXT_Phone(strProducers_TXT_Phone),strProducers_TXT_Phone,test);
			se.element().enterOrValidateText(getProducers_TXT_Fax(strProducers_TXT_Fax),strProducers_TXT_Fax,test);
			se.element().enterOrValidateText(getProducers_TXT_Website(strProducers_TXT_Website),strProducers_TXT_Website,test);
			se.element().checkUncheckOrValidate(getProducers_CHK_DirectBillIndicator(strProducers_CHK_DirectBillIndicator),strProducers_CHK_DirectBillIndicator,test);

			se.util().sleep(2000);
			se.element().Click(getNext(),test);
			se.util().sleep(2000);
			se.element().Click(getDone(),test);
		
			
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for AddProducers ", true, false, true, test);
					
		}
		iteration++;
	}

}
catch (Exception e) {
// TODO: handle exception
se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
test.log(LogStatus.FAIL, "Failed", "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
testTearDown(se, test);
}

}

}
