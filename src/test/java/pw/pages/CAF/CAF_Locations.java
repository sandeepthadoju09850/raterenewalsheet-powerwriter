
package pw.pages.CAF;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_Crime;

public class CAF_Locations extends OR_Crime{

	public void CAF_Locations_Details(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("Crime_Locations")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData("Crime_Locations", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strCrime_Locations_BTN_DoneButton = (String) row.get("Crime_Locations_BTN_DoneButton");
		String strCrime_Locations_TXT_LocationNo = (String) row.get("Crime_Locations_TXT_LocationNo");
		String strCrime_Locations_CHK_CopyMailingAddress = (String) row.get("Crime_Locations_CHK_CopyMailingAddress");
		String strCrime_Locations_TXT_Name = (String) row.get("Crime_Locations_TXT_Name");
		String strCrime_Locations_TXT_Description = (String) row.get("Crime_Locations_TXT_Description");
		String strCrime_Locations_TXT_Street = (String) row.get("Crime_Locations_TXT_Street");
		String strCrime_Locations_TXT_Ste_Unit = (String) row.get("Crime_Locations_TXT_Ste/Unit");
		String strCrime_Locations_TXT_City = (String) row.get("Crime_Locations_TXT_City");
		String strCrime_Locations_TXT_State = (String) row.get("Crime_Locations_TXT_State");
		String strCrime_Locations_TXT_ZipCode = (String) row.get("Crime_Locations_TXT_Zip");
		String strCrime_Locations_TXT_SuggestedAddress = (String) row.get("Crime_Locations_TXT_SuggestedAddress");
		String strCrime_Locations_CHK_KeepAddressAsEntered = (String) row.get("Crime_Locations_CHK_KeepAddressAsEntered");
		String strCrime_Locations_TXT_JurisdictionDescription = (String) row.get("Crime_Locations_TXT_JurisdictionDescription");
		String strCrime_Locations_TXT_JurisdictionDescriptionSearch = (String) row.get("Crime_Locations_TXT_JurisdictionDescriptionSearch");
		String strCrime_Locations_TXT_FPDCode = (String) row.get("Crime_Locations_TXT_FPDCode");
		String strCrime_Locations_TXT_FireProtectionDistrict = (String) row.get("Crime_Locations_TXT_FireProtectionDistrict");
		
		try {
			se.log().logTestStep("CP_Crime_Locations");
			test.log(LogStatus.INFO, "CP_Crime_Locations page","Transaction Step : " + transaction + "<br>" + "Page : CP_Crime_Locations");
			se.verify().verifyEquals("CP_Crime_Locations Page of PowerWriter ",getPagecontainingtext("Locations").isDisplayed(), true, true, test);
			se.element().clickElement(getCrime_Locations_BTN_Add(),test);
			se.element().enterOrValidateText(getCrime_Locations_TXT_LocationNo(strCrime_Locations_TXT_LocationNo),strCrime_Locations_TXT_LocationNo, test);
			se.element().checkUncheckOrValidate(getCrime_Locations_CHK_CopyMailingAddress(strCrime_Locations_CHK_CopyMailingAddress),strCrime_Locations_CHK_CopyMailingAddress, test);
			se.element().enterOrValidateText(getCrime_Locations_TXT_Name(strCrime_Locations_TXT_Name), strCrime_Locations_TXT_Name,test);
			se.element().enterOrValidateText(getCrime_Locations_TXT_Description(strCrime_Locations_TXT_Description),strCrime_Locations_TXT_Description, test);
			se.element().enterOrValidateText(getCrime_Locations_TXT_Street(strCrime_Locations_TXT_Street),strCrime_Locations_TXT_Street, test);
			se.element().enterOrValidateText(getCrime_Locations_TXT_Ste_Unit(strCrime_Locations_TXT_Ste_Unit),strCrime_Locations_TXT_Ste_Unit, test);
			se.element().enterOrValidateText(getCrime_Locations_TXT_City(strCrime_Locations_TXT_City), strCrime_Locations_TXT_City,test);
			se.element().enterOrValidateText(getCrime_Locations_TXT_State(strCrime_Locations_TXT_State),strCrime_Locations_TXT_State, test);
			
			se.element().enterOrValidateText(getCrime_Locations_TXT_ZipCode(strCrime_Locations_TXT_ZipCode), strCrime_Locations_TXT_ZipCode,test);
			
			if(!strCrime_Locations_TXT_SuggestedAddress.equalsIgnoreCase("N/A") && !strCrime_Locations_TXT_SuggestedAddress.contains("validate2")) {
				se.element().clickSearchIcon(getCrime_Locations_BTN_SuggestedAddressSearch(),test);
				se.element().clickElement(getCrime_Locations_LNK_SuggestedAddressOption(strCrime_Locations_TXT_SuggestedAddress), test);
			}else {
				se.element().enterOrValidateText(getCrime_Locations_TXT_SuggestedAddress(strCrime_Locations_TXT_SuggestedAddress),strCrime_Locations_TXT_SuggestedAddress, test);
			}
			se.util().sleep(10000);
			se.element().checkUncheckOrValidate(getCrime_Locations_CHK_KeepAddressAsEntered(strCrime_Locations_CHK_KeepAddressAsEntered),strCrime_Locations_CHK_KeepAddressAsEntered, test);
			se.element().selectPopupWithMagnifier(getCrime_Locations_TXT_JurisdictionDescription (strCrime_Locations_TXT_JurisdictionDescription), getCrime_Locations_BTN_JurisdictionDescriptionSearch(strCrime_Locations_TXT_JurisdictionDescription), strCrime_Locations_TXT_JurisdictionDescription, strCrime_Locations_TXT_JurisdictionDescriptionSearch, strCrime_Locations_TXT_JurisdictionDescription, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCrime_Locations_TXT_FPDCode(strCrime_Locations_TXT_FPDCode), strCrime_Locations_TXT_FPDCode,test);
			se.element().enterOrValidateText(getCrime_Locations_TXT_FireProtectionDistrict(strCrime_Locations_TXT_FireProtectionDistrict), strCrime_Locations_TXT_FireProtectionDistrict,test);
			se.element().clickElement(getNext());
			if(strCrime_Locations_BTN_DoneButton.equalsIgnoreCase(constants.Yes)) {
				se.element().clickElement(getDone());
			}
			
			
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CP_Crime_Location ", true, false, true, test);		
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