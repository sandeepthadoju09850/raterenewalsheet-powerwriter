package pw.pages.COMMON;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.framework.Util;
import pw.Constants.constants;
import pw.OR.OR_Common;

public class PW_CommonMethods extends OR_Common {

	public void getCollapsetabs(Map<String, String> row, ExtentTest test) throws IOException {

		try {
			se.element().Click(getGenBtnExpOrCollapse(), "GenBtnExpOrCollapse", test);
			se.verify().verifyEquals("Clicked on Expand or collapse icon", getGenBtnExpOrCollapse().isDisplayed(),
					true);
			se.element().Click(getGenLnkCollapseAll(), "GenLnkCollapseAll", test);
			se.util().sleep(2000);
			if (getGenBtnExpOrCollapse().isDisplayed()) {
				se.element().Click(getGenBtnExpOrCollapse(), "GenBtnExpOrCollapse", test);
			}
			se.element().Click(getGenLnkProdInfoTab(), "GenLnkProdInfoTab", test);

		} catch (Exception e) {
			se.verify().verifyEquals("Collapse all tabs and navigate to ProdInfo is not successful", true, false, true,
					test);
		}

	}

	// **********************/
	public void getCalculatePremium(String strRegressionID, String transaction, ExtentTest test) throws IOException {

		try {
			se.log().logTestStep("Clicked on calculatePremium");
			test.log(LogStatus.INFO, "Clicked on calculatePremium",
					"Transaction Step : " + transaction + "<br>" + "Page : CalculatePremium");
			se.element().waitForElementIsDisplayed(common_btn_CalPrem, 100);
			se.element().Click(getCalprem(), test);

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
				se.util().sleep(3000);
				test.log(LogStatus.INFO, "Clicked on Warning Yes button on popup");
			}
			
			if(se.element().isElementPresent(NotifcationOKbutton)){
				se.element().waitForElement(NotifcationOKbutton);
				//se.verify().verifyEquals("Notification message ", getNotificationValidation_Label().isDisplayed(),true, true,test);
				se.element().Click(getNotifcationOKbutton(), test);
			}

			se.element().waitForElementToDisappear(bluelineIndicator, 9000);
			se.element().waitForElementToDisappear(spinner, 5000);
			se.util().sleep(10000);

		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("Failed to fill in details for calculatePremium ", true, false, true, test);
			se.log().logTestStep("Exception in calculatePremium - " + e);
			test.log(LogStatus.INFO, "Exception in calculate premium  - " + e);

		}
	}
	
	public void HandleAlertAndThenCalculatePremium(String strRegressionID, String transaction, ExtentTest test) throws IOException {

		try {
			se.log().logTestStep("Closing the Error Pop-up");
			test.log(LogStatus.INFO, "Clicked on Error pop-up",
					"Transaction Step : " + transaction + "<br>" + "Page : CalculatePremium");

			if(se.element().isElementPresent(Error_BTN)){
				se.element().Click(getError_BTN(), test);
			
			se.element().Click(getCalprem(), test);
			
			se.util().sleep(3000);
			if (se.element().isElementPresent(Infoyesbutton)) {
				se.element().waitForElement(Infoyesbutton);
				se.element().Click(getInfoyesbutton(), test);
			}
			
			se.element().waitForElementToDisappear(bluelineIndicator, 5000);
			se.element().waitForElementToDisappear(spinner, 5000);
			se.util().sleep(10000);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("Failed to fill in details for calculatePremium ", true, false, true, test);
			se.log().logTestStep("Exception in calculatePremium - " + e);
			test.log(LogStatus.INFO, "Exception in calculate premium  - " + e);

		}
	}
	public void HandleAlertfor3TimesAndThenCalculatePremium(String strRegressionID, String transaction, ExtentTest test) throws IOException {

		try {
			int ServerErrorCount=0;
			se.log().logTestStep("Closing the Redbox_Error Pop-up");
			test.log(LogStatus.INFO, "Clicked on Redbox_Error pop-up",
					"Transaction Step : " + transaction + "<br>" + "Page : CalculatePremium");

			
			do {
				se.util().sleep(3000);
				if(se.element().isElementPresent(Redbox_Error)){
				se.element().Click(getRedbox_Error(), test);
				se.element().Click(getCalprem(), test);
				se.util().sleep(3000);
				se.element().waitForElementToDisappear(bluelineIndicator, 5000);
				se.element().waitForElementToDisappear(spinner, 5000);
				se.util().sleep(10000);
			}else{
				se.element().Click(getCalprem(), test);
				se.util().sleep(3000);
				break;
			}
			
			}while(ServerErrorCount<4);

			
		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("Failed to close redbox error ", true, false, true, test);

			se.log().logTestStep("Exception while closing redbox error - " + e);
			test.log(LogStatus.INFO, "Exception while closing redbox error  - " + e);

		}
	}
	
	public void getCompleteTransaction(String strRegressionID, String transaction, ExtentTest test) throws IOException {

		try {
			se.log().logTestStep("Clicked on completetransaction");
			test.log(LogStatus.INFO, "Clicked on completetransaction",
					"Transaction Step : " + transaction + "<br>" + "Page : completetransaction");
			driver.switchTo().defaultContent();
			se.element().Click(getcommon_BTN_completetranx(), test);

		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("Failed to fill in details for calculatePremium ", true, false, true, test);

			se.log().logTestStep("Exception in calculatePremium - " + e);
			test.log(LogStatus.INFO, "Exception in calculate premium  - " + e);

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
	// Sheetal - added this method to handle the Manuscript Iframe on Forms Tab
	public void SwitchToDefaultAndThenSwitchToManuscriptFrame() throws IOException {
		try {

			//driver.switchTo().defaultContent();
			driver.switchTo().frame(getDashboard_Iframe_ManuscriptTextFrame());
		} catch (Exception e) {
			se.log().logTestStep("Failed at SwitchToDefaultAndThenSwitchToManuscriptFrame - " + e);

		}

	}
	
	// Sai - Added this method to handle the UI change of Quote no. search
	
	public void SwitchToDefaultThenSwitchToQuoteFrame() throws IOException {
		
		try {
			driver.switchTo().defaultContent();
			driver.switchTo().frame(getDashboard_Iframe_QuoteSearchFrame());
		} catch (Exception e) {

			se.log().logTestStep("Failed at SwitchToDefaultAndThenSwitchToFrame - " + e);
		}
	}

	public boolean WaitForDashboardStatus(String strRegressionID,String transaction, String dataVal,String strDasboard_LNK_Actions, ExtentTest test) throws IOException {
		boolean flag = true;
		try {
			block: {

				int count = 0;
				int innercount = 0;
				while (flag) {

					if (getDashboard_LBL_QuoteStatus().getText().contains(dataVal)) {
						flag = true;
						se.log().logTestStep("DashboardStatus is - " + getDashboard_LBL_QuoteStatus().getText());
						test.log(LogStatus.INFO, "Info",
								"DashboardStatus is - " + getDashboard_LBL_QuoteStatus().getText() + " For the transaction " + transaction);
						if(dataVal.equalsIgnoreCase("Approval Needed")&&getDashboard_LBL_QuoteStatus().getText().contains("Approval Needed")){
							se.element().Click(getDasboard_LNK_Actions(constants.Approve), test);
								UWApproval(strRegressionID, transaction, test);
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
							test.log(LogStatus.WARNING, "Warning",
									"DashboardStatus is - " + getDashboard_LBL_QuoteStatus().getText() + " For the transaction " + transaction);
							
							break block;
						}
						if (dataVal.equalsIgnoreCase("Approval Needed")&&!getDashboard_LBL_QuoteStatus().getText().contains("Approval Needed")) {
							innercount++;
							if (innercount >= 4) {
								flag = true;
								se.log().logTestStep("Timed out waiting for expected DashboardStatus "+dataVal+" , Actual status is - " + getDashboard_LBL_QuoteStatus().getText()+" And Count is "+count+ " For the transaction " + transaction);
								test.log(LogStatus.WARNING, "Warning",
										"Timed out waiting for expected DashboardStatus "+dataVal+" , Actual status is - " + getDashboard_LBL_QuoteStatus().getText()+" And Count is "+count + " For the transaction " + transaction);
								break block;

							}
							
						}
						//se.element().refreshBrowser();
						se.util().sleep(20000);

						SwitchToDefaultAndThenSwitchToFrame();
						count++;
					}
					if (count == 15) {
						flag = false;
						se.log().logTestStep("Timed out waiting for expected DashboardStatus "+dataVal+" , Actual status is - " + getDashboard_LBL_QuoteStatus().getText()+" And Count is "+count+ " For the transaction " + transaction);
						test.log(LogStatus.WARNING, "Warning",
								"Timed out waiting for expected DashboardStatus "+dataVal+" , Actual status is - " + getDashboard_LBL_QuoteStatus().getText()+" And Count is "+count + " For the transaction " + transaction);
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
		String strDashboardForms_BTN_AddManuscript = (String) row.get("DashboardForms_BTN_AddManuscript");
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
				
				if(!strDashboardForms_BTN_AddManuscript.contains("N/A"))
				{
					SwitchToDefaultAndThenSwitchToManuscriptFrame();
					se.element().enterOrValidateText(
							getDashboardFormsUpdate_TXT_ManuscriptText(strDashboardFormsUpdate_TXT_Variable1),
							strDashboardFormsUpdate_TXT_Variable1, test);
				}
				
				se.util().sleep(30000);// sheetal increased sleep time for run in 89
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
				SwitchToDefaultAndThenSwitchToFrame();
				se.element().Click(getDashboardFormsUpdate_BTN_OK(strDashboardFormsUpdate_LNK_Variable), test);
			}

		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("Failed to fill in details for UpdateFormsVariable ", true, false, true, test);

			se.log().logTestStep("Exception in UpdateFormsVariable - " + e);
			test.log(LogStatus.INFO, "Exception in UpdateFormsVariableTab  - " + e);

		}

	}

	public void getAddForms(Map<String, String> row, ExtentTest test) throws IOException {

		String strDashboardForms_BTN_AddForms = (String) row.get("DashboardForms_BTN_AddForms");
		String strDashboardForms_TXT_SearchFormByName = (String) row.get("DashboardForms_TXT_SearchFormByName");
		String strDashboardForms_CHK_ShowAll = (String) row.get("DashboardForms_CHK_ShowAll");

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
				//se.util().sleep(180000);
				SwitchToDefaultAndThenSwitchToFrame();
				se.element().waitForElementIsDisplayed(DashboardForms_TXT_SearchFormByName, 100);
				se.verify().verifyEquals("DashboardForms Page of PowerWriter ",
						getDashboardForms_TXT_SearchFormByName(strDashboardForms_TXT_SearchFormByName).isDisplayed(),
						true, true, test);
				se.element().checkUncheckOrValidate(getDashboardForms_CHK_ShowAll(strDashboardForms_CHK_ShowAll), strDashboardForms_CHK_ShowAll, test);
				SwitchToDefaultAndThenSwitchToFrame();
				se.element().enterOrValidateText(
						getDashboardForms_TXT_SearchFormByName(strDashboardForms_TXT_SearchFormByName),
						strDashboardForms_TXT_SearchFormByName, test);
				se.element().Click(getDashboardForms_BTN_SearchForm(strDashboardForms_TXT_SearchFormByName), test);
				se.util().sleep(5000);
				se.element().checkUncheckOrValidate(
						getDashboardForms_CHK_SelectForm(strDashboardForms_TXT_SearchFormByName), constants.Check,
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
	
	// Sheetal Added this method on 4/29 to add Manuscript Coverage via forms tab as part of Coverage Matrix Updates
	public void getAddManuscript(Map<String, String> row, ExtentTest test) throws IOException {

		String strDashboardForms_BTN_AddManuscript = (String) row.get("DashboardForms_BTN_AddManuscript");
		String strDashboardForms_CHK_SelectGLManuscript = (String) row.get("DashboardForms_CHK_SelectGLManuscript");
		String strDashboardForms_TXT_GLManuscriptEndo_CustomTitle = (String) row.get("DashboardForms_TXT_GLManuscriptEndo_CustomTitle");
		

		try {
			se.log().logTestStep("Add Manuscript");
			String transaction = (String) row.get("Transaction Name");
			test.log(LogStatus.INFO, "Add Manuscript", "Transaction Step : " + transaction + "<br>" + "Page : Add Manuscript");
			SwitchToDefaultAndThenSwitchToFrame();
			se.element().waitForElementIsDisplayed(Dashboard_TAB_FormsSelected, 100);
			se.verify().verifyEquals("DashboardForms Page of PowerWriter ", getDashboard_TAB_Forms().isDisplayed(),
					true, true, test);

			if (strDashboardForms_BTN_AddManuscript.equalsIgnoreCase("Yes")) {
				se.element().Click(getDashboardForms_BTN_AddManuscript(strDashboardForms_BTN_AddManuscript), test);
				SwitchToDefaultAndThenSwitchToFrame();
				se.element().checkUncheckOrValidate(getDashboardForms_CHK_SelectGLManuscript(strDashboardForms_CHK_SelectGLManuscript),strDashboardForms_CHK_SelectGLManuscript,test);
				se.element().enterOrValidateText(getDashboardForms_TXT_GLManuscriptEndo_CustomTitle(strDashboardForms_TXT_GLManuscriptEndo_CustomTitle),strDashboardForms_TXT_GLManuscriptEndo_CustomTitle,test);
				se.element().Click(getDashboardForms_BTN_Add(strDashboardForms_BTN_AddManuscript), test);

			}

		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("Failed to fill in details for Add Manuscript on Forms Tab", true, false, true, test);
			se.log().logTestStep("Exception in Add Manuscript - " + e);
			test.log(LogStatus.INFO, "Exception in Add Manuscript  - " + e);

		}

	}

	public void getDashboardForms(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
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
			//String strDashboardOOSE_LNK_FixitOrCompleteRowNo = (String) row.get("DashboardOOSE_LNK_FixitOrCompleteRowNo");
			String strDashboardOOSE_LNK_FixitRowNo = (String) row.get("DashboardOOSE_LNK_FixitRowNo");
			String strDashboardOOSE_LNK_CompleteRowNo = (String) row.get("DashboardOOSE_LNK_CompleteRowNo");
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
					
					if (!strDashboardForms_BTN_Modify.equalsIgnoreCase(constants.NA)) {
						WaitForDashboardStatus(strRegressionID,transaction,strDashboardForms_LBL_Status,"N/A",test);
						se.element().Click(getDashboardFormsTab_TAB_FormsTab(), test);
						se.element().waitForElementIsDisplayed(DashboardForms_BTN_Modify, 1000);
						se.element().Click(getDashboardForms_BTN_Modify((strDashboardForms_BTN_Modify)),
								strDashboardForms_BTN_Modify, test);
					}
					se.util().sleep(10000);
					
					SwitchToDefaultAndThenSwitchToFrame();
					se.element().waitForElementIsDisplayed(Dashboard_TAB_FormsSelected, 100);
					se.verify().verifyEquals("DashboardForms Page of PowerWriter ", getDashboard_TAB_Forms().isDisplayed(),
						true, true, test);
				
					if (!strDashboardOOSE_LNK_FixitRowNo.equalsIgnoreCase(constants.NA)) {
						driver.switchTo().defaultContent();
						se.element().waitForElementIsDisplayed(
							getDashboardOOSE_LNK_FixItOrComplete(strDashboardOOSE_LNK_FixitRowNo), 100);
						se.element().Click(getDashboardOOSE_LNK_FixItOrComplete(strDashboardOOSE_LNK_FixitRowNo),
							test);
					}
					//Add wait
					//se.util().sleep(10000);
					getAddForms(row, test);
					getAddManuscript(row, test);
					getUpdateFormsVariable(row, transaction, test);
					if (!strDashboardForms_BTN_Complete.equalsIgnoreCase(constants.NA)) {
						se.element().waitForElementIsDisplayed(DashboardForms_BTN_Complete, 1000);
						se.element().Click(getDashboardForms_BTN_Complete((strDashboardForms_BTN_Complete)),
						strDashboardForms_BTN_Complete, test);
					}
					
				}
		
				if (strRegressionID.equalsIgnoreCase("WC_13")){
					if (!strDashboardOOSE_LNK_FixitRowNo.equalsIgnoreCase(constants.NA) && strDashboardOOSE_LBL_Status.equalsIgnoreCase("Rating - Suspended")){
						SwitchToDefaultAndThenSwitchToFrame();
						WaitForDashboardStatus(strRegressionID,transaction,strDashboardForms_LBL_Status,"N/A",test);
						se.element().Click(getDasboard_LNK_Actions(strDashboardForms_LBL_Status), test);
						se.util().sleep(10000);
						driver.switchTo().defaultContent();
						if (se.element().isElementPresent(DashboardOOSE_LBL_OOSEPopup)) {
							se.element().waitForElementIsDisplayed(
									getDashboardOOSE_LNK_FixItOrComplete(strDashboardOOSE_LNK_FixitRowNo), 10);
							se.element().Click(
									getDashboardOOSE_LNK_FixItOrComplete(strDashboardOOSE_LNK_FixitRowNo), test);
							se.util().sleep(3000);
							se.element().Click(getCalprem(), test);
							se.util().sleep(3000);
							if (se.element().isElementPresent(Wariningyesbutton)) {
								test.log(LogStatus.INFO, "Warning Yes button is visible on popup");
								se.element().Click(getWariningyesbutton(), test);
								test.log(LogStatus.INFO, "Clicked on Warning Yes button on popup");
							se.element().Click(getcommon_BTN_completetranx(), test);
					}
				}
			}
					
					se.util().sleep(20000);
					
					if (se.element().isElementPresent(DashboardOOSE_LBL_OOSEPopup) && (!strDashboardOOSE_LNK_CompleteRowNo.equalsIgnoreCase("N/A"))) {
						se.util().sleep(30000);
						se.element().waitForElementIsDisplayed(
								getDashboardOOSE_LNK_FixItOrComplete(strDashboardOOSE_LNK_CompleteRowNo), 100);
						se.element().Click(
								getDashboardOOSE_LNK_FixItOrComplete(strDashboardOOSE_LNK_CompleteRowNo), test);
						se.util().sleep(50000);
						
						
					} else {
						SwitchToDefaultAndThenSwitchToFrame();
						se.util().sleep(10000);
						driver.switchTo().defaultContent();
						WaitForOOSEStatus(transaction,"Ready for Booking",strDashboardOOSE_LBL_StatusRowNo,test);	
					}
					
					if (!se.element().isElementPresent(DashboardOOSE_LBL_OOSEPopup) ){
					se.util().sleep(40000);
					se.element().refreshBrowser();
					SwitchToDefaultAndThenSwitchToFrame();}
					se.element().Click(getCommon_LNK_ClickPolicyNumber_SwitchDefault(), test);
					se.util().sleep(5000);
					if (strDashboardOOSE_BTN_BookAllRevesions.equalsIgnoreCase(constants.Yes)) {
						WaitForOOSEStatus(transaction,"Ready for Booking",strDashboardOOSE_LBL_StatusRowNo,test);
						if (se.element().isElementPresent(DashboardOOSE_LBL_OOSEPopup) && (!strDashboardOOSE_BTN_BookAllRevesions.equalsIgnoreCase("N/A"))) {
							se.util().sleep(30000);
							se.element().Click(getDashboardOOSE_BTN_BookAllRevesions(strDashboardOOSE_BTN_BookAllRevesions),
									test);
							se.util().sleep(30000);	
						}
						else {
							se.element().Click(getDashboardOOSE_BTN_BookAllRevesions(strDashboardOOSE_BTN_BookAllRevesions),
								test);
							se.util().sleep(30000);			
						}
						se.element().waitForElementToDisappear(bluelineIndicator, 5000);
						se.element().waitForElementToDisappear(overalyRequestProcessing, 5000);
					}
				
				}
				if (!strDashboardOOSE_LNK_FixitRowNo.equalsIgnoreCase(constants.NA)) {
					se.util().sleep(10000);
					driver.switchTo().defaultContent();
					//Commented on 12/14
					/*se.element().refreshBrowser();
					se.util().sleep(10000);*/
				
					if (strDashboardOOSE_LBL_Status.equalsIgnoreCase("Approval Needed")) {
						if (se.element().isElementPresent(DashboardOOSE_LBL_OOSEPopup)) {
							se.element().waitForElementIsDisplayed(
									getDashboardOOSE_LNK_FixItOrComplete(strDashboardOOSE_LNK_FixitRowNo), 10);
							se.element().Click(
									getDashboardOOSE_LNK_FixItOrComplete(strDashboardOOSE_LNK_FixitRowNo), test);
							se.util().sleep(3000);
							SwitchToDefaultAndThenSwitchToFrame();
							 se.element().Click(getDasboard_LNK_Actions("Approve"), test);
							UWApproval(strRegressionID, transaction, test);
							driver.switchTo().defaultContent();
							se.util().sleep(10000);
						} else {
							// se.element().refreshBrowser();
							SwitchToDefaultAndThenSwitchToFrame();
							se.element().Click(getDashboard_LBL_QuoteStatus(), test);
							se.util().sleep(10000);
							driver.switchTo().defaultContent();
							se.element().waitForElementIsDisplayed(
									getDashboardOOSE_LNK_FixItOrComplete(strDashboardOOSE_LNK_FixitRowNo), 100);
							se.element().Click(
									getDashboardOOSE_LNK_FixItOrComplete(strDashboardOOSE_LNK_FixitRowNo), test);
							se.util().sleep(3000);
							SwitchToDefaultAndThenSwitchToFrame();
							se.element().Click(getDasboard_LNK_Actions("Approve"), test);
							UWApproval(strRegressionID, transaction, test);
							driver.switchTo().defaultContent();
							se.util().sleep(10000);
						}
						
					}
					/*if (se.element().isElementPresent(DashboardOOSE_LBL_OOSEPopup)) {
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
					}*/

				}
				se.element().refreshBrowser();// sheetal added this line for  89 env run on 11/1/23
				se.util().sleep(20000);
				
				if (se.element().isElementPresent(DashboardOOSE_LBL_OOSEPopup) && (!strDashboardOOSE_LNK_CompleteRowNo.equalsIgnoreCase("N/A"))) {
					se.util().sleep(30000);
					se.element().waitForElementIsDisplayed(
							getDashboardOOSE_LNK_FixItOrComplete(strDashboardOOSE_LNK_CompleteRowNo), 100);
					se.element().Click(
							getDashboardOOSE_LNK_FixItOrComplete(strDashboardOOSE_LNK_CompleteRowNo), test);
					se.util().sleep(50000);
					
					
				} else {
					SwitchToDefaultAndThenSwitchToFrame();
					se.util().sleep(10000);
					driver.switchTo().defaultContent();
					WaitForOOSEStatus(transaction,"Ready for Booking",strDashboardOOSE_LBL_StatusRowNo,test);	
				}
				
				if (!se.element().isElementPresent(DashboardOOSE_LBL_OOSEPopup) ){
				se.util().sleep(40000);
				se.element().refreshBrowser();
				SwitchToDefaultAndThenSwitchToFrame();}
				se.element().Click(getCommon_LNK_ClickPolicyNumber_SwitchDefault(), test);
				se.util().sleep(5000);
				if (strDashboardOOSE_BTN_BookAllRevesions.equalsIgnoreCase(constants.Yes)) {
					WaitForOOSEStatus(transaction,"Ready for Booking",strDashboardOOSE_LBL_StatusRowNo,test);
					if (se.element().isElementPresent(DashboardOOSE_LBL_OOSEPopup) && (!strDashboardOOSE_BTN_BookAllRevesions.equalsIgnoreCase("N/A"))) {
						se.util().sleep(30000);
						se.element().Click(getDashboardOOSE_BTN_BookAllRevesions(strDashboardOOSE_BTN_BookAllRevesions),
								test);
						se.util().sleep(30000);	
					}
					else {
						se.element().Click(getDashboardOOSE_BTN_BookAllRevesions(strDashboardOOSE_BTN_BookAllRevesions),
							test);
						se.util().sleep(30000);			
					}
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

	public void getDashboardSupplementaryInfo(String strRegressionID, String transaction, ExtentTest test)
			throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
		if (SuspendSheet.equalsIgnoreCase(constants.Dashboard_SupplementaryInfo)) {
			test.log(LogStatus.INFO, "Page Suspended :- ",
					"Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Dashboard_SupplementaryInfo,
				strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strDashboardSupplementaryInfo_BTN_Complete = (String) row
					.get("DashboardSupplementaryInfo_BTN_Complete");

			try {
				se.log().logTestStep("Dashboard SupplementaryInfo");

				test.log(LogStatus.INFO, "Dashboard SupplementaryInfo",
						"Transaction Step : " + transaction + "<br>" + "Page : Dashboard SupplementaryInfo");
				se.util().sleep(10000);
				SwitchToDefaultAndThenSwitchToFrame();
				se.element().waitForElementIsDisplayed(Dashboard_TAB_SupplementalInfoSelected, 100);
				se.verify().verifyEquals("DashboardSupplementaryInfo Page of PowerWriter ",getDashboard_TAB_SupplementalInfo().isDisplayed(), true, true, test);
				se.element().Click(getDashboardForms_BTN_Complete(strDashboardSupplementaryInfo_BTN_Complete), test);

			

			} catch (Exception e) {
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for Dashboard SupplementaryInfo ", true, false,
						true, test);

				se.log().logTestStep("Exception in Dashboard SupplementaryInfo - " + e);
				test.log(LogStatus.INFO, "Exception in Dashboard SupplementaryInfo  - " + e);

				}
				iteration++;
			}

		} catch (Exception e) {
			// TODO: handle exception
			se.log().logTestStep(
					"Issue in the page " +"Dashboard SupplementaryInfo " + " For the transaction " + transaction);
			test.log(LogStatus.FAIL, "Failed",
					"Issue in the page " + "Dashboard SupplementaryInfo " + " For the transaction " + transaction);
			testTearDown(se, test);
		}

}
	
	
	
	public void getDashboardCommissions(String strRegressionID, String transaction, ExtentTest test)
			throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
		if (SuspendSheet.equalsIgnoreCase("Dashboard_Commissions")) {
			test.log(LogStatus.INFO, "Page Suspended :- ",
					"Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData("Dashboard_Commissions",
				strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strDashboardCommissions_BTN_Modify = (String) row.get("DashboardCommissions_BTN_Modify");
			String strDashboardCommissions_BTN_Edit = (String) row.get("DashboardCommissions_BTN_Edit");
			String strDashboardCommissions_TXT_OverriddenAmount = (String) row.get("DashboardCommissions_TXT_OverriddenAmount");
			String strDashboardCommissions_BTN_Save = (String) row.get("DashboardCommissions_BTN_Save");
			String strDashboardCommissions_BTN_Complete = (String) row.get("DashboardCommissions_BTN_Complete");

			try {
				se.log().logTestStep("Dashboard Commissions");
				test.log(LogStatus.INFO, "Dashboard Commissions","Transaction Step : " + transaction + "<br>" + "Page : Dashboard Commissions");
				se.util().sleep(10000);
				SwitchToDefaultAndThenSwitchToFrame();
				
				
				se.element().Click(getDashboardCommissionsTab(), test);
				se.element().waitForElementIsDisplayed(Dashboard_TAB_Commissions, 100);
				se.verify().verifyEquals("DashboardCommissions Page of PowerWriter ",getDashboard_TAB_Commissions().isDisplayed(), true, true, test);
				
				if (!strDashboardCommissions_BTN_Modify.equalsIgnoreCase(constants.NA)) {
					
					se.element().waitForElementIsDisplayed(DashboardForms_BTN_Modify, 1000);
					se.element().Click(getDashboardForms_BTN_Modify((strDashboardCommissions_BTN_Modify)),
							strDashboardCommissions_BTN_Modify, test);
					SwitchToDefaultAndThenSwitchToFrame();
					se.util().sleep(5000);
					SwitchToDefaultAndThenSwitchToFrame();
					se.element().Click(getDashboardCommissions_BTN_Edit((strDashboardCommissions_BTN_Edit)),
							strDashboardCommissions_BTN_Edit, test);
					
					if(!strDashboardCommissions_TXT_OverriddenAmount.equalsIgnoreCase("N/A") && !strDashboardCommissions_TXT_OverriddenAmount.contains("validate2")){
						se.element().clearTheField(getDashboardCommissions_TXT_OverriddenAmount(strDashboardCommissions_TXT_OverriddenAmount));
							
					}
					
					se.element().enterOrValidateText(getDashboardCommissions_TXT_OverriddenAmount(strDashboardCommissions_TXT_OverriddenAmount), strDashboardCommissions_TXT_OverriddenAmount,test);
					se.element().Click(getDashboardCommissions_BTN_Save((strDashboardCommissions_BTN_Save)),
							strDashboardCommissions_BTN_Save, test);
					se.util().sleep(2000);
					se.element().Click(getDashboardForms_BTN_Complete((strDashboardCommissions_BTN_Complete)),
							strDashboardCommissions_BTN_Complete, test);
				}
				
				else
				{
					String actualOverriddenAmount = getDashboardCommissions_TXT_OverriddenAmountVerfication(strDashboardCommissions_TXT_OverriddenAmount).getAttribute("value")+"%";
					se.verify().verifyEquals("Validate Overridden Amount on Commissions tab", actualOverriddenAmount, strDashboardCommissions_TXT_OverriddenAmount);
				}
				
				

			} catch (Exception e) {
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for Dashboard Commissions Tab ", true, false,
						true, test);

				se.log().logTestStep("Exception in Dashboard Commissions - " + e);
				test.log(LogStatus.INFO, "Exception in Dashboard Commissions - " + e);

				}
				iteration++;
			}

		} catch (Exception e) {
			// TODO: handle exception
			se.log().logTestStep(
					"Issue in the page " +"Dashboard Commissions " + " For the transaction " + transaction);
			test.log(LogStatus.FAIL, "Failed",
					"Issue in the page " + "Dashboard Commissions " + " For the transaction " + transaction);
			testTearDown(se, test);
		}

}
	public void getDashboardActions(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		
		try{

		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
		if (SuspendSheet.equalsIgnoreCase(constants.Dashboard_Actions)) {
			test.log(LogStatus.INFO, "Page Suspended :- ",
					"Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Dashboard_Actions, strRegressionID,
				transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strDasboard_LNK_Actions = (String) row.get("Dashboard_LNK_Actions");
			String strDashboardStatus = (String) row.get("Dashboard_LBL_Status");
			String strDashboard_LNK_PriorTermTransaction = (String) row.get("Dashboard_LNK_PriorTermTransaction");
			String strDashboard_LNK_PriorTermRevision = (String) row.get("Dashboard_LNK_PriorTermRevision");
			boolean DashboardStatus = false;
			try {
				se.log().logTestStep("Dashboard Actions");

				test.log(LogStatus.INFO, "Dashboard Actions",
						"Transaction Step : " + transaction + "<br>" + "Page : Dashboard Actions");
				se.util().sleep(10000);

				if (!strDashboardStatus.equalsIgnoreCase(constants.NA)) {
					SwitchToDefaultAndThenSwitchToFrame();
					DashboardStatus = WaitForDashboardStatus(strRegressionID,transaction,strDashboardStatus,strDasboard_LNK_Actions,test);
				}
				se.util().sleep(20000);
				if (!strDashboard_LNK_PriorTermTransaction.equalsIgnoreCase(constants.NA)) {
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
				}
				SwitchToDefaultAndThenSwitchToFrame();
				if (!strDasboard_LNK_Actions.equalsIgnoreCase(constants.NA)&& !DashboardStatus==false && !strDasboard_LNK_Actions.equalsIgnoreCase("Approve")) {
					for(int i=0; i<=2;i++){
						  try{
							  se.element().waitForElementIsDisplayed(getDasboard_LNK_Actions(strDasboard_LNK_Actions), 100);
							  se.verify().verifyEquals("DashboardActions Page of PowerWriter ",
										getDasboard_LNK_Actions(strDasboard_LNK_Actions).isDisplayed(), true, true, test);
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
					se.log().logTestStep(
							"DashboardStatus is " + DashboardStatus + " For the transaction " + transaction);
					test.log(LogStatus.FAIL, "Failed",
							"DashboardStatus is " + DashboardStatus + " For the transaction " + transaction);
					
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
public void getDashboardStatus(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		
		try{

		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
		if (SuspendSheet.equalsIgnoreCase(constants.Dashboard_Actions)) {
			test.log(LogStatus.INFO, "Page Suspended :- ",
					"Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Dashboard_Actions, strRegressionID,
				transaction);
		
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(0);
			
			String strDashboardStatus = (String) row.get("Dashboard_LBL_Status");
			
			boolean DashboardStatus = false;
			try {
				se.log().logTestStep("Dashboard Status");

				test.log(LogStatus.INFO, "Dashboard Status",
						"Transaction Step : " + transaction + "<br>" + "Page : Dashboard Actions");
				se.util().sleep(10000);

				if (!strDashboardStatus.equalsIgnoreCase(constants.NA)) {
					SwitchToDefaultAndThenSwitchToFrame();
					DashboardStatus = WaitForDashboardStatus(strRegressionID,transaction,strDashboardStatus,"N/A",test);
				}
				if(!DashboardStatus == false){
					se.log().logTestStep(
							"DashboardStatus is " + DashboardStatus + " For the transaction " + transaction);
					test.log(LogStatus.PASS, "PASSED",
							"DashboardStatus is " + DashboardStatus + " For the transaction " + transaction);
					}
				else{
					se.log().logTestStep(
							"DashboardStatus is " + DashboardStatus + " For the transaction " + transaction);
					test.log(LogStatus.FAIL, "FAILED",
							"DashboardStatus is " + DashboardStatus + " For the transaction " + transaction);
				}
				driver.switchTo().defaultContent();
				
			} catch (Exception e) {
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for Dashboard Actions ", true, false, true, test);

				se.log().logTestStep("Exception in Dashboard Actions - " + e);
				test.log(LogStatus.INFO, "Exception in Dashboard Actions  - " + e);

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
	public void UWApproval1(String transaction, ExtentTest test) throws IOException {

			try {
				se.log().logTestStep("UW approval");
				test.log(LogStatus.INFO, "UW approval",
						"Transaction Step : " + transaction + "<br>" + "Page : UW approval");
				SwitchToDefaultAndThenSwitchToFrame();
				se.verify().verifyEquals("UW approval Page of PowerWriter ",
						getUnderwritingApproval_TXT_Comment("Approved").isDisplayed(), true,
						true, test);
				SwitchToDefaultAndThenSwitchToFrame();
				se.util().sleep(3000);
				se.element().enterText(getUnderwritingApproval_TXT_Comment("Approved"),
						"Approved", test);
				se.element().Click(getUnderwritingApproval_BTN_Approve(), test);
				
			} catch (Exception e) {
				se.verify().verifyEquals("Failed to fill in details for UW Approval", true, false, true, test);

			}
		}
	
	public void UWApproval(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{

		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
		if (SuspendSheet.equalsIgnoreCase("UnderwritingApproval")) {
			test.log(LogStatus.INFO, "Page Suspended :- ",
					"Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData("UnderwritingApproval", strRegressionID,
				transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strUnderwritingApproval_TXT_Comment = (String) row.get("UnderwritingApproval_TXT_Comment");

			try {
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
				
			} catch (Exception e) {
				se.verify().verifyEquals("Failed to fill in details for UW Approval", true, false, true, test);

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

	public void NavigateToPage(String Page, ExtentTest test) throws IOException {
		try {

			se.element().Click(getExpandTree_Dropdown(""), test);
			se.util().sleep(3000);
			se.element().Click(getExpandTree_ExpandAllLink(""), test);

			se.util().sleep(3000);

			se.element().Click(getExpandTree_Dropdown(""), test);
			se.element().waitForElementToDisappear(bluelineIndicator, 10000);
			se.element().waitForElementToDisappear(spinner, 10000);
			se.element().waitForElementToDisappear(overalyRequestProcessing, 10000);
			//@Sai 02/09/21 - Added IF condition as a workaround to bypass the Internal Server error issue on QFR (DF-6151)
			//@Sai 04/14/21 - Commented the IF condition workaround as DF-6151 is fixed.
			//@Sheetal 05/04 - Uncommented the workaround for DF-6151
			if(se.element().exists(InternalServerErrorClose)) {
				test.log(LogStatus.WARNING, "<b>Executing</b>", "<b style='background-color:red; color:white'>Internal Server error appeared</b>");
				se.element().Click(getInternalServerErrorClose(),test);
			}
			driver.switchTo().defaultContent();
			JavascriptExecutor executor = (JavascriptExecutor) se.driver();
			executor.executeScript("arguments[0].scrollIntoView(0,250);", getNavigatetoPage(Page));
			se.element().Click(getNavigatetoPage(Page), test);
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to Navigate to " + Page, true, false, true, test);
		}
	}

	public void NavigateToPageBasedOnOccurence(String Page, String Occurance, ExtentTest test) throws IOException {
		try {

			se.element().Click(getExpandTree_Dropdown(""), test);
			se.util().sleep(3000);
			se.element().Click(getExpandTree_ExpandAllLink(""), test);
			se.util().sleep(3000);
			se.element().Click(getExpandTree_Dropdown(""), test);
			se.element().waitForElementToDisappear(bluelineIndicator, 10000);
			driver.switchTo().defaultContent();
			JavascriptExecutor executor = (JavascriptExecutor) se.driver();
			executor.executeScript("arguments[0].scrollIntoView(0,250);",
					getNavigatetoPagebasedOnOccurence(Page, Occurance));
			se.element().Click(getNavigatetoPage(Page), test);
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to Navigate to " + Page + "based on occurence", true, false, true, test);
		}
	}

	public void NavigateToPageContaining(String Page, ExtentTest test) throws IOException {
		try {
			se.element().Click(getExpandTree_Dropdown(""), test);
			se.element().Click(getExpandTree_ExpandAllLink(""), test);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			se.element().Click(getExpandTree_Dropdown(""), test);
			JavascriptExecutor executor = (JavascriptExecutor) se.driver();
			driver.switchTo().defaultContent();
			executor.executeScript("arguments[0].scrollIntoView(0,250);", getNavigatetoPagecontainingtext(Page));
			se.element().Click(getNavigatetoPagecontainingtext(Page), test);
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to Navigate to " + Page, true, false, true, test);
		}
	}

	public void NavigateTo(String Page, ExtentTest test) throws IOException {
		try {
			se.util().sleep(3000);
			se.element().Click(getNavigatetoPage(Page), test);
			se.util().sleep(3000);
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to Navigate to " + Page, true, false, true, test);
		}
	}
	
	public void CollapseAll(String quoteNumber,ExtentTest test) throws IOException {
		try {
			se.element().Click(getExpandTree_Dropdown(""), test);
			se.util().sleep(3000);
			se.element().Click(getExpandTree_CollapseAllLink(""), test);
			se.util().sleep(3000);

			se.element().Click(getExpandTree_Dropdown(""), test);
			se.element().waitForElementToDisappear(bluelineIndicator, 10000);
			se.element().waitForElementToDisappear(spinner, 10000);
			se.element().waitForElementToDisappear(overalyRequestProcessing, 10000);
			se.element().Click(getCommon_ProdInfoLink(quoteNumber), test);

		} catch (Exception e) {
			test.log(LogStatus.INFO, "CollapseAll step failed due to - ", e.toString());
		}
	}
	public void CollapseAllAndNavigateTo(String Page, String product, ExtentTest test) throws IOException {
		try {
			se.element().Click(getExpandTree_Dropdown(""), test);
			se.util().sleep(3000);
			se.element().Click(getExpandTree_CollapseAllLink(""), test);
			se.util().sleep(3000);

			se.element().Click(getExpandTree_Dropdown(""), test);
			se.element().waitForElementToDisappear(bluelineIndicator, 20000);
			se.element().waitForElementToDisappear(spinner, 10000);
			se.element().waitForElementToDisappear(overalyRequestProcessing, 20000);
			//@Sai 02/09/21 - Added IF condition as a workaround to bypass the Internal Server error issue on QFR (DF-6151)
			//@Sai 04/14/21 - Commented the IF condition workaround as DF-6151 is fixed.
			//@Sheetal 05/04 - Uncommented the workaround for DF-6151
			if(se.element().exists(InternalServerErrorClose)) {
				test.log(LogStatus.WARNING, "<b>Executing</b>", "<b style='background-color:red; color:white'>Internal Server error appeared</b>");
				se.element().Click(getInternalServerErrorClose(),test);
			}
			se.element().Click(getCommon_ProdInfoLink(product), test);
			se.element().Click(getNavigatetoPage(Page), test);
		} catch (Exception e) {
			test.log(LogStatus.INFO, "CollapseAllAndNavigateTo step failed due to - ", e.toString());
		}
	}

	public void NavigateToPageContaingText(String Page, ExtentTest test) throws IOException {
		try {
			se.element().Click(getNavigatetoPagecontainingtext(Page), test);
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to Navigate to " + Page, true, false, true, test);
		}
	}

	public void NavigateToTabs(String Page, ExtentTest test) throws IOException {
		try {
			driver.switchTo().frame(getDashboard_Iframe_TitlesReportFrame());
			se.element().Click(getNavigatetoPage(Page), test);
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to Navigate to " + Page, true, false, true, test);
		}
	}

	public void NavigateToNextScreen(ExtentTest test) throws IOException {
		try{
		se.util().sleep(500);
		se.element().Click(getNext(), test);
		se.element().waitForElementToDisappear(bluelineIndicator, 5000);
		se.element().waitForElementToDisappear(overalyRequestProcessing, 5000);
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to Navigate to next screen", true, false,
					true, test);
		}
	}

	public void NavigateNextToPages(int count, ExtentTest test) throws IOException {
		for (int i = 0; i <= count; i++) {
			se.element().Click(getNext(), test);
			se.element().waitForElementToDisappear(bluelineIndicator, 5000);
			se.element().waitForElementToDisappear(overalyRequestProcessing, 5000);
		}
	}

	/*public void getPreviousQuoteNo(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		//Old Methods
		String strquoteNumber = Util.getQuoteNumber().get(strRegressionID);
		String strCloneQuoteNo = Util.getCloneQuoteNumber().get(strRegressionID);
	
		//New Methods
		
		String strquoteNumber = Util.getQuoteNumber(strRegressionID,transaction);
		String strCloneQuoteNo = Util.getCloneQuoteNumber(strRegressionID,transaction);

		try {
			se.log().logTestStep("Find Quote Number and Cancel");

			test.log(LogStatus.INFO, "Home Page",
					"Transaction Step : " + transaction + "<br>" + "Page : Dashboard Actions");
			// Sai - Added this line to handle the UI change of Quote no. search
			SwitchToDefaultThenSwitchToQuoteFrame();
			se.util().sleep(2000);
			if (transaction.contains(constants.SearchQuote)) {
				se.element().enterOrValidateText(getCommon_TXT_SearchQuotePolicyNumber(strquoteNumber), strquoteNumber,
						test);
			}
			
			if (transaction.contains(constants.BookClonedPolicy)) {
				se.element().enterOrValidateText(getCommon_TXT_SearchQuotePolicyNumber(strCloneQuoteNo),
						strCloneQuoteNo, test);
			}
			if (transaction.contains(constants.SearchQuote2)) {
				se.element().enterOrValidateText(getCommon_TXT_SearchQuotePolicyNumber(strCloneQuoteNo),
						strCloneQuoteNo, test);
			}
			se.element().Click(getCommon_BTN_Go(), test);
			se.element().waitForElementToDisappear(loadImg, 5000);
			se.element().waitForElementToDisappear(bluelineIndicator, 5000);
			se.element().waitForElementToDisappear(overalyRequestProcessing, 5000);
			se.util().sleep(20000);
			//SwitchToDefaultAndThenSwitchToFrame();
			se.element().Click(getCommon_LNK_ClickPolicyNumber(), test);
			se.util().sleep(10000);
			driver.switchTo().defaultContent();
			SwitchToDefaultAndThenSwitchToFrame();
			se.element().Click(getCommon_LNK_ClickPolicyNumber_SwitchDefault(), test);
			se.util().sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("Failed to fill in details for Dashboard Actions ", true, false, true, test);

			se.log().logTestStep("Exception in Dashboard Actions - " + e);
			test.log(LogStatus.INFO, "Exception in Dashboard Actions  - " + e);

		}

	}*/
	
	public void getPreviousQuoteNo(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
			String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
			if (SuspendSheet.equalsIgnoreCase(constants.SearchQuoteNumber)) {
				test.log(LogStatus.INFO, "Page Suspended :- ",
						"Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
				testTearDown(se, test);
			}
			List<Map<String, String>> table = ExcelOperations.getPagesData(constants.SearchQuoteNumber, strRegressionID,
					transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strLinkCUQuoteNum = (String) row.get("LinkCUQuoteNum");
				String strquoteNumber = Util.getQuoteNumber(strRegressionID,transaction);
				String strCloneQuoteNo = Util.getCloneQuoteNumber(strRegressionID,transaction);
				String strLinkRenewalCounterNum = (String) row.get("LinkRenewalCounterNum");

		try {
			se.log().logTestStep("Find Quote Number and Cancel");

			test.log(LogStatus.INFO, "Home Page",
					"Transaction Step : " + transaction + "<br>" + "Page : Dashboard Actions");
			// Sai - Added this line to handle the UI change of Quote no. search
			SwitchToDefaultThenSwitchToQuoteFrame();
			se.util().sleep(2000);
			
			//Below commented lines are for Workaround implemented when top corner search isnot displayed
			/*if (transaction.contains(constants.SearchQuote)) {
				se.element().enterOrValidateText(getWlcm_Txt_Searchquote2(), strquoteNumber,
						test);
			}
			
			if (transaction.contains(constants.BookClonedPolicy)) {
				se.element().enterOrValidateText(getWlcm_Txt_Searchquote2(),
						strCloneQuoteNo, test);
			}
			if (transaction.contains(constants.SearchQuote2)) {
				se.element().enterOrValidateText(getWlcm_Txt_Searchquote2(),
						strCloneQuoteNo, test);
			}
			se.element().Click(getwlcm_Btn_searchGO(), test);*/
			
			if(strRegressionID.contains("CU") && transaction.contains("CUSearchQuote")){
				se.element().enterOrValidateText(getCommon_TXT_SearchQuotePolicyNumber(strquoteNumber), strquoteNumber,
						test);
		}
			
			if  (!strRegressionID.contains("CU") && transaction.equalsIgnoreCase(constants.SearchQuote)) {
				se.element().enterOrValidateText(getCommon_TXT_SearchQuotePolicyNumber(strquoteNumber), strquoteNumber,
						test);
			}
			
			if (transaction.contains(constants.BookClonedPolicy)) {
				se.element().enterOrValidateText(getCommon_TXT_SearchQuotePolicyNumber(strCloneQuoteNo),
						strCloneQuoteNo, test);
			}
			if (transaction.contains(constants.SearchQuote2)) {
				se.element().enterOrValidateText(getCommon_TXT_SearchQuotePolicyNumber(strCloneQuoteNo),
						strCloneQuoteNo, test);
			}
			se.element().Click(getCommon_BTN_Go(), test);
			
			se.element().waitForElementToDisappear(loadImg, 5000);
			se.element().waitForElementToDisappear(bluelineIndicator, 5000);
			se.element().waitForElementToDisappear(overalyRequestProcessing, 5000);
			se.util().sleep(20000);
			//SwitchToDefaultAndThenSwitchToFrame();
			
			
			if(strRegressionID.contains("CU") && transaction.contains("CUSearchQuote")){
				se.element().Click(getCommon_LNK_ClickCUQuoteNumber(strLinkCUQuoteNum,strquoteNumber,strLinkRenewalCounterNum), test);}
			
			if  (!strRegressionID.contains("CU") && transaction.equalsIgnoreCase(constants.SearchQuote)) {
				se.element().Click(getCommon_LNK_ClickCUQuoteNumber(strLinkCUQuoteNum,strquoteNumber,strLinkRenewalCounterNum), test);
			}
			
			else
				se.element().Click(getCommon_LNK_ClickCUQuoteNumber(strLinkCUQuoteNum,strCloneQuoteNo,strLinkRenewalCounterNum), test);
	
			se.util().sleep(10000);
			driver.switchTo().defaultContent();
			SwitchToDefaultAndThenSwitchToFrame();
			se.element().Click(getCommon_LNK_ClickPolicyNumber_SwitchDefault(), test);
			se.util().sleep(5000);
		
	} catch (Exception e) {
		e.printStackTrace();
		se.verify().verifyEquals("Failed to click DashboardSearchQuoteNumber", true, false, true, test);
		se.log().logTestStep("Exception in DashboardSearchQuoteNumber tab - " + e);
		test.log(LogStatus.FAIL, "Exception in DashboardSearchQuoteNumber tab  - " + e);
	}
	iteration++;
		}
	}

	catch (Exception e) {
		// TODO: handle exception
		se.log().logTestStep("Issue in the page "+"DashboardSearchQuoteNumber"+" For the transaction "+transaction);
		test.log(LogStatus.FAIL, "Failed", "Issue in the page "+"DashboardSearchQuoteNumber"+" For the transaction "+transaction);
		testTearDown(se, test);
	}
}	
			
	
	public void getCloneQuoteNo(String strRegressionID, String transaction,String cloneNumber, ExtentTest test) throws IOException {
		try{
			String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
			if (SuspendSheet.equalsIgnoreCase(constants.SearchQuoteNumber)) {
				test.log(LogStatus.INFO, "Page Suspended :- ",
						"Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
				testTearDown(se, test);
			}
			List<Map<String, String>> table = ExcelOperations.getPagesData(constants.SearchQuoteNumber, strRegressionID,
					transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strLinkCUQuoteNum = (String) row.get("LinkCUQuoteNum");
				String strLinkRenewalCounterNum = (String) row.get("LinkRenewalCounterNum");


		
		
		try {
			se.log().logTestStep("Find Clone  Quote Number");

			test.log(LogStatus.INFO, "Home Page",
					"Transaction Step : " + transaction + "<br>" + "Page : Dashboard Actions");
			SwitchToDefaultThenSwitchToQuoteFrame();
			se.util().sleep(2000);
			
			se.element().enterOrValidateText(getCommon_TXT_SearchQuotePolicyNumber(cloneNumber),
						cloneNumber, test);
			
			se.element().Click(getCommon_BTN_Go(), test);
			
			//Below 2 lines are workaround to replace the top corner SearchQuote function 
			/*se.element().enterOrValidateText(getwlcm_Txt_SearchQuotePolicyNumber(cloneNumber), cloneNumber,test);
			  se.element().Click(getwlcm_Btn_searchGO(), test);*/
			
			se.element().waitForElementToDisappear(loadImg, 5000);
			se.element().waitForElementToDisappear(bluelineIndicator, 5000);
			se.element().waitForElementToDisappear(overalyRequestProcessing, 5000);
			se.element().waitForElementIsDisplayed(Common_LNK_ClickPolicyNumber, 20000);
			
			/*if(!strRegressionID.contains("CU")){
				se.element().Click(getCommon_LNK_ClickPolicyNumber(), test);
			}
			else*/
				se.element().Click(getCommon_LNK_ClickCUCloneNumber(strLinkCUQuoteNum,cloneNumber,strLinkRenewalCounterNum), test);
		
			
			//se.element().Click(getCommon_LNK_ClickPolicyNumber(), test);
			se.util().sleep(10000);
			SwitchToDefaultAndThenSwitchToFrame();
			se.element().Click(getCommon_LNK_ClickPolicyNumber_SwitchDefault(), test);
			test.log(LogStatus.INFO, "CloneQuote Number" + "<b style='color:blue;'>"+cloneNumber+"</b>");
			se.util().sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("Failed to click DashboardSearchQuoteNumber", true, false, true, test);
			se.log().logTestStep("Exception in DashboardSearchQuoteNumber tab - " + e);
			test.log(LogStatus.FAIL, "Exception in DashboardSearchQuoteNumber tab  - " + e);
		}
		iteration++;
			}
		}

		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			se.verify().verifyEquals("Failed to fill in details for finding clone number ", true, false, true, test);

			se.log().logTestStep("Exception in Dashboard Actions - " + e);
			test.log(LogStatus.INFO, "Exception in Dashboard Actions  - " + e);
		}
	}	
			
		
	
	
	public String retrievePolicyNumber(ExtentTest test) throws IOException {
		String policyNumber =null;
		try {
			driver.switchTo().frame(getPremiumSummary_IFrame());
			String strPremiumSummary_GeneralInfo_PolicyNumber = getPremiumSummary_GeneralInfo_PolicyNumber().getText().trim();
			String[] strtestdata =strPremiumSummary_GeneralInfo_PolicyNumber.split("-");
			policyNumber = strtestdata[2];
			driver.switchTo().defaultContent();
			test.log(LogStatus.INFO, "ClonePolicy Number" + "<b style='color:blue;'>"+policyNumber+"</b>");
			return policyNumber;
		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("Failed to fill in details for retrieve Policy Number ", true, false, true, test);

			se.log().logTestStep("Exception in Dashboard Actions - " + e);
			test.log(LogStatus.INFO, "Exception in Dashboard Actions  - " + e);

		}
		return policyNumber;
		
	}
	
	
	public String retrieveCAPolicyNumber(ExtentTest test) throws IOException {
		String policyNumber =null;
		try {
			
			String strPremiumSummary_GeneralInfo_CAPolicyNumber = getPremiumSummary_GeneralInfo_CAQuoteNumber().getText().trim();
			String[] strtestdata =strPremiumSummary_GeneralInfo_CAPolicyNumber.split("-");
			policyNumber = strtestdata[2];
			driver.switchTo().defaultContent();
			return policyNumber;
		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("Failed to fill in details for retrieve Policy Number ", true, false, true, test);

			se.log().logTestStep("Exception in Dashboard Actions - " + e);
			test.log(LogStatus.INFO, "Exception in Dashboard Actions  - " + e);

		}
		return policyNumber;
		
	}
		
	public void ClickOkOnNotification(ExtentTest test) throws IOException {
		se.util().sleep(20000);
		se.element().waitForElement(NotifcationOKbutton);
		if (se.element().isElementPresent(NotifcationOKbutton)) {
			se.element().Click(getNotifcationOKbutton(), test);
		}
	}
	
	public void ClickOnNONotification(ExtentTest test) throws IOException {
		se.util().sleep(20000);
		se.element().waitForElement(NotifcationNObutton);
		if (se.element().isElementPresent(NotifcationNObutton)) {
			se.element().Click(getNotifcationNObutton(), test);
		}
	}

	public void NavigateToBackScreen(ExtentTest test) throws IOException {

		se.element().Click(getBack(), test);
		se.element().waitForElementToDisappear(bluelineIndicator, 5000);
		se.element().waitForElementToDisappear(overalyRequestProcessing, 5000);
	}

	public void waitforSpinner(ExtentTest test) throws Exception {
		se.util().sleep(20000);
		se.element().waitForElementToDisappear(overalyRequestProcessing, 5000);
		if (se.element().isElementPresent(spinner)) {
			se.element().waitForElementToDisappear(spinner, 5000);
		}
	}

	public void clickCalculatePremNoWaive(String strRegressionID, String transaction, ExtentTest test)
			throws IOException {

		try {
			se.log().logTestStep("Clicked on calculatePremium");
			test.log(LogStatus.INFO, "Clicked on calculatePremium",
					"Transaction Step : " + transaction + "<br>" + "Page : CalculatePremium");

			se.element().waitForElementIsDisplayed(common_btn_CalPrem, 100);
			se.element().Click(getCalprem(), test);
			se.util().sleep(3000);
			if (se.element().isElementPresent(InfoNobutton)) {
				se.element().waitForElement(InfoNobutton);
				se.element().Click(getInfoNobutton(), test);
			}
			se.element().waitForElementToDisappear(bluelineIndicator, 5000);
			se.element().waitForElementToDisappear(spinner, 5000);
			se.util().sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("Failed to fill in details for calculatePremium ", true, false, true, test);
			se.log().logTestStep("Exception in calculatePremium - " + e);
			test.log(LogStatus.INFO, "Exception in calculate premium  - " + e);

		}
	}
	
	/*public void searchQuoteNo(String strRegressionID, String transaction, ExtentTest test) throws IOException {

		// String strquoteNumber = Util.getQuoteNumber().get(strRegressionID); String
		 		
		String strquoteNumber = Util.getQuoteNumber(strRegressionID,transaction);
		
		try {
			se.log().logTestStep("Find Quote Number");

			test.log(LogStatus.INFO, "Home Page",
					"Transaction Step : " + transaction + "<br>" + "Page : Dashboard Actions");
			SwitchToDefaultThenSwitchToQuoteFrame();
			se.util().sleep(2000);
			se.element().enterOrValidateText(getCommon_TXT_SearchQuotePolicyNumber(strquoteNumber), strquoteNumber,test);
			se.element().Click(getCommon_BTN_Go(), test);
			se.element().waitForElementToDisappear(loadImg, 5000);
			se.element().waitForElementToDisappear(bluelineIndicator, 5000);
			se.element().waitForElementToDisappear(overalyRequestProcessing, 5000);
			se.util().sleep(20000);
			
			se.element().Click(getCommon_LNK_ClickPolicyNumber(), test);
			se.util().sleep(10000);
			SwitchToDefaultAndThenSwitchToFrame();
			se.element().Click(getCommon_LNK_ClickPolicyNumber_SwitchDefault(), test);
			se.util().sleep(5000);


		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("Failed to fill in details for Dashboard Actions ", true, false, true, test);

			se.log().logTestStep("Exception in Dashboard Actions - " + e);
			test.log(LogStatus.INFO, "Exception in Dashboard Actions  - " + e);

		}

	}
*/

	
	public void searchQuoteNo(String strRegressionID, String transaction, ExtentTest test) throws IOException {

		try{
			String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
			if (SuspendSheet.equalsIgnoreCase(constants.SearchQuoteNumber)) {
				test.log(LogStatus.INFO, "Page Suspended :- ",
						"Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
				testTearDown(se, test);
			}
			List<Map<String, String>> table = ExcelOperations.getPagesData(constants.SearchQuoteNumber, strRegressionID,
					transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strLinkCUQuoteNum = (String) row.get("LinkCUQuoteNum");
				String strLinkRenewalCounterNum = (String) row.get("LinkRenewalCounterNum");
				String strquoteNumber = Util.getQuoteNumber(strRegressionID,transaction);
		
		try {
			se.log().logTestStep("Find Quote Number");

			test.log(LogStatus.INFO, "Home Page",
					"Transaction Step : " + transaction + "<br>" + "Page : Dashboard Actions");
			SwitchToDefaultThenSwitchToQuoteFrame();
			se.util().sleep(2000); 
			se.element().enterOrValidateText(getCommon_TXT_SearchQuotePolicyNumber(strquoteNumber), strquoteNumber,test);
			se.element().Click(getCommon_BTN_Go(), test);
			//Below 3 lines are workaround to replace the top corner SearchQuote function 
			/*se.util().sleep(2000);
			se.element().enterOrValidateText(getWlcm_Txt_Searchquote2(), strquoteNumber,test);
			se.element().Click(getwlcm_Btn_searchGO(), test);*/
			
			se.element().waitForElementToDisappear(loadImg, 5000);
			se.element().waitForElementToDisappear(bluelineIndicator, 5000);
			se.element().waitForElementToDisappear(overalyRequestProcessing, 5000);
			se.util().sleep(20000);
			
			if(!strRegressionID.contains("CU")&& !strRegressionID.contains("PM")){
				se.element().Click(getCommon_LNK_ClickPolicyNumber(), test);
			}
			else
				se.element().Click(getCommon_LNK_ClickCUQuoteNumber(strLinkCUQuoteNum,strquoteNumber,strLinkRenewalCounterNum), test);
			
			se.util().sleep(10000);
			SwitchToDefaultAndThenSwitchToFrame();
			se.element().Click(getCommon_LNK_ClickPolicyNumber_SwitchDefault(), test);
			se.util().sleep(5000);


		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("Failed to click DashboardSearchQuoteNumber", true, false, true, test);
			se.log().logTestStep("Exception in DashboardSearchQuoteNumber tab - " + e);
			test.log(LogStatus.FAIL, "Exception in DashboardSearchQuoteNumber tab  - " + e);
		}
		iteration++;
			}
		}
	
		catch (Exception e) {
			// TODO: handle exception
			se.log().logTestStep("Issue in the page "+"DashboardSearchQuoteNumber"+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Failed", "Issue in the page "+"DashboardSearchQuoteNumber"+" For the transaction "+transaction);
			testTearDown(se, test);
		}
	}	


public void SearchQuotePolicyNo(String strRegressionID, String transaction, ExtentTest test) throws IOException {
	try{
	String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
	if (SuspendSheet.equalsIgnoreCase(constants.SearchQuoteNumber)) {
		test.log(LogStatus.INFO, "Page Suspended :- ",
				"Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
		testTearDown(se, test);
	}
	List<Map<String, String>> table = ExcelOperations.getPagesData(constants.SearchQuoteNumber, strRegressionID,
			transaction);
	int iteration = 0;
	while (iteration < table.size()) {
		LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strLinkCUQuoteNum = (String) row.get("LinkCUQuoteNum");
		String strquoteNumber = Util.getQuoteNumber(strRegressionID,transaction);
		String strLinkRenewalCounterNum = (String) row.get("LinkRenewalCounterNum");
		

try {
	se.log().logTestStep("Find Quote Number");

	test.log(LogStatus.INFO, "Home Page",
			"Transaction Step : " + transaction + "<br>" + "Page : Dashboard Actions");
	
	SwitchToDefaultThenSwitchToQuoteFrame();
	se.util().sleep(2000);
	se.element().enterOrValidateText(getCommon_TXT_SearchQuotePolicyNumber(strquoteNumber), strquoteNumber,test);
	se.element().Click(getCommon_BTN_Go(), test);
	
	//Below 2 lines are added as Workaround for Search when Top right search is not displayed
	/*se.element().enterOrValidateText(getWlcm_Txt_Searchquote2(), strquoteNumber,test);
	se.element().Click(getwlcm_Btn_searchGO(), test);*/
	
		se.element().Click(getCommon_LNK_ClickCUQuoteNumber(strLinkCUQuoteNum,strquoteNumber,strLinkRenewalCounterNum), test);
	
	se.util().sleep(10000);
	SwitchToDefaultAndThenSwitchToFrame();
	se.element().Click(getCommon_LNK_ClickPolicyNumber_SwitchDefault(), test);
	se.util().sleep(5000);

     } catch (Exception e) {
	 e.printStackTrace();
	 se.verify().verifyEquals("Failed to click DashboardSearchQuoteNumber", true, false, true, test);
	 se.log().logTestStep("Exception in DashboardSearchQuoteNumber tab - " + e);
	test.log(LogStatus.FAIL, "Exception in DashboardSearchQuoteNumber tab  - " + e);
  }
 iteration++;
	}
  }
	
	catch (Exception e) {
		// TODO: handle exception
		se.log().logTestStep("Issue in the page "+"DashboardSearchQuoteNumber"+" For the transaction "+transaction);
		test.log(LogStatus.FAIL, "Failed", "Issue in the page "+"DashboardSearchQuoteNumber"+" For the transaction "+transaction);
		testTearDown(se, test);
	}
}	




public void getSaveAndResumeLater(String strRegressionID, String transaction, ExtentTest test) throws IOException {

	try {
		se.log().logTestStep("Clicked on SaveAndResumeLater");
		test.log(LogStatus.INFO, "Clicked on SaveAndResumeLater",
				"Transaction Step : " + transaction + "<br>" + "Page : SaveAndResumeLater");
		driver.switchTo().defaultContent();
		se.element().Click(getcommon_BTN_SaveAndResume(), test);

	} catch (Exception e) {
		e.printStackTrace();
		se.verify().verifyEquals("Failed to fill in details for SaveAndResumeLater ", true, false, true, test);

		se.log().logTestStep("Exception in SaveAndResumeLater - " + e);
		test.log(LogStatus.INFO, "Exception in SaveAndResumeLater  - " + e);

	}
}

	public void validateExperianDataUsageOnAnalyticsTab(String strRegressionID, String transaction, ExtentTest test)
			throws IOException {
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
		if (SuspendSheet.equalsIgnoreCase(constants.Dashboard_Analytics)) {
			test.log(LogStatus.INFO, "Page Suspended :- ",
					"Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Dashboard_Analytics, strRegressionID,
				transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strDashboardAnalytics_ExperianDataUsage = (String) row.get("DashboardAnalytics_ExperianDataUsage");
			try {
				se.log().logTestStep("Analytics Tab");
				test.log(LogStatus.INFO, "Analytics Tab",
						"Transaction Step : " + transaction + "<br>" + "Page : Dashboard_AnalyticsTab");
				se.util().sleep(3000);
				SwitchToDefaultAndThenSwitchToFrame();
				se.element().Click(getDashboard_TAB_Analytics(), test);
				se.verify().verifyEquals("Dashboard_Analytics Tab of PowerWriter ",
						getDashboard_TAB_Analytics().isDisplayed(), true, true, test);
				se.element().waitForElementIsDisplayed(AnalyticsTab_BTN_ExpandAll, 180);
				se.element().Click(getAnalyticsTab_BTN_ExpandAll("EXPAND ALL"), "EXPAND ALL", test);
				se.element().waitForElementIsDisplayed(Analytics_TBL_ExperianDataUsage, 1000);
				se.verify().verifyAsPassOrError("Experian Data Usage", getAnalytics_TBL_ExperianDataUsage().getText(),
						strDashboardAnalytics_ExperianDataUsage, true, test);
				se.util().sleep(1000);
				se.element().Click(getAnalyticsTab_BTN_ExpandAll("COLLAPSE ALL"), "COLLAPSE ALL", test);
			} catch (Exception e) {
				se.verify().verifyEquals("Failed to verify details on Analytics tab", true, false, true, test);
			}
			iteration++;
		}
	}
	
	public void validateStatusModelTypeOnAnalyticsTab(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		
		try{
			String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
			if (SuspendSheet.equalsIgnoreCase(constants.Dashboard_Analytics)) {
				test.log(LogStatus.INFO, "Page Suspended :- ",
						"Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
				testTearDown(se, test);
			}
			List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Dashboard_Analytics, strRegressionID,
					transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strDashboardAnalytics_Status = (String) row.get("DashboardAnalytics_Status");
				String strDashboardAnalytics_ModelType  = (String) row.get("DashboardAnalytics_ModelType");
		
		
		try {
			se.log().logTestStep("Validating Status and Model Type on Analytics Tab");
			test.log(LogStatus.INFO, "Validating Status and Model Type on Analytics Tab",
					"Transaction Step : " + transaction + "<br>" + "Page : Dashboard_AnalyticsTab");
			se.util().sleep(3000);
			SwitchToDefaultAndThenSwitchToFrame();
			se.element().Click(getDashboard_TAB_Analytics(), test);
			se.verify().verifyEquals("Dashboard_Analytics Tab of PowerWriter ",
					getDashboard_TAB_Analytics().isDisplayed(), true, true, test);
			se.element().waitForElementIsDisplayed(AnalyticsTab_BTN_ExpandAll, 180);
			se.element().waitForElementIsDisplayed(AnalyticsTab_TXT_Status, 1000);
			se.verify().verifyAsPassOrError("STATUS",getAnalyticsTab_TXT_Status().getText(), strDashboardAnalytics_Status, true, test);
			se.util().sleep(500);
			se.verify().verifyAsPassOrError("MODEL TYPE",getAnalyticsTab_TXT_ModelType().getText(),strDashboardAnalytics_ModelType, true, test);
			se.util().sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
			se.verify().verifyEquals("Failed to verify Status and Model type details on Analytics tab", true, false, true, test);
			se.log().logTestStep("Exception in Analytics tab - " + e);
			test.log(LogStatus.FAIL, "Exception in Analytics tab  - " + e);
		}
		iteration++;
			}
		}
	
		catch (Exception e) {
			// TODO: handle exception
			se.log().logTestStep("Issue in the page "+"AnalyticsTab"+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Failed", "Issue in the page "+"AnalyticsTab"+" For the transaction "+transaction);
			testTearDown(se, test);
		}
	}	
}
	