package ap.pages.CA;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.BL_OR_CP;

public class CA_PolicyCoverages extends BL_OR_CP {


	public void CA_PolicyCoverages_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.PolicyCoverages)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.PolicyCoverages, strRegressionID, transaction);
		int iteration = 0;

		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strPolicyCoverages_BTN_Edit = (String) row.get("PolicyCoverages_BTN_Edit");
			String strPolicyCoverages_BTN_NoEdit = (String) row.get("PolicyCoverages_BTN_NoEdit");
			String strPolicyCoverages_BTN_Edit_Loc= (String) row.get("PolicyCoverages_BTN_Edit_Loc");
			String strPolicyCoverages_CHK_IncludeSecuraAutoWRAP= (String) row.get("PolicyCoverages_CHK_IncludeSecuraAutoWRAP");
			String strPolicyCoverages_Label_State= (String) row.get("PolicyCoverages_Label_State");
			String strPolicyCoverages_DD_CombinedSingleLimit= (String) row.get("PolicyCoverages_DD_CombinedSingleLimit");
			String strPolicyCoverages_CHK_PropertyDamage_Deduc= (String) row.get("PolicyCoverages_CHK_PropertyDamage_Deduc");
			String strPolicyCoverages_DD_PropertyDamageDeducAmt= (String) row.get("PolicyCoverages_DD_PropertyDamageDeducAmt");
			String strPolicyCoverages_CHK_MedicalPayment= (String) row.get("PolicyCoverages_CHK_MedicalPayment");
			String strPolicyCoverages_DD_LimitEachperson= (String) row.get("PolicyCoverages_DD_LimitEachperson");
			String strPolicyCoverages_CHK_UnInsuredMotorist= (String) row.get("PolicyCoverages_CHK_UnInsuredMotorist");
			String strPolicyCoverages_DD_UnInsuredMotoristLimit= (String) row.get("PolicyCoverages_DD_UnInsuredMotoristLimit");
			String strPolicyCoverages_CHK_UnderInsuredMotorist= (String) row.get("PolicyCoverages_CHK_UnderInsuredMotorist");
			String strPolicyCoverages_Label_UnderInsuredMotoristLimit= (String) row.get("PolicyCoverages_Label_UnderInsuredMotoristLimit");
			String strPolicyCoverages_CHK_FullGlassCoverage= (String) row.get("PolicyCoverages_CHK_FullGlassCoverage");
			String strPolicyCoverages_CHK_HiredAutoCvg= (String) row.get("PolicyCoverages_CHK_HiredAutoCvg");
			String strPolicyCoverages_TXT_HiredAutoZip= (String) row.get("PolicyCoverages_TXT_HiredAutoZip");
			String strPolicyCoverages_CHK_AnyRating= (String) row.get("PolicyCoverages_CHK_AnyRating");
			String strPolicyCoverages_TXT_CostHire= (String) row.get("PolicyCoverages_TXT_CostHire");
			String strPolicyCoverages_CHK_Excess= (String) row.get("PolicyCoverages_CHK_Excess");
			String strPolicyCoverages_CHK_Primary= (String) row.get("PolicyCoverages_CHK_Primary");
			String strPolicyCoverages_DD_HiredAutoCollision= (String) row.get("PolicyCoverages_DD_HiredAutoCollision");
			String strPolicyCoverages_DD_HiredAutoComp= (String) row.get("PolicyCoverages_DD_HiredAutoComp");
			String strPolicyCoverages_CHK_NonOwnedAuto= (String) row.get("PolicyCoverages_CHK_NonOwnedAuto");
			String strPolicyCoverages_TX_NonOwnedZip= (String) row.get("PolicyCoverages_TXT_NonOwnedZip");
			String strPolicyCoverages_DD_TypeofCoverage= (String) row.get("PolicyCoverages_DD_TypeofCoverage");
			String strPolicyCoverages_TXT_totalNoEmp= (String) row.get("PolicyCoverages_TXT_totalNoEmp");
			String strPolicyCoverages_CHK_ExtendCoverage= (String) row.get("PolicyCoverages_CHK_ExtendCoverage");
			String strPolicyCoverages_CHK_Driveothercar= (String) row.get("PolicyCoverages_CHK_Driveothercar");
			String strPolicyCoverages_DD_CompCvgr= (String) row.get("PolicyCoverages_DD_CompCvg");
			String strPolicyCoverages_DD_ColliCvg= (String) row.get("PolicyCoverages_DD_ColliCvg");
			String strPolicyCoverages_TXT_HiredPhysicalDamage= (String) row.get("PolicyCoverages_TXT_HiredPhysicalDamage");
			String strPolicyCoverages_Label_UnInsuredMotoristLimit= (String) row.get("PolicyCoverages_Label_UnInsuredMotoristLimit");
			String strPolicyCoverages_CHK_IncludePropertyDamage= (String) row.get("PolicyCoverages_CHK_IncludePropertyDamage");
			String strPolicyCoverages_Label_TortLimitationSelection=(String) row.get("PolicyCoverages_Label_TortLimitationSelection");
			String strPolicyCoverages_Label_PersonalInjuryProtection= (String) row.get("PolicyCoverages_Label_PersonalInjuryProtection");
			String strPolicyCoverages_DD_ExcessCoverage= (String) row.get("PolicyCoverages_DD_ExcessCoverage");
			String strPolicyCoverages_DD_PropProtectionInsDed= (String) row.get("PolicyCoverages_DD_PropProtectionInsDed");
			String strPolicyCoverages_CHK_BroadenedPIP= (String) row.get("PolicyCoverages_CHK_BroadenedPIP");
			String strPolicyCoverages_DD_InsuredCovStatus= (String) row.get("PolicyCoverages_DD_InsuredCovStatus");
			String strPolicyCoverages_DD_SpouseResRelCov= (String) row.get("PolicyCoverages_DD_SpouseResRelCov");
			String strPolicyCoverages_CHK_MedExpenseBenefit= (String) row.get("PolicyCoverages_CHK_MedExpenseBenefit");
			String strPolicyCoverages_DD_MedExpBenLimit= (String) row.get("PolicyCoverages_DD_MedExpBenLimit");
			String strPolicyCoverages_CHK_ExcessAttendCare= (String) row.get("PolicyCoverages_CHK_ExcessAttendCare");
			String strPolicyCoverages_DD_UnInsMotorPropDamLimit= (String) row.get("PolicyCoverages_DD_UnInsMotorPropDamLimit");
			String strPolicyCoverages_CHK_AddtlPIP= (String) row.get("PolicyCoverages_CHK_AddtlPIP");
			String strPolicyCoverages_DD_Option= (String) row.get("PolicyCoverages_DD_Option");
			String strPolicyCoverages_CHK_AreDriversCovByWC_Yes= (String) row.get("PolicyCoverages_CHK_AreDriversCovByWC_Yes");
			String strPolicyCoverages_CHK_AreDriversCovByWC_No= (String) row.get("PolicyCoverages_CHK_AreDriversCovByWC_No");
			String strPolicyCoverages_CHK_UnInsMotorPropDamDeduct_300= (String) row.get("PolicyCoverages_CHK_UnInsMotorPropDamDeduct_300");
			String strPolicyCoverages_CHK_UnInsMotorPropDamDeduct_Full= (String) row.get("PolicyCoverages_CHK_UnInsMotorPropDamDeduct_Full");
			String strPolicyCoverages_CHK_PropDamLiaBuybackCov= (String) row.get("PolicyCoverages_CHK_PropDamLiaBuybackCov");
			String strPolicyCoverages_CHK_StackedCov= (String) row.get("PolicyCoverages_CHK_StackedCov");
			String strPolicyCoverages_DD_PIPDeductCov= (String) row.get("PolicyCoverages_DD_PIPDeductCov");
			String strPolicyCoverages_DD_PIPExcluWorkLossBenefits= (String) row.get("PolicyCoverages_DD_PIPExcluWorkLossBenefits");
			String strPolicyCoverages_DD_UnInsMotorStackCov= (String) row.get("PolicyCoverages_DD_UnInsMotorStackCov");
			String strPolicyCoverages_DD_UnderInsStackCov= (String) row.get("PolicyCoverages_DD_UnderInsStackCov");
			String strPolicyCoverages_CHK_BasicFirstPartyCov= (String) row.get("PolicyCoverages_CHK_BasicFirstPartyCov");
			String strPolicyCoverages_CHK_ExtraOrdMedBenefit= (String) row.get("PolicyCoverages_CHK_ExtraOrdMedBenefit");
			String strPolicyCoverages_DD_ExtraOrdMedBenefitLimit= (String) row.get("PolicyCoverages_DD_ExtraOrdMedBenefitLimit");
			String strPolicyCoverages_CHK_AddCombFirstPartyBenefit= (String) row.get("PolicyCoverages_CHK_AddCombFirstPartyBenefit");
			String strPolicyCoverages_CHK_FirstPartyBenefit_Added= (String) row.get("PolicyCoverages_CHK_FirstPartyBenefit_Added");
			String strPolicyCoverages_CHK_FirstPartyBenefit_Comb= (String) row.get("PolicyCoverages_CHK_FirstPartyBenefit_Comb");
			String strPolicyCoverages_DD_BFPB_AddMedExpBenefit= (String) row.get("PolicyCoverages_DD_BFPB_AddMedExpBenefit");
			String strPolicyCoverages_DD_BFPB_AddWorkLossMonthLimit= (String) row.get("PolicyCoverages_DD_BFPB_AddWorkLossMonthLimit");
			String strPolicyCoverages_DD_BFPB_AddWorkLossTotLimit= (String) row.get("PolicyCoverages_DD_BFPB_AddWorkLossTotLimit");
			String strPolicyCoverages_DD_BFPB_AddFuneralExpBenefit= (String) row.get("PolicyCoverages_DD_BFPB_AddFuneralExpBenefit");
			String strPolicyCoverages_DD_BFPB_AddAccDeathbenefit= (String) row.get("PolicyCoverages_DD_BFPB_AddAccDeathbenefit");
			
			try {
				se.log().logTestStep("CA_PolicyCoverages");
				test.log(LogStatus.INFO, "CA_PolicyCoverages","Transaction Step : "+transaction + "<br>" +"Page : CA_PolicyCoverages");
				//se.verify().verifyEquals("CA_PolicyCoverages  of AgencyPortal ", getMenuLnkPolicyCoverages().isDisplayed(),true, true,test);
				if(strPolicyCoverages_BTN_Edit.contains("Edit")||strPolicyCoverages_BTN_NoEdit.contains("Yes"))
				{
					
					se.element().Click(getPolicyCoverages_BTN_Edit(strPolicyCoverages_BTN_Edit_Loc), test);
					se.element().checkUncheckOrValidate(getPCCIIncludeAutoWrapCov(strPolicyCoverages_CHK_IncludeSecuraAutoWRAP),strPolicyCoverages_CHK_IncludeSecuraAutoWRAP,test);
					se.element().enterOrValidateText(getPolicyCoverages_Label_State(strPolicyCoverages_Label_State),strPolicyCoverages_Label_State,test);
					se.element().SelectElement(PC_LC_dd_combineSingleLimit,strPolicyCoverages_DD_CombinedSingleLimit,test);
					se.element().checkUncheckOrValidate(getPolicyCoverages_CHK_PropDamLiaBuybackCov(strPolicyCoverages_CHK_PropDamLiaBuybackCov),strPolicyCoverages_CHK_PropDamLiaBuybackCov,test);
					se.element().checkUncheckOrValidate(getPCLCPropertyDamageLiabilityDeductibleCheck(strPolicyCoverages_CHK_PropertyDamage_Deduc),strPolicyCoverages_CHK_PropertyDamage_Deduc,test);
					se.element().SelectElement(PC_LC_DD_PropertyDamageLiablityDeductibleAmount,strPolicyCoverages_DD_PropertyDamageDeducAmt,test);
					se.element().checkUncheckOrValidate(getPCMPCheck(strPolicyCoverages_CHK_MedicalPayment),strPolicyCoverages_CHK_MedicalPayment,test);
					se.element().SelectElement(PC_MP_dd_MedicalPaymentLimitEachPerson,strPolicyCoverages_DD_LimitEachperson,test);
					se.element().checkUncheckOrValidate(getPCUninsuredMotorist(strPolicyCoverages_CHK_UnInsuredMotorist),strPolicyCoverages_CHK_UnInsuredMotorist,test);
					se.element().SelectElement(PC_dd_UninsuredMotoristCSLLimit,strPolicyCoverages_DD_UnInsuredMotoristLimit,test);
					se.element().checkUncheckOrValidate(getPCUninsuredMotorist(strPolicyCoverages_CHK_UnInsuredMotorist),strPolicyCoverages_CHK_UnInsuredMotorist,test);
					se.element().SelectElement(PC_dd_UninsuredMotoristCSLLimit,strPolicyCoverages_DD_UnInsuredMotoristLimit,test);
					se.element().SelectElement(PolicyCoverages_DD_UnInsMotorStackCov, strPolicyCoverages_DD_UnInsMotorStackCov, test);
					se.element().enterOrValidateText(getPolicyCoverages_Label_UnInsuredMotoristLimit(strPolicyCoverages_Label_UnInsuredMotoristLimit),strPolicyCoverages_Label_UnInsuredMotoristLimit,test);
					se.element().checkUncheckOrValidate(getPolicyCoverages_CHK_IncludePropertyDamage(strPolicyCoverages_CHK_IncludePropertyDamage),strPolicyCoverages_CHK_IncludePropertyDamage,test);
					se.element().SelectElement(PolicyCoverages_DD_UnInsMotorPropDamLimit, strPolicyCoverages_DD_UnInsMotorPropDamLimit, test);
					se.element().checkUncheckOrValidate(getPolicyCoverages_CHK_UnInsMotorPropDamDeduct_300(strPolicyCoverages_CHK_UnInsMotorPropDamDeduct_300),strPolicyCoverages_CHK_UnInsMotorPropDamDeduct_300,test);
					se.element().checkUncheckOrValidate(getPolicyCoverages_CHK_UnInsMotorPropDamDeduct_Full(strPolicyCoverages_CHK_UnInsMotorPropDamDeduct_Full),strPolicyCoverages_CHK_UnInsMotorPropDamDeduct_Full,test);
					se.element().checkUncheckOrValidate(getPCUnderinsuredMotorist(strPolicyCoverages_CHK_UnderInsuredMotorist),strPolicyCoverages_CHK_UnderInsuredMotorist,test);
					se.element().enterOrValidateText(getPCUnderinsuredMotoristLimitReadonly(strPolicyCoverages_Label_UnderInsuredMotoristLimit),strPolicyCoverages_Label_UnderInsuredMotoristLimit,test);
					se.element().SelectElement(PolicyCoverages_DD_UnderInsStackCov, strPolicyCoverages_DD_UnderInsStackCov, test);
					se.element().checkUncheckOrValidate(getPolicyCoverages_CHK_FullGlassCoverage(strPolicyCoverages_CHK_FullGlassCoverage), strPolicyCoverages_CHK_FullGlassCoverage, test);
					se.element().SelectElement(PolicyCoverages_Label_TortLimitationSelection,strPolicyCoverages_Label_TortLimitationSelection,test);
					se.element().checkUncheckOrValidate(getPolicyCoverages_CHK_AreDriversCovByWC_Yes(strPolicyCoverages_CHK_AreDriversCovByWC_Yes),strPolicyCoverages_CHK_AreDriversCovByWC_Yes,test);
					se.element().checkUncheckOrValidate(getPolicyCoverages_CHK_AreDriversCovByWC_No(strPolicyCoverages_CHK_AreDriversCovByWC_No),strPolicyCoverages_CHK_AreDriversCovByWC_No,test);
					se.element().enterOrValidateText(getPolicyCoverages_Label_PersonalInjuryProtection(strPolicyCoverages_Label_PersonalInjuryProtection),strPolicyCoverages_Label_PersonalInjuryProtection,test);
					se.element().checkUncheckOrValidate(getPolicyCoverages_CHK_StackedCov(strPolicyCoverages_CHK_StackedCov), strPolicyCoverages_CHK_StackedCov, test);
					se.element().SelectElement(PolicyCoverages_DD_PIPDeductCov, strPolicyCoverages_DD_PIPDeductCov, test);
					se.element().SelectElement(PolicyCoverages_DD_PIPExcluWorkLossBenefits, strPolicyCoverages_DD_PIPExcluWorkLossBenefits, test);
					se.element().SelectElement(PolicyCoverages_DD_InsuredCovStatus, strPolicyCoverages_DD_InsuredCovStatus, test);
					se.element().SelectElement(PolicyCoverages_DD_SpouseResRelCov, strPolicyCoverages_DD_SpouseResRelCov, test);
					se.element().checkUncheckOrValidate(getPolicyCoverages_CHK_MedExpenseBenefit(strPolicyCoverages_CHK_MedExpenseBenefit),strPolicyCoverages_CHK_MedExpenseBenefit,test);
					se.element().SelectElement(PolicyCoverages_DD_MedExpBenLimit, strPolicyCoverages_DD_MedExpBenLimit, test);
					se.element().checkUncheckOrValidate(getPolicyCoverages_CHK_ExcessAttendCare(strPolicyCoverages_CHK_ExcessAttendCare), strPolicyCoverages_CHK_ExcessAttendCare, test);
					se.element().SelectElement(PolicyCoverages_DD_ExcessCoverage,strPolicyCoverages_DD_ExcessCoverage,test);
					se.element().SelectElement(PolicyCoverages_DD_PropProtectionInsDed,strPolicyCoverages_DD_PropProtectionInsDed,test);
					se.element().checkUncheckOrValidate(getPolicyCoverages_CHK_BroadenedPIP(strPolicyCoverages_CHK_BroadenedPIP),strPolicyCoverages_CHK_BroadenedPIP,test);
					se.element().checkUncheckOrValidate(getPolicyCoverages_CHK_AddtlPIP(strPolicyCoverages_CHK_AddtlPIP),strPolicyCoverages_CHK_AddtlPIP,test);
					se.element().SelectElement(PolicyCoverages_DD_Option, strPolicyCoverages_DD_Option, test);
					se.element().checkUncheckOrValidate(getPolicyCoverages_CHK_BasicFirstPartyCov(strPolicyCoverages_CHK_BasicFirstPartyCov),strPolicyCoverages_CHK_BasicFirstPartyCov,test);
					if(strPolicyCoverages_CHK_BasicFirstPartyCov.equalsIgnoreCase("Check")){
						
						se.element().checkUncheckOrValidate(getPolicyCoverages_CHK_ExtraOrdMedBenefit(strPolicyCoverages_CHK_ExtraOrdMedBenefit),strPolicyCoverages_CHK_ExtraOrdMedBenefit,test);
						se.element().SelectElement(PolicyCoverages_DD_ExtraOrdMedBenefitLimit, strPolicyCoverages_DD_ExtraOrdMedBenefitLimit, test);
						se.element().checkUncheckOrValidate(getPolicyCoverages_CHK_AddCombFirstPartyBenefit(strPolicyCoverages_CHK_AddCombFirstPartyBenefit),strPolicyCoverages_CHK_AddCombFirstPartyBenefit,test);
						se.element().checkUncheckOrValidate(getPolicyCoverages_CHK_FirstPartyBenefit_Added(strPolicyCoverages_CHK_FirstPartyBenefit_Added),strPolicyCoverages_CHK_FirstPartyBenefit_Added,test);
						se.element().checkUncheckOrValidate(getPolicyCoverages_CHK_FirstPartyBenefit_Comb(strPolicyCoverages_CHK_FirstPartyBenefit_Comb),strPolicyCoverages_CHK_FirstPartyBenefit_Comb,test);
						se.element().SelectElement(PolicyCoverages_DD_BFPB_AddMedExpBenefit, strPolicyCoverages_DD_BFPB_AddMedExpBenefit, test);
						se.element().SelectElement(PolicyCoverages_DD_BFPB_AddWorkLossMonthLimit, strPolicyCoverages_DD_BFPB_AddWorkLossMonthLimit, test);
						se.element().SelectElement(PolicyCoverages_DD_BFPB_AddWorkLossTotLimit, strPolicyCoverages_DD_BFPB_AddWorkLossTotLimit, test);
						se.element().SelectElement(PolicyCoverages_DD_BFPB_AddFuneralExpBenefit, strPolicyCoverages_DD_BFPB_AddFuneralExpBenefit, test);
						se.element().SelectElement(PolicyCoverages_DD_BFPB_AddAccDeathbenefit, strPolicyCoverages_DD_BFPB_AddAccDeathbenefit, test);
						
						se.element().SelectElement(PolicyCoverages_DD_Option, strPolicyCoverages_DD_Option, test);
					}
					se.element().checkUncheckOrValidate(getPCHiredAutoCoverage(strPolicyCoverages_CHK_HiredAutoCvg),strPolicyCoverages_CHK_HiredAutoCvg,test);
					if(strPolicyCoverages_CHK_HiredAutoCvg.equalsIgnoreCase("Check")){
						
						se.element().SelectElement(PC_dd_HiredAutoZipCode,strPolicyCoverages_TXT_HiredAutoZip,test);
						se.element().checkUncheckOrValidate(getPCHiredAutoIfAnyRatingBasis(strPolicyCoverages_CHK_AnyRating),strPolicyCoverages_CHK_AnyRating,test);
						se.element().enterOrValidateText(getPCHiredAutoTotalCostOfHire(strPolicyCoverages_TXT_CostHire),strPolicyCoverages_TXT_CostHire,test);
						se.element().checkUncheckOrValidate(getPC_CHK_CVGTypeExcess(strPolicyCoverages_CHK_Excess),strPolicyCoverages_CHK_Excess,test);
						se.element().checkUncheckOrValidate(getPC_CHK_CVGTypePrimary(strPolicyCoverages_CHK_Primary),strPolicyCoverages_CHK_Primary,test);
						se.element().SelectElement(PC_dd_HiredAutoCollisionDeductible,strPolicyCoverages_DD_HiredAutoCollision,test);
						se.element().SelectElement(PC_dd_HiredAutoComprehensiveDeductible,strPolicyCoverages_DD_HiredAutoComp,test);
						se.element().enterOrValidateText(getPCHiredAutoPhysicalDamageMaxLimit(strPolicyCoverages_TXT_HiredPhysicalDamage),strPolicyCoverages_TXT_HiredPhysicalDamage,test);
					}
					se.element().checkUncheckOrValidate(getPCNOANonOwnedAutoCoverage(strPolicyCoverages_CHK_NonOwnedAuto),strPolicyCoverages_CHK_NonOwnedAuto,test);
					if(strPolicyCoverages_CHK_NonOwnedAuto.equalsIgnoreCase("Check")){
					se.element().SelectElement(PC_dd_NonOwnedAutoZipCode,strPolicyCoverages_TX_NonOwnedZip,test);
					se.element().SelectElement(PC_NOA_dd_NonOwnedAutoTypeofCoverage,strPolicyCoverages_DD_TypeofCoverage,test);
					se.element().enterOrValidateText(getPCNOANonOwnedAutoNumberOfEmployees(strPolicyCoverages_TXT_totalNoEmp),strPolicyCoverages_TXT_totalNoEmp,test);
					se.element().checkUncheckOrValidate(getPCNOANonOwnedAutoOtherIndividualLiabilityofEmployees(strPolicyCoverages_CHK_ExtendCoverage),strPolicyCoverages_CHK_ExtendCoverage,test);
					}
					se.util().sleep(2000);
					se.element().waitForElementToAppear_One(strPolicyCoverages_CHK_Driveothercar,PC_DOC_chk_Coverage, 60);
					se.element().checkUncheckOrValidate(getPCDOCCoverage(strPolicyCoverages_CHK_Driveothercar),strPolicyCoverages_CHK_Driveothercar,test);
					se.element().SelectElement(PC_DOC_chk_ComprehensiveCoverage,strPolicyCoverages_DD_CompCvgr,test);
					se.element().SelectElement(PC_DOC_chk_CollisionCoverage,strPolicyCoverages_DD_ColliCvg,test);
					se.util().sleep(1000);
					se.element().Click(getLocations_BTN_Save(), test);
					se.util().sleep(1000);
				}
			}
			catch(Exception e){
				e.printStackTrace();{}
				e.getMessage();
				se.verify().verifyEquals("Failed to fill in details for CA_PolicyCoverages ", true, false, true, test);
			}
			iteration++;
		}
		se.element().waitForElementToAppear_One(" ",GI_CHK_Continue, 20);
		se.element().Click(getGI_CHK_Continue(), test);
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}
}
