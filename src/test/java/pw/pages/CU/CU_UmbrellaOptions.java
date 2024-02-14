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

public class CU_UmbrellaOptions extends OR_CU {

	public void UmbrellaOptions_Main(String strRegressionID, String transaction, String suspendSheet,ExtentTest test) throws IOException {
			try {
				
				if (suspendSheet.equalsIgnoreCase("Umbrella Options")) {
					test.log(LogStatus.INFO, "Page Suspended :- ", "Transaction Step : " + transaction + "<br>" + "Page : " + suspendSheet);
					testTearDown(se, test);
				}
				List<Map<String, String>> table = ExcelOperations.getPagesData("UmbrellaOptions", strRegressionID,transaction);
				int iteration = 0;
				while (iteration < table.size()) {
					LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
					String strUmbrellaEmployeeBenefitLim_CHK = (String) row.get("UmbrellaEmployeeBenefitLim_CHK");
					String strUmbrellaEmployeeBenefitLim_TXT = (String) row.get("UmbrellaEmployeeBenefitLim_TXT");
					String strUmbrellaEmployeeBenefitLim_FilterNeeded = (String) row.get("UmbrellaEmployeeBenefitLim_FilterNeeded");
					String strAbuseAndMolestation_CHK = (String) row.get("AbuseAndMolestation_CHK");
					String strAbuseAndMolestationLimit_TXT = (String) row.get("AbuseAndMolestationLimit_TXT");
					String strSumLiquorReceipts_TXT = (String) row.get("SumLiquorReceipts_TXT");
					String strCULiquorPercent_TXT = (String) row.get("CULiquorPercent_TXT");
					String strLiquorLiability_CHK = (String) row.get("LiquorLiability_CHK");
					String strBoats_CHK = (String) row.get("Boats_CHK");
					String strCondominiumDirectors_CHK = (String) row.get("CondominiumDirectors_CHK");
					String strCondominiumDirectorsLimit_TXT = (String) row.get("CondominiumDirectorsLimit_TXT");
					String strContractualLiab_Railroads_CHK = (String) row.get("ContractualLiab_Railroads_CHK");
					String strLimitedContractualLiab_Railroads_CHK = (String) row.get("LimitedContractualLiab_Railroads_CHK");
					String strHiredAndNonOwnedAutoGeneralLiab_CHK = (String) row.get("HiredAndNonOwnedAutoGeneralLiab_CHK");
					String strStopGapLiability_CHK = (String) row.get("StopGapLiability_CHK");
					String strTerrorismCertifiedActsCov_CHK = (String) row.get("TerrorismCertifiedActsCov_CHK");
					String strDruggists_CHK = (String) row.get("Druggists_CHK");
					String strOpticalAndHearingAidEstablishments_CHK = (String) row.get("OpticalAndHearingAidEstablishments_CHK");
					String strIllinoisLocationZipCode_TXT = (String) row.get("IllinoisLocationZipCode_TXT");
					String strFloristProfessionLiab_CHK = (String) row.get("FloristProfessionLiab_CHK");
					String strExclusionDesgOperationsCovered_CHK = (String) row.get("ExclusionDesgOperationsCovered_CHK");
					String strSwimmingPoolsLakesPonds_CHK = (String) row.get("SwimmingPoolsLakesPonds_CHK");
					String strRepossessedAuto_CHK = (String) row.get("RepossessedAuto_CHK");
					String strFuneralDirector_CHK = (String) row.get("FuneralDirector_CHK");
					String strPolicyAggregateAmendment_CHK = (String) row.get("PolicyAggregateAmendment_CHK");
					String strSecuraManuscript_CHK = (String) row.get("SecuraManuscript_CHK");
					String strReinsuranceManagement_CHK = (String) row.get("ReinsuranceManagement_CHK");
					String strHazardTierAssigned_Low_CHK = (String) row.get("HazardTierAssigned_Low_CHK");
					String strHazardTierAssigned_Medium_CHK = (String) row.get("HazardTierAssigned_Medium_CHK");
					String strHazardTierAssigned_High_CHK = (String) row.get("HazardTierAssigned_High_CHK");
					String strHazardTierOverride_CHK = (String) row.get("HazardTierOverride_CHK");
					String strOverrideHazardSelection_Low_CHK = (String) row.get("OverrideHazardSelection_Low_CHK");
					String strOverrideHazardSelection_Medium_CHK = (String) row.get("OverrideHazardSelection_Medium_CHK");
					String strOverrideHazardSelection_High_CHK = (String) row.get("OverrideHazardSelection_High_CHK");
					String strOverrideHazardReason_TXT = (String) row.get("OverrideHazardReason_TXT");
					String strOverrideHazardReasonFilterNeeded_TXT = (String) row.get("OverrideHazardReasonFilterNeeded_TXT");
					String strIL_ProfessionalLiab_CHK = (String) row.get("IL_ProfessionalLiab_CHK");
					String strPrimaryNonContributaryBlanketBasis_CHK = (String) row.get("PrimaryNonContributaryBlanketBasis_CHK");
					String strDefaultCharge_TXT = (String) row.get("DefaultCharge_TXT");
					String strOverride_CHK = (String) row.get("Override_CHK");
					String strOverrideCharge_TXT = (String) row.get("OverrideCharge_TXT");
					String strOverrideReason_TXT = (String) row.get("OverrideReason_TXT");
					String strOverrideReasonFilterNeeded_TXT = (String) row.get("OverrideReasonFilterNeeded_TXT");
					String strPrimaryNonContributarySchNameBasis_CHK = (String) row.get("PrimaryNonContributarySchNameBasis_CHK");
					String strAddScheduleName_BTN = (String) row.get("AddScheduleName_BTN");
					String strScheduleName1_TXT = (String) row.get("ScheduleName1_TXT");
					String strScheduleName2_TXT = (String) row.get("ScheduleName2_TXT");
					String strScheduleName3_TXT = (String) row.get("ScheduleName3_TXT");
					String strLimitedExclusionDesgOPerationsCovByAConsWrap_CHK = (String) row.get("LimitedExclusionDesgOPerationsCovByAConsWrap_CHK");
					String strAddProjectName_BTN = (String) row.get("AddProjectName_BTN");
					String strProjectName1_TXT = (String) row.get("ProjectName1_TXT");
					String strProjectName2_TXT = (String) row.get("ProjectName2_TXT");
					String strProjectName3_TXT = (String) row.get("ProjectName3_TXT");

					try {
						se.log().logTestStep("Entering details on Umbrella Options Page");
						test.log(LogStatus.INFO, "Entering details on General Liability Policy Info Page screen", "Transaction Step : " + transaction + "<br>" + "Page : Umbrella Options");
						se.verify().verifyEquals("Umbrella Options Page displayed", getPagecontainingtext("Umbrella Options").isDisplayed(),true, true, test);
						se.element().checkUncheckOrValidate(getCU_UmbOpt_EmpBenefitLiab_CHK(strUmbrellaEmployeeBenefitLim_CHK),strUmbrellaEmployeeBenefitLim_CHK, test);
						se.element().selectPopupWithMagnifier(
								CU_UmbOpt_EmpBenefitLiab_TXT(strUmbrellaEmployeeBenefitLim_TXT),
								getCU_UmbOpt_EmpBenefitLiab_Search_BTN(strUmbrellaEmployeeBenefitLim_TXT),
								strUmbrellaEmployeeBenefitLim_TXT, constants.NA, strUmbrellaEmployeeBenefitLim_TXT,
								constants.NA, constants.NA, constants.NA, test);
						se.element().checkUncheckOrValidate(getAbuseAndMolestation_CHK(strAbuseAndMolestation_CHK),strAbuseAndMolestation_CHK, test);
						se.element().enterOrValidateText(getAbuseAndMolestationLimit_TXT(strAbuseAndMolestationLimit_TXT),strAbuseAndMolestationLimit_TXT, test);
						se.element().checkUncheckOrValidate(getCU_UmbOpt_CondominiumDirectors_CHK(strCondominiumDirectors_CHK),strCondominiumDirectors_CHK, test);
						se.element().selectPopupWithMagnifier(
								getCU_UmbOpt_CondominiumDirectorsLimit_TXT(strCondominiumDirectorsLimit_TXT),
								getCU_UmbOpt_CondominiumDirectorsLimit_Search_BTN(strCondominiumDirectorsLimit_TXT),
								strCondominiumDirectorsLimit_TXT, constants.NA, strCondominiumDirectorsLimit_TXT,
								constants.NA, constants.NA, constants.NA, test);
						se.element().checkUncheckOrValidate(getCU_UmbOpt_ContractualLiab_Railroads_CHK(strContractualLiab_Railroads_CHK),strContractualLiab_Railroads_CHK, test);
						se.element().checkUncheckOrValidate(getCU_UmbOpt_LtdContractualLiab_Railroads_CHK(strLimitedContractualLiab_Railroads_CHK),strLimitedContractualLiab_Railroads_CHK, test);
						se.element().checkUncheckOrValidate(getLiquorLiability_CHK(strLiquorLiability_CHK),strLiquorLiability_CHK, test);
						se.element().checkUncheckOrValidate(getBoats_CHK(strBoats_CHK),strBoats_CHK, test);
						se.element().checkUncheckOrValidate(getCU_UmbOpt_TerrorismCertifiedActCov_CHK(strTerrorismCertifiedActsCov_CHK),strTerrorismCertifiedActsCov_CHK, test);
						se.element().selectPopupWithMagnifier(
								getCU_UmbOpt_IL_ZipCodet_TXT(strIllinoisLocationZipCode_TXT),
								getCU_UmbOpt_IL_ZipCodet_Search_BTN(strIllinoisLocationZipCode_TXT),
								strIllinoisLocationZipCode_TXT, constants.NA, strIllinoisLocationZipCode_TXT,
								constants.NA, constants.NA, constants.NA, test);
						se.element().checkUncheckOrValidate(getCU_UmbOpt_FloristProfLiab_CHK(strFloristProfessionLiab_CHK),strFloristProfessionLiab_CHK, test);
						se.element().checkUncheckOrValidate(getCU_UmbOpt_Exclusion_CHK(strExclusionDesgOperationsCovered_CHK),strExclusionDesgOperationsCovered_CHK, test);
						se.element().checkUncheckOrValidate(getCU_UmbOpt_SwimmingPools_CHK(strSwimmingPoolsLakesPonds_CHK),strSwimmingPoolsLakesPonds_CHK, test);
						se.element().checkUncheckOrValidate(getCU_UmbOpt_RepossessedAuto_CHK(strRepossessedAuto_CHK),strRepossessedAuto_CHK, test);
						se.element().checkUncheckOrValidate(getCU_UmbOpt_AggAmendment_CHK(strPolicyAggregateAmendment_CHK),strPolicyAggregateAmendment_CHK, test);
						se.element().checkUncheckOrValidate(getCU_UmbOpt_SecuraManuscript_CHK(strSecuraManuscript_CHK),strSecuraManuscript_CHK, test);
						se.element().checkUncheckOrValidate(getCU_UmbOpt_ReinsuranceMgmnt_CHK(strReinsuranceManagement_CHK),strReinsuranceManagement_CHK, test);
						se.element().checkUncheckOrValidate(getCU_UmbOpt_HazardTier_Low_RDO(strHazardTierAssigned_Low_CHK),strHazardTierAssigned_Low_CHK, test);
						se.element().checkUncheckOrValidate(getCU_UmbOpt_HazardTier_Medium_RDO(strHazardTierAssigned_Medium_CHK),strHazardTierAssigned_Medium_CHK, test);
						se.element().checkUncheckOrValidate(getCU_UmbOpt_HazardTier_High_RDO(strHazardTierAssigned_High_CHK),strHazardTierAssigned_High_CHK, test);
						se.element().checkUncheckOrValidate(getCU_UmbOpt_HazardTierOverride_CHK(strHazardTierOverride_CHK),strHazardTierOverride_CHK, test);
						se.element().checkUncheckOrValidate(getCU_UmbOpt_OverrideHazardSel_Low_RDO(strOverrideHazardSelection_Low_CHK),strOverrideHazardSelection_Low_CHK, test);
						se.element().checkUncheckOrValidate(getCU_UmbOpt_OverrideHazardSel_Medium_RDO(strOverrideHazardSelection_Medium_CHK),strOverrideHazardSelection_Medium_CHK, test);
						se.element().checkUncheckOrValidate(getCU_UmbOpt_OverrideHazardSel_High_RDO(strOverrideHazardSelection_High_CHK),strOverrideHazardSelection_High_CHK, test);
						se.element().selectPopupWithMagnifier(
								getCU_UmbOpt_OverideHzed_Reason_TXT(strOverrideHazardReason_TXT),
								getCU_UmbOpt_OverideHzed_Reason_Search_BTN(strOverrideHazardReason_TXT),
								strOverrideHazardReason_TXT, strOverrideHazardReasonFilterNeeded_TXT, strOverrideHazardReason_TXT,
								constants.NA, constants.NA, constants.NA, test);
						se.element().checkUncheckOrValidate(getCU_UmbOpt_ILProfLiab_CHK(strIL_ProfessionalLiab_CHK),strIL_ProfessionalLiab_CHK, test);
						se.element().checkUncheckOrValidate(getCU_UmbOpt_Primary_BlanketBasis_CHK(strPrimaryNonContributaryBlanketBasis_CHK),strPrimaryNonContributaryBlanketBasis_CHK, test);
						se.element().enterOrValidateText(getCU_UmbOpt_DefaultCharge_TXT(strDefaultCharge_TXT),strDefaultCharge_TXT, test);
						se.element().checkUncheckOrValidate(getCU_UmbOpt_Override_CHK(strOverride_CHK),strOverride_CHK, test);
						se.element().enterOrValidateText(getCU_UmbOpt_OverrideCharge_TXT(strOverrideCharge_TXT),strOverrideCharge_TXT, test);
						se.element().selectPopupWithMagnifier(
								getCU_UmbOpt_OverrideReason_TXT(strOverrideReason_TXT),
								getCU_UmbOpt_OverrideReason_Search_BTN(strOverrideReason_TXT),
								strOverrideReason_TXT, strOverrideReasonFilterNeeded_TXT, strOverrideReason_TXT,
								constants.NA, constants.NA, constants.NA, test);
						se.element().checkUncheckOrValidate(getCU_UmbOpt_Primary_ScheduleNameBasis_CHK(strPrimaryNonContributarySchNameBasis_CHK),strPrimaryNonContributarySchNameBasis_CHK, test);
						if(!strAddScheduleName_BTN.equals(constants.NA)){
							se.element().clickElement(getCU_UmbOpt_ScheduleNm_ADD_BTN(strAddScheduleName_BTN),test);
						}
						se.element().enterOrValidateText(getCU_UmbOpt_ScheduleName_TXTArea(strScheduleName1_TXT),strScheduleName1_TXT, test);
						se.element().enterOrValidateText(getCU_UmbOpt_ScheduleName_TXTArea2(strScheduleName2_TXT),strScheduleName2_TXT, test);
						se.element().enterOrValidateText(getCU_UmbOpt_ScheduleName_TXTArea3(strScheduleName3_TXT),strScheduleName3_TXT, test);
						se.element().checkUncheckOrValidate(getLimitedExclusionDesgOPerationsCovByAConsWrap_CHK(strLimitedExclusionDesgOPerationsCovByAConsWrap_CHK),strLimitedExclusionDesgOPerationsCovByAConsWrap_CHK, test);
				
	
							se.element().enterOrValidateText(getCU_UmbOpt_ProjectName1_TXT(strProjectName1_TXT),strProjectName1_TXT, test);
						if(!strProjectName2_TXT.equalsIgnoreCase("N/A")){
							se.element().Click(getAddProjectName_BTN(),test);
							se.element().enterOrValidateText(getCU_UmbOpt_ProjectName2_TXT(strProjectName2_TXT),strProjectName2_TXT, test);
						}
						if(!strProjectName3_TXT.equalsIgnoreCase("N/A")){
							se.element().Click(getAddProjectName_BTN(),test);
							se.element().enterOrValidateText(getCU_UmbOpt_ProjectName3_TXT(strProjectName3_TXT),strProjectName3_TXT, test);
						}
						se.element().Click(getNext(),test);
						
						if(se.element().isElementPresent(CU_UmbOpt_Warning_BTN_Yes)){
							se.element().Click(getCU_UmbOpt_Warning_BTN_Yes(), test);
							se.element().Click(getNext(),test);
						}
					} catch (Exception e) {
						se.verify().verifyEquals("Failed to fill in details for Umbrella Options Page ", true, false, true, test);
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

