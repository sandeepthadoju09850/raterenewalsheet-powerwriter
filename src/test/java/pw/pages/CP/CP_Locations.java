package pw.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.OR.OR_CP;

public class CP_Locations extends OR_CP{
	
	public void Locations(String strRegressionID,String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CP_Location")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }

		List<Map<String, String>> table = ExcelOperations.getPagesData("CP_Location", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCP_Loc_TXT_CP_LocationNo = (String) row.get("CP_Loc_TXT_CP_LocationNo");
		String strCP_Loc_CHK_CopyMailingAddress = (String) row.get("CP_Loc_CHK_CopyMailingAddress");
		String strCP_Loc_TXT_Name = (String) row.get("CP_Loc_TXT_Name");
		String strCP_Loc_TXT_Description = (String) row.get("CP_Loc_TXT_Description");
		String strCP_Loc_TXT_Street = (String) row.get("CP_Loc_TXT_Street");
		String strCP_Loc_TXT_SteUnit = (String) row.get("CP_Loc_TXT_SteUnit");
		String strCP_Loc_TXT_City = (String) row.get("CP_Loc_TXT_City");
		String strCP_Loc_TXT_State = (String) row.get("CP_Loc_TXT_State");
		String strCP_Loc_TXT_Zip = (String) row.get("CP_Loc_TXT_Zip");
		String strCP_Loc_TXT_SuggestedAddress = (String) row.get("CP_Loc_TXT_Suggested Address");
		String strCP_Loc_CHK_ConfirmAddress = (String) row.get("CP_Loc_CHK_Confirm Address");
		String strCP_Loc_TXT_ISOAddSearchRequest = (String) row.get("CP_Loc_TXT_ISOAddSearchRequest");
		String strCP_Loc_CHK_KeepAddasEntered = (String) row.get("CP_Loc_CHK_KeepAddasEntered");
		String strCP_Loc_CHK_PrometrixAdressSearchRequest = (String) row.get("CP_Loc_CHK_PrometrixAdressSearchRequest");
		String strTestDescription = (String) row.get("Transaction Name");
		String strCP_Loc_BTN_AddButton = (String) row.get("CP_Loc_BTN_AddButton");
		String strCP_Loc_BTN_EditLocationNumber = (String) row.get("CP_Loc_BTN_EditLocationNumber");
		String strCP_Loc_BTN_DoneButton = (String) row.get("CP_Loc_BTN_DoneButton");
		String strCP_Loc_CHK_LocationNumber = (String) row.get("CP_Loc_CHK_LocationNumber");
		String strCP_Loc_BTN_Remove = (String) row.get("CP_Loc_BTN_Remove");
		try{
				se.log().logTestStep("CP_Locations");
				test.log(LogStatus.INFO, "CP_Locations page","Transaction Step : "+strTestDescription + "<br>" +"Page : CP_Locations");
				se.verify().verifyEquals("LocationsPage of PowerWriter ", getCP_Loc_VerifyLocationText().isDisplayed(),true, true,test);
				if(strCP_Loc_BTN_AddButton.equalsIgnoreCase("Yes")){
					se.element().Click(getCP_Loc_addLocation(),test);
				}
				if(strCP_Loc_BTN_EditLocationNumber.equalsIgnoreCase("Yes")){
					se.element().Click(getCP_Loc_editLocation(strCP_Loc_BTN_EditLocationNumber),test);
				}
				if(strCP_Loc_BTN_Remove.equalsIgnoreCase("Yes")){
					se.element().checkUncheckOrValidate(getCP_Loc_selectLocation(strCP_Loc_CHK_LocationNumber),"Check",test);
					se.element().Click(getCP_Loc_removeLocation(), test);
					
				}else{
				se.element().enterOrValidateText(getCP_Loc_TXT_CP_LocationNo(strCP_Loc_TXT_CP_LocationNo), strCP_Loc_TXT_CP_LocationNo,test);
				se.element().checkUncheckOrValidate(getCP_Loc_CHK_CopyMailingAddress(strCP_Loc_CHK_CopyMailingAddress), strCP_Loc_CHK_CopyMailingAddress, test);
				se.element().enterOrValidateText(getCP_Loc_TXT_Name(strCP_Loc_TXT_Name), strCP_Loc_TXT_Name, test);
				se.element().enterOrValidateText(getCP_Loc_TXT_Description(strCP_Loc_TXT_Description),strCP_Loc_TXT_Description,test);
				se.element().enterOrValidateText(getCP_Loc_TXT_Street(strCP_Loc_TXT_Street),strCP_Loc_TXT_Street,test);
				se.element().enterOrValidateText(getCP_Loc_TXT_SteUnit(strCP_Loc_TXT_SteUnit), strCP_Loc_TXT_SteUnit,test);
				se.element().enterOrValidateText(getCP_Loc_TXT_City(strCP_Loc_TXT_City), strCP_Loc_TXT_City,test);
				se.element().enterOrValidateText(getCP_Loc_TXT_State(strCP_Loc_TXT_State),strCP_Loc_TXT_State,test);
				se.element().enterOrValidateText(getCP_Loc_TXT_Zip(strCP_Loc_TXT_Zip), strCP_Loc_TXT_Zip,test);
				//se.element().waitForElement(spinner);
				se.element().enterOrValidateText(getCP_Loc_TXT_SuggestedAddress(strCP_Loc_TXT_SuggestedAddress),strCP_Loc_TXT_SuggestedAddress,test);
				se.element().checkUncheckOrValidate(getCP_Loc_CHK_ConfirmAddress(strCP_Loc_CHK_ConfirmAddress), strCP_Loc_CHK_ConfirmAddress,test);
				se.element().enterOrValidateText(getCP_Loc_TXT_ISOAddSearchRequest(strCP_Loc_TXT_ISOAddSearchRequest),strCP_Loc_TXT_ISOAddSearchRequest,test);
				se.element().checkUncheckOrValidate(getCP_Loc_CHK_KeepAddasEntered(strCP_Loc_CHK_KeepAddasEntered), strCP_Loc_CHK_KeepAddasEntered,test);
				se.element().checkUncheckOrValidate(getCP_Loc_CHK_PrometrixAdressSearchRequest(strCP_Loc_CHK_PrometrixAdressSearchRequest), strCP_Loc_CHK_PrometrixAdressSearchRequest,test);
				
					se.element().Click(getNext(),test);
		}
				
				if(strCP_Loc_BTN_DoneButton.equalsIgnoreCase("Yes")){
					se.element().Click(getDone(),test);
				}
		
			}catch(Exception e){
				se.verify().verifyEquals("Failed to fill in details for CP_Locations ", true, false, true, test);
				
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
