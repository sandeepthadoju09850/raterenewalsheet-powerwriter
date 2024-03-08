package ap.pages.common;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.ap.automation.common.ExcelOperations;
import Libraries.ap.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.OR_CP;
public class APPW_CommonMethods extends OR_CP{
	
	//search from the search tile
	public void PW_Search_Quote_Details(ExtentTest test,String QuoteNumber, String LOB) throws IOException {
		//String strDasboard_LNK_Actions = (String) row.get("Dashboard_LNK_Actions"); 
		try
		{
			se.util().sleep(3000);
			se.verify().verifyEquals("User successfuly landed on PW home screen", getpwHomescreen().isDisplayed(), true, true, test);
						se.element().enterText(getpwsearchQuoteOrPolicyNum(),QuoteNumber);
			test.log(LogStatus.INFO, "Search Quote",QuoteNumber);
			//se.element().enterText(getpwsearchQuoteOrPolicyNum(),"9543335");
			se.element().Click(getpw_btn_Go(), test);
			se.util().sleep(5000);
			SwitchToDefaultAndThenSwitchToFrame();
			if(!LOB.equalsIgnoreCase("N/A")){
				se.util().sleep(3000);
				if(se.element().isElementPresent(pw_LBL_PolicyGroupHeader)){
					se.element().Click(getpw_LNK_PolicyLinkText(LOB), test);
				}
				se.util().sleep(1000);
			}/*else if(se.element().isElementPresent(pw_LBL_PolicyGroupHeader)){

				se.element().Click(getpw_LNK_firstPolicyLinkText());
			}*/
			driver.switchTo().defaultContent();
		}catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("Issue with PWSearchQuote", true, false, true, test);
		}
	}
	
	//search from the search tile
		public void Verify(ExtentTest test,String screenName, String xpath) throws IOException {
			//String strDasboard_LNK_Actions = (String) row.get("Dashboard_LNK_Actions"); 
			try
			{
				 By locator =By.xpath(xpath);
				
				se.element().waitForElement(locator);
				se.util().sleep(3000);
				se.verify().verifyEquals("Navigated to next screen",  se.element().getElement(locator).isDisplayed(),true, true,test);
				test.log(LogStatus.INFO, "Navigated to next screen" ,screenName);
				
			}catch (Exception e) {
				e.printStackTrace();
				test.log(LogStatus.INFO, "Could not Navigate to next screen" ,screenName);
			}
			
		}
//search from the top most search box
	public void PW_Search_Details(ExtentTest test,String QuoteNumber, String LOB) throws IOException {
		//String strDasboard_LNK_Actions = (String) row.get("Dashboard_LNK_Actions"); 
		try
		{
			SwitchToFrameofSearchresults();
			se.element().enterText(getpwsearchQuoteOrPolicyNum1(),QuoteNumber);
			test.log(LogStatus.INFO, "Search Quote",QuoteNumber);
			//se.element().enterText(getpwsearchQuoteOrPolicyNum(),QuoteNumber);
			se.element().Click(getpw_btn_search(), test);
			
			int count =0;
			while(se.element().isElementPresent(pw_searchspinner)) {
				se.util().sleep(3000);
				count++;
				if(count>5) {
					
					se.verify().verifyEquals("Search spinner to disappear", true, false, true, test);
					break;
				}
			}
			
			if(se.element().isElementPresent(pw_NoResultsofsearchedQuote)) {
				se.verify().verifyEquals("to show results for the quote number", true, false, true, test);
				
			}else if(se.element().isElementPresent(pw_searchresultsOfQuote)){
				String strCountOfQuotes = se.element().gettext(getpw_searchresultsCountOfQuotes(QuoteNumber));
				int intCountOfQuotes = Integer.parseInt(strCountOfQuotes);
				if(intCountOfQuotes>1) {
					se.element().Click(getpw_OpenQuoteBasedOnLOB(LOB), test);	
				}else if(intCountOfQuotes==1) {
					
					se.element().Click(getpw_OpenQuote(), test);
				}
			}
			
			/*if(!LOB.equalsIgnoreCase("N/A")){
				se.util().sleep(3000);
				if(se.element().isElementPresent(pw_LBL_PolicyGroupHeader)){
					se.element().Click(getpw_LNK_PolicyLinkText(LOB), test);
				}
				se.util().sleep(1000);
			}else if(se.element().isElementPresent(pw_LBL_PolicyGroupHeader)){

				se.element().Click(getpw_LNK_firstPolicyLinkText());
			}*/
			driver.switchTo().defaultContent();
		}catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("Issue with PWSearchQuote", true, false, true, test);
		}
	}

	public void hide_acordXml() 
	{
		String parentWindow = driver.getWindowHandle();
		Set<String> handles =  driver.getWindowHandles();
		for(String windowHandle  : handles)
		{
			if(!windowHandle.equals(parentWindow))
			{
				driver.switchTo().window(windowHandle);
				driver.manage().window().setPosition(new Point(-2000, 0));
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.setHeadless(true);
				driver.switchTo().window(parentWindow); //Control to parent window
			}
		}
	}  

	public void addNewWorkItem(String LOB, ExtentTest test) 
	{
		try{
			
			se.util().sleep(5000);
			se.element().Click(getaddWorkItem_BTN(), test);
			se.util().sleep(2000);
			se.element().Click(getstartNewWorkItem_BTN(), test);
			se.util().sleep(2000);
			se.element().Click(getselectLOB_LNK(LOB), test);
			se.util().sleep(2000);
		}catch(Exception e){
			se.util().sleep(5000);
			se.log().logTestStep("Exception in addNewWorkItem - " + e);
		}
	} 

	public void openQuoteInAP(String Quote, String strLOB, ExtentTest test){
		hide_acordXml();
		se.element().Click(getMyWork(), test);
		try {
			se.util().sleep(3000);
			
			se.element().Click(getclick_view(), test);
			se.element().Click(getClearAll(), test);
			se.util().sleep(2000);
			se.element().Click(getdropdown_MoreOptions(), test);
			se.element().enterText(gettxt_quoteOrPolicyNumber(),Quote);
			se.element().Click(getcommon_searchBtn(), test);
			se.util().sleep(3000);
			if(!strLOB.equalsIgnoreCase("N/A")){
				se.element().Click(getopenQuotebasedonLOB(strLOB), test);
			}else{
				se.element().Click(getCardHeader(), test);
			}
			se.element().Click(getBtneventWorkItemAction_Open(), test);
		}
		catch (StaleElementReferenceException e)
		{
			e.getStackTrace();
			e.getMessage();}
	}

	public void openAccountDetails(ExtentTest test){

		try {
			JavascriptExecutor executor  = (JavascriptExecutor) se.driver();
			executor.executeScript("arguments[0].scrollIntoView(0,500);", getclick_AccountLink());
			se.util().sleep(3000);
			se.element().Click(getclick_AccountLink(), test);
		}
		catch (StaleElementReferenceException e)
		{
			e.getStackTrace();
			e.getMessage();}
	}

	public void getDashboardActions(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		try{
			if(suspendSheet.equalsIgnoreCase("PW_DashboardActions")){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
			List<Map<String, String>> table = ExcelOperations.getPagesData("PW_DashboardActions", strRegressionID,transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strDasboard_LNK_Actions = (String) row.get("Dashboard_LNK_Actions");
				String strDashboardStatus = (String) row.get("Dashboard_LBL_Status");
				//String strDashboard_LNK_PriorTermTransaction = (String) row.get("Dashboard_LNK_PriorTermTransaction");
				//String strDashboard_LNK_PriorTermRevision = (String) row.get("Dashboard_LNK_PriorTermRevision");
				boolean DashboardStatus = false;
				try {
					se.log().logTestStep("Dashboard Actions");
					test.log(LogStatus.INFO, "Dashboard Actions","Transaction Step : " + transaction + "<br>" + "Page : Dashboard Actions");
					se.util().sleep(10000);
					if (!strDashboardStatus.equalsIgnoreCase("N/A")) {
						SwitchToDefaultAndThenSwitchToFrame();
						DashboardStatus = WaitForDashboardStatus(strRegressionID,transaction,strDashboardStatus,strDasboard_LNK_Actions,test);
					}
					se.util().sleep(5000);
					/*if (!strDashboard_LNK_PriorTermTransaction.equalsIgnoreCase("N/A")) {
						SwitchToDefaultAndThenSwitchToFrame();

						if( (strRegressionID.equalsIgnoreCase("WC_2")) && (transaction.equalsIgnoreCase("Renew2"))){
							se.element().Click(getDasboard_LNK_PriorTermTransaction1(strDashboard_LNK_PriorTermTransaction,
									strDashboard_LNK_PriorTermRevision), test);
							se.util().sleep(10000);
						}
						else {
							se.element().Click(getDasboard_LNK_PriorTermTransaction(strDashboard_LNK_PriorTermTransaction,
									strDashboard_LNK_PriorTermRevision), test);
							se.util().sleep(5000);
						}
					}*/
					SwitchToDefaultAndThenSwitchToFrame();
					if (!strDasboard_LNK_Actions.equalsIgnoreCase(constants.NA)&& !DashboardStatus==false && !strDasboard_LNK_Actions.equalsIgnoreCase("Approve")) {
						for(int i=0; i<=2;i++){
							try{
								se.element().waitForElementIsDisplayed(getDasboard_LNK_Actions(strDasboard_LNK_Actions), 100);
								se.verify().verifyEquals("DashboardActions Page of PowerWriter ",getDasboard_LNK_Actions(strDasboard_LNK_Actions).isDisplayed(), true, true, test);
								se.util().sleep(5000);
								se.element().Click(getDasboard_LNK_Actions(strDasboard_LNK_Actions), test);
								if(strDasboard_LNK_Actions.equalsIgnoreCase("Purge")) {
									se.util().sleep(5000);
									driver.switchTo().alert().accept();
								}
								break;
							}
							catch(Exception e){
								se.util().sleep(5000);
								se.log().logTestStep("Exception in Dashboard Actions - trying agin to click on Dasboard_LNK_Actions" + e);
							}
						}
						se.element().waitForElementToDisappear(bluelineIndicator, 5000);
						if (se.element().isElementPresent(spinner)) {
							se.element().waitForElementToDisappear(spinner, 5000);
						}
					}
					else if(DashboardStatus == false && !strDasboard_LNK_Actions.equalsIgnoreCase(constants.NA)){
						se.log().logTestStep("DashboardStatus is " + DashboardStatus + " For the transaction " + transaction);
						test.log(LogStatus.FAIL, "Failed","DashboardStatus is " + DashboardStatus + " For the transaction " + transaction);
					}
				driver.switchTo().defaultContent();
				} catch (Exception e) {
					e.printStackTrace();
					se.verify().verifyEquals("Failed to fill in details for Dashboard Actions ", true, false, true, test);
					se.log().logTestStep("Exception in Dashboard Actions - " + e);
					test.log(LogStatus.INFO, "Exception in Dashboard Actions  - " + e);
				}
				driver.switchTo().defaultContent();
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

	public boolean WaitForDashboardStatus(String strRegressionID,String transaction, String dataVal,String strDasboard_LNK_Actions, ExtentTest test) throws IOException {
		boolean flag = true;
		try {
			block: {

			int count = 0;
			int innercount = 0;
			while (flag) {
				se.verify().verifyEquals("Dashboard actions of PW ", getDashboard_LBL_QuoteStatus().isDisplayed(),true, true,test);
				
				if (getDashboard_LBL_QuoteStatus().getText().contains(dataVal)) {
					flag = true;
					se.log().logTestStep("DashboardStatus is - " + getDashboard_LBL_QuoteStatus().getText());
					test.log(LogStatus.INFO, 
							"DashboardStatus is - " + getDashboard_LBL_QuoteStatus().getText() + " For the transaction " + transaction,test.addScreenCapture(Util.captureScreenshot("DashboardStatus is " + getDashboard_LBL_QuoteStatus().getText() , se)));
					if(dataVal.equalsIgnoreCase("Approval Needed")&&getDashboard_LBL_QuoteStatus().getText().contains("Approval Needed")){
						se.element().Click(getDasboard_LNK_Actions(constants.Approve), test);
						UWApproval(strRegressionID,   transaction, test);
					}
					break block;
				} else {

					do{
						se.util().sleep(10000);
					}
					while (getDashboard_LBL_QuoteStatus().getText().contains("Document Generation - In Progress"));
					if (getDashboard_LBL_QuoteStatus().getText().contains("load error")) {
						flag = false;
						se.log().logTestStep("DashboardStatus is - " + getDashboard_LBL_QuoteStatus().getText());
						test.log(LogStatus.WARNING, 
								"DashboardStatus is - " + getDashboard_LBL_QuoteStatus().getText() + " For the transaction " + transaction,test.addScreenCapture(Util.captureScreenshot("DashboardStatus is " + getDashboard_LBL_QuoteStatus().getText().substring(0, 15) , se)));

						break block;
					}
					if (getDashboard_LBL_QuoteStatus().getText().contains("Redo")) {
						flag = false;
						se.log().logTestStep("DashboardStatus is - " + getDashboard_LBL_QuoteStatus().getText());
						test.log(LogStatus.WARNING, 
								"DashboardStatus is - " + getDashboard_LBL_QuoteStatus().getText() + " For the transaction " + transaction,test.addScreenCapture(Util.captureScreenshot("DashboardStatus contains Redo ", se)));
						//se.verify().verifyEquals("Dashboard Status contains Redo",true,false, true,test);
						Assert.fail();
						break block;
					}
					if (dataVal.equalsIgnoreCase("Approval Needed")&&!getDashboard_LBL_QuoteStatus().getText().contains("Approval Needed")) {
						innercount++;
						if (innercount >= 4) {
							flag = true;
							se.log().logTestStep("Timed out waiting for expected DashboardStatus "+dataVal+" , Actual status is - " + getDashboard_LBL_QuoteStatus().getText()+" And Count is "+count+ " For the transaction " + transaction);
							test.log(LogStatus.WARNING, 
									"Timed out waiting for expected DashboardStatus "+dataVal+" , Actual status is - " + getDashboard_LBL_QuoteStatus().getText()+" And Count is "+count + " For the transaction " + transaction,test.addScreenCapture(Util.captureScreenshot("DashboardStatus is - " + getDashboard_LBL_QuoteStatus().getText() , se)));
							break block;

						}

					}
					se.element().refreshBrowser();
					se.util().sleep(20000);

					SwitchToDefaultAndThenSwitchToFrame();
					count++;
				}
				if (count == 15) {
					flag = false;
					se.log().logTestStep("Timed out waiting for expected DashboardStatus "+dataVal+" , Actual status is - " + getDashboard_LBL_QuoteStatus().getText()+" And Count is "+count+ " For the transaction " + transaction);
					test.log(LogStatus.WARNING,
							"Timed out waiting for expected DashboardStatus "+dataVal+" , Actual status is - " + getDashboard_LBL_QuoteStatus().getText()+" And Count is "+count + " For the transaction " + transaction,test.addScreenCapture(Util.captureScreenshot("DashboardStatus is - " + getDashboard_LBL_QuoteStatus().getText() , se)));
					break block;

				}
				continue;

			}
		}
		return flag;
		} catch (Exception e) {
			se.log().logTestStep("Failed at WaitForDashboardStatus - " + e);
			return flag;
		}
	}

	public void SwitchToDefaultAndThenSwitchToFrame() throws IOException {
		try {

			driver.switchTo().defaultContent();
			driver.switchTo().frame(getDashboard_Iframe_TitlesReportFrame());
		} catch (Exception e) {

			se.log().logTestStep("Failed at SwitchToDefaultAndThenSwitchToFrame - " + e);

		}

	}
	public void SwitchToFrameofSearchresults() throws IOException {
		try {

			driver.switchTo().defaultContent();
			driver.switchTo().frame(getDashboard_Iframe_searchFrame());
		} catch (Exception e) {

			se.log().logTestStep("Failed at SwitchToFrameofSearchresults - " + e);

		}

	}
	
	public void SwitchToFrameSummaryScreen() throws IOException {
		try {

			driver.switchTo().defaultContent();
			driver.switchTo().frame(getPremiumSummary_IFrame());
		} catch (Exception e) {

			se.log().logTestStep("Failed at SwitchToFrameSummaryScreen - " + e);

		}

	}
	public void UWApproval(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		//	try{
		//
		//	String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
		//	if (SuspendSheet.equalsIgnoreCase("UnderwritingApproval")) {
		//		test.log(LogStatus.INFO, "Page Suspended :- ",
		//				"Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
		//		testTearDown(se, test);
		//	}
		List<Map<String, String>> table = ExcelOperations.getPagesData("PW_DashboardActions", strRegressionID,transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strUnderwritingApproval_TXT_Comment = (String) row.get("UnderwritingApproval_TXT_Comment");
			String strDashboardStatus = (String) row.get("Dashboard_LBL_Status");
			try {
				if(strDashboardStatus.equalsIgnoreCase("Approval Needed")&&getDashboard_LBL_QuoteStatus().getText().contains("Approval Needed")){
					se.log().logTestStep("UW approval");
					test.log(LogStatus.INFO, "UW approval",
							"Transaction Step : " + transaction + "<br>" + "Page : UW approval");
					SwitchToDefaultAndThenSwitchToFrame();
					se.element().waitForElementIsDisplayed(getUnderwritingApproval_TXT_Comment(strUnderwritingApproval_TXT_Comment), 10);
					se.verify().verifyEquals("UW approval Page of PowerWriter ",
							getUnderwritingApproval_TXT_Comment(strUnderwritingApproval_TXT_Comment).isDisplayed(), true,
							true, test);
					SwitchToDefaultAndThenSwitchToFrame();
					se.util().sleep(3000);
					se.element().enterText(getUnderwritingApproval_TXT_Comment(strUnderwritingApproval_TXT_Comment),
							strUnderwritingApproval_TXT_Comment, test);
					se.element().Click(getUnderwritingApproval_BTN_Approve(), test);


				}
			} catch (Exception e) {
				se.verify().verifyEquals("Failed to fill in details for UW Approval", true, false, true, test);

			}
			iteration++;
		}

		//	} catch (Exception e) {
		//		// TODO: handle exception
		//		se.log().logTestStep(
		//				"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
		//		test.log(LogStatus.FAIL, "Failed",
		//				"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
		//		testTearDown(se, test);
		//	}

	}

	public void getCalculatePremium(String strRegressionID,String NumberOfEmployees, String transaction, ExtentTest test) throws IOException {

		try {
			se.log().logTestStep("Clicked on calculatePremium");
			test.log(LogStatus.INFO, "Clicked on calculatePremium",
					"Transaction Step : " + transaction + "<br>" + "Page : CalculatePremium");
			se.element().waitForElementIsDisplayed(common_btn_CalPrem, 100);
			se.element().enterOrValidateText(getProductInfo_TXT_NumberofEmployees(NumberOfEmployees),NumberOfEmployees,test);
			se.util().sleep(5000);
			if(se.element().isElementPresent(common_btn_CalPrem)) {
				
				se.element().Click(getCalprem(), test);
				se.element().waitForElementToDisappear(spinner, 5000);
				se.util().sleep(10000);
				
			}else {
				test.log(LogStatus.FAIL, 
						"Calculate Premium button is not displayed" , test.addScreenCapture(Util.captureScreenshot("Calculate Premium button is not displayed" , se)));
				se.verify().verifyEquals("Calculate premium button is not displayed ", true, false, true, test);

			}
			

			// Below commented code was specifically used for CP Multi scenario
			// before Framework level changes, to handle a workaround
			// String strAddl_LocationNo = (String) row.get("Addl_LocationNo");
			/*
			 * if(strTestScenario.equalsIgnoreCase("Scenario_Four")){
			 * se.util().sleep(10000);
			 * if(se.element().isElementPresent(getErrorArrowButton())){
			 * se.element().Click(getErrorArrowButton(),test);
			 * se.util().sleep(5000); se.element().clickElement(
			 * BTN_AdditionalInterestBuildingLocationNo,test);
			 * se.util().sleep(1000);
			 * se.element().Click(getAdditionalInterestSelectLocationNo(
			 * strAddl_LocationNo),test); se.util().sleep(1000);
			 * se.element().Click(getCalprem(),test); } }
			 */
			se.util().sleep(5000);
			if (se.element().isElementPresent(Infoyesbutton)) {
				test.log(LogStatus.INFO, "Info Yes button is visible on popup");
				se.element().waitForElement(Infoyesbutton);
				se.element().Click(getInfoyesbutton(), test);
				test.log(LogStatus.INFO, "Clicked on Info Yes button on popup");
			}

			if (se.element().isElementPresent(Wariningyesbutton)) {
				test.log(LogStatus.INFO, "Warning Yes button is visible on popup");
				se.element().Click(getWariningyesbutton(), test);
				se.element().Click(getCalprem(), test);
				test.log(LogStatus.INFO, "Clicked on Warning Yes button on popup");
			}
			if (se.element().isElementPresent(pwError_Btn_Nxt)) {
				se.element().Click(getpwError_Btn_Nxt(), test);
				test.log(LogStatus.FAIL,"PW application - error after calculating premium  ",test.addScreenCapture(Util.captureScreenshot("UnexpectedError after calculating premium" , se)));
				se.verify().verifyEquals("PW application - error after calculating premium  ", true, false, true, test);

			}
			se.element().waitForElementToDisappear(bluelineIndicator, 5000);
			se.element().waitForElementToDisappear(spinner, 5000);
			se.util().sleep(10000);
			if(transaction.equalsIgnoreCase("PWConvertToPolicy")) {
				SwitchToFrameSummaryScreen();
			}
		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("Failed to fill in details for calculatePremium ", true, false, true, test);

			se.log().logTestStep("Exception in calculatePremium - " + e);
			test.log(LogStatus.INFO, "Exception in calculate premium  - " + e);

		}
	}
	public void getCompleteTransaction(String strRegressionID, String transaction, ExtentTest test) throws IOException {

		try {
			se.log().logTestStep("Clicked on completetransaction");
			test.log(LogStatus.INFO, "Clicked on completetransaction",
					"Transaction Step : " + transaction + "<br>" + "Page : completetransaction");
			driver.switchTo().defaultContent();
			
			if(se.element().isElementPresent(common_BTN_completetranx)) {
				se.element().Click(getcommon_BTN_completetranx(), test);
				se.element().waitForElementToDisappear(spinner, 5000);
				se.util().sleep(10000);
				
			}else {
				test.log(LogStatus.FAIL, 
						"Complete Transaction button is not displayed" , test.addScreenCapture(Util.captureScreenshot("Complete Transaction button is not displayed" , se)));
				se.verify().verifyEquals("Complete Transaction button is not displayed ", true, false, true, test);

			}
		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("Failed to fill in details for Complete Transaction ", true, false, true, test);

			se.log().logTestStep("Exception in Complete Transaction - " + e);
			test.log(LogStatus.INFO, "Exception in  Complete Transaction  - " + e);

		}
	}

	public String retrievePolicyNumber(ExtentTest test) throws IOException {
		String policyNumber =null;
		try {
			//driver.switchTo().frame(getPremiumSummary_IFrame());
			String strPremiumSummary_GeneralInfo_PolicyNumber = getPremiumSummary_GeneralInfo_QuoteNumber().getText().trim();
			String[] strtestdata =strPremiumSummary_GeneralInfo_PolicyNumber.split("-");
			policyNumber = strtestdata[2];
			policyNumber=policyNumber.substring(2);

			driver.switchTo().defaultContent();
			test.log(LogStatus.INFO, "Policy Number" + "<b style='color:blue;'>"+policyNumber+"</b>");
			return policyNumber;
		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("Failed to fill in details for retrieve Policy Number ", true, false, true, test);

			se.log().logTestStep("Exception in Dashboard Actions - " + e);
			test.log(LogStatus.INFO, "Exception in Dashboard Actions  - " + e);

		}
		return policyNumber;

	}

	public boolean WaitForOOSEStatus(String transaction, String dataVal,String StatusRowNo, ExtentTest test) throws IOException {
		boolean flag = true;
		try {
			block: {

			int count = 0;
			while (flag) {

				if (getDashboardOOSE_LBL_Status(StatusRowNo).getText().contains(dataVal)) {
					flag = true;
					se.log().logTestStep("DashboardStatus is - " + getDashboardOOSE_LBL_Status(StatusRowNo).getText());
					test.log(LogStatus.INFO, "Info",
							"DashboardStatus is - " + getDashboardOOSE_LBL_Status(StatusRowNo).getText() + " For the transaction " + transaction);
					break block;
				} else {
					if (getDashboardOOSE_LBL_Status(StatusRowNo).getText().contains("load error")) {
						flag = false;
						se.log().logTestStep("DashboardStatus is - " + getDashboardOOSE_LBL_Status(StatusRowNo).getText());
						test.log(LogStatus.WARNING, "Warning",
								"DashboardStatus is - " + getDashboardOOSE_LBL_Status(StatusRowNo).getText() + " For the transaction " + transaction);
						break block;
					}

					se.util().sleep(20000);
					count++;
				}
				if (count == 15) {
					flag = false;
					se.log().logTestStep("Timed out waiting for expected DashboardStatus "+dataVal+" , Actual status is - " + getDashboardOOSE_LBL_Status(StatusRowNo).getText()+" And Count is "+count+ " For the transaction " + transaction);
					test.log(LogStatus.WARNING, "Warning",
							"Timed out waiting for expected DashboardStatus "+dataVal+" , Actual status is - " + getDashboardOOSE_LBL_Status(StatusRowNo).getText()+" And Count is "+count + " For the transaction " + transaction);

					break block;

				}
				continue;

			}
		}
		return flag;
		} catch (Exception e) {
			se.log().logTestStep("Failed at WaitForDashboardStatus - " + e);
			return flag;
		}
	}

	public void getUpdateFormsVariable(Map<String, String> row, String transaction, ExtentTest test)
			throws IOException {

		String strDashboardFormsUpdate_LNK_Variable = (String) row.get("DashboardFormsUpdate_LNK_Variable");
		String strDashboardFormsUpdate_TXT_Variable1 = (String) row.get("DashboardFormsUpdate_TXT_Variable1");
		String strDashboardFormsUpdate_TXT_Variable2 = (String) row.get("DashboardFormsUpdate_TXT_Variable2");
		String strDashboardFormsUpdate_TXT_Variable3 = (String) row.get("DashboardFormsUpdate_TXT_Variable3");
		String strDashboardFormsUpdate_TXT_Variable4 = (String) row.get("DashboardFormsUpdate_TXT_Variable4");
		String strDashboardFormsUpdate_TXT_Variable5 = (String) row.get("DashboardFormsUpdate_TXT_Variable5");
		String strDashboardFormsUpdate_TXT_Variable6 = (String) row.get("DashboardFormsUpdate_TXT_Variable6");
		String strDashboardFormsUpdate_TXT_Variable7 = (String) row.get("DashboardFormsUpdate_TXT_Variable7");
		String strDashboardFormsUpdate_TXT_Variable8 = (String) row.get("DashboardFormsUpdate_TXT_Variable8");
		String strDashboardFormsUpdate_TXT_Variable9 = (String) row.get("DashboardFormsUpdate_TXT_Variable9");
		String strDashboardFormsUpdate_TXT_Variable18 = (String) row.get("DashboardFormsUpdate_TXT_Variable18");

		try {
			se.log().logTestStep("UpdateFormsVariable");

			test.log(LogStatus.INFO, "UpdateFormsVariable",
					"Transaction Step : " + transaction + "<br>" + "Page : UpdateFormsVariable");
			SwitchToDefaultAndThenSwitchToFrame();
			se.element().waitForElementIsDisplayed(Dashboard_TAB_FormsSelected, 100);
			se.verify().verifyEquals("DashboardForms Page of PowerWriter ", getDashboard_TAB_Forms().isDisplayed(),
					true, true, test);

			SwitchToDefaultAndThenSwitchToFrame();
			if (!strDashboardFormsUpdate_LNK_Variable.equalsIgnoreCase(constants.NA)) {
				se.element().Click(getDashboardFormsUpdate_LNK_Variable(strDashboardFormsUpdate_LNK_Variable), test);

				SwitchToDefaultAndThenSwitchToFrame();
				if(strDashboardFormsUpdate_TXT_Variable1.equalsIgnoreCase("date")){

					strDashboardFormsUpdate_TXT_Variable1 = Util.FutureDate(0).replaceAll("-", "/");
				} if(strDashboardFormsUpdate_TXT_Variable2.equalsIgnoreCase("date")){

					strDashboardFormsUpdate_TXT_Variable2 =  Util.FutureDate(0).replaceAll("-", "/");

				} if(strDashboardFormsUpdate_TXT_Variable3.equalsIgnoreCase("date")){

					strDashboardFormsUpdate_TXT_Variable3 =  Util.FutureDate(0).replaceAll("-", "/");

				}
				se.element().enterOrValidateText(
						getDashboardFormsUpdate_TXT_Variable1(strDashboardFormsUpdate_TXT_Variable1),
						strDashboardFormsUpdate_TXT_Variable1, test);
				se.element().enterOrValidateText(
						getDashboardFormsUpdate_TXT_Variable2(strDashboardFormsUpdate_TXT_Variable2),
						strDashboardFormsUpdate_TXT_Variable2, test);
				se.element().enterOrValidateText(
						getDashboardFormsUpdate_TXT_Variable3(strDashboardFormsUpdate_TXT_Variable3),
						strDashboardFormsUpdate_TXT_Variable3, test);
				se.element().enterOrValidateText(
						getDashboardFormsUpdate_TXT_Variable4(strDashboardFormsUpdate_TXT_Variable4),
						strDashboardFormsUpdate_TXT_Variable4, test);
				se.element().enterOrValidateText(
						getDashboardFormsUpdate_TXT_Variable5(strDashboardFormsUpdate_TXT_Variable5),
						strDashboardFormsUpdate_TXT_Variable5, test);
				se.element().enterOrValidateText(
						getDashboardFormsUpdate_TXT_Variable6(strDashboardFormsUpdate_TXT_Variable6),
						strDashboardFormsUpdate_TXT_Variable6, test);
				se.element().enterOrValidateText(
						getDashboardFormsUpdate_TXT_Variable7(strDashboardFormsUpdate_TXT_Variable7),
						strDashboardFormsUpdate_TXT_Variable7, test);
				se.element().enterOrValidateText(
						getDashboardFormsUpdate_TXT_Variable8(strDashboardFormsUpdate_TXT_Variable8),
						strDashboardFormsUpdate_TXT_Variable8, test);
				se.element().enterOrValidateText(
						getDashboardFormsUpdate_TXT_Variable9(strDashboardFormsUpdate_TXT_Variable9),
						strDashboardFormsUpdate_TXT_Variable9, test);
				se.element().enterOrValidateText(
						getDashboardFormsUpdate_TXT_Variable18(strDashboardFormsUpdate_TXT_Variable18),
						strDashboardFormsUpdate_TXT_Variable18, test);
				se.element().Click(getDashboardFormsUpdate_BTN_OK(strDashboardFormsUpdate_LNK_Variable), test);
			}

		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("Failed to fill in details for UpdateFormsVariable ", true, false, true, test);

			se.log().logTestStep("Exception in UpdateFormsVariable - " + e);
			test.log(LogStatus.INFO, "Exception in UpdateBUpdateFormsVariableillingTab  - " + e);

		}

	}

	public void getAddForms(Map<String, String> row, ExtentTest test) throws IOException {

		String strDashboardForms_BTN_AddForms = (String) row.get("DashboardForms_BTN_AddForms");
		String strDashboardForms_TXT_SearchFormByName = (String) row.get("DashboardForms_TXT_SearchFormByName");

		try {
			se.log().logTestStep("Add Forms");
			String transaction = (String) row.get("Transaction Name");
			test.log(LogStatus.INFO, "Add Forms", "Transaction Step : " + transaction + "<br>" + "Page : Add Forms");
			SwitchToDefaultAndThenSwitchToFrame();
			se.element().waitForElementIsDisplayed(Dashboard_TAB_FormsSelected, 100);
			se.verify().verifyEquals("DashboardForms Page of PowerWriter ", getDashboard_TAB_Forms().isDisplayed(),
					true, true, test);

			if (strDashboardForms_BTN_AddForms.equalsIgnoreCase("Yes")) {
				se.element().Click(getDashboardForms_BTN_AddForms(strDashboardForms_BTN_AddForms), test);
				SwitchToDefaultAndThenSwitchToFrame();
				se.element().waitForElementIsDisplayed(DashboardForms_TXT_SearchFormByName, 100);
				se.verify().verifyEquals("DashboardForms Page of PowerWriter ",
						getDashboardForms_TXT_SearchFormByName(strDashboardForms_TXT_SearchFormByName).isDisplayed(),
						true, true, test);
				se.element().checkUncheckOrValidate(getDashboardForms_CHK_ShowAll(), "", test);
				SwitchToDefaultAndThenSwitchToFrame();
				se.element().enterOrValidateText(
						getDashboardForms_TXT_SearchFormByName(strDashboardForms_TXT_SearchFormByName),
						strDashboardForms_TXT_SearchFormByName, test);
				se.element().Click(getDashboardForms_BTN_SearchForm(strDashboardForms_TXT_SearchFormByName), test);
				se.util().sleep(5000);
				se.element().checkUncheckOrValidate(
						getDashboardForms_CHK_SelectForm(strDashboardForms_TXT_SearchFormByName),"Check",
						test);
				se.element().Click(getDashboardForms_BTN_Add(strDashboardForms_TXT_SearchFormByName), test);

			}

		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("Failed to fill in details for Add Forms ", true, false, true, test);

			se.log().logTestStep("Exception in Add Forms - " + e);
			test.log(LogStatus.INFO, "Exception in Add Forms  - " + e);

		}

	}

	public void getDashboardForms(String strRegressionID, String transaction, String SuspendSheet,ExtentTest test) throws IOException {
		try{
			if (SuspendSheet.equalsIgnoreCase(constants.Dashboard_Forms)) {
				test.log(LogStatus.INFO, "Page Suspended :- ",
						"Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
				testTearDown(se, test);
			}
			List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Dashboard_Forms, strRegressionID,
					transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strDashboardForms_BTN_Complete = (String) row.get("DashboardForms_BTN_Complete");
				String strDashboardOOSE_LNK_FixitOrCompleteRowNo = (String) row
						.get("DashboardOOSE_LNK_FixitOrCompleteRowNo");
				String strDashboardOOSE_LBL_StatusRowNo = (String) row.get("DashboardOOSE_LBL_StatusRowNo");
				String strDashboardOOSE_LBL_Status = (String) row.get("DashboardOOSE_LBL_Status");
				String strDashboardOOSE_BTN_BookAllRevesions = (String) row.get("DashboardOOSE_BTN_BookAllRevesions");
				String strDashboardForms_TXT_SearchFormByName = (String) row.get("DashboardForms_TXT_SearchFormByName");
				String strDashboardFormsUpdate_LNK_Variable = (String) row.get("DashboardFormsUpdate_LNK_Variable");
				String strDashboardForms_BTN_Modify =  (String) row.get("DashboardForms_BTN_Modify");
				String strDashboardForms_LBL_Status  = (String) row.get("DashboardForms_LBL_Status");
				try {
					se.log().logTestStep("Dashboard Forms");
					test.log(LogStatus.INFO, "Dashboard Forms",
							"Transaction Step : " + transaction + "<br>" + "Page : Dashboard Forms");

					if(!strDashboardForms_TXT_SearchFormByName.equalsIgnoreCase(constants.NA)||!strDashboardFormsUpdate_LNK_Variable.equalsIgnoreCase(constants.NA)){
						se.util().sleep(3000);
						SwitchToDefaultAndThenSwitchToFrame();

						if(!strDashboardForms_BTN_Modify.equalsIgnoreCase(constants.NA)){
							WaitForDashboardStatus(strRegressionID,transaction,strDashboardForms_LBL_Status,"N/A",test);
							se.element().Click(getDashboardFormsTab_TAB_FormsTab(), test);
							se.element().waitForElementIsDisplayed(DashboardForms_BTN_Modify, 180);
							se.element().Click(getDashboardForms_BTN_Modify(strDashboardForms_BTN_Modify),
									strDashboardForms_BTN_Modify, test);

						}
						se.util().sleep(10000);
						SwitchToDefaultAndThenSwitchToFrame();
						se.element().waitForElementIsDisplayed(Dashboard_TAB_FormsSelected, 100);
						se.verify().verifyEquals("DashboardForms Page of PowerWriter ", getDashboard_TAB_Forms().isDisplayed(),
								true, true, test);

						if (!strDashboardOOSE_LNK_FixitOrCompleteRowNo.equalsIgnoreCase(constants.NA)) {
							driver.switchTo().defaultContent();
							se.element().waitForElementIsDisplayed(
									getDashboardOOSE_LNK_FixItOrComplete(strDashboardOOSE_LNK_FixitOrCompleteRowNo), 100);
							se.element().Click(getDashboardOOSE_LNK_FixItOrComplete(strDashboardOOSE_LNK_FixitOrCompleteRowNo),
									test);
						}

						getAddForms(row, test);
						getUpdateFormsVariable(row, transaction, test);
						if (!strDashboardForms_BTN_Complete.equalsIgnoreCase(constants.NA)) {
							se.element().waitForElementIsDisplayed(DashboardForms_BTN_Complete, 1000);
							se.element().Click(getDashboardForms_BTN_Complete((strDashboardForms_BTN_Complete)),
									strDashboardForms_BTN_Complete, test);
						}
					}
					if (!strDashboardOOSE_LNK_FixitOrCompleteRowNo.equalsIgnoreCase(constants.NA)) {
						se.util().sleep(10000);
						driver.switchTo().defaultContent();
						if (strDashboardOOSE_LBL_Status.equalsIgnoreCase("Approval Needed")) {
							if (se.element().isElementPresent(DashboardOOSE_LBL_OOSEPopup)) {
								se.element().waitForElementIsDisplayed(
										getDashboardOOSE_LNK_FixItOrComplete(strDashboardOOSE_LNK_FixitOrCompleteRowNo), 10);
								se.element().Click(
										getDashboardOOSE_LNK_FixItOrComplete(strDashboardOOSE_LNK_FixitOrCompleteRowNo), test);
								se.util().sleep(3000);
								SwitchToDefaultAndThenSwitchToFrame();
								se.element().Click(getDasboard_LNK_Actions("Approve"), test);
								UWApproval(strRegressionID,   transaction, test);
								driver.switchTo().defaultContent();
								se.util().sleep(10000);
							} else {
								// se.element().refreshBrowser();
								SwitchToDefaultAndThenSwitchToFrame();
								se.element().Click(getDashboard_LBL_QuoteStatus(), test);
								se.util().sleep(10000);
								driver.switchTo().defaultContent();
								se.element().waitForElementIsDisplayed(
										getDashboardOOSE_LNK_FixItOrComplete(strDashboardOOSE_LNK_FixitOrCompleteRowNo), 100);
								se.element().Click(
										getDashboardOOSE_LNK_FixItOrComplete(strDashboardOOSE_LNK_FixitOrCompleteRowNo), test);
								se.util().sleep(3000);
								SwitchToDefaultAndThenSwitchToFrame();
								se.element().Click(getDasboard_LNK_Actions("Approve"), test);
								UWApproval(strRegressionID,   transaction, test);
								driver.switchTo().defaultContent();
								se.util().sleep(10000);
							}

						}

						if (se.element().isElementPresent(DashboardOOSE_LBL_OOSEPopup)) {
							se.util().sleep(30000);
							se.element().waitForElementIsDisplayed(
									getDashboardOOSE_LNK_FixItOrComplete(strDashboardOOSE_LNK_FixitOrCompleteRowNo), 10);
							se.element().Click(
									getDashboardOOSE_LNK_FixItOrComplete(strDashboardOOSE_LNK_FixitOrCompleteRowNo), test);

						} else {
							// se.element().refreshBrowser();
							SwitchToDefaultAndThenSwitchToFrame();
							se.element().Click(getDashboard_LBL_QuoteStatus(), test);
							se.util().sleep(10000);
							driver.switchTo().defaultContent();
							se.element().waitForElementIsDisplayed(
									getDashboardOOSE_LNK_FixItOrComplete(strDashboardOOSE_LNK_FixitOrCompleteRowNo), 100);
							se.element().Click(
									getDashboardOOSE_LNK_FixItOrComplete(strDashboardOOSE_LNK_FixitOrCompleteRowNo), test);
						}

					}
					if (strDashboardOOSE_BTN_BookAllRevesions.equalsIgnoreCase("Yes")) {
						se.util().sleep(30000);
						WaitForOOSEStatus(transaction,"Ready for Booking",strDashboardOOSE_LBL_StatusRowNo,test);
						se.element().Click(getDashboardOOSE_BTN_BookAllRevesions(strDashboardOOSE_BTN_BookAllRevesions),
								test);
						se.util().sleep(30000);
						se.element().waitForElementToDisappear(bluelineIndicator, 5000);
						se.element().waitForElementToDisappear(overalyRequestProcessing, 5000);
					}


				} catch (Exception e) {
					e.printStackTrace();
					se.verify().verifyEquals("Failed to fill in details for Dashboard Forms ", true, false, true, test);

					se.log().logTestStep("Exception in Dashboard Forms - " + e);
					test.log(LogStatus.INFO, "Exception in Dashboard Forms  - " + e);
				}
				iteration++;
			}

		} catch (Exception e) {
			// TODO: handle exception
			se.log().logTestStep(
					"Issue in the page " + " Dashboard Forms" + " For the transaction " + transaction);
			test.log(LogStatus.FAIL, "Failed",
					"Issue in the page " + " Dashboard Forms" + " For the transaction " + transaction);
			testTearDown(se, test);
		}

	}
	public void getverifyFleetinPW(String transaction, String Fleet,ExtentTest test) throws IOException {
		try {
			NavigateTotabsinPW("Commercial Auto", test);
			String Fleet1= "validate2="+Fleet+"|E";
			se.element().checkUncheckOrValidate(getCA_CHK_Fleet(Fleet1),Fleet1,test);
			
			test.log(LogStatus.INFO, 
					"FleetStatus is - " +Fleet+ " For the transaction " + transaction,test.addScreenCapture(Util.captureScreenshot("FleetStatus" , se)));
		
		}catch(Exception e) {
			se.verify().verifyEquals("Failed to verify Fleet" , true, false, true, test);
		}
	}
	public void NavigateTotabsinPW(String Page, ExtentTest test) throws IOException {
		try {
			se.util().sleep(3000);
			se.element().Click(getNavigatetoPageinPW(Page), test);
			se.util().sleep(3000);
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to Navigate to " + Page, true, false, true, test);
		}
	}
	public boolean APSearchPolicyNumber(String quote,ExtentTest test) throws IOException{
		//kept wait to changes status to issued in AP.
		//se.util().sleep(60000);
		boolean flag = true;
		se.element().Click(getMyWork(), test);
		se.util().sleep(2000);
		se.element().Click(getClearAll(), test);

		try {
			
			se.element().Click(getclick_view(), test);
			se.element().Click(getdropdown_MoreOptions(), test);

			se.element().enterText(gettxt_quoteOrPolicyNumber(),quote);

			se.element().Click(getcommon_searchBtn(), test);
			se.util().sleep(5000);
			
			if(quote.startsWith("24")){
				flag = se.element().isElementPresent(cardHeader);
				if(!flag){
				se.util().sleep(10000);
				se.element().Click(getMyWork(), test);
				se.util().sleep(2000);
				se.element().Click(getClearAll(), test);
				se.element().Click(getclick_view(), test);
				se.element().Click(getdropdown_MoreOptions(), test);

				se.element().enterText(gettxt_quoteOrPolicyNumber(),quote);

				se.element().Click(getcommon_searchBtn(), test);
				se.util().sleep(5000);
				}
				int count =0;
				while(!se.element().isElementPresent(cardHeader)) {
					se.util().sleep(60000);
					se.browser().refresh();
					se.element().waitForLoad(120);
					flag = se.element().isElementPresent(cardHeader);
					if(count==2){
						
						break;
					}
					test.log(LogStatus.INFO,"Search quoteOrPolicyNumber on AP - "+ quote,test.addScreenCapture(Util.captureScreenshot("Search quoteOrPolicyNumber on AP" , se)));
					count++;
				}
				
				se.element().Click(getMyWork(), test);
			}
			test.log(LogStatus.INFO,"Search quoteOrPolicyNumber on AP - "+ quote,test.addScreenCapture(Util.captureScreenshot("Search quoteOrPolicyNumber on AP" , se)));
			
			se.element().Click(getCardHeader(), test);
			se.element().Click(getBtneventWorkItemAction_Open(), test);


		}
		catch (StaleElementReferenceException e)
		{
			se.element().Click(getclick_view(), test);


			se.element().Click(getdropdown_MoreOptions(), test);

			se.element().enterText(gettxt_quoteOrPolicyNumber(),quote); 

			se.element().Click(getcommon_searchBtn(), test);
			se.util().sleep(3000);
			
			if(quote.startsWith("24")){
				flag = se.element().isElementPresent(cardHeader);
				if(!flag){
				se.util().sleep(10000);
				se.element().Click(getMyWork(), test);
				se.util().sleep(2000);
				se.element().Click(getClearAll(), test);
				se.element().Click(getclick_view(), test);
				se.element().Click(getdropdown_MoreOptions(), test);

				se.element().enterText(gettxt_quoteOrPolicyNumber(),quote);

				se.element().Click(getcommon_searchBtn(), test);
				se.util().sleep(5000);
				}
				int count =0;
				while(!se.element().isElementPresent(cardHeader)) {
					se.util().sleep(60000);
					se.browser().refresh();
					se.element().waitForLoad(120);
					flag = se.element().isElementPresent(cardHeader);
					if(count==2){
						
						break;
					}
					test.log(LogStatus.INFO,"Search quoteOrPolicyNumber on AP - "+ quote,test.addScreenCapture(Util.captureScreenshot("Search quoteOrPolicyNumber on AP" , se)));
					count++;
				}
				
				se.element().Click(getMyWork(), test);
			}
			test.log(LogStatus.INFO,"Search quoteOrPolicyNumber on AP - "+ quote,test.addScreenCapture(Util.captureScreenshot("Search quoteOrPolicyNumber on AP" , se)));
			
			se.element().Click(getCardHeader(), test);
			se.element().Click(getBtneventWorkItemAction_Open(), test);
		}
		return flag;
	}

	@SuppressWarnings("unused")
	public String  getQuoteNumber(String RegressionId,ExtentTest test) throws IOException {
		getAccountNumber(test);
		String jobTitle = se.element().getText(ap_quoteNo);
		String splitJobTitle[] = jobTitle.split("-");
		String getQuoteNo;
		if(!jobTitle.contains("Package")){
			String strtitleSplit[] = splitJobTitle[0].split("\\(");
			String getApplicantName[] = splitJobTitle[1].split("\\)");
			String ApplicantName = getApplicantName[0].trim();
			getQuoteNo = strtitleSplit[1].trim();
		}

		else{
			String strtitleSplit[] = splitJobTitle[1].split("\\)");
			String getQuote[] = splitJobTitle[0].split("\\(");
			String ApplicantName = strtitleSplit[0].trim();
			getQuoteNo = getQuote[2].trim();
		}
		System.out.println(getQuoteNo);

		test.log(LogStatus.INFO,"<b style='color:green;'>Quote #</b>", "<b style='background-color : yellow;'>"+getQuoteNo+"</b>");
		return getQuoteNo;
	}
	
	public String  getAccountNumber(ExtentTest test) throws IOException {
		String jobTitle = se.element().getText(ap_accntNo);
		
		String getAccountNo =jobTitle.substring(jobTitle.length()-7, jobTitle.length());
		
		
		System.out.println(getAccountNo);

		test.log(LogStatus.INFO,"<b style='color:green;'>Account #</b>", "<b style='background-color : yellow;'>"+getAccountNo+"</b>");
		return getAccountNo;
	}
	public   void GetPremiumRefresh(int i,ExtentTest test)
	{
		try{
		if(se.element().isElementPresent(PremiumIndication_Warning)) {
			
			String Ratingtext="";
				
				while(i>0) {
					
					se.browser().refresh();
					se.element().waitForLoad(120);
					
					if(!se.element().isElementPresent(PremiumIndication_Warning))
					{
						break;
					}
					else
					{
						 Ratingtext=se.element().getSelectedText(PremiumIndication_Warning);
						test.log(LogStatus.FAIL, "PremiumScreen rating error - "+Ratingtext, test.addScreenCapture(Util.captureScreenshot("Summary screen Ratingerror" , se)));
						i--;	
					}

				}
		}
		}catch(Exception e){
			test.log(LogStatus.FAIL, "Exception in  GetPremiumRefresh- ", e.toString());
			
		}
			
		}

	public   void GetPremiumIndicationRefresh(int i,ExtentTest test)
	{
		
		if(se.element().isElementPresent(PremiumIndication_Warning)) {
			try{
				test.log(LogStatus.WARNING, "PI screen Rating error due to more processing time - ", test.addScreenCapture(Util.captureScreenshot("Summary screen Ratingerror" , se)));
				
				while(i>0) {
					
					se.element().Click(getPremiumIndication_WarningClickhere(), test);
					se.element().waitForLoad(120);
					
					if(!se.element().isElementPresent(PremiumIndication_Warning))
					{
						break;
					}
					else
					{
						test.log(LogStatus.WARNING, "PI screen Rating error due to more processing time - ", test.addScreenCapture(Util.captureScreenshot("Summary screen Ratingerror" , se)));
						i--;	
					}
			}
		}catch(Exception e){
			test.log(LogStatus.FAIL, "Exception in  getPIScreenPremiumRefresh- ", e.toString());
			
		}

	}
}
	public   void GetSummaryScreenRefresh(int i,ExtentTest test)
	{
		
		if(se.element().isElementPresent(PremiumIndication_Warning)) {
			try{
				test.log(LogStatus.WARNING, "SummaryScreen Rating error due to more processing time - ", test.addScreenCapture(Util.captureScreenshot("Summary screen Ratingerror" , se)));
				
				while(i>0) {
					
					se.element().Click(getPremiumIndication_WarningClickhere(), test);
					se.element().waitForLoad(120);
					
					if(!se.element().isElementPresent(PremiumIndication_Warning))
					{
						break;
					}
					else
					{
						test.log(LogStatus.WARNING, "SummaryScreen Rating error due to more processing time - ", test.addScreenCapture(Util.captureScreenshot("Summary screen Ratingerror" , se)));
						i--;	
					}
			}
		}catch(Exception e){
			test.log(LogStatus.FAIL, "Exception in  GetSummaryScreenRefresh- ", e.toString());
			
		}

	}
}
	public   void GetSummaryHardStopRefresh(int i,ExtentTest test)
	{
		
		if(se.element().isElementPresent(Summary_RatingHardStop)) {
			try{
				test.log(LogStatus.WARNING, "SummaryScreen Rating error occurred in internal rating system - ", test.addScreenCapture(Util.captureScreenshot("Summary screen Ratingerror" , se)));
				
				while(i>0) {
					
					se.element().Click(getPremiumIndication_WarningClickhere(), test);
					se.element().waitForLoad(120);
					
					if(!se.element().isElementPresent(Summary_RatingHardStop))
					{
						break;
					}
					else
					{
						test.log(LogStatus.WARNING, "SummaryScreen Rating error occurred in internal rating system - ", test.addScreenCapture(Util.captureScreenshot("Summary screen Ratingerror" , se)));
						i--;	
					}
			}
		}catch(Exception e){
			test.log(LogStatus.FAIL, "Exception in  GetSummaryHardStopRefresh- ", e.toString());
			
		}

	}
}
	public   void getSummaryRatingErrorDueToMoreProcessingTime(int i,ExtentTest test)
	{
		
		if(se.element().isElementPresent(Summary_Warning)) {
			try{
				test.log(LogStatus.WARNING, "SummaryScreen Rating error due to more processing time - ", test.addScreenCapture(Util.captureScreenshot("Summary screen Ratingerror" , se)));
				
				while(i>0) {
					se.util().sleep(20000);
					se.element().Click(getSummary_RatingError_ClickHere(), test);
					se.element().waitForLoad(120);
					
					if(!se.element().isElementPresent(Summary_Warning))
					{
						break;
					}
					else
					{
						test.log(LogStatus.WARNING, "SummaryScreen Rating error due to more processing time - ", test.addScreenCapture(Util.captureScreenshot("Summary screen Ratingerror" , se)));
						i--;	
					}
			}
		}catch(Exception e){
			test.log(LogStatus.FAIL, "Exception in  getSummaryScreenPremiumRefresh- ", e.toString());
			
		}

	}
}
	public void refreshWhen502error(String screenName,int count, ExtentTest test){
try{
		if(se.driver().getTitle().contains("502")){
			 
			test.log(LogStatus.WARNING, screenName+" Screen 502 error - ", test.addScreenCapture(Util.captureScreenshot("502 Error" , se)));
			
			do{
				se.browser().refresh();
				se.element().waitForLoad(120);
				if(count<=0){
					break;
				}else{
				count--;
				}
			}
			while (se.driver().getTitle().contains("502"));
		}
	
}catch(Exception e){
	test.log(LogStatus.FAIL, "Exception in  refreshWhen502error- ", e.toString());
	
}
}
}

