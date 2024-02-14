package pw.pages.CA;

/**
 * @author ${is09492}
 */
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CA;

public class CA_CommercialAuto extends OR_CA {
	
	public void CommercialAuto(String strRegressionID,String transaction,String suspendSheet,ExtentTest test) throws IOException {
		
try{
		
	    if(suspendSheet.equalsIgnoreCase(constants.CA_CommAuto)){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
	         testTearDown(se, test);
	    }
	    
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_CommAuto, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strCA_DDN_SelectCoverageOption=(String) row.get("CA_DDN_SelectCoverageOption");
				String strCA_TXT_PrimaryState=(String) row.get("CA_TXT_PrimaryState");
				String strCA_TXT_PrimaryStateFilterNeeded=(String) row.get("CA_TXT_PrimaryStateFilterNeeded");
				String strCA_CHK_Fleet=(String) row.get("CA_CHK_Fleet");
				String strCA_TXT_NAICSCode=(String) row.get("CA_TXT_NAICSCode");
				String strCA_TXT_NAICSCodeFilterNeeded=(String) row.get("CA_TXT_NAICSCodeFilterNeeded");
				//Predective modeling change 11/01/2020 control date. CA-Agribusiness
				String strCA_CHK_ElectronicMonitoringDevice = (String) row.get("CA_CHK_ElectronicMonitoringDevice"); 
				String strCA_CHK_ExperienceRating=(String) row.get("CA_CHK_ExperienceRating");
				String strCA_CHK_Audit=(String) row.get("CA_CHK_Audit");
				String strCA_DDN_HazardGrade=(String) row.get("CA_DDN_HazardGrade");
				String strCA_TXT_LoggerCreditTypeFilterNeeded=(String) row.get("CA_TXT_LoggerCreditTypeFilterNeeded");	
				String strCA_TXT_LoggerCreditType=(String) row.get("CA_TXT_LoggerCreditType");
				String strCA_CHK_ExpiringFullTerm_Yes=(String) row.get("CA_CHK_ExpiringFullTerm_Yes");
				String strCA_CHK_ExpiringFullTerm_No=(String) row.get("CA_CHK_ExpiringFullTerm_No");
				String strCA_CHK_RenewalRewards=(String) row.get("CA_CHK_RenewalRewards");
				String strCA_TXT_OriginalInceptionYear=(String) row.get("CA_TXT_OriginalInceptionYear");
				String strCA_CHK_AccountCredit=(String) row.get("CA_CHK_AccountCredit");
				String strCA_TXT_NumberofEligiblepolicies=(String) row.get("CA_TXT_NumberofEligiblepolicies");
				String strCA_TXT_Liability_Assoc_Grp_Ftr=(String) row.get("CA_TXT_Liability_Assoc_Grp_Ftr");
				String strCA_TXT_Phys_Dmg_Assoc_Grp_Ftr=(String) row.get("CA_TXT_Phys_Dmg_Assoc_Grp_Ftr");
				String strCA_TXT_Liability_Misc_Ftr=(String) row.get("CA_TXT_Liability_Misc_Ftr");
				String strCA_TXT_Liability_MiscFtrReason=(String) row.get("CA_TXT_Liability_MiscFtrReason");
				String strCA_TXT_Liability_MiscFtrReasonFilterNeeded=(String) row.get("CA_TXT_Liability_MiscFtrReasonFilterNeeded");
				String strCA_TXT_Physical_Dmge_Misc_Ftr=(String) row.get("CA_TXT_Physical_Dmge_Misc_Ftr");
				String strCA_CHK_ExcludeTransport_OnDemandDelivery=(String) row.get("CA_CHK_ExcludeTransport_OnDemandDelivery");
				String strCA_CHK_ExcludeTransport_ConvOnly=(String) row.get("CA_CHK_ExcludeTransport_ConvOnly");
				String strCA_CHK_Total_Poll_Exc_otherthancov_autos=(String) row.get("CA_CHK_Total_Poll_Exc_otherthancov_autos");
				String strCA_TXT_ClassificationFilterNeeded=(String) row.get("CA_TXT_ClassificationFilterNeeded");
				String strCA_TXT_Classification=(String) row.get("CA_TXT_Classification");
				String strCA_CHK_Franchised=(String) row.get("CA_CHK_Franchised");
				String strCA_CHK_Nonfranchised=(String) row.get("CA_CHK_Nonfranchised");
				String strCA_CHK_Equipdealer=(String) row.get("CA_CHK_Equipdealer");
				String strCA_TXT_Reporting_BasisFilterNeeded=(String) row.get("CA_TXT_Reporting_BasisFilterNeeded");
				String strCA_TXT_Reporting_Basis=(String) row.get("CA_TXT_Reporting_Basis");
				String strCA_TXT_auto_dealer_collisionFilterNeeded=(String) row.get("CA_TXT_auto_dealer_collisionFilterNeeded");
				String strCA_TXT_auto_dealer_collision=(String) row.get("CA_TXT_auto_dealer_collision");
				String strCA_TXT_auto_dealer_coll_dedFilterNeeded=(String) row.get("CA_TXT_auto_dealer_coll_dedFilterNeeded");
				String strCA_TXT_auto_dealer_coll_ded=(String) row.get("CA_TXT_auto_dealer_coll_ded");
				String strCA_CHK_ActsErrorsorOmissionsLiability=(String) row.get("CA_CHK_ActsErrorsorOmissionsLiability");
				String strCA_TXT_ActsErrorsorOmissionsLiabilityLimitFilterNeeded=(String) row.get("CA_TXT_ActsErrorsorOmissionsLiabilityLimitFilterNeeded");
				String strCA_TXT_ActsErrorsorOmissionsLiabilityLimit=(String) row.get("CA_TXT_ActsErrorsorOmissionsLiabilityLimit");
				String strCA_CHK_Exl_Dmg_Rent_Prem_Cover=(String) row.get("CA_CHK_Exl_Dmg_Rent_Prem_Cover");
				String strCA_CHK_Exc_Prods_Work_Perf=(String) row.get("CA_CHK_Exc_Prods_Work_Perf");
				String strCA_CHK_Excl_Persnl_Inju_Liab=(String) row.get("CA_CHK_Excl_Persnl_Inju_Liab");
				String strCA_TXT_Reposs_Auto_Coll=(String) row.get("CA_TXT_Reposs_Auto_Coll");
				String strCA_TXT_Reposs_Auto_CollFilterNeeded=(String) row.get("CA_TXT_Reposs_Auto_CollFilterNeeded");
				String strCA_TXT_Reposs_Auto_Coll_Ded=(String) row.get("CA_TXT_Reposs_Auto_Coll_Ded");
				String strCA_TXT_Reposs_Auto_Coll_DedFilterNeeded=(String) row.get("CA_TXT_Reposs_Auto_Coll_DedFilterNeeded");
				String strCA_TXT_Auto_Held_Srv_Collision=(String) row.get("CA_TXT_Auto_Held_Srv_Collision");
				String strCA_TXT_Auto_Held_Srv_CollisionFilterNeeded=(String) row.get("CA_TXT_Auto_Held_Srv_CollisionFilterNeeded");
				
				
				try {
					se.log().logTestStep("CA_CommercialAuto Details");
					test.log(LogStatus.INFO, "CA_CommercialAuto Details page","Transaction Step : "+transaction + "<br>" +"Page : CA_CommercialAuto");
					se.verify().verifyEquals("CA_CommercialAuto Details  of PowerWriter ", getCA_BTN_Label().isDisplayed(),true, true,test);
						
					if (!strCA_DDN_SelectCoverageOption.equalsIgnoreCase(constants.NA)
							&& !strCA_DDN_SelectCoverageOption.contains(constants.Validate)) {
						se.element().Click(getCA_DDN_SelectCoverage(), test);
						se.element().Click(getCA_DDN_SelectCoverageOption(strCA_DDN_SelectCoverageOption), test);
					}
					
					se.element().selectPopupWithMagnifier(getCA_TXT_PrimaryState(strCA_TXT_PrimaryState),getCA_TXT_PrimaryStateSearch(strCA_TXT_PrimaryState),strCA_TXT_PrimaryState,strCA_TXT_PrimaryStateFilterNeeded,strCA_TXT_PrimaryState, constants.NA, constants.NA,constants.NA,test);
					se.element().checkUncheckOrValidate(getCA_CHK_Fleet(strCA_CHK_Fleet),strCA_CHK_Fleet,test);
					se.element().selectPopupWithMagnifier(getCA_TXT_NAICSCode(strCA_TXT_NAICSCode),getCA_TXT_NAICSCodeSearch(strCA_TXT_NAICSCode),strCA_TXT_NAICSCode,strCA_TXT_NAICSCodeFilterNeeded,strCA_TXT_NAICSCode, constants.NA, constants.NA,constants.NA,test);
					se.element().checkUncheckOrValidate(getCA_CHK_ExperienceRating(strCA_CHK_ExperienceRating),strCA_CHK_ExperienceRating,test);
					se.element().checkUncheckOrValidate(getCA_CHK_Audit(strCA_CHK_Audit),strCA_CHK_Audit,test);
					se.element().Click(getCA_DDN_HazardGrade(strCA_DDN_HazardGrade),strCA_DDN_HazardGrade,test);
					se.element().selectPopupWithMagnifier(getCA_TXT_LoggerCreditType(strCA_TXT_LoggerCreditType),getCA_TXT_LoggerCreditTypeMagnifier(strCA_TXT_LoggerCreditType),strCA_TXT_LoggerCreditType,strCA_TXT_LoggerCreditTypeFilterNeeded,strCA_TXT_LoggerCreditType, constants.NA, constants.NA,constants.NA,test);					
					se.element().checkUncheckOrValidate(getCA_CHK_ExpiringFullTerm_Yes(strCA_CHK_ExpiringFullTerm_Yes),strCA_CHK_ExpiringFullTerm_Yes,test);
					se.element().checkUncheckOrValidate(getCA_CHK_ExpiringFullTerm_No(strCA_CHK_ExpiringFullTerm_No),strCA_CHK_ExpiringFullTerm_No,test);
					se.element().checkUncheckOrValidate(getCA_CHK_RenewalRewards(strCA_CHK_RenewalRewards),strCA_CHK_RenewalRewards,test);
					se.element().enterOrValidateText(getCA_TXT_OriginalInceptionYear(strCA_TXT_OriginalInceptionYear),strCA_TXT_OriginalInceptionYear,test);
					se.element().checkUncheckOrValidate(getCA_CHK_AccountCredit(strCA_CHK_AccountCredit),strCA_CHK_AccountCredit,test);
					se.element().enterOrValidateText(getCA_TXT_NumberofEligiblepolicies(strCA_TXT_NumberofEligiblepolicies),strCA_TXT_NumberofEligiblepolicies,test);
					se.element().enterOrValidateText(getCA_TXT_Liability_Assoc_Grp_Ftr(strCA_TXT_Liability_Assoc_Grp_Ftr),strCA_TXT_Liability_Assoc_Grp_Ftr,test);
					se.element().enterOrValidateText(getCA_TXT_Phys_Dmg_Assoc_Grp_Ftr(strCA_TXT_Phys_Dmg_Assoc_Grp_Ftr),strCA_TXT_Phys_Dmg_Assoc_Grp_Ftr,test);
					se.element().enterOrValidateText(getCA_TXT_Liability_Misc_Ftr(strCA_TXT_Liability_Misc_Ftr),strCA_TXT_Liability_Misc_Ftr,test);
					se.element().selectPopupWithMagnifier(getCA_TXT_Liability_MiscFtrReason(strCA_TXT_Liability_MiscFtrReason),getCA_TXT_Liability_MiscFtrReasonSearch(strCA_TXT_Liability_MiscFtrReason),strCA_TXT_Liability_MiscFtrReason,strCA_TXT_Liability_MiscFtrReasonFilterNeeded,strCA_TXT_Liability_MiscFtrReason, constants.NA, constants.NA,constants.NA,test);
					se.element().enterOrValidateText(getCA_TXT_Physical_Dmge_Misc_Ftr(strCA_TXT_Physical_Dmge_Misc_Ftr),strCA_TXT_Physical_Dmge_Misc_Ftr,test);
					se.element().checkUncheckOrValidate(getCA_CHK_ExcludeTransport_OnDemandDelivery(strCA_CHK_ExcludeTransport_OnDemandDelivery),strCA_CHK_ExcludeTransport_OnDemandDelivery,test);
					se.element().checkUncheckOrValidate(getCA_CHK_ExcludeTransport_ConvOnly(strCA_CHK_ExcludeTransport_ConvOnly),strCA_CHK_ExcludeTransport_ConvOnly,test);
					se.element().checkUncheckOrValidate(getCA_CHK_Total_Poll_Exc_otherthancov_autos(strCA_CHK_Total_Poll_Exc_otherthancov_autos),strCA_CHK_Total_Poll_Exc_otherthancov_autos,test);
					se.element().selectPopupWithMagnifier(getCA_TXT_Classification(strCA_TXT_Classification),getCA_TXT_ClassificationSearch(strCA_TXT_Classification),strCA_TXT_Classification,strCA_TXT_ClassificationFilterNeeded,strCA_TXT_Classification, constants.NA, constants.NA,constants.NA,test);
					se.element().checkUncheckOrValidate(getCA_CHK_Franchised(strCA_CHK_Franchised),strCA_CHK_Franchised,test);
					se.element().checkUncheckOrValidate(getCA_CHK_Nonfranchised(strCA_CHK_Nonfranchised),strCA_CHK_Nonfranchised,test);
					se.element().checkUncheckOrValidate(getCA_CHK_Equipdealer(strCA_CHK_Equipdealer),strCA_CHK_Equipdealer,test);
					se.element().selectPopupWithMagnifier(getCA_TXT_Reporting_Basis(strCA_TXT_Reporting_Basis),getCA_TXT_Reporting_BasisSearch(strCA_TXT_Reporting_Basis),strCA_TXT_Reporting_Basis,strCA_TXT_Reporting_BasisFilterNeeded,strCA_TXT_Reporting_Basis, constants.NA, constants.NA,constants.NA,test);
					se.element().selectPopupWithMagnifier(getCA_TXT_auto_dealer_collision(strCA_TXT_auto_dealer_collision),getCA_TXT_auto_dealer_collisionSearch(strCA_TXT_auto_dealer_collision),strCA_TXT_auto_dealer_collision,strCA_TXT_auto_dealer_collisionFilterNeeded,strCA_TXT_auto_dealer_collision, constants.NA, constants.NA,constants.NA,test);
					se.element().selectPopupWithMagnifier(getCA_TXT_auto_dealer_coll_ded(strCA_TXT_auto_dealer_coll_ded),getCA_TXT_auto_dealer_coll_dedSearch(strCA_TXT_auto_dealer_coll_ded),strCA_TXT_auto_dealer_coll_ded,strCA_TXT_auto_dealer_coll_dedFilterNeeded,strCA_TXT_auto_dealer_coll_ded, constants.NA, constants.NA,constants.NA,test);
					se.element().checkUncheckOrValidate(getCA_CHK_ActsErrorsorOmissionsLiability(strCA_CHK_ActsErrorsorOmissionsLiability),strCA_CHK_ActsErrorsorOmissionsLiability,test);
					se.element().selectPopupWithMagnifier(getCA_TXT_ActsErrorsorOmissionsLiabilityLimit(strCA_TXT_ActsErrorsorOmissionsLiabilityLimit),getCA_TXT_ActsErrorsorOmissionsLiabilityLimitSearch(strCA_TXT_ActsErrorsorOmissionsLiabilityLimit),strCA_TXT_ActsErrorsorOmissionsLiabilityLimit,strCA_TXT_ActsErrorsorOmissionsLiabilityLimitFilterNeeded,strCA_TXT_ActsErrorsorOmissionsLiabilityLimit, constants.NA, constants.NA,constants.NA,test);
					se.element().checkUncheckOrValidate(getCA_CHK_Exl_Dmg_Rent_Prem_Cover(strCA_CHK_Exl_Dmg_Rent_Prem_Cover),strCA_CHK_Exl_Dmg_Rent_Prem_Cover,test);
					se.element().checkUncheckOrValidate(getCA_CHK_Exc_Prods_Work_Perf(strCA_CHK_Exc_Prods_Work_Perf),strCA_CHK_Exc_Prods_Work_Perf,test);
					se.element().checkUncheckOrValidate(getCA_CHK_Excl_Persnl_Inju_Liab(strCA_CHK_Excl_Persnl_Inju_Liab),strCA_CHK_Excl_Persnl_Inju_Liab,test);
					se.element().selectPopupWithMagnifier(getCA_TXT_Reposs_Auto_Coll(strCA_TXT_Reposs_Auto_Coll),getCA_TXT_Reposs_Auto_CollSearch(strCA_TXT_Reposs_Auto_Coll),strCA_TXT_Reposs_Auto_Coll,strCA_TXT_Reposs_Auto_CollFilterNeeded,strCA_TXT_Reposs_Auto_Coll, constants.NA, constants.NA,constants.NA,test);
					se.util().sleep(500);
					se.element().selectPopupWithMagnifier(getCA_TXT_Reposs_Auto_Coll_Ded(strCA_TXT_Reposs_Auto_Coll_Ded),getCA_TXT_Reposs_Auto_Coll_DedSearch(strCA_TXT_Reposs_Auto_Coll_Ded),strCA_TXT_Reposs_Auto_Coll_Ded,strCA_TXT_Reposs_Auto_Coll_DedFilterNeeded,strCA_TXT_Reposs_Auto_Coll_Ded, constants.NA, constants.NA,constants.NA,test);
					se.element().selectPopupWithMagnifier(getCA_TXT_Auto_Held_Srv_Collision(strCA_TXT_Auto_Held_Srv_Collision),getCA_TXT_Auto_Held_Srv_CollisionSearch(strCA_TXT_Auto_Held_Srv_Collision),strCA_TXT_Auto_Held_Srv_Collision,strCA_TXT_Auto_Held_Srv_CollisionFilterNeeded,strCA_TXT_Auto_Held_Srv_Collision, constants.NA, constants.NA,constants.NA,test);
					se.element().Click(getNext(),test);
					
				}
				catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for CA_CommercialAuto ", true, false, true, test);
					
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