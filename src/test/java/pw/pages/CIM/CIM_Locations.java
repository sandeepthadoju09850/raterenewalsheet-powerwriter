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

public class CIM_Locations extends OR_CIM {
	
	public void CIM_Locations(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase(constants.CIM_Locations)){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CIM_Locations, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCIM_Locations_BTN_ADD = (String) row.get("CIM_Locations_BTN_Add");
		String strCIM_Locations_BTN_Details = (String) row.get("CIM_Locations_BTN_Details");
		String strCIM_Locations_CHK_LocationNumber = (String) row.get("CIM_Locations_CHK_LocationNumber");
		String strCIM_Locations_BTN_Remove = (String) row.get("CIM_Locations_BTN_Remove");
		String strCIM_Locations_BTN_DONE = (String) row.get("CIM_Locations_BTN_Done");
		String strCIM_Locations_TXT_LocationNo = (String) row.get("CIM_Locations_TXT_LocationNo");
		String strCIM_Locations_CHK_CopyMailingAddress = (String) row.get("CIM_Locations_CHK_CopyMailingAddress");
		String strCIM_Locations_TXT_Name = (String) row.get("CIM_Locations_TXT_Name");
		String strCIM_Locations_TXT_Description = (String) row.get("CIM_Locations_TXT_Description");
		String strCIM_Locations_TXT_Street = (String) row.get("CIM_Locations_TXT_Street");
		String strCIM_Locations_TXT_Ste_Unit = (String) row.get("CIM_Locations_TXT_Ste/Unit");
		String strCIM_Locations_TXT_City = (String) row.get("CIM_Locations_TXT_City");
		String strCIM_Locations_TXT_State = (String) row.get("CIM_Locations_TXT_State");
		String strCIM_Locations_TXT_ZipCode = (String) row.get("CIM_Locations_TXT_ZipCode");
		String strCIM_Locations_TXT_SuggestedAddress = (String) row.get("CIM_Locations_TXT_SuggestedAddress");
		String strCIM_Locations_CHK_KeepAddressAsEntered = (String) row.get("CIM_Locations_CHK_KeepAddressAsEntered");
		String strCIM_Locations_TXT_JurisdictionDescription = (String) row.get("CIM_Locations_TXT_JurisdictionDescription");
		String strCIM_Locations_TXT_FPDCode = (String) row.get("CIM_Locations_TXT_FPDCode");
		String strCIM_Locations_TXT_FireProtectionDistrict = (String) row.get("CIM_Locations_TXT_FireProtectionDistrict");
		
		try {
			se.log().logTestStep("CP_CIM_Locations");
			test.log(LogStatus.INFO, "CP_CIM_Locations page",
					"Transaction Step : " + transaction + "<br>" + "Page : CP_CIM_Locations");
			se.verify().verifyEquals("CP_CIM_Locations Page of PowerWriter ",getPagecontainingtext("Locations").isDisplayed(), true, true, test);
			if((strCIM_Locations_BTN_ADD.equalsIgnoreCase(constants.Yes))){
				se.element().Click(getCIM_Locations_BTN_Add(strCIM_Locations_BTN_ADD),test);
				se.verify().verifyEquals("CP_CIM_Locations Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
			}
			if((strCIM_Locations_BTN_Details.equalsIgnoreCase(constants.Yes))){
				se.element().tryClick(getCIM_Locations_BTN_Details(strCIM_Locations_BTN_Details),test);
				se.verify().verifyEquals("CP_CIM_Locations Page of PowerWriter ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
			}
			if(strCIM_Locations_BTN_Remove.equalsIgnoreCase("Yes")){
				se.element().checkUncheckOrValidate(getCIM_Loc_selectLocation(strCIM_Locations_CHK_LocationNumber),"Check",test);
				se.element().Click(getCIM_Loc_removeLocation(), test);
				
			}
			se.element().enterOrValidateText(getCIM_Locations_TXT_LocationNo(strCIM_Locations_TXT_LocationNo),strCIM_Locations_TXT_LocationNo, test);
			se.element().checkUncheckOrValidate(getCIM_Locations_CHK_CopyMailingAddress(strCIM_Locations_CHK_CopyMailingAddress),strCIM_Locations_CHK_CopyMailingAddress, test);
			se.element().enterOrValidateText(getCIM_Locations_TXT_Name(strCIM_Locations_TXT_Name), strCIM_Locations_TXT_Name,test);
			se.element().enterOrValidateText(getCIM_Locations_TXT_Description(strCIM_Locations_TXT_Description),strCIM_Locations_TXT_Description, test);
			se.element().enterOrValidateText(getCIM_Locations_TXT_Street(strCIM_Locations_TXT_Street),strCIM_Locations_TXT_Street, test);
			se.element().enterOrValidateText(getCIM_Locations_TXT_Ste_Unit(strCIM_Locations_TXT_Ste_Unit),strCIM_Locations_TXT_Ste_Unit, test);
			se.element().enterOrValidateText(getCIM_Locations_TXT_City(strCIM_Locations_TXT_City), strCIM_Locations_TXT_City,test);
			se.element().enterOrValidateText(getCIM_Locations_TXT_State(strCIM_Locations_TXT_State),strCIM_Locations_TXT_State, test);
			se.element().enterOrValidateText(getCIM_Locations_TXT_ZipCode(strCIM_Locations_TXT_ZipCode), strCIM_Locations_TXT_ZipCode,test);
			se.element().selectPopupWithMagnifier(getCIM_Locations_TXT_SuggestedAddress(strCIM_Locations_TXT_SuggestedAddress), getCIM_Locations_BTN_SuggestedAddressSearch(strCIM_Locations_TXT_SuggestedAddress), strCIM_Locations_TXT_SuggestedAddress,constants.NA, strCIM_Locations_TXT_SuggestedAddress, constants.NA, constants.NA, constants.NA, test);
			
			se.util().sleep(10000);
			if(!strCIM_Locations_CHK_KeepAddressAsEntered.equalsIgnoreCase(constants.NA) && !strCIM_Locations_CHK_KeepAddressAsEntered.contains(constants.Validate)){
				se.element().clickElement(getCIM_Locations_CHK_KeepAddressAsEntered(strCIM_Locations_CHK_KeepAddressAsEntered), test);
			}
			
			if(!strCIM_Locations_TXT_JurisdictionDescription.equalsIgnoreCase(constants.NA) && !strCIM_Locations_TXT_JurisdictionDescription.contains(constants.Validate)) {
				
				se.element().clickSearchIcon(getCIM_Locations_BTN_JurisdictionDescriptionSearch(),test);
				se.util().sleep(3000);
				se.element().enterOrValidateText(getCIM_Locations_TXT_JurisdictionDescriptionFilter(),strCIM_Locations_TXT_JurisdictionDescription,test);
				se.element().Click(getSearch(),test);
				se.element().clickElement(getCIM_Locations_LNK_JurisdictionDescriptionOption(strCIM_Locations_TXT_JurisdictionDescription),test);
			}
			else {
				se.element().enterOrValidateText(getCIM_Locations_TXT_JurisdictionDescription (strCIM_Locations_TXT_JurisdictionDescription),strCIM_Locations_TXT_JurisdictionDescription,test);	
			}
			se.element().enterOrValidateText(getCIM_Locations_TXT_FPDCode(strCIM_Locations_TXT_FPDCode), strCIM_Locations_TXT_FPDCode,test);
			se.element().enterOrValidateText(getCIM_Locations_TXT_FireProtectionDistrict(strCIM_Locations_TXT_FireProtectionDistrict), strCIM_Locations_TXT_FireProtectionDistrict,test);
			se.util().sleep(3000);
			if(!strCIM_Locations_BTN_Remove.equalsIgnoreCase("Yes")){
				se.element().Click(getNext(),test);
			}
			
			if(strCIM_Locations_BTN_DONE.equalsIgnoreCase(constants.Yes)){
			se.element().Click(getDone(),test);
			}
		
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CIM_Location ", true, false, true, test);
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
