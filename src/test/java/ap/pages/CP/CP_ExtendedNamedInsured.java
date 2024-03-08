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
import ap.pages.common.AP_Login;

public class CP_ExtendedNamedInsured extends OR_CP{
	public void CP_ExtendedNamedInsured_Details(String strRegressionID, String transaction,String suspendSheet, String strAgentLink, String strLOB,String strRelease_SelectRelease,String strRole_SelectRoleAs,ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.Extended_Named_Insured)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Extended_Named_Insured, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strENI_TXT_Name = (String) row.get("ENI_TXT_Name");
			String strENI_TXT_DoingBusiAs = (String) row.get("ENI_TXT_DoingBusiAs");
			String strENI_DD_LegalEntity = (String) row.get("ENI_DD_LegalEntity");
			String strENI_RBTN_TaxIDTypeFEIN = (String) row.get("ENI_RBTN_TaxIDTypeFEIN");
			String strENI_RBTN_TaxIDTypeSSN = (String) row.get("ENI_RBTN_TaxIDTypeSSN");
			String strENI_TXT_TaxID = (String) row.get("ENI_TXT_TaxID");
			String strENI_TXT_DescribeThisRelationship = (String) row.get("ENI_TXT_DescribeThisRelationship");
			String strENI_BTN_AddNew = (String) row.get("ENI_BTN_AddNew");
			String strENI_BTN_Delete = (String) row.get("ENI_BTN_Delete");
			String strENI_BTN_RowNo = (String) row.get("ENI_BTN_RowNo");
			String strOveride = (String) row.get("Overide_Eligibilty");
			String strENI_XarcWarning = (String) row.get("ENI_XarcWarning");
			String strENI_XarcPosition = (String) row.get("ENI_XarcPosition");
			String strSecura_TXT_Email = (String) row.get("Secura_TXT_Email");
			String strSecura_TXT_Password = (String) row.get("Secura_TXT_Password");
			try {
				se.log().logTestStep("CP_ExtendedNamedInsured_Details");
				test.log(LogStatus.INFO, "CP_ExtendedNamedInsured_Details","Transaction Step : "+transaction + "<br>" +"Page : CP_ExtendedNamedInsured_Details");
				se.verify().verifyEquals("CP_ExtendedNamedInsured_Details  of AgencyPortal ", getExtendedNamedInsureds_label().isDisplayed(),true, true,test);
				if(strENI_XarcWarning.contains("risk is ineligible")) {
					executor.executeScript("arguments[0].scrollIntoView(0,500);", getExtendedNamedInsureds_label());
					se.verify().verifyEquals("Xarc Warning Validation - ", getENI_XarcWarning(strENI_XarcPosition).getText(),strENI_XarcWarning,true,test);
					strENI_XarcWarning="N/A";
				}
				if(iteration==0){
					AP_OverrideIneligibilty( strRegressionID, transaction, strOveride, strAgentLink,  strLOB,strRelease_SelectRelease,strRole_SelectRoleAs,strSecura_TXT_Email,strSecura_TXT_Password, test);
				}
				if(!strENI_XarcWarning.equalsIgnoreCase("N/A")) {
					executor.executeScript("arguments[0].scrollIntoView(0,500);", getExtendedNamedInsureds_label());
					se.verify().verifyEquals("Xarc Warning Validation - ", getENI_XarcWarning(strENI_XarcPosition).getText(),strENI_XarcWarning,true,test);
				}
				if(iteration==1){
					se.element().Click(getBuildingandOccupantSelection_BTN_AddNew(strENI_BTN_AddNew), test);
				}
				if(!strENI_BTN_Delete.contains("Delete"))
				{
					executor.executeScript("arguments[0].scrollIntoView(0,500);", getExtendedNamedInsureds_label());
					executor.executeScript("arguments[0].scrollIntoView(0,500);", getENI_TXT_Name(strENI_TXT_Name));
				se.element().enterOrValidateText(getENI_TXT_Name(strENI_TXT_Name),strENI_TXT_Name,test);
				se.element().enterOrValidateText(getENI_TXT_DoingBusiAs(strENI_TXT_DoingBusiAs),strENI_TXT_DoingBusiAs,test);
				se.element().SelectElement(ENI_DD_LegalEntity,strENI_DD_LegalEntity,test);
				se.element().checkUncheckOrValidate( getENI_RBTN_TaxIDTypeFEIN(strENI_RBTN_TaxIDTypeFEIN),strENI_RBTN_TaxIDTypeFEIN,test);
				se.element().checkUncheckOrValidate( getENI_RBTN_TaxIDTypeSSN(strENI_RBTN_TaxIDTypeSSN),strENI_RBTN_TaxIDTypeSSN,test);
				se.element().enterOrValidateText(getENI_TXT_TaxID(strENI_TXT_TaxID),strENI_TXT_TaxID,test);
				se.element().enterOrValidateText(getENI_TXT_DescribeThisRelationship(strENI_TXT_DescribeThisRelationship),strENI_TXT_DescribeThisRelationship,test);
				se.util().sleep(3000);
				if(transaction=="NewQuote") {
					se.element().Click(getENI_BTN_Add(), test);
				}
				se.util().sleep(3000);
				}
				else if(strENI_BTN_Delete.contains("Delete"))
				{
					se.element().Click(getENI_BTN_Delete(strENI_BTN_RowNo), test);
					//se.util().sleep(2000);
					se.element().Click(getLocations_BTN_Delete_Yes(), test);
				}
				
				
			}
			catch(Exception e){{}
			e.printStackTrace();
			e.getMessage();
			se.verify().verifyEquals("Failed to fill in details for CP_ExtendedNamedInsured_Details ", true, false, true, test);
			}
			iteration++;
		}
		se.element().Click(getGI_CHK_Continue(), test);	
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
			se.util().sleep(2000);
			se.element().Click(getENI_BTN_PopUpYes(), test);
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
				boolean PopUpDisplayed =se.element().waitForElementIsDisplayed(AreYouSureYes_BTN_Yes);
				if(PopUpDisplayed) {
					se.element().Click(getAreYouSureYes_BTN_Yes(), test);
				}
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
				se.util().sleep(5000);
				//se.element().refreshBrowser();

			}
		}
	}
}










