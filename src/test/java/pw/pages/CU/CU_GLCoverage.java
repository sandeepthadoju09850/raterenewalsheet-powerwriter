package pw.pages.CU;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.OR.OR_CU;

public class CU_GLCoverage extends OR_CU {
	
	public void generalLiabPolicyCoverage(String strRegressionID, String transaction, String suspendSheet, ExtentTest test) throws IOException {
		try {
			
			if (suspendSheet.equalsIgnoreCase("GeneralLiabilityCoverage")) {
				test.log(LogStatus.INFO, "Page Suspended :- ", "Transaction Step : " + transaction + "<br>" + "Page : " + suspendSheet);
				testTearDown(se, test);
			}
			List<Map<String, String>> table = ExcelOperations.getPagesData("GeneralLiabilityCoverage", strRegressionID,transaction);
			int iteration = 0;
			while (iteration < table.size()) {
				LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strUnderlyingQuotePolicyNum_TXT = (String) row.get("UnderlyingQuotePolicyNum_TXT");
				String strEBL_EachEmployeeLimit_TXT = (String) row.get("EBL_EachEmployeeLimit_TXT");
				String strEBL_AggregateLimit_TXT = (String) row.get("EBL_AggregateLimit_TXT");
				String strEBL_RetroactiveDate_TXT = (String) row.get("EBL_RetroactiveDate_TXT");
				String strCondoDirectors_EachClaimLimit_TXT = (String) row.get("CondoDirectors_EachClaimLimit_TXT");
				String strCondoDirectors_AggregateLimit_TXT = (String) row.get("CondoDirectors_AggregateLimit_TXT");
				String strCondoDirectors_RetroactiveDate_TXT = (String) row.get("CondoDirectors_RetroactiveDate_TXT");
				String strAbuseAndMolestation_EachIncidentLimit_TXT = (String) row.get("AbuseAndMolestation_EachIncidentLimit_TXT");
				String strAbuseAndMolestation_AggregateLimit_TXT = (String) row.get("AbuseAndMolestation_AggregateLimit_TXT");
				String strHiredNonOenweAuto_EachOccureneceLimit_TXT = (String) row.get("HiredNonOenweAuto_EachOccureneceLimit_TXT");
				String strAtleastOneRailroadsNamed_CHK = (String) row.get("AtleastOneRailroadsNamed_CHK");
				String strContractualLiab_AtleastOneRailroadsNamed_CHK = (String) row.get("ContractualLiab_AtleastOneRailroadsNamed_CHK");
				String strLimitedContractualLiab_AtleastOneRailroadsNamed_CHK = (String) row.get("LimitedContractualLiab_AtleastOneRailroadsNamed_CHK");
				String strLiquorLiab_EachCommonCauseLimit_TXT = (String) row.get("LiquorLiab_EachCommonCauseLimit_TXT");
				String strLiquorLiab_AggregateLimit_TXT = (String) row.get("LiquorLiab_AggregateLimit_TXT");
				String strBoats_EachOccLimit_TXT = (String) row.get("Boats_EachOccLimit_TXT");
				String strBoats_AggregateLimit_TXT = (String) row.get("Boats_AggregateLimit_TXT");
				String strStopGapLiab_BodilyInjuryEachAccLimit_TXT = (String) row.get("StopGapLiab_BodilyInjuryEachAccLimit_TXT");
				String strStopGapLiab_BodilyInjuryDiseaseEachEmployeeLimit_TXT = (String) row.get("StopGapLiab_BodilyInjuryDiseaseEachEmployeeLimit_TXT");
				String strStopGapLiab_BodilyInjuryDiseaseAggregateLimit_TXT = (String) row.get("StopGapLiab_BodilyInjuryDiseaseAggregateLimit_TXT");
				String strDruggists_EachOccLimit_TXT = (String) row.get("Druggists_EachOccLimit_TXT");
				String strDruggists_ProdCompletedOperationsAggregateLimit_TXT = (String) row.get("Druggists_ProdCompletedOperationsAggregateLimit_TXT");
				String strFlorist_PerOccLimit_TXT = (String) row.get("Florist_PerOccLimit_TXT");
				String strFlorist_ProfessionalAggLimit_TXT = (String) row.get("Florist_ProfessionalAggLimit_TXT");
				String strOpticalAndHearing_EachOccLimit_TXT = (String) row.get("OpticalAndHearing_EachOccLimit_TXT");
				String strOpticalAndHearing_ProdCompletedOperationsAggregateLimit_TXT = (String) row.get("OpticalAndHearing_ProdCompletedOperationsAggregateLimit_TXT");
				String strFuneralDirectors_PerOccLimit_TXT = (String) row.get("FuneralDirectors_PerOccLimit_TXT");
				String strFuneralDirectors_ProfessionalAggLimit_TXT = (String) row.get("FuneralDirectors_ProfessionalAggLimit_TXT");
				String strPetProfessionalLiab_PerOccLimit_TXT = (String) row.get("PetProfessionalLiab_PerOccLimit_TXT");
				String strPetProfessionalLiab_ProfessionalAggLimit_TXT = (String) row.get("PetProfessionalLiab_ProfessionalAggLimit_TXT");
				String strPrintersErrors_PerOccLimit_TXT = (String) row.get("PrintersErrors_PerOccLimit_TXT");
				String strPrintersErrors_ProfessionalAggLimit_TXT = (String) row.get("PrintersErrors_ProfessionalAggLimit_TXT");
				String strSalonServices_PerOccLimit_TXT = (String) row.get("SalonServices_PerOccLimit_TXT");
				String strSalonServices_ProfessionalAggLimit_TXT = (String) row.get("SalonServices_ProfessionalAggLimit_TXT");
				String strVeterinariansProfLiab_PerOccLimit_TXT = (String) row.get("VeterinariansProfLiab_PerOccLimit_TXT");
				String strVeterinariansProfLiab_ProfessionalAggLimit_TXT = (String) row.get("VeterinariansProfLiab_ProfessionalAggLimit_TXT");
				String strLimitedExcDesgnOperations_EachOccLimit_TXT = (String) row.get("LimitedExcDesgnOperations_EachOccLimit_TXT");
				String strProfLiabSchedule_EachWrongfulActLimit_TXT = (String) row.get("ProfLiabSchedule_EachWrongfulActLimit_TXT");
				String strProfLiabSchedule_ProfessionalLiabAggLimit_TXT = (String) row.get("ProfLiabSchedule_ProfessionalLiabAggLimit_TXT");
				String strILProfLiabSchedule_EachWrongfulActLimit_TXT = (String) row.get("ILProfLiabSchedule_EachWrongfulActLimit_TXT");
				String strILProfLiabSchedule_ProfessionalLiabAggLimit_TXT = (String) row.get("ILProfLiabSchedule_ProfessionalLiabAggLimit_TXT");
				String strProfLiabSchCompanionCare_EachWrongfulActLimit_TXT = (String) row.get("ProfLiabSchCompanionCare_EachWrongfulActLimit_TXT");
				String strProfLiabSchCompanionCare_ProfessionalLiabAggLimit_TXT = (String) row.get("ProfLiabSchCompanionCare_ProfessionalLiabAggLimit_TXT");
				String strILProfLiabSchCompanionCare_EachWrongfulActLimit_TXT = (String) row.get("ILProfLiabSchCompanionCare_EachWrongfulActLimit_TXT");
				String strILProfLiabSchCompanionCare_ProfessionalLiabAggLimit_TXT = (String) row.get("ILProfLiabSchCompanionCare_ProfessionalLiabAggLimit_TXT");
				String strProfLiabSchFitness_EachWrongfulActLimit_TXT = (String) row.get("ProfLiabSchFitness_EachWrongfulActLimit_TXT");
				String strProfLiabSchFitness_ProfessionalLiabAggLimit_TXT = (String) row.get("ProfLiabSchFitness_ProfessionalLiabAggLimit_TXT");
				String strILProfLiabSchFitness_EachWrongfulActLimit_TXT = (String) row.get("ILProfLiabSchFitness_EachWrongfulActLimit_TXT");
				String strILProfLiabSchFitness_ProfessionalLiabAggLimit_TXT = (String) row.get("ILProfLiabSchFitness_ProfessionalLiabAggLimit_TXT");
				String strProfLiabSchProtection_EachWrongfulActLimit_TXT = (String) row.get("ProfLiabSchProtection_EachWrongfulActLimit_TXT");
				String strProfLiabSchProtection_ProfessionalLiabAggLimit_TXT = (String) row.get("ProfLiabSchProtection_ProfessionalLiabAggLimit_TXT");
				String strILProfLiabSchDetective_EachWrongfulActLimit_TXT = (String) row.get("ILProfLiabSchDetective_EachWrongfulActLimit_TXT");
				String strILProfLiabSchDetective_ProfessionalLiabAggLimit_TXT = (String) row.get("ILProfLiabSchDetective_ProfessionalLiabAggLimit_TXT");
				String strProfLiabSchSpecifiedProfession_EachWrongfulActLimit_TXT = (String) row.get("ProfLiabSchSpecifiedProfession_EachWrongfulActLimit_TXT");
				String strProfLiabSchSpecifiedProfession_ProfessionalLiabAggLimit_TXT = (String) row.get("ProfLiabSchSpecifiedProfession_ProfessionalLiabAggLimit_TXT");
				String strILProfLiabSchSpecifiedProfession_EachWrongfulActLimit_TXT = (String) row.get("ILProfLiabSchSpecifiedProfession_EachWrongfulActLimit_TXT");
				String strILProfLiabSchSpecifiedProfession_ProfessionalLiabAggLimit_TXT = (String) row.get("ILProfLiabSchSpecifiedProfession_ProfessionalLiabAggLimit_TXT");
				String strHumanServices_EachClaimLimit_TXT = (String) row.get("HumanServices_EachClaimLimit_TXT");
				String strHumanServices_AggregateLimit_TXT = (String) row.get("HumanServices_AggregateLimit_TXT");
				String strHumanServices_RetroactiveDate_TXT = (String) row.get("HumanServices_RetroactiveDate_TXT");
				String strILHumanServices_EachClaimLimit_TXT = (String) row.get("ILHumanServices_EachClaimLimit_TXT");
				String strILHumanServices_AggregateLimit_TXT = (String) row.get("ILHumanServices_AggregateLimit_TXT");
				String strILHumanServices_RetroactiveDate_TXT = (String) row.get("ILHumanServices_RetroactiveDate_TXT");
				String strCompanionCareProfLiabSch_EachClaimLimit_TXT = (String) row.get("CompanionCareProfLiabSch_EachClaimLimit_TXT");
				String strCompanionCareProfLiabSch_AggregateLimit_TXT = (String) row.get("CompanionCareProfLiabSch_AggregateLimit_TXT");
				String strCompanionCareProfLiabSch_RetroactiveDate_TXT = (String) row.get("CompanionCareProfLiabSch_RetroactiveDate_TXT");
				String strILCompanionCareProfLiabSch_EachClaimLimit_TXT = (String) row.get("ILCompanionCareProfLiabSch_EachClaimLimit_TXT");
				String strILCompanionCareProfLiabSch_AggregateLimit_TXT = (String) row.get("ILCompanionCareProfLiabSch_AggregateLimit_TXT");
				String strILCompanionCareProfLiabSch_RetroactiveDate_TXT = (String) row.get("ILCompanionCareProfLiabSch_RetroactiveDate_TXT");
				
				try {
					se.log().logTestStep("Entering details on General Liability Coverage Page");
					test.log(LogStatus.INFO, "Entering details on General Liability Coverage Page", "Transaction Step : " + transaction + "<br>" + "Page : General Liability Coverage Page");
					se.verify().verifyEquals("General Liability Policy Info Page displayed", getPagecontainingtext("General Liability Coverage Information").isDisplayed(),true, true, test);
					
					se.element().enterOrValidateText(getCU_GLCovInfo_UnderlyingQuoteNo_TXT(strUnderlyingQuotePolicyNum_TXT), strUnderlyingQuotePolicyNum_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_EBL_EachEmployeeLimit_TXT(strEBL_EachEmployeeLimit_TXT), strEBL_EachEmployeeLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_EBL_AggLimit_TXT(strEBL_AggregateLimit_TXT), strEBL_AggregateLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_EBL_RetroactiveDate_TXT(strEBL_RetroactiveDate_TXT), strEBL_RetroactiveDate_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_CDOL_EachClaimLimit_TXT(strCondoDirectors_EachClaimLimit_TXT), strCondoDirectors_EachClaimLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_CDOL_AggLimit_TXT(strCondoDirectors_AggregateLimit_TXT), strCondoDirectors_AggregateLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_CDOL_RetroactiveDate_TXT(strCondoDirectors_RetroactiveDate_TXT), strCondoDirectors_RetroactiveDate_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_AM_EachIncidentLimit_TXT(strAbuseAndMolestation_EachIncidentLimit_TXT), strAbuseAndMolestation_EachIncidentLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_AM_AggLimit_TXT(strAbuseAndMolestation_AggregateLimit_TXT), strAbuseAndMolestation_AggregateLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_HNO_EachOccurenceLimit_TXT(strHiredNonOenweAuto_EachOccureneceLimit_TXT), strHiredNonOenweAuto_EachOccureneceLimit_TXT, test);
					se.element().checkUncheckOrValidate(getCU_GLCovInfo_CON_AtLeastOneRailRdNamed_CHK(strContractualLiab_AtleastOneRailroadsNamed_CHK), strContractualLiab_AtleastOneRailroadsNamed_CHK, test);
					se.element().checkUncheckOrValidate(getCU_GLCovInfo_LMD_AtLeastOneRailRdNamed_CHK(strLimitedContractualLiab_AtleastOneRailroadsNamed_CHK), strLimitedContractualLiab_AtleastOneRailroadsNamed_CHK, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_LL_EachCommCauseLimit_TXT(strLiquorLiab_EachCommonCauseLimit_TXT), strLiquorLiab_EachCommonCauseLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_LL_AggLimit_TXT(strLiquorLiab_AggregateLimit_TXT), strLiquorLiab_AggregateLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_Boats_EachOccurenceLimit_TXT(strBoats_EachOccLimit_TXT), strBoats_EachOccLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_Boats_AggLimit_TXT(strBoats_AggregateLimit_TXT), strBoats_AggregateLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_SG_BIEachAcciLmt_TXT(strStopGapLiab_BodilyInjuryEachAccLimit_TXT), strStopGapLiab_BodilyInjuryEachAccLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_SG_BIEachEmpLmt_TXT(strStopGapLiab_BodilyInjuryDiseaseEachEmployeeLimit_TXT), strStopGapLiab_BodilyInjuryDiseaseEachEmployeeLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_SG_BIAggLimit_TXT(strStopGapLiab_BodilyInjuryDiseaseAggregateLimit_TXT), strStopGapLiab_BodilyInjuryDiseaseAggregateLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_Drug_EachOccurenceLimit_TXT(strDruggists_EachOccLimit_TXT), strDruggists_EachOccLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_Drug_AggLimit_TXT(strDruggists_ProdCompletedOperationsAggregateLimit_TXT), strDruggists_ProdCompletedOperationsAggregateLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_FPL_PerOccurenceLimit_TXT(strFlorist_PerOccLimit_TXT), strFlorist_PerOccLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_FPL_AggLimit_TXT(strFlorist_ProfessionalAggLimit_TXT), strFlorist_ProfessionalAggLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_OHAE_EachOccurenceLimit_TXT(strOpticalAndHearing_EachOccLimit_TXT), strOpticalAndHearing_EachOccLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_OHAE_AggLimit_TXT(strOpticalAndHearing_ProdCompletedOperationsAggregateLimit_TXT), strOpticalAndHearing_ProdCompletedOperationsAggregateLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_FDCPL_PerOccurenceLimit_TXT(strFuneralDirectors_PerOccLimit_TXT), strFuneralDirectors_PerOccLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_FDCPL_AggLimit_TXT(strFuneralDirectors_ProfessionalAggLimit_TXT), strFuneralDirectors_ProfessionalAggLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_PPL_PerOccurenceLimit_TXT(strPetProfessionalLiab_PerOccLimit_TXT), strPetProfessionalLiab_PerOccLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_PPL_AggLimit_TXT(strPetProfessionalLiab_ProfessionalAggLimit_TXT), strPetProfessionalLiab_ProfessionalAggLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_PEO_PerOccurenceLimit_TXT(strPrintersErrors_PerOccLimit_TXT), strPrintersErrors_PerOccLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_PEO_AggLimit_TXT(strPrintersErrors_ProfessionalAggLimit_TXT), strPrintersErrors_ProfessionalAggLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_SSPL_PerOccurenceLimit_TXT(strSalonServices_PerOccLimit_TXT), strSalonServices_PerOccLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_SSPL_AggLimit_TXT(strSalonServices_ProfessionalAggLimit_TXT), strSalonServices_ProfessionalAggLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_VPL_PerOccurenceLimit_TXT(strVeterinariansProfLiab_PerOccLimit_TXT), strVeterinariansProfLiab_PerOccLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_VPL_AggLimit_TXT(strVeterinariansProfLiab_ProfessionalAggLimit_TXT), strVeterinariansProfLiab_ProfessionalAggLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_LE_DOC_EachOccurenceLimit_TXT(strLimitedExcDesgnOperations_EachOccLimit_TXT), strLimitedExcDesgnOperations_EachOccLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_PLS_HS_EachLimit_TXT(strProfLiabSchedule_EachWrongfulActLimit_TXT), strProfLiabSchedule_EachWrongfulActLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_PLS_HS_AggLimit_TXT(strProfLiabSchedule_ProfessionalLiabAggLimit_TXT), strProfLiabSchedule_ProfessionalLiabAggLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_ILPLS_HS_EachLimit_TXT(strILProfLiabSchedule_EachWrongfulActLimit_TXT), strILProfLiabSchedule_EachWrongfulActLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_ILPLS_HS_AggLimit_TXT(strILProfLiabSchedule_ProfessionalLiabAggLimit_TXT), strILProfLiabSchedule_ProfessionalLiabAggLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_PLS_CC_EachLimit_TXT(strProfLiabSchCompanionCare_EachWrongfulActLimit_TXT), strProfLiabSchCompanionCare_EachWrongfulActLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_PLS_CC_AggLimit_TXT(strProfLiabSchCompanionCare_ProfessionalLiabAggLimit_TXT), strProfLiabSchCompanionCare_ProfessionalLiabAggLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_ILPLS_CC_EachLimit_TXT(strILProfLiabSchCompanionCare_EachWrongfulActLimit_TXT), strILProfLiabSchCompanionCare_EachWrongfulActLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_ILPLS_CC_AggLimit_TXT(strILProfLiabSchCompanionCare_ProfessionalLiabAggLimit_TXT), strILProfLiabSchCompanionCare_ProfessionalLiabAggLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_PLS_FRF_EachLimit_TXT(strProfLiabSchFitness_EachWrongfulActLimit_TXT), strProfLiabSchFitness_EachWrongfulActLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_PLS_FRF_AggLimit_TXT(strProfLiabSchFitness_ProfessionalLiabAggLimit_TXT), strProfLiabSchFitness_ProfessionalLiabAggLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_EachWrongfulActLimit_TXT(strILProfLiabSchFitness_EachWrongfulActLimit_TXT), strILProfLiabSchFitness_EachWrongfulActLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_ProfLiabAggLimit_TXT(strILProfLiabSchFitness_ProfessionalLiabAggLimit_TXT), strILProfLiabSchFitness_ProfessionalLiabAggLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_PLS_PS_EachLimit_TXT(strProfLiabSchProtection_EachWrongfulActLimit_TXT), strProfLiabSchProtection_EachWrongfulActLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_PLS_PS_AggLimit_TXT(strProfLiabSchProtection_ProfessionalLiabAggLimit_TXT), strProfLiabSchProtection_ProfessionalLiabAggLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_ILPLS_DS_EachLimit_TXT(strILProfLiabSchDetective_EachWrongfulActLimit_TXT), strILProfLiabSchDetective_EachWrongfulActLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_ILPLS_DS_AggLimit_TXT(strILProfLiabSchDetective_ProfessionalLiabAggLimit_TXT), strILProfLiabSchDetective_ProfessionalLiabAggLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_PLS_SP_EachLimit_TXT(strProfLiabSchSpecifiedProfession_EachWrongfulActLimit_TXT), strProfLiabSchSpecifiedProfession_EachWrongfulActLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_PLS_SP_AggLimit_TXT(strProfLiabSchSpecifiedProfession_ProfessionalLiabAggLimit_TXT), strProfLiabSchSpecifiedProfession_ProfessionalLiabAggLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_ILPLS_SP_EachLimit_TXT(strILProfLiabSchSpecifiedProfession_EachWrongfulActLimit_TXT), strILProfLiabSchSpecifiedProfession_EachWrongfulActLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_ILPLS_SP_AggLimit_TXT(strILProfLiabSchSpecifiedProfession_ProfessionalLiabAggLimit_TXT), strILProfLiabSchSpecifiedProfession_ProfessionalLiabAggLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_HSPLS_CM_EachLimit_TXT(strHumanServices_EachClaimLimit_TXT), strHumanServices_EachClaimLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_HSPLS_CM_AggLimit_TXT(strHumanServices_AggregateLimit_TXT), strHumanServices_AggregateLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_HSPLS_CM_RetroactiveDate_TXT(strHumanServices_RetroactiveDate_TXT), strHumanServices_RetroactiveDate_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_ILHSPLS_CM_EachLimit_TXT(strILHumanServices_EachClaimLimit_TXT), strILHumanServices_EachClaimLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_ILHSPLS_CM_AggLimit_TXT(strILHumanServices_AggregateLimit_TXT), strILHumanServices_AggregateLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_ILHSPLS_CM_RetroactiveDate_TXT(strILHumanServices_RetroactiveDate_TXT), strILHumanServices_RetroactiveDate_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_CCPLS_CM_EachLimit_TXT(strCompanionCareProfLiabSch_EachClaimLimit_TXT), strCompanionCareProfLiabSch_EachClaimLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_CCPLS_CM_AggLimit_TXT(strCompanionCareProfLiabSch_AggregateLimit_TXT), strCompanionCareProfLiabSch_AggregateLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_CCPLS_CM_RetroactiveDate_TXT(strCompanionCareProfLiabSch_RetroactiveDate_TXT), strCompanionCareProfLiabSch_RetroactiveDate_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_ILCCPLS_CM_EachLimit_TXT(strILCompanionCareProfLiabSch_EachClaimLimit_TXT), strILCompanionCareProfLiabSch_EachClaimLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_ILCCPLS_CM_AggLimit_TXT(strILCompanionCareProfLiabSch_AggregateLimit_TXT), strILCompanionCareProfLiabSch_AggregateLimit_TXT, test);
					se.element().enterOrValidateText(getCU_GLCovInfo_ILCCPLS_CM_RetroactiveDate_TXT(strILCompanionCareProfLiabSch_RetroactiveDate_TXT), strILCompanionCareProfLiabSch_RetroactiveDate_TXT, test);
					
				} catch (Exception e) {
					se.verify().verifyEquals("Failed to fill in details for CU_GL Policy Coverage Page ", true, false, true, test);
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