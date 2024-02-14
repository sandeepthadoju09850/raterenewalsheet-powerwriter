package pw.pages.GL;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import pw.Constants.constants;
import pw.OR.OR_GL;

public class GeneralLiability extends OR_GL{
	
	
	public void GeneralLiabilityPage(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase(constants.GL_Main)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.GL_Main, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			try {
				GeneralLiability GeneralLiabilityPage = TestPageFactory.initElements(se,GeneralLiability.class);
				GeneralLiabilityPage.generalLiabilityDetailsSection(row, test);
				GeneralLiabilityPage.generalLiabilityWrapSection(row, test);
				GeneralLiabilityPage.ratingPlansSection(row, test);
				GeneralLiabilityPage.kyTaxInformation(row, test);
				se.element().clickElement(getNext());
				se.util().sleep(10000);
				
				
			} catch (Exception e) {
				se.verify().verifyEquals("Failed to fill in details for TransitFloater page ", true, false,true, test);
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

	public void generalLiabilityDetailsSection(Map<String, String> row, ExtentTest test) throws IOException {
		String strGL_TXT_CoverageType = (String) row.get("GL_TXT_CoverageType");
		String strGL_TXT_PrimaryState = (String) row.get("GL_TXT_PrimaryState");
		String strGL_TXT_PrimaryCity = (String) row.get("GL_TXT_PrimaryCity");
		String strGL_TXT_Zip = (String) row.get("GL_TXT_Zip");
		String strGL_CHK_Premises_Operations = (String) row.get("GL_CHK_Premises/Operations");
		String strGL_CHK_Product_CompletedOperations = (String) row.get("GL_CHK_Product/CompletedOperations");
		String strGL_CHK_BroadFormProdandComOpYes = (String) row.get("GL_CHK_BroadFormProdandComOpYes");
		String strGL_CHK_BroadFormProdandComOpNo = (String) row.get("GL_CHK_BroadFormProdandComOpNo");
		String strGL_CHK_FellowEmployeeCov = (String) row.get("GL_CHK_FellowEmployeeCov");
		String strGL_CHK_EmployeeBenefitLiability = (String) row.get("GL_CHK_EmployeeBenefitLiability");
		String strGL_CHK_LiquorCov = (String) row.get("GL_CHK_LiquorCov");
		String strGL_CHK_StopGapEmployersLiabCov = (String) row.get("GL_CHK_StopGapEmployersLiabCov");
		String strGL_TXT_BodilyInjuryByAccdntEachAccdnt = (String) row.get("GL_TXT_BodilyInjuryByAccdntEachAccdnt");
		String strGL_TXT_BodilyInjuryByDiseaseAggregateOption = (String) row.get("GL_TXT_BodilyInjuryByDiseaseAggregateOption");
		String strGL_TXT_BodilyInjuryByDiseaseEachEmployeeOption = (String) row.get("GL_TXT_BodilyInjuryByDiseaseEachEmployeeOption");
		String strGL_TXT_BodilyInjuryByDiseaseAgg = (String) row.get("GL_TXT_BodilyInjuryByDiseaseAgg");
		String strGL_TXT_BodilyInjuryByDiseaseEachEmployee = (String) row.get("GL_TXT_BodilyInjuryByDiseaseEachEmployee");
		String strGL_TXT_Payroll = (String) row.get("GL_TXT_Payroll");
		String strGL_CHK_InjuryToLeasedWorkersCoverage = (String) row.get("GL_CHK_InjuryToLeasedWorkersCoverage");
		String strGL_CHK_TerrorismCertifiedActCov = (String) row.get("GL_CHK_TerrorismCertifiedActCov");
		String strGL_DDN_PremiseHazardGrade = (String) row.get("GL_DDN_PremiseHazardGrade");
		String strGL_DDN_ProductsHazardGrade = (String) row.get("GL_DDN_ProductsHazardGrade");
		String strGL_CHK_MiscCoverage = (String) row.get("GL_CHK_MiscCoverage");
		String strGL_CHK_ProfessionalLiabCov = (String) row.get("GL_CHK_ProfessionalLiabCov");
		String strGL_CHK_FloristProfLiab = (String) row.get("GL_CHK_FloristProfLiab");
		String strGL_CHK_FuneralDirectorsOrCemetryProf = (String) row.get("GL_CHK_FuneralDirectorsOrCemetryProf");
		String strGL_TXT_Limits = (String) row.get("GL_TXT_Limits");
		String strGL_TXT_NoOfFuneralsorBurialsAnnually = (String) row.get("GL_TXT_NoOfFuneralsorBurialsAnnually");
		String strGL_CHK_PetProfessional = (String) row.get("GL_CHK_PetProfessional");
		String strGL_TXT_PetProf_Limits = (String) row.get("GL_TXT_PetProf_Limits");
		String strGL_CHK_PrintersErrorsandOmissions = (String) row.get("GL_CHK_PrintersErrorsandOmissions");
		String strGL_TXT_PrintersErrorsandOmissions_Limits = (String) row.get("GL_TXT_PrintersErrorsandOmissions_Limits");
		String strGL_TXT_Premium = (String) row.get("GL_TXT_Premium");
		String strGL_TXT_OverridePremium = (String) row.get("GL_TXT_OverridePremium");
		String strGL_CHK_CorrectionOfWork = (String) row.get("GL_CHK_CorrectionOfWork");
		String strGL_TXT_CorrectionOfWork_Limits = (String) row.get("GL_TXT_CorrectionOfWork_Limits");
		String strGL_TXT_CorrectionOfWork_Deductible = (String) row.get("GL_TXT_CorrectionOfWork_Deductible");
		String strGL_TXT_CorrectionOfWork_Premium = (String) row.get("GL_TXT_CorrectionOfWork_Premium");
		String strGL_TXT_CorrectionOfWork_OverridePremium = (String) row.get("GL_TXT_CorrectionOfWork_OverridePremium");
		String strGL_CHK_SalonServices = (String) row.get("GL_CHK_SalonServices");
		String strGL_TXT_SalonServices_Limits = (String) row.get("GL_TXT_SalonServices_Limits");
		String strGL_TXT_BeauticiansFullTime = (String) row.get("GL_TXT_BeauticiansFullTime");
		String strGL_TXT_BeauticiansPartTime = (String) row.get("GL_TXT_BeauticiansPartTime");
		String strGL_TXT_BarberFullTime = (String) row.get("GL_TXT_BarberFullTime");
		String strGL_TXT_BarberPartTime = (String) row.get("GL_TXT_BarberPartTime");
		String strGL_TXT_Manicurist = (String) row.get("GL_TXT_Manicurist");
		String strGL_CHK_Other = (String) row.get("GL_CHK_Other");
		String strGL_TXT_DescriptionOfAdditionalServices = (String) row.get("GL_TXT_DescriptionOfAdditionalServices");
		String strGL_TXT_NumberOfProviders = (String) row.get("GL_TXT_NumberOfProviders");
		String strGL_TXT_Other_Premium = (String) row.get("GL_TXT_Other_Premium");
		String strGL_CHK_VeterinariansProffLiab = (String) row.get("GL_CHK_VeterinariansProffLiab");
		String strGL_TXT_VeterinariansProffLiab_Limits = (String) row.get("GL_TXT_VeterinariansProffLiab_Limits");
		String strGL_TXT_PerVeterinarian = (String) row.get("GL_TXT_PerVeterinarian");
		String strGL_TXT_PerEmployee_Technician = (String) row.get("GL_TXT_PerEmployee/Technician");
		String strGL_CHK_SelfStorageLegalLiabOpt = (String) row.get("GL_CHK_SelfStorageLegalLiabOpt");
		String strGL_CHK_CustGoodsLegalLiab = (String) row.get("GL_CHK_CustGoodsLegalLiab");
		String strGL_TXT_CustGoodsLegalLiab_Limits = (String) row.get("GL_TXT_CustGoodsLegalLiab_Limits");
		String strGL_CHK_SalesandDisposalLegalLiab = (String) row.get("GL_CHK_SalesandDisposalLegalLiab");
		String strGL_TXT_SalesandDisposalLegLiab_Limits = (String) row.get("GL_TXT_SalesandDisposalLegLiab_Limits");
		String strGL_TXT_BodilyInjuryByAccdntEachAccdntIndex = (String) row.get("GL_TXT_BodilyInjuryByAccdntEachAccdntIndex");
		String transaction = (String) row.get("Transaction Name");
		
		try{
			se.log().logTestStep("GeneralLiability_Details");
			test.log(LogStatus.INFO, " GeneralLiability_Details section","Transaction Step : "+transaction + "<br>" +"Page : GeneralLiability Page");
			se.verify().verifyEquals("GeneralLiability_Details section  of GeneralLiability page ", getPagecontainingtext("General Liability").isDisplayed(),true, true,test);
			se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_CoverageType(strGL_TXT_CoverageType), getGeneral_Liability_TXT_CoverageTypeSearch(strGL_TXT_CoverageType), strGL_TXT_CoverageType, "N/A", strGL_TXT_CoverageType, "N/A", "N/A", "N/A", test);
			se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_PrimaryState(strGL_TXT_PrimaryState), getGeneral_Liability_TXT_PrimaryStateSearch(strGL_TXT_PrimaryState), strGL_TXT_PrimaryState, "N/A","N/A", "N/A", "N/A", "N/A", test);
			se.element().enterOrValidateText(getGL_TXT_City(strGL_TXT_PrimaryCity),strGL_TXT_PrimaryCity,test);
			se.element().selectPopupWithMagnifier(getGL_TXT_Zip(strGL_TXT_Zip), getGL_TXT_Zip_Search(strGL_TXT_Zip), strGL_TXT_PrimaryCity, constants.Yes, strGL_TXT_PrimaryCity, strGL_TXT_Zip, constants.NA, constants.NA, test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_Premises_Operations(strGL_CHK_Premises_Operations),strGL_CHK_Premises_Operations,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_Product_CompletedOperations(strGL_CHK_Product_CompletedOperations),strGL_CHK_Product_CompletedOperations,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_BroadFormProdandComOpYes(strGL_CHK_BroadFormProdandComOpYes),strGL_CHK_BroadFormProdandComOpYes,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_BroadFormProdandComOpNo(strGL_CHK_BroadFormProdandComOpNo),strGL_CHK_BroadFormProdandComOpNo,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_FellowEmployeeCov(strGL_CHK_FellowEmployeeCov),strGL_CHK_FellowEmployeeCov,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_EmployeeBenefitLiability(strGL_CHK_EmployeeBenefitLiability),strGL_CHK_EmployeeBenefitLiability,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_LiquorCov(strGL_CHK_LiquorCov),strGL_CHK_LiquorCov,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_StopGapEmployersLiabCov(strGL_CHK_StopGapEmployersLiabCov),strGL_CHK_StopGapEmployersLiabCov,test);
			se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_BodilyInjuryByAccdntEachAccdnt(strGL_TXT_BodilyInjuryByAccdntEachAccdnt), getGeneral_Liability_BTN_BodilyInjuryByAccdntEachAccdnt(strGL_TXT_BodilyInjuryByAccdntEachAccdnt), strGL_TXT_BodilyInjuryByAccdntEachAccdnt, "N/A", strGL_TXT_BodilyInjuryByAccdntEachAccdnt, strGL_TXT_BodilyInjuryByDiseaseAggregateOption, strGL_TXT_BodilyInjuryByDiseaseEachEmployeeOption, "N/A", test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_BodilyInjuryByDiseaseAgg(strGL_TXT_BodilyInjuryByDiseaseAgg),strGL_TXT_BodilyInjuryByDiseaseAgg,test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_BodilyInjuryByDiseaseEachEmployee(strGL_TXT_BodilyInjuryByDiseaseEachEmployee),strGL_TXT_BodilyInjuryByDiseaseEachEmployee,test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_Payroll(strGL_TXT_Payroll),strGL_TXT_Payroll,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_InjuryToLeasedWorkersCoverage(strGL_CHK_InjuryToLeasedWorkersCoverage),strGL_CHK_InjuryToLeasedWorkersCoverage,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_TerrorismCertifiedActCov(strGL_CHK_TerrorismCertifiedActCov),strGL_CHK_TerrorismCertifiedActCov,test);
			se.element().selectElementDDrOrValidateText(getGeneral_Liability_DDN_PremiseHazardGrade(strGL_DDN_PremiseHazardGrade),strGL_DDN_PremiseHazardGrade,test);
			se.element().selectElementDDrOrValidateText(getGeneral_Liability_DDN_ProductsHazardGrade(strGL_DDN_ProductsHazardGrade),strGL_DDN_ProductsHazardGrade,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_MiscCoverage(strGL_CHK_MiscCoverage),strGL_CHK_MiscCoverage,test);
			se.util().sleep(3000);
			if(!strGL_CHK_ProfessionalLiabCov.equalsIgnoreCase(constants.NA)){
				se.element().waitForElementIsDisplayed(General_Liability_CHK_ProfessionalLiabCov, 5);
				se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_ProfessionalLiabCov(strGL_CHK_ProfessionalLiabCov),strGL_CHK_ProfessionalLiabCov,test);
				
			}
			if(!strGL_CHK_FloristProfLiab.equalsIgnoreCase(constants.NA)){
				se.element().waitForElementIsDisplayed(General_Liability_CHK_FloristProfLiab, 10);
				se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_FloristProfLiab(strGL_CHK_FloristProfLiab),strGL_CHK_FloristProfLiab,test);
				
			}
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_FuneralDirectorsOrCemetryProf(strGL_CHK_FuneralDirectorsOrCemetryProf),strGL_CHK_FuneralDirectorsOrCemetryProf,test);
			se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_Limits(strGL_TXT_Limits), getGeneral_Liability_TXT_LimitsSearch(strGL_TXT_Limits), strGL_TXT_Limits, "N/A", strGL_TXT_Limits, "N/A", "N/A", "N/A", test);
			se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_NoOfFuneralsorBurialsAnnually(strGL_TXT_NoOfFuneralsorBurialsAnnually), getGeneral_Liability_TXT_NoOfFuneralsorBurialsAnnuallySearch(strGL_TXT_NoOfFuneralsorBurialsAnnually), strGL_TXT_NoOfFuneralsorBurialsAnnually, "N/A", strGL_TXT_NoOfFuneralsorBurialsAnnually, "N/A", "N/A", "N/A", test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_PetProfessional(strGL_CHK_PetProfessional),strGL_CHK_PetProfessional,test);
			se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_PetProf_Limits(strGL_TXT_PetProf_Limits), getGeneral_Liability_TXT_PetProf_LimitsSearch(strGL_TXT_PetProf_Limits), strGL_TXT_PetProf_Limits, "N/A", strGL_TXT_PetProf_Limits, "N/A", "N/A", "N/A", test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_PrintersErrorsandOmissions(strGL_CHK_PrintersErrorsandOmissions),strGL_CHK_PrintersErrorsandOmissions,test);
			se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_PrintersErrorsandOmissions_Limits(strGL_TXT_PrintersErrorsandOmissions_Limits), getGeneral_Liability_TXT_PrintersErrorsandOmissions_LimitsSearch(strGL_TXT_PrintersErrorsandOmissions_Limits), strGL_TXT_PrintersErrorsandOmissions_Limits, "N/A", strGL_TXT_PrintersErrorsandOmissions_Limits,"N/A", "N/A", "N/A", test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_Premium(strGL_TXT_Premium),strGL_TXT_Premium,test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_OverridePremium(strGL_TXT_OverridePremium),strGL_TXT_OverridePremium,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_CorrectionOfWork(strGL_CHK_CorrectionOfWork),strGL_CHK_CorrectionOfWork,test);
			se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_CorrectionOfWork_Limits(strGL_TXT_CorrectionOfWork_Limits), getGeneral_Liability_BTN_CorrectionOfWork_Limits_Lookup(strGL_TXT_CorrectionOfWork_Limits), strGL_TXT_CorrectionOfWork_Limits, "N/A", strGL_TXT_CorrectionOfWork_Limits, "N/A", "N/A", "N/A", test);
			se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_CorrectionOfWork_Deductible(strGL_TXT_CorrectionOfWork_Deductible), getGeneral_Liability_TXT_CorrectionOfWork_DeductibleSearch(strGL_TXT_CorrectionOfWork_Deductible), strGL_TXT_CorrectionOfWork_Deductible, "N/A", strGL_TXT_CorrectionOfWork_Deductible, "N/A", "N/A", "N/A", test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_CorrectionOfWork_Premium(strGL_TXT_CorrectionOfWork_Premium),strGL_TXT_CorrectionOfWork_Premium,test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_CorrectionOfWork_OverridePremium(strGL_TXT_CorrectionOfWork_OverridePremium),strGL_TXT_CorrectionOfWork_OverridePremium,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_SalonServices(strGL_CHK_SalonServices),strGL_CHK_SalonServices,test);
			se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_SalonServices_Limits(strGL_TXT_SalonServices_Limits), getGeneral_Liability_TXT_SalonServices_LimitsSearch(strGL_TXT_SalonServices_Limits), strGL_TXT_SalonServices_Limits, "N/A", strGL_TXT_SalonServices_Limits, "N/A", "N/A", "N/A", test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_BeauticiansFullTime(strGL_TXT_BeauticiansFullTime),strGL_TXT_BeauticiansFullTime,test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_BeauticiansPartTime(strGL_TXT_BeauticiansPartTime),strGL_TXT_BeauticiansPartTime,test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_BarberFullTime(strGL_TXT_BarberFullTime),strGL_TXT_BarberFullTime,test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_BarberPartTime(strGL_TXT_BarberPartTime),strGL_TXT_BarberPartTime,test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_Manicurist(strGL_TXT_Manicurist),strGL_TXT_Manicurist,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_Other(strGL_CHK_Other),strGL_CHK_Other,test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_DescriptionOfAdditionalServices(strGL_TXT_DescriptionOfAdditionalServices),strGL_TXT_DescriptionOfAdditionalServices,test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_NumberOfProviders(strGL_TXT_NumberOfProviders),strGL_TXT_NumberOfProviders,test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_Other_Premium(strGL_TXT_Other_Premium),strGL_TXT_Other_Premium,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_VeterinariansProffLiab(strGL_CHK_VeterinariansProffLiab),strGL_CHK_VeterinariansProffLiab,test);
			se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_VeterinariansProffLiab_Limits(strGL_TXT_VeterinariansProffLiab_Limits), getGeneral_Liability_TXT_VeterinariansProffLiab_LimitsSearch(strGL_TXT_VeterinariansProffLiab_Limits), strGL_TXT_VeterinariansProffLiab_Limits, "N/A", strGL_TXT_VeterinariansProffLiab_Limits, "N/A", "N/A", "N/A", test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_PerVeterinarian(strGL_TXT_PerVeterinarian),strGL_TXT_PerVeterinarian,test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_PerEmployee_Technician(strGL_TXT_PerEmployee_Technician),strGL_TXT_PerEmployee_Technician,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_SelfStorageLegalLiabOpt(strGL_CHK_SelfStorageLegalLiabOpt),strGL_CHK_SelfStorageLegalLiabOpt,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_CustGoodsLegalLiab(strGL_CHK_CustGoodsLegalLiab),strGL_CHK_CustGoodsLegalLiab,test);
			se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_CustGoodsLegalLiab_Limits(strGL_TXT_CustGoodsLegalLiab_Limits), getGeneral_Liability_BTN_CustGoodsLegalLiab_LimitsSearch(strGL_TXT_CustGoodsLegalLiab_Limits), strGL_TXT_CustGoodsLegalLiab_Limits, "N/A", strGL_TXT_CustGoodsLegalLiab_Limits, "N/A", "N/A", "N/A", test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_SalesandDisposalLegalLiab(strGL_CHK_SalesandDisposalLegalLiab),strGL_CHK_SalesandDisposalLegalLiab,test);
			se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_SalesandDisposalLegLiab_Limits(strGL_TXT_SalesandDisposalLegLiab_Limits), getGeneral_Liability_TXT_SalesandDisposalLegLiab_LimitsSearch(strGL_TXT_SalesandDisposalLegLiab_Limits), strGL_TXT_SalesandDisposalLegLiab_Limits, "N/A", strGL_TXT_SalesandDisposalLegLiab_Limits, "N/A", "N/A", "N/A", test);
		}
		catch(Exception e) {
			se.verify().verifyEquals("Failed to fill in details for GeneralLiability ", true, false,true, test);		
		}
	}

	public void generalLiabilityWrapSection(Map<String, String> row, ExtentTest test) throws IOException {
		String strGL_CHK_EliteGeneralLiabWrap = (String) row.get("GL_CHK_EliteGeneralLiabWrap");
		String strGL_CHK_GeneralLiabWrap = (String) row.get("GL_CHK_GeneralLiabWrap");
		String strGL_TXT_GeneralLiabWrapPremium = (String) row.get("GL_TXT_GeneralLiabWrapPremium");
		String strGL_TXT_OverrideGeneralLiabWrapPremium = (String) row.get("GL_TXT_OverrideGeneralLiabWrapPremium");
		String strGL_TXT_OverridePremiumReason = (String) row.get("GL_TXT_OverridePremiumReason");
		String strGL_CHK_GolfCourseGLWrap = (String) row.get("GL_CHK_GolfCourseGLWrap");
		String strGL_CHK_IncidentalMedMalpractice = (String) row.get("GL_CHK_IncidentalMedMalpractice");
		String strGL_TXT_IncidentalMedMalpracticePrem = (String) row.get("GL_TXT_IncidentalMedMalpracticePrem");
		String strGL_TXT_OverrideIncidentalMedMalpracticePrem = (String) row.get("GL_TXT_OverrideIncidentalMedMalpracticePrem");
		String strGL_CHK_ProductRecallExpense = (String) row.get("GL_CHK_ProductRecallExpense");
		String strGL_TXT_ProductRecallExpense_Limits = (String) row.get("GL_TXT_ProductRecallExpense_Limits");
		String strGL_TXT_ProductRecallExpense_Deductible = (String) row.get("GL_TXT_ProductRecallExpense_Deductible");
		String strGL_TXT_ProductRecallExpense_Premium = (String) row.get("GL_TXT_ProductRecallExpense_Premium");
		String strGL_TXT_ProductRecallExpense_OverridePremium = (String) row.get("GL_TXT_ProductRecallExpense_OverridePremium");
		String strGL_CHK_LostKeyCov = (String) row.get("GL_CHK_LostKeyCov");
		String strGL_TXT_EachSite = (String) row.get("GL_TXT_EachSite");
		String strGL_TXT_AggregatePopup = (String) row.get("GL_TXT_AggregatePopup");
		String strGL_TXT_Aggregate = (String) row.get("GL_TXT_Aggregate");
		String strGL_CHK_HiredAutoandNonOwnedLiabCov = (String) row.get("GL_CHK_HiredAutoandNonOwnedLiabCov");
		String strGL_CHK_DoesUMApplyinILYes = (String) row.get("GL_CHK_DoesUMApplyinILYes");
		String strGL_CHK_DoesUMApplyinILNo = (String) row.get("GL_CHK_DoesUMApplyinILNo");
		String strGL_CHK_DoesUIMApplyinILYes = (String) row.get("GL_CHK_DoesUIMApplyinILYes");
		String strGL_CHK_DoesUIMApplyinILNo = (String) row.get("GL_CHK_DoesUIMApplyinILNo");
		String strGL_CHK_LimitedFungiOrBacteriaCov = (String) row.get("GL_CHK_LimitedFungiOrBacteriaCov");
		String strGL_TXT_AggregateLimit = (String) row.get("GL_TXT_AggregateLimit");
		String strGL_TXT_Premium_LimitedFungiOrBacteriaCov = (String) row.get("GL_TXT_Premium_LimitedFungiOrBacteriaCov");
		String strGL_CHK_PestOrHerbAppVolPropDamageCov = (String) row.get("GL_CHK_PestOrHerbAppVolPropDamageCov");
		String strGL_TXT_JobSiteLimit = (String) row.get("GL_TXT_JobSiteLimit");
		String strGL_TXT_PestOrHerbAppVolPropDamageCov_Deductible = (String) row.get("GL_TXT_PestOrHerbAppVolPropDamageCov_Deductible");
		String strGL_CHK_VolPropDamageCov = (String) row.get("GL_CHK_VolPropDamageCov");
		String strGL_TXT_VolPropDamageCovOccLimit = (String) row.get("GL_TXT_VolPropDamageCovOccLimit");
		String strGL_TXT_VolPropDamageCovAggregateLimit = (String) row.get("GL_TXT_VolPropDamageCovAggregateLimit");
		String strGL_TXT_VolPropDamageCovDeductible = (String) row.get("GL_TXT_VolPropDamageCovDeductible");
		String strGL_CHK_VolPropDamage = (String) row.get("GL_CHK_VolPropDamage");
		String strGL_TXT_VolPropDamage_OccurenceLimit = (String) row.get("GL_TXT_VolPropDamage_OccurenceLimit");
		String strGL_TXT_VolPropDamage_AggregateLimit = (String) row.get("GL_TXT_VolPropDamage_AggregateLimit");
		String strGL_TXT_VolPropDamage_Deductible = (String) row.get("GL_TXT_VolPropDamage_Deductible");
		String strGL_CHK_ModifiedPollutionExclusion = (String) row.get("GL_CHK_ModifiedPollutionExclusion");
		String strGL_TXT_ModifiedPollutionExclusion_Limits = (String) row.get("GL_TXT_ModifiedPollutionExclusion_Limits");
		String strGL_TXT_ModifiedPollutionExclusion_Deductible = (String) row.get("GL_TXT_ModifiedPollutionExclusion_Deductible");
		String strGL_TXT_ModifiedPollutionExclusion_Premium = (String) row.get("GL_TXT_ModifiedPollutionExclusion_Premium");
		String strGL_TXT_ModifiedPollutionExclusion_OverridePremium = (String) row.get("GL_TXT_ModifiedPollutionExclusion_OverridePremium");
		String strGL_CHK_ElectronicDataLiability = (String) row.get("GL_CHK_ElectronicDataLiability");
		String strGL_TXT_ElectronicDataLiability_Limit = (String) row.get("GL_TXT_ElectronicDataLiability_Limit");
		String strGL_TXT_ElectronicDataLiability_Deductible = (String) row.get("GL_TXT_ElectronicDataLiability_Deductible");
		String strGL_CHK_ConstructionLimitation = (String) row.get("GL_CHK_ConstructionLimitation");
		String strGL_CHK_ConstructionLimWithLimitedEarthMov = (String) row.get("GL_CHK_ConstructionLimWithLimitedEarthMov");
		String strGL_TXT_ConstructionLimWithLimitedEarthMov_Limit = (String) row.get("GL_TXT_ConstructionLimWithLimitedEarthMov_Limit");
		String strGL_TXT_ConstructionLimWithLimitedEarthMov_Deductible = (String) row.get("GL_TXT_ConstructionLimWithLimitedEarthMov_Deductible");
		String transaction = (String) row.get("Transaction Name");
		try{
			se.log().logTestStep("General Liability Wrap Section");
			test.log(LogStatus.INFO, "General Liability Wrap section","Transaction Step : "+transaction + "<br>" +"Page : GeneralLiability Page");
			se.element().checkUncheckOrValidate(getGL_CHK_EliteGeneralLiabWrap(strGL_CHK_EliteGeneralLiabWrap),strGL_CHK_EliteGeneralLiabWrap,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_GeneralLiabWrap(strGL_CHK_GeneralLiabWrap),strGL_CHK_GeneralLiabWrap,test);
			if(se.element().isElementPresent(InfoOKbutton)){
				se.element().Click(getInfoOKbutton(), test);
			}
			se.element().enterOrValidateText(getGeneral_Liability_TXT_GeneralLiabWrapPremium(strGL_TXT_GeneralLiabWrapPremium),strGL_TXT_GeneralLiabWrapPremium,test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_OverrideGeneralLiabWrapPremium(strGL_TXT_OverrideGeneralLiabWrapPremium),strGL_TXT_OverrideGeneralLiabWrapPremium,test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_OverridePremiumReason(strGL_TXT_OverridePremiumReason),strGL_TXT_OverridePremiumReason,test);
			se.element().checkUncheckOrValidate(getGL_CHK_GolfCourseGLWrap(strGL_CHK_GolfCourseGLWrap),strGL_CHK_GolfCourseGLWrap,test);
			se.element().checkUncheckOrValidate(getGL_CHK_IncidentalMedMalpractice(strGL_CHK_IncidentalMedMalpractice),strGL_CHK_IncidentalMedMalpractice,test);
			se.element().enterOrValidateText(getGL_TXT_IncidentalMedMalpracticePrem(strGL_TXT_IncidentalMedMalpracticePrem),strGL_TXT_IncidentalMedMalpracticePrem,test);
			se.element().enterOrValidateText(getGL_TXT_OverrideIncidentalMedMalpracticePrem(strGL_TXT_OverrideIncidentalMedMalpracticePrem),strGL_TXT_OverrideIncidentalMedMalpracticePrem,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_ProductRecallExpense(strGL_CHK_ProductRecallExpense),strGL_CHK_ProductRecallExpense,test);
			se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_ProductRecallExpense_Limits(strGL_TXT_ProductRecallExpense_Limits), getGeneral_Liability_TXT_ProductRecallExpense_LimitsSearch(strGL_TXT_ProductRecallExpense_Limits), strGL_TXT_ProductRecallExpense_Limits, "N/A", strGL_TXT_ProductRecallExpense_Limits,"N/A", "N/A", "N/A", test);
			se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_ProductRecallExpense_Deductible(strGL_TXT_ProductRecallExpense_Deductible), getGeneral_Liability_BTN_ProductRecallExpense_DeductibleSearch(strGL_TXT_ProductRecallExpense_Deductible), strGL_TXT_ProductRecallExpense_Deductible, "N/A", strGL_TXT_ProductRecallExpense_Deductible,"N/A", "N/A", "N/A", test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_ProductRecallExpense_Premium(strGL_TXT_ProductRecallExpense_Premium),strGL_TXT_ProductRecallExpense_Premium,test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_ProductRecallExpense_OverridePremium(strGL_TXT_ProductRecallExpense_OverridePremium),strGL_TXT_ProductRecallExpense_OverridePremium,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_LostKeyCov(strGL_CHK_LostKeyCov),strGL_CHK_LostKeyCov,test);
			se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_EachSite(strGL_TXT_EachSite), getGeneral_Liability_TXT_EachSiteSearch(strGL_TXT_EachSite), strGL_TXT_EachSite, "N/A", strGL_TXT_EachSite,strGL_TXT_AggregatePopup, "N/A", "N/A", test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_Aggregate(strGL_TXT_Aggregate),strGL_TXT_Aggregate,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_HiredAutoandNonOwnedLiabCov(strGL_CHK_HiredAutoandNonOwnedLiabCov),strGL_CHK_HiredAutoandNonOwnedLiabCov,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_DoesUMApplyinILYes(strGL_CHK_DoesUMApplyinILYes),strGL_CHK_DoesUMApplyinILYes,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_DoesUMApplyinILNo(strGL_CHK_DoesUMApplyinILNo),strGL_CHK_DoesUMApplyinILNo,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_DoesUIMApplyinILYes(strGL_CHK_DoesUIMApplyinILYes),strGL_CHK_DoesUIMApplyinILYes,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_DoesUIMApplyinILNo(strGL_CHK_DoesUIMApplyinILNo),strGL_CHK_DoesUIMApplyinILNo,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_LimitedFungiOrBacteriaCov(strGL_CHK_LimitedFungiOrBacteriaCov),strGL_CHK_LimitedFungiOrBacteriaCov,test);
			se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_AggregateLimit(strGL_TXT_AggregateLimit), getGeneral_Liability_BTN_AggregateLimitSearch(strGL_TXT_AggregateLimit), strGL_TXT_AggregateLimit, "N/A", strGL_TXT_AggregateLimit,"N/A", "N/A", "N/A", test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_Premium_LimitedFungiOrBacteriaCov(strGL_TXT_Premium_LimitedFungiOrBacteriaCov),strGL_TXT_Premium_LimitedFungiOrBacteriaCov,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_PestOrHerbAppVolPropDamageCov(strGL_CHK_PestOrHerbAppVolPropDamageCov),strGL_CHK_PestOrHerbAppVolPropDamageCov,test);
			se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_JobSiteLimit(strGL_TXT_JobSiteLimit), getGeneral_Liability_BTN_JobSiteLimitSearch(strGL_TXT_JobSiteLimit), strGL_TXT_JobSiteLimit, "N/A", strGL_TXT_JobSiteLimit,"N/A", "N/A", "N/A", test);
			se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_PestOrHerbAppVolPropDamageCov_Deductible(strGL_TXT_PestOrHerbAppVolPropDamageCov_Deductible), getGeneral_Liability_BTN_PestOrHerbAppVolPropDamageCov_DeductibleSearch(strGL_TXT_PestOrHerbAppVolPropDamageCov_Deductible), strGL_TXT_PestOrHerbAppVolPropDamageCov_Deductible, "N/A", strGL_TXT_PestOrHerbAppVolPropDamageCov_Deductible,"N/A", "N/A", "N/A", test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_VolPropDamageCov(strGL_CHK_VolPropDamageCov),strGL_CHK_VolPropDamageCov,test);
			//se.element().clearTheField(getGeneral_Liability_TXT_VolPropDamageCovOccLimit(strGL_TXT_VolPropDamageCovOccLimit));
			//se.element().enterOrValidateText(getGeneral_Liability_TXT_VolPropDamageCovOccLimit(strGL_TXT_VolPropDamageCovOccLimit),strGL_TXT_VolPropDamageCovOccLimit,test);
			//se.element().clearTheField(getGeneral_Liability_TXT_VolPropDamageCovAggregateLimit(strGL_TXT_VolPropDamageCovAggregateLimit));
			se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_VolPropDamageCovOccLimit(strGL_TXT_VolPropDamageCovOccLimit), getGeneral_Liability_TXT_VolPropDamageCovOccLimitSearch(strGL_TXT_VolPropDamageCovOccLimit), strGL_TXT_VolPropDamageCovOccLimit, "N/A", strGL_TXT_VolPropDamageCovOccLimit,"N/A", "N/A", "N/A", test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_VolPropDamageCovAggregateLimit(strGL_TXT_VolPropDamageCovAggregateLimit),strGL_TXT_VolPropDamageCovAggregateLimit,test);
			se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_VolPropDamageCovDeductible(strGL_TXT_VolPropDamageCovDeductible), getGeneral_Liability_BTN_VolPropDamageCovDeductibleSearch(strGL_TXT_VolPropDamageCovDeductible), strGL_TXT_VolPropDamageCovDeductible, "N/A", strGL_TXT_VolPropDamageCovDeductible,"N/A", "N/A", "N/A", test);
			se.util().sleep(5000);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_VolPropDamage(strGL_CHK_VolPropDamage),strGL_CHK_VolPropDamage,test);
			se.util().sleep(5000);
			if(!strGL_TXT_VolPropDamage_OccurenceLimit.equalsIgnoreCase("N/A") && !strGL_TXT_VolPropDamage_OccurenceLimit.contains("validate2")){
                se.element().clearTheField(getGeneral_Liability_TXT_VolPropDamage_OccurenceLimit(strGL_TXT_VolPropDamage_OccurenceLimit));
            }
            //se.element().enterOrValidateText(getGeneral_Liability_TXT_VolPropDamage_OccurenceLimit(strGL_TXT_VolPropDamage_OccurenceLimit),strGL_TXT_VolPropDamage_OccurenceLimit,test);
            se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_VolPropDamage_OccurenceLimit(strGL_TXT_VolPropDamage_OccurenceLimit), getGeneral_Liability_TXT_VolPropDamage_OccurenceLimitSearch(strGL_TXT_VolPropDamage_OccurenceLimit), strGL_TXT_VolPropDamage_OccurenceLimit, "N/A", strGL_TXT_VolPropDamage_OccurenceLimit,"N/A", "N/A", "N/A", test);
            if(!strGL_TXT_VolPropDamage_AggregateLimit.equalsIgnoreCase("N/A") && !strGL_TXT_VolPropDamage_AggregateLimit.contains("validate2")){
                se.element().clearTheField(getGeneral_Liability_TXT_VolPropDamage_AggregateLimit(strGL_TXT_VolPropDamage_AggregateLimit));
            }
            se.element().enterOrValidateText(getGeneral_Liability_TXT_VolPropDamage_AggregateLimit(strGL_TXT_VolPropDamage_AggregateLimit),strGL_TXT_VolPropDamage_AggregateLimit,test);
            se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_VolPropDamageDeductible(strGL_TXT_VolPropDamage_Deductible), getGeneral_Liability_BTN_VolPropDamageDeductibleSearch(strGL_TXT_VolPropDamage_Deductible), strGL_TXT_VolPropDamage_Deductible, "N/A", strGL_TXT_VolPropDamage_Deductible,"N/A", "N/A", "N/A", test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_VolPropDamageCov(strGL_CHK_VolPropDamageCov),strGL_CHK_VolPropDamageCov,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_ModifiedPollutionExclusion(strGL_CHK_ModifiedPollutionExclusion),strGL_CHK_ModifiedPollutionExclusion,test);
			se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_ModifiedPollutionExclusion_Limits(strGL_TXT_ModifiedPollutionExclusion_Limits), getGeneral_Liability_TXT_ModifiedPollutionExclusion_LimitsSearch(strGL_TXT_ModifiedPollutionExclusion_Limits), strGL_TXT_ModifiedPollutionExclusion_Limits, "N/A", strGL_TXT_ModifiedPollutionExclusion_Limits,"N/A", "N/A", "N/A", test);
			se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_ModifiedPollutionExclusion_Deductible(strGL_TXT_ModifiedPollutionExclusion_Deductible), getGeneral_Liability_BTN_ModifiedPollutionExclusion_DeductibleSearch(strGL_TXT_ModifiedPollutionExclusion_Deductible), strGL_TXT_ModifiedPollutionExclusion_Deductible, "N/A", strGL_TXT_ModifiedPollutionExclusion_Deductible,"N/A", "N/A", "N/A", test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_ModifiedPollutionExclusion_Premium(strGL_TXT_ModifiedPollutionExclusion_Premium),strGL_TXT_ModifiedPollutionExclusion_Premium,test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_ModifiedPollutionExclusion_OverridePremium(strGL_TXT_ModifiedPollutionExclusion_OverridePremium),strGL_TXT_ModifiedPollutionExclusion_OverridePremium,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_ElectronicDataLiability(strGL_CHK_ElectronicDataLiability),strGL_CHK_ElectronicDataLiability,test);
			se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_ElectronicDataLiability_Limit(strGL_TXT_ElectronicDataLiability_Limit), getGeneral_Liability_BTN_ElectronicDataLiability_LimitSearch(strGL_TXT_ElectronicDataLiability_Limit), strGL_TXT_ElectronicDataLiability_Limit, "N/A", strGL_TXT_ElectronicDataLiability_Limit,"N/A", "N/A", "N/A", test);
			se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_ElectronicDataLiability_Deductible(strGL_TXT_ElectronicDataLiability_Deductible), getGeneral_Liability_BTN_ElectronicDataLiability_DeductibleSearch(strGL_TXT_ElectronicDataLiability_Deductible), strGL_TXT_ElectronicDataLiability_Deductible, "N/A", strGL_TXT_ElectronicDataLiability_Deductible,"N/A", "N/A", "N/A", test);
	
			//4/28  Added as part of cov matrix changes
			se.element().checkUncheckOrValidate(getGL_CHK_ConstructionLimitation(strGL_CHK_ConstructionLimitation),strGL_CHK_ConstructionLimitation,test);
			se.element().checkUncheckOrValidate(getGL_CHK_ConstructionLimWithLimitedEarthMov(strGL_CHK_ConstructionLimWithLimitedEarthMov),strGL_CHK_ConstructionLimWithLimitedEarthMov,test);
			se.element().selectPopupWithMagnifier(getGL_TXT_ConstructionLimWithLimitedEarthMov_Limit(strGL_TXT_ConstructionLimWithLimitedEarthMov_Limit), getGL_TXT_ConstructionLimWithLimitedEarthMov_LimitSearch(strGL_TXT_ConstructionLimWithLimitedEarthMov_Limit), strGL_TXT_ConstructionLimWithLimitedEarthMov_Limit, "N/A", strGL_TXT_ConstructionLimWithLimitedEarthMov_Limit,"N/A", "N/A", "N/A", test);
			se.element().selectPopupWithMagnifier(getGL_TXT_ConstructionLimWithLimitedEarthMov_Deductible(strGL_TXT_ConstructionLimWithLimitedEarthMov_Deductible), getGL_TXT_ConstructionLimWithLimitedEarthMov_DeductibleSearch(strGL_TXT_ConstructionLimWithLimitedEarthMov_Deductible), strGL_TXT_ConstructionLimWithLimitedEarthMov_Deductible, "N/A", strGL_TXT_ConstructionLimWithLimitedEarthMov_Deductible,"N/A", "N/A", "N/A", test);
		
		
		}
		catch(Exception e) {
			se.verify().verifyEquals("Failed to fill in details for General Liability Wrap ", true, false,true, test);		
		}
	}


	public void ratingPlansSection(Map<String, String> row, ExtentTest test) throws IOException {
		String strGL_CHK_FISTA = (String) row.get("GL_CHK_FISTA");
		String strGL_CHK_ExperienceRating = (String) row.get("GL_CHK_ExperienceRating");
		String strGL_CHK_SECURAManuscript = (String) row.get("GL_CHK_SECURAManuscript");
		String strGL_TXT_TransitionFactor = (String) row.get("GL_TXT_TransitionFactor");
		String strGL_TXT_MiscellaneousFactor = (String) row.get("GL_TXT_MiscellaneousFactor");
		
		String strGL_TXT_MiscellaneousReasonFilterNeeded = (String) row.get("GL_TXT_MiscellaneousReasonFilterNeeded");
		String strGL_TXT_MiscellaneousReason = (String) row.get("GL_TXT_MiscellaneousReason");
		String transaction = (String) row.get("Transaction Name");
		try{
			se.log().logTestStep("Rating Plans Section");
			test.log(LogStatus.INFO, "Rating Plans section","Transaction Step : "+transaction + "<br>" +"Page : GeneralLiability Page");
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_FISTA(strGL_CHK_FISTA),strGL_CHK_FISTA,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_ExperienceRating(strGL_CHK_ExperienceRating),strGL_CHK_ExperienceRating,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_SECURAManuscript(strGL_CHK_SECURAManuscript),strGL_CHK_SECURAManuscript,test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_TransitionFactor(strGL_TXT_TransitionFactor),strGL_TXT_TransitionFactor,test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_MiscellaneousFactor(strGL_TXT_MiscellaneousFactor),strGL_TXT_MiscellaneousFactor,test);
			se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_MiscellaneousReason(strGL_TXT_MiscellaneousReason),getGeneral_Liability_TXT_MiscellaneousReasonSearch(strGL_TXT_MiscellaneousReason),strGL_TXT_MiscellaneousReason,strGL_TXT_MiscellaneousReasonFilterNeeded,strGL_TXT_MiscellaneousReason, constants.NA, constants.NA,constants.NA,test);

		}
		catch(Exception e) {
			se.verify().verifyEquals("Failed to fill in details for Rating Plans section ", true, false,true, test);		
		}
	}
	public void kyTaxInformation(Map<String, String> row, ExtentTest test) throws IOException {
		String strGL_CHK_DoNotApplyCityOrCountyTax = (String) row.get("GL_CHK_DoNotApplyCityOrCountyTax");
		String strGL_CHK_AllCityName = (String) row.get("GL_CHK_AllCityName");
		String strGL_TXT_City = (String) row.get("GL_TXT_City");
		String strGL_TXT_CityKYTax_PopUp = (String) row.get("GL_TXT_CityKYTax_PopUp");
		String strGL_TXT_CItyCode = (String) row.get("GL_TXT_CItyCode");
		String strGL_CHK_AllCoutyName = (String) row.get("GL_CHK_AllCoutyName");
		String strGL_TXT_County = (String) row.get("GL_TXT_County");
		String strGL_TXT_CountyCode = (String) row.get("GL_TXT_CountyCode");
		String strGL_TXT_TaxCode = (String) row.get("GL_TXT_TaxCode");
		String transaction = (String) row.get("Transaction Name");
		try{
			se.log().logTestStep("KY Tax Information");
			test.log(LogStatus.INFO, "KY Tax Information section","Transaction Step : "+transaction + "<br>" +"Page : GeneralLiability Page");
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_DoNotApplyCityOrCountyTax(strGL_CHK_DoNotApplyCityOrCountyTax),strGL_CHK_DoNotApplyCityOrCountyTax,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_AllCityName(strGL_CHK_AllCityName),strGL_CHK_AllCityName,test);
			se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_City(strGL_TXT_City), getGeneral_Liability_TXT_CitySearch(strGL_TXT_City), strGL_TXT_City, strGL_TXT_CityKYTax_PopUp, strGL_TXT_City,"N/A", "N/A", "N/A", test);
			if(se.element().isElementPresent(common_BTN_PopupClose)){
				se.element().Click(getCommon_LNK_PopupOption(strGL_TXT_City), test);
			}
			//se.element().enterOrValidateText(getGeneral_Liability_TXT_CityKYTax_PopUp(strGL_TXT_CityKYTax_PopUp),strGL_TXT_CityKYTax_PopUp,test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_CItyCode(strGL_TXT_CItyCode),strGL_TXT_CItyCode,test);
			se.element().checkUncheckOrValidate(getGeneral_Liability_CHK_AllCoutyName(strGL_CHK_AllCoutyName),strGL_CHK_AllCoutyName,test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_County(strGL_TXT_County),strGL_TXT_County,test);
			se.element().selectPopupWithMagnifier(getGeneral_Liability_TXT_County(strGL_TXT_County), getGeneral_Liability_TXT_CountySearch(strGL_TXT_County), strGL_TXT_County, "N/A", strGL_TXT_County,"N/A", "N/A", "N/A", test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_CountyCode(strGL_TXT_CountyCode),strGL_TXT_CountyCode,test);
			se.element().enterOrValidateText(getGeneral_Liability_TXT_TaxCode(strGL_TXT_TaxCode),strGL_TXT_TaxCode,test);
		}
		catch(Exception e) {
			se.verify().verifyEquals("Failed to fill in details for KY Tax Information", true, false,true, test);		
		}
	}
}
