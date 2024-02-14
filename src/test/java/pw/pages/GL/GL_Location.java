package pw.pages.GL;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_GL;

public class GL_Location extends OR_GL{
	
	public void GL_Location_Details(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase(constants.GL_Location)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.GL_Location, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strGL_Location_TXT_LocationNo = (String) row.get("GL_Location_TXT_LocationNo");
		String strGL_Location_CHK_CopyMailingAddress = (String) row.get("GL_Location_CHK_CopyMailingAddress");
		String strGL_Location_TXT_Name = (String) row.get("GL_Location_TXT_Name");
		String strGL_Location_TXT_Description = (String) row.get("GL_Location_TXT_Description");
		String strGL_Location_TXT_Street = (String) row.get("GL_Location_TXT_Street");
		String strGL_Location_TXT_Ste_Unit = (String) row.get("GL_Location_TXT_Ste/Unit");
		String strGL_Location_TXT_City = (String) row.get("GL_Location_TXT_City");
		String strGL_Location_TXT_State = (String) row.get("GL_Location_TXT_State");
		String strGL_Location_TXT_Zip = (String) row.get("GL_Location_TXT_Zip");
		String strGL_Location_TXT_SuggestedAddress = (String) row.get("GL_Location_TXT_SuggestedAddress");
		String strGL_Location_CHK_KeepAddressAsEntered = (String) row.get("GL_Location_CHK_KeepAddressAsEntered");
		String strGL_Location_TXT_Territory = (String) row.get("GL_Location_TXT_Territory");
		String strGL_Location_TXT_TerritoryFilterNeeded = (String) row.get("GL_Location_TXT_TerritoryFilterNeeded");
		String strGL_Location_TXT_TerritoryDescription = (String) row.get("GL_Location_TXT_TerritoryDescription");
		String strGL_Location_BTN_AddButton = (String) row.get("GL_Location_BTN_AddButton");
		String strGL_Location_BTN_DoneButton = (String) row.get("GL_Location_BTN_DoneButton");
		String strGL_Location_CHK_LocationNumber = (String) row.get("GL_Location_CHK_LocationNumber");
		String strGL_Location_BTN_Remove = (String) row.get("GL_Location_BTN_Remove");
		String strGL_Location_TXT_TerritoryDescriptionPopUp = (String) row.get("GL_Location_TXT_TerritoryDescriptionPopUp");
		
		try{
			se.log().logTestStep("CP_GL_Location");
			test.log(LogStatus.INFO, "CP_GL_Location page","Transaction Step : "+transaction + "<br>" +"Page : CP_GL_Location");
			se.verify().verifyEquals("CP_GL_Location Page of PowerWriter ", getPagecontainingtext("Locations").isDisplayed(),true, true,test);
			if(!strGL_Location_BTN_AddButton.equals("N/A")) {
				se.element().clickElement(getGL_Location_BTN_Add());	
			}
			if(strGL_Location_BTN_Remove.equalsIgnoreCase("Yes")){
				se.element().checkUncheckOrValidate(getGL_Loc_selectLocation(strGL_Location_CHK_LocationNumber),"Check",test);
				se.element().Click(getGL_Loc_removeLocation(), test);
				
			}
			
			se.element().enterOrValidateText(getGL_Location_TXT_LocationNo(strGL_Location_TXT_LocationNo),strGL_Location_TXT_LocationNo,test);
			se.element().checkUncheckOrValidate(getGL_Location_CHK_CopyMailingAddress(strGL_Location_CHK_CopyMailingAddress),strGL_Location_CHK_CopyMailingAddress,test);
			se.element().enterOrValidateText(getGL_Location_TXT_Name(strGL_Location_TXT_Name),strGL_Location_TXT_Name,test);
			se.element().enterOrValidateText(getGL_Location_TXT_Description(strGL_Location_TXT_Description),strGL_Location_TXT_Description,test);
			se.element().enterOrValidateText(getGL_Location_TXT_Street(strGL_Location_TXT_Street),strGL_Location_TXT_Street,test);
			se.element().enterOrValidateText(getGL_Location_TXT_SteUnit(strGL_Location_TXT_Ste_Unit),strGL_Location_TXT_Ste_Unit,test);
			se.element().enterOrValidateText(getGL_Location_TXT_City(strGL_Location_TXT_City),strGL_Location_TXT_City,test);
			se.element().enterOrValidateText(getGL_Location_TXT_State(strGL_Location_TXT_State),strGL_Location_TXT_State,test);
			se.element().enterOrValidateText(getGL_Location_TXT_Zip(strGL_Location_TXT_Zip),strGL_Location_TXT_Zip,test);
			se.element().enterOrValidateText(getGL_Location_TXT_SuggestedAddress(strGL_Location_TXT_SuggestedAddress),strGL_Location_TXT_SuggestedAddress,test);
			se.element().checkUncheckOrValidate(getGL_Location_CHK_KeepAddressAsEntered(strGL_Location_CHK_KeepAddressAsEntered),strGL_Location_CHK_KeepAddressAsEntered,test);
			//se.element().enterOrValidateText(getGL_Location_TXT_Territory(strGL_Location_TXT_Territory),strGL_Location_TXT_Territory,test);
 			se.element().selectPopupWithMagnifier(getGL_Location_TXT_Territory(strGL_Location_TXT_Territory), getGL_Location_TXT_TerritorySearch(strGL_Location_TXT_Territory), strGL_Location_TXT_Territory, strGL_Location_TXT_TerritoryFilterNeeded, strGL_Location_TXT_Territory, strGL_Location_TXT_TerritoryDescriptionPopUp, constants.NA, constants.NA, test);
			
			se.element().enterOrValidateText(getGL_Location_TXT_TerritoryDescription(strGL_Location_TXT_TerritoryDescription),strGL_Location_TXT_TerritoryDescription,test);
			if(!strGL_Location_BTN_Remove.equalsIgnoreCase("Yes")){
				se.element().clickElement(getNext());
			}
			
			if(!strGL_Location_BTN_DoneButton.equals("N/A")) {
				se.element().clickElement(getDone());
				}	
		
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for GL_Location ", true, false, true, test);			
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