package ap.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.CommonAPMethods;
import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.SystemPropertyUtil;
import Libraries.automation.common.Utils.TestPageFactory;
import Libraries.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.BL_OR_CP;
import ap.pages.common.AP_Login;

public class CP_PremiumModification extends BL_OR_CP {
	String text="";
	public void CP_PremiumModification_Details(String strRegressionID, String transaction,String suspendSheet,  String strAgentLink, String strLOB,String strRelease_SelectRelease,String strRole_SelectRoleAs,String quote, ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.Premium_Modification)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Premium_Modification, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strPremiumModification_BTN_Edit = (String) row.get("PremiumModification_BTN_Edit");
			String strPremiumModification_BTN_Edit1 = (String) row.get("PremiumModification_BTN_Edit1");
			String strPremiumModification_TXT_GLIRPMC_GLCredit = (String) row.get("PremiumModification_TXT_GLIRPMC_GLCredit");
			String strPremiumModification_TXT_State = (String) row.get("PremiumModification_TXT_State");
			String strPremiumModification_TXT_MaxCreditForGenLiability = (String) row.get("PremiumModification_TXT_MaxCreditForGenLiability");
			String strPremiumModification_DD_GLIRPMC_Management = (String) row.get("PremiumModification_DD_GLIRPMC_Management");
			String strPremiumModification_DD_GLIRPMC_ManagementReason = (String) row.get("PremiumModification_DD_GLIRPMC_ManagementReason");
			String strPremiumModification_DD_GLIRPMC_Location = (String) row.get("PremiumModification_DD_GLIRPMC_Location");
			String strPremiumModification_DD_GLIRPMC_LocationReason = (String) row.get("PremiumModification_DD_GLIRPMC_LocationReason");
			String strPremiumModification_DD_GLIRPMC_BuildingFeatures = (String) row.get("PremiumModification_DD_GLIRPMC_BuildingFeatures");
			String strPremiumModification_DD_GLIRPMC_BuildingFeaturesReason = (String) row.get("PremiumModification_DD_GLIRPMC_BuildingFeaturesReason");
			String strPremiumModification_DD_GLIRPMC_PremisesAndEquipe = (String) row.get("PremiumModification_DD_GLIRPMC_PremisesAndEquipe");
			String strPremiumModification_TXT_GLIRPMC_PremisesAndEquipeReason = (String) row.get("PremiumModification_TXT_GLIRPMC_PremisesAndEquipeReason");
			String strPremiumModification_DD_GLIRPMC_Employees = (String) row.get("PremiumModification_DD_GLIRPMC_Employees");
			String strPremiumModification_TXT_GLIRPMC_EmployeesReason = (String) row.get("PremiumModification_TXT_GLIRPMC_EmployeesReason");
			String strPremiumModification_DD_GLIRPMC_Protection = (String) row.get("PremiumModification_DD_GLIRPMC_Protection");
			String strPremiumModification_TXT_GLIRPMC_ProtectionReason = (String) row.get("PremiumModification_TXT_GLIRPMC_ProtectionReason");
			String strPremiumModification_TXT_PIRPMAC_PropertyCredit = (String) row.get("PremiumModification_TXT_PIRPMAC_PropertyCredit");
			String strPremiumModification_TXT_PIRPMAC_MaxCreditForProp = (String) row.get("PremiumModification_TXT_PIRPMAC_MaxCreditForProp");
			String strPremiumModification_DD_PIRPMAC_Management = (String) row.get("PremiumModification_DD_PIRPMAC_Management");
			String strPremiumModification_DD_PIRPMAC_ManagementReason = (String) row.get("PremiumModification_DD_PIRPMAC_ManagementReason");
			String strPremiumModification_DD_PIRPMAC_Location = (String) row.get("PremiumModification_DD_PIRPMAC_Location");
			String strPremiumModification_DD_PIRPMC_LocationReason = (String) row.get("PremiumModification_DD_PIRPMC_LocationReason");
			String strPremiumModification_DD_PIRPMAC_BuildingFeatures = (String) row.get("PremiumModification_DD_PIRPMAC_BuildingFeatures");
			String strPremiumModification_DD_PIIRPMC_BuildingFeaturesReason = (String) row.get("PremiumModification_DD_PIIRPMC_BuildingFeaturesReason");
			String strPremiumModification_DD_PIRPMAC_PremisesEquip = (String) row.get("PremiumModification_DD_PIRPMAC_PremisesEquip");
			String strPremiumModification_DD_PIRPMAC_PremisesEquipReason = (String) row.get("PremiumModification_DD_PIRPMAC_PremisesEquipReason");
			String strPremiumModification_DD_PIRPMAC_Employees = (String) row.get("PremiumModification_DD_PIRPMAC_Employees");
			String strPremiumModification_TXT_PIRPMAC_EmployeesReason = (String) row.get("PremiumModification_TXT_PIRPMAC_EmployeesReason");
			String strPremiumModification_DD_PIRPMAC_Protection = (String) row.get("PremiumModification_DD_PIRPMAC_Protection");
			String strPremiumModification_DD_PIRPMAC_ProtectionReason = (String) row.get("PremiumModification_DD_PIRPMAC_ProtectionReason");
			String strPremiumModification_DD_GLIRPMC_LocExpInsidePremises = (String) row.get("PremiumModification_DD_GLIRPMC_LocExpInsidePremises");
			String strPremiumModification_TXT_GLIRPMC_LocExpInsidePreReason = (String) row.get("PremiumModification_TXT_GLIRPMC_LocExpInsidePreReason");
			String strPremiumModification_DD_GLIRPMC_LocExpOutsidePremises = (String) row.get("PremiumModification_DD_GLIRPMC_LocExpOutsidePremises");
			String strPremiumModification_TXT_GLIRPMC_LocExpOutPremReason = (String) row.get("PremiumModification_TXT_GLIRPMC_LocExpOutPremReason");
			String strPremiumModification_DD_GLIRPMC_Premises = (String) row.get("PremiumModification_DD_GLIRPMC_Premises");
			String strPremiumModification_TXT_GLIRPMC_PremisesReason = (String) row.get("PremiumModification_TXT_GLIRPMC_PremisesReason");
			String strPremiumModification_TXT_Iowa_large_Prem_Discount = (String) row.get("PremiumModification_TXT_Iowa_large_Prem_Discount");
			String strPremiumModification_DD_GLIRPMC_MO_Equipe = (String) row.get("PremiumModification_DD_GLIRPMC_MO_Equipe");
			String strPremiumModification_DD_GLIRPMC_MO_EquipeReason = (String) row.get("PremiumModification_DD_GLIRPMC_MO_EquipeReason");
			
			
			//String strPremiumModification_Readonly = (String) row.get("PremiumModification_Readonly");
			try {
				se.log().logTestStep("CP_PremiumModification_Details");
				test.log(LogStatus.INFO, "CP_PremiumModification_Details","Transaction Step : "+transaction + "<br>" +"Page : CP_PremiumModification_Details");
				se.verify().verifyEquals("CP_PremiumModification_Details  of AgencyPortal ", getPremiumModification_label().isDisplayed(),true, true,test);		
				if(strPremiumModification_BTN_Edit.contains("Edit"))
				{
					//getview();
					se.element().Click(getPremiumModification_BTN_Edit(strPremiumModification_BTN_Edit1), test);
					/*if(iteration==0 && strPremiumModification_Readonly.contains("Y") && transaction.contains("NewQuote") )
					{
						String text=se.element().getText(PremiumModification_TXT_Readonly);
						if(text.contains("This screen is read-only"))
						{
							//se.element().Click(getGI_CHK_Continue());
							CP_Internal_Details(strRegressionID,   transaction, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs,quote, test);
							se.element().Click(getPremiumModification_BTN_Edit(strPremiumModification_BTN_Edit1));
						}
					}*/
					se.element().waitForLoad(120);
					se.element().waitForElementToDisappear_One(progressBar, 60);
					se.element().enterOrValidateText(getPremiumModification_TXT_State(strPremiumModification_TXT_State), strPremiumModification_TXT_State,test);
					se.element().enterOrValidateText(getPremiumModification_TXT_PIRPMAC_PropertyCredit(strPremiumModification_TXT_PIRPMAC_PropertyCredit), strPremiumModification_TXT_PIRPMAC_PropertyCredit,test);
					se.element().enterOrValidateText(getPremiumModification_TXT_PIRPMAC_MaxCreditForProp(strPremiumModification_TXT_PIRPMAC_MaxCreditForProp), strPremiumModification_TXT_PIRPMAC_MaxCreditForProp,test);
					se.element().SelectElement(PremiumModification_DD_PIRPMAC_Management, strPremiumModification_DD_PIRPMAC_Management,test);
					/*se.util().sleep(2000);
					se.element().SelectElement(PremiumModification_DD_PIRPMAC_ManagementReason, strPremiumModification_DD_PIRPMAC_ManagementReason, test);
					*/se.element().SelectElement(PremiumModification_DD_PIRPMAC_Location, strPremiumModification_DD_PIRPMAC_Location,test);
					se.element().SelectElement(PremiumModification_TXT_PIRPMAC_LocationReason,strPremiumModification_DD_PIRPMC_LocationReason, test);
					se.element().SelectElement(PremiumModification_DD_PIRPMAC_BuildingFeatures, strPremiumModification_DD_PIRPMAC_BuildingFeatures,test);
					se.element().SelectElement(PremiumModification_TXT_PIRPMAC_BuildingFeaturesReason,strPremiumModification_DD_PIIRPMC_BuildingFeaturesReason, test);
					se.element().SelectElement(PremiumModification_DD_PIRPMAC_PremisesEquip, strPremiumModification_DD_PIRPMAC_PremisesEquip,test);
					se.element().SelectElement(PremiumModification_DD_PIRPMAC_PremisesEquipReason, strPremiumModification_DD_PIRPMAC_PremisesEquipReason, test);
					se.element().SelectElement(PremiumModification_DD_PIRPMAC_Employees, strPremiumModification_DD_PIRPMAC_Employees,test);
					se.element().SelectElement(PremiumModification_TXT_PIRPMAC_EmployeesReason, strPremiumModification_TXT_PIRPMAC_EmployeesReason, test);
					se.element().SelectElement(PremiumModification_DD_PIRPMAC_Protection, strPremiumModification_DD_PIRPMAC_Protection,test);
					se.element().SelectElement(PremiumModification_TXT_PIRPMAC_ProtectionReason, strPremiumModification_DD_PIRPMAC_ProtectionReason, test);
					se.element().SelectElement(PremiumModification_DD_PIRPMAC_ManagementReason, strPremiumModification_DD_PIRPMAC_ManagementReason, test);
					se.util().sleep(2000);
					se.element().enterOrValidateText(getPremiumModification_TXT_GLIRPMC_GLCredit(strPremiumModification_TXT_GLIRPMC_GLCredit), strPremiumModification_TXT_GLIRPMC_GLCredit,test);
					se.element().enterOrValidateText(getPremiumModification_TXT_MaxCreditForGenLiability(strPremiumModification_TXT_MaxCreditForGenLiability), strPremiumModification_TXT_MaxCreditForGenLiability,test);
					se.element().SelectElement(PremiumModification_DD_GLIRPMC_Management, strPremiumModification_DD_GLIRPMC_Management,test);
					/*se.util().sleep(2000);
					se.element().SelectElement(PremiumModification_DD_GLIRPMC_ManagementReason, strPremiumModification_DD_GLIRPMC_ManagementReason, test);
					*/se.element().SelectElement(PremiumModification_DD_GLIRPMC_Location, strPremiumModification_DD_GLIRPMC_Location,test);
					se.element().SelectElement(PremiumModification_DD_GLIRPMC_LocationReason, strPremiumModification_DD_GLIRPMC_LocationReason, test);
					se.element().SelectElement(PremiumModification_DD_GLIRPMC_BuildingFeatures, strPremiumModification_DD_GLIRPMC_BuildingFeatures,test);
					se.element().SelectElement(PremiumModification_DD_GLIRPMC_BuildingFeaturesReason, strPremiumModification_DD_GLIRPMC_BuildingFeaturesReason, test);
					se.element().SelectElement(PremiumModification_DD_GLIRPMC_PremisesAndEquipe, strPremiumModification_DD_GLIRPMC_PremisesAndEquipe,test);
					se.element().SelectElement(PremiumModification_TXT_GLIRPMC_PremisesAndEquipeReason, strPremiumModification_TXT_GLIRPMC_PremisesAndEquipeReason, test);
					se.element().SelectElement(PremiumModification_DD_GLIRPMC_Employees, strPremiumModification_DD_GLIRPMC_Employees,test);
					se.element().SelectElement(PremiumModification_TXT_GLIRPMC_EmployeesReason, strPremiumModification_TXT_GLIRPMC_EmployeesReason, test);
					se.util().sleep(2000);
					//if(!strRegressionID.equalsIgnoreCase("AG_03") && !strRegressionID.equalsIgnoreCase("SL_06")&&!strRegressionID.equalsIgnoreCase("SE_02")&&!strRegressionID.equalsIgnoreCase("SE_03")&&!strRegressionID.equalsIgnoreCase("CUTC_36")){
					if(se.element().isElementPresent(PremiumModification_DD_GLIRPMC_Protection)) {
					se.element().Click1(PremiumModification_DD_GLIRPMC_Protection);
					se.element().clearTheField1(PremiumModification_DD_GLIRPMC_Protection);
					}
					
					se.element().SelectElement(PremiumModification_DD_GLIRPMC_Protection, strPremiumModification_DD_GLIRPMC_Protection,test);
					se.element().SelectElement(PremiumModification_TXT_GLIRPMC_ProtectionReason, strPremiumModification_TXT_GLIRPMC_ProtectionReason, test);
					/*if(se.element().isElementPresent(PremiumModification_DD_GLIRPMC_LocExpInsidePremises)) {
						se.element().Click1(PremiumModification_DD_GLIRPMC_LocExpInsidePremises);
						se.element().clearTheField1(PremiumModification_DD_GLIRPMC_LocExpInsidePremises);
						}
					if(se.element().isElementPresent(PremiumModification_DD_GLIRPMC_LocExpOutsidePremises)) {
						se.element().Click1(PremiumModification_DD_GLIRPMC_LocExpOutsidePremises);
						se.element().clearTheField1(PremiumModification_DD_GLIRPMC_LocExpOutsidePremises);
						}*/
					se.element().SelectElement(PremiumModification_DD_GLIRPMC_LocExpInsidePremises, strPremiumModification_DD_GLIRPMC_LocExpInsidePremises,test);
					se.element().SelectElement(PremiumModification_TXT_GLIRPMC_LocExpInsidePreReason, strPremiumModification_TXT_GLIRPMC_LocExpInsidePreReason, test);
					
					se.element().SelectElement(PremiumModification_DD_GLIRPMC_LocExpOutsidePremises, strPremiumModification_DD_GLIRPMC_LocExpOutsidePremises,test);
					se.element().SelectElement(PremiumModification_TXT_GLIRPMC_LocExpOutPremReason, strPremiumModification_TXT_GLIRPMC_LocExpOutPremReason, test);
					
					se.element().SelectElement(PremiumModification_DD_GLIRPMC_Premises, strPremiumModification_DD_GLIRPMC_Premises,test);
					se.element().SelectElement(PremiumModification_TXT_GLIRPMC_PremisesReason, strPremiumModification_TXT_GLIRPMC_PremisesReason, test);
					se.element().SelectElement(PremiumModification_DD_GLIRPMC_MO_Equipe, strPremiumModification_DD_GLIRPMC_MO_Equipe,test);
					se.element().SelectElement(PremiumModification_DD_GLIRPMC_MO_EquipeReason, strPremiumModification_DD_GLIRPMC_MO_EquipeReason, test);
					se.element().SelectElement(PremiumModification_DD_GLIRPMC_ManagementReason, strPremiumModification_DD_GLIRPMC_ManagementReason, test);
					
					
					se.element().enterOrValidateText(getPremiumModification_TXT_Iowa_large_Prem_Discount(strPremiumModification_TXT_Iowa_large_Prem_Discount), strPremiumModification_TXT_Iowa_large_Prem_Discount,test);
					executor.executeScript("arguments[0].scrollIntoView(0,500);", getLocations_BTN_Save());
				if(se.element().isElementPresent(Locations_BTN_Save)){
					se.element().Click(getLocations_BTN_Save(), test);
				} if(se.element().isElementPresent(Common_BTN_Cancel)){
					se.element().Click(getCommon_BTN_Cancel("Cancel"), test);
				}
				/*if( strPremiumModification_Readonly.contains("Y") && transaction.contains("NewQuote")&&iteration+1==table.size() )
					{
						se.util().sleep(1000);
						se.element().Click(getMyWork());	
						se.util().sleep(1000);
					}*/
				}
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for CP_PremiumModification_Details ", true, false, true, test);
			}
			
			/*if(transaction.contains("NewQuote")&& strPremiumModification_Readonly.contains("Y")&&iteration+1==table.size())
			{
				CP_External_Details(strRegressionID,   transaction, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs,quote, test);
			}else if(!text.contains("This screen is read-only")&&transaction.contains("NewQuote")&& strPremiumModification_Readonly.contains("Y")&&iteration+1==table.size()){
				CP_External_Details(strRegressionID,   transaction, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs,quote, test);
			}*/
			iteration++;
		}
		getview();
		executor.executeScript("arguments[0].scrollIntoView(0,500);", getGI_CHK_Continue());
		se.element().Click(getGI_CHK_Continue(), test);
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}
	public void CP_Internal_Details(String strRegressionID, String transaction, String strAgentLink, String strLOB,String strRelease_SelectRelease,String strRole_SelectRoleAs,String quote,ExtentTest test) throws IOException
	{
		CommonAPMethods BT=TestPageFactory.initElements(se, CommonAPMethods.class);
		AP_Login  LoginPage = TestPageFactory.initElements(se, AP_Login.class);
		
		LoginPage.APLogoutDetails("Yes", test);
		/*se.browser().get(SystemPropertyUtil.getLocale());
		se.element().selectradiovalue(role_rdo_releaseselect, strRole_SelectRoleAs);
		se.element().selectradiovalue(role_rdo_roleselect, strRelease_SelectRelease);  
		se.verify().verifyEquals("All four roles are displayed", getRoleSubmit().isDisplayed(), true, true,test); 
		//se.util().sleep(1000);
		se.element().Click(getRoleSubmit());*/
		se.browser().get(SystemPropertyUtil.getPopupUrl(),test);
		//se.element().Click(getCAFullApplication());
		se.element().Click(getMyWork(), test);
		se.element().Click(getClearAll(), test);
		try {
			se.element().Click(getclick_view(), test);
			se.element().Click(getdropdown_MoreOptions(), test);
			se.element().enterText(gettxt_quoteOrPolicyNumber(),quote); 
			se.element().Click(getcommon_searchBtn(), test);
			se.element().waitForElementToAppear_One(" ",common_CardheaderSE, 60);
			se.util().sleep(2000);
			se.element().Click(getCardHeader(), test);
			se.util().sleep(5000);
			se.element().Click(getBtneventWorkItemAction_Open(), test);
		}
		catch (StaleElementReferenceException e)
		{
			se.element().Click(getclick_view(), test);
			se.element().Click(getdropdown_MoreOptions(), test);
			se.element().enterText(gettxt_quoteOrPolicyNumber(),quote); 
			se.element().Click(getcommon_searchBtn(), test);
			se.element().waitForElementToAppear_One(" ",common_CardheaderSE, 60);
			se.util().sleep(2000);
			se.element().Click(getCardHeader(), test);
			se.util().sleep(5000);
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

	public void CP_External_Details(String strRegressionID, String transaction, String strAgentLink, String strLOB,String strRelease_SelectRelease,String strRole_SelectRoleAs,String quote,ExtentTest test) throws IOException
	{
		CommonAPMethods BT=TestPageFactory.initElements(se, CommonAPMethods.class);
		
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
		se.element().Click(getMyWork(), test);
		//se.element().Click(getCAFullApplication());
		se.element().Click(getMyWork(), test);
		se.element().Click(getClearAll(), test);
		try {
			
			se.element().Click(getclick_view(), test);
			
			se.element().Click(getdropdown_MoreOptions(), test);
			se.element().enterText(gettxt_quoteOrPolicyNumber(),quote); 
			se.element().Click(getcommon_searchBtn(), test);
			se.element().waitForElementToAppear_One(" ",common_CardheaderSE, 60);
			se.util().sleep(3000);
			se.element().Click(getcommon_CardheaderSE(), test);
			se.util().sleep(3000);
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
			se.util().sleep(3000);
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
		return QuoteNumber; 
	}
	public void getview()
	{
		Boolean  Status=se.element().waitForElement(PremiumModification_View,5 );
		if(Status==true)
		{
			String View = se.element().getSelectedText(PremiumModification_View);
			if(View.contains("View"))
			{
				se.util().sleep(5000);
				se.browser().refresh();
				se.element().waitForLoad(120);
			}
		}
	}
}
