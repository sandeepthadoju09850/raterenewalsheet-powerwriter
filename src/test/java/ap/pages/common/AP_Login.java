package ap.pages.common;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.SystemPropertyUtil;
import Libraries.automation.common.Utils.TestPageFactory;
import Libraries.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.BL_OR_CP;
import ap.pages.common.APPW_CommonMethods;

public class AP_Login extends BL_OR_CP{
	String CP = "Commercial Package";
	String SE = "Special Events";
	String CA = "Commercial Auto";
	String UM="Umbrella";
	String WC="Workers Comp";
	String UW="Underwriters";
	String UWA="UnderwriterAssistants";
	String SLM="MarketManagers";
	String CSS="CSS";

	public void APAppLogin(String strRegressionID, String transaction,String FullApplication, ExtentTest test) throws IOException {
		try {
			List<Map<String, String>> table = ExcelOperations.getBLPagesData(constants.loginPageName, strRegressionID,transaction);
			
			int iteration = 0;
			while (iteration < table.size()) {
				try {
					LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
					String strAgentLink = (String) row.get("AgentLink");
					String strSelect_RoleAs = (String) row.get("Select_RoleAs");
					String strSelect_Release = (String) row.get("Select_Release");
					String strSelectLOB = (String) row.get("LOB_Select");
					String strLgnUsername = (String) row.get("Lgn_UserName");
					String strLgnPassword = (String) row.get("Lgn_Password");
					String strPWLogin_TXT_UserName = (String) row.get("PW_Login_UserName");
					String strPWLogin_TXT_Password = (String) row.get("PW_Login_Password");
					String strSecura_TXT_Email = (String) row.get("Secura_TXT_Email");
					String strSecura_TXT_Password = (String) row.get("Secura_TXT_Password");
					//String strstpFlag = (String) row.get("stpFlag");
					se.log().logTestStep("Log into the AgencyPortal");
					test.log(LogStatus.INFO, "Executing","Transaction Step : " + transaction + "<br>" + "Page : Login");
					
					
					if(strAgentLink.equalsIgnoreCase("Yes")&& !strSelect_Release.equalsIgnoreCase("R2 Performance")) {
					
						se.log().logTestStep("Access AP Application");	
						test.log(LogStatus.INFO, "Access Agency Port Application", "<br> URL : "+SystemPropertyUtil.getBaseStoreUrl());
						//APLogoutDetails("Yes",test);
						//se.browser().deleteCookies();
						
						if (constants.Env.equals("stage") )
							
						{
						
						
						se.browser().get(SystemPropertyUtil.getBaseStoreUrl(),test);
						se.element().waitForElementIsDisplayed(getALUsername());
						se.verify().verifyEquals("Login Page is displayed", getALUsername().isDisplayed(), true, true, test);
						se.element().enterText(getALUsername(), strLgnUsername);
						se.element().enterText(getALPassword(), strLgnPassword);
						se.log().logSeStep("Entering username as: " + strLgnUsername);
						se.log().logSeStep("Entering password as: " + strLgnPassword);
						test.log(LogStatus.INFO, "Entering text in USERNAME & PASSWORD fields", "<b>USERNAME : "+strLgnUsername+"<br> <b>PASSWORD : "+strLgnPassword); 
						//se.util().sleep(1000);
						se.element().waitForElement(agentlink_btn_login);
						se.element().Click(getALLogin(), test);
						//se.element().Click(getALInernal(), test);
						test.log(LogStatus.INFO, "Clicking on the button", "Click on LOGIN");
						
						se.util().sleep(3000);
					
						}
						
						else 
						{
							
							se.browser().get(SystemPropertyUtil.getBaseStoreUrl(),test);
							boolean linkDisplayed1=se.element().isElementPresent(getALUsername());
							//boolean linkDisplayed=se.element().waitForElementIsDisplayed(getALUsername());
							if(linkDisplayed1 ) {
								se.element().waitForElementIsDisplayed(getALUsername());
								se.verify().verifyEquals("Login Page is displayed", getALUsername().isDisplayed(), true, true, test);
								se.element().enterText(getALUsername(), strLgnUsername);
								se.element().enterText(getALPassword(), strLgnPassword);
								se.log().logSeStep("Entering username as: " + strLgnUsername);
								se.log().logSeStep("Entering password as: " + strLgnPassword);
								test.log(LogStatus.INFO, "Entering text in USERNAME & PASSWORD fields", "<b>USERNAME : "+strLgnUsername+"<br> <b>PASSWORD : "+strLgnPassword); 
								//se.util().sleep(1000);
								se.element().waitForElement(agentlink_btn_login);
								se.element().Click(getALLogin(), test);
								//se.element().Click(getALInernal(), test);
								test.log(LogStatus.INFO, "Clicking on the button", "Click on LOGIN");
								
								
							}
							
						}
					}
					else if(strAgentLink.equalsIgnoreCase("Yes")&& strSelect_Release.equalsIgnoreCase("R2 Performance")) {
						
						se.log().logTestStep("Access AP Application");	
						
						test.log(LogStatus.INFO, "Access Agency Port Applicationss", "<br> URL : "+SystemPropertyUtil.getBaseStoreUrl());
						se.browser().get(SystemPropertyUtil.getBaseStoreUrl(),test);
						se.element().waitForElementIsDisplayed(getALUsername());
						se.verify().verifyEquals("Login Page is displayed", getALUsername().isDisplayed(), true, true, test);
						se.element().enterText(getALUsername(), strLgnUsername);
						se.element().enterText(getALPassword(), strLgnPassword);
						se.log().logSeStep("Entering username as: " + strLgnUsername);
						se.log().logSeStep("Entering password as: " + strLgnPassword);
						test.log(LogStatus.INFO, "Entering text in USERNAME & PASSWORD fields", "<b>USERNAME : "+strLgnUsername+"<br> <b>PASSWORD : "+strLgnPassword); 
						//se.util().sleep(1000);
						se.element().waitForElement(agentlink_btn_login);
						se.element().Click(getALLogin(), test);
						test.log(LogStatus.INFO, "Clicking on the button", "Click on LOGIN");
						se.log().logSeStep(driver.getCurrentUrl());
						se.util().sleep(3000);
						}
					
						//=============================================================below code is commented as on jenkins this script is not working ======================
						/*se.browser().get(SystemPropertyUtil.getLocale());
						//se.util().sleep(1000);
						se.element().selectradiovalue(role_rdo_roleselect, strSelect_RoleAs);  
						se.element().selectradiovalue(role_rdo_releaseselect, strSelect_Release);
						se.verify().verifyEquals("All four roles are displayed", getRoleSubmit().isDisplayed(), true, true,test); 
						//se.util().sleep(1000);
						se.element().Click(getRoleSubmit());*/
						//=============================================================above code is commented as on jenkins this script is not working ======================
					
					else {
					
						if(strSelect_RoleAs.equalsIgnoreCase(UW))
					
						/*{
							if (constants.Env.equals("stage") ) {
								
								se.browser().deleteCookies();
								
								se.browser().get(SystemPropertyUtil.getPopupUrl(),test);
								test.log(LogStatus.INFO, "Access Agency Port Application", "<br> URL : "+SystemPropertyUtil.getPopupUrl());
									
								
							}
							else */{
							
							se.browser().deleteCookies();
							//se.browser().get(SystemPropertyUtil.getLocalUrl(),test);
							InternalLogin(strSecura_TXT_Email, strSecura_TXT_Password, test);
							//se.browser().get(SystemPropertyUtil.getPopupUrl(),test);
							test.log(LogStatus.INFO, "Access Agency Port Application", "<br> URL : "+SystemPropertyUtil.getPopupUrl());
							}
						//}
						/*else if(strSelect_RoleAs.equalsIgnoreCase(UWA))
						{
							se.browser().deleteCookies();
							se.browser().get(SystemPropertyUtil.getPopupuwaUrl(),test);
							test.log(LogStatus.INFO, "Access Agency Port Application", "<br> URL : "+SystemPropertyUtil.getPopupUrl());
							}*/
						
						/*else if(strSelect_RoleAs.equalsIgnoreCase(SLM)) {
							se.browser().deleteCookies();
							se.browser().get(SystemPropertyUtil.getSLMUrl(),test);
							test.log(LogStatus.INFO, "Access Agency Port Application", "<br> URL : "+SystemPropertyUtil.getCSSUrl());
							
						}*/
						
					}
						//se.util().sleep(3000);
					
			
//					se.log().logSeStep("Click Full application to start a quote for " + strSelectLOB);
//					test.log(LogStatus.INFO, "Click Full application", "LOB : " + strSelectLOB);
					
					se.element().Click(getagentlink_lnk_TileView(),test);
					se.util().sleep(3000);
					APPW_CommonMethods APPW_CommonMethods=TestPageFactory.initElements(se, APPW_CommonMethods.class);
					
					if(FullApplication.equalsIgnoreCase("Yes")/*&& strstpFlag.equalsIgnoreCase("Yes")*/){
						APAccountSTP(strRegressionID, transaction, test);
						if (strSelectLOB.equals(CP)) {
							APPW_CommonMethods.addNewWorkItem("Package (Commercial & Specialty)", test);
							
							//se.util().sleep(4000);
						} 
						else if(strSelectLOB.equals(SE))
						{
							APPW_CommonMethods.addNewWorkItem("Special Events", test);
							//se.util().sleep(4000);
						}
						else if (strSelectLOB.equals(CA))
						{
							APPW_CommonMethods.addNewWorkItem("Commercial Auto", test);
						}
						else if(strSelectLOB.equals(UM))
						{
							APPW_CommonMethods.addNewWorkItem("Umbrella", test);
						}
						else if(strSelectLOB.equals(WC))
						{
							APPW_CommonMethods.addNewWorkItem("Workers", test);
						}
					}
					/*else if(FullApplication.equalsIgnoreCase("Yes")&& !strstpFlag.equalsIgnoreCase("Yes")) {
						se.element().Click(getMyWork(), test);
						if (strSelectLOB.equals(CP)) {
							se.element().Click(getCPFullApplication(), test);
							//se.util().sleep(4000);
						} 
						else if(strSelectLOB.equals(SE))
						{
							se.element().Click(getSEFullApplication(), test);
							//se.util().sleep(4000);
						}
						else if (strSelectLOB.equals(CA))
						{
							se.element().Click(getCAFullApplication(), test);
						}
						else if(strSelectLOB.equals(UM))
						{
							se.element().Click(getUMFullApplication(), test);
						}
						else if(strSelectLOB.equals(WC))
						{
							se.element().Click(getWCFullApplication(), test);
						}
					}*/
					}
				catch (Exception e) {{}
					e.printStackTrace();
					e.getMessage();
					se.verify().verifyEquals("Application login is unsuccessful ", true, false, true, test);
				}
				iteration++;
			}
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			se.log().logTestStep("Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			test.log(LogStatus.FAIL, "Failed","Issue in the login page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			testTearDown(se, test);
		}
	}
	
	public void APAccountSTP(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		APPW_CommonMethods APPW_CommonMethods=TestPageFactory.initElements(se, APPW_CommonMethods.class);
		AP_AccountCreation AP_AccountCreation=TestPageFactory.initElements(se, AP_AccountCreation.class);
	//	
		try {
		se.element().Click(getclickon_MyAccounts(), test);
		se.verify().verifyEquals("My Accounts Page is displayed", getclickon_MyAccounts().isDisplayed(), true, true, test);
		se.element().Click(getaddNewAccount_BTN(), test);
		APPW_CommonMethods.hide_acordXml();
//		try {
		AP_AccountCreation.AccountCreation(strRegressionID, transaction, test);
//		}catch (Exception e) {
//			test.log(LogStatus.WARNING,"Failed to fill deails on Account Creation screen",test.addScreenCapture(Util.captureScreenshot("Failed to fill info on AccCreate screen" , se)));
//			e.getMessage();
//			e.printStackTrace();
//	}
		}catch (Exception e) {
			test.log(LogStatus.WARNING,"Issue loading MyAccounts",test.addScreenCapture(Util.captureScreenshot("Error Occured" , se)));
			e.getMessage();
			e.printStackTrace();
	}
		}
	
	public void InternalLogin(String strSecura_TXT_Email, String strSecura_TXT_Password, ExtentTest test) throws IOException
	{
		{
			
			se.log().logTestStep("Access Agency Port Application");
			
			se.browser().get(SystemPropertyUtil.getPopupUrl(),test);
			
			/*se.element().waitForElementIsDisplayed(getQAALUsername());
			se.verify().verifyEquals("Login Page is displayed", getQAALUsername().isDisplayed(), true, true, test);
			se.element().Click(getALInernal(), test);
			se.util().sleep(3000);
			se.element().enterText(getQAALUsername(), strSecura_TXT_Email);
			se.element().enterText(getQAALPassword(), strSecura_TXT_Password);
			se.log().logSeStep("Entering username as: " + strSecura_TXT_Email);
			se.log().logSeStep("Entering password as: " + strSecura_TXT_Password);
			test.log(LogStatus.INFO, "Entering text in USERNAME & PASSWORD fields", "<b>USERNAME : "+strSecura_TXT_Email+"<br> <b>PASSWORD : "+strSecura_TXT_Password); 
			//se.util().sleep(1000);
			se.element().waitForElement(Qaagentlink_btn_login);
			se.element().Click(getQAALLogin(), test);
			test.log(LogStatus.INFO, "Clicking on the button", "Click on LOGIN");
			
			se.util().sleep(3000);*/
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
	
	
	public void APLogoutDetails(String AgentLink,ExtentTest test) throws IOException  {
		try {
			//se.element().Click(getclickon_Mywork());
			se.verify().verifyEquals("User Profile dropdown is displayed", getdd_currentprofile().isDisplayed(), true, true,test);
			test.log(LogStatus.INFO, "Clicked on User Profile dropdown", "Selecting LogOut element from User Profile dropdown"); 
			se.element().waitForElementIsDisplayed(getdd_currentprofile());
			se.util().sleep(3000);
			se.element().Click(getdd_currentprofile(), test);
			test.log(LogStatus.INFO, "Clicked on LogOut element from the dropdown", "LogOut element is clicked successfully");
			//se.element().Click(getclickon_Mywork())
			se.util().sleep(3000);
			se.element().Click(getElementLogout(), test);
			if(AgentLink.contains("Yes"))
			{
				if(se.element().isElementVisible(common_Element_Logout_AgentLink_ProfileMouseOver)){
				new Actions(se.driver()).moveToElement(getcommon_Element_Logout_AgentLink_ProfileMouseOver()).perform();
				se.element().Click(getElementAgentLinkLogout(), test);
				/*se.browser().closeCurrentWindow();*/
				}
			}
			se.browser().deleteCookies();
		} catch (Exception e) {
			test.log(LogStatus.WARNING,"Issue with Logout - ",test.addScreenCapture(Util.captureScreenshot("UnexpectedError on CP_BuildingandOccupantSelection" , se)));
			e.getMessage();
			e.printStackTrace();
		}
	}
		}
	

