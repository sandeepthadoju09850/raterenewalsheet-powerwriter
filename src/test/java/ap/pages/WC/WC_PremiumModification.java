package ap.pages.WC;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.ap.automation.common.CommonAPMethods;
import Libraries.ap.automation.common.ExcelOperations;
import Libraries.ap.automation.common.SystemPropertyUtil;
import Libraries.ap.automation.common.Utils.TestPageFactory;
import Libraries.ap.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.OR_CP;
import ap.pages.common.AP_Login;

public class WC_PremiumModification extends OR_CP {
	String text="";
	public void WC_PremiumModification_Details(String strRegressionID, String transaction,String suspendSheet,String strAgentLink, String strLOB,String strRelease_SelectRelease,String strRole_SelectRoleAs,ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.WC_Premium_Modification)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.WC_Premium_Modification, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strWC_PremiumModification_BTN_Edit = (String) row.get("WC_PremiumModification_BTN_Edit");
			String strWC_PremiumModification_BTN_Edit1 = (String) row.get("WC_PremiumModification_BTN_Edit1");
			String strWC_PremiumModification_DD_State = (String) row.get("WC_PremiumModification_DD_State");
			String strWC_PremiumModification_TXT_ScheduleCreditDebit = (String) row.get("WC_PremiumModification_TXT_ScheduleCreditDebit");
			String strWC_PremiumModification_DD_Premises = (String) row.get("WC_PremiumModification_DD_Premises");
			String strWC_PremiumModification_DD_PremisesReason = (String) row.get("WC_PremiumModification_DD_PremisesReason");
			String strWC_PremiumModification_DD_Classification = (String) row.get("WC_PremiumModification_DD_Classification");
			String strWC_PremiumModification_DD_ClassificationReason = (String) row.get("WC_PremiumModification_DD_ClassificationReason");
			String strWC_PremiumModification_DD_MedFacilities = (String) row.get("WC_PremiumModification_DD_MedFacilities");
			String strWC_PremiumModification_DD_MedFacilitiesReason = (String) row.get("WC_PremiumModification_DD_MedFacilitiesReason");
			String strWC_PremiumModification_DD_SafetyDevices = (String) row.get("WC_PremiumModification_DD_SafetyDevices");
			String strWC_PremiumModification_DD_SafetyDevicesReason = (String) row.get("WC_PremiumModification_DD_SafetyDevicesReason");
			String strWC_PremiumModification_DD_Employees = (String) row.get("WC_PremiumModification_DD_Employees");
			String strWC_PremiumModification_DD_EmployeesReason = (String) row.get("WC_PremiumModification_DD_EmployeesReason");
			String strWC_PremiumModification_DD_ManagementCooperation = (String) row.get("WC_PremiumModification_DD_ManagementCooperation");
			String strWC_PremiumModification_DD_ManagementCooperationReason = (String) row.get("WC_PremiumModification_DD_ManagementCooperationReason");
			String strWC_PremiumModification_DD_ManagementSafety = (String) row.get("WC_PremiumModification_DD_ManagementSafety");
			String strWC_PremiumModification_DD_ManagementSafetyReason = (String) row.get("WC_PremiumModification_DD_ManagementSafetyReason");
			String strWC_PremiumModification_DD_Other = (String) row.get("WC_PremiumModification_DD_Other");
			String strWC_PremiumModification_DD_OtherReason = (String) row.get("WC_PremiumModification_DD_OtherReason");
			String strWC_PremiumMod_DD_SelectDivdPlan = (String) row.get("WC_PremiumMod_DD_SelectDivdPlan");
			String strWC_PremiumMod_TXT_DivComments = (String) row.get("WC_PremiumMod_TXT_DivComments");
			String strSRF_CHK_ApplicantHasCCPAP = (String) row.get("SRF_CHK_ApplicantHasCCPAP");
			String strPremiumModification_TXT_CCPAPfactor = (String) row.get("PremiumModification_TXT_CCPAPfactor");
			try {
				se.log().logTestStep("WC_PremiumModification_Details");
				test.log(LogStatus.INFO, "WC_PremiumModification_Details","Transaction Step : "+transaction + "<br>" +"Page : WC_PremiumModification_Details");
				se.verify().verifyEquals("WC_PremiumModification_Details  of AgencyPortal ", getPremiumModification_label().isDisplayed(),true, true,test);		
				if(strWC_PremiumModification_BTN_Edit.contains("Edit"))
				{
					se.element().Click(getPremiumModification_BTN_Edit(strWC_PremiumModification_BTN_Edit1), test);
					se.element().SelectElement(WC_PremiumModification_DD_State,strWC_PremiumModification_DD_State, test);
					se.element().enterOrValidateText(getWC_PremiumModification_TXT_ScheduleCreditDebit(strWC_PremiumModification_TXT_ScheduleCreditDebit), strWC_PremiumModification_TXT_ScheduleCreditDebit,test);
					se.element().SelectElement(WC_PremiumModification_DD_Premises, strWC_PremiumModification_DD_Premises,test);
					se.element().SelectElement(WC_PremiumModification_DD_PremisesReason,strWC_PremiumModification_DD_PremisesReason, test);
					se.element().SelectElement(WC_PremiumModification_DD_Classification, strWC_PremiumModification_DD_Classification,test);
					se.element().SelectElement(WC_PremiumModification_DD_ClassificationReason,strWC_PremiumModification_DD_ClassificationReason, test);
					se.util().sleep(6000);
					se.element().SelectElement(WC_PremiumModification_DD_MedFacilities, strWC_PremiumModification_DD_MedFacilities,test);
					se.util().sleep(6000);
					se.element().SelectElement(WC_PremiumModification_DD_MedFacilitiesReason,strWC_PremiumModification_DD_MedFacilitiesReason, test);
					se.element().SelectElement(WC_PremiumModification_DD_SafetyDevices, strWC_PremiumModification_DD_SafetyDevices,test);
					se.element().SelectElement(WC_PremiumModification_DD_SafetyDevicesReason,strWC_PremiumModification_DD_SafetyDevicesReason, test);
					se.element().SelectElement(WC_PremiumModification_DD_Employees, strWC_PremiumModification_DD_Employees,test);
					se.element().SelectElement(WC_PremiumModification_DD_EmployeesReason,strWC_PremiumModification_DD_EmployeesReason, test);
					se.element().SelectElement(WC_PremiumModification_DD_ManagementCooperation, strWC_PremiumModification_DD_ManagementCooperation,test);
					se.element().SelectElement(WC_PremiumModification_DD_ManagementCooperationReason,strWC_PremiumModification_DD_ManagementCooperationReason, test);	
					se.element().SelectElement(WC_PremiumModification_DD_ManagementSafety, strWC_PremiumModification_DD_ManagementSafety,test);
					se.element().SelectElement(WC_PremiumModification_DD_ManagementSafetyReason,strWC_PremiumModification_DD_ManagementSafetyReason, test);	
					se.element().SelectElement(WC_PremiumModification_DD_Other, strWC_PremiumModification_DD_Other,test);
					se.element().SelectElement(WC_PremiumModification_DD_OtherReason,strWC_PremiumModification_DD_OtherReason, test);
					se.element().SelectElement(WC_PremiumMod_DD_SelectDivdPlan, strWC_PremiumMod_DD_SelectDivdPlan, test);
					se.element().enterOrValidateText(getWC_PremiumMod_TXT_DivComments(strWC_PremiumMod_TXT_DivComments), strWC_PremiumMod_TXT_DivComments,test);
					se.element().checkUncheckOrValidate(getSRF_CHK_ApplicantHasCCPAP(strSRF_CHK_ApplicantHasCCPAP),strSRF_CHK_ApplicantHasCCPAP,test);
					
					se.element().enterOrValidateText(getPremiumModification_TXT_CCPAPfactor(strPremiumModification_TXT_CCPAPfactor), strPremiumModification_TXT_CCPAPfactor,test);
					
					executor.executeScript("arguments[0].scrollIntoView(0,500);", getLocations_BTN_Save());
					se.element().Click(getLocations_BTN_Save(), test);
				}
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for WC_PremiumModification_Details ", true, false, true, test);
			}
			iteration++;
		}
		executor.executeScript("arguments[0].scrollIntoView(0,500);", getGI_CHK_Continue());
		se.element().Click(getGI_CHK_Continue(), test);
	}catch (Exception e) {
		
		se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
		test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
		testTearDown(se, test);
	}
	}
	public void CP_Internal_Details(String strRegressionID, String transaction, String strAgentLink, String strLOB,String strRelease_SelectRelease,String strRole_SelectRoleAs,ExtentTest test) throws IOException
	{
		CommonAPMethods BT=TestPageFactory.initElements(se, CommonAPMethods.class);
		AP_Login  LoginPage = TestPageFactory.initElements(se, AP_Login.class);
		String quote=getquotenumber(test);
		LoginPage.APLogoutDetails("Yes" ,test);
		/*se.browser().get(SystemPropertyUtil.getLocale());
		se.element().selectradiovalue(role_rdo_releaseselect, strRole_SelectRoleAs);
		se.element().selectradiovalue(role_rdo_roleselect, strRelease_SelectRelease);  
		se.verify().verifyEquals("All four roles are displayed", getRoleSubmit().isDisplayed(), true, true,test); 
		//se.util().sleep(1000);
		se.element().Click(getRoleSubmit());*/
		se.browser().get(SystemPropertyUtil.getPopupUrl(),test);
		//se.element().Click(getCAFullApplication());
		se.element().Click(getMyWork(), test);
		try {
			se.element().Click(getclick_view(), test);
			se.element().Click(getdropdown_MoreOptions(), test);
			se.element().enterText(gettxt_quoteOrPolicyNumber(),quote); 
			se.element().Click(getcommon_searchBtn(), test);
			se.element().waitForElementToAppear_One(" ",common_CardheaderSE, 60);
			se.element().Click(getcommon_CardheaderSE(), test);
			se.util().sleep(3000);
			se.element().Click(getBtneventWorkItemAction_Open(), test);
		}
		catch (StaleElementReferenceException e)
		{
			se.element().Click(getclick_view(), test);
			se.element().Click(getdropdown_MoreOptions(), test);
			se.element().enterText(gettxt_quoteOrPolicyNumber(),quote); 
			se.element().Click(getcommon_searchBtn(), test);
			se.element().waitForElementToAppear_One(" ",common_CardheaderSE, 60);
			se.element().Click(getcommon_CardheaderSE(), test);
			se.util().sleep(3000);
			se.element().Click(getBtneventWorkItemAction_Open(), test);
		}
		//se.element().Click(getclick_view());
		//		se.element().Click(getdropdown_MoreOptions());
		//		//se.util().sleep(2000);
		//		se.element().enterText(gettxt_quoteOrPolicyNumber(),quote); 
		//
		//		//se.util().sleep(1000);
		//		se.element().Click(getcommon_searchBtn());
		//		//se.util().sleep(1000);
		//		se.element().waitForElementToDisappear_One(common_CardheaderSE, 60);
		//		se.element().Click(getcommon_CardheaderSE());
		//		//se.util().sleep(3000);
		//		se.element().Click(getBtneventWorkItemAction_Open());
		//		//executor.executeScript("arguments[0].scrollIntoView(0,500);", getGI_CHK_Continue());
		BT.NavigateToTabs("Premium Modification",test);
	}

	public void CP_External_Details(String strRegressionID, String transaction, String strAgentLink, String strLOB,String strRelease_SelectRelease,String strRole_SelectRoleAs,ExtentTest test) throws IOException
	{
		CommonAPMethods BT=TestPageFactory.initElements(se, CommonAPMethods.class);
		String quote=getquotenumber( test);
		AP_Login  LoginPage = TestPageFactory.initElements(se, AP_Login.class);
		//LoginPage.APLogoutDetails(strRegressionID,transaction, test,"No");
		LoginPage.APAppLogin(strRegressionID,   transaction,"No", test);
		//		se.browser().get(SystemPropertyUtil.getBaseStoreUrl());
		//		se.browser().refresh();
		//		Actions actionObject = new Actions(se.driver());
		//		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).perform();
		//		se.element().Click(getALRatingSystems());
		//		se.element().Click(getALAgencyPortal());
		//		se.element().waitForElement(agentlink_lnk_agencyportall);
		//		se.element().Click(getALAgencyPortall());
		//		
		se.element().Click(getMyWork(), test);
		//se.element().Click(getCAFullApplication());
		se.element().Click(getMyWork(), test);
		try {
			se.element().Click(getclick_view(), test);
			se.element().Click(getdropdown_MoreOptions(), test);
			se.element().enterText(gettxt_quoteOrPolicyNumber(),quote); 
			se.element().Click(getcommon_searchBtn(), test);
			se.element().waitForElementToAppear_One(" ",common_CardheaderSE, 60);
			se.util().sleep(3000);
			se.element().Click(getcommon_CardheaderSE(), test);
			se.element().Click(getBtneventWorkItemAction_Open(), test);
		}
		catch (StaleElementReferenceException e)
		{
			e.getStackTrace();
			e.getMessage();
			se.element().refreshBrowser();
			se.element().Click(getclick_view(), test);
			se.element().Click(getdropdown_MoreOptions(), test);
			se.element().enterText(gettxt_quoteOrPolicyNumber(),quote); 
			se.element().Click(getcommon_searchBtn(), test);
			se.element().waitForElementToAppear_One(" ",common_CardheaderSE, 60);
			se.util().sleep(3000);
			se.element().Click(getcommon_CardheaderSE(), test);
			se.element().Click(getBtneventWorkItemAction_Open(), test);
		}

		BT.NavigateToTabs("Premium Modification",test);
		//se.element().Click(getGI_CHK_Continue());


	}
	public String getquotenumber(ExtentTest test)
	{
		String jobTitle = se.element().getText(ap_quoteNo);
		String splitJobTitle[] = jobTitle.split("-");
		String strtitleSplit[] = splitJobTitle[0].split("\\(");
		String getApplicantName[] = splitJobTitle[1].split("\\)");
		@SuppressWarnings("unused")
		String ApplicantName = getApplicantName[0].trim();
		String QuoteNumber = strtitleSplit[1].trim();
		System.out.println(QuoteNumber);
		test.log(LogStatus.INFO,"<b style='color:green;'>Quote #</b>", "<b style='background-color : yellow;'>"+QuoteNumber+"</b>");
		return QuoteNumber; 
	}
}
