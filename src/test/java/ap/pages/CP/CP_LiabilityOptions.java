package ap.pages.CP;

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

public class CP_LiabilityOptions extends BL_OR_CP{
	public void CP_LiabilityOptions_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.Liability_Options)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Liability_Options, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strLiabilityOptions_CHK_SeedMErchantsFail = (String) row.get("LiabilityOptions_CHK_SeedMErchantsFail");
			String strLiabilityOptions_DD_SEEDOccurenceAndAggregateS = (String) row.get("LiabilityOptions_DD_SEEDOccurenceAndAggregateS");
			String strLiabilityOptions_TXT_SEEDDeductible = (String) row.get("LiabilityOptions_TXT_SEEDDeductible");
			String strLiabilityOptions_CHK_CropConsultingServ = (String) row.get("LiabilityOptions_CHK_CropConsultingServ");
			//String strLiabilityOptions_DD_CropOccurenceAndAggregateS = (String) row.get("LiabilityOptions_DD_CropOccurenceAndAggregateS");
			//String strLiabilityOptions_TXT_CropDeductible = (String) row.get("LiabilityOptions_TXT_CropDeductible");
			String strLiabilityOptions_CHK_LimitedHerbicide = (String) row.get("LiabilityOptions_CHK_LimitedHerbicide");
			String strLiabilityOptions_DD_LimitedOccurenceAndAggregateS = (String) row.get("LiabilityOptions_DD_LimitedOccurenceAndAggregateS");
			String strLiabilityOptions_TXT_LimitedDeductible = (String) row.get("LiabilityOptions_TXT_LimitedDeductible");
			String strLiabilityOptions_TXT_CropConsultingsales = (String) row.get("LiabilityOptions_TXT_CropConsultingsales");
			String strLiabilityOptions_TXT_NoofAcresPesticides = (String) row.get("LiabilityOptions_TXT_NoofAcresPesticides");
			String strLiabilityOptions_TXT_NoofAcresFertilizer = (String) row.get("LiabilityOptions_TXT_NoofAcresFertilizer");
			String strLiabilityOptions_CHK_AbuseandMolestation = (String) row.get("LiabilityOptions_CHK_AbuseandMolestation");
			String strLiabilityOptions_CHK_ExcessMedical = (String) row.get("LiabilityOptions_CHK_ExcessMedical");
			String strLiabilityOptions_DD_Limit = (String) row.get("LiabilityOptions_DD_Limit");
			String strLiabilityOptions_CHK_CoverageDesignated = (String) row.get("LiabilityOptions_CHK_CoverageDesignated");
			String strLiabilityOptions_TXT_DescSports = (String) row.get("LiabilityOptions_TXT_DescSports");
			String strLiabilityOptions_CHK_SnowMobileAndRecreation = (String) row.get("LiabilityOptions_CHK_SnowMobileAndRecreation");
			String strLiabilityOptions_TXT_NumberOfVehicles = (String) row.get("LiabilityOptions_TXT_NumberOfVehicles");
			String strLiabilityOptions_CHK_ProfessionalLiabilty = (String) row.get("LiabilityOptions_CHK_ProfessionalLiabilty");
			String strLiabiltyOptions_TXT_EachWronful = (String) row.get("LiabiltyOptions_TXT_EachWronful");
			String strLiabilityOptions_TXT_AggLimit = (String) row.get("LiabilityOptions_TXT_AggLimit");
			String strLiabilityOptions_DD_Deductiblet = (String) row.get("LiabilityOptions_DD_Deductible");
			String strLiabilityOptions_CHK_allegation_Yes = (String) row.get("LiabilityOptions_CHK_allegation_Yes");
			String strLiabilityOptions_CHK_allegation_No = (String) row.get("LiabilityOptions_CHK_allegation_No");
			String strLiabilityOptions_DD_occurenceLmt = (String) row.get("LiabilityOptions_DD_occurenceLmt");
			String strLiabilityOptions_DD_ClassCodeDesc = (String) row.get("LiabilityOptions_DD_ClassCodeDesc");
			String strLiabilityOptions_TXT_EstimatedExposure = (String) row.get("LiabilityOptions_TXT_EstimatedExposure");
			String strLiabilityOptions_CHK_PropertyDamage = (String) row.get("LiabilityOptions_CHK_PropertyDamage");
			String strLiabilityOptions_CHK_PollutionLiability = (String) row.get("LiabilityOptions_CHK_PollutionLiability");
			String strLiabilityOptions_CHK_RealProperty = (String) row.get("LiabilityOptions_CHK_RealProperty");
			String strLiabilityOptions_TXT_NumOfMembers = (String) row.get("LiabilityOptions_TXT_NumOfMembers");
			String strLiabilityOptions_TXT_NumOfGames = (String) row.get("LiabilityOptions_TXT_NumOfGames");
			String strLiabilityOptions_DD_SwimmingPoolLimit = (String) row.get("LiabilityOptions_DD_SwimmingPoolLimit");
			String strLiabilityOptions_DD_LimitedWaterActivityType = (String) row.get("LiabilityOptions_DD_LimitedWaterActivityType");
			String strLiabilityOptions_CHK_LimitedAbduction = (String) row.get("LiabilityOptions_CHK_LimitedAbduction");
			String strLiabilityOptions_CHK_LimitedWaterActivityCov = (String) row.get("LiabilityOptions_CHK_LimitedWaterActivityCov");
			String strLiabilityOptions_CHK_ProfessionalLiabilityTattooorBodyPiercingArtist = (String) row.get("LiabilityOptions_CHK_ProfessionalLiabilityTattooorBodyPiercingArtist");
			String strLiabilityOptions_CHK_EachWrongfulActLimit = (String) row.get("LiabilityOptions_CHK_EachWrongfulActLimit");
			String strLiabilityOptions_CHK_AggregateLimit = (String) row.get("LiabilityOptions_CHK_AggregateLimit");
			String strLiabilityOptions_TXT_SpecifiedProfession = (String) row.get("LiabilityOptions_TXT_SpecifiedProfession");
			String strLiabilityOptions_TXT_ClassDescription = (String) row.get("LiabilityOptions_TXT_ClassDescription");
			String strLiabilityOptions_TXT_NumberofTattooorBodyPiercingArtists = (String) row.get("LiabilityOptions_TXT_NumberofTattooorBodyPiercingArtists");
			String strLiabilityOptions_TXT_GLSOProfLiabSpaNumberProfs = (String) row.get("LiabilityOptions_TXT_GLSOProfLiabSpaNumberProfs");
			String strLiabilityOptions_CHK_LimitationOfCoverageSkinDamage = (String) row.get("LiabilityOptions_CHK_LimitationOfCoverageSkinDamage");
			String strLiabilityOptions_TXT_NumberOfTanningBeds = (String) row.get("LiabilityOptions_TXT_NumberOfTanningBeds");
			String strLiabilityOptions_CHK_ProfessionalLiabilityDetectiveandSecurity = (String) row.get("LiabilityOptions_CHK_ProfessionalLiabilityDetectiveandSecurity");
			String strLiabilityOptions_CHK_ProfLiabDetectEachWrongfulActLimit = (String) row.get("LiabilityOptions_CHK_ProfLiabDetectEachWrongfulActLimit");
			String strLiabilityOptions_CHK_ProfLiabDetectAggregateLimit = (String) row.get("LiabilityOptions_CHK_ProfLiabDetectAggregateLimit");
			String strLiabilityOptions_TXT_ProfLiabDetectSpecifiedProfession = (String) row.get("LiabilityOptions_TXT_ProfLiabDetectSpecifiedProfession");
			String strLiabilityOptions_CHK_ProfLiabDetectClassDescription = (String) row.get("LiabilityOptions_CHK_ProfLiabDetectClassDescription");
			String strLiabilityOptions_TXT_ProfLiabDetectTotalPayroll = (String) row.get("LiabilityOptions_TXT_ProfLiabDetectTotalPayroll");
			String strLiabilityOptions_CHK_DoesApplicantUseAnyUnlicensedVehicles_No = (String) row.get("LiabilityOptions_CHK_DoesApplicantUseAnyUnlicensedVehicles_No");
			String strLiabilityOptions_CHK_DoesApplicantUseAnyUnlicensedVehicles_Yes = (String) row.get("LiabilityOptions_CHK_DoesApplicantUseAnyUnlicensedVehicles_Yes");
			
			
			
			try {
				se.log().logTestStep("CP_LiabilityOptions_Details");
				test.log(LogStatus.INFO, "CP_LiabilityOptions_Details","Transaction Step : "+transaction + "<br>" +"Page : CP_LiabilityOptions_Details");
				se.verify().verifyEquals("CP_LiabilityOptions_Details  of AgencyPortal ", getLiabilityOptions().isDisplayed(),true, true,test);
				se.element().checkUncheckOrValidate(getLiabilityOptions_CHK_SeedMErchantsFail(strLiabilityOptions_CHK_SeedMErchantsFail),strLiabilityOptions_CHK_SeedMErchantsFail,test);
				se.element().SelectElement(LiabilityOptions_DD_SEEDOccurenceAndAggregate,strLiabilityOptions_DD_SEEDOccurenceAndAggregateS,test);
				se.element().enterOrValidateText(getLiabilityOptions_TXT_SEEDDeductible(strLiabilityOptions_TXT_SEEDDeductible),strLiabilityOptions_TXT_SEEDDeductible,test);
				se.element().checkUncheckOrValidate( getLiabilityOptions_CHK_CropConsultingServ(strLiabilityOptions_CHK_CropConsultingServ),strLiabilityOptions_CHK_CropConsultingServ,test);
				se.element().SelectElement(LiabilityOptions_DD_CropOccurenceAndAggregate,strLiabilityOptions_DD_SEEDOccurenceAndAggregateS,test);
				se.element().enterOrValidateText(getLiabilityOptions_TXT_CropDeductible(strLiabilityOptions_TXT_SEEDDeductible),strLiabilityOptions_TXT_SEEDDeductible,test);
				se.element().enterOrValidateText(getLiabilityOptions_CHK_CropConsultingSales(strLiabilityOptions_TXT_CropConsultingsales),strLiabilityOptions_TXT_CropConsultingsales,test);
				se.element().checkUncheckOrValidate( getLiabilityOptions_CHK_LimitedHerbicide(strLiabilityOptions_CHK_LimitedHerbicide),strLiabilityOptions_CHK_LimitedHerbicide,test);
				se.element().SelectElement(LiabilityOptions_DD_LimitedOccurenceAndAggregateS,strLiabilityOptions_DD_LimitedOccurenceAndAggregateS,test);
				se.element().enterOrValidateText(getLiabilityOptions_TXT_LimitedDeductible(strLiabilityOptions_TXT_LimitedDeductible),strLiabilityOptions_TXT_LimitedDeductible,test);
				se.element().enterOrValidateText(getLiabilityOptions_TXT_NoofAcresPesticides(strLiabilityOptions_TXT_NoofAcresPesticides),strLiabilityOptions_TXT_NoofAcresPesticides,test);
				se.element().enterOrValidateText(getLLiabilityOptions_TXT_NoofAcresFertilizer(strLiabilityOptions_TXT_NoofAcresFertilizer),strLiabilityOptions_TXT_NoofAcresFertilizer,test);
				se.element().checkUncheckOrValidate( getLiabilityOptions_CHK_AbuseandMolestation(strLiabilityOptions_CHK_AbuseandMolestation),strLiabilityOptions_CHK_AbuseandMolestation,test);
				se.element().checkUncheckOrValidate( getLiabilityOptions_CHK_allegation_Yes(strLiabilityOptions_CHK_allegation_Yes),strLiabilityOptions_CHK_allegation_Yes,test);
				se.element().checkUncheckOrValidate( getLiabilityOptions_CHK_allegation_No(strLiabilityOptions_CHK_allegation_No),strLiabilityOptions_CHK_allegation_No,test);
				se.element().SelectElement(LiabilityOptions_DD_occurenceLmt,strLiabilityOptions_DD_occurenceLmt,test);
				se.element().SelectElement(LiabilityOptions_DD_ClassCodeDesc,strLiabilityOptions_DD_ClassCodeDesc,test);
				se.element().enterOrValidateText(getLiabilityOptions_TXT_EstimatedExposure(strLiabilityOptions_TXT_EstimatedExposure),strLiabilityOptions_TXT_EstimatedExposure,test);
				se.element().checkUncheckOrValidate( getLiabilityOptions_CHK_ExcessMedical(strLiabilityOptions_CHK_ExcessMedical),strLiabilityOptions_CHK_ExcessMedical,test);
				se.element().SelectElement(LiabilityOptions_DD_Limit,strLiabilityOptions_DD_Limit,test);
				se.element().enterOrValidateText(getLiabilityOptions_TXT_NumOfGames(strLiabilityOptions_TXT_NumOfGames),strLiabilityOptions_TXT_NumOfGames,test);
				se.element().enterOrValidateText(getLiabilityOptions_TXT_NumOfMembers(strLiabilityOptions_TXT_NumOfMembers),strLiabilityOptions_TXT_NumOfMembers,test);
				se.element().checkUncheckOrValidate( getLiabilityOptions_CHK_CoverageDesignated(strLiabilityOptions_CHK_CoverageDesignated),strLiabilityOptions_CHK_CoverageDesignated,test);
				se.element().enterOrValidateText(getLiabilityOptions_TXT_DescSports(strLiabilityOptions_TXT_DescSports),strLiabilityOptions_TXT_DescSports,test);
				se.element().checkUncheckOrValidate( getLiabilityOptions_CHK_DoesApplicantUseAnyUnlicensedVehicles_Yes(strLiabilityOptions_CHK_DoesApplicantUseAnyUnlicensedVehicles_Yes),strLiabilityOptions_CHK_DoesApplicantUseAnyUnlicensedVehicles_Yes,test);
				se.element().checkUncheckOrValidate( getLiabilityOptions_CHK_DoesApplicantUseAnyUnlicensedVehicles_No(strLiabilityOptions_CHK_DoesApplicantUseAnyUnlicensedVehicles_No),strLiabilityOptions_CHK_DoesApplicantUseAnyUnlicensedVehicles_No,test);se.element().checkUncheckOrValidate( getLiabilityOptions_CHK_SnowMobileAndRecreation(strLiabilityOptions_CHK_SnowMobileAndRecreation),strLiabilityOptions_CHK_SnowMobileAndRecreation,test);
				se.util().sleep(3000);
				se.element().checkUncheckOrValidate( getLiabilityOptions_CHK_SnowMobileAndRecreation(strLiabilityOptions_CHK_SnowMobileAndRecreation),strLiabilityOptions_CHK_SnowMobileAndRecreation,test);
				se.element().enterOrValidateText(getLiabilityOptions_TXT_NumberOfVehicles(strLiabilityOptions_TXT_NumberOfVehicles),strLiabilityOptions_TXT_NumberOfVehicles,test);
				se.element().checkUncheckOrValidate( getLiabilityOptions_CHK_ProfessionalLiabilty(strLiabilityOptions_CHK_ProfessionalLiabilty),strLiabilityOptions_CHK_ProfessionalLiabilty,test);
				se.element().enterOrValidateText(getLiabiltyOptions_TXT_EachWronful(strLiabiltyOptions_TXT_EachWronful),strLiabiltyOptions_TXT_EachWronful,test);
				se.element().enterOrValidateText(getLiabilityOptions_TXT_AggLimit(strLiabilityOptions_TXT_AggLimit),strLiabilityOptions_TXT_AggLimit,test);
				se.element().SelectElement(LiabilityOptions_DD_Deductiblet,strLiabilityOptions_DD_Deductiblet,test);
				se.element().checkUncheckOrValidate( getLiabilityOptions_CHK_PropertyDamage(strLiabilityOptions_CHK_PropertyDamage),strLiabilityOptions_CHK_PropertyDamage,test);
				se.element().checkUncheckOrValidate( getLiabilityOptions_CHK_PollutionLiability(strLiabilityOptions_CHK_PollutionLiability),strLiabilityOptions_CHK_PollutionLiability,test);
				se.element().checkUncheckOrValidate( getLiabilityOptions_CHK_RealProperty(strLiabilityOptions_CHK_RealProperty),strLiabilityOptions_CHK_RealProperty,test);
				se.element().checkUncheckOrValidate( getLiabilityOptions_CHK_LimitedAbduction(strLiabilityOptions_CHK_LimitedAbduction),strLiabilityOptions_CHK_LimitedAbduction,test);
				se.element().checkUncheckOrValidate( getLiabilityOptions_CHK_LimitedWaterActivityCov(strLiabilityOptions_CHK_LimitedWaterActivityCov),strLiabilityOptions_CHK_LimitedWaterActivityCov,test);
				
				se.element().SelectElement(LiabilityOptions_DD_LimitedWaterActivityType,strLiabilityOptions_DD_LimitedWaterActivityType,test);
				se.util().sleep(1000);
				se.element().SelectElement(LiabilityOptions_DD_SwimmingPoolLimit,strLiabilityOptions_DD_SwimmingPoolLimit,test);
				se.element().checkUncheckOrValidate( getLiabilityOptions_CHK_ProfessionalLiabilityTattooorBodyPiercingArtist(strLiabilityOptions_CHK_ProfessionalLiabilityTattooorBodyPiercingArtist),strLiabilityOptions_CHK_ProfessionalLiabilityTattooorBodyPiercingArtist,test);
				se.element().SelectElement(LiabilityOptions_CHK_EachWrongfulActLimit,strLiabilityOptions_CHK_EachWrongfulActLimit,test);
				se.element().checkUncheckOrValidate( getLiabilityOptions_CHK_AggregateLimit(strLiabilityOptions_CHK_AggregateLimit),strLiabilityOptions_CHK_AggregateLimit,test);
				se.element().checkUncheckOrValidate( getLiabilityOptions_TXT_SpecifiedProfession(strLiabilityOptions_TXT_SpecifiedProfession),strLiabilityOptions_TXT_SpecifiedProfession,test);
				se.element().checkUncheckOrValidate( LiabilityOptions_TXT_ClassDescription(strLiabilityOptions_TXT_ClassDescription),strLiabilityOptions_TXT_ClassDescription,test);
				se.element().enterOrValidateText( getLiabilityOptions_TXT_NumberofTattooorBodyPiercingArtists(strLiabilityOptions_TXT_NumberofTattooorBodyPiercingArtists),strLiabilityOptions_TXT_NumberofTattooorBodyPiercingArtists,test);	
				se.element().enterOrValidateText( getLiabilityOptions_TXT_GLSOProfLiabSpaNumberProfs(strLiabilityOptions_TXT_GLSOProfLiabSpaNumberProfs),strLiabilityOptions_TXT_GLSOProfLiabSpaNumberProfs,test);	
				se.element().checkUncheckOrValidate( getLiabilityOptions_CHK_LimitationOfCoverageSkinDamage(strLiabilityOptions_CHK_LimitationOfCoverageSkinDamage),strLiabilityOptions_CHK_LimitationOfCoverageSkinDamage,test);
				se.element().enterOrValidateText( getLiabilityOptions_TXT_NumberOfTanningBeds(strLiabilityOptions_TXT_NumberOfTanningBeds),strLiabilityOptions_TXT_NumberOfTanningBeds,test);	
				se.element().checkUncheckOrValidate( getLiabilityOptions_CHK_ProfessionalLiabilityDetectiveandSecurity(strLiabilityOptions_CHK_ProfessionalLiabilityDetectiveandSecurity),strLiabilityOptions_CHK_ProfessionalLiabilityDetectiveandSecurity,test);
				se.element().SelectElement(LiabilityOptions_CHK_ProfLiabDetectEachWrongfulActLimit,strLiabilityOptions_CHK_ProfLiabDetectEachWrongfulActLimit,test);
				se.element().checkUncheckOrValidate( getLiabilityOptions_CHK_ProfLiabDetectAggregateLimit(strLiabilityOptions_CHK_ProfLiabDetectAggregateLimit),strLiabilityOptions_CHK_ProfLiabDetectAggregateLimit,test);
				se.element().enterOrValidateText( getLiabilityOptions_TXT_ProfLiabDetectSpecifiedProfession(strLiabilityOptions_TXT_ProfLiabDetectSpecifiedProfession),strLiabilityOptions_TXT_ProfLiabDetectSpecifiedProfession,test);
				se.element().SelectElement(LiabilityOptions_CHK_ProfLiabDetectClassDescription,strLiabilityOptions_CHK_ProfLiabDetectClassDescription,test);
				se.element().enterOrValidateText( getLiabilityOptions_TXT_ProfLiabDetectTotalPayroll(strLiabilityOptions_TXT_ProfLiabDetectTotalPayroll),strLiabilityOptions_TXT_ProfLiabDetectTotalPayroll,test);	
			
			}
			catch(Exception e){
				e.getMessage();
				e.printStackTrace();
				se.verify().verifyEquals("Failed to fill in details for Liability_Opions page ", true, false, true, test);
			}
			iteration++;
		}
		se.element().Click(getGI_CHK_Continue(), test);
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}
}
