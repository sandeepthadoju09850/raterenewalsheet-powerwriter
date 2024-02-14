package pw.pages.CU;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import pw.Constants.constants;
import pw.OR.OR_CU;

public class CU_AutoDealersPolicyInfo extends OR_CU {
	
	public void AutoDealerPolicyInfo_Main(String strRegressionID, String transaction,String suspendSheet ,ExtentTest test) throws IOException {
		try {
			
			if (suspendSheet.equalsIgnoreCase("AutoDealersPolicyInfo")) {
				test.log(LogStatus.INFO, "Page Suspended :- ", "Transaction Step : " + transaction + "<br>" + "Page : " + suspendSheet);
				testTearDown(se, test);
			}
			List<Map<String, String>> table = ExcelOperations.getPagesData("AutoDealersPolicyInfo", strRegressionID,transaction);
			CU_AutoDealersPolicyCoverage AutoDealersPolicyCoveragePage = TestPageFactory.initElements(se, CU_AutoDealersPolicyCoverage.class);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strAdd_BTN = (String) row.get("Add_BTN");
				String strDetails_BTN = (String) row.get("Details_BTN");
				String strRemove_BTN = (String) row.get("Remove_BTN");
				String strNEXT_BTN = (String) row.get("NEXT_BTN");
				String strDone_BTN = (String) row.get("Done_BTN");
				String strIfAutoCoverageIsPresent = (String) row.get("IfAutoCoverageIsPresent");
				
				try {
					se.log().logTestStep("Entering details on Auto dealers Policy Info Page");
					test.log(LogStatus.INFO, "Entering details on Auto dealers Policy Info Page screen", "Transaction Step : " + transaction + "<br>" + "Page : Auto Dealers Info Page");
					se.verify().verifyEquals("Auto dealers Policy Info Page displayed", getCU_AutoDealerPolInfo_LBL().isDisplayed(),true, true, test);
					if(!strDetails_BTN.equals(constants.NA)){
						se.element().clickElement(getCU_AutoDealerPolInfo_Details_BTN(strDetails_BTN),test);
						se.verify().verifyEquals("Auto dealers Policy Info details is displayed ", getcommon_BTN_SaveAndNew().isDisplayed(),true, true,test);
					}
					if(!strAdd_BTN.equals(constants.NA)){
						se.element().clickElement(getCU_AutoDealerPolInfo_ADD_BTN(strAdd_BTN),test);
					}
					if(!strRemove_BTN.equals(constants.NA)){
						se.element().clickElement(getCU_AutoDealerPolInfo_DELETE_BTN(strRemove_BTN),test);
					}
					
					Thread.sleep(2000);
					AutoDealer_PolicyInfo(row,test);
					if(!strNEXT_BTN.equals(constants.NA)){
					se.element().Click(getNext(), test);
					if(se.element().isElementPresent(CU_AutoDealerPolInfo_Warning_BTN_Yes)){
						se.element().Click(getCU_AutoDealerPolInfo_Warning_BTN_Yes(), test);
						
					}
					}
					if(!strDone_BTN.equalsIgnoreCase(constants.NA)) {
						se.element().Click(getNext(), test);
					}
					
					if(!strIfAutoCoverageIsPresent.equalsIgnoreCase(constants.NA)) {
						AutoDealersPolicyCoveragePage.AutoDealerPolicyCoverageInfo(strRegressionID, transaction, suspendSheet, test);
					}
					
					
					
				} catch (Exception e) {
					
					se.verify().verifyEquals("Failed to fill in details for CU Auto dealers Information screen Main Page ", true, false, true, test);
				}
				iteration++;
			}
			
			

		} catch (Exception e) {
			se.log().logTestStep("Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			test.log(LogStatus.FAIL, "Failed","Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			testTearDown(se, test);
		}
	}
	
	public void AutoDealer_PolicyInfo(Map<String, String> row, ExtentTest test) throws IOException {
		
		String strUnderlyingQuotePolicyNum_TXT = (String) row.get("UnderlyingQuotePolicyNum_TXT");
		String strCompany_TXT = (String) row.get("Company_TXT");
		String strCompanyFilterNeeded_TXT = (String) row.get("CompanyFilterNeeded_TXT");
		String strCompany_GroupNameOption_TXT = (String) row.get("Company_GroupNameOption_TXT");
		String strGLAggregateLimitIfDealerAppl_TXT = (String) row.get("GLAggregateLimitIfDealerAppl_TXT");
		String strProdAndWrkYouPerformed_CHK = (String) row.get("ProdAndWrkYouPerformed_CHK");
		String strProdAndWrkYouPerformedAgrIfApplicable_TXT = (String) row.get("ProdAndWrkYouPerformedAgrIfApplicable_TXT");
		String strPrsnlAndAdvInj_CHK = (String) row.get("PrsnlAndAdvInj_CHK");
		String strPrsnlAndAdvInjLmtIfApplicable_TXT = (String) row.get("PrsnlAndAdvInjLmtIfApplicable_TXT");
		String strEachAccidentLimit_TXT = (String) row.get("EachAccidentLimit_TXT");
		String strPolicyPrimaryState_TXT = (String) row.get("PolicyPrimaryState_TXT");
		String strPolicyPrimaryStateFilterNeeded_TXT = (String) row.get("PolicyPrimaryStateFilterNeeded_TXT");
		String strHiredAutoLiability_CHK = (String) row.get("HiredAutoLiability_CHK");
		String strNonOwnedLiabilityEmployees_CHK = (String) row.get("NonOwnedLiabilityEmployees_CHK");
		String strNonOwnedLiabilitySocialService_CHK = (String) row.get("NonOwnedLiabilitySocialService_CHK");
		String strNonOwnedLiabilityAutoService_CHK = (String) row.get("NonOwnedLiabilityAutoService_CHK");
		String strNumWhoseMainDutyIsDriving_TXT = (String) row.get("NumWhoseMainDutyIsDriving_TXT");
		String strVehicleInfo_TBL_RowNo = (String) row.get("VehicleInfo_TBL_RowNo");
		String strVehicleType_LBL = (String) row.get("VehicleType_LBL");
		String strNumOfUnits_TXT = (String) row.get("NumOfUnits_TXT");
		String strProxyPremium_TXT = (String) row.get("ProxyPremium_TXT");
		String strPremium_TXT = (String) row.get("Premium_TXT");

		try {
			se.element().enterOrValidateText(getCU_ADPolicyInfo_CALiab_UnderlyingQuoteNo_TXT(strUnderlyingQuotePolicyNum_TXT),strUnderlyingQuotePolicyNum_TXT, test);
			se.element().selectPopupWithMagnifier(
					getCU_ADPolicyInfo_CALiab_Company_TXT(strCompany_TXT),
					getCU_ADPolicyInfo_CALiab_Company_Search_BTN(strCompany_TXT),
					strCompany_TXT, strCompanyFilterNeeded_TXT, strCompany_TXT,
					strCompany_GroupNameOption_TXT, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getCU_ADPolicyInfo_CALiab_GLAggLimit_TXT(strGLAggregateLimitIfDealerAppl_TXT),strGLAggregateLimitIfDealerAppl_TXT, test);
			se.element().enterOrValidateText(getCU_ADPolicyInfo_CALiab_EachAcciLimit_TXT(strEachAccidentLimit_TXT),strEachAccidentLimit_TXT, test);
			se.element().selectPopupWithMagnifier(
					getCU_ADPolicyInfo_CALiab_PolicyPrimState_TXT(strPolicyPrimaryState_TXT),
					getCU_ADPolicyInfo_CALiab_PolicyPrimState_Search_BTN(strPolicyPrimaryState_TXT),
					strPolicyPrimaryState_TXT, strPolicyPrimaryStateFilterNeeded_TXT, strPolicyPrimaryState_TXT,
					constants.NA, constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(getCU_ADPolicyInfo_CALiab_HiredAutoLiab_CHK(strHiredAutoLiability_CHK),
					strHiredAutoLiability_CHK, test);
			se.element().checkUncheckOrValidate(getCU_ADPolicyInfo_CALiab_NonOwnedLiab_Emp_CHK(strNonOwnedLiabilityEmployees_CHK),
					strNonOwnedLiabilityEmployees_CHK, test);
			se.element().checkUncheckOrValidate(getCU_ADPolicyInfo_CALiab_NonOwnedLiab_SocialServVol_CHK(strNonOwnedLiabilitySocialService_CHK),
					strNonOwnedLiabilitySocialService_CHK, test);
			se.element().checkUncheckOrValidate(getCU_ADPolicyInfo_CALiab_NonOwnedLiab_AutoServEmp_CHK(strNonOwnedLiabilityAutoService_CHK),
					strNonOwnedLiabilityAutoService_CHK, test);
			se.element().enterOrValidateText(getCU_ADPolicyInfo_CALiab_NmbrWhoseMainDuty_TXT(strNumWhoseMainDutyIsDriving_TXT),strNumWhoseMainDutyIsDriving_TXT, test);
			se.element().enterOrValidateText(getCU_ADPolicyInfo_VehInfo_VehicleType_TXT(strVehicleInfo_TBL_RowNo),strVehicleType_LBL, test);
			se.element().enterOrValidateText(getCU_ADPolicyInfo_VehInfo_NoOfUnits_TXT(strVehicleInfo_TBL_RowNo),strNumOfUnits_TXT, test);
			se.element().enterOrValidateText(getCU_ADPolicyInfo_VehInfo_ProxyPrem_TXT(strVehicleInfo_TBL_RowNo),strProxyPremium_TXT, test);
			se.element().enterOrValidateText(getCU_ADPolicyInfo_VehInfo_Premium_TXT(strVehicleInfo_TBL_RowNo),strPremium_TXT, test);
			
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CU_Auto Dealers Policy Information Page ", true, false, true, test);
		}
	}

}
