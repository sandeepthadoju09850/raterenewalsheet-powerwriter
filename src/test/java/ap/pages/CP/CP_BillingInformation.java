package ap.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.ap.automation.common.ExcelOperations;
import Libraries.ap.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.OR_CP;

public class CP_BillingInformation extends OR_CP {
	public void CP_BillingInformation_Details(String strRegressionID, String transaction, String suspendSheet, ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.BillingSupportPoliciesandcontac)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.BillingSupportPoliciesandcontac, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strBilling_DDV_BillingMethod = (String) row.get("Billing_DDV_BillingMethod");
			String strBilling_DDV_BillingPlan = (String) row.get("Billing_DDV_BillingPlan");
			String strBilling_TXT_BillingAccountNumber = (String) row.get("Billing_TXT_BillingAccountNumber");
			String strBilling_CHK_WorkersCompensation = (String) row.get("Billing_CHK_WorkersCompensation");
			String strBilling_CHK_CommericalAuto = (String) row.get("Billing_CHK_CommericalAuto");
			String strBilling_CHK_Umbrella = (String) row.get("Billing_CHK_Umbrella");
			String strBilling_CHK_ByClickingHereIAcknowledge = (String) row.get("Billing_CHK_ByClickingHereIAcknowledge");
			String strBilling_TXT_Accounting_Name = (String) row.get("Billing_TXT_Accounting_Name");
			String strBilling_TXT_Accounting_OfficePhone = (String) row.get("Billing_TXT_Accounting_OfficePhone");
			String strBilling_TXT_Accounting_MobilePhone = (String) row.get("Billing_TXT_Accounting_MobilePhone");
			String strBilling_TXT_Accounting_BusinessEmailAddress = (String) row.get("Billing_TXT_Accounting_BusinessEmailAddress");
			String strBilling_TXT_Inspection_Name = (String) row.get("Billing_TXT_Inspection_Name");
			String strBilling_TXT_Inspection_OfficePhone = (String) row.get("Billing_TXT_Inspection_OfficePhone");
			String strBilling_TXT_Inspection_MobilePhone = (String) row.get("Billing_TXT_Inspection_MobilePhone");
			String strBilling_TXT_Inspection_BusinessEmailAddress = (String) row.get("Billing_TXT_Inspection_BusinessEmailAddress");
			String strBilling_TXT_Claims_Name = (String) row.get("Billing_TXT_Claims_Name");
			String strBilling_TXT_Claims_OfficePhone = (String) row.get("Billing_TXT_Claims_OfficePhone");
			String strBilling_TXT_Claims_MobilePhone = (String) row.get("Billing_TXT_Claims_MobilePhone");
			String strBilling_TXT_Claims_BusinessEmailAddress = (String) row.get("Billing_TXT_Claims_BusinessEmailAddress");
			try {
				se.log().logTestStep("CP_BillingInformation_Details");
				test.log(LogStatus.INFO, "CP_BillingInformation_Details","Transaction Step : "+transaction + "<br>" +"Page : CP_BillingInformation_Details");
				se.verify().verifyEquals("CP_BillingInformation_Details  of AgencyPortal ", getBillingSummary_label().isDisplayed(),true, true,test);
				se.element().SelectElement(Billing_DDV_BillingMethod, strBilling_DDV_BillingMethod,test);
			//	se.element().SelectElement(Billing_DDV_BillingPlan, strBilling_DDV_BillingPlan,test);
				se.element().enterOrValidateText( getBilling_TXT_BillingAccountNumber(strBilling_TXT_BillingAccountNumber),strBilling_TXT_BillingAccountNumber,test);
				se.element().checkUncheckOrValidate( getBilling_CHK_WorkersCompensation(strBilling_CHK_WorkersCompensation),strBilling_CHK_WorkersCompensation,test);
				se.element().checkUncheckOrValidate( getBilling_CHK_CommericalAuto(strBilling_CHK_CommericalAuto),strBilling_CHK_CommericalAuto,test);
				se.element().checkUncheckOrValidate( getBilling_CHK_Umbrella(strBilling_CHK_Umbrella),strBilling_CHK_Umbrella,test);
				se.element().checkUncheckOrValidate( getBilling_CHK_ByClickingHereIAcknowledge(strBilling_CHK_ByClickingHereIAcknowledge),strBilling_CHK_ByClickingHereIAcknowledge,test);
				se.element().enterOrValidateText( getBilling_TXT_Accounting_Name(strBilling_TXT_Accounting_Name),strBilling_TXT_Accounting_Name,test);
				se.element().enterOrValidateText( getBilling_TXT_Accounting_OfficePhone(strBilling_TXT_Accounting_OfficePhone),strBilling_TXT_Accounting_OfficePhone,test);
				se.element().enterOrValidateText( getBilling_TXT_Accounting_MobilePhone(strBilling_TXT_Accounting_MobilePhone),strBilling_TXT_Accounting_MobilePhone,test);
				se.element().enterOrValidateText( getBilling_TXT_Accounting_BusinessEmailAddress(strBilling_TXT_Accounting_BusinessEmailAddress),strBilling_TXT_Accounting_BusinessEmailAddress,test);
				se.element().enterOrValidateText( getBilling_TXT_Inspection_Name(strBilling_TXT_Inspection_Name),strBilling_TXT_Inspection_Name,test);
				se.element().enterOrValidateText( getBilling_TXT_Inspection_OfficePhone(strBilling_TXT_Inspection_OfficePhone),strBilling_TXT_Inspection_OfficePhone,test);
				se.element().enterOrValidateText( getBilling_TXT_Inspection_MobilePhone(strBilling_TXT_Inspection_MobilePhone),strBilling_TXT_Inspection_MobilePhone,test);
				se.element().enterOrValidateText( getBilling_TXT_Inspection_BusinessEmailAddress(strBilling_TXT_Inspection_BusinessEmailAddress),strBilling_TXT_Inspection_BusinessEmailAddress,test);
				se.element().enterOrValidateText( getBilling_TXT_Claims_Name(strBilling_TXT_Claims_Name),strBilling_TXT_Claims_Name,test);
				se.element().enterOrValidateText( getBilling_TXT_Claims_OfficePhone(strBilling_TXT_Claims_OfficePhone),strBilling_TXT_Claims_OfficePhone,test);
				se.element().enterOrValidateText( getBilling_TXT_Claims_MobilePhone(strBilling_TXT_Claims_MobilePhone),strBilling_TXT_Claims_MobilePhone,test);
				se.element().enterOrValidateText( getBilling_TXT_Claims_BusinessEmailAddress(strBilling_TXT_Claims_BusinessEmailAddress),strBilling_TXT_Claims_BusinessEmailAddress,test);
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for CP_BillingInformation_Details ", true, false, true, test);

			}
			iteration++;
		}
		executor.executeScript("arguments[0].scrollIntoView(0,2000);", getGI_CHK_Continue());
		se.element().Click(getGI_CHK_Continue(), test);
	}catch (Exception e) {
		
		se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
		test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
		testTearDown(se, test);
	}
	}
}
