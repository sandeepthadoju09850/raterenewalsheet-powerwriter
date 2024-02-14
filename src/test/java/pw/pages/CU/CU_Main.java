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

public class CU_Main extends OR_CU {

	public void CU_MainPage(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {

		try {

			
			if (suspendSheet.equalsIgnoreCase(constants.DO_Main)) {
				test.log(LogStatus.INFO, "Page Suspended :- ",
						"Transaction Step : " + transaction + "<br>" + "Page : " + suspendSheet);
				testTearDown(se, test);
			}
			List<Map<String, String>> table = ExcelOperations.getPagesData("CommercialUmbrella", strRegressionID,
					transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strUnderlyingLiabilityOnDemandRefresh_CHK = (String) row.get("UnderlyingLiabilityOnDemandRefresh_CHK");
				String strUnderlyingLiabilityStatus_TXT = (String) row.get("UnderlyingLiabilityStatus_TXT");
				String strUnderlyingLiabilityStatusFilterNeeded_TXT = (String) row.get("UnderlyingLiabilityStatusFilterNeeded_TXT");
				String strPrimarySecuraLiabQuotePolicyNum_TXT = (String) row.get("PrimarySecuraLiabQuotePolicyNum_TXT");
				String strPrimarySecuraLiabQuotePolicyNumFilterNeeded_TXT = (String) row.get("PrimarySecuraLiabQuotePolicyNumFilterNeeded_TXT");
				String strPrimarySecuraLiab_RevisionNumOption_TXT = (String) row.get("PrimarySecuraLiab_RevisionNumOption_TXT");
				String strLiabilityRevisionNum_TXT = (String) row.get("LiabilityRevisionNum_TXT");
				String strPrimarySecuraAutoDealersQuotePolicyNum_TXT = (String) row.get("PrimarySecuraAutoDealersQuotePolicyNum_TXT");
				String strPrimarySecuraAutoDealersQuotePolicyNumFilterNeeded_TXT = (String) row.get("PrimarySecuraAutoDealersQuotePolicyNumFilterNeeded_TXT");
				String strPrimarySecuraAutoDealers_RevisionNumOption_TXT = (String) row.get("PrimarySecuraAutoDealers_RevisionNumOption_TXT");
				String strAutoDealersRevisionNum_TXT = (String) row.get("AutoDealersRevisionNum_TXT");
				String strPrimarySecuraEmployersLiabQuotePolicyNum_TXT = (String) row.get("PrimarySecuraEmployersLiabQuotePolicyNum_TXT");
				String strPrimarySecuraEmployersLiabQuotePolicyNumFilterNeeded_TXT = (String) row.get("PrimarySecuraEmployersLiabQuotePolicyNumFilterNeeded_TXT");
				String strPrimarySecuraEmployersLiab_RevisionNumOption_TXT = (String) row.get("PrimarySecuraEmployersLiab_RevisionNumOption_TXT");
				String strEmployersLiabRevisionNum_TXT = (String) row.get("EmployersLiabRevisionNum_TXT");
				String strUmbrellaPrimaryState_TXT = (String) row.get("UmbrellaPrimaryState_TXT");
				String strUmbrellaPrimaryStateFilterNeeded_TXT = (String) row.get("UmbrellaPrimaryStateFilterNeeded_TXT");
				String strTotalSalesAllLocations_TXT = (String) row.get("TotalSalesAllLocations_TXT");
				String strUmbrellaLimitEachOccurenceLimit_TXT = (String) row.get("UmbrellaLimitEachOccurenceLimit_TXT");
				String strUmbrellaLimitEachOccurenceLimitFilterNeeded_TXT = (String) row.get("UmbrellaLimitEachOccurenceLimitFilterNeeded_TXT");
				String strPersonalAndAdvertisingInjuryLimit_TXT = (String) row.get("PersonalAndAdvertisingInjuryLimit_TXT");
				String strAggregateExceptForCoveredAutoLimit_TXT = (String) row.get("AggregateExceptForCoveredAutoLimit_TXT");
				String strSeperateProductCompletedOperationsAggOption_CHK = (String) row.get("SeperateProductCompletedOperationsAggOption_CHK");
				String strProdCompletedOPerationsAggLimit_TXT = (String) row.get("ProdCompletedOPerationsAggLimit_TXT");
				String strSelfInsuredRetention_TXT = (String) row.get("SelfInsuredRetention_TXT");
				String strSelfInsuredRetentionFilter_TXT = (String) row.get("SelfInsuredRetentionFilter_TXT");
				String strAllJurisdiction_CHK = (String) row.get("AllJurisdiction_CHK");
				String strJurisdictionDesc_TXT = (String) row.get("JurisdictionDesc_TXT");
				String strJurisdictionDescFilterNeeded_TXT = (String) row.get("JurisdictionDescFilterNeeded_TXT");
				String strFPDCode_TXT = (String) row.get("FPDCode_TXT");
				String strFireProtDist_TXT = (String) row.get("FireProtDist_TXT");
				String strNext_BTN = (String) row.get("Next_BTN");
				try {
					se.log().logTestStep("Entering details on CU Main Page");
					test.log(LogStatus.INFO, "Entering details on Commercial Umbrella screen",
							"Transaction Step : " + transaction + "<br>" + "Page : Commercial Umbrella");

					se.verify().verifyEquals("Commercial Umbrella Page displayed", getPagecontainingtext("Commercial Umbrella").isDisplayed(),true, true, test);
					se.element().checkUncheckOrValidate(getUnderlyingLiabilityOnDemandRefresh_CHK(strUnderlyingLiabilityOnDemandRefresh_CHK),strUnderlyingLiabilityOnDemandRefresh_CHK, test);
					if(se.element().isElementPresent(InfoOKbutton)){
						se.element().Click(getInfoOKbutton(), test);
					} 	
					se.element().selectPopupWithMagnifier(
					getCU_UnderlyingLiabStatus_TXT(strUnderlyingLiabilityStatus_TXT),
					getCU_UnderlyingLiabStatus_Search_BTN(strUnderlyingLiabilityStatus_TXT),
					strUnderlyingLiabilityStatus_TXT, strUnderlyingLiabilityStatusFilterNeeded_TXT, strUnderlyingLiabilityStatus_TXT,
					constants.NA, constants.NA, constants.NA, test);
			
					
					if(!strPrimarySecuraLiab_RevisionNumOption_TXT.equalsIgnoreCase(constants.NA)){
						se.element().Click(getCU_UnderlyingPolicyLinking_PrimarySECLiabQuotePolicyNo_Search_BTN(strPrimarySecuraLiab_RevisionNumOption_TXT), test);
						se.util().sleep(3000);
						se.element().Click(getCU_UnderlyingPolicyLinking_hyperLink(strPrimarySecuraLiab_RevisionNumOption_TXT), test);
					}
					se.element().enterOrValidateText(getCU_UnderlyingPolicyLinking_LiabilityRevisionNo_TXT(strLiabilityRevisionNum_TXT),strLiabilityRevisionNum_TXT, test);
					
						/*se.element().selectPopupWithMagnifier(
							getCU_UnderlyingPolicyLinking_PrimarySECLiabQuotePolicyNo_TXT(strPrimarySecuraLiabQuotePolicyNum_TXT),
							getCU_UnderlyingPolicyLinking_PrimarySECLiabQuotePolicyNo_Search_BTN(strPrimarySecuraLiabQuotePolicyNum_TXT),
							strPrimarySecuraLiabQuotePolicyNum_TXT, strPrimarySecuraLiabQuotePolicyNumFilterNeeded_TXT, strPrimarySecuraLiabQuotePolicyNum_TXT,
							strPrimarySecuraLiab_RevisionNumOption_TXT, constants.NA, constants.NA, test);*/
					
					
					if(!strPrimarySecuraAutoDealers_RevisionNumOption_TXT.equalsIgnoreCase(constants.NA)){
						se.element().Click(getCU_UnderlyingPolicyLinking_PrimarySECAutoDealerQuotePolicyNo_Search_BTN(strPrimarySecuraAutoDealers_RevisionNumOption_TXT), test);
						se.util().sleep(3000);
						se.element().Click(getCU_UnderlyingPolicyLinking_hyperLink(strPrimarySecuraAutoDealers_RevisionNumOption_TXT), test);
					}
					se.element().enterOrValidateText(getCU_UnderlyingPolicyLinking_CALiabilityRevisionNo_TXT(strAutoDealersRevisionNum_TXT),strAutoDealersRevisionNum_TXT, test);
					
					
					/*se.element().selectPopupWithMagnifier(
							getCU_UnderlyingPolicyLinking_PrimarySECAutoDealerQuotePolicyNo_TXT(strPrimarySecuraAutoDealersQuotePolicyNum_TXT),
							getCU_UnderlyingPolicyLinking_PrimarySECAutoDealerQuotePolicyNo_Search_BTN(strPrimarySecuraAutoDealersQuotePolicyNum_TXT),
							strPrimarySecuraAutoDealersQuotePolicyNum_TXT, strPrimarySecuraAutoDealersQuotePolicyNumFilterNeeded_TXT, strPrimarySecuraAutoDealersQuotePolicyNum_TXT,
							strPrimarySecuraAutoDealers_RevisionNumOption_TXT, constants.NA, constants.NA, test);*/
					
					if(!strPrimarySecuraEmployersLiab_RevisionNumOption_TXT.equalsIgnoreCase(constants.NA)){
						se.element().Click(getCU_UnderlyingPolicyLinking_PrimarySECEmpLiabQuotePolicyNo_Search_BTN(strPrimarySecuraEmployersLiab_RevisionNumOption_TXT), test);
						se.element().Click(getCU_UnderlyingPolicyLinking_hyperLink(strPrimarySecuraEmployersLiab_RevisionNumOption_TXT), test);
					}
					
					/*se.element().selectPopupWithMagnifier(
							getCU_UnderlyingPolicyLinking_PrimarySECEmpLiabQuotePolicyNo_TXT(strPrimarySecuraEmployersLiabQuotePolicyNum_TXT),
							getCU_UnderlyingPolicyLinking_PrimarySECEmpLiabQuotePolicyNo_Search_BTN(strPrimarySecuraEmployersLiabQuotePolicyNum_TXT),
							strPrimarySecuraEmployersLiabQuotePolicyNum_TXT, strPrimarySecuraEmployersLiabQuotePolicyNumFilterNeeded_TXT, strPrimarySecuraEmployersLiabQuotePolicyNum_TXT,
							strPrimarySecuraEmployersLiab_RevisionNumOption_TXT, constants.NA, constants.NA, test);*/
					
					se.element().enterOrValidateText(getCU_UnderlyingPolicyLinking_UmbrellaPrimaryState_TXT(strUmbrellaPrimaryState_TXT),strUmbrellaPrimaryState_TXT, test);
					se.element().enterOrValidateText(getCU_UnderlyingPolicyLinking_TotalSales_TXT(strTotalSalesAllLocations_TXT),strTotalSalesAllLocations_TXT, test);
					
					se.element().selectPopupWithMagnifier(
							getCU_UmbreallaLimits_EachOccurance_TXT(strUmbrellaLimitEachOccurenceLimit_TXT),
							getCU_UmbreallaLimits_EachOccurance_Search_BTN(strUmbrellaLimitEachOccurenceLimit_TXT),
							strUmbrellaLimitEachOccurenceLimit_TXT, strUmbrellaLimitEachOccurenceLimitFilterNeeded_TXT, strUmbrellaLimitEachOccurenceLimit_TXT,
							constants.NA, constants.NA, constants.NA, test);
					
					se.element().enterOrValidateText(getCU_UmbreallaLimits_PersonalAndAdvInjury_TXT(strPersonalAndAdvertisingInjuryLimit_TXT),strPersonalAndAdvertisingInjuryLimit_TXT, test);
					se.element().enterOrValidateText(getCU_UmbreallaLimits_Aggregate_TXT(strAggregateExceptForCoveredAutoLimit_TXT),strAggregateExceptForCoveredAutoLimit_TXT, test);
					se.element().checkUncheckOrValidate(getCU_UmbreallaLimits_SeperateProduct_CHK(strSeperateProductCompletedOperationsAggOption_CHK),strSeperateProductCompletedOperationsAggOption_CHK, test);
					if(strSeperateProductCompletedOperationsAggOption_CHK.equalsIgnoreCase(constants.Yes)){
						se.element().enterOrValidateText(getCU_UmbreallaLimits_ProductCompletedOperationsAgg_TXT(strProdCompletedOPerationsAggLimit_TXT),strProdCompletedOPerationsAggLimit_TXT, test);
					}
					se.element().selectPopupWithMagnifier(
							getCU_UmbreallaLimits_SelfInsuredRentention_TXT(strSelfInsuredRetention_TXT),
							getCU_UmbreallaLimits_SelfInsuredRentention_Search_BTN(strSelfInsuredRetention_TXT),
							strSelfInsuredRetention_TXT, strSelfInsuredRetentionFilter_TXT, strSelfInsuredRetention_TXT,
							constants.NA, constants.NA, constants.NA, test);
					
					KYTaxInformation(row,test);
					if(!strNext_BTN.equalsIgnoreCase("N/A")){
					se.element().Click(getNext(), test);
					}
				} catch (Exception e) {
					se.verify().verifyEquals("Failed to fill in details for CU_Main Page ", true, false, true, test);
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
	
	
	public void KYTaxInformation(Map<String, String> row, ExtentTest test) throws IOException {
		String strDoNotApplyCityOrCountyTaxes_CHK = (String) row.get("DoNotApplyCityOrCountyTaxes_CHK");
		String strAllCityName_CHK = (String) row.get("AllCityName_CHK");
		String strCity_TXT = (String) row.get("City_TXT");
		String strCityCode_TXT = (String) row.get("CityCode_TXT");
		String strCounty_TXT = (String) row.get("County_TXT");
		String strCountyCode_TXT = (String) row.get("CountyCode_TXT");
		String strTaxCode_TXT = (String) row.get("TaxCode_TXT");
		
		try{
			se.element().checkUncheckOrValidate(getCommon_KYTax_CHK_DoNotApplyTaxes(strDoNotApplyCityOrCountyTaxes_CHK),strDoNotApplyCityOrCountyTaxes_CHK, test);
			se.element().checkUncheckOrValidate(getCommon_KYTax_CHK_AllCityName(strAllCityName_CHK), strAllCityName_CHK, test);
			if(!strDoNotApplyCityOrCountyTaxes_CHK.equalsIgnoreCase(constants.NA)){
				if (!getCommon_KYTax_CHK_DoNotApplyTaxes(strDoNotApplyCityOrCountyTaxes_CHK).isSelected()) {
					se.element().enterOrValidateText(getCommon_KYTax_TXT_City(strCity_TXT), strCity_TXT, test);
					se.element().enterOrValidateText(getCommon_KYTax_TXT_CityCode(strCityCode_TXT), strCityCode_TXT, test);
					se.element().enterOrValidateText(getCommon_KYTax_TXT_County(strCounty_TXT), strCounty_TXT, test);
					se.element().enterOrValidateText(getCommon_KYTax_TXT_CountyCode(strCountyCode_TXT), strCountyCode_TXT, test);
					se.element().enterOrValidateText(getCommon_KYTax_TXT_TaxCode(strTaxCode_TXT), strTaxCode_TXT, test);
				}
			}
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CU_Main_KYTax Info section", true, false, true, test);
					
		}
		
		
		
		
	}
}
