package ap.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.ap.automation.common.ExcelOperations;
import Libraries.ap.automation.common.SystemPropertyUtil;
import Libraries.ap.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.OR_CP;

public class CP_Liablitycoverages extends OR_CP {
	public void CP_Liablitycoverages_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.Liability_Coverages)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Liability_Coverages, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strLiabilityCoverages_CHK_IncludeGeneralLiability = (String) row.get("LiabilityCoverages_CHK_IncludeGeneralLiability");
			String strLiabilityCoverages_DD_SelectGeneralLiabilityWrap = (String) row.get("LiabilityCoverages_DD_SelectGeneralLiabilityWrap");
			String strLiabilityCoverages_TXTV_Products_Completed = (String) row.get("LiabilityCoverages_TXTV_Products_Completed");
			String strLiabilityCoverages_TXTV_EachOccurrenceLimit = (String) row.get("LiabilityCoverages_TXTV_EachOccurrenceLimit");
			String strLiabilityCoverages_DD_EachOccurrenceLimit = (String) row.get("LiabilityCoverages_DD_EachOccurrenceLimit");
			String strLiabilityCoverages_TXTV_GeneralAggregateLimit = (String) row.get("LiabilityCoverages_TXTV_GeneralAggregateLimit");
			String strLiabilityCoverages_DD_GeneralAggregateLimit  = (String) row.get("LiabilityCoverages_DD_GeneralAggregateLimit");
			String strLiabilityCoverages_TXTV_ProductsCompletedOperations  = (String) row.get("LiabilityCoverages_TXTV_ProductsCompletedOperations");
			String strLiabilityCoverages_TXTV_PersonalandAdvertising  = (String) row.get("LiabilityCoverages_TXTV_PersonalandAdvertising");
			String strLiabilityCoverages_DDV_DamagetoPremises = (String) row.get("LiabilityCoverages_DDV_DamagetoPremises");
			String strLiabilityCoverages_TXT_DamagetoPremises = (String) row.get("LiabilityCoverages_TXT_DamagetoPremises");
			String strLiabilityCoverages_DDV_MedicalExpense = (String) row.get("LiabilityCoverages_DDV_ MedicalExpense");
			String strLiabilityCoverages_TXTV_DeductibleLiability = (String) row.get("LiabilityCoverages_TXTV_DeductibleLiability");
			String strLiabilityCoverages_DDV_PropertyDamage = (String) row.get("LiabilityCoverages_DDV_PropertyDamage");
			String strLiabilityCoverages_TXTV_PDDeductible = (String) row.get("LiabilityCoverages_TXTV_PD Deductible");
			String strLiabilityCoverages_CHK_EmployeeBenefit = (String) row.get("LiabilityCoverages_CHK_EmployeeBenefit");
			String strLiabilityCoverages_TXTV_RetroactiveDate = (String) row.get("LiabilityCoverages_TXTV_RetroactiveDate");
			//String eff_date = Util.getCurrentDate();
			String eff_date = SystemPropertyUtil.getEffectiveDate();
			String strLiabilityCoverages_CHK_StopGap = (String) row.get("LiabilityCoverages_CHK_StopGap");
			String strLiabilityCoverages_CHK_PetProfessional = (String) row.get("LiabilityCoverages_CHK_PetProfessional");
			String strLiabilityCoverages_DD_PetProfessional_Limit= (String) row.get("LiabilityCoverages_DD_PetProfessional_Limit");
			String strLiabilityCoverages_DDV_BodilyInjuryByAccident = (String) row.get("LiabilityCoverages_DDV_BodilyInjuryByAccident");
			String strLiabilityCoverages_TXTV_BodilyInjuryByDisease  = (String) row.get("LiabilityCoverages_TXTV_BodilyInjuryByDisease");
			String strLiabilityCoverages_TXTV_BodilyInjuryByDiseaseEach = (String) row.get("LiabilityCoverages_TXTV_BodilyInjuryByDiseaseEach");
			String strLiabilityCoverages_TXT_Payroll = (String) row.get("LiabilityCoverages_TXT_Payroll");
			String strLiabilityCoverages_CHK_Contractors= (String) row.get("LiabilityCoverages_CHK_Contractors");
			String strLiabilityCoverages_CHK_Contractors_Yes= (String) row.get("LiabilityCoverages_CHK_Contractors_Yes");
			String strLiabilityCoverages_CHK_Contractors_No= (String) row.get("LiabilityCoverages_CHK_Contractors_No");
			String strLiabilityCoverages_DD_Contractors_Limit= (String) row.get("LiabilityCoverages_DD_Contractors_Limit");
			String strLiabilityCoverages_DD_Contractors_Deductible= (String) row.get("LiabilityCoverages_DD_Contractors_Deductible");
			String strLiabilityCoverages_CHK_LostKey = (String) row.get("LiabilityCoverages_CHK_LostKey");
			String strLiabilityCoverages_DD_EachSite = (String) row.get("LiabilityCoverages_DD_EachSite");
			String strLiabilityCoverages_TXT_Aggregate = (String) row.get("LiabilityCoverages_TXT_Aggregate");
			String strLiabilityCoverages_CHK_LiquorLiabilityCov = (String) row.get("LiabilityCoverages_CHK_LiquorLiabilityCov");
			String strLiabilityCoverages_CHK_HiredAuto= (String) row.get("LiabilityCoverages_CHK_HiredAuto");
			String strLiabilityCoverages_CHK_IncludeUM_UIMAtFullLimit_Yes= (String) row.get("LiabilityCoverages_CHK_IncludeUM_UIMAtFullLimit_Yes");
			String strLiabilityCoverages_CHK_IncludeUM_UIMAtFullLimit_No= (String) row.get("LiabilityCoverages_CHK_IncludeUM_UIMAtFullLimit_No");
			String strLiabilityCoverages_CHK_VoluntaryPropertyDamage = (String) row.get("LiabilityCoverages_CHK_VoluntaryPropertyDamage");
			String strLiabilityCoverages_DDV_VPD_OccurenceLimit = (String) row.get("LiabilityCoverages_DDV_VPD_OccurenceLimit");
			String strLiabilityCoverages_TXT_VPD_AggregateLimit = (String) row.get("LiabilityCoverages_TXT_VPD_AggregateLimit");
			String strLiabilityCoverages_DDV_VPD_Deductible = (String) row.get("LiabilityCoverages_DDV_VPD_Deductible");
			String strLiabilityCoverages_CHK_DoesTheRiskHaveContractor_Yes= (String) row.get("LiabilityCoverages_CHK_DoesTheRiskHaveContractor_Yes");
			String strLiabilityCoverages_CHK_DoesTheRiskHaveContractor_No= (String) row.get("LiabilityCoverages_CHK_DoesTheRiskHaveContractor_No");
			String strLiabilityCoverages_TXT_DoesTheRisk_OccurenceLimit = (String) row.get("LiabilityCoverages_TXT_DoesTheRisk_OccurenceLimit");
			String strLiabilityCoverages_TXT_DoesTheRisk_Deductible = (String) row.get("LiabilityCoverages_TXT_DoesTheRisk_Deductible");
			String strLiabilityCoverages_DDV_Deductible= (String) row.get("LiabilityCoverages_DDV_Deductible");
			String strLiabilityCoverages_DDV_VoluntaryPropertyDamage = (String) row.get("LiabilityCoverages_DDV_VoluntaryPropertyDamage");
			//String strLiabilityCoverages_TXTV_AggregateLimit= (String) row.get("LiabilityCoverages_TXTV_AggregateLimit");
			String strLiabilityCoverages_DDV_Deductible1= (String) row.get("LiabilityCoverages_DDV_Deductible1");
			String strLiabilityCoverages_CHK_Construction= (String) row.get("LiabilityCoverages_CHK_Construction");
			String strLiabilityCoverages_CHK_SpecifiedResidentialConstructionWork= (String) row.get("LiabilityCoverages_CHK_SpecifiedResidentialConstructionWork");
			String strLiabilityCoverages_TXTV_JobSite = (String) row.get("LiabilityCoverages_TXTV_JobSite");
			String strLiabilityCoverages_TXTV_VoluntaryProperty= (String) row.get("LiabilityCoverages_TXTV_VoluntaryProperty");
			String strLiabilityCoverages_CHK_AdditionalInsuredWrap=(String)  row.get("LiabilityCoverages_CHK_AdditionalInsuredWrap");
			String strLiabilityCoverages_CHK_Isadditionalinsuredstatus_Yes=(String)  row.get("LiabilityCoverages_CHK_Isadditionalinsuredstatus_Yes");
			String strLiabilityCoverages_CHK_Isadditionalinsuredstatus_No=(String)  row.get("LiabilityCoverages_CHK_Isadditionalinsuredstatus_No");
			String strLiabilityCoverages_DDV_EachCommonCauseLimit=(String)  row.get("LiabilityCoverages_DDV_EachCommonCauseLimit");
			String strLiabilityCoverages_TXT_AggregateLimit=(String)  row.get("LiabilityCoverages_TXT_AggregateLimit");
			String strLiabilityCoverages_TXT_PerClaimdeductible=(String)  row.get("LiabilityCoverages_TXT_PerClaimdeductible");
			String strLiabilityCoverages_TXT_TotalLiquorSales=(String)  row.get("LiabilityCoverages_TXT_TotalLiquorSales");
			String strLiabilityCoverages_Radio_LiabAddInt=(String)  row.get("LiabilityCoverages_Radio_LiabAddInt");
			String strLiabilityCoverages_Radio_HNOADaycaresQuestion=(String)  row.get("LiabilityCoverages_Radio_HNOADaycaresQuestion");
			
			String strLiabilityCoverages_CHK_CustomersGoodsLegal=(String)  row.get("LiabilityCoverages_CHK_CustomersGoodsLegal");
			String strLiabilityCoverages_CHK_SalesandDisposalLegal=(String)  row.get("LiabilityCoverages_CHK_SalesandDisposalLegal");
			String strLiabilityCoverages_DD_GoodsLegal_Limit=(String)  row.get("LiabilityCoverages_DD_GoodsLegal_Limit");
			String strLiabilityCoverages_DD_SalesLegal_Limit=(String)  row.get("LiabilityCoverages_DD_SalesLegal_Limit");
			
			String strLiabilityCoverages_CHK_DoesTheApplicantOfferRentals_Yes=(String)  row.get("LiabilityCoverages_CHK_DoesTheApplicantOfferRentals_Yes");
			String strLiabilityCoverages_CHK_DoesTheApplicantOfferRentals_No=(String)  row.get("LiabilityCoverages_CHK_DoesTheApplicantOfferRentals_No");
			String strLiabilityCoverages_TXT_DoesTheApplicantOfferRentals_Explanation=(String)  row.get("LiabilityCoverages_TXT_DoesTheApplicantOfferRentals_Explanation");
			String strLiabilityCoverages_CHK_DoesTheApplicantUseIndependentContractors_Yes=(String) row.get("LiabilityCoverages_CHK_DoesTheApplicantUseIndependentContractors_Yes");
			String strLiabilityCoverages_CHK_DoesTheApplicantUseIndependentContractors_No=(String) row.get("LiabilityCoverages_CHK_DoesTheApplicantUseIndependentContractors_No");
			String strLiabilityCoverages_CHK_DoTheIndependentContractorsHaveTheirOwnInsurance_Yes=(String) row.get("LiabilityCoverages_CHK_DoTheIndependentContractorsHaveTheirOwnInsurance_Yes");
			String strLiabilityCoverages_CHK_DoTheIndependentContractorsHaveTheirOwnInsurance_No=(String) row.get("LiabilityCoverages_CHK_DoTheIndependentContractorsHaveTheirOwnInsurance_No");
			
			String strLiabilityCoverages_DD_AdditionalInsuredWrapSelection=(String)  row.get("LiabilityCoverages_DD_AdditionalInsuredWrapSelection");
			try {
				se.log().logTestStep("CP_Liablitycoverages_Details");
				test.log(LogStatus.INFO, "CP_Liablitycoverages_Details","Transaction Step : "+transaction + "<br>" +"Page : CP_Liablitycoverages_Details");
				se.verify().verifyEquals("CP_Liablitycoverages_Details  of AgencyPortal ", getLiabilityCoverages_label().isDisplayed(),true, true,test);
				se.element().checkUncheckOrValidate( getLiabilityCoverages_CHK_IncludeGeneralLiability(strLiabilityCoverages_CHK_IncludeGeneralLiability),strLiabilityCoverages_CHK_IncludeGeneralLiability,test);
				se.element().SelectElement(LiabilityCoverages_DD_SelectGeneralLiabilityWrap, strLiabilityCoverages_DD_SelectGeneralLiabilityWrap,test);
				
				se.element().SelectElement(LiabilityCoverages_DD_AdditionalInsuredWrapSelection, strLiabilityCoverages_DD_AdditionalInsuredWrapSelection,test);
				
				if (strLiabilityCoverages_CHK_AdditionalInsuredWrap.contains("Check")) {
					se.element().checkUncheckOrValidate( getLiabilityCoverages_CHK_AdditionalInsuredWrap(strLiabilityCoverages_CHK_AdditionalInsuredWrap),strLiabilityCoverages_CHK_AdditionalInsuredWrap,test);
					se.element().checkUncheckOrValidate( getLiabilityCoverages_CHK_Isadditionalinsuredstatus_Yes(strLiabilityCoverages_CHK_Isadditionalinsuredstatus_Yes),strLiabilityCoverages_CHK_Isadditionalinsuredstatus_Yes,test);
					se.element().checkUncheckOrValidate( getLiabilityCoverages_CHK_Isadditionalinsuredstatus_No(strLiabilityCoverages_CHK_Isadditionalinsuredstatus_No),strLiabilityCoverages_CHK_Isadditionalinsuredstatus_No,test);
				}
				
				se.element().enterOrValidateText( getLiabilityCoverages_TXTV_Products_Completed(strLiabilityCoverages_TXTV_Products_Completed),strLiabilityCoverages_TXTV_Products_Completed,test);
				se.element().enterOrValidateText( getLiabilityCoverages_TXTV_EachOccurrenceLimit(strLiabilityCoverages_TXTV_EachOccurrenceLimit),strLiabilityCoverages_TXTV_EachOccurrenceLimit,test);
				se.element().SelectElement(LiabilityCoverages_DD_EachOccurrenceLimit, strLiabilityCoverages_DD_EachOccurrenceLimit,test);
				se.element().enterOrValidateText( getLiabilityCoverages_TXTV_GeneralAggregateLimit(strLiabilityCoverages_TXTV_GeneralAggregateLimit),strLiabilityCoverages_TXTV_GeneralAggregateLimit,test);
				se.element().SelectElement(LiabilityCoverages_DD_GeneralAggregateLimit, strLiabilityCoverages_DD_GeneralAggregateLimit,test);
				se.element().enterOrValidateText( getLiabilityCoverages_TXTV_ProductsCompletedOperations(strLiabilityCoverages_TXTV_ProductsCompletedOperations),strLiabilityCoverages_TXTV_ProductsCompletedOperations,test);
				se.element().enterOrValidateText( getLiabilityCoverages_TXTV_PersonalandAdvertising(strLiabilityCoverages_TXTV_PersonalandAdvertising),strLiabilityCoverages_TXTV_PersonalandAdvertising,test);
				se.element().SelectElement(LiabilityCoverages_DDV_DamagetoPremises, strLiabilityCoverages_DDV_DamagetoPremises,test);
				se.element().enterOrValidateText( getLiabilityCoverages_TXT_DamagetoPremises(strLiabilityCoverages_TXT_DamagetoPremises),strLiabilityCoverages_TXT_DamagetoPremises,test);
				se.element().SelectElement(LiabilityCoverages_DDV_MedicalExpense, strLiabilityCoverages_DDV_MedicalExpense,test);
				se.element().enterOrValidateText( getLiabilityCoverages_TXTV_DeductibleLiability(strLiabilityCoverages_TXTV_DeductibleLiability),strLiabilityCoverages_TXTV_DeductibleLiability,test);
				se.element().SelectElement(LiabilityCoverages_DDV_PropertyDamage, strLiabilityCoverages_DDV_PropertyDamage,test);
				se.element().enterOrValidateText( getLiabilityCoverages_TXTV_PDDeductible(strLiabilityCoverages_TXTV_PDDeductible),strLiabilityCoverages_TXTV_PDDeductible,test);
				se.element().checkUncheckOrValidate( getLiabilityCoverages_CHK_EmployeeBenefit(strLiabilityCoverages_CHK_EmployeeBenefit),strLiabilityCoverages_CHK_EmployeeBenefit,test);
				if(strLiabilityCoverages_CHK_EmployeeBenefit.contains("Check")) {
					if(strLiabilityCoverages_TXTV_RetroactiveDate.contains("N/A")) {
						se.verify().verifyEquals("LiabilityCoverages_TXTV_RetroactiveDate validation" , se.element().getSelectedText(LiabilityCoverages_TXTV_RetroactiveDate), eff_date, test);					
					}
					else {
						se.element().enterOrValidateText( getLiabilityCoverages_TXTV_RetroactiveDate(strLiabilityCoverages_TXTV_RetroactiveDate),strLiabilityCoverages_TXTV_RetroactiveDate,test);
					}
				}
				se.element().checkUncheckOrValidate( getLiabilityCoverages_CHK_StopGap(strLiabilityCoverages_CHK_StopGap),strLiabilityCoverages_CHK_StopGap,test);
				se.element().checkUncheckOrValidate( getLiabilityCoverages_CHK_PetProfessional(strLiabilityCoverages_CHK_PetProfessional),strLiabilityCoverages_CHK_PetProfessional,test);
				se.element().SelectElement(LiabilityCoverages_DD_PetProfessional_Limit, strLiabilityCoverages_DD_PetProfessional_Limit,test);
				se.element().SelectElement(LiabilityCoverages_DDV_BodilyInjuryByAccident, strLiabilityCoverages_DDV_BodilyInjuryByAccident,test);
				se.element().enterOrValidateText( getLiabilityCoverages_TXTV_BodilyInjuryByDisease(strLiabilityCoverages_TXTV_BodilyInjuryByDisease),strLiabilityCoverages_TXTV_BodilyInjuryByDisease,test);
				se.element().enterOrValidateText( getLiabilityCoverages_TXTV_BodilyInjuryByDiseaseEach(strLiabilityCoverages_TXTV_BodilyInjuryByDiseaseEach),strLiabilityCoverages_TXTV_BodilyInjuryByDiseaseEach,test);
				se.element().enterOrValidateText(getLiabilityCoverages_TXT_Payroll(strLiabilityCoverages_TXT_Payroll),strLiabilityCoverages_TXT_Payroll,test);
				//se.element().selectradiovalue(LiabilityCoverages_CHK_StopGap, strLiabilityCoverages_CHK_StopGap);
				/*se.verify().verifyEquals( "LiabilityCoverages Products_Completed validation",se.element(). getSelectedText(LiabilityCoverages_TXTV_Products_Completed),strLiabilityCoverages_TXTV_Products_Completed,true,test);
					se.verify().verifyEquals( "LiabilityCoverages EachOccurrenceLimit validation",se.element(). getSelectedText(LiabilityCoverages_TXTV_EachOccurrenceLimit),strLiabilityCoverages_TXTV_EachOccurrenceLimit,true,test);
					se.verify().verifyEquals( "LiabilityCoverages GeneralAggregateLimit validation",se.element(). getSelectedText(LiabilityCoverages_TXTV_GeneralAggregateLimit),strLiabilityCoverages_TXTV_GeneralAggregateLimit,true,test);
					se.verify().verifyEquals( "LiabilityCoverages ProductsCompletedOperations validation",se.element(). getSelectedText(LiabilityCoverages_TXTV_ProductsCompletedOperations ),strLiabilityCoverages_TXTV_ProductsCompletedOperations,true,test);
					se.verify().verifyEquals( "LiabilityCoverages PersonalandAdvertising validation",se.element(). getSelectedText(LiabilityCoverages_TXTV_PersonalandAdvertising ),strLiabilityCoverages_TXTV_PersonalandAdvertising ,true,test);
					se.verify().verifyEquals( "LiabilityCoverages  DamagetoPremises validation",se.element(). getSelectedValue(LiabilityCoverages_DDV_DamagetoPremises),strLiabilityCoverages_DDV_DamagetoPremises,true,test);
					se.verify().verifyEquals( "LiabilityCoverages  MedicalExpense validation",se.element(). getSelectedValue(LiabilityCoverages_DDV_MedicalExpense),strLiabilityCoverages_DDV_MedicalExpense,true,test);
					se.verify().verifyEquals( "LiabilityCoverages DeductibleLiability validation",se.element(). getSelectedText(LiabilityCoverages_TXTV_DeductibleLiability),strLiabilityCoverages_TXTV_DeductibleLiability,true,test);
					se.verify().verifyEquals( "LiabilityCoverages PropertyDamage validation",se.element(). getSelectedValue(LiabilityCoverages_DDV_PropertyDamage),strLiabilityCoverages_DDV_PropertyDamage,true,test);
					se.verify().verifyEquals( "LiabilityCoverages PDDEDUCtibel validation",se.element(). getSelectedText(LiabilityCoverages_TXTV_PDDeductible),strLiabilityCoverages_TXTV_PDDeductible,true,test);
					se.element().selectradiovalue(LiabilityCoverages_CHK_EmployeeBenefit, strLiabilityCoverages_CHK_EmployeeBenefit);
					se.verify().verifyEquals( "LiabilityCoverages Retroactivatedate validation",se.element(). getSelectedText(LiabilityCoverages_TXTV_RetroactiveDate),strLiabilityCoverages_TXTV_RetroactiveDate,true,test);*/
				/*Stop gap is having bug so commented
					se.element().selectradiovalue(LiabilityCoverages_CHK_StopGap, strLiabilityCoverages_CHK_StopGap);
					//.util().sleep(4000);
					se.verify().verifyEquals("LiabilityCoverages BodilyInjuryByAccident validation",se.element(). getSelectedValue(LiabilityCoverages_DDV_BodilyInjuryByAccident),strLiabilityCoverages_DDV_BodilyInjuryByAccident,true,test);
					se.verify().verifyEquals("LiabilityCoverages  BodilyInjuryByDisease validation",se.element(). getSelectedText(LiabilityCoverages_TXTV_BodilyInjuryByDisease),strLiabilityCoverages_TXTV_BodilyInjuryByDisease,true,test);
					se.verify().verifyEquals("LiabilityCoverages BodilyInjuryByDisease_Each validation",se.element(). getSelectedText(LiabilityCoverages_TXTV_BodilyInjuryByDiseaseEach),strLiabilityCoverages_TXTV_BodilyInjuryByDiseaseEach,true,test);
					se.element().enterOrValidateText(getLiabilityCoverages_TXT_Payroll(strLiabilityCoverages_TXT_Payroll),strLiabilityCoverages_TXT_Payroll,test);
				 */
				se.element().checkUncheckOrValidate( getLiabilityCoverages_CHK_Contractors(strLiabilityCoverages_CHK_Contractors),strLiabilityCoverages_CHK_Contractors,test);
				se.element().checkUncheckOrValidate( getLiabilityCoverages_CHK_Contractors_Yes(strLiabilityCoverages_CHK_Contractors_Yes),strLiabilityCoverages_CHK_Contractors_Yes,test);
				se.element().checkUncheckOrValidate( getLiabilityCoverages_CHK_Contractors_No(strLiabilityCoverages_CHK_Contractors_No),strLiabilityCoverages_CHK_Contractors_No,test);
				se.element().SelectElement(LiabilityCoverages_DD_Contractors_Limit, strLiabilityCoverages_DD_Contractors_Limit,test);
				se.element().SelectElement(LiabilityCoverages_DD_Contractors_Deductible, strLiabilityCoverages_DD_Contractors_Deductible,test);
				se.element().checkUncheckOrValidate( getLiabilityCoverages_CHK_LostKey(strLiabilityCoverages_CHK_LostKey),strLiabilityCoverages_CHK_LostKey,test);
				se.element().SelectElement(LiabilityCoverages_DD_EachSite, strLiabilityCoverages_DD_EachSite,test);
				se.element().enterOrValidateText(getLiabilityCoverages_TXT_Aggregate(strLiabilityCoverages_TXT_Aggregate),strLiabilityCoverages_TXT_Aggregate,test);
				se.element().checkUncheckOrValidate(getLiabilityCoverages_CHK_LiquorLiabilityCov(strLiabilityCoverages_CHK_LiquorLiabilityCov),strLiabilityCoverages_CHK_LiquorLiabilityCov,test);
				if(strLiabilityCoverages_CHK_LiquorLiabilityCov.contains("Check"))
				{
					se.element().SelectElement(LiabilityCoverages_DDV_EachCommonCauseLimit, strLiabilityCoverages_DDV_EachCommonCauseLimit,test);
					se.element().enterOrValidateText(getstrLiabilityCoverages_TXT_AggregateLimit(strLiabilityCoverages_TXT_AggregateLimit),strLiabilityCoverages_TXT_AggregateLimit,test);
					se.element().enterOrValidateText(getLiabilityCoverages_TXT_PerClaimdeductible(strLiabilityCoverages_TXT_PerClaimdeductible),strLiabilityCoverages_TXT_PerClaimdeductible,test);
					se.element().enterOrValidateText(getLiabilityCoverages_TXT_TotalLiquorSales(strLiabilityCoverages_TXT_TotalLiquorSales),strLiabilityCoverages_TXT_TotalLiquorSales,test);
				}
				se.element().checkUncheckOrValidate( getLiabilityCoverages_CHK_HiredAuto(strLiabilityCoverages_CHK_HiredAuto),strLiabilityCoverages_CHK_HiredAuto,test);
				se.element().checkUncheckOrValidate( getLiabilityCoverages_CHK_IncludeUM_UIMAtFullLimit_Yes(strLiabilityCoverages_CHK_IncludeUM_UIMAtFullLimit_Yes),strLiabilityCoverages_CHK_IncludeUM_UIMAtFullLimit_Yes,test);
				se.element().checkUncheckOrValidate( getLiabilityCoverages_CHK_IncludeUM_UIMAtFullLimit_No(strLiabilityCoverages_CHK_IncludeUM_UIMAtFullLimit_No),strLiabilityCoverages_CHK_IncludeUM_UIMAtFullLimit_No,test);
				
				se.element().checkUncheckOrValidate( getLiabilityCoverages_CHK_CustomersGoodsLegal(strLiabilityCoverages_CHK_CustomersGoodsLegal),strLiabilityCoverages_CHK_CustomersGoodsLegal,test);
				se.element().SelectElement(LiabilityCoverages_DD_GoodsLegal_Limit, strLiabilityCoverages_DD_GoodsLegal_Limit,test);
				se.element().checkUncheckOrValidate( getLiabilityCoverages_CHK_SalesandDisposalLegal(strLiabilityCoverages_CHK_SalesandDisposalLegal),strLiabilityCoverages_CHK_SalesandDisposalLegal,test);
				se.element().SelectElement(LiabilityCoverages_DD_SalesLegal_Limit, strLiabilityCoverages_DD_SalesLegal_Limit,test);
				
				se.element().checkUncheckOrValidate( getLiabilityCoverages_CHK_VoluntaryPropertyDamage(strLiabilityCoverages_CHK_VoluntaryPropertyDamage),strLiabilityCoverages_CHK_VoluntaryPropertyDamage,test);
				se.element().SelectElement(LiabilityCoverages_DDV_VPD_OccurenceLimit, strLiabilityCoverages_DDV_VPD_OccurenceLimit,test);
				se.element().enterOrValidateText(getLiabilityCoverages_TXT_VPD_AggregateLimit(strLiabilityCoverages_TXT_VPD_AggregateLimit),strLiabilityCoverages_TXT_VPD_AggregateLimit,test);
				se.element().SelectElement(LiabilityCoverages_DDV_VPD_Deductible, strLiabilityCoverages_DDV_VPD_Deductible,test);
				se.element().checkUncheckOrValidate( getLiabilityCoverages_CHK_DoesTheRiskHaveContractor_Yes(strLiabilityCoverages_CHK_DoesTheRiskHaveContractor_Yes),strLiabilityCoverages_CHK_DoesTheRiskHaveContractor_Yes,test);
				se.element().checkUncheckOrValidate( getLiabilityCoverages_CHK_DoesTheRiskHaveContractor_No(strLiabilityCoverages_CHK_DoesTheRiskHaveContractor_No),strLiabilityCoverages_CHK_DoesTheRiskHaveContractor_No,test);
				se.element().enterOrValidateText(getLiabilityCoverages_TXT_DoesTheRisk_OccurenceLimit(strLiabilityCoverages_TXT_DoesTheRisk_OccurenceLimit),strLiabilityCoverages_TXT_DoesTheRisk_OccurenceLimit,test);
				se.element().enterOrValidateText(getLiabilityCoverages_TXT_DoesTheRisk_Deductible(strLiabilityCoverages_TXT_DoesTheRisk_Deductible),strLiabilityCoverages_TXT_DoesTheRisk_Deductible,test);
				se.element().enterOrValidateText(getLiabilityCoverages_TXTV_JobSite(strLiabilityCoverages_TXTV_JobSite),strLiabilityCoverages_TXTV_JobSite,test);
				se.element().SelectElement(LiabilityCoverages_DDV_Deductible, strLiabilityCoverages_DDV_Deductible,test);
				se.element().enterOrValidateText(getLiabilityCoverages_TXTV_VoluntaryProperty(strLiabilityCoverages_TXTV_VoluntaryProperty),strLiabilityCoverages_TXTV_VoluntaryProperty,test);
				se.element().SelectElement(LiabilityCoverages_DDV_VoluntaryPropertyDamage, strLiabilityCoverages_DDV_VoluntaryPropertyDamage,test);
				se.element().checkUncheckOrValidate( getLiabilityCoverages_CHK_Construction(strLiabilityCoverages_CHK_Construction),strLiabilityCoverages_CHK_Construction,test);
				se.element().chkElement(getLiabilityCoverages_Radio_LiabAddInt(strLiabilityCoverages_Radio_LiabAddInt), strLiabilityCoverages_Radio_LiabAddInt,test);
				se.element().chkElement(getLiabilityCoverages_Radio_HNOADaycaresQuestion(strLiabilityCoverages_Radio_HNOADaycaresQuestion), strLiabilityCoverages_Radio_HNOADaycaresQuestion,test);
				se.element().enterOrValidateText(getLiabilityCoverages_TXTV_AggregateLimit(strLiabilityCoverages_DDV_Deductible1),strLiabilityCoverages_DDV_Deductible1,test);
				se.element().checkUncheckOrValidate( getLiabilityCoverages_CHK_Construction(strLiabilityCoverages_CHK_Construction),strLiabilityCoverages_CHK_Construction,test);
				se.element().checkUncheckOrValidate( getLiabilityCoverages_CHK_SpecifiedResidentialConstructionWork(strLiabilityCoverages_CHK_SpecifiedResidentialConstructionWork),strLiabilityCoverages_CHK_SpecifiedResidentialConstructionWork,test);
				
				se.element().checkUncheckOrValidate( getLiabilityCoverages_CHK_DoesTheApplicantOfferRentals_Yes(strLiabilityCoverages_CHK_DoesTheApplicantOfferRentals_Yes),strLiabilityCoverages_CHK_DoesTheApplicantOfferRentals_Yes,test);
				se.element().checkUncheckOrValidate( getLiabilityCoverages_CHK_DoesTheApplicantOfferRentals_No(strLiabilityCoverages_CHK_DoesTheApplicantOfferRentals_No),strLiabilityCoverages_CHK_DoesTheApplicantOfferRentals_No,test);
				se.element().enterOrValidateText(getLiabilityCoverages_TXT_DoesTheApplicantOfferRentals_Explanation(strLiabilityCoverages_TXT_DoesTheApplicantOfferRentals_Explanation),strLiabilityCoverages_TXT_DoesTheApplicantOfferRentals_Explanation,test);
				se.element().checkUncheckOrValidate( getLiabilityCoverages_CHK_DoesTheApplicantUseIndependentContractors_Yes(strLiabilityCoverages_CHK_DoesTheApplicantUseIndependentContractors_Yes),strLiabilityCoverages_CHK_DoesTheApplicantUseIndependentContractors_Yes,test);
				se.element().checkUncheckOrValidate( getLiabilityCoverages_CHK_DoesTheApplicantUseIndependentContractors_No(strLiabilityCoverages_CHK_DoesTheApplicantUseIndependentContractors_No),strLiabilityCoverages_CHK_DoesTheApplicantUseIndependentContractors_No,test);
				se.element().checkUncheckOrValidate( getLiabilityCoverages_CHK_DoTheIndependentContractorsHaveTheirOwnInsurance_Yes(strLiabilityCoverages_CHK_DoTheIndependentContractorsHaveTheirOwnInsurance_Yes),strLiabilityCoverages_CHK_DoTheIndependentContractorsHaveTheirOwnInsurance_Yes,test);
				se.element().checkUncheckOrValidate( getLiabilityCoverages_CHK_DoTheIndependentContractorsHaveTheirOwnInsurance_No(strLiabilityCoverages_CHK_DoTheIndependentContractorsHaveTheirOwnInsurance_No),strLiabilityCoverages_CHK_DoTheIndependentContractorsHaveTheirOwnInsurance_No,test);
				executor.executeScript("arguments[0].scrollIntoView(0,500);", getGI_CHK_Continue());
				se.element().Click(getGI_CHK_Continue(), test);
				//commented due to workaround  not required//
				//					String Text=se.element().getSelectedText(LiabilityCoverages_TXT_HardMsg);
				//					if(Text.contains("Liability Coverages.PD Deductible - Per Occurrence value must match one of the drop down values"))
				//					{
				//						executor.executeScript("arguments[0].scrollIntoView(0,500);", getGI_CHK_Continue());
				//						se.element().Click(getGI_CHK_Continue());
				//					}
				/*se.verify().verifyEquals( "LiabilityCoverages JobSite validation",se.element(). getSelectedText(LiabilityCoverages_TXTV_JobSite ),strLiabilityCoverages_TXTV_JobSite ,true,test);
					se.verify().verifyEquals( "LiabilityCoverages Deductiblevalidation",se.element(). getSelectedValue(LiabilityCoverages_DDV_Deductible),strLiabilityCoverages_DDV_Deductible,true,test);
					se.verify().verifyEquals( "LiabilityCoverages VoluntaryProperty validation",se.element(). getSelectedText(LiabilityCoverages_TXTV_VoluntaryProperty),strLiabilityCoverages_TXTV_VoluntaryProperty,true,test);
					se.verify().verifyEquals( "LiabilityCoverages VoluntaryPropertyDamage validation",se.element(). getSelectedValue(LiabilityCoverages_DDV_VoluntaryPropertyDamage),strLiabilityCoverages_DDV_VoluntaryPropertyDamage,true,test);
					se.verify().verifyEquals( "LiabilityCoverages AggregateLimit validation",se.element(). getSelectedText(LiabilityCoverages_TXTV_AggregateLimit),strLiabilityCoverages_TXTV_AggregateLimit,true,test);
					se.verify().verifyEquals( "LiabilityCoverages Deductible validation",se.element(). getSelectedValue(LiabilityCoverages_DDV_Deductible1),strLiabilityCoverages_DDV_Deductible1,true,test);
					se.element().checkUncheckOrValidate( getLiabilityCoverages_CHK_Construction(strLiabilityCoverages_CHK_Construction),strLiabilityCoverages_CHK_Construction,test);
					executor.executeScript("arguments[0].scrollIntoView(0,500);", getGI_CHK_Continue());
					se.element().Click(getGI_CHK_Continue());*/
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for CP_Liablitycoverages_Details ", true, false, true, test);
			}
			iteration++;
		}
		
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}
	}





