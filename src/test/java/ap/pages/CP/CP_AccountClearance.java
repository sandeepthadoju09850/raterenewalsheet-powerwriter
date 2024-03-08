package ap.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.ap.automation.common.ExcelOperations;
import Libraries.ap.automation.common.SystemPropertyUtil;
import Libraries.ap.automation.common.Utils.TestPageFactory;
import Libraries.ap.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.OR_CP;
import ap.pages.common.APPW_CommonMethods;
import ap.pages.common.AP_Login;

public class CP_AccountClearance extends OR_CP {
	public  ExtentTest test;
	public void CP_AccountClearance_Details(String strRegressionID, String transaction,String suspendSheet,String strAgentLink, String strLOB,String strRelease_SelectRelease,String strRole_SelectRoleAs , ExtentTest test) throws IOException
	{
		String IsAccountClearance  ="";
		try{
			if(suspendSheet.equalsIgnoreCase(constants.Account_Clearance)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Account_Clearance, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strAccountClearance_DD_Status = (String) row.get("AccountClearance_DD_Status");
			String strAccountClearance_CHK_UWDecline= (String) row.get("AccountClearance_CHK_UWDecline");
			String strAccountClearance_label_status= (String) row.get("AccountClearance_label_status");
			String strIsAccountClearance= (String) row.get("IsAccountClearance");
			IsAccountClearance = strIsAccountClearance;
			String strSecura_TXT_Email = (String) row.get("Secura_TXT_Email");
			String strSecura_TXT_Password = (String) row.get("Secura_TXT_Password");
			
			APPW_CommonMethods APPW_CommonMethods=TestPageFactory.initElements(se, APPW_CommonMethods.class); 
			try {
				if(strIsAccountClearance.equalsIgnoreCase("Yes")){
				se.log().logTestStep("CP_AccountClearance");
				test.log(LogStatus.INFO, "CP_AccountClearance","Transaction Step : "+transaction + "<br>" +"Page : CP_AccountClearance");
				se.verify().verifyEquals("CP_AccountClearance  of AgencyPortal ", getAccountClearance_label().isDisplayed(),true, true,test);
				String ApplicantName=getApplicantName();
				AP_Login  LoginPage = TestPageFactory.initElements(se, AP_Login.class);	
				String Status = se.element().getSelectedText(AccountClearance_label_status);
				if (strAgentLink.equals("Yes") && Status.contains("Clearance "))
				{
					se.element().enterOrValidateText(getAccountClearance_label_status(strAccountClearance_label_status),strAccountClearance_label_status,test);
					LoginPage.APLogoutDetails("Yes", test);
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
					openquote(ApplicantName,strRegressionID,test);
					se.util().sleep(3000);
				}
					if(se.element().isElementPresent(getgeninfo_lightbox_AC()))
					{
					/*se.element().waitForElementToDisappear_One(geninfo_lightbox_account,120);
					se.element().waitForElementToDisappear_One(geninfo_lightbox_account_save,120);
					se.element().Click(getGenInfoLightboxAccount());// ADDED FOR INSIDE/OUTSIDE ACCOUNT
					se.util().sleep(3000);
					se.element().Click(getGenInfoLightboxAccountSave());// ADDED FOR INSIDE/OUTSIDE ACCOUNT
					se.util().sleep(2000);
					se.element().Click(getBtnContinue());*/
						se.element().Click(getGenInfoLightboxClose(), test);
						se.driver().switchTo().activeElement();
						se.util().sleep(3000);
						se.element().SelectElement(AccountClearance_DD_Status, strAccountClearance_DD_Status,test);
						se.element().checkUncheckOrValidate(getAccountClearance_CHK_UWDecline(strAccountClearance_CHK_UWDecline),strAccountClearance_CHK_UWDecline,test);
						se.element().waitForElementToAppear_One(" ",GI_CHK_Continue, 90);
						se.element().Click(getGI_CHK_Continue(), test);
						}
					se.util().sleep(5000);
					String QuoteNumber = APPW_CommonMethods.getQuoteNumber(strRegressionID,test);
					se.verify().verifyEquals("Generate Account or quote number", !QuoteNumber.isEmpty(), true, true, test);
					if(se.element().isElementPresent(BTN_OverrideEligibility))
						{
							se.util().sleep(2000);
							se.element().Click(getBTN_OverrideEligibility(), test);
							se.util().sleep(2000);
						}
					if (strAgentLink.equals("Yes") && Status.contains("Clearance "))
						{
						se.element().Click(getMyWork(), test); // -navigate to mywork before logging in as an external user
						se.util().sleep(1000);
						if(strRegressionID.equals("SL_17")) {
						LoginPage.APLogoutDetails("Yes", test);
						}
						LoginPage.APAppLogin(strRegressionID,   transaction,"No", test);
						se.element().Click(getMyWork(), test);
						se.util().sleep(2000);
						se.element().Click(getclick_view(), test);
						se.element().Click(getdropdown_MoreOptions(), test);
						se.element().enterText(gettxt_quoteOrPolicyNumber(),QuoteNumber); 
						se.element().Click(getcommon_searchBtn(), test);
						se.util().sleep(3000);
						se.element().Click(getCardHeader(), test);
						se.util().sleep(2000);
						se.element().Click(getBtneventWorkItemAction_Open(), test);
						}
					if(se.element().isElementPresent(BTN_OverrideEligibility))
						{
						se.util().sleep(2000);
						se.element().Click(getBTN_OverrideEligibility(), test);
						}
					if(IsAccountClearance.equalsIgnoreCase("Yes") && strRegressionID.equals("SL_11")){
						se.util().sleep(3000);
						se.element().SelectElement(AccountClearance_DD_Status, strAccountClearance_DD_Status,test);
						se.element().Click(getContinue_Button(), test);
					}
			
				}
				}
			catch(Exception e){
				se.verify().verifyEquals("Failed to fill in details for CP_AccountClearance ", true, false, true, test);
				e.printStackTrace();
				e.getMessage();
			}
			iteration++;
		}
		if(IsAccountClearance.equalsIgnoreCase("Yes")){
		if(se.element().isElementPresent(GI_AgencyInformationSection_label)){
			se.util().sleep(5000);
			se.element().Click(getContinue_Button(), test);
		}
		if(se.element().isElementPresent(AccountClearance_label)){
			se.util().sleep(3000);
			se.element().Click(getContinue_Button(), test);
		}
		
		
		}
	}catch (Exception e) {
		
		se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
		test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
		testTearDown(se, test);
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
	public String getApplicantName( )
	{
		String jobTitle = se.element().getText(ap_quoteNo);
		String splitJobTitle[] = jobTitle.split("-");
		String strtitleSplit[] = splitJobTitle[0].split("\\(");
		String getApplicantName[] = splitJobTitle[1].split("\\)");
		@SuppressWarnings("unused")
		String ApplicantName = getApplicantName[0].trim();
		String QuoteNumber = strtitleSplit[1].trim();
		System.out.println(ApplicantName);
		return ApplicantName; 
	}
	public void openquote(String ApplicantName,String strRegressionID,ExtentTest test)
	{
		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		APPW_CommonMethods APPW_CommonMethods=TestPageFactory.initElements(se, APPW_CommonMethods.class); 
		try {
			se.util().sleep(3000);
			//se.element().Click(getCAFullApplication());
			//Calling Hide method
			//APPW_CommonMethods.hide_acordXml();
			se.element().Click(getMyWork(), test);
			se.element().Click(getClearAll(), test);
			se.util().sleep(2000);
			se.element().enterOrValidateText(getMWAppicantNm(), ApplicantName,test);
			//executor.executeScript("arguments[0].scrollIntoView(0,-10000);", getSEFullApplication());
			se.element().Click(getrecentQuote("Clearance"), test);
			se.util().sleep(2000);
			//executor.executeScript("arguments[0].scrollIntoView(0,-10000);", getSEFullApplication());
			//se.element().Click(getCardHeader());
			se.element().Click(getBtneventWorkItemAction_Open(), test);
			if(strRegressionID.equals("SL_17") ||strRegressionID.equals("BP_14")) {
			se.element().Click(getContinue_Button(), test);
			}
		}
		catch (StaleElementReferenceException e)
		{
			se.util().sleep(3000);
			//se.element().Click(getCAFullApplication());
			//Calling Hide method
			APPW_CommonMethods.hide_acordXml();
			se.element().Click(getMyWork(), test);
			se.element().Click(getClearAll(), test);
			se.util().sleep(2000);
			se.element().enterOrValidateText(getMWAppicantNm(), ApplicantName,test);
			se.element().Click(getrecentQuote("Clearance"), test);
			se.util().sleep(2000);
			executor.executeScript("arguments[0].scrollIntoView(0,-10000);", getSEFullApplication());
			//se.element().Click(getCardHeader());
			se.element().Click(getBtneventWorkItemAction_Open(), test);
		}
	}

}

