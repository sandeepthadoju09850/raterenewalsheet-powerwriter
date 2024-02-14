package pw.pages.GL;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_GL;

public class GL_SpecialityOption extends OR_GL{
	
	public void GL_SpecialityOption_Details(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase("GL_SpecialityOption")){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}	
		List<Map<String, String>> table = ExcelOperations.getPagesData("GL_SpecialityOption", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				String strGL_SpecialityOption_CHK_DetectiveAndSecurity = (String) row.get("GL_SpecialityOption_CHK_DetectiveAndSecurity");
				String strGL_SpecialityOption_TXT_PropertyEntrusted = (String) row.get("GL_SpecialityOption_TXT_PropertyEntrusted");
				String strGL_SpecialityOption_TXT_NumberOfEmployees = (String) row.get("GL_SpecialityOption_TXT_NumberOfEmployees");
				String strGL_SpecialityOption_TXT_Deductible = (String) row.get("GL_SpecialityOption_TXT_Deductible");
				String strGL_SpecialityOption_CHK_CrisisCare = (String) row.get("GL_SpecialityOption_CHK_CrisisCare");
				String strGL_SpecialityOption_TXT_OccurenceLmt = (String) row.get("GL_SpecialityOption_TXT_OccurenceLmt");
				String strGL_SpecialityOption_TXT_Agglmt = (String) row.get("GL_SpecialityOption_TXT_Agglmt");
				String strGL_SpecialityOption_CHK_HumanServicesLiabWrap = (String) row.get("GL_SpecialityOption_CHK_HumanServicesLiabWrap");
				String strGL_SpecialityOption_CHK_AbuseAndMolestation = (String) row.get("GL_SpecialityOption_CHK_AbuseAndMolestation");
				String strGL_SpecialityOption_CHK_IllinoisAbuseExposure = (String) row.get("GL_SpecialityOption_CHK_IllinoisAbuseExposure");
				//String strGL_SpecialityOption_TXT_ClassCode_Lookup = (String) row.get("GL_SpecialityOption_TXT_ClassCode_Lookup");
				String strGL_SpecialityOption_TXT_ClassCode = (String) row.get("GL_SpecialityOption_TXT_ClassCode");
				String strGL_SpecialityOption_TXT_ClassDescription = (String) row.get("GL_SpecialityOption_TXT_ClassDescription");
				String strGL_SpecialityOption_TXT_EstimatedExposure = (String) row.get("GL_SpecialityOption_TXT_EstimatedExposure");
				String strGL_SpecialityOption_CHK_LimitedAbducCov = (String) row.get("GL_SpecialityOption_CHK_LimitedAbducCov");
				String strGL_SpecialityOption_TXT_Premium = (String) row.get("GL_SpecialityOption_TXT_Premium");
				String strGL_SpecialityOption_TXT_OverridePremium = (String) row.get("GL_SpecialityOption_TXT_OverridePremium");
				String strGL_SpecialityOption_TXT_OverridePremiumReason = (String) row.get("GL_SpecialityOption_TXT_OverridePremiumReason");
				String strGL_SpecialityOption_CHK_ExcessMedPaymntsCov = (String) row.get("GL_SpecialityOption_CHK_ExcessMedPaymntsCov");
				//String strGL_SpecialityOption_TXT_Limits_Lookup = (String) row.get("GL_SpecialityOption_TXT_Limits_Lookup");
				String strGL_SpecialityOption_TXT_Limits = (String) row.get("GL_SpecialityOption_TXT_Limits");
				String strGL_SpecialityOption_CHK_ExcessMedPaymntsCovForVolunteers = (String) row.get("GL_SpecialityOption_CHK_ExcessMedPaymntsCovForVolunteers");
				String strGL_SpecialityOption_CHK_LimitedWaterActivityCov = (String) row.get("GL_SpecialityOption_CHK_LimitedWaterActivityCov");
				String strGL_SpecialityOption_CHK_SwimmingPool = (String) row.get("GL_SpecialityOption_CHK_SwimmingPool");
				String strGL_SpecialityOption_TXT_SwimmingPool_Limits = (String) row.get("GL_SpecialityOption_TXT_SwimmingPool_Limits");
				String strGL_SpecialityOption_CHK_WadingPool = (String) row.get("GL_SpecialityOption_CHK_WadingPool");
				String strGL_SpecialityOption_TXT_WadingPool_Limits = (String) row.get("GL_SpecialityOption_TXT_WadingPool_Limits");
				String strGL_SpecialityOption_CHK_OtherWaterActivity = (String) row.get("GL_SpecialityOption_CHK_OtherWaterActivity");
				//String strGL_SpecialityOption_TXT_OccLimit_Lookup = (String) row.get("GL_SpecialityOption_TXT_OccLimit_Lookup");
				String strGL_SpecialityOption_TXT_OccLimit = (String) row.get("GL_SpecialityOption_TXT_OccLimit");
				String strGL_SpecialityOption_TXT_AggLimit = (String) row.get("GL_SpecialityOption_TXT_AggLimit");
				String strGL_SpecialityOption_CHK_LimitedDogAndCatCov = (String) row.get("GL_SpecialityOption_CHK_LimitedDogAndCatCov");
				//String strGL_SpecialityOption_TXT_DogCatCov_Limits_Lookup = (String) row.get("GL_SpecialityOption_TXT_DogCatCov_Limits_Lookup");
				String strGL_SpecialityOption_TXT_DogCatCov_Limits = (String) row.get("GL_SpecialityOption_TXT_DogCatCov_Limits");
				String strGL_SpecialityOption_CHK_CoverageforDesignatedSports = (String) row.get("GL_SpecialityOption_CHK_CoverageforDesignatedSports");
				String strGL_SpecialityOption_TXT_DescOfSports = (String) row.get("GL_SpecialityOption_TXT_DescOfSports");
				String strGL_SpecialityOption_CHK_SnowmobileAndRecrVehicleLiab = (String) row.get("GL_SpecialityOption_CHK_SnowmobileAndRecrVehicleLiab");
				String strGL_SpecialityOption_TXT_NumOfVehicles = (String) row.get("GL_SpecialityOption_TXT_NumOfVehicles");
				String strGL_SpecialityOption_CHK_LimitationOfCovSkinDmge = (String) row.get("GL_SpecialityOption_CHK_LimitationOfCovSkinDmge");
				String strGL_SpecialityOption_TXT_NumOfTanningBeds = (String) row.get("GL_SpecialityOption_TXT_NumOfTanningBeds");
				String strGL_SpecialityOption_CHK_LimitationOfCovEmergencyMedicalServices = (String) row.get("GL_SpecialityOption_CHK_LimitationOfCovEmergencyMedicalServices");
				String strGL_SpecialityOption_TXT_LimOfCovEmerMediServ_OccurenceLimit = (String) row.get("GL_SpecialityOption_TXT_LimOfCovEmerMediServ_OccurenceLimit");
				String strGL_SpecialityOption_TXT_LimOfCovEmerMediServ_AggregateLimit = (String) row.get("GL_SpecialityOption_TXT_LimOfCovEmerMediServ_AggregateLimit");
				String strGL_SpecialityOption_TXT_LimOfCovEmerMediServ_Premium = (String) row.get("GL_SpecialityOption_TXT_LimOfCovEmerMediServ_Premium");
				String strGL_SpecialityOption_TXT_LimOfCovEmerMediServ_OverridePremium = (String) row.get("GL_SpecialityOption_TXT_LimOfCovEmerMediServ_OverridePremium"); 
				String strGL_SpecialityOption_CHK_MaximumWageLevel = (String) row.get("GL_SpecialityOption_CHK_MaximumWageLevel");
				String strGL_SpecialityOption_TXT_MaximumHourlyWage = (String) row.get("GL_SpecialityOption_TXT_MaximumHourlyWage");
				String strGL_SpecialityOption_TXT_MaxHourlyWage_Premium = (String) row.get("GL_SpecialityOption_TXT_MaxHourlyWage_Premium");
				String strGL_SpecialityOption_TXT_MaxHourlyWage_OverridePremium = (String) row.get("GL_SpecialityOption_TXT_MaxHourlyWage_OverridePremium");
				String strGL_SpecialityOption_TXT_MaxHourlyWage_OverridePremiumReason = (String) row.get("GL_SpecialityOption_TXT_MaxHourlyWage_OverridePremiumReason");
				String strGL_SpecialityOption_CHK_ProffLiabOcc = (String) row.get("GL_SpecialityOption_CHK_ProffLiabOcc");
				String strGL_SpecialityOption_TXT_EachWrongfulActLimit = (String) row.get("GL_SpecialityOption_TXT_EachWrongfulActLimit");
				String strGL_SpecialityOption_TXT_ProfLiabOcc_AggregateLimit = (String) row.get("GL_SpecialityOption_TXT_ProfLiabOcc_AggregateLimit");
				String strGL_SpecialityOption_TXT_ProfLiabOcc_Deductible = (String) row.get("GL_SpecialityOption_TXT_ProfLiabOcc_Deductible");
				String strGL_SpecialityOption_CHK_ProfLiabOcc_HumanServices = (String) row.get("GL_SpecialityOption_CHK_ProfLiabOcc_HumanServices");
				String strGL_SpecialityOption_CHK_ProfLiabOcc_CompanionCareRisk = (String) row.get("GL_SpecialityOption_CHK_ProfLiabOcc_CompanionCareRisk");
				String strGL_SpecialityOption_CHK_ProfLiabOcc_SupportiveCareServicesRisk = (String) row.get("GL_SpecialityOption_CHK_ProfLiabOcc_SupportiveCareServicesRisk");
				String strGL_SpecialityOption_CHK_ProfLiabOcc_FitnessAndRecreation = (String) row.get("GL_SpecialityOption_CHK_ProfLiabOcc_FitnessAndRecreation");
				String strGL_SpecialityOption_CHK_ProfLiabOcc_DetectiveAndSecurity = (String) row.get("GL_SpecialityOption_CHK_ProfLiabOcc_DetectiveAndSecurity");
				String strGL_SpecialityOption_CHK_ProfLiabOcc_SpecifiedProfession = (String) row.get("GL_SpecialityOption_CHK_ProfLiabOcc_SpecifiedProfession");
				String strGL_SpecialityOption_TXT_ProfLiabOcc_SpecifiedProfession = (String) row.get("GL_SpecialityOption_TXT_ProfLiabOcc_SpecifiedProfession");
				
				String strTestDescription = (String) row.get("Transaction Name");
		try{
				se.log().logTestStep("GL_SpecialityOption");
				test.log(LogStatus.INFO, "GL_SpecialityOption page","Transaction Step : "+strTestDescription + "<br>" +"Page : GL_SpecialityOption");
				se.element().waitForElementIsDisplayed(getGL_SpecialityOption_label(), 10);
				se.verify().verifyEquals("GL_SpecialityOption Page of PowerWriter ", getGL_SpecialityOption_label().isDisplayed(),true, true,test);
				se.element().checkUncheckOrValidate(getGL_SpecialityOption_CHK_DetectiveAndSecurity(strGL_SpecialityOption_CHK_DetectiveAndSecurity),strGL_SpecialityOption_CHK_DetectiveAndSecurity,test);
				se.element().enterOrValidateText(getGL_SpecialityOption_TXT_PropertyEntrusted(strGL_SpecialityOption_TXT_PropertyEntrusted),strGL_SpecialityOption_TXT_PropertyEntrusted,test);
				se.element().enterOrValidateText(getGL_SpecialityOption_TXT_NumberOfEmployees(strGL_SpecialityOption_TXT_NumberOfEmployees),strGL_SpecialityOption_TXT_NumberOfEmployees,test);
				se.element().enterOrValidateText(getGL_SpecialityOption_TXT_Deductible(strGL_SpecialityOption_TXT_Deductible),strGL_SpecialityOption_TXT_Deductible, test);
				se.element().checkUncheckOrValidate(getGL_SpecialityOption_CHK_CrisisCare(strGL_SpecialityOption_CHK_CrisisCare),strGL_SpecialityOption_CHK_CrisisCare,test);
				se.element().enterOrValidateText(getGL_SpecialityOption_TXT_OccurenceLmt(strGL_SpecialityOption_TXT_OccurenceLmt),strGL_SpecialityOption_TXT_OccurenceLmt, test);
				se.element().enterOrValidateText(getGL_SpecialityOption_TXT_Agglmt(strGL_SpecialityOption_TXT_Agglmt),strGL_SpecialityOption_TXT_Agglmt, test);
				
				se.element().checkUncheckOrValidate(getGL_SpecialityOption_CHK_HumanServicesLiabWrap(strGL_SpecialityOption_CHK_HumanServicesLiabWrap),strGL_SpecialityOption_CHK_HumanServicesLiabWrap,test);
				se.element().checkUncheckOrValidate(getGL_SpecialityOption_CHK_AbuseAndMolestation(strGL_SpecialityOption_CHK_AbuseAndMolestation),strGL_SpecialityOption_CHK_AbuseAndMolestation,test);
				
				se.element().checkUncheckOrValidate(getGL_SpecialityOption_CHK_IllinoisAbuseExposure(strGL_SpecialityOption_CHK_IllinoisAbuseExposure),strGL_SpecialityOption_CHK_IllinoisAbuseExposure,test);
				/*se.element().enterOrValidateText(getGL_SpecialityOption_TXT_ClassCode_Lookup(strGL_SpecialityOption_TXT_ClassCode_Lookup),strGL_SpecialityOption_TXT_ClassCode_Lookup,test);*/
				se.element().enterOrValidateText(getGL_SpecialityOption_TXT_ClassCode(strGL_SpecialityOption_TXT_ClassCode),strGL_SpecialityOption_TXT_ClassCode,test);
				se.element().waitForElementIsDisplayed(GL_SpecialityOption_LBL_ChooseClassCode, 10);
				if(se.element().isElementPresent(GL_SpecialityOption_LBL_ChooseClassCode)){
					se.element().Click(getGL_SpecialityOption_LNK_ClassCode(strGL_SpecialityOption_TXT_ClassDescription,strGL_SpecialityOption_TXT_ClassCode), test);
				}
				se.element().enterOrValidateText(getGL_SpecialityOption_TXT_ClassDescription(strGL_SpecialityOption_TXT_ClassDescription),strGL_SpecialityOption_TXT_ClassDescription,test);
				se.element().enterOrValidateText(getGL_SpecialityOption_TXT_EstimatedExposure(strGL_SpecialityOption_TXT_EstimatedExposure),strGL_SpecialityOption_TXT_EstimatedExposure,test);
				se.element().checkUncheckOrValidate(getGL_SpecialityOption_CHK_LimitedAbducCov(strGL_SpecialityOption_CHK_LimitedAbducCov),strGL_SpecialityOption_CHK_LimitedAbducCov,test);
				se.element().enterOrValidateText(getGL_SpecialityOption_TXT_Premium(strGL_SpecialityOption_TXT_Premium),strGL_SpecialityOption_TXT_Premium,test);
				se.element().enterOrValidateText(getGL_SpecialityOption_TXT_OverridePremium(strGL_SpecialityOption_TXT_OverridePremium),strGL_SpecialityOption_TXT_OverridePremium,test);
				se.element().enterOrValidateText(getGL_SpecialityOption_TXT_OverridePremiumReason(strGL_SpecialityOption_TXT_OverridePremiumReason),strGL_SpecialityOption_TXT_OverridePremiumReason,test);
				se.element().checkUncheckOrValidate(getGL_SpecialityOption_CHK_ExcessMedPaymntsCov(strGL_SpecialityOption_CHK_ExcessMedPaymntsCov),strGL_SpecialityOption_CHK_ExcessMedPaymntsCov,test);
				/*se.element().enterOrValidateText(getGL_SpecialityOption_TXT_Limits_Lookup(strGL_SpecialityOption_TXT_Limits_Lookup),strGL_SpecialityOption_TXT_Limits_Lookup,test);*/
				se.element().enterOrValidateText(getGL_SpecialityOption_TXT_Limits(strGL_SpecialityOption_TXT_Limits),strGL_SpecialityOption_TXT_Limits,test);
				se.element().selectPopupWithMagnifier(getGL_SpecialityOption_TXT_Limits(strGL_SpecialityOption_TXT_Limits),getGL_SpecialityOption_TXT_LimitsSearch(strGL_SpecialityOption_TXT_Limits), strGL_SpecialityOption_TXT_Limits,constants.NA, strGL_SpecialityOption_TXT_Limits, constants.NA, constants.NA, constants.NA, test);
				
				se.element().checkUncheckOrValidate(getGL_SpecialityOption_CHK_ExcessMedPaymntsCovForVolunteers(strGL_SpecialityOption_CHK_ExcessMedPaymntsCovForVolunteers),strGL_SpecialityOption_CHK_ExcessMedPaymntsCovForVolunteers,test);
				se.element().checkUncheckOrValidate(getGL_SpecialityOption_CHK_LimitedWaterActivityCov(strGL_SpecialityOption_CHK_LimitedWaterActivityCov),strGL_SpecialityOption_CHK_LimitedWaterActivityCov,test);
				se.element().checkUncheckOrValidate(getGL_SpecialityOption_CHK_SwimmingPool(strGL_SpecialityOption_CHK_SwimmingPool),strGL_SpecialityOption_CHK_SwimmingPool,test);
				se.element().enterOrValidateText(getGL_SpecialityOption_TXT_SwimmingPool_Limits(strGL_SpecialityOption_TXT_SwimmingPool_Limits),strGL_SpecialityOption_TXT_SwimmingPool_Limits,test);
				se.element().checkUncheckOrValidate(getGL_SpecialityOption_CHK_WadingPool(strGL_SpecialityOption_CHK_WadingPool),strGL_SpecialityOption_CHK_WadingPool,test);
				se.element().enterOrValidateText(getGL_SpecialityOption_TXT_WadingPool_Limits(strGL_SpecialityOption_TXT_WadingPool_Limits),strGL_SpecialityOption_TXT_WadingPool_Limits,test);
				se.element().checkUncheckOrValidate(getGL_SpecialityOption_CHK_OtherWaterActivity(strGL_SpecialityOption_CHK_OtherWaterActivity),strGL_SpecialityOption_CHK_OtherWaterActivity,test);
				//se.element().Click(getGL_SpecialityOption_TXT_OccLimit_Lookup(), test);
				
				/*se.element().enterOrValidateText(getGL_SpecialityOption_TXT_OccLimit(strGL_SpecialityOption_TXT_OccLimit),strGL_SpecialityOption_TXT_OccLimit,test);*/
				se.element().Click(getGL_SpecialityOption_TXT_OccLimit(strGL_SpecialityOption_TXT_OccLimit), test);
				
				
				/*se.element().enterOrValidateText(getGL_SpecialityOption_TXT_OccLimit(strGL_SpecialityOption_TXT_OccLimit),strGL_SpecialityOption_TXT_OccLimit,test);*/
				se.element().enterOrValidateText(getGL_SpecialityOption_TXT_AggLimit(strGL_SpecialityOption_TXT_AggLimit),strGL_SpecialityOption_TXT_AggLimit,test);
				
				
				se.element().checkUncheckOrValidate(getGL_SpecialityOption_CHK_LimitedDogAndCatCov(strGL_SpecialityOption_CHK_LimitedDogAndCatCov),strGL_SpecialityOption_CHK_LimitedDogAndCatCov,test);
				//se.element().Click(getGL_SpecialityOption_TXT_DogCatCov_Limits_Lookup(), test);
				/*se.element().enterOrValidateText(getGL_SpecialityOption_TXT_DogCatCov_Limits_Lookup(strGL_SpecialityOption_TXT_DogCatCov_Limits_Lookup),strGL_SpecialityOption_TXT_DogCatCov_Limits_Lookup,test);*/
				
				//se.element().enterOrValidateText(getGL_SpecialityOption_TXT_DogCatCov_Limits(strGL_SpecialityOption_TXT_DogCatCov_Limits),strGL_SpecialityOption_TXT_DogCatCov_Limits,test);
				se.element().selectPopupWithMagnifier(getGL_SpecialityOption_TXT_DogCatCov_Limits(strGL_SpecialityOption_TXT_DogCatCov_Limits),getGL_SpecialityOption_TXT_DogCatCov_LimitsSearch(strGL_SpecialityOption_TXT_DogCatCov_Limits), strGL_SpecialityOption_TXT_DogCatCov_Limits,constants.NA, strGL_SpecialityOption_TXT_DogCatCov_Limits, constants.NA, constants.NA, constants.NA, test);
				//se.element().Click(getGL_SpecialityOption_TXT_DogCatCov_Limits(strGL_SpecialityOption_TXT_DogCatCov_Limits), test);
				
				se.element().checkUncheckOrValidate(getGL_SpecialityOption_CHK_CoverageforDesignatedSports(strGL_SpecialityOption_CHK_CoverageforDesignatedSports),strGL_SpecialityOption_CHK_CoverageforDesignatedSports,test);
				se.element().enterOrValidateText(getGL_SpecialityOption_TXT_DescOfSports(strGL_SpecialityOption_TXT_DescOfSports),strGL_SpecialityOption_TXT_DescOfSports,test);
				se.element().checkUncheckOrValidate(getGL_SpecialityOption_CHK_SnowmobileAndRecrVehicleLiab(strGL_SpecialityOption_CHK_SnowmobileAndRecrVehicleLiab),strGL_SpecialityOption_CHK_SnowmobileAndRecrVehicleLiab,test);
				se.element().enterOrValidateText(getGL_SpecialityOption_TXT_NumOfVehicles(strGL_SpecialityOption_TXT_NumOfVehicles),strGL_SpecialityOption_TXT_NumOfVehicles,test);
				se.element().checkUncheckOrValidate(getGL_SpecialityOption_CHK_LimitationOfCovSkinDmge(strGL_SpecialityOption_CHK_LimitationOfCovSkinDmge),strGL_SpecialityOption_CHK_LimitationOfCovSkinDmge,test);
				se.element().enterOrValidateText(getGL_SpecialityOption_TXT_NumOfTanningBeds(strGL_SpecialityOption_TXT_NumOfTanningBeds),strGL_SpecialityOption_TXT_NumOfTanningBeds,test);
				
				se.element().checkUncheckOrValidate(getGL_SpecialityOption_CHK_LimitationOfCovEmergencyMedicalServices(strGL_SpecialityOption_CHK_LimitationOfCovEmergencyMedicalServices),strGL_SpecialityOption_CHK_LimitationOfCovEmergencyMedicalServices,test);
				se.element().enterOrValidateText(getGL_SpecialityOption_TXT_LimOfCovEmerMediServ_OccurenceLimit(strGL_SpecialityOption_TXT_LimOfCovEmerMediServ_OccurenceLimit),strGL_SpecialityOption_TXT_LimOfCovEmerMediServ_OccurenceLimit,test);
				se.element().enterOrValidateText(getGL_SpecialityOption_TXT_LimOfCovEmerMediServ_AggregateLimit(strGL_SpecialityOption_TXT_LimOfCovEmerMediServ_AggregateLimit),strGL_SpecialityOption_TXT_LimOfCovEmerMediServ_AggregateLimit,test);
				se.element().enterOrValidateText(getGL_SpecialityOption_TXT_LimOfCovEmerMediServ_Premium(strGL_SpecialityOption_TXT_LimOfCovEmerMediServ_Premium),strGL_SpecialityOption_TXT_LimOfCovEmerMediServ_Premium,test);
				se.element().enterOrValidateText(getGL_SpecialityOption_TXT_LimOfCovEmerMediServ_OverridePremium(strGL_SpecialityOption_TXT_LimOfCovEmerMediServ_OverridePremium),strGL_SpecialityOption_TXT_LimOfCovEmerMediServ_OverridePremium,test);
				
				
				se.element().checkUncheckOrValidate(getGL_SpecialityOption_CHK_MaximumWageLevel(strGL_SpecialityOption_CHK_MaximumWageLevel),strGL_SpecialityOption_CHK_MaximumWageLevel,test);
				se.element().enterOrValidateText(getGL_SpecialityOption_TXT_MaximumHourlyWage(strGL_SpecialityOption_TXT_MaximumHourlyWage),strGL_SpecialityOption_TXT_MaximumHourlyWage,test);
				se.element().enterOrValidateText(getGL_SpecialityOption_TXT_MaxHourlyWage_Premium(strGL_SpecialityOption_TXT_MaxHourlyWage_Premium),strGL_SpecialityOption_TXT_MaxHourlyWage_Premium,test);
				se.element().enterOrValidateText(getGL_SpecialityOption_TXT_MaxHourlyWage_OverridePremium(strGL_SpecialityOption_TXT_MaxHourlyWage_OverridePremium),strGL_SpecialityOption_TXT_MaxHourlyWage_OverridePremium,test);
				se.element().enterOrValidateText(getGL_SpecialityOption_TXT_MaxHourlyWage_OverridePremiumReason(strGL_SpecialityOption_TXT_MaxHourlyWage_OverridePremiumReason),strGL_SpecialityOption_TXT_MaxHourlyWage_OverridePremiumReason,test);
				
				se.element().checkUncheckOrValidate(getGL_SpecialityOption_CHK_ProffLiabOcc(strGL_SpecialityOption_CHK_ProffLiabOcc),strGL_SpecialityOption_CHK_ProffLiabOcc,test);
				//se.element().enterOrValidateText(getGL_SpecialityOption_TXT_EachWrongfulActLimit(strGL_SpecialityOption_TXT_EachWrongfulActLimit),strGL_SpecialityOption_TXT_EachWrongfulActLimit,test);
				se.element().selectPopupWithMagnifier(getGL_SpecialityOption_TXT_EachWrongfulActLimit(strGL_SpecialityOption_TXT_EachWrongfulActLimit),getGL_SpecialityOption_TXT_EachWrongfulActLimitSearch(),strGL_SpecialityOption_TXT_EachWrongfulActLimit,constants.NA,strGL_SpecialityOption_TXT_EachWrongfulActLimit,strGL_SpecialityOption_TXT_ProfLiabOcc_AggregateLimit,constants.NA,constants.NA,test);
				//se.element().enterOrValidateText(getGL_SpecialityOption_TXT_ProfLiabOcc_AggregateLimit(strGL_SpecialityOption_TXT_ProfLiabOcc_AggregateLimit),strGL_SpecialityOption_TXT_ProfLiabOcc_AggregateLimit,test);
				//se.element().enterOrValidateText(getGL_SpecialityOption_TXT_ProfLiabOcc_Deductible(strGL_SpecialityOption_TXT_ProfLiabOcc_Deductible),strGL_SpecialityOption_TXT_ProfLiabOcc_Deductible,test);
				se.element().selectPopupWithMagnifier(getGL_SpecialityOption_TXT_ProfLiabOcc_Deductible(strGL_SpecialityOption_TXT_ProfLiabOcc_Deductible),getGL_SpecialityOption_TXT_ProfLiabOcc_DeductibleSearch(),strGL_SpecialityOption_TXT_ProfLiabOcc_Deductible,constants.NA,strGL_SpecialityOption_TXT_ProfLiabOcc_Deductible,constants.NA,constants.NA,constants.NA,test);
				
				se.element().checkUncheckOrValidate(getGL_SpecialityOption_CHK_ProfLiabOcc_HumanServices(strGL_SpecialityOption_CHK_ProfLiabOcc_HumanServices),strGL_SpecialityOption_CHK_ProfLiabOcc_HumanServices,test);
				se.element().checkUncheckOrValidate(getGL_SpecialityOption_CHK_ProfLiabOcc_CompanionCareRisk(strGL_SpecialityOption_CHK_ProfLiabOcc_CompanionCareRisk),strGL_SpecialityOption_CHK_ProfLiabOcc_CompanionCareRisk,test);
				se.element().checkUncheckOrValidate(getGL_SpecialityOption_CHK_ProfLiabOcc_SupportiveCareServicesRisk(strGL_SpecialityOption_CHK_ProfLiabOcc_SupportiveCareServicesRisk),strGL_SpecialityOption_CHK_ProfLiabOcc_SupportiveCareServicesRisk,test);
				se.element().checkUncheckOrValidate(getGL_SpecialityOption_CHK_ProfLiabOcc_FitnessAndRecreation(strGL_SpecialityOption_CHK_ProfLiabOcc_FitnessAndRecreation),strGL_SpecialityOption_CHK_ProfLiabOcc_FitnessAndRecreation,test);
				se.element().checkUncheckOrValidate(getGL_SpecialityOption_CHK_ProfLiabOcc_DetectiveAndSecurity(strGL_SpecialityOption_CHK_ProfLiabOcc_DetectiveAndSecurity),strGL_SpecialityOption_CHK_ProfLiabOcc_DetectiveAndSecurity,test);
				se.element().checkUncheckOrValidate(getGL_SpecialityOption_CHK_ProfLiabOcc_SpecifiedProfession(strGL_SpecialityOption_CHK_ProfLiabOcc_SpecifiedProfession),strGL_SpecialityOption_CHK_ProfLiabOcc_SpecifiedProfession,test);
				se.element().enterOrValidateText(getGL_SpecialityOption_TXT_ProfLiabOcc_SpecifiedProfession(strGL_SpecialityOption_TXT_ProfLiabOcc_SpecifiedProfession),strGL_SpecialityOption_TXT_ProfLiabOcc_SpecifiedProfession,test);
			
				se.element().Click(getNext(),test);
			
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for GL_SpecialityOption ", true, false, true, test);
					
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