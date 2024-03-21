package ap.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.SystemPropertyUtil;
import Libraries.automation.common.Utils.TestPageFactory;
import Libraries.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.BL_OR_CP;
import ap.pages.common.AP_Login;

public class CP_Locations extends BL_OR_CP {
	String Edit ="Edit";
	String Delete ="Delete";
	String AddNew="Add";
	public void CP_Locations_Details(String strRegressionID, String transaction,String suspendSheet, String strAgentLink, String strLOB,String strRelease_SelectRelease,String strRole_SelectRoleAs, ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.Locations)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getBLPagesData(constants.Locations, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strLocations_BTN_Edit = (String) row.get("Locations_BTN_Edit");
			String strLocations_BTN_NoEdit = (String) row.get("Locations_BTN_NoEdit");
			String strLocations_TXT_Location = (String) row.get("Locations_TXT_Location");
			String strLocations_BTN_Edit_Loc = (String) row.get("Locations_BTN_Edit_Loc");
			String strLocations_BTN_Delete = (String) row.get("Locations_BTN_Delete");
			String strLocations_BTN_Delete_Loc = (String) row.get("Locations_BTN_Delete_Loc");
			String strLocations_BTN_Add = (String) row.get("Locations_BTN_Add");
			String strLocations_TXT_Desc = (String) row.get("Locations_TXT_Desc");
			String strLocations_TXT_StreetAddrL1 = (String) row.get("Locations_TXT_StreetAddrL1");
			String strLocations_TXT_StreetAddrL2 = (String) row.get("Locations_TXT_StreetAddrL2");
			String strLocations_TXT_City = (String) row.get("Locations_TXT_City");
			String strLocations_DD_State = (String) row.get("Locations_DD_State");
			String strLocations_TXT_Zipcode = (String) row.get("Locations_TXT_ZipCode");
			String strLocations_CHK_Is_property_coverage_needed_Yes = (String) row.get("Locations_CHK_IsPropCov_Yes");
			String strLocations_CHK_Is_property_coverage_needed_No = (String) row.get("Locations_CHK_IsPropCov_No");
			String strLocations_NDFiretax_Juris_Desc = (String) row.get("Locations_NDFiretax_Juris_Desc");
			String strLocations_CHK_LocalGovnPremTax = (String) row.get("Locations_CHK_LocalGovnPremTax");
			String strLocations_DD_Municipality_City = (String) row.get("Locations_DD_Municipality_City");
			String strLocations_CHK_KeepAddAsEnt_Lightbox = (String) row.get("Locations_CHK_KeepAddAsEnt_Lightbox");
			String strLocations_BTN_OverrideEligibility = (String) row.get("Locations_BTN_OverrideEligibility");
			String strLocations_BTN_Cancel = (String) row.get("Locations_BTN_Cancel");
			String strLocations_LBL_HardstopMessage = (String) row.get("Locations_LBL_HardstopMessage");
			String strLocations_LBL_HardstopMessage_Present = (String) row.get("Locations_LBL_HardstopMessage_Present");
			String strLocations_LBL_HardstopMessage_AddAtLeast = (String) row.get("Locations_LBL_HardstopMessage_AddAtLeast");
			String strLocations_LBL_HardstopMessage_AddAtLeast_Present = (String) row.get("Locations_LBL_HardstopMessage_AddAtLeast_Present");
			String strLocations_TXT_TotalEmp = (String) row.get("Locations_TXT_TotalEmp");
			String strLocations_TXT_HighestFloor = (String) row.get("Locations_TXT_HighestFloor");
			String strLocations_DD_ILJurisdiction = (String) row.get("Locations_DD_ILJurisdiction");
			String strLocations_CHK_NoSpecificLocation = (String) row.get("Locations_CHK_NoSpecificLocation");
			String strLocations_CHK_ClearAndReEnter = (String) row.get("Locations_CHK_ClearAndReEnter");
			String strLocations_AddStrdMessage = (String) row.get("Locations_AddStrdMessage");
			String strLocations_UpdatedZipCode = (String) row.get("Locations_UpdatedZipCode");
			String strAddVal_NewAddressValidation = (String) row.get("AddVal_NewAddressValidation");
			//String strLocations_TXT_Num = (String) row.get("Locations_TXT_Num");
			//String strLocations_CHK_KeepAddAsEnt = (String) row.get("Locations_CHK_KeepAddAsEnt");
			String strSecura_TXT_Email = (String) row.get("Secura_TXT_Email");
			String strSecura_TXT_Password = (String) row.get("Secura_TXT_Password");
			try {
				se.util().sleep(3000);
				se.log().logTestStep("CP_Locations");
				test.log(LogStatus.INFO, "CP_Locations","Transaction Step : "+transaction + "<br>" +"Page : CP_Locations");
				//se.verify().verifyEquals("CP_Locations  of AgencyPortal ", getLocations_label().isDisplayed(),true, true,test);
				if(strLocations_BTN_OverrideEligibility.contains("Yes"))
				{
					
						AP_OverrideIneligibilty( strRegressionID, transaction, strLocations_BTN_OverrideEligibility, strAgentLink,  strLOB,strRelease_SelectRelease,strRole_SelectRoleAs,strSecura_TXT_Email,strSecura_TXT_Password, test);
					
				}
				
				if(strLocations_BTN_Edit.contains("Edit") || strLocations_BTN_NoEdit.contains("Yes"))
				{
					se.element().waitForElementToAppear_One(strLocations_BTN_Edit,Locations_BTN_Edit, 60);
					test.log(LogStatus.INFO,"Clicking on Edit of Locations Roster screen -",test.addScreenCapture(Util.captureScreenshot("Locations Roster screen" , se)));
					
					se.element().Click(getLocations_BTN_Edit(strLocations_BTN_Edit_Loc), test);
					se.element().waitForLoad(120);
					se.element().waitForElementToDisappear_One(progressBar, 60);
					if(strAddVal_NewAddressValidation.contains("New")&&!strLocations_CHK_NoSpecificLocation.equalsIgnoreCase("Check"))
					{
						AddressStandardization(row, test);
					}
					/*else {
					if(strLocations_CHK_ClearAndReEnter.contains("Yes")) {
						se.element().waitForElementToAppear_One(strLocations_CHK_ClearAndReEnter,Locations_CHK_ClearAndReEnter, 60);
						se.element().Click(getLocations_CHK_ClearAndReEnter(strLocations_CHK_ClearAndReEnter), test);
						test.log(LogStatus.INFO,"Location screen Clicked on ClearAndReEnter- ",test.addScreenCapture(Util.captureScreenshot("Location screen ClearAndReEnter" , se)));
						
					}
					
					se.element().enterOrValidateText(getLocations_TXT_Location(strLocations_TXT_Location),strLocations_TXT_Location,test);
					se.element().enterOrValidateText(getLocations_TXT_Desc(strLocations_TXT_Desc),strLocations_TXT_Desc,test);
					if(!strLocations_TXT_StreetAddrL1.contains("validate2")) {
						se.element().enterOrValidateText(getLocations_TXT_Strt_addr_line1(strLocations_TXT_StreetAddrL1),strLocations_TXT_StreetAddrL1,test);
						
					}
					se.element().enterOrValidateText(getLocations_TXT_Strt_addr_line2(strLocations_TXT_StreetAddrL2),strLocations_TXT_StreetAddrL2,test);
					se.element().enterOrValidateText(getLocations_TXT_City(strLocations_TXT_City),strLocations_TXT_City,test);
					se.element().SelectElement(Locations_DD_State,strLocations_DD_State,test);
					if(strLocations_DD_State.equalsIgnoreCase("Kentucky")) {
						se.util().sleep(3000);
					}
					se.element().enterOrValidateText(getLocations_TXT_Zipcode(strLocations_TXT_Zipcode),strLocations_TXT_Zipcode,test);
					if(strLocations_DD_State.equalsIgnoreCase("Kentucky")) {
						se.element().enterTAB(getLocations_TXT_Zipcode(strLocations_TXT_Zipcode));
						se.element().waitForElementToDisappear_One(progressBar, 90);
						se.util().sleep(3000);
					}
					
					if(strLocations_CHK_ClearAndReEnter.contains("Yes")) {
						se.element().enterTAB(getLocations_TXT_Zipcode(strLocations_TXT_Zipcode));
						se.element().waitForElementToDisappear_One(progressBar, 90);
						se.util().sleep(3000);
						
						if(se.element().isElementPresent(Locations_AddStrdMessage)) {
							se.element().enterOrValidateText(getLocations_AddStrdMessage(strLocations_AddStrdMessage),strLocations_AddStrdMessage,test);
						}else {
							se.element().Click(getLocations_BTN_Save(), test);
							se.element().waitBasedOnCount(PleaseWaitPopup,40);
							if(se.element().isElementPresent(Locations_AddStrdMessage)) {
								se.element().enterOrValidateText(getLocations_AddStrdMessage(strLocations_AddStrdMessage),strLocations_AddStrdMessage,test);
							}else {
								test.log(LogStatus.FAIL,"Location screen Address standardisation message is not displayed- ",test.addScreenCapture(Util.captureScreenshot("Location screen Address standardisation" , se)));
								
							}
							
						}
						se.element().enterOrValidateText(getLocations_TXT_Zipcode(strLocations_UpdatedZipCode),strLocations_UpdatedZipCode,test);
						
					}
					
					}*/
					if(strLocations_CHK_NoSpecificLocation.equalsIgnoreCase("Check")) {
						se.element().SelectElement(Locations_DD_State,strLocations_DD_State,test);	
					}
					se.element().waitBasedOnCount(PleaseWaitPopup,60);
					se.element().waitForElementToDisappear_One(progressBar, 90);
					se.util().sleep(3000);
					se.element().checkUncheckOrValidate(getLocations_CHK_Is_property_coverage_needed_Yes(strLocations_CHK_Is_property_coverage_needed_Yes),strLocations_CHK_Is_property_coverage_needed_Yes,test);
					se.element().checkUncheckOrValidate(getLocations_CHK_Is_property_coverage_needed_No(strLocations_CHK_Is_property_coverage_needed_No),strLocations_CHK_Is_property_coverage_needed_No,test);
					se.util().sleep(5000);
					se.element().checkUncheckOrValidate(getLocations_CHK_LocalGovnPremTax(strLocations_CHK_LocalGovnPremTax),strLocations_CHK_LocalGovnPremTax,test);
					se.element().enterOrValidateText(getLocations_TXT_TotalEmp(strLocations_TXT_TotalEmp),strLocations_TXT_TotalEmp,test);
					se.element().enterOrValidateText(getLocations_TXT_HighestFloor(strLocations_TXT_HighestFloor),strLocations_TXT_HighestFloor,test);
					if(!strLocations_DD_Municipality_City.equalsIgnoreCase("N/A")){
						se.util().sleep(5000);
						se.element().Click(getLocations_DD_MunicpalityCity(), test);
						se.element().enterOrValidateText(getLocations_DD_Municipality_City(strLocations_DD_Municipality_City),strLocations_DD_Municipality_City,test);
					}
					//executor.executeScript("arguments[0].scrollIntoView(0,500);", getLocations_BTN_Save());
					se.element().SelectElement(Locations_NDFiretax_Juris_Desc,strLocations_NDFiretax_Juris_Desc,test);
					se.element().SelectElement(Locations_DD_ILJurisdiction,strLocations_DD_ILJurisdiction,test);
					se.element().Click(getLocations_BTN_Save(), test);
					//se.element().Click(getLocations_BTN_Save());
					/*	if(getLocations_BTN_Save().isEnabled())
						{
							se.element().Click(getLocations_BTN_Save());
						}*/
					 if(constants.Env.contains("dev")&&se.element().isElementPresent(Locations_BTN_Save)){
						 se.element().waitBasedOnCount(PleaseWaitPopup,60);
						 se.element().Click(getLocations_BTN_Save(), test);
						se.util().sleep(2000);
					}
				
			}
				else if(strLocations_BTN_Delete.contains("Delete"))
				{
					test.log(LogStatus.INFO,"Clicking on Delete of Locations Roster screen -",test.addScreenCapture(Util.captureScreenshot("Locations Roster screen" , se)));
					
					se.element().Click(getLocations_BTN_Delete(strLocations_BTN_Delete_Loc), test);
					String DelMsgValidation = se.element().getSelectedText(Locations_Label_Del_Msg);
					se.util().sleep(2000);
					if(DelMsgValidation.contains("If a location is deleted"))
					{
						se.util().sleep(2000);
						se.element().Click(getLocations_BTN_Delete(strLocations_BTN_Delete_Loc), test);
						if(!se.element().isElementVisible(Locations_BTN_Delete_Yes)) {
							se.element().Click(getLocations_BTN_Delete(strLocations_BTN_Delete_Loc), test);
						}
					}
					se.util().sleep(1000);
					executor.executeScript("arguments[0].scrollIntoView(0,500);", getLocations_BTN_Delete_Yes());
					se.element().Click(getLocations_BTN_Delete_Yes(), test);
				}
				else if(strLocations_BTN_Add.contains("Add"))
				{  
					if(strRegressionID.contains("SE")){
						if(iteration!=0){
					se.element().waitForElementToClickable(getLocations_BTN_AddNew(strLocations_BTN_Add), 60);
					test.log(LogStatus.INFO,"Clicking on AddNew of Locations Roster screen -",test.addScreenCapture(Util.captureScreenshot("Locations Roster screen" , se)));
					
					se.element().Click(getLocations_BTN_AddNew(strLocations_BTN_Add), test);
						}
					}else{
					se.element().waitForElementToClickable(getLocations_BTN_AddNew(strLocations_BTN_Add), 60);
					test.log(LogStatus.INFO,"Clicking on AddNew of Locations Roster screen -",test.addScreenCapture(Util.captureScreenshot("Locations Roster screen" , se)));
					
					se.element().Click(getLocations_BTN_AddNew(strLocations_BTN_Add), test);
					}
					se.element().checkUncheckOrValidate(getLocations_CHK_NoSpecificLocation(strLocations_CHK_NoSpecificLocation),strLocations_CHK_NoSpecificLocation,test);
					if(strAddVal_NewAddressValidation.contains("New"))
					{
						AddressStandardization(row, test);
					}/*else {
						
					
					se.element().enterOrValidateText(getLocations_TXT_Location(strLocations_TXT_Location),strLocations_TXT_Location,test);
					se.element().enterOrValidateText(getLocations_TXT_Desc(strLocations_TXT_Desc),strLocations_TXT_Desc,test);
					se.element().enterOrValidateText(getLocations_TXT_Strt_addr_line1(strLocations_TXT_StreetAddrL1),strLocations_TXT_StreetAddrL1,test);
					se.element().enterOrValidateText(getLocations_TXT_Strt_addr_line2(strLocations_TXT_StreetAddrL2),strLocations_TXT_StreetAddrL2,test);
					se.element().enterOrValidateText(getLocations_TXT_City(strLocations_TXT_City),strLocations_TXT_City,test);
					se.element().SelectElement(Locations_DD_State,strLocations_DD_State,test);
					se.element().enterOrValidateText(getLocations_TXT_Zipcode(strLocations_TXT_Zipcode),strLocations_TXT_Zipcode,test);
					se.element().enterTAB(getLocations_TXT_Zipcode(strLocations_TXT_Zipcode));
					se.element().waitForElementToDisappear_One(progressBar, 90);
					se.util().sleep(3000);
					se.element().waitBasedOnCount(PleaseWaitPopup,40);
					if(strLocations_CHK_KeepAddAsEnt_Lightbox.contains("Yes"))
					{
						
						//se.element().Click(getAdd_Button(), test);
						se.util().sleep(5000);
						if (se.element().isElementPresent(Loc_lightbox_AV))	{
							
							se.element().Click(getLoc_lightbox_AV(), test);// ADDED FOR INSIDE/OUTSIDE ACCOUNT
							se.util().sleep(3000);
							se.element().Click(getLoc_KeepAddressAsEntered(), test);
							se.util().sleep(3000);
						}
					}
					}*/
					if(strLocations_CHK_NoSpecificLocation.equalsIgnoreCase("Check")) {
						se.element().SelectElement(Locations_DD_State,strLocations_DD_State,test);	
					}
					se.element().checkUncheckOrValidate(getLocations_CHK_LocalGovnPremTax(strLocations_CHK_LocalGovnPremTax),strLocations_CHK_LocalGovnPremTax,test);
					
					if(!strLocations_DD_Municipality_City.equalsIgnoreCase("N/A")){
						se.util().sleep(5000);
						se.element().Click(getLocations_DD_MunicpalityCity(), test);
						se.element().enterOrValidateText(getLocations_DD_Municipality_City(strLocations_DD_Municipality_City),strLocations_DD_Municipality_City,test);
					}
					se.util().sleep(3000);
					se.element().checkUncheckOrValidate(getLocations_CHK_Is_property_coverage_needed_Yes(strLocations_CHK_Is_property_coverage_needed_Yes),strLocations_CHK_Is_property_coverage_needed_Yes,test);
					se.element().checkUncheckOrValidate(getLocations_CHK_Is_property_coverage_needed_No(strLocations_CHK_Is_property_coverage_needed_No),strLocations_CHK_Is_property_coverage_needed_No,test);
					se.util().sleep(5000);
					se.element().SelectElement(Locations_NDFiretax_Juris_Desc,strLocations_NDFiretax_Juris_Desc,test);
					se.element().SelectElement(Locations_DD_ILJurisdiction,strLocations_DD_ILJurisdiction,test);
					se.util().sleep(3000);
					se.element().enterOrValidateText(getLocations_TXT_TotalEmp(strLocations_TXT_TotalEmp),strLocations_TXT_TotalEmp,test);
					se.element().enterOrValidateText(getLocations_TXT_HighestFloor(strLocations_TXT_HighestFloor),strLocations_TXT_HighestFloor,test);
					se.element().Click(getAdd_Button(), test);
					se.element().waitBasedOnCount(PleaseWaitPopup,40);
					if(se.element().isElementVisible(Locations_CHK_Is_property_coverage_needed_Yes)) {
						se.element().checkUncheckOrValidate(getLocations_CHK_Is_property_coverage_needed_Yes(strLocations_CHK_Is_property_coverage_needed_Yes),strLocations_CHK_Is_property_coverage_needed_Yes,test);
						se.element().checkUncheckOrValidate(getLocations_CHK_Is_property_coverage_needed_No(strLocations_CHK_Is_property_coverage_needed_No),strLocations_CHK_Is_property_coverage_needed_No,test);
					}
					
					se.element().Click(getAdd_Button(), test);
					se.util().sleep(5000);
					if(strLocations_LBL_HardstopMessage_Present.equalsIgnoreCase("Yes"))
					{
						se.verify().verifyEquals("Verifying Hard stop Message", se.element().getText(Locations_LBL_HardStopMessage), strLocations_LBL_HardstopMessage, true, test);
					}
					if(strLocations_LBL_HardstopMessage_AddAtLeast_Present.equalsIgnoreCase("Yes"))
					{
						se.verify().verifyEquals("Verifying Hard stop Message", se.element().getText(Locations_LBL_HardstopMessage_AddAtLeast), strLocations_LBL_HardstopMessage_AddAtLeast, true, test);
					}
					if(strLocations_BTN_Cancel.equalsIgnoreCase("Cancel")) {
						se.element().Click(getCancel_Button(strLocations_BTN_Cancel), test);
					}
					//se.element().waitForElement(PleaseWaitPopup);
					if(strLocations_CHK_KeepAddAsEnt_Lightbox.contains("Yes"))
					{
						if (se.element().exists(Loc_lightbox_AV))	{
							//se.element().waitBasedOnCount(PleaseWaitPopup,40);
							se.element().waitForElementLoading(getLoc_lightbox_AV());
							se.driver().switchTo().activeElement();
							//se.element().Click(getGenInfoLightboxClose());
							se.element().Click(getLoc_lightbox_AV(), test);// ADDED FOR INSIDE/OUTSIDE ACCOUNT
							//se.util().sleep(4000);
							se.element().Click(getgeninfo_lightbox_account_Save(), test);
							se.util().sleep(2000);
							se.element().Click(getAdd_Button(), test);
						}
					}
				}
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for CP_Locations_Details ", true, false, true, test);
			}
			iteration++;
		}
		se.util().sleep(3000);
		se.element().Click(getGI_CHK_Continue(), test);
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}
public void AddressStandardization (LinkedHashMap<String, String> row,ExtentTest test) throws IOException{
		
		String strLocations_TXT_StreetAddrL1 = (String) row.get("Locations_TXT_StreetAddrL1");
		String strLocations_TXT_StreetAddrL2 = (String) row.get("Locations_TXT_StreetAddrL2");
		String strLocations_TXT_City = (String) row.get("Locations_TXT_City");
		String strLocations_DD_State = (String) row.get("Locations_DD_State");
		String strLocations_TXT_Zipcode = (String) row.get("Locations_TXT_ZipCode");
		String strAddVal_AddValType = (String) row.get("AddVal_AddValType");
		String strNoSuggestedAddMessage = "No suggested address is found";
		String strLocations_CHK_NoSpecificLocation = (String) row.get("Locations_CHK_NoSpecificLocation");
		//String strLocations_AddStrdMessage = (String) row.get("Locations_AddStrdMessage");
		
		se.element().enterOrValidateText(getLocations_TXT_Strt_addr_line1(strLocations_TXT_StreetAddrL1),strLocations_TXT_StreetAddrL1,test);
		se.element().enterOrValidateText(getLocations_TXT_Strt_addr_line2(strLocations_TXT_StreetAddrL2),strLocations_TXT_StreetAddrL2,test);
		se.element().enterOrValidateText(getLocations_TXT_Zipcode(strLocations_TXT_Zipcode),strLocations_TXT_Zipcode,test);
		
		switch (strAddVal_AddValType) {
			case "Add Match w/SuggestedAdd":
				se.element().waitBasedOnCount(PleaseWaitPopup, 40);
				se.element().waitForElementLoading(getLoc_lightbox_AV());
				se.driver().switchTo().activeElement();
				AVLightboxButtonAction(row,strLocations_TXT_StreetAddrL2,test);
				break;
			case "Add Match w/NOSuggestedAdd":
				se.element().waitBasedOnCount(PleaseWaitPopup, 40);
				se.element().waitForElementLoading(getLoc_lightbox_AV());
				se.driver().switchTo().activeElement();
				se.verify().verifyEquals("No Suggested address should display", getAVLightbox_TXT_NoSuggestedAdd().getText(), strNoSuggestedAddMessage, test);
				AVLightboxButtonAction(row,strLocations_TXT_StreetAddrL2,test);
				break;
			case "No Match":
				
				break;
			case "Invalid Zip":
							
				break;
			
		}
		
		se.util().sleep(3000);
		se.element().waitBasedOnCount(PleaseWaitPopup,40);
		se.element().waitForElementToDisappear_One(progressBar,120);
       /* se.element().waitForElementToAppear_One(strGI_AppInfo_AddStrdMessage,GI_AppInfo_AddStrdMessage, 5);
		se.element().enterOrValidateText(getGI_AppInfo_AddStrdMessage(strGI_AppInfo_AddStrdMessage),strGI_AppInfo_AddStrdMessage,test);
		*/se.element().enterOrValidateText(getLocations_TXT_City(strLocations_TXT_City),strLocations_TXT_City,test);
		se.element().enterOrValidateText(getLocations_DD_State(strLocations_DD_State),strLocations_DD_State,test);
	}
	
	public void AVLightboxButtonAction(LinkedHashMap<String, String> row,String strGI_AppInfo_TXT_MailingAddressLine2, ExtentTest test) {
		
		String strAVLightBox_BTN_SelectSuggestedAdd = (String) row.get("AVLightBox_BTN_SelectSuggestedAdd");
		String strAVLightBox_BTN_UpdateAdd = (String) row.get("AVLightBox_BTN_UpdateAdd");
		String strAVLightBox_BTN_KeepAddAsEntered = (String) row.get("AVLightBox_BTN_KeepAddAsEntered");
		String strAVLightBox_LNK_SelectSuggestedAdd = (String) row.get("AVLightBox_LNK_SelectSuggestedAdd");
		String strAddVal_CHK_KeepAddEntered = (String) row.get("AddVal_CHK_KeepAddEntered");
		
		if (strAVLightBox_BTN_KeepAddAsEntered.equals(constants.Yes)) {
			se.element().Click(getAVLightbox_BTN_KeepAddEntered(), test);
			se.element().waitForElementIsDisplayed(getAddVal_CHK_KeepAddEntered());
			se.element().checkUncheckOrValidate(getAddVal_CHK_KeepAddEntered(),strAddVal_CHK_KeepAddEntered,test);
			se.util().sleep(4000);
		}
		
		if (strAVLightBox_BTN_SelectSuggestedAdd.equals(constants.Yes)) {
			se.element().Click(getAVLightbox_LNK_SelectSuggestedAdd(strAVLightBox_LNK_SelectSuggestedAdd), test);
			se.element().Click(getAVLightbox_BTN_UseSelectedAdd(), test);
	 
			se.util().sleep(4000);
			if (se.element().isElementPresent(AVLightbox_BTN_UseSelectedAdd))	{
				se.element().Click(getAVLightbox_LNK_SelectSuggestedAdd(strAVLightBox_LNK_SelectSuggestedAdd), test);
				se.element().Click(getAVLightbox_BTN_UseSelectedAdd(), test);
			}
		
		}
		
		if (strAVLightBox_BTN_UpdateAdd.equals(constants.Yes)) {
			se.element().Click(getAVLightbox_BTN_UpdateAdd(), test);
			se.element().enterOrValidateText(getGI_AI_Label_Address_Line2(strGI_AppInfo_TXT_MailingAddressLine2),strGI_AppInfo_TXT_MailingAddressLine2,test);
		}
	}
	
	public void InternalLogin(String strSecura_TXT_Email, String strSecura_TXT_Password, ExtentTest test) throws IOException
	{
		{
			
			se.log().logTestStep("Access Agency Port Application");
			
			se.browser().get(SystemPropertyUtil.getPopupUrl(),test);
			
			/*se.element().waitForElementIsDisplayed(getQAALUsername());
			se.verify().verifyEquals("Login Page is displayed", getQAALUsername().isDisplayed(), true, true, test);
			se.element().enterText(getQAALUsername(), strSecura_TXT_Email);
			se.element().enterText(getQAALPassword(), strSecura_TXT_Password);
			se.log().logSeStep("Entering username as: " + strSecura_TXT_Email);
			se.log().logSeStep("Entering password as: " + strSecura_TXT_Password);
			test.log(LogStatus.INFO, "Entering text in USERNAME & PASSWORD fields", "<b>USERNAME : "+strSecura_TXT_Email+"<br> <b>PASSWORD : "+strSecura_TXT_Password); 
			//se.util().sleep(1000);
			se.element().waitForElement(Qaagentlink_btn_login);
			se.element().Click(getQAALLogin(), test);
			test.log(LogStatus.INFO, "Clicking on the button", "Click on LOGIN");
			//se.element().Click(getALInernal(), test);
			se.util().sleep(3000);
			*///se.util().sleep(3000);
			/*se.element().Click(getALInernal(), test);
			se.element().enterText(getSecura_TXT_Email(), strSecura_TXT_Email);
			se.util().sleep(2000);
			se.element().Click(getSecura_BTN_NextSubmit(), test);
			se.util().sleep(2000);
			se.element().enterText(getSecura_TXT_Password(), strSecura_TXT_Password);
			se.util().sleep(2000);
			se.element().Click(getSecura_BTN_NextSubmit(), test);
			se.util().sleep(2000);
			se.element().Click(getSecura_BTN_ReduceNoLogin(), test);
			se.util().sleep(2000);
			*/
		}
	}
	/*private void InternalLogin(String strSecura_TXT_Email, String strSecura_TXT_Password, ExtentTest test) {
		// TODO Auto-generated method stub
		se.log().logTestStep("Access Agency Port Application");
		
		se.browser().get(SystemPropertyUtil.getPopupUrl(),test);
		se.element().Click(getALInernal(), test);
		se.element().enterText(getSecura_TXT_Email(), strSecura_TXT_Email);
		se.util().sleep(2000);
		se.element().Click(getSecura_BTN_NextSubmit(), test);
		se.util().sleep(2000);
		se.element().enterText(getSecura_TXT_Password(), strSecura_TXT_Password);
		se.util().sleep(2000);
		se.element().Click(getSecura_BTN_NextSubmit(), test);
		se.util().sleep(2000);
		se.element().Click(getSecura_BTN_ReduceNoLogin(), test);
		se.util().sleep(2000);
	}*/

	public void AP_OverrideIneligibilty(String strRegressionID, String transaction,String strOveride, String strAgentLink, String strLOB,String strRelease_SelectRelease,String strRole_SelectRoleAs,String strSecura_TXT_Email,String strSecura_TXT_Password, ExtentTest test) throws IOException {
		String ApplicantName = "";
		String QuoteNumber = "";
		if ( strAgentLink.equals("Yes") && strOveride.equalsIgnoreCase("YES"))
		{
			if(transaction=="NewQuote"||strLOB.equalsIgnoreCase("Commercial Package") ) {
				se.util().sleep(1000);
				se.element().Click(getBtnContinue(), test);
				String jobTitle = se.element().getText(ap_quoteNo);
				String splitJobTitle[] = jobTitle.split("-");
				if(!jobTitle.contains("Package")){
					String strtitleSplit[] = splitJobTitle[0].split("\\(");
					String getApplicantName[] = splitJobTitle[1].split("\\)");
					ApplicantName = getApplicantName[0].trim();
					System.out.println(ApplicantName);
					QuoteNumber = strtitleSplit[1].trim();
					System.out.println(QuoteNumber);
				}
				else{
					String strtitleSplit[] = splitJobTitle[1].split("\\)");
					String getQuote[] = splitJobTitle[0].split("\\(");
					ApplicantName = strtitleSplit[0].trim();
					QuoteNumber = getQuote[2].trim();
					System.out.println(QuoteNumber);
				}
			}
			se.element().Click(getMyWork(), test);
			if (!se.element().isElementPresent(menu_lnk_locations)) {
				AP_Login  LoginPage = TestPageFactory.initElements(se, AP_Login.class);
				LoginPage.APLogoutDetails("Yes", test);
				se.browser().deleteCookies();
				/*se.browser().get(SystemPropertyUtil.getLocale());
				se.element().selectradiovalue(role_rdo_releaseselect, strRole_SelectRoleAs);
				se.element().selectradiovalue(role_rdo_roleselect, strRelease_SelectRelease);  
				se.verify().verifyEquals("All four roles are displayed", getRoleSubmit().isDisplayed(), true, true,test); 
				se.element().Click(getRoleSubmit());*/
				/*if (constants.Env.equals("stage") ) 
				{
					se.browser().get(SystemPropertyUtil.getPopupUrl(),test);
				}

				else*/
				{
				InternalLogin(strSecura_TXT_Email, strSecura_TXT_Password, test);
				}
				//se.browser().get(SystemPropertyUtil.getPopupUrl(),test);
				//se.element().Click(getCAFullApplication());
				se.element().Click(getMyWork(), test);
				try {
					se.element().Click(getclick_view(), test);
					se.element().Click(getClearAll(), test);
					se.util().sleep(2000);
					se.element().Click(getdropdown_MoreOptions(), test);
					se.element().enterText(gettxt_quoteOrPolicyNumber(),QuoteNumber); 
					se.element().Click(getcommon_searchBtn(), test);
				}
				catch (StaleElementReferenceException e)
				{
					se.element().Click(getclick_view(), test);
					se.element().Click(getClearAll(), test);
					se.util().sleep(2000);
					se.element().Click(getdropdown_MoreOptions(), test);
					se.element().enterText(gettxt_quoteOrPolicyNumber(),QuoteNumber); 
					se.element().Click(getcommon_searchBtn(), test);
				}
				try {
					se.util().sleep(5000);
					se.element().Click(getCardHeader(), test);
					se.element().Click(getBtneventWorkItemAction_Open(), test);
					se.element().Click(getGI_CHK_Continue(), test);
				}
				catch (StaleElementReferenceException e)
				{
					se.browser().refresh();
					se.element().Click(getCardHeader(), test);
					se.util().sleep(3000);
					se.element().waitForElementToAppear_One(" ",btn_eventWorkItemActionOpen, 120);
					se.element().Click(getBtneventWorkItemAction_Open(), test);
					se.element().Click(getGI_CHK_Continue(), test);
				}
				catch ( Exception e)
				{
					e.printStackTrace();
				}
				if(se.element().isElementPresent(GI_AgencyInformationSection_label)){
					se.util().sleep(2000);
					se.element().Click(getContinue_Button(), test);
				}

				if (se.element().isElementPresent(accountclearence_btn_overrideeligibility)) {
					se.log().logSeStep("Override Eligibility is displayed");
					se.element().Click(getOverrideEligibility(), test);
					se.util().sleep(3000);
				}
				se.element().Click(getclickon_Mywork(), test);
				
				LoginPage = TestPageFactory.initElements(se, AP_Login.class);
				LoginPage.APLogoutDetails("Yes",test);
				se.util().sleep(6000);
				
				LoginPage.APAppLogin(strRegressionID,   transaction,"No", test);
				try {
					se.element().Click(getclickon_Mywork(), test);
					se.element().Click(getclick_view(), test);
					se.element().Click(getClearAll(), test);
					se.util().sleep(2000);
					se.element().Click(getdropdown_MoreOptions(), test);
					se.element().enterText(gettxt_quoteOrPolicyNumber(),QuoteNumber); 
					se.element().Click(getcommon_searchBtn(), test);
					se.util().sleep(5000);
					se.element().Click(getCardHeader(), test);
					se.element().waitForElementToAppear_One(" ",btn_eventWorkItemActionOpen, 10);
					se.element().Click(geteventWorkItemActionOpen(), test);
					if(se.element().isElementPresent(GI_AgencyInformationSection_label)){
						se.util().sleep(2000);
						se.element().Click(getGI_CHK_Continue(), test);
						se.element().refreshBrowser();
					}
					
				}
				catch (StaleElementReferenceException e)
				{
					se.element().refreshBrowser();
					se.util().sleep(5000);
					se.element().Click(getCardHeader(), test);
					se.element().waitForElementToAppear_One(" ",btn_eventWorkItemActionOpen, 10);
					se.element().clickelement(geteventWorkItemActionOpen(),test);
					if(se.element().isElementPresent(GI_AgencyInformationSection_label)){
						se.util().sleep(2000);
						se.element().Click(getGI_CHK_Continue(), test);
						se.element().refreshBrowser();
					}
				}
			}

		}
		else{
			if (se.element().isElementPresent(accountclearence_btn_overrideeligibility)) {
				se.log().logSeStep("Override Eligibility is displayed");
				se.element().Click(getOverrideEligibility(), test);

			}
		}
	}
}



