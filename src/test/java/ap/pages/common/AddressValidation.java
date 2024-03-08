package ap.pages.common;

import java.io.IOException;
import java.util.LinkedHashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;

import ap.Constants.constants;
import ap.OR.OR_CP;

public class AddressValidation extends OR_CP {
	
	
	public void AddressStandardization (LinkedHashMap<String, String> row,ExtentTest test) throws IOException{
		
		String strGI_AppInfo_TXT_MailingAddressLine1 = (String) row.get("GI_AppInfo_TXT_MailingAddressLine1");
		String strGI_AppInfo_TXT_MailingAddressLine2 = (String) row.get("GI_AppInfo_TXT_MailingAddressLine2");
		String strGI_AppInfo_TXT_City = (String) row.get("GI_AppInfo_TXT_City");
		String strGI_AppInfo_DD_StateorProvince = (String) row.get("GI_AppInfo_DD_StateorProvince");
		String strGI_AppInfo_TXT_ZipCode = (String) row.get("GI_AppInfo_TXT_ZipCode");
		String strAddVal_AddValType = (String) row.get("AddVal_AddValType");
		String strNoSuggestedAddMessage = "No suggested address is found";
		String strGI_AppInfo_AddStrdMessage = (String) row.get("GI_AppInfo_AddStrdMessage");
		
		se.element().enterOrValidateText(getGI_AppInfo_TXT_MailingAddressLine1(strGI_AppInfo_TXT_MailingAddressLine1),strGI_AppInfo_TXT_MailingAddressLine1,test);
		se.element().enterOrValidateText(getGI_AppInfo_TXT_MailingAddressLine2(strGI_AppInfo_TXT_MailingAddressLine2),strGI_AppInfo_TXT_MailingAddressLine2,test);
		se.element().enterOrValidateText(getGI_AppInfo_TXT_ZipCode(strGI_AppInfo_TXT_ZipCode),strGI_AppInfo_TXT_ZipCode,test);
		
		switch (strAddVal_AddValType) {
			case "Add Match w/SuggestedAdd":
				se.element().waitBasedOnCount(PleaseWaitPopup, 40);
				se.element().waitForElementLoading(getLoc_lightbox_AV());
				se.driver().switchTo().activeElement();
				AVLightboxButtonAction(row,strGI_AppInfo_TXT_MailingAddressLine2,test);
				break;
			case "Add Match w/NOSuggestedAdd":
				se.element().waitBasedOnCount(PleaseWaitPopup, 40);
				se.element().waitForElementLoading(getLoc_lightbox_AV());
				se.driver().switchTo().activeElement();
				se.verify().verifyEquals("No Suggested address should display", getAVLightbox_TXT_NoSuggestedAdd().getText(), strNoSuggestedAddMessage, test);
				AVLightboxButtonAction(row,strGI_AppInfo_TXT_MailingAddressLine2,test);
				break;
			case "No Match":
				
				break;
			case "Invalid Zip":
							
				break;
			
		}
		se.util().sleep(3000);
		se.element().waitBasedOnCount(PleaseWaitPopup,40);
		se.element().waitForElementToDisappear_One(progressBar,120);
        se.element().waitForElementToAppear_One(strGI_AppInfo_AddStrdMessage,GI_AppInfo_AddStrdMessage, 5);
		se.element().enterOrValidateText(getGI_AppInfo_AddStrdMessage(strGI_AppInfo_AddStrdMessage),strGI_AppInfo_AddStrdMessage,test);
		se.element().enterOrValidateText(getGI_AppInfo_TXT_City(strGI_AppInfo_TXT_City),strGI_AppInfo_TXT_City,test);
		se.element().enterOrValidateText(getGI_AppInfo_DD_StateorProvince(strGI_AppInfo_DD_StateorProvince),strGI_AppInfo_DD_StateorProvince,test);
	}
	
	public void AVLightboxButtonAction(LinkedHashMap<String, String> row,String strGI_AppInfo_TXT_MailingAddressLine2, ExtentTest test) {
		
		String strAVLightBox_BTN_SelectSuggestedAdd = (String) row.get("AVLightBox_BTN_SelectSuggestedAdd");
		String strAVLightBox_BTN_UpdateAdd = (String) row.get("AVLightBox_BTN_UpdateAdd");
		String strAVLightBox_BTN_KeepAddAsEntered = (String) row.get("AVLightBox_BTN_KeepAddAsEntered");
		String strAVLightBox_LNK_SelectSuggestedAdd = (String) row.get("AVLightBox_LNK_SelectSuggestedAdd");
		String strAddVal_CHK_KeepAddEntered = (String) row.get("AddVal_CHK_KeepAddEntered");
		
		if (strAVLightBox_BTN_KeepAddAsEntered.equals(constants.Yes)) {
			se.element().Click(getAVLightbox_BTN_KeepAddEntered(), test);
			se.util().sleep(3000);
			if(se.element().isElementPresent(AVLightbox_BTN_KeepAddEntered)) {
				se.element().Click(getAVLightbox_BTN_KeepAddEntered(), test);
			}
			//se.element().waitForElementIsDisplayed(getAddVal_CHK_KeepAddEntered());
			se.element().checkUncheckOrValidate(getAddVal_CHK_KeepAddEntered(),strAddVal_CHK_KeepAddEntered,test);
			se.element().waitBasedOnCount(PleaseWaitPopup,40);
			se.element().waitForElementToDisappear_One(progressBar,120);
		}
		
		if (strAVLightBox_BTN_SelectSuggestedAdd.equals(constants.Yes)) {
			se.element().Click(getAVLightbox_LNK_SelectSuggestedAdd(strAVLightBox_LNK_SelectSuggestedAdd), test);
			se.element().Click(getAVLightbox_BTN_UseSelectedAdd(), test);
			se.element().waitBasedOnCount(PleaseWaitPopup,40);
			se.element().waitForElementToDisappear_One(progressBar,120);
		}
		
		if (strAVLightBox_BTN_UpdateAdd.equals(constants.Yes)) {
			se.element().Click(getAVLightbox_BTN_UpdateAdd(), test);
			se.element().enterOrValidateText(getGI_AI_Label_Address_Line2(strGI_AppInfo_TXT_MailingAddressLine2),strGI_AppInfo_TXT_MailingAddressLine2,test);
			se.element().waitBasedOnCount(PleaseWaitPopup,40);
			se.element().waitForElementToDisappear_One(progressBar,120);
		}
	}

}
