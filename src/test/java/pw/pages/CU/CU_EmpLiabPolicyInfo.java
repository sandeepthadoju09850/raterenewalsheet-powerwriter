package pw.pages.CU;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CU;

public class CU_EmpLiabPolicyInfo extends OR_CU {
	
	public void EmpLiabPolicyInfo_Main(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		try {
			
			if (suspendSheet.equalsIgnoreCase("EmployersLiabPolicyInfo")) {
				test.log(LogStatus.INFO, "Page Suspended :- ", "Transaction Step : " + transaction + "<br>" + "Page : " + suspendSheet);
				testTearDown(se, test);
			}
			List<Map<String, String>> table = ExcelOperations.getPagesData("EmployersLiabPolicyInfo", strRegressionID,transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strAdd_BTN = (String) row.get("Add_BTN");
				String strDetails_BTN = (String) row.get("Details_BTN");
				String strRemove_BTN = (String) row.get("Delete_BTN");
				String strDone_BTN = (String) row.get("Done_BTN");
				String strUnderlyingQuotePolicyNum_TXT = (String) row.get("UnderlyingQuotePolicyNum_TXT");
				String strCompany_TXT = (String) row.get("Company_TXT");
				String strCompanyFilterNeeded_TXT = (String) row.get("CompanyFilterNeeded_TXT");
				String strCompany_GroupNameOption_TXT = (String) row.get("Company_GroupNameOption_TXT");
				String strEachAccidentLimit_TXT = (String) row.get("EachAccidentLimit_TXT");
				String strEachEmploeyeeLimit_TXT = (String) row.get("EachEmploeyeeLimit_TXT");
				String strEachPolicyLimit_TXT = (String) row.get("EachPolicyLimit_TXT");
										
				try {
					se.log().logTestStep("Entering details on Employers Liability Policy Info Page");
					test.log(LogStatus.INFO, "Entering details on Employers Liability  Policy Info Page screen", "Transaction Step : " + transaction + "<br>" + "Page : Employers Liability Policy Info Page");
					se.verify().verifyEquals("Employers Liability policy Info Page displayed", getPagecontainingtext("Employers Liability Policy Information").isDisplayed(),true, true, test);
					if(!strDetails_BTN.equals(constants.NA)){
						se.element().clickElement(getCU_EmpLiab_Details_BTN(strDetails_BTN),test);
						se.verify().verifyEquals("Employers Liability Policy Info details is displayed ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
					}
					if(!strAdd_BTN.equals(constants.NA)){
						se.element().clickElement(getCU_EmpLiab_ADD_BTN(strAdd_BTN),test);
					}
					if(!strRemove_BTN.equals(constants.NA)){
						se.element().clickElement(getCU_EmpLiab_DELETE_BTN(strRemove_BTN),test);
					}
					Thread.sleep(2000);
					
					se.element().enterOrValidateText(getCU_EmpLiab_UndelyingQuoteNo_TXT(strUnderlyingQuotePolicyNum_TXT),strUnderlyingQuotePolicyNum_TXT, test);
					se.element().selectPopupWithMagnifier(getCU_EmpLiab_Company_TXT(strCompany_TXT),
							getCU_EmpLiab_Company_Search_BTN(strCompany_TXT), strCompany_TXT,
							strCompanyFilterNeeded_TXT, strCompany_TXT, strCompany_GroupNameOption_TXT, constants.NA, constants.NA,
							test);
					se.element().enterOrValidateText(getCU_EmpLiab_EachAcciLimit_TXT(strEachAccidentLimit_TXT),strEachAccidentLimit_TXT, test);
					se.element().enterOrValidateText(getCU_EmpLiab_EachEmpLimit_TXT(strEachEmploeyeeLimit_TXT),strEachEmploeyeeLimit_TXT, test);
					se.element().enterOrValidateText(getCU_EmpLiab_EachPolicyLimit_TXT(strEachPolicyLimit_TXT),strEachPolicyLimit_TXT, test);
					se.element().Click(getNext(),test);
					if(strDone_BTN.equalsIgnoreCase(constants.Yes)){
						se.element().Click(getNext(),test);
					}
				} catch (Exception e) {
					se.verify().verifyEquals("Failed to fill in details for Employers Liability Policy Information screen Main Page ", true, false, true, test);
				}
				iteration++;
			}
		} catch (Exception e) {
			se.log().logTestStep("Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			test.log(LogStatus.FAIL, "Failed","Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			testTearDown(se, test);
		}
	}
}
