package pw.pages.WC;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_WC;

public class WC_FinalAuditDetails extends OR_WC {
public void  FinalAuditDetails(String strRegressionID, String transaction, String suspendSheet, ExtentTest test) throws IOException {
		
		try{
			    if(suspendSheet.equalsIgnoreCase(constants.WC_FinalAuditDetails)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
			
			List<Map<String, String>> table = ExcelOperations.getPagesData(constants.WC_FinalAuditDetails, strRegressionID, transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);

				
				String strFinalAudit_CHK_DefineReportingPeriodsAutomatically = (String) row.get("FinalAudit_CHK_DefineReportingPeriodsAutomatically");
				String strFinalAudit_CHK_DefineReportingPeriodsManually = (String) row.get("FinalAudit_CHK_DefineReportingPeriodsManually");
				String strFinalAudit_CHK_Endorsement_transaction = (String) row.get("FinalAudit_CHK_Endorsement_transaction");
				String strFinalAudit_CHK_ReportingFreqwithinAuditPeriod = (String) row.get("FinalAudit_CHK_ReportingFreqwithinAuditPeriod");
				String strFinalAudit_TXT_Estimated_Audit = (String) row.get("FinalAudit_TXT_Estimated_Audit");
				String strFinalAudit_DDN_reporting_frequency = (String) row.get("FinalAudit_DDN_reporting_frequency");
				String strFinalAudit_ClassCode = (String) row.get("FinalAudit_ClassCode");
				String strFinalAudit_EstimatedExposure = (String) row.get("FinalAudit_EstimatedExposure");
				String strFinalAudit_AuditedExposure = (String) row.get("FinalAudit_AuditedExposure");
				String strFinalAudit_AuditRow = (String) row.get("FinalAudit_AuditRow");
				String strFinalAudit_Next = (String) row.get("FinalAudit_Next");
				String strFinalAudit_CHK_IfStatusApplyYes = (String) row.get("FinalAudit_CHK_IfStatusApplyYes");
				
				
			try
				{
					test.log(LogStatus.INFO, "WC_FinalAuditDetails","Transaction Step : "+ transaction + "<br>" +"Page : WC_Classifications");
					se.log().logSeStep("Selecting WC_FinalAuditDetails ");
					se.verify().verifyEquals("WC_FinalAuditDetails page of PowerWriter ", getAuditDetails_LBL_AuditDetails().isDisplayed(),true, true,test);
					
					se.element().checkUncheckOrValidate(getFinalAudit_CHK_DefineReportingPeriodsAutomatically(strFinalAudit_CHK_DefineReportingPeriodsAutomatically),strFinalAudit_CHK_DefineReportingPeriodsAutomatically,test);
					se.element().checkUncheckOrValidate(getFinalAudit_CHK_DefineReportingPeriodsManually(strFinalAudit_CHK_DefineReportingPeriodsManually),strFinalAudit_CHK_DefineReportingPeriodsManually,test);
					se.element().checkUncheckOrValidate(getFinalAudit_CHK_Endorsement_transaction(strFinalAudit_CHK_Endorsement_transaction),strFinalAudit_CHK_Endorsement_transaction,test);
					se.element().checkUncheckOrValidate(getFinalAudit_CHK_ReportingFreqwithinAuditPeriod(strFinalAudit_CHK_ReportingFreqwithinAuditPeriod),strFinalAudit_CHK_ReportingFreqwithinAuditPeriod,test);
					se.element().enterOrValidateText(getFinalAudit_TXT_Estimated_Audit(strFinalAudit_TXT_Estimated_Audit),strFinalAudit_TXT_Estimated_Audit,test);
					
					se.element().Click(getFinalAudit_DDN_reporting_frequency(strFinalAudit_DDN_reporting_frequency),strFinalAudit_DDN_reporting_frequency,test);
					
					if(!strFinalAudit_CHK_IfStatusApplyYes.equalsIgnoreCase(constants.NA)){
					se.element().checkUncheckOrValidate(getFinalAudit_BTN_StatusAppliesYes(strFinalAudit_ClassCode),strFinalAudit_CHK_IfStatusApplyYes,test);
					}
					
					se.element().clearTheField(getAuditDetails_TXT_AuditedExposure(strFinalAudit_ClassCode,strFinalAudit_AuditedExposure,strFinalAudit_AuditRow))	;
					se.element().enterOrValidateText(getAuditDetails_TXT_AuditedExposure(strFinalAudit_ClassCode,strFinalAudit_AuditedExposure,strFinalAudit_AuditRow),strFinalAudit_AuditedExposure,test);
					
				//	se.element().Click(getFinalAudit_AuditRow(strFinalAudit_AuditRow),strFinalAudit_AuditRow,test);
					
					if(strFinalAudit_Next.equalsIgnoreCase("Yes")){
						se.element().clickElement(getNext());
					}
					se.util().sleep(3000);
								
				}catch(Exception e) {
					se.verify().verifyEquals("Failed to fill in details for WC_FinalAuditDetails", true, false, true, test);
							
					
					}
							iteration++;
						}
					
				}
				catch (Exception e) {
					
					se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
					test.log(LogStatus.FAIL, "Failed", "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
					testTearDown(se, test);
				}
					
			}
}
