package ap.pages.CP;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.ap.automation.common.CommonAPMethods;
import Libraries.ap.automation.common.ExcelOperations;
import Libraries.ap.automation.common.SystemPropertyUtil;
import Libraries.ap.automation.common.Utils.TestPageFactory;
import Libraries.ap.automation.common.framework.Util;
import Libraries.ap.automation.common.framework.XlsData;
import ap.Constants.constants;
import ap.OR.OR_CP;
import ap.pages.common.APPW_CommonMethods;
import ap.pages.common.AP_Login;

public class CP_Summary extends OR_CP {

	public void CP_Summary_Details(String strRegressionID,String strRegressionName,String transaction,String suspendSheet,String strAgentLink,String strLOB,String strRelease_SelectRelease,String strRole_SelectRoleAs ,String quote, ExtentTest test,File file, XSSFWorkbook workbook) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.Summary)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Summary, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strSummary_TXT_TotalEstimatedPremium = (String) row.get("Summary_TXT_TotalEstimatedPremium");
			String strSummary_TXT_TotalTransactionPremiumPW = (String) row.get("Summary_TXT_TotalTransactionPremiumPW");
			String strSummary_EXT_LBL_HeaderStatus = (String) row.get("Summary_EXT_LBL_HeaderStatus");
			String strSummary_INT_LBL_HeaderStatus = (String) row.get("Summary_INT_LBL_HeaderStatus");
			String strSummary_UWApproved_Status = (String) row.get("Summary_UWApproved_Status");
			String strSummary_UWDeclined_Status = (String) row.get("Summary_UWDeclined_Status");
			String strSummary_Status_SubmitForIssuance = (String) row.get("Summary_Status_SubmitForIssuance");
			String strSummary_ServiceCenter_Popup_Click_Yes = (String) row.get("Summary_ServiceCenter_Popup_Click_Yes");
			String strSummary_ServiceCenter_Popup_Click_No = (String) row.get("Summary_ServiceCenter_Popup_Click_No");
			String strSummary_ServiceCenter_Popup_TXT_Name = (String) row.get("Summary_ServiceCenter_Popup_TXT_Name");
			String strSummary_ServiceCenter_Popup_TXT_PhoneNumb = (String) row.get("Summary_ServiceCenter_Popup_TXT_PhoneNumb");
			String strSummary_ServiceCenter_Popup_TXT_Email = (String) row.get("Summary_ServiceCenter_Popup_TXT_Email");
			String strSummary_ServiceCenter_Popup_TXT_AdditionalInfo = (String) row.get("Summary_ServiceCenter_Popup_TXT_AdditionalInfo");
			String strSummary_ServiceCenter_Popup_CHK_EmailDelivery = (String) row.get("Summary_ServiceCenter_Popup_CHK_EmailDelivery");
			String strSummary_ServiceCenter_Popup_CHK_PaperDelivery = (String) row.get("Summary_ServiceCenter_Popup_CHK_PaperDelivery");
			String strSummary_ServiceCenter_Popup_Click_GoBackToQuote = (String) row.get("Summary_ServiceCenter_Popup_Click_GoBackToQuote");
			String strSummary_ServiceCenter_Popup_Click_SubmitWAttachment = (String) row.get("Summary_ServiceCenter_Popup_Click_SubmitWAttachment");
			String strSummary_ServiceCenter_Popup_Click_Cancel = (String) row.get("Summary_ServiceCenter_Popup_Click_Cancel");
			String strSummary_ServiceCenter_Popup_Click_Continue = (String) row.get("Summary_ServiceCenter_Popup_Click_Continue");
			String strSummary_DD_SelectPaymentMethod = (String) row.get("Summary_DD_SelectPaymentMethod");
			String strSummary_TXT_EnterConfirmationNo = (String) row.get("Summary_TXT_EnterConfirmationNo");
			String strSummary_TXT_CheckNo = (String) row.get("Summary_TXT_CheckNo");
			String strSummary_CHK_UserAgreestoFollowing = (String) row.get("Summary_CHK_UserAgreestoFollowing");
			String strSummary_Execute = (String) row.get("Summary_Execute");
			String strGI_UW_Underwriter = (String) row.get("GI_UW_Underwriter");
			
			String strSummary_BTN_Satisfaction_popUp = (String) row.get("Summary_BTN_Satisfaction_popUp");
			String strSummary_label_TotalPropertyPrem = (String) row.get("Summary_label_TotalPropertyPrem");
			String strSummary_label_TotalLiabilityPrem = (String) row.get("Summary_label_TotalLiabilityPrem");
			String strSummary_label_TotalEmploymentLiabPrem = (String) row.get("Summary_label_TotalEmploymentLiabPrem");
			String strSummary_label_TotalCyberPrem = (String) row.get("Summary_label_TotalCyberPrem");
			String strSummary_label_TotalCrimePrem = (String) row.get("Summary_label_TotalCrimePrem");
			String strSummary_label_TotalInlandPrem = (String) row.get("Summary_label_TotalInlandPrem");
			String strSummary_label_TotalPropertyPrem_Actual = "";
			String strSummary_Coverages_Property = (String) row.get("Summary_Coverages_Property");//"Equipment Breakdown Wrap,Terrorism - Coverage Accepted,Universal Wrap,Water Backup Property Damage";//
			String strSummary_Coverages_Liability = (String) row.get("Summary_Coverages_Liability");
			String strSummary_Surcharge_Liability = (String) row.get("Summary_Surcharge_Liability");
			String strSummary_Coverages_EPLI = (String) row.get("Summary_Coverages_EPLI");	
			String strSummary_Coverages_Cyber = (String) row.get("Summary_Coverages_Cyber");	
			String strSummary_Coverages_Crime = (String) row.get("Summary_Coverages_Property");	
			String strSummary_Coverages_Inland = (String) row.get("Summary_Coverages_Property");
			String strSummary_label_TotalLiabilityPrem_Actual= "";
			String strSummary_label_TotalEmploymentLiabPrem_Actual= "";
			String strSummary_label_TotalCyberPrem_Actual= "";
			String strSummary_label_TotalCrimePrem_Actual= "";
			String strSummary_label_TotalInlandPrem_Actual= "";
			String strSummary_XarcRule = (String) row.get("Summary_XarcRule");
			String strSummary_XarcReferral = (String) row.get("Summary_XarcReferral");
			String strSummary_WarningPosition = (String) row.get("Summary_WarningPosition");
			//String strSummary_btn_CloseSubmission = (String) row.get("Summary_btn_CloseSubmission");
			String strSummary_SubmitPackageAlert = (String) row.get("Summary_SubmitPackageAlert");
			String strSummary_SubmitWC = (String) row.get("Summary_SubmitWC");
			String strSummary_SubmitAuto = (String) row.get("Summary_SubmitAuto");
			String strSummary_DD_MoreActions = (String) row.get("Summary_DD_MoreActions");
			String strSummary_ServiceCenterNotice = (String) row.get("Summary_ServiceCenterNotice");
			//String strSummary_ServiceCenterDetails = (String) row.get("Summary_ServiceCenterDetails");
			String strSummary_ServiceCenterConfirm = (String) row.get("Summary_ServiceCenterConfirm");
			String strSecura_TXT_Email = (String) row.get("Secura_TXT_Email");
			String strSecura_TXT_Password = (String) row.get("Secura_TXT_Password");
			String strSummary_Next_Quote = (String) row.get("Summary_Next_Quote");
			String strSummary_SubmitUmbrella = (String) row.get("Summary_SubmitUmbrella");
			
			
			
			int intStartRow=0;
			String Env =System.getProperty("Environment");
			Boolean log = true;
			try {
				
					if(!(transaction.equalsIgnoreCase("BookPolicyInPW")||transaction.equalsIgnoreCase("VerifyPolicyInPW"))){
				se.log().logTestStep("CP_Summary_Details");
				test.log(LogStatus.INFO, "CP_Summary_Details","Transaction Step : "+transaction + "<br>" +"Page : CP_Summary_Details");
				APPW_CommonMethods APPW_CommonMethods=TestPageFactory.initElements(se, APPW_CommonMethods.class);
				CommonAPMethods BT=TestPageFactory.initElements(se, CommonAPMethods.class);
			if(!suspendSheet.equalsIgnoreCase(constants.Summary)){
					APPW_CommonMethods.refreshWhen502error( this.getClass().getSimpleName(), 2,  test);
			}
			if(transaction.equalsIgnoreCase("PolicyIssuanceOnAP")){
				se.verify().verifyAsPassOrWarninig("CP_Summary_Details  of AgencyPortal ", getSummary_label().isDisplayed(),true, true,test);
			}else{
				se.verify().verifyEquals("CP_Summary_Details  of AgencyPortal ", getSummary_label().isDisplayed(),true, true,test);
				
			}
			APPW_CommonMethods.getSummaryRatingErrorDueToMoreProcessingTime(2,test);
			APPW_CommonMethods.GetSummaryHardStopRefresh(2,test);
			APPW_CommonMethods.GetPremiumRefresh(2,test);
				if(se.element().isElementPresent(PremiumIndication_Warning)){
					se.verify().verifyEquals("Rating error on Summary screen displayed even after refresh-",true,false, true,test);
					
				}
				else if(se.element().isElementPresent(Summary_Warning)){
					se.verify().verifyEquals("Rating error on Summary screen displayed even after refresh-",true,false, true,test);
					
				}else{
					if(!strRegressionID.equalsIgnoreCase("SE_02")&&!strRegressionID.equalsIgnoreCase("SE_03")&&!strRegressionID.equalsIgnoreCase("SE_05")&&!strRegressionID.equalsIgnoreCase("SL_16")&&!strRegressionID.equalsIgnoreCase("Functional_21")){
							se.verify().verifyAsPassOrWarninig("TotalEstimatedPremium on Summary screen",getSummary_label_TotalEstPrem(strSummary_TXT_TotalEstimatedPremium).getText(),strSummary_TXT_TotalEstimatedPremium,true,test);
							test.log(LogStatus.INFO,"Summary screen Status - "+ getSummary_headerstatus().getText(),test.addScreenCapture(Util.captureScreenshot("Summary screen Status" , se)));
							
					}
				}
				executor.executeScript("arguments[0].scrollIntoView(0,500);", getSummary_label());
				if(!strSummary_XarcRule.equalsIgnoreCase("N/A")) {
					se.verify().verifyAsPassOrWarninig("Xarc Rule Validation - ", getSummary_XarcRule(strSummary_WarningPosition).getText(),strSummary_XarcRule,true,test);
				}
				if(!strSummary_XarcReferral.equalsIgnoreCase("N/A")) {
					se.verify().verifyAsPassOrWarninig("Xarc Referral Validation - ", getSummary_XarcReferral(strSummary_WarningPosition).getText(),strSummary_XarcReferral,true,test);
				}
				if((se.element().isElementPresent(summary_UWReview)&&strRegressionID.equalsIgnoreCase("CU_05"))||(se.element().isElementPresent(summary_UWReview)&&strRegressionID.equalsIgnoreCase("CU_13"))||(se.element().isElementPresent(summary_UWReview)&&strRegressionID.equalsIgnoreCase("SE_02"))) 
				{
					test.log(LogStatus.INFO,"Summary screen Status before submitting for review Umbrella policy CU_05 - "+ getSummary_headerstatus().getText(),test.addScreenCapture(Util.captureScreenshot("Summary screen Status" , se)));
					
					se.element().Click(getSummaryUWReview(), test);
					se.element().Click(getcommon_btn_SaveandExit(), test);
					se.util().sleep(3000);
					if(se.element().isElementPresent(Summary_BTN_Satisfaction_popUp)){
						test.log(LogStatus.INFO,"Summary_BTN_Satisfaction_popUp- Diaplyed "+ getSummary_headerstatus().getText(),test.addScreenCapture(Util.captureScreenshot("Summary screen popup" , se)));
						se.element().Click(getSummary_BTN_Satisfaction_popUp(), test);	
					}
					CP_Internal_QuoteOpen(strRegressionID,   transaction, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs,quote,strSummary_INT_LBL_HeaderStatus,strSecura_TXT_Email, strSecura_TXT_Password, test);
					test.log(LogStatus.INFO,"Summary screen Status after submitting for review and opened as Internal user CU_05 - "+ getSummary_headerstatus().getText(),test.addScreenCapture(Util.captureScreenshot("Summary screen Status" , se)));
					APPW_CommonMethods.openQuoteInAP(quote,"N/A",test);
					BT.NavigateToTabs("Umbrella Limits/Coverages",test);
					BT.ClickContinue(test);
					BT.ClickContinue(test);
					BT.ClickContinue(test);
					se.util().sleep(3000);
					if(se.element().isElementPresent(Summary_hasStpSection)) {
						test.log(LogStatus.INFO,"hasStpSection - "+ se.driver().findElement(Summary_hasStpSection).getAttribute("value"),test.addScreenCapture(Util.captureScreenshot("hasSTPSection" , se)));
						test.log(LogStatus.INFO,"stpEligibleLabel - "+ se.driver().findElement(Summary_stpEligibleLabel).isDisplayed());
						test.log(LogStatus.INFO,"stpIneligibleLabel - "+ se.driver().findElement(Summary_stpIneligibleLabel).isDisplayed());
						test.log(LogStatus.INFO,"stpIneligibleReasons - "+ se.driver().findElements(Summary_stpIneligibleReasonsContainer).size());
						}else {
							test.log(LogStatus.INFO,"StpSection - not displayed",test.addScreenCapture(Util.captureScreenshot("hasSTPSection" , se)));
								
						}
					strSummary_UWApproved_Status="UW Approved";
					se.element().selectElement(summary_dd_status, strSummary_UWApproved_Status, test);
					se.util().sleep(3000);
					APPW_CommonMethods.getSummaryRatingErrorDueToMoreProcessingTime(2,test);
					APPW_CommonMethods.GetSummaryHardStopRefresh(2,test);
					APPW_CommonMethods.GetPremiumRefresh(2,test);
						if(se.element().isElementPresent(PremiumIndication_Warning)){
							se.verify().verifyEquals("Rating error on Summary screen displayed even after refresh-",true,false, true,test);
							
						}
						else if(se.element().isElementPresent(Summary_Warning)){
							se.verify().verifyEquals("Rating error on Summary screen displayed even after refresh-",true,false, true,test);
							
						}
					se.element().Click(getcommon_btn_SaveandContinue(), test);
					/*if( Env.equalsIgnoreCase("stage")) {
					
						se.verify().verifyEquals("UW Approved", getSummary_headerstatus().getText(),"UW Approved",true,test);
					}else {*/
					se.verify().verifyEquals("UW Approved", getSummary_headerstatus().getText(),"Ready to Issue",true,test);
					//}
					
					se.element().Click(getMyWork(), test);
					
					AP_Login  LoginPage = TestPageFactory.initElements(se, AP_Login.class);
					LoginPage.APLogoutDetails("Yes",test);
					se.util().sleep(3000);
					CP_External_QuoteOpen(strRegressionID,   transaction, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs,quote, test);
					
				}else if((!se.element().isElementPresent(summary_UWReview)&&strRegressionID.equalsIgnoreCase("CU_05"))||(!se.element().isElementPresent(summary_UWReview)&&strRegressionID.equalsIgnoreCase("CU_13"))||(!se.element().isElementPresent(summary_UWReview)&&strRegressionID.equalsIgnoreCase("Functional_37"))){
					test.log(LogStatus.INFO,"Summary screen Status before submitting for Issuance Umbrella policy "+strRegressionID+", Submit for Review is not displayed - "+ getSummary_headerstatus().getText(),test.addScreenCapture(Util.captureScreenshot("Summary screen Status" , se)));
				}
				
				se.element().enterOrValidateText(getGI_UW_Underwriter(strGI_UW_Underwriter),strGI_UW_Underwriter,test);
				
				if(strAgentLink.equals("Yes")&&strSummary_Execute.contains("Y") /*&&!strRegressionID.equalsIgnoreCase("SE_02")&&!strRegressionID.equalsIgnoreCase("SE_03")*/){ 
					se.element().enterOrValidateText( getSummary_headerstatus(),strSummary_EXT_LBL_HeaderStatus,test);
					
					se.element().Click(getSummaryUWReview(), test);
					se.element().Click(getcommon_btn_SaveandExit(), test);
					se.util().sleep(3000);
					if(se.element().isElementPresent(Summary_BTN_Satisfaction_popUp)){
						test.log(LogStatus.INFO,"Summary_BTN_Satisfaction_popUp- Diaplyed "+ getSummary_headerstatus().getText(),test.addScreenCapture(Util.captureScreenshot("Summary screen popup" , se)));
						se.element().Click(getSummary_BTN_Satisfaction_popUp(), test);	
					}
					CP_Internal_QuoteOpen(strRegressionID,   transaction, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs,quote,strSummary_INT_LBL_HeaderStatus,strSecura_TXT_Email, strSecura_TXT_Password, test);test.log(LogStatus.INFO,"Summary screen Status after submitting for review and opened as Internal user- "+ getSummary_headerstatus().getText(),test.addScreenCapture(Util.captureScreenshot("Summary screen Status" , se)));
					
				}
				/*if(strRegressionID.equalsIgnoreCase("SE_02")||strRegressionID.equalsIgnoreCase("SE_03")){
					if(!transaction.equalsIgnoreCase("PolicyIssuanceOnAP"))
					{
					se.verify().verifyEquals("Summary status is Inprogress before logging in as Internal user", "In-Progress",getSummary_headerstatus().getText(),true,test);
					se.util().sleep(3000);
					CP_Internal_QuoteOpen(strRegressionID,   transaction, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs,quote,strSummary_INT_LBL_HeaderStatus, test);
					se.util().sleep(3000);
					se.verify().verifyEquals("CP_LossHistoryExpRating_Details  of AgencyPortal ", getLossHistoryExpRating_label().isDisplayed(),true, true,test);	
					se.element().Click(getGI_CHK_Continue(), test);
					se.element().enterOrValidateText(getSummary_label_TotalEstPrem(strSummary_TXT_TotalEstimatedPremium),strSummary_TXT_TotalEstimatedPremium,test);
					test.log(LogStatus.INFO,"Summary screen Status after SE02 or SE03 quote opened in Internal- "+ getSummary_headerstatus().getText(),test.addScreenCapture(Util.captureScreenshot("Summary screen Status" , se)));
					
					se.element().Click(getSummaryUWReview(), test);
					se.element().Click(getcommon_btn_SaveandExit(), test);
					se.util().sleep(5000);
					se.element().Click(getCardHeader(), test);
					se.util().sleep(2000);
					se.element().Click(getBtneventWorkItemAction_Open(), test);
					test.log(LogStatus.INFO,"Summary screen Status after submitting for review - SE02/SE03 - "+ getSummary_headerstatus().getText(),test.addScreenCapture(Util.captureScreenshot("Summary screen Status" , se)));
				}
					
				}*/
				
//				if(strSummary_INT_LBL_HeaderStatus.equals("UW Declined"))
//				{
//					se.element().enterOrValidateText( getSummary_headerstatus(),strSummary_INT_LBL_HeaderStatus,test);
//					test.log(LogStatus.INFO,"Summary screen Status Expected UW Declined, Actual is - "+ getSummary_headerstatus().getText(),test.addScreenCapture(Util.captureScreenshot("Summary screen Status" , se)));
//					
//				}
				
				if(strSummary_INT_LBL_HeaderStatus.equals("Close"))
				{
					se.element().SelectElement(Summary_DD_MoreActions, strSummary_DD_MoreActions,test);
					
				}
				if((strRegressionID.equalsIgnoreCase("TC_11") || strRegressionID.equalsIgnoreCase("BP_11") ||strRegressionID.equalsIgnoreCase("CUCA_06")||strRegressionID.equalsIgnoreCase("CUWC_07")||strRegressionID.equalsIgnoreCase("CU_07"))&& !transaction.equalsIgnoreCase("PolicyIssuanceOnAP")){
					AP_Login  LoginPage = TestPageFactory.initElements(se, AP_Login.class);
					LoginPage.APLogoutDetails("No",test);
					se.util().sleep(6000);
					CP_Internal_QuoteOpen(strRegressionID,   transaction, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs,quote,strSummary_INT_LBL_HeaderStatus,strSecura_TXT_Email, strSecura_TXT_Password, test);
					if(!se.element().isElementPresent(Summary_headerstatus)) {
						BT.NavigateToTabs("Underwriting Questions",test);
						BT.ClickContinue(test);
						se.util().sleep(3000);
					}
					test.log(LogStatus.INFO,"Summary screen Status for - "+strRegressionID+" - " + getSummary_headerstatus().getText(),test.addScreenCapture(Util.captureScreenshot("Summary screen Status" , se)));
					if(se.element().isElementPresent(summary_btn_SUBMITTEDFORISSUANCE)) {
						strSummary_INT_LBL_HeaderStatus="N/A";
					}
				}
				
				if(strSummary_INT_LBL_HeaderStatus.equals("Referred to UW") && !strRegressionID.equalsIgnoreCase("Functional_21"))
				{
					se.util().sleep(5000);
					test.log(LogStatus.INFO,"Summary_headerstatus - "+getSummary_headerstatus().getText(),test.addScreenCapture(Util.captureScreenshot("Summary_headerstatus" , se)));
					
					//se.verify().verifyEquals("Referred to UW", strSummary_INT_LBL_HeaderStatus,getSummary_headerstatus().getText(),true,test);
					if(se.element().isElementPresent(Summary_hasStpSection)) {
						test.log(LogStatus.INFO,"hasStpSection - "+ se.driver().findElement(Summary_hasStpSection).getAttribute("value"),test.addScreenCapture(Util.captureScreenshot("hasSTPSection" , se)));
						test.log(LogStatus.INFO,"stpEligibleLabel - "+ se.driver().findElement(Summary_stpEligibleLabel).isDisplayed());
						test.log(LogStatus.INFO,"stpIneligibleLabel - "+ se.driver().findElement(Summary_stpIneligibleLabel).isDisplayed());
						test.log(LogStatus.INFO,"stpIneligibleReasons - "+ se.driver().findElements(Summary_stpIneligibleReasonsContainer).size());
						}else {
							test.log(LogStatus.INFO,"StpSection - not displayed",test.addScreenCapture(Util.captureScreenshot("hasSTPSection" , se)));
								
						}
					if(getSummary_headerstatus().getText().equals("Referred to UW")) {
					se.element().selectElement(summary_dd_status, strSummary_UWApproved_Status, test);
					if(strAgentLink.equalsIgnoreCase("Yes")) {
						se.element().Click(getcommon_btn_SaveandContinue(), test);
						/*if( Env.equalsIgnoreCase("stage")) {
							se.verify().verifyEquals("UW Approved", getSummary_headerstatus().getText(),"UW Approved",true,test);
						}else {*/
						se.verify().verifyEquals("UW Approved", getSummary_headerstatus().getText(),"Ready to Issue",true,test);
						//}
						//se.verify().verifyEquals("UW Approved", getSummary_headerstatus().getText(),"Ready to Issue",true,test);
						APPW_CommonMethods.getSummaryRatingErrorDueToMoreProcessingTime(2,test);
						APPW_CommonMethods.GetSummaryHardStopRefresh(2,test);
						APPW_CommonMethods.GetPremiumRefresh(2,test);
						if(se.element().isElementPresent(PremiumIndication_Warning)){
							se.verify().verifyEquals("Rating error on Summary screen displayed even after refresh-",true,false, true,test);
							
						}
						else if(se.element().isElementPresent(Summary_Warning)){
							se.verify().verifyEquals("Rating error on Summary screen displayed even after refresh-",true,false, true,test);
							
						}
						if(!strRegressionID.equalsIgnoreCase("CATC_01")) { 
							if(!strRegressionID.equalsIgnoreCase("WCBP_06")) {
								if(!strRegressionID.equalsIgnoreCase("WCTC_02")) {
						
						se.element().Click(getMyWork(), test);
								}
						}
						}
						
						
						/*AP_Login  LoginPage = TestPageFactory.initElements(se, AP_Login.class);
						LoginPage.APLogoutDetails("Yes",test);
						se.util().sleep(6000);
					*/}else {
						se.element().Click(getcommon_btn_SaveandContinue(), test);
						/*if( Env.equalsIgnoreCase("stage")) {
							se.verify().verifyEquals("UW Approved", getSummary_headerstatus().getText(),"UW Approved",true,test);
						}else {*/
						se.verify().verifyEquals("UW Approved", getSummary_headerstatus().getText(),"Ready to Issue",true,test);
						//}
						System.out.println("UW Approved");
						
						APPW_CommonMethods.getSummaryRatingErrorDueToMoreProcessingTime(2,test);
						APPW_CommonMethods.GetSummaryHardStopRefresh(2,test);
						APPW_CommonMethods.GetPremiumRefresh(2,test);
						if(se.element().isElementPresent(PremiumIndication_Warning)){
							se.verify().verifyEquals("Rating error on Summary screen displayed even after refresh-",true,false, true,test);
							
						}
						else if(se.element().isElementPresent(Summary_Warning)){
							se.verify().verifyEquals("Rating error on Summary screen displayed even after refresh-",true,false, true,test);
							
						}
						/*else {
							
							AP_Login  LoginPage = TestPageFactory.initElements(se, AP_Login.class);
							LoginPage.APLogoutDetails("Yes",test);
							se.util().sleep(6000);
							
							if (strAgentLink.equalsIgnoreCase("No")) {
								InternalLogin(strSecura_TXT_Email, strSecura_TXT_Password, test);
								CP_Internal_QuoteOpen(strRegressionID,   transaction, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs,quote,strSummary_INT_LBL_HeaderStatus,strSecura_TXT_Email, strSecura_TXT_Password, test);
							}
						}*/
						
					}
					}
					
				}
				
			
				
				if(strSummary_INT_LBL_HeaderStatus.equals("Referred to UW") && strRegressionID.equalsIgnoreCase("Functional_21"))
				{
					se.util().sleep(5000);
					test.log(LogStatus.INFO,"Summary_headerstatus - "+getSummary_headerstatus().getText(),test.addScreenCapture(Util.captureScreenshot("Summary_headerstatus" , se)));
					
					//se.verify().verifyEquals("Referred to UW", strSummary_INT_LBL_HeaderStatus,getSummary_headerstatus().getText(),true,test);
					strSummary_UWDeclined_Status="UW Declined";
					if(se.element().isElementPresent(Summary_hasStpSection)) {
						test.log(LogStatus.INFO,"hasStpSection - "+ se.driver().findElement(Summary_hasStpSection).getAttribute("value"),test.addScreenCapture(Util.captureScreenshot("hasSTPSection" , se)));
						test.log(LogStatus.INFO,"stpEligibleLabel - "+ se.driver().findElement(Summary_stpEligibleLabel).isDisplayed());
						test.log(LogStatus.INFO,"stpIneligibleLabel - "+ se.driver().findElement(Summary_stpIneligibleLabel).isDisplayed());
						test.log(LogStatus.INFO,"stpIneligibleReasons - "+ se.driver().findElements(Summary_stpIneligibleReasonsContainer).size());
						}else {
							test.log(LogStatus.INFO,"StpSection - not displayed",test.addScreenCapture(Util.captureScreenshot("hasSTPSection" , se)));
								
						}
					if(getSummary_headerstatus().getText().equals("Referred to UW")) {
					se.element().selectElement(summary_dd_status, strSummary_UWDeclined_Status, test);
					if(strAgentLink.equalsIgnoreCase("Yes")) {
						se.element().Click(getcommon_btn_SaveandContinue(), test);
						se.verify().verifyEquals("UW Declined", getSummary_headerstatus().getText(),"UW Declined",true,test);
						APPW_CommonMethods.getSummaryRatingErrorDueToMoreProcessingTime(2,test);
						APPW_CommonMethods.GetSummaryHardStopRefresh(2,test);
						APPW_CommonMethods.GetPremiumRefresh(2,test);
						se.element().Click(getMyWork(), test);
					}else {
						se.element().Click(getcommon_btn_SaveandContinue(), test);
						se.verify().verifyEquals("UW Declined", getSummary_headerstatus().getText(),"UW Declined",true,test);
						APPW_CommonMethods.getSummaryRatingErrorDueToMoreProcessingTime(2,test);
						APPW_CommonMethods.GetSummaryHardStopRefresh(2,test);
						APPW_CommonMethods.GetPremiumRefresh(2,test);
					}
					}
				}
				if(strSummary_INT_LBL_HeaderStatus.equals("SECURA In-Progress"))
				{
					se.element().enterOrValidateText( getSummary_headerstatus(),strSummary_INT_LBL_HeaderStatus,test);
					
					se.element().Click(getSummaryUWReview(), test);
					se.element().Click(getcommon_btn_SaveandExit(), test);
				
					CP_Internal_QuoteOpen(strRegressionID,   transaction, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs,quote,strSummary_INT_LBL_HeaderStatus,strSecura_TXT_Email, strSecura_TXT_Password, test);if(!se.element().isElementPresent(Summary_headerstatus)) {
						if(se.element().isElementPresent(BillingSummary_label)) {
						BT.ClickContinue(test);
						se.util().sleep(3000);
						}
					}
					se.verify().verifyEquals("Referred to UW",getSummary_headerstatus().getText(), "Referred to UW",true,test);
					
				}
				if(strSummary_INT_LBL_HeaderStatus.contains("Issued"))
				{
					APPW_CommonMethods.getSummaryRatingErrorDueToMoreProcessingTime(2,test);
					APPW_CommonMethods.GetSummaryHardStopRefresh(2,test);
					APPW_CommonMethods.GetPremiumRefresh(2,test);
				String status="";
				if(strSummary_INT_LBL_HeaderStatus.contains("validate2")){
				 status=strSummary_INT_LBL_HeaderStatus.split("=")[1];
					status = status.substring(0, 6);
				}else{
					status = strSummary_INT_LBL_HeaderStatus;
				}
				intStartRow = 10;
					se.verify().verifyEquals("Issued",getSummary_headerstatus().getText(),status,test);
					premiumverification("Rating error on Summary screen while verifying Issuance -",
							quote,strLOB, strRegressionID,strRegressionName,transaction,intStartRow,strSummary_TXT_TotalTransactionPremiumPW, strSummary_TXT_TotalEstimatedPremium,
							strSummary_label_TotalPropertyPrem,strSummary_label_TotalPropertyPrem_Actual, strSummary_Coverages_Property,
							strSummary_label_TotalLiabilityPrem,strSummary_label_TotalLiabilityPrem_Actual, strSummary_Coverages_Liability,strSummary_Surcharge_Liability,
							strSummary_label_TotalEmploymentLiabPrem,strSummary_label_TotalEmploymentLiabPrem_Actual,strSummary_Coverages_EPLI,
							strSummary_label_TotalCyberPrem,strSummary_label_TotalCyberPrem_Actual,strSummary_Coverages_Cyber,
							strSummary_label_TotalCrimePrem,strSummary_label_TotalCrimePrem_Actual,strSummary_Coverages_Crime,
							strSummary_label_TotalInlandPrem,strSummary_label_TotalInlandPrem_Actual,strSummary_Coverages_Inland,test, file,  workbook);
									}
				if(strSummary_EXT_LBL_HeaderStatus.contains("Issued"))
				{
					APPW_CommonMethods.getSummaryRatingErrorDueToMoreProcessingTime(2,test);
					APPW_CommonMethods.GetSummaryHardStopRefresh(2,test);
					APPW_CommonMethods.GetPremiumRefresh(2,test);
				String status="";
				if(strSummary_EXT_LBL_HeaderStatus.contains("validate2")){
				 status=strSummary_EXT_LBL_HeaderStatus.split("=")[1];
					status = status.substring(0, 6);
				}else{
					status = strSummary_EXT_LBL_HeaderStatus;
				}	
				if(!strRegressionID.equalsIgnoreCase("Functional_21")) {
				intStartRow = 10;
				se.verify().verifyEquals("Issued", getSummary_headerstatus().getText(),status,test);
					premiumverification("Rating error on Summary screen while verifying Issuance -",
							quote,strLOB, strRegressionID,strRegressionName,transaction,intStartRow,strSummary_TXT_TotalTransactionPremiumPW, strSummary_TXT_TotalEstimatedPremium,
							strSummary_label_TotalPropertyPrem,strSummary_label_TotalPropertyPrem_Actual, strSummary_Coverages_Property,
							strSummary_label_TotalLiabilityPrem,strSummary_label_TotalLiabilityPrem_Actual, strSummary_Coverages_Liability,strSummary_Surcharge_Liability,
							strSummary_label_TotalEmploymentLiabPrem,strSummary_label_TotalEmploymentLiabPrem_Actual,strSummary_Coverages_EPLI,
							strSummary_label_TotalCyberPrem,strSummary_label_TotalCyberPrem_Actual,strSummary_Coverages_Cyber,
							strSummary_label_TotalCrimePrem,strSummary_label_TotalCrimePrem_Actual,strSummary_Coverages_Crime,
							strSummary_label_TotalInlandPrem,strSummary_label_TotalInlandPrem_Actual,strSummary_Coverages_Inland,test, file,  workbook);
				}}
				
				if(strAgentLink.equals("Yes")&&strSummary_Execute.contains("Y") ){
					AP_Login  LoginPage = TestPageFactory.initElements(se, AP_Login.class);
					LoginPage.APLogoutDetails("Yes",test);
					se.util().sleep(3000);
					CP_External_QuoteOpen(strRegressionID,   transaction, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs,quote, test);
				
					}
				if((strRegressionID.equalsIgnoreCase("TC_11") || strRegressionID.equalsIgnoreCase("BP_11") ||strRegressionID.equalsIgnoreCase("CUCA_06")||strRegressionID.equalsIgnoreCase("CUWC_07")||strRegressionID.equalsIgnoreCase("CU_07"))&& !transaction.equalsIgnoreCase("PolicyIssuanceOnAP")){
					AP_Login  LoginPage = TestPageFactory.initElements(se, AP_Login.class);
					LoginPage.APLogoutDetails("No",test);
					se.util().sleep(6000);
					strSummary_INT_LBL_HeaderStatus=(String) row.get("Summary_INT_LBL_HeaderStatus");
					CP_Internal_QuoteOpen(strRegressionID,   transaction, strAgentLink, strLOB, strRelease_SelectRelease, strRole_SelectRoleAs,quote,strSummary_INT_LBL_HeaderStatus,strSecura_TXT_Email, strSecura_TXT_Password, test);
					if(!se.element().isElementPresent(Summary_headerstatus)) {
						BT.NavigateToTabs("Underwriting Questions",test);
						BT.ClickContinue(test);
						se.util().sleep(3000);
					}
					test.log(LogStatus.INFO,"Summary screen Status for - "+strRegressionID+" - " + getSummary_headerstatus().getText(),test.addScreenCapture(Util.captureScreenshot("Summary screen Status" , se)));
					
				}
				/*if(strRegressionID.equalsIgnoreCase("CU_09")) {
					BT.NavigateToTabs("Underwriting Questions",test);
					BT.ClickContinue(test);
					se.util().sleep(3000);
				}*/
				if((!(transaction.equalsIgnoreCase("PolicyIssuanceOnAP"))&& iteration==0) || !(strRegressionID.equalsIgnoreCase("Functional_19"))&& !(strRegressionID.equalsIgnoreCase("Functional_21"))){
					APPW_CommonMethods.getSummaryRatingErrorDueToMoreProcessingTime(2,test);
					APPW_CommonMethods.GetSummaryHardStopRefresh(2,test);
					APPW_CommonMethods.GetPremiumRefresh(2,test);
						intStartRow = 0;
					
					premiumverification("Rating error on Summary screen",
							quote, strLOB, strRegressionID,strRegressionName,transaction,intStartRow,strSummary_TXT_TotalTransactionPremiumPW, strSummary_TXT_TotalEstimatedPremium,
							strSummary_label_TotalPropertyPrem,strSummary_label_TotalPropertyPrem_Actual, strSummary_Coverages_Property,
							strSummary_label_TotalLiabilityPrem,strSummary_label_TotalLiabilityPrem_Actual, strSummary_Coverages_Liability,strSummary_Surcharge_Liability,
							strSummary_label_TotalEmploymentLiabPrem,strSummary_label_TotalEmploymentLiabPrem_Actual,strSummary_Coverages_EPLI,
							strSummary_label_TotalCyberPrem,strSummary_label_TotalCyberPrem_Actual,strSummary_Coverages_Cyber,
							strSummary_label_TotalCrimePrem,strSummary_label_TotalCrimePrem_Actual,strSummary_Coverages_Crime,
							strSummary_label_TotalInlandPrem,strSummary_label_TotalInlandPrem_Actual,strSummary_Coverages_Inland,test, file,  workbook);
					
					if(!strSummary_Status_SubmitForIssuance.equalsIgnoreCase("N/A")){
						log =false;
						se.element().waitForElementToDisappear(summary_LNK_Loading,300);
						boolean linkDisplayed=se.element().waitForElementIsDisplayed(summary_LNK_QuoteDeclarations);
						boolean linkDisplayed2=se.element().waitForElementIsDisplayed(summary_LNK_QuoteForms);
						//boolean linkDisplayed4=se.element().waitForElementIsDisplayed(summary_LNK_QuoteDeclarationstwo);
						//boolean linkDisplayed5=se.element().waitForElementIsDisplayed(summary_LNK_QuoteFormstwo);
						
						//boolean linkDisplayed=se.element().waitBasedOnCount(summary_LNK_QuoteDeclarations,100);
						//boolean linkDisplayed2=se.element().waitBasedOnCount(summary_LNK_QuoteForms, 10);
					
						/*if(linkDisplayed) {
							se.element().enterOrValidateText(getSummary_headerstatus(),strSummary_Status_SubmitForIssuance,test);
					se.element().selectElement(summary_dd_PaymentType, strSummary_DD_SelectPaymentMethod, test);
					se.element().enterOrValidateText(getSummary_TXT_EnterConfirmationNo(strSummary_TXT_EnterConfirmationNo),strSummary_TXT_EnterConfirmationNo,test);
					se.element().enterOrValidateText(getSummary_TXT_CheckNo(strSummary_TXT_CheckNo),strSummary_TXT_CheckNo,test);
					
					se.element().checkUncheckOrValidate(getSummary_CHK_UserAgreestoFollowing(strSummary_CHK_UserAgreestoFollowing), strSummary_CHK_UserAgreestoFollowing, test);
					se.element().Click(getsummary_btn_SUBMITTEDFORISSUANCE(), test);
					se.util().sleep(3000);
						}*/
						/*else*/ if(linkDisplayed||linkDisplayed2){
							se.element().enterOrValidateText(getSummary_headerstatus(),strSummary_Status_SubmitForIssuance,test);
							se.element().selectElement(summary_dd_PaymentType, strSummary_DD_SelectPaymentMethod, test);
							se.element().enterOrValidateText(getSummary_TXT_EnterConfirmationNo(strSummary_TXT_EnterConfirmationNo),strSummary_TXT_EnterConfirmationNo,test);
							se.element().enterOrValidateText(getSummary_TXT_CheckNo(strSummary_TXT_CheckNo),strSummary_TXT_CheckNo,test);
							
							
							se.element().Click(getsummary_btn_SaveAndExitNew(), test);
							se.util().sleep(3000);
							if(se.element().isElementPresent(summary_btn_SUBMITTEDFORISSUANCENew)) {
								se.element().Click(getsummary_btn_SUBMITTEDFORISSUANCENew(), test);
								//se.element().Click(getSummary_CHK_UserAgreestoFollowingNew(), test);
								se.util().sleep(3000);
								se.element().checkUncheckOrValidate(getSummary_CHK_UserAgreestoFollowingNew(strSummary_CHK_UserAgreestoFollowing), strSummary_CHK_UserAgreestoFollowing, test);
								
							}
							
							
							se.util().sleep(10000);
						}
						else
						{
							boolean linkDisplayed3=se.element().waitBasedOnCount(summary_TXT_QuoteDeclarations,60);
							
							if(linkDisplayed3) {
								
								se.element().checkUncheckOrValidate(getSummary_CHK_UserAgreestoFollowing(strSummary_CHK_UserAgreestoFollowing), strSummary_CHK_UserAgreestoFollowing, test);
								se.element().Click(getsummary_btn_SUBMITTEDFORISSUANCE(), test);
								se.util().sleep(3000);
							}else {
								executor.executeScript("arguments[0].scrollIntoView(0,500);", getsummary_TXT_QuoteDeclarations());
								test.log(LogStatus.FAIL,"Quote declaration is not displayed even after waiting - ",test.addScreenCapture(Util.captureScreenshot("Unable to complete submission for Issuance" , se)));
								se.verify().verifyEquals("Quote declaration is not displayed even after waiting - ", true, false, true, test);
							}
						}
						if(strSummary_SubmitPackageAlert.equals("Y")){
							se.util().sleep(2000);
							se.element().Click(getsummary_CHK_PackageSubmission(), test);
						}
						if(strSummary_SubmitWC.equals("Y")){
							se.util().sleep(2000);
							se.element().Click(getsummary_CHK_SubmitWCOne(quote), test);
							//se.element().Click(getsummary_CHK_SubmitWC(), test);
						}
						if(strSummary_SubmitAuto.equals("Y")){
							se.util().sleep(2000);
							se.element().Click(getsummary_CHK_SubmitCAOne(quote), test);
							//se.element().Click(getsummary_CHK_SubmitAuto(), test);
						}
						if(strSummary_SubmitUmbrella.equals("Y")){
							se.util().sleep(2000);
							se.element().Click(getsummary_CHK_SubmitUMOne(quote), test);
							//se.element().Click(getsummary_CHK_SubmitAuto(), test);
						}
					
						if(se.element().isElementPresent(summary_btn_submitButtonNew)) {
						se.util().sleep(3000);
						//executor.executeScript("arguments[0].scrollIntoView(0,500);", getsummary_btn_submitButtonNew());
						se.element().Click(getsummary_btn_submitButtonNew(), test);
						se.util().sleep(15000);
					}
					
					if(se.element().isElementPresent(Summary_BTN_Satisfaction_popUp)){
						test.log(LogStatus.INFO,"Summary_BTN_Satisfaction_popUp- Diaplyed ",test.addScreenCapture(Util.captureScreenshot("Summary screen popup" , se)));
						se.element().Click(getSummary_BTN_Satisfaction_popUp(), test);	
					}
					if(strSummary_ServiceCenterNotice.equals("Y")){
						se.util().sleep(3000);
						se.element().Click(getSummary_ServiceCenter_Popup_Click_Yes(), test);
						//se.element().checkUncheckOrValidate( getSummary_ServiceCenter_Popup_Click_Yes(strSummary_ServiceCenter_Popup_Click_Yes),strSummary_ServiceCenter_Popup_Click_Yes,test);
						
						if(strSummary_ServiceCenter_Popup_Click_Yes.equals("Y")) {
							
							se.element().enterOrValidateText( getSummary_ServiceCenter_Popup_TXT_Name(strSummary_ServiceCenter_Popup_TXT_Name),strSummary_ServiceCenter_Popup_TXT_Name,test);
							se.element().enterOrValidateText( getSummary_ServiceCenter_Popup_TXT_PhoneNumb(strSummary_ServiceCenter_Popup_TXT_PhoneNumb),strSummary_ServiceCenter_Popup_TXT_PhoneNumb,test);
							se.element().enterOrValidateText( getSummary_ServiceCenter_Popup_TXT_Email(strSummary_ServiceCenter_Popup_TXT_Email),strSummary_ServiceCenter_Popup_TXT_Email,test);
							se.element().enterOrValidateText( getSummary_ServiceCenter_Popup_TXT_AdditionalInfo(strSummary_ServiceCenter_Popup_TXT_AdditionalInfo),strSummary_ServiceCenter_Popup_TXT_AdditionalInfo,test);
							//radio select
							se.element().checkUncheckOrValidate( getSummary_ServiceCenter_Popup_CHK_EmailDelivery(strSummary_ServiceCenter_Popup_CHK_EmailDelivery),strSummary_ServiceCenter_Popup_CHK_EmailDelivery,test);
							se.element().checkUncheckOrValidate( getSummary_ServiceCenter_Popup_CHK_PaperDelivery(strSummary_ServiceCenter_Popup_CHK_PaperDelivery),strSummary_ServiceCenter_Popup_CHK_PaperDelivery,test);
							
							//se.element().Click(getSummary_ServiceCenter_Popup_Click_GoBackToQuote(),test);
							
							
							se.element().Click(getSummary_ServiceCenter_Popup_Click_SubmitWAttachment(),test);
							//se.element().Click(getSummary_ServiceCenter_Popup_Click_Cancel(),test);
							
							if(strSummary_ServiceCenterConfirm.equals("Y")) {
								test.log(LogStatus.INFO,"Summary_ServiceCenterConfirm- Diaplyed ",test.addScreenCapture(Util.captureScreenshot("Summary screen popup" , se)));
								se.element().Click(getSummary_ServiceCenter_Popup_Click_Continue(),test);
								
							}
								
						}
						
					
					}
					
					else {
						se.element().Click(getSummary_ServiceCenter_Popup_Click_No(), test);
						//se.element().checkUncheckOrValidate( getSummary_ServiceCenter_Popup_Click_No(strSummary_ServiceCenter_Popup_Click_No),strSummary_ServiceCenter_Popup_Click_No,test);
						
					}
					
					/*if(se.element().isElementPresent(strSummary_ServiceCenterNotice)){
						test.log(LogStatus.INFO,"Summary_ServiceCenterNotice- Diaplyed ",test.addScreenCapture(Util.captureScreenshot("Summary screen popup" , se)));
						se.element().Click(getSummary_ServiceCenter_Popup_Click_Yes(), test);
						se.element().Click(getSummary_ServiceCenter_Popup_Click_No(), test);
						
					}
					
					if(strSummary_ServiceCenterDetails.equals("Y")) {
						test.log(LogStatus.INFO,"Summary_ServiceCenterDetails- Diaplyed ",test.addScreenCapture(Util.captureScreenshot("Summary screen popup" , se)));
						se.element().enterOrValidateText( getSummary_ServiceCenter_Popup_Enter_Name(strSummary_ServiceCenter_Popup_Enter_Name),strSummary_ServiceCenter_Popup_Enter_Name,test);
						se.element().enterOrValidateText( getSummary_ServiceCenter_Popup_Enter_PhoneNumb(strSummary_ServiceCenter_Popup_Enter_PhoneNumb),strSummary_ServiceCenter_Popup_Enter_PhoneNumb,test);
						se.element().enterOrValidateText( getSummary_ServiceCenter_Popup_Enter_Email(strSummary_ServiceCenter_Popup_Enter_Email),strSummary_ServiceCenter_Popup_Enter_Email,test);
						se.element().enterOrValidateText( getSummary_ServiceCenter_Popup_Enter_AdditionalInfo(strSummary_ServiceCenter_Popup_Enter_AdditionalInfo),strSummary_ServiceCenter_Popup_Enter_AdditionalInfo,test);
						//radio select
						se.element().checkUncheckOrValidate( getSummary_ServiceCenter_Popup_CHK_EmailDelivery(strSummary_ServiceCenter_Popup_CHK_EmailDelivery),strSummary_ServiceCenter_Popup_CHK_EmailDelivery,test);
						se.element().checkUncheckOrValidate( getSummary_ServiceCenter_Popup_CHK_PaperDelivery(strSummary_ServiceCenter_Popup_CHK_PaperDelivery),strSummary_ServiceCenter_Popup_CHK_PaperDelivery,test);
						
						se.element().Click(getSummary_ServiceCenter_Popup_Click_GoBackToQuote(), test);
						se.element().Click(getSummary_ServiceCenter_Popup_Click_SubmitWAttachment(), test);
						se.element().Click(getSummary_ServiceCenter_Popup_Click_Cancel(), test);
						se.element().Click(getSummary_ServiceCenter_Popup_Click_Continue(), test);
					}*/
					
					
					
					if(se.element().isElementPresent(summary_btn_closeButtonNew)){
						
						test.log(LogStatus.INFO,"Save and exit button is displayed- After submission for Issuance - "+ se.element().getText(ap_accntInfo),test.addScreenCapture(Util.captureScreenshot("Account Info" , se)));
						se.element().Click(getsummary_btn_closeButtonNew(), test);	
						se.element().waitBasedOnCount(PleaseWaitPopup,40);
						
					}else{
						test.log(LogStatus.FAIL,"After clicking on submission for Issuance,Save and Exit is not displayed - ",test.addScreenCapture(Util.captureScreenshot("Unable to complete submission for Issuance" , se)));
						se.verify().verifyEquals("After clicking on submission for Issuance,Save and Exit is not displayed", true, false, true, test);

					}
					se.util().sleep(2000);
					if(se.element().isElementPresent(ap_accntInfo)){
						
						test.log(LogStatus.INFO,"CP_AccountInfo of AgencyPortal After submission for Issuance - "+ se.element().getText(ap_accntInfo),test.addScreenCapture(Util.captureScreenshot("Account Info" , se)));
							
					}else{
						test.log(LogStatus.FAIL,"CP_AccountInfo of AgencyPortal After submission for Issuance is not displayed - ",test.addScreenCapture(Util.captureScreenshot("Unable to complete submission for Issuance" , se)));
						se.verify().verifyEquals("CP_AccountInfo of AgencyPortal After submission for Issuance is not displayed", true, false, true, test);

					}
					
					
					}
					
					if (log)
					{
						String status = getSummary_headerstatus().getText();
						if(strSummary_Status_SubmitForIssuance.equalsIgnoreCase("N/A") && status.equals("Ready to Issue") ) {
							if(!strAgentLink.equals("Yes")) 
							{
								if(!strSummary_Next_Quote.equals("Yes"))
								{
									AP_Login LoginPage = TestPageFactory.initElements(se, AP_Login.class);
									LoginPage.APLogoutDetails("No",test);se.util().sleep(6000);
									}
								}
							}
						}
				}
			}
				else {
					intStartRow = 9;
					premiumverification("Premium not displayed on PW premium screen",
							quote, strLOB, strRegressionID,strRegressionName,transaction,intStartRow,strSummary_TXT_TotalTransactionPremiumPW, strSummary_TXT_TotalEstimatedPremium,
							strSummary_label_TotalPropertyPrem,strSummary_label_TotalPropertyPrem_Actual, strSummary_Coverages_Property,
							strSummary_label_TotalLiabilityPrem,strSummary_label_TotalLiabilityPrem_Actual, strSummary_Coverages_Liability,strSummary_Surcharge_Liability,
							strSummary_label_TotalEmploymentLiabPrem,strSummary_label_TotalEmploymentLiabPrem_Actual,strSummary_Coverages_EPLI,
							strSummary_label_TotalCyberPrem,strSummary_label_TotalCyberPrem_Actual,strSummary_Coverages_Cyber,
							strSummary_label_TotalCrimePrem,strSummary_label_TotalCrimePrem_Actual,strSummary_Coverages_Crime,
							strSummary_label_TotalInlandPrem,strSummary_label_TotalInlandPrem_Actual,strSummary_Coverages_Inland,test, file,  workbook);
				}
		}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				if(transaction.equalsIgnoreCase("PolicyIssuanceOnAP")){
					se.verify().verifyAsPassOrWarninig("CP_Summary_Details  of AgencyPortal ", false,true, true,test);
				}else{
					se.verify().verifyEquals("Failed to fill in details for CP_Summary_Details ", false, true, true, test);
					
				}
			}
			iteration++;
		}
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}
public void premiumverification(String message,String quote,String strLOB,String strRegressionID,String strRegressionName, String transaction,int intStartRow, String strSummary_TXT_TotalTransactionPremiumPW, String strSummary_TXT_TotalEstimatedPremium,
		String strSummary_label_TotalPropertyPrem,String strSummary_label_TotalPropertyPrem_Actual,String strSummary_Coverages_Property,
		String strSummary_label_TotalLiabilityPrem,String strSummary_label_TotalLiabilityPrem_Actual,String strSummary_Coverages_Liability,String strSummary_Surcharge_Liability,
		String strSummary_label_TotalEmploymentLiabPrem,String strSummary_label_TotalEmploymentLiabPrem_Actual,String strSummary_Coverages_EPLI,
		String strSummary_label_TotalCyberPrem,String strSummary_label_TotalCyberPrem_Actual,String strSummary_Coverages_Cyber,
		String strSummary_label_TotalCrimePrem,String strSummary_label_TotalCrimePrem_Actual,String strSummary_Coverages_Crime,
		String strSummary_label_TotalInlandPrem,String strSummary_label_TotalInlandPrem_Actual,String strSummary_Coverages_Inland,ExtentTest test,File file, XSSFWorkbook workbook){
	try{
		
	List<String> PremiumNames = new ArrayList<>();
	
	List<String> Expected = new ArrayList<>();
	List<String> Actuals = new ArrayList<>();
	List<String> Status = new ArrayList<>();
	
	if(!(transaction.equalsIgnoreCase("BookPolicyInPW")||transaction.equalsIgnoreCase("VerifyPolicyInPW"))) {	
	PremiumNames.add("TotalEstimatedPremium");
	PremiumNames.add("TotalPropertyPrem");
	PremiumNames.add("TotalLiabilityPrem");
	//PremiumNames.add("TotalLiabilitySurchargePrem");
	PremiumNames.add("TotalEmploymentLiabPrem");
	PremiumNames.add("TotalCyberPrem");
	PremiumNames.add("TotalCrimePrem");
	PremiumNames.add("TotalInlandPrem");

	
		String[] PropertyCoverages;
		String[] LiabilityCoverages;
		String[] EPLICoverages;
		String[] CyberCoverages;
		String[] CrimeCoverages;
		String[] InlandCoverages;
		
		
	if(se.element().isElementPresent(PremiumIndication_Warning)){
		se.verify().verifyEquals(message,se.element().isElementPresent(PremiumIndication_Warning),false, true,test);
		
	}else if(se.element().isElementPresent(Summary_Warning)){
		se.verify().verifyEquals(message,se.element().isElementPresent(Summary_Warning),false, true,test);
		
	}else{
			se.verify().verifyAsPassOrWarninig("TotalEstimatedPremium on Summary screen",getSummary_label_TotalEstPrem(strSummary_TXT_TotalEstimatedPremium).getText(),strSummary_TXT_TotalEstimatedPremium,true,test);
			Expected.add(0, strSummary_TXT_TotalEstimatedPremium.trim());
			Actuals.add(0, getSummary_label_TotalEstPrem(strSummary_TXT_TotalEstimatedPremium).getText().trim());
			if (strSummary_TXT_TotalEstimatedPremium.trim()
					.equals(getSummary_label_TotalEstPrem(strSummary_TXT_TotalEstimatedPremium).getText().trim())) {
				Status.add(0, constants.Pass);
			} else {
				Status.add(0, constants.Fail);
			}
			if(!strSummary_label_TotalPropertyPrem.equalsIgnoreCase("N/A")){
				strSummary_label_TotalPropertyPrem_Actual =getSummary_label_TotalPropertyPrem(strSummary_label_TotalPropertyPrem).getText();
				se.verify().verifyAsPassOrWarninig("TotalPropertyPremium on Summary screen",strSummary_label_TotalPropertyPrem_Actual.split(":")[1].trim(),strSummary_label_TotalPropertyPrem, true,test);
				if(!strSummary_Coverages_Property.equalsIgnoreCase(constants.NA)) {
					PropertyCoverages = strSummary_Coverages_Property.split(",");
				
				se.element().Click(getSummary_LNK_propcSectionIcon("strSummary_label_TotalPropertyPrem"), test);	
				se.verify().verifyAsPassOrWarninig("TotalProperty coverages on Summary screen",getSummary_Coverages_Property(strSummary_label_TotalPropertyPrem).size(),PropertyCoverages.length, true,test);
				if(PropertyCoverages.length==getSummary_Coverages_Property(strSummary_label_TotalPropertyPrem).size()) {
					int i=0;
					for(String PropCoverageExpected:PropertyCoverages) {
						
						String Summary_Coverages_Property_Actual;
						if(i<=getSummary_Coverages_Property(strSummary_label_TotalPropertyPrem).size()) {
							Summary_Coverages_Property_Actual = getSummary_Coverages_Property(strSummary_label_TotalPropertyPrem).get(i).getText();
							se.verify().verifyAsPassOrWarninig("Property coverages on Summary screen - ",Summary_Coverages_Property_Actual,PropCoverageExpected, true,test);
							
						}
						i++;
					}
				}
			}
				Expected.add(1, strSummary_label_TotalPropertyPrem.trim());
				Actuals.add(1, strSummary_label_TotalPropertyPrem_Actual.split(":")[1].trim());
				if (strSummary_label_TotalPropertyPrem.trim()
						.equals(strSummary_label_TotalPropertyPrem_Actual.split(":")[1].trim())) {
					Status.add(1, constants.Pass);
				} else {
					Status.add(1, constants.Fail);
				}
				
			}else {
				Expected.add(1, strSummary_label_TotalPropertyPrem.trim());
				Actuals.add(1,constants.NA);
				Status.add(1, constants.NA);
			}
				if(!strSummary_label_TotalLiabilityPrem.equalsIgnoreCase("N/A")){
					strSummary_label_TotalLiabilityPrem_Actual =getSummary_label_TotalLiabilityPrem(strSummary_label_TotalLiabilityPrem).getText();
					se.verify().verifyAsPassOrWarninig("TotalLiabilityPremium on Summary screen",strSummary_label_TotalLiabilityPrem_Actual.split(":")[1].trim(),strSummary_label_TotalLiabilityPrem, true,test);
					if(!strSummary_Surcharge_Liability.equalsIgnoreCase(constants.NA)) {
						se.element().Click(getSummary_LNK_LiabilitySectionIcon("strSummary_label_TotalLiabilityPrem"), test);
						String strSummary_Surcharge_Liability_Actual =getSummary_Surcharge_Liability(strSummary_Surcharge_Liability).getText();
						se.verify().verifyAsPassOrWarninig("LiabilitySurchargePremium on Summary screen",strSummary_Surcharge_Liability_Actual.split(":")[1].trim(),strSummary_Surcharge_Liability, true,test);
						
					}
					if(!strSummary_Coverages_Liability.equalsIgnoreCase(constants.NA)) {
					LiabilityCoverages = strSummary_Coverages_Liability.split(",");
					if(strSummary_Surcharge_Liability.equalsIgnoreCase(constants.NA)) {
					se.element().Click(getSummary_LNK_LiabilitySectionIcon("strSummary_label_TotalLiabilityPrem"), test);	
					}
					se.verify().verifyAsPassOrWarninig("TotalLiability coverages on Summary screen",getSummary_Coverages_Liability(strSummary_label_TotalLiabilityPrem).size(),LiabilityCoverages.length, true,test);
					if(LiabilityCoverages.length==getSummary_Coverages_Liability(strSummary_label_TotalLiabilityPrem).size()) {
						int i=0;
						for(String LiabilityCoverageExpected:LiabilityCoverages) {
							
							String Summary_Coverages_Liability_Actual;
							if(i<=getSummary_Coverages_Liability(strSummary_label_TotalLiabilityPrem).size()) {
								Summary_Coverages_Liability_Actual = getSummary_Coverages_Liability(strSummary_label_TotalPropertyPrem).get(i).getText();
								se.verify().verifyAsPassOrWarninig("Liability coverages on Summary screen - ",Summary_Coverages_Liability_Actual,LiabilityCoverageExpected, true,test);
								
							}
							i++;
						}
					}
					}
					Expected.add(2, strSummary_label_TotalLiabilityPrem.trim());
					Actuals.add(2, strSummary_label_TotalLiabilityPrem_Actual.split(":")[1].trim());
					if (strSummary_label_TotalLiabilityPrem.trim()
							.equals(strSummary_label_TotalLiabilityPrem_Actual.split(":")[1].trim())) {
						Status.add(2, constants.Pass);
					} else {
						Status.add(2, constants.Fail);
					}
				}else {
					Expected.add(2, strSummary_label_TotalLiabilityPrem.trim());
					Actuals.add(2,constants.NA);
					Status.add(2, constants.NA);
				}
				if(!strSummary_label_TotalEmploymentLiabPrem.equalsIgnoreCase("N/A")){
					strSummary_label_TotalEmploymentLiabPrem_Actual =getSummary_label_TotalEmploymentLiabPrem(strSummary_label_TotalEmploymentLiabPrem).getText();
					se.verify().verifyAsPassOrWarninig("TotalEmploymentLiabPremium on Summary screen",strSummary_label_TotalEmploymentLiabPrem_Actual.split(":")[1].trim(),strSummary_label_TotalEmploymentLiabPrem, true,test);
					if(!strSummary_Coverages_EPLI.equalsIgnoreCase(constants.NA)) {
					EPLICoverages = strSummary_Coverages_EPLI.split(",");
					se.element().Click(getSummary_LNK_EPLISectionIcon("strSummary_label_TotalEPLIPrem"), test);	
					se.verify().verifyAsPassOrWarninig("TotalEPLI coverages on Summary screen",getSummary_Coverages_EPLI(strSummary_label_TotalEmploymentLiabPrem).size(),EPLICoverages.length, true,test);
					if(EPLICoverages.length==getSummary_Coverages_EPLI(strSummary_label_TotalEmploymentLiabPrem).size()) {
						int i=0;
						for(String EPLICoverageExpected:EPLICoverages) {
							
							String Summary_Coverages_EPLI_Actual;
							if(i<=getSummary_Coverages_EPLI(strSummary_label_TotalEmploymentLiabPrem).size()) {
								Summary_Coverages_EPLI_Actual = getSummary_Coverages_EPLI(strSummary_label_TotalEmploymentLiabPrem).get(i).getText();
								se.verify().verifyAsPassOrWarninig("EPLI coverages on Summary screen - ",Summary_Coverages_EPLI_Actual,EPLICoverageExpected, true,test);
								
							}
							i++;
						}
					}
					}
					Expected.add(3, strSummary_label_TotalEmploymentLiabPrem.trim());
					Actuals.add(3, strSummary_label_TotalEmploymentLiabPrem_Actual.split(":")[1].trim());
					if (strSummary_label_TotalEmploymentLiabPrem.trim()
							.equals(strSummary_label_TotalEmploymentLiabPrem_Actual.split(":")[1].trim())) {
						Status.add(3, constants.Pass);
					} else {
						Status.add(3, constants.Fail);
					}
				}else {
					Expected.add(3, strSummary_label_TotalEmploymentLiabPrem.trim());
					Actuals.add(3,constants.NA);
					Status.add(3, constants.NA);
				}
				if(!strSummary_label_TotalCyberPrem.equalsIgnoreCase("N/A")){
					strSummary_label_TotalCyberPrem_Actual =getSummary_label_TotalCyberPrem(strSummary_label_TotalCyberPrem).getText();
					se.verify().verifyAsPassOrWarninig("TotalCyberPremium on Summary screen",strSummary_label_TotalCyberPrem_Actual.split(":")[1].trim(),strSummary_label_TotalCyberPrem, true,test);
					if(!strSummary_Coverages_Cyber.equalsIgnoreCase(constants.NA)) {
					CyberCoverages = strSummary_Coverages_Cyber.split(",");
					se.element().Click(getSummary_LNK_CyberSectionIcon("strSummary_label_TotalCyberPrem"), test);	
					se.verify().verifyAsPassOrWarninig("TotalCyber coverages on Summary screen",getSummary_Coverages_Cyber(strSummary_label_TotalCyberPrem).size(),CyberCoverages.length, true,test);
					if(CyberCoverages.length==getSummary_Coverages_Cyber(strSummary_label_TotalCyberPrem).size()) {
						int i=0;
						for(String CyberCoverageExpected:CyberCoverages) {
							
							String Summary_Coverages_Cyber_Actual;
							if(i<=getSummary_Coverages_Cyber(strSummary_label_TotalCyberPrem).size()) {
								Summary_Coverages_Cyber_Actual = getSummary_Coverages_Cyber(strSummary_label_TotalCyberPrem).get(i).getText();
								se.verify().verifyAsPassOrWarninig("Cyber coverages on Summary screen - ",Summary_Coverages_Cyber_Actual,CyberCoverageExpected, true,test);
								
							}
							i++;
						}
					}	
					}
					Expected.add(4, strSummary_label_TotalCyberPrem.trim());
					Actuals.add(4, strSummary_label_TotalCyberPrem_Actual.split(":")[1].trim());
					if (strSummary_label_TotalCyberPrem.trim()
							.equals(strSummary_label_TotalCyberPrem_Actual.split(":")[1].trim())) {
						Status.add(4, constants.Pass);
					} else {
						Status.add(4, constants.Fail);
					}
				}else {
					Expected.add(4, strSummary_label_TotalCyberPrem.trim());
					Actuals.add(4,constants.NA);
					Status.add(4, constants.NA);
				}
				if(!strSummary_label_TotalCrimePrem.equalsIgnoreCase("N/A")){
					strSummary_label_TotalCrimePrem_Actual =getSummary_label_TotalCrimePrem(strSummary_label_TotalCrimePrem).getText();
					se.verify().verifyAsPassOrWarninig("TotalCrimePremium on Summary screen",strSummary_label_TotalCrimePrem_Actual.split(":")[1].trim(),strSummary_label_TotalCrimePrem, true,test);
					if(!strSummary_Coverages_Crime.equalsIgnoreCase(constants.NA)) {
					CrimeCoverages = strSummary_Coverages_Crime.split(",");
					se.element().Click(getSummary_LNK_CrimeSectionIcon("strSummary_label_TotalCrimePrem"), test);	
					se.verify().verifyAsPassOrWarninig("TotalCrime coverages on Summary screen",getSummary_Coverages_Crime(strSummary_label_TotalCrimePrem).size(),CrimeCoverages.length, true,test);
					if(CrimeCoverages.length==getSummary_Coverages_Crime(strSummary_label_TotalCrimePrem).size()) {
						int i=0;
						for(String CrimeCoverageExpected:CrimeCoverages) {
							
							String Summary_Coverages_Crime_Actual;
							if(i<=getSummary_Coverages_Crime(strSummary_label_TotalCrimePrem).size()) {
								Summary_Coverages_Crime_Actual = getSummary_Coverages_Crime(strSummary_label_TotalCrimePrem).get(i).getText();
								se.verify().verifyAsPassOrWarninig("Crime coverages on Summary screen - ",Summary_Coverages_Crime_Actual,CrimeCoverageExpected, true,test);
								
							}
							i++;
						}
					}
					}
					Expected.add(5, strSummary_label_TotalCrimePrem.trim());
					Actuals.add(5, strSummary_label_TotalCrimePrem_Actual.split(":")[1].trim());
					if (strSummary_label_TotalCrimePrem.trim()
							.equals(strSummary_label_TotalCrimePrem_Actual.split(":")[1].trim())) {
						Status.add(5, constants.Pass);
					} else {
						Status.add(5, constants.Fail);
					}
				}else {
					Expected.add(5, strSummary_label_TotalCrimePrem.trim());
					Actuals.add(5,constants.NA);
					Status.add(5, constants.NA);
				}
				if(!strSummary_label_TotalInlandPrem.equalsIgnoreCase("N/A")){
					strSummary_label_TotalInlandPrem_Actual =getSummary_label_TotalInlandPrem(strSummary_label_TotalInlandPrem).getText();
					se.verify().verifyAsPassOrWarninig("TotalInlandPremium on Summary screen",strSummary_label_TotalInlandPrem_Actual.split(":")[1].trim(),strSummary_label_TotalInlandPrem, true,test);
					if(!strSummary_Coverages_Inland.equalsIgnoreCase(constants.NA)) {
					InlandCoverages = strSummary_Coverages_Inland.split(",");
					se.element().Click(getSummary_LNK_InlandSectionIcon("strSummary_label_TotalInlandPrem"), test);	
					se.verify().verifyAsPassOrWarninig("TotalInland coverages on Summary screen",getSummary_Coverages_Inland(strSummary_label_TotalInlandPrem).size(),InlandCoverages.length, true,test);
					if(InlandCoverages.length==getSummary_Coverages_Inland(strSummary_label_TotalInlandPrem).size()) {
						int i=0;
						for(String InlandCoverageExpected:InlandCoverages) {
							
							String Summary_Coverages_Inland_Actual;
							if(i<=getSummary_Coverages_Inland(strSummary_label_TotalInlandPrem).size()) {
								Summary_Coverages_Inland_Actual = getSummary_Coverages_Inland(strSummary_label_TotalInlandPrem).get(i).getText();
								se.verify().verifyAsPassOrWarninig("Inland coverages on Summary screen - ",Summary_Coverages_Inland_Actual,InlandCoverageExpected, true,test);
								
							}
							i++;
						}
					}
					}
					Expected.add(6, strSummary_label_TotalInlandPrem.trim());
					Actuals.add(6, strSummary_label_TotalInlandPrem_Actual.split(":")[1].trim());
					if (strSummary_label_TotalInlandPrem.trim()
							.equals(strSummary_label_TotalInlandPrem_Actual.split(":")[1].trim())) {
						Status.add(6, constants.Pass);
					} else {
						Status.add(6, constants.Fail);
					}
				}else {
					Expected.add(6, strSummary_label_TotalInlandPrem.trim());
					Actuals.add(6,constants.NA);
					Status.add(6, constants.NA);
				}
				
						
				updatePremiumsInXL(PremiumNames, Expected, Actuals, Status, strRegressionID,strRegressionName, quote, strLOB,transaction, intStartRow,
						 file,  workbook,  test);
	}
	}
		else {
			if(strRegressionID.contains("CA")) {
				se.verify().verifyAsPassOrWarninig("TotalTransactionPremium on Summary screen",getPremiumSummary_PremInfo_TotalTransactionPremium_CA().getText().trim(),strSummary_TXT_TotalTransactionPremiumPW,true,test);
				PremiumNames.add(0, "TotalTransactionPremium");
				Expected.add(0, strSummary_TXT_TotalTransactionPremiumPW.trim());
				Actuals.add(0, getPremiumSummary_PremInfo_TotalTransactionPremium().getText().trim());
				if (strSummary_TXT_TotalTransactionPremiumPW.trim()
						.equals(getPremiumSummary_PremInfo_TotalTransactionPremium().getText().trim())) {
					Status.add(0, constants.Pass);
				} else {
					Status.add(0, constants.Fail);
				}
			} else if(strRegressionID.contains("WC")) {
				se.verify().verifyAsPassOrWarninig("TotalTransactionPremium on Summary screen",getWCPremiumSummary_GeneralInfo_TotalEstimatedTransactionPremium().getText().trim(),strSummary_TXT_TotalTransactionPremiumPW,true,test);
				PremiumNames.add(0, "TotalTransactionPremium");
				Expected.add(0, strSummary_TXT_TotalTransactionPremiumPW.trim());
				Actuals.add(0, getWCPremiumSummary_GeneralInfo_TotalEstimatedTransactionPremium().getText().trim());
				if (strSummary_TXT_TotalTransactionPremiumPW.trim()
						.equals(getWCPremiumSummary_GeneralInfo_TotalEstimatedTransactionPremium().getText().trim())) {
					Status.add(0, constants.Pass);
				} else {
					Status.add(0, constants.Fail);
				}
			}else if(strRegressionID.contains("CU_")){
			se.verify().verifyAsPassOrWarninig("TotalTransactionPremium on Summary screen",getPremiumSummary_PremInfo_TransactionPremium().getText().trim(),strSummary_TXT_TotalTransactionPremiumPW,true,test);
			PremiumNames.add(0, "TotalTransactionPremium");
			Expected.add(0, strSummary_TXT_TotalTransactionPremiumPW.trim());
			Actuals.add(0, getPremiumSummary_PremInfo_TransactionPremium().getText().trim());
			if (strSummary_TXT_TotalTransactionPremiumPW.trim()
					.equals(getPremiumSummary_PremInfo_TransactionPremium().getText().trim())) {
				Status.add(0, constants.Pass);
			} else {
				Status.add(0, constants.Fail);
			}
			}else {
				se.verify().verifyAsPassOrWarninig("TotalTransactionPremium on Summary screen",getPremiumSummary_PremInfo_TransactionPremium().getText().trim(),strSummary_TXT_TotalTransactionPremiumPW,true,test);
				PremiumNames.add(0, "TotalTransactionPremium");
				Expected.add(0, strSummary_TXT_TotalTransactionPremiumPW.trim());
				Actuals.add(0, getPremiumSummary_PremInfo_TransactionPremium().getText().trim());
				if (strSummary_TXT_TotalTransactionPremiumPW.trim()
						.equals(getPremiumSummary_PremInfo_TransactionPremium().getText().trim())) {
					Status.add(0, constants.Pass);
				} else {
					Status.add(0, constants.Fail);
				}
			}
			driver.switchTo().defaultContent();
			updatePremiumsInXL(PremiumNames, Expected, Actuals, Status, strRegressionID,strRegressionName, quote, strLOB,transaction, intStartRow,
					 file,  workbook,  test);
			
		}
		
		}catch(Exception e){
		test.log(LogStatus.FAIL, "Exception in  Premium verification- ", e.toString());
		
	}
}
	public void CP_Internal_QuoteOpen(String strRegressionID, String transaction, String strAgentLink, String strLOB,String strRelease_SelectRelease,String strRole_SelectRoleAs,String Quote,String strSummary_INT_LBL_HeaderStatus,String strSecura_TXT_Email, String strSecura_TXT_Password,  ExtentTest test) throws IOException
	{
		AP_Login  LoginPage = TestPageFactory.initElements(se, AP_Login.class);
		String UM="Umbrella";
		String WC="Workers Comp";
		String UW="Underwriters";
		String UWA="UnderwriterAssistants";
		String CSS="CSS";
		String SLM="MarketManagers";
		se.util().sleep(4000);
		if(strAgentLink.contains("Yes")) {
			LoginPage.APLogoutDetails("Yes",test);
			se.browser().deleteCookies();
			/*se.browser().get(SystemPropertyUtil.getLocale());
			se.element().selectradiovalue(role_rdo_releaseselect, strRole_SelectRoleAs);
			se.element().selectradiovalue(role_rdo_roleselect, strRelease_SelectRelease);  
			se.verify().verifyEquals("All four roles are displayed", getRoleSubmit().isDisplayed(), true, true,test); 
			//se.util().sleep(1000);
			se.element().Click(getRoleSubmit());*/
			if(strRole_SelectRoleAs.equalsIgnoreCase(UW))
				
			{
				/*if (constants.Env.equals("stage") ) {
					se.browser().get(SystemPropertyUtil.getPopupUrl(),test);
					test.log(LogStatus.INFO, "Access Agency Port Application", "<br> URL : "+SystemPropertyUtil.getPopupUrl());
						
				}
				else*/ {
				InternalLogin(strSecura_TXT_Email, strSecura_TXT_Password, test);
				//se.browser().get(SystemPropertyUtil.getPopupUrl(),test);
				test.log(LogStatus.INFO, "Access Agency Port Application", "<br> URL : "+SystemPropertyUtil.getPopupUrl());
				}
			}
			/*else if(strRole_SelectRoleAs.equalsIgnoreCase(UWA))
			{
				se.browser().get(SystemPropertyUtil.getPopupUrl(),test);
				test.log(LogStatus.INFO, "Access Agency Port Application", "<br> URL : "+SystemPropertyUtil.getPopupUrl());
				
			}*/
			else if(strRole_SelectRoleAs.equalsIgnoreCase(CSS))
			{
				se.browser().get(SystemPropertyUtil.getCSSUrl(),test);
				test.log(LogStatus.INFO, "Access Agency Port Application", "<br> URL : "+SystemPropertyUtil.getCSSUrl());
				
			}
			/*else if(strRole_SelectRoleAs.equalsIgnoreCase(SLM))
			{
				se.browser().get(SystemPropertyUtil.getSLMUrl(),test);
				test.log(LogStatus.INFO, "Access Agency Port Application", "<br> URL : "+SystemPropertyUtil.getSLMUrl());
				se.browser().get(SystemPropertyUtil.getPopupUrl(),test);
				
			}*/
			
		}

		if(strSummary_INT_LBL_HeaderStatus.equals("Referred to UW") && (strRegressionID.equalsIgnoreCase("TC_11") || strRegressionID.equalsIgnoreCase("BP_11")||strRegressionID.equalsIgnoreCase("CUCA_06")||strRegressionID.equalsIgnoreCase("CUWC_07")||strRegressionID.equalsIgnoreCase("CU_07"))) {
			/*String url =SystemPropertyUtil.getLocale();
			se.util().sleep(2000);
			se.browser().get(url,test);
			se.driver().get(url);
			se.element().selectradiovalue(role_rdo_releaseselect, strRole_SelectRoleAs);
			se.element().selectradiovalue(role_rdo_roleselect, strRelease_SelectRelease);  
			se.verify().verifyEquals("All four roles are displayed", getRoleSubmit().isDisplayed(), true, true,test); 
			//se.util().sleep(1000);
			se.element().Click(getRoleSubmit(), test);*/
			
			
		
			if(strRole_SelectRoleAs.equalsIgnoreCase(UW))
			
			{
		
				/*if (constants.Env.equals("stage") ) {
					se.browser().navigateurl(SystemPropertyUtil.getPopupUrl(),test);
					se.browser().deleteCookies();
					se.browser().navigateurl(SystemPropertyUtil.getPopupUrl(),test);
					test.log(LogStatus.INFO, "Access Agency Port Application", "<br> URL : "+SystemPropertyUtil.getPopupUrl());
					
				
					}
				
					
				else*/ {	
				InternalLogin(strSecura_TXT_Email, strSecura_TXT_Password, test);
				/*se.browser().navigateurl(SystemPropertyUtil.getPopupUrl(),test);
				se.browser().deleteCookies();
				se.browser().navigateurl(SystemPropertyUtil.getPopupUrl(),test);
				*/test.log(LogStatus.INFO, "Access Agency Port Application", "<br> URL : "+SystemPropertyUtil.getPopupUrl());
				}	
			}
			/*else if(strRole_SelectRoleAs.equalsIgnoreCase(UWA))
			{
				se.browser().get(SystemPropertyUtil.getPopupUrl(),test);
				test.log(LogStatus.INFO, "Access Agency Port Application", "<br> URL : "+SystemPropertyUtil.getPopupUrl());
				
			}*/
			else if(strRole_SelectRoleAs.equalsIgnoreCase(CSS))
			{
				se.browser().get(SystemPropertyUtil.getCSSUrl(),test);
				se.element().Click(getMyWork(), test);
				se.browser().deleteCookies();
				
				test.log(LogStatus.INFO, "Access Agency Port Application", "<br> URL : "+SystemPropertyUtil.getCSSUrl());
				se.browser().navigateurl(SystemPropertyUtil.getPopupUrl(),test);
				
				
			}
			
			/*else if(strRole_SelectRoleAs.equalsIgnoreCase(SLM))
			{
				se.element().Click(getMyWork(), test);
				se.browser().deleteCookies();
				se.browser().get(SystemPropertyUtil.getCSSUrl(),test);
				test.log(LogStatus.INFO, "Access Agency Port Application", "<br> URL : "+SystemPropertyUtil.getCSSUrl());
				se.browser().get(SystemPropertyUtil.getPopupUrl(),test);
				
			}*/
			
		}

		se.element().Click(getMyWork(), test);
		se.element().Click(getClearAll(), test);

		try {
			se.element().Click(getclick_view(), test);
			se.element().Click(getdropdown_MoreOptions(), test);
			se.element().enterText(gettxt_quoteOrPolicyNumber(),Quote); 
			se.element().Click(getcommon_searchBtn(), test);
			se.util().sleep(5000);
			se.element().Click(getCardHeader(), test);
			se.util().sleep(2000);
			se.element().Click(getBtneventWorkItemAction_Open(), test);
		}
		catch (StaleElementReferenceException e)
		{
			se.element().Click(getclick_view(), test);
			se.element().Click(getdropdown_MoreOptions(), test);
			se.element().enterText(gettxt_quoteOrPolicyNumber(),Quote); 
			se.element().Click(getcommon_searchBtn(), test);
			se.util().sleep(5000);
			se.element().Click(getCardHeader(), test);
			se.util().sleep(2000);
			se.element().Click(getBtneventWorkItemAction_Open(), test);
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
	public void CP_External_QuoteOpen(String strRegressionID, String transaction, String strAgentLink, String strLOB,String strRelease_SelectRelease,String strRole_SelectRoleAs,String Quote,ExtentTest test) throws IOException
	{

		
		AP_Login  LoginPage = TestPageFactory.initElements(se, AP_Login.class);
		APPW_CommonMethods APPW_CommonMethods=TestPageFactory.initElements(se, APPW_CommonMethods.class); 
		//LoginPage.APLogoutDetails(strRegressionID,transaction, test,"No");
		LoginPage.APAppLogin(strRegressionID,   transaction,"No", test);
		
		se.element().Click(getMyWork(), test);
		
		se.element().Click(getClearAll(), test);
		//se.element().Click(getCAFullApplication());
		//Calling Hide method
		//APPW_CommonMethods.hide_acordXml();
		//se.element().Click(getMyWork());
		try {
			se.util().sleep(3000);
			se.element().Click(getclick_view(), test);
			se.element().Click(getdropdown_MoreOptions(), test);
			se.element().enterText(gettxt_quoteOrPolicyNumber(),Quote); 
			se.element().Click(getcommon_searchBtn(), test);
			se.util().sleep(3000);
			if(!strLOB.equalsIgnoreCase("N/A")){
				se.element().Click(getopenQuotebasedonLOB(strLOB), test);
			}else{
				se.element().Click(getCardHeader(), test);
			}
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
			se.element().enterText(gettxt_quoteOrPolicyNumber(),Quote); 
			se.element().Click(getcommon_searchBtn(), test);
			se.util().sleep(3000);
			if(!strLOB.equalsIgnoreCase("N/A")){
				se.element().Click(getopenQuotebasedonLOB(strLOB), test);
			}else{
				se.element().Click(getCardHeader(), test);
			}
			se.util().sleep(3000);
			se.element().Click(getBtneventWorkItemAction_Open(), test);
		}
	}
	
	public void updatePremiumsInXL(List<String> PremiumNames,List<String> Expected,List<String> Actuals,List<String> Status,String strRegressionID,String strRegressionName,String strquoteNumber,String LOB,String transaction,int startRowNumber,
			File file, XSSFWorkbook workbook, ExtentTest test) throws IOException {

		try {

			XlsData xl = new XlsData();
			LinkedHashMap<String, String> hmap = new LinkedHashMap<String, String>();
					

			XSSFSheet Sheet = null;
			LOB = strRegressionID.substring(0, 2);
			if (!xl.isSheetExist(workbook, strRegressionName)) {
				Sheet = xl.Createsheet(workbook, strRegressionName);
			} else {
				
				Sheet = workbook.getSheet(strRegressionName);
			}

			for (int i = 0; i <= 6; i++) {

				/* Adding elements to HashMap */
				hmap.put("LOB", LOB);
				hmap.put("RegressionID", strRegressionID);
				hmap.put("RegressionName", strRegressionName);
				hmap.put("QuoteNumber", strquoteNumber);
				hmap.put("TransactionName", transaction);
				hmap.put("PremiumName", PremiumNames.get(i));
				hmap.put("Expected", Expected.get(i));
				hmap.put("Actual", Actuals.get(i));
				hmap.put("Status", Status.get(i));
				System.out.println("hmap - " + hmap);
				if (!file.exists()) {
					if (startRowNumber  == 0) {
						if(i==0){
							xl.SetCellData(hmap, startRowNumber+1 + i, Sheet, workbook);
						}else{
							xl.SetCellData(hmap,  i+1, Sheet, workbook);
						}
					}else{
						if(i==0){
							xl.SetCellData(hmap, startRowNumber+i, Sheet, workbook);
						}else{
							xl.SetCellData(hmap,  i+1, Sheet, workbook);
						}
					}
				} else {
					

					if (startRowNumber  == 0) {
						if(i==0){
							
							xl.SetCellDataInExistingWorkbook(hmap, startRowNumber+1 + i,startRowNumber, Sheet, strRegressionName, workbook, file,
									xl);
						}else{
							
							xl.SetCellDataInExistingWorkbook(hmap, i+1,startRowNumber, Sheet, strRegressionName, workbook, file,
									xl);
						}
					}else{
						if(i==0){
							
							xl.SetCellDataInExistingWorkbook(hmap, startRowNumber + i,startRowNumber, Sheet, strRegressionName, workbook, file,
									xl);
						}else{
							
							xl.SetCellDataInExistingWorkbook(hmap, i+1,startRowNumber, Sheet, strRegressionName, workbook, file,
									xl);
						}
					}
				
					
					}
if(transaction.equalsIgnoreCase("BookPolicyInPW")||transaction.equalsIgnoreCase("VerifyPolicyInPW")) {
	break;
}
			}
			if (!file.exists()) {
				if (startRowNumber  == 0) {
					xl.SetCellData(hmap, startRowNumber , Sheet, workbook);
				}
			} else {
				if (startRowNumber  == 0) {
					xl.SetCellDataInExistingWorkbook(hmap, startRowNumber,startRowNumber, Sheet, strRegressionName, workbook, file,
							xl);
				}
			}

			if (!file.exists()) {
				xl.createxlsFile(workbook, file);

			}
			driver.switchTo().defaultContent();
		} catch (Exception e) {

			se.verify().verifyEquals("Failed in updatePremiumsInXL method", true, false, true, test);
			se.log().logTestStep("Exception in updatePremiumsInXL method\n  - " + e);

		}

	}
}

