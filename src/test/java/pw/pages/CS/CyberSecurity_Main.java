package pw.pages.CS;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import pw.Constants.constants;
import pw.OR.OR_Cyber;
import pw.pages.COMMON.PW_CommonMethods;

public class CyberSecurity_Main extends OR_Cyber {

	public void CyberSecurityPage(String strRegressionID, String transaction, String cyberChkY, ExtentTest test)
			throws IOException {
		try {
			PW_CommonMethods CommonMethods = TestPageFactory.initElements(se, PW_CommonMethods.class);
			String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID, transaction);
			if (SuspendSheet.equalsIgnoreCase(constants.Cyber)) {
				test.log(LogStatus.INFO, "Page Suspended :- ",
						"Transaction Step : " + transaction + "<br>" + "Page : " + SuspendSheet);
				testTearDown(se, test);
			}
			List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Cyber, strRegressionID,
					transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strPrimaryState_TXT = (String) row.get("PrimaryState_TXT");
				String strCyberSecurityOption_TXT = (String) row.get("CyberSecurityOption_TXT");
				String strSICCode_TXT = (String) row.get("SICCode_TXT");
				String strTier_TXT = (String) row.get("Tier_TXT");
				String strFirstPartyAnnualAggLmt_TXT = (String) row.get("FirstPartyAnnualAggLmt_TXT");
				String strThirdPartyDefenseAnnualAggLmt_TXT = (String) row.get("ThirdPartyDefenseAnnualAggLmt_TXT");
				String strThirdPartyLiabAnnualAggLmt_TXT = (String) row.get("ThirdPartyLiabAnnualAggLmt_TXT");
				String strCyberSecurityDedPerOcc_TXT = (String) row.get("CyberSecurityDedPerOcc_TXT");
				String strCyberOverridePremium_TXT = (String) row.get("OverridePremium_TXT");
				String strSecuraManuscript = (String) row.get("SecuraManuscript_CHK");
				String strReputationalHarmSublimitsPerOcc_TXT = (String) row.get("ReputationalHarmSublimitsPerOcc_TXT");
				String strTelecommunicationsFraudSublimitsPerOcc_TXT = (String) row.get("TelecommunicationsFraudSublimitsPerOcc_TXT");
				String strRewardPaymentsSublimitsPerOcc_TXT = (String) row.get("RewardPaymentsSublimitsPerOcc_TXT");
				String strDataComp_PublicRelationsSublimitsPerOcc_TXT = (String) row.get("DataComp_PublicRelationsSublimitsPerOcc_TXT");
				String strComputerAttack_PublicRelationsSublimitsPerOcc_TXT = (String) row.get("ComputerAttack_PublicRelationsSublimitsPerOcc_TXT");
				String strCyberExtortion_SublimitsPerOcc_TXT = (String) row.get("CyberExtortion_SublimitsPerOcc_TXT");
				String strMisdirectedPaymentFraud_SublimitsPerOcc_TXT = (String) row.get("MisdirectedPaymentFraud_SublimitsPerOcc_TXT");
				String strComputerFraud_SublimitsPerOcc_TXT = (String) row.get("ComputerFraud_SublimitsPerOcc_TXT");
				
				String strKYTax_DoNotApplyTaxes_CHK = (String) row.get("KYTax_DoNotApplyTaxes?_CHK");
				String strKYTax_AllCityName_CHK = (String) row.get("KYTax_AllCityName_CHK");
				String strKYTax_City_TXT = (String) row.get("KYTax_City_TXT");
				String strKYTax_CityCode_TXT = (String) row.get("KYTax_CityCode_TXT");
				String strKYTax_County_TXT = (String) row.get("KYTax_County_TXT");
				String strKYTax_CountyCode_TXT = (String) row.get("KYTax_CountyCode_TXT");
				String strKYTax_TaxCode_TXT = (String) row.get("KYTax_TaxCode_TXT");

				try {

					if (cyberChkY.equals(constants.Check) || cyberChkY.contains(constants.Validate)) {
						CommonMethods.NavigateTo("Cyber Security", test);

						se.log().logTestStep("Cyber Securtiy");
						test.log(LogStatus.INFO, "Cyber Securtiy",
								"Transaction Step : " + transaction + "<br>" + "Page : CyberSecurtiy");

						se.verify().verifyEquals("Cyber Securtiy screen ",
								getPagecontainingtext(constants.PageNm_CyberSecurity).isDisplayed(), true, true, test);
						se.util().sleep(2000);
						se.element().enterOrValidateText(getCyber_TXT_PrimaryState(strPrimaryState_TXT), strPrimaryState_TXT, test);
						se.util().sleep(1000);
						/*se.element().selectPopupWithMagnifier(
								getCyber_TXT_Option(strCyberSecurityOption_TXT),
								getCyber_BTN_Option_Search(strCyberSecurityOption_TXT),
								strCyberSecurityOption_TXT, constants.NA, strCyberSecurityOption_TXT,
								constants.NA, constants.NA, constants.NA, test);*/
						se.element().enterOrValidateText(getCyber_TXT_Option(strCyberSecurityOption_TXT), strCyberSecurityOption_TXT, test);

						se.element().enterOrValidateText(getCyber_TXT_SICCode(strSICCode_TXT), strSICCode_TXT, test);
						se.element().enterOrValidateText(getCyber_TXT_Tier(strTier_TXT), strTier_TXT, test);
						se.element().selectPopupWithMagnifier(
								getCyber_TXT_firstPartyAnnualAggLmt(strFirstPartyAnnualAggLmt_TXT),
								getCyber_BTN_firstPartyAnnualAggLmt_Search(strFirstPartyAnnualAggLmt_TXT),
								strFirstPartyAnnualAggLmt_TXT, constants.NA, strFirstPartyAnnualAggLmt_TXT,
								constants.NA, constants.NA, constants.NA, test);
						if(strPrimaryState_TXT.contains("Minnesota")){
							se.element().enterOrValidateText(getCyber_TXT_thirdPartyDefenceAnnualAggLmt(strThirdPartyDefenseAnnualAggLmt_TXT), strThirdPartyDefenseAnnualAggLmt_TXT, test);
						}
						
						se.element().enterOrValidateText(getCyber_TXT_thirdPartyLiabAnnualAggLmt(strThirdPartyLiabAnnualAggLmt_TXT), strThirdPartyLiabAnnualAggLmt_TXT, test);
						se.element().enterOrValidateText(getCyber_TXT_cyberSecurityDedPerOcc(strCyberSecurityDedPerOcc_TXT), strCyberSecurityDedPerOcc_TXT, test);
						se.element().enterOrValidateText(getCyber_TXT_overridePremium(strCyberOverridePremium_TXT), strCyberOverridePremium_TXT, test);
						se.element().checkUncheckOrValidate(getCyber_CHK_securaManuscript(strSecuraManuscript),strSecuraManuscript,test);
						
						//added the below fields as part of CYber RQ for 05/01/22 rate changes
						se.element().enterOrValidateText(getCyber_TXT_DataComp_PublicRelationsSublimitsPerOcc(strDataComp_PublicRelationsSublimitsPerOcc_TXT), strDataComp_PublicRelationsSublimitsPerOcc_TXT, test);
						
						se.element().enterOrValidateText(getCyber_TXT_ReputationalHarmSublimitsPerOcc(strReputationalHarmSublimitsPerOcc_TXT), strReputationalHarmSublimitsPerOcc_TXT, test);
						//added these 4 fields as part of CYber RQ for 05/01/22 rate changes
						se.element().enterOrValidateText(getCyber_TXT_ComputerAttack_PublicRelationsSublimitsPerOcc(strComputerAttack_PublicRelationsSublimitsPerOcc_TXT), strComputerAttack_PublicRelationsSublimitsPerOcc_TXT, test);
						se.element().enterOrValidateText(getCyber_TXT_CyberExtortion_SublimitsPerOcc(strCyberExtortion_SublimitsPerOcc_TXT), strCyberExtortion_SublimitsPerOcc_TXT, test);
						se.element().enterOrValidateText(getCyber_TXT_MisdirectedPaymentFraud_SublimitsPerOcc(strMisdirectedPaymentFraud_SublimitsPerOcc_TXT), strMisdirectedPaymentFraud_SublimitsPerOcc_TXT, test);
						se.element().enterOrValidateText(getCyber_TXT_ComputerFraud_SublimitsPerOcc(strComputerFraud_SublimitsPerOcc_TXT), strComputerFraud_SublimitsPerOcc_TXT, test);
					
						
						se.element().enterOrValidateText(getCyber_TXT_TelecommunicationsFraudSublimitsPerOcc(strTelecommunicationsFraudSublimitsPerOcc_TXT), strTelecommunicationsFraudSublimitsPerOcc_TXT, test);
						se.element().enterOrValidateText(getCyber_TXT_RewardPaymentsSublimitsPerOcc_TXT(strRewardPaymentsSublimitsPerOcc_TXT), strRewardPaymentsSublimitsPerOcc_TXT, test);

						se.element().checkUncheckOrValidate(getCommon_KYTax_CHK_DoNotApplyTaxes(strKYTax_DoNotApplyTaxes_CHK),strKYTax_DoNotApplyTaxes_CHK, test);
						se.element().checkUncheckOrValidate(getCommon_KYTax_CHK_AllCityName(strKYTax_AllCityName_CHK), strKYTax_AllCityName_CHK, test);
						if(!strKYTax_DoNotApplyTaxes_CHK.equals(constants.Uncheck)){
							se.element().enterOrValidateText(getCommon_KYTax_TXT_City(strKYTax_City_TXT), strKYTax_City_TXT, test);
							se.element().enterOrValidateText(getCommon_KYTax_TXT_CityCode(strKYTax_CityCode_TXT), strKYTax_CityCode_TXT, test);
							se.element().enterOrValidateText(getCommon_KYTax_TXT_County(strKYTax_County_TXT), strKYTax_County_TXT, test);
							se.element().enterOrValidateText(getCommon_KYTax_TXT_CountyCode(strKYTax_CountyCode_TXT), strKYTax_CountyCode_TXT, test);
							se.element().enterOrValidateText(getCommon_KYTax_TXT_TaxCode(strKYTax_TaxCode_TXT), strKYTax_TaxCode_TXT, test);
						}

						se.element().Click(getNext(), test);
						se.util().sleep(2000);
						//se.element().Click(getDone(), test);
					}

				} catch (Exception e) {
					se.verify().verifyEquals("Failed to fill in details on Cyber Security Screen ", true, false, true, test);

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

}
