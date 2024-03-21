package ap.pages.CP;

import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.SystemPropertyUtil;
import Libraries.automation.common.Utils.TestPageFactory;
import Libraries.automation.common.framework.Util;
import ap.Constants.constants;

import ap.OR.BL_OR_CP;
import ap.pages.common.APPW_CommonMethods;
import ap.pages.common.AddressValidation;

public class CP_GenInfo extends BL_OR_CP {
	
	public   void CP_GenInfo_Details(String strRegressionID, String transaction,String suspendSheet, String strAgentLink, String strLOB,String strRelease_SelectRelease,String strRole_SelectRoleAs,ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.GeneralInformation)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		APPW_CommonMethods APPW_CommonMethods=TestPageFactory.initElements(se, APPW_CommonMethods.class); 
		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		//applicantNameNoaddon = se.util().randomApplicantNameNo();
		List<Map<String, String>> table = ExcelOperations.getBLPagesData(constants.GeneralInformation, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			
			String strGI_AI_TXT_AgencyName = (String) row.get("GI_AI_TXT_AgencyName");
			String strGI_AI_DD_Producer = (String) row.get("GI_AI_DD_Producer");
			String strGI_AI_TXT_Address_Line1 = (String) row.get("GI_AI_Label_Address_Line1");
			String strGI_AI_TXT_Address_Line2 = (String) row.get("GI_AI_Label_Address_Line2");
			String strGI_AI_TXT_City = (String) row.get("GI_AI_Label_City");
			String strGI_AI_TXT_State = (String) row.get("GI_AI_Label_State");
			String strGI_AI_TXT_ZipCode = (String) row.get("GI_AI_Label_ZipCode");
			String strGI_AI_TXT_AgencyPhone = (String) row.get("GI_AI_Label_AgencyPhone");
			String strGI_AI_TXT_Agent_CSR_Name = (String) row.get("GI_AI_TXT_Agent/CSR_Name");
			String strGI_AI_TXT_Agent_CSR_Phone = (String) row.get("GI_AI_TXT_Agent/CSR_Phone");
			String strGI_AI_TXT_Agent_CSR_Email = (String) row.get("GI_AI_TXT_Agent/CSR E-mail");
			String strGI_AppInfo_TXT_EffectiveDate = (String) row.get("GI_AppInfo_TXT_EffectiveDate");
			//String eff_date = Util.getCurrentDate();
			String eff_date = SystemPropertyUtil.getEffectiveDate();
			String control_date = SystemPropertyUtil.getControlDate();
			
			/*String strGI_NatOfBusi_EventStartDate = (String) row.get("GI_NatOfBusi_EventStartDate");
			String strGI_NatOfBusi_SetupBeginDate = (String) row.get("GI_NatOfBusi_SetupBeginDate");
			String strGI_NatOfBusi_TeardownEndDate = (String) row.get("GI_NatOfBusi_TearDownEndDate");
			String strGI_NatOfBusi_EventEndDate = (String) row.get("GI_NatOfBusi_EventEndDate");
			*/
			String EventStartDate;
			String EventEnddate;
			String TeardownEndDate;
			String Tommdate= Util.FutureDate(16);
			//String strGI_NatOfBusi_NumberofEventSetupdays = (String) row.get("GI_NatOfBusi_NumberofEventSetupdays");
			//String stlegalrGI_NatOfBusi_NumberofEventteardowndays = (String) row.get("GI_NatOfBusi_NumberofEventteardowndays");
			//String strGI_AppInfo_TXT_ClearanceExpirationDate = (String) row.get("GI_AppInfo_TXT_ClearanceExpirationDate");
			String strGI_AppInfo_TXT_ExpirationDate = (String) row.get("GI_AppInfo_TXT_ExpirationDate");
			String strGI_AI_DD_AgencyName = (String) row.get("GI_AI_DD_AgencyName");
			String strGI_AppInfo_TXT_Tax_ID = (String) row.get("GI_AppInfo_TXT_Tax_ID");
			String strGI_HardstopMessage_EventDate_YesOrNo = (String) row.get("GI_HardstopMessage_EventDate_YesOrNo");
			String strGI_HardstopMessage_EventDate = (String) row.get("GI_HardstopMessage_EventDate");
			
			String strGI_NatOfBusi_Special_Events_Type = (String) row.get("GI_NatOfBusi_Special_Events_Type");
			
			
			try {
				se.log().logTestStep("CP_GenInfo");
				test.log(LogStatus.INFO, "CP_GenInfo page","Transaction Step : "+transaction + "<br>" +"Page : CP_GenInfo");
				se.verify().verifyEquals("CP_GenInfo Details  of AgencyPortal ", getGI_GeneralInfoHelpMessageSection_label().isDisplayed(),true, true,test);
				se.element().waitForElementToDisappear_One(progressBar,120);
				se.element().waitBasedOnCount(PleaseWaitPopup,60);
				APPW_CommonMethods.hide_acordXml();
			//stpflag	if(!(constants.Env.contains("qa"))||!(constants.Env.contains("dev"))) {
				if(transaction.equalsIgnoreCase("NewQuote")&&strGI_AI_DD_AgencyName.equalsIgnoreCase("Yes")) {
					se.element().Click(getGI_AI_Click_AgencyName(), test);
				}
				se.element().enterOrValidateText(getGI_AI_TXT_AgencyName2(strGI_AI_TXT_AgencyName),strGI_AI_TXT_AgencyName,test);
				se.util().sleep(3000);
				if(constants.Env.contains("dev")) {
				se.element().waitForElementToDisappear_One(progressBar,120);
				se.element().waitBasedOnCount(PleaseWaitPopup,60);
				se.util().sleep(10000);
				}
				se.element().waitForElementToAppear_One(strGI_AI_DD_Producer,GI_AI_DD_Producer, 30);
				
				se.element().SelectElement(GI_AI_DD_Producer, strGI_AI_DD_Producer,test);
							se.element().enterOrValidateText(getGI_AI_Label_Address_Line1(strGI_AI_TXT_Address_Line1),strGI_AI_TXT_Address_Line1,test);
				se.element().enterOrValidateText(getGI_AI_Label_Address_Line2(strGI_AI_TXT_Address_Line2),strGI_AI_TXT_Address_Line2,test);
				se.element().enterOrValidateText(getGI_AI_Label_City(strGI_AI_TXT_City),strGI_AI_TXT_City,test);
				se.element().enterOrValidateText(getGI_AI_Label_State(strGI_AI_TXT_State),strGI_AI_TXT_State,test);
				se.element().enterOrValidateText(getGI_AI_Label_ZipCode(strGI_AI_TXT_ZipCode),strGI_AI_TXT_ZipCode,test);
				se.element().enterOrValidateText(getGI_AI_Label_AgencyPhone(strGI_AI_TXT_AgencyPhone),strGI_AI_TXT_AgencyPhone,test);
				se.element().enterOrValidateText(getGI_AI_TXT_Agent_CSR_Name(strGI_AI_TXT_Agent_CSR_Name),strGI_AI_TXT_Agent_CSR_Name,test);
				se.element().enterOrValidateText(get_GI_AI_TXT_Agent_CSR_Phone(strGI_AI_TXT_Agent_CSR_Phone),strGI_AI_TXT_Agent_CSR_Phone,test);
				
				se.element().enterOrValidateText(getGI_AI_TXT_Agent_CSR_Email(strGI_AI_TXT_Agent_CSR_Email),strGI_AI_TXT_Agent_CSR_Email,test);
				
				//se.util().sleep(3000);
				if(iteration>0) {
					se.element().waitBasedOnCount(PleaseWaitPopup,40);
				}
				se.element().waitForElement(GI_AppInfo_TXT_EffectiveDate);
				if (!strGI_AppInfo_TXT_EffectiveDate.contains("N/A") && transaction.contains("NewQuote"))
				{
					se.element().enterOrValidateTextDate(getGI_AppInfo_TXT_EffectiveDate(strGI_AppInfo_TXT_EffectiveDate),strGI_AppInfo_TXT_EffectiveDate,test);
					se.util().sleep(2000);
					se.element().waitBasedOnCount(PleaseWaitPopup,40);
				}
				else if(transaction.equalsIgnoreCase("NewQuote")) 
				{
					se.element().enterOrValidateTextDate(getGI_AppInfo_TXT_EffectiveDate(eff_date),eff_date,test);
						se.util().sleep(2000);
					se.element().waitBasedOnCount(PleaseWaitPopup,40);
					
					se.element().enterOrValidateTextDate(getGI_AppInfo_TXT_ControlDate(control_date),control_date,test);
					se.util().sleep(2000);
				se.element().waitBasedOnCount(PleaseWaitPopup,40);
				}
				//stpflag	}
				
				/*if(strLOB.equals(constants.SE)&&constants.Env.contains("qa")) {
					se.element().waitForElement(GI_AppInfo_TXT_EffectiveDate);
					if (!strGI_AppInfo_TXT_EffectiveDate.contains("N/A") && transaction.contains("NewQuote"))
					{
						se.element().enterOrValidateText(getGI_AppInfo_TXT_EffectiveDate(strGI_AppInfo_TXT_EffectiveDate),strGI_AppInfo_TXT_EffectiveDate,test);
						se.util().sleep(2000);
						se.element().waitBasedOnCount(PleaseWaitPopup,40);
					}
					else if(transaction.equalsIgnoreCase("NewQuote")) 
					{
						se.element().enterOrValidateText(getGI_AppInfo_TXT_EffectiveDate(eff_date),eff_date,test);
							se.util().sleep(2000);
						se.element().waitBasedOnCount(PleaseWaitPopup,40);
					}
				}*/
				
				se.element().SelectElement(GI_NatOfBusi_Special_Events_Type,strGI_NatOfBusi_Special_Events_Type,test);
				se.element().waitForElementToDisappear_One(progressBar,120);
				se.element().waitBasedOnCount(PleaseWaitPopup,60);
				if(strLOB.equals(constants.SE) && strGI_NatOfBusi_Special_Events_Type.contains("Special Events Liability"))
				{
					String text=se.element().getText(GI_NatOfBusi_TXT_SpecialEvent_description);
					if(text.contains("Only classes displayed below"))
					{
						se.element().waitForElement(GI_NatOfBusi_Clk_Primary_Business_Description);
					}
				}
				//Setup Begin date
				 if(transaction.equalsIgnoreCase("NewQuote") && !strLOB.equals(constants.CP) &&strGI_NatOfBusi_Special_Events_Type.contains("Special Events Liability") )
				{
					 se.util().sleep(5000);
					se.element().enterOrValidateTextDate(getGI_NatOfBusi_SetupBeginDate(eff_date),eff_date,test);

				}
				//Event Start Date
				if(transaction.equalsIgnoreCase("NewQuote")&& !strLOB.equals(constants.CP) &&strGI_NatOfBusi_Special_Events_Type.contains("Special Events Liability") )
				{
					 se.util().sleep(5000);
					EventStartDate= Util.FutureDate(1);
					se.element().enterOrValidateTextDate(getGI_NatOfBusi_EventStartDate(EventStartDate),EventStartDate,test);
	
				}

				 if(transaction.equalsIgnoreCase("NewQuote")  && !strLOB.equals(constants.CP) &&strGI_NatOfBusi_Special_Events_Type.contains("Hole In One"))
				{
					 se.util().sleep(5000);
					 se.element().waitForElementToAppear_One(eff_date,GI_NatOfBusi_EventStartDate,20);
					se.element().enterOrValidateTextDate(getGI_NatOfBusi_EventStartDate(eff_date),eff_date,test);
					se.element().waitBasedOnCount(PleaseWaitPopup,40);

				}
				
				//Event End date
				
				 if(transaction.contains("NewQuote") && !strLOB.equals(constants.CP)&&strGI_NatOfBusi_Special_Events_Type.contains("Special Events Liability") )
				{
					 se.util().sleep(5000);
					EventEnddate=Util.FutureDate(10);
					se.element().enterOrValidateTextDate(getGI_NatOfBusi_EventEndDate(EventEnddate),EventEnddate,test);

				}
				//Teardown end date
				
				 if(transaction.contains("NewQuote") && !strLOB.equals(constants.CP)&&strGI_NatOfBusi_Special_Events_Type.contains("Special Events Liability") )
				{
						se.util().sleep(2000);
					TeardownEndDate=Util.FutureDate(15);
					se.element().enterOrValidateTextDate(getGI_NatOfBusi_TeardownEndDate(TeardownEndDate),TeardownEndDate,test);

				}
				
				if (!strGI_AppInfo_TXT_ExpirationDate.contains("N/A") && transaction.contains("NewQuote")&& strLOB.equals(constants.SE) )
				{
						se.util().sleep(2000);
					se.element().waitBasedOnCount(PleaseWaitPopup,40);
					se.element().enterOrValidateTextDate(getGI_AppInfo_TXT_ExpirationDate(strGI_AppInfo_TXT_ExpirationDate),strGI_AppInfo_TXT_ExpirationDate,test);
				}
				else if(transaction.equalsIgnoreCase("NewQuote") && strLOB.equals(constants.SE)) 
				{
					se.element().waitBasedOnCount(PleaseWaitPopup,40);
					se.element().enterOrValidateTextDate(getGI_AppInfo_TXT_ExpirationDate(Tommdate),Tommdate,test);
					test.log(LogStatus.INFO, "Actual Expiration Date is - ", test.addScreenCapture(Util.captureScreenshot("502 Error" , se)));
					
				}
				se.util().sleep(5000);
				
				 AppInfo(row, transaction,strLOB, strGI_AppInfo_TXT_Tax_ID, test);
				 NatureOfBusiness(row, transaction, strAgentLink, strGI_AppInfo_TXT_Tax_ID, test);
				 EligibiltyQuestions( row, test);
				 if(!se.element().isElementPresent(geninfo_lightbox_AC)) {
				executor.executeScript("arguments[0].scrollIntoView(0,500);", getGI_CHK_Continue());
				
				se.element().Click(getGI_CHK_Continue(), test);
				
				se.element().waitForElementToDisappear_One(progressBar,120);
				se.element().waitBasedOnCount(PleaseWaitPopup,60);
				se.util().sleep(5000);
				 }else {
					 
				 }
				if(!se.element().isElementPresent(geninfo_lightbox_AC)) {
				if (strGI_AI_DD_AgencyName.equalsIgnoreCase("No")&&se.element().isElementPresent(GI_AgencyInformationSection_label))	{
					se.element().waitBasedOnCount(PleaseWaitPopup,60);
					se.element().Click(getGI_CHK_Continue(), test);
					se.util().sleep(2000);
					
				}else if(constants.Env.contains("dev")&&se.element().isElementPresent(GI_AgencyInformationSection_label)){
					
					se.element().waitBasedOnCount(PleaseWaitPopup,60);
					se.element().Click(getGI_CHK_Continue(), test);
					se.util().sleep(2000);
				}
				else if(constants.Env.contains("qa")&&se.element().isElementPresent(GI_AgencyInformationSection_label)){
					
					se.element().waitBasedOnCount(PleaseWaitPopup,60);
					se.element().Click(getGI_CHK_Continue(), test);
					se.util().sleep(2000);
				}
			}
				
				se.element().waitForElementToDisappear_One(progressBar,120);
				se.element().waitForLoad(120);
				se.element().waitBasedOnCount(PleaseWaitPopup,120);
				if(strGI_HardstopMessage_EventDate_YesOrNo.contains("Yes")) {
					se.element().waitBasedOnCount(PleaseWaitPopup,120);
					se.verify().verifyEquals("Verifying Hard stop Message", se.element().getText(GI_HardstopMessage_EventDate), strGI_HardstopMessage_EventDate, true, test);
				}
				/*if(transaction=="NewQuote"&&strLOB.equalsIgnoreCase("Commercial Package") )
				{
					se.element().waitBasedOnCount(PleaseWaitPopup,40);
					se.element().waitForElement(geninfo_lightbox_account,30);
				}*/
				if (strAgentLink.equals("No") && transaction=="NewQuote") {
					
					se.element().waitForElementToAppear_One(" ",geninfo_lightbox_AC, 10);
					
					if (se.element().isElementPresent(geninfo_lightbox_AC))	{
					
						se.driver().switchTo().activeElement();
						se.util().sleep(5000);
						test.log(LogStatus.INFO, "Account Clearance Lightbox displayed","Account Clearance Lightbox displayed");
						
						boolean flag =se.element().isElementPresent(GI_AgencyInformationSection_label);
						if(se.element().isElementPresent(geninfo_lightbox_account_CreateNew))
						{
							se.element().waitForElementToAppear_One(" ",geninfo_lightbox_account_CreateNew, 10);
							se.element().Click(getgeninfo_lightbox_account_CreateNew(), test);
							test.log(LogStatus.INFO, "Clicked on CreateNew","Clicked on CreateNew");
							
						}
						else if(se.element().isElementPresent(geninfo_lightbox_account_Save) && flag == true)	
						{
							se.element().waitForElementToAppear_One(" ",geninfo_lightbox_account_Save, 10);
							se.element().Click(getgeninfo_lightbox_account_Save(), test);
							test.log(LogStatus.INFO, "Clicked on Save","Clicked on Save");
						}
						else if(se.element().isElementPresent(geninfo_lightbox_close)) {
							se.element().Click(getGenInfoLightboxClose(), test);
							if(getaccountclearence_status("Clearance Approved").getText().contains("Ineligible")){
								se.element().SelectElement(accountclearence_dd_status, "Ineligible / Clearance Approved",test);
								
							}else{
							se.element().SelectElement(accountclearence_dd_status, "Clearance Approved",test);
							}
						}
						
						se.driver().switchTo().activeElement();	
						se.element().waitForElementToAppear_One(" ",common_btn_continueButton, 10);
						se.util().sleep(3000);
						se.element().Click(getBtnContinue(), test);
						se.element().waitForElementToDisappear_One(progressBar,120);
						 if(constants.Env.contains("dev")&&se.element().isElementPresent(GI_AgencyInformationSection_label)){
							
							se.element().waitBasedOnCount(PleaseWaitPopup,60);
							se.element().Click(getGI_CHK_Continue(), test);
							se.util().sleep(2000);
						}
						}
					//					if (se.element().isElementPresent(accountclearence_dd_status)) {
					//						se.log().logSeStep("Account clearence screen is displayed");
					//						se.element().SelectElement(accountclearence_dd_status, "Clearance Approved",test);
					//					}
				}

				else if (strAgentLink.equals("Yes")) {
					
					se.element().waitForElementToAppear_One(" ",geninfo_lightbox_AC, 10);
					se.util().sleep(5000);
					// Added for Some cases in External NILESH        
					if (se.element().isElementPresent(geninfo_lightbox_AC))
					{
						test.log(LogStatus.INFO, "Account Clearance Lightbox displayed","Account Clearance Lightbox displayed");
						boolean flag = se.element().isElementPresent(GI_AgencyInformationSection_label);
						se.util().sleep(5000);
						if(strLOB.equalsIgnoreCase("Umbrella") || strLOB.equalsIgnoreCase("Commercial Auto") || strLOB.equalsIgnoreCase("Workers Comp") || strRegressionID.equals("WCBP_06")){
							if(!strRegressionID.equals("CA_01")) {
								if(!strRegressionID.equals("WC_02")) {
								flag=false;
								}
								}
						}
						// ADDED FOR INSIDE/OUTSIDE ACCOUNT
						if(se.element().isElementPresent(geninfo_lightbox_account_CreateNew))
						{
							se.element().Click(getgeninfo_lightbox_account_CreateNew(), test);
							test.log(LogStatus.INFO, "Clicked on CreateNew","Clicked on CreateNew");
							
						}
						else if(se.element().isElementPresent(geninfo_lightbox_account_Save) && flag==true )    
						{
							se.util().sleep(2000);
							se.element().Click(getGenInfoLightboxAccount(), test);
							se.element().Click(getgeninfo_lightbox_account_Save(), test);
							test.log(LogStatus.INFO, "Clicked on Save","Clicked on Save");
							
						}
						else {
							se.element().Click(getGenInfoLightboxClose(), test);
							if(se.element().isElementPresent(accountclearence_dd_status)){
								se.element().SelectElement(accountclearence_dd_status, "Clearance Approved",test);
							}

						}
						se.util().sleep(3000);
						se.element().Click(getBtnContinue(), test);
					}
					
				}

				/*int count=0;
				Boolean alertPresent=se.element().waitForAlertPresent(5);
				do{
					alertPresent=se.element().waitForAlertPresent(5);
					if(alertPresent)
					{
						se.driver().switchTo().alert().accept();
						se.util().sleep(2000);
						se.element().Click(getGI_CHK_Continue(), test);
						se.util().sleep(5000);
						if(count>=2){
							String alertText = se.driver().switchTo().alert().getText().substring(0, 28);
							se.log().logSeStep("Failed on CP_GenInfo due to alert - " +alertText + ", element not visible");
							se.driver().switchTo().alert().accept();
							se.verify().verifyEquals("Failed on CP_GenInfo due to alert - "+alertText, true, false, true, test);
							break;
						}
						count++;
					}
				}while (alertPresent);
				*/
			}
			catch(Exception e){
				
				se.verify().verifyEquals("Failed to fill in details for CP_GenInfo ", true, false, true, test);
				
			}
			iteration++;
		}
		}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}
	
	public void AppInfo(LinkedHashMap<String, String> row,String transaction,String strLOB,String strGI_AppInfo_TXT_Tax_ID,ExtentTest test){
		String strGI_AppInfo_TXT_ApplicantName = (String) row.get("GI_AppInfo_TXT_ApplicantName");
		String strGI_AppInfo_TXT_DoingBusinessAs = (String) row.get("GI_AppInfo_TXT_DoingBusinessAs");
		String strGI_AppInfo_CHK_ExtendedNamedInsureds = (String) row.get("GI_AppInfo_CHK_ExtendedNamedInsureds");
		String strGI_AppInfo_CHK_Country = (String) row.get("GI_AppInfo_CHK_Country");
		String strGI_AppInfo_TXT_MailingAddressLine1 = (String) row.get("GI_AppInfo_TXT_MailingAddressLine1");
		String strGI_AppInfo_TXT_MailingAddressLine2 = (String) row.get("GI_AppInfo_TXT_MailingAddressLine2");
		String strGI_AppInfo_TXT_City = (String) row.get("GI_AppInfo_TXT_City");
		String strGI_AppInfo_DD_StateorProvince = (String) row.get("GI_AppInfo_DD_StateorProvince");
		String strGI_AppInfo_TXT_ZipCode = (String) row.get("GI_AppInfo_TXT_ZipCode");
		String strGI_AppInfo_Keep_Address_as_Entered = (String) row.get("GI_AppInfo_Keep_Address_as_Entered");
		String strGI_AppInfo_TXT_Phone = (String) row.get("GI_AppInfo_TXT_Phone");
		//String strGI_AppInfo_Years_in_Business = (String) row.get("GI_AppInfo_Years_in_Business");
		String strGI_AppInfo_TXT_Date_Business_Started  = (String) row.get("GI_AppInfo_TXT_Date_Business_Started");
		String strGI_AppInfo_TXT_Business_Experience  = (String) row.get("GI_AppInfo_TXT_Business_Experience");
		String strGI_AppInfo_TXT_Website_Address = (String) row.get("GI_AppInfo_TXT_Website_Address");
		String strGI_AppInfo_TXT_Email_Address = (String) row.get("GI_AppInfo_TXT_E-mail_Address");
		String strGI_AppInfo_DD_Legal_Entity = (String) row.get("GI_AppInfo_DD_Legal_Entity");
		String strGI_AppInfo_CHK_Tax_ID_Type_FEIN = (String) row.get("GI_AppInfo_CHK_Tax_ID_Type_FEIN");
		String strGI_AppInfo_CHK_Tax_ID_Type_SSN = (String) row.get("GI_AppInfo_CHK_Tax_ID_Type_SSN");
		String strGI_AppInfo_CHK_50c3_Nonprofit_Organization = (String) row.get("GI_AppInfo_CHK_501(c)(3)_Nonprofit_Organization");
		String strGI_AppInfo_TXT_StateEmployerNum = (String) row.get("GI_AppInfo_TXT_StateEmployerNum");
		String strGI_AppInfo_AddStrdMessage = (String) row.get("GI_AppInfo_AddStrdMessage");
		String strGI_AppInfo_UpdatedZipCode = (String) row.get("GI_AppInfo_UpdatedZipCode");
		String strAddVal_NewAddressValidation = (String) row.get("AddVal_NewAddressValidation");
		String strGI_Radio_SEMultipleLocs = (String) row.get("GI_Radio_SEMultipleLocs");
		String strGI_Radio_SEMultipleStates = (String) row.get("GI_Radio_SEMultipleStates");
		String strGI_DD_EventState = (String) row.get("GI_DD_EventState");
		
		AddressValidation AddressValidation=TestPageFactory.initElements(se, AddressValidation.class);	
		try{
			se.util().sleep(3000);
			test.log(LogStatus.INFO, "CP_AppInfo section","Transaction Step : "+transaction + "<br>" +"Page : CP_GenInfo");
			se.verify().verifyEquals("CP_AppInfo Details  of AgencyPortal ", getGI_GeneralInfoHelpMessageSection_label().isDisplayed(),true, true,test);
			
			se.element().waitForElementToAppear_One(strGI_AppInfo_TXT_ApplicantName,GI_AppInfo_TXT_ApplicantName, 5);
			//se.element().enterOrValidateText(getGI_AppInfo_TXT_ExpirationDate(strGI_AppInfo_TXT_ExpirationDate),strGI_AppInfo_TXT_ExpirationDate,test);
			/*if(constants.Env.contains("dev")) {
				strGI_AppInfo_TXT_ApplicantName = "MULE4"+strGI_AppInfo_TXT_ApplicantName;
			}*/
			if(!(constants.Env.contains("qa"))||!(constants.Env.contains("dev"))) {
			
				Format f = new SimpleDateFormat("HH.mm");
				String strDate = f.format(new Date());
				//System.out.println(strDate);
				String OldstrAccount_TXT_ApplicantName = strDate+ strGI_AppInfo_TXT_ApplicantName;
				
			//se.element().enterOrValidateText(getGI_AppInfo_TXT_ApplicantName(OldstrAccount_TXT_ApplicantName),OldstrAccount_TXT_ApplicantName,test);
			Format f1 = new SimpleDateFormat("mm.ss");
			String strDate1 = f1.format(new Date());
			//System.out.println(strDate);
			String OldstrAccount_TXT_ApplicantName1 = strDate1+ strGI_AppInfo_TXT_ApplicantName;
			se.element().enterOrValidateText(getGI_AppInfo_TXT_DoingBusinessAs(OldstrAccount_TXT_ApplicantName1),OldstrAccount_TXT_ApplicantName1,test);
			
				
				
			
			}
			se.element().checkUncheckOrValidate(getGI_AppInfo_CHK_ExtendedNamedInsureds(strGI_AppInfo_CHK_ExtendedNamedInsureds),strGI_AppInfo_CHK_ExtendedNamedInsureds,test);
			se.element().enterOrValidateText(getGI_AppInfo_CHK_Country(strGI_AppInfo_CHK_Country),strGI_AppInfo_CHK_Country,test);
			se.element().waitForElementToAppear_One(strGI_AppInfo_TXT_MailingAddressLine1,GI_AppInfo_TXT_MailingAddressLine1, 5);
			//stpflag	if(!(constants.Env.contains("qa"))||!(constants.Env.contains("dev"))) {
			if(!strAddVal_NewAddressValidation.contains("New"))
			{
				se.element().enterOrValidateText(getGI_AppInfo_TXT_MailingAddressLine1(strGI_AppInfo_TXT_MailingAddressLine1),strGI_AppInfo_TXT_MailingAddressLine1,test);
			se.element().waitBasedOnCount(PleaseWaitPopup,40);
			if(strGI_AppInfo_Keep_Address_as_Entered.contains("Check")){
				se.element().checkUncheckOrValidate(getGI_AppInfo_Keep_Address_as_Entered(strGI_AppInfo_Keep_Address_as_Entered),strGI_AppInfo_Keep_Address_as_Entered,test);
				
			}
			se.element().enterOrValidateText(getGI_AppInfo_TXT_MailingAddressLine2(strGI_AppInfo_TXT_MailingAddressLine2),strGI_AppInfo_TXT_MailingAddressLine2,test);
			se.element().enterOrValidateText(getGI_AppInfo_TXT_City(strGI_AppInfo_TXT_City),strGI_AppInfo_TXT_City,test);
			se.element().SelectElement(GI_AppInfo_DD_StateorProvince,strGI_AppInfo_DD_StateorProvince,test);
			if(!strGI_AppInfo_TXT_ZipCode.contains("N/A"))
			{
				se.element().enterOrValidateText(getGI_AppInfo_TXT_ZipCode(strGI_AppInfo_TXT_ZipCode),strGI_AppInfo_TXT_ZipCode,test);
				//se.element().waitBasedOnCount(PleaseWaitPopup,40);				
				if(transaction.contains("NewQuote"))
				{
					se.element().waitForElement(geninfo_lightbox_AC,5);
					se.element().waitBasedOnCount(PleaseWaitPopup,40);
					
				}
				//se.util().sleep(3000);
			}
			//se.util().sleep(5000);
			if(strGI_AppInfo_Keep_Address_as_Entered.contains("Yes"))
			{
				se.element().waitForElement(geninfo_lightbox_AC,120);
				if (se.element().isElementPresent(geninfo_lightbox_AC))	{
					//se.element().waitBasedOnCount(PleaseWaitPopup,40);
					se.element().waitForElementLoading(getgeninfo_lightbox_AC());
					se.driver().switchTo().activeElement();
					//se.element().Click(getGenInfoLightboxClose());
					//se.util().sleep(3000);
					se.element().Click(getGenInfoLightboxAccount(), test);// ADDED FOR INSIDE/OUTSIDE ACCOUNT
					//se.util().sleep(5000);
					se.element().Click(getgeninfo_lightbox_account_KeepAddressAsEntered(), test);
					se.element().waitBasedOnCount(PleaseWaitPopup,40);
				}
			}
			
				se.element().waitForElementToAppear_One(strGI_AppInfo_AddStrdMessage,GI_AppInfo_AddStrdMessage, 5);
				se.element().enterOrValidateText(getGI_AppInfo_AddStrdMessage(strGI_AppInfo_AddStrdMessage),strGI_AppInfo_AddStrdMessage,test);
				se.element().enterOrValidateText(getGI_AppInfo_TXT_ZipCode(strGI_AppInfo_UpdatedZipCode),strGI_AppInfo_UpdatedZipCode,test);
				//stpflag		}else if(!(constants.Env.contains("qa"))||!(constants.Env.contains("dev"))) {
			AddressValidation.AddressStandardization(row, test);
		}
			//stpflag	}
			if(!strGI_AppInfo_TXT_Phone.equalsIgnoreCase("N/A"))
			{
				se.element().clearTheField(getGI_AppInfo_TXT_Phone(strGI_AppInfo_TXT_Phone));
				se.element().enterOrValidateText(getGI_AppInfo_TXT_Phone(strGI_AppInfo_TXT_Phone),strGI_AppInfo_TXT_Phone,test);
			}
			if(!(strGI_AppInfo_TXT_Date_Business_Started.contains("N/A")) && transaction.equalsIgnoreCase("NewQuote"))
			{
				se.element().waitForElement(GI_AppInfo_TXT_Date_Business_Started);
				se.element().clearTheField1(GI_AppInfo_TXT_Date_Business_Started);
				se.element().enterOrValidateTextDate(getGI_AppInfo_TXT_Date_Business_Started (strGI_AppInfo_TXT_Date_Business_Started ),strGI_AppInfo_TXT_Date_Business_Started ,test);
			}
			//se.element().enterOrValidateText(getGI_AppInfo_Years_in_Business(strGI_AppInfo_Years_in_Business),strGI_AppInfo_Years_in_Business,test);
			se.element().enterOrValidateText(getGI_AppInfo_TXT_Business_Experience (strGI_AppInfo_TXT_Business_Experience ),strGI_AppInfo_TXT_Business_Experience ,test);
			se.element().enterOrValidateText(getGI_AppInfo_TXT_Website_Address(strGI_AppInfo_TXT_Website_Address),strGI_AppInfo_TXT_Website_Address,test);
			se.element().enterOrValidateText(getGI_AppInfo_TXT_Email_Address(strGI_AppInfo_TXT_Email_Address),strGI_AppInfo_TXT_Email_Address,test);
			//stpflag	if(!(constants.Env.contains("qa"))||!(constants.Env.contains("dev"))) {
			se.element().SelectElement(GI_AppInfo_DD_Legal_Entity,strGI_AppInfo_DD_Legal_Entity,test);
			//stpflag	}
			 
				 se.element().checkUncheckOrValidate(getGI_AppInfo_CHK_Tax_ID_Type_FEIN(strGI_AppInfo_CHK_Tax_ID_Type_FEIN),strGI_AppInfo_CHK_Tax_ID_Type_FEIN,test);
					se.element().checkUncheckOrValidate(getGI_AppInfo_CHK_Tax_ID_Type_SSN(strGI_AppInfo_CHK_Tax_ID_Type_SSN),strGI_AppInfo_CHK_Tax_ID_Type_SSN,test);
					se.element().waitForElementToDisappear_One(progressBar,120);
					
					
					Format f2 = new SimpleDateFormat("HHmmssmms");
					String strDate2 = f2.format(new Date());
					se.element().enterOrValidateText(getGI_AppInfo_TXT_Tax_ID(strDate2),strDate2,test);
					//se.element().enterOrValidateText(getGI_AppInfo_TXT_Tax_ID(strGI_AppInfo_TXT_Tax_ID),strGI_AppInfo_TXT_Tax_ID,test);
					
			 
			 se.element().enterOrValidateText(getGI_AppInfo_TXT_StateEmployerNum(strGI_AppInfo_TXT_StateEmployerNum),strGI_AppInfo_TXT_StateEmployerNum,test);
			se.element().checkUncheckOrValidate(getGI_AppInfo_CHK_50c3_Nonprofit_Organization(strGI_AppInfo_CHK_50c3_Nonprofit_Organization),strGI_AppInfo_CHK_50c3_Nonprofit_Organization,test);
			
			
			
			
			//==========SE New changes==================//
			if(!strGI_Radio_SEMultipleLocs.equals("N/A")) {

				se.element().chkElement(getGI_Radio_SEMultipleLocs(strGI_Radio_SEMultipleLocs), strGI_Radio_SEMultipleLocs,test);

				}

				if(!strGI_Radio_SEMultipleStates.equals("N/A")) {
				se.element().chkElement(getGI_Radio_SEMultipleStates(strGI_Radio_SEMultipleStates), strGI_Radio_SEMultipleStates,test);

				}
				se.element().SelectElement(GI_DD_EventState,strGI_DD_EventState,test);
				//==============================================//
			
			
		}catch(Exception e){
			e.getMessage();
			e.printStackTrace();
		}
	}
	public void NatureOfBusiness(LinkedHashMap<String, String> row,String transaction,String strAgentLink,String strGI_AppInfo_TXT_Tax_ID,ExtentTest test){
		String strGI_NatOfBusi_TXT_Primary_Business_Description = (String) row.get("GI_NatOfBusi_TXT_Primary_Business_Description");
		String strGI_NatOfBusi_TXT_EventDes = (String) row.get("GI_NatOfBusi_TXT_EventDes");
		String strGI_NatOfBusi_DD_Market_Segment = (String) row.get("GI_NatOfBusi_DD_Market_Segment");
		String strGI_NatOfBusi_DD_SIC_Code = (String) row.get("GI_NatOfBusi_DD_SIC_Code");
		String strGI_NatOfBusi_DD_NAICS_Code = (String) row.get("GI_NatOfBusi_DD_NAICS_Code");
		String strGI_NatOfBusi_Event_Name = (String) row.get("GI_NatOfBusi_Event_Name");
		String strGI_NatOfBusi_Totalnumberofplayersattheevent = (String) row.get("GI_NatOfBusi_Totalnumberofplayersattheevent");
		
		String strGI_CHK_CPCLGLOnly_Yes = (String) row.get("GI_CHK_CPCLGLOnly_Yes");
		String strGI_CHK_CPCLGLOnly_No = (String) row.get("GI_CHK_CPCLGLOnly_No");
		String strGI_EQ_TreeTrimmingOrTreeRemoval_Yes = (String) row.get("GI_EQ_TreeTrimmingOrTreeRemoval_Yes");
		String strGI_EQ_TreeTrimmingOrTreeRemoval_No = (String) row.get("GI_EQ_TreeTrimmingOrTreeRemoval_No");
		
		String strGI_NatOfBusi_DunkTank_Yes = (String) row.get("GI_NatOfBusi_DunkTank_Yes");
		String strGI_NatOfBusi_DunkTank_No = (String) row.get("GI_NatOfBusi_DunkTank_No");
		String strGI_NatOfBusi_GolfCartATVusedbyPersonnel_Yes = (String) row.get("GI_NatOfBusi_GolfCartATVusedbyPersonnel_Yes");
		String strGI_NatOfBusi_GolfCartATVusedbyPersonnel_No = (String) row.get("GI_NatOfBusi_GolfCartATVusedbyPersonnel_No");
		String strGI_NatOfBusi_PettingZoo_Yes = (String) row.get("GI_NatOfBusi_PettingZoo_Yes");
		String strGI_NatOfBusi_PettingZoo_No = (String) row.get("GI_NatOfBusi_PettingZoo_No");
		String strGI_NatOfBusi_Parade_Yes = (String) row.get("GI_NatOfBusi_Parade_Yes");
		String strGI_NatOfBusi_Parade_No = (String) row.get("GI_NatOfBusi_Parade_No");
		String strGI_NatOfBusi_Number_of_Units = (String) row.get("GI_NatOfBusi_Number_of_Units");
		//String strGI_NatOfBusi_Additional_Description_of_Operations = (String) row.get("GI_NatOfBusi_Additional_Description_of_Operations");
		String strGI_NatOfBusi_TXT_TotalNumberofEmployees = (String) row.get("GI_NatOfBusi_TXT_TotalNumberofEmployees");
		String strGI_NatOfBusi_TXT_TotalPayrollAllLocations = (String) row.get("GI_NatOfBusi_TXT_TotalPayroll(AllLocations)");
		String strGI_NatOfBusi_TXT_TotalSalesAllLocations = (String) row.get("GI_NatOfBusi_TXT_TotalSales(AllLocations)");
		String strGI_NatOfBusi_TXT_NumberOfLots = (String) row.get("GI_NatOfBusi_TXT_NumberOfLots");
		String strGI_NatOfBusi_BTN_Doesyourtotalpropertyvalueexceed10000000_No = (String) row.get("GI_NatOfBusi_BTN_Doesyourtotalpropertyvalueexceed10000000_No");
		String strGI_NatOfBusi_BTN_Doesyourtotalpropertyvalueexceed10000000_Yes = (String) row.get("GI_NatOfBusi_BTN_Doesyourtotalpropertyvalueexceed10000000_Yes");
		String strGI_NatOfBusi_BTN_Isthetotalsquarefootageforanyonelocationgreaterthan40000squarefeet_No = (String) row.get("GI_NatOfBusi_BTN_Isthetotalsquarefootageforanyonelocationgreaterthan40000squarefeet_No");
		String strGI_NatOfBusi_BTN_Isthetotalsquarefootageforanyonelocationgreaterthan40000squarefeet_Yes = (String) row.get("GI_NatOfBusi_BTN_Isthetotalsquarefootageforanyonelocationgreaterthan40000squarefeet_Yes");
		String strGI_NatOfBusi_DD_Controlling_State = (String) row.get("GI_NatOfBusi_DD_Controlling_State");
		String strGI_NatOfBusi_TXT_Program_Association = (String) row.get("GI_NatOfBusi_TXT_Program_Association");
		//String strGI_NatOfBusi_State_Landscape_Association_Name = (String) row.get("GI_NatOfBusi_State_Landscape_Association_Name");
		String strGI_NatOfBusi_DD_Company = (String) row.get("GI_NatOfBusi_DD_Company");
		String strGI_NatOfBusi_TXT_Product_at_Clearance = (String) row.get("GI_NatOfBusi_TXT_Product_(at Clearance)");
		String strGI_NatOfBusi_TXT_Product_Current = (String) row.get("GI_NatOfBusi_TXT_Product_(Current)");
		
		String strGI_NatOfBusi_CHK_SalesFromPetDaycare_Yes = (String) row.get("GI_NatOfBusi_CHK_SalesFromPetDaycare_Yes");
		String strGI_NatOfBusi_CHK_SalesFromPetDaycare_No = (String) row.get("GI_NatOfBusi_CHK_SalesFromPetDaycare_No");
		String strGI_NatOfBusi_CHK_SalesFromPetTraining_Yes = (String) row.get("GI_NatOfBusi_CHK_SalesFromPetTraining_Yes");
		String strGI_NatOfBusi_CHK_SalesFromPetTraining_No = (String) row.get("GI_NatOfBusi_CHK_SalesFromPetTraining_No");
		String strGI_NatOfBusi_CHK_SalesFromPetGrooming_Yes = (String) row.get("GI_NatOfBusi_CHK_SalesFromPetGrooming_Yes");
		String strGI_NatOfBusi_CHK_SalesFromPetGrooming_No = (String) row.get("GI_NatOfBusi_CHK_SalesFromPetGrooming_No");
		String strGI_NatOfBusi_CHK_SalesFromPetBoarding_Yes = (String) row.get("GI_NatOfBusi_CHK_SalesFromPetBoarding_Yes");
		String strGI_NatOfBusi_CHK_SalesFromPetBoarding_No = (String) row.get("GI_NatOfBusi_CHK_SalesFromPetBoarding_No");
		
		String strGI_NatOfBusi_Istreetrimmingmorethan25percentoftotalreceipts_Yes = (String) row.get("GI_NatOfBusi_Istreetrimmingmorethan25percentoftotalreceipts_Yes");
		String strGI_NatOfBusi_Istreetrimmingmorethan25percentoftotalreceipts_No = (String) row.get("GI_NatOfBusi_Istreetrimmingmorethan25percentoftotalreceipts_No");
		String strGI_NatOfBusi_TXT_NumberAttendees = (String) row.get("GI_NatOfBusi_TXT_NumberAttendees");
		String strGI_NatOfBusi_TXT_NumberAttendeesperDay = (String) row.get("GI_NatOfBusi_TXT_NumberAttendeesperDay");
		
		String strGI_NatOfBusi_CHK_TreeTrimmingLessThan25Perc_Yes = (String) row.get("GI_NatOfBusi_CHK_TreeTrimmingLessThan25Perc_Yes");
		String strGI_NatOfBusi_CHK_TreeTrimmingLessThan25Perc_No = (String) row.get("GI_NatOfBusi_CHK_TreeTrimmingLessThan25Perc_No");
		try{
			if(transaction.contains("NewQuote") && !strGI_NatOfBusi_TXT_Primary_Business_Description.contains("N/A")) {
				se.element().Click(getGI_NatOfBusi_Clk_Primary_Business_Description(), test);
				se.element().enterOrValidateText(getGI_NatOfBusi_TXT_Primary_Business_Description(strGI_NatOfBusi_TXT_Primary_Business_Description),strGI_NatOfBusi_TXT_Primary_Business_Description,test);
				se.element().waitForElementToDisappear_One(progressBar, 60);
				se.element().waitBasedOnCount(PleaseWaitPopup,40);
				se.element().enterOrValidateText(getGI_NatOfBusi_TXT_EventDes(strGI_NatOfBusi_TXT_EventDes), strGI_NatOfBusi_TXT_EventDes, test);
			}
			
			if(strAgentLink.contains("Yes"))
			{
				se.element().waitForElementToAppear_One(strGI_NatOfBusi_DD_Market_Segment,GI_NatOfBusi_TXT_Market_Segment,60);
				se.element().enterOrValidateText(getGI_NatOfBusi_TXT_Market_Segment(strGI_AppInfo_TXT_Tax_ID),strGI_NatOfBusi_DD_Market_Segment,test);
				se.element().enterOrValidateText(getGI_NatOfBusi_TXT_SIC_Code(strGI_NatOfBusi_DD_SIC_Code),strGI_NatOfBusi_DD_SIC_Code,test);
				se.element().enterOrValidateText(getGI_NatOfBusi_TXT_NAICS_Code(strGI_NatOfBusi_DD_NAICS_Code),strGI_NatOfBusi_DD_NAICS_Code,test);

			}
			else
			{
				se.element().waitForElementToAppear_One(strGI_NatOfBusi_DD_Market_Segment,GI_NatOfBusi_DD_Market_Segment,60);
				se.element().SelectElement(GI_NatOfBusi_DD_Market_Segment,strGI_NatOfBusi_DD_Market_Segment,test);
				se.element().SelectElement(GI_NatOfBusi_DD_SIC_Code,strGI_NatOfBusi_DD_SIC_Code,test);
				se.element().SelectElement(GI_NatOfBusi_DD_NAICS_Code,strGI_NatOfBusi_DD_NAICS_Code,test);
			}
			se.element().waitForElementToDisappear_One(progressBar,120);
			se.element().waitBasedOnCount(PleaseWaitPopup,40);
			se.element().enterOrValidateText(getGI_NatOfBusi_TXT_NumberAttendees(strGI_NatOfBusi_TXT_NumberAttendees),strGI_NatOfBusi_TXT_NumberAttendees,test);
			se.element().waitForElementToDisappear_One(progressBar,120);
			se.element().waitBasedOnCount(PleaseWaitPopup,40);
			se.element().enterOrValidateText(getGI_NatOfBusi_TXT_NumberAttendeesperDay(strGI_NatOfBusi_TXT_NumberAttendeesperDay),strGI_NatOfBusi_TXT_NumberAttendeesperDay,test);
			
			se.element().enterOrValidateText(getGI_NatOfBusi_Event_Name(strGI_NatOfBusi_Event_Name),strGI_NatOfBusi_Event_Name,test);
			//	se.element().enterOrValidateText(getGI_NatOfBusi_Controlling_State(strGI_NatOfBusi_Controlling_State),strGI_NatOfBusi_Controlling_State,test);
			
			se.element().enterOrValidateText(getGI_NatOfBusi_Totalnumberofplayersattheevent(strGI_NatOfBusi_Totalnumberofplayersattheevent),strGI_NatOfBusi_Totalnumberofplayersattheevent,test);
			//Commented this code as this fields are hidden as per new requirement
			/*se.element().enterOrValidateText(getGI_NatOfBusi_Number_of_Event_Setup_days(strGI_NatOfBusi_NumberofEventSetupdays),strGI_NatOfBusi_NumberofEventSetupdays,test);
			se.element().enterOrValidateText(getGI_NatOfBusi_NumberofEventteardowndays(strGI_NatOfBusi_NumberofEventteardowndays),strGI_NatOfBusi_NumberofEventteardowndays,test);*/
			se.element().checkUncheckOrValidate(getGI_NatOfBusi_DunkTank_Yes(strGI_NatOfBusi_DunkTank_Yes),strGI_NatOfBusi_DunkTank_Yes,test);
			se.element().checkUncheckOrValidate(getGI_NatOfBusi_DunkTank_No(strGI_NatOfBusi_DunkTank_No),strGI_NatOfBusi_DunkTank_No,test);
			se.element().checkUncheckOrValidate(getGI_NatOfBusi_GolfCartATVusedbyPersonnel_Yes(strGI_NatOfBusi_GolfCartATVusedbyPersonnel_Yes),strGI_NatOfBusi_GolfCartATVusedbyPersonnel_Yes,test);
			se.element().checkUncheckOrValidate(getGI_NatOfBusi_GolfCartATVusedbyPersonnel_No(strGI_NatOfBusi_GolfCartATVusedbyPersonnel_No),strGI_NatOfBusi_GolfCartATVusedbyPersonnel_No,test);
			se.element().checkUncheckOrValidate(getGI_NatOfBusi_PettingZoo_Yes(strGI_NatOfBusi_PettingZoo_Yes),strGI_NatOfBusi_PettingZoo_Yes,test);
			se.element().checkUncheckOrValidate(getGI_NatOfBusi_PettingZoo_No(strGI_NatOfBusi_PettingZoo_No),strGI_NatOfBusi_PettingZoo_No,test);
			se.element().checkUncheckOrValidate(getGI_NatOfBusi_Parade_Yes(strGI_NatOfBusi_Parade_Yes),strGI_NatOfBusi_Parade_Yes,test);
			se.element().checkUncheckOrValidate(getGI_NatOfBusi_Parade_No(strGI_NatOfBusi_Parade_No),strGI_NatOfBusi_Parade_No,test);
			se.element().enterOrValidateText(getGI_NatOfBusi_Number_of_Units(strGI_NatOfBusi_Number_of_Units),strGI_NatOfBusi_Number_of_Units,test);
			se.element().enterOrValidateText(getGI_NatOfBusi_TXT_NumberOfLots(strGI_NatOfBusi_TXT_NumberOfLots),strGI_NatOfBusi_TXT_NumberOfLots,test);
			if(!strGI_NatOfBusi_TXT_NumberOfLots.contains("N/A"))
			{
				se.element().waitForElementToDisappear_One(progressBar,120);
				se.element().waitBasedOnCount(PleaseWaitPopup,40);
				se.util().sleep(15000);
				se.element().enterOrValidateText(getGI_NatOfBusi_TXT_TotalSalesAllLocations(strGI_NatOfBusi_TXT_TotalSalesAllLocations),strGI_NatOfBusi_TXT_TotalSalesAllLocations,test);
			}
			
			/*se.element().selectElementDDrOrValidateText(getGI_NatOfBusi_Is_tree_trimming_more_than_25_of_total_receipts_(strGI_NatOfBusi_Is_tree_trimming_more_than_25_of_total_receipts),strGI_NatOfBusi_Is_tree_trimming_more_than_25_of_total_receipts,test);
			se.element().enterOrValidateText(getGI_NatOfBusi_Additional_Description_of_Operations(strGI_NatOfBusi_Additional_Description_of_Operations),strGI_NatOfBusi_Additional_Description_of_Operations,test);*/
			if(!strGI_NatOfBusi_TXT_TotalNumberofEmployees.contains("N/A"))
			{
				se.util().sleep(5000);
				se.element().waitForElementToDisappear_One(progressBar,120);
				se.element().waitForElementToAppear_One(strGI_NatOfBusi_TXT_TotalNumberofEmployees,GI_NatOfBusi_TXT_TotalNumberofEmployees,60);
				se.element().enterOrValidateText(getGI_NatOfBusi_TXT_TotalNumberofEmployees(strGI_NatOfBusi_TXT_TotalNumberofEmployees),strGI_NatOfBusi_TXT_TotalNumberofEmployees,test);
				se.element().waitForElementToDisappear_One(progressBar,120);
				//se.element().waitBasedOnCount(PleaseWaitPopup,40);
				//se.util().sleep(5000);
				se.element().enterOrValidateText(getGI_NatOfBusi_TXT_TotalPayrollAllLocations(strGI_NatOfBusi_TXT_TotalPayrollAllLocations),strGI_NatOfBusi_TXT_TotalPayrollAllLocations,test);
				//se.util().sleep(5000);
				se.element().waitForElementToDisappear_One(progressBar,120);
				se.element().waitForElementToAppear_One(strGI_NatOfBusi_TXT_TotalSalesAllLocations,GI_NatOfBusi_TXT_Total_Sales_All_Locations1,60);
				se.util().sleep(15000);
				se.element().enterOrValidateText(getGI_NatOfBusi_TXT_TotalSalesAllLocations(strGI_NatOfBusi_TXT_TotalSalesAllLocations),strGI_NatOfBusi_TXT_TotalSalesAllLocations,test);
				se.util().sleep(15000);
				se.element().waitForElementToDisappear_One(progressBar,120);
				se.element().checkUncheckOrValidate(getGI_NatOfBusi_BTN_Doesyourtotalpropertyvalueexceed10000000_No(strGI_NatOfBusi_BTN_Doesyourtotalpropertyvalueexceed10000000_No), strGI_NatOfBusi_BTN_Doesyourtotalpropertyvalueexceed10000000_No, test);
				se.element().checkUncheckOrValidate(getGI_NatOfBusi_BTN_Doesyourtotalpropertyvalueexceed10000000_Yes(strGI_NatOfBusi_BTN_Doesyourtotalpropertyvalueexceed10000000_Yes), strGI_NatOfBusi_BTN_Doesyourtotalpropertyvalueexceed10000000_Yes, test);
				se.element().waitForElementToDisappear_One(progressBar,120);
				se.util().sleep(10000);
				se.element().checkUncheckOrValidate(getGI_NatOfBusi_BTN_Isthetotalsquarefootageforanyonelocationgreaterthan40000squarefeet_No(strGI_NatOfBusi_BTN_Isthetotalsquarefootageforanyonelocationgreaterthan40000squarefeet_No), strGI_NatOfBusi_BTN_Isthetotalsquarefootageforanyonelocationgreaterthan40000squarefeet_No, test);
				se.element().checkUncheckOrValidate(getGI_NatOfBusi_BTN_Isthetotalsquarefootageforanyonelocationgreaterthan40000squarefeet_Yes(strGI_NatOfBusi_BTN_Isthetotalsquarefootageforanyonelocationgreaterthan40000squarefeet_Yes), strGI_NatOfBusi_BTN_Isthetotalsquarefootageforanyonelocationgreaterthan40000squarefeet_Yes, test);
				se.element().checkUncheckOrValidate(getGI_CHK_CPCLGLOnly_Yes(strGI_CHK_CPCLGLOnly_Yes), strGI_CHK_CPCLGLOnly_Yes, test);
				se.element().checkUncheckOrValidate(getGI_CHK_CPCLGLOnly_No(strGI_CHK_CPCLGLOnly_No), strGI_CHK_CPCLGLOnly_No, test);
				
			
			}
			if(transaction.equalsIgnoreCase("NewQuote"))
			{
				se.element().waitBasedOnCount(PleaseWaitPopup,40);
			}
			se.element().SelectElement(GI_NatOfBusi_DD_Controlling_State,strGI_NatOfBusi_DD_Controlling_State,test);
			if(strAgentLink.contains("Yes"))
			{
				se.element().enterOrValidateText(getGI_NatOfBusi_TXT_Company(strGI_NatOfBusi_DD_Company),strGI_NatOfBusi_DD_Company,test);
			}
			else
			{
				se.element().SelectElement(GI_NatOfBusi_DD_Company,strGI_NatOfBusi_DD_Company,test);

			}
			se.element().enterOrValidateText(getGI_NatOfBusi_TXT_Program_Association(strGI_NatOfBusi_TXT_Program_Association),strGI_NatOfBusi_TXT_Program_Association,test);
			se.util().sleep(5000);
			se.element().enterOrValidateText(getGI_NatOfBusi_Label_Product_at_Clearance(strGI_NatOfBusi_TXT_Product_at_Clearance),strGI_NatOfBusi_TXT_Product_at_Clearance,test);
			se.element().enterOrValidateText(getGI_NatOfBusi_Label_Product_Current(strGI_NatOfBusi_TXT_Product_Current),strGI_NatOfBusi_TXT_Product_Current,test);
			
			se.element().checkUncheckOrValidate(getGI_NatOfBusi_CHK_SalesFromPetDaycare_Yes(strGI_NatOfBusi_CHK_SalesFromPetDaycare_Yes), strGI_NatOfBusi_CHK_SalesFromPetDaycare_Yes, test);
			se.element().checkUncheckOrValidate(getGI_NatOfBusi_CHK_SalesFromPetDaycare_No(strGI_NatOfBusi_CHK_SalesFromPetDaycare_No), strGI_NatOfBusi_CHK_SalesFromPetDaycare_No, test);
			se.element().checkUncheckOrValidate(getGI_NatOfBusi_CHK_SalesFromPetTraining_Yes(strGI_NatOfBusi_CHK_SalesFromPetTraining_Yes), strGI_NatOfBusi_CHK_SalesFromPetTraining_Yes, test);
			se.element().checkUncheckOrValidate(getGI_NatOfBusi_CHK_SalesFromPetTraining_No(strGI_NatOfBusi_CHK_SalesFromPetTraining_No), strGI_NatOfBusi_CHK_SalesFromPetTraining_No, test);
			se.element().checkUncheckOrValidate(getGI_NatOfBusi_CHK_SalesFromPetGrooming_Yes(strGI_NatOfBusi_CHK_SalesFromPetGrooming_Yes), strGI_NatOfBusi_CHK_SalesFromPetGrooming_Yes, test);
			se.element().checkUncheckOrValidate(getGI_NatOfBusi_CHK_SalesFromPetGrooming_No(strGI_NatOfBusi_CHK_SalesFromPetGrooming_No), strGI_NatOfBusi_CHK_SalesFromPetGrooming_No, test);
			se.element().checkUncheckOrValidate(getGI_NatOfBusi_CHK_SalesFromPetBoarding_Yes(strGI_NatOfBusi_CHK_SalesFromPetBoarding_Yes), strGI_NatOfBusi_CHK_SalesFromPetBoarding_Yes, test);
			se.element().checkUncheckOrValidate(getGI_NatOfBusi_CHK_SalesFromPetBoarding_No(strGI_NatOfBusi_CHK_SalesFromPetBoarding_No), strGI_NatOfBusi_CHK_SalesFromPetBoarding_No, test);
						
			se.element().checkUncheckOrValidate(getGI_NatOfBusi_Istreetrimmingmorethan25percentoftotalreceipts_Yes(strGI_NatOfBusi_Istreetrimmingmorethan25percentoftotalreceipts_Yes), strGI_NatOfBusi_Istreetrimmingmorethan25percentoftotalreceipts_Yes, test);
			se.element().checkUncheckOrValidate(getGI_NatOfBusi_Istreetrimmingmorethan25percentoftotalreceipts_No(strGI_NatOfBusi_Istreetrimmingmorethan25percentoftotalreceipts_No), strGI_NatOfBusi_Istreetrimmingmorethan25percentoftotalreceipts_No, test);
			
			
			
			se.element().checkUncheckOrValidate(getGI_NatOfBusi_CHK_TreeTrimmingLessThan25Perc_Yes(strGI_NatOfBusi_CHK_TreeTrimmingLessThan25Perc_Yes), strGI_NatOfBusi_CHK_TreeTrimmingLessThan25Perc_Yes, test);
			se.element().checkUncheckOrValidate(getGI_NatOfBusi_CHK_TreeTrimmingLessThan25Perc_No(strGI_NatOfBusi_CHK_TreeTrimmingLessThan25Perc_No), strGI_NatOfBusi_CHK_TreeTrimmingLessThan25Perc_No, test);
			
			se.element().checkUncheckOrValidate(getGI_EQ_TreeTrimmingOrTreeRemoval_Yes(strGI_EQ_TreeTrimmingOrTreeRemoval_Yes), strGI_EQ_TreeTrimmingOrTreeRemoval_Yes, test);
			se.element().checkUncheckOrValidate(getGI_EQ_TreeTrimmingOrTreeRemoval_No(strGI_EQ_TreeTrimmingOrTreeRemoval_No), strGI_EQ_TreeTrimmingOrTreeRemoval_No, test);
			
			
			
		}catch(Exception e){
			e.getMessage();
			e.printStackTrace();
		}
	}
	public void EligibiltyQuestions(LinkedHashMap<String, String> row,ExtentTest test){

		String strGI_EQ_DD_Any_claims_in_the_past_3_years = (String) row.get("GI_EQ_DD_Any_claims_in_the_past_ 3_years?");
		String strGI_EQ_CHK_DoesAppHave3OrMoreEmp_YES= (String) row.get("GI_EQ_CHK_DoesAppHave3OrMoreEmp_YES");
		String strGI_EQ_CHK_DoesAppHave3OrMoreEmp_No = (String) row.get("GI_EQ_CHK_DoesAppHave3OrMoreEmp_No");
		String strGI_EQ_CHK_AnyWorkPerformBargesVessels_Yes = (String) row.get("GI_EQ_CHK_AnyWorkPerformBargesVessels_Yes");
		String strGI_EQ_CHK_AnyWorkPerformBargesVessels_No = (String) row.get("GI_EQ_CHK_AnyWorkPerformBargesVessels_No");
		String strGI_EQ_CHK_Dohavepastpresentordiscontinued_No = (String) row.get("GI_EQ_CHK_Dohavepastpresentordiscontinued_No");
		String strGI_EQ_CHK_Dohavepastpresentordiscontinued_Yes = (String) row.get("GI_EQ_CHK_Dohavepastpresentordiscontinued_Yes");
		String strGI_EQ_Willtheinsuredeverbeinvolvedwithenvironmentalorpollutionabatementoperations_No = (String) row.get("GI_EQ_Willtheinsuredeverbeinvolvedwithenvironmentalorpollutionabatementoperations_No");
		String strGI_EQ_Willtheinsuredeverbeinvolvedwithenvironmentalorpollutionabatementoperations_Yes = (String) row.get("GI_EQ_Willtheinsuredeverbeinvolvedwithenvironmentalorpollutionabatementoperations_Yes");
		String strGI_EQ_BTN_Isapplicantinvolvedinleadasbestosandradonmitigationortesting_Yes = (String) row.get("GI_EQ_BTN_Isapplicantinvolvedinleadasbestosandradonmitigationortesting_Yes");
		String strGI_EQ_BTN_Isapplicantinvolvedinleadasbestosandradonmitigationortesting_No = (String) row.get("GI_EQ_BTN_Isapplicantinvolvedinleadasbestosandradonmitigationortesting_No");
		String strGI_EQ_CHK_Isapplicantinvolvedinanybridgecaissoncofferdamdamdikedrydockjettyleveeorpierconstruction_Yes = (String) row.get("GI_EQ_CHK_Isapplicantinvolvedinanybridgecaissoncofferdamdamdikedrydockjettyleveeorpierconstruction_Yes");
		String strGI_EQ_CHK_Isapplicantinvolvedinanybridgecaissoncofferdamdamdikedrydockjettyleveeorpierconstruction_No = (String) row.get("GI_EQ_CHK_Isapplicantinvolvedinanybridgecaissoncofferdamdamdikedrydockjettyleveeorpierconstruction_No");
		String strGI_EQ_Doesapplicantperformanyalarmorfiresprinklersystemdesignrepair_Yes = (String) row.get("GI_EQ_Doesapplicantperformanyalarmorfiresprinklersystemdesignrepair_Yes");
		String strGI_EQ_Doesapplicantperformanyalarmorfiresprinklersystemdesignrepair_No = (String) row.get("GI_EQ_Doesapplicantperformanyalarmorfiresprinklersystemdesignrepair_No");
		String strGI_EQ_Doesapplicantperformanyfireorwaterrestorationwork_Yes= (String) row.get("GI_EQ_Doesapplicantperformanyfireorwaterrestorationwork_Yes");
		String strGI_EQ_Doesapplicantperformanyfireorwaterrestorationwork_No= (String) row.get("GI_EQ_Doesapplicantperformanyfireorwaterrestorationwork_No");
		String strGI_EQ_Doesapplicantpaintbridgestowersortanks_No = (String) row.get("GI_EQ_Doesapplicantpaintbridgestowersortanks_No");
		String strGI_EQ_Doesapplicantpaintbridgestowersortanks_Yes = (String) row.get("GI_EQ_Doesapplicantpaintbridgestowersortanks_Yes");
		String strGI_EQ_DoesapplicantperformExteriorInsulationFinishingSystemEIFSwork_Yes = (String) row.get("GI_EQ_DoesapplicantperformExteriorInsulationFinishingSystemEIFSwork_Yes");
		String strGI_EQ_DoesapplicantperformExteriorInsulationFinishingSystemEIFSwork_No = (String) row.get("GI_EQ_DoesapplicantperformExteriorInsulationFinishingSystemEIFSwork_No");
		String strGI_EQ_DoYouGuideBear_Yes = (String) row.get("GI_EQ_DoYouGuideBear_Yes");
		String strGI_EQ_DoYouGuideBear_No = (String) row.get("GI_EQ_DoYouGuideBear_No");
		String strGI_EQ_DD_MedicalTherapyOrhealthCareServices_Yes = (String) row.get("GI_EQ_DD_MedicalTherapyOrhealthCareServices_Yes");
		String strGI_EQ_DD_MedicalTherapyOrhealthCareServices_No = (String) row.get("GI_EQ_DD_MedicalTherapyOrhealthCareServices_No");
		String strGI_TentingCropSprayingOrAnyWorkAtAirport_Yes = (String) row.get("GI_TentingCropSprayingOrAnyWorkAtAirport_Yes");
		String strGI_TentingCropSprayingOrAnyWorkAtAirport_No = (String) row.get("GI_TentingCropSprayingOrAnyWorkAtAirport_No");
		String strGI_EQ_AreYouOfferingAnyOfTheMixedmartial_Yes = (String) row.get("GI_EQ_AreYouOfferingAnyOfTheMixedmartial_Yes");
		String strGI_EQ_AreYouOfferingAnyOfTheMixedmartial_No = (String) row.get("GI_EQ_AreYouOfferingAnyOfTheMixedmartial_No");
		String strGI_EQ_AreAnyParticipantsOverTheAgeOf13_Yes = (String) row.get("GI_EQ_AreAnyParticipantsOverTheAgeOf13_Yes");
		String strGI_EQ_AreAnyParticipantsOverTheAgeOf13_No = (String) row.get("GI_EQ_AreAnyParticipantsOverTheAgeOf13_No");
		String strGI_Isprizevalueover_50000_Yes = (String) row.get("GI_Isprizevalueover$50,000_Yes");
		String strGI_Isprizevalueover_50000_No = (String) row.get("GI_Isprizevalueover$50,000_No");
		String strGI_IsPrizeholeyardagelessthan140yards_Yes = (String) row.get("GI_IsPrizeholeyardagelessthan140yards_Yes");
		String strGI_IsPrizeholeyardagelessthan140yards_No = (String) row.get("GI_IsPrizeholeyardagelessthan140yards_No");
		String strGI_AreAnyProfessionalGolfersAllowedtoParticipate_Yes = (String) row.get("GI_AreAnyProfessionalGolfersAllowedtoParticipate_Yes");
		String strGI_AreAnyProfessionalGolfersAllowedtoParticipate_No = (String) row.get("GI_AreAnyProfessionalGolfersAllowedtoParticipate_No");
		String strGI_EQ_CHK_IsTheEventPolitical_Yes = (String) row.get("GI_EQ_CHK_IsTheEventPolitical_Yes");
		String strGI_EQ_CHK_IsTheEventPolitical_No = (String) row.get("GI_EQ_CHK_IsTheEventPolitical_No");
		String strGI_EQ_CHK_IsBringYourOwnAlcohol_Yes = (String) row.get("GI_EQ_CHK_IsBringYourOwnAlcohol_Yes");
		String strGI_EQ_CHK_IsBringYourOwnAlcohol_No = (String) row.get("GI_EQ_CHK_IsBringYourOwnAlcohol_No");
		String strGI_EQ_CHK_EventHeldAtPersonalResidence_Yes = (String) row.get("GI_EQ_CHK_EventHeldAtPersonalResidence_Yes");
		String strGI_EQ_CHK_EventHeldAtPersonalResidence_No = (String) row.get("GI_EQ_CHK_EventHeldAtPersonalResidence_No");
		String strGI_EQ_CHK_AreSpectatorsSeated_Yes = (String) row.get("GI_EQ_CHK_AreSpectatorsSeated_Yes");
		String strGI_EQ_CHK_AreSpectatorsSeated_No = (String) row.get("GI_EQ_CHK_AreSpectatorsSeated_No");
		String strGI_EQ_CHK_IsTherePermanentFencing_Yes = (String) row.get("GI_EQ_CHK_IsTherePermanentFencing_Yes");
		String strGI_EQ_CHK_IsTherePermanentFencing_No = (String) row.get("GI_EQ_CHK_IsTherePermanentFencing_No");
		String strGI_EQ_CHK_WillThereBeRacingOrBurnOut_Yes = (String) row.get("GI_EQ_CHK_WillThereBeRacingOrBurnOut_Yes");
		String strGI_EQ_CHK_WillThereBeRacingOrBurnOut_No = (String) row.get("GI_EQ_CHK_WillThereBeRacingOrBurnOut_No");
		String strGI_EQ_CHK_WillThereBeLiveAmmunition_Yes = (String) row.get("GI_EQ_CHK_WillThereBeLiveAmmunition_Yes");
		String strGI_EQ_CHK_WillThereBeLiveAmmunition_No = (String) row.get("GI_EQ_CHK_WillThereBeLiveAmmunition_No");
		String strGI_EQ_CHK_IsTheEventAPokerRun_Yes = (String) row.get("GI_EQ_CHK_IsTheEventAPokerRun_Yes");
		String strGI_EQ_CHK_IsTheEventAPokerRun_No = (String) row.get("GI_EQ_CHK_IsTheEventAPokerRun_No");
		String strGI_EQ_HaveYouhadMoreThanOneClaim_last3years_Yes = (String) row.get("GI_EQ_HaveYouhadMoreThanOneClaim_last3years_Yes");
		String strGI_EQ_HaveYouhadMoreThanOneClaim_last3years_No = (String) row.get("GI_EQ_HaveYouhadMoreThanOneClaim_last3years_No");
		String strGI_EQ_HaveYouhadClaimsPaid_greaterThan5000_Yes = (String) row.get("GI_EQ_HaveYouhadClaimsPaid_greaterThan5000_Yes");
		String strGI_EQ_HaveYouhadClaimsPaid_greaterThan5000_No = (String) row.get("GI_EQ_HaveYouhadClaimsPaid_greaterThan5000_No");
		String strGI_EQ_DoesYourOperationsInvolveanyofthefollowing_Landclearing_Yes = (String) row.get("GI_EQ_DoesYourOperationsInvolveanyofthefollowing_Landclearing_Yes");
		String strGI_EQ_DoesYourOperationsInvolveanyofthefollowing_Landclearing_No = (String) row.get("GI_EQ_DoesYourOperationsInvolveanyofthefollowing_Landclearing_No");	
		String strGI_EQ_DoesYourOperationsInvolveanyofthefollowing_AgricultureCrop_Yes = (String) row.get("GI_EQ_DoesYourOperationsInvolveanyofthefollowing_AgricultureCrop_Yes");
		String strGI_EQ_DoesYourOperationsInvolveanyofthefollowing_AgricultureCrop_No = (String) row.get("GI_EQ_DoesYourOperationsInvolveanyofthefollowing_AgricultureCrop_No");	
		String strGI_Doestheinsuredhiresubcontractors_Yes = (String) row.get("GI_Doestheinsuredhiresubcontractors_Yes");
		String strGI_Doestheinsuredhiresubcontractors_No = (String) row.get("GI_Doestheinsuredhiresubcontractors_No");
		String strGI_EQ_IsTheMajorityOfTheApplicantOperationConsideredLessorRisk_Yes = (String) row.get("GI_EQ_IsTheMajorityOfTheApplicantOperationConsideredLessorRisk_Yes");
		String strGI_EQ_IsTheMajorityOfTheApplicantOperationConsideredLessorRisk_No = (String) row.get("GI_EQ_IsTheMajorityOfTheApplicantOperationConsideredLessorRisk_No");
		String strGI_DoestheApplSubcontractMore35_Yes = (String) row.get("GI_DoestheApplSubcontractMore35_Yes");
		String strGI_DoestheApplSubcontractMore35_No = (String) row.get("GI_DoestheApplSubcontractMore35_No");
		String strGI_EQ_CHK_Doestheapplicantperformworkonanynewresidentialconstruction_No = (String) row.get("GI_EQ_CHK_Doestheapplicantperformworkonanynewresidentialconstruction_No");
		String strGI_EQ_CHK_Doestheapplicantperformworkonanynewresidentialconstruction_Yes = (String) row.get("GI_EQ_CHK_Doestheapplicantperformworkonanynewresidentialconstruction_Yes");
		String strGI_EQ_Doestheapplicantdoanyworkinoilfields_Yes = (String) row.get("GI_EQ_Doestheapplicantdoanyworkinoilfields_Yes");
		String strGI_EQ_Doestheapplicantdoanyworkinoilfields_No = (String) row.get("GI_EQ_Doestheapplicantdoanyworkinoilfields_No");
		String strGI_Iseventlocationatafairground_Yes = (String) row.get("GI_Iseventlocationatafairground_Yes");
		String strGI_Iseventlocationatafairground_No = (String) row.get("GI_Iseventlocationatafairground_No");
		String strGI_EQ_CHK_DoYourOperationsInvolveAnyOfFollowing_Yes = (String) row.get("GI_EQ_CHK_DoYourOperationsInvolveAnyOfFollowing_Yes");
		String strGI_EQ_CHK_DoYourOperationsInvolveAnyOfFollowing_No = (String) row.get("GI_EQ_CHK_DoYourOperationsInvolveAnyOfFollowing_No");
		String strGI_SupportingLines_Areyousubmittingadditionallinesofbusiness_Yes = (String) row.get("GI_SupportingLines_Areyousubmittingadditionallinesofbusiness_Yes");
		String strGI_SupportingLines_Areyousubmittingadditionallinesofbusiness_No = (String) row.get("GI_SupportingLines_Areyousubmittingadditionallinesofbusiness_No");
		String strGI_SupportingLines_ExpiringFullTermPackagePremiumexceeds5000_Yes = (String) row.get("GI_SupportingLines_ExpiringFullTermPackagePremiumexceeds5000_Yes");
		String strGI_SupportingLines_ExpiringFullTermPackagePremiumexceeds5000_No = (String) row.get("GI_SupportingLines_ExpiringFullTermPackagePremiumexceeds5000_No");
		String strGI_SupportingLines_CHK_WorkersCompensation = (String) row.get("GI_SupportingLines_CHK_WorkersCompensation");
		String strGI_SupportingLines_CHK_CommercialAuto = (String) row.get("GI_SupportingLines_CHK_CommercialAuto");
		String strGI_SupportingLines_CHK_Umbrella = (String) row.get("GI_SupportingLines_CHK_Umbrella");
		String strGI_EQ_DoYouProvideGuidingService_Yes = (String) row.get("GI_EQ_DoYouProvideGuidingService_Yes");
		String strGI_EQ_DoYouProvideGuidingService_No = (String) row.get("GI_EQ_DoYouProvideGuidingService_No");
		String strGI_EQ_CHK_Anyindustrialorhighpressureboiler_No = (String) row.get("GI_EQ_CHK_Anyindustrialorhighpressureboiler_No");
		String strGI_EQ_CHK_Anyindustrialorhighpressureboiler_Yes = (String) row.get("GI_EQ_CHK_Anyindustrialorhighpressureboiler_Yes");
		String strGI_EQ_CHK_Min2yearsVerifiableHistory_Yes = (String) row.get("GI_EQ_CHK_Min2yearsVerifiableHistory_Yes");		
		String strGI_EQ_CHK_Min2yearsVerifiableHistory_No = (String) row.get("GI_EQ_CHK_Min2yearsVerifiableHistory_No");		
		String strGI_EQ_CHK_Morethan1FullTimeOtherthanOwner_Yes = (String) row.get("GI_EQ_CHK_Morethan1FullTimeOtherthanOwner_Yes");
		String strGI_UW_Underwriter = (String) row.get("GI_UW_Underwriter");
		String strGI_AccClearanceOverride_CHK_AccClrOverride = (String) row.get("GI_AccClearanceOverride_CHK_AccClrOverride");
		String strGI_EQ_AreVehiclesOperatedBeyond200Miles_No= (String) row.get("GI_EQ_AreVehiclesOperatedBeyond200Miles_No");
		String strGI_EQ_AreVehiclesOperatedBeyond200Miles_Yes = (String) row.get("GI_EQ_AreVehiclesOperatedBeyond200Miles_Yes");
		String strGI_EQ_CHK_Dooperationsinvolvehandlinghazardousmaterial_Yes = (String) row.get("GI_EQ_CHK_Dooperationsinvolvehandlinghazardousmaterial_Yes");
		String strGI_EQ_CHK_Dooperationsinvolvehandlinghazardousmaterial_No = (String) row.get("GI_EQ_CHK_Dooperationsinvolvehandlinghazardousmaterial_No");
		String strGI_EQ_Doesapplicantperformanytrafficsignalwork_Yes = (String) row.get("GI_EQ_Doesapplicantperformanytrafficsignalwork_Yes");
		String strGI_EQ_Doesapplicantperformanytrafficsignalwork_No = (String) row.get("GI_EQ_Doesapplicantperformanytrafficsignalwork_No");
		String strGI_EQ_CHK_VehOperatedbeyond200Miles_Yes = (String) row.get("GI_EQ_CHK_VehOperatedbeyond200Miles_Yes");
		String strGI_EQ_CHK_VehOperatedbeyond200Miles_No = (String) row.get("GI_EQ_CHK_VehOperatedbeyond200Miles_No");
		String strGI_EQ_CHK_ApplicantHaveAnyElectricVehicles_Yes = (String) row.get("GI_EQ_CHK_ApplicantHaveAnyElectricVehicles_Yes");
		String strGI_EQ_CHK_ApplicantHaveAnyElectricVehicles_No = (String) row.get("GI_EQ_CHK_ApplicantHaveAnyElectricVehicles_No");
		
		String strGI_EQ_HaulhazardousDOTList_No = (String) row.get("GI_EQ_HaulhazardousDOTList_No");
		String strGI_EQ_HaulhazardousDOTList_Yes = (String) row.get("GI_EQ_HaulhazardousDOTList_Yes");
		String strGI_EQ_HaulTrailersOwnedByOthers_No = (String) row.get("GI_EQ_HaulTrailersOwnedByOthers_No");
		String strGI_EQ_HaulTrailersOwnedByOthers_Yes = (String) row.get("GI_EQ_HaulTrailersOwnedByOthers_Yes");
		String strGI_EQ_PerformBackgroundChecks_Yes = (String) row.get("GI_EQ_PerformBackgroundChecks_Yes");
		String strGI_EQ_PerformBackgroundChecks_No = (String) row.get("GI_EQ_PerformBackgroundChecks_No");
		String strGI_EQ_DriverTurnoverRateAbove30_Yes = (String) row.get("GI_EQ_DriverTurnoverRateAbove30_Yes");
		String strGI_EQ_DriverTurnoverRateAbove30_No = (String) row.get("GI_EQ_DriverTurnoverRateAbove30_No");
		String strGI_EQ_MajorViolationPast5Years_Yes = (String) row.get("GI_EQ_MajorViolationPast5Years_Yes");
		String strGI_EQ_MajorViolationPast5Years_No = (String) row.get("GI_EQ_MajorViolationPast5Years_No");
		String strGI_EQ_IsEmploymentHistoryVerified_Yes = (String) row.get("GI_EQ_IsEmploymentHistoryVerified_Yes");
		String strGI_EQ_IsEmploymentHistoryVerified_No = (String) row.get("GI_EQ_IsEmploymentHistoryVerified_No");
		String strGI_EQ_AreMVRsOrderedPriorToHire_Yes = (String) row.get("GI_EQ_AreMVRsOrderedPriorToHire_Yes");
		String strGI_EQ_AreMVRsOrderedPriorToHire_No = (String) row.get("GI_EQ_AreMVRsOrderedPriorToHire_No");
		String strGI_EQ_AreRoadTestsRequired_Yes = (String) row.get("GI_EQ_AreRoadTestsRequired_Yes");
		String strGI_EQ_AreRoadTestsRequired_No = (String) row.get("GI_EQ_AreRoadTestsRequired_No");
		String strGI_EQ_AreTwoyearsCDLExperience_Yes = (String) row.get("GI_EQ_AreTwoyearsCDLExperience_Yes");
		String strGI_EQ_AreTwoyearsCDLExperience_No = (String) row.get("GI_EQ_AreTwoyearsCDLExperience_No");
		String strGI_EQ_AreCDLRequiredToHire_Yes = (String) row.get("GI_EQ_AreCDLRequiredToHire_Yes");
		String strGI_EQ_AreCDLRequiredToHire_No = (String) row.get("GI_EQ_AreCDLRequiredToHire_No");
		String strGI_EQ_Doesapplicantprovideservicesonshowanimals_Yes = (String) row.get("GI_EQ_Doesapplicantprovideservicesonshowanimals_Yes");
		String strGI_EQ_Doesapplicantprovideservicesonshowanimals_No = (String) row.get("GI_EQ_Doesapplicantprovideservicesonshowanimals_No");
		String strGI_EQ_Doesapplicantprovideservicesonfollowingbreedsofdogs_Yes = (String) row.get("GI_EQ_Doesapplicantprovideservicesonfollowingbreedsofdogs_Yes");
		String strGI_EQ_Doesapplicantprovideservicesonfollowingbreedsofdogs_No = (String) row.get("GI_EQ_Doesapplicantprovideservicesonfollowingbreedsofdogs_No");
		String strGI_EQ_AreyouofferinganyAnimalrescue_Yes = (String) row.get("GI_EQ_AreyouofferinganyAnimalrescue_Yes");
		String strGI_EQ_AreyouofferinganyAnimalrescue_No = (String) row.get("GI_EQ_AreyouofferinganyAnimalrescue_No");
		String strGI_EQ_StoragePollutantsFlamWaste_Yes = (String) row.get("GI_EQ_StoragePollutantsFlamWaste_Yes");
		String strGI_EQ_StoragePollutantsFlamWaste_No	 = (String) row.get("GI_EQ_StoragePollutantsFlamWaste_No");
		String strGI_EQ_BldgMoreThan2Stories_Yes = (String) row.get("GI_EQ_BldgMoreThan2Stories_Yes");
		String strGI_EQ_BldgMoreThan2Stories_No	 = (String) row.get("GI_EQ_BldgMoreThan2Stories_No");
		String strGI_EQ_PropertiesOwnedByOthers_Yes = (String) row.get("GI_EQ_PropertiesOwnedByOthers_Yes");
		String strGI_EQ_PropertiesOwnedByOthers_No	 = (String) row.get("GI_EQ_PropertiesOwnedByOthers_No");
		String strGI_EQ_GreenhousePropertyCoverage_Yes = (String) row.get("GI_EQ_GreenhousePropertyCoverage_Yes");
		String strGI_EQ_GreenhousePropertyCoverage_No	 = (String) row.get("GI_EQ_GreenhousePropertyCoverage_No");
		String strGI_EQ_Minimum2YearOfHistory_Yes = (String) row.get("GI_EQ_Minimum2YearOfHistory_Yes");
		String strGI_EQ_Minimum2YearOfHistory_No	 = (String) row.get("GI_EQ_Minimum2YearOfHistory_No");
		String strGI_EQ_FullTimeEmployee_Yes = (String) row.get("GI_EQ_FullTimeEmployee_Yes");
		String strGI_EQ_FullTimeEmployee_No	 = (String) row.get("GI_EQ_FullTimeEmployee_No");
		String strGI_EQ_AreyouOfferMMAHockeySkateboarding_Yes = (String) row.get("GI_EQ_AreyouOfferMMAHockeySkateboarding_Yes");
		String strGI_EQ_AreyouOfferMMAHockeySkateboarding_No = (String) row.get("GI_EQ_AreyouOfferMMAHockeySkateboarding_No");
		
		String strGI_EQ_AreThereSalesOrBreeding_Yes = (String) row.get("GI_EQ_AreThereSalesOrBreeding_Yes");
		String strGI_EQ_AreThereSalesOrBreeding_No = (String) row.get("GI_EQ_AreThereSalesOrBreeding_No");
		String strGI_EQ_AreThereSalesOrTrainingofGuardDogs_Yes = (String) row.get("GI_EQ_AreThereSalesOrTrainingofGuardDogs_Yes");
		String strGI_EQ_AreThereSalesOrTrainingofGuardDogs_No = (String) row.get("GI_EQ_AreThereSalesOrTrainingofGuardDogs_No");
		String strGI_EQ_DoSalesfromRentalsAccountMorethan20_Yes = (String) row.get("GI_EQ_DoSalesfromRentalsAccountMorethan20_Yes");
		String strGI_EQ_DoSalesfromRentalsAccountMorethan20_No = (String) row.get("GI_EQ_DoSalesfromRentalsAccountMorethan20_No");
		String strGI_EQ_DoesTheInsuredSellSwimmingPools_Yes = (String) row.get("GI_EQ_DoesTheInsuredSellSwimmingPools_Yes");
		String strGI_EQ_DoesTheInsuredSellSwimmingPools_No = (String) row.get("GI_EQ_DoesTheInsuredSellSwimmingPools_No");
		
		String strGI_EQ_3YRLiabilityClaimHistory_Yes = (String) row.get("GI_EQ_3YRLiabilityClaimHistory_Yes");
		String strGI_EQ_3YRLiabilityClaimHistory_No = (String) row.get("GI_EQ_3YRLiabilityClaimHistory_No");
		
		String strGI_EQ_3YRPropertyHistory_Yes = (String) row.get("GI_EQ_3YRPropertyHistory_Yes");
		String strGI_EQ_3YRPropertyHistory_No = (String) row.get("GI_EQ_3YRPropertyHistory_No");
		
		String strGI_EQ_3YROtherHistory_Yes = (String) row.get("GI_EQ_3YROtherHistory_Yes");
		String strGI_EQ_3YROtherHistory_No = (String) row.get("GI_EQ_3YROtherHistory_No");
		
		String strGI_EQ_3YRAutoLiabilityHistory_Yes = (String) row.get("GI_EQ_3YRAutoLiabilityHistory_Yes");
		String strGI_EQ_3YRPhysicalDamageHistory_No = (String) row.get("GI_EQ_3YRPhysicalDamageHistory_No");
		String strGI_EQ_3YRAutoLiabilityHistory_No = (String) row.get("GI_EQ_3YRAutoLiabilityHistory_No");
		String strGI_EQ_3YRPhysicalDamageHistory_Yes = (String) row.get("GI_EQ_3YRPhysicalDamageHistory_Yes");
		String strGI_EQ_OfferMixedMartialArtsHockey_Yes = (String) row.get("GI_EQ_OfferMixedMartialArtsHockey_Yes");
		String strGI_EQ_OfferMixedMartialArtsHockey_No = (String) row.get("GI_EQ_OfferMixedMartialArtsHockey_No");
		String strGI_EQ_SpaServices_Yes = (String) row.get("GI_EQ_SpaServices_Yes");
		String strGI_EQ_SpaServices_No = (String) row.get("GI_EQ_SpaServices_No");
		
		String strGI_EQ_IndependentContractor_Yes = (String) row.get("GI_EQ_IndependentContractor_Yes");
		String strGI_EQ_IndependentContractor_No = (String) row.get("GI_EQ_IndependentContractor_No");
		String strGI_EQ_OperationYears_Yes = (String) row.get("GI_EQ_OperationYears_Yes");
		String strGI_EQ_OperationYears_No = (String) row.get("GI_EQ_OperationYears_No");
		String strGI_EQ_TattooServices_Yes = (String) row.get("GI_EQ_TattooServices_Yes");
		String strGI_EQ_TattooServices_No = (String) row.get("GI_EQ_TattooServices_No");
		String strGI_EQ_BodyPiercing_Yes = (String) row.get("GI_EQ_BodyPiercing_Yes");
		String strGI_EQ_BodyPiercing_No = (String) row.get("GI_EQ_BodyPiercing_No");
		String strGI_EQ_ChildCarePrivate_Yes = (String) row.get("GI_EQ_ChildCarePrivate_Yes");
		String strGI_EQ_ChildCarePrivate_No = (String) row.get("GI_EQ_ChildCarePrivate_No");
		String strGI_EQ_AppropriateStateLicense_Yes = (String) row.get("GI_EQ_AppropriateStateLicense_Yes");
		String strGI_EQ_AppropriateStateLicense_No = (String) row.get("GI_EQ_AppropriateStateLicense_No");
		String strGI_EQ_AccreditedSchool_Yes = (String) row.get("GI_EQ_AccreditedSchool_Yes");
		String strGI_EQ_AccreditedSchool_No = (String) row.get("GI_EQ_AccreditedSchool_No");
		String strGI_EQ_CharterSchool_Yes = (String) row.get("GI_EQ_CharterSchool_Yes");
		String strGI_EQ_CharterSchool_No = (String) row.get("GI_EQ_CharterSchool_No");
		String strGI_EQ_OvernightServices_Yes = (String) row.get("GI_EQ_OvernightServices_Yes");
		String strGI_EQ_OvernightServices_No = (String) row.get("GI_EQ_OvernightServices_No");
		String strGI_EQ_NannyServices_Yes = (String) row.get("GI_EQ_NannyServices_Yes");
		String strGI_EQ_NannyServices_No = (String) row.get("GI_EQ_NannyServices_No");
		String strGI_EQ_ChildrenNursingNeeds_Yes = (String) row.get("GI_EQ_ChildrenNursingNeeds_Yes");
		String strGI_EQ_ChildrenNursingNeeds_No = (String) row.get("GI_EQ_ChildrenNursingNeeds_No");
		String strGI_EQ_Microblading10_No= (String) row.get("GI_EQ_Microblading10_No");
		String strGI_EQ_Microblading10_Yes= (String) row.get("GI_EQ_Microblading10_Yes");
		String strGI_EQ_SecurityServiceQuestion_No= (String) row.get("GI_EQ_SecurityServiceQuestion_No");
		String strGI_EQ_SecurityServiceQuestion_Yes= (String) row.get("GI_EQ_SecurityServiceQuestion_Yes");
		String strGI_EQ_DoesapplicantperformanyofthefollowingInterior_No= (String) row.get("GI_EQ_DoesapplicantperformanyofthefollowingInterior_No");
		String strGI_EQ_DoesapplicantperformanyofthefollowingInterior_Yes= (String) row.get("GI_EQ_DoesapplicantperformanyofthefollowingInterior_Yes");
		String strGI_EQ_Arespectatorsallowed_No= (String) row.get("GI_EQ_Arespectatorsallowed_No");
		String strGI_EQ_Arespectatorsallowed_Yes= (String) row.get("GI_EQ_Arespectatorsallowed_Yes");
		String strGI_EQ_CLPestHerb_No= (String) row.get("GI_EQ_CLPestHerb_No");
		String strGI_EQ_CLPestHerb_Yes= (String) row.get("GI_EQ_CLPestHerb_Yes");
		String strGI_EQ_DoesTheApplicantUseDeepFryer_Yes= (String) row.get("GI_EQ_DoesTheApplicantUseDeepFryer_Yes");
		String strGI_EQ_DoesTheApplicantUseDeepFryer_No= (String) row.get("GI_EQ_DoesTheApplicantUseDeepFryer_No");
		String strGI_EQ_IsFireProtectionSystemInstalled_Yes= (String) row.get("GI_EQ_IsFireProtectionSystemInstalled_Yes");
		String strGI_EQ_IsFireProtectionSystemInstalled_No= (String) row.get("GI_EQ_IsFireProtectionSystemInstalled_No");
		String strGI_EQ_DoesTheApplicantSellAlcoholOrTobacco_Yes= (String) row.get("GI_EQ_DoesTheApplicantSellAlcoholOrTobacco_Yes");
		String strGI_EQ_DoesTheApplicantSellAlcoholOrTobacco_No= (String) row.get("GI_EQ_DoesTheApplicantSellAlcoholOrTobacco_No");
		String strGI_EQ_IsTheFoodTruckNotOperatingFromParkedLocation_Yes= (String) row.get("GI_EQ_IsTheFoodTruckNotOperatingFromParkedLocation_Yes");
		String strGI_EQ_IsTheFoodTruckNotOperatingFromParkedLocation_No= (String) row.get("GI_EQ_IsTheFoodTruckNotOperatingFromParkedLocation_No");
		String strGI_NatOfBusi_TXT_EventDes = (String) row.get("GI_NatOfBusi_TXT_EventDes");
		String strGI_EQ_CLConcpaver_No = (String) row.get("GI_EQ_CLConcpaver_No");
		String strGI_Radio_SupportingLineAdditionalLines= (String) row.get("GI_Radio_SupportingLineAdditionalLines");
		String strGI_Radio_ExpiringFullTermCPP= (String) row.get("GI_Radio_ExpiringFullTermCPP");
		String strGI_Radio_SupportingLineExistingPolicy= (String) row.get("GI_Radio_SupportingLineExistingPolicy");
		String strGI_CHK_SupportingLineWorkersComp= (String) row.get("GI_CHK_SupportingLineWorkersComp");
		String strGI_CHK_SupportingLineAuto= (String) row.get("GI_CHK_SupportingLineAuto");
		String strGI_CHK_SupportingLineUmbrella = (String) row.get("GI_CHK_SupportingLineUmbrella");
		
		String strUW_TXT_TerritoryUnderwriter = (String) row.get("UW_TXT_TerritoryUnderwriter");
		

		String strUW_RBTN_GuideTreeStands_No = (String) row.get("UW_RBTN_GuideTreeStands_No");
		String strUW_RBTN_GuideTreeStands_Yes = (String) row.get("UW_RBTN_GuideTreeStands_Yes");
		
		String strGI_EQ_BunkedCribs_No = (String) row.get("GI_EQ_BunkedCribs_No");
		String strGI_EQ_BunkedCribs_Yes = (String) row.get("GI_EQ_BunkedCribs_Yes");
		
		//String strGI_EQ_CHK_Isapplicantinvolvedinanysignificantwoodworkingmanufacturingorprocessing_Yes = (String) row.get("GI_EQ_CHK_Isapplicantinvolvedinanysignificantwoodworkingmanufacturingorprocessing_Yes");
		//String strGI_EQ_CHK_Isapplicantinvolvedinanysignificantwoodworkingmanufacturingorprocessing_No = (String) row.get("GI_EQ_CHK_Isapplicantinvolvedinanysignificantwoodworkingmanufacturingorprocessing_No");
		//String strGI_EQ_Doestheinsuredownorusedtoownanypitsorlagoonsthatwereusedforwastedisposal_No = (String) row.get("GI_EQ_Doestheinsuredownorusedtoownanypitsorlagoonsthatwereusedforwastedisposal_No");
		//String strGI_EQ_Doestheinsuredownorusedtoownanypitsorlagoonsthatwereusedforwastedisposal_Yes = (String) row.get("GI_EQ_Doestheinsuredownorusedtoownanypitsorlagoonsthatwereusedforwastedisposal_Yes");
		
		//String strGI_EQ_Doesapplicantinstallorserviceoverheaddoors_Yes = (String) row.get("GI_EQ_Doesapplicantinstallorserviceoverheaddoors_Yes");
		//String strGI_EQ_Doesapplicantinstallorserviceoverheaddoors_No = (String) row.get("GI_EQ_Doesapplicantinstallorserviceoverheaddoors_No");
		//String strGI_EQ_Does_applicant_perform_Street_Road_Highway_Interstate_work = (String) row.get("GI_EQ_Does_applicant_perform_Street_Road_Highway_Interstate_work?");
		//String strGI_EQ_Does_applicant_perform_any_traffic_signal_work = (String) row.get("GI_EQ_Does_applicant_perform_any_traffic_signal_work?");
		//String strGI_EQ_DD_AreThereAnyDomeStruct_Yes = (String) row.get("GI_EQ_DD_AreThereAnyDomeStruct_Yes");
		//String strGI_EQ_DD_AreThereAnyDomeStruct_No = (String) row.get("GI_EQ_DD_AreThereAnyDomeStruct_No");
		//String strGI_DoYouDisconnectPowerLines_Yes = (String) row.get("GI_DoYouDisconnectPowerLines_Yes");
		//String strGI_DoYouDisconnectPowerLines_No = (String) row.get("GI_DoYouDisconnectPowerLines_No");
		//String strGI_EQ_DD_PastOrCurrentAbuseClaims_Yes = (String) row.get("GI_EQ_DD_PastOrCurrentAbuseClaims_Yes");
		//String strGI_EQ_DD_PastOrCurrentAbuseClaims_No = (String) row.get("GI_EQ_DD_PastOrCurrentAbuseClaims_No");
		//String strGI_EQ_Doyoudoanystreetcleaningsnowplowing_Yes = (String) row.get("GI_EQ_Doyoudoanystreetcleaningsnowplowing_Yes");
	//	String strGI_EQ_Doyoudoanystreetcleaningsnowplowing_No = (String) row.get("GI_EQ_Doyoudoanystreetcleaningsnowplowing_No");		
		//String strGI_EQ_Aresubcontractorsallowedtoworkwithoutprovidingtheinsuredwithacertificateofinsurance_Yes = (String) row.get("GI_EQ_Aresubcontractorsallowedtoworkwithoutprovidingtheinsuredwithacertificateofinsurance_Yes");
		//String strGI_EQ_Aresubcontractorsallowedtoworkwithoutprovidingtheinsuredwithacertificateofinsurance_No = (String) row.get("GI_EQ_Aresubcontractorsallowedtoworkwithoutprovidingtheinsuredwithacertificateofinsurance_No");
		//String strGI_EQ_Dosubcontractorscarrycoverageorlimitslessthantheinsured_Yes = (String) row.get("GI_EQ_Dosubcontractorscarrycoverageorlimitslessthantheinsured_Yes");
		//String strGI_EQ_Dosubcontractorscarrycoverageorlimitslessthantheinsured_No = (String) row.get("GI_EQ_Dosubcontractorscarrycoverageorlimitslessthantheinsured_No");
		
		
		/*String strGI_EQ_BTN_Anyworkonpetrochemicalnuclearoilorgasrefineriesorpowerplants_No = (String) row.get("GI_EQ_BTN_Anyworkonpetrochemicalnuclearoilorgasrefineriesorpowerplants_No");
		String strGI_EQ_BTN_Anyworkonpetrochemicalnuclearoilorgasrefineriesorpowerplants_Yes = (String) row.get("GI_EQ_BTN_Anyworkonpetrochemicalnuclearoilorgasrefineriesorpowerplants_Yes");*/
		//String strGI_EQ_CHK_Anyworkperformedinblastingdemolitionsandblastingorwrecking_Yes = (String) row.get("GI_EQ_BTN_Anyworkperformedinblastingdemolitionsandblastingorwrecking_Yes");
		//String strGI_EQ_BTN_Anyworkperformedinblastingdemolitionsandblastingorwrecking_No = (String) row.get("GI_EQ_BTN_Anyworkperformedinblastingdemolitionsandblastingorwrecking_No");
		//String strGI_EQ_CHK_Any_work_on_petrochemical_nuclear_oil_or_gas_refineries_or_power_plants_YES = (String) row.get("GI_EQ_CHK_Any_work_on_petrochemical_nuclear_oil_or_gas_refineries_or_power_plants_YES");
		//String strGI_EQ_Does_applicant_perform_any_fire_or_water_restoration_work_YES = (String) row.get("GI_EQ_Does_applicant_perform_any_fire_or_water_restoration_work_ES");
		
			
		try{
			se.element().checkUncheckOrValidate(getGI_EQ_HaulhazardousDOTList_No(strGI_EQ_HaulhazardousDOTList_No), strGI_EQ_HaulhazardousDOTList_No, test);
			se.element().checkUncheckOrValidate(getGI_EQ_HaulhazardousDOTList_Yes(strGI_EQ_HaulhazardousDOTList_Yes), strGI_EQ_HaulhazardousDOTList_Yes, test);
			se.element().checkUncheckOrValidate(getGI_EQ_HaulTrailersOwnedByOthers_No(strGI_EQ_HaulTrailersOwnedByOthers_No), strGI_EQ_HaulTrailersOwnedByOthers_No, test);
			se.element().checkUncheckOrValidate(getGI_EQ_HaulTrailersOwnedByOthers_Yes(strGI_EQ_HaulTrailersOwnedByOthers_Yes), strGI_EQ_HaulTrailersOwnedByOthers_Yes, test);
			se.element().checkUncheckOrValidate(getGI_EQ_PerformBackgroundChecks_Yes(strGI_EQ_PerformBackgroundChecks_Yes), strGI_EQ_PerformBackgroundChecks_Yes, test);
			se.element().checkUncheckOrValidate(getGI_EQ_PerformBackgroundChecks_No(strGI_EQ_PerformBackgroundChecks_No), strGI_EQ_PerformBackgroundChecks_No, test);
			se.element().checkUncheckOrValidate(getGI_EQ_DriverTurnoverRateAbove30_Yes(strGI_EQ_DriverTurnoverRateAbove30_Yes), strGI_EQ_DriverTurnoverRateAbove30_Yes, test);
			se.element().checkUncheckOrValidate(getGI_EQ_DriverTurnoverRateAbove30_No(strGI_EQ_DriverTurnoverRateAbove30_No), strGI_EQ_DriverTurnoverRateAbove30_No, test);
			se.element().checkUncheckOrValidate(getGI_EQ_MajorViolationPast5Years_Yes(strGI_EQ_MajorViolationPast5Years_Yes), strGI_EQ_MajorViolationPast5Years_Yes, test);
			se.element().checkUncheckOrValidate(getGI_EQ_MajorViolationPast5Years_No(strGI_EQ_MajorViolationPast5Years_No), strGI_EQ_MajorViolationPast5Years_No, test);
			se.element().checkUncheckOrValidate(getGI_EQ_IsEmploymentHistoryVerified_Yes(strGI_EQ_IsEmploymentHistoryVerified_Yes), strGI_EQ_IsEmploymentHistoryVerified_Yes, test);
			se.element().checkUncheckOrValidate(getGI_EQ_IsEmploymentHistoryVerified_No(strGI_EQ_IsEmploymentHistoryVerified_No), strGI_EQ_IsEmploymentHistoryVerified_No, test);
			se.element().checkUncheckOrValidate(getGI_EQ_AreMVRsOrderedPriorToHire_Yes(strGI_EQ_AreMVRsOrderedPriorToHire_Yes), strGI_EQ_AreMVRsOrderedPriorToHire_Yes, test);
			se.element().checkUncheckOrValidate(getGI_EQ_AreMVRsOrderedPriorToHire_No(strGI_EQ_AreMVRsOrderedPriorToHire_No), strGI_EQ_AreMVRsOrderedPriorToHire_No, test);
			se.element().checkUncheckOrValidate(getGI_EQ_AreRoadTestsRequired_Yes(strGI_EQ_AreRoadTestsRequired_Yes), strGI_EQ_AreRoadTestsRequired_Yes, test);
			se.element().checkUncheckOrValidate(getGI_EQ_AreRoadTestsRequired_No(strGI_EQ_AreRoadTestsRequired_No), strGI_EQ_AreRoadTestsRequired_No, test);
			se.element().checkUncheckOrValidate(getGI_EQ_AreTwoyearsCDLExperience_Yes(strGI_EQ_AreTwoyearsCDLExperience_Yes), strGI_EQ_AreTwoyearsCDLExperience_Yes, test);
			se.element().checkUncheckOrValidate(getGI_EQ_AreTwoyearsCDLExperience_No(strGI_EQ_AreTwoyearsCDLExperience_No), strGI_EQ_AreTwoyearsCDLExperience_No, test);
			se.element().checkUncheckOrValidate(getGI_EQ_AreCDLRequiredToHire_No(strGI_EQ_AreCDLRequiredToHire_No), strGI_EQ_AreCDLRequiredToHire_No, test);
			se.element().checkUncheckOrValidate(getGI_EQ_AreCDLRequiredToHire_Yes(strGI_EQ_AreCDLRequiredToHire_Yes), strGI_EQ_AreCDLRequiredToHire_Yes, test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_DoesAppHave3OrMoreEmp_YES(strGI_EQ_CHK_DoesAppHave3OrMoreEmp_YES), strGI_EQ_CHK_DoesAppHave3OrMoreEmp_YES, test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_DoesAppHave3OrMoreEmp_No(strGI_EQ_CHK_DoesAppHave3OrMoreEmp_No), strGI_EQ_CHK_DoesAppHave3OrMoreEmp_No, test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_IsTheEventPolitical_Yes(strGI_EQ_CHK_IsTheEventPolitical_Yes), strGI_EQ_CHK_IsTheEventPolitical_Yes, test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_IsTheEventPolitical_No(strGI_EQ_CHK_IsTheEventPolitical_No), strGI_EQ_CHK_IsTheEventPolitical_No, test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_IsBringYourOwnAlcohol_Yes(strGI_EQ_CHK_IsBringYourOwnAlcohol_Yes), strGI_EQ_CHK_IsBringYourOwnAlcohol_Yes, test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_IsBringYourOwnAlcohol_No(strGI_EQ_CHK_IsBringYourOwnAlcohol_No), strGI_EQ_CHK_IsBringYourOwnAlcohol_No, test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_EventHeldAtPersonalResidence_Yes(strGI_EQ_CHK_EventHeldAtPersonalResidence_Yes), strGI_EQ_CHK_EventHeldAtPersonalResidence_Yes, test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_EventHeldAtPersonalResidence_No(strGI_EQ_CHK_EventHeldAtPersonalResidence_No), strGI_EQ_CHK_EventHeldAtPersonalResidence_No, test);
			se.element().checkUncheckOrValidate(getGI_Iseventlocationatafairground_Yes(strGI_Iseventlocationatafairground_Yes), strGI_Iseventlocationatafairground_Yes, test);
			se.element().checkUncheckOrValidate(getGI_Iseventlocationatafairground_No(strGI_Iseventlocationatafairground_No), strGI_Iseventlocationatafairground_No, test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_WillThereBeLiveAmmunition_Yes(strGI_EQ_CHK_WillThereBeLiveAmmunition_Yes), strGI_EQ_CHK_WillThereBeLiveAmmunition_Yes, test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_WillThereBeLiveAmmunition_No(strGI_EQ_CHK_WillThereBeLiveAmmunition_No), strGI_EQ_CHK_WillThereBeLiveAmmunition_No, test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_IsTherePermanentFencing_Yes(strGI_EQ_CHK_IsTherePermanentFencing_Yes), strGI_EQ_CHK_IsTherePermanentFencing_Yes, test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_IsTherePermanentFencing_No(strGI_EQ_CHK_IsTherePermanentFencing_No), strGI_EQ_CHK_IsTherePermanentFencing_No, test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_AreSpectatorsSeated_Yes(strGI_EQ_CHK_AreSpectatorsSeated_Yes), strGI_EQ_CHK_AreSpectatorsSeated_Yes, test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_AreSpectatorsSeated_No(strGI_EQ_CHK_AreSpectatorsSeated_No), strGI_EQ_CHK_AreSpectatorsSeated_No, test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_WillThereBeRacingOrBurnOut_Yes(strGI_EQ_CHK_WillThereBeRacingOrBurnOut_Yes), strGI_EQ_CHK_WillThereBeRacingOrBurnOut_Yes, test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_WillThereBeRacingOrBurnOut_No(strGI_EQ_CHK_WillThereBeRacingOrBurnOut_No), strGI_EQ_CHK_WillThereBeRacingOrBurnOut_No, test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_IsTheEventAPokerRun_Yes(strGI_EQ_CHK_IsTheEventAPokerRun_Yes), strGI_EQ_CHK_IsTheEventAPokerRun_Yes, test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_IsTheEventAPokerRun_No(strGI_EQ_CHK_IsTheEventAPokerRun_No), strGI_EQ_CHK_IsTheEventAPokerRun_No, test);
			se.element().checkUncheckOrValidate(getGI_EQ_Doesapplicantprovideservicesonshowanimals_Yes(strGI_EQ_Doesapplicantprovideservicesonshowanimals_Yes), strGI_EQ_Doesapplicantprovideservicesonshowanimals_Yes, test);
			se.element().checkUncheckOrValidate(getGI_EQ_Doesapplicantprovideservicesonshowanimals_No(strGI_EQ_Doesapplicantprovideservicesonshowanimals_No), strGI_EQ_Doesapplicantprovideservicesonshowanimals_No, test);
			se.element().checkUncheckOrValidate(getGI_EQ_Doesapplicantprovideservicesonfollowingbreedsofdogs_Yes(strGI_EQ_Doesapplicantprovideservicesonfollowingbreedsofdogs_Yes), strGI_EQ_Doesapplicantprovideservicesonfollowingbreedsofdogs_Yes, test);
			se.element().checkUncheckOrValidate(getGI_EQ_Doesapplicantprovideservicesonfollowingbreedsofdogs_No(strGI_EQ_Doesapplicantprovideservicesonfollowingbreedsofdogs_No), strGI_EQ_Doesapplicantprovideservicesonfollowingbreedsofdogs_No, test);
			se.element().checkUncheckOrValidate(getGI_EQ_AreyouofferinganyAnimalrescue_Yes(strGI_EQ_AreyouofferinganyAnimalrescue_Yes), strGI_EQ_AreyouofferinganyAnimalrescue_Yes, test);
			se.element().checkUncheckOrValidate(getGI_EQ_AreyouofferinganyAnimalrescue_No(strGI_EQ_AreyouofferinganyAnimalrescue_No), strGI_EQ_AreyouofferinganyAnimalrescue_No, test);
			se.element().checkUncheckOrValidate(getGI_EQ_AreyouOfferMMAHockeySkateboarding_Yes(strGI_EQ_AreyouOfferMMAHockeySkateboarding_Yes), strGI_EQ_AreyouOfferMMAHockeySkateboarding_Yes, test);
			se.element().checkUncheckOrValidate(getGI_EQ_AreyouOfferMMAHockeySkateboarding_No(strGI_EQ_AreyouOfferMMAHockeySkateboarding_No), strGI_EQ_AreyouOfferMMAHockeySkateboarding_No, test);
			
			se.util().sleep(5000);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_Dooperationsinvolvehandlinghazardousmaterial_Yes(strGI_EQ_CHK_Dooperationsinvolvehandlinghazardousmaterial_Yes), strGI_EQ_CHK_Dooperationsinvolvehandlinghazardousmaterial_Yes, test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_Dooperationsinvolvehandlinghazardousmaterial_No(strGI_EQ_CHK_Dooperationsinvolvehandlinghazardousmaterial_No), strGI_EQ_CHK_Dooperationsinvolvehandlinghazardousmaterial_No, test);
			//se.element().checkUncheckOrValidate(getGI_EQ_BTN_Anyworkonpetrochemicalnuclearoilorgasrefineriesorpowerplants_Yes(strGI_EQ_BTN_Anyworkonpetrochemicalnuclearoilorgasrefineriesorpowerplants_Yes), strGI_EQ_BTN_Anyworkonpetrochemicalnuclearoilorgasrefineriesorpowerplants_Yes, test);
			//se.element().checkUncheckOrValidate(getGI_EQ_BTN_Anyworkonpetrochemicalnuclearoilorgasrefineriesorpowerplants_No(strGI_EQ_BTN_Anyworkonpetrochemicalnuclearoilorgasrefineriesorpowerplants_No), strGI_EQ_BTN_Anyworkonpetrochemicalnuclearoilorgasrefineriesorpowerplants_No, test);
			//se.element().checkUncheckOrValidate(getGI_EQ_CHK_Anyworkperformedinblastingdemolitionsandblastingorwrecking_Yes(strGI_EQ_CHK_Anyworkperformedinblastingdemolitionsandblastingorwrecking_Yes),strGI_EQ_CHK_Anyworkperformedinblastingdemolitionsandblastingorwrecking_Yes,test);
			//se.element().checkUncheckOrValidate(getGI_EQ_CHK_Anyworkperformedinblastingdemolitionsandblastingorwrecking_No(strGI_EQ_BTN_Anyworkperformedinblastingdemolitionsandblastingorwrecking_No),strGI_EQ_BTN_Anyworkperformedinblastingdemolitionsandblastingorwrecking_No,test);
			se.element().SelectElement(GI_EQ_DD_Any_claims_in_the_past_3_years,strGI_EQ_DD_Any_claims_in_the_past_3_years,test);
			se.util().sleep(5000);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_AnyWorkPerformBargesVessels_Yes(strGI_EQ_CHK_AnyWorkPerformBargesVessels_Yes),strGI_EQ_CHK_AnyWorkPerformBargesVessels_Yes,test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_AnyWorkPerformBargesVessels_No(strGI_EQ_CHK_AnyWorkPerformBargesVessels_No),strGI_EQ_CHK_AnyWorkPerformBargesVessels_No,test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_DoYourOperationsInvolveAnyOfFollowing_Yes(strGI_EQ_CHK_DoYourOperationsInvolveAnyOfFollowing_Yes),strGI_EQ_CHK_DoYourOperationsInvolveAnyOfFollowing_Yes,test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_DoYourOperationsInvolveAnyOfFollowing_No(strGI_EQ_CHK_DoYourOperationsInvolveAnyOfFollowing_No),strGI_EQ_CHK_DoYourOperationsInvolveAnyOfFollowing_No,test);
			se.element().checkUncheckOrValidate(getGI_EQ_DoYouGuideBear_Yes(strGI_EQ_DoYouGuideBear_Yes),strGI_EQ_DoYouGuideBear_Yes,test);
			se.element().checkUncheckOrValidate(getGI_EQ_DoYouGuideBear_No(strGI_EQ_DoYouGuideBear_No),strGI_EQ_DoYouGuideBear_No,test);
			se.element().checkUncheckOrValidate(getGI_TentingCropSprayingOrAnyWorkAtAirport_Yes(strGI_TentingCropSprayingOrAnyWorkAtAirport_Yes),strGI_TentingCropSprayingOrAnyWorkAtAirport_Yes,test);
			se.element().checkUncheckOrValidate(getGI_TentingCropSprayingOrAnyWorkAtAirport_No(strGI_TentingCropSprayingOrAnyWorkAtAirport_No),strGI_TentingCropSprayingOrAnyWorkAtAirport_No,test);
			se.element().checkUncheckOrValidate(getGI_EQ_DD_MedicalTherapyOrhealthCareServices_Yes(strGI_EQ_DD_MedicalTherapyOrhealthCareServices_Yes),strGI_EQ_DD_MedicalTherapyOrhealthCareServices_Yes,test);
			se.element().checkUncheckOrValidate(getGI_EQ_DD_MedicalTherapyOrhealthCareServices_No(strGI_EQ_DD_MedicalTherapyOrhealthCareServices_No),strGI_EQ_DD_MedicalTherapyOrhealthCareServices_No,test);
			se.element().checkUncheckOrValidate(getGI_EQ_AreYouOfferingAnyOfTheMixedmartial_Yes(strGI_EQ_AreYouOfferingAnyOfTheMixedmartial_Yes),strGI_EQ_AreYouOfferingAnyOfTheMixedmartial_Yes,test);
			se.element().checkUncheckOrValidate(getGI_EQ_AreYouOfferingAnyOfTheMixedmartial_No(strGI_EQ_AreYouOfferingAnyOfTheMixedmartial_No),strGI_EQ_AreYouOfferingAnyOfTheMixedmartial_No,test);
			se.element().checkUncheckOrValidate(getGI_EQ_AreAnyParticipantsOverTheAgeOf13_Yes(strGI_EQ_AreAnyParticipantsOverTheAgeOf13_Yes),strGI_EQ_AreAnyParticipantsOverTheAgeOf13_Yes,test);
			se.element().checkUncheckOrValidate(getGI_EQ_AreAnyParticipantsOverTheAgeOf13_No(strGI_EQ_AreAnyParticipantsOverTheAgeOf13_No),strGI_EQ_AreAnyParticipantsOverTheAgeOf13_No,test);
			
			
			se.element().checkUncheckOrValidate(getGI_EQ_Willtheinsuredeverbeinvolvedwithenvironmentalorpollutionabatementoperations_Yes(strGI_EQ_Willtheinsuredeverbeinvolvedwithenvironmentalorpollutionabatementoperations_Yes),strGI_EQ_Willtheinsuredeverbeinvolvedwithenvironmentalorpollutionabatementoperations_Yes,test);
			se.element().checkUncheckOrValidate(getGI_EQ_Willtheinsuredeverbeinvolvedwithenvironmentalorpollutionabatementoperations_No(strGI_EQ_Willtheinsuredeverbeinvolvedwithenvironmentalorpollutionabatementoperations_No),strGI_EQ_Willtheinsuredeverbeinvolvedwithenvironmentalorpollutionabatementoperations_No,test);
			se.element().checkUncheckOrValidate(getstrGI_EQ_BTN_Isapplicantinvolvedinleadasbestosandradonmitigationortesting_Yes(strGI_EQ_BTN_Isapplicantinvolvedinleadasbestosandradonmitigationortesting_Yes),strGI_EQ_BTN_Isapplicantinvolvedinleadasbestosandradonmitigationortesting_Yes,test);
			se.element().checkUncheckOrValidate(getGI_EQ_BTN_Isapplicantinvolvedinleadasbestosandradonmitigationortesting_No(strGI_EQ_BTN_Isapplicantinvolvedinleadasbestosandradonmitigationortesting_No),strGI_EQ_BTN_Isapplicantinvolvedinleadasbestosandradonmitigationortesting_No,test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_Isapplicantinvolvedinanybridgecaissoncofferdamdamdikedrydockjettyleveeorpierconstruction_Yes(strGI_EQ_CHK_Isapplicantinvolvedinanybridgecaissoncofferdamdamdikedrydockjettyleveeorpierconstruction_Yes),strGI_EQ_CHK_Isapplicantinvolvedinanybridgecaissoncofferdamdamdikedrydockjettyleveeorpierconstruction_Yes,test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_Isapplicantinvolvedinanybridgecaissoncofferdamdamdikedrydockjettyleveeorpierconstruction_No(strGI_EQ_CHK_Isapplicantinvolvedinanybridgecaissoncofferdamdamdikedrydockjettyleveeorpierconstruction_No),strGI_EQ_CHK_Isapplicantinvolvedinanybridgecaissoncofferdamdamdikedrydockjettyleveeorpierconstruction_No,test);
			se.element().checkUncheckOrValidate(getGI_EQ_Doesapplicantperformanyfireorwaterrestorationwork_Yes(strGI_EQ_Doesapplicantperformanyfireorwaterrestorationwork_Yes),strGI_EQ_Doesapplicantperformanyfireorwaterrestorationwork_Yes,test);
			se.element().checkUncheckOrValidate(getGI_EQ_Doesapplicantperformanyfireorwaterrestorationwork_No(strGI_EQ_Doesapplicantperformanyfireorwaterrestorationwork_No),strGI_EQ_Doesapplicantperformanyfireorwaterrestorationwork_No,test);
			se.element().checkUncheckOrValidate(getGI_EQ_Doesapplicantperformanyalarmorfiresprinklersystemdesignrepair_Yes(strGI_EQ_Doesapplicantperformanyalarmorfiresprinklersystemdesignrepair_Yes),strGI_EQ_Doesapplicantperformanyalarmorfiresprinklersystemdesignrepair_Yes,test);
			se.element().checkUncheckOrValidate(getGI_EQ_Doesapplicantperformanyalarmorfiresprinklersystemdesignrepair_No(strGI_EQ_Doesapplicantperformanyalarmorfiresprinklersystemdesignrepair_No),strGI_EQ_Doesapplicantperformanyalarmorfiresprinklersystemdesignrepair_No,test);
			se.element().checkUncheckOrValidate(getGI_EQ_CLConcpaver_No(strGI_EQ_CLConcpaver_No),strGI_EQ_CLConcpaver_No,test);
			
			se.element().checkUncheckOrValidate(getGI_EQ_AreVehiclesOperatedBeyond200Miles_No(strGI_EQ_AreVehiclesOperatedBeyond200Miles_No),strGI_EQ_AreVehiclesOperatedBeyond200Miles_No,test);
			se.element().checkUncheckOrValidate(getGI_EQ_AreVehiclesOperatedBeyond200Miles_Yes(strGI_EQ_AreVehiclesOperatedBeyond200Miles_Yes),strGI_EQ_AreVehiclesOperatedBeyond200Miles_Yes,test);
			Thread.sleep(10000);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_ApplicantHaveAnyElectricVehicles_Yes(strGI_EQ_CHK_ApplicantHaveAnyElectricVehicles_Yes),strGI_EQ_CHK_ApplicantHaveAnyElectricVehicles_Yes,test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_ApplicantHaveAnyElectricVehicles_No(strGI_EQ_CHK_ApplicantHaveAnyElectricVehicles_No),strGI_EQ_CHK_ApplicantHaveAnyElectricVehicles_No,test);
			
			
			se.element().checkUncheckOrValidate(getGI_EQ_Doesapplicantperformanytrafficsignalwork_Yes(strGI_EQ_Doesapplicantperformanytrafficsignalwork_Yes),strGI_EQ_Doesapplicantperformanytrafficsignalwork_Yes,test);
			se.element().checkUncheckOrValidate(getGI_EQ_Doesapplicantperformanytrafficsignalwork_No(strGI_EQ_Doesapplicantperformanytrafficsignalwork_No),strGI_EQ_Doesapplicantperformanytrafficsignalwork_No,test);
			
			se.element().checkUncheckOrValidate(getGI_EQ_Doestheapplicantdoanyworkinoilfields_No(strGI_EQ_Doestheapplicantdoanyworkinoilfields_No),strGI_EQ_Doestheapplicantdoanyworkinoilfields_No, test);
			se.element().checkUncheckOrValidate(getGI_EQ_Doestheapplicantdoanyworkinoilfields_Yes(strGI_EQ_Doestheapplicantdoanyworkinoilfields_Yes),strGI_EQ_Doestheapplicantdoanyworkinoilfields_Yes, test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_Doestheapplicantperformworkonanynewresidentialconstruction_No(strGI_EQ_CHK_Doestheapplicantperformworkonanynewresidentialconstruction_No),strGI_EQ_CHK_Doestheapplicantperformworkonanynewresidentialconstruction_No,test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_Doestheapplicantperformworkonanynewresidentialconstruction_Yes(strGI_EQ_CHK_Doestheapplicantperformworkonanynewresidentialconstruction_Yes),strGI_EQ_CHK_Doestheapplicantperformworkonanynewresidentialconstruction_Yes,test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_Dohavepastpresentordiscontinued_No(strGI_EQ_CHK_Dohavepastpresentordiscontinued_No),strGI_EQ_CHK_Dohavepastpresentordiscontinued_No,test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_Dohavepastpresentordiscontinued_Yes(strGI_EQ_CHK_Dohavepastpresentordiscontinued_Yes),strGI_EQ_CHK_Dohavepastpresentordiscontinued_Yes,test);
			se.element().checkUncheckOrValidate(getGI_IsPrizeholeyardagelessthan140yards_Yes(strGI_IsPrizeholeyardagelessthan140yards_Yes),strGI_IsPrizeholeyardagelessthan140yards_Yes,test);
			se.element().checkUncheckOrValidate(getGI_IsPrizeholeyardagelessthan140yards_No(strGI_IsPrizeholeyardagelessthan140yards_No),strGI_IsPrizeholeyardagelessthan140yards_No,test);
			se.element().checkUncheckOrValidate(getGI_AreAnyProfessionalGolfersAllowedtoParticipate_Yes(strGI_AreAnyProfessionalGolfersAllowedtoParticipate_Yes),strGI_AreAnyProfessionalGolfersAllowedtoParticipate_Yes,test);
			se.element().checkUncheckOrValidate(getGI_AreAnyProfessionalGolfersAllowedtoParticipate_No(strGI_AreAnyProfessionalGolfersAllowedtoParticipate_No),strGI_AreAnyProfessionalGolfersAllowedtoParticipate_No,test);
			se.element().checkUncheckOrValidate(getGI_Doestheinsuredhiresubcontractors_Yes(strGI_Doestheinsuredhiresubcontractors_Yes),strGI_Doestheinsuredhiresubcontractors_Yes,test);
			se.element().checkUncheckOrValidate(getGI_Doestheinsuredhiresubcontractors_No(strGI_Doestheinsuredhiresubcontractors_No),strGI_Doestheinsuredhiresubcontractors_No,test);
			se.element().checkUncheckOrValidate(getGI_EQ_IsTheMajorityOfTheApplicantOperationConsideredLessorRisk_Yes(strGI_EQ_IsTheMajorityOfTheApplicantOperationConsideredLessorRisk_Yes),strGI_EQ_IsTheMajorityOfTheApplicantOperationConsideredLessorRisk_Yes,test);
			se.element().checkUncheckOrValidate(getGI_EQ_IsTheMajorityOfTheApplicantOperationConsideredLessorRisk_No(strGI_EQ_IsTheMajorityOfTheApplicantOperationConsideredLessorRisk_No),strGI_EQ_IsTheMajorityOfTheApplicantOperationConsideredLessorRisk_No,test);
			
			se.element().enterOrValidateText(getGI_UW_Underwriter(strGI_UW_Underwriter),strGI_UW_Underwriter,test);
			se.element().checkUncheckOrValidate(getGI_EQ_DoesapplicantperformExteriorInsulationFinishingSystemEIFSwork_Yes(strGI_EQ_DoesapplicantperformExteriorInsulationFinishingSystemEIFSwork_Yes),strGI_EQ_DoesapplicantperformExteriorInsulationFinishingSystemEIFSwork_Yes,test);
			se.element().checkUncheckOrValidate(getGI_EQ_DoesapplicantperformExteriorInsulationFinishingSystemEIFSwork_No(strGI_EQ_DoesapplicantperformExteriorInsulationFinishingSystemEIFSwork_No),strGI_EQ_DoesapplicantperformExteriorInsulationFinishingSystemEIFSwork_No,test);
			se.element().checkUncheckOrValidate(getGI_EQ_Doesapplicantpaintbridgestowersortanks_No(strGI_EQ_Doesapplicantpaintbridgestowersortanks_No),strGI_EQ_Doesapplicantpaintbridgestowersortanks_No,test);
			se.element().checkUncheckOrValidate(getGI_EQ_Doesapplicantpaintbridgestowersortanks_Yes(strGI_EQ_Doesapplicantpaintbridgestowersortanks_Yes),strGI_EQ_Doesapplicantpaintbridgestowersortanks_Yes,test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_Min2yearsVerifiableHistory_Yes(strGI_EQ_CHK_Min2yearsVerifiableHistory_Yes) ,strGI_EQ_CHK_Min2yearsVerifiableHistory_Yes,test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_Min2yearsVerifiableHistory_No(strGI_EQ_CHK_Min2yearsVerifiableHistory_No) ,strGI_EQ_CHK_Min2yearsVerifiableHistory_No,test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_Morethan1FullTimeOtherthanOwner_Yes(strGI_EQ_CHK_Morethan1FullTimeOtherthanOwner_Yes),strGI_EQ_CHK_Morethan1FullTimeOtherthanOwner_Yes,test);
			if(!strGI_AccClearanceOverride_CHK_AccClrOverride.equalsIgnoreCase("N/A")){
				se.element().checkUncheckOrValidate(getGI_AccClearanceOverride_CHK_AccClrOverride (strGI_AccClearanceOverride_CHK_AccClrOverride),strGI_AccClearanceOverride_CHK_AccClrOverride,test);
			}	
			se.element().checkUncheckOrValidate(getGI_DoestheApplSubcontractMore35_Yes(strGI_DoestheApplSubcontractMore35_Yes),strGI_DoestheApplSubcontractMore35_Yes,test);
				se.element().checkUncheckOrValidate(getGI_DoestheApplSubcontractMore35_No(strGI_DoestheApplSubcontractMore35_No),strGI_DoestheApplSubcontractMore35_No,test);
				
				se.element().checkUncheckOrValidate(getGI_EQ_HaveYouhadMoreThanOneClaim_last3years_Yes(strGI_EQ_HaveYouhadMoreThanOneClaim_last3years_Yes),strGI_EQ_HaveYouhadMoreThanOneClaim_last3years_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_HaveYouhadMoreThanOneClaim_last3years_No(strGI_EQ_HaveYouhadMoreThanOneClaim_last3years_No),strGI_EQ_HaveYouhadMoreThanOneClaim_last3years_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_HaveYouhadClaimsPaid_greaterThan5000_Yes(strGI_EQ_HaveYouhadClaimsPaid_greaterThan5000_Yes),strGI_EQ_HaveYouhadClaimsPaid_greaterThan5000_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_HaveYouhadClaimsPaid_greaterThan5000_No(strGI_EQ_HaveYouhadClaimsPaid_greaterThan5000_No),strGI_EQ_HaveYouhadClaimsPaid_greaterThan5000_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_DoesYourOperationsInvolveanyofthefollowing_Landclearing_Yes(strGI_EQ_DoesYourOperationsInvolveanyofthefollowing_Landclearing_Yes),strGI_EQ_DoesYourOperationsInvolveanyofthefollowing_Landclearing_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_DoesYourOperationsInvolveanyofthefollowing_Landclearing_No(strGI_EQ_DoesYourOperationsInvolveanyofthefollowing_Landclearing_No),strGI_EQ_DoesYourOperationsInvolveanyofthefollowing_Landclearing_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_DoesYourOperationsInvolveanyofthefollowing_AgricultureCrop_Yes(strGI_EQ_DoesYourOperationsInvolveanyofthefollowing_AgricultureCrop_Yes),strGI_EQ_DoesYourOperationsInvolveanyofthefollowing_AgricultureCrop_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_DoesYourOperationsInvolveanyofthefollowing_AgricultureCrop_No(strGI_EQ_DoesYourOperationsInvolveanyofthefollowing_AgricultureCrop_No),strGI_EQ_DoesYourOperationsInvolveanyofthefollowing_AgricultureCrop_No,test);
				se.util().sleep(3000);
				se.element().enterOrValidateText(getGI_NatOfBusi_TXT_EventDes(strGI_NatOfBusi_TXT_EventDes), strGI_NatOfBusi_TXT_EventDes, test);
				
				if(strGI_SupportingLines_Areyousubmittingadditionallinesofbusiness_Yes.equals("Check")) {
					se.element().checkUncheckOrValidate(getGI_SupportingLines_Areyousubmittingadditionallinesofbusiness_Yes(strGI_SupportingLines_Areyousubmittingadditionallinesofbusiness_Yes),strGI_SupportingLines_Areyousubmittingadditionallinesofbusiness_Yes,test);
					se.element().checkUncheckOrValidate(getGI_SupportingLines_ExpiringFullTermPackagePremiumexceeds5000_Yes(strGI_SupportingLines_ExpiringFullTermPackagePremiumexceeds5000_Yes),strGI_SupportingLines_ExpiringFullTermPackagePremiumexceeds5000_Yes,test);
					se.element().checkUncheckOrValidate(getGI_SupportingLines_ExpiringFullTermPackagePremiumexceeds5000_No(strGI_SupportingLines_ExpiringFullTermPackagePremiumexceeds5000_No),strGI_SupportingLines_ExpiringFullTermPackagePremiumexceeds5000_No,test);
					se.element().checkUncheckOrValidate(getGI_SupportingLines_CHK_WorkersCompensation(strGI_SupportingLines_CHK_WorkersCompensation),strGI_SupportingLines_CHK_WorkersCompensation,test);
					se.element().checkUncheckOrValidate(getGI_SupportingLines_CHK_CommercialAuto(strGI_SupportingLines_CHK_CommercialAuto),strGI_SupportingLines_CHK_CommercialAuto,test);
					se.element().checkUncheckOrValidate(getGI_SupportingLines_CHK_Umbrella(strGI_SupportingLines_CHK_Umbrella),strGI_SupportingLines_CHK_Umbrella,test);		
					
				}
				
				
				se.element().checkUncheckOrValidate(getGI_SupportingLines_Areyousubmittingadditionallinesofbusiness_No(strGI_SupportingLines_Areyousubmittingadditionallinesofbusiness_No),strGI_SupportingLines_Areyousubmittingadditionallinesofbusiness_No,test);
				se.element().chkElement(getGI_Radio_SupportingLineExistingPolicy(strGI_Radio_SupportingLineExistingPolicy), strGI_Radio_SupportingLineExistingPolicy,test);
				
				/*
				if(strGI_Radio_SupportingLineAdditionalLines.equals("YES")) {
					se.element().chkElement(getGI_Radio_SupportingLineAdditionalLines(strGI_Radio_SupportingLineAdditionalLines), strGI_Radio_SupportingLineAdditionalLines,test);					
					se.element().chkElement(getGI_Radio_ExpiringFullTermCPP(strGI_Radio_ExpiringFullTermCPP), strGI_Radio_ExpiringFullTermCPP,test);
					se.element().checkUncheckOrValidate(getGI_SupportingLines_ExpiringFullTermPackagePremiumexceeds5000_Yes(strGI_SupportingLines_ExpiringFullTermPackagePremiumexceeds5000_Yes),strGI_SupportingLines_ExpiringFullTermPackagePremiumexceeds5000_Yes,test);
					se.element().checkUncheckOrValidate(getGI_SupportingLines_ExpiringFullTermPackagePremiumexceeds5000_No(strGI_SupportingLines_ExpiringFullTermPackagePremiumexceeds5000_No),strGI_SupportingLines_ExpiringFullTermPackagePremiumexceeds5000_No,test);
					se.element().checkUncheckOrValidate(getGI_SupportingLines_CHK_WorkersCompensation(strGI_SupportingLines_CHK_WorkersCompensation),strGI_SupportingLines_CHK_WorkersCompensation,test);				
					se.element().chkElement(getGI_Radio_SupportingLineExistingPolicy(strGI_Radio_SupportingLineExistingPolicy), strGI_Radio_SupportingLineExistingPolicy,test);
					
				}
				
				*/
				
				
				se.element().checkUncheckOrValidate(getGI_EQ_DoYouProvideGuidingService_Yes(strGI_EQ_DoYouProvideGuidingService_Yes),strGI_EQ_DoYouProvideGuidingService_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_DoYouProvideGuidingService_No(strGI_EQ_DoYouProvideGuidingService_No),strGI_EQ_DoYouProvideGuidingService_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_CHK_Anyindustrialorhighpressureboiler_No(strGI_EQ_CHK_Anyindustrialorhighpressureboiler_No),strGI_EQ_CHK_Anyindustrialorhighpressureboiler_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_CHK_Anyindustrialorhighpressureboiler_Yes(strGI_EQ_CHK_Anyindustrialorhighpressureboiler_Yes),strGI_EQ_CHK_Anyindustrialorhighpressureboiler_Yes,test);
				
				se.element().checkUncheckOrValidate(getGI_Isprizevalueover_50000_No(strGI_Isprizevalueover_50000_No),strGI_Isprizevalueover_50000_No,test);
				se.element().checkUncheckOrValidate(getGI_Isprizevalueover_50000_Yes(strGI_Isprizevalueover_50000_Yes),strGI_Isprizevalueover_50000_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_CHK_VehOperatedbeyond200Miles_Yes(strGI_EQ_CHK_VehOperatedbeyond200Miles_Yes),strGI_EQ_CHK_VehOperatedbeyond200Miles_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_CHK_VehOperatedbeyond200Miles_No(strGI_EQ_CHK_VehOperatedbeyond200Miles_No),strGI_EQ_CHK_VehOperatedbeyond200Miles_No,test);
				
				se.element().checkUncheckOrValidate(getGI_EQ_StoragePollutantsFlamWaste_Yes(strGI_EQ_StoragePollutantsFlamWaste_Yes),strGI_EQ_StoragePollutantsFlamWaste_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_StoragePollutantsFlamWaste_No(strGI_EQ_StoragePollutantsFlamWaste_No),strGI_EQ_StoragePollutantsFlamWaste_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_BldgMoreThan2Stories_Yes(strGI_EQ_BldgMoreThan2Stories_Yes),strGI_EQ_BldgMoreThan2Stories_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_BldgMoreThan2Stories_No(strGI_EQ_BldgMoreThan2Stories_No),strGI_EQ_BldgMoreThan2Stories_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_PropertiesOwnedByOthers_Yes(strGI_EQ_PropertiesOwnedByOthers_Yes),strGI_EQ_PropertiesOwnedByOthers_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_PropertiesOwnedByOthers_No(strGI_EQ_PropertiesOwnedByOthers_No),strGI_EQ_PropertiesOwnedByOthers_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_GreenhousePropertyCoverage_Yes(strGI_EQ_GreenhousePropertyCoverage_Yes),strGI_EQ_GreenhousePropertyCoverage_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_GreenhousePropertyCoverage_No(strGI_EQ_GreenhousePropertyCoverage_No),strGI_EQ_GreenhousePropertyCoverage_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_Minimum2YearOfHistory_Yes(strGI_EQ_Minimum2YearOfHistory_Yes),strGI_EQ_Minimum2YearOfHistory_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_Minimum2YearOfHistory_No(strGI_EQ_Minimum2YearOfHistory_No),strGI_EQ_Minimum2YearOfHistory_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_FullTimeEmployee_Yes(strGI_EQ_FullTimeEmployee_Yes),strGI_EQ_FullTimeEmployee_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_FullTimeEmployee_No(strGI_EQ_FullTimeEmployee_No),strGI_EQ_FullTimeEmployee_No,test);
				
				se.element().checkUncheckOrValidate(getGI_EQ_AreThereSalesOrBreeding_Yes(strGI_EQ_AreThereSalesOrBreeding_Yes),strGI_EQ_AreThereSalesOrBreeding_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_AreThereSalesOrBreeding_No(strGI_EQ_AreThereSalesOrBreeding_No),strGI_EQ_AreThereSalesOrBreeding_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_AreThereSalesOrTrainingofGuardDogs_Yes(strGI_EQ_AreThereSalesOrTrainingofGuardDogs_Yes),strGI_EQ_AreThereSalesOrTrainingofGuardDogs_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_AreThereSalesOrTrainingofGuardDogs_No(strGI_EQ_AreThereSalesOrTrainingofGuardDogs_No),strGI_EQ_AreThereSalesOrTrainingofGuardDogs_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_DoSalesfromRentalsAccountMorethan20_Yes(strGI_EQ_DoSalesfromRentalsAccountMorethan20_Yes),strGI_EQ_DoSalesfromRentalsAccountMorethan20_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_DoSalesfromRentalsAccountMorethan20_No(strGI_EQ_DoSalesfromRentalsAccountMorethan20_No),strGI_EQ_DoSalesfromRentalsAccountMorethan20_No,test);
				
				se.element().checkUncheckOrValidate(getGI_EQ_DoesTheInsuredSellSwimmingPools_Yes(strGI_EQ_DoesTheInsuredSellSwimmingPools_Yes),strGI_EQ_DoesTheInsuredSellSwimmingPools_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_DoesTheInsuredSellSwimmingPools_No(strGI_EQ_DoesTheInsuredSellSwimmingPools_No),strGI_EQ_DoesTheInsuredSellSwimmingPools_No,test);
				se.util().sleep(2000);
				se.element().checkUncheckOrValidate(getGI_EQ_DoesTheApplicantUseDeepFryer_Yes(strGI_EQ_DoesTheApplicantUseDeepFryer_Yes),strGI_EQ_DoesTheApplicantUseDeepFryer_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_DoesTheApplicantUseDeepFryer_No(strGI_EQ_DoesTheApplicantUseDeepFryer_No),strGI_EQ_DoesTheApplicantUseDeepFryer_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_IsFireProtectionSystemInstalled_Yes(strGI_EQ_IsFireProtectionSystemInstalled_Yes),strGI_EQ_IsFireProtectionSystemInstalled_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_IsFireProtectionSystemInstalled_No(strGI_EQ_IsFireProtectionSystemInstalled_No),strGI_EQ_IsFireProtectionSystemInstalled_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_DoesTheApplicantSellAlcoholOrTobacco_Yes(strGI_EQ_DoesTheApplicantSellAlcoholOrTobacco_Yes),strGI_EQ_DoesTheApplicantSellAlcoholOrTobacco_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_DoesTheApplicantSellAlcoholOrTobacco_No(strGI_EQ_DoesTheApplicantSellAlcoholOrTobacco_No),strGI_EQ_DoesTheApplicantSellAlcoholOrTobacco_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_IsTheFoodTruckNotOperatingFromParkedLocation_Yes(strGI_EQ_IsTheFoodTruckNotOperatingFromParkedLocation_Yes),strGI_EQ_IsTheFoodTruckNotOperatingFromParkedLocation_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_IsTheFoodTruckNotOperatingFromParkedLocation_No(strGI_EQ_IsTheFoodTruckNotOperatingFromParkedLocation_No),strGI_EQ_IsTheFoodTruckNotOperatingFromParkedLocation_No,test);
				
				
				se.element().checkUncheckOrValidate(getGI_EQ_3YRLiabilityClaimHistory_Yes(strGI_EQ_3YRLiabilityClaimHistory_Yes),strGI_EQ_3YRLiabilityClaimHistory_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_3YRLiabilityClaimHistory_No(strGI_EQ_3YRLiabilityClaimHistory_No),strGI_EQ_3YRLiabilityClaimHistory_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_3YRPropertyHistory_Yes(strGI_EQ_3YRPropertyHistory_Yes),strGI_EQ_3YRPropertyHistory_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_3YRPropertyHistory_No(strGI_EQ_3YRPropertyHistory_No),strGI_EQ_3YRPropertyHistory_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_3YROtherHistory_Yes(strGI_EQ_3YROtherHistory_Yes),strGI_EQ_3YROtherHistory_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_3YROtherHistory_No(strGI_EQ_3YROtherHistory_No),strGI_EQ_3YROtherHistory_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_3YRAutoLiabilityHistory_Yes(strGI_EQ_3YRAutoLiabilityHistory_Yes),strGI_EQ_3YRAutoLiabilityHistory_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_3YRAutoLiabilityHistory_No(strGI_EQ_3YRAutoLiabilityHistory_No),strGI_EQ_3YRAutoLiabilityHistory_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_3YRPhysicalDamageHistory_Yes(strGI_EQ_3YRPhysicalDamageHistory_Yes),strGI_EQ_3YRPhysicalDamageHistory_Yes,test);

				se.element().checkUncheckOrValidate(getGI_EQ_3YRPhysicalDamageHistory_No(strGI_EQ_3YRPhysicalDamageHistory_No),strGI_EQ_3YRPhysicalDamageHistory_No,test);

				se.element().checkUncheckOrValidate(getGI_EQ_OfferMixedMartialArtsHockey_Yes(strGI_EQ_OfferMixedMartialArtsHockey_Yes),strGI_EQ_OfferMixedMartialArtsHockey_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_OfferMixedMartialArtsHockey_No(strGI_EQ_OfferMixedMartialArtsHockey_No),strGI_EQ_OfferMixedMartialArtsHockey_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_SpaServices_Yes(strGI_EQ_SpaServices_Yes),strGI_EQ_SpaServices_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_SpaServices_No(strGI_EQ_SpaServices_No),strGI_EQ_SpaServices_No,test);
				
				se.element().checkUncheckOrValidate(getGI_EQ_IndependentContractor_Yes(strGI_EQ_IndependentContractor_Yes),strGI_EQ_IndependentContractor_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_IndependentContractor_No(strGI_EQ_IndependentContractor_No),strGI_EQ_IndependentContractor_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_OperationYears_Yes(strGI_EQ_OperationYears_Yes),strGI_EQ_OperationYears_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_OperationYears_No(strGI_EQ_OperationYears_No),strGI_EQ_OperationYears_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_TattooServices_Yes(strGI_EQ_TattooServices_Yes),strGI_EQ_TattooServices_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_TattooServices_No(strGI_EQ_TattooServices_No),strGI_EQ_TattooServices_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_BodyPiercing_Yes(strGI_EQ_BodyPiercing_Yes),strGI_EQ_BodyPiercing_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_BodyPiercing_No(strGI_EQ_BodyPiercing_No),strGI_EQ_BodyPiercing_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_ChildCarePrivate_Yes(strGI_EQ_ChildCarePrivate_Yes),strGI_EQ_ChildCarePrivate_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_ChildCarePrivate_No(strGI_EQ_ChildCarePrivate_No),strGI_EQ_ChildCarePrivate_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_AppropriateStateLicense_Yes(strGI_EQ_AppropriateStateLicense_Yes),strGI_EQ_AppropriateStateLicense_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_AppropriateStateLicense_No(strGI_EQ_AppropriateStateLicense_No),strGI_EQ_AppropriateStateLicense_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_AccreditedSchool_Yes(strGI_EQ_AccreditedSchool_Yes),strGI_EQ_AccreditedSchool_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_AccreditedSchool_No(strGI_EQ_AccreditedSchool_No),strGI_EQ_AccreditedSchool_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_CharterSchool_Yes(strGI_EQ_CharterSchool_Yes),strGI_EQ_CharterSchool_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_CharterSchool_No(strGI_EQ_CharterSchool_No),strGI_EQ_CharterSchool_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_OvernightServices_Yes(strGI_EQ_OvernightServices_Yes),strGI_EQ_OvernightServices_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_OvernightServices_No(strGI_EQ_OvernightServices_No),strGI_EQ_OvernightServices_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_NannyServices_Yes(strGI_EQ_NannyServices_Yes),strGI_EQ_NannyServices_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_NannyServices_No(strGI_EQ_NannyServices_No),strGI_EQ_NannyServices_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_ChildrenNursingNeeds_Yes(strGI_EQ_ChildrenNursingNeeds_Yes),strGI_EQ_ChildrenNursingNeeds_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_ChildrenNursingNeeds_No(strGI_EQ_ChildrenNursingNeeds_No),strGI_EQ_ChildrenNursingNeeds_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_Microblading10_Yes(strGI_EQ_Microblading10_Yes),strGI_EQ_Microblading10_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_Microblading10_No(strGI_EQ_Microblading10_No),strGI_EQ_Microblading10_No,test);
				
				se.element().checkUncheckOrValidate(getGI_EQ_SecurityServiceQuestion_Yes(strGI_EQ_SecurityServiceQuestion_Yes),strGI_EQ_SecurityServiceQuestion_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_SecurityServiceQuestion_No(strGI_EQ_SecurityServiceQuestion_No),strGI_EQ_SecurityServiceQuestion_No,test);


				se.element().checkUncheckOrValidate(getGI_EQ_DoesapplicantperformanyofthefollowingInterior_Yes(strGI_EQ_DoesapplicantperformanyofthefollowingInterior_Yes),strGI_EQ_DoesapplicantperformanyofthefollowingInterior_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_DoesapplicantperformanyofthefollowingInterior_No(strGI_EQ_DoesapplicantperformanyofthefollowingInterior_No),strGI_EQ_DoesapplicantperformanyofthefollowingInterior_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_Arespectatorsallowed_Yes(strGI_EQ_Arespectatorsallowed_Yes),strGI_EQ_Arespectatorsallowed_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_Arespectatorsallowed_No(strGI_EQ_Arespectatorsallowed_No),strGI_EQ_Arespectatorsallowed_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_CLPestHerb_Yes(strGI_EQ_CLPestHerb_Yes),strGI_EQ_CLPestHerb_Yes,test);
				se.element().checkUncheckOrValidate(getGI_EQ_CLPestHerb_No(strGI_EQ_CLPestHerb_No),strGI_EQ_CLPestHerb_No,test);
				
				se.element().checkUncheckOrValidate(getUW_RBTN_GuideTreeStands_No(strUW_RBTN_GuideTreeStands_No),strUW_RBTN_GuideTreeStands_No,test);
				se.element().checkUncheckOrValidate(getUW_RBTN_GuideTreeStands_Yes(strUW_RBTN_GuideTreeStands_Yes),strUW_RBTN_GuideTreeStands_Yes,test);
				
				
				se.element().checkUncheckOrValidate(getGI_EQ_BunkedCribs_No(strGI_EQ_BunkedCribs_No),strGI_EQ_BunkedCribs_No,test);
				se.element().checkUncheckOrValidate(getGI_EQ_BunkedCribs_Yes(strGI_EQ_BunkedCribs_Yes),strGI_EQ_BunkedCribs_Yes,test);
				
				
				if(!strUW_TXT_TerritoryUnderwriter.equals("N/A")) {
					se.element().Click(getUW_BTN_TerritoryUnderwriter(), test);
					se.element().enterOrValidateText(getUW_TXT_TerritoryUnderwriter(strUW_TXT_TerritoryUnderwriter),strUW_TXT_TerritoryUnderwriter,test);
					
				}
				
				
			/*se.element().checkUncheckOrValidate(getGI_EQ_DD_AreThereAnyDomeStruct_Yes(strGI_EQ_DD_AreThereAnyDomeStruct_Yes),strGI_EQ_DD_AreThereAnyDomeStruct_Yes,test);
			se.element().checkUncheckOrValidate(getGI_EQ_DD_AreThereAnyDomeStruct_No(strGI_EQ_DD_AreThereAnyDomeStruct_No),strGI_EQ_DD_AreThereAnyDomeStruct_No,test);
			se.element().checkUncheckOrValidate(getGI_DoYouDisconnectPowerLines_Yes(strGI_DoYouDisconnectPowerLines_Yes),strGI_DoYouDisconnectPowerLines_Yes,test);
			se.element().checkUncheckOrValidate(getGI_DoYouDisconnectPowerLines_No(strGI_DoYouDisconnectPowerLines_No),strGI_DoYouDisconnectPowerLines_No,test);
			se.element().checkUncheckOrValidate(getGI_EQ_DD_PastOrCurrentAbuseClaims_Yes(strGI_EQ_DD_PastOrCurrentAbuseClaims_Yes),strGI_EQ_DD_PastOrCurrentAbuseClaims_Yes,test);
			se.element().checkUncheckOrValidate(getGI_EQ_DD_PastOrCurrentAbuseClaims_No(strGI_EQ_DD_PastOrCurrentAbuseClaims_No),strGI_EQ_DD_PastOrCurrentAbuseClaims_No,test);
			se.element().checkUncheckOrValidate(getGI_EQ_DoestheapplicantactasAFramingonlycontractor_Yes(strGI_EQ_DoestheapplicantactasAFramingonlycontractor_Yes),strGI_EQ_DoestheapplicantactasAFramingonlycontractor_Yes,test);
			se.element().checkUncheckOrValidate(getGI_EQ_DoestheapplicantactasAFramingonlycontractor_No(strGI_EQ_DoestheapplicantactasAFramingonlycontractor_No),strGI_EQ_DoestheapplicantactasAFramingonlycontractor_No,test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_Pollution_abatement_operations_Yes(strGI_EQ_CHK_Pollution_abatement_operations_Yes),strGI_EQ_CHK_Pollution_abatement_operations_Yes,test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_Pollution_abatement_operations_No(strGI_EQ_CHK_Pollution_abatement_operations_No),strGI_EQ_CHK_Pollution_abatement_operations_No,test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_Isapplicantinvolvedinanysignificantwoodworkingmanufacturingorprocessing_Yes(strGI_EQ_CHK_Isapplicantinvolvedinanysignificantwoodworkingmanufacturingorprocessing_Yes),strGI_EQ_CHK_Isapplicantinvolvedinanysignificantwoodworkingmanufacturingorprocessing_Yes,test);
			se.element().checkUncheckOrValidate(getGI_EQ_CHK_Isapplicantinvolvedinanysignificantwoodworkingmanufacturingorprocessing_No(strGI_EQ_CHK_Isapplicantinvolvedinanysignificantwoodworkingmanufacturingorprocessing_No),strGI_EQ_CHK_Isapplicantinvolvedinanysignificantwoodworkingmanufacturingorprocessing_No,test);
			se.element().checkUncheckOrValidate(getGI_EQ_Doesapplicantinstallorserviceoverheaddoors_Yes(strGI_EQ_Doesapplicantinstallorserviceoverheaddoors_Yes),strGI_EQ_Doesapplicantinstallorserviceoverheaddoors_Yes,test);
			se.element().checkUncheckOrValidate(getGI_EQ_Doesapplicantinstallorserviceoverheaddoors_No(strGI_EQ_Doesapplicantinstallorserviceoverheaddoors_No),strGI_EQ_Doesapplicantinstallorserviceoverheaddoors_No,test);
			se.element().enterOrValidateText(getGI_EQ_Percent_of_subcontractor_costs(strGI_EQ_Percent_of_subcontractor_costs),strGI_EQ_Percent_of_subcontractor_costs,test);
			se.element().selectElementDDrOrValidateText(getGI_EQ_Are_subcontractors_allowed_toworkwithoutproviding_theinsuredwitha_certificateofinsurance(strGI_EQ_Are_subcontractors_allowed_to_work_without_providing_the_insured_with_a_certificate_of_insurance),strGI_EQ_Are_subcontractors_allowed_to_work_without_providing_the_insured_with_a_certificate_of_insurance,test);
			se.element().selectElementDDrOrValidateText(getGI_EQ_Do_subcontractors_carry_coverage_or_limits_less_than_the_insureds(strGI_EQ_Do_subcontractors_carry_coverage_or_limits_less_than_the_insureds),strGI_EQ_Do_subcontractors_carry_coverage_or_limits_less_than_the_insureds,test);
			se.element().checkUncheckOrValidate(getGI_EQ_Doyoudoanystreetcleaningsnowplowing_Yes(strGI_EQ_Doyoudoanystreetcleaningsnowplowing_Yes),strGI_EQ_Doyoudoanystreetcleaningsnowplowing_Yes,test);
			se.element().checkUncheckOrValidate(getGI_EQ_Doyoudoanystreetcleaningsnowplowing_No(strGI_EQ_Doyoudoanystreetcleaningsnowplowing_No),strGI_EQ_Doyoudoanystreetcleaningsnowplowing_No,test);
			se.element().checkUncheckOrValidate(getGI_EQ_Aresubcontractorsallowedtoworkwithoutprovidingtheinsuredwithacertificateofinsurance_Yes(strGI_EQ_Aresubcontractorsallowedtoworkwithoutprovidingtheinsuredwithacertificateofinsurance_Yes),strGI_EQ_Aresubcontractorsallowedtoworkwithoutprovidingtheinsuredwithacertificateofinsurance_Yes,test);
			se.element().checkUncheckOrValidate(getGI_EQ_Aresubcontractorsallowedtoworkwithoutprovidingtheinsuredwithacertificateofinsurance_No(strGI_EQ_Aresubcontractorsallowedtoworkwithoutprovidingtheinsuredwithacertificateofinsurance_No),strGI_EQ_Aresubcontractorsallowedtoworkwithoutprovidingtheinsuredwithacertificateofinsurance_No,test);
			se.element().checkUncheckOrValidate(getGI_EQ_Dosubcontractorscarrycoverageorlimitslessthantheinsured_No(strGI_EQ_Dosubcontractorscarrycoverageorlimitslessthantheinsured_No),strGI_EQ_Dosubcontractorscarrycoverageorlimitslessthantheinsured_No,test);
			se.element().checkUncheckOrValidate(getGI_EQ_Dosubcontractorscarrycoverageorlimitslessthantheinsured_Yes(strGI_EQ_Dosubcontractorscarrycoverageorlimitslessthantheinsured_Yes),strGI_EQ_Dosubcontractorscarrycoverageorlimitslessthantheinsured_Yes,test);
			se.element().checkUncheckOrValidate(getGI_EQ_Doestheinsuredownorusedtoownanypitsorlagoonsthatwereusedforwastedisposal_Yes(strGI_EQ_Doestheinsuredownorusedtoownanypitsorlagoonsthatwereusedforwastedisposal_Yes),strGI_EQ_Doestheinsuredownorusedtoownanypitsorlagoonsthatwereusedforwastedisposal_Yes,test);
			se.element().checkUncheckOrValidate(getGI_EQ_Doestheinsuredownorusedtoownanypitsorlagoonsthatwereusedforwastedisposal_No(strGI_EQ_Doestheinsuredownorusedtoownanypitsorlagoonsthatwereusedforwastedisposal_No),strGI_EQ_Doestheinsuredownorusedtoownanypitsorlagoonsthatwereusedforwastedisposal_No,test);
				se.element().selectElementDDrOrValidateText(getGI_EQ_Does_the_applicant_act_as_a_Framing_only_contractor(strGI_EQ_Does_the_applicant_act_as_a_Framing_only_contractor),strGI_EQ_Does_the_applicant_act_as_a_Framing_only_contractor,test);
		se.element().selectElementDDrOrValidateText(getGI_EQ_Does_applicant_install_or_service_overhead_doors(strGI_EQ_Does_applicant_install_or_service_overhead_doors),strGI_EQ_Does_applicant_install_or_service_overhead_doors,test);
		se.element().selectElementDDrOrValidateText(getGI_EQ_Does_applicant_perform_any_fire_or_water_restoration_work(strGI_EQ_Does_applicant_perform_any_fire_or_water_restoration_work),strGI_EQ_Does_applicant_perform_any_fire_or_water_restoration_work,test);
		se.element().selectElementDDrOrValidateText(getGI_EQ_Does_applicant_perform_Street_Road_Highway_Interstate_work(strGI_EQ_Does_applicant_perform_Street_Road_Highway_Interstate_work),strGI_EQ_Does_applicant_perform_Street_Road_Highway_Interstate_work,test);
		se.element().selectElementDDrOrValidateText(getGI_EQ_Does_applicant_perform_any_traffic_signal_work(strGI_EQ_Does_applicant_perform_any_traffic_signal_work),strGI_EQ_Does_applicant_perform_any_traffic_signal_work,test);
		*/
			
		}catch(Exception e){
			e.getMessage();
			e.printStackTrace();
		}
	}
	
	
}
